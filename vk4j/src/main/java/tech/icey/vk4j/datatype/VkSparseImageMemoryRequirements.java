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
import tech.icey.vk4j.IFactory;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

public record VkSparseImageMemoryRequirements(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        VkSparseImageFormatProperties.LAYOUT.withName("formatProperties"),
        ValueLayout.JAVA_INT.withName("imageMipTailFirstLod"),
        ValueLayout.JAVA_LONG.withName("imageMipTailSize"),
        ValueLayout.JAVA_LONG.withName("imageMipTailOffset"),
        ValueLayout.JAVA_LONG.withName("imageMipTailStride")
    );

    public static final PathElement PATH$formatProperties = PathElement.groupElement("formatProperties");
    public static final PathElement PATH$imageMipTailFirstLod = PathElement.groupElement("imageMipTailFirstLod");
    public static final PathElement PATH$imageMipTailSize = PathElement.groupElement("imageMipTailSize");
    public static final PathElement PATH$imageMipTailOffset = PathElement.groupElement("imageMipTailOffset");
    public static final PathElement PATH$imageMipTailStride = PathElement.groupElement("imageMipTailStride");

    public static final StructLayout LAYOUT$formatProperties = (StructLayout) LAYOUT.select(PATH$formatProperties);
    public static final OfInt LAYOUT$imageMipTailFirstLod = (OfInt) LAYOUT.select(PATH$imageMipTailFirstLod);
    public static final OfLong LAYOUT$imageMipTailSize = (OfLong) LAYOUT.select(PATH$imageMipTailSize);
    public static final OfLong LAYOUT$imageMipTailOffset = (OfLong) LAYOUT.select(PATH$imageMipTailOffset);
    public static final OfLong LAYOUT$imageMipTailStride = (OfLong) LAYOUT.select(PATH$imageMipTailStride);

    public static final long OFFSET$formatProperties = LAYOUT.byteOffset(PATH$formatProperties);
    public static final long OFFSET$imageMipTailFirstLod = LAYOUT.byteOffset(PATH$imageMipTailFirstLod);
    public static final long OFFSET$imageMipTailSize = LAYOUT.byteOffset(PATH$imageMipTailSize);
    public static final long OFFSET$imageMipTailOffset = LAYOUT.byteOffset(PATH$imageMipTailOffset);
    public static final long OFFSET$imageMipTailStride = LAYOUT.byteOffset(PATH$imageMipTailStride);

    public VkSparseImageMemoryRequirements(MemorySegment segment) {
        this.segment = segment;
    }

    public VkSparseImageFormatProperties formatProperties() {
        return new VkSparseImageFormatProperties(segment.asSlice(OFFSET$formatProperties, LAYOUT$formatProperties));
    }

    public void formatProperties(VkSparseImageFormatProperties value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$formatProperties, LAYOUT$formatProperties.byteSize());
    }

    public @unsigned int imageMipTailFirstLod() {
        return segment.get(LAYOUT$imageMipTailFirstLod, OFFSET$imageMipTailFirstLod);
    }

    public void imageMipTailFirstLod(@unsigned int value) {
        segment.set(LAYOUT$imageMipTailFirstLod, OFFSET$imageMipTailFirstLod, value);
    }

    public @unsigned long imageMipTailSize() {
        return segment.get(LAYOUT$imageMipTailSize, OFFSET$imageMipTailSize);
    }

    public void imageMipTailSize(@unsigned long value) {
        segment.set(LAYOUT$imageMipTailSize, OFFSET$imageMipTailSize, value);
    }

    public @unsigned long imageMipTailOffset() {
        return segment.get(LAYOUT$imageMipTailOffset, OFFSET$imageMipTailOffset);
    }

    public void imageMipTailOffset(@unsigned long value) {
        segment.set(LAYOUT$imageMipTailOffset, OFFSET$imageMipTailOffset, value);
    }

    public @unsigned long imageMipTailStride() {
        return segment.get(LAYOUT$imageMipTailStride, OFFSET$imageMipTailStride);
    }

    public void imageMipTailStride(@unsigned long value) {
        segment.set(LAYOUT$imageMipTailStride, OFFSET$imageMipTailStride, value);
    }


    public static final class VkSparseImageMemoryRequirementsFactory implements IFactory<VkSparseImageMemoryRequirements> {
        @Override
        public Class<VkSparseImageMemoryRequirements> clazz() {
            return VkSparseImageMemoryRequirements.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkSparseImageMemoryRequirements.LAYOUT;
        }

        @Override
        public VkSparseImageMemoryRequirements create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkSparseImageMemoryRequirements createUninit(MemorySegment segment) {
            return new VkSparseImageMemoryRequirements(segment);
        }
    }

    public static final VkSparseImageMemoryRequirementsFactory FACTORY = new VkSparseImageMemoryRequirementsFactory();
}
