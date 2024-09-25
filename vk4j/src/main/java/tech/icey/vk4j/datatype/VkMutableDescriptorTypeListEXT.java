package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.annotation.*;
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

public record VkMutableDescriptorTypeListEXT(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("descriptorTypeCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT).withName("pDescriptorTypes")
    );

    public static final PathElement PATH$descriptorTypeCount = PathElement.groupElement("descriptorTypeCount");
    public static final PathElement PATH$pDescriptorTypes = PathElement.groupElement("pDescriptorTypes");

    public static final OfInt LAYOUT$descriptorTypeCount = (OfInt) LAYOUT.select(PATH$descriptorTypeCount);
    public static final AddressLayout LAYOUT$pDescriptorTypes = (AddressLayout) LAYOUT.select(PATH$pDescriptorTypes);

    public static final long OFFSET$descriptorTypeCount = LAYOUT.byteOffset(PATH$descriptorTypeCount);
    public static final long OFFSET$pDescriptorTypes = LAYOUT.byteOffset(PATH$pDescriptorTypes);

    public VkMutableDescriptorTypeListEXT(MemorySegment segment) {
        this.segment = segment;
    }

    public @unsigned int descriptorTypeCount() {
        return segment.get(LAYOUT$descriptorTypeCount, OFFSET$descriptorTypeCount);
    }

    public void descriptorTypeCount(@unsigned int value) {
        segment.set(LAYOUT$descriptorTypeCount, OFFSET$descriptorTypeCount, value);
    }

    public @pointer(target=VkDescriptorType.class) MemorySegment pDescriptorTypesRaw() {
        return segment.get(LAYOUT$pDescriptorTypes, OFFSET$pDescriptorTypes);
    }
    
    public void pDescriptorTypesRaw(@pointer(target=VkDescriptorType.class) MemorySegment value) {
        segment.set(LAYOUT$pDescriptorTypes, OFFSET$pDescriptorTypes, value);
    }
    
    public @nullable IntPtr pDescriptorTypes() {
        MemorySegment s = pDescriptorTypesRaw();
        if (s.address() == 0) {
            return null;
        }
        
        return new IntPtr(s);
    }
    
    public void pDescriptorTypes(@nullable IntPtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pDescriptorTypesRaw(s);
    }


    public static final class Factory implements IFactory<VkMutableDescriptorTypeListEXT> {
        @Override
        public Class<VkMutableDescriptorTypeListEXT> clazz() {
            return VkMutableDescriptorTypeListEXT.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkMutableDescriptorTypeListEXT.LAYOUT;
        }

        @Override
        public VkMutableDescriptorTypeListEXT create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkMutableDescriptorTypeListEXT createUninit(MemorySegment segment) {
            return new VkMutableDescriptorTypeListEXT(segment);
        }
    }

    public static final Factory FACTORY = new Factory();
}
