package cc.design7.vulkan;

import java.lang.foreign.*;
import cc.design7.ffm.NativeLayout;
import cc.design7.vulkan.datatype.*;

public final class VkFunctionTypes {
    public static final FunctionDescriptor PFN_vkAllocationFunction = FunctionDescriptor.of(
        ValueLayout.ADDRESS,
        ValueLayout.ADDRESS,
        NativeLayout.C_SIZE_T,
        NativeLayout.C_SIZE_T,
        ValueLayout.JAVA_INT
    );
    public static final FunctionDescriptor PFN_vkDebugReportCallbackEXT = FunctionDescriptor.of(
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_LONG,
        NativeLayout.C_SIZE_T,
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE),
        ValueLayout.ADDRESS
    );
    public static final FunctionDescriptor PFN_vkDebugUtilsMessengerCallbackEXT = FunctionDescriptor.of(
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(VkDebugUtilsMessengerCallbackDataEXT.LAYOUT),
        ValueLayout.ADDRESS
    );
    public static final FunctionDescriptor PFN_vkDeviceMemoryReportCallbackEXT = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS.withTargetLayout(VkDeviceMemoryReportCallbackDataEXT.LAYOUT),
        ValueLayout.ADDRESS
    );
    public static final FunctionDescriptor PFN_vkFreeFunction = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS,
        ValueLayout.ADDRESS
    );
    public static final FunctionDescriptor PFN_vkGetInstanceProcAddrLUNARG = FunctionDescriptor.of(
        ValueLayout.ADDRESS,
        ValueLayout.ADDRESS,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE)
    );
    public static final FunctionDescriptor PFN_vkInternalAllocationNotification = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS,
        NativeLayout.C_SIZE_T,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT
    );
    public static final FunctionDescriptor PFN_vkInternalFreeNotification = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS,
        NativeLayout.C_SIZE_T,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT
    );
    public static final FunctionDescriptor PFN_vkReallocationFunction = FunctionDescriptor.of(
        ValueLayout.ADDRESS,
        ValueLayout.ADDRESS,
        ValueLayout.ADDRESS,
        NativeLayout.C_SIZE_T,
        NativeLayout.C_SIZE_T,
        ValueLayout.JAVA_INT
    );
    public static final FunctionDescriptor PFN_vkVoidFunction = FunctionDescriptor.ofVoid();
}
