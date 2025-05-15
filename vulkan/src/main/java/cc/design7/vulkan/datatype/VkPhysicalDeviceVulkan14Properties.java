package cc.design7.vulkan.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import cc.design7.ffm.IPointer;
import cc.design7.ffm.NativeLayout;
import cc.design7.ffm.annotation.*;
import cc.design7.ffm.ptr.*;
import cc.design7.vulkan.bitmask.*;
import cc.design7.vulkan.datatype.*;
import cc.design7.vulkan.enumtype.*;
import static cc.design7.vulkan.VkConstants.*;

/// Represents a pointer to a {@code VkPhysicalDeviceVulkan14Properties} structure in native memory.
///
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to)
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceVulkan14Properties.html">VkPhysicalDeviceVulkan14Properties</a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkPhysicalDeviceVulkan14Properties(@NotNull MemorySegment segment) implements IPointer {
    public VkPhysicalDeviceVulkan14Properties {
        sType(VkStructureType.PHYSICAL_DEVICE_VULKAN_1_4_PROPERTIES);
    }

    public static VkPhysicalDeviceVulkan14Properties allocate(Arena arena) {
        return new VkPhysicalDeviceVulkan14Properties(arena.allocate(LAYOUT));
    }

    public static VkPhysicalDeviceVulkan14Properties[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceVulkan14Properties[] ret = new VkPhysicalDeviceVulkan14Properties[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPhysicalDeviceVulkan14Properties(segment.asSlice(i * BYTES, BYTES));
        }
        return ret;
    }

    public static VkPhysicalDeviceVulkan14Properties clone(Arena arena, VkPhysicalDeviceVulkan14Properties src) {
        VkPhysicalDeviceVulkan14Properties ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceVulkan14Properties[] clone(Arena arena, VkPhysicalDeviceVulkan14Properties[] src) {
        VkPhysicalDeviceVulkan14Properties[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("lineSubPixelPrecisionBits"),
        ValueLayout.JAVA_INT.withName("maxVertexAttribDivisor"),
        ValueLayout.JAVA_INT.withName("supportsNonZeroFirstInstance"),
        ValueLayout.JAVA_INT.withName("maxPushDescriptors"),
        ValueLayout.JAVA_INT.withName("dynamicRenderingLocalReadDepthStencilAttachments"),
        ValueLayout.JAVA_INT.withName("dynamicRenderingLocalReadMultisampledAttachments"),
        ValueLayout.JAVA_INT.withName("earlyFragmentMultisampleCoverageAfterSampleCounting"),
        ValueLayout.JAVA_INT.withName("earlyFragmentSampleMaskTestBeforeSampleCounting"),
        ValueLayout.JAVA_INT.withName("depthStencilSwizzleOneSupport"),
        ValueLayout.JAVA_INT.withName("polygonModePointSize"),
        ValueLayout.JAVA_INT.withName("nonStrictSinglePixelWideLinesUseParallelogram"),
        ValueLayout.JAVA_INT.withName("nonStrictWideLinesUseParallelogram"),
        ValueLayout.JAVA_INT.withName("blockTexelViewCompatibleMultipleLayers"),
        ValueLayout.JAVA_INT.withName("maxCombinedImageSamplerDescriptorCount"),
        ValueLayout.JAVA_INT.withName("fragmentShadingRateClampCombinerInputs"),
        ValueLayout.JAVA_INT.withName("defaultRobustnessStorageBuffers"),
        ValueLayout.JAVA_INT.withName("defaultRobustnessUniformBuffers"),
        ValueLayout.JAVA_INT.withName("defaultRobustnessVertexInputs"),
        ValueLayout.JAVA_INT.withName("defaultRobustnessImages"),
        ValueLayout.JAVA_INT.withName("copySrcLayoutCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT).withName("pCopySrcLayouts"),
        ValueLayout.JAVA_INT.withName("copyDstLayoutCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT).withName("pCopyDstLayouts"),
        ValueLayout.JAVA_BYTE.withName("optimalTilingLayoutUUID"),
        ValueLayout.JAVA_INT.withName("identicalMemoryTypeRequirements")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$lineSubPixelPrecisionBits = PathElement.groupElement("PATH$lineSubPixelPrecisionBits");
    public static final PathElement PATH$maxVertexAttribDivisor = PathElement.groupElement("PATH$maxVertexAttribDivisor");
    public static final PathElement PATH$supportsNonZeroFirstInstance = PathElement.groupElement("PATH$supportsNonZeroFirstInstance");
    public static final PathElement PATH$maxPushDescriptors = PathElement.groupElement("PATH$maxPushDescriptors");
    public static final PathElement PATH$dynamicRenderingLocalReadDepthStencilAttachments = PathElement.groupElement("PATH$dynamicRenderingLocalReadDepthStencilAttachments");
    public static final PathElement PATH$dynamicRenderingLocalReadMultisampledAttachments = PathElement.groupElement("PATH$dynamicRenderingLocalReadMultisampledAttachments");
    public static final PathElement PATH$earlyFragmentMultisampleCoverageAfterSampleCounting = PathElement.groupElement("PATH$earlyFragmentMultisampleCoverageAfterSampleCounting");
    public static final PathElement PATH$earlyFragmentSampleMaskTestBeforeSampleCounting = PathElement.groupElement("PATH$earlyFragmentSampleMaskTestBeforeSampleCounting");
    public static final PathElement PATH$depthStencilSwizzleOneSupport = PathElement.groupElement("PATH$depthStencilSwizzleOneSupport");
    public static final PathElement PATH$polygonModePointSize = PathElement.groupElement("PATH$polygonModePointSize");
    public static final PathElement PATH$nonStrictSinglePixelWideLinesUseParallelogram = PathElement.groupElement("PATH$nonStrictSinglePixelWideLinesUseParallelogram");
    public static final PathElement PATH$nonStrictWideLinesUseParallelogram = PathElement.groupElement("PATH$nonStrictWideLinesUseParallelogram");
    public static final PathElement PATH$blockTexelViewCompatibleMultipleLayers = PathElement.groupElement("PATH$blockTexelViewCompatibleMultipleLayers");
    public static final PathElement PATH$maxCombinedImageSamplerDescriptorCount = PathElement.groupElement("PATH$maxCombinedImageSamplerDescriptorCount");
    public static final PathElement PATH$fragmentShadingRateClampCombinerInputs = PathElement.groupElement("PATH$fragmentShadingRateClampCombinerInputs");
    public static final PathElement PATH$defaultRobustnessStorageBuffers = PathElement.groupElement("PATH$defaultRobustnessStorageBuffers");
    public static final PathElement PATH$defaultRobustnessUniformBuffers = PathElement.groupElement("PATH$defaultRobustnessUniformBuffers");
    public static final PathElement PATH$defaultRobustnessVertexInputs = PathElement.groupElement("PATH$defaultRobustnessVertexInputs");
    public static final PathElement PATH$defaultRobustnessImages = PathElement.groupElement("PATH$defaultRobustnessImages");
    public static final PathElement PATH$copySrcLayoutCount = PathElement.groupElement("PATH$copySrcLayoutCount");
    public static final PathElement PATH$pCopySrcLayouts = PathElement.groupElement("PATH$pCopySrcLayouts");
    public static final PathElement PATH$copyDstLayoutCount = PathElement.groupElement("PATH$copyDstLayoutCount");
    public static final PathElement PATH$pCopyDstLayouts = PathElement.groupElement("PATH$pCopyDstLayouts");
    public static final PathElement PATH$optimalTilingLayoutUUID = PathElement.groupElement("PATH$optimalTilingLayoutUUID");
    public static final PathElement PATH$identicalMemoryTypeRequirements = PathElement.groupElement("PATH$identicalMemoryTypeRequirements");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$lineSubPixelPrecisionBits = (OfInt) LAYOUT.select(PATH$lineSubPixelPrecisionBits);
    public static final OfInt LAYOUT$maxVertexAttribDivisor = (OfInt) LAYOUT.select(PATH$maxVertexAttribDivisor);
    public static final OfInt LAYOUT$supportsNonZeroFirstInstance = (OfInt) LAYOUT.select(PATH$supportsNonZeroFirstInstance);
    public static final OfInt LAYOUT$maxPushDescriptors = (OfInt) LAYOUT.select(PATH$maxPushDescriptors);
    public static final OfInt LAYOUT$dynamicRenderingLocalReadDepthStencilAttachments = (OfInt) LAYOUT.select(PATH$dynamicRenderingLocalReadDepthStencilAttachments);
    public static final OfInt LAYOUT$dynamicRenderingLocalReadMultisampledAttachments = (OfInt) LAYOUT.select(PATH$dynamicRenderingLocalReadMultisampledAttachments);
    public static final OfInt LAYOUT$earlyFragmentMultisampleCoverageAfterSampleCounting = (OfInt) LAYOUT.select(PATH$earlyFragmentMultisampleCoverageAfterSampleCounting);
    public static final OfInt LAYOUT$earlyFragmentSampleMaskTestBeforeSampleCounting = (OfInt) LAYOUT.select(PATH$earlyFragmentSampleMaskTestBeforeSampleCounting);
    public static final OfInt LAYOUT$depthStencilSwizzleOneSupport = (OfInt) LAYOUT.select(PATH$depthStencilSwizzleOneSupport);
    public static final OfInt LAYOUT$polygonModePointSize = (OfInt) LAYOUT.select(PATH$polygonModePointSize);
    public static final OfInt LAYOUT$nonStrictSinglePixelWideLinesUseParallelogram = (OfInt) LAYOUT.select(PATH$nonStrictSinglePixelWideLinesUseParallelogram);
    public static final OfInt LAYOUT$nonStrictWideLinesUseParallelogram = (OfInt) LAYOUT.select(PATH$nonStrictWideLinesUseParallelogram);
    public static final OfInt LAYOUT$blockTexelViewCompatibleMultipleLayers = (OfInt) LAYOUT.select(PATH$blockTexelViewCompatibleMultipleLayers);
    public static final OfInt LAYOUT$maxCombinedImageSamplerDescriptorCount = (OfInt) LAYOUT.select(PATH$maxCombinedImageSamplerDescriptorCount);
    public static final OfInt LAYOUT$fragmentShadingRateClampCombinerInputs = (OfInt) LAYOUT.select(PATH$fragmentShadingRateClampCombinerInputs);
    public static final OfInt LAYOUT$defaultRobustnessStorageBuffers = (OfInt) LAYOUT.select(PATH$defaultRobustnessStorageBuffers);
    public static final OfInt LAYOUT$defaultRobustnessUniformBuffers = (OfInt) LAYOUT.select(PATH$defaultRobustnessUniformBuffers);
    public static final OfInt LAYOUT$defaultRobustnessVertexInputs = (OfInt) LAYOUT.select(PATH$defaultRobustnessVertexInputs);
    public static final OfInt LAYOUT$defaultRobustnessImages = (OfInt) LAYOUT.select(PATH$defaultRobustnessImages);
    public static final OfInt LAYOUT$copySrcLayoutCount = (OfInt) LAYOUT.select(PATH$copySrcLayoutCount);
    public static final AddressLayout LAYOUT$pCopySrcLayouts = (AddressLayout) LAYOUT.select(PATH$pCopySrcLayouts);
    public static final OfInt LAYOUT$copyDstLayoutCount = (OfInt) LAYOUT.select(PATH$copyDstLayoutCount);
    public static final AddressLayout LAYOUT$pCopyDstLayouts = (AddressLayout) LAYOUT.select(PATH$pCopyDstLayouts);
    public static final OfByte LAYOUT$optimalTilingLayoutUUID = (OfByte) LAYOUT.select(PATH$optimalTilingLayoutUUID);
    public static final OfInt LAYOUT$identicalMemoryTypeRequirements = (OfInt) LAYOUT.select(PATH$identicalMemoryTypeRequirements);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$lineSubPixelPrecisionBits = LAYOUT$lineSubPixelPrecisionBits.byteSize();
    public static final long SIZE$maxVertexAttribDivisor = LAYOUT$maxVertexAttribDivisor.byteSize();
    public static final long SIZE$supportsNonZeroFirstInstance = LAYOUT$supportsNonZeroFirstInstance.byteSize();
    public static final long SIZE$maxPushDescriptors = LAYOUT$maxPushDescriptors.byteSize();
    public static final long SIZE$dynamicRenderingLocalReadDepthStencilAttachments = LAYOUT$dynamicRenderingLocalReadDepthStencilAttachments.byteSize();
    public static final long SIZE$dynamicRenderingLocalReadMultisampledAttachments = LAYOUT$dynamicRenderingLocalReadMultisampledAttachments.byteSize();
    public static final long SIZE$earlyFragmentMultisampleCoverageAfterSampleCounting = LAYOUT$earlyFragmentMultisampleCoverageAfterSampleCounting.byteSize();
    public static final long SIZE$earlyFragmentSampleMaskTestBeforeSampleCounting = LAYOUT$earlyFragmentSampleMaskTestBeforeSampleCounting.byteSize();
    public static final long SIZE$depthStencilSwizzleOneSupport = LAYOUT$depthStencilSwizzleOneSupport.byteSize();
    public static final long SIZE$polygonModePointSize = LAYOUT$polygonModePointSize.byteSize();
    public static final long SIZE$nonStrictSinglePixelWideLinesUseParallelogram = LAYOUT$nonStrictSinglePixelWideLinesUseParallelogram.byteSize();
    public static final long SIZE$nonStrictWideLinesUseParallelogram = LAYOUT$nonStrictWideLinesUseParallelogram.byteSize();
    public static final long SIZE$blockTexelViewCompatibleMultipleLayers = LAYOUT$blockTexelViewCompatibleMultipleLayers.byteSize();
    public static final long SIZE$maxCombinedImageSamplerDescriptorCount = LAYOUT$maxCombinedImageSamplerDescriptorCount.byteSize();
    public static final long SIZE$fragmentShadingRateClampCombinerInputs = LAYOUT$fragmentShadingRateClampCombinerInputs.byteSize();
    public static final long SIZE$defaultRobustnessStorageBuffers = LAYOUT$defaultRobustnessStorageBuffers.byteSize();
    public static final long SIZE$defaultRobustnessUniformBuffers = LAYOUT$defaultRobustnessUniformBuffers.byteSize();
    public static final long SIZE$defaultRobustnessVertexInputs = LAYOUT$defaultRobustnessVertexInputs.byteSize();
    public static final long SIZE$defaultRobustnessImages = LAYOUT$defaultRobustnessImages.byteSize();
    public static final long SIZE$copySrcLayoutCount = LAYOUT$copySrcLayoutCount.byteSize();
    public static final long SIZE$pCopySrcLayouts = LAYOUT$pCopySrcLayouts.byteSize();
    public static final long SIZE$copyDstLayoutCount = LAYOUT$copyDstLayoutCount.byteSize();
    public static final long SIZE$pCopyDstLayouts = LAYOUT$pCopyDstLayouts.byteSize();
    public static final long SIZE$optimalTilingLayoutUUID = LAYOUT$optimalTilingLayoutUUID.byteSize();
    public static final long SIZE$identicalMemoryTypeRequirements = LAYOUT$identicalMemoryTypeRequirements.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$lineSubPixelPrecisionBits = LAYOUT.byteOffset(PATH$lineSubPixelPrecisionBits);
    public static final long OFFSET$maxVertexAttribDivisor = LAYOUT.byteOffset(PATH$maxVertexAttribDivisor);
    public static final long OFFSET$supportsNonZeroFirstInstance = LAYOUT.byteOffset(PATH$supportsNonZeroFirstInstance);
    public static final long OFFSET$maxPushDescriptors = LAYOUT.byteOffset(PATH$maxPushDescriptors);
    public static final long OFFSET$dynamicRenderingLocalReadDepthStencilAttachments = LAYOUT.byteOffset(PATH$dynamicRenderingLocalReadDepthStencilAttachments);
    public static final long OFFSET$dynamicRenderingLocalReadMultisampledAttachments = LAYOUT.byteOffset(PATH$dynamicRenderingLocalReadMultisampledAttachments);
    public static final long OFFSET$earlyFragmentMultisampleCoverageAfterSampleCounting = LAYOUT.byteOffset(PATH$earlyFragmentMultisampleCoverageAfterSampleCounting);
    public static final long OFFSET$earlyFragmentSampleMaskTestBeforeSampleCounting = LAYOUT.byteOffset(PATH$earlyFragmentSampleMaskTestBeforeSampleCounting);
    public static final long OFFSET$depthStencilSwizzleOneSupport = LAYOUT.byteOffset(PATH$depthStencilSwizzleOneSupport);
    public static final long OFFSET$polygonModePointSize = LAYOUT.byteOffset(PATH$polygonModePointSize);
    public static final long OFFSET$nonStrictSinglePixelWideLinesUseParallelogram = LAYOUT.byteOffset(PATH$nonStrictSinglePixelWideLinesUseParallelogram);
    public static final long OFFSET$nonStrictWideLinesUseParallelogram = LAYOUT.byteOffset(PATH$nonStrictWideLinesUseParallelogram);
    public static final long OFFSET$blockTexelViewCompatibleMultipleLayers = LAYOUT.byteOffset(PATH$blockTexelViewCompatibleMultipleLayers);
    public static final long OFFSET$maxCombinedImageSamplerDescriptorCount = LAYOUT.byteOffset(PATH$maxCombinedImageSamplerDescriptorCount);
    public static final long OFFSET$fragmentShadingRateClampCombinerInputs = LAYOUT.byteOffset(PATH$fragmentShadingRateClampCombinerInputs);
    public static final long OFFSET$defaultRobustnessStorageBuffers = LAYOUT.byteOffset(PATH$defaultRobustnessStorageBuffers);
    public static final long OFFSET$defaultRobustnessUniformBuffers = LAYOUT.byteOffset(PATH$defaultRobustnessUniformBuffers);
    public static final long OFFSET$defaultRobustnessVertexInputs = LAYOUT.byteOffset(PATH$defaultRobustnessVertexInputs);
    public static final long OFFSET$defaultRobustnessImages = LAYOUT.byteOffset(PATH$defaultRobustnessImages);
    public static final long OFFSET$copySrcLayoutCount = LAYOUT.byteOffset(PATH$copySrcLayoutCount);
    public static final long OFFSET$pCopySrcLayouts = LAYOUT.byteOffset(PATH$pCopySrcLayouts);
    public static final long OFFSET$copyDstLayoutCount = LAYOUT.byteOffset(PATH$copyDstLayoutCount);
    public static final long OFFSET$pCopyDstLayouts = LAYOUT.byteOffset(PATH$pCopyDstLayouts);
    public static final long OFFSET$optimalTilingLayoutUUID = LAYOUT.byteOffset(PATH$optimalTilingLayoutUUID);
    public static final long OFFSET$identicalMemoryTypeRequirements = LAYOUT.byteOffset(PATH$identicalMemoryTypeRequirements);

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

    public @unsigned int lineSubPixelPrecisionBits() {
        return segment.get(LAYOUT$lineSubPixelPrecisionBits, OFFSET$lineSubPixelPrecisionBits);
    }

    public void lineSubPixelPrecisionBits(@unsigned int value) {
        segment.set(LAYOUT$lineSubPixelPrecisionBits, OFFSET$lineSubPixelPrecisionBits, value);
    }

    public @unsigned int maxVertexAttribDivisor() {
        return segment.get(LAYOUT$maxVertexAttribDivisor, OFFSET$maxVertexAttribDivisor);
    }

    public void maxVertexAttribDivisor(@unsigned int value) {
        segment.set(LAYOUT$maxVertexAttribDivisor, OFFSET$maxVertexAttribDivisor, value);
    }

    public @unsigned int supportsNonZeroFirstInstance() {
        return segment.get(LAYOUT$supportsNonZeroFirstInstance, OFFSET$supportsNonZeroFirstInstance);
    }

    public void supportsNonZeroFirstInstance(@unsigned int value) {
        segment.set(LAYOUT$supportsNonZeroFirstInstance, OFFSET$supportsNonZeroFirstInstance, value);
    }

    public @unsigned int maxPushDescriptors() {
        return segment.get(LAYOUT$maxPushDescriptors, OFFSET$maxPushDescriptors);
    }

    public void maxPushDescriptors(@unsigned int value) {
        segment.set(LAYOUT$maxPushDescriptors, OFFSET$maxPushDescriptors, value);
    }

    public @unsigned int dynamicRenderingLocalReadDepthStencilAttachments() {
        return segment.get(LAYOUT$dynamicRenderingLocalReadDepthStencilAttachments, OFFSET$dynamicRenderingLocalReadDepthStencilAttachments);
    }

    public void dynamicRenderingLocalReadDepthStencilAttachments(@unsigned int value) {
        segment.set(LAYOUT$dynamicRenderingLocalReadDepthStencilAttachments, OFFSET$dynamicRenderingLocalReadDepthStencilAttachments, value);
    }

    public @unsigned int dynamicRenderingLocalReadMultisampledAttachments() {
        return segment.get(LAYOUT$dynamicRenderingLocalReadMultisampledAttachments, OFFSET$dynamicRenderingLocalReadMultisampledAttachments);
    }

    public void dynamicRenderingLocalReadMultisampledAttachments(@unsigned int value) {
        segment.set(LAYOUT$dynamicRenderingLocalReadMultisampledAttachments, OFFSET$dynamicRenderingLocalReadMultisampledAttachments, value);
    }

    public @unsigned int earlyFragmentMultisampleCoverageAfterSampleCounting() {
        return segment.get(LAYOUT$earlyFragmentMultisampleCoverageAfterSampleCounting, OFFSET$earlyFragmentMultisampleCoverageAfterSampleCounting);
    }

    public void earlyFragmentMultisampleCoverageAfterSampleCounting(@unsigned int value) {
        segment.set(LAYOUT$earlyFragmentMultisampleCoverageAfterSampleCounting, OFFSET$earlyFragmentMultisampleCoverageAfterSampleCounting, value);
    }

    public @unsigned int earlyFragmentSampleMaskTestBeforeSampleCounting() {
        return segment.get(LAYOUT$earlyFragmentSampleMaskTestBeforeSampleCounting, OFFSET$earlyFragmentSampleMaskTestBeforeSampleCounting);
    }

    public void earlyFragmentSampleMaskTestBeforeSampleCounting(@unsigned int value) {
        segment.set(LAYOUT$earlyFragmentSampleMaskTestBeforeSampleCounting, OFFSET$earlyFragmentSampleMaskTestBeforeSampleCounting, value);
    }

    public @unsigned int depthStencilSwizzleOneSupport() {
        return segment.get(LAYOUT$depthStencilSwizzleOneSupport, OFFSET$depthStencilSwizzleOneSupport);
    }

    public void depthStencilSwizzleOneSupport(@unsigned int value) {
        segment.set(LAYOUT$depthStencilSwizzleOneSupport, OFFSET$depthStencilSwizzleOneSupport, value);
    }

    public @unsigned int polygonModePointSize() {
        return segment.get(LAYOUT$polygonModePointSize, OFFSET$polygonModePointSize);
    }

    public void polygonModePointSize(@unsigned int value) {
        segment.set(LAYOUT$polygonModePointSize, OFFSET$polygonModePointSize, value);
    }

    public @unsigned int nonStrictSinglePixelWideLinesUseParallelogram() {
        return segment.get(LAYOUT$nonStrictSinglePixelWideLinesUseParallelogram, OFFSET$nonStrictSinglePixelWideLinesUseParallelogram);
    }

    public void nonStrictSinglePixelWideLinesUseParallelogram(@unsigned int value) {
        segment.set(LAYOUT$nonStrictSinglePixelWideLinesUseParallelogram, OFFSET$nonStrictSinglePixelWideLinesUseParallelogram, value);
    }

    public @unsigned int nonStrictWideLinesUseParallelogram() {
        return segment.get(LAYOUT$nonStrictWideLinesUseParallelogram, OFFSET$nonStrictWideLinesUseParallelogram);
    }

    public void nonStrictWideLinesUseParallelogram(@unsigned int value) {
        segment.set(LAYOUT$nonStrictWideLinesUseParallelogram, OFFSET$nonStrictWideLinesUseParallelogram, value);
    }

    public @unsigned int blockTexelViewCompatibleMultipleLayers() {
        return segment.get(LAYOUT$blockTexelViewCompatibleMultipleLayers, OFFSET$blockTexelViewCompatibleMultipleLayers);
    }

    public void blockTexelViewCompatibleMultipleLayers(@unsigned int value) {
        segment.set(LAYOUT$blockTexelViewCompatibleMultipleLayers, OFFSET$blockTexelViewCompatibleMultipleLayers, value);
    }

    public @unsigned int maxCombinedImageSamplerDescriptorCount() {
        return segment.get(LAYOUT$maxCombinedImageSamplerDescriptorCount, OFFSET$maxCombinedImageSamplerDescriptorCount);
    }

    public void maxCombinedImageSamplerDescriptorCount(@unsigned int value) {
        segment.set(LAYOUT$maxCombinedImageSamplerDescriptorCount, OFFSET$maxCombinedImageSamplerDescriptorCount, value);
    }

    public @unsigned int fragmentShadingRateClampCombinerInputs() {
        return segment.get(LAYOUT$fragmentShadingRateClampCombinerInputs, OFFSET$fragmentShadingRateClampCombinerInputs);
    }

    public void fragmentShadingRateClampCombinerInputs(@unsigned int value) {
        segment.set(LAYOUT$fragmentShadingRateClampCombinerInputs, OFFSET$fragmentShadingRateClampCombinerInputs, value);
    }

    public @enumtype(VkPipelineRobustnessBufferBehavior.class) int defaultRobustnessStorageBuffers() {
        return segment.get(LAYOUT$defaultRobustnessStorageBuffers, OFFSET$defaultRobustnessStorageBuffers);
    }

    public void defaultRobustnessStorageBuffers(@enumtype(VkPipelineRobustnessBufferBehavior.class) int value) {
        segment.set(LAYOUT$defaultRobustnessStorageBuffers, OFFSET$defaultRobustnessStorageBuffers, value);
    }

    public @enumtype(VkPipelineRobustnessBufferBehavior.class) int defaultRobustnessUniformBuffers() {
        return segment.get(LAYOUT$defaultRobustnessUniformBuffers, OFFSET$defaultRobustnessUniformBuffers);
    }

    public void defaultRobustnessUniformBuffers(@enumtype(VkPipelineRobustnessBufferBehavior.class) int value) {
        segment.set(LAYOUT$defaultRobustnessUniformBuffers, OFFSET$defaultRobustnessUniformBuffers, value);
    }

    public @enumtype(VkPipelineRobustnessBufferBehavior.class) int defaultRobustnessVertexInputs() {
        return segment.get(LAYOUT$defaultRobustnessVertexInputs, OFFSET$defaultRobustnessVertexInputs);
    }

    public void defaultRobustnessVertexInputs(@enumtype(VkPipelineRobustnessBufferBehavior.class) int value) {
        segment.set(LAYOUT$defaultRobustnessVertexInputs, OFFSET$defaultRobustnessVertexInputs, value);
    }

    public @enumtype(VkPipelineRobustnessImageBehavior.class) int defaultRobustnessImages() {
        return segment.get(LAYOUT$defaultRobustnessImages, OFFSET$defaultRobustnessImages);
    }

    public void defaultRobustnessImages(@enumtype(VkPipelineRobustnessImageBehavior.class) int value) {
        segment.set(LAYOUT$defaultRobustnessImages, OFFSET$defaultRobustnessImages, value);
    }

    public @unsigned int copySrcLayoutCount() {
        return segment.get(LAYOUT$copySrcLayoutCount, OFFSET$copySrcLayoutCount);
    }

    public void copySrcLayoutCount(@unsigned int value) {
        segment.set(LAYOUT$copySrcLayoutCount, OFFSET$copySrcLayoutCount, value);
    }

    public @pointer(target=VkImageLayout.class) MemorySegment pCopySrcLayoutsRaw() {
        return segment.get(LAYOUT$pCopySrcLayouts, OFFSET$pCopySrcLayouts);
    }

    public void pCopySrcLayoutsRaw(@pointer(target=VkImageLayout.class) MemorySegment value) {
        segment.set(LAYOUT$pCopySrcLayouts, OFFSET$pCopySrcLayouts, value);
    }

    /// Note: the returned {@link IntPtr} does not have correct
    /// {@link IntPtr#size} property. It's up to user to track the size of the buffer,
    /// and use {@link IntPtr#reinterpret} to set the size before actually reading fro
    /// or writing to the buffer.
    public @Nullable @enumtype(VkImageLayout.class) IntPtr pCopySrcLayouts() {
        MemorySegment s = pCopySrcLayoutsRaw();
        if (s.address() == 0) {
            return null;
        }
        return new IntPtr(s);
    }

    public void pCopySrcLayouts(@Nullable @enumtype(VkImageLayout.class) IntPtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pCopySrcLayoutsRaw(s);
    }

    public @unsigned int copyDstLayoutCount() {
        return segment.get(LAYOUT$copyDstLayoutCount, OFFSET$copyDstLayoutCount);
    }

    public void copyDstLayoutCount(@unsigned int value) {
        segment.set(LAYOUT$copyDstLayoutCount, OFFSET$copyDstLayoutCount, value);
    }

    public @pointer(target=VkImageLayout.class) MemorySegment pCopyDstLayoutsRaw() {
        return segment.get(LAYOUT$pCopyDstLayouts, OFFSET$pCopyDstLayouts);
    }

    public void pCopyDstLayoutsRaw(@pointer(target=VkImageLayout.class) MemorySegment value) {
        segment.set(LAYOUT$pCopyDstLayouts, OFFSET$pCopyDstLayouts, value);
    }

    /// Note: the returned {@link IntPtr} does not have correct
    /// {@link IntPtr#size} property. It's up to user to track the size of the buffer,
    /// and use {@link IntPtr#reinterpret} to set the size before actually reading fro
    /// or writing to the buffer.
    public @Nullable @enumtype(VkImageLayout.class) IntPtr pCopyDstLayouts() {
        MemorySegment s = pCopyDstLayoutsRaw();
        if (s.address() == 0) {
            return null;
        }
        return new IntPtr(s);
    }

    public void pCopyDstLayouts(@Nullable @enumtype(VkImageLayout.class) IntPtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pCopyDstLayoutsRaw(s);
    }

    public @unsigned byte optimalTilingLayoutUUID() {
        return segment.get(LAYOUT$optimalTilingLayoutUUID, OFFSET$optimalTilingLayoutUUID);
    }

    public void optimalTilingLayoutUUID(@unsigned byte value) {
        segment.set(LAYOUT$optimalTilingLayoutUUID, OFFSET$optimalTilingLayoutUUID, value);
    }

    public @unsigned int identicalMemoryTypeRequirements() {
        return segment.get(LAYOUT$identicalMemoryTypeRequirements, OFFSET$identicalMemoryTypeRequirements);
    }

    public void identicalMemoryTypeRequirements(@unsigned int value) {
        segment.set(LAYOUT$identicalMemoryTypeRequirements, OFFSET$identicalMemoryTypeRequirements, value);
    }

}
