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

/// An entry for filters for file dialogs.
///
/// `name` is a user-readable label for the filter (for example, "Office
/// document").
///
/// `pattern` is a semicolon-separated list of file extensions (for example,
/// "doc;docx"). File extensions may only contain alphanumeric characters,
/// hyphens, underscores and periods. Alternatively, the whole string can be a
/// single asterisk ("*"), which serves as an "All files" filter.
///
/// \since This struct is available since SDL 3.2.0.
///
/// \sa SDL_DialogFileCallback
/// \sa SDL_ShowOpenFileDialog
/// \sa SDL_ShowSaveFileDialog
/// \sa SDL_ShowOpenFolderDialog
/// \sa SDL_ShowFileDialogWithProperties
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct SDL_DialogFileFilter {
///     char const* name; // @link substring="name" target="#name"
///     char const* pattern; // @link substring="pattern" target="#pattern"
/// } SDL_DialogFileFilter;
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
public record SDL_DialogFileFilter(@NotNull MemorySegment segment) implements ISDL_DialogFileFilter {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link SDL_DialogFileFilter}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// ISDL_DialogFileFilter to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code SDL_DialogFileFilter.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements ISDL_DialogFileFilter, Iterable<SDL_DialogFileFilter> {
        public long size() {
            return segment.byteSize() / SDL_DialogFileFilter.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull SDL_DialogFileFilter at(long index) {
            return new SDL_DialogFileFilter(segment.asSlice(index * SDL_DialogFileFilter.BYTES, SDL_DialogFileFilter.BYTES));
        }

        public void write(long index, @NotNull SDL_DialogFileFilter value) {
            MemorySegment s = segment.asSlice(index * SDL_DialogFileFilter.BYTES, SDL_DialogFileFilter.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * SDL_DialogFileFilter.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * SDL_DialogFileFilter.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * SDL_DialogFileFilter.BYTES,
                (end - start) * SDL_DialogFileFilter.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * SDL_DialogFileFilter.BYTES));
        }

        public SDL_DialogFileFilter[] toArray() {
            SDL_DialogFileFilter[] ret = new SDL_DialogFileFilter[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<SDL_DialogFileFilter> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<SDL_DialogFileFilter> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= SDL_DialogFileFilter.BYTES;
            }

            @Override
            public SDL_DialogFileFilter next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                SDL_DialogFileFilter ret = new SDL_DialogFileFilter(segment.asSlice(0, SDL_DialogFileFilter.BYTES));
                segment = segment.asSlice(SDL_DialogFileFilter.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static SDL_DialogFileFilter allocate(Arena arena) {
        return new SDL_DialogFileFilter(arena.allocate(LAYOUT));
    }

    public static SDL_DialogFileFilter.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new SDL_DialogFileFilter.Ptr(segment);
    }

    public static SDL_DialogFileFilter clone(Arena arena, SDL_DialogFileFilter src) {
        SDL_DialogFileFilter ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    /// Note: the returned {@link BytePtr} does not have correct
    /// {@link BytePtr#size} property. It's up to user to track the size of the buffer,
    /// and use {@link BytePtr#reinterpret} to set the size before actually reading from or
    /// writing to the buffer.
    public @Nullable BytePtr name() {
        MemorySegment s = nameRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new BytePtr(s);
    }

    public SDL_DialogFileFilter name(@Nullable BytePtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        nameRaw(s);
        return this;
    }

    public @Pointer(comment="int8_t*") MemorySegment nameRaw() {
        return segment.get(LAYOUT$name, OFFSET$name);
    }

    public void nameRaw(@Pointer(comment="int8_t*") MemorySegment value) {
        segment.set(LAYOUT$name, OFFSET$name, value);
    }

    /// Note: the returned {@link BytePtr} does not have correct
    /// {@link BytePtr#size} property. It's up to user to track the size of the buffer,
    /// and use {@link BytePtr#reinterpret} to set the size before actually reading from or
    /// writing to the buffer.
    public @Nullable BytePtr pattern() {
        MemorySegment s = patternRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new BytePtr(s);
    }

    public SDL_DialogFileFilter pattern(@Nullable BytePtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        patternRaw(s);
        return this;
    }

    public @Pointer(comment="int8_t*") MemorySegment patternRaw() {
        return segment.get(LAYOUT$pattern, OFFSET$pattern);
    }

    public void patternRaw(@Pointer(comment="int8_t*") MemorySegment value) {
        segment.set(LAYOUT$pattern, OFFSET$pattern, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE).withName("name"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE).withName("pattern")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$name = PathElement.groupElement("name");
    public static final PathElement PATH$pattern = PathElement.groupElement("pattern");

    public static final AddressLayout LAYOUT$name = (AddressLayout) LAYOUT.select(PATH$name);
    public static final AddressLayout LAYOUT$pattern = (AddressLayout) LAYOUT.select(PATH$pattern);

    public static final long SIZE$name = LAYOUT$name.byteSize();
    public static final long SIZE$pattern = LAYOUT$pattern.byteSize();

    public static final long OFFSET$name = LAYOUT.byteOffset(PATH$name);
    public static final long OFFSET$pattern = LAYOUT.byteOffset(PATH$pattern);
}
