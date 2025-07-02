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
    public interface IWGPUBufferMapCallback {
        void invoke(
            @EnumType(WGPUMapAsyncStatus.class) int p0,
            @NativeType("WGPUStringView") MemorySegment p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2,
            @Pointer(comment="void*") @NotNull MemorySegment p3
        );

        static MethodHandle of(@NotNull IWGPUBufferMapCallback lambda) {
            try {
                return MethodHandles.lookup().findVirtual(IWGPUBufferMapCallback.class, "invoke", WGPUBufferMapCallback.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull IWGPUBufferMapCallback lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull IWGPUBufferMapCallback lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), WGPUBufferMapCallback, arena);
        }
    }

    @FunctionalInterface
    public interface IWGPUCompilationInfoCallback {
        void invoke(
            @EnumType(WGPUCompilationInfoRequestStatus.class) int p0,
            @Pointer(comment="void*") @NotNull MemorySegment p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2,
            @Pointer(comment="void*") @NotNull MemorySegment p3
        );

        static MethodHandle of(@NotNull IWGPUCompilationInfoCallback lambda) {
            try {
                return MethodHandles.lookup().findVirtual(IWGPUCompilationInfoCallback.class, "invoke", WGPUCompilationInfoCallback.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull IWGPUCompilationInfoCallback lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull IWGPUCompilationInfoCallback lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), WGPUCompilationInfoCallback, arena);
        }
    }

    @FunctionalInterface
    public interface IWGPUCreateComputePipelineAsyncCallback {
        void invoke(
            @EnumType(WGPUCreatePipelineAsyncStatus.class) int p0,
            @NativeType("WGPUComputePipeline") MemorySegment p1,
            @NativeType("WGPUStringView") MemorySegment p2,
            @Pointer(comment="void*") @NotNull MemorySegment p3,
            @Pointer(comment="void*") @NotNull MemorySegment p4
        );

        static MethodHandle of(@NotNull IWGPUCreateComputePipelineAsyncCallback lambda) {
            try {
                return MethodHandles.lookup().findVirtual(IWGPUCreateComputePipelineAsyncCallback.class, "invoke", WGPUCreateComputePipelineAsyncCallback.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull IWGPUCreateComputePipelineAsyncCallback lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull IWGPUCreateComputePipelineAsyncCallback lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), WGPUCreateComputePipelineAsyncCallback, arena);
        }
    }

    @FunctionalInterface
    public interface IWGPUCreateRenderPipelineAsyncCallback {
        void invoke(
            @EnumType(WGPUCreatePipelineAsyncStatus.class) int p0,
            @NativeType("WGPURenderPipeline") MemorySegment p1,
            @NativeType("WGPUStringView") MemorySegment p2,
            @Pointer(comment="void*") @NotNull MemorySegment p3,
            @Pointer(comment="void*") @NotNull MemorySegment p4
        );

        static MethodHandle of(@NotNull IWGPUCreateRenderPipelineAsyncCallback lambda) {
            try {
                return MethodHandles.lookup().findVirtual(IWGPUCreateRenderPipelineAsyncCallback.class, "invoke", WGPUCreateRenderPipelineAsyncCallback.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull IWGPUCreateRenderPipelineAsyncCallback lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull IWGPUCreateRenderPipelineAsyncCallback lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), WGPUCreateRenderPipelineAsyncCallback, arena);
        }
    }

    @FunctionalInterface
    public interface IWGPUDeviceLostCallback {
        void invoke(
            @Pointer(comment="void*") @NotNull MemorySegment p0,
            @EnumType(WGPUDeviceLostReason.class) int p1,
            @NativeType("WGPUStringView") MemorySegment p2,
            @Pointer(comment="void*") @NotNull MemorySegment p3,
            @Pointer(comment="void*") @NotNull MemorySegment p4
        );

        static MethodHandle of(@NotNull IWGPUDeviceLostCallback lambda) {
            try {
                return MethodHandles.lookup().findVirtual(IWGPUDeviceLostCallback.class, "invoke", WGPUDeviceLostCallback.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull IWGPUDeviceLostCallback lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull IWGPUDeviceLostCallback lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), WGPUDeviceLostCallback, arena);
        }
    }

    @FunctionalInterface
    public interface IWGPULogCallback {
        void invoke(
            @EnumType(WGPULogLevel.class) int p0,
            @NativeType("WGPUStringView") MemorySegment p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2
        );

        static MethodHandle of(@NotNull IWGPULogCallback lambda) {
            try {
                return MethodHandles.lookup().findVirtual(IWGPULogCallback.class, "invoke", WGPULogCallback.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull IWGPULogCallback lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull IWGPULogCallback lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), WGPULogCallback, arena);
        }
    }

    @FunctionalInterface
    public interface IWGPUPopErrorScopeCallback {
        void invoke(
            @EnumType(WGPUPopErrorScopeStatus.class) int p0,
            @EnumType(WGPUErrorType.class) int p1,
            @NativeType("WGPUStringView") MemorySegment p2,
            @Pointer(comment="void*") @NotNull MemorySegment p3,
            @Pointer(comment="void*") @NotNull MemorySegment p4
        );

        static MethodHandle of(@NotNull IWGPUPopErrorScopeCallback lambda) {
            try {
                return MethodHandles.lookup().findVirtual(IWGPUPopErrorScopeCallback.class, "invoke", WGPUPopErrorScopeCallback.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull IWGPUPopErrorScopeCallback lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull IWGPUPopErrorScopeCallback lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), WGPUPopErrorScopeCallback, arena);
        }
    }

    @FunctionalInterface
    public interface IWGPUQueueWorkDoneCallback {
        void invoke(
            @EnumType(WGPUQueueWorkDoneStatus.class) int p0,
            @Pointer(comment="void*") @NotNull MemorySegment p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2
        );

        static MethodHandle of(@NotNull IWGPUQueueWorkDoneCallback lambda) {
            try {
                return MethodHandles.lookup().findVirtual(IWGPUQueueWorkDoneCallback.class, "invoke", WGPUQueueWorkDoneCallback.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull IWGPUQueueWorkDoneCallback lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull IWGPUQueueWorkDoneCallback lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), WGPUQueueWorkDoneCallback, arena);
        }
    }

    @FunctionalInterface
    public interface IWGPURequestAdapterCallback {
        void invoke(
            @EnumType(WGPURequestAdapterStatus.class) int p0,
            @NativeType("WGPUAdapter") MemorySegment p1,
            @NativeType("WGPUStringView") MemorySegment p2,
            @Pointer(comment="void*") @NotNull MemorySegment p3,
            @Pointer(comment="void*") @NotNull MemorySegment p4
        );

        static MethodHandle of(@NotNull IWGPURequestAdapterCallback lambda) {
            try {
                return MethodHandles.lookup().findVirtual(IWGPURequestAdapterCallback.class, "invoke", WGPURequestAdapterCallback.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull IWGPURequestAdapterCallback lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull IWGPURequestAdapterCallback lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), WGPURequestAdapterCallback, arena);
        }
    }

    @FunctionalInterface
    public interface IWGPURequestDeviceCallback {
        void invoke(
            @EnumType(WGPURequestDeviceStatus.class) int p0,
            @NativeType("WGPUDevice") MemorySegment p1,
            @NativeType("WGPUStringView") MemorySegment p2,
            @Pointer(comment="void*") @NotNull MemorySegment p3,
            @Pointer(comment="void*") @NotNull MemorySegment p4
        );

        static MethodHandle of(@NotNull IWGPURequestDeviceCallback lambda) {
            try {
                return MethodHandles.lookup().findVirtual(IWGPURequestDeviceCallback.class, "invoke", WGPURequestDeviceCallback.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull IWGPURequestDeviceCallback lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull IWGPURequestDeviceCallback lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), WGPURequestDeviceCallback, arena);
        }
    }

    @FunctionalInterface
    public interface IWGPUUncapturedErrorCallback {
        void invoke(
            @Pointer(comment="void*") @NotNull MemorySegment p0,
            @EnumType(WGPUErrorType.class) int p1,
            @NativeType("WGPUStringView") MemorySegment p2,
            @Pointer(comment="void*") @NotNull MemorySegment p3,
            @Pointer(comment="void*") @NotNull MemorySegment p4
        );

        static MethodHandle of(@NotNull IWGPUUncapturedErrorCallback lambda) {
            try {
                return MethodHandles.lookup().findVirtual(IWGPUUncapturedErrorCallback.class, "invoke", WGPUUncapturedErrorCallback.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull IWGPUUncapturedErrorCallback lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull IWGPUUncapturedErrorCallback lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), WGPUUncapturedErrorCallback, arena);
        }
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private WGPUFunctionTypes() {}
}
