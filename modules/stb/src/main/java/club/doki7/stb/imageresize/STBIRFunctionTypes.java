package club.doki7.stb.imageresize;

import java.lang.foreign.*;
import java.lang.invoke.*;
import club.doki7.ffm.annotation.*;
import club.doki7.ffm.NativeLayout;
import org.jetbrains.annotations.NotNull;
import club.doki7.stb.imageresize.datatype.*;
import club.doki7.stb.imageresize.enumtype.*;
import club.doki7.stb.imageresize.handle.*;

public final class STBIRFunctionTypes {
    public static final FunctionDescriptor stbir__kernel_callback = FunctionDescriptor.of(
        ValueLayout.JAVA_FLOAT,
        ValueLayout.JAVA_FLOAT,
        ValueLayout.JAVA_FLOAT,
        ValueLayout.ADDRESS
    );

    public static final FunctionDescriptor stbir__support_callback = FunctionDescriptor.of(
        ValueLayout.JAVA_FLOAT,
        ValueLayout.JAVA_FLOAT,
        ValueLayout.ADDRESS
    );

    public static final FunctionDescriptor stbir_input_callback = FunctionDescriptor.of(
        ValueLayout.ADDRESS,
        ValueLayout.ADDRESS,
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS
    );

    public static final FunctionDescriptor stbir_output_callback = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS
    );

    @FunctionalInterface
    public interface Istbir__kernel_callback {
        float invoke(
            float p0,
            float p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2
        );

        static MethodHandle of(@NotNull Istbir__kernel_callback lambda) {
            try {
                return MethodHandles.lookup().findVirtual(Istbir__kernel_callback.class, "invoke", stbir__kernel_callback.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull Istbir__kernel_callback lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull Istbir__kernel_callback lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), stbir__kernel_callback, arena);
        }
    }

    @FunctionalInterface
    public interface Istbir__support_callback {
        float invoke(
            float p0,
            @Pointer(comment="void*") @NotNull MemorySegment p1
        );

        static MethodHandle of(@NotNull Istbir__support_callback lambda) {
            try {
                return MethodHandles.lookup().findVirtual(Istbir__support_callback.class, "invoke", stbir__support_callback.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull Istbir__support_callback lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull Istbir__support_callback lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), stbir__support_callback, arena);
        }
    }

    @FunctionalInterface
    public interface Istbir_input_callback {
        @Pointer(comment="void*") @NotNull MemorySegment invoke(
            @Pointer(comment="void*") @NotNull MemorySegment p0,
            @Pointer(comment="void*") @NotNull MemorySegment p1,
            int p2,
            int p3,
            int p4,
            @Pointer(comment="void*") @NotNull MemorySegment p5
        );

        static MethodHandle of(@NotNull Istbir_input_callback lambda) {
            try {
                return MethodHandles.lookup().findVirtual(Istbir_input_callback.class, "invoke", stbir_input_callback.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull Istbir_input_callback lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull Istbir_input_callback lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), stbir_input_callback, arena);
        }
    }

    @FunctionalInterface
    public interface Istbir_output_callback {
        void invoke(
            @Pointer(comment="void*") @NotNull MemorySegment p0,
            int p1,
            int p2,
            @Pointer(comment="void*") @NotNull MemorySegment p3
        );

        static MethodHandle of(@NotNull Istbir_output_callback lambda) {
            try {
                return MethodHandles.lookup().findVirtual(Istbir_output_callback.class, "invoke", stbir_output_callback.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull Istbir_output_callback lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull Istbir_output_callback lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), stbir_output_callback, arena);
        }
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private STBIRFunctionTypes() {}
}
