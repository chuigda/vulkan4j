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

public record VkPhysicalDeviceFragmentShadingRatePropertiesKHR(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        VkExtent2D.LAYOUT.withName("minFragmentShadingRateAttachmentTexelSize"),
        VkExtent2D.LAYOUT.withName("maxFragmentShadingRateAttachmentTexelSize"),
        ValueLayout.JAVA_INT.withName("maxFragmentShadingRateAttachmentTexelSizeAspectRatio"),
        ValueLayout.JAVA_INT.withName("primitiveFragmentShadingRateWithMultipleViewports"),
        ValueLayout.JAVA_INT.withName("layeredShadingRateAttachments"),
        ValueLayout.JAVA_INT.withName("fragmentShadingRateNonTrivialCombinerOps"),
        VkExtent2D.LAYOUT.withName("maxFragmentSize"),
        ValueLayout.JAVA_INT.withName("maxFragmentSizeAspectRatio"),
        ValueLayout.JAVA_INT.withName("maxFragmentShadingRateCoverageSamples"),
        ValueLayout.JAVA_INT.withName("maxFragmentShadingRateRasterizationSamples"),
        ValueLayout.JAVA_INT.withName("fragmentShadingRateWithShaderDepthStencilWrites"),
        ValueLayout.JAVA_INT.withName("fragmentShadingRateWithSampleMask"),
        ValueLayout.JAVA_INT.withName("fragmentShadingRateWithShaderSampleMask"),
        ValueLayout.JAVA_INT.withName("fragmentShadingRateWithConservativeRasterization"),
        ValueLayout.JAVA_INT.withName("fragmentShadingRateWithFragmentShaderInterlock"),
        ValueLayout.JAVA_INT.withName("fragmentShadingRateWithCustomSampleLocations"),
        ValueLayout.JAVA_INT.withName("fragmentShadingRateStrictMultiplyCombiner")
    );

    public static final PathElement PATH$sType = PathElement.groupElement(0);
    public static final PathElement PATH$pNext = PathElement.groupElement(1);
    public static final PathElement PATH$minFragmentShadingRateAttachmentTexelSize = PathElement.groupElement(2);
    public static final PathElement PATH$maxFragmentShadingRateAttachmentTexelSize = PathElement.groupElement(3);
    public static final PathElement PATH$maxFragmentShadingRateAttachmentTexelSizeAspectRatio = PathElement.groupElement(4);
    public static final PathElement PATH$primitiveFragmentShadingRateWithMultipleViewports = PathElement.groupElement(5);
    public static final PathElement PATH$layeredShadingRateAttachments = PathElement.groupElement(6);
    public static final PathElement PATH$fragmentShadingRateNonTrivialCombinerOps = PathElement.groupElement(7);
    public static final PathElement PATH$maxFragmentSize = PathElement.groupElement(8);
    public static final PathElement PATH$maxFragmentSizeAspectRatio = PathElement.groupElement(9);
    public static final PathElement PATH$maxFragmentShadingRateCoverageSamples = PathElement.groupElement(10);
    public static final PathElement PATH$maxFragmentShadingRateRasterizationSamples = PathElement.groupElement(11);
    public static final PathElement PATH$fragmentShadingRateWithShaderDepthStencilWrites = PathElement.groupElement(12);
    public static final PathElement PATH$fragmentShadingRateWithSampleMask = PathElement.groupElement(13);
    public static final PathElement PATH$fragmentShadingRateWithShaderSampleMask = PathElement.groupElement(14);
    public static final PathElement PATH$fragmentShadingRateWithConservativeRasterization = PathElement.groupElement(15);
    public static final PathElement PATH$fragmentShadingRateWithFragmentShaderInterlock = PathElement.groupElement(16);
    public static final PathElement PATH$fragmentShadingRateWithCustomSampleLocations = PathElement.groupElement(17);
    public static final PathElement PATH$fragmentShadingRateStrictMultiplyCombiner = PathElement.groupElement(18);

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final StructLayout LAYOUT$minFragmentShadingRateAttachmentTexelSize = (StructLayout) LAYOUT.select(PATH$minFragmentShadingRateAttachmentTexelSize);
    public static final StructLayout LAYOUT$maxFragmentShadingRateAttachmentTexelSize = (StructLayout) LAYOUT.select(PATH$maxFragmentShadingRateAttachmentTexelSize);
    public static final OfInt LAYOUT$maxFragmentShadingRateAttachmentTexelSizeAspectRatio = (OfInt) LAYOUT.select(PATH$maxFragmentShadingRateAttachmentTexelSizeAspectRatio);
    public static final OfInt LAYOUT$primitiveFragmentShadingRateWithMultipleViewports = (OfInt) LAYOUT.select(PATH$primitiveFragmentShadingRateWithMultipleViewports);
    public static final OfInt LAYOUT$layeredShadingRateAttachments = (OfInt) LAYOUT.select(PATH$layeredShadingRateAttachments);
    public static final OfInt LAYOUT$fragmentShadingRateNonTrivialCombinerOps = (OfInt) LAYOUT.select(PATH$fragmentShadingRateNonTrivialCombinerOps);
    public static final StructLayout LAYOUT$maxFragmentSize = (StructLayout) LAYOUT.select(PATH$maxFragmentSize);
    public static final OfInt LAYOUT$maxFragmentSizeAspectRatio = (OfInt) LAYOUT.select(PATH$maxFragmentSizeAspectRatio);
    public static final OfInt LAYOUT$maxFragmentShadingRateCoverageSamples = (OfInt) LAYOUT.select(PATH$maxFragmentShadingRateCoverageSamples);
    public static final OfInt LAYOUT$maxFragmentShadingRateRasterizationSamples = (OfInt) LAYOUT.select(PATH$maxFragmentShadingRateRasterizationSamples);
    public static final OfInt LAYOUT$fragmentShadingRateWithShaderDepthStencilWrites = (OfInt) LAYOUT.select(PATH$fragmentShadingRateWithShaderDepthStencilWrites);
    public static final OfInt LAYOUT$fragmentShadingRateWithSampleMask = (OfInt) LAYOUT.select(PATH$fragmentShadingRateWithSampleMask);
    public static final OfInt LAYOUT$fragmentShadingRateWithShaderSampleMask = (OfInt) LAYOUT.select(PATH$fragmentShadingRateWithShaderSampleMask);
    public static final OfInt LAYOUT$fragmentShadingRateWithConservativeRasterization = (OfInt) LAYOUT.select(PATH$fragmentShadingRateWithConservativeRasterization);
    public static final OfInt LAYOUT$fragmentShadingRateWithFragmentShaderInterlock = (OfInt) LAYOUT.select(PATH$fragmentShadingRateWithFragmentShaderInterlock);
    public static final OfInt LAYOUT$fragmentShadingRateWithCustomSampleLocations = (OfInt) LAYOUT.select(PATH$fragmentShadingRateWithCustomSampleLocations);
    public static final OfInt LAYOUT$fragmentShadingRateStrictMultiplyCombiner = (OfInt) LAYOUT.select(PATH$fragmentShadingRateStrictMultiplyCombiner);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$minFragmentShadingRateAttachmentTexelSize = LAYOUT.byteOffset(PATH$minFragmentShadingRateAttachmentTexelSize);
    public static final long OFFSET$maxFragmentShadingRateAttachmentTexelSize = LAYOUT.byteOffset(PATH$maxFragmentShadingRateAttachmentTexelSize);
    public static final long OFFSET$maxFragmentShadingRateAttachmentTexelSizeAspectRatio = LAYOUT.byteOffset(PATH$maxFragmentShadingRateAttachmentTexelSizeAspectRatio);
    public static final long OFFSET$primitiveFragmentShadingRateWithMultipleViewports = LAYOUT.byteOffset(PATH$primitiveFragmentShadingRateWithMultipleViewports);
    public static final long OFFSET$layeredShadingRateAttachments = LAYOUT.byteOffset(PATH$layeredShadingRateAttachments);
    public static final long OFFSET$fragmentShadingRateNonTrivialCombinerOps = LAYOUT.byteOffset(PATH$fragmentShadingRateNonTrivialCombinerOps);
    public static final long OFFSET$maxFragmentSize = LAYOUT.byteOffset(PATH$maxFragmentSize);
    public static final long OFFSET$maxFragmentSizeAspectRatio = LAYOUT.byteOffset(PATH$maxFragmentSizeAspectRatio);
    public static final long OFFSET$maxFragmentShadingRateCoverageSamples = LAYOUT.byteOffset(PATH$maxFragmentShadingRateCoverageSamples);
    public static final long OFFSET$maxFragmentShadingRateRasterizationSamples = LAYOUT.byteOffset(PATH$maxFragmentShadingRateRasterizationSamples);
    public static final long OFFSET$fragmentShadingRateWithShaderDepthStencilWrites = LAYOUT.byteOffset(PATH$fragmentShadingRateWithShaderDepthStencilWrites);
    public static final long OFFSET$fragmentShadingRateWithSampleMask = LAYOUT.byteOffset(PATH$fragmentShadingRateWithSampleMask);
    public static final long OFFSET$fragmentShadingRateWithShaderSampleMask = LAYOUT.byteOffset(PATH$fragmentShadingRateWithShaderSampleMask);
    public static final long OFFSET$fragmentShadingRateWithConservativeRasterization = LAYOUT.byteOffset(PATH$fragmentShadingRateWithConservativeRasterization);
    public static final long OFFSET$fragmentShadingRateWithFragmentShaderInterlock = LAYOUT.byteOffset(PATH$fragmentShadingRateWithFragmentShaderInterlock);
    public static final long OFFSET$fragmentShadingRateWithCustomSampleLocations = LAYOUT.byteOffset(PATH$fragmentShadingRateWithCustomSampleLocations);
    public static final long OFFSET$fragmentShadingRateStrictMultiplyCombiner = LAYOUT.byteOffset(PATH$fragmentShadingRateStrictMultiplyCombiner);

    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADING_RATE_PROPERTIES_KHR);
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

    public VkExtent2D minFragmentShadingRateAttachmentTexelSize() {
        return new VkExtent2D(segment.asSlice(OFFSET$minFragmentShadingRateAttachmentTexelSize, LAYOUT$minFragmentShadingRateAttachmentTexelSize));
    }

    public void minFragmentShadingRateAttachmentTexelSize(VkExtent2D value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$minFragmentShadingRateAttachmentTexelSize, LAYOUT$minFragmentShadingRateAttachmentTexelSize.byteSize());
    }

    public VkExtent2D maxFragmentShadingRateAttachmentTexelSize() {
        return new VkExtent2D(segment.asSlice(OFFSET$maxFragmentShadingRateAttachmentTexelSize, LAYOUT$maxFragmentShadingRateAttachmentTexelSize));
    }

    public void maxFragmentShadingRateAttachmentTexelSize(VkExtent2D value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$maxFragmentShadingRateAttachmentTexelSize, LAYOUT$maxFragmentShadingRateAttachmentTexelSize.byteSize());
    }

    public @unsigned int maxFragmentShadingRateAttachmentTexelSizeAspectRatio() {
        return segment.get(LAYOUT$maxFragmentShadingRateAttachmentTexelSizeAspectRatio, OFFSET$maxFragmentShadingRateAttachmentTexelSizeAspectRatio);
    }

    public void maxFragmentShadingRateAttachmentTexelSizeAspectRatio(@unsigned int value) {
        segment.set(LAYOUT$maxFragmentShadingRateAttachmentTexelSizeAspectRatio, OFFSET$maxFragmentShadingRateAttachmentTexelSizeAspectRatio, value);
    }

    public @unsigned int primitiveFragmentShadingRateWithMultipleViewports() {
        return segment.get(LAYOUT$primitiveFragmentShadingRateWithMultipleViewports, OFFSET$primitiveFragmentShadingRateWithMultipleViewports);
    }

    public void primitiveFragmentShadingRateWithMultipleViewports(@unsigned int value) {
        segment.set(LAYOUT$primitiveFragmentShadingRateWithMultipleViewports, OFFSET$primitiveFragmentShadingRateWithMultipleViewports, value);
    }

    public @unsigned int layeredShadingRateAttachments() {
        return segment.get(LAYOUT$layeredShadingRateAttachments, OFFSET$layeredShadingRateAttachments);
    }

    public void layeredShadingRateAttachments(@unsigned int value) {
        segment.set(LAYOUT$layeredShadingRateAttachments, OFFSET$layeredShadingRateAttachments, value);
    }

    public @unsigned int fragmentShadingRateNonTrivialCombinerOps() {
        return segment.get(LAYOUT$fragmentShadingRateNonTrivialCombinerOps, OFFSET$fragmentShadingRateNonTrivialCombinerOps);
    }

    public void fragmentShadingRateNonTrivialCombinerOps(@unsigned int value) {
        segment.set(LAYOUT$fragmentShadingRateNonTrivialCombinerOps, OFFSET$fragmentShadingRateNonTrivialCombinerOps, value);
    }

    public VkExtent2D maxFragmentSize() {
        return new VkExtent2D(segment.asSlice(OFFSET$maxFragmentSize, LAYOUT$maxFragmentSize));
    }

    public void maxFragmentSize(VkExtent2D value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$maxFragmentSize, LAYOUT$maxFragmentSize.byteSize());
    }

    public @unsigned int maxFragmentSizeAspectRatio() {
        return segment.get(LAYOUT$maxFragmentSizeAspectRatio, OFFSET$maxFragmentSizeAspectRatio);
    }

    public void maxFragmentSizeAspectRatio(@unsigned int value) {
        segment.set(LAYOUT$maxFragmentSizeAspectRatio, OFFSET$maxFragmentSizeAspectRatio, value);
    }

    public @unsigned int maxFragmentShadingRateCoverageSamples() {
        return segment.get(LAYOUT$maxFragmentShadingRateCoverageSamples, OFFSET$maxFragmentShadingRateCoverageSamples);
    }

    public void maxFragmentShadingRateCoverageSamples(@unsigned int value) {
        segment.set(LAYOUT$maxFragmentShadingRateCoverageSamples, OFFSET$maxFragmentShadingRateCoverageSamples, value);
    }

    public @enumtype(VkSampleCountFlags.class) int maxFragmentShadingRateRasterizationSamples() {
        return segment.get(LAYOUT$maxFragmentShadingRateRasterizationSamples, OFFSET$maxFragmentShadingRateRasterizationSamples);
    }

    public void maxFragmentShadingRateRasterizationSamples(@enumtype(VkSampleCountFlags.class) int value) {
        segment.set(LAYOUT$maxFragmentShadingRateRasterizationSamples, OFFSET$maxFragmentShadingRateRasterizationSamples, value);
    }

    public @unsigned int fragmentShadingRateWithShaderDepthStencilWrites() {
        return segment.get(LAYOUT$fragmentShadingRateWithShaderDepthStencilWrites, OFFSET$fragmentShadingRateWithShaderDepthStencilWrites);
    }

    public void fragmentShadingRateWithShaderDepthStencilWrites(@unsigned int value) {
        segment.set(LAYOUT$fragmentShadingRateWithShaderDepthStencilWrites, OFFSET$fragmentShadingRateWithShaderDepthStencilWrites, value);
    }

    public @unsigned int fragmentShadingRateWithSampleMask() {
        return segment.get(LAYOUT$fragmentShadingRateWithSampleMask, OFFSET$fragmentShadingRateWithSampleMask);
    }

    public void fragmentShadingRateWithSampleMask(@unsigned int value) {
        segment.set(LAYOUT$fragmentShadingRateWithSampleMask, OFFSET$fragmentShadingRateWithSampleMask, value);
    }

    public @unsigned int fragmentShadingRateWithShaderSampleMask() {
        return segment.get(LAYOUT$fragmentShadingRateWithShaderSampleMask, OFFSET$fragmentShadingRateWithShaderSampleMask);
    }

    public void fragmentShadingRateWithShaderSampleMask(@unsigned int value) {
        segment.set(LAYOUT$fragmentShadingRateWithShaderSampleMask, OFFSET$fragmentShadingRateWithShaderSampleMask, value);
    }

    public @unsigned int fragmentShadingRateWithConservativeRasterization() {
        return segment.get(LAYOUT$fragmentShadingRateWithConservativeRasterization, OFFSET$fragmentShadingRateWithConservativeRasterization);
    }

    public void fragmentShadingRateWithConservativeRasterization(@unsigned int value) {
        segment.set(LAYOUT$fragmentShadingRateWithConservativeRasterization, OFFSET$fragmentShadingRateWithConservativeRasterization, value);
    }

    public @unsigned int fragmentShadingRateWithFragmentShaderInterlock() {
        return segment.get(LAYOUT$fragmentShadingRateWithFragmentShaderInterlock, OFFSET$fragmentShadingRateWithFragmentShaderInterlock);
    }

    public void fragmentShadingRateWithFragmentShaderInterlock(@unsigned int value) {
        segment.set(LAYOUT$fragmentShadingRateWithFragmentShaderInterlock, OFFSET$fragmentShadingRateWithFragmentShaderInterlock, value);
    }

    public @unsigned int fragmentShadingRateWithCustomSampleLocations() {
        return segment.get(LAYOUT$fragmentShadingRateWithCustomSampleLocations, OFFSET$fragmentShadingRateWithCustomSampleLocations);
    }

    public void fragmentShadingRateWithCustomSampleLocations(@unsigned int value) {
        segment.set(LAYOUT$fragmentShadingRateWithCustomSampleLocations, OFFSET$fragmentShadingRateWithCustomSampleLocations, value);
    }

    public @unsigned int fragmentShadingRateStrictMultiplyCombiner() {
        return segment.get(LAYOUT$fragmentShadingRateStrictMultiplyCombiner, OFFSET$fragmentShadingRateStrictMultiplyCombiner);
    }

    public void fragmentShadingRateStrictMultiplyCombiner(@unsigned int value) {
        segment.set(LAYOUT$fragmentShadingRateStrictMultiplyCombiner, OFFSET$fragmentShadingRateStrictMultiplyCombiner, value);
    }


    public static final class VkPhysicalDeviceFragmentShadingRatePropertiesKHRFactory implements IDataTypeFactory<VkPhysicalDeviceFragmentShadingRatePropertiesKHR> {
        @Override
        public Class<VkPhysicalDeviceFragmentShadingRatePropertiesKHR> clazz() {
            return VkPhysicalDeviceFragmentShadingRatePropertiesKHR.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkPhysicalDeviceFragmentShadingRatePropertiesKHR.LAYOUT;
        }

        @Override
        public VkPhysicalDeviceFragmentShadingRatePropertiesKHR create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkPhysicalDeviceFragmentShadingRatePropertiesKHR createUninit(MemorySegment segment) {
            return new VkPhysicalDeviceFragmentShadingRatePropertiesKHR(segment);
        }
    }

    public static final VkPhysicalDeviceFragmentShadingRatePropertiesKHRFactory FACTORY = new VkPhysicalDeviceFragmentShadingRatePropertiesKHRFactory();
}