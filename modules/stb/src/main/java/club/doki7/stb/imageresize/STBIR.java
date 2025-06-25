package club.doki7.stb.imageresize;

import java.lang.foreign.*;
import java.lang.invoke.MethodHandle;
import java.util.Objects;

import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import club.doki7.ffm.NativeLayout;
import club.doki7.ffm.RawFunctionLoader;
import club.doki7.ffm.annotation.*;
import club.doki7.ffm.ptr.*;
import club.doki7.stb.imageresize.datatype.*;
import club.doki7.stb.imageresize.enumtype.*;
import club.doki7.stb.imageresize.handle.*;

public final class STBIR {
    public STBIR(RawFunctionLoader loader) {
        SEGMENT$stbir_build_samplers = loader.apply("stbir_build_samplers");
        HANDLE$stbir_build_samplers = RawFunctionLoader.link(SEGMENT$stbir_build_samplers, Descriptors.DESCRIPTOR$stbir_build_samplers);
        SEGMENT$stbir_build_samplers_with_splits = loader.apply("stbir_build_samplers_with_splits");
        HANDLE$stbir_build_samplers_with_splits = RawFunctionLoader.link(SEGMENT$stbir_build_samplers_with_splits, Descriptors.DESCRIPTOR$stbir_build_samplers_with_splits);
        SEGMENT$stbir_free_samplers = loader.apply("stbir_free_samplers");
        HANDLE$stbir_free_samplers = RawFunctionLoader.link(SEGMENT$stbir_free_samplers, Descriptors.DESCRIPTOR$stbir_free_samplers);
        SEGMENT$stbir_resize = loader.apply("stbir_resize");
        HANDLE$stbir_resize = RawFunctionLoader.link(SEGMENT$stbir_resize, Descriptors.DESCRIPTOR$stbir_resize);
        SEGMENT$stbir_resize_build_profile_info = loader.apply("stbir_resize_build_profile_info");
        HANDLE$stbir_resize_build_profile_info = RawFunctionLoader.link(SEGMENT$stbir_resize_build_profile_info, Descriptors.DESCRIPTOR$stbir_resize_build_profile_info);
        SEGMENT$stbir_resize_extended = loader.apply("stbir_resize_extended");
        HANDLE$stbir_resize_extended = RawFunctionLoader.link(SEGMENT$stbir_resize_extended, Descriptors.DESCRIPTOR$stbir_resize_extended);
        SEGMENT$stbir_resize_extended_profile_info = loader.apply("stbir_resize_extended_profile_info");
        HANDLE$stbir_resize_extended_profile_info = RawFunctionLoader.link(SEGMENT$stbir_resize_extended_profile_info, Descriptors.DESCRIPTOR$stbir_resize_extended_profile_info);
        SEGMENT$stbir_resize_extended_split = loader.apply("stbir_resize_extended_split");
        HANDLE$stbir_resize_extended_split = RawFunctionLoader.link(SEGMENT$stbir_resize_extended_split, Descriptors.DESCRIPTOR$stbir_resize_extended_split);
        SEGMENT$stbir_resize_float_linear = loader.apply("stbir_resize_float_linear");
        HANDLE$stbir_resize_float_linear = RawFunctionLoader.link(SEGMENT$stbir_resize_float_linear, Descriptors.DESCRIPTOR$stbir_resize_float_linear);
        SEGMENT$stbir_resize_init = loader.apply("stbir_resize_init");
        HANDLE$stbir_resize_init = RawFunctionLoader.link(SEGMENT$stbir_resize_init, Descriptors.DESCRIPTOR$stbir_resize_init);
        SEGMENT$stbir_resize_split_profile_info = loader.apply("stbir_resize_split_profile_info");
        HANDLE$stbir_resize_split_profile_info = RawFunctionLoader.link(SEGMENT$stbir_resize_split_profile_info, Descriptors.DESCRIPTOR$stbir_resize_split_profile_info);
        SEGMENT$stbir_resize_uint8_linear = loader.apply("stbir_resize_uint8_linear");
        HANDLE$stbir_resize_uint8_linear = RawFunctionLoader.link(SEGMENT$stbir_resize_uint8_linear, Descriptors.DESCRIPTOR$stbir_resize_uint8_linear);
        SEGMENT$stbir_resize_uint8_srgb = loader.apply("stbir_resize_uint8_srgb");
        HANDLE$stbir_resize_uint8_srgb = RawFunctionLoader.link(SEGMENT$stbir_resize_uint8_srgb, Descriptors.DESCRIPTOR$stbir_resize_uint8_srgb);
        SEGMENT$stbir_set_buffer_ptrs = loader.apply("stbir_set_buffer_ptrs");
        HANDLE$stbir_set_buffer_ptrs = RawFunctionLoader.link(SEGMENT$stbir_set_buffer_ptrs, Descriptors.DESCRIPTOR$stbir_set_buffer_ptrs);
        SEGMENT$stbir_set_datatypes = loader.apply("stbir_set_datatypes");
        HANDLE$stbir_set_datatypes = RawFunctionLoader.link(SEGMENT$stbir_set_datatypes, Descriptors.DESCRIPTOR$stbir_set_datatypes);
        SEGMENT$stbir_set_edgemodes = loader.apply("stbir_set_edgemodes");
        HANDLE$stbir_set_edgemodes = RawFunctionLoader.link(SEGMENT$stbir_set_edgemodes, Descriptors.DESCRIPTOR$stbir_set_edgemodes);
        SEGMENT$stbir_set_filter_callbacks = loader.apply("stbir_set_filter_callbacks");
        HANDLE$stbir_set_filter_callbacks = RawFunctionLoader.link(SEGMENT$stbir_set_filter_callbacks, Descriptors.DESCRIPTOR$stbir_set_filter_callbacks);
        SEGMENT$stbir_set_filters = loader.apply("stbir_set_filters");
        HANDLE$stbir_set_filters = RawFunctionLoader.link(SEGMENT$stbir_set_filters, Descriptors.DESCRIPTOR$stbir_set_filters);
        SEGMENT$stbir_set_input_subrect = loader.apply("stbir_set_input_subrect");
        HANDLE$stbir_set_input_subrect = RawFunctionLoader.link(SEGMENT$stbir_set_input_subrect, Descriptors.DESCRIPTOR$stbir_set_input_subrect);
        SEGMENT$stbir_set_non_pm_alpha_speed_over_quality = loader.apply("stbir_set_non_pm_alpha_speed_over_quality");
        HANDLE$stbir_set_non_pm_alpha_speed_over_quality = RawFunctionLoader.link(SEGMENT$stbir_set_non_pm_alpha_speed_over_quality, Descriptors.DESCRIPTOR$stbir_set_non_pm_alpha_speed_over_quality);
        SEGMENT$stbir_set_output_pixel_subrect = loader.apply("stbir_set_output_pixel_subrect");
        HANDLE$stbir_set_output_pixel_subrect = RawFunctionLoader.link(SEGMENT$stbir_set_output_pixel_subrect, Descriptors.DESCRIPTOR$stbir_set_output_pixel_subrect);
        SEGMENT$stbir_set_pixel_callbacks = loader.apply("stbir_set_pixel_callbacks");
        HANDLE$stbir_set_pixel_callbacks = RawFunctionLoader.link(SEGMENT$stbir_set_pixel_callbacks, Descriptors.DESCRIPTOR$stbir_set_pixel_callbacks);
        SEGMENT$stbir_set_pixel_layouts = loader.apply("stbir_set_pixel_layouts");
        HANDLE$stbir_set_pixel_layouts = RawFunctionLoader.link(SEGMENT$stbir_set_pixel_layouts, Descriptors.DESCRIPTOR$stbir_set_pixel_layouts);
        SEGMENT$stbir_set_pixel_subrect = loader.apply("stbir_set_pixel_subrect");
        HANDLE$stbir_set_pixel_subrect = RawFunctionLoader.link(SEGMENT$stbir_set_pixel_subrect, Descriptors.DESCRIPTOR$stbir_set_pixel_subrect);
        SEGMENT$stbir_set_user_data = loader.apply("stbir_set_user_data");
        HANDLE$stbir_set_user_data = RawFunctionLoader.link(SEGMENT$stbir_set_user_data, Descriptors.DESCRIPTOR$stbir_set_user_data);
    }

    // region command wrappers

    public int buildSamplers(
        @Nullable @Pointer ISTBIR_RESIZE resize
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$stbir_build_samplers);
        try {
            return (int) hFunction.invokeExact(
                (MemorySegment) (resize != null ? resize.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public int buildSamplersWithSplits(
        @Nullable @Pointer ISTBIR_RESIZE resize,
        int trySplits
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$stbir_build_samplers_with_splits);
        try {
            return (int) hFunction.invokeExact(
                (MemorySegment) (resize != null ? resize.segment() : MemorySegment.NULL),
                trySplits
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void freeSamplers(
        @Nullable @Pointer ISTBIR_RESIZE resize
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$stbir_free_samplers);
        try {
            hFunction.invokeExact(
                (MemorySegment) (resize != null ? resize.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public @Pointer(comment="void*") @NotNull MemorySegment resize(
        @Pointer(comment="void*") @NotNull MemorySegment inputPixels,
        int inputW,
        int inputH,
        int inputStrideInBytes,
        @Pointer(comment="void*") @NotNull MemorySegment outputPixels,
        int outputW,
        int outputH,
        int outputStrideInBytes,
        @EnumType(STBIR_PixelLayout.class) int pixelLayout,
        @EnumType(STBIR_Datatype.class) int dataType,
        @EnumType(STBIR_Edge.class) int edge,
        @EnumType(STBIR_Filter.class) int filter
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$stbir_resize);
        try {
            return (MemorySegment) hFunction.invokeExact(
                inputPixels,
                inputW,
                inputH,
                inputStrideInBytes,
                outputPixels,
                outputW,
                outputH,
                outputStrideInBytes,
                pixelLayout,
                dataType,
                edge,
                filter
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void resizeBuildProfileInfo(
        @Nullable @Pointer ISTBIR_PROFILEINFO outInfo,
        @Nullable @Pointer ISTBIR_RESIZE resize
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$stbir_resize_build_profile_info);
        try {
            hFunction.invokeExact(
                (MemorySegment) (outInfo != null ? outInfo.segment() : MemorySegment.NULL),
                (MemorySegment) (resize != null ? resize.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public int resizeExtended(
        @Nullable @Pointer ISTBIR_RESIZE resize
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$stbir_resize_extended);
        try {
            return (int) hFunction.invokeExact(
                (MemorySegment) (resize != null ? resize.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void resizeExtendedProfileInfo(
        @Nullable @Pointer ISTBIR_PROFILEINFO outInfo,
        @Nullable @Pointer ISTBIR_RESIZE resize
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$stbir_resize_extended_profile_info);
        try {
            hFunction.invokeExact(
                (MemorySegment) (outInfo != null ? outInfo.segment() : MemorySegment.NULL),
                (MemorySegment) (resize != null ? resize.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public int resizeExtendedSplit(
        @Nullable @Pointer ISTBIR_RESIZE resize,
        int splitStart,
        int splitCount
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$stbir_resize_extended_split);
        try {
            return (int) hFunction.invokeExact(
                (MemorySegment) (resize != null ? resize.segment() : MemorySegment.NULL),
                splitStart,
                splitCount
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public FloatPtr resizeFloatLinear(
        @Nullable FloatPtr inputPixels,
        int inputW,
        int inputH,
        int inputStrideInBytes,
        @Nullable FloatPtr outputPixels,
        int outputW,
        int outputH,
        int outputStrideInBytes,
        @EnumType(STBIR_PixelLayout.class) int pixelType
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$stbir_resize_float_linear);
        try {
            MemorySegment s = (MemorySegment) hFunction.invokeExact(
                (MemorySegment) (inputPixels != null ? inputPixels.segment() : MemorySegment.NULL),
                inputW,
                inputH,
                inputStrideInBytes,
                (MemorySegment) (outputPixels != null ? outputPixels.segment() : MemorySegment.NULL),
                outputW,
                outputH,
                outputStrideInBytes,
                pixelType
            );
            return s.equals(MemorySegment.NULL) ? null : new FloatPtr(s);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void resizeInit(
        @Nullable @Pointer ISTBIR_RESIZE resize,
        @Pointer(comment="void*") @NotNull MemorySegment inputPixels,
        int inputW,
        int inputH,
        int inputStrideInBytes,
        @Pointer(comment="void*") @NotNull MemorySegment outputPixels,
        int outputW,
        int outputH,
        int outputStrideInBytes,
        @EnumType(STBIR_PixelLayout.class) int pixelLayout,
        @EnumType(STBIR_Datatype.class) int dataType
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$stbir_resize_init);
        try {
            hFunction.invokeExact(
                (MemorySegment) (resize != null ? resize.segment() : MemorySegment.NULL),
                inputPixels,
                inputW,
                inputH,
                inputStrideInBytes,
                outputPixels,
                outputW,
                outputH,
                outputStrideInBytes,
                pixelLayout,
                dataType
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void resizeSplitProfileInfo(
        @Nullable @Pointer ISTBIR_PROFILEINFO outInfo,
        @Nullable @Pointer ISTBIR_RESIZE resize,
        int splitStart,
        int splitNum
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$stbir_resize_split_profile_info);
        try {
            hFunction.invokeExact(
                (MemorySegment) (outInfo != null ? outInfo.segment() : MemorySegment.NULL),
                (MemorySegment) (resize != null ? resize.segment() : MemorySegment.NULL),
                splitStart,
                splitNum
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public BytePtr resizeUint8Linear(
        @Nullable BytePtr inputPixels,
        int inputW,
        int inputH,
        int inputStrideInBytes,
        @Nullable BytePtr outputPixels,
        int outputW,
        int outputH,
        int outputStrideInBytes,
        @EnumType(STBIR_PixelLayout.class) int pixelType
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$stbir_resize_uint8_linear);
        try {
            MemorySegment s = (MemorySegment) hFunction.invokeExact(
                (MemorySegment) (inputPixels != null ? inputPixels.segment() : MemorySegment.NULL),
                inputW,
                inputH,
                inputStrideInBytes,
                (MemorySegment) (outputPixels != null ? outputPixels.segment() : MemorySegment.NULL),
                outputW,
                outputH,
                outputStrideInBytes,
                pixelType
            );
            return s.equals(MemorySegment.NULL) ? null : new BytePtr(s);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public BytePtr resizeUint8Srgb(
        @Nullable BytePtr inputPixels,
        int inputW,
        int inputH,
        int inputStrideInBytes,
        @Nullable BytePtr outputPixels,
        int outputW,
        int outputH,
        int outputStrideInBytes,
        @EnumType(STBIR_PixelLayout.class) int pixelType
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$stbir_resize_uint8_srgb);
        try {
            MemorySegment s = (MemorySegment) hFunction.invokeExact(
                (MemorySegment) (inputPixels != null ? inputPixels.segment() : MemorySegment.NULL),
                inputW,
                inputH,
                inputStrideInBytes,
                (MemorySegment) (outputPixels != null ? outputPixels.segment() : MemorySegment.NULL),
                outputW,
                outputH,
                outputStrideInBytes,
                pixelType
            );
            return s.equals(MemorySegment.NULL) ? null : new BytePtr(s);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void setBufferPtrs(
        @Nullable @Pointer ISTBIR_RESIZE resize,
        @Pointer(comment="void*") @NotNull MemorySegment inputPixels,
        int inputStrideInBytes,
        @Pointer(comment="void*") @NotNull MemorySegment outputPixels,
        int outputStrideInBytes
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$stbir_set_buffer_ptrs);
        try {
            hFunction.invokeExact(
                (MemorySegment) (resize != null ? resize.segment() : MemorySegment.NULL),
                inputPixels,
                inputStrideInBytes,
                outputPixels,
                outputStrideInBytes
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void setDatatypes(
        @Nullable @Pointer ISTBIR_RESIZE resize,
        @EnumType(STBIR_Datatype.class) int inputType,
        @EnumType(STBIR_Datatype.class) int outputType
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$stbir_set_datatypes);
        try {
            hFunction.invokeExact(
                (MemorySegment) (resize != null ? resize.segment() : MemorySegment.NULL),
                inputType,
                outputType
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public int setEdgemodes(
        @Nullable @Pointer ISTBIR_RESIZE resize,
        @EnumType(STBIR_Edge.class) int horizontalEdge,
        @EnumType(STBIR_Edge.class) int verticalEdge
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$stbir_set_edgemodes);
        try {
            return (int) hFunction.invokeExact(
                (MemorySegment) (resize != null ? resize.segment() : MemorySegment.NULL),
                horizontalEdge,
                verticalEdge
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public int setFilterCallbacks(
        @Nullable @Pointer ISTBIR_RESIZE resize,
        @Pointer(comment="stbir__kernel_callback*") @NotNull MemorySegment horizontalFilter,
        @Pointer(comment="stbir__support_callback*") @NotNull MemorySegment horizontalSupport,
        @Pointer(comment="stbir__kernel_callback*") @NotNull MemorySegment verticalFilter,
        @Pointer(comment="stbir__support_callback*") @NotNull MemorySegment verticalSupport
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$stbir_set_filter_callbacks);
        try {
            return (int) hFunction.invokeExact(
                (MemorySegment) (resize != null ? resize.segment() : MemorySegment.NULL),
                horizontalFilter,
                horizontalSupport,
                verticalFilter,
                verticalSupport
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public int setFilters(
        @Nullable @Pointer ISTBIR_RESIZE resize,
        @EnumType(STBIR_Filter.class) int horizontalFilter,
        @EnumType(STBIR_Filter.class) int verticalFilter
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$stbir_set_filters);
        try {
            return (int) hFunction.invokeExact(
                (MemorySegment) (resize != null ? resize.segment() : MemorySegment.NULL),
                horizontalFilter,
                verticalFilter
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public int setInputSubrect(
        @Nullable @Pointer ISTBIR_RESIZE resize,
        double s0,
        double t0,
        double s1,
        double t1
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$stbir_set_input_subrect);
        try {
            return (int) hFunction.invokeExact(
                (MemorySegment) (resize != null ? resize.segment() : MemorySegment.NULL),
                s0,
                t0,
                s1,
                t1
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public int setNonPmAlphaSpeedOverQuality(
        @Nullable @Pointer ISTBIR_RESIZE resize,
        int nonPmaAlphaSpeedOverQuality
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$stbir_set_non_pm_alpha_speed_over_quality);
        try {
            return (int) hFunction.invokeExact(
                (MemorySegment) (resize != null ? resize.segment() : MemorySegment.NULL),
                nonPmaAlphaSpeedOverQuality
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public int setOutputPixelSubrect(
        @Nullable @Pointer ISTBIR_RESIZE resize,
        int subx,
        int suby,
        int subw,
        int subh
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$stbir_set_output_pixel_subrect);
        try {
            return (int) hFunction.invokeExact(
                (MemorySegment) (resize != null ? resize.segment() : MemorySegment.NULL),
                subx,
                suby,
                subw,
                subh
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void setPixelCallbacks(
        @Nullable @Pointer ISTBIR_RESIZE resize,
        @Pointer(comment="stbir_input_callback*") @NotNull MemorySegment inputCb,
        @Pointer(comment="stbir_output_callback*") @NotNull MemorySegment outputCb
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$stbir_set_pixel_callbacks);
        try {
            hFunction.invokeExact(
                (MemorySegment) (resize != null ? resize.segment() : MemorySegment.NULL),
                inputCb,
                outputCb
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public int setPixelLayouts(
        @Nullable @Pointer ISTBIR_RESIZE resize,
        @EnumType(STBIR_PixelLayout.class) int inputPixelLayout,
        @EnumType(STBIR_PixelLayout.class) int outputPixelLayout
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$stbir_set_pixel_layouts);
        try {
            return (int) hFunction.invokeExact(
                (MemorySegment) (resize != null ? resize.segment() : MemorySegment.NULL),
                inputPixelLayout,
                outputPixelLayout
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public int setPixelSubrect(
        @Nullable @Pointer ISTBIR_RESIZE resize,
        int subx,
        int suby,
        int subw,
        int subh
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$stbir_set_pixel_subrect);
        try {
            return (int) hFunction.invokeExact(
                (MemorySegment) (resize != null ? resize.segment() : MemorySegment.NULL),
                subx,
                suby,
                subw,
                subh
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void setUserData(
        @Nullable @Pointer ISTBIR_RESIZE resize,
        @Pointer(comment="void*") @NotNull MemorySegment userData
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$stbir_set_user_data);
        try {
            hFunction.invokeExact(
                (MemorySegment) (resize != null ? resize.segment() : MemorySegment.NULL),
                userData
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    // endregion

    // region segments and handles
    public final @Nullable MemorySegment SEGMENT$stbir_build_samplers;
    public final @Nullable MemorySegment SEGMENT$stbir_build_samplers_with_splits;
    public final @Nullable MemorySegment SEGMENT$stbir_free_samplers;
    public final @Nullable MemorySegment SEGMENT$stbir_resize;
    public final @Nullable MemorySegment SEGMENT$stbir_resize_build_profile_info;
    public final @Nullable MemorySegment SEGMENT$stbir_resize_extended;
    public final @Nullable MemorySegment SEGMENT$stbir_resize_extended_profile_info;
    public final @Nullable MemorySegment SEGMENT$stbir_resize_extended_split;
    public final @Nullable MemorySegment SEGMENT$stbir_resize_float_linear;
    public final @Nullable MemorySegment SEGMENT$stbir_resize_init;
    public final @Nullable MemorySegment SEGMENT$stbir_resize_split_profile_info;
    public final @Nullable MemorySegment SEGMENT$stbir_resize_uint8_linear;
    public final @Nullable MemorySegment SEGMENT$stbir_resize_uint8_srgb;
    public final @Nullable MemorySegment SEGMENT$stbir_set_buffer_ptrs;
    public final @Nullable MemorySegment SEGMENT$stbir_set_datatypes;
    public final @Nullable MemorySegment SEGMENT$stbir_set_edgemodes;
    public final @Nullable MemorySegment SEGMENT$stbir_set_filter_callbacks;
    public final @Nullable MemorySegment SEGMENT$stbir_set_filters;
    public final @Nullable MemorySegment SEGMENT$stbir_set_input_subrect;
    public final @Nullable MemorySegment SEGMENT$stbir_set_non_pm_alpha_speed_over_quality;
    public final @Nullable MemorySegment SEGMENT$stbir_set_output_pixel_subrect;
    public final @Nullable MemorySegment SEGMENT$stbir_set_pixel_callbacks;
    public final @Nullable MemorySegment SEGMENT$stbir_set_pixel_layouts;
    public final @Nullable MemorySegment SEGMENT$stbir_set_pixel_subrect;
    public final @Nullable MemorySegment SEGMENT$stbir_set_user_data;
    public final @Nullable MethodHandle HANDLE$stbir_build_samplers;
    public final @Nullable MethodHandle HANDLE$stbir_build_samplers_with_splits;
    public final @Nullable MethodHandle HANDLE$stbir_free_samplers;
    public final @Nullable MethodHandle HANDLE$stbir_resize;
    public final @Nullable MethodHandle HANDLE$stbir_resize_build_profile_info;
    public final @Nullable MethodHandle HANDLE$stbir_resize_extended;
    public final @Nullable MethodHandle HANDLE$stbir_resize_extended_profile_info;
    public final @Nullable MethodHandle HANDLE$stbir_resize_extended_split;
    public final @Nullable MethodHandle HANDLE$stbir_resize_float_linear;
    public final @Nullable MethodHandle HANDLE$stbir_resize_init;
    public final @Nullable MethodHandle HANDLE$stbir_resize_split_profile_info;
    public final @Nullable MethodHandle HANDLE$stbir_resize_uint8_linear;
    public final @Nullable MethodHandle HANDLE$stbir_resize_uint8_srgb;
    public final @Nullable MethodHandle HANDLE$stbir_set_buffer_ptrs;
    public final @Nullable MethodHandle HANDLE$stbir_set_datatypes;
    public final @Nullable MethodHandle HANDLE$stbir_set_edgemodes;
    public final @Nullable MethodHandle HANDLE$stbir_set_filter_callbacks;
    public final @Nullable MethodHandle HANDLE$stbir_set_filters;
    public final @Nullable MethodHandle HANDLE$stbir_set_input_subrect;
    public final @Nullable MethodHandle HANDLE$stbir_set_non_pm_alpha_speed_over_quality;
    public final @Nullable MethodHandle HANDLE$stbir_set_output_pixel_subrect;
    public final @Nullable MethodHandle HANDLE$stbir_set_pixel_callbacks;
    public final @Nullable MethodHandle HANDLE$stbir_set_pixel_layouts;
    public final @Nullable MethodHandle HANDLE$stbir_set_pixel_subrect;
    public final @Nullable MethodHandle HANDLE$stbir_set_user_data;
    // endregion

    public static final class Descriptors {
        public static final FunctionDescriptor DESCRIPTOR$stbir_build_samplers = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(STBIR_RESIZE.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$stbir_build_samplers_with_splits = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(STBIR_RESIZE.LAYOUT),
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$stbir_free_samplers = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS.withTargetLayout(STBIR_RESIZE.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$stbir_resize = FunctionDescriptor.of(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$stbir_resize_build_profile_info = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS.withTargetLayout(STBIR_PROFILEINFO.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(STBIR_RESIZE.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$stbir_resize_extended = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(STBIR_RESIZE.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$stbir_resize_extended_profile_info = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS.withTargetLayout(STBIR_PROFILEINFO.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(STBIR_RESIZE.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$stbir_resize_extended_split = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(STBIR_RESIZE.LAYOUT),
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$stbir_resize_float_linear = FunctionDescriptor.of(
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_FLOAT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_FLOAT),
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_FLOAT),
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$stbir_resize_init = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS.withTargetLayout(STBIR_RESIZE.LAYOUT),
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$stbir_resize_split_profile_info = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS.withTargetLayout(STBIR_PROFILEINFO.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(STBIR_RESIZE.LAYOUT),
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$stbir_resize_uint8_linear = FunctionDescriptor.of(
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE),
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE),
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$stbir_resize_uint8_srgb = FunctionDescriptor.of(
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE),
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE),
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$stbir_set_buffer_ptrs = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS.withTargetLayout(STBIR_RESIZE.LAYOUT),
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$stbir_set_datatypes = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS.withTargetLayout(STBIR_RESIZE.LAYOUT),
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$stbir_set_edgemodes = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(STBIR_RESIZE.LAYOUT),
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$stbir_set_filter_callbacks = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(STBIR_RESIZE.LAYOUT),
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$stbir_set_filters = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(STBIR_RESIZE.LAYOUT),
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$stbir_set_input_subrect = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(STBIR_RESIZE.LAYOUT),
            ValueLayout.JAVA_DOUBLE,
            ValueLayout.JAVA_DOUBLE,
            ValueLayout.JAVA_DOUBLE,
            ValueLayout.JAVA_DOUBLE
        );

        public static final FunctionDescriptor DESCRIPTOR$stbir_set_non_pm_alpha_speed_over_quality = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(STBIR_RESIZE.LAYOUT),
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$stbir_set_output_pixel_subrect = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(STBIR_RESIZE.LAYOUT),
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$stbir_set_pixel_callbacks = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS.withTargetLayout(STBIR_RESIZE.LAYOUT),
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$stbir_set_pixel_layouts = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(STBIR_RESIZE.LAYOUT),
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$stbir_set_pixel_subrect = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(STBIR_RESIZE.LAYOUT),
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$stbir_set_user_data = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS.withTargetLayout(STBIR_RESIZE.LAYOUT),
            ValueLayout.ADDRESS
        );

        /// Constructing this class is nonsense so the constructor is made private.
        private Descriptors() {}
    }
}
