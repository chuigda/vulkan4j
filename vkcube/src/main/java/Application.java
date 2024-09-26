import tech.icey.glfwmini.LibGLFW;
import tech.icey.vk4j.Constants;
import tech.icey.vk4j.Loader;
import tech.icey.vk4j.annotation.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.buffer.*;
import tech.icey.vk4j.command.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.VkColorSpaceKHR;
import tech.icey.vk4j.enumtype.VkFormat;
import tech.icey.vk4j.enumtype.VkObjectType;
import tech.icey.vk4j.enumtype.VkPresentModeKHR;
import tech.icey.vk4j.handle.*;

import java.lang.foreign.*;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Objects;

public final class Application {
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

    private static /*VkBool32*/ int debugCallback(
            @enumtype(VkDebugUtilsMessageSeverityFlagsEXT.class) int messageSeverity,
            @enumtype(VkDebugUtilsMessageTypeFlagsEXT.class) int messageType,
            @pointer(target= VkDebugUtilsMessengerCallbackDataEXT.class) MemorySegment pCallbackData,
            @pointer(comment="void*") MemorySegment ignoredPUserData
    ) {
        pCallbackData = pCallbackData.reinterpret(VkDebugUtilsMessengerCallbackDataEXT.LAYOUT.byteSize());
        var callbackData = new VkDebugUtilsMessengerCallbackDataEXT(pCallbackData);

        String prefix;
        if ((messageSeverity & VkDebugUtilsMessageSeverityFlagsEXT.VK_DEBUG_UTILS_MESSAGE_SEVERITY_VERBOSE_BIT_EXT) != 0) {
            prefix = "VERBOSE : ";
        }
        else if ((messageSeverity & VkDebugUtilsMessageSeverityFlagsEXT.VK_DEBUG_UTILS_MESSAGE_SEVERITY_INFO_BIT_EXT) != 0) {
            prefix = "INFO : ";
        }
        else if ((messageSeverity & VkDebugUtilsMessageSeverityFlagsEXT.VK_DEBUG_UTILS_MESSAGE_SEVERITY_WARNING_BIT_EXT) != 0) {
            prefix = "WARNING : ";
        }
        else if ((messageSeverity & VkDebugUtilsMessageSeverityFlagsEXT.VK_DEBUG_UTILS_MESSAGE_SEVERITY_ERROR_BIT_EXT) != 0) {
            prefix = "ERROR : ";
        }
        else {
            prefix = "UNKNOWN";
        }

        if ((messageType & VkDebugUtilsMessageTypeFlagsEXT.VK_DEBUG_UTILS_MESSAGE_TYPE_GENERAL_BIT_EXT) != 0) {
            prefix += "GENERAL";
        }
        else {
            if ((messageType & VkDebugUtilsMessageTypeFlagsEXT.VK_DEBUG_UTILS_MESSAGE_TYPE_VALIDATION_BIT_EXT) != 0) {
                prefix += "VALIDATION";
            }

            if ((messageType & VkDebugUtilsMessageTypeFlagsEXT.VK_DEBUG_UTILS_MESSAGE_TYPE_PERFORMANCE_BIT_EXT) != 0) {
                if ((messageType & VkDebugUtilsMessageTypeFlagsEXT.VK_DEBUG_UTILS_MESSAGE_TYPE_VALIDATION_BIT_EXT) != 0) {
                    prefix += "|";
                }
                prefix += "PERFORMANCE";
            }
        }

        var messageIdName = callbackData.pMessageIdName();

        var messageBuilder = new StringBuilder();
        messageBuilder.append(String.format(
                "%s - Message Id Number: %d | Message Id Name: %s\n\t%s\n",
                prefix,
                callbackData.messageIdNumber(),
                messageIdName != null ? messageIdName.readString() : "(null)",
                Objects.requireNonNull(callbackData.pMessage()).readString()
        ));

        if (callbackData.objectCount() > 0) {
            messageBuilder.append(String.format(
                    "\tObjects - %s\n",
                    Integer.toUnsignedString(callbackData.objectCount()))
            );

            var objects = Objects.requireNonNull(callbackData.pObjects(callbackData.objectCount()));
            for (int i = 0; i < callbackData.objectCount(); i++) {
                var object = objects[i];
                messageBuilder.append(String.format("\t\tObject[%d] - %s", i, VkObjectType.explain(object.objectType())));
                messageBuilder.append(String.format(", handle = 0x%s", Long.toUnsignedString(object.objectHandle(), 16)));

                var objectName = object.pObjectName();
                if (objectName != null) {
                    messageBuilder.append(String.format(", name = %s", objectName.readString()));
                }

                messageBuilder.append("\n");
            }
        }

        if (callbackData.cmdBufLabelCount() > 0) {
            messageBuilder.append(String.format(
                    "\tCommand Buffer Labels - %s\n",
                    Integer.toUnsignedString(callbackData.cmdBufLabelCount()))
            );

            var labels = Objects.requireNonNull(callbackData.pCmdBufLabels(callbackData.cmdBufLabelCount()));
            for (int i = 0; i < callbackData.cmdBufLabelCount(); i++) {
                var label = labels[i];
                messageBuilder.append(String.format(
                        "\t\tLabel[%d] - %s",
                        i,
                        Objects.requireNonNull(label.pLabelName()).readString()
                ));

                var color = label.color();
                messageBuilder.append(String.format(
                        " { %.2f, %.2f, %.2f, %.2f }\n",
                        color.read(0),
                        color.read(1),
                        color.read(2),
                        color.read(3)
                ));
            }
        }

        System.err.println(messageBuilder);

        return Constants.VK_FALSE;
    }

    private static final StaticCommands staticCommands = new StaticCommands(Loader::loadFunctionOrNull);
    private static final EntryCommands entryCommands = new EntryCommands(Loader::loadFunctionOrNull);
    private static final LibGLFW libGLFW = new LibGLFW(Loader::loadFunctionOrNull);

    private static final FunctionDescriptor descriptor$debugCallback = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(VkDebugUtilsMessengerCallbackDataEXT.LAYOUT),
            ValueLayout.ADDRESS
    );
    private static final MethodHandle handle$debugCallback;
    private static final int frameLag = 2;

    static {
        MethodHandle temp;

        try {
            temp = MethodHandles.lookup()
                    .findStatic(Application.class, "debugCallback", descriptor$debugCallback.toMethodType());
        } catch (Exception e) {
            temp = null;
            UICommons.showErrorMessage("加载 debugCallback 失败：" + e);
            System.exit(-1);
        }

        handle$debugCallback = temp;
    }

    private final Arena arena = Arena.ofConfined();

    private final String validationLayerName = "VK_LAYER_KHRONOS_validation";
    private final ByteBuffer validationLayerNameByteArray = ByteBuffer.allocateString(arena, validationLayerName);
    private final String validationExtensionName = "VK_EXT_debug_utils";
    private final ByteBuffer validationExtensionNameByteArray = ByteBuffer.allocateString(arena, validationExtensionName);
    private final String swapchainExtensionName = "VK_KHR_swapchain";
    private final ByteBuffer swapchainExtensionNameByteArray = ByteBuffer.allocateString(arena, swapchainExtensionName);
    private final MemorySegment segment$debugCallback = Linker.nativeLinker().upcallStub(
            handle$debugCallback,
            descriptor$debugCallback,
            arena
    );

    private boolean prepared;
    private boolean useStagingBuffer;
    private boolean separatePresentQueue;
    private boolean isMinimized;
    private boolean invalidGPUSelectioni;
    private @unsigned int gpuNumber;
    private boolean vkKHRIncrementalPresentEnabled;
    private boolean vkGOOGLEDisplayTimingEnabled;
    private @unsigned long refreshDuration;
    private @unsigned long refreshDurationMultiplier;
    private @unsigned long targetIPD;
    private @unsigned long prevDesiredPresentTime;
    private @unsigned int nextPresentId;
    private @unsigned int lastEarlyId;
    private @unsigned int lastLateId;

    private @pointer(comment = "GLFWwindow*") MemorySegment glfwWindow;
    private VkSurfaceKHR surface;

    private VkInstance instance;
    private VkDebugUtilsMessengerEXT debugMessenger;
    private InstanceCommands instanceCommands;
    private VkDevice device;
    private DeviceCommands deviceCommands;
    private VkQueue graphicsQueue;
    private VkQueue presentQueue;
    private @unsigned int graphicsQueueFamilyIndex;
    private @unsigned int presentQueueFamilyIndex;
    private VkSemaphore[] imageAcquiredSemaphores;
    private VkSemaphore[] drawCompleteSemaphores;
    private VkSemaphore[] imageOwnershipSemaphores;
    private VkPhysicalDeviceProperties gpuProperties;
    private VkQueueFamilyProperties[] queueFamilyProperties;
    private VkPhysicalDeviceMemoryProperties memoryProperties;

    private @unsigned int enabledExtensionCount;
    private @unsigned int enabledLayerCount;

    private IntBuffer wh;
    private VkFormat format;
    private VkColorSpaceKHR colorSpace;

    private @unsigned int swapchainImageCount;
    private VkSwapchainKHR swpachain;
    private SwapchainImageResources[] swapchainImageResources;
    private @enumtype(VkPresentModeKHR.class) int presentMode;
    private VkFence[] fences;
    private int frameIndex;
    private boolean firstSwapchainFrame;

    private VkCommandPool commandPool;
    private VkCommandPool presetCommandPool;

    private static class Depth {
        @enumtype(VkFormat.class) int format;

        VkImage image;
        VkMemoryAllocateInfo memAlloc;
        VkDeviceMemory memory;
        VkImageView view;
    };
    private Depth depth;

    private TextureObject texture;
    private TextureObject stagingTexture;

    private VkCommandBuffer cmd;
    private VkPipelineLayout pipelineLayout;
    private VkDescriptorSetLayout descriptorSetLayout;
    private VkPipelineCache pipelineCache;
    private VkRenderPass renderPass;
    private VkPipeline pipeline;

    private Matrix4x4 projectionMatrix;
    private Matrix4x4 viewMatrix;
    private Matrix4x4 modelMatrix;

    private float spinAngle;
    private float spinIncrement;
    private boolean pause;

    VkShaderModule vertShaderModule;
    VkShaderModule fragShaderModule;
    VkDescriptorPool descriptorPool;

    boolean quit;
    int currentFrame;
    int frameCount;
    boolean validate;
    boolean validateChecksDisabled;
    boolean useBreak;
    boolean suppressPopups;
    boolean forceErrors;

    @unsigned int currentBuffer;
    @unsigned int queueFamilyCount;
}
