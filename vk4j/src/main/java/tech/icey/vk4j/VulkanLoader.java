package tech.icey.vk4j;

import tech.icey.panama.Loader;
import tech.icey.panama.buffer.ByteBuffer;
import tech.icey.vk4j.command.DeviceCommands;
import tech.icey.vk4j.command.EntryCommands;
import tech.icey.vk4j.command.InstanceCommands;
import tech.icey.vk4j.command.StaticCommands;
import tech.icey.vk4j.handle.VkDevice;
import tech.icey.vk4j.handle.VkInstance;

import java.lang.foreign.Arena;
import java.lang.foreign.Linker;
import java.lang.foreign.MemorySegment;

public final class VulkanLoader {
    /// Try loading the Vulkan library.
    ///
    /// This function is implemented in terms of {@link System#loadLibrary}. On Windows it will try
    /// {@code "vulkan-1"} ({@code vulkan-1.dll}), and on other platforms it will try {@code "vulkan"}
    /// ({@code libvulkan.so}).
    ///
    /// Instead of using this function, you may also implement your own Vulkan library loading logic.
    ///
    /// @throws SecurityException see {@link System#loadLibrary}
    /// @throws UnsatisfiedLinkError see {@link System#loadLibrary}
    public static void loadVulkanLibrary() {
        if (System.getProperty("os.name").toLowerCase().contains("windows")) {
            System.loadLibrary("vulkan-1");
        } else {
            System.loadLibrary("vulkan");
        }
    }

    /// Load Vulkan static commands.
    ///
    /// This function is implemented in terms of {@link Loader#loadFunction}. If any of
    /// the static functions is not found, a {@link RuntimeException} will be thrown.
    ///
    /// Instead of using this function, you may also implement your own commands loading logic.
    ///
    /// @return loaded static commands
    /// @throws RuntimeException if any static function is not found
    public static StaticCommands loadStaticCommands() {
        return new StaticCommands(Loader::loadFunction);
    }

    /// Load Vulkan entry commands.
    ///
    /// This function is implemented in terms of {@link Loader#loadFunction}. If any of
    /// the entry functions is not found, a {@link RuntimeException} will be thrown.
    ///
    /// Instead of using this function, you may also implement your own commands loading logic.
    ///
    /// @return loaded entry commands
    /// @throws RuntimeException if any entry function is not found
    public static EntryCommands loadEntryCommands() {
        return new EntryCommands(Loader::loadFunction);
    }

    /// Load Vulkan instance commands.
    ///
    /// This function is implemented in terms of {@link StaticCommands#vkGetInstanceProcAddr}. If any of the functions
    /// is not found, that "slot" will be filled with {@code null}. Calling a function not loaded will result in a
    /// {@link NullPointerException}. Unfounded functions are usually caused by unsupported or not requested Vulkan
    /// extensions or layers.
    ///
    /// Instead of using this function, you may also implement your own commands loading logic.
    ///
    /// @param instance Vulkan instance
    /// @param staticCommands static commands, providing the {@code vkGetInstanceProcAddr} function
    /// @return loaded instance commands
    public static InstanceCommands loadInstanceCommands(VkInstance instance, StaticCommands staticCommands) {
        return new InstanceCommands(name -> {
            try (Arena arena = Arena.ofConfined()) {
                return staticCommands.vkGetInstanceProcAddr(instance, ByteBuffer.allocateString(arena, name));
            }
        });
    }

    /// Load Vulkan device commands.
    ///
    /// This function is implemented in terms of {@link StaticCommands#vkGetDeviceProcAddr} and
    /// {@link StaticCommands#vkGetInstanceProcAddr}. If any of the functions is not found, that "slot" will be filled
    /// with {@code null}. Calling a function not loaded will result in a {@link NullPointerException}. Unfounded
    /// functions are usually caused by unsupported or not requested Vulkan extensions or layers.
    ///
    /// Instead of using this function, you may also implement your own commands loading logic.
    ///
    /// @param instance Vulkan instance
    /// @param device Vulkan device
    /// @param staticCommands static commands, providing the loading functions
    /// @return loaded device commands
    public static DeviceCommands loadDeviceCommands(
            VkInstance instance,
            VkDevice device,
            StaticCommands staticCommands
    ) {
        return new DeviceCommands(name -> {
            try (Arena arena = Arena.ofConfined()) {
                return staticCommands.vkGetDeviceProcAddr(device, ByteBuffer.allocateString(arena, name));
            }
        }, name -> {
            try (Arena arena = Arena.ofConfined()) {
                return staticCommands.vkGetInstanceProcAddr(instance, ByteBuffer.allocateString(arena, name));
            }
        });
    }
}
