package tech.icey.vk4j.benchmark;

import tech.icey.vk4j.Loader;
import tech.icey.vk4j.Version;
import tech.icey.vk4j.buffer.ByteBuffer;
import tech.icey.vk4j.command.EntryCommands;
import tech.icey.vk4j.command.InstanceCommands;
import tech.icey.vk4j.command.StaticCommands;
import tech.icey.vk4j.datatype.VkApplicationInfo;
import tech.icey.vk4j.datatype.VkInstanceCreateInfo;
import tech.icey.vk4j.enumtype.VkResult;
import tech.icey.vk4j.handle.VkInstance;

import java.lang.foreign.Arena;
import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.Linker;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

public class VK4JStatic {
    private static final Arena arena = Arena.ofConfined();

    public static final StaticCommands staticCommands;
    public static final EntryCommands entryCommands;
    public static final VkInstance instance;
    public static final InstanceCommands instanceCommands;

    static {
        staticCommands = new StaticCommands(Loader::loadFunctionOrNull);
        entryCommands = new EntryCommands(Loader::loadFunctionOrNull);

        var applicationInfo = VkApplicationInfo.allocate(arena);
        applicationInfo.pApplicationName(ByteBuffer.allocateString(arena, "vk4j benchmarking application"));
        applicationInfo.applicationVersion(Version.vkMakeAPIVersion(0, 1, 0, 0));
        applicationInfo.pEngineName(ByteBuffer.allocateString(arena, "Soloviev D-30"));
        applicationInfo.engineVersion(Version.vkMakeAPIVersion(0, 1, 0, 0));
        applicationInfo.apiVersion(Version.VK_API_VERSION_1_3);

        var instanceCreateInfo = VkInstanceCreateInfo.allocate(arena);
        instanceCreateInfo.pApplicationInfo(applicationInfo);

        var pInstance = VkInstance.Buffer.allocate(arena);
        if (entryCommands.vkCreateInstance(instanceCreateInfo, null, pInstance) != VkResult.VK_SUCCESS) {
            throw new AssertionError("Failed to create VkInstance");
        }
        instance = pInstance.read();
        instanceCommands = new InstanceCommands(VK4JStatic::loadInstanceCommand);
    }

    private static MethodHandle loadInstanceCommand(String name, FunctionDescriptor descriptor) {
        try (Arena localArena = Arena.ofConfined()) {
            var nameSegment = ByteBuffer.allocateString(localArena, name);
            MemorySegment segment = staticCommands.vkGetInstanceProcAddr(instance, nameSegment);
            if (segment.address() == 0) {
                return null;
            }

            return Linker.nativeLinker().downcallHandle(segment, descriptor);
        }
    }
}
