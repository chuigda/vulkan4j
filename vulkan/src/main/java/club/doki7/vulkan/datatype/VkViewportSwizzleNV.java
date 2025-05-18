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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkViewportSwizzleNV.html"><code>VkViewportSwizzleNV</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkViewportSwizzleNV {
///     VkViewportCoordinateSwizzleNV x; // @link substring="VkViewportCoordinateSwizzleNV" target="VkViewportCoordinateSwizzleNV" @link substring="x" target="#x"
///     VkViewportCoordinateSwizzleNV y; // @link substring="VkViewportCoordinateSwizzleNV" target="VkViewportCoordinateSwizzleNV" @link substring="y" target="#y"
///     VkViewportCoordinateSwizzleNV z; // @link substring="VkViewportCoordinateSwizzleNV" target="VkViewportCoordinateSwizzleNV" @link substring="z" target="#z"
///     VkViewportCoordinateSwizzleNV w; // @link substring="VkViewportCoordinateSwizzleNV" target="VkViewportCoordinateSwizzleNV" @link substring="w" target="#w"
/// } VkViewportSwizzleNV;
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkViewportSwizzleNV.html"><code>VkViewportSwizzleNV</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkViewportSwizzleNV(@NotNull MemorySegment segment) implements IPointer {
    public static VkViewportSwizzleNV allocate(Arena arena) {
        return new VkViewportSwizzleNV(arena.allocate(LAYOUT));
    }

    public static VkViewportSwizzleNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkViewportSwizzleNV[] ret = new VkViewportSwizzleNV[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkViewportSwizzleNV(segment.asSlice(i * BYTES, BYTES));
        }
        return ret;
    }

    public static VkViewportSwizzleNV clone(Arena arena, VkViewportSwizzleNV src) {
        VkViewportSwizzleNV ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkViewportSwizzleNV[] clone(Arena arena, VkViewportSwizzleNV[] src) {
        VkViewportSwizzleNV[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public @enumtype(VkViewportCoordinateSwizzleNV.class) int x() {
        return segment.get(LAYOUT$x, OFFSET$x);
    }

    public void x(@enumtype(VkViewportCoordinateSwizzleNV.class) int value) {
        segment.set(LAYOUT$x, OFFSET$x, value);
    }

    public @enumtype(VkViewportCoordinateSwizzleNV.class) int y() {
        return segment.get(LAYOUT$y, OFFSET$y);
    }

    public void y(@enumtype(VkViewportCoordinateSwizzleNV.class) int value) {
        segment.set(LAYOUT$y, OFFSET$y, value);
    }

    public @enumtype(VkViewportCoordinateSwizzleNV.class) int z() {
        return segment.get(LAYOUT$z, OFFSET$z);
    }

    public void z(@enumtype(VkViewportCoordinateSwizzleNV.class) int value) {
        segment.set(LAYOUT$z, OFFSET$z, value);
    }

    public @enumtype(VkViewportCoordinateSwizzleNV.class) int w() {
        return segment.get(LAYOUT$w, OFFSET$w);
    }

    public void w(@enumtype(VkViewportCoordinateSwizzleNV.class) int value) {
        segment.set(LAYOUT$w, OFFSET$w, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("x"),
        ValueLayout.JAVA_INT.withName("y"),
        ValueLayout.JAVA_INT.withName("z"),
        ValueLayout.JAVA_INT.withName("w")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$x = PathElement.groupElement("PATH$x");
    public static final PathElement PATH$y = PathElement.groupElement("PATH$y");
    public static final PathElement PATH$z = PathElement.groupElement("PATH$z");
    public static final PathElement PATH$w = PathElement.groupElement("PATH$w");

    public static final OfInt LAYOUT$x = (OfInt) LAYOUT.select(PATH$x);
    public static final OfInt LAYOUT$y = (OfInt) LAYOUT.select(PATH$y);
    public static final OfInt LAYOUT$z = (OfInt) LAYOUT.select(PATH$z);
    public static final OfInt LAYOUT$w = (OfInt) LAYOUT.select(PATH$w);

    public static final long SIZE$x = LAYOUT$x.byteSize();
    public static final long SIZE$y = LAYOUT$y.byteSize();
    public static final long SIZE$z = LAYOUT$z.byteSize();
    public static final long SIZE$w = LAYOUT$w.byteSize();

    public static final long OFFSET$x = LAYOUT.byteOffset(PATH$x);
    public static final long OFFSET$y = LAYOUT.byteOffset(PATH$y);
    public static final long OFFSET$z = LAYOUT.byteOffset(PATH$z);
    public static final long OFFSET$w = LAYOUT.byteOffset(PATH$w);
}
