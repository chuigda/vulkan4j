package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.annotations.*;
import tech.icey.vk4j.array.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import tech.icey.vk4j.ptr.*;
import tech.icey.vk4j.NativeLayout;
import tech.icey.vk4j.IDataTypeFactory;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

public record VkMemoryHeap(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_LONG.withName("size"),
        ValueLayout.JAVA_INT.withName("flags")
    );

    public static final PathElement PATH$size = PathElement.groupElement(0);
    public static final PathElement PATH$flags = PathElement.groupElement(1);

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


    public static final class VkMemoryHeapFactory implements IDataTypeFactory<VkMemoryHeap> {
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

    public static final VkMemoryHeapFactory FACTORY = new VkMemoryHeapFactory();
}
