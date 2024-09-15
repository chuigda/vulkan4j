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

public record VkMemoryRequirements(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_LONG.withName("size"),
        ValueLayout.JAVA_LONG.withName("alignment"),
        ValueLayout.JAVA_INT.withName("memoryTypeBits")
    );

    public static final PathElement PATH$size = PathElement.groupElement(0);
    public static final PathElement PATH$alignment = PathElement.groupElement(1);
    public static final PathElement PATH$memoryTypeBits = PathElement.groupElement(2);

    public static final OfLong LAYOUT$size = (OfLong) LAYOUT.select(PATH$size);
    public static final OfLong LAYOUT$alignment = (OfLong) LAYOUT.select(PATH$alignment);
    public static final OfInt LAYOUT$memoryTypeBits = (OfInt) LAYOUT.select(PATH$memoryTypeBits);

    public static final long OFFSET$size = LAYOUT.byteOffset(PATH$size);
    public static final long OFFSET$alignment = LAYOUT.byteOffset(PATH$alignment);
    public static final long OFFSET$memoryTypeBits = LAYOUT.byteOffset(PATH$memoryTypeBits);

    public VkMemoryRequirements(MemorySegment segment) {
        this.segment = segment;
    }

    public @unsigned long size() {
        return segment.get(LAYOUT$size, OFFSET$size);
    }

    public void size(@unsigned long value) {
        segment.set(LAYOUT$size, OFFSET$size, value);
    }

    public @unsigned long alignment() {
        return segment.get(LAYOUT$alignment, OFFSET$alignment);
    }

    public void alignment(@unsigned long value) {
        segment.set(LAYOUT$alignment, OFFSET$alignment, value);
    }

    public @unsigned int memoryTypeBits() {
        return segment.get(LAYOUT$memoryTypeBits, OFFSET$memoryTypeBits);
    }

    public void memoryTypeBits(@unsigned int value) {
        segment.set(LAYOUT$memoryTypeBits, OFFSET$memoryTypeBits, value);
    }


    public static final class VkMemoryRequirementsFactory implements IDataTypeFactory<VkMemoryRequirements> {
        @Override
        public Class<VkMemoryRequirements> clazz() {
            return VkMemoryRequirements.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkMemoryRequirements.LAYOUT;
        }

        @Override
        public VkMemoryRequirements create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkMemoryRequirements createUninit(MemorySegment segment) {
            return new VkMemoryRequirements(segment);
        }
    }

    public static final VkMemoryRequirementsFactory FACTORY = new VkMemoryRequirementsFactory();
}
