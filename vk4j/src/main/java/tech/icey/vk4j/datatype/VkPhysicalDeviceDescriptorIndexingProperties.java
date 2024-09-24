package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.annotation.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.NativeLayout;
import tech.icey.vk4j.IFactory;

import static tech.icey.vk4j.enumtype.VkStructureType.*;

public record VkPhysicalDeviceDescriptorIndexingProperties(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("maxUpdateAfterBindDescriptorsInAllPools"),
        ValueLayout.JAVA_INT.withName("shaderUniformBufferArrayNonUniformIndexingNative"),
        ValueLayout.JAVA_INT.withName("shaderSampledImageArrayNonUniformIndexingNative"),
        ValueLayout.JAVA_INT.withName("shaderStorageBufferArrayNonUniformIndexingNative"),
        ValueLayout.JAVA_INT.withName("shaderStorageImageArrayNonUniformIndexingNative"),
        ValueLayout.JAVA_INT.withName("shaderInputAttachmentArrayNonUniformIndexingNative"),
        ValueLayout.JAVA_INT.withName("robustBufferAccessUpdateAfterBind"),
        ValueLayout.JAVA_INT.withName("quadDivergentImplicitLod"),
        ValueLayout.JAVA_INT.withName("maxPerStageDescriptorUpdateAfterBindSamplers"),
        ValueLayout.JAVA_INT.withName("maxPerStageDescriptorUpdateAfterBindUniformBuffers"),
        ValueLayout.JAVA_INT.withName("maxPerStageDescriptorUpdateAfterBindStorageBuffers"),
        ValueLayout.JAVA_INT.withName("maxPerStageDescriptorUpdateAfterBindSampledImages"),
        ValueLayout.JAVA_INT.withName("maxPerStageDescriptorUpdateAfterBindStorageImages"),
        ValueLayout.JAVA_INT.withName("maxPerStageDescriptorUpdateAfterBindInputAttachments"),
        ValueLayout.JAVA_INT.withName("maxPerStageUpdateAfterBindResources"),
        ValueLayout.JAVA_INT.withName("maxDescriptorSetUpdateAfterBindSamplers"),
        ValueLayout.JAVA_INT.withName("maxDescriptorSetUpdateAfterBindUniformBuffers"),
        ValueLayout.JAVA_INT.withName("maxDescriptorSetUpdateAfterBindUniformBuffersDynamic"),
        ValueLayout.JAVA_INT.withName("maxDescriptorSetUpdateAfterBindStorageBuffers"),
        ValueLayout.JAVA_INT.withName("maxDescriptorSetUpdateAfterBindStorageBuffersDynamic"),
        ValueLayout.JAVA_INT.withName("maxDescriptorSetUpdateAfterBindSampledImages"),
        ValueLayout.JAVA_INT.withName("maxDescriptorSetUpdateAfterBindStorageImages"),
        ValueLayout.JAVA_INT.withName("maxDescriptorSetUpdateAfterBindInputAttachments")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$maxUpdateAfterBindDescriptorsInAllPools = PathElement.groupElement("maxUpdateAfterBindDescriptorsInAllPools");
    public static final PathElement PATH$shaderUniformBufferArrayNonUniformIndexingNative = PathElement.groupElement("shaderUniformBufferArrayNonUniformIndexingNative");
    public static final PathElement PATH$shaderSampledImageArrayNonUniformIndexingNative = PathElement.groupElement("shaderSampledImageArrayNonUniformIndexingNative");
    public static final PathElement PATH$shaderStorageBufferArrayNonUniformIndexingNative = PathElement.groupElement("shaderStorageBufferArrayNonUniformIndexingNative");
    public static final PathElement PATH$shaderStorageImageArrayNonUniformIndexingNative = PathElement.groupElement("shaderStorageImageArrayNonUniformIndexingNative");
    public static final PathElement PATH$shaderInputAttachmentArrayNonUniformIndexingNative = PathElement.groupElement("shaderInputAttachmentArrayNonUniformIndexingNative");
    public static final PathElement PATH$robustBufferAccessUpdateAfterBind = PathElement.groupElement("robustBufferAccessUpdateAfterBind");
    public static final PathElement PATH$quadDivergentImplicitLod = PathElement.groupElement("quadDivergentImplicitLod");
    public static final PathElement PATH$maxPerStageDescriptorUpdateAfterBindSamplers = PathElement.groupElement("maxPerStageDescriptorUpdateAfterBindSamplers");
    public static final PathElement PATH$maxPerStageDescriptorUpdateAfterBindUniformBuffers = PathElement.groupElement("maxPerStageDescriptorUpdateAfterBindUniformBuffers");
    public static final PathElement PATH$maxPerStageDescriptorUpdateAfterBindStorageBuffers = PathElement.groupElement("maxPerStageDescriptorUpdateAfterBindStorageBuffers");
    public static final PathElement PATH$maxPerStageDescriptorUpdateAfterBindSampledImages = PathElement.groupElement("maxPerStageDescriptorUpdateAfterBindSampledImages");
    public static final PathElement PATH$maxPerStageDescriptorUpdateAfterBindStorageImages = PathElement.groupElement("maxPerStageDescriptorUpdateAfterBindStorageImages");
    public static final PathElement PATH$maxPerStageDescriptorUpdateAfterBindInputAttachments = PathElement.groupElement("maxPerStageDescriptorUpdateAfterBindInputAttachments");
    public static final PathElement PATH$maxPerStageUpdateAfterBindResources = PathElement.groupElement("maxPerStageUpdateAfterBindResources");
    public static final PathElement PATH$maxDescriptorSetUpdateAfterBindSamplers = PathElement.groupElement("maxDescriptorSetUpdateAfterBindSamplers");
    public static final PathElement PATH$maxDescriptorSetUpdateAfterBindUniformBuffers = PathElement.groupElement("maxDescriptorSetUpdateAfterBindUniformBuffers");
    public static final PathElement PATH$maxDescriptorSetUpdateAfterBindUniformBuffersDynamic = PathElement.groupElement("maxDescriptorSetUpdateAfterBindUniformBuffersDynamic");
    public static final PathElement PATH$maxDescriptorSetUpdateAfterBindStorageBuffers = PathElement.groupElement("maxDescriptorSetUpdateAfterBindStorageBuffers");
    public static final PathElement PATH$maxDescriptorSetUpdateAfterBindStorageBuffersDynamic = PathElement.groupElement("maxDescriptorSetUpdateAfterBindStorageBuffersDynamic");
    public static final PathElement PATH$maxDescriptorSetUpdateAfterBindSampledImages = PathElement.groupElement("maxDescriptorSetUpdateAfterBindSampledImages");
    public static final PathElement PATH$maxDescriptorSetUpdateAfterBindStorageImages = PathElement.groupElement("maxDescriptorSetUpdateAfterBindStorageImages");
    public static final PathElement PATH$maxDescriptorSetUpdateAfterBindInputAttachments = PathElement.groupElement("maxDescriptorSetUpdateAfterBindInputAttachments");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$maxUpdateAfterBindDescriptorsInAllPools = (OfInt) LAYOUT.select(PATH$maxUpdateAfterBindDescriptorsInAllPools);
    public static final OfInt LAYOUT$shaderUniformBufferArrayNonUniformIndexingNative = (OfInt) LAYOUT.select(PATH$shaderUniformBufferArrayNonUniformIndexingNative);
    public static final OfInt LAYOUT$shaderSampledImageArrayNonUniformIndexingNative = (OfInt) LAYOUT.select(PATH$shaderSampledImageArrayNonUniformIndexingNative);
    public static final OfInt LAYOUT$shaderStorageBufferArrayNonUniformIndexingNative = (OfInt) LAYOUT.select(PATH$shaderStorageBufferArrayNonUniformIndexingNative);
    public static final OfInt LAYOUT$shaderStorageImageArrayNonUniformIndexingNative = (OfInt) LAYOUT.select(PATH$shaderStorageImageArrayNonUniformIndexingNative);
    public static final OfInt LAYOUT$shaderInputAttachmentArrayNonUniformIndexingNative = (OfInt) LAYOUT.select(PATH$shaderInputAttachmentArrayNonUniformIndexingNative);
    public static final OfInt LAYOUT$robustBufferAccessUpdateAfterBind = (OfInt) LAYOUT.select(PATH$robustBufferAccessUpdateAfterBind);
    public static final OfInt LAYOUT$quadDivergentImplicitLod = (OfInt) LAYOUT.select(PATH$quadDivergentImplicitLod);
    public static final OfInt LAYOUT$maxPerStageDescriptorUpdateAfterBindSamplers = (OfInt) LAYOUT.select(PATH$maxPerStageDescriptorUpdateAfterBindSamplers);
    public static final OfInt LAYOUT$maxPerStageDescriptorUpdateAfterBindUniformBuffers = (OfInt) LAYOUT.select(PATH$maxPerStageDescriptorUpdateAfterBindUniformBuffers);
    public static final OfInt LAYOUT$maxPerStageDescriptorUpdateAfterBindStorageBuffers = (OfInt) LAYOUT.select(PATH$maxPerStageDescriptorUpdateAfterBindStorageBuffers);
    public static final OfInt LAYOUT$maxPerStageDescriptorUpdateAfterBindSampledImages = (OfInt) LAYOUT.select(PATH$maxPerStageDescriptorUpdateAfterBindSampledImages);
    public static final OfInt LAYOUT$maxPerStageDescriptorUpdateAfterBindStorageImages = (OfInt) LAYOUT.select(PATH$maxPerStageDescriptorUpdateAfterBindStorageImages);
    public static final OfInt LAYOUT$maxPerStageDescriptorUpdateAfterBindInputAttachments = (OfInt) LAYOUT.select(PATH$maxPerStageDescriptorUpdateAfterBindInputAttachments);
    public static final OfInt LAYOUT$maxPerStageUpdateAfterBindResources = (OfInt) LAYOUT.select(PATH$maxPerStageUpdateAfterBindResources);
    public static final OfInt LAYOUT$maxDescriptorSetUpdateAfterBindSamplers = (OfInt) LAYOUT.select(PATH$maxDescriptorSetUpdateAfterBindSamplers);
    public static final OfInt LAYOUT$maxDescriptorSetUpdateAfterBindUniformBuffers = (OfInt) LAYOUT.select(PATH$maxDescriptorSetUpdateAfterBindUniformBuffers);
    public static final OfInt LAYOUT$maxDescriptorSetUpdateAfterBindUniformBuffersDynamic = (OfInt) LAYOUT.select(PATH$maxDescriptorSetUpdateAfterBindUniformBuffersDynamic);
    public static final OfInt LAYOUT$maxDescriptorSetUpdateAfterBindStorageBuffers = (OfInt) LAYOUT.select(PATH$maxDescriptorSetUpdateAfterBindStorageBuffers);
    public static final OfInt LAYOUT$maxDescriptorSetUpdateAfterBindStorageBuffersDynamic = (OfInt) LAYOUT.select(PATH$maxDescriptorSetUpdateAfterBindStorageBuffersDynamic);
    public static final OfInt LAYOUT$maxDescriptorSetUpdateAfterBindSampledImages = (OfInt) LAYOUT.select(PATH$maxDescriptorSetUpdateAfterBindSampledImages);
    public static final OfInt LAYOUT$maxDescriptorSetUpdateAfterBindStorageImages = (OfInt) LAYOUT.select(PATH$maxDescriptorSetUpdateAfterBindStorageImages);
    public static final OfInt LAYOUT$maxDescriptorSetUpdateAfterBindInputAttachments = (OfInt) LAYOUT.select(PATH$maxDescriptorSetUpdateAfterBindInputAttachments);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$maxUpdateAfterBindDescriptorsInAllPools = LAYOUT.byteOffset(PATH$maxUpdateAfterBindDescriptorsInAllPools);
    public static final long OFFSET$shaderUniformBufferArrayNonUniformIndexingNative = LAYOUT.byteOffset(PATH$shaderUniformBufferArrayNonUniformIndexingNative);
    public static final long OFFSET$shaderSampledImageArrayNonUniformIndexingNative = LAYOUT.byteOffset(PATH$shaderSampledImageArrayNonUniformIndexingNative);
    public static final long OFFSET$shaderStorageBufferArrayNonUniformIndexingNative = LAYOUT.byteOffset(PATH$shaderStorageBufferArrayNonUniformIndexingNative);
    public static final long OFFSET$shaderStorageImageArrayNonUniformIndexingNative = LAYOUT.byteOffset(PATH$shaderStorageImageArrayNonUniformIndexingNative);
    public static final long OFFSET$shaderInputAttachmentArrayNonUniformIndexingNative = LAYOUT.byteOffset(PATH$shaderInputAttachmentArrayNonUniformIndexingNative);
    public static final long OFFSET$robustBufferAccessUpdateAfterBind = LAYOUT.byteOffset(PATH$robustBufferAccessUpdateAfterBind);
    public static final long OFFSET$quadDivergentImplicitLod = LAYOUT.byteOffset(PATH$quadDivergentImplicitLod);
    public static final long OFFSET$maxPerStageDescriptorUpdateAfterBindSamplers = LAYOUT.byteOffset(PATH$maxPerStageDescriptorUpdateAfterBindSamplers);
    public static final long OFFSET$maxPerStageDescriptorUpdateAfterBindUniformBuffers = LAYOUT.byteOffset(PATH$maxPerStageDescriptorUpdateAfterBindUniformBuffers);
    public static final long OFFSET$maxPerStageDescriptorUpdateAfterBindStorageBuffers = LAYOUT.byteOffset(PATH$maxPerStageDescriptorUpdateAfterBindStorageBuffers);
    public static final long OFFSET$maxPerStageDescriptorUpdateAfterBindSampledImages = LAYOUT.byteOffset(PATH$maxPerStageDescriptorUpdateAfterBindSampledImages);
    public static final long OFFSET$maxPerStageDescriptorUpdateAfterBindStorageImages = LAYOUT.byteOffset(PATH$maxPerStageDescriptorUpdateAfterBindStorageImages);
    public static final long OFFSET$maxPerStageDescriptorUpdateAfterBindInputAttachments = LAYOUT.byteOffset(PATH$maxPerStageDescriptorUpdateAfterBindInputAttachments);
    public static final long OFFSET$maxPerStageUpdateAfterBindResources = LAYOUT.byteOffset(PATH$maxPerStageUpdateAfterBindResources);
    public static final long OFFSET$maxDescriptorSetUpdateAfterBindSamplers = LAYOUT.byteOffset(PATH$maxDescriptorSetUpdateAfterBindSamplers);
    public static final long OFFSET$maxDescriptorSetUpdateAfterBindUniformBuffers = LAYOUT.byteOffset(PATH$maxDescriptorSetUpdateAfterBindUniformBuffers);
    public static final long OFFSET$maxDescriptorSetUpdateAfterBindUniformBuffersDynamic = LAYOUT.byteOffset(PATH$maxDescriptorSetUpdateAfterBindUniformBuffersDynamic);
    public static final long OFFSET$maxDescriptorSetUpdateAfterBindStorageBuffers = LAYOUT.byteOffset(PATH$maxDescriptorSetUpdateAfterBindStorageBuffers);
    public static final long OFFSET$maxDescriptorSetUpdateAfterBindStorageBuffersDynamic = LAYOUT.byteOffset(PATH$maxDescriptorSetUpdateAfterBindStorageBuffersDynamic);
    public static final long OFFSET$maxDescriptorSetUpdateAfterBindSampledImages = LAYOUT.byteOffset(PATH$maxDescriptorSetUpdateAfterBindSampledImages);
    public static final long OFFSET$maxDescriptorSetUpdateAfterBindStorageImages = LAYOUT.byteOffset(PATH$maxDescriptorSetUpdateAfterBindStorageImages);
    public static final long OFFSET$maxDescriptorSetUpdateAfterBindInputAttachments = LAYOUT.byteOffset(PATH$maxDescriptorSetUpdateAfterBindInputAttachments);

    public VkPhysicalDeviceDescriptorIndexingProperties(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_INDEXING_PROPERTIES);
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

    public @unsigned int maxUpdateAfterBindDescriptorsInAllPools() {
        return segment.get(LAYOUT$maxUpdateAfterBindDescriptorsInAllPools, OFFSET$maxUpdateAfterBindDescriptorsInAllPools);
    }

    public void maxUpdateAfterBindDescriptorsInAllPools(@unsigned int value) {
        segment.set(LAYOUT$maxUpdateAfterBindDescriptorsInAllPools, OFFSET$maxUpdateAfterBindDescriptorsInAllPools, value);
    }

    public @unsigned int shaderUniformBufferArrayNonUniformIndexingNative() {
        return segment.get(LAYOUT$shaderUniformBufferArrayNonUniformIndexingNative, OFFSET$shaderUniformBufferArrayNonUniformIndexingNative);
    }

    public void shaderUniformBufferArrayNonUniformIndexingNative(@unsigned int value) {
        segment.set(LAYOUT$shaderUniformBufferArrayNonUniformIndexingNative, OFFSET$shaderUniformBufferArrayNonUniformIndexingNative, value);
    }

    public @unsigned int shaderSampledImageArrayNonUniformIndexingNative() {
        return segment.get(LAYOUT$shaderSampledImageArrayNonUniformIndexingNative, OFFSET$shaderSampledImageArrayNonUniformIndexingNative);
    }

    public void shaderSampledImageArrayNonUniformIndexingNative(@unsigned int value) {
        segment.set(LAYOUT$shaderSampledImageArrayNonUniformIndexingNative, OFFSET$shaderSampledImageArrayNonUniformIndexingNative, value);
    }

    public @unsigned int shaderStorageBufferArrayNonUniformIndexingNative() {
        return segment.get(LAYOUT$shaderStorageBufferArrayNonUniformIndexingNative, OFFSET$shaderStorageBufferArrayNonUniformIndexingNative);
    }

    public void shaderStorageBufferArrayNonUniformIndexingNative(@unsigned int value) {
        segment.set(LAYOUT$shaderStorageBufferArrayNonUniformIndexingNative, OFFSET$shaderStorageBufferArrayNonUniformIndexingNative, value);
    }

    public @unsigned int shaderStorageImageArrayNonUniformIndexingNative() {
        return segment.get(LAYOUT$shaderStorageImageArrayNonUniformIndexingNative, OFFSET$shaderStorageImageArrayNonUniformIndexingNative);
    }

    public void shaderStorageImageArrayNonUniformIndexingNative(@unsigned int value) {
        segment.set(LAYOUT$shaderStorageImageArrayNonUniformIndexingNative, OFFSET$shaderStorageImageArrayNonUniformIndexingNative, value);
    }

    public @unsigned int shaderInputAttachmentArrayNonUniformIndexingNative() {
        return segment.get(LAYOUT$shaderInputAttachmentArrayNonUniformIndexingNative, OFFSET$shaderInputAttachmentArrayNonUniformIndexingNative);
    }

    public void shaderInputAttachmentArrayNonUniformIndexingNative(@unsigned int value) {
        segment.set(LAYOUT$shaderInputAttachmentArrayNonUniformIndexingNative, OFFSET$shaderInputAttachmentArrayNonUniformIndexingNative, value);
    }

    public @unsigned int robustBufferAccessUpdateAfterBind() {
        return segment.get(LAYOUT$robustBufferAccessUpdateAfterBind, OFFSET$robustBufferAccessUpdateAfterBind);
    }

    public void robustBufferAccessUpdateAfterBind(@unsigned int value) {
        segment.set(LAYOUT$robustBufferAccessUpdateAfterBind, OFFSET$robustBufferAccessUpdateAfterBind, value);
    }

    public @unsigned int quadDivergentImplicitLod() {
        return segment.get(LAYOUT$quadDivergentImplicitLod, OFFSET$quadDivergentImplicitLod);
    }

    public void quadDivergentImplicitLod(@unsigned int value) {
        segment.set(LAYOUT$quadDivergentImplicitLod, OFFSET$quadDivergentImplicitLod, value);
    }

    public @unsigned int maxPerStageDescriptorUpdateAfterBindSamplers() {
        return segment.get(LAYOUT$maxPerStageDescriptorUpdateAfterBindSamplers, OFFSET$maxPerStageDescriptorUpdateAfterBindSamplers);
    }

    public void maxPerStageDescriptorUpdateAfterBindSamplers(@unsigned int value) {
        segment.set(LAYOUT$maxPerStageDescriptorUpdateAfterBindSamplers, OFFSET$maxPerStageDescriptorUpdateAfterBindSamplers, value);
    }

    public @unsigned int maxPerStageDescriptorUpdateAfterBindUniformBuffers() {
        return segment.get(LAYOUT$maxPerStageDescriptorUpdateAfterBindUniformBuffers, OFFSET$maxPerStageDescriptorUpdateAfterBindUniformBuffers);
    }

    public void maxPerStageDescriptorUpdateAfterBindUniformBuffers(@unsigned int value) {
        segment.set(LAYOUT$maxPerStageDescriptorUpdateAfterBindUniformBuffers, OFFSET$maxPerStageDescriptorUpdateAfterBindUniformBuffers, value);
    }

    public @unsigned int maxPerStageDescriptorUpdateAfterBindStorageBuffers() {
        return segment.get(LAYOUT$maxPerStageDescriptorUpdateAfterBindStorageBuffers, OFFSET$maxPerStageDescriptorUpdateAfterBindStorageBuffers);
    }

    public void maxPerStageDescriptorUpdateAfterBindStorageBuffers(@unsigned int value) {
        segment.set(LAYOUT$maxPerStageDescriptorUpdateAfterBindStorageBuffers, OFFSET$maxPerStageDescriptorUpdateAfterBindStorageBuffers, value);
    }

    public @unsigned int maxPerStageDescriptorUpdateAfterBindSampledImages() {
        return segment.get(LAYOUT$maxPerStageDescriptorUpdateAfterBindSampledImages, OFFSET$maxPerStageDescriptorUpdateAfterBindSampledImages);
    }

    public void maxPerStageDescriptorUpdateAfterBindSampledImages(@unsigned int value) {
        segment.set(LAYOUT$maxPerStageDescriptorUpdateAfterBindSampledImages, OFFSET$maxPerStageDescriptorUpdateAfterBindSampledImages, value);
    }

    public @unsigned int maxPerStageDescriptorUpdateAfterBindStorageImages() {
        return segment.get(LAYOUT$maxPerStageDescriptorUpdateAfterBindStorageImages, OFFSET$maxPerStageDescriptorUpdateAfterBindStorageImages);
    }

    public void maxPerStageDescriptorUpdateAfterBindStorageImages(@unsigned int value) {
        segment.set(LAYOUT$maxPerStageDescriptorUpdateAfterBindStorageImages, OFFSET$maxPerStageDescriptorUpdateAfterBindStorageImages, value);
    }

    public @unsigned int maxPerStageDescriptorUpdateAfterBindInputAttachments() {
        return segment.get(LAYOUT$maxPerStageDescriptorUpdateAfterBindInputAttachments, OFFSET$maxPerStageDescriptorUpdateAfterBindInputAttachments);
    }

    public void maxPerStageDescriptorUpdateAfterBindInputAttachments(@unsigned int value) {
        segment.set(LAYOUT$maxPerStageDescriptorUpdateAfterBindInputAttachments, OFFSET$maxPerStageDescriptorUpdateAfterBindInputAttachments, value);
    }

    public @unsigned int maxPerStageUpdateAfterBindResources() {
        return segment.get(LAYOUT$maxPerStageUpdateAfterBindResources, OFFSET$maxPerStageUpdateAfterBindResources);
    }

    public void maxPerStageUpdateAfterBindResources(@unsigned int value) {
        segment.set(LAYOUT$maxPerStageUpdateAfterBindResources, OFFSET$maxPerStageUpdateAfterBindResources, value);
    }

    public @unsigned int maxDescriptorSetUpdateAfterBindSamplers() {
        return segment.get(LAYOUT$maxDescriptorSetUpdateAfterBindSamplers, OFFSET$maxDescriptorSetUpdateAfterBindSamplers);
    }

    public void maxDescriptorSetUpdateAfterBindSamplers(@unsigned int value) {
        segment.set(LAYOUT$maxDescriptorSetUpdateAfterBindSamplers, OFFSET$maxDescriptorSetUpdateAfterBindSamplers, value);
    }

    public @unsigned int maxDescriptorSetUpdateAfterBindUniformBuffers() {
        return segment.get(LAYOUT$maxDescriptorSetUpdateAfterBindUniformBuffers, OFFSET$maxDescriptorSetUpdateAfterBindUniformBuffers);
    }

    public void maxDescriptorSetUpdateAfterBindUniformBuffers(@unsigned int value) {
        segment.set(LAYOUT$maxDescriptorSetUpdateAfterBindUniformBuffers, OFFSET$maxDescriptorSetUpdateAfterBindUniformBuffers, value);
    }

    public @unsigned int maxDescriptorSetUpdateAfterBindUniformBuffersDynamic() {
        return segment.get(LAYOUT$maxDescriptorSetUpdateAfterBindUniformBuffersDynamic, OFFSET$maxDescriptorSetUpdateAfterBindUniformBuffersDynamic);
    }

    public void maxDescriptorSetUpdateAfterBindUniformBuffersDynamic(@unsigned int value) {
        segment.set(LAYOUT$maxDescriptorSetUpdateAfterBindUniformBuffersDynamic, OFFSET$maxDescriptorSetUpdateAfterBindUniformBuffersDynamic, value);
    }

    public @unsigned int maxDescriptorSetUpdateAfterBindStorageBuffers() {
        return segment.get(LAYOUT$maxDescriptorSetUpdateAfterBindStorageBuffers, OFFSET$maxDescriptorSetUpdateAfterBindStorageBuffers);
    }

    public void maxDescriptorSetUpdateAfterBindStorageBuffers(@unsigned int value) {
        segment.set(LAYOUT$maxDescriptorSetUpdateAfterBindStorageBuffers, OFFSET$maxDescriptorSetUpdateAfterBindStorageBuffers, value);
    }

    public @unsigned int maxDescriptorSetUpdateAfterBindStorageBuffersDynamic() {
        return segment.get(LAYOUT$maxDescriptorSetUpdateAfterBindStorageBuffersDynamic, OFFSET$maxDescriptorSetUpdateAfterBindStorageBuffersDynamic);
    }

    public void maxDescriptorSetUpdateAfterBindStorageBuffersDynamic(@unsigned int value) {
        segment.set(LAYOUT$maxDescriptorSetUpdateAfterBindStorageBuffersDynamic, OFFSET$maxDescriptorSetUpdateAfterBindStorageBuffersDynamic, value);
    }

    public @unsigned int maxDescriptorSetUpdateAfterBindSampledImages() {
        return segment.get(LAYOUT$maxDescriptorSetUpdateAfterBindSampledImages, OFFSET$maxDescriptorSetUpdateAfterBindSampledImages);
    }

    public void maxDescriptorSetUpdateAfterBindSampledImages(@unsigned int value) {
        segment.set(LAYOUT$maxDescriptorSetUpdateAfterBindSampledImages, OFFSET$maxDescriptorSetUpdateAfterBindSampledImages, value);
    }

    public @unsigned int maxDescriptorSetUpdateAfterBindStorageImages() {
        return segment.get(LAYOUT$maxDescriptorSetUpdateAfterBindStorageImages, OFFSET$maxDescriptorSetUpdateAfterBindStorageImages);
    }

    public void maxDescriptorSetUpdateAfterBindStorageImages(@unsigned int value) {
        segment.set(LAYOUT$maxDescriptorSetUpdateAfterBindStorageImages, OFFSET$maxDescriptorSetUpdateAfterBindStorageImages, value);
    }

    public @unsigned int maxDescriptorSetUpdateAfterBindInputAttachments() {
        return segment.get(LAYOUT$maxDescriptorSetUpdateAfterBindInputAttachments, OFFSET$maxDescriptorSetUpdateAfterBindInputAttachments);
    }

    public void maxDescriptorSetUpdateAfterBindInputAttachments(@unsigned int value) {
        segment.set(LAYOUT$maxDescriptorSetUpdateAfterBindInputAttachments, OFFSET$maxDescriptorSetUpdateAfterBindInputAttachments, value);
    }


    public static final class Factory implements IFactory<VkPhysicalDeviceDescriptorIndexingProperties> {
        @Override
        public Class<VkPhysicalDeviceDescriptorIndexingProperties> clazz() {
            return VkPhysicalDeviceDescriptorIndexingProperties.class;
        }

        @Override
        public MemoryLayout layout() {
            return VkPhysicalDeviceDescriptorIndexingProperties.LAYOUT;
        }

        @Override
        public VkPhysicalDeviceDescriptorIndexingProperties create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkPhysicalDeviceDescriptorIndexingProperties createUninit(MemorySegment segment) {
            return new VkPhysicalDeviceDescriptorIndexingProperties(segment);
        }
    }

    public static final Factory FACTORY = new Factory();
}
