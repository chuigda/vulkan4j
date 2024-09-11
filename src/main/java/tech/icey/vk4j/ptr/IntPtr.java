package tech.icey.vk4j.ptr;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;

public record IntPtr(MemorySegment segment) {
    int read() {
        return segment.get(ValueLayout.JAVA_INT, 0);
    }

    void write(int value) {
        segment.set(ValueLayout.JAVA_INT, 0, value);
    }
}
