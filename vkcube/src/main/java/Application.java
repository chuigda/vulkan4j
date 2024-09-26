import tech.icey.glfwmini.LibGLFW;
import tech.icey.vk4j.Constants;
import tech.icey.vk4j.Loader;
import tech.icey.vk4j.annotation.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.buffer.*;
import tech.icey.vk4j.command.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
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

    private static boolean actualTimeLate(@unsigned long desired, @unsigned long actual, @unsigned long rdur) {
        if (actual <= desired) {
            return false;
        }

        long deadline = desired + rdur;
        return actual > deadline;
    }

    private static boolean canPresentEarlier(@unsigned long earliest, @unsigned long actual, @unsigned long margin, @unsigned long rdur) {
        if (earliest < actual) {
            @unsigned long diff = actual - earliest;
            return (diff > 2 * million) && (margin >= 2 * million);
        }

        return false;
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
    private static final long million = 1_000_000L;
    private static final long billion = 1_000_000_000L;

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

    private void nameObject(@enumtype(VkObjectType.class) int objectType, MemorySegment vulkanHandle, String name) {
        if (!validate) {
            return;
        }

        try (Arena localArena = Arena.ofConfined()) {
            var objName = VkDebugUtilsObjectNameInfoEXT.allocate(localArena);
            objName.objectType(objectType);
            objName.objectHandle(vulkanHandle.address());
            objName.pObjectName(ByteBuffer.allocateString(localArena, name));

            var result = instanceCommands.vkSetDebugUtilsObjectNameEXT(device, objName);
            assert result == VkResult.VK_SUCCESS;
        }
    }

    private void pushCommandBufferLabel(VkCommandBuffer commandBuffer, String labelName, @nullable float[] color) {
        if (!validate) {
            return;
        }

        try (Arena localArena = Arena.ofConfined()) {
            var label = VkDebugUtilsLabelEXT.allocate(localArena);
            label.pLabelName(ByteBuffer.allocateString(localArena, labelName));
            if (color != null) {
                var colorBuffer = label.color();
                for (int i = 0; i < 4; i++) {
                    colorBuffer.write(i, color[i]);
                }
            }

            instanceCommands.vkCmdBeginDebugUtilsLabelEXT(commandBuffer, label);
        }
    }

    private void popCommandBufferLabel(VkCommandBuffer commandBuffer) {
        if (!validate) {
            return;
        }

        instanceCommands.vkCmdEndDebugUtilsLabelEXT(commandBuffer);
    }

    private @nullable @unsigned
    Integer memoryTypeFromProperties(@unsigned int typeBits, @unsigned int requirementsMask) {
        Integer typeIndex = null;

        for (int i = 0; i < Constants.VK_MAX_MEMORY_TYPES; i++) {
            if ((typeBits & 1) == 1) {
                if ((memoryProperties.memoryTypesAt(i).propertyFlags() & requirementsMask) == requirementsMask) {
                    typeIndex = i;
                    break;
                }
            }

            typeBits >>= 1;
        }

        return typeIndex;
    }

    private void flushInitCommand() {
        if (cmd == null) {
            return;
        }

        var result = deviceCommands.vkEndCommandBuffer(cmd);
        assert result == VkResult.VK_SUCCESS;

        try (Arena localArena = Arena.ofConfined()) {
            var pFence = VkFence.Buffer.allocate(localArena);
            var fenceCreateInfo = VkFenceCreateInfo.allocate(localArena);
            if (forceErrors) {
                fenceCreateInfo.sType(0);
            }

            result = deviceCommands.vkCreateFence(device, fenceCreateInfo, null, pFence);
            assert result == VkResult.VK_SUCCESS;
            var fence = pFence.read();

            nameObject(VkObjectType.VK_OBJECT_TYPE_FENCE, fence.segment(), "InitFence");
            var pCommandBuffers = VkCommandBuffer.Buffer.allocate(localArena);
            pCommandBuffers.write(cmd);

            var submitInfo = VkSubmitInfo.allocate(localArena);
            submitInfo.commandBufferCount(1);
            submitInfo.pCommandBuffers(pCommandBuffers);

            result = deviceCommands.vkQueueSubmit(graphicsQueue, 1, submitInfo, fence);
            assert result == VkResult.VK_SUCCESS;

            result = deviceCommands.vkWaitForFences(device, 1, pFence, Constants.VK_TRUE, 0xFFFFFFFF_FFFFFFFFL);
            assert result == VkResult.VK_SUCCESS;

            deviceCommands.vkFreeCommandBuffers(device, commandPool, 1, pCommandBuffers);
            deviceCommands.vkDestroyFence(device, fence, null);
            cmd = null;
        }
    }

    private void setImageLayout(
            VkImage image,
            @enumtype(VkImageAspectFlags.class) int aspectMask,
            @enumtype(VkImageLayout.class) int oldImageLayout,
            @enumtype(VkImageLayout.class) int newImageLayout,
            @enumtype(VkAccessFlags.class) int srcAccessMask,
            @enumtype(VkPipelineStageFlags.class) int srcStages,
            @enumtype(VkPipelineStageFlags.class) int destStages
    ) {
        assert cmd != null;

        try (Arena localArena = Arena.ofConfined()) {
            var imageMemoryBarrier = VkImageMemoryBarrier.allocate(localArena);
            imageMemoryBarrier.srcAccessMask(srcAccessMask);
            imageMemoryBarrier.dstAccessMask(0);
            imageMemoryBarrier.srcQueueFamilyIndex(Constants.VK_QUEUE_FAMILY_IGNORED);
            imageMemoryBarrier.dstQueueFamilyIndex(Constants.VK_QUEUE_FAMILY_IGNORED);
            imageMemoryBarrier.oldLayout(oldImageLayout);
            imageMemoryBarrier.newLayout(newImageLayout);
            imageMemoryBarrier.image(image);
            imageMemoryBarrier.subresourceRange().aspectMask(aspectMask);
            imageMemoryBarrier.subresourceRange().baseMipLevel(0);
            imageMemoryBarrier.subresourceRange().levelCount(1);
            imageMemoryBarrier.subresourceRange().baseArrayLayer(0);
            imageMemoryBarrier.subresourceRange().layerCount(1);
            imageMemoryBarrier.dstAccessMask(switch (newImageLayout) {
                case VkImageLayout.VK_IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL -> VkAccessFlags.VK_ACCESS_TRANSFER_WRITE_BIT;
                case VkImageLayout.VK_IMAGE_LAYOUT_COLOR_ATTACHMENT_OPTIMAL -> VkAccessFlags.VK_ACCESS_COLOR_ATTACHMENT_WRITE_BIT;
                case VkImageLayout.VK_IMAGE_LAYOUT_DEPTH_STENCIL_ATTACHMENT_OPTIMAL -> VkAccessFlags.VK_ACCESS_DEPTH_STENCIL_ATTACHMENT_WRITE_BIT;
                case VkImageLayout.VK_IMAGE_LAYOUT_SHADER_READ_ONLY_OPTIMAL -> VkAccessFlags.VK_ACCESS_SHADER_READ_BIT | VkAccessFlags.VK_ACCESS_INPUT_ATTACHMENT_READ_BIT;
                case VkImageLayout.VK_IMAGE_LAYOUT_TRANSFER_SRC_OPTIMAL -> VkAccessFlags.VK_ACCESS_TRANSFER_READ_BIT;
                case VkImageLayout.VK_IMAGE_LAYOUT_PRESENT_SRC_KHR -> VkAccessFlags.VK_ACCESS_MEMORY_READ_BIT;
                default -> 0;
            });

            deviceCommands.vkCmdPipelineBarrier(cmd, srcStages, destStages, 0, 0, null, 0, null, 1, imageMemoryBarrier);
        }
    }

    private void drawBuildCommand(VkCommandBuffer cmdbuf) {
        int width = wh.read(0);
        int height = wh.read(1);

        try (Arena localArena = Arena.ofConfined()) {
            var commandBufferBeginInfo = VkCommandBufferBeginInfo.allocate(localArena);
            commandBufferBeginInfo.flags(VkCommandBufferUsageFlags.VK_COMMAND_BUFFER_USAGE_SIMULTANEOUS_USE_BIT);

            var clearValues = VkClearValue.allocate(localArena, 2);
            var colorValue = clearValues[0].color().float32();
            for (int i = 0; i < 4; i++) {
                colorValue.write(i, 0.2f);
            }
            var depthStencilValue = clearValues[1].depthStencil();
            depthStencilValue.depth(1.0f);
            depthStencilValue.stencil(0);

            var renderPassBeginInfo = VkRenderPassBeginInfo.allocate(localArena);
            renderPassBeginInfo.renderPass(renderPass);
            renderPassBeginInfo.framebuffer(swapchainImageResources[currentBuffer].framebuffer);
            renderPassBeginInfo.renderArea().extent().width(width);
            renderPassBeginInfo.renderArea().extent().height(height);
            renderPassBeginInfo.clearValueCount(2);
            renderPassBeginInfo.pClearValues(clearValues[0]);

            var result = deviceCommands.vkBeginCommandBuffer(cmdbuf, commandBufferBeginInfo);
            assert result == VkResult.VK_SUCCESS;
            nameObject(VkObjectType.VK_OBJECT_TYPE_COMMAND_BUFFER, cmdbuf.segment(), "CubeDrawCommandBuf");

            float[] beginColor = { 0.4f, 0.3f, 0.2f, 0.1f };
            pushCommandBufferLabel(cmdbuf, "DrawBegin", beginColor);

            deviceCommands.vkCmdBeginRenderPass(cmdbuf, renderPassBeginInfo, VkSubpassContents.VK_SUBPASS_CONTENTS_INLINE);
            float[] renderPassColor = {8.4f, 7.3f, 6.2f, 7.1f};
            pushCommandBufferLabel(cmdbuf, "InsideRenderPass", renderPassColor);

            deviceCommands.vkCmdBindPipeline(cmdbuf, VkPipelineBindPoint.VK_PIPELINE_BIND_POINT_GRAPHICS, pipeline);
            var pDescriptorSets = VkDescriptorSet.Buffer.allocate(localArena);
            pDescriptorSets.write(swapchainImageResources[currentBuffer].descriptorSet);
            deviceCommands.vkCmdBindDescriptorSets(
                    cmdbuf,
                    VkPipelineBindPoint.VK_PIPELINE_BIND_POINT_GRAPHICS,
                    pipelineLayout,
                    0,
                    1,
                    pDescriptorSets,
                    0,
                    null
            );

            var viewport = VkViewport.allocate(localArena);
            float viewportDimension;
            if (width < height) {
                viewportDimension = (float) width;
                viewport.y((height - width) / 2.0f);
            } else {
                viewportDimension = (float) height;
                viewport.x((width - height) / 2.0f);
            }
            viewport.height(viewportDimension);
            viewport.width(viewportDimension);
            viewport.minDepth(0.0f);
            viewport.maxDepth(1.0f);
            deviceCommands.vkCmdSetViewport(cmdbuf, 0, 1, viewport);

            var scissor = VkRect2D.allocate(localArena);
            scissor.extent().width(width);
            scissor.extent().height(height);
            scissor.offset().x(0);
            scissor.offset().y(0);
            deviceCommands.vkCmdSetScissor(cmdbuf, 0, 1, scissor);

            float[] drawColor = { -0.4f, -0.3f, -0.2f, -0.1f };
            pushCommandBufferLabel(cmdbuf, "ActualDraw", drawColor);
            deviceCommands.vkCmdDraw(cmdbuf, 12 * 3, 1, 0, 0);
            popCommandBufferLabel(cmdbuf);

            deviceCommands.vkCmdEndRenderPass(cmdbuf);
            popCommandBufferLabel(cmdbuf);

            if (separatePresentQueue) {
                var imageOwnershipBarrier = VkImageMemoryBarrier.allocate(localArena);
                imageOwnershipBarrier.oldLayout(VkImageLayout.VK_IMAGE_LAYOUT_PRESENT_SRC_KHR);
                imageOwnershipBarrier.newLayout(VkImageLayout.VK_IMAGE_LAYOUT_PRESENT_SRC_KHR);
                imageOwnershipBarrier.srcQueueFamilyIndex(graphicsQueueFamilyIndex);
                imageOwnershipBarrier.dstQueueFamilyIndex(presentQueueFamilyIndex);
                imageOwnershipBarrier.image(swapchainImageResources[currentBuffer].image);
                imageOwnershipBarrier.subresourceRange().aspectMask(VkImageAspectFlags.VK_IMAGE_ASPECT_COLOR_BIT);
                imageOwnershipBarrier.subresourceRange().baseMipLevel(0);
                imageOwnershipBarrier.subresourceRange().levelCount(1);
                imageOwnershipBarrier.subresourceRange().baseArrayLayer(0);
                imageOwnershipBarrier.subresourceRange().layerCount(1);

                deviceCommands.vkCmdPipelineBarrier(
                        cmdbuf,
                        VkPipelineStageFlags.VK_PIPELINE_STAGE_COLOR_ATTACHMENT_OUTPUT_BIT,
                        VkPipelineStageFlags.VK_PIPELINE_STAGE_BOTTOM_OF_PIPE_BIT,
                        0,
                        0,
                        null,
                        0,
                        null,
                        1,
                        imageOwnershipBarrier
                );
            }

            popCommandBufferLabel(cmdbuf);
            result = deviceCommands.vkEndCommandBuffer(cmdbuf);
            assert result == VkResult.VK_SUCCESS;
        }
    }

    private void buildImageOwnershipCommand(int i) {
        try (Arena localArena = Arena.ofConfined()) {
            var commandBufferBeginInfo = VkCommandBufferBeginInfo.allocate(localArena);
            commandBufferBeginInfo.flags(VkCommandBufferUsageFlags.VK_COMMAND_BUFFER_USAGE_SIMULTANEOUS_USE_BIT);

            var result = deviceCommands.vkBeginCommandBuffer(
                    swapchainImageResources[i].graphicsToPresentCmd,
                    commandBufferBeginInfo
            );
            assert result == VkResult.VK_SUCCESS;

            var imageOwnershipBarrier = VkImageMemoryBarrier.allocate(localArena);
            imageOwnershipBarrier.oldLayout(VkImageLayout.VK_IMAGE_LAYOUT_PRESENT_SRC_KHR);
            imageOwnershipBarrier.newLayout(VkImageLayout.VK_IMAGE_LAYOUT_PRESENT_SRC_KHR);
            imageOwnershipBarrier.srcQueueFamilyIndex(graphicsQueueFamilyIndex);
            imageOwnershipBarrier.dstQueueFamilyIndex(presentQueueFamilyIndex);
            imageOwnershipBarrier.image(swapchainImageResources[i].image);
            imageOwnershipBarrier.subresourceRange().aspectMask(VkImageAspectFlags.VK_IMAGE_ASPECT_COLOR_BIT);
            imageOwnershipBarrier.subresourceRange().baseMipLevel(0);
            imageOwnershipBarrier.subresourceRange().levelCount(1);
            imageOwnershipBarrier.subresourceRange().baseArrayLayer(0);
            imageOwnershipBarrier.subresourceRange().layerCount(1);

            deviceCommands.vkCmdPipelineBarrier(
                    swapchainImageResources[i].graphicsToPresentCmd,
                    VkPipelineStageFlags.VK_PIPELINE_STAGE_COLOR_ATTACHMENT_OUTPUT_BIT,
                    VkPipelineStageFlags.VK_PIPELINE_STAGE_BOTTOM_OF_PIPE_BIT,
                    0,
                    0,
                    null,
                    0,
                    null,
                    1,
                    imageOwnershipBarrier
            );
            result = deviceCommands.vkEndCommandBuffer(swapchainImageResources[i].graphicsToPresentCmd);
            assert result == VkResult.VK_SUCCESS;
        }
    }

    private void updateDataBuffer() {
    }
}
