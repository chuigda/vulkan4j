package tech.icey.vk4j.datatype;

import tech.icey.panama.IPointer;
import tech.icey.panama.NativeLayout;
import tech.icey.panama.annotation.pointer;
import tech.icey.panama.annotation.unsigned;

import java.lang.foreign.*;

import static java.lang.foreign.ValueLayout.OfLong;
import static java.lang.foreign.ValueLayout.PathElement;

/// {@snippet lang=c :
/// typedef union VkDeviceOrHostAddressConstAMDX {
///     VkDeviceAddress deviceAddress;
///     const void* hostAddress;
/// } VkDeviceOrHostAddressConstAMDX;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkDeviceOrHostAddressConstAMDX.html">VkDeviceOrHostAddressConstAMDX</a>
public record VkDeviceOrHostAddressConstAMDX(MemorySegment segment) implements IPointer {
    public VkDeviceOrHostAddressConstAMDX(MemorySegment segment) {
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

    public static VkDeviceOrHostAddressConstAMDX allocate(Arena arena) {
        return new VkDeviceOrHostAddressConstAMDX(arena.allocate(LAYOUT));
    }

    public static VkDeviceOrHostAddressConstAMDX[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkDeviceOrHostAddressConstAMDX[] ret = new VkDeviceOrHostAddressConstAMDX[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkDeviceOrHostAddressConstAMDX(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkDeviceOrHostAddressConstAMDX clone(Arena arena, VkDeviceOrHostAddressConstAMDX src) {
        VkDeviceOrHostAddressConstAMDX ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkDeviceOrHostAddressConstAMDX[] clone(Arena arena, VkDeviceOrHostAddressConstAMDX[] src) {
        VkDeviceOrHostAddressConstAMDX[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

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
}
