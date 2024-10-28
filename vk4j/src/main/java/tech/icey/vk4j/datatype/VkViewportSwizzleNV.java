package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.panama.IPointer;
import tech.icey.panama.NativeLayout;
import tech.icey.panama.annotation.*;
import tech.icey.panama.buffer.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

/// {@snippet lang=c :
/// typedef struct VkViewportSwizzleNV {
///     VkViewportCoordinateSwizzleNV x;
///     VkViewportCoordinateSwizzleNV y;
///     VkViewportCoordinateSwizzleNV z;
///     VkViewportCoordinateSwizzleNV w;
/// } VkViewportSwizzleNV;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkViewportSwizzleNV.html">VkViewportSwizzleNV</a>
public record VkViewportSwizzleNV(MemorySegment segment) implements IPointer {
    public VkViewportSwizzleNV(MemorySegment segment) {
        this.segment = segment;
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

    public static VkViewportSwizzleNV allocate(Arena arena) {
        return new VkViewportSwizzleNV(arena.allocate(LAYOUT));
    }

    public static VkViewportSwizzleNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkViewportSwizzleNV[] ret = new VkViewportSwizzleNV[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkViewportSwizzleNV(segment.asSlice(i * SIZE, SIZE));
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
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("x"),
        ValueLayout.JAVA_INT.withName("y"),
        ValueLayout.JAVA_INT.withName("z"),
        ValueLayout.JAVA_INT.withName("w")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$x = PathElement.groupElement("x");
    public static final PathElement PATH$y = PathElement.groupElement("y");
    public static final PathElement PATH$z = PathElement.groupElement("z");
    public static final PathElement PATH$w = PathElement.groupElement("w");

    public static final OfInt LAYOUT$x = (OfInt) LAYOUT.select(PATH$x);
    public static final OfInt LAYOUT$y = (OfInt) LAYOUT.select(PATH$y);
    public static final OfInt LAYOUT$z = (OfInt) LAYOUT.select(PATH$z);
    public static final OfInt LAYOUT$w = (OfInt) LAYOUT.select(PATH$w);

    public static final long OFFSET$x = LAYOUT.byteOffset(PATH$x);
    public static final long OFFSET$y = LAYOUT.byteOffset(PATH$y);
    public static final long OFFSET$z = LAYOUT.byteOffset(PATH$z);
    public static final long OFFSET$w = LAYOUT.byteOffset(PATH$w);

    public static final long SIZE$x = LAYOUT$x.byteSize();
    public static final long SIZE$y = LAYOUT$y.byteSize();
    public static final long SIZE$z = LAYOUT$z.byteSize();
    public static final long SIZE$w = LAYOUT$w.byteSize();
}
