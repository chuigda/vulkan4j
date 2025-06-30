package club.doki7.vma;

import java.lang.foreign.*;
import java.lang.invoke.*;
import club.doki7.ffm.annotation.*;
import club.doki7.ffm.NativeLayout;
import org.jetbrains.annotations.NotNull;
import club.doki7.vma.datatype.*;
import club.doki7.vma.bitmask.*;
import club.doki7.vma.enumtype.*;
import club.doki7.vma.handle.*;
import club.doki7.vulkan.bitmask.*;
import club.doki7.vulkan.datatype.*;
import club.doki7.vulkan.enumtype.*;
import club.doki7.vulkan.handle.*;

public final class VMAFunctionTypes {
    public static final FunctionDescriptor PFN_vmaAllocateDeviceMemoryFunction = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_LONG,
        ValueLayout.ADDRESS
    );

    public static final FunctionDescriptor PFN_vmaCheckDefragmentationBreakFunction = FunctionDescriptor.of(
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS
    );

    public static final FunctionDescriptor PFN_vmaFreeDeviceMemoryFunction = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_LONG,
        ValueLayout.ADDRESS
    );

    @FunctionalInterface
    public interface PFN_vmaAllocateDeviceMemoryFunction {
        void invoke(
            VmaAllocator p0,
            @Unsigned int p1,
            VkDeviceMemory p2,
            @NativeType("VkDeviceSize") @Unsigned long p3,
            @Pointer(comment="void*") @NotNull MemorySegment p4
        );

        static MethodHandle of(@NotNull PFN_vmaAllocateDeviceMemoryFunction lambda) {
            try {
                return MethodHandles.lookup().findVirtual(PFN_vmaAllocateDeviceMemoryFunction.class, "invoke", PFN_vmaAllocateDeviceMemoryFunction.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull PFN_vmaAllocateDeviceMemoryFunction lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull PFN_vmaAllocateDeviceMemoryFunction lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), PFN_vmaAllocateDeviceMemoryFunction, arena);
        }
    }

    @FunctionalInterface
    public interface PFN_vmaCheckDefragmentationBreakFunction {
        @NativeType("VkBool32") @Unsigned int invoke(
            @Pointer(comment="void*") @NotNull MemorySegment p0
        );

        static MethodHandle of(@NotNull PFN_vmaCheckDefragmentationBreakFunction lambda) {
            try {
                return MethodHandles.lookup().findVirtual(PFN_vmaCheckDefragmentationBreakFunction.class, "invoke", PFN_vmaCheckDefragmentationBreakFunction.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull PFN_vmaCheckDefragmentationBreakFunction lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull PFN_vmaCheckDefragmentationBreakFunction lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), PFN_vmaCheckDefragmentationBreakFunction, arena);
        }
    }

    @FunctionalInterface
    public interface PFN_vmaFreeDeviceMemoryFunction {
        void invoke(
            VmaAllocator p0,
            @Unsigned int p1,
            VkDeviceMemory p2,
            @NativeType("VkDeviceSize") @Unsigned long p3,
            @Pointer(comment="void*") @NotNull MemorySegment p4
        );

        static MethodHandle of(@NotNull PFN_vmaFreeDeviceMemoryFunction lambda) {
            try {
                return MethodHandles.lookup().findVirtual(PFN_vmaFreeDeviceMemoryFunction.class, "invoke", PFN_vmaFreeDeviceMemoryFunction.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull PFN_vmaFreeDeviceMemoryFunction lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull PFN_vmaFreeDeviceMemoryFunction lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), PFN_vmaFreeDeviceMemoryFunction, arena);
        }
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private VMAFunctionTypes() {}
}
