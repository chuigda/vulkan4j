package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.annotation.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.buffer.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import tech.icey.vk4j.NativeLayout;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

public record VkComponentMapping(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("r"),
        ValueLayout.JAVA_INT.withName("g"),
        ValueLayout.JAVA_INT.withName("b"),
        ValueLayout.JAVA_INT.withName("a")
    );

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
            ret[i] = new VkComponentMapping(segment.asSlice(i * LAYOUT.byteSize(), LAYOUT.byteSize()));
        }
        return ret;
    }
}
