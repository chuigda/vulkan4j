package example.webgpu;

import club.doki7.ffm.annotation.EnumType;
import club.doki7.ffm.library.ILibraryLoader;
import club.doki7.ffm.library.ISharedLibrary;
import club.doki7.webgpu.WGPU;
import club.doki7.webgpu.WGPUSync;
import club.doki7.webgpu.WGPUUtil;
import club.doki7.webgpu.datatype.*;
import club.doki7.webgpu.enumtype.*;
import club.doki7.webgpu.handle.WGPUAdapter;
import club.doki7.webgpu.handle.WGPUCommandBuffer;
import club.doki7.webgpu.handle.WGPUQueue;

import java.lang.foreign.Arena;
import java.util.ArrayList;
import java.util.Objects;

class Application {
    private final WGPU wgpu;

    Application(WGPU wgpu) {
        this.wgpu = wgpu;
    }

    void applicationStart() {
        try (Arena arena = Arena.ofConfined()) {
            var instanceDescriptor = WGPUInstanceDescriptor.allocate(arena);
            var instance = Objects.requireNonNull(wgpu.createInstance(instanceDescriptor));

            // region adapter initialization
            var requestAdapterOptions = WGPURequestAdapterOptions.allocate(arena);
            var requestAdapterResult = WGPUSync.instanceRequestAdapter(
                    wgpu,
                    instance,
                    requestAdapterOptions
            );
            if (requestAdapterResult.status != WGPURequestAdapterStatus.SUCCESS) {
                throw new RuntimeException(
                        "Requesting adapter failed: "
                        + WGPURequestAdapterStatus.explain(requestAdapterResult.status)
                );
            }
            WGPUAdapter adapter = Objects.requireNonNull(requestAdapterResult.adapter);

            WGPULimits limits = WGPULimits.allocate(arena);
            @EnumType(WGPUStatus.class) int status = wgpu.adapterGetLimits(adapter, limits);
            if (status != WGPUStatus.SUCCESS) {
                throw new RuntimeException("Failed to get adapter limits: " + WGPUStatus.explain(status));
            }
            System.out.println("Adapter limits: ");
            System.out.println("  Max Texture Dimension 1D: " + limits.maxTextureDimension1d());
            System.out.println("  Max Texture Dimension 2D: " + limits.maxTextureDimension2d());
            System.out.println("  Max Texture Dimension 3D: " + limits.maxTextureDimension3d());
            System.out.println("  Max Texture Array Layers: " + limits.maxTextureArrayLayers());

            var supportedFeatures = WGPUSupportedFeatures.allocate(arena);
            wgpu.adapterGetFeatures(adapter, supportedFeatures);
            var featureNames = supportedFeatures.features();
            if (featureNames != null) {
                var featureCount = supportedFeatures.featureCount();
                featureNames = featureNames.reinterpret(featureCount);
                var supportedFeatureNames = new ArrayList<String>();
                for (var i = 0; i < featureCount; i++) {
                    @EnumType(WGPUFeatureName.class) int feature = featureNames.read(i);
                    supportedFeatureNames.add(WGPUFeatureName.explain(feature));
                }

                System.out.println("Supported features: " + String.join(", ", supportedFeatureNames));
            }

            var adapterInfo = WGPUAdapterInfo.allocate(arena);
            status = wgpu.adapterGetInfo(adapter, adapterInfo);
            if (status != WGPUStatus.SUCCESS) {
                throw new RuntimeException("Failed to get adapter info: " + WGPUStatus.explain(status));
            }

            System.out.println("Adapter Info:");
            System.out.println("  Vendor: " + WGPUUtil.readStringView(adapterInfo.vendor()));
            System.out.println("  Architecture: " + WGPUUtil.readStringView(adapterInfo.architecture()));
            System.out.println("  Device: " + WGPUUtil.readStringView(adapterInfo.device()));
            System.out.println("  Description: " + WGPUUtil.readStringView(adapterInfo.description()));
            System.out.println("  Backend Type: " + WGPUBackendType.explain(adapterInfo.backendType()));
            System.out.println("  Adapter Type: " + WGPUAdapterType.explain(adapterInfo.adapterType()));
            System.out.println("  Vendor ID: 0x" + Integer.toUnsignedString(adapterInfo.vendorId(), 16));
            System.out.println("  Device ID: 0x" + Integer.toUnsignedString(adapterInfo.deviceId(), 16));
            // endregion

            // region device initialization
            WGPUDeviceDescriptor deviceDescriptor = WGPUDeviceDescriptor.allocate(arena)
                    .label(WGPUUtil.createStringView(arena, "Example Device"))
                    .defaultQueue(it -> it.label(WGPUUtil.createStringView(arena, "Default Queue")))
                    .deviceLostCallbackInfo(it -> it.callback(
                            WGPUUtil.makeDeviceLostCallback((device, errorType, message) -> {
                                System.err.println("Device " + device + "lost: " + WGPUDeviceLostReason.explain(errorType));
                                if (message != null) {
                                    System.err.println("  Message: " + message);
                                }
                            }, arena)
                    ))
                    .uncapturedErrorCallbackInfo(it -> it.callback(
                            WGPUUtil.makeUncapturedErrorCallback((device, errorType, message) -> {
                                System.err.println("Uncaptured error on device " + device + ": " + WGPUErrorType.explain(errorType));
                                if (message != null) {
                                    System.err.println("  Message: " + message);
                                }
                            }, arena)
                    ));
            var requestDeviceResult = WGPUSync.adapterRequestDevice(
                    wgpu,
                    adapter,
                    deviceDescriptor
            );
            if (requestDeviceResult.status != WGPURequestDeviceStatus.SUCCESS) {
                throw new RuntimeException(
                        "Requesting device failed: "
                        + WGPURequestDeviceStatus.explain(requestDeviceResult.status)
                        + (requestDeviceResult.message != null ? " - " + requestDeviceResult.message : "")
                );
            }
            var device = Objects.requireNonNull(requestDeviceResult.device);
            wgpu.adapterRelease(adapter);

            status = wgpu.deviceGetLimits(device, limits);
            if (status != WGPUStatus.SUCCESS) {
                throw new RuntimeException("Failed to get device limits: " + WGPUStatus.explain(status));
            }
            System.out.println("Device limits: ");
            System.out.println("  Max Texture Dimension 1D: " + limits.maxTextureDimension1d());
            System.out.println("  Max Texture Dimension 2D: " + limits.maxTextureDimension2d());
            System.out.println("  Max Texture Dimension 3D: " + limits.maxTextureDimension3d());
            System.out.println("  Max Texture Array Layers: " + limits.maxTextureArrayLayers());
            // endregion

            // region queue initialization
            WGPUQueue queue = Objects.requireNonNull(wgpu.deviceGetQueue(device));
            wgpu.queueOnSubmittedWorkDone(arena, queue, WGPUQueueWorkDoneCallbackInfo.allocate(arena)
                    .callback(WGPUUtil.makeQueueWorkDoneCallback(
                            workDoneStatus -> System.err.println(
                                    "Queue work finished with: "
                                    + WGPUQueueWorkDoneStatus.explain(workDoneStatus)
                            ),
                            arena
                    )));
            // endregion

            // region command buffer encoding
            var encoderDesc = WGPUCommandEncoderDescriptor.allocate(arena)
                    .label(WGPUUtil.createStringView(arena, "Example Command Buffer Encoder"));
            var encoder = Objects.requireNonNull(wgpu.deviceCreateCommandEncoder(device, encoderDesc));

            wgpu.commandEncoderInsertDebugMarker(encoder, WGPUUtil.createStringView(arena, "Do one thing"));
            wgpu.commandEncoderInsertDebugMarker(encoder, WGPUUtil.createStringView(arena, "Do another thing"));

            var commandBufferDescriptor = WGPUCommandBufferDescriptor.allocate(arena)
                    .label(WGPUUtil.createStringView(arena, "Example Command Buffer"));
            var commandBuffer = Objects.requireNonNull(wgpu.commandEncoderFinish(encoder, commandBufferDescriptor));
            wgpu.commandEncoderRelease(encoder);
            // endregion

            // region command buffer submission and device polling
            wgpu.queueSubmit(queue, 1, WGPUCommandBuffer.Ptr.allocateV(arena, commandBuffer));
            wgpu.commandBufferRelease(commandBuffer);

            wgpu.devicePoll(device, 0, null);
            // endregion

            wgpu.queueRelease(queue);
            wgpu.deviceRelease(device);
            wgpu.instanceRelease(instance);
        }
    }
}

public final class LearnWebGPU {
    public static void main(String[] args) {
        try (ISharedLibrary libWGPUNative = ILibraryLoader.platformLoader().loadLibrary("wgpu_native")) {
            WGPU wgpu = new WGPU(libWGPUNative);
            new Application(wgpu).applicationStart();
        }
    }
}
