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

/// A rectangle, with the origin at the upper left (using integers).
///
/// Since: This struct is available since SDL 3.2.0.
///
/// See also:
/// - `SDL_RectEmpty`
/// - `SDL_RectsEqual`
/// - `SDL_HasRectIntersection`
/// - `SDL_GetRectIntersection`
/// - `SDL_GetRectAndLineIntersection`
/// - `SDL_GetRectUnion`
/// - `SDL_GetRectEnclosingPoints`
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct SDL_Rect {
///     int x; // @link substring="x" target="#x"
///     int y; // @link substring="y" target="#y"
///     int w; // @link substring="w" target="#w"
///     int h; // @link substring="h" target="#h"
/// } SDL_Rect;
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
public record SDL_Rect(@NotNull MemorySegment segment) implements ISDL_Rect {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link SDL_Rect}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// ISDL_Rect to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code SDL_Rect.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements ISDL_Rect, Iterable<SDL_Rect> {
        public long size() {
            return segment.byteSize() / SDL_Rect.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull SDL_Rect at(long index) {
            return new SDL_Rect(segment.asSlice(index * SDL_Rect.BYTES, SDL_Rect.BYTES));
        }

        public void write(long index, @NotNull SDL_Rect value) {
            MemorySegment s = segment.asSlice(index * SDL_Rect.BYTES, SDL_Rect.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * SDL_Rect.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * SDL_Rect.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * SDL_Rect.BYTES,
                (end - start) * SDL_Rect.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * SDL_Rect.BYTES));
        }

        public SDL_Rect[] toArray() {
            SDL_Rect[] ret = new SDL_Rect[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<SDL_Rect> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<SDL_Rect> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= SDL_Rect.BYTES;
            }

            @Override
            public SDL_Rect next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                SDL_Rect ret = new SDL_Rect(segment.asSlice(0, SDL_Rect.BYTES));
                segment = segment.asSlice(SDL_Rect.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static SDL_Rect allocate(Arena arena) {
        return new SDL_Rect(arena.allocate(LAYOUT));
    }

    public static SDL_Rect.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new SDL_Rect.Ptr(segment);
    }

    public static SDL_Rect clone(Arena arena, SDL_Rect src) {
        SDL_Rect ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public int x() {
        return segment.get(LAYOUT$x, OFFSET$x);
    }

    public SDL_Rect x(int value) {
        segment.set(LAYOUT$x, OFFSET$x, value);
        return this;
    }

    public int y() {
        return segment.get(LAYOUT$y, OFFSET$y);
    }

    public SDL_Rect y(int value) {
        segment.set(LAYOUT$y, OFFSET$y, value);
        return this;
    }

    public int w() {
        return segment.get(LAYOUT$w, OFFSET$w);
    }

    public SDL_Rect w(int value) {
        segment.set(LAYOUT$w, OFFSET$w, value);
        return this;
    }

    public int h() {
        return segment.get(LAYOUT$h, OFFSET$h);
    }

    public SDL_Rect h(int value) {
        segment.set(LAYOUT$h, OFFSET$h, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("x"),
        ValueLayout.JAVA_INT.withName("y"),
        ValueLayout.JAVA_INT.withName("w"),
        ValueLayout.JAVA_INT.withName("h")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$x = PathElement.groupElement("x");
    public static final PathElement PATH$y = PathElement.groupElement("y");
    public static final PathElement PATH$w = PathElement.groupElement("w");
    public static final PathElement PATH$h = PathElement.groupElement("h");

    public static final OfInt LAYOUT$x = (OfInt) LAYOUT.select(PATH$x);
    public static final OfInt LAYOUT$y = (OfInt) LAYOUT.select(PATH$y);
    public static final OfInt LAYOUT$w = (OfInt) LAYOUT.select(PATH$w);
    public static final OfInt LAYOUT$h = (OfInt) LAYOUT.select(PATH$h);

    public static final long SIZE$x = LAYOUT$x.byteSize();
    public static final long SIZE$y = LAYOUT$y.byteSize();
    public static final long SIZE$w = LAYOUT$w.byteSize();
    public static final long SIZE$h = LAYOUT$h.byteSize();

    public static final long OFFSET$x = LAYOUT.byteOffset(PATH$x);
    public static final long OFFSET$y = LAYOUT.byteOffset(PATH$y);
    public static final long OFFSET$w = LAYOUT.byteOffset(PATH$w);
    public static final long OFFSET$h = LAYOUT.byteOffset(PATH$h);
}
