package club.doki7.stb.image;

import club.doki7.ffm.annotation.NativeType;
import club.doki7.stb.image.datatype.STBI_IoCallbacks;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.foreign.Arena;
import java.lang.foreign.Linker;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

public final class STBIUtil {
    public static STBI_IoCallbacks makeIOCallbacks(Arena arena, RandomAccessFile file) {
        MemorySegment pfnRead = Linker.nativeLinker().upcallStub(
                hReadStatic.bindTo(file),
                STBIFunctionTypes.PFN_stbi_io_callbacks_read,
                arena
        );
        MemorySegment pfnSkip = Linker.nativeLinker().upcallStub(
                hSkipStatic.bindTo(file),
                STBIFunctionTypes.PFN_stbi_io_callbacks_skip,
                arena
        );
        MemorySegment pfnEof = Linker.nativeLinker().upcallStub(
                hEofStatic.bindTo(file),
                STBIFunctionTypes.PFN_stbi_io_callbacks_eof,
                arena
        );

        STBI_IoCallbacks ret = STBI_IoCallbacks.allocate(arena);
        ret.read(pfnRead);
        ret.skip(pfnSkip);
        ret.eof(pfnEof);
        return ret;
    }

    private static int read(
            RandomAccessFile file,
            @NativeType("void*") MemorySegment ignoredUserData,
            @NativeType("char*") MemorySegment data,
            int size
    ) {
        try {
            byte[] buffer = new byte[size];
            int bytesRead = file.read(buffer);
            if (bytesRead > 0) {
                data.reinterpret(Long.MAX_VALUE).copyFrom(MemorySegment.ofArray(buffer));
            }
            return bytesRead;
        } catch (IOException e) {
            return -1;
        }
    }

    private static void skip(
            RandomAccessFile file,
            @NativeType("void*") MemorySegment ignoredUserData,
            int size
    ) {
        try {
            if (size >= 0) {
                file.skipBytes(size);
            } else {
                long currentPosition = file.getFilePointer();
                long newPosition = currentPosition + size;
                if (newPosition < 0) {
                    newPosition = 0;
                }
                file.seek(newPosition);
            }
        } catch (IOException e) {
            // We're unable to report error here. Just pretend the skip was successful,
            // and STBI will meet an error later when it tries to read more data.
        }
    }

    private static int eof(
            RandomAccessFile file,
            @NativeType("void*") MemorySegment ignoredUserData
    ) {
        try {
            return file.getFilePointer() >= file.length() ? 1 : 0;
        } catch (IOException e) {
            // If we can't determine EOF, we assume it's reached.
            return 1;
        }
    }

    private static final MethodHandle hReadStatic;
    private static final MethodHandle hSkipStatic;
    private static final MethodHandle hEofStatic;

    static {
        try {
            hReadStatic = MethodHandles.lookup().findStatic(
                    STBIUtil.class,
                    "read",
                    MethodType.methodType(
                            int.class,
                            RandomAccessFile.class,
                            MemorySegment.class,
                            MemorySegment.class,
                            int.class
                    )
            );
            hSkipStatic = MethodHandles.lookup().findStatic(
                    STBIUtil.class,
                    "skip",
                    MethodType.methodType(
                            void.class,
                            RandomAccessFile.class,
                            MemorySegment.class,
                            int.class
                    )
            );
            hEofStatic = MethodHandles.lookup().findStatic(
                    STBIUtil.class,
                    "eof",
                    MethodType.methodType(
                            int.class,
                            RandomAccessFile.class,
                            MemorySegment.class
                    )
            );
        } catch (NoSuchMethodException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    private STBIUtil() {}
}
