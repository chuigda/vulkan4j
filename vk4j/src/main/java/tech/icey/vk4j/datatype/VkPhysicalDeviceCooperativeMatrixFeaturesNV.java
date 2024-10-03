package tech.icey.vk4j.datatype;

import tech.icey.panama.IPointer;
import tech.icey.panama.NativeLayout;
import tech.icey.panama.annotation.enumtype;
import tech.icey.panama.annotation.pointer;
import tech.icey.panama.annotation.unsigned;
import tech.icey.vk4j.enumtype.VkStructureType;

import java.lang.foreign.*;

import static java.lang.foreign.ValueLayout.OfInt;
import static java.lang.foreign.ValueLayout.PathElement;
import static tech.icey.vk4j.enumtype.VkStructureType.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COOPERATIVE_MATRIX_FEATURES_NV;

/// {@snippet lang=c :
/// typedef struct VkPhysicalDeviceCooperativeMatrixFeaturesNV {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 cooperativeMatrix;
///     VkBool32 cooperativeMatrixRobustBufferAccess;
/// } VkPhysicalDeviceCooperativeMatrixFeaturesNV;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkPhysicalDeviceCooperativeMatrixFeaturesNV.html">VkPhysicalDeviceCooperativeMatrixFeaturesNV</a>
public record VkPhysicalDeviceCooperativeMatrixFeaturesNV(MemorySegment segment) implements IPointer {
    public VkPhysicalDeviceCooperativeMatrixFeaturesNV(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COOPERATIVE_MATRIX_FEATURES_NV);
    }

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

    public @unsigned int cooperativeMatrix() {
        return segment.get(LAYOUT$cooperativeMatrix, OFFSET$cooperativeMatrix);
    }

    public void cooperativeMatrix(@unsigned int value) {
        segment.set(LAYOUT$cooperativeMatrix, OFFSET$cooperativeMatrix, value);
    }

    public @unsigned int cooperativeMatrixRobustBufferAccess() {
        return segment.get(LAYOUT$cooperativeMatrixRobustBufferAccess, OFFSET$cooperativeMatrixRobustBufferAccess);
    }

    public void cooperativeMatrixRobustBufferAccess(@unsigned int value) {
        segment.set(LAYOUT$cooperativeMatrixRobustBufferAccess, OFFSET$cooperativeMatrixRobustBufferAccess, value);
    }

    public static VkPhysicalDeviceCooperativeMatrixFeaturesNV allocate(Arena arena) {
        return new VkPhysicalDeviceCooperativeMatrixFeaturesNV(arena.allocate(LAYOUT));
    }

    public static VkPhysicalDeviceCooperativeMatrixFeaturesNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceCooperativeMatrixFeaturesNV[] ret = new VkPhysicalDeviceCooperativeMatrixFeaturesNV[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkPhysicalDeviceCooperativeMatrixFeaturesNV(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPhysicalDeviceCooperativeMatrixFeaturesNV clone(Arena arena, VkPhysicalDeviceCooperativeMatrixFeaturesNV src) {
        VkPhysicalDeviceCooperativeMatrixFeaturesNV ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceCooperativeMatrixFeaturesNV[] clone(Arena arena, VkPhysicalDeviceCooperativeMatrixFeaturesNV[] src) {
        VkPhysicalDeviceCooperativeMatrixFeaturesNV[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("cooperativeMatrix"),
        ValueLayout.JAVA_INT.withName("cooperativeMatrixRobustBufferAccess")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$cooperativeMatrix = PathElement.groupElement("cooperativeMatrix");
    public static final PathElement PATH$cooperativeMatrixRobustBufferAccess = PathElement.groupElement("cooperativeMatrixRobustBufferAccess");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$cooperativeMatrix = (OfInt) LAYOUT.select(PATH$cooperativeMatrix);
    public static final OfInt LAYOUT$cooperativeMatrixRobustBufferAccess = (OfInt) LAYOUT.select(PATH$cooperativeMatrixRobustBufferAccess);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$cooperativeMatrix = LAYOUT.byteOffset(PATH$cooperativeMatrix);
    public static final long OFFSET$cooperativeMatrixRobustBufferAccess = LAYOUT.byteOffset(PATH$cooperativeMatrixRobustBufferAccess);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$cooperativeMatrix = LAYOUT$cooperativeMatrix.byteSize();
    public static final long SIZE$cooperativeMatrixRobustBufferAccess = LAYOUT$cooperativeMatrixRobustBufferAccess.byteSize();
}
