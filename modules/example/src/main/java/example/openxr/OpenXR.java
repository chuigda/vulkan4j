package example.openxr;

import club.doki7.ffm.library.ILibraryLoader;
import club.doki7.ffm.library.ISharedLibrary;
import club.doki7.openxr.XR;

public final class OpenXR {
    public static void main(String[] args) {
        ISharedLibrary libOpenXR = ILibraryLoader.platformLoader().loadLibrary("openxr_loader");
        XR xr = new XR(libOpenXR);



        libOpenXR.close();
    }
}
