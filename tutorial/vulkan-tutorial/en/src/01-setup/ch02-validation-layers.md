# Validation layers

> [Java code](https://github.com/chuigda/vulkan4j/tree/master/packages/tutorial/src/main/java/tutorial/vulkan/part01/ch02/Main.java) | [C++ version](https://vulkan-tutorial.com/Drawing_a_triangle/Setup/Validation_layers)

## What are validation layers?

The Vulkan API is designed around the idea of minimal driver overhead and one of the manifestations of that goal is that there is very limited error checking in the API by default. Even mistakes as simple as setting enumerations to incorrect values or passing null pointers to required parameters are generally not explicitly handled and will simply result in crashes or undefined behavior. Because Vulkan requires you to be very explicit about everything you're doing, it's easy to make many small mistakes like using a new GPU feature and forgetting to request it at logical device creation time.

However, that doesn't mean that these checks can't be added to the API. Vulkan introduces an elegant system for this known as *validation layers*. Validation layers are optional components that hook into Vulkan function calls to apply additional operations. Common operations in validation layers are:

- Checking the values of parameters against the specification to detect misuse
- Tracking creation and destruction of objects to find resource leaks
- Checking thread safety by tracking the threads that calls originate from
- Logging every call and its parameters to the standard output
- Tracing Vulkan calls for profiling and replaying

Here's an example of what the implementation of a function in a diagnostics validation layer could look like:

```c
VkResult vkCreateInstance(
    const VkInstanceCreateInfo* pCreateInfo,
    const VkAllocationCallbacks* pAllocator,
    VkInstance* instance
) {
    if (pCreateInfo == NULL || instance == NULL) {
        log("Null pointer passed to required parameter!");
        return VK_ERROR_INITIALIZATION_FAILED;
    }

    return real_vkCreateInstance(pCreateInfo, pAllocator, instance);
}
```

These validation layers can be freely stacked to include all the debugging functionality that you're interested in. You can simply enable validation layers for debug builds and completely disable them for release builds, which gives you the best of both worlds!

Vulkan does not come with any validation layers built-in, but the LunarG Vulkan SDK provides a nice set of layers that check for common errors. They're also completely [open source](https://github.com/KhronosGroup/Vulkan-ValidationLayers), so you can check which kind of mistakes they check for and contribute. Using the validation layers is the best way to avoid your application breaking on different drivers by accidentally relying on undefined behavior.

Validation layers can only be used if they have been installed onto the system. For example, the LunarG validation layers are only available on PCs with the Vulkan SDK installed.

There were formerly two different types of validation layers in Vulkan: instance and device specific. The idea was that instance layers would only check calls related to global Vulkan objects like instances, and device specific layers would only check calls related to a specific GPU. Device specific layers have now been deprecated, which means that instance validation layers apply to all Vulkan calls. The specification document still recommends that you enable validation layers at device level as well for compatibility, which is required by some implementations. We'll simply specify the same layers as the instance at logical device level, which we'll see [later on](./ch04-logical-device-and-queues).

## Using validation layers

In this section we'll see how to enable the standard diagnostics layers provided by the Vulkan SDK. Just like extensions, validation layers need to be enabled by specifying their name. All the useful standard validation is bundled into a layer included in the SDK that is known as `VK_LAYER_KHRONOS_validation`.

Let's first add a configuration variable to specify whether to enable validation layers or not. I've chosen to base the value on a JVM option. Add the following field to the `Application` class:

```java
private static final boolean ENABLE_VALIDATION_LAYERS = System.getProperty("validation") != null;
```

Validation layers will be enabled if the JVM option `validation` is set. If you're using an IDE, you can add this option in the run configuration.

Then let's also make validation layer name a named constant:

```java
private static final String VALIDATION_LAYER_NAME = "VK_LAYER_KHRONOS_validation";
```

We'll add a new function `checkValidationLayerSupport` that checks if the validation layer we want to use is available. First list all the available layers using the `enumerateInstanceLayerProperties` function.

```java
private boolean checkValidationLayerSupport() {
    try (var arena = Arena.ofConfined()) {
        var pLayerCount = IntPtr.allocate(arena);
        var result = entryCommands.enumerateInstanceLayerProperties(pLayerCount, null);
        if (result != VkResult.SUCCESS) {
            throw new RuntimeException("Failed to enumerate instance layer properties, vulkan error code: " + VkResult.explain(result));
        }

        var layerCount = pLayerCount.read();
        var availableLayers = VkLayerProperties.allocate(arena, layerCount);
        result = entryCommands.enumerateInstanceLayerProperties(pLayerCount, availableLayers);
        if (result != VkResult.SUCCESS) {
            throw new RuntimeException("Failed to enumerate instance layer properties, vulkan error code: " + VkResult.explain(result));
        }

        return false;
    }
}
```

Next, check if our desired layer name exists in the list of available layers:

```java
// ...

for (var layer : availableLayers) {
    if (VALIDATION_LAYER_NAME.equals(layer.layerName().readString())) {
        return true;
    }
}

return false;
```

We can now use this function in `createInstance`:

```java
if (ENABLE_VALIDATION_LAYERS && !checkValidationLayerSupport()) {
    throw new RuntimeException("Validation layers requested, but not available!");
}

// ...
```

Now run the program in debug mode and ensure that the error does not occur. If it does, then have a look at the FAQ.

Finally, modify the `VkInstanceCreateInfo` struct instantiation to include the validation layer names if they are enabled:

```java
if (ENABLE_VALIDATION_LAYERS) {
    instanceCreateInfo.enabledLayerCount(1)
        .ppEnabledLayerNames(PointerPtr.allocateV(arena, BytePtr.allocateString(arena, VALIDATION_LAYER_NAME)));
}
```

If the check was successful then `createInstance` should not ever return a `ERROR_LAYER_NOT_PRESENT` error, but you should run the program to make sure.

## Message callback

The validation layers will print debug messages to the standard output by default, but we can also handle them ourselves by providing an explicit callback in our program. This will also allow you to decide which kind of messages you would like to see, because not all are necessarily (fatal) errors. If you don't want to do that right now then you may skip to the last section in this chapter.

To set up a callback in the program to handle messages and the associated details, we have to set up a debug messenger with a callback using the `VK_EXT_debug_utils` extension.

We'll first create a `getRequiredExtensions` function that will return the required list of extensions based on whether validation layers are enabled or not:

```java
private PointerPtr getRequiredExtensions(Arena arena) {
    try (var localArena = Arena.ofConfined()) {
        var pGLFWExtensionCount = IntPtr.allocate(localArena);
        var glfwExtensions = glfw.getRequiredInstanceExtensions(pGLFWExtensionCount);
        if (glfwExtensions == null) {
            throw new RuntimeException("Failed to get GLFW required instance extensions");
        }

        var glfwExtensionCount = pGLFWExtensionCount.read();
        glfwExtensions = glfwExtensions.reinterpret(glfwExtensionCount);
        if (!ENABLE_VALIDATION_LAYERS) {
            return glfwExtensions;
        }
        else {
            var extensions = PointerPtr.allocate(arena, glfwExtensionCount + 1);
            for (int i = 0; i < glfwExtensionCount; i++) {
                extensions.write(i, glfwExtensions.read(i));
            }

            extensions.write(glfwExtensionCount, BytePtr.allocateString(arena, VkConstants.EXT_DEBUG_UTILS_EXTENSION_NAME));
            return extensions;
        }
    }
}
```

> Note: here we want the created `PointerPtr` to be valid after returning from the function, so we'll allocate it with a caller-provided `Arena`.

The extensions specified by GLFW are always required, but the debug messenger extension is conditionally added. Note that I've used the `VkConstants.EXT_DEBUG_UTILS_EXTENSION_NAME` constant here which is equal to the literal string `"VK_EXT_debug_utils"`. Using this named constant lets you avoid typos.

We can now use this function in `createInstance`:

```java
var extensions = getRequiredExtensions(arena);
instanceCreateInfo.enabledExtensionCount((int) extensions.size())
        .ppEnabledExtensionNames(extensions);
```

Run the program to make sure you don't receive a `ERROR_EXTENSION_NOT_PRESENT` error. We don't really need to check for the existence of this extension, because it should be implied by the availability of the validation layers.

Now let's see what a debug callback function looks like. Add a new static member function called `debugCallback` like such:

```java
private static @NativeType("VkBool32") @Unsigned int debugCallback(
        @EnumType(VkDebugUtilsMessageSeverityFlagsEXT.class) int ignoredMessageSeverity,
        @EnumType(VkDebugUtilsMessageTypeFlagsEXT.class) int ignoredMessageType,
        @Pointer(target=VkDebugUtilsMessengerCallbackDataEXT.class) MemorySegment pCallbackData,
        @Pointer(comment="void*") MemorySegment ignoredPUserData
) {
    var callbackData = new VkDebugUtilsMessengerCallbackDataEXT(pCallbackData.reinterpret(VkDebugUtilsMessengerCallbackDataEXT.BYTES));
    System.err.println("Validation layer: " + Objects.requireNonNull(callbackData.pMessage()).readString());
    return VkConstants.FALSE;
}
```

> Note1: since Vulkan will directly call our callback function, it is not possible to use wrapper types like `VkDebugUtilsMessengerCallbackDataEXT` class here. Instead, we have to use the `MemorySegment` type to accept the raw pointer and then wrap it in the `VkDebugUtilsMessengerCallbackDataEXT` class on ourselves. To convince that the `MemorySegment` is a pointer to the correct struct, we'll use the `reinterpret` method to cast it to the correct size, so JVM won't complain about buffer overflow in future accesses.

> Note2: the `@EnumType` annotations are completely optional, but useful indicating the expected type of the integer values. Also, this makes Ctrl-clicking navigation in IDEs work. `@NativeType` is also optional.

The first parameter specifies the severity of the message, which is one of the following flags:


- `VkDebugUtilsMessageSeverity.VERBOSE`: Diagnostic message
- `VkDebugUtilsMessageSeverity.INFO`: Informational message like the creation of a resource
- `VkDebugUtilsMessageSeverity.WARNING`: Message about behavior that is not necessarily an error, but very likely a bug in your application
- `VkDebugUtilsMessageSeverity.ERROR`: Message about behavior that is invalid and may cause crashes

The values of this enumeration are set up in such a way that you can use a comparison operation to check if a message is equal or worse compared to some level of severity, for example:

```java
if (messageSeverity >= VkDebugUtilsMessageSeverityFlagsEXT.WARNING) {
    // Message is important enough to show
}
```

The `messageType` parameter can have the following values:

- `VkDebugUtilsMessageType.GENERAL`: Some event has happened that is unrelated to the specification or performance
- `VkDebugUtilsMessageType.VALIDATION`: Something has happened that violates the specification or indicates a possible mistake
- `VkDebugUtilsMessageType.PERFORMANCE`: Potential non-optimal use of Vulkan

The `pCallbackData` parameter refers to a `VkDebugUtilsMessengerCallbackDataEXT` struct containing the details of the message itself, with the most important members being:

- `pMessage`: The debug message as a null-terminated string
- `pObjects`: Array of Vulkan object handles related to the message
- `objectCount`: Number of objects in array

Finally, the `pUserData` parameter contains a pointer that was specified during the setup of the callback and allows you to pass your own data to it.

The callback returns a boolean that indicates if the Vulkan call that triggered the validation layer message should be aborted. If the callback returns true, then the call is aborted with the `ERROR_VALIDATION_FAILED_EXT` error. This is normally only used to test the validation layers themselves, so you should always return `VkConstants.FALSE`.

### Creating an upcall stub

Now our `debugCallback` is a Java function. In order to make it a ready-to-use C function pointer, we need two extra steps. First, we need to retrieve the method handle to `debugCallback`:

```java
private static final MethodHandle HANDLE_debugCallback;
static {
    try {
        HANDLE_debugCallback = MethodHandles
                .lookup()
                .findStatic(
                        Application.class,
                        "debugCallback",
                        VkFunctionTypes.PFN_vkDebugUtilsMessengerCallbackEXT.toMethodType());
    } catch (Exception e) {
        throw new RuntimeException(e);
    }
}
```

The `VkFunctionTypes` class stores most of the useful function types (as `FunctionDescriptor`s) in Vulkan.

Then, we create an upcall-ready `MemorySegment` with `Linker`

```java
private static final MemorySegment UPCALL_debugCallback = Linker
        .nativeLinker()
        .upcallStub(
                HANDLE_debugCallback,
                VkFunctionTypes.PFN_vkDebugUtilsMessengerCallbackEXT,
                Arena.global());
```

<div style="color: gray; user-select: none">
I'm a cute end-of-section message, crawling cutely _(ÒωÓ๑ゝ∠)_
</div>

All that remains now is telling Vulkan about the callback function. Perhaps somewhat surprisingly, even the debug callback in Vulkan is managed with a handle that needs to be explicitly created and destroyed. Such a callback is part of a debug messenger, and you can have as many of them as you want. Add a class member for this handle right under `instance`:

```java
private VkDebugUtilsMessengerEXT debugMessenger;
```

Now add a function `setupDebugMessenger` to be called from `initVulkan` right after `createInstance`:

```java
private void initVulkan() {
    // ...
    
    createInstance();
    setupDebugMessenger();
}

private void setupDebugMessenger() {
    if (!ENABLE_VALIDATION_LAYERS) {
        return;
    }
}
```

We'll need to fill in a structure with details about the messenger and its callback:

```java
try (var arena = Arena.ofConfined()) {
    var debugUtilsMessengerCreateInfo = VkDebugUtilsMessengerCreateInfoEXT.allocate(arena);
    debugUtilsMessengerCreateInfo.messageSeverity(
            VkDebugUtilsMessageSeverityFlagsEXT.VERBOSE
            | VkDebugUtilsMessageSeverityFlagsEXT.WARNING
            | VkDebugUtilsMessageSeverityFlagsEXT.ERROR
    );
    debugUtilsMessengerCreateInfo.messageType(
            VkDebugUtilsMessageTypeFlagsEXT.GENERAL
            | VkDebugUtilsMessageTypeFlagsEXT.VALIDATION
            | VkDebugUtilsMessageTypeFlagsEXT.PERFORMANCE
    );
    debugUtilsMessengerCreateInfo.pfnUserCallback(UPCALL_debugCallback);
}
```

The `messageSeverity` field allows you to specify all the types of severities you would like your callback to be called for. I've specified all types except for `VK_DEBUG_UTILS_MESSAGE_SEVERITY_INFO` here to receive notifications about possible problems while leaving out verbose general debug info.

Similarly, the `messageType` field lets you filter which types of messages your callback is notified about. I've simply enabled all types here. You can always disable some if they're not useful to you.

Finally, the `pfnUserCallback` field specifies the pointer to the callback function. You can optionally pass a pointer to the `pUserData` field which will be passed along to the callback function via the `pUserData` parameter.

Note that there are many more ways to configure validation layer messages and debug callbacks, but this is a good setup to get started with for this tutorial. See the [extension specification](https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/chap50.html#VK_EXT_debug_utils) for more info about the possibilities.

This struct should be passed to the `createDebugUtilsMessengerEXT` function to create the `VkDebugUtilsMessengerEXT` object.

```java
var pDebugMessenger = VkDebugUtilsMessengerEXT.Ptr.allocate(arena);
var result = instanceCommands.createDebugUtilsMessengerEXT(
        instance,
        debugUtilsMessengerCreateInfo,
        null,
        pDebugMessenger
);
if (result != VkResult.SUCCESS) {
    throw new RuntimeException("Failed to set up debug messenger, vulkan error code: " + VkResult.explain(result));
}
debugMessenger = Objects.requireNonNull(pDebugMessenger.read());
```

The second to last parameter is again the optional allocator callback that we set to `null`, other than that the parameters are fairly straightforward. Since the debug messenger is specific to our Vulkan instance and its layers, it needs to be explicitly specified as first argument. You will also see this pattern with other child objects later on.

The `VkDebugUtilsMessengerEXT` object also needs to be cleaned up with a call to `InstanceCommands::destroyDebugUtilsMessengerEXT`.

```java
void cleanup() {
    if (ENABLE_VALIDATION_LAYERS) {
        instanceCommands.destroyDebugUtilsMessengerEXT(instance, debugMessenger, null);
    }

    // ...
}
```

## Debugging instance creation and destruction

Although we've now added debugging with validation layers to the program we're not covering everything quite yet. The `VkInstanceCommands::createDebugUtilsMessengerEXT` call requires a valid instance to have been created and `InstanceCommands::destroyDebugUtilsMessengerEXT` must be called before the instance is destroyed. This currently leaves us unable to debug any issues in the `EntryCommands::createInstance` and `InstanceCommands::destroyInstance` calls.

However, if you closely read the [extension documentation](https://github.com/KhronosGroup/Vulkan-Docs/blob/main/appendices/VK_EXT_debug_utils.adoc#examples), you'll see that there is a way to create a separate debug utils messenger specifically for those two function calls. It requires you to simply pass a pointer to a `VkDebugUtilsMessengerCreateInfoEXT` struct in the `pNext` extension field of `VkInstanceCreateInfo`. First extract population of the messenger create info into a separate function:

```java
private void setupDebugMessenger() {
    // ...

    var debugUtilsMessengerCreateInfo = VkDebugUtilsMessengerCreateInfoEXT.allocate(arena);
    populateDebugMessengerCreateInfo(debugUtilsMessengerCreateInfo);

    // ...
}

private static void populateDebugMessengerCreateInfo(VkDebugUtilsMessengerCreateInfoEXT debugUtilsMessengerCreateInfo) {
    debugUtilsMessengerCreateInfo.messageSeverity(
            VkDebugUtilsMessageSeverityFlagsEXT.VERBOSE
            | VkDebugUtilsMessageSeverityFlagsEXT.WARNING
            | VkDebugUtilsMessageSeverityFlagsEXT.ERROR
    );
    debugUtilsMessengerCreateInfo.messageType(
            VkDebugUtilsMessageTypeFlagsEXT.GENERAL
            | VkDebugUtilsMessageTypeFlagsEXT.VALIDATION
            | VkDebugUtilsMessageTypeFlagsEXT.PERFORMANCE
    );
    debugUtilsMessengerCreateInfo.pfnUserCallback(UPCALL_debugCallback);
}
```

We can now re-use this in the `createInstance` function:

```java
private void createInstance() {
    // ...
    if (ENABLE_VALIDATION_LAYERS) {
        // ...

        var debugCreateInfo = VkDebugUtilsMessengerCreateInfoEXT.allocate(arena);
        populateDebugMessengerCreateInfo(debugCreateInfo);
        instanceCreateInfo.pNext(debugCreateInfo);
    }
}
```

By creating an additional debug messenger this way it will automatically be used during `VkEntryCommands::createInstance` and `VkInstanceCommands::destroyInstance` and cleaned up after that.

## Testing

Now let's intentionally make a mistake to see the validation layers in action. Temporarily remove the call to `VkInstanceCommands::destroyDebugUtilsMessengerEXT` in the `cleanup` function and run your program. Once it exits you should see something like this:

```
Validation layer: vkDestroyInstance(): Object Tracking - For VkInstance 0x7097843c4420, VkDebugUtilsMessengerEXT 0x10000000001 has not been destroyed.
```

> If you don't see any messages then [check your installation](https://vulkan.lunarg.com/doc/view/1.2.131.1/windows/getting_started.html#user-content-verify-the-installation).

If you want to see which call triggered a message, you can add a breakpoint to the message callback and look at the stack trace.

## Configuration

There are a lot more settings for the behavior of validation layers than just the flags specified in the `VkDebugUtilsMessengerCreateInfoEXT` struct. Browse to the Vulkan SDK and go to the `Config` directory. There you will find a `vk_layer_settings.txt` file that explains how to configure the layers.

To configure the layer settings for your own application, copy the file to the working directory of your project and follow the instructions to set the desired behavior. However, for the remainder of this tutorial I'll assume that you're using the default settings.

Throughout this tutorial I'll be making a couple of intentional mistakes to show you how helpful the validation layers are with catching them and to teach you how important it is to know exactly what you're doing with Vulkan. Now it's time to look at [Vulkan devices in the system](ch03-physical-devices-and-queue-families.md).
