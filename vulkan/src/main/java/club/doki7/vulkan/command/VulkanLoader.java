package club.doki7.vulkan.command;

import club.doki7.ffm.Loader;
import club.doki7.ffm.ptr.BytePtr;
import club.doki7.vulkan.handle.VkDevice;
import club.doki7.vulkan.handle.VkInstance;

import java.lang.foreign.Arena;

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
    ///
    /// @see Loader#loadFunction
    public static VkStaticCommands loadStaticCommands() {
        return new VkStaticCommands(Loader::loadFunction);
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
    ///
    /// @see Loader#loadFunction
    public static VkEntryCommands loadEntryCommands() {
        return new VkEntryCommands(Loader::loadFunction);
    }

    /// Load Vulkan instance commands.
    ///
    /// This function is implemented in terms of {@link VkStaticCommands#getInstanceProcAddr}. If any of the functions
    /// is not found, that "slot" will be filled with {@code null}. Calling a function not loaded will result in a
    /// {@link NullPointerException}. Unfounded functions are usually caused by unsupported or not requested Vulkan
    /// extensions or layers.
    ///
    /// Instead of using this function, you may also implement your own commands loading logic.
    ///
    /// @param instance Vulkan instance
    /// @param staticCommands static commands, providing the {@code vkGetInstanceProcAddr} function
    /// @return loaded instance commands
    public static VkInstanceCommands loadInstanceCommands(VkInstance instance, VkStaticCommands staticCommands) {
        return new VkInstanceCommands(name -> {
            try (Arena arena = Arena.ofConfined()) {
                return staticCommands.getInstanceProcAddr(instance, BytePtr.allocateString(arena, name));
            }
        });
    }

    /// Load Vulkan device commands.
    ///
    /// This function is implemented in terms of {@link VkStaticCommands#getDeviceProcAddr}.
    /// If any of the functions is not found, that "slot" will be filled with {@code null}. Calling
    /// a function not loaded will result in a {@link NullPointerException}. Unfounded functions
    /// are usually caused by unsupported or not requested Vulkan extensions or layers.
    ///
    /// Instead of using this function, you may also implement your own commands loading logic.
    ///
    /// @param device Vulkan device
    /// @param staticCommands static commands, providing the loading functions
    /// @return loaded device commands
    public static VkDeviceCommands loadDeviceCommands(
            VkDevice device,
            VkStaticCommands staticCommands
    ) {
        return new VkDeviceCommands(name -> {
            try (Arena arena = Arena.ofConfined()) {
                return staticCommands.getDeviceProcAddr(device, BytePtr.allocateString(arena, name));
            }
        });
    }
}
