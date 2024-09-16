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

public record VkPhysicalDeviceGroupProperties(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("physicalDeviceCount"),
        MemoryLayout.sequenceLayout(VK_MAX_DEVICE_GROUP_SIZE, ValueLayout.ADDRESS).withName("physicalDevices"),
        ValueLayout.JAVA_INT.withName("subsetAllocation")
    );

    public static final PathElement PATH$sType = PathElement.groupElement(0);
    public static final PathElement PATH$pNext = PathElement.groupElement(1);
    public static final PathElement PATH$physicalDeviceCount = PathElement.groupElement(2);
    public static final PathElement PATH$physicalDevices = PathElement.groupElement(3);
    public static final PathElement PATH$subsetAllocation = PathElement.groupElement(4);

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$physicalDeviceCount = (OfInt) LAYOUT.select(PATH$physicalDeviceCount);
    public static final SequenceLayout LAYOUT$physicalDevices = (SequenceLayout) LAYOUT.select(PATH$physicalDevices);
    public static final OfInt LAYOUT$subsetAllocation = (OfInt) LAYOUT.select(PATH$subsetAllocation);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$physicalDeviceCount = LAYOUT.byteOffset(PATH$physicalDeviceCount);
    public static final long OFFSET$physicalDevices = LAYOUT.byteOffset(PATH$physicalDevices);
    public static final long OFFSET$subsetAllocation = LAYOUT.byteOffset(PATH$subsetAllocation);

    public VkPhysicalDeviceGroupProperties(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_GROUP_PROPERTIES);
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

    public @unsigned int physicalDeviceCount() {
        return segment.get(LAYOUT$physicalDeviceCount, OFFSET$physicalDeviceCount);
    }

    public void physicalDeviceCount(@unsigned int value) {
        segment.set(LAYOUT$physicalDeviceCount, OFFSET$physicalDeviceCount, value);
    }

    public MemorySegment physicalDevicesRaw() {
        return segment.asSlice(OFFSET$physicalDevices, LAYOUT$physicalDevices.byteSize());
    }

    public VkPhysicalDevice[] physicalDevices() {
        MemorySegment s = physicalDevicesRaw();
        VkPhysicalDevice[] arr = new VkPhysicalDevice[(int)LAYOUT$physicalDevices.elementCount()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new VkPhysicalDevice(s.asSlice(i * LAYOUT$physicalDevices.byteSize(), LAYOUT$physicalDevices.byteSize()));
        }
        return arr;
    }

    public void physicalDevices(VkPhysicalDevice[] value) {
        MemorySegment s = physicalDevicesRaw();
        for (int i = 0; i < value.length; i++) {
            MemorySegment.copy(value[i].segment(), 0, s, i * LAYOUT$physicalDevices.byteSize(), LAYOUT$physicalDevices.byteSize());
        }
    }

    public VkPhysicalDevice physicalDevicesAt(long index) {
        MemorySegment s = physicalDevicesRaw();
        return new VkPhysicalDevice(s.asSlice(index * LAYOUT$physicalDevices.byteSize(), LAYOUT$physicalDevices.byteSize()));
    }

    public void physicalDevicesAt(long index, VkPhysicalDevice value) {
        MemorySegment.copy(value.segment(), 0, physicalDevicesRaw(), index * LAYOUT$physicalDevices.byteSize(), LAYOUT$physicalDevices.byteSize());
    }

    public @unsigned int subsetAllocation() {
        return segment.get(LAYOUT$subsetAllocation, OFFSET$subsetAllocation);
    }

    public void subsetAllocation(@unsigned int value) {
        segment.set(LAYOUT$subsetAllocation, OFFSET$subsetAllocation, value);
    }


    public static final class VkPhysicalDeviceGroupPropertiesFactory implements IDataTypeFactory<VkPhysicalDeviceGroupProperties> {
        @Override
        public Class<VkPhysicalDeviceGroupProperties> clazz() {
            return VkPhysicalDeviceGroupProperties.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkPhysicalDeviceGroupProperties.LAYOUT;
        }

        @Override
        public VkPhysicalDeviceGroupProperties create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkPhysicalDeviceGroupProperties createUninit(MemorySegment segment) {
            return new VkPhysicalDeviceGroupProperties(segment);
        }
    }

    public static final VkPhysicalDeviceGroupPropertiesFactory FACTORY = new VkPhysicalDeviceGroupPropertiesFactory();
}
