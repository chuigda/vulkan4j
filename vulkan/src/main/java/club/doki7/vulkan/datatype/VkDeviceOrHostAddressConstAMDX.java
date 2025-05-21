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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkDeviceOrHostAddressConstAMDX.html"><code>VkDeviceOrHostAddressConstAMDX</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkDeviceOrHostAddressConstAMDX {
///     VkDeviceAddress deviceAddress; // @link substring="deviceAddress" target="#deviceAddress"
///     void const* hostAddress; // @link substring="hostAddress" target="#hostAddress"
/// } VkDeviceOrHostAddressConstAMDX;
/// }
///
/// ## Contracts
///
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkDeviceOrHostAddressConstAMDX.html"><code>VkDeviceOrHostAddressConstAMDX</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkDeviceOrHostAddressConstAMDX(@NotNull MemorySegment segment) implements IPointer {
    public static VkDeviceOrHostAddressConstAMDX allocate(Arena arena) {
        return new VkDeviceOrHostAddressConstAMDX(arena.allocate(LAYOUT));
    }

    public static VkDeviceOrHostAddressConstAMDX[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkDeviceOrHostAddressConstAMDX[] ret = new VkDeviceOrHostAddressConstAMDX[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkDeviceOrHostAddressConstAMDX(segment.asSlice(i * BYTES, BYTES));
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

    public @pointer(comment="void*") MemorySegment hostAddress() {
        return segment.get(LAYOUT$hostAddress, OFFSET$hostAddress);
    }

    public void hostAddress(@pointer(comment="void*") MemorySegment value) {
        segment.set(LAYOUT$hostAddress, OFFSET$hostAddress, value);
    }

    public void hostAddress(@Nullable IPointer pointer) {
        hostAddress(pointer != null ? pointer.segment() : MemorySegment.NULL);
    }

    public static final UnionLayout LAYOUT = NativeLayout.unionLayout(
        ValueLayout.JAVA_LONG.withName("deviceAddress"),
        ValueLayout.ADDRESS.withName("hostAddress")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$deviceAddress = PathElement.groupElement("deviceAddress");
    public static final PathElement PATH$hostAddress = PathElement.groupElement("hostAddress");

    public static final OfLong LAYOUT$deviceAddress = (OfLong) LAYOUT.select(PATH$deviceAddress);
    public static final AddressLayout LAYOUT$hostAddress = (AddressLayout) LAYOUT.select(PATH$hostAddress);

    public static final long SIZE$deviceAddress = LAYOUT$deviceAddress.byteSize();
    public static final long SIZE$hostAddress = LAYOUT$hostAddress.byteSize();

    public static final long OFFSET$deviceAddress = LAYOUT.byteOffset(PATH$deviceAddress);
    public static final long OFFSET$hostAddress = LAYOUT.byteOffset(PATH$hostAddress);
}
