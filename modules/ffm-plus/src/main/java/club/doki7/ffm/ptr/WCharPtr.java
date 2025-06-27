package club.doki7.ffm.ptr;

import club.doki7.ffm.IPointer;
import club.doki7.ffm.NativeLayout;
import club.doki7.ffm.annotation.UnsafeConstructor;
import club.doki7.ffm.annotation.ValueBasedCandidate;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.util.NoSuchElementException;
import java.util.PrimitiveIterator;

/// TODO: document required
@ValueBasedCandidate
@UnsafeConstructor
public record WCharPtr(@Override @NotNull MemorySegment segment) implements IPointer, Iterable<Integer> {
    public long size() {
        return segment.byteSize() / NativeLayout.WCHAR_SIZE;
    }

    public int read() {
        return NativeLayout.readWCharT(segment, 0);
    }

    public void write(int value) {
        NativeLayout.writeWCharT(segment, 0, value);
    }

    public long read(long index) {
        return NativeLayout.readWCharT(segment, index);
    }

    public void write(long index, int value) {
        NativeLayout.writeWCharT(segment, index, value);
    }

    /// TODO: document required
    public @NotNull WCharPtr reinterpret(long newSize) {
        return new WCharPtr(segment.reinterpret(newSize * NativeLayout.WCHAR_SIZE));
    }

    public @NotNull WCharPtr offset(long offset) {
        return new WCharPtr(segment.asSlice(offset * NativeLayout.WCHAR_SIZE));
    }

    public @NotNull WCharPtr slice(long end) {
        return new WCharPtr(segment.asSlice(0, end * NativeLayout.WCHAR_SIZE));
    }

    @Override
    public @NotNull PrimitiveIterator.OfInt iterator() {
        return new Iter(segment);
    }

    // TODO: document
    public static @Nullable WCharPtr checked(@NotNull MemorySegment segment) {
        if (segment.equals(MemorySegment.NULL)) {
            return null;
        }

        if (!segment.isNative()) {
            throw new IllegalArgumentException("Segment must be native");
        }

        if (segment.address() % NativeLayout.WCHAR_T.byteAlignment() != 0) {
            throw new IllegalArgumentException("Segment address must be aligned to " + NativeLayout.WCHAR_T.byteAlignment() + " bytes");
        }

        return new WCharPtr(segment);
    }

    public static @NotNull WCharPtr allocate(@NotNull Arena arena) {
        return new WCharPtr(arena.allocate(NativeLayout.WCHAR_T));
    }

    public static @NotNull WCharPtr allocate(@NotNull Arena arena, long size) {
        return new WCharPtr(arena.allocate(NativeLayout.WCHAR_T, size));
    }

    private static final class Iter implements PrimitiveIterator.OfInt {
        Iter(@NotNull MemorySegment segment) {
            this.segment = segment;
        }

        private @NotNull MemorySegment segment;

        @Override
        public boolean hasNext() {
            return segment.byteSize() >= NativeLayout.WCHAR_SIZE;
        }

        @Override
        public int nextInt() {
            if (!hasNext()) {
                throw new NoSuchElementException("No more elements to read");
            }

            int value = NativeLayout.readWCharT(segment, 0);
            segment = segment.asSlice(NativeLayout.WCHAR_SIZE);
            return value;
        }
    }
}
