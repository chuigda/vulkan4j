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

public record VkPhysicalDeviceIDProperties(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        MemoryLayout.sequenceLayout(VK_UUID_SIZE, ValueLayout.JAVA_BYTE).withName("deviceUUID"),
        MemoryLayout.sequenceLayout(VK_UUID_SIZE, ValueLayout.JAVA_BYTE).withName("driverUUID"),
        MemoryLayout.sequenceLayout(VK_LUID_SIZE, ValueLayout.JAVA_BYTE).withName("deviceLUID"),
        ValueLayout.JAVA_INT.withName("deviceNodeMask"),
        ValueLayout.JAVA_INT.withName("deviceLUIDValid")
    );

    public static final PathElement PATH$sType = PathElement.groupElement(0);
    public static final PathElement PATH$pNext = PathElement.groupElement(1);
    public static final PathElement PATH$deviceUUID = PathElement.groupElement(2);
    public static final PathElement PATH$driverUUID = PathElement.groupElement(3);
    public static final PathElement PATH$deviceLUID = PathElement.groupElement(4);
    public static final PathElement PATH$deviceNodeMask = PathElement.groupElement(5);
    public static final PathElement PATH$deviceLUIDValid = PathElement.groupElement(6);

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final SequenceLayout LAYOUT$deviceUUID = (SequenceLayout) LAYOUT.select(PATH$deviceUUID);
    public static final SequenceLayout LAYOUT$driverUUID = (SequenceLayout) LAYOUT.select(PATH$driverUUID);
    public static final SequenceLayout LAYOUT$deviceLUID = (SequenceLayout) LAYOUT.select(PATH$deviceLUID);
    public static final OfInt LAYOUT$deviceNodeMask = (OfInt) LAYOUT.select(PATH$deviceNodeMask);
    public static final OfInt LAYOUT$deviceLUIDValid = (OfInt) LAYOUT.select(PATH$deviceLUIDValid);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$deviceUUID = LAYOUT.byteOffset(PATH$deviceUUID);
    public static final long OFFSET$driverUUID = LAYOUT.byteOffset(PATH$driverUUID);
    public static final long OFFSET$deviceLUID = LAYOUT.byteOffset(PATH$deviceLUID);
    public static final long OFFSET$deviceNodeMask = LAYOUT.byteOffset(PATH$deviceNodeMask);
    public static final long OFFSET$deviceLUIDValid = LAYOUT.byteOffset(PATH$deviceLUIDValid);

    public VkPhysicalDeviceIDProperties(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ID_PROPERTIES);
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

    public MemorySegment deviceUUIDRaw() {
        return segment.asSlice(OFFSET$deviceUUID, LAYOUT$deviceUUID.byteSize());
    }
        
    public @unsigned ByteArray deviceUUID(int index) {
        return new ByteArray(deviceUUIDRaw(), LAYOUT$deviceUUID.elementCount());
    }
    
    public void deviceUUID(@unsigned ByteArray value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$deviceUUID, LAYOUT$deviceUUID.byteSize());
    }

    public MemorySegment driverUUIDRaw() {
        return segment.asSlice(OFFSET$driverUUID, LAYOUT$driverUUID.byteSize());
    }
        
    public @unsigned ByteArray driverUUID(int index) {
        return new ByteArray(driverUUIDRaw(), LAYOUT$driverUUID.elementCount());
    }
    
    public void driverUUID(@unsigned ByteArray value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$driverUUID, LAYOUT$driverUUID.byteSize());
    }

    public MemorySegment deviceLUIDRaw() {
        return segment.asSlice(OFFSET$deviceLUID, LAYOUT$deviceLUID.byteSize());
    }
        
    public @unsigned ByteArray deviceLUID(int index) {
        return new ByteArray(deviceLUIDRaw(), LAYOUT$deviceLUID.elementCount());
    }
    
    public void deviceLUID(@unsigned ByteArray value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$deviceLUID, LAYOUT$deviceLUID.byteSize());
    }

    public @unsigned int deviceNodeMask() {
        return segment.get(LAYOUT$deviceNodeMask, OFFSET$deviceNodeMask);
    }

    public void deviceNodeMask(@unsigned int value) {
        segment.set(LAYOUT$deviceNodeMask, OFFSET$deviceNodeMask, value);
    }

    public @unsigned int deviceLUIDValid() {
        return segment.get(LAYOUT$deviceLUIDValid, OFFSET$deviceLUIDValid);
    }

    public void deviceLUIDValid(@unsigned int value) {
        segment.set(LAYOUT$deviceLUIDValid, OFFSET$deviceLUIDValid, value);
    }


    public static final class VkPhysicalDeviceIDPropertiesFactory implements IDataTypeFactory<VkPhysicalDeviceIDProperties> {
        @Override
        public Class<VkPhysicalDeviceIDProperties> clazz() {
            return VkPhysicalDeviceIDProperties.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkPhysicalDeviceIDProperties.LAYOUT;
        }

        @Override
        public VkPhysicalDeviceIDProperties create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkPhysicalDeviceIDProperties createUninit(MemorySegment segment) {
            return new VkPhysicalDeviceIDProperties(segment);
        }
    }

    public static final VkPhysicalDeviceIDPropertiesFactory FACTORY = new VkPhysicalDeviceIDPropertiesFactory();
}
