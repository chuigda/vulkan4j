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

public record VkDescriptorSetBindingReferenceVALVE(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("descriptorSetLayout"),
        ValueLayout.JAVA_INT.withName("binding")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$descriptorSetLayout = PathElement.groupElement("descriptorSetLayout");
    public static final PathElement PATH$binding = PathElement.groupElement("binding");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final AddressLayout LAYOUT$descriptorSetLayout = (AddressLayout) LAYOUT.select(PATH$descriptorSetLayout);
    public static final OfInt LAYOUT$binding = (OfInt) LAYOUT.select(PATH$binding);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$descriptorSetLayout = LAYOUT.byteOffset(PATH$descriptorSetLayout);
    public static final long OFFSET$binding = LAYOUT.byteOffset(PATH$binding);

    public VkDescriptorSetBindingReferenceVALVE(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_DESCRIPTOR_SET_BINDING_REFERENCE_VALVE);
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

    public VkDescriptorSetLayout descriptorSetLayout() {
        return new VkDescriptorSetLayout(segment.asSlice(OFFSET$descriptorSetLayout, LAYOUT$descriptorSetLayout));
    }

    public void descriptorSetLayout(VkDescriptorSetLayout value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$descriptorSetLayout, LAYOUT$descriptorSetLayout.byteSize());
    }

    public @unsigned int binding() {
        return segment.get(LAYOUT$binding, OFFSET$binding);
    }

    public void binding(@unsigned int value) {
        segment.set(LAYOUT$binding, OFFSET$binding, value);
    }


    public static final class VkDescriptorSetBindingReferenceVALVEFactory implements IDataTypeFactory<VkDescriptorSetBindingReferenceVALVE> {
        @Override
        public Class<VkDescriptorSetBindingReferenceVALVE> clazz() {
            return VkDescriptorSetBindingReferenceVALVE.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkDescriptorSetBindingReferenceVALVE.LAYOUT;
        }

        @Override
        public VkDescriptorSetBindingReferenceVALVE create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkDescriptorSetBindingReferenceVALVE createUninit(MemorySegment segment) {
            return new VkDescriptorSetBindingReferenceVALVE(segment);
        }
    }

    public static final VkDescriptorSetBindingReferenceVALVEFactory FACTORY = new VkDescriptorSetBindingReferenceVALVEFactory();
}
