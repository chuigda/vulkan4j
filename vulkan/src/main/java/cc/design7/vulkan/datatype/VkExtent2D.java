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
import cc.design7.vulkan.handle.*;
import cc.design7.vulkan.enumtype.*;
import static cc.design7.vulkan.VkConstants.*;

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkExtent2D.html"><code>VkExtent2D</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkExtent2D {
///     uint32_t width;
///     uint32_t height;
/// } VkExtent2D;
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkExtent2D.html"><code>VkExtent2D</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkExtent2D(@NotNull MemorySegment segment) implements IPointer {
    public static VkExtent2D allocate(Arena arena) {
        VkExtent2D ret = new VkExtent2D(arena.allocate(LAYOUT));
        return ret;
    }

    public static VkExtent2D[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkExtent2D[] ret = new VkExtent2D[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkExtent2D(segment.asSlice(i * BYTES, BYTES));
        }
        return ret;
    }

    public static VkExtent2D clone(Arena arena, VkExtent2D src) {
        VkExtent2D ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkExtent2D[] clone(Arena arena, VkExtent2D[] src) {
        VkExtent2D[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public @unsigned int width() {
        return segment.get(LAYOUT$width, OFFSET$width);
    }

    public void width(@unsigned int value) {
        segment.set(LAYOUT$width, OFFSET$width, value);
    }

    public @unsigned int height() {
        return segment.get(LAYOUT$height, OFFSET$height);
    }

    public void height(@unsigned int value) {
        segment.set(LAYOUT$height, OFFSET$height, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("width"),
        ValueLayout.JAVA_INT.withName("height")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$width = PathElement.groupElement("PATH$width");
    public static final PathElement PATH$height = PathElement.groupElement("PATH$height");

    public static final OfInt LAYOUT$width = (OfInt) LAYOUT.select(PATH$width);
    public static final OfInt LAYOUT$height = (OfInt) LAYOUT.select(PATH$height);

    public static final long SIZE$width = LAYOUT$width.byteSize();
    public static final long SIZE$height = LAYOUT$height.byteSize();

    public static final long OFFSET$width = LAYOUT.byteOffset(PATH$width);
    public static final long OFFSET$height = LAYOUT.byteOffset(PATH$height);
}
