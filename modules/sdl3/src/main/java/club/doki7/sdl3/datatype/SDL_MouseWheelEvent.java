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

/// Mouse wheel event structure (event.wheel.*)
///
/// Since: This struct is available since SDL 3.2.0.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct SDL_MouseWheelEvent {
///     SDL_EventType type; // @link substring="SDL_EventType" target="SDL_EventType" @link substring="type" target="#type"
///     Uint32 reserved;
///     Uint64 timestamp; // @link substring="timestamp" target="#timestamp"
///     SDL_WindowID windowID; // @link substring="windowID" target="#windowID"
///     SDL_MouseID which; // @link substring="which" target="#which"
///     float x; // @link substring="x" target="#x"
///     float y; // @link substring="y" target="#y"
///     SDL_MouseWheelDirection direction; // @link substring="SDL_MouseWheelDirection" target="SDL_MouseWheelDirection" @link substring="direction" target="#direction"
///     float mouse_x; // @link substring="mouse_x" target="#mouse_x"
///     float mouse_y; // @link substring="mouse_y" target="#mouse_y"
///     Sint32 integer_x; // @link substring="integer_x" target="#integer_x"
///     Sint32 integer_y; // @link substring="integer_y" target="#integer_y"
/// } SDL_MouseWheelEvent;
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
public record SDL_MouseWheelEvent(@NotNull MemorySegment segment) implements ISDL_MouseWheelEvent {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link SDL_MouseWheelEvent}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// ISDL_MouseWheelEvent to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code SDL_MouseWheelEvent.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements ISDL_MouseWheelEvent, Iterable<SDL_MouseWheelEvent> {
        public long size() {
            return segment.byteSize() / SDL_MouseWheelEvent.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull SDL_MouseWheelEvent at(long index) {
            return new SDL_MouseWheelEvent(segment.asSlice(index * SDL_MouseWheelEvent.BYTES, SDL_MouseWheelEvent.BYTES));
        }

        public void write(long index, @NotNull SDL_MouseWheelEvent value) {
            MemorySegment s = segment.asSlice(index * SDL_MouseWheelEvent.BYTES, SDL_MouseWheelEvent.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * SDL_MouseWheelEvent.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * SDL_MouseWheelEvent.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * SDL_MouseWheelEvent.BYTES,
                (end - start) * SDL_MouseWheelEvent.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * SDL_MouseWheelEvent.BYTES));
        }

        public SDL_MouseWheelEvent[] toArray() {
            SDL_MouseWheelEvent[] ret = new SDL_MouseWheelEvent[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<SDL_MouseWheelEvent> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<SDL_MouseWheelEvent> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= SDL_MouseWheelEvent.BYTES;
            }

            @Override
            public SDL_MouseWheelEvent next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                SDL_MouseWheelEvent ret = new SDL_MouseWheelEvent(segment.asSlice(0, SDL_MouseWheelEvent.BYTES));
                segment = segment.asSlice(SDL_MouseWheelEvent.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static SDL_MouseWheelEvent allocate(Arena arena) {
        return new SDL_MouseWheelEvent(arena.allocate(LAYOUT));
    }

    public static SDL_MouseWheelEvent.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new SDL_MouseWheelEvent.Ptr(segment);
    }

    public static SDL_MouseWheelEvent clone(Arena arena, SDL_MouseWheelEvent src) {
        SDL_MouseWheelEvent ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @EnumType(SDL_EventType.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public SDL_MouseWheelEvent type(@EnumType(SDL_EventType.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
        return this;
    }


    public @NativeType("Uint64") @Unsigned long timestamp() {
        return segment.get(LAYOUT$timestamp, OFFSET$timestamp);
    }

    public SDL_MouseWheelEvent timestamp(@NativeType("Uint64") @Unsigned long value) {
        segment.set(LAYOUT$timestamp, OFFSET$timestamp, value);
        return this;
    }

    public @NativeType("SDL_WindowID") @Unsigned int windowID() {
        return segment.get(LAYOUT$windowID, OFFSET$windowID);
    }

    public SDL_MouseWheelEvent windowID(@NativeType("SDL_WindowID") @Unsigned int value) {
        segment.set(LAYOUT$windowID, OFFSET$windowID, value);
        return this;
    }

    public @NativeType("SDL_MouseID") @Unsigned int which() {
        return segment.get(LAYOUT$which, OFFSET$which);
    }

    public SDL_MouseWheelEvent which(@NativeType("SDL_MouseID") @Unsigned int value) {
        segment.set(LAYOUT$which, OFFSET$which, value);
        return this;
    }

    public float x() {
        return segment.get(LAYOUT$x, OFFSET$x);
    }

    public SDL_MouseWheelEvent x(float value) {
        segment.set(LAYOUT$x, OFFSET$x, value);
        return this;
    }

    public float y() {
        return segment.get(LAYOUT$y, OFFSET$y);
    }

    public SDL_MouseWheelEvent y(float value) {
        segment.set(LAYOUT$y, OFFSET$y, value);
        return this;
    }

    public @EnumType(SDL_MouseWheelDirection.class) int direction() {
        return segment.get(LAYOUT$direction, OFFSET$direction);
    }

    public SDL_MouseWheelEvent direction(@EnumType(SDL_MouseWheelDirection.class) int value) {
        segment.set(LAYOUT$direction, OFFSET$direction, value);
        return this;
    }

    public float mouse_x() {
        return segment.get(LAYOUT$mouse_x, OFFSET$mouse_x);
    }

    public SDL_MouseWheelEvent mouse_x(float value) {
        segment.set(LAYOUT$mouse_x, OFFSET$mouse_x, value);
        return this;
    }

    public float mouse_y() {
        return segment.get(LAYOUT$mouse_y, OFFSET$mouse_y);
    }

    public SDL_MouseWheelEvent mouse_y(float value) {
        segment.set(LAYOUT$mouse_y, OFFSET$mouse_y, value);
        return this;
    }

    public @NativeType("Sint32") int integer_x() {
        return segment.get(LAYOUT$integer_x, OFFSET$integer_x);
    }

    public SDL_MouseWheelEvent integer_x(@NativeType("Sint32") int value) {
        segment.set(LAYOUT$integer_x, OFFSET$integer_x, value);
        return this;
    }

    public @NativeType("Sint32") int integer_y() {
        return segment.get(LAYOUT$integer_y, OFFSET$integer_y);
    }

    public SDL_MouseWheelEvent integer_y(@NativeType("Sint32") int value) {
        segment.set(LAYOUT$integer_y, OFFSET$integer_y, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.JAVA_INT.withName("reserved"),
        ValueLayout.JAVA_LONG.withName("timestamp"),
        ValueLayout.JAVA_INT.withName("windowID"),
        ValueLayout.JAVA_INT.withName("which"),
        ValueLayout.JAVA_FLOAT.withName("x"),
        ValueLayout.JAVA_FLOAT.withName("y"),
        ValueLayout.JAVA_INT.withName("direction"),
        ValueLayout.JAVA_FLOAT.withName("mouse_x"),
        ValueLayout.JAVA_FLOAT.withName("mouse_y"),
        ValueLayout.JAVA_INT.withName("integer_x"),
        ValueLayout.JAVA_INT.withName("integer_y")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$timestamp = PathElement.groupElement("timestamp");
    public static final PathElement PATH$windowID = PathElement.groupElement("windowID");
    public static final PathElement PATH$which = PathElement.groupElement("which");
    public static final PathElement PATH$x = PathElement.groupElement("x");
    public static final PathElement PATH$y = PathElement.groupElement("y");
    public static final PathElement PATH$direction = PathElement.groupElement("direction");
    public static final PathElement PATH$mouse_x = PathElement.groupElement("mouse_x");
    public static final PathElement PATH$mouse_y = PathElement.groupElement("mouse_y");
    public static final PathElement PATH$integer_x = PathElement.groupElement("integer_x");
    public static final PathElement PATH$integer_y = PathElement.groupElement("integer_y");

    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final OfLong LAYOUT$timestamp = (OfLong) LAYOUT.select(PATH$timestamp);
    public static final OfInt LAYOUT$windowID = (OfInt) LAYOUT.select(PATH$windowID);
    public static final OfInt LAYOUT$which = (OfInt) LAYOUT.select(PATH$which);
    public static final OfFloat LAYOUT$x = (OfFloat) LAYOUT.select(PATH$x);
    public static final OfFloat LAYOUT$y = (OfFloat) LAYOUT.select(PATH$y);
    public static final OfInt LAYOUT$direction = (OfInt) LAYOUT.select(PATH$direction);
    public static final OfFloat LAYOUT$mouse_x = (OfFloat) LAYOUT.select(PATH$mouse_x);
    public static final OfFloat LAYOUT$mouse_y = (OfFloat) LAYOUT.select(PATH$mouse_y);
    public static final OfInt LAYOUT$integer_x = (OfInt) LAYOUT.select(PATH$integer_x);
    public static final OfInt LAYOUT$integer_y = (OfInt) LAYOUT.select(PATH$integer_y);

    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$timestamp = LAYOUT$timestamp.byteSize();
    public static final long SIZE$windowID = LAYOUT$windowID.byteSize();
    public static final long SIZE$which = LAYOUT$which.byteSize();
    public static final long SIZE$x = LAYOUT$x.byteSize();
    public static final long SIZE$y = LAYOUT$y.byteSize();
    public static final long SIZE$direction = LAYOUT$direction.byteSize();
    public static final long SIZE$mouse_x = LAYOUT$mouse_x.byteSize();
    public static final long SIZE$mouse_y = LAYOUT$mouse_y.byteSize();
    public static final long SIZE$integer_x = LAYOUT$integer_x.byteSize();
    public static final long SIZE$integer_y = LAYOUT$integer_y.byteSize();

    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$timestamp = LAYOUT.byteOffset(PATH$timestamp);
    public static final long OFFSET$windowID = LAYOUT.byteOffset(PATH$windowID);
    public static final long OFFSET$which = LAYOUT.byteOffset(PATH$which);
    public static final long OFFSET$x = LAYOUT.byteOffset(PATH$x);
    public static final long OFFSET$y = LAYOUT.byteOffset(PATH$y);
    public static final long OFFSET$direction = LAYOUT.byteOffset(PATH$direction);
    public static final long OFFSET$mouse_x = LAYOUT.byteOffset(PATH$mouse_x);
    public static final long OFFSET$mouse_y = LAYOUT.byteOffset(PATH$mouse_y);
    public static final long OFFSET$integer_x = LAYOUT.byteOffset(PATH$integer_x);
    public static final long OFFSET$integer_y = LAYOUT.byteOffset(PATH$integer_y);
}
