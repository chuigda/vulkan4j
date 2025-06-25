package example.openxr;

import club.doki7.ffm.annotation.EnumType;
import club.doki7.ffm.library.ISharedLibrary;
import club.doki7.ffm.ptr.BytePtr;
import club.doki7.openxr.XRLoader;
import club.doki7.openxr.XRVersion;
import club.doki7.openxr.command.XR;
import club.doki7.openxr.command.XRStatic;
import club.doki7.openxr.datatype.XrInstanceCreateInfo;
import club.doki7.openxr.enumtype.XrResult;
import club.doki7.openxr.handle.XrInstance;

import java.lang.foreign.Arena;
import java.util.Objects;

public final class OpenXR {
    public static void main(String[] args) {
        try (ISharedLibrary libOpenXR = XRLoader.loadXRLibrary();
             Arena arena = Arena.ofConfined()) {
            XRStatic xrStatic = new XRStatic(libOpenXR);

            XrInstanceCreateInfo createInfo = XrInstanceCreateInfo.allocate(arena)
                    .applicationInfo(it -> it
                            .applicationName(BytePtr.allocateString(arena, "OpenXR Tutorial"))
                            .applicationVersion(1)
                            .engineName(BytePtr.allocateString(arena, "Soloviev D30F6"))
                            .engineVersion(1)
                            .apiVersion(XRVersion.XR_API_VERSION_1_1.encode()));
            XrInstance.Ptr pInstance = XrInstance.Ptr.allocate(arena);
            @EnumType(XrResult.class) int result =
                    xrStatic.createInstance(createInfo, pInstance);
            if (result != XrResult.SUCCESS) {
                throw new RuntimeException("Failed to create OpenXR instance: " + XrResult.explain(result));
            }
            XrInstance instance = Objects.requireNonNull(pInstance.read());

            XR xr = XRLoader.loadXR(instance, xrStatic);
            System.err.println("OpenXR instance created successfully: " + instance);
        }
    }
}
