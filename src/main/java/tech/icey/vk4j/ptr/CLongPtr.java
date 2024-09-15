package tech.icey.vk4j.ptr;

import tech.icey.vk4j.NativeLayout;

import java.lang.foreign.MemorySegment;

public record CLongPtr(MemorySegment segment) {
    public long read() {
        return NativeLayout.readCLong(segment, 0);
    }

    public void write(long value) {
        NativeLayout.writeCLong(segment, 0, value);
    }
}
