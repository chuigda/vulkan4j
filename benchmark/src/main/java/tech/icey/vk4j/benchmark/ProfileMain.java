package tech.icey.vk4j.benchmark;

import org.lwjgl.system.MemoryStack;
import tech.icey.vk4j.buffer.IntBuffer;
import tech.icey.vk4j.datatype.VkExtensionProperties;
import tech.icey.vk4j.handle.VkPhysicalDevice;

import java.lang.foreign.Arena;
import java.nio.ByteBuffer;

public class ProfileMain {
    static {
        try {
            if (System.getProperty("os.name").toLowerCase().contains("windows")) {
                System.loadLibrary("vulkan-1");
            }
            else {
                System.loadLibrary("vulkan");
            }
        }
        catch (Throwable throwable) {
            throw new RuntimeException("加载 Vulkan 库失败: " + throwable.getMessage());
        }
    }

    public static void main(String[] args) {
        vk4jMain();
        lwjglMain();
    }

    private static void vk4jMain() {
        for (int i = 0; i < 4096; i++) {
            try (Arena arena = Arena.ofConfined()) {
                var pPhysicalDeviceCount = IntBuffer.allocate(arena);
                VK4JStatic.instanceCommands.vkEnumeratePhysicalDevices(VK4JStatic.instance, pPhysicalDeviceCount, null);
                var physicalDeviceCount = pPhysicalDeviceCount.read();

                var pPhysicalDevices = VkPhysicalDevice.Buffer.allocate(arena, physicalDeviceCount);
                VK4JStatic.instanceCommands.vkEnumeratePhysicalDevices(VK4JStatic.instance, pPhysicalDeviceCount, pPhysicalDevices);
                var physicalDevices = pPhysicalDevices.readAll();

                var pExtensionCount = IntBuffer.allocate(arena);
                VK4JStatic.instanceCommands.vkEnumerateDeviceExtensionProperties(physicalDevices[0], null, pExtensionCount, null);
                var extensionCount = pExtensionCount.read();

                var pExtensionProperties = VkExtensionProperties.allocate(arena, extensionCount);
                VK4JStatic.instanceCommands.vkEnumerateDeviceExtensionProperties(physicalDevices[0], null, pExtensionCount, pExtensionProperties[0]);
                for (var extension : pExtensionProperties) {
                    extension.extensionName();
                    extension.specVersion();
                }
            }
        }
    }

    private static void lwjglMain() {
        for (int i = 0; i < 4096; i++) {
            try (MemoryStack memoryStack = MemoryStack.stackPush()) {
                var pPhysicalDeviceCount = memoryStack.mallocInt(1);
                org.lwjgl.vulkan.VK10.vkEnumeratePhysicalDevices(LWJGLStatic.instance, pPhysicalDeviceCount, null);
                var physicalDeviceCount = pPhysicalDeviceCount.get(0);

                var pPhysicalDevices = memoryStack.mallocPointer(physicalDeviceCount);
                org.lwjgl.vulkan.VK10.vkEnumeratePhysicalDevices(LWJGLStatic.instance, pPhysicalDeviceCount, pPhysicalDevices);

                org.lwjgl.vulkan.VkPhysicalDevice[] physicalDevices = new org.lwjgl.vulkan.VkPhysicalDevice[physicalDeviceCount];
                for (int j = 0; j < physicalDeviceCount; j++) {
                    physicalDevices[j] = new org.lwjgl.vulkan.VkPhysicalDevice(pPhysicalDevices.get(j), LWJGLStatic.instance);
                }

                var pExtensionCount = memoryStack.mallocInt(1);
                org.lwjgl.vulkan.VK10.vkEnumerateDeviceExtensionProperties(physicalDevices[0], (ByteBuffer) null, pExtensionCount, null);
                var extensionCount = pExtensionCount.get(0);

                var pExtensionProperties = org.lwjgl.vulkan.VkExtensionProperties.calloc(extensionCount);
                org.lwjgl.vulkan.VK10.vkEnumerateDeviceExtensionProperties(physicalDevices[0], (ByteBuffer) null, pExtensionCount, pExtensionProperties);
                for (int j = 0; j < extensionCount; j++) {
                    var extensionProperties = pExtensionProperties.get(j);
                    extensionProperties.extensionName();
                    extensionProperties.specVersion();
                }
            }
        }
    }
}
