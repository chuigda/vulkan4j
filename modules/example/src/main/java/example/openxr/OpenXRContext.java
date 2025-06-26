package example.openxr;

import club.doki7.openxr.command.XR;
import club.doki7.openxr.command.XRStatic;
import club.doki7.openxr.handle.XrInstance;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface OpenXRContext {
    @NotNull XR xr();

    @NotNull XRStatic xrStatic();

    @NotNull XrInstance instance();
}
