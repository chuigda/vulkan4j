package tech.icey.vk4j.datatype;

import tech.icey.vk4j.NativeLayout;
import tech.icey.vk4j.annotation.unsigned;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;

import static java.lang.foreign.ValueLayout.OfByte;
import static java.lang.foreign.ValueLayout.PathElement;

public record VkConformanceVersion(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_BYTE.withName("major"),
        ValueLayout.JAVA_BYTE.withName("minor"),
        ValueLayout.JAVA_BYTE.withName("subminor"),
        ValueLayout.JAVA_BYTE.withName("patch")
    );

    public static final PathElement PATH$major = PathElement.groupElement("major");
    public static final PathElement PATH$minor = PathElement.groupElement("minor");
    public static final PathElement PATH$subminor = PathElement.groupElement("subminor");
    public static final PathElement PATH$patch = PathElement.groupElement("patch");

    public static final OfByte LAYOUT$major = (OfByte) LAYOUT.select(PATH$major);
    public static final OfByte LAYOUT$minor = (OfByte) LAYOUT.select(PATH$minor);
    public static final OfByte LAYOUT$subminor = (OfByte) LAYOUT.select(PATH$subminor);
    public static final OfByte LAYOUT$patch = (OfByte) LAYOUT.select(PATH$patch);

    public static final long OFFSET$major = LAYOUT.byteOffset(PATH$major);
    public static final long OFFSET$minor = LAYOUT.byteOffset(PATH$minor);
    public static final long OFFSET$subminor = LAYOUT.byteOffset(PATH$subminor);
    public static final long OFFSET$patch = LAYOUT.byteOffset(PATH$patch);

    public VkConformanceVersion(MemorySegment segment) {
        this.segment = segment;
    }

    public @unsigned byte major() {
        return segment.get(LAYOUT$major, OFFSET$major);
    }

    public void major(@unsigned byte value) {
        segment.set(LAYOUT$major, OFFSET$major, value);
    }

    public @unsigned byte minor() {
        return segment.get(LAYOUT$minor, OFFSET$minor);
    }

    public void minor(@unsigned byte value) {
        segment.set(LAYOUT$minor, OFFSET$minor, value);
    }

    public @unsigned byte subminor() {
        return segment.get(LAYOUT$subminor, OFFSET$subminor);
    }

    public void subminor(@unsigned byte value) {
        segment.set(LAYOUT$subminor, OFFSET$subminor, value);
    }

    public @unsigned byte patch() {
        return segment.get(LAYOUT$patch, OFFSET$patch);
    }

    public void patch(@unsigned byte value) {
        segment.set(LAYOUT$patch, OFFSET$patch, value);
    }

    public static VkConformanceVersion allocate(Arena arena) {
        return new VkConformanceVersion(arena.allocate(LAYOUT));
    }

    public static VkConformanceVersion[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkConformanceVersion[] ret = new VkConformanceVersion[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkConformanceVersion(segment.asSlice(i * LAYOUT.byteSize(), LAYOUT.byteSize()));
        }
        return ret;
    }
}
