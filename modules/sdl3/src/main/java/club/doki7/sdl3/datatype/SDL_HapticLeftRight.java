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

/// A structure containing a template for a Left/Right effect.
///
/// This struct is exclusively for the SDL_HAPTIC_LEFTRIGHT effect.
///
/// The Left/Right effect is used to explicitly control the large and small
/// motors, commonly found in modern game controllers. The small (right) motor
/// is high frequency, and the large (left) motor is low frequency.
///
/// \since This struct is available since SDL 3.2.0.
///
/// \sa SDL_HAPTIC_LEFTRIGHT
/// \sa SDL_HapticEffect
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct SDL_HapticLeftRight {
///     Uint16 type; // @link substring="type" target="#type"
///     Uint32 length; // @link substring="length" target="#length"
///     Uint16 large_magnitude; // @link substring="large_magnitude" target="#large_magnitude"
///     Uint16 small_magnitude; // @link substring="small_magnitude" target="#small_magnitude"
/// } SDL_HapticLeftRight;
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
public record SDL_HapticLeftRight(@NotNull MemorySegment segment) implements ISDL_HapticLeftRight {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link SDL_HapticLeftRight}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// ISDL_HapticLeftRight to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code SDL_HapticLeftRight.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements ISDL_HapticLeftRight, Iterable<SDL_HapticLeftRight> {
        public long size() {
            return segment.byteSize() / SDL_HapticLeftRight.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull SDL_HapticLeftRight at(long index) {
            return new SDL_HapticLeftRight(segment.asSlice(index * SDL_HapticLeftRight.BYTES, SDL_HapticLeftRight.BYTES));
        }

        public void write(long index, @NotNull SDL_HapticLeftRight value) {
            MemorySegment s = segment.asSlice(index * SDL_HapticLeftRight.BYTES, SDL_HapticLeftRight.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * SDL_HapticLeftRight.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * SDL_HapticLeftRight.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * SDL_HapticLeftRight.BYTES,
                (end - start) * SDL_HapticLeftRight.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * SDL_HapticLeftRight.BYTES));
        }

        public SDL_HapticLeftRight[] toArray() {
            SDL_HapticLeftRight[] ret = new SDL_HapticLeftRight[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<SDL_HapticLeftRight> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<SDL_HapticLeftRight> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= SDL_HapticLeftRight.BYTES;
            }

            @Override
            public SDL_HapticLeftRight next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                SDL_HapticLeftRight ret = new SDL_HapticLeftRight(segment.asSlice(0, SDL_HapticLeftRight.BYTES));
                segment = segment.asSlice(SDL_HapticLeftRight.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static SDL_HapticLeftRight allocate(Arena arena) {
        return new SDL_HapticLeftRight(arena.allocate(LAYOUT));
    }

    public static SDL_HapticLeftRight.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new SDL_HapticLeftRight.Ptr(segment);
    }

    public static SDL_HapticLeftRight clone(Arena arena, SDL_HapticLeftRight src) {
        SDL_HapticLeftRight ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @NativeType("Uint16") @Unsigned short type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public SDL_HapticLeftRight type(@NativeType("Uint16") @Unsigned short value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
        return this;
    }

    public @NativeType("Uint32") @Unsigned int length() {
        return segment.get(LAYOUT$length, OFFSET$length);
    }

    public SDL_HapticLeftRight length(@NativeType("Uint32") @Unsigned int value) {
        segment.set(LAYOUT$length, OFFSET$length, value);
        return this;
    }

    public @NativeType("Uint16") @Unsigned short large_magnitude() {
        return segment.get(LAYOUT$large_magnitude, OFFSET$large_magnitude);
    }

    public SDL_HapticLeftRight large_magnitude(@NativeType("Uint16") @Unsigned short value) {
        segment.set(LAYOUT$large_magnitude, OFFSET$large_magnitude, value);
        return this;
    }

    public @NativeType("Uint16") @Unsigned short small_magnitude() {
        return segment.get(LAYOUT$small_magnitude, OFFSET$small_magnitude);
    }

    public SDL_HapticLeftRight small_magnitude(@NativeType("Uint16") @Unsigned short value) {
        segment.set(LAYOUT$small_magnitude, OFFSET$small_magnitude, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_SHORT.withName("type"),
        ValueLayout.JAVA_INT.withName("length"),
        ValueLayout.JAVA_SHORT.withName("large_magnitude"),
        ValueLayout.JAVA_SHORT.withName("small_magnitude")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$length = PathElement.groupElement("length");
    public static final PathElement PATH$large_magnitude = PathElement.groupElement("large_magnitude");
    public static final PathElement PATH$small_magnitude = PathElement.groupElement("small_magnitude");

    public static final OfShort LAYOUT$type = (OfShort) LAYOUT.select(PATH$type);
    public static final OfInt LAYOUT$length = (OfInt) LAYOUT.select(PATH$length);
    public static final OfShort LAYOUT$large_magnitude = (OfShort) LAYOUT.select(PATH$large_magnitude);
    public static final OfShort LAYOUT$small_magnitude = (OfShort) LAYOUT.select(PATH$small_magnitude);

    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$length = LAYOUT$length.byteSize();
    public static final long SIZE$large_magnitude = LAYOUT$large_magnitude.byteSize();
    public static final long SIZE$small_magnitude = LAYOUT$small_magnitude.byteSize();

    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$length = LAYOUT.byteOffset(PATH$length);
    public static final long OFFSET$large_magnitude = LAYOUT.byteOffset(PATH$large_magnitude);
    public static final long OFFSET$small_magnitude = LAYOUT.byteOffset(PATH$small_magnitude);
}
