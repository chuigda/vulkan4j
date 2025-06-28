package club.doki7.stb.image;

import java.lang.foreign.*;
import java.lang.invoke.MethodHandle;
import java.util.Objects;

import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import club.doki7.ffm.NativeLayout;
import club.doki7.ffm.RawFunctionLoader;
import club.doki7.ffm.annotation.*;
import club.doki7.ffm.ptr.*;
import club.doki7.stb.image.datatype.*;

public final class STBI {
    public STBI(RawFunctionLoader loader) {
        SEGMENT$stbi_convert_iphone_png_to_rgb = loader.apply("stbi_convert_iphone_png_to_rgb");
        HANDLE$stbi_convert_iphone_png_to_rgb = RawFunctionLoader.link(SEGMENT$stbi_convert_iphone_png_to_rgb, Descriptors.DESCRIPTOR$stbi_convert_iphone_png_to_rgb);
        SEGMENT$stbi_convert_iphone_png_to_rgb_thread = loader.apply("stbi_convert_iphone_png_to_rgb_thread");
        HANDLE$stbi_convert_iphone_png_to_rgb_thread = RawFunctionLoader.link(SEGMENT$stbi_convert_iphone_png_to_rgb_thread, Descriptors.DESCRIPTOR$stbi_convert_iphone_png_to_rgb_thread);
        SEGMENT$stbi_convert_wchar_to_utf8 = loader.apply("stbi_convert_wchar_to_utf8");
        HANDLE$stbi_convert_wchar_to_utf8 = RawFunctionLoader.link(SEGMENT$stbi_convert_wchar_to_utf8, Descriptors.DESCRIPTOR$stbi_convert_wchar_to_utf8);
        SEGMENT$stbi_failure_reason = loader.apply("stbi_failure_reason");
        HANDLE$stbi_failure_reason = RawFunctionLoader.link(SEGMENT$stbi_failure_reason, Descriptors.DESCRIPTOR$stbi_failure_reason);
        SEGMENT$stbi_hdr_to_ldr_gamma = loader.apply("stbi_hdr_to_ldr_gamma");
        HANDLE$stbi_hdr_to_ldr_gamma = RawFunctionLoader.link(SEGMENT$stbi_hdr_to_ldr_gamma, Descriptors.DESCRIPTOR$stbi_hdr_to_ldr_gamma);
        SEGMENT$stbi_hdr_to_ldr_scale = loader.apply("stbi_hdr_to_ldr_scale");
        HANDLE$stbi_hdr_to_ldr_scale = RawFunctionLoader.link(SEGMENT$stbi_hdr_to_ldr_scale, Descriptors.DESCRIPTOR$stbi_hdr_to_ldr_scale);
        SEGMENT$stbi_image_free = loader.apply("stbi_image_free");
        HANDLE$stbi_image_free = RawFunctionLoader.link(SEGMENT$stbi_image_free, Descriptors.DESCRIPTOR$stbi_image_free);
        SEGMENT$stbi_info = loader.apply("stbi_info");
        HANDLE$stbi_info = RawFunctionLoader.link(SEGMENT$stbi_info, Descriptors.DESCRIPTOR$stbi_info);
        SEGMENT$stbi_info_from_callbacks = loader.apply("stbi_info_from_callbacks");
        HANDLE$stbi_info_from_callbacks = RawFunctionLoader.link(SEGMENT$stbi_info_from_callbacks, Descriptors.DESCRIPTOR$stbi_info_from_callbacks);
        SEGMENT$stbi_info_from_memory = loader.apply("stbi_info_from_memory");
        HANDLE$stbi_info_from_memory = RawFunctionLoader.link(SEGMENT$stbi_info_from_memory, Descriptors.DESCRIPTOR$stbi_info_from_memory);
        SEGMENT$stbi_is_16_bit = loader.apply("stbi_is_16_bit");
        HANDLE$stbi_is_16_bit = RawFunctionLoader.link(SEGMENT$stbi_is_16_bit, Descriptors.DESCRIPTOR$stbi_is_16_bit);
        SEGMENT$stbi_is_16_bit_from_callbacks = loader.apply("stbi_is_16_bit_from_callbacks");
        HANDLE$stbi_is_16_bit_from_callbacks = RawFunctionLoader.link(SEGMENT$stbi_is_16_bit_from_callbacks, Descriptors.DESCRIPTOR$stbi_is_16_bit_from_callbacks);
        SEGMENT$stbi_is_16_bit_from_memory = loader.apply("stbi_is_16_bit_from_memory");
        HANDLE$stbi_is_16_bit_from_memory = RawFunctionLoader.link(SEGMENT$stbi_is_16_bit_from_memory, Descriptors.DESCRIPTOR$stbi_is_16_bit_from_memory);
        SEGMENT$stbi_is_hdr = loader.apply("stbi_is_hdr");
        HANDLE$stbi_is_hdr = RawFunctionLoader.link(SEGMENT$stbi_is_hdr, Descriptors.DESCRIPTOR$stbi_is_hdr);
        SEGMENT$stbi_is_hdr_from_callbacks = loader.apply("stbi_is_hdr_from_callbacks");
        HANDLE$stbi_is_hdr_from_callbacks = RawFunctionLoader.link(SEGMENT$stbi_is_hdr_from_callbacks, Descriptors.DESCRIPTOR$stbi_is_hdr_from_callbacks);
        SEGMENT$stbi_is_hdr_from_memory = loader.apply("stbi_is_hdr_from_memory");
        HANDLE$stbi_is_hdr_from_memory = RawFunctionLoader.link(SEGMENT$stbi_is_hdr_from_memory, Descriptors.DESCRIPTOR$stbi_is_hdr_from_memory);
        SEGMENT$stbi_ldr_to_hdr_gamma = loader.apply("stbi_ldr_to_hdr_gamma");
        HANDLE$stbi_ldr_to_hdr_gamma = RawFunctionLoader.link(SEGMENT$stbi_ldr_to_hdr_gamma, Descriptors.DESCRIPTOR$stbi_ldr_to_hdr_gamma);
        SEGMENT$stbi_ldr_to_hdr_scale = loader.apply("stbi_ldr_to_hdr_scale");
        HANDLE$stbi_ldr_to_hdr_scale = RawFunctionLoader.link(SEGMENT$stbi_ldr_to_hdr_scale, Descriptors.DESCRIPTOR$stbi_ldr_to_hdr_scale);
        SEGMENT$stbi_load = loader.apply("stbi_load");
        HANDLE$stbi_load = RawFunctionLoader.link(SEGMENT$stbi_load, Descriptors.DESCRIPTOR$stbi_load);
        SEGMENT$stbi_load_16 = loader.apply("stbi_load_16");
        HANDLE$stbi_load_16 = RawFunctionLoader.link(SEGMENT$stbi_load_16, Descriptors.DESCRIPTOR$stbi_load_16);
        SEGMENT$stbi_load_16_from_callbacks = loader.apply("stbi_load_16_from_callbacks");
        HANDLE$stbi_load_16_from_callbacks = RawFunctionLoader.link(SEGMENT$stbi_load_16_from_callbacks, Descriptors.DESCRIPTOR$stbi_load_16_from_callbacks);
        SEGMENT$stbi_load_16_from_memory = loader.apply("stbi_load_16_from_memory");
        HANDLE$stbi_load_16_from_memory = RawFunctionLoader.link(SEGMENT$stbi_load_16_from_memory, Descriptors.DESCRIPTOR$stbi_load_16_from_memory);
        SEGMENT$stbi_load_from_callbacks = loader.apply("stbi_load_from_callbacks");
        HANDLE$stbi_load_from_callbacks = RawFunctionLoader.link(SEGMENT$stbi_load_from_callbacks, Descriptors.DESCRIPTOR$stbi_load_from_callbacks);
        SEGMENT$stbi_load_from_memory = loader.apply("stbi_load_from_memory");
        HANDLE$stbi_load_from_memory = RawFunctionLoader.link(SEGMENT$stbi_load_from_memory, Descriptors.DESCRIPTOR$stbi_load_from_memory);
        SEGMENT$stbi_load_gif_from_memory = loader.apply("stbi_load_gif_from_memory");
        HANDLE$stbi_load_gif_from_memory = RawFunctionLoader.link(SEGMENT$stbi_load_gif_from_memory, Descriptors.DESCRIPTOR$stbi_load_gif_from_memory);
        SEGMENT$stbi_loadf = loader.apply("stbi_loadf");
        HANDLE$stbi_loadf = RawFunctionLoader.link(SEGMENT$stbi_loadf, Descriptors.DESCRIPTOR$stbi_loadf);
        SEGMENT$stbi_loadf_from_callbacks = loader.apply("stbi_loadf_from_callbacks");
        HANDLE$stbi_loadf_from_callbacks = RawFunctionLoader.link(SEGMENT$stbi_loadf_from_callbacks, Descriptors.DESCRIPTOR$stbi_loadf_from_callbacks);
        SEGMENT$stbi_loadf_from_memory = loader.apply("stbi_loadf_from_memory");
        HANDLE$stbi_loadf_from_memory = RawFunctionLoader.link(SEGMENT$stbi_loadf_from_memory, Descriptors.DESCRIPTOR$stbi_loadf_from_memory);
        SEGMENT$stbi_set_flip_vertically_on_load = loader.apply("stbi_set_flip_vertically_on_load");
        HANDLE$stbi_set_flip_vertically_on_load = RawFunctionLoader.link(SEGMENT$stbi_set_flip_vertically_on_load, Descriptors.DESCRIPTOR$stbi_set_flip_vertically_on_load);
        SEGMENT$stbi_set_flip_vertically_on_load_thread = loader.apply("stbi_set_flip_vertically_on_load_thread");
        HANDLE$stbi_set_flip_vertically_on_load_thread = RawFunctionLoader.link(SEGMENT$stbi_set_flip_vertically_on_load_thread, Descriptors.DESCRIPTOR$stbi_set_flip_vertically_on_load_thread);
        SEGMENT$stbi_set_unpremultiply_on_load = loader.apply("stbi_set_unpremultiply_on_load");
        HANDLE$stbi_set_unpremultiply_on_load = RawFunctionLoader.link(SEGMENT$stbi_set_unpremultiply_on_load, Descriptors.DESCRIPTOR$stbi_set_unpremultiply_on_load);
        SEGMENT$stbi_set_unpremultiply_on_load_thread = loader.apply("stbi_set_unpremultiply_on_load_thread");
        HANDLE$stbi_set_unpremultiply_on_load_thread = RawFunctionLoader.link(SEGMENT$stbi_set_unpremultiply_on_load_thread, Descriptors.DESCRIPTOR$stbi_set_unpremultiply_on_load_thread);
        SEGMENT$stbi_zlib_decode_buffer = loader.apply("stbi_zlib_decode_buffer");
        HANDLE$stbi_zlib_decode_buffer = RawFunctionLoader.link(SEGMENT$stbi_zlib_decode_buffer, Descriptors.DESCRIPTOR$stbi_zlib_decode_buffer);
        SEGMENT$stbi_zlib_decode_malloc = loader.apply("stbi_zlib_decode_malloc");
        HANDLE$stbi_zlib_decode_malloc = RawFunctionLoader.link(SEGMENT$stbi_zlib_decode_malloc, Descriptors.DESCRIPTOR$stbi_zlib_decode_malloc);
        SEGMENT$stbi_zlib_decode_malloc_guesssize = loader.apply("stbi_zlib_decode_malloc_guesssize");
        HANDLE$stbi_zlib_decode_malloc_guesssize = RawFunctionLoader.link(SEGMENT$stbi_zlib_decode_malloc_guesssize, Descriptors.DESCRIPTOR$stbi_zlib_decode_malloc_guesssize);
        SEGMENT$stbi_zlib_decode_malloc_guesssize_headerflag = loader.apply("stbi_zlib_decode_malloc_guesssize_headerflag");
        HANDLE$stbi_zlib_decode_malloc_guesssize_headerflag = RawFunctionLoader.link(SEGMENT$stbi_zlib_decode_malloc_guesssize_headerflag, Descriptors.DESCRIPTOR$stbi_zlib_decode_malloc_guesssize_headerflag);
        SEGMENT$stbi_zlib_decode_noheader_buffer = loader.apply("stbi_zlib_decode_noheader_buffer");
        HANDLE$stbi_zlib_decode_noheader_buffer = RawFunctionLoader.link(SEGMENT$stbi_zlib_decode_noheader_buffer, Descriptors.DESCRIPTOR$stbi_zlib_decode_noheader_buffer);
        SEGMENT$stbi_zlib_decode_noheader_malloc = loader.apply("stbi_zlib_decode_noheader_malloc");
        HANDLE$stbi_zlib_decode_noheader_malloc = RawFunctionLoader.link(SEGMENT$stbi_zlib_decode_noheader_malloc, Descriptors.DESCRIPTOR$stbi_zlib_decode_noheader_malloc);
    }

    // region command wrappers

    public void convertIphonePngToRgb(
        int flagTrueIfShouldConvert
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$stbi_convert_iphone_png_to_rgb);
        try {
            hFunction.invokeExact(
                flagTrueIfShouldConvert
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void convertIphonePngToRgbThread(
        int flagTrueIfShouldConvert
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$stbi_convert_iphone_png_to_rgb_thread);
        try {
            hFunction.invokeExact(
                flagTrueIfShouldConvert
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public int convertWcharToUtf8(
        @Nullable BytePtr buffer,
        long bufferlen,
        @Nullable WCharPtr input
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$stbi_convert_wchar_to_utf8);
        try {
            return (int) hFunction.invokeExact(
                (MemorySegment) (buffer != null ? buffer.segment() : MemorySegment.NULL),
                MemorySegment.ofAddress(bufferlen),
                (MemorySegment) (input != null ? input.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public @Nullable BytePtr failureReason() {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$stbi_failure_reason);
        try {
            MemorySegment s = (MemorySegment) hFunction.invokeExact(
            );
            return s.equals(MemorySegment.NULL) ? null : new BytePtr(s);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void hdrToLdrGamma(
        float gamma
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$stbi_hdr_to_ldr_gamma);
        try {
            hFunction.invokeExact(
                gamma
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void hdrToLdrScale(
        float scale
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$stbi_hdr_to_ldr_scale);
        try {
            hFunction.invokeExact(
                scale
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void imageFree(
        @Pointer(comment="void*") @NotNull MemorySegment retvalFromStbiLoad
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$stbi_image_free);
        try {
            hFunction.invokeExact(
                retvalFromStbiLoad
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public int info(
        @Nullable BytePtr filename,
        @Nullable IntPtr x,
        @Nullable IntPtr y,
        @Nullable IntPtr comp
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$stbi_info);
        try {
            return (int) hFunction.invokeExact(
                (MemorySegment) (filename != null ? filename.segment() : MemorySegment.NULL),
                (MemorySegment) (x != null ? x.segment() : MemorySegment.NULL),
                (MemorySegment) (y != null ? y.segment() : MemorySegment.NULL),
                (MemorySegment) (comp != null ? comp.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public int infoFromCallbacks(
        @Nullable @Pointer ISTBI_IoCallbacks clbk,
        @Pointer(comment="void*") @NotNull MemorySegment user,
        @Nullable IntPtr x,
        @Nullable IntPtr y,
        @Nullable IntPtr comp
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$stbi_info_from_callbacks);
        try {
            return (int) hFunction.invokeExact(
                (MemorySegment) (clbk != null ? clbk.segment() : MemorySegment.NULL),
                user,
                (MemorySegment) (x != null ? x.segment() : MemorySegment.NULL),
                (MemorySegment) (y != null ? y.segment() : MemorySegment.NULL),
                (MemorySegment) (comp != null ? comp.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public int infoFromMemory(
        @Nullable @Pointer(comment="stbi_uc") BytePtr buffer,
        int len,
        @Nullable IntPtr x,
        @Nullable IntPtr y,
        @Nullable IntPtr comp
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$stbi_info_from_memory);
        try {
            return (int) hFunction.invokeExact(
                (MemorySegment) (buffer != null ? buffer.segment() : MemorySegment.NULL),
                len,
                (MemorySegment) (x != null ? x.segment() : MemorySegment.NULL),
                (MemorySegment) (y != null ? y.segment() : MemorySegment.NULL),
                (MemorySegment) (comp != null ? comp.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public int is16Bit(
        @Nullable BytePtr filename
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$stbi_is_16_bit);
        try {
            return (int) hFunction.invokeExact(
                (MemorySegment) (filename != null ? filename.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public int is16BitFromCallbacks(
        @Nullable @Pointer ISTBI_IoCallbacks clbk,
        @Pointer(comment="void*") @NotNull MemorySegment user
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$stbi_is_16_bit_from_callbacks);
        try {
            return (int) hFunction.invokeExact(
                (MemorySegment) (clbk != null ? clbk.segment() : MemorySegment.NULL),
                user
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public int is16BitFromMemory(
        @Nullable @Pointer(comment="stbi_uc") BytePtr buffer,
        int len
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$stbi_is_16_bit_from_memory);
        try {
            return (int) hFunction.invokeExact(
                (MemorySegment) (buffer != null ? buffer.segment() : MemorySegment.NULL),
                len
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public int isHdr(
        @Nullable BytePtr filename
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$stbi_is_hdr);
        try {
            return (int) hFunction.invokeExact(
                (MemorySegment) (filename != null ? filename.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public int isHdrFromCallbacks(
        @Nullable @Pointer ISTBI_IoCallbacks clbk,
        @Pointer(comment="void*") @NotNull MemorySegment user
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$stbi_is_hdr_from_callbacks);
        try {
            return (int) hFunction.invokeExact(
                (MemorySegment) (clbk != null ? clbk.segment() : MemorySegment.NULL),
                user
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public int isHdrFromMemory(
        @Nullable @Pointer(comment="stbi_uc") BytePtr buffer,
        int len
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$stbi_is_hdr_from_memory);
        try {
            return (int) hFunction.invokeExact(
                (MemorySegment) (buffer != null ? buffer.segment() : MemorySegment.NULL),
                len
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void ldrToHdrGamma(
        float gamma
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$stbi_ldr_to_hdr_gamma);
        try {
            hFunction.invokeExact(
                gamma
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void ldrToHdrScale(
        float scale
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$stbi_ldr_to_hdr_scale);
        try {
            hFunction.invokeExact(
                scale
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public @Nullable @Pointer(comment="stbi_uc") BytePtr load(
        @Nullable BytePtr filename,
        @Nullable IntPtr x,
        @Nullable IntPtr y,
        @Nullable IntPtr channelsInFile,
        int desiredChannels
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$stbi_load);
        try {
            MemorySegment s = (MemorySegment) hFunction.invokeExact(
                (MemorySegment) (filename != null ? filename.segment() : MemorySegment.NULL),
                (MemorySegment) (x != null ? x.segment() : MemorySegment.NULL),
                (MemorySegment) (y != null ? y.segment() : MemorySegment.NULL),
                (MemorySegment) (channelsInFile != null ? channelsInFile.segment() : MemorySegment.NULL),
                desiredChannels
            );
            return s.equals(MemorySegment.NULL) ? null : new BytePtr(s);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public @Nullable @Pointer(comment="stbi_us") ShortPtr load16(
        @Nullable BytePtr filename,
        @Nullable IntPtr x,
        @Nullable IntPtr y,
        @Nullable IntPtr channelsInFile,
        int desiredChannels
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$stbi_load_16);
        try {
            MemorySegment s = (MemorySegment) hFunction.invokeExact(
                (MemorySegment) (filename != null ? filename.segment() : MemorySegment.NULL),
                (MemorySegment) (x != null ? x.segment() : MemorySegment.NULL),
                (MemorySegment) (y != null ? y.segment() : MemorySegment.NULL),
                (MemorySegment) (channelsInFile != null ? channelsInFile.segment() : MemorySegment.NULL),
                desiredChannels
            );
            return s.equals(MemorySegment.NULL) ? null : new ShortPtr(s);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public @Nullable @Pointer(comment="stbi_us") ShortPtr load16FromCallbacks(
        @Nullable @Pointer ISTBI_IoCallbacks clbk,
        @Pointer(comment="void*") @NotNull MemorySegment user,
        @Nullable IntPtr x,
        @Nullable IntPtr y,
        @Nullable IntPtr channelsInFile,
        int desiredChannels
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$stbi_load_16_from_callbacks);
        try {
            MemorySegment s = (MemorySegment) hFunction.invokeExact(
                (MemorySegment) (clbk != null ? clbk.segment() : MemorySegment.NULL),
                user,
                (MemorySegment) (x != null ? x.segment() : MemorySegment.NULL),
                (MemorySegment) (y != null ? y.segment() : MemorySegment.NULL),
                (MemorySegment) (channelsInFile != null ? channelsInFile.segment() : MemorySegment.NULL),
                desiredChannels
            );
            return s.equals(MemorySegment.NULL) ? null : new ShortPtr(s);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public @Nullable @Pointer(comment="stbi_us") ShortPtr load16FromMemory(
        @Nullable @Pointer(comment="stbi_uc") BytePtr buffer,
        int len,
        @Nullable IntPtr x,
        @Nullable IntPtr y,
        @Nullable IntPtr channelsInFile,
        int desiredChannels
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$stbi_load_16_from_memory);
        try {
            MemorySegment s = (MemorySegment) hFunction.invokeExact(
                (MemorySegment) (buffer != null ? buffer.segment() : MemorySegment.NULL),
                len,
                (MemorySegment) (x != null ? x.segment() : MemorySegment.NULL),
                (MemorySegment) (y != null ? y.segment() : MemorySegment.NULL),
                (MemorySegment) (channelsInFile != null ? channelsInFile.segment() : MemorySegment.NULL),
                desiredChannels
            );
            return s.equals(MemorySegment.NULL) ? null : new ShortPtr(s);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public @Nullable @Pointer(comment="stbi_uc") BytePtr loadFromCallbacks(
        @Nullable @Pointer ISTBI_IoCallbacks clbk,
        @Pointer(comment="void*") @NotNull MemorySegment user,
        @Nullable IntPtr x,
        @Nullable IntPtr y,
        @Nullable IntPtr channelsInFile,
        int desiredChannels
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$stbi_load_from_callbacks);
        try {
            MemorySegment s = (MemorySegment) hFunction.invokeExact(
                (MemorySegment) (clbk != null ? clbk.segment() : MemorySegment.NULL),
                user,
                (MemorySegment) (x != null ? x.segment() : MemorySegment.NULL),
                (MemorySegment) (y != null ? y.segment() : MemorySegment.NULL),
                (MemorySegment) (channelsInFile != null ? channelsInFile.segment() : MemorySegment.NULL),
                desiredChannels
            );
            return s.equals(MemorySegment.NULL) ? null : new BytePtr(s);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public @Nullable @Pointer(comment="stbi_uc") BytePtr loadFromMemory(
        @Nullable @Pointer(comment="stbi_uc") BytePtr buffer,
        int len,
        @Nullable IntPtr x,
        @Nullable IntPtr y,
        @Nullable IntPtr channelsInFile,
        int desiredChannels
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$stbi_load_from_memory);
        try {
            MemorySegment s = (MemorySegment) hFunction.invokeExact(
                (MemorySegment) (buffer != null ? buffer.segment() : MemorySegment.NULL),
                len,
                (MemorySegment) (x != null ? x.segment() : MemorySegment.NULL),
                (MemorySegment) (y != null ? y.segment() : MemorySegment.NULL),
                (MemorySegment) (channelsInFile != null ? channelsInFile.segment() : MemorySegment.NULL),
                desiredChannels
            );
            return s.equals(MemorySegment.NULL) ? null : new BytePtr(s);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public @Nullable @Pointer(comment="stbi_uc") BytePtr loadGifFromMemory(
        @Nullable @Pointer(comment="stbi_uc") BytePtr buffer,
        int len,
        @Nullable PointerPtr delays,
        @Nullable IntPtr x,
        @Nullable IntPtr y,
        @Nullable IntPtr z,
        @Nullable IntPtr comp,
        int reqComp
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$stbi_load_gif_from_memory);
        try {
            MemorySegment s = (MemorySegment) hFunction.invokeExact(
                (MemorySegment) (buffer != null ? buffer.segment() : MemorySegment.NULL),
                len,
                (MemorySegment) (delays != null ? delays.segment() : MemorySegment.NULL),
                (MemorySegment) (x != null ? x.segment() : MemorySegment.NULL),
                (MemorySegment) (y != null ? y.segment() : MemorySegment.NULL),
                (MemorySegment) (z != null ? z.segment() : MemorySegment.NULL),
                (MemorySegment) (comp != null ? comp.segment() : MemorySegment.NULL),
                reqComp
            );
            return s.equals(MemorySegment.NULL) ? null : new BytePtr(s);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public @Nullable FloatPtr loadf(
        @Nullable BytePtr filename,
        @Nullable IntPtr x,
        @Nullable IntPtr y,
        @Nullable IntPtr channelsInFile,
        int desiredChannels
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$stbi_loadf);
        try {
            MemorySegment s = (MemorySegment) hFunction.invokeExact(
                (MemorySegment) (filename != null ? filename.segment() : MemorySegment.NULL),
                (MemorySegment) (x != null ? x.segment() : MemorySegment.NULL),
                (MemorySegment) (y != null ? y.segment() : MemorySegment.NULL),
                (MemorySegment) (channelsInFile != null ? channelsInFile.segment() : MemorySegment.NULL),
                desiredChannels
            );
            return s.equals(MemorySegment.NULL) ? null : new FloatPtr(s);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public @Nullable FloatPtr loadfFromCallbacks(
        @Nullable @Pointer ISTBI_IoCallbacks clbk,
        @Pointer(comment="void*") @NotNull MemorySegment user,
        @Nullable IntPtr x,
        @Nullable IntPtr y,
        @Nullable IntPtr channelsInFile,
        int desiredChannels
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$stbi_loadf_from_callbacks);
        try {
            MemorySegment s = (MemorySegment) hFunction.invokeExact(
                (MemorySegment) (clbk != null ? clbk.segment() : MemorySegment.NULL),
                user,
                (MemorySegment) (x != null ? x.segment() : MemorySegment.NULL),
                (MemorySegment) (y != null ? y.segment() : MemorySegment.NULL),
                (MemorySegment) (channelsInFile != null ? channelsInFile.segment() : MemorySegment.NULL),
                desiredChannels
            );
            return s.equals(MemorySegment.NULL) ? null : new FloatPtr(s);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public @Nullable FloatPtr loadfFromMemory(
        @Nullable @Pointer(comment="stbi_uc") BytePtr buffer,
        int len,
        @Nullable IntPtr x,
        @Nullable IntPtr y,
        @Nullable IntPtr channelsInFile,
        int desiredChannels
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$stbi_loadf_from_memory);
        try {
            MemorySegment s = (MemorySegment) hFunction.invokeExact(
                (MemorySegment) (buffer != null ? buffer.segment() : MemorySegment.NULL),
                len,
                (MemorySegment) (x != null ? x.segment() : MemorySegment.NULL),
                (MemorySegment) (y != null ? y.segment() : MemorySegment.NULL),
                (MemorySegment) (channelsInFile != null ? channelsInFile.segment() : MemorySegment.NULL),
                desiredChannels
            );
            return s.equals(MemorySegment.NULL) ? null : new FloatPtr(s);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void setFlipVerticallyOnLoad(
        int flagTrueIfShouldFlip
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$stbi_set_flip_vertically_on_load);
        try {
            hFunction.invokeExact(
                flagTrueIfShouldFlip
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void setFlipVerticallyOnLoadThread(
        int flagTrueIfShouldFlip
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$stbi_set_flip_vertically_on_load_thread);
        try {
            hFunction.invokeExact(
                flagTrueIfShouldFlip
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void setUnpremultiplyOnLoad(
        int flagTrueIfShouldUnpremultiply
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$stbi_set_unpremultiply_on_load);
        try {
            hFunction.invokeExact(
                flagTrueIfShouldUnpremultiply
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void setUnpremultiplyOnLoadThread(
        int flagTrueIfShouldUnpremultiply
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$stbi_set_unpremultiply_on_load_thread);
        try {
            hFunction.invokeExact(
                flagTrueIfShouldUnpremultiply
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public int zlibDecodeBuffer(
        @Nullable BytePtr obuffer,
        int olen,
        @Nullable BytePtr ibuffer,
        int ilen
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$stbi_zlib_decode_buffer);
        try {
            return (int) hFunction.invokeExact(
                (MemorySegment) (obuffer != null ? obuffer.segment() : MemorySegment.NULL),
                olen,
                (MemorySegment) (ibuffer != null ? ibuffer.segment() : MemorySegment.NULL),
                ilen
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public @Nullable BytePtr zlibDecodeMalloc(
        @Nullable BytePtr buffer,
        int len,
        @Nullable IntPtr outlen
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$stbi_zlib_decode_malloc);
        try {
            MemorySegment s = (MemorySegment) hFunction.invokeExact(
                (MemorySegment) (buffer != null ? buffer.segment() : MemorySegment.NULL),
                len,
                (MemorySegment) (outlen != null ? outlen.segment() : MemorySegment.NULL)
            );
            return s.equals(MemorySegment.NULL) ? null : new BytePtr(s);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public @Nullable BytePtr zlibDecodeMallocGuesssize(
        @Nullable BytePtr buffer,
        int len,
        int initialSize,
        @Nullable IntPtr outlen
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$stbi_zlib_decode_malloc_guesssize);
        try {
            MemorySegment s = (MemorySegment) hFunction.invokeExact(
                (MemorySegment) (buffer != null ? buffer.segment() : MemorySegment.NULL),
                len,
                initialSize,
                (MemorySegment) (outlen != null ? outlen.segment() : MemorySegment.NULL)
            );
            return s.equals(MemorySegment.NULL) ? null : new BytePtr(s);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public @Nullable BytePtr zlibDecodeMallocGuesssizeHeaderflag(
        @Nullable BytePtr buffer,
        int len,
        int initialSize,
        @Nullable IntPtr outlen,
        int parseHeader
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$stbi_zlib_decode_malloc_guesssize_headerflag);
        try {
            MemorySegment s = (MemorySegment) hFunction.invokeExact(
                (MemorySegment) (buffer != null ? buffer.segment() : MemorySegment.NULL),
                len,
                initialSize,
                (MemorySegment) (outlen != null ? outlen.segment() : MemorySegment.NULL),
                parseHeader
            );
            return s.equals(MemorySegment.NULL) ? null : new BytePtr(s);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public int zlibDecodeNoheaderBuffer(
        @Nullable BytePtr obuffer,
        int olen,
        @Nullable BytePtr ibuffer,
        int ilen
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$stbi_zlib_decode_noheader_buffer);
        try {
            return (int) hFunction.invokeExact(
                (MemorySegment) (obuffer != null ? obuffer.segment() : MemorySegment.NULL),
                olen,
                (MemorySegment) (ibuffer != null ? ibuffer.segment() : MemorySegment.NULL),
                ilen
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public @Nullable BytePtr zlibDecodeNoheaderMalloc(
        @Nullable BytePtr buffer,
        int len,
        @Nullable IntPtr outlen
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$stbi_zlib_decode_noheader_malloc);
        try {
            MemorySegment s = (MemorySegment) hFunction.invokeExact(
                (MemorySegment) (buffer != null ? buffer.segment() : MemorySegment.NULL),
                len,
                (MemorySegment) (outlen != null ? outlen.segment() : MemorySegment.NULL)
            );
            return s.equals(MemorySegment.NULL) ? null : new BytePtr(s);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    // endregion

    // region segments and handles
    public final @Nullable MemorySegment SEGMENT$stbi_convert_iphone_png_to_rgb;
    public final @Nullable MemorySegment SEGMENT$stbi_convert_iphone_png_to_rgb_thread;
    public final @Nullable MemorySegment SEGMENT$stbi_convert_wchar_to_utf8;
    public final @Nullable MemorySegment SEGMENT$stbi_failure_reason;
    public final @Nullable MemorySegment SEGMENT$stbi_hdr_to_ldr_gamma;
    public final @Nullable MemorySegment SEGMENT$stbi_hdr_to_ldr_scale;
    public final @Nullable MemorySegment SEGMENT$stbi_image_free;
    public final @Nullable MemorySegment SEGMENT$stbi_info;
    public final @Nullable MemorySegment SEGMENT$stbi_info_from_callbacks;
    public final @Nullable MemorySegment SEGMENT$stbi_info_from_memory;
    public final @Nullable MemorySegment SEGMENT$stbi_is_16_bit;
    public final @Nullable MemorySegment SEGMENT$stbi_is_16_bit_from_callbacks;
    public final @Nullable MemorySegment SEGMENT$stbi_is_16_bit_from_memory;
    public final @Nullable MemorySegment SEGMENT$stbi_is_hdr;
    public final @Nullable MemorySegment SEGMENT$stbi_is_hdr_from_callbacks;
    public final @Nullable MemorySegment SEGMENT$stbi_is_hdr_from_memory;
    public final @Nullable MemorySegment SEGMENT$stbi_ldr_to_hdr_gamma;
    public final @Nullable MemorySegment SEGMENT$stbi_ldr_to_hdr_scale;
    public final @Nullable MemorySegment SEGMENT$stbi_load;
    public final @Nullable MemorySegment SEGMENT$stbi_load_16;
    public final @Nullable MemorySegment SEGMENT$stbi_load_16_from_callbacks;
    public final @Nullable MemorySegment SEGMENT$stbi_load_16_from_memory;
    public final @Nullable MemorySegment SEGMENT$stbi_load_from_callbacks;
    public final @Nullable MemorySegment SEGMENT$stbi_load_from_memory;
    public final @Nullable MemorySegment SEGMENT$stbi_load_gif_from_memory;
    public final @Nullable MemorySegment SEGMENT$stbi_loadf;
    public final @Nullable MemorySegment SEGMENT$stbi_loadf_from_callbacks;
    public final @Nullable MemorySegment SEGMENT$stbi_loadf_from_memory;
    public final @Nullable MemorySegment SEGMENT$stbi_set_flip_vertically_on_load;
    public final @Nullable MemorySegment SEGMENT$stbi_set_flip_vertically_on_load_thread;
    public final @Nullable MemorySegment SEGMENT$stbi_set_unpremultiply_on_load;
    public final @Nullable MemorySegment SEGMENT$stbi_set_unpremultiply_on_load_thread;
    public final @Nullable MemorySegment SEGMENT$stbi_zlib_decode_buffer;
    public final @Nullable MemorySegment SEGMENT$stbi_zlib_decode_malloc;
    public final @Nullable MemorySegment SEGMENT$stbi_zlib_decode_malloc_guesssize;
    public final @Nullable MemorySegment SEGMENT$stbi_zlib_decode_malloc_guesssize_headerflag;
    public final @Nullable MemorySegment SEGMENT$stbi_zlib_decode_noheader_buffer;
    public final @Nullable MemorySegment SEGMENT$stbi_zlib_decode_noheader_malloc;
    public final @Nullable MethodHandle HANDLE$stbi_convert_iphone_png_to_rgb;
    public final @Nullable MethodHandle HANDLE$stbi_convert_iphone_png_to_rgb_thread;
    public final @Nullable MethodHandle HANDLE$stbi_convert_wchar_to_utf8;
    public final @Nullable MethodHandle HANDLE$stbi_failure_reason;
    public final @Nullable MethodHandle HANDLE$stbi_hdr_to_ldr_gamma;
    public final @Nullable MethodHandle HANDLE$stbi_hdr_to_ldr_scale;
    public final @Nullable MethodHandle HANDLE$stbi_image_free;
    public final @Nullable MethodHandle HANDLE$stbi_info;
    public final @Nullable MethodHandle HANDLE$stbi_info_from_callbacks;
    public final @Nullable MethodHandle HANDLE$stbi_info_from_memory;
    public final @Nullable MethodHandle HANDLE$stbi_is_16_bit;
    public final @Nullable MethodHandle HANDLE$stbi_is_16_bit_from_callbacks;
    public final @Nullable MethodHandle HANDLE$stbi_is_16_bit_from_memory;
    public final @Nullable MethodHandle HANDLE$stbi_is_hdr;
    public final @Nullable MethodHandle HANDLE$stbi_is_hdr_from_callbacks;
    public final @Nullable MethodHandle HANDLE$stbi_is_hdr_from_memory;
    public final @Nullable MethodHandle HANDLE$stbi_ldr_to_hdr_gamma;
    public final @Nullable MethodHandle HANDLE$stbi_ldr_to_hdr_scale;
    public final @Nullable MethodHandle HANDLE$stbi_load;
    public final @Nullable MethodHandle HANDLE$stbi_load_16;
    public final @Nullable MethodHandle HANDLE$stbi_load_16_from_callbacks;
    public final @Nullable MethodHandle HANDLE$stbi_load_16_from_memory;
    public final @Nullable MethodHandle HANDLE$stbi_load_from_callbacks;
    public final @Nullable MethodHandle HANDLE$stbi_load_from_memory;
    public final @Nullable MethodHandle HANDLE$stbi_load_gif_from_memory;
    public final @Nullable MethodHandle HANDLE$stbi_loadf;
    public final @Nullable MethodHandle HANDLE$stbi_loadf_from_callbacks;
    public final @Nullable MethodHandle HANDLE$stbi_loadf_from_memory;
    public final @Nullable MethodHandle HANDLE$stbi_set_flip_vertically_on_load;
    public final @Nullable MethodHandle HANDLE$stbi_set_flip_vertically_on_load_thread;
    public final @Nullable MethodHandle HANDLE$stbi_set_unpremultiply_on_load;
    public final @Nullable MethodHandle HANDLE$stbi_set_unpremultiply_on_load_thread;
    public final @Nullable MethodHandle HANDLE$stbi_zlib_decode_buffer;
    public final @Nullable MethodHandle HANDLE$stbi_zlib_decode_malloc;
    public final @Nullable MethodHandle HANDLE$stbi_zlib_decode_malloc_guesssize;
    public final @Nullable MethodHandle HANDLE$stbi_zlib_decode_malloc_guesssize_headerflag;
    public final @Nullable MethodHandle HANDLE$stbi_zlib_decode_noheader_buffer;
    public final @Nullable MethodHandle HANDLE$stbi_zlib_decode_noheader_malloc;
    // endregion

    public static final class Descriptors {
        public static final FunctionDescriptor DESCRIPTOR$stbi_convert_iphone_png_to_rgb = FunctionDescriptor.ofVoid(
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$stbi_convert_iphone_png_to_rgb_thread = FunctionDescriptor.ofVoid(
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$stbi_convert_wchar_to_utf8 = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE),
            NativeLayout.C_SIZE_T,
            ValueLayout.ADDRESS.withTargetLayout(NativeLayout.WCHAR_T)
        );

        public static final FunctionDescriptor DESCRIPTOR$stbi_failure_reason = FunctionDescriptor.of(
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE)
        );

        public static final FunctionDescriptor DESCRIPTOR$stbi_hdr_to_ldr_gamma = FunctionDescriptor.ofVoid(
            ValueLayout.JAVA_FLOAT
        );

        public static final FunctionDescriptor DESCRIPTOR$stbi_hdr_to_ldr_scale = FunctionDescriptor.ofVoid(
            ValueLayout.JAVA_FLOAT
        );

        public static final FunctionDescriptor DESCRIPTOR$stbi_image_free = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$stbi_info = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
        );

        public static final FunctionDescriptor DESCRIPTOR$stbi_info_from_callbacks = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(STBI_IoCallbacks.LAYOUT),
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
        );

        public static final FunctionDescriptor DESCRIPTOR$stbi_info_from_memory = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE),
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
        );

        public static final FunctionDescriptor DESCRIPTOR$stbi_is_16_bit = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE)
        );

        public static final FunctionDescriptor DESCRIPTOR$stbi_is_16_bit_from_callbacks = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(STBI_IoCallbacks.LAYOUT),
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$stbi_is_16_bit_from_memory = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE),
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$stbi_is_hdr = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE)
        );

        public static final FunctionDescriptor DESCRIPTOR$stbi_is_hdr_from_callbacks = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(STBI_IoCallbacks.LAYOUT),
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$stbi_is_hdr_from_memory = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE),
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$stbi_ldr_to_hdr_gamma = FunctionDescriptor.ofVoid(
            ValueLayout.JAVA_FLOAT
        );

        public static final FunctionDescriptor DESCRIPTOR$stbi_ldr_to_hdr_scale = FunctionDescriptor.ofVoid(
            ValueLayout.JAVA_FLOAT
        );

        public static final FunctionDescriptor DESCRIPTOR$stbi_load = FunctionDescriptor.of(
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$stbi_load_16 = FunctionDescriptor.of(
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_SHORT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$stbi_load_16_from_callbacks = FunctionDescriptor.of(
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_SHORT),
            ValueLayout.ADDRESS.withTargetLayout(STBI_IoCallbacks.LAYOUT),
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$stbi_load_16_from_memory = FunctionDescriptor.of(
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_SHORT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE),
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$stbi_load_from_callbacks = FunctionDescriptor.of(
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE),
            ValueLayout.ADDRESS.withTargetLayout(STBI_IoCallbacks.LAYOUT),
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$stbi_load_from_memory = FunctionDescriptor.of(
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE),
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$stbi_load_gif_from_memory = FunctionDescriptor.of(
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE),
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$stbi_loadf = FunctionDescriptor.of(
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_FLOAT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$stbi_loadf_from_callbacks = FunctionDescriptor.of(
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_FLOAT),
            ValueLayout.ADDRESS.withTargetLayout(STBI_IoCallbacks.LAYOUT),
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$stbi_loadf_from_memory = FunctionDescriptor.of(
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_FLOAT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE),
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$stbi_set_flip_vertically_on_load = FunctionDescriptor.ofVoid(
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$stbi_set_flip_vertically_on_load_thread = FunctionDescriptor.ofVoid(
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$stbi_set_unpremultiply_on_load = FunctionDescriptor.ofVoid(
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$stbi_set_unpremultiply_on_load_thread = FunctionDescriptor.ofVoid(
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$stbi_zlib_decode_buffer = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE),
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE),
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$stbi_zlib_decode_malloc = FunctionDescriptor.of(
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE),
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
        );

        public static final FunctionDescriptor DESCRIPTOR$stbi_zlib_decode_malloc_guesssize = FunctionDescriptor.of(
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE),
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
        );

        public static final FunctionDescriptor DESCRIPTOR$stbi_zlib_decode_malloc_guesssize_headerflag = FunctionDescriptor.of(
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE),
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$stbi_zlib_decode_noheader_buffer = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE),
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE),
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$stbi_zlib_decode_noheader_malloc = FunctionDescriptor.of(
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE),
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
        );

        /// Constructing this class is nonsense so the constructor is made private.
        private Descriptors() {}
    }
}
