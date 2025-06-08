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

/// An event triggered when the clipboard contents have changed
/// (event.clipboard.*)
///
/// \since This struct is available since SDL 3.2.0.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct SDL_ClipboardEvent {
///     SDL_EventType type; // optional // @link substring="SDL_EventType" target="SDL_EventType" @link substring="type" target="#type"
///     Uint32 reserved;
///     Uint64 timestamp; // optional // @link substring="timestamp" target="#timestamp"
///     bool owner; // optional // @link substring="owner" target="#owner"
///     Sint32 num_mime_types; // optional // @link substring="num_mime_types" target="#num_mime_types"
///     char const** mime_types; // optional // @link substring="mime_types" target="#mime_types"
/// } SDL_ClipboardEvent;
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
public record SDL_ClipboardEvent(@NotNull MemorySegment segment) implements ISDL_ClipboardEvent {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link SDL_ClipboardEvent}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// ISDL_ClipboardEvent to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code SDL_ClipboardEvent.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements ISDL_ClipboardEvent, Iterable<SDL_ClipboardEvent> {
        public long size() {
            return segment.byteSize() / SDL_ClipboardEvent.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull SDL_ClipboardEvent at(long index) {
            return new SDL_ClipboardEvent(segment.asSlice(index * SDL_ClipboardEvent.BYTES, SDL_ClipboardEvent.BYTES));
        }

        public void write(long index, @NotNull SDL_ClipboardEvent value) {
            MemorySegment s = segment.asSlice(index * SDL_ClipboardEvent.BYTES, SDL_ClipboardEvent.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * SDL_ClipboardEvent.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * SDL_ClipboardEvent.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * SDL_ClipboardEvent.BYTES,
                (end - start) * SDL_ClipboardEvent.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * SDL_ClipboardEvent.BYTES));
        }

        public SDL_ClipboardEvent[] toArray() {
            SDL_ClipboardEvent[] ret = new SDL_ClipboardEvent[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<SDL_ClipboardEvent> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<SDL_ClipboardEvent> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= SDL_ClipboardEvent.BYTES;
            }

            @Override
            public SDL_ClipboardEvent next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                SDL_ClipboardEvent ret = new SDL_ClipboardEvent(segment.asSlice(0, SDL_ClipboardEvent.BYTES));
                segment = segment.asSlice(SDL_ClipboardEvent.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static SDL_ClipboardEvent allocate(Arena arena) {
        return new SDL_ClipboardEvent(arena.allocate(LAYOUT));
    }

    public static SDL_ClipboardEvent.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new SDL_ClipboardEvent.Ptr(segment);
    }

    public static SDL_ClipboardEvent clone(Arena arena, SDL_ClipboardEvent src) {
        SDL_ClipboardEvent ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @EnumType(SDL_EventType.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public SDL_ClipboardEvent type(@EnumType(SDL_EventType.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
        return this;
    }


    public @NativeType("Uint64") @Unsigned long timestamp() {
        return segment.get(LAYOUT$timestamp, OFFSET$timestamp);
    }

    public SDL_ClipboardEvent timestamp(@NativeType("Uint64") @Unsigned long value) {
        segment.set(LAYOUT$timestamp, OFFSET$timestamp, value);
        return this;
    }

    public @NativeType("boolean") boolean owner() {
        return segment.get(LAYOUT$owner, OFFSET$owner);
    }

    public SDL_ClipboardEvent owner(@NativeType("boolean") boolean value) {
        segment.set(LAYOUT$owner, OFFSET$owner, value);
        return this;
    }

    public @NativeType("Sint32") int num_mime_types() {
        return segment.get(LAYOUT$num_mime_types, OFFSET$num_mime_types);
    }

    public SDL_ClipboardEvent num_mime_types(@NativeType("Sint32") int value) {
        segment.set(LAYOUT$num_mime_types, OFFSET$num_mime_types, value);
        return this;
    }

    /// Note: the returned {@link PointerPtr} does not have correct {@link PointerPtr#size} property. It's up
    /// to user to track the size of the buffer, and use {@link PointerPtr#reinterpret} to set the size before
    /// actually reading from or writing to the buffer.
    public @Nullable PointerPtr mime_types() {
        MemorySegment s = mime_typesRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new PointerPtr(s);
    }

    public SDL_ClipboardEvent mime_types(@Nullable PointerPtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        mime_typesRaw(s);
        return this;
    }

    public @Pointer(comment="void**") MemorySegment mime_typesRaw() {
        return segment.get(LAYOUT$mime_types, OFFSET$mime_types);
    }

    public void mime_typesRaw(@Pointer(comment="void**") MemorySegment value) {
        segment.set(LAYOUT$mime_types, OFFSET$mime_types, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.JAVA_INT.withName("reserved"),
        ValueLayout.JAVA_LONG.withName("timestamp"),
        ValueLayout.JAVA_BOOLEAN.withName("owner"),
        ValueLayout.JAVA_INT.withName("num_mime_types"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE)).withName("mime_types")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$timestamp = PathElement.groupElement("timestamp");
    public static final PathElement PATH$owner = PathElement.groupElement("owner");
    public static final PathElement PATH$num_mime_types = PathElement.groupElement("num_mime_types");
    public static final PathElement PATH$mime_types = PathElement.groupElement("mime_types");

    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final OfLong LAYOUT$timestamp = (OfLong) LAYOUT.select(PATH$timestamp);
    public static final OfBoolean LAYOUT$owner = (OfBoolean) LAYOUT.select(PATH$owner);
    public static final OfInt LAYOUT$num_mime_types = (OfInt) LAYOUT.select(PATH$num_mime_types);
    public static final AddressLayout LAYOUT$mime_types = (AddressLayout) LAYOUT.select(PATH$mime_types);

    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$timestamp = LAYOUT$timestamp.byteSize();
    public static final long SIZE$owner = LAYOUT$owner.byteSize();
    public static final long SIZE$num_mime_types = LAYOUT$num_mime_types.byteSize();
    public static final long SIZE$mime_types = LAYOUT$mime_types.byteSize();

    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$timestamp = LAYOUT.byteOffset(PATH$timestamp);
    public static final long OFFSET$owner = LAYOUT.byteOffset(PATH$owner);
    public static final long OFFSET$num_mime_types = LAYOUT.byteOffset(PATH$num_mime_types);
    public static final long OFFSET$mime_types = LAYOUT.byteOffset(PATH$mime_types);
}
