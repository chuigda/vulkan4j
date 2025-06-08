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

/// A structure containing a template for a Periodic effect.
///
/// The struct handles the following effects:
///
/// - SDL_HAPTIC_SINE
/// - SDL_HAPTIC_SQUARE
/// - SDL_HAPTIC_TRIANGLE
/// - SDL_HAPTIC_SAWTOOTHUP
/// - SDL_HAPTIC_SAWTOOTHDOWN
///
/// A periodic effect consists in a wave-shaped effect that repeats itself over
/// time. The type determines the shape of the wave and the parameters
/// determine the dimensions of the wave.
///
/// Phase is given by hundredth of a degree meaning that giving the phase a
/// value of 9000 will displace it 25% of its period. Here are sample values:
///
/// - 0: No phase displacement.
/// - 9000: Displaced 25% of its period.
/// - 18000: Displaced 50% of its period.
/// - 27000: Displaced 75% of its period.
/// - 36000: Displaced 100% of its period, same as 0, but 0 is preferred.
///
/// Examples:
///
/// ```
///   SDL_HAPTIC_SINE
///     __      __      __      __
///    /  \    /  \    /  \    /
///   /    \__/    \__/    \__/
///
///   SDL_HAPTIC_SQUARE
///    __    __    __    __    __
///   |  |  |  |  |  |  |  |  |  |
///   |  |__|  |__|  |__|  |__|  |
///
///   SDL_HAPTIC_TRIANGLE
///     /\    /\    /\    /\    /\
///    /  \  /  \  /  \  /  \  /
///   /    \/    \/    \/    \/
///
///   SDL_HAPTIC_SAWTOOTHUP
///     /|  /|  /|  /|  /|  /|  /|
///    / | / | / | / | / | / | / |
///   /  |/  |/  |/  |/  |/  |/  |
///
///   SDL_HAPTIC_SAWTOOTHDOWN
///   \  |\  |\  |\  |\  |\  |\  |
///    \ | \ | \ | \ | \ | \ | \ |
///     \|  \|  \|  \|  \|  \|  \|
/// ```
///
/// \since This struct is available since SDL 3.2.0.
///
/// \sa SDL_HAPTIC_SINE
/// \sa SDL_HAPTIC_SQUARE
/// \sa SDL_HAPTIC_TRIANGLE
/// \sa SDL_HAPTIC_SAWTOOTHUP
/// \sa SDL_HAPTIC_SAWTOOTHDOWN
/// \sa SDL_HapticEffect
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct SDL_HapticPeriodic {
///     Uint16 type; // @link substring="type" target="#type"
///     SDL_HapticDirection direction; // @link substring="SDL_HapticDirection" target="SDL_HapticDirection" @link substring="direction" target="#direction"
///     Uint32 length; // @link substring="length" target="#length"
///     Uint16 delay; // @link substring="delay" target="#delay"
///     Uint16 button; // @link substring="button" target="#button"
///     Uint16 interval; // @link substring="interval" target="#interval"
///     Uint16 period; // @link substring="period" target="#period"
///     Sint16 magnitude; // @link substring="magnitude" target="#magnitude"
///     Sint16 offset; // @link substring="offset" target="#offset"
///     Uint16 phase; // @link substring="phase" target="#phase"
///     Uint16 attack_length; // @link substring="attack_length" target="#attack_length"
///     Uint16 attack_level; // @link substring="attack_level" target="#attack_level"
///     Uint16 fade_length; // @link substring="fade_length" target="#fade_length"
///     Uint16 fade_level; // @link substring="fade_level" target="#fade_level"
/// } SDL_HapticPeriodic;
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
public record SDL_HapticPeriodic(@NotNull MemorySegment segment) implements ISDL_HapticPeriodic {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link SDL_HapticPeriodic}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// ISDL_HapticPeriodic to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code SDL_HapticPeriodic.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements ISDL_HapticPeriodic, Iterable<SDL_HapticPeriodic> {
        public long size() {
            return segment.byteSize() / SDL_HapticPeriodic.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull SDL_HapticPeriodic at(long index) {
            return new SDL_HapticPeriodic(segment.asSlice(index * SDL_HapticPeriodic.BYTES, SDL_HapticPeriodic.BYTES));
        }

        public void write(long index, @NotNull SDL_HapticPeriodic value) {
            MemorySegment s = segment.asSlice(index * SDL_HapticPeriodic.BYTES, SDL_HapticPeriodic.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * SDL_HapticPeriodic.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * SDL_HapticPeriodic.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * SDL_HapticPeriodic.BYTES,
                (end - start) * SDL_HapticPeriodic.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * SDL_HapticPeriodic.BYTES));
        }

        public SDL_HapticPeriodic[] toArray() {
            SDL_HapticPeriodic[] ret = new SDL_HapticPeriodic[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<SDL_HapticPeriodic> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<SDL_HapticPeriodic> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= SDL_HapticPeriodic.BYTES;
            }

            @Override
            public SDL_HapticPeriodic next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                SDL_HapticPeriodic ret = new SDL_HapticPeriodic(segment.asSlice(0, SDL_HapticPeriodic.BYTES));
                segment = segment.asSlice(SDL_HapticPeriodic.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static SDL_HapticPeriodic allocate(Arena arena) {
        return new SDL_HapticPeriodic(arena.allocate(LAYOUT));
    }

    public static SDL_HapticPeriodic.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new SDL_HapticPeriodic.Ptr(segment);
    }

    public static SDL_HapticPeriodic clone(Arena arena, SDL_HapticPeriodic src) {
        SDL_HapticPeriodic ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @NativeType("Uint16") @Unsigned short type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public SDL_HapticPeriodic type(@NativeType("Uint16") @Unsigned short value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
        return this;
    }

    public @NotNull SDL_HapticDirection direction() {
        return new SDL_HapticDirection(segment.asSlice(OFFSET$direction, LAYOUT$direction));
    }

    public SDL_HapticPeriodic direction(@NotNull SDL_HapticDirection value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$direction, SIZE$direction);
        return this;
    }

    public SDL_HapticPeriodic direction(Consumer<@NotNull SDL_HapticDirection> consumer) {
        consumer.accept(direction());
        return this;
    }

    public @NativeType("Uint32") @Unsigned int length() {
        return segment.get(LAYOUT$length, OFFSET$length);
    }

    public SDL_HapticPeriodic length(@NativeType("Uint32") @Unsigned int value) {
        segment.set(LAYOUT$length, OFFSET$length, value);
        return this;
    }

    public @NativeType("Uint16") @Unsigned short delay() {
        return segment.get(LAYOUT$delay, OFFSET$delay);
    }

    public SDL_HapticPeriodic delay(@NativeType("Uint16") @Unsigned short value) {
        segment.set(LAYOUT$delay, OFFSET$delay, value);
        return this;
    }

    public @NativeType("Uint16") @Unsigned short button() {
        return segment.get(LAYOUT$button, OFFSET$button);
    }

    public SDL_HapticPeriodic button(@NativeType("Uint16") @Unsigned short value) {
        segment.set(LAYOUT$button, OFFSET$button, value);
        return this;
    }

    public @NativeType("Uint16") @Unsigned short interval() {
        return segment.get(LAYOUT$interval, OFFSET$interval);
    }

    public SDL_HapticPeriodic interval(@NativeType("Uint16") @Unsigned short value) {
        segment.set(LAYOUT$interval, OFFSET$interval, value);
        return this;
    }

    public @NativeType("Uint16") @Unsigned short period() {
        return segment.get(LAYOUT$period, OFFSET$period);
    }

    public SDL_HapticPeriodic period(@NativeType("Uint16") @Unsigned short value) {
        segment.set(LAYOUT$period, OFFSET$period, value);
        return this;
    }

    public @NativeType("Sint16") short magnitude() {
        return segment.get(LAYOUT$magnitude, OFFSET$magnitude);
    }

    public SDL_HapticPeriodic magnitude(@NativeType("Sint16") short value) {
        segment.set(LAYOUT$magnitude, OFFSET$magnitude, value);
        return this;
    }

    public @NativeType("Sint16") short offset() {
        return segment.get(LAYOUT$offset, OFFSET$offset);
    }

    public SDL_HapticPeriodic offset(@NativeType("Sint16") short value) {
        segment.set(LAYOUT$offset, OFFSET$offset, value);
        return this;
    }

    public @NativeType("Uint16") @Unsigned short phase() {
        return segment.get(LAYOUT$phase, OFFSET$phase);
    }

    public SDL_HapticPeriodic phase(@NativeType("Uint16") @Unsigned short value) {
        segment.set(LAYOUT$phase, OFFSET$phase, value);
        return this;
    }

    public @NativeType("Uint16") @Unsigned short attack_length() {
        return segment.get(LAYOUT$attack_length, OFFSET$attack_length);
    }

    public SDL_HapticPeriodic attack_length(@NativeType("Uint16") @Unsigned short value) {
        segment.set(LAYOUT$attack_length, OFFSET$attack_length, value);
        return this;
    }

    public @NativeType("Uint16") @Unsigned short attack_level() {
        return segment.get(LAYOUT$attack_level, OFFSET$attack_level);
    }

    public SDL_HapticPeriodic attack_level(@NativeType("Uint16") @Unsigned short value) {
        segment.set(LAYOUT$attack_level, OFFSET$attack_level, value);
        return this;
    }

    public @NativeType("Uint16") @Unsigned short fade_length() {
        return segment.get(LAYOUT$fade_length, OFFSET$fade_length);
    }

    public SDL_HapticPeriodic fade_length(@NativeType("Uint16") @Unsigned short value) {
        segment.set(LAYOUT$fade_length, OFFSET$fade_length, value);
        return this;
    }

    public @NativeType("Uint16") @Unsigned short fade_level() {
        return segment.get(LAYOUT$fade_level, OFFSET$fade_level);
    }

    public SDL_HapticPeriodic fade_level(@NativeType("Uint16") @Unsigned short value) {
        segment.set(LAYOUT$fade_level, OFFSET$fade_level, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_SHORT.withName("type"),
        SDL_HapticDirection.LAYOUT.withName("direction"),
        ValueLayout.JAVA_INT.withName("length"),
        ValueLayout.JAVA_SHORT.withName("delay"),
        ValueLayout.JAVA_SHORT.withName("button"),
        ValueLayout.JAVA_SHORT.withName("interval"),
        ValueLayout.JAVA_SHORT.withName("period"),
        ValueLayout.JAVA_SHORT.withName("magnitude"),
        ValueLayout.JAVA_SHORT.withName("offset"),
        ValueLayout.JAVA_SHORT.withName("phase"),
        ValueLayout.JAVA_SHORT.withName("attack_length"),
        ValueLayout.JAVA_SHORT.withName("attack_level"),
        ValueLayout.JAVA_SHORT.withName("fade_length"),
        ValueLayout.JAVA_SHORT.withName("fade_level")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$direction = PathElement.groupElement("direction");
    public static final PathElement PATH$length = PathElement.groupElement("length");
    public static final PathElement PATH$delay = PathElement.groupElement("delay");
    public static final PathElement PATH$button = PathElement.groupElement("button");
    public static final PathElement PATH$interval = PathElement.groupElement("interval");
    public static final PathElement PATH$period = PathElement.groupElement("period");
    public static final PathElement PATH$magnitude = PathElement.groupElement("magnitude");
    public static final PathElement PATH$offset = PathElement.groupElement("offset");
    public static final PathElement PATH$phase = PathElement.groupElement("phase");
    public static final PathElement PATH$attack_length = PathElement.groupElement("attack_length");
    public static final PathElement PATH$attack_level = PathElement.groupElement("attack_level");
    public static final PathElement PATH$fade_length = PathElement.groupElement("fade_length");
    public static final PathElement PATH$fade_level = PathElement.groupElement("fade_level");

    public static final OfShort LAYOUT$type = (OfShort) LAYOUT.select(PATH$type);
    public static final StructLayout LAYOUT$direction = (StructLayout) LAYOUT.select(PATH$direction);
    public static final OfInt LAYOUT$length = (OfInt) LAYOUT.select(PATH$length);
    public static final OfShort LAYOUT$delay = (OfShort) LAYOUT.select(PATH$delay);
    public static final OfShort LAYOUT$button = (OfShort) LAYOUT.select(PATH$button);
    public static final OfShort LAYOUT$interval = (OfShort) LAYOUT.select(PATH$interval);
    public static final OfShort LAYOUT$period = (OfShort) LAYOUT.select(PATH$period);
    public static final OfShort LAYOUT$magnitude = (OfShort) LAYOUT.select(PATH$magnitude);
    public static final OfShort LAYOUT$offset = (OfShort) LAYOUT.select(PATH$offset);
    public static final OfShort LAYOUT$phase = (OfShort) LAYOUT.select(PATH$phase);
    public static final OfShort LAYOUT$attack_length = (OfShort) LAYOUT.select(PATH$attack_length);
    public static final OfShort LAYOUT$attack_level = (OfShort) LAYOUT.select(PATH$attack_level);
    public static final OfShort LAYOUT$fade_length = (OfShort) LAYOUT.select(PATH$fade_length);
    public static final OfShort LAYOUT$fade_level = (OfShort) LAYOUT.select(PATH$fade_level);

    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$direction = LAYOUT$direction.byteSize();
    public static final long SIZE$length = LAYOUT$length.byteSize();
    public static final long SIZE$delay = LAYOUT$delay.byteSize();
    public static final long SIZE$button = LAYOUT$button.byteSize();
    public static final long SIZE$interval = LAYOUT$interval.byteSize();
    public static final long SIZE$period = LAYOUT$period.byteSize();
    public static final long SIZE$magnitude = LAYOUT$magnitude.byteSize();
    public static final long SIZE$offset = LAYOUT$offset.byteSize();
    public static final long SIZE$phase = LAYOUT$phase.byteSize();
    public static final long SIZE$attack_length = LAYOUT$attack_length.byteSize();
    public static final long SIZE$attack_level = LAYOUT$attack_level.byteSize();
    public static final long SIZE$fade_length = LAYOUT$fade_length.byteSize();
    public static final long SIZE$fade_level = LAYOUT$fade_level.byteSize();

    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$direction = LAYOUT.byteOffset(PATH$direction);
    public static final long OFFSET$length = LAYOUT.byteOffset(PATH$length);
    public static final long OFFSET$delay = LAYOUT.byteOffset(PATH$delay);
    public static final long OFFSET$button = LAYOUT.byteOffset(PATH$button);
    public static final long OFFSET$interval = LAYOUT.byteOffset(PATH$interval);
    public static final long OFFSET$period = LAYOUT.byteOffset(PATH$period);
    public static final long OFFSET$magnitude = LAYOUT.byteOffset(PATH$magnitude);
    public static final long OFFSET$offset = LAYOUT.byteOffset(PATH$offset);
    public static final long OFFSET$phase = LAYOUT.byteOffset(PATH$phase);
    public static final long OFFSET$attack_length = LAYOUT.byteOffset(PATH$attack_length);
    public static final long OFFSET$attack_level = LAYOUT.byteOffset(PATH$attack_level);
    public static final long OFFSET$fade_length = LAYOUT.byteOffset(PATH$fade_length);
    public static final long OFFSET$fade_level = LAYOUT.byteOffset(PATH$fade_level);
}
