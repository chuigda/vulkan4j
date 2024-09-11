package tech.icey.vk4j.ptr;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;

public record FloatPtr(MemorySegment segment) {
    float read() {
        return segment.get(ValueLayout.JAVA_FLOAT, 0);
    }

    void write(float value) {
        segment.set(ValueLayout.JAVA_FLOAT, 0, value);
    }
}
