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

/// Gamepad button event structure (event.gbutton.*)
///
/// \since This struct is available since SDL 3.2.0.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct SDL_GamepadButtonEvent {
///     SDL_EventType type; // optional // @link substring="SDL_EventType" target="SDL_EventType" @link substring="type" target="#type"
///     Uint32 reserved;
///     Uint64 timestamp; // optional // @link substring="timestamp" target="#timestamp"
///     SDL_JoystickID which; // optional // @link substring="which" target="#which"
///     Uint8 button; // optional // @link substring="button" target="#button"
///     bool down; // optional // @link substring="down" target="#down"
///     Uint8 padding1; // optional // @link substring="padding1" target="#padding1"
///     Uint8 padding2; // optional // @link substring="padding2" target="#padding2"
/// } SDL_GamepadButtonEvent;
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
public record SDL_GamepadButtonEvent(@NotNull MemorySegment segment) implements ISDL_GamepadButtonEvent {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link SDL_GamepadButtonEvent}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// ISDL_GamepadButtonEvent to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code SDL_GamepadButtonEvent.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements ISDL_GamepadButtonEvent, Iterable<SDL_GamepadButtonEvent> {
        public long size() {
            return segment.byteSize() / SDL_GamepadButtonEvent.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull SDL_GamepadButtonEvent at(long index) {
            return new SDL_GamepadButtonEvent(segment.asSlice(index * SDL_GamepadButtonEvent.BYTES, SDL_GamepadButtonEvent.BYTES));
        }

        public void write(long index, @NotNull SDL_GamepadButtonEvent value) {
            MemorySegment s = segment.asSlice(index * SDL_GamepadButtonEvent.BYTES, SDL_GamepadButtonEvent.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * SDL_GamepadButtonEvent.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * SDL_GamepadButtonEvent.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * SDL_GamepadButtonEvent.BYTES,
                (end - start) * SDL_GamepadButtonEvent.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * SDL_GamepadButtonEvent.BYTES));
        }

        public SDL_GamepadButtonEvent[] toArray() {
            SDL_GamepadButtonEvent[] ret = new SDL_GamepadButtonEvent[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<SDL_GamepadButtonEvent> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<SDL_GamepadButtonEvent> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= SDL_GamepadButtonEvent.BYTES;
            }

            @Override
            public SDL_GamepadButtonEvent next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                SDL_GamepadButtonEvent ret = new SDL_GamepadButtonEvent(segment.asSlice(0, SDL_GamepadButtonEvent.BYTES));
                segment = segment.asSlice(SDL_GamepadButtonEvent.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static SDL_GamepadButtonEvent allocate(Arena arena) {
        return new SDL_GamepadButtonEvent(arena.allocate(LAYOUT));
    }

    public static SDL_GamepadButtonEvent.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new SDL_GamepadButtonEvent.Ptr(segment);
    }

    public static SDL_GamepadButtonEvent clone(Arena arena, SDL_GamepadButtonEvent src) {
        SDL_GamepadButtonEvent ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @EnumType(SDL_EventType.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public SDL_GamepadButtonEvent type(@EnumType(SDL_EventType.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
        return this;
    }


    public @NativeType("Uint64") @Unsigned long timestamp() {
        return segment.get(LAYOUT$timestamp, OFFSET$timestamp);
    }

    public SDL_GamepadButtonEvent timestamp(@NativeType("Uint64") @Unsigned long value) {
        segment.set(LAYOUT$timestamp, OFFSET$timestamp, value);
        return this;
    }

    public @NativeType("SDL_JoystickID") @Unsigned int which() {
        return segment.get(LAYOUT$which, OFFSET$which);
    }

    public SDL_GamepadButtonEvent which(@NativeType("SDL_JoystickID") @Unsigned int value) {
        segment.set(LAYOUT$which, OFFSET$which, value);
        return this;
    }

    public @NativeType("Uint8") @Unsigned byte button() {
        return segment.get(LAYOUT$button, OFFSET$button);
    }

    public SDL_GamepadButtonEvent button(@NativeType("Uint8") @Unsigned byte value) {
        segment.set(LAYOUT$button, OFFSET$button, value);
        return this;
    }

    public @NativeType("boolean") boolean down() {
        return segment.get(LAYOUT$down, OFFSET$down);
    }

    public SDL_GamepadButtonEvent down(@NativeType("boolean") boolean value) {
        segment.set(LAYOUT$down, OFFSET$down, value);
        return this;
    }

    public @NativeType("Uint8") @Unsigned byte padding1() {
        return segment.get(LAYOUT$padding1, OFFSET$padding1);
    }

    public SDL_GamepadButtonEvent padding1(@NativeType("Uint8") @Unsigned byte value) {
        segment.set(LAYOUT$padding1, OFFSET$padding1, value);
        return this;
    }

    public @NativeType("Uint8") @Unsigned byte padding2() {
        return segment.get(LAYOUT$padding2, OFFSET$padding2);
    }

    public SDL_GamepadButtonEvent padding2(@NativeType("Uint8") @Unsigned byte value) {
        segment.set(LAYOUT$padding2, OFFSET$padding2, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.JAVA_INT.withName("reserved"),
        ValueLayout.JAVA_LONG.withName("timestamp"),
        ValueLayout.JAVA_INT.withName("which"),
        ValueLayout.JAVA_BYTE.withName("button"),
        ValueLayout.JAVA_BOOLEAN.withName("down"),
        ValueLayout.JAVA_BYTE.withName("padding1"),
        ValueLayout.JAVA_BYTE.withName("padding2")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$timestamp = PathElement.groupElement("timestamp");
    public static final PathElement PATH$which = PathElement.groupElement("which");
    public static final PathElement PATH$button = PathElement.groupElement("button");
    public static final PathElement PATH$down = PathElement.groupElement("down");
    public static final PathElement PATH$padding1 = PathElement.groupElement("padding1");
    public static final PathElement PATH$padding2 = PathElement.groupElement("padding2");

    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final OfLong LAYOUT$timestamp = (OfLong) LAYOUT.select(PATH$timestamp);
    public static final OfInt LAYOUT$which = (OfInt) LAYOUT.select(PATH$which);
    public static final OfByte LAYOUT$button = (OfByte) LAYOUT.select(PATH$button);
    public static final OfBoolean LAYOUT$down = (OfBoolean) LAYOUT.select(PATH$down);
    public static final OfByte LAYOUT$padding1 = (OfByte) LAYOUT.select(PATH$padding1);
    public static final OfByte LAYOUT$padding2 = (OfByte) LAYOUT.select(PATH$padding2);

    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$timestamp = LAYOUT$timestamp.byteSize();
    public static final long SIZE$which = LAYOUT$which.byteSize();
    public static final long SIZE$button = LAYOUT$button.byteSize();
    public static final long SIZE$down = LAYOUT$down.byteSize();
    public static final long SIZE$padding1 = LAYOUT$padding1.byteSize();
    public static final long SIZE$padding2 = LAYOUT$padding2.byteSize();

    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$timestamp = LAYOUT.byteOffset(PATH$timestamp);
    public static final long OFFSET$which = LAYOUT.byteOffset(PATH$which);
    public static final long OFFSET$button = LAYOUT.byteOffset(PATH$button);
    public static final long OFFSET$down = LAYOUT.byteOffset(PATH$down);
    public static final long OFFSET$padding1 = LAYOUT.byteOffset(PATH$padding1);
    public static final long OFFSET$padding2 = LAYOUT.byteOffset(PATH$padding2);
}
