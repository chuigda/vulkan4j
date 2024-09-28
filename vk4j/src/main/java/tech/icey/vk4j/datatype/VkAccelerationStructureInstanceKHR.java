package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.IPointer;
import tech.icey.vk4j.annotation.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.buffer.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import tech.icey.vk4j.NativeLayout;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

/// {@snippet lang=c :
/// typedef struct VkAccelerationStructureInstanceKHR {
///     VkTransformMatrixKHR transform;
///     uint32_t instanceCustomIndex:24;
///     uint32_t mask:8;
///     uint32_t instanceShaderBindingTableRecordOffset:24;
///     VkGeometryInstanceFlagsKHR flags:8;
///     uint64_t accelerationStructureReference;
/// } VkAccelerationStructureInstanceKHR;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkAccelerationStructureInstanceKHR.html">VkAccelerationStructureInstanceKHR</a>
public record VkAccelerationStructureInstanceKHR(MemorySegment segment) implements IPointer {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        VkTransformMatrixKHR.LAYOUT.withName("transform"),
        ValueLayout.JAVA_INT.withName("bitfield$instanceCustomIndex_mask"),
        ValueLayout.JAVA_INT.withName("bitfield$instanceShaderBindingTableRecordOffset_flags"),
        ValueLayout.JAVA_LONG.withName("accelerationStructureReference")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$transform = PathElement.groupElement("transform");
    public static final PathElement PATH$bitfield$instanceCustomIndex_mask = PathElement.groupElement("bitfield$instanceCustomIndex_mask");
    public static final PathElement PATH$bitfield$instanceShaderBindingTableRecordOffset_flags = PathElement.groupElement("bitfield$instanceShaderBindingTableRecordOffset_flags");
    public static final PathElement PATH$accelerationStructureReference = PathElement.groupElement("accelerationStructureReference");

    public static final StructLayout LAYOUT$transform = (StructLayout) LAYOUT.select(PATH$transform);
    public static final OfInt LAYOUT$bitfield$instanceCustomIndex_mask = (OfInt) LAYOUT.select(PATH$bitfield$instanceCustomIndex_mask);
    public static final OfInt LAYOUT$bitfield$instanceShaderBindingTableRecordOffset_flags = (OfInt) LAYOUT.select(PATH$bitfield$instanceShaderBindingTableRecordOffset_flags);
    public static final OfLong LAYOUT$accelerationStructureReference = (OfLong) LAYOUT.select(PATH$accelerationStructureReference);

    public static final long OFFSET$transform = LAYOUT.byteOffset(PATH$transform);
    public static final long OFFSET$bitfield$instanceCustomIndex_mask = LAYOUT.byteOffset(PATH$bitfield$instanceCustomIndex_mask);
    public static final long OFFSET$bitfield$instanceShaderBindingTableRecordOffset_flags = LAYOUT.byteOffset(PATH$bitfield$instanceShaderBindingTableRecordOffset_flags);
    public static final long OFFSET$accelerationStructureReference = LAYOUT.byteOffset(PATH$accelerationStructureReference);

    public static final long SIZE$transform = LAYOUT$transform.byteSize();
    public static final long SIZE$bitfield$instanceCustomIndex_mask = LAYOUT$bitfield$instanceCustomIndex_mask.byteSize();
    public static final long SIZE$bitfield$instanceShaderBindingTableRecordOffset_flags = LAYOUT$bitfield$instanceShaderBindingTableRecordOffset_flags.byteSize();
    public static final long SIZE$accelerationStructureReference = LAYOUT$accelerationStructureReference.byteSize();

    public VkAccelerationStructureInstanceKHR(MemorySegment segment) {
        this.segment = segment;
    }

    public VkTransformMatrixKHR transform() {
        return new VkTransformMatrixKHR(segment.asSlice(OFFSET$transform, LAYOUT$transform));
    }

    public void transform(VkTransformMatrixKHR value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$transform, SIZE$transform);
    }

    public int instanceCustomIndex() {
        return segment.get(LAYOUT$bitfield$instanceCustomIndex_mask, OFFSET$bitfield$instanceCustomIndex_mask) >> 8;
    }

    public void instanceCustomIndex(int value) {
        int original = segment.get(LAYOUT$bitfield$instanceCustomIndex_mask, OFFSET$bitfield$instanceCustomIndex_mask);
        int newValue = (value << 8) | (original & 0xFF);
        segment.set(LAYOUT$bitfield$instanceCustomIndex_mask, OFFSET$bitfield$instanceCustomIndex_mask, newValue);
    }

    public int mask() {
        return segment.get(LAYOUT$bitfield$instanceCustomIndex_mask, OFFSET$bitfield$instanceCustomIndex_mask) & 0xFF;
    }

    public void mask(int value) {
        int original = segment.get(LAYOUT$bitfield$instanceCustomIndex_mask, OFFSET$bitfield$instanceCustomIndex_mask);
        int newValue = (original & 0xFF00) | value;
        segment.set(LAYOUT$bitfield$instanceCustomIndex_mask, OFFSET$bitfield$instanceCustomIndex_mask, newValue);
    }

    public int instanceShaderBindingTableRecordOffset() {
        return segment.get(LAYOUT$bitfield$instanceShaderBindingTableRecordOffset_flags, OFFSET$bitfield$instanceShaderBindingTableRecordOffset_flags) >> 8;
    }

    public void instanceShaderBindingTableRecordOffset(int value) {
        int original = segment.get(LAYOUT$bitfield$instanceShaderBindingTableRecordOffset_flags, OFFSET$bitfield$instanceShaderBindingTableRecordOffset_flags);
        int newValue = (value << 8) | (original & 0xFF);
        segment.set(LAYOUT$bitfield$instanceShaderBindingTableRecordOffset_flags, OFFSET$bitfield$instanceShaderBindingTableRecordOffset_flags, newValue);
    }

    public int flags() {
        return segment.get(LAYOUT$bitfield$instanceShaderBindingTableRecordOffset_flags, OFFSET$bitfield$instanceShaderBindingTableRecordOffset_flags) & 0xFF;
    }

    public void flags(int value) {
        int original = segment.get(LAYOUT$bitfield$instanceShaderBindingTableRecordOffset_flags, OFFSET$bitfield$instanceShaderBindingTableRecordOffset_flags);
        int newValue = (original & 0xFF00) | value;
        segment.set(LAYOUT$bitfield$instanceShaderBindingTableRecordOffset_flags, OFFSET$bitfield$instanceShaderBindingTableRecordOffset_flags, newValue);
    }

    public @unsigned long accelerationStructureReference() {
        return segment.get(LAYOUT$accelerationStructureReference, OFFSET$accelerationStructureReference);
    }

    public void accelerationStructureReference(@unsigned long value) {
        segment.set(LAYOUT$accelerationStructureReference, OFFSET$accelerationStructureReference, value);
    }

    public static VkAccelerationStructureInstanceKHR allocate(Arena arena) {
        return new VkAccelerationStructureInstanceKHR(arena.allocate(LAYOUT));
    }
    
    public static VkAccelerationStructureInstanceKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkAccelerationStructureInstanceKHR[] ret = new VkAccelerationStructureInstanceKHR[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkAccelerationStructureInstanceKHR(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
}
