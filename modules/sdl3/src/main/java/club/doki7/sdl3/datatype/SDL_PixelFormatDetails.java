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

/// Details about the format of a pixel.
///
/// \since This struct is available since SDL 3.2.0.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct SDL_PixelFormatDetails {
///     SDL_PixelFormat format; // @link substring="SDL_PixelFormat" target="SDL_PixelFormat" @link substring="format" target="#format"
///     Uint8 bits_per_pixel; // @link substring="bits_per_pixel" target="#bits_per_pixel"
///     Uint8 bytes_per_pixel; // @link substring="bytes_per_pixel" target="#bytes_per_pixel"
///     Uint8[2] padding; // @link substring="padding" target="#padding"
///     Uint32 Rmask; // @link substring="Rmask" target="#Rmask"
///     Uint32 Gmask; // @link substring="Gmask" target="#Gmask"
///     Uint32 Bmask; // @link substring="Bmask" target="#Bmask"
///     Uint32 Amask; // @link substring="Amask" target="#Amask"
///     Uint8 Rbits; // @link substring="Rbits" target="#Rbits"
///     Uint8 Gbits; // @link substring="Gbits" target="#Gbits"
///     Uint8 Bbits; // @link substring="Bbits" target="#Bbits"
///     Uint8 Abits; // @link substring="Abits" target="#Abits"
///     Uint8 Rshift; // @link substring="Rshift" target="#Rshift"
///     Uint8 Gshift; // @link substring="Gshift" target="#Gshift"
///     Uint8 Bshift; // @link substring="Bshift" target="#Bshift"
///     Uint8 Ashift; // @link substring="Ashift" target="#Ashift"
/// } SDL_PixelFormatDetails;
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
public record SDL_PixelFormatDetails(@NotNull MemorySegment segment) implements ISDL_PixelFormatDetails {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link SDL_PixelFormatDetails}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// ISDL_PixelFormatDetails to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code SDL_PixelFormatDetails.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements ISDL_PixelFormatDetails, Iterable<SDL_PixelFormatDetails> {
        public long size() {
            return segment.byteSize() / SDL_PixelFormatDetails.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull SDL_PixelFormatDetails at(long index) {
            return new SDL_PixelFormatDetails(segment.asSlice(index * SDL_PixelFormatDetails.BYTES, SDL_PixelFormatDetails.BYTES));
        }

        public void write(long index, @NotNull SDL_PixelFormatDetails value) {
            MemorySegment s = segment.asSlice(index * SDL_PixelFormatDetails.BYTES, SDL_PixelFormatDetails.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * SDL_PixelFormatDetails.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * SDL_PixelFormatDetails.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * SDL_PixelFormatDetails.BYTES,
                (end - start) * SDL_PixelFormatDetails.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * SDL_PixelFormatDetails.BYTES));
        }

        public SDL_PixelFormatDetails[] toArray() {
            SDL_PixelFormatDetails[] ret = new SDL_PixelFormatDetails[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<SDL_PixelFormatDetails> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<SDL_PixelFormatDetails> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= SDL_PixelFormatDetails.BYTES;
            }

            @Override
            public SDL_PixelFormatDetails next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                SDL_PixelFormatDetails ret = new SDL_PixelFormatDetails(segment.asSlice(0, SDL_PixelFormatDetails.BYTES));
                segment = segment.asSlice(SDL_PixelFormatDetails.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static SDL_PixelFormatDetails allocate(Arena arena) {
        return new SDL_PixelFormatDetails(arena.allocate(LAYOUT));
    }

    public static SDL_PixelFormatDetails.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new SDL_PixelFormatDetails.Ptr(segment);
    }

    public static SDL_PixelFormatDetails clone(Arena arena, SDL_PixelFormatDetails src) {
        SDL_PixelFormatDetails ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @EnumType(SDL_PixelFormat.class) int format() {
        return segment.get(LAYOUT$format, OFFSET$format);
    }

    public SDL_PixelFormatDetails format(@EnumType(SDL_PixelFormat.class) int value) {
        segment.set(LAYOUT$format, OFFSET$format, value);
        return this;
    }

    public @NativeType("Uint8") @Unsigned byte bits_per_pixel() {
        return segment.get(LAYOUT$bits_per_pixel, OFFSET$bits_per_pixel);
    }

    public SDL_PixelFormatDetails bits_per_pixel(@NativeType("Uint8") @Unsigned byte value) {
        segment.set(LAYOUT$bits_per_pixel, OFFSET$bits_per_pixel, value);
        return this;
    }

    public @NativeType("Uint8") @Unsigned byte bytes_per_pixel() {
        return segment.get(LAYOUT$bytes_per_pixel, OFFSET$bytes_per_pixel);
    }

    public SDL_PixelFormatDetails bytes_per_pixel(@NativeType("Uint8") @Unsigned byte value) {
        segment.set(LAYOUT$bytes_per_pixel, OFFSET$bytes_per_pixel, value);
        return this;
    }

    public @Pointer(comment="Uint8") @Unsigned BytePtr padding() {
        return new BytePtr(paddingRaw());
    }

    public SDL_PixelFormatDetails padding(@Pointer(comment="Uint8") @Unsigned BytePtr value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$padding, SIZE$padding);
        return this;
    }

    public MemorySegment paddingRaw() {
        return segment.asSlice(OFFSET$padding, SIZE$padding);
    }

    public @NativeType("Uint32") @Unsigned int Rmask() {
        return segment.get(LAYOUT$Rmask, OFFSET$Rmask);
    }

    public SDL_PixelFormatDetails Rmask(@NativeType("Uint32") @Unsigned int value) {
        segment.set(LAYOUT$Rmask, OFFSET$Rmask, value);
        return this;
    }

    public @NativeType("Uint32") @Unsigned int Gmask() {
        return segment.get(LAYOUT$Gmask, OFFSET$Gmask);
    }

    public SDL_PixelFormatDetails Gmask(@NativeType("Uint32") @Unsigned int value) {
        segment.set(LAYOUT$Gmask, OFFSET$Gmask, value);
        return this;
    }

    public @NativeType("Uint32") @Unsigned int Bmask() {
        return segment.get(LAYOUT$Bmask, OFFSET$Bmask);
    }

    public SDL_PixelFormatDetails Bmask(@NativeType("Uint32") @Unsigned int value) {
        segment.set(LAYOUT$Bmask, OFFSET$Bmask, value);
        return this;
    }

    public @NativeType("Uint32") @Unsigned int Amask() {
        return segment.get(LAYOUT$Amask, OFFSET$Amask);
    }

    public SDL_PixelFormatDetails Amask(@NativeType("Uint32") @Unsigned int value) {
        segment.set(LAYOUT$Amask, OFFSET$Amask, value);
        return this;
    }

    public @NativeType("Uint8") @Unsigned byte Rbits() {
        return segment.get(LAYOUT$Rbits, OFFSET$Rbits);
    }

    public SDL_PixelFormatDetails Rbits(@NativeType("Uint8") @Unsigned byte value) {
        segment.set(LAYOUT$Rbits, OFFSET$Rbits, value);
        return this;
    }

    public @NativeType("Uint8") @Unsigned byte Gbits() {
        return segment.get(LAYOUT$Gbits, OFFSET$Gbits);
    }

    public SDL_PixelFormatDetails Gbits(@NativeType("Uint8") @Unsigned byte value) {
        segment.set(LAYOUT$Gbits, OFFSET$Gbits, value);
        return this;
    }

    public @NativeType("Uint8") @Unsigned byte Bbits() {
        return segment.get(LAYOUT$Bbits, OFFSET$Bbits);
    }

    public SDL_PixelFormatDetails Bbits(@NativeType("Uint8") @Unsigned byte value) {
        segment.set(LAYOUT$Bbits, OFFSET$Bbits, value);
        return this;
    }

    public @NativeType("Uint8") @Unsigned byte Abits() {
        return segment.get(LAYOUT$Abits, OFFSET$Abits);
    }

    public SDL_PixelFormatDetails Abits(@NativeType("Uint8") @Unsigned byte value) {
        segment.set(LAYOUT$Abits, OFFSET$Abits, value);
        return this;
    }

    public @NativeType("Uint8") @Unsigned byte Rshift() {
        return segment.get(LAYOUT$Rshift, OFFSET$Rshift);
    }

    public SDL_PixelFormatDetails Rshift(@NativeType("Uint8") @Unsigned byte value) {
        segment.set(LAYOUT$Rshift, OFFSET$Rshift, value);
        return this;
    }

    public @NativeType("Uint8") @Unsigned byte Gshift() {
        return segment.get(LAYOUT$Gshift, OFFSET$Gshift);
    }

    public SDL_PixelFormatDetails Gshift(@NativeType("Uint8") @Unsigned byte value) {
        segment.set(LAYOUT$Gshift, OFFSET$Gshift, value);
        return this;
    }

    public @NativeType("Uint8") @Unsigned byte Bshift() {
        return segment.get(LAYOUT$Bshift, OFFSET$Bshift);
    }

    public SDL_PixelFormatDetails Bshift(@NativeType("Uint8") @Unsigned byte value) {
        segment.set(LAYOUT$Bshift, OFFSET$Bshift, value);
        return this;
    }

    public @NativeType("Uint8") @Unsigned byte Ashift() {
        return segment.get(LAYOUT$Ashift, OFFSET$Ashift);
    }

    public SDL_PixelFormatDetails Ashift(@NativeType("Uint8") @Unsigned byte value) {
        segment.set(LAYOUT$Ashift, OFFSET$Ashift, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("format"),
        ValueLayout.JAVA_BYTE.withName("bits_per_pixel"),
        ValueLayout.JAVA_BYTE.withName("bytes_per_pixel"),
        MemoryLayout.sequenceLayout(2, ValueLayout.JAVA_BYTE).withName("padding"),
        ValueLayout.JAVA_INT.withName("Rmask"),
        ValueLayout.JAVA_INT.withName("Gmask"),
        ValueLayout.JAVA_INT.withName("Bmask"),
        ValueLayout.JAVA_INT.withName("Amask"),
        ValueLayout.JAVA_BYTE.withName("Rbits"),
        ValueLayout.JAVA_BYTE.withName("Gbits"),
        ValueLayout.JAVA_BYTE.withName("Bbits"),
        ValueLayout.JAVA_BYTE.withName("Abits"),
        ValueLayout.JAVA_BYTE.withName("Rshift"),
        ValueLayout.JAVA_BYTE.withName("Gshift"),
        ValueLayout.JAVA_BYTE.withName("Bshift"),
        ValueLayout.JAVA_BYTE.withName("Ashift")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$format = PathElement.groupElement("format");
    public static final PathElement PATH$bits_per_pixel = PathElement.groupElement("bits_per_pixel");
    public static final PathElement PATH$bytes_per_pixel = PathElement.groupElement("bytes_per_pixel");
    public static final PathElement PATH$padding = PathElement.groupElement("padding");
    public static final PathElement PATH$Rmask = PathElement.groupElement("Rmask");
    public static final PathElement PATH$Gmask = PathElement.groupElement("Gmask");
    public static final PathElement PATH$Bmask = PathElement.groupElement("Bmask");
    public static final PathElement PATH$Amask = PathElement.groupElement("Amask");
    public static final PathElement PATH$Rbits = PathElement.groupElement("Rbits");
    public static final PathElement PATH$Gbits = PathElement.groupElement("Gbits");
    public static final PathElement PATH$Bbits = PathElement.groupElement("Bbits");
    public static final PathElement PATH$Abits = PathElement.groupElement("Abits");
    public static final PathElement PATH$Rshift = PathElement.groupElement("Rshift");
    public static final PathElement PATH$Gshift = PathElement.groupElement("Gshift");
    public static final PathElement PATH$Bshift = PathElement.groupElement("Bshift");
    public static final PathElement PATH$Ashift = PathElement.groupElement("Ashift");

    public static final OfInt LAYOUT$format = (OfInt) LAYOUT.select(PATH$format);
    public static final OfByte LAYOUT$bits_per_pixel = (OfByte) LAYOUT.select(PATH$bits_per_pixel);
    public static final OfByte LAYOUT$bytes_per_pixel = (OfByte) LAYOUT.select(PATH$bytes_per_pixel);
    public static final SequenceLayout LAYOUT$padding = (SequenceLayout) LAYOUT.select(PATH$padding);
    public static final OfInt LAYOUT$Rmask = (OfInt) LAYOUT.select(PATH$Rmask);
    public static final OfInt LAYOUT$Gmask = (OfInt) LAYOUT.select(PATH$Gmask);
    public static final OfInt LAYOUT$Bmask = (OfInt) LAYOUT.select(PATH$Bmask);
    public static final OfInt LAYOUT$Amask = (OfInt) LAYOUT.select(PATH$Amask);
    public static final OfByte LAYOUT$Rbits = (OfByte) LAYOUT.select(PATH$Rbits);
    public static final OfByte LAYOUT$Gbits = (OfByte) LAYOUT.select(PATH$Gbits);
    public static final OfByte LAYOUT$Bbits = (OfByte) LAYOUT.select(PATH$Bbits);
    public static final OfByte LAYOUT$Abits = (OfByte) LAYOUT.select(PATH$Abits);
    public static final OfByte LAYOUT$Rshift = (OfByte) LAYOUT.select(PATH$Rshift);
    public static final OfByte LAYOUT$Gshift = (OfByte) LAYOUT.select(PATH$Gshift);
    public static final OfByte LAYOUT$Bshift = (OfByte) LAYOUT.select(PATH$Bshift);
    public static final OfByte LAYOUT$Ashift = (OfByte) LAYOUT.select(PATH$Ashift);

    public static final long SIZE$format = LAYOUT$format.byteSize();
    public static final long SIZE$bits_per_pixel = LAYOUT$bits_per_pixel.byteSize();
    public static final long SIZE$bytes_per_pixel = LAYOUT$bytes_per_pixel.byteSize();
    public static final long SIZE$padding = LAYOUT$padding.byteSize();
    public static final long SIZE$Rmask = LAYOUT$Rmask.byteSize();
    public static final long SIZE$Gmask = LAYOUT$Gmask.byteSize();
    public static final long SIZE$Bmask = LAYOUT$Bmask.byteSize();
    public static final long SIZE$Amask = LAYOUT$Amask.byteSize();
    public static final long SIZE$Rbits = LAYOUT$Rbits.byteSize();
    public static final long SIZE$Gbits = LAYOUT$Gbits.byteSize();
    public static final long SIZE$Bbits = LAYOUT$Bbits.byteSize();
    public static final long SIZE$Abits = LAYOUT$Abits.byteSize();
    public static final long SIZE$Rshift = LAYOUT$Rshift.byteSize();
    public static final long SIZE$Gshift = LAYOUT$Gshift.byteSize();
    public static final long SIZE$Bshift = LAYOUT$Bshift.byteSize();
    public static final long SIZE$Ashift = LAYOUT$Ashift.byteSize();

    public static final long OFFSET$format = LAYOUT.byteOffset(PATH$format);
    public static final long OFFSET$bits_per_pixel = LAYOUT.byteOffset(PATH$bits_per_pixel);
    public static final long OFFSET$bytes_per_pixel = LAYOUT.byteOffset(PATH$bytes_per_pixel);
    public static final long OFFSET$padding = LAYOUT.byteOffset(PATH$padding);
    public static final long OFFSET$Rmask = LAYOUT.byteOffset(PATH$Rmask);
    public static final long OFFSET$Gmask = LAYOUT.byteOffset(PATH$Gmask);
    public static final long OFFSET$Bmask = LAYOUT.byteOffset(PATH$Bmask);
    public static final long OFFSET$Amask = LAYOUT.byteOffset(PATH$Amask);
    public static final long OFFSET$Rbits = LAYOUT.byteOffset(PATH$Rbits);
    public static final long OFFSET$Gbits = LAYOUT.byteOffset(PATH$Gbits);
    public static final long OFFSET$Bbits = LAYOUT.byteOffset(PATH$Bbits);
    public static final long OFFSET$Abits = LAYOUT.byteOffset(PATH$Abits);
    public static final long OFFSET$Rshift = LAYOUT.byteOffset(PATH$Rshift);
    public static final long OFFSET$Gshift = LAYOUT.byteOffset(PATH$Gshift);
    public static final long OFFSET$Bshift = LAYOUT.byteOffset(PATH$Bshift);
    public static final long OFFSET$Ashift = LAYOUT.byteOffset(PATH$Ashift);
}
