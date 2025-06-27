package club.doki7.webgpu;

import club.doki7.ffm.annotation.EnumType;
import club.doki7.ffm.annotation.Pointer;
import club.doki7.webgpu.datatype.WGPURequestAdapterCallbackInfo;
import club.doki7.webgpu.datatype.WGPURequestAdapterOptions;
import club.doki7.webgpu.enumtype.WGPURequestAdapterStatus;
import club.doki7.webgpu.handle.WGPUAdapter;
import club.doki7.webgpu.handle.WGPUInstance;
import org.jetbrains.annotations.Nullable;

import java.lang.foreign.Arena;
import java.lang.foreign.Linker;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Objects;

public final class WGPUSync {
    public static final class AdapterRequestResult {
        public final @EnumType(WGPURequestAdapterStatus.class) int status;
        public final @Nullable WGPUAdapter adapter;
        public final @Nullable String message;

        public AdapterRequestResult(
                int status,
                @Nullable WGPUAdapter adapter,
                @Nullable String message
        ) {
            this.status = status;
            this.adapter = adapter;
            this.message = message;
        }
    }

    public static AdapterRequestResult instanceRequestAdapter(
            WGPU wgpu,
            WGPUInstance instance,
            WGPURequestAdapterOptions options
    ) {
        Ref<AdapterRequestResult> saveSlot = new Ref<>();
        try (Arena arena = Arena.ofConfined()) {
            MemorySegment pfn = Linker.nativeLinker().upcallStub(
                    MH_onAdapterRequestEnded.bindTo(saveSlot),
                    WGPUFunctionTypes.WGPURequestAdapterCallback,
                    arena
            );

            WGPURequestAdapterCallbackInfo info = WGPURequestAdapterCallbackInfo.allocate(arena)
                    .callback(pfn);
            wgpu.instanceRequestAdapter(instance, options, info);
            return Objects.requireNonNull(saveSlot.value, ASYNC_NOT_SYNC);
        }
    }

    private static final class Ref<T> { @Nullable T value = null; }

    private static void onAdapterRequestEnded(
            Ref<AdapterRequestResult> saveSlot,
            @EnumType(WGPURequestAdapterStatus.class) int status,
            @Pointer(comment="WGPUAdapter") MemorySegment adapter,
            @Pointer(comment="WGPUStringView") MemorySegment message,
            @Pointer(comment="void*") MemorySegment ignoredUserData1,
            @Pointer(comment="void*") MemorySegment ignoredUserData2
    ) {
        @Nullable WGPUAdapter adapterHandle = adapter == MemorySegment.NULL
                ? null
                : new WGPUAdapter(adapter);
        @Nullable String messageString = WGPUUtil.readStringView(message);
        saveSlot.value = new AdapterRequestResult(status, adapterHandle, messageString);
    }

    private static final MethodHandle MH_onAdapterRequestEnded;
    private static final String ASYNC_NOT_SYNC
            = "On native platform, WebGPU async requests should finish synchronously immediately";

    static {
        try {
            MH_onAdapterRequestEnded = MethodHandles.lookup()
                    .findStatic(
                            WGPUSync.class,
                            "onAdapterRequestEnded",
                            WGPUFunctionTypes.WGPURequestAdapterCallback
                                    .toMethodType()
                                    .insertParameterTypes(0, Ref.class)
                    );
        } catch (NoSuchMethodException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    private WGPUSync() {}
}
