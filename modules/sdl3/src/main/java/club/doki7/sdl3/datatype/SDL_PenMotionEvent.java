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

/// Pressure-sensitive pen motion event structure (event.pmotion.*)
///
/// Depending on the hardware, you may get motion events when the pen is not
/// touching a tablet, for tracking a pen even when it isn't drawing. You
/// should listen for SDL_EVENT_PEN_DOWN and SDL_EVENT_PEN_UP events, or check
/// `pen_state &amp; SDL_PEN_INPUT_DOWN` to decide if a pen is "drawing" when
/// dealing with pen motion.
///
/// Since: This struct is available since SDL 3.2.0.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct SDL_PenMotionEvent {
///     SDL_EventType type; // @link substring="SDL_EventType" target="SDL_EventType" @link substring="type" target="#type"
///     Uint32 reserved;
///     Uint64 timestamp; // @link substring="timestamp" target="#timestamp"
///     SDL_WindowID windowID; // @link substring="windowID" target="#windowID"
///     SDL_PenID which; // @link substring="which" target="#which"
///     SDL_PenInputFlags pen_state; // @link substring="SDL_PenInputFlags" target="SDL_PenInputFlags" @link substring="pen_state" target="#pen_state"
///     float x; // @link substring="x" target="#x"
///     float y; // @link substring="y" target="#y"
/// } SDL_PenMotionEvent;
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
public record SDL_PenMotionEvent(@NotNull MemorySegment segment) implements ISDL_PenMotionEvent {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link SDL_PenMotionEvent}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// ISDL_PenMotionEvent to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code SDL_PenMotionEvent.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements ISDL_PenMotionEvent, Iterable<SDL_PenMotionEvent> {
        public long size() {
            return segment.byteSize() / SDL_PenMotionEvent.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull SDL_PenMotionEvent at(long index) {
            return new SDL_PenMotionEvent(segment.asSlice(index * SDL_PenMotionEvent.BYTES, SDL_PenMotionEvent.BYTES));
        }

        public void write(long index, @NotNull SDL_PenMotionEvent value) {
            MemorySegment s = segment.asSlice(index * SDL_PenMotionEvent.BYTES, SDL_PenMotionEvent.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * SDL_PenMotionEvent.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * SDL_PenMotionEvent.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * SDL_PenMotionEvent.BYTES,
                (end - start) * SDL_PenMotionEvent.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * SDL_PenMotionEvent.BYTES));
        }

        public SDL_PenMotionEvent[] toArray() {
            SDL_PenMotionEvent[] ret = new SDL_PenMotionEvent[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<SDL_PenMotionEvent> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<SDL_PenMotionEvent> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= SDL_PenMotionEvent.BYTES;
            }

            @Override
            public SDL_PenMotionEvent next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                SDL_PenMotionEvent ret = new SDL_PenMotionEvent(segment.asSlice(0, SDL_PenMotionEvent.BYTES));
                segment = segment.asSlice(SDL_PenMotionEvent.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static SDL_PenMotionEvent allocate(Arena arena) {
        return new SDL_PenMotionEvent(arena.allocate(LAYOUT));
    }

    public static SDL_PenMotionEvent.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new SDL_PenMotionEvent.Ptr(segment);
    }

    public static SDL_PenMotionEvent clone(Arena arena, SDL_PenMotionEvent src) {
        SDL_PenMotionEvent ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @EnumType(SDL_EventType.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public SDL_PenMotionEvent type(@EnumType(SDL_EventType.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
        return this;
    }


    public @NativeType("Uint64") @Unsigned long timestamp() {
        return segment.get(LAYOUT$timestamp, OFFSET$timestamp);
    }

    public SDL_PenMotionEvent timestamp(@NativeType("Uint64") @Unsigned long value) {
        segment.set(LAYOUT$timestamp, OFFSET$timestamp, value);
        return this;
    }

    public @NativeType("SDL_WindowID") @Unsigned int windowID() {
        return segment.get(LAYOUT$windowID, OFFSET$windowID);
    }

    public SDL_PenMotionEvent windowID(@NativeType("SDL_WindowID") @Unsigned int value) {
        segment.set(LAYOUT$windowID, OFFSET$windowID, value);
        return this;
    }

    public @NativeType("SDL_PenID") @Unsigned int which() {
        return segment.get(LAYOUT$which, OFFSET$which);
    }

    public SDL_PenMotionEvent which(@NativeType("SDL_PenID") @Unsigned int value) {
        segment.set(LAYOUT$which, OFFSET$which, value);
        return this;
    }

    public @EnumType(SDL_PenInputFlags.class) int pen_state() {
        return segment.get(LAYOUT$pen_state, OFFSET$pen_state);
    }

    public SDL_PenMotionEvent pen_state(@EnumType(SDL_PenInputFlags.class) int value) {
        segment.set(LAYOUT$pen_state, OFFSET$pen_state, value);
        return this;
    }

    public float x() {
        return segment.get(LAYOUT$x, OFFSET$x);
    }

    public SDL_PenMotionEvent x(float value) {
        segment.set(LAYOUT$x, OFFSET$x, value);
        return this;
    }

    public float y() {
        return segment.get(LAYOUT$y, OFFSET$y);
    }

    public SDL_PenMotionEvent y(float value) {
        segment.set(LAYOUT$y, OFFSET$y, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.JAVA_INT.withName("reserved"),
        ValueLayout.JAVA_LONG.withName("timestamp"),
        ValueLayout.JAVA_INT.withName("windowID"),
        ValueLayout.JAVA_INT.withName("which"),
        ValueLayout.JAVA_INT.withName("pen_state"),
        ValueLayout.JAVA_FLOAT.withName("x"),
        ValueLayout.JAVA_FLOAT.withName("y")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$timestamp = PathElement.groupElement("timestamp");
    public static final PathElement PATH$windowID = PathElement.groupElement("windowID");
    public static final PathElement PATH$which = PathElement.groupElement("which");
    public static final PathElement PATH$pen_state = PathElement.groupElement("pen_state");
    public static final PathElement PATH$x = PathElement.groupElement("x");
    public static final PathElement PATH$y = PathElement.groupElement("y");

    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final OfLong LAYOUT$timestamp = (OfLong) LAYOUT.select(PATH$timestamp);
    public static final OfInt LAYOUT$windowID = (OfInt) LAYOUT.select(PATH$windowID);
    public static final OfInt LAYOUT$which = (OfInt) LAYOUT.select(PATH$which);
    public static final OfInt LAYOUT$pen_state = (OfInt) LAYOUT.select(PATH$pen_state);
    public static final OfFloat LAYOUT$x = (OfFloat) LAYOUT.select(PATH$x);
    public static final OfFloat LAYOUT$y = (OfFloat) LAYOUT.select(PATH$y);

    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$timestamp = LAYOUT$timestamp.byteSize();
    public static final long SIZE$windowID = LAYOUT$windowID.byteSize();
    public static final long SIZE$which = LAYOUT$which.byteSize();
    public static final long SIZE$pen_state = LAYOUT$pen_state.byteSize();
    public static final long SIZE$x = LAYOUT$x.byteSize();
    public static final long SIZE$y = LAYOUT$y.byteSize();

    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$timestamp = LAYOUT.byteOffset(PATH$timestamp);
    public static final long OFFSET$windowID = LAYOUT.byteOffset(PATH$windowID);
    public static final long OFFSET$which = LAYOUT.byteOffset(PATH$which);
    public static final long OFFSET$pen_state = LAYOUT.byteOffset(PATH$pen_state);
    public static final long OFFSET$x = LAYOUT.byteOffset(PATH$x);
    public static final long OFFSET$y = LAYOUT.byteOffset(PATH$y);
}
