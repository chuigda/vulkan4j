package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.annotation.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.NativeLayout;
import tech.icey.vk4j.IFactory;

public record VkMemoryHeap(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_LONG.withName("size"),
        ValueLayout.JAVA_INT.withName("flags")
    );

    public static final PathElement PATH$size = PathElement.groupElement("size");
    public static final PathElement PATH$flags = PathElement.groupElement("flags");

    public static final OfLong LAYOUT$size = (OfLong) LAYOUT.select(PATH$size);
    public static final OfInt LAYOUT$flags = (OfInt) LAYOUT.select(PATH$flags);

    public static final long OFFSET$size = LAYOUT.byteOffset(PATH$size);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);

    public VkMemoryHeap(MemorySegment segment) {
        this.segment = segment;
    }

    public @unsigned long size() {
        return segment.get(LAYOUT$size, OFFSET$size);
    }

    public void size(@unsigned long value) {
        segment.set(LAYOUT$size, OFFSET$size, value);
    }

    public @enumtype(VkMemoryHeapFlags.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public void flags(@enumtype(VkMemoryHeapFlags.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
    }


    public static final class Factory implements IFactory<VkMemoryHeap> {
        @Override
        public Class<VkMemoryHeap> clazz() {
            return VkMemoryHeap.class;
        }

        @Override
        public MemoryLayout layout() {
            return VkMemoryHeap.LAYOUT;
        }

        @Override
        public VkMemoryHeap create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkMemoryHeap createUninit(MemorySegment segment) {
            return new VkMemoryHeap(segment);
        }
    }

    public static final Factory FACTORY = new Factory();
}
