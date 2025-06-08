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

/// Touch finger event structure (event.tfinger.*)
///
/// Coordinates in this event are normalized. `x` and `y` are normalized to a
/// range between 0.0f and 1.0f, relative to the window, so (0,0) is the top
/// left and (1,1) is the bottom right. Delta coordinates `dx` and `dy` are
/// normalized in the ranges of -1.0f (traversed all the way from the bottom or
/// right to all the way up or left) to 1.0f (traversed all the way from the
/// top or left to all the way down or right).
///
/// Note that while the coordinates are _normalized_, they are not _clamped_,
/// which means in some circumstances you can get a value outside of this
/// range. For example, a renderer using logical presentation might give a
/// negative value when the touch is in the letterboxing. Some platforms might
/// report a touch outside of the window, which will also be outside of the
/// range.
///
/// \since This struct is available since SDL 3.2.0.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct SDL_TouchFingerEvent {
///     SDL_EventType type; // @link substring="SDL_EventType" target="SDL_EventType" @link substring="type" target="#type"
///     Uint32 reserved;
///     Uint64 timestamp; // @link substring="timestamp" target="#timestamp"
///     SDL_TouchID touchID; // @link substring="touchID" target="#touchID"
///     SDL_FingerID fingerID; // @link substring="fingerID" target="#fingerID"
///     float x; // @link substring="x" target="#x"
///     float y; // @link substring="y" target="#y"
///     float dx; // @link substring="dx" target="#dx"
///     float dy; // @link substring="dy" target="#dy"
///     float pressure; // @link substring="pressure" target="#pressure"
///     SDL_WindowID windowID; // @link substring="windowID" target="#windowID"
/// } SDL_TouchFingerEvent;
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
public record SDL_TouchFingerEvent(@NotNull MemorySegment segment) implements ISDL_TouchFingerEvent {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link SDL_TouchFingerEvent}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// ISDL_TouchFingerEvent to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code SDL_TouchFingerEvent.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements ISDL_TouchFingerEvent, Iterable<SDL_TouchFingerEvent> {
        public long size() {
            return segment.byteSize() / SDL_TouchFingerEvent.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull SDL_TouchFingerEvent at(long index) {
            return new SDL_TouchFingerEvent(segment.asSlice(index * SDL_TouchFingerEvent.BYTES, SDL_TouchFingerEvent.BYTES));
        }

        public void write(long index, @NotNull SDL_TouchFingerEvent value) {
            MemorySegment s = segment.asSlice(index * SDL_TouchFingerEvent.BYTES, SDL_TouchFingerEvent.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * SDL_TouchFingerEvent.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * SDL_TouchFingerEvent.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * SDL_TouchFingerEvent.BYTES,
                (end - start) * SDL_TouchFingerEvent.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * SDL_TouchFingerEvent.BYTES));
        }

        public SDL_TouchFingerEvent[] toArray() {
            SDL_TouchFingerEvent[] ret = new SDL_TouchFingerEvent[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<SDL_TouchFingerEvent> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<SDL_TouchFingerEvent> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= SDL_TouchFingerEvent.BYTES;
            }

            @Override
            public SDL_TouchFingerEvent next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                SDL_TouchFingerEvent ret = new SDL_TouchFingerEvent(segment.asSlice(0, SDL_TouchFingerEvent.BYTES));
                segment = segment.asSlice(SDL_TouchFingerEvent.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static SDL_TouchFingerEvent allocate(Arena arena) {
        return new SDL_TouchFingerEvent(arena.allocate(LAYOUT));
    }

    public static SDL_TouchFingerEvent.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new SDL_TouchFingerEvent.Ptr(segment);
    }

    public static SDL_TouchFingerEvent clone(Arena arena, SDL_TouchFingerEvent src) {
        SDL_TouchFingerEvent ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @EnumType(SDL_EventType.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public SDL_TouchFingerEvent type(@EnumType(SDL_EventType.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
        return this;
    }


    public @NativeType("Uint64") @Unsigned long timestamp() {
        return segment.get(LAYOUT$timestamp, OFFSET$timestamp);
    }

    public SDL_TouchFingerEvent timestamp(@NativeType("Uint64") @Unsigned long value) {
        segment.set(LAYOUT$timestamp, OFFSET$timestamp, value);
        return this;
    }

    public @NativeType("SDL_TouchID") @Unsigned long touchID() {
        return segment.get(LAYOUT$touchID, OFFSET$touchID);
    }

    public SDL_TouchFingerEvent touchID(@NativeType("SDL_TouchID") @Unsigned long value) {
        segment.set(LAYOUT$touchID, OFFSET$touchID, value);
        return this;
    }

    public @NativeType("SDL_FingerID") @Unsigned long fingerID() {
        return segment.get(LAYOUT$fingerID, OFFSET$fingerID);
    }

    public SDL_TouchFingerEvent fingerID(@NativeType("SDL_FingerID") @Unsigned long value) {
        segment.set(LAYOUT$fingerID, OFFSET$fingerID, value);
        return this;
    }

    public float x() {
        return segment.get(LAYOUT$x, OFFSET$x);
    }

    public SDL_TouchFingerEvent x(float value) {
        segment.set(LAYOUT$x, OFFSET$x, value);
        return this;
    }

    public float y() {
        return segment.get(LAYOUT$y, OFFSET$y);
    }

    public SDL_TouchFingerEvent y(float value) {
        segment.set(LAYOUT$y, OFFSET$y, value);
        return this;
    }

    public float dx() {
        return segment.get(LAYOUT$dx, OFFSET$dx);
    }

    public SDL_TouchFingerEvent dx(float value) {
        segment.set(LAYOUT$dx, OFFSET$dx, value);
        return this;
    }

    public float dy() {
        return segment.get(LAYOUT$dy, OFFSET$dy);
    }

    public SDL_TouchFingerEvent dy(float value) {
        segment.set(LAYOUT$dy, OFFSET$dy, value);
        return this;
    }

    public float pressure() {
        return segment.get(LAYOUT$pressure, OFFSET$pressure);
    }

    public SDL_TouchFingerEvent pressure(float value) {
        segment.set(LAYOUT$pressure, OFFSET$pressure, value);
        return this;
    }

    public @NativeType("SDL_WindowID") @Unsigned int windowID() {
        return segment.get(LAYOUT$windowID, OFFSET$windowID);
    }

    public SDL_TouchFingerEvent windowID(@NativeType("SDL_WindowID") @Unsigned int value) {
        segment.set(LAYOUT$windowID, OFFSET$windowID, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.JAVA_INT.withName("reserved"),
        ValueLayout.JAVA_LONG.withName("timestamp"),
        ValueLayout.JAVA_LONG.withName("touchID"),
        ValueLayout.JAVA_LONG.withName("fingerID"),
        ValueLayout.JAVA_FLOAT.withName("x"),
        ValueLayout.JAVA_FLOAT.withName("y"),
        ValueLayout.JAVA_FLOAT.withName("dx"),
        ValueLayout.JAVA_FLOAT.withName("dy"),
        ValueLayout.JAVA_FLOAT.withName("pressure"),
        ValueLayout.JAVA_INT.withName("windowID")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$timestamp = PathElement.groupElement("timestamp");
    public static final PathElement PATH$touchID = PathElement.groupElement("touchID");
    public static final PathElement PATH$fingerID = PathElement.groupElement("fingerID");
    public static final PathElement PATH$x = PathElement.groupElement("x");
    public static final PathElement PATH$y = PathElement.groupElement("y");
    public static final PathElement PATH$dx = PathElement.groupElement("dx");
    public static final PathElement PATH$dy = PathElement.groupElement("dy");
    public static final PathElement PATH$pressure = PathElement.groupElement("pressure");
    public static final PathElement PATH$windowID = PathElement.groupElement("windowID");

    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final OfLong LAYOUT$timestamp = (OfLong) LAYOUT.select(PATH$timestamp);
    public static final OfLong LAYOUT$touchID = (OfLong) LAYOUT.select(PATH$touchID);
    public static final OfLong LAYOUT$fingerID = (OfLong) LAYOUT.select(PATH$fingerID);
    public static final OfFloat LAYOUT$x = (OfFloat) LAYOUT.select(PATH$x);
    public static final OfFloat LAYOUT$y = (OfFloat) LAYOUT.select(PATH$y);
    public static final OfFloat LAYOUT$dx = (OfFloat) LAYOUT.select(PATH$dx);
    public static final OfFloat LAYOUT$dy = (OfFloat) LAYOUT.select(PATH$dy);
    public static final OfFloat LAYOUT$pressure = (OfFloat) LAYOUT.select(PATH$pressure);
    public static final OfInt LAYOUT$windowID = (OfInt) LAYOUT.select(PATH$windowID);

    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$timestamp = LAYOUT$timestamp.byteSize();
    public static final long SIZE$touchID = LAYOUT$touchID.byteSize();
    public static final long SIZE$fingerID = LAYOUT$fingerID.byteSize();
    public static final long SIZE$x = LAYOUT$x.byteSize();
    public static final long SIZE$y = LAYOUT$y.byteSize();
    public static final long SIZE$dx = LAYOUT$dx.byteSize();
    public static final long SIZE$dy = LAYOUT$dy.byteSize();
    public static final long SIZE$pressure = LAYOUT$pressure.byteSize();
    public static final long SIZE$windowID = LAYOUT$windowID.byteSize();

    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$timestamp = LAYOUT.byteOffset(PATH$timestamp);
    public static final long OFFSET$touchID = LAYOUT.byteOffset(PATH$touchID);
    public static final long OFFSET$fingerID = LAYOUT.byteOffset(PATH$fingerID);
    public static final long OFFSET$x = LAYOUT.byteOffset(PATH$x);
    public static final long OFFSET$y = LAYOUT.byteOffset(PATH$y);
    public static final long OFFSET$dx = LAYOUT.byteOffset(PATH$dx);
    public static final long OFFSET$dy = LAYOUT.byteOffset(PATH$dy);
    public static final long OFFSET$pressure = LAYOUT.byteOffset(PATH$pressure);
    public static final long OFFSET$windowID = LAYOUT.byteOffset(PATH$windowID);
}
