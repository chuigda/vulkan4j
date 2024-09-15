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

public record VkBufferCollectionPropertiesFUCHSIA(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("memoryTypeBits"),
        ValueLayout.JAVA_INT.withName("bufferCount"),
        ValueLayout.JAVA_INT.withName("createInfoIndex"),
        ValueLayout.JAVA_LONG.withName("sysmemPixelFormat"),
        ValueLayout.JAVA_INT.withName("formatFeatures"),
        VkSysmemColorSpaceFUCHSIA.LAYOUT.withName("sysmemColorSpaceIndex"),
        VkComponentMapping.LAYOUT.withName("samplerYcbcrConversionComponents"),
        ValueLayout.JAVA_INT.withName("suggestedYcbcrModel"),
        ValueLayout.JAVA_INT.withName("suggestedYcbcrRange"),
        ValueLayout.JAVA_INT.withName("suggestedXChromaOffset"),
        ValueLayout.JAVA_INT.withName("suggestedYChromaOffset")
    );

    public static final PathElement PATH$sType = PathElement.groupElement(0);
    public static final PathElement PATH$pNext = PathElement.groupElement(1);
    public static final PathElement PATH$memoryTypeBits = PathElement.groupElement(2);
    public static final PathElement PATH$bufferCount = PathElement.groupElement(3);
    public static final PathElement PATH$createInfoIndex = PathElement.groupElement(4);
    public static final PathElement PATH$sysmemPixelFormat = PathElement.groupElement(5);
    public static final PathElement PATH$formatFeatures = PathElement.groupElement(6);
    public static final PathElement PATH$sysmemColorSpaceIndex = PathElement.groupElement(7);
    public static final PathElement PATH$samplerYcbcrConversionComponents = PathElement.groupElement(8);
    public static final PathElement PATH$suggestedYcbcrModel = PathElement.groupElement(9);
    public static final PathElement PATH$suggestedYcbcrRange = PathElement.groupElement(10);
    public static final PathElement PATH$suggestedXChromaOffset = PathElement.groupElement(11);
    public static final PathElement PATH$suggestedYChromaOffset = PathElement.groupElement(12);

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$memoryTypeBits = (OfInt) LAYOUT.select(PATH$memoryTypeBits);
    public static final OfInt LAYOUT$bufferCount = (OfInt) LAYOUT.select(PATH$bufferCount);
    public static final OfInt LAYOUT$createInfoIndex = (OfInt) LAYOUT.select(PATH$createInfoIndex);
    public static final OfLong LAYOUT$sysmemPixelFormat = (OfLong) LAYOUT.select(PATH$sysmemPixelFormat);
    public static final OfInt LAYOUT$formatFeatures = (OfInt) LAYOUT.select(PATH$formatFeatures);
    public static final StructLayout LAYOUT$sysmemColorSpaceIndex = (StructLayout) LAYOUT.select(PATH$sysmemColorSpaceIndex);
    public static final StructLayout LAYOUT$samplerYcbcrConversionComponents = (StructLayout) LAYOUT.select(PATH$samplerYcbcrConversionComponents);
    public static final OfInt LAYOUT$suggestedYcbcrModel = (OfInt) LAYOUT.select(PATH$suggestedYcbcrModel);
    public static final OfInt LAYOUT$suggestedYcbcrRange = (OfInt) LAYOUT.select(PATH$suggestedYcbcrRange);
    public static final OfInt LAYOUT$suggestedXChromaOffset = (OfInt) LAYOUT.select(PATH$suggestedXChromaOffset);
    public static final OfInt LAYOUT$suggestedYChromaOffset = (OfInt) LAYOUT.select(PATH$suggestedYChromaOffset);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$memoryTypeBits = LAYOUT.byteOffset(PATH$memoryTypeBits);
    public static final long OFFSET$bufferCount = LAYOUT.byteOffset(PATH$bufferCount);
    public static final long OFFSET$createInfoIndex = LAYOUT.byteOffset(PATH$createInfoIndex);
    public static final long OFFSET$sysmemPixelFormat = LAYOUT.byteOffset(PATH$sysmemPixelFormat);
    public static final long OFFSET$formatFeatures = LAYOUT.byteOffset(PATH$formatFeatures);
    public static final long OFFSET$sysmemColorSpaceIndex = LAYOUT.byteOffset(PATH$sysmemColorSpaceIndex);
    public static final long OFFSET$samplerYcbcrConversionComponents = LAYOUT.byteOffset(PATH$samplerYcbcrConversionComponents);
    public static final long OFFSET$suggestedYcbcrModel = LAYOUT.byteOffset(PATH$suggestedYcbcrModel);
    public static final long OFFSET$suggestedYcbcrRange = LAYOUT.byteOffset(PATH$suggestedYcbcrRange);
    public static final long OFFSET$suggestedXChromaOffset = LAYOUT.byteOffset(PATH$suggestedXChromaOffset);
    public static final long OFFSET$suggestedYChromaOffset = LAYOUT.byteOffset(PATH$suggestedYChromaOffset);

    public VkBufferCollectionPropertiesFUCHSIA(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_BUFFER_COLLECTION_PROPERTIES_FUCHSIA);
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

    public @unsigned int memoryTypeBits() {
        return segment.get(LAYOUT$memoryTypeBits, OFFSET$memoryTypeBits);
    }

    public void memoryTypeBits(@unsigned int value) {
        segment.set(LAYOUT$memoryTypeBits, OFFSET$memoryTypeBits, value);
    }

    public @unsigned int bufferCount() {
        return segment.get(LAYOUT$bufferCount, OFFSET$bufferCount);
    }

    public void bufferCount(@unsigned int value) {
        segment.set(LAYOUT$bufferCount, OFFSET$bufferCount, value);
    }

    public @unsigned int createInfoIndex() {
        return segment.get(LAYOUT$createInfoIndex, OFFSET$createInfoIndex);
    }

    public void createInfoIndex(@unsigned int value) {
        segment.set(LAYOUT$createInfoIndex, OFFSET$createInfoIndex, value);
    }

    public @unsigned long sysmemPixelFormat() {
        return segment.get(LAYOUT$sysmemPixelFormat, OFFSET$sysmemPixelFormat);
    }

    public void sysmemPixelFormat(@unsigned long value) {
        segment.set(LAYOUT$sysmemPixelFormat, OFFSET$sysmemPixelFormat, value);
    }

    public @enumtype(VkFormatFeatureFlags.class) int formatFeatures() {
        return segment.get(LAYOUT$formatFeatures, OFFSET$formatFeatures);
    }

    public void formatFeatures(@enumtype(VkFormatFeatureFlags.class) int value) {
        segment.set(LAYOUT$formatFeatures, OFFSET$formatFeatures, value);
    }

    public VkSysmemColorSpaceFUCHSIA sysmemColorSpaceIndex() {
        return new VkSysmemColorSpaceFUCHSIA(segment.asSlice(OFFSET$sysmemColorSpaceIndex, LAYOUT$sysmemColorSpaceIndex));
    }

    public void sysmemColorSpaceIndex(VkSysmemColorSpaceFUCHSIA value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$sysmemColorSpaceIndex, LAYOUT$sysmemColorSpaceIndex.byteSize());
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


    public static final class VkBufferCollectionPropertiesFUCHSIAFactory implements IDataTypeFactory<VkBufferCollectionPropertiesFUCHSIA> {
        @Override
        public Class<VkBufferCollectionPropertiesFUCHSIA> clazz() {
            return VkBufferCollectionPropertiesFUCHSIA.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkBufferCollectionPropertiesFUCHSIA.LAYOUT;
        }

        @Override
        public VkBufferCollectionPropertiesFUCHSIA create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkBufferCollectionPropertiesFUCHSIA createUninit(MemorySegment segment) {
            return new VkBufferCollectionPropertiesFUCHSIA(segment);
        }
    }

    public static final VkBufferCollectionPropertiesFUCHSIAFactory FACTORY = new VkBufferCollectionPropertiesFUCHSIAFactory();
}
