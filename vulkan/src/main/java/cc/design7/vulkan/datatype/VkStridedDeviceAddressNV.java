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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkStridedDeviceAddressNV.html">VkStridedDeviceAddressNV</a>
@ValueBasedCandidate
public record VkStridedDeviceAddressNV(@NotNull MemorySegment segment) implements IPointer {
    public static final OfLong LAYOUT$startAddress = ValueLayout.JAVA_LONG.withName("startAddress");
    public static final OfLong LAYOUT$strideInBytes = ValueLayout.JAVA_LONG.withName("strideInBytes");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$startAddress, LAYOUT$strideInBytes);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkStridedDeviceAddressNV allocate(Arena arena) {
        return new VkStridedDeviceAddressNV(arena.allocate(LAYOUT));
    }

    public static VkStridedDeviceAddressNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkStridedDeviceAddressNV[] ret = new VkStridedDeviceAddressNV[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkStridedDeviceAddressNV(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkStridedDeviceAddressNV clone(Arena arena, VkStridedDeviceAddressNV src) {
        VkStridedDeviceAddressNV ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkStridedDeviceAddressNV[] clone(Arena arena, VkStridedDeviceAddressNV[] src) {
        VkStridedDeviceAddressNV[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$startAddress = PathElement.groupElement("PATH$startAddress");
    public static final PathElement PATH$strideInBytes = PathElement.groupElement("PATH$strideInBytes");

    public static final long SIZE$startAddress = LAYOUT$startAddress.byteSize();
    public static final long SIZE$strideInBytes = LAYOUT$strideInBytes.byteSize();

    public static final long OFFSET$startAddress = LAYOUT.byteOffset(PATH$startAddress);
    public static final long OFFSET$strideInBytes = LAYOUT.byteOffset(PATH$strideInBytes);

    public @unsigned long startAddress() {
        return segment.get(LAYOUT$startAddress, OFFSET$startAddress);
    }

    public void startAddress(@unsigned long value) {
        segment.set(LAYOUT$startAddress, OFFSET$startAddress, value);
    }

    public @unsigned long strideInBytes() {
        return segment.get(LAYOUT$strideInBytes, OFFSET$strideInBytes);
    }

    public void strideInBytes(@unsigned long value) {
        segment.set(LAYOUT$strideInBytes, OFFSET$strideInBytes, value);
    }

}
