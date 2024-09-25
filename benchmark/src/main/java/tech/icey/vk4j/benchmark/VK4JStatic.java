package tech.icey.vk4j.benchmark;

import tech.icey.vk4j.Create;
import tech.icey.vk4j.Loader;
import tech.icey.vk4j.Version;
import tech.icey.vk4j.array.ByteArray;
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

        var applicationInfo = Create.create(VkApplicationInfo.FACTORY, arena);
        applicationInfo.pApplicationName(ByteArray.allocateUtf8(arena, "vk4j benchmarking application"));
        applicationInfo.applicationVersion(Version.vkMakeAPIVersion(0, 1, 0, 0));
        applicationInfo.pEngineName(ByteArray.allocateUtf8(arena, "Soloviev D-30"));
        applicationInfo.engineVersion(Version.vkMakeAPIVersion(0, 1, 0, 0));
        applicationInfo.apiVersion(Version.VK_API_VERSION_1_3);

        var instanceCreateInfo = Create.create(VkInstanceCreateInfo.FACTORY, arena);
        instanceCreateInfo.pApplicationInfo(applicationInfo);

        instance = Create.create(VkInstance.FACTORY, arena);
        if (entryCommands.vkCreateInstance(instanceCreateInfo, null, instance) != VkResult.VK_SUCCESS) {
            throw new AssertionError("Failed to create VkInstance");
        }
        instanceCommands = new InstanceCommands(VK4JStatic::loadInstanceCommand);
    }

    private static MethodHandle loadInstanceCommand(String name, FunctionDescriptor descriptor) {
        try (Arena localArena = Arena.ofConfined()) {
            var nameSegment = ByteArray.allocateUtf8(localArena, name);
            MemorySegment segment = staticCommands.vkGetInstanceProcAddr(instance, nameSegment);
            if (segment.address() == 0) {
                return null;
            }

            return Linker.nativeLinker().downcallHandle(segment, descriptor);
        }
    }
}
