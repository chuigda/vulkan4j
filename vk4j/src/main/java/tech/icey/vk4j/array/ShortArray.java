package tech.icey.vk4j.array;

import tech.icey.vk4j.annotation.unsafe;
import tech.icey.vk4j.ptr.ShortPtr;
import tech.icey.vk4j.util.Function2;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;

public final class ShortArray extends ShortPtr {
    private final long size;

    @unsafe(alt = "ShortArray::allocate")
    public ShortArray(MemorySegment segment, long size) {
        super(segment);
        this.size = size;
    }

    public long size() {
        return size;
    }

    public short get(long index) {
        return segment.get(ValueLayout.JAVA_SHORT, index * ValueLayout.JAVA_SHORT.byteSize());
    }

    public void set(long index, short value) {
        segment.set(ValueLayout.JAVA_SHORT, index * ValueLayout.JAVA_SHORT.byteSize(), value);
    }

    public ShortPtr ptr() {
        return new ShortPtr(segment);
    }

    public static <A extends Function2<MemoryLayout, Long, MemorySegment>>
    ShortArray allocate(A allocator, long size) {
        return new ShortArray(allocator.apply(ValueLayout.JAVA_SHORT, size), size);
    }

    public static ShortArray allocate(Arena arena, long size) {
        return allocate(arena::allocate, size);
    }

    @unsafe
    public static ShortArray ofPtr(ShortPtr ptr, long size) {
        MemorySegment transmuted = ptr.segment().reinterpret(size * ValueLayout.JAVA_SHORT.byteSize());
        return new ShortArray(transmuted, size);
    }
}
