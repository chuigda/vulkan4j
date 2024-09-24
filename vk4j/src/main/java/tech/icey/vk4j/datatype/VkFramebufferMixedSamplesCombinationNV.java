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

public record VkFramebufferMixedSamplesCombinationNV(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("coverageReductionMode"),
        ValueLayout.JAVA_INT.withName("rasterizationSamples"),
        ValueLayout.JAVA_INT.withName("depthStencilSamples"),
        ValueLayout.JAVA_INT.withName("colorSamples")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$coverageReductionMode = PathElement.groupElement("coverageReductionMode");
    public static final PathElement PATH$rasterizationSamples = PathElement.groupElement("rasterizationSamples");
    public static final PathElement PATH$depthStencilSamples = PathElement.groupElement("depthStencilSamples");
    public static final PathElement PATH$colorSamples = PathElement.groupElement("colorSamples");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$coverageReductionMode = (OfInt) LAYOUT.select(PATH$coverageReductionMode);
    public static final OfInt LAYOUT$rasterizationSamples = (OfInt) LAYOUT.select(PATH$rasterizationSamples);
    public static final OfInt LAYOUT$depthStencilSamples = (OfInt) LAYOUT.select(PATH$depthStencilSamples);
    public static final OfInt LAYOUT$colorSamples = (OfInt) LAYOUT.select(PATH$colorSamples);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$coverageReductionMode = LAYOUT.byteOffset(PATH$coverageReductionMode);
    public static final long OFFSET$rasterizationSamples = LAYOUT.byteOffset(PATH$rasterizationSamples);
    public static final long OFFSET$depthStencilSamples = LAYOUT.byteOffset(PATH$depthStencilSamples);
    public static final long OFFSET$colorSamples = LAYOUT.byteOffset(PATH$colorSamples);

    public VkFramebufferMixedSamplesCombinationNV(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_FRAMEBUFFER_MIXED_SAMPLES_COMBINATION_NV);
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

    public @enumtype(VkCoverageReductionModeNV.class) int coverageReductionMode() {
        return segment.get(LAYOUT$coverageReductionMode, OFFSET$coverageReductionMode);
    }

    public void coverageReductionMode(@enumtype(VkCoverageReductionModeNV.class) int value) {
        segment.set(LAYOUT$coverageReductionMode, OFFSET$coverageReductionMode, value);
    }

    public @enumtype(VkSampleCountFlags.class) int rasterizationSamples() {
        return segment.get(LAYOUT$rasterizationSamples, OFFSET$rasterizationSamples);
    }

    public void rasterizationSamples(@enumtype(VkSampleCountFlags.class) int value) {
        segment.set(LAYOUT$rasterizationSamples, OFFSET$rasterizationSamples, value);
    }

    public @enumtype(VkSampleCountFlags.class) int depthStencilSamples() {
        return segment.get(LAYOUT$depthStencilSamples, OFFSET$depthStencilSamples);
    }

    public void depthStencilSamples(@enumtype(VkSampleCountFlags.class) int value) {
        segment.set(LAYOUT$depthStencilSamples, OFFSET$depthStencilSamples, value);
    }

    public @enumtype(VkSampleCountFlags.class) int colorSamples() {
        return segment.get(LAYOUT$colorSamples, OFFSET$colorSamples);
    }

    public void colorSamples(@enumtype(VkSampleCountFlags.class) int value) {
        segment.set(LAYOUT$colorSamples, OFFSET$colorSamples, value);
    }


    public static final class VkFramebufferMixedSamplesCombinationNVFactory implements IFactory<VkFramebufferMixedSamplesCombinationNV> {
        @Override
        public Class<VkFramebufferMixedSamplesCombinationNV> clazz() {
            return VkFramebufferMixedSamplesCombinationNV.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkFramebufferMixedSamplesCombinationNV.LAYOUT;
        }

        @Override
        public VkFramebufferMixedSamplesCombinationNV create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkFramebufferMixedSamplesCombinationNV createUninit(MemorySegment segment) {
            return new VkFramebufferMixedSamplesCombinationNV(segment);
        }
    }

    public static final VkFramebufferMixedSamplesCombinationNVFactory FACTORY = new VkFramebufferMixedSamplesCombinationNVFactory();
}
