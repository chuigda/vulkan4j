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

public record VkPhysicalDeviceLayeredApiPropertiesKHR(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("vendorID"),
        ValueLayout.JAVA_INT.withName("deviceID"),
        ValueLayout.JAVA_INT.withName("layeredAPI"),
        MemoryLayout.sequenceLayout(VK_MAX_PHYSICAL_DEVICE_NAME_SIZE, ValueLayout.JAVA_BYTE).withName("deviceName")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$vendorID = PathElement.groupElement("vendorID");
    public static final PathElement PATH$deviceID = PathElement.groupElement("deviceID");
    public static final PathElement PATH$layeredAPI = PathElement.groupElement("layeredAPI");
    public static final PathElement PATH$deviceName = PathElement.groupElement("deviceName");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$vendorID = (OfInt) LAYOUT.select(PATH$vendorID);
    public static final OfInt LAYOUT$deviceID = (OfInt) LAYOUT.select(PATH$deviceID);
    public static final OfInt LAYOUT$layeredAPI = (OfInt) LAYOUT.select(PATH$layeredAPI);
    public static final SequenceLayout LAYOUT$deviceName = (SequenceLayout) LAYOUT.select(PATH$deviceName);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$vendorID = LAYOUT.byteOffset(PATH$vendorID);
    public static final long OFFSET$deviceID = LAYOUT.byteOffset(PATH$deviceID);
    public static final long OFFSET$layeredAPI = LAYOUT.byteOffset(PATH$layeredAPI);
    public static final long OFFSET$deviceName = LAYOUT.byteOffset(PATH$deviceName);

    public VkPhysicalDeviceLayeredApiPropertiesKHR(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_LAYERED_API_PROPERTIES_KHR);
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

    public @unsigned int vendorID() {
        return segment.get(LAYOUT$vendorID, OFFSET$vendorID);
    }

    public void vendorID(@unsigned int value) {
        segment.set(LAYOUT$vendorID, OFFSET$vendorID, value);
    }

    public @unsigned int deviceID() {
        return segment.get(LAYOUT$deviceID, OFFSET$deviceID);
    }

    public void deviceID(@unsigned int value) {
        segment.set(LAYOUT$deviceID, OFFSET$deviceID, value);
    }

    public @enumtype(VkPhysicalDeviceLayeredApiKHR.class) int layeredAPI() {
        return segment.get(LAYOUT$layeredAPI, OFFSET$layeredAPI);
    }

    public void layeredAPI(@enumtype(VkPhysicalDeviceLayeredApiKHR.class) int value) {
        segment.set(LAYOUT$layeredAPI, OFFSET$layeredAPI, value);
    }

    public MemorySegment deviceNameRaw() {
        return segment.asSlice(OFFSET$deviceName, LAYOUT$deviceName.byteSize());
    }

    public ByteArray deviceName() {
        return new ByteArray(deviceNameRaw(), LAYOUT$deviceName.elementCount());
    }

    public void deviceName(ByteArray value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$deviceName, LAYOUT$deviceName.byteSize());
    }


    public static final class VkPhysicalDeviceLayeredApiPropertiesKHRFactory implements IFactory<VkPhysicalDeviceLayeredApiPropertiesKHR> {
        @Override
        public Class<VkPhysicalDeviceLayeredApiPropertiesKHR> clazz() {
            return VkPhysicalDeviceLayeredApiPropertiesKHR.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkPhysicalDeviceLayeredApiPropertiesKHR.LAYOUT;
        }

        @Override
        public VkPhysicalDeviceLayeredApiPropertiesKHR create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkPhysicalDeviceLayeredApiPropertiesKHR createUninit(MemorySegment segment) {
            return new VkPhysicalDeviceLayeredApiPropertiesKHR(segment);
        }
    }

    public static final VkPhysicalDeviceLayeredApiPropertiesKHRFactory FACTORY = new VkPhysicalDeviceLayeredApiPropertiesKHRFactory();
}
