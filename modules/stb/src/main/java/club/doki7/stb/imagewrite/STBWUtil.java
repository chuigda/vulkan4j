package club.doki7.stb.imagewrite;

import club.doki7.ffm.annotation.NativeType;

import java.lang.foreign.Arena;
import java.lang.foreign.Linker;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.function.Consumer;

public final class STBWUtil {
    public static MemorySegment makeWriteCallback(Arena arena, Consumer<MemorySegment> consumer) {
        return Linker.nativeLinker().upcallStub(
                hWrite.bindTo(consumer),
                STBIWFunctionTypes.stbi_write_func,
                arena
        );
    }

    private static void write(
            Consumer<MemorySegment> consumer,
            @NativeType("void*") MemorySegment ignoredContext,
            @NativeType("void*") MemorySegment data,
            @NativeType("int") int size
    ) {
        consumer.accept(data.reinterpret(size));
    }

    private static final MethodHandle hWrite;
    static {
        try {
            hWrite = MethodHandles.lookup().findStatic(
                    STBWUtil.class,
                    "write",
                    MethodType.methodType(void.class, Consumer.class, MemorySegment.class, MemorySegment.class, int.class)
            );
        } catch (NoSuchMethodException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    private STBWUtil() {}
}
