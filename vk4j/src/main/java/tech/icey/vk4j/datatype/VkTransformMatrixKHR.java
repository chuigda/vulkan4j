package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.annotation.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.buffer.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import tech.icey.vk4j.NativeLayout;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

public record VkTransformMatrixKHR(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        MemoryLayout.sequenceLayout(3 * 4, ValueLayout.JAVA_FLOAT).withName("matrix")
    );

    public static final PathElement PATH$matrix = PathElement.groupElement("matrix");

    public static final SequenceLayout LAYOUT$matrix = (SequenceLayout) LAYOUT.select(PATH$matrix);

    public static final long OFFSET$matrix = LAYOUT.byteOffset(PATH$matrix);

    public VkTransformMatrixKHR(MemorySegment segment) {
        this.segment = segment;
    }

    public MemorySegment matrixRaw() {
        return segment.asSlice(OFFSET$matrix, LAYOUT$matrix.byteSize());
    }

    public FloatBuffer matrix() {
        return new FloatBuffer(matrixRaw());
    }

    public void matrix(FloatBuffer value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$matrix, LAYOUT$matrix.byteSize());
    }

    public static VkTransformMatrixKHR allocate(Arena arena) {
        return new VkTransformMatrixKHR(arena.allocate(LAYOUT));
    }
    
    public static VkTransformMatrixKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkTransformMatrixKHR[] ret = new VkTransformMatrixKHR[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkTransformMatrixKHR(segment.asSlice(i * LAYOUT.byteSize(), LAYOUT.byteSize()));
        }
        return ret;
    }
}
