package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.IPointer;
import tech.icey.vk4j.annotation.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.buffer.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import tech.icey.vk4j.NativeLayout;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

/// {@snippet lang=c :
/// typedef struct VkPhysicalDevicePortabilitySubsetFeaturesKHR {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 constantAlphaColorBlendFactors;
///     VkBool32 events;
///     VkBool32 imageViewFormatReinterpretation;
///     VkBool32 imageViewFormatSwizzle;
///     VkBool32 imageView2DOn3DImage;
///     VkBool32 multisampleArrayImage;
///     VkBool32 mutableComparisonSamplers;
///     VkBool32 pointPolygons;
///     VkBool32 samplerMipLodBias;
///     VkBool32 separateStencilMaskRef;
///     VkBool32 shaderSampleRateInterpolationFunctions;
///     VkBool32 tessellationIsolines;
///     VkBool32 tessellationPointMode;
///     VkBool32 triangleFans;
///     VkBool32 vertexAttributeAccessBeyondStride;
/// } VkPhysicalDevicePortabilitySubsetFeaturesKHR;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkPhysicalDevicePortabilitySubsetFeaturesKHR.html">VkPhysicalDevicePortabilitySubsetFeaturesKHR</a>
public record VkPhysicalDevicePortabilitySubsetFeaturesKHR(MemorySegment segment) implements IPointer {
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

    public void pNext(IPointer pointer) {
        pNext(pointer.segment());
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

    public static VkPhysicalDevicePortabilitySubsetFeaturesKHR allocate(Arena arena) {
        return new VkPhysicalDevicePortabilitySubsetFeaturesKHR(arena.allocate(LAYOUT));
    }
    
    public static VkPhysicalDevicePortabilitySubsetFeaturesKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDevicePortabilitySubsetFeaturesKHR[] ret = new VkPhysicalDevicePortabilitySubsetFeaturesKHR[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkPhysicalDevicePortabilitySubsetFeaturesKHR(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
    
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
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$constantAlphaColorBlendFactors = PathElement.groupElement("constantAlphaColorBlendFactors");
    public static final PathElement PATH$events = PathElement.groupElement("events");
    public static final PathElement PATH$imageViewFormatReinterpretation = PathElement.groupElement("imageViewFormatReinterpretation");
    public static final PathElement PATH$imageViewFormatSwizzle = PathElement.groupElement("imageViewFormatSwizzle");
    public static final PathElement PATH$imageView2DOn3DImage = PathElement.groupElement("imageView2DOn3DImage");
    public static final PathElement PATH$multisampleArrayImage = PathElement.groupElement("multisampleArrayImage");
    public static final PathElement PATH$mutableComparisonSamplers = PathElement.groupElement("mutableComparisonSamplers");
    public static final PathElement PATH$pointPolygons = PathElement.groupElement("pointPolygons");
    public static final PathElement PATH$samplerMipLodBias = PathElement.groupElement("samplerMipLodBias");
    public static final PathElement PATH$separateStencilMaskRef = PathElement.groupElement("separateStencilMaskRef");
    public static final PathElement PATH$shaderSampleRateInterpolationFunctions = PathElement.groupElement("shaderSampleRateInterpolationFunctions");
    public static final PathElement PATH$tessellationIsolines = PathElement.groupElement("tessellationIsolines");
    public static final PathElement PATH$tessellationPointMode = PathElement.groupElement("tessellationPointMode");
    public static final PathElement PATH$triangleFans = PathElement.groupElement("triangleFans");
    public static final PathElement PATH$vertexAttributeAccessBeyondStride = PathElement.groupElement("vertexAttributeAccessBeyondStride");

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

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$constantAlphaColorBlendFactors = LAYOUT$constantAlphaColorBlendFactors.byteSize();
    public static final long SIZE$events = LAYOUT$events.byteSize();
    public static final long SIZE$imageViewFormatReinterpretation = LAYOUT$imageViewFormatReinterpretation.byteSize();
    public static final long SIZE$imageViewFormatSwizzle = LAYOUT$imageViewFormatSwizzle.byteSize();
    public static final long SIZE$imageView2DOn3DImage = LAYOUT$imageView2DOn3DImage.byteSize();
    public static final long SIZE$multisampleArrayImage = LAYOUT$multisampleArrayImage.byteSize();
    public static final long SIZE$mutableComparisonSamplers = LAYOUT$mutableComparisonSamplers.byteSize();
    public static final long SIZE$pointPolygons = LAYOUT$pointPolygons.byteSize();
    public static final long SIZE$samplerMipLodBias = LAYOUT$samplerMipLodBias.byteSize();
    public static final long SIZE$separateStencilMaskRef = LAYOUT$separateStencilMaskRef.byteSize();
    public static final long SIZE$shaderSampleRateInterpolationFunctions = LAYOUT$shaderSampleRateInterpolationFunctions.byteSize();
    public static final long SIZE$tessellationIsolines = LAYOUT$tessellationIsolines.byteSize();
    public static final long SIZE$tessellationPointMode = LAYOUT$tessellationPointMode.byteSize();
    public static final long SIZE$triangleFans = LAYOUT$triangleFans.byteSize();
    public static final long SIZE$vertexAttributeAccessBeyondStride = LAYOUT$vertexAttributeAccessBeyondStride.byteSize();
}
