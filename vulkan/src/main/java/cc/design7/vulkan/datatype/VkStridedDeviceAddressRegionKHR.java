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

public record VkStridedDeviceAddressRegionKHR(@NotNull MemorySegment segment) implements IPointer {
    public static final OfLong LAYOUT$deviceAddress = ValueLayout.JAVA_LONG.withName("deviceAddress");
    public static final OfLong LAYOUT$stride = ValueLayout.JAVA_LONG.withName("stride");
    public static final OfLong LAYOUT$size = ValueLayout.JAVA_LONG.withName("size");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$deviceAddress, LAYOUT$stride, LAYOUT$size);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkStridedDeviceAddressRegionKHR allocate(Arena arena) {
        return new VkStridedDeviceAddressRegionKHR(arena.allocate(LAYOUT));
    }

    public static VkStridedDeviceAddressRegionKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkStridedDeviceAddressRegionKHR[] ret = new VkStridedDeviceAddressRegionKHR[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkStridedDeviceAddressRegionKHR(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkStridedDeviceAddressRegionKHR clone(Arena arena, VkStridedDeviceAddressRegionKHR src) {
        VkStridedDeviceAddressRegionKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkStridedDeviceAddressRegionKHR[] clone(Arena arena, VkStridedDeviceAddressRegionKHR[] src) {
        VkStridedDeviceAddressRegionKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$deviceAddress = PathElement.groupElement("PATH$deviceAddress");
    public static final PathElement PATH$stride = PathElement.groupElement("PATH$stride");
    public static final PathElement PATH$size = PathElement.groupElement("PATH$size");

    public static final long SIZE$deviceAddress = LAYOUT$deviceAddress.byteSize();
    public static final long SIZE$stride = LAYOUT$stride.byteSize();
    public static final long SIZE$size = LAYOUT$size.byteSize();

    public static final long OFFSET$deviceAddress = LAYOUT.byteOffset(PATH$deviceAddress);
    public static final long OFFSET$stride = LAYOUT.byteOffset(PATH$stride);
    public static final long OFFSET$size = LAYOUT.byteOffset(PATH$size);

    public @unsigned long deviceAddress() {
        return segment.get(LAYOUT$deviceAddress, OFFSET$deviceAddress);
    }

    public void deviceAddress(@unsigned long value) {
        segment.set(LAYOUT$deviceAddress, OFFSET$deviceAddress, value);
    }

    public @unsigned long stride() {
        return segment.get(LAYOUT$stride, OFFSET$stride);
    }

    public void stride(@unsigned long value) {
        segment.set(LAYOUT$stride, OFFSET$stride, value);
    }

    public @unsigned long size() {
        return segment.get(LAYOUT$size, OFFSET$size);
    }

    public void size(@unsigned long value) {
        segment.set(LAYOUT$size, OFFSET$size, value);
    }

}
/// dummy, not implemented yet
