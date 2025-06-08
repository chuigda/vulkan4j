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

/// A structure specifying the parameters of a sampler.
///
/// Note that mip_lod_bias is a no-op for the Metal driver. For Metal, LOD bias
/// must be applied via shader instead.
///
/// Since: This function is available since SDL 3.2.0.
///
/// See also:
/// - `SDL_CreateGPUSampler`
/// - `SDL_GPUFilter`
/// - `SDL_GPUSamplerMipmapMode`
/// - `SDL_GPUSamplerAddressMode`
/// - `SDL_GPUCompareOp`
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct SDL_GPUSamplerCreateInfo {
///     SDL_GPUFilter min_filter; // @link substring="SDL_GPUFilter" target="SDL_GPUFilter" @link substring="min_filter" target="#min_filter"
///     SDL_GPUFilter mag_filter; // @link substring="SDL_GPUFilter" target="SDL_GPUFilter" @link substring="mag_filter" target="#mag_filter"
///     SDL_GPUSamplerMipmapMode mipmap_mode; // @link substring="SDL_GPUSamplerMipmapMode" target="SDL_GPUSamplerMipmapMode" @link substring="mipmap_mode" target="#mipmap_mode"
///     SDL_GPUSamplerAddressMode address_mode_u; // @link substring="SDL_GPUSamplerAddressMode" target="SDL_GPUSamplerAddressMode" @link substring="address_mode_u" target="#address_mode_u"
///     SDL_GPUSamplerAddressMode address_mode_v; // @link substring="SDL_GPUSamplerAddressMode" target="SDL_GPUSamplerAddressMode" @link substring="address_mode_v" target="#address_mode_v"
///     SDL_GPUSamplerAddressMode address_mode_w; // @link substring="SDL_GPUSamplerAddressMode" target="SDL_GPUSamplerAddressMode" @link substring="address_mode_w" target="#address_mode_w"
///     float mip_lod_bias; // @link substring="mip_lod_bias" target="#mip_lod_bias"
///     float max_anisotropy; // @link substring="max_anisotropy" target="#max_anisotropy"
///     SDL_GPUCompareOp compare_op; // @link substring="SDL_GPUCompareOp" target="SDL_GPUCompareOp" @link substring="compare_op" target="#compare_op"
///     float min_lod; // @link substring="min_lod" target="#min_lod"
///     float max_lod; // @link substring="max_lod" target="#max_lod"
///     bool enable_anisotropy; // @link substring="enable_anisotropy" target="#enable_anisotropy"
///     bool enable_compare; // @link substring="enable_compare" target="#enable_compare"
///     Uint8 padding1; // @link substring="padding1" target="#padding1"
///     Uint8 padding2; // @link substring="padding2" target="#padding2"
///     SDL_PropertiesID props; // @link substring="props" target="#props"
/// } SDL_GPUSamplerCreateInfo;
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
public record SDL_GPUSamplerCreateInfo(@NotNull MemorySegment segment) implements ISDL_GPUSamplerCreateInfo {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link SDL_GPUSamplerCreateInfo}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// ISDL_GPUSamplerCreateInfo to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code SDL_GPUSamplerCreateInfo.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements ISDL_GPUSamplerCreateInfo, Iterable<SDL_GPUSamplerCreateInfo> {
        public long size() {
            return segment.byteSize() / SDL_GPUSamplerCreateInfo.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull SDL_GPUSamplerCreateInfo at(long index) {
            return new SDL_GPUSamplerCreateInfo(segment.asSlice(index * SDL_GPUSamplerCreateInfo.BYTES, SDL_GPUSamplerCreateInfo.BYTES));
        }

        public void write(long index, @NotNull SDL_GPUSamplerCreateInfo value) {
            MemorySegment s = segment.asSlice(index * SDL_GPUSamplerCreateInfo.BYTES, SDL_GPUSamplerCreateInfo.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * SDL_GPUSamplerCreateInfo.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * SDL_GPUSamplerCreateInfo.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * SDL_GPUSamplerCreateInfo.BYTES,
                (end - start) * SDL_GPUSamplerCreateInfo.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * SDL_GPUSamplerCreateInfo.BYTES));
        }

        public SDL_GPUSamplerCreateInfo[] toArray() {
            SDL_GPUSamplerCreateInfo[] ret = new SDL_GPUSamplerCreateInfo[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<SDL_GPUSamplerCreateInfo> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<SDL_GPUSamplerCreateInfo> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= SDL_GPUSamplerCreateInfo.BYTES;
            }

            @Override
            public SDL_GPUSamplerCreateInfo next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                SDL_GPUSamplerCreateInfo ret = new SDL_GPUSamplerCreateInfo(segment.asSlice(0, SDL_GPUSamplerCreateInfo.BYTES));
                segment = segment.asSlice(SDL_GPUSamplerCreateInfo.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static SDL_GPUSamplerCreateInfo allocate(Arena arena) {
        return new SDL_GPUSamplerCreateInfo(arena.allocate(LAYOUT));
    }

    public static SDL_GPUSamplerCreateInfo.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new SDL_GPUSamplerCreateInfo.Ptr(segment);
    }

    public static SDL_GPUSamplerCreateInfo clone(Arena arena, SDL_GPUSamplerCreateInfo src) {
        SDL_GPUSamplerCreateInfo ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @EnumType(SDL_GPUFilter.class) int min_filter() {
        return segment.get(LAYOUT$min_filter, OFFSET$min_filter);
    }

    public SDL_GPUSamplerCreateInfo min_filter(@EnumType(SDL_GPUFilter.class) int value) {
        segment.set(LAYOUT$min_filter, OFFSET$min_filter, value);
        return this;
    }

    public @EnumType(SDL_GPUFilter.class) int mag_filter() {
        return segment.get(LAYOUT$mag_filter, OFFSET$mag_filter);
    }

    public SDL_GPUSamplerCreateInfo mag_filter(@EnumType(SDL_GPUFilter.class) int value) {
        segment.set(LAYOUT$mag_filter, OFFSET$mag_filter, value);
        return this;
    }

    public @EnumType(SDL_GPUSamplerMipmapMode.class) int mipmap_mode() {
        return segment.get(LAYOUT$mipmap_mode, OFFSET$mipmap_mode);
    }

    public SDL_GPUSamplerCreateInfo mipmap_mode(@EnumType(SDL_GPUSamplerMipmapMode.class) int value) {
        segment.set(LAYOUT$mipmap_mode, OFFSET$mipmap_mode, value);
        return this;
    }

    public @EnumType(SDL_GPUSamplerAddressMode.class) int address_mode_u() {
        return segment.get(LAYOUT$address_mode_u, OFFSET$address_mode_u);
    }

    public SDL_GPUSamplerCreateInfo address_mode_u(@EnumType(SDL_GPUSamplerAddressMode.class) int value) {
        segment.set(LAYOUT$address_mode_u, OFFSET$address_mode_u, value);
        return this;
    }

    public @EnumType(SDL_GPUSamplerAddressMode.class) int address_mode_v() {
        return segment.get(LAYOUT$address_mode_v, OFFSET$address_mode_v);
    }

    public SDL_GPUSamplerCreateInfo address_mode_v(@EnumType(SDL_GPUSamplerAddressMode.class) int value) {
        segment.set(LAYOUT$address_mode_v, OFFSET$address_mode_v, value);
        return this;
    }

    public @EnumType(SDL_GPUSamplerAddressMode.class) int address_mode_w() {
        return segment.get(LAYOUT$address_mode_w, OFFSET$address_mode_w);
    }

    public SDL_GPUSamplerCreateInfo address_mode_w(@EnumType(SDL_GPUSamplerAddressMode.class) int value) {
        segment.set(LAYOUT$address_mode_w, OFFSET$address_mode_w, value);
        return this;
    }

    public float mip_lod_bias() {
        return segment.get(LAYOUT$mip_lod_bias, OFFSET$mip_lod_bias);
    }

    public SDL_GPUSamplerCreateInfo mip_lod_bias(float value) {
        segment.set(LAYOUT$mip_lod_bias, OFFSET$mip_lod_bias, value);
        return this;
    }

    public float max_anisotropy() {
        return segment.get(LAYOUT$max_anisotropy, OFFSET$max_anisotropy);
    }

    public SDL_GPUSamplerCreateInfo max_anisotropy(float value) {
        segment.set(LAYOUT$max_anisotropy, OFFSET$max_anisotropy, value);
        return this;
    }

    public @EnumType(SDL_GPUCompareOp.class) int compare_op() {
        return segment.get(LAYOUT$compare_op, OFFSET$compare_op);
    }

    public SDL_GPUSamplerCreateInfo compare_op(@EnumType(SDL_GPUCompareOp.class) int value) {
        segment.set(LAYOUT$compare_op, OFFSET$compare_op, value);
        return this;
    }

    public float min_lod() {
        return segment.get(LAYOUT$min_lod, OFFSET$min_lod);
    }

    public SDL_GPUSamplerCreateInfo min_lod(float value) {
        segment.set(LAYOUT$min_lod, OFFSET$min_lod, value);
        return this;
    }

    public float max_lod() {
        return segment.get(LAYOUT$max_lod, OFFSET$max_lod);
    }

    public SDL_GPUSamplerCreateInfo max_lod(float value) {
        segment.set(LAYOUT$max_lod, OFFSET$max_lod, value);
        return this;
    }

    public @NativeType("boolean") boolean enable_anisotropy() {
        return segment.get(LAYOUT$enable_anisotropy, OFFSET$enable_anisotropy);
    }

    public SDL_GPUSamplerCreateInfo enable_anisotropy(@NativeType("boolean") boolean value) {
        segment.set(LAYOUT$enable_anisotropy, OFFSET$enable_anisotropy, value);
        return this;
    }

    public @NativeType("boolean") boolean enable_compare() {
        return segment.get(LAYOUT$enable_compare, OFFSET$enable_compare);
    }

    public SDL_GPUSamplerCreateInfo enable_compare(@NativeType("boolean") boolean value) {
        segment.set(LAYOUT$enable_compare, OFFSET$enable_compare, value);
        return this;
    }

    public @NativeType("Uint8") @Unsigned byte padding1() {
        return segment.get(LAYOUT$padding1, OFFSET$padding1);
    }

    public SDL_GPUSamplerCreateInfo padding1(@NativeType("Uint8") @Unsigned byte value) {
        segment.set(LAYOUT$padding1, OFFSET$padding1, value);
        return this;
    }

    public @NativeType("Uint8") @Unsigned byte padding2() {
        return segment.get(LAYOUT$padding2, OFFSET$padding2);
    }

    public SDL_GPUSamplerCreateInfo padding2(@NativeType("Uint8") @Unsigned byte value) {
        segment.set(LAYOUT$padding2, OFFSET$padding2, value);
        return this;
    }

    public @NativeType("SDL_PropertiesID") @Unsigned int props() {
        return segment.get(LAYOUT$props, OFFSET$props);
    }

    public SDL_GPUSamplerCreateInfo props(@NativeType("SDL_PropertiesID") @Unsigned int value) {
        segment.set(LAYOUT$props, OFFSET$props, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("min_filter"),
        ValueLayout.JAVA_INT.withName("mag_filter"),
        ValueLayout.JAVA_INT.withName("mipmap_mode"),
        ValueLayout.JAVA_INT.withName("address_mode_u"),
        ValueLayout.JAVA_INT.withName("address_mode_v"),
        ValueLayout.JAVA_INT.withName("address_mode_w"),
        ValueLayout.JAVA_FLOAT.withName("mip_lod_bias"),
        ValueLayout.JAVA_FLOAT.withName("max_anisotropy"),
        ValueLayout.JAVA_INT.withName("compare_op"),
        ValueLayout.JAVA_FLOAT.withName("min_lod"),
        ValueLayout.JAVA_FLOAT.withName("max_lod"),
        ValueLayout.JAVA_BOOLEAN.withName("enable_anisotropy"),
        ValueLayout.JAVA_BOOLEAN.withName("enable_compare"),
        ValueLayout.JAVA_BYTE.withName("padding1"),
        ValueLayout.JAVA_BYTE.withName("padding2"),
        ValueLayout.JAVA_INT.withName("props")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$min_filter = PathElement.groupElement("min_filter");
    public static final PathElement PATH$mag_filter = PathElement.groupElement("mag_filter");
    public static final PathElement PATH$mipmap_mode = PathElement.groupElement("mipmap_mode");
    public static final PathElement PATH$address_mode_u = PathElement.groupElement("address_mode_u");
    public static final PathElement PATH$address_mode_v = PathElement.groupElement("address_mode_v");
    public static final PathElement PATH$address_mode_w = PathElement.groupElement("address_mode_w");
    public static final PathElement PATH$mip_lod_bias = PathElement.groupElement("mip_lod_bias");
    public static final PathElement PATH$max_anisotropy = PathElement.groupElement("max_anisotropy");
    public static final PathElement PATH$compare_op = PathElement.groupElement("compare_op");
    public static final PathElement PATH$min_lod = PathElement.groupElement("min_lod");
    public static final PathElement PATH$max_lod = PathElement.groupElement("max_lod");
    public static final PathElement PATH$enable_anisotropy = PathElement.groupElement("enable_anisotropy");
    public static final PathElement PATH$enable_compare = PathElement.groupElement("enable_compare");
    public static final PathElement PATH$padding1 = PathElement.groupElement("padding1");
    public static final PathElement PATH$padding2 = PathElement.groupElement("padding2");
    public static final PathElement PATH$props = PathElement.groupElement("props");

    public static final OfInt LAYOUT$min_filter = (OfInt) LAYOUT.select(PATH$min_filter);
    public static final OfInt LAYOUT$mag_filter = (OfInt) LAYOUT.select(PATH$mag_filter);
    public static final OfInt LAYOUT$mipmap_mode = (OfInt) LAYOUT.select(PATH$mipmap_mode);
    public static final OfInt LAYOUT$address_mode_u = (OfInt) LAYOUT.select(PATH$address_mode_u);
    public static final OfInt LAYOUT$address_mode_v = (OfInt) LAYOUT.select(PATH$address_mode_v);
    public static final OfInt LAYOUT$address_mode_w = (OfInt) LAYOUT.select(PATH$address_mode_w);
    public static final OfFloat LAYOUT$mip_lod_bias = (OfFloat) LAYOUT.select(PATH$mip_lod_bias);
    public static final OfFloat LAYOUT$max_anisotropy = (OfFloat) LAYOUT.select(PATH$max_anisotropy);
    public static final OfInt LAYOUT$compare_op = (OfInt) LAYOUT.select(PATH$compare_op);
    public static final OfFloat LAYOUT$min_lod = (OfFloat) LAYOUT.select(PATH$min_lod);
    public static final OfFloat LAYOUT$max_lod = (OfFloat) LAYOUT.select(PATH$max_lod);
    public static final OfBoolean LAYOUT$enable_anisotropy = (OfBoolean) LAYOUT.select(PATH$enable_anisotropy);
    public static final OfBoolean LAYOUT$enable_compare = (OfBoolean) LAYOUT.select(PATH$enable_compare);
    public static final OfByte LAYOUT$padding1 = (OfByte) LAYOUT.select(PATH$padding1);
    public static final OfByte LAYOUT$padding2 = (OfByte) LAYOUT.select(PATH$padding2);
    public static final OfInt LAYOUT$props = (OfInt) LAYOUT.select(PATH$props);

    public static final long SIZE$min_filter = LAYOUT$min_filter.byteSize();
    public static final long SIZE$mag_filter = LAYOUT$mag_filter.byteSize();
    public static final long SIZE$mipmap_mode = LAYOUT$mipmap_mode.byteSize();
    public static final long SIZE$address_mode_u = LAYOUT$address_mode_u.byteSize();
    public static final long SIZE$address_mode_v = LAYOUT$address_mode_v.byteSize();
    public static final long SIZE$address_mode_w = LAYOUT$address_mode_w.byteSize();
    public static final long SIZE$mip_lod_bias = LAYOUT$mip_lod_bias.byteSize();
    public static final long SIZE$max_anisotropy = LAYOUT$max_anisotropy.byteSize();
    public static final long SIZE$compare_op = LAYOUT$compare_op.byteSize();
    public static final long SIZE$min_lod = LAYOUT$min_lod.byteSize();
    public static final long SIZE$max_lod = LAYOUT$max_lod.byteSize();
    public static final long SIZE$enable_anisotropy = LAYOUT$enable_anisotropy.byteSize();
    public static final long SIZE$enable_compare = LAYOUT$enable_compare.byteSize();
    public static final long SIZE$padding1 = LAYOUT$padding1.byteSize();
    public static final long SIZE$padding2 = LAYOUT$padding2.byteSize();
    public static final long SIZE$props = LAYOUT$props.byteSize();

    public static final long OFFSET$min_filter = LAYOUT.byteOffset(PATH$min_filter);
    public static final long OFFSET$mag_filter = LAYOUT.byteOffset(PATH$mag_filter);
    public static final long OFFSET$mipmap_mode = LAYOUT.byteOffset(PATH$mipmap_mode);
    public static final long OFFSET$address_mode_u = LAYOUT.byteOffset(PATH$address_mode_u);
    public static final long OFFSET$address_mode_v = LAYOUT.byteOffset(PATH$address_mode_v);
    public static final long OFFSET$address_mode_w = LAYOUT.byteOffset(PATH$address_mode_w);
    public static final long OFFSET$mip_lod_bias = LAYOUT.byteOffset(PATH$mip_lod_bias);
    public static final long OFFSET$max_anisotropy = LAYOUT.byteOffset(PATH$max_anisotropy);
    public static final long OFFSET$compare_op = LAYOUT.byteOffset(PATH$compare_op);
    public static final long OFFSET$min_lod = LAYOUT.byteOffset(PATH$min_lod);
    public static final long OFFSET$max_lod = LAYOUT.byteOffset(PATH$max_lod);
    public static final long OFFSET$enable_anisotropy = LAYOUT.byteOffset(PATH$enable_anisotropy);
    public static final long OFFSET$enable_compare = LAYOUT.byteOffset(PATH$enable_compare);
    public static final long OFFSET$padding1 = LAYOUT.byteOffset(PATH$padding1);
    public static final long OFFSET$padding2 = LAYOUT.byteOffset(PATH$padding2);
    public static final long OFFSET$props = LAYOUT.byteOffset(PATH$props);
}
