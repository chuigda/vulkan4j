package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import org.jetbrains.annotations.Nullable;
import tech.icey.panama.IPointer;
import tech.icey.panama.NativeLayout;
import tech.icey.panama.annotation.*;
import tech.icey.panama.buffer.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

/// {@snippet lang=c :
/// typedef struct VkPhysicalDeviceGroupProperties {
///     VkStructureType sType;
///     void* pNext;
///     uint32_t physicalDeviceCount;
///     VkPhysicalDevice physicalDevices[VK_MAX_DEVICE_GROUP_SIZE];
///     VkBool32 subsetAllocation;
/// } VkPhysicalDeviceGroupProperties;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkPhysicalDeviceGroupProperties.html">VkPhysicalDeviceGroupProperties</a>
public record VkPhysicalDeviceGroupProperties(MemorySegment segment) implements IPointer {
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

    public void pNext(@Nullable IPointer pointer) {
        pNext(pointer == null ? MemorySegment.NULL : pointer.segment());
    }

    public @unsigned int physicalDeviceCount() {
        return segment.get(LAYOUT$physicalDeviceCount, OFFSET$physicalDeviceCount);
    }

    public void physicalDeviceCount(@unsigned int value) {
        segment.set(LAYOUT$physicalDeviceCount, OFFSET$physicalDeviceCount, value);
    }

    public MemorySegment physicalDevicesRaw() {
        return segment.asSlice(OFFSET$physicalDevices, SIZE$physicalDevices);
    }

    public VkPhysicalDevice.Buffer physicalDevices() {
        return new VkPhysicalDevice.Buffer(physicalDevicesRaw());
    }

    public void physicalDevices(VkPhysicalDevice.Buffer value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$physicalDevices, SIZE$physicalDevices);
    }


    
    public VkPhysicalDevice physicalDevicesAt(long index) {
        MemorySegment s = physicalDevicesRaw();
        MemorySegment deref = s.get(ValueLayout.ADDRESS, index * ValueLayout.ADDRESS.byteSize());
        return new VkPhysicalDevice(deref);
    }
    
    public void physicalDevicesAt(long index, VkPhysicalDevice value) {
        MemorySegment s = physicalDevicesRaw();
        MemorySegment deref = s.get(ValueLayout.ADDRESS, index * ValueLayout.ADDRESS.byteSize());
        deref.copyFrom(value.segment());
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

    public static VkPhysicalDeviceGroupProperties clone(Arena arena, VkPhysicalDeviceGroupProperties src) {
        VkPhysicalDeviceGroupProperties ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceGroupProperties[] clone(Arena arena, VkPhysicalDeviceGroupProperties[] src) {
        VkPhysicalDeviceGroupProperties[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

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
}
