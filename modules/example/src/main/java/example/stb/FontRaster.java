package example.stb;

import club.doki7.ffm.Loader;
import club.doki7.ffm.ptr.BytePtr;
import club.doki7.ffm.ptr.IntPtr;
import club.doki7.stb.STBJavaTraceUtil;
import club.doki7.stb.imagewrite.STBIW;
import club.doki7.stb.truetype.STBTT;
import club.doki7.stb.truetype.datatype.STBTT_Fontinfo;

import java.lang.foreign.Arena;
import java.nio.file.Files;
import java.nio.file.Path;

// code mostly copied from:
// https://github.com/justinmeiners/stb-truetype-example/blob/master/main.c
public final class FontRaster {
    static {
        System.loadLibrary("stb");
        STBJavaTraceUtil.enableJavaTraceForSTB();
    }

    public static void main(String[] args) throws Exception {
        STBTT stbTT = new STBTT(Loader::loadFunctionOrNull);
        STBIW stbIW = new STBIW(Loader::loadFunctionOrNull);

        byte[] fontData = Files.readAllBytes(Path.of("example/resc/less-perfect-dos-vga.ttf"));

        try (Arena arena = Arena.ofConfined()) {
            BytePtr pFontData = BytePtr.allocate(arena, fontData);
            STBTT_Fontinfo fontInfo = STBTT_Fontinfo.allocate(arena);
            if (stbTT.initFont(fontInfo, pFontData, 0) != 1) {
                throw new RuntimeException("Failed to initialize font");
            }

            int w = 512;
            int h = 128;
            int lineHeight = 32;
            BytePtr bitmap = BytePtr.allocate(arena, w * h);

            float scale = stbTT.scaleForPixelHeight(fontInfo, lineHeight);
            BytePtr word = BytePtr.allocateString(arena, "the quick brown fox");

            int x = 0;
            IntPtr pAscent = IntPtr.allocate(arena);
            IntPtr pDescent = IntPtr.allocate(arena);
            IntPtr pLineGap = IntPtr.allocate(arena);
            stbTT.getFontVMetrics(fontInfo, pAscent, pDescent, pLineGap);

            int ascent = Math.round(pAscent.read() * scale);

            IntPtr pAX = IntPtr.allocate(arena);
            IntPtr pLSB = IntPtr.allocate(arena);
            IntPtr pCX1 = IntPtr.allocate(arena);
            IntPtr pCY1 = IntPtr.allocate(arena);
            IntPtr pCX2 = IntPtr.allocate(arena);
            IntPtr pCY2 = IntPtr.allocate(arena);

            for (int i = 0; i < word.size() - 1; i++) {
                byte ch = word.read(i);

                stbTT.getCodepointHMetrics(fontInfo, ch, pAX, pLSB);
                stbTT.getCodepointBitmapBox(fontInfo, ch, scale, scale, pCX1, pCY1, pCX2, pCY2);

                int ax = pAX.read();
                int lsb = pLSB.read();
                int cx1 = pCX1.read();
                int cy1 = pCY1.read();
                int cx2 = pCX2.read();
                int cy2 = pCY2.read();

                int y = ascent + cy1;
                int byteOffset = x + Math.round(lsb * scale) + (y * w);
                stbTT.makeCodepointBitmap(
                        fontInfo,
                        bitmap.offset(byteOffset),
                        cx2 - cx1,
                        cy2 - cy1,
                        w,
                        scale,
                        scale,
                        ch
                );

                x += Math.round(ax * scale);
                int kern = stbTT.getCodepointKernAdvance(fontInfo, ch, word.read(i + 1));
                x += Math.round(kern * scale);
            }

            stbIW.writePng(BytePtr.allocateString(arena, "out.png"), w, h, 1, bitmap.segment(), w);
        }
    }
}
