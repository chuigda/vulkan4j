package tech.icey.vk4j.ptr;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;

public record ShortPtr(MemorySegment segment) {
    short read() {
        return segment.get(ValueLayout.JAVA_SHORT, 0);
    }

    void write(short value) {
        segment.set(ValueLayout.JAVA_SHORT, 0, value);
    }
}
