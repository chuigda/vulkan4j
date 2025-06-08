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

/// Individual button data.
///
/// \since This struct is available since SDL 3.2.0.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct SDL_MessageBoxButtonData {
///     SDL_MessageBoxButtonFlags flags; // @link substring="SDL_MessageBoxButtonFlags" target="SDL_MessageBoxButtonFlags" @link substring="flags" target="#flags"
///     int buttonID; // @link substring="buttonID" target="#buttonID"
///     char const* text; // @link substring="text" target="#text"
/// } SDL_MessageBoxButtonData;
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
public record SDL_MessageBoxButtonData(@NotNull MemorySegment segment) implements ISDL_MessageBoxButtonData {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link SDL_MessageBoxButtonData}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// ISDL_MessageBoxButtonData to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code SDL_MessageBoxButtonData.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements ISDL_MessageBoxButtonData, Iterable<SDL_MessageBoxButtonData> {
        public long size() {
            return segment.byteSize() / SDL_MessageBoxButtonData.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull SDL_MessageBoxButtonData at(long index) {
            return new SDL_MessageBoxButtonData(segment.asSlice(index * SDL_MessageBoxButtonData.BYTES, SDL_MessageBoxButtonData.BYTES));
        }

        public void write(long index, @NotNull SDL_MessageBoxButtonData value) {
            MemorySegment s = segment.asSlice(index * SDL_MessageBoxButtonData.BYTES, SDL_MessageBoxButtonData.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * SDL_MessageBoxButtonData.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * SDL_MessageBoxButtonData.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * SDL_MessageBoxButtonData.BYTES,
                (end - start) * SDL_MessageBoxButtonData.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * SDL_MessageBoxButtonData.BYTES));
        }

        public SDL_MessageBoxButtonData[] toArray() {
            SDL_MessageBoxButtonData[] ret = new SDL_MessageBoxButtonData[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<SDL_MessageBoxButtonData> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<SDL_MessageBoxButtonData> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= SDL_MessageBoxButtonData.BYTES;
            }

            @Override
            public SDL_MessageBoxButtonData next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                SDL_MessageBoxButtonData ret = new SDL_MessageBoxButtonData(segment.asSlice(0, SDL_MessageBoxButtonData.BYTES));
                segment = segment.asSlice(SDL_MessageBoxButtonData.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static SDL_MessageBoxButtonData allocate(Arena arena) {
        return new SDL_MessageBoxButtonData(arena.allocate(LAYOUT));
    }

    public static SDL_MessageBoxButtonData.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new SDL_MessageBoxButtonData.Ptr(segment);
    }

    public static SDL_MessageBoxButtonData clone(Arena arena, SDL_MessageBoxButtonData src) {
        SDL_MessageBoxButtonData ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @EnumType(SDL_MessageBoxButtonFlags.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public SDL_MessageBoxButtonData flags(@EnumType(SDL_MessageBoxButtonFlags.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
        return this;
    }

    public int buttonID() {
        return segment.get(LAYOUT$buttonID, OFFSET$buttonID);
    }

    public SDL_MessageBoxButtonData buttonID(int value) {
        segment.set(LAYOUT$buttonID, OFFSET$buttonID, value);
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

    public SDL_MessageBoxButtonData text(@Nullable BytePtr value) {
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
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("buttonID"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE).withName("text")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$flags = PathElement.groupElement("flags");
    public static final PathElement PATH$buttonID = PathElement.groupElement("buttonID");
    public static final PathElement PATH$text = PathElement.groupElement("text");

    public static final OfInt LAYOUT$flags = (OfInt) LAYOUT.select(PATH$flags);
    public static final OfInt LAYOUT$buttonID = (OfInt) LAYOUT.select(PATH$buttonID);
    public static final AddressLayout LAYOUT$text = (AddressLayout) LAYOUT.select(PATH$text);

    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$buttonID = LAYOUT$buttonID.byteSize();
    public static final long SIZE$text = LAYOUT$text.byteSize();

    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$buttonID = LAYOUT.byteOffset(PATH$buttonID);
    public static final long OFFSET$text = LAYOUT.byteOffset(PATH$text);
}
