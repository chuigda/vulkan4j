package tech.icey.vk4j.benchmark;

import org.lwjgl.system.MemoryStack;
import tech.icey.vk4j.Create;
import tech.icey.vk4j.datatype.VkExtensionProperties;
import tech.icey.vk4j.handle.VkPhysicalDevice;
import tech.icey.vk4j.ptr.IntPtr;

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
                var pPhysicalDeviceCount = IntPtr.allocate(arena);
                VK4JStatic.instanceCommands.vkEnumeratePhysicalDevices(VK4JStatic.instance, pPhysicalDeviceCount, null);
                var physicalDeviceCount = pPhysicalDeviceCount.read();

                var pPhysicalDevices = Create.createArray(VkPhysicalDevice.FACTORY, arena, physicalDeviceCount).first;
                VK4JStatic.instanceCommands.vkEnumeratePhysicalDevices(VK4JStatic.instance, pPhysicalDeviceCount, pPhysicalDevices[0]);

                var pExtensionCount = IntPtr.allocate(arena);
                VK4JStatic.instanceCommands.vkEnumerateDeviceExtensionProperties(pPhysicalDevices[0], null, pExtensionCount, null);
                var extensionCount = pExtensionCount.read();

                var pExtensionProperties = Create.createArray(VkExtensionProperties.FACTORY, arena, extensionCount).first;
                VK4JStatic.instanceCommands.vkEnumerateDeviceExtensionProperties(pPhysicalDevices[0], null, pExtensionCount, pExtensionProperties[0]);
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

                org.lwjgl.vulkan.VkPhysicalDevice[] physicalDevice = new org.lwjgl.vulkan.VkPhysicalDevice[physicalDeviceCount];
                for (int j = 0; j < physicalDeviceCount; j++) {
                    physicalDevice[j] = new org.lwjgl.vulkan.VkPhysicalDevice(pPhysicalDevices.get(j), LWJGLStatic.instance);
                }

                var pExtensionCount = memoryStack.mallocInt(1);
                org.lwjgl.vulkan.VK10.vkEnumerateDeviceExtensionProperties(physicalDevice[0], (ByteBuffer) null, pExtensionCount, null);
                var extensionCount = pExtensionCount.get(0);

                var pExtensionProperties = org.lwjgl.vulkan.VkExtensionProperties.calloc(extensionCount);
                org.lwjgl.vulkan.VK10.vkEnumerateDeviceExtensionProperties(physicalDevice[0], (ByteBuffer) null, pExtensionCount, pExtensionProperties);
                for (int j = 0; j < extensionCount; j++) {
                    var extensionProperties = pExtensionProperties.get(j);
                    extensionProperties.extensionName();
                    extensionProperties.specVersion();
                }
            }
        }
    }
}
