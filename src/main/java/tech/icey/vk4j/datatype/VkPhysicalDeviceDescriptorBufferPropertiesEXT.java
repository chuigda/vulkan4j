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

public record VkPhysicalDeviceDescriptorBufferPropertiesEXT(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("combinedImageSamplerDescriptorSingleArray"),
        ValueLayout.JAVA_INT.withName("bufferlessPushDescriptors"),
        ValueLayout.JAVA_INT.withName("allowSamplerImageViewPostSubmitCreation"),
        ValueLayout.JAVA_LONG.withName("descriptorBufferOffsetAlignment"),
        ValueLayout.JAVA_INT.withName("maxDescriptorBufferBindings"),
        ValueLayout.JAVA_INT.withName("maxResourceDescriptorBufferBindings"),
        ValueLayout.JAVA_INT.withName("maxSamplerDescriptorBufferBindings"),
        ValueLayout.JAVA_INT.withName("maxEmbeddedImmutableSamplerBindings"),
        ValueLayout.JAVA_INT.withName("maxEmbeddedImmutableSamplers"),
        NativeLayout.C_SIZE_T.withName("bufferCaptureReplayDescriptorDataSize"),
        NativeLayout.C_SIZE_T.withName("imageCaptureReplayDescriptorDataSize"),
        NativeLayout.C_SIZE_T.withName("imageViewCaptureReplayDescriptorDataSize"),
        NativeLayout.C_SIZE_T.withName("samplerCaptureReplayDescriptorDataSize"),
        NativeLayout.C_SIZE_T.withName("accelerationStructureCaptureReplayDescriptorDataSize"),
        NativeLayout.C_SIZE_T.withName("samplerDescriptorSize"),
        NativeLayout.C_SIZE_T.withName("combinedImageSamplerDescriptorSize"),
        NativeLayout.C_SIZE_T.withName("sampledImageDescriptorSize"),
        NativeLayout.C_SIZE_T.withName("storageImageDescriptorSize"),
        NativeLayout.C_SIZE_T.withName("uniformTexelBufferDescriptorSize"),
        NativeLayout.C_SIZE_T.withName("robustUniformTexelBufferDescriptorSize"),
        NativeLayout.C_SIZE_T.withName("storageTexelBufferDescriptorSize"),
        NativeLayout.C_SIZE_T.withName("robustStorageTexelBufferDescriptorSize"),
        NativeLayout.C_SIZE_T.withName("uniformBufferDescriptorSize"),
        NativeLayout.C_SIZE_T.withName("robustUniformBufferDescriptorSize"),
        NativeLayout.C_SIZE_T.withName("storageBufferDescriptorSize"),
        NativeLayout.C_SIZE_T.withName("robustStorageBufferDescriptorSize"),
        NativeLayout.C_SIZE_T.withName("inputAttachmentDescriptorSize"),
        NativeLayout.C_SIZE_T.withName("accelerationStructureDescriptorSize"),
        ValueLayout.JAVA_LONG.withName("maxSamplerDescriptorBufferRange"),
        ValueLayout.JAVA_LONG.withName("maxResourceDescriptorBufferRange"),
        ValueLayout.JAVA_LONG.withName("samplerDescriptorBufferAddressSpaceSize"),
        ValueLayout.JAVA_LONG.withName("resourceDescriptorBufferAddressSpaceSize"),
        ValueLayout.JAVA_LONG.withName("descriptorBufferAddressSpaceSize")
    );

    public static final PathElement PATH$sType = PathElement.groupElement(0);
    public static final PathElement PATH$pNext = PathElement.groupElement(1);
    public static final PathElement PATH$combinedImageSamplerDescriptorSingleArray = PathElement.groupElement(2);
    public static final PathElement PATH$bufferlessPushDescriptors = PathElement.groupElement(3);
    public static final PathElement PATH$allowSamplerImageViewPostSubmitCreation = PathElement.groupElement(4);
    public static final PathElement PATH$descriptorBufferOffsetAlignment = PathElement.groupElement(5);
    public static final PathElement PATH$maxDescriptorBufferBindings = PathElement.groupElement(6);
    public static final PathElement PATH$maxResourceDescriptorBufferBindings = PathElement.groupElement(7);
    public static final PathElement PATH$maxSamplerDescriptorBufferBindings = PathElement.groupElement(8);
    public static final PathElement PATH$maxEmbeddedImmutableSamplerBindings = PathElement.groupElement(9);
    public static final PathElement PATH$maxEmbeddedImmutableSamplers = PathElement.groupElement(10);
    public static final PathElement PATH$bufferCaptureReplayDescriptorDataSize = PathElement.groupElement(11);
    public static final PathElement PATH$imageCaptureReplayDescriptorDataSize = PathElement.groupElement(12);
    public static final PathElement PATH$imageViewCaptureReplayDescriptorDataSize = PathElement.groupElement(13);
    public static final PathElement PATH$samplerCaptureReplayDescriptorDataSize = PathElement.groupElement(14);
    public static final PathElement PATH$accelerationStructureCaptureReplayDescriptorDataSize = PathElement.groupElement(15);
    public static final PathElement PATH$samplerDescriptorSize = PathElement.groupElement(16);
    public static final PathElement PATH$combinedImageSamplerDescriptorSize = PathElement.groupElement(17);
    public static final PathElement PATH$sampledImageDescriptorSize = PathElement.groupElement(18);
    public static final PathElement PATH$storageImageDescriptorSize = PathElement.groupElement(19);
    public static final PathElement PATH$uniformTexelBufferDescriptorSize = PathElement.groupElement(20);
    public static final PathElement PATH$robustUniformTexelBufferDescriptorSize = PathElement.groupElement(21);
    public static final PathElement PATH$storageTexelBufferDescriptorSize = PathElement.groupElement(22);
    public static final PathElement PATH$robustStorageTexelBufferDescriptorSize = PathElement.groupElement(23);
    public static final PathElement PATH$uniformBufferDescriptorSize = PathElement.groupElement(24);
    public static final PathElement PATH$robustUniformBufferDescriptorSize = PathElement.groupElement(25);
    public static final PathElement PATH$storageBufferDescriptorSize = PathElement.groupElement(26);
    public static final PathElement PATH$robustStorageBufferDescriptorSize = PathElement.groupElement(27);
    public static final PathElement PATH$inputAttachmentDescriptorSize = PathElement.groupElement(28);
    public static final PathElement PATH$accelerationStructureDescriptorSize = PathElement.groupElement(29);
    public static final PathElement PATH$maxSamplerDescriptorBufferRange = PathElement.groupElement(30);
    public static final PathElement PATH$maxResourceDescriptorBufferRange = PathElement.groupElement(31);
    public static final PathElement PATH$samplerDescriptorBufferAddressSpaceSize = PathElement.groupElement(32);
    public static final PathElement PATH$resourceDescriptorBufferAddressSpaceSize = PathElement.groupElement(33);
    public static final PathElement PATH$descriptorBufferAddressSpaceSize = PathElement.groupElement(34);

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$combinedImageSamplerDescriptorSingleArray = (OfInt) LAYOUT.select(PATH$combinedImageSamplerDescriptorSingleArray);
    public static final OfInt LAYOUT$bufferlessPushDescriptors = (OfInt) LAYOUT.select(PATH$bufferlessPushDescriptors);
    public static final OfInt LAYOUT$allowSamplerImageViewPostSubmitCreation = (OfInt) LAYOUT.select(PATH$allowSamplerImageViewPostSubmitCreation);
    public static final OfLong LAYOUT$descriptorBufferOffsetAlignment = (OfLong) LAYOUT.select(PATH$descriptorBufferOffsetAlignment);
    public static final OfInt LAYOUT$maxDescriptorBufferBindings = (OfInt) LAYOUT.select(PATH$maxDescriptorBufferBindings);
    public static final OfInt LAYOUT$maxResourceDescriptorBufferBindings = (OfInt) LAYOUT.select(PATH$maxResourceDescriptorBufferBindings);
    public static final OfInt LAYOUT$maxSamplerDescriptorBufferBindings = (OfInt) LAYOUT.select(PATH$maxSamplerDescriptorBufferBindings);
    public static final OfInt LAYOUT$maxEmbeddedImmutableSamplerBindings = (OfInt) LAYOUT.select(PATH$maxEmbeddedImmutableSamplerBindings);
    public static final OfInt LAYOUT$maxEmbeddedImmutableSamplers = (OfInt) LAYOUT.select(PATH$maxEmbeddedImmutableSamplers);
    public static final OfLong LAYOUT$maxSamplerDescriptorBufferRange = (OfLong) LAYOUT.select(PATH$maxSamplerDescriptorBufferRange);
    public static final OfLong LAYOUT$maxResourceDescriptorBufferRange = (OfLong) LAYOUT.select(PATH$maxResourceDescriptorBufferRange);
    public static final OfLong LAYOUT$samplerDescriptorBufferAddressSpaceSize = (OfLong) LAYOUT.select(PATH$samplerDescriptorBufferAddressSpaceSize);
    public static final OfLong LAYOUT$resourceDescriptorBufferAddressSpaceSize = (OfLong) LAYOUT.select(PATH$resourceDescriptorBufferAddressSpaceSize);
    public static final OfLong LAYOUT$descriptorBufferAddressSpaceSize = (OfLong) LAYOUT.select(PATH$descriptorBufferAddressSpaceSize);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$combinedImageSamplerDescriptorSingleArray = LAYOUT.byteOffset(PATH$combinedImageSamplerDescriptorSingleArray);
    public static final long OFFSET$bufferlessPushDescriptors = LAYOUT.byteOffset(PATH$bufferlessPushDescriptors);
    public static final long OFFSET$allowSamplerImageViewPostSubmitCreation = LAYOUT.byteOffset(PATH$allowSamplerImageViewPostSubmitCreation);
    public static final long OFFSET$descriptorBufferOffsetAlignment = LAYOUT.byteOffset(PATH$descriptorBufferOffsetAlignment);
    public static final long OFFSET$maxDescriptorBufferBindings = LAYOUT.byteOffset(PATH$maxDescriptorBufferBindings);
    public static final long OFFSET$maxResourceDescriptorBufferBindings = LAYOUT.byteOffset(PATH$maxResourceDescriptorBufferBindings);
    public static final long OFFSET$maxSamplerDescriptorBufferBindings = LAYOUT.byteOffset(PATH$maxSamplerDescriptorBufferBindings);
    public static final long OFFSET$maxEmbeddedImmutableSamplerBindings = LAYOUT.byteOffset(PATH$maxEmbeddedImmutableSamplerBindings);
    public static final long OFFSET$maxEmbeddedImmutableSamplers = LAYOUT.byteOffset(PATH$maxEmbeddedImmutableSamplers);
    public static final long OFFSET$bufferCaptureReplayDescriptorDataSize = LAYOUT.byteOffset(PATH$bufferCaptureReplayDescriptorDataSize);
    public static final long OFFSET$imageCaptureReplayDescriptorDataSize = LAYOUT.byteOffset(PATH$imageCaptureReplayDescriptorDataSize);
    public static final long OFFSET$imageViewCaptureReplayDescriptorDataSize = LAYOUT.byteOffset(PATH$imageViewCaptureReplayDescriptorDataSize);
    public static final long OFFSET$samplerCaptureReplayDescriptorDataSize = LAYOUT.byteOffset(PATH$samplerCaptureReplayDescriptorDataSize);
    public static final long OFFSET$accelerationStructureCaptureReplayDescriptorDataSize = LAYOUT.byteOffset(PATH$accelerationStructureCaptureReplayDescriptorDataSize);
    public static final long OFFSET$samplerDescriptorSize = LAYOUT.byteOffset(PATH$samplerDescriptorSize);
    public static final long OFFSET$combinedImageSamplerDescriptorSize = LAYOUT.byteOffset(PATH$combinedImageSamplerDescriptorSize);
    public static final long OFFSET$sampledImageDescriptorSize = LAYOUT.byteOffset(PATH$sampledImageDescriptorSize);
    public static final long OFFSET$storageImageDescriptorSize = LAYOUT.byteOffset(PATH$storageImageDescriptorSize);
    public static final long OFFSET$uniformTexelBufferDescriptorSize = LAYOUT.byteOffset(PATH$uniformTexelBufferDescriptorSize);
    public static final long OFFSET$robustUniformTexelBufferDescriptorSize = LAYOUT.byteOffset(PATH$robustUniformTexelBufferDescriptorSize);
    public static final long OFFSET$storageTexelBufferDescriptorSize = LAYOUT.byteOffset(PATH$storageTexelBufferDescriptorSize);
    public static final long OFFSET$robustStorageTexelBufferDescriptorSize = LAYOUT.byteOffset(PATH$robustStorageTexelBufferDescriptorSize);
    public static final long OFFSET$uniformBufferDescriptorSize = LAYOUT.byteOffset(PATH$uniformBufferDescriptorSize);
    public static final long OFFSET$robustUniformBufferDescriptorSize = LAYOUT.byteOffset(PATH$robustUniformBufferDescriptorSize);
    public static final long OFFSET$storageBufferDescriptorSize = LAYOUT.byteOffset(PATH$storageBufferDescriptorSize);
    public static final long OFFSET$robustStorageBufferDescriptorSize = LAYOUT.byteOffset(PATH$robustStorageBufferDescriptorSize);
    public static final long OFFSET$inputAttachmentDescriptorSize = LAYOUT.byteOffset(PATH$inputAttachmentDescriptorSize);
    public static final long OFFSET$accelerationStructureDescriptorSize = LAYOUT.byteOffset(PATH$accelerationStructureDescriptorSize);
    public static final long OFFSET$maxSamplerDescriptorBufferRange = LAYOUT.byteOffset(PATH$maxSamplerDescriptorBufferRange);
    public static final long OFFSET$maxResourceDescriptorBufferRange = LAYOUT.byteOffset(PATH$maxResourceDescriptorBufferRange);
    public static final long OFFSET$samplerDescriptorBufferAddressSpaceSize = LAYOUT.byteOffset(PATH$samplerDescriptorBufferAddressSpaceSize);
    public static final long OFFSET$resourceDescriptorBufferAddressSpaceSize = LAYOUT.byteOffset(PATH$resourceDescriptorBufferAddressSpaceSize);
    public static final long OFFSET$descriptorBufferAddressSpaceSize = LAYOUT.byteOffset(PATH$descriptorBufferAddressSpaceSize);

    public VkPhysicalDeviceDescriptorBufferPropertiesEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_BUFFER_PROPERTIES_EXT);
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

    public @unsigned int combinedImageSamplerDescriptorSingleArray() {
        return segment.get(LAYOUT$combinedImageSamplerDescriptorSingleArray, OFFSET$combinedImageSamplerDescriptorSingleArray);
    }

    public void combinedImageSamplerDescriptorSingleArray(@unsigned int value) {
        segment.set(LAYOUT$combinedImageSamplerDescriptorSingleArray, OFFSET$combinedImageSamplerDescriptorSingleArray, value);
    }

    public @unsigned int bufferlessPushDescriptors() {
        return segment.get(LAYOUT$bufferlessPushDescriptors, OFFSET$bufferlessPushDescriptors);
    }

    public void bufferlessPushDescriptors(@unsigned int value) {
        segment.set(LAYOUT$bufferlessPushDescriptors, OFFSET$bufferlessPushDescriptors, value);
    }

    public @unsigned int allowSamplerImageViewPostSubmitCreation() {
        return segment.get(LAYOUT$allowSamplerImageViewPostSubmitCreation, OFFSET$allowSamplerImageViewPostSubmitCreation);
    }

    public void allowSamplerImageViewPostSubmitCreation(@unsigned int value) {
        segment.set(LAYOUT$allowSamplerImageViewPostSubmitCreation, OFFSET$allowSamplerImageViewPostSubmitCreation, value);
    }

    public @unsigned long descriptorBufferOffsetAlignment() {
        return segment.get(LAYOUT$descriptorBufferOffsetAlignment, OFFSET$descriptorBufferOffsetAlignment);
    }

    public void descriptorBufferOffsetAlignment(@unsigned long value) {
        segment.set(LAYOUT$descriptorBufferOffsetAlignment, OFFSET$descriptorBufferOffsetAlignment, value);
    }

    public @unsigned int maxDescriptorBufferBindings() {
        return segment.get(LAYOUT$maxDescriptorBufferBindings, OFFSET$maxDescriptorBufferBindings);
    }

    public void maxDescriptorBufferBindings(@unsigned int value) {
        segment.set(LAYOUT$maxDescriptorBufferBindings, OFFSET$maxDescriptorBufferBindings, value);
    }

    public @unsigned int maxResourceDescriptorBufferBindings() {
        return segment.get(LAYOUT$maxResourceDescriptorBufferBindings, OFFSET$maxResourceDescriptorBufferBindings);
    }

    public void maxResourceDescriptorBufferBindings(@unsigned int value) {
        segment.set(LAYOUT$maxResourceDescriptorBufferBindings, OFFSET$maxResourceDescriptorBufferBindings, value);
    }

    public @unsigned int maxSamplerDescriptorBufferBindings() {
        return segment.get(LAYOUT$maxSamplerDescriptorBufferBindings, OFFSET$maxSamplerDescriptorBufferBindings);
    }

    public void maxSamplerDescriptorBufferBindings(@unsigned int value) {
        segment.set(LAYOUT$maxSamplerDescriptorBufferBindings, OFFSET$maxSamplerDescriptorBufferBindings, value);
    }

    public @unsigned int maxEmbeddedImmutableSamplerBindings() {
        return segment.get(LAYOUT$maxEmbeddedImmutableSamplerBindings, OFFSET$maxEmbeddedImmutableSamplerBindings);
    }

    public void maxEmbeddedImmutableSamplerBindings(@unsigned int value) {
        segment.set(LAYOUT$maxEmbeddedImmutableSamplerBindings, OFFSET$maxEmbeddedImmutableSamplerBindings, value);
    }

    public @unsigned int maxEmbeddedImmutableSamplers() {
        return segment.get(LAYOUT$maxEmbeddedImmutableSamplers, OFFSET$maxEmbeddedImmutableSamplers);
    }

    public void maxEmbeddedImmutableSamplers(@unsigned int value) {
        segment.set(LAYOUT$maxEmbeddedImmutableSamplers, OFFSET$maxEmbeddedImmutableSamplers, value);
    }

    public long bufferCaptureReplayDescriptorDataSize() {
        return NativeLayout.readCLong(segment, OFFSET$bufferCaptureReplayDescriptorDataSize);
    }

    public void bufferCaptureReplayDescriptorDataSize(long value) {
        NativeLayout.writeCLong(segment, OFFSET$bufferCaptureReplayDescriptorDataSize, value);
    }

    public long imageCaptureReplayDescriptorDataSize() {
        return NativeLayout.readCLong(segment, OFFSET$imageCaptureReplayDescriptorDataSize);
    }

    public void imageCaptureReplayDescriptorDataSize(long value) {
        NativeLayout.writeCLong(segment, OFFSET$imageCaptureReplayDescriptorDataSize, value);
    }

    public long imageViewCaptureReplayDescriptorDataSize() {
        return NativeLayout.readCLong(segment, OFFSET$imageViewCaptureReplayDescriptorDataSize);
    }

    public void imageViewCaptureReplayDescriptorDataSize(long value) {
        NativeLayout.writeCLong(segment, OFFSET$imageViewCaptureReplayDescriptorDataSize, value);
    }

    public long samplerCaptureReplayDescriptorDataSize() {
        return NativeLayout.readCLong(segment, OFFSET$samplerCaptureReplayDescriptorDataSize);
    }

    public void samplerCaptureReplayDescriptorDataSize(long value) {
        NativeLayout.writeCLong(segment, OFFSET$samplerCaptureReplayDescriptorDataSize, value);
    }

    public long accelerationStructureCaptureReplayDescriptorDataSize() {
        return NativeLayout.readCLong(segment, OFFSET$accelerationStructureCaptureReplayDescriptorDataSize);
    }

    public void accelerationStructureCaptureReplayDescriptorDataSize(long value) {
        NativeLayout.writeCLong(segment, OFFSET$accelerationStructureCaptureReplayDescriptorDataSize, value);
    }

    public long samplerDescriptorSize() {
        return NativeLayout.readCLong(segment, OFFSET$samplerDescriptorSize);
    }

    public void samplerDescriptorSize(long value) {
        NativeLayout.writeCLong(segment, OFFSET$samplerDescriptorSize, value);
    }

    public long combinedImageSamplerDescriptorSize() {
        return NativeLayout.readCLong(segment, OFFSET$combinedImageSamplerDescriptorSize);
    }

    public void combinedImageSamplerDescriptorSize(long value) {
        NativeLayout.writeCLong(segment, OFFSET$combinedImageSamplerDescriptorSize, value);
    }

    public long sampledImageDescriptorSize() {
        return NativeLayout.readCLong(segment, OFFSET$sampledImageDescriptorSize);
    }

    public void sampledImageDescriptorSize(long value) {
        NativeLayout.writeCLong(segment, OFFSET$sampledImageDescriptorSize, value);
    }

    public long storageImageDescriptorSize() {
        return NativeLayout.readCLong(segment, OFFSET$storageImageDescriptorSize);
    }

    public void storageImageDescriptorSize(long value) {
        NativeLayout.writeCLong(segment, OFFSET$storageImageDescriptorSize, value);
    }

    public long uniformTexelBufferDescriptorSize() {
        return NativeLayout.readCLong(segment, OFFSET$uniformTexelBufferDescriptorSize);
    }

    public void uniformTexelBufferDescriptorSize(long value) {
        NativeLayout.writeCLong(segment, OFFSET$uniformTexelBufferDescriptorSize, value);
    }

    public long robustUniformTexelBufferDescriptorSize() {
        return NativeLayout.readCLong(segment, OFFSET$robustUniformTexelBufferDescriptorSize);
    }

    public void robustUniformTexelBufferDescriptorSize(long value) {
        NativeLayout.writeCLong(segment, OFFSET$robustUniformTexelBufferDescriptorSize, value);
    }

    public long storageTexelBufferDescriptorSize() {
        return NativeLayout.readCLong(segment, OFFSET$storageTexelBufferDescriptorSize);
    }

    public void storageTexelBufferDescriptorSize(long value) {
        NativeLayout.writeCLong(segment, OFFSET$storageTexelBufferDescriptorSize, value);
    }

    public long robustStorageTexelBufferDescriptorSize() {
        return NativeLayout.readCLong(segment, OFFSET$robustStorageTexelBufferDescriptorSize);
    }

    public void robustStorageTexelBufferDescriptorSize(long value) {
        NativeLayout.writeCLong(segment, OFFSET$robustStorageTexelBufferDescriptorSize, value);
    }

    public long uniformBufferDescriptorSize() {
        return NativeLayout.readCLong(segment, OFFSET$uniformBufferDescriptorSize);
    }

    public void uniformBufferDescriptorSize(long value) {
        NativeLayout.writeCLong(segment, OFFSET$uniformBufferDescriptorSize, value);
    }

    public long robustUniformBufferDescriptorSize() {
        return NativeLayout.readCLong(segment, OFFSET$robustUniformBufferDescriptorSize);
    }

    public void robustUniformBufferDescriptorSize(long value) {
        NativeLayout.writeCLong(segment, OFFSET$robustUniformBufferDescriptorSize, value);
    }

    public long storageBufferDescriptorSize() {
        return NativeLayout.readCLong(segment, OFFSET$storageBufferDescriptorSize);
    }

    public void storageBufferDescriptorSize(long value) {
        NativeLayout.writeCLong(segment, OFFSET$storageBufferDescriptorSize, value);
    }

    public long robustStorageBufferDescriptorSize() {
        return NativeLayout.readCLong(segment, OFFSET$robustStorageBufferDescriptorSize);
    }

    public void robustStorageBufferDescriptorSize(long value) {
        NativeLayout.writeCLong(segment, OFFSET$robustStorageBufferDescriptorSize, value);
    }

    public long inputAttachmentDescriptorSize() {
        return NativeLayout.readCLong(segment, OFFSET$inputAttachmentDescriptorSize);
    }

    public void inputAttachmentDescriptorSize(long value) {
        NativeLayout.writeCLong(segment, OFFSET$inputAttachmentDescriptorSize, value);
    }

    public long accelerationStructureDescriptorSize() {
        return NativeLayout.readCLong(segment, OFFSET$accelerationStructureDescriptorSize);
    }

    public void accelerationStructureDescriptorSize(long value) {
        NativeLayout.writeCLong(segment, OFFSET$accelerationStructureDescriptorSize, value);
    }

    public @unsigned long maxSamplerDescriptorBufferRange() {
        return segment.get(LAYOUT$maxSamplerDescriptorBufferRange, OFFSET$maxSamplerDescriptorBufferRange);
    }

    public void maxSamplerDescriptorBufferRange(@unsigned long value) {
        segment.set(LAYOUT$maxSamplerDescriptorBufferRange, OFFSET$maxSamplerDescriptorBufferRange, value);
    }

    public @unsigned long maxResourceDescriptorBufferRange() {
        return segment.get(LAYOUT$maxResourceDescriptorBufferRange, OFFSET$maxResourceDescriptorBufferRange);
    }

    public void maxResourceDescriptorBufferRange(@unsigned long value) {
        segment.set(LAYOUT$maxResourceDescriptorBufferRange, OFFSET$maxResourceDescriptorBufferRange, value);
    }

    public @unsigned long samplerDescriptorBufferAddressSpaceSize() {
        return segment.get(LAYOUT$samplerDescriptorBufferAddressSpaceSize, OFFSET$samplerDescriptorBufferAddressSpaceSize);
    }

    public void samplerDescriptorBufferAddressSpaceSize(@unsigned long value) {
        segment.set(LAYOUT$samplerDescriptorBufferAddressSpaceSize, OFFSET$samplerDescriptorBufferAddressSpaceSize, value);
    }

    public @unsigned long resourceDescriptorBufferAddressSpaceSize() {
        return segment.get(LAYOUT$resourceDescriptorBufferAddressSpaceSize, OFFSET$resourceDescriptorBufferAddressSpaceSize);
    }

    public void resourceDescriptorBufferAddressSpaceSize(@unsigned long value) {
        segment.set(LAYOUT$resourceDescriptorBufferAddressSpaceSize, OFFSET$resourceDescriptorBufferAddressSpaceSize, value);
    }

    public @unsigned long descriptorBufferAddressSpaceSize() {
        return segment.get(LAYOUT$descriptorBufferAddressSpaceSize, OFFSET$descriptorBufferAddressSpaceSize);
    }

    public void descriptorBufferAddressSpaceSize(@unsigned long value) {
        segment.set(LAYOUT$descriptorBufferAddressSpaceSize, OFFSET$descriptorBufferAddressSpaceSize, value);
    }


    public static final class VkPhysicalDeviceDescriptorBufferPropertiesEXTFactory implements IDataTypeFactory<VkPhysicalDeviceDescriptorBufferPropertiesEXT> {
        @Override
        public Class<VkPhysicalDeviceDescriptorBufferPropertiesEXT> clazz() {
            return VkPhysicalDeviceDescriptorBufferPropertiesEXT.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkPhysicalDeviceDescriptorBufferPropertiesEXT.LAYOUT;
        }

        @Override
        public VkPhysicalDeviceDescriptorBufferPropertiesEXT create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkPhysicalDeviceDescriptorBufferPropertiesEXT createUninit(MemorySegment segment) {
            return new VkPhysicalDeviceDescriptorBufferPropertiesEXT(segment);
        }
    }

    public static final VkPhysicalDeviceDescriptorBufferPropertiesEXTFactory FACTORY = new VkPhysicalDeviceDescriptorBufferPropertiesEXTFactory();
}
