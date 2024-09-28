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
/// typedef struct VkTransformMatrixKHR {
///     float matrix[3][4];
/// } VkTransformMatrixKHR;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkTransformMatrixKHR.html">VkTransformMatrixKHR</a>
public record VkTransformMatrixKHR(MemorySegment segment) implements IPointer {
    public VkTransformMatrixKHR(MemorySegment segment) {
        this.segment = segment;
    }

    public MemorySegment matrixRaw() {
        return segment.asSlice(OFFSET$matrix, SIZE$matrix);
    }

    public FloatBuffer matrix() {
        return new FloatBuffer(matrixRaw());
    }

    public void matrix(FloatBuffer value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$matrix, SIZE$matrix);
    }

    public static VkTransformMatrixKHR allocate(Arena arena) {
        return new VkTransformMatrixKHR(arena.allocate(LAYOUT));
    }
    
    public static VkTransformMatrixKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkTransformMatrixKHR[] ret = new VkTransformMatrixKHR[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkTransformMatrixKHR(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
    
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        MemoryLayout.sequenceLayout(3 * 4, ValueLayout.JAVA_FLOAT).withName("matrix")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$matrix = PathElement.groupElement("matrix");

    public static final SequenceLayout LAYOUT$matrix = (SequenceLayout) LAYOUT.select(PATH$matrix);

    public static final long OFFSET$matrix = LAYOUT.byteOffset(PATH$matrix);

    public static final long SIZE$matrix = LAYOUT$matrix.byteSize();
}
