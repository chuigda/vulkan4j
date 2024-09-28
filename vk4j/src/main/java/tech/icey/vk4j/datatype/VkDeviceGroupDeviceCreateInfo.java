package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.IPointer;
import tech.icey.vk4j.annotation.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.buffer.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import tech.icey.vk4j.NativeLayout;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

public record VkDeviceGroupDeviceCreateInfo(MemorySegment segment) implements IPointer {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("physicalDeviceCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS).withName("pPhysicalDevices")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$physicalDeviceCount = PathElement.groupElement("physicalDeviceCount");
    public static final PathElement PATH$pPhysicalDevices = PathElement.groupElement("pPhysicalDevices");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$physicalDeviceCount = (OfInt) LAYOUT.select(PATH$physicalDeviceCount);
    public static final AddressLayout LAYOUT$pPhysicalDevices = (AddressLayout) LAYOUT.select(PATH$pPhysicalDevices);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$physicalDeviceCount = LAYOUT.byteOffset(PATH$physicalDeviceCount);
    public static final long OFFSET$pPhysicalDevices = LAYOUT.byteOffset(PATH$pPhysicalDevices);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$physicalDeviceCount = LAYOUT$physicalDeviceCount.byteSize();
    public static final long SIZE$pPhysicalDevices = LAYOUT$pPhysicalDevices.byteSize();

    public VkDeviceGroupDeviceCreateInfo(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_DEVICE_GROUP_DEVICE_CREATE_INFO);
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

    public void pNext(IPointer pointer) {
        pNext(pointer.segment());
    }

    public @unsigned int physicalDeviceCount() {
        return segment.get(LAYOUT$physicalDeviceCount, OFFSET$physicalDeviceCount);
    }

    public void physicalDeviceCount(@unsigned int value) {
        segment.set(LAYOUT$physicalDeviceCount, OFFSET$physicalDeviceCount, value);
    }

    public @pointer(comment="VkPhysicalDevice") MemorySegment pPhysicalDevicesRaw() {
        return segment.get(LAYOUT$pPhysicalDevices, OFFSET$pPhysicalDevices);
    }

    public void pPhysicalDevicesRaw(@pointer(comment="VkPhysicalDevice") MemorySegment value) {
        segment.set(LAYOUT$pPhysicalDevices, OFFSET$pPhysicalDevices, value);
    }

    /// Note: the returned {@link VkPhysicalDevice.Buffer} does not have correct
    /// {@link VkPhysicalDevice.Buffer#size} property. It's up to user to track the size of the buffer,
    /// and use {@link VkPhysicalDevice.Buffer#reinterpret} to set the size before actually
    /// {@link VkPhysicalDevice.Buffer#read}ing or {@link VkPhysicalDevice.Buffer#write}ing
    /// the buffer.
    public @nullable VkPhysicalDevice.Buffer pPhysicalDevices() {
        MemorySegment s = pPhysicalDevicesRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkPhysicalDevice.Buffer(s);
    }

    public void pPhysicalDevices(@nullable VkPhysicalDevice.Buffer value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pPhysicalDevicesRaw(s);
    }

    public static VkDeviceGroupDeviceCreateInfo allocate(Arena arena) {
        return new VkDeviceGroupDeviceCreateInfo(arena.allocate(LAYOUT));
    }
    
    public static VkDeviceGroupDeviceCreateInfo[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkDeviceGroupDeviceCreateInfo[] ret = new VkDeviceGroupDeviceCreateInfo[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkDeviceGroupDeviceCreateInfo(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
}
