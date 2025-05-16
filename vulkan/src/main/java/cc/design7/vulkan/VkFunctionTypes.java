package cc.design7.vulkan;

import java.lang.foreign.*;
import cc.design7.ffm.NativeLayout;
import cc.design7.vulkan.datatype.*;

public final class VkFunctionTypes {
    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/PFN_vkAllocationFunction.html"><code>PFN_vkAllocationFunction</code></a>
    public static final FunctionDescriptor PFN_vkAllocationFunction = FunctionDescriptor.of(
        ValueLayout.ADDRESS,
        ValueLayout.ADDRESS,
        NativeLayout.C_SIZE_T,
        NativeLayout.C_SIZE_T,
        ValueLayout.JAVA_INT
    );

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/PFN_vkDebugReportCallbackEXT.html"><code>PFN_vkDebugReportCallbackEXT</code></a>
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

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/PFN_vkDebugUtilsMessengerCallbackEXT.html"><code>PFN_vkDebugUtilsMessengerCallbackEXT</code></a>
    public static final FunctionDescriptor PFN_vkDebugUtilsMessengerCallbackEXT = FunctionDescriptor.of(
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(VkDebugUtilsMessengerCallbackDataEXT.LAYOUT),
        ValueLayout.ADDRESS
    );

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/PFN_vkDeviceMemoryReportCallbackEXT.html"><code>PFN_vkDeviceMemoryReportCallbackEXT</code></a>
    public static final FunctionDescriptor PFN_vkDeviceMemoryReportCallbackEXT = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS.withTargetLayout(VkDeviceMemoryReportCallbackDataEXT.LAYOUT),
        ValueLayout.ADDRESS
    );

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/PFN_vkFreeFunction.html"><code>PFN_vkFreeFunction</code></a>
    public static final FunctionDescriptor PFN_vkFreeFunction = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS,
        ValueLayout.ADDRESS
    );

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/PFN_vkGetInstanceProcAddrLUNARG.html"><code>PFN_vkGetInstanceProcAddrLUNARG</code></a>
    public static final FunctionDescriptor PFN_vkGetInstanceProcAddrLUNARG = FunctionDescriptor.of(
        ValueLayout.ADDRESS,
        ValueLayout.ADDRESS,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE)
    );

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/PFN_vkInternalAllocationNotification.html"><code>PFN_vkInternalAllocationNotification</code></a>
    public static final FunctionDescriptor PFN_vkInternalAllocationNotification = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS,
        NativeLayout.C_SIZE_T,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT
    );

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/PFN_vkInternalFreeNotification.html"><code>PFN_vkInternalFreeNotification</code></a>
    public static final FunctionDescriptor PFN_vkInternalFreeNotification = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS,
        NativeLayout.C_SIZE_T,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT
    );

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/PFN_vkReallocationFunction.html"><code>PFN_vkReallocationFunction</code></a>
    public static final FunctionDescriptor PFN_vkReallocationFunction = FunctionDescriptor.of(
        ValueLayout.ADDRESS,
        ValueLayout.ADDRESS,
        ValueLayout.ADDRESS,
        NativeLayout.C_SIZE_T,
        NativeLayout.C_SIZE_T,
        ValueLayout.JAVA_INT
    );

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/PFN_vkVoidFunction.html"><code>PFN_vkVoidFunction</code></a>
    public static final FunctionDescriptor PFN_vkVoidFunction = FunctionDescriptor.ofVoid();
}
