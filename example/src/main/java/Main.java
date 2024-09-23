import tech.icey.glfwmini.LibGLFW;
import tech.icey.vk4j.Constants;
import tech.icey.vk4j.Create;
import tech.icey.vk4j.Loader;
import tech.icey.vk4j.Version;
import tech.icey.vk4j.annotations.nullable;
import tech.icey.vk4j.array.ByteArray;
import tech.icey.vk4j.array.FloatArray;
import tech.icey.vk4j.bitmask.VkQueueFlags;
import tech.icey.vk4j.command.DeviceCommands;
import tech.icey.vk4j.command.EntryCommands;
import tech.icey.vk4j.command.InstanceCommands;
import tech.icey.vk4j.command.StaticCommands;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.VkPhysicalDeviceType;
import tech.icey.vk4j.handle.*;
import tech.icey.vk4j.ptr.IntPtr;
import tech.icey.vk4j.util.Function2;

import javax.swing.*;
import java.lang.foreign.Arena;
import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;
import java.lang.invoke.MethodHandle;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        if (!loadLibraries()) {
            return;
        }

        LibGLFW libGLFW = initGLFW();
        if (libGLFW == null) {
            return;
        }

        var staticCommands = new StaticCommands(Loader::loadFunctionOrNull);
        var entryCommands = new EntryCommands(Loader::loadFunctionOrNull);

        try (Arena arena = Arena.ofConfined()) {
            var pRequiredExtensionCount = IntPtr.allocate(arena);
            var requiredExtensions = libGLFW.glfwGetRequiredInstanceExtensions(pRequiredExtensionCount);

            var applicationInfo = Create.create(VkApplicationInfo.FACTORY, arena);
            applicationInfo.pApplicationName(ByteArray.allocateUtf8(arena, "VkCube4j"));
            applicationInfo.applicationVersion(Version.vkMakeAPIVersion(0, 1, 0, 0));
            applicationInfo.pEngineName(ByteArray.allocateUtf8(arena, "vulkan4j example engine"));
            applicationInfo.engineVersion(Version.vkMakeAPIVersion(0, 1, 0, 0));
            applicationInfo.apiVersion(Version.VK_API_VERSION_1_3);

            var instanceCreateInfo = Create.create(VkInstanceCreateInfo.FACTORY, arena);
            instanceCreateInfo.pApplicationInfo(applicationInfo);
            instanceCreateInfo.enabledExtensionCount(pRequiredExtensionCount.read());
            instanceCreateInfo.ppEnabledExtensionNames(requiredExtensions);

            var pInstance = Create.create(VkInstance.FACTORY, arena);
            var result = entryCommands.vkCreateInstance(instanceCreateInfo, null, pInstance);
            if (result != 0) {
                showErrorMessage("创建 Vulkan 实例失败，Vulkan 错误代码：" + result);
                return;
            }

            Function2<String, FunctionDescriptor, MethodHandle> instanceLoader =
                    (String name, FunctionDescriptor descriptor) -> {
                        try (Arena arena1 = Arena.ofConfined()) {
                            var nameSegment = ByteArray.allocateUtf8(arena1, name);
                            MemorySegment segment = staticCommands.vkGetInstanceProcAddr(pInstance, nameSegment);
                            if (segment.address() == 0) {
                                return null;
                            }

                            return Loader.nativeLinker.downcallHandle(segment, descriptor);
                        }
                    };

            var instanceCommands = new InstanceCommands(instanceLoader);

            vkMain(arena, libGLFW, pInstance, staticCommands, instanceCommands, instanceLoader);
            instanceCommands.vkDestroyInstance(pInstance, null);
        }

        libGLFW.glfwTerminate();
        System.exit(0);
    }

    private static void vkMain(
            Arena arena,
            LibGLFW libGLFW,
            VkInstance instance,
            StaticCommands staticCommands,
            InstanceCommands instanceCommands,
            Function2<String, FunctionDescriptor, MethodHandle> instanceLoader
    ) {
        libGLFW.glfwWindowHint(LibGLFW.GLFW_CLIENT_API, LibGLFW.GLFW_NO_API);
        var window = libGLFW.glfwCreateWindow(640, 480, "VkCube4j", MemorySegment.NULL, MemorySegment.NULL);
        if (window.address() == 0) {
            showErrorMessage("创建 GLFW 窗口失败");
            return;
        }

        var pSurface = Create.create(VkSurfaceKHR.FACTORY, arena);
        var result = libGLFW.glfwCreateWindowSurface(instance, window, null, pSurface);
        if (result != 0) {
            showErrorMessage("创建 Vulkan 表面失败，Vulkan 错误代码：" + result);
            return;
        }

        var pPhysicalDeviceCount = IntPtr.allocate(arena);
        result = instanceCommands.vkEnumeratePhysicalDevices(instance, pPhysicalDeviceCount, null);
        if (result < 0) {
            showErrorMessage("枚举物理设备失败，Vulkan 错误代码：" + result);
            return;
        }

        int physicalDeviceCount = pPhysicalDeviceCount.read();
        var physicalDevices = Create.createArray(VkPhysicalDevice.FACTORY, arena, physicalDeviceCount).first;
        result = instanceCommands.vkEnumeratePhysicalDevices(instance, pPhysicalDeviceCount, physicalDevices[0]);
        if (result < 0) {
            showErrorMessage("枚举物理设备失败，Vulkan 错误代码：" + result);
            return;
        }

        VkPhysicalDevice physicalDevice = pickPhysicalDevice(instanceCommands, physicalDevices);
        if (physicalDevice == null) {
            return;
        }

        VkQueueFamilyProperties[] queueFamilyProperties = getPhysicalDeviceQueueFamilyProperties(arena, instanceCommands, physicalDevice);
        if (queueFamilyProperties.length == 0) {
            showErrorMessage("物理设备 " + physicalDevice + " 没有可用的队列族");
            return;
        }

        VkDeviceQueueCreateInfo[] queueCreateInfos = Create.createArray(VkDeviceQueueCreateInfo.FACTORY, arena, queueFamilyProperties.length).first;
        for (int i = 0; i < queueFamilyProperties.length; i++) {
            VkQueueFamilyProperties queueFamilyProperty = queueFamilyProperties[i];
            var pQueuePriorities = FloatArray.allocate(arena, queueFamilyProperty.queueCount());
            queueCreateInfos[i].queueFamilyIndex(i);
            queueCreateInfos[i].pQueuePriorities(pQueuePriorities);
        }

        var ppEnabledExtensionNames = arena.allocate(ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE));
        var khrSwapChain = arena.allocateFrom("VK_KHR_swapchain");
        ppEnabledExtensionNames.set(ValueLayout.ADDRESS, 0, khrSwapChain);

        var deviceFeatures = Create.create(VkPhysicalDeviceFeatures.FACTORY, arena);
        var deviceCreateInfo = Create.create(VkDeviceCreateInfo.FACTORY, arena);
        deviceCreateInfo.pQueueCreateInfos(queueCreateInfos[0]);
        deviceCreateInfo.pEnabledFeatures(deviceFeatures);
        deviceCreateInfo.ppEnabledExtensionNames(ppEnabledExtensionNames);
        deviceCreateInfo.enabledExtensionCount(0);

        var pDevice = Create.create(VkDevice.FACTORY, arena);
        result = instanceCommands.vkCreateDevice(physicalDevice, deviceCreateInfo, null, pDevice);
        if (result != 0) {
            showErrorMessage("创建 Vulkan 设备失败，Vulkan 错误代码：" + result);
            return;
        }

        var deviceCommands = new DeviceCommands((name, descriptor) -> {
            try (Arena arena1 = Arena.ofConfined()) {
                var nameSegment = ByteArray.allocateUtf8(arena1, name);
                MemorySegment segment = staticCommands.vkGetDeviceProcAddr(pDevice, nameSegment);
                if (segment.address() == 0) {
                    return null;
                }

                return Loader.nativeLinker.downcallHandle(segment, descriptor);
            }
        }, instanceLoader);

        var graphicsQueueFamilyIndex = getGraphicsQueueFamilyIndex(queueFamilyProperties);
        if (graphicsQueueFamilyIndex == -1) {
            showErrorMessage("物理设备 " + physicalDevice + " 没有图形队列族");
            return;
        }

        var graphicsQueue = Create.create(VkQueue.FACTORY, arena);
        deviceCommands.vkGetDeviceQueue(pDevice, graphicsQueueFamilyIndex, 0, graphicsQueue);

        var presentationQueueFamilyIndex = getPresentationQueueFamilyIndex(instanceCommands, physicalDevice, pSurface);
        if (presentationQueueFamilyIndex == -1) {
            showErrorMessage("物理设备 " + physicalDevice + " 没有展示队列族");
            return;
        }

        var presentationQueue = Create.create(VkQueue.FACTORY, arena);
        deviceCommands.vkGetDeviceQueue(pDevice, presentationQueueFamilyIndex, 0, presentationQueue);
    }

    private static @nullable VkPhysicalDevice pickPhysicalDevice(
            InstanceCommands instanceCommands,
            VkPhysicalDevice[] physicalDevices
    ) {
        List<DeviceInfo> deviceInfoList = new ArrayList<>();
        for (VkPhysicalDevice physicalDevice : physicalDevices) {
            try (Arena arena1 = Arena.ofConfined()) {
                VkPhysicalDeviceProperties properties = Create.create(VkPhysicalDeviceProperties.FACTORY, arena1);
                instanceCommands.vkGetPhysicalDeviceProperties(physicalDevice, properties);
                String deviceType = switch (properties.deviceType()) {
                    case VkPhysicalDeviceType.VK_PHYSICAL_DEVICE_TYPE_OTHER -> "其他";
                    case VkPhysicalDeviceType.VK_PHYSICAL_DEVICE_TYPE_INTEGRATED_GPU -> "集成 GPU";
                    case VkPhysicalDeviceType.VK_PHYSICAL_DEVICE_TYPE_DISCRETE_GPU -> "独立 GPU";
                    case VkPhysicalDeviceType.VK_PHYSICAL_DEVICE_TYPE_VIRTUAL_GPU -> "虚拟 GPU";
                    case VkPhysicalDeviceType.VK_PHYSICAL_DEVICE_TYPE_CPU -> "CPU";
                    default -> throw new IllegalStateException("Unexpected value: " + properties.deviceType());
                };

                var deviceId = Integer.toUnsignedString(properties.deviceID());
                var vendorId = Integer.toUnsignedString(properties.vendorID());
                var deviceName = properties.deviceNameRaw().getString(0);
                var driverVersion = Version.decode(properties.driverVersion());

                IntPtr pNumDeviceExtensions = IntPtr.allocate(arena1);
                int result = instanceCommands.vkEnumerateDeviceExtensionProperties(physicalDevice, null, pNumDeviceExtensions, null);
                if (result < 0) {
                    showErrorMessage("枚举设备 " + deviceName + " 的扩展属性失败，Vulkan 错误代码：" + result);
                    return null;
                }
                int numDeviceExtensions = pNumDeviceExtensions.read();
                var extensionProperties = Create.createArray(VkExtensionProperties.FACTORY, arena1, numDeviceExtensions).first;
                result = instanceCommands.vkEnumerateDeviceExtensionProperties(physicalDevice, null, pNumDeviceExtensions, extensionProperties[0]);
                if (result < 0) {
                    showErrorMessage("枚举设备 " + deviceName + " 的扩展属性失败，Vulkan 错误代码：" + result);
                    return null;
                }

                StringBuilder extensionNames = new StringBuilder();
                for (int j = 0; j < numDeviceExtensions; j++) {
                    extensionNames.append(extensionProperties[j].extensionNameRaw().getString(0));
                    if (j != numDeviceExtensions - 1) {
                        extensionNames.append(" ");
                    }
                }

                deviceInfoList.add(new DeviceInfo(
                        deviceName,
                        "设备 ID: " + deviceId + "\n" +
                                "供应商 ID: " + vendorId + "\n" +
                                "设备类型: " + deviceType + "\n" +
                                "驱动版本: " + driverVersion.major() + "." + driverVersion.minor() + "." + driverVersion.patch() + "\n" +
                                "设备扩展: " + extensionNames
                ));
            }
        }

        var deviceInfoDialog = new DeviceInfoDialog(deviceInfoList);
        deviceInfoDialog.setVisible(true);

        if (deviceInfoDialog.selectedDeviceId == null) {
            return null;
        }

        return physicalDevices[deviceInfoDialog.selectedDeviceId];
    }

    private static VkQueueFamilyProperties[] getPhysicalDeviceQueueFamilyProperties(
            Arena arena,
            InstanceCommands instanceCommands,
            VkPhysicalDevice physicalDevice
    ) {
        try (Arena arena1 = Arena.ofConfined()) {
            IntPtr pNumQueueFamilyProperties = IntPtr.allocate(arena1);
            instanceCommands.vkGetPhysicalDeviceQueueFamilyProperties(physicalDevice, pNumQueueFamilyProperties, null);
            int numQueueFamilyProperties = pNumQueueFamilyProperties.read();

            var pQueueFamilyProperties = Create.createArray(VkQueueFamilyProperties.FACTORY, arena, numQueueFamilyProperties).first;
            instanceCommands.vkGetPhysicalDeviceQueueFamilyProperties(physicalDevice, pNumQueueFamilyProperties, pQueueFamilyProperties[0]);

            return pQueueFamilyProperties;
        }
    }

    private static int getGraphicsQueueFamilyIndex(VkQueueFamilyProperties[] queueFamilyProperties) {
        for (int i = 0; i < queueFamilyProperties.length; i++) {
            VkQueueFamilyProperties queueFamilyProperty = queueFamilyProperties[i];
            if ((queueFamilyProperty.queueFlags() & VkQueueFlags.VK_QUEUE_GRAPHICS_BIT) != 0) {
                return i;
            }
        }

        return -1;
    }

    private static int getPresentationQueueFamilyIndex(
            InstanceCommands instanceCommands,
            VkPhysicalDevice physicalDevice,
            VkSurfaceKHR pSurface
    ) {
        try (Arena arena = Arena.ofConfined()) {
            IntPtr pNumQueueFamilyProperties = IntPtr.allocate(arena);
            instanceCommands.vkGetPhysicalDeviceQueueFamilyProperties(physicalDevice, pNumQueueFamilyProperties, null);
            int numQueueFamilyProperties = pNumQueueFamilyProperties.read();

            var pQueueFamilyProperties = Create.createArray(VkQueueFamilyProperties.FACTORY, arena, numQueueFamilyProperties).first;
            instanceCommands.vkGetPhysicalDeviceQueueFamilyProperties(physicalDevice, pNumQueueFamilyProperties, pQueueFamilyProperties[0]);

            for (int i = 0; i < numQueueFamilyProperties; i++) {
                IntPtr pSupportsPresentation = IntPtr.allocate(arena);
                int result = instanceCommands.vkGetPhysicalDeviceSurfaceSupportKHR(physicalDevice, i, pSurface, pSupportsPresentation);
                if (result < 0) {
                    showErrorMessage("检查物理设备 " + physicalDevice + " 的队列族 " + i + " 是否支持展示失败，Vulkan 错误代码：" + result);
                    return -1;
                }

                if (pSupportsPresentation.read() == Constants.VK_TRUE) {
                    return i;
                }
            }

            return -1;
        }
    }

    private static boolean loadLibraries() {
        try {
            if (System.getProperty("os.name").toLowerCase().contains("windows")) {
                System.loadLibrary("glfw3");
            }
            else {
                System.loadLibrary("glfw");
            }
        }
        catch (Throwable throwable) {
            showErrorMessage("加载 GLFW 库失败: " + throwable.getMessage());
            return false;
        }

        try {
            if (System.getProperty("os.name").toLowerCase().contains("windows")) {
                System.loadLibrary("vulkan-1");
            }
            else {
                System.loadLibrary("vulkan");
            }
        }
        catch (Throwable throwable) {
            showErrorMessage("加载 Vulkan 库失败: " + throwable.getMessage());
            return false;
        }

        return true;
    }

    private static LibGLFW initGLFW() {
        try {
            LibGLFW libGLFW = new LibGLFW(Loader::loadFunction);

            if (libGLFW.glfwInit() == 0) {
                showErrorMessage("初始化 GLFW 失败");
                return null;
            }

            if (libGLFW.glfwVulkanSupported() == 0) {
                showErrorMessage("当前系统上的 GLFW 安装不支持 Vulkan");
                return null;
            }

            return libGLFW;
        } catch (RuntimeException e) {
            showErrorMessage("加载 GLFW 库中的函数失败: " + e.getMessage());
            return null;
        }
    }

    private static void showErrorMessage(String errorMessage) {
        JOptionPane.showMessageDialog(
                null,
                "<html><body><p style=\"width: 300px;\">" + errorMessage + "</p></body></html>",
                "错误",
                JOptionPane.ERROR_MESSAGE
        );
    }
}
