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

/// Function interface for SDL_Storage.
///
/// Apps that want to supply a custom implementation of SDL_Storage will fill
/// in all the functions in this struct, and then pass it to SDL_OpenStorage to
/// create a custom SDL_Storage object.
///
/// It is not usually necessary to do this; SDL provides standard
/// implementations for many things you might expect to do with an SDL_Storage.
///
/// This structure should be initialized using SDL_INIT_INTERFACE()
///
/// \since This struct is available since SDL 3.2.0.
///
/// \sa SDL_INIT_INTERFACE
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct SDL_StorageInterface {
///     Uint32 version; // @link substring="version" target="#version"
///     PFN_SDL_StorageInterface_close close; // optional // @link substring="close" target="#close"
///     PFN_SDL_StorageInterface_ready ready; // optional // @link substring="ready" target="#ready"
///     PFN_SDL_StorageInterface_enumerate enumerate; // optional // @link substring="enumerate" target="#enumerate"
///     PFN_SDL_StorageInterface_info info; // optional // @link substring="info" target="#info"
///     PFN_SDL_StorageInterface_read_file read_file; // optional // @link substring="read_file" target="#read_file"
///     PFN_SDL_StorageInterface_write_file write_file; // optional // @link substring="write_file" target="#write_file"
///     PFN_SDL_StorageInterface_mkdir mkdir; // optional // @link substring="mkdir" target="#mkdir"
///     PFN_SDL_StorageInterface_remove remove; // optional // @link substring="remove" target="#remove"
///     PFN_SDL_StorageInterface_rename rename; // optional // @link substring="rename" target="#rename"
///     PFN_SDL_StorageInterface_copy copy; // optional // @link substring="copy" target="#copy"
///     PFN_SDL_StorageInterface_space_remaining space_remaining; // optional // @link substring="space_remaining" target="#space_remaining"
/// } SDL_StorageInterface;
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
public record SDL_StorageInterface(@NotNull MemorySegment segment) implements ISDL_StorageInterface {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link SDL_StorageInterface}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// ISDL_StorageInterface to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code SDL_StorageInterface.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements ISDL_StorageInterface, Iterable<SDL_StorageInterface> {
        public long size() {
            return segment.byteSize() / SDL_StorageInterface.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull SDL_StorageInterface at(long index) {
            return new SDL_StorageInterface(segment.asSlice(index * SDL_StorageInterface.BYTES, SDL_StorageInterface.BYTES));
        }

        public void write(long index, @NotNull SDL_StorageInterface value) {
            MemorySegment s = segment.asSlice(index * SDL_StorageInterface.BYTES, SDL_StorageInterface.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * SDL_StorageInterface.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * SDL_StorageInterface.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * SDL_StorageInterface.BYTES,
                (end - start) * SDL_StorageInterface.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * SDL_StorageInterface.BYTES));
        }

        public SDL_StorageInterface[] toArray() {
            SDL_StorageInterface[] ret = new SDL_StorageInterface[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<SDL_StorageInterface> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<SDL_StorageInterface> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= SDL_StorageInterface.BYTES;
            }

            @Override
            public SDL_StorageInterface next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                SDL_StorageInterface ret = new SDL_StorageInterface(segment.asSlice(0, SDL_StorageInterface.BYTES));
                segment = segment.asSlice(SDL_StorageInterface.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static SDL_StorageInterface allocate(Arena arena) {
        return new SDL_StorageInterface(arena.allocate(LAYOUT));
    }

    public static SDL_StorageInterface.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new SDL_StorageInterface.Ptr(segment);
    }

    public static SDL_StorageInterface clone(Arena arena, SDL_StorageInterface src) {
        SDL_StorageInterface ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @NativeType("Uint32") @Unsigned int version() {
        return segment.get(LAYOUT$version, OFFSET$version);
    }

    public SDL_StorageInterface version(@NativeType("Uint32") @Unsigned int value) {
        segment.set(LAYOUT$version, OFFSET$version, value);
        return this;
    }

    public @Pointer(comment="PFN_SDL_StorageInterface_close") MemorySegment close() {
        return segment.get(LAYOUT$close, OFFSET$close);
    }

    public void close(@Pointer(comment="PFN_SDL_StorageInterface_close") MemorySegment value) {
        segment.set(LAYOUT$close, OFFSET$close, value);
    }

    public SDL_StorageInterface close(@Nullable IPointer pointer) {
        close(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @Pointer(comment="PFN_SDL_StorageInterface_ready") MemorySegment ready() {
        return segment.get(LAYOUT$ready, OFFSET$ready);
    }

    public void ready(@Pointer(comment="PFN_SDL_StorageInterface_ready") MemorySegment value) {
        segment.set(LAYOUT$ready, OFFSET$ready, value);
    }

    public SDL_StorageInterface ready(@Nullable IPointer pointer) {
        ready(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @Pointer(comment="PFN_SDL_StorageInterface_enumerate") MemorySegment enumerate() {
        return segment.get(LAYOUT$enumerate, OFFSET$enumerate);
    }

    public void enumerate(@Pointer(comment="PFN_SDL_StorageInterface_enumerate") MemorySegment value) {
        segment.set(LAYOUT$enumerate, OFFSET$enumerate, value);
    }

    public SDL_StorageInterface enumerate(@Nullable IPointer pointer) {
        enumerate(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @Pointer(comment="PFN_SDL_StorageInterface_info") MemorySegment info() {
        return segment.get(LAYOUT$info, OFFSET$info);
    }

    public void info(@Pointer(comment="PFN_SDL_StorageInterface_info") MemorySegment value) {
        segment.set(LAYOUT$info, OFFSET$info, value);
    }

    public SDL_StorageInterface info(@Nullable IPointer pointer) {
        info(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @Pointer(comment="PFN_SDL_StorageInterface_read_file") MemorySegment read_file() {
        return segment.get(LAYOUT$read_file, OFFSET$read_file);
    }

    public void read_file(@Pointer(comment="PFN_SDL_StorageInterface_read_file") MemorySegment value) {
        segment.set(LAYOUT$read_file, OFFSET$read_file, value);
    }

    public SDL_StorageInterface read_file(@Nullable IPointer pointer) {
        read_file(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @Pointer(comment="PFN_SDL_StorageInterface_write_file") MemorySegment write_file() {
        return segment.get(LAYOUT$write_file, OFFSET$write_file);
    }

    public void write_file(@Pointer(comment="PFN_SDL_StorageInterface_write_file") MemorySegment value) {
        segment.set(LAYOUT$write_file, OFFSET$write_file, value);
    }

    public SDL_StorageInterface write_file(@Nullable IPointer pointer) {
        write_file(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @Pointer(comment="PFN_SDL_StorageInterface_mkdir") MemorySegment mkdir() {
        return segment.get(LAYOUT$mkdir, OFFSET$mkdir);
    }

    public void mkdir(@Pointer(comment="PFN_SDL_StorageInterface_mkdir") MemorySegment value) {
        segment.set(LAYOUT$mkdir, OFFSET$mkdir, value);
    }

    public SDL_StorageInterface mkdir(@Nullable IPointer pointer) {
        mkdir(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @Pointer(comment="PFN_SDL_StorageInterface_remove") MemorySegment remove() {
        return segment.get(LAYOUT$remove, OFFSET$remove);
    }

    public void remove(@Pointer(comment="PFN_SDL_StorageInterface_remove") MemorySegment value) {
        segment.set(LAYOUT$remove, OFFSET$remove, value);
    }

    public SDL_StorageInterface remove(@Nullable IPointer pointer) {
        remove(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @Pointer(comment="PFN_SDL_StorageInterface_rename") MemorySegment rename() {
        return segment.get(LAYOUT$rename, OFFSET$rename);
    }

    public void rename(@Pointer(comment="PFN_SDL_StorageInterface_rename") MemorySegment value) {
        segment.set(LAYOUT$rename, OFFSET$rename, value);
    }

    public SDL_StorageInterface rename(@Nullable IPointer pointer) {
        rename(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @Pointer(comment="PFN_SDL_StorageInterface_copy") MemorySegment copy() {
        return segment.get(LAYOUT$copy, OFFSET$copy);
    }

    public void copy(@Pointer(comment="PFN_SDL_StorageInterface_copy") MemorySegment value) {
        segment.set(LAYOUT$copy, OFFSET$copy, value);
    }

    public SDL_StorageInterface copy(@Nullable IPointer pointer) {
        copy(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @Pointer(comment="PFN_SDL_StorageInterface_space_remaining") MemorySegment space_remaining() {
        return segment.get(LAYOUT$space_remaining, OFFSET$space_remaining);
    }

    public void space_remaining(@Pointer(comment="PFN_SDL_StorageInterface_space_remaining") MemorySegment value) {
        segment.set(LAYOUT$space_remaining, OFFSET$space_remaining, value);
    }

    public SDL_StorageInterface space_remaining(@Nullable IPointer pointer) {
        space_remaining(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("version"),
        ValueLayout.ADDRESS.withName("close"),
        ValueLayout.ADDRESS.withName("ready"),
        ValueLayout.ADDRESS.withName("enumerate"),
        ValueLayout.ADDRESS.withName("info"),
        ValueLayout.ADDRESS.withName("read_file"),
        ValueLayout.ADDRESS.withName("write_file"),
        ValueLayout.ADDRESS.withName("mkdir"),
        ValueLayout.ADDRESS.withName("remove"),
        ValueLayout.ADDRESS.withName("rename"),
        ValueLayout.ADDRESS.withName("copy"),
        ValueLayout.ADDRESS.withName("space_remaining")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$version = PathElement.groupElement("version");
    public static final PathElement PATH$close = PathElement.groupElement("close");
    public static final PathElement PATH$ready = PathElement.groupElement("ready");
    public static final PathElement PATH$enumerate = PathElement.groupElement("enumerate");
    public static final PathElement PATH$info = PathElement.groupElement("info");
    public static final PathElement PATH$read_file = PathElement.groupElement("read_file");
    public static final PathElement PATH$write_file = PathElement.groupElement("write_file");
    public static final PathElement PATH$mkdir = PathElement.groupElement("mkdir");
    public static final PathElement PATH$remove = PathElement.groupElement("remove");
    public static final PathElement PATH$rename = PathElement.groupElement("rename");
    public static final PathElement PATH$copy = PathElement.groupElement("copy");
    public static final PathElement PATH$space_remaining = PathElement.groupElement("space_remaining");

    public static final OfInt LAYOUT$version = (OfInt) LAYOUT.select(PATH$version);
    public static final AddressLayout LAYOUT$close = (AddressLayout) LAYOUT.select(PATH$close);
    public static final AddressLayout LAYOUT$ready = (AddressLayout) LAYOUT.select(PATH$ready);
    public static final AddressLayout LAYOUT$enumerate = (AddressLayout) LAYOUT.select(PATH$enumerate);
    public static final AddressLayout LAYOUT$info = (AddressLayout) LAYOUT.select(PATH$info);
    public static final AddressLayout LAYOUT$read_file = (AddressLayout) LAYOUT.select(PATH$read_file);
    public static final AddressLayout LAYOUT$write_file = (AddressLayout) LAYOUT.select(PATH$write_file);
    public static final AddressLayout LAYOUT$mkdir = (AddressLayout) LAYOUT.select(PATH$mkdir);
    public static final AddressLayout LAYOUT$remove = (AddressLayout) LAYOUT.select(PATH$remove);
    public static final AddressLayout LAYOUT$rename = (AddressLayout) LAYOUT.select(PATH$rename);
    public static final AddressLayout LAYOUT$copy = (AddressLayout) LAYOUT.select(PATH$copy);
    public static final AddressLayout LAYOUT$space_remaining = (AddressLayout) LAYOUT.select(PATH$space_remaining);

    public static final long SIZE$version = LAYOUT$version.byteSize();
    public static final long SIZE$close = LAYOUT$close.byteSize();
    public static final long SIZE$ready = LAYOUT$ready.byteSize();
    public static final long SIZE$enumerate = LAYOUT$enumerate.byteSize();
    public static final long SIZE$info = LAYOUT$info.byteSize();
    public static final long SIZE$read_file = LAYOUT$read_file.byteSize();
    public static final long SIZE$write_file = LAYOUT$write_file.byteSize();
    public static final long SIZE$mkdir = LAYOUT$mkdir.byteSize();
    public static final long SIZE$remove = LAYOUT$remove.byteSize();
    public static final long SIZE$rename = LAYOUT$rename.byteSize();
    public static final long SIZE$copy = LAYOUT$copy.byteSize();
    public static final long SIZE$space_remaining = LAYOUT$space_remaining.byteSize();

    public static final long OFFSET$version = LAYOUT.byteOffset(PATH$version);
    public static final long OFFSET$close = LAYOUT.byteOffset(PATH$close);
    public static final long OFFSET$ready = LAYOUT.byteOffset(PATH$ready);
    public static final long OFFSET$enumerate = LAYOUT.byteOffset(PATH$enumerate);
    public static final long OFFSET$info = LAYOUT.byteOffset(PATH$info);
    public static final long OFFSET$read_file = LAYOUT.byteOffset(PATH$read_file);
    public static final long OFFSET$write_file = LAYOUT.byteOffset(PATH$write_file);
    public static final long OFFSET$mkdir = LAYOUT.byteOffset(PATH$mkdir);
    public static final long OFFSET$remove = LAYOUT.byteOffset(PATH$remove);
    public static final long OFFSET$rename = LAYOUT.byteOffset(PATH$rename);
    public static final long OFFSET$copy = LAYOUT.byteOffset(PATH$copy);
    public static final long OFFSET$space_remaining = LAYOUT.byteOffset(PATH$space_remaining);
}
