package tech.icey.vk4j.benchmark;

import org.lwjgl.system.MemoryStack;
import org.openjdk.jmh.Main;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.Fork;
import tech.icey.vk4j.Create;
import tech.icey.vk4j.handle.VkPhysicalDevice;
import tech.icey.vk4j.ptr.IntPtr;

import java.lang.foreign.Arena;

public class BenchMain {
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
        try {
            Main.main(args);
        } catch (Exception e) {
            e.printStackTrace(System.err);
        }
    }

    @Benchmark
    @Fork(value = 1, warmups = 1)
    public void benchVK4J() {
        try (Arena arena = Arena.ofConfined()) {
            var pPhysicalDeviceCount = IntPtr.allocate(arena);
            VK4JStatic.instanceCommands.vkEnumeratePhysicalDevices(VK4JStatic.instance, pPhysicalDeviceCount, null);
            var physicalDeviceCount = pPhysicalDeviceCount.read();

            var pPhysicalDevices = Create.createArray(VkPhysicalDevice.FACTORY, arena, physicalDeviceCount).first;
            VK4JStatic.instanceCommands.vkEnumeratePhysicalDevices(VK4JStatic.instance, pPhysicalDeviceCount, pPhysicalDevices[0]);
        }
    }

    @Benchmark
    @Fork(value = 1, warmups = 1)
    public void benchLWJGL() {
        try (MemoryStack memoryStack = MemoryStack.stackPush()) {
            var pPhysicalDeviceCount = memoryStack.mallocInt(1);
            org.lwjgl.vulkan.VK10.vkEnumeratePhysicalDevices(LWJGLStatic.instance, pPhysicalDeviceCount, null);
            var physicalDeviceCount = pPhysicalDeviceCount.get(0);

            var pPhysicalDevices = memoryStack.mallocPointer(physicalDeviceCount);
            org.lwjgl.vulkan.VK10.vkEnumeratePhysicalDevices(LWJGLStatic.instance, pPhysicalDeviceCount, pPhysicalDevices);
        }
    }
}

