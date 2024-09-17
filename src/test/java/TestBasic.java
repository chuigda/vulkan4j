import tech.icey.vk4j.Create;
import tech.icey.vk4j.Loader;
import tech.icey.vk4j.array.IntArray;
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
    }

    public static void main(String[] args) {
        var staticCommands = new StaticCommands(Loader::loadFunctionOrNull);
        var entryCommands = new EntryCommands(Loader::loadFunctionOrNull);

        try (Arena arena = Arena.ofConfined()) {
            var applicationInfo = Create.create(VkApplicationInfo.FACTORY, arena);
            applicationInfo.pApplicationNameRaw(arena.allocateFrom("Hello, Vulkan!"));
            applicationInfo.pEngineNameRaw(arena.allocateFrom("vk4j"));

            var instanceCreateInfo = Create.create(VkInstanceCreateInfo.FACTORY, arena);
            instanceCreateInfo.pApplicationInfo(applicationInfo);

            var pInstance = arena.allocate(ValueLayout.ADDRESS);
            int result = entryCommands.vkCreateInstance(instanceCreateInfo, null, pInstance);
            if (result != VkResult.VK_SUCCESS) {
                System.out.println("Failed to create instance: " + result);
                return;
            }

            var instance = new VkInstance(pInstance.get(ValueLayout.ADDRESS, 0));
            var instanceCommands = new InstanceCommands((String functionName, FunctionDescriptor descriptor) -> {
                MemorySegment functionNameSegment = arena.allocateFrom(functionName);
                MemorySegment fnptrSegment = staticCommands.vkGetInstanceProcAddr(instance, new BytePtr(functionNameSegment));
                if (fnptrSegment.address() == 0) {
                    return null;
                }

                return Loader.nativeLinker.downcallHandle(fnptrSegment, descriptor);
            });

            IntPtr pPhysicalDeviceCount = IntArray.allocate(arena, 1).ptr();
            pPhysicalDeviceCount.write(8);
            var pPhysicalDevices = arena.allocate(ValueLayout.ADDRESS, 8);
            result = instanceCommands.vkEnumeratePhysicalDevices(instance, pPhysicalDeviceCount, pPhysicalDevices);
            if (result != VkResult.VK_SUCCESS && result != VkResult.VK_INCOMPLETE) {
                System.out.println("Failed to enumerate physical devices: " + result);
                return;
            }

            int physicalDeviceCount = pPhysicalDeviceCount.read();
            System.out.println("Physical device count: " + physicalDeviceCount);

            for (int i = 0; i < physicalDeviceCount; i++) {
                var properties = Create.create(VkPhysicalDeviceProperties.FACTORY, arena);

                var physicalDevice = new VkPhysicalDevice(pPhysicalDevices.get(ValueLayout.ADDRESS, i));
                instanceCommands.vkGetPhysicalDeviceProperties(physicalDevice, properties);

                var deviceName = properties.deviceNameRaw().getString(0);
                System.out.println("Device name: " + deviceName);

                var apiVersion = properties.apiVersion();
                System.out.println("API version: " + apiVersion);
            }
        }
    }
}
