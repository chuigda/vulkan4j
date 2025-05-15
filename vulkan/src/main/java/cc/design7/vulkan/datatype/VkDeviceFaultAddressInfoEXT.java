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

public record VkDeviceFaultAddressInfoEXT(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$addressType = ValueLayout.JAVA_INT.withName("addressType");
    public static final OfLong LAYOUT$reportedAddress = ValueLayout.JAVA_LONG.withName("reportedAddress");
    public static final OfLong LAYOUT$addressPrecision = ValueLayout.JAVA_LONG.withName("addressPrecision");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$addressType, LAYOUT$reportedAddress, LAYOUT$addressPrecision);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkDeviceFaultAddressInfoEXT allocate(Arena arena) {
        return new VkDeviceFaultAddressInfoEXT(arena.allocate(LAYOUT));
    }

    public static VkDeviceFaultAddressInfoEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkDeviceFaultAddressInfoEXT[] ret = new VkDeviceFaultAddressInfoEXT[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkDeviceFaultAddressInfoEXT(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkDeviceFaultAddressInfoEXT clone(Arena arena, VkDeviceFaultAddressInfoEXT src) {
        VkDeviceFaultAddressInfoEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkDeviceFaultAddressInfoEXT[] clone(Arena arena, VkDeviceFaultAddressInfoEXT[] src) {
        VkDeviceFaultAddressInfoEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$addressType = PathElement.groupElement("PATH$addressType");
    public static final PathElement PATH$reportedAddress = PathElement.groupElement("PATH$reportedAddress");
    public static final PathElement PATH$addressPrecision = PathElement.groupElement("PATH$addressPrecision");

    public static final long SIZE$addressType = LAYOUT$addressType.byteSize();
    public static final long SIZE$reportedAddress = LAYOUT$reportedAddress.byteSize();
    public static final long SIZE$addressPrecision = LAYOUT$addressPrecision.byteSize();

    public static final long OFFSET$addressType = LAYOUT.byteOffset(PATH$addressType);
    public static final long OFFSET$reportedAddress = LAYOUT.byteOffset(PATH$reportedAddress);
    public static final long OFFSET$addressPrecision = LAYOUT.byteOffset(PATH$addressPrecision);

    public @enumtype(VkDeviceFaultAddressTypeEXT.class) int addressType() {
        return segment.get(LAYOUT$addressType, OFFSET$addressType);
    }

    public void addressType(@enumtype(VkDeviceFaultAddressTypeEXT.class) int value) {
        segment.set(LAYOUT$addressType, OFFSET$addressType, value);
    }

    public @unsigned long reportedAddress() {
        return segment.get(LAYOUT$reportedAddress, OFFSET$reportedAddress);
    }

    public void reportedAddress(@unsigned long value) {
        segment.set(LAYOUT$reportedAddress, OFFSET$reportedAddress, value);
    }

    public @unsigned long addressPrecision() {
        return segment.get(LAYOUT$addressPrecision, OFFSET$addressPrecision);
    }

    public void addressPrecision(@unsigned long value) {
        segment.set(LAYOUT$addressPrecision, OFFSET$addressPrecision, value);
    }

}
/// dummy, not implemented yet
