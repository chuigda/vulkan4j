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

/// The function pointers that drive an SDL_IOStream.
///
/// Applications can provide this struct to SDL_OpenIO() to create their own
/// implementation of SDL_IOStream. This is not necessarily required, as SDL
/// already offers several common types of I/O streams, via functions like
/// SDL_IOFromFile() and SDL_IOFromMem().
///
/// This structure should be initialized using SDL_INIT_INTERFACE()
///
/// Since: This struct is available since SDL 3.2.0.
///
/// See also:
/// - `SDL_INIT_INTERFACE`
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct SDL_IOStreamInterface {
///     Uint32 version; // @link substring="version" target="#version"
///     PFN_SDL_IOStreamInterface_size size; // optional // @link substring="size" target="#size"
///     PFN_SDL_IOStreamInterface_seek seek; // optional // @link substring="seek" target="#seek"
///     PFN_SDL_IOStreamInterface_read read; // optional // @link substring="read" target="#read"
///     PFN_SDL_IOStreamInterface_write write; // optional // @link substring="write" target="#write"
///     PFN_SDL_IOStreamInterface_flush flush; // optional // @link substring="flush" target="#flush"
///     PFN_SDL_IOStreamInterface_close close; // optional // @link substring="close" target="#close"
/// } SDL_IOStreamInterface;
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
///
/// ## Member documentation
///
/// <ul>
/// <li>{@link #size} Return the number of bytes in this SDL_IOStream
///
/// @return the total size of the data stream, or -1 on error.
/// </li>
/// <li>{@link #seek} Seek to `offset` relative to `whence`, one of stdio's whence values:
/// SDL_IO_SEEK_SET, SDL_IO_SEEK_CUR, SDL_IO_SEEK_END
///
/// @return the final offset in the data stream, or -1 on error.
/// </li>
/// <li>{@link #read} Read up to `size` bytes from the data stream to the area pointed
/// at by `ptr`.
///
/// On an incomplete read, you should set `*status` to a value from the
/// SDL_IOStatus enum. You do not have to explicitly set this on
/// a complete, successful read.
///
/// @return the number of bytes read
/// </li>
/// <li>{@link #write} Write exactly `size` bytes from the area pointed at by `ptr`
/// to data stream.
///
/// On an incomplete write, you should set `*status` to a value from the
/// SDL_IOStatus enum. You do not have to explicitly set this on
/// a complete, successful write.
///
/// @return the number of bytes written
/// </li>
/// <li>{@link #flush} If the stream is buffering, make sure the data is written out.
///
/// On failure, you should set `*status` to a value from the
/// SDL_IOStatus enum. You do not have to explicitly set this on
/// a successful flush.
///
/// @return true if successful or false on write error when flushing data.
/// </li>
/// <li>{@link #close} Close and free any allocated resources.
///
/// This does not guarantee file writes will sync to physical media; they
/// can be in the system's file cache, waiting to go to disk.
///
/// The SDL_IOStream is still destroyed even if this fails, so clean up anything
/// even if flushing buffers, etc, returns an error.
///
/// @return true if successful or false on write error when flushing data.
/// </li>
/// </ul>
@ValueBasedCandidate
@UnsafeConstructor
public record SDL_IOStreamInterface(@NotNull MemorySegment segment) implements ISDL_IOStreamInterface {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link SDL_IOStreamInterface}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// ISDL_IOStreamInterface to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code SDL_IOStreamInterface.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements ISDL_IOStreamInterface, Iterable<SDL_IOStreamInterface> {
        public long size() {
            return segment.byteSize() / SDL_IOStreamInterface.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull SDL_IOStreamInterface at(long index) {
            return new SDL_IOStreamInterface(segment.asSlice(index * SDL_IOStreamInterface.BYTES, SDL_IOStreamInterface.BYTES));
        }

        public void write(long index, @NotNull SDL_IOStreamInterface value) {
            MemorySegment s = segment.asSlice(index * SDL_IOStreamInterface.BYTES, SDL_IOStreamInterface.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * SDL_IOStreamInterface.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * SDL_IOStreamInterface.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * SDL_IOStreamInterface.BYTES,
                (end - start) * SDL_IOStreamInterface.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * SDL_IOStreamInterface.BYTES));
        }

        public SDL_IOStreamInterface[] toArray() {
            SDL_IOStreamInterface[] ret = new SDL_IOStreamInterface[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<SDL_IOStreamInterface> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<SDL_IOStreamInterface> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= SDL_IOStreamInterface.BYTES;
            }

            @Override
            public SDL_IOStreamInterface next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                SDL_IOStreamInterface ret = new SDL_IOStreamInterface(segment.asSlice(0, SDL_IOStreamInterface.BYTES));
                segment = segment.asSlice(SDL_IOStreamInterface.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static SDL_IOStreamInterface allocate(Arena arena) {
        return new SDL_IOStreamInterface(arena.allocate(LAYOUT));
    }

    public static SDL_IOStreamInterface.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new SDL_IOStreamInterface.Ptr(segment);
    }

    public static SDL_IOStreamInterface clone(Arena arena, SDL_IOStreamInterface src) {
        SDL_IOStreamInterface ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @NativeType("Uint32") @Unsigned int version() {
        return segment.get(LAYOUT$version, OFFSET$version);
    }

    public SDL_IOStreamInterface version(@NativeType("Uint32") @Unsigned int value) {
        segment.set(LAYOUT$version, OFFSET$version, value);
        return this;
    }

    public @Pointer(comment="PFN_SDL_IOStreamInterface_size") MemorySegment size() {
        return segment.get(LAYOUT$size, OFFSET$size);
    }

    public void size(@Pointer(comment="PFN_SDL_IOStreamInterface_size") MemorySegment value) {
        segment.set(LAYOUT$size, OFFSET$size, value);
    }

    public SDL_IOStreamInterface size(@Nullable IPointer pointer) {
        size(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @Pointer(comment="PFN_SDL_IOStreamInterface_seek") MemorySegment seek() {
        return segment.get(LAYOUT$seek, OFFSET$seek);
    }

    public void seek(@Pointer(comment="PFN_SDL_IOStreamInterface_seek") MemorySegment value) {
        segment.set(LAYOUT$seek, OFFSET$seek, value);
    }

    public SDL_IOStreamInterface seek(@Nullable IPointer pointer) {
        seek(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @Pointer(comment="PFN_SDL_IOStreamInterface_read") MemorySegment read() {
        return segment.get(LAYOUT$read, OFFSET$read);
    }

    public void read(@Pointer(comment="PFN_SDL_IOStreamInterface_read") MemorySegment value) {
        segment.set(LAYOUT$read, OFFSET$read, value);
    }

    public SDL_IOStreamInterface read(@Nullable IPointer pointer) {
        read(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @Pointer(comment="PFN_SDL_IOStreamInterface_write") MemorySegment write() {
        return segment.get(LAYOUT$write, OFFSET$write);
    }

    public void write(@Pointer(comment="PFN_SDL_IOStreamInterface_write") MemorySegment value) {
        segment.set(LAYOUT$write, OFFSET$write, value);
    }

    public SDL_IOStreamInterface write(@Nullable IPointer pointer) {
        write(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @Pointer(comment="PFN_SDL_IOStreamInterface_flush") MemorySegment flush() {
        return segment.get(LAYOUT$flush, OFFSET$flush);
    }

    public void flush(@Pointer(comment="PFN_SDL_IOStreamInterface_flush") MemorySegment value) {
        segment.set(LAYOUT$flush, OFFSET$flush, value);
    }

    public SDL_IOStreamInterface flush(@Nullable IPointer pointer) {
        flush(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @Pointer(comment="PFN_SDL_IOStreamInterface_close") MemorySegment close() {
        return segment.get(LAYOUT$close, OFFSET$close);
    }

    public void close(@Pointer(comment="PFN_SDL_IOStreamInterface_close") MemorySegment value) {
        segment.set(LAYOUT$close, OFFSET$close, value);
    }

    public SDL_IOStreamInterface close(@Nullable IPointer pointer) {
        close(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("version"),
        ValueLayout.ADDRESS.withName("size"),
        ValueLayout.ADDRESS.withName("seek"),
        ValueLayout.ADDRESS.withName("read"),
        ValueLayout.ADDRESS.withName("write"),
        ValueLayout.ADDRESS.withName("flush"),
        ValueLayout.ADDRESS.withName("close")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$version = PathElement.groupElement("version");
    public static final PathElement PATH$size = PathElement.groupElement("size");
    public static final PathElement PATH$seek = PathElement.groupElement("seek");
    public static final PathElement PATH$read = PathElement.groupElement("read");
    public static final PathElement PATH$write = PathElement.groupElement("write");
    public static final PathElement PATH$flush = PathElement.groupElement("flush");
    public static final PathElement PATH$close = PathElement.groupElement("close");

    public static final OfInt LAYOUT$version = (OfInt) LAYOUT.select(PATH$version);
    public static final AddressLayout LAYOUT$size = (AddressLayout) LAYOUT.select(PATH$size);
    public static final AddressLayout LAYOUT$seek = (AddressLayout) LAYOUT.select(PATH$seek);
    public static final AddressLayout LAYOUT$read = (AddressLayout) LAYOUT.select(PATH$read);
    public static final AddressLayout LAYOUT$write = (AddressLayout) LAYOUT.select(PATH$write);
    public static final AddressLayout LAYOUT$flush = (AddressLayout) LAYOUT.select(PATH$flush);
    public static final AddressLayout LAYOUT$close = (AddressLayout) LAYOUT.select(PATH$close);

    public static final long SIZE$version = LAYOUT$version.byteSize();
    public static final long SIZE$size = LAYOUT$size.byteSize();
    public static final long SIZE$seek = LAYOUT$seek.byteSize();
    public static final long SIZE$read = LAYOUT$read.byteSize();
    public static final long SIZE$write = LAYOUT$write.byteSize();
    public static final long SIZE$flush = LAYOUT$flush.byteSize();
    public static final long SIZE$close = LAYOUT$close.byteSize();

    public static final long OFFSET$version = LAYOUT.byteOffset(PATH$version);
    public static final long OFFSET$size = LAYOUT.byteOffset(PATH$size);
    public static final long OFFSET$seek = LAYOUT.byteOffset(PATH$seek);
    public static final long OFFSET$read = LAYOUT.byteOffset(PATH$read);
    public static final long OFFSET$write = LAYOUT.byteOffset(PATH$write);
    public static final long OFFSET$flush = LAYOUT.byteOffset(PATH$flush);
    public static final long OFFSET$close = LAYOUT.byteOffset(PATH$close);
}
