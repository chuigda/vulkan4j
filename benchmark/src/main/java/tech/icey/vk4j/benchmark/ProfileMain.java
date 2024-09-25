package tech.icey.vk4j.benchmark;

import org.lwjgl.system.MemoryStack;
import tech.icey.vk4j.Create;
import tech.icey.vk4j.handle.VkPhysicalDevice;
import tech.icey.vk4j.ptr.IntPtr;

import java.lang.foreign.Arena;

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
        for (int i = 0; i < 40960; i++) {
            try (Arena arena = Arena.ofConfined()) {
                var pPhysicalDeviceCount = IntPtr.allocate(arena);
                VK4JStatic.instanceCommands.vkEnumeratePhysicalDevices(VK4JStatic.instance, pPhysicalDeviceCount, null);
                var physicalDeviceCount = pPhysicalDeviceCount.read();

                var pPhysicalDevices = Create.createArray(VkPhysicalDevice.FACTORY, arena, physicalDeviceCount).first;
                VK4JStatic.instanceCommands.vkEnumeratePhysicalDevices(VK4JStatic.instance, pPhysicalDeviceCount, pPhysicalDevices[0]);

                for (var device : pPhysicalDevices) {
                    device.handle();
                }
            }
        }
    }

    private static void lwjglMain() {
        for (int i = 0; i < 40960; i++) {
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

                for (var device : physicalDevice) {
                    device.address();
                }
            }
        }
    }
}
