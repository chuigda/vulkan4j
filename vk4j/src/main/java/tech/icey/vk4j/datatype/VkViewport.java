package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.IPointer;
import tech.icey.vk4j.annotation.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.buffer.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import tech.icey.vk4j.NativeLayout;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

/// {@snippet lang=c :
/// typedef struct VkViewport {
///     float x;
///     float y;
///     float width;
///     float height;
///     float minDepth;
///     float maxDepth;
/// } VkViewport;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkViewport.html">VkViewport</a>
public record VkViewport(MemorySegment segment) implements IPointer {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_FLOAT.withName("x"),
        ValueLayout.JAVA_FLOAT.withName("y"),
        ValueLayout.JAVA_FLOAT.withName("width"),
        ValueLayout.JAVA_FLOAT.withName("height"),
        ValueLayout.JAVA_FLOAT.withName("minDepth"),
        ValueLayout.JAVA_FLOAT.withName("maxDepth")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$x = PathElement.groupElement("x");
    public static final PathElement PATH$y = PathElement.groupElement("y");
    public static final PathElement PATH$width = PathElement.groupElement("width");
    public static final PathElement PATH$height = PathElement.groupElement("height");
    public static final PathElement PATH$minDepth = PathElement.groupElement("minDepth");
    public static final PathElement PATH$maxDepth = PathElement.groupElement("maxDepth");

    public static final OfFloat LAYOUT$x = (OfFloat) LAYOUT.select(PATH$x);
    public static final OfFloat LAYOUT$y = (OfFloat) LAYOUT.select(PATH$y);
    public static final OfFloat LAYOUT$width = (OfFloat) LAYOUT.select(PATH$width);
    public static final OfFloat LAYOUT$height = (OfFloat) LAYOUT.select(PATH$height);
    public static final OfFloat LAYOUT$minDepth = (OfFloat) LAYOUT.select(PATH$minDepth);
    public static final OfFloat LAYOUT$maxDepth = (OfFloat) LAYOUT.select(PATH$maxDepth);

    public static final long OFFSET$x = LAYOUT.byteOffset(PATH$x);
    public static final long OFFSET$y = LAYOUT.byteOffset(PATH$y);
    public static final long OFFSET$width = LAYOUT.byteOffset(PATH$width);
    public static final long OFFSET$height = LAYOUT.byteOffset(PATH$height);
    public static final long OFFSET$minDepth = LAYOUT.byteOffset(PATH$minDepth);
    public static final long OFFSET$maxDepth = LAYOUT.byteOffset(PATH$maxDepth);

    public static final long SIZE$x = LAYOUT$x.byteSize();
    public static final long SIZE$y = LAYOUT$y.byteSize();
    public static final long SIZE$width = LAYOUT$width.byteSize();
    public static final long SIZE$height = LAYOUT$height.byteSize();
    public static final long SIZE$minDepth = LAYOUT$minDepth.byteSize();
    public static final long SIZE$maxDepth = LAYOUT$maxDepth.byteSize();

    public VkViewport(MemorySegment segment) {
        this.segment = segment;
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

    public static VkViewport allocate(Arena arena) {
        return new VkViewport(arena.allocate(LAYOUT));
    }
    
    public static VkViewport[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkViewport[] ret = new VkViewport[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkViewport(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
}
