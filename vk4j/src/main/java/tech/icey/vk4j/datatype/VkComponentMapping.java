package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import org.jetbrains.annotations.Nullable;
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
/// typedef struct VkComponentMapping {
///     VkComponentSwizzle r;
///     VkComponentSwizzle g;
///     VkComponentSwizzle b;
///     VkComponentSwizzle a;
/// } VkComponentMapping;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkComponentMapping.html">VkComponentMapping</a>
public record VkComponentMapping(MemorySegment segment) implements IPointer {
    public VkComponentMapping(MemorySegment segment) {
        this.segment = segment;
    }

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

    public static VkComponentMapping allocate(Arena arena) {
        return new VkComponentMapping(arena.allocate(LAYOUT));
    }

    public static VkComponentMapping[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkComponentMapping[] ret = new VkComponentMapping[count];
        for (int i = 0; i < count; i++) {
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
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("r"),
        ValueLayout.JAVA_INT.withName("g"),
        ValueLayout.JAVA_INT.withName("b"),
        ValueLayout.JAVA_INT.withName("a")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$r = PathElement.groupElement("r");
    public static final PathElement PATH$g = PathElement.groupElement("g");
    public static final PathElement PATH$b = PathElement.groupElement("b");
    public static final PathElement PATH$a = PathElement.groupElement("a");

    public static final OfInt LAYOUT$r = (OfInt) LAYOUT.select(PATH$r);
    public static final OfInt LAYOUT$g = (OfInt) LAYOUT.select(PATH$g);
    public static final OfInt LAYOUT$b = (OfInt) LAYOUT.select(PATH$b);
    public static final OfInt LAYOUT$a = (OfInt) LAYOUT.select(PATH$a);

    public static final long OFFSET$r = LAYOUT.byteOffset(PATH$r);
    public static final long OFFSET$g = LAYOUT.byteOffset(PATH$g);
    public static final long OFFSET$b = LAYOUT.byteOffset(PATH$b);
    public static final long OFFSET$a = LAYOUT.byteOffset(PATH$a);

    public static final long SIZE$r = LAYOUT$r.byteSize();
    public static final long SIZE$g = LAYOUT$g.byteSize();
    public static final long SIZE$b = LAYOUT$b.byteSize();
    public static final long SIZE$a = LAYOUT$a.byteSize();
}
