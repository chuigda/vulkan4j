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

public record VkMicromapUsageEXT(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("count"),
        ValueLayout.JAVA_INT.withName("subdivisionLevel"),
        ValueLayout.JAVA_INT.withName("format")
    );

    public static final PathElement PATH$count = PathElement.groupElement("count");
    public static final PathElement PATH$subdivisionLevel = PathElement.groupElement("subdivisionLevel");
    public static final PathElement PATH$format = PathElement.groupElement("format");

    public static final OfInt LAYOUT$count = (OfInt) LAYOUT.select(PATH$count);
    public static final OfInt LAYOUT$subdivisionLevel = (OfInt) LAYOUT.select(PATH$subdivisionLevel);
    public static final OfInt LAYOUT$format = (OfInt) LAYOUT.select(PATH$format);

    public static final long OFFSET$count = LAYOUT.byteOffset(PATH$count);
    public static final long OFFSET$subdivisionLevel = LAYOUT.byteOffset(PATH$subdivisionLevel);
    public static final long OFFSET$format = LAYOUT.byteOffset(PATH$format);

    public VkMicromapUsageEXT(MemorySegment segment) {
        this.segment = segment;
    }

    public @unsigned int count() {
        return segment.get(LAYOUT$count, OFFSET$count);
    }

    public void count(@unsigned int value) {
        segment.set(LAYOUT$count, OFFSET$count, value);
    }

    public @unsigned int subdivisionLevel() {
        return segment.get(LAYOUT$subdivisionLevel, OFFSET$subdivisionLevel);
    }

    public void subdivisionLevel(@unsigned int value) {
        segment.set(LAYOUT$subdivisionLevel, OFFSET$subdivisionLevel, value);
    }

    public @unsigned int format() {
        return segment.get(LAYOUT$format, OFFSET$format);
    }

    public void format(@unsigned int value) {
        segment.set(LAYOUT$format, OFFSET$format, value);
    }

    public static VkMicromapUsageEXT allocate(Arena arena) {
        return new VkMicromapUsageEXT(arena.allocate(LAYOUT));
    }
    
    public static VkMicromapUsageEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkMicromapUsageEXT[] ret = new VkMicromapUsageEXT[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkMicromapUsageEXT(segment.asSlice(i * LAYOUT.byteSize(), LAYOUT.byteSize()));
        }
        return ret;
    }
}
