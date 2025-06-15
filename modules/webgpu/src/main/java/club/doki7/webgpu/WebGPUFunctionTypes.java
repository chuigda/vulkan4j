package club.doki7.webgpu;

import java.lang.foreign.*;
import club.doki7.ffm.NativeLayout;
import club.doki7.webgpu.datatype.*;

public final class WebGPUFunctionTypes {
    public static final FunctionDescriptor CreateInstance = FunctionDescriptor.of(
        ValueLayout.ADDRESS,
        ValueLayout.ADDRESS.withTargetLayout(InstanceDescriptor.LAYOUT)
    );

    public static final FunctionDescriptor GetInstanceFeatures = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS.withTargetLayout(SupportedInstanceFeatures.LAYOUT)
    );

    public static final FunctionDescriptor GetInstanceLimits = FunctionDescriptor.of(
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(InstanceLimits.LAYOUT)
    );

    public static final FunctionDescriptor HasInstanceFeature = FunctionDescriptor.of(
        ValueLayout.JAVA_BOOLEAN,
        ValueLayout.JAVA_INT
    );

    /// Constructing this class is nonsense so the constructor is made private.
    private WebGPUFunctionTypes() {}
}
