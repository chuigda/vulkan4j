package club.doki7.webgpu;

import java.lang.foreign.*;
import club.doki7.ffm.NativeLayout;
import club.doki7.webgpu.datatype.*;

public final class WGPUFunctionTypes {
    public static final FunctionDescriptor CreateInstance = FunctionDescriptor.of(
        ValueLayout.ADDRESS,
        ValueLayout.ADDRESS.withTargetLayout(WGPUInstanceDescriptor.LAYOUT)
    );

    public static final FunctionDescriptor GetInstanceCapabilities = FunctionDescriptor.of(
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(WGPUInstanceCapabilities.LAYOUT)
    );

    /// Constructing this class is nonsense so the constructor is made private.
    private WGPUFunctionTypes() {}
}
