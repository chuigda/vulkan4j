package tech.icey.vk4j.array;

import tech.icey.vk4j.NativeLayout;
import tech.icey.vk4j.annotations.unsafe;
import tech.icey.vk4j.ptr.CSizeTPtr;
import tech.icey.vk4j.util.Function2;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;

public final class CSizeTArray extends CSizeTPtr {
    private final long size;

    @unsafe(alt = "CSizeTArray::allocate")
    public CSizeTArray(MemorySegment segment, long size) {
        super(segment);
        this.size = size;
    }

    long size() {
        return size;
    }

    public long get(long index) {
        return NativeLayout.readCSizeT(segment, index);
    }

    public void set(long index, long value) {
        NativeLayout.writeCSizeT(segment, index, value);
    }

    public CSizeTPtr ptr() {
        return new CSizeTPtr(segment);
    }

    public static <A extends Function2<MemoryLayout, Long, MemorySegment>>
    CSizeTArray allocate(A allocator, long size) {
        return new CSizeTArray(allocator.apply(NativeLayout.C_SIZE_T, size), size);
    }

    public static CSizeTArray allocate(Arena arena, long size) {
        return allocate(arena::allocate, size);
    }

    @unsafe
    public static CSizeTArray ofPtr(CSizeTPtr ptr, long size) {
        MemorySegment transmuted = ptr.segment().reinterpret(size);
        return new CSizeTArray(transmuted, size);
    }
}
