package tech.icey.vk4j.ptr;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;

public record BytePtr(MemorySegment segment) {
    byte read() {
        return segment.get(ValueLayout.JAVA_BYTE, 0);
    }

    void write(byte value) {
        segment.set(ValueLayout.JAVA_BYTE, 0, value);
    }
}
