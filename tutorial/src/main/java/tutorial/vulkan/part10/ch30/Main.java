package tutorial.vulkan.part10.ch30;

import club.doki7.ffm.NativeLayout;
import club.doki7.ffm.annotation.EnumType;
import club.doki7.ffm.annotation.NativeType;
import club.doki7.ffm.annotation.Pointer;
import club.doki7.ffm.annotation.Unsigned;
import club.doki7.ffm.ptr.*;
import club.doki7.glfw.GLFW;
import club.doki7.glfw.GLFWConstants;
import club.doki7.glfw.GLFWFunctionTypes;
import club.doki7.glfw.GLFWLoader;
import club.doki7.glfw.handle.GLFWwindow;
import club.doki7.vulkan.Version;
import club.doki7.vulkan.VkConstants;
import club.doki7.vulkan.VkFunctionTypes;
import club.doki7.vulkan.bitmask.*;
import club.doki7.vulkan.command.*;
import club.doki7.vulkan.datatype.*;
import club.doki7.vulkan.enumtype.*;
import club.doki7.vulkan.handle.*;
import de.javagl.obj.ObjData;
import de.javagl.obj.ObjReader;
import de.javagl.obj.ObjUtils;
import org.joml.Matrix4f;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.lang.foreign.Arena;
import java.lang.foreign.Linker;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.nio.ByteOrder;
import java.util.Objects;

class Application {
    public void run() {
        initWindow();
        initVulkan();
        mainLoop();
        cleanup();
    }

    private void initWindow() {
        GLFWLoader.loadGLFWLibrary();
        glfw = GLFWLoader.loadGLFW();
        if (glfw.init() != GLFWConstants.TRUE) {
            throw new RuntimeException("Failed to initialize GLFW");
        }

        if (glfw.vulkanSupported() != GLFWConstants.TRUE) {
            throw new RuntimeException("Vulkan is not supported");
        }

        glfw.windowHint(GLFWConstants.CLIENT_API, GLFWConstants.NO_API);
        window = glfw.createWindow(WIDTH, HEIGHT, WINDOW_TITLE, null, null);

        try {
            var handle = MethodHandles.lookup().findVirtual(
                    Application.class,
                    "framebufferResizeCallback",
                    GLFWFunctionTypes.GLFWframebuffersizefun.toMethodType()
            ).bindTo(this); // funny binding mechanism

            var upcallStub = Linker.nativeLinker()
                    .upcallStub(handle, GLFWFunctionTypes.GLFWframebuffersizefun, Arena.global());
            glfw.setFramebufferSizeCallback(window, upcallStub);
        } catch (Exception e) {
            throw new RuntimeException("Failed to find method handle for framebufferResizeCallback", e);
        }
    }

    private void initVulkan() {
        VulkanLoader.loadVulkanLibrary();
        staticCommands = VulkanLoader.loadStaticCommands();
        entryCommands = VulkanLoader.loadEntryCommands(staticCommands);

        createInstance();
        setupDebugMessenger();
        createSurface();
        pickPhysicalDevice();
        createLogicalDevice();
        createSwapchain();
        createImageViews();
        createRenderPass();
        createDescriptorSetLayout();
        createGraphicsPipeline();
        createCommandPool();
        createColorResources();
        createDepthResources();
        createFramebuffers();
        createTextureImage();
        createTextureImageView();
        createTextureSampler();
        loadModel();
        createVertexBuffer();
        createIndexBuffer();
        createUniformBuffers();
        createDescriptorPool();
        createDescriptorSets();
        createCommandBuffers();
        createSyncObjects();
    }

    private void mainLoop() {
        while (glfw.windowShouldClose(window) == GLFWConstants.FALSE) {
            glfw.pollEvents();
            drawFrame();
        }

        deviceCommands.deviceWaitIdle(device);
    }

    private void cleanup() {
        for (var semaphore : pImageAvailableSemaphores) {
            deviceCommands.destroySemaphore(device, semaphore, null);
        }
        for (var fence : pInFlightFences) {
            deviceCommands.destroyFence(device, fence, null);
        }
        deviceCommands.destroyCommandPool(device, commandPool, null);
        cleanupSwapChain();
        deviceCommands.destroySampler(device, textureSampler, null);
        deviceCommands.destroyImageView(device, textureImageView, null);
        deviceCommands.destroyImage(device, textureImage, null);
        deviceCommands.freeMemory(device, textureImageMemory, null);
        deviceCommands.destroyBuffer(device, vertexBuffer, null);
        deviceCommands.freeMemory(device, vertexBufferMemory, null);
        deviceCommands.destroyBuffer(device, indexBuffer, null);
        deviceCommands.freeMemory(device, indexBufferMemory, null);
        deviceCommands.destroyPipeline(device, graphicsPipeline, null);
        deviceCommands.destroyPipelineLayout(device, pipelineLayout, null);
        for (var uniformBuffer : uniformBuffers) {
            deviceCommands.destroyBuffer(device, uniformBuffer, null);
        }
        for (var uniformBufferMemory : uniformBuffersMemory) {
            deviceCommands.freeMemory(device, uniformBufferMemory, null);
        }
        deviceCommands.destroyDescriptorPool(device, descriptorPool, null);
        deviceCommands.destroyDescriptorSetLayout(device, descriptorSetLayout, null);
        deviceCommands.destroyRenderPass(device, renderPass, null);
        deviceCommands.destroyDevice(device, null);
        instanceCommands.destroySurfaceKHR(instance, surface, null);
        if (ENABLE_VALIDATION_LAYERS) {
            instanceCommands.destroyDebugUtilsMessengerEXT(instance, debugMessenger, null);
        }
        instanceCommands.destroyInstance(instance, null);
        glfw.destroyWindow(window);
        glfw.terminate();
    }

    private void createInstance() {
        try (var arena = Arena.ofConfined()) {
            if (ENABLE_VALIDATION_LAYERS && !checkValidationLayerSupport()) {
                throw new RuntimeException("Validation layers requested, but not available");
            }

            var appInfo = VkApplicationInfo.allocate(arena)
                    .pApplicationName(BytePtr.allocateString(arena, "Zdravstvuyte, Vulkan!"))
                    .applicationVersion(new Version(0, 1, 0, 0).encode())
                    .pEngineName(BytePtr.allocateString(arena, "Soloviev D-30"))
                    .engineVersion(new Version(0, 1, 0, 0).encode())
                    .apiVersion(Version.VK_API_VERSION_1_0.encode());

            var instanceCreateInfo = VkInstanceCreateInfo.allocate(arena)
                    .pApplicationInfo(appInfo);

            if (ENABLE_VALIDATION_LAYERS) {
                instanceCreateInfo.enabledLayerCount(1)
                        .ppEnabledLayerNames(PointerPtr.allocateV(arena, BytePtr.allocateString(arena, VALIDATION_LAYER_NAME)));

                var debugCreateInfo = VkDebugUtilsMessengerCreateInfoEXT.allocate(arena);
                populateDebugMessengerCreateInfo(debugCreateInfo);
                instanceCreateInfo.pNext(debugCreateInfo);
            }

            var extensions = getRequiredExtensions(arena);
            instanceCreateInfo.enabledExtensionCount((int) extensions.size())
                    .ppEnabledExtensionNames(extensions);

            var pInstance = VkInstance.Ptr.allocate(arena);
            var result = entryCommands.createInstance(instanceCreateInfo, null, pInstance);
            if (result != VkResult.SUCCESS) {
                throw new RuntimeException("Failed to create instance, vulkan error code: " + VkResult.explain(result));
            }
            instance = Objects.requireNonNull(pInstance.read());
            instanceCommands = VulkanLoader.loadInstanceCommands(instance, staticCommands);
        }
    }

    private void setupDebugMessenger() {
        if (!ENABLE_VALIDATION_LAYERS) {
            return;
        }

        try (var arena = Arena.ofConfined()) {
            var debugUtilsMessengerCreateInfo = VkDebugUtilsMessengerCreateInfoEXT.allocate(arena);
            populateDebugMessengerCreateInfo(debugUtilsMessengerCreateInfo);

            var pDebugMessenger = VkDebugUtilsMessengerEXT.Ptr.allocate(arena);
            var result = instanceCommands.createDebugUtilsMessengerEXT(
                    instance,
                    debugUtilsMessengerCreateInfo,
                    null,
                    pDebugMessenger
            );
            if (result != VkResult.SUCCESS) {
                throw new RuntimeException("Failed to set up debug messenger, vulkan error code: " + VkResult.explain(result));
            }
            debugMessenger = Objects.requireNonNull(pDebugMessenger.read());
        }
    }

    private void createSurface() {
        try (var arena = Arena.ofConfined()) {
            var pSurface = VkSurfaceKHR.Ptr.allocate(arena);
            var result = glfw.createWindowSurface(instance, window, null, pSurface);
            if (result != VkResult.SUCCESS) {
                throw new RuntimeException("Failed to create window surface, vulkan error code: " + VkResult.explain(result));
            }
            surface = Objects.requireNonNull(pSurface.read());
        }
    }

    private void pickPhysicalDevice() {
        try (var arena = Arena.ofConfined()) {
            var pDeviceCount = IntPtr.allocate(arena);
            var result = instanceCommands.enumeratePhysicalDevices(instance, pDeviceCount, null);
            if (result != VkResult.SUCCESS) {
                throw new RuntimeException("Failed to enumerate physical devices, vulkan error code: " + VkResult.explain(result));
            }

            var deviceCount = pDeviceCount.read();
            if (deviceCount == 0) {
                throw new RuntimeException("Failed to find GPUs with Vulkan support");
            }

            var pDevices = VkPhysicalDevice.Ptr.allocate(arena, deviceCount);
            result = instanceCommands.enumeratePhysicalDevices(instance, pDeviceCount, pDevices);
            if (result != VkResult.SUCCESS) {
                throw new RuntimeException("Failed to enumerate physical devices, vulkan error code: " + VkResult.explain(result));
            }

            for (var device : pDevices) {
                if (isDeviceSuitable(device)) {
                    physicalDevice = device;
                    msaaSamples = getMaxUsableSampleCount();
                    break;
                }
            }

            if (physicalDevice == null) {
                throw new RuntimeException("Failed to find a suitable Vulkan physical device");
            }
        }
    }

    private void createLogicalDevice() {
        var indices = findQueueFamilies(physicalDevice);
        assert indices != null : "Queue family indices should not be null";

        try (var arena = Arena.ofConfined()) {
            var deviceCreateInfo = VkDeviceCreateInfo.allocate(arena);
            var pQueuePriorities = FloatPtr.allocateV(arena, 1.0f);
            deviceCreateInfo.queueCreateInfoCount(1);
            if (indices.graphicsFamily == indices.presentFamily) {
                var queueCreateInfo = VkDeviceQueueCreateInfo.allocate(arena)
                        .queueCount(1)
                        .queueFamilyIndex(indices.graphicsFamily())
                        .pQueuePriorities(pQueuePriorities);
                deviceCreateInfo.queueCreateInfoCount(1).pQueueCreateInfos(queueCreateInfo);
            }
            else {
                var queueCreateInfos = VkDeviceQueueCreateInfo.allocate(arena, 2);
                queueCreateInfos.at(0)
                        .queueCount(1)
                        .queueFamilyIndex(indices.graphicsFamily())
                        .pQueuePriorities(pQueuePriorities);
                queueCreateInfos.at(1)
                        .queueCount(1)
                        .queueFamilyIndex(indices.presentFamily())
                        .pQueuePriorities(pQueuePriorities);
                deviceCreateInfo.queueCreateInfoCount(2).pQueueCreateInfos(queueCreateInfos);
            }
            var deviceFeatures = VkPhysicalDeviceFeatures.allocate(arena);
            deviceFeatures.samplerAnisotropy(VkConstants.TRUE);
            deviceFeatures.sampleRateShading(VkConstants.TRUE);
            deviceCreateInfo.pEnabledFeatures(deviceFeatures);

            if (ENABLE_VALIDATION_LAYERS) {
                deviceCreateInfo.enabledLayerCount(1)
                        .ppEnabledLayerNames(PointerPtr.allocateV(arena, BytePtr.allocateString(arena, VALIDATION_LAYER_NAME)));
            }

            deviceCreateInfo.enabledExtensionCount(1);
            var ppEnabledExtensionNames = PointerPtr.allocate(arena);
            ppEnabledExtensionNames.write(BytePtr.allocateString(arena, VkConstants.KHR_SWAPCHAIN_EXTENSION_NAME));
            deviceCreateInfo.ppEnabledExtensionNames(ppEnabledExtensionNames);

            var pDevice = VkDevice.Ptr.allocate(arena);
            var result = instanceCommands.createDevice(physicalDevice, deviceCreateInfo, null, pDevice);
            if (result != VkResult.SUCCESS) {
                throw new RuntimeException("Failed to create logical device, vulkan error code: " + VkResult.explain(result));
            }
            device = Objects.requireNonNull(pDevice.read());
            deviceCommands = VulkanLoader.loadDeviceCommands(device, staticCommands);

            var pQueue = VkQueue.Ptr.allocate(arena);
            deviceCommands.getDeviceQueue(device, indices.graphicsFamily(), 0, pQueue);
            graphicsQueue = Objects.requireNonNull(pQueue.read());

            deviceCommands.getDeviceQueue(device, indices.presentFamily(), 0, pQueue);
            presentQueue = Objects.requireNonNull(pQueue.read());
        }
    }

    private void createSwapchain() {
        try (var arena = Arena.ofConfined()) {
            var swapChainSupport = querySwapChainSupport(physicalDevice, arena);

            var surfaceFormat = chooseSwapSurfaceFormat(swapChainSupport.formats());
            var presentMode = chooseSwapPresentMode(swapChainSupport.presentModes());
            var extent = chooseSwapExtent(swapChainSupport.capabilities(), arena);

            var imageCount = swapChainSupport.capabilities.minImageCount() + 1;
            if (swapChainSupport.capabilities.maxImageCount() > 0
                && imageCount > swapChainSupport.capabilities.maxImageCount()) {
                imageCount = swapChainSupport.capabilities.maxImageCount();
            }

            var createInfo = VkSwapchainCreateInfoKHR.allocate(arena)
                    .surface(surface)
                    .minImageCount(imageCount)
                    .imageFormat(surfaceFormat.format())
                    .imageColorSpace(surfaceFormat.colorSpace())
                    .imageExtent(extent)
                    .imageArrayLayers(1)
                    .imageUsage(VkImageUsageFlags.COLOR_ATTACHMENT);
            var indices = findQueueFamilies(physicalDevice);
            assert indices != null : "Queue family indices should not be null";
            if (indices.graphicsFamily != indices.presentFamily) {
                var pQueueFamilyIndices = IntPtr.allocateV(arena, indices.graphicsFamily(), indices.presentFamily());
                createInfo.imageSharingMode(VkSharingMode.CONCURRENT)
                        .queueFamilyIndexCount(2)
                        .pQueueFamilyIndices(pQueueFamilyIndices);
            }
            else {
                createInfo.imageSharingMode(VkSharingMode.EXCLUSIVE);
            }

            createInfo.preTransform(swapChainSupport.capabilities.currentTransform())
                    .compositeAlpha(VkCompositeAlphaFlagsKHR.OPAQUE)
                    .presentMode(presentMode)
                    .clipped(VkConstants.TRUE)
                    .oldSwapchain(null);

            var pSwapChain = VkSwapchainKHR.Ptr.allocate(arena);
            var result = deviceCommands.createSwapchainKHR(device, createInfo, null, pSwapChain);
            if (result != VkResult.SUCCESS) {
                throw new RuntimeException("Failed to create swap chain, vulkan error code: " + VkResult.explain(result));
            }
            swapChain = Objects.requireNonNull(pSwapChain.read());

            var pImageCount = IntPtr.allocate(arena);
            result = deviceCommands.getSwapchainImagesKHR(device, swapChain, pImageCount, null);
            if (result != VkResult.SUCCESS) {
                throw new RuntimeException("Failed to get swap chain images, vulkan error code: " + VkResult.explain(result));
            }
            assert pImageCount.read() == imageCount : "Image count mismatch";

            swapChainImages = VkImage.Ptr.allocate(Arena.ofAuto(), imageCount);
            result = deviceCommands.getSwapchainImagesKHR(device, swapChain, pImageCount, swapChainImages);
            if (result != VkResult.SUCCESS) {
                throw new RuntimeException("Failed to get swap chain images, vulkan error code: " + VkResult.explain(result));
            }

            swapChainImageFormat = surfaceFormat.format();
            swapChainExtent = VkExtent2D.clone(Arena.ofAuto(), extent);
        }
    }

    private void createImageViews() {
        swapChainImageViews = VkImageView.Ptr.allocate(Arena.ofAuto(), swapChainImages.size());
        for (long i = 0; i < swapChainImages.size(); i++) {
            swapChainImageViews.write(i, createImageView(
                    swapChainImages.read(i),
                    swapChainImageFormat,
                    VkImageAspectFlags.COLOR,
                    1
            ));
        }
    }

    private void createRenderPass() {
        try (var arena = Arena.ofConfined()) {
            var attachments = VkAttachmentDescription.allocate(arena, 3);
            var colorAttachment = attachments.at(0);
            colorAttachment.format(swapChainImageFormat);
            colorAttachment.samples(msaaSamples);

            colorAttachment.loadOp(VkAttachmentLoadOp.CLEAR);
            colorAttachment.storeOp(VkAttachmentStoreOp.STORE);
            colorAttachment.stencilLoadOp(VkAttachmentLoadOp.DONT_CARE);
            colorAttachment.stencilStoreOp(VkAttachmentStoreOp.DONT_CARE);

            colorAttachment.initialLayout(VkImageLayout.UNDEFINED);
            colorAttachment.finalLayout(VkImageLayout.COLOR_ATTACHMENT_OPTIMAL);

            var depthAttachment = attachments.at(1);
            depthAttachment.format(findDepthFormat());
            depthAttachment.samples(msaaSamples);
            depthAttachment.loadOp(VkAttachmentLoadOp.CLEAR);
            depthAttachment.storeOp(VkAttachmentStoreOp.DONT_CARE);
            depthAttachment.stencilLoadOp(VkAttachmentLoadOp.DONT_CARE);
            depthAttachment.stencilStoreOp(VkAttachmentStoreOp.DONT_CARE);
            depthAttachment.initialLayout(VkImageLayout.UNDEFINED);
            depthAttachment.finalLayout(VkImageLayout.DEPTH_STENCIL_ATTACHMENT_OPTIMAL);

            var colorAttachmentResolve = attachments.at(2);
            colorAttachmentResolve.format(swapChainImageFormat);
            colorAttachmentResolve.samples(VkSampleCountFlags._1);
            colorAttachmentResolve.loadOp(VkAttachmentLoadOp.DONT_CARE);
            colorAttachmentResolve.storeOp(VkAttachmentStoreOp.STORE);
            colorAttachmentResolve.stencilLoadOp(VkAttachmentLoadOp.DONT_CARE);
            colorAttachmentResolve.stencilStoreOp(VkAttachmentStoreOp.DONT_CARE);
            colorAttachmentResolve.initialLayout(VkImageLayout.UNDEFINED);
            colorAttachmentResolve.finalLayout(VkImageLayout.PRESENT_SRC_KHR);

            var colorAttachmentRef = VkAttachmentReference.allocate(arena);
            colorAttachmentRef.attachment(0);
            colorAttachmentRef.layout(VkImageLayout.COLOR_ATTACHMENT_OPTIMAL);

            var depthAttachmentRef = VkAttachmentReference.allocate(arena);
            depthAttachmentRef.attachment(1);
            depthAttachmentRef.layout(VkImageLayout.DEPTH_STENCIL_ATTACHMENT_OPTIMAL);

            var colorAttachmentResolveRef = VkAttachmentReference.allocate(arena);
            colorAttachmentResolveRef.attachment(2);
            colorAttachmentResolveRef.layout(VkImageLayout.COLOR_ATTACHMENT_OPTIMAL);

            var subpass = VkSubpassDescription.allocate(arena);
            subpass.pipelineBindPoint(VkPipelineBindPoint.GRAPHICS);
            subpass.colorAttachmentCount(1);
            subpass.pColorAttachments(colorAttachmentRef);
            subpass.pDepthStencilAttachment(depthAttachmentRef);
            subpass.pResolveAttachments(colorAttachmentResolveRef);

            var dependency = VkSubpassDependency.allocate(arena);
            dependency.srcSubpass(VkConstants.SUBPASS_EXTERNAL);
            dependency.dstSubpass(0);
            dependency.srcStageMask(VkPipelineStageFlags.COLOR_ATTACHMENT_OUTPUT
                                    | VkPipelineStageFlags.EARLY_FRAGMENT_TESTS);
            dependency.srcAccessMask(0);
            dependency.dstStageMask(VkPipelineStageFlags.COLOR_ATTACHMENT_OUTPUT
                                    | VkPipelineStageFlags.EARLY_FRAGMENT_TESTS);
            dependency.dstAccessMask(VkAccessFlags.COLOR_ATTACHMENT_WRITE
                                     | VkAccessFlags.DEPTH_STENCIL_ATTACHMENT_WRITE);

            var renderPassInfo = VkRenderPassCreateInfo.allocate(arena);
            renderPassInfo.attachmentCount(3);
            renderPassInfo.pAttachments(attachments);
            renderPassInfo.subpassCount(1);
            renderPassInfo.pSubpasses(subpass);

            renderPassInfo.dependencyCount(1);
            renderPassInfo.pDependencies(dependency);

            var pRenderPass = VkRenderPass.Ptr.allocate(arena);
            var result = deviceCommands.createRenderPass(device, renderPassInfo, null, pRenderPass);
            if (result != VkResult.SUCCESS) {
                throw new RuntimeException("Failed to create render pass, vulkan error code: " + VkResult.explain(result));
            }
            renderPass = Objects.requireNonNull(pRenderPass.read());
        }
    }

    private void createDescriptorSetLayout() {
        try (var arena = Arena.ofConfined()) {
            var bindings = VkDescriptorSetLayoutBinding.allocate(arena, 2);
            var uboLayoutBinding = bindings.at(0);
            uboLayoutBinding.binding(0);
            uboLayoutBinding.descriptorType(VkDescriptorType.UNIFORM_BUFFER);
            uboLayoutBinding.descriptorCount(1);
            uboLayoutBinding.stageFlags(VkShaderStageFlags.VERTEX);
            var samplerLayoutBinding = bindings.at(1);
            samplerLayoutBinding.binding(1);
            samplerLayoutBinding.descriptorCount(1);
            samplerLayoutBinding.descriptorType(VkDescriptorType.COMBINED_IMAGE_SAMPLER);
            samplerLayoutBinding.stageFlags(VkShaderStageFlags.FRAGMENT);

            var layoutInfo = VkDescriptorSetLayoutCreateInfo.allocate(arena);
            layoutInfo.bindingCount(2);
            layoutInfo.pBindings(bindings);

            var pDescriptorSetLayout = VkDescriptorSetLayout.Ptr.allocate(arena);
            var result = deviceCommands.createDescriptorSetLayout(device, layoutInfo, null, pDescriptorSetLayout);
            if (result != VkResult.SUCCESS) {
                throw new RuntimeException("Failed to create descriptor set layout, vulkan error code: " + VkResult.explain(result));
            }
            descriptorSetLayout = Objects.requireNonNull(pDescriptorSetLayout.read());
        }
    }

    private void createGraphicsPipeline() {
        try (var arena = Arena.ofConfined()) {
            var vertShaderCode = readShaderFile("/shader/ch27.vert.spv", arena);
            var fragShaderCode = readShaderFile("/shader/ch26.frag.spv", arena);
            var vertexShaderModule = createShaderModule(vertShaderCode);
            var fragmentShaderModule = createShaderModule(fragShaderCode);

            var shaderStages = VkPipelineShaderStageCreateInfo.allocate(arena, 2);
            shaderStages.at(0)
                    .stage(VkShaderStageFlags.VERTEX)
                    .module(vertexShaderModule)
                    .pName(BytePtr.allocateString(arena, "main"));
            shaderStages.at(1)
                    .stage(VkShaderStageFlags.FRAGMENT)
                    .module(fragmentShaderModule)
                    .pName(BytePtr.allocateString(arena, "main"));

            var dynamicStates = IntPtr.allocateV(arena, VkDynamicState.VIEWPORT, VkDynamicState.SCISSOR);

            var dynamicStateInfo = VkPipelineDynamicStateCreateInfo.allocate(arena)
                    .dynamicStateCount((int) dynamicStates.size())
                    .pDynamicStates(dynamicStates);

            var vertexInputInfo = VkPipelineVertexInputStateCreateInfo.allocate(arena);
            var bindingDescription = getBindingDescription(arena);
            var attributeDescription = getAttributeDescriptions(arena);
            vertexInputInfo.vertexBindingDescriptionCount(1);
            vertexInputInfo.pVertexBindingDescriptions(bindingDescription);
            vertexInputInfo.vertexAttributeDescriptionCount((int) attributeDescription.size());
            vertexInputInfo.pVertexAttributeDescriptions(attributeDescription);

            var inputAssembly = VkPipelineInputAssemblyStateCreateInfo.allocate(arena);
            inputAssembly.topology(VkPrimitiveTopology.TRIANGLE_LIST);
            inputAssembly.primitiveRestartEnable(VkConstants.FALSE);

            var viewportStateInfo = VkPipelineViewportStateCreateInfo.allocate(arena);
            viewportStateInfo.viewportCount(1);
            viewportStateInfo.scissorCount(1);

            var rasterizer = VkPipelineRasterizationStateCreateInfo.allocate(arena);
            rasterizer.depthClampEnable(VkConstants.FALSE);
            rasterizer.rasterizerDiscardEnable(VkConstants.FALSE);
            rasterizer.polygonMode(VkPolygonMode.FILL);
            rasterizer.lineWidth(1.0f);
            rasterizer.cullMode(VkCullModeFlags.BACK);
            rasterizer.frontFace(VkFrontFace.COUNTER_CLOCKWISE);
            rasterizer.depthBiasEnable(VkConstants.FALSE);

            var multisampling = VkPipelineMultisampleStateCreateInfo.allocate(arena);
            multisampling.sampleShadingEnable(VkConstants.TRUE);
            multisampling.minSampleShading(0.2f);
            multisampling.rasterizationSamples(msaaSamples);

            var depthStencil = VkPipelineDepthStencilStateCreateInfo.allocate(arena);
            depthStencil.depthTestEnable(VkConstants.TRUE);
            depthStencil.depthWriteEnable(VkConstants.TRUE);
            depthStencil.depthCompareOp(VkCompareOp.LESS);
            depthStencil.depthBoundsTestEnable(VkConstants.FALSE);
            depthStencil.stencilTestEnable(VkConstants.FALSE);

            var colorBlendAttachment = VkPipelineColorBlendAttachmentState.allocate(arena)
                    .colorWriteMask(
                            VkColorComponentFlags.R
                            | VkColorComponentFlags.G
                            | VkColorComponentFlags.B
                            | VkColorComponentFlags.A
                    ).blendEnable(VkConstants.FALSE);

            var colorBlending = VkPipelineColorBlendStateCreateInfo.allocate(arena)
                    .logicOpEnable(VkConstants.FALSE)
                    .attachmentCount(1)
                    .pAttachments(colorBlendAttachment);

            var pipelineLayoutInfo = VkPipelineLayoutCreateInfo.allocate(arena);
            var pDescriptorSetLayout = VkDescriptorSetLayout.Ptr.allocate(arena);
            pDescriptorSetLayout.write(descriptorSetLayout);
            pipelineLayoutInfo.setLayoutCount(1);
            pipelineLayoutInfo.pSetLayouts(pDescriptorSetLayout);
            var pPipelineLayout = VkPipelineLayout.Ptr.allocate(arena);
            var result = deviceCommands.createPipelineLayout(device, pipelineLayoutInfo, null, pPipelineLayout);
            if (result != VkResult.SUCCESS) {
                throw new RuntimeException("Failed to create pipeline layout, vulkan error code: " + VkResult.explain(result));
            }
            pipelineLayout = Objects.requireNonNull(pPipelineLayout.read());

            var pipelineInfo = VkGraphicsPipelineCreateInfo.allocate(arena);
            pipelineInfo.stageCount(2);
            pipelineInfo.pStages(shaderStages);
            pipelineInfo.pVertexInputState(vertexInputInfo);
            pipelineInfo.pInputAssemblyState(inputAssembly);
            pipelineInfo.pViewportState(viewportStateInfo);
            pipelineInfo.pRasterizationState(rasterizer);
            pipelineInfo.pMultisampleState(multisampling);
            pipelineInfo.pDepthStencilState(depthStencil);
            pipelineInfo.pColorBlendState(colorBlending);
            pipelineInfo.pDynamicState(dynamicStateInfo);
            pipelineInfo.layout(pipelineLayout);
            pipelineInfo.renderPass(renderPass);
            pipelineInfo.subpass(0);

            var pGraphicsPipeline = VkPipeline.Ptr.allocate(arena);
            result = deviceCommands.createGraphicsPipelines(device, null, 1, pipelineInfo, null, pGraphicsPipeline);
            if (result != VkResult.SUCCESS) {
                throw new RuntimeException("Failed to create graphics pipeline, vulkan error code: " + VkResult.explain(result));
            }
            graphicsPipeline = Objects.requireNonNull(pGraphicsPipeline.read());

            deviceCommands.destroyShaderModule(device, vertexShaderModule, null);
            deviceCommands.destroyShaderModule(device, fragmentShaderModule, null);
        }
    }

    private void createFramebuffers() {
        swapChainFramebuffers = VkFramebuffer.Ptr.allocate(Arena.ofAuto(), swapChainImageViews.size());

        for (int i = 0; i < swapChainImageViews.size(); i++) {
            try (var arena = Arena.ofConfined()) {
                var pAttachments = VkImageView.Ptr.allocate(arena, 3);
                pAttachments.write(0, colorImageView);
                pAttachments.write(1, depthImageView);
                pAttachments.write(2, swapChainImageViews.read(i));

                var framebufferInfo = VkFramebufferCreateInfo.allocate(arena);
                framebufferInfo.renderPass(renderPass);
                framebufferInfo.attachmentCount(3);
                framebufferInfo.pAttachments(pAttachments);
                framebufferInfo.width(swapChainExtent.width());
                framebufferInfo.height(swapChainExtent.height());
                framebufferInfo.layers(1);

                var pFramebuffer = swapChainFramebuffers.offset(i);
                var result = deviceCommands.createFramebuffer(device, framebufferInfo, null, pFramebuffer);
                if (result != VkResult.SUCCESS) {
                    throw new RuntimeException("Failed to create framebuffer, vulkan error code: " + VkResult.explain(result));
                }
            }
        }
    }

    private void createCommandPool() {
        try (var arena = Arena.ofConfined()) {
            var queueFamilyIndices = findQueueFamilies(physicalDevice);
            assert queueFamilyIndices != null;

            var poolInfo = VkCommandPoolCreateInfo.allocate(arena)
                    .flags(VkCommandPoolCreateFlags.RESET_COMMAND_BUFFER)
                    .queueFamilyIndex(queueFamilyIndices.graphicsFamily());

            var pCommandPool = VkCommandPool.Ptr.allocate(arena);
            var result = deviceCommands.createCommandPool(device, poolInfo, null, pCommandPool);
            if (result != VkResult.SUCCESS) {
                throw new RuntimeException("Failed to create command pool, vulkan error code: " + VkResult.explain(result));
            }
            commandPool = Objects.requireNonNull(pCommandPool.read());
        }
    }

    private void createColorResources() {
        var colorFormat = swapChainImageFormat;

        var pair = createImage(
                swapChainExtent.width(),
                swapChainExtent.height(),
                1,
                msaaSamples,
                colorFormat,
                VkImageTiling.OPTIMAL,
                VkImageUsageFlags.TRANSIENT_ATTACHMENT | VkImageUsageFlags.COLOR_ATTACHMENT,
                VkMemoryPropertyFlags.DEVICE_LOCAL
        );
        colorImage = pair.first;
        colorImageMemory = pair.second;
        colorImageView = createImageView(colorImage, colorFormat, VkImageAspectFlags.COLOR, 1);
    }

    private void createDepthResources() {
        var depthFormat = findDepthFormat();
        var pair = createImage(
                swapChainExtent.width(),
                swapChainExtent.height(),
                1,
                msaaSamples,
                depthFormat,
                VkImageTiling.OPTIMAL,
                VkImageUsageFlags.DEPTH_STENCIL_ATTACHMENT,
                VkMemoryPropertyFlags.DEVICE_LOCAL
        );
        depthImage = pair.first;
        depthImageMemory = pair.second;
        depthImageView = createImageView(depthImage, depthFormat, VkImageAspectFlags.DEPTH, 1);

        transitionImageLayout(
                depthImage,
                depthFormat,
                VkImageLayout.UNDEFINED,
                VkImageLayout.DEPTH_STENCIL_ATTACHMENT_OPTIMAL,
                1
        );
    }

    private void loadModel() {
        try (var stream = Application.class.getResourceAsStream(MODEL_PATH)) {
            if (stream == null) {
                throw new RuntimeException("Failed to load model");
            }

            var obj = ObjReader.read(stream);
            obj = ObjUtils.convertToRenderable(obj);

            indices = ObjData.getFaceVertexIndicesArray(obj);
            var verticesArray = ObjData.getVerticesArray(obj);
            var texCoordsArray = ObjData.getTexCoordsArray(obj, 2);
            vertices = new float[obj.getNumVertices() * 8];
            for (int i = 0; i < obj.getNumVertices(); i++) {
                // vec3 pos
                vertices[i * 8] = verticesArray[i * 3];
                vertices[i * 8 + 1] = verticesArray[i * 3 + 1];
                vertices[i * 8 + 2] = verticesArray[i * 3 + 2];
                // vec3 color
                vertices[i * 8 + 3] = 1.0f;
                vertices[i * 8 + 4] = 1.0f;
                vertices[i * 8 + 5] = 1.0f;
                // vec2 texCoord
                vertices[i * 8 + 6] = texCoordsArray[i * 2];
                vertices[i * 8 + 7] = 1.0f - texCoordsArray[i * 2 + 1];
            }
        }
        catch (IOException e) {
            throw new RuntimeException("Failed to load model", e);
        }
    }

    private void createVertexBuffer() {
        try (var arena = Arena.ofConfined()) {
            var bufferSize = vertices.length * Float.BYTES;

            var pair = createBuffer(
                    bufferSize,
                    VkBufferUsageFlags.TRANSFER_SRC,
                    VkMemoryPropertyFlags.HOST_VISIBLE | VkMemoryPropertyFlags.HOST_COHERENT
            );
            var stagingBuffer = pair.first;
            var stagingBufferMemory = pair.second;

            var ppData = PointerPtr.allocate(arena);
            var result = deviceCommands.mapMemory(device, stagingBufferMemory, 0, bufferSize, 0, ppData);
            if (result != VkResult.SUCCESS) {
                throw new RuntimeException("Failed to map vertex buffer memory, vulkan error code: " + VkResult.explain(result));
            }
            var pData = ppData.read().reinterpret(bufferSize);
            pData.copyFrom(MemorySegment.ofArray(vertices));
            deviceCommands.unmapMemory(device, stagingBufferMemory);

            pair = createBuffer(
                    bufferSize,
                    VkBufferUsageFlags.TRANSFER_DST | VkBufferUsageFlags.VERTEX_BUFFER,
                    VkMemoryPropertyFlags.DEVICE_LOCAL
            );
            vertexBuffer = pair.first;
            vertexBufferMemory = pair.second;

            copyBuffer(stagingBuffer, vertexBuffer, bufferSize);
            deviceCommands.destroyBuffer(device, stagingBuffer, null);
            deviceCommands.freeMemory(device, stagingBufferMemory, null);
        }
    }

    private void createIndexBuffer() {
        try (var arena = Arena.ofConfined()) {
            var bufferSize = indices.length * Integer.BYTES;

            var pair = createBuffer(
                    bufferSize,
                    VkBufferUsageFlags.TRANSFER_SRC,
                    VkMemoryPropertyFlags.HOST_VISIBLE | VkMemoryPropertyFlags.HOST_COHERENT
            );
            var stagingBuffer = pair.first;
            var stagingBufferMemory = pair.second;

            var ppData = PointerPtr.allocate(arena);
            var result = deviceCommands.mapMemory(device, stagingBufferMemory, 0, bufferSize, 0, ppData);
            if (result != VkResult.SUCCESS) {
                throw new RuntimeException("Failed to map index buffer memory, vulkan error code: " + VkResult.explain(result));
            }
            var pData = ppData.read().reinterpret(bufferSize);

            pData.copyFrom(MemorySegment.ofArray(indices));

            deviceCommands.unmapMemory(device, stagingBufferMemory);

            pair = createBuffer(
                    bufferSize,
                    VkBufferUsageFlags.TRANSFER_DST | VkBufferUsageFlags.INDEX_BUFFER,
                    VkMemoryPropertyFlags.DEVICE_LOCAL
            );
            indexBuffer = pair.first;
            indexBufferMemory = pair.second;

            copyBuffer(stagingBuffer, indexBuffer, bufferSize);

            deviceCommands.destroyBuffer(device, stagingBuffer, null);
            deviceCommands.freeMemory(device, stagingBufferMemory, null);
        }
    }

    private void createUniformBuffers() {
        var bufferSize = UniformBufferObject.bufferSize();
        uniformBuffers = VkBuffer.Ptr.allocate(Arena.ofAuto(), MAX_FRAMES_IN_FLIGHT);
        uniformBuffersMemory = VkDeviceMemory.Ptr.allocate(Arena.ofAuto(), MAX_FRAMES_IN_FLIGHT);
        uniformBuffersMapped = new FloatPtr[MAX_FRAMES_IN_FLIGHT];

        try (var arena = Arena.ofConfined()) {
            var pMappedMemory = PointerPtr.allocate(arena);

            for (int i = 0; i < MAX_FRAMES_IN_FLIGHT; i++) {
                var pair = createBuffer(
                        bufferSize * Float.BYTES,
                        VkBufferUsageFlags.UNIFORM_BUFFER,
                        VkMemoryPropertyFlags.HOST_VISIBLE | VkMemoryPropertyFlags.HOST_COHERENT
                );
                uniformBuffers.write(i, pair.first);
                uniformBuffersMemory.write(i, pair.second);

                var result = deviceCommands.mapMemory(
                        device,
                        uniformBuffersMemory.read(i),
                        0,
                        (long) bufferSize * Float.BYTES,
                        0,
                        pMappedMemory
                );
                if (result != VkResult.SUCCESS) {
                    throw new RuntimeException("Failed to map uniform buffer memory, vulkan error code: " + VkResult.explain(result));
                }

                uniformBuffersMapped[i] = new FloatPtr(pMappedMemory.read()).reinterpret(bufferSize);
            }
        }
    }

    private void createDescriptorPool() {
        try (var arena = Arena.ofConfined()) {
            var poolSizes = VkDescriptorPoolSize.allocate(arena, 2);
            poolSizes.at(0).type(VkDescriptorType.UNIFORM_BUFFER);
            poolSizes.at(0).descriptorCount(MAX_FRAMES_IN_FLIGHT);
            poolSizes.at(1).type(VkDescriptorType.COMBINED_IMAGE_SAMPLER);
            poolSizes.at(1).descriptorCount(MAX_FRAMES_IN_FLIGHT);

            var poolInfo = VkDescriptorPoolCreateInfo.allocate(arena);
            poolInfo.poolSizeCount(2);
            poolInfo.pPoolSizes(poolSizes);
            poolInfo.maxSets(MAX_FRAMES_IN_FLIGHT);

            var pDescriptorPool = VkDescriptorPool.Ptr.allocate(arena);
            var result = deviceCommands.createDescriptorPool(device, poolInfo, null, pDescriptorPool);
            if (result != VkResult.SUCCESS) {
                throw new RuntimeException("Failed to create descriptor pool, vulkan error code: " + VkResult.explain(result));
            }
            descriptorPool = Objects.requireNonNull(pDescriptorPool.read());
        }
    }

    private void createDescriptorSets() {
        descriptorSets = VkDescriptorSet.Ptr.allocate(Arena.ofAuto(), MAX_FRAMES_IN_FLIGHT);

        try (Arena arena = Arena.ofConfined()) {
            var pLayouts = VkDescriptorSetLayout.Ptr.allocate(arena, MAX_FRAMES_IN_FLIGHT);
            pLayouts.write(0, descriptorSetLayout);
            pLayouts.write(1, descriptorSetLayout);

            var allocInfo = VkDescriptorSetAllocateInfo.allocate(arena);
            allocInfo.descriptorPool(descriptorPool);
            allocInfo.descriptorSetCount(MAX_FRAMES_IN_FLIGHT);
            allocInfo.pSetLayouts(pLayouts);

            var result = deviceCommands.allocateDescriptorSets(device, allocInfo, descriptorSets);
            if (result != VkResult.SUCCESS) {
                throw new RuntimeException("Failed to allocate descriptor sets, vulkan error code: " + VkResult.explain(result));
            }

            for (int i = 0; i < MAX_FRAMES_IN_FLIGHT; i++){
                var bufferInfo = VkDescriptorBufferInfo.allocate(arena);
                bufferInfo.buffer(uniformBuffers.read(i));
                bufferInfo.offset(0);
                bufferInfo.range((long) UniformBufferObject.bufferSize() * Float.BYTES);

                var imageInfo = VkDescriptorImageInfo.allocate(arena);
                imageInfo.imageLayout(VkImageLayout.SHADER_READ_ONLY_OPTIMAL);
                imageInfo.imageView(textureImageView);
                imageInfo.sampler(textureSampler);

                var descriptorWrite = VkWriteDescriptorSet.allocate(arena, 2);
                var descriptorWrite0 = descriptorWrite.at(0);
                descriptorWrite0.dstSet(descriptorSets.read(i));
                descriptorWrite0.dstBinding(0);
                descriptorWrite0.dstArrayElement(0);
                descriptorWrite0.descriptorType(VkDescriptorType.UNIFORM_BUFFER);
                descriptorWrite0.descriptorCount(1);
                descriptorWrite0.pBufferInfo(bufferInfo);

                var descriptorWrite1 = descriptorWrite.at(1);
                descriptorWrite1.dstSet(descriptorSets.read(i));
                descriptorWrite1.dstBinding(1);
                descriptorWrite1.dstArrayElement(0);
                descriptorWrite1.descriptorType(VkDescriptorType.COMBINED_IMAGE_SAMPLER);
                descriptorWrite1.descriptorCount(1);
                descriptorWrite1.pImageInfo(imageInfo);

                deviceCommands.updateDescriptorSets(device, 2, descriptorWrite, 0, null);
            }
        }
    }

    private void createCommandBuffers() {
        pCommandBuffers = VkCommandBuffer.Ptr.allocate(Arena.ofAuto(), MAX_FRAMES_IN_FLIGHT);

        try (var arena = Arena.ofConfined()) {
            var allocInfo = VkCommandBufferAllocateInfo.allocate(arena)
                    .commandPool(commandPool)
                    .level(VkCommandBufferLevel.PRIMARY)
                    .commandBufferCount(1);

            for (int i = 0; i < MAX_FRAMES_IN_FLIGHT; i++) {
                var pCommandBuffer = pCommandBuffers.offset(i);
                var result = deviceCommands.allocateCommandBuffers(device, allocInfo, pCommandBuffer);
                if (result != VkResult.SUCCESS) {
                    throw new RuntimeException("Failed to allocate command buffer, vulkan error code: " + VkResult.explain(result));
                }
            }
        }
    }

    private void createTextureImage() {
        BufferedImage image;
        try (var stream = Application.class.getResourceAsStream(TEXTURE_PATH)) {
            if (stream == null) {
                throw new RuntimeException("Failed to load texture image");
            }
            image = ImageIO.read(stream);
        }
        catch (IOException e) {
            throw new RuntimeException("Failed to load texture image", e);
        }

        var width = image.getWidth();
        var height = image.getHeight();
        var imageSize = width * height;
        var imageSizeBytes = imageSize * 4;
        textureMipLevels = (int) Math.floor(Math.log(Math.max(width, height)) / Math.log(2)) + 1;

        var pair = createBuffer(
                imageSizeBytes,
                VkBufferUsageFlags.TRANSFER_SRC,
                VkMemoryPropertyFlags.HOST_VISIBLE | VkMemoryPropertyFlags.HOST_COHERENT
        );
        var stagingBuffer = pair.first;
        var stagingBufferMemory = pair.second;

        try (Arena arena = Arena.ofConfined()) {
            var ppData = PointerPtr.allocate(arena);
            var result = deviceCommands.mapMemory(device, stagingBufferMemory, 0, imageSizeBytes, 0, ppData);
            if (result != VkResult.SUCCESS) {
                throw new RuntimeException("Failed to map texture image memory, vulkan error code: " + VkResult.explain(result));
            }
            var buffer = new BytePtr(ppData.read().reinterpret(imageSizeBytes));
            for (int y = 0; y < height; y++) {
                for (int x = 0; x < width; x++) {
                    var color = new Color(image.getRGB(x, y), true);
                    var linearIndex = y * width + x;
                    buffer.write(linearIndex * 4L, (byte) color.getRed());
                    buffer.write(linearIndex * 4L + 1, (byte) color.getGreen());
                    buffer.write(linearIndex * 4L + 2, (byte) color.getBlue());
                    buffer.write(linearIndex * 4L + 3, (byte) color.getAlpha());
                }
            }
            deviceCommands.unmapMemory(device, stagingBufferMemory);

            var pair2 = createImage(
                    width,
                    height,
                    textureMipLevels,
                    VkSampleCountFlags._1,
                    VkFormat.R8G8B8A8_SRGB,
                    VkImageTiling.OPTIMAL,
                    VkImageUsageFlags.TRANSFER_DST
                    | VkImageUsageFlags.SAMPLED
                    | VkImageUsageFlags.TRANSFER_SRC,
                    VkMemoryPropertyFlags.DEVICE_LOCAL
            );
            textureImage = pair2.first;
            textureImageMemory = pair2.second;

            transitionImageLayout(
                    textureImage,
                    VkFormat.R8G8B8A8_SRGB,
                    VkImageLayout.UNDEFINED,
                    VkImageLayout.TRANSFER_DST_OPTIMAL,
                    textureMipLevels
            );
            copyBufferToImage(stagingBuffer, textureImage, width, height);
            generateMipmaps(textureImage, VkFormat.R8G8B8A8_SRGB, width, height, textureMipLevels);

            deviceCommands.destroyBuffer(device, stagingBuffer, null);
            deviceCommands.freeMemory(device, stagingBufferMemory, null);
        }
    }

    private void createTextureImageView() {
        textureImageView = createImageView(
                textureImage,
                VkFormat.R8G8B8A8_SRGB,
                VkImageAspectFlags.COLOR,
                textureMipLevels
        );
    }

    private void createTextureSampler() {
        try (var arena = Arena.ofConfined()) {
            var properties = VkPhysicalDeviceProperties.allocate(arena);
            instanceCommands.getPhysicalDeviceProperties(physicalDevice, properties);

            var samplerInfo = VkSamplerCreateInfo.allocate(arena);
            samplerInfo.magFilter(VkFilter.LINEAR);
            samplerInfo.minFilter(VkFilter.LINEAR);
            samplerInfo.addressModeU(VkSamplerAddressMode.REPEAT);
            samplerInfo.addressModeV(VkSamplerAddressMode.REPEAT);
            samplerInfo.addressModeW(VkSamplerAddressMode.REPEAT);
            samplerInfo.anisotropyEnable(VkConstants.TRUE);
            samplerInfo.maxAnisotropy(properties.limits().maxSamplerAnisotropy());
            samplerInfo.borderColor(VkBorderColor.INT_OPAQUE_BLACK);
            samplerInfo.unnormalizedCoordinates(VkConstants.FALSE);
            samplerInfo.compareEnable(VkConstants.FALSE);
            samplerInfo.compareOp(VkCompareOp.ALWAYS);
            samplerInfo.mipmapMode(VkSamplerMipmapMode.LINEAR);
            samplerInfo.mipLodBias(0.0f);
            samplerInfo.minLod(0.0f);
            samplerInfo.maxLod(0.0f);

            var pSampler = VkSampler.Ptr.allocate(arena);
            var result = deviceCommands.createSampler(device, samplerInfo, null, pSampler);
            if (result != VkResult.SUCCESS) {
                throw new RuntimeException("Failed to create texture sampler, vulkan error code: " + VkResult.explain(result));
            }
            textureSampler = Objects.requireNonNull(pSampler.read());
        }
    }

    private void createSyncObjects() {
        pImageAvailableSemaphores = VkSemaphore.Ptr.allocate(Arena.ofAuto(), MAX_FRAMES_IN_FLIGHT);
        pInFlightFences = VkFence.Ptr.allocate(Arena.ofAuto(), MAX_FRAMES_IN_FLIGHT);

        try (var arena = Arena.ofConfined()) {
            var semaphoreInfo = VkSemaphoreCreateInfo.allocate(arena);
            var fenceCreateInfo = VkFenceCreateInfo.allocate(arena);
            fenceCreateInfo.flags(VkFenceCreateFlags.SIGNALED);

            for (int i = 0; i < MAX_FRAMES_IN_FLIGHT; i++) {
                var pImageAvailableSemaphore = pImageAvailableSemaphores.offset(i);
                var pInFlightFence = pInFlightFences.offset(i);

                if (deviceCommands.createSemaphore(device, semaphoreInfo, null, pImageAvailableSemaphore) != VkResult.SUCCESS
                    || deviceCommands.createFence(device, fenceCreateInfo, null, pInFlightFence) != VkResult.SUCCESS) {
                    throw new RuntimeException("Failed to create synchronization objects for a frame");
                }
            }
        }

        createSwapchainSyncObjects();
    }

    private void drawFrame() {
        var pInFlightFence = pInFlightFences.offset(currentFrame);
        var pImageAvailableSemaphore = pImageAvailableSemaphores.offset(currentFrame);
        var inFlightFence = pInFlightFence.read();
        var imageAvailableSemaphore = pImageAvailableSemaphore.read();
        var commandBuffer = pCommandBuffers.read(currentFrame);

        try (var arena = Arena.ofConfined()) {
            deviceCommands.waitForFences(device, 1, pInFlightFence, VkConstants.TRUE, NativeLayout.UINT64_MAX);
            deviceCommands.resetFences(device, 1, pInFlightFence);

            var pImageIndex = IntPtr.allocate(arena);
            var result = deviceCommands.acquireNextImageKHR(
                    device,
                    swapChain,
                    NativeLayout.UINT64_MAX,
                    imageAvailableSemaphore,
                    null,
                    pImageIndex
            );
            if (result == VkResult.ERROR_OUT_OF_DATE_KHR) {
                recreateSwapchain();
                return;
            } else if (result != VkResult.SUCCESS && result != VkResult.SUBOPTIMAL_KHR) {
                throw new RuntimeException("Failed to acquire swap chain image, vulkan error code: " + VkResult.explain(result));
            }
            deviceCommands.resetFences(device, 1, pInFlightFence);

            var imageIndex = pImageIndex.read();

            var pRenderFinishedSemaphore = pRenderFinishedSemaphores.offset(imageIndex);

            deviceCommands.resetCommandBuffer(commandBuffer, 0);
            recordCommandBuffer(commandBuffer, imageIndex);
            updateUniformBuffer();

            var submitInfo = VkSubmitInfo.allocate(arena)
                    .waitSemaphoreCount(1)
                    .pWaitSemaphores(pImageAvailableSemaphore)
                    .pWaitDstStageMask(IntPtr.allocateV(arena, VkPipelineStageFlags.COLOR_ATTACHMENT_OUTPUT))
                    .commandBufferCount(1)
                    .pCommandBuffers(VkCommandBuffer.Ptr.allocateV(arena, commandBuffer))
                    .signalSemaphoreCount(1)
                    .pSignalSemaphores(pRenderFinishedSemaphore);

            result = deviceCommands.queueSubmit(graphicsQueue, 1, submitInfo, inFlightFence);
            if (result != VkResult.SUCCESS) {
                throw new RuntimeException("Failed to submit draw command buffer, vulkan error code: " + VkResult.explain(result));
            }

            var presentInfo = VkPresentInfoKHR.allocate(arena)
                    .waitSemaphoreCount(1)
                    .pWaitSemaphores(pRenderFinishedSemaphore)
                    .swapchainCount(1)
                    .pSwapchains(VkSwapchainKHR.Ptr.allocateV(arena, swapChain))
                    .pImageIndices(pImageIndex)
                    .pResults(null);

            result = deviceCommands.queuePresentKHR(presentQueue, presentInfo);
            if (result == VkResult.ERROR_OUT_OF_DATE_KHR || framebufferResized) {
                framebufferResized = false;
                recreateSwapchain();
            }
            else if (result != VkResult.SUCCESS && result != VkResult.SUBOPTIMAL_KHR) {
                throw new RuntimeException("Failed to submit draw command buffer, vulkan error code: " + VkResult.explain(result));
            }
        }

        currentFrame = (currentFrame + 1) % MAX_FRAMES_IN_FLIGHT;
    }

    private void recordCommandBuffer(VkCommandBuffer commandBuffer, int imageIndex) {
        try (var arena = Arena.ofConfined()) {
            var beginInfo = VkCommandBufferBeginInfo.allocate(arena);

            var result = deviceCommands.beginCommandBuffer(commandBuffer, beginInfo);
            if (result != VkResult.SUCCESS) {
                throw new RuntimeException("Failed to begin recording command buffer, vulkan error code: " + VkResult.explain(result));
            }

            var renderPassInfo = VkRenderPassBeginInfo.allocate(arena);
            renderPassInfo.renderPass(renderPass);
            renderPassInfo.framebuffer(swapChainFramebuffers.read(imageIndex));
            renderPassInfo.renderArea().offset().x(0);
            renderPassInfo.renderArea().offset().y(0);
            renderPassInfo.renderArea().extent(swapChainExtent);
            renderPassInfo.clearValueCount(2);
            var pClearValue = VkClearValue.allocate(arena, 2);
            var colorClearValue = pClearValue.at(0);
            colorClearValue.color().float32().write(0, 0.0f);
            colorClearValue.color().float32().write(1, 0.0f);
            colorClearValue.color().float32().write(2, 0.0f);
            colorClearValue.color().float32().write(3, 1.0f);
            var depthClearValue = pClearValue.at(1);
            depthClearValue.depthStencil().depth(1.0f);
            depthClearValue.depthStencil().stencil(0);
            renderPassInfo.pClearValues(pClearValue);

            deviceCommands.cmdBeginRenderPass(commandBuffer, renderPassInfo, VkSubpassContents.INLINE);
            deviceCommands.cmdBindPipeline(commandBuffer, VkPipelineBindPoint.GRAPHICS, graphicsPipeline);

            var viewport = VkViewport.allocate(arena)
                    .x(0.0f)
                    .y(0.0f)
                    .width(swapChainExtent.width())
                    .height(swapChainExtent.height())
                    .minDepth(0.0f)
                    .maxDepth(1.0f);
            deviceCommands.cmdSetViewport(commandBuffer, 0, 1, viewport);

            var scissor = VkRect2D.allocate(arena);
            scissor.offset().x(0);
            scissor.offset().y(0);
            scissor.extent(swapChainExtent);
            deviceCommands.cmdSetScissor(commandBuffer, 0, 1, scissor);

            var vertexBuffers = VkBuffer.Ptr.allocate(arena);
            vertexBuffers.write(vertexBuffer);
            var offsets = LongPtr.allocate(arena);
            offsets.write(0);
            deviceCommands.cmdBindVertexBuffers(commandBuffer, 0, 1, vertexBuffers, offsets);
            deviceCommands.cmdBindIndexBuffer(commandBuffer, indexBuffer, 0, VkIndexType.UINT32);

            var pDescriptorSet = descriptorSets.offset(currentFrame);
            deviceCommands.cmdBindDescriptorSets(
                    commandBuffer,
                    VkPipelineBindPoint.GRAPHICS,
                    pipelineLayout,
                    0,
                    1,
                    pDescriptorSet,
                    0,
                    null
            );

            deviceCommands.cmdDrawIndexed(commandBuffer, indices.length, 1, 0, 0, 0);

            deviceCommands.cmdEndRenderPass(commandBuffer);

            result = deviceCommands.endCommandBuffer(commandBuffer);
            if (result != VkResult.SUCCESS) {
                throw new RuntimeException("Failed to end recording command buffer, vulkan error code: " + VkResult.explain(result));
            }
        }
    }

    private void updateUniformBuffer() {
        var time = (System.currentTimeMillis() - startTime) / 1000.0f;
        var model = new Matrix4f().rotate((float) (Math.toRadians(90.0f) * time), 0.0f, 0.0f, 1.0f);
        var view = new Matrix4f().lookAt(
                2.0f, 2.0f, 2.0f,
                0.0f, 0.0f, 0.0f,
                0.0f, 0.0f, 1.0f
        );
        var proj = new Matrix4f().perspective(
                (float) Math.toRadians(45.0f),
                swapChainExtent.width() / (float) swapChainExtent.height(),
                0.1f,
                10.0f,
                true
        );
        proj.m11(-proj.m11());
        new UniformBufferObject(model, view, proj).writeToFloatPtr(uniformBuffersMapped[currentFrame]);
    }

    private void recreateSwapchain() {
        try (var arena = Arena.ofConfined()) {
            var pWidth = IntPtr.allocate(arena);
            var pHeight = IntPtr.allocate(arena);
            glfw.getFramebufferSize(window, pWidth, pHeight);
            while (pWidth.read() == 0 || pHeight.read() == 0) {
                glfw.getFramebufferSize(window, pWidth, pHeight);
                glfw.waitEvents();
            }
        }

        deviceCommands.deviceWaitIdle(device);

        cleanupSwapChain();

        createSwapchain();
        createImageViews();
        createColorResources();
        createDepthResources();
        createFramebuffers();
        createSwapchainSyncObjects();
    }

    private boolean checkValidationLayerSupport() {
        try (var arena = Arena.ofConfined()) {
            var pLayerCount = IntPtr.allocate(arena);
            var result = entryCommands.enumerateInstanceLayerProperties(pLayerCount, null);
            if (result != VkResult.SUCCESS) {
                throw new RuntimeException("Failed to enumerate instance layer properties, vulkan error code: " + VkResult.explain(result));
            }

            var layerCount = pLayerCount.read();
            var availableLayers = VkLayerProperties.allocate(arena, layerCount);
            result = entryCommands.enumerateInstanceLayerProperties(pLayerCount, availableLayers);
            if (result != VkResult.SUCCESS) {
                throw new RuntimeException("Failed to enumerate instance layer properties, vulkan error code: " + VkResult.explain(result));
            }

            for (var layer : availableLayers) {
                if (VALIDATION_LAYER_NAME.equals(layer.layerName().readString())) {
                    return true;
                }
            }

            return false;
        }
    }

    private PointerPtr getRequiredExtensions(Arena arena) {
        try (var localArena = Arena.ofConfined()) {
            var pGLFWExtensionCount = IntPtr.allocate(localArena);
            var glfwExtensions = glfw.getRequiredInstanceExtensions(pGLFWExtensionCount);
            if (glfwExtensions == null) {
                throw new RuntimeException("Failed to get GLFW required instance extensions");
            }

            var glfwExtensionCount = pGLFWExtensionCount.read();
            glfwExtensions = glfwExtensions.reinterpret(glfwExtensionCount);
            if (!ENABLE_VALIDATION_LAYERS) {
                return glfwExtensions;
            }
            else {
                var extensions = PointerPtr.allocate(arena, glfwExtensionCount + 1);
                for (int i = 0; i < glfwExtensionCount; i++) {
                    extensions.write(i, glfwExtensions.read(i));
                }

                extensions.write(glfwExtensionCount, BytePtr.allocateString(arena, VkConstants.EXT_DEBUG_UTILS_EXTENSION_NAME));
                return extensions;
            }
        }
    }

    private boolean isDeviceSuitable(VkPhysicalDevice device) {
        var indices = findQueueFamilies(device);
        var extensionsSupported = checkDeviceExtensionSupport(device);
        if ((indices == null) || !extensionsSupported) {
            return false;
        }

        try (var arena = Arena.ofConfined()) {
            var swapChainSupport = querySwapChainSupport(device, arena);
            var supportedFeatures = VkPhysicalDeviceFeatures.allocate(arena);
            instanceCommands.getPhysicalDeviceFeatures(device, supportedFeatures);
            return swapChainSupport.formats().size() != 0
                   && swapChainSupport.presentModes().size() != 0
                   && supportedFeatures.samplerAnisotropy() == VkConstants.TRUE;
        }
    }

    private record QueueFamilyIndices(int graphicsFamily, int presentFamily) {}

    private QueueFamilyIndices findQueueFamilies(VkPhysicalDevice device) {
        try (var arena = Arena.ofConfined()) {
            var pQueueFamilyCount = IntPtr.allocate(arena);
            instanceCommands.getPhysicalDeviceQueueFamilyProperties(device, pQueueFamilyCount, null);

            var queueFamilyCount = pQueueFamilyCount.read();
            var queueFamilies = VkQueueFamilyProperties.allocate(arena, queueFamilyCount);
            instanceCommands.getPhysicalDeviceQueueFamilyProperties(device, pQueueFamilyCount, queueFamilies);

            int graphicsFamily = -1;
            int presentFamily = -1;
            var pSurfaceSupport = IntPtr.allocate(arena);
            for (int i = 0; i < queueFamilyCount; i++) {
                var queueFamily = queueFamilies.at(i);
                if ((queueFamily.queueFlags() & VkQueueFlags.GRAPHICS) != 0) {
                    graphicsFamily = i;
                }

                if (instanceCommands.getPhysicalDeviceSurfaceSupportKHR(device, i, surface, pSurfaceSupport) == VkResult.SUCCESS
                    && pSurfaceSupport.read() == VkConstants.TRUE) {
                    presentFamily = i;
                }

                if (graphicsFamily != -1 && presentFamily != -1) {
                    break;
                }
            }

            if (graphicsFamily >= 0 && presentFamily >= 0) {
                return new QueueFamilyIndices(graphicsFamily, presentFamily);
            } else {
                return null;
            }
        }
    }

    private boolean checkDeviceExtensionSupport(VkPhysicalDevice device) {
        try (var arena = Arena.ofConfined()) {
            var pExtensionCount = IntPtr.allocate(arena);
            var result = instanceCommands.enumerateDeviceExtensionProperties(device, null, pExtensionCount, null);
            if (result != VkResult.SUCCESS) {
                throw new RuntimeException("Failed to enumerate device extension properties, vulkan error code: " + VkResult.explain(result));
            }

            var extensionCount = pExtensionCount.read();
            var availableExtensions = VkExtensionProperties.allocate(arena, extensionCount);
            result = instanceCommands.enumerateDeviceExtensionProperties(device, null, pExtensionCount, availableExtensions);
            if (result != VkResult.SUCCESS) {
                throw new RuntimeException("Failed to enumerate device extension properties, vulkan error code: " + VkResult.explain(result));
            }

            for (var extension : availableExtensions) {
                if (VkConstants.KHR_SWAPCHAIN_EXTENSION_NAME.equals(extension.extensionName().readString())) {
                    return true;
                }
            }

            return false;
        }
    }

    private record SwapchainSupportDetails(
            VkSurfaceCapabilitiesKHR capabilities,
            VkSurfaceFormatKHR.Ptr formats,
            @EnumType(VkPresentModeKHR.class) IntPtr presentModes
    ) {}

    private SwapchainSupportDetails querySwapChainSupport(VkPhysicalDevice device, Arena arena) {
        var surfaceCapabilities = VkSurfaceCapabilitiesKHR.allocate(arena);
        var result = instanceCommands.getPhysicalDeviceSurfaceCapabilitiesKHR(device, surface, surfaceCapabilities);
        if (result != VkResult.SUCCESS) {
            throw new RuntimeException("Failed to get physical device surface capabilities, vulkan error code: " + VkResult.explain(result));
        }

        try (var localArena = Arena.ofConfined()) {
            var pFormatCount = IntPtr.allocate(localArena);
            result = instanceCommands.getPhysicalDeviceSurfaceFormatsKHR(device, surface, pFormatCount, null);
            if (result != VkResult.SUCCESS) {
                throw new RuntimeException("Failed to get physical device surface formats, vulkan error code: " + VkResult.explain(result));
            }

            var formatCount = pFormatCount.read();
            var formats = VkSurfaceFormatKHR.allocate(arena, formatCount);
            result = instanceCommands.getPhysicalDeviceSurfaceFormatsKHR(device, surface, pFormatCount, formats);
            if (result != VkResult.SUCCESS) {
                throw new RuntimeException("Failed to get physical device surface formats, vulkan error code: " + VkResult.explain(result));
            }

            var pPresentModeCount = IntPtr.allocate(localArena);
            result = instanceCommands.getPhysicalDeviceSurfacePresentModesKHR(device, surface, pPresentModeCount, null);
            if (result != VkResult.SUCCESS) {
                throw new RuntimeException("Failed to get physical device surface present modes, vulkan error code: " + VkResult.explain(result));
            }

            var presentModeCount = pPresentModeCount.read();
            var presentModes = IntPtr.allocate(arena, presentModeCount);
            result = instanceCommands.getPhysicalDeviceSurfacePresentModesKHR(device, surface, pPresentModeCount, presentModes);
            if (result != VkResult.SUCCESS) {
                throw new RuntimeException("Failed to get physical device surface present modes, vulkan error code: " + VkResult.explain(result));
            }

            return new SwapchainSupportDetails(surfaceCapabilities, formats, presentModes);
        }
    }

    private VkSurfaceFormatKHR chooseSwapSurfaceFormat(VkSurfaceFormatKHR.Ptr formats) {
        for (var format : formats) {
            if (format.format() == VkFormat.B8G8R8A8_SRGB
                && format.colorSpace() == VkColorSpaceKHR.SRGB_NONLINEAR) {
                return format;
            }
        }

        return formats.at(0);
    }

    private @EnumType(VkPresentModeKHR.class) int chooseSwapPresentMode(
            @EnumType(VkPresentModeKHR.class) IntPtr presentModes
    ) {
        for (int presentMode : presentModes) {
            if (presentMode == VkPresentModeKHR.MAILBOX) {
                return presentMode;
            }
        }
        return VkPresentModeKHR.FIFO;
    }

    private VkExtent2D chooseSwapExtent(VkSurfaceCapabilitiesKHR capabilities, Arena arena) {
        if (capabilities.currentExtent().width() != NativeLayout.UINT32_MAX) {
            return capabilities.currentExtent();
        }
        else {
            try (var localArena = Arena.ofConfined()) {
                var pWidth = IntPtr.allocate(localArena);
                var pHeight = IntPtr.allocate(localArena);
                glfw.getFramebufferSize(window, pWidth, pHeight);
                var width = pWidth.read();
                var height = pHeight.read();

                var actualExtent = VkExtent2D.allocate(arena);
                actualExtent.width(Math.clamp(width, capabilities.minImageExtent().width(), capabilities.maxImageExtent().width()));
                actualExtent.height(Math.clamp(height, capabilities.minImageExtent().height(), capabilities.maxImageExtent().height()));
                return actualExtent;
            }
        }
    }

    private VkShaderModule createShaderModule(IntPtr code) {
        try (var arena = Arena.ofConfined()) {
            var createInfo = VkShaderModuleCreateInfo.allocate(arena)
                    .codeSize(code.size() * Integer.BYTES)
                    .pCode(code);;

            var pShaderModule = VkShaderModule.Ptr.allocate(arena);
            var result = deviceCommands.createShaderModule(device, createInfo, null, pShaderModule);
            if (result != VkResult.SUCCESS) {
                throw new RuntimeException("Failed to create shader module, vulkan error code: " + VkResult.explain(result));
            }
            return Objects.requireNonNull(pShaderModule.read());
        }
    }

    private void createSwapchainSyncObjects() {
        pRenderFinishedSemaphores = VkSemaphore.Ptr.allocate(Arena.ofAuto(), swapChainImages.size());
        try (var arena = Arena.ofConfined()) {
            var semaphoreInfo = VkSemaphoreCreateInfo.allocate(arena);
            for (int i = 0; i < swapChainImages.size(); i++) {
                var pRenderFinishedSemaphore = pRenderFinishedSemaphores.offset(i);
                if (deviceCommands.createSemaphore(device, semaphoreInfo, null, pRenderFinishedSemaphore) != VkResult.SUCCESS) {
                    throw new RuntimeException("Failed to create render finished semaphore for swap chain image " + i);
                }
            }
        }
    }

    private void cleanupSwapChain() {
        deviceCommands.destroyImageView(device, colorImageView, null);
        deviceCommands.destroyImage(device, colorImage, null);
        deviceCommands.freeMemory(device, colorImageMemory, null);
        deviceCommands.destroyImageView(device, depthImageView, null);
        deviceCommands.destroyImage(device, depthImage, null);
        deviceCommands.freeMemory(device, depthImageMemory, null);
        for (var framebuffer : swapChainFramebuffers) {
            deviceCommands.destroyFramebuffer(device, framebuffer, null);
        }
        for (var imageView : swapChainImageViews) {
            deviceCommands.destroyImageView(device, imageView, null);
        }
        for (var semaphore : pRenderFinishedSemaphores) {
            deviceCommands.destroySemaphore(device, semaphore, null);
        }
        deviceCommands.destroySwapchainKHR(device, swapChain, null);
    }

    private void framebufferResizeCallback(
            @Pointer(comment="GLFWwindow*") MemorySegment ignoredWindow,
            int ignoredWidth,
            int ignoredHeight
    ) {
        framebufferResized = true;
    }

    private int findMemoryType(int typeFilter, @EnumType(VkMemoryPropertyFlags.class) int properties) {
        try (var arena = Arena.ofConfined()) {
            var memProperties = VkPhysicalDeviceMemoryProperties.allocate(arena);
            instanceCommands.getPhysicalDeviceMemoryProperties(physicalDevice, memProperties);

            for (int i = 0; i < memProperties.memoryTypeCount(); i++) {
                if ((typeFilter & (1 << i)) != 0 &&
                    (memProperties.memoryTypes().at(i).propertyFlags() & properties) == properties) {
                    return i;
                }
            }
        }

        throw new RuntimeException("Failed to find suitable memory type");
    }

    private record Pair<T1, T2>(T1 first, T2 second) {}

    private Pair<VkBuffer, VkDeviceMemory> createBuffer(
            int size,
            @EnumType(VkBufferUsageFlags.class) int usage,
            @EnumType(VkMemoryPropertyFlags.class) int properties
    ) {
        try (var arena = Arena.ofConfined()) {
            var bufferInfo = VkBufferCreateInfo.allocate(arena);
            bufferInfo.size(size);
            bufferInfo.usage(usage);
            bufferInfo.sharingMode(VkSharingMode.EXCLUSIVE);

            var pBuffer = VkBuffer.Ptr.allocate(arena);
            var result = deviceCommands.createBuffer(device, bufferInfo, null, pBuffer);
            if (result != VkResult.SUCCESS) {
                throw new RuntimeException("Failed to create vertex buffer, vulkan error code: " + VkResult.explain(result));
            }
            var buffer = Objects.requireNonNull(pBuffer.read());

            var memRequirements = VkMemoryRequirements.allocate(arena);
            deviceCommands.getBufferMemoryRequirements(device, buffer, memRequirements);

            var allocInfo = VkMemoryAllocateInfo.allocate(arena);
            allocInfo.allocationSize(memRequirements.size());
            allocInfo.memoryTypeIndex(findMemoryType(memRequirements.memoryTypeBits(), properties));
            var pMemory = VkDeviceMemory.Ptr.allocate(arena);
            result = deviceCommands.allocateMemory(device, allocInfo, null, pMemory);
            if (result != VkResult.SUCCESS) {
                throw new RuntimeException("Failed to allocate vertex buffer memory, vulkan error code: " + VkResult.explain(result));
            }
            var memory = Objects.requireNonNull(pMemory.read());

            deviceCommands.bindBufferMemory(device, buffer, memory, 0);
            return new Pair<>(buffer, memory);
        }
    }

    private record UniformBufferObject(Matrix4f model, Matrix4f view, Matrix4f proj) {
        public static int bufferSize() {
            return 16 * 3;
        }

        public void writeToFloatPtr(FloatPtr buffer) {
            assert buffer.size() >= bufferSize();

            model.get(buffer.segment().asByteBuffer().order(ByteOrder.nativeOrder()));
            view.get(buffer.offset(16).segment().asByteBuffer().order(ByteOrder.nativeOrder()));
            proj.get(buffer.offset(32).segment().asByteBuffer().order(ByteOrder.nativeOrder()));
        }
    }

    private void copyBuffer(VkBuffer srcBuffer, VkBuffer dstBuffer, int size) {
        try (var arena = Arena.ofConfined()) {
            var commandBuffer = beginSingleTimeCommands();

            var copyRegion = VkBufferCopy.allocate(arena);
            copyRegion.size(size);
            deviceCommands.cmdCopyBuffer(commandBuffer, srcBuffer, dstBuffer, 1, copyRegion);

            endSingleTimeCommands(commandBuffer);
        }
    }

    private Pair<VkImage, VkDeviceMemory> createImage(
            int width,
            int height,
            int mipLevels,
            @EnumType(VkSampleCountFlags.class) int numSamples,
            @EnumType(VkFormat.class) int format,
            @EnumType(VkImageTiling.class) int tiling,
            @EnumType(VkImageUsageFlags.class) int usage,
            @EnumType(VkMemoryPropertyFlags.class) int properties
    ) {
        try (var arena = Arena.ofConfined()) {
            var imageInfo = VkImageCreateInfo.allocate(arena);
            imageInfo.imageType(VkImageType._2D);
            imageInfo.extent().width(width);
            imageInfo.extent().height(height);
            imageInfo.extent().depth(1);
            imageInfo.mipLevels(mipLevels);
            imageInfo.arrayLayers(1);
            imageInfo.format(format);
            imageInfo.tiling(tiling);
            imageInfo.initialLayout(VkImageLayout.UNDEFINED);
            imageInfo.usage(usage);
            imageInfo.samples(numSamples);
            imageInfo.sharingMode(VkSharingMode.EXCLUSIVE);

            var pImage = VkImage.Ptr.allocate(arena);
            var result = deviceCommands.createImage(device, imageInfo, null, pImage);
            if (result != VkResult.SUCCESS) {
                throw new RuntimeException("Failed to create image, vulkan error code: " + VkResult.explain(result));
            }
            var image = Objects.requireNonNull(pImage.read());

            var memRequirements = VkMemoryRequirements.allocate(arena);
            deviceCommands.getImageMemoryRequirements(device, image, memRequirements);

            var allocInfo = VkMemoryAllocateInfo.allocate(arena);
            allocInfo.allocationSize(memRequirements.size());
            allocInfo.memoryTypeIndex(findMemoryType(memRequirements.memoryTypeBits(), properties));

            var pMemory = VkDeviceMemory.Ptr.allocate(arena);
            result = deviceCommands.allocateMemory(device, allocInfo, null, pMemory);
            if (result != VkResult.SUCCESS) {
                throw new RuntimeException("Failed to allocate image memory, vulkan error code: " + VkResult.explain(result));
            }
            var memory = Objects.requireNonNull(pMemory.read());

            deviceCommands.bindImageMemory(device, image, memory, 0);
            return new Pair<>(image, memory);
        }
    }

    private void transitionImageLayout(
            VkImage image,
            @EnumType(VkFormat.class) int format,
            @EnumType(VkImageLayout.class) int oldLayout,
            @EnumType(VkImageLayout.class) int newLayout,
            int mipLevels
    ) {
        try (var arena = Arena.ofConfined()) {
            var commandBuffer = beginSingleTimeCommands();

            var barrier = VkImageMemoryBarrier.allocate(arena);
            barrier.oldLayout(oldLayout);
            barrier.newLayout(newLayout);
            barrier.srcQueueFamilyIndex(VkConstants.QUEUE_FAMILY_IGNORED);
            barrier.dstQueueFamilyIndex(VkConstants.QUEUE_FAMILY_IGNORED);

            barrier.image(image);
            var subResourceRange = barrier.subresourceRange();
            subResourceRange.baseMipLevel(0);
            subResourceRange.levelCount(mipLevels);
            subResourceRange.baseArrayLayer(0);
            subResourceRange.layerCount(1);

            if (newLayout == VkImageLayout.DEPTH_STENCIL_ATTACHMENT_OPTIMAL) {
                subResourceRange.aspectMask(VkImageAspectFlags.DEPTH);
                if (hasStencilComponent(format)) {
                    subResourceRange.aspectMask(subResourceRange.aspectMask()
                                                | VkImageAspectFlags.STENCIL);
                }
            }
            else {
                subResourceRange.aspectMask(VkImageAspectFlags.COLOR);
            }

            @EnumType(VkPipelineStageFlags.class) int sourceStage;
            @EnumType(VkPipelineStageFlags.class) int destinationStage;

            if (oldLayout == VkImageLayout.UNDEFINED
                && newLayout == VkImageLayout.TRANSFER_DST_OPTIMAL) {
                barrier.srcAccessMask(0);
                barrier.dstAccessMask(VkAccessFlags.TRANSFER_WRITE);

                sourceStage = VkPipelineStageFlags.TOP_OF_PIPE;
                destinationStage = VkPipelineStageFlags.TRANSFER;
            }
            else if (oldLayout == VkImageLayout.TRANSFER_DST_OPTIMAL
                     && newLayout == VkImageLayout.SHADER_READ_ONLY_OPTIMAL) {
                barrier.srcAccessMask(VkAccessFlags.TRANSFER_WRITE);
                barrier.dstAccessMask(VkAccessFlags.SHADER_READ);

                sourceStage = VkPipelineStageFlags.TRANSFER;
                destinationStage = VkPipelineStageFlags.FRAGMENT_SHADER;
            }
            else if (oldLayout == VkImageLayout.UNDEFINED
                     && newLayout == VkImageLayout.DEPTH_STENCIL_ATTACHMENT_OPTIMAL) {
                barrier.srcAccessMask(0);
                barrier.dstAccessMask(VkAccessFlags.DEPTH_STENCIL_ATTACHMENT_READ
                                      | VkAccessFlags.DEPTH_STENCIL_ATTACHMENT_WRITE);

                sourceStage = VkPipelineStageFlags.TOP_OF_PIPE;
                destinationStage = VkPipelineStageFlags.EARLY_FRAGMENT_TESTS;
            }
            else {
                throw new RuntimeException(
                        "Unsupported layout transition from "
                        + VkImageLayout.explain(oldLayout)
                        + " to "
                        + VkImageLayout.explain(newLayout)
                );
            }

            deviceCommands.cmdPipelineBarrier(
                    commandBuffer,
                    sourceStage,
                    destinationStage,
                    0,
                    0, null,
                    0, null,
                    1, barrier
            );

            endSingleTimeCommands(commandBuffer);
        }
    }

    private void copyBufferToImage(
            VkBuffer buffer,
            VkImage image,
            int width,
            int height
    ) {
        try (var arena = Arena.ofConfined()) {
            var commandBuffer = beginSingleTimeCommands();

            var region = VkBufferImageCopy.allocate(arena);
            region.bufferOffset(0);
            region.bufferRowLength(0);
            region.bufferImageHeight(0);

            var imageSubresource = region.imageSubresource();
            imageSubresource.aspectMask(VkImageAspectFlags.COLOR);
            imageSubresource.mipLevel(0);
            imageSubresource.baseArrayLayer(0);
            imageSubresource.layerCount(1);

            var imageOffset = region.imageOffset();
            imageOffset.x(0);
            imageOffset.y(0);
            imageOffset.z(0);
            var imageExtent = region.imageExtent();
            imageExtent.width(width);
            imageExtent.height(height);
            imageExtent.depth(1);

            deviceCommands.cmdCopyBufferToImage(
                    commandBuffer,
                    buffer,
                    image,
                    VkImageLayout.TRANSFER_DST_OPTIMAL,
                    1,
                    region
            );

            endSingleTimeCommands(commandBuffer);
        }
    }

    private VkCommandBuffer beginSingleTimeCommands() {
        try (var arena = Arena.ofConfined()) {
            var allocInfo = VkCommandBufferAllocateInfo.allocate(arena);
            allocInfo.level(VkCommandBufferLevel.PRIMARY);
            allocInfo.commandPool(commandPool);
            allocInfo.commandBufferCount(1);

            var pCommandBuffer = VkCommandBuffer.Ptr.allocate(arena);
            var result = deviceCommands.allocateCommandBuffers(device, allocInfo, pCommandBuffer);
            if (result != VkResult.SUCCESS) {
                throw new RuntimeException("Failed to allocate command buffer, vulkan error code: " + VkResult.explain(result));
            }
            var commandBuffer = Objects.requireNonNull(pCommandBuffer.read());

            var beginInfo = VkCommandBufferBeginInfo.allocate(arena);
            beginInfo.flags(VkCommandBufferUsageFlags.ONE_TIME_SUBMIT);
            result = deviceCommands.beginCommandBuffer(commandBuffer, beginInfo);
            if (result != VkResult.SUCCESS) {
                throw new RuntimeException("Failed to begin recording command buffer, vulkan error code: " + VkResult.explain(result));
            }

            return commandBuffer;
        }
    }

    private void endSingleTimeCommands(VkCommandBuffer commandBuffer) {
        deviceCommands.endCommandBuffer(commandBuffer);

        try (var arena = Arena.ofConfined()) {
            var submitInfo = VkSubmitInfo.allocate(arena);
            submitInfo.commandBufferCount(1);
            var pCommandBuffers = VkCommandBuffer.Ptr.allocate(arena);
            pCommandBuffers.write(commandBuffer);
            submitInfo.pCommandBuffers(pCommandBuffers);

            deviceCommands.queueSubmit(graphicsQueue, 1, submitInfo, null);
            deviceCommands.queueWaitIdle(graphicsQueue);

            deviceCommands.freeCommandBuffers(device, commandPool, 1, pCommandBuffers);
        }
    }

    private VkImageView createImageView(
            VkImage image,
            @EnumType(VkFormat.class) int format,
            @EnumType(VkImageAspectFlags.class) int aspect,
            int mipLevels
    ) {
        try (var arena = Arena.ofConfined()) {
            var viewInfo = VkImageViewCreateInfo.allocate(arena);
            viewInfo.image(image);
            viewInfo.viewType(VkImageViewType._2D);
            viewInfo.format(format);

            var subresourceRange = viewInfo.subresourceRange();
            subresourceRange.aspectMask(aspect);
            subresourceRange.baseMipLevel(0);
            subresourceRange.levelCount(mipLevels);
            subresourceRange.baseArrayLayer(0);
            subresourceRange.layerCount(1);

            var pImageView = VkImageView.Ptr.allocate(arena);
            var result = deviceCommands.createImageView(device, viewInfo, null, pImageView);
            if (result != VkResult.SUCCESS) {
                throw new RuntimeException("Failed to create image view, vulkan error code: " + VkResult.explain(result));
            }
            return Objects.requireNonNull(pImageView.read());
        }
    }

    private @EnumType(VkFormat.class) int findDepthFormat() {
        return findSupportedFormat(
                new int[] {
                        VkFormat.D32_SFLOAT,
                        VkFormat.D32_SFLOAT_S8_UINT,
                        VkFormat.D24_UNORM_S8_UINT
                },
                VkImageTiling.OPTIMAL,
                VkFormatFeatureFlags.DEPTH_STENCIL_ATTACHMENT
        );
    }

    private @EnumType(VkFormat.class) int findSupportedFormat(
            @EnumType(VkFormat.class) int[] candidates,
            @EnumType(VkImageTiling.class) int tiling,
            @EnumType(VkFormatFeatureFlags.class) int features
    ) {
        for (var format : candidates) {
            try (var arena = Arena.ofConfined()) {
                var props = VkFormatProperties.allocate(arena);
                instanceCommands.getPhysicalDeviceFormatProperties(physicalDevice, format, props);

                if (tiling == VkImageTiling.LINEAR && (props.linearTilingFeatures() & features) == features) {
                    return format;
                }
                else if (tiling == VkImageTiling.OPTIMAL && (props.optimalTilingFeatures() & features) == features) {
                    return format;
                }
            }
        }

        throw new RuntimeException("Failed to find supported format");
    }

    private boolean hasStencilComponent(@EnumType(VkFormat.class) int format) {
        return format == VkFormat.D32_SFLOAT_S8_UINT || format == VkFormat.D24_UNORM_S8_UINT;
    }

    private void generateMipmaps(
            VkImage image,
            @EnumType(VkFormat.class) int imageFormat,
            int texWidth,
            int texHeight,
            int mipLevels
    ) {
        try (var arena = Arena.ofConfined()) {
            var formatProperties = VkFormatProperties.allocate(arena);
            instanceCommands.getPhysicalDeviceFormatProperties(physicalDevice, imageFormat, formatProperties);
            if ((formatProperties.optimalTilingFeatures() & VkFormatFeatureFlags.SAMPLED_IMAGE_FILTER_LINEAR) == 0) {
                throw new RuntimeException("Texture image format does not support linear blitting");
            }

            var commandBuffer = beginSingleTimeCommands();

            var barrier = VkImageMemoryBarrier.allocate(arena);
            barrier.image(image);
            barrier.srcQueueFamilyIndex(VkConstants.QUEUE_FAMILY_IGNORED);
            barrier.dstQueueFamilyIndex(VkConstants.QUEUE_FAMILY_IGNORED);
            barrier.subresourceRange().aspectMask(VkImageAspectFlags.COLOR);
            barrier.subresourceRange().baseArrayLayer(0);
            barrier.subresourceRange().layerCount(1);
            barrier.subresourceRange().levelCount(1);

            var blit = VkImageBlit.allocate(arena);

            var mipWidth = texWidth;
            var mipHeight = texHeight;
            for (var i = 1; i < mipLevels; i++) {
                barrier.subresourceRange().baseMipLevel(i - 1);
                barrier.oldLayout(VkImageLayout.TRANSFER_DST_OPTIMAL);
                barrier.newLayout(VkImageLayout.TRANSFER_SRC_OPTIMAL);
                barrier.srcAccessMask(VkAccessFlags.TRANSFER_WRITE);
                barrier.dstAccessMask(VkAccessFlags.TRANSFER_READ);
                deviceCommands.cmdPipelineBarrier(
                        commandBuffer,
                        VkPipelineStageFlags.TRANSFER,
                        VkPipelineStageFlags.TRANSFER,
                        0,
                        0, null,
                        0, null,
                        1, barrier
                );

                var srcOffsets = blit.srcOffsets();
                srcOffsets.at(0).x(0);
                srcOffsets.at(0).y(0);
                srcOffsets.at(0).z(0);
                srcOffsets.at(1).x(mipWidth);
                srcOffsets.at(1).y(mipHeight);
                srcOffsets.at(1).z(1);
                var srcSubresource = blit.srcSubresource();
                srcSubresource.aspectMask(VkImageAspectFlags.COLOR);
                srcSubresource.mipLevel(i - 1);
                srcSubresource.baseArrayLayer(0);
                srcSubresource.layerCount(1);
                var dstOffsets = blit.dstOffsets();
                dstOffsets.at(0).x(0);
                dstOffsets.at(0).y(0);
                dstOffsets.at(0).z(0);
                dstOffsets.at(1).x(mipWidth > 1 ? mipWidth / 2 : 1);
                dstOffsets.at(1).y(mipHeight > 1 ? mipHeight / 2 : 1);
                dstOffsets.at(1).z(1);
                var dstSubresource = blit.dstSubresource();
                dstSubresource.aspectMask(VkImageAspectFlags.COLOR);
                dstSubresource.mipLevel(i);
                dstSubresource.baseArrayLayer(0);
                dstSubresource.layerCount(1);

                deviceCommands.cmdBlitImage(
                        commandBuffer,
                        image,
                        VkImageLayout.TRANSFER_SRC_OPTIMAL,
                        image,
                        VkImageLayout.TRANSFER_DST_OPTIMAL,
                        1,
                        blit,
                        VkFilter.LINEAR
                );

                barrier.oldLayout(VkImageLayout.TRANSFER_SRC_OPTIMAL);
                barrier.newLayout(VkImageLayout.SHADER_READ_ONLY_OPTIMAL);
                barrier.srcAccessMask(VkAccessFlags.TRANSFER_READ);
                barrier.dstAccessMask(VkAccessFlags.SHADER_READ);
                deviceCommands.cmdPipelineBarrier(
                        commandBuffer,
                        VkPipelineStageFlags.TRANSFER,
                        VkPipelineStageFlags.FRAGMENT_SHADER,
                        0,
                        0, null,
                        0, null,
                        1, barrier
                );

                if (mipWidth > 1) {
                    mipWidth /= 2;
                }
                if (mipHeight > 1) {
                    mipHeight /= 2;
                }
            }

            barrier.subresourceRange().baseMipLevel(mipLevels - 1);
            barrier.oldLayout(VkImageLayout.TRANSFER_DST_OPTIMAL);
            barrier.newLayout(VkImageLayout.SHADER_READ_ONLY_OPTIMAL);
            barrier.srcAccessMask(VkAccessFlags.TRANSFER_WRITE);
            barrier.dstAccessMask(VkAccessFlags.SHADER_READ);

            deviceCommands.cmdPipelineBarrier(
                    commandBuffer,
                    VkPipelineStageFlags.TRANSFER,
                    VkPipelineStageFlags.FRAGMENT_SHADER,
                    0,
                    0, null,
                    0, null,
                    1, barrier
            );

            endSingleTimeCommands(commandBuffer);
        }
    }

    private @EnumType(VkSampleCountFlags.class) int getMaxUsableSampleCount() {
        try (var arena = Arena.ofConfined()) {
            var physicalDeviceProperties = VkPhysicalDeviceProperties.allocate(arena);
            instanceCommands.getPhysicalDeviceProperties(physicalDevice, physicalDeviceProperties);

            var counts = physicalDeviceProperties.limits().framebufferColorSampleCounts()
                         & physicalDeviceProperties.limits().framebufferDepthSampleCounts();

            if ((counts & VkSampleCountFlags._64) != 0) {
                return VkSampleCountFlags._64;
            }
            if ((counts & VkSampleCountFlags._32) != 0) {
                return VkSampleCountFlags._32;
            }
            if ((counts & VkSampleCountFlags._16) != 0) {
                return VkSampleCountFlags._16;
            }
            if ((counts & VkSampleCountFlags._8) != 0) {
                return VkSampleCountFlags._8;
            }
            if ((counts & VkSampleCountFlags._4) != 0) {
                return VkSampleCountFlags._4;
            }
            if ((counts & VkSampleCountFlags._2) != 0) {
                return VkSampleCountFlags._2;
            }

            return VkSampleCountFlags._1;
        }
    }

    private static @NativeType("VkBool32") @Unsigned int debugCallback(
            @EnumType(VkDebugUtilsMessageSeverityFlagsEXT.class) int ignoredMessageSeverity,
            @EnumType(VkDebugUtilsMessageTypeFlagsEXT.class) int ignoredMessageType,
            @Pointer(target=VkDebugUtilsMessengerCallbackDataEXT.class) MemorySegment pCallbackData,
            @Pointer(comment="void*") MemorySegment ignoredPUserData
    ) {
        var callbackData = new VkDebugUtilsMessengerCallbackDataEXT(pCallbackData.reinterpret(VkDebugUtilsMessengerCallbackDataEXT.BYTES));
        System.err.println("Validation layer: " + Objects.requireNonNull(callbackData.pMessage()).readString());
        return VkConstants.FALSE;
    }

    private static void populateDebugMessengerCreateInfo(VkDebugUtilsMessengerCreateInfoEXT debugUtilsMessengerCreateInfo) {
        debugUtilsMessengerCreateInfo.messageSeverity(
                VkDebugUtilsMessageSeverityFlagsEXT.VERBOSE
                | VkDebugUtilsMessageSeverityFlagsEXT.WARNING
                | VkDebugUtilsMessageSeverityFlagsEXT.ERROR
        ).messageType(
                VkDebugUtilsMessageTypeFlagsEXT.GENERAL
                | VkDebugUtilsMessageTypeFlagsEXT.VALIDATION
                | VkDebugUtilsMessageTypeFlagsEXT.PERFORMANCE
        ).pfnUserCallback(UPCALL_debugCallback);
    }

    private static IntPtr readShaderFile(String filename, Arena arena) {
        try (var stream = Application.class.getResourceAsStream(filename)) {
            if (stream == null) {
                throw new RuntimeException("Failed to open shader file: " + filename);
            }

            var bytes = stream.readAllBytes();
            assert bytes.length % Integer.BYTES == 0;
            return IntPtr.allocate(arena, bytes);
        }
        catch (IOException e) {
            throw new RuntimeException("Failed to read shader file: " + filename, e);
        }
    }

    private static VkVertexInputBindingDescription getBindingDescription(Arena arena) {
        var description = VkVertexInputBindingDescription.allocate(arena);
        description.binding(0);
        description.stride(Float.BYTES * 8);
        description.inputRate(VkVertexInputRate.VERTEX);
        return description;
    }

    private static VkVertexInputAttributeDescription.Ptr getAttributeDescriptions(Arena arena) {
        var attributeDescriptions = VkVertexInputAttributeDescription.allocate(arena, 3);
        var vertexAttribute = attributeDescriptions.at(0);
        var colorAttribute = attributeDescriptions.at(1);
        var texCoordAttribute = attributeDescriptions.at(2);

        vertexAttribute.binding(0);
        vertexAttribute.location(0);
        vertexAttribute.format(VkFormat.R32G32B32_SFLOAT);
        vertexAttribute.offset(0);

        colorAttribute.binding(0);
        colorAttribute.location(1);
        colorAttribute.format(VkFormat.R32G32B32_SFLOAT);
        colorAttribute.offset(Float.BYTES * 3);

        texCoordAttribute.binding(0);
        texCoordAttribute.location(2);
        texCoordAttribute.format(VkFormat.R32G32_SFLOAT);
        texCoordAttribute.offset(Float.BYTES * 6);

        return attributeDescriptions;
    }

    private GLFW glfw;
    private GLFWwindow window;

    private VkStaticCommands staticCommands;
    private VkEntryCommands entryCommands;
    private VkInstance instance;
    private VkInstanceCommands instanceCommands;
    private VkDebugUtilsMessengerEXT debugMessenger;
    private VkPhysicalDevice physicalDevice;
    private @EnumType(VkSampleCountFlags.class) int msaaSamples;
    private VkDevice device;
    private VkDeviceCommands deviceCommands;
    private VkQueue graphicsQueue;
    private VkSurfaceKHR surface;
    private VkQueue presentQueue;
    private VkSwapchainKHR swapChain;
    private VkImage.Ptr swapChainImages;
    private @EnumType(VkFormat.class) int swapChainImageFormat;
    private VkExtent2D swapChainExtent;
    private VkImageView.Ptr swapChainImageViews;
    private VkRenderPass renderPass;
    private VkDescriptorSetLayout descriptorSetLayout;
    private VkPipelineLayout pipelineLayout;
    private VkPipeline graphicsPipeline;
    private VkFramebuffer.Ptr swapChainFramebuffers;
    private VkCommandPool commandPool;
    private VkCommandBuffer.Ptr pCommandBuffers;
    private VkSemaphore.Ptr pImageAvailableSemaphores;
    private VkSemaphore.Ptr pRenderFinishedSemaphores;
    private VkFence.Ptr pInFlightFences;
    private int currentFrame;
    private boolean framebufferResized = false;
    private float[] vertices;
    private int[] indices;
    private VkBuffer vertexBuffer;
    private VkDeviceMemory vertexBufferMemory;
    private VkBuffer indexBuffer;
    private VkDeviceMemory indexBufferMemory;
    private VkBuffer.Ptr uniformBuffers;
    private VkDeviceMemory.Ptr uniformBuffersMemory;
    private FloatPtr[] uniformBuffersMapped;
    private VkDescriptorPool descriptorPool;
    private VkDescriptorSet.Ptr descriptorSets;
    private int textureMipLevels;
    private VkImage textureImage;
    private VkDeviceMemory textureImageMemory;
    private VkImageView textureImageView;
    private VkSampler textureSampler;
    private VkImage colorImage;
    private VkDeviceMemory colorImageMemory;
    private VkImageView colorImageView;
    private VkImage depthImage;
    private VkDeviceMemory depthImageMemory;
    private VkImageView depthImageView;

    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;
    private static final BytePtr WINDOW_TITLE = BytePtr.allocateString(Arena.global(), "Vulkan");
    private static final boolean ENABLE_VALIDATION_LAYERS = System.getProperty("validation") != null;
    private static final String VALIDATION_LAYER_NAME = "VK_LAYER_KHRONOS_validation";
    private static final MethodHandle HANDLE_debugCallback;
    static {
        try {
            HANDLE_debugCallback = MethodHandles
                    .lookup()
                    .findStatic(
                            Application.class,
                            "debugCallback",
                            VkFunctionTypes.PFN_vkDebugUtilsMessengerCallbackEXT.toMethodType());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    private static final MemorySegment UPCALL_debugCallback = Linker
            .nativeLinker()
            .upcallStub(
                    HANDLE_debugCallback,
                    VkFunctionTypes.PFN_vkDebugUtilsMessengerCallbackEXT,
                    Arena.global());
    private static final int MAX_FRAMES_IN_FLIGHT = 2;
    private static final long startTime = System.currentTimeMillis();
    private static final String MODEL_PATH = "/model/viking_room.obj";
    private static final String TEXTURE_PATH = "/texture/viking_room.png";
}

public class Main {
    public static void main(String[] args) {
        try {
            var app = new Application();
            app.run();
        }
        catch (Throwable e) {
            e.printStackTrace(System.err);
        }
    }
}
