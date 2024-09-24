package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.annotation.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.handle.*;
import tech.icey.vk4j.NativeLayout;
import tech.icey.vk4j.IFactory;

public record VkSparseMemoryBind(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_LONG.withName("resourceOffset"),
        ValueLayout.JAVA_LONG.withName("size"),
        ValueLayout.ADDRESS.withName("memory"),
        ValueLayout.JAVA_LONG.withName("memoryOffset"),
        ValueLayout.JAVA_INT.withName("flags")
    );

    public static final PathElement PATH$resourceOffset = PathElement.groupElement("resourceOffset");
    public static final PathElement PATH$size = PathElement.groupElement("size");
    public static final PathElement PATH$memory = PathElement.groupElement("memory");
    public static final PathElement PATH$memoryOffset = PathElement.groupElement("memoryOffset");
    public static final PathElement PATH$flags = PathElement.groupElement("flags");

    public static final OfLong LAYOUT$resourceOffset = (OfLong) LAYOUT.select(PATH$resourceOffset);
    public static final OfLong LAYOUT$size = (OfLong) LAYOUT.select(PATH$size);
    public static final AddressLayout LAYOUT$memory = (AddressLayout) LAYOUT.select(PATH$memory);
    public static final OfLong LAYOUT$memoryOffset = (OfLong) LAYOUT.select(PATH$memoryOffset);
    public static final OfInt LAYOUT$flags = (OfInt) LAYOUT.select(PATH$flags);

    public static final long OFFSET$resourceOffset = LAYOUT.byteOffset(PATH$resourceOffset);
    public static final long OFFSET$size = LAYOUT.byteOffset(PATH$size);
    public static final long OFFSET$memory = LAYOUT.byteOffset(PATH$memory);
    public static final long OFFSET$memoryOffset = LAYOUT.byteOffset(PATH$memoryOffset);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);

    public VkSparseMemoryBind(MemorySegment segment) {
        this.segment = segment;
    }

    public @unsigned long resourceOffset() {
        return segment.get(LAYOUT$resourceOffset, OFFSET$resourceOffset);
    }

    public void resourceOffset(@unsigned long value) {
        segment.set(LAYOUT$resourceOffset, OFFSET$resourceOffset, value);
    }

    public @unsigned long size() {
        return segment.get(LAYOUT$size, OFFSET$size);
    }

    public void size(@unsigned long value) {
        segment.set(LAYOUT$size, OFFSET$size, value);
    }

    public VkDeviceMemory memory() {
        return new VkDeviceMemory(segment.asSlice(OFFSET$memory, LAYOUT$memory));
    }

    public void memory(VkDeviceMemory value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$memory, LAYOUT$memory.byteSize());
    }

    public @unsigned long memoryOffset() {
        return segment.get(LAYOUT$memoryOffset, OFFSET$memoryOffset);
    }

    public void memoryOffset(@unsigned long value) {
        segment.set(LAYOUT$memoryOffset, OFFSET$memoryOffset, value);
    }

    public @enumtype(VkSparseMemoryBindFlags.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public void flags(@enumtype(VkSparseMemoryBindFlags.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
    }


    public static final class Factory implements IFactory<VkSparseMemoryBind> {
        @Override
        public Class<VkSparseMemoryBind> clazz() {
            return VkSparseMemoryBind.class;
        }

        @Override
        public MemoryLayout layout() {
            return VkSparseMemoryBind.LAYOUT;
        }

        @Override
        public VkSparseMemoryBind create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkSparseMemoryBind createUninit(MemorySegment segment) {
            return new VkSparseMemoryBind(segment);
        }
    }

    public static final Factory FACTORY = new Factory();
}
