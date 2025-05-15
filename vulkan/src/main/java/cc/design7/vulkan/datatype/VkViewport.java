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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkViewport.html"><code>VkViewport</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkViewport {
///     float x;
///     float y;
///     float width;
///     float height;
///     float minDepth;
///     float maxDepth;
/// } VkViewport;
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkViewport.html"><code>VkViewport</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkViewport(@NotNull MemorySegment segment) implements IPointer {
    public static VkViewport allocate(Arena arena) {
        VkViewport ret = new VkViewport(arena.allocate(LAYOUT));
        return ret;
    }

    public static VkViewport[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkViewport[] ret = new VkViewport[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkViewport(segment.asSlice(i * BYTES, BYTES));
        }
        return ret;
    }

    public static VkViewport clone(Arena arena, VkViewport src) {
        VkViewport ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkViewport[] clone(Arena arena, VkViewport[] src) {
        VkViewport[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public float x() {
        return segment.get(LAYOUT$x, OFFSET$x);
    }

    public void x(float value) {
        segment.set(LAYOUT$x, OFFSET$x, value);
    }

    public float y() {
        return segment.get(LAYOUT$y, OFFSET$y);
    }

    public void y(float value) {
        segment.set(LAYOUT$y, OFFSET$y, value);
    }

    public float width() {
        return segment.get(LAYOUT$width, OFFSET$width);
    }

    public void width(float value) {
        segment.set(LAYOUT$width, OFFSET$width, value);
    }

    public float height() {
        return segment.get(LAYOUT$height, OFFSET$height);
    }

    public void height(float value) {
        segment.set(LAYOUT$height, OFFSET$height, value);
    }

    public float minDepth() {
        return segment.get(LAYOUT$minDepth, OFFSET$minDepth);
    }

    public void minDepth(float value) {
        segment.set(LAYOUT$minDepth, OFFSET$minDepth, value);
    }

    public float maxDepth() {
        return segment.get(LAYOUT$maxDepth, OFFSET$maxDepth);
    }

    public void maxDepth(float value) {
        segment.set(LAYOUT$maxDepth, OFFSET$maxDepth, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_FLOAT.withName("x"),
        ValueLayout.JAVA_FLOAT.withName("y"),
        ValueLayout.JAVA_FLOAT.withName("width"),
        ValueLayout.JAVA_FLOAT.withName("height"),
        ValueLayout.JAVA_FLOAT.withName("minDepth"),
        ValueLayout.JAVA_FLOAT.withName("maxDepth")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$x = PathElement.groupElement("PATH$x");
    public static final PathElement PATH$y = PathElement.groupElement("PATH$y");
    public static final PathElement PATH$width = PathElement.groupElement("PATH$width");
    public static final PathElement PATH$height = PathElement.groupElement("PATH$height");
    public static final PathElement PATH$minDepth = PathElement.groupElement("PATH$minDepth");
    public static final PathElement PATH$maxDepth = PathElement.groupElement("PATH$maxDepth");

    public static final OfFloat LAYOUT$x = (OfFloat) LAYOUT.select(PATH$x);
    public static final OfFloat LAYOUT$y = (OfFloat) LAYOUT.select(PATH$y);
    public static final OfFloat LAYOUT$width = (OfFloat) LAYOUT.select(PATH$width);
    public static final OfFloat LAYOUT$height = (OfFloat) LAYOUT.select(PATH$height);
    public static final OfFloat LAYOUT$minDepth = (OfFloat) LAYOUT.select(PATH$minDepth);
    public static final OfFloat LAYOUT$maxDepth = (OfFloat) LAYOUT.select(PATH$maxDepth);

    public static final long SIZE$x = LAYOUT$x.byteSize();
    public static final long SIZE$y = LAYOUT$y.byteSize();
    public static final long SIZE$width = LAYOUT$width.byteSize();
    public static final long SIZE$height = LAYOUT$height.byteSize();
    public static final long SIZE$minDepth = LAYOUT$minDepth.byteSize();
    public static final long SIZE$maxDepth = LAYOUT$maxDepth.byteSize();

    public static final long OFFSET$x = LAYOUT.byteOffset(PATH$x);
    public static final long OFFSET$y = LAYOUT.byteOffset(PATH$y);
    public static final long OFFSET$width = LAYOUT.byteOffset(PATH$width);
    public static final long OFFSET$height = LAYOUT.byteOffset(PATH$height);
    public static final long OFFSET$minDepth = LAYOUT.byteOffset(PATH$minDepth);
    public static final long OFFSET$maxDepth = LAYOUT.byteOffset(PATH$maxDepth);
}
