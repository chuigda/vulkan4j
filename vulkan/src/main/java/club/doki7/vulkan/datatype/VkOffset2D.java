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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkOffset2D.html"><code>VkOffset2D</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkOffset2D {
///     int32_t x; // @link substring="x" target="#x"
///     int32_t y; // @link substring="y" target="#y"
/// } VkOffset2D;
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkOffset2D.html"><code>VkOffset2D</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkOffset2D(@NotNull MemorySegment segment) implements IPointer {
    public static VkOffset2D allocate(Arena arena) {
        return new VkOffset2D(arena.allocate(LAYOUT));
    }

    public static VkOffset2D[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkOffset2D[] ret = new VkOffset2D[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkOffset2D(segment.asSlice(i * BYTES, BYTES));
        }
        return ret;
    }

    public static VkOffset2D clone(Arena arena, VkOffset2D src) {
        VkOffset2D ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkOffset2D[] clone(Arena arena, VkOffset2D[] src) {
        VkOffset2D[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public int x() {
        return segment.get(LAYOUT$x, OFFSET$x);
    }

    public void x(int value) {
        segment.set(LAYOUT$x, OFFSET$x, value);
    }

    public int y() {
        return segment.get(LAYOUT$y, OFFSET$y);
    }

    public void y(int value) {
        segment.set(LAYOUT$y, OFFSET$y, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("x"),
        ValueLayout.JAVA_INT.withName("y")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$x = PathElement.groupElement("PATH$x");
    public static final PathElement PATH$y = PathElement.groupElement("PATH$y");

    public static final OfInt LAYOUT$x = (OfInt) LAYOUT.select(PATH$x);
    public static final OfInt LAYOUT$y = (OfInt) LAYOUT.select(PATH$y);

    public static final long SIZE$x = LAYOUT$x.byteSize();
    public static final long SIZE$y = LAYOUT$y.byteSize();

    public static final long OFFSET$x = LAYOUT.byteOffset(PATH$x);
    public static final long OFFSET$y = LAYOUT.byteOffset(PATH$y);
}
