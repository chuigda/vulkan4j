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

/// A structure containing a template for a Ramp effect.
///
/// This struct is exclusively for the SDL_HAPTIC_RAMP effect.
///
/// The ramp effect starts at start strength and ends at end strength. It
/// augments in linear fashion. If you use attack and fade with a ramp the
/// effects get added to the ramp effect making the effect become quadratic
/// instead of linear.
///
/// \since This struct is available since SDL 3.2.0.
///
/// \sa SDL_HAPTIC_RAMP
/// \sa SDL_HapticEffect
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct SDL_HapticRamp {
///     Uint16 type; // optional // @link substring="type" target="#type"
///     SDL_HapticDirection direction; // optional // @link substring="SDL_HapticDirection" target="SDL_HapticDirection" @link substring="direction" target="#direction"
///     Uint32 length; // optional // @link substring="length" target="#length"
///     Uint16 delay; // optional // @link substring="delay" target="#delay"
///     Uint16 button; // optional // @link substring="button" target="#button"
///     Uint16 interval; // optional // @link substring="interval" target="#interval"
///     Sint16 start; // optional // @link substring="start" target="#start"
///     Sint16 end; // optional // @link substring="end" target="#end"
///     Uint16 attack_length; // optional // @link substring="attack_length" target="#attack_length"
///     Uint16 attack_level; // optional // @link substring="attack_level" target="#attack_level"
///     Uint16 fade_length; // optional // @link substring="fade_length" target="#fade_length"
///     Uint16 fade_level; // optional // @link substring="fade_level" target="#fade_level"
/// } SDL_HapticRamp;
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
public record SDL_HapticRamp(@NotNull MemorySegment segment) implements ISDL_HapticRamp {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link SDL_HapticRamp}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// ISDL_HapticRamp to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code SDL_HapticRamp.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements ISDL_HapticRamp, Iterable<SDL_HapticRamp> {
        public long size() {
            return segment.byteSize() / SDL_HapticRamp.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull SDL_HapticRamp at(long index) {
            return new SDL_HapticRamp(segment.asSlice(index * SDL_HapticRamp.BYTES, SDL_HapticRamp.BYTES));
        }

        public void write(long index, @NotNull SDL_HapticRamp value) {
            MemorySegment s = segment.asSlice(index * SDL_HapticRamp.BYTES, SDL_HapticRamp.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * SDL_HapticRamp.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * SDL_HapticRamp.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * SDL_HapticRamp.BYTES,
                (end - start) * SDL_HapticRamp.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * SDL_HapticRamp.BYTES));
        }

        public SDL_HapticRamp[] toArray() {
            SDL_HapticRamp[] ret = new SDL_HapticRamp[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<SDL_HapticRamp> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<SDL_HapticRamp> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= SDL_HapticRamp.BYTES;
            }

            @Override
            public SDL_HapticRamp next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                SDL_HapticRamp ret = new SDL_HapticRamp(segment.asSlice(0, SDL_HapticRamp.BYTES));
                segment = segment.asSlice(SDL_HapticRamp.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static SDL_HapticRamp allocate(Arena arena) {
        return new SDL_HapticRamp(arena.allocate(LAYOUT));
    }

    public static SDL_HapticRamp.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new SDL_HapticRamp.Ptr(segment);
    }

    public static SDL_HapticRamp clone(Arena arena, SDL_HapticRamp src) {
        SDL_HapticRamp ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @NativeType("Uint16") @Unsigned short type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public SDL_HapticRamp type(@NativeType("Uint16") @Unsigned short value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
        return this;
    }

    public @NotNull SDL_HapticDirection direction() {
        return new SDL_HapticDirection(segment.asSlice(OFFSET$direction, LAYOUT$direction));
    }

    public SDL_HapticRamp direction(@NotNull SDL_HapticDirection value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$direction, SIZE$direction);
        return this;
    }

    public SDL_HapticRamp direction(Consumer<@NotNull SDL_HapticDirection> consumer) {
        consumer.accept(direction());
        return this;
    }

    public @NativeType("Uint32") @Unsigned int length() {
        return segment.get(LAYOUT$length, OFFSET$length);
    }

    public SDL_HapticRamp length(@NativeType("Uint32") @Unsigned int value) {
        segment.set(LAYOUT$length, OFFSET$length, value);
        return this;
    }

    public @NativeType("Uint16") @Unsigned short delay() {
        return segment.get(LAYOUT$delay, OFFSET$delay);
    }

    public SDL_HapticRamp delay(@NativeType("Uint16") @Unsigned short value) {
        segment.set(LAYOUT$delay, OFFSET$delay, value);
        return this;
    }

    public @NativeType("Uint16") @Unsigned short button() {
        return segment.get(LAYOUT$button, OFFSET$button);
    }

    public SDL_HapticRamp button(@NativeType("Uint16") @Unsigned short value) {
        segment.set(LAYOUT$button, OFFSET$button, value);
        return this;
    }

    public @NativeType("Uint16") @Unsigned short interval() {
        return segment.get(LAYOUT$interval, OFFSET$interval);
    }

    public SDL_HapticRamp interval(@NativeType("Uint16") @Unsigned short value) {
        segment.set(LAYOUT$interval, OFFSET$interval, value);
        return this;
    }

    public @NativeType("Sint16") short start() {
        return segment.get(LAYOUT$start, OFFSET$start);
    }

    public SDL_HapticRamp start(@NativeType("Sint16") short value) {
        segment.set(LAYOUT$start, OFFSET$start, value);
        return this;
    }

    public @NativeType("Sint16") short end() {
        return segment.get(LAYOUT$end, OFFSET$end);
    }

    public SDL_HapticRamp end(@NativeType("Sint16") short value) {
        segment.set(LAYOUT$end, OFFSET$end, value);
        return this;
    }

    public @NativeType("Uint16") @Unsigned short attack_length() {
        return segment.get(LAYOUT$attack_length, OFFSET$attack_length);
    }

    public SDL_HapticRamp attack_length(@NativeType("Uint16") @Unsigned short value) {
        segment.set(LAYOUT$attack_length, OFFSET$attack_length, value);
        return this;
    }

    public @NativeType("Uint16") @Unsigned short attack_level() {
        return segment.get(LAYOUT$attack_level, OFFSET$attack_level);
    }

    public SDL_HapticRamp attack_level(@NativeType("Uint16") @Unsigned short value) {
        segment.set(LAYOUT$attack_level, OFFSET$attack_level, value);
        return this;
    }

    public @NativeType("Uint16") @Unsigned short fade_length() {
        return segment.get(LAYOUT$fade_length, OFFSET$fade_length);
    }

    public SDL_HapticRamp fade_length(@NativeType("Uint16") @Unsigned short value) {
        segment.set(LAYOUT$fade_length, OFFSET$fade_length, value);
        return this;
    }

    public @NativeType("Uint16") @Unsigned short fade_level() {
        return segment.get(LAYOUT$fade_level, OFFSET$fade_level);
    }

    public SDL_HapticRamp fade_level(@NativeType("Uint16") @Unsigned short value) {
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
        ValueLayout.JAVA_SHORT.withName("start"),
        ValueLayout.JAVA_SHORT.withName("end"),
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
    public static final PathElement PATH$start = PathElement.groupElement("start");
    public static final PathElement PATH$end = PathElement.groupElement("end");
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
    public static final OfShort LAYOUT$start = (OfShort) LAYOUT.select(PATH$start);
    public static final OfShort LAYOUT$end = (OfShort) LAYOUT.select(PATH$end);
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
    public static final long SIZE$start = LAYOUT$start.byteSize();
    public static final long SIZE$end = LAYOUT$end.byteSize();
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
    public static final long OFFSET$start = LAYOUT.byteOffset(PATH$start);
    public static final long OFFSET$end = LAYOUT.byteOffset(PATH$end);
    public static final long OFFSET$attack_length = LAYOUT.byteOffset(PATH$attack_length);
    public static final long OFFSET$attack_level = LAYOUT.byteOffset(PATH$attack_level);
    public static final long OFFSET$fade_length = LAYOUT.byteOffset(PATH$fade_length);
    public static final long OFFSET$fade_level = LAYOUT.byteOffset(PATH$fade_level);
}
