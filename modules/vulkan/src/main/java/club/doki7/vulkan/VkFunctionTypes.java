package club.doki7.vulkan;

import java.lang.foreign.*;
import java.lang.invoke.*;
import club.doki7.ffm.annotation.*;
import club.doki7.ffm.NativeLayout;
import org.jetbrains.annotations.NotNull;
import club.doki7.vulkan.datatype.*;
import club.doki7.vulkan.bitmask.*;
import club.doki7.vulkan.enumtype.*;
import club.doki7.vulkan.handle.*;

public final class VkFunctionTypes {
    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/PFN_vkAllocationFunction.html"><code>PFN_vkAllocationFunction</code></a>
    public static final FunctionDescriptor PFN_vkAllocationFunction = FunctionDescriptor.of(
        ValueLayout.ADDRESS,
        ValueLayout.ADDRESS,
        NativeLayout.C_SIZE_T,
        NativeLayout.C_SIZE_T,
        ValueLayout.JAVA_INT
    );

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/PFN_vkDebugReportCallbackEXT.html"><code>PFN_vkDebugReportCallbackEXT</code></a>
    public static final FunctionDescriptor PFN_vkDebugReportCallbackEXT = FunctionDescriptor.of(
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_LONG,
        NativeLayout.C_SIZE_T,
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE),
        ValueLayout.ADDRESS
    );

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/PFN_vkDebugUtilsMessengerCallbackEXT.html"><code>PFN_vkDebugUtilsMessengerCallbackEXT</code></a>
    public static final FunctionDescriptor PFN_vkDebugUtilsMessengerCallbackEXT = FunctionDescriptor.of(
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(VkDebugUtilsMessengerCallbackDataEXT.LAYOUT),
        ValueLayout.ADDRESS
    );

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/PFN_vkDeviceMemoryReportCallbackEXT.html"><code>PFN_vkDeviceMemoryReportCallbackEXT</code></a>
    public static final FunctionDescriptor PFN_vkDeviceMemoryReportCallbackEXT = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS.withTargetLayout(VkDeviceMemoryReportCallbackDataEXT.LAYOUT),
        ValueLayout.ADDRESS
    );

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/PFN_vkFreeFunction.html"><code>PFN_vkFreeFunction</code></a>
    public static final FunctionDescriptor PFN_vkFreeFunction = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS,
        ValueLayout.ADDRESS
    );

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/PFN_vkGetInstanceProcAddrLUNARG.html"><code>PFN_vkGetInstanceProcAddrLUNARG</code></a>
    public static final FunctionDescriptor PFN_vkGetInstanceProcAddrLUNARG = FunctionDescriptor.of(
        ValueLayout.ADDRESS,
        ValueLayout.ADDRESS,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE)
    );

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/PFN_vkInternalAllocationNotification.html"><code>PFN_vkInternalAllocationNotification</code></a>
    public static final FunctionDescriptor PFN_vkInternalAllocationNotification = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS,
        NativeLayout.C_SIZE_T,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT
    );

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/PFN_vkInternalFreeNotification.html"><code>PFN_vkInternalFreeNotification</code></a>
    public static final FunctionDescriptor PFN_vkInternalFreeNotification = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS,
        NativeLayout.C_SIZE_T,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT
    );

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/PFN_vkReallocationFunction.html"><code>PFN_vkReallocationFunction</code></a>
    public static final FunctionDescriptor PFN_vkReallocationFunction = FunctionDescriptor.of(
        ValueLayout.ADDRESS,
        ValueLayout.ADDRESS,
        ValueLayout.ADDRESS,
        NativeLayout.C_SIZE_T,
        NativeLayout.C_SIZE_T,
        ValueLayout.JAVA_INT
    );

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/PFN_vkVoidFunction.html"><code>PFN_vkVoidFunction</code></a>
    public static final FunctionDescriptor PFN_vkVoidFunction = FunctionDescriptor.ofVoid();

    @FunctionalInterface
    public interface PFN_vkAllocationFunction {
        @Pointer(comment="void*") @NotNull MemorySegment invoke(@Pointer(comment="void*") @NotNull MemorySegment p0, long p1, long p2, @EnumType(VkSystemAllocationScope.class) int p3);

        static MethodHandle of(@NotNull PFN_vkAllocationFunction lambda) {
            try {
                return MethodHandles.lookup().findVirtual(PFN_vkAllocationFunction.class, "invoke", PFN_vkAllocationFunction.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull PFN_vkAllocationFunction lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull PFN_vkAllocationFunction lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), PFN_vkAllocationFunction, arena);
        }
    }

    @FunctionalInterface
    public interface PFN_vkDebugReportCallbackEXT {
        @NativeType("VkBool32") @Unsigned int invoke(@Bitmask(VkDebugReportFlagsEXT.class) int p0, @EnumType(VkDebugReportObjectTypeEXT.class) int p1, @Unsigned long p2, long p3, int p4, @Pointer(comment="void*") @NotNull MemorySegment p5, @Pointer(comment="void*") @NotNull MemorySegment p6, @Pointer(comment="void*") @NotNull MemorySegment p7);

        static MethodHandle of(@NotNull PFN_vkDebugReportCallbackEXT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(PFN_vkDebugReportCallbackEXT.class, "invoke", PFN_vkDebugReportCallbackEXT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull PFN_vkDebugReportCallbackEXT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull PFN_vkDebugReportCallbackEXT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), PFN_vkDebugReportCallbackEXT, arena);
        }
    }

    @FunctionalInterface
    public interface PFN_vkDebugUtilsMessengerCallbackEXT {
        @NativeType("VkBool32") @Unsigned int invoke(@Bitmask(VkDebugUtilsMessageSeverityFlagsEXT.class) int p0, @Bitmask(VkDebugUtilsMessageTypeFlagsEXT.class) int p1, @Pointer(comment="void*") @NotNull MemorySegment p2, @Pointer(comment="void*") @NotNull MemorySegment p3);

        static MethodHandle of(@NotNull PFN_vkDebugUtilsMessengerCallbackEXT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(PFN_vkDebugUtilsMessengerCallbackEXT.class, "invoke", PFN_vkDebugUtilsMessengerCallbackEXT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull PFN_vkDebugUtilsMessengerCallbackEXT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull PFN_vkDebugUtilsMessengerCallbackEXT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), PFN_vkDebugUtilsMessengerCallbackEXT, arena);
        }
    }

    @FunctionalInterface
    public interface PFN_vkDeviceMemoryReportCallbackEXT {
        void invoke(@Pointer(comment="void*") @NotNull MemorySegment p0, @Pointer(comment="void*") @NotNull MemorySegment p1);

        static MethodHandle of(@NotNull PFN_vkDeviceMemoryReportCallbackEXT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(PFN_vkDeviceMemoryReportCallbackEXT.class, "invoke", PFN_vkDeviceMemoryReportCallbackEXT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull PFN_vkDeviceMemoryReportCallbackEXT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull PFN_vkDeviceMemoryReportCallbackEXT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), PFN_vkDeviceMemoryReportCallbackEXT, arena);
        }
    }

    @FunctionalInterface
    public interface PFN_vkFreeFunction {
        void invoke(@Pointer(comment="void*") @NotNull MemorySegment p0, @Pointer(comment="void*") @NotNull MemorySegment p1);

        static MethodHandle of(@NotNull PFN_vkFreeFunction lambda) {
            try {
                return MethodHandles.lookup().findVirtual(PFN_vkFreeFunction.class, "invoke", PFN_vkFreeFunction.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull PFN_vkFreeFunction lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull PFN_vkFreeFunction lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), PFN_vkFreeFunction, arena);
        }
    }

    @FunctionalInterface
    public interface PFN_vkGetInstanceProcAddrLUNARG {
        @Pointer(comment="PFN_vkVoidFunction") @NotNull MemorySegment invoke(VkInstance p0, @Pointer(comment="void*") @NotNull MemorySegment p1);

        static MethodHandle of(@NotNull PFN_vkGetInstanceProcAddrLUNARG lambda) {
            try {
                return MethodHandles.lookup().findVirtual(PFN_vkGetInstanceProcAddrLUNARG.class, "invoke", PFN_vkGetInstanceProcAddrLUNARG.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull PFN_vkGetInstanceProcAddrLUNARG lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull PFN_vkGetInstanceProcAddrLUNARG lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), PFN_vkGetInstanceProcAddrLUNARG, arena);
        }
    }

    @FunctionalInterface
    public interface PFN_vkInternalAllocationNotification {
        void invoke(@Pointer(comment="void*") @NotNull MemorySegment p0, long p1, @EnumType(VkInternalAllocationType.class) int p2, @EnumType(VkSystemAllocationScope.class) int p3);

        static MethodHandle of(@NotNull PFN_vkInternalAllocationNotification lambda) {
            try {
                return MethodHandles.lookup().findVirtual(PFN_vkInternalAllocationNotification.class, "invoke", PFN_vkInternalAllocationNotification.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull PFN_vkInternalAllocationNotification lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull PFN_vkInternalAllocationNotification lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), PFN_vkInternalAllocationNotification, arena);
        }
    }

    @FunctionalInterface
    public interface PFN_vkInternalFreeNotification {
        void invoke(@Pointer(comment="void*") @NotNull MemorySegment p0, long p1, @EnumType(VkInternalAllocationType.class) int p2, @EnumType(VkSystemAllocationScope.class) int p3);

        static MethodHandle of(@NotNull PFN_vkInternalFreeNotification lambda) {
            try {
                return MethodHandles.lookup().findVirtual(PFN_vkInternalFreeNotification.class, "invoke", PFN_vkInternalFreeNotification.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull PFN_vkInternalFreeNotification lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull PFN_vkInternalFreeNotification lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), PFN_vkInternalFreeNotification, arena);
        }
    }

    @FunctionalInterface
    public interface PFN_vkReallocationFunction {
        @Pointer(comment="void*") @NotNull MemorySegment invoke(@Pointer(comment="void*") @NotNull MemorySegment p0, @Pointer(comment="void*") @NotNull MemorySegment p1, long p2, long p3, @EnumType(VkSystemAllocationScope.class) int p4);

        static MethodHandle of(@NotNull PFN_vkReallocationFunction lambda) {
            try {
                return MethodHandles.lookup().findVirtual(PFN_vkReallocationFunction.class, "invoke", PFN_vkReallocationFunction.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull PFN_vkReallocationFunction lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull PFN_vkReallocationFunction lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), PFN_vkReallocationFunction, arena);
        }
    }

    @FunctionalInterface
    public interface PFN_vkVoidFunction {
        void invoke();

        static MethodHandle of(@NotNull PFN_vkVoidFunction lambda) {
            try {
                return MethodHandles.lookup().findVirtual(PFN_vkVoidFunction.class, "invoke", PFN_vkVoidFunction.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull PFN_vkVoidFunction lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull PFN_vkVoidFunction lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), PFN_vkVoidFunction, arena);
        }
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private VkFunctionTypes() {}
}
