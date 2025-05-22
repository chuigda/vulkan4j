package club.doki7.vulkan.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
import java.util.List;

import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import club.doki7.ffm.IPointer;
import club.doki7.ffm.NativeLayout;
import club.doki7.ffm.annotation.*;
import club.doki7.ffm.ptr.*;
import club.doki7.vulkan.bitmask.*;
import club.doki7.vulkan.handle.*;
import club.doki7.vulkan.enumtype.*;
import static club.doki7.vulkan.VkConstants.*;

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceLimits.html"><code>VkPhysicalDeviceLimits</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkPhysicalDeviceLimits {
///     uint32_t maxImageDimension1D; // @link substring="maxImageDimension1D" target="#maxImageDimension1D"
///     uint32_t maxImageDimension2D; // @link substring="maxImageDimension2D" target="#maxImageDimension2D"
///     uint32_t maxImageDimension3D; // @link substring="maxImageDimension3D" target="#maxImageDimension3D"
///     uint32_t maxImageDimensionCube; // @link substring="maxImageDimensionCube" target="#maxImageDimensionCube"
///     uint32_t maxImageArrayLayers; // @link substring="maxImageArrayLayers" target="#maxImageArrayLayers"
///     uint32_t maxTexelBufferElements; // @link substring="maxTexelBufferElements" target="#maxTexelBufferElements"
///     uint32_t maxUniformBufferRange; // @link substring="maxUniformBufferRange" target="#maxUniformBufferRange"
///     uint32_t maxStorageBufferRange; // @link substring="maxStorageBufferRange" target="#maxStorageBufferRange"
///     uint32_t maxPushConstantsSize; // @link substring="maxPushConstantsSize" target="#maxPushConstantsSize"
///     uint32_t maxMemoryAllocationCount; // @link substring="maxMemoryAllocationCount" target="#maxMemoryAllocationCount"
///     uint32_t maxSamplerAllocationCount; // @link substring="maxSamplerAllocationCount" target="#maxSamplerAllocationCount"
///     VkDeviceSize bufferImageGranularity; // @link substring="bufferImageGranularity" target="#bufferImageGranularity"
///     VkDeviceSize sparseAddressSpaceSize; // @link substring="sparseAddressSpaceSize" target="#sparseAddressSpaceSize"
///     uint32_t maxBoundDescriptorSets; // @link substring="maxBoundDescriptorSets" target="#maxBoundDescriptorSets"
///     uint32_t maxPerStageDescriptorSamplers; // @link substring="maxPerStageDescriptorSamplers" target="#maxPerStageDescriptorSamplers"
///     uint32_t maxPerStageDescriptorUniformBuffers; // @link substring="maxPerStageDescriptorUniformBuffers" target="#maxPerStageDescriptorUniformBuffers"
///     uint32_t maxPerStageDescriptorStorageBuffers; // @link substring="maxPerStageDescriptorStorageBuffers" target="#maxPerStageDescriptorStorageBuffers"
///     uint32_t maxPerStageDescriptorSampledImages; // @link substring="maxPerStageDescriptorSampledImages" target="#maxPerStageDescriptorSampledImages"
///     uint32_t maxPerStageDescriptorStorageImages; // @link substring="maxPerStageDescriptorStorageImages" target="#maxPerStageDescriptorStorageImages"
///     uint32_t maxPerStageDescriptorInputAttachments; // @link substring="maxPerStageDescriptorInputAttachments" target="#maxPerStageDescriptorInputAttachments"
///     uint32_t maxPerStageResources; // @link substring="maxPerStageResources" target="#maxPerStageResources"
///     uint32_t maxDescriptorSetSamplers; // @link substring="maxDescriptorSetSamplers" target="#maxDescriptorSetSamplers"
///     uint32_t maxDescriptorSetUniformBuffers; // @link substring="maxDescriptorSetUniformBuffers" target="#maxDescriptorSetUniformBuffers"
///     uint32_t maxDescriptorSetUniformBuffersDynamic; // @link substring="maxDescriptorSetUniformBuffersDynamic" target="#maxDescriptorSetUniformBuffersDynamic"
///     uint32_t maxDescriptorSetStorageBuffers; // @link substring="maxDescriptorSetStorageBuffers" target="#maxDescriptorSetStorageBuffers"
///     uint32_t maxDescriptorSetStorageBuffersDynamic; // @link substring="maxDescriptorSetStorageBuffersDynamic" target="#maxDescriptorSetStorageBuffersDynamic"
///     uint32_t maxDescriptorSetSampledImages; // @link substring="maxDescriptorSetSampledImages" target="#maxDescriptorSetSampledImages"
///     uint32_t maxDescriptorSetStorageImages; // @link substring="maxDescriptorSetStorageImages" target="#maxDescriptorSetStorageImages"
///     uint32_t maxDescriptorSetInputAttachments; // @link substring="maxDescriptorSetInputAttachments" target="#maxDescriptorSetInputAttachments"
///     uint32_t maxVertexInputAttributes; // @link substring="maxVertexInputAttributes" target="#maxVertexInputAttributes"
///     uint32_t maxVertexInputBindings; // @link substring="maxVertexInputBindings" target="#maxVertexInputBindings"
///     uint32_t maxVertexInputAttributeOffset; // @link substring="maxVertexInputAttributeOffset" target="#maxVertexInputAttributeOffset"
///     uint32_t maxVertexInputBindingStride; // @link substring="maxVertexInputBindingStride" target="#maxVertexInputBindingStride"
///     uint32_t maxVertexOutputComponents; // @link substring="maxVertexOutputComponents" target="#maxVertexOutputComponents"
///     uint32_t maxTessellationGenerationLevel; // @link substring="maxTessellationGenerationLevel" target="#maxTessellationGenerationLevel"
///     uint32_t maxTessellationPatchSize; // @link substring="maxTessellationPatchSize" target="#maxTessellationPatchSize"
///     uint32_t maxTessellationControlPerVertexInputComponents; // @link substring="maxTessellationControlPerVertexInputComponents" target="#maxTessellationControlPerVertexInputComponents"
///     uint32_t maxTessellationControlPerVertexOutputComponents; // @link substring="maxTessellationControlPerVertexOutputComponents" target="#maxTessellationControlPerVertexOutputComponents"
///     uint32_t maxTessellationControlPerPatchOutputComponents; // @link substring="maxTessellationControlPerPatchOutputComponents" target="#maxTessellationControlPerPatchOutputComponents"
///     uint32_t maxTessellationControlTotalOutputComponents; // @link substring="maxTessellationControlTotalOutputComponents" target="#maxTessellationControlTotalOutputComponents"
///     uint32_t maxTessellationEvaluationInputComponents; // @link substring="maxTessellationEvaluationInputComponents" target="#maxTessellationEvaluationInputComponents"
///     uint32_t maxTessellationEvaluationOutputComponents; // @link substring="maxTessellationEvaluationOutputComponents" target="#maxTessellationEvaluationOutputComponents"
///     uint32_t maxGeometryShaderInvocations; // @link substring="maxGeometryShaderInvocations" target="#maxGeometryShaderInvocations"
///     uint32_t maxGeometryInputComponents; // @link substring="maxGeometryInputComponents" target="#maxGeometryInputComponents"
///     uint32_t maxGeometryOutputComponents; // @link substring="maxGeometryOutputComponents" target="#maxGeometryOutputComponents"
///     uint32_t maxGeometryOutputVertices; // @link substring="maxGeometryOutputVertices" target="#maxGeometryOutputVertices"
///     uint32_t maxGeometryTotalOutputComponents; // @link substring="maxGeometryTotalOutputComponents" target="#maxGeometryTotalOutputComponents"
///     uint32_t maxFragmentInputComponents; // @link substring="maxFragmentInputComponents" target="#maxFragmentInputComponents"
///     uint32_t maxFragmentOutputAttachments; // @link substring="maxFragmentOutputAttachments" target="#maxFragmentOutputAttachments"
///     uint32_t maxFragmentDualSrcAttachments; // @link substring="maxFragmentDualSrcAttachments" target="#maxFragmentDualSrcAttachments"
///     uint32_t maxFragmentCombinedOutputResources; // @link substring="maxFragmentCombinedOutputResources" target="#maxFragmentCombinedOutputResources"
///     uint32_t maxComputeSharedMemorySize; // @link substring="maxComputeSharedMemorySize" target="#maxComputeSharedMemorySize"
///     uint32_t maxComputeWorkGroupCount; // @link substring="maxComputeWorkGroupCount" target="#maxComputeWorkGroupCount"
///     uint32_t maxComputeWorkGroupInvocations; // @link substring="maxComputeWorkGroupInvocations" target="#maxComputeWorkGroupInvocations"
///     uint32_t maxComputeWorkGroupSize; // @link substring="maxComputeWorkGroupSize" target="#maxComputeWorkGroupSize"
///     uint32_t subPixelPrecisionBits; // @link substring="subPixelPrecisionBits" target="#subPixelPrecisionBits"
///     uint32_t subTexelPrecisionBits; // @link substring="subTexelPrecisionBits" target="#subTexelPrecisionBits"
///     uint32_t mipmapPrecisionBits; // @link substring="mipmapPrecisionBits" target="#mipmapPrecisionBits"
///     uint32_t maxDrawIndexedIndexValue; // @link substring="maxDrawIndexedIndexValue" target="#maxDrawIndexedIndexValue"
///     uint32_t maxDrawIndirectCount; // @link substring="maxDrawIndirectCount" target="#maxDrawIndirectCount"
///     float maxSamplerLodBias; // @link substring="maxSamplerLodBias" target="#maxSamplerLodBias"
///     float maxSamplerAnisotropy; // @link substring="maxSamplerAnisotropy" target="#maxSamplerAnisotropy"
///     uint32_t maxViewports; // @link substring="maxViewports" target="#maxViewports"
///     uint32_t maxViewportDimensions; // @link substring="maxViewportDimensions" target="#maxViewportDimensions"
///     float viewportBoundsRange; // @link substring="viewportBoundsRange" target="#viewportBoundsRange"
///     uint32_t viewportSubPixelBits; // @link substring="viewportSubPixelBits" target="#viewportSubPixelBits"
///     size_t minMemoryMapAlignment; // @link substring="minMemoryMapAlignment" target="#minMemoryMapAlignment"
///     VkDeviceSize minTexelBufferOffsetAlignment; // @link substring="minTexelBufferOffsetAlignment" target="#minTexelBufferOffsetAlignment"
///     VkDeviceSize minUniformBufferOffsetAlignment; // @link substring="minUniformBufferOffsetAlignment" target="#minUniformBufferOffsetAlignment"
///     VkDeviceSize minStorageBufferOffsetAlignment; // @link substring="minStorageBufferOffsetAlignment" target="#minStorageBufferOffsetAlignment"
///     int32_t minTexelOffset; // @link substring="minTexelOffset" target="#minTexelOffset"
///     uint32_t maxTexelOffset; // @link substring="maxTexelOffset" target="#maxTexelOffset"
///     int32_t minTexelGatherOffset; // @link substring="minTexelGatherOffset" target="#minTexelGatherOffset"
///     uint32_t maxTexelGatherOffset; // @link substring="maxTexelGatherOffset" target="#maxTexelGatherOffset"
///     float minInterpolationOffset; // @link substring="minInterpolationOffset" target="#minInterpolationOffset"
///     float maxInterpolationOffset; // @link substring="maxInterpolationOffset" target="#maxInterpolationOffset"
///     uint32_t subPixelInterpolationOffsetBits; // @link substring="subPixelInterpolationOffsetBits" target="#subPixelInterpolationOffsetBits"
///     uint32_t maxFramebufferWidth; // @link substring="maxFramebufferWidth" target="#maxFramebufferWidth"
///     uint32_t maxFramebufferHeight; // @link substring="maxFramebufferHeight" target="#maxFramebufferHeight"
///     uint32_t maxFramebufferLayers; // @link substring="maxFramebufferLayers" target="#maxFramebufferLayers"
///     VkSampleCountFlags framebufferColorSampleCounts; // optional // @link substring="VkSampleCountFlags" target="VkSampleCountFlags" @link substring="framebufferColorSampleCounts" target="#framebufferColorSampleCounts"
///     VkSampleCountFlags framebufferDepthSampleCounts; // optional // @link substring="VkSampleCountFlags" target="VkSampleCountFlags" @link substring="framebufferDepthSampleCounts" target="#framebufferDepthSampleCounts"
///     VkSampleCountFlags framebufferStencilSampleCounts; // optional // @link substring="VkSampleCountFlags" target="VkSampleCountFlags" @link substring="framebufferStencilSampleCounts" target="#framebufferStencilSampleCounts"
///     VkSampleCountFlags framebufferNoAttachmentsSampleCounts; // optional // @link substring="VkSampleCountFlags" target="VkSampleCountFlags" @link substring="framebufferNoAttachmentsSampleCounts" target="#framebufferNoAttachmentsSampleCounts"
///     uint32_t maxColorAttachments; // @link substring="maxColorAttachments" target="#maxColorAttachments"
///     VkSampleCountFlags sampledImageColorSampleCounts; // optional // @link substring="VkSampleCountFlags" target="VkSampleCountFlags" @link substring="sampledImageColorSampleCounts" target="#sampledImageColorSampleCounts"
///     VkSampleCountFlags sampledImageIntegerSampleCounts; // optional // @link substring="VkSampleCountFlags" target="VkSampleCountFlags" @link substring="sampledImageIntegerSampleCounts" target="#sampledImageIntegerSampleCounts"
///     VkSampleCountFlags sampledImageDepthSampleCounts; // optional // @link substring="VkSampleCountFlags" target="VkSampleCountFlags" @link substring="sampledImageDepthSampleCounts" target="#sampledImageDepthSampleCounts"
///     VkSampleCountFlags sampledImageStencilSampleCounts; // optional // @link substring="VkSampleCountFlags" target="VkSampleCountFlags" @link substring="sampledImageStencilSampleCounts" target="#sampledImageStencilSampleCounts"
///     VkSampleCountFlags storageImageSampleCounts; // optional // @link substring="VkSampleCountFlags" target="VkSampleCountFlags" @link substring="storageImageSampleCounts" target="#storageImageSampleCounts"
///     uint32_t maxSampleMaskWords; // @link substring="maxSampleMaskWords" target="#maxSampleMaskWords"
///     VkBool32 timestampComputeAndGraphics; // @link substring="timestampComputeAndGraphics" target="#timestampComputeAndGraphics"
///     float timestampPeriod; // @link substring="timestampPeriod" target="#timestampPeriod"
///     uint32_t maxClipDistances; // @link substring="maxClipDistances" target="#maxClipDistances"
///     uint32_t maxCullDistances; // @link substring="maxCullDistances" target="#maxCullDistances"
///     uint32_t maxCombinedClipAndCullDistances; // @link substring="maxCombinedClipAndCullDistances" target="#maxCombinedClipAndCullDistances"
///     uint32_t discreteQueuePriorities; // @link substring="discreteQueuePriorities" target="#discreteQueuePriorities"
///     float pointSizeRange; // @link substring="pointSizeRange" target="#pointSizeRange"
///     float lineWidthRange; // @link substring="lineWidthRange" target="#lineWidthRange"
///     float pointSizeGranularity; // @link substring="pointSizeGranularity" target="#pointSizeGranularity"
///     float lineWidthGranularity; // @link substring="lineWidthGranularity" target="#lineWidthGranularity"
///     VkBool32 strictLines; // @link substring="strictLines" target="#strictLines"
///     VkBool32 standardSampleLocations; // @link substring="standardSampleLocations" target="#standardSampleLocations"
///     VkDeviceSize optimalBufferCopyOffsetAlignment; // @link substring="optimalBufferCopyOffsetAlignment" target="#optimalBufferCopyOffsetAlignment"
///     VkDeviceSize optimalBufferCopyRowPitchAlignment; // @link substring="optimalBufferCopyRowPitchAlignment" target="#optimalBufferCopyRowPitchAlignment"
///     VkDeviceSize nonCoherentAtomSize; // @link substring="nonCoherentAtomSize" target="#nonCoherentAtomSize"
/// } VkPhysicalDeviceLimits;
/// }
///
/// ## Contracts
///
/// The property {@link #segment()} should always be not-null
/// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceLimits.html"><code>VkPhysicalDeviceLimits</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkPhysicalDeviceLimits(@NotNull MemorySegment segment) implements IVkPhysicalDeviceLimits {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceLimits.html"><code>VkPhysicalDeviceLimits</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link VkPhysicalDeviceLimits}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IVkPhysicalDeviceLimits to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code VkPhysicalDeviceLimits.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IVkPhysicalDeviceLimits {
        public long size() {
            return segment.byteSize() / VkPhysicalDeviceLimits.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull VkPhysicalDeviceLimits at(long index) {
            return new VkPhysicalDeviceLimits(segment.asSlice(index * VkPhysicalDeviceLimits.BYTES, VkPhysicalDeviceLimits.BYTES));
        }

        public void write(long index, @NotNull VkPhysicalDeviceLimits value) {
            MemorySegment s = segment.asSlice(index * VkPhysicalDeviceLimits.BYTES, VkPhysicalDeviceLimits.BYTES);
            s.copyFrom(value.segment);
        }

        /// Assume the {@link Ptr} is capable of holding at least {@code newSize} structures,
        /// create a new view {@link Ptr} that uses the same backing storage as this
        /// {@link Ptr}, but with the new size. Since there is actually no way to really check
        /// whether the new size is valid, while buffer overflow is undefined behavior, this method is
        /// marked as {@link unsafe}.
        ///
        /// This method could be useful when handling data returned from some C API, where the size of
        /// the data is not known in advance.
        ///
        /// If the size of the underlying segment is actually known in advance and correctly set, and
        /// you want to create a shrunk view, you may use {@link #slice(long)} (with validation)
        /// instead.
        @unsafe
        public @NotNull Ptr reinterpret(long index) {
            return new Ptr(segment.asSlice(index * VkPhysicalDeviceLimits.BYTES, VkPhysicalDeviceLimits.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * VkPhysicalDeviceLimits.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * VkPhysicalDeviceLimits.BYTES,
                (end - start) * VkPhysicalDeviceLimits.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * VkPhysicalDeviceLimits.BYTES));
        }
    }

    public static VkPhysicalDeviceLimits allocate(Arena arena) {
        return new VkPhysicalDeviceLimits(arena.allocate(LAYOUT));
    }

    public static VkPhysicalDeviceLimits.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new VkPhysicalDeviceLimits.Ptr(segment);
    }

    public static VkPhysicalDeviceLimits clone(Arena arena, VkPhysicalDeviceLimits src) {
        VkPhysicalDeviceLimits ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @unsigned int maxImageDimension1D() {
        return segment.get(LAYOUT$maxImageDimension1D, OFFSET$maxImageDimension1D);
    }

    public void maxImageDimension1D(@unsigned int value) {
        segment.set(LAYOUT$maxImageDimension1D, OFFSET$maxImageDimension1D, value);
    }

    public @unsigned int maxImageDimension2D() {
        return segment.get(LAYOUT$maxImageDimension2D, OFFSET$maxImageDimension2D);
    }

    public void maxImageDimension2D(@unsigned int value) {
        segment.set(LAYOUT$maxImageDimension2D, OFFSET$maxImageDimension2D, value);
    }

    public @unsigned int maxImageDimension3D() {
        return segment.get(LAYOUT$maxImageDimension3D, OFFSET$maxImageDimension3D);
    }

    public void maxImageDimension3D(@unsigned int value) {
        segment.set(LAYOUT$maxImageDimension3D, OFFSET$maxImageDimension3D, value);
    }

    public @unsigned int maxImageDimensionCube() {
        return segment.get(LAYOUT$maxImageDimensionCube, OFFSET$maxImageDimensionCube);
    }

    public void maxImageDimensionCube(@unsigned int value) {
        segment.set(LAYOUT$maxImageDimensionCube, OFFSET$maxImageDimensionCube, value);
    }

    public @unsigned int maxImageArrayLayers() {
        return segment.get(LAYOUT$maxImageArrayLayers, OFFSET$maxImageArrayLayers);
    }

    public void maxImageArrayLayers(@unsigned int value) {
        segment.set(LAYOUT$maxImageArrayLayers, OFFSET$maxImageArrayLayers, value);
    }

    public @unsigned int maxTexelBufferElements() {
        return segment.get(LAYOUT$maxTexelBufferElements, OFFSET$maxTexelBufferElements);
    }

    public void maxTexelBufferElements(@unsigned int value) {
        segment.set(LAYOUT$maxTexelBufferElements, OFFSET$maxTexelBufferElements, value);
    }

    public @unsigned int maxUniformBufferRange() {
        return segment.get(LAYOUT$maxUniformBufferRange, OFFSET$maxUniformBufferRange);
    }

    public void maxUniformBufferRange(@unsigned int value) {
        segment.set(LAYOUT$maxUniformBufferRange, OFFSET$maxUniformBufferRange, value);
    }

    public @unsigned int maxStorageBufferRange() {
        return segment.get(LAYOUT$maxStorageBufferRange, OFFSET$maxStorageBufferRange);
    }

    public void maxStorageBufferRange(@unsigned int value) {
        segment.set(LAYOUT$maxStorageBufferRange, OFFSET$maxStorageBufferRange, value);
    }

    public @unsigned int maxPushConstantsSize() {
        return segment.get(LAYOUT$maxPushConstantsSize, OFFSET$maxPushConstantsSize);
    }

    public void maxPushConstantsSize(@unsigned int value) {
        segment.set(LAYOUT$maxPushConstantsSize, OFFSET$maxPushConstantsSize, value);
    }

    public @unsigned int maxMemoryAllocationCount() {
        return segment.get(LAYOUT$maxMemoryAllocationCount, OFFSET$maxMemoryAllocationCount);
    }

    public void maxMemoryAllocationCount(@unsigned int value) {
        segment.set(LAYOUT$maxMemoryAllocationCount, OFFSET$maxMemoryAllocationCount, value);
    }

    public @unsigned int maxSamplerAllocationCount() {
        return segment.get(LAYOUT$maxSamplerAllocationCount, OFFSET$maxSamplerAllocationCount);
    }

    public void maxSamplerAllocationCount(@unsigned int value) {
        segment.set(LAYOUT$maxSamplerAllocationCount, OFFSET$maxSamplerAllocationCount, value);
    }

    public @unsigned long bufferImageGranularity() {
        return segment.get(LAYOUT$bufferImageGranularity, OFFSET$bufferImageGranularity);
    }

    public void bufferImageGranularity(@unsigned long value) {
        segment.set(LAYOUT$bufferImageGranularity, OFFSET$bufferImageGranularity, value);
    }

    public @unsigned long sparseAddressSpaceSize() {
        return segment.get(LAYOUT$sparseAddressSpaceSize, OFFSET$sparseAddressSpaceSize);
    }

    public void sparseAddressSpaceSize(@unsigned long value) {
        segment.set(LAYOUT$sparseAddressSpaceSize, OFFSET$sparseAddressSpaceSize, value);
    }

    public @unsigned int maxBoundDescriptorSets() {
        return segment.get(LAYOUT$maxBoundDescriptorSets, OFFSET$maxBoundDescriptorSets);
    }

    public void maxBoundDescriptorSets(@unsigned int value) {
        segment.set(LAYOUT$maxBoundDescriptorSets, OFFSET$maxBoundDescriptorSets, value);
    }

    public @unsigned int maxPerStageDescriptorSamplers() {
        return segment.get(LAYOUT$maxPerStageDescriptorSamplers, OFFSET$maxPerStageDescriptorSamplers);
    }

    public void maxPerStageDescriptorSamplers(@unsigned int value) {
        segment.set(LAYOUT$maxPerStageDescriptorSamplers, OFFSET$maxPerStageDescriptorSamplers, value);
    }

    public @unsigned int maxPerStageDescriptorUniformBuffers() {
        return segment.get(LAYOUT$maxPerStageDescriptorUniformBuffers, OFFSET$maxPerStageDescriptorUniformBuffers);
    }

    public void maxPerStageDescriptorUniformBuffers(@unsigned int value) {
        segment.set(LAYOUT$maxPerStageDescriptorUniformBuffers, OFFSET$maxPerStageDescriptorUniformBuffers, value);
    }

    public @unsigned int maxPerStageDescriptorStorageBuffers() {
        return segment.get(LAYOUT$maxPerStageDescriptorStorageBuffers, OFFSET$maxPerStageDescriptorStorageBuffers);
    }

    public void maxPerStageDescriptorStorageBuffers(@unsigned int value) {
        segment.set(LAYOUT$maxPerStageDescriptorStorageBuffers, OFFSET$maxPerStageDescriptorStorageBuffers, value);
    }

    public @unsigned int maxPerStageDescriptorSampledImages() {
        return segment.get(LAYOUT$maxPerStageDescriptorSampledImages, OFFSET$maxPerStageDescriptorSampledImages);
    }

    public void maxPerStageDescriptorSampledImages(@unsigned int value) {
        segment.set(LAYOUT$maxPerStageDescriptorSampledImages, OFFSET$maxPerStageDescriptorSampledImages, value);
    }

    public @unsigned int maxPerStageDescriptorStorageImages() {
        return segment.get(LAYOUT$maxPerStageDescriptorStorageImages, OFFSET$maxPerStageDescriptorStorageImages);
    }

    public void maxPerStageDescriptorStorageImages(@unsigned int value) {
        segment.set(LAYOUT$maxPerStageDescriptorStorageImages, OFFSET$maxPerStageDescriptorStorageImages, value);
    }

    public @unsigned int maxPerStageDescriptorInputAttachments() {
        return segment.get(LAYOUT$maxPerStageDescriptorInputAttachments, OFFSET$maxPerStageDescriptorInputAttachments);
    }

    public void maxPerStageDescriptorInputAttachments(@unsigned int value) {
        segment.set(LAYOUT$maxPerStageDescriptorInputAttachments, OFFSET$maxPerStageDescriptorInputAttachments, value);
    }

    public @unsigned int maxPerStageResources() {
        return segment.get(LAYOUT$maxPerStageResources, OFFSET$maxPerStageResources);
    }

    public void maxPerStageResources(@unsigned int value) {
        segment.set(LAYOUT$maxPerStageResources, OFFSET$maxPerStageResources, value);
    }

    public @unsigned int maxDescriptorSetSamplers() {
        return segment.get(LAYOUT$maxDescriptorSetSamplers, OFFSET$maxDescriptorSetSamplers);
    }

    public void maxDescriptorSetSamplers(@unsigned int value) {
        segment.set(LAYOUT$maxDescriptorSetSamplers, OFFSET$maxDescriptorSetSamplers, value);
    }

    public @unsigned int maxDescriptorSetUniformBuffers() {
        return segment.get(LAYOUT$maxDescriptorSetUniformBuffers, OFFSET$maxDescriptorSetUniformBuffers);
    }

    public void maxDescriptorSetUniformBuffers(@unsigned int value) {
        segment.set(LAYOUT$maxDescriptorSetUniformBuffers, OFFSET$maxDescriptorSetUniformBuffers, value);
    }

    public @unsigned int maxDescriptorSetUniformBuffersDynamic() {
        return segment.get(LAYOUT$maxDescriptorSetUniformBuffersDynamic, OFFSET$maxDescriptorSetUniformBuffersDynamic);
    }

    public void maxDescriptorSetUniformBuffersDynamic(@unsigned int value) {
        segment.set(LAYOUT$maxDescriptorSetUniformBuffersDynamic, OFFSET$maxDescriptorSetUniformBuffersDynamic, value);
    }

    public @unsigned int maxDescriptorSetStorageBuffers() {
        return segment.get(LAYOUT$maxDescriptorSetStorageBuffers, OFFSET$maxDescriptorSetStorageBuffers);
    }

    public void maxDescriptorSetStorageBuffers(@unsigned int value) {
        segment.set(LAYOUT$maxDescriptorSetStorageBuffers, OFFSET$maxDescriptorSetStorageBuffers, value);
    }

    public @unsigned int maxDescriptorSetStorageBuffersDynamic() {
        return segment.get(LAYOUT$maxDescriptorSetStorageBuffersDynamic, OFFSET$maxDescriptorSetStorageBuffersDynamic);
    }

    public void maxDescriptorSetStorageBuffersDynamic(@unsigned int value) {
        segment.set(LAYOUT$maxDescriptorSetStorageBuffersDynamic, OFFSET$maxDescriptorSetStorageBuffersDynamic, value);
    }

    public @unsigned int maxDescriptorSetSampledImages() {
        return segment.get(LAYOUT$maxDescriptorSetSampledImages, OFFSET$maxDescriptorSetSampledImages);
    }

    public void maxDescriptorSetSampledImages(@unsigned int value) {
        segment.set(LAYOUT$maxDescriptorSetSampledImages, OFFSET$maxDescriptorSetSampledImages, value);
    }

    public @unsigned int maxDescriptorSetStorageImages() {
        return segment.get(LAYOUT$maxDescriptorSetStorageImages, OFFSET$maxDescriptorSetStorageImages);
    }

    public void maxDescriptorSetStorageImages(@unsigned int value) {
        segment.set(LAYOUT$maxDescriptorSetStorageImages, OFFSET$maxDescriptorSetStorageImages, value);
    }

    public @unsigned int maxDescriptorSetInputAttachments() {
        return segment.get(LAYOUT$maxDescriptorSetInputAttachments, OFFSET$maxDescriptorSetInputAttachments);
    }

    public void maxDescriptorSetInputAttachments(@unsigned int value) {
        segment.set(LAYOUT$maxDescriptorSetInputAttachments, OFFSET$maxDescriptorSetInputAttachments, value);
    }

    public @unsigned int maxVertexInputAttributes() {
        return segment.get(LAYOUT$maxVertexInputAttributes, OFFSET$maxVertexInputAttributes);
    }

    public void maxVertexInputAttributes(@unsigned int value) {
        segment.set(LAYOUT$maxVertexInputAttributes, OFFSET$maxVertexInputAttributes, value);
    }

    public @unsigned int maxVertexInputBindings() {
        return segment.get(LAYOUT$maxVertexInputBindings, OFFSET$maxVertexInputBindings);
    }

    public void maxVertexInputBindings(@unsigned int value) {
        segment.set(LAYOUT$maxVertexInputBindings, OFFSET$maxVertexInputBindings, value);
    }

    public @unsigned int maxVertexInputAttributeOffset() {
        return segment.get(LAYOUT$maxVertexInputAttributeOffset, OFFSET$maxVertexInputAttributeOffset);
    }

    public void maxVertexInputAttributeOffset(@unsigned int value) {
        segment.set(LAYOUT$maxVertexInputAttributeOffset, OFFSET$maxVertexInputAttributeOffset, value);
    }

    public @unsigned int maxVertexInputBindingStride() {
        return segment.get(LAYOUT$maxVertexInputBindingStride, OFFSET$maxVertexInputBindingStride);
    }

    public void maxVertexInputBindingStride(@unsigned int value) {
        segment.set(LAYOUT$maxVertexInputBindingStride, OFFSET$maxVertexInputBindingStride, value);
    }

    public @unsigned int maxVertexOutputComponents() {
        return segment.get(LAYOUT$maxVertexOutputComponents, OFFSET$maxVertexOutputComponents);
    }

    public void maxVertexOutputComponents(@unsigned int value) {
        segment.set(LAYOUT$maxVertexOutputComponents, OFFSET$maxVertexOutputComponents, value);
    }

    public @unsigned int maxTessellationGenerationLevel() {
        return segment.get(LAYOUT$maxTessellationGenerationLevel, OFFSET$maxTessellationGenerationLevel);
    }

    public void maxTessellationGenerationLevel(@unsigned int value) {
        segment.set(LAYOUT$maxTessellationGenerationLevel, OFFSET$maxTessellationGenerationLevel, value);
    }

    public @unsigned int maxTessellationPatchSize() {
        return segment.get(LAYOUT$maxTessellationPatchSize, OFFSET$maxTessellationPatchSize);
    }

    public void maxTessellationPatchSize(@unsigned int value) {
        segment.set(LAYOUT$maxTessellationPatchSize, OFFSET$maxTessellationPatchSize, value);
    }

    public @unsigned int maxTessellationControlPerVertexInputComponents() {
        return segment.get(LAYOUT$maxTessellationControlPerVertexInputComponents, OFFSET$maxTessellationControlPerVertexInputComponents);
    }

    public void maxTessellationControlPerVertexInputComponents(@unsigned int value) {
        segment.set(LAYOUT$maxTessellationControlPerVertexInputComponents, OFFSET$maxTessellationControlPerVertexInputComponents, value);
    }

    public @unsigned int maxTessellationControlPerVertexOutputComponents() {
        return segment.get(LAYOUT$maxTessellationControlPerVertexOutputComponents, OFFSET$maxTessellationControlPerVertexOutputComponents);
    }

    public void maxTessellationControlPerVertexOutputComponents(@unsigned int value) {
        segment.set(LAYOUT$maxTessellationControlPerVertexOutputComponents, OFFSET$maxTessellationControlPerVertexOutputComponents, value);
    }

    public @unsigned int maxTessellationControlPerPatchOutputComponents() {
        return segment.get(LAYOUT$maxTessellationControlPerPatchOutputComponents, OFFSET$maxTessellationControlPerPatchOutputComponents);
    }

    public void maxTessellationControlPerPatchOutputComponents(@unsigned int value) {
        segment.set(LAYOUT$maxTessellationControlPerPatchOutputComponents, OFFSET$maxTessellationControlPerPatchOutputComponents, value);
    }

    public @unsigned int maxTessellationControlTotalOutputComponents() {
        return segment.get(LAYOUT$maxTessellationControlTotalOutputComponents, OFFSET$maxTessellationControlTotalOutputComponents);
    }

    public void maxTessellationControlTotalOutputComponents(@unsigned int value) {
        segment.set(LAYOUT$maxTessellationControlTotalOutputComponents, OFFSET$maxTessellationControlTotalOutputComponents, value);
    }

    public @unsigned int maxTessellationEvaluationInputComponents() {
        return segment.get(LAYOUT$maxTessellationEvaluationInputComponents, OFFSET$maxTessellationEvaluationInputComponents);
    }

    public void maxTessellationEvaluationInputComponents(@unsigned int value) {
        segment.set(LAYOUT$maxTessellationEvaluationInputComponents, OFFSET$maxTessellationEvaluationInputComponents, value);
    }

    public @unsigned int maxTessellationEvaluationOutputComponents() {
        return segment.get(LAYOUT$maxTessellationEvaluationOutputComponents, OFFSET$maxTessellationEvaluationOutputComponents);
    }

    public void maxTessellationEvaluationOutputComponents(@unsigned int value) {
        segment.set(LAYOUT$maxTessellationEvaluationOutputComponents, OFFSET$maxTessellationEvaluationOutputComponents, value);
    }

    public @unsigned int maxGeometryShaderInvocations() {
        return segment.get(LAYOUT$maxGeometryShaderInvocations, OFFSET$maxGeometryShaderInvocations);
    }

    public void maxGeometryShaderInvocations(@unsigned int value) {
        segment.set(LAYOUT$maxGeometryShaderInvocations, OFFSET$maxGeometryShaderInvocations, value);
    }

    public @unsigned int maxGeometryInputComponents() {
        return segment.get(LAYOUT$maxGeometryInputComponents, OFFSET$maxGeometryInputComponents);
    }

    public void maxGeometryInputComponents(@unsigned int value) {
        segment.set(LAYOUT$maxGeometryInputComponents, OFFSET$maxGeometryInputComponents, value);
    }

    public @unsigned int maxGeometryOutputComponents() {
        return segment.get(LAYOUT$maxGeometryOutputComponents, OFFSET$maxGeometryOutputComponents);
    }

    public void maxGeometryOutputComponents(@unsigned int value) {
        segment.set(LAYOUT$maxGeometryOutputComponents, OFFSET$maxGeometryOutputComponents, value);
    }

    public @unsigned int maxGeometryOutputVertices() {
        return segment.get(LAYOUT$maxGeometryOutputVertices, OFFSET$maxGeometryOutputVertices);
    }

    public void maxGeometryOutputVertices(@unsigned int value) {
        segment.set(LAYOUT$maxGeometryOutputVertices, OFFSET$maxGeometryOutputVertices, value);
    }

    public @unsigned int maxGeometryTotalOutputComponents() {
        return segment.get(LAYOUT$maxGeometryTotalOutputComponents, OFFSET$maxGeometryTotalOutputComponents);
    }

    public void maxGeometryTotalOutputComponents(@unsigned int value) {
        segment.set(LAYOUT$maxGeometryTotalOutputComponents, OFFSET$maxGeometryTotalOutputComponents, value);
    }

    public @unsigned int maxFragmentInputComponents() {
        return segment.get(LAYOUT$maxFragmentInputComponents, OFFSET$maxFragmentInputComponents);
    }

    public void maxFragmentInputComponents(@unsigned int value) {
        segment.set(LAYOUT$maxFragmentInputComponents, OFFSET$maxFragmentInputComponents, value);
    }

    public @unsigned int maxFragmentOutputAttachments() {
        return segment.get(LAYOUT$maxFragmentOutputAttachments, OFFSET$maxFragmentOutputAttachments);
    }

    public void maxFragmentOutputAttachments(@unsigned int value) {
        segment.set(LAYOUT$maxFragmentOutputAttachments, OFFSET$maxFragmentOutputAttachments, value);
    }

    public @unsigned int maxFragmentDualSrcAttachments() {
        return segment.get(LAYOUT$maxFragmentDualSrcAttachments, OFFSET$maxFragmentDualSrcAttachments);
    }

    public void maxFragmentDualSrcAttachments(@unsigned int value) {
        segment.set(LAYOUT$maxFragmentDualSrcAttachments, OFFSET$maxFragmentDualSrcAttachments, value);
    }

    public @unsigned int maxFragmentCombinedOutputResources() {
        return segment.get(LAYOUT$maxFragmentCombinedOutputResources, OFFSET$maxFragmentCombinedOutputResources);
    }

    public void maxFragmentCombinedOutputResources(@unsigned int value) {
        segment.set(LAYOUT$maxFragmentCombinedOutputResources, OFFSET$maxFragmentCombinedOutputResources, value);
    }

    public @unsigned int maxComputeSharedMemorySize() {
        return segment.get(LAYOUT$maxComputeSharedMemorySize, OFFSET$maxComputeSharedMemorySize);
    }

    public void maxComputeSharedMemorySize(@unsigned int value) {
        segment.set(LAYOUT$maxComputeSharedMemorySize, OFFSET$maxComputeSharedMemorySize, value);
    }

    public @unsigned int maxComputeWorkGroupCount() {
        return segment.get(LAYOUT$maxComputeWorkGroupCount, OFFSET$maxComputeWorkGroupCount);
    }

    public void maxComputeWorkGroupCount(@unsigned int value) {
        segment.set(LAYOUT$maxComputeWorkGroupCount, OFFSET$maxComputeWorkGroupCount, value);
    }

    public @unsigned int maxComputeWorkGroupInvocations() {
        return segment.get(LAYOUT$maxComputeWorkGroupInvocations, OFFSET$maxComputeWorkGroupInvocations);
    }

    public void maxComputeWorkGroupInvocations(@unsigned int value) {
        segment.set(LAYOUT$maxComputeWorkGroupInvocations, OFFSET$maxComputeWorkGroupInvocations, value);
    }

    public @unsigned int maxComputeWorkGroupSize() {
        return segment.get(LAYOUT$maxComputeWorkGroupSize, OFFSET$maxComputeWorkGroupSize);
    }

    public void maxComputeWorkGroupSize(@unsigned int value) {
        segment.set(LAYOUT$maxComputeWorkGroupSize, OFFSET$maxComputeWorkGroupSize, value);
    }

    public @unsigned int subPixelPrecisionBits() {
        return segment.get(LAYOUT$subPixelPrecisionBits, OFFSET$subPixelPrecisionBits);
    }

    public void subPixelPrecisionBits(@unsigned int value) {
        segment.set(LAYOUT$subPixelPrecisionBits, OFFSET$subPixelPrecisionBits, value);
    }

    public @unsigned int subTexelPrecisionBits() {
        return segment.get(LAYOUT$subTexelPrecisionBits, OFFSET$subTexelPrecisionBits);
    }

    public void subTexelPrecisionBits(@unsigned int value) {
        segment.set(LAYOUT$subTexelPrecisionBits, OFFSET$subTexelPrecisionBits, value);
    }

    public @unsigned int mipmapPrecisionBits() {
        return segment.get(LAYOUT$mipmapPrecisionBits, OFFSET$mipmapPrecisionBits);
    }

    public void mipmapPrecisionBits(@unsigned int value) {
        segment.set(LAYOUT$mipmapPrecisionBits, OFFSET$mipmapPrecisionBits, value);
    }

    public @unsigned int maxDrawIndexedIndexValue() {
        return segment.get(LAYOUT$maxDrawIndexedIndexValue, OFFSET$maxDrawIndexedIndexValue);
    }

    public void maxDrawIndexedIndexValue(@unsigned int value) {
        segment.set(LAYOUT$maxDrawIndexedIndexValue, OFFSET$maxDrawIndexedIndexValue, value);
    }

    public @unsigned int maxDrawIndirectCount() {
        return segment.get(LAYOUT$maxDrawIndirectCount, OFFSET$maxDrawIndirectCount);
    }

    public void maxDrawIndirectCount(@unsigned int value) {
        segment.set(LAYOUT$maxDrawIndirectCount, OFFSET$maxDrawIndirectCount, value);
    }

    public float maxSamplerLodBias() {
        return segment.get(LAYOUT$maxSamplerLodBias, OFFSET$maxSamplerLodBias);
    }

    public void maxSamplerLodBias(float value) {
        segment.set(LAYOUT$maxSamplerLodBias, OFFSET$maxSamplerLodBias, value);
    }

    public float maxSamplerAnisotropy() {
        return segment.get(LAYOUT$maxSamplerAnisotropy, OFFSET$maxSamplerAnisotropy);
    }

    public void maxSamplerAnisotropy(float value) {
        segment.set(LAYOUT$maxSamplerAnisotropy, OFFSET$maxSamplerAnisotropy, value);
    }

    public @unsigned int maxViewports() {
        return segment.get(LAYOUT$maxViewports, OFFSET$maxViewports);
    }

    public void maxViewports(@unsigned int value) {
        segment.set(LAYOUT$maxViewports, OFFSET$maxViewports, value);
    }

    public @unsigned int maxViewportDimensions() {
        return segment.get(LAYOUT$maxViewportDimensions, OFFSET$maxViewportDimensions);
    }

    public void maxViewportDimensions(@unsigned int value) {
        segment.set(LAYOUT$maxViewportDimensions, OFFSET$maxViewportDimensions, value);
    }

    public float viewportBoundsRange() {
        return segment.get(LAYOUT$viewportBoundsRange, OFFSET$viewportBoundsRange);
    }

    public void viewportBoundsRange(float value) {
        segment.set(LAYOUT$viewportBoundsRange, OFFSET$viewportBoundsRange, value);
    }

    public @unsigned int viewportSubPixelBits() {
        return segment.get(LAYOUT$viewportSubPixelBits, OFFSET$viewportSubPixelBits);
    }

    public void viewportSubPixelBits(@unsigned int value) {
        segment.set(LAYOUT$viewportSubPixelBits, OFFSET$viewportSubPixelBits, value);
    }

    public @unsigned long minMemoryMapAlignment() {
        return NativeLayout.readCSizeT(segment, OFFSET$minMemoryMapAlignment);
    }

    public void minMemoryMapAlignment(@unsigned long value) {
        NativeLayout.writeCSizeT(segment, OFFSET$minMemoryMapAlignment, value);
    }

    public @unsigned long minTexelBufferOffsetAlignment() {
        return segment.get(LAYOUT$minTexelBufferOffsetAlignment, OFFSET$minTexelBufferOffsetAlignment);
    }

    public void minTexelBufferOffsetAlignment(@unsigned long value) {
        segment.set(LAYOUT$minTexelBufferOffsetAlignment, OFFSET$minTexelBufferOffsetAlignment, value);
    }

    public @unsigned long minUniformBufferOffsetAlignment() {
        return segment.get(LAYOUT$minUniformBufferOffsetAlignment, OFFSET$minUniformBufferOffsetAlignment);
    }

    public void minUniformBufferOffsetAlignment(@unsigned long value) {
        segment.set(LAYOUT$minUniformBufferOffsetAlignment, OFFSET$minUniformBufferOffsetAlignment, value);
    }

    public @unsigned long minStorageBufferOffsetAlignment() {
        return segment.get(LAYOUT$minStorageBufferOffsetAlignment, OFFSET$minStorageBufferOffsetAlignment);
    }

    public void minStorageBufferOffsetAlignment(@unsigned long value) {
        segment.set(LAYOUT$minStorageBufferOffsetAlignment, OFFSET$minStorageBufferOffsetAlignment, value);
    }

    public int minTexelOffset() {
        return segment.get(LAYOUT$minTexelOffset, OFFSET$minTexelOffset);
    }

    public void minTexelOffset(int value) {
        segment.set(LAYOUT$minTexelOffset, OFFSET$minTexelOffset, value);
    }

    public @unsigned int maxTexelOffset() {
        return segment.get(LAYOUT$maxTexelOffset, OFFSET$maxTexelOffset);
    }

    public void maxTexelOffset(@unsigned int value) {
        segment.set(LAYOUT$maxTexelOffset, OFFSET$maxTexelOffset, value);
    }

    public int minTexelGatherOffset() {
        return segment.get(LAYOUT$minTexelGatherOffset, OFFSET$minTexelGatherOffset);
    }

    public void minTexelGatherOffset(int value) {
        segment.set(LAYOUT$minTexelGatherOffset, OFFSET$minTexelGatherOffset, value);
    }

    public @unsigned int maxTexelGatherOffset() {
        return segment.get(LAYOUT$maxTexelGatherOffset, OFFSET$maxTexelGatherOffset);
    }

    public void maxTexelGatherOffset(@unsigned int value) {
        segment.set(LAYOUT$maxTexelGatherOffset, OFFSET$maxTexelGatherOffset, value);
    }

    public float minInterpolationOffset() {
        return segment.get(LAYOUT$minInterpolationOffset, OFFSET$minInterpolationOffset);
    }

    public void minInterpolationOffset(float value) {
        segment.set(LAYOUT$minInterpolationOffset, OFFSET$minInterpolationOffset, value);
    }

    public float maxInterpolationOffset() {
        return segment.get(LAYOUT$maxInterpolationOffset, OFFSET$maxInterpolationOffset);
    }

    public void maxInterpolationOffset(float value) {
        segment.set(LAYOUT$maxInterpolationOffset, OFFSET$maxInterpolationOffset, value);
    }

    public @unsigned int subPixelInterpolationOffsetBits() {
        return segment.get(LAYOUT$subPixelInterpolationOffsetBits, OFFSET$subPixelInterpolationOffsetBits);
    }

    public void subPixelInterpolationOffsetBits(@unsigned int value) {
        segment.set(LAYOUT$subPixelInterpolationOffsetBits, OFFSET$subPixelInterpolationOffsetBits, value);
    }

    public @unsigned int maxFramebufferWidth() {
        return segment.get(LAYOUT$maxFramebufferWidth, OFFSET$maxFramebufferWidth);
    }

    public void maxFramebufferWidth(@unsigned int value) {
        segment.set(LAYOUT$maxFramebufferWidth, OFFSET$maxFramebufferWidth, value);
    }

    public @unsigned int maxFramebufferHeight() {
        return segment.get(LAYOUT$maxFramebufferHeight, OFFSET$maxFramebufferHeight);
    }

    public void maxFramebufferHeight(@unsigned int value) {
        segment.set(LAYOUT$maxFramebufferHeight, OFFSET$maxFramebufferHeight, value);
    }

    public @unsigned int maxFramebufferLayers() {
        return segment.get(LAYOUT$maxFramebufferLayers, OFFSET$maxFramebufferLayers);
    }

    public void maxFramebufferLayers(@unsigned int value) {
        segment.set(LAYOUT$maxFramebufferLayers, OFFSET$maxFramebufferLayers, value);
    }

    public @enumtype(VkSampleCountFlags.class) int framebufferColorSampleCounts() {
        return segment.get(LAYOUT$framebufferColorSampleCounts, OFFSET$framebufferColorSampleCounts);
    }

    public void framebufferColorSampleCounts(@enumtype(VkSampleCountFlags.class) int value) {
        segment.set(LAYOUT$framebufferColorSampleCounts, OFFSET$framebufferColorSampleCounts, value);
    }

    public @enumtype(VkSampleCountFlags.class) int framebufferDepthSampleCounts() {
        return segment.get(LAYOUT$framebufferDepthSampleCounts, OFFSET$framebufferDepthSampleCounts);
    }

    public void framebufferDepthSampleCounts(@enumtype(VkSampleCountFlags.class) int value) {
        segment.set(LAYOUT$framebufferDepthSampleCounts, OFFSET$framebufferDepthSampleCounts, value);
    }

    public @enumtype(VkSampleCountFlags.class) int framebufferStencilSampleCounts() {
        return segment.get(LAYOUT$framebufferStencilSampleCounts, OFFSET$framebufferStencilSampleCounts);
    }

    public void framebufferStencilSampleCounts(@enumtype(VkSampleCountFlags.class) int value) {
        segment.set(LAYOUT$framebufferStencilSampleCounts, OFFSET$framebufferStencilSampleCounts, value);
    }

    public @enumtype(VkSampleCountFlags.class) int framebufferNoAttachmentsSampleCounts() {
        return segment.get(LAYOUT$framebufferNoAttachmentsSampleCounts, OFFSET$framebufferNoAttachmentsSampleCounts);
    }

    public void framebufferNoAttachmentsSampleCounts(@enumtype(VkSampleCountFlags.class) int value) {
        segment.set(LAYOUT$framebufferNoAttachmentsSampleCounts, OFFSET$framebufferNoAttachmentsSampleCounts, value);
    }

    public @unsigned int maxColorAttachments() {
        return segment.get(LAYOUT$maxColorAttachments, OFFSET$maxColorAttachments);
    }

    public void maxColorAttachments(@unsigned int value) {
        segment.set(LAYOUT$maxColorAttachments, OFFSET$maxColorAttachments, value);
    }

    public @enumtype(VkSampleCountFlags.class) int sampledImageColorSampleCounts() {
        return segment.get(LAYOUT$sampledImageColorSampleCounts, OFFSET$sampledImageColorSampleCounts);
    }

    public void sampledImageColorSampleCounts(@enumtype(VkSampleCountFlags.class) int value) {
        segment.set(LAYOUT$sampledImageColorSampleCounts, OFFSET$sampledImageColorSampleCounts, value);
    }

    public @enumtype(VkSampleCountFlags.class) int sampledImageIntegerSampleCounts() {
        return segment.get(LAYOUT$sampledImageIntegerSampleCounts, OFFSET$sampledImageIntegerSampleCounts);
    }

    public void sampledImageIntegerSampleCounts(@enumtype(VkSampleCountFlags.class) int value) {
        segment.set(LAYOUT$sampledImageIntegerSampleCounts, OFFSET$sampledImageIntegerSampleCounts, value);
    }

    public @enumtype(VkSampleCountFlags.class) int sampledImageDepthSampleCounts() {
        return segment.get(LAYOUT$sampledImageDepthSampleCounts, OFFSET$sampledImageDepthSampleCounts);
    }

    public void sampledImageDepthSampleCounts(@enumtype(VkSampleCountFlags.class) int value) {
        segment.set(LAYOUT$sampledImageDepthSampleCounts, OFFSET$sampledImageDepthSampleCounts, value);
    }

    public @enumtype(VkSampleCountFlags.class) int sampledImageStencilSampleCounts() {
        return segment.get(LAYOUT$sampledImageStencilSampleCounts, OFFSET$sampledImageStencilSampleCounts);
    }

    public void sampledImageStencilSampleCounts(@enumtype(VkSampleCountFlags.class) int value) {
        segment.set(LAYOUT$sampledImageStencilSampleCounts, OFFSET$sampledImageStencilSampleCounts, value);
    }

    public @enumtype(VkSampleCountFlags.class) int storageImageSampleCounts() {
        return segment.get(LAYOUT$storageImageSampleCounts, OFFSET$storageImageSampleCounts);
    }

    public void storageImageSampleCounts(@enumtype(VkSampleCountFlags.class) int value) {
        segment.set(LAYOUT$storageImageSampleCounts, OFFSET$storageImageSampleCounts, value);
    }

    public @unsigned int maxSampleMaskWords() {
        return segment.get(LAYOUT$maxSampleMaskWords, OFFSET$maxSampleMaskWords);
    }

    public void maxSampleMaskWords(@unsigned int value) {
        segment.set(LAYOUT$maxSampleMaskWords, OFFSET$maxSampleMaskWords, value);
    }

    public @unsigned int timestampComputeAndGraphics() {
        return segment.get(LAYOUT$timestampComputeAndGraphics, OFFSET$timestampComputeAndGraphics);
    }

    public void timestampComputeAndGraphics(@unsigned int value) {
        segment.set(LAYOUT$timestampComputeAndGraphics, OFFSET$timestampComputeAndGraphics, value);
    }

    public float timestampPeriod() {
        return segment.get(LAYOUT$timestampPeriod, OFFSET$timestampPeriod);
    }

    public void timestampPeriod(float value) {
        segment.set(LAYOUT$timestampPeriod, OFFSET$timestampPeriod, value);
    }

    public @unsigned int maxClipDistances() {
        return segment.get(LAYOUT$maxClipDistances, OFFSET$maxClipDistances);
    }

    public void maxClipDistances(@unsigned int value) {
        segment.set(LAYOUT$maxClipDistances, OFFSET$maxClipDistances, value);
    }

    public @unsigned int maxCullDistances() {
        return segment.get(LAYOUT$maxCullDistances, OFFSET$maxCullDistances);
    }

    public void maxCullDistances(@unsigned int value) {
        segment.set(LAYOUT$maxCullDistances, OFFSET$maxCullDistances, value);
    }

    public @unsigned int maxCombinedClipAndCullDistances() {
        return segment.get(LAYOUT$maxCombinedClipAndCullDistances, OFFSET$maxCombinedClipAndCullDistances);
    }

    public void maxCombinedClipAndCullDistances(@unsigned int value) {
        segment.set(LAYOUT$maxCombinedClipAndCullDistances, OFFSET$maxCombinedClipAndCullDistances, value);
    }

    public @unsigned int discreteQueuePriorities() {
        return segment.get(LAYOUT$discreteQueuePriorities, OFFSET$discreteQueuePriorities);
    }

    public void discreteQueuePriorities(@unsigned int value) {
        segment.set(LAYOUT$discreteQueuePriorities, OFFSET$discreteQueuePriorities, value);
    }

    public float pointSizeRange() {
        return segment.get(LAYOUT$pointSizeRange, OFFSET$pointSizeRange);
    }

    public void pointSizeRange(float value) {
        segment.set(LAYOUT$pointSizeRange, OFFSET$pointSizeRange, value);
    }

    public float lineWidthRange() {
        return segment.get(LAYOUT$lineWidthRange, OFFSET$lineWidthRange);
    }

    public void lineWidthRange(float value) {
        segment.set(LAYOUT$lineWidthRange, OFFSET$lineWidthRange, value);
    }

    public float pointSizeGranularity() {
        return segment.get(LAYOUT$pointSizeGranularity, OFFSET$pointSizeGranularity);
    }

    public void pointSizeGranularity(float value) {
        segment.set(LAYOUT$pointSizeGranularity, OFFSET$pointSizeGranularity, value);
    }

    public float lineWidthGranularity() {
        return segment.get(LAYOUT$lineWidthGranularity, OFFSET$lineWidthGranularity);
    }

    public void lineWidthGranularity(float value) {
        segment.set(LAYOUT$lineWidthGranularity, OFFSET$lineWidthGranularity, value);
    }

    public @unsigned int strictLines() {
        return segment.get(LAYOUT$strictLines, OFFSET$strictLines);
    }

    public void strictLines(@unsigned int value) {
        segment.set(LAYOUT$strictLines, OFFSET$strictLines, value);
    }

    public @unsigned int standardSampleLocations() {
        return segment.get(LAYOUT$standardSampleLocations, OFFSET$standardSampleLocations);
    }

    public void standardSampleLocations(@unsigned int value) {
        segment.set(LAYOUT$standardSampleLocations, OFFSET$standardSampleLocations, value);
    }

    public @unsigned long optimalBufferCopyOffsetAlignment() {
        return segment.get(LAYOUT$optimalBufferCopyOffsetAlignment, OFFSET$optimalBufferCopyOffsetAlignment);
    }

    public void optimalBufferCopyOffsetAlignment(@unsigned long value) {
        segment.set(LAYOUT$optimalBufferCopyOffsetAlignment, OFFSET$optimalBufferCopyOffsetAlignment, value);
    }

    public @unsigned long optimalBufferCopyRowPitchAlignment() {
        return segment.get(LAYOUT$optimalBufferCopyRowPitchAlignment, OFFSET$optimalBufferCopyRowPitchAlignment);
    }

    public void optimalBufferCopyRowPitchAlignment(@unsigned long value) {
        segment.set(LAYOUT$optimalBufferCopyRowPitchAlignment, OFFSET$optimalBufferCopyRowPitchAlignment, value);
    }

    public @unsigned long nonCoherentAtomSize() {
        return segment.get(LAYOUT$nonCoherentAtomSize, OFFSET$nonCoherentAtomSize);
    }

    public void nonCoherentAtomSize(@unsigned long value) {
        segment.set(LAYOUT$nonCoherentAtomSize, OFFSET$nonCoherentAtomSize, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("maxImageDimension1D"),
        ValueLayout.JAVA_INT.withName("maxImageDimension2D"),
        ValueLayout.JAVA_INT.withName("maxImageDimension3D"),
        ValueLayout.JAVA_INT.withName("maxImageDimensionCube"),
        ValueLayout.JAVA_INT.withName("maxImageArrayLayers"),
        ValueLayout.JAVA_INT.withName("maxTexelBufferElements"),
        ValueLayout.JAVA_INT.withName("maxUniformBufferRange"),
        ValueLayout.JAVA_INT.withName("maxStorageBufferRange"),
        ValueLayout.JAVA_INT.withName("maxPushConstantsSize"),
        ValueLayout.JAVA_INT.withName("maxMemoryAllocationCount"),
        ValueLayout.JAVA_INT.withName("maxSamplerAllocationCount"),
        ValueLayout.JAVA_LONG.withName("bufferImageGranularity"),
        ValueLayout.JAVA_LONG.withName("sparseAddressSpaceSize"),
        ValueLayout.JAVA_INT.withName("maxBoundDescriptorSets"),
        ValueLayout.JAVA_INT.withName("maxPerStageDescriptorSamplers"),
        ValueLayout.JAVA_INT.withName("maxPerStageDescriptorUniformBuffers"),
        ValueLayout.JAVA_INT.withName("maxPerStageDescriptorStorageBuffers"),
        ValueLayout.JAVA_INT.withName("maxPerStageDescriptorSampledImages"),
        ValueLayout.JAVA_INT.withName("maxPerStageDescriptorStorageImages"),
        ValueLayout.JAVA_INT.withName("maxPerStageDescriptorInputAttachments"),
        ValueLayout.JAVA_INT.withName("maxPerStageResources"),
        ValueLayout.JAVA_INT.withName("maxDescriptorSetSamplers"),
        ValueLayout.JAVA_INT.withName("maxDescriptorSetUniformBuffers"),
        ValueLayout.JAVA_INT.withName("maxDescriptorSetUniformBuffersDynamic"),
        ValueLayout.JAVA_INT.withName("maxDescriptorSetStorageBuffers"),
        ValueLayout.JAVA_INT.withName("maxDescriptorSetStorageBuffersDynamic"),
        ValueLayout.JAVA_INT.withName("maxDescriptorSetSampledImages"),
        ValueLayout.JAVA_INT.withName("maxDescriptorSetStorageImages"),
        ValueLayout.JAVA_INT.withName("maxDescriptorSetInputAttachments"),
        ValueLayout.JAVA_INT.withName("maxVertexInputAttributes"),
        ValueLayout.JAVA_INT.withName("maxVertexInputBindings"),
        ValueLayout.JAVA_INT.withName("maxVertexInputAttributeOffset"),
        ValueLayout.JAVA_INT.withName("maxVertexInputBindingStride"),
        ValueLayout.JAVA_INT.withName("maxVertexOutputComponents"),
        ValueLayout.JAVA_INT.withName("maxTessellationGenerationLevel"),
        ValueLayout.JAVA_INT.withName("maxTessellationPatchSize"),
        ValueLayout.JAVA_INT.withName("maxTessellationControlPerVertexInputComponents"),
        ValueLayout.JAVA_INT.withName("maxTessellationControlPerVertexOutputComponents"),
        ValueLayout.JAVA_INT.withName("maxTessellationControlPerPatchOutputComponents"),
        ValueLayout.JAVA_INT.withName("maxTessellationControlTotalOutputComponents"),
        ValueLayout.JAVA_INT.withName("maxTessellationEvaluationInputComponents"),
        ValueLayout.JAVA_INT.withName("maxTessellationEvaluationOutputComponents"),
        ValueLayout.JAVA_INT.withName("maxGeometryShaderInvocations"),
        ValueLayout.JAVA_INT.withName("maxGeometryInputComponents"),
        ValueLayout.JAVA_INT.withName("maxGeometryOutputComponents"),
        ValueLayout.JAVA_INT.withName("maxGeometryOutputVertices"),
        ValueLayout.JAVA_INT.withName("maxGeometryTotalOutputComponents"),
        ValueLayout.JAVA_INT.withName("maxFragmentInputComponents"),
        ValueLayout.JAVA_INT.withName("maxFragmentOutputAttachments"),
        ValueLayout.JAVA_INT.withName("maxFragmentDualSrcAttachments"),
        ValueLayout.JAVA_INT.withName("maxFragmentCombinedOutputResources"),
        ValueLayout.JAVA_INT.withName("maxComputeSharedMemorySize"),
        ValueLayout.JAVA_INT.withName("maxComputeWorkGroupCount"),
        ValueLayout.JAVA_INT.withName("maxComputeWorkGroupInvocations"),
        ValueLayout.JAVA_INT.withName("maxComputeWorkGroupSize"),
        ValueLayout.JAVA_INT.withName("subPixelPrecisionBits"),
        ValueLayout.JAVA_INT.withName("subTexelPrecisionBits"),
        ValueLayout.JAVA_INT.withName("mipmapPrecisionBits"),
        ValueLayout.JAVA_INT.withName("maxDrawIndexedIndexValue"),
        ValueLayout.JAVA_INT.withName("maxDrawIndirectCount"),
        ValueLayout.JAVA_FLOAT.withName("maxSamplerLodBias"),
        ValueLayout.JAVA_FLOAT.withName("maxSamplerAnisotropy"),
        ValueLayout.JAVA_INT.withName("maxViewports"),
        ValueLayout.JAVA_INT.withName("maxViewportDimensions"),
        ValueLayout.JAVA_FLOAT.withName("viewportBoundsRange"),
        ValueLayout.JAVA_INT.withName("viewportSubPixelBits"),
        NativeLayout.C_SIZE_T.withName("minMemoryMapAlignment"),
        ValueLayout.JAVA_LONG.withName("minTexelBufferOffsetAlignment"),
        ValueLayout.JAVA_LONG.withName("minUniformBufferOffsetAlignment"),
        ValueLayout.JAVA_LONG.withName("minStorageBufferOffsetAlignment"),
        ValueLayout.JAVA_INT.withName("minTexelOffset"),
        ValueLayout.JAVA_INT.withName("maxTexelOffset"),
        ValueLayout.JAVA_INT.withName("minTexelGatherOffset"),
        ValueLayout.JAVA_INT.withName("maxTexelGatherOffset"),
        ValueLayout.JAVA_FLOAT.withName("minInterpolationOffset"),
        ValueLayout.JAVA_FLOAT.withName("maxInterpolationOffset"),
        ValueLayout.JAVA_INT.withName("subPixelInterpolationOffsetBits"),
        ValueLayout.JAVA_INT.withName("maxFramebufferWidth"),
        ValueLayout.JAVA_INT.withName("maxFramebufferHeight"),
        ValueLayout.JAVA_INT.withName("maxFramebufferLayers"),
        ValueLayout.JAVA_INT.withName("framebufferColorSampleCounts"),
        ValueLayout.JAVA_INT.withName("framebufferDepthSampleCounts"),
        ValueLayout.JAVA_INT.withName("framebufferStencilSampleCounts"),
        ValueLayout.JAVA_INT.withName("framebufferNoAttachmentsSampleCounts"),
        ValueLayout.JAVA_INT.withName("maxColorAttachments"),
        ValueLayout.JAVA_INT.withName("sampledImageColorSampleCounts"),
        ValueLayout.JAVA_INT.withName("sampledImageIntegerSampleCounts"),
        ValueLayout.JAVA_INT.withName("sampledImageDepthSampleCounts"),
        ValueLayout.JAVA_INT.withName("sampledImageStencilSampleCounts"),
        ValueLayout.JAVA_INT.withName("storageImageSampleCounts"),
        ValueLayout.JAVA_INT.withName("maxSampleMaskWords"),
        ValueLayout.JAVA_INT.withName("timestampComputeAndGraphics"),
        ValueLayout.JAVA_FLOAT.withName("timestampPeriod"),
        ValueLayout.JAVA_INT.withName("maxClipDistances"),
        ValueLayout.JAVA_INT.withName("maxCullDistances"),
        ValueLayout.JAVA_INT.withName("maxCombinedClipAndCullDistances"),
        ValueLayout.JAVA_INT.withName("discreteQueuePriorities"),
        ValueLayout.JAVA_FLOAT.withName("pointSizeRange"),
        ValueLayout.JAVA_FLOAT.withName("lineWidthRange"),
        ValueLayout.JAVA_FLOAT.withName("pointSizeGranularity"),
        ValueLayout.JAVA_FLOAT.withName("lineWidthGranularity"),
        ValueLayout.JAVA_INT.withName("strictLines"),
        ValueLayout.JAVA_INT.withName("standardSampleLocations"),
        ValueLayout.JAVA_LONG.withName("optimalBufferCopyOffsetAlignment"),
        ValueLayout.JAVA_LONG.withName("optimalBufferCopyRowPitchAlignment"),
        ValueLayout.JAVA_LONG.withName("nonCoherentAtomSize")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$maxImageDimension1D = PathElement.groupElement("maxImageDimension1D");
    public static final PathElement PATH$maxImageDimension2D = PathElement.groupElement("maxImageDimension2D");
    public static final PathElement PATH$maxImageDimension3D = PathElement.groupElement("maxImageDimension3D");
    public static final PathElement PATH$maxImageDimensionCube = PathElement.groupElement("maxImageDimensionCube");
    public static final PathElement PATH$maxImageArrayLayers = PathElement.groupElement("maxImageArrayLayers");
    public static final PathElement PATH$maxTexelBufferElements = PathElement.groupElement("maxTexelBufferElements");
    public static final PathElement PATH$maxUniformBufferRange = PathElement.groupElement("maxUniformBufferRange");
    public static final PathElement PATH$maxStorageBufferRange = PathElement.groupElement("maxStorageBufferRange");
    public static final PathElement PATH$maxPushConstantsSize = PathElement.groupElement("maxPushConstantsSize");
    public static final PathElement PATH$maxMemoryAllocationCount = PathElement.groupElement("maxMemoryAllocationCount");
    public static final PathElement PATH$maxSamplerAllocationCount = PathElement.groupElement("maxSamplerAllocationCount");
    public static final PathElement PATH$bufferImageGranularity = PathElement.groupElement("bufferImageGranularity");
    public static final PathElement PATH$sparseAddressSpaceSize = PathElement.groupElement("sparseAddressSpaceSize");
    public static final PathElement PATH$maxBoundDescriptorSets = PathElement.groupElement("maxBoundDescriptorSets");
    public static final PathElement PATH$maxPerStageDescriptorSamplers = PathElement.groupElement("maxPerStageDescriptorSamplers");
    public static final PathElement PATH$maxPerStageDescriptorUniformBuffers = PathElement.groupElement("maxPerStageDescriptorUniformBuffers");
    public static final PathElement PATH$maxPerStageDescriptorStorageBuffers = PathElement.groupElement("maxPerStageDescriptorStorageBuffers");
    public static final PathElement PATH$maxPerStageDescriptorSampledImages = PathElement.groupElement("maxPerStageDescriptorSampledImages");
    public static final PathElement PATH$maxPerStageDescriptorStorageImages = PathElement.groupElement("maxPerStageDescriptorStorageImages");
    public static final PathElement PATH$maxPerStageDescriptorInputAttachments = PathElement.groupElement("maxPerStageDescriptorInputAttachments");
    public static final PathElement PATH$maxPerStageResources = PathElement.groupElement("maxPerStageResources");
    public static final PathElement PATH$maxDescriptorSetSamplers = PathElement.groupElement("maxDescriptorSetSamplers");
    public static final PathElement PATH$maxDescriptorSetUniformBuffers = PathElement.groupElement("maxDescriptorSetUniformBuffers");
    public static final PathElement PATH$maxDescriptorSetUniformBuffersDynamic = PathElement.groupElement("maxDescriptorSetUniformBuffersDynamic");
    public static final PathElement PATH$maxDescriptorSetStorageBuffers = PathElement.groupElement("maxDescriptorSetStorageBuffers");
    public static final PathElement PATH$maxDescriptorSetStorageBuffersDynamic = PathElement.groupElement("maxDescriptorSetStorageBuffersDynamic");
    public static final PathElement PATH$maxDescriptorSetSampledImages = PathElement.groupElement("maxDescriptorSetSampledImages");
    public static final PathElement PATH$maxDescriptorSetStorageImages = PathElement.groupElement("maxDescriptorSetStorageImages");
    public static final PathElement PATH$maxDescriptorSetInputAttachments = PathElement.groupElement("maxDescriptorSetInputAttachments");
    public static final PathElement PATH$maxVertexInputAttributes = PathElement.groupElement("maxVertexInputAttributes");
    public static final PathElement PATH$maxVertexInputBindings = PathElement.groupElement("maxVertexInputBindings");
    public static final PathElement PATH$maxVertexInputAttributeOffset = PathElement.groupElement("maxVertexInputAttributeOffset");
    public static final PathElement PATH$maxVertexInputBindingStride = PathElement.groupElement("maxVertexInputBindingStride");
    public static final PathElement PATH$maxVertexOutputComponents = PathElement.groupElement("maxVertexOutputComponents");
    public static final PathElement PATH$maxTessellationGenerationLevel = PathElement.groupElement("maxTessellationGenerationLevel");
    public static final PathElement PATH$maxTessellationPatchSize = PathElement.groupElement("maxTessellationPatchSize");
    public static final PathElement PATH$maxTessellationControlPerVertexInputComponents = PathElement.groupElement("maxTessellationControlPerVertexInputComponents");
    public static final PathElement PATH$maxTessellationControlPerVertexOutputComponents = PathElement.groupElement("maxTessellationControlPerVertexOutputComponents");
    public static final PathElement PATH$maxTessellationControlPerPatchOutputComponents = PathElement.groupElement("maxTessellationControlPerPatchOutputComponents");
    public static final PathElement PATH$maxTessellationControlTotalOutputComponents = PathElement.groupElement("maxTessellationControlTotalOutputComponents");
    public static final PathElement PATH$maxTessellationEvaluationInputComponents = PathElement.groupElement("maxTessellationEvaluationInputComponents");
    public static final PathElement PATH$maxTessellationEvaluationOutputComponents = PathElement.groupElement("maxTessellationEvaluationOutputComponents");
    public static final PathElement PATH$maxGeometryShaderInvocations = PathElement.groupElement("maxGeometryShaderInvocations");
    public static final PathElement PATH$maxGeometryInputComponents = PathElement.groupElement("maxGeometryInputComponents");
    public static final PathElement PATH$maxGeometryOutputComponents = PathElement.groupElement("maxGeometryOutputComponents");
    public static final PathElement PATH$maxGeometryOutputVertices = PathElement.groupElement("maxGeometryOutputVertices");
    public static final PathElement PATH$maxGeometryTotalOutputComponents = PathElement.groupElement("maxGeometryTotalOutputComponents");
    public static final PathElement PATH$maxFragmentInputComponents = PathElement.groupElement("maxFragmentInputComponents");
    public static final PathElement PATH$maxFragmentOutputAttachments = PathElement.groupElement("maxFragmentOutputAttachments");
    public static final PathElement PATH$maxFragmentDualSrcAttachments = PathElement.groupElement("maxFragmentDualSrcAttachments");
    public static final PathElement PATH$maxFragmentCombinedOutputResources = PathElement.groupElement("maxFragmentCombinedOutputResources");
    public static final PathElement PATH$maxComputeSharedMemorySize = PathElement.groupElement("maxComputeSharedMemorySize");
    public static final PathElement PATH$maxComputeWorkGroupCount = PathElement.groupElement("maxComputeWorkGroupCount");
    public static final PathElement PATH$maxComputeWorkGroupInvocations = PathElement.groupElement("maxComputeWorkGroupInvocations");
    public static final PathElement PATH$maxComputeWorkGroupSize = PathElement.groupElement("maxComputeWorkGroupSize");
    public static final PathElement PATH$subPixelPrecisionBits = PathElement.groupElement("subPixelPrecisionBits");
    public static final PathElement PATH$subTexelPrecisionBits = PathElement.groupElement("subTexelPrecisionBits");
    public static final PathElement PATH$mipmapPrecisionBits = PathElement.groupElement("mipmapPrecisionBits");
    public static final PathElement PATH$maxDrawIndexedIndexValue = PathElement.groupElement("maxDrawIndexedIndexValue");
    public static final PathElement PATH$maxDrawIndirectCount = PathElement.groupElement("maxDrawIndirectCount");
    public static final PathElement PATH$maxSamplerLodBias = PathElement.groupElement("maxSamplerLodBias");
    public static final PathElement PATH$maxSamplerAnisotropy = PathElement.groupElement("maxSamplerAnisotropy");
    public static final PathElement PATH$maxViewports = PathElement.groupElement("maxViewports");
    public static final PathElement PATH$maxViewportDimensions = PathElement.groupElement("maxViewportDimensions");
    public static final PathElement PATH$viewportBoundsRange = PathElement.groupElement("viewportBoundsRange");
    public static final PathElement PATH$viewportSubPixelBits = PathElement.groupElement("viewportSubPixelBits");
    public static final PathElement PATH$minMemoryMapAlignment = PathElement.groupElement("minMemoryMapAlignment");
    public static final PathElement PATH$minTexelBufferOffsetAlignment = PathElement.groupElement("minTexelBufferOffsetAlignment");
    public static final PathElement PATH$minUniformBufferOffsetAlignment = PathElement.groupElement("minUniformBufferOffsetAlignment");
    public static final PathElement PATH$minStorageBufferOffsetAlignment = PathElement.groupElement("minStorageBufferOffsetAlignment");
    public static final PathElement PATH$minTexelOffset = PathElement.groupElement("minTexelOffset");
    public static final PathElement PATH$maxTexelOffset = PathElement.groupElement("maxTexelOffset");
    public static final PathElement PATH$minTexelGatherOffset = PathElement.groupElement("minTexelGatherOffset");
    public static final PathElement PATH$maxTexelGatherOffset = PathElement.groupElement("maxTexelGatherOffset");
    public static final PathElement PATH$minInterpolationOffset = PathElement.groupElement("minInterpolationOffset");
    public static final PathElement PATH$maxInterpolationOffset = PathElement.groupElement("maxInterpolationOffset");
    public static final PathElement PATH$subPixelInterpolationOffsetBits = PathElement.groupElement("subPixelInterpolationOffsetBits");
    public static final PathElement PATH$maxFramebufferWidth = PathElement.groupElement("maxFramebufferWidth");
    public static final PathElement PATH$maxFramebufferHeight = PathElement.groupElement("maxFramebufferHeight");
    public static final PathElement PATH$maxFramebufferLayers = PathElement.groupElement("maxFramebufferLayers");
    public static final PathElement PATH$framebufferColorSampleCounts = PathElement.groupElement("framebufferColorSampleCounts");
    public static final PathElement PATH$framebufferDepthSampleCounts = PathElement.groupElement("framebufferDepthSampleCounts");
    public static final PathElement PATH$framebufferStencilSampleCounts = PathElement.groupElement("framebufferStencilSampleCounts");
    public static final PathElement PATH$framebufferNoAttachmentsSampleCounts = PathElement.groupElement("framebufferNoAttachmentsSampleCounts");
    public static final PathElement PATH$maxColorAttachments = PathElement.groupElement("maxColorAttachments");
    public static final PathElement PATH$sampledImageColorSampleCounts = PathElement.groupElement("sampledImageColorSampleCounts");
    public static final PathElement PATH$sampledImageIntegerSampleCounts = PathElement.groupElement("sampledImageIntegerSampleCounts");
    public static final PathElement PATH$sampledImageDepthSampleCounts = PathElement.groupElement("sampledImageDepthSampleCounts");
    public static final PathElement PATH$sampledImageStencilSampleCounts = PathElement.groupElement("sampledImageStencilSampleCounts");
    public static final PathElement PATH$storageImageSampleCounts = PathElement.groupElement("storageImageSampleCounts");
    public static final PathElement PATH$maxSampleMaskWords = PathElement.groupElement("maxSampleMaskWords");
    public static final PathElement PATH$timestampComputeAndGraphics = PathElement.groupElement("timestampComputeAndGraphics");
    public static final PathElement PATH$timestampPeriod = PathElement.groupElement("timestampPeriod");
    public static final PathElement PATH$maxClipDistances = PathElement.groupElement("maxClipDistances");
    public static final PathElement PATH$maxCullDistances = PathElement.groupElement("maxCullDistances");
    public static final PathElement PATH$maxCombinedClipAndCullDistances = PathElement.groupElement("maxCombinedClipAndCullDistances");
    public static final PathElement PATH$discreteQueuePriorities = PathElement.groupElement("discreteQueuePriorities");
    public static final PathElement PATH$pointSizeRange = PathElement.groupElement("pointSizeRange");
    public static final PathElement PATH$lineWidthRange = PathElement.groupElement("lineWidthRange");
    public static final PathElement PATH$pointSizeGranularity = PathElement.groupElement("pointSizeGranularity");
    public static final PathElement PATH$lineWidthGranularity = PathElement.groupElement("lineWidthGranularity");
    public static final PathElement PATH$strictLines = PathElement.groupElement("strictLines");
    public static final PathElement PATH$standardSampleLocations = PathElement.groupElement("standardSampleLocations");
    public static final PathElement PATH$optimalBufferCopyOffsetAlignment = PathElement.groupElement("optimalBufferCopyOffsetAlignment");
    public static final PathElement PATH$optimalBufferCopyRowPitchAlignment = PathElement.groupElement("optimalBufferCopyRowPitchAlignment");
    public static final PathElement PATH$nonCoherentAtomSize = PathElement.groupElement("nonCoherentAtomSize");

    public static final OfInt LAYOUT$maxImageDimension1D = (OfInt) LAYOUT.select(PATH$maxImageDimension1D);
    public static final OfInt LAYOUT$maxImageDimension2D = (OfInt) LAYOUT.select(PATH$maxImageDimension2D);
    public static final OfInt LAYOUT$maxImageDimension3D = (OfInt) LAYOUT.select(PATH$maxImageDimension3D);
    public static final OfInt LAYOUT$maxImageDimensionCube = (OfInt) LAYOUT.select(PATH$maxImageDimensionCube);
    public static final OfInt LAYOUT$maxImageArrayLayers = (OfInt) LAYOUT.select(PATH$maxImageArrayLayers);
    public static final OfInt LAYOUT$maxTexelBufferElements = (OfInt) LAYOUT.select(PATH$maxTexelBufferElements);
    public static final OfInt LAYOUT$maxUniformBufferRange = (OfInt) LAYOUT.select(PATH$maxUniformBufferRange);
    public static final OfInt LAYOUT$maxStorageBufferRange = (OfInt) LAYOUT.select(PATH$maxStorageBufferRange);
    public static final OfInt LAYOUT$maxPushConstantsSize = (OfInt) LAYOUT.select(PATH$maxPushConstantsSize);
    public static final OfInt LAYOUT$maxMemoryAllocationCount = (OfInt) LAYOUT.select(PATH$maxMemoryAllocationCount);
    public static final OfInt LAYOUT$maxSamplerAllocationCount = (OfInt) LAYOUT.select(PATH$maxSamplerAllocationCount);
    public static final OfLong LAYOUT$bufferImageGranularity = (OfLong) LAYOUT.select(PATH$bufferImageGranularity);
    public static final OfLong LAYOUT$sparseAddressSpaceSize = (OfLong) LAYOUT.select(PATH$sparseAddressSpaceSize);
    public static final OfInt LAYOUT$maxBoundDescriptorSets = (OfInt) LAYOUT.select(PATH$maxBoundDescriptorSets);
    public static final OfInt LAYOUT$maxPerStageDescriptorSamplers = (OfInt) LAYOUT.select(PATH$maxPerStageDescriptorSamplers);
    public static final OfInt LAYOUT$maxPerStageDescriptorUniformBuffers = (OfInt) LAYOUT.select(PATH$maxPerStageDescriptorUniformBuffers);
    public static final OfInt LAYOUT$maxPerStageDescriptorStorageBuffers = (OfInt) LAYOUT.select(PATH$maxPerStageDescriptorStorageBuffers);
    public static final OfInt LAYOUT$maxPerStageDescriptorSampledImages = (OfInt) LAYOUT.select(PATH$maxPerStageDescriptorSampledImages);
    public static final OfInt LAYOUT$maxPerStageDescriptorStorageImages = (OfInt) LAYOUT.select(PATH$maxPerStageDescriptorStorageImages);
    public static final OfInt LAYOUT$maxPerStageDescriptorInputAttachments = (OfInt) LAYOUT.select(PATH$maxPerStageDescriptorInputAttachments);
    public static final OfInt LAYOUT$maxPerStageResources = (OfInt) LAYOUT.select(PATH$maxPerStageResources);
    public static final OfInt LAYOUT$maxDescriptorSetSamplers = (OfInt) LAYOUT.select(PATH$maxDescriptorSetSamplers);
    public static final OfInt LAYOUT$maxDescriptorSetUniformBuffers = (OfInt) LAYOUT.select(PATH$maxDescriptorSetUniformBuffers);
    public static final OfInt LAYOUT$maxDescriptorSetUniformBuffersDynamic = (OfInt) LAYOUT.select(PATH$maxDescriptorSetUniformBuffersDynamic);
    public static final OfInt LAYOUT$maxDescriptorSetStorageBuffers = (OfInt) LAYOUT.select(PATH$maxDescriptorSetStorageBuffers);
    public static final OfInt LAYOUT$maxDescriptorSetStorageBuffersDynamic = (OfInt) LAYOUT.select(PATH$maxDescriptorSetStorageBuffersDynamic);
    public static final OfInt LAYOUT$maxDescriptorSetSampledImages = (OfInt) LAYOUT.select(PATH$maxDescriptorSetSampledImages);
    public static final OfInt LAYOUT$maxDescriptorSetStorageImages = (OfInt) LAYOUT.select(PATH$maxDescriptorSetStorageImages);
    public static final OfInt LAYOUT$maxDescriptorSetInputAttachments = (OfInt) LAYOUT.select(PATH$maxDescriptorSetInputAttachments);
    public static final OfInt LAYOUT$maxVertexInputAttributes = (OfInt) LAYOUT.select(PATH$maxVertexInputAttributes);
    public static final OfInt LAYOUT$maxVertexInputBindings = (OfInt) LAYOUT.select(PATH$maxVertexInputBindings);
    public static final OfInt LAYOUT$maxVertexInputAttributeOffset = (OfInt) LAYOUT.select(PATH$maxVertexInputAttributeOffset);
    public static final OfInt LAYOUT$maxVertexInputBindingStride = (OfInt) LAYOUT.select(PATH$maxVertexInputBindingStride);
    public static final OfInt LAYOUT$maxVertexOutputComponents = (OfInt) LAYOUT.select(PATH$maxVertexOutputComponents);
    public static final OfInt LAYOUT$maxTessellationGenerationLevel = (OfInt) LAYOUT.select(PATH$maxTessellationGenerationLevel);
    public static final OfInt LAYOUT$maxTessellationPatchSize = (OfInt) LAYOUT.select(PATH$maxTessellationPatchSize);
    public static final OfInt LAYOUT$maxTessellationControlPerVertexInputComponents = (OfInt) LAYOUT.select(PATH$maxTessellationControlPerVertexInputComponents);
    public static final OfInt LAYOUT$maxTessellationControlPerVertexOutputComponents = (OfInt) LAYOUT.select(PATH$maxTessellationControlPerVertexOutputComponents);
    public static final OfInt LAYOUT$maxTessellationControlPerPatchOutputComponents = (OfInt) LAYOUT.select(PATH$maxTessellationControlPerPatchOutputComponents);
    public static final OfInt LAYOUT$maxTessellationControlTotalOutputComponents = (OfInt) LAYOUT.select(PATH$maxTessellationControlTotalOutputComponents);
    public static final OfInt LAYOUT$maxTessellationEvaluationInputComponents = (OfInt) LAYOUT.select(PATH$maxTessellationEvaluationInputComponents);
    public static final OfInt LAYOUT$maxTessellationEvaluationOutputComponents = (OfInt) LAYOUT.select(PATH$maxTessellationEvaluationOutputComponents);
    public static final OfInt LAYOUT$maxGeometryShaderInvocations = (OfInt) LAYOUT.select(PATH$maxGeometryShaderInvocations);
    public static final OfInt LAYOUT$maxGeometryInputComponents = (OfInt) LAYOUT.select(PATH$maxGeometryInputComponents);
    public static final OfInt LAYOUT$maxGeometryOutputComponents = (OfInt) LAYOUT.select(PATH$maxGeometryOutputComponents);
    public static final OfInt LAYOUT$maxGeometryOutputVertices = (OfInt) LAYOUT.select(PATH$maxGeometryOutputVertices);
    public static final OfInt LAYOUT$maxGeometryTotalOutputComponents = (OfInt) LAYOUT.select(PATH$maxGeometryTotalOutputComponents);
    public static final OfInt LAYOUT$maxFragmentInputComponents = (OfInt) LAYOUT.select(PATH$maxFragmentInputComponents);
    public static final OfInt LAYOUT$maxFragmentOutputAttachments = (OfInt) LAYOUT.select(PATH$maxFragmentOutputAttachments);
    public static final OfInt LAYOUT$maxFragmentDualSrcAttachments = (OfInt) LAYOUT.select(PATH$maxFragmentDualSrcAttachments);
    public static final OfInt LAYOUT$maxFragmentCombinedOutputResources = (OfInt) LAYOUT.select(PATH$maxFragmentCombinedOutputResources);
    public static final OfInt LAYOUT$maxComputeSharedMemorySize = (OfInt) LAYOUT.select(PATH$maxComputeSharedMemorySize);
    public static final OfInt LAYOUT$maxComputeWorkGroupCount = (OfInt) LAYOUT.select(PATH$maxComputeWorkGroupCount);
    public static final OfInt LAYOUT$maxComputeWorkGroupInvocations = (OfInt) LAYOUT.select(PATH$maxComputeWorkGroupInvocations);
    public static final OfInt LAYOUT$maxComputeWorkGroupSize = (OfInt) LAYOUT.select(PATH$maxComputeWorkGroupSize);
    public static final OfInt LAYOUT$subPixelPrecisionBits = (OfInt) LAYOUT.select(PATH$subPixelPrecisionBits);
    public static final OfInt LAYOUT$subTexelPrecisionBits = (OfInt) LAYOUT.select(PATH$subTexelPrecisionBits);
    public static final OfInt LAYOUT$mipmapPrecisionBits = (OfInt) LAYOUT.select(PATH$mipmapPrecisionBits);
    public static final OfInt LAYOUT$maxDrawIndexedIndexValue = (OfInt) LAYOUT.select(PATH$maxDrawIndexedIndexValue);
    public static final OfInt LAYOUT$maxDrawIndirectCount = (OfInt) LAYOUT.select(PATH$maxDrawIndirectCount);
    public static final OfFloat LAYOUT$maxSamplerLodBias = (OfFloat) LAYOUT.select(PATH$maxSamplerLodBias);
    public static final OfFloat LAYOUT$maxSamplerAnisotropy = (OfFloat) LAYOUT.select(PATH$maxSamplerAnisotropy);
    public static final OfInt LAYOUT$maxViewports = (OfInt) LAYOUT.select(PATH$maxViewports);
    public static final OfInt LAYOUT$maxViewportDimensions = (OfInt) LAYOUT.select(PATH$maxViewportDimensions);
    public static final OfFloat LAYOUT$viewportBoundsRange = (OfFloat) LAYOUT.select(PATH$viewportBoundsRange);
    public static final OfInt LAYOUT$viewportSubPixelBits = (OfInt) LAYOUT.select(PATH$viewportSubPixelBits);
    public static final OfLong LAYOUT$minTexelBufferOffsetAlignment = (OfLong) LAYOUT.select(PATH$minTexelBufferOffsetAlignment);
    public static final OfLong LAYOUT$minUniformBufferOffsetAlignment = (OfLong) LAYOUT.select(PATH$minUniformBufferOffsetAlignment);
    public static final OfLong LAYOUT$minStorageBufferOffsetAlignment = (OfLong) LAYOUT.select(PATH$minStorageBufferOffsetAlignment);
    public static final OfInt LAYOUT$minTexelOffset = (OfInt) LAYOUT.select(PATH$minTexelOffset);
    public static final OfInt LAYOUT$maxTexelOffset = (OfInt) LAYOUT.select(PATH$maxTexelOffset);
    public static final OfInt LAYOUT$minTexelGatherOffset = (OfInt) LAYOUT.select(PATH$minTexelGatherOffset);
    public static final OfInt LAYOUT$maxTexelGatherOffset = (OfInt) LAYOUT.select(PATH$maxTexelGatherOffset);
    public static final OfFloat LAYOUT$minInterpolationOffset = (OfFloat) LAYOUT.select(PATH$minInterpolationOffset);
    public static final OfFloat LAYOUT$maxInterpolationOffset = (OfFloat) LAYOUT.select(PATH$maxInterpolationOffset);
    public static final OfInt LAYOUT$subPixelInterpolationOffsetBits = (OfInt) LAYOUT.select(PATH$subPixelInterpolationOffsetBits);
    public static final OfInt LAYOUT$maxFramebufferWidth = (OfInt) LAYOUT.select(PATH$maxFramebufferWidth);
    public static final OfInt LAYOUT$maxFramebufferHeight = (OfInt) LAYOUT.select(PATH$maxFramebufferHeight);
    public static final OfInt LAYOUT$maxFramebufferLayers = (OfInt) LAYOUT.select(PATH$maxFramebufferLayers);
    public static final OfInt LAYOUT$framebufferColorSampleCounts = (OfInt) LAYOUT.select(PATH$framebufferColorSampleCounts);
    public static final OfInt LAYOUT$framebufferDepthSampleCounts = (OfInt) LAYOUT.select(PATH$framebufferDepthSampleCounts);
    public static final OfInt LAYOUT$framebufferStencilSampleCounts = (OfInt) LAYOUT.select(PATH$framebufferStencilSampleCounts);
    public static final OfInt LAYOUT$framebufferNoAttachmentsSampleCounts = (OfInt) LAYOUT.select(PATH$framebufferNoAttachmentsSampleCounts);
    public static final OfInt LAYOUT$maxColorAttachments = (OfInt) LAYOUT.select(PATH$maxColorAttachments);
    public static final OfInt LAYOUT$sampledImageColorSampleCounts = (OfInt) LAYOUT.select(PATH$sampledImageColorSampleCounts);
    public static final OfInt LAYOUT$sampledImageIntegerSampleCounts = (OfInt) LAYOUT.select(PATH$sampledImageIntegerSampleCounts);
    public static final OfInt LAYOUT$sampledImageDepthSampleCounts = (OfInt) LAYOUT.select(PATH$sampledImageDepthSampleCounts);
    public static final OfInt LAYOUT$sampledImageStencilSampleCounts = (OfInt) LAYOUT.select(PATH$sampledImageStencilSampleCounts);
    public static final OfInt LAYOUT$storageImageSampleCounts = (OfInt) LAYOUT.select(PATH$storageImageSampleCounts);
    public static final OfInt LAYOUT$maxSampleMaskWords = (OfInt) LAYOUT.select(PATH$maxSampleMaskWords);
    public static final OfInt LAYOUT$timestampComputeAndGraphics = (OfInt) LAYOUT.select(PATH$timestampComputeAndGraphics);
    public static final OfFloat LAYOUT$timestampPeriod = (OfFloat) LAYOUT.select(PATH$timestampPeriod);
    public static final OfInt LAYOUT$maxClipDistances = (OfInt) LAYOUT.select(PATH$maxClipDistances);
    public static final OfInt LAYOUT$maxCullDistances = (OfInt) LAYOUT.select(PATH$maxCullDistances);
    public static final OfInt LAYOUT$maxCombinedClipAndCullDistances = (OfInt) LAYOUT.select(PATH$maxCombinedClipAndCullDistances);
    public static final OfInt LAYOUT$discreteQueuePriorities = (OfInt) LAYOUT.select(PATH$discreteQueuePriorities);
    public static final OfFloat LAYOUT$pointSizeRange = (OfFloat) LAYOUT.select(PATH$pointSizeRange);
    public static final OfFloat LAYOUT$lineWidthRange = (OfFloat) LAYOUT.select(PATH$lineWidthRange);
    public static final OfFloat LAYOUT$pointSizeGranularity = (OfFloat) LAYOUT.select(PATH$pointSizeGranularity);
    public static final OfFloat LAYOUT$lineWidthGranularity = (OfFloat) LAYOUT.select(PATH$lineWidthGranularity);
    public static final OfInt LAYOUT$strictLines = (OfInt) LAYOUT.select(PATH$strictLines);
    public static final OfInt LAYOUT$standardSampleLocations = (OfInt) LAYOUT.select(PATH$standardSampleLocations);
    public static final OfLong LAYOUT$optimalBufferCopyOffsetAlignment = (OfLong) LAYOUT.select(PATH$optimalBufferCopyOffsetAlignment);
    public static final OfLong LAYOUT$optimalBufferCopyRowPitchAlignment = (OfLong) LAYOUT.select(PATH$optimalBufferCopyRowPitchAlignment);
    public static final OfLong LAYOUT$nonCoherentAtomSize = (OfLong) LAYOUT.select(PATH$nonCoherentAtomSize);

    public static final long SIZE$maxImageDimension1D = LAYOUT$maxImageDimension1D.byteSize();
    public static final long SIZE$maxImageDimension2D = LAYOUT$maxImageDimension2D.byteSize();
    public static final long SIZE$maxImageDimension3D = LAYOUT$maxImageDimension3D.byteSize();
    public static final long SIZE$maxImageDimensionCube = LAYOUT$maxImageDimensionCube.byteSize();
    public static final long SIZE$maxImageArrayLayers = LAYOUT$maxImageArrayLayers.byteSize();
    public static final long SIZE$maxTexelBufferElements = LAYOUT$maxTexelBufferElements.byteSize();
    public static final long SIZE$maxUniformBufferRange = LAYOUT$maxUniformBufferRange.byteSize();
    public static final long SIZE$maxStorageBufferRange = LAYOUT$maxStorageBufferRange.byteSize();
    public static final long SIZE$maxPushConstantsSize = LAYOUT$maxPushConstantsSize.byteSize();
    public static final long SIZE$maxMemoryAllocationCount = LAYOUT$maxMemoryAllocationCount.byteSize();
    public static final long SIZE$maxSamplerAllocationCount = LAYOUT$maxSamplerAllocationCount.byteSize();
    public static final long SIZE$bufferImageGranularity = LAYOUT$bufferImageGranularity.byteSize();
    public static final long SIZE$sparseAddressSpaceSize = LAYOUT$sparseAddressSpaceSize.byteSize();
    public static final long SIZE$maxBoundDescriptorSets = LAYOUT$maxBoundDescriptorSets.byteSize();
    public static final long SIZE$maxPerStageDescriptorSamplers = LAYOUT$maxPerStageDescriptorSamplers.byteSize();
    public static final long SIZE$maxPerStageDescriptorUniformBuffers = LAYOUT$maxPerStageDescriptorUniformBuffers.byteSize();
    public static final long SIZE$maxPerStageDescriptorStorageBuffers = LAYOUT$maxPerStageDescriptorStorageBuffers.byteSize();
    public static final long SIZE$maxPerStageDescriptorSampledImages = LAYOUT$maxPerStageDescriptorSampledImages.byteSize();
    public static final long SIZE$maxPerStageDescriptorStorageImages = LAYOUT$maxPerStageDescriptorStorageImages.byteSize();
    public static final long SIZE$maxPerStageDescriptorInputAttachments = LAYOUT$maxPerStageDescriptorInputAttachments.byteSize();
    public static final long SIZE$maxPerStageResources = LAYOUT$maxPerStageResources.byteSize();
    public static final long SIZE$maxDescriptorSetSamplers = LAYOUT$maxDescriptorSetSamplers.byteSize();
    public static final long SIZE$maxDescriptorSetUniformBuffers = LAYOUT$maxDescriptorSetUniformBuffers.byteSize();
    public static final long SIZE$maxDescriptorSetUniformBuffersDynamic = LAYOUT$maxDescriptorSetUniformBuffersDynamic.byteSize();
    public static final long SIZE$maxDescriptorSetStorageBuffers = LAYOUT$maxDescriptorSetStorageBuffers.byteSize();
    public static final long SIZE$maxDescriptorSetStorageBuffersDynamic = LAYOUT$maxDescriptorSetStorageBuffersDynamic.byteSize();
    public static final long SIZE$maxDescriptorSetSampledImages = LAYOUT$maxDescriptorSetSampledImages.byteSize();
    public static final long SIZE$maxDescriptorSetStorageImages = LAYOUT$maxDescriptorSetStorageImages.byteSize();
    public static final long SIZE$maxDescriptorSetInputAttachments = LAYOUT$maxDescriptorSetInputAttachments.byteSize();
    public static final long SIZE$maxVertexInputAttributes = LAYOUT$maxVertexInputAttributes.byteSize();
    public static final long SIZE$maxVertexInputBindings = LAYOUT$maxVertexInputBindings.byteSize();
    public static final long SIZE$maxVertexInputAttributeOffset = LAYOUT$maxVertexInputAttributeOffset.byteSize();
    public static final long SIZE$maxVertexInputBindingStride = LAYOUT$maxVertexInputBindingStride.byteSize();
    public static final long SIZE$maxVertexOutputComponents = LAYOUT$maxVertexOutputComponents.byteSize();
    public static final long SIZE$maxTessellationGenerationLevel = LAYOUT$maxTessellationGenerationLevel.byteSize();
    public static final long SIZE$maxTessellationPatchSize = LAYOUT$maxTessellationPatchSize.byteSize();
    public static final long SIZE$maxTessellationControlPerVertexInputComponents = LAYOUT$maxTessellationControlPerVertexInputComponents.byteSize();
    public static final long SIZE$maxTessellationControlPerVertexOutputComponents = LAYOUT$maxTessellationControlPerVertexOutputComponents.byteSize();
    public static final long SIZE$maxTessellationControlPerPatchOutputComponents = LAYOUT$maxTessellationControlPerPatchOutputComponents.byteSize();
    public static final long SIZE$maxTessellationControlTotalOutputComponents = LAYOUT$maxTessellationControlTotalOutputComponents.byteSize();
    public static final long SIZE$maxTessellationEvaluationInputComponents = LAYOUT$maxTessellationEvaluationInputComponents.byteSize();
    public static final long SIZE$maxTessellationEvaluationOutputComponents = LAYOUT$maxTessellationEvaluationOutputComponents.byteSize();
    public static final long SIZE$maxGeometryShaderInvocations = LAYOUT$maxGeometryShaderInvocations.byteSize();
    public static final long SIZE$maxGeometryInputComponents = LAYOUT$maxGeometryInputComponents.byteSize();
    public static final long SIZE$maxGeometryOutputComponents = LAYOUT$maxGeometryOutputComponents.byteSize();
    public static final long SIZE$maxGeometryOutputVertices = LAYOUT$maxGeometryOutputVertices.byteSize();
    public static final long SIZE$maxGeometryTotalOutputComponents = LAYOUT$maxGeometryTotalOutputComponents.byteSize();
    public static final long SIZE$maxFragmentInputComponents = LAYOUT$maxFragmentInputComponents.byteSize();
    public static final long SIZE$maxFragmentOutputAttachments = LAYOUT$maxFragmentOutputAttachments.byteSize();
    public static final long SIZE$maxFragmentDualSrcAttachments = LAYOUT$maxFragmentDualSrcAttachments.byteSize();
    public static final long SIZE$maxFragmentCombinedOutputResources = LAYOUT$maxFragmentCombinedOutputResources.byteSize();
    public static final long SIZE$maxComputeSharedMemorySize = LAYOUT$maxComputeSharedMemorySize.byteSize();
    public static final long SIZE$maxComputeWorkGroupCount = LAYOUT$maxComputeWorkGroupCount.byteSize();
    public static final long SIZE$maxComputeWorkGroupInvocations = LAYOUT$maxComputeWorkGroupInvocations.byteSize();
    public static final long SIZE$maxComputeWorkGroupSize = LAYOUT$maxComputeWorkGroupSize.byteSize();
    public static final long SIZE$subPixelPrecisionBits = LAYOUT$subPixelPrecisionBits.byteSize();
    public static final long SIZE$subTexelPrecisionBits = LAYOUT$subTexelPrecisionBits.byteSize();
    public static final long SIZE$mipmapPrecisionBits = LAYOUT$mipmapPrecisionBits.byteSize();
    public static final long SIZE$maxDrawIndexedIndexValue = LAYOUT$maxDrawIndexedIndexValue.byteSize();
    public static final long SIZE$maxDrawIndirectCount = LAYOUT$maxDrawIndirectCount.byteSize();
    public static final long SIZE$maxSamplerLodBias = LAYOUT$maxSamplerLodBias.byteSize();
    public static final long SIZE$maxSamplerAnisotropy = LAYOUT$maxSamplerAnisotropy.byteSize();
    public static final long SIZE$maxViewports = LAYOUT$maxViewports.byteSize();
    public static final long SIZE$maxViewportDimensions = LAYOUT$maxViewportDimensions.byteSize();
    public static final long SIZE$viewportBoundsRange = LAYOUT$viewportBoundsRange.byteSize();
    public static final long SIZE$viewportSubPixelBits = LAYOUT$viewportSubPixelBits.byteSize();
    public static final long SIZE$minMemoryMapAlignment = NativeLayout.C_SIZE_T.byteSize();
    public static final long SIZE$minTexelBufferOffsetAlignment = LAYOUT$minTexelBufferOffsetAlignment.byteSize();
    public static final long SIZE$minUniformBufferOffsetAlignment = LAYOUT$minUniformBufferOffsetAlignment.byteSize();
    public static final long SIZE$minStorageBufferOffsetAlignment = LAYOUT$minStorageBufferOffsetAlignment.byteSize();
    public static final long SIZE$minTexelOffset = LAYOUT$minTexelOffset.byteSize();
    public static final long SIZE$maxTexelOffset = LAYOUT$maxTexelOffset.byteSize();
    public static final long SIZE$minTexelGatherOffset = LAYOUT$minTexelGatherOffset.byteSize();
    public static final long SIZE$maxTexelGatherOffset = LAYOUT$maxTexelGatherOffset.byteSize();
    public static final long SIZE$minInterpolationOffset = LAYOUT$minInterpolationOffset.byteSize();
    public static final long SIZE$maxInterpolationOffset = LAYOUT$maxInterpolationOffset.byteSize();
    public static final long SIZE$subPixelInterpolationOffsetBits = LAYOUT$subPixelInterpolationOffsetBits.byteSize();
    public static final long SIZE$maxFramebufferWidth = LAYOUT$maxFramebufferWidth.byteSize();
    public static final long SIZE$maxFramebufferHeight = LAYOUT$maxFramebufferHeight.byteSize();
    public static final long SIZE$maxFramebufferLayers = LAYOUT$maxFramebufferLayers.byteSize();
    public static final long SIZE$framebufferColorSampleCounts = LAYOUT$framebufferColorSampleCounts.byteSize();
    public static final long SIZE$framebufferDepthSampleCounts = LAYOUT$framebufferDepthSampleCounts.byteSize();
    public static final long SIZE$framebufferStencilSampleCounts = LAYOUT$framebufferStencilSampleCounts.byteSize();
    public static final long SIZE$framebufferNoAttachmentsSampleCounts = LAYOUT$framebufferNoAttachmentsSampleCounts.byteSize();
    public static final long SIZE$maxColorAttachments = LAYOUT$maxColorAttachments.byteSize();
    public static final long SIZE$sampledImageColorSampleCounts = LAYOUT$sampledImageColorSampleCounts.byteSize();
    public static final long SIZE$sampledImageIntegerSampleCounts = LAYOUT$sampledImageIntegerSampleCounts.byteSize();
    public static final long SIZE$sampledImageDepthSampleCounts = LAYOUT$sampledImageDepthSampleCounts.byteSize();
    public static final long SIZE$sampledImageStencilSampleCounts = LAYOUT$sampledImageStencilSampleCounts.byteSize();
    public static final long SIZE$storageImageSampleCounts = LAYOUT$storageImageSampleCounts.byteSize();
    public static final long SIZE$maxSampleMaskWords = LAYOUT$maxSampleMaskWords.byteSize();
    public static final long SIZE$timestampComputeAndGraphics = LAYOUT$timestampComputeAndGraphics.byteSize();
    public static final long SIZE$timestampPeriod = LAYOUT$timestampPeriod.byteSize();
    public static final long SIZE$maxClipDistances = LAYOUT$maxClipDistances.byteSize();
    public static final long SIZE$maxCullDistances = LAYOUT$maxCullDistances.byteSize();
    public static final long SIZE$maxCombinedClipAndCullDistances = LAYOUT$maxCombinedClipAndCullDistances.byteSize();
    public static final long SIZE$discreteQueuePriorities = LAYOUT$discreteQueuePriorities.byteSize();
    public static final long SIZE$pointSizeRange = LAYOUT$pointSizeRange.byteSize();
    public static final long SIZE$lineWidthRange = LAYOUT$lineWidthRange.byteSize();
    public static final long SIZE$pointSizeGranularity = LAYOUT$pointSizeGranularity.byteSize();
    public static final long SIZE$lineWidthGranularity = LAYOUT$lineWidthGranularity.byteSize();
    public static final long SIZE$strictLines = LAYOUT$strictLines.byteSize();
    public static final long SIZE$standardSampleLocations = LAYOUT$standardSampleLocations.byteSize();
    public static final long SIZE$optimalBufferCopyOffsetAlignment = LAYOUT$optimalBufferCopyOffsetAlignment.byteSize();
    public static final long SIZE$optimalBufferCopyRowPitchAlignment = LAYOUT$optimalBufferCopyRowPitchAlignment.byteSize();
    public static final long SIZE$nonCoherentAtomSize = LAYOUT$nonCoherentAtomSize.byteSize();

    public static final long OFFSET$maxImageDimension1D = LAYOUT.byteOffset(PATH$maxImageDimension1D);
    public static final long OFFSET$maxImageDimension2D = LAYOUT.byteOffset(PATH$maxImageDimension2D);
    public static final long OFFSET$maxImageDimension3D = LAYOUT.byteOffset(PATH$maxImageDimension3D);
    public static final long OFFSET$maxImageDimensionCube = LAYOUT.byteOffset(PATH$maxImageDimensionCube);
    public static final long OFFSET$maxImageArrayLayers = LAYOUT.byteOffset(PATH$maxImageArrayLayers);
    public static final long OFFSET$maxTexelBufferElements = LAYOUT.byteOffset(PATH$maxTexelBufferElements);
    public static final long OFFSET$maxUniformBufferRange = LAYOUT.byteOffset(PATH$maxUniformBufferRange);
    public static final long OFFSET$maxStorageBufferRange = LAYOUT.byteOffset(PATH$maxStorageBufferRange);
    public static final long OFFSET$maxPushConstantsSize = LAYOUT.byteOffset(PATH$maxPushConstantsSize);
    public static final long OFFSET$maxMemoryAllocationCount = LAYOUT.byteOffset(PATH$maxMemoryAllocationCount);
    public static final long OFFSET$maxSamplerAllocationCount = LAYOUT.byteOffset(PATH$maxSamplerAllocationCount);
    public static final long OFFSET$bufferImageGranularity = LAYOUT.byteOffset(PATH$bufferImageGranularity);
    public static final long OFFSET$sparseAddressSpaceSize = LAYOUT.byteOffset(PATH$sparseAddressSpaceSize);
    public static final long OFFSET$maxBoundDescriptorSets = LAYOUT.byteOffset(PATH$maxBoundDescriptorSets);
    public static final long OFFSET$maxPerStageDescriptorSamplers = LAYOUT.byteOffset(PATH$maxPerStageDescriptorSamplers);
    public static final long OFFSET$maxPerStageDescriptorUniformBuffers = LAYOUT.byteOffset(PATH$maxPerStageDescriptorUniformBuffers);
    public static final long OFFSET$maxPerStageDescriptorStorageBuffers = LAYOUT.byteOffset(PATH$maxPerStageDescriptorStorageBuffers);
    public static final long OFFSET$maxPerStageDescriptorSampledImages = LAYOUT.byteOffset(PATH$maxPerStageDescriptorSampledImages);
    public static final long OFFSET$maxPerStageDescriptorStorageImages = LAYOUT.byteOffset(PATH$maxPerStageDescriptorStorageImages);
    public static final long OFFSET$maxPerStageDescriptorInputAttachments = LAYOUT.byteOffset(PATH$maxPerStageDescriptorInputAttachments);
    public static final long OFFSET$maxPerStageResources = LAYOUT.byteOffset(PATH$maxPerStageResources);
    public static final long OFFSET$maxDescriptorSetSamplers = LAYOUT.byteOffset(PATH$maxDescriptorSetSamplers);
    public static final long OFFSET$maxDescriptorSetUniformBuffers = LAYOUT.byteOffset(PATH$maxDescriptorSetUniformBuffers);
    public static final long OFFSET$maxDescriptorSetUniformBuffersDynamic = LAYOUT.byteOffset(PATH$maxDescriptorSetUniformBuffersDynamic);
    public static final long OFFSET$maxDescriptorSetStorageBuffers = LAYOUT.byteOffset(PATH$maxDescriptorSetStorageBuffers);
    public static final long OFFSET$maxDescriptorSetStorageBuffersDynamic = LAYOUT.byteOffset(PATH$maxDescriptorSetStorageBuffersDynamic);
    public static final long OFFSET$maxDescriptorSetSampledImages = LAYOUT.byteOffset(PATH$maxDescriptorSetSampledImages);
    public static final long OFFSET$maxDescriptorSetStorageImages = LAYOUT.byteOffset(PATH$maxDescriptorSetStorageImages);
    public static final long OFFSET$maxDescriptorSetInputAttachments = LAYOUT.byteOffset(PATH$maxDescriptorSetInputAttachments);
    public static final long OFFSET$maxVertexInputAttributes = LAYOUT.byteOffset(PATH$maxVertexInputAttributes);
    public static final long OFFSET$maxVertexInputBindings = LAYOUT.byteOffset(PATH$maxVertexInputBindings);
    public static final long OFFSET$maxVertexInputAttributeOffset = LAYOUT.byteOffset(PATH$maxVertexInputAttributeOffset);
    public static final long OFFSET$maxVertexInputBindingStride = LAYOUT.byteOffset(PATH$maxVertexInputBindingStride);
    public static final long OFFSET$maxVertexOutputComponents = LAYOUT.byteOffset(PATH$maxVertexOutputComponents);
    public static final long OFFSET$maxTessellationGenerationLevel = LAYOUT.byteOffset(PATH$maxTessellationGenerationLevel);
    public static final long OFFSET$maxTessellationPatchSize = LAYOUT.byteOffset(PATH$maxTessellationPatchSize);
    public static final long OFFSET$maxTessellationControlPerVertexInputComponents = LAYOUT.byteOffset(PATH$maxTessellationControlPerVertexInputComponents);
    public static final long OFFSET$maxTessellationControlPerVertexOutputComponents = LAYOUT.byteOffset(PATH$maxTessellationControlPerVertexOutputComponents);
    public static final long OFFSET$maxTessellationControlPerPatchOutputComponents = LAYOUT.byteOffset(PATH$maxTessellationControlPerPatchOutputComponents);
    public static final long OFFSET$maxTessellationControlTotalOutputComponents = LAYOUT.byteOffset(PATH$maxTessellationControlTotalOutputComponents);
    public static final long OFFSET$maxTessellationEvaluationInputComponents = LAYOUT.byteOffset(PATH$maxTessellationEvaluationInputComponents);
    public static final long OFFSET$maxTessellationEvaluationOutputComponents = LAYOUT.byteOffset(PATH$maxTessellationEvaluationOutputComponents);
    public static final long OFFSET$maxGeometryShaderInvocations = LAYOUT.byteOffset(PATH$maxGeometryShaderInvocations);
    public static final long OFFSET$maxGeometryInputComponents = LAYOUT.byteOffset(PATH$maxGeometryInputComponents);
    public static final long OFFSET$maxGeometryOutputComponents = LAYOUT.byteOffset(PATH$maxGeometryOutputComponents);
    public static final long OFFSET$maxGeometryOutputVertices = LAYOUT.byteOffset(PATH$maxGeometryOutputVertices);
    public static final long OFFSET$maxGeometryTotalOutputComponents = LAYOUT.byteOffset(PATH$maxGeometryTotalOutputComponents);
    public static final long OFFSET$maxFragmentInputComponents = LAYOUT.byteOffset(PATH$maxFragmentInputComponents);
    public static final long OFFSET$maxFragmentOutputAttachments = LAYOUT.byteOffset(PATH$maxFragmentOutputAttachments);
    public static final long OFFSET$maxFragmentDualSrcAttachments = LAYOUT.byteOffset(PATH$maxFragmentDualSrcAttachments);
    public static final long OFFSET$maxFragmentCombinedOutputResources = LAYOUT.byteOffset(PATH$maxFragmentCombinedOutputResources);
    public static final long OFFSET$maxComputeSharedMemorySize = LAYOUT.byteOffset(PATH$maxComputeSharedMemorySize);
    public static final long OFFSET$maxComputeWorkGroupCount = LAYOUT.byteOffset(PATH$maxComputeWorkGroupCount);
    public static final long OFFSET$maxComputeWorkGroupInvocations = LAYOUT.byteOffset(PATH$maxComputeWorkGroupInvocations);
    public static final long OFFSET$maxComputeWorkGroupSize = LAYOUT.byteOffset(PATH$maxComputeWorkGroupSize);
    public static final long OFFSET$subPixelPrecisionBits = LAYOUT.byteOffset(PATH$subPixelPrecisionBits);
    public static final long OFFSET$subTexelPrecisionBits = LAYOUT.byteOffset(PATH$subTexelPrecisionBits);
    public static final long OFFSET$mipmapPrecisionBits = LAYOUT.byteOffset(PATH$mipmapPrecisionBits);
    public static final long OFFSET$maxDrawIndexedIndexValue = LAYOUT.byteOffset(PATH$maxDrawIndexedIndexValue);
    public static final long OFFSET$maxDrawIndirectCount = LAYOUT.byteOffset(PATH$maxDrawIndirectCount);
    public static final long OFFSET$maxSamplerLodBias = LAYOUT.byteOffset(PATH$maxSamplerLodBias);
    public static final long OFFSET$maxSamplerAnisotropy = LAYOUT.byteOffset(PATH$maxSamplerAnisotropy);
    public static final long OFFSET$maxViewports = LAYOUT.byteOffset(PATH$maxViewports);
    public static final long OFFSET$maxViewportDimensions = LAYOUT.byteOffset(PATH$maxViewportDimensions);
    public static final long OFFSET$viewportBoundsRange = LAYOUT.byteOffset(PATH$viewportBoundsRange);
    public static final long OFFSET$viewportSubPixelBits = LAYOUT.byteOffset(PATH$viewportSubPixelBits);
    public static final long OFFSET$minMemoryMapAlignment = LAYOUT.byteOffset(PATH$minMemoryMapAlignment);
    public static final long OFFSET$minTexelBufferOffsetAlignment = LAYOUT.byteOffset(PATH$minTexelBufferOffsetAlignment);
    public static final long OFFSET$minUniformBufferOffsetAlignment = LAYOUT.byteOffset(PATH$minUniformBufferOffsetAlignment);
    public static final long OFFSET$minStorageBufferOffsetAlignment = LAYOUT.byteOffset(PATH$minStorageBufferOffsetAlignment);
    public static final long OFFSET$minTexelOffset = LAYOUT.byteOffset(PATH$minTexelOffset);
    public static final long OFFSET$maxTexelOffset = LAYOUT.byteOffset(PATH$maxTexelOffset);
    public static final long OFFSET$minTexelGatherOffset = LAYOUT.byteOffset(PATH$minTexelGatherOffset);
    public static final long OFFSET$maxTexelGatherOffset = LAYOUT.byteOffset(PATH$maxTexelGatherOffset);
    public static final long OFFSET$minInterpolationOffset = LAYOUT.byteOffset(PATH$minInterpolationOffset);
    public static final long OFFSET$maxInterpolationOffset = LAYOUT.byteOffset(PATH$maxInterpolationOffset);
    public static final long OFFSET$subPixelInterpolationOffsetBits = LAYOUT.byteOffset(PATH$subPixelInterpolationOffsetBits);
    public static final long OFFSET$maxFramebufferWidth = LAYOUT.byteOffset(PATH$maxFramebufferWidth);
    public static final long OFFSET$maxFramebufferHeight = LAYOUT.byteOffset(PATH$maxFramebufferHeight);
    public static final long OFFSET$maxFramebufferLayers = LAYOUT.byteOffset(PATH$maxFramebufferLayers);
    public static final long OFFSET$framebufferColorSampleCounts = LAYOUT.byteOffset(PATH$framebufferColorSampleCounts);
    public static final long OFFSET$framebufferDepthSampleCounts = LAYOUT.byteOffset(PATH$framebufferDepthSampleCounts);
    public static final long OFFSET$framebufferStencilSampleCounts = LAYOUT.byteOffset(PATH$framebufferStencilSampleCounts);
    public static final long OFFSET$framebufferNoAttachmentsSampleCounts = LAYOUT.byteOffset(PATH$framebufferNoAttachmentsSampleCounts);
    public static final long OFFSET$maxColorAttachments = LAYOUT.byteOffset(PATH$maxColorAttachments);
    public static final long OFFSET$sampledImageColorSampleCounts = LAYOUT.byteOffset(PATH$sampledImageColorSampleCounts);
    public static final long OFFSET$sampledImageIntegerSampleCounts = LAYOUT.byteOffset(PATH$sampledImageIntegerSampleCounts);
    public static final long OFFSET$sampledImageDepthSampleCounts = LAYOUT.byteOffset(PATH$sampledImageDepthSampleCounts);
    public static final long OFFSET$sampledImageStencilSampleCounts = LAYOUT.byteOffset(PATH$sampledImageStencilSampleCounts);
    public static final long OFFSET$storageImageSampleCounts = LAYOUT.byteOffset(PATH$storageImageSampleCounts);
    public static final long OFFSET$maxSampleMaskWords = LAYOUT.byteOffset(PATH$maxSampleMaskWords);
    public static final long OFFSET$timestampComputeAndGraphics = LAYOUT.byteOffset(PATH$timestampComputeAndGraphics);
    public static final long OFFSET$timestampPeriod = LAYOUT.byteOffset(PATH$timestampPeriod);
    public static final long OFFSET$maxClipDistances = LAYOUT.byteOffset(PATH$maxClipDistances);
    public static final long OFFSET$maxCullDistances = LAYOUT.byteOffset(PATH$maxCullDistances);
    public static final long OFFSET$maxCombinedClipAndCullDistances = LAYOUT.byteOffset(PATH$maxCombinedClipAndCullDistances);
    public static final long OFFSET$discreteQueuePriorities = LAYOUT.byteOffset(PATH$discreteQueuePriorities);
    public static final long OFFSET$pointSizeRange = LAYOUT.byteOffset(PATH$pointSizeRange);
    public static final long OFFSET$lineWidthRange = LAYOUT.byteOffset(PATH$lineWidthRange);
    public static final long OFFSET$pointSizeGranularity = LAYOUT.byteOffset(PATH$pointSizeGranularity);
    public static final long OFFSET$lineWidthGranularity = LAYOUT.byteOffset(PATH$lineWidthGranularity);
    public static final long OFFSET$strictLines = LAYOUT.byteOffset(PATH$strictLines);
    public static final long OFFSET$standardSampleLocations = LAYOUT.byteOffset(PATH$standardSampleLocations);
    public static final long OFFSET$optimalBufferCopyOffsetAlignment = LAYOUT.byteOffset(PATH$optimalBufferCopyOffsetAlignment);
    public static final long OFFSET$optimalBufferCopyRowPitchAlignment = LAYOUT.byteOffset(PATH$optimalBufferCopyRowPitchAlignment);
    public static final long OFFSET$nonCoherentAtomSize = LAYOUT.byteOffset(PATH$nonCoherentAtomSize);
}
