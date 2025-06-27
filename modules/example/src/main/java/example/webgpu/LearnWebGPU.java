package example.webgpu;

import club.doki7.ffm.library.ILibraryLoader;
import club.doki7.ffm.library.ISharedLibrary;
import club.doki7.webgpu.WGPU;
import club.doki7.webgpu.datatype.WGPUInstanceDescriptor;
import club.doki7.webgpu.datatype.WGPURequestAdapterOptions;

import java.lang.foreign.Arena;
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

//            var requestAdapterOptions = WGPURequestAdapterOptions.allocate(arena);
//            wgpu.instanceRequestAdapter(instance, requestAdapterOptions);

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
