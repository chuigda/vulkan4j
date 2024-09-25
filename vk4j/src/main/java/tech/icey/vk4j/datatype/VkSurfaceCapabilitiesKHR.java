package tech.icey.vk4j.datatype;

import tech.icey.vk4j.IFactory;
import tech.icey.vk4j.NativeLayout;
import tech.icey.vk4j.annotation.enumtype;
import tech.icey.vk4j.annotation.unsigned;
import tech.icey.vk4j.bitmask.VkCompositeAlphaFlagsKHR;
import tech.icey.vk4j.bitmask.VkImageUsageFlags;
import tech.icey.vk4j.bitmask.VkSurfaceTransformFlagsKHR;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.foreign.ValueLayout;

import static java.lang.foreign.ValueLayout.OfInt;
import static java.lang.foreign.ValueLayout.PathElement;

public record VkSurfaceCapabilitiesKHR(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("minImageCount"),
        ValueLayout.JAVA_INT.withName("maxImageCount"),
        VkExtent2D.LAYOUT.withName("currentExtent"),
        VkExtent2D.LAYOUT.withName("minImageExtent"),
        VkExtent2D.LAYOUT.withName("maxImageExtent"),
        ValueLayout.JAVA_INT.withName("maxImageArrayLayers"),
        ValueLayout.JAVA_INT.withName("supportedTransforms"),
        ValueLayout.JAVA_INT.withName("currentTransform"),
        ValueLayout.JAVA_INT.withName("supportedCompositeAlpha"),
        ValueLayout.JAVA_INT.withName("supportedUsageFlags")
    );

    public static final PathElement PATH$minImageCount = PathElement.groupElement("minImageCount");
    public static final PathElement PATH$maxImageCount = PathElement.groupElement("maxImageCount");
    public static final PathElement PATH$currentExtent = PathElement.groupElement("currentExtent");
    public static final PathElement PATH$minImageExtent = PathElement.groupElement("minImageExtent");
    public static final PathElement PATH$maxImageExtent = PathElement.groupElement("maxImageExtent");
    public static final PathElement PATH$maxImageArrayLayers = PathElement.groupElement("maxImageArrayLayers");
    public static final PathElement PATH$supportedTransforms = PathElement.groupElement("supportedTransforms");
    public static final PathElement PATH$currentTransform = PathElement.groupElement("currentTransform");
    public static final PathElement PATH$supportedCompositeAlpha = PathElement.groupElement("supportedCompositeAlpha");
    public static final PathElement PATH$supportedUsageFlags = PathElement.groupElement("supportedUsageFlags");

    public static final OfInt LAYOUT$minImageCount = (OfInt) LAYOUT.select(PATH$minImageCount);
    public static final OfInt LAYOUT$maxImageCount = (OfInt) LAYOUT.select(PATH$maxImageCount);
    public static final StructLayout LAYOUT$currentExtent = (StructLayout) LAYOUT.select(PATH$currentExtent);
    public static final StructLayout LAYOUT$minImageExtent = (StructLayout) LAYOUT.select(PATH$minImageExtent);
    public static final StructLayout LAYOUT$maxImageExtent = (StructLayout) LAYOUT.select(PATH$maxImageExtent);
    public static final OfInt LAYOUT$maxImageArrayLayers = (OfInt) LAYOUT.select(PATH$maxImageArrayLayers);
    public static final OfInt LAYOUT$supportedTransforms = (OfInt) LAYOUT.select(PATH$supportedTransforms);
    public static final OfInt LAYOUT$currentTransform = (OfInt) LAYOUT.select(PATH$currentTransform);
    public static final OfInt LAYOUT$supportedCompositeAlpha = (OfInt) LAYOUT.select(PATH$supportedCompositeAlpha);
    public static final OfInt LAYOUT$supportedUsageFlags = (OfInt) LAYOUT.select(PATH$supportedUsageFlags);

    public static final long OFFSET$minImageCount = LAYOUT.byteOffset(PATH$minImageCount);
    public static final long OFFSET$maxImageCount = LAYOUT.byteOffset(PATH$maxImageCount);
    public static final long OFFSET$currentExtent = LAYOUT.byteOffset(PATH$currentExtent);
    public static final long OFFSET$minImageExtent = LAYOUT.byteOffset(PATH$minImageExtent);
    public static final long OFFSET$maxImageExtent = LAYOUT.byteOffset(PATH$maxImageExtent);
    public static final long OFFSET$maxImageArrayLayers = LAYOUT.byteOffset(PATH$maxImageArrayLayers);
    public static final long OFFSET$supportedTransforms = LAYOUT.byteOffset(PATH$supportedTransforms);
    public static final long OFFSET$currentTransform = LAYOUT.byteOffset(PATH$currentTransform);
    public static final long OFFSET$supportedCompositeAlpha = LAYOUT.byteOffset(PATH$supportedCompositeAlpha);
    public static final long OFFSET$supportedUsageFlags = LAYOUT.byteOffset(PATH$supportedUsageFlags);

    public VkSurfaceCapabilitiesKHR(MemorySegment segment) {
        this.segment = segment;
    }

    public @unsigned int minImageCount() {
        return segment.get(LAYOUT$minImageCount, OFFSET$minImageCount);
    }

    public void minImageCount(@unsigned int value) {
        segment.set(LAYOUT$minImageCount, OFFSET$minImageCount, value);
    }

    public @unsigned int maxImageCount() {
        return segment.get(LAYOUT$maxImageCount, OFFSET$maxImageCount);
    }

    public void maxImageCount(@unsigned int value) {
        segment.set(LAYOUT$maxImageCount, OFFSET$maxImageCount, value);
    }

    public VkExtent2D currentExtent() {
        return new VkExtent2D(segment.asSlice(OFFSET$currentExtent, LAYOUT$currentExtent));
    }

    public void currentExtent(VkExtent2D value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$currentExtent, LAYOUT$currentExtent.byteSize());
    }

    public VkExtent2D minImageExtent() {
        return new VkExtent2D(segment.asSlice(OFFSET$minImageExtent, LAYOUT$minImageExtent));
    }

    public void minImageExtent(VkExtent2D value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$minImageExtent, LAYOUT$minImageExtent.byteSize());
    }

    public VkExtent2D maxImageExtent() {
        return new VkExtent2D(segment.asSlice(OFFSET$maxImageExtent, LAYOUT$maxImageExtent));
    }

    public void maxImageExtent(VkExtent2D value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$maxImageExtent, LAYOUT$maxImageExtent.byteSize());
    }

    public @unsigned int maxImageArrayLayers() {
        return segment.get(LAYOUT$maxImageArrayLayers, OFFSET$maxImageArrayLayers);
    }

    public void maxImageArrayLayers(@unsigned int value) {
        segment.set(LAYOUT$maxImageArrayLayers, OFFSET$maxImageArrayLayers, value);
    }

    public @enumtype(VkSurfaceTransformFlagsKHR.class) int supportedTransforms() {
        return segment.get(LAYOUT$supportedTransforms, OFFSET$supportedTransforms);
    }

    public void supportedTransforms(@enumtype(VkSurfaceTransformFlagsKHR.class) int value) {
        segment.set(LAYOUT$supportedTransforms, OFFSET$supportedTransforms, value);
    }

    public @enumtype(VkSurfaceTransformFlagsKHR.class) int currentTransform() {
        return segment.get(LAYOUT$currentTransform, OFFSET$currentTransform);
    }

    public void currentTransform(@enumtype(VkSurfaceTransformFlagsKHR.class) int value) {
        segment.set(LAYOUT$currentTransform, OFFSET$currentTransform, value);
    }

    public @enumtype(VkCompositeAlphaFlagsKHR.class) int supportedCompositeAlpha() {
        return segment.get(LAYOUT$supportedCompositeAlpha, OFFSET$supportedCompositeAlpha);
    }

    public void supportedCompositeAlpha(@enumtype(VkCompositeAlphaFlagsKHR.class) int value) {
        segment.set(LAYOUT$supportedCompositeAlpha, OFFSET$supportedCompositeAlpha, value);
    }

    public @enumtype(VkImageUsageFlags.class) int supportedUsageFlags() {
        return segment.get(LAYOUT$supportedUsageFlags, OFFSET$supportedUsageFlags);
    }

    public void supportedUsageFlags(@enumtype(VkImageUsageFlags.class) int value) {
        segment.set(LAYOUT$supportedUsageFlags, OFFSET$supportedUsageFlags, value);
    }


    public static final class Factory implements IFactory<VkSurfaceCapabilitiesKHR> {
        @Override
        public Class<VkSurfaceCapabilitiesKHR> clazz() {
            return VkSurfaceCapabilitiesKHR.class;
        }

        @Override
        public MemoryLayout layout() {
            return VkSurfaceCapabilitiesKHR.LAYOUT;
        }

        @Override
        public VkSurfaceCapabilitiesKHR create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkSurfaceCapabilitiesKHR createUninit(MemorySegment segment) {
            return new VkSurfaceCapabilitiesKHR(segment);
        }
    }

    public static final Factory FACTORY = new Factory();
}
