package example.webgpu;

import club.doki7.ffm.annotation.EnumType;
import club.doki7.ffm.annotation.Unsigned;
import club.doki7.ffm.library.ILibraryLoader;
import club.doki7.ffm.library.ISharedLibrary;
import club.doki7.ffm.ptr.IntPtr;
import club.doki7.webgpu.WGPU;
import club.doki7.webgpu.WGPUSync;
import club.doki7.webgpu.WGPUUtil;
import club.doki7.webgpu.datatype.*;
import club.doki7.webgpu.enumtype.*;
import club.doki7.webgpu.handle.WGPUAdapter;

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
