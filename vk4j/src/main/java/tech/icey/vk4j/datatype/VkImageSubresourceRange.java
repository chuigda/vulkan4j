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

public record VkImageSubresourceRange(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("aspectMask"),
        ValueLayout.JAVA_INT.withName("baseMipLevel"),
        ValueLayout.JAVA_INT.withName("levelCount"),
        ValueLayout.JAVA_INT.withName("baseArrayLayer"),
        ValueLayout.JAVA_INT.withName("layerCount")
    );

    public static final PathElement PATH$aspectMask = PathElement.groupElement("aspectMask");
    public static final PathElement PATH$baseMipLevel = PathElement.groupElement("baseMipLevel");
    public static final PathElement PATH$levelCount = PathElement.groupElement("levelCount");
    public static final PathElement PATH$baseArrayLayer = PathElement.groupElement("baseArrayLayer");
    public static final PathElement PATH$layerCount = PathElement.groupElement("layerCount");

    public static final OfInt LAYOUT$aspectMask = (OfInt) LAYOUT.select(PATH$aspectMask);
    public static final OfInt LAYOUT$baseMipLevel = (OfInt) LAYOUT.select(PATH$baseMipLevel);
    public static final OfInt LAYOUT$levelCount = (OfInt) LAYOUT.select(PATH$levelCount);
    public static final OfInt LAYOUT$baseArrayLayer = (OfInt) LAYOUT.select(PATH$baseArrayLayer);
    public static final OfInt LAYOUT$layerCount = (OfInt) LAYOUT.select(PATH$layerCount);

    public static final long OFFSET$aspectMask = LAYOUT.byteOffset(PATH$aspectMask);
    public static final long OFFSET$baseMipLevel = LAYOUT.byteOffset(PATH$baseMipLevel);
    public static final long OFFSET$levelCount = LAYOUT.byteOffset(PATH$levelCount);
    public static final long OFFSET$baseArrayLayer = LAYOUT.byteOffset(PATH$baseArrayLayer);
    public static final long OFFSET$layerCount = LAYOUT.byteOffset(PATH$layerCount);

    public VkImageSubresourceRange(MemorySegment segment) {
        this.segment = segment;
    }

    public @enumtype(VkImageAspectFlags.class) int aspectMask() {
        return segment.get(LAYOUT$aspectMask, OFFSET$aspectMask);
    }

    public void aspectMask(@enumtype(VkImageAspectFlags.class) int value) {
        segment.set(LAYOUT$aspectMask, OFFSET$aspectMask, value);
    }

    public @unsigned int baseMipLevel() {
        return segment.get(LAYOUT$baseMipLevel, OFFSET$baseMipLevel);
    }

    public void baseMipLevel(@unsigned int value) {
        segment.set(LAYOUT$baseMipLevel, OFFSET$baseMipLevel, value);
    }

    public @unsigned int levelCount() {
        return segment.get(LAYOUT$levelCount, OFFSET$levelCount);
    }

    public void levelCount(@unsigned int value) {
        segment.set(LAYOUT$levelCount, OFFSET$levelCount, value);
    }

    public @unsigned int baseArrayLayer() {
        return segment.get(LAYOUT$baseArrayLayer, OFFSET$baseArrayLayer);
    }

    public void baseArrayLayer(@unsigned int value) {
        segment.set(LAYOUT$baseArrayLayer, OFFSET$baseArrayLayer, value);
    }

    public @unsigned int layerCount() {
        return segment.get(LAYOUT$layerCount, OFFSET$layerCount);
    }

    public void layerCount(@unsigned int value) {
        segment.set(LAYOUT$layerCount, OFFSET$layerCount, value);
    }


    public static final class VkImageSubresourceRangeFactory implements IFactory<VkImageSubresourceRange> {
        @Override
        public Class<VkImageSubresourceRange> clazz() {
            return VkImageSubresourceRange.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkImageSubresourceRange.LAYOUT;
        }

        @Override
        public VkImageSubresourceRange create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkImageSubresourceRange createUninit(MemorySegment segment) {
            return new VkImageSubresourceRange(segment);
        }
    }

    public static final VkImageSubresourceRangeFactory FACTORY = new VkImageSubresourceRangeFactory();
}
