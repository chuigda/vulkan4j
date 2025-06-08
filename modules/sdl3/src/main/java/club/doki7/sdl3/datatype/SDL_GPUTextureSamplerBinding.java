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

/// A structure specifying parameters in a sampler binding call.
///
/// \since This struct is available since SDL 3.2.0.
///
/// \sa SDL_BindGPUVertexSamplers
/// \sa SDL_BindGPUFragmentSamplers
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct SDL_GPUTextureSamplerBinding {
///     SDL_GPUTexture* texture; // @link substring="SDL_GPUTexture" target="SDL_GPUTexture" @link substring="texture" target="#texture"
///     SDL_GPUSampler* sampler; // @link substring="SDL_GPUSampler" target="SDL_GPUSampler" @link substring="sampler" target="#sampler"
/// } SDL_GPUTextureSamplerBinding;
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
public record SDL_GPUTextureSamplerBinding(@NotNull MemorySegment segment) implements ISDL_GPUTextureSamplerBinding {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link SDL_GPUTextureSamplerBinding}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// ISDL_GPUTextureSamplerBinding to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code SDL_GPUTextureSamplerBinding.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements ISDL_GPUTextureSamplerBinding, Iterable<SDL_GPUTextureSamplerBinding> {
        public long size() {
            return segment.byteSize() / SDL_GPUTextureSamplerBinding.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull SDL_GPUTextureSamplerBinding at(long index) {
            return new SDL_GPUTextureSamplerBinding(segment.asSlice(index * SDL_GPUTextureSamplerBinding.BYTES, SDL_GPUTextureSamplerBinding.BYTES));
        }

        public void write(long index, @NotNull SDL_GPUTextureSamplerBinding value) {
            MemorySegment s = segment.asSlice(index * SDL_GPUTextureSamplerBinding.BYTES, SDL_GPUTextureSamplerBinding.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * SDL_GPUTextureSamplerBinding.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * SDL_GPUTextureSamplerBinding.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * SDL_GPUTextureSamplerBinding.BYTES,
                (end - start) * SDL_GPUTextureSamplerBinding.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * SDL_GPUTextureSamplerBinding.BYTES));
        }

        public SDL_GPUTextureSamplerBinding[] toArray() {
            SDL_GPUTextureSamplerBinding[] ret = new SDL_GPUTextureSamplerBinding[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<SDL_GPUTextureSamplerBinding> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<SDL_GPUTextureSamplerBinding> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= SDL_GPUTextureSamplerBinding.BYTES;
            }

            @Override
            public SDL_GPUTextureSamplerBinding next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                SDL_GPUTextureSamplerBinding ret = new SDL_GPUTextureSamplerBinding(segment.asSlice(0, SDL_GPUTextureSamplerBinding.BYTES));
                segment = segment.asSlice(SDL_GPUTextureSamplerBinding.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static SDL_GPUTextureSamplerBinding allocate(Arena arena) {
        return new SDL_GPUTextureSamplerBinding(arena.allocate(LAYOUT));
    }

    public static SDL_GPUTextureSamplerBinding.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new SDL_GPUTextureSamplerBinding.Ptr(segment);
    }

    public static SDL_GPUTextureSamplerBinding clone(Arena arena, SDL_GPUTextureSamplerBinding src) {
        SDL_GPUTextureSamplerBinding ret = allocate(arena);
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

    public SDL_GPUTextureSamplerBinding texture(@Nullable SDL_GPUTexture value) {
        segment.set(LAYOUT$texture, OFFSET$texture, value != null ? value.segment() : MemorySegment.NULL);
        return this;
    }

    public @Nullable SDL_GPUSampler sampler() {
        MemorySegment s = segment.asSlice(OFFSET$sampler, SIZE$sampler);
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new SDL_GPUSampler(s);
    }

    public SDL_GPUTextureSamplerBinding sampler(@Nullable SDL_GPUSampler value) {
        segment.set(LAYOUT$sampler, OFFSET$sampler, value != null ? value.segment() : MemorySegment.NULL);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.ADDRESS.withName("texture"),
        ValueLayout.ADDRESS.withName("sampler")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$texture = PathElement.groupElement("texture");
    public static final PathElement PATH$sampler = PathElement.groupElement("sampler");

    public static final AddressLayout LAYOUT$texture = (AddressLayout) LAYOUT.select(PATH$texture);
    public static final AddressLayout LAYOUT$sampler = (AddressLayout) LAYOUT.select(PATH$sampler);

    public static final long SIZE$texture = LAYOUT$texture.byteSize();
    public static final long SIZE$sampler = LAYOUT$sampler.byteSize();

    public static final long OFFSET$texture = LAYOUT.byteOffset(PATH$texture);
    public static final long OFFSET$sampler = LAYOUT.byteOffset(PATH$sampler);
}
