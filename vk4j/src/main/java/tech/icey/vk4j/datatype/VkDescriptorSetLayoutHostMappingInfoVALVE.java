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
import tech.icey.vk4j.IFactory;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

public record VkDescriptorSetLayoutHostMappingInfoVALVE(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        NativeLayout.C_SIZE_T.withName("descriptorOffset"),
        ValueLayout.JAVA_INT.withName("descriptorSize")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$descriptorOffset = PathElement.groupElement("descriptorOffset");
    public static final PathElement PATH$descriptorSize = PathElement.groupElement("descriptorSize");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$descriptorSize = (OfInt) LAYOUT.select(PATH$descriptorSize);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$descriptorOffset = LAYOUT.byteOffset(PATH$descriptorOffset);
    public static final long OFFSET$descriptorSize = LAYOUT.byteOffset(PATH$descriptorSize);

    public VkDescriptorSetLayoutHostMappingInfoVALVE(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_DESCRIPTOR_SET_LAYOUT_HOST_MAPPING_INFO_VALVE);
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

    public @unsigned long descriptorOffset() {
            return NativeLayout.readCSizeT(segment, OFFSET$descriptorOffset);
        }
    
        public void descriptorOffset(@unsigned long value) {
            NativeLayout.writeCSizeT(segment, OFFSET$descriptorOffset, value);
        }

    public @unsigned int descriptorSize() {
        return segment.get(LAYOUT$descriptorSize, OFFSET$descriptorSize);
    }

    public void descriptorSize(@unsigned int value) {
        segment.set(LAYOUT$descriptorSize, OFFSET$descriptorSize, value);
    }


    public static final class VkDescriptorSetLayoutHostMappingInfoVALVEFactory implements IFactory<VkDescriptorSetLayoutHostMappingInfoVALVE> {
        @Override
        public Class<VkDescriptorSetLayoutHostMappingInfoVALVE> clazz() {
            return VkDescriptorSetLayoutHostMappingInfoVALVE.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkDescriptorSetLayoutHostMappingInfoVALVE.LAYOUT;
        }

        @Override
        public VkDescriptorSetLayoutHostMappingInfoVALVE create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkDescriptorSetLayoutHostMappingInfoVALVE createUninit(MemorySegment segment) {
            return new VkDescriptorSetLayoutHostMappingInfoVALVE(segment);
        }
    }

    public static final VkDescriptorSetLayoutHostMappingInfoVALVEFactory FACTORY = new VkDescriptorSetLayoutHostMappingInfoVALVEFactory();
}
