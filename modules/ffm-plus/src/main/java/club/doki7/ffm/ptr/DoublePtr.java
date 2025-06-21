package club.doki7.ffm.ptr;

import club.doki7.ffm.IPointer;
import club.doki7.ffm.annotation.Unsafe;
import club.doki7.ffm.annotation.UnsafeConstructor;
import club.doki7.ffm.annotation.ValueBasedCandidate;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;
import java.nio.Buffer;
import java.nio.DoubleBuffer;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/// Represents a pointer to 64-bit double-precision float(s) in native memory
///
/// The property {@link #segment()} should always be not-null
/// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
/// {@link ValueLayout.OfDouble#byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators. For
/// normal users, {@link #checked(MemorySegment)} is a good safe alternative.
@ValueBasedCandidate
@UnsafeConstructor
public record DoublePtr(@NotNull MemorySegment segment) implements IPointer, Iterable<Double> {
    public long size() {
        return segment.byteSize() / Double.BYTES;
    }

    public double read() {
        return segment.get(ValueLayout.JAVA_DOUBLE, 0);
    }

    public void write(double value) {
        segment.set(ValueLayout.JAVA_DOUBLE, 0, value);
    }

    public double read(long index) {
        return segment.get(ValueLayout.JAVA_DOUBLE, index * Double.BYTES);
    }

    public void write(long index, double value) {
        segment.set(ValueLayout.JAVA_DOUBLE, index * Double.BYTES, value);
    }

    public void write(double @NotNull [] array) {
        segment.copyFrom(MemorySegment.ofArray(array));
    }

    public void writeV(double value0, double @NotNull ...values) {
        write(value0);
        offset(1).write(values);
    }

    /// Assume the {@link DoublePtr} is capable of holding at least {@code newSize} doubles, create
    /// a new view {@link DoublePtr} that uses the same backing storage as this {@link DoublePtr},
    /// but with the new size. Since there is actually no way to really check whether the new size
    /// is valid, while buffer overflow is undefined behavior, this method is marked as
    /// {@link Unsafe}.
    ///
    /// This method could be useful when handling data returned from some C API, where the size of
    /// the data is not known in advance.
    ///
    /// If the size of the underlying segment is actually known in advance and correctly set, and
    /// you want to create a shrunk view, you may use {@link #slice(long)} (with validation)
    /// instead.
    @Unsafe
    public @NotNull DoublePtr reinterpret(long newSize) {
        return new DoublePtr(segment.reinterpret(newSize * Double.BYTES));
    }

    public @NotNull DoublePtr offset(long offset) {
        return new DoublePtr(segment.asSlice(offset * Double.BYTES));
    }

    /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
    /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
    /// (offset + newSize). Be careful with the difference.
    public @NotNull DoublePtr slice(long start, long end) {
        return new DoublePtr(segment.asSlice(start * Double.BYTES, (end - start) * Double.BYTES));
    }

    public @NotNull DoublePtr slice(long end) {
        return new DoublePtr(segment.asSlice(0, end * Double.BYTES));
    }

    /// Create a new {@link DoublePtr} using {@code segment} as backing storage, with argument
    /// validation.
    ///
    /// This function does not ensure {@code segment}'s size to be a multiple of
    /// {@link Double#BYTES}, since that several trailing bytes could be automatically ignored by
    /// {@link #size()} method, and usually these bytes does not interfere with FFI operations. If
    /// {@code segment} is not big enough to hold at least one double, that segment is simply
    /// considered "empty". See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// @param segment the {@link MemorySegment} to use as the backing storage
    /// @return {@code null} if {@code segment} is {@link MemorySegment#NULL},
    /// otherwise a new {@link DoublePtr} that uses {@code segment} as backing storage
    /// @throws IllegalArgumentException if {@code segment} is not native or not properly aligned
    public static @Nullable DoublePtr checked(@NotNull MemorySegment segment) {
        if (segment.equals(MemorySegment.NULL)) {
            return null;
        }

        if (!segment.isNative()) {
            throw new IllegalArgumentException("Segment must be native");
        }

        if (segment.address() % ValueLayout.JAVA_DOUBLE.byteAlignment() != 0) {
            throw new IllegalArgumentException("Segment address must be aligned to " + ValueLayout.JAVA_DOUBLE.byteAlignment() + " bytes");
        }

        return new DoublePtr(segment);
    }

    @Override
    public @NotNull Iterator<Double> iterator() {
        return new Iter(segment);
    }

    /// Create a new {@link DoublePtr} using the same backing storage as {@code buffer}, with
    /// argument validation.
    ///
    /// The main difference between this static method and the {@link #allocate(Arena, DoubleBuffer)}
    /// method is that this method does not copy the contents of the {@code buffer} into a newly
    /// allocated {@link MemorySegment}. Instead, the newly created {@link DoublePtr} will use the
    /// same backing storage as {@code buffer}. Thus, modification from one side will be visible on
    /// the other side.
    ///
    /// Be careful with {@link java.nio} buffer types' {@link Buffer#position()} property: only the
    /// "remaining" (from {@link Buffer#position()} to {@link Buffer#limit()}) part of
    /// {@code buffer} will be referred. If you have ever read from {@code buffer}, and you want all
    /// the contents of {@code buffer} to be referred, you may want to call {@link Buffer#rewind()}.
    ///
    /// When handling data types consisting of multiple bytes, also be careful with endianness and
    /// {@link DoubleBuffer#order()} property. {@link DoublePtr} always uses the native endianness. So
    /// if {@code buffer} uses a different endianness, you may want to convert it to the native
    /// endianness first.
    ///
    /// @param buffer the {@link DoubleBuffer} to use as the backing storage
    /// @return a new {@link DoublePtr} that uses {@code buffer} as its backing storage
    /// @throws IllegalArgumentException if {@code buffer} is not direct, or its backing storage is
    /// not properly aligned
    public static @NotNull DoublePtr checked(@NotNull DoubleBuffer buffer) {
        if (!buffer.isDirect()) {
            throw new IllegalArgumentException("Buffer must be direct");
        }

        MemorySegment segment = MemorySegment.ofBuffer(buffer);
        if (segment.address() % ValueLayout.JAVA_DOUBLE.byteAlignment() != 0) {
            throw new IllegalArgumentException("Buffer address must be aligned to " + ValueLayout.JAVA_DOUBLE.byteAlignment() + " bytes");
        }

        return new DoublePtr(segment);
    }

    public static @NotNull DoublePtr allocate(@NotNull Arena arena) {
        return new DoublePtr(arena.allocate(ValueLayout.JAVA_DOUBLE));
    }

    public static @NotNull DoublePtr allocate(@NotNull Arena arena, long size) {
        return new DoublePtr(arena.allocate(ValueLayout.JAVA_DOUBLE, size));
    }

    public static @NotNull DoublePtr allocate(@NotNull Arena arena, double @NotNull [] array) {
        return new DoublePtr(arena.allocateFrom(ValueLayout.JAVA_DOUBLE, array));
    }

    public static @NotNull DoublePtr allocateV(@NotNull Arena arena, double value0, double ...values) {
        DoublePtr ret = allocate(arena, values.length + 1);
        ret.write(value0);
        ret.offset(1).segment.copyFrom(MemorySegment.ofArray(values));
        return ret;
    }

    /// Allocate a new {@link DoublePtr} in {@code arena} and copy the contents of {@code buffer} into
    /// the newly allocated {@link DoublePtr}.
    ///
    /// Be careful with {@link java.nio} buffer types' {@link Buffer#position()} property: only the
    /// "remaining" (from {@link Buffer#position()} to {@link Buffer#limit()}) part of
    /// {@code buffer} will be copied. If you have ever read from {@code buffer}, and you want all
    /// the contents of {@code buffer} to be copied, you may want to call {@link Buffer#rewind()}.
    ///
    /// When handling data types consisting of multiple bytes, also be careful with endianness and
    /// {@link DoubleBuffer#order()} property. {@link DoublePtr} always uses the native endianness. So
    /// if {@code buffer} uses a different endianness, you may want to convert it to the native
    /// endianness first.
    ///
    /// @param arena the {@link Arena} to allocate the new {@link DoublePtr} in
    /// @param buffer the {@link DoubleBuffer} to copy the contents from
    /// @return a new {@link DoublePtr} that contains the contents of {@code buffer}
    public static @NotNull DoublePtr allocate(@NotNull Arena arena, @NotNull DoubleBuffer buffer) {
        var s = arena.allocate(ValueLayout.JAVA_DOUBLE, buffer.remaining());
        s.copyFrom(MemorySegment.ofBuffer(buffer));
        return new DoublePtr(s);
    }

    /// An iterator over the double precision float numbers.
    private static final class Iter implements Iterator<Double> {
        Iter(@NotNull MemorySegment segment) {
            this.segment = segment;
        }

        @Override
        public boolean hasNext() {
            return segment.byteSize() >= Double.BYTES;
        }

        @Override
        public Double next() {
            if (!hasNext()) {
                throw new NoSuchElementException("No more doubles to read");
            }
            double value = segment.get(ValueLayout.JAVA_DOUBLE, 0);
            segment = segment.asSlice(Double.BYTES);
            return value;
        }

        private @NotNull MemorySegment segment;
    }
}
