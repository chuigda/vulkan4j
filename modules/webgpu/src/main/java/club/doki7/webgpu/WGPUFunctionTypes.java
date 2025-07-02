package club.doki7.webgpu;

import java.lang.foreign.*;
import java.lang.invoke.*;
import club.doki7.ffm.annotation.*;
import club.doki7.ffm.NativeLayout;
import org.jetbrains.annotations.NotNull;
import club.doki7.webgpu.datatype.*;
import club.doki7.webgpu.bitmask.*;
import club.doki7.webgpu.enumtype.*;
import club.doki7.webgpu.handle.*;

public final class WGPUFunctionTypes {
    public static final FunctionDescriptor WGPUBufferMapCallback = FunctionDescriptor.ofVoid(
        ValueLayout.JAVA_INT,
        WGPUStringView.LAYOUT,
        ValueLayout.ADDRESS,
        ValueLayout.ADDRESS
    );

    public static final FunctionDescriptor WGPUCompilationInfoCallback = FunctionDescriptor.ofVoid(
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(WGPUCompilationInfo.LAYOUT),
        ValueLayout.ADDRESS,
        ValueLayout.ADDRESS
    );

    public static final FunctionDescriptor WGPUCreateComputePipelineAsyncCallback = FunctionDescriptor.ofVoid(
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS,
        WGPUStringView.LAYOUT,
        ValueLayout.ADDRESS,
        ValueLayout.ADDRESS
    );

    public static final FunctionDescriptor WGPUCreateRenderPipelineAsyncCallback = FunctionDescriptor.ofVoid(
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS,
        WGPUStringView.LAYOUT,
        ValueLayout.ADDRESS,
        ValueLayout.ADDRESS
    );

    public static final FunctionDescriptor WGPUDeviceLostCallback = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS),
        ValueLayout.JAVA_INT,
        WGPUStringView.LAYOUT,
        ValueLayout.ADDRESS,
        ValueLayout.ADDRESS
    );

    public static final FunctionDescriptor WGPULogCallback = FunctionDescriptor.ofVoid(
        ValueLayout.JAVA_INT,
        WGPUStringView.LAYOUT,
        ValueLayout.ADDRESS
    );

    public static final FunctionDescriptor WGPUPopErrorScopeCallback = FunctionDescriptor.ofVoid(
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        WGPUStringView.LAYOUT,
        ValueLayout.ADDRESS,
        ValueLayout.ADDRESS
    );

    public static final FunctionDescriptor WGPUQueueWorkDoneCallback = FunctionDescriptor.ofVoid(
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS,
        ValueLayout.ADDRESS
    );

    public static final FunctionDescriptor WGPURequestAdapterCallback = FunctionDescriptor.ofVoid(
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS,
        WGPUStringView.LAYOUT,
        ValueLayout.ADDRESS,
        ValueLayout.ADDRESS
    );

    public static final FunctionDescriptor WGPURequestDeviceCallback = FunctionDescriptor.ofVoid(
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS,
        WGPUStringView.LAYOUT,
        ValueLayout.ADDRESS,
        ValueLayout.ADDRESS
    );

    public static final FunctionDescriptor WGPUUncapturedErrorCallback = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS),
        ValueLayout.JAVA_INT,
        WGPUStringView.LAYOUT,
        ValueLayout.ADDRESS,
        ValueLayout.ADDRESS
    );

    @FunctionalInterface
    public interface WGPUBufferMapCallback {
        void invoke(
            @EnumType(WGPUMapAsyncStatus.class) int p0,
            IWGPUStringView p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2,
            @Pointer(comment="void*") @NotNull MemorySegment p3
        );

        static MethodHandle of(@NotNull WGPUBufferMapCallback lambda) {
            try {
                return MethodHandles.lookup().findVirtual(WGPUBufferMapCallback.class, "invoke", WGPUBufferMapCallback.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull WGPUBufferMapCallback lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull WGPUBufferMapCallback lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), WGPUBufferMapCallback, arena);
        }
    }

    @FunctionalInterface
    public interface WGPUCompilationInfoCallback {
        void invoke(
            @EnumType(WGPUCompilationInfoRequestStatus.class) int p0,
            @Pointer(comment="void*") @NotNull MemorySegment p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2,
            @Pointer(comment="void*") @NotNull MemorySegment p3
        );

        static MethodHandle of(@NotNull WGPUCompilationInfoCallback lambda) {
            try {
                return MethodHandles.lookup().findVirtual(WGPUCompilationInfoCallback.class, "invoke", WGPUCompilationInfoCallback.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull WGPUCompilationInfoCallback lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull WGPUCompilationInfoCallback lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), WGPUCompilationInfoCallback, arena);
        }
    }

    @FunctionalInterface
    public interface WGPUCreateComputePipelineAsyncCallback {
        void invoke(
            @EnumType(WGPUCreatePipelineAsyncStatus.class) int p0,
            WGPUComputePipeline p1,
            IWGPUStringView p2,
            @Pointer(comment="void*") @NotNull MemorySegment p3,
            @Pointer(comment="void*") @NotNull MemorySegment p4
        );

        static MethodHandle of(@NotNull WGPUCreateComputePipelineAsyncCallback lambda) {
            try {
                return MethodHandles.lookup().findVirtual(WGPUCreateComputePipelineAsyncCallback.class, "invoke", WGPUCreateComputePipelineAsyncCallback.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull WGPUCreateComputePipelineAsyncCallback lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull WGPUCreateComputePipelineAsyncCallback lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), WGPUCreateComputePipelineAsyncCallback, arena);
        }
    }

    @FunctionalInterface
    public interface WGPUCreateRenderPipelineAsyncCallback {
        void invoke(
            @EnumType(WGPUCreatePipelineAsyncStatus.class) int p0,
            WGPURenderPipeline p1,
            IWGPUStringView p2,
            @Pointer(comment="void*") @NotNull MemorySegment p3,
            @Pointer(comment="void*") @NotNull MemorySegment p4
        );

        static MethodHandle of(@NotNull WGPUCreateRenderPipelineAsyncCallback lambda) {
            try {
                return MethodHandles.lookup().findVirtual(WGPUCreateRenderPipelineAsyncCallback.class, "invoke", WGPUCreateRenderPipelineAsyncCallback.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull WGPUCreateRenderPipelineAsyncCallback lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull WGPUCreateRenderPipelineAsyncCallback lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), WGPUCreateRenderPipelineAsyncCallback, arena);
        }
    }

    @FunctionalInterface
    public interface WGPUDeviceLostCallback {
        void invoke(
            @Pointer(comment="void*") @NotNull MemorySegment p0,
            @EnumType(WGPUDeviceLostReason.class) int p1,
            IWGPUStringView p2,
            @Pointer(comment="void*") @NotNull MemorySegment p3,
            @Pointer(comment="void*") @NotNull MemorySegment p4
        );

        static MethodHandle of(@NotNull WGPUDeviceLostCallback lambda) {
            try {
                return MethodHandles.lookup().findVirtual(WGPUDeviceLostCallback.class, "invoke", WGPUDeviceLostCallback.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull WGPUDeviceLostCallback lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull WGPUDeviceLostCallback lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), WGPUDeviceLostCallback, arena);
        }
    }

    @FunctionalInterface
    public interface WGPULogCallback {
        void invoke(
            @EnumType(WGPULogLevel.class) int p0,
            IWGPUStringView p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2
        );

        static MethodHandle of(@NotNull WGPULogCallback lambda) {
            try {
                return MethodHandles.lookup().findVirtual(WGPULogCallback.class, "invoke", WGPULogCallback.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull WGPULogCallback lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull WGPULogCallback lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), WGPULogCallback, arena);
        }
    }

    @FunctionalInterface
    public interface WGPUPopErrorScopeCallback {
        void invoke(
            @EnumType(WGPUPopErrorScopeStatus.class) int p0,
            @EnumType(WGPUErrorType.class) int p1,
            IWGPUStringView p2,
            @Pointer(comment="void*") @NotNull MemorySegment p3,
            @Pointer(comment="void*") @NotNull MemorySegment p4
        );

        static MethodHandle of(@NotNull WGPUPopErrorScopeCallback lambda) {
            try {
                return MethodHandles.lookup().findVirtual(WGPUPopErrorScopeCallback.class, "invoke", WGPUPopErrorScopeCallback.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull WGPUPopErrorScopeCallback lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull WGPUPopErrorScopeCallback lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), WGPUPopErrorScopeCallback, arena);
        }
    }

    @FunctionalInterface
    public interface WGPUQueueWorkDoneCallback {
        void invoke(
            @EnumType(WGPUQueueWorkDoneStatus.class) int p0,
            @Pointer(comment="void*") @NotNull MemorySegment p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2
        );

        static MethodHandle of(@NotNull WGPUQueueWorkDoneCallback lambda) {
            try {
                return MethodHandles.lookup().findVirtual(WGPUQueueWorkDoneCallback.class, "invoke", WGPUQueueWorkDoneCallback.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull WGPUQueueWorkDoneCallback lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull WGPUQueueWorkDoneCallback lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), WGPUQueueWorkDoneCallback, arena);
        }
    }

    @FunctionalInterface
    public interface WGPURequestAdapterCallback {
        void invoke(
            @EnumType(WGPURequestAdapterStatus.class) int p0,
            WGPUAdapter p1,
            IWGPUStringView p2,
            @Pointer(comment="void*") @NotNull MemorySegment p3,
            @Pointer(comment="void*") @NotNull MemorySegment p4
        );

        static MethodHandle of(@NotNull WGPURequestAdapterCallback lambda) {
            try {
                return MethodHandles.lookup().findVirtual(WGPURequestAdapterCallback.class, "invoke", WGPURequestAdapterCallback.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull WGPURequestAdapterCallback lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull WGPURequestAdapterCallback lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), WGPURequestAdapterCallback, arena);
        }
    }

    @FunctionalInterface
    public interface WGPURequestDeviceCallback {
        void invoke(
            @EnumType(WGPURequestDeviceStatus.class) int p0,
            WGPUDevice p1,
            IWGPUStringView p2,
            @Pointer(comment="void*") @NotNull MemorySegment p3,
            @Pointer(comment="void*") @NotNull MemorySegment p4
        );

        static MethodHandle of(@NotNull WGPURequestDeviceCallback lambda) {
            try {
                return MethodHandles.lookup().findVirtual(WGPURequestDeviceCallback.class, "invoke", WGPURequestDeviceCallback.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull WGPURequestDeviceCallback lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull WGPURequestDeviceCallback lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), WGPURequestDeviceCallback, arena);
        }
    }

    @FunctionalInterface
    public interface WGPUUncapturedErrorCallback {
        void invoke(
            @Pointer(comment="void*") @NotNull MemorySegment p0,
            @EnumType(WGPUErrorType.class) int p1,
            IWGPUStringView p2,
            @Pointer(comment="void*") @NotNull MemorySegment p3,
            @Pointer(comment="void*") @NotNull MemorySegment p4
        );

        static MethodHandle of(@NotNull WGPUUncapturedErrorCallback lambda) {
            try {
                return MethodHandles.lookup().findVirtual(WGPUUncapturedErrorCallback.class, "invoke", WGPUUncapturedErrorCallback.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull WGPUUncapturedErrorCallback lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull WGPUUncapturedErrorCallback lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), WGPUUncapturedErrorCallback, arena);
        }
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private WGPUFunctionTypes() {}
}
