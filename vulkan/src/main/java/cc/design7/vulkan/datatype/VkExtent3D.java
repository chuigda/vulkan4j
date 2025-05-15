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

public record VkExtent3D(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$width = ValueLayout.JAVA_INT.withName("width");
    public static final OfInt LAYOUT$height = ValueLayout.JAVA_INT.withName("height");
    public static final OfInt LAYOUT$depth = ValueLayout.JAVA_INT.withName("depth");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$width, LAYOUT$height, LAYOUT$depth);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkExtent3D allocate(Arena arena) {
        return new VkExtent3D(arena.allocate(LAYOUT));
    }

    public static VkExtent3D[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkExtent3D[] ret = new VkExtent3D[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkExtent3D(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkExtent3D clone(Arena arena, VkExtent3D src) {
        VkExtent3D ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkExtent3D[] clone(Arena arena, VkExtent3D[] src) {
        VkExtent3D[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$width = PathElement.groupElement("PATH$width");
    public static final PathElement PATH$height = PathElement.groupElement("PATH$height");
    public static final PathElement PATH$depth = PathElement.groupElement("PATH$depth");

    public static final long SIZE$width = LAYOUT$width.byteSize();
    public static final long SIZE$height = LAYOUT$height.byteSize();
    public static final long SIZE$depth = LAYOUT$depth.byteSize();

    public static final long OFFSET$width = LAYOUT.byteOffset(PATH$width);
    public static final long OFFSET$height = LAYOUT.byteOffset(PATH$height);
    public static final long OFFSET$depth = LAYOUT.byteOffset(PATH$depth);

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

    public @unsigned int depth() {
        return segment.get(LAYOUT$depth, OFFSET$depth);
    }

    public void depth(@unsigned int value) {
        segment.set(LAYOUT$depth, OFFSET$depth, value);
    }

}
/// dummy, not implemented yet
