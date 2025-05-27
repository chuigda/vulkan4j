# Instance

## Loading Vulkan library

Before we can start using Vulkan, we need to load the Vulkan library and several fundamental Vulkan commands, just like what we did with GLFW. Add the following private fields to the `Application` class:

```java
private VkStaticCommands staticCommands;
private VkEntryCommands entryCommands;
```

Then load Vulkan library and initialize these two fields in the `initVulkan` function:

```java
void initVulkan() {
    VulkanLoader.loadVulkanLibrary();
    staticCommands = VulkanLoader.loadStaticCommands();
    entryCommands = VulkanLoader.loadEntryCommands(staticCommands);
}
```

## Creating an instance

The first step to use Vulkan is to create an instance. The instance is the connection between your application and the Vulkan library and creating it involves specifying some details about your application to the driver.

Start by adding a `createInstance` function and invoke it in the initVulkan Function.

```java
void initVulkan() {
    // ...
    createInstance();
}
```

Additionally add a data member to hold the handle to the instance:

```java
private VkInstance instance;
```

Now, to create an instance we'll first have to fill in a struct with some information about our application. This data is technically optional, but it may provide some useful information to the driver in order to optimize our specific application (e.g. because it uses a well-known graphics engine with certain special behavior). This struct is called `VkApplicationInfo`:

```java
private void createInstance() {
    try (var arena = Arena.ofConfined()) {
        var appInfo = VkApplicationInfo.allocate(arena);
        appInfo.pApplicationName(BytePtr.allocateString(arena, "Zdravstvuyte, Vulkan!"));
        appInfo.applicationVersion(new Version(0, 1, 0, 0).encode());
        appInfo.pEngineName(BytePtr.allocateString(arena, "Soloviev D-30"));
        appInfo.engineVersion(new Version(0, 1, 0, 0).encode());
        appInfo.apiVersion(Version.VK_API_VERSION_1_0.encode());
    }
}
```

> If you're not familiar with the `try` block syntax, it's a feature of Java 9 called "try-with-resources". It's used to automatically close resources that implement the `AutoCloseable` interface. In this case, the `Arena` object is a resource that will be automatically closed when the block is exited.

Vulkan C API requires you to explicitly specify the type in the `sType` member. However, `vulkan4j` has already taken care of this for you. The `VkApplicationInfo.allocate` method will fill in the `sType` field after allocating the struct. What's more, `Arena.ofConfined()` creates an arena whose `allocate` method will automatically fill allocated memory with zeros, so we don't need to zero-initialize the rest of the struct fields one by one.

A lot of information in Vulkan is passed through structs instead of function parameters, and we'll have to fill in one more struct to provide sufficient information for creating an instance. This next struct is not optional and tells the Vulkan driver which global extensions and validation layers we want to use. Global here means that they apply to the entire program and not a specific device, which will become clear in the next few chapters.

```java
var instanceCreateInfo = VkInstanceCreateInfo.allocate(arena);
instanceCreateInfo.pApplicationInfo(appInfo);
```

The first field `pApplicationInfo` is straightforward. The next two fields specify the desired global extensions. As mentioned in the overview chapter, Vulkan is a platform-agnostic API, which means that you need an extension to interface with the window system. GLFW has a handy built-in function that returns the extension(s) it needs to do that which we can pass to the struct:

```java
var pGLFWExtensionCount = IntPtr.allocate(arena);
var glfwExtensions = glfw.getRequiredInstanceExtensions(pGLFWExtensionCount);
if (glfwExtensions == null) {
    throw new RuntimeException("Failed to get GLFW required instance extensions");
}

var glfwExtensionCount = pGLFWExtensionCount.read();
glfwExtensions = glfwExtensions.reinterpret(glfwExtensionCount);
instanceCreateInfo.enabledExtensionCount(glfwExtensionCount);
instanceCreateInfo.ppEnabledExtensionNames(glfwExtensions);
```

> Note: here we call `reinterpret` on the `glfwExtensions` to mark its size as `glfwExtensionCount`. We need to do this on ourselves because the auto-generated bindings don't know how to correctly set the size of the buffer when it's returned from a function. For now this step is not necessary yet, because `createInstance` doesn't need the size information of our `PointerPtr` -- it acquires the size from the `VkInstanceCreateInfo::enabledExtensionCount` field instead. However, in the following chapters we'll read `glfwExtensions` from Java code, and we'll need correct size information. 

```java
instanceCreateInfo.enabledLayerCount(0);
```

We've now specified everything Vulkan needs to create an instance, and we can finally issue the `VkEntryCommands::createInstance` call:

```java
var pInstance = VkInstance.Ptr.allocate(arena);
var result = entryCommands.createInstance(instanceCreateInfo, null, pInstance);
if (result != VkResult.SUCCESS) {
    throw new RuntimeException("Failed to create instance, vulkan error code: " + VkResult.explain(result));
}
instance = Objects.requireNonNull(pInstance.read());
```

As you'll see, the general pattern that object creation function parameters in Vulkan follow is:

- Pointer to struct with creation info
- Pointer to custom allocator callbacks, always `null` in this tutorial
- Pointer to the variable that stores the handle to the new object

If everything went well then the handle to the instance was stored in the `VkInstance` class member. Nearly all Vulkan functions return a value of type `VkResult` that is either `VkResult.SUCCESS` or an error code.

## Loading instance level Vulkan commands

After creating the instance, we can load the instance level Vulkan commands. Add a new field to the `Application` class:

```java
private VkInstanceCommands instanceCommands;
```

Then load the instance level commands in the `initVulkan` function:

```java
instanceCommands = VulkanLoader.loadInstanceCommands(instance, staticCommands);
```

## Checking for extension support

If you look at the `vkCreateInstance` documentation then you'll see that one of the possible error codes is `ERROR_EXTENSION_NOT_PRESENT`. We could simply specify the extensions we require and terminate if that error code comes back. That makes sense for essential extensions like the window system interface, but what if we want to check for optional functionality?

To retrieve a list of supported extensions before creating an instance, there's the `VkEntryCommands::enumerateInstanceExtensionProperties` function. It takes a pointer to a variable that stores the number of extensions and an array of `extensionProperties` to store details of the extensions. It also takes an optional first parameter that allows us to filter extensions by a specific validation layer, which we'll ignore for now.

To allocate an array to hold the extension details we first need to know how many there are. You can request just the number of extensions by leaving the latter parameter empty:

```java
IntPtr pExtensionCount = IntPtr.allocate(arena);
var result = entryCommands.enumerateInstanceExtensionProperties(null, pExtensionCount, null);
if (result != VkResult.SUCCESS) {
    throw new RuntimeException("Failed to enumerate instance extension properties, vulkan error code: " + VkResult.explain(result));
}
var extensionCount = pExtensionCount.read();
```

Now allocate an array to hold the extension details:

```java
var extensions = VkExtensionProperties.allocate(arena, extensionCount);
result = entryCommands.enumerateInstanceExtensionProperties(null, pExtensionCount, extensions);
if (result != VkResult.SUCCESS) {
    throw new RuntimeException("Failed to enumerate instance extension properties, vulkan error code: " + VkResult.explain(result));
}
```

Each `VkExtensionProperties` struct contains the name and version of an extension. We can list them with a simple for loop (\t is a tab for indentation):

```java
for (var extension : extensions) {
    System.out.println("\t" + extension.extensionName().readString());
}
```

You can add this code to the `VkEntryCommands::createInstance` function if you'd like to provide some details about the Vulkan support. As a challenge, try to create a function that checks if all the extensions returned by `getRequiredInstanceExtensions` are included in the supported extensions list.

## Cleaning up

The `VkInstance` should be only destroyed right before the program exits. It can be destroyed in cleanup with the `VkInstanceCommands::destroyInstance` function:

```java
void cleanup() {
    instanceCommands.destroyInstance(instance, null);
    // ...
}
```

The parameters for the `VkInstanceCommands::destroyInstance` function are straightforward. As mentioned in the previous chapter, the allocation and deallocation functions in Vulkan have an optional allocator callback that we'll ignore by passing `null` to it. All the other Vulkan resources that we'll create in the following chapters should be cleaned up before the instance is destroyed.

Before continuing with the more complex steps after instance creation, it's time to evaluate our debugging options by checking out [validation layers](ch02-validation-layers.md).
