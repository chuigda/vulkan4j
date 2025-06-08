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

/// Gamepad touchpad event structure (event.gtouchpad.*)
///
/// \since This struct is available since SDL 3.2.0.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct SDL_GamepadTouchpadEvent {
///     SDL_EventType type; // @link substring="SDL_EventType" target="SDL_EventType" @link substring="type" target="#type"
///     Uint32 reserved;
///     Uint64 timestamp; // @link substring="timestamp" target="#timestamp"
///     SDL_JoystickID which; // @link substring="which" target="#which"
///     Sint32 touchpad; // @link substring="touchpad" target="#touchpad"
///     Sint32 finger; // @link substring="finger" target="#finger"
///     float x; // @link substring="x" target="#x"
///     float y; // @link substring="y" target="#y"
///     float pressure; // @link substring="pressure" target="#pressure"
/// } SDL_GamepadTouchpadEvent;
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
public record SDL_GamepadTouchpadEvent(@NotNull MemorySegment segment) implements ISDL_GamepadTouchpadEvent {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link SDL_GamepadTouchpadEvent}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// ISDL_GamepadTouchpadEvent to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code SDL_GamepadTouchpadEvent.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements ISDL_GamepadTouchpadEvent, Iterable<SDL_GamepadTouchpadEvent> {
        public long size() {
            return segment.byteSize() / SDL_GamepadTouchpadEvent.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull SDL_GamepadTouchpadEvent at(long index) {
            return new SDL_GamepadTouchpadEvent(segment.asSlice(index * SDL_GamepadTouchpadEvent.BYTES, SDL_GamepadTouchpadEvent.BYTES));
        }

        public void write(long index, @NotNull SDL_GamepadTouchpadEvent value) {
            MemorySegment s = segment.asSlice(index * SDL_GamepadTouchpadEvent.BYTES, SDL_GamepadTouchpadEvent.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * SDL_GamepadTouchpadEvent.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * SDL_GamepadTouchpadEvent.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * SDL_GamepadTouchpadEvent.BYTES,
                (end - start) * SDL_GamepadTouchpadEvent.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * SDL_GamepadTouchpadEvent.BYTES));
        }

        public SDL_GamepadTouchpadEvent[] toArray() {
            SDL_GamepadTouchpadEvent[] ret = new SDL_GamepadTouchpadEvent[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<SDL_GamepadTouchpadEvent> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<SDL_GamepadTouchpadEvent> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= SDL_GamepadTouchpadEvent.BYTES;
            }

            @Override
            public SDL_GamepadTouchpadEvent next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                SDL_GamepadTouchpadEvent ret = new SDL_GamepadTouchpadEvent(segment.asSlice(0, SDL_GamepadTouchpadEvent.BYTES));
                segment = segment.asSlice(SDL_GamepadTouchpadEvent.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static SDL_GamepadTouchpadEvent allocate(Arena arena) {
        return new SDL_GamepadTouchpadEvent(arena.allocate(LAYOUT));
    }

    public static SDL_GamepadTouchpadEvent.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new SDL_GamepadTouchpadEvent.Ptr(segment);
    }

    public static SDL_GamepadTouchpadEvent clone(Arena arena, SDL_GamepadTouchpadEvent src) {
        SDL_GamepadTouchpadEvent ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @EnumType(SDL_EventType.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public SDL_GamepadTouchpadEvent type(@EnumType(SDL_EventType.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
        return this;
    }


    public @NativeType("Uint64") @Unsigned long timestamp() {
        return segment.get(LAYOUT$timestamp, OFFSET$timestamp);
    }

    public SDL_GamepadTouchpadEvent timestamp(@NativeType("Uint64") @Unsigned long value) {
        segment.set(LAYOUT$timestamp, OFFSET$timestamp, value);
        return this;
    }

    public @NativeType("SDL_JoystickID") @Unsigned int which() {
        return segment.get(LAYOUT$which, OFFSET$which);
    }

    public SDL_GamepadTouchpadEvent which(@NativeType("SDL_JoystickID") @Unsigned int value) {
        segment.set(LAYOUT$which, OFFSET$which, value);
        return this;
    }

    public @NativeType("Sint32") int touchpad() {
        return segment.get(LAYOUT$touchpad, OFFSET$touchpad);
    }

    public SDL_GamepadTouchpadEvent touchpad(@NativeType("Sint32") int value) {
        segment.set(LAYOUT$touchpad, OFFSET$touchpad, value);
        return this;
    }

    public @NativeType("Sint32") int finger() {
        return segment.get(LAYOUT$finger, OFFSET$finger);
    }

    public SDL_GamepadTouchpadEvent finger(@NativeType("Sint32") int value) {
        segment.set(LAYOUT$finger, OFFSET$finger, value);
        return this;
    }

    public float x() {
        return segment.get(LAYOUT$x, OFFSET$x);
    }

    public SDL_GamepadTouchpadEvent x(float value) {
        segment.set(LAYOUT$x, OFFSET$x, value);
        return this;
    }

    public float y() {
        return segment.get(LAYOUT$y, OFFSET$y);
    }

    public SDL_GamepadTouchpadEvent y(float value) {
        segment.set(LAYOUT$y, OFFSET$y, value);
        return this;
    }

    public float pressure() {
        return segment.get(LAYOUT$pressure, OFFSET$pressure);
    }

    public SDL_GamepadTouchpadEvent pressure(float value) {
        segment.set(LAYOUT$pressure, OFFSET$pressure, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.JAVA_INT.withName("reserved"),
        ValueLayout.JAVA_LONG.withName("timestamp"),
        ValueLayout.JAVA_INT.withName("which"),
        ValueLayout.JAVA_INT.withName("touchpad"),
        ValueLayout.JAVA_INT.withName("finger"),
        ValueLayout.JAVA_FLOAT.withName("x"),
        ValueLayout.JAVA_FLOAT.withName("y"),
        ValueLayout.JAVA_FLOAT.withName("pressure")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$timestamp = PathElement.groupElement("timestamp");
    public static final PathElement PATH$which = PathElement.groupElement("which");
    public static final PathElement PATH$touchpad = PathElement.groupElement("touchpad");
    public static final PathElement PATH$finger = PathElement.groupElement("finger");
    public static final PathElement PATH$x = PathElement.groupElement("x");
    public static final PathElement PATH$y = PathElement.groupElement("y");
    public static final PathElement PATH$pressure = PathElement.groupElement("pressure");

    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final OfLong LAYOUT$timestamp = (OfLong) LAYOUT.select(PATH$timestamp);
    public static final OfInt LAYOUT$which = (OfInt) LAYOUT.select(PATH$which);
    public static final OfInt LAYOUT$touchpad = (OfInt) LAYOUT.select(PATH$touchpad);
    public static final OfInt LAYOUT$finger = (OfInt) LAYOUT.select(PATH$finger);
    public static final OfFloat LAYOUT$x = (OfFloat) LAYOUT.select(PATH$x);
    public static final OfFloat LAYOUT$y = (OfFloat) LAYOUT.select(PATH$y);
    public static final OfFloat LAYOUT$pressure = (OfFloat) LAYOUT.select(PATH$pressure);

    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$timestamp = LAYOUT$timestamp.byteSize();
    public static final long SIZE$which = LAYOUT$which.byteSize();
    public static final long SIZE$touchpad = LAYOUT$touchpad.byteSize();
    public static final long SIZE$finger = LAYOUT$finger.byteSize();
    public static final long SIZE$x = LAYOUT$x.byteSize();
    public static final long SIZE$y = LAYOUT$y.byteSize();
    public static final long SIZE$pressure = LAYOUT$pressure.byteSize();

    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$timestamp = LAYOUT.byteOffset(PATH$timestamp);
    public static final long OFFSET$which = LAYOUT.byteOffset(PATH$which);
    public static final long OFFSET$touchpad = LAYOUT.byteOffset(PATH$touchpad);
    public static final long OFFSET$finger = LAYOUT.byteOffset(PATH$finger);
    public static final long OFFSET$x = LAYOUT.byteOffset(PATH$x);
    public static final long OFFSET$y = LAYOUT.byteOffset(PATH$y);
    public static final long OFFSET$pressure = LAYOUT.byteOffset(PATH$pressure);
}
