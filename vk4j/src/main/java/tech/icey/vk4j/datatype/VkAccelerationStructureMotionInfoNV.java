package tech.icey.vk4j.datatype;

import tech.icey.panama.IPointer;
import tech.icey.panama.NativeLayout;
import tech.icey.panama.annotation.enumtype;
import tech.icey.panama.annotation.pointer;
import tech.icey.panama.annotation.unsigned;
import tech.icey.vk4j.bitmask.VkAccelerationStructureMotionInfoFlagsNV;
import tech.icey.vk4j.enumtype.VkStructureType;

import java.lang.foreign.*;

import static java.lang.foreign.ValueLayout.OfInt;
import static java.lang.foreign.ValueLayout.PathElement;
import static tech.icey.vk4j.enumtype.VkStructureType.VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_MOTION_INFO_NV;

/// {@snippet lang=c :
/// typedef struct VkAccelerationStructureMotionInfoNV {
///     VkStructureType sType;
///     const void* pNext;
///     uint32_t maxInstances;
///     VkAccelerationStructureMotionInfoFlagsNV flags;
/// } VkAccelerationStructureMotionInfoNV;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkAccelerationStructureMotionInfoNV.html">VkAccelerationStructureMotionInfoNV</a>
public record VkAccelerationStructureMotionInfoNV(MemorySegment segment) implements IPointer {
    public VkAccelerationStructureMotionInfoNV(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_MOTION_INFO_NV);
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

    public @unsigned int maxInstances() {
        return segment.get(LAYOUT$maxInstances, OFFSET$maxInstances);
    }

    public void maxInstances(@unsigned int value) {
        segment.set(LAYOUT$maxInstances, OFFSET$maxInstances, value);
    }

    public @enumtype(VkAccelerationStructureMotionInfoFlagsNV.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public void flags(@enumtype(VkAccelerationStructureMotionInfoFlagsNV.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
    }

    public static VkAccelerationStructureMotionInfoNV allocate(Arena arena) {
        return new VkAccelerationStructureMotionInfoNV(arena.allocate(LAYOUT));
    }

    public static VkAccelerationStructureMotionInfoNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkAccelerationStructureMotionInfoNV[] ret = new VkAccelerationStructureMotionInfoNV[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkAccelerationStructureMotionInfoNV(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkAccelerationStructureMotionInfoNV clone(Arena arena, VkAccelerationStructureMotionInfoNV src) {
        VkAccelerationStructureMotionInfoNV ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkAccelerationStructureMotionInfoNV[] clone(Arena arena, VkAccelerationStructureMotionInfoNV[] src) {
        VkAccelerationStructureMotionInfoNV[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("maxInstances"),
        ValueLayout.JAVA_INT.withName("flags")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$maxInstances = PathElement.groupElement("maxInstances");
    public static final PathElement PATH$flags = PathElement.groupElement("flags");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$maxInstances = (OfInt) LAYOUT.select(PATH$maxInstances);
    public static final OfInt LAYOUT$flags = (OfInt) LAYOUT.select(PATH$flags);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$maxInstances = LAYOUT.byteOffset(PATH$maxInstances);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$maxInstances = LAYOUT$maxInstances.byteSize();
    public static final long SIZE$flags = LAYOUT$flags.byteSize();
}
