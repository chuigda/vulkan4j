package club.doki7.stb.truetype;

import java.lang.foreign.*;
import java.lang.invoke.MethodHandle;
import java.util.Objects;

import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import club.doki7.ffm.NativeLayout;
import club.doki7.ffm.RawFunctionLoader;
import club.doki7.ffm.annotation.*;
import club.doki7.ffm.ptr.*;
import club.doki7.stb.truetype.datatype.*;
import club.doki7.stb.truetype.handle.*;

public final class STBTT {
    public STBTT(RawFunctionLoader loader) {
        SEGMENT$stbtt_BakeFontBitmap = loader.apply("stbtt_BakeFontBitmap");
        HANDLE$stbtt_BakeFontBitmap = RawFunctionLoader.link(SEGMENT$stbtt_BakeFontBitmap, Descriptors.DESCRIPTOR$stbtt_BakeFontBitmap);
        SEGMENT$stbtt_CompareUTF8toUTF16_bigendian = loader.apply("stbtt_CompareUTF8toUTF16_bigendian");
        HANDLE$stbtt_CompareUTF8toUTF16_bigendian = RawFunctionLoader.link(SEGMENT$stbtt_CompareUTF8toUTF16_bigendian, Descriptors.DESCRIPTOR$stbtt_CompareUTF8toUTF16_bigendian);
        SEGMENT$stbtt_FindGlyphIndex = loader.apply("stbtt_FindGlyphIndex");
        HANDLE$stbtt_FindGlyphIndex = RawFunctionLoader.link(SEGMENT$stbtt_FindGlyphIndex, Descriptors.DESCRIPTOR$stbtt_FindGlyphIndex);
        SEGMENT$stbtt_FindMatchingFont = loader.apply("stbtt_FindMatchingFont");
        HANDLE$stbtt_FindMatchingFont = RawFunctionLoader.link(SEGMENT$stbtt_FindMatchingFont, Descriptors.DESCRIPTOR$stbtt_FindMatchingFont);
        SEGMENT$stbtt_FindSVGDoc = loader.apply("stbtt_FindSVGDoc");
        HANDLE$stbtt_FindSVGDoc = RawFunctionLoader.link(SEGMENT$stbtt_FindSVGDoc, Descriptors.DESCRIPTOR$stbtt_FindSVGDoc);
        SEGMENT$stbtt_FreeBitmap = loader.apply("stbtt_FreeBitmap");
        HANDLE$stbtt_FreeBitmap = RawFunctionLoader.link(SEGMENT$stbtt_FreeBitmap, Descriptors.DESCRIPTOR$stbtt_FreeBitmap);
        SEGMENT$stbtt_FreeSDF = loader.apply("stbtt_FreeSDF");
        HANDLE$stbtt_FreeSDF = RawFunctionLoader.link(SEGMENT$stbtt_FreeSDF, Descriptors.DESCRIPTOR$stbtt_FreeSDF);
        SEGMENT$stbtt_FreeShape = loader.apply("stbtt_FreeShape");
        HANDLE$stbtt_FreeShape = RawFunctionLoader.link(SEGMENT$stbtt_FreeShape, Descriptors.DESCRIPTOR$stbtt_FreeShape);
        SEGMENT$stbtt_GetBakedQuad = loader.apply("stbtt_GetBakedQuad");
        HANDLE$stbtt_GetBakedQuad = RawFunctionLoader.link(SEGMENT$stbtt_GetBakedQuad, Descriptors.DESCRIPTOR$stbtt_GetBakedQuad);
        SEGMENT$stbtt_GetCodepointBitmap = loader.apply("stbtt_GetCodepointBitmap");
        HANDLE$stbtt_GetCodepointBitmap = RawFunctionLoader.link(SEGMENT$stbtt_GetCodepointBitmap, Descriptors.DESCRIPTOR$stbtt_GetCodepointBitmap);
        SEGMENT$stbtt_GetCodepointBitmapBox = loader.apply("stbtt_GetCodepointBitmapBox");
        HANDLE$stbtt_GetCodepointBitmapBox = RawFunctionLoader.link(SEGMENT$stbtt_GetCodepointBitmapBox, Descriptors.DESCRIPTOR$stbtt_GetCodepointBitmapBox);
        SEGMENT$stbtt_GetCodepointBitmapBoxSubpixel = loader.apply("stbtt_GetCodepointBitmapBoxSubpixel");
        HANDLE$stbtt_GetCodepointBitmapBoxSubpixel = RawFunctionLoader.link(SEGMENT$stbtt_GetCodepointBitmapBoxSubpixel, Descriptors.DESCRIPTOR$stbtt_GetCodepointBitmapBoxSubpixel);
        SEGMENT$stbtt_GetCodepointBitmapSubpixel = loader.apply("stbtt_GetCodepointBitmapSubpixel");
        HANDLE$stbtt_GetCodepointBitmapSubpixel = RawFunctionLoader.link(SEGMENT$stbtt_GetCodepointBitmapSubpixel, Descriptors.DESCRIPTOR$stbtt_GetCodepointBitmapSubpixel);
        SEGMENT$stbtt_GetCodepointBox = loader.apply("stbtt_GetCodepointBox");
        HANDLE$stbtt_GetCodepointBox = RawFunctionLoader.link(SEGMENT$stbtt_GetCodepointBox, Descriptors.DESCRIPTOR$stbtt_GetCodepointBox);
        SEGMENT$stbtt_GetCodepointHMetrics = loader.apply("stbtt_GetCodepointHMetrics");
        HANDLE$stbtt_GetCodepointHMetrics = RawFunctionLoader.link(SEGMENT$stbtt_GetCodepointHMetrics, Descriptors.DESCRIPTOR$stbtt_GetCodepointHMetrics);
        SEGMENT$stbtt_GetCodepointKernAdvance = loader.apply("stbtt_GetCodepointKernAdvance");
        HANDLE$stbtt_GetCodepointKernAdvance = RawFunctionLoader.link(SEGMENT$stbtt_GetCodepointKernAdvance, Descriptors.DESCRIPTOR$stbtt_GetCodepointKernAdvance);
        SEGMENT$stbtt_GetCodepointSDF = loader.apply("stbtt_GetCodepointSDF");
        HANDLE$stbtt_GetCodepointSDF = RawFunctionLoader.link(SEGMENT$stbtt_GetCodepointSDF, Descriptors.DESCRIPTOR$stbtt_GetCodepointSDF);
        SEGMENT$stbtt_GetCodepointSVG = loader.apply("stbtt_GetCodepointSVG");
        HANDLE$stbtt_GetCodepointSVG = RawFunctionLoader.link(SEGMENT$stbtt_GetCodepointSVG, Descriptors.DESCRIPTOR$stbtt_GetCodepointSVG);
        SEGMENT$stbtt_GetCodepointShape = loader.apply("stbtt_GetCodepointShape");
        HANDLE$stbtt_GetCodepointShape = RawFunctionLoader.link(SEGMENT$stbtt_GetCodepointShape, Descriptors.DESCRIPTOR$stbtt_GetCodepointShape);
        SEGMENT$stbtt_GetFontBoundingBox = loader.apply("stbtt_GetFontBoundingBox");
        HANDLE$stbtt_GetFontBoundingBox = RawFunctionLoader.link(SEGMENT$stbtt_GetFontBoundingBox, Descriptors.DESCRIPTOR$stbtt_GetFontBoundingBox);
        SEGMENT$stbtt_GetFontNameString = loader.apply("stbtt_GetFontNameString");
        HANDLE$stbtt_GetFontNameString = RawFunctionLoader.link(SEGMENT$stbtt_GetFontNameString, Descriptors.DESCRIPTOR$stbtt_GetFontNameString);
        SEGMENT$stbtt_GetFontOffsetForIndex = loader.apply("stbtt_GetFontOffsetForIndex");
        HANDLE$stbtt_GetFontOffsetForIndex = RawFunctionLoader.link(SEGMENT$stbtt_GetFontOffsetForIndex, Descriptors.DESCRIPTOR$stbtt_GetFontOffsetForIndex);
        SEGMENT$stbtt_GetFontVMetrics = loader.apply("stbtt_GetFontVMetrics");
        HANDLE$stbtt_GetFontVMetrics = RawFunctionLoader.link(SEGMENT$stbtt_GetFontVMetrics, Descriptors.DESCRIPTOR$stbtt_GetFontVMetrics);
        SEGMENT$stbtt_GetFontVMetricsOS2 = loader.apply("stbtt_GetFontVMetricsOS2");
        HANDLE$stbtt_GetFontVMetricsOS2 = RawFunctionLoader.link(SEGMENT$stbtt_GetFontVMetricsOS2, Descriptors.DESCRIPTOR$stbtt_GetFontVMetricsOS2);
        SEGMENT$stbtt_GetGlyphBitmap = loader.apply("stbtt_GetGlyphBitmap");
        HANDLE$stbtt_GetGlyphBitmap = RawFunctionLoader.link(SEGMENT$stbtt_GetGlyphBitmap, Descriptors.DESCRIPTOR$stbtt_GetGlyphBitmap);
        SEGMENT$stbtt_GetGlyphBitmapBox = loader.apply("stbtt_GetGlyphBitmapBox");
        HANDLE$stbtt_GetGlyphBitmapBox = RawFunctionLoader.link(SEGMENT$stbtt_GetGlyphBitmapBox, Descriptors.DESCRIPTOR$stbtt_GetGlyphBitmapBox);
        SEGMENT$stbtt_GetGlyphBitmapBoxSubpixel = loader.apply("stbtt_GetGlyphBitmapBoxSubpixel");
        HANDLE$stbtt_GetGlyphBitmapBoxSubpixel = RawFunctionLoader.link(SEGMENT$stbtt_GetGlyphBitmapBoxSubpixel, Descriptors.DESCRIPTOR$stbtt_GetGlyphBitmapBoxSubpixel);
        SEGMENT$stbtt_GetGlyphBitmapSubpixel = loader.apply("stbtt_GetGlyphBitmapSubpixel");
        HANDLE$stbtt_GetGlyphBitmapSubpixel = RawFunctionLoader.link(SEGMENT$stbtt_GetGlyphBitmapSubpixel, Descriptors.DESCRIPTOR$stbtt_GetGlyphBitmapSubpixel);
        SEGMENT$stbtt_GetGlyphBox = loader.apply("stbtt_GetGlyphBox");
        HANDLE$stbtt_GetGlyphBox = RawFunctionLoader.link(SEGMENT$stbtt_GetGlyphBox, Descriptors.DESCRIPTOR$stbtt_GetGlyphBox);
        SEGMENT$stbtt_GetGlyphHMetrics = loader.apply("stbtt_GetGlyphHMetrics");
        HANDLE$stbtt_GetGlyphHMetrics = RawFunctionLoader.link(SEGMENT$stbtt_GetGlyphHMetrics, Descriptors.DESCRIPTOR$stbtt_GetGlyphHMetrics);
        SEGMENT$stbtt_GetGlyphKernAdvance = loader.apply("stbtt_GetGlyphKernAdvance");
        HANDLE$stbtt_GetGlyphKernAdvance = RawFunctionLoader.link(SEGMENT$stbtt_GetGlyphKernAdvance, Descriptors.DESCRIPTOR$stbtt_GetGlyphKernAdvance);
        SEGMENT$stbtt_GetGlyphSDF = loader.apply("stbtt_GetGlyphSDF");
        HANDLE$stbtt_GetGlyphSDF = RawFunctionLoader.link(SEGMENT$stbtt_GetGlyphSDF, Descriptors.DESCRIPTOR$stbtt_GetGlyphSDF);
        SEGMENT$stbtt_GetGlyphSVG = loader.apply("stbtt_GetGlyphSVG");
        HANDLE$stbtt_GetGlyphSVG = RawFunctionLoader.link(SEGMENT$stbtt_GetGlyphSVG, Descriptors.DESCRIPTOR$stbtt_GetGlyphSVG);
        SEGMENT$stbtt_GetGlyphShape = loader.apply("stbtt_GetGlyphShape");
        HANDLE$stbtt_GetGlyphShape = RawFunctionLoader.link(SEGMENT$stbtt_GetGlyphShape, Descriptors.DESCRIPTOR$stbtt_GetGlyphShape);
        SEGMENT$stbtt_GetKerningTable = loader.apply("stbtt_GetKerningTable");
        HANDLE$stbtt_GetKerningTable = RawFunctionLoader.link(SEGMENT$stbtt_GetKerningTable, Descriptors.DESCRIPTOR$stbtt_GetKerningTable);
        SEGMENT$stbtt_GetKerningTableLength = loader.apply("stbtt_GetKerningTableLength");
        HANDLE$stbtt_GetKerningTableLength = RawFunctionLoader.link(SEGMENT$stbtt_GetKerningTableLength, Descriptors.DESCRIPTOR$stbtt_GetKerningTableLength);
        SEGMENT$stbtt_GetNumberOfFonts = loader.apply("stbtt_GetNumberOfFonts");
        HANDLE$stbtt_GetNumberOfFonts = RawFunctionLoader.link(SEGMENT$stbtt_GetNumberOfFonts, Descriptors.DESCRIPTOR$stbtt_GetNumberOfFonts);
        SEGMENT$stbtt_GetPackedQuad = loader.apply("stbtt_GetPackedQuad");
        HANDLE$stbtt_GetPackedQuad = RawFunctionLoader.link(SEGMENT$stbtt_GetPackedQuad, Descriptors.DESCRIPTOR$stbtt_GetPackedQuad);
        SEGMENT$stbtt_GetScaledFontVMetrics = loader.apply("stbtt_GetScaledFontVMetrics");
        HANDLE$stbtt_GetScaledFontVMetrics = RawFunctionLoader.link(SEGMENT$stbtt_GetScaledFontVMetrics, Descriptors.DESCRIPTOR$stbtt_GetScaledFontVMetrics);
        SEGMENT$stbtt_InitFont = loader.apply("stbtt_InitFont");
        HANDLE$stbtt_InitFont = RawFunctionLoader.link(SEGMENT$stbtt_InitFont, Descriptors.DESCRIPTOR$stbtt_InitFont);
        SEGMENT$stbtt_IsGlyphEmpty = loader.apply("stbtt_IsGlyphEmpty");
        HANDLE$stbtt_IsGlyphEmpty = RawFunctionLoader.link(SEGMENT$stbtt_IsGlyphEmpty, Descriptors.DESCRIPTOR$stbtt_IsGlyphEmpty);
        SEGMENT$stbtt_MakeCodepointBitmap = loader.apply("stbtt_MakeCodepointBitmap");
        HANDLE$stbtt_MakeCodepointBitmap = RawFunctionLoader.link(SEGMENT$stbtt_MakeCodepointBitmap, Descriptors.DESCRIPTOR$stbtt_MakeCodepointBitmap);
        SEGMENT$stbtt_MakeCodepointBitmapSubpixel = loader.apply("stbtt_MakeCodepointBitmapSubpixel");
        HANDLE$stbtt_MakeCodepointBitmapSubpixel = RawFunctionLoader.link(SEGMENT$stbtt_MakeCodepointBitmapSubpixel, Descriptors.DESCRIPTOR$stbtt_MakeCodepointBitmapSubpixel);
        SEGMENT$stbtt_MakeCodepointBitmapSubpixelPrefilter = loader.apply("stbtt_MakeCodepointBitmapSubpixelPrefilter");
        HANDLE$stbtt_MakeCodepointBitmapSubpixelPrefilter = RawFunctionLoader.link(SEGMENT$stbtt_MakeCodepointBitmapSubpixelPrefilter, Descriptors.DESCRIPTOR$stbtt_MakeCodepointBitmapSubpixelPrefilter);
        SEGMENT$stbtt_MakeGlyphBitmap = loader.apply("stbtt_MakeGlyphBitmap");
        HANDLE$stbtt_MakeGlyphBitmap = RawFunctionLoader.link(SEGMENT$stbtt_MakeGlyphBitmap, Descriptors.DESCRIPTOR$stbtt_MakeGlyphBitmap);
        SEGMENT$stbtt_MakeGlyphBitmapSubpixel = loader.apply("stbtt_MakeGlyphBitmapSubpixel");
        HANDLE$stbtt_MakeGlyphBitmapSubpixel = RawFunctionLoader.link(SEGMENT$stbtt_MakeGlyphBitmapSubpixel, Descriptors.DESCRIPTOR$stbtt_MakeGlyphBitmapSubpixel);
        SEGMENT$stbtt_MakeGlyphBitmapSubpixelPrefilter = loader.apply("stbtt_MakeGlyphBitmapSubpixelPrefilter");
        HANDLE$stbtt_MakeGlyphBitmapSubpixelPrefilter = RawFunctionLoader.link(SEGMENT$stbtt_MakeGlyphBitmapSubpixelPrefilter, Descriptors.DESCRIPTOR$stbtt_MakeGlyphBitmapSubpixelPrefilter);
        SEGMENT$stbtt_PackBegin = loader.apply("stbtt_PackBegin");
        HANDLE$stbtt_PackBegin = RawFunctionLoader.link(SEGMENT$stbtt_PackBegin, Descriptors.DESCRIPTOR$stbtt_PackBegin);
        SEGMENT$stbtt_PackEnd = loader.apply("stbtt_PackEnd");
        HANDLE$stbtt_PackEnd = RawFunctionLoader.link(SEGMENT$stbtt_PackEnd, Descriptors.DESCRIPTOR$stbtt_PackEnd);
        SEGMENT$stbtt_PackFontRange = loader.apply("stbtt_PackFontRange");
        HANDLE$stbtt_PackFontRange = RawFunctionLoader.link(SEGMENT$stbtt_PackFontRange, Descriptors.DESCRIPTOR$stbtt_PackFontRange);
        SEGMENT$stbtt_PackFontRanges = loader.apply("stbtt_PackFontRanges");
        HANDLE$stbtt_PackFontRanges = RawFunctionLoader.link(SEGMENT$stbtt_PackFontRanges, Descriptors.DESCRIPTOR$stbtt_PackFontRanges);
        SEGMENT$stbtt_PackFontRangesGatherRects = loader.apply("stbtt_PackFontRangesGatherRects");
        HANDLE$stbtt_PackFontRangesGatherRects = RawFunctionLoader.link(SEGMENT$stbtt_PackFontRangesGatherRects, Descriptors.DESCRIPTOR$stbtt_PackFontRangesGatherRects);
        SEGMENT$stbtt_PackFontRangesPackRects = loader.apply("stbtt_PackFontRangesPackRects");
        HANDLE$stbtt_PackFontRangesPackRects = RawFunctionLoader.link(SEGMENT$stbtt_PackFontRangesPackRects, Descriptors.DESCRIPTOR$stbtt_PackFontRangesPackRects);
        SEGMENT$stbtt_PackFontRangesRenderIntoRects = loader.apply("stbtt_PackFontRangesRenderIntoRects");
        HANDLE$stbtt_PackFontRangesRenderIntoRects = RawFunctionLoader.link(SEGMENT$stbtt_PackFontRangesRenderIntoRects, Descriptors.DESCRIPTOR$stbtt_PackFontRangesRenderIntoRects);
        SEGMENT$stbtt_PackSetOversampling = loader.apply("stbtt_PackSetOversampling");
        HANDLE$stbtt_PackSetOversampling = RawFunctionLoader.link(SEGMENT$stbtt_PackSetOversampling, Descriptors.DESCRIPTOR$stbtt_PackSetOversampling);
        SEGMENT$stbtt_PackSetSkipMissingCodepoints = loader.apply("stbtt_PackSetSkipMissingCodepoints");
        HANDLE$stbtt_PackSetSkipMissingCodepoints = RawFunctionLoader.link(SEGMENT$stbtt_PackSetSkipMissingCodepoints, Descriptors.DESCRIPTOR$stbtt_PackSetSkipMissingCodepoints);
        SEGMENT$stbtt_Rasterize = loader.apply("stbtt_Rasterize");
        HANDLE$stbtt_Rasterize = RawFunctionLoader.link(SEGMENT$stbtt_Rasterize, Descriptors.DESCRIPTOR$stbtt_Rasterize);
        SEGMENT$stbtt_ScaleForMappingEmToPixels = loader.apply("stbtt_ScaleForMappingEmToPixels");
        HANDLE$stbtt_ScaleForMappingEmToPixels = RawFunctionLoader.link(SEGMENT$stbtt_ScaleForMappingEmToPixels, Descriptors.DESCRIPTOR$stbtt_ScaleForMappingEmToPixels);
        SEGMENT$stbtt_ScaleForPixelHeight = loader.apply("stbtt_ScaleForPixelHeight");
        HANDLE$stbtt_ScaleForPixelHeight = RawFunctionLoader.link(SEGMENT$stbtt_ScaleForPixelHeight, Descriptors.DESCRIPTOR$stbtt_ScaleForPixelHeight);
    }

    // region command wrappers

    public int bakeFontBitmap(
        @Nullable BytePtr data,
        int offset,
        float pixelHeight,
        @Nullable BytePtr pixels,
        int pw,
        int ph,
        int firstChar,
        int numChars,
        @Nullable @Pointer ISTBTT_Bakedchar chardata
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$stbtt_BakeFontBitmap);
        try {
            return (int) hFunction.invokeExact(
                (MemorySegment) (data != null ? data.segment() : MemorySegment.NULL),
                offset,
                pixelHeight,
                (MemorySegment) (pixels != null ? pixels.segment() : MemorySegment.NULL),
                pw,
                ph,
                firstChar,
                numChars,
                (MemorySegment) (chardata != null ? chardata.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public int compareUTF8toUTF16_bigendian(
        @Nullable BytePtr s1,
        int len1,
        @Nullable BytePtr s2,
        int len2
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$stbtt_CompareUTF8toUTF16_bigendian);
        try {
            return (int) hFunction.invokeExact(
                (MemorySegment) (s1 != null ? s1.segment() : MemorySegment.NULL),
                len1,
                (MemorySegment) (s2 != null ? s2.segment() : MemorySegment.NULL),
                len2
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public int findGlyphIndex(
        @Nullable @Pointer ISTBTT_Fontinfo info,
        int unicodeCodepoint
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$stbtt_FindGlyphIndex);
        try {
            return (int) hFunction.invokeExact(
                (MemorySegment) (info != null ? info.segment() : MemorySegment.NULL),
                unicodeCodepoint
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public int findMatchingFont(
        @Nullable BytePtr fontdata,
        @Nullable BytePtr name,
        int flags
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$stbtt_FindMatchingFont);
        try {
            return (int) hFunction.invokeExact(
                (MemorySegment) (fontdata != null ? fontdata.segment() : MemorySegment.NULL),
                (MemorySegment) (name != null ? name.segment() : MemorySegment.NULL),
                flags
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public BytePtr findSVGDoc(
        @Nullable @Pointer ISTBTT_Fontinfo info,
        int gl
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$stbtt_FindSVGDoc);
        try {
            MemorySegment s = (MemorySegment) hFunction.invokeExact(
                (MemorySegment) (info != null ? info.segment() : MemorySegment.NULL),
                gl
            );
            return s.equals(MemorySegment.NULL) ? null : new BytePtr(s);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void freeBitmap(
        @Nullable BytePtr bitmap,
        @Pointer(comment="void*") @NotNull MemorySegment userdata
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$stbtt_FreeBitmap);
        try {
            hFunction.invokeExact(
                (MemorySegment) (bitmap != null ? bitmap.segment() : MemorySegment.NULL),
                userdata
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void freeSDF(
        @Nullable BytePtr bitmap,
        @Pointer(comment="void*") @NotNull MemorySegment userdata
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$stbtt_FreeSDF);
        try {
            hFunction.invokeExact(
                (MemorySegment) (bitmap != null ? bitmap.segment() : MemorySegment.NULL),
                userdata
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void freeShape(
        @Nullable @Pointer ISTBTT_Fontinfo info,
        @Nullable @Pointer ISTBTT_Vertex vertices
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$stbtt_FreeShape);
        try {
            hFunction.invokeExact(
                (MemorySegment) (info != null ? info.segment() : MemorySegment.NULL),
                (MemorySegment) (vertices != null ? vertices.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void getBakedQuad(
        @Nullable @Pointer ISTBTT_Bakedchar chardata,
        int pw,
        int ph,
        int charIndex,
        @Nullable FloatPtr xpos,
        @Nullable FloatPtr ypos,
        @Nullable @Pointer ISTBTT_AlignedQuad q,
        int openglFillrule
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$stbtt_GetBakedQuad);
        try {
            hFunction.invokeExact(
                (MemorySegment) (chardata != null ? chardata.segment() : MemorySegment.NULL),
                pw,
                ph,
                charIndex,
                (MemorySegment) (xpos != null ? xpos.segment() : MemorySegment.NULL),
                (MemorySegment) (ypos != null ? ypos.segment() : MemorySegment.NULL),
                (MemorySegment) (q != null ? q.segment() : MemorySegment.NULL),
                openglFillrule
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public BytePtr getCodepointBitmap(
        @Nullable @Pointer ISTBTT_Fontinfo info,
        float scaleX,
        float scaleY,
        int codepoint,
        @Nullable IntPtr width,
        @Nullable IntPtr height,
        @Nullable IntPtr xoff,
        @Nullable IntPtr yoff
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$stbtt_GetCodepointBitmap);
        try {
            MemorySegment s = (MemorySegment) hFunction.invokeExact(
                (MemorySegment) (info != null ? info.segment() : MemorySegment.NULL),
                scaleX,
                scaleY,
                codepoint,
                (MemorySegment) (width != null ? width.segment() : MemorySegment.NULL),
                (MemorySegment) (height != null ? height.segment() : MemorySegment.NULL),
                (MemorySegment) (xoff != null ? xoff.segment() : MemorySegment.NULL),
                (MemorySegment) (yoff != null ? yoff.segment() : MemorySegment.NULL)
            );
            return s.equals(MemorySegment.NULL) ? null : new BytePtr(s);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void getCodepointBitmapBox(
        @Nullable @Pointer ISTBTT_Fontinfo font,
        int codepoint,
        float scaleX,
        float scaleY,
        @Nullable IntPtr ix0,
        @Nullable IntPtr iy0,
        @Nullable IntPtr ix1,
        @Nullable IntPtr iy1
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$stbtt_GetCodepointBitmapBox);
        try {
            hFunction.invokeExact(
                (MemorySegment) (font != null ? font.segment() : MemorySegment.NULL),
                codepoint,
                scaleX,
                scaleY,
                (MemorySegment) (ix0 != null ? ix0.segment() : MemorySegment.NULL),
                (MemorySegment) (iy0 != null ? iy0.segment() : MemorySegment.NULL),
                (MemorySegment) (ix1 != null ? ix1.segment() : MemorySegment.NULL),
                (MemorySegment) (iy1 != null ? iy1.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void getCodepointBitmapBoxSubpixel(
        @Nullable @Pointer ISTBTT_Fontinfo font,
        int codepoint,
        float scaleX,
        float scaleY,
        float shiftX,
        float shiftY,
        @Nullable IntPtr ix0,
        @Nullable IntPtr iy0,
        @Nullable IntPtr ix1,
        @Nullable IntPtr iy1
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$stbtt_GetCodepointBitmapBoxSubpixel);
        try {
            hFunction.invokeExact(
                (MemorySegment) (font != null ? font.segment() : MemorySegment.NULL),
                codepoint,
                scaleX,
                scaleY,
                shiftX,
                shiftY,
                (MemorySegment) (ix0 != null ? ix0.segment() : MemorySegment.NULL),
                (MemorySegment) (iy0 != null ? iy0.segment() : MemorySegment.NULL),
                (MemorySegment) (ix1 != null ? ix1.segment() : MemorySegment.NULL),
                (MemorySegment) (iy1 != null ? iy1.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public BytePtr getCodepointBitmapSubpixel(
        @Nullable @Pointer ISTBTT_Fontinfo info,
        float scaleX,
        float scaleY,
        float shiftX,
        float shiftY,
        int codepoint,
        @Nullable IntPtr width,
        @Nullable IntPtr height,
        @Nullable IntPtr xoff,
        @Nullable IntPtr yoff
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$stbtt_GetCodepointBitmapSubpixel);
        try {
            MemorySegment s = (MemorySegment) hFunction.invokeExact(
                (MemorySegment) (info != null ? info.segment() : MemorySegment.NULL),
                scaleX,
                scaleY,
                shiftX,
                shiftY,
                codepoint,
                (MemorySegment) (width != null ? width.segment() : MemorySegment.NULL),
                (MemorySegment) (height != null ? height.segment() : MemorySegment.NULL),
                (MemorySegment) (xoff != null ? xoff.segment() : MemorySegment.NULL),
                (MemorySegment) (yoff != null ? yoff.segment() : MemorySegment.NULL)
            );
            return s.equals(MemorySegment.NULL) ? null : new BytePtr(s);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public int getCodepointBox(
        @Nullable @Pointer ISTBTT_Fontinfo info,
        int codepoint,
        @Nullable IntPtr x0,
        @Nullable IntPtr y0,
        @Nullable IntPtr x1,
        @Nullable IntPtr y1
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$stbtt_GetCodepointBox);
        try {
            return (int) hFunction.invokeExact(
                (MemorySegment) (info != null ? info.segment() : MemorySegment.NULL),
                codepoint,
                (MemorySegment) (x0 != null ? x0.segment() : MemorySegment.NULL),
                (MemorySegment) (y0 != null ? y0.segment() : MemorySegment.NULL),
                (MemorySegment) (x1 != null ? x1.segment() : MemorySegment.NULL),
                (MemorySegment) (y1 != null ? y1.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void getCodepointHMetrics(
        @Nullable @Pointer ISTBTT_Fontinfo info,
        int codepoint,
        @Nullable IntPtr advancewidth,
        @Nullable IntPtr leftsidebearing
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$stbtt_GetCodepointHMetrics);
        try {
            hFunction.invokeExact(
                (MemorySegment) (info != null ? info.segment() : MemorySegment.NULL),
                codepoint,
                (MemorySegment) (advancewidth != null ? advancewidth.segment() : MemorySegment.NULL),
                (MemorySegment) (leftsidebearing != null ? leftsidebearing.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public int getCodepointKernAdvance(
        @Nullable @Pointer ISTBTT_Fontinfo info,
        int ch1,
        int ch2
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$stbtt_GetCodepointKernAdvance);
        try {
            return (int) hFunction.invokeExact(
                (MemorySegment) (info != null ? info.segment() : MemorySegment.NULL),
                ch1,
                ch2
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public BytePtr getCodepointSDF(
        @Nullable @Pointer ISTBTT_Fontinfo info,
        float scale,
        int codepoint,
        int padding,
        byte onedgeValue,
        float pixelDistScale,
        @Nullable IntPtr width,
        @Nullable IntPtr height,
        @Nullable IntPtr xoff,
        @Nullable IntPtr yoff
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$stbtt_GetCodepointSDF);
        try {
            MemorySegment s = (MemorySegment) hFunction.invokeExact(
                (MemorySegment) (info != null ? info.segment() : MemorySegment.NULL),
                scale,
                codepoint,
                padding,
                onedgeValue,
                pixelDistScale,
                (MemorySegment) (width != null ? width.segment() : MemorySegment.NULL),
                (MemorySegment) (height != null ? height.segment() : MemorySegment.NULL),
                (MemorySegment) (xoff != null ? xoff.segment() : MemorySegment.NULL),
                (MemorySegment) (yoff != null ? yoff.segment() : MemorySegment.NULL)
            );
            return s.equals(MemorySegment.NULL) ? null : new BytePtr(s);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public int getCodepointSVG(
        @Nullable @Pointer ISTBTT_Fontinfo info,
        int unicodeCodepoint,
        @Nullable PointerPtr svg
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$stbtt_GetCodepointSVG);
        try {
            return (int) hFunction.invokeExact(
                (MemorySegment) (info != null ? info.segment() : MemorySegment.NULL),
                unicodeCodepoint,
                (MemorySegment) (svg != null ? svg.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public int getCodepointShape(
        @Nullable @Pointer ISTBTT_Fontinfo info,
        int unicodeCodepoint,
        @Nullable PointerPtr vertices
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$stbtt_GetCodepointShape);
        try {
            return (int) hFunction.invokeExact(
                (MemorySegment) (info != null ? info.segment() : MemorySegment.NULL),
                unicodeCodepoint,
                (MemorySegment) (vertices != null ? vertices.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void getFontBoundingBox(
        @Nullable @Pointer ISTBTT_Fontinfo info,
        @Nullable IntPtr x0,
        @Nullable IntPtr y0,
        @Nullable IntPtr x1,
        @Nullable IntPtr y1
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$stbtt_GetFontBoundingBox);
        try {
            hFunction.invokeExact(
                (MemorySegment) (info != null ? info.segment() : MemorySegment.NULL),
                (MemorySegment) (x0 != null ? x0.segment() : MemorySegment.NULL),
                (MemorySegment) (y0 != null ? y0.segment() : MemorySegment.NULL),
                (MemorySegment) (x1 != null ? x1.segment() : MemorySegment.NULL),
                (MemorySegment) (y1 != null ? y1.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public BytePtr getFontNameString(
        @Nullable @Pointer ISTBTT_Fontinfo font,
        @Nullable IntPtr length,
        int platformid,
        int encodingid,
        int languageid,
        int nameid
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$stbtt_GetFontNameString);
        try {
            MemorySegment s = (MemorySegment) hFunction.invokeExact(
                (MemorySegment) (font != null ? font.segment() : MemorySegment.NULL),
                (MemorySegment) (length != null ? length.segment() : MemorySegment.NULL),
                platformid,
                encodingid,
                languageid,
                nameid
            );
            return s.equals(MemorySegment.NULL) ? null : new BytePtr(s);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public int getFontOffsetForIndex(
        @Nullable BytePtr data,
        int index
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$stbtt_GetFontOffsetForIndex);
        try {
            return (int) hFunction.invokeExact(
                (MemorySegment) (data != null ? data.segment() : MemorySegment.NULL),
                index
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void getFontVMetrics(
        @Nullable @Pointer ISTBTT_Fontinfo info,
        @Nullable IntPtr ascent,
        @Nullable IntPtr descent,
        @Nullable IntPtr linegap
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$stbtt_GetFontVMetrics);
        try {
            hFunction.invokeExact(
                (MemorySegment) (info != null ? info.segment() : MemorySegment.NULL),
                (MemorySegment) (ascent != null ? ascent.segment() : MemorySegment.NULL),
                (MemorySegment) (descent != null ? descent.segment() : MemorySegment.NULL),
                (MemorySegment) (linegap != null ? linegap.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public int getFontVMetricsOS2(
        @Nullable @Pointer ISTBTT_Fontinfo info,
        @Nullable IntPtr typoascent,
        @Nullable IntPtr typodescent,
        @Nullable IntPtr typolinegap
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$stbtt_GetFontVMetricsOS2);
        try {
            return (int) hFunction.invokeExact(
                (MemorySegment) (info != null ? info.segment() : MemorySegment.NULL),
                (MemorySegment) (typoascent != null ? typoascent.segment() : MemorySegment.NULL),
                (MemorySegment) (typodescent != null ? typodescent.segment() : MemorySegment.NULL),
                (MemorySegment) (typolinegap != null ? typolinegap.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public BytePtr getGlyphBitmap(
        @Nullable @Pointer ISTBTT_Fontinfo info,
        float scaleX,
        float scaleY,
        int glyph,
        @Nullable IntPtr width,
        @Nullable IntPtr height,
        @Nullable IntPtr xoff,
        @Nullable IntPtr yoff
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$stbtt_GetGlyphBitmap);
        try {
            MemorySegment s = (MemorySegment) hFunction.invokeExact(
                (MemorySegment) (info != null ? info.segment() : MemorySegment.NULL),
                scaleX,
                scaleY,
                glyph,
                (MemorySegment) (width != null ? width.segment() : MemorySegment.NULL),
                (MemorySegment) (height != null ? height.segment() : MemorySegment.NULL),
                (MemorySegment) (xoff != null ? xoff.segment() : MemorySegment.NULL),
                (MemorySegment) (yoff != null ? yoff.segment() : MemorySegment.NULL)
            );
            return s.equals(MemorySegment.NULL) ? null : new BytePtr(s);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void getGlyphBitmapBox(
        @Nullable @Pointer ISTBTT_Fontinfo font,
        int glyph,
        float scaleX,
        float scaleY,
        @Nullable IntPtr ix0,
        @Nullable IntPtr iy0,
        @Nullable IntPtr ix1,
        @Nullable IntPtr iy1
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$stbtt_GetGlyphBitmapBox);
        try {
            hFunction.invokeExact(
                (MemorySegment) (font != null ? font.segment() : MemorySegment.NULL),
                glyph,
                scaleX,
                scaleY,
                (MemorySegment) (ix0 != null ? ix0.segment() : MemorySegment.NULL),
                (MemorySegment) (iy0 != null ? iy0.segment() : MemorySegment.NULL),
                (MemorySegment) (ix1 != null ? ix1.segment() : MemorySegment.NULL),
                (MemorySegment) (iy1 != null ? iy1.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void getGlyphBitmapBoxSubpixel(
        @Nullable @Pointer ISTBTT_Fontinfo font,
        int glyph,
        float scaleX,
        float scaleY,
        float shiftX,
        float shiftY,
        @Nullable IntPtr ix0,
        @Nullable IntPtr iy0,
        @Nullable IntPtr ix1,
        @Nullable IntPtr iy1
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$stbtt_GetGlyphBitmapBoxSubpixel);
        try {
            hFunction.invokeExact(
                (MemorySegment) (font != null ? font.segment() : MemorySegment.NULL),
                glyph,
                scaleX,
                scaleY,
                shiftX,
                shiftY,
                (MemorySegment) (ix0 != null ? ix0.segment() : MemorySegment.NULL),
                (MemorySegment) (iy0 != null ? iy0.segment() : MemorySegment.NULL),
                (MemorySegment) (ix1 != null ? ix1.segment() : MemorySegment.NULL),
                (MemorySegment) (iy1 != null ? iy1.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public BytePtr getGlyphBitmapSubpixel(
        @Nullable @Pointer ISTBTT_Fontinfo info,
        float scaleX,
        float scaleY,
        float shiftX,
        float shiftY,
        int glyph,
        @Nullable IntPtr width,
        @Nullable IntPtr height,
        @Nullable IntPtr xoff,
        @Nullable IntPtr yoff
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$stbtt_GetGlyphBitmapSubpixel);
        try {
            MemorySegment s = (MemorySegment) hFunction.invokeExact(
                (MemorySegment) (info != null ? info.segment() : MemorySegment.NULL),
                scaleX,
                scaleY,
                shiftX,
                shiftY,
                glyph,
                (MemorySegment) (width != null ? width.segment() : MemorySegment.NULL),
                (MemorySegment) (height != null ? height.segment() : MemorySegment.NULL),
                (MemorySegment) (xoff != null ? xoff.segment() : MemorySegment.NULL),
                (MemorySegment) (yoff != null ? yoff.segment() : MemorySegment.NULL)
            );
            return s.equals(MemorySegment.NULL) ? null : new BytePtr(s);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public int getGlyphBox(
        @Nullable @Pointer ISTBTT_Fontinfo info,
        int glyphIndex,
        @Nullable IntPtr x0,
        @Nullable IntPtr y0,
        @Nullable IntPtr x1,
        @Nullable IntPtr y1
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$stbtt_GetGlyphBox);
        try {
            return (int) hFunction.invokeExact(
                (MemorySegment) (info != null ? info.segment() : MemorySegment.NULL),
                glyphIndex,
                (MemorySegment) (x0 != null ? x0.segment() : MemorySegment.NULL),
                (MemorySegment) (y0 != null ? y0.segment() : MemorySegment.NULL),
                (MemorySegment) (x1 != null ? x1.segment() : MemorySegment.NULL),
                (MemorySegment) (y1 != null ? y1.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void getGlyphHMetrics(
        @Nullable @Pointer ISTBTT_Fontinfo info,
        int glyphIndex,
        @Nullable IntPtr advancewidth,
        @Nullable IntPtr leftsidebearing
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$stbtt_GetGlyphHMetrics);
        try {
            hFunction.invokeExact(
                (MemorySegment) (info != null ? info.segment() : MemorySegment.NULL),
                glyphIndex,
                (MemorySegment) (advancewidth != null ? advancewidth.segment() : MemorySegment.NULL),
                (MemorySegment) (leftsidebearing != null ? leftsidebearing.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public int getGlyphKernAdvance(
        @Nullable @Pointer ISTBTT_Fontinfo info,
        int glyph1,
        int glyph2
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$stbtt_GetGlyphKernAdvance);
        try {
            return (int) hFunction.invokeExact(
                (MemorySegment) (info != null ? info.segment() : MemorySegment.NULL),
                glyph1,
                glyph2
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public BytePtr getGlyphSDF(
        @Nullable @Pointer ISTBTT_Fontinfo info,
        float scale,
        int glyph,
        int padding,
        byte onedgeValue,
        float pixelDistScale,
        @Nullable IntPtr width,
        @Nullable IntPtr height,
        @Nullable IntPtr xoff,
        @Nullable IntPtr yoff
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$stbtt_GetGlyphSDF);
        try {
            MemorySegment s = (MemorySegment) hFunction.invokeExact(
                (MemorySegment) (info != null ? info.segment() : MemorySegment.NULL),
                scale,
                glyph,
                padding,
                onedgeValue,
                pixelDistScale,
                (MemorySegment) (width != null ? width.segment() : MemorySegment.NULL),
                (MemorySegment) (height != null ? height.segment() : MemorySegment.NULL),
                (MemorySegment) (xoff != null ? xoff.segment() : MemorySegment.NULL),
                (MemorySegment) (yoff != null ? yoff.segment() : MemorySegment.NULL)
            );
            return s.equals(MemorySegment.NULL) ? null : new BytePtr(s);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public int getGlyphSVG(
        @Nullable @Pointer ISTBTT_Fontinfo info,
        int gl,
        @Nullable PointerPtr svg
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$stbtt_GetGlyphSVG);
        try {
            return (int) hFunction.invokeExact(
                (MemorySegment) (info != null ? info.segment() : MemorySegment.NULL),
                gl,
                (MemorySegment) (svg != null ? svg.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public int getGlyphShape(
        @Nullable @Pointer ISTBTT_Fontinfo info,
        int glyphIndex,
        @Nullable PointerPtr vertices
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$stbtt_GetGlyphShape);
        try {
            return (int) hFunction.invokeExact(
                (MemorySegment) (info != null ? info.segment() : MemorySegment.NULL),
                glyphIndex,
                (MemorySegment) (vertices != null ? vertices.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public int getKerningTable(
        @Nullable @Pointer ISTBTT_Fontinfo info,
        @Nullable @Pointer ISTBTT_Kerningentry table,
        int tableLength
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$stbtt_GetKerningTable);
        try {
            return (int) hFunction.invokeExact(
                (MemorySegment) (info != null ? info.segment() : MemorySegment.NULL),
                (MemorySegment) (table != null ? table.segment() : MemorySegment.NULL),
                tableLength
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public int getKerningTableLength(
        @Nullable @Pointer ISTBTT_Fontinfo info
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$stbtt_GetKerningTableLength);
        try {
            return (int) hFunction.invokeExact(
                (MemorySegment) (info != null ? info.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public int getNumberOfFonts(
        @Nullable BytePtr data
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$stbtt_GetNumberOfFonts);
        try {
            return (int) hFunction.invokeExact(
                (MemorySegment) (data != null ? data.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void getPackedQuad(
        @Nullable @Pointer ISTBTT_Packedchar chardata,
        int pw,
        int ph,
        int charIndex,
        @Nullable FloatPtr xpos,
        @Nullable FloatPtr ypos,
        @Nullable @Pointer ISTBTT_AlignedQuad q,
        int alignToInteger
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$stbtt_GetPackedQuad);
        try {
            hFunction.invokeExact(
                (MemorySegment) (chardata != null ? chardata.segment() : MemorySegment.NULL),
                pw,
                ph,
                charIndex,
                (MemorySegment) (xpos != null ? xpos.segment() : MemorySegment.NULL),
                (MemorySegment) (ypos != null ? ypos.segment() : MemorySegment.NULL),
                (MemorySegment) (q != null ? q.segment() : MemorySegment.NULL),
                alignToInteger
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void getScaledFontVMetrics(
        @Nullable BytePtr fontdata,
        int index,
        float size,
        @Nullable FloatPtr ascent,
        @Nullable FloatPtr descent,
        @Nullable FloatPtr linegap
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$stbtt_GetScaledFontVMetrics);
        try {
            hFunction.invokeExact(
                (MemorySegment) (fontdata != null ? fontdata.segment() : MemorySegment.NULL),
                index,
                size,
                (MemorySegment) (ascent != null ? ascent.segment() : MemorySegment.NULL),
                (MemorySegment) (descent != null ? descent.segment() : MemorySegment.NULL),
                (MemorySegment) (linegap != null ? linegap.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public int initFont(
        @Nullable @Pointer ISTBTT_Fontinfo info,
        @Nullable BytePtr data,
        int offset
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$stbtt_InitFont);
        try {
            return (int) hFunction.invokeExact(
                (MemorySegment) (info != null ? info.segment() : MemorySegment.NULL),
                (MemorySegment) (data != null ? data.segment() : MemorySegment.NULL),
                offset
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public int isGlyphEmpty(
        @Nullable @Pointer ISTBTT_Fontinfo info,
        int glyphIndex
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$stbtt_IsGlyphEmpty);
        try {
            return (int) hFunction.invokeExact(
                (MemorySegment) (info != null ? info.segment() : MemorySegment.NULL),
                glyphIndex
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void makeCodepointBitmap(
        @Nullable @Pointer ISTBTT_Fontinfo info,
        @Nullable BytePtr output,
        int outW,
        int outH,
        int outStride,
        float scaleX,
        float scaleY,
        int codepoint
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$stbtt_MakeCodepointBitmap);
        try {
            hFunction.invokeExact(
                (MemorySegment) (info != null ? info.segment() : MemorySegment.NULL),
                (MemorySegment) (output != null ? output.segment() : MemorySegment.NULL),
                outW,
                outH,
                outStride,
                scaleX,
                scaleY,
                codepoint
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void makeCodepointBitmapSubpixel(
        @Nullable @Pointer ISTBTT_Fontinfo info,
        @Nullable BytePtr output,
        int outW,
        int outH,
        int outStride,
        float scaleX,
        float scaleY,
        float shiftX,
        float shiftY,
        int codepoint
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$stbtt_MakeCodepointBitmapSubpixel);
        try {
            hFunction.invokeExact(
                (MemorySegment) (info != null ? info.segment() : MemorySegment.NULL),
                (MemorySegment) (output != null ? output.segment() : MemorySegment.NULL),
                outW,
                outH,
                outStride,
                scaleX,
                scaleY,
                shiftX,
                shiftY,
                codepoint
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void makeCodepointBitmapSubpixelPrefilter(
        @Nullable @Pointer ISTBTT_Fontinfo info,
        @Nullable BytePtr output,
        int outW,
        int outH,
        int outStride,
        float scaleX,
        float scaleY,
        float shiftX,
        float shiftY,
        int oversampleX,
        int oversampleY,
        @Nullable FloatPtr subX,
        @Nullable FloatPtr subY,
        int codepoint
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$stbtt_MakeCodepointBitmapSubpixelPrefilter);
        try {
            hFunction.invokeExact(
                (MemorySegment) (info != null ? info.segment() : MemorySegment.NULL),
                (MemorySegment) (output != null ? output.segment() : MemorySegment.NULL),
                outW,
                outH,
                outStride,
                scaleX,
                scaleY,
                shiftX,
                shiftY,
                oversampleX,
                oversampleY,
                (MemorySegment) (subX != null ? subX.segment() : MemorySegment.NULL),
                (MemorySegment) (subY != null ? subY.segment() : MemorySegment.NULL),
                codepoint
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void makeGlyphBitmap(
        @Nullable @Pointer ISTBTT_Fontinfo info,
        @Nullable BytePtr output,
        int outW,
        int outH,
        int outStride,
        float scaleX,
        float scaleY,
        int glyph
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$stbtt_MakeGlyphBitmap);
        try {
            hFunction.invokeExact(
                (MemorySegment) (info != null ? info.segment() : MemorySegment.NULL),
                (MemorySegment) (output != null ? output.segment() : MemorySegment.NULL),
                outW,
                outH,
                outStride,
                scaleX,
                scaleY,
                glyph
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void makeGlyphBitmapSubpixel(
        @Nullable @Pointer ISTBTT_Fontinfo info,
        @Nullable BytePtr output,
        int outW,
        int outH,
        int outStride,
        float scaleX,
        float scaleY,
        float shiftX,
        float shiftY,
        int glyph
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$stbtt_MakeGlyphBitmapSubpixel);
        try {
            hFunction.invokeExact(
                (MemorySegment) (info != null ? info.segment() : MemorySegment.NULL),
                (MemorySegment) (output != null ? output.segment() : MemorySegment.NULL),
                outW,
                outH,
                outStride,
                scaleX,
                scaleY,
                shiftX,
                shiftY,
                glyph
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void makeGlyphBitmapSubpixelPrefilter(
        @Nullable @Pointer ISTBTT_Fontinfo info,
        @Nullable BytePtr output,
        int outW,
        int outH,
        int outStride,
        float scaleX,
        float scaleY,
        float shiftX,
        float shiftY,
        int oversampleX,
        int oversampleY,
        @Nullable FloatPtr subX,
        @Nullable FloatPtr subY,
        int glyph
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$stbtt_MakeGlyphBitmapSubpixelPrefilter);
        try {
            hFunction.invokeExact(
                (MemorySegment) (info != null ? info.segment() : MemorySegment.NULL),
                (MemorySegment) (output != null ? output.segment() : MemorySegment.NULL),
                outW,
                outH,
                outStride,
                scaleX,
                scaleY,
                shiftX,
                shiftY,
                oversampleX,
                oversampleY,
                (MemorySegment) (subX != null ? subX.segment() : MemorySegment.NULL),
                (MemorySegment) (subY != null ? subY.segment() : MemorySegment.NULL),
                glyph
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public int packBegin(
        @Nullable @Pointer ISTBTT_PackContext spc,
        @Nullable BytePtr pixels,
        int width,
        int height,
        int strideInBytes,
        int padding,
        @Pointer(comment="void*") @NotNull MemorySegment allocContext
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$stbtt_PackBegin);
        try {
            return (int) hFunction.invokeExact(
                (MemorySegment) (spc != null ? spc.segment() : MemorySegment.NULL),
                (MemorySegment) (pixels != null ? pixels.segment() : MemorySegment.NULL),
                width,
                height,
                strideInBytes,
                padding,
                allocContext
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void packEnd(
        @Nullable @Pointer ISTBTT_PackContext spc
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$stbtt_PackEnd);
        try {
            hFunction.invokeExact(
                (MemorySegment) (spc != null ? spc.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public int packFontRange(
        @Nullable @Pointer ISTBTT_PackContext spc,
        @Nullable BytePtr fontdata,
        int fontIndex,
        float fontSize,
        int firstUnicodeCharInRange,
        int numCharsInRange,
        @Nullable @Pointer ISTBTT_Packedchar chardataForRange
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$stbtt_PackFontRange);
        try {
            return (int) hFunction.invokeExact(
                (MemorySegment) (spc != null ? spc.segment() : MemorySegment.NULL),
                (MemorySegment) (fontdata != null ? fontdata.segment() : MemorySegment.NULL),
                fontIndex,
                fontSize,
                firstUnicodeCharInRange,
                numCharsInRange,
                (MemorySegment) (chardataForRange != null ? chardataForRange.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public int packFontRanges(
        @Nullable @Pointer ISTBTT_PackContext spc,
        @Nullable BytePtr fontdata,
        int fontIndex,
        @Nullable @Pointer ISTBTT_PackRange ranges,
        int numRanges
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$stbtt_PackFontRanges);
        try {
            return (int) hFunction.invokeExact(
                (MemorySegment) (spc != null ? spc.segment() : MemorySegment.NULL),
                (MemorySegment) (fontdata != null ? fontdata.segment() : MemorySegment.NULL),
                fontIndex,
                (MemorySegment) (ranges != null ? ranges.segment() : MemorySegment.NULL),
                numRanges
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public int packFontRangesGatherRects(
        @Nullable @Pointer ISTBTT_PackContext spc,
        @Nullable @Pointer ISTBTT_Fontinfo info,
        @Nullable @Pointer ISTBTT_PackRange ranges,
        int numRanges,
        @Nullable STBRP_Rect rects
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$stbtt_PackFontRangesGatherRects);
        try {
            return (int) hFunction.invokeExact(
                (MemorySegment) (spc != null ? spc.segment() : MemorySegment.NULL),
                (MemorySegment) (info != null ? info.segment() : MemorySegment.NULL),
                (MemorySegment) (ranges != null ? ranges.segment() : MemorySegment.NULL),
                numRanges,
                (MemorySegment) (rects != null ? rects.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void packFontRangesPackRects(
        @Nullable @Pointer ISTBTT_PackContext spc,
        @Nullable STBRP_Rect rects,
        int numRects
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$stbtt_PackFontRangesPackRects);
        try {
            hFunction.invokeExact(
                (MemorySegment) (spc != null ? spc.segment() : MemorySegment.NULL),
                (MemorySegment) (rects != null ? rects.segment() : MemorySegment.NULL),
                numRects
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public int packFontRangesRenderIntoRects(
        @Nullable @Pointer ISTBTT_PackContext spc,
        @Nullable @Pointer ISTBTT_Fontinfo info,
        @Nullable @Pointer ISTBTT_PackRange ranges,
        int numRanges,
        @Nullable STBRP_Rect rects
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$stbtt_PackFontRangesRenderIntoRects);
        try {
            return (int) hFunction.invokeExact(
                (MemorySegment) (spc != null ? spc.segment() : MemorySegment.NULL),
                (MemorySegment) (info != null ? info.segment() : MemorySegment.NULL),
                (MemorySegment) (ranges != null ? ranges.segment() : MemorySegment.NULL),
                numRanges,
                (MemorySegment) (rects != null ? rects.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void packSetOversampling(
        @Nullable @Pointer ISTBTT_PackContext spc,
        int hOversample,
        int vOversample
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$stbtt_PackSetOversampling);
        try {
            hFunction.invokeExact(
                (MemorySegment) (spc != null ? spc.segment() : MemorySegment.NULL),
                hOversample,
                vOversample
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void packSetSkipMissingCodepoints(
        @Nullable @Pointer ISTBTT_PackContext spc,
        int skip
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$stbtt_PackSetSkipMissingCodepoints);
        try {
            hFunction.invokeExact(
                (MemorySegment) (spc != null ? spc.segment() : MemorySegment.NULL),
                skip
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void rasterize(
        @Nullable @Pointer ISTBTT_Bitmap result,
        float flatnessInPixels,
        @Nullable @Pointer ISTBTT_Vertex vertices,
        int numVerts,
        float scaleX,
        float scaleY,
        float shiftX,
        float shiftY,
        int xOff,
        int yOff,
        int invert,
        @Pointer(comment="void*") @NotNull MemorySegment userdata
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$stbtt_Rasterize);
        try {
            hFunction.invokeExact(
                (MemorySegment) (result != null ? result.segment() : MemorySegment.NULL),
                flatnessInPixels,
                (MemorySegment) (vertices != null ? vertices.segment() : MemorySegment.NULL),
                numVerts,
                scaleX,
                scaleY,
                shiftX,
                shiftY,
                xOff,
                yOff,
                invert,
                userdata
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public float scaleForMappingEmToPixels(
        @Nullable @Pointer ISTBTT_Fontinfo info,
        float pixels
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$stbtt_ScaleForMappingEmToPixels);
        try {
            return (float) hFunction.invokeExact(
                (MemorySegment) (info != null ? info.segment() : MemorySegment.NULL),
                pixels
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public float scaleForPixelHeight(
        @Nullable @Pointer ISTBTT_Fontinfo info,
        float pixels
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$stbtt_ScaleForPixelHeight);
        try {
            return (float) hFunction.invokeExact(
                (MemorySegment) (info != null ? info.segment() : MemorySegment.NULL),
                pixels
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    // endregion

    // region segments and handles
    public final @Nullable MemorySegment SEGMENT$stbtt_BakeFontBitmap;
    public final @Nullable MemorySegment SEGMENT$stbtt_CompareUTF8toUTF16_bigendian;
    public final @Nullable MemorySegment SEGMENT$stbtt_FindGlyphIndex;
    public final @Nullable MemorySegment SEGMENT$stbtt_FindMatchingFont;
    public final @Nullable MemorySegment SEGMENT$stbtt_FindSVGDoc;
    public final @Nullable MemorySegment SEGMENT$stbtt_FreeBitmap;
    public final @Nullable MemorySegment SEGMENT$stbtt_FreeSDF;
    public final @Nullable MemorySegment SEGMENT$stbtt_FreeShape;
    public final @Nullable MemorySegment SEGMENT$stbtt_GetBakedQuad;
    public final @Nullable MemorySegment SEGMENT$stbtt_GetCodepointBitmap;
    public final @Nullable MemorySegment SEGMENT$stbtt_GetCodepointBitmapBox;
    public final @Nullable MemorySegment SEGMENT$stbtt_GetCodepointBitmapBoxSubpixel;
    public final @Nullable MemorySegment SEGMENT$stbtt_GetCodepointBitmapSubpixel;
    public final @Nullable MemorySegment SEGMENT$stbtt_GetCodepointBox;
    public final @Nullable MemorySegment SEGMENT$stbtt_GetCodepointHMetrics;
    public final @Nullable MemorySegment SEGMENT$stbtt_GetCodepointKernAdvance;
    public final @Nullable MemorySegment SEGMENT$stbtt_GetCodepointSDF;
    public final @Nullable MemorySegment SEGMENT$stbtt_GetCodepointSVG;
    public final @Nullable MemorySegment SEGMENT$stbtt_GetCodepointShape;
    public final @Nullable MemorySegment SEGMENT$stbtt_GetFontBoundingBox;
    public final @Nullable MemorySegment SEGMENT$stbtt_GetFontNameString;
    public final @Nullable MemorySegment SEGMENT$stbtt_GetFontOffsetForIndex;
    public final @Nullable MemorySegment SEGMENT$stbtt_GetFontVMetrics;
    public final @Nullable MemorySegment SEGMENT$stbtt_GetFontVMetricsOS2;
    public final @Nullable MemorySegment SEGMENT$stbtt_GetGlyphBitmap;
    public final @Nullable MemorySegment SEGMENT$stbtt_GetGlyphBitmapBox;
    public final @Nullable MemorySegment SEGMENT$stbtt_GetGlyphBitmapBoxSubpixel;
    public final @Nullable MemorySegment SEGMENT$stbtt_GetGlyphBitmapSubpixel;
    public final @Nullable MemorySegment SEGMENT$stbtt_GetGlyphBox;
    public final @Nullable MemorySegment SEGMENT$stbtt_GetGlyphHMetrics;
    public final @Nullable MemorySegment SEGMENT$stbtt_GetGlyphKernAdvance;
    public final @Nullable MemorySegment SEGMENT$stbtt_GetGlyphSDF;
    public final @Nullable MemorySegment SEGMENT$stbtt_GetGlyphSVG;
    public final @Nullable MemorySegment SEGMENT$stbtt_GetGlyphShape;
    public final @Nullable MemorySegment SEGMENT$stbtt_GetKerningTable;
    public final @Nullable MemorySegment SEGMENT$stbtt_GetKerningTableLength;
    public final @Nullable MemorySegment SEGMENT$stbtt_GetNumberOfFonts;
    public final @Nullable MemorySegment SEGMENT$stbtt_GetPackedQuad;
    public final @Nullable MemorySegment SEGMENT$stbtt_GetScaledFontVMetrics;
    public final @Nullable MemorySegment SEGMENT$stbtt_InitFont;
    public final @Nullable MemorySegment SEGMENT$stbtt_IsGlyphEmpty;
    public final @Nullable MemorySegment SEGMENT$stbtt_MakeCodepointBitmap;
    public final @Nullable MemorySegment SEGMENT$stbtt_MakeCodepointBitmapSubpixel;
    public final @Nullable MemorySegment SEGMENT$stbtt_MakeCodepointBitmapSubpixelPrefilter;
    public final @Nullable MemorySegment SEGMENT$stbtt_MakeGlyphBitmap;
    public final @Nullable MemorySegment SEGMENT$stbtt_MakeGlyphBitmapSubpixel;
    public final @Nullable MemorySegment SEGMENT$stbtt_MakeGlyphBitmapSubpixelPrefilter;
    public final @Nullable MemorySegment SEGMENT$stbtt_PackBegin;
    public final @Nullable MemorySegment SEGMENT$stbtt_PackEnd;
    public final @Nullable MemorySegment SEGMENT$stbtt_PackFontRange;
    public final @Nullable MemorySegment SEGMENT$stbtt_PackFontRanges;
    public final @Nullable MemorySegment SEGMENT$stbtt_PackFontRangesGatherRects;
    public final @Nullable MemorySegment SEGMENT$stbtt_PackFontRangesPackRects;
    public final @Nullable MemorySegment SEGMENT$stbtt_PackFontRangesRenderIntoRects;
    public final @Nullable MemorySegment SEGMENT$stbtt_PackSetOversampling;
    public final @Nullable MemorySegment SEGMENT$stbtt_PackSetSkipMissingCodepoints;
    public final @Nullable MemorySegment SEGMENT$stbtt_Rasterize;
    public final @Nullable MemorySegment SEGMENT$stbtt_ScaleForMappingEmToPixels;
    public final @Nullable MemorySegment SEGMENT$stbtt_ScaleForPixelHeight;
    public final @Nullable MethodHandle HANDLE$stbtt_BakeFontBitmap;
    public final @Nullable MethodHandle HANDLE$stbtt_CompareUTF8toUTF16_bigendian;
    public final @Nullable MethodHandle HANDLE$stbtt_FindGlyphIndex;
    public final @Nullable MethodHandle HANDLE$stbtt_FindMatchingFont;
    public final @Nullable MethodHandle HANDLE$stbtt_FindSVGDoc;
    public final @Nullable MethodHandle HANDLE$stbtt_FreeBitmap;
    public final @Nullable MethodHandle HANDLE$stbtt_FreeSDF;
    public final @Nullable MethodHandle HANDLE$stbtt_FreeShape;
    public final @Nullable MethodHandle HANDLE$stbtt_GetBakedQuad;
    public final @Nullable MethodHandle HANDLE$stbtt_GetCodepointBitmap;
    public final @Nullable MethodHandle HANDLE$stbtt_GetCodepointBitmapBox;
    public final @Nullable MethodHandle HANDLE$stbtt_GetCodepointBitmapBoxSubpixel;
    public final @Nullable MethodHandle HANDLE$stbtt_GetCodepointBitmapSubpixel;
    public final @Nullable MethodHandle HANDLE$stbtt_GetCodepointBox;
    public final @Nullable MethodHandle HANDLE$stbtt_GetCodepointHMetrics;
    public final @Nullable MethodHandle HANDLE$stbtt_GetCodepointKernAdvance;
    public final @Nullable MethodHandle HANDLE$stbtt_GetCodepointSDF;
    public final @Nullable MethodHandle HANDLE$stbtt_GetCodepointSVG;
    public final @Nullable MethodHandle HANDLE$stbtt_GetCodepointShape;
    public final @Nullable MethodHandle HANDLE$stbtt_GetFontBoundingBox;
    public final @Nullable MethodHandle HANDLE$stbtt_GetFontNameString;
    public final @Nullable MethodHandle HANDLE$stbtt_GetFontOffsetForIndex;
    public final @Nullable MethodHandle HANDLE$stbtt_GetFontVMetrics;
    public final @Nullable MethodHandle HANDLE$stbtt_GetFontVMetricsOS2;
    public final @Nullable MethodHandle HANDLE$stbtt_GetGlyphBitmap;
    public final @Nullable MethodHandle HANDLE$stbtt_GetGlyphBitmapBox;
    public final @Nullable MethodHandle HANDLE$stbtt_GetGlyphBitmapBoxSubpixel;
    public final @Nullable MethodHandle HANDLE$stbtt_GetGlyphBitmapSubpixel;
    public final @Nullable MethodHandle HANDLE$stbtt_GetGlyphBox;
    public final @Nullable MethodHandle HANDLE$stbtt_GetGlyphHMetrics;
    public final @Nullable MethodHandle HANDLE$stbtt_GetGlyphKernAdvance;
    public final @Nullable MethodHandle HANDLE$stbtt_GetGlyphSDF;
    public final @Nullable MethodHandle HANDLE$stbtt_GetGlyphSVG;
    public final @Nullable MethodHandle HANDLE$stbtt_GetGlyphShape;
    public final @Nullable MethodHandle HANDLE$stbtt_GetKerningTable;
    public final @Nullable MethodHandle HANDLE$stbtt_GetKerningTableLength;
    public final @Nullable MethodHandle HANDLE$stbtt_GetNumberOfFonts;
    public final @Nullable MethodHandle HANDLE$stbtt_GetPackedQuad;
    public final @Nullable MethodHandle HANDLE$stbtt_GetScaledFontVMetrics;
    public final @Nullable MethodHandle HANDLE$stbtt_InitFont;
    public final @Nullable MethodHandle HANDLE$stbtt_IsGlyphEmpty;
    public final @Nullable MethodHandle HANDLE$stbtt_MakeCodepointBitmap;
    public final @Nullable MethodHandle HANDLE$stbtt_MakeCodepointBitmapSubpixel;
    public final @Nullable MethodHandle HANDLE$stbtt_MakeCodepointBitmapSubpixelPrefilter;
    public final @Nullable MethodHandle HANDLE$stbtt_MakeGlyphBitmap;
    public final @Nullable MethodHandle HANDLE$stbtt_MakeGlyphBitmapSubpixel;
    public final @Nullable MethodHandle HANDLE$stbtt_MakeGlyphBitmapSubpixelPrefilter;
    public final @Nullable MethodHandle HANDLE$stbtt_PackBegin;
    public final @Nullable MethodHandle HANDLE$stbtt_PackEnd;
    public final @Nullable MethodHandle HANDLE$stbtt_PackFontRange;
    public final @Nullable MethodHandle HANDLE$stbtt_PackFontRanges;
    public final @Nullable MethodHandle HANDLE$stbtt_PackFontRangesGatherRects;
    public final @Nullable MethodHandle HANDLE$stbtt_PackFontRangesPackRects;
    public final @Nullable MethodHandle HANDLE$stbtt_PackFontRangesRenderIntoRects;
    public final @Nullable MethodHandle HANDLE$stbtt_PackSetOversampling;
    public final @Nullable MethodHandle HANDLE$stbtt_PackSetSkipMissingCodepoints;
    public final @Nullable MethodHandle HANDLE$stbtt_Rasterize;
    public final @Nullable MethodHandle HANDLE$stbtt_ScaleForMappingEmToPixels;
    public final @Nullable MethodHandle HANDLE$stbtt_ScaleForPixelHeight;
    // endregion

    public static final class Descriptors {
        public static final FunctionDescriptor DESCRIPTOR$stbtt_BakeFontBitmap = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE),
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_FLOAT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE),
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(STBTT_Bakedchar.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$stbtt_CompareUTF8toUTF16_bigendian = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE),
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE),
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$stbtt_FindGlyphIndex = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(STBTT_Fontinfo.LAYOUT),
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$stbtt_FindMatchingFont = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE),
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$stbtt_FindSVGDoc = FunctionDescriptor.of(
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE),
            ValueLayout.ADDRESS.withTargetLayout(STBTT_Fontinfo.LAYOUT),
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$stbtt_FreeBitmap = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE),
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$stbtt_FreeSDF = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE),
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$stbtt_FreeShape = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS.withTargetLayout(STBTT_Fontinfo.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(STBTT_Vertex.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$stbtt_GetBakedQuad = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS.withTargetLayout(STBTT_Bakedchar.LAYOUT),
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_FLOAT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_FLOAT),
            ValueLayout.ADDRESS.withTargetLayout(STBTT_AlignedQuad.LAYOUT),
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$stbtt_GetCodepointBitmap = FunctionDescriptor.of(
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE),
            ValueLayout.ADDRESS.withTargetLayout(STBTT_Fontinfo.LAYOUT),
            ValueLayout.JAVA_FLOAT,
            ValueLayout.JAVA_FLOAT,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
        );

        public static final FunctionDescriptor DESCRIPTOR$stbtt_GetCodepointBitmapBox = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS.withTargetLayout(STBTT_Fontinfo.LAYOUT),
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_FLOAT,
            ValueLayout.JAVA_FLOAT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
        );

        public static final FunctionDescriptor DESCRIPTOR$stbtt_GetCodepointBitmapBoxSubpixel = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS.withTargetLayout(STBTT_Fontinfo.LAYOUT),
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_FLOAT,
            ValueLayout.JAVA_FLOAT,
            ValueLayout.JAVA_FLOAT,
            ValueLayout.JAVA_FLOAT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
        );

        public static final FunctionDescriptor DESCRIPTOR$stbtt_GetCodepointBitmapSubpixel = FunctionDescriptor.of(
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE),
            ValueLayout.ADDRESS.withTargetLayout(STBTT_Fontinfo.LAYOUT),
            ValueLayout.JAVA_FLOAT,
            ValueLayout.JAVA_FLOAT,
            ValueLayout.JAVA_FLOAT,
            ValueLayout.JAVA_FLOAT,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
        );

        public static final FunctionDescriptor DESCRIPTOR$stbtt_GetCodepointBox = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(STBTT_Fontinfo.LAYOUT),
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
        );

        public static final FunctionDescriptor DESCRIPTOR$stbtt_GetCodepointHMetrics = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS.withTargetLayout(STBTT_Fontinfo.LAYOUT),
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
        );

        public static final FunctionDescriptor DESCRIPTOR$stbtt_GetCodepointKernAdvance = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(STBTT_Fontinfo.LAYOUT),
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$stbtt_GetCodepointSDF = FunctionDescriptor.of(
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE),
            ValueLayout.ADDRESS.withTargetLayout(STBTT_Fontinfo.LAYOUT),
            ValueLayout.JAVA_FLOAT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_BYTE,
            ValueLayout.JAVA_FLOAT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
        );

        public static final FunctionDescriptor DESCRIPTOR$stbtt_GetCodepointSVG = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(STBTT_Fontinfo.LAYOUT),
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE))
        );

        public static final FunctionDescriptor DESCRIPTOR$stbtt_GetCodepointShape = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(STBTT_Fontinfo.LAYOUT),
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS.withTargetLayout(STBTT_Vertex.LAYOUT))
        );

        public static final FunctionDescriptor DESCRIPTOR$stbtt_GetFontBoundingBox = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS.withTargetLayout(STBTT_Fontinfo.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
        );

        public static final FunctionDescriptor DESCRIPTOR$stbtt_GetFontNameString = FunctionDescriptor.of(
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE),
            ValueLayout.ADDRESS.withTargetLayout(STBTT_Fontinfo.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$stbtt_GetFontOffsetForIndex = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE),
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$stbtt_GetFontVMetrics = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS.withTargetLayout(STBTT_Fontinfo.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
        );

        public static final FunctionDescriptor DESCRIPTOR$stbtt_GetFontVMetricsOS2 = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(STBTT_Fontinfo.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
        );

        public static final FunctionDescriptor DESCRIPTOR$stbtt_GetGlyphBitmap = FunctionDescriptor.of(
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE),
            ValueLayout.ADDRESS.withTargetLayout(STBTT_Fontinfo.LAYOUT),
            ValueLayout.JAVA_FLOAT,
            ValueLayout.JAVA_FLOAT,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
        );

        public static final FunctionDescriptor DESCRIPTOR$stbtt_GetGlyphBitmapBox = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS.withTargetLayout(STBTT_Fontinfo.LAYOUT),
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_FLOAT,
            ValueLayout.JAVA_FLOAT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
        );

        public static final FunctionDescriptor DESCRIPTOR$stbtt_GetGlyphBitmapBoxSubpixel = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS.withTargetLayout(STBTT_Fontinfo.LAYOUT),
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_FLOAT,
            ValueLayout.JAVA_FLOAT,
            ValueLayout.JAVA_FLOAT,
            ValueLayout.JAVA_FLOAT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
        );

        public static final FunctionDescriptor DESCRIPTOR$stbtt_GetGlyphBitmapSubpixel = FunctionDescriptor.of(
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE),
            ValueLayout.ADDRESS.withTargetLayout(STBTT_Fontinfo.LAYOUT),
            ValueLayout.JAVA_FLOAT,
            ValueLayout.JAVA_FLOAT,
            ValueLayout.JAVA_FLOAT,
            ValueLayout.JAVA_FLOAT,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
        );

        public static final FunctionDescriptor DESCRIPTOR$stbtt_GetGlyphBox = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(STBTT_Fontinfo.LAYOUT),
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
        );

        public static final FunctionDescriptor DESCRIPTOR$stbtt_GetGlyphHMetrics = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS.withTargetLayout(STBTT_Fontinfo.LAYOUT),
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
        );

        public static final FunctionDescriptor DESCRIPTOR$stbtt_GetGlyphKernAdvance = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(STBTT_Fontinfo.LAYOUT),
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$stbtt_GetGlyphSDF = FunctionDescriptor.of(
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE),
            ValueLayout.ADDRESS.withTargetLayout(STBTT_Fontinfo.LAYOUT),
            ValueLayout.JAVA_FLOAT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_BYTE,
            ValueLayout.JAVA_FLOAT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
        );

        public static final FunctionDescriptor DESCRIPTOR$stbtt_GetGlyphSVG = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(STBTT_Fontinfo.LAYOUT),
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE))
        );

        public static final FunctionDescriptor DESCRIPTOR$stbtt_GetGlyphShape = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(STBTT_Fontinfo.LAYOUT),
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS.withTargetLayout(STBTT_Vertex.LAYOUT))
        );

        public static final FunctionDescriptor DESCRIPTOR$stbtt_GetKerningTable = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(STBTT_Fontinfo.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(STBTT_Kerningentry.LAYOUT),
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$stbtt_GetKerningTableLength = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(STBTT_Fontinfo.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$stbtt_GetNumberOfFonts = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE)
        );

        public static final FunctionDescriptor DESCRIPTOR$stbtt_GetPackedQuad = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS.withTargetLayout(STBTT_Packedchar.LAYOUT),
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_FLOAT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_FLOAT),
            ValueLayout.ADDRESS.withTargetLayout(STBTT_AlignedQuad.LAYOUT),
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$stbtt_GetScaledFontVMetrics = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE),
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_FLOAT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_FLOAT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_FLOAT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_FLOAT)
        );

        public static final FunctionDescriptor DESCRIPTOR$stbtt_InitFont = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(STBTT_Fontinfo.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE),
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$stbtt_IsGlyphEmpty = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(STBTT_Fontinfo.LAYOUT),
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$stbtt_MakeCodepointBitmap = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS.withTargetLayout(STBTT_Fontinfo.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE),
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_FLOAT,
            ValueLayout.JAVA_FLOAT,
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$stbtt_MakeCodepointBitmapSubpixel = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS.withTargetLayout(STBTT_Fontinfo.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE),
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_FLOAT,
            ValueLayout.JAVA_FLOAT,
            ValueLayout.JAVA_FLOAT,
            ValueLayout.JAVA_FLOAT,
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$stbtt_MakeCodepointBitmapSubpixelPrefilter = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS.withTargetLayout(STBTT_Fontinfo.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE),
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_FLOAT,
            ValueLayout.JAVA_FLOAT,
            ValueLayout.JAVA_FLOAT,
            ValueLayout.JAVA_FLOAT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_FLOAT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_FLOAT),
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$stbtt_MakeGlyphBitmap = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS.withTargetLayout(STBTT_Fontinfo.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE),
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_FLOAT,
            ValueLayout.JAVA_FLOAT,
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$stbtt_MakeGlyphBitmapSubpixel = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS.withTargetLayout(STBTT_Fontinfo.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE),
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_FLOAT,
            ValueLayout.JAVA_FLOAT,
            ValueLayout.JAVA_FLOAT,
            ValueLayout.JAVA_FLOAT,
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$stbtt_MakeGlyphBitmapSubpixelPrefilter = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS.withTargetLayout(STBTT_Fontinfo.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE),
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_FLOAT,
            ValueLayout.JAVA_FLOAT,
            ValueLayout.JAVA_FLOAT,
            ValueLayout.JAVA_FLOAT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_FLOAT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_FLOAT),
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$stbtt_PackBegin = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(STBTT_PackContext.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE),
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$stbtt_PackEnd = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS.withTargetLayout(STBTT_PackContext.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$stbtt_PackFontRange = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(STBTT_PackContext.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE),
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_FLOAT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(STBTT_Packedchar.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$stbtt_PackFontRanges = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(STBTT_PackContext.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE),
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(STBTT_PackRange.LAYOUT),
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$stbtt_PackFontRangesGatherRects = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(STBTT_PackContext.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(STBTT_Fontinfo.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(STBTT_PackRange.LAYOUT),
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$stbtt_PackFontRangesPackRects = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS.withTargetLayout(STBTT_PackContext.LAYOUT),
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$stbtt_PackFontRangesRenderIntoRects = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(STBTT_PackContext.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(STBTT_Fontinfo.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(STBTT_PackRange.LAYOUT),
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$stbtt_PackSetOversampling = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS.withTargetLayout(STBTT_PackContext.LAYOUT),
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$stbtt_PackSetSkipMissingCodepoints = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS.withTargetLayout(STBTT_PackContext.LAYOUT),
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$stbtt_Rasterize = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS.withTargetLayout(STBTT_Bitmap.LAYOUT),
            ValueLayout.JAVA_FLOAT,
            ValueLayout.ADDRESS.withTargetLayout(STBTT_Vertex.LAYOUT),
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_FLOAT,
            ValueLayout.JAVA_FLOAT,
            ValueLayout.JAVA_FLOAT,
            ValueLayout.JAVA_FLOAT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$stbtt_ScaleForMappingEmToPixels = FunctionDescriptor.of(
            ValueLayout.JAVA_FLOAT,
            ValueLayout.ADDRESS.withTargetLayout(STBTT_Fontinfo.LAYOUT),
            ValueLayout.JAVA_FLOAT
        );

        public static final FunctionDescriptor DESCRIPTOR$stbtt_ScaleForPixelHeight = FunctionDescriptor.of(
            ValueLayout.JAVA_FLOAT,
            ValueLayout.ADDRESS.withTargetLayout(STBTT_Fontinfo.LAYOUT),
            ValueLayout.JAVA_FLOAT
        );

        /// Constructing this class is nonsense so the constructor is made private.
        private Descriptors() {}
    }
}
