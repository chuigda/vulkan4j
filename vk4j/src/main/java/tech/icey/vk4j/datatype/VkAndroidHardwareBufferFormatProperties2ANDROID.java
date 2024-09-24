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

public record VkAndroidHardwareBufferFormatProperties2ANDROID(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("format"),
        ValueLayout.JAVA_LONG.withName("externalFormat"),
        ValueLayout.JAVA_INT.withName("formatFeatures"),
        VkComponentMapping.LAYOUT.withName("samplerYcbcrConversionComponents"),
        ValueLayout.JAVA_INT.withName("suggestedYcbcrModel"),
        ValueLayout.JAVA_INT.withName("suggestedYcbcrRange"),
        ValueLayout.JAVA_INT.withName("suggestedXChromaOffset"),
        ValueLayout.JAVA_INT.withName("suggestedYChromaOffset")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$format = PathElement.groupElement("format");
    public static final PathElement PATH$externalFormat = PathElement.groupElement("externalFormat");
    public static final PathElement PATH$formatFeatures = PathElement.groupElement("formatFeatures");
    public static final PathElement PATH$samplerYcbcrConversionComponents = PathElement.groupElement("samplerYcbcrConversionComponents");
    public static final PathElement PATH$suggestedYcbcrModel = PathElement.groupElement("suggestedYcbcrModel");
    public static final PathElement PATH$suggestedYcbcrRange = PathElement.groupElement("suggestedYcbcrRange");
    public static final PathElement PATH$suggestedXChromaOffset = PathElement.groupElement("suggestedXChromaOffset");
    public static final PathElement PATH$suggestedYChromaOffset = PathElement.groupElement("suggestedYChromaOffset");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$format = (OfInt) LAYOUT.select(PATH$format);
    public static final OfLong LAYOUT$externalFormat = (OfLong) LAYOUT.select(PATH$externalFormat);
    public static final OfInt LAYOUT$formatFeatures = (OfInt) LAYOUT.select(PATH$formatFeatures);
    public static final StructLayout LAYOUT$samplerYcbcrConversionComponents = (StructLayout) LAYOUT.select(PATH$samplerYcbcrConversionComponents);
    public static final OfInt LAYOUT$suggestedYcbcrModel = (OfInt) LAYOUT.select(PATH$suggestedYcbcrModel);
    public static final OfInt LAYOUT$suggestedYcbcrRange = (OfInt) LAYOUT.select(PATH$suggestedYcbcrRange);
    public static final OfInt LAYOUT$suggestedXChromaOffset = (OfInt) LAYOUT.select(PATH$suggestedXChromaOffset);
    public static final OfInt LAYOUT$suggestedYChromaOffset = (OfInt) LAYOUT.select(PATH$suggestedYChromaOffset);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$format = LAYOUT.byteOffset(PATH$format);
    public static final long OFFSET$externalFormat = LAYOUT.byteOffset(PATH$externalFormat);
    public static final long OFFSET$formatFeatures = LAYOUT.byteOffset(PATH$formatFeatures);
    public static final long OFFSET$samplerYcbcrConversionComponents = LAYOUT.byteOffset(PATH$samplerYcbcrConversionComponents);
    public static final long OFFSET$suggestedYcbcrModel = LAYOUT.byteOffset(PATH$suggestedYcbcrModel);
    public static final long OFFSET$suggestedYcbcrRange = LAYOUT.byteOffset(PATH$suggestedYcbcrRange);
    public static final long OFFSET$suggestedXChromaOffset = LAYOUT.byteOffset(PATH$suggestedXChromaOffset);
    public static final long OFFSET$suggestedYChromaOffset = LAYOUT.byteOffset(PATH$suggestedYChromaOffset);

    public VkAndroidHardwareBufferFormatProperties2ANDROID(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_ANDROID_HARDWARE_BUFFER_FORMAT_PROPERTIES_2_ANDROID);
    }

    public @enumtype(VkStructureType.class) int sType() {
        return segment.get(LAYOUT$sType, OFFSET$sType);
    }

    public void sType(@enumtype(VkStructureType.class) int value) {
        segment.set(LAYOUT$sType, OFFSET$sType, value);
    }

    public @pointer(comment="void*") MemorySegment pNext() {
        return segment.get(LAYOUT$pNext, OFFSET$pNext);
    }

    public void pNext(@pointer(comment="void*") MemorySegment value) {
        segment.set(LAYOUT$pNext, OFFSET$pNext, value);
    }

    public @enumtype(VkFormat.class) int format() {
        return segment.get(LAYOUT$format, OFFSET$format);
    }

    public void format(@enumtype(VkFormat.class) int value) {
        segment.set(LAYOUT$format, OFFSET$format, value);
    }

    public @unsigned long externalFormat() {
        return segment.get(LAYOUT$externalFormat, OFFSET$externalFormat);
    }

    public void externalFormat(@unsigned long value) {
        segment.set(LAYOUT$externalFormat, OFFSET$externalFormat, value);
    }

    public @enumtype(VkFormatFeatureFlags2.class) int formatFeatures() {
        return segment.get(LAYOUT$formatFeatures, OFFSET$formatFeatures);
    }

    public void formatFeatures(@enumtype(VkFormatFeatureFlags2.class) int value) {
        segment.set(LAYOUT$formatFeatures, OFFSET$formatFeatures, value);
    }

    public VkComponentMapping samplerYcbcrConversionComponents() {
        return new VkComponentMapping(segment.asSlice(OFFSET$samplerYcbcrConversionComponents, LAYOUT$samplerYcbcrConversionComponents));
    }

    public void samplerYcbcrConversionComponents(VkComponentMapping value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$samplerYcbcrConversionComponents, LAYOUT$samplerYcbcrConversionComponents.byteSize());
    }

    public @enumtype(VkSamplerYcbcrModelConversion.class) int suggestedYcbcrModel() {
        return segment.get(LAYOUT$suggestedYcbcrModel, OFFSET$suggestedYcbcrModel);
    }

    public void suggestedYcbcrModel(@enumtype(VkSamplerYcbcrModelConversion.class) int value) {
        segment.set(LAYOUT$suggestedYcbcrModel, OFFSET$suggestedYcbcrModel, value);
    }

    public @enumtype(VkSamplerYcbcrRange.class) int suggestedYcbcrRange() {
        return segment.get(LAYOUT$suggestedYcbcrRange, OFFSET$suggestedYcbcrRange);
    }

    public void suggestedYcbcrRange(@enumtype(VkSamplerYcbcrRange.class) int value) {
        segment.set(LAYOUT$suggestedYcbcrRange, OFFSET$suggestedYcbcrRange, value);
    }

    public @enumtype(VkChromaLocation.class) int suggestedXChromaOffset() {
        return segment.get(LAYOUT$suggestedXChromaOffset, OFFSET$suggestedXChromaOffset);
    }

    public void suggestedXChromaOffset(@enumtype(VkChromaLocation.class) int value) {
        segment.set(LAYOUT$suggestedXChromaOffset, OFFSET$suggestedXChromaOffset, value);
    }

    public @enumtype(VkChromaLocation.class) int suggestedYChromaOffset() {
        return segment.get(LAYOUT$suggestedYChromaOffset, OFFSET$suggestedYChromaOffset);
    }

    public void suggestedYChromaOffset(@enumtype(VkChromaLocation.class) int value) {
        segment.set(LAYOUT$suggestedYChromaOffset, OFFSET$suggestedYChromaOffset, value);
    }


    public static final class VkAndroidHardwareBufferFormatProperties2ANDROIDFactory implements IFactory<VkAndroidHardwareBufferFormatProperties2ANDROID> {
        @Override
        public Class<VkAndroidHardwareBufferFormatProperties2ANDROID> clazz() {
            return VkAndroidHardwareBufferFormatProperties2ANDROID.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkAndroidHardwareBufferFormatProperties2ANDROID.LAYOUT;
        }

        @Override
        public VkAndroidHardwareBufferFormatProperties2ANDROID create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkAndroidHardwareBufferFormatProperties2ANDROID createUninit(MemorySegment segment) {
            return new VkAndroidHardwareBufferFormatProperties2ANDROID(segment);
        }
    }

    public static final VkAndroidHardwareBufferFormatProperties2ANDROIDFactory FACTORY = new VkAndroidHardwareBufferFormatProperties2ANDROIDFactory();
}
