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

/// RGB value used in a message box color scheme
///
/// Since: This struct is available since SDL 3.2.0.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct SDL_MessageBoxColor {
///     Uint8 r; // @link substring="r" target="#r"
///     Uint8 g; // @link substring="g" target="#g"
///     Uint8 b; // @link substring="b" target="#b"
/// } SDL_MessageBoxColor;
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
public record SDL_MessageBoxColor(@NotNull MemorySegment segment) implements ISDL_MessageBoxColor {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link SDL_MessageBoxColor}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// ISDL_MessageBoxColor to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code SDL_MessageBoxColor.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements ISDL_MessageBoxColor, Iterable<SDL_MessageBoxColor> {
        public long size() {
            return segment.byteSize() / SDL_MessageBoxColor.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull SDL_MessageBoxColor at(long index) {
            return new SDL_MessageBoxColor(segment.asSlice(index * SDL_MessageBoxColor.BYTES, SDL_MessageBoxColor.BYTES));
        }

        public void write(long index, @NotNull SDL_MessageBoxColor value) {
            MemorySegment s = segment.asSlice(index * SDL_MessageBoxColor.BYTES, SDL_MessageBoxColor.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * SDL_MessageBoxColor.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * SDL_MessageBoxColor.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * SDL_MessageBoxColor.BYTES,
                (end - start) * SDL_MessageBoxColor.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * SDL_MessageBoxColor.BYTES));
        }

        public SDL_MessageBoxColor[] toArray() {
            SDL_MessageBoxColor[] ret = new SDL_MessageBoxColor[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<SDL_MessageBoxColor> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<SDL_MessageBoxColor> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= SDL_MessageBoxColor.BYTES;
            }

            @Override
            public SDL_MessageBoxColor next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                SDL_MessageBoxColor ret = new SDL_MessageBoxColor(segment.asSlice(0, SDL_MessageBoxColor.BYTES));
                segment = segment.asSlice(SDL_MessageBoxColor.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static SDL_MessageBoxColor allocate(Arena arena) {
        return new SDL_MessageBoxColor(arena.allocate(LAYOUT));
    }

    public static SDL_MessageBoxColor.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new SDL_MessageBoxColor.Ptr(segment);
    }

    public static SDL_MessageBoxColor clone(Arena arena, SDL_MessageBoxColor src) {
        SDL_MessageBoxColor ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @NativeType("Uint8") @Unsigned byte r() {
        return segment.get(LAYOUT$r, OFFSET$r);
    }

    public SDL_MessageBoxColor r(@NativeType("Uint8") @Unsigned byte value) {
        segment.set(LAYOUT$r, OFFSET$r, value);
        return this;
    }

    public @NativeType("Uint8") @Unsigned byte g() {
        return segment.get(LAYOUT$g, OFFSET$g);
    }

    public SDL_MessageBoxColor g(@NativeType("Uint8") @Unsigned byte value) {
        segment.set(LAYOUT$g, OFFSET$g, value);
        return this;
    }

    public @NativeType("Uint8") @Unsigned byte b() {
        return segment.get(LAYOUT$b, OFFSET$b);
    }

    public SDL_MessageBoxColor b(@NativeType("Uint8") @Unsigned byte value) {
        segment.set(LAYOUT$b, OFFSET$b, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_BYTE.withName("r"),
        ValueLayout.JAVA_BYTE.withName("g"),
        ValueLayout.JAVA_BYTE.withName("b")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$r = PathElement.groupElement("r");
    public static final PathElement PATH$g = PathElement.groupElement("g");
    public static final PathElement PATH$b = PathElement.groupElement("b");

    public static final OfByte LAYOUT$r = (OfByte) LAYOUT.select(PATH$r);
    public static final OfByte LAYOUT$g = (OfByte) LAYOUT.select(PATH$g);
    public static final OfByte LAYOUT$b = (OfByte) LAYOUT.select(PATH$b);

    public static final long SIZE$r = LAYOUT$r.byteSize();
    public static final long SIZE$g = LAYOUT$g.byteSize();
    public static final long SIZE$b = LAYOUT$b.byteSize();

    public static final long OFFSET$r = LAYOUT.byteOffset(PATH$r);
    public static final long OFFSET$g = LAYOUT.byteOffset(PATH$g);
    public static final long OFFSET$b = LAYOUT.byteOffset(PATH$b);
}
