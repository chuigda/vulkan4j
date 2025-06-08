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

/// A structure specifying a location in a transfer buffer.
///
/// Used when transferring buffer data to or from a transfer buffer.
///
/// Since: This struct is available since SDL 3.2.0.
///
/// See also:
/// - `SDL_UploadToGPUBuffer`
/// - `SDL_DownloadFromGPUBuffer`
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct SDL_GPUTransferBufferLocation {
///     SDL_GPUTransferBuffer* transfer_buffer; // @link substring="SDL_GPUTransferBuffer" target="SDL_GPUTransferBuffer" @link substring="transfer_buffer" target="#transfer_buffer"
///     Uint32 offset; // @link substring="offset" target="#offset"
/// } SDL_GPUTransferBufferLocation;
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
public record SDL_GPUTransferBufferLocation(@NotNull MemorySegment segment) implements ISDL_GPUTransferBufferLocation {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link SDL_GPUTransferBufferLocation}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// ISDL_GPUTransferBufferLocation to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code SDL_GPUTransferBufferLocation.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements ISDL_GPUTransferBufferLocation, Iterable<SDL_GPUTransferBufferLocation> {
        public long size() {
            return segment.byteSize() / SDL_GPUTransferBufferLocation.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull SDL_GPUTransferBufferLocation at(long index) {
            return new SDL_GPUTransferBufferLocation(segment.asSlice(index * SDL_GPUTransferBufferLocation.BYTES, SDL_GPUTransferBufferLocation.BYTES));
        }

        public void write(long index, @NotNull SDL_GPUTransferBufferLocation value) {
            MemorySegment s = segment.asSlice(index * SDL_GPUTransferBufferLocation.BYTES, SDL_GPUTransferBufferLocation.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * SDL_GPUTransferBufferLocation.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * SDL_GPUTransferBufferLocation.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * SDL_GPUTransferBufferLocation.BYTES,
                (end - start) * SDL_GPUTransferBufferLocation.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * SDL_GPUTransferBufferLocation.BYTES));
        }

        public SDL_GPUTransferBufferLocation[] toArray() {
            SDL_GPUTransferBufferLocation[] ret = new SDL_GPUTransferBufferLocation[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<SDL_GPUTransferBufferLocation> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<SDL_GPUTransferBufferLocation> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= SDL_GPUTransferBufferLocation.BYTES;
            }

            @Override
            public SDL_GPUTransferBufferLocation next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                SDL_GPUTransferBufferLocation ret = new SDL_GPUTransferBufferLocation(segment.asSlice(0, SDL_GPUTransferBufferLocation.BYTES));
                segment = segment.asSlice(SDL_GPUTransferBufferLocation.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static SDL_GPUTransferBufferLocation allocate(Arena arena) {
        return new SDL_GPUTransferBufferLocation(arena.allocate(LAYOUT));
    }

    public static SDL_GPUTransferBufferLocation.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new SDL_GPUTransferBufferLocation.Ptr(segment);
    }

    public static SDL_GPUTransferBufferLocation clone(Arena arena, SDL_GPUTransferBufferLocation src) {
        SDL_GPUTransferBufferLocation ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @Nullable SDL_GPUTransferBuffer transfer_buffer() {
        MemorySegment s = segment.asSlice(OFFSET$transfer_buffer, SIZE$transfer_buffer);
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new SDL_GPUTransferBuffer(s);
    }

    public SDL_GPUTransferBufferLocation transfer_buffer(@Nullable SDL_GPUTransferBuffer value) {
        segment.set(LAYOUT$transfer_buffer, OFFSET$transfer_buffer, value != null ? value.segment() : MemorySegment.NULL);
        return this;
    }

    public @NativeType("Uint32") @Unsigned int offset() {
        return segment.get(LAYOUT$offset, OFFSET$offset);
    }

    public SDL_GPUTransferBufferLocation offset(@NativeType("Uint32") @Unsigned int value) {
        segment.set(LAYOUT$offset, OFFSET$offset, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.ADDRESS.withName("transfer_buffer"),
        ValueLayout.JAVA_INT.withName("offset")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$transfer_buffer = PathElement.groupElement("transfer_buffer");
    public static final PathElement PATH$offset = PathElement.groupElement("offset");

    public static final AddressLayout LAYOUT$transfer_buffer = (AddressLayout) LAYOUT.select(PATH$transfer_buffer);
    public static final OfInt LAYOUT$offset = (OfInt) LAYOUT.select(PATH$offset);

    public static final long SIZE$transfer_buffer = LAYOUT$transfer_buffer.byteSize();
    public static final long SIZE$offset = LAYOUT$offset.byteSize();

    public static final long OFFSET$transfer_buffer = LAYOUT.byteOffset(PATH$transfer_buffer);
    public static final long OFFSET$offset = LAYOUT.byteOffset(PATH$offset);
}
