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

public record VkMutableDescriptorTypeCreateInfoEXT(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("mutableDescriptorTypeListCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkMutableDescriptorTypeListEXT.LAYOUT).withName("pMutableDescriptorTypeLists")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$mutableDescriptorTypeListCount = PathElement.groupElement("mutableDescriptorTypeListCount");
    public static final PathElement PATH$pMutableDescriptorTypeLists = PathElement.groupElement("pMutableDescriptorTypeLists");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$mutableDescriptorTypeListCount = (OfInt) LAYOUT.select(PATH$mutableDescriptorTypeListCount);
    public static final AddressLayout LAYOUT$pMutableDescriptorTypeLists = (AddressLayout) LAYOUT.select(PATH$pMutableDescriptorTypeLists);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$mutableDescriptorTypeListCount = LAYOUT.byteOffset(PATH$mutableDescriptorTypeListCount);
    public static final long OFFSET$pMutableDescriptorTypeLists = LAYOUT.byteOffset(PATH$pMutableDescriptorTypeLists);

    public VkMutableDescriptorTypeCreateInfoEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_MUTABLE_DESCRIPTOR_TYPE_CREATE_INFO_EXT);
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

    public @unsigned int mutableDescriptorTypeListCount() {
        return segment.get(LAYOUT$mutableDescriptorTypeListCount, OFFSET$mutableDescriptorTypeListCount);
    }

    public void mutableDescriptorTypeListCount(@unsigned int value) {
        segment.set(LAYOUT$mutableDescriptorTypeListCount, OFFSET$mutableDescriptorTypeListCount, value);
    }

    public @pointer(comment="VkMutableDescriptorTypeListEXT*") MemorySegment pMutableDescriptorTypeListsRaw() {
        return segment.get(LAYOUT$pMutableDescriptorTypeLists, OFFSET$pMutableDescriptorTypeLists);
    }

    public void pMutableDescriptorTypeListsRaw(@pointer(comment="VkMutableDescriptorTypeListEXT*") MemorySegment value) {
        segment.set(LAYOUT$pMutableDescriptorTypeLists, OFFSET$pMutableDescriptorTypeLists, value);
    }
    
    public @nullable VkMutableDescriptorTypeListEXT pMutableDescriptorTypeLists() {
        MemorySegment s = pMutableDescriptorTypeListsRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkMutableDescriptorTypeListEXT(s);
    }

    public void pMutableDescriptorTypeLists(@nullable VkMutableDescriptorTypeListEXT value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pMutableDescriptorTypeListsRaw(s);
    }


    public static final class VkMutableDescriptorTypeCreateInfoEXTFactory implements IDataTypeFactory<VkMutableDescriptorTypeCreateInfoEXT> {
        @Override
        public Class<VkMutableDescriptorTypeCreateInfoEXT> clazz() {
            return VkMutableDescriptorTypeCreateInfoEXT.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkMutableDescriptorTypeCreateInfoEXT.LAYOUT;
        }

        @Override
        public VkMutableDescriptorTypeCreateInfoEXT create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkMutableDescriptorTypeCreateInfoEXT createUninit(MemorySegment segment) {
            return new VkMutableDescriptorTypeCreateInfoEXT(segment);
        }
    }

    public static final VkMutableDescriptorTypeCreateInfoEXTFactory FACTORY = new VkMutableDescriptorTypeCreateInfoEXTFactory();
}
