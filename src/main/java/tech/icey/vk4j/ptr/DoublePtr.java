package tech.icey.vk4j.ptr;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;

public record DoublePtr(MemorySegment segment) {
    double read() {
        return segment.get(ValueLayout.JAVA_DOUBLE, 0);
    }

    void write(double value) {
        segment.set(ValueLayout.JAVA_DOUBLE, 0, value);
    }
}
