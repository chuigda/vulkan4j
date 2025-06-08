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

/// A structure specifying the parameters of a depth-stencil target used by a
/// render pass.
///
/// The load_op field determines what is done with the depth contents of the
/// texture at the beginning of the render pass.
///
/// - LOAD: Loads the depth values currently in the texture.
/// - CLEAR: Clears the texture to a single depth.
/// - DONT_CARE: The driver will do whatever it wants with the memory. This is
///   a good option if you know that every single pixel will be touched in the
///   render pass.
///
/// The store_op field determines what is done with the depth results of the
/// render pass.
///
/// - STORE: Stores the depth results in the texture.
/// - DONT_CARE: The driver will do whatever it wants with the depth results.
///   This is often a good option for depth/stencil textures that don't need to
///   be reused again.
///
/// The stencil_load_op field determines what is done with the stencil contents
/// of the texture at the beginning of the render pass.
///
/// - LOAD: Loads the stencil values currently in the texture.
/// - CLEAR: Clears the stencil values to a single value.
/// - DONT_CARE: The driver will do whatever it wants with the memory. This is
///   a good option if you know that every single pixel will be touched in the
///   render pass.
///
/// The stencil_store_op field determines what is done with the stencil results
/// of the render pass.
///
/// - STORE: Stores the stencil results in the texture.
/// - DONT_CARE: The driver will do whatever it wants with the stencil results.
///   This is often a good option for depth/stencil textures that don't need to
///   be reused again.
///
/// Note that depth/stencil targets do not support multisample resolves.
///
/// \since This struct is available since SDL 3.2.0.
///
/// \sa SDL_BeginGPURenderPass
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct SDL_GPUDepthStencilTargetInfo {
///     SDL_GPUTexture* texture; // @link substring="SDL_GPUTexture" target="SDL_GPUTexture" @link substring="texture" target="#texture"
///     float clear_depth; // @link substring="clear_depth" target="#clear_depth"
///     SDL_GPULoadOp load_op; // @link substring="SDL_GPULoadOp" target="SDL_GPULoadOp" @link substring="load_op" target="#load_op"
///     SDL_GPUStoreOp store_op; // @link substring="SDL_GPUStoreOp" target="SDL_GPUStoreOp" @link substring="store_op" target="#store_op"
///     SDL_GPULoadOp stencil_load_op; // @link substring="SDL_GPULoadOp" target="SDL_GPULoadOp" @link substring="stencil_load_op" target="#stencil_load_op"
///     SDL_GPUStoreOp stencil_store_op; // @link substring="SDL_GPUStoreOp" target="SDL_GPUStoreOp" @link substring="stencil_store_op" target="#stencil_store_op"
///     bool cycle; // @link substring="cycle" target="#cycle"
///     Uint8 clear_stencil; // @link substring="clear_stencil" target="#clear_stencil"
///     Uint8 padding1; // @link substring="padding1" target="#padding1"
///     Uint8 padding2; // @link substring="padding2" target="#padding2"
/// } SDL_GPUDepthStencilTargetInfo;
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
public record SDL_GPUDepthStencilTargetInfo(@NotNull MemorySegment segment) implements ISDL_GPUDepthStencilTargetInfo {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link SDL_GPUDepthStencilTargetInfo}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// ISDL_GPUDepthStencilTargetInfo to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code SDL_GPUDepthStencilTargetInfo.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements ISDL_GPUDepthStencilTargetInfo, Iterable<SDL_GPUDepthStencilTargetInfo> {
        public long size() {
            return segment.byteSize() / SDL_GPUDepthStencilTargetInfo.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull SDL_GPUDepthStencilTargetInfo at(long index) {
            return new SDL_GPUDepthStencilTargetInfo(segment.asSlice(index * SDL_GPUDepthStencilTargetInfo.BYTES, SDL_GPUDepthStencilTargetInfo.BYTES));
        }

        public void write(long index, @NotNull SDL_GPUDepthStencilTargetInfo value) {
            MemorySegment s = segment.asSlice(index * SDL_GPUDepthStencilTargetInfo.BYTES, SDL_GPUDepthStencilTargetInfo.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * SDL_GPUDepthStencilTargetInfo.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * SDL_GPUDepthStencilTargetInfo.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * SDL_GPUDepthStencilTargetInfo.BYTES,
                (end - start) * SDL_GPUDepthStencilTargetInfo.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * SDL_GPUDepthStencilTargetInfo.BYTES));
        }

        public SDL_GPUDepthStencilTargetInfo[] toArray() {
            SDL_GPUDepthStencilTargetInfo[] ret = new SDL_GPUDepthStencilTargetInfo[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<SDL_GPUDepthStencilTargetInfo> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<SDL_GPUDepthStencilTargetInfo> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= SDL_GPUDepthStencilTargetInfo.BYTES;
            }

            @Override
            public SDL_GPUDepthStencilTargetInfo next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                SDL_GPUDepthStencilTargetInfo ret = new SDL_GPUDepthStencilTargetInfo(segment.asSlice(0, SDL_GPUDepthStencilTargetInfo.BYTES));
                segment = segment.asSlice(SDL_GPUDepthStencilTargetInfo.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static SDL_GPUDepthStencilTargetInfo allocate(Arena arena) {
        return new SDL_GPUDepthStencilTargetInfo(arena.allocate(LAYOUT));
    }

    public static SDL_GPUDepthStencilTargetInfo.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new SDL_GPUDepthStencilTargetInfo.Ptr(segment);
    }

    public static SDL_GPUDepthStencilTargetInfo clone(Arena arena, SDL_GPUDepthStencilTargetInfo src) {
        SDL_GPUDepthStencilTargetInfo ret = allocate(arena);
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

    public SDL_GPUDepthStencilTargetInfo texture(@Nullable SDL_GPUTexture value) {
        segment.set(LAYOUT$texture, OFFSET$texture, value != null ? value.segment() : MemorySegment.NULL);
        return this;
    }

    public float clear_depth() {
        return segment.get(LAYOUT$clear_depth, OFFSET$clear_depth);
    }

    public SDL_GPUDepthStencilTargetInfo clear_depth(float value) {
        segment.set(LAYOUT$clear_depth, OFFSET$clear_depth, value);
        return this;
    }

    public @EnumType(SDL_GPULoadOp.class) int load_op() {
        return segment.get(LAYOUT$load_op, OFFSET$load_op);
    }

    public SDL_GPUDepthStencilTargetInfo load_op(@EnumType(SDL_GPULoadOp.class) int value) {
        segment.set(LAYOUT$load_op, OFFSET$load_op, value);
        return this;
    }

    public @EnumType(SDL_GPUStoreOp.class) int store_op() {
        return segment.get(LAYOUT$store_op, OFFSET$store_op);
    }

    public SDL_GPUDepthStencilTargetInfo store_op(@EnumType(SDL_GPUStoreOp.class) int value) {
        segment.set(LAYOUT$store_op, OFFSET$store_op, value);
        return this;
    }

    public @EnumType(SDL_GPULoadOp.class) int stencil_load_op() {
        return segment.get(LAYOUT$stencil_load_op, OFFSET$stencil_load_op);
    }

    public SDL_GPUDepthStencilTargetInfo stencil_load_op(@EnumType(SDL_GPULoadOp.class) int value) {
        segment.set(LAYOUT$stencil_load_op, OFFSET$stencil_load_op, value);
        return this;
    }

    public @EnumType(SDL_GPUStoreOp.class) int stencil_store_op() {
        return segment.get(LAYOUT$stencil_store_op, OFFSET$stencil_store_op);
    }

    public SDL_GPUDepthStencilTargetInfo stencil_store_op(@EnumType(SDL_GPUStoreOp.class) int value) {
        segment.set(LAYOUT$stencil_store_op, OFFSET$stencil_store_op, value);
        return this;
    }

    public @NativeType("boolean") boolean cycle() {
        return segment.get(LAYOUT$cycle, OFFSET$cycle);
    }

    public SDL_GPUDepthStencilTargetInfo cycle(@NativeType("boolean") boolean value) {
        segment.set(LAYOUT$cycle, OFFSET$cycle, value);
        return this;
    }

    public @NativeType("Uint8") @Unsigned byte clear_stencil() {
        return segment.get(LAYOUT$clear_stencil, OFFSET$clear_stencil);
    }

    public SDL_GPUDepthStencilTargetInfo clear_stencil(@NativeType("Uint8") @Unsigned byte value) {
        segment.set(LAYOUT$clear_stencil, OFFSET$clear_stencil, value);
        return this;
    }

    public @NativeType("Uint8") @Unsigned byte padding1() {
        return segment.get(LAYOUT$padding1, OFFSET$padding1);
    }

    public SDL_GPUDepthStencilTargetInfo padding1(@NativeType("Uint8") @Unsigned byte value) {
        segment.set(LAYOUT$padding1, OFFSET$padding1, value);
        return this;
    }

    public @NativeType("Uint8") @Unsigned byte padding2() {
        return segment.get(LAYOUT$padding2, OFFSET$padding2);
    }

    public SDL_GPUDepthStencilTargetInfo padding2(@NativeType("Uint8") @Unsigned byte value) {
        segment.set(LAYOUT$padding2, OFFSET$padding2, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.ADDRESS.withName("texture"),
        ValueLayout.JAVA_FLOAT.withName("clear_depth"),
        ValueLayout.JAVA_INT.withName("load_op"),
        ValueLayout.JAVA_INT.withName("store_op"),
        ValueLayout.JAVA_INT.withName("stencil_load_op"),
        ValueLayout.JAVA_INT.withName("stencil_store_op"),
        ValueLayout.JAVA_BOOLEAN.withName("cycle"),
        ValueLayout.JAVA_BYTE.withName("clear_stencil"),
        ValueLayout.JAVA_BYTE.withName("padding1"),
        ValueLayout.JAVA_BYTE.withName("padding2")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$texture = PathElement.groupElement("texture");
    public static final PathElement PATH$clear_depth = PathElement.groupElement("clear_depth");
    public static final PathElement PATH$load_op = PathElement.groupElement("load_op");
    public static final PathElement PATH$store_op = PathElement.groupElement("store_op");
    public static final PathElement PATH$stencil_load_op = PathElement.groupElement("stencil_load_op");
    public static final PathElement PATH$stencil_store_op = PathElement.groupElement("stencil_store_op");
    public static final PathElement PATH$cycle = PathElement.groupElement("cycle");
    public static final PathElement PATH$clear_stencil = PathElement.groupElement("clear_stencil");
    public static final PathElement PATH$padding1 = PathElement.groupElement("padding1");
    public static final PathElement PATH$padding2 = PathElement.groupElement("padding2");

    public static final AddressLayout LAYOUT$texture = (AddressLayout) LAYOUT.select(PATH$texture);
    public static final OfFloat LAYOUT$clear_depth = (OfFloat) LAYOUT.select(PATH$clear_depth);
    public static final OfInt LAYOUT$load_op = (OfInt) LAYOUT.select(PATH$load_op);
    public static final OfInt LAYOUT$store_op = (OfInt) LAYOUT.select(PATH$store_op);
    public static final OfInt LAYOUT$stencil_load_op = (OfInt) LAYOUT.select(PATH$stencil_load_op);
    public static final OfInt LAYOUT$stencil_store_op = (OfInt) LAYOUT.select(PATH$stencil_store_op);
    public static final OfBoolean LAYOUT$cycle = (OfBoolean) LAYOUT.select(PATH$cycle);
    public static final OfByte LAYOUT$clear_stencil = (OfByte) LAYOUT.select(PATH$clear_stencil);
    public static final OfByte LAYOUT$padding1 = (OfByte) LAYOUT.select(PATH$padding1);
    public static final OfByte LAYOUT$padding2 = (OfByte) LAYOUT.select(PATH$padding2);

    public static final long SIZE$texture = LAYOUT$texture.byteSize();
    public static final long SIZE$clear_depth = LAYOUT$clear_depth.byteSize();
    public static final long SIZE$load_op = LAYOUT$load_op.byteSize();
    public static final long SIZE$store_op = LAYOUT$store_op.byteSize();
    public static final long SIZE$stencil_load_op = LAYOUT$stencil_load_op.byteSize();
    public static final long SIZE$stencil_store_op = LAYOUT$stencil_store_op.byteSize();
    public static final long SIZE$cycle = LAYOUT$cycle.byteSize();
    public static final long SIZE$clear_stencil = LAYOUT$clear_stencil.byteSize();
    public static final long SIZE$padding1 = LAYOUT$padding1.byteSize();
    public static final long SIZE$padding2 = LAYOUT$padding2.byteSize();

    public static final long OFFSET$texture = LAYOUT.byteOffset(PATH$texture);
    public static final long OFFSET$clear_depth = LAYOUT.byteOffset(PATH$clear_depth);
    public static final long OFFSET$load_op = LAYOUT.byteOffset(PATH$load_op);
    public static final long OFFSET$store_op = LAYOUT.byteOffset(PATH$store_op);
    public static final long OFFSET$stencil_load_op = LAYOUT.byteOffset(PATH$stencil_load_op);
    public static final long OFFSET$stencil_store_op = LAYOUT.byteOffset(PATH$stencil_store_op);
    public static final long OFFSET$cycle = LAYOUT.byteOffset(PATH$cycle);
    public static final long OFFSET$clear_stencil = LAYOUT.byteOffset(PATH$clear_stencil);
    public static final long OFFSET$padding1 = LAYOUT.byteOffset(PATH$padding1);
    public static final long OFFSET$padding2 = LAYOUT.byteOffset(PATH$padding2);
}
