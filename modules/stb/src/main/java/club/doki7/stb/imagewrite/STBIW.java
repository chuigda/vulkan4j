package club.doki7.stb.imagewrite;

import java.lang.foreign.*;
import java.lang.invoke.MethodHandle;
import java.util.Objects;

import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import club.doki7.ffm.NativeLayout;
import club.doki7.ffm.RawFunctionLoader;
import club.doki7.ffm.annotation.*;
import club.doki7.ffm.ptr.*;
import static club.doki7.stb.imagewrite.STBIWFunctionTypes.*;

public final class STBIW {
    public STBIW(RawFunctionLoader loader) {
        SEGMENT$stbi_flip_vertically_on_write = loader.apply("stbi_flip_vertically_on_write");
        HANDLE$stbi_flip_vertically_on_write = RawFunctionLoader.link(SEGMENT$stbi_flip_vertically_on_write, Descriptors.DESCRIPTOR$stbi_flip_vertically_on_write);
        SEGMENT$stbi_write_bmp = loader.apply("stbi_write_bmp");
        HANDLE$stbi_write_bmp = RawFunctionLoader.link(SEGMENT$stbi_write_bmp, Descriptors.DESCRIPTOR$stbi_write_bmp);
        SEGMENT$stbi_write_bmp_to_func = loader.apply("stbi_write_bmp_to_func");
        HANDLE$stbi_write_bmp_to_func = RawFunctionLoader.link(SEGMENT$stbi_write_bmp_to_func, Descriptors.DESCRIPTOR$stbi_write_bmp_to_func);
        SEGMENT$stbi_write_hdr = loader.apply("stbi_write_hdr");
        HANDLE$stbi_write_hdr = RawFunctionLoader.link(SEGMENT$stbi_write_hdr, Descriptors.DESCRIPTOR$stbi_write_hdr);
        SEGMENT$stbi_write_hdr_to_func = loader.apply("stbi_write_hdr_to_func");
        HANDLE$stbi_write_hdr_to_func = RawFunctionLoader.link(SEGMENT$stbi_write_hdr_to_func, Descriptors.DESCRIPTOR$stbi_write_hdr_to_func);
        SEGMENT$stbi_write_jpg = loader.apply("stbi_write_jpg");
        HANDLE$stbi_write_jpg = RawFunctionLoader.link(SEGMENT$stbi_write_jpg, Descriptors.DESCRIPTOR$stbi_write_jpg);
        SEGMENT$stbi_write_jpg_to_func = loader.apply("stbi_write_jpg_to_func");
        HANDLE$stbi_write_jpg_to_func = RawFunctionLoader.link(SEGMENT$stbi_write_jpg_to_func, Descriptors.DESCRIPTOR$stbi_write_jpg_to_func);
        SEGMENT$stbi_write_png = loader.apply("stbi_write_png");
        HANDLE$stbi_write_png = RawFunctionLoader.link(SEGMENT$stbi_write_png, Descriptors.DESCRIPTOR$stbi_write_png);
        SEGMENT$stbi_write_png_to_func = loader.apply("stbi_write_png_to_func");
        HANDLE$stbi_write_png_to_func = RawFunctionLoader.link(SEGMENT$stbi_write_png_to_func, Descriptors.DESCRIPTOR$stbi_write_png_to_func);
        SEGMENT$stbi_write_tga = loader.apply("stbi_write_tga");
        HANDLE$stbi_write_tga = RawFunctionLoader.link(SEGMENT$stbi_write_tga, Descriptors.DESCRIPTOR$stbi_write_tga);
        SEGMENT$stbi_write_tga_to_func = loader.apply("stbi_write_tga_to_func");
        HANDLE$stbi_write_tga_to_func = RawFunctionLoader.link(SEGMENT$stbi_write_tga_to_func, Descriptors.DESCRIPTOR$stbi_write_tga_to_func);
        SEGMENT$stbiw_convert_wchar_to_utf8 = loader.apply("stbiw_convert_wchar_to_utf8");
        HANDLE$stbiw_convert_wchar_to_utf8 = RawFunctionLoader.link(SEGMENT$stbiw_convert_wchar_to_utf8, Descriptors.DESCRIPTOR$stbiw_convert_wchar_to_utf8);
    }

    // region command wrappers

    public void flipVerticallyOnWrite(
        int flipBoolean
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$stbi_flip_vertically_on_write);
        try {
            hFunction.invokeExact(
                flipBoolean
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public int writeBmp(
        @Nullable BytePtr filename,
        int w,
        int h,
        int comp,
        @Pointer(comment="void*") @NotNull MemorySegment data
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$stbi_write_bmp);
        try {
            return (int) hFunction.invokeExact(
                (MemorySegment) (filename != null ? filename.segment() : MemorySegment.NULL),
                w,
                h,
                comp,
                data
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public int writeBmpToFunc(
        @Pointer(comment="stbi_write_func*") @NotNull MemorySegment func,
        @Pointer(comment="void*") @NotNull MemorySegment context,
        int w,
        int h,
        int comp,
        @Pointer(comment="void*") @NotNull MemorySegment data
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$stbi_write_bmp_to_func);
        try {
            return (int) hFunction.invokeExact(
                func,
                context,
                w,
                h,
                comp,
                data
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public int writeHdr(
        @Nullable BytePtr filename,
        int w,
        int h,
        int comp,
        @Nullable FloatPtr data
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$stbi_write_hdr);
        try {
            return (int) hFunction.invokeExact(
                (MemorySegment) (filename != null ? filename.segment() : MemorySegment.NULL),
                w,
                h,
                comp,
                (MemorySegment) (data != null ? data.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public int writeHdrToFunc(
        @Pointer(comment="stbi_write_func*") @NotNull MemorySegment func,
        @Pointer(comment="void*") @NotNull MemorySegment context,
        int w,
        int h,
        int comp,
        @Nullable FloatPtr data
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$stbi_write_hdr_to_func);
        try {
            return (int) hFunction.invokeExact(
                func,
                context,
                w,
                h,
                comp,
                (MemorySegment) (data != null ? data.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public int writeJpg(
        @Nullable BytePtr filename,
        int x,
        int y,
        int comp,
        @Pointer(comment="void*") @NotNull MemorySegment data,
        int quality
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$stbi_write_jpg);
        try {
            return (int) hFunction.invokeExact(
                (MemorySegment) (filename != null ? filename.segment() : MemorySegment.NULL),
                x,
                y,
                comp,
                data,
                quality
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public int writeJpgToFunc(
        @Pointer(comment="stbi_write_func*") @NotNull MemorySegment func,
        @Pointer(comment="void*") @NotNull MemorySegment context,
        int x,
        int y,
        int comp,
        @Pointer(comment="void*") @NotNull MemorySegment data,
        int quality
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$stbi_write_jpg_to_func);
        try {
            return (int) hFunction.invokeExact(
                func,
                context,
                x,
                y,
                comp,
                data,
                quality
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public int writePng(
        @Nullable BytePtr filename,
        int w,
        int h,
        int comp,
        @Pointer(comment="void*") @NotNull MemorySegment data,
        int strideInBytes
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$stbi_write_png);
        try {
            return (int) hFunction.invokeExact(
                (MemorySegment) (filename != null ? filename.segment() : MemorySegment.NULL),
                w,
                h,
                comp,
                data,
                strideInBytes
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public int writePngToFunc(
        @Pointer(comment="stbi_write_func*") @NotNull MemorySegment func,
        @Pointer(comment="void*") @NotNull MemorySegment context,
        int w,
        int h,
        int comp,
        @Pointer(comment="void*") @NotNull MemorySegment data,
        int strideInBytes
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$stbi_write_png_to_func);
        try {
            return (int) hFunction.invokeExact(
                func,
                context,
                w,
                h,
                comp,
                data,
                strideInBytes
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public int writeTga(
        @Nullable BytePtr filename,
        int w,
        int h,
        int comp,
        @Pointer(comment="void*") @NotNull MemorySegment data
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$stbi_write_tga);
        try {
            return (int) hFunction.invokeExact(
                (MemorySegment) (filename != null ? filename.segment() : MemorySegment.NULL),
                w,
                h,
                comp,
                data
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public int writeTgaToFunc(
        @Pointer(comment="stbi_write_func*") @NotNull MemorySegment func,
        @Pointer(comment="void*") @NotNull MemorySegment context,
        int w,
        int h,
        int comp,
        @Pointer(comment="void*") @NotNull MemorySegment data
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$stbi_write_tga_to_func);
        try {
            return (int) hFunction.invokeExact(
                func,
                context,
                w,
                h,
                comp,
                data
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public int stbiwConvertWcharToUtf8(
        @Nullable BytePtr buffer,
        long bufferlen,
        @Nullable WCharPtr input
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$stbiw_convert_wchar_to_utf8);
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
    // endregion

    // region segments and handles
    public final @Nullable MemorySegment SEGMENT$stbi_flip_vertically_on_write;
    public final @Nullable MemorySegment SEGMENT$stbi_write_bmp;
    public final @Nullable MemorySegment SEGMENT$stbi_write_bmp_to_func;
    public final @Nullable MemorySegment SEGMENT$stbi_write_hdr;
    public final @Nullable MemorySegment SEGMENT$stbi_write_hdr_to_func;
    public final @Nullable MemorySegment SEGMENT$stbi_write_jpg;
    public final @Nullable MemorySegment SEGMENT$stbi_write_jpg_to_func;
    public final @Nullable MemorySegment SEGMENT$stbi_write_png;
    public final @Nullable MemorySegment SEGMENT$stbi_write_png_to_func;
    public final @Nullable MemorySegment SEGMENT$stbi_write_tga;
    public final @Nullable MemorySegment SEGMENT$stbi_write_tga_to_func;
    public final @Nullable MemorySegment SEGMENT$stbiw_convert_wchar_to_utf8;
    public final @Nullable MethodHandle HANDLE$stbi_flip_vertically_on_write;
    public final @Nullable MethodHandle HANDLE$stbi_write_bmp;
    public final @Nullable MethodHandle HANDLE$stbi_write_bmp_to_func;
    public final @Nullable MethodHandle HANDLE$stbi_write_hdr;
    public final @Nullable MethodHandle HANDLE$stbi_write_hdr_to_func;
    public final @Nullable MethodHandle HANDLE$stbi_write_jpg;
    public final @Nullable MethodHandle HANDLE$stbi_write_jpg_to_func;
    public final @Nullable MethodHandle HANDLE$stbi_write_png;
    public final @Nullable MethodHandle HANDLE$stbi_write_png_to_func;
    public final @Nullable MethodHandle HANDLE$stbi_write_tga;
    public final @Nullable MethodHandle HANDLE$stbi_write_tga_to_func;
    public final @Nullable MethodHandle HANDLE$stbiw_convert_wchar_to_utf8;
    // endregion

    public static final class Descriptors {
        public static final FunctionDescriptor DESCRIPTOR$stbi_flip_vertically_on_write = FunctionDescriptor.ofVoid(
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$stbi_write_bmp = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE),
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$stbi_write_bmp_to_func = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$stbi_write_hdr = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE),
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_FLOAT)
        );

        public static final FunctionDescriptor DESCRIPTOR$stbi_write_hdr_to_func = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_FLOAT)
        );

        public static final FunctionDescriptor DESCRIPTOR$stbi_write_jpg = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE),
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$stbi_write_jpg_to_func = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$stbi_write_png = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE),
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$stbi_write_png_to_func = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$stbi_write_tga = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE),
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$stbi_write_tga_to_func = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$stbiw_convert_wchar_to_utf8 = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE),
            NativeLayout.C_SIZE_T,
            ValueLayout.ADDRESS.withTargetLayout(NativeLayout.WCHAR_T)
        );

        /// Constructing this class is nonsense so the constructor is made private.
        private Descriptors() {}
    }
}
