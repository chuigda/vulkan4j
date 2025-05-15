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

public record VkComponentMapping(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$r = ValueLayout.JAVA_INT.withName("r");
    public static final OfInt LAYOUT$g = ValueLayout.JAVA_INT.withName("g");
    public static final OfInt LAYOUT$b = ValueLayout.JAVA_INT.withName("b");
    public static final OfInt LAYOUT$a = ValueLayout.JAVA_INT.withName("a");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$r, LAYOUT$g, LAYOUT$b, LAYOUT$a);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkComponentMapping allocate(Arena arena) {
        return new VkComponentMapping(arena.allocate(LAYOUT));
    }

    public static VkComponentMapping[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkComponentMapping[] ret = new VkComponentMapping[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkComponentMapping(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkComponentMapping clone(Arena arena, VkComponentMapping src) {
        VkComponentMapping ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkComponentMapping[] clone(Arena arena, VkComponentMapping[] src) {
        VkComponentMapping[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$r = PathElement.groupElement("PATH$r");
    public static final PathElement PATH$g = PathElement.groupElement("PATH$g");
    public static final PathElement PATH$b = PathElement.groupElement("PATH$b");
    public static final PathElement PATH$a = PathElement.groupElement("PATH$a");

    public static final long SIZE$r = LAYOUT$r.byteSize();
    public static final long SIZE$g = LAYOUT$g.byteSize();
    public static final long SIZE$b = LAYOUT$b.byteSize();
    public static final long SIZE$a = LAYOUT$a.byteSize();

    public static final long OFFSET$r = LAYOUT.byteOffset(PATH$r);
    public static final long OFFSET$g = LAYOUT.byteOffset(PATH$g);
    public static final long OFFSET$b = LAYOUT.byteOffset(PATH$b);
    public static final long OFFSET$a = LAYOUT.byteOffset(PATH$a);

    public @enumtype(VkComponentSwizzle.class) int r() {
        return segment.get(LAYOUT$r, OFFSET$r);
    }

    public void r(@enumtype(VkComponentSwizzle.class) int value) {
        segment.set(LAYOUT$r, OFFSET$r, value);
    }

    public @enumtype(VkComponentSwizzle.class) int g() {
        return segment.get(LAYOUT$g, OFFSET$g);
    }

    public void g(@enumtype(VkComponentSwizzle.class) int value) {
        segment.set(LAYOUT$g, OFFSET$g, value);
    }

    public @enumtype(VkComponentSwizzle.class) int b() {
        return segment.get(LAYOUT$b, OFFSET$b);
    }

    public void b(@enumtype(VkComponentSwizzle.class) int value) {
        segment.set(LAYOUT$b, OFFSET$b, value);
    }

    public @enumtype(VkComponentSwizzle.class) int a() {
        return segment.get(LAYOUT$a, OFFSET$a);
    }

    public void a(@enumtype(VkComponentSwizzle.class) int value) {
        segment.set(LAYOUT$a, OFFSET$a, value);
    }

}
/// dummy, not implemented yet
