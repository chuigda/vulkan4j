package club.doki7.stb.imagewrite;

import java.lang.foreign.*;
import java.lang.invoke.*;
import club.doki7.ffm.annotation.*;
import club.doki7.ffm.NativeLayout;
import org.jetbrains.annotations.NotNull;

public final class STBIWFunctionTypes {
    public static final FunctionDescriptor stbi_write_func = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS,
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_INT
    );

    @FunctionalInterface
    public interface Istbi_write_func {
        void invoke(
            @Pointer(comment="void*") @NotNull MemorySegment p0,
            @Pointer(comment="void*") @NotNull MemorySegment p1,
            int p2
        );

        static MethodHandle of(@NotNull Istbi_write_func lambda) {
            try {
                return MethodHandles.lookup().findVirtual(Istbi_write_func.class, "invoke", stbi_write_func.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull Istbi_write_func lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull Istbi_write_func lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), stbi_write_func, arena);
        }
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private STBIWFunctionTypes() {}
}
