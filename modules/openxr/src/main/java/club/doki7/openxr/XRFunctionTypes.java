package club.doki7.openxr;

import java.lang.foreign.*;
import club.doki7.ffm.NativeLayout;
import club.doki7.openxr.datatype.*;

public final class XRFunctionTypes {
    public static final FunctionDescriptor PFN_xrCreateApiLayerInstance = FunctionDescriptor.of(
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(XrInstanceCreateInfo.LAYOUT),
        ValueLayout.ADDRESS.withTargetLayout(XrApiLayerCreateInfo.LAYOUT),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
    );

    public static final FunctionDescriptor PFN_xrDebugUtilsMessengerCallbackEXT = FunctionDescriptor.of(
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_LONG,
        ValueLayout.JAVA_LONG,
        ValueLayout.ADDRESS.withTargetLayout(XrDebugUtilsMessengerCallbackDataEXT.LAYOUT),
        ValueLayout.ADDRESS
    );

    public static final FunctionDescriptor PFN_xrEglGetProcAddressMNDX = FunctionDescriptor.of(
        ValueLayout.ADDRESS,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE)
    );

    public static final FunctionDescriptor PFN_xrGetInstanceProcAddr = FunctionDescriptor.of(
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
    );

    public static final FunctionDescriptor PFN_xrVoidFunction = FunctionDescriptor.ofVoid();

    /// Constructing this class is nonsense so the constructor is made private.
    private XRFunctionTypes() {}
}
