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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkDeviceOrHostAddressKHR.html">VkDeviceOrHostAddressKHR</a>
@ValueBasedCandidate
public record VkDeviceOrHostAddressKHR(@NotNull MemorySegment segment) implements IPointer {
    public static final OfLong LAYOUT$deviceAddress = ValueLayout.JAVA_LONG.withName("deviceAddress");
    public static final AddressLayout LAYOUT$hostAddress = ValueLayout.ADDRESS.withName("hostAddress");

    public static final MemoryLayout LAYOUT = NativeLayout.unionLayout(LAYOUT$deviceAddress, LAYOUT$hostAddress);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkDeviceOrHostAddressKHR allocate(Arena arena) {
        return new VkDeviceOrHostAddressKHR(arena.allocate(LAYOUT));
    }

    public static VkDeviceOrHostAddressKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkDeviceOrHostAddressKHR[] ret = new VkDeviceOrHostAddressKHR[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkDeviceOrHostAddressKHR(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkDeviceOrHostAddressKHR clone(Arena arena, VkDeviceOrHostAddressKHR src) {
        VkDeviceOrHostAddressKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkDeviceOrHostAddressKHR[] clone(Arena arena, VkDeviceOrHostAddressKHR[] src) {
        VkDeviceOrHostAddressKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$deviceAddress = PathElement.groupElement("PATH$deviceAddress");
    public static final PathElement PATH$hostAddress = PathElement.groupElement("PATH$hostAddress");

    public static final long SIZE$deviceAddress = LAYOUT$deviceAddress.byteSize();
    public static final long SIZE$hostAddress = LAYOUT$hostAddress.byteSize();

    public static final long OFFSET$deviceAddress = LAYOUT.byteOffset(PATH$deviceAddress);
    public static final long OFFSET$hostAddress = LAYOUT.byteOffset(PATH$hostAddress);

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

}
