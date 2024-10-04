package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.panama.IPointer;
import tech.icey.panama.NativeLayout;
import tech.icey.panama.annotation.*;
import tech.icey.panama.buffer.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

/// {@snippet lang=c :
/// typedef struct VkPhysicalDeviceCooperativeMatrixFeaturesKHR {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 cooperativeMatrix;
///     VkBool32 cooperativeMatrixRobustBufferAccess;
/// } VkPhysicalDeviceCooperativeMatrixFeaturesKHR;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkPhysicalDeviceCooperativeMatrixFeaturesKHR.html">VkPhysicalDeviceCooperativeMatrixFeaturesKHR</a>
public record VkPhysicalDeviceCooperativeMatrixFeaturesKHR(MemorySegment segment) implements IPointer {
    public VkPhysicalDeviceCooperativeMatrixFeaturesKHR(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COOPERATIVE_MATRIX_FEATURES_KHR);
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

    public void pNext(@nullable IPointer pointer) {
        pNext(pointer == null ? MemorySegment.NULL : pointer.segment());
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

    public static VkPhysicalDeviceCooperativeMatrixFeaturesKHR allocate(Arena arena) {
        return new VkPhysicalDeviceCooperativeMatrixFeaturesKHR(arena.allocate(LAYOUT));
    }

    public static VkPhysicalDeviceCooperativeMatrixFeaturesKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceCooperativeMatrixFeaturesKHR[] ret = new VkPhysicalDeviceCooperativeMatrixFeaturesKHR[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkPhysicalDeviceCooperativeMatrixFeaturesKHR(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPhysicalDeviceCooperativeMatrixFeaturesKHR clone(Arena arena, VkPhysicalDeviceCooperativeMatrixFeaturesKHR src) {
        VkPhysicalDeviceCooperativeMatrixFeaturesKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceCooperativeMatrixFeaturesKHR[] clone(Arena arena, VkPhysicalDeviceCooperativeMatrixFeaturesKHR[] src) {
        VkPhysicalDeviceCooperativeMatrixFeaturesKHR[] ret = allocate(arena, src.length);
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
