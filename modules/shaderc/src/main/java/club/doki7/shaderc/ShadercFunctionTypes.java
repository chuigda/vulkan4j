package club.doki7.shaderc;

import java.lang.foreign.*;
import java.lang.invoke.*;
import club.doki7.ffm.annotation.*;
import club.doki7.ffm.NativeLayout;
import org.jetbrains.annotations.NotNull;
import club.doki7.shaderc.datatype.*;
import club.doki7.shaderc.enumtype.*;
import club.doki7.shaderc.handle.*;

public final class ShadercFunctionTypes {
    public static final FunctionDescriptor shaderc_include_resolve_fn = FunctionDescriptor.of(
        ValueLayout.ADDRESS.withTargetLayout(ShadercIncludeResult.LAYOUT),
        ValueLayout.ADDRESS,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE),
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE),
        NativeLayout.C_SIZE_T
    );

    public static final FunctionDescriptor shaderc_include_result_release_fn = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS,
        ValueLayout.ADDRESS.withTargetLayout(ShadercIncludeResult.LAYOUT)
    );

    @FunctionalInterface
    public interface Ishaderc_include_resolve_fn {
        @Pointer(comment="void*") @NotNull MemorySegment invoke(
            @Pointer(comment="void*") @NotNull MemorySegment p0,
            @Pointer(comment="void*") @NotNull MemorySegment p1,
            int p2,
            @Pointer(comment="void*") @NotNull MemorySegment p3,
            long p4
        );

        static MethodHandle of(@NotNull Ishaderc_include_resolve_fn lambda) {
            try {
                return MethodHandles.lookup().findVirtual(Ishaderc_include_resolve_fn.class, "invoke", shaderc_include_resolve_fn.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull Ishaderc_include_resolve_fn lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull Ishaderc_include_resolve_fn lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), shaderc_include_resolve_fn, arena);
        }
    }

    @FunctionalInterface
    public interface Ishaderc_include_result_release_fn {
        void invoke(
            @Pointer(comment="void*") @NotNull MemorySegment p0,
            @Pointer(comment="void*") @NotNull MemorySegment p1
        );

        static MethodHandle of(@NotNull Ishaderc_include_result_release_fn lambda) {
            try {
                return MethodHandles.lookup().findVirtual(Ishaderc_include_result_release_fn.class, "invoke", shaderc_include_result_release_fn.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull Ishaderc_include_result_release_fn lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull Ishaderc_include_result_release_fn lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), shaderc_include_result_release_fn, arena);
        }
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private ShadercFunctionTypes() {}
}
