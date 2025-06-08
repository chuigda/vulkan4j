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

/// A structure specifying the parameters of a color target used by a render
/// pass.
///
/// The load_op field determines what is done with the texture at the beginning
/// of the render pass.
///
/// - LOAD: Loads the data currently in the texture. Not recommended for
///   multisample textures as it requires significant memory bandwidth.
/// - CLEAR: Clears the texture to a single color.
/// - DONT_CARE: The driver will do whatever it wants with the texture memory.
///   This is a good option if you know that every single pixel will be touched
///   in the render pass.
///
/// The store_op field determines what is done with the color results of the
/// render pass.
///
/// - STORE: Stores the results of the render pass in the texture. Not
///   recommended for multisample textures as it requires significant memory
///   bandwidth.
/// - DONT_CARE: The driver will do whatever it wants with the texture memory.
///   This is often a good option for depth/stencil textures.
/// - RESOLVE: Resolves a multisample texture into resolve_texture, which must
///   have a sample count of 1. Then the driver may discard the multisample
///   texture memory. This is the most performant method of resolving a
///   multisample target.
/// - RESOLVE_AND_STORE: Resolves a multisample texture into the
///   resolve_texture, which must have a sample count of 1. Then the driver
///   stores the multisample texture's contents. Not recommended as it requires
///   significant memory bandwidth.
///
/// \since This struct is available since SDL 3.2.0.
///
/// \sa SDL_BeginGPURenderPass
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct SDL_GPUColorTargetInfo {
///     SDL_GPUTexture* texture; // @link substring="SDL_GPUTexture" target="SDL_GPUTexture" @link substring="texture" target="#texture"
///     Uint32 mip_level; // @link substring="mip_level" target="#mip_level"
///     Uint32 layer_or_depth_plane; // @link substring="layer_or_depth_plane" target="#layer_or_depth_plane"
///     SDL_FColor clear_color; // @link substring="SDL_FColor" target="SDL_FColor" @link substring="clear_color" target="#clear_color"
///     SDL_GPULoadOp load_op; // @link substring="SDL_GPULoadOp" target="SDL_GPULoadOp" @link substring="load_op" target="#load_op"
///     SDL_GPUStoreOp store_op; // @link substring="SDL_GPUStoreOp" target="SDL_GPUStoreOp" @link substring="store_op" target="#store_op"
///     SDL_GPUTexture* resolve_texture; // @link substring="SDL_GPUTexture" target="SDL_GPUTexture" @link substring="resolve_texture" target="#resolve_texture"
///     Uint32 resolve_mip_level; // @link substring="resolve_mip_level" target="#resolve_mip_level"
///     Uint32 resolve_layer; // @link substring="resolve_layer" target="#resolve_layer"
///     bool cycle; // @link substring="cycle" target="#cycle"
///     bool cycle_resolve_texture; // @link substring="cycle_resolve_texture" target="#cycle_resolve_texture"
///     Uint8 padding1; // @link substring="padding1" target="#padding1"
///     Uint8 padding2; // @link substring="padding2" target="#padding2"
/// } SDL_GPUColorTargetInfo;
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
public record SDL_GPUColorTargetInfo(@NotNull MemorySegment segment) implements ISDL_GPUColorTargetInfo {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link SDL_GPUColorTargetInfo}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// ISDL_GPUColorTargetInfo to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code SDL_GPUColorTargetInfo.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements ISDL_GPUColorTargetInfo, Iterable<SDL_GPUColorTargetInfo> {
        public long size() {
            return segment.byteSize() / SDL_GPUColorTargetInfo.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull SDL_GPUColorTargetInfo at(long index) {
            return new SDL_GPUColorTargetInfo(segment.asSlice(index * SDL_GPUColorTargetInfo.BYTES, SDL_GPUColorTargetInfo.BYTES));
        }

        public void write(long index, @NotNull SDL_GPUColorTargetInfo value) {
            MemorySegment s = segment.asSlice(index * SDL_GPUColorTargetInfo.BYTES, SDL_GPUColorTargetInfo.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * SDL_GPUColorTargetInfo.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * SDL_GPUColorTargetInfo.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * SDL_GPUColorTargetInfo.BYTES,
                (end - start) * SDL_GPUColorTargetInfo.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * SDL_GPUColorTargetInfo.BYTES));
        }

        public SDL_GPUColorTargetInfo[] toArray() {
            SDL_GPUColorTargetInfo[] ret = new SDL_GPUColorTargetInfo[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<SDL_GPUColorTargetInfo> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<SDL_GPUColorTargetInfo> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= SDL_GPUColorTargetInfo.BYTES;
            }

            @Override
            public SDL_GPUColorTargetInfo next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                SDL_GPUColorTargetInfo ret = new SDL_GPUColorTargetInfo(segment.asSlice(0, SDL_GPUColorTargetInfo.BYTES));
                segment = segment.asSlice(SDL_GPUColorTargetInfo.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static SDL_GPUColorTargetInfo allocate(Arena arena) {
        return new SDL_GPUColorTargetInfo(arena.allocate(LAYOUT));
    }

    public static SDL_GPUColorTargetInfo.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new SDL_GPUColorTargetInfo.Ptr(segment);
    }

    public static SDL_GPUColorTargetInfo clone(Arena arena, SDL_GPUColorTargetInfo src) {
        SDL_GPUColorTargetInfo ret = allocate(arena);
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

    public SDL_GPUColorTargetInfo texture(@Nullable SDL_GPUTexture value) {
        segment.set(LAYOUT$texture, OFFSET$texture, value != null ? value.segment() : MemorySegment.NULL);
        return this;
    }

    public @NativeType("Uint32") @Unsigned int mip_level() {
        return segment.get(LAYOUT$mip_level, OFFSET$mip_level);
    }

    public SDL_GPUColorTargetInfo mip_level(@NativeType("Uint32") @Unsigned int value) {
        segment.set(LAYOUT$mip_level, OFFSET$mip_level, value);
        return this;
    }

    public @NativeType("Uint32") @Unsigned int layer_or_depth_plane() {
        return segment.get(LAYOUT$layer_or_depth_plane, OFFSET$layer_or_depth_plane);
    }

    public SDL_GPUColorTargetInfo layer_or_depth_plane(@NativeType("Uint32") @Unsigned int value) {
        segment.set(LAYOUT$layer_or_depth_plane, OFFSET$layer_or_depth_plane, value);
        return this;
    }

    public @NotNull SDL_FColor clear_color() {
        return new SDL_FColor(segment.asSlice(OFFSET$clear_color, LAYOUT$clear_color));
    }

    public SDL_GPUColorTargetInfo clear_color(@NotNull SDL_FColor value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$clear_color, SIZE$clear_color);
        return this;
    }

    public SDL_GPUColorTargetInfo clear_color(Consumer<@NotNull SDL_FColor> consumer) {
        consumer.accept(clear_color());
        return this;
    }

    public @EnumType(SDL_GPULoadOp.class) int load_op() {
        return segment.get(LAYOUT$load_op, OFFSET$load_op);
    }

    public SDL_GPUColorTargetInfo load_op(@EnumType(SDL_GPULoadOp.class) int value) {
        segment.set(LAYOUT$load_op, OFFSET$load_op, value);
        return this;
    }

    public @EnumType(SDL_GPUStoreOp.class) int store_op() {
        return segment.get(LAYOUT$store_op, OFFSET$store_op);
    }

    public SDL_GPUColorTargetInfo store_op(@EnumType(SDL_GPUStoreOp.class) int value) {
        segment.set(LAYOUT$store_op, OFFSET$store_op, value);
        return this;
    }

    public @Nullable SDL_GPUTexture resolve_texture() {
        MemorySegment s = segment.asSlice(OFFSET$resolve_texture, SIZE$resolve_texture);
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new SDL_GPUTexture(s);
    }

    public SDL_GPUColorTargetInfo resolve_texture(@Nullable SDL_GPUTexture value) {
        segment.set(LAYOUT$resolve_texture, OFFSET$resolve_texture, value != null ? value.segment() : MemorySegment.NULL);
        return this;
    }

    public @NativeType("Uint32") @Unsigned int resolve_mip_level() {
        return segment.get(LAYOUT$resolve_mip_level, OFFSET$resolve_mip_level);
    }

    public SDL_GPUColorTargetInfo resolve_mip_level(@NativeType("Uint32") @Unsigned int value) {
        segment.set(LAYOUT$resolve_mip_level, OFFSET$resolve_mip_level, value);
        return this;
    }

    public @NativeType("Uint32") @Unsigned int resolve_layer() {
        return segment.get(LAYOUT$resolve_layer, OFFSET$resolve_layer);
    }

    public SDL_GPUColorTargetInfo resolve_layer(@NativeType("Uint32") @Unsigned int value) {
        segment.set(LAYOUT$resolve_layer, OFFSET$resolve_layer, value);
        return this;
    }

    public @NativeType("boolean") boolean cycle() {
        return segment.get(LAYOUT$cycle, OFFSET$cycle);
    }

    public SDL_GPUColorTargetInfo cycle(@NativeType("boolean") boolean value) {
        segment.set(LAYOUT$cycle, OFFSET$cycle, value);
        return this;
    }

    public @NativeType("boolean") boolean cycle_resolve_texture() {
        return segment.get(LAYOUT$cycle_resolve_texture, OFFSET$cycle_resolve_texture);
    }

    public SDL_GPUColorTargetInfo cycle_resolve_texture(@NativeType("boolean") boolean value) {
        segment.set(LAYOUT$cycle_resolve_texture, OFFSET$cycle_resolve_texture, value);
        return this;
    }

    public @NativeType("Uint8") @Unsigned byte padding1() {
        return segment.get(LAYOUT$padding1, OFFSET$padding1);
    }

    public SDL_GPUColorTargetInfo padding1(@NativeType("Uint8") @Unsigned byte value) {
        segment.set(LAYOUT$padding1, OFFSET$padding1, value);
        return this;
    }

    public @NativeType("Uint8") @Unsigned byte padding2() {
        return segment.get(LAYOUT$padding2, OFFSET$padding2);
    }

    public SDL_GPUColorTargetInfo padding2(@NativeType("Uint8") @Unsigned byte value) {
        segment.set(LAYOUT$padding2, OFFSET$padding2, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.ADDRESS.withName("texture"),
        ValueLayout.JAVA_INT.withName("mip_level"),
        ValueLayout.JAVA_INT.withName("layer_or_depth_plane"),
        SDL_FColor.LAYOUT.withName("clear_color"),
        ValueLayout.JAVA_INT.withName("load_op"),
        ValueLayout.JAVA_INT.withName("store_op"),
        ValueLayout.ADDRESS.withName("resolve_texture"),
        ValueLayout.JAVA_INT.withName("resolve_mip_level"),
        ValueLayout.JAVA_INT.withName("resolve_layer"),
        ValueLayout.JAVA_BOOLEAN.withName("cycle"),
        ValueLayout.JAVA_BOOLEAN.withName("cycle_resolve_texture"),
        ValueLayout.JAVA_BYTE.withName("padding1"),
        ValueLayout.JAVA_BYTE.withName("padding2")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$texture = PathElement.groupElement("texture");
    public static final PathElement PATH$mip_level = PathElement.groupElement("mip_level");
    public static final PathElement PATH$layer_or_depth_plane = PathElement.groupElement("layer_or_depth_plane");
    public static final PathElement PATH$clear_color = PathElement.groupElement("clear_color");
    public static final PathElement PATH$load_op = PathElement.groupElement("load_op");
    public static final PathElement PATH$store_op = PathElement.groupElement("store_op");
    public static final PathElement PATH$resolve_texture = PathElement.groupElement("resolve_texture");
    public static final PathElement PATH$resolve_mip_level = PathElement.groupElement("resolve_mip_level");
    public static final PathElement PATH$resolve_layer = PathElement.groupElement("resolve_layer");
    public static final PathElement PATH$cycle = PathElement.groupElement("cycle");
    public static final PathElement PATH$cycle_resolve_texture = PathElement.groupElement("cycle_resolve_texture");
    public static final PathElement PATH$padding1 = PathElement.groupElement("padding1");
    public static final PathElement PATH$padding2 = PathElement.groupElement("padding2");

    public static final AddressLayout LAYOUT$texture = (AddressLayout) LAYOUT.select(PATH$texture);
    public static final OfInt LAYOUT$mip_level = (OfInt) LAYOUT.select(PATH$mip_level);
    public static final OfInt LAYOUT$layer_or_depth_plane = (OfInt) LAYOUT.select(PATH$layer_or_depth_plane);
    public static final StructLayout LAYOUT$clear_color = (StructLayout) LAYOUT.select(PATH$clear_color);
    public static final OfInt LAYOUT$load_op = (OfInt) LAYOUT.select(PATH$load_op);
    public static final OfInt LAYOUT$store_op = (OfInt) LAYOUT.select(PATH$store_op);
    public static final AddressLayout LAYOUT$resolve_texture = (AddressLayout) LAYOUT.select(PATH$resolve_texture);
    public static final OfInt LAYOUT$resolve_mip_level = (OfInt) LAYOUT.select(PATH$resolve_mip_level);
    public static final OfInt LAYOUT$resolve_layer = (OfInt) LAYOUT.select(PATH$resolve_layer);
    public static final OfBoolean LAYOUT$cycle = (OfBoolean) LAYOUT.select(PATH$cycle);
    public static final OfBoolean LAYOUT$cycle_resolve_texture = (OfBoolean) LAYOUT.select(PATH$cycle_resolve_texture);
    public static final OfByte LAYOUT$padding1 = (OfByte) LAYOUT.select(PATH$padding1);
    public static final OfByte LAYOUT$padding2 = (OfByte) LAYOUT.select(PATH$padding2);

    public static final long SIZE$texture = LAYOUT$texture.byteSize();
    public static final long SIZE$mip_level = LAYOUT$mip_level.byteSize();
    public static final long SIZE$layer_or_depth_plane = LAYOUT$layer_or_depth_plane.byteSize();
    public static final long SIZE$clear_color = LAYOUT$clear_color.byteSize();
    public static final long SIZE$load_op = LAYOUT$load_op.byteSize();
    public static final long SIZE$store_op = LAYOUT$store_op.byteSize();
    public static final long SIZE$resolve_texture = LAYOUT$resolve_texture.byteSize();
    public static final long SIZE$resolve_mip_level = LAYOUT$resolve_mip_level.byteSize();
    public static final long SIZE$resolve_layer = LAYOUT$resolve_layer.byteSize();
    public static final long SIZE$cycle = LAYOUT$cycle.byteSize();
    public static final long SIZE$cycle_resolve_texture = LAYOUT$cycle_resolve_texture.byteSize();
    public static final long SIZE$padding1 = LAYOUT$padding1.byteSize();
    public static final long SIZE$padding2 = LAYOUT$padding2.byteSize();

    public static final long OFFSET$texture = LAYOUT.byteOffset(PATH$texture);
    public static final long OFFSET$mip_level = LAYOUT.byteOffset(PATH$mip_level);
    public static final long OFFSET$layer_or_depth_plane = LAYOUT.byteOffset(PATH$layer_or_depth_plane);
    public static final long OFFSET$clear_color = LAYOUT.byteOffset(PATH$clear_color);
    public static final long OFFSET$load_op = LAYOUT.byteOffset(PATH$load_op);
    public static final long OFFSET$store_op = LAYOUT.byteOffset(PATH$store_op);
    public static final long OFFSET$resolve_texture = LAYOUT.byteOffset(PATH$resolve_texture);
    public static final long OFFSET$resolve_mip_level = LAYOUT.byteOffset(PATH$resolve_mip_level);
    public static final long OFFSET$resolve_layer = LAYOUT.byteOffset(PATH$resolve_layer);
    public static final long OFFSET$cycle = LAYOUT.byteOffset(PATH$cycle);
    public static final long OFFSET$cycle_resolve_texture = LAYOUT.byteOffset(PATH$cycle_resolve_texture);
    public static final long OFFSET$padding1 = LAYOUT.byteOffset(PATH$padding1);
    public static final long OFFSET$padding2 = LAYOUT.byteOffset(PATH$padding2);
}
