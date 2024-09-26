import tech.icey.glfwmini.LibGLFW;
import tech.icey.vk4j.Loader;
import tech.icey.vk4j.Version;
import tech.icey.vk4j.annotation.pointer;
import tech.icey.vk4j.bitmask.VkDebugUtilsMessageSeverityFlagsEXT;
import tech.icey.vk4j.bitmask.VkDebugUtilsMessageTypeFlagsEXT;
import tech.icey.vk4j.buffer.ByteBuffer;
import tech.icey.vk4j.buffer.IntBuffer;
import tech.icey.vk4j.buffer.PointerBuffer;
import tech.icey.vk4j.command.DeviceCommands;
import tech.icey.vk4j.command.EntryCommands;
import tech.icey.vk4j.command.InstanceCommands;
import tech.icey.vk4j.command.StaticCommands;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.VkPhysicalDeviceType;
import tech.icey.vk4j.enumtype.VkResult;
import tech.icey.vk4j.handle.*;

import java.lang.foreign.*;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;

public final class Engine implements AutoCloseable {
    public Engine() {
        libGLFW = new LibGLFW(Loader::loadFunction);
        staticCommands = new StaticCommands(Loader::loadFunction);
        entryCommands = new EntryCommands(Loader::loadFunction);

        if (libGLFW.glfwInit() == LibGLFW.GLFW_FALSE) {
            throw new RuntimeException("GLFW 初始化失败");
        }

        initVulkanInstance();
        initDevice();
        initWindow();
    }

    public void run() {
        while (!libGLFW.glfwWindowShouldClose(glfwWindow)) {
            libGLFW.glfwPollEvents();

            if (pauseRendering) {
                continue;
            }

            draw();
        }

        pauseRendering = true;
    }

    public void draw() {}

    public int getFrameNumber() {
        return frameNumber;
    }

    public boolean shouldStopRendering() {
        return pauseRendering;
    }

    @Override
    public void close() {
        if (debugMessenger != null) {
            instanceCommands.vkDestroyDebugUtilsMessengerEXT(instance, debugMessenger, null);
        }
        instanceCommands.vkDestroyInstance(instance, null);

        libGLFW.glfwDestroyWindow(glfwWindow);
        engineArena.close();
    }

    private void initVulkanInstance() {
        boolean hasValidationLayerSupport = checkValidationLayerSupport();

        try (Arena localArena = Arena.ofConfined()) {
            var pExtensionCount = IntBuffer.allocate(localArena);
            var glfwRequiredExtensions = libGLFW.glfwGetRequiredInstanceExtensions(pExtensionCount);
            var extensionCount = pExtensionCount.read();

            var appInfo = VkApplicationInfo.allocate(localArena);
            appInfo.pApplicationName(ByteBuffer.allocateString(localArena, "VkCube4J"));
            appInfo.applicationVersion(Version.vkMakeAPIVersion(0, 1, 0, 0));
            appInfo.pEngineName(ByteBuffer.allocateString(localArena, "Shenyang WS-15"));
            appInfo.engineVersion(Version.vkMakeAPIVersion(0, 1, 0, 0));
            appInfo.apiVersion(Version.VK_API_VERSION_1_3);

            var instanceCreateInfo = VkInstanceCreateInfo.allocate(localArena);
            instanceCreateInfo.pApplicationInfo(appInfo);

            if (hasValidationLayerSupport) {
                PointerBuffer ppEnabledLayerNames = PointerBuffer.allocate(localArena);
                ppEnabledLayerNames.write(NameConstants.validationLayerNameByteArray.segment());

                PointerBuffer ppEnabledExtensionNames = PointerBuffer.allocate(localArena, extensionCount + 1);
                for (int i = 0; i < extensionCount; i++) {
                    ppEnabledExtensionNames.write(i, glfwRequiredExtensions.read(i));
                }
                ppEnabledExtensionNames.write(extensionCount, NameConstants.validationExtensionNameByteArray.segment());

                instanceCreateInfo.enabledLayerCount(1);
                instanceCreateInfo.ppEnabledLayerNames(ppEnabledLayerNames.segment());
                instanceCreateInfo.enabledExtensionCount(extensionCount + 1);
                instanceCreateInfo.ppEnabledExtensionNames(ppEnabledExtensionNames.segment());

                var debugMessengerCreateInfo = VkDebugUtilsMessengerCreateInfoEXT.allocate(localArena);
                populateDebugMessengerCreateInfo(debugMessengerCreateInfo);
                instanceCreateInfo.pNext(debugMessengerCreateInfo.segment());
            }
            else {
                instanceCreateInfo.enabledExtensionCount(pExtensionCount.read());
                instanceCreateInfo.ppEnabledExtensionNames(glfwRequiredExtensions.segment());
            }

            var pInstance = VkInstance.Buffer.allocate(localArena);
            var result = entryCommands.vkCreateInstance(instanceCreateInfo, null, pInstance);
            if (result != VkResult.VK_SUCCESS) {
                throw new RuntimeException("创建 Vulkan 实例失败，Vulkan 错误码: " + VkResult.explain(result));
            }

            instance = pInstance.read();
            instanceCommands = new InstanceCommands(this::loadInstanceCommand);

            if (hasValidationLayerSupport) {
                var debugMessengerCreateInfo = VkDebugUtilsMessengerCreateInfoEXT.allocate(localArena);
                populateDebugMessengerCreateInfo(debugMessengerCreateInfo);
                var pDebugMessenger = VkDebugUtilsMessengerEXT.Buffer.allocate(localArena);
                result = instanceCommands.vkCreateDebugUtilsMessengerEXT(
                        instance,
                        debugMessengerCreateInfo,
                        null,
                        pDebugMessenger
                );
                if (result != VkResult.VK_SUCCESS) {
                    throw new RuntimeException("创建 Vulkan 调试信使失败，Vulkan 错误码: " + VkResult.explain(result));
                }
                debugMessenger = pDebugMessenger.read();
            }
            else {
                debugMessenger = null;
            }
        }
    }

    private boolean checkValidationLayerSupport() {
        try (Arena localArena = Arena.ofConfined()) {
            var pLayerCount = IntBuffer.allocate(localArena);
            var result = entryCommands.vkEnumerateInstanceLayerProperties(pLayerCount, null);
            if (result != VkResult.VK_SUCCESS) {
                System.err.println("枚举 Vulkan 实例层属性失败，Vulkan 错误码: " + VkResult.explain(result));
                return false;
            }

            var layerCount = pLayerCount.read();
            var layerProperties = VkLayerProperties.allocate(localArena, layerCount);
            result = entryCommands.vkEnumerateInstanceLayerProperties(pLayerCount, layerProperties[0]);
            if (result != VkResult.VK_SUCCESS) {
                System.err.println("枚举 Vulkan 实例层属性失败，Vulkan 错误码: " + VkResult.explain(result));
                return false;
            }

            for (var layerProperty : layerProperties) {
                if (layerProperty.layerName().readString().equals(NameConstants.validationLayerName)) {
                    return true;
                }
            }
        }

        return false;
    }

    private void populateDebugMessengerCreateInfo(VkDebugUtilsMessengerCreateInfoEXT debugMessengerCreateInfo) {
        debugMessengerCreateInfo.messageSeverity(
                VkDebugUtilsMessageSeverityFlagsEXT.VK_DEBUG_UTILS_MESSAGE_SEVERITY_VERBOSE_BIT_EXT |
                        VkDebugUtilsMessageSeverityFlagsEXT.VK_DEBUG_UTILS_MESSAGE_SEVERITY_INFO_BIT_EXT |
                        VkDebugUtilsMessageSeverityFlagsEXT.VK_DEBUG_UTILS_MESSAGE_SEVERITY_WARNING_BIT_EXT |
                        VkDebugUtilsMessageSeverityFlagsEXT.VK_DEBUG_UTILS_MESSAGE_SEVERITY_ERROR_BIT_EXT
        );
        debugMessengerCreateInfo.messageType(
                VkDebugUtilsMessageTypeFlagsEXT.VK_DEBUG_UTILS_MESSAGE_TYPE_GENERAL_BIT_EXT |
                        VkDebugUtilsMessageTypeFlagsEXT.VK_DEBUG_UTILS_MESSAGE_TYPE_VALIDATION_BIT_EXT |
                        VkDebugUtilsMessageTypeFlagsEXT.VK_DEBUG_UTILS_MESSAGE_TYPE_PERFORMANCE_BIT_EXT
        );
        debugMessengerCreateInfo.pfnUserCallback(DebugCallback.pDebugCallback);
    }

    private void initDevice() {
        try (Arena localArena = Arena.ofConfined()) {
            var pPhysicalDeviceCount = IntBuffer.allocate(localArena);
            var result = instanceCommands.vkEnumeratePhysicalDevices(instance, pPhysicalDeviceCount, null);
            if (result != VkResult.VK_SUCCESS) {
                throw new RuntimeException("枚举 Vulkan 物理设备失败，Vulkan 错误码: " + VkResult.explain(result));
            }

            var physicalDeviceCount = pPhysicalDeviceCount.read();
            if (physicalDeviceCount == 0) {
                throw new RuntimeException("未找到任何支持 Vulkan 的物理设备");
            }

            var pPhysicalDevices = VkPhysicalDevice.Buffer.allocate(localArena, physicalDeviceCount);
            result = instanceCommands.vkEnumeratePhysicalDevices(instance, pPhysicalDeviceCount, pPhysicalDevices);
            if (result != VkResult.VK_SUCCESS) {
                throw new RuntimeException("枚举 Vulkan 物理设备失败，Vulkan 错误码: " + VkResult.explain(result));
            }

            physicalDevice = pickPhysicalDevice(pPhysicalDevices.readAll());
        }
    }

    private VkPhysicalDevice pickPhysicalDevice(VkPhysicalDevice[] physicalDevices) {
        try (Arena localArena = Arena.ofConfined()) {
            var deviceInfoList = new ArrayList<DeviceInfoDialog.DeviceInfo>();
            var deviceList = new ArrayList<VkPhysicalDevice>();
            for (var physicalDevice : physicalDevices) {
                var properties = VkPhysicalDeviceProperties.allocate(localArena);
                instanceCommands.vkGetPhysicalDeviceProperties(physicalDevice, properties);

                var deviceName = properties.deviceName().readString();
                var deviceType = switch (properties.deviceType()) {
                    case VkPhysicalDeviceType.VK_PHYSICAL_DEVICE_TYPE_OTHER -> "其他";
                    case VkPhysicalDeviceType.VK_PHYSICAL_DEVICE_TYPE_INTEGRATED_GPU -> "集成 GPU";
                    case VkPhysicalDeviceType.VK_PHYSICAL_DEVICE_TYPE_DISCRETE_GPU -> "独立 GPU";
                    case VkPhysicalDeviceType.VK_PHYSICAL_DEVICE_TYPE_VIRTUAL_GPU -> "虚拟 GPU";
                    case VkPhysicalDeviceType.VK_PHYSICAL_DEVICE_TYPE_CPU -> "CPU";
                    default -> "未知";
                };
                var deviceId = Integer.toUnsignedString(properties.deviceID());
                var vendorId = Integer.toUnsignedString(properties.vendorID());
                var driverVersion = Version.decode(properties.driverVersion());

                IntBuffer pNumDeviceExtensions = IntBuffer.allocate(localArena);
                int result = instanceCommands.vkEnumerateDeviceExtensionProperties(
                        physicalDevice,
                        null,
                        pNumDeviceExtensions,
                        null
                );
                if (result != VkResult.VK_SUCCESS) {
                    throw new RuntimeException("枚举 Vulkan 设备扩展失败，Vulkan 错误码: " + VkResult.explain(result));
                }

                var numDeviceExtensions = pNumDeviceExtensions.read();
                var extensionProperties = VkExtensionProperties.allocate(localArena, numDeviceExtensions);
                result = instanceCommands.vkEnumerateDeviceExtensionProperties(
                        physicalDevice,
                        null,
                        pNumDeviceExtensions,
                        extensionProperties[0]
                );
                if (result != VkResult.VK_SUCCESS) {
                    throw new RuntimeException("枚举 Vulkan 设备扩展失败，Vulkan 错误码: " + VkResult.explain(result));
                }

                boolean hasSwapchainSupport = false;
                var extensionNames = new StringBuilder();
                for (int j = 0; j < numDeviceExtensions; j++) {
                    if (extensionProperties[j].extensionName().readString().equals(NameConstants.swapchainExtensionName)) {
                        hasSwapchainSupport = true;
                    }

                    extensionNames.append(extensionProperties[j].extensionNameRaw().getString(0));
                    if (j != numDeviceExtensions - 1) {
                        extensionNames.append(" ");
                    }
                }

                if (!hasSwapchainSupport) {
                    continue;
                }

                deviceInfoList.add(new DeviceInfoDialog.DeviceInfo(
                        deviceName,
                        "设备 ID: " + deviceId + "\n" +
                                "供应商 ID: " + vendorId + "\n" +
                                "设备类型: " + deviceType + "\n" +
                                "驱动版本: " + driverVersion + "\n" +
                                "设备扩展: " + extensionNames
                ));
                deviceList.add(physicalDevice);
            }

            var dialog = new DeviceInfoDialog(deviceInfoList);
            dialog.setVisible(true);

            if (dialog.selectedDeviceId == null) {
                // 有点丑但是凑合用吧...
                System.exit(0);
            }

            return deviceList.get(dialog.selectedDeviceId);
        }
    }

    private void initWindow() {
        libGLFW.glfwWindowHint(LibGLFW.GLFW_CLIENT_API, LibGLFW.GLFW_NO_API);
        libGLFW.glfwWindowHint(LibGLFW.GLFW_RESIZABLE, LibGLFW.GLFW_FALSE);
        windowExtent.width(1024);
        windowExtent.height(768);

        glfwWindow = libGLFW.glfwCreateWindow(
                windowExtent.width(),
                windowExtent.height(),
                "VkCube4J",
                MemorySegment.NULL,
                MemorySegment.NULL
        );

        FunctionDescriptor iconifyCallbackDesc = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT);
        MethodHandle iconifyCallback;
        try {
            iconifyCallback = MethodHandles.lookup().findVirtual(
                    Engine.class,
                    "windowIconifyCallback",
                    iconifyCallbackDesc.toMethodType()
            ).bindTo(this);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        MemorySegment segment = Linker.nativeLinker().upcallStub(iconifyCallback, iconifyCallbackDesc, engineArena);
        libGLFW.glfwSetWindowIconifyCallback(glfwWindow, segment);
    }

    private void windowIconifyCallback(@pointer(comment = "GLFWwindow*") MemorySegment window, int iconified) {
        pauseRendering = iconified == LibGLFW.GLFW_TRUE;
    }

    private MethodHandle loadInstanceCommand(String name, FunctionDescriptor descriptor) {
        try (Arena localArena = Arena.ofConfined()) {
            var nameSegment = ByteBuffer.allocateString(localArena, name);
            MemorySegment segment = staticCommands.vkGetInstanceProcAddr(instance, nameSegment);
            if (segment.address() == 0) {
                return null;
            }

            return Linker.nativeLinker().downcallHandle(segment, descriptor);
        }
    }

    private MethodHandle loadDeviceCommand(String name, FunctionDescriptor descriptor) {
        try (Arena localArena = Arena.ofConfined()) {
            var nameSegment = ByteBuffer.allocateString(localArena, name);
            MemorySegment segment = staticCommands.vkGetDeviceProcAddr(device, nameSegment);
            if (segment.address() == 0) {
                return null;
            }

            return Linker.nativeLinker().downcallHandle(segment, descriptor);
        }
    }

    private final Arena engineArena = Arena.ofShared();
    private final LibGLFW libGLFW;
    private final StaticCommands staticCommands;
    private final EntryCommands entryCommands;

    private int frameNumber = 0;
    private boolean pauseRendering = false;
    private VkExtent2D windowExtent = VkExtent2D.allocate(engineArena);

    private VkInstance instance;
    private InstanceCommands instanceCommands;
    private VkDebugUtilsMessengerEXT debugMessenger;
    private VkPhysicalDevice physicalDevice;
    private @pointer(comment = "GLFWwindow*") MemorySegment glfwWindow;
    private VkSurfaceKHR surface;
    private VkDevice device;
    private DeviceCommands deviceCommands;
}
