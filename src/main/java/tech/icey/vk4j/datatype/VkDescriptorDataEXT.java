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

public record VkDescriptorDataEXT(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.unionLayout(
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS).withName("pSampler"),
        ValueLayout.ADDRESS.withTargetLayout(VkDescriptorImageInfo.LAYOUT).withName("pCombinedImageSampler"),
        ValueLayout.ADDRESS.withTargetLayout(VkDescriptorImageInfo.LAYOUT).withName("pInputAttachmentImage"),
        ValueLayout.ADDRESS.withTargetLayout(VkDescriptorImageInfo.LAYOUT).withName("pSampledImage"),
        ValueLayout.ADDRESS.withTargetLayout(VkDescriptorImageInfo.LAYOUT).withName("pStorageImage"),
        ValueLayout.ADDRESS.withTargetLayout(VkDescriptorAddressInfoEXT.LAYOUT).withName("pUniformTexelBuffer"),
        ValueLayout.ADDRESS.withTargetLayout(VkDescriptorAddressInfoEXT.LAYOUT).withName("pStorageTexelBuffer"),
        ValueLayout.ADDRESS.withTargetLayout(VkDescriptorAddressInfoEXT.LAYOUT).withName("pUniformBuffer"),
        ValueLayout.ADDRESS.withTargetLayout(VkDescriptorAddressInfoEXT.LAYOUT).withName("pStorageBuffer"),
        ValueLayout.JAVA_LONG.withName("accelerationStructure")
    );

    public static final PathElement PATH$pSampler = PathElement.groupElement("pSampler");
    public static final PathElement PATH$pCombinedImageSampler = PathElement.groupElement("pCombinedImageSampler");
    public static final PathElement PATH$pInputAttachmentImage = PathElement.groupElement("pInputAttachmentImage");
    public static final PathElement PATH$pSampledImage = PathElement.groupElement("pSampledImage");
    public static final PathElement PATH$pStorageImage = PathElement.groupElement("pStorageImage");
    public static final PathElement PATH$pUniformTexelBuffer = PathElement.groupElement("pUniformTexelBuffer");
    public static final PathElement PATH$pStorageTexelBuffer = PathElement.groupElement("pStorageTexelBuffer");
    public static final PathElement PATH$pUniformBuffer = PathElement.groupElement("pUniformBuffer");
    public static final PathElement PATH$pStorageBuffer = PathElement.groupElement("pStorageBuffer");
    public static final PathElement PATH$accelerationStructure = PathElement.groupElement("accelerationStructure");

    public static final AddressLayout LAYOUT$pSampler = (AddressLayout) LAYOUT.select(PATH$pSampler);
    public static final AddressLayout LAYOUT$pCombinedImageSampler = (AddressLayout) LAYOUT.select(PATH$pCombinedImageSampler);
    public static final AddressLayout LAYOUT$pInputAttachmentImage = (AddressLayout) LAYOUT.select(PATH$pInputAttachmentImage);
    public static final AddressLayout LAYOUT$pSampledImage = (AddressLayout) LAYOUT.select(PATH$pSampledImage);
    public static final AddressLayout LAYOUT$pStorageImage = (AddressLayout) LAYOUT.select(PATH$pStorageImage);
    public static final AddressLayout LAYOUT$pUniformTexelBuffer = (AddressLayout) LAYOUT.select(PATH$pUniformTexelBuffer);
    public static final AddressLayout LAYOUT$pStorageTexelBuffer = (AddressLayout) LAYOUT.select(PATH$pStorageTexelBuffer);
    public static final AddressLayout LAYOUT$pUniformBuffer = (AddressLayout) LAYOUT.select(PATH$pUniformBuffer);
    public static final AddressLayout LAYOUT$pStorageBuffer = (AddressLayout) LAYOUT.select(PATH$pStorageBuffer);
    public static final OfLong LAYOUT$accelerationStructure = (OfLong) LAYOUT.select(PATH$accelerationStructure);

    public static final long OFFSET$pSampler = LAYOUT.byteOffset(PATH$pSampler);
    public static final long OFFSET$pCombinedImageSampler = LAYOUT.byteOffset(PATH$pCombinedImageSampler);
    public static final long OFFSET$pInputAttachmentImage = LAYOUT.byteOffset(PATH$pInputAttachmentImage);
    public static final long OFFSET$pSampledImage = LAYOUT.byteOffset(PATH$pSampledImage);
    public static final long OFFSET$pStorageImage = LAYOUT.byteOffset(PATH$pStorageImage);
    public static final long OFFSET$pUniformTexelBuffer = LAYOUT.byteOffset(PATH$pUniformTexelBuffer);
    public static final long OFFSET$pStorageTexelBuffer = LAYOUT.byteOffset(PATH$pStorageTexelBuffer);
    public static final long OFFSET$pUniformBuffer = LAYOUT.byteOffset(PATH$pUniformBuffer);
    public static final long OFFSET$pStorageBuffer = LAYOUT.byteOffset(PATH$pStorageBuffer);
    public static final long OFFSET$accelerationStructure = LAYOUT.byteOffset(PATH$accelerationStructure);

    public VkDescriptorDataEXT(MemorySegment segment) {
        this.segment = segment;
    }

    public @pointer(comment="VkSampler*") MemorySegment pSamplerRaw() {
        return segment.get(LAYOUT$pSampler, OFFSET$pSampler);
    }

    public void pSamplerRaw(@pointer(comment="VkSampler*") MemorySegment value) {
        segment.set(LAYOUT$pSampler, OFFSET$pSampler, value);
    }
    
    public @nullable VkSampler pSampler() {
        MemorySegment s = pSamplerRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkSampler(s);
    }

    public void pSampler(@nullable VkSampler value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pSamplerRaw(s);
    }

    public @pointer(comment="VkDescriptorImageInfo*") MemorySegment pCombinedImageSamplerRaw() {
        return segment.get(LAYOUT$pCombinedImageSampler, OFFSET$pCombinedImageSampler);
    }

    public void pCombinedImageSamplerRaw(@pointer(comment="VkDescriptorImageInfo*") MemorySegment value) {
        segment.set(LAYOUT$pCombinedImageSampler, OFFSET$pCombinedImageSampler, value);
    }
    
    public @nullable VkDescriptorImageInfo pCombinedImageSampler() {
        MemorySegment s = pCombinedImageSamplerRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkDescriptorImageInfo(s);
    }

    public void pCombinedImageSampler(@nullable VkDescriptorImageInfo value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pCombinedImageSamplerRaw(s);
    }

    public @pointer(comment="VkDescriptorImageInfo*") MemorySegment pInputAttachmentImageRaw() {
        return segment.get(LAYOUT$pInputAttachmentImage, OFFSET$pInputAttachmentImage);
    }

    public void pInputAttachmentImageRaw(@pointer(comment="VkDescriptorImageInfo*") MemorySegment value) {
        segment.set(LAYOUT$pInputAttachmentImage, OFFSET$pInputAttachmentImage, value);
    }
    
    public @nullable VkDescriptorImageInfo pInputAttachmentImage() {
        MemorySegment s = pInputAttachmentImageRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkDescriptorImageInfo(s);
    }

    public void pInputAttachmentImage(@nullable VkDescriptorImageInfo value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pInputAttachmentImageRaw(s);
    }

    public @pointer(comment="VkDescriptorImageInfo*") MemorySegment pSampledImageRaw() {
        return segment.get(LAYOUT$pSampledImage, OFFSET$pSampledImage);
    }

    public void pSampledImageRaw(@pointer(comment="VkDescriptorImageInfo*") MemorySegment value) {
        segment.set(LAYOUT$pSampledImage, OFFSET$pSampledImage, value);
    }
    
    public @nullable VkDescriptorImageInfo pSampledImage() {
        MemorySegment s = pSampledImageRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkDescriptorImageInfo(s);
    }

    public void pSampledImage(@nullable VkDescriptorImageInfo value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pSampledImageRaw(s);
    }

    public @pointer(comment="VkDescriptorImageInfo*") MemorySegment pStorageImageRaw() {
        return segment.get(LAYOUT$pStorageImage, OFFSET$pStorageImage);
    }

    public void pStorageImageRaw(@pointer(comment="VkDescriptorImageInfo*") MemorySegment value) {
        segment.set(LAYOUT$pStorageImage, OFFSET$pStorageImage, value);
    }
    
    public @nullable VkDescriptorImageInfo pStorageImage() {
        MemorySegment s = pStorageImageRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkDescriptorImageInfo(s);
    }

    public void pStorageImage(@nullable VkDescriptorImageInfo value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pStorageImageRaw(s);
    }

    public @pointer(comment="VkDescriptorAddressInfoEXT*") MemorySegment pUniformTexelBufferRaw() {
        return segment.get(LAYOUT$pUniformTexelBuffer, OFFSET$pUniformTexelBuffer);
    }

    public void pUniformTexelBufferRaw(@pointer(comment="VkDescriptorAddressInfoEXT*") MemorySegment value) {
        segment.set(LAYOUT$pUniformTexelBuffer, OFFSET$pUniformTexelBuffer, value);
    }
    
    public @nullable VkDescriptorAddressInfoEXT pUniformTexelBuffer() {
        MemorySegment s = pUniformTexelBufferRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkDescriptorAddressInfoEXT(s);
    }

    public void pUniformTexelBuffer(@nullable VkDescriptorAddressInfoEXT value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pUniformTexelBufferRaw(s);
    }

    public @pointer(comment="VkDescriptorAddressInfoEXT*") MemorySegment pStorageTexelBufferRaw() {
        return segment.get(LAYOUT$pStorageTexelBuffer, OFFSET$pStorageTexelBuffer);
    }

    public void pStorageTexelBufferRaw(@pointer(comment="VkDescriptorAddressInfoEXT*") MemorySegment value) {
        segment.set(LAYOUT$pStorageTexelBuffer, OFFSET$pStorageTexelBuffer, value);
    }
    
    public @nullable VkDescriptorAddressInfoEXT pStorageTexelBuffer() {
        MemorySegment s = pStorageTexelBufferRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkDescriptorAddressInfoEXT(s);
    }

    public void pStorageTexelBuffer(@nullable VkDescriptorAddressInfoEXT value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pStorageTexelBufferRaw(s);
    }

    public @pointer(comment="VkDescriptorAddressInfoEXT*") MemorySegment pUniformBufferRaw() {
        return segment.get(LAYOUT$pUniformBuffer, OFFSET$pUniformBuffer);
    }

    public void pUniformBufferRaw(@pointer(comment="VkDescriptorAddressInfoEXT*") MemorySegment value) {
        segment.set(LAYOUT$pUniformBuffer, OFFSET$pUniformBuffer, value);
    }
    
    public @nullable VkDescriptorAddressInfoEXT pUniformBuffer() {
        MemorySegment s = pUniformBufferRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkDescriptorAddressInfoEXT(s);
    }

    public void pUniformBuffer(@nullable VkDescriptorAddressInfoEXT value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pUniformBufferRaw(s);
    }

    public @pointer(comment="VkDescriptorAddressInfoEXT*") MemorySegment pStorageBufferRaw() {
        return segment.get(LAYOUT$pStorageBuffer, OFFSET$pStorageBuffer);
    }

    public void pStorageBufferRaw(@pointer(comment="VkDescriptorAddressInfoEXT*") MemorySegment value) {
        segment.set(LAYOUT$pStorageBuffer, OFFSET$pStorageBuffer, value);
    }
    
    public @nullable VkDescriptorAddressInfoEXT pStorageBuffer() {
        MemorySegment s = pStorageBufferRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkDescriptorAddressInfoEXT(s);
    }

    public void pStorageBuffer(@nullable VkDescriptorAddressInfoEXT value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pStorageBufferRaw(s);
    }

    public @unsigned long accelerationStructure() {
        return segment.get(LAYOUT$accelerationStructure, OFFSET$accelerationStructure);
    }

    public void accelerationStructure(@unsigned long value) {
        segment.set(LAYOUT$accelerationStructure, OFFSET$accelerationStructure, value);
    }


    public static final class VkDescriptorDataEXTFactory implements IDataTypeFactory<VkDescriptorDataEXT> {
        @Override
        public Class<VkDescriptorDataEXT> clazz() {
            return VkDescriptorDataEXT.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkDescriptorDataEXT.LAYOUT;
        }

        @Override
        public VkDescriptorDataEXT create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkDescriptorDataEXT createUninit(MemorySegment segment) {
            return new VkDescriptorDataEXT(segment);
        }
    }

    public static final VkDescriptorDataEXTFactory FACTORY = new VkDescriptorDataEXTFactory();
}
