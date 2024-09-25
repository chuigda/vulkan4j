package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.annotation.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.buffer.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import tech.icey.vk4j.NativeLayout;
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
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$physicalDeviceCount = PathElement.groupElement("physicalDeviceCount");
    public static final PathElement PATH$physicalDevices = PathElement.groupElement("physicalDevices");
    public static final PathElement PATH$subsetAllocation = PathElement.groupElement("subsetAllocation");

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

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$physicalDeviceCount = LAYOUT$physicalDeviceCount.byteSize();
    public static final long SIZE$physicalDevices = LAYOUT$physicalDevices.byteSize();
    public static final long SIZE$subsetAllocation = LAYOUT$subsetAllocation.byteSize();

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

    public static VkPhysicalDeviceGroupProperties allocate(Arena arena) {
        return new VkPhysicalDeviceGroupProperties(arena.allocate(LAYOUT));
    }
    
    public static VkPhysicalDeviceGroupProperties[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceGroupProperties[] ret = new VkPhysicalDeviceGroupProperties[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkPhysicalDeviceGroupProperties(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
}
