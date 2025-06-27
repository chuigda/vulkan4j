package club.doki7.webgpu;

import java.lang.foreign.*;
import club.doki7.ffm.NativeLayout;
import club.doki7.webgpu.datatype.*;

public final class WGPUFunctionTypes {
    public static final FunctionDescriptor WGPUBufferMapCallback = FunctionDescriptor.ofVoid(
        ValueLayout.JAVA_INT,
        WGPUStringView.LAYOUT,
        ValueLayout.ADDRESS,
        ValueLayout.ADDRESS
    );

    public static final FunctionDescriptor WGPUCompilationInfoCallback = FunctionDescriptor.ofVoid(
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(WGPUCompilationInfo.LAYOUT),
        ValueLayout.ADDRESS,
        ValueLayout.ADDRESS
    );

    public static final FunctionDescriptor WGPUCreateComputePipelineAsyncCallback = FunctionDescriptor.ofVoid(
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS,
        WGPUStringView.LAYOUT,
        ValueLayout.ADDRESS,
        ValueLayout.ADDRESS
    );

    public static final FunctionDescriptor WGPUCreateRenderPipelineAsyncCallback = FunctionDescriptor.ofVoid(
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS,
        WGPUStringView.LAYOUT,
        ValueLayout.ADDRESS,
        ValueLayout.ADDRESS
    );

    public static final FunctionDescriptor WGPUDeviceLostCallback = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS),
        ValueLayout.JAVA_INT,
        WGPUStringView.LAYOUT,
        ValueLayout.ADDRESS,
        ValueLayout.ADDRESS
    );

    public static final FunctionDescriptor WGPULogCallback = FunctionDescriptor.ofVoid(
        ValueLayout.JAVA_INT,
        WGPUStringView.LAYOUT,
        ValueLayout.ADDRESS
    );

    public static final FunctionDescriptor WGPUPopErrorScopeCallback = FunctionDescriptor.ofVoid(
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        WGPUStringView.LAYOUT,
        ValueLayout.ADDRESS,
        ValueLayout.ADDRESS
    );

    public static final FunctionDescriptor WGPUQueueWorkDoneCallback = FunctionDescriptor.ofVoid(
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS,
        ValueLayout.ADDRESS
    );

    public static final FunctionDescriptor WGPURequestAdapterCallback = FunctionDescriptor.ofVoid(
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS,
        WGPUStringView.LAYOUT,
        ValueLayout.ADDRESS,
        ValueLayout.ADDRESS
    );

    public static final FunctionDescriptor WGPURequestDeviceCallback = FunctionDescriptor.ofVoid(
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS,
        WGPUStringView.LAYOUT,
        ValueLayout.ADDRESS,
        ValueLayout.ADDRESS
    );

    public static final FunctionDescriptor WGPUUncapturedErrorCallback = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS),
        ValueLayout.JAVA_INT,
        WGPUStringView.LAYOUT,
        ValueLayout.ADDRESS,
        ValueLayout.ADDRESS
    );

    /// Constructing this class is nonsense so the constructor is made private.
    private WGPUFunctionTypes() {}
}
