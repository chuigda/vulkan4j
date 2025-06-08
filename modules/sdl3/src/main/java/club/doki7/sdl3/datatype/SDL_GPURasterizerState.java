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

/// A structure specifying the parameters of the graphics pipeline rasterizer
/// state.
///
/// Note that SDL_GPU_FILLMODE_LINE is not supported on many Android devices.
/// For those devices, the fill mode will automatically fall back to FILL.
///
/// Also note that the D3D12 driver will enable depth clamping even if
/// enable_depth_clip is true. If you need this clamp+clip behavior, consider
/// enabling depth clip and then manually clamping depth in your fragment
/// shaders on Metal and Vulkan.
///
/// Since: This struct is available since SDL 3.2.0.
///
/// See also:
/// - `SDL_GPUGraphicsPipelineCreateInfo`
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct SDL_GPURasterizerState {
///     SDL_GPUFillMode fill_mode; // @link substring="SDL_GPUFillMode" target="SDL_GPUFillMode" @link substring="fill_mode" target="#fill_mode"
///     SDL_GPUCullMode cull_mode; // @link substring="SDL_GPUCullMode" target="SDL_GPUCullMode" @link substring="cull_mode" target="#cull_mode"
///     SDL_GPUFrontFace front_face; // @link substring="SDL_GPUFrontFace" target="SDL_GPUFrontFace" @link substring="front_face" target="#front_face"
///     float depth_bias_constant_factor; // @link substring="depth_bias_constant_factor" target="#depth_bias_constant_factor"
///     float depth_bias_clamp; // @link substring="depth_bias_clamp" target="#depth_bias_clamp"
///     float depth_bias_slope_factor; // @link substring="depth_bias_slope_factor" target="#depth_bias_slope_factor"
///     bool enable_depth_bias; // @link substring="enable_depth_bias" target="#enable_depth_bias"
///     bool enable_depth_clip; // @link substring="enable_depth_clip" target="#enable_depth_clip"
///     Uint8 padding1; // @link substring="padding1" target="#padding1"
///     Uint8 padding2; // @link substring="padding2" target="#padding2"
/// } SDL_GPURasterizerState;
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
public record SDL_GPURasterizerState(@NotNull MemorySegment segment) implements ISDL_GPURasterizerState {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link SDL_GPURasterizerState}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// ISDL_GPURasterizerState to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code SDL_GPURasterizerState.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements ISDL_GPURasterizerState, Iterable<SDL_GPURasterizerState> {
        public long size() {
            return segment.byteSize() / SDL_GPURasterizerState.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull SDL_GPURasterizerState at(long index) {
            return new SDL_GPURasterizerState(segment.asSlice(index * SDL_GPURasterizerState.BYTES, SDL_GPURasterizerState.BYTES));
        }

        public void write(long index, @NotNull SDL_GPURasterizerState value) {
            MemorySegment s = segment.asSlice(index * SDL_GPURasterizerState.BYTES, SDL_GPURasterizerState.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * SDL_GPURasterizerState.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * SDL_GPURasterizerState.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * SDL_GPURasterizerState.BYTES,
                (end - start) * SDL_GPURasterizerState.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * SDL_GPURasterizerState.BYTES));
        }

        public SDL_GPURasterizerState[] toArray() {
            SDL_GPURasterizerState[] ret = new SDL_GPURasterizerState[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<SDL_GPURasterizerState> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<SDL_GPURasterizerState> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= SDL_GPURasterizerState.BYTES;
            }

            @Override
            public SDL_GPURasterizerState next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                SDL_GPURasterizerState ret = new SDL_GPURasterizerState(segment.asSlice(0, SDL_GPURasterizerState.BYTES));
                segment = segment.asSlice(SDL_GPURasterizerState.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static SDL_GPURasterizerState allocate(Arena arena) {
        return new SDL_GPURasterizerState(arena.allocate(LAYOUT));
    }

    public static SDL_GPURasterizerState.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new SDL_GPURasterizerState.Ptr(segment);
    }

    public static SDL_GPURasterizerState clone(Arena arena, SDL_GPURasterizerState src) {
        SDL_GPURasterizerState ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @EnumType(SDL_GPUFillMode.class) int fill_mode() {
        return segment.get(LAYOUT$fill_mode, OFFSET$fill_mode);
    }

    public SDL_GPURasterizerState fill_mode(@EnumType(SDL_GPUFillMode.class) int value) {
        segment.set(LAYOUT$fill_mode, OFFSET$fill_mode, value);
        return this;
    }

    public @EnumType(SDL_GPUCullMode.class) int cull_mode() {
        return segment.get(LAYOUT$cull_mode, OFFSET$cull_mode);
    }

    public SDL_GPURasterizerState cull_mode(@EnumType(SDL_GPUCullMode.class) int value) {
        segment.set(LAYOUT$cull_mode, OFFSET$cull_mode, value);
        return this;
    }

    public @EnumType(SDL_GPUFrontFace.class) int front_face() {
        return segment.get(LAYOUT$front_face, OFFSET$front_face);
    }

    public SDL_GPURasterizerState front_face(@EnumType(SDL_GPUFrontFace.class) int value) {
        segment.set(LAYOUT$front_face, OFFSET$front_face, value);
        return this;
    }

    public float depth_bias_constant_factor() {
        return segment.get(LAYOUT$depth_bias_constant_factor, OFFSET$depth_bias_constant_factor);
    }

    public SDL_GPURasterizerState depth_bias_constant_factor(float value) {
        segment.set(LAYOUT$depth_bias_constant_factor, OFFSET$depth_bias_constant_factor, value);
        return this;
    }

    public float depth_bias_clamp() {
        return segment.get(LAYOUT$depth_bias_clamp, OFFSET$depth_bias_clamp);
    }

    public SDL_GPURasterizerState depth_bias_clamp(float value) {
        segment.set(LAYOUT$depth_bias_clamp, OFFSET$depth_bias_clamp, value);
        return this;
    }

    public float depth_bias_slope_factor() {
        return segment.get(LAYOUT$depth_bias_slope_factor, OFFSET$depth_bias_slope_factor);
    }

    public SDL_GPURasterizerState depth_bias_slope_factor(float value) {
        segment.set(LAYOUT$depth_bias_slope_factor, OFFSET$depth_bias_slope_factor, value);
        return this;
    }

    public @NativeType("boolean") boolean enable_depth_bias() {
        return segment.get(LAYOUT$enable_depth_bias, OFFSET$enable_depth_bias);
    }

    public SDL_GPURasterizerState enable_depth_bias(@NativeType("boolean") boolean value) {
        segment.set(LAYOUT$enable_depth_bias, OFFSET$enable_depth_bias, value);
        return this;
    }

    public @NativeType("boolean") boolean enable_depth_clip() {
        return segment.get(LAYOUT$enable_depth_clip, OFFSET$enable_depth_clip);
    }

    public SDL_GPURasterizerState enable_depth_clip(@NativeType("boolean") boolean value) {
        segment.set(LAYOUT$enable_depth_clip, OFFSET$enable_depth_clip, value);
        return this;
    }

    public @NativeType("Uint8") @Unsigned byte padding1() {
        return segment.get(LAYOUT$padding1, OFFSET$padding1);
    }

    public SDL_GPURasterizerState padding1(@NativeType("Uint8") @Unsigned byte value) {
        segment.set(LAYOUT$padding1, OFFSET$padding1, value);
        return this;
    }

    public @NativeType("Uint8") @Unsigned byte padding2() {
        return segment.get(LAYOUT$padding2, OFFSET$padding2);
    }

    public SDL_GPURasterizerState padding2(@NativeType("Uint8") @Unsigned byte value) {
        segment.set(LAYOUT$padding2, OFFSET$padding2, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("fill_mode"),
        ValueLayout.JAVA_INT.withName("cull_mode"),
        ValueLayout.JAVA_INT.withName("front_face"),
        ValueLayout.JAVA_FLOAT.withName("depth_bias_constant_factor"),
        ValueLayout.JAVA_FLOAT.withName("depth_bias_clamp"),
        ValueLayout.JAVA_FLOAT.withName("depth_bias_slope_factor"),
        ValueLayout.JAVA_BOOLEAN.withName("enable_depth_bias"),
        ValueLayout.JAVA_BOOLEAN.withName("enable_depth_clip"),
        ValueLayout.JAVA_BYTE.withName("padding1"),
        ValueLayout.JAVA_BYTE.withName("padding2")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$fill_mode = PathElement.groupElement("fill_mode");
    public static final PathElement PATH$cull_mode = PathElement.groupElement("cull_mode");
    public static final PathElement PATH$front_face = PathElement.groupElement("front_face");
    public static final PathElement PATH$depth_bias_constant_factor = PathElement.groupElement("depth_bias_constant_factor");
    public static final PathElement PATH$depth_bias_clamp = PathElement.groupElement("depth_bias_clamp");
    public static final PathElement PATH$depth_bias_slope_factor = PathElement.groupElement("depth_bias_slope_factor");
    public static final PathElement PATH$enable_depth_bias = PathElement.groupElement("enable_depth_bias");
    public static final PathElement PATH$enable_depth_clip = PathElement.groupElement("enable_depth_clip");
    public static final PathElement PATH$padding1 = PathElement.groupElement("padding1");
    public static final PathElement PATH$padding2 = PathElement.groupElement("padding2");

    public static final OfInt LAYOUT$fill_mode = (OfInt) LAYOUT.select(PATH$fill_mode);
    public static final OfInt LAYOUT$cull_mode = (OfInt) LAYOUT.select(PATH$cull_mode);
    public static final OfInt LAYOUT$front_face = (OfInt) LAYOUT.select(PATH$front_face);
    public static final OfFloat LAYOUT$depth_bias_constant_factor = (OfFloat) LAYOUT.select(PATH$depth_bias_constant_factor);
    public static final OfFloat LAYOUT$depth_bias_clamp = (OfFloat) LAYOUT.select(PATH$depth_bias_clamp);
    public static final OfFloat LAYOUT$depth_bias_slope_factor = (OfFloat) LAYOUT.select(PATH$depth_bias_slope_factor);
    public static final OfBoolean LAYOUT$enable_depth_bias = (OfBoolean) LAYOUT.select(PATH$enable_depth_bias);
    public static final OfBoolean LAYOUT$enable_depth_clip = (OfBoolean) LAYOUT.select(PATH$enable_depth_clip);
    public static final OfByte LAYOUT$padding1 = (OfByte) LAYOUT.select(PATH$padding1);
    public static final OfByte LAYOUT$padding2 = (OfByte) LAYOUT.select(PATH$padding2);

    public static final long SIZE$fill_mode = LAYOUT$fill_mode.byteSize();
    public static final long SIZE$cull_mode = LAYOUT$cull_mode.byteSize();
    public static final long SIZE$front_face = LAYOUT$front_face.byteSize();
    public static final long SIZE$depth_bias_constant_factor = LAYOUT$depth_bias_constant_factor.byteSize();
    public static final long SIZE$depth_bias_clamp = LAYOUT$depth_bias_clamp.byteSize();
    public static final long SIZE$depth_bias_slope_factor = LAYOUT$depth_bias_slope_factor.byteSize();
    public static final long SIZE$enable_depth_bias = LAYOUT$enable_depth_bias.byteSize();
    public static final long SIZE$enable_depth_clip = LAYOUT$enable_depth_clip.byteSize();
    public static final long SIZE$padding1 = LAYOUT$padding1.byteSize();
    public static final long SIZE$padding2 = LAYOUT$padding2.byteSize();

    public static final long OFFSET$fill_mode = LAYOUT.byteOffset(PATH$fill_mode);
    public static final long OFFSET$cull_mode = LAYOUT.byteOffset(PATH$cull_mode);
    public static final long OFFSET$front_face = LAYOUT.byteOffset(PATH$front_face);
    public static final long OFFSET$depth_bias_constant_factor = LAYOUT.byteOffset(PATH$depth_bias_constant_factor);
    public static final long OFFSET$depth_bias_clamp = LAYOUT.byteOffset(PATH$depth_bias_clamp);
    public static final long OFFSET$depth_bias_slope_factor = LAYOUT.byteOffset(PATH$depth_bias_slope_factor);
    public static final long OFFSET$enable_depth_bias = LAYOUT.byteOffset(PATH$enable_depth_bias);
    public static final long OFFSET$enable_depth_clip = LAYOUT.byteOffset(PATH$enable_depth_clip);
    public static final long OFFSET$padding1 = LAYOUT.byteOffset(PATH$padding1);
    public static final long OFFSET$padding2 = LAYOUT.byteOffset(PATH$padding2);
}
