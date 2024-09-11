package tech.icey.vk4j.ptr;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;

public record LongPtr(MemorySegment segment) {
    long read() {
        return segment.get(ValueLayout.JAVA_LONG, 0);
    }

    void write(long value) {
        segment.set(ValueLayout.JAVA_LONG, 0, value);
    }
}
