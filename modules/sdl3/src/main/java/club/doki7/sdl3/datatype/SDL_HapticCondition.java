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

/// A structure containing a template for a Condition effect.
///
/// The struct handles the following effects:
///
/// - SDL_HAPTIC_SPRING: Effect based on axes position.
/// - SDL_HAPTIC_DAMPER: Effect based on axes velocity.
/// - SDL_HAPTIC_INERTIA: Effect based on axes acceleration.
/// - SDL_HAPTIC_FRICTION: Effect based on axes movement.
///
/// Direction is handled by condition internals instead of a direction member.
/// The condition effect specific members have three parameters. The first
/// refers to the X axis, the second refers to the Y axis and the third refers
/// to the Z axis. The right terms refer to the positive side of the axis and
/// the left terms refer to the negative side of the axis. Please refer to the
/// SDL_HapticDirection diagram for which side is positive and which is
/// negative.
///
/// Since: This struct is available since SDL 3.2.0.
///
/// See also:
/// - `SDL_HapticDirection`
/// - `SDL_HAPTIC_SPRING`
/// - `SDL_HAPTIC_DAMPER`
/// - `SDL_HAPTIC_INERTIA`
/// - `SDL_HAPTIC_FRICTION`
/// - `SDL_HapticEffect`
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct SDL_HapticCondition {
///     Uint16 type; // @link substring="type" target="#type"
///     SDL_HapticDirection direction; // @link substring="SDL_HapticDirection" target="SDL_HapticDirection" @link substring="direction" target="#direction"
///     Uint32 length; // @link substring="length" target="#length"
///     Uint16 delay; // @link substring="delay" target="#delay"
///     Uint16 button; // @link substring="button" target="#button"
///     Uint16 interval; // @link substring="interval" target="#interval"
///     Uint16[3] right_sat; // @link substring="right_sat" target="#right_sat"
///     Uint16[3] left_sat; // @link substring="left_sat" target="#left_sat"
///     Sint16[3] right_coeff; // @link substring="right_coeff" target="#right_coeff"
///     Sint16[3] left_coeff; // @link substring="left_coeff" target="#left_coeff"
///     Uint16[3] deadband; // @link substring="deadband" target="#deadband"
///     Sint16[3] center; // @link substring="center" target="#center"
/// } SDL_HapticCondition;
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
public record SDL_HapticCondition(@NotNull MemorySegment segment) implements ISDL_HapticCondition {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link SDL_HapticCondition}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// ISDL_HapticCondition to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code SDL_HapticCondition.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements ISDL_HapticCondition, Iterable<SDL_HapticCondition> {
        public long size() {
            return segment.byteSize() / SDL_HapticCondition.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull SDL_HapticCondition at(long index) {
            return new SDL_HapticCondition(segment.asSlice(index * SDL_HapticCondition.BYTES, SDL_HapticCondition.BYTES));
        }

        public void write(long index, @NotNull SDL_HapticCondition value) {
            MemorySegment s = segment.asSlice(index * SDL_HapticCondition.BYTES, SDL_HapticCondition.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * SDL_HapticCondition.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * SDL_HapticCondition.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * SDL_HapticCondition.BYTES,
                (end - start) * SDL_HapticCondition.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * SDL_HapticCondition.BYTES));
        }

        public SDL_HapticCondition[] toArray() {
            SDL_HapticCondition[] ret = new SDL_HapticCondition[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<SDL_HapticCondition> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<SDL_HapticCondition> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= SDL_HapticCondition.BYTES;
            }

            @Override
            public SDL_HapticCondition next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                SDL_HapticCondition ret = new SDL_HapticCondition(segment.asSlice(0, SDL_HapticCondition.BYTES));
                segment = segment.asSlice(SDL_HapticCondition.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static SDL_HapticCondition allocate(Arena arena) {
        return new SDL_HapticCondition(arena.allocate(LAYOUT));
    }

    public static SDL_HapticCondition.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new SDL_HapticCondition.Ptr(segment);
    }

    public static SDL_HapticCondition clone(Arena arena, SDL_HapticCondition src) {
        SDL_HapticCondition ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @NativeType("Uint16") @Unsigned short type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public SDL_HapticCondition type(@NativeType("Uint16") @Unsigned short value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
        return this;
    }

    public @NotNull SDL_HapticDirection direction() {
        return new SDL_HapticDirection(segment.asSlice(OFFSET$direction, LAYOUT$direction));
    }

    public SDL_HapticCondition direction(@NotNull SDL_HapticDirection value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$direction, SIZE$direction);
        return this;
    }

    public SDL_HapticCondition direction(Consumer<@NotNull SDL_HapticDirection> consumer) {
        consumer.accept(direction());
        return this;
    }

    public @NativeType("Uint32") @Unsigned int length() {
        return segment.get(LAYOUT$length, OFFSET$length);
    }

    public SDL_HapticCondition length(@NativeType("Uint32") @Unsigned int value) {
        segment.set(LAYOUT$length, OFFSET$length, value);
        return this;
    }

    public @NativeType("Uint16") @Unsigned short delay() {
        return segment.get(LAYOUT$delay, OFFSET$delay);
    }

    public SDL_HapticCondition delay(@NativeType("Uint16") @Unsigned short value) {
        segment.set(LAYOUT$delay, OFFSET$delay, value);
        return this;
    }

    public @NativeType("Uint16") @Unsigned short button() {
        return segment.get(LAYOUT$button, OFFSET$button);
    }

    public SDL_HapticCondition button(@NativeType("Uint16") @Unsigned short value) {
        segment.set(LAYOUT$button, OFFSET$button, value);
        return this;
    }

    public @NativeType("Uint16") @Unsigned short interval() {
        return segment.get(LAYOUT$interval, OFFSET$interval);
    }

    public SDL_HapticCondition interval(@NativeType("Uint16") @Unsigned short value) {
        segment.set(LAYOUT$interval, OFFSET$interval, value);
        return this;
    }

    public @Pointer(comment="Uint16") @Unsigned ShortPtr right_sat() {
        return new ShortPtr(right_satRaw());
    }

    public SDL_HapticCondition right_sat(@Pointer(comment="Uint16") @Unsigned ShortPtr value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$right_sat, SIZE$right_sat);
        return this;
    }

    public MemorySegment right_satRaw() {
        return segment.asSlice(OFFSET$right_sat, SIZE$right_sat);
    }

    public @Pointer(comment="Uint16") @Unsigned ShortPtr left_sat() {
        return new ShortPtr(left_satRaw());
    }

    public SDL_HapticCondition left_sat(@Pointer(comment="Uint16") @Unsigned ShortPtr value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$left_sat, SIZE$left_sat);
        return this;
    }

    public MemorySegment left_satRaw() {
        return segment.asSlice(OFFSET$left_sat, SIZE$left_sat);
    }

    public @Pointer(comment="Sint16") ShortPtr right_coeff() {
        return new ShortPtr(right_coeffRaw());
    }

    public SDL_HapticCondition right_coeff(@Pointer(comment="Sint16") ShortPtr value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$right_coeff, SIZE$right_coeff);
        return this;
    }

    public MemorySegment right_coeffRaw() {
        return segment.asSlice(OFFSET$right_coeff, SIZE$right_coeff);
    }

    public @Pointer(comment="Sint16") ShortPtr left_coeff() {
        return new ShortPtr(left_coeffRaw());
    }

    public SDL_HapticCondition left_coeff(@Pointer(comment="Sint16") ShortPtr value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$left_coeff, SIZE$left_coeff);
        return this;
    }

    public MemorySegment left_coeffRaw() {
        return segment.asSlice(OFFSET$left_coeff, SIZE$left_coeff);
    }

    public @Pointer(comment="Uint16") @Unsigned ShortPtr deadband() {
        return new ShortPtr(deadbandRaw());
    }

    public SDL_HapticCondition deadband(@Pointer(comment="Uint16") @Unsigned ShortPtr value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$deadband, SIZE$deadband);
        return this;
    }

    public MemorySegment deadbandRaw() {
        return segment.asSlice(OFFSET$deadband, SIZE$deadband);
    }

    public @Pointer(comment="Sint16") ShortPtr center() {
        return new ShortPtr(centerRaw());
    }

    public SDL_HapticCondition center(@Pointer(comment="Sint16") ShortPtr value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$center, SIZE$center);
        return this;
    }

    public MemorySegment centerRaw() {
        return segment.asSlice(OFFSET$center, SIZE$center);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_SHORT.withName("type"),
        SDL_HapticDirection.LAYOUT.withName("direction"),
        ValueLayout.JAVA_INT.withName("length"),
        ValueLayout.JAVA_SHORT.withName("delay"),
        ValueLayout.JAVA_SHORT.withName("button"),
        ValueLayout.JAVA_SHORT.withName("interval"),
        MemoryLayout.sequenceLayout(3, ValueLayout.JAVA_SHORT).withName("right_sat"),
        MemoryLayout.sequenceLayout(3, ValueLayout.JAVA_SHORT).withName("left_sat"),
        MemoryLayout.sequenceLayout(3, ValueLayout.JAVA_SHORT).withName("right_coeff"),
        MemoryLayout.sequenceLayout(3, ValueLayout.JAVA_SHORT).withName("left_coeff"),
        MemoryLayout.sequenceLayout(3, ValueLayout.JAVA_SHORT).withName("deadband"),
        MemoryLayout.sequenceLayout(3, ValueLayout.JAVA_SHORT).withName("center")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$direction = PathElement.groupElement("direction");
    public static final PathElement PATH$length = PathElement.groupElement("length");
    public static final PathElement PATH$delay = PathElement.groupElement("delay");
    public static final PathElement PATH$button = PathElement.groupElement("button");
    public static final PathElement PATH$interval = PathElement.groupElement("interval");
    public static final PathElement PATH$right_sat = PathElement.groupElement("right_sat");
    public static final PathElement PATH$left_sat = PathElement.groupElement("left_sat");
    public static final PathElement PATH$right_coeff = PathElement.groupElement("right_coeff");
    public static final PathElement PATH$left_coeff = PathElement.groupElement("left_coeff");
    public static final PathElement PATH$deadband = PathElement.groupElement("deadband");
    public static final PathElement PATH$center = PathElement.groupElement("center");

    public static final OfShort LAYOUT$type = (OfShort) LAYOUT.select(PATH$type);
    public static final StructLayout LAYOUT$direction = (StructLayout) LAYOUT.select(PATH$direction);
    public static final OfInt LAYOUT$length = (OfInt) LAYOUT.select(PATH$length);
    public static final OfShort LAYOUT$delay = (OfShort) LAYOUT.select(PATH$delay);
    public static final OfShort LAYOUT$button = (OfShort) LAYOUT.select(PATH$button);
    public static final OfShort LAYOUT$interval = (OfShort) LAYOUT.select(PATH$interval);
    public static final SequenceLayout LAYOUT$right_sat = (SequenceLayout) LAYOUT.select(PATH$right_sat);
    public static final SequenceLayout LAYOUT$left_sat = (SequenceLayout) LAYOUT.select(PATH$left_sat);
    public static final SequenceLayout LAYOUT$right_coeff = (SequenceLayout) LAYOUT.select(PATH$right_coeff);
    public static final SequenceLayout LAYOUT$left_coeff = (SequenceLayout) LAYOUT.select(PATH$left_coeff);
    public static final SequenceLayout LAYOUT$deadband = (SequenceLayout) LAYOUT.select(PATH$deadband);
    public static final SequenceLayout LAYOUT$center = (SequenceLayout) LAYOUT.select(PATH$center);

    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$direction = LAYOUT$direction.byteSize();
    public static final long SIZE$length = LAYOUT$length.byteSize();
    public static final long SIZE$delay = LAYOUT$delay.byteSize();
    public static final long SIZE$button = LAYOUT$button.byteSize();
    public static final long SIZE$interval = LAYOUT$interval.byteSize();
    public static final long SIZE$right_sat = LAYOUT$right_sat.byteSize();
    public static final long SIZE$left_sat = LAYOUT$left_sat.byteSize();
    public static final long SIZE$right_coeff = LAYOUT$right_coeff.byteSize();
    public static final long SIZE$left_coeff = LAYOUT$left_coeff.byteSize();
    public static final long SIZE$deadband = LAYOUT$deadband.byteSize();
    public static final long SIZE$center = LAYOUT$center.byteSize();

    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$direction = LAYOUT.byteOffset(PATH$direction);
    public static final long OFFSET$length = LAYOUT.byteOffset(PATH$length);
    public static final long OFFSET$delay = LAYOUT.byteOffset(PATH$delay);
    public static final long OFFSET$button = LAYOUT.byteOffset(PATH$button);
    public static final long OFFSET$interval = LAYOUT.byteOffset(PATH$interval);
    public static final long OFFSET$right_sat = LAYOUT.byteOffset(PATH$right_sat);
    public static final long OFFSET$left_sat = LAYOUT.byteOffset(PATH$left_sat);
    public static final long OFFSET$right_coeff = LAYOUT.byteOffset(PATH$right_coeff);
    public static final long OFFSET$left_coeff = LAYOUT.byteOffset(PATH$left_coeff);
    public static final long OFFSET$deadband = LAYOUT.byteOffset(PATH$deadband);
    public static final long OFFSET$center = LAYOUT.byteOffset(PATH$center);
}
