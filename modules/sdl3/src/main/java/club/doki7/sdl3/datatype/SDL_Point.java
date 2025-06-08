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

/// The structure that defines a point (using integers).
///
/// \since This struct is available since SDL 3.2.0.
///
/// \sa SDL_GetRectEnclosingPoints
/// \sa SDL_PointInRect
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct SDL_Point {
///     int x; // optional // @link substring="x" target="#x"
///     int y; // optional // @link substring="y" target="#y"
/// } SDL_Point;
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
public record SDL_Point(@NotNull MemorySegment segment) implements ISDL_Point {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link SDL_Point}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// ISDL_Point to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code SDL_Point.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements ISDL_Point, Iterable<SDL_Point> {
        public long size() {
            return segment.byteSize() / SDL_Point.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull SDL_Point at(long index) {
            return new SDL_Point(segment.asSlice(index * SDL_Point.BYTES, SDL_Point.BYTES));
        }

        public void write(long index, @NotNull SDL_Point value) {
            MemorySegment s = segment.asSlice(index * SDL_Point.BYTES, SDL_Point.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * SDL_Point.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * SDL_Point.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * SDL_Point.BYTES,
                (end - start) * SDL_Point.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * SDL_Point.BYTES));
        }

        public SDL_Point[] toArray() {
            SDL_Point[] ret = new SDL_Point[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<SDL_Point> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<SDL_Point> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= SDL_Point.BYTES;
            }

            @Override
            public SDL_Point next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                SDL_Point ret = new SDL_Point(segment.asSlice(0, SDL_Point.BYTES));
                segment = segment.asSlice(SDL_Point.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static SDL_Point allocate(Arena arena) {
        return new SDL_Point(arena.allocate(LAYOUT));
    }

    public static SDL_Point.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new SDL_Point.Ptr(segment);
    }

    public static SDL_Point clone(Arena arena, SDL_Point src) {
        SDL_Point ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public int x() {
        return segment.get(LAYOUT$x, OFFSET$x);
    }

    public SDL_Point x(int value) {
        segment.set(LAYOUT$x, OFFSET$x, value);
        return this;
    }

    public int y() {
        return segment.get(LAYOUT$y, OFFSET$y);
    }

    public SDL_Point y(int value) {
        segment.set(LAYOUT$y, OFFSET$y, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("x"),
        ValueLayout.JAVA_INT.withName("y")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$x = PathElement.groupElement("x");
    public static final PathElement PATH$y = PathElement.groupElement("y");

    public static final OfInt LAYOUT$x = (OfInt) LAYOUT.select(PATH$x);
    public static final OfInt LAYOUT$y = (OfInt) LAYOUT.select(PATH$y);

    public static final long SIZE$x = LAYOUT$x.byteSize();
    public static final long SIZE$y = LAYOUT$y.byteSize();

    public static final long OFFSET$x = LAYOUT.byteOffset(PATH$x);
    public static final long OFFSET$y = LAYOUT.byteOffset(PATH$y);
}
