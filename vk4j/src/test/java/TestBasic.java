import tech.icey.glfwmini.LibGLFW;
import tech.icey.panama.Loader;
import tech.icey.vk4j.Version;
import tech.icey.panama.buffer.ByteBuffer;
import tech.icey.panama.buffer.IntBuffer;
import tech.icey.vk4j.VulkanLoader;
import tech.icey.vk4j.datatype.VkApplicationInfo;
import tech.icey.vk4j.datatype.VkInstanceCreateInfo;
import tech.icey.vk4j.datatype.VkPhysicalDeviceProperties;
import tech.icey.vk4j.enumtype.VkResult;
import tech.icey.vk4j.handle.VkInstance;
import tech.icey.vk4j.handle.VkPhysicalDevice;

import java.lang.foreign.Arena;

public class TestBasic {
    public static void main(String[] args) {
        VulkanLoader.loadVulkanLibrary();
        LibGLFW.loadGLFWLibrary();

        var libGLFW = LibGLFW.loadGLFW();
        var staticCommands = VulkanLoader.loadStaticCommands();
        var entryCommands = VulkanLoader.loadEntryCommands();

        if (libGLFW.glfwInit() == 0) {
            System.err.println("Failed to initialize GLFW");
            return;
        }

        if (libGLFW.glfwVulkanSupported() == 0) {
            System.err.println("Vulkan is not supported by GLFW");
            return;
        }

        try (var arena = Arena.ofConfined()) {
            var pExtensionCount = IntBuffer.allocate(arena);
            var ppExtensions = libGLFW.glfwGetRequiredInstanceExtensions(pExtensionCount);
            if (ppExtensions == null) {
                System.err.println("Failed to get required instance extensions");
                return;
            }

            System.out.println("Required instance extensions: " + pExtensionCount.read());
            for (int i = 0; i < pExtensionCount.read(); i++) {
                var extension = new ByteBuffer(ppExtensions.read(i));
                System.out.println("  - " + extension.readString());
            }

            var applicationInfo = VkApplicationInfo.allocate(arena);
            applicationInfo.pApplicationName(ByteBuffer.allocateString(arena, "Hello, Vulkan!"));
            applicationInfo.applicationVersion(1);
            applicationInfo.pEngineName(ByteBuffer.allocateString(arena, "vk4j"));
            applicationInfo.engineVersion(1);
            applicationInfo.apiVersion(Version.VK_API_VERSION_1_3);

            var instanceCreateInfo = VkInstanceCreateInfo.allocate(arena);
            instanceCreateInfo.pApplicationInfo(applicationInfo);
            instanceCreateInfo.enabledExtensionCount(pExtensionCount.read());
            instanceCreateInfo.ppEnabledExtensionNames(ppExtensions);

            var pInstance = VkInstance.Buffer.allocate(arena);
            int result = entryCommands.vkCreateInstance(instanceCreateInfo, null, pInstance);
            if (result != VkResult.VK_SUCCESS) {
                System.err.println("Failed to create instance: " + result);
                return;
            }

            var instance = pInstance.read();
            var instanceCommands = VulkanLoader.loadInstanceCommands(instance, staticCommands);

            IntBuffer pPhysicalDeviceCount = IntBuffer.allocate(arena);
            pPhysicalDeviceCount.write(8);
            var pPhysicalDevices = VkPhysicalDevice.Buffer.allocate(arena, 8);
            result = instanceCommands.vkEnumeratePhysicalDevices(instance, pPhysicalDeviceCount, pPhysicalDevices);
            if (result != VkResult.VK_SUCCESS && result != VkResult.VK_INCOMPLETE) {
                System.err.println("Failed to enumerate physical devices: " + result);
                return;
            }

            int physicalDeviceCount = pPhysicalDeviceCount.read();
            System.out.println("Physical device count: " + physicalDeviceCount);

            var properties = VkPhysicalDeviceProperties.allocate(arena);
            for (int i = 0; i < physicalDeviceCount; i++) {
                var physicalDevice = pPhysicalDevices.read(i);
                instanceCommands.vkGetPhysicalDeviceProperties(physicalDevice, properties);

                var deviceName = properties.deviceNameRaw().getString(0);
                System.out.println("Device name: " + deviceName);

                var apiVersion = properties.apiVersion();
                System.out.println("API version: " + Version.decode(apiVersion));
            }
        }
    }
}
