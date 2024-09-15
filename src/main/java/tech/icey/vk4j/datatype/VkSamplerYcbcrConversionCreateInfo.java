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

public record VkSamplerYcbcrConversionCreateInfo(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("format"),
        ValueLayout.JAVA_INT.withName("ycbcrModel"),
        ValueLayout.JAVA_INT.withName("ycbcrRange"),
        VkComponentMapping.LAYOUT.withName("components"),
        ValueLayout.JAVA_INT.withName("xChromaOffset"),
        ValueLayout.JAVA_INT.withName("yChromaOffset"),
        ValueLayout.JAVA_INT.withName("chromaFilter"),
        ValueLayout.JAVA_INT.withName("forceExplicitReconstruction")
    );

    public static final PathElement PATH$sType = PathElement.groupElement(0);
    public static final PathElement PATH$pNext = PathElement.groupElement(1);
    public static final PathElement PATH$format = PathElement.groupElement(2);
    public static final PathElement PATH$ycbcrModel = PathElement.groupElement(3);
    public static final PathElement PATH$ycbcrRange = PathElement.groupElement(4);
    public static final PathElement PATH$components = PathElement.groupElement(5);
    public static final PathElement PATH$xChromaOffset = PathElement.groupElement(6);
    public static final PathElement PATH$yChromaOffset = PathElement.groupElement(7);
    public static final PathElement PATH$chromaFilter = PathElement.groupElement(8);
    public static final PathElement PATH$forceExplicitReconstruction = PathElement.groupElement(9);

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$format = (OfInt) LAYOUT.select(PATH$format);
    public static final OfInt LAYOUT$ycbcrModel = (OfInt) LAYOUT.select(PATH$ycbcrModel);
    public static final OfInt LAYOUT$ycbcrRange = (OfInt) LAYOUT.select(PATH$ycbcrRange);
    public static final StructLayout LAYOUT$components = (StructLayout) LAYOUT.select(PATH$components);
    public static final OfInt LAYOUT$xChromaOffset = (OfInt) LAYOUT.select(PATH$xChromaOffset);
    public static final OfInt LAYOUT$yChromaOffset = (OfInt) LAYOUT.select(PATH$yChromaOffset);
    public static final OfInt LAYOUT$chromaFilter = (OfInt) LAYOUT.select(PATH$chromaFilter);
    public static final OfInt LAYOUT$forceExplicitReconstruction = (OfInt) LAYOUT.select(PATH$forceExplicitReconstruction);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$format = LAYOUT.byteOffset(PATH$format);
    public static final long OFFSET$ycbcrModel = LAYOUT.byteOffset(PATH$ycbcrModel);
    public static final long OFFSET$ycbcrRange = LAYOUT.byteOffset(PATH$ycbcrRange);
    public static final long OFFSET$components = LAYOUT.byteOffset(PATH$components);
    public static final long OFFSET$xChromaOffset = LAYOUT.byteOffset(PATH$xChromaOffset);
    public static final long OFFSET$yChromaOffset = LAYOUT.byteOffset(PATH$yChromaOffset);
    public static final long OFFSET$chromaFilter = LAYOUT.byteOffset(PATH$chromaFilter);
    public static final long OFFSET$forceExplicitReconstruction = LAYOUT.byteOffset(PATH$forceExplicitReconstruction);

    public VkSamplerYcbcrConversionCreateInfo(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_SAMPLER_YCBCR_CONVERSION_CREATE_INFO);
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

    public @enumtype(VkSamplerYcbcrModelConversion.class) int ycbcrModel() {
        return segment.get(LAYOUT$ycbcrModel, OFFSET$ycbcrModel);
    }

    public void ycbcrModel(@enumtype(VkSamplerYcbcrModelConversion.class) int value) {
        segment.set(LAYOUT$ycbcrModel, OFFSET$ycbcrModel, value);
    }

    public @enumtype(VkSamplerYcbcrRange.class) int ycbcrRange() {
        return segment.get(LAYOUT$ycbcrRange, OFFSET$ycbcrRange);
    }

    public void ycbcrRange(@enumtype(VkSamplerYcbcrRange.class) int value) {
        segment.set(LAYOUT$ycbcrRange, OFFSET$ycbcrRange, value);
    }

    public VkComponentMapping components() {
        return new VkComponentMapping(segment.asSlice(OFFSET$components, LAYOUT$components));
    }

    public void components(VkComponentMapping value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$components, LAYOUT$components.byteSize());
    }

    public @enumtype(VkChromaLocation.class) int xChromaOffset() {
        return segment.get(LAYOUT$xChromaOffset, OFFSET$xChromaOffset);
    }

    public void xChromaOffset(@enumtype(VkChromaLocation.class) int value) {
        segment.set(LAYOUT$xChromaOffset, OFFSET$xChromaOffset, value);
    }

    public @enumtype(VkChromaLocation.class) int yChromaOffset() {
        return segment.get(LAYOUT$yChromaOffset, OFFSET$yChromaOffset);
    }

    public void yChromaOffset(@enumtype(VkChromaLocation.class) int value) {
        segment.set(LAYOUT$yChromaOffset, OFFSET$yChromaOffset, value);
    }

    public @enumtype(VkFilter.class) int chromaFilter() {
        return segment.get(LAYOUT$chromaFilter, OFFSET$chromaFilter);
    }

    public void chromaFilter(@enumtype(VkFilter.class) int value) {
        segment.set(LAYOUT$chromaFilter, OFFSET$chromaFilter, value);
    }

    public @unsigned int forceExplicitReconstruction() {
        return segment.get(LAYOUT$forceExplicitReconstruction, OFFSET$forceExplicitReconstruction);
    }

    public void forceExplicitReconstruction(@unsigned int value) {
        segment.set(LAYOUT$forceExplicitReconstruction, OFFSET$forceExplicitReconstruction, value);
    }


    public static final class VkSamplerYcbcrConversionCreateInfoFactory implements IDataTypeFactory<VkSamplerYcbcrConversionCreateInfo> {
        @Override
        public Class<VkSamplerYcbcrConversionCreateInfo> clazz() {
            return VkSamplerYcbcrConversionCreateInfo.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkSamplerYcbcrConversionCreateInfo.LAYOUT;
        }

        @Override
        public VkSamplerYcbcrConversionCreateInfo create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkSamplerYcbcrConversionCreateInfo createUninit(MemorySegment segment) {
            return new VkSamplerYcbcrConversionCreateInfo(segment);
        }
    }

    public static final VkSamplerYcbcrConversionCreateInfoFactory FACTORY = new VkSamplerYcbcrConversionCreateInfoFactory();
}
