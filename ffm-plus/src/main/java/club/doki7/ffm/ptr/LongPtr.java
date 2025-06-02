package club.doki7.ffm.ptr;

import club.doki7.ffm.IPointer;
import club.doki7.ffm.annotation.Unsafe;
import club.doki7.ffm.annotation.UnsafeConstructor;
import club.doki7.ffm.annotation.ValueBasedCandidate;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;
import java.nio.Buffer;
import java.nio.LongBuffer;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/// Represents a pointer to 64-bit long integer(s) in native memory.
///
/// The property {@link #segment()} should always be not-null
/// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
/// {@link ValueLayout.OfLong#byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators. For
/// normal users, {@link #checked(MemorySegment)} is a good safe alternative.
@ValueBasedCandidate
@UnsafeConstructor
public record LongPtr(@NotNull MemorySegment segment) implements IPointer, Iterable<Long> {
    public long size() {
        return segment.byteSize() / Long.BYTES;
    }

    public long read() {
        return segment.get(ValueLayout.JAVA_LONG, 0);
    }

    public void write(long value) {
        segment.set(ValueLayout.JAVA_LONG, 0, value);
    }

    public long read(long index) {
        return segment.get(ValueLayout.JAVA_LONG, index * Long.BYTES);
    }

    public void write(long index, long value) {
        segment.set(ValueLayout.JAVA_LONG, index * Long.BYTES, value);
    }

    public void write(long @NotNull [] array) {
        segment.copyFrom(MemorySegment.ofArray(array));
    }

    public void writeV(long value0, long @NotNull ...values) {
        write(value0);
        offset(1).write(values);
    }

    /// Assume the {@link LongPtr} is capable of holding at least {@code newSize} long integers,
    /// create a new view {@link LongPtr} that uses the same backing storage as this
    /// {@link LongPtr}, but with the new size. Since there is actually no way to really check
    /// whether the new size is valid, while buffer overflow is undefined behavior, this method is
    /// marked as {@link Unsafe}.
    ///
    /// This method could be useful when handling data returned from some C API, where the size of
    /// the data is not known in advance.
    ///
    /// If the size of the underlying segment is actually known in advance and correctly set, and
    /// you want to create a shrunk view, you may use {@link #slice(long)} (with validation)
    /// instead.
    @Unsafe
    public @NotNull LongPtr reinterpret(long newSize) {
        return new LongPtr(segment.reinterpret(newSize * Long.BYTES));
    }

    public @NotNull LongPtr offset(long offset) {
        return new LongPtr(segment.asSlice(offset * Long.BYTES));
    }

    /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
    /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
    /// (offset + newSize). Be careful with the difference.
    public @NotNull LongPtr slice(long start, long end) {
        return new LongPtr(segment.asSlice(start * Long.BYTES, (end - start) * Long.BYTES));
    }

    public @NotNull LongPtr slice(long end) {
        return new LongPtr(segment.asSlice(0, end * Long.BYTES));
    }

    @Override
    public @NotNull Iter iterator() {
        return new Iter(segment);
    }

    /// Create a new {@link LongPtr} using {@code segment} as backing storage, with argument
    /// validation.
    ///
    /// This function does not ensure {@code segment}'s size to be a multiple of
    /// {@link Long#BYTES}, since that several trailing bytes could be automatically ignored by
    /// {@link #size()} method, and usually these bytes does not interfere with FFI operations.
    /// If {@code segment} is not big enough to hold at least one integer, that segment is simply
    /// considered "empty". See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// @param segment the {@link MemorySegment} to use as the backing storage
    /// @return {@code null} if {@code segment} is {@code null} or {@link MemorySegment#NULL},
    /// otherwise a new {@link LongPtr} that uses {@code segment} as backing storage
    /// @throws IllegalArgumentException if {@code segment} is not native or not properly aligned
    @Contract("null -> null")
    public static @Nullable LongPtr checked(@Nullable MemorySegment segment) {
        if (segment == null || segment.equals(MemorySegment.NULL)) {
            return null;
        }

        if (!segment.isNative()) {
            throw new IllegalArgumentException("Segment must be native");
        }

        if (segment.address() % ValueLayout.JAVA_LONG.byteAlignment() != 0) {
            throw new IllegalArgumentException("Segment address must be aligned to " + ValueLayout.JAVA_LONG.byteAlignment() + " bytes");
        }

        return new LongPtr(segment);
    }

    /// Create a new {@link LongPtr} using the same backing storage as {@code buffer}, with argument
    /// validation.
    ///
    /// The main difference between this static method and the {@link #allocate(Arena, LongBuffer)}
    /// method is that this method does not copy the contents of {@code buffer} into a newly
    /// allocated {@link MemorySegment}. Instead, the newly created {@link LongPtr} will use the
    /// same backing storage as {@code buffer}. Thus, modifications from one side will be visible on
    /// the other side.
    ///
    /// Be careful with {@link java.nio} buffer types' {@link Buffer#position()} property: only the
    /// "remaining" (from {@link Buffer#position()} to {@link Buffer#limit()}) part of
    /// {@code buffer} will be referred. If you have ever read from {@code buffer}, and you want all
    /// the contents of {@code buffer} to be referred, you may want to call {@link Buffer#rewind()}.
    ///
    /// When handling data types consisting of multiple bytes, also be careful with endianness and
    /// {@link LongBuffer#order()} property. {@link LongPtr} always uses the native endianness. So
    /// if {@code buffer} uses a different endianness, you may want to convert it to the native
    /// endianness first.
    ///
    /// @param buffer the {@link LongBuffer} to use as the backing storage
    /// @return a new {@link LongPtr} that uses {@code buffer} as its backing storage
    /// @throws IllegalArgumentException if {@code buffer} is not direct, or its backing storage is
    /// not properly alignd
    public static @NotNull LongPtr checked(@NotNull LongBuffer buffer) {
        if (!buffer.isDirect()) {
            throw new IllegalArgumentException("Buffer must be direct");
        }

        MemorySegment segment = MemorySegment.ofBuffer(buffer);
        if (segment.address() % ValueLayout.JAVA_LONG.byteAlignment() != 0) {
            throw new IllegalArgumentException("Buffer address must be aligned to " + ValueLayout.JAVA_LONG.byteAlignment() + " bytes");
        }

        return new LongPtr(segment);
    }

    public static @NotNull LongPtr allocate(@NotNull Arena arena) {
        return new LongPtr(arena.allocate(ValueLayout.JAVA_LONG));
    }

    public static @NotNull LongPtr allocate(@NotNull Arena arena, long size) {
        return new LongPtr(arena.allocate(ValueLayout.JAVA_LONG, size));
    }

    public static @NotNull LongPtr allocate(@NotNull Arena arena, long @NotNull [] array) {
        return new LongPtr(arena.allocateFrom(ValueLayout.JAVA_LONG, array));
    }

    public static @NotNull LongPtr allocateV(@NotNull Arena arena, long value0, long ...values) {
        LongPtr ret = allocate(arena, values.length + 1);
        ret.write(value0);
        ret.offset(1).segment.copyFrom(MemorySegment.ofArray(values));
        return ret;
    }

    /// Allocate a new {@link LongPtr} in {@code arena} and copy the contents of {@code buffer} into
    /// the newly allocated {@link LongPtr}.
    ///
    /// Be careful with {@link java.nio} buffer types' {@link Buffer#position()} property: only the
    /// "remaining" (from {@link Buffer#position()} to {@link Buffer#limit()}) part of
    /// {@code buffer} will be copied. If you have ever read from {@code buffer}, and you want all
    /// the contents of {@code buffer} to be copied, you may want to call {@link Buffer#rewind()}.
    ///
    /// When handling data types consisting of multiple bytes, also be careful with endianness and
    /// {@link LongBuffer#order()} property. {@link LongPtr} always uses the native endianness. So
    /// if {@code buffer} uses a different endianness, you may want to convert it to the native
    /// endianness first.
    ///
    /// @param arena the {@link Arena} to allocate the new {@link LongPtr} in
    /// @param buffer the {@link LongBuffer} to copy the contents from
    /// @return a new {@link LongPtr} that contains the contents of {@code buffer}
    public static @NotNull LongPtr allocate(@NotNull Arena arena, @NotNull LongBuffer buffer) {
        MemorySegment s = arena.allocate(
                ValueLayout.JAVA_LONG,
                (long) buffer.remaining() * Long.BYTES
        );
        s.copyFrom(MemorySegment.ofBuffer(buffer));

        return new LongPtr(s);
    }

    /// An iterator over the long integers.
    public static final class Iter implements Iterator<Long> {
        Iter(@NotNull MemorySegment segment) {
            this.segment = segment;
        }

        @Override
        public boolean hasNext() {
            return segment.byteSize() >= Long.BYTES;
        }

        @Override
        public Long next() {
            if (!hasNext()) {
                throw new NoSuchElementException("No more long integers to read");
            }
            long value = segment.get(ValueLayout.JAVA_LONG, 0);
            segment = segment.asSlice(Long.BYTES);
            return value;
        }

        private @NotNull MemorySegment segment;
    }
}
