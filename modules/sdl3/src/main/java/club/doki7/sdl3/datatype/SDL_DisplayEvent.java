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

/// Display state change event data (event.display.*)
///
/// \since This struct is available since SDL 3.2.0.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct SDL_DisplayEvent {
///     SDL_EventType type; // @link substring="SDL_EventType" target="SDL_EventType" @link substring="type" target="#type"
///     Uint32 reserved;
///     Uint64 timestamp; // @link substring="timestamp" target="#timestamp"
///     SDL_DisplayID displayID; // @link substring="displayID" target="#displayID"
///     Sint32 data1; // @link substring="data1" target="#data1"
///     Sint32 data2; // @link substring="data2" target="#data2"
/// } SDL_DisplayEvent;
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
public record SDL_DisplayEvent(@NotNull MemorySegment segment) implements ISDL_DisplayEvent {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link SDL_DisplayEvent}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// ISDL_DisplayEvent to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code SDL_DisplayEvent.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements ISDL_DisplayEvent, Iterable<SDL_DisplayEvent> {
        public long size() {
            return segment.byteSize() / SDL_DisplayEvent.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull SDL_DisplayEvent at(long index) {
            return new SDL_DisplayEvent(segment.asSlice(index * SDL_DisplayEvent.BYTES, SDL_DisplayEvent.BYTES));
        }

        public void write(long index, @NotNull SDL_DisplayEvent value) {
            MemorySegment s = segment.asSlice(index * SDL_DisplayEvent.BYTES, SDL_DisplayEvent.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * SDL_DisplayEvent.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * SDL_DisplayEvent.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * SDL_DisplayEvent.BYTES,
                (end - start) * SDL_DisplayEvent.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * SDL_DisplayEvent.BYTES));
        }

        public SDL_DisplayEvent[] toArray() {
            SDL_DisplayEvent[] ret = new SDL_DisplayEvent[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<SDL_DisplayEvent> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<SDL_DisplayEvent> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= SDL_DisplayEvent.BYTES;
            }

            @Override
            public SDL_DisplayEvent next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                SDL_DisplayEvent ret = new SDL_DisplayEvent(segment.asSlice(0, SDL_DisplayEvent.BYTES));
                segment = segment.asSlice(SDL_DisplayEvent.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static SDL_DisplayEvent allocate(Arena arena) {
        return new SDL_DisplayEvent(arena.allocate(LAYOUT));
    }

    public static SDL_DisplayEvent.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new SDL_DisplayEvent.Ptr(segment);
    }

    public static SDL_DisplayEvent clone(Arena arena, SDL_DisplayEvent src) {
        SDL_DisplayEvent ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @EnumType(SDL_EventType.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public SDL_DisplayEvent type(@EnumType(SDL_EventType.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
        return this;
    }


    public @NativeType("Uint64") @Unsigned long timestamp() {
        return segment.get(LAYOUT$timestamp, OFFSET$timestamp);
    }

    public SDL_DisplayEvent timestamp(@NativeType("Uint64") @Unsigned long value) {
        segment.set(LAYOUT$timestamp, OFFSET$timestamp, value);
        return this;
    }

    public @NativeType("SDL_DisplayID") @Unsigned int displayID() {
        return segment.get(LAYOUT$displayID, OFFSET$displayID);
    }

    public SDL_DisplayEvent displayID(@NativeType("SDL_DisplayID") @Unsigned int value) {
        segment.set(LAYOUT$displayID, OFFSET$displayID, value);
        return this;
    }

    public @NativeType("Sint32") int data1() {
        return segment.get(LAYOUT$data1, OFFSET$data1);
    }

    public SDL_DisplayEvent data1(@NativeType("Sint32") int value) {
        segment.set(LAYOUT$data1, OFFSET$data1, value);
        return this;
    }

    public @NativeType("Sint32") int data2() {
        return segment.get(LAYOUT$data2, OFFSET$data2);
    }

    public SDL_DisplayEvent data2(@NativeType("Sint32") int value) {
        segment.set(LAYOUT$data2, OFFSET$data2, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.JAVA_INT.withName("reserved"),
        ValueLayout.JAVA_LONG.withName("timestamp"),
        ValueLayout.JAVA_INT.withName("displayID"),
        ValueLayout.JAVA_INT.withName("data1"),
        ValueLayout.JAVA_INT.withName("data2")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$timestamp = PathElement.groupElement("timestamp");
    public static final PathElement PATH$displayID = PathElement.groupElement("displayID");
    public static final PathElement PATH$data1 = PathElement.groupElement("data1");
    public static final PathElement PATH$data2 = PathElement.groupElement("data2");

    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final OfLong LAYOUT$timestamp = (OfLong) LAYOUT.select(PATH$timestamp);
    public static final OfInt LAYOUT$displayID = (OfInt) LAYOUT.select(PATH$displayID);
    public static final OfInt LAYOUT$data1 = (OfInt) LAYOUT.select(PATH$data1);
    public static final OfInt LAYOUT$data2 = (OfInt) LAYOUT.select(PATH$data2);

    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$timestamp = LAYOUT$timestamp.byteSize();
    public static final long SIZE$displayID = LAYOUT$displayID.byteSize();
    public static final long SIZE$data1 = LAYOUT$data1.byteSize();
    public static final long SIZE$data2 = LAYOUT$data2.byteSize();

    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$timestamp = LAYOUT.byteOffset(PATH$timestamp);
    public static final long OFFSET$displayID = LAYOUT.byteOffset(PATH$displayID);
    public static final long OFFSET$data1 = LAYOUT.byteOffset(PATH$data1);
    public static final long OFFSET$data2 = LAYOUT.byteOffset(PATH$data2);
}
