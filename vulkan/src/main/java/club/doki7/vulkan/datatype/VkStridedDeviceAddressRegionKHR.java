package club.doki7.vulkan.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import club.doki7.ffm.IPointer;
import club.doki7.ffm.NativeLayout;
import club.doki7.ffm.annotation.*;
import club.doki7.ffm.ptr.*;
import club.doki7.vulkan.bitmask.*;
import club.doki7.vulkan.handle.*;
import club.doki7.vulkan.enumtype.*;
import static club.doki7.vulkan.VkConstants.*;

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkStridedDeviceAddressRegionKHR.html"><code>VkStridedDeviceAddressRegionKHR</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkStridedDeviceAddressRegionKHR {
///     VkDeviceAddress deviceAddress; // optional // @link substring="deviceAddress" target="#deviceAddress"
///     VkDeviceSize stride; // @link substring="stride" target="#stride"
///     VkDeviceSize size; // @link substring="size" target="#size"
/// } VkStridedDeviceAddressRegionKHR;
/// }
///
/// ## Contracts
///
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to)
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkStridedDeviceAddressRegionKHR.html"><code>VkStridedDeviceAddressRegionKHR</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkStridedDeviceAddressRegionKHR(@NotNull MemorySegment segment) implements IPointer {
    public static VkStridedDeviceAddressRegionKHR allocate(Arena arena) {
        return new VkStridedDeviceAddressRegionKHR(arena.allocate(LAYOUT));
    }

    public static VkStridedDeviceAddressRegionKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkStridedDeviceAddressRegionKHR[] ret = new VkStridedDeviceAddressRegionKHR[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkStridedDeviceAddressRegionKHR(segment.asSlice(i * BYTES, BYTES));
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

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_LONG.withName("deviceAddress"),
        ValueLayout.JAVA_LONG.withName("stride"),
        ValueLayout.JAVA_LONG.withName("size")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$deviceAddress = PathElement.groupElement("PATH$deviceAddress");
    public static final PathElement PATH$stride = PathElement.groupElement("PATH$stride");
    public static final PathElement PATH$size = PathElement.groupElement("PATH$size");

    public static final OfLong LAYOUT$deviceAddress = (OfLong) LAYOUT.select(PATH$deviceAddress);
    public static final OfLong LAYOUT$stride = (OfLong) LAYOUT.select(PATH$stride);
    public static final OfLong LAYOUT$size = (OfLong) LAYOUT.select(PATH$size);

    public static final long SIZE$deviceAddress = LAYOUT$deviceAddress.byteSize();
    public static final long SIZE$stride = LAYOUT$stride.byteSize();
    public static final long SIZE$size = LAYOUT$size.byteSize();

    public static final long OFFSET$deviceAddress = LAYOUT.byteOffset(PATH$deviceAddress);
    public static final long OFFSET$stride = LAYOUT.byteOffset(PATH$stride);
    public static final long OFFSET$size = LAYOUT.byteOffset(PATH$size);
}
