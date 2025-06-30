package club.doki7.glfw;

import java.lang.foreign.*;
import java.lang.invoke.*;
import club.doki7.ffm.annotation.*;
import club.doki7.ffm.NativeLayout;
import org.jetbrains.annotations.NotNull;
import club.doki7.glfw.datatype.*;
import club.doki7.glfw.handle.*;

public final class GLFWFunctionTypes {
    public static final FunctionDescriptor GLFWallocatefun = FunctionDescriptor.of(
        ValueLayout.ADDRESS,
        NativeLayout.C_SIZE_T,
        ValueLayout.ADDRESS
    );

    public static final FunctionDescriptor GLFWcharfun = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor GLFWcharmodsfun = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor GLFWcursorenterfun = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor GLFWcursorposfun = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_DOUBLE,
        ValueLayout.JAVA_DOUBLE
    );

    public static final FunctionDescriptor GLFWdeallocatefun = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS,
        ValueLayout.ADDRESS
    );

    public static final FunctionDescriptor GLFWdropfun = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE))
    );

    public static final FunctionDescriptor GLFWerrorfun = FunctionDescriptor.ofVoid(
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE)
    );

    public static final FunctionDescriptor GLFWframebuffersizefun = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor GLFWglproc = FunctionDescriptor.ofVoid();

    public static final FunctionDescriptor GLFWjoystickfun = FunctionDescriptor.ofVoid(
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor GLFWkeyfun = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor GLFWmonitorfun = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor GLFWmousebuttonfun = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor GLFWreallocatefun = FunctionDescriptor.of(
        ValueLayout.ADDRESS,
        ValueLayout.ADDRESS,
        NativeLayout.C_SIZE_T,
        ValueLayout.ADDRESS
    );

    public static final FunctionDescriptor GLFWscrollfun = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_DOUBLE,
        ValueLayout.JAVA_DOUBLE
    );

    public static final FunctionDescriptor GLFWvkproc = FunctionDescriptor.ofVoid();

    public static final FunctionDescriptor GLFWwindowclosefun = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS
    );

    public static final FunctionDescriptor GLFWwindowcontentscalefun = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_FLOAT,
        ValueLayout.JAVA_FLOAT
    );

    public static final FunctionDescriptor GLFWwindowfocusfun = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor GLFWwindowiconifyfun = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor GLFWwindowmaximizefun = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor GLFWwindowposfun = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor GLFWwindowrefreshfun = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS
    );

    public static final FunctionDescriptor GLFWwindowsizefun = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT
    );

    @FunctionalInterface
    public interface GLFWallocatefun {
        @Pointer(comment="void*") @NotNull MemorySegment invoke(
            long p0,
            @Pointer(comment="void*") @NotNull MemorySegment p1
        );

        static MethodHandle of(@NotNull GLFWallocatefun lambda) {
            try {
                return MethodHandles.lookup().findVirtual(GLFWallocatefun.class, "invoke", GLFWallocatefun.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull GLFWallocatefun lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull GLFWallocatefun lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), GLFWallocatefun, arena);
        }
    }

    @FunctionalInterface
    public interface GLFWcharfun {
        void invoke(
            GLFWwindow p0,
            int p1
        );

        static MethodHandle of(@NotNull GLFWcharfun lambda) {
            try {
                return MethodHandles.lookup().findVirtual(GLFWcharfun.class, "invoke", GLFWcharfun.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull GLFWcharfun lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull GLFWcharfun lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), GLFWcharfun, arena);
        }
    }

    @FunctionalInterface
    public interface GLFWcharmodsfun {
        void invoke(
            GLFWwindow p0,
            int p1,
            int p2
        );

        static MethodHandle of(@NotNull GLFWcharmodsfun lambda) {
            try {
                return MethodHandles.lookup().findVirtual(GLFWcharmodsfun.class, "invoke", GLFWcharmodsfun.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull GLFWcharmodsfun lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull GLFWcharmodsfun lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), GLFWcharmodsfun, arena);
        }
    }

    @FunctionalInterface
    public interface GLFWcursorenterfun {
        void invoke(
            GLFWwindow p0,
            int p1
        );

        static MethodHandle of(@NotNull GLFWcursorenterfun lambda) {
            try {
                return MethodHandles.lookup().findVirtual(GLFWcursorenterfun.class, "invoke", GLFWcursorenterfun.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull GLFWcursorenterfun lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull GLFWcursorenterfun lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), GLFWcursorenterfun, arena);
        }
    }

    @FunctionalInterface
    public interface GLFWcursorposfun {
        void invoke(
            GLFWwindow p0,
            double p1,
            double p2
        );

        static MethodHandle of(@NotNull GLFWcursorposfun lambda) {
            try {
                return MethodHandles.lookup().findVirtual(GLFWcursorposfun.class, "invoke", GLFWcursorposfun.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull GLFWcursorposfun lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull GLFWcursorposfun lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), GLFWcursorposfun, arena);
        }
    }

    @FunctionalInterface
    public interface GLFWdeallocatefun {
        void invoke(
            @Pointer(comment="void*") @NotNull MemorySegment p0,
            @Pointer(comment="void*") @NotNull MemorySegment p1
        );

        static MethodHandle of(@NotNull GLFWdeallocatefun lambda) {
            try {
                return MethodHandles.lookup().findVirtual(GLFWdeallocatefun.class, "invoke", GLFWdeallocatefun.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull GLFWdeallocatefun lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull GLFWdeallocatefun lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), GLFWdeallocatefun, arena);
        }
    }

    @FunctionalInterface
    public interface GLFWdropfun {
        void invoke(
            GLFWwindow p0,
            int p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2
        );

        static MethodHandle of(@NotNull GLFWdropfun lambda) {
            try {
                return MethodHandles.lookup().findVirtual(GLFWdropfun.class, "invoke", GLFWdropfun.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull GLFWdropfun lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull GLFWdropfun lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), GLFWdropfun, arena);
        }
    }

    @FunctionalInterface
    public interface GLFWerrorfun {
        void invoke(
            int p0,
            @Pointer(comment="void*") @NotNull MemorySegment p1
        );

        static MethodHandle of(@NotNull GLFWerrorfun lambda) {
            try {
                return MethodHandles.lookup().findVirtual(GLFWerrorfun.class, "invoke", GLFWerrorfun.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull GLFWerrorfun lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull GLFWerrorfun lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), GLFWerrorfun, arena);
        }
    }

    @FunctionalInterface
    public interface GLFWframebuffersizefun {
        void invoke(
            GLFWwindow p0,
            int p1,
            int p2
        );

        static MethodHandle of(@NotNull GLFWframebuffersizefun lambda) {
            try {
                return MethodHandles.lookup().findVirtual(GLFWframebuffersizefun.class, "invoke", GLFWframebuffersizefun.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull GLFWframebuffersizefun lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull GLFWframebuffersizefun lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), GLFWframebuffersizefun, arena);
        }
    }

    @FunctionalInterface
    public interface GLFWglproc {
        void invoke(
        );

        static MethodHandle of(@NotNull GLFWglproc lambda) {
            try {
                return MethodHandles.lookup().findVirtual(GLFWglproc.class, "invoke", GLFWglproc.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull GLFWglproc lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull GLFWglproc lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), GLFWglproc, arena);
        }
    }

    @FunctionalInterface
    public interface GLFWjoystickfun {
        void invoke(
            int p0,
            int p1
        );

        static MethodHandle of(@NotNull GLFWjoystickfun lambda) {
            try {
                return MethodHandles.lookup().findVirtual(GLFWjoystickfun.class, "invoke", GLFWjoystickfun.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull GLFWjoystickfun lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull GLFWjoystickfun lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), GLFWjoystickfun, arena);
        }
    }

    @FunctionalInterface
    public interface GLFWkeyfun {
        void invoke(
            GLFWwindow p0,
            int p1,
            int p2,
            int p3,
            int p4
        );

        static MethodHandle of(@NotNull GLFWkeyfun lambda) {
            try {
                return MethodHandles.lookup().findVirtual(GLFWkeyfun.class, "invoke", GLFWkeyfun.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull GLFWkeyfun lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull GLFWkeyfun lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), GLFWkeyfun, arena);
        }
    }

    @FunctionalInterface
    public interface GLFWmonitorfun {
        void invoke(
            GLFWmonitor p0,
            int p1
        );

        static MethodHandle of(@NotNull GLFWmonitorfun lambda) {
            try {
                return MethodHandles.lookup().findVirtual(GLFWmonitorfun.class, "invoke", GLFWmonitorfun.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull GLFWmonitorfun lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull GLFWmonitorfun lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), GLFWmonitorfun, arena);
        }
    }

    @FunctionalInterface
    public interface GLFWmousebuttonfun {
        void invoke(
            GLFWwindow p0,
            int p1,
            int p2,
            int p3
        );

        static MethodHandle of(@NotNull GLFWmousebuttonfun lambda) {
            try {
                return MethodHandles.lookup().findVirtual(GLFWmousebuttonfun.class, "invoke", GLFWmousebuttonfun.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull GLFWmousebuttonfun lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull GLFWmousebuttonfun lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), GLFWmousebuttonfun, arena);
        }
    }

    @FunctionalInterface
    public interface GLFWreallocatefun {
        @Pointer(comment="void*") @NotNull MemorySegment invoke(
            @Pointer(comment="void*") @NotNull MemorySegment p0,
            long p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2
        );

        static MethodHandle of(@NotNull GLFWreallocatefun lambda) {
            try {
                return MethodHandles.lookup().findVirtual(GLFWreallocatefun.class, "invoke", GLFWreallocatefun.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull GLFWreallocatefun lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull GLFWreallocatefun lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), GLFWreallocatefun, arena);
        }
    }

    @FunctionalInterface
    public interface GLFWscrollfun {
        void invoke(
            GLFWwindow p0,
            double p1,
            double p2
        );

        static MethodHandle of(@NotNull GLFWscrollfun lambda) {
            try {
                return MethodHandles.lookup().findVirtual(GLFWscrollfun.class, "invoke", GLFWscrollfun.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull GLFWscrollfun lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull GLFWscrollfun lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), GLFWscrollfun, arena);
        }
    }

    @FunctionalInterface
    public interface GLFWvkproc {
        void invoke(
        );

        static MethodHandle of(@NotNull GLFWvkproc lambda) {
            try {
                return MethodHandles.lookup().findVirtual(GLFWvkproc.class, "invoke", GLFWvkproc.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull GLFWvkproc lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull GLFWvkproc lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), GLFWvkproc, arena);
        }
    }

    @FunctionalInterface
    public interface GLFWwindowclosefun {
        void invoke(
            GLFWwindow p0
        );

        static MethodHandle of(@NotNull GLFWwindowclosefun lambda) {
            try {
                return MethodHandles.lookup().findVirtual(GLFWwindowclosefun.class, "invoke", GLFWwindowclosefun.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull GLFWwindowclosefun lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull GLFWwindowclosefun lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), GLFWwindowclosefun, arena);
        }
    }

    @FunctionalInterface
    public interface GLFWwindowcontentscalefun {
        void invoke(
            GLFWwindow p0,
            float p1,
            float p2
        );

        static MethodHandle of(@NotNull GLFWwindowcontentscalefun lambda) {
            try {
                return MethodHandles.lookup().findVirtual(GLFWwindowcontentscalefun.class, "invoke", GLFWwindowcontentscalefun.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull GLFWwindowcontentscalefun lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull GLFWwindowcontentscalefun lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), GLFWwindowcontentscalefun, arena);
        }
    }

    @FunctionalInterface
    public interface GLFWwindowfocusfun {
        void invoke(
            GLFWwindow p0,
            int p1
        );

        static MethodHandle of(@NotNull GLFWwindowfocusfun lambda) {
            try {
                return MethodHandles.lookup().findVirtual(GLFWwindowfocusfun.class, "invoke", GLFWwindowfocusfun.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull GLFWwindowfocusfun lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull GLFWwindowfocusfun lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), GLFWwindowfocusfun, arena);
        }
    }

    @FunctionalInterface
    public interface GLFWwindowiconifyfun {
        void invoke(
            GLFWwindow p0,
            int p1
        );

        static MethodHandle of(@NotNull GLFWwindowiconifyfun lambda) {
            try {
                return MethodHandles.lookup().findVirtual(GLFWwindowiconifyfun.class, "invoke", GLFWwindowiconifyfun.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull GLFWwindowiconifyfun lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull GLFWwindowiconifyfun lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), GLFWwindowiconifyfun, arena);
        }
    }

    @FunctionalInterface
    public interface GLFWwindowmaximizefun {
        void invoke(
            GLFWwindow p0,
            int p1
        );

        static MethodHandle of(@NotNull GLFWwindowmaximizefun lambda) {
            try {
                return MethodHandles.lookup().findVirtual(GLFWwindowmaximizefun.class, "invoke", GLFWwindowmaximizefun.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull GLFWwindowmaximizefun lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull GLFWwindowmaximizefun lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), GLFWwindowmaximizefun, arena);
        }
    }

    @FunctionalInterface
    public interface GLFWwindowposfun {
        void invoke(
            GLFWwindow p0,
            int p1,
            int p2
        );

        static MethodHandle of(@NotNull GLFWwindowposfun lambda) {
            try {
                return MethodHandles.lookup().findVirtual(GLFWwindowposfun.class, "invoke", GLFWwindowposfun.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull GLFWwindowposfun lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull GLFWwindowposfun lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), GLFWwindowposfun, arena);
        }
    }

    @FunctionalInterface
    public interface GLFWwindowrefreshfun {
        void invoke(
            GLFWwindow p0
        );

        static MethodHandle of(@NotNull GLFWwindowrefreshfun lambda) {
            try {
                return MethodHandles.lookup().findVirtual(GLFWwindowrefreshfun.class, "invoke", GLFWwindowrefreshfun.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull GLFWwindowrefreshfun lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull GLFWwindowrefreshfun lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), GLFWwindowrefreshfun, arena);
        }
    }

    @FunctionalInterface
    public interface GLFWwindowsizefun {
        void invoke(
            GLFWwindow p0,
            int p1,
            int p2
        );

        static MethodHandle of(@NotNull GLFWwindowsizefun lambda) {
            try {
                return MethodHandles.lookup().findVirtual(GLFWwindowsizefun.class, "invoke", GLFWwindowsizefun.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull GLFWwindowsizefun lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull GLFWwindowsizefun lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), GLFWwindowsizefun, arena);
        }
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private GLFWFunctionTypes() {}
}
