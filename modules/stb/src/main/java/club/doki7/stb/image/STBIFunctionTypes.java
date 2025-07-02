package club.doki7.stb.image;

import java.lang.foreign.*;
import java.lang.invoke.*;
import club.doki7.ffm.annotation.*;
import club.doki7.ffm.NativeLayout;
import org.jetbrains.annotations.NotNull;
import club.doki7.stb.image.datatype.*;

public final class STBIFunctionTypes {
    public static final FunctionDescriptor PFN_stbi_io_callbacks_eof = FunctionDescriptor.of(
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS
    );

    public static final FunctionDescriptor PFN_stbi_io_callbacks_read = FunctionDescriptor.of(
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE),
        ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor PFN_stbi_io_callbacks_skip = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_INT
    );

    @FunctionalInterface
    public interface PFN_stbi_io_callbacks_eof {
        int invoke(
            @Pointer(comment="void*") @NotNull MemorySegment p0
        );

        static MethodHandle of(@NotNull PFN_stbi_io_callbacks_eof lambda) {
            try {
                return MethodHandles.lookup().findVirtual(PFN_stbi_io_callbacks_eof.class, "invoke", PFN_stbi_io_callbacks_eof.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull PFN_stbi_io_callbacks_eof lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull PFN_stbi_io_callbacks_eof lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), PFN_stbi_io_callbacks_eof, arena);
        }
    }

    @FunctionalInterface
    public interface PFN_stbi_io_callbacks_read {
        int invoke(
            @Pointer(comment="void*") @NotNull MemorySegment p0,
            @Pointer(comment="void*") @NotNull MemorySegment p1,
            int p2
        );

        static MethodHandle of(@NotNull PFN_stbi_io_callbacks_read lambda) {
            try {
                return MethodHandles.lookup().findVirtual(PFN_stbi_io_callbacks_read.class, "invoke", PFN_stbi_io_callbacks_read.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull PFN_stbi_io_callbacks_read lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull PFN_stbi_io_callbacks_read lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), PFN_stbi_io_callbacks_read, arena);
        }
    }

    @FunctionalInterface
    public interface PFN_stbi_io_callbacks_skip {
        void invoke(
            @Pointer(comment="void*") @NotNull MemorySegment p0,
            int p1
        );

        static MethodHandle of(@NotNull PFN_stbi_io_callbacks_skip lambda) {
            try {
                return MethodHandles.lookup().findVirtual(PFN_stbi_io_callbacks_skip.class, "invoke", PFN_stbi_io_callbacks_skip.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull PFN_stbi_io_callbacks_skip lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull PFN_stbi_io_callbacks_skip lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), PFN_stbi_io_callbacks_skip, arena);
        }
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private STBIFunctionTypes() {}
}
