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

public record VkPipelineMultisampleStateCreateInfo(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("rasterizationSamples"),
        ValueLayout.JAVA_INT.withName("sampleShadingEnable"),
        ValueLayout.JAVA_FLOAT.withName("minSampleShading"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT).withName("pSampleMask"),
        ValueLayout.JAVA_INT.withName("alphaToCoverageEnable"),
        ValueLayout.JAVA_INT.withName("alphaToOneEnable")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$flags = PathElement.groupElement("flags");
    public static final PathElement PATH$rasterizationSamples = PathElement.groupElement("rasterizationSamples");
    public static final PathElement PATH$sampleShadingEnable = PathElement.groupElement("sampleShadingEnable");
    public static final PathElement PATH$minSampleShading = PathElement.groupElement("minSampleShading");
    public static final PathElement PATH$pSampleMask = PathElement.groupElement("pSampleMask");
    public static final PathElement PATH$alphaToCoverageEnable = PathElement.groupElement("alphaToCoverageEnable");
    public static final PathElement PATH$alphaToOneEnable = PathElement.groupElement("alphaToOneEnable");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$flags = (OfInt) LAYOUT.select(PATH$flags);
    public static final OfInt LAYOUT$rasterizationSamples = (OfInt) LAYOUT.select(PATH$rasterizationSamples);
    public static final OfInt LAYOUT$sampleShadingEnable = (OfInt) LAYOUT.select(PATH$sampleShadingEnable);
    public static final OfFloat LAYOUT$minSampleShading = (OfFloat) LAYOUT.select(PATH$minSampleShading);
    public static final AddressLayout LAYOUT$pSampleMask = (AddressLayout) LAYOUT.select(PATH$pSampleMask);
    public static final OfInt LAYOUT$alphaToCoverageEnable = (OfInt) LAYOUT.select(PATH$alphaToCoverageEnable);
    public static final OfInt LAYOUT$alphaToOneEnable = (OfInt) LAYOUT.select(PATH$alphaToOneEnable);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$rasterizationSamples = LAYOUT.byteOffset(PATH$rasterizationSamples);
    public static final long OFFSET$sampleShadingEnable = LAYOUT.byteOffset(PATH$sampleShadingEnable);
    public static final long OFFSET$minSampleShading = LAYOUT.byteOffset(PATH$minSampleShading);
    public static final long OFFSET$pSampleMask = LAYOUT.byteOffset(PATH$pSampleMask);
    public static final long OFFSET$alphaToCoverageEnable = LAYOUT.byteOffset(PATH$alphaToCoverageEnable);
    public static final long OFFSET$alphaToOneEnable = LAYOUT.byteOffset(PATH$alphaToOneEnable);

    public VkPipelineMultisampleStateCreateInfo(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PIPELINE_MULTISAMPLE_STATE_CREATE_INFO);
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

    public @enumtype(VkPipelineMultisampleStateCreateFlags.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public void flags(@enumtype(VkPipelineMultisampleStateCreateFlags.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
    }

    public @enumtype(VkSampleCountFlags.class) int rasterizationSamples() {
        return segment.get(LAYOUT$rasterizationSamples, OFFSET$rasterizationSamples);
    }

    public void rasterizationSamples(@enumtype(VkSampleCountFlags.class) int value) {
        segment.set(LAYOUT$rasterizationSamples, OFFSET$rasterizationSamples, value);
    }

    public @unsigned int sampleShadingEnable() {
        return segment.get(LAYOUT$sampleShadingEnable, OFFSET$sampleShadingEnable);
    }

    public void sampleShadingEnable(@unsigned int value) {
        segment.set(LAYOUT$sampleShadingEnable, OFFSET$sampleShadingEnable, value);
    }

    public float minSampleShading() {
        return segment.get(LAYOUT$minSampleShading, OFFSET$minSampleShading);
    }

    public void minSampleShading(float value) {
        segment.set(LAYOUT$minSampleShading, OFFSET$minSampleShading, value);
    }

    public @pointer(comment="uint32_t*") MemorySegment pSampleMaskRaw() {
        return segment.get(LAYOUT$pSampleMask, OFFSET$pSampleMask);
    }

    public void pSampleMaskRaw(@pointer(comment="uint32_t*") MemorySegment value) {
        segment.set(LAYOUT$pSampleMask, OFFSET$pSampleMask, value);
    }
    
    public @unsigned IntPtr pSampleMask() {
        return new IntPtr(pSampleMaskRaw());
    }

    public void pSampleMask(@unsigned IntPtr value) {
        pSampleMaskRaw(value.segment());
    }

    public @unsigned int alphaToCoverageEnable() {
        return segment.get(LAYOUT$alphaToCoverageEnable, OFFSET$alphaToCoverageEnable);
    }

    public void alphaToCoverageEnable(@unsigned int value) {
        segment.set(LAYOUT$alphaToCoverageEnable, OFFSET$alphaToCoverageEnable, value);
    }

    public @unsigned int alphaToOneEnable() {
        return segment.get(LAYOUT$alphaToOneEnable, OFFSET$alphaToOneEnable);
    }

    public void alphaToOneEnable(@unsigned int value) {
        segment.set(LAYOUT$alphaToOneEnable, OFFSET$alphaToOneEnable, value);
    }


    public static final class VkPipelineMultisampleStateCreateInfoFactory implements IFactory<VkPipelineMultisampleStateCreateInfo> {
        @Override
        public Class<VkPipelineMultisampleStateCreateInfo> clazz() {
            return VkPipelineMultisampleStateCreateInfo.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkPipelineMultisampleStateCreateInfo.LAYOUT;
        }

        @Override
        public VkPipelineMultisampleStateCreateInfo create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkPipelineMultisampleStateCreateInfo createUninit(MemorySegment segment) {
            return new VkPipelineMultisampleStateCreateInfo(segment);
        }
    }

    public static final VkPipelineMultisampleStateCreateInfoFactory FACTORY = new VkPipelineMultisampleStateCreateInfoFactory();
}
