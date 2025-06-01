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
import java.nio.ShortBuffer;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/// Represents a pointer to 16-bit short integer(s) in native memory.
///
/// The property {@link #segment()} should always be not-null
/// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
/// {@link ValueLayout.OfShort#byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators. For
/// normal users, {@link #checked(MemorySegment)} is a good safe alternative.
@ValueBasedCandidate
@UnsafeConstructor
public record ShortPtr(@NotNull MemorySegment segment) implements IPointer, Iterable<Short> {
    public long size() {
        return segment.byteSize() / Short.BYTES;
    }

    public short read() {
        return segment.get(ValueLayout.JAVA_SHORT, 0);
    }

    public void write(short value) {
        segment.set(ValueLayout.JAVA_SHORT, 0, value);
    }

    public short read(long index) {
        return segment.get(ValueLayout.JAVA_SHORT, index * Short.BYTES);
    }

    public void write(long index, short value) {
        segment.set(ValueLayout.JAVA_SHORT, index * Short.BYTES, value);
    }

    /// Assume the {@link ShortPtr} is capable of holding at least {@code newSize} short integers,
    /// create a new view {@link ShortPtr} that uses the same backing storage as this
    /// {@link ShortPtr}, but with the new size. Since there is actually no way to really check
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
    public @NotNull ShortPtr reinterpret(long newSize) {
        return new ShortPtr(segment.reinterpret(newSize * Short.BYTES));
    }

    public @NotNull ShortPtr offset(long offset) {
        return new ShortPtr(segment.asSlice(offset * Short.BYTES));
    }

    /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
    /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
    /// (offset + newSize). Be careful with the difference.
    public @NotNull ShortPtr slice(long start, long end) {
        return new ShortPtr(segment.asSlice(start * Short.BYTES, (end - start) * Short.BYTES));
    }

    public @NotNull ShortPtr slice(long end) {
        return new ShortPtr(segment.asSlice(0, end * Short.BYTES));
    }

    @Override
    public @NotNull Iter iterator() {
        return new Iter(segment);
    }

    /// Create a new {@link ShortPtr} using {@code segment} as backing storage, with argument
    /// validation.
    ///
    /// This function does not ensure {@code segment}'s size to be a multiple of
    /// {@link Short#BYTES}, since that several trailing bytes could be automatically ignored by
    /// {@link #size()} method, and usually these bytes does not interfere with FFI operations.
    /// If {@code segment} is not big enough to hold at least one short integer, that segment is
    /// simply considered "empty". See the documentation of {@link IPointer#segment()} for more
    /// details.
    ///
    /// @param segment the {@link MemorySegment} to use as the backing storage
    /// @return {@code null} if {@code segment} is {@code null} or {@link MemorySegment#NULL},
    /// otherwise a new {@link ShortPtr} that uses {@code segment} as backing storage
    /// @throws IllegalArgumentException if {@code segment} is not native or not properly aligned
    @Contract("null -> null")
    public static @Nullable ShortPtr checked(@Nullable MemorySegment segment) {
        if (segment == null) {
            return null;
        }

        if (!segment.isNative()) {
            throw new IllegalArgumentException("Segment must be native");
        }

        if (segment.address() % ValueLayout.JAVA_SHORT.byteAlignment() != 0) {
            throw new IllegalArgumentException("Segment address must be aligned to " + ValueLayout.JAVA_SHORT.byteAlignment() + " bytes");
        }

        return new ShortPtr(segment);
    }

    /// Create a new {@link ShortPtr} using the same backing storage as {@code buffer}, with
    /// argument validation.
    ///
    /// The main difference between this static method and the {@link #allocate(Arena, ShortBuffer)}
    /// method is that this method does not copy the contents of {@code buffer} into a newly
    /// allocated {@link MemorySegment}. Instead, the newly created {@link ShortPtr} will use the
    /// same backing storage as {@code buffer}. Thus, modifications from one side will be visible on
    /// the other side.
    ///
    /// Be careful with {@link java.nio} buffer types' {@link Buffer#position()} property: only the
    /// "remaining" (from {@link Buffer#position()} to {@link Buffer#limit()}) part of
    /// {@code buffer} will be referred. If you have ever read from {@code buffer}, and you want all
    /// the contents of {@code buffer} to be referred, you may want to call {@link Buffer#rewind()}.
    ///
    /// When handling data types consisting of multiple bytes, also be careful with endianness and
    /// {@link ShortBuffer#order()} property. {@link ShortPtr} always uses the native endianness. So
    /// if {@code buffer} uses a different endianness, you may want to convert it to the native
    /// endianness first.
    ///
    /// @param buffer the {@link ShortBuffer} to use as the backing storage
    /// @return a new {@link ShortPtr} that uses {@code buffer} as its backing storage
    /// @throws IllegalArgumentException if {@code buffer} is not direct, or its backing storage is
    /// not properly aligned
    public static @NotNull ShortPtr checked(@NotNull ShortBuffer buffer) {
        if (!buffer.isDirect()) {
            throw new IllegalArgumentException("Buffer must be direct");
        }

        MemorySegment segment = MemorySegment.ofBuffer(buffer);
        if (segment.address() % ValueLayout.JAVA_SHORT.byteAlignment() != 0) {
            throw new IllegalArgumentException("Buffer address must be aligned to " + ValueLayout.JAVA_SHORT.byteAlignment() + " bytes");
        }

        return new ShortPtr(segment);
    }

    public static @NotNull ShortPtr allocate(@NotNull Arena arena) {
        return new ShortPtr(arena.allocate(ValueLayout.JAVA_SHORT));
    }

    public static @NotNull ShortPtr allocate(@NotNull Arena arena, long size) {
        return new ShortPtr(arena.allocate(ValueLayout.JAVA_SHORT, size));
    }

    public static @NotNull ShortPtr allocate(@NotNull Arena arena, short @NotNull [] array) {
        return new ShortPtr(arena.allocateFrom(ValueLayout.JAVA_SHORT, array));
    }

    public static @NotNull ShortPtr allocateV(@NotNull Arena arena, short value0, short ...values) {
        ShortPtr ret = allocate(arena, values.length + 1);
        ret.write(value0);
        ret.offset(1).segment.copyFrom(MemorySegment.ofArray(values));
        return ret;
    }

    /// Allocate a new {@link ShortPtr} in {@code arena} and copy the contents of {@code buffer} into
    /// the newly allocated {@link ShortPtr}.
    ///
    /// Be careful with {@link java.nio} buffer types' {@link Buffer#position()} property: only the
    /// "remaining" (from {@link Buffer#position()} to {@link Buffer#limit()}) part of
    /// {@code buffer} will be copied. If you have ever read from {@code buffer}, and you want all
    /// the contents of {@code buffer} to be copied, you may want to call {@link Buffer#rewind()}.
    ///
    /// When handling data types consisting of multiple bytes, also be careful with endianness and
    /// {@link ShortBuffer#order()} property. {@link ShortPtr} always uses the native endianness. So
    /// if {@code buffer} uses a different endianness, you may want to convert it to the native
    /// endianness first.
    ///
    /// @param arena the {@link Arena} to allocate the new {@link ShortPtr} in
    /// @param buffer the {@link ShortBuffer} to copy the contents from
    /// @return a new {@link ShortPtr} that contains the contents of {@code buffer}
    public static @NotNull ShortPtr allocate(@NotNull Arena arena, @NotNull ShortBuffer buffer) {
        MemorySegment s = arena.allocate(ValueLayout.JAVA_SHORT, buffer.remaining());
        s.copyFrom(MemorySegment.ofBuffer(buffer));

        return new ShortPtr(s);
    }

    /// An iterator over the short integers.
    public static final class Iter implements Iterator<Short> {
        Iter(@NotNull MemorySegment segment) {
            this.segment = segment;
        }

        @Override
        public boolean hasNext() {
            return segment.byteSize() >= Short.BYTES;
        }

        @Override
        public Short next() {
            if (!hasNext()) {
                throw new NoSuchElementException("No more short integers to read");
            }

            short value = segment.get(ValueLayout.JAVA_SHORT, 0);
            segment = segment.asSlice(Short.BYTES);
            return value;
        }

        private @NotNull MemorySegment segment;
    }
}
