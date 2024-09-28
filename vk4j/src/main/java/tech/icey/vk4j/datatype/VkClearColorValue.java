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

/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkClearColorValue.html">VkClearColorValue</a>
public record VkClearColorValue(MemorySegment segment) implements IPointer {
    public static final MemoryLayout LAYOUT = NativeLayout.unionLayout(
        MemoryLayout.sequenceLayout(4, ValueLayout.JAVA_FLOAT).withName("float32"),
        MemoryLayout.sequenceLayout(4, ValueLayout.JAVA_INT).withName("int32"),
        MemoryLayout.sequenceLayout(4, ValueLayout.JAVA_INT).withName("uint32")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$float32 = PathElement.groupElement("float32");
    public static final PathElement PATH$int32 = PathElement.groupElement("int32");
    public static final PathElement PATH$uint32 = PathElement.groupElement("uint32");

    public static final SequenceLayout LAYOUT$float32 = (SequenceLayout) LAYOUT.select(PATH$float32);
    public static final SequenceLayout LAYOUT$int32 = (SequenceLayout) LAYOUT.select(PATH$int32);
    public static final SequenceLayout LAYOUT$uint32 = (SequenceLayout) LAYOUT.select(PATH$uint32);

    public static final long OFFSET$float32 = LAYOUT.byteOffset(PATH$float32);
    public static final long OFFSET$int32 = LAYOUT.byteOffset(PATH$int32);
    public static final long OFFSET$uint32 = LAYOUT.byteOffset(PATH$uint32);

    public static final long SIZE$float32 = LAYOUT$float32.byteSize();
    public static final long SIZE$int32 = LAYOUT$int32.byteSize();
    public static final long SIZE$uint32 = LAYOUT$uint32.byteSize();

    public VkClearColorValue(MemorySegment segment) {
        this.segment = segment;
    }

    public MemorySegment float32Raw() {
        return segment.asSlice(OFFSET$float32, SIZE$float32);
    }

    public FloatBuffer float32() {
        return new FloatBuffer(float32Raw());
    }

    public void float32(FloatBuffer value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$float32, SIZE$float32);
    }

    public MemorySegment int32Raw() {
        return segment.asSlice(OFFSET$int32, SIZE$int32);
    }

    public IntBuffer int32() {
        return new IntBuffer(int32Raw());
    }

    public void int32(IntBuffer value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$int32, SIZE$int32);
    }

    public MemorySegment uint32Raw() {
        return segment.asSlice(OFFSET$uint32, SIZE$uint32);
    }

    public @unsigned IntBuffer uint32() {
        return new IntBuffer(uint32Raw());
    }

    public void uint32(@unsigned IntBuffer value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$uint32, SIZE$uint32);
    }

    public static VkClearColorValue allocate(Arena arena) {
        return new VkClearColorValue(arena.allocate(LAYOUT));
    }
    
    public static VkClearColorValue[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkClearColorValue[] ret = new VkClearColorValue[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkClearColorValue(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
}
