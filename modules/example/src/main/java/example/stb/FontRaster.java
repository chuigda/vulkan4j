package example.stb;

import club.doki7.ffm.Loader;
import club.doki7.ffm.ptr.BytePtr;
import club.doki7.ffm.ptr.IntPtr;
import club.doki7.glfw.GLFW;
import club.doki7.glfw.GLFWLoader;
import club.doki7.stb.STBJavaTraceUtil;
import club.doki7.stb.truetype.STBTT;
import club.doki7.stb.truetype.datatype.STBTT_Fontinfo;

import java.lang.foreign.Arena;
import java.nio.file.Files;
import java.nio.file.Path;

public final class FontRaster {
    static {
        GLFWLoader.loadGLFWLibrary();

        System.loadLibrary("stb");
        STBJavaTraceUtil.enableJavaTraceForSTB();
    }

    public static void main(String[] args) throws Exception {
        GLFW glfw = GLFWLoader.loadGLFW();
        STBTT stbTT = new STBTT(Loader::loadFunctionOrNull);

        byte[] fontData = Files.readAllBytes(Path.of("example/resc/less-perfect-dos-vga.ttf"));

        try (Arena arena = Arena.ofConfined()) {
            BytePtr pFontData = BytePtr.allocate(arena, fontData);
            STBTT_Fontinfo fontInfo = STBTT_Fontinfo.allocate(arena);
            if (stbTT.initFont(fontInfo, pFontData, 0) != 1) {
                throw new RuntimeException("Failed to initialize font");
            }

            int w = 512;
            int h = 128;
            int lineHeight = 64;
            BytePtr bitmap = BytePtr.allocate(arena, w * h);

            float scale = stbTT.scaleForPixelHeight(fontInfo, lineHeight);
            BytePtr word = BytePtr.allocateString(arena, "the quick brown fox");

            int x = 0;
            IntPtr pAscent = IntPtr.allocate(arena);
            IntPtr pDescent = IntPtr.allocate(arena);
            IntPtr pLineGap = IntPtr.allocate(arena);
            stbTT.getFontVMetrics(fontInfo, pAscent, pDescent, pLineGap);

            int ascent = Math.round(pAscent.read() * scale);
            int descent = Math.round(pDescent.read() * scale);
            int lineGap = Math.round(pLineGap.read() * scale);
        }
    }
}
