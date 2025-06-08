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

/// Keyboard IME candidates event structure (event.edit_candidates.*)
///
/// \since This struct is available since SDL 3.2.0.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct SDL_TextEditingCandidatesEvent {
///     SDL_EventType type; // optional // @link substring="SDL_EventType" target="SDL_EventType" @link substring="type" target="#type"
///     Uint32 reserved;
///     Uint64 timestamp; // optional // @link substring="timestamp" target="#timestamp"
///     SDL_WindowID windowID; // optional // @link substring="windowID" target="#windowID"
///     char const* const* candidates; // optional // @link substring="candidates" target="#candidates"
///     Sint32 num_candidates; // optional // @link substring="num_candidates" target="#num_candidates"
///     Sint32 selected_candidate; // optional // @link substring="selected_candidate" target="#selected_candidate"
///     bool horizontal; // optional // @link substring="horizontal" target="#horizontal"
///     Uint8 padding1; // optional // @link substring="padding1" target="#padding1"
///     Uint8 padding2; // optional // @link substring="padding2" target="#padding2"
///     Uint8 padding3; // optional // @link substring="padding3" target="#padding3"
/// } SDL_TextEditingCandidatesEvent;
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
public record SDL_TextEditingCandidatesEvent(@NotNull MemorySegment segment) implements ISDL_TextEditingCandidatesEvent {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link SDL_TextEditingCandidatesEvent}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// ISDL_TextEditingCandidatesEvent to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code SDL_TextEditingCandidatesEvent.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements ISDL_TextEditingCandidatesEvent, Iterable<SDL_TextEditingCandidatesEvent> {
        public long size() {
            return segment.byteSize() / SDL_TextEditingCandidatesEvent.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull SDL_TextEditingCandidatesEvent at(long index) {
            return new SDL_TextEditingCandidatesEvent(segment.asSlice(index * SDL_TextEditingCandidatesEvent.BYTES, SDL_TextEditingCandidatesEvent.BYTES));
        }

        public void write(long index, @NotNull SDL_TextEditingCandidatesEvent value) {
            MemorySegment s = segment.asSlice(index * SDL_TextEditingCandidatesEvent.BYTES, SDL_TextEditingCandidatesEvent.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * SDL_TextEditingCandidatesEvent.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * SDL_TextEditingCandidatesEvent.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * SDL_TextEditingCandidatesEvent.BYTES,
                (end - start) * SDL_TextEditingCandidatesEvent.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * SDL_TextEditingCandidatesEvent.BYTES));
        }

        public SDL_TextEditingCandidatesEvent[] toArray() {
            SDL_TextEditingCandidatesEvent[] ret = new SDL_TextEditingCandidatesEvent[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<SDL_TextEditingCandidatesEvent> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<SDL_TextEditingCandidatesEvent> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= SDL_TextEditingCandidatesEvent.BYTES;
            }

            @Override
            public SDL_TextEditingCandidatesEvent next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                SDL_TextEditingCandidatesEvent ret = new SDL_TextEditingCandidatesEvent(segment.asSlice(0, SDL_TextEditingCandidatesEvent.BYTES));
                segment = segment.asSlice(SDL_TextEditingCandidatesEvent.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static SDL_TextEditingCandidatesEvent allocate(Arena arena) {
        return new SDL_TextEditingCandidatesEvent(arena.allocate(LAYOUT));
    }

    public static SDL_TextEditingCandidatesEvent.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new SDL_TextEditingCandidatesEvent.Ptr(segment);
    }

    public static SDL_TextEditingCandidatesEvent clone(Arena arena, SDL_TextEditingCandidatesEvent src) {
        SDL_TextEditingCandidatesEvent ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @EnumType(SDL_EventType.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public SDL_TextEditingCandidatesEvent type(@EnumType(SDL_EventType.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
        return this;
    }


    public @NativeType("Uint64") @Unsigned long timestamp() {
        return segment.get(LAYOUT$timestamp, OFFSET$timestamp);
    }

    public SDL_TextEditingCandidatesEvent timestamp(@NativeType("Uint64") @Unsigned long value) {
        segment.set(LAYOUT$timestamp, OFFSET$timestamp, value);
        return this;
    }

    public @NativeType("SDL_WindowID") @Unsigned int windowID() {
        return segment.get(LAYOUT$windowID, OFFSET$windowID);
    }

    public SDL_TextEditingCandidatesEvent windowID(@NativeType("SDL_WindowID") @Unsigned int value) {
        segment.set(LAYOUT$windowID, OFFSET$windowID, value);
        return this;
    }

    /// Note: the returned {@link PointerPtr} does not have correct {@link PointerPtr#size} property. It's up
    /// to user to track the size of the buffer, and use {@link PointerPtr#reinterpret} to set the size before
    /// actually reading from or writing to the buffer.
    public @Nullable PointerPtr candidates() {
        MemorySegment s = candidatesRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new PointerPtr(s);
    }

    public SDL_TextEditingCandidatesEvent candidates(@Nullable PointerPtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        candidatesRaw(s);
        return this;
    }

    public @Pointer(comment="void**") MemorySegment candidatesRaw() {
        return segment.get(LAYOUT$candidates, OFFSET$candidates);
    }

    public void candidatesRaw(@Pointer(comment="void**") MemorySegment value) {
        segment.set(LAYOUT$candidates, OFFSET$candidates, value);
    }

    public @NativeType("Sint32") int num_candidates() {
        return segment.get(LAYOUT$num_candidates, OFFSET$num_candidates);
    }

    public SDL_TextEditingCandidatesEvent num_candidates(@NativeType("Sint32") int value) {
        segment.set(LAYOUT$num_candidates, OFFSET$num_candidates, value);
        return this;
    }

    public @NativeType("Sint32") int selected_candidate() {
        return segment.get(LAYOUT$selected_candidate, OFFSET$selected_candidate);
    }

    public SDL_TextEditingCandidatesEvent selected_candidate(@NativeType("Sint32") int value) {
        segment.set(LAYOUT$selected_candidate, OFFSET$selected_candidate, value);
        return this;
    }

    public @NativeType("boolean") boolean horizontal() {
        return segment.get(LAYOUT$horizontal, OFFSET$horizontal);
    }

    public SDL_TextEditingCandidatesEvent horizontal(@NativeType("boolean") boolean value) {
        segment.set(LAYOUT$horizontal, OFFSET$horizontal, value);
        return this;
    }

    public @NativeType("Uint8") @Unsigned byte padding1() {
        return segment.get(LAYOUT$padding1, OFFSET$padding1);
    }

    public SDL_TextEditingCandidatesEvent padding1(@NativeType("Uint8") @Unsigned byte value) {
        segment.set(LAYOUT$padding1, OFFSET$padding1, value);
        return this;
    }

    public @NativeType("Uint8") @Unsigned byte padding2() {
        return segment.get(LAYOUT$padding2, OFFSET$padding2);
    }

    public SDL_TextEditingCandidatesEvent padding2(@NativeType("Uint8") @Unsigned byte value) {
        segment.set(LAYOUT$padding2, OFFSET$padding2, value);
        return this;
    }

    public @NativeType("Uint8") @Unsigned byte padding3() {
        return segment.get(LAYOUT$padding3, OFFSET$padding3);
    }

    public SDL_TextEditingCandidatesEvent padding3(@NativeType("Uint8") @Unsigned byte value) {
        segment.set(LAYOUT$padding3, OFFSET$padding3, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.JAVA_INT.withName("reserved"),
        ValueLayout.JAVA_LONG.withName("timestamp"),
        ValueLayout.JAVA_INT.withName("windowID"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE)).withName("candidates"),
        ValueLayout.JAVA_INT.withName("num_candidates"),
        ValueLayout.JAVA_INT.withName("selected_candidate"),
        ValueLayout.JAVA_BOOLEAN.withName("horizontal"),
        ValueLayout.JAVA_BYTE.withName("padding1"),
        ValueLayout.JAVA_BYTE.withName("padding2"),
        ValueLayout.JAVA_BYTE.withName("padding3")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$timestamp = PathElement.groupElement("timestamp");
    public static final PathElement PATH$windowID = PathElement.groupElement("windowID");
    public static final PathElement PATH$candidates = PathElement.groupElement("candidates");
    public static final PathElement PATH$num_candidates = PathElement.groupElement("num_candidates");
    public static final PathElement PATH$selected_candidate = PathElement.groupElement("selected_candidate");
    public static final PathElement PATH$horizontal = PathElement.groupElement("horizontal");
    public static final PathElement PATH$padding1 = PathElement.groupElement("padding1");
    public static final PathElement PATH$padding2 = PathElement.groupElement("padding2");
    public static final PathElement PATH$padding3 = PathElement.groupElement("padding3");

    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final OfLong LAYOUT$timestamp = (OfLong) LAYOUT.select(PATH$timestamp);
    public static final OfInt LAYOUT$windowID = (OfInt) LAYOUT.select(PATH$windowID);
    public static final AddressLayout LAYOUT$candidates = (AddressLayout) LAYOUT.select(PATH$candidates);
    public static final OfInt LAYOUT$num_candidates = (OfInt) LAYOUT.select(PATH$num_candidates);
    public static final OfInt LAYOUT$selected_candidate = (OfInt) LAYOUT.select(PATH$selected_candidate);
    public static final OfBoolean LAYOUT$horizontal = (OfBoolean) LAYOUT.select(PATH$horizontal);
    public static final OfByte LAYOUT$padding1 = (OfByte) LAYOUT.select(PATH$padding1);
    public static final OfByte LAYOUT$padding2 = (OfByte) LAYOUT.select(PATH$padding2);
    public static final OfByte LAYOUT$padding3 = (OfByte) LAYOUT.select(PATH$padding3);

    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$timestamp = LAYOUT$timestamp.byteSize();
    public static final long SIZE$windowID = LAYOUT$windowID.byteSize();
    public static final long SIZE$candidates = LAYOUT$candidates.byteSize();
    public static final long SIZE$num_candidates = LAYOUT$num_candidates.byteSize();
    public static final long SIZE$selected_candidate = LAYOUT$selected_candidate.byteSize();
    public static final long SIZE$horizontal = LAYOUT$horizontal.byteSize();
    public static final long SIZE$padding1 = LAYOUT$padding1.byteSize();
    public static final long SIZE$padding2 = LAYOUT$padding2.byteSize();
    public static final long SIZE$padding3 = LAYOUT$padding3.byteSize();

    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$timestamp = LAYOUT.byteOffset(PATH$timestamp);
    public static final long OFFSET$windowID = LAYOUT.byteOffset(PATH$windowID);
    public static final long OFFSET$candidates = LAYOUT.byteOffset(PATH$candidates);
    public static final long OFFSET$num_candidates = LAYOUT.byteOffset(PATH$num_candidates);
    public static final long OFFSET$selected_candidate = LAYOUT.byteOffset(PATH$selected_candidate);
    public static final long OFFSET$horizontal = LAYOUT.byteOffset(PATH$horizontal);
    public static final long OFFSET$padding1 = LAYOUT.byteOffset(PATH$padding1);
    public static final long OFFSET$padding2 = LAYOUT.byteOffset(PATH$padding2);
    public static final long OFFSET$padding3 = LAYOUT.byteOffset(PATH$padding3);
}
