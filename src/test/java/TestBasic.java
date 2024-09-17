import tech.icey.glfwmini.LibGLFW;
import tech.icey.vk4j.Create;
import tech.icey.vk4j.Loader;
import tech.icey.vk4j.Version;
import tech.icey.vk4j.array.ByteArray;
import tech.icey.vk4j.command.EntryCommands;
import tech.icey.vk4j.command.InstanceCommands;
import tech.icey.vk4j.command.StaticCommands;
import tech.icey.vk4j.datatype.VkApplicationInfo;
import tech.icey.vk4j.datatype.VkInstanceCreateInfo;
import tech.icey.vk4j.datatype.VkPhysicalDeviceProperties;
import tech.icey.vk4j.enumtype.VkResult;
import tech.icey.vk4j.handle.VkInstance;
import tech.icey.vk4j.handle.VkPhysicalDevice;
import tech.icey.vk4j.ptr.BytePtr;
import tech.icey.vk4j.ptr.IntPtr;

import java.lang.foreign.Arena;
import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;

public class TestBasic {
    static {
        System.loadLibrary("vulkan");
        System.loadLibrary("glfw");
    }

    public static void main(String[] args) {
        var libGLFW = new LibGLFW(Loader::loadFunction);

        var staticCommands = new StaticCommands(Loader::loadFunctionOrNull);
        var entryCommands = new EntryCommands(Loader::loadFunctionOrNull);

        if (libGLFW.glfwInit() == 0) {
            System.err.println("Failed to initialize GLFW");
            return;
        }

        if (libGLFW.glfwVulkanSupported() == 0) {
            System.err.println("Vulkan is not supported by GLFW");
            return;
        }

        try (Arena arena = Arena.ofConfined()) {
            var pExtensionCount = IntPtr.allocate(arena);
            var ppExtensions = libGLFW.glfwGetRequiredInstanceExtensions(pExtensionCount);
            if (ppExtensions.address() == 0) {
                System.err.println("Failed to get required instance extensions");
                return;
            }

            ppExtensions = ppExtensions.reinterpret(ValueLayout.ADDRESS.byteSize() * pExtensionCount.read());
            System.out.println("Required instance extensions: " + pExtensionCount.read());
            for (int i = 0; i < pExtensionCount.read(); i++) {
                var extension = ppExtensions.get(ValueLayout.ADDRESS, i * ValueLayout.ADDRESS.byteSize()).reinterpret(Long.MAX_VALUE);
                System.out.println("  - " + extension.getString(0));
            }

            var applicationInfo = Create.create(VkApplicationInfo.FACTORY, arena);
            applicationInfo.pApplicationName(ByteArray.allocateUtf8(arena, "Hello, Vulkan!"));
            applicationInfo.applicationVersion(1);
            applicationInfo.pEngineName(ByteArray.allocateUtf8(arena, "vk4j"));
            applicationInfo.engineVersion(1);
            applicationInfo.apiVersion(Version.VK_API_VERSION_1_3);

            var instanceCreateInfo = Create.create(VkInstanceCreateInfo.FACTORY, arena);
            instanceCreateInfo.pApplicationInfo(applicationInfo);
            instanceCreateInfo.enabledExtensionCount(pExtensionCount.read());
            instanceCreateInfo.ppEnabledExtensionNames(ppExtensions);

            var instance = Create.create(VkInstance.FACTORY, arena);
            int result = entryCommands.vkCreateInstance(instanceCreateInfo, null, instance);
            if (result != VkResult.VK_SUCCESS) {
                System.err.println("Failed to create instance: " + result);
                return;
            }

            var instanceCommands = new InstanceCommands((String functionName, FunctionDescriptor descriptor) -> {
                MemorySegment functionNameSegment = arena.allocateFrom(functionName);
                MemorySegment fnptrSegment = staticCommands.vkGetInstanceProcAddr(instance, new BytePtr(functionNameSegment));
                if (fnptrSegment.address() == 0) {
                    return null;
                }
                return Loader.nativeLinker.downcallHandle(fnptrSegment, descriptor);
            });

            IntPtr pPhysicalDeviceCount = IntPtr.allocate(arena);
            pPhysicalDeviceCount.write(8);
            var physicalDevices = Create.createArray(VkPhysicalDevice.FACTORY, arena, 8).first;
            result = instanceCommands.vkEnumeratePhysicalDevices(instance, pPhysicalDeviceCount, physicalDevices[0]);
            if (result != VkResult.VK_SUCCESS && result != VkResult.VK_INCOMPLETE) {
                System.err.println("Failed to enumerate physical devices: " + result);
                return;
            }

            int physicalDeviceCount = pPhysicalDeviceCount.read();
            System.out.println("Physical device count: " + physicalDeviceCount);

            var properties = Create.create(VkPhysicalDeviceProperties.FACTORY, arena);
            for (int i = 0; i < physicalDeviceCount; i++) {
                var physicalDevice = physicalDevices[i];
                instanceCommands.vkGetPhysicalDeviceProperties(physicalDevice, properties);

                var deviceName = properties.deviceNameRaw().getString(0);
                System.out.println("Device name: " + deviceName);

                var apiVersion = properties.apiVersion();
                System.out.println("API version: " + apiVersion);
            }
        }
    }
}
