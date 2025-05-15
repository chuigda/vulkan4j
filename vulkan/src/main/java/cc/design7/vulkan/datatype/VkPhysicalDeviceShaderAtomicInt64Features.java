package cc.design7.vulkan.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import cc.design7.ffm.IPointer;
import cc.design7.ffm.NativeLayout;
import cc.design7.ffm.annotation.*;
import cc.design7.ffm.ptr.*;
import cc.design7.vulkan.bitmask.*;
import cc.design7.vulkan.datatype.*;
import cc.design7.vulkan.enumtype.*;
import static cc.design7.vulkan.VkConstants.*;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceShaderAtomicInt64Features.html">VkPhysicalDeviceShaderAtomicInt64Features</a>
@ValueBasedCandidate
public record VkPhysicalDeviceShaderAtomicInt64Features(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$shaderBufferInt64Atomics = ValueLayout.JAVA_INT.withName("shaderBufferInt64Atomics");
    public static final OfInt LAYOUT$shaderSharedInt64Atomics = ValueLayout.JAVA_INT.withName("shaderSharedInt64Atomics");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$shaderBufferInt64Atomics, LAYOUT$shaderSharedInt64Atomics);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkPhysicalDeviceShaderAtomicInt64Features allocate(Arena arena) {
        return new VkPhysicalDeviceShaderAtomicInt64Features(arena.allocate(LAYOUT));
    }

    public static VkPhysicalDeviceShaderAtomicInt64Features[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceShaderAtomicInt64Features[] ret = new VkPhysicalDeviceShaderAtomicInt64Features[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPhysicalDeviceShaderAtomicInt64Features(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPhysicalDeviceShaderAtomicInt64Features clone(Arena arena, VkPhysicalDeviceShaderAtomicInt64Features src) {
        VkPhysicalDeviceShaderAtomicInt64Features ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceShaderAtomicInt64Features[] clone(Arena arena, VkPhysicalDeviceShaderAtomicInt64Features[] src) {
        VkPhysicalDeviceShaderAtomicInt64Features[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$shaderBufferInt64Atomics = PathElement.groupElement("PATH$shaderBufferInt64Atomics");
    public static final PathElement PATH$shaderSharedInt64Atomics = PathElement.groupElement("PATH$shaderSharedInt64Atomics");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$shaderBufferInt64Atomics = LAYOUT$shaderBufferInt64Atomics.byteSize();
    public static final long SIZE$shaderSharedInt64Atomics = LAYOUT$shaderSharedInt64Atomics.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$shaderBufferInt64Atomics = LAYOUT.byteOffset(PATH$shaderBufferInt64Atomics);
    public static final long OFFSET$shaderSharedInt64Atomics = LAYOUT.byteOffset(PATH$shaderSharedInt64Atomics);

    public @enumtype(VkStructureType.class) int sType() {
        return segment.get(LAYOUT$sType, OFFSET$sType);
    }

    public void sType(@enumtype(VkStructureType.class) int value) {
        segment.set(LAYOUT$sType, OFFSET$sType, value);
    }

    public @pointer(comment="void*") MemorySegment pNext() {
        return segment.get(LAYOUT$pNext, OFFSET$pNext);
    }

    public void pNext(@pointer(comment="void*") MemorySegment value) {
        segment.set(LAYOUT$pNext, OFFSET$pNext, value);
    }

    public void pNext(IPointer pointer) {
        pNext(pointer.segment());
    }

    public @unsigned int shaderBufferInt64Atomics() {
        return segment.get(LAYOUT$shaderBufferInt64Atomics, OFFSET$shaderBufferInt64Atomics);
    }

    public void shaderBufferInt64Atomics(@unsigned int value) {
        segment.set(LAYOUT$shaderBufferInt64Atomics, OFFSET$shaderBufferInt64Atomics, value);
    }

    public @unsigned int shaderSharedInt64Atomics() {
        return segment.get(LAYOUT$shaderSharedInt64Atomics, OFFSET$shaderSharedInt64Atomics);
    }

    public void shaderSharedInt64Atomics(@unsigned int value) {
        segment.set(LAYOUT$shaderSharedInt64Atomics, OFFSET$shaderSharedInt64Atomics, value);
    }

}
