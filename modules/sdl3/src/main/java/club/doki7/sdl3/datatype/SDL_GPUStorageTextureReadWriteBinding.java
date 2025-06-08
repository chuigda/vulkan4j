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

/// A structure specifying parameters related to binding textures in a compute
/// pass.
///
/// \since This struct is available since SDL 3.2.0.
///
/// \sa SDL_BeginGPUComputePass
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct SDL_GPUStorageTextureReadWriteBinding {
///     SDL_GPUTexture* texture; // @link substring="SDL_GPUTexture" target="SDL_GPUTexture" @link substring="texture" target="#texture"
///     Uint32 mip_level; // @link substring="mip_level" target="#mip_level"
///     Uint32 layer; // @link substring="layer" target="#layer"
///     bool cycle; // @link substring="cycle" target="#cycle"
///     Uint8 padding1; // @link substring="padding1" target="#padding1"
///     Uint8 padding2; // @link substring="padding2" target="#padding2"
///     Uint8 padding3; // @link substring="padding3" target="#padding3"
/// } SDL_GPUStorageTextureReadWriteBinding;
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
public record SDL_GPUStorageTextureReadWriteBinding(@NotNull MemorySegment segment) implements ISDL_GPUStorageTextureReadWriteBinding {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link SDL_GPUStorageTextureReadWriteBinding}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// ISDL_GPUStorageTextureReadWriteBinding to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code SDL_GPUStorageTextureReadWriteBinding.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements ISDL_GPUStorageTextureReadWriteBinding, Iterable<SDL_GPUStorageTextureReadWriteBinding> {
        public long size() {
            return segment.byteSize() / SDL_GPUStorageTextureReadWriteBinding.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull SDL_GPUStorageTextureReadWriteBinding at(long index) {
            return new SDL_GPUStorageTextureReadWriteBinding(segment.asSlice(index * SDL_GPUStorageTextureReadWriteBinding.BYTES, SDL_GPUStorageTextureReadWriteBinding.BYTES));
        }

        public void write(long index, @NotNull SDL_GPUStorageTextureReadWriteBinding value) {
            MemorySegment s = segment.asSlice(index * SDL_GPUStorageTextureReadWriteBinding.BYTES, SDL_GPUStorageTextureReadWriteBinding.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * SDL_GPUStorageTextureReadWriteBinding.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * SDL_GPUStorageTextureReadWriteBinding.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * SDL_GPUStorageTextureReadWriteBinding.BYTES,
                (end - start) * SDL_GPUStorageTextureReadWriteBinding.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * SDL_GPUStorageTextureReadWriteBinding.BYTES));
        }

        public SDL_GPUStorageTextureReadWriteBinding[] toArray() {
            SDL_GPUStorageTextureReadWriteBinding[] ret = new SDL_GPUStorageTextureReadWriteBinding[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<SDL_GPUStorageTextureReadWriteBinding> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<SDL_GPUStorageTextureReadWriteBinding> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= SDL_GPUStorageTextureReadWriteBinding.BYTES;
            }

            @Override
            public SDL_GPUStorageTextureReadWriteBinding next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                SDL_GPUStorageTextureReadWriteBinding ret = new SDL_GPUStorageTextureReadWriteBinding(segment.asSlice(0, SDL_GPUStorageTextureReadWriteBinding.BYTES));
                segment = segment.asSlice(SDL_GPUStorageTextureReadWriteBinding.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static SDL_GPUStorageTextureReadWriteBinding allocate(Arena arena) {
        return new SDL_GPUStorageTextureReadWriteBinding(arena.allocate(LAYOUT));
    }

    public static SDL_GPUStorageTextureReadWriteBinding.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new SDL_GPUStorageTextureReadWriteBinding.Ptr(segment);
    }

    public static SDL_GPUStorageTextureReadWriteBinding clone(Arena arena, SDL_GPUStorageTextureReadWriteBinding src) {
        SDL_GPUStorageTextureReadWriteBinding ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @Nullable SDL_GPUTexture texture() {
        MemorySegment s = segment.asSlice(OFFSET$texture, SIZE$texture);
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new SDL_GPUTexture(s);
    }

    public SDL_GPUStorageTextureReadWriteBinding texture(@Nullable SDL_GPUTexture value) {
        segment.set(LAYOUT$texture, OFFSET$texture, value != null ? value.segment() : MemorySegment.NULL);
        return this;
    }

    public @NativeType("Uint32") @Unsigned int mip_level() {
        return segment.get(LAYOUT$mip_level, OFFSET$mip_level);
    }

    public SDL_GPUStorageTextureReadWriteBinding mip_level(@NativeType("Uint32") @Unsigned int value) {
        segment.set(LAYOUT$mip_level, OFFSET$mip_level, value);
        return this;
    }

    public @NativeType("Uint32") @Unsigned int layer() {
        return segment.get(LAYOUT$layer, OFFSET$layer);
    }

    public SDL_GPUStorageTextureReadWriteBinding layer(@NativeType("Uint32") @Unsigned int value) {
        segment.set(LAYOUT$layer, OFFSET$layer, value);
        return this;
    }

    public @NativeType("boolean") boolean cycle() {
        return segment.get(LAYOUT$cycle, OFFSET$cycle);
    }

    public SDL_GPUStorageTextureReadWriteBinding cycle(@NativeType("boolean") boolean value) {
        segment.set(LAYOUT$cycle, OFFSET$cycle, value);
        return this;
    }

    public @NativeType("Uint8") @Unsigned byte padding1() {
        return segment.get(LAYOUT$padding1, OFFSET$padding1);
    }

    public SDL_GPUStorageTextureReadWriteBinding padding1(@NativeType("Uint8") @Unsigned byte value) {
        segment.set(LAYOUT$padding1, OFFSET$padding1, value);
        return this;
    }

    public @NativeType("Uint8") @Unsigned byte padding2() {
        return segment.get(LAYOUT$padding2, OFFSET$padding2);
    }

    public SDL_GPUStorageTextureReadWriteBinding padding2(@NativeType("Uint8") @Unsigned byte value) {
        segment.set(LAYOUT$padding2, OFFSET$padding2, value);
        return this;
    }

    public @NativeType("Uint8") @Unsigned byte padding3() {
        return segment.get(LAYOUT$padding3, OFFSET$padding3);
    }

    public SDL_GPUStorageTextureReadWriteBinding padding3(@NativeType("Uint8") @Unsigned byte value) {
        segment.set(LAYOUT$padding3, OFFSET$padding3, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.ADDRESS.withName("texture"),
        ValueLayout.JAVA_INT.withName("mip_level"),
        ValueLayout.JAVA_INT.withName("layer"),
        ValueLayout.JAVA_BOOLEAN.withName("cycle"),
        ValueLayout.JAVA_BYTE.withName("padding1"),
        ValueLayout.JAVA_BYTE.withName("padding2"),
        ValueLayout.JAVA_BYTE.withName("padding3")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$texture = PathElement.groupElement("texture");
    public static final PathElement PATH$mip_level = PathElement.groupElement("mip_level");
    public static final PathElement PATH$layer = PathElement.groupElement("layer");
    public static final PathElement PATH$cycle = PathElement.groupElement("cycle");
    public static final PathElement PATH$padding1 = PathElement.groupElement("padding1");
    public static final PathElement PATH$padding2 = PathElement.groupElement("padding2");
    public static final PathElement PATH$padding3 = PathElement.groupElement("padding3");

    public static final AddressLayout LAYOUT$texture = (AddressLayout) LAYOUT.select(PATH$texture);
    public static final OfInt LAYOUT$mip_level = (OfInt) LAYOUT.select(PATH$mip_level);
    public static final OfInt LAYOUT$layer = (OfInt) LAYOUT.select(PATH$layer);
    public static final OfBoolean LAYOUT$cycle = (OfBoolean) LAYOUT.select(PATH$cycle);
    public static final OfByte LAYOUT$padding1 = (OfByte) LAYOUT.select(PATH$padding1);
    public static final OfByte LAYOUT$padding2 = (OfByte) LAYOUT.select(PATH$padding2);
    public static final OfByte LAYOUT$padding3 = (OfByte) LAYOUT.select(PATH$padding3);

    public static final long SIZE$texture = LAYOUT$texture.byteSize();
    public static final long SIZE$mip_level = LAYOUT$mip_level.byteSize();
    public static final long SIZE$layer = LAYOUT$layer.byteSize();
    public static final long SIZE$cycle = LAYOUT$cycle.byteSize();
    public static final long SIZE$padding1 = LAYOUT$padding1.byteSize();
    public static final long SIZE$padding2 = LAYOUT$padding2.byteSize();
    public static final long SIZE$padding3 = LAYOUT$padding3.byteSize();

    public static final long OFFSET$texture = LAYOUT.byteOffset(PATH$texture);
    public static final long OFFSET$mip_level = LAYOUT.byteOffset(PATH$mip_level);
    public static final long OFFSET$layer = LAYOUT.byteOffset(PATH$layer);
    public static final long OFFSET$cycle = LAYOUT.byteOffset(PATH$cycle);
    public static final long OFFSET$padding1 = LAYOUT.byteOffset(PATH$padding1);
    public static final long OFFSET$padding2 = LAYOUT.byteOffset(PATH$padding2);
    public static final long OFFSET$padding3 = LAYOUT.byteOffset(PATH$padding3);
}
