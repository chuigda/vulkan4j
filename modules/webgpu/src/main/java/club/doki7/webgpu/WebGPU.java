package club.doki7.webgpu;

import java.lang.foreign.*;
import java.lang.invoke.MethodHandle;
import java.util.Objects;

import org.jetbrains.annotations.Nullable;
import club.doki7.ffm.NativeLayout;
import club.doki7.ffm.RawFunctionLoader;
import club.doki7.ffm.annotation.*;
import club.doki7.ffm.ptr.*;
import club.doki7.webgpu.bitmask.*;
import club.doki7.webgpu.enumtype.*;
import club.doki7.webgpu.handle.*;

public final class WebGPU implements WebGPUConstants {
    public WebGPU(RawFunctionLoader loader) {
    }

    // region command wrappers

    // endregion

    // region segments and handles
    // endregion

    public static final class Descriptors {
        /// Constructing this class is nonsense so the constructor is made private.
        private Descriptors() {}
    }
}
