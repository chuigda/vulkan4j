package club.doki7.webgpu;

import java.lang.foreign.*;
import club.doki7.ffm.NativeLayout;
import club.doki7.webgpu.datatype.*;

public final class WGPUFunctionTypes {
    public static final FunctionDescriptor PFN_wgpuBufferMap = FunctionDescriptor.ofVoid(
        ValueLayout.JAVA_INT,
        WGPUStringView.LAYOUT
    );

    public static final FunctionDescriptor PFN_wgpuCompilationInfo = FunctionDescriptor.ofVoid(
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(WGPUCompilationInfo.LAYOUT)
    );

    public static final FunctionDescriptor PFN_wgpuCreateComputePipelineAsync = FunctionDescriptor.ofVoid(
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS,
        WGPUStringView.LAYOUT
    );

    public static final FunctionDescriptor PFN_wgpuCreateRenderPipelineAsync = FunctionDescriptor.ofVoid(
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS,
        WGPUStringView.LAYOUT
    );

    public static final FunctionDescriptor PFN_wgpuDeviceLost = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS),
        ValueLayout.JAVA_INT,
        WGPUStringView.LAYOUT
    );

    public static final FunctionDescriptor PFN_wgpuPopErrorScope = FunctionDescriptor.ofVoid(
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        WGPUStringView.LAYOUT
    );

    public static final FunctionDescriptor PFN_wgpuQueueWorkDone = FunctionDescriptor.ofVoid(
        ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor PFN_wgpuRequestAdapter = FunctionDescriptor.ofVoid(
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS,
        WGPUStringView.LAYOUT
    );

    public static final FunctionDescriptor PFN_wgpuRequestDevice = FunctionDescriptor.ofVoid(
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS,
        WGPUStringView.LAYOUT
    );

    public static final FunctionDescriptor PFN_wgpuUncapturedError = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS),
        ValueLayout.JAVA_INT,
        WGPUStringView.LAYOUT
    );

    /// Constructing this class is nonsense so the constructor is made private.
    private WGPUFunctionTypes() {}
}
