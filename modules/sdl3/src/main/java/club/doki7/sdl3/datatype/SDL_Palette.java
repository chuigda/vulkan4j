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

/// A set of indexed colors representing a palette.
///
/// Since: This struct is available since SDL 3.2.0.
///
/// See also:
/// - `SDL_SetPaletteColors`
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct SDL_Palette {
///     int ncolors; // @link substring="ncolors" target="#ncolors"
///     SDL_Color* colors; // @link substring="SDL_Color" target="SDL_Color" @link substring="colors" target="#colors"
///     Uint32 version; // @link substring="version" target="#version"
///     int refcount; // @link substring="refcount" target="#refcount"
/// } SDL_Palette;
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
public record SDL_Palette(@NotNull MemorySegment segment) implements ISDL_Palette {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link SDL_Palette}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// ISDL_Palette to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code SDL_Palette.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements ISDL_Palette, Iterable<SDL_Palette> {
        public long size() {
            return segment.byteSize() / SDL_Palette.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull SDL_Palette at(long index) {
            return new SDL_Palette(segment.asSlice(index * SDL_Palette.BYTES, SDL_Palette.BYTES));
        }

        public void write(long index, @NotNull SDL_Palette value) {
            MemorySegment s = segment.asSlice(index * SDL_Palette.BYTES, SDL_Palette.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * SDL_Palette.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * SDL_Palette.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * SDL_Palette.BYTES,
                (end - start) * SDL_Palette.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * SDL_Palette.BYTES));
        }

        public SDL_Palette[] toArray() {
            SDL_Palette[] ret = new SDL_Palette[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<SDL_Palette> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<SDL_Palette> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= SDL_Palette.BYTES;
            }

            @Override
            public SDL_Palette next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                SDL_Palette ret = new SDL_Palette(segment.asSlice(0, SDL_Palette.BYTES));
                segment = segment.asSlice(SDL_Palette.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static SDL_Palette allocate(Arena arena) {
        return new SDL_Palette(arena.allocate(LAYOUT));
    }

    public static SDL_Palette.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new SDL_Palette.Ptr(segment);
    }

    public static SDL_Palette clone(Arena arena, SDL_Palette src) {
        SDL_Palette ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public int ncolors() {
        return segment.get(LAYOUT$ncolors, OFFSET$ncolors);
    }

    public SDL_Palette ncolors(int value) {
        segment.set(LAYOUT$ncolors, OFFSET$ncolors, value);
        return this;
    }

    public SDL_Palette colors(@Nullable ISDL_Color value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        colorsRaw(s);
        return this;
    }

    @Unsafe public @Nullable SDL_Color.Ptr colors(int assumedCount) {
        MemorySegment s = colorsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * SDL_Color.BYTES);
        return new SDL_Color.Ptr(s);
    }

    public @Nullable SDL_Color colors() {
        MemorySegment s = colorsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new SDL_Color(s);
    }

    public @Pointer(target=SDL_Color.class) MemorySegment colorsRaw() {
        return segment.get(LAYOUT$colors, OFFSET$colors);
    }

    public void colorsRaw(@Pointer(target=SDL_Color.class) MemorySegment value) {
        segment.set(LAYOUT$colors, OFFSET$colors, value);
    }

    public @NativeType("Uint32") @Unsigned int version() {
        return segment.get(LAYOUT$version, OFFSET$version);
    }

    public SDL_Palette version(@NativeType("Uint32") @Unsigned int value) {
        segment.set(LAYOUT$version, OFFSET$version, value);
        return this;
    }

    public int refcount() {
        return segment.get(LAYOUT$refcount, OFFSET$refcount);
    }

    public SDL_Palette refcount(int value) {
        segment.set(LAYOUT$refcount, OFFSET$refcount, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("ncolors"),
        ValueLayout.ADDRESS.withTargetLayout(SDL_Color.LAYOUT).withName("colors"),
        ValueLayout.JAVA_INT.withName("version"),
        ValueLayout.JAVA_INT.withName("refcount")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$ncolors = PathElement.groupElement("ncolors");
    public static final PathElement PATH$colors = PathElement.groupElement("colors");
    public static final PathElement PATH$version = PathElement.groupElement("version");
    public static final PathElement PATH$refcount = PathElement.groupElement("refcount");

    public static final OfInt LAYOUT$ncolors = (OfInt) LAYOUT.select(PATH$ncolors);
    public static final AddressLayout LAYOUT$colors = (AddressLayout) LAYOUT.select(PATH$colors);
    public static final OfInt LAYOUT$version = (OfInt) LAYOUT.select(PATH$version);
    public static final OfInt LAYOUT$refcount = (OfInt) LAYOUT.select(PATH$refcount);

    public static final long SIZE$ncolors = LAYOUT$ncolors.byteSize();
    public static final long SIZE$colors = LAYOUT$colors.byteSize();
    public static final long SIZE$version = LAYOUT$version.byteSize();
    public static final long SIZE$refcount = LAYOUT$refcount.byteSize();

    public static final long OFFSET$ncolors = LAYOUT.byteOffset(PATH$ncolors);
    public static final long OFFSET$colors = LAYOUT.byteOffset(PATH$colors);
    public static final long OFFSET$version = LAYOUT.byteOffset(PATH$version);
    public static final long OFFSET$refcount = LAYOUT.byteOffset(PATH$refcount);
}
