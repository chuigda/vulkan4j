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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkViewport.html">VkViewport</a>
@ValueBasedCandidate
public record VkViewport(@NotNull MemorySegment segment) implements IPointer {
    public static final OfFloat LAYOUT$x = ValueLayout.JAVA_FLOAT.withName("x");
    public static final OfFloat LAYOUT$y = ValueLayout.JAVA_FLOAT.withName("y");
    public static final OfFloat LAYOUT$width = ValueLayout.JAVA_FLOAT.withName("width");
    public static final OfFloat LAYOUT$height = ValueLayout.JAVA_FLOAT.withName("height");
    public static final OfFloat LAYOUT$minDepth = ValueLayout.JAVA_FLOAT.withName("minDepth");
    public static final OfFloat LAYOUT$maxDepth = ValueLayout.JAVA_FLOAT.withName("maxDepth");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$x, LAYOUT$y, LAYOUT$width, LAYOUT$height, LAYOUT$minDepth, LAYOUT$maxDepth);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkViewport allocate(Arena arena) {
        return new VkViewport(arena.allocate(LAYOUT));
    }

    public static VkViewport[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkViewport[] ret = new VkViewport[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkViewport(segment.asSlice(i * SIZE, SIZE));
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

    public static final PathElement PATH$x = PathElement.groupElement("PATH$x");
    public static final PathElement PATH$y = PathElement.groupElement("PATH$y");
    public static final PathElement PATH$width = PathElement.groupElement("PATH$width");
    public static final PathElement PATH$height = PathElement.groupElement("PATH$height");
    public static final PathElement PATH$minDepth = PathElement.groupElement("PATH$minDepth");
    public static final PathElement PATH$maxDepth = PathElement.groupElement("PATH$maxDepth");

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

}
