package club.doki7.openxr;

import club.doki7.ffm.library.ILibraryLoader;
import club.doki7.ffm.library.ISharedLibrary;
import club.doki7.ffm.ptr.BytePtr;
import club.doki7.ffm.ptr.PointerPtr;
import club.doki7.openxr.command.XR;
import club.doki7.openxr.command.XRStatic;
import club.doki7.openxr.handle.XrInstance;
import org.jetbrains.annotations.NotNull;

import java.lang.foreign.Arena;

public final class XRLoader {
    public static ISharedLibrary loadXRLibrary() {
        return ILibraryLoader.platformLoader().loadLibrary("openxr_loader");
    }

    public static @NotNull XRStatic loadStaticCommands(@NotNull ISharedLibrary library) {
        return new XRStatic(library);
    }

    public static @NotNull XR loadXR(@NotNull XrInstance instance, @NotNull XRStatic xrStatic) {
        return new XR(name -> {
            try (Arena arena = Arena.ofConfined()) {
                PointerPtr pFunction = PointerPtr.allocate(arena);
                xrStatic.getInstanceProcAddr(
                        instance,
                        BytePtr.allocateString(arena, name),
                        pFunction
                );
                return pFunction.read();
            }
        });
    }
}
