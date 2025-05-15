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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT.html">VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT</a>
@ValueBasedCandidate
public record VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$shaderImageInt64Atomics = ValueLayout.JAVA_INT.withName("shaderImageInt64Atomics");
    public static final OfInt LAYOUT$sparseImageInt64Atomics = ValueLayout.JAVA_INT.withName("sparseImageInt64Atomics");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$shaderImageInt64Atomics, LAYOUT$sparseImageInt64Atomics);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT allocate(Arena arena) {
        return new VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT(arena.allocate(LAYOUT));
    }

    public static VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT[] ret = new VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT clone(Arena arena, VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT src) {
        VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT[] clone(Arena arena, VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT[] src) {
        VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$shaderImageInt64Atomics = PathElement.groupElement("PATH$shaderImageInt64Atomics");
    public static final PathElement PATH$sparseImageInt64Atomics = PathElement.groupElement("PATH$sparseImageInt64Atomics");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$shaderImageInt64Atomics = LAYOUT$shaderImageInt64Atomics.byteSize();
    public static final long SIZE$sparseImageInt64Atomics = LAYOUT$sparseImageInt64Atomics.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$shaderImageInt64Atomics = LAYOUT.byteOffset(PATH$shaderImageInt64Atomics);
    public static final long OFFSET$sparseImageInt64Atomics = LAYOUT.byteOffset(PATH$sparseImageInt64Atomics);

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

    public @unsigned int shaderImageInt64Atomics() {
        return segment.get(LAYOUT$shaderImageInt64Atomics, OFFSET$shaderImageInt64Atomics);
    }

    public void shaderImageInt64Atomics(@unsigned int value) {
        segment.set(LAYOUT$shaderImageInt64Atomics, OFFSET$shaderImageInt64Atomics, value);
    }

    public @unsigned int sparseImageInt64Atomics() {
        return segment.get(LAYOUT$sparseImageInt64Atomics, OFFSET$sparseImageInt64Atomics);
    }

    public void sparseImageInt64Atomics(@unsigned int value) {
        segment.set(LAYOUT$sparseImageInt64Atomics, OFFSET$sparseImageInt64Atomics, value);
    }

}
