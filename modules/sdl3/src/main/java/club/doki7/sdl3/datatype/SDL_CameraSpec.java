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

/// The details of an output format for a camera device.
///
/// Cameras often support multiple formats; each one will be encapsulated in
/// this struct.
///
/// \since This struct is available since SDL 3.2.0.
///
/// \sa SDL_GetCameraSupportedFormats
/// \sa SDL_GetCameraFormat
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct SDL_CameraSpec {
///     SDL_PixelFormat format; // @link substring="SDL_PixelFormat" target="SDL_PixelFormat" @link substring="format" target="#format"
///     SDL_Colorspace colorspace; // @link substring="SDL_Colorspace" target="SDL_Colorspace" @link substring="colorspace" target="#colorspace"
///     int width; // @link substring="width" target="#width"
///     int height; // @link substring="height" target="#height"
///     int framerate_numerator; // @link substring="framerate_numerator" target="#framerate_numerator"
///     int framerate_denominator; // @link substring="framerate_denominator" target="#framerate_denominator"
/// } SDL_CameraSpec;
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
public record SDL_CameraSpec(@NotNull MemorySegment segment) implements ISDL_CameraSpec {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link SDL_CameraSpec}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// ISDL_CameraSpec to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code SDL_CameraSpec.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements ISDL_CameraSpec, Iterable<SDL_CameraSpec> {
        public long size() {
            return segment.byteSize() / SDL_CameraSpec.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull SDL_CameraSpec at(long index) {
            return new SDL_CameraSpec(segment.asSlice(index * SDL_CameraSpec.BYTES, SDL_CameraSpec.BYTES));
        }

        public void write(long index, @NotNull SDL_CameraSpec value) {
            MemorySegment s = segment.asSlice(index * SDL_CameraSpec.BYTES, SDL_CameraSpec.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * SDL_CameraSpec.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * SDL_CameraSpec.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * SDL_CameraSpec.BYTES,
                (end - start) * SDL_CameraSpec.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * SDL_CameraSpec.BYTES));
        }

        public SDL_CameraSpec[] toArray() {
            SDL_CameraSpec[] ret = new SDL_CameraSpec[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<SDL_CameraSpec> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<SDL_CameraSpec> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= SDL_CameraSpec.BYTES;
            }

            @Override
            public SDL_CameraSpec next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                SDL_CameraSpec ret = new SDL_CameraSpec(segment.asSlice(0, SDL_CameraSpec.BYTES));
                segment = segment.asSlice(SDL_CameraSpec.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static SDL_CameraSpec allocate(Arena arena) {
        return new SDL_CameraSpec(arena.allocate(LAYOUT));
    }

    public static SDL_CameraSpec.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new SDL_CameraSpec.Ptr(segment);
    }

    public static SDL_CameraSpec clone(Arena arena, SDL_CameraSpec src) {
        SDL_CameraSpec ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @EnumType(SDL_PixelFormat.class) int format() {
        return segment.get(LAYOUT$format, OFFSET$format);
    }

    public SDL_CameraSpec format(@EnumType(SDL_PixelFormat.class) int value) {
        segment.set(LAYOUT$format, OFFSET$format, value);
        return this;
    }

    public @EnumType(SDL_Colorspace.class) int colorspace() {
        return segment.get(LAYOUT$colorspace, OFFSET$colorspace);
    }

    public SDL_CameraSpec colorspace(@EnumType(SDL_Colorspace.class) int value) {
        segment.set(LAYOUT$colorspace, OFFSET$colorspace, value);
        return this;
    }

    public int width() {
        return segment.get(LAYOUT$width, OFFSET$width);
    }

    public SDL_CameraSpec width(int value) {
        segment.set(LAYOUT$width, OFFSET$width, value);
        return this;
    }

    public int height() {
        return segment.get(LAYOUT$height, OFFSET$height);
    }

    public SDL_CameraSpec height(int value) {
        segment.set(LAYOUT$height, OFFSET$height, value);
        return this;
    }

    public int framerate_numerator() {
        return segment.get(LAYOUT$framerate_numerator, OFFSET$framerate_numerator);
    }

    public SDL_CameraSpec framerate_numerator(int value) {
        segment.set(LAYOUT$framerate_numerator, OFFSET$framerate_numerator, value);
        return this;
    }

    public int framerate_denominator() {
        return segment.get(LAYOUT$framerate_denominator, OFFSET$framerate_denominator);
    }

    public SDL_CameraSpec framerate_denominator(int value) {
        segment.set(LAYOUT$framerate_denominator, OFFSET$framerate_denominator, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("format"),
        ValueLayout.JAVA_INT.withName("colorspace"),
        ValueLayout.JAVA_INT.withName("width"),
        ValueLayout.JAVA_INT.withName("height"),
        ValueLayout.JAVA_INT.withName("framerate_numerator"),
        ValueLayout.JAVA_INT.withName("framerate_denominator")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$format = PathElement.groupElement("format");
    public static final PathElement PATH$colorspace = PathElement.groupElement("colorspace");
    public static final PathElement PATH$width = PathElement.groupElement("width");
    public static final PathElement PATH$height = PathElement.groupElement("height");
    public static final PathElement PATH$framerate_numerator = PathElement.groupElement("framerate_numerator");
    public static final PathElement PATH$framerate_denominator = PathElement.groupElement("framerate_denominator");

    public static final OfInt LAYOUT$format = (OfInt) LAYOUT.select(PATH$format);
    public static final OfInt LAYOUT$colorspace = (OfInt) LAYOUT.select(PATH$colorspace);
    public static final OfInt LAYOUT$width = (OfInt) LAYOUT.select(PATH$width);
    public static final OfInt LAYOUT$height = (OfInt) LAYOUT.select(PATH$height);
    public static final OfInt LAYOUT$framerate_numerator = (OfInt) LAYOUT.select(PATH$framerate_numerator);
    public static final OfInt LAYOUT$framerate_denominator = (OfInt) LAYOUT.select(PATH$framerate_denominator);

    public static final long SIZE$format = LAYOUT$format.byteSize();
    public static final long SIZE$colorspace = LAYOUT$colorspace.byteSize();
    public static final long SIZE$width = LAYOUT$width.byteSize();
    public static final long SIZE$height = LAYOUT$height.byteSize();
    public static final long SIZE$framerate_numerator = LAYOUT$framerate_numerator.byteSize();
    public static final long SIZE$framerate_denominator = LAYOUT$framerate_denominator.byteSize();

    public static final long OFFSET$format = LAYOUT.byteOffset(PATH$format);
    public static final long OFFSET$colorspace = LAYOUT.byteOffset(PATH$colorspace);
    public static final long OFFSET$width = LAYOUT.byteOffset(PATH$width);
    public static final long OFFSET$height = LAYOUT.byteOffset(PATH$height);
    public static final long OFFSET$framerate_numerator = LAYOUT.byteOffset(PATH$framerate_numerator);
    public static final long OFFSET$framerate_denominator = LAYOUT.byteOffset(PATH$framerate_denominator);
}
