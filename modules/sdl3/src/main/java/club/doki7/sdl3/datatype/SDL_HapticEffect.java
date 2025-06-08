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

/// The generic template for any haptic effect.
///
/// All values max at 32767 (0x7FFF). Signed values also can be negative. Time
/// values unless specified otherwise are in milliseconds.
///
/// You can also pass SDL_HAPTIC_INFINITY to length instead of a 0-32767 value.
/// Neither delay, interval, attack_length nor fade_length support
/// SDL_HAPTIC_INFINITY. Fade will also not be used since effect never ends.
///
/// Additionally, the SDL_HAPTIC_RAMP effect does not support a duration of
/// SDL_HAPTIC_INFINITY.
///
/// Button triggers may not be supported on all devices, it is advised to not
/// use them if possible. Buttons start at index 1 instead of index 0 like the
/// joystick.
///
/// If both attack_length and fade_level are 0, the envelope is not used,
/// otherwise both values are used.
///
/// Common parts:
///
/// ```c
///  // Replay - All effects have this
///  Uint32 length;        // Duration of effect (ms).
///  Uint16 delay;         // Delay before starting effect.
///
///  // Trigger - All effects have this
///  Uint16 button;        // Button that triggers effect.
///  Uint16 interval;      // How soon before effect can be triggered again.
///
///  // Envelope - All effects except condition effects have this
///  Uint16 attack_length; // Duration of the attack (ms).
///  Uint16 attack_level;  // Level at the start of the attack.
///  Uint16 fade_length;   // Duration of the fade out (ms).
///  Uint16 fade_level;    // Level at the end of the fade.
/// ```
///
/// Here we have an example of a constant effect evolution in time:
///
/// ```
///  Strength
///  ^
///  |
///  |    effect level -->  _________________
///  |                     /                 \
///  |                    /                   \
///  |                   /                     \
///  |                  /                       \
///  | attack_level --> |                        \
///  |                  |                        |  <---  fade_level
///  |
///  +--------------------------------------------------> Time
///                     [--]                 [---]
///                     attack_length        fade_length
///
///  [------------------][-----------------------]
///  delay               length
/// ```
///
/// Note either the attack_level or the fade_level may be above the actual
/// effect level.
///
/// \since This struct is available since SDL 3.2.0.
///
/// \sa SDL_HapticConstant
/// \sa SDL_HapticPeriodic
/// \sa SDL_HapticCondition
/// \sa SDL_HapticRamp
/// \sa SDL_HapticLeftRight
/// \sa SDL_HapticCustom
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct SDL_HapticEffect {
///     Uint16 type; // @link substring="type" target="#type"
///     SDL_HapticConstant constant; // @link substring="SDL_HapticConstant" target="SDL_HapticConstant" @link substring="constant" target="#constant"
///     SDL_HapticPeriodic periodic; // @link substring="SDL_HapticPeriodic" target="SDL_HapticPeriodic" @link substring="periodic" target="#periodic"
///     SDL_HapticCondition condition; // @link substring="SDL_HapticCondition" target="SDL_HapticCondition" @link substring="condition" target="#condition"
///     SDL_HapticRamp ramp; // @link substring="SDL_HapticRamp" target="SDL_HapticRamp" @link substring="ramp" target="#ramp"
///     SDL_HapticLeftRight leftright; // @link substring="SDL_HapticLeftRight" target="SDL_HapticLeftRight" @link substring="leftright" target="#leftright"
///     SDL_HapticCustom custom; // @link substring="SDL_HapticCustom" target="SDL_HapticCustom" @link substring="custom" target="#custom"
/// } SDL_HapticEffect;
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
public record SDL_HapticEffect(@NotNull MemorySegment segment) implements ISDL_HapticEffect {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link SDL_HapticEffect}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// ISDL_HapticEffect to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code SDL_HapticEffect.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements ISDL_HapticEffect, Iterable<SDL_HapticEffect> {
        public long size() {
            return segment.byteSize() / SDL_HapticEffect.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull SDL_HapticEffect at(long index) {
            return new SDL_HapticEffect(segment.asSlice(index * SDL_HapticEffect.BYTES, SDL_HapticEffect.BYTES));
        }

        public void write(long index, @NotNull SDL_HapticEffect value) {
            MemorySegment s = segment.asSlice(index * SDL_HapticEffect.BYTES, SDL_HapticEffect.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * SDL_HapticEffect.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * SDL_HapticEffect.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * SDL_HapticEffect.BYTES,
                (end - start) * SDL_HapticEffect.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * SDL_HapticEffect.BYTES));
        }

        public SDL_HapticEffect[] toArray() {
            SDL_HapticEffect[] ret = new SDL_HapticEffect[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<SDL_HapticEffect> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<SDL_HapticEffect> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= SDL_HapticEffect.BYTES;
            }

            @Override
            public SDL_HapticEffect next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                SDL_HapticEffect ret = new SDL_HapticEffect(segment.asSlice(0, SDL_HapticEffect.BYTES));
                segment = segment.asSlice(SDL_HapticEffect.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static SDL_HapticEffect allocate(Arena arena) {
        return new SDL_HapticEffect(arena.allocate(LAYOUT));
    }

    public static SDL_HapticEffect.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new SDL_HapticEffect.Ptr(segment);
    }

    public static SDL_HapticEffect clone(Arena arena, SDL_HapticEffect src) {
        SDL_HapticEffect ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @NativeType("Uint16") @Unsigned short type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public SDL_HapticEffect type(@NativeType("Uint16") @Unsigned short value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
        return this;
    }

    public @NotNull SDL_HapticConstant constant() {
        return new SDL_HapticConstant(segment.asSlice(OFFSET$constant, LAYOUT$constant));
    }

    public SDL_HapticEffect constant(@NotNull SDL_HapticConstant value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$constant, SIZE$constant);
        return this;
    }

    public SDL_HapticEffect constant(Consumer<@NotNull SDL_HapticConstant> consumer) {
        consumer.accept(constant());
        return this;
    }

    public @NotNull SDL_HapticPeriodic periodic() {
        return new SDL_HapticPeriodic(segment.asSlice(OFFSET$periodic, LAYOUT$periodic));
    }

    public SDL_HapticEffect periodic(@NotNull SDL_HapticPeriodic value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$periodic, SIZE$periodic);
        return this;
    }

    public SDL_HapticEffect periodic(Consumer<@NotNull SDL_HapticPeriodic> consumer) {
        consumer.accept(periodic());
        return this;
    }

    public @NotNull SDL_HapticCondition condition() {
        return new SDL_HapticCondition(segment.asSlice(OFFSET$condition, LAYOUT$condition));
    }

    public SDL_HapticEffect condition(@NotNull SDL_HapticCondition value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$condition, SIZE$condition);
        return this;
    }

    public SDL_HapticEffect condition(Consumer<@NotNull SDL_HapticCondition> consumer) {
        consumer.accept(condition());
        return this;
    }

    public @NotNull SDL_HapticRamp ramp() {
        return new SDL_HapticRamp(segment.asSlice(OFFSET$ramp, LAYOUT$ramp));
    }

    public SDL_HapticEffect ramp(@NotNull SDL_HapticRamp value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$ramp, SIZE$ramp);
        return this;
    }

    public SDL_HapticEffect ramp(Consumer<@NotNull SDL_HapticRamp> consumer) {
        consumer.accept(ramp());
        return this;
    }

    public @NotNull SDL_HapticLeftRight leftright() {
        return new SDL_HapticLeftRight(segment.asSlice(OFFSET$leftright, LAYOUT$leftright));
    }

    public SDL_HapticEffect leftright(@NotNull SDL_HapticLeftRight value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$leftright, SIZE$leftright);
        return this;
    }

    public SDL_HapticEffect leftright(Consumer<@NotNull SDL_HapticLeftRight> consumer) {
        consumer.accept(leftright());
        return this;
    }

    public @NotNull SDL_HapticCustom custom() {
        return new SDL_HapticCustom(segment.asSlice(OFFSET$custom, LAYOUT$custom));
    }

    public SDL_HapticEffect custom(@NotNull SDL_HapticCustom value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$custom, SIZE$custom);
        return this;
    }

    public SDL_HapticEffect custom(Consumer<@NotNull SDL_HapticCustom> consumer) {
        consumer.accept(custom());
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_SHORT.withName("type"),
        SDL_HapticConstant.LAYOUT.withName("constant"),
        SDL_HapticPeriodic.LAYOUT.withName("periodic"),
        SDL_HapticCondition.LAYOUT.withName("condition"),
        SDL_HapticRamp.LAYOUT.withName("ramp"),
        SDL_HapticLeftRight.LAYOUT.withName("leftright"),
        SDL_HapticCustom.LAYOUT.withName("custom")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$constant = PathElement.groupElement("constant");
    public static final PathElement PATH$periodic = PathElement.groupElement("periodic");
    public static final PathElement PATH$condition = PathElement.groupElement("condition");
    public static final PathElement PATH$ramp = PathElement.groupElement("ramp");
    public static final PathElement PATH$leftright = PathElement.groupElement("leftright");
    public static final PathElement PATH$custom = PathElement.groupElement("custom");

    public static final OfShort LAYOUT$type = (OfShort) LAYOUT.select(PATH$type);
    public static final StructLayout LAYOUT$constant = (StructLayout) LAYOUT.select(PATH$constant);
    public static final StructLayout LAYOUT$periodic = (StructLayout) LAYOUT.select(PATH$periodic);
    public static final StructLayout LAYOUT$condition = (StructLayout) LAYOUT.select(PATH$condition);
    public static final StructLayout LAYOUT$ramp = (StructLayout) LAYOUT.select(PATH$ramp);
    public static final StructLayout LAYOUT$leftright = (StructLayout) LAYOUT.select(PATH$leftright);
    public static final StructLayout LAYOUT$custom = (StructLayout) LAYOUT.select(PATH$custom);

    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$constant = LAYOUT$constant.byteSize();
    public static final long SIZE$periodic = LAYOUT$periodic.byteSize();
    public static final long SIZE$condition = LAYOUT$condition.byteSize();
    public static final long SIZE$ramp = LAYOUT$ramp.byteSize();
    public static final long SIZE$leftright = LAYOUT$leftright.byteSize();
    public static final long SIZE$custom = LAYOUT$custom.byteSize();

    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$constant = LAYOUT.byteOffset(PATH$constant);
    public static final long OFFSET$periodic = LAYOUT.byteOffset(PATH$periodic);
    public static final long OFFSET$condition = LAYOUT.byteOffset(PATH$condition);
    public static final long OFFSET$ramp = LAYOUT.byteOffset(PATH$ramp);
    public static final long OFFSET$leftright = LAYOUT.byteOffset(PATH$leftright);
    public static final long OFFSET$custom = LAYOUT.byteOffset(PATH$custom);
}
