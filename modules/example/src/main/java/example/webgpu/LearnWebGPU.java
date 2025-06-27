package example.webgpu;

import club.doki7.ffm.library.ILibraryLoader;
import club.doki7.ffm.library.ISharedLibrary;
import club.doki7.webgpu.WGPU;
import club.doki7.webgpu.datatype.WGPUInstanceDescriptor;

import java.lang.foreign.Arena;

class Application {
    public static void applicationStart(WGPU wgpu) {
        try (Arena arena = Arena.ofConfined()) {
            var wgpuInstanceDescriptor = WGPUInstanceDescriptor.allocate(arena)
                    .features(it -> it.timedWaitAnyEnable(false));
            var instance = wgpu.createInstance(wgpuInstanceDescriptor);

            System.out.println("WebGPU Instance created: " + instance);
        }
    }
}

public final class LearnWebGPU {
    public static void main(String[] args) {
        try (ISharedLibrary libWGPUNative = ILibraryLoader.platformLoader().loadLibrary("wgpu_native")) {
            WGPU wgpu = new WGPU(libWGPUNative);
            Application.applicationStart(wgpu);
        }
    }
}
