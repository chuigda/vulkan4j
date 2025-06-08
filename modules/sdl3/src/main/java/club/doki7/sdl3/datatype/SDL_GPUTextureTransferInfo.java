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

/// A structure specifying parameters related to transferring data to or from a
/// texture.
///
/// \since This struct is available since SDL 3.2.0.
///
/// \sa SDL_UploadToGPUTexture
/// \sa SDL_DownloadFromGPUTexture
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct SDL_GPUTextureTransferInfo {
///     SDL_GPUTransferBuffer* transfer_buffer; // optional // @link substring="SDL_GPUTransferBuffer" target="SDL_GPUTransferBuffer" @link substring="transfer_buffer" target="#transfer_buffer"
///     Uint32 offset; // optional // @link substring="offset" target="#offset"
///     Uint32 pixels_per_row; // optional // @link substring="pixels_per_row" target="#pixels_per_row"
///     Uint32 rows_per_layer; // optional // @link substring="rows_per_layer" target="#rows_per_layer"
/// } SDL_GPUTextureTransferInfo;
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
public record SDL_GPUTextureTransferInfo(@NotNull MemorySegment segment) implements ISDL_GPUTextureTransferInfo {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link SDL_GPUTextureTransferInfo}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// ISDL_GPUTextureTransferInfo to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code SDL_GPUTextureTransferInfo.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements ISDL_GPUTextureTransferInfo, Iterable<SDL_GPUTextureTransferInfo> {
        public long size() {
            return segment.byteSize() / SDL_GPUTextureTransferInfo.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull SDL_GPUTextureTransferInfo at(long index) {
            return new SDL_GPUTextureTransferInfo(segment.asSlice(index * SDL_GPUTextureTransferInfo.BYTES, SDL_GPUTextureTransferInfo.BYTES));
        }

        public void write(long index, @NotNull SDL_GPUTextureTransferInfo value) {
            MemorySegment s = segment.asSlice(index * SDL_GPUTextureTransferInfo.BYTES, SDL_GPUTextureTransferInfo.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * SDL_GPUTextureTransferInfo.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * SDL_GPUTextureTransferInfo.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * SDL_GPUTextureTransferInfo.BYTES,
                (end - start) * SDL_GPUTextureTransferInfo.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * SDL_GPUTextureTransferInfo.BYTES));
        }

        public SDL_GPUTextureTransferInfo[] toArray() {
            SDL_GPUTextureTransferInfo[] ret = new SDL_GPUTextureTransferInfo[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<SDL_GPUTextureTransferInfo> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<SDL_GPUTextureTransferInfo> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= SDL_GPUTextureTransferInfo.BYTES;
            }

            @Override
            public SDL_GPUTextureTransferInfo next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                SDL_GPUTextureTransferInfo ret = new SDL_GPUTextureTransferInfo(segment.asSlice(0, SDL_GPUTextureTransferInfo.BYTES));
                segment = segment.asSlice(SDL_GPUTextureTransferInfo.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static SDL_GPUTextureTransferInfo allocate(Arena arena) {
        return new SDL_GPUTextureTransferInfo(arena.allocate(LAYOUT));
    }

    public static SDL_GPUTextureTransferInfo.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new SDL_GPUTextureTransferInfo.Ptr(segment);
    }

    public static SDL_GPUTextureTransferInfo clone(Arena arena, SDL_GPUTextureTransferInfo src) {
        SDL_GPUTextureTransferInfo ret = allocate(arena);
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

    public SDL_GPUTextureTransferInfo transfer_buffer(@Nullable SDL_GPUTransferBuffer value) {
        segment.set(LAYOUT$transfer_buffer, OFFSET$transfer_buffer, value != null ? value.segment() : MemorySegment.NULL);
        return this;
    }

    public @NativeType("Uint32") @Unsigned int offset() {
        return segment.get(LAYOUT$offset, OFFSET$offset);
    }

    public SDL_GPUTextureTransferInfo offset(@NativeType("Uint32") @Unsigned int value) {
        segment.set(LAYOUT$offset, OFFSET$offset, value);
        return this;
    }

    public @NativeType("Uint32") @Unsigned int pixels_per_row() {
        return segment.get(LAYOUT$pixels_per_row, OFFSET$pixels_per_row);
    }

    public SDL_GPUTextureTransferInfo pixels_per_row(@NativeType("Uint32") @Unsigned int value) {
        segment.set(LAYOUT$pixels_per_row, OFFSET$pixels_per_row, value);
        return this;
    }

    public @NativeType("Uint32") @Unsigned int rows_per_layer() {
        return segment.get(LAYOUT$rows_per_layer, OFFSET$rows_per_layer);
    }

    public SDL_GPUTextureTransferInfo rows_per_layer(@NativeType("Uint32") @Unsigned int value) {
        segment.set(LAYOUT$rows_per_layer, OFFSET$rows_per_layer, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.ADDRESS.withName("transfer_buffer"),
        ValueLayout.JAVA_INT.withName("offset"),
        ValueLayout.JAVA_INT.withName("pixels_per_row"),
        ValueLayout.JAVA_INT.withName("rows_per_layer")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$transfer_buffer = PathElement.groupElement("transfer_buffer");
    public static final PathElement PATH$offset = PathElement.groupElement("offset");
    public static final PathElement PATH$pixels_per_row = PathElement.groupElement("pixels_per_row");
    public static final PathElement PATH$rows_per_layer = PathElement.groupElement("rows_per_layer");

    public static final AddressLayout LAYOUT$transfer_buffer = (AddressLayout) LAYOUT.select(PATH$transfer_buffer);
    public static final OfInt LAYOUT$offset = (OfInt) LAYOUT.select(PATH$offset);
    public static final OfInt LAYOUT$pixels_per_row = (OfInt) LAYOUT.select(PATH$pixels_per_row);
    public static final OfInt LAYOUT$rows_per_layer = (OfInt) LAYOUT.select(PATH$rows_per_layer);

    public static final long SIZE$transfer_buffer = LAYOUT$transfer_buffer.byteSize();
    public static final long SIZE$offset = LAYOUT$offset.byteSize();
    public static final long SIZE$pixels_per_row = LAYOUT$pixels_per_row.byteSize();
    public static final long SIZE$rows_per_layer = LAYOUT$rows_per_layer.byteSize();

    public static final long OFFSET$transfer_buffer = LAYOUT.byteOffset(PATH$transfer_buffer);
    public static final long OFFSET$offset = LAYOUT.byteOffset(PATH$offset);
    public static final long OFFSET$pixels_per_row = LAYOUT.byteOffset(PATH$pixels_per_row);
    public static final long OFFSET$rows_per_layer = LAYOUT.byteOffset(PATH$rows_per_layer);
}
