package club.doki7.sdl3.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
import java.util.List;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Consumer;

import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import club.doki7.ffm.IPointer;
import club.doki7.ffm.NativeLayout;
import club.doki7.ffm.annotation.*;
import club.doki7.ffm.ptr.*;
import club.doki7.sdl3.bitmask.*;
import club.doki7.sdl3.handle.*;
import club.doki7.sdl3.enumtype.*;
import static club.doki7.sdl3.SDL3Constants.*;

/// Represents a pointer to a {@code SDL_AtomicInt} structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct SDL_AtomicInt {
///     int value; // optional // @link substring="value" target="#value"
/// } SDL_AtomicInt;
/// }
///
/// ## Contracts
///
/// The property {@link #segment()} should always be not-null
/// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
@ValueBasedCandidate
@UnsafeConstructor
public record SDL_AtomicInt(@NotNull MemorySegment segment) implements ISDL_AtomicInt {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link SDL_AtomicInt}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// ISDL_AtomicInt to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code SDL_AtomicInt.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements ISDL_AtomicInt, Iterable<SDL_AtomicInt> {
        public long size() {
            return segment.byteSize() / SDL_AtomicInt.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull SDL_AtomicInt at(long index) {
            return new SDL_AtomicInt(segment.asSlice(index * SDL_AtomicInt.BYTES, SDL_AtomicInt.BYTES));
        }

        public void write(long index, @NotNull SDL_AtomicInt value) {
            MemorySegment s = segment.asSlice(index * SDL_AtomicInt.BYTES, SDL_AtomicInt.BYTES);
            s.copyFrom(value.segment);
        }

        /// Assume the {@link Ptr} is capable of holding at least {@code newSize} structures,
        /// create a new view {@link Ptr} that uses the same backing storage as this
        /// {@link Ptr}, but with the new size. Since there is actually no way to really check
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
        public @NotNull Ptr reinterpret(long newSize) {
            return new Ptr(segment.reinterpret(newSize * SDL_AtomicInt.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * SDL_AtomicInt.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * SDL_AtomicInt.BYTES,
                (end - start) * SDL_AtomicInt.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * SDL_AtomicInt.BYTES));
        }

        public SDL_AtomicInt[] toArray() {
            SDL_AtomicInt[] ret = new SDL_AtomicInt[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<SDL_AtomicInt> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<SDL_AtomicInt> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= SDL_AtomicInt.BYTES;
            }

            @Override
            public SDL_AtomicInt next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                SDL_AtomicInt ret = new SDL_AtomicInt(segment.asSlice(0, SDL_AtomicInt.BYTES));
                segment = segment.asSlice(SDL_AtomicInt.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static SDL_AtomicInt allocate(Arena arena) {
        return new SDL_AtomicInt(arena.allocate(LAYOUT));
    }

    public static SDL_AtomicInt.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new SDL_AtomicInt.Ptr(segment);
    }

    public static SDL_AtomicInt clone(Arena arena, SDL_AtomicInt src) {
        SDL_AtomicInt ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public int value() {
        return segment.get(LAYOUT$value, OFFSET$value);
    }

    public SDL_AtomicInt value(int value) {
        segment.set(LAYOUT$value, OFFSET$value, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("value")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$value = PathElement.groupElement("value");

    public static final OfInt LAYOUT$value = (OfInt) LAYOUT.select(PATH$value);

    public static final long SIZE$value = LAYOUT$value.byteSize();

    public static final long OFFSET$value = LAYOUT.byteOffset(PATH$value);
}
