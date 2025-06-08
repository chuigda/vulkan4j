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

/// Keyboard text input event structure (event.text.*)
///
/// This event will never be delivered unless text input is enabled by calling
/// SDL_StartTextInput(). Text input is disabled by default!
///
/// Since: This struct is available since SDL 3.2.0.
///
/// See also:
/// - `SDL_StartTextInput`
/// - `SDL_StopTextInput`
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct SDL_TextInputEvent {
///     SDL_EventType type; // @link substring="SDL_EventType" target="SDL_EventType" @link substring="type" target="#type"
///     Uint32 reserved;
///     Uint64 timestamp; // @link substring="timestamp" target="#timestamp"
///     SDL_WindowID windowID; // @link substring="windowID" target="#windowID"
///     char const* text; // @link substring="text" target="#text"
/// } SDL_TextInputEvent;
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
public record SDL_TextInputEvent(@NotNull MemorySegment segment) implements ISDL_TextInputEvent {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link SDL_TextInputEvent}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// ISDL_TextInputEvent to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code SDL_TextInputEvent.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements ISDL_TextInputEvent, Iterable<SDL_TextInputEvent> {
        public long size() {
            return segment.byteSize() / SDL_TextInputEvent.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull SDL_TextInputEvent at(long index) {
            return new SDL_TextInputEvent(segment.asSlice(index * SDL_TextInputEvent.BYTES, SDL_TextInputEvent.BYTES));
        }

        public void write(long index, @NotNull SDL_TextInputEvent value) {
            MemorySegment s = segment.asSlice(index * SDL_TextInputEvent.BYTES, SDL_TextInputEvent.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * SDL_TextInputEvent.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * SDL_TextInputEvent.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * SDL_TextInputEvent.BYTES,
                (end - start) * SDL_TextInputEvent.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * SDL_TextInputEvent.BYTES));
        }

        public SDL_TextInputEvent[] toArray() {
            SDL_TextInputEvent[] ret = new SDL_TextInputEvent[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<SDL_TextInputEvent> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<SDL_TextInputEvent> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= SDL_TextInputEvent.BYTES;
            }

            @Override
            public SDL_TextInputEvent next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                SDL_TextInputEvent ret = new SDL_TextInputEvent(segment.asSlice(0, SDL_TextInputEvent.BYTES));
                segment = segment.asSlice(SDL_TextInputEvent.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static SDL_TextInputEvent allocate(Arena arena) {
        return new SDL_TextInputEvent(arena.allocate(LAYOUT));
    }

    public static SDL_TextInputEvent.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new SDL_TextInputEvent.Ptr(segment);
    }

    public static SDL_TextInputEvent clone(Arena arena, SDL_TextInputEvent src) {
        SDL_TextInputEvent ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @EnumType(SDL_EventType.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public SDL_TextInputEvent type(@EnumType(SDL_EventType.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
        return this;
    }


    public @NativeType("Uint64") @Unsigned long timestamp() {
        return segment.get(LAYOUT$timestamp, OFFSET$timestamp);
    }

    public SDL_TextInputEvent timestamp(@NativeType("Uint64") @Unsigned long value) {
        segment.set(LAYOUT$timestamp, OFFSET$timestamp, value);
        return this;
    }

    public @NativeType("SDL_WindowID") @Unsigned int windowID() {
        return segment.get(LAYOUT$windowID, OFFSET$windowID);
    }

    public SDL_TextInputEvent windowID(@NativeType("SDL_WindowID") @Unsigned int value) {
        segment.set(LAYOUT$windowID, OFFSET$windowID, value);
        return this;
    }

    /// Note: the returned {@link BytePtr} does not have correct
    /// {@link BytePtr#size} property. It's up to user to track the size of the buffer,
    /// and use {@link BytePtr#reinterpret} to set the size before actually reading from or
    /// writing to the buffer.
    public @Nullable BytePtr text() {
        MemorySegment s = textRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new BytePtr(s);
    }

    public SDL_TextInputEvent text(@Nullable BytePtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        textRaw(s);
        return this;
    }

    public @Pointer(comment="int8_t*") MemorySegment textRaw() {
        return segment.get(LAYOUT$text, OFFSET$text);
    }

    public void textRaw(@Pointer(comment="int8_t*") MemorySegment value) {
        segment.set(LAYOUT$text, OFFSET$text, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.JAVA_INT.withName("reserved"),
        ValueLayout.JAVA_LONG.withName("timestamp"),
        ValueLayout.JAVA_INT.withName("windowID"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE).withName("text")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$timestamp = PathElement.groupElement("timestamp");
    public static final PathElement PATH$windowID = PathElement.groupElement("windowID");
    public static final PathElement PATH$text = PathElement.groupElement("text");

    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final OfLong LAYOUT$timestamp = (OfLong) LAYOUT.select(PATH$timestamp);
    public static final OfInt LAYOUT$windowID = (OfInt) LAYOUT.select(PATH$windowID);
    public static final AddressLayout LAYOUT$text = (AddressLayout) LAYOUT.select(PATH$text);

    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$timestamp = LAYOUT$timestamp.byteSize();
    public static final long SIZE$windowID = LAYOUT$windowID.byteSize();
    public static final long SIZE$text = LAYOUT$text.byteSize();

    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$timestamp = LAYOUT.byteOffset(PATH$timestamp);
    public static final long OFFSET$windowID = LAYOUT.byteOffset(PATH$windowID);
    public static final long OFFSET$text = LAYOUT.byteOffset(PATH$text);
}
