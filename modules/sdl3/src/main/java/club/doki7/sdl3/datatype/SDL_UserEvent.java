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

/// A user-defined event type (event.user.*)
///
/// This event is unique; it is never created by SDL, but only by the
/// application. The event can be pushed onto the event queue using
/// SDL_PushEvent(). The contents of the structure members are completely up to
/// the programmer; the only requirement is that '''type''' is a value obtained
/// from SDL_RegisterEvents().
///
/// \since This struct is available since SDL 3.2.0.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct SDL_UserEvent {
///     Uint32 type; // optional // @link substring="type" target="#type"
///     Uint32 reserved;
///     Uint64 timestamp; // optional // @link substring="timestamp" target="#timestamp"
///     SDL_WindowID windowID; // optional // @link substring="windowID" target="#windowID"
///     Sint32 code; // optional // @link substring="code" target="#code"
///     void* data1; // optional // @link substring="data1" target="#data1"
///     void* data2; // optional // @link substring="data2" target="#data2"
/// } SDL_UserEvent;
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
public record SDL_UserEvent(@NotNull MemorySegment segment) implements ISDL_UserEvent {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link SDL_UserEvent}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// ISDL_UserEvent to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code SDL_UserEvent.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements ISDL_UserEvent, Iterable<SDL_UserEvent> {
        public long size() {
            return segment.byteSize() / SDL_UserEvent.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull SDL_UserEvent at(long index) {
            return new SDL_UserEvent(segment.asSlice(index * SDL_UserEvent.BYTES, SDL_UserEvent.BYTES));
        }

        public void write(long index, @NotNull SDL_UserEvent value) {
            MemorySegment s = segment.asSlice(index * SDL_UserEvent.BYTES, SDL_UserEvent.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * SDL_UserEvent.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * SDL_UserEvent.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * SDL_UserEvent.BYTES,
                (end - start) * SDL_UserEvent.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * SDL_UserEvent.BYTES));
        }

        public SDL_UserEvent[] toArray() {
            SDL_UserEvent[] ret = new SDL_UserEvent[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<SDL_UserEvent> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<SDL_UserEvent> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= SDL_UserEvent.BYTES;
            }

            @Override
            public SDL_UserEvent next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                SDL_UserEvent ret = new SDL_UserEvent(segment.asSlice(0, SDL_UserEvent.BYTES));
                segment = segment.asSlice(SDL_UserEvent.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static SDL_UserEvent allocate(Arena arena) {
        return new SDL_UserEvent(arena.allocate(LAYOUT));
    }

    public static SDL_UserEvent.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new SDL_UserEvent.Ptr(segment);
    }

    public static SDL_UserEvent clone(Arena arena, SDL_UserEvent src) {
        SDL_UserEvent ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @NativeType("Uint32") @Unsigned int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public SDL_UserEvent type(@NativeType("Uint32") @Unsigned int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
        return this;
    }


    public @NativeType("Uint64") @Unsigned long timestamp() {
        return segment.get(LAYOUT$timestamp, OFFSET$timestamp);
    }

    public SDL_UserEvent timestamp(@NativeType("Uint64") @Unsigned long value) {
        segment.set(LAYOUT$timestamp, OFFSET$timestamp, value);
        return this;
    }

    public @NativeType("SDL_WindowID") @Unsigned int windowID() {
        return segment.get(LAYOUT$windowID, OFFSET$windowID);
    }

    public SDL_UserEvent windowID(@NativeType("SDL_WindowID") @Unsigned int value) {
        segment.set(LAYOUT$windowID, OFFSET$windowID, value);
        return this;
    }

    public @NativeType("Sint32") int code() {
        return segment.get(LAYOUT$code, OFFSET$code);
    }

    public SDL_UserEvent code(@NativeType("Sint32") int value) {
        segment.set(LAYOUT$code, OFFSET$code, value);
        return this;
    }

    public @Pointer(comment="void*") MemorySegment data1() {
        return segment.get(LAYOUT$data1, OFFSET$data1);
    }

    public void data1(@Pointer(comment="void*") MemorySegment value) {
        segment.set(LAYOUT$data1, OFFSET$data1, value);
    }

    public SDL_UserEvent data1(@Nullable IPointer pointer) {
        data1(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @Pointer(comment="void*") MemorySegment data2() {
        return segment.get(LAYOUT$data2, OFFSET$data2);
    }

    public void data2(@Pointer(comment="void*") MemorySegment value) {
        segment.set(LAYOUT$data2, OFFSET$data2, value);
    }

    public SDL_UserEvent data2(@Nullable IPointer pointer) {
        data2(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.JAVA_INT.withName("reserved"),
        ValueLayout.JAVA_LONG.withName("timestamp"),
        ValueLayout.JAVA_INT.withName("windowID"),
        ValueLayout.JAVA_INT.withName("code"),
        ValueLayout.ADDRESS.withName("data1"),
        ValueLayout.ADDRESS.withName("data2")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$timestamp = PathElement.groupElement("timestamp");
    public static final PathElement PATH$windowID = PathElement.groupElement("windowID");
    public static final PathElement PATH$code = PathElement.groupElement("code");
    public static final PathElement PATH$data1 = PathElement.groupElement("data1");
    public static final PathElement PATH$data2 = PathElement.groupElement("data2");

    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final OfLong LAYOUT$timestamp = (OfLong) LAYOUT.select(PATH$timestamp);
    public static final OfInt LAYOUT$windowID = (OfInt) LAYOUT.select(PATH$windowID);
    public static final OfInt LAYOUT$code = (OfInt) LAYOUT.select(PATH$code);
    public static final AddressLayout LAYOUT$data1 = (AddressLayout) LAYOUT.select(PATH$data1);
    public static final AddressLayout LAYOUT$data2 = (AddressLayout) LAYOUT.select(PATH$data2);

    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$timestamp = LAYOUT$timestamp.byteSize();
    public static final long SIZE$windowID = LAYOUT$windowID.byteSize();
    public static final long SIZE$code = LAYOUT$code.byteSize();
    public static final long SIZE$data1 = LAYOUT$data1.byteSize();
    public static final long SIZE$data2 = LAYOUT$data2.byteSize();

    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$timestamp = LAYOUT.byteOffset(PATH$timestamp);
    public static final long OFFSET$windowID = LAYOUT.byteOffset(PATH$windowID);
    public static final long OFFSET$code = LAYOUT.byteOffset(PATH$code);
    public static final long OFFSET$data1 = LAYOUT.byteOffset(PATH$data1);
    public static final long OFFSET$data2 = LAYOUT.byteOffset(PATH$data2);
}
