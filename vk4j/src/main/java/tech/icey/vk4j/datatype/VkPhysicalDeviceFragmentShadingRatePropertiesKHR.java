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
/// typedef struct VkPhysicalDeviceFragmentShadingRatePropertiesKHR {
///     VkStructureType sType;
///     void* pNext;
///     VkExtent2D minFragmentShadingRateAttachmentTexelSize;
///     VkExtent2D maxFragmentShadingRateAttachmentTexelSize;
///     uint32_t maxFragmentShadingRateAttachmentTexelSizeAspectRatio;
///     VkBool32 primitiveFragmentShadingRateWithMultipleViewports;
///     VkBool32 layeredShadingRateAttachments;
///     VkBool32 fragmentShadingRateNonTrivialCombinerOps;
///     VkExtent2D maxFragmentSize;
///     uint32_t maxFragmentSizeAspectRatio;
///     uint32_t maxFragmentShadingRateCoverageSamples;
///     VkSampleCountFlagBits maxFragmentShadingRateRasterizationSamples;
///     VkBool32 fragmentShadingRateWithShaderDepthStencilWrites;
///     VkBool32 fragmentShadingRateWithSampleMask;
///     VkBool32 fragmentShadingRateWithShaderSampleMask;
///     VkBool32 fragmentShadingRateWithConservativeRasterization;
///     VkBool32 fragmentShadingRateWithFragmentShaderInterlock;
///     VkBool32 fragmentShadingRateWithCustomSampleLocations;
///     VkBool32 fragmentShadingRateStrictMultiplyCombiner;
/// } VkPhysicalDeviceFragmentShadingRatePropertiesKHR;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkPhysicalDeviceFragmentShadingRatePropertiesKHR.html">VkPhysicalDeviceFragmentShadingRatePropertiesKHR</a>
public record VkPhysicalDeviceFragmentShadingRatePropertiesKHR(MemorySegment segment) implements IPointer {
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

    public void pNext(IPointer pointer) {
        pNext(pointer.segment());
    }

    public VkExtent2D minFragmentShadingRateAttachmentTexelSize() {
        return new VkExtent2D(segment.asSlice(OFFSET$minFragmentShadingRateAttachmentTexelSize, LAYOUT$minFragmentShadingRateAttachmentTexelSize));
    }

    public void minFragmentShadingRateAttachmentTexelSize(VkExtent2D value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$minFragmentShadingRateAttachmentTexelSize, SIZE$minFragmentShadingRateAttachmentTexelSize);
    }

    public VkExtent2D maxFragmentShadingRateAttachmentTexelSize() {
        return new VkExtent2D(segment.asSlice(OFFSET$maxFragmentShadingRateAttachmentTexelSize, LAYOUT$maxFragmentShadingRateAttachmentTexelSize));
    }

    public void maxFragmentShadingRateAttachmentTexelSize(VkExtent2D value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$maxFragmentShadingRateAttachmentTexelSize, SIZE$maxFragmentShadingRateAttachmentTexelSize);
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
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$maxFragmentSize, SIZE$maxFragmentSize);
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

    public static VkPhysicalDeviceFragmentShadingRatePropertiesKHR allocate(Arena arena) {
        return new VkPhysicalDeviceFragmentShadingRatePropertiesKHR(arena.allocate(LAYOUT));
    }
    
    public static VkPhysicalDeviceFragmentShadingRatePropertiesKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceFragmentShadingRatePropertiesKHR[] ret = new VkPhysicalDeviceFragmentShadingRatePropertiesKHR[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkPhysicalDeviceFragmentShadingRatePropertiesKHR(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
    
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
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$minFragmentShadingRateAttachmentTexelSize = PathElement.groupElement("minFragmentShadingRateAttachmentTexelSize");
    public static final PathElement PATH$maxFragmentShadingRateAttachmentTexelSize = PathElement.groupElement("maxFragmentShadingRateAttachmentTexelSize");
    public static final PathElement PATH$maxFragmentShadingRateAttachmentTexelSizeAspectRatio = PathElement.groupElement("maxFragmentShadingRateAttachmentTexelSizeAspectRatio");
    public static final PathElement PATH$primitiveFragmentShadingRateWithMultipleViewports = PathElement.groupElement("primitiveFragmentShadingRateWithMultipleViewports");
    public static final PathElement PATH$layeredShadingRateAttachments = PathElement.groupElement("layeredShadingRateAttachments");
    public static final PathElement PATH$fragmentShadingRateNonTrivialCombinerOps = PathElement.groupElement("fragmentShadingRateNonTrivialCombinerOps");
    public static final PathElement PATH$maxFragmentSize = PathElement.groupElement("maxFragmentSize");
    public static final PathElement PATH$maxFragmentSizeAspectRatio = PathElement.groupElement("maxFragmentSizeAspectRatio");
    public static final PathElement PATH$maxFragmentShadingRateCoverageSamples = PathElement.groupElement("maxFragmentShadingRateCoverageSamples");
    public static final PathElement PATH$maxFragmentShadingRateRasterizationSamples = PathElement.groupElement("maxFragmentShadingRateRasterizationSamples");
    public static final PathElement PATH$fragmentShadingRateWithShaderDepthStencilWrites = PathElement.groupElement("fragmentShadingRateWithShaderDepthStencilWrites");
    public static final PathElement PATH$fragmentShadingRateWithSampleMask = PathElement.groupElement("fragmentShadingRateWithSampleMask");
    public static final PathElement PATH$fragmentShadingRateWithShaderSampleMask = PathElement.groupElement("fragmentShadingRateWithShaderSampleMask");
    public static final PathElement PATH$fragmentShadingRateWithConservativeRasterization = PathElement.groupElement("fragmentShadingRateWithConservativeRasterization");
    public static final PathElement PATH$fragmentShadingRateWithFragmentShaderInterlock = PathElement.groupElement("fragmentShadingRateWithFragmentShaderInterlock");
    public static final PathElement PATH$fragmentShadingRateWithCustomSampleLocations = PathElement.groupElement("fragmentShadingRateWithCustomSampleLocations");
    public static final PathElement PATH$fragmentShadingRateStrictMultiplyCombiner = PathElement.groupElement("fragmentShadingRateStrictMultiplyCombiner");

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

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$minFragmentShadingRateAttachmentTexelSize = LAYOUT$minFragmentShadingRateAttachmentTexelSize.byteSize();
    public static final long SIZE$maxFragmentShadingRateAttachmentTexelSize = LAYOUT$maxFragmentShadingRateAttachmentTexelSize.byteSize();
    public static final long SIZE$maxFragmentShadingRateAttachmentTexelSizeAspectRatio = LAYOUT$maxFragmentShadingRateAttachmentTexelSizeAspectRatio.byteSize();
    public static final long SIZE$primitiveFragmentShadingRateWithMultipleViewports = LAYOUT$primitiveFragmentShadingRateWithMultipleViewports.byteSize();
    public static final long SIZE$layeredShadingRateAttachments = LAYOUT$layeredShadingRateAttachments.byteSize();
    public static final long SIZE$fragmentShadingRateNonTrivialCombinerOps = LAYOUT$fragmentShadingRateNonTrivialCombinerOps.byteSize();
    public static final long SIZE$maxFragmentSize = LAYOUT$maxFragmentSize.byteSize();
    public static final long SIZE$maxFragmentSizeAspectRatio = LAYOUT$maxFragmentSizeAspectRatio.byteSize();
    public static final long SIZE$maxFragmentShadingRateCoverageSamples = LAYOUT$maxFragmentShadingRateCoverageSamples.byteSize();
    public static final long SIZE$maxFragmentShadingRateRasterizationSamples = LAYOUT$maxFragmentShadingRateRasterizationSamples.byteSize();
    public static final long SIZE$fragmentShadingRateWithShaderDepthStencilWrites = LAYOUT$fragmentShadingRateWithShaderDepthStencilWrites.byteSize();
    public static final long SIZE$fragmentShadingRateWithSampleMask = LAYOUT$fragmentShadingRateWithSampleMask.byteSize();
    public static final long SIZE$fragmentShadingRateWithShaderSampleMask = LAYOUT$fragmentShadingRateWithShaderSampleMask.byteSize();
    public static final long SIZE$fragmentShadingRateWithConservativeRasterization = LAYOUT$fragmentShadingRateWithConservativeRasterization.byteSize();
    public static final long SIZE$fragmentShadingRateWithFragmentShaderInterlock = LAYOUT$fragmentShadingRateWithFragmentShaderInterlock.byteSize();
    public static final long SIZE$fragmentShadingRateWithCustomSampleLocations = LAYOUT$fragmentShadingRateWithCustomSampleLocations.byteSize();
    public static final long SIZE$fragmentShadingRateStrictMultiplyCombiner = LAYOUT$fragmentShadingRateStrictMultiplyCombiner.byteSize();
}
