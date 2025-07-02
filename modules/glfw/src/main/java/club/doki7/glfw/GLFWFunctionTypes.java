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
    public interface IGLFWallocatefun {
        @Pointer(comment="void*") @NotNull MemorySegment invoke(
            @NativeType("size_t") MemorySegment p0,
            @Pointer(comment="void*") @NotNull MemorySegment p1
        );

        static MethodHandle of(@NotNull IGLFWallocatefun lambda) {
            try {
                return MethodHandles.lookup().findVirtual(IGLFWallocatefun.class, "invoke", GLFWallocatefun.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull IGLFWallocatefun lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull IGLFWallocatefun lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), GLFWallocatefun, arena);
        }
    }

    @FunctionalInterface
    public interface IGLFWcharfun {
        void invoke(
            @NativeType("GLFWwindow") MemorySegment p0,
            int p1
        );

        static MethodHandle of(@NotNull IGLFWcharfun lambda) {
            try {
                return MethodHandles.lookup().findVirtual(IGLFWcharfun.class, "invoke", GLFWcharfun.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull IGLFWcharfun lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull IGLFWcharfun lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), GLFWcharfun, arena);
        }
    }

    @FunctionalInterface
    public interface IGLFWcharmodsfun {
        void invoke(
            @NativeType("GLFWwindow") MemorySegment p0,
            int p1,
            int p2
        );

        static MethodHandle of(@NotNull IGLFWcharmodsfun lambda) {
            try {
                return MethodHandles.lookup().findVirtual(IGLFWcharmodsfun.class, "invoke", GLFWcharmodsfun.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull IGLFWcharmodsfun lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull IGLFWcharmodsfun lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), GLFWcharmodsfun, arena);
        }
    }

    @FunctionalInterface
    public interface IGLFWcursorenterfun {
        void invoke(
            @NativeType("GLFWwindow") MemorySegment p0,
            int p1
        );

        static MethodHandle of(@NotNull IGLFWcursorenterfun lambda) {
            try {
                return MethodHandles.lookup().findVirtual(IGLFWcursorenterfun.class, "invoke", GLFWcursorenterfun.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull IGLFWcursorenterfun lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull IGLFWcursorenterfun lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), GLFWcursorenterfun, arena);
        }
    }

    @FunctionalInterface
    public interface IGLFWcursorposfun {
        void invoke(
            @NativeType("GLFWwindow") MemorySegment p0,
            double p1,
            double p2
        );

        static MethodHandle of(@NotNull IGLFWcursorposfun lambda) {
            try {
                return MethodHandles.lookup().findVirtual(IGLFWcursorposfun.class, "invoke", GLFWcursorposfun.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull IGLFWcursorposfun lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull IGLFWcursorposfun lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), GLFWcursorposfun, arena);
        }
    }

    @FunctionalInterface
    public interface IGLFWdeallocatefun {
        void invoke(
            @Pointer(comment="void*") @NotNull MemorySegment p0,
            @Pointer(comment="void*") @NotNull MemorySegment p1
        );

        static MethodHandle of(@NotNull IGLFWdeallocatefun lambda) {
            try {
                return MethodHandles.lookup().findVirtual(IGLFWdeallocatefun.class, "invoke", GLFWdeallocatefun.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull IGLFWdeallocatefun lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull IGLFWdeallocatefun lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), GLFWdeallocatefun, arena);
        }
    }

    @FunctionalInterface
    public interface IGLFWdropfun {
        void invoke(
            @NativeType("GLFWwindow") MemorySegment p0,
            int p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2
        );

        static MethodHandle of(@NotNull IGLFWdropfun lambda) {
            try {
                return MethodHandles.lookup().findVirtual(IGLFWdropfun.class, "invoke", GLFWdropfun.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull IGLFWdropfun lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull IGLFWdropfun lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), GLFWdropfun, arena);
        }
    }

    @FunctionalInterface
    public interface IGLFWerrorfun {
        void invoke(
            int p0,
            @Pointer(comment="void*") @NotNull MemorySegment p1
        );

        static MethodHandle of(@NotNull IGLFWerrorfun lambda) {
            try {
                return MethodHandles.lookup().findVirtual(IGLFWerrorfun.class, "invoke", GLFWerrorfun.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull IGLFWerrorfun lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull IGLFWerrorfun lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), GLFWerrorfun, arena);
        }
    }

    @FunctionalInterface
    public interface IGLFWframebuffersizefun {
        void invoke(
            @NativeType("GLFWwindow") MemorySegment p0,
            int p1,
            int p2
        );

        static MethodHandle of(@NotNull IGLFWframebuffersizefun lambda) {
            try {
                return MethodHandles.lookup().findVirtual(IGLFWframebuffersizefun.class, "invoke", GLFWframebuffersizefun.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull IGLFWframebuffersizefun lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull IGLFWframebuffersizefun lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), GLFWframebuffersizefun, arena);
        }
    }

    @FunctionalInterface
    public interface IGLFWglproc {
        void invoke(
        );

        static MethodHandle of(@NotNull IGLFWglproc lambda) {
            try {
                return MethodHandles.lookup().findVirtual(IGLFWglproc.class, "invoke", GLFWglproc.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull IGLFWglproc lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull IGLFWglproc lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), GLFWglproc, arena);
        }
    }

    @FunctionalInterface
    public interface IGLFWjoystickfun {
        void invoke(
            int p0,
            int p1
        );

        static MethodHandle of(@NotNull IGLFWjoystickfun lambda) {
            try {
                return MethodHandles.lookup().findVirtual(IGLFWjoystickfun.class, "invoke", GLFWjoystickfun.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull IGLFWjoystickfun lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull IGLFWjoystickfun lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), GLFWjoystickfun, arena);
        }
    }

    @FunctionalInterface
    public interface IGLFWkeyfun {
        void invoke(
            @NativeType("GLFWwindow") MemorySegment p0,
            int p1,
            int p2,
            int p3,
            int p4
        );

        static MethodHandle of(@NotNull IGLFWkeyfun lambda) {
            try {
                return MethodHandles.lookup().findVirtual(IGLFWkeyfun.class, "invoke", GLFWkeyfun.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull IGLFWkeyfun lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull IGLFWkeyfun lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), GLFWkeyfun, arena);
        }
    }

    @FunctionalInterface
    public interface IGLFWmonitorfun {
        void invoke(
            @NativeType("GLFWmonitor") MemorySegment p0,
            int p1
        );

        static MethodHandle of(@NotNull IGLFWmonitorfun lambda) {
            try {
                return MethodHandles.lookup().findVirtual(IGLFWmonitorfun.class, "invoke", GLFWmonitorfun.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull IGLFWmonitorfun lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull IGLFWmonitorfun lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), GLFWmonitorfun, arena);
        }
    }

    @FunctionalInterface
    public interface IGLFWmousebuttonfun {
        void invoke(
            @NativeType("GLFWwindow") MemorySegment p0,
            int p1,
            int p2,
            int p3
        );

        static MethodHandle of(@NotNull IGLFWmousebuttonfun lambda) {
            try {
                return MethodHandles.lookup().findVirtual(IGLFWmousebuttonfun.class, "invoke", GLFWmousebuttonfun.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull IGLFWmousebuttonfun lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull IGLFWmousebuttonfun lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), GLFWmousebuttonfun, arena);
        }
    }

    @FunctionalInterface
    public interface IGLFWreallocatefun {
        @Pointer(comment="void*") @NotNull MemorySegment invoke(
            @Pointer(comment="void*") @NotNull MemorySegment p0,
            @NativeType("size_t") MemorySegment p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2
        );

        static MethodHandle of(@NotNull IGLFWreallocatefun lambda) {
            try {
                return MethodHandles.lookup().findVirtual(IGLFWreallocatefun.class, "invoke", GLFWreallocatefun.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull IGLFWreallocatefun lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull IGLFWreallocatefun lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), GLFWreallocatefun, arena);
        }
    }

    @FunctionalInterface
    public interface IGLFWscrollfun {
        void invoke(
            @NativeType("GLFWwindow") MemorySegment p0,
            double p1,
            double p2
        );

        static MethodHandle of(@NotNull IGLFWscrollfun lambda) {
            try {
                return MethodHandles.lookup().findVirtual(IGLFWscrollfun.class, "invoke", GLFWscrollfun.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull IGLFWscrollfun lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull IGLFWscrollfun lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), GLFWscrollfun, arena);
        }
    }

    @FunctionalInterface
    public interface IGLFWvkproc {
        void invoke(
        );

        static MethodHandle of(@NotNull IGLFWvkproc lambda) {
            try {
                return MethodHandles.lookup().findVirtual(IGLFWvkproc.class, "invoke", GLFWvkproc.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull IGLFWvkproc lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull IGLFWvkproc lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), GLFWvkproc, arena);
        }
    }

    @FunctionalInterface
    public interface IGLFWwindowclosefun {
        void invoke(
            @NativeType("GLFWwindow") MemorySegment p0
        );

        static MethodHandle of(@NotNull IGLFWwindowclosefun lambda) {
            try {
                return MethodHandles.lookup().findVirtual(IGLFWwindowclosefun.class, "invoke", GLFWwindowclosefun.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull IGLFWwindowclosefun lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull IGLFWwindowclosefun lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), GLFWwindowclosefun, arena);
        }
    }

    @FunctionalInterface
    public interface IGLFWwindowcontentscalefun {
        void invoke(
            @NativeType("GLFWwindow") MemorySegment p0,
            float p1,
            float p2
        );

        static MethodHandle of(@NotNull IGLFWwindowcontentscalefun lambda) {
            try {
                return MethodHandles.lookup().findVirtual(IGLFWwindowcontentscalefun.class, "invoke", GLFWwindowcontentscalefun.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull IGLFWwindowcontentscalefun lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull IGLFWwindowcontentscalefun lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), GLFWwindowcontentscalefun, arena);
        }
    }

    @FunctionalInterface
    public interface IGLFWwindowfocusfun {
        void invoke(
            @NativeType("GLFWwindow") MemorySegment p0,
            int p1
        );

        static MethodHandle of(@NotNull IGLFWwindowfocusfun lambda) {
            try {
                return MethodHandles.lookup().findVirtual(IGLFWwindowfocusfun.class, "invoke", GLFWwindowfocusfun.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull IGLFWwindowfocusfun lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull IGLFWwindowfocusfun lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), GLFWwindowfocusfun, arena);
        }
    }

    @FunctionalInterface
    public interface IGLFWwindowiconifyfun {
        void invoke(
            @NativeType("GLFWwindow") MemorySegment p0,
            int p1
        );

        static MethodHandle of(@NotNull IGLFWwindowiconifyfun lambda) {
            try {
                return MethodHandles.lookup().findVirtual(IGLFWwindowiconifyfun.class, "invoke", GLFWwindowiconifyfun.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull IGLFWwindowiconifyfun lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull IGLFWwindowiconifyfun lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), GLFWwindowiconifyfun, arena);
        }
    }

    @FunctionalInterface
    public interface IGLFWwindowmaximizefun {
        void invoke(
            @NativeType("GLFWwindow") MemorySegment p0,
            int p1
        );

        static MethodHandle of(@NotNull IGLFWwindowmaximizefun lambda) {
            try {
                return MethodHandles.lookup().findVirtual(IGLFWwindowmaximizefun.class, "invoke", GLFWwindowmaximizefun.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull IGLFWwindowmaximizefun lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull IGLFWwindowmaximizefun lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), GLFWwindowmaximizefun, arena);
        }
    }

    @FunctionalInterface
    public interface IGLFWwindowposfun {
        void invoke(
            @NativeType("GLFWwindow") MemorySegment p0,
            int p1,
            int p2
        );

        static MethodHandle of(@NotNull IGLFWwindowposfun lambda) {
            try {
                return MethodHandles.lookup().findVirtual(IGLFWwindowposfun.class, "invoke", GLFWwindowposfun.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull IGLFWwindowposfun lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull IGLFWwindowposfun lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), GLFWwindowposfun, arena);
        }
    }

    @FunctionalInterface
    public interface IGLFWwindowrefreshfun {
        void invoke(
            @NativeType("GLFWwindow") MemorySegment p0
        );

        static MethodHandle of(@NotNull IGLFWwindowrefreshfun lambda) {
            try {
                return MethodHandles.lookup().findVirtual(IGLFWwindowrefreshfun.class, "invoke", GLFWwindowrefreshfun.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull IGLFWwindowrefreshfun lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull IGLFWwindowrefreshfun lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), GLFWwindowrefreshfun, arena);
        }
    }

    @FunctionalInterface
    public interface IGLFWwindowsizefun {
        void invoke(
            @NativeType("GLFWwindow") MemorySegment p0,
            int p1,
            int p2
        );

        static MethodHandle of(@NotNull IGLFWwindowsizefun lambda) {
            try {
                return MethodHandles.lookup().findVirtual(IGLFWwindowsizefun.class, "invoke", GLFWwindowsizefun.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull IGLFWwindowsizefun lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull IGLFWwindowsizefun lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), GLFWwindowsizefun, arena);
        }
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private GLFWFunctionTypes() {}
}
