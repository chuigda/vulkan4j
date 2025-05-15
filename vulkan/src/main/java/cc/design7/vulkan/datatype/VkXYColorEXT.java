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

public record VkXYColorEXT(@NotNull MemorySegment segment) implements IPointer {
    public static final OfFloat LAYOUT$x = ValueLayout.JAVA_FLOAT.withName("x");
    public static final OfFloat LAYOUT$y = ValueLayout.JAVA_FLOAT.withName("y");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$x, LAYOUT$y);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkXYColorEXT allocate(Arena arena) {
        return new VkXYColorEXT(arena.allocate(LAYOUT));
    }

    public static VkXYColorEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkXYColorEXT[] ret = new VkXYColorEXT[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkXYColorEXT(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkXYColorEXT clone(Arena arena, VkXYColorEXT src) {
        VkXYColorEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkXYColorEXT[] clone(Arena arena, VkXYColorEXT[] src) {
        VkXYColorEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$x = PathElement.groupElement("PATH$x");
    public static final PathElement PATH$y = PathElement.groupElement("PATH$y");

    public static final long SIZE$x = LAYOUT$x.byteSize();
    public static final long SIZE$y = LAYOUT$y.byteSize();

    public static final long OFFSET$x = LAYOUT.byteOffset(PATH$x);
    public static final long OFFSET$y = LAYOUT.byteOffset(PATH$y);

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

}
/// dummy, not implemented yet
