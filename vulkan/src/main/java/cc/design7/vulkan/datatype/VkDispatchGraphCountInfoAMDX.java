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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkDispatchGraphCountInfoAMDX.html"><code>VkDispatchGraphCountInfoAMDX</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkDispatchGraphCountInfoAMDX {
///     uint32_t count; // optional
///     VkDeviceOrHostAddressConstAMDX infos;
///     uint64_t stride;
/// } VkDispatchGraphCountInfoAMDX;
/// }
///
/// ## Contracts
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to)
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkDispatchGraphCountInfoAMDX.html"><code>VkDispatchGraphCountInfoAMDX</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkDispatchGraphCountInfoAMDX(@NotNull MemorySegment segment) implements IPointer {
    public static VkDispatchGraphCountInfoAMDX allocate(Arena arena) {
        VkDispatchGraphCountInfoAMDX ret = new VkDispatchGraphCountInfoAMDX(arena.allocate(LAYOUT));
        return ret;
    }

    public static VkDispatchGraphCountInfoAMDX[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkDispatchGraphCountInfoAMDX[] ret = new VkDispatchGraphCountInfoAMDX[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkDispatchGraphCountInfoAMDX(segment.asSlice(i * BYTES, BYTES));
        }
        return ret;
    }

    public static VkDispatchGraphCountInfoAMDX clone(Arena arena, VkDispatchGraphCountInfoAMDX src) {
        VkDispatchGraphCountInfoAMDX ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkDispatchGraphCountInfoAMDX[] clone(Arena arena, VkDispatchGraphCountInfoAMDX[] src) {
        VkDispatchGraphCountInfoAMDX[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public @unsigned int count() {
        return segment.get(LAYOUT$count, OFFSET$count);
    }

    public void count(@unsigned int value) {
        segment.set(LAYOUT$count, OFFSET$count, value);
    }

    public VkDeviceOrHostAddressConstAMDX infos() {
        return new VkDeviceOrHostAddressConstAMDX(segment.asSlice(OFFSET$infos, LAYOUT$infos));
    }

    public void infos(VkDeviceOrHostAddressConstAMDX value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$infos, SIZE$infos);
    }

    public @unsigned long stride() {
        return segment.get(LAYOUT$stride, OFFSET$stride);
    }

    public void stride(@unsigned long value) {
        segment.set(LAYOUT$stride, OFFSET$stride, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("count"),
        VkDeviceOrHostAddressConstAMDX.LAYOUT.withName("infos"),
        ValueLayout.JAVA_LONG.withName("stride")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$count = PathElement.groupElement("PATH$count");
    public static final PathElement PATH$infos = PathElement.groupElement("PATH$infos");
    public static final PathElement PATH$stride = PathElement.groupElement("PATH$stride");

    public static final OfInt LAYOUT$count = (OfInt) LAYOUT.select(PATH$count);
    public static final StructLayout LAYOUT$infos = (StructLayout) LAYOUT.select(PATH$infos);
    public static final OfLong LAYOUT$stride = (OfLong) LAYOUT.select(PATH$stride);

    public static final long SIZE$count = LAYOUT$count.byteSize();
    public static final long SIZE$infos = LAYOUT$infos.byteSize();
    public static final long SIZE$stride = LAYOUT$stride.byteSize();

    public static final long OFFSET$count = LAYOUT.byteOffset(PATH$count);
    public static final long OFFSET$infos = LAYOUT.byteOffset(PATH$infos);
    public static final long OFFSET$stride = LAYOUT.byteOffset(PATH$stride);
}
