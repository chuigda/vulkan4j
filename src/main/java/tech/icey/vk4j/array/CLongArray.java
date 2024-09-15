package tech.icey.vk4j.array;

import tech.icey.vk4j.NativeLayout;
import tech.icey.vk4j.annotations.unsafe;
import tech.icey.vk4j.ptr.CLongPtr;
import tech.icey.vk4j.util.Function2;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;

public record CLongArray(MemorySegment segment, long size) {
    public static <A extends Function2<MemoryLayout, Long, MemorySegment>>
    CLongArray allocate(A allocator, long size) {
        return new CLongArray(allocator.apply(NativeLayout.C_LONG, size), size);
    }

    public static CLongArray allocate(Arena arena, long size) {
        return allocate(arena::allocate, size);
    }

    public long get(long index) {
        return NativeLayout.readCLong(segment, index);
    }

    public void set(long index, long value) {
        NativeLayout.writeCLong(segment, index, value);
    }

    public CLongPtr ptr() {
        return new CLongPtr(segment);
    }

    @unsafe
    public static CLongArray ofPtr(CLongPtr ptr, long size) {
        MemorySegment transmuted = ptr.segment().reinterpret(size);
        return new CLongArray(transmuted, size);
    }
}
