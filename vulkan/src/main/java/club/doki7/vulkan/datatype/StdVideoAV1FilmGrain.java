package club.doki7.vulkan.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
import java.util.List;

import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import club.doki7.ffm.IPointer;
import club.doki7.ffm.NativeLayout;
import club.doki7.ffm.annotation.*;
import club.doki7.ffm.ptr.*;
import club.doki7.vulkan.bitmask.*;
import club.doki7.vulkan.handle.*;
import club.doki7.vulkan.enumtype.*;
import static club.doki7.vulkan.VkConstants.*;

/// Represents a pointer to a {@code StdVideoAV1FilmGrain} structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct StdVideoAV1FilmGrain {
///     StdVideoAV1FilmGrainFlags flags; // @link substring="StdVideoAV1FilmGrainFlags" target="StdVideoAV1FilmGrainFlags" @link substring="flags" target="#flags"
///     uint8_t grain_scaling_minus_8; // @link substring="grain_scaling_minus_8" target="#grain_scaling_minus_8"
///     uint8_t ar_coeff_lag; // @link substring="ar_coeff_lag" target="#ar_coeff_lag"
///     uint8_t ar_coeff_shift_minus_6; // @link substring="ar_coeff_shift_minus_6" target="#ar_coeff_shift_minus_6"
///     uint8_t grain_scale_shift; // @link substring="grain_scale_shift" target="#grain_scale_shift"
///     uint16_t grain_seed; // @link substring="grain_seed" target="#grain_seed"
///     uint8_t film_grain_params_ref_idx; // @link substring="film_grain_params_ref_idx" target="#film_grain_params_ref_idx"
///     uint8_t num_y_points; // @link substring="num_y_points" target="#num_y_points"
///     uint8_t point_y_value; // @link substring="point_y_value" target="#point_y_value"
///     uint8_t point_y_scaling; // @link substring="point_y_scaling" target="#point_y_scaling"
///     uint8_t num_cb_points; // @link substring="num_cb_points" target="#num_cb_points"
///     uint8_t point_cb_value; // @link substring="point_cb_value" target="#point_cb_value"
///     uint8_t point_cb_scaling; // @link substring="point_cb_scaling" target="#point_cb_scaling"
///     uint8_t num_cr_points; // @link substring="num_cr_points" target="#num_cr_points"
///     uint8_t point_cr_value; // @link substring="point_cr_value" target="#point_cr_value"
///     uint8_t point_cr_scaling; // @link substring="point_cr_scaling" target="#point_cr_scaling"
///     int8_t ar_coeffs_y_plus_128; // @link substring="ar_coeffs_y_plus_128" target="#ar_coeffs_y_plus_128"
///     int8_t ar_coeffs_cb_plus_128; // @link substring="ar_coeffs_cb_plus_128" target="#ar_coeffs_cb_plus_128"
///     int8_t ar_coeffs_cr_plus_128; // @link substring="ar_coeffs_cr_plus_128" target="#ar_coeffs_cr_plus_128"
///     uint8_t cb_mult; // @link substring="cb_mult" target="#cb_mult"
///     uint8_t cb_luma_mult; // @link substring="cb_luma_mult" target="#cb_luma_mult"
///     uint16_t cb_offset; // @link substring="cb_offset" target="#cb_offset"
///     uint8_t cr_mult; // @link substring="cr_mult" target="#cr_mult"
///     uint8_t cr_luma_mult; // @link substring="cr_luma_mult" target="#cr_luma_mult"
///     uint16_t cr_offset; // @link substring="cr_offset" target="#cr_offset"
/// } StdVideoAV1FilmGrain;
/// }
///
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
public record StdVideoAV1FilmGrain(@NotNull MemorySegment segment) implements IStdVideoAV1FilmGrain {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link StdVideoAV1FilmGrain}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IStdVideoAV1FilmGrain to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code StdVideoAV1FilmGrain.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IStdVideoAV1FilmGrain {
        public long size() {
            return segment.byteSize() / StdVideoAV1FilmGrain.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull StdVideoAV1FilmGrain at(long index) {
            return new StdVideoAV1FilmGrain(segment.asSlice(index * StdVideoAV1FilmGrain.BYTES, StdVideoAV1FilmGrain.BYTES));
        }

        public void write(long index, @NotNull StdVideoAV1FilmGrain value) {
            MemorySegment s = segment.asSlice(index * StdVideoAV1FilmGrain.BYTES, StdVideoAV1FilmGrain.BYTES);
            s.copyFrom(value.segment);
        }

        /// Assume the {@link Ptr} is capable of holding at least {@code newSize} structures,
        /// create a new view {@link Ptr} that uses the same backing storage as this
        /// {@link Ptr}, but with the new size. Since there is actually no way to really check
        /// whether the new size is valid, while buffer overflow is undefined behavior, this method is
        /// marked as {@link unsafe}.
        ///
        /// This method could be useful when handling data returned from some C API, where the size of
        /// the data is not known in advance.
        ///
        /// If the size of the underlying segment is actually known in advance and correctly set, and
        /// you want to create a shrunk view, you may use {@link #slice(long)} (with validation)
        /// instead.
        @Unsafe
        public @NotNull Ptr reinterpret(long index) {
            return new Ptr(segment.asSlice(index * StdVideoAV1FilmGrain.BYTES, StdVideoAV1FilmGrain.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * StdVideoAV1FilmGrain.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * StdVideoAV1FilmGrain.BYTES,
                (end - start) * StdVideoAV1FilmGrain.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * StdVideoAV1FilmGrain.BYTES));
        }

        public StdVideoAV1FilmGrain[] toArray() {
            StdVideoAV1FilmGrain[] ret = new StdVideoAV1FilmGrain[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }
    }

    public static StdVideoAV1FilmGrain allocate(Arena arena) {
        return new StdVideoAV1FilmGrain(arena.allocate(LAYOUT));
    }

    public static StdVideoAV1FilmGrain.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new StdVideoAV1FilmGrain.Ptr(segment);
    }

    public static StdVideoAV1FilmGrain clone(Arena arena, StdVideoAV1FilmGrain src) {
        StdVideoAV1FilmGrain ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @NotNull StdVideoAV1FilmGrainFlags flags() {
        return new StdVideoAV1FilmGrainFlags(segment.asSlice(OFFSET$flags, LAYOUT$flags));
    }

    public void flags(@NotNull StdVideoAV1FilmGrainFlags value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$flags, SIZE$flags);
    }

    public @unsigned byte grain_scaling_minus_8() {
        return segment.get(LAYOUT$grain_scaling_minus_8, OFFSET$grain_scaling_minus_8);
    }

    public void grain_scaling_minus_8(@unsigned byte value) {
        segment.set(LAYOUT$grain_scaling_minus_8, OFFSET$grain_scaling_minus_8, value);
    }

    public @unsigned byte ar_coeff_lag() {
        return segment.get(LAYOUT$ar_coeff_lag, OFFSET$ar_coeff_lag);
    }

    public void ar_coeff_lag(@unsigned byte value) {
        segment.set(LAYOUT$ar_coeff_lag, OFFSET$ar_coeff_lag, value);
    }

    public @unsigned byte ar_coeff_shift_minus_6() {
        return segment.get(LAYOUT$ar_coeff_shift_minus_6, OFFSET$ar_coeff_shift_minus_6);
    }

    public void ar_coeff_shift_minus_6(@unsigned byte value) {
        segment.set(LAYOUT$ar_coeff_shift_minus_6, OFFSET$ar_coeff_shift_minus_6, value);
    }

    public @unsigned byte grain_scale_shift() {
        return segment.get(LAYOUT$grain_scale_shift, OFFSET$grain_scale_shift);
    }

    public void grain_scale_shift(@unsigned byte value) {
        segment.set(LAYOUT$grain_scale_shift, OFFSET$grain_scale_shift, value);
    }

    public @unsigned short grain_seed() {
        return segment.get(LAYOUT$grain_seed, OFFSET$grain_seed);
    }

    public void grain_seed(@unsigned short value) {
        segment.set(LAYOUT$grain_seed, OFFSET$grain_seed, value);
    }

    public @unsigned byte film_grain_params_ref_idx() {
        return segment.get(LAYOUT$film_grain_params_ref_idx, OFFSET$film_grain_params_ref_idx);
    }

    public void film_grain_params_ref_idx(@unsigned byte value) {
        segment.set(LAYOUT$film_grain_params_ref_idx, OFFSET$film_grain_params_ref_idx, value);
    }

    public @unsigned byte num_y_points() {
        return segment.get(LAYOUT$num_y_points, OFFSET$num_y_points);
    }

    public void num_y_points(@unsigned byte value) {
        segment.set(LAYOUT$num_y_points, OFFSET$num_y_points, value);
    }

    public @unsigned byte point_y_value() {
        return segment.get(LAYOUT$point_y_value, OFFSET$point_y_value);
    }

    public void point_y_value(@unsigned byte value) {
        segment.set(LAYOUT$point_y_value, OFFSET$point_y_value, value);
    }

    public @unsigned byte point_y_scaling() {
        return segment.get(LAYOUT$point_y_scaling, OFFSET$point_y_scaling);
    }

    public void point_y_scaling(@unsigned byte value) {
        segment.set(LAYOUT$point_y_scaling, OFFSET$point_y_scaling, value);
    }

    public @unsigned byte num_cb_points() {
        return segment.get(LAYOUT$num_cb_points, OFFSET$num_cb_points);
    }

    public void num_cb_points(@unsigned byte value) {
        segment.set(LAYOUT$num_cb_points, OFFSET$num_cb_points, value);
    }

    public @unsigned byte point_cb_value() {
        return segment.get(LAYOUT$point_cb_value, OFFSET$point_cb_value);
    }

    public void point_cb_value(@unsigned byte value) {
        segment.set(LAYOUT$point_cb_value, OFFSET$point_cb_value, value);
    }

    public @unsigned byte point_cb_scaling() {
        return segment.get(LAYOUT$point_cb_scaling, OFFSET$point_cb_scaling);
    }

    public void point_cb_scaling(@unsigned byte value) {
        segment.set(LAYOUT$point_cb_scaling, OFFSET$point_cb_scaling, value);
    }

    public @unsigned byte num_cr_points() {
        return segment.get(LAYOUT$num_cr_points, OFFSET$num_cr_points);
    }

    public void num_cr_points(@unsigned byte value) {
        segment.set(LAYOUT$num_cr_points, OFFSET$num_cr_points, value);
    }

    public @unsigned byte point_cr_value() {
        return segment.get(LAYOUT$point_cr_value, OFFSET$point_cr_value);
    }

    public void point_cr_value(@unsigned byte value) {
        segment.set(LAYOUT$point_cr_value, OFFSET$point_cr_value, value);
    }

    public @unsigned byte point_cr_scaling() {
        return segment.get(LAYOUT$point_cr_scaling, OFFSET$point_cr_scaling);
    }

    public void point_cr_scaling(@unsigned byte value) {
        segment.set(LAYOUT$point_cr_scaling, OFFSET$point_cr_scaling, value);
    }

    public byte ar_coeffs_y_plus_128() {
        return segment.get(LAYOUT$ar_coeffs_y_plus_128, OFFSET$ar_coeffs_y_plus_128);
    }

    public void ar_coeffs_y_plus_128(byte value) {
        segment.set(LAYOUT$ar_coeffs_y_plus_128, OFFSET$ar_coeffs_y_plus_128, value);
    }

    public byte ar_coeffs_cb_plus_128() {
        return segment.get(LAYOUT$ar_coeffs_cb_plus_128, OFFSET$ar_coeffs_cb_plus_128);
    }

    public void ar_coeffs_cb_plus_128(byte value) {
        segment.set(LAYOUT$ar_coeffs_cb_plus_128, OFFSET$ar_coeffs_cb_plus_128, value);
    }

    public byte ar_coeffs_cr_plus_128() {
        return segment.get(LAYOUT$ar_coeffs_cr_plus_128, OFFSET$ar_coeffs_cr_plus_128);
    }

    public void ar_coeffs_cr_plus_128(byte value) {
        segment.set(LAYOUT$ar_coeffs_cr_plus_128, OFFSET$ar_coeffs_cr_plus_128, value);
    }

    public @unsigned byte cb_mult() {
        return segment.get(LAYOUT$cb_mult, OFFSET$cb_mult);
    }

    public void cb_mult(@unsigned byte value) {
        segment.set(LAYOUT$cb_mult, OFFSET$cb_mult, value);
    }

    public @unsigned byte cb_luma_mult() {
        return segment.get(LAYOUT$cb_luma_mult, OFFSET$cb_luma_mult);
    }

    public void cb_luma_mult(@unsigned byte value) {
        segment.set(LAYOUT$cb_luma_mult, OFFSET$cb_luma_mult, value);
    }

    public @unsigned short cb_offset() {
        return segment.get(LAYOUT$cb_offset, OFFSET$cb_offset);
    }

    public void cb_offset(@unsigned short value) {
        segment.set(LAYOUT$cb_offset, OFFSET$cb_offset, value);
    }

    public @unsigned byte cr_mult() {
        return segment.get(LAYOUT$cr_mult, OFFSET$cr_mult);
    }

    public void cr_mult(@unsigned byte value) {
        segment.set(LAYOUT$cr_mult, OFFSET$cr_mult, value);
    }

    public @unsigned byte cr_luma_mult() {
        return segment.get(LAYOUT$cr_luma_mult, OFFSET$cr_luma_mult);
    }

    public void cr_luma_mult(@unsigned byte value) {
        segment.set(LAYOUT$cr_luma_mult, OFFSET$cr_luma_mult, value);
    }

    public @unsigned short cr_offset() {
        return segment.get(LAYOUT$cr_offset, OFFSET$cr_offset);
    }

    public void cr_offset(@unsigned short value) {
        segment.set(LAYOUT$cr_offset, OFFSET$cr_offset, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        StdVideoAV1FilmGrainFlags.LAYOUT.withName("flags"),
        ValueLayout.JAVA_BYTE.withName("grain_scaling_minus_8"),
        ValueLayout.JAVA_BYTE.withName("ar_coeff_lag"),
        ValueLayout.JAVA_BYTE.withName("ar_coeff_shift_minus_6"),
        ValueLayout.JAVA_BYTE.withName("grain_scale_shift"),
        ValueLayout.JAVA_SHORT.withName("grain_seed"),
        ValueLayout.JAVA_BYTE.withName("film_grain_params_ref_idx"),
        ValueLayout.JAVA_BYTE.withName("num_y_points"),
        ValueLayout.JAVA_BYTE.withName("point_y_value"),
        ValueLayout.JAVA_BYTE.withName("point_y_scaling"),
        ValueLayout.JAVA_BYTE.withName("num_cb_points"),
        ValueLayout.JAVA_BYTE.withName("point_cb_value"),
        ValueLayout.JAVA_BYTE.withName("point_cb_scaling"),
        ValueLayout.JAVA_BYTE.withName("num_cr_points"),
        ValueLayout.JAVA_BYTE.withName("point_cr_value"),
        ValueLayout.JAVA_BYTE.withName("point_cr_scaling"),
        ValueLayout.JAVA_BYTE.withName("ar_coeffs_y_plus_128"),
        ValueLayout.JAVA_BYTE.withName("ar_coeffs_cb_plus_128"),
        ValueLayout.JAVA_BYTE.withName("ar_coeffs_cr_plus_128"),
        ValueLayout.JAVA_BYTE.withName("cb_mult"),
        ValueLayout.JAVA_BYTE.withName("cb_luma_mult"),
        ValueLayout.JAVA_SHORT.withName("cb_offset"),
        ValueLayout.JAVA_BYTE.withName("cr_mult"),
        ValueLayout.JAVA_BYTE.withName("cr_luma_mult"),
        ValueLayout.JAVA_SHORT.withName("cr_offset")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$flags = PathElement.groupElement("flags");
    public static final PathElement PATH$grain_scaling_minus_8 = PathElement.groupElement("grain_scaling_minus_8");
    public static final PathElement PATH$ar_coeff_lag = PathElement.groupElement("ar_coeff_lag");
    public static final PathElement PATH$ar_coeff_shift_minus_6 = PathElement.groupElement("ar_coeff_shift_minus_6");
    public static final PathElement PATH$grain_scale_shift = PathElement.groupElement("grain_scale_shift");
    public static final PathElement PATH$grain_seed = PathElement.groupElement("grain_seed");
    public static final PathElement PATH$film_grain_params_ref_idx = PathElement.groupElement("film_grain_params_ref_idx");
    public static final PathElement PATH$num_y_points = PathElement.groupElement("num_y_points");
    public static final PathElement PATH$point_y_value = PathElement.groupElement("point_y_value");
    public static final PathElement PATH$point_y_scaling = PathElement.groupElement("point_y_scaling");
    public static final PathElement PATH$num_cb_points = PathElement.groupElement("num_cb_points");
    public static final PathElement PATH$point_cb_value = PathElement.groupElement("point_cb_value");
    public static final PathElement PATH$point_cb_scaling = PathElement.groupElement("point_cb_scaling");
    public static final PathElement PATH$num_cr_points = PathElement.groupElement("num_cr_points");
    public static final PathElement PATH$point_cr_value = PathElement.groupElement("point_cr_value");
    public static final PathElement PATH$point_cr_scaling = PathElement.groupElement("point_cr_scaling");
    public static final PathElement PATH$ar_coeffs_y_plus_128 = PathElement.groupElement("ar_coeffs_y_plus_128");
    public static final PathElement PATH$ar_coeffs_cb_plus_128 = PathElement.groupElement("ar_coeffs_cb_plus_128");
    public static final PathElement PATH$ar_coeffs_cr_plus_128 = PathElement.groupElement("ar_coeffs_cr_plus_128");
    public static final PathElement PATH$cb_mult = PathElement.groupElement("cb_mult");
    public static final PathElement PATH$cb_luma_mult = PathElement.groupElement("cb_luma_mult");
    public static final PathElement PATH$cb_offset = PathElement.groupElement("cb_offset");
    public static final PathElement PATH$cr_mult = PathElement.groupElement("cr_mult");
    public static final PathElement PATH$cr_luma_mult = PathElement.groupElement("cr_luma_mult");
    public static final PathElement PATH$cr_offset = PathElement.groupElement("cr_offset");

    public static final StructLayout LAYOUT$flags = (StructLayout) LAYOUT.select(PATH$flags);
    public static final OfByte LAYOUT$grain_scaling_minus_8 = (OfByte) LAYOUT.select(PATH$grain_scaling_minus_8);
    public static final OfByte LAYOUT$ar_coeff_lag = (OfByte) LAYOUT.select(PATH$ar_coeff_lag);
    public static final OfByte LAYOUT$ar_coeff_shift_minus_6 = (OfByte) LAYOUT.select(PATH$ar_coeff_shift_minus_6);
    public static final OfByte LAYOUT$grain_scale_shift = (OfByte) LAYOUT.select(PATH$grain_scale_shift);
    public static final OfShort LAYOUT$grain_seed = (OfShort) LAYOUT.select(PATH$grain_seed);
    public static final OfByte LAYOUT$film_grain_params_ref_idx = (OfByte) LAYOUT.select(PATH$film_grain_params_ref_idx);
    public static final OfByte LAYOUT$num_y_points = (OfByte) LAYOUT.select(PATH$num_y_points);
    public static final OfByte LAYOUT$point_y_value = (OfByte) LAYOUT.select(PATH$point_y_value);
    public static final OfByte LAYOUT$point_y_scaling = (OfByte) LAYOUT.select(PATH$point_y_scaling);
    public static final OfByte LAYOUT$num_cb_points = (OfByte) LAYOUT.select(PATH$num_cb_points);
    public static final OfByte LAYOUT$point_cb_value = (OfByte) LAYOUT.select(PATH$point_cb_value);
    public static final OfByte LAYOUT$point_cb_scaling = (OfByte) LAYOUT.select(PATH$point_cb_scaling);
    public static final OfByte LAYOUT$num_cr_points = (OfByte) LAYOUT.select(PATH$num_cr_points);
    public static final OfByte LAYOUT$point_cr_value = (OfByte) LAYOUT.select(PATH$point_cr_value);
    public static final OfByte LAYOUT$point_cr_scaling = (OfByte) LAYOUT.select(PATH$point_cr_scaling);
    public static final OfByte LAYOUT$ar_coeffs_y_plus_128 = (OfByte) LAYOUT.select(PATH$ar_coeffs_y_plus_128);
    public static final OfByte LAYOUT$ar_coeffs_cb_plus_128 = (OfByte) LAYOUT.select(PATH$ar_coeffs_cb_plus_128);
    public static final OfByte LAYOUT$ar_coeffs_cr_plus_128 = (OfByte) LAYOUT.select(PATH$ar_coeffs_cr_plus_128);
    public static final OfByte LAYOUT$cb_mult = (OfByte) LAYOUT.select(PATH$cb_mult);
    public static final OfByte LAYOUT$cb_luma_mult = (OfByte) LAYOUT.select(PATH$cb_luma_mult);
    public static final OfShort LAYOUT$cb_offset = (OfShort) LAYOUT.select(PATH$cb_offset);
    public static final OfByte LAYOUT$cr_mult = (OfByte) LAYOUT.select(PATH$cr_mult);
    public static final OfByte LAYOUT$cr_luma_mult = (OfByte) LAYOUT.select(PATH$cr_luma_mult);
    public static final OfShort LAYOUT$cr_offset = (OfShort) LAYOUT.select(PATH$cr_offset);

    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$grain_scaling_minus_8 = LAYOUT$grain_scaling_minus_8.byteSize();
    public static final long SIZE$ar_coeff_lag = LAYOUT$ar_coeff_lag.byteSize();
    public static final long SIZE$ar_coeff_shift_minus_6 = LAYOUT$ar_coeff_shift_minus_6.byteSize();
    public static final long SIZE$grain_scale_shift = LAYOUT$grain_scale_shift.byteSize();
    public static final long SIZE$grain_seed = LAYOUT$grain_seed.byteSize();
    public static final long SIZE$film_grain_params_ref_idx = LAYOUT$film_grain_params_ref_idx.byteSize();
    public static final long SIZE$num_y_points = LAYOUT$num_y_points.byteSize();
    public static final long SIZE$point_y_value = LAYOUT$point_y_value.byteSize();
    public static final long SIZE$point_y_scaling = LAYOUT$point_y_scaling.byteSize();
    public static final long SIZE$num_cb_points = LAYOUT$num_cb_points.byteSize();
    public static final long SIZE$point_cb_value = LAYOUT$point_cb_value.byteSize();
    public static final long SIZE$point_cb_scaling = LAYOUT$point_cb_scaling.byteSize();
    public static final long SIZE$num_cr_points = LAYOUT$num_cr_points.byteSize();
    public static final long SIZE$point_cr_value = LAYOUT$point_cr_value.byteSize();
    public static final long SIZE$point_cr_scaling = LAYOUT$point_cr_scaling.byteSize();
    public static final long SIZE$ar_coeffs_y_plus_128 = LAYOUT$ar_coeffs_y_plus_128.byteSize();
    public static final long SIZE$ar_coeffs_cb_plus_128 = LAYOUT$ar_coeffs_cb_plus_128.byteSize();
    public static final long SIZE$ar_coeffs_cr_plus_128 = LAYOUT$ar_coeffs_cr_plus_128.byteSize();
    public static final long SIZE$cb_mult = LAYOUT$cb_mult.byteSize();
    public static final long SIZE$cb_luma_mult = LAYOUT$cb_luma_mult.byteSize();
    public static final long SIZE$cb_offset = LAYOUT$cb_offset.byteSize();
    public static final long SIZE$cr_mult = LAYOUT$cr_mult.byteSize();
    public static final long SIZE$cr_luma_mult = LAYOUT$cr_luma_mult.byteSize();
    public static final long SIZE$cr_offset = LAYOUT$cr_offset.byteSize();

    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$grain_scaling_minus_8 = LAYOUT.byteOffset(PATH$grain_scaling_minus_8);
    public static final long OFFSET$ar_coeff_lag = LAYOUT.byteOffset(PATH$ar_coeff_lag);
    public static final long OFFSET$ar_coeff_shift_minus_6 = LAYOUT.byteOffset(PATH$ar_coeff_shift_minus_6);
    public static final long OFFSET$grain_scale_shift = LAYOUT.byteOffset(PATH$grain_scale_shift);
    public static final long OFFSET$grain_seed = LAYOUT.byteOffset(PATH$grain_seed);
    public static final long OFFSET$film_grain_params_ref_idx = LAYOUT.byteOffset(PATH$film_grain_params_ref_idx);
    public static final long OFFSET$num_y_points = LAYOUT.byteOffset(PATH$num_y_points);
    public static final long OFFSET$point_y_value = LAYOUT.byteOffset(PATH$point_y_value);
    public static final long OFFSET$point_y_scaling = LAYOUT.byteOffset(PATH$point_y_scaling);
    public static final long OFFSET$num_cb_points = LAYOUT.byteOffset(PATH$num_cb_points);
    public static final long OFFSET$point_cb_value = LAYOUT.byteOffset(PATH$point_cb_value);
    public static final long OFFSET$point_cb_scaling = LAYOUT.byteOffset(PATH$point_cb_scaling);
    public static final long OFFSET$num_cr_points = LAYOUT.byteOffset(PATH$num_cr_points);
    public static final long OFFSET$point_cr_value = LAYOUT.byteOffset(PATH$point_cr_value);
    public static final long OFFSET$point_cr_scaling = LAYOUT.byteOffset(PATH$point_cr_scaling);
    public static final long OFFSET$ar_coeffs_y_plus_128 = LAYOUT.byteOffset(PATH$ar_coeffs_y_plus_128);
    public static final long OFFSET$ar_coeffs_cb_plus_128 = LAYOUT.byteOffset(PATH$ar_coeffs_cb_plus_128);
    public static final long OFFSET$ar_coeffs_cr_plus_128 = LAYOUT.byteOffset(PATH$ar_coeffs_cr_plus_128);
    public static final long OFFSET$cb_mult = LAYOUT.byteOffset(PATH$cb_mult);
    public static final long OFFSET$cb_luma_mult = LAYOUT.byteOffset(PATH$cb_luma_mult);
    public static final long OFFSET$cb_offset = LAYOUT.byteOffset(PATH$cb_offset);
    public static final long OFFSET$cr_mult = LAYOUT.byteOffset(PATH$cr_mult);
    public static final long OFFSET$cr_luma_mult = LAYOUT.byteOffset(PATH$cr_luma_mult);
    public static final long OFFSET$cr_offset = LAYOUT.byteOffset(PATH$cr_offset);
}
