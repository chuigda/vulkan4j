package tech.icey.vma.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import org.jetbrains.annotations.Nullable;
import tech.icey.panama.IPointer;
import tech.icey.panama.NativeLayout;
import tech.icey.panama.annotation.*;
import tech.icey.panama.buffer.*;
import tech.icey.vma.bitmask.*;
import tech.icey.vma.datatype.*;
import tech.icey.vma.enumtype.*;
import tech.icey.vma.handle.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;

public record VmaAllocatorInfo(MemorySegment segment) implements IPointer {
    public @Nullable VkInstance instance() {
        MemorySegment s = segment.asSlice(OFFSET$instance, SIZE$instance);
        if (s.address() == 0) {
            return null;
        }
        return new VkInstance(s);
    }

    public void instance(@Nullable VkInstance value) {
        segment.set(
            LAYOUT$instance,
            OFFSET$instance,
            value != null ? value.segment() : MemorySegment.NULL
        );
    }

    public @Nullable VkPhysicalDevice physicalDevice() {
        MemorySegment s = segment.asSlice(OFFSET$physicalDevice, SIZE$physicalDevice);
        if (s.address() == 0) {
            return null;
        }
        return new VkPhysicalDevice(s);
    }

    public void physicalDevice(@Nullable VkPhysicalDevice value) {
        segment.set(
            LAYOUT$physicalDevice,
            OFFSET$physicalDevice,
            value != null ? value.segment() : MemorySegment.NULL
        );
    }

    public @Nullable VkDevice device() {
        MemorySegment s = segment.asSlice(OFFSET$device, SIZE$device);
        if (s.address() == 0) {
            return null;
        }
        return new VkDevice(s);
    }

    public void device(@Nullable VkDevice value) {
        segment.set(
            LAYOUT$device,
            OFFSET$device,
            value != null ? value.segment() : MemorySegment.NULL
        );
    }

    public static VmaAllocatorInfo allocate(Arena arena) {
        return new VmaAllocatorInfo(arena.allocate(LAYOUT));
    }

    public static VmaAllocatorInfo[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VmaAllocatorInfo[] ret = new VmaAllocatorInfo[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VmaAllocatorInfo(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VmaAllocatorInfo clone(Arena arena, VmaAllocatorInfo src) {
        VmaAllocatorInfo ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VmaAllocatorInfo[] clone(Arena arena, VmaAllocatorInfo[] src) {
        VmaAllocatorInfo[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.ADDRESS.withName("instance"),
        ValueLayout.ADDRESS.withName("physicalDevice"),
        ValueLayout.ADDRESS.withName("device")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$instance = PathElement.groupElement("instance");
    public static final PathElement PATH$physicalDevice = PathElement.groupElement("physicalDevice");
    public static final PathElement PATH$device = PathElement.groupElement("device");

    public static final AddressLayout LAYOUT$instance = (AddressLayout) LAYOUT.select(PATH$instance);
    public static final AddressLayout LAYOUT$physicalDevice = (AddressLayout) LAYOUT.select(PATH$physicalDevice);
    public static final AddressLayout LAYOUT$device = (AddressLayout) LAYOUT.select(PATH$device);

    public static final long OFFSET$instance = LAYOUT.byteOffset(PATH$instance);
    public static final long OFFSET$physicalDevice = LAYOUT.byteOffset(PATH$physicalDevice);
    public static final long OFFSET$device = LAYOUT.byteOffset(PATH$device);

    public static final long SIZE$instance = LAYOUT$instance.byteSize();
    public static final long SIZE$physicalDevice = LAYOUT$physicalDevice.byteSize();
    public static final long SIZE$device = LAYOUT$device.byteSize();
}

