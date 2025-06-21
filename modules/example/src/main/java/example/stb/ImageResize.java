package example.stb;

import club.doki7.ffm.Loader;
import club.doki7.ffm.ptr.BytePtr;
import club.doki7.ffm.ptr.IntPtr;
import club.doki7.stb.STBJavaTraceUtil;
import club.doki7.stb.image.STBI;
import club.doki7.stb.image.STBIUtil;
import club.doki7.stb.image.datatype.STBI_IoCallbacks;
import club.doki7.stb.imageresize.STBIR;
import club.doki7.stb.imageresize.enumtype.STBIR_PixelLayout;
import club.doki7.stb.imagewrite.STBIW;
import club.doki7.stb.imagewrite.STBWUtil;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Objects;
import java.util.function.Consumer;

public final class ImageResize {
    static {
        System.loadLibrary("stb");
        STBJavaTraceUtil.enableJavaTraceForSTB();
    }

    public static void main(String[] args) throws Exception {
        STBI stbI = new STBI(Loader::loadFunctionOrNull);
        STBIR stbIR = new STBIR(Loader::loadFunctionOrNull);
        STBIW stbIW = new STBIW(Loader::loadFunctionOrNull);

        try (Arena arena = Arena.ofConfined();
             RandomAccessFile file = new RandomAccessFile("example/resc/looking-for-trouble.png", "r")) {
            IntPtr pWidth = IntPtr.allocate(arena);
            IntPtr pHeight = IntPtr.allocate(arena);
            IntPtr pNumChannels = IntPtr.allocate(arena);

            STBI_IoCallbacks ioCallbacks = STBIUtil.makeIOCallbacks(arena, file);
            BytePtr pImage = Objects.requireNonNull(stbI.loadFromCallbacks(
                    ioCallbacks,
                    MemorySegment.NULL,
                    pWidth,
                    pHeight,
                    pNumChannels,
                    0
            ));
            int width = pWidth.read();
            int height = pHeight.read();
            int numChannels = pNumChannels.read();
            System.out.printf("Image loaded: %dx%d, %d channels%n", width, height, numChannels);
            stbIW.writePng(
                    BytePtr.allocateString(arena, "looking-for-trouble-dup.png"),
                    width,
                    height,
                    numChannels,
                    pImage.segment(),
                    width * numChannels
            );

            BytePtr pImage_2_0X = BytePtr.allocate(arena, (long) width * height * numChannels * 4);
            BytePtr pImage_0_5X = BytePtr.allocate(arena, (long) width * height * numChannels / 4);

            stbIR.resizeUint8Srgb(
                    pImage,
                    width, height, width * numChannels,
                    pImage_2_0X,
                    width * 2, height * 2, width * numChannels * 2,
                    STBIR_PixelLayout.RGBA
            );
            stbIR.resizeUint8Srgb(
                    pImage,
                    width, height, width * numChannels,
                    pImage_0_5X,
                    width / 2, height / 2, width * numChannels / 2,
                    STBIR_PixelLayout.RGBA
            );

            stbIW.writePngToFunc(
                    STBWUtil.makeWriteCallback(arena, makeWriter("looking-for-trouble-2.0x.png")),
                    MemorySegment.NULL,
                    width * 2,
                    height * 2,
                    numChannels,
                    pImage_2_0X.segment(),
                    width * 2 * numChannels
            );
            stbIW.writePngToFunc(
                    STBWUtil.makeWriteCallback(arena, makeWriter("looking-for-trouble-0.5x.png")),
                    MemorySegment.NULL,
                    width / 2,
                    height / 2,
                    numChannels,
                    pImage_0_5X.segment(),
                    width / 2 * numChannels
            );
        }
    }

    private static Consumer<MemorySegment> makeWriter(String fileName) {
        return segment -> {
            try (FileChannel ch = FileChannel.open(Path.of(fileName), StandardOpenOption.WRITE, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING)) {
                ch.write(segment.asByteBuffer());
            } catch (IOException e) {
                throw new RuntimeException("Failed to write image to " + fileName, e);
            }
        };
    }
}
