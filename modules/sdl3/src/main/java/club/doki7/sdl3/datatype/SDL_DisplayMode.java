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

/// The structure that defines a display mode.
///
/// \since This struct is available since SDL 3.2.0.
///
/// \sa SDL_GetFullscreenDisplayModes
/// \sa SDL_GetDesktopDisplayMode
/// \sa SDL_GetCurrentDisplayMode
/// \sa SDL_SetWindowFullscreenMode
/// \sa SDL_GetWindowFullscreenMode
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct SDL_DisplayMode {
///     SDL_DisplayID displayID; // @link substring="displayID" target="#displayID"
///     SDL_PixelFormat format; // @link substring="SDL_PixelFormat" target="SDL_PixelFormat" @link substring="format" target="#format"
///     int w; // @link substring="w" target="#w"
///     int h; // @link substring="h" target="#h"
///     float pixel_density; // @link substring="pixel_density" target="#pixel_density"
///     float refresh_rate; // @link substring="refresh_rate" target="#refresh_rate"
///     int refresh_rate_numerator; // @link substring="refresh_rate_numerator" target="#refresh_rate_numerator"
///     int refresh_rate_denominator; // @link substring="refresh_rate_denominator" target="#refresh_rate_denominator"
///     SDL_DisplayModeData* internal; // @link substring="SDL_DisplayModeData" target="SDL_DisplayModeData" @link substring="internal" target="#internal"
/// } SDL_DisplayMode;
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
public record SDL_DisplayMode(@NotNull MemorySegment segment) implements ISDL_DisplayMode {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link SDL_DisplayMode}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// ISDL_DisplayMode to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code SDL_DisplayMode.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements ISDL_DisplayMode, Iterable<SDL_DisplayMode> {
        public long size() {
            return segment.byteSize() / SDL_DisplayMode.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull SDL_DisplayMode at(long index) {
            return new SDL_DisplayMode(segment.asSlice(index * SDL_DisplayMode.BYTES, SDL_DisplayMode.BYTES));
        }

        public void write(long index, @NotNull SDL_DisplayMode value) {
            MemorySegment s = segment.asSlice(index * SDL_DisplayMode.BYTES, SDL_DisplayMode.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * SDL_DisplayMode.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * SDL_DisplayMode.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * SDL_DisplayMode.BYTES,
                (end - start) * SDL_DisplayMode.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * SDL_DisplayMode.BYTES));
        }

        public SDL_DisplayMode[] toArray() {
            SDL_DisplayMode[] ret = new SDL_DisplayMode[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<SDL_DisplayMode> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<SDL_DisplayMode> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= SDL_DisplayMode.BYTES;
            }

            @Override
            public SDL_DisplayMode next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                SDL_DisplayMode ret = new SDL_DisplayMode(segment.asSlice(0, SDL_DisplayMode.BYTES));
                segment = segment.asSlice(SDL_DisplayMode.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static SDL_DisplayMode allocate(Arena arena) {
        return new SDL_DisplayMode(arena.allocate(LAYOUT));
    }

    public static SDL_DisplayMode.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new SDL_DisplayMode.Ptr(segment);
    }

    public static SDL_DisplayMode clone(Arena arena, SDL_DisplayMode src) {
        SDL_DisplayMode ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @NativeType("SDL_DisplayID") @Unsigned int displayID() {
        return segment.get(LAYOUT$displayID, OFFSET$displayID);
    }

    public SDL_DisplayMode displayID(@NativeType("SDL_DisplayID") @Unsigned int value) {
        segment.set(LAYOUT$displayID, OFFSET$displayID, value);
        return this;
    }

    public @EnumType(SDL_PixelFormat.class) int format() {
        return segment.get(LAYOUT$format, OFFSET$format);
    }

    public SDL_DisplayMode format(@EnumType(SDL_PixelFormat.class) int value) {
        segment.set(LAYOUT$format, OFFSET$format, value);
        return this;
    }

    public int w() {
        return segment.get(LAYOUT$w, OFFSET$w);
    }

    public SDL_DisplayMode w(int value) {
        segment.set(LAYOUT$w, OFFSET$w, value);
        return this;
    }

    public int h() {
        return segment.get(LAYOUT$h, OFFSET$h);
    }

    public SDL_DisplayMode h(int value) {
        segment.set(LAYOUT$h, OFFSET$h, value);
        return this;
    }

    public float pixel_density() {
        return segment.get(LAYOUT$pixel_density, OFFSET$pixel_density);
    }

    public SDL_DisplayMode pixel_density(float value) {
        segment.set(LAYOUT$pixel_density, OFFSET$pixel_density, value);
        return this;
    }

    public float refresh_rate() {
        return segment.get(LAYOUT$refresh_rate, OFFSET$refresh_rate);
    }

    public SDL_DisplayMode refresh_rate(float value) {
        segment.set(LAYOUT$refresh_rate, OFFSET$refresh_rate, value);
        return this;
    }

    public int refresh_rate_numerator() {
        return segment.get(LAYOUT$refresh_rate_numerator, OFFSET$refresh_rate_numerator);
    }

    public SDL_DisplayMode refresh_rate_numerator(int value) {
        segment.set(LAYOUT$refresh_rate_numerator, OFFSET$refresh_rate_numerator, value);
        return this;
    }

    public int refresh_rate_denominator() {
        return segment.get(LAYOUT$refresh_rate_denominator, OFFSET$refresh_rate_denominator);
    }

    public SDL_DisplayMode refresh_rate_denominator(int value) {
        segment.set(LAYOUT$refresh_rate_denominator, OFFSET$refresh_rate_denominator, value);
        return this;
    }

    public @Nullable SDL_DisplayModeData internal() {
        MemorySegment s = segment.asSlice(OFFSET$internal, SIZE$internal);
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new SDL_DisplayModeData(s);
    }

    public SDL_DisplayMode internal(@Nullable SDL_DisplayModeData value) {
        segment.set(LAYOUT$internal, OFFSET$internal, value != null ? value.segment() : MemorySegment.NULL);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("displayID"),
        ValueLayout.JAVA_INT.withName("format"),
        ValueLayout.JAVA_INT.withName("w"),
        ValueLayout.JAVA_INT.withName("h"),
        ValueLayout.JAVA_FLOAT.withName("pixel_density"),
        ValueLayout.JAVA_FLOAT.withName("refresh_rate"),
        ValueLayout.JAVA_INT.withName("refresh_rate_numerator"),
        ValueLayout.JAVA_INT.withName("refresh_rate_denominator"),
        ValueLayout.ADDRESS.withName("internal")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$displayID = PathElement.groupElement("displayID");
    public static final PathElement PATH$format = PathElement.groupElement("format");
    public static final PathElement PATH$w = PathElement.groupElement("w");
    public static final PathElement PATH$h = PathElement.groupElement("h");
    public static final PathElement PATH$pixel_density = PathElement.groupElement("pixel_density");
    public static final PathElement PATH$refresh_rate = PathElement.groupElement("refresh_rate");
    public static final PathElement PATH$refresh_rate_numerator = PathElement.groupElement("refresh_rate_numerator");
    public static final PathElement PATH$refresh_rate_denominator = PathElement.groupElement("refresh_rate_denominator");
    public static final PathElement PATH$internal = PathElement.groupElement("internal");

    public static final OfInt LAYOUT$displayID = (OfInt) LAYOUT.select(PATH$displayID);
    public static final OfInt LAYOUT$format = (OfInt) LAYOUT.select(PATH$format);
    public static final OfInt LAYOUT$w = (OfInt) LAYOUT.select(PATH$w);
    public static final OfInt LAYOUT$h = (OfInt) LAYOUT.select(PATH$h);
    public static final OfFloat LAYOUT$pixel_density = (OfFloat) LAYOUT.select(PATH$pixel_density);
    public static final OfFloat LAYOUT$refresh_rate = (OfFloat) LAYOUT.select(PATH$refresh_rate);
    public static final OfInt LAYOUT$refresh_rate_numerator = (OfInt) LAYOUT.select(PATH$refresh_rate_numerator);
    public static final OfInt LAYOUT$refresh_rate_denominator = (OfInt) LAYOUT.select(PATH$refresh_rate_denominator);
    public static final AddressLayout LAYOUT$internal = (AddressLayout) LAYOUT.select(PATH$internal);

    public static final long SIZE$displayID = LAYOUT$displayID.byteSize();
    public static final long SIZE$format = LAYOUT$format.byteSize();
    public static final long SIZE$w = LAYOUT$w.byteSize();
    public static final long SIZE$h = LAYOUT$h.byteSize();
    public static final long SIZE$pixel_density = LAYOUT$pixel_density.byteSize();
    public static final long SIZE$refresh_rate = LAYOUT$refresh_rate.byteSize();
    public static final long SIZE$refresh_rate_numerator = LAYOUT$refresh_rate_numerator.byteSize();
    public static final long SIZE$refresh_rate_denominator = LAYOUT$refresh_rate_denominator.byteSize();
    public static final long SIZE$internal = LAYOUT$internal.byteSize();

    public static final long OFFSET$displayID = LAYOUT.byteOffset(PATH$displayID);
    public static final long OFFSET$format = LAYOUT.byteOffset(PATH$format);
    public static final long OFFSET$w = LAYOUT.byteOffset(PATH$w);
    public static final long OFFSET$h = LAYOUT.byteOffset(PATH$h);
    public static final long OFFSET$pixel_density = LAYOUT.byteOffset(PATH$pixel_density);
    public static final long OFFSET$refresh_rate = LAYOUT.byteOffset(PATH$refresh_rate);
    public static final long OFFSET$refresh_rate_numerator = LAYOUT.byteOffset(PATH$refresh_rate_numerator);
    public static final long OFFSET$refresh_rate_denominator = LAYOUT.byteOffset(PATH$refresh_rate_denominator);
    public static final long OFFSET$internal = LAYOUT.byteOffset(PATH$internal);
}
