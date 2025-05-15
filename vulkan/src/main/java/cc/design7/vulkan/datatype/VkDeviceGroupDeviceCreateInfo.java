package cc.design7.vulkan.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import cc.design7.ffm.IPointer;
import cc.design7.ffm.NativeLayout;
import cc.design7.ffm.annotation.*;
import cc.design7.ffm.ptr.*;
import cc.design7.vulkan.bitmask.*;
import cc.design7.vulkan.datatype.*;
import cc.design7.vulkan.enumtype.*;
import static cc.design7.vulkan.VkConstants.*;

public record VkDeviceGroupDeviceCreateInfo(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$physicalDeviceCount = ValueLayout.JAVA_INT.withName("physicalDeviceCount");
    public static final AddressLayout LAYOUT$pPhysicalDevices = ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS).withName("pPhysicalDevices");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$physicalDeviceCount, LAYOUT$pPhysicalDevices);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkDeviceGroupDeviceCreateInfo allocate(Arena arena) {
        return new VkDeviceGroupDeviceCreateInfo(arena.allocate(LAYOUT));
    }

    public static VkDeviceGroupDeviceCreateInfo[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkDeviceGroupDeviceCreateInfo[] ret = new VkDeviceGroupDeviceCreateInfo[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkDeviceGroupDeviceCreateInfo(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkDeviceGroupDeviceCreateInfo clone(Arena arena, VkDeviceGroupDeviceCreateInfo src) {
        VkDeviceGroupDeviceCreateInfo ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkDeviceGroupDeviceCreateInfo[] clone(Arena arena, VkDeviceGroupDeviceCreateInfo[] src) {
        VkDeviceGroupDeviceCreateInfo[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$physicalDeviceCount = PathElement.groupElement("PATH$physicalDeviceCount");
    public static final PathElement PATH$pPhysicalDevices = PathElement.groupElement("PATH$pPhysicalDevices");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$physicalDeviceCount = LAYOUT$physicalDeviceCount.byteSize();
    public static final long SIZE$pPhysicalDevices = LAYOUT$pPhysicalDevices.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$physicalDeviceCount = LAYOUT.byteOffset(PATH$physicalDeviceCount);
    public static final long OFFSET$pPhysicalDevices = LAYOUT.byteOffset(PATH$pPhysicalDevices);

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

    public @pointer(comment="VkPhysicalDevice*") MemorySegment pPhysicalDevicesRaw() {
        return segment.get(LAYOUT$pPhysicalDevices, OFFSET$pPhysicalDevices);
    }

    public void pPhysicalDevicesRaw(@pointer(comment="VkPhysicalDevice*") MemorySegment value) {
        segment.set(LAYOUT$pPhysicalDevices, OFFSET$pPhysicalDevices, value);
    }

    /// Note: the returned {@link VkPhysicalDevice.Buffer} does not have correct {@link VkPhysicalDevice.Buffer#size}
    /// property. It's up to user to track the size of the buffer, and use
    /// {@link VkPhysicalDevice.Buffer#reinterpret} to set the size before actually reading from or writing to the
    /// buffer.
    public @Nullable VkPhysicalDevice.Buffer pPhysicalDevices() {
        MemorySegment s = pPhysicalDevicesRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkPhysicalDevice.Buffer(s);
    }


}
/// dummy, not implemented yet
