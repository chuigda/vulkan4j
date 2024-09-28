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

/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkDeviceFaultAddressInfoEXT.html">VkDeviceFaultAddressInfoEXT</a>
public record VkDeviceFaultAddressInfoEXT(MemorySegment segment) implements IPointer {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("addressType"),
        ValueLayout.JAVA_LONG.withName("reportedAddress"),
        ValueLayout.JAVA_LONG.withName("addressPrecision")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$addressType = PathElement.groupElement("addressType");
    public static final PathElement PATH$reportedAddress = PathElement.groupElement("reportedAddress");
    public static final PathElement PATH$addressPrecision = PathElement.groupElement("addressPrecision");

    public static final OfInt LAYOUT$addressType = (OfInt) LAYOUT.select(PATH$addressType);
    public static final OfLong LAYOUT$reportedAddress = (OfLong) LAYOUT.select(PATH$reportedAddress);
    public static final OfLong LAYOUT$addressPrecision = (OfLong) LAYOUT.select(PATH$addressPrecision);

    public static final long OFFSET$addressType = LAYOUT.byteOffset(PATH$addressType);
    public static final long OFFSET$reportedAddress = LAYOUT.byteOffset(PATH$reportedAddress);
    public static final long OFFSET$addressPrecision = LAYOUT.byteOffset(PATH$addressPrecision);

    public static final long SIZE$addressType = LAYOUT$addressType.byteSize();
    public static final long SIZE$reportedAddress = LAYOUT$reportedAddress.byteSize();
    public static final long SIZE$addressPrecision = LAYOUT$addressPrecision.byteSize();

    public VkDeviceFaultAddressInfoEXT(MemorySegment segment) {
        this.segment = segment;
    }

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

    public static VkDeviceFaultAddressInfoEXT allocate(Arena arena) {
        return new VkDeviceFaultAddressInfoEXT(arena.allocate(LAYOUT));
    }
    
    public static VkDeviceFaultAddressInfoEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkDeviceFaultAddressInfoEXT[] ret = new VkDeviceFaultAddressInfoEXT[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkDeviceFaultAddressInfoEXT(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
}
