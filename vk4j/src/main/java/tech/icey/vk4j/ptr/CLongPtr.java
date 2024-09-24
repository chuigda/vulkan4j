package tech.icey.vk4j.ptr;

import tech.icey.vk4j.NativeLayout;
import tech.icey.vk4j.annotation.unsafe;
import tech.icey.vk4j.array.CLongArray;
import tech.icey.vk4j.util.Function2;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;

public sealed class CLongPtr permits CLongArray {
    protected final MemorySegment segment;

    @unsafe(alt = "CLongPtr::allocate")
    public CLongPtr(MemorySegment segment) {
        this.segment = segment;
    }

    public MemorySegment segment() {
        return segment;
    }

    public long read() {
        return NativeLayout.readCLong(segment, 0);
    }

    public void write(long value) {
        NativeLayout.writeCLong(segment, 0, value);
    }

    public static <A extends Function2<MemoryLayout, Long, MemorySegment>>
    CLongPtr allocate(A allocator) {
        return new CLongPtr(allocator.apply(NativeLayout.C_LONG, 1L));
    }

    public static CLongPtr allocate(Arena arena) {
        return allocate(arena::allocate);
    }
}
