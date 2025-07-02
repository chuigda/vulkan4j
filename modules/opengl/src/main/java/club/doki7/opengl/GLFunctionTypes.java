package club.doki7.opengl;

import java.lang.foreign.*;
import java.lang.invoke.*;
import club.doki7.ffm.annotation.*;
import club.doki7.ffm.NativeLayout;
import org.jetbrains.annotations.NotNull;
import club.doki7.opengl.handle.*;

public final class GLFunctionTypes {
    public static final FunctionDescriptor GLDEBUGPROC = FunctionDescriptor.ofVoid(
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE),
        ValueLayout.ADDRESS
    );

    public static final FunctionDescriptor GLDEBUGPROCAMD = FunctionDescriptor.ofVoid(
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE),
        ValueLayout.ADDRESS
    );

    public static final FunctionDescriptor GLDEBUGPROCARB = FunctionDescriptor.ofVoid(
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE),
        ValueLayout.ADDRESS
    );

    public static final FunctionDescriptor GLDEBUGPROCKHR = FunctionDescriptor.ofVoid(
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE),
        ValueLayout.ADDRESS
    );

    public static final FunctionDescriptor GLVULKANPROCNV = FunctionDescriptor.ofVoid();

    @FunctionalInterface
    public interface IGLDEBUGPROC {
        void invoke(
            @NativeType("GLenum") int p0,
            @NativeType("GLenum") int p1,
            @NativeType("GLuint") @Unsigned int p2,
            @NativeType("GLenum") int p3,
            @NativeType("GLsizei") int p4,
            @Pointer(comment="void*") @NotNull MemorySegment p5,
            @Pointer(comment="void*") @NotNull MemorySegment p6
        );

        static MethodHandle of(@NotNull IGLDEBUGPROC lambda) {
            try {
                return MethodHandles.lookup().findVirtual(IGLDEBUGPROC.class, "invoke", GLDEBUGPROC.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull IGLDEBUGPROC lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull IGLDEBUGPROC lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), GLDEBUGPROC, arena);
        }
    }

    @FunctionalInterface
    public interface IGLDEBUGPROCAMD {
        void invoke(
            @NativeType("GLuint") @Unsigned int p0,
            @NativeType("GLenum") int p1,
            @NativeType("GLenum") int p2,
            @NativeType("GLsizei") int p3,
            @Pointer(comment="void*") @NotNull MemorySegment p4,
            @Pointer(comment="void*") @NotNull MemorySegment p5
        );

        static MethodHandle of(@NotNull IGLDEBUGPROCAMD lambda) {
            try {
                return MethodHandles.lookup().findVirtual(IGLDEBUGPROCAMD.class, "invoke", GLDEBUGPROCAMD.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull IGLDEBUGPROCAMD lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull IGLDEBUGPROCAMD lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), GLDEBUGPROCAMD, arena);
        }
    }

    @FunctionalInterface
    public interface IGLDEBUGPROCARB {
        void invoke(
            @NativeType("GLenum") int p0,
            @NativeType("GLenum") int p1,
            @NativeType("GLuint") @Unsigned int p2,
            @NativeType("GLenum") int p3,
            @NativeType("GLsizei") int p4,
            @Pointer(comment="void*") @NotNull MemorySegment p5,
            @Pointer(comment="void*") @NotNull MemorySegment p6
        );

        static MethodHandle of(@NotNull IGLDEBUGPROCARB lambda) {
            try {
                return MethodHandles.lookup().findVirtual(IGLDEBUGPROCARB.class, "invoke", GLDEBUGPROCARB.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull IGLDEBUGPROCARB lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull IGLDEBUGPROCARB lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), GLDEBUGPROCARB, arena);
        }
    }

    @FunctionalInterface
    public interface IGLDEBUGPROCKHR {
        void invoke(
            @NativeType("GLenum") int p0,
            @NativeType("GLenum") int p1,
            @NativeType("GLuint") @Unsigned int p2,
            @NativeType("GLenum") int p3,
            @NativeType("GLsizei") int p4,
            @Pointer(comment="void*") @NotNull MemorySegment p5,
            @Pointer(comment="void*") @NotNull MemorySegment p6
        );

        static MethodHandle of(@NotNull IGLDEBUGPROCKHR lambda) {
            try {
                return MethodHandles.lookup().findVirtual(IGLDEBUGPROCKHR.class, "invoke", GLDEBUGPROCKHR.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull IGLDEBUGPROCKHR lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull IGLDEBUGPROCKHR lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), GLDEBUGPROCKHR, arena);
        }
    }

    @FunctionalInterface
    public interface IGLVULKANPROCNV {
        void invoke(
        );

        static MethodHandle of(@NotNull IGLVULKANPROCNV lambda) {
            try {
                return MethodHandles.lookup().findVirtual(IGLVULKANPROCNV.class, "invoke", GLVULKANPROCNV.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull IGLVULKANPROCNV lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull IGLVULKANPROCNV lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), GLVULKANPROCNV, arena);
        }
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private GLFunctionTypes() {}
}
