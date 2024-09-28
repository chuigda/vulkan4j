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

/// {@snippet lang=c :
/// typedef struct VkDeviceOrHostAddressConstKHR {
///     VkDeviceAddress deviceAddress;
///     const void* hostAddress;
/// } VkDeviceOrHostAddressConstKHR;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkDeviceOrHostAddressConstKHR.html">VkDeviceOrHostAddressConstKHR</a>
public record VkDeviceOrHostAddressConstKHR(MemorySegment segment) implements IPointer {
    public static final MemoryLayout LAYOUT = NativeLayout.unionLayout(
        ValueLayout.JAVA_LONG.withName("deviceAddress"),
        ValueLayout.ADDRESS.withName("hostAddress")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$deviceAddress = PathElement.groupElement("deviceAddress");
    public static final PathElement PATH$hostAddress = PathElement.groupElement("hostAddress");

    public static final OfLong LAYOUT$deviceAddress = (OfLong) LAYOUT.select(PATH$deviceAddress);
    public static final AddressLayout LAYOUT$hostAddress = (AddressLayout) LAYOUT.select(PATH$hostAddress);

    public static final long OFFSET$deviceAddress = LAYOUT.byteOffset(PATH$deviceAddress);
    public static final long OFFSET$hostAddress = LAYOUT.byteOffset(PATH$hostAddress);

    public static final long SIZE$deviceAddress = LAYOUT$deviceAddress.byteSize();
    public static final long SIZE$hostAddress = LAYOUT$hostAddress.byteSize();

    public VkDeviceOrHostAddressConstKHR(MemorySegment segment) {
        this.segment = segment;
    }

    public @unsigned long deviceAddress() {
        return segment.get(LAYOUT$deviceAddress, OFFSET$deviceAddress);
    }

    public void deviceAddress(@unsigned long value) {
        segment.set(LAYOUT$deviceAddress, OFFSET$deviceAddress, value);
    }

    public @pointer(comment="void*") MemorySegment hostAddress() {
        return segment.get(LAYOUT$hostAddress, OFFSET$hostAddress);
    }

    public void hostAddress(@pointer(comment="void*") MemorySegment value) {
        segment.set(LAYOUT$hostAddress, OFFSET$hostAddress, value);
    }

    public void hostAddress(IPointer pointer) {
        hostAddress(pointer.segment());
    }

    public static VkDeviceOrHostAddressConstKHR allocate(Arena arena) {
        return new VkDeviceOrHostAddressConstKHR(arena.allocate(LAYOUT));
    }
    
    public static VkDeviceOrHostAddressConstKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkDeviceOrHostAddressConstKHR[] ret = new VkDeviceOrHostAddressConstKHR[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkDeviceOrHostAddressConstKHR(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
}
