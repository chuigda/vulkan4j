package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.annotation.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.buffer.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import tech.icey.vk4j.NativeLayout;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

public record VkPhysicalDeviceDescriptorIndexingFeatures(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("shaderInputAttachmentArrayDynamicIndexing"),
        ValueLayout.JAVA_INT.withName("shaderUniformTexelBufferArrayDynamicIndexing"),
        ValueLayout.JAVA_INT.withName("shaderStorageTexelBufferArrayDynamicIndexing"),
        ValueLayout.JAVA_INT.withName("shaderUniformBufferArrayNonUniformIndexing"),
        ValueLayout.JAVA_INT.withName("shaderSampledImageArrayNonUniformIndexing"),
        ValueLayout.JAVA_INT.withName("shaderStorageBufferArrayNonUniformIndexing"),
        ValueLayout.JAVA_INT.withName("shaderStorageImageArrayNonUniformIndexing"),
        ValueLayout.JAVA_INT.withName("shaderInputAttachmentArrayNonUniformIndexing"),
        ValueLayout.JAVA_INT.withName("shaderUniformTexelBufferArrayNonUniformIndexing"),
        ValueLayout.JAVA_INT.withName("shaderStorageTexelBufferArrayNonUniformIndexing"),
        ValueLayout.JAVA_INT.withName("descriptorBindingUniformBufferUpdateAfterBind"),
        ValueLayout.JAVA_INT.withName("descriptorBindingSampledImageUpdateAfterBind"),
        ValueLayout.JAVA_INT.withName("descriptorBindingStorageImageUpdateAfterBind"),
        ValueLayout.JAVA_INT.withName("descriptorBindingStorageBufferUpdateAfterBind"),
        ValueLayout.JAVA_INT.withName("descriptorBindingUniformTexelBufferUpdateAfterBind"),
        ValueLayout.JAVA_INT.withName("descriptorBindingStorageTexelBufferUpdateAfterBind"),
        ValueLayout.JAVA_INT.withName("descriptorBindingUpdateUnusedWhilePending"),
        ValueLayout.JAVA_INT.withName("descriptorBindingPartiallyBound"),
        ValueLayout.JAVA_INT.withName("descriptorBindingVariableDescriptorCount"),
        ValueLayout.JAVA_INT.withName("runtimeDescriptorArray")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$shaderInputAttachmentArrayDynamicIndexing = PathElement.groupElement("shaderInputAttachmentArrayDynamicIndexing");
    public static final PathElement PATH$shaderUniformTexelBufferArrayDynamicIndexing = PathElement.groupElement("shaderUniformTexelBufferArrayDynamicIndexing");
    public static final PathElement PATH$shaderStorageTexelBufferArrayDynamicIndexing = PathElement.groupElement("shaderStorageTexelBufferArrayDynamicIndexing");
    public static final PathElement PATH$shaderUniformBufferArrayNonUniformIndexing = PathElement.groupElement("shaderUniformBufferArrayNonUniformIndexing");
    public static final PathElement PATH$shaderSampledImageArrayNonUniformIndexing = PathElement.groupElement("shaderSampledImageArrayNonUniformIndexing");
    public static final PathElement PATH$shaderStorageBufferArrayNonUniformIndexing = PathElement.groupElement("shaderStorageBufferArrayNonUniformIndexing");
    public static final PathElement PATH$shaderStorageImageArrayNonUniformIndexing = PathElement.groupElement("shaderStorageImageArrayNonUniformIndexing");
    public static final PathElement PATH$shaderInputAttachmentArrayNonUniformIndexing = PathElement.groupElement("shaderInputAttachmentArrayNonUniformIndexing");
    public static final PathElement PATH$shaderUniformTexelBufferArrayNonUniformIndexing = PathElement.groupElement("shaderUniformTexelBufferArrayNonUniformIndexing");
    public static final PathElement PATH$shaderStorageTexelBufferArrayNonUniformIndexing = PathElement.groupElement("shaderStorageTexelBufferArrayNonUniformIndexing");
    public static final PathElement PATH$descriptorBindingUniformBufferUpdateAfterBind = PathElement.groupElement("descriptorBindingUniformBufferUpdateAfterBind");
    public static final PathElement PATH$descriptorBindingSampledImageUpdateAfterBind = PathElement.groupElement("descriptorBindingSampledImageUpdateAfterBind");
    public static final PathElement PATH$descriptorBindingStorageImageUpdateAfterBind = PathElement.groupElement("descriptorBindingStorageImageUpdateAfterBind");
    public static final PathElement PATH$descriptorBindingStorageBufferUpdateAfterBind = PathElement.groupElement("descriptorBindingStorageBufferUpdateAfterBind");
    public static final PathElement PATH$descriptorBindingUniformTexelBufferUpdateAfterBind = PathElement.groupElement("descriptorBindingUniformTexelBufferUpdateAfterBind");
    public static final PathElement PATH$descriptorBindingStorageTexelBufferUpdateAfterBind = PathElement.groupElement("descriptorBindingStorageTexelBufferUpdateAfterBind");
    public static final PathElement PATH$descriptorBindingUpdateUnusedWhilePending = PathElement.groupElement("descriptorBindingUpdateUnusedWhilePending");
    public static final PathElement PATH$descriptorBindingPartiallyBound = PathElement.groupElement("descriptorBindingPartiallyBound");
    public static final PathElement PATH$descriptorBindingVariableDescriptorCount = PathElement.groupElement("descriptorBindingVariableDescriptorCount");
    public static final PathElement PATH$runtimeDescriptorArray = PathElement.groupElement("runtimeDescriptorArray");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$shaderInputAttachmentArrayDynamicIndexing = (OfInt) LAYOUT.select(PATH$shaderInputAttachmentArrayDynamicIndexing);
    public static final OfInt LAYOUT$shaderUniformTexelBufferArrayDynamicIndexing = (OfInt) LAYOUT.select(PATH$shaderUniformTexelBufferArrayDynamicIndexing);
    public static final OfInt LAYOUT$shaderStorageTexelBufferArrayDynamicIndexing = (OfInt) LAYOUT.select(PATH$shaderStorageTexelBufferArrayDynamicIndexing);
    public static final OfInt LAYOUT$shaderUniformBufferArrayNonUniformIndexing = (OfInt) LAYOUT.select(PATH$shaderUniformBufferArrayNonUniformIndexing);
    public static final OfInt LAYOUT$shaderSampledImageArrayNonUniformIndexing = (OfInt) LAYOUT.select(PATH$shaderSampledImageArrayNonUniformIndexing);
    public static final OfInt LAYOUT$shaderStorageBufferArrayNonUniformIndexing = (OfInt) LAYOUT.select(PATH$shaderStorageBufferArrayNonUniformIndexing);
    public static final OfInt LAYOUT$shaderStorageImageArrayNonUniformIndexing = (OfInt) LAYOUT.select(PATH$shaderStorageImageArrayNonUniformIndexing);
    public static final OfInt LAYOUT$shaderInputAttachmentArrayNonUniformIndexing = (OfInt) LAYOUT.select(PATH$shaderInputAttachmentArrayNonUniformIndexing);
    public static final OfInt LAYOUT$shaderUniformTexelBufferArrayNonUniformIndexing = (OfInt) LAYOUT.select(PATH$shaderUniformTexelBufferArrayNonUniformIndexing);
    public static final OfInt LAYOUT$shaderStorageTexelBufferArrayNonUniformIndexing = (OfInt) LAYOUT.select(PATH$shaderStorageTexelBufferArrayNonUniformIndexing);
    public static final OfInt LAYOUT$descriptorBindingUniformBufferUpdateAfterBind = (OfInt) LAYOUT.select(PATH$descriptorBindingUniformBufferUpdateAfterBind);
    public static final OfInt LAYOUT$descriptorBindingSampledImageUpdateAfterBind = (OfInt) LAYOUT.select(PATH$descriptorBindingSampledImageUpdateAfterBind);
    public static final OfInt LAYOUT$descriptorBindingStorageImageUpdateAfterBind = (OfInt) LAYOUT.select(PATH$descriptorBindingStorageImageUpdateAfterBind);
    public static final OfInt LAYOUT$descriptorBindingStorageBufferUpdateAfterBind = (OfInt) LAYOUT.select(PATH$descriptorBindingStorageBufferUpdateAfterBind);
    public static final OfInt LAYOUT$descriptorBindingUniformTexelBufferUpdateAfterBind = (OfInt) LAYOUT.select(PATH$descriptorBindingUniformTexelBufferUpdateAfterBind);
    public static final OfInt LAYOUT$descriptorBindingStorageTexelBufferUpdateAfterBind = (OfInt) LAYOUT.select(PATH$descriptorBindingStorageTexelBufferUpdateAfterBind);
    public static final OfInt LAYOUT$descriptorBindingUpdateUnusedWhilePending = (OfInt) LAYOUT.select(PATH$descriptorBindingUpdateUnusedWhilePending);
    public static final OfInt LAYOUT$descriptorBindingPartiallyBound = (OfInt) LAYOUT.select(PATH$descriptorBindingPartiallyBound);
    public static final OfInt LAYOUT$descriptorBindingVariableDescriptorCount = (OfInt) LAYOUT.select(PATH$descriptorBindingVariableDescriptorCount);
    public static final OfInt LAYOUT$runtimeDescriptorArray = (OfInt) LAYOUT.select(PATH$runtimeDescriptorArray);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$shaderInputAttachmentArrayDynamicIndexing = LAYOUT.byteOffset(PATH$shaderInputAttachmentArrayDynamicIndexing);
    public static final long OFFSET$shaderUniformTexelBufferArrayDynamicIndexing = LAYOUT.byteOffset(PATH$shaderUniformTexelBufferArrayDynamicIndexing);
    public static final long OFFSET$shaderStorageTexelBufferArrayDynamicIndexing = LAYOUT.byteOffset(PATH$shaderStorageTexelBufferArrayDynamicIndexing);
    public static final long OFFSET$shaderUniformBufferArrayNonUniformIndexing = LAYOUT.byteOffset(PATH$shaderUniformBufferArrayNonUniformIndexing);
    public static final long OFFSET$shaderSampledImageArrayNonUniformIndexing = LAYOUT.byteOffset(PATH$shaderSampledImageArrayNonUniformIndexing);
    public static final long OFFSET$shaderStorageBufferArrayNonUniformIndexing = LAYOUT.byteOffset(PATH$shaderStorageBufferArrayNonUniformIndexing);
    public static final long OFFSET$shaderStorageImageArrayNonUniformIndexing = LAYOUT.byteOffset(PATH$shaderStorageImageArrayNonUniformIndexing);
    public static final long OFFSET$shaderInputAttachmentArrayNonUniformIndexing = LAYOUT.byteOffset(PATH$shaderInputAttachmentArrayNonUniformIndexing);
    public static final long OFFSET$shaderUniformTexelBufferArrayNonUniformIndexing = LAYOUT.byteOffset(PATH$shaderUniformTexelBufferArrayNonUniformIndexing);
    public static final long OFFSET$shaderStorageTexelBufferArrayNonUniformIndexing = LAYOUT.byteOffset(PATH$shaderStorageTexelBufferArrayNonUniformIndexing);
    public static final long OFFSET$descriptorBindingUniformBufferUpdateAfterBind = LAYOUT.byteOffset(PATH$descriptorBindingUniformBufferUpdateAfterBind);
    public static final long OFFSET$descriptorBindingSampledImageUpdateAfterBind = LAYOUT.byteOffset(PATH$descriptorBindingSampledImageUpdateAfterBind);
    public static final long OFFSET$descriptorBindingStorageImageUpdateAfterBind = LAYOUT.byteOffset(PATH$descriptorBindingStorageImageUpdateAfterBind);
    public static final long OFFSET$descriptorBindingStorageBufferUpdateAfterBind = LAYOUT.byteOffset(PATH$descriptorBindingStorageBufferUpdateAfterBind);
    public static final long OFFSET$descriptorBindingUniformTexelBufferUpdateAfterBind = LAYOUT.byteOffset(PATH$descriptorBindingUniformTexelBufferUpdateAfterBind);
    public static final long OFFSET$descriptorBindingStorageTexelBufferUpdateAfterBind = LAYOUT.byteOffset(PATH$descriptorBindingStorageTexelBufferUpdateAfterBind);
    public static final long OFFSET$descriptorBindingUpdateUnusedWhilePending = LAYOUT.byteOffset(PATH$descriptorBindingUpdateUnusedWhilePending);
    public static final long OFFSET$descriptorBindingPartiallyBound = LAYOUT.byteOffset(PATH$descriptorBindingPartiallyBound);
    public static final long OFFSET$descriptorBindingVariableDescriptorCount = LAYOUT.byteOffset(PATH$descriptorBindingVariableDescriptorCount);
    public static final long OFFSET$runtimeDescriptorArray = LAYOUT.byteOffset(PATH$runtimeDescriptorArray);

    public VkPhysicalDeviceDescriptorIndexingFeatures(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_INDEXING_FEATURES);
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

    public @unsigned int shaderInputAttachmentArrayDynamicIndexing() {
        return segment.get(LAYOUT$shaderInputAttachmentArrayDynamicIndexing, OFFSET$shaderInputAttachmentArrayDynamicIndexing);
    }

    public void shaderInputAttachmentArrayDynamicIndexing(@unsigned int value) {
        segment.set(LAYOUT$shaderInputAttachmentArrayDynamicIndexing, OFFSET$shaderInputAttachmentArrayDynamicIndexing, value);
    }

    public @unsigned int shaderUniformTexelBufferArrayDynamicIndexing() {
        return segment.get(LAYOUT$shaderUniformTexelBufferArrayDynamicIndexing, OFFSET$shaderUniformTexelBufferArrayDynamicIndexing);
    }

    public void shaderUniformTexelBufferArrayDynamicIndexing(@unsigned int value) {
        segment.set(LAYOUT$shaderUniformTexelBufferArrayDynamicIndexing, OFFSET$shaderUniformTexelBufferArrayDynamicIndexing, value);
    }

    public @unsigned int shaderStorageTexelBufferArrayDynamicIndexing() {
        return segment.get(LAYOUT$shaderStorageTexelBufferArrayDynamicIndexing, OFFSET$shaderStorageTexelBufferArrayDynamicIndexing);
    }

    public void shaderStorageTexelBufferArrayDynamicIndexing(@unsigned int value) {
        segment.set(LAYOUT$shaderStorageTexelBufferArrayDynamicIndexing, OFFSET$shaderStorageTexelBufferArrayDynamicIndexing, value);
    }

    public @unsigned int shaderUniformBufferArrayNonUniformIndexing() {
        return segment.get(LAYOUT$shaderUniformBufferArrayNonUniformIndexing, OFFSET$shaderUniformBufferArrayNonUniformIndexing);
    }

    public void shaderUniformBufferArrayNonUniformIndexing(@unsigned int value) {
        segment.set(LAYOUT$shaderUniformBufferArrayNonUniformIndexing, OFFSET$shaderUniformBufferArrayNonUniformIndexing, value);
    }

    public @unsigned int shaderSampledImageArrayNonUniformIndexing() {
        return segment.get(LAYOUT$shaderSampledImageArrayNonUniformIndexing, OFFSET$shaderSampledImageArrayNonUniformIndexing);
    }

    public void shaderSampledImageArrayNonUniformIndexing(@unsigned int value) {
        segment.set(LAYOUT$shaderSampledImageArrayNonUniformIndexing, OFFSET$shaderSampledImageArrayNonUniformIndexing, value);
    }

    public @unsigned int shaderStorageBufferArrayNonUniformIndexing() {
        return segment.get(LAYOUT$shaderStorageBufferArrayNonUniformIndexing, OFFSET$shaderStorageBufferArrayNonUniformIndexing);
    }

    public void shaderStorageBufferArrayNonUniformIndexing(@unsigned int value) {
        segment.set(LAYOUT$shaderStorageBufferArrayNonUniformIndexing, OFFSET$shaderStorageBufferArrayNonUniformIndexing, value);
    }

    public @unsigned int shaderStorageImageArrayNonUniformIndexing() {
        return segment.get(LAYOUT$shaderStorageImageArrayNonUniformIndexing, OFFSET$shaderStorageImageArrayNonUniformIndexing);
    }

    public void shaderStorageImageArrayNonUniformIndexing(@unsigned int value) {
        segment.set(LAYOUT$shaderStorageImageArrayNonUniformIndexing, OFFSET$shaderStorageImageArrayNonUniformIndexing, value);
    }

    public @unsigned int shaderInputAttachmentArrayNonUniformIndexing() {
        return segment.get(LAYOUT$shaderInputAttachmentArrayNonUniformIndexing, OFFSET$shaderInputAttachmentArrayNonUniformIndexing);
    }

    public void shaderInputAttachmentArrayNonUniformIndexing(@unsigned int value) {
        segment.set(LAYOUT$shaderInputAttachmentArrayNonUniformIndexing, OFFSET$shaderInputAttachmentArrayNonUniformIndexing, value);
    }

    public @unsigned int shaderUniformTexelBufferArrayNonUniformIndexing() {
        return segment.get(LAYOUT$shaderUniformTexelBufferArrayNonUniformIndexing, OFFSET$shaderUniformTexelBufferArrayNonUniformIndexing);
    }

    public void shaderUniformTexelBufferArrayNonUniformIndexing(@unsigned int value) {
        segment.set(LAYOUT$shaderUniformTexelBufferArrayNonUniformIndexing, OFFSET$shaderUniformTexelBufferArrayNonUniformIndexing, value);
    }

    public @unsigned int shaderStorageTexelBufferArrayNonUniformIndexing() {
        return segment.get(LAYOUT$shaderStorageTexelBufferArrayNonUniformIndexing, OFFSET$shaderStorageTexelBufferArrayNonUniformIndexing);
    }

    public void shaderStorageTexelBufferArrayNonUniformIndexing(@unsigned int value) {
        segment.set(LAYOUT$shaderStorageTexelBufferArrayNonUniformIndexing, OFFSET$shaderStorageTexelBufferArrayNonUniformIndexing, value);
    }

    public @unsigned int descriptorBindingUniformBufferUpdateAfterBind() {
        return segment.get(LAYOUT$descriptorBindingUniformBufferUpdateAfterBind, OFFSET$descriptorBindingUniformBufferUpdateAfterBind);
    }

    public void descriptorBindingUniformBufferUpdateAfterBind(@unsigned int value) {
        segment.set(LAYOUT$descriptorBindingUniformBufferUpdateAfterBind, OFFSET$descriptorBindingUniformBufferUpdateAfterBind, value);
    }

    public @unsigned int descriptorBindingSampledImageUpdateAfterBind() {
        return segment.get(LAYOUT$descriptorBindingSampledImageUpdateAfterBind, OFFSET$descriptorBindingSampledImageUpdateAfterBind);
    }

    public void descriptorBindingSampledImageUpdateAfterBind(@unsigned int value) {
        segment.set(LAYOUT$descriptorBindingSampledImageUpdateAfterBind, OFFSET$descriptorBindingSampledImageUpdateAfterBind, value);
    }

    public @unsigned int descriptorBindingStorageImageUpdateAfterBind() {
        return segment.get(LAYOUT$descriptorBindingStorageImageUpdateAfterBind, OFFSET$descriptorBindingStorageImageUpdateAfterBind);
    }

    public void descriptorBindingStorageImageUpdateAfterBind(@unsigned int value) {
        segment.set(LAYOUT$descriptorBindingStorageImageUpdateAfterBind, OFFSET$descriptorBindingStorageImageUpdateAfterBind, value);
    }

    public @unsigned int descriptorBindingStorageBufferUpdateAfterBind() {
        return segment.get(LAYOUT$descriptorBindingStorageBufferUpdateAfterBind, OFFSET$descriptorBindingStorageBufferUpdateAfterBind);
    }

    public void descriptorBindingStorageBufferUpdateAfterBind(@unsigned int value) {
        segment.set(LAYOUT$descriptorBindingStorageBufferUpdateAfterBind, OFFSET$descriptorBindingStorageBufferUpdateAfterBind, value);
    }

    public @unsigned int descriptorBindingUniformTexelBufferUpdateAfterBind() {
        return segment.get(LAYOUT$descriptorBindingUniformTexelBufferUpdateAfterBind, OFFSET$descriptorBindingUniformTexelBufferUpdateAfterBind);
    }

    public void descriptorBindingUniformTexelBufferUpdateAfterBind(@unsigned int value) {
        segment.set(LAYOUT$descriptorBindingUniformTexelBufferUpdateAfterBind, OFFSET$descriptorBindingUniformTexelBufferUpdateAfterBind, value);
    }

    public @unsigned int descriptorBindingStorageTexelBufferUpdateAfterBind() {
        return segment.get(LAYOUT$descriptorBindingStorageTexelBufferUpdateAfterBind, OFFSET$descriptorBindingStorageTexelBufferUpdateAfterBind);
    }

    public void descriptorBindingStorageTexelBufferUpdateAfterBind(@unsigned int value) {
        segment.set(LAYOUT$descriptorBindingStorageTexelBufferUpdateAfterBind, OFFSET$descriptorBindingStorageTexelBufferUpdateAfterBind, value);
    }

    public @unsigned int descriptorBindingUpdateUnusedWhilePending() {
        return segment.get(LAYOUT$descriptorBindingUpdateUnusedWhilePending, OFFSET$descriptorBindingUpdateUnusedWhilePending);
    }

    public void descriptorBindingUpdateUnusedWhilePending(@unsigned int value) {
        segment.set(LAYOUT$descriptorBindingUpdateUnusedWhilePending, OFFSET$descriptorBindingUpdateUnusedWhilePending, value);
    }

    public @unsigned int descriptorBindingPartiallyBound() {
        return segment.get(LAYOUT$descriptorBindingPartiallyBound, OFFSET$descriptorBindingPartiallyBound);
    }

    public void descriptorBindingPartiallyBound(@unsigned int value) {
        segment.set(LAYOUT$descriptorBindingPartiallyBound, OFFSET$descriptorBindingPartiallyBound, value);
    }

    public @unsigned int descriptorBindingVariableDescriptorCount() {
        return segment.get(LAYOUT$descriptorBindingVariableDescriptorCount, OFFSET$descriptorBindingVariableDescriptorCount);
    }

    public void descriptorBindingVariableDescriptorCount(@unsigned int value) {
        segment.set(LAYOUT$descriptorBindingVariableDescriptorCount, OFFSET$descriptorBindingVariableDescriptorCount, value);
    }

    public @unsigned int runtimeDescriptorArray() {
        return segment.get(LAYOUT$runtimeDescriptorArray, OFFSET$runtimeDescriptorArray);
    }

    public void runtimeDescriptorArray(@unsigned int value) {
        segment.set(LAYOUT$runtimeDescriptorArray, OFFSET$runtimeDescriptorArray, value);
    }

    public static VkPhysicalDeviceDescriptorIndexingFeatures allocate(Arena arena) {
        return new VkPhysicalDeviceDescriptorIndexingFeatures(arena.allocate(LAYOUT));
    }
    
    public static VkPhysicalDeviceDescriptorIndexingFeatures[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceDescriptorIndexingFeatures[] ret = new VkPhysicalDeviceDescriptorIndexingFeatures[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkPhysicalDeviceDescriptorIndexingFeatures(segment.asSlice(i * LAYOUT.byteSize(), LAYOUT.byteSize()));
        }
        return ret;
    }
}
