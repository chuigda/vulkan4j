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

public record VkDeviceFaultInfoEXT(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        MemoryLayout.sequenceLayout(VK_MAX_DESCRIPTION_SIZE, ValueLayout.JAVA_BYTE).withName("description"),
        ValueLayout.ADDRESS.withTargetLayout(VkDeviceFaultAddressInfoEXT.LAYOUT).withName("pAddressInfos"),
        ValueLayout.ADDRESS.withTargetLayout(VkDeviceFaultVendorInfoEXT.LAYOUT).withName("pVendorInfos"),
        ValueLayout.ADDRESS.withName("pVendorBinaryData")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$description = PathElement.groupElement("description");
    public static final PathElement PATH$pAddressInfos = PathElement.groupElement("pAddressInfos");
    public static final PathElement PATH$pVendorInfos = PathElement.groupElement("pVendorInfos");
    public static final PathElement PATH$pVendorBinaryData = PathElement.groupElement("pVendorBinaryData");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final SequenceLayout LAYOUT$description = (SequenceLayout) LAYOUT.select(PATH$description);
    public static final AddressLayout LAYOUT$pAddressInfos = (AddressLayout) LAYOUT.select(PATH$pAddressInfos);
    public static final AddressLayout LAYOUT$pVendorInfos = (AddressLayout) LAYOUT.select(PATH$pVendorInfos);
    public static final AddressLayout LAYOUT$pVendorBinaryData = (AddressLayout) LAYOUT.select(PATH$pVendorBinaryData);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$description = LAYOUT.byteOffset(PATH$description);
    public static final long OFFSET$pAddressInfos = LAYOUT.byteOffset(PATH$pAddressInfos);
    public static final long OFFSET$pVendorInfos = LAYOUT.byteOffset(PATH$pVendorInfos);
    public static final long OFFSET$pVendorBinaryData = LAYOUT.byteOffset(PATH$pVendorBinaryData);

    public VkDeviceFaultInfoEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_DEVICE_FAULT_INFO_EXT);
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

    public MemorySegment descriptionRaw() {
        return segment.asSlice(OFFSET$description, LAYOUT$description.byteSize());
    }

    public ByteArray description() {
        return new ByteArray(descriptionRaw(), LAYOUT$description.elementCount());
    }

    public void description(ByteArray value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$description, LAYOUT$description.byteSize());
    }

    public @pointer(comment="VkDeviceFaultAddressInfoEXT*") MemorySegment pAddressInfosRaw() {
        return segment.get(LAYOUT$pAddressInfos, OFFSET$pAddressInfos);
    }

    public void pAddressInfosRaw(@pointer(comment="VkDeviceFaultAddressInfoEXT*") MemorySegment value) {
        segment.set(LAYOUT$pAddressInfos, OFFSET$pAddressInfos, value);
    }
    
    public @nullable VkDeviceFaultAddressInfoEXT pAddressInfos() {
        MemorySegment s = pAddressInfosRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkDeviceFaultAddressInfoEXT(s);
    }

    public void pAddressInfos(@nullable VkDeviceFaultAddressInfoEXT value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pAddressInfosRaw(s);
    }

    public @pointer(comment="VkDeviceFaultVendorInfoEXT*") MemorySegment pVendorInfosRaw() {
        return segment.get(LAYOUT$pVendorInfos, OFFSET$pVendorInfos);
    }

    public void pVendorInfosRaw(@pointer(comment="VkDeviceFaultVendorInfoEXT*") MemorySegment value) {
        segment.set(LAYOUT$pVendorInfos, OFFSET$pVendorInfos, value);
    }
    
    public @nullable VkDeviceFaultVendorInfoEXT pVendorInfos() {
        MemorySegment s = pVendorInfosRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkDeviceFaultVendorInfoEXT(s);
    }

    public void pVendorInfos(@nullable VkDeviceFaultVendorInfoEXT value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pVendorInfosRaw(s);
    }

    public @pointer(comment="void*") MemorySegment pVendorBinaryData() {
        return segment.get(LAYOUT$pVendorBinaryData, OFFSET$pVendorBinaryData);
    }

    public void pVendorBinaryData(@pointer(comment="void*") MemorySegment value) {
        segment.set(LAYOUT$pVendorBinaryData, OFFSET$pVendorBinaryData, value);
    }


    public static final class VkDeviceFaultInfoEXTFactory implements IDataTypeFactory<VkDeviceFaultInfoEXT> {
        @Override
        public Class<VkDeviceFaultInfoEXT> clazz() {
            return VkDeviceFaultInfoEXT.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkDeviceFaultInfoEXT.LAYOUT;
        }

        @Override
        public VkDeviceFaultInfoEXT create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkDeviceFaultInfoEXT createUninit(MemorySegment segment) {
            return new VkDeviceFaultInfoEXT(segment);
        }
    }

    public static final VkDeviceFaultInfoEXTFactory FACTORY = new VkDeviceFaultInfoEXTFactory();
}
