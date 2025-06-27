package club.doki7.webgpu;

import club.doki7.ffm.NativeLayout;
import club.doki7.ffm.annotation.*;
import club.doki7.webgpu.datatype.WGPUStringView;
import club.doki7.webgpu.enumtype.WGPUDeviceLostReason;
import club.doki7.webgpu.enumtype.WGPUErrorType;
import club.doki7.webgpu.handle.WGPUDevice;
import org.jetbrains.annotations.Nullable;

import java.lang.foreign.Arena;
import java.lang.foreign.Linker;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public final class WGPUUtil {
    public static @Nullable String readStringView(@Nullable WGPUStringView stringView) {
        if (stringView == null) {
            return null;
        }

        MemorySegment rawData = stringView.dataRaw();
        if (rawData.equals(MemorySegment.NULL)) {
            return null;
        }

        long length = stringView.length();
        if (length == NativeLayout.UINT64_MAX) {
            return rawData.reinterpret(Long.MAX_VALUE).getString(0);
        } else {
            byte[] bytes = rawData.reinterpret(length).toArray(ValueLayout.JAVA_BYTE);
            return new String(bytes);
        }
    }

    public static @Nullable String readStringView(MemorySegment stringViewSegment) {
        if (stringViewSegment == MemorySegment.NULL) {
            return null;
        }

        MemorySegment rawData = stringViewSegment.get(ValueLayout.ADDRESS, WGPUStringView.OFFSET$data);
        if (rawData.equals(MemorySegment.NULL)) {
            return null;
        }

        long length = stringViewSegment.get(ValueLayout.JAVA_LONG, WGPUStringView.OFFSET$length);
        if (length == NativeLayout.UINT64_MAX) {
            return rawData.reinterpret(Long.MAX_VALUE).getString(0);
        } else {
            byte[] bytes = rawData.reinterpret(length).toArray(ValueLayout.JAVA_BYTE);
            return new String(bytes);
        }
    }

    public static WGPUStringView createStringView(Arena arena, @Nullable String s) {
        WGPUStringView stringView = WGPUStringView.allocate(arena);
        if (s == null) {
            return stringView;
        }

        MemorySegment data = arena.allocateFrom(s);
        stringView.dataRaw(data);
        stringView.length(data.byteSize() - 1);
        return stringView;
    }

    @FunctionalInterface
    public interface DeviceLostCallback {
        void accept(
                @Nullable WGPUDevice device,
                @EnumType(WGPUDeviceLostReason.class) int reason,
                String message
        );
    }

    public static MemorySegment makeDeviceLostCallback(DeviceLostCallback callback, Arena arena) {
        return Linker.nativeLinker().upcallStub(
                MH_onDeviceLost.bindTo(callback),
                WGPUFunctionTypes.WGPUDeviceLostCallback,
                arena
        );
    }

    @FunctionalInterface
    public interface UncapturedErrorCallback {
        void accept(
                @Nullable WGPUDevice device,
                @EnumType(WGPUErrorType.class) int errorType,
                String message
        );
    }

    public static MemorySegment makeUncapturedErrorCallback(UncapturedErrorCallback callback, Arena arena) {
        return Linker.nativeLinker().upcallStub(
                MH_onUncapturedError.bindTo(callback),
                WGPUFunctionTypes.WGPUUncapturedErrorCallback,
                arena
        );
    }

    private static void onDeviceLost(
            DeviceLostCallback callback,
            @NativeType("WGPUDevice") MemorySegment deviceSegment,
            @EnumType(WGPUDeviceLostReason.class) int errorType,
            @NativeType("WGPUStringView") MemorySegment message,
            @Pointer(comment="void*") MemorySegment ignoredUserData1,
            @Pointer(comment="void*") MemorySegment ignoredUserData2
    ) {
        @Nullable WGPUDevice device = deviceSegment.equals(MemorySegment.NULL)
                ? null
                : new WGPUDevice(deviceSegment);
        String messageString = WGPUUtil.readStringView(message);
        callback.accept(device, errorType, messageString);
    }

    private static void onUncapturedError(
            UncapturedErrorCallback callback,
            @NativeType("WGPUDevice") MemorySegment deviceSegment,
            @EnumType(WGPUErrorType.class) int errorType,
            @NativeType("WGPUStringView") MemorySegment message,
            @Pointer(comment="void*") MemorySegment ignoredUserData1,
            @Pointer(comment="void*") MemorySegment ignoredUserData2
    ) {
        @Nullable WGPUDevice device = deviceSegment.equals(MemorySegment.NULL)
                ? null
                : new WGPUDevice(deviceSegment);
        String messageString = WGPUUtil.readStringView(message);
        callback.accept(device, errorType, messageString);
    }

    private static final MethodHandle MH_onDeviceLost;
    private static final MethodHandle MH_onUncapturedError;

    static {
        try {
            MethodHandles.Lookup lookup = MethodHandles.lookup();
            MH_onDeviceLost = lookup.findStatic(
                    WGPUUtil.class,
                    "onDeviceLost",
                    WGPUFunctionTypes.WGPUDeviceLostCallback
                            .toMethodType()
                            .insertParameterTypes(0, DeviceLostCallback.class)
            );
            MH_onUncapturedError = lookup.findStatic(
                    WGPUUtil.class,
                    "onUncapturedError",
                    WGPUFunctionTypes.WGPUUncapturedErrorCallback
                            .toMethodType()
                            .insertParameterTypes(0, UncapturedErrorCallback.class)
            );
        } catch (NoSuchMethodException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}
