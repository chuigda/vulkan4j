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

public record VkPhysicalDevicePortabilitySubsetFeaturesKHR(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("constantAlphaColorBlendFactors"),
        ValueLayout.JAVA_INT.withName("events"),
        ValueLayout.JAVA_INT.withName("imageViewFormatReinterpretation"),
        ValueLayout.JAVA_INT.withName("imageViewFormatSwizzle"),
        ValueLayout.JAVA_INT.withName("imageView2DOn3DImage"),
        ValueLayout.JAVA_INT.withName("multisampleArrayImage"),
        ValueLayout.JAVA_INT.withName("mutableComparisonSamplers"),
        ValueLayout.JAVA_INT.withName("pointPolygons"),
        ValueLayout.JAVA_INT.withName("samplerMipLodBias"),
        ValueLayout.JAVA_INT.withName("separateStencilMaskRef"),
        ValueLayout.JAVA_INT.withName("shaderSampleRateInterpolationFunctions"),
        ValueLayout.JAVA_INT.withName("tessellationIsolines"),
        ValueLayout.JAVA_INT.withName("tessellationPointMode"),
        ValueLayout.JAVA_INT.withName("triangleFans"),
        ValueLayout.JAVA_INT.withName("vertexAttributeAccessBeyondStride")
    );

    public static final PathElement PATH$sType = PathElement.groupElement(0);
    public static final PathElement PATH$pNext = PathElement.groupElement(1);
    public static final PathElement PATH$constantAlphaColorBlendFactors = PathElement.groupElement(2);
    public static final PathElement PATH$events = PathElement.groupElement(3);
    public static final PathElement PATH$imageViewFormatReinterpretation = PathElement.groupElement(4);
    public static final PathElement PATH$imageViewFormatSwizzle = PathElement.groupElement(5);
    public static final PathElement PATH$imageView2DOn3DImage = PathElement.groupElement(6);
    public static final PathElement PATH$multisampleArrayImage = PathElement.groupElement(7);
    public static final PathElement PATH$mutableComparisonSamplers = PathElement.groupElement(8);
    public static final PathElement PATH$pointPolygons = PathElement.groupElement(9);
    public static final PathElement PATH$samplerMipLodBias = PathElement.groupElement(10);
    public static final PathElement PATH$separateStencilMaskRef = PathElement.groupElement(11);
    public static final PathElement PATH$shaderSampleRateInterpolationFunctions = PathElement.groupElement(12);
    public static final PathElement PATH$tessellationIsolines = PathElement.groupElement(13);
    public static final PathElement PATH$tessellationPointMode = PathElement.groupElement(14);
    public static final PathElement PATH$triangleFans = PathElement.groupElement(15);
    public static final PathElement PATH$vertexAttributeAccessBeyondStride = PathElement.groupElement(16);

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$constantAlphaColorBlendFactors = (OfInt) LAYOUT.select(PATH$constantAlphaColorBlendFactors);
    public static final OfInt LAYOUT$events = (OfInt) LAYOUT.select(PATH$events);
    public static final OfInt LAYOUT$imageViewFormatReinterpretation = (OfInt) LAYOUT.select(PATH$imageViewFormatReinterpretation);
    public static final OfInt LAYOUT$imageViewFormatSwizzle = (OfInt) LAYOUT.select(PATH$imageViewFormatSwizzle);
    public static final OfInt LAYOUT$imageView2DOn3DImage = (OfInt) LAYOUT.select(PATH$imageView2DOn3DImage);
    public static final OfInt LAYOUT$multisampleArrayImage = (OfInt) LAYOUT.select(PATH$multisampleArrayImage);
    public static final OfInt LAYOUT$mutableComparisonSamplers = (OfInt) LAYOUT.select(PATH$mutableComparisonSamplers);
    public static final OfInt LAYOUT$pointPolygons = (OfInt) LAYOUT.select(PATH$pointPolygons);
    public static final OfInt LAYOUT$samplerMipLodBias = (OfInt) LAYOUT.select(PATH$samplerMipLodBias);
    public static final OfInt LAYOUT$separateStencilMaskRef = (OfInt) LAYOUT.select(PATH$separateStencilMaskRef);
    public static final OfInt LAYOUT$shaderSampleRateInterpolationFunctions = (OfInt) LAYOUT.select(PATH$shaderSampleRateInterpolationFunctions);
    public static final OfInt LAYOUT$tessellationIsolines = (OfInt) LAYOUT.select(PATH$tessellationIsolines);
    public static final OfInt LAYOUT$tessellationPointMode = (OfInt) LAYOUT.select(PATH$tessellationPointMode);
    public static final OfInt LAYOUT$triangleFans = (OfInt) LAYOUT.select(PATH$triangleFans);
    public static final OfInt LAYOUT$vertexAttributeAccessBeyondStride = (OfInt) LAYOUT.select(PATH$vertexAttributeAccessBeyondStride);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$constantAlphaColorBlendFactors = LAYOUT.byteOffset(PATH$constantAlphaColorBlendFactors);
    public static final long OFFSET$events = LAYOUT.byteOffset(PATH$events);
    public static final long OFFSET$imageViewFormatReinterpretation = LAYOUT.byteOffset(PATH$imageViewFormatReinterpretation);
    public static final long OFFSET$imageViewFormatSwizzle = LAYOUT.byteOffset(PATH$imageViewFormatSwizzle);
    public static final long OFFSET$imageView2DOn3DImage = LAYOUT.byteOffset(PATH$imageView2DOn3DImage);
    public static final long OFFSET$multisampleArrayImage = LAYOUT.byteOffset(PATH$multisampleArrayImage);
    public static final long OFFSET$mutableComparisonSamplers = LAYOUT.byteOffset(PATH$mutableComparisonSamplers);
    public static final long OFFSET$pointPolygons = LAYOUT.byteOffset(PATH$pointPolygons);
    public static final long OFFSET$samplerMipLodBias = LAYOUT.byteOffset(PATH$samplerMipLodBias);
    public static final long OFFSET$separateStencilMaskRef = LAYOUT.byteOffset(PATH$separateStencilMaskRef);
    public static final long OFFSET$shaderSampleRateInterpolationFunctions = LAYOUT.byteOffset(PATH$shaderSampleRateInterpolationFunctions);
    public static final long OFFSET$tessellationIsolines = LAYOUT.byteOffset(PATH$tessellationIsolines);
    public static final long OFFSET$tessellationPointMode = LAYOUT.byteOffset(PATH$tessellationPointMode);
    public static final long OFFSET$triangleFans = LAYOUT.byteOffset(PATH$triangleFans);
    public static final long OFFSET$vertexAttributeAccessBeyondStride = LAYOUT.byteOffset(PATH$vertexAttributeAccessBeyondStride);

    public VkPhysicalDevicePortabilitySubsetFeaturesKHR(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PORTABILITY_SUBSET_FEATURES_KHR);
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

    public @unsigned int constantAlphaColorBlendFactors() {
        return segment.get(LAYOUT$constantAlphaColorBlendFactors, OFFSET$constantAlphaColorBlendFactors);
    }

    public void constantAlphaColorBlendFactors(@unsigned int value) {
        segment.set(LAYOUT$constantAlphaColorBlendFactors, OFFSET$constantAlphaColorBlendFactors, value);
    }

    public @unsigned int events() {
        return segment.get(LAYOUT$events, OFFSET$events);
    }

    public void events(@unsigned int value) {
        segment.set(LAYOUT$events, OFFSET$events, value);
    }

    public @unsigned int imageViewFormatReinterpretation() {
        return segment.get(LAYOUT$imageViewFormatReinterpretation, OFFSET$imageViewFormatReinterpretation);
    }

    public void imageViewFormatReinterpretation(@unsigned int value) {
        segment.set(LAYOUT$imageViewFormatReinterpretation, OFFSET$imageViewFormatReinterpretation, value);
    }

    public @unsigned int imageViewFormatSwizzle() {
        return segment.get(LAYOUT$imageViewFormatSwizzle, OFFSET$imageViewFormatSwizzle);
    }

    public void imageViewFormatSwizzle(@unsigned int value) {
        segment.set(LAYOUT$imageViewFormatSwizzle, OFFSET$imageViewFormatSwizzle, value);
    }

    public @unsigned int imageView2DOn3DImage() {
        return segment.get(LAYOUT$imageView2DOn3DImage, OFFSET$imageView2DOn3DImage);
    }

    public void imageView2DOn3DImage(@unsigned int value) {
        segment.set(LAYOUT$imageView2DOn3DImage, OFFSET$imageView2DOn3DImage, value);
    }

    public @unsigned int multisampleArrayImage() {
        return segment.get(LAYOUT$multisampleArrayImage, OFFSET$multisampleArrayImage);
    }

    public void multisampleArrayImage(@unsigned int value) {
        segment.set(LAYOUT$multisampleArrayImage, OFFSET$multisampleArrayImage, value);
    }

    public @unsigned int mutableComparisonSamplers() {
        return segment.get(LAYOUT$mutableComparisonSamplers, OFFSET$mutableComparisonSamplers);
    }

    public void mutableComparisonSamplers(@unsigned int value) {
        segment.set(LAYOUT$mutableComparisonSamplers, OFFSET$mutableComparisonSamplers, value);
    }

    public @unsigned int pointPolygons() {
        return segment.get(LAYOUT$pointPolygons, OFFSET$pointPolygons);
    }

    public void pointPolygons(@unsigned int value) {
        segment.set(LAYOUT$pointPolygons, OFFSET$pointPolygons, value);
    }

    public @unsigned int samplerMipLodBias() {
        return segment.get(LAYOUT$samplerMipLodBias, OFFSET$samplerMipLodBias);
    }

    public void samplerMipLodBias(@unsigned int value) {
        segment.set(LAYOUT$samplerMipLodBias, OFFSET$samplerMipLodBias, value);
    }

    public @unsigned int separateStencilMaskRef() {
        return segment.get(LAYOUT$separateStencilMaskRef, OFFSET$separateStencilMaskRef);
    }

    public void separateStencilMaskRef(@unsigned int value) {
        segment.set(LAYOUT$separateStencilMaskRef, OFFSET$separateStencilMaskRef, value);
    }

    public @unsigned int shaderSampleRateInterpolationFunctions() {
        return segment.get(LAYOUT$shaderSampleRateInterpolationFunctions, OFFSET$shaderSampleRateInterpolationFunctions);
    }

    public void shaderSampleRateInterpolationFunctions(@unsigned int value) {
        segment.set(LAYOUT$shaderSampleRateInterpolationFunctions, OFFSET$shaderSampleRateInterpolationFunctions, value);
    }

    public @unsigned int tessellationIsolines() {
        return segment.get(LAYOUT$tessellationIsolines, OFFSET$tessellationIsolines);
    }

    public void tessellationIsolines(@unsigned int value) {
        segment.set(LAYOUT$tessellationIsolines, OFFSET$tessellationIsolines, value);
    }

    public @unsigned int tessellationPointMode() {
        return segment.get(LAYOUT$tessellationPointMode, OFFSET$tessellationPointMode);
    }

    public void tessellationPointMode(@unsigned int value) {
        segment.set(LAYOUT$tessellationPointMode, OFFSET$tessellationPointMode, value);
    }

    public @unsigned int triangleFans() {
        return segment.get(LAYOUT$triangleFans, OFFSET$triangleFans);
    }

    public void triangleFans(@unsigned int value) {
        segment.set(LAYOUT$triangleFans, OFFSET$triangleFans, value);
    }

    public @unsigned int vertexAttributeAccessBeyondStride() {
        return segment.get(LAYOUT$vertexAttributeAccessBeyondStride, OFFSET$vertexAttributeAccessBeyondStride);
    }

    public void vertexAttributeAccessBeyondStride(@unsigned int value) {
        segment.set(LAYOUT$vertexAttributeAccessBeyondStride, OFFSET$vertexAttributeAccessBeyondStride, value);
    }


    public static final class VkPhysicalDevicePortabilitySubsetFeaturesKHRFactory implements IDataTypeFactory<VkPhysicalDevicePortabilitySubsetFeaturesKHR> {
        @Override
        public Class<VkPhysicalDevicePortabilitySubsetFeaturesKHR> clazz() {
            return VkPhysicalDevicePortabilitySubsetFeaturesKHR.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkPhysicalDevicePortabilitySubsetFeaturesKHR.LAYOUT;
        }

        @Override
        public VkPhysicalDevicePortabilitySubsetFeaturesKHR create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkPhysicalDevicePortabilitySubsetFeaturesKHR createUninit(MemorySegment segment) {
            return new VkPhysicalDevicePortabilitySubsetFeaturesKHR(segment);
        }
    }

    public static final VkPhysicalDevicePortabilitySubsetFeaturesKHRFactory FACTORY = new VkPhysicalDevicePortabilitySubsetFeaturesKHRFactory();
}