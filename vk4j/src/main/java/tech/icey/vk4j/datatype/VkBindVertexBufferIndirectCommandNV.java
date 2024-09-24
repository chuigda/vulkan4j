package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.annotation.*;
import tech.icey.vk4j.NativeLayout;
import tech.icey.vk4j.IFactory;

public record VkBindVertexBufferIndirectCommandNV(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_LONG.withName("bufferAddress"),
        ValueLayout.JAVA_INT.withName("size"),
        ValueLayout.JAVA_INT.withName("stride")
    );

    public static final PathElement PATH$bufferAddress = PathElement.groupElement("bufferAddress");
    public static final PathElement PATH$size = PathElement.groupElement("size");
    public static final PathElement PATH$stride = PathElement.groupElement("stride");

    public static final OfLong LAYOUT$bufferAddress = (OfLong) LAYOUT.select(PATH$bufferAddress);
    public static final OfInt LAYOUT$size = (OfInt) LAYOUT.select(PATH$size);
    public static final OfInt LAYOUT$stride = (OfInt) LAYOUT.select(PATH$stride);

    public static final long OFFSET$bufferAddress = LAYOUT.byteOffset(PATH$bufferAddress);
    public static final long OFFSET$size = LAYOUT.byteOffset(PATH$size);
    public static final long OFFSET$stride = LAYOUT.byteOffset(PATH$stride);

    public VkBindVertexBufferIndirectCommandNV(MemorySegment segment) {
        this.segment = segment;
    }

    public @unsigned long bufferAddress() {
        return segment.get(LAYOUT$bufferAddress, OFFSET$bufferAddress);
    }

    public void bufferAddress(@unsigned long value) {
        segment.set(LAYOUT$bufferAddress, OFFSET$bufferAddress, value);
    }

    public @unsigned int size() {
        return segment.get(LAYOUT$size, OFFSET$size);
    }

    public void size(@unsigned int value) {
        segment.set(LAYOUT$size, OFFSET$size, value);
    }

    public @unsigned int stride() {
        return segment.get(LAYOUT$stride, OFFSET$stride);
    }

    public void stride(@unsigned int value) {
        segment.set(LAYOUT$stride, OFFSET$stride, value);
    }


    public static final class Factory implements IFactory<VkBindVertexBufferIndirectCommandNV> {
        @Override
        public Class<VkBindVertexBufferIndirectCommandNV> clazz() {
            return VkBindVertexBufferIndirectCommandNV.class;
        }

        @Override
        public MemoryLayout layout() {
            return VkBindVertexBufferIndirectCommandNV.LAYOUT;
        }

        @Override
        public VkBindVertexBufferIndirectCommandNV create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkBindVertexBufferIndirectCommandNV createUninit(MemorySegment segment) {
            return new VkBindVertexBufferIndirectCommandNV(segment);
        }
    }

    public static final Factory FACTORY = new Factory();
}
