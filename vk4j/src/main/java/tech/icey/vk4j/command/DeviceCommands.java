package tech.icey.vk4j.command;

import java.lang.foreign.*;
import java.lang.invoke.MethodHandle;

import tech.icey.panama.FunctionLoader;
import tech.icey.panama.NativeLayout;
import tech.icey.panama.annotation.*;
import tech.icey.panama.buffer.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.handle.*;

public final class DeviceCommands {
    public static final FunctionDescriptor DESCRIPTOR$vkDestroyDevice = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkGetDeviceQueue = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkQueueSubmit = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(VkSubmitInfo.LAYOUT),
            ValueLayout.ADDRESS
    );

    public static final FunctionDescriptor DESCRIPTOR$vkQueueWaitIdle = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS
    );

    public static final FunctionDescriptor DESCRIPTOR$vkDeviceWaitIdle = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS
    );

    public static final FunctionDescriptor DESCRIPTOR$vkAllocateMemory = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkMemoryAllocateInfo.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkFreeMemory = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkMapMemory = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_LONG,
            ValueLayout.JAVA_LONG,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkUnmapMemory = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS
    );

    public static final FunctionDescriptor DESCRIPTOR$vkFlushMappedMemoryRanges = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(VkMappedMemoryRange.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkInvalidateMappedMemoryRanges = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(VkMappedMemoryRange.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkGetDeviceMemoryCommitment = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_LONG)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkGetBufferMemoryRequirements = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkMemoryRequirements.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkBindBufferMemory = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_LONG
    );

    public static final FunctionDescriptor DESCRIPTOR$vkGetImageMemoryRequirements = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkMemoryRequirements.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkBindImageMemory = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_LONG
    );

    public static final FunctionDescriptor DESCRIPTOR$vkGetImageSparseMemoryRequirements = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(VkSparseImageMemoryRequirements.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkQueueBindSparse = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(VkBindSparseInfo.LAYOUT),
            ValueLayout.ADDRESS
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCreateFence = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkFenceCreateInfo.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkDestroyFence = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkResetFences = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkGetFenceStatus = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS
    );

    public static final FunctionDescriptor DESCRIPTOR$vkWaitForFences = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS),
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_LONG
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCreateSemaphore = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkSemaphoreCreateInfo.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkDestroySemaphore = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCreateEvent = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkEventCreateInfo.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkDestroyEvent = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkGetEventStatus = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS
    );

    public static final FunctionDescriptor DESCRIPTOR$vkSetEvent = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS
    );

    public static final FunctionDescriptor DESCRIPTOR$vkResetEvent = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCreateQueryPool = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkQueryPoolCreateInfo.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkDestroyQueryPool = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkGetQueryPoolResults = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            NativeLayout.C_SIZE_T,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_LONG,
            ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor DESCRIPTOR$vkResetQueryPool = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCreateBuffer = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkBufferCreateInfo.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkDestroyBuffer = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCreateBufferView = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkBufferViewCreateInfo.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkDestroyBufferView = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCreateImage = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkImageCreateInfo.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkDestroyImage = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkGetImageSubresourceLayout = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkImageSubresource.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(VkSubresourceLayout.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCreateImageView = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkImageViewCreateInfo.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkDestroyImageView = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCreateShaderModule = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkShaderModuleCreateInfo.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkDestroyShaderModule = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCreatePipelineCache = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkPipelineCacheCreateInfo.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkDestroyPipelineCache = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkGetPipelineCacheData = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(NativeLayout.C_SIZE_T),
            ValueLayout.ADDRESS
    );

    public static final FunctionDescriptor DESCRIPTOR$vkMergePipelineCaches = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCreatePipelineBinariesKHR = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkPipelineBinaryCreateInfoKHR.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(VkPipelineBinaryHandlesInfoKHR.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkDestroyPipelineBinaryKHR = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkGetPipelineKeyKHR = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkPipelineCreateInfoKHR.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(VkPipelineBinaryKeyKHR.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkGetPipelineBinaryDataKHR = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkPipelineBinaryDataInfoKHR.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(VkPipelineBinaryKeyKHR.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(NativeLayout.C_SIZE_T),
            ValueLayout.ADDRESS
    );

    public static final FunctionDescriptor DESCRIPTOR$vkReleaseCapturedPipelineDataKHR = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkReleaseCapturedPipelineDataInfoKHR.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCreateGraphicsPipelines = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(VkGraphicsPipelineCreateInfo.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCreateComputePipelines = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(VkComputePipelineCreateInfo.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkGetDeviceSubpassShadingMaxWorkgroupSizeHUAWEI = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkExtent2D.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkDestroyPipeline = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCreatePipelineLayout = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkPipelineLayoutCreateInfo.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkDestroyPipelineLayout = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCreateSampler = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkSamplerCreateInfo.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkDestroySampler = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCreateDescriptorSetLayout = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkDescriptorSetLayoutCreateInfo.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkDestroyDescriptorSetLayout = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCreateDescriptorPool = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkDescriptorPoolCreateInfo.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkDestroyDescriptorPool = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkResetDescriptorPool = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor DESCRIPTOR$vkAllocateDescriptorSets = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkDescriptorSetAllocateInfo.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkFreeDescriptorSets = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkUpdateDescriptorSets = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(VkWriteDescriptorSet.LAYOUT),
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(VkCopyDescriptorSet.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCreateFramebuffer = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkFramebufferCreateInfo.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkDestroyFramebuffer = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCreateRenderPass = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkRenderPassCreateInfo.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkDestroyRenderPass = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkGetRenderAreaGranularity = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkExtent2D.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkGetRenderingAreaGranularityKHR = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkRenderingAreaInfoKHR.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(VkExtent2D.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCreateCommandPool = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkCommandPoolCreateInfo.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkDestroyCommandPool = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkResetCommandPool = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor DESCRIPTOR$vkAllocateCommandBuffers = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkCommandBufferAllocateInfo.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkFreeCommandBuffers = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkBeginCommandBuffer = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkCommandBufferBeginInfo.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkEndCommandBuffer = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS
    );

    public static final FunctionDescriptor DESCRIPTOR$vkResetCommandBuffer = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdBindPipeline = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdSetAttachmentFeedbackLoopEnableEXT = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdSetViewport = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(VkViewport.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdSetScissor = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(VkRect2D.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdSetLineWidth = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_FLOAT
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdSetDepthBias = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_FLOAT,
            ValueLayout.JAVA_FLOAT,
            ValueLayout.JAVA_FLOAT
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdSetBlendConstants = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_FLOAT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdSetDepthBounds = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_FLOAT,
            ValueLayout.JAVA_FLOAT
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdSetStencilCompareMask = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdSetStencilWriteMask = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdSetStencilReference = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdBindDescriptorSets = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS),
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdBindIndexBuffer = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_LONG,
            ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdBindVertexBuffers = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_LONG)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdDraw = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdDrawIndexed = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdDrawMultiEXT = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(VkMultiDrawInfoEXT.LAYOUT),
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdDrawMultiIndexedEXT = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(VkMultiDrawIndexedInfoEXT.LAYOUT),
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdDrawIndirect = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_LONG,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdDrawIndexedIndirect = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_LONG,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdDispatch = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdDispatchIndirect = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_LONG
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdSubpassShadingHUAWEI = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdDrawClusterHUAWEI = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdDrawClusterIndirectHUAWEI = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_LONG
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdUpdatePipelineIndirectBufferNV = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdCopyBuffer = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(VkBufferCopy.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdCopyImage = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(VkImageCopy.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdBlitImage = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(VkImageBlit.LAYOUT),
            ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdCopyBufferToImage = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(VkBufferImageCopy.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdCopyImageToBuffer = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(VkBufferImageCopy.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdCopyMemoryIndirectNV = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_LONG,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdCopyMemoryToImageIndirectNV = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_LONG,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(VkImageSubresourceLayers.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdUpdateBuffer = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_LONG,
            ValueLayout.JAVA_LONG,
            ValueLayout.ADDRESS
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdFillBuffer = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_LONG,
            ValueLayout.JAVA_LONG,
            ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdClearColorImage = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(VkClearColorValue.LAYOUT),
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(VkImageSubresourceRange.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdClearDepthStencilImage = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(VkClearDepthStencilValue.LAYOUT),
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(VkImageSubresourceRange.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdClearAttachments = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(VkClearAttachment.LAYOUT),
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(VkClearRect.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdResolveImage = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(VkImageResolve.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdSetEvent = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdResetEvent = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdWaitEvents = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS),
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(VkMemoryBarrier.LAYOUT),
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(VkBufferMemoryBarrier.LAYOUT),
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(VkImageMemoryBarrier.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdPipelineBarrier = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(VkMemoryBarrier.LAYOUT),
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(VkBufferMemoryBarrier.LAYOUT),
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(VkImageMemoryBarrier.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdBeginQuery = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdEndQuery = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdBeginConditionalRenderingEXT = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkConditionalRenderingBeginInfoEXT.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdEndConditionalRenderingEXT = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdResetQueryPool = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdWriteTimestamp = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdCopyQueryPoolResults = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_LONG,
            ValueLayout.JAVA_LONG,
            ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdPushConstants = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdBeginRenderPass = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkRenderPassBeginInfo.LAYOUT),
            ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdNextSubpass = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdEndRenderPass = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdExecuteCommands = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCreateSharedSwapchainsKHR = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(VkSwapchainCreateInfoKHR.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCreateSwapchainKHR = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkSwapchainCreateInfoKHR.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkDestroySwapchainKHR = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkGetSwapchainImagesKHR = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkAcquireNextImageKHR = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_LONG,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkQueuePresentKHR = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkPresentInfoKHR.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkDebugMarkerSetObjectNameEXT = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkDebugMarkerObjectNameInfoEXT.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkDebugMarkerSetObjectTagEXT = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkDebugMarkerObjectTagInfoEXT.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdDebugMarkerBeginEXT = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkDebugMarkerMarkerInfoEXT.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdDebugMarkerEndEXT = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdDebugMarkerInsertEXT = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkDebugMarkerMarkerInfoEXT.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkGetMemoryWin32HandleNV = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdExecuteGeneratedCommandsNV = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(VkGeneratedCommandsInfoNV.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdPreprocessGeneratedCommandsNV = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkGeneratedCommandsInfoNV.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdBindPipelineShaderGroupNV = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor DESCRIPTOR$vkGetGeneratedCommandsMemoryRequirementsNV = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkGeneratedCommandsMemoryRequirementsInfoNV.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(VkMemoryRequirements2.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCreateIndirectCommandsLayoutNV = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkIndirectCommandsLayoutCreateInfoNV.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkDestroyIndirectCommandsLayoutNV = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdPushDescriptorSetKHR = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(VkWriteDescriptorSet.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkTrimCommandPool = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor DESCRIPTOR$vkGetMemoryWin32HandleKHR = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkMemoryGetWin32HandleInfoKHR.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkGetMemoryWin32HandlePropertiesKHR = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkMemoryWin32HandlePropertiesKHR.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkGetMemoryFdKHR = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkMemoryGetFdInfoKHR.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkGetMemoryFdPropertiesKHR = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(VkMemoryFdPropertiesKHR.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkGetMemoryZirconHandleFUCHSIA = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkMemoryGetZirconHandleInfoFUCHSIA.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkGetMemoryZirconHandlePropertiesFUCHSIA = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(VkMemoryZirconHandlePropertiesFUCHSIA.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkGetMemoryRemoteAddressNV = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkMemoryGetRemoteAddressInfoNV.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkGetMemorySciBufNV = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkMemoryGetSciBufInfoNV.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkGetPhysicalDeviceExternalMemorySciBufPropertiesNV = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkMemorySciBufPropertiesNV.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkGetPhysicalDeviceSciBufAttributesNV = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS
    );

    public static final FunctionDescriptor DESCRIPTOR$vkGetSemaphoreWin32HandleKHR = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkSemaphoreGetWin32HandleInfoKHR.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkImportSemaphoreWin32HandleKHR = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkImportSemaphoreWin32HandleInfoKHR.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkGetSemaphoreFdKHR = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkSemaphoreGetFdInfoKHR.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkImportSemaphoreFdKHR = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkImportSemaphoreFdInfoKHR.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkGetSemaphoreZirconHandleFUCHSIA = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkSemaphoreGetZirconHandleInfoFUCHSIA.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkImportSemaphoreZirconHandleFUCHSIA = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkImportSemaphoreZirconHandleInfoFUCHSIA.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkGetFenceWin32HandleKHR = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkFenceGetWin32HandleInfoKHR.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkImportFenceWin32HandleKHR = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkImportFenceWin32HandleInfoKHR.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkGetFenceFdKHR = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkFenceGetFdInfoKHR.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkImportFenceFdKHR = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkImportFenceFdInfoKHR.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkGetFenceSciSyncFenceNV = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkFenceGetSciSyncInfoNV.LAYOUT),
            ValueLayout.ADDRESS
    );

    public static final FunctionDescriptor DESCRIPTOR$vkGetFenceSciSyncObjNV = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkFenceGetSciSyncInfoNV.LAYOUT),
            ValueLayout.ADDRESS
    );

    public static final FunctionDescriptor DESCRIPTOR$vkImportFenceSciSyncFenceNV = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkImportFenceSciSyncInfoNV.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkImportFenceSciSyncObjNV = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkImportFenceSciSyncInfoNV.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkGetSemaphoreSciSyncObjNV = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkSemaphoreGetSciSyncInfoNV.LAYOUT),
            ValueLayout.ADDRESS
    );

    public static final FunctionDescriptor DESCRIPTOR$vkImportSemaphoreSciSyncObjNV = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkImportSemaphoreSciSyncInfoNV.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkGetPhysicalDeviceSciSyncAttributesNV = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkSciSyncAttributesInfoNV.LAYOUT),
            ValueLayout.ADDRESS
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCreateSemaphoreSciSyncPoolNV = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkSemaphoreSciSyncPoolCreateInfoNV.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkDestroySemaphoreSciSyncPoolNV = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkAcquireWinrtDisplayNV = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS
    );

    public static final FunctionDescriptor DESCRIPTOR$vkGetWinrtDisplayNV = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkDisplayPowerControlEXT = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkDisplayPowerInfoEXT.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkRegisterDeviceEventEXT = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkDeviceEventInfoEXT.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkRegisterDisplayEventEXT = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkDisplayEventInfoEXT.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkGetSwapchainCounterEXT = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_LONG)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkGetDeviceGroupPeerMemoryFeatures = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkBindBufferMemory2 = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(VkBindBufferMemoryInfo.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkBindImageMemory2 = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(VkBindImageMemoryInfo.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdSetDeviceMask = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor DESCRIPTOR$vkGetDeviceGroupPresentCapabilitiesKHR = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkDeviceGroupPresentCapabilitiesKHR.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkGetDeviceGroupSurfacePresentModesKHR = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkAcquireNextImage2KHR = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkAcquireNextImageInfoKHR.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdDispatchBase = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor DESCRIPTOR$vkGetPhysicalDevicePresentRectanglesKHR = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(VkRect2D.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCreateDescriptorUpdateTemplate = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkDescriptorUpdateTemplateCreateInfo.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkDestroyDescriptorUpdateTemplate = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkUpdateDescriptorSetWithTemplate = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdPushDescriptorSetWithTemplateKHR = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS
    );

    public static final FunctionDescriptor DESCRIPTOR$vkSetHdrMetadataEXT = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS),
            ValueLayout.ADDRESS.withTargetLayout(VkHdrMetadataEXT.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkGetSwapchainStatusKHR = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS
    );

    public static final FunctionDescriptor DESCRIPTOR$vkGetRefreshCycleDurationGOOGLE = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkRefreshCycleDurationGOOGLE.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkGetPastPresentationTimingGOOGLE = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(VkPastPresentationTimingGOOGLE.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdSetViewportWScalingNV = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(VkViewportWScalingNV.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdSetDiscardRectangleEXT = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(VkRect2D.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdSetDiscardRectangleEnableEXT = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdSetDiscardRectangleModeEXT = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdSetSampleLocationsEXT = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkSampleLocationsInfoEXT.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkGetPhysicalDeviceMultisamplePropertiesEXT = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(VkMultisamplePropertiesEXT.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkGetBufferMemoryRequirements2 = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkBufferMemoryRequirementsInfo2.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(VkMemoryRequirements2.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkGetImageMemoryRequirements2 = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkImageMemoryRequirementsInfo2.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(VkMemoryRequirements2.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkGetImageSparseMemoryRequirements2 = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkImageSparseMemoryRequirementsInfo2.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(VkSparseImageMemoryRequirements2.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkGetDeviceBufferMemoryRequirements = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkDeviceBufferMemoryRequirements.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(VkMemoryRequirements2.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkGetDeviceImageMemoryRequirements = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkDeviceImageMemoryRequirements.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(VkMemoryRequirements2.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkGetDeviceImageSparseMemoryRequirements = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkDeviceImageMemoryRequirements.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(VkSparseImageMemoryRequirements2.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCreateSamplerYcbcrConversion = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkSamplerYcbcrConversionCreateInfo.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkDestroySamplerYcbcrConversion = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkGetDeviceQueue2 = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkDeviceQueueInfo2.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCreateValidationCacheEXT = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkValidationCacheCreateInfoEXT.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkDestroyValidationCacheEXT = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkGetValidationCacheDataEXT = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(NativeLayout.C_SIZE_T),
            ValueLayout.ADDRESS
    );

    public static final FunctionDescriptor DESCRIPTOR$vkMergeValidationCachesEXT = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkGetDescriptorSetLayoutSupport = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkDescriptorSetLayoutCreateInfo.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(VkDescriptorSetLayoutSupport.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkGetShaderInfoAMD = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(NativeLayout.C_SIZE_T),
            ValueLayout.ADDRESS
    );

    public static final FunctionDescriptor DESCRIPTOR$vkSetLocalDimmingAMD = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor DESCRIPTOR$vkGetPhysicalDeviceCalibrateableTimeDomainsKHR = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkGetCalibratedTimestampsKHR = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(VkCalibratedTimestampInfoKHR.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_LONG),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_LONG)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkGetMemoryHostPointerPropertiesEXT = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkMemoryHostPointerPropertiesEXT.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdWriteBufferMarkerAMD = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_LONG,
            ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCreateRenderPass2 = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkRenderPassCreateInfo2.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdBeginRenderPass2 = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkRenderPassBeginInfo.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(VkSubpassBeginInfo.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdNextSubpass2 = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkSubpassBeginInfo.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(VkSubpassEndInfo.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdEndRenderPass2 = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkSubpassEndInfo.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkGetSemaphoreCounterValue = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_LONG)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkWaitSemaphores = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkSemaphoreWaitInfo.LAYOUT),
            ValueLayout.JAVA_LONG
    );

    public static final FunctionDescriptor DESCRIPTOR$vkSignalSemaphore = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkSemaphoreSignalInfo.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkGetAndroidHardwareBufferPropertiesANDROID = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkAndroidHardwareBufferPropertiesANDROID.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkGetMemoryAndroidHardwareBufferANDROID = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkMemoryGetAndroidHardwareBufferInfoANDROID.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdDrawIndirectCount = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_LONG,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_LONG,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdDrawIndexedIndirectCount = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_LONG,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_LONG,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdSetCheckpointNV = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS
    );

    public static final FunctionDescriptor DESCRIPTOR$vkGetQueueCheckpointDataNV = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(VkCheckpointDataNV.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdBindTransformFeedbackBuffersEXT = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_LONG),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_LONG)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdBeginTransformFeedbackEXT = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_LONG)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdEndTransformFeedbackEXT = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_LONG)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdBeginQueryIndexedEXT = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdEndQueryIndexedEXT = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdDrawIndirectByteCountEXT = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_LONG,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdSetExclusiveScissorNV = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(VkRect2D.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdSetExclusiveScissorEnableNV = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdBindShadingRateImageNV = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdSetViewportShadingRatePaletteNV = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(VkShadingRatePaletteNV.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdSetCoarseSampleOrderNV = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(VkCoarseSampleOrderCustomNV.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdDrawMeshTasksNV = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdDrawMeshTasksIndirectNV = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_LONG,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdDrawMeshTasksIndirectCountNV = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_LONG,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_LONG,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdDrawMeshTasksEXT = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdDrawMeshTasksIndirectEXT = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_LONG,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdDrawMeshTasksIndirectCountEXT = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_LONG,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_LONG,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCompileDeferredNV = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCreateAccelerationStructureNV = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkAccelerationStructureCreateInfoNV.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdBindInvocationMaskHUAWEI = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor DESCRIPTOR$vkDestroyAccelerationStructureKHR = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkDestroyAccelerationStructureNV = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkGetAccelerationStructureMemoryRequirementsNV = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkAccelerationStructureMemoryRequirementsInfoNV.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(VkMemoryRequirements2.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkBindAccelerationStructureMemoryNV = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(VkBindAccelerationStructureMemoryInfoNV.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdCopyAccelerationStructureNV = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdCopyAccelerationStructureKHR = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkCopyAccelerationStructureInfoKHR.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCopyAccelerationStructureKHR = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkCopyAccelerationStructureInfoKHR.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdCopyAccelerationStructureToMemoryKHR = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkCopyAccelerationStructureToMemoryInfoKHR.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCopyAccelerationStructureToMemoryKHR = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkCopyAccelerationStructureToMemoryInfoKHR.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdCopyMemoryToAccelerationStructureKHR = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkCopyMemoryToAccelerationStructureInfoKHR.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCopyMemoryToAccelerationStructureKHR = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkCopyMemoryToAccelerationStructureInfoKHR.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdWriteAccelerationStructuresPropertiesKHR = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS),
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdWriteAccelerationStructuresPropertiesNV = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS),
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdBuildAccelerationStructureNV = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkAccelerationStructureInfoNV.LAYOUT),
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_LONG,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_LONG
    );

    public static final FunctionDescriptor DESCRIPTOR$vkWriteAccelerationStructuresPropertiesKHR = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS),
            ValueLayout.JAVA_INT,
            NativeLayout.C_SIZE_T,
            ValueLayout.ADDRESS,
            NativeLayout.C_SIZE_T
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdTraceRaysKHR = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkStridedDeviceAddressRegionKHR.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(VkStridedDeviceAddressRegionKHR.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(VkStridedDeviceAddressRegionKHR.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(VkStridedDeviceAddressRegionKHR.LAYOUT),
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdTraceRaysNV = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_LONG,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_LONG,
            ValueLayout.JAVA_LONG,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_LONG,
            ValueLayout.JAVA_LONG,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_LONG,
            ValueLayout.JAVA_LONG,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor DESCRIPTOR$vkGetRayTracingShaderGroupHandlesKHR = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            NativeLayout.C_SIZE_T,
            ValueLayout.ADDRESS
    );

    public static final FunctionDescriptor DESCRIPTOR$vkGetRayTracingCaptureReplayShaderGroupHandlesKHR = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            NativeLayout.C_SIZE_T,
            ValueLayout.ADDRESS
    );

    public static final FunctionDescriptor DESCRIPTOR$vkGetAccelerationStructureHandleNV = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            NativeLayout.C_SIZE_T,
            ValueLayout.ADDRESS
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCreateRayTracingPipelinesNV = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(VkRayTracingPipelineCreateInfoNV.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCreateRayTracingPipelinesKHR = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(VkRayTracingPipelineCreateInfoKHR.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkGetPhysicalDeviceCooperativeMatrixPropertiesNV = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(VkCooperativeMatrixPropertiesNV.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdTraceRaysIndirectKHR = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkStridedDeviceAddressRegionKHR.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(VkStridedDeviceAddressRegionKHR.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(VkStridedDeviceAddressRegionKHR.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(VkStridedDeviceAddressRegionKHR.LAYOUT),
            ValueLayout.JAVA_LONG
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdTraceRaysIndirect2KHR = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_LONG
    );

    public static final FunctionDescriptor DESCRIPTOR$vkGetDeviceAccelerationStructureCompatibilityKHR = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkAccelerationStructureVersionInfoKHR.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkGetRayTracingShaderGroupStackSizeKHR = FunctionDescriptor.of(
            ValueLayout.JAVA_LONG,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdSetRayTracingPipelineStackSizeKHR = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor DESCRIPTOR$vkGetImageViewHandleNVX = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkImageViewHandleInfoNVX.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkGetImageViewAddressNVX = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkImageViewAddressPropertiesNVX.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkGetPhysicalDeviceSurfacePresentModes2EXT = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkPhysicalDeviceSurfaceInfo2KHR.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkGetDeviceGroupSurfacePresentModes2EXT = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkPhysicalDeviceSurfaceInfo2KHR.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkAcquireFullScreenExclusiveModeEXT = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS
    );

    public static final FunctionDescriptor DESCRIPTOR$vkReleaseFullScreenExclusiveModeEXT = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS
    );

    public static final FunctionDescriptor DESCRIPTOR$vkEnumeratePhysicalDeviceQueueFamilyPerformanceQueryCountersKHR = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(VkPerformanceCounterKHR.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(VkPerformanceCounterDescriptionKHR.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkGetPhysicalDeviceQueueFamilyPerformanceQueryPassesKHR = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkQueryPoolPerformanceCreateInfoKHR.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkAcquireProfilingLockKHR = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkAcquireProfilingLockInfoKHR.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkReleaseProfilingLockKHR = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS
    );

    public static final FunctionDescriptor DESCRIPTOR$vkGetImageDrmFormatModifierPropertiesEXT = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkImageDrmFormatModifierPropertiesEXT.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkGetBufferOpaqueCaptureAddress = FunctionDescriptor.of(
            ValueLayout.JAVA_LONG,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkBufferDeviceAddressInfo.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkGetBufferDeviceAddress = FunctionDescriptor.of(
            ValueLayout.JAVA_LONG,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkBufferDeviceAddressInfo.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkGetPhysicalDeviceSupportedFramebufferMixedSamplesCombinationsNV = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(VkFramebufferMixedSamplesCombinationNV.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkInitializePerformanceApiINTEL = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkInitializePerformanceApiInfoINTEL.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkUninitializePerformanceApiINTEL = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdSetPerformanceMarkerINTEL = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkPerformanceMarkerInfoINTEL.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdSetPerformanceStreamMarkerINTEL = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkPerformanceStreamMarkerInfoINTEL.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdSetPerformanceOverrideINTEL = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkPerformanceOverrideInfoINTEL.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkAcquirePerformanceConfigurationINTEL = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkPerformanceConfigurationAcquireInfoINTEL.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkReleasePerformanceConfigurationINTEL = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS
    );

    public static final FunctionDescriptor DESCRIPTOR$vkQueueSetPerformanceConfigurationINTEL = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS
    );

    public static final FunctionDescriptor DESCRIPTOR$vkGetPerformanceParameterINTEL = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(VkPerformanceValueINTEL.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkGetDeviceMemoryOpaqueCaptureAddress = FunctionDescriptor.of(
            ValueLayout.JAVA_LONG,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkDeviceMemoryOpaqueCaptureAddressInfo.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkGetPipelineExecutablePropertiesKHR = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkPipelineInfoKHR.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(VkPipelineExecutablePropertiesKHR.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkGetPipelineExecutableStatisticsKHR = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkPipelineExecutableInfoKHR.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(VkPipelineExecutableStatisticKHR.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkGetPipelineExecutableInternalRepresentationsKHR = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkPipelineExecutableInfoKHR.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(VkPipelineExecutableInternalRepresentationKHR.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdSetLineStippleKHR = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_SHORT
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCreateAccelerationStructureKHR = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkAccelerationStructureCreateInfoKHR.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdBuildAccelerationStructuresKHR = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(VkAccelerationStructureBuildGeometryInfoKHR.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS.withTargetLayout(VkAccelerationStructureBuildRangeInfoKHR.LAYOUT))
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdBuildAccelerationStructuresIndirectKHR = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(VkAccelerationStructureBuildGeometryInfoKHR.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_LONG),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT))
    );

    public static final FunctionDescriptor DESCRIPTOR$vkBuildAccelerationStructuresKHR = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(VkAccelerationStructureBuildGeometryInfoKHR.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS.withTargetLayout(VkAccelerationStructureBuildRangeInfoKHR.LAYOUT))
    );

    public static final FunctionDescriptor DESCRIPTOR$vkGetAccelerationStructureDeviceAddressKHR = FunctionDescriptor.of(
            ValueLayout.JAVA_LONG,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkAccelerationStructureDeviceAddressInfoKHR.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCreateDeferredOperationKHR = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkDestroyDeferredOperationKHR = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkGetDeferredOperationMaxConcurrencyKHR = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS
    );

    public static final FunctionDescriptor DESCRIPTOR$vkGetDeferredOperationResultKHR = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS
    );

    public static final FunctionDescriptor DESCRIPTOR$vkDeferredOperationJoinKHR = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS
    );

    public static final FunctionDescriptor DESCRIPTOR$vkGetPipelineIndirectMemoryRequirementsNV = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkComputePipelineCreateInfo.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(VkMemoryRequirements2.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkGetPipelineIndirectDeviceAddressNV = FunctionDescriptor.of(
            ValueLayout.JAVA_LONG,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkPipelineIndirectDeviceAddressInfoNV.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkAntiLagUpdateAMD = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkAntiLagDataAMD.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdSetCullMode = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdSetFrontFace = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdSetPrimitiveTopology = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdSetViewportWithCount = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(VkViewport.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdSetScissorWithCount = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(VkRect2D.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdBindIndexBuffer2KHR = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_LONG,
            ValueLayout.JAVA_LONG,
            ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdBindVertexBuffers2 = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_LONG),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_LONG),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_LONG)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdSetDepthTestEnable = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdSetDepthWriteEnable = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdSetDepthCompareOp = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdSetDepthBoundsTestEnable = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdSetStencilTestEnable = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdSetStencilOp = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdSetPatchControlPointsEXT = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdSetRasterizerDiscardEnable = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdSetDepthBiasEnable = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdSetLogicOpEXT = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdSetPrimitiveRestartEnable = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdSetTessellationDomainOriginEXT = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdSetDepthClampEnableEXT = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdSetPolygonModeEXT = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdSetRasterizationSamplesEXT = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdSetSampleMaskEXT = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdSetAlphaToCoverageEnableEXT = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdSetAlphaToOneEnableEXT = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdSetLogicOpEnableEXT = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdSetColorBlendEnableEXT = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdSetColorBlendEquationEXT = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(VkColorBlendEquationEXT.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdSetColorWriteMaskEXT = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdSetRasterizationStreamEXT = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdSetConservativeRasterizationModeEXT = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdSetExtraPrimitiveOverestimationSizeEXT = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_FLOAT
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdSetDepthClipEnableEXT = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdSetSampleLocationsEnableEXT = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdSetColorBlendAdvancedEXT = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(VkColorBlendAdvancedEXT.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdSetProvokingVertexModeEXT = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdSetLineRasterizationModeEXT = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdSetLineStippleEnableEXT = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdSetDepthClipNegativeOneToOneEXT = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdSetViewportWScalingEnableNV = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdSetViewportSwizzleNV = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(VkViewportSwizzleNV.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdSetCoverageToColorEnableNV = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdSetCoverageToColorLocationNV = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdSetCoverageModulationModeNV = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdSetCoverageModulationTableEnableNV = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdSetCoverageModulationTableNV = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_FLOAT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdSetShadingRateImageEnableNV = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdSetCoverageReductionModeNV = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdSetRepresentativeFragmentTestEnableNV = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCreatePrivateDataSlot = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkPrivateDataSlotCreateInfo.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkDestroyPrivateDataSlot = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkSetPrivateData = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_LONG,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_LONG
    );

    public static final FunctionDescriptor DESCRIPTOR$vkGetPrivateData = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_LONG,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_LONG)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdCopyBuffer2 = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkCopyBufferInfo2.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdCopyImage2 = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkCopyImageInfo2.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdBlitImage2 = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkBlitImageInfo2.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdCopyBufferToImage2 = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkCopyBufferToImageInfo2.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdCopyImageToBuffer2 = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkCopyImageToBufferInfo2.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdResolveImage2 = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkResolveImageInfo2.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdRefreshObjectsKHR = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkRefreshObjectListKHR.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkGetPhysicalDeviceRefreshableObjectTypesKHR = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdSetFragmentShadingRateKHR = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkExtent2D.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkGetPhysicalDeviceFragmentShadingRatesKHR = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(VkPhysicalDeviceFragmentShadingRateKHR.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdSetFragmentShadingRateEnumNV = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkGetAccelerationStructureBuildSizesKHR = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(VkAccelerationStructureBuildGeometryInfoKHR.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(VkAccelerationStructureBuildSizesInfoKHR.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdSetVertexInputEXT = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(VkVertexInputBindingDescription2EXT.LAYOUT),
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(VkVertexInputAttributeDescription2EXT.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdSetColorWriteEnableEXT = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdSetEvent2 = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkDependencyInfo.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdResetEvent2 = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_LONG
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdWaitEvents2 = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS),
            ValueLayout.ADDRESS.withTargetLayout(VkDependencyInfo.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdPipelineBarrier2 = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkDependencyInfo.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkQueueSubmit2 = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(VkSubmitInfo2.LAYOUT),
            ValueLayout.ADDRESS
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdWriteTimestamp2 = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_LONG,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdWriteBufferMarker2AMD = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_LONG,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_LONG,
            ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor DESCRIPTOR$vkGetQueueCheckpointData2NV = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(VkCheckpointData2NV.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCopyMemoryToImageEXT = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkCopyMemoryToImageInfoEXT.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCopyImageToMemoryEXT = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkCopyImageToMemoryInfoEXT.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCopyImageToImageEXT = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkCopyImageToImageInfoEXT.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkTransitionImageLayoutEXT = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(VkHostImageLayoutTransitionInfoEXT.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdDecompressMemoryNV = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(VkDecompressMemoryRegionNV.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdDecompressMemoryIndirectCountNV = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_LONG,
            ValueLayout.JAVA_LONG,
            ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCreateCuModuleNVX = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkCuModuleCreateInfoNVX.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCreateCuFunctionNVX = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkCuFunctionCreateInfoNVX.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkDestroyCuModuleNVX = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkDestroyCuFunctionNVX = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdCuLaunchKernelNVX = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkCuLaunchInfoNVX.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkGetDescriptorSetLayoutSizeEXT = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_LONG)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkGetDescriptorSetLayoutBindingOffsetEXT = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_LONG)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkGetDescriptorEXT = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkDescriptorGetInfoEXT.LAYOUT),
            NativeLayout.C_SIZE_T,
            ValueLayout.ADDRESS
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdBindDescriptorBuffersEXT = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(VkDescriptorBufferBindingInfoEXT.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdSetDescriptorBufferOffsetsEXT = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_LONG)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdBindDescriptorBufferEmbeddedSamplersEXT = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor DESCRIPTOR$vkGetBufferOpaqueCaptureDescriptorDataEXT = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkBufferCaptureDescriptorDataInfoEXT.LAYOUT),
            ValueLayout.ADDRESS
    );

    public static final FunctionDescriptor DESCRIPTOR$vkGetImageOpaqueCaptureDescriptorDataEXT = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkImageCaptureDescriptorDataInfoEXT.LAYOUT),
            ValueLayout.ADDRESS
    );

    public static final FunctionDescriptor DESCRIPTOR$vkGetImageViewOpaqueCaptureDescriptorDataEXT = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkImageViewCaptureDescriptorDataInfoEXT.LAYOUT),
            ValueLayout.ADDRESS
    );

    public static final FunctionDescriptor DESCRIPTOR$vkGetSamplerOpaqueCaptureDescriptorDataEXT = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkSamplerCaptureDescriptorDataInfoEXT.LAYOUT),
            ValueLayout.ADDRESS
    );

    public static final FunctionDescriptor DESCRIPTOR$vkGetAccelerationStructureOpaqueCaptureDescriptorDataEXT = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkAccelerationStructureCaptureDescriptorDataInfoEXT.LAYOUT),
            ValueLayout.ADDRESS
    );

    public static final FunctionDescriptor DESCRIPTOR$vkSetDeviceMemoryPriorityEXT = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_FLOAT
    );

    public static final FunctionDescriptor DESCRIPTOR$vkWaitForPresentKHR = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_LONG,
            ValueLayout.JAVA_LONG
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCreateBufferCollectionFUCHSIA = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkBufferCollectionCreateInfoFUCHSIA.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkSetBufferCollectionBufferConstraintsFUCHSIA = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkBufferConstraintsInfoFUCHSIA.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkSetBufferCollectionImageConstraintsFUCHSIA = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkImageConstraintsInfoFUCHSIA.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkDestroyBufferCollectionFUCHSIA = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkGetBufferCollectionPropertiesFUCHSIA = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkBufferCollectionPropertiesFUCHSIA.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCreateCudaModuleNV = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkCudaModuleCreateInfoNV.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkGetCudaModuleCacheNV = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(NativeLayout.C_SIZE_T),
            ValueLayout.ADDRESS
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCreateCudaFunctionNV = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkCudaFunctionCreateInfoNV.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkDestroyCudaModuleNV = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkDestroyCudaFunctionNV = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdCudaLaunchKernelNV = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkCudaLaunchInfoNV.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdBeginRendering = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkRenderingInfo.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdEndRendering = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS
    );

    public static final FunctionDescriptor DESCRIPTOR$vkGetDescriptorSetLayoutHostMappingInfoVALVE = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkDescriptorSetBindingReferenceVALVE.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(VkDescriptorSetLayoutHostMappingInfoVALVE.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkGetDescriptorSetHostMappingVALVE = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCreateMicromapEXT = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkMicromapCreateInfoEXT.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdBuildMicromapsEXT = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(VkMicromapBuildInfoEXT.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkBuildMicromapsEXT = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(VkMicromapBuildInfoEXT.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkDestroyMicromapEXT = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdCopyMicromapEXT = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkCopyMicromapInfoEXT.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCopyMicromapEXT = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkCopyMicromapInfoEXT.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdCopyMicromapToMemoryEXT = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkCopyMicromapToMemoryInfoEXT.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCopyMicromapToMemoryEXT = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkCopyMicromapToMemoryInfoEXT.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdCopyMemoryToMicromapEXT = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkCopyMemoryToMicromapInfoEXT.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCopyMemoryToMicromapEXT = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkCopyMemoryToMicromapInfoEXT.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdWriteMicromapsPropertiesEXT = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS),
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor DESCRIPTOR$vkWriteMicromapsPropertiesEXT = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS),
            ValueLayout.JAVA_INT,
            NativeLayout.C_SIZE_T,
            ValueLayout.ADDRESS,
            NativeLayout.C_SIZE_T
    );

    public static final FunctionDescriptor DESCRIPTOR$vkGetDeviceMicromapCompatibilityEXT = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkMicromapVersionInfoEXT.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkGetMicromapBuildSizesEXT = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(VkMicromapBuildInfoEXT.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(VkMicromapBuildSizesInfoEXT.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkGetShaderModuleIdentifierEXT = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkShaderModuleIdentifierEXT.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkGetShaderModuleCreateInfoIdentifierEXT = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkShaderModuleCreateInfo.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(VkShaderModuleIdentifierEXT.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkGetImageSubresourceLayout2KHR = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkImageSubresource2KHR.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(VkSubresourceLayout2KHR.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkGetPipelinePropertiesEXT = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkPipelineInfoKHR.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(VkBaseOutStructure.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkExportMetalObjectsEXT = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkExportMetalObjectsInfoEXT.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkGetFramebufferTilePropertiesQCOM = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(VkTilePropertiesQCOM.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkGetDynamicRenderingTilePropertiesQCOM = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkRenderingInfo.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(VkTilePropertiesQCOM.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkGetPhysicalDeviceOpticalFlowImageFormatsNV = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkOpticalFlowImageFormatInfoNV.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(VkOpticalFlowImageFormatPropertiesNV.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCreateOpticalFlowSessionNV = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkOpticalFlowSessionCreateInfoNV.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkDestroyOpticalFlowSessionNV = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkBindOpticalFlowSessionImageNV = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdOpticalFlowExecuteNV = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkOpticalFlowExecuteInfoNV.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkGetDeviceFaultInfoEXT = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkDeviceFaultCountsEXT.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(VkDeviceFaultInfoEXT.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdSetDepthBias2EXT = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkDepthBiasInfoEXT.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkReleaseSwapchainImagesEXT = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkReleaseSwapchainImagesInfoEXT.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkGetDeviceImageSubresourceLayoutKHR = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkDeviceImageSubresourceInfoKHR.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(VkSubresourceLayout2KHR.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkMapMemory2KHR = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkMemoryMapInfoKHR.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkUnmapMemory2KHR = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkMemoryUnmapInfoKHR.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCreateShadersEXT = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(VkShaderCreateInfoEXT.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkDestroyShaderEXT = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkGetShaderBinaryDataEXT = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(NativeLayout.C_SIZE_T),
            ValueLayout.ADDRESS
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdBindShadersEXT = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkGetScreenBufferPropertiesQNX = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkScreenBufferPropertiesQNX.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkGetPhysicalDeviceCooperativeMatrixPropertiesKHR = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(VkCooperativeMatrixPropertiesKHR.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkGetExecutionGraphPipelineScratchSizeAMDX = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkExecutionGraphPipelineScratchSizeAMDX.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkGetExecutionGraphPipelineNodeIndexAMDX = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkPipelineShaderStageNodeCreateInfoAMDX.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCreateExecutionGraphPipelinesAMDX = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(VkExecutionGraphPipelineCreateInfoAMDX.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdInitializeGraphScratchMemoryAMDX = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_LONG
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdDispatchGraphAMDX = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_LONG,
            ValueLayout.ADDRESS.withTargetLayout(VkDispatchGraphCountInfoAMDX.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdDispatchGraphIndirectAMDX = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_LONG,
            ValueLayout.ADDRESS.withTargetLayout(VkDispatchGraphCountInfoAMDX.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdDispatchGraphIndirectCountAMDX = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_LONG,
            ValueLayout.JAVA_LONG
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdBindDescriptorSets2KHR = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkBindDescriptorSetsInfoKHR.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdPushConstants2KHR = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkPushConstantsInfoKHR.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdPushDescriptorSet2KHR = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkPushDescriptorSetInfoKHR.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdPushDescriptorSetWithTemplate2KHR = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkPushDescriptorSetWithTemplateInfoKHR.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdSetDescriptorBufferOffsets2EXT = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkSetDescriptorBufferOffsetsInfoEXT.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdBindDescriptorBufferEmbeddedSamplers2EXT = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkBindDescriptorBufferEmbeddedSamplersInfoEXT.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkSetLatencySleepModeNV = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkLatencySleepModeInfoNV.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkLatencySleepNV = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkLatencySleepInfoNV.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkSetLatencyMarkerNV = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkSetLatencyMarkerInfoNV.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkGetLatencyTimingsNV = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkGetLatencyMarkerInfoNV.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkQueueNotifyOutOfBandNV = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkOutOfBandQueueTypeInfoNV.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdSetRenderingAttachmentLocationsKHR = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkRenderingAttachmentLocationInfoKHR.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdSetRenderingInputAttachmentIndicesKHR = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkRenderingInputAttachmentIndexInfoKHR.LAYOUT)
    );

    public final @nullable MethodHandle HANDLE$vkDestroyDevice;
    public final @nullable MethodHandle HANDLE$vkGetDeviceQueue;
    public final @nullable MethodHandle HANDLE$vkQueueSubmit;
    public final @nullable MethodHandle HANDLE$vkQueueWaitIdle;
    public final @nullable MethodHandle HANDLE$vkDeviceWaitIdle;
    public final @nullable MethodHandle HANDLE$vkAllocateMemory;
    public final @nullable MethodHandle HANDLE$vkFreeMemory;
    public final @nullable MethodHandle HANDLE$vkMapMemory;
    public final @nullable MethodHandle HANDLE$vkUnmapMemory;
    public final @nullable MethodHandle HANDLE$vkFlushMappedMemoryRanges;
    public final @nullable MethodHandle HANDLE$vkInvalidateMappedMemoryRanges;
    public final @nullable MethodHandle HANDLE$vkGetDeviceMemoryCommitment;
    public final @nullable MethodHandle HANDLE$vkGetBufferMemoryRequirements;
    public final @nullable MethodHandle HANDLE$vkBindBufferMemory;
    public final @nullable MethodHandle HANDLE$vkGetImageMemoryRequirements;
    public final @nullable MethodHandle HANDLE$vkBindImageMemory;
    public final @nullable MethodHandle HANDLE$vkGetImageSparseMemoryRequirements;
    public final @nullable MethodHandle HANDLE$vkQueueBindSparse;
    public final @nullable MethodHandle HANDLE$vkCreateFence;
    public final @nullable MethodHandle HANDLE$vkDestroyFence;
    public final @nullable MethodHandle HANDLE$vkResetFences;
    public final @nullable MethodHandle HANDLE$vkGetFenceStatus;
    public final @nullable MethodHandle HANDLE$vkWaitForFences;
    public final @nullable MethodHandle HANDLE$vkCreateSemaphore;
    public final @nullable MethodHandle HANDLE$vkDestroySemaphore;
    public final @nullable MethodHandle HANDLE$vkCreateEvent;
    public final @nullable MethodHandle HANDLE$vkDestroyEvent;
    public final @nullable MethodHandle HANDLE$vkGetEventStatus;
    public final @nullable MethodHandle HANDLE$vkSetEvent;
    public final @nullable MethodHandle HANDLE$vkResetEvent;
    public final @nullable MethodHandle HANDLE$vkCreateQueryPool;
    public final @nullable MethodHandle HANDLE$vkDestroyQueryPool;
    public final @nullable MethodHandle HANDLE$vkGetQueryPoolResults;
    public final @nullable MethodHandle HANDLE$vkResetQueryPool;
    public final @nullable MethodHandle HANDLE$vkCreateBuffer;
    public final @nullable MethodHandle HANDLE$vkDestroyBuffer;
    public final @nullable MethodHandle HANDLE$vkCreateBufferView;
    public final @nullable MethodHandle HANDLE$vkDestroyBufferView;
    public final @nullable MethodHandle HANDLE$vkCreateImage;
    public final @nullable MethodHandle HANDLE$vkDestroyImage;
    public final @nullable MethodHandle HANDLE$vkGetImageSubresourceLayout;
    public final @nullable MethodHandle HANDLE$vkCreateImageView;
    public final @nullable MethodHandle HANDLE$vkDestroyImageView;
    public final @nullable MethodHandle HANDLE$vkCreateShaderModule;
    public final @nullable MethodHandle HANDLE$vkDestroyShaderModule;
    public final @nullable MethodHandle HANDLE$vkCreatePipelineCache;
    public final @nullable MethodHandle HANDLE$vkDestroyPipelineCache;
    public final @nullable MethodHandle HANDLE$vkGetPipelineCacheData;
    public final @nullable MethodHandle HANDLE$vkMergePipelineCaches;
    public final @nullable MethodHandle HANDLE$vkCreatePipelineBinariesKHR;
    public final @nullable MethodHandle HANDLE$vkDestroyPipelineBinaryKHR;
    public final @nullable MethodHandle HANDLE$vkGetPipelineKeyKHR;
    public final @nullable MethodHandle HANDLE$vkGetPipelineBinaryDataKHR;
    public final @nullable MethodHandle HANDLE$vkReleaseCapturedPipelineDataKHR;
    public final @nullable MethodHandle HANDLE$vkCreateGraphicsPipelines;
    public final @nullable MethodHandle HANDLE$vkCreateComputePipelines;
    public final @nullable MethodHandle HANDLE$vkGetDeviceSubpassShadingMaxWorkgroupSizeHUAWEI;
    public final @nullable MethodHandle HANDLE$vkDestroyPipeline;
    public final @nullable MethodHandle HANDLE$vkCreatePipelineLayout;
    public final @nullable MethodHandle HANDLE$vkDestroyPipelineLayout;
    public final @nullable MethodHandle HANDLE$vkCreateSampler;
    public final @nullable MethodHandle HANDLE$vkDestroySampler;
    public final @nullable MethodHandle HANDLE$vkCreateDescriptorSetLayout;
    public final @nullable MethodHandle HANDLE$vkDestroyDescriptorSetLayout;
    public final @nullable MethodHandle HANDLE$vkCreateDescriptorPool;
    public final @nullable MethodHandle HANDLE$vkDestroyDescriptorPool;
    public final @nullable MethodHandle HANDLE$vkResetDescriptorPool;
    public final @nullable MethodHandle HANDLE$vkAllocateDescriptorSets;
    public final @nullable MethodHandle HANDLE$vkFreeDescriptorSets;
    public final @nullable MethodHandle HANDLE$vkUpdateDescriptorSets;
    public final @nullable MethodHandle HANDLE$vkCreateFramebuffer;
    public final @nullable MethodHandle HANDLE$vkDestroyFramebuffer;
    public final @nullable MethodHandle HANDLE$vkCreateRenderPass;
    public final @nullable MethodHandle HANDLE$vkDestroyRenderPass;
    public final @nullable MethodHandle HANDLE$vkGetRenderAreaGranularity;
    public final @nullable MethodHandle HANDLE$vkGetRenderingAreaGranularityKHR;
    public final @nullable MethodHandle HANDLE$vkCreateCommandPool;
    public final @nullable MethodHandle HANDLE$vkDestroyCommandPool;
    public final @nullable MethodHandle HANDLE$vkResetCommandPool;
    public final @nullable MethodHandle HANDLE$vkAllocateCommandBuffers;
    public final @nullable MethodHandle HANDLE$vkFreeCommandBuffers;
    public final @nullable MethodHandle HANDLE$vkBeginCommandBuffer;
    public final @nullable MethodHandle HANDLE$vkEndCommandBuffer;
    public final @nullable MethodHandle HANDLE$vkResetCommandBuffer;
    public final @nullable MethodHandle HANDLE$vkCmdBindPipeline;
    public final @nullable MethodHandle HANDLE$vkCmdSetAttachmentFeedbackLoopEnableEXT;
    public final @nullable MethodHandle HANDLE$vkCmdSetViewport;
    public final @nullable MethodHandle HANDLE$vkCmdSetScissor;
    public final @nullable MethodHandle HANDLE$vkCmdSetLineWidth;
    public final @nullable MethodHandle HANDLE$vkCmdSetDepthBias;
    public final @nullable MethodHandle HANDLE$vkCmdSetBlendConstants;
    public final @nullable MethodHandle HANDLE$vkCmdSetDepthBounds;
    public final @nullable MethodHandle HANDLE$vkCmdSetStencilCompareMask;
    public final @nullable MethodHandle HANDLE$vkCmdSetStencilWriteMask;
    public final @nullable MethodHandle HANDLE$vkCmdSetStencilReference;
    public final @nullable MethodHandle HANDLE$vkCmdBindDescriptorSets;
    public final @nullable MethodHandle HANDLE$vkCmdBindIndexBuffer;
    public final @nullable MethodHandle HANDLE$vkCmdBindVertexBuffers;
    public final @nullable MethodHandle HANDLE$vkCmdDraw;
    public final @nullable MethodHandle HANDLE$vkCmdDrawIndexed;
    public final @nullable MethodHandle HANDLE$vkCmdDrawMultiEXT;
    public final @nullable MethodHandle HANDLE$vkCmdDrawMultiIndexedEXT;
    public final @nullable MethodHandle HANDLE$vkCmdDrawIndirect;
    public final @nullable MethodHandle HANDLE$vkCmdDrawIndexedIndirect;
    public final @nullable MethodHandle HANDLE$vkCmdDispatch;
    public final @nullable MethodHandle HANDLE$vkCmdDispatchIndirect;
    public final @nullable MethodHandle HANDLE$vkCmdSubpassShadingHUAWEI;
    public final @nullable MethodHandle HANDLE$vkCmdDrawClusterHUAWEI;
    public final @nullable MethodHandle HANDLE$vkCmdDrawClusterIndirectHUAWEI;
    public final @nullable MethodHandle HANDLE$vkCmdUpdatePipelineIndirectBufferNV;
    public final @nullable MethodHandle HANDLE$vkCmdCopyBuffer;
    public final @nullable MethodHandle HANDLE$vkCmdCopyImage;
    public final @nullable MethodHandle HANDLE$vkCmdBlitImage;
    public final @nullable MethodHandle HANDLE$vkCmdCopyBufferToImage;
    public final @nullable MethodHandle HANDLE$vkCmdCopyImageToBuffer;
    public final @nullable MethodHandle HANDLE$vkCmdCopyMemoryIndirectNV;
    public final @nullable MethodHandle HANDLE$vkCmdCopyMemoryToImageIndirectNV;
    public final @nullable MethodHandle HANDLE$vkCmdUpdateBuffer;
    public final @nullable MethodHandle HANDLE$vkCmdFillBuffer;
    public final @nullable MethodHandle HANDLE$vkCmdClearColorImage;
    public final @nullable MethodHandle HANDLE$vkCmdClearDepthStencilImage;
    public final @nullable MethodHandle HANDLE$vkCmdClearAttachments;
    public final @nullable MethodHandle HANDLE$vkCmdResolveImage;
    public final @nullable MethodHandle HANDLE$vkCmdSetEvent;
    public final @nullable MethodHandle HANDLE$vkCmdResetEvent;
    public final @nullable MethodHandle HANDLE$vkCmdWaitEvents;
    public final @nullable MethodHandle HANDLE$vkCmdPipelineBarrier;
    public final @nullable MethodHandle HANDLE$vkCmdBeginQuery;
    public final @nullable MethodHandle HANDLE$vkCmdEndQuery;
    public final @nullable MethodHandle HANDLE$vkCmdBeginConditionalRenderingEXT;
    public final @nullable MethodHandle HANDLE$vkCmdEndConditionalRenderingEXT;
    public final @nullable MethodHandle HANDLE$vkCmdResetQueryPool;
    public final @nullable MethodHandle HANDLE$vkCmdWriteTimestamp;
    public final @nullable MethodHandle HANDLE$vkCmdCopyQueryPoolResults;
    public final @nullable MethodHandle HANDLE$vkCmdPushConstants;
    public final @nullable MethodHandle HANDLE$vkCmdBeginRenderPass;
    public final @nullable MethodHandle HANDLE$vkCmdNextSubpass;
    public final @nullable MethodHandle HANDLE$vkCmdEndRenderPass;
    public final @nullable MethodHandle HANDLE$vkCmdExecuteCommands;
    public final @nullable MethodHandle HANDLE$vkCreateSharedSwapchainsKHR;
    public final @nullable MethodHandle HANDLE$vkCreateSwapchainKHR;
    public final @nullable MethodHandle HANDLE$vkDestroySwapchainKHR;
    public final @nullable MethodHandle HANDLE$vkGetSwapchainImagesKHR;
    public final @nullable MethodHandle HANDLE$vkAcquireNextImageKHR;
    public final @nullable MethodHandle HANDLE$vkQueuePresentKHR;
    public final @nullable MethodHandle HANDLE$vkDebugMarkerSetObjectNameEXT;
    public final @nullable MethodHandle HANDLE$vkDebugMarkerSetObjectTagEXT;
    public final @nullable MethodHandle HANDLE$vkCmdDebugMarkerBeginEXT;
    public final @nullable MethodHandle HANDLE$vkCmdDebugMarkerEndEXT;
    public final @nullable MethodHandle HANDLE$vkCmdDebugMarkerInsertEXT;
    public final @nullable MethodHandle HANDLE$vkGetMemoryWin32HandleNV;
    public final @nullable MethodHandle HANDLE$vkCmdExecuteGeneratedCommandsNV;
    public final @nullable MethodHandle HANDLE$vkCmdPreprocessGeneratedCommandsNV;
    public final @nullable MethodHandle HANDLE$vkCmdBindPipelineShaderGroupNV;
    public final @nullable MethodHandle HANDLE$vkGetGeneratedCommandsMemoryRequirementsNV;
    public final @nullable MethodHandle HANDLE$vkCreateIndirectCommandsLayoutNV;
    public final @nullable MethodHandle HANDLE$vkDestroyIndirectCommandsLayoutNV;
    public final @nullable MethodHandle HANDLE$vkCmdPushDescriptorSetKHR;
    public final @nullable MethodHandle HANDLE$vkTrimCommandPool;
    public final @nullable MethodHandle HANDLE$vkGetMemoryWin32HandleKHR;
    public final @nullable MethodHandle HANDLE$vkGetMemoryWin32HandlePropertiesKHR;
    public final @nullable MethodHandle HANDLE$vkGetMemoryFdKHR;
    public final @nullable MethodHandle HANDLE$vkGetMemoryFdPropertiesKHR;
    public final @nullable MethodHandle HANDLE$vkGetMemoryZirconHandleFUCHSIA;
    public final @nullable MethodHandle HANDLE$vkGetMemoryZirconHandlePropertiesFUCHSIA;
    public final @nullable MethodHandle HANDLE$vkGetMemoryRemoteAddressNV;
    public final @nullable MethodHandle HANDLE$vkGetMemorySciBufNV;
    public final @nullable MethodHandle HANDLE$vkGetPhysicalDeviceExternalMemorySciBufPropertiesNV;
    public final @nullable MethodHandle HANDLE$vkGetPhysicalDeviceSciBufAttributesNV;
    public final @nullable MethodHandle HANDLE$vkGetSemaphoreWin32HandleKHR;
    public final @nullable MethodHandle HANDLE$vkImportSemaphoreWin32HandleKHR;
    public final @nullable MethodHandle HANDLE$vkGetSemaphoreFdKHR;
    public final @nullable MethodHandle HANDLE$vkImportSemaphoreFdKHR;
    public final @nullable MethodHandle HANDLE$vkGetSemaphoreZirconHandleFUCHSIA;
    public final @nullable MethodHandle HANDLE$vkImportSemaphoreZirconHandleFUCHSIA;
    public final @nullable MethodHandle HANDLE$vkGetFenceWin32HandleKHR;
    public final @nullable MethodHandle HANDLE$vkImportFenceWin32HandleKHR;
    public final @nullable MethodHandle HANDLE$vkGetFenceFdKHR;
    public final @nullable MethodHandle HANDLE$vkImportFenceFdKHR;
    public final @nullable MethodHandle HANDLE$vkGetFenceSciSyncFenceNV;
    public final @nullable MethodHandle HANDLE$vkGetFenceSciSyncObjNV;
    public final @nullable MethodHandle HANDLE$vkImportFenceSciSyncFenceNV;
    public final @nullable MethodHandle HANDLE$vkImportFenceSciSyncObjNV;
    public final @nullable MethodHandle HANDLE$vkGetSemaphoreSciSyncObjNV;
    public final @nullable MethodHandle HANDLE$vkImportSemaphoreSciSyncObjNV;
    public final @nullable MethodHandle HANDLE$vkGetPhysicalDeviceSciSyncAttributesNV;
    public final @nullable MethodHandle HANDLE$vkCreateSemaphoreSciSyncPoolNV;
    public final @nullable MethodHandle HANDLE$vkDestroySemaphoreSciSyncPoolNV;
    public final @nullable MethodHandle HANDLE$vkAcquireWinrtDisplayNV;
    public final @nullable MethodHandle HANDLE$vkGetWinrtDisplayNV;
    public final @nullable MethodHandle HANDLE$vkDisplayPowerControlEXT;
    public final @nullable MethodHandle HANDLE$vkRegisterDeviceEventEXT;
    public final @nullable MethodHandle HANDLE$vkRegisterDisplayEventEXT;
    public final @nullable MethodHandle HANDLE$vkGetSwapchainCounterEXT;
    public final @nullable MethodHandle HANDLE$vkGetDeviceGroupPeerMemoryFeatures;
    public final @nullable MethodHandle HANDLE$vkBindBufferMemory2;
    public final @nullable MethodHandle HANDLE$vkBindImageMemory2;
    public final @nullable MethodHandle HANDLE$vkCmdSetDeviceMask;
    public final @nullable MethodHandle HANDLE$vkGetDeviceGroupPresentCapabilitiesKHR;
    public final @nullable MethodHandle HANDLE$vkGetDeviceGroupSurfacePresentModesKHR;
    public final @nullable MethodHandle HANDLE$vkAcquireNextImage2KHR;
    public final @nullable MethodHandle HANDLE$vkCmdDispatchBase;
    public final @nullable MethodHandle HANDLE$vkGetPhysicalDevicePresentRectanglesKHR;
    public final @nullable MethodHandle HANDLE$vkCreateDescriptorUpdateTemplate;
    public final @nullable MethodHandle HANDLE$vkDestroyDescriptorUpdateTemplate;
    public final @nullable MethodHandle HANDLE$vkUpdateDescriptorSetWithTemplate;
    public final @nullable MethodHandle HANDLE$vkCmdPushDescriptorSetWithTemplateKHR;
    public final @nullable MethodHandle HANDLE$vkSetHdrMetadataEXT;
    public final @nullable MethodHandle HANDLE$vkGetSwapchainStatusKHR;
    public final @nullable MethodHandle HANDLE$vkGetRefreshCycleDurationGOOGLE;
    public final @nullable MethodHandle HANDLE$vkGetPastPresentationTimingGOOGLE;
    public final @nullable MethodHandle HANDLE$vkCmdSetViewportWScalingNV;
    public final @nullable MethodHandle HANDLE$vkCmdSetDiscardRectangleEXT;
    public final @nullable MethodHandle HANDLE$vkCmdSetDiscardRectangleEnableEXT;
    public final @nullable MethodHandle HANDLE$vkCmdSetDiscardRectangleModeEXT;
    public final @nullable MethodHandle HANDLE$vkCmdSetSampleLocationsEXT;
    public final @nullable MethodHandle HANDLE$vkGetPhysicalDeviceMultisamplePropertiesEXT;
    public final @nullable MethodHandle HANDLE$vkGetBufferMemoryRequirements2;
    public final @nullable MethodHandle HANDLE$vkGetImageMemoryRequirements2;
    public final @nullable MethodHandle HANDLE$vkGetImageSparseMemoryRequirements2;
    public final @nullable MethodHandle HANDLE$vkGetDeviceBufferMemoryRequirements;
    public final @nullable MethodHandle HANDLE$vkGetDeviceImageMemoryRequirements;
    public final @nullable MethodHandle HANDLE$vkGetDeviceImageSparseMemoryRequirements;
    public final @nullable MethodHandle HANDLE$vkCreateSamplerYcbcrConversion;
    public final @nullable MethodHandle HANDLE$vkDestroySamplerYcbcrConversion;
    public final @nullable MethodHandle HANDLE$vkGetDeviceQueue2;
    public final @nullable MethodHandle HANDLE$vkCreateValidationCacheEXT;
    public final @nullable MethodHandle HANDLE$vkDestroyValidationCacheEXT;
    public final @nullable MethodHandle HANDLE$vkGetValidationCacheDataEXT;
    public final @nullable MethodHandle HANDLE$vkMergeValidationCachesEXT;
    public final @nullable MethodHandle HANDLE$vkGetDescriptorSetLayoutSupport;
    public final @nullable MethodHandle HANDLE$vkGetShaderInfoAMD;
    public final @nullable MethodHandle HANDLE$vkSetLocalDimmingAMD;
    public final @nullable MethodHandle HANDLE$vkGetPhysicalDeviceCalibrateableTimeDomainsKHR;
    public final @nullable MethodHandle HANDLE$vkGetCalibratedTimestampsKHR;
    public final @nullable MethodHandle HANDLE$vkGetMemoryHostPointerPropertiesEXT;
    public final @nullable MethodHandle HANDLE$vkCmdWriteBufferMarkerAMD;
    public final @nullable MethodHandle HANDLE$vkCreateRenderPass2;
    public final @nullable MethodHandle HANDLE$vkCmdBeginRenderPass2;
    public final @nullable MethodHandle HANDLE$vkCmdNextSubpass2;
    public final @nullable MethodHandle HANDLE$vkCmdEndRenderPass2;
    public final @nullable MethodHandle HANDLE$vkGetSemaphoreCounterValue;
    public final @nullable MethodHandle HANDLE$vkWaitSemaphores;
    public final @nullable MethodHandle HANDLE$vkSignalSemaphore;
    public final @nullable MethodHandle HANDLE$vkGetAndroidHardwareBufferPropertiesANDROID;
    public final @nullable MethodHandle HANDLE$vkGetMemoryAndroidHardwareBufferANDROID;
    public final @nullable MethodHandle HANDLE$vkCmdDrawIndirectCount;
    public final @nullable MethodHandle HANDLE$vkCmdDrawIndexedIndirectCount;
    public final @nullable MethodHandle HANDLE$vkCmdSetCheckpointNV;
    public final @nullable MethodHandle HANDLE$vkGetQueueCheckpointDataNV;
    public final @nullable MethodHandle HANDLE$vkCmdBindTransformFeedbackBuffersEXT;
    public final @nullable MethodHandle HANDLE$vkCmdBeginTransformFeedbackEXT;
    public final @nullable MethodHandle HANDLE$vkCmdEndTransformFeedbackEXT;
    public final @nullable MethodHandle HANDLE$vkCmdBeginQueryIndexedEXT;
    public final @nullable MethodHandle HANDLE$vkCmdEndQueryIndexedEXT;
    public final @nullable MethodHandle HANDLE$vkCmdDrawIndirectByteCountEXT;
    public final @nullable MethodHandle HANDLE$vkCmdSetExclusiveScissorNV;
    public final @nullable MethodHandle HANDLE$vkCmdSetExclusiveScissorEnableNV;
    public final @nullable MethodHandle HANDLE$vkCmdBindShadingRateImageNV;
    public final @nullable MethodHandle HANDLE$vkCmdSetViewportShadingRatePaletteNV;
    public final @nullable MethodHandle HANDLE$vkCmdSetCoarseSampleOrderNV;
    public final @nullable MethodHandle HANDLE$vkCmdDrawMeshTasksNV;
    public final @nullable MethodHandle HANDLE$vkCmdDrawMeshTasksIndirectNV;
    public final @nullable MethodHandle HANDLE$vkCmdDrawMeshTasksIndirectCountNV;
    public final @nullable MethodHandle HANDLE$vkCmdDrawMeshTasksEXT;
    public final @nullable MethodHandle HANDLE$vkCmdDrawMeshTasksIndirectEXT;
    public final @nullable MethodHandle HANDLE$vkCmdDrawMeshTasksIndirectCountEXT;
    public final @nullable MethodHandle HANDLE$vkCompileDeferredNV;
    public final @nullable MethodHandle HANDLE$vkCreateAccelerationStructureNV;
    public final @nullable MethodHandle HANDLE$vkCmdBindInvocationMaskHUAWEI;
    public final @nullable MethodHandle HANDLE$vkDestroyAccelerationStructureKHR;
    public final @nullable MethodHandle HANDLE$vkDestroyAccelerationStructureNV;
    public final @nullable MethodHandle HANDLE$vkGetAccelerationStructureMemoryRequirementsNV;
    public final @nullable MethodHandle HANDLE$vkBindAccelerationStructureMemoryNV;
    public final @nullable MethodHandle HANDLE$vkCmdCopyAccelerationStructureNV;
    public final @nullable MethodHandle HANDLE$vkCmdCopyAccelerationStructureKHR;
    public final @nullable MethodHandle HANDLE$vkCopyAccelerationStructureKHR;
    public final @nullable MethodHandle HANDLE$vkCmdCopyAccelerationStructureToMemoryKHR;
    public final @nullable MethodHandle HANDLE$vkCopyAccelerationStructureToMemoryKHR;
    public final @nullable MethodHandle HANDLE$vkCmdCopyMemoryToAccelerationStructureKHR;
    public final @nullable MethodHandle HANDLE$vkCopyMemoryToAccelerationStructureKHR;
    public final @nullable MethodHandle HANDLE$vkCmdWriteAccelerationStructuresPropertiesKHR;
    public final @nullable MethodHandle HANDLE$vkCmdWriteAccelerationStructuresPropertiesNV;
    public final @nullable MethodHandle HANDLE$vkCmdBuildAccelerationStructureNV;
    public final @nullable MethodHandle HANDLE$vkWriteAccelerationStructuresPropertiesKHR;
    public final @nullable MethodHandle HANDLE$vkCmdTraceRaysKHR;
    public final @nullable MethodHandle HANDLE$vkCmdTraceRaysNV;
    public final @nullable MethodHandle HANDLE$vkGetRayTracingShaderGroupHandlesKHR;
    public final @nullable MethodHandle HANDLE$vkGetRayTracingCaptureReplayShaderGroupHandlesKHR;
    public final @nullable MethodHandle HANDLE$vkGetAccelerationStructureHandleNV;
    public final @nullable MethodHandle HANDLE$vkCreateRayTracingPipelinesNV;
    public final @nullable MethodHandle HANDLE$vkCreateRayTracingPipelinesKHR;
    public final @nullable MethodHandle HANDLE$vkGetPhysicalDeviceCooperativeMatrixPropertiesNV;
    public final @nullable MethodHandle HANDLE$vkCmdTraceRaysIndirectKHR;
    public final @nullable MethodHandle HANDLE$vkCmdTraceRaysIndirect2KHR;
    public final @nullable MethodHandle HANDLE$vkGetDeviceAccelerationStructureCompatibilityKHR;
    public final @nullable MethodHandle HANDLE$vkGetRayTracingShaderGroupStackSizeKHR;
    public final @nullable MethodHandle HANDLE$vkCmdSetRayTracingPipelineStackSizeKHR;
    public final @nullable MethodHandle HANDLE$vkGetImageViewHandleNVX;
    public final @nullable MethodHandle HANDLE$vkGetImageViewAddressNVX;
    public final @nullable MethodHandle HANDLE$vkGetPhysicalDeviceSurfacePresentModes2EXT;
    public final @nullable MethodHandle HANDLE$vkGetDeviceGroupSurfacePresentModes2EXT;
    public final @nullable MethodHandle HANDLE$vkAcquireFullScreenExclusiveModeEXT;
    public final @nullable MethodHandle HANDLE$vkReleaseFullScreenExclusiveModeEXT;
    public final @nullable MethodHandle HANDLE$vkEnumeratePhysicalDeviceQueueFamilyPerformanceQueryCountersKHR;
    public final @nullable MethodHandle HANDLE$vkGetPhysicalDeviceQueueFamilyPerformanceQueryPassesKHR;
    public final @nullable MethodHandle HANDLE$vkAcquireProfilingLockKHR;
    public final @nullable MethodHandle HANDLE$vkReleaseProfilingLockKHR;
    public final @nullable MethodHandle HANDLE$vkGetImageDrmFormatModifierPropertiesEXT;
    public final @nullable MethodHandle HANDLE$vkGetBufferOpaqueCaptureAddress;
    public final @nullable MethodHandle HANDLE$vkGetBufferDeviceAddress;
    public final @nullable MethodHandle HANDLE$vkGetPhysicalDeviceSupportedFramebufferMixedSamplesCombinationsNV;
    public final @nullable MethodHandle HANDLE$vkInitializePerformanceApiINTEL;
    public final @nullable MethodHandle HANDLE$vkUninitializePerformanceApiINTEL;
    public final @nullable MethodHandle HANDLE$vkCmdSetPerformanceMarkerINTEL;
    public final @nullable MethodHandle HANDLE$vkCmdSetPerformanceStreamMarkerINTEL;
    public final @nullable MethodHandle HANDLE$vkCmdSetPerformanceOverrideINTEL;
    public final @nullable MethodHandle HANDLE$vkAcquirePerformanceConfigurationINTEL;
    public final @nullable MethodHandle HANDLE$vkReleasePerformanceConfigurationINTEL;
    public final @nullable MethodHandle HANDLE$vkQueueSetPerformanceConfigurationINTEL;
    public final @nullable MethodHandle HANDLE$vkGetPerformanceParameterINTEL;
    public final @nullable MethodHandle HANDLE$vkGetDeviceMemoryOpaqueCaptureAddress;
    public final @nullable MethodHandle HANDLE$vkGetPipelineExecutablePropertiesKHR;
    public final @nullable MethodHandle HANDLE$vkGetPipelineExecutableStatisticsKHR;
    public final @nullable MethodHandle HANDLE$vkGetPipelineExecutableInternalRepresentationsKHR;
    public final @nullable MethodHandle HANDLE$vkCmdSetLineStippleKHR;
    public final @nullable MethodHandle HANDLE$vkCreateAccelerationStructureKHR;
    public final @nullable MethodHandle HANDLE$vkCmdBuildAccelerationStructuresKHR;
    public final @nullable MethodHandle HANDLE$vkCmdBuildAccelerationStructuresIndirectKHR;
    public final @nullable MethodHandle HANDLE$vkBuildAccelerationStructuresKHR;
    public final @nullable MethodHandle HANDLE$vkGetAccelerationStructureDeviceAddressKHR;
    public final @nullable MethodHandle HANDLE$vkCreateDeferredOperationKHR;
    public final @nullable MethodHandle HANDLE$vkDestroyDeferredOperationKHR;
    public final @nullable MethodHandle HANDLE$vkGetDeferredOperationMaxConcurrencyKHR;
    public final @nullable MethodHandle HANDLE$vkGetDeferredOperationResultKHR;
    public final @nullable MethodHandle HANDLE$vkDeferredOperationJoinKHR;
    public final @nullable MethodHandle HANDLE$vkGetPipelineIndirectMemoryRequirementsNV;
    public final @nullable MethodHandle HANDLE$vkGetPipelineIndirectDeviceAddressNV;
    public final @nullable MethodHandle HANDLE$vkAntiLagUpdateAMD;
    public final @nullable MethodHandle HANDLE$vkCmdSetCullMode;
    public final @nullable MethodHandle HANDLE$vkCmdSetFrontFace;
    public final @nullable MethodHandle HANDLE$vkCmdSetPrimitiveTopology;
    public final @nullable MethodHandle HANDLE$vkCmdSetViewportWithCount;
    public final @nullable MethodHandle HANDLE$vkCmdSetScissorWithCount;
    public final @nullable MethodHandle HANDLE$vkCmdBindIndexBuffer2KHR;
    public final @nullable MethodHandle HANDLE$vkCmdBindVertexBuffers2;
    public final @nullable MethodHandle HANDLE$vkCmdSetDepthTestEnable;
    public final @nullable MethodHandle HANDLE$vkCmdSetDepthWriteEnable;
    public final @nullable MethodHandle HANDLE$vkCmdSetDepthCompareOp;
    public final @nullable MethodHandle HANDLE$vkCmdSetDepthBoundsTestEnable;
    public final @nullable MethodHandle HANDLE$vkCmdSetStencilTestEnable;
    public final @nullable MethodHandle HANDLE$vkCmdSetStencilOp;
    public final @nullable MethodHandle HANDLE$vkCmdSetPatchControlPointsEXT;
    public final @nullable MethodHandle HANDLE$vkCmdSetRasterizerDiscardEnable;
    public final @nullable MethodHandle HANDLE$vkCmdSetDepthBiasEnable;
    public final @nullable MethodHandle HANDLE$vkCmdSetLogicOpEXT;
    public final @nullable MethodHandle HANDLE$vkCmdSetPrimitiveRestartEnable;
    public final @nullable MethodHandle HANDLE$vkCmdSetTessellationDomainOriginEXT;
    public final @nullable MethodHandle HANDLE$vkCmdSetDepthClampEnableEXT;
    public final @nullable MethodHandle HANDLE$vkCmdSetPolygonModeEXT;
    public final @nullable MethodHandle HANDLE$vkCmdSetRasterizationSamplesEXT;
    public final @nullable MethodHandle HANDLE$vkCmdSetSampleMaskEXT;
    public final @nullable MethodHandle HANDLE$vkCmdSetAlphaToCoverageEnableEXT;
    public final @nullable MethodHandle HANDLE$vkCmdSetAlphaToOneEnableEXT;
    public final @nullable MethodHandle HANDLE$vkCmdSetLogicOpEnableEXT;
    public final @nullable MethodHandle HANDLE$vkCmdSetColorBlendEnableEXT;
    public final @nullable MethodHandle HANDLE$vkCmdSetColorBlendEquationEXT;
    public final @nullable MethodHandle HANDLE$vkCmdSetColorWriteMaskEXT;
    public final @nullable MethodHandle HANDLE$vkCmdSetRasterizationStreamEXT;
    public final @nullable MethodHandle HANDLE$vkCmdSetConservativeRasterizationModeEXT;
    public final @nullable MethodHandle HANDLE$vkCmdSetExtraPrimitiveOverestimationSizeEXT;
    public final @nullable MethodHandle HANDLE$vkCmdSetDepthClipEnableEXT;
    public final @nullable MethodHandle HANDLE$vkCmdSetSampleLocationsEnableEXT;
    public final @nullable MethodHandle HANDLE$vkCmdSetColorBlendAdvancedEXT;
    public final @nullable MethodHandle HANDLE$vkCmdSetProvokingVertexModeEXT;
    public final @nullable MethodHandle HANDLE$vkCmdSetLineRasterizationModeEXT;
    public final @nullable MethodHandle HANDLE$vkCmdSetLineStippleEnableEXT;
    public final @nullable MethodHandle HANDLE$vkCmdSetDepthClipNegativeOneToOneEXT;
    public final @nullable MethodHandle HANDLE$vkCmdSetViewportWScalingEnableNV;
    public final @nullable MethodHandle HANDLE$vkCmdSetViewportSwizzleNV;
    public final @nullable MethodHandle HANDLE$vkCmdSetCoverageToColorEnableNV;
    public final @nullable MethodHandle HANDLE$vkCmdSetCoverageToColorLocationNV;
    public final @nullable MethodHandle HANDLE$vkCmdSetCoverageModulationModeNV;
    public final @nullable MethodHandle HANDLE$vkCmdSetCoverageModulationTableEnableNV;
    public final @nullable MethodHandle HANDLE$vkCmdSetCoverageModulationTableNV;
    public final @nullable MethodHandle HANDLE$vkCmdSetShadingRateImageEnableNV;
    public final @nullable MethodHandle HANDLE$vkCmdSetCoverageReductionModeNV;
    public final @nullable MethodHandle HANDLE$vkCmdSetRepresentativeFragmentTestEnableNV;
    public final @nullable MethodHandle HANDLE$vkCreatePrivateDataSlot;
    public final @nullable MethodHandle HANDLE$vkDestroyPrivateDataSlot;
    public final @nullable MethodHandle HANDLE$vkSetPrivateData;
    public final @nullable MethodHandle HANDLE$vkGetPrivateData;
    public final @nullable MethodHandle HANDLE$vkCmdCopyBuffer2;
    public final @nullable MethodHandle HANDLE$vkCmdCopyImage2;
    public final @nullable MethodHandle HANDLE$vkCmdBlitImage2;
    public final @nullable MethodHandle HANDLE$vkCmdCopyBufferToImage2;
    public final @nullable MethodHandle HANDLE$vkCmdCopyImageToBuffer2;
    public final @nullable MethodHandle HANDLE$vkCmdResolveImage2;
    public final @nullable MethodHandle HANDLE$vkCmdRefreshObjectsKHR;
    public final @nullable MethodHandle HANDLE$vkGetPhysicalDeviceRefreshableObjectTypesKHR;
    public final @nullable MethodHandle HANDLE$vkCmdSetFragmentShadingRateKHR;
    public final @nullable MethodHandle HANDLE$vkGetPhysicalDeviceFragmentShadingRatesKHR;
    public final @nullable MethodHandle HANDLE$vkCmdSetFragmentShadingRateEnumNV;
    public final @nullable MethodHandle HANDLE$vkGetAccelerationStructureBuildSizesKHR;
    public final @nullable MethodHandle HANDLE$vkCmdSetVertexInputEXT;
    public final @nullable MethodHandle HANDLE$vkCmdSetColorWriteEnableEXT;
    public final @nullable MethodHandle HANDLE$vkCmdSetEvent2;
    public final @nullable MethodHandle HANDLE$vkCmdResetEvent2;
    public final @nullable MethodHandle HANDLE$vkCmdWaitEvents2;
    public final @nullable MethodHandle HANDLE$vkCmdPipelineBarrier2;
    public final @nullable MethodHandle HANDLE$vkQueueSubmit2;
    public final @nullable MethodHandle HANDLE$vkCmdWriteTimestamp2;
    public final @nullable MethodHandle HANDLE$vkCmdWriteBufferMarker2AMD;
    public final @nullable MethodHandle HANDLE$vkGetQueueCheckpointData2NV;
    public final @nullable MethodHandle HANDLE$vkCopyMemoryToImageEXT;
    public final @nullable MethodHandle HANDLE$vkCopyImageToMemoryEXT;
    public final @nullable MethodHandle HANDLE$vkCopyImageToImageEXT;
    public final @nullable MethodHandle HANDLE$vkTransitionImageLayoutEXT;
    public final @nullable MethodHandle HANDLE$vkCmdDecompressMemoryNV;
    public final @nullable MethodHandle HANDLE$vkCmdDecompressMemoryIndirectCountNV;
    public final @nullable MethodHandle HANDLE$vkCreateCuModuleNVX;
    public final @nullable MethodHandle HANDLE$vkCreateCuFunctionNVX;
    public final @nullable MethodHandle HANDLE$vkDestroyCuModuleNVX;
    public final @nullable MethodHandle HANDLE$vkDestroyCuFunctionNVX;
    public final @nullable MethodHandle HANDLE$vkCmdCuLaunchKernelNVX;
    public final @nullable MethodHandle HANDLE$vkGetDescriptorSetLayoutSizeEXT;
    public final @nullable MethodHandle HANDLE$vkGetDescriptorSetLayoutBindingOffsetEXT;
    public final @nullable MethodHandle HANDLE$vkGetDescriptorEXT;
    public final @nullable MethodHandle HANDLE$vkCmdBindDescriptorBuffersEXT;
    public final @nullable MethodHandle HANDLE$vkCmdSetDescriptorBufferOffsetsEXT;
    public final @nullable MethodHandle HANDLE$vkCmdBindDescriptorBufferEmbeddedSamplersEXT;
    public final @nullable MethodHandle HANDLE$vkGetBufferOpaqueCaptureDescriptorDataEXT;
    public final @nullable MethodHandle HANDLE$vkGetImageOpaqueCaptureDescriptorDataEXT;
    public final @nullable MethodHandle HANDLE$vkGetImageViewOpaqueCaptureDescriptorDataEXT;
    public final @nullable MethodHandle HANDLE$vkGetSamplerOpaqueCaptureDescriptorDataEXT;
    public final @nullable MethodHandle HANDLE$vkGetAccelerationStructureOpaqueCaptureDescriptorDataEXT;
    public final @nullable MethodHandle HANDLE$vkSetDeviceMemoryPriorityEXT;
    public final @nullable MethodHandle HANDLE$vkWaitForPresentKHR;
    public final @nullable MethodHandle HANDLE$vkCreateBufferCollectionFUCHSIA;
    public final @nullable MethodHandle HANDLE$vkSetBufferCollectionBufferConstraintsFUCHSIA;
    public final @nullable MethodHandle HANDLE$vkSetBufferCollectionImageConstraintsFUCHSIA;
    public final @nullable MethodHandle HANDLE$vkDestroyBufferCollectionFUCHSIA;
    public final @nullable MethodHandle HANDLE$vkGetBufferCollectionPropertiesFUCHSIA;
    public final @nullable MethodHandle HANDLE$vkCreateCudaModuleNV;
    public final @nullable MethodHandle HANDLE$vkGetCudaModuleCacheNV;
    public final @nullable MethodHandle HANDLE$vkCreateCudaFunctionNV;
    public final @nullable MethodHandle HANDLE$vkDestroyCudaModuleNV;
    public final @nullable MethodHandle HANDLE$vkDestroyCudaFunctionNV;
    public final @nullable MethodHandle HANDLE$vkCmdCudaLaunchKernelNV;
    public final @nullable MethodHandle HANDLE$vkCmdBeginRendering;
    public final @nullable MethodHandle HANDLE$vkCmdEndRendering;
    public final @nullable MethodHandle HANDLE$vkGetDescriptorSetLayoutHostMappingInfoVALVE;
    public final @nullable MethodHandle HANDLE$vkGetDescriptorSetHostMappingVALVE;
    public final @nullable MethodHandle HANDLE$vkCreateMicromapEXT;
    public final @nullable MethodHandle HANDLE$vkCmdBuildMicromapsEXT;
    public final @nullable MethodHandle HANDLE$vkBuildMicromapsEXT;
    public final @nullable MethodHandle HANDLE$vkDestroyMicromapEXT;
    public final @nullable MethodHandle HANDLE$vkCmdCopyMicromapEXT;
    public final @nullable MethodHandle HANDLE$vkCopyMicromapEXT;
    public final @nullable MethodHandle HANDLE$vkCmdCopyMicromapToMemoryEXT;
    public final @nullable MethodHandle HANDLE$vkCopyMicromapToMemoryEXT;
    public final @nullable MethodHandle HANDLE$vkCmdCopyMemoryToMicromapEXT;
    public final @nullable MethodHandle HANDLE$vkCopyMemoryToMicromapEXT;
    public final @nullable MethodHandle HANDLE$vkCmdWriteMicromapsPropertiesEXT;
    public final @nullable MethodHandle HANDLE$vkWriteMicromapsPropertiesEXT;
    public final @nullable MethodHandle HANDLE$vkGetDeviceMicromapCompatibilityEXT;
    public final @nullable MethodHandle HANDLE$vkGetMicromapBuildSizesEXT;
    public final @nullable MethodHandle HANDLE$vkGetShaderModuleIdentifierEXT;
    public final @nullable MethodHandle HANDLE$vkGetShaderModuleCreateInfoIdentifierEXT;
    public final @nullable MethodHandle HANDLE$vkGetImageSubresourceLayout2KHR;
    public final @nullable MethodHandle HANDLE$vkGetPipelinePropertiesEXT;
    public final @nullable MethodHandle HANDLE$vkExportMetalObjectsEXT;
    public final @nullable MethodHandle HANDLE$vkGetFramebufferTilePropertiesQCOM;
    public final @nullable MethodHandle HANDLE$vkGetDynamicRenderingTilePropertiesQCOM;
    public final @nullable MethodHandle HANDLE$vkGetPhysicalDeviceOpticalFlowImageFormatsNV;
    public final @nullable MethodHandle HANDLE$vkCreateOpticalFlowSessionNV;
    public final @nullable MethodHandle HANDLE$vkDestroyOpticalFlowSessionNV;
    public final @nullable MethodHandle HANDLE$vkBindOpticalFlowSessionImageNV;
    public final @nullable MethodHandle HANDLE$vkCmdOpticalFlowExecuteNV;
    public final @nullable MethodHandle HANDLE$vkGetDeviceFaultInfoEXT;
    public final @nullable MethodHandle HANDLE$vkCmdSetDepthBias2EXT;
    public final @nullable MethodHandle HANDLE$vkReleaseSwapchainImagesEXT;
    public final @nullable MethodHandle HANDLE$vkGetDeviceImageSubresourceLayoutKHR;
    public final @nullable MethodHandle HANDLE$vkMapMemory2KHR;
    public final @nullable MethodHandle HANDLE$vkUnmapMemory2KHR;
    public final @nullable MethodHandle HANDLE$vkCreateShadersEXT;
    public final @nullable MethodHandle HANDLE$vkDestroyShaderEXT;
    public final @nullable MethodHandle HANDLE$vkGetShaderBinaryDataEXT;
    public final @nullable MethodHandle HANDLE$vkCmdBindShadersEXT;
    public final @nullable MethodHandle HANDLE$vkGetScreenBufferPropertiesQNX;
    public final @nullable MethodHandle HANDLE$vkGetPhysicalDeviceCooperativeMatrixPropertiesKHR;
    public final @nullable MethodHandle HANDLE$vkGetExecutionGraphPipelineScratchSizeAMDX;
    public final @nullable MethodHandle HANDLE$vkGetExecutionGraphPipelineNodeIndexAMDX;
    public final @nullable MethodHandle HANDLE$vkCreateExecutionGraphPipelinesAMDX;
    public final @nullable MethodHandle HANDLE$vkCmdInitializeGraphScratchMemoryAMDX;
    public final @nullable MethodHandle HANDLE$vkCmdDispatchGraphAMDX;
    public final @nullable MethodHandle HANDLE$vkCmdDispatchGraphIndirectAMDX;
    public final @nullable MethodHandle HANDLE$vkCmdDispatchGraphIndirectCountAMDX;
    public final @nullable MethodHandle HANDLE$vkCmdBindDescriptorSets2KHR;
    public final @nullable MethodHandle HANDLE$vkCmdPushConstants2KHR;
    public final @nullable MethodHandle HANDLE$vkCmdPushDescriptorSet2KHR;
    public final @nullable MethodHandle HANDLE$vkCmdPushDescriptorSetWithTemplate2KHR;
    public final @nullable MethodHandle HANDLE$vkCmdSetDescriptorBufferOffsets2EXT;
    public final @nullable MethodHandle HANDLE$vkCmdBindDescriptorBufferEmbeddedSamplers2EXT;
    public final @nullable MethodHandle HANDLE$vkSetLatencySleepModeNV;
    public final @nullable MethodHandle HANDLE$vkLatencySleepNV;
    public final @nullable MethodHandle HANDLE$vkSetLatencyMarkerNV;
    public final @nullable MethodHandle HANDLE$vkGetLatencyTimingsNV;
    public final @nullable MethodHandle HANDLE$vkQueueNotifyOutOfBandNV;
    public final @nullable MethodHandle HANDLE$vkCmdSetRenderingAttachmentLocationsKHR;
    public final @nullable MethodHandle HANDLE$vkCmdSetRenderingInputAttachmentIndicesKHR;

    public DeviceCommands(FunctionLoader loader, FunctionLoader instanceLoader) {
        HANDLE$vkDestroyDevice = loader.apply("vkDestroyDevice", DESCRIPTOR$vkDestroyDevice);
        HANDLE$vkGetDeviceQueue = loader.apply("vkGetDeviceQueue", DESCRIPTOR$vkGetDeviceQueue);
        HANDLE$vkQueueSubmit = loader.apply("vkQueueSubmit", DESCRIPTOR$vkQueueSubmit);
        HANDLE$vkQueueWaitIdle = loader.apply("vkQueueWaitIdle", DESCRIPTOR$vkQueueWaitIdle);
        HANDLE$vkDeviceWaitIdle = loader.apply("vkDeviceWaitIdle", DESCRIPTOR$vkDeviceWaitIdle);
        HANDLE$vkAllocateMemory = loader.apply("vkAllocateMemory", DESCRIPTOR$vkAllocateMemory);
        HANDLE$vkFreeMemory = loader.apply("vkFreeMemory", DESCRIPTOR$vkFreeMemory);
        HANDLE$vkMapMemory = loader.apply("vkMapMemory", DESCRIPTOR$vkMapMemory);
        HANDLE$vkUnmapMemory = loader.apply("vkUnmapMemory", DESCRIPTOR$vkUnmapMemory);
        HANDLE$vkFlushMappedMemoryRanges = loader.apply("vkFlushMappedMemoryRanges", DESCRIPTOR$vkFlushMappedMemoryRanges);
        HANDLE$vkInvalidateMappedMemoryRanges = loader.apply("vkInvalidateMappedMemoryRanges", DESCRIPTOR$vkInvalidateMappedMemoryRanges);
        HANDLE$vkGetDeviceMemoryCommitment = loader.apply("vkGetDeviceMemoryCommitment", DESCRIPTOR$vkGetDeviceMemoryCommitment);
        HANDLE$vkGetBufferMemoryRequirements = loader.apply("vkGetBufferMemoryRequirements", DESCRIPTOR$vkGetBufferMemoryRequirements);
        HANDLE$vkBindBufferMemory = loader.apply("vkBindBufferMemory", DESCRIPTOR$vkBindBufferMemory);
        HANDLE$vkGetImageMemoryRequirements = loader.apply("vkGetImageMemoryRequirements", DESCRIPTOR$vkGetImageMemoryRequirements);
        HANDLE$vkBindImageMemory = loader.apply("vkBindImageMemory", DESCRIPTOR$vkBindImageMemory);
        HANDLE$vkGetImageSparseMemoryRequirements = loader.apply("vkGetImageSparseMemoryRequirements", DESCRIPTOR$vkGetImageSparseMemoryRequirements);
        HANDLE$vkQueueBindSparse = loader.apply("vkQueueBindSparse", DESCRIPTOR$vkQueueBindSparse);
        HANDLE$vkCreateFence = loader.apply("vkCreateFence", DESCRIPTOR$vkCreateFence);
        HANDLE$vkDestroyFence = loader.apply("vkDestroyFence", DESCRIPTOR$vkDestroyFence);
        HANDLE$vkResetFences = loader.apply("vkResetFences", DESCRIPTOR$vkResetFences);
        HANDLE$vkGetFenceStatus = loader.apply("vkGetFenceStatus", DESCRIPTOR$vkGetFenceStatus);
        HANDLE$vkWaitForFences = loader.apply("vkWaitForFences", DESCRIPTOR$vkWaitForFences);
        HANDLE$vkCreateSemaphore = loader.apply("vkCreateSemaphore", DESCRIPTOR$vkCreateSemaphore);
        HANDLE$vkDestroySemaphore = loader.apply("vkDestroySemaphore", DESCRIPTOR$vkDestroySemaphore);
        HANDLE$vkCreateEvent = loader.apply("vkCreateEvent", DESCRIPTOR$vkCreateEvent);
        HANDLE$vkDestroyEvent = loader.apply("vkDestroyEvent", DESCRIPTOR$vkDestroyEvent);
        HANDLE$vkGetEventStatus = loader.apply("vkGetEventStatus", DESCRIPTOR$vkGetEventStatus);
        HANDLE$vkSetEvent = loader.apply("vkSetEvent", DESCRIPTOR$vkSetEvent);
        HANDLE$vkResetEvent = loader.apply("vkResetEvent", DESCRIPTOR$vkResetEvent);
        HANDLE$vkCreateQueryPool = loader.apply("vkCreateQueryPool", DESCRIPTOR$vkCreateQueryPool);
        HANDLE$vkDestroyQueryPool = loader.apply("vkDestroyQueryPool", DESCRIPTOR$vkDestroyQueryPool);
        HANDLE$vkGetQueryPoolResults = loader.apply("vkGetQueryPoolResults", DESCRIPTOR$vkGetQueryPoolResults);
        HANDLE$vkResetQueryPool = loader.apply("vkResetQueryPool", DESCRIPTOR$vkResetQueryPool);
        HANDLE$vkCreateBuffer = loader.apply("vkCreateBuffer", DESCRIPTOR$vkCreateBuffer);
        HANDLE$vkDestroyBuffer = loader.apply("vkDestroyBuffer", DESCRIPTOR$vkDestroyBuffer);
        HANDLE$vkCreateBufferView = loader.apply("vkCreateBufferView", DESCRIPTOR$vkCreateBufferView);
        HANDLE$vkDestroyBufferView = loader.apply("vkDestroyBufferView", DESCRIPTOR$vkDestroyBufferView);
        HANDLE$vkCreateImage = loader.apply("vkCreateImage", DESCRIPTOR$vkCreateImage);
        HANDLE$vkDestroyImage = loader.apply("vkDestroyImage", DESCRIPTOR$vkDestroyImage);
        HANDLE$vkGetImageSubresourceLayout = loader.apply("vkGetImageSubresourceLayout", DESCRIPTOR$vkGetImageSubresourceLayout);
        HANDLE$vkCreateImageView = loader.apply("vkCreateImageView", DESCRIPTOR$vkCreateImageView);
        HANDLE$vkDestroyImageView = loader.apply("vkDestroyImageView", DESCRIPTOR$vkDestroyImageView);
        HANDLE$vkCreateShaderModule = loader.apply("vkCreateShaderModule", DESCRIPTOR$vkCreateShaderModule);
        HANDLE$vkDestroyShaderModule = loader.apply("vkDestroyShaderModule", DESCRIPTOR$vkDestroyShaderModule);
        HANDLE$vkCreatePipelineCache = loader.apply("vkCreatePipelineCache", DESCRIPTOR$vkCreatePipelineCache);
        HANDLE$vkDestroyPipelineCache = loader.apply("vkDestroyPipelineCache", DESCRIPTOR$vkDestroyPipelineCache);
        HANDLE$vkGetPipelineCacheData = loader.apply("vkGetPipelineCacheData", DESCRIPTOR$vkGetPipelineCacheData);
        HANDLE$vkMergePipelineCaches = loader.apply("vkMergePipelineCaches", DESCRIPTOR$vkMergePipelineCaches);
        HANDLE$vkCreatePipelineBinariesKHR = loader.apply("vkCreatePipelineBinariesKHR", DESCRIPTOR$vkCreatePipelineBinariesKHR);
        HANDLE$vkDestroyPipelineBinaryKHR = loader.apply("vkDestroyPipelineBinaryKHR", DESCRIPTOR$vkDestroyPipelineBinaryKHR);
        HANDLE$vkGetPipelineKeyKHR = loader.apply("vkGetPipelineKeyKHR", DESCRIPTOR$vkGetPipelineKeyKHR);
        HANDLE$vkGetPipelineBinaryDataKHR = loader.apply("vkGetPipelineBinaryDataKHR", DESCRIPTOR$vkGetPipelineBinaryDataKHR);
        HANDLE$vkReleaseCapturedPipelineDataKHR = loader.apply("vkReleaseCapturedPipelineDataKHR", DESCRIPTOR$vkReleaseCapturedPipelineDataKHR);
        HANDLE$vkCreateGraphicsPipelines = loader.apply("vkCreateGraphicsPipelines", DESCRIPTOR$vkCreateGraphicsPipelines);
        HANDLE$vkCreateComputePipelines = loader.apply("vkCreateComputePipelines", DESCRIPTOR$vkCreateComputePipelines);
        HANDLE$vkGetDeviceSubpassShadingMaxWorkgroupSizeHUAWEI = loader.apply("vkGetDeviceSubpassShadingMaxWorkgroupSizeHUAWEI", DESCRIPTOR$vkGetDeviceSubpassShadingMaxWorkgroupSizeHUAWEI);
        HANDLE$vkDestroyPipeline = loader.apply("vkDestroyPipeline", DESCRIPTOR$vkDestroyPipeline);
        HANDLE$vkCreatePipelineLayout = loader.apply("vkCreatePipelineLayout", DESCRIPTOR$vkCreatePipelineLayout);
        HANDLE$vkDestroyPipelineLayout = loader.apply("vkDestroyPipelineLayout", DESCRIPTOR$vkDestroyPipelineLayout);
        HANDLE$vkCreateSampler = loader.apply("vkCreateSampler", DESCRIPTOR$vkCreateSampler);
        HANDLE$vkDestroySampler = loader.apply("vkDestroySampler", DESCRIPTOR$vkDestroySampler);
        HANDLE$vkCreateDescriptorSetLayout = loader.apply("vkCreateDescriptorSetLayout", DESCRIPTOR$vkCreateDescriptorSetLayout);
        HANDLE$vkDestroyDescriptorSetLayout = loader.apply("vkDestroyDescriptorSetLayout", DESCRIPTOR$vkDestroyDescriptorSetLayout);
        HANDLE$vkCreateDescriptorPool = loader.apply("vkCreateDescriptorPool", DESCRIPTOR$vkCreateDescriptorPool);
        HANDLE$vkDestroyDescriptorPool = loader.apply("vkDestroyDescriptorPool", DESCRIPTOR$vkDestroyDescriptorPool);
        HANDLE$vkResetDescriptorPool = loader.apply("vkResetDescriptorPool", DESCRIPTOR$vkResetDescriptorPool);
        HANDLE$vkAllocateDescriptorSets = loader.apply("vkAllocateDescriptorSets", DESCRIPTOR$vkAllocateDescriptorSets);
        HANDLE$vkFreeDescriptorSets = loader.apply("vkFreeDescriptorSets", DESCRIPTOR$vkFreeDescriptorSets);
        HANDLE$vkUpdateDescriptorSets = loader.apply("vkUpdateDescriptorSets", DESCRIPTOR$vkUpdateDescriptorSets);
        HANDLE$vkCreateFramebuffer = loader.apply("vkCreateFramebuffer", DESCRIPTOR$vkCreateFramebuffer);
        HANDLE$vkDestroyFramebuffer = loader.apply("vkDestroyFramebuffer", DESCRIPTOR$vkDestroyFramebuffer);
        HANDLE$vkCreateRenderPass = loader.apply("vkCreateRenderPass", DESCRIPTOR$vkCreateRenderPass);
        HANDLE$vkDestroyRenderPass = loader.apply("vkDestroyRenderPass", DESCRIPTOR$vkDestroyRenderPass);
        HANDLE$vkGetRenderAreaGranularity = loader.apply("vkGetRenderAreaGranularity", DESCRIPTOR$vkGetRenderAreaGranularity);
        HANDLE$vkGetRenderingAreaGranularityKHR = loader.apply("vkGetRenderingAreaGranularityKHR", DESCRIPTOR$vkGetRenderingAreaGranularityKHR);
        HANDLE$vkCreateCommandPool = loader.apply("vkCreateCommandPool", DESCRIPTOR$vkCreateCommandPool);
        HANDLE$vkDestroyCommandPool = loader.apply("vkDestroyCommandPool", DESCRIPTOR$vkDestroyCommandPool);
        HANDLE$vkResetCommandPool = loader.apply("vkResetCommandPool", DESCRIPTOR$vkResetCommandPool);
        HANDLE$vkAllocateCommandBuffers = loader.apply("vkAllocateCommandBuffers", DESCRIPTOR$vkAllocateCommandBuffers);
        HANDLE$vkFreeCommandBuffers = loader.apply("vkFreeCommandBuffers", DESCRIPTOR$vkFreeCommandBuffers);
        HANDLE$vkBeginCommandBuffer = loader.apply("vkBeginCommandBuffer", DESCRIPTOR$vkBeginCommandBuffer);
        HANDLE$vkEndCommandBuffer = loader.apply("vkEndCommandBuffer", DESCRIPTOR$vkEndCommandBuffer);
        HANDLE$vkResetCommandBuffer = loader.apply("vkResetCommandBuffer", DESCRIPTOR$vkResetCommandBuffer);
        HANDLE$vkCmdBindPipeline = loader.apply("vkCmdBindPipeline", DESCRIPTOR$vkCmdBindPipeline);
        HANDLE$vkCmdSetAttachmentFeedbackLoopEnableEXT = loader.apply("vkCmdSetAttachmentFeedbackLoopEnableEXT", DESCRIPTOR$vkCmdSetAttachmentFeedbackLoopEnableEXT);
        HANDLE$vkCmdSetViewport = loader.apply("vkCmdSetViewport", DESCRIPTOR$vkCmdSetViewport);
        HANDLE$vkCmdSetScissor = loader.apply("vkCmdSetScissor", DESCRIPTOR$vkCmdSetScissor);
        HANDLE$vkCmdSetLineWidth = loader.apply("vkCmdSetLineWidth", DESCRIPTOR$vkCmdSetLineWidth);
        HANDLE$vkCmdSetDepthBias = loader.apply("vkCmdSetDepthBias", DESCRIPTOR$vkCmdSetDepthBias);
        HANDLE$vkCmdSetBlendConstants = loader.apply("vkCmdSetBlendConstants", DESCRIPTOR$vkCmdSetBlendConstants);
        HANDLE$vkCmdSetDepthBounds = loader.apply("vkCmdSetDepthBounds", DESCRIPTOR$vkCmdSetDepthBounds);
        HANDLE$vkCmdSetStencilCompareMask = loader.apply("vkCmdSetStencilCompareMask", DESCRIPTOR$vkCmdSetStencilCompareMask);
        HANDLE$vkCmdSetStencilWriteMask = loader.apply("vkCmdSetStencilWriteMask", DESCRIPTOR$vkCmdSetStencilWriteMask);
        HANDLE$vkCmdSetStencilReference = loader.apply("vkCmdSetStencilReference", DESCRIPTOR$vkCmdSetStencilReference);
        HANDLE$vkCmdBindDescriptorSets = loader.apply("vkCmdBindDescriptorSets", DESCRIPTOR$vkCmdBindDescriptorSets);
        HANDLE$vkCmdBindIndexBuffer = loader.apply("vkCmdBindIndexBuffer", DESCRIPTOR$vkCmdBindIndexBuffer);
        HANDLE$vkCmdBindVertexBuffers = loader.apply("vkCmdBindVertexBuffers", DESCRIPTOR$vkCmdBindVertexBuffers);
        HANDLE$vkCmdDraw = loader.apply("vkCmdDraw", DESCRIPTOR$vkCmdDraw);
        HANDLE$vkCmdDrawIndexed = loader.apply("vkCmdDrawIndexed", DESCRIPTOR$vkCmdDrawIndexed);
        HANDLE$vkCmdDrawMultiEXT = loader.apply("vkCmdDrawMultiEXT", DESCRIPTOR$vkCmdDrawMultiEXT);
        HANDLE$vkCmdDrawMultiIndexedEXT = loader.apply("vkCmdDrawMultiIndexedEXT", DESCRIPTOR$vkCmdDrawMultiIndexedEXT);
        HANDLE$vkCmdDrawIndirect = loader.apply("vkCmdDrawIndirect", DESCRIPTOR$vkCmdDrawIndirect);
        HANDLE$vkCmdDrawIndexedIndirect = loader.apply("vkCmdDrawIndexedIndirect", DESCRIPTOR$vkCmdDrawIndexedIndirect);
        HANDLE$vkCmdDispatch = loader.apply("vkCmdDispatch", DESCRIPTOR$vkCmdDispatch);
        HANDLE$vkCmdDispatchIndirect = loader.apply("vkCmdDispatchIndirect", DESCRIPTOR$vkCmdDispatchIndirect);
        HANDLE$vkCmdSubpassShadingHUAWEI = loader.apply("vkCmdSubpassShadingHUAWEI", DESCRIPTOR$vkCmdSubpassShadingHUAWEI);
        HANDLE$vkCmdDrawClusterHUAWEI = loader.apply("vkCmdDrawClusterHUAWEI", DESCRIPTOR$vkCmdDrawClusterHUAWEI);
        HANDLE$vkCmdDrawClusterIndirectHUAWEI = loader.apply("vkCmdDrawClusterIndirectHUAWEI", DESCRIPTOR$vkCmdDrawClusterIndirectHUAWEI);
        HANDLE$vkCmdUpdatePipelineIndirectBufferNV = loader.apply("vkCmdUpdatePipelineIndirectBufferNV", DESCRIPTOR$vkCmdUpdatePipelineIndirectBufferNV);
        HANDLE$vkCmdCopyBuffer = loader.apply("vkCmdCopyBuffer", DESCRIPTOR$vkCmdCopyBuffer);
        HANDLE$vkCmdCopyImage = loader.apply("vkCmdCopyImage", DESCRIPTOR$vkCmdCopyImage);
        HANDLE$vkCmdBlitImage = loader.apply("vkCmdBlitImage", DESCRIPTOR$vkCmdBlitImage);
        HANDLE$vkCmdCopyBufferToImage = loader.apply("vkCmdCopyBufferToImage", DESCRIPTOR$vkCmdCopyBufferToImage);
        HANDLE$vkCmdCopyImageToBuffer = loader.apply("vkCmdCopyImageToBuffer", DESCRIPTOR$vkCmdCopyImageToBuffer);
        HANDLE$vkCmdCopyMemoryIndirectNV = loader.apply("vkCmdCopyMemoryIndirectNV", DESCRIPTOR$vkCmdCopyMemoryIndirectNV);
        HANDLE$vkCmdCopyMemoryToImageIndirectNV = loader.apply("vkCmdCopyMemoryToImageIndirectNV", DESCRIPTOR$vkCmdCopyMemoryToImageIndirectNV);
        HANDLE$vkCmdUpdateBuffer = loader.apply("vkCmdUpdateBuffer", DESCRIPTOR$vkCmdUpdateBuffer);
        HANDLE$vkCmdFillBuffer = loader.apply("vkCmdFillBuffer", DESCRIPTOR$vkCmdFillBuffer);
        HANDLE$vkCmdClearColorImage = loader.apply("vkCmdClearColorImage", DESCRIPTOR$vkCmdClearColorImage);
        HANDLE$vkCmdClearDepthStencilImage = loader.apply("vkCmdClearDepthStencilImage", DESCRIPTOR$vkCmdClearDepthStencilImage);
        HANDLE$vkCmdClearAttachments = loader.apply("vkCmdClearAttachments", DESCRIPTOR$vkCmdClearAttachments);
        HANDLE$vkCmdResolveImage = loader.apply("vkCmdResolveImage", DESCRIPTOR$vkCmdResolveImage);
        HANDLE$vkCmdSetEvent = loader.apply("vkCmdSetEvent", DESCRIPTOR$vkCmdSetEvent);
        HANDLE$vkCmdResetEvent = loader.apply("vkCmdResetEvent", DESCRIPTOR$vkCmdResetEvent);
        HANDLE$vkCmdWaitEvents = loader.apply("vkCmdWaitEvents", DESCRIPTOR$vkCmdWaitEvents);
        HANDLE$vkCmdPipelineBarrier = loader.apply("vkCmdPipelineBarrier", DESCRIPTOR$vkCmdPipelineBarrier);
        HANDLE$vkCmdBeginQuery = loader.apply("vkCmdBeginQuery", DESCRIPTOR$vkCmdBeginQuery);
        HANDLE$vkCmdEndQuery = loader.apply("vkCmdEndQuery", DESCRIPTOR$vkCmdEndQuery);
        HANDLE$vkCmdBeginConditionalRenderingEXT = loader.apply("vkCmdBeginConditionalRenderingEXT", DESCRIPTOR$vkCmdBeginConditionalRenderingEXT);
        HANDLE$vkCmdEndConditionalRenderingEXT = loader.apply("vkCmdEndConditionalRenderingEXT", DESCRIPTOR$vkCmdEndConditionalRenderingEXT);
        HANDLE$vkCmdResetQueryPool = loader.apply("vkCmdResetQueryPool", DESCRIPTOR$vkCmdResetQueryPool);
        HANDLE$vkCmdWriteTimestamp = loader.apply("vkCmdWriteTimestamp", DESCRIPTOR$vkCmdWriteTimestamp);
        HANDLE$vkCmdCopyQueryPoolResults = loader.apply("vkCmdCopyQueryPoolResults", DESCRIPTOR$vkCmdCopyQueryPoolResults);
        HANDLE$vkCmdPushConstants = loader.apply("vkCmdPushConstants", DESCRIPTOR$vkCmdPushConstants);
        HANDLE$vkCmdBeginRenderPass = loader.apply("vkCmdBeginRenderPass", DESCRIPTOR$vkCmdBeginRenderPass);
        HANDLE$vkCmdNextSubpass = loader.apply("vkCmdNextSubpass", DESCRIPTOR$vkCmdNextSubpass);
        HANDLE$vkCmdEndRenderPass = loader.apply("vkCmdEndRenderPass", DESCRIPTOR$vkCmdEndRenderPass);
        HANDLE$vkCmdExecuteCommands = loader.apply("vkCmdExecuteCommands", DESCRIPTOR$vkCmdExecuteCommands);
        HANDLE$vkCreateSharedSwapchainsKHR = loader.apply("vkCreateSharedSwapchainsKHR", DESCRIPTOR$vkCreateSharedSwapchainsKHR);
        HANDLE$vkCreateSwapchainKHR = loader.apply("vkCreateSwapchainKHR", DESCRIPTOR$vkCreateSwapchainKHR);
        HANDLE$vkDestroySwapchainKHR = loader.apply("vkDestroySwapchainKHR", DESCRIPTOR$vkDestroySwapchainKHR);
        HANDLE$vkGetSwapchainImagesKHR = loader.apply("vkGetSwapchainImagesKHR", DESCRIPTOR$vkGetSwapchainImagesKHR);
        HANDLE$vkAcquireNextImageKHR = loader.apply("vkAcquireNextImageKHR", DESCRIPTOR$vkAcquireNextImageKHR);
        HANDLE$vkQueuePresentKHR = loader.apply("vkQueuePresentKHR", DESCRIPTOR$vkQueuePresentKHR);
        HANDLE$vkDebugMarkerSetObjectNameEXT = loader.apply("vkDebugMarkerSetObjectNameEXT", DESCRIPTOR$vkDebugMarkerSetObjectNameEXT);
        HANDLE$vkDebugMarkerSetObjectTagEXT = loader.apply("vkDebugMarkerSetObjectTagEXT", DESCRIPTOR$vkDebugMarkerSetObjectTagEXT);
        HANDLE$vkCmdDebugMarkerBeginEXT = loader.apply("vkCmdDebugMarkerBeginEXT", DESCRIPTOR$vkCmdDebugMarkerBeginEXT);
        HANDLE$vkCmdDebugMarkerEndEXT = loader.apply("vkCmdDebugMarkerEndEXT", DESCRIPTOR$vkCmdDebugMarkerEndEXT);
        HANDLE$vkCmdDebugMarkerInsertEXT = loader.apply("vkCmdDebugMarkerInsertEXT", DESCRIPTOR$vkCmdDebugMarkerInsertEXT);
        HANDLE$vkGetMemoryWin32HandleNV = loader.apply("vkGetMemoryWin32HandleNV", DESCRIPTOR$vkGetMemoryWin32HandleNV);
        HANDLE$vkCmdExecuteGeneratedCommandsNV = loader.apply("vkCmdExecuteGeneratedCommandsNV", DESCRIPTOR$vkCmdExecuteGeneratedCommandsNV);
        HANDLE$vkCmdPreprocessGeneratedCommandsNV = loader.apply("vkCmdPreprocessGeneratedCommandsNV", DESCRIPTOR$vkCmdPreprocessGeneratedCommandsNV);
        HANDLE$vkCmdBindPipelineShaderGroupNV = loader.apply("vkCmdBindPipelineShaderGroupNV", DESCRIPTOR$vkCmdBindPipelineShaderGroupNV);
        HANDLE$vkGetGeneratedCommandsMemoryRequirementsNV = loader.apply("vkGetGeneratedCommandsMemoryRequirementsNV", DESCRIPTOR$vkGetGeneratedCommandsMemoryRequirementsNV);
        HANDLE$vkCreateIndirectCommandsLayoutNV = loader.apply("vkCreateIndirectCommandsLayoutNV", DESCRIPTOR$vkCreateIndirectCommandsLayoutNV);
        HANDLE$vkDestroyIndirectCommandsLayoutNV = loader.apply("vkDestroyIndirectCommandsLayoutNV", DESCRIPTOR$vkDestroyIndirectCommandsLayoutNV);
        HANDLE$vkCmdPushDescriptorSetKHR = loader.apply("vkCmdPushDescriptorSetKHR", DESCRIPTOR$vkCmdPushDescriptorSetKHR);
        HANDLE$vkTrimCommandPool = loader.apply("vkTrimCommandPool", DESCRIPTOR$vkTrimCommandPool);
        HANDLE$vkGetMemoryWin32HandleKHR = loader.apply("vkGetMemoryWin32HandleKHR", DESCRIPTOR$vkGetMemoryWin32HandleKHR);
        HANDLE$vkGetMemoryWin32HandlePropertiesKHR = loader.apply("vkGetMemoryWin32HandlePropertiesKHR", DESCRIPTOR$vkGetMemoryWin32HandlePropertiesKHR);
        HANDLE$vkGetMemoryFdKHR = loader.apply("vkGetMemoryFdKHR", DESCRIPTOR$vkGetMemoryFdKHR);
        HANDLE$vkGetMemoryFdPropertiesKHR = loader.apply("vkGetMemoryFdPropertiesKHR", DESCRIPTOR$vkGetMemoryFdPropertiesKHR);
        HANDLE$vkGetMemoryZirconHandleFUCHSIA = loader.apply("vkGetMemoryZirconHandleFUCHSIA", DESCRIPTOR$vkGetMemoryZirconHandleFUCHSIA);
        HANDLE$vkGetMemoryZirconHandlePropertiesFUCHSIA = loader.apply("vkGetMemoryZirconHandlePropertiesFUCHSIA", DESCRIPTOR$vkGetMemoryZirconHandlePropertiesFUCHSIA);
        HANDLE$vkGetMemoryRemoteAddressNV = loader.apply("vkGetMemoryRemoteAddressNV", DESCRIPTOR$vkGetMemoryRemoteAddressNV);
        HANDLE$vkGetMemorySciBufNV = loader.apply("vkGetMemorySciBufNV", DESCRIPTOR$vkGetMemorySciBufNV);
        HANDLE$vkGetPhysicalDeviceExternalMemorySciBufPropertiesNV = loader.apply("vkGetPhysicalDeviceExternalMemorySciBufPropertiesNV", DESCRIPTOR$vkGetPhysicalDeviceExternalMemorySciBufPropertiesNV);
        HANDLE$vkGetPhysicalDeviceSciBufAttributesNV = loader.apply("vkGetPhysicalDeviceSciBufAttributesNV", DESCRIPTOR$vkGetPhysicalDeviceSciBufAttributesNV);
        HANDLE$vkGetSemaphoreWin32HandleKHR = loader.apply("vkGetSemaphoreWin32HandleKHR", DESCRIPTOR$vkGetSemaphoreWin32HandleKHR);
        HANDLE$vkImportSemaphoreWin32HandleKHR = loader.apply("vkImportSemaphoreWin32HandleKHR", DESCRIPTOR$vkImportSemaphoreWin32HandleKHR);
        HANDLE$vkGetSemaphoreFdKHR = loader.apply("vkGetSemaphoreFdKHR", DESCRIPTOR$vkGetSemaphoreFdKHR);
        HANDLE$vkImportSemaphoreFdKHR = loader.apply("vkImportSemaphoreFdKHR", DESCRIPTOR$vkImportSemaphoreFdKHR);
        HANDLE$vkGetSemaphoreZirconHandleFUCHSIA = loader.apply("vkGetSemaphoreZirconHandleFUCHSIA", DESCRIPTOR$vkGetSemaphoreZirconHandleFUCHSIA);
        HANDLE$vkImportSemaphoreZirconHandleFUCHSIA = loader.apply("vkImportSemaphoreZirconHandleFUCHSIA", DESCRIPTOR$vkImportSemaphoreZirconHandleFUCHSIA);
        HANDLE$vkGetFenceWin32HandleKHR = loader.apply("vkGetFenceWin32HandleKHR", DESCRIPTOR$vkGetFenceWin32HandleKHR);
        HANDLE$vkImportFenceWin32HandleKHR = loader.apply("vkImportFenceWin32HandleKHR", DESCRIPTOR$vkImportFenceWin32HandleKHR);
        HANDLE$vkGetFenceFdKHR = loader.apply("vkGetFenceFdKHR", DESCRIPTOR$vkGetFenceFdKHR);
        HANDLE$vkImportFenceFdKHR = loader.apply("vkImportFenceFdKHR", DESCRIPTOR$vkImportFenceFdKHR);
        HANDLE$vkGetFenceSciSyncFenceNV = loader.apply("vkGetFenceSciSyncFenceNV", DESCRIPTOR$vkGetFenceSciSyncFenceNV);
        HANDLE$vkGetFenceSciSyncObjNV = loader.apply("vkGetFenceSciSyncObjNV", DESCRIPTOR$vkGetFenceSciSyncObjNV);
        HANDLE$vkImportFenceSciSyncFenceNV = loader.apply("vkImportFenceSciSyncFenceNV", DESCRIPTOR$vkImportFenceSciSyncFenceNV);
        HANDLE$vkImportFenceSciSyncObjNV = loader.apply("vkImportFenceSciSyncObjNV", DESCRIPTOR$vkImportFenceSciSyncObjNV);
        HANDLE$vkGetSemaphoreSciSyncObjNV = loader.apply("vkGetSemaphoreSciSyncObjNV", DESCRIPTOR$vkGetSemaphoreSciSyncObjNV);
        HANDLE$vkImportSemaphoreSciSyncObjNV = loader.apply("vkImportSemaphoreSciSyncObjNV", DESCRIPTOR$vkImportSemaphoreSciSyncObjNV);
        HANDLE$vkGetPhysicalDeviceSciSyncAttributesNV = loader.apply("vkGetPhysicalDeviceSciSyncAttributesNV", DESCRIPTOR$vkGetPhysicalDeviceSciSyncAttributesNV);
        HANDLE$vkCreateSemaphoreSciSyncPoolNV = loader.apply("vkCreateSemaphoreSciSyncPoolNV", DESCRIPTOR$vkCreateSemaphoreSciSyncPoolNV);
        HANDLE$vkDestroySemaphoreSciSyncPoolNV = loader.apply("vkDestroySemaphoreSciSyncPoolNV", DESCRIPTOR$vkDestroySemaphoreSciSyncPoolNV);
        HANDLE$vkAcquireWinrtDisplayNV = loader.apply("vkAcquireWinrtDisplayNV", DESCRIPTOR$vkAcquireWinrtDisplayNV);
        HANDLE$vkGetWinrtDisplayNV = loader.apply("vkGetWinrtDisplayNV", DESCRIPTOR$vkGetWinrtDisplayNV);
        HANDLE$vkDisplayPowerControlEXT = loader.apply("vkDisplayPowerControlEXT", DESCRIPTOR$vkDisplayPowerControlEXT);
        HANDLE$vkRegisterDeviceEventEXT = loader.apply("vkRegisterDeviceEventEXT", DESCRIPTOR$vkRegisterDeviceEventEXT);
        HANDLE$vkRegisterDisplayEventEXT = loader.apply("vkRegisterDisplayEventEXT", DESCRIPTOR$vkRegisterDisplayEventEXT);
        HANDLE$vkGetSwapchainCounterEXT = loader.apply("vkGetSwapchainCounterEXT", DESCRIPTOR$vkGetSwapchainCounterEXT);
        HANDLE$vkGetDeviceGroupPeerMemoryFeatures = loader.apply("vkGetDeviceGroupPeerMemoryFeatures", DESCRIPTOR$vkGetDeviceGroupPeerMemoryFeatures);
        HANDLE$vkBindBufferMemory2 = loader.apply("vkBindBufferMemory2", DESCRIPTOR$vkBindBufferMemory2);
        HANDLE$vkBindImageMemory2 = loader.apply("vkBindImageMemory2", DESCRIPTOR$vkBindImageMemory2);
        HANDLE$vkCmdSetDeviceMask = loader.apply("vkCmdSetDeviceMask", DESCRIPTOR$vkCmdSetDeviceMask);
        HANDLE$vkGetDeviceGroupPresentCapabilitiesKHR = loader.apply("vkGetDeviceGroupPresentCapabilitiesKHR", DESCRIPTOR$vkGetDeviceGroupPresentCapabilitiesKHR);
        HANDLE$vkGetDeviceGroupSurfacePresentModesKHR = loader.apply("vkGetDeviceGroupSurfacePresentModesKHR", DESCRIPTOR$vkGetDeviceGroupSurfacePresentModesKHR);
        HANDLE$vkAcquireNextImage2KHR = loader.apply("vkAcquireNextImage2KHR", DESCRIPTOR$vkAcquireNextImage2KHR);
        HANDLE$vkCmdDispatchBase = loader.apply("vkCmdDispatchBase", DESCRIPTOR$vkCmdDispatchBase);
        HANDLE$vkGetPhysicalDevicePresentRectanglesKHR = loader.apply("vkGetPhysicalDevicePresentRectanglesKHR", DESCRIPTOR$vkGetPhysicalDevicePresentRectanglesKHR);
        HANDLE$vkCreateDescriptorUpdateTemplate = loader.apply("vkCreateDescriptorUpdateTemplate", DESCRIPTOR$vkCreateDescriptorUpdateTemplate);
        HANDLE$vkDestroyDescriptorUpdateTemplate = loader.apply("vkDestroyDescriptorUpdateTemplate", DESCRIPTOR$vkDestroyDescriptorUpdateTemplate);
        HANDLE$vkUpdateDescriptorSetWithTemplate = loader.apply("vkUpdateDescriptorSetWithTemplate", DESCRIPTOR$vkUpdateDescriptorSetWithTemplate);
        HANDLE$vkCmdPushDescriptorSetWithTemplateKHR = loader.apply("vkCmdPushDescriptorSetWithTemplateKHR", DESCRIPTOR$vkCmdPushDescriptorSetWithTemplateKHR);
        HANDLE$vkSetHdrMetadataEXT = loader.apply("vkSetHdrMetadataEXT", DESCRIPTOR$vkSetHdrMetadataEXT);
        HANDLE$vkGetSwapchainStatusKHR = loader.apply("vkGetSwapchainStatusKHR", DESCRIPTOR$vkGetSwapchainStatusKHR);
        HANDLE$vkGetRefreshCycleDurationGOOGLE = loader.apply("vkGetRefreshCycleDurationGOOGLE", DESCRIPTOR$vkGetRefreshCycleDurationGOOGLE);
        HANDLE$vkGetPastPresentationTimingGOOGLE = loader.apply("vkGetPastPresentationTimingGOOGLE", DESCRIPTOR$vkGetPastPresentationTimingGOOGLE);
        HANDLE$vkCmdSetViewportWScalingNV = loader.apply("vkCmdSetViewportWScalingNV", DESCRIPTOR$vkCmdSetViewportWScalingNV);
        HANDLE$vkCmdSetDiscardRectangleEXT = loader.apply("vkCmdSetDiscardRectangleEXT", DESCRIPTOR$vkCmdSetDiscardRectangleEXT);
        HANDLE$vkCmdSetDiscardRectangleEnableEXT = loader.apply("vkCmdSetDiscardRectangleEnableEXT", DESCRIPTOR$vkCmdSetDiscardRectangleEnableEXT);
        HANDLE$vkCmdSetDiscardRectangleModeEXT = loader.apply("vkCmdSetDiscardRectangleModeEXT", DESCRIPTOR$vkCmdSetDiscardRectangleModeEXT);
        HANDLE$vkCmdSetSampleLocationsEXT = loader.apply("vkCmdSetSampleLocationsEXT", DESCRIPTOR$vkCmdSetSampleLocationsEXT);
        HANDLE$vkGetPhysicalDeviceMultisamplePropertiesEXT = loader.apply("vkGetPhysicalDeviceMultisamplePropertiesEXT", DESCRIPTOR$vkGetPhysicalDeviceMultisamplePropertiesEXT);
        HANDLE$vkGetBufferMemoryRequirements2 = loader.apply("vkGetBufferMemoryRequirements2", DESCRIPTOR$vkGetBufferMemoryRequirements2);
        HANDLE$vkGetImageMemoryRequirements2 = loader.apply("vkGetImageMemoryRequirements2", DESCRIPTOR$vkGetImageMemoryRequirements2);
        HANDLE$vkGetImageSparseMemoryRequirements2 = loader.apply("vkGetImageSparseMemoryRequirements2", DESCRIPTOR$vkGetImageSparseMemoryRequirements2);
        HANDLE$vkGetDeviceBufferMemoryRequirements = loader.apply("vkGetDeviceBufferMemoryRequirements", DESCRIPTOR$vkGetDeviceBufferMemoryRequirements);
        HANDLE$vkGetDeviceImageMemoryRequirements = loader.apply("vkGetDeviceImageMemoryRequirements", DESCRIPTOR$vkGetDeviceImageMemoryRequirements);
        HANDLE$vkGetDeviceImageSparseMemoryRequirements = loader.apply("vkGetDeviceImageSparseMemoryRequirements", DESCRIPTOR$vkGetDeviceImageSparseMemoryRequirements);
        HANDLE$vkCreateSamplerYcbcrConversion = loader.apply("vkCreateSamplerYcbcrConversion", DESCRIPTOR$vkCreateSamplerYcbcrConversion);
        HANDLE$vkDestroySamplerYcbcrConversion = loader.apply("vkDestroySamplerYcbcrConversion", DESCRIPTOR$vkDestroySamplerYcbcrConversion);
        HANDLE$vkGetDeviceQueue2 = loader.apply("vkGetDeviceQueue2", DESCRIPTOR$vkGetDeviceQueue2);
        HANDLE$vkCreateValidationCacheEXT = loader.apply("vkCreateValidationCacheEXT", DESCRIPTOR$vkCreateValidationCacheEXT);
        HANDLE$vkDestroyValidationCacheEXT = loader.apply("vkDestroyValidationCacheEXT", DESCRIPTOR$vkDestroyValidationCacheEXT);
        HANDLE$vkGetValidationCacheDataEXT = loader.apply("vkGetValidationCacheDataEXT", DESCRIPTOR$vkGetValidationCacheDataEXT);
        HANDLE$vkMergeValidationCachesEXT = loader.apply("vkMergeValidationCachesEXT", DESCRIPTOR$vkMergeValidationCachesEXT);
        HANDLE$vkGetDescriptorSetLayoutSupport = loader.apply("vkGetDescriptorSetLayoutSupport", DESCRIPTOR$vkGetDescriptorSetLayoutSupport);
        HANDLE$vkGetShaderInfoAMD = loader.apply("vkGetShaderInfoAMD", DESCRIPTOR$vkGetShaderInfoAMD);
        HANDLE$vkSetLocalDimmingAMD = loader.apply("vkSetLocalDimmingAMD", DESCRIPTOR$vkSetLocalDimmingAMD);
        HANDLE$vkGetPhysicalDeviceCalibrateableTimeDomainsKHR = loader.apply("vkGetPhysicalDeviceCalibrateableTimeDomainsKHR", DESCRIPTOR$vkGetPhysicalDeviceCalibrateableTimeDomainsKHR);
        HANDLE$vkGetCalibratedTimestampsKHR = loader.apply("vkGetCalibratedTimestampsKHR", DESCRIPTOR$vkGetCalibratedTimestampsKHR);
        HANDLE$vkGetMemoryHostPointerPropertiesEXT = loader.apply("vkGetMemoryHostPointerPropertiesEXT", DESCRIPTOR$vkGetMemoryHostPointerPropertiesEXT);
        HANDLE$vkCmdWriteBufferMarkerAMD = loader.apply("vkCmdWriteBufferMarkerAMD", DESCRIPTOR$vkCmdWriteBufferMarkerAMD);
        HANDLE$vkCreateRenderPass2 = loader.apply("vkCreateRenderPass2", DESCRIPTOR$vkCreateRenderPass2);
        HANDLE$vkCmdBeginRenderPass2 = loader.apply("vkCmdBeginRenderPass2", DESCRIPTOR$vkCmdBeginRenderPass2);
        HANDLE$vkCmdNextSubpass2 = loader.apply("vkCmdNextSubpass2", DESCRIPTOR$vkCmdNextSubpass2);
        HANDLE$vkCmdEndRenderPass2 = loader.apply("vkCmdEndRenderPass2", DESCRIPTOR$vkCmdEndRenderPass2);
        HANDLE$vkGetSemaphoreCounterValue = loader.apply("vkGetSemaphoreCounterValue", DESCRIPTOR$vkGetSemaphoreCounterValue);
        HANDLE$vkWaitSemaphores = loader.apply("vkWaitSemaphores", DESCRIPTOR$vkWaitSemaphores);
        HANDLE$vkSignalSemaphore = loader.apply("vkSignalSemaphore", DESCRIPTOR$vkSignalSemaphore);
        HANDLE$vkGetAndroidHardwareBufferPropertiesANDROID = loader.apply("vkGetAndroidHardwareBufferPropertiesANDROID", DESCRIPTOR$vkGetAndroidHardwareBufferPropertiesANDROID);
        HANDLE$vkGetMemoryAndroidHardwareBufferANDROID = loader.apply("vkGetMemoryAndroidHardwareBufferANDROID", DESCRIPTOR$vkGetMemoryAndroidHardwareBufferANDROID);
        HANDLE$vkCmdDrawIndirectCount = loader.apply("vkCmdDrawIndirectCount", DESCRIPTOR$vkCmdDrawIndirectCount);
        HANDLE$vkCmdDrawIndexedIndirectCount = loader.apply("vkCmdDrawIndexedIndirectCount", DESCRIPTOR$vkCmdDrawIndexedIndirectCount);
        HANDLE$vkCmdSetCheckpointNV = loader.apply("vkCmdSetCheckpointNV", DESCRIPTOR$vkCmdSetCheckpointNV);
        HANDLE$vkGetQueueCheckpointDataNV = loader.apply("vkGetQueueCheckpointDataNV", DESCRIPTOR$vkGetQueueCheckpointDataNV);
        HANDLE$vkCmdBindTransformFeedbackBuffersEXT = loader.apply("vkCmdBindTransformFeedbackBuffersEXT", DESCRIPTOR$vkCmdBindTransformFeedbackBuffersEXT);
        HANDLE$vkCmdBeginTransformFeedbackEXT = loader.apply("vkCmdBeginTransformFeedbackEXT", DESCRIPTOR$vkCmdBeginTransformFeedbackEXT);
        HANDLE$vkCmdEndTransformFeedbackEXT = loader.apply("vkCmdEndTransformFeedbackEXT", DESCRIPTOR$vkCmdEndTransformFeedbackEXT);
        HANDLE$vkCmdBeginQueryIndexedEXT = loader.apply("vkCmdBeginQueryIndexedEXT", DESCRIPTOR$vkCmdBeginQueryIndexedEXT);
        HANDLE$vkCmdEndQueryIndexedEXT = loader.apply("vkCmdEndQueryIndexedEXT", DESCRIPTOR$vkCmdEndQueryIndexedEXT);
        HANDLE$vkCmdDrawIndirectByteCountEXT = loader.apply("vkCmdDrawIndirectByteCountEXT", DESCRIPTOR$vkCmdDrawIndirectByteCountEXT);
        HANDLE$vkCmdSetExclusiveScissorNV = loader.apply("vkCmdSetExclusiveScissorNV", DESCRIPTOR$vkCmdSetExclusiveScissorNV);
        HANDLE$vkCmdSetExclusiveScissorEnableNV = loader.apply("vkCmdSetExclusiveScissorEnableNV", DESCRIPTOR$vkCmdSetExclusiveScissorEnableNV);
        HANDLE$vkCmdBindShadingRateImageNV = loader.apply("vkCmdBindShadingRateImageNV", DESCRIPTOR$vkCmdBindShadingRateImageNV);
        HANDLE$vkCmdSetViewportShadingRatePaletteNV = loader.apply("vkCmdSetViewportShadingRatePaletteNV", DESCRIPTOR$vkCmdSetViewportShadingRatePaletteNV);
        HANDLE$vkCmdSetCoarseSampleOrderNV = loader.apply("vkCmdSetCoarseSampleOrderNV", DESCRIPTOR$vkCmdSetCoarseSampleOrderNV);
        HANDLE$vkCmdDrawMeshTasksNV = loader.apply("vkCmdDrawMeshTasksNV", DESCRIPTOR$vkCmdDrawMeshTasksNV);
        HANDLE$vkCmdDrawMeshTasksIndirectNV = loader.apply("vkCmdDrawMeshTasksIndirectNV", DESCRIPTOR$vkCmdDrawMeshTasksIndirectNV);
        HANDLE$vkCmdDrawMeshTasksIndirectCountNV = loader.apply("vkCmdDrawMeshTasksIndirectCountNV", DESCRIPTOR$vkCmdDrawMeshTasksIndirectCountNV);
        HANDLE$vkCmdDrawMeshTasksEXT = loader.apply("vkCmdDrawMeshTasksEXT", DESCRIPTOR$vkCmdDrawMeshTasksEXT);
        HANDLE$vkCmdDrawMeshTasksIndirectEXT = loader.apply("vkCmdDrawMeshTasksIndirectEXT", DESCRIPTOR$vkCmdDrawMeshTasksIndirectEXT);
        HANDLE$vkCmdDrawMeshTasksIndirectCountEXT = loader.apply("vkCmdDrawMeshTasksIndirectCountEXT", DESCRIPTOR$vkCmdDrawMeshTasksIndirectCountEXT);
        HANDLE$vkCompileDeferredNV = loader.apply("vkCompileDeferredNV", DESCRIPTOR$vkCompileDeferredNV);
        HANDLE$vkCreateAccelerationStructureNV = loader.apply("vkCreateAccelerationStructureNV", DESCRIPTOR$vkCreateAccelerationStructureNV);
        HANDLE$vkCmdBindInvocationMaskHUAWEI = loader.apply("vkCmdBindInvocationMaskHUAWEI", DESCRIPTOR$vkCmdBindInvocationMaskHUAWEI);
        HANDLE$vkDestroyAccelerationStructureKHR = loader.apply("vkDestroyAccelerationStructureKHR", DESCRIPTOR$vkDestroyAccelerationStructureKHR);
        HANDLE$vkDestroyAccelerationStructureNV = loader.apply("vkDestroyAccelerationStructureNV", DESCRIPTOR$vkDestroyAccelerationStructureNV);
        HANDLE$vkGetAccelerationStructureMemoryRequirementsNV = loader.apply("vkGetAccelerationStructureMemoryRequirementsNV", DESCRIPTOR$vkGetAccelerationStructureMemoryRequirementsNV);
        HANDLE$vkBindAccelerationStructureMemoryNV = loader.apply("vkBindAccelerationStructureMemoryNV", DESCRIPTOR$vkBindAccelerationStructureMemoryNV);
        HANDLE$vkCmdCopyAccelerationStructureNV = loader.apply("vkCmdCopyAccelerationStructureNV", DESCRIPTOR$vkCmdCopyAccelerationStructureNV);
        HANDLE$vkCmdCopyAccelerationStructureKHR = loader.apply("vkCmdCopyAccelerationStructureKHR", DESCRIPTOR$vkCmdCopyAccelerationStructureKHR);
        HANDLE$vkCopyAccelerationStructureKHR = loader.apply("vkCopyAccelerationStructureKHR", DESCRIPTOR$vkCopyAccelerationStructureKHR);
        HANDLE$vkCmdCopyAccelerationStructureToMemoryKHR = loader.apply("vkCmdCopyAccelerationStructureToMemoryKHR", DESCRIPTOR$vkCmdCopyAccelerationStructureToMemoryKHR);
        HANDLE$vkCopyAccelerationStructureToMemoryKHR = loader.apply("vkCopyAccelerationStructureToMemoryKHR", DESCRIPTOR$vkCopyAccelerationStructureToMemoryKHR);
        HANDLE$vkCmdCopyMemoryToAccelerationStructureKHR = loader.apply("vkCmdCopyMemoryToAccelerationStructureKHR", DESCRIPTOR$vkCmdCopyMemoryToAccelerationStructureKHR);
        HANDLE$vkCopyMemoryToAccelerationStructureKHR = loader.apply("vkCopyMemoryToAccelerationStructureKHR", DESCRIPTOR$vkCopyMemoryToAccelerationStructureKHR);
        HANDLE$vkCmdWriteAccelerationStructuresPropertiesKHR = loader.apply("vkCmdWriteAccelerationStructuresPropertiesKHR", DESCRIPTOR$vkCmdWriteAccelerationStructuresPropertiesKHR);
        HANDLE$vkCmdWriteAccelerationStructuresPropertiesNV = loader.apply("vkCmdWriteAccelerationStructuresPropertiesNV", DESCRIPTOR$vkCmdWriteAccelerationStructuresPropertiesNV);
        HANDLE$vkCmdBuildAccelerationStructureNV = loader.apply("vkCmdBuildAccelerationStructureNV", DESCRIPTOR$vkCmdBuildAccelerationStructureNV);
        HANDLE$vkWriteAccelerationStructuresPropertiesKHR = loader.apply("vkWriteAccelerationStructuresPropertiesKHR", DESCRIPTOR$vkWriteAccelerationStructuresPropertiesKHR);
        HANDLE$vkCmdTraceRaysKHR = loader.apply("vkCmdTraceRaysKHR", DESCRIPTOR$vkCmdTraceRaysKHR);
        HANDLE$vkCmdTraceRaysNV = loader.apply("vkCmdTraceRaysNV", DESCRIPTOR$vkCmdTraceRaysNV);
        HANDLE$vkGetRayTracingShaderGroupHandlesKHR = loader.apply("vkGetRayTracingShaderGroupHandlesKHR", DESCRIPTOR$vkGetRayTracingShaderGroupHandlesKHR);
        HANDLE$vkGetRayTracingCaptureReplayShaderGroupHandlesKHR = loader.apply("vkGetRayTracingCaptureReplayShaderGroupHandlesKHR", DESCRIPTOR$vkGetRayTracingCaptureReplayShaderGroupHandlesKHR);
        HANDLE$vkGetAccelerationStructureHandleNV = loader.apply("vkGetAccelerationStructureHandleNV", DESCRIPTOR$vkGetAccelerationStructureHandleNV);
        HANDLE$vkCreateRayTracingPipelinesNV = loader.apply("vkCreateRayTracingPipelinesNV", DESCRIPTOR$vkCreateRayTracingPipelinesNV);
        HANDLE$vkCreateRayTracingPipelinesKHR = loader.apply("vkCreateRayTracingPipelinesKHR", DESCRIPTOR$vkCreateRayTracingPipelinesKHR);
        HANDLE$vkGetPhysicalDeviceCooperativeMatrixPropertiesNV = loader.apply("vkGetPhysicalDeviceCooperativeMatrixPropertiesNV", DESCRIPTOR$vkGetPhysicalDeviceCooperativeMatrixPropertiesNV);
        HANDLE$vkCmdTraceRaysIndirectKHR = loader.apply("vkCmdTraceRaysIndirectKHR", DESCRIPTOR$vkCmdTraceRaysIndirectKHR);
        HANDLE$vkCmdTraceRaysIndirect2KHR = loader.apply("vkCmdTraceRaysIndirect2KHR", DESCRIPTOR$vkCmdTraceRaysIndirect2KHR);
        HANDLE$vkGetDeviceAccelerationStructureCompatibilityKHR = loader.apply("vkGetDeviceAccelerationStructureCompatibilityKHR", DESCRIPTOR$vkGetDeviceAccelerationStructureCompatibilityKHR);
        HANDLE$vkGetRayTracingShaderGroupStackSizeKHR = loader.apply("vkGetRayTracingShaderGroupStackSizeKHR", DESCRIPTOR$vkGetRayTracingShaderGroupStackSizeKHR);
        HANDLE$vkCmdSetRayTracingPipelineStackSizeKHR = loader.apply("vkCmdSetRayTracingPipelineStackSizeKHR", DESCRIPTOR$vkCmdSetRayTracingPipelineStackSizeKHR);
        HANDLE$vkGetImageViewHandleNVX = loader.apply("vkGetImageViewHandleNVX", DESCRIPTOR$vkGetImageViewHandleNVX);
        HANDLE$vkGetImageViewAddressNVX = loader.apply("vkGetImageViewAddressNVX", DESCRIPTOR$vkGetImageViewAddressNVX);
        HANDLE$vkGetPhysicalDeviceSurfacePresentModes2EXT = loader.apply("vkGetPhysicalDeviceSurfacePresentModes2EXT", DESCRIPTOR$vkGetPhysicalDeviceSurfacePresentModes2EXT);
        HANDLE$vkGetDeviceGroupSurfacePresentModes2EXT = loader.apply("vkGetDeviceGroupSurfacePresentModes2EXT", DESCRIPTOR$vkGetDeviceGroupSurfacePresentModes2EXT);
        HANDLE$vkAcquireFullScreenExclusiveModeEXT = loader.apply("vkAcquireFullScreenExclusiveModeEXT", DESCRIPTOR$vkAcquireFullScreenExclusiveModeEXT);
        HANDLE$vkReleaseFullScreenExclusiveModeEXT = loader.apply("vkReleaseFullScreenExclusiveModeEXT", DESCRIPTOR$vkReleaseFullScreenExclusiveModeEXT);
        HANDLE$vkEnumeratePhysicalDeviceQueueFamilyPerformanceQueryCountersKHR = loader.apply("vkEnumeratePhysicalDeviceQueueFamilyPerformanceQueryCountersKHR", DESCRIPTOR$vkEnumeratePhysicalDeviceQueueFamilyPerformanceQueryCountersKHR);
        HANDLE$vkGetPhysicalDeviceQueueFamilyPerformanceQueryPassesKHR = loader.apply("vkGetPhysicalDeviceQueueFamilyPerformanceQueryPassesKHR", DESCRIPTOR$vkGetPhysicalDeviceQueueFamilyPerformanceQueryPassesKHR);
        HANDLE$vkAcquireProfilingLockKHR = loader.apply("vkAcquireProfilingLockKHR", DESCRIPTOR$vkAcquireProfilingLockKHR);
        HANDLE$vkReleaseProfilingLockKHR = loader.apply("vkReleaseProfilingLockKHR", DESCRIPTOR$vkReleaseProfilingLockKHR);
        HANDLE$vkGetImageDrmFormatModifierPropertiesEXT = loader.apply("vkGetImageDrmFormatModifierPropertiesEXT", DESCRIPTOR$vkGetImageDrmFormatModifierPropertiesEXT);
        HANDLE$vkGetBufferOpaqueCaptureAddress = loader.apply("vkGetBufferOpaqueCaptureAddress", DESCRIPTOR$vkGetBufferOpaqueCaptureAddress);
        HANDLE$vkGetBufferDeviceAddress = loader.apply("vkGetBufferDeviceAddress", DESCRIPTOR$vkGetBufferDeviceAddress);
        HANDLE$vkGetPhysicalDeviceSupportedFramebufferMixedSamplesCombinationsNV = loader.apply("vkGetPhysicalDeviceSupportedFramebufferMixedSamplesCombinationsNV", DESCRIPTOR$vkGetPhysicalDeviceSupportedFramebufferMixedSamplesCombinationsNV);
        HANDLE$vkInitializePerformanceApiINTEL = loader.apply("vkInitializePerformanceApiINTEL", DESCRIPTOR$vkInitializePerformanceApiINTEL);
        HANDLE$vkUninitializePerformanceApiINTEL = loader.apply("vkUninitializePerformanceApiINTEL", DESCRIPTOR$vkUninitializePerformanceApiINTEL);
        HANDLE$vkCmdSetPerformanceMarkerINTEL = loader.apply("vkCmdSetPerformanceMarkerINTEL", DESCRIPTOR$vkCmdSetPerformanceMarkerINTEL);
        HANDLE$vkCmdSetPerformanceStreamMarkerINTEL = loader.apply("vkCmdSetPerformanceStreamMarkerINTEL", DESCRIPTOR$vkCmdSetPerformanceStreamMarkerINTEL);
        HANDLE$vkCmdSetPerformanceOverrideINTEL = loader.apply("vkCmdSetPerformanceOverrideINTEL", DESCRIPTOR$vkCmdSetPerformanceOverrideINTEL);
        HANDLE$vkAcquirePerformanceConfigurationINTEL = loader.apply("vkAcquirePerformanceConfigurationINTEL", DESCRIPTOR$vkAcquirePerformanceConfigurationINTEL);
        HANDLE$vkReleasePerformanceConfigurationINTEL = loader.apply("vkReleasePerformanceConfigurationINTEL", DESCRIPTOR$vkReleasePerformanceConfigurationINTEL);
        HANDLE$vkQueueSetPerformanceConfigurationINTEL = loader.apply("vkQueueSetPerformanceConfigurationINTEL", DESCRIPTOR$vkQueueSetPerformanceConfigurationINTEL);
        HANDLE$vkGetPerformanceParameterINTEL = loader.apply("vkGetPerformanceParameterINTEL", DESCRIPTOR$vkGetPerformanceParameterINTEL);
        HANDLE$vkGetDeviceMemoryOpaqueCaptureAddress = loader.apply("vkGetDeviceMemoryOpaqueCaptureAddress", DESCRIPTOR$vkGetDeviceMemoryOpaqueCaptureAddress);
        HANDLE$vkGetPipelineExecutablePropertiesKHR = loader.apply("vkGetPipelineExecutablePropertiesKHR", DESCRIPTOR$vkGetPipelineExecutablePropertiesKHR);
        HANDLE$vkGetPipelineExecutableStatisticsKHR = loader.apply("vkGetPipelineExecutableStatisticsKHR", DESCRIPTOR$vkGetPipelineExecutableStatisticsKHR);
        HANDLE$vkGetPipelineExecutableInternalRepresentationsKHR = loader.apply("vkGetPipelineExecutableInternalRepresentationsKHR", DESCRIPTOR$vkGetPipelineExecutableInternalRepresentationsKHR);
        HANDLE$vkCmdSetLineStippleKHR = loader.apply("vkCmdSetLineStippleKHR", DESCRIPTOR$vkCmdSetLineStippleKHR);
        HANDLE$vkCreateAccelerationStructureKHR = loader.apply("vkCreateAccelerationStructureKHR", DESCRIPTOR$vkCreateAccelerationStructureKHR);
        HANDLE$vkCmdBuildAccelerationStructuresKHR = loader.apply("vkCmdBuildAccelerationStructuresKHR", DESCRIPTOR$vkCmdBuildAccelerationStructuresKHR);
        HANDLE$vkCmdBuildAccelerationStructuresIndirectKHR = loader.apply("vkCmdBuildAccelerationStructuresIndirectKHR", DESCRIPTOR$vkCmdBuildAccelerationStructuresIndirectKHR);
        HANDLE$vkBuildAccelerationStructuresKHR = loader.apply("vkBuildAccelerationStructuresKHR", DESCRIPTOR$vkBuildAccelerationStructuresKHR);
        HANDLE$vkGetAccelerationStructureDeviceAddressKHR = loader.apply("vkGetAccelerationStructureDeviceAddressKHR", DESCRIPTOR$vkGetAccelerationStructureDeviceAddressKHR);
        HANDLE$vkCreateDeferredOperationKHR = loader.apply("vkCreateDeferredOperationKHR", DESCRIPTOR$vkCreateDeferredOperationKHR);
        HANDLE$vkDestroyDeferredOperationKHR = loader.apply("vkDestroyDeferredOperationKHR", DESCRIPTOR$vkDestroyDeferredOperationKHR);
        HANDLE$vkGetDeferredOperationMaxConcurrencyKHR = loader.apply("vkGetDeferredOperationMaxConcurrencyKHR", DESCRIPTOR$vkGetDeferredOperationMaxConcurrencyKHR);
        HANDLE$vkGetDeferredOperationResultKHR = loader.apply("vkGetDeferredOperationResultKHR", DESCRIPTOR$vkGetDeferredOperationResultKHR);
        HANDLE$vkDeferredOperationJoinKHR = loader.apply("vkDeferredOperationJoinKHR", DESCRIPTOR$vkDeferredOperationJoinKHR);
        HANDLE$vkGetPipelineIndirectMemoryRequirementsNV = loader.apply("vkGetPipelineIndirectMemoryRequirementsNV", DESCRIPTOR$vkGetPipelineIndirectMemoryRequirementsNV);
        HANDLE$vkGetPipelineIndirectDeviceAddressNV = loader.apply("vkGetPipelineIndirectDeviceAddressNV", DESCRIPTOR$vkGetPipelineIndirectDeviceAddressNV);
        HANDLE$vkAntiLagUpdateAMD = loader.apply("vkAntiLagUpdateAMD", DESCRIPTOR$vkAntiLagUpdateAMD);
        HANDLE$vkCmdSetCullMode = loader.apply("vkCmdSetCullMode", DESCRIPTOR$vkCmdSetCullMode);
        HANDLE$vkCmdSetFrontFace = loader.apply("vkCmdSetFrontFace", DESCRIPTOR$vkCmdSetFrontFace);
        HANDLE$vkCmdSetPrimitiveTopology = loader.apply("vkCmdSetPrimitiveTopology", DESCRIPTOR$vkCmdSetPrimitiveTopology);
        HANDLE$vkCmdSetViewportWithCount = loader.apply("vkCmdSetViewportWithCount", DESCRIPTOR$vkCmdSetViewportWithCount);
        HANDLE$vkCmdSetScissorWithCount = loader.apply("vkCmdSetScissorWithCount", DESCRIPTOR$vkCmdSetScissorWithCount);
        HANDLE$vkCmdBindIndexBuffer2KHR = loader.apply("vkCmdBindIndexBuffer2KHR", DESCRIPTOR$vkCmdBindIndexBuffer2KHR);
        HANDLE$vkCmdBindVertexBuffers2 = loader.apply("vkCmdBindVertexBuffers2", DESCRIPTOR$vkCmdBindVertexBuffers2);
        HANDLE$vkCmdSetDepthTestEnable = loader.apply("vkCmdSetDepthTestEnable", DESCRIPTOR$vkCmdSetDepthTestEnable);
        HANDLE$vkCmdSetDepthWriteEnable = loader.apply("vkCmdSetDepthWriteEnable", DESCRIPTOR$vkCmdSetDepthWriteEnable);
        HANDLE$vkCmdSetDepthCompareOp = loader.apply("vkCmdSetDepthCompareOp", DESCRIPTOR$vkCmdSetDepthCompareOp);
        HANDLE$vkCmdSetDepthBoundsTestEnable = loader.apply("vkCmdSetDepthBoundsTestEnable", DESCRIPTOR$vkCmdSetDepthBoundsTestEnable);
        HANDLE$vkCmdSetStencilTestEnable = loader.apply("vkCmdSetStencilTestEnable", DESCRIPTOR$vkCmdSetStencilTestEnable);
        HANDLE$vkCmdSetStencilOp = loader.apply("vkCmdSetStencilOp", DESCRIPTOR$vkCmdSetStencilOp);
        HANDLE$vkCmdSetPatchControlPointsEXT = loader.apply("vkCmdSetPatchControlPointsEXT", DESCRIPTOR$vkCmdSetPatchControlPointsEXT);
        HANDLE$vkCmdSetRasterizerDiscardEnable = loader.apply("vkCmdSetRasterizerDiscardEnable", DESCRIPTOR$vkCmdSetRasterizerDiscardEnable);
        HANDLE$vkCmdSetDepthBiasEnable = loader.apply("vkCmdSetDepthBiasEnable", DESCRIPTOR$vkCmdSetDepthBiasEnable);
        HANDLE$vkCmdSetLogicOpEXT = loader.apply("vkCmdSetLogicOpEXT", DESCRIPTOR$vkCmdSetLogicOpEXT);
        HANDLE$vkCmdSetPrimitiveRestartEnable = loader.apply("vkCmdSetPrimitiveRestartEnable", DESCRIPTOR$vkCmdSetPrimitiveRestartEnable);
        HANDLE$vkCmdSetTessellationDomainOriginEXT = loader.apply("vkCmdSetTessellationDomainOriginEXT", DESCRIPTOR$vkCmdSetTessellationDomainOriginEXT);
        HANDLE$vkCmdSetDepthClampEnableEXT = loader.apply("vkCmdSetDepthClampEnableEXT", DESCRIPTOR$vkCmdSetDepthClampEnableEXT);
        HANDLE$vkCmdSetPolygonModeEXT = loader.apply("vkCmdSetPolygonModeEXT", DESCRIPTOR$vkCmdSetPolygonModeEXT);
        HANDLE$vkCmdSetRasterizationSamplesEXT = loader.apply("vkCmdSetRasterizationSamplesEXT", DESCRIPTOR$vkCmdSetRasterizationSamplesEXT);
        HANDLE$vkCmdSetSampleMaskEXT = loader.apply("vkCmdSetSampleMaskEXT", DESCRIPTOR$vkCmdSetSampleMaskEXT);
        HANDLE$vkCmdSetAlphaToCoverageEnableEXT = loader.apply("vkCmdSetAlphaToCoverageEnableEXT", DESCRIPTOR$vkCmdSetAlphaToCoverageEnableEXT);
        HANDLE$vkCmdSetAlphaToOneEnableEXT = loader.apply("vkCmdSetAlphaToOneEnableEXT", DESCRIPTOR$vkCmdSetAlphaToOneEnableEXT);
        HANDLE$vkCmdSetLogicOpEnableEXT = loader.apply("vkCmdSetLogicOpEnableEXT", DESCRIPTOR$vkCmdSetLogicOpEnableEXT);
        HANDLE$vkCmdSetColorBlendEnableEXT = loader.apply("vkCmdSetColorBlendEnableEXT", DESCRIPTOR$vkCmdSetColorBlendEnableEXT);
        HANDLE$vkCmdSetColorBlendEquationEXT = loader.apply("vkCmdSetColorBlendEquationEXT", DESCRIPTOR$vkCmdSetColorBlendEquationEXT);
        HANDLE$vkCmdSetColorWriteMaskEXT = loader.apply("vkCmdSetColorWriteMaskEXT", DESCRIPTOR$vkCmdSetColorWriteMaskEXT);
        HANDLE$vkCmdSetRasterizationStreamEXT = loader.apply("vkCmdSetRasterizationStreamEXT", DESCRIPTOR$vkCmdSetRasterizationStreamEXT);
        HANDLE$vkCmdSetConservativeRasterizationModeEXT = loader.apply("vkCmdSetConservativeRasterizationModeEXT", DESCRIPTOR$vkCmdSetConservativeRasterizationModeEXT);
        HANDLE$vkCmdSetExtraPrimitiveOverestimationSizeEXT = loader.apply("vkCmdSetExtraPrimitiveOverestimationSizeEXT", DESCRIPTOR$vkCmdSetExtraPrimitiveOverestimationSizeEXT);
        HANDLE$vkCmdSetDepthClipEnableEXT = loader.apply("vkCmdSetDepthClipEnableEXT", DESCRIPTOR$vkCmdSetDepthClipEnableEXT);
        HANDLE$vkCmdSetSampleLocationsEnableEXT = loader.apply("vkCmdSetSampleLocationsEnableEXT", DESCRIPTOR$vkCmdSetSampleLocationsEnableEXT);
        HANDLE$vkCmdSetColorBlendAdvancedEXT = loader.apply("vkCmdSetColorBlendAdvancedEXT", DESCRIPTOR$vkCmdSetColorBlendAdvancedEXT);
        HANDLE$vkCmdSetProvokingVertexModeEXT = loader.apply("vkCmdSetProvokingVertexModeEXT", DESCRIPTOR$vkCmdSetProvokingVertexModeEXT);
        HANDLE$vkCmdSetLineRasterizationModeEXT = loader.apply("vkCmdSetLineRasterizationModeEXT", DESCRIPTOR$vkCmdSetLineRasterizationModeEXT);
        HANDLE$vkCmdSetLineStippleEnableEXT = loader.apply("vkCmdSetLineStippleEnableEXT", DESCRIPTOR$vkCmdSetLineStippleEnableEXT);
        HANDLE$vkCmdSetDepthClipNegativeOneToOneEXT = loader.apply("vkCmdSetDepthClipNegativeOneToOneEXT", DESCRIPTOR$vkCmdSetDepthClipNegativeOneToOneEXT);
        HANDLE$vkCmdSetViewportWScalingEnableNV = loader.apply("vkCmdSetViewportWScalingEnableNV", DESCRIPTOR$vkCmdSetViewportWScalingEnableNV);
        HANDLE$vkCmdSetViewportSwizzleNV = loader.apply("vkCmdSetViewportSwizzleNV", DESCRIPTOR$vkCmdSetViewportSwizzleNV);
        HANDLE$vkCmdSetCoverageToColorEnableNV = loader.apply("vkCmdSetCoverageToColorEnableNV", DESCRIPTOR$vkCmdSetCoverageToColorEnableNV);
        HANDLE$vkCmdSetCoverageToColorLocationNV = loader.apply("vkCmdSetCoverageToColorLocationNV", DESCRIPTOR$vkCmdSetCoverageToColorLocationNV);
        HANDLE$vkCmdSetCoverageModulationModeNV = loader.apply("vkCmdSetCoverageModulationModeNV", DESCRIPTOR$vkCmdSetCoverageModulationModeNV);
        HANDLE$vkCmdSetCoverageModulationTableEnableNV = loader.apply("vkCmdSetCoverageModulationTableEnableNV", DESCRIPTOR$vkCmdSetCoverageModulationTableEnableNV);
        HANDLE$vkCmdSetCoverageModulationTableNV = loader.apply("vkCmdSetCoverageModulationTableNV", DESCRIPTOR$vkCmdSetCoverageModulationTableNV);
        HANDLE$vkCmdSetShadingRateImageEnableNV = loader.apply("vkCmdSetShadingRateImageEnableNV", DESCRIPTOR$vkCmdSetShadingRateImageEnableNV);
        HANDLE$vkCmdSetCoverageReductionModeNV = loader.apply("vkCmdSetCoverageReductionModeNV", DESCRIPTOR$vkCmdSetCoverageReductionModeNV);
        HANDLE$vkCmdSetRepresentativeFragmentTestEnableNV = loader.apply("vkCmdSetRepresentativeFragmentTestEnableNV", DESCRIPTOR$vkCmdSetRepresentativeFragmentTestEnableNV);
        HANDLE$vkCreatePrivateDataSlot = loader.apply("vkCreatePrivateDataSlot", DESCRIPTOR$vkCreatePrivateDataSlot);
        HANDLE$vkDestroyPrivateDataSlot = loader.apply("vkDestroyPrivateDataSlot", DESCRIPTOR$vkDestroyPrivateDataSlot);
        HANDLE$vkSetPrivateData = loader.apply("vkSetPrivateData", DESCRIPTOR$vkSetPrivateData);
        HANDLE$vkGetPrivateData = loader.apply("vkGetPrivateData", DESCRIPTOR$vkGetPrivateData);
        HANDLE$vkCmdCopyBuffer2 = loader.apply("vkCmdCopyBuffer2", DESCRIPTOR$vkCmdCopyBuffer2);
        HANDLE$vkCmdCopyImage2 = loader.apply("vkCmdCopyImage2", DESCRIPTOR$vkCmdCopyImage2);
        HANDLE$vkCmdBlitImage2 = loader.apply("vkCmdBlitImage2", DESCRIPTOR$vkCmdBlitImage2);
        HANDLE$vkCmdCopyBufferToImage2 = loader.apply("vkCmdCopyBufferToImage2", DESCRIPTOR$vkCmdCopyBufferToImage2);
        HANDLE$vkCmdCopyImageToBuffer2 = loader.apply("vkCmdCopyImageToBuffer2", DESCRIPTOR$vkCmdCopyImageToBuffer2);
        HANDLE$vkCmdResolveImage2 = loader.apply("vkCmdResolveImage2", DESCRIPTOR$vkCmdResolveImage2);
        HANDLE$vkCmdRefreshObjectsKHR = loader.apply("vkCmdRefreshObjectsKHR", DESCRIPTOR$vkCmdRefreshObjectsKHR);
        HANDLE$vkGetPhysicalDeviceRefreshableObjectTypesKHR = loader.apply("vkGetPhysicalDeviceRefreshableObjectTypesKHR", DESCRIPTOR$vkGetPhysicalDeviceRefreshableObjectTypesKHR);
        HANDLE$vkCmdSetFragmentShadingRateKHR = loader.apply("vkCmdSetFragmentShadingRateKHR", DESCRIPTOR$vkCmdSetFragmentShadingRateKHR);
        HANDLE$vkGetPhysicalDeviceFragmentShadingRatesKHR = loader.apply("vkGetPhysicalDeviceFragmentShadingRatesKHR", DESCRIPTOR$vkGetPhysicalDeviceFragmentShadingRatesKHR);
        HANDLE$vkCmdSetFragmentShadingRateEnumNV = loader.apply("vkCmdSetFragmentShadingRateEnumNV", DESCRIPTOR$vkCmdSetFragmentShadingRateEnumNV);
        HANDLE$vkGetAccelerationStructureBuildSizesKHR = loader.apply("vkGetAccelerationStructureBuildSizesKHR", DESCRIPTOR$vkGetAccelerationStructureBuildSizesKHR);
        HANDLE$vkCmdSetVertexInputEXT = loader.apply("vkCmdSetVertexInputEXT", DESCRIPTOR$vkCmdSetVertexInputEXT);
        HANDLE$vkCmdSetColorWriteEnableEXT = loader.apply("vkCmdSetColorWriteEnableEXT", DESCRIPTOR$vkCmdSetColorWriteEnableEXT);
        HANDLE$vkCmdSetEvent2 = loader.apply("vkCmdSetEvent2", DESCRIPTOR$vkCmdSetEvent2);
        HANDLE$vkCmdResetEvent2 = loader.apply("vkCmdResetEvent2", DESCRIPTOR$vkCmdResetEvent2);
        HANDLE$vkCmdWaitEvents2 = loader.apply("vkCmdWaitEvents2", DESCRIPTOR$vkCmdWaitEvents2);
        HANDLE$vkCmdPipelineBarrier2 = loader.apply("vkCmdPipelineBarrier2", DESCRIPTOR$vkCmdPipelineBarrier2);
        HANDLE$vkQueueSubmit2 = loader.apply("vkQueueSubmit2", DESCRIPTOR$vkQueueSubmit2);
        HANDLE$vkCmdWriteTimestamp2 = loader.apply("vkCmdWriteTimestamp2", DESCRIPTOR$vkCmdWriteTimestamp2);
        HANDLE$vkCmdWriteBufferMarker2AMD = loader.apply("vkCmdWriteBufferMarker2AMD", DESCRIPTOR$vkCmdWriteBufferMarker2AMD);
        HANDLE$vkGetQueueCheckpointData2NV = loader.apply("vkGetQueueCheckpointData2NV", DESCRIPTOR$vkGetQueueCheckpointData2NV);
        HANDLE$vkCopyMemoryToImageEXT = loader.apply("vkCopyMemoryToImageEXT", DESCRIPTOR$vkCopyMemoryToImageEXT);
        HANDLE$vkCopyImageToMemoryEXT = loader.apply("vkCopyImageToMemoryEXT", DESCRIPTOR$vkCopyImageToMemoryEXT);
        HANDLE$vkCopyImageToImageEXT = loader.apply("vkCopyImageToImageEXT", DESCRIPTOR$vkCopyImageToImageEXT);
        HANDLE$vkTransitionImageLayoutEXT = loader.apply("vkTransitionImageLayoutEXT", DESCRIPTOR$vkTransitionImageLayoutEXT);
        HANDLE$vkCmdDecompressMemoryNV = loader.apply("vkCmdDecompressMemoryNV", DESCRIPTOR$vkCmdDecompressMemoryNV);
        HANDLE$vkCmdDecompressMemoryIndirectCountNV = loader.apply("vkCmdDecompressMemoryIndirectCountNV", DESCRIPTOR$vkCmdDecompressMemoryIndirectCountNV);
        HANDLE$vkCreateCuModuleNVX = loader.apply("vkCreateCuModuleNVX", DESCRIPTOR$vkCreateCuModuleNVX);
        HANDLE$vkCreateCuFunctionNVX = loader.apply("vkCreateCuFunctionNVX", DESCRIPTOR$vkCreateCuFunctionNVX);
        HANDLE$vkDestroyCuModuleNVX = loader.apply("vkDestroyCuModuleNVX", DESCRIPTOR$vkDestroyCuModuleNVX);
        HANDLE$vkDestroyCuFunctionNVX = loader.apply("vkDestroyCuFunctionNVX", DESCRIPTOR$vkDestroyCuFunctionNVX);
        HANDLE$vkCmdCuLaunchKernelNVX = loader.apply("vkCmdCuLaunchKernelNVX", DESCRIPTOR$vkCmdCuLaunchKernelNVX);
        HANDLE$vkGetDescriptorSetLayoutSizeEXT = loader.apply("vkGetDescriptorSetLayoutSizeEXT", DESCRIPTOR$vkGetDescriptorSetLayoutSizeEXT);
        HANDLE$vkGetDescriptorSetLayoutBindingOffsetEXT = loader.apply("vkGetDescriptorSetLayoutBindingOffsetEXT", DESCRIPTOR$vkGetDescriptorSetLayoutBindingOffsetEXT);
        HANDLE$vkGetDescriptorEXT = loader.apply("vkGetDescriptorEXT", DESCRIPTOR$vkGetDescriptorEXT);
        HANDLE$vkCmdBindDescriptorBuffersEXT = loader.apply("vkCmdBindDescriptorBuffersEXT", DESCRIPTOR$vkCmdBindDescriptorBuffersEXT);
        HANDLE$vkCmdSetDescriptorBufferOffsetsEXT = loader.apply("vkCmdSetDescriptorBufferOffsetsEXT", DESCRIPTOR$vkCmdSetDescriptorBufferOffsetsEXT);
        HANDLE$vkCmdBindDescriptorBufferEmbeddedSamplersEXT = loader.apply("vkCmdBindDescriptorBufferEmbeddedSamplersEXT", DESCRIPTOR$vkCmdBindDescriptorBufferEmbeddedSamplersEXT);
        HANDLE$vkGetBufferOpaqueCaptureDescriptorDataEXT = loader.apply("vkGetBufferOpaqueCaptureDescriptorDataEXT", DESCRIPTOR$vkGetBufferOpaqueCaptureDescriptorDataEXT);
        HANDLE$vkGetImageOpaqueCaptureDescriptorDataEXT = loader.apply("vkGetImageOpaqueCaptureDescriptorDataEXT", DESCRIPTOR$vkGetImageOpaqueCaptureDescriptorDataEXT);
        HANDLE$vkGetImageViewOpaqueCaptureDescriptorDataEXT = loader.apply("vkGetImageViewOpaqueCaptureDescriptorDataEXT", DESCRIPTOR$vkGetImageViewOpaqueCaptureDescriptorDataEXT);
        HANDLE$vkGetSamplerOpaqueCaptureDescriptorDataEXT = loader.apply("vkGetSamplerOpaqueCaptureDescriptorDataEXT", DESCRIPTOR$vkGetSamplerOpaqueCaptureDescriptorDataEXT);
        HANDLE$vkGetAccelerationStructureOpaqueCaptureDescriptorDataEXT = loader.apply("vkGetAccelerationStructureOpaqueCaptureDescriptorDataEXT", DESCRIPTOR$vkGetAccelerationStructureOpaqueCaptureDescriptorDataEXT);
        HANDLE$vkSetDeviceMemoryPriorityEXT = loader.apply("vkSetDeviceMemoryPriorityEXT", DESCRIPTOR$vkSetDeviceMemoryPriorityEXT);
        HANDLE$vkWaitForPresentKHR = loader.apply("vkWaitForPresentKHR", DESCRIPTOR$vkWaitForPresentKHR);
        HANDLE$vkCreateBufferCollectionFUCHSIA = loader.apply("vkCreateBufferCollectionFUCHSIA", DESCRIPTOR$vkCreateBufferCollectionFUCHSIA);
        HANDLE$vkSetBufferCollectionBufferConstraintsFUCHSIA = loader.apply("vkSetBufferCollectionBufferConstraintsFUCHSIA", DESCRIPTOR$vkSetBufferCollectionBufferConstraintsFUCHSIA);
        HANDLE$vkSetBufferCollectionImageConstraintsFUCHSIA = loader.apply("vkSetBufferCollectionImageConstraintsFUCHSIA", DESCRIPTOR$vkSetBufferCollectionImageConstraintsFUCHSIA);
        HANDLE$vkDestroyBufferCollectionFUCHSIA = loader.apply("vkDestroyBufferCollectionFUCHSIA", DESCRIPTOR$vkDestroyBufferCollectionFUCHSIA);
        HANDLE$vkGetBufferCollectionPropertiesFUCHSIA = loader.apply("vkGetBufferCollectionPropertiesFUCHSIA", DESCRIPTOR$vkGetBufferCollectionPropertiesFUCHSIA);
        HANDLE$vkCreateCudaModuleNV = loader.apply("vkCreateCudaModuleNV", DESCRIPTOR$vkCreateCudaModuleNV);
        HANDLE$vkGetCudaModuleCacheNV = loader.apply("vkGetCudaModuleCacheNV", DESCRIPTOR$vkGetCudaModuleCacheNV);
        HANDLE$vkCreateCudaFunctionNV = loader.apply("vkCreateCudaFunctionNV", DESCRIPTOR$vkCreateCudaFunctionNV);
        HANDLE$vkDestroyCudaModuleNV = loader.apply("vkDestroyCudaModuleNV", DESCRIPTOR$vkDestroyCudaModuleNV);
        HANDLE$vkDestroyCudaFunctionNV = loader.apply("vkDestroyCudaFunctionNV", DESCRIPTOR$vkDestroyCudaFunctionNV);
        HANDLE$vkCmdCudaLaunchKernelNV = loader.apply("vkCmdCudaLaunchKernelNV", DESCRIPTOR$vkCmdCudaLaunchKernelNV);
        HANDLE$vkCmdBeginRendering = loader.apply("vkCmdBeginRendering", DESCRIPTOR$vkCmdBeginRendering);
        HANDLE$vkCmdEndRendering = loader.apply("vkCmdEndRendering", DESCRIPTOR$vkCmdEndRendering);
        HANDLE$vkGetDescriptorSetLayoutHostMappingInfoVALVE = loader.apply("vkGetDescriptorSetLayoutHostMappingInfoVALVE", DESCRIPTOR$vkGetDescriptorSetLayoutHostMappingInfoVALVE);
        HANDLE$vkGetDescriptorSetHostMappingVALVE = loader.apply("vkGetDescriptorSetHostMappingVALVE", DESCRIPTOR$vkGetDescriptorSetHostMappingVALVE);
        HANDLE$vkCreateMicromapEXT = loader.apply("vkCreateMicromapEXT", DESCRIPTOR$vkCreateMicromapEXT);
        HANDLE$vkCmdBuildMicromapsEXT = loader.apply("vkCmdBuildMicromapsEXT", DESCRIPTOR$vkCmdBuildMicromapsEXT);
        HANDLE$vkBuildMicromapsEXT = loader.apply("vkBuildMicromapsEXT", DESCRIPTOR$vkBuildMicromapsEXT);
        HANDLE$vkDestroyMicromapEXT = loader.apply("vkDestroyMicromapEXT", DESCRIPTOR$vkDestroyMicromapEXT);
        HANDLE$vkCmdCopyMicromapEXT = loader.apply("vkCmdCopyMicromapEXT", DESCRIPTOR$vkCmdCopyMicromapEXT);
        HANDLE$vkCopyMicromapEXT = loader.apply("vkCopyMicromapEXT", DESCRIPTOR$vkCopyMicromapEXT);
        HANDLE$vkCmdCopyMicromapToMemoryEXT = loader.apply("vkCmdCopyMicromapToMemoryEXT", DESCRIPTOR$vkCmdCopyMicromapToMemoryEXT);
        HANDLE$vkCopyMicromapToMemoryEXT = loader.apply("vkCopyMicromapToMemoryEXT", DESCRIPTOR$vkCopyMicromapToMemoryEXT);
        HANDLE$vkCmdCopyMemoryToMicromapEXT = loader.apply("vkCmdCopyMemoryToMicromapEXT", DESCRIPTOR$vkCmdCopyMemoryToMicromapEXT);
        HANDLE$vkCopyMemoryToMicromapEXT = loader.apply("vkCopyMemoryToMicromapEXT", DESCRIPTOR$vkCopyMemoryToMicromapEXT);
        HANDLE$vkCmdWriteMicromapsPropertiesEXT = loader.apply("vkCmdWriteMicromapsPropertiesEXT", DESCRIPTOR$vkCmdWriteMicromapsPropertiesEXT);
        HANDLE$vkWriteMicromapsPropertiesEXT = loader.apply("vkWriteMicromapsPropertiesEXT", DESCRIPTOR$vkWriteMicromapsPropertiesEXT);
        HANDLE$vkGetDeviceMicromapCompatibilityEXT = loader.apply("vkGetDeviceMicromapCompatibilityEXT", DESCRIPTOR$vkGetDeviceMicromapCompatibilityEXT);
        HANDLE$vkGetMicromapBuildSizesEXT = loader.apply("vkGetMicromapBuildSizesEXT", DESCRIPTOR$vkGetMicromapBuildSizesEXT);
        HANDLE$vkGetShaderModuleIdentifierEXT = loader.apply("vkGetShaderModuleIdentifierEXT", DESCRIPTOR$vkGetShaderModuleIdentifierEXT);
        HANDLE$vkGetShaderModuleCreateInfoIdentifierEXT = loader.apply("vkGetShaderModuleCreateInfoIdentifierEXT", DESCRIPTOR$vkGetShaderModuleCreateInfoIdentifierEXT);
        HANDLE$vkGetImageSubresourceLayout2KHR = loader.apply("vkGetImageSubresourceLayout2KHR", DESCRIPTOR$vkGetImageSubresourceLayout2KHR);
        HANDLE$vkGetPipelinePropertiesEXT = loader.apply("vkGetPipelinePropertiesEXT", DESCRIPTOR$vkGetPipelinePropertiesEXT);
        HANDLE$vkExportMetalObjectsEXT = loader.apply("vkExportMetalObjectsEXT", DESCRIPTOR$vkExportMetalObjectsEXT);
        HANDLE$vkGetFramebufferTilePropertiesQCOM = loader.apply("vkGetFramebufferTilePropertiesQCOM", DESCRIPTOR$vkGetFramebufferTilePropertiesQCOM);
        HANDLE$vkGetDynamicRenderingTilePropertiesQCOM = loader.apply("vkGetDynamicRenderingTilePropertiesQCOM", DESCRIPTOR$vkGetDynamicRenderingTilePropertiesQCOM);
        HANDLE$vkGetPhysicalDeviceOpticalFlowImageFormatsNV = loader.apply("vkGetPhysicalDeviceOpticalFlowImageFormatsNV", DESCRIPTOR$vkGetPhysicalDeviceOpticalFlowImageFormatsNV);
        HANDLE$vkCreateOpticalFlowSessionNV = loader.apply("vkCreateOpticalFlowSessionNV", DESCRIPTOR$vkCreateOpticalFlowSessionNV);
        HANDLE$vkDestroyOpticalFlowSessionNV = loader.apply("vkDestroyOpticalFlowSessionNV", DESCRIPTOR$vkDestroyOpticalFlowSessionNV);
        HANDLE$vkBindOpticalFlowSessionImageNV = loader.apply("vkBindOpticalFlowSessionImageNV", DESCRIPTOR$vkBindOpticalFlowSessionImageNV);
        HANDLE$vkCmdOpticalFlowExecuteNV = loader.apply("vkCmdOpticalFlowExecuteNV", DESCRIPTOR$vkCmdOpticalFlowExecuteNV);
        HANDLE$vkGetDeviceFaultInfoEXT = loader.apply("vkGetDeviceFaultInfoEXT", DESCRIPTOR$vkGetDeviceFaultInfoEXT);
        HANDLE$vkCmdSetDepthBias2EXT = loader.apply("vkCmdSetDepthBias2EXT", DESCRIPTOR$vkCmdSetDepthBias2EXT);
        HANDLE$vkReleaseSwapchainImagesEXT = loader.apply("vkReleaseSwapchainImagesEXT", DESCRIPTOR$vkReleaseSwapchainImagesEXT);
        HANDLE$vkGetDeviceImageSubresourceLayoutKHR = loader.apply("vkGetDeviceImageSubresourceLayoutKHR", DESCRIPTOR$vkGetDeviceImageSubresourceLayoutKHR);
        HANDLE$vkMapMemory2KHR = loader.apply("vkMapMemory2KHR", DESCRIPTOR$vkMapMemory2KHR);
        HANDLE$vkUnmapMemory2KHR = loader.apply("vkUnmapMemory2KHR", DESCRIPTOR$vkUnmapMemory2KHR);
        HANDLE$vkCreateShadersEXT = loader.apply("vkCreateShadersEXT", DESCRIPTOR$vkCreateShadersEXT);
        HANDLE$vkDestroyShaderEXT = loader.apply("vkDestroyShaderEXT", DESCRIPTOR$vkDestroyShaderEXT);
        HANDLE$vkGetShaderBinaryDataEXT = loader.apply("vkGetShaderBinaryDataEXT", DESCRIPTOR$vkGetShaderBinaryDataEXT);
        HANDLE$vkCmdBindShadersEXT = loader.apply("vkCmdBindShadersEXT", DESCRIPTOR$vkCmdBindShadersEXT);
        HANDLE$vkGetScreenBufferPropertiesQNX = loader.apply("vkGetScreenBufferPropertiesQNX", DESCRIPTOR$vkGetScreenBufferPropertiesQNX);
        HANDLE$vkGetPhysicalDeviceCooperativeMatrixPropertiesKHR = loader.apply("vkGetPhysicalDeviceCooperativeMatrixPropertiesKHR", DESCRIPTOR$vkGetPhysicalDeviceCooperativeMatrixPropertiesKHR);
        HANDLE$vkGetExecutionGraphPipelineScratchSizeAMDX = loader.apply("vkGetExecutionGraphPipelineScratchSizeAMDX", DESCRIPTOR$vkGetExecutionGraphPipelineScratchSizeAMDX);
        HANDLE$vkGetExecutionGraphPipelineNodeIndexAMDX = loader.apply("vkGetExecutionGraphPipelineNodeIndexAMDX", DESCRIPTOR$vkGetExecutionGraphPipelineNodeIndexAMDX);
        HANDLE$vkCreateExecutionGraphPipelinesAMDX = loader.apply("vkCreateExecutionGraphPipelinesAMDX", DESCRIPTOR$vkCreateExecutionGraphPipelinesAMDX);
        HANDLE$vkCmdInitializeGraphScratchMemoryAMDX = loader.apply("vkCmdInitializeGraphScratchMemoryAMDX", DESCRIPTOR$vkCmdInitializeGraphScratchMemoryAMDX);
        HANDLE$vkCmdDispatchGraphAMDX = loader.apply("vkCmdDispatchGraphAMDX", DESCRIPTOR$vkCmdDispatchGraphAMDX);
        HANDLE$vkCmdDispatchGraphIndirectAMDX = loader.apply("vkCmdDispatchGraphIndirectAMDX", DESCRIPTOR$vkCmdDispatchGraphIndirectAMDX);
        HANDLE$vkCmdDispatchGraphIndirectCountAMDX = loader.apply("vkCmdDispatchGraphIndirectCountAMDX", DESCRIPTOR$vkCmdDispatchGraphIndirectCountAMDX);
        HANDLE$vkCmdBindDescriptorSets2KHR = loader.apply("vkCmdBindDescriptorSets2KHR", DESCRIPTOR$vkCmdBindDescriptorSets2KHR);
        HANDLE$vkCmdPushConstants2KHR = loader.apply("vkCmdPushConstants2KHR", DESCRIPTOR$vkCmdPushConstants2KHR);
        HANDLE$vkCmdPushDescriptorSet2KHR = loader.apply("vkCmdPushDescriptorSet2KHR", DESCRIPTOR$vkCmdPushDescriptorSet2KHR);
        HANDLE$vkCmdPushDescriptorSetWithTemplate2KHR = loader.apply("vkCmdPushDescriptorSetWithTemplate2KHR", DESCRIPTOR$vkCmdPushDescriptorSetWithTemplate2KHR);
        HANDLE$vkCmdSetDescriptorBufferOffsets2EXT = loader.apply("vkCmdSetDescriptorBufferOffsets2EXT", DESCRIPTOR$vkCmdSetDescriptorBufferOffsets2EXT);
        HANDLE$vkCmdBindDescriptorBufferEmbeddedSamplers2EXT = loader.apply("vkCmdBindDescriptorBufferEmbeddedSamplers2EXT", DESCRIPTOR$vkCmdBindDescriptorBufferEmbeddedSamplers2EXT);
        HANDLE$vkSetLatencySleepModeNV = loader.apply("vkSetLatencySleepModeNV", DESCRIPTOR$vkSetLatencySleepModeNV);
        HANDLE$vkLatencySleepNV = loader.apply("vkLatencySleepNV", DESCRIPTOR$vkLatencySleepNV);
        HANDLE$vkSetLatencyMarkerNV = loader.apply("vkSetLatencyMarkerNV", DESCRIPTOR$vkSetLatencyMarkerNV);
        HANDLE$vkGetLatencyTimingsNV = loader.apply("vkGetLatencyTimingsNV", DESCRIPTOR$vkGetLatencyTimingsNV);
        HANDLE$vkQueueNotifyOutOfBandNV = loader.apply("vkQueueNotifyOutOfBandNV", DESCRIPTOR$vkQueueNotifyOutOfBandNV);
        HANDLE$vkCmdSetRenderingAttachmentLocationsKHR = loader.apply("vkCmdSetRenderingAttachmentLocationsKHR", DESCRIPTOR$vkCmdSetRenderingAttachmentLocationsKHR);
        HANDLE$vkCmdSetRenderingInputAttachmentIndicesKHR = loader.apply("vkCmdSetRenderingInputAttachmentIndicesKHR", DESCRIPTOR$vkCmdSetRenderingInputAttachmentIndicesKHR);
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkDestroyDevice.html">vkDestroyDevice</a>
    public void vkDestroyDevice(
            @nullable VkDevice device,
            @nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator
    ) {
        try {
            HANDLE$vkDestroyDevice.invokeExact(
                    (MemorySegment) (device != null ? device.segment() : MemorySegment.NULL),
                    (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkGetDeviceQueue.html">vkGetDeviceQueue</a>
    public void vkGetDeviceQueue(
            VkDevice device,
            @unsigned int queueFamilyIndex,
            @unsigned int queueIndex,
            @pointer(target=VkQueue.class) VkQueue.Buffer pQueue
    ) {
        try {
            HANDLE$vkGetDeviceQueue.invokeExact(
                    device.segment(),
                    queueFamilyIndex,
                    queueIndex,
                    pQueue.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkQueueSubmit.html">vkQueueSubmit</a>
    public @enumtype(VkResult.class) int vkQueueSubmit(
            VkQueue queue,
            @unsigned int submitCount,
            @nullable @pointer(target=VkSubmitInfo.class) VkSubmitInfo pSubmits,
            @nullable VkFence fence
    ) {
        try {
            return (int) HANDLE$vkQueueSubmit.invokeExact(
                    queue.segment(),
                    submitCount,
                    (MemorySegment) (pSubmits != null ? pSubmits.segment() : MemorySegment.NULL),
                    (MemorySegment) (fence != null ? fence.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkQueueWaitIdle.html">vkQueueWaitIdle</a>
    public @enumtype(VkResult.class) int vkQueueWaitIdle(
            VkQueue queue
    ) {
        try {
            return (int) HANDLE$vkQueueWaitIdle.invokeExact(
                    queue.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkDeviceWaitIdle.html">vkDeviceWaitIdle</a>
    public @enumtype(VkResult.class) int vkDeviceWaitIdle(
            VkDevice device
    ) {
        try {
            return (int) HANDLE$vkDeviceWaitIdle.invokeExact(
                    device.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkAllocateMemory.html">vkAllocateMemory</a>
    public @enumtype(VkResult.class) int vkAllocateMemory(
            VkDevice device,
            @pointer(target=VkMemoryAllocateInfo.class) VkMemoryAllocateInfo pAllocateInfo,
            @nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator,
            @pointer(target=VkDeviceMemory.class) VkDeviceMemory.Buffer pMemory
    ) {
        try {
            return (int) HANDLE$vkAllocateMemory.invokeExact(
                    device.segment(),
                    pAllocateInfo.segment(),
                    (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL),
                    pMemory.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkFreeMemory.html">vkFreeMemory</a>
    public void vkFreeMemory(
            VkDevice device,
            @nullable VkDeviceMemory memory,
            @nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator
    ) {
        try {
            HANDLE$vkFreeMemory.invokeExact(
                    device.segment(),
                    (MemorySegment) (memory != null ? memory.segment() : MemorySegment.NULL),
                    (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkMapMemory.html">vkMapMemory</a>
    public @enumtype(VkResult.class) int vkMapMemory(
            VkDevice device,
            VkDeviceMemory memory,
            @unsigned long offset,
            @unsigned long size,
            @enumtype(VkMemoryMapFlags.class) int flags,
            @pointer(comment="void **") MemorySegment ppData
    ) {
        try {
            return (int) HANDLE$vkMapMemory.invokeExact(
                    device.segment(),
                    memory.segment(),
                    offset,
                    size,
                    flags,
                    ppData
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkUnmapMemory.html">vkUnmapMemory</a>
    public void vkUnmapMemory(
            VkDevice device,
            VkDeviceMemory memory
    ) {
        try {
            HANDLE$vkUnmapMemory.invokeExact(
                    device.segment(),
                    memory.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkFlushMappedMemoryRanges.html">vkFlushMappedMemoryRanges</a>
    public @enumtype(VkResult.class) int vkFlushMappedMemoryRanges(
            VkDevice device,
            @unsigned int memoryRangeCount,
            @pointer(target=VkMappedMemoryRange.class) VkMappedMemoryRange pMemoryRanges
    ) {
        try {
            return (int) HANDLE$vkFlushMappedMemoryRanges.invokeExact(
                    device.segment(),
                    memoryRangeCount,
                    pMemoryRanges.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkInvalidateMappedMemoryRanges.html">vkInvalidateMappedMemoryRanges</a>
    public @enumtype(VkResult.class) int vkInvalidateMappedMemoryRanges(
            VkDevice device,
            @unsigned int memoryRangeCount,
            @pointer(target=VkMappedMemoryRange.class) VkMappedMemoryRange pMemoryRanges
    ) {
        try {
            return (int) HANDLE$vkInvalidateMappedMemoryRanges.invokeExact(
                    device.segment(),
                    memoryRangeCount,
                    pMemoryRanges.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkGetDeviceMemoryCommitment.html">vkGetDeviceMemoryCommitment</a>
    public void vkGetDeviceMemoryCommitment(
            VkDevice device,
            VkDeviceMemory memory,
            @unsigned LongBuffer pCommittedMemoryInBytes
    ) {
        try {
            HANDLE$vkGetDeviceMemoryCommitment.invokeExact(
                    device.segment(),
                    memory.segment(),
                    pCommittedMemoryInBytes.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkGetBufferMemoryRequirements.html">vkGetBufferMemoryRequirements</a>
    public void vkGetBufferMemoryRequirements(
            VkDevice device,
            VkBuffer buffer,
            @pointer(target=VkMemoryRequirements.class) VkMemoryRequirements pMemoryRequirements
    ) {
        try {
            HANDLE$vkGetBufferMemoryRequirements.invokeExact(
                    device.segment(),
                    buffer.segment(),
                    pMemoryRequirements.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkBindBufferMemory.html">vkBindBufferMemory</a>
    public @enumtype(VkResult.class) int vkBindBufferMemory(
            VkDevice device,
            VkBuffer buffer,
            VkDeviceMemory memory,
            @unsigned long memoryOffset
    ) {
        try {
            return (int) HANDLE$vkBindBufferMemory.invokeExact(
                    device.segment(),
                    buffer.segment(),
                    memory.segment(),
                    memoryOffset
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkGetImageMemoryRequirements.html">vkGetImageMemoryRequirements</a>
    public void vkGetImageMemoryRequirements(
            VkDevice device,
            VkImage image,
            @pointer(target=VkMemoryRequirements.class) VkMemoryRequirements pMemoryRequirements
    ) {
        try {
            HANDLE$vkGetImageMemoryRequirements.invokeExact(
                    device.segment(),
                    image.segment(),
                    pMemoryRequirements.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkBindImageMemory.html">vkBindImageMemory</a>
    public @enumtype(VkResult.class) int vkBindImageMemory(
            VkDevice device,
            VkImage image,
            VkDeviceMemory memory,
            @unsigned long memoryOffset
    ) {
        try {
            return (int) HANDLE$vkBindImageMemory.invokeExact(
                    device.segment(),
                    image.segment(),
                    memory.segment(),
                    memoryOffset
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkGetImageSparseMemoryRequirements.html">vkGetImageSparseMemoryRequirements</a>
    public void vkGetImageSparseMemoryRequirements(
            VkDevice device,
            VkImage image,
            @unsigned IntBuffer pSparseMemoryRequirementCount,
            @nullable @pointer(target=VkSparseImageMemoryRequirements.class) VkSparseImageMemoryRequirements pSparseMemoryRequirements
    ) {
        try {
            HANDLE$vkGetImageSparseMemoryRequirements.invokeExact(
                    device.segment(),
                    image.segment(),
                    pSparseMemoryRequirementCount.segment(),
                    (MemorySegment) (pSparseMemoryRequirements != null ? pSparseMemoryRequirements.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkQueueBindSparse.html">vkQueueBindSparse</a>
    public @enumtype(VkResult.class) int vkQueueBindSparse(
            VkQueue queue,
            @unsigned int bindInfoCount,
            @nullable @pointer(target=VkBindSparseInfo.class) VkBindSparseInfo pBindInfo,
            @nullable VkFence fence
    ) {
        try {
            return (int) HANDLE$vkQueueBindSparse.invokeExact(
                    queue.segment(),
                    bindInfoCount,
                    (MemorySegment) (pBindInfo != null ? pBindInfo.segment() : MemorySegment.NULL),
                    (MemorySegment) (fence != null ? fence.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCreateFence.html">vkCreateFence</a>
    public @enumtype(VkResult.class) int vkCreateFence(
            VkDevice device,
            @pointer(target=VkFenceCreateInfo.class) VkFenceCreateInfo pCreateInfo,
            @nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator,
            @pointer(target=VkFence.class) VkFence.Buffer pFence
    ) {
        try {
            return (int) HANDLE$vkCreateFence.invokeExact(
                    device.segment(),
                    pCreateInfo.segment(),
                    (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL),
                    pFence.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkDestroyFence.html">vkDestroyFence</a>
    public void vkDestroyFence(
            VkDevice device,
            @nullable VkFence fence,
            @nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator
    ) {
        try {
            HANDLE$vkDestroyFence.invokeExact(
                    device.segment(),
                    (MemorySegment) (fence != null ? fence.segment() : MemorySegment.NULL),
                    (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkResetFences.html">vkResetFences</a>
    public @enumtype(VkResult.class) int vkResetFences(
            VkDevice device,
            @unsigned int fenceCount,
            @pointer(target=VkFence.class) VkFence.Buffer pFences
    ) {
        try {
            return (int) HANDLE$vkResetFences.invokeExact(
                    device.segment(),
                    fenceCount,
                    pFences.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkGetFenceStatus.html">vkGetFenceStatus</a>
    public @enumtype(VkResult.class) int vkGetFenceStatus(
            VkDevice device,
            VkFence fence
    ) {
        try {
            return (int) HANDLE$vkGetFenceStatus.invokeExact(
                    device.segment(),
                    fence.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkWaitForFences.html">vkWaitForFences</a>
    public @enumtype(VkResult.class) int vkWaitForFences(
            VkDevice device,
            @unsigned int fenceCount,
            @pointer(target=VkFence.class) VkFence.Buffer pFences,
            @unsigned int waitAll,
            @unsigned long timeout
    ) {
        try {
            return (int) HANDLE$vkWaitForFences.invokeExact(
                    device.segment(),
                    fenceCount,
                    pFences.segment(),
                    waitAll,
                    timeout
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCreateSemaphore.html">vkCreateSemaphore</a>
    public @enumtype(VkResult.class) int vkCreateSemaphore(
            VkDevice device,
            @pointer(target=VkSemaphoreCreateInfo.class) VkSemaphoreCreateInfo pCreateInfo,
            @nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator,
            @pointer(target=VkSemaphore.class) VkSemaphore.Buffer pSemaphore
    ) {
        try {
            return (int) HANDLE$vkCreateSemaphore.invokeExact(
                    device.segment(),
                    pCreateInfo.segment(),
                    (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL),
                    pSemaphore.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkDestroySemaphore.html">vkDestroySemaphore</a>
    public void vkDestroySemaphore(
            VkDevice device,
            @nullable VkSemaphore semaphore,
            @nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator
    ) {
        try {
            HANDLE$vkDestroySemaphore.invokeExact(
                    device.segment(),
                    (MemorySegment) (semaphore != null ? semaphore.segment() : MemorySegment.NULL),
                    (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCreateEvent.html">vkCreateEvent</a>
    public @enumtype(VkResult.class) int vkCreateEvent(
            VkDevice device,
            @pointer(target=VkEventCreateInfo.class) VkEventCreateInfo pCreateInfo,
            @nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator,
            @pointer(target=VkEvent.class) VkEvent.Buffer pEvent
    ) {
        try {
            return (int) HANDLE$vkCreateEvent.invokeExact(
                    device.segment(),
                    pCreateInfo.segment(),
                    (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL),
                    pEvent.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkDestroyEvent.html">vkDestroyEvent</a>
    public void vkDestroyEvent(
            VkDevice device,
            @nullable VkEvent event,
            @nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator
    ) {
        try {
            HANDLE$vkDestroyEvent.invokeExact(
                    device.segment(),
                    (MemorySegment) (event != null ? event.segment() : MemorySegment.NULL),
                    (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkGetEventStatus.html">vkGetEventStatus</a>
    public @enumtype(VkResult.class) int vkGetEventStatus(
            VkDevice device,
            VkEvent event
    ) {
        try {
            return (int) HANDLE$vkGetEventStatus.invokeExact(
                    device.segment(),
                    event.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkSetEvent.html">vkSetEvent</a>
    public @enumtype(VkResult.class) int vkSetEvent(
            VkDevice device,
            VkEvent event
    ) {
        try {
            return (int) HANDLE$vkSetEvent.invokeExact(
                    device.segment(),
                    event.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkResetEvent.html">vkResetEvent</a>
    public @enumtype(VkResult.class) int vkResetEvent(
            VkDevice device,
            VkEvent event
    ) {
        try {
            return (int) HANDLE$vkResetEvent.invokeExact(
                    device.segment(),
                    event.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCreateQueryPool.html">vkCreateQueryPool</a>
    public @enumtype(VkResult.class) int vkCreateQueryPool(
            VkDevice device,
            @pointer(target=VkQueryPoolCreateInfo.class) VkQueryPoolCreateInfo pCreateInfo,
            @nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator,
            @pointer(target=VkQueryPool.class) VkQueryPool.Buffer pQueryPool
    ) {
        try {
            return (int) HANDLE$vkCreateQueryPool.invokeExact(
                    device.segment(),
                    pCreateInfo.segment(),
                    (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL),
                    pQueryPool.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkDestroyQueryPool.html">vkDestroyQueryPool</a>
    public void vkDestroyQueryPool(
            VkDevice device,
            @nullable VkQueryPool queryPool,
            @nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator
    ) {
        try {
            HANDLE$vkDestroyQueryPool.invokeExact(
                    device.segment(),
                    (MemorySegment) (queryPool != null ? queryPool.segment() : MemorySegment.NULL),
                    (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkGetQueryPoolResults.html">vkGetQueryPoolResults</a>
    public @enumtype(VkResult.class) int vkGetQueryPoolResults(
            VkDevice device,
            VkQueryPool queryPool,
            @unsigned int firstQuery,
            @unsigned int queryCount,
            @unsigned long dataSize,
            @pointer(comment="void*") MemorySegment pData,
            @unsigned long stride,
            @enumtype(VkQueryResultFlags.class) int flags
    ) {
        try {
            return (int) HANDLE$vkGetQueryPoolResults.invokeExact(
                    device.segment(),
                    queryPool.segment(),
                    firstQuery,
                    queryCount,
                    dataSize,
                    pData,
                    stride,
                    flags
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkResetQueryPool.html">vkResetQueryPool</a>
    public void vkResetQueryPool(
            VkDevice device,
            VkQueryPool queryPool,
            @unsigned int firstQuery,
            @unsigned int queryCount
    ) {
        try {
            HANDLE$vkResetQueryPool.invokeExact(
                    device.segment(),
                    queryPool.segment(),
                    firstQuery,
                    queryCount
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCreateBuffer.html">vkCreateBuffer</a>
    public @enumtype(VkResult.class) int vkCreateBuffer(
            VkDevice device,
            @pointer(target=VkBufferCreateInfo.class) VkBufferCreateInfo pCreateInfo,
            @nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator,
            @pointer(target=VkBuffer.class) VkBuffer.Buffer pBuffer
    ) {
        try {
            return (int) HANDLE$vkCreateBuffer.invokeExact(
                    device.segment(),
                    pCreateInfo.segment(),
                    (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL),
                    pBuffer.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkDestroyBuffer.html">vkDestroyBuffer</a>
    public void vkDestroyBuffer(
            VkDevice device,
            @nullable VkBuffer buffer,
            @nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator
    ) {
        try {
            HANDLE$vkDestroyBuffer.invokeExact(
                    device.segment(),
                    (MemorySegment) (buffer != null ? buffer.segment() : MemorySegment.NULL),
                    (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCreateBufferView.html">vkCreateBufferView</a>
    public @enumtype(VkResult.class) int vkCreateBufferView(
            VkDevice device,
            @pointer(target=VkBufferViewCreateInfo.class) VkBufferViewCreateInfo pCreateInfo,
            @nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator,
            @pointer(target=VkBufferView.class) VkBufferView.Buffer pView
    ) {
        try {
            return (int) HANDLE$vkCreateBufferView.invokeExact(
                    device.segment(),
                    pCreateInfo.segment(),
                    (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL),
                    pView.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkDestroyBufferView.html">vkDestroyBufferView</a>
    public void vkDestroyBufferView(
            VkDevice device,
            @nullable VkBufferView bufferView,
            @nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator
    ) {
        try {
            HANDLE$vkDestroyBufferView.invokeExact(
                    device.segment(),
                    (MemorySegment) (bufferView != null ? bufferView.segment() : MemorySegment.NULL),
                    (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCreateImage.html">vkCreateImage</a>
    public @enumtype(VkResult.class) int vkCreateImage(
            VkDevice device,
            @pointer(target=VkImageCreateInfo.class) VkImageCreateInfo pCreateInfo,
            @nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator,
            @pointer(target=VkImage.class) VkImage.Buffer pImage
    ) {
        try {
            return (int) HANDLE$vkCreateImage.invokeExact(
                    device.segment(),
                    pCreateInfo.segment(),
                    (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL),
                    pImage.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkDestroyImage.html">vkDestroyImage</a>
    public void vkDestroyImage(
            VkDevice device,
            @nullable VkImage image,
            @nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator
    ) {
        try {
            HANDLE$vkDestroyImage.invokeExact(
                    device.segment(),
                    (MemorySegment) (image != null ? image.segment() : MemorySegment.NULL),
                    (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkGetImageSubresourceLayout.html">vkGetImageSubresourceLayout</a>
    public void vkGetImageSubresourceLayout(
            VkDevice device,
            VkImage image,
            @pointer(target=VkImageSubresource.class) VkImageSubresource pSubresource,
            @pointer(target=VkSubresourceLayout.class) VkSubresourceLayout pLayout
    ) {
        try {
            HANDLE$vkGetImageSubresourceLayout.invokeExact(
                    device.segment(),
                    image.segment(),
                    pSubresource.segment(),
                    pLayout.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCreateImageView.html">vkCreateImageView</a>
    public @enumtype(VkResult.class) int vkCreateImageView(
            VkDevice device,
            @pointer(target=VkImageViewCreateInfo.class) VkImageViewCreateInfo pCreateInfo,
            @nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator,
            @pointer(target=VkImageView.class) VkImageView.Buffer pView
    ) {
        try {
            return (int) HANDLE$vkCreateImageView.invokeExact(
                    device.segment(),
                    pCreateInfo.segment(),
                    (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL),
                    pView.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkDestroyImageView.html">vkDestroyImageView</a>
    public void vkDestroyImageView(
            VkDevice device,
            @nullable VkImageView imageView,
            @nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator
    ) {
        try {
            HANDLE$vkDestroyImageView.invokeExact(
                    device.segment(),
                    (MemorySegment) (imageView != null ? imageView.segment() : MemorySegment.NULL),
                    (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCreateShaderModule.html">vkCreateShaderModule</a>
    public @enumtype(VkResult.class) int vkCreateShaderModule(
            VkDevice device,
            @pointer(target=VkShaderModuleCreateInfo.class) VkShaderModuleCreateInfo pCreateInfo,
            @nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator,
            @pointer(target=VkShaderModule.class) VkShaderModule.Buffer pShaderModule
    ) {
        try {
            return (int) HANDLE$vkCreateShaderModule.invokeExact(
                    device.segment(),
                    pCreateInfo.segment(),
                    (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL),
                    pShaderModule.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkDestroyShaderModule.html">vkDestroyShaderModule</a>
    public void vkDestroyShaderModule(
            VkDevice device,
            @nullable VkShaderModule shaderModule,
            @nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator
    ) {
        try {
            HANDLE$vkDestroyShaderModule.invokeExact(
                    device.segment(),
                    (MemorySegment) (shaderModule != null ? shaderModule.segment() : MemorySegment.NULL),
                    (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCreatePipelineCache.html">vkCreatePipelineCache</a>
    public @enumtype(VkResult.class) int vkCreatePipelineCache(
            VkDevice device,
            @pointer(target=VkPipelineCacheCreateInfo.class) VkPipelineCacheCreateInfo pCreateInfo,
            @nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator,
            @pointer(target=VkPipelineCache.class) VkPipelineCache.Buffer pPipelineCache
    ) {
        try {
            return (int) HANDLE$vkCreatePipelineCache.invokeExact(
                    device.segment(),
                    pCreateInfo.segment(),
                    (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL),
                    pPipelineCache.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkDestroyPipelineCache.html">vkDestroyPipelineCache</a>
    public void vkDestroyPipelineCache(
            VkDevice device,
            @nullable VkPipelineCache pipelineCache,
            @nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator
    ) {
        try {
            HANDLE$vkDestroyPipelineCache.invokeExact(
                    device.segment(),
                    (MemorySegment) (pipelineCache != null ? pipelineCache.segment() : MemorySegment.NULL),
                    (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkGetPipelineCacheData.html">vkGetPipelineCacheData</a>
    public @enumtype(VkResult.class) int vkGetPipelineCacheData(
            VkDevice device,
            VkPipelineCache pipelineCache,
            PointerBuffer pDataSize,
            @pointer(comment="void*") MemorySegment pData
    ) {
        try {
            return (int) HANDLE$vkGetPipelineCacheData.invokeExact(
                    device.segment(),
                    pipelineCache.segment(),
                    pDataSize.segment(),
                    pData
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkMergePipelineCaches.html">vkMergePipelineCaches</a>
    public @enumtype(VkResult.class) int vkMergePipelineCaches(
            VkDevice device,
            VkPipelineCache dstCache,
            @unsigned int srcCacheCount,
            @pointer(target=VkPipelineCache.class) VkPipelineCache.Buffer pSrcCaches
    ) {
        try {
            return (int) HANDLE$vkMergePipelineCaches.invokeExact(
                    device.segment(),
                    dstCache.segment(),
                    srcCacheCount,
                    pSrcCaches.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCreatePipelineBinariesKHR.html">vkCreatePipelineBinariesKHR</a>
    public @enumtype(VkResult.class) int vkCreatePipelineBinariesKHR(
            VkDevice device,
            @pointer(target=VkPipelineBinaryCreateInfoKHR.class) VkPipelineBinaryCreateInfoKHR pCreateInfo,
            @nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator,
            @pointer(target=VkPipelineBinaryHandlesInfoKHR.class) VkPipelineBinaryHandlesInfoKHR pBinaries
    ) {
        try {
            return (int) HANDLE$vkCreatePipelineBinariesKHR.invokeExact(
                    device.segment(),
                    pCreateInfo.segment(),
                    (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL),
                    pBinaries.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkDestroyPipelineBinaryKHR.html">vkDestroyPipelineBinaryKHR</a>
    public void vkDestroyPipelineBinaryKHR(
            VkDevice device,
            @nullable VkPipelineBinaryKHR pipelineBinary,
            @nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator
    ) {
        try {
            HANDLE$vkDestroyPipelineBinaryKHR.invokeExact(
                    device.segment(),
                    (MemorySegment) (pipelineBinary != null ? pipelineBinary.segment() : MemorySegment.NULL),
                    (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkGetPipelineKeyKHR.html">vkGetPipelineKeyKHR</a>
    public @enumtype(VkResult.class) int vkGetPipelineKeyKHR(
            VkDevice device,
            @nullable @pointer(target=VkPipelineCreateInfoKHR.class) VkPipelineCreateInfoKHR pPipelineCreateInfo,
            @pointer(target=VkPipelineBinaryKeyKHR.class) VkPipelineBinaryKeyKHR pPipelineKey
    ) {
        try {
            return (int) HANDLE$vkGetPipelineKeyKHR.invokeExact(
                    device.segment(),
                    (MemorySegment) (pPipelineCreateInfo != null ? pPipelineCreateInfo.segment() : MemorySegment.NULL),
                    pPipelineKey.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkGetPipelineBinaryDataKHR.html">vkGetPipelineBinaryDataKHR</a>
    public @enumtype(VkResult.class) int vkGetPipelineBinaryDataKHR(
            VkDevice device,
            @pointer(target=VkPipelineBinaryDataInfoKHR.class) VkPipelineBinaryDataInfoKHR pInfo,
            @pointer(target=VkPipelineBinaryKeyKHR.class) VkPipelineBinaryKeyKHR pPipelineBinaryKey,
            PointerBuffer pPipelineBinaryDataSize,
            @pointer(comment="void*") MemorySegment pPipelineBinaryData
    ) {
        try {
            return (int) HANDLE$vkGetPipelineBinaryDataKHR.invokeExact(
                    device.segment(),
                    pInfo.segment(),
                    pPipelineBinaryKey.segment(),
                    pPipelineBinaryDataSize.segment(),
                    pPipelineBinaryData
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkReleaseCapturedPipelineDataKHR.html">vkReleaseCapturedPipelineDataKHR</a>
    public @enumtype(VkResult.class) int vkReleaseCapturedPipelineDataKHR(
            VkDevice device,
            @pointer(target=VkReleaseCapturedPipelineDataInfoKHR.class) VkReleaseCapturedPipelineDataInfoKHR pInfo,
            @nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator
    ) {
        try {
            return (int) HANDLE$vkReleaseCapturedPipelineDataKHR.invokeExact(
                    device.segment(),
                    pInfo.segment(),
                    (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCreateGraphicsPipelines.html">vkCreateGraphicsPipelines</a>
    public @enumtype(VkResult.class) int vkCreateGraphicsPipelines(
            VkDevice device,
            @nullable VkPipelineCache pipelineCache,
            @unsigned int createInfoCount,
            @pointer(target=VkGraphicsPipelineCreateInfo.class) VkGraphicsPipelineCreateInfo pCreateInfos,
            @nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator,
            @pointer(target=VkPipeline.class) VkPipeline.Buffer pPipelines
    ) {
        try {
            return (int) HANDLE$vkCreateGraphicsPipelines.invokeExact(
                    device.segment(),
                    (MemorySegment) (pipelineCache != null ? pipelineCache.segment() : MemorySegment.NULL),
                    createInfoCount,
                    pCreateInfos.segment(),
                    (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL),
                    pPipelines.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCreateComputePipelines.html">vkCreateComputePipelines</a>
    public @enumtype(VkResult.class) int vkCreateComputePipelines(
            VkDevice device,
            @nullable VkPipelineCache pipelineCache,
            @unsigned int createInfoCount,
            @pointer(target=VkComputePipelineCreateInfo.class) VkComputePipelineCreateInfo pCreateInfos,
            @nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator,
            @pointer(target=VkPipeline.class) VkPipeline.Buffer pPipelines
    ) {
        try {
            return (int) HANDLE$vkCreateComputePipelines.invokeExact(
                    device.segment(),
                    (MemorySegment) (pipelineCache != null ? pipelineCache.segment() : MemorySegment.NULL),
                    createInfoCount,
                    pCreateInfos.segment(),
                    (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL),
                    pPipelines.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkGetDeviceSubpassShadingMaxWorkgroupSizeHUAWEI.html">vkGetDeviceSubpassShadingMaxWorkgroupSizeHUAWEI</a>
    public @enumtype(VkResult.class) int vkGetDeviceSubpassShadingMaxWorkgroupSizeHUAWEI(
            VkDevice device,
            VkRenderPass renderpass,
            @pointer(target=VkExtent2D.class) VkExtent2D pMaxWorkgroupSize
    ) {
        try {
            return (int) HANDLE$vkGetDeviceSubpassShadingMaxWorkgroupSizeHUAWEI.invokeExact(
                    device.segment(),
                    renderpass.segment(),
                    pMaxWorkgroupSize.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkDestroyPipeline.html">vkDestroyPipeline</a>
    public void vkDestroyPipeline(
            VkDevice device,
            @nullable VkPipeline pipeline,
            @nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator
    ) {
        try {
            HANDLE$vkDestroyPipeline.invokeExact(
                    device.segment(),
                    (MemorySegment) (pipeline != null ? pipeline.segment() : MemorySegment.NULL),
                    (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCreatePipelineLayout.html">vkCreatePipelineLayout</a>
    public @enumtype(VkResult.class) int vkCreatePipelineLayout(
            VkDevice device,
            @pointer(target=VkPipelineLayoutCreateInfo.class) VkPipelineLayoutCreateInfo pCreateInfo,
            @nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator,
            @pointer(target=VkPipelineLayout.class) VkPipelineLayout.Buffer pPipelineLayout
    ) {
        try {
            return (int) HANDLE$vkCreatePipelineLayout.invokeExact(
                    device.segment(),
                    pCreateInfo.segment(),
                    (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL),
                    pPipelineLayout.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkDestroyPipelineLayout.html">vkDestroyPipelineLayout</a>
    public void vkDestroyPipelineLayout(
            VkDevice device,
            @nullable VkPipelineLayout pipelineLayout,
            @nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator
    ) {
        try {
            HANDLE$vkDestroyPipelineLayout.invokeExact(
                    device.segment(),
                    (MemorySegment) (pipelineLayout != null ? pipelineLayout.segment() : MemorySegment.NULL),
                    (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCreateSampler.html">vkCreateSampler</a>
    public @enumtype(VkResult.class) int vkCreateSampler(
            VkDevice device,
            @pointer(target=VkSamplerCreateInfo.class) VkSamplerCreateInfo pCreateInfo,
            @nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator,
            @pointer(target=VkSampler.class) VkSampler.Buffer pSampler
    ) {
        try {
            return (int) HANDLE$vkCreateSampler.invokeExact(
                    device.segment(),
                    pCreateInfo.segment(),
                    (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL),
                    pSampler.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkDestroySampler.html">vkDestroySampler</a>
    public void vkDestroySampler(
            VkDevice device,
            @nullable VkSampler sampler,
            @nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator
    ) {
        try {
            HANDLE$vkDestroySampler.invokeExact(
                    device.segment(),
                    (MemorySegment) (sampler != null ? sampler.segment() : MemorySegment.NULL),
                    (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCreateDescriptorSetLayout.html">vkCreateDescriptorSetLayout</a>
    public @enumtype(VkResult.class) int vkCreateDescriptorSetLayout(
            VkDevice device,
            @pointer(target=VkDescriptorSetLayoutCreateInfo.class) VkDescriptorSetLayoutCreateInfo pCreateInfo,
            @nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator,
            @pointer(target=VkDescriptorSetLayout.class) VkDescriptorSetLayout.Buffer pSetLayout
    ) {
        try {
            return (int) HANDLE$vkCreateDescriptorSetLayout.invokeExact(
                    device.segment(),
                    pCreateInfo.segment(),
                    (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL),
                    pSetLayout.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkDestroyDescriptorSetLayout.html">vkDestroyDescriptorSetLayout</a>
    public void vkDestroyDescriptorSetLayout(
            VkDevice device,
            @nullable VkDescriptorSetLayout descriptorSetLayout,
            @nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator
    ) {
        try {
            HANDLE$vkDestroyDescriptorSetLayout.invokeExact(
                    device.segment(),
                    (MemorySegment) (descriptorSetLayout != null ? descriptorSetLayout.segment() : MemorySegment.NULL),
                    (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCreateDescriptorPool.html">vkCreateDescriptorPool</a>
    public @enumtype(VkResult.class) int vkCreateDescriptorPool(
            VkDevice device,
            @pointer(target=VkDescriptorPoolCreateInfo.class) VkDescriptorPoolCreateInfo pCreateInfo,
            @nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator,
            @pointer(target=VkDescriptorPool.class) VkDescriptorPool.Buffer pDescriptorPool
    ) {
        try {
            return (int) HANDLE$vkCreateDescriptorPool.invokeExact(
                    device.segment(),
                    pCreateInfo.segment(),
                    (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL),
                    pDescriptorPool.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkDestroyDescriptorPool.html">vkDestroyDescriptorPool</a>
    public void vkDestroyDescriptorPool(
            VkDevice device,
            @nullable VkDescriptorPool descriptorPool,
            @nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator
    ) {
        try {
            HANDLE$vkDestroyDescriptorPool.invokeExact(
                    device.segment(),
                    (MemorySegment) (descriptorPool != null ? descriptorPool.segment() : MemorySegment.NULL),
                    (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkResetDescriptorPool.html">vkResetDescriptorPool</a>
    public @enumtype(VkResult.class) int vkResetDescriptorPool(
            VkDevice device,
            VkDescriptorPool descriptorPool,
            @enumtype(VkDescriptorPoolResetFlags.class) int flags
    ) {
        try {
            return (int) HANDLE$vkResetDescriptorPool.invokeExact(
                    device.segment(),
                    descriptorPool.segment(),
                    flags
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkAllocateDescriptorSets.html">vkAllocateDescriptorSets</a>
    public @enumtype(VkResult.class) int vkAllocateDescriptorSets(
            VkDevice device,
            @pointer(target=VkDescriptorSetAllocateInfo.class) VkDescriptorSetAllocateInfo pAllocateInfo,
            @pointer(target=VkDescriptorSet.class) VkDescriptorSet.Buffer pDescriptorSets
    ) {
        try {
            return (int) HANDLE$vkAllocateDescriptorSets.invokeExact(
                    device.segment(),
                    pAllocateInfo.segment(),
                    pDescriptorSets.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkFreeDescriptorSets.html">vkFreeDescriptorSets</a>
    public @enumtype(VkResult.class) int vkFreeDescriptorSets(
            VkDevice device,
            VkDescriptorPool descriptorPool,
            @unsigned int descriptorSetCount,
            @pointer(target=VkDescriptorSet.class) VkDescriptorSet.Buffer pDescriptorSets
    ) {
        try {
            return (int) HANDLE$vkFreeDescriptorSets.invokeExact(
                    device.segment(),
                    descriptorPool.segment(),
                    descriptorSetCount,
                    pDescriptorSets.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkUpdateDescriptorSets.html">vkUpdateDescriptorSets</a>
    public void vkUpdateDescriptorSets(
            VkDevice device,
            @unsigned int descriptorWriteCount,
            @nullable @pointer(target=VkWriteDescriptorSet.class) VkWriteDescriptorSet pDescriptorWrites,
            @unsigned int descriptorCopyCount,
            @nullable @pointer(target=VkCopyDescriptorSet.class) VkCopyDescriptorSet pDescriptorCopies
    ) {
        try {
            HANDLE$vkUpdateDescriptorSets.invokeExact(
                    device.segment(),
                    descriptorWriteCount,
                    (MemorySegment) (pDescriptorWrites != null ? pDescriptorWrites.segment() : MemorySegment.NULL),
                    descriptorCopyCount,
                    (MemorySegment) (pDescriptorCopies != null ? pDescriptorCopies.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCreateFramebuffer.html">vkCreateFramebuffer</a>
    public @enumtype(VkResult.class) int vkCreateFramebuffer(
            VkDevice device,
            @pointer(target=VkFramebufferCreateInfo.class) VkFramebufferCreateInfo pCreateInfo,
            @nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator,
            @pointer(target=VkFramebuffer.class) VkFramebuffer.Buffer pFramebuffer
    ) {
        try {
            return (int) HANDLE$vkCreateFramebuffer.invokeExact(
                    device.segment(),
                    pCreateInfo.segment(),
                    (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL),
                    pFramebuffer.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkDestroyFramebuffer.html">vkDestroyFramebuffer</a>
    public void vkDestroyFramebuffer(
            VkDevice device,
            @nullable VkFramebuffer framebuffer,
            @nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator
    ) {
        try {
            HANDLE$vkDestroyFramebuffer.invokeExact(
                    device.segment(),
                    (MemorySegment) (framebuffer != null ? framebuffer.segment() : MemorySegment.NULL),
                    (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCreateRenderPass.html">vkCreateRenderPass</a>
    public @enumtype(VkResult.class) int vkCreateRenderPass(
            VkDevice device,
            @pointer(target=VkRenderPassCreateInfo.class) VkRenderPassCreateInfo pCreateInfo,
            @nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator,
            @pointer(target=VkRenderPass.class) VkRenderPass.Buffer pRenderPass
    ) {
        try {
            return (int) HANDLE$vkCreateRenderPass.invokeExact(
                    device.segment(),
                    pCreateInfo.segment(),
                    (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL),
                    pRenderPass.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkDestroyRenderPass.html">vkDestroyRenderPass</a>
    public void vkDestroyRenderPass(
            VkDevice device,
            @nullable VkRenderPass renderPass,
            @nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator
    ) {
        try {
            HANDLE$vkDestroyRenderPass.invokeExact(
                    device.segment(),
                    (MemorySegment) (renderPass != null ? renderPass.segment() : MemorySegment.NULL),
                    (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkGetRenderAreaGranularity.html">vkGetRenderAreaGranularity</a>
    public void vkGetRenderAreaGranularity(
            VkDevice device,
            VkRenderPass renderPass,
            @pointer(target=VkExtent2D.class) VkExtent2D pGranularity
    ) {
        try {
            HANDLE$vkGetRenderAreaGranularity.invokeExact(
                    device.segment(),
                    renderPass.segment(),
                    pGranularity.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkGetRenderingAreaGranularityKHR.html">vkGetRenderingAreaGranularityKHR</a>
    public void vkGetRenderingAreaGranularityKHR(
            VkDevice device,
            @pointer(target=VkRenderingAreaInfoKHR.class) VkRenderingAreaInfoKHR pRenderingAreaInfo,
            @pointer(target=VkExtent2D.class) VkExtent2D pGranularity
    ) {
        try {
            HANDLE$vkGetRenderingAreaGranularityKHR.invokeExact(
                    device.segment(),
                    pRenderingAreaInfo.segment(),
                    pGranularity.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCreateCommandPool.html">vkCreateCommandPool</a>
    public @enumtype(VkResult.class) int vkCreateCommandPool(
            VkDevice device,
            @pointer(target=VkCommandPoolCreateInfo.class) VkCommandPoolCreateInfo pCreateInfo,
            @nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator,
            @pointer(target=VkCommandPool.class) VkCommandPool.Buffer pCommandPool
    ) {
        try {
            return (int) HANDLE$vkCreateCommandPool.invokeExact(
                    device.segment(),
                    pCreateInfo.segment(),
                    (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL),
                    pCommandPool.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkDestroyCommandPool.html">vkDestroyCommandPool</a>
    public void vkDestroyCommandPool(
            VkDevice device,
            @nullable VkCommandPool commandPool,
            @nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator
    ) {
        try {
            HANDLE$vkDestroyCommandPool.invokeExact(
                    device.segment(),
                    (MemorySegment) (commandPool != null ? commandPool.segment() : MemorySegment.NULL),
                    (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkResetCommandPool.html">vkResetCommandPool</a>
    public @enumtype(VkResult.class) int vkResetCommandPool(
            VkDevice device,
            VkCommandPool commandPool,
            @enumtype(VkCommandPoolResetFlags.class) int flags
    ) {
        try {
            return (int) HANDLE$vkResetCommandPool.invokeExact(
                    device.segment(),
                    commandPool.segment(),
                    flags
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkAllocateCommandBuffers.html">vkAllocateCommandBuffers</a>
    public @enumtype(VkResult.class) int vkAllocateCommandBuffers(
            VkDevice device,
            @pointer(target=VkCommandBufferAllocateInfo.class) VkCommandBufferAllocateInfo pAllocateInfo,
            @pointer(target=VkCommandBuffer.class) VkCommandBuffer.Buffer pCommandBuffers
    ) {
        try {
            return (int) HANDLE$vkAllocateCommandBuffers.invokeExact(
                    device.segment(),
                    pAllocateInfo.segment(),
                    pCommandBuffers.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkFreeCommandBuffers.html">vkFreeCommandBuffers</a>
    public void vkFreeCommandBuffers(
            VkDevice device,
            VkCommandPool commandPool,
            @unsigned int commandBufferCount,
            @pointer(target=VkCommandBuffer.class) VkCommandBuffer.Buffer pCommandBuffers
    ) {
        try {
            HANDLE$vkFreeCommandBuffers.invokeExact(
                    device.segment(),
                    commandPool.segment(),
                    commandBufferCount,
                    pCommandBuffers.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkBeginCommandBuffer.html">vkBeginCommandBuffer</a>
    public @enumtype(VkResult.class) int vkBeginCommandBuffer(
            VkCommandBuffer commandBuffer,
            @pointer(target=VkCommandBufferBeginInfo.class) VkCommandBufferBeginInfo pBeginInfo
    ) {
        try {
            return (int) HANDLE$vkBeginCommandBuffer.invokeExact(
                    commandBuffer.segment(),
                    pBeginInfo.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkEndCommandBuffer.html">vkEndCommandBuffer</a>
    public @enumtype(VkResult.class) int vkEndCommandBuffer(
            VkCommandBuffer commandBuffer
    ) {
        try {
            return (int) HANDLE$vkEndCommandBuffer.invokeExact(
                    commandBuffer.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkResetCommandBuffer.html">vkResetCommandBuffer</a>
    public @enumtype(VkResult.class) int vkResetCommandBuffer(
            VkCommandBuffer commandBuffer,
            @enumtype(VkCommandBufferResetFlags.class) int flags
    ) {
        try {
            return (int) HANDLE$vkResetCommandBuffer.invokeExact(
                    commandBuffer.segment(),
                    flags
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdBindPipeline.html">vkCmdBindPipeline</a>
    public void vkCmdBindPipeline(
            VkCommandBuffer commandBuffer,
            @enumtype(VkPipelineBindPoint.class) int pipelineBindPoint,
            VkPipeline pipeline
    ) {
        try {
            HANDLE$vkCmdBindPipeline.invokeExact(
                    commandBuffer.segment(),
                    pipelineBindPoint,
                    pipeline.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdSetAttachmentFeedbackLoopEnableEXT.html">vkCmdSetAttachmentFeedbackLoopEnableEXT</a>
    public void vkCmdSetAttachmentFeedbackLoopEnableEXT(
            VkCommandBuffer commandBuffer,
            @enumtype(VkImageAspectFlags.class) int aspectMask
    ) {
        try {
            HANDLE$vkCmdSetAttachmentFeedbackLoopEnableEXT.invokeExact(
                    commandBuffer.segment(),
                    aspectMask
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdSetViewport.html">vkCmdSetViewport</a>
    public void vkCmdSetViewport(
            VkCommandBuffer commandBuffer,
            @unsigned int firstViewport,
            @unsigned int viewportCount,
            @pointer(target=VkViewport.class) VkViewport pViewports
    ) {
        try {
            HANDLE$vkCmdSetViewport.invokeExact(
                    commandBuffer.segment(),
                    firstViewport,
                    viewportCount,
                    pViewports.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdSetScissor.html">vkCmdSetScissor</a>
    public void vkCmdSetScissor(
            VkCommandBuffer commandBuffer,
            @unsigned int firstScissor,
            @unsigned int scissorCount,
            @pointer(target=VkRect2D.class) VkRect2D pScissors
    ) {
        try {
            HANDLE$vkCmdSetScissor.invokeExact(
                    commandBuffer.segment(),
                    firstScissor,
                    scissorCount,
                    pScissors.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdSetLineWidth.html">vkCmdSetLineWidth</a>
    public void vkCmdSetLineWidth(
            VkCommandBuffer commandBuffer,
            float lineWidth
    ) {
        try {
            HANDLE$vkCmdSetLineWidth.invokeExact(
                    commandBuffer.segment(),
                    lineWidth
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdSetDepthBias.html">vkCmdSetDepthBias</a>
    public void vkCmdSetDepthBias(
            VkCommandBuffer commandBuffer,
            float depthBiasConstantFactor,
            float depthBiasClamp,
            float depthBiasSlopeFactor
    ) {
        try {
            HANDLE$vkCmdSetDepthBias.invokeExact(
                    commandBuffer.segment(),
                    depthBiasConstantFactor,
                    depthBiasClamp,
                    depthBiasSlopeFactor
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdSetBlendConstants.html">vkCmdSetBlendConstants</a>
    public void vkCmdSetBlendConstants(
            VkCommandBuffer commandBuffer,
            FloatBuffer blendConstants
    ) {
        try {
            HANDLE$vkCmdSetBlendConstants.invokeExact(
                    commandBuffer.segment(),
                    blendConstants.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdSetDepthBounds.html">vkCmdSetDepthBounds</a>
    public void vkCmdSetDepthBounds(
            VkCommandBuffer commandBuffer,
            float minDepthBounds,
            float maxDepthBounds
    ) {
        try {
            HANDLE$vkCmdSetDepthBounds.invokeExact(
                    commandBuffer.segment(),
                    minDepthBounds,
                    maxDepthBounds
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdSetStencilCompareMask.html">vkCmdSetStencilCompareMask</a>
    public void vkCmdSetStencilCompareMask(
            VkCommandBuffer commandBuffer,
            @enumtype(VkStencilFaceFlags.class) int faceMask,
            @unsigned int compareMask
    ) {
        try {
            HANDLE$vkCmdSetStencilCompareMask.invokeExact(
                    commandBuffer.segment(),
                    faceMask,
                    compareMask
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdSetStencilWriteMask.html">vkCmdSetStencilWriteMask</a>
    public void vkCmdSetStencilWriteMask(
            VkCommandBuffer commandBuffer,
            @enumtype(VkStencilFaceFlags.class) int faceMask,
            @unsigned int writeMask
    ) {
        try {
            HANDLE$vkCmdSetStencilWriteMask.invokeExact(
                    commandBuffer.segment(),
                    faceMask,
                    writeMask
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdSetStencilReference.html">vkCmdSetStencilReference</a>
    public void vkCmdSetStencilReference(
            VkCommandBuffer commandBuffer,
            @enumtype(VkStencilFaceFlags.class) int faceMask,
            @unsigned int reference
    ) {
        try {
            HANDLE$vkCmdSetStencilReference.invokeExact(
                    commandBuffer.segment(),
                    faceMask,
                    reference
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdBindDescriptorSets.html">vkCmdBindDescriptorSets</a>
    public void vkCmdBindDescriptorSets(
            VkCommandBuffer commandBuffer,
            @enumtype(VkPipelineBindPoint.class) int pipelineBindPoint,
            VkPipelineLayout layout,
            @unsigned int firstSet,
            @unsigned int descriptorSetCount,
            @pointer(target=VkDescriptorSet.class) VkDescriptorSet.Buffer pDescriptorSets,
            @unsigned int dynamicOffsetCount,
            @nullable @unsigned IntBuffer pDynamicOffsets
    ) {
        try {
            HANDLE$vkCmdBindDescriptorSets.invokeExact(
                    commandBuffer.segment(),
                    pipelineBindPoint,
                    layout.segment(),
                    firstSet,
                    descriptorSetCount,
                    pDescriptorSets.segment(),
                    dynamicOffsetCount,
                    (MemorySegment) (pDynamicOffsets != null ? pDynamicOffsets.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdBindIndexBuffer.html">vkCmdBindIndexBuffer</a>
    public void vkCmdBindIndexBuffer(
            VkCommandBuffer commandBuffer,
            @nullable VkBuffer buffer,
            @unsigned long offset,
            @enumtype(VkIndexType.class) int indexType
    ) {
        try {
            HANDLE$vkCmdBindIndexBuffer.invokeExact(
                    commandBuffer.segment(),
                    (MemorySegment) (buffer != null ? buffer.segment() : MemorySegment.NULL),
                    offset,
                    indexType
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdBindVertexBuffers.html">vkCmdBindVertexBuffers</a>
    public void vkCmdBindVertexBuffers(
            VkCommandBuffer commandBuffer,
            @unsigned int firstBinding,
            @unsigned int bindingCount,
            @pointer(target=VkBuffer.class) VkBuffer.Buffer pBuffers,
            @unsigned LongBuffer pOffsets
    ) {
        try {
            HANDLE$vkCmdBindVertexBuffers.invokeExact(
                    commandBuffer.segment(),
                    firstBinding,
                    bindingCount,
                    pBuffers.segment(),
                    pOffsets.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdDraw.html">vkCmdDraw</a>
    public void vkCmdDraw(
            VkCommandBuffer commandBuffer,
            @unsigned int vertexCount,
            @unsigned int instanceCount,
            @unsigned int firstVertex,
            @unsigned int firstInstance
    ) {
        try {
            HANDLE$vkCmdDraw.invokeExact(
                    commandBuffer.segment(),
                    vertexCount,
                    instanceCount,
                    firstVertex,
                    firstInstance
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdDrawIndexed.html">vkCmdDrawIndexed</a>
    public void vkCmdDrawIndexed(
            VkCommandBuffer commandBuffer,
            @unsigned int indexCount,
            @unsigned int instanceCount,
            @unsigned int firstIndex,
            int vertexOffset,
            @unsigned int firstInstance
    ) {
        try {
            HANDLE$vkCmdDrawIndexed.invokeExact(
                    commandBuffer.segment(),
                    indexCount,
                    instanceCount,
                    firstIndex,
                    vertexOffset,
                    firstInstance
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdDrawMultiEXT.html">vkCmdDrawMultiEXT</a>
    public void vkCmdDrawMultiEXT(
            VkCommandBuffer commandBuffer,
            @unsigned int drawCount,
            @nullable @pointer(target=VkMultiDrawInfoEXT.class) VkMultiDrawInfoEXT pVertexInfo,
            @unsigned int instanceCount,
            @unsigned int firstInstance,
            @unsigned int stride
    ) {
        try {
            HANDLE$vkCmdDrawMultiEXT.invokeExact(
                    commandBuffer.segment(),
                    drawCount,
                    (MemorySegment) (pVertexInfo != null ? pVertexInfo.segment() : MemorySegment.NULL),
                    instanceCount,
                    firstInstance,
                    stride
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdDrawMultiIndexedEXT.html">vkCmdDrawMultiIndexedEXT</a>
    public void vkCmdDrawMultiIndexedEXT(
            VkCommandBuffer commandBuffer,
            @unsigned int drawCount,
            @nullable @pointer(target=VkMultiDrawIndexedInfoEXT.class) VkMultiDrawIndexedInfoEXT pIndexInfo,
            @unsigned int instanceCount,
            @unsigned int firstInstance,
            @unsigned int stride,
            @nullable IntBuffer pVertexOffset
    ) {
        try {
            HANDLE$vkCmdDrawMultiIndexedEXT.invokeExact(
                    commandBuffer.segment(),
                    drawCount,
                    (MemorySegment) (pIndexInfo != null ? pIndexInfo.segment() : MemorySegment.NULL),
                    instanceCount,
                    firstInstance,
                    stride,
                    (MemorySegment) (pVertexOffset != null ? pVertexOffset.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdDrawIndirect.html">vkCmdDrawIndirect</a>
    public void vkCmdDrawIndirect(
            VkCommandBuffer commandBuffer,
            VkBuffer buffer,
            @unsigned long offset,
            @unsigned int drawCount,
            @unsigned int stride
    ) {
        try {
            HANDLE$vkCmdDrawIndirect.invokeExact(
                    commandBuffer.segment(),
                    buffer.segment(),
                    offset,
                    drawCount,
                    stride
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdDrawIndexedIndirect.html">vkCmdDrawIndexedIndirect</a>
    public void vkCmdDrawIndexedIndirect(
            VkCommandBuffer commandBuffer,
            VkBuffer buffer,
            @unsigned long offset,
            @unsigned int drawCount,
            @unsigned int stride
    ) {
        try {
            HANDLE$vkCmdDrawIndexedIndirect.invokeExact(
                    commandBuffer.segment(),
                    buffer.segment(),
                    offset,
                    drawCount,
                    stride
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdDispatch.html">vkCmdDispatch</a>
    public void vkCmdDispatch(
            VkCommandBuffer commandBuffer,
            @unsigned int groupCountX,
            @unsigned int groupCountY,
            @unsigned int groupCountZ
    ) {
        try {
            HANDLE$vkCmdDispatch.invokeExact(
                    commandBuffer.segment(),
                    groupCountX,
                    groupCountY,
                    groupCountZ
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdDispatchIndirect.html">vkCmdDispatchIndirect</a>
    public void vkCmdDispatchIndirect(
            VkCommandBuffer commandBuffer,
            VkBuffer buffer,
            @unsigned long offset
    ) {
        try {
            HANDLE$vkCmdDispatchIndirect.invokeExact(
                    commandBuffer.segment(),
                    buffer.segment(),
                    offset
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdSubpassShadingHUAWEI.html">vkCmdSubpassShadingHUAWEI</a>
    public void vkCmdSubpassShadingHUAWEI(
            VkCommandBuffer commandBuffer
    ) {
        try {
            HANDLE$vkCmdSubpassShadingHUAWEI.invokeExact(
                    commandBuffer.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdDrawClusterHUAWEI.html">vkCmdDrawClusterHUAWEI</a>
    public void vkCmdDrawClusterHUAWEI(
            VkCommandBuffer commandBuffer,
            @unsigned int groupCountX,
            @unsigned int groupCountY,
            @unsigned int groupCountZ
    ) {
        try {
            HANDLE$vkCmdDrawClusterHUAWEI.invokeExact(
                    commandBuffer.segment(),
                    groupCountX,
                    groupCountY,
                    groupCountZ
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdDrawClusterIndirectHUAWEI.html">vkCmdDrawClusterIndirectHUAWEI</a>
    public void vkCmdDrawClusterIndirectHUAWEI(
            VkCommandBuffer commandBuffer,
            VkBuffer buffer,
            @unsigned long offset
    ) {
        try {
            HANDLE$vkCmdDrawClusterIndirectHUAWEI.invokeExact(
                    commandBuffer.segment(),
                    buffer.segment(),
                    offset
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdUpdatePipelineIndirectBufferNV.html">vkCmdUpdatePipelineIndirectBufferNV</a>
    public void vkCmdUpdatePipelineIndirectBufferNV(
            VkCommandBuffer commandBuffer,
            @enumtype(VkPipelineBindPoint.class) int pipelineBindPoint,
            VkPipeline pipeline
    ) {
        try {
            HANDLE$vkCmdUpdatePipelineIndirectBufferNV.invokeExact(
                    commandBuffer.segment(),
                    pipelineBindPoint,
                    pipeline.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdCopyBuffer.html">vkCmdCopyBuffer</a>
    public void vkCmdCopyBuffer(
            VkCommandBuffer commandBuffer,
            VkBuffer srcBuffer,
            VkBuffer dstBuffer,
            @unsigned int regionCount,
            @pointer(target=VkBufferCopy.class) VkBufferCopy pRegions
    ) {
        try {
            HANDLE$vkCmdCopyBuffer.invokeExact(
                    commandBuffer.segment(),
                    srcBuffer.segment(),
                    dstBuffer.segment(),
                    regionCount,
                    pRegions.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdCopyImage.html">vkCmdCopyImage</a>
    public void vkCmdCopyImage(
            VkCommandBuffer commandBuffer,
            VkImage srcImage,
            @enumtype(VkImageLayout.class) int srcImageLayout,
            VkImage dstImage,
            @enumtype(VkImageLayout.class) int dstImageLayout,
            @unsigned int regionCount,
            @pointer(target=VkImageCopy.class) VkImageCopy pRegions
    ) {
        try {
            HANDLE$vkCmdCopyImage.invokeExact(
                    commandBuffer.segment(),
                    srcImage.segment(),
                    srcImageLayout,
                    dstImage.segment(),
                    dstImageLayout,
                    regionCount,
                    pRegions.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdBlitImage.html">vkCmdBlitImage</a>
    public void vkCmdBlitImage(
            VkCommandBuffer commandBuffer,
            VkImage srcImage,
            @enumtype(VkImageLayout.class) int srcImageLayout,
            VkImage dstImage,
            @enumtype(VkImageLayout.class) int dstImageLayout,
            @unsigned int regionCount,
            @pointer(target=VkImageBlit.class) VkImageBlit pRegions,
            @enumtype(VkFilter.class) int filter
    ) {
        try {
            HANDLE$vkCmdBlitImage.invokeExact(
                    commandBuffer.segment(),
                    srcImage.segment(),
                    srcImageLayout,
                    dstImage.segment(),
                    dstImageLayout,
                    regionCount,
                    pRegions.segment(),
                    filter
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdCopyBufferToImage.html">vkCmdCopyBufferToImage</a>
    public void vkCmdCopyBufferToImage(
            VkCommandBuffer commandBuffer,
            VkBuffer srcBuffer,
            VkImage dstImage,
            @enumtype(VkImageLayout.class) int dstImageLayout,
            @unsigned int regionCount,
            @pointer(target=VkBufferImageCopy.class) VkBufferImageCopy pRegions
    ) {
        try {
            HANDLE$vkCmdCopyBufferToImage.invokeExact(
                    commandBuffer.segment(),
                    srcBuffer.segment(),
                    dstImage.segment(),
                    dstImageLayout,
                    regionCount,
                    pRegions.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdCopyImageToBuffer.html">vkCmdCopyImageToBuffer</a>
    public void vkCmdCopyImageToBuffer(
            VkCommandBuffer commandBuffer,
            VkImage srcImage,
            @enumtype(VkImageLayout.class) int srcImageLayout,
            VkBuffer dstBuffer,
            @unsigned int regionCount,
            @pointer(target=VkBufferImageCopy.class) VkBufferImageCopy pRegions
    ) {
        try {
            HANDLE$vkCmdCopyImageToBuffer.invokeExact(
                    commandBuffer.segment(),
                    srcImage.segment(),
                    srcImageLayout,
                    dstBuffer.segment(),
                    regionCount,
                    pRegions.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdCopyMemoryIndirectNV.html">vkCmdCopyMemoryIndirectNV</a>
    public void vkCmdCopyMemoryIndirectNV(
            VkCommandBuffer commandBuffer,
            @unsigned long copyBufferAddress,
            @unsigned int copyCount,
            @unsigned int stride
    ) {
        try {
            HANDLE$vkCmdCopyMemoryIndirectNV.invokeExact(
                    commandBuffer.segment(),
                    copyBufferAddress,
                    copyCount,
                    stride
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdCopyMemoryToImageIndirectNV.html">vkCmdCopyMemoryToImageIndirectNV</a>
    public void vkCmdCopyMemoryToImageIndirectNV(
            VkCommandBuffer commandBuffer,
            @unsigned long copyBufferAddress,
            @unsigned int copyCount,
            @unsigned int stride,
            VkImage dstImage,
            @enumtype(VkImageLayout.class) int dstImageLayout,
            @pointer(target=VkImageSubresourceLayers.class) VkImageSubresourceLayers pImageSubresources
    ) {
        try {
            HANDLE$vkCmdCopyMemoryToImageIndirectNV.invokeExact(
                    commandBuffer.segment(),
                    copyBufferAddress,
                    copyCount,
                    stride,
                    dstImage.segment(),
                    dstImageLayout,
                    pImageSubresources.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdUpdateBuffer.html">vkCmdUpdateBuffer</a>
    public void vkCmdUpdateBuffer(
            VkCommandBuffer commandBuffer,
            VkBuffer dstBuffer,
            @unsigned long dstOffset,
            @unsigned long dataSize,
            @pointer(comment="void*") MemorySegment pData
    ) {
        try {
            HANDLE$vkCmdUpdateBuffer.invokeExact(
                    commandBuffer.segment(),
                    dstBuffer.segment(),
                    dstOffset,
                    dataSize,
                    pData
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdFillBuffer.html">vkCmdFillBuffer</a>
    public void vkCmdFillBuffer(
            VkCommandBuffer commandBuffer,
            VkBuffer dstBuffer,
            @unsigned long dstOffset,
            @unsigned long size,
            @unsigned int data
    ) {
        try {
            HANDLE$vkCmdFillBuffer.invokeExact(
                    commandBuffer.segment(),
                    dstBuffer.segment(),
                    dstOffset,
                    size,
                    data
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdClearColorImage.html">vkCmdClearColorImage</a>
    public void vkCmdClearColorImage(
            VkCommandBuffer commandBuffer,
            VkImage image,
            @enumtype(VkImageLayout.class) int imageLayout,
            @pointer(target=VkClearColorValue.class) VkClearColorValue pColor,
            @unsigned int rangeCount,
            @pointer(target=VkImageSubresourceRange.class) VkImageSubresourceRange pRanges
    ) {
        try {
            HANDLE$vkCmdClearColorImage.invokeExact(
                    commandBuffer.segment(),
                    image.segment(),
                    imageLayout,
                    pColor.segment(),
                    rangeCount,
                    pRanges.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdClearDepthStencilImage.html">vkCmdClearDepthStencilImage</a>
    public void vkCmdClearDepthStencilImage(
            VkCommandBuffer commandBuffer,
            VkImage image,
            @enumtype(VkImageLayout.class) int imageLayout,
            @pointer(target=VkClearDepthStencilValue.class) VkClearDepthStencilValue pDepthStencil,
            @unsigned int rangeCount,
            @pointer(target=VkImageSubresourceRange.class) VkImageSubresourceRange pRanges
    ) {
        try {
            HANDLE$vkCmdClearDepthStencilImage.invokeExact(
                    commandBuffer.segment(),
                    image.segment(),
                    imageLayout,
                    pDepthStencil.segment(),
                    rangeCount,
                    pRanges.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdClearAttachments.html">vkCmdClearAttachments</a>
    public void vkCmdClearAttachments(
            VkCommandBuffer commandBuffer,
            @unsigned int attachmentCount,
            @pointer(target=VkClearAttachment.class) VkClearAttachment pAttachments,
            @unsigned int rectCount,
            @pointer(target=VkClearRect.class) VkClearRect pRects
    ) {
        try {
            HANDLE$vkCmdClearAttachments.invokeExact(
                    commandBuffer.segment(),
                    attachmentCount,
                    pAttachments.segment(),
                    rectCount,
                    pRects.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdResolveImage.html">vkCmdResolveImage</a>
    public void vkCmdResolveImage(
            VkCommandBuffer commandBuffer,
            VkImage srcImage,
            @enumtype(VkImageLayout.class) int srcImageLayout,
            VkImage dstImage,
            @enumtype(VkImageLayout.class) int dstImageLayout,
            @unsigned int regionCount,
            @pointer(target=VkImageResolve.class) VkImageResolve pRegions
    ) {
        try {
            HANDLE$vkCmdResolveImage.invokeExact(
                    commandBuffer.segment(),
                    srcImage.segment(),
                    srcImageLayout,
                    dstImage.segment(),
                    dstImageLayout,
                    regionCount,
                    pRegions.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdSetEvent.html">vkCmdSetEvent</a>
    public void vkCmdSetEvent(
            VkCommandBuffer commandBuffer,
            VkEvent event,
            @enumtype(VkPipelineStageFlags.class) int stageMask
    ) {
        try {
            HANDLE$vkCmdSetEvent.invokeExact(
                    commandBuffer.segment(),
                    event.segment(),
                    stageMask
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdResetEvent.html">vkCmdResetEvent</a>
    public void vkCmdResetEvent(
            VkCommandBuffer commandBuffer,
            VkEvent event,
            @enumtype(VkPipelineStageFlags.class) int stageMask
    ) {
        try {
            HANDLE$vkCmdResetEvent.invokeExact(
                    commandBuffer.segment(),
                    event.segment(),
                    stageMask
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdWaitEvents.html">vkCmdWaitEvents</a>
    public void vkCmdWaitEvents(
            VkCommandBuffer commandBuffer,
            @unsigned int eventCount,
            @pointer(target=VkEvent.class) VkEvent.Buffer pEvents,
            @enumtype(VkPipelineStageFlags.class) int srcStageMask,
            @enumtype(VkPipelineStageFlags.class) int dstStageMask,
            @unsigned int memoryBarrierCount,
            @nullable @pointer(target=VkMemoryBarrier.class) VkMemoryBarrier pMemoryBarriers,
            @unsigned int bufferMemoryBarrierCount,
            @nullable @pointer(target=VkBufferMemoryBarrier.class) VkBufferMemoryBarrier pBufferMemoryBarriers,
            @unsigned int imageMemoryBarrierCount,
            @nullable @pointer(target=VkImageMemoryBarrier.class) VkImageMemoryBarrier pImageMemoryBarriers
    ) {
        try {
            HANDLE$vkCmdWaitEvents.invokeExact(
                    commandBuffer.segment(),
                    eventCount,
                    pEvents.segment(),
                    srcStageMask,
                    dstStageMask,
                    memoryBarrierCount,
                    (MemorySegment) (pMemoryBarriers != null ? pMemoryBarriers.segment() : MemorySegment.NULL),
                    bufferMemoryBarrierCount,
                    (MemorySegment) (pBufferMemoryBarriers != null ? pBufferMemoryBarriers.segment() : MemorySegment.NULL),
                    imageMemoryBarrierCount,
                    (MemorySegment) (pImageMemoryBarriers != null ? pImageMemoryBarriers.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdPipelineBarrier.html">vkCmdPipelineBarrier</a>
    public void vkCmdPipelineBarrier(
            VkCommandBuffer commandBuffer,
            @enumtype(VkPipelineStageFlags.class) int srcStageMask,
            @enumtype(VkPipelineStageFlags.class) int dstStageMask,
            @enumtype(VkDependencyFlags.class) int dependencyFlags,
            @unsigned int memoryBarrierCount,
            @nullable @pointer(target=VkMemoryBarrier.class) VkMemoryBarrier pMemoryBarriers,
            @unsigned int bufferMemoryBarrierCount,
            @nullable @pointer(target=VkBufferMemoryBarrier.class) VkBufferMemoryBarrier pBufferMemoryBarriers,
            @unsigned int imageMemoryBarrierCount,
            @nullable @pointer(target=VkImageMemoryBarrier.class) VkImageMemoryBarrier pImageMemoryBarriers
    ) {
        try {
            HANDLE$vkCmdPipelineBarrier.invokeExact(
                    commandBuffer.segment(),
                    srcStageMask,
                    dstStageMask,
                    dependencyFlags,
                    memoryBarrierCount,
                    (MemorySegment) (pMemoryBarriers != null ? pMemoryBarriers.segment() : MemorySegment.NULL),
                    bufferMemoryBarrierCount,
                    (MemorySegment) (pBufferMemoryBarriers != null ? pBufferMemoryBarriers.segment() : MemorySegment.NULL),
                    imageMemoryBarrierCount,
                    (MemorySegment) (pImageMemoryBarriers != null ? pImageMemoryBarriers.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdBeginQuery.html">vkCmdBeginQuery</a>
    public void vkCmdBeginQuery(
            VkCommandBuffer commandBuffer,
            VkQueryPool queryPool,
            @unsigned int query,
            @enumtype(VkQueryControlFlags.class) int flags
    ) {
        try {
            HANDLE$vkCmdBeginQuery.invokeExact(
                    commandBuffer.segment(),
                    queryPool.segment(),
                    query,
                    flags
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdEndQuery.html">vkCmdEndQuery</a>
    public void vkCmdEndQuery(
            VkCommandBuffer commandBuffer,
            VkQueryPool queryPool,
            @unsigned int query
    ) {
        try {
            HANDLE$vkCmdEndQuery.invokeExact(
                    commandBuffer.segment(),
                    queryPool.segment(),
                    query
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdBeginConditionalRenderingEXT.html">vkCmdBeginConditionalRenderingEXT</a>
    public void vkCmdBeginConditionalRenderingEXT(
            VkCommandBuffer commandBuffer,
            @pointer(target=VkConditionalRenderingBeginInfoEXT.class) VkConditionalRenderingBeginInfoEXT pConditionalRenderingBegin
    ) {
        try {
            HANDLE$vkCmdBeginConditionalRenderingEXT.invokeExact(
                    commandBuffer.segment(),
                    pConditionalRenderingBegin.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdEndConditionalRenderingEXT.html">vkCmdEndConditionalRenderingEXT</a>
    public void vkCmdEndConditionalRenderingEXT(
            VkCommandBuffer commandBuffer
    ) {
        try {
            HANDLE$vkCmdEndConditionalRenderingEXT.invokeExact(
                    commandBuffer.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdResetQueryPool.html">vkCmdResetQueryPool</a>
    public void vkCmdResetQueryPool(
            VkCommandBuffer commandBuffer,
            VkQueryPool queryPool,
            @unsigned int firstQuery,
            @unsigned int queryCount
    ) {
        try {
            HANDLE$vkCmdResetQueryPool.invokeExact(
                    commandBuffer.segment(),
                    queryPool.segment(),
                    firstQuery,
                    queryCount
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdWriteTimestamp.html">vkCmdWriteTimestamp</a>
    public void vkCmdWriteTimestamp(
            VkCommandBuffer commandBuffer,
            @enumtype(VkPipelineStageFlags.class) int pipelineStage,
            VkQueryPool queryPool,
            @unsigned int query
    ) {
        try {
            HANDLE$vkCmdWriteTimestamp.invokeExact(
                    commandBuffer.segment(),
                    pipelineStage,
                    queryPool.segment(),
                    query
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdCopyQueryPoolResults.html">vkCmdCopyQueryPoolResults</a>
    public void vkCmdCopyQueryPoolResults(
            VkCommandBuffer commandBuffer,
            VkQueryPool queryPool,
            @unsigned int firstQuery,
            @unsigned int queryCount,
            VkBuffer dstBuffer,
            @unsigned long dstOffset,
            @unsigned long stride,
            @enumtype(VkQueryResultFlags.class) int flags
    ) {
        try {
            HANDLE$vkCmdCopyQueryPoolResults.invokeExact(
                    commandBuffer.segment(),
                    queryPool.segment(),
                    firstQuery,
                    queryCount,
                    dstBuffer.segment(),
                    dstOffset,
                    stride,
                    flags
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdPushConstants.html">vkCmdPushConstants</a>
    public void vkCmdPushConstants(
            VkCommandBuffer commandBuffer,
            VkPipelineLayout layout,
            @enumtype(VkShaderStageFlags.class) int stageFlags,
            @unsigned int offset,
            @unsigned int size,
            @pointer(comment="void*") MemorySegment pValues
    ) {
        try {
            HANDLE$vkCmdPushConstants.invokeExact(
                    commandBuffer.segment(),
                    layout.segment(),
                    stageFlags,
                    offset,
                    size,
                    pValues
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdBeginRenderPass.html">vkCmdBeginRenderPass</a>
    public void vkCmdBeginRenderPass(
            VkCommandBuffer commandBuffer,
            @pointer(target=VkRenderPassBeginInfo.class) VkRenderPassBeginInfo pRenderPassBegin,
            @enumtype(VkSubpassContents.class) int contents
    ) {
        try {
            HANDLE$vkCmdBeginRenderPass.invokeExact(
                    commandBuffer.segment(),
                    pRenderPassBegin.segment(),
                    contents
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdNextSubpass.html">vkCmdNextSubpass</a>
    public void vkCmdNextSubpass(
            VkCommandBuffer commandBuffer,
            @enumtype(VkSubpassContents.class) int contents
    ) {
        try {
            HANDLE$vkCmdNextSubpass.invokeExact(
                    commandBuffer.segment(),
                    contents
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdEndRenderPass.html">vkCmdEndRenderPass</a>
    public void vkCmdEndRenderPass(
            VkCommandBuffer commandBuffer
    ) {
        try {
            HANDLE$vkCmdEndRenderPass.invokeExact(
                    commandBuffer.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdExecuteCommands.html">vkCmdExecuteCommands</a>
    public void vkCmdExecuteCommands(
            VkCommandBuffer commandBuffer,
            @unsigned int commandBufferCount,
            @pointer(target=VkCommandBuffer.class) VkCommandBuffer.Buffer pCommandBuffers
    ) {
        try {
            HANDLE$vkCmdExecuteCommands.invokeExact(
                    commandBuffer.segment(),
                    commandBufferCount,
                    pCommandBuffers.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCreateSharedSwapchainsKHR.html">vkCreateSharedSwapchainsKHR</a>
    public @enumtype(VkResult.class) int vkCreateSharedSwapchainsKHR(
            VkDevice device,
            @unsigned int swapchainCount,
            @pointer(target=VkSwapchainCreateInfoKHR.class) VkSwapchainCreateInfoKHR pCreateInfos,
            @nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator,
            @pointer(target=VkSwapchainKHR.class) VkSwapchainKHR.Buffer pSwapchains
    ) {
        try {
            return (int) HANDLE$vkCreateSharedSwapchainsKHR.invokeExact(
                    device.segment(),
                    swapchainCount,
                    pCreateInfos.segment(),
                    (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL),
                    pSwapchains.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCreateSwapchainKHR.html">vkCreateSwapchainKHR</a>
    public @enumtype(VkResult.class) int vkCreateSwapchainKHR(
            VkDevice device,
            @pointer(target=VkSwapchainCreateInfoKHR.class) VkSwapchainCreateInfoKHR pCreateInfo,
            @nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator,
            @pointer(target=VkSwapchainKHR.class) VkSwapchainKHR.Buffer pSwapchain
    ) {
        try {
            return (int) HANDLE$vkCreateSwapchainKHR.invokeExact(
                    device.segment(),
                    pCreateInfo.segment(),
                    (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL),
                    pSwapchain.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkDestroySwapchainKHR.html">vkDestroySwapchainKHR</a>
    public void vkDestroySwapchainKHR(
            VkDevice device,
            @nullable VkSwapchainKHR swapchain,
            @nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator
    ) {
        try {
            HANDLE$vkDestroySwapchainKHR.invokeExact(
                    device.segment(),
                    (MemorySegment) (swapchain != null ? swapchain.segment() : MemorySegment.NULL),
                    (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkGetSwapchainImagesKHR.html">vkGetSwapchainImagesKHR</a>
    public @enumtype(VkResult.class) int vkGetSwapchainImagesKHR(
            VkDevice device,
            VkSwapchainKHR swapchain,
            @unsigned IntBuffer pSwapchainImageCount,
            @nullable @pointer(target=VkImage.class) VkImage.Buffer pSwapchainImages
    ) {
        try {
            return (int) HANDLE$vkGetSwapchainImagesKHR.invokeExact(
                    device.segment(),
                    swapchain.segment(),
                    pSwapchainImageCount.segment(),
                    (MemorySegment) (pSwapchainImages != null ? pSwapchainImages.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkAcquireNextImageKHR.html">vkAcquireNextImageKHR</a>
    public @enumtype(VkResult.class) int vkAcquireNextImageKHR(
            VkDevice device,
            VkSwapchainKHR swapchain,
            @unsigned long timeout,
            @nullable VkSemaphore semaphore,
            @nullable VkFence fence,
            @unsigned IntBuffer pImageIndex
    ) {
        try {
            return (int) HANDLE$vkAcquireNextImageKHR.invokeExact(
                    device.segment(),
                    swapchain.segment(),
                    timeout,
                    (MemorySegment) (semaphore != null ? semaphore.segment() : MemorySegment.NULL),
                    (MemorySegment) (fence != null ? fence.segment() : MemorySegment.NULL),
                    pImageIndex.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkQueuePresentKHR.html">vkQueuePresentKHR</a>
    public @enumtype(VkResult.class) int vkQueuePresentKHR(
            VkQueue queue,
            @pointer(target=VkPresentInfoKHR.class) VkPresentInfoKHR pPresentInfo
    ) {
        try {
            return (int) HANDLE$vkQueuePresentKHR.invokeExact(
                    queue.segment(),
                    pPresentInfo.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkDebugMarkerSetObjectNameEXT.html">vkDebugMarkerSetObjectNameEXT</a>
    public @enumtype(VkResult.class) int vkDebugMarkerSetObjectNameEXT(
            VkDevice device,
            @pointer(target=VkDebugMarkerObjectNameInfoEXT.class) VkDebugMarkerObjectNameInfoEXT pNameInfo
    ) {
        try {
            return (int) HANDLE$vkDebugMarkerSetObjectNameEXT.invokeExact(
                    device.segment(),
                    pNameInfo.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkDebugMarkerSetObjectTagEXT.html">vkDebugMarkerSetObjectTagEXT</a>
    public @enumtype(VkResult.class) int vkDebugMarkerSetObjectTagEXT(
            VkDevice device,
            @pointer(target=VkDebugMarkerObjectTagInfoEXT.class) VkDebugMarkerObjectTagInfoEXT pTagInfo
    ) {
        try {
            return (int) HANDLE$vkDebugMarkerSetObjectTagEXT.invokeExact(
                    device.segment(),
                    pTagInfo.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdDebugMarkerBeginEXT.html">vkCmdDebugMarkerBeginEXT</a>
    public void vkCmdDebugMarkerBeginEXT(
            VkCommandBuffer commandBuffer,
            @pointer(target=VkDebugMarkerMarkerInfoEXT.class) VkDebugMarkerMarkerInfoEXT pMarkerInfo
    ) {
        try {
            HANDLE$vkCmdDebugMarkerBeginEXT.invokeExact(
                    commandBuffer.segment(),
                    pMarkerInfo.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdDebugMarkerEndEXT.html">vkCmdDebugMarkerEndEXT</a>
    public void vkCmdDebugMarkerEndEXT(
            VkCommandBuffer commandBuffer
    ) {
        try {
            HANDLE$vkCmdDebugMarkerEndEXT.invokeExact(
                    commandBuffer.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdDebugMarkerInsertEXT.html">vkCmdDebugMarkerInsertEXT</a>
    public void vkCmdDebugMarkerInsertEXT(
            VkCommandBuffer commandBuffer,
            @pointer(target=VkDebugMarkerMarkerInfoEXT.class) VkDebugMarkerMarkerInfoEXT pMarkerInfo
    ) {
        try {
            HANDLE$vkCmdDebugMarkerInsertEXT.invokeExact(
                    commandBuffer.segment(),
                    pMarkerInfo.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkGetMemoryWin32HandleNV.html">vkGetMemoryWin32HandleNV</a>
    public @enumtype(VkResult.class) int vkGetMemoryWin32HandleNV(
            VkDevice device,
            VkDeviceMemory memory,
            @enumtype(VkExternalMemoryHandleTypeFlagsNV.class) int handleType,
            @pointer(comment="void **") MemorySegment pHandle
    ) {
        try {
            return (int) HANDLE$vkGetMemoryWin32HandleNV.invokeExact(
                    device.segment(),
                    memory.segment(),
                    handleType,
                    pHandle
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdExecuteGeneratedCommandsNV.html">vkCmdExecuteGeneratedCommandsNV</a>
    public void vkCmdExecuteGeneratedCommandsNV(
            VkCommandBuffer commandBuffer,
            @unsigned int isPreprocessed,
            @pointer(target=VkGeneratedCommandsInfoNV.class) VkGeneratedCommandsInfoNV pGeneratedCommandsInfo
    ) {
        try {
            HANDLE$vkCmdExecuteGeneratedCommandsNV.invokeExact(
                    commandBuffer.segment(),
                    isPreprocessed,
                    pGeneratedCommandsInfo.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdPreprocessGeneratedCommandsNV.html">vkCmdPreprocessGeneratedCommandsNV</a>
    public void vkCmdPreprocessGeneratedCommandsNV(
            VkCommandBuffer commandBuffer,
            @pointer(target=VkGeneratedCommandsInfoNV.class) VkGeneratedCommandsInfoNV pGeneratedCommandsInfo
    ) {
        try {
            HANDLE$vkCmdPreprocessGeneratedCommandsNV.invokeExact(
                    commandBuffer.segment(),
                    pGeneratedCommandsInfo.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdBindPipelineShaderGroupNV.html">vkCmdBindPipelineShaderGroupNV</a>
    public void vkCmdBindPipelineShaderGroupNV(
            VkCommandBuffer commandBuffer,
            @enumtype(VkPipelineBindPoint.class) int pipelineBindPoint,
            VkPipeline pipeline,
            @unsigned int groupIndex
    ) {
        try {
            HANDLE$vkCmdBindPipelineShaderGroupNV.invokeExact(
                    commandBuffer.segment(),
                    pipelineBindPoint,
                    pipeline.segment(),
                    groupIndex
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkGetGeneratedCommandsMemoryRequirementsNV.html">vkGetGeneratedCommandsMemoryRequirementsNV</a>
    public void vkGetGeneratedCommandsMemoryRequirementsNV(
            VkDevice device,
            @pointer(target=VkGeneratedCommandsMemoryRequirementsInfoNV.class) VkGeneratedCommandsMemoryRequirementsInfoNV pInfo,
            @pointer(target=VkMemoryRequirements2.class) VkMemoryRequirements2 pMemoryRequirements
    ) {
        try {
            HANDLE$vkGetGeneratedCommandsMemoryRequirementsNV.invokeExact(
                    device.segment(),
                    pInfo.segment(),
                    pMemoryRequirements.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCreateIndirectCommandsLayoutNV.html">vkCreateIndirectCommandsLayoutNV</a>
    public @enumtype(VkResult.class) int vkCreateIndirectCommandsLayoutNV(
            VkDevice device,
            @pointer(target=VkIndirectCommandsLayoutCreateInfoNV.class) VkIndirectCommandsLayoutCreateInfoNV pCreateInfo,
            @nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator,
            @pointer(target=VkIndirectCommandsLayoutNV.class) VkIndirectCommandsLayoutNV.Buffer pIndirectCommandsLayout
    ) {
        try {
            return (int) HANDLE$vkCreateIndirectCommandsLayoutNV.invokeExact(
                    device.segment(),
                    pCreateInfo.segment(),
                    (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL),
                    pIndirectCommandsLayout.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkDestroyIndirectCommandsLayoutNV.html">vkDestroyIndirectCommandsLayoutNV</a>
    public void vkDestroyIndirectCommandsLayoutNV(
            VkDevice device,
            @nullable VkIndirectCommandsLayoutNV indirectCommandsLayout,
            @nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator
    ) {
        try {
            HANDLE$vkDestroyIndirectCommandsLayoutNV.invokeExact(
                    device.segment(),
                    (MemorySegment) (indirectCommandsLayout != null ? indirectCommandsLayout.segment() : MemorySegment.NULL),
                    (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdPushDescriptorSetKHR.html">vkCmdPushDescriptorSetKHR</a>
    public void vkCmdPushDescriptorSetKHR(
            VkCommandBuffer commandBuffer,
            @enumtype(VkPipelineBindPoint.class) int pipelineBindPoint,
            VkPipelineLayout layout,
            @unsigned int set,
            @unsigned int descriptorWriteCount,
            @pointer(target=VkWriteDescriptorSet.class) VkWriteDescriptorSet pDescriptorWrites
    ) {
        try {
            HANDLE$vkCmdPushDescriptorSetKHR.invokeExact(
                    commandBuffer.segment(),
                    pipelineBindPoint,
                    layout.segment(),
                    set,
                    descriptorWriteCount,
                    pDescriptorWrites.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkTrimCommandPool.html">vkTrimCommandPool</a>
    public void vkTrimCommandPool(
            VkDevice device,
            VkCommandPool commandPool,
            @enumtype(VkCommandPoolTrimFlags.class) int flags
    ) {
        try {
            HANDLE$vkTrimCommandPool.invokeExact(
                    device.segment(),
                    commandPool.segment(),
                    flags
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkGetMemoryWin32HandleKHR.html">vkGetMemoryWin32HandleKHR</a>
    public @enumtype(VkResult.class) int vkGetMemoryWin32HandleKHR(
            VkDevice device,
            @pointer(target=VkMemoryGetWin32HandleInfoKHR.class) VkMemoryGetWin32HandleInfoKHR pGetWin32HandleInfo,
            @pointer(comment="void **") MemorySegment pHandle
    ) {
        try {
            return (int) HANDLE$vkGetMemoryWin32HandleKHR.invokeExact(
                    device.segment(),
                    pGetWin32HandleInfo.segment(),
                    pHandle
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkGetMemoryWin32HandlePropertiesKHR.html">vkGetMemoryWin32HandlePropertiesKHR</a>
    public @enumtype(VkResult.class) int vkGetMemoryWin32HandlePropertiesKHR(
            VkDevice device,
            @enumtype(VkExternalMemoryHandleTypeFlags.class) int handleType,
            @pointer(comment="void*") MemorySegment handle,
            @pointer(target=VkMemoryWin32HandlePropertiesKHR.class) VkMemoryWin32HandlePropertiesKHR pMemoryWin32HandleProperties
    ) {
        try {
            return (int) HANDLE$vkGetMemoryWin32HandlePropertiesKHR.invokeExact(
                    device.segment(),
                    handleType,
                    handle,
                    pMemoryWin32HandleProperties.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkGetMemoryFdKHR.html">vkGetMemoryFdKHR</a>
    public @enumtype(VkResult.class) int vkGetMemoryFdKHR(
            VkDevice device,
            @pointer(target=VkMemoryGetFdInfoKHR.class) VkMemoryGetFdInfoKHR pGetFdInfo,
            IntBuffer pFd
    ) {
        try {
            return (int) HANDLE$vkGetMemoryFdKHR.invokeExact(
                    device.segment(),
                    pGetFdInfo.segment(),
                    pFd.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkGetMemoryFdPropertiesKHR.html">vkGetMemoryFdPropertiesKHR</a>
    public @enumtype(VkResult.class) int vkGetMemoryFdPropertiesKHR(
            VkDevice device,
            @enumtype(VkExternalMemoryHandleTypeFlags.class) int handleType,
            int fd,
            @pointer(target=VkMemoryFdPropertiesKHR.class) VkMemoryFdPropertiesKHR pMemoryFdProperties
    ) {
        try {
            return (int) HANDLE$vkGetMemoryFdPropertiesKHR.invokeExact(
                    device.segment(),
                    handleType,
                    fd,
                    pMemoryFdProperties.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkGetMemoryZirconHandleFUCHSIA.html">vkGetMemoryZirconHandleFUCHSIA</a>
    public @enumtype(VkResult.class) int vkGetMemoryZirconHandleFUCHSIA(
            VkDevice device,
            @pointer(target=VkMemoryGetZirconHandleInfoFUCHSIA.class) VkMemoryGetZirconHandleInfoFUCHSIA pGetZirconHandleInfo,
            @unsigned IntBuffer pZirconHandle
    ) {
        try {
            return (int) HANDLE$vkGetMemoryZirconHandleFUCHSIA.invokeExact(
                    device.segment(),
                    pGetZirconHandleInfo.segment(),
                    pZirconHandle.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkGetMemoryZirconHandlePropertiesFUCHSIA.html">vkGetMemoryZirconHandlePropertiesFUCHSIA</a>
    public @enumtype(VkResult.class) int vkGetMemoryZirconHandlePropertiesFUCHSIA(
            VkDevice device,
            @enumtype(VkExternalMemoryHandleTypeFlags.class) int handleType,
            @unsigned int zirconHandle,
            @pointer(target=VkMemoryZirconHandlePropertiesFUCHSIA.class) VkMemoryZirconHandlePropertiesFUCHSIA pMemoryZirconHandleProperties
    ) {
        try {
            return (int) HANDLE$vkGetMemoryZirconHandlePropertiesFUCHSIA.invokeExact(
                    device.segment(),
                    handleType,
                    zirconHandle,
                    pMemoryZirconHandleProperties.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkGetMemoryRemoteAddressNV.html">vkGetMemoryRemoteAddressNV</a>
    public @enumtype(VkResult.class) int vkGetMemoryRemoteAddressNV(
            VkDevice device,
            @pointer(target=VkMemoryGetRemoteAddressInfoNV.class) VkMemoryGetRemoteAddressInfoNV pMemoryGetRemoteAddressInfo,
            @pointer(comment="void **") MemorySegment pAddress
    ) {
        try {
            return (int) HANDLE$vkGetMemoryRemoteAddressNV.invokeExact(
                    device.segment(),
                    pMemoryGetRemoteAddressInfo.segment(),
                    pAddress
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkGetMemorySciBufNV.html">vkGetMemorySciBufNV</a>
    public @enumtype(VkResult.class) int vkGetMemorySciBufNV(
            VkDevice device,
            @pointer(target=VkMemoryGetSciBufInfoNV.class) VkMemoryGetSciBufInfoNV pGetSciBufInfo,
            @pointer(comment="void **") MemorySegment pHandle
    ) {
        try {
            return (int) HANDLE$vkGetMemorySciBufNV.invokeExact(
                    device.segment(),
                    pGetSciBufInfo.segment(),
                    pHandle
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkGetPhysicalDeviceExternalMemorySciBufPropertiesNV.html">vkGetPhysicalDeviceExternalMemorySciBufPropertiesNV</a>
    public @enumtype(VkResult.class) int vkGetPhysicalDeviceExternalMemorySciBufPropertiesNV(
            VkPhysicalDevice physicalDevice,
            @enumtype(VkExternalMemoryHandleTypeFlags.class) int handleType,
            @pointer(comment="void*") MemorySegment handle,
            @pointer(target=VkMemorySciBufPropertiesNV.class) VkMemorySciBufPropertiesNV pMemorySciBufProperties
    ) {
        try {
            return (int) HANDLE$vkGetPhysicalDeviceExternalMemorySciBufPropertiesNV.invokeExact(
                    physicalDevice.segment(),
                    handleType,
                    handle,
                    pMemorySciBufProperties.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkGetPhysicalDeviceSciBufAttributesNV.html">vkGetPhysicalDeviceSciBufAttributesNV</a>
    public @enumtype(VkResult.class) int vkGetPhysicalDeviceSciBufAttributesNV(
            VkPhysicalDevice physicalDevice,
            @pointer(comment="void*") MemorySegment pAttributes
    ) {
        try {
            return (int) HANDLE$vkGetPhysicalDeviceSciBufAttributesNV.invokeExact(
                    physicalDevice.segment(),
                    pAttributes
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkGetSemaphoreWin32HandleKHR.html">vkGetSemaphoreWin32HandleKHR</a>
    public @enumtype(VkResult.class) int vkGetSemaphoreWin32HandleKHR(
            VkDevice device,
            @pointer(target=VkSemaphoreGetWin32HandleInfoKHR.class) VkSemaphoreGetWin32HandleInfoKHR pGetWin32HandleInfo,
            @pointer(comment="void **") MemorySegment pHandle
    ) {
        try {
            return (int) HANDLE$vkGetSemaphoreWin32HandleKHR.invokeExact(
                    device.segment(),
                    pGetWin32HandleInfo.segment(),
                    pHandle
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkImportSemaphoreWin32HandleKHR.html">vkImportSemaphoreWin32HandleKHR</a>
    public @enumtype(VkResult.class) int vkImportSemaphoreWin32HandleKHR(
            VkDevice device,
            @pointer(target=VkImportSemaphoreWin32HandleInfoKHR.class) VkImportSemaphoreWin32HandleInfoKHR pImportSemaphoreWin32HandleInfo
    ) {
        try {
            return (int) HANDLE$vkImportSemaphoreWin32HandleKHR.invokeExact(
                    device.segment(),
                    pImportSemaphoreWin32HandleInfo.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkGetSemaphoreFdKHR.html">vkGetSemaphoreFdKHR</a>
    public @enumtype(VkResult.class) int vkGetSemaphoreFdKHR(
            VkDevice device,
            @pointer(target=VkSemaphoreGetFdInfoKHR.class) VkSemaphoreGetFdInfoKHR pGetFdInfo,
            IntBuffer pFd
    ) {
        try {
            return (int) HANDLE$vkGetSemaphoreFdKHR.invokeExact(
                    device.segment(),
                    pGetFdInfo.segment(),
                    pFd.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkImportSemaphoreFdKHR.html">vkImportSemaphoreFdKHR</a>
    public @enumtype(VkResult.class) int vkImportSemaphoreFdKHR(
            VkDevice device,
            @pointer(target=VkImportSemaphoreFdInfoKHR.class) VkImportSemaphoreFdInfoKHR pImportSemaphoreFdInfo
    ) {
        try {
            return (int) HANDLE$vkImportSemaphoreFdKHR.invokeExact(
                    device.segment(),
                    pImportSemaphoreFdInfo.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkGetSemaphoreZirconHandleFUCHSIA.html">vkGetSemaphoreZirconHandleFUCHSIA</a>
    public @enumtype(VkResult.class) int vkGetSemaphoreZirconHandleFUCHSIA(
            VkDevice device,
            @pointer(target=VkSemaphoreGetZirconHandleInfoFUCHSIA.class) VkSemaphoreGetZirconHandleInfoFUCHSIA pGetZirconHandleInfo,
            @unsigned IntBuffer pZirconHandle
    ) {
        try {
            return (int) HANDLE$vkGetSemaphoreZirconHandleFUCHSIA.invokeExact(
                    device.segment(),
                    pGetZirconHandleInfo.segment(),
                    pZirconHandle.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkImportSemaphoreZirconHandleFUCHSIA.html">vkImportSemaphoreZirconHandleFUCHSIA</a>
    public @enumtype(VkResult.class) int vkImportSemaphoreZirconHandleFUCHSIA(
            VkDevice device,
            @pointer(target=VkImportSemaphoreZirconHandleInfoFUCHSIA.class) VkImportSemaphoreZirconHandleInfoFUCHSIA pImportSemaphoreZirconHandleInfo
    ) {
        try {
            return (int) HANDLE$vkImportSemaphoreZirconHandleFUCHSIA.invokeExact(
                    device.segment(),
                    pImportSemaphoreZirconHandleInfo.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkGetFenceWin32HandleKHR.html">vkGetFenceWin32HandleKHR</a>
    public @enumtype(VkResult.class) int vkGetFenceWin32HandleKHR(
            VkDevice device,
            @pointer(target=VkFenceGetWin32HandleInfoKHR.class) VkFenceGetWin32HandleInfoKHR pGetWin32HandleInfo,
            @pointer(comment="void **") MemorySegment pHandle
    ) {
        try {
            return (int) HANDLE$vkGetFenceWin32HandleKHR.invokeExact(
                    device.segment(),
                    pGetWin32HandleInfo.segment(),
                    pHandle
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkImportFenceWin32HandleKHR.html">vkImportFenceWin32HandleKHR</a>
    public @enumtype(VkResult.class) int vkImportFenceWin32HandleKHR(
            VkDevice device,
            @pointer(target=VkImportFenceWin32HandleInfoKHR.class) VkImportFenceWin32HandleInfoKHR pImportFenceWin32HandleInfo
    ) {
        try {
            return (int) HANDLE$vkImportFenceWin32HandleKHR.invokeExact(
                    device.segment(),
                    pImportFenceWin32HandleInfo.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkGetFenceFdKHR.html">vkGetFenceFdKHR</a>
    public @enumtype(VkResult.class) int vkGetFenceFdKHR(
            VkDevice device,
            @pointer(target=VkFenceGetFdInfoKHR.class) VkFenceGetFdInfoKHR pGetFdInfo,
            IntBuffer pFd
    ) {
        try {
            return (int) HANDLE$vkGetFenceFdKHR.invokeExact(
                    device.segment(),
                    pGetFdInfo.segment(),
                    pFd.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkImportFenceFdKHR.html">vkImportFenceFdKHR</a>
    public @enumtype(VkResult.class) int vkImportFenceFdKHR(
            VkDevice device,
            @pointer(target=VkImportFenceFdInfoKHR.class) VkImportFenceFdInfoKHR pImportFenceFdInfo
    ) {
        try {
            return (int) HANDLE$vkImportFenceFdKHR.invokeExact(
                    device.segment(),
                    pImportFenceFdInfo.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkGetFenceSciSyncFenceNV.html">vkGetFenceSciSyncFenceNV</a>
    public @enumtype(VkResult.class) int vkGetFenceSciSyncFenceNV(
            VkDevice device,
            @pointer(target=VkFenceGetSciSyncInfoNV.class) VkFenceGetSciSyncInfoNV pGetSciSyncHandleInfo,
            @pointer(comment="void*") MemorySegment pHandle
    ) {
        try {
            return (int) HANDLE$vkGetFenceSciSyncFenceNV.invokeExact(
                    device.segment(),
                    pGetSciSyncHandleInfo.segment(),
                    pHandle
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkGetFenceSciSyncObjNV.html">vkGetFenceSciSyncObjNV</a>
    public @enumtype(VkResult.class) int vkGetFenceSciSyncObjNV(
            VkDevice device,
            @pointer(target=VkFenceGetSciSyncInfoNV.class) VkFenceGetSciSyncInfoNV pGetSciSyncHandleInfo,
            @pointer(comment="void*") MemorySegment pHandle
    ) {
        try {
            return (int) HANDLE$vkGetFenceSciSyncObjNV.invokeExact(
                    device.segment(),
                    pGetSciSyncHandleInfo.segment(),
                    pHandle
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkImportFenceSciSyncFenceNV.html">vkImportFenceSciSyncFenceNV</a>
    public @enumtype(VkResult.class) int vkImportFenceSciSyncFenceNV(
            VkDevice device,
            @pointer(target=VkImportFenceSciSyncInfoNV.class) VkImportFenceSciSyncInfoNV pImportFenceSciSyncInfo
    ) {
        try {
            return (int) HANDLE$vkImportFenceSciSyncFenceNV.invokeExact(
                    device.segment(),
                    pImportFenceSciSyncInfo.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkImportFenceSciSyncObjNV.html">vkImportFenceSciSyncObjNV</a>
    public @enumtype(VkResult.class) int vkImportFenceSciSyncObjNV(
            VkDevice device,
            @pointer(target=VkImportFenceSciSyncInfoNV.class) VkImportFenceSciSyncInfoNV pImportFenceSciSyncInfo
    ) {
        try {
            return (int) HANDLE$vkImportFenceSciSyncObjNV.invokeExact(
                    device.segment(),
                    pImportFenceSciSyncInfo.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkGetSemaphoreSciSyncObjNV.html">vkGetSemaphoreSciSyncObjNV</a>
    public @enumtype(VkResult.class) int vkGetSemaphoreSciSyncObjNV(
            VkDevice device,
            @pointer(target=VkSemaphoreGetSciSyncInfoNV.class) VkSemaphoreGetSciSyncInfoNV pGetSciSyncInfo,
            @pointer(comment="void*") MemorySegment pHandle
    ) {
        try {
            return (int) HANDLE$vkGetSemaphoreSciSyncObjNV.invokeExact(
                    device.segment(),
                    pGetSciSyncInfo.segment(),
                    pHandle
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkImportSemaphoreSciSyncObjNV.html">vkImportSemaphoreSciSyncObjNV</a>
    public @enumtype(VkResult.class) int vkImportSemaphoreSciSyncObjNV(
            VkDevice device,
            @pointer(target=VkImportSemaphoreSciSyncInfoNV.class) VkImportSemaphoreSciSyncInfoNV pImportSemaphoreSciSyncInfo
    ) {
        try {
            return (int) HANDLE$vkImportSemaphoreSciSyncObjNV.invokeExact(
                    device.segment(),
                    pImportSemaphoreSciSyncInfo.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkGetPhysicalDeviceSciSyncAttributesNV.html">vkGetPhysicalDeviceSciSyncAttributesNV</a>
    public @enumtype(VkResult.class) int vkGetPhysicalDeviceSciSyncAttributesNV(
            VkPhysicalDevice physicalDevice,
            @pointer(target=VkSciSyncAttributesInfoNV.class) VkSciSyncAttributesInfoNV pSciSyncAttributesInfo,
            @pointer(comment="void*") MemorySegment pAttributes
    ) {
        try {
            return (int) HANDLE$vkGetPhysicalDeviceSciSyncAttributesNV.invokeExact(
                    physicalDevice.segment(),
                    pSciSyncAttributesInfo.segment(),
                    pAttributes
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCreateSemaphoreSciSyncPoolNV.html">vkCreateSemaphoreSciSyncPoolNV</a>
    public @enumtype(VkResult.class) int vkCreateSemaphoreSciSyncPoolNV(
            VkDevice device,
            @pointer(target=VkSemaphoreSciSyncPoolCreateInfoNV.class) VkSemaphoreSciSyncPoolCreateInfoNV pCreateInfo,
            @nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator,
            @pointer(target=VkSemaphoreSciSyncPoolNV.class) VkSemaphoreSciSyncPoolNV.Buffer pSemaphorePool
    ) {
        try {
            return (int) HANDLE$vkCreateSemaphoreSciSyncPoolNV.invokeExact(
                    device.segment(),
                    pCreateInfo.segment(),
                    (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL),
                    pSemaphorePool.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkDestroySemaphoreSciSyncPoolNV.html">vkDestroySemaphoreSciSyncPoolNV</a>
    public void vkDestroySemaphoreSciSyncPoolNV(
            VkDevice device,
            @nullable VkSemaphoreSciSyncPoolNV semaphorePool,
            @nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator
    ) {
        try {
            HANDLE$vkDestroySemaphoreSciSyncPoolNV.invokeExact(
                    device.segment(),
                    (MemorySegment) (semaphorePool != null ? semaphorePool.segment() : MemorySegment.NULL),
                    (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkAcquireWinrtDisplayNV.html">vkAcquireWinrtDisplayNV</a>
    public @enumtype(VkResult.class) int vkAcquireWinrtDisplayNV(
            VkPhysicalDevice physicalDevice,
            VkDisplayKHR display
    ) {
        try {
            return (int) HANDLE$vkAcquireWinrtDisplayNV.invokeExact(
                    physicalDevice.segment(),
                    display.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkGetWinrtDisplayNV.html">vkGetWinrtDisplayNV</a>
    public @enumtype(VkResult.class) int vkGetWinrtDisplayNV(
            VkPhysicalDevice physicalDevice,
            @unsigned int deviceRelativeId,
            @pointer(target=VkDisplayKHR.class) VkDisplayKHR.Buffer pDisplay
    ) {
        try {
            return (int) HANDLE$vkGetWinrtDisplayNV.invokeExact(
                    physicalDevice.segment(),
                    deviceRelativeId,
                    pDisplay.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkDisplayPowerControlEXT.html">vkDisplayPowerControlEXT</a>
    public @enumtype(VkResult.class) int vkDisplayPowerControlEXT(
            VkDevice device,
            VkDisplayKHR display,
            @pointer(target=VkDisplayPowerInfoEXT.class) VkDisplayPowerInfoEXT pDisplayPowerInfo
    ) {
        try {
            return (int) HANDLE$vkDisplayPowerControlEXT.invokeExact(
                    device.segment(),
                    display.segment(),
                    pDisplayPowerInfo.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkRegisterDeviceEventEXT.html">vkRegisterDeviceEventEXT</a>
    public @enumtype(VkResult.class) int vkRegisterDeviceEventEXT(
            VkDevice device,
            @pointer(target=VkDeviceEventInfoEXT.class) VkDeviceEventInfoEXT pDeviceEventInfo,
            @nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator,
            @pointer(target=VkFence.class) VkFence.Buffer pFence
    ) {
        try {
            return (int) HANDLE$vkRegisterDeviceEventEXT.invokeExact(
                    device.segment(),
                    pDeviceEventInfo.segment(),
                    (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL),
                    pFence.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkRegisterDisplayEventEXT.html">vkRegisterDisplayEventEXT</a>
    public @enumtype(VkResult.class) int vkRegisterDisplayEventEXT(
            VkDevice device,
            VkDisplayKHR display,
            @pointer(target=VkDisplayEventInfoEXT.class) VkDisplayEventInfoEXT pDisplayEventInfo,
            @nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator,
            @pointer(target=VkFence.class) VkFence.Buffer pFence
    ) {
        try {
            return (int) HANDLE$vkRegisterDisplayEventEXT.invokeExact(
                    device.segment(),
                    display.segment(),
                    pDisplayEventInfo.segment(),
                    (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL),
                    pFence.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkGetSwapchainCounterEXT.html">vkGetSwapchainCounterEXT</a>
    public @enumtype(VkResult.class) int vkGetSwapchainCounterEXT(
            VkDevice device,
            VkSwapchainKHR swapchain,
            @enumtype(VkSurfaceCounterFlagsEXT.class) int counter,
            @unsigned LongBuffer pCounterValue
    ) {
        try {
            return (int) HANDLE$vkGetSwapchainCounterEXT.invokeExact(
                    device.segment(),
                    swapchain.segment(),
                    counter,
                    pCounterValue.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkGetDeviceGroupPeerMemoryFeatures.html">vkGetDeviceGroupPeerMemoryFeatures</a>
    public void vkGetDeviceGroupPeerMemoryFeatures(
            VkDevice device,
            @unsigned int heapIndex,
            @unsigned int localDeviceIndex,
            @unsigned int remoteDeviceIndex,
            @enumtype(VkPeerMemoryFeatureFlags.class) IntBuffer pPeerMemoryFeatures
    ) {
        try {
            HANDLE$vkGetDeviceGroupPeerMemoryFeatures.invokeExact(
                    device.segment(),
                    heapIndex,
                    localDeviceIndex,
                    remoteDeviceIndex,
                    pPeerMemoryFeatures.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkBindBufferMemory2.html">vkBindBufferMemory2</a>
    public @enumtype(VkResult.class) int vkBindBufferMemory2(
            VkDevice device,
            @unsigned int bindInfoCount,
            @pointer(target=VkBindBufferMemoryInfo.class) VkBindBufferMemoryInfo pBindInfos
    ) {
        try {
            return (int) HANDLE$vkBindBufferMemory2.invokeExact(
                    device.segment(),
                    bindInfoCount,
                    pBindInfos.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkBindImageMemory2.html">vkBindImageMemory2</a>
    public @enumtype(VkResult.class) int vkBindImageMemory2(
            VkDevice device,
            @unsigned int bindInfoCount,
            @pointer(target=VkBindImageMemoryInfo.class) VkBindImageMemoryInfo pBindInfos
    ) {
        try {
            return (int) HANDLE$vkBindImageMemory2.invokeExact(
                    device.segment(),
                    bindInfoCount,
                    pBindInfos.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdSetDeviceMask.html">vkCmdSetDeviceMask</a>
    public void vkCmdSetDeviceMask(
            VkCommandBuffer commandBuffer,
            @unsigned int deviceMask
    ) {
        try {
            HANDLE$vkCmdSetDeviceMask.invokeExact(
                    commandBuffer.segment(),
                    deviceMask
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkGetDeviceGroupPresentCapabilitiesKHR.html">vkGetDeviceGroupPresentCapabilitiesKHR</a>
    public @enumtype(VkResult.class) int vkGetDeviceGroupPresentCapabilitiesKHR(
            VkDevice device,
            @pointer(target=VkDeviceGroupPresentCapabilitiesKHR.class) VkDeviceGroupPresentCapabilitiesKHR pDeviceGroupPresentCapabilities
    ) {
        try {
            return (int) HANDLE$vkGetDeviceGroupPresentCapabilitiesKHR.invokeExact(
                    device.segment(),
                    pDeviceGroupPresentCapabilities.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkGetDeviceGroupSurfacePresentModesKHR.html">vkGetDeviceGroupSurfacePresentModesKHR</a>
    public @enumtype(VkResult.class) int vkGetDeviceGroupSurfacePresentModesKHR(
            VkDevice device,
            VkSurfaceKHR surface,
            @enumtype(VkDeviceGroupPresentModeFlagsKHR.class) IntBuffer pModes
    ) {
        try {
            return (int) HANDLE$vkGetDeviceGroupSurfacePresentModesKHR.invokeExact(
                    device.segment(),
                    surface.segment(),
                    pModes.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkAcquireNextImage2KHR.html">vkAcquireNextImage2KHR</a>
    public @enumtype(VkResult.class) int vkAcquireNextImage2KHR(
            VkDevice device,
            @pointer(target=VkAcquireNextImageInfoKHR.class) VkAcquireNextImageInfoKHR pAcquireInfo,
            @unsigned IntBuffer pImageIndex
    ) {
        try {
            return (int) HANDLE$vkAcquireNextImage2KHR.invokeExact(
                    device.segment(),
                    pAcquireInfo.segment(),
                    pImageIndex.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdDispatchBase.html">vkCmdDispatchBase</a>
    public void vkCmdDispatchBase(
            VkCommandBuffer commandBuffer,
            @unsigned int baseGroupX,
            @unsigned int baseGroupY,
            @unsigned int baseGroupZ,
            @unsigned int groupCountX,
            @unsigned int groupCountY,
            @unsigned int groupCountZ
    ) {
        try {
            HANDLE$vkCmdDispatchBase.invokeExact(
                    commandBuffer.segment(),
                    baseGroupX,
                    baseGroupY,
                    baseGroupZ,
                    groupCountX,
                    groupCountY,
                    groupCountZ
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkGetPhysicalDevicePresentRectanglesKHR.html">vkGetPhysicalDevicePresentRectanglesKHR</a>
    public @enumtype(VkResult.class) int vkGetPhysicalDevicePresentRectanglesKHR(
            VkPhysicalDevice physicalDevice,
            VkSurfaceKHR surface,
            @unsigned IntBuffer pRectCount,
            @nullable @pointer(target=VkRect2D.class) VkRect2D pRects
    ) {
        try {
            return (int) HANDLE$vkGetPhysicalDevicePresentRectanglesKHR.invokeExact(
                    physicalDevice.segment(),
                    surface.segment(),
                    pRectCount.segment(),
                    (MemorySegment) (pRects != null ? pRects.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCreateDescriptorUpdateTemplate.html">vkCreateDescriptorUpdateTemplate</a>
    public @enumtype(VkResult.class) int vkCreateDescriptorUpdateTemplate(
            VkDevice device,
            @pointer(target=VkDescriptorUpdateTemplateCreateInfo.class) VkDescriptorUpdateTemplateCreateInfo pCreateInfo,
            @nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator,
            @pointer(target=VkDescriptorUpdateTemplate.class) VkDescriptorUpdateTemplate.Buffer pDescriptorUpdateTemplate
    ) {
        try {
            return (int) HANDLE$vkCreateDescriptorUpdateTemplate.invokeExact(
                    device.segment(),
                    pCreateInfo.segment(),
                    (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL),
                    pDescriptorUpdateTemplate.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkDestroyDescriptorUpdateTemplate.html">vkDestroyDescriptorUpdateTemplate</a>
    public void vkDestroyDescriptorUpdateTemplate(
            VkDevice device,
            @nullable VkDescriptorUpdateTemplate descriptorUpdateTemplate,
            @nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator
    ) {
        try {
            HANDLE$vkDestroyDescriptorUpdateTemplate.invokeExact(
                    device.segment(),
                    (MemorySegment) (descriptorUpdateTemplate != null ? descriptorUpdateTemplate.segment() : MemorySegment.NULL),
                    (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkUpdateDescriptorSetWithTemplate.html">vkUpdateDescriptorSetWithTemplate</a>
    public void vkUpdateDescriptorSetWithTemplate(
            VkDevice device,
            VkDescriptorSet descriptorSet,
            VkDescriptorUpdateTemplate descriptorUpdateTemplate,
            @pointer(comment="void*") MemorySegment pData
    ) {
        try {
            HANDLE$vkUpdateDescriptorSetWithTemplate.invokeExact(
                    device.segment(),
                    descriptorSet.segment(),
                    descriptorUpdateTemplate.segment(),
                    pData
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdPushDescriptorSetWithTemplateKHR.html">vkCmdPushDescriptorSetWithTemplateKHR</a>
    public void vkCmdPushDescriptorSetWithTemplateKHR(
            VkCommandBuffer commandBuffer,
            VkDescriptorUpdateTemplate descriptorUpdateTemplate,
            VkPipelineLayout layout,
            @unsigned int set,
            @pointer(comment="void*") MemorySegment pData
    ) {
        try {
            HANDLE$vkCmdPushDescriptorSetWithTemplateKHR.invokeExact(
                    commandBuffer.segment(),
                    descriptorUpdateTemplate.segment(),
                    layout.segment(),
                    set,
                    pData
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkSetHdrMetadataEXT.html">vkSetHdrMetadataEXT</a>
    public void vkSetHdrMetadataEXT(
            VkDevice device,
            @unsigned int swapchainCount,
            @pointer(target=VkSwapchainKHR.class) VkSwapchainKHR.Buffer pSwapchains,
            @pointer(target=VkHdrMetadataEXT.class) VkHdrMetadataEXT pMetadata
    ) {
        try {
            HANDLE$vkSetHdrMetadataEXT.invokeExact(
                    device.segment(),
                    swapchainCount,
                    pSwapchains.segment(),
                    pMetadata.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkGetSwapchainStatusKHR.html">vkGetSwapchainStatusKHR</a>
    public @enumtype(VkResult.class) int vkGetSwapchainStatusKHR(
            VkDevice device,
            VkSwapchainKHR swapchain
    ) {
        try {
            return (int) HANDLE$vkGetSwapchainStatusKHR.invokeExact(
                    device.segment(),
                    swapchain.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkGetRefreshCycleDurationGOOGLE.html">vkGetRefreshCycleDurationGOOGLE</a>
    public @enumtype(VkResult.class) int vkGetRefreshCycleDurationGOOGLE(
            VkDevice device,
            VkSwapchainKHR swapchain,
            @pointer(target=VkRefreshCycleDurationGOOGLE.class) VkRefreshCycleDurationGOOGLE pDisplayTimingProperties
    ) {
        try {
            return (int) HANDLE$vkGetRefreshCycleDurationGOOGLE.invokeExact(
                    device.segment(),
                    swapchain.segment(),
                    pDisplayTimingProperties.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkGetPastPresentationTimingGOOGLE.html">vkGetPastPresentationTimingGOOGLE</a>
    public @enumtype(VkResult.class) int vkGetPastPresentationTimingGOOGLE(
            VkDevice device,
            VkSwapchainKHR swapchain,
            @unsigned IntBuffer pPresentationTimingCount,
            @nullable @pointer(target=VkPastPresentationTimingGOOGLE.class) VkPastPresentationTimingGOOGLE pPresentationTimings
    ) {
        try {
            return (int) HANDLE$vkGetPastPresentationTimingGOOGLE.invokeExact(
                    device.segment(),
                    swapchain.segment(),
                    pPresentationTimingCount.segment(),
                    (MemorySegment) (pPresentationTimings != null ? pPresentationTimings.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdSetViewportWScalingNV.html">vkCmdSetViewportWScalingNV</a>
    public void vkCmdSetViewportWScalingNV(
            VkCommandBuffer commandBuffer,
            @unsigned int firstViewport,
            @unsigned int viewportCount,
            @pointer(target=VkViewportWScalingNV.class) VkViewportWScalingNV pViewportWScalings
    ) {
        try {
            HANDLE$vkCmdSetViewportWScalingNV.invokeExact(
                    commandBuffer.segment(),
                    firstViewport,
                    viewportCount,
                    pViewportWScalings.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdSetDiscardRectangleEXT.html">vkCmdSetDiscardRectangleEXT</a>
    public void vkCmdSetDiscardRectangleEXT(
            VkCommandBuffer commandBuffer,
            @unsigned int firstDiscardRectangle,
            @unsigned int discardRectangleCount,
            @pointer(target=VkRect2D.class) VkRect2D pDiscardRectangles
    ) {
        try {
            HANDLE$vkCmdSetDiscardRectangleEXT.invokeExact(
                    commandBuffer.segment(),
                    firstDiscardRectangle,
                    discardRectangleCount,
                    pDiscardRectangles.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdSetDiscardRectangleEnableEXT.html">vkCmdSetDiscardRectangleEnableEXT</a>
    public void vkCmdSetDiscardRectangleEnableEXT(
            VkCommandBuffer commandBuffer,
            @unsigned int discardRectangleEnable
    ) {
        try {
            HANDLE$vkCmdSetDiscardRectangleEnableEXT.invokeExact(
                    commandBuffer.segment(),
                    discardRectangleEnable
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdSetDiscardRectangleModeEXT.html">vkCmdSetDiscardRectangleModeEXT</a>
    public void vkCmdSetDiscardRectangleModeEXT(
            VkCommandBuffer commandBuffer,
            @enumtype(VkDiscardRectangleModeEXT.class) int discardRectangleMode
    ) {
        try {
            HANDLE$vkCmdSetDiscardRectangleModeEXT.invokeExact(
                    commandBuffer.segment(),
                    discardRectangleMode
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdSetSampleLocationsEXT.html">vkCmdSetSampleLocationsEXT</a>
    public void vkCmdSetSampleLocationsEXT(
            VkCommandBuffer commandBuffer,
            @pointer(target=VkSampleLocationsInfoEXT.class) VkSampleLocationsInfoEXT pSampleLocationsInfo
    ) {
        try {
            HANDLE$vkCmdSetSampleLocationsEXT.invokeExact(
                    commandBuffer.segment(),
                    pSampleLocationsInfo.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkGetPhysicalDeviceMultisamplePropertiesEXT.html">vkGetPhysicalDeviceMultisamplePropertiesEXT</a>
    public void vkGetPhysicalDeviceMultisamplePropertiesEXT(
            VkPhysicalDevice physicalDevice,
            @enumtype(VkSampleCountFlags.class) int samples,
            @pointer(target=VkMultisamplePropertiesEXT.class) VkMultisamplePropertiesEXT pMultisampleProperties
    ) {
        try {
            HANDLE$vkGetPhysicalDeviceMultisamplePropertiesEXT.invokeExact(
                    physicalDevice.segment(),
                    samples,
                    pMultisampleProperties.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkGetBufferMemoryRequirements2.html">vkGetBufferMemoryRequirements2</a>
    public void vkGetBufferMemoryRequirements2(
            VkDevice device,
            @pointer(target=VkBufferMemoryRequirementsInfo2.class) VkBufferMemoryRequirementsInfo2 pInfo,
            @pointer(target=VkMemoryRequirements2.class) VkMemoryRequirements2 pMemoryRequirements
    ) {
        try {
            HANDLE$vkGetBufferMemoryRequirements2.invokeExact(
                    device.segment(),
                    pInfo.segment(),
                    pMemoryRequirements.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkGetImageMemoryRequirements2.html">vkGetImageMemoryRequirements2</a>
    public void vkGetImageMemoryRequirements2(
            VkDevice device,
            @pointer(target=VkImageMemoryRequirementsInfo2.class) VkImageMemoryRequirementsInfo2 pInfo,
            @pointer(target=VkMemoryRequirements2.class) VkMemoryRequirements2 pMemoryRequirements
    ) {
        try {
            HANDLE$vkGetImageMemoryRequirements2.invokeExact(
                    device.segment(),
                    pInfo.segment(),
                    pMemoryRequirements.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkGetImageSparseMemoryRequirements2.html">vkGetImageSparseMemoryRequirements2</a>
    public void vkGetImageSparseMemoryRequirements2(
            VkDevice device,
            @pointer(target=VkImageSparseMemoryRequirementsInfo2.class) VkImageSparseMemoryRequirementsInfo2 pInfo,
            @unsigned IntBuffer pSparseMemoryRequirementCount,
            @nullable @pointer(target=VkSparseImageMemoryRequirements2.class) VkSparseImageMemoryRequirements2 pSparseMemoryRequirements
    ) {
        try {
            HANDLE$vkGetImageSparseMemoryRequirements2.invokeExact(
                    device.segment(),
                    pInfo.segment(),
                    pSparseMemoryRequirementCount.segment(),
                    (MemorySegment) (pSparseMemoryRequirements != null ? pSparseMemoryRequirements.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkGetDeviceBufferMemoryRequirements.html">vkGetDeviceBufferMemoryRequirements</a>
    public void vkGetDeviceBufferMemoryRequirements(
            VkDevice device,
            @pointer(target=VkDeviceBufferMemoryRequirements.class) VkDeviceBufferMemoryRequirements pInfo,
            @pointer(target=VkMemoryRequirements2.class) VkMemoryRequirements2 pMemoryRequirements
    ) {
        try {
            HANDLE$vkGetDeviceBufferMemoryRequirements.invokeExact(
                    device.segment(),
                    pInfo.segment(),
                    pMemoryRequirements.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkGetDeviceImageMemoryRequirements.html">vkGetDeviceImageMemoryRequirements</a>
    public void vkGetDeviceImageMemoryRequirements(
            VkDevice device,
            @pointer(target=VkDeviceImageMemoryRequirements.class) VkDeviceImageMemoryRequirements pInfo,
            @pointer(target=VkMemoryRequirements2.class) VkMemoryRequirements2 pMemoryRequirements
    ) {
        try {
            HANDLE$vkGetDeviceImageMemoryRequirements.invokeExact(
                    device.segment(),
                    pInfo.segment(),
                    pMemoryRequirements.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkGetDeviceImageSparseMemoryRequirements.html">vkGetDeviceImageSparseMemoryRequirements</a>
    public void vkGetDeviceImageSparseMemoryRequirements(
            VkDevice device,
            @pointer(target=VkDeviceImageMemoryRequirements.class) VkDeviceImageMemoryRequirements pInfo,
            @unsigned IntBuffer pSparseMemoryRequirementCount,
            @nullable @pointer(target=VkSparseImageMemoryRequirements2.class) VkSparseImageMemoryRequirements2 pSparseMemoryRequirements
    ) {
        try {
            HANDLE$vkGetDeviceImageSparseMemoryRequirements.invokeExact(
                    device.segment(),
                    pInfo.segment(),
                    pSparseMemoryRequirementCount.segment(),
                    (MemorySegment) (pSparseMemoryRequirements != null ? pSparseMemoryRequirements.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCreateSamplerYcbcrConversion.html">vkCreateSamplerYcbcrConversion</a>
    public @enumtype(VkResult.class) int vkCreateSamplerYcbcrConversion(
            VkDevice device,
            @pointer(target=VkSamplerYcbcrConversionCreateInfo.class) VkSamplerYcbcrConversionCreateInfo pCreateInfo,
            @nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator,
            @pointer(target=VkSamplerYcbcrConversion.class) VkSamplerYcbcrConversion.Buffer pYcbcrConversion
    ) {
        try {
            return (int) HANDLE$vkCreateSamplerYcbcrConversion.invokeExact(
                    device.segment(),
                    pCreateInfo.segment(),
                    (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL),
                    pYcbcrConversion.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkDestroySamplerYcbcrConversion.html">vkDestroySamplerYcbcrConversion</a>
    public void vkDestroySamplerYcbcrConversion(
            VkDevice device,
            @nullable VkSamplerYcbcrConversion ycbcrConversion,
            @nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator
    ) {
        try {
            HANDLE$vkDestroySamplerYcbcrConversion.invokeExact(
                    device.segment(),
                    (MemorySegment) (ycbcrConversion != null ? ycbcrConversion.segment() : MemorySegment.NULL),
                    (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkGetDeviceQueue2.html">vkGetDeviceQueue2</a>
    public void vkGetDeviceQueue2(
            VkDevice device,
            @pointer(target=VkDeviceQueueInfo2.class) VkDeviceQueueInfo2 pQueueInfo,
            @pointer(target=VkQueue.class) VkQueue.Buffer pQueue
    ) {
        try {
            HANDLE$vkGetDeviceQueue2.invokeExact(
                    device.segment(),
                    pQueueInfo.segment(),
                    pQueue.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCreateValidationCacheEXT.html">vkCreateValidationCacheEXT</a>
    public @enumtype(VkResult.class) int vkCreateValidationCacheEXT(
            VkDevice device,
            @pointer(target=VkValidationCacheCreateInfoEXT.class) VkValidationCacheCreateInfoEXT pCreateInfo,
            @nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator,
            @pointer(target=VkValidationCacheEXT.class) VkValidationCacheEXT.Buffer pValidationCache
    ) {
        try {
            return (int) HANDLE$vkCreateValidationCacheEXT.invokeExact(
                    device.segment(),
                    pCreateInfo.segment(),
                    (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL),
                    pValidationCache.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkDestroyValidationCacheEXT.html">vkDestroyValidationCacheEXT</a>
    public void vkDestroyValidationCacheEXT(
            VkDevice device,
            @nullable VkValidationCacheEXT validationCache,
            @nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator
    ) {
        try {
            HANDLE$vkDestroyValidationCacheEXT.invokeExact(
                    device.segment(),
                    (MemorySegment) (validationCache != null ? validationCache.segment() : MemorySegment.NULL),
                    (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkGetValidationCacheDataEXT.html">vkGetValidationCacheDataEXT</a>
    public @enumtype(VkResult.class) int vkGetValidationCacheDataEXT(
            VkDevice device,
            VkValidationCacheEXT validationCache,
            PointerBuffer pDataSize,
            @pointer(comment="void*") MemorySegment pData
    ) {
        try {
            return (int) HANDLE$vkGetValidationCacheDataEXT.invokeExact(
                    device.segment(),
                    validationCache.segment(),
                    pDataSize.segment(),
                    pData
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkMergeValidationCachesEXT.html">vkMergeValidationCachesEXT</a>
    public @enumtype(VkResult.class) int vkMergeValidationCachesEXT(
            VkDevice device,
            VkValidationCacheEXT dstCache,
            @unsigned int srcCacheCount,
            @pointer(target=VkValidationCacheEXT.class) VkValidationCacheEXT.Buffer pSrcCaches
    ) {
        try {
            return (int) HANDLE$vkMergeValidationCachesEXT.invokeExact(
                    device.segment(),
                    dstCache.segment(),
                    srcCacheCount,
                    pSrcCaches.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkGetDescriptorSetLayoutSupport.html">vkGetDescriptorSetLayoutSupport</a>
    public void vkGetDescriptorSetLayoutSupport(
            VkDevice device,
            @pointer(target=VkDescriptorSetLayoutCreateInfo.class) VkDescriptorSetLayoutCreateInfo pCreateInfo,
            @pointer(target=VkDescriptorSetLayoutSupport.class) VkDescriptorSetLayoutSupport pSupport
    ) {
        try {
            HANDLE$vkGetDescriptorSetLayoutSupport.invokeExact(
                    device.segment(),
                    pCreateInfo.segment(),
                    pSupport.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkGetShaderInfoAMD.html">vkGetShaderInfoAMD</a>
    public @enumtype(VkResult.class) int vkGetShaderInfoAMD(
            VkDevice device,
            VkPipeline pipeline,
            @enumtype(VkShaderStageFlags.class) int shaderStage,
            @enumtype(VkShaderInfoTypeAMD.class) int infoType,
            PointerBuffer pInfoSize,
            @pointer(comment="void*") MemorySegment pInfo
    ) {
        try {
            return (int) HANDLE$vkGetShaderInfoAMD.invokeExact(
                    device.segment(),
                    pipeline.segment(),
                    shaderStage,
                    infoType,
                    pInfoSize.segment(),
                    pInfo
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkSetLocalDimmingAMD.html">vkSetLocalDimmingAMD</a>
    public void vkSetLocalDimmingAMD(
            VkDevice device,
            VkSwapchainKHR swapChain,
            @unsigned int localDimmingEnable
    ) {
        try {
            HANDLE$vkSetLocalDimmingAMD.invokeExact(
                    device.segment(),
                    swapChain.segment(),
                    localDimmingEnable
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkGetPhysicalDeviceCalibrateableTimeDomainsKHR.html">vkGetPhysicalDeviceCalibrateableTimeDomainsKHR</a>
    public @enumtype(VkResult.class) int vkGetPhysicalDeviceCalibrateableTimeDomainsKHR(
            VkPhysicalDevice physicalDevice,
            @unsigned IntBuffer pTimeDomainCount,
            @nullable @enumtype(VkTimeDomainKHR.class) IntBuffer pTimeDomains
    ) {
        try {
            return (int) HANDLE$vkGetPhysicalDeviceCalibrateableTimeDomainsKHR.invokeExact(
                    physicalDevice.segment(),
                    pTimeDomainCount.segment(),
                    (MemorySegment) (pTimeDomains != null ? pTimeDomains.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkGetCalibratedTimestampsKHR.html">vkGetCalibratedTimestampsKHR</a>
    public @enumtype(VkResult.class) int vkGetCalibratedTimestampsKHR(
            VkDevice device,
            @unsigned int timestampCount,
            @pointer(target=VkCalibratedTimestampInfoKHR.class) VkCalibratedTimestampInfoKHR pTimestampInfos,
            @unsigned LongBuffer pTimestamps,
            @unsigned LongBuffer pMaxDeviation
    ) {
        try {
            return (int) HANDLE$vkGetCalibratedTimestampsKHR.invokeExact(
                    device.segment(),
                    timestampCount,
                    pTimestampInfos.segment(),
                    pTimestamps.segment(),
                    pMaxDeviation.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkGetMemoryHostPointerPropertiesEXT.html">vkGetMemoryHostPointerPropertiesEXT</a>
    public @enumtype(VkResult.class) int vkGetMemoryHostPointerPropertiesEXT(
            VkDevice device,
            @enumtype(VkExternalMemoryHandleTypeFlags.class) int handleType,
            @pointer(comment="void*") MemorySegment pHostPointer,
            @pointer(target=VkMemoryHostPointerPropertiesEXT.class) VkMemoryHostPointerPropertiesEXT pMemoryHostPointerProperties
    ) {
        try {
            return (int) HANDLE$vkGetMemoryHostPointerPropertiesEXT.invokeExact(
                    device.segment(),
                    handleType,
                    pHostPointer,
                    pMemoryHostPointerProperties.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdWriteBufferMarkerAMD.html">vkCmdWriteBufferMarkerAMD</a>
    public void vkCmdWriteBufferMarkerAMD(
            VkCommandBuffer commandBuffer,
            @enumtype(VkPipelineStageFlags.class) int pipelineStage,
            VkBuffer dstBuffer,
            @unsigned long dstOffset,
            @unsigned int marker
    ) {
        try {
            HANDLE$vkCmdWriteBufferMarkerAMD.invokeExact(
                    commandBuffer.segment(),
                    pipelineStage,
                    dstBuffer.segment(),
                    dstOffset,
                    marker
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCreateRenderPass2.html">vkCreateRenderPass2</a>
    public @enumtype(VkResult.class) int vkCreateRenderPass2(
            VkDevice device,
            @pointer(target=VkRenderPassCreateInfo2.class) VkRenderPassCreateInfo2 pCreateInfo,
            @nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator,
            @pointer(target=VkRenderPass.class) VkRenderPass.Buffer pRenderPass
    ) {
        try {
            return (int) HANDLE$vkCreateRenderPass2.invokeExact(
                    device.segment(),
                    pCreateInfo.segment(),
                    (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL),
                    pRenderPass.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdBeginRenderPass2.html">vkCmdBeginRenderPass2</a>
    public void vkCmdBeginRenderPass2(
            VkCommandBuffer commandBuffer,
            @pointer(target=VkRenderPassBeginInfo.class) VkRenderPassBeginInfo pRenderPassBegin,
            @pointer(target=VkSubpassBeginInfo.class) VkSubpassBeginInfo pSubpassBeginInfo
    ) {
        try {
            HANDLE$vkCmdBeginRenderPass2.invokeExact(
                    commandBuffer.segment(),
                    pRenderPassBegin.segment(),
                    pSubpassBeginInfo.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdNextSubpass2.html">vkCmdNextSubpass2</a>
    public void vkCmdNextSubpass2(
            VkCommandBuffer commandBuffer,
            @pointer(target=VkSubpassBeginInfo.class) VkSubpassBeginInfo pSubpassBeginInfo,
            @pointer(target=VkSubpassEndInfo.class) VkSubpassEndInfo pSubpassEndInfo
    ) {
        try {
            HANDLE$vkCmdNextSubpass2.invokeExact(
                    commandBuffer.segment(),
                    pSubpassBeginInfo.segment(),
                    pSubpassEndInfo.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdEndRenderPass2.html">vkCmdEndRenderPass2</a>
    public void vkCmdEndRenderPass2(
            VkCommandBuffer commandBuffer,
            @pointer(target=VkSubpassEndInfo.class) VkSubpassEndInfo pSubpassEndInfo
    ) {
        try {
            HANDLE$vkCmdEndRenderPass2.invokeExact(
                    commandBuffer.segment(),
                    pSubpassEndInfo.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkGetSemaphoreCounterValue.html">vkGetSemaphoreCounterValue</a>
    public @enumtype(VkResult.class) int vkGetSemaphoreCounterValue(
            VkDevice device,
            VkSemaphore semaphore,
            @unsigned LongBuffer pValue
    ) {
        try {
            return (int) HANDLE$vkGetSemaphoreCounterValue.invokeExact(
                    device.segment(),
                    semaphore.segment(),
                    pValue.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkWaitSemaphores.html">vkWaitSemaphores</a>
    public @enumtype(VkResult.class) int vkWaitSemaphores(
            VkDevice device,
            @pointer(target=VkSemaphoreWaitInfo.class) VkSemaphoreWaitInfo pWaitInfo,
            @unsigned long timeout
    ) {
        try {
            return (int) HANDLE$vkWaitSemaphores.invokeExact(
                    device.segment(),
                    pWaitInfo.segment(),
                    timeout
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkSignalSemaphore.html">vkSignalSemaphore</a>
    public @enumtype(VkResult.class) int vkSignalSemaphore(
            VkDevice device,
            @pointer(target=VkSemaphoreSignalInfo.class) VkSemaphoreSignalInfo pSignalInfo
    ) {
        try {
            return (int) HANDLE$vkSignalSemaphore.invokeExact(
                    device.segment(),
                    pSignalInfo.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkGetAndroidHardwareBufferPropertiesANDROID.html">vkGetAndroidHardwareBufferPropertiesANDROID</a>
    public @enumtype(VkResult.class) int vkGetAndroidHardwareBufferPropertiesANDROID(
            VkDevice device,
            @pointer(comment="void*") MemorySegment buffer,
            @pointer(target=VkAndroidHardwareBufferPropertiesANDROID.class) VkAndroidHardwareBufferPropertiesANDROID pProperties
    ) {
        try {
            return (int) HANDLE$vkGetAndroidHardwareBufferPropertiesANDROID.invokeExact(
                    device.segment(),
                    buffer,
                    pProperties.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkGetMemoryAndroidHardwareBufferANDROID.html">vkGetMemoryAndroidHardwareBufferANDROID</a>
    public @enumtype(VkResult.class) int vkGetMemoryAndroidHardwareBufferANDROID(
            VkDevice device,
            @pointer(target=VkMemoryGetAndroidHardwareBufferInfoANDROID.class) VkMemoryGetAndroidHardwareBufferInfoANDROID pInfo,
            @pointer(comment="void **") MemorySegment pBuffer
    ) {
        try {
            return (int) HANDLE$vkGetMemoryAndroidHardwareBufferANDROID.invokeExact(
                    device.segment(),
                    pInfo.segment(),
                    pBuffer
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdDrawIndirectCount.html">vkCmdDrawIndirectCount</a>
    public void vkCmdDrawIndirectCount(
            VkCommandBuffer commandBuffer,
            VkBuffer buffer,
            @unsigned long offset,
            VkBuffer countBuffer,
            @unsigned long countBufferOffset,
            @unsigned int maxDrawCount,
            @unsigned int stride
    ) {
        try {
            HANDLE$vkCmdDrawIndirectCount.invokeExact(
                    commandBuffer.segment(),
                    buffer.segment(),
                    offset,
                    countBuffer.segment(),
                    countBufferOffset,
                    maxDrawCount,
                    stride
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdDrawIndexedIndirectCount.html">vkCmdDrawIndexedIndirectCount</a>
    public void vkCmdDrawIndexedIndirectCount(
            VkCommandBuffer commandBuffer,
            VkBuffer buffer,
            @unsigned long offset,
            VkBuffer countBuffer,
            @unsigned long countBufferOffset,
            @unsigned int maxDrawCount,
            @unsigned int stride
    ) {
        try {
            HANDLE$vkCmdDrawIndexedIndirectCount.invokeExact(
                    commandBuffer.segment(),
                    buffer.segment(),
                    offset,
                    countBuffer.segment(),
                    countBufferOffset,
                    maxDrawCount,
                    stride
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdSetCheckpointNV.html">vkCmdSetCheckpointNV</a>
    public void vkCmdSetCheckpointNV(
            VkCommandBuffer commandBuffer,
            @pointer(comment="void*") MemorySegment pCheckpointMarker
    ) {
        try {
            HANDLE$vkCmdSetCheckpointNV.invokeExact(
                    commandBuffer.segment(),
                    pCheckpointMarker
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkGetQueueCheckpointDataNV.html">vkGetQueueCheckpointDataNV</a>
    public void vkGetQueueCheckpointDataNV(
            VkQueue queue,
            @unsigned IntBuffer pCheckpointDataCount,
            @nullable @pointer(target=VkCheckpointDataNV.class) VkCheckpointDataNV pCheckpointData
    ) {
        try {
            HANDLE$vkGetQueueCheckpointDataNV.invokeExact(
                    queue.segment(),
                    pCheckpointDataCount.segment(),
                    (MemorySegment) (pCheckpointData != null ? pCheckpointData.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdBindTransformFeedbackBuffersEXT.html">vkCmdBindTransformFeedbackBuffersEXT</a>
    public void vkCmdBindTransformFeedbackBuffersEXT(
            VkCommandBuffer commandBuffer,
            @unsigned int firstBinding,
            @unsigned int bindingCount,
            @pointer(target=VkBuffer.class) VkBuffer.Buffer pBuffers,
            @unsigned LongBuffer pOffsets,
            @nullable @unsigned LongBuffer pSizes
    ) {
        try {
            HANDLE$vkCmdBindTransformFeedbackBuffersEXT.invokeExact(
                    commandBuffer.segment(),
                    firstBinding,
                    bindingCount,
                    pBuffers.segment(),
                    pOffsets.segment(),
                    (MemorySegment) (pSizes != null ? pSizes.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdBeginTransformFeedbackEXT.html">vkCmdBeginTransformFeedbackEXT</a>
    public void vkCmdBeginTransformFeedbackEXT(
            VkCommandBuffer commandBuffer,
            @unsigned int firstCounterBuffer,
            @unsigned int counterBufferCount,
            @nullable @pointer(target=VkBuffer.class) VkBuffer.Buffer pCounterBuffers,
            @nullable @unsigned LongBuffer pCounterBufferOffsets
    ) {
        try {
            HANDLE$vkCmdBeginTransformFeedbackEXT.invokeExact(
                    commandBuffer.segment(),
                    firstCounterBuffer,
                    counterBufferCount,
                    (MemorySegment) (pCounterBuffers != null ? pCounterBuffers.segment() : MemorySegment.NULL),
                    (MemorySegment) (pCounterBufferOffsets != null ? pCounterBufferOffsets.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdEndTransformFeedbackEXT.html">vkCmdEndTransformFeedbackEXT</a>
    public void vkCmdEndTransformFeedbackEXT(
            VkCommandBuffer commandBuffer,
            @unsigned int firstCounterBuffer,
            @unsigned int counterBufferCount,
            @nullable @pointer(target=VkBuffer.class) VkBuffer.Buffer pCounterBuffers,
            @nullable @unsigned LongBuffer pCounterBufferOffsets
    ) {
        try {
            HANDLE$vkCmdEndTransformFeedbackEXT.invokeExact(
                    commandBuffer.segment(),
                    firstCounterBuffer,
                    counterBufferCount,
                    (MemorySegment) (pCounterBuffers != null ? pCounterBuffers.segment() : MemorySegment.NULL),
                    (MemorySegment) (pCounterBufferOffsets != null ? pCounterBufferOffsets.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdBeginQueryIndexedEXT.html">vkCmdBeginQueryIndexedEXT</a>
    public void vkCmdBeginQueryIndexedEXT(
            VkCommandBuffer commandBuffer,
            VkQueryPool queryPool,
            @unsigned int query,
            @enumtype(VkQueryControlFlags.class) int flags,
            @unsigned int index
    ) {
        try {
            HANDLE$vkCmdBeginQueryIndexedEXT.invokeExact(
                    commandBuffer.segment(),
                    queryPool.segment(),
                    query,
                    flags,
                    index
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdEndQueryIndexedEXT.html">vkCmdEndQueryIndexedEXT</a>
    public void vkCmdEndQueryIndexedEXT(
            VkCommandBuffer commandBuffer,
            VkQueryPool queryPool,
            @unsigned int query,
            @unsigned int index
    ) {
        try {
            HANDLE$vkCmdEndQueryIndexedEXT.invokeExact(
                    commandBuffer.segment(),
                    queryPool.segment(),
                    query,
                    index
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdDrawIndirectByteCountEXT.html">vkCmdDrawIndirectByteCountEXT</a>
    public void vkCmdDrawIndirectByteCountEXT(
            VkCommandBuffer commandBuffer,
            @unsigned int instanceCount,
            @unsigned int firstInstance,
            VkBuffer counterBuffer,
            @unsigned long counterBufferOffset,
            @unsigned int counterOffset,
            @unsigned int vertexStride
    ) {
        try {
            HANDLE$vkCmdDrawIndirectByteCountEXT.invokeExact(
                    commandBuffer.segment(),
                    instanceCount,
                    firstInstance,
                    counterBuffer.segment(),
                    counterBufferOffset,
                    counterOffset,
                    vertexStride
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdSetExclusiveScissorNV.html">vkCmdSetExclusiveScissorNV</a>
    public void vkCmdSetExclusiveScissorNV(
            VkCommandBuffer commandBuffer,
            @unsigned int firstExclusiveScissor,
            @unsigned int exclusiveScissorCount,
            @pointer(target=VkRect2D.class) VkRect2D pExclusiveScissors
    ) {
        try {
            HANDLE$vkCmdSetExclusiveScissorNV.invokeExact(
                    commandBuffer.segment(),
                    firstExclusiveScissor,
                    exclusiveScissorCount,
                    pExclusiveScissors.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdSetExclusiveScissorEnableNV.html">vkCmdSetExclusiveScissorEnableNV</a>
    public void vkCmdSetExclusiveScissorEnableNV(
            VkCommandBuffer commandBuffer,
            @unsigned int firstExclusiveScissor,
            @unsigned int exclusiveScissorCount,
            @unsigned IntBuffer pExclusiveScissorEnables
    ) {
        try {
            HANDLE$vkCmdSetExclusiveScissorEnableNV.invokeExact(
                    commandBuffer.segment(),
                    firstExclusiveScissor,
                    exclusiveScissorCount,
                    pExclusiveScissorEnables.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdBindShadingRateImageNV.html">vkCmdBindShadingRateImageNV</a>
    public void vkCmdBindShadingRateImageNV(
            VkCommandBuffer commandBuffer,
            @nullable VkImageView imageView,
            @enumtype(VkImageLayout.class) int imageLayout
    ) {
        try {
            HANDLE$vkCmdBindShadingRateImageNV.invokeExact(
                    commandBuffer.segment(),
                    (MemorySegment) (imageView != null ? imageView.segment() : MemorySegment.NULL),
                    imageLayout
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdSetViewportShadingRatePaletteNV.html">vkCmdSetViewportShadingRatePaletteNV</a>
    public void vkCmdSetViewportShadingRatePaletteNV(
            VkCommandBuffer commandBuffer,
            @unsigned int firstViewport,
            @unsigned int viewportCount,
            @pointer(target=VkShadingRatePaletteNV.class) VkShadingRatePaletteNV pShadingRatePalettes
    ) {
        try {
            HANDLE$vkCmdSetViewportShadingRatePaletteNV.invokeExact(
                    commandBuffer.segment(),
                    firstViewport,
                    viewportCount,
                    pShadingRatePalettes.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdSetCoarseSampleOrderNV.html">vkCmdSetCoarseSampleOrderNV</a>
    public void vkCmdSetCoarseSampleOrderNV(
            VkCommandBuffer commandBuffer,
            @enumtype(VkCoarseSampleOrderTypeNV.class) int sampleOrderType,
            @unsigned int customSampleOrderCount,
            @nullable @pointer(target=VkCoarseSampleOrderCustomNV.class) VkCoarseSampleOrderCustomNV pCustomSampleOrders
    ) {
        try {
            HANDLE$vkCmdSetCoarseSampleOrderNV.invokeExact(
                    commandBuffer.segment(),
                    sampleOrderType,
                    customSampleOrderCount,
                    (MemorySegment) (pCustomSampleOrders != null ? pCustomSampleOrders.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdDrawMeshTasksNV.html">vkCmdDrawMeshTasksNV</a>
    public void vkCmdDrawMeshTasksNV(
            VkCommandBuffer commandBuffer,
            @unsigned int taskCount,
            @unsigned int firstTask
    ) {
        try {
            HANDLE$vkCmdDrawMeshTasksNV.invokeExact(
                    commandBuffer.segment(),
                    taskCount,
                    firstTask
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdDrawMeshTasksIndirectNV.html">vkCmdDrawMeshTasksIndirectNV</a>
    public void vkCmdDrawMeshTasksIndirectNV(
            VkCommandBuffer commandBuffer,
            VkBuffer buffer,
            @unsigned long offset,
            @unsigned int drawCount,
            @unsigned int stride
    ) {
        try {
            HANDLE$vkCmdDrawMeshTasksIndirectNV.invokeExact(
                    commandBuffer.segment(),
                    buffer.segment(),
                    offset,
                    drawCount,
                    stride
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdDrawMeshTasksIndirectCountNV.html">vkCmdDrawMeshTasksIndirectCountNV</a>
    public void vkCmdDrawMeshTasksIndirectCountNV(
            VkCommandBuffer commandBuffer,
            VkBuffer buffer,
            @unsigned long offset,
            VkBuffer countBuffer,
            @unsigned long countBufferOffset,
            @unsigned int maxDrawCount,
            @unsigned int stride
    ) {
        try {
            HANDLE$vkCmdDrawMeshTasksIndirectCountNV.invokeExact(
                    commandBuffer.segment(),
                    buffer.segment(),
                    offset,
                    countBuffer.segment(),
                    countBufferOffset,
                    maxDrawCount,
                    stride
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdDrawMeshTasksEXT.html">vkCmdDrawMeshTasksEXT</a>
    public void vkCmdDrawMeshTasksEXT(
            VkCommandBuffer commandBuffer,
            @unsigned int groupCountX,
            @unsigned int groupCountY,
            @unsigned int groupCountZ
    ) {
        try {
            HANDLE$vkCmdDrawMeshTasksEXT.invokeExact(
                    commandBuffer.segment(),
                    groupCountX,
                    groupCountY,
                    groupCountZ
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdDrawMeshTasksIndirectEXT.html">vkCmdDrawMeshTasksIndirectEXT</a>
    public void vkCmdDrawMeshTasksIndirectEXT(
            VkCommandBuffer commandBuffer,
            VkBuffer buffer,
            @unsigned long offset,
            @unsigned int drawCount,
            @unsigned int stride
    ) {
        try {
            HANDLE$vkCmdDrawMeshTasksIndirectEXT.invokeExact(
                    commandBuffer.segment(),
                    buffer.segment(),
                    offset,
                    drawCount,
                    stride
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdDrawMeshTasksIndirectCountEXT.html">vkCmdDrawMeshTasksIndirectCountEXT</a>
    public void vkCmdDrawMeshTasksIndirectCountEXT(
            VkCommandBuffer commandBuffer,
            VkBuffer buffer,
            @unsigned long offset,
            VkBuffer countBuffer,
            @unsigned long countBufferOffset,
            @unsigned int maxDrawCount,
            @unsigned int stride
    ) {
        try {
            HANDLE$vkCmdDrawMeshTasksIndirectCountEXT.invokeExact(
                    commandBuffer.segment(),
                    buffer.segment(),
                    offset,
                    countBuffer.segment(),
                    countBufferOffset,
                    maxDrawCount,
                    stride
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCompileDeferredNV.html">vkCompileDeferredNV</a>
    public @enumtype(VkResult.class) int vkCompileDeferredNV(
            VkDevice device,
            VkPipeline pipeline,
            @unsigned int shader
    ) {
        try {
            return (int) HANDLE$vkCompileDeferredNV.invokeExact(
                    device.segment(),
                    pipeline.segment(),
                    shader
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCreateAccelerationStructureNV.html">vkCreateAccelerationStructureNV</a>
    public @enumtype(VkResult.class) int vkCreateAccelerationStructureNV(
            VkDevice device,
            @pointer(target=VkAccelerationStructureCreateInfoNV.class) VkAccelerationStructureCreateInfoNV pCreateInfo,
            @nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator,
            @pointer(target=VkAccelerationStructureNV.class) VkAccelerationStructureNV.Buffer pAccelerationStructure
    ) {
        try {
            return (int) HANDLE$vkCreateAccelerationStructureNV.invokeExact(
                    device.segment(),
                    pCreateInfo.segment(),
                    (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL),
                    pAccelerationStructure.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdBindInvocationMaskHUAWEI.html">vkCmdBindInvocationMaskHUAWEI</a>
    public void vkCmdBindInvocationMaskHUAWEI(
            VkCommandBuffer commandBuffer,
            @nullable VkImageView imageView,
            @enumtype(VkImageLayout.class) int imageLayout
    ) {
        try {
            HANDLE$vkCmdBindInvocationMaskHUAWEI.invokeExact(
                    commandBuffer.segment(),
                    (MemorySegment) (imageView != null ? imageView.segment() : MemorySegment.NULL),
                    imageLayout
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkDestroyAccelerationStructureKHR.html">vkDestroyAccelerationStructureKHR</a>
    public void vkDestroyAccelerationStructureKHR(
            VkDevice device,
            @nullable VkAccelerationStructureKHR accelerationStructure,
            @nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator
    ) {
        try {
            HANDLE$vkDestroyAccelerationStructureKHR.invokeExact(
                    device.segment(),
                    (MemorySegment) (accelerationStructure != null ? accelerationStructure.segment() : MemorySegment.NULL),
                    (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkDestroyAccelerationStructureNV.html">vkDestroyAccelerationStructureNV</a>
    public void vkDestroyAccelerationStructureNV(
            VkDevice device,
            @nullable VkAccelerationStructureNV accelerationStructure,
            @nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator
    ) {
        try {
            HANDLE$vkDestroyAccelerationStructureNV.invokeExact(
                    device.segment(),
                    (MemorySegment) (accelerationStructure != null ? accelerationStructure.segment() : MemorySegment.NULL),
                    (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkGetAccelerationStructureMemoryRequirementsNV.html">vkGetAccelerationStructureMemoryRequirementsNV</a>
    public void vkGetAccelerationStructureMemoryRequirementsNV(
            VkDevice device,
            @pointer(target=VkAccelerationStructureMemoryRequirementsInfoNV.class) VkAccelerationStructureMemoryRequirementsInfoNV pInfo,
            @pointer(target=VkMemoryRequirements2.class) VkMemoryRequirements2 pMemoryRequirements
    ) {
        try {
            HANDLE$vkGetAccelerationStructureMemoryRequirementsNV.invokeExact(
                    device.segment(),
                    pInfo.segment(),
                    pMemoryRequirements.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkBindAccelerationStructureMemoryNV.html">vkBindAccelerationStructureMemoryNV</a>
    public @enumtype(VkResult.class) int vkBindAccelerationStructureMemoryNV(
            VkDevice device,
            @unsigned int bindInfoCount,
            @pointer(target=VkBindAccelerationStructureMemoryInfoNV.class) VkBindAccelerationStructureMemoryInfoNV pBindInfos
    ) {
        try {
            return (int) HANDLE$vkBindAccelerationStructureMemoryNV.invokeExact(
                    device.segment(),
                    bindInfoCount,
                    pBindInfos.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdCopyAccelerationStructureNV.html">vkCmdCopyAccelerationStructureNV</a>
    public void vkCmdCopyAccelerationStructureNV(
            VkCommandBuffer commandBuffer,
            VkAccelerationStructureNV dst,
            VkAccelerationStructureNV src,
            @enumtype(VkCopyAccelerationStructureModeKHR.class) int mode
    ) {
        try {
            HANDLE$vkCmdCopyAccelerationStructureNV.invokeExact(
                    commandBuffer.segment(),
                    dst.segment(),
                    src.segment(),
                    mode
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdCopyAccelerationStructureKHR.html">vkCmdCopyAccelerationStructureKHR</a>
    public void vkCmdCopyAccelerationStructureKHR(
            VkCommandBuffer commandBuffer,
            @pointer(target=VkCopyAccelerationStructureInfoKHR.class) VkCopyAccelerationStructureInfoKHR pInfo
    ) {
        try {
            HANDLE$vkCmdCopyAccelerationStructureKHR.invokeExact(
                    commandBuffer.segment(),
                    pInfo.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCopyAccelerationStructureKHR.html">vkCopyAccelerationStructureKHR</a>
    public @enumtype(VkResult.class) int vkCopyAccelerationStructureKHR(
            VkDevice device,
            @nullable VkDeferredOperationKHR deferredOperation,
            @pointer(target=VkCopyAccelerationStructureInfoKHR.class) VkCopyAccelerationStructureInfoKHR pInfo
    ) {
        try {
            return (int) HANDLE$vkCopyAccelerationStructureKHR.invokeExact(
                    device.segment(),
                    (MemorySegment) (deferredOperation != null ? deferredOperation.segment() : MemorySegment.NULL),
                    pInfo.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdCopyAccelerationStructureToMemoryKHR.html">vkCmdCopyAccelerationStructureToMemoryKHR</a>
    public void vkCmdCopyAccelerationStructureToMemoryKHR(
            VkCommandBuffer commandBuffer,
            @pointer(target=VkCopyAccelerationStructureToMemoryInfoKHR.class) VkCopyAccelerationStructureToMemoryInfoKHR pInfo
    ) {
        try {
            HANDLE$vkCmdCopyAccelerationStructureToMemoryKHR.invokeExact(
                    commandBuffer.segment(),
                    pInfo.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCopyAccelerationStructureToMemoryKHR.html">vkCopyAccelerationStructureToMemoryKHR</a>
    public @enumtype(VkResult.class) int vkCopyAccelerationStructureToMemoryKHR(
            VkDevice device,
            @nullable VkDeferredOperationKHR deferredOperation,
            @pointer(target=VkCopyAccelerationStructureToMemoryInfoKHR.class) VkCopyAccelerationStructureToMemoryInfoKHR pInfo
    ) {
        try {
            return (int) HANDLE$vkCopyAccelerationStructureToMemoryKHR.invokeExact(
                    device.segment(),
                    (MemorySegment) (deferredOperation != null ? deferredOperation.segment() : MemorySegment.NULL),
                    pInfo.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdCopyMemoryToAccelerationStructureKHR.html">vkCmdCopyMemoryToAccelerationStructureKHR</a>
    public void vkCmdCopyMemoryToAccelerationStructureKHR(
            VkCommandBuffer commandBuffer,
            @pointer(target=VkCopyMemoryToAccelerationStructureInfoKHR.class) VkCopyMemoryToAccelerationStructureInfoKHR pInfo
    ) {
        try {
            HANDLE$vkCmdCopyMemoryToAccelerationStructureKHR.invokeExact(
                    commandBuffer.segment(),
                    pInfo.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCopyMemoryToAccelerationStructureKHR.html">vkCopyMemoryToAccelerationStructureKHR</a>
    public @enumtype(VkResult.class) int vkCopyMemoryToAccelerationStructureKHR(
            VkDevice device,
            @nullable VkDeferredOperationKHR deferredOperation,
            @pointer(target=VkCopyMemoryToAccelerationStructureInfoKHR.class) VkCopyMemoryToAccelerationStructureInfoKHR pInfo
    ) {
        try {
            return (int) HANDLE$vkCopyMemoryToAccelerationStructureKHR.invokeExact(
                    device.segment(),
                    (MemorySegment) (deferredOperation != null ? deferredOperation.segment() : MemorySegment.NULL),
                    pInfo.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdWriteAccelerationStructuresPropertiesKHR.html">vkCmdWriteAccelerationStructuresPropertiesKHR</a>
    public void vkCmdWriteAccelerationStructuresPropertiesKHR(
            VkCommandBuffer commandBuffer,
            @unsigned int accelerationStructureCount,
            @pointer(target=VkAccelerationStructureKHR.class) VkAccelerationStructureKHR.Buffer pAccelerationStructures,
            @enumtype(VkQueryType.class) int queryType,
            VkQueryPool queryPool,
            @unsigned int firstQuery
    ) {
        try {
            HANDLE$vkCmdWriteAccelerationStructuresPropertiesKHR.invokeExact(
                    commandBuffer.segment(),
                    accelerationStructureCount,
                    pAccelerationStructures.segment(),
                    queryType,
                    queryPool.segment(),
                    firstQuery
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdWriteAccelerationStructuresPropertiesNV.html">vkCmdWriteAccelerationStructuresPropertiesNV</a>
    public void vkCmdWriteAccelerationStructuresPropertiesNV(
            VkCommandBuffer commandBuffer,
            @unsigned int accelerationStructureCount,
            @pointer(target=VkAccelerationStructureNV.class) VkAccelerationStructureNV.Buffer pAccelerationStructures,
            @enumtype(VkQueryType.class) int queryType,
            VkQueryPool queryPool,
            @unsigned int firstQuery
    ) {
        try {
            HANDLE$vkCmdWriteAccelerationStructuresPropertiesNV.invokeExact(
                    commandBuffer.segment(),
                    accelerationStructureCount,
                    pAccelerationStructures.segment(),
                    queryType,
                    queryPool.segment(),
                    firstQuery
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdBuildAccelerationStructureNV.html">vkCmdBuildAccelerationStructureNV</a>
    public void vkCmdBuildAccelerationStructureNV(
            VkCommandBuffer commandBuffer,
            @pointer(target=VkAccelerationStructureInfoNV.class) VkAccelerationStructureInfoNV pInfo,
            @nullable VkBuffer instanceData,
            @unsigned long instanceOffset,
            @unsigned int update,
            VkAccelerationStructureNV dst,
            @nullable VkAccelerationStructureNV src,
            VkBuffer scratch,
            @unsigned long scratchOffset
    ) {
        try {
            HANDLE$vkCmdBuildAccelerationStructureNV.invokeExact(
                    commandBuffer.segment(),
                    pInfo.segment(),
                    (MemorySegment) (instanceData != null ? instanceData.segment() : MemorySegment.NULL),
                    instanceOffset,
                    update,
                    dst.segment(),
                    (MemorySegment) (src != null ? src.segment() : MemorySegment.NULL),
                    scratch.segment(),
                    scratchOffset
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkWriteAccelerationStructuresPropertiesKHR.html">vkWriteAccelerationStructuresPropertiesKHR</a>
    public @enumtype(VkResult.class) int vkWriteAccelerationStructuresPropertiesKHR(
            VkDevice device,
            @unsigned int accelerationStructureCount,
            @pointer(target=VkAccelerationStructureKHR.class) VkAccelerationStructureKHR.Buffer pAccelerationStructures,
            @enumtype(VkQueryType.class) int queryType,
            @unsigned long dataSize,
            @pointer(comment="void*") MemorySegment pData,
            @unsigned long stride
    ) {
        try {
            return (int) HANDLE$vkWriteAccelerationStructuresPropertiesKHR.invokeExact(
                    device.segment(),
                    accelerationStructureCount,
                    pAccelerationStructures.segment(),
                    queryType,
                    dataSize,
                    pData,
                    stride
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdTraceRaysKHR.html">vkCmdTraceRaysKHR</a>
    public void vkCmdTraceRaysKHR(
            VkCommandBuffer commandBuffer,
            @pointer(target=VkStridedDeviceAddressRegionKHR.class) VkStridedDeviceAddressRegionKHR pRaygenShaderBindingTable,
            @pointer(target=VkStridedDeviceAddressRegionKHR.class) VkStridedDeviceAddressRegionKHR pMissShaderBindingTable,
            @pointer(target=VkStridedDeviceAddressRegionKHR.class) VkStridedDeviceAddressRegionKHR pHitShaderBindingTable,
            @pointer(target=VkStridedDeviceAddressRegionKHR.class) VkStridedDeviceAddressRegionKHR pCallableShaderBindingTable,
            @unsigned int width,
            @unsigned int height,
            @unsigned int depth
    ) {
        try {
            HANDLE$vkCmdTraceRaysKHR.invokeExact(
                    commandBuffer.segment(),
                    pRaygenShaderBindingTable.segment(),
                    pMissShaderBindingTable.segment(),
                    pHitShaderBindingTable.segment(),
                    pCallableShaderBindingTable.segment(),
                    width,
                    height,
                    depth
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdTraceRaysNV.html">vkCmdTraceRaysNV</a>
    public void vkCmdTraceRaysNV(
            VkCommandBuffer commandBuffer,
            VkBuffer raygenShaderBindingTableBuffer,
            @unsigned long raygenShaderBindingOffset,
            @nullable VkBuffer missShaderBindingTableBuffer,
            @unsigned long missShaderBindingOffset,
            @unsigned long missShaderBindingStride,
            @nullable VkBuffer hitShaderBindingTableBuffer,
            @unsigned long hitShaderBindingOffset,
            @unsigned long hitShaderBindingStride,
            @nullable VkBuffer callableShaderBindingTableBuffer,
            @unsigned long callableShaderBindingOffset,
            @unsigned long callableShaderBindingStride,
            @unsigned int width,
            @unsigned int height,
            @unsigned int depth
    ) {
        try {
            HANDLE$vkCmdTraceRaysNV.invokeExact(
                    commandBuffer.segment(),
                    raygenShaderBindingTableBuffer.segment(),
                    raygenShaderBindingOffset,
                    (MemorySegment) (missShaderBindingTableBuffer != null ? missShaderBindingTableBuffer.segment() : MemorySegment.NULL),
                    missShaderBindingOffset,
                    missShaderBindingStride,
                    (MemorySegment) (hitShaderBindingTableBuffer != null ? hitShaderBindingTableBuffer.segment() : MemorySegment.NULL),
                    hitShaderBindingOffset,
                    hitShaderBindingStride,
                    (MemorySegment) (callableShaderBindingTableBuffer != null ? callableShaderBindingTableBuffer.segment() : MemorySegment.NULL),
                    callableShaderBindingOffset,
                    callableShaderBindingStride,
                    width,
                    height,
                    depth
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkGetRayTracingShaderGroupHandlesKHR.html">vkGetRayTracingShaderGroupHandlesKHR</a>
    public @enumtype(VkResult.class) int vkGetRayTracingShaderGroupHandlesKHR(
            VkDevice device,
            VkPipeline pipeline,
            @unsigned int firstGroup,
            @unsigned int groupCount,
            @unsigned long dataSize,
            @pointer(comment="void*") MemorySegment pData
    ) {
        try {
            return (int) HANDLE$vkGetRayTracingShaderGroupHandlesKHR.invokeExact(
                    device.segment(),
                    pipeline.segment(),
                    firstGroup,
                    groupCount,
                    dataSize,
                    pData
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkGetRayTracingCaptureReplayShaderGroupHandlesKHR.html">vkGetRayTracingCaptureReplayShaderGroupHandlesKHR</a>
    public @enumtype(VkResult.class) int vkGetRayTracingCaptureReplayShaderGroupHandlesKHR(
            VkDevice device,
            VkPipeline pipeline,
            @unsigned int firstGroup,
            @unsigned int groupCount,
            @unsigned long dataSize,
            @pointer(comment="void*") MemorySegment pData
    ) {
        try {
            return (int) HANDLE$vkGetRayTracingCaptureReplayShaderGroupHandlesKHR.invokeExact(
                    device.segment(),
                    pipeline.segment(),
                    firstGroup,
                    groupCount,
                    dataSize,
                    pData
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkGetAccelerationStructureHandleNV.html">vkGetAccelerationStructureHandleNV</a>
    public @enumtype(VkResult.class) int vkGetAccelerationStructureHandleNV(
            VkDevice device,
            VkAccelerationStructureNV accelerationStructure,
            @unsigned long dataSize,
            @pointer(comment="void*") MemorySegment pData
    ) {
        try {
            return (int) HANDLE$vkGetAccelerationStructureHandleNV.invokeExact(
                    device.segment(),
                    accelerationStructure.segment(),
                    dataSize,
                    pData
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCreateRayTracingPipelinesNV.html">vkCreateRayTracingPipelinesNV</a>
    public @enumtype(VkResult.class) int vkCreateRayTracingPipelinesNV(
            VkDevice device,
            @nullable VkPipelineCache pipelineCache,
            @unsigned int createInfoCount,
            @pointer(target=VkRayTracingPipelineCreateInfoNV.class) VkRayTracingPipelineCreateInfoNV pCreateInfos,
            @nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator,
            @pointer(target=VkPipeline.class) VkPipeline.Buffer pPipelines
    ) {
        try {
            return (int) HANDLE$vkCreateRayTracingPipelinesNV.invokeExact(
                    device.segment(),
                    (MemorySegment) (pipelineCache != null ? pipelineCache.segment() : MemorySegment.NULL),
                    createInfoCount,
                    pCreateInfos.segment(),
                    (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL),
                    pPipelines.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCreateRayTracingPipelinesKHR.html">vkCreateRayTracingPipelinesKHR</a>
    public @enumtype(VkResult.class) int vkCreateRayTracingPipelinesKHR(
            VkDevice device,
            @nullable VkDeferredOperationKHR deferredOperation,
            @nullable VkPipelineCache pipelineCache,
            @unsigned int createInfoCount,
            @pointer(target=VkRayTracingPipelineCreateInfoKHR.class) VkRayTracingPipelineCreateInfoKHR pCreateInfos,
            @nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator,
            @pointer(target=VkPipeline.class) VkPipeline.Buffer pPipelines
    ) {
        try {
            return (int) HANDLE$vkCreateRayTracingPipelinesKHR.invokeExact(
                    device.segment(),
                    (MemorySegment) (deferredOperation != null ? deferredOperation.segment() : MemorySegment.NULL),
                    (MemorySegment) (pipelineCache != null ? pipelineCache.segment() : MemorySegment.NULL),
                    createInfoCount,
                    pCreateInfos.segment(),
                    (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL),
                    pPipelines.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkGetPhysicalDeviceCooperativeMatrixPropertiesNV.html">vkGetPhysicalDeviceCooperativeMatrixPropertiesNV</a>
    public @enumtype(VkResult.class) int vkGetPhysicalDeviceCooperativeMatrixPropertiesNV(
            VkPhysicalDevice physicalDevice,
            @unsigned IntBuffer pPropertyCount,
            @nullable @pointer(target=VkCooperativeMatrixPropertiesNV.class) VkCooperativeMatrixPropertiesNV pProperties
    ) {
        try {
            return (int) HANDLE$vkGetPhysicalDeviceCooperativeMatrixPropertiesNV.invokeExact(
                    physicalDevice.segment(),
                    pPropertyCount.segment(),
                    (MemorySegment) (pProperties != null ? pProperties.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdTraceRaysIndirectKHR.html">vkCmdTraceRaysIndirectKHR</a>
    public void vkCmdTraceRaysIndirectKHR(
            VkCommandBuffer commandBuffer,
            @pointer(target=VkStridedDeviceAddressRegionKHR.class) VkStridedDeviceAddressRegionKHR pRaygenShaderBindingTable,
            @pointer(target=VkStridedDeviceAddressRegionKHR.class) VkStridedDeviceAddressRegionKHR pMissShaderBindingTable,
            @pointer(target=VkStridedDeviceAddressRegionKHR.class) VkStridedDeviceAddressRegionKHR pHitShaderBindingTable,
            @pointer(target=VkStridedDeviceAddressRegionKHR.class) VkStridedDeviceAddressRegionKHR pCallableShaderBindingTable,
            @unsigned long indirectDeviceAddress
    ) {
        try {
            HANDLE$vkCmdTraceRaysIndirectKHR.invokeExact(
                    commandBuffer.segment(),
                    pRaygenShaderBindingTable.segment(),
                    pMissShaderBindingTable.segment(),
                    pHitShaderBindingTable.segment(),
                    pCallableShaderBindingTable.segment(),
                    indirectDeviceAddress
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdTraceRaysIndirect2KHR.html">vkCmdTraceRaysIndirect2KHR</a>
    public void vkCmdTraceRaysIndirect2KHR(
            VkCommandBuffer commandBuffer,
            @unsigned long indirectDeviceAddress
    ) {
        try {
            HANDLE$vkCmdTraceRaysIndirect2KHR.invokeExact(
                    commandBuffer.segment(),
                    indirectDeviceAddress
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkGetDeviceAccelerationStructureCompatibilityKHR.html">vkGetDeviceAccelerationStructureCompatibilityKHR</a>
    public void vkGetDeviceAccelerationStructureCompatibilityKHR(
            VkDevice device,
            @pointer(target=VkAccelerationStructureVersionInfoKHR.class) VkAccelerationStructureVersionInfoKHR pVersionInfo,
            @enumtype(VkAccelerationStructureCompatibilityKHR.class) IntBuffer pCompatibility
    ) {
        try {
            HANDLE$vkGetDeviceAccelerationStructureCompatibilityKHR.invokeExact(
                    device.segment(),
                    pVersionInfo.segment(),
                    pCompatibility.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkGetRayTracingShaderGroupStackSizeKHR.html">vkGetRayTracingShaderGroupStackSizeKHR</a>
    public @unsigned long vkGetRayTracingShaderGroupStackSizeKHR(
            VkDevice device,
            VkPipeline pipeline,
            @unsigned int group,
            @enumtype(VkShaderGroupShaderKHR.class) int groupShader
    ) {
        try {
            return (long) HANDLE$vkGetRayTracingShaderGroupStackSizeKHR.invokeExact(
                    device.segment(),
                    pipeline.segment(),
                    group,
                    groupShader
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdSetRayTracingPipelineStackSizeKHR.html">vkCmdSetRayTracingPipelineStackSizeKHR</a>
    public void vkCmdSetRayTracingPipelineStackSizeKHR(
            VkCommandBuffer commandBuffer,
            @unsigned int pipelineStackSize
    ) {
        try {
            HANDLE$vkCmdSetRayTracingPipelineStackSizeKHR.invokeExact(
                    commandBuffer.segment(),
                    pipelineStackSize
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkGetImageViewHandleNVX.html">vkGetImageViewHandleNVX</a>
    public @unsigned int vkGetImageViewHandleNVX(
            VkDevice device,
            @pointer(target=VkImageViewHandleInfoNVX.class) VkImageViewHandleInfoNVX pInfo
    ) {
        try {
            return (int) HANDLE$vkGetImageViewHandleNVX.invokeExact(
                    device.segment(),
                    pInfo.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkGetImageViewAddressNVX.html">vkGetImageViewAddressNVX</a>
    public @enumtype(VkResult.class) int vkGetImageViewAddressNVX(
            VkDevice device,
            VkImageView imageView,
            @pointer(target=VkImageViewAddressPropertiesNVX.class) VkImageViewAddressPropertiesNVX pProperties
    ) {
        try {
            return (int) HANDLE$vkGetImageViewAddressNVX.invokeExact(
                    device.segment(),
                    imageView.segment(),
                    pProperties.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkGetPhysicalDeviceSurfacePresentModes2EXT.html">vkGetPhysicalDeviceSurfacePresentModes2EXT</a>
    public @enumtype(VkResult.class) int vkGetPhysicalDeviceSurfacePresentModes2EXT(
            VkPhysicalDevice physicalDevice,
            @pointer(target=VkPhysicalDeviceSurfaceInfo2KHR.class) VkPhysicalDeviceSurfaceInfo2KHR pSurfaceInfo,
            @unsigned IntBuffer pPresentModeCount,
            @nullable @enumtype(VkPresentModeKHR.class) IntBuffer pPresentModes
    ) {
        try {
            return (int) HANDLE$vkGetPhysicalDeviceSurfacePresentModes2EXT.invokeExact(
                    physicalDevice.segment(),
                    pSurfaceInfo.segment(),
                    pPresentModeCount.segment(),
                    (MemorySegment) (pPresentModes != null ? pPresentModes.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkGetDeviceGroupSurfacePresentModes2EXT.html">vkGetDeviceGroupSurfacePresentModes2EXT</a>
    public @enumtype(VkResult.class) int vkGetDeviceGroupSurfacePresentModes2EXT(
            VkDevice device,
            @pointer(target=VkPhysicalDeviceSurfaceInfo2KHR.class) VkPhysicalDeviceSurfaceInfo2KHR pSurfaceInfo,
            @enumtype(VkDeviceGroupPresentModeFlagsKHR.class) IntBuffer pModes
    ) {
        try {
            return (int) HANDLE$vkGetDeviceGroupSurfacePresentModes2EXT.invokeExact(
                    device.segment(),
                    pSurfaceInfo.segment(),
                    pModes.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkAcquireFullScreenExclusiveModeEXT.html">vkAcquireFullScreenExclusiveModeEXT</a>
    public @enumtype(VkResult.class) int vkAcquireFullScreenExclusiveModeEXT(
            VkDevice device,
            VkSwapchainKHR swapchain
    ) {
        try {
            return (int) HANDLE$vkAcquireFullScreenExclusiveModeEXT.invokeExact(
                    device.segment(),
                    swapchain.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkReleaseFullScreenExclusiveModeEXT.html">vkReleaseFullScreenExclusiveModeEXT</a>
    public @enumtype(VkResult.class) int vkReleaseFullScreenExclusiveModeEXT(
            VkDevice device,
            VkSwapchainKHR swapchain
    ) {
        try {
            return (int) HANDLE$vkReleaseFullScreenExclusiveModeEXT.invokeExact(
                    device.segment(),
                    swapchain.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkEnumeratePhysicalDeviceQueueFamilyPerformanceQueryCountersKHR.html">vkEnumeratePhysicalDeviceQueueFamilyPerformanceQueryCountersKHR</a>
    public @enumtype(VkResult.class) int vkEnumeratePhysicalDeviceQueueFamilyPerformanceQueryCountersKHR(
            VkPhysicalDevice physicalDevice,
            @unsigned int queueFamilyIndex,
            @unsigned IntBuffer pCounterCount,
            @nullable @pointer(target=VkPerformanceCounterKHR.class) VkPerformanceCounterKHR pCounters,
            @nullable @pointer(target=VkPerformanceCounterDescriptionKHR.class) VkPerformanceCounterDescriptionKHR pCounterDescriptions
    ) {
        try {
            return (int) HANDLE$vkEnumeratePhysicalDeviceQueueFamilyPerformanceQueryCountersKHR.invokeExact(
                    physicalDevice.segment(),
                    queueFamilyIndex,
                    pCounterCount.segment(),
                    (MemorySegment) (pCounters != null ? pCounters.segment() : MemorySegment.NULL),
                    (MemorySegment) (pCounterDescriptions != null ? pCounterDescriptions.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkGetPhysicalDeviceQueueFamilyPerformanceQueryPassesKHR.html">vkGetPhysicalDeviceQueueFamilyPerformanceQueryPassesKHR</a>
    public void vkGetPhysicalDeviceQueueFamilyPerformanceQueryPassesKHR(
            VkPhysicalDevice physicalDevice,
            @pointer(target=VkQueryPoolPerformanceCreateInfoKHR.class) VkQueryPoolPerformanceCreateInfoKHR pPerformanceQueryCreateInfo,
            @unsigned IntBuffer pNumPasses
    ) {
        try {
            HANDLE$vkGetPhysicalDeviceQueueFamilyPerformanceQueryPassesKHR.invokeExact(
                    physicalDevice.segment(),
                    pPerformanceQueryCreateInfo.segment(),
                    pNumPasses.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkAcquireProfilingLockKHR.html">vkAcquireProfilingLockKHR</a>
    public @enumtype(VkResult.class) int vkAcquireProfilingLockKHR(
            VkDevice device,
            @pointer(target=VkAcquireProfilingLockInfoKHR.class) VkAcquireProfilingLockInfoKHR pInfo
    ) {
        try {
            return (int) HANDLE$vkAcquireProfilingLockKHR.invokeExact(
                    device.segment(),
                    pInfo.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkReleaseProfilingLockKHR.html">vkReleaseProfilingLockKHR</a>
    public void vkReleaseProfilingLockKHR(
            VkDevice device
    ) {
        try {
            HANDLE$vkReleaseProfilingLockKHR.invokeExact(
                    device.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkGetImageDrmFormatModifierPropertiesEXT.html">vkGetImageDrmFormatModifierPropertiesEXT</a>
    public @enumtype(VkResult.class) int vkGetImageDrmFormatModifierPropertiesEXT(
            VkDevice device,
            VkImage image,
            @pointer(target=VkImageDrmFormatModifierPropertiesEXT.class) VkImageDrmFormatModifierPropertiesEXT pProperties
    ) {
        try {
            return (int) HANDLE$vkGetImageDrmFormatModifierPropertiesEXT.invokeExact(
                    device.segment(),
                    image.segment(),
                    pProperties.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkGetBufferOpaqueCaptureAddress.html">vkGetBufferOpaqueCaptureAddress</a>
    public @unsigned long vkGetBufferOpaqueCaptureAddress(
            VkDevice device,
            @pointer(target=VkBufferDeviceAddressInfo.class) VkBufferDeviceAddressInfo pInfo
    ) {
        try {
            return (long) HANDLE$vkGetBufferOpaqueCaptureAddress.invokeExact(
                    device.segment(),
                    pInfo.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkGetBufferDeviceAddress.html">vkGetBufferDeviceAddress</a>
    public @unsigned long vkGetBufferDeviceAddress(
            VkDevice device,
            @pointer(target=VkBufferDeviceAddressInfo.class) VkBufferDeviceAddressInfo pInfo
    ) {
        try {
            return (long) HANDLE$vkGetBufferDeviceAddress.invokeExact(
                    device.segment(),
                    pInfo.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkGetPhysicalDeviceSupportedFramebufferMixedSamplesCombinationsNV.html">vkGetPhysicalDeviceSupportedFramebufferMixedSamplesCombinationsNV</a>
    public @enumtype(VkResult.class) int vkGetPhysicalDeviceSupportedFramebufferMixedSamplesCombinationsNV(
            VkPhysicalDevice physicalDevice,
            @unsigned IntBuffer pCombinationCount,
            @nullable @pointer(target=VkFramebufferMixedSamplesCombinationNV.class) VkFramebufferMixedSamplesCombinationNV pCombinations
    ) {
        try {
            return (int) HANDLE$vkGetPhysicalDeviceSupportedFramebufferMixedSamplesCombinationsNV.invokeExact(
                    physicalDevice.segment(),
                    pCombinationCount.segment(),
                    (MemorySegment) (pCombinations != null ? pCombinations.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkInitializePerformanceApiINTEL.html">vkInitializePerformanceApiINTEL</a>
    public @enumtype(VkResult.class) int vkInitializePerformanceApiINTEL(
            VkDevice device,
            @pointer(target=VkInitializePerformanceApiInfoINTEL.class) VkInitializePerformanceApiInfoINTEL pInitializeInfo
    ) {
        try {
            return (int) HANDLE$vkInitializePerformanceApiINTEL.invokeExact(
                    device.segment(),
                    pInitializeInfo.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkUninitializePerformanceApiINTEL.html">vkUninitializePerformanceApiINTEL</a>
    public void vkUninitializePerformanceApiINTEL(
            VkDevice device
    ) {
        try {
            HANDLE$vkUninitializePerformanceApiINTEL.invokeExact(
                    device.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdSetPerformanceMarkerINTEL.html">vkCmdSetPerformanceMarkerINTEL</a>
    public @enumtype(VkResult.class) int vkCmdSetPerformanceMarkerINTEL(
            VkCommandBuffer commandBuffer,
            @pointer(target=VkPerformanceMarkerInfoINTEL.class) VkPerformanceMarkerInfoINTEL pMarkerInfo
    ) {
        try {
            return (int) HANDLE$vkCmdSetPerformanceMarkerINTEL.invokeExact(
                    commandBuffer.segment(),
                    pMarkerInfo.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdSetPerformanceStreamMarkerINTEL.html">vkCmdSetPerformanceStreamMarkerINTEL</a>
    public @enumtype(VkResult.class) int vkCmdSetPerformanceStreamMarkerINTEL(
            VkCommandBuffer commandBuffer,
            @pointer(target=VkPerformanceStreamMarkerInfoINTEL.class) VkPerformanceStreamMarkerInfoINTEL pMarkerInfo
    ) {
        try {
            return (int) HANDLE$vkCmdSetPerformanceStreamMarkerINTEL.invokeExact(
                    commandBuffer.segment(),
                    pMarkerInfo.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdSetPerformanceOverrideINTEL.html">vkCmdSetPerformanceOverrideINTEL</a>
    public @enumtype(VkResult.class) int vkCmdSetPerformanceOverrideINTEL(
            VkCommandBuffer commandBuffer,
            @pointer(target=VkPerformanceOverrideInfoINTEL.class) VkPerformanceOverrideInfoINTEL pOverrideInfo
    ) {
        try {
            return (int) HANDLE$vkCmdSetPerformanceOverrideINTEL.invokeExact(
                    commandBuffer.segment(),
                    pOverrideInfo.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkAcquirePerformanceConfigurationINTEL.html">vkAcquirePerformanceConfigurationINTEL</a>
    public @enumtype(VkResult.class) int vkAcquirePerformanceConfigurationINTEL(
            VkDevice device,
            @pointer(target=VkPerformanceConfigurationAcquireInfoINTEL.class) VkPerformanceConfigurationAcquireInfoINTEL pAcquireInfo,
            @pointer(target=VkPerformanceConfigurationINTEL.class) VkPerformanceConfigurationINTEL.Buffer pConfiguration
    ) {
        try {
            return (int) HANDLE$vkAcquirePerformanceConfigurationINTEL.invokeExact(
                    device.segment(),
                    pAcquireInfo.segment(),
                    pConfiguration.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkReleasePerformanceConfigurationINTEL.html">vkReleasePerformanceConfigurationINTEL</a>
    public @enumtype(VkResult.class) int vkReleasePerformanceConfigurationINTEL(
            VkDevice device,
            @nullable VkPerformanceConfigurationINTEL configuration
    ) {
        try {
            return (int) HANDLE$vkReleasePerformanceConfigurationINTEL.invokeExact(
                    device.segment(),
                    (MemorySegment) (configuration != null ? configuration.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkQueueSetPerformanceConfigurationINTEL.html">vkQueueSetPerformanceConfigurationINTEL</a>
    public @enumtype(VkResult.class) int vkQueueSetPerformanceConfigurationINTEL(
            VkQueue queue,
            VkPerformanceConfigurationINTEL configuration
    ) {
        try {
            return (int) HANDLE$vkQueueSetPerformanceConfigurationINTEL.invokeExact(
                    queue.segment(),
                    configuration.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkGetPerformanceParameterINTEL.html">vkGetPerformanceParameterINTEL</a>
    public @enumtype(VkResult.class) int vkGetPerformanceParameterINTEL(
            VkDevice device,
            @enumtype(VkPerformanceParameterTypeINTEL.class) int parameter,
            @pointer(target=VkPerformanceValueINTEL.class) VkPerformanceValueINTEL pValue
    ) {
        try {
            return (int) HANDLE$vkGetPerformanceParameterINTEL.invokeExact(
                    device.segment(),
                    parameter,
                    pValue.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkGetDeviceMemoryOpaqueCaptureAddress.html">vkGetDeviceMemoryOpaqueCaptureAddress</a>
    public @unsigned long vkGetDeviceMemoryOpaqueCaptureAddress(
            VkDevice device,
            @pointer(target=VkDeviceMemoryOpaqueCaptureAddressInfo.class) VkDeviceMemoryOpaqueCaptureAddressInfo pInfo
    ) {
        try {
            return (long) HANDLE$vkGetDeviceMemoryOpaqueCaptureAddress.invokeExact(
                    device.segment(),
                    pInfo.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkGetPipelineExecutablePropertiesKHR.html">vkGetPipelineExecutablePropertiesKHR</a>
    public @enumtype(VkResult.class) int vkGetPipelineExecutablePropertiesKHR(
            VkDevice device,
            @pointer(target=VkPipelineInfoKHR.class) VkPipelineInfoKHR pPipelineInfo,
            @unsigned IntBuffer pExecutableCount,
            @nullable @pointer(target=VkPipelineExecutablePropertiesKHR.class) VkPipelineExecutablePropertiesKHR pProperties
    ) {
        try {
            return (int) HANDLE$vkGetPipelineExecutablePropertiesKHR.invokeExact(
                    device.segment(),
                    pPipelineInfo.segment(),
                    pExecutableCount.segment(),
                    (MemorySegment) (pProperties != null ? pProperties.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkGetPipelineExecutableStatisticsKHR.html">vkGetPipelineExecutableStatisticsKHR</a>
    public @enumtype(VkResult.class) int vkGetPipelineExecutableStatisticsKHR(
            VkDevice device,
            @pointer(target=VkPipelineExecutableInfoKHR.class) VkPipelineExecutableInfoKHR pExecutableInfo,
            @unsigned IntBuffer pStatisticCount,
            @nullable @pointer(target=VkPipelineExecutableStatisticKHR.class) VkPipelineExecutableStatisticKHR pStatistics
    ) {
        try {
            return (int) HANDLE$vkGetPipelineExecutableStatisticsKHR.invokeExact(
                    device.segment(),
                    pExecutableInfo.segment(),
                    pStatisticCount.segment(),
                    (MemorySegment) (pStatistics != null ? pStatistics.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkGetPipelineExecutableInternalRepresentationsKHR.html">vkGetPipelineExecutableInternalRepresentationsKHR</a>
    public @enumtype(VkResult.class) int vkGetPipelineExecutableInternalRepresentationsKHR(
            VkDevice device,
            @pointer(target=VkPipelineExecutableInfoKHR.class) VkPipelineExecutableInfoKHR pExecutableInfo,
            @unsigned IntBuffer pInternalRepresentationCount,
            @nullable @pointer(target=VkPipelineExecutableInternalRepresentationKHR.class) VkPipelineExecutableInternalRepresentationKHR pInternalRepresentations
    ) {
        try {
            return (int) HANDLE$vkGetPipelineExecutableInternalRepresentationsKHR.invokeExact(
                    device.segment(),
                    pExecutableInfo.segment(),
                    pInternalRepresentationCount.segment(),
                    (MemorySegment) (pInternalRepresentations != null ? pInternalRepresentations.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdSetLineStippleKHR.html">vkCmdSetLineStippleKHR</a>
    public void vkCmdSetLineStippleKHR(
            VkCommandBuffer commandBuffer,
            @unsigned int lineStippleFactor,
            @unsigned short lineStipplePattern
    ) {
        try {
            HANDLE$vkCmdSetLineStippleKHR.invokeExact(
                    commandBuffer.segment(),
                    lineStippleFactor,
                    lineStipplePattern
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCreateAccelerationStructureKHR.html">vkCreateAccelerationStructureKHR</a>
    public @enumtype(VkResult.class) int vkCreateAccelerationStructureKHR(
            VkDevice device,
            @pointer(target=VkAccelerationStructureCreateInfoKHR.class) VkAccelerationStructureCreateInfoKHR pCreateInfo,
            @nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator,
            @pointer(target=VkAccelerationStructureKHR.class) VkAccelerationStructureKHR.Buffer pAccelerationStructure
    ) {
        try {
            return (int) HANDLE$vkCreateAccelerationStructureKHR.invokeExact(
                    device.segment(),
                    pCreateInfo.segment(),
                    (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL),
                    pAccelerationStructure.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdBuildAccelerationStructuresKHR.html">vkCmdBuildAccelerationStructuresKHR</a>
    public void vkCmdBuildAccelerationStructuresKHR(
            VkCommandBuffer commandBuffer,
            @unsigned int infoCount,
            @pointer(target=VkAccelerationStructureBuildGeometryInfoKHR.class) VkAccelerationStructureBuildGeometryInfoKHR pInfos,
            @pointer(comment="struct VkAccelerationStructureBuildRangeInfoKHR const**") MemorySegment ppBuildRangeInfos
    ) {
        try {
            HANDLE$vkCmdBuildAccelerationStructuresKHR.invokeExact(
                    commandBuffer.segment(),
                    infoCount,
                    pInfos.segment(),
                    ppBuildRangeInfos
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdBuildAccelerationStructuresIndirectKHR.html">vkCmdBuildAccelerationStructuresIndirectKHR</a>
    public void vkCmdBuildAccelerationStructuresIndirectKHR(
            VkCommandBuffer commandBuffer,
            @unsigned int infoCount,
            @pointer(target=VkAccelerationStructureBuildGeometryInfoKHR.class) VkAccelerationStructureBuildGeometryInfoKHR pInfos,
            @unsigned LongBuffer pIndirectDeviceAddresses,
            @unsigned IntBuffer pIndirectStrides,
            @pointer(comment="uint32_t const**") MemorySegment ppMaxPrimitiveCounts
    ) {
        try {
            HANDLE$vkCmdBuildAccelerationStructuresIndirectKHR.invokeExact(
                    commandBuffer.segment(),
                    infoCount,
                    pInfos.segment(),
                    pIndirectDeviceAddresses.segment(),
                    pIndirectStrides.segment(),
                    ppMaxPrimitiveCounts
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkBuildAccelerationStructuresKHR.html">vkBuildAccelerationStructuresKHR</a>
    public @enumtype(VkResult.class) int vkBuildAccelerationStructuresKHR(
            VkDevice device,
            @nullable VkDeferredOperationKHR deferredOperation,
            @unsigned int infoCount,
            @pointer(target=VkAccelerationStructureBuildGeometryInfoKHR.class) VkAccelerationStructureBuildGeometryInfoKHR pInfos,
            @pointer(comment="struct VkAccelerationStructureBuildRangeInfoKHR const**") MemorySegment ppBuildRangeInfos
    ) {
        try {
            return (int) HANDLE$vkBuildAccelerationStructuresKHR.invokeExact(
                    device.segment(),
                    (MemorySegment) (deferredOperation != null ? deferredOperation.segment() : MemorySegment.NULL),
                    infoCount,
                    pInfos.segment(),
                    ppBuildRangeInfos
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkGetAccelerationStructureDeviceAddressKHR.html">vkGetAccelerationStructureDeviceAddressKHR</a>
    public @unsigned long vkGetAccelerationStructureDeviceAddressKHR(
            VkDevice device,
            @pointer(target=VkAccelerationStructureDeviceAddressInfoKHR.class) VkAccelerationStructureDeviceAddressInfoKHR pInfo
    ) {
        try {
            return (long) HANDLE$vkGetAccelerationStructureDeviceAddressKHR.invokeExact(
                    device.segment(),
                    pInfo.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCreateDeferredOperationKHR.html">vkCreateDeferredOperationKHR</a>
    public @enumtype(VkResult.class) int vkCreateDeferredOperationKHR(
            VkDevice device,
            @nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator,
            @pointer(target=VkDeferredOperationKHR.class) VkDeferredOperationKHR.Buffer pDeferredOperation
    ) {
        try {
            return (int) HANDLE$vkCreateDeferredOperationKHR.invokeExact(
                    device.segment(),
                    (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL),
                    pDeferredOperation.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkDestroyDeferredOperationKHR.html">vkDestroyDeferredOperationKHR</a>
    public void vkDestroyDeferredOperationKHR(
            VkDevice device,
            @nullable VkDeferredOperationKHR operation,
            @nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator
    ) {
        try {
            HANDLE$vkDestroyDeferredOperationKHR.invokeExact(
                    device.segment(),
                    (MemorySegment) (operation != null ? operation.segment() : MemorySegment.NULL),
                    (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkGetDeferredOperationMaxConcurrencyKHR.html">vkGetDeferredOperationMaxConcurrencyKHR</a>
    public @unsigned int vkGetDeferredOperationMaxConcurrencyKHR(
            VkDevice device,
            VkDeferredOperationKHR operation
    ) {
        try {
            return (int) HANDLE$vkGetDeferredOperationMaxConcurrencyKHR.invokeExact(
                    device.segment(),
                    operation.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkGetDeferredOperationResultKHR.html">vkGetDeferredOperationResultKHR</a>
    public @enumtype(VkResult.class) int vkGetDeferredOperationResultKHR(
            VkDevice device,
            VkDeferredOperationKHR operation
    ) {
        try {
            return (int) HANDLE$vkGetDeferredOperationResultKHR.invokeExact(
                    device.segment(),
                    operation.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkDeferredOperationJoinKHR.html">vkDeferredOperationJoinKHR</a>
    public @enumtype(VkResult.class) int vkDeferredOperationJoinKHR(
            VkDevice device,
            VkDeferredOperationKHR operation
    ) {
        try {
            return (int) HANDLE$vkDeferredOperationJoinKHR.invokeExact(
                    device.segment(),
                    operation.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkGetPipelineIndirectMemoryRequirementsNV.html">vkGetPipelineIndirectMemoryRequirementsNV</a>
    public void vkGetPipelineIndirectMemoryRequirementsNV(
            VkDevice device,
            @pointer(target=VkComputePipelineCreateInfo.class) VkComputePipelineCreateInfo pCreateInfo,
            @pointer(target=VkMemoryRequirements2.class) VkMemoryRequirements2 pMemoryRequirements
    ) {
        try {
            HANDLE$vkGetPipelineIndirectMemoryRequirementsNV.invokeExact(
                    device.segment(),
                    pCreateInfo.segment(),
                    pMemoryRequirements.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkGetPipelineIndirectDeviceAddressNV.html">vkGetPipelineIndirectDeviceAddressNV</a>
    public @unsigned long vkGetPipelineIndirectDeviceAddressNV(
            VkDevice device,
            @pointer(target=VkPipelineIndirectDeviceAddressInfoNV.class) VkPipelineIndirectDeviceAddressInfoNV pInfo
    ) {
        try {
            return (long) HANDLE$vkGetPipelineIndirectDeviceAddressNV.invokeExact(
                    device.segment(),
                    pInfo.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkAntiLagUpdateAMD.html">vkAntiLagUpdateAMD</a>
    public void vkAntiLagUpdateAMD(
            VkDevice device,
            @pointer(target=VkAntiLagDataAMD.class) VkAntiLagDataAMD pData
    ) {
        try {
            HANDLE$vkAntiLagUpdateAMD.invokeExact(
                    device.segment(),
                    pData.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdSetCullMode.html">vkCmdSetCullMode</a>
    public void vkCmdSetCullMode(
            VkCommandBuffer commandBuffer,
            @enumtype(VkCullModeFlags.class) int cullMode
    ) {
        try {
            HANDLE$vkCmdSetCullMode.invokeExact(
                    commandBuffer.segment(),
                    cullMode
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdSetFrontFace.html">vkCmdSetFrontFace</a>
    public void vkCmdSetFrontFace(
            VkCommandBuffer commandBuffer,
            @enumtype(VkFrontFace.class) int frontFace
    ) {
        try {
            HANDLE$vkCmdSetFrontFace.invokeExact(
                    commandBuffer.segment(),
                    frontFace
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdSetPrimitiveTopology.html">vkCmdSetPrimitiveTopology</a>
    public void vkCmdSetPrimitiveTopology(
            VkCommandBuffer commandBuffer,
            @enumtype(VkPrimitiveTopology.class) int primitiveTopology
    ) {
        try {
            HANDLE$vkCmdSetPrimitiveTopology.invokeExact(
                    commandBuffer.segment(),
                    primitiveTopology
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdSetViewportWithCount.html">vkCmdSetViewportWithCount</a>
    public void vkCmdSetViewportWithCount(
            VkCommandBuffer commandBuffer,
            @unsigned int viewportCount,
            @pointer(target=VkViewport.class) VkViewport pViewports
    ) {
        try {
            HANDLE$vkCmdSetViewportWithCount.invokeExact(
                    commandBuffer.segment(),
                    viewportCount,
                    pViewports.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdSetScissorWithCount.html">vkCmdSetScissorWithCount</a>
    public void vkCmdSetScissorWithCount(
            VkCommandBuffer commandBuffer,
            @unsigned int scissorCount,
            @pointer(target=VkRect2D.class) VkRect2D pScissors
    ) {
        try {
            HANDLE$vkCmdSetScissorWithCount.invokeExact(
                    commandBuffer.segment(),
                    scissorCount,
                    pScissors.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdBindIndexBuffer2KHR.html">vkCmdBindIndexBuffer2KHR</a>
    public void vkCmdBindIndexBuffer2KHR(
            VkCommandBuffer commandBuffer,
            @nullable VkBuffer buffer,
            @unsigned long offset,
            @unsigned long size,
            @enumtype(VkIndexType.class) int indexType
    ) {
        try {
            HANDLE$vkCmdBindIndexBuffer2KHR.invokeExact(
                    commandBuffer.segment(),
                    (MemorySegment) (buffer != null ? buffer.segment() : MemorySegment.NULL),
                    offset,
                    size,
                    indexType
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdBindVertexBuffers2.html">vkCmdBindVertexBuffers2</a>
    public void vkCmdBindVertexBuffers2(
            VkCommandBuffer commandBuffer,
            @unsigned int firstBinding,
            @unsigned int bindingCount,
            @pointer(target=VkBuffer.class) VkBuffer.Buffer pBuffers,
            @unsigned LongBuffer pOffsets,
            @nullable @unsigned LongBuffer pSizes,
            @nullable @unsigned LongBuffer pStrides
    ) {
        try {
            HANDLE$vkCmdBindVertexBuffers2.invokeExact(
                    commandBuffer.segment(),
                    firstBinding,
                    bindingCount,
                    pBuffers.segment(),
                    pOffsets.segment(),
                    (MemorySegment) (pSizes != null ? pSizes.segment() : MemorySegment.NULL),
                    (MemorySegment) (pStrides != null ? pStrides.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdSetDepthTestEnable.html">vkCmdSetDepthTestEnable</a>
    public void vkCmdSetDepthTestEnable(
            VkCommandBuffer commandBuffer,
            @unsigned int depthTestEnable
    ) {
        try {
            HANDLE$vkCmdSetDepthTestEnable.invokeExact(
                    commandBuffer.segment(),
                    depthTestEnable
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdSetDepthWriteEnable.html">vkCmdSetDepthWriteEnable</a>
    public void vkCmdSetDepthWriteEnable(
            VkCommandBuffer commandBuffer,
            @unsigned int depthWriteEnable
    ) {
        try {
            HANDLE$vkCmdSetDepthWriteEnable.invokeExact(
                    commandBuffer.segment(),
                    depthWriteEnable
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdSetDepthCompareOp.html">vkCmdSetDepthCompareOp</a>
    public void vkCmdSetDepthCompareOp(
            VkCommandBuffer commandBuffer,
            @enumtype(VkCompareOp.class) int depthCompareOp
    ) {
        try {
            HANDLE$vkCmdSetDepthCompareOp.invokeExact(
                    commandBuffer.segment(),
                    depthCompareOp
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdSetDepthBoundsTestEnable.html">vkCmdSetDepthBoundsTestEnable</a>
    public void vkCmdSetDepthBoundsTestEnable(
            VkCommandBuffer commandBuffer,
            @unsigned int depthBoundsTestEnable
    ) {
        try {
            HANDLE$vkCmdSetDepthBoundsTestEnable.invokeExact(
                    commandBuffer.segment(),
                    depthBoundsTestEnable
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdSetStencilTestEnable.html">vkCmdSetStencilTestEnable</a>
    public void vkCmdSetStencilTestEnable(
            VkCommandBuffer commandBuffer,
            @unsigned int stencilTestEnable
    ) {
        try {
            HANDLE$vkCmdSetStencilTestEnable.invokeExact(
                    commandBuffer.segment(),
                    stencilTestEnable
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdSetStencilOp.html">vkCmdSetStencilOp</a>
    public void vkCmdSetStencilOp(
            VkCommandBuffer commandBuffer,
            @enumtype(VkStencilFaceFlags.class) int faceMask,
            @enumtype(VkStencilOp.class) int failOp,
            @enumtype(VkStencilOp.class) int passOp,
            @enumtype(VkStencilOp.class) int depthFailOp,
            @enumtype(VkCompareOp.class) int compareOp
    ) {
        try {
            HANDLE$vkCmdSetStencilOp.invokeExact(
                    commandBuffer.segment(),
                    faceMask,
                    failOp,
                    passOp,
                    depthFailOp,
                    compareOp
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdSetPatchControlPointsEXT.html">vkCmdSetPatchControlPointsEXT</a>
    public void vkCmdSetPatchControlPointsEXT(
            VkCommandBuffer commandBuffer,
            @unsigned int patchControlPoints
    ) {
        try {
            HANDLE$vkCmdSetPatchControlPointsEXT.invokeExact(
                    commandBuffer.segment(),
                    patchControlPoints
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdSetRasterizerDiscardEnable.html">vkCmdSetRasterizerDiscardEnable</a>
    public void vkCmdSetRasterizerDiscardEnable(
            VkCommandBuffer commandBuffer,
            @unsigned int rasterizerDiscardEnable
    ) {
        try {
            HANDLE$vkCmdSetRasterizerDiscardEnable.invokeExact(
                    commandBuffer.segment(),
                    rasterizerDiscardEnable
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdSetDepthBiasEnable.html">vkCmdSetDepthBiasEnable</a>
    public void vkCmdSetDepthBiasEnable(
            VkCommandBuffer commandBuffer,
            @unsigned int depthBiasEnable
    ) {
        try {
            HANDLE$vkCmdSetDepthBiasEnable.invokeExact(
                    commandBuffer.segment(),
                    depthBiasEnable
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdSetLogicOpEXT.html">vkCmdSetLogicOpEXT</a>
    public void vkCmdSetLogicOpEXT(
            VkCommandBuffer commandBuffer,
            @enumtype(VkLogicOp.class) int logicOp
    ) {
        try {
            HANDLE$vkCmdSetLogicOpEXT.invokeExact(
                    commandBuffer.segment(),
                    logicOp
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdSetPrimitiveRestartEnable.html">vkCmdSetPrimitiveRestartEnable</a>
    public void vkCmdSetPrimitiveRestartEnable(
            VkCommandBuffer commandBuffer,
            @unsigned int primitiveRestartEnable
    ) {
        try {
            HANDLE$vkCmdSetPrimitiveRestartEnable.invokeExact(
                    commandBuffer.segment(),
                    primitiveRestartEnable
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdSetTessellationDomainOriginEXT.html">vkCmdSetTessellationDomainOriginEXT</a>
    public void vkCmdSetTessellationDomainOriginEXT(
            VkCommandBuffer commandBuffer,
            @enumtype(VkTessellationDomainOrigin.class) int domainOrigin
    ) {
        try {
            HANDLE$vkCmdSetTessellationDomainOriginEXT.invokeExact(
                    commandBuffer.segment(),
                    domainOrigin
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdSetDepthClampEnableEXT.html">vkCmdSetDepthClampEnableEXT</a>
    public void vkCmdSetDepthClampEnableEXT(
            VkCommandBuffer commandBuffer,
            @unsigned int depthClampEnable
    ) {
        try {
            HANDLE$vkCmdSetDepthClampEnableEXT.invokeExact(
                    commandBuffer.segment(),
                    depthClampEnable
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdSetPolygonModeEXT.html">vkCmdSetPolygonModeEXT</a>
    public void vkCmdSetPolygonModeEXT(
            VkCommandBuffer commandBuffer,
            @enumtype(VkPolygonMode.class) int polygonMode
    ) {
        try {
            HANDLE$vkCmdSetPolygonModeEXT.invokeExact(
                    commandBuffer.segment(),
                    polygonMode
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdSetRasterizationSamplesEXT.html">vkCmdSetRasterizationSamplesEXT</a>
    public void vkCmdSetRasterizationSamplesEXT(
            VkCommandBuffer commandBuffer,
            @enumtype(VkSampleCountFlags.class) int rasterizationSamples
    ) {
        try {
            HANDLE$vkCmdSetRasterizationSamplesEXT.invokeExact(
                    commandBuffer.segment(),
                    rasterizationSamples
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdSetSampleMaskEXT.html">vkCmdSetSampleMaskEXT</a>
    public void vkCmdSetSampleMaskEXT(
            VkCommandBuffer commandBuffer,
            @enumtype(VkSampleCountFlags.class) int samples,
            @unsigned IntBuffer pSampleMask
    ) {
        try {
            HANDLE$vkCmdSetSampleMaskEXT.invokeExact(
                    commandBuffer.segment(),
                    samples,
                    pSampleMask.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdSetAlphaToCoverageEnableEXT.html">vkCmdSetAlphaToCoverageEnableEXT</a>
    public void vkCmdSetAlphaToCoverageEnableEXT(
            VkCommandBuffer commandBuffer,
            @unsigned int alphaToCoverageEnable
    ) {
        try {
            HANDLE$vkCmdSetAlphaToCoverageEnableEXT.invokeExact(
                    commandBuffer.segment(),
                    alphaToCoverageEnable
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdSetAlphaToOneEnableEXT.html">vkCmdSetAlphaToOneEnableEXT</a>
    public void vkCmdSetAlphaToOneEnableEXT(
            VkCommandBuffer commandBuffer,
            @unsigned int alphaToOneEnable
    ) {
        try {
            HANDLE$vkCmdSetAlphaToOneEnableEXT.invokeExact(
                    commandBuffer.segment(),
                    alphaToOneEnable
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdSetLogicOpEnableEXT.html">vkCmdSetLogicOpEnableEXT</a>
    public void vkCmdSetLogicOpEnableEXT(
            VkCommandBuffer commandBuffer,
            @unsigned int logicOpEnable
    ) {
        try {
            HANDLE$vkCmdSetLogicOpEnableEXT.invokeExact(
                    commandBuffer.segment(),
                    logicOpEnable
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdSetColorBlendEnableEXT.html">vkCmdSetColorBlendEnableEXT</a>
    public void vkCmdSetColorBlendEnableEXT(
            VkCommandBuffer commandBuffer,
            @unsigned int firstAttachment,
            @unsigned int attachmentCount,
            @unsigned IntBuffer pColorBlendEnables
    ) {
        try {
            HANDLE$vkCmdSetColorBlendEnableEXT.invokeExact(
                    commandBuffer.segment(),
                    firstAttachment,
                    attachmentCount,
                    pColorBlendEnables.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdSetColorBlendEquationEXT.html">vkCmdSetColorBlendEquationEXT</a>
    public void vkCmdSetColorBlendEquationEXT(
            VkCommandBuffer commandBuffer,
            @unsigned int firstAttachment,
            @unsigned int attachmentCount,
            @pointer(target=VkColorBlendEquationEXT.class) VkColorBlendEquationEXT pColorBlendEquations
    ) {
        try {
            HANDLE$vkCmdSetColorBlendEquationEXT.invokeExact(
                    commandBuffer.segment(),
                    firstAttachment,
                    attachmentCount,
                    pColorBlendEquations.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdSetColorWriteMaskEXT.html">vkCmdSetColorWriteMaskEXT</a>
    public void vkCmdSetColorWriteMaskEXT(
            VkCommandBuffer commandBuffer,
            @unsigned int firstAttachment,
            @unsigned int attachmentCount,
            @enumtype(VkColorComponentFlags.class) IntBuffer pColorWriteMasks
    ) {
        try {
            HANDLE$vkCmdSetColorWriteMaskEXT.invokeExact(
                    commandBuffer.segment(),
                    firstAttachment,
                    attachmentCount,
                    pColorWriteMasks.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdSetRasterizationStreamEXT.html">vkCmdSetRasterizationStreamEXT</a>
    public void vkCmdSetRasterizationStreamEXT(
            VkCommandBuffer commandBuffer,
            @unsigned int rasterizationStream
    ) {
        try {
            HANDLE$vkCmdSetRasterizationStreamEXT.invokeExact(
                    commandBuffer.segment(),
                    rasterizationStream
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdSetConservativeRasterizationModeEXT.html">vkCmdSetConservativeRasterizationModeEXT</a>
    public void vkCmdSetConservativeRasterizationModeEXT(
            VkCommandBuffer commandBuffer,
            @enumtype(VkConservativeRasterizationModeEXT.class) int conservativeRasterizationMode
    ) {
        try {
            HANDLE$vkCmdSetConservativeRasterizationModeEXT.invokeExact(
                    commandBuffer.segment(),
                    conservativeRasterizationMode
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdSetExtraPrimitiveOverestimationSizeEXT.html">vkCmdSetExtraPrimitiveOverestimationSizeEXT</a>
    public void vkCmdSetExtraPrimitiveOverestimationSizeEXT(
            VkCommandBuffer commandBuffer,
            float extraPrimitiveOverestimationSize
    ) {
        try {
            HANDLE$vkCmdSetExtraPrimitiveOverestimationSizeEXT.invokeExact(
                    commandBuffer.segment(),
                    extraPrimitiveOverestimationSize
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdSetDepthClipEnableEXT.html">vkCmdSetDepthClipEnableEXT</a>
    public void vkCmdSetDepthClipEnableEXT(
            VkCommandBuffer commandBuffer,
            @unsigned int depthClipEnable
    ) {
        try {
            HANDLE$vkCmdSetDepthClipEnableEXT.invokeExact(
                    commandBuffer.segment(),
                    depthClipEnable
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdSetSampleLocationsEnableEXT.html">vkCmdSetSampleLocationsEnableEXT</a>
    public void vkCmdSetSampleLocationsEnableEXT(
            VkCommandBuffer commandBuffer,
            @unsigned int sampleLocationsEnable
    ) {
        try {
            HANDLE$vkCmdSetSampleLocationsEnableEXT.invokeExact(
                    commandBuffer.segment(),
                    sampleLocationsEnable
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdSetColorBlendAdvancedEXT.html">vkCmdSetColorBlendAdvancedEXT</a>
    public void vkCmdSetColorBlendAdvancedEXT(
            VkCommandBuffer commandBuffer,
            @unsigned int firstAttachment,
            @unsigned int attachmentCount,
            @pointer(target=VkColorBlendAdvancedEXT.class) VkColorBlendAdvancedEXT pColorBlendAdvanced
    ) {
        try {
            HANDLE$vkCmdSetColorBlendAdvancedEXT.invokeExact(
                    commandBuffer.segment(),
                    firstAttachment,
                    attachmentCount,
                    pColorBlendAdvanced.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdSetProvokingVertexModeEXT.html">vkCmdSetProvokingVertexModeEXT</a>
    public void vkCmdSetProvokingVertexModeEXT(
            VkCommandBuffer commandBuffer,
            @enumtype(VkProvokingVertexModeEXT.class) int provokingVertexMode
    ) {
        try {
            HANDLE$vkCmdSetProvokingVertexModeEXT.invokeExact(
                    commandBuffer.segment(),
                    provokingVertexMode
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdSetLineRasterizationModeEXT.html">vkCmdSetLineRasterizationModeEXT</a>
    public void vkCmdSetLineRasterizationModeEXT(
            VkCommandBuffer commandBuffer,
            @enumtype(VkLineRasterizationModeKHR.class) int lineRasterizationMode
    ) {
        try {
            HANDLE$vkCmdSetLineRasterizationModeEXT.invokeExact(
                    commandBuffer.segment(),
                    lineRasterizationMode
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdSetLineStippleEnableEXT.html">vkCmdSetLineStippleEnableEXT</a>
    public void vkCmdSetLineStippleEnableEXT(
            VkCommandBuffer commandBuffer,
            @unsigned int stippledLineEnable
    ) {
        try {
            HANDLE$vkCmdSetLineStippleEnableEXT.invokeExact(
                    commandBuffer.segment(),
                    stippledLineEnable
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdSetDepthClipNegativeOneToOneEXT.html">vkCmdSetDepthClipNegativeOneToOneEXT</a>
    public void vkCmdSetDepthClipNegativeOneToOneEXT(
            VkCommandBuffer commandBuffer,
            @unsigned int negativeOneToOne
    ) {
        try {
            HANDLE$vkCmdSetDepthClipNegativeOneToOneEXT.invokeExact(
                    commandBuffer.segment(),
                    negativeOneToOne
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdSetViewportWScalingEnableNV.html">vkCmdSetViewportWScalingEnableNV</a>
    public void vkCmdSetViewportWScalingEnableNV(
            VkCommandBuffer commandBuffer,
            @unsigned int viewportWScalingEnable
    ) {
        try {
            HANDLE$vkCmdSetViewportWScalingEnableNV.invokeExact(
                    commandBuffer.segment(),
                    viewportWScalingEnable
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdSetViewportSwizzleNV.html">vkCmdSetViewportSwizzleNV</a>
    public void vkCmdSetViewportSwizzleNV(
            VkCommandBuffer commandBuffer,
            @unsigned int firstViewport,
            @unsigned int viewportCount,
            @pointer(target=VkViewportSwizzleNV.class) VkViewportSwizzleNV pViewportSwizzles
    ) {
        try {
            HANDLE$vkCmdSetViewportSwizzleNV.invokeExact(
                    commandBuffer.segment(),
                    firstViewport,
                    viewportCount,
                    pViewportSwizzles.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdSetCoverageToColorEnableNV.html">vkCmdSetCoverageToColorEnableNV</a>
    public void vkCmdSetCoverageToColorEnableNV(
            VkCommandBuffer commandBuffer,
            @unsigned int coverageToColorEnable
    ) {
        try {
            HANDLE$vkCmdSetCoverageToColorEnableNV.invokeExact(
                    commandBuffer.segment(),
                    coverageToColorEnable
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdSetCoverageToColorLocationNV.html">vkCmdSetCoverageToColorLocationNV</a>
    public void vkCmdSetCoverageToColorLocationNV(
            VkCommandBuffer commandBuffer,
            @unsigned int coverageToColorLocation
    ) {
        try {
            HANDLE$vkCmdSetCoverageToColorLocationNV.invokeExact(
                    commandBuffer.segment(),
                    coverageToColorLocation
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdSetCoverageModulationModeNV.html">vkCmdSetCoverageModulationModeNV</a>
    public void vkCmdSetCoverageModulationModeNV(
            VkCommandBuffer commandBuffer,
            @enumtype(VkCoverageModulationModeNV.class) int coverageModulationMode
    ) {
        try {
            HANDLE$vkCmdSetCoverageModulationModeNV.invokeExact(
                    commandBuffer.segment(),
                    coverageModulationMode
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdSetCoverageModulationTableEnableNV.html">vkCmdSetCoverageModulationTableEnableNV</a>
    public void vkCmdSetCoverageModulationTableEnableNV(
            VkCommandBuffer commandBuffer,
            @unsigned int coverageModulationTableEnable
    ) {
        try {
            HANDLE$vkCmdSetCoverageModulationTableEnableNV.invokeExact(
                    commandBuffer.segment(),
                    coverageModulationTableEnable
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdSetCoverageModulationTableNV.html">vkCmdSetCoverageModulationTableNV</a>
    public void vkCmdSetCoverageModulationTableNV(
            VkCommandBuffer commandBuffer,
            @unsigned int coverageModulationTableCount,
            FloatBuffer pCoverageModulationTable
    ) {
        try {
            HANDLE$vkCmdSetCoverageModulationTableNV.invokeExact(
                    commandBuffer.segment(),
                    coverageModulationTableCount,
                    pCoverageModulationTable.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdSetShadingRateImageEnableNV.html">vkCmdSetShadingRateImageEnableNV</a>
    public void vkCmdSetShadingRateImageEnableNV(
            VkCommandBuffer commandBuffer,
            @unsigned int shadingRateImageEnable
    ) {
        try {
            HANDLE$vkCmdSetShadingRateImageEnableNV.invokeExact(
                    commandBuffer.segment(),
                    shadingRateImageEnable
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdSetCoverageReductionModeNV.html">vkCmdSetCoverageReductionModeNV</a>
    public void vkCmdSetCoverageReductionModeNV(
            VkCommandBuffer commandBuffer,
            @enumtype(VkCoverageReductionModeNV.class) int coverageReductionMode
    ) {
        try {
            HANDLE$vkCmdSetCoverageReductionModeNV.invokeExact(
                    commandBuffer.segment(),
                    coverageReductionMode
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdSetRepresentativeFragmentTestEnableNV.html">vkCmdSetRepresentativeFragmentTestEnableNV</a>
    public void vkCmdSetRepresentativeFragmentTestEnableNV(
            VkCommandBuffer commandBuffer,
            @unsigned int representativeFragmentTestEnable
    ) {
        try {
            HANDLE$vkCmdSetRepresentativeFragmentTestEnableNV.invokeExact(
                    commandBuffer.segment(),
                    representativeFragmentTestEnable
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCreatePrivateDataSlot.html">vkCreatePrivateDataSlot</a>
    public @enumtype(VkResult.class) int vkCreatePrivateDataSlot(
            VkDevice device,
            @pointer(target=VkPrivateDataSlotCreateInfo.class) VkPrivateDataSlotCreateInfo pCreateInfo,
            @nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator,
            @pointer(target=VkPrivateDataSlot.class) VkPrivateDataSlot.Buffer pPrivateDataSlot
    ) {
        try {
            return (int) HANDLE$vkCreatePrivateDataSlot.invokeExact(
                    device.segment(),
                    pCreateInfo.segment(),
                    (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL),
                    pPrivateDataSlot.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkDestroyPrivateDataSlot.html">vkDestroyPrivateDataSlot</a>
    public void vkDestroyPrivateDataSlot(
            VkDevice device,
            @nullable VkPrivateDataSlot privateDataSlot,
            @nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator
    ) {
        try {
            HANDLE$vkDestroyPrivateDataSlot.invokeExact(
                    device.segment(),
                    (MemorySegment) (privateDataSlot != null ? privateDataSlot.segment() : MemorySegment.NULL),
                    (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkSetPrivateData.html">vkSetPrivateData</a>
    public @enumtype(VkResult.class) int vkSetPrivateData(
            VkDevice device,
            @enumtype(VkObjectType.class) int objectType,
            @unsigned long objectHandle,
            VkPrivateDataSlot privateDataSlot,
            @unsigned long data
    ) {
        try {
            return (int) HANDLE$vkSetPrivateData.invokeExact(
                    device.segment(),
                    objectType,
                    objectHandle,
                    privateDataSlot.segment(),
                    data
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkGetPrivateData.html">vkGetPrivateData</a>
    public void vkGetPrivateData(
            VkDevice device,
            @enumtype(VkObjectType.class) int objectType,
            @unsigned long objectHandle,
            VkPrivateDataSlot privateDataSlot,
            @unsigned LongBuffer pData
    ) {
        try {
            HANDLE$vkGetPrivateData.invokeExact(
                    device.segment(),
                    objectType,
                    objectHandle,
                    privateDataSlot.segment(),
                    pData.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdCopyBuffer2.html">vkCmdCopyBuffer2</a>
    public void vkCmdCopyBuffer2(
            VkCommandBuffer commandBuffer,
            @pointer(target=VkCopyBufferInfo2.class) VkCopyBufferInfo2 pCopyBufferInfo
    ) {
        try {
            HANDLE$vkCmdCopyBuffer2.invokeExact(
                    commandBuffer.segment(),
                    pCopyBufferInfo.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdCopyImage2.html">vkCmdCopyImage2</a>
    public void vkCmdCopyImage2(
            VkCommandBuffer commandBuffer,
            @pointer(target=VkCopyImageInfo2.class) VkCopyImageInfo2 pCopyImageInfo
    ) {
        try {
            HANDLE$vkCmdCopyImage2.invokeExact(
                    commandBuffer.segment(),
                    pCopyImageInfo.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdBlitImage2.html">vkCmdBlitImage2</a>
    public void vkCmdBlitImage2(
            VkCommandBuffer commandBuffer,
            @pointer(target=VkBlitImageInfo2.class) VkBlitImageInfo2 pBlitImageInfo
    ) {
        try {
            HANDLE$vkCmdBlitImage2.invokeExact(
                    commandBuffer.segment(),
                    pBlitImageInfo.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdCopyBufferToImage2.html">vkCmdCopyBufferToImage2</a>
    public void vkCmdCopyBufferToImage2(
            VkCommandBuffer commandBuffer,
            @pointer(target=VkCopyBufferToImageInfo2.class) VkCopyBufferToImageInfo2 pCopyBufferToImageInfo
    ) {
        try {
            HANDLE$vkCmdCopyBufferToImage2.invokeExact(
                    commandBuffer.segment(),
                    pCopyBufferToImageInfo.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdCopyImageToBuffer2.html">vkCmdCopyImageToBuffer2</a>
    public void vkCmdCopyImageToBuffer2(
            VkCommandBuffer commandBuffer,
            @pointer(target=VkCopyImageToBufferInfo2.class) VkCopyImageToBufferInfo2 pCopyImageToBufferInfo
    ) {
        try {
            HANDLE$vkCmdCopyImageToBuffer2.invokeExact(
                    commandBuffer.segment(),
                    pCopyImageToBufferInfo.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdResolveImage2.html">vkCmdResolveImage2</a>
    public void vkCmdResolveImage2(
            VkCommandBuffer commandBuffer,
            @pointer(target=VkResolveImageInfo2.class) VkResolveImageInfo2 pResolveImageInfo
    ) {
        try {
            HANDLE$vkCmdResolveImage2.invokeExact(
                    commandBuffer.segment(),
                    pResolveImageInfo.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdRefreshObjectsKHR.html">vkCmdRefreshObjectsKHR</a>
    public void vkCmdRefreshObjectsKHR(
            VkCommandBuffer commandBuffer,
            @pointer(target=VkRefreshObjectListKHR.class) VkRefreshObjectListKHR pRefreshObjects
    ) {
        try {
            HANDLE$vkCmdRefreshObjectsKHR.invokeExact(
                    commandBuffer.segment(),
                    pRefreshObjects.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkGetPhysicalDeviceRefreshableObjectTypesKHR.html">vkGetPhysicalDeviceRefreshableObjectTypesKHR</a>
    public @enumtype(VkResult.class) int vkGetPhysicalDeviceRefreshableObjectTypesKHR(
            VkPhysicalDevice physicalDevice,
            @unsigned IntBuffer pRefreshableObjectTypeCount,
            @nullable @enumtype(VkObjectType.class) IntBuffer pRefreshableObjectTypes
    ) {
        try {
            return (int) HANDLE$vkGetPhysicalDeviceRefreshableObjectTypesKHR.invokeExact(
                    physicalDevice.segment(),
                    pRefreshableObjectTypeCount.segment(),
                    (MemorySegment) (pRefreshableObjectTypes != null ? pRefreshableObjectTypes.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdSetFragmentShadingRateKHR.html">vkCmdSetFragmentShadingRateKHR</a>
    public void vkCmdSetFragmentShadingRateKHR(
            VkCommandBuffer commandBuffer,
            @pointer(target=VkExtent2D.class) VkExtent2D pFragmentSize,
            @enumtype(VkFragmentShadingRateCombinerOpKHR.class) IntBuffer combinerOps
    ) {
        try {
            HANDLE$vkCmdSetFragmentShadingRateKHR.invokeExact(
                    commandBuffer.segment(),
                    pFragmentSize.segment(),
                    combinerOps.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkGetPhysicalDeviceFragmentShadingRatesKHR.html">vkGetPhysicalDeviceFragmentShadingRatesKHR</a>
    public @enumtype(VkResult.class) int vkGetPhysicalDeviceFragmentShadingRatesKHR(
            VkPhysicalDevice physicalDevice,
            @unsigned IntBuffer pFragmentShadingRateCount,
            @nullable @pointer(target=VkPhysicalDeviceFragmentShadingRateKHR.class) VkPhysicalDeviceFragmentShadingRateKHR pFragmentShadingRates
    ) {
        try {
            return (int) HANDLE$vkGetPhysicalDeviceFragmentShadingRatesKHR.invokeExact(
                    physicalDevice.segment(),
                    pFragmentShadingRateCount.segment(),
                    (MemorySegment) (pFragmentShadingRates != null ? pFragmentShadingRates.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdSetFragmentShadingRateEnumNV.html">vkCmdSetFragmentShadingRateEnumNV</a>
    public void vkCmdSetFragmentShadingRateEnumNV(
            VkCommandBuffer commandBuffer,
            @enumtype(VkFragmentShadingRateNV.class) int shadingRate,
            @enumtype(VkFragmentShadingRateCombinerOpKHR.class) IntBuffer combinerOps
    ) {
        try {
            HANDLE$vkCmdSetFragmentShadingRateEnumNV.invokeExact(
                    commandBuffer.segment(),
                    shadingRate,
                    combinerOps.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkGetAccelerationStructureBuildSizesKHR.html">vkGetAccelerationStructureBuildSizesKHR</a>
    public void vkGetAccelerationStructureBuildSizesKHR(
            VkDevice device,
            @enumtype(VkAccelerationStructureBuildTypeKHR.class) int buildType,
            @pointer(target=VkAccelerationStructureBuildGeometryInfoKHR.class) VkAccelerationStructureBuildGeometryInfoKHR pBuildInfo,
            @nullable @unsigned IntBuffer pMaxPrimitiveCounts,
            @pointer(target=VkAccelerationStructureBuildSizesInfoKHR.class) VkAccelerationStructureBuildSizesInfoKHR pSizeInfo
    ) {
        try {
            HANDLE$vkGetAccelerationStructureBuildSizesKHR.invokeExact(
                    device.segment(),
                    buildType,
                    pBuildInfo.segment(),
                    (MemorySegment) (pMaxPrimitiveCounts != null ? pMaxPrimitiveCounts.segment() : MemorySegment.NULL),
                    pSizeInfo.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdSetVertexInputEXT.html">vkCmdSetVertexInputEXT</a>
    public void vkCmdSetVertexInputEXT(
            VkCommandBuffer commandBuffer,
            @unsigned int vertexBindingDescriptionCount,
            @nullable @pointer(target=VkVertexInputBindingDescription2EXT.class) VkVertexInputBindingDescription2EXT pVertexBindingDescriptions,
            @unsigned int vertexAttributeDescriptionCount,
            @nullable @pointer(target=VkVertexInputAttributeDescription2EXT.class) VkVertexInputAttributeDescription2EXT pVertexAttributeDescriptions
    ) {
        try {
            HANDLE$vkCmdSetVertexInputEXT.invokeExact(
                    commandBuffer.segment(),
                    vertexBindingDescriptionCount,
                    (MemorySegment) (pVertexBindingDescriptions != null ? pVertexBindingDescriptions.segment() : MemorySegment.NULL),
                    vertexAttributeDescriptionCount,
                    (MemorySegment) (pVertexAttributeDescriptions != null ? pVertexAttributeDescriptions.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdSetColorWriteEnableEXT.html">vkCmdSetColorWriteEnableEXT</a>
    public void vkCmdSetColorWriteEnableEXT(
            VkCommandBuffer commandBuffer,
            @unsigned int attachmentCount,
            @unsigned IntBuffer pColorWriteEnables
    ) {
        try {
            HANDLE$vkCmdSetColorWriteEnableEXT.invokeExact(
                    commandBuffer.segment(),
                    attachmentCount,
                    pColorWriteEnables.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdSetEvent2.html">vkCmdSetEvent2</a>
    public void vkCmdSetEvent2(
            VkCommandBuffer commandBuffer,
            VkEvent event,
            @pointer(target=VkDependencyInfo.class) VkDependencyInfo pDependencyInfo
    ) {
        try {
            HANDLE$vkCmdSetEvent2.invokeExact(
                    commandBuffer.segment(),
                    event.segment(),
                    pDependencyInfo.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdResetEvent2.html">vkCmdResetEvent2</a>
    public void vkCmdResetEvent2(
            VkCommandBuffer commandBuffer,
            VkEvent event,
            @enumtype(VkPipelineStageFlags2.class) long stageMask
    ) {
        try {
            HANDLE$vkCmdResetEvent2.invokeExact(
                    commandBuffer.segment(),
                    event.segment(),
                    stageMask
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdWaitEvents2.html">vkCmdWaitEvents2</a>
    public void vkCmdWaitEvents2(
            VkCommandBuffer commandBuffer,
            @unsigned int eventCount,
            @pointer(target=VkEvent.class) VkEvent.Buffer pEvents,
            @pointer(target=VkDependencyInfo.class) VkDependencyInfo pDependencyInfos
    ) {
        try {
            HANDLE$vkCmdWaitEvents2.invokeExact(
                    commandBuffer.segment(),
                    eventCount,
                    pEvents.segment(),
                    pDependencyInfos.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdPipelineBarrier2.html">vkCmdPipelineBarrier2</a>
    public void vkCmdPipelineBarrier2(
            VkCommandBuffer commandBuffer,
            @pointer(target=VkDependencyInfo.class) VkDependencyInfo pDependencyInfo
    ) {
        try {
            HANDLE$vkCmdPipelineBarrier2.invokeExact(
                    commandBuffer.segment(),
                    pDependencyInfo.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkQueueSubmit2.html">vkQueueSubmit2</a>
    public @enumtype(VkResult.class) int vkQueueSubmit2(
            VkQueue queue,
            @unsigned int submitCount,
            @nullable @pointer(target=VkSubmitInfo2.class) VkSubmitInfo2 pSubmits,
            @nullable VkFence fence
    ) {
        try {
            return (int) HANDLE$vkQueueSubmit2.invokeExact(
                    queue.segment(),
                    submitCount,
                    (MemorySegment) (pSubmits != null ? pSubmits.segment() : MemorySegment.NULL),
                    (MemorySegment) (fence != null ? fence.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdWriteTimestamp2.html">vkCmdWriteTimestamp2</a>
    public void vkCmdWriteTimestamp2(
            VkCommandBuffer commandBuffer,
            @enumtype(VkPipelineStageFlags2.class) long stage,
            VkQueryPool queryPool,
            @unsigned int query
    ) {
        try {
            HANDLE$vkCmdWriteTimestamp2.invokeExact(
                    commandBuffer.segment(),
                    stage,
                    queryPool.segment(),
                    query
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdWriteBufferMarker2AMD.html">vkCmdWriteBufferMarker2AMD</a>
    public void vkCmdWriteBufferMarker2AMD(
            VkCommandBuffer commandBuffer,
            @enumtype(VkPipelineStageFlags2.class) long stage,
            VkBuffer dstBuffer,
            @unsigned long dstOffset,
            @unsigned int marker
    ) {
        try {
            HANDLE$vkCmdWriteBufferMarker2AMD.invokeExact(
                    commandBuffer.segment(),
                    stage,
                    dstBuffer.segment(),
                    dstOffset,
                    marker
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkGetQueueCheckpointData2NV.html">vkGetQueueCheckpointData2NV</a>
    public void vkGetQueueCheckpointData2NV(
            VkQueue queue,
            @unsigned IntBuffer pCheckpointDataCount,
            @nullable @pointer(target=VkCheckpointData2NV.class) VkCheckpointData2NV pCheckpointData
    ) {
        try {
            HANDLE$vkGetQueueCheckpointData2NV.invokeExact(
                    queue.segment(),
                    pCheckpointDataCount.segment(),
                    (MemorySegment) (pCheckpointData != null ? pCheckpointData.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCopyMemoryToImageEXT.html">vkCopyMemoryToImageEXT</a>
    public @enumtype(VkResult.class) int vkCopyMemoryToImageEXT(
            VkDevice device,
            @pointer(target=VkCopyMemoryToImageInfoEXT.class) VkCopyMemoryToImageInfoEXT pCopyMemoryToImageInfo
    ) {
        try {
            return (int) HANDLE$vkCopyMemoryToImageEXT.invokeExact(
                    device.segment(),
                    pCopyMemoryToImageInfo.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCopyImageToMemoryEXT.html">vkCopyImageToMemoryEXT</a>
    public @enumtype(VkResult.class) int vkCopyImageToMemoryEXT(
            VkDevice device,
            @pointer(target=VkCopyImageToMemoryInfoEXT.class) VkCopyImageToMemoryInfoEXT pCopyImageToMemoryInfo
    ) {
        try {
            return (int) HANDLE$vkCopyImageToMemoryEXT.invokeExact(
                    device.segment(),
                    pCopyImageToMemoryInfo.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCopyImageToImageEXT.html">vkCopyImageToImageEXT</a>
    public @enumtype(VkResult.class) int vkCopyImageToImageEXT(
            VkDevice device,
            @pointer(target=VkCopyImageToImageInfoEXT.class) VkCopyImageToImageInfoEXT pCopyImageToImageInfo
    ) {
        try {
            return (int) HANDLE$vkCopyImageToImageEXT.invokeExact(
                    device.segment(),
                    pCopyImageToImageInfo.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkTransitionImageLayoutEXT.html">vkTransitionImageLayoutEXT</a>
    public @enumtype(VkResult.class) int vkTransitionImageLayoutEXT(
            VkDevice device,
            @unsigned int transitionCount,
            @pointer(target=VkHostImageLayoutTransitionInfoEXT.class) VkHostImageLayoutTransitionInfoEXT pTransitions
    ) {
        try {
            return (int) HANDLE$vkTransitionImageLayoutEXT.invokeExact(
                    device.segment(),
                    transitionCount,
                    pTransitions.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdDecompressMemoryNV.html">vkCmdDecompressMemoryNV</a>
    public void vkCmdDecompressMemoryNV(
            VkCommandBuffer commandBuffer,
            @unsigned int decompressRegionCount,
            @pointer(target=VkDecompressMemoryRegionNV.class) VkDecompressMemoryRegionNV pDecompressMemoryRegions
    ) {
        try {
            HANDLE$vkCmdDecompressMemoryNV.invokeExact(
                    commandBuffer.segment(),
                    decompressRegionCount,
                    pDecompressMemoryRegions.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdDecompressMemoryIndirectCountNV.html">vkCmdDecompressMemoryIndirectCountNV</a>
    public void vkCmdDecompressMemoryIndirectCountNV(
            VkCommandBuffer commandBuffer,
            @unsigned long indirectCommandsAddress,
            @unsigned long indirectCommandsCountAddress,
            @unsigned int stride
    ) {
        try {
            HANDLE$vkCmdDecompressMemoryIndirectCountNV.invokeExact(
                    commandBuffer.segment(),
                    indirectCommandsAddress,
                    indirectCommandsCountAddress,
                    stride
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCreateCuModuleNVX.html">vkCreateCuModuleNVX</a>
    public @enumtype(VkResult.class) int vkCreateCuModuleNVX(
            VkDevice device,
            @pointer(target=VkCuModuleCreateInfoNVX.class) VkCuModuleCreateInfoNVX pCreateInfo,
            @nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator,
            @pointer(target=VkCuModuleNVX.class) VkCuModuleNVX.Buffer pModule
    ) {
        try {
            return (int) HANDLE$vkCreateCuModuleNVX.invokeExact(
                    device.segment(),
                    pCreateInfo.segment(),
                    (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL),
                    pModule.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCreateCuFunctionNVX.html">vkCreateCuFunctionNVX</a>
    public @enumtype(VkResult.class) int vkCreateCuFunctionNVX(
            VkDevice device,
            @pointer(target=VkCuFunctionCreateInfoNVX.class) VkCuFunctionCreateInfoNVX pCreateInfo,
            @nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator,
            @pointer(target=VkCuFunctionNVX.class) VkCuFunctionNVX.Buffer pFunction
    ) {
        try {
            return (int) HANDLE$vkCreateCuFunctionNVX.invokeExact(
                    device.segment(),
                    pCreateInfo.segment(),
                    (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL),
                    pFunction.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkDestroyCuModuleNVX.html">vkDestroyCuModuleNVX</a>
    public void vkDestroyCuModuleNVX(
            VkDevice device,
            VkCuModuleNVX module,
            @nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator
    ) {
        try {
            HANDLE$vkDestroyCuModuleNVX.invokeExact(
                    device.segment(),
                    module.segment(),
                    (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkDestroyCuFunctionNVX.html">vkDestroyCuFunctionNVX</a>
    public void vkDestroyCuFunctionNVX(
            VkDevice device,
            VkCuFunctionNVX function,
            @nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator
    ) {
        try {
            HANDLE$vkDestroyCuFunctionNVX.invokeExact(
                    device.segment(),
                    function.segment(),
                    (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdCuLaunchKernelNVX.html">vkCmdCuLaunchKernelNVX</a>
    public void vkCmdCuLaunchKernelNVX(
            VkCommandBuffer commandBuffer,
            @pointer(target=VkCuLaunchInfoNVX.class) VkCuLaunchInfoNVX pLaunchInfo
    ) {
        try {
            HANDLE$vkCmdCuLaunchKernelNVX.invokeExact(
                    commandBuffer.segment(),
                    pLaunchInfo.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkGetDescriptorSetLayoutSizeEXT.html">vkGetDescriptorSetLayoutSizeEXT</a>
    public void vkGetDescriptorSetLayoutSizeEXT(
            VkDevice device,
            VkDescriptorSetLayout layout,
            @unsigned LongBuffer pLayoutSizeInBytes
    ) {
        try {
            HANDLE$vkGetDescriptorSetLayoutSizeEXT.invokeExact(
                    device.segment(),
                    layout.segment(),
                    pLayoutSizeInBytes.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkGetDescriptorSetLayoutBindingOffsetEXT.html">vkGetDescriptorSetLayoutBindingOffsetEXT</a>
    public void vkGetDescriptorSetLayoutBindingOffsetEXT(
            VkDevice device,
            VkDescriptorSetLayout layout,
            @unsigned int binding,
            @unsigned LongBuffer pOffset
    ) {
        try {
            HANDLE$vkGetDescriptorSetLayoutBindingOffsetEXT.invokeExact(
                    device.segment(),
                    layout.segment(),
                    binding,
                    pOffset.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkGetDescriptorEXT.html">vkGetDescriptorEXT</a>
    public void vkGetDescriptorEXT(
            VkDevice device,
            @pointer(target=VkDescriptorGetInfoEXT.class) VkDescriptorGetInfoEXT pDescriptorInfo,
            @unsigned long dataSize,
            @pointer(comment="void*") MemorySegment pDescriptor
    ) {
        try {
            HANDLE$vkGetDescriptorEXT.invokeExact(
                    device.segment(),
                    pDescriptorInfo.segment(),
                    dataSize,
                    pDescriptor
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdBindDescriptorBuffersEXT.html">vkCmdBindDescriptorBuffersEXT</a>
    public void vkCmdBindDescriptorBuffersEXT(
            VkCommandBuffer commandBuffer,
            @unsigned int bufferCount,
            @pointer(target=VkDescriptorBufferBindingInfoEXT.class) VkDescriptorBufferBindingInfoEXT pBindingInfos
    ) {
        try {
            HANDLE$vkCmdBindDescriptorBuffersEXT.invokeExact(
                    commandBuffer.segment(),
                    bufferCount,
                    pBindingInfos.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdSetDescriptorBufferOffsetsEXT.html">vkCmdSetDescriptorBufferOffsetsEXT</a>
    public void vkCmdSetDescriptorBufferOffsetsEXT(
            VkCommandBuffer commandBuffer,
            @enumtype(VkPipelineBindPoint.class) int pipelineBindPoint,
            VkPipelineLayout layout,
            @unsigned int firstSet,
            @unsigned int setCount,
            @unsigned IntBuffer pBufferIndices,
            @unsigned LongBuffer pOffsets
    ) {
        try {
            HANDLE$vkCmdSetDescriptorBufferOffsetsEXT.invokeExact(
                    commandBuffer.segment(),
                    pipelineBindPoint,
                    layout.segment(),
                    firstSet,
                    setCount,
                    pBufferIndices.segment(),
                    pOffsets.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdBindDescriptorBufferEmbeddedSamplersEXT.html">vkCmdBindDescriptorBufferEmbeddedSamplersEXT</a>
    public void vkCmdBindDescriptorBufferEmbeddedSamplersEXT(
            VkCommandBuffer commandBuffer,
            @enumtype(VkPipelineBindPoint.class) int pipelineBindPoint,
            VkPipelineLayout layout,
            @unsigned int set
    ) {
        try {
            HANDLE$vkCmdBindDescriptorBufferEmbeddedSamplersEXT.invokeExact(
                    commandBuffer.segment(),
                    pipelineBindPoint,
                    layout.segment(),
                    set
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkGetBufferOpaqueCaptureDescriptorDataEXT.html">vkGetBufferOpaqueCaptureDescriptorDataEXT</a>
    public @enumtype(VkResult.class) int vkGetBufferOpaqueCaptureDescriptorDataEXT(
            VkDevice device,
            @pointer(target=VkBufferCaptureDescriptorDataInfoEXT.class) VkBufferCaptureDescriptorDataInfoEXT pInfo,
            @pointer(comment="void*") MemorySegment pData
    ) {
        try {
            return (int) HANDLE$vkGetBufferOpaqueCaptureDescriptorDataEXT.invokeExact(
                    device.segment(),
                    pInfo.segment(),
                    pData
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkGetImageOpaqueCaptureDescriptorDataEXT.html">vkGetImageOpaqueCaptureDescriptorDataEXT</a>
    public @enumtype(VkResult.class) int vkGetImageOpaqueCaptureDescriptorDataEXT(
            VkDevice device,
            @pointer(target=VkImageCaptureDescriptorDataInfoEXT.class) VkImageCaptureDescriptorDataInfoEXT pInfo,
            @pointer(comment="void*") MemorySegment pData
    ) {
        try {
            return (int) HANDLE$vkGetImageOpaqueCaptureDescriptorDataEXT.invokeExact(
                    device.segment(),
                    pInfo.segment(),
                    pData
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkGetImageViewOpaqueCaptureDescriptorDataEXT.html">vkGetImageViewOpaqueCaptureDescriptorDataEXT</a>
    public @enumtype(VkResult.class) int vkGetImageViewOpaqueCaptureDescriptorDataEXT(
            VkDevice device,
            @pointer(target=VkImageViewCaptureDescriptorDataInfoEXT.class) VkImageViewCaptureDescriptorDataInfoEXT pInfo,
            @pointer(comment="void*") MemorySegment pData
    ) {
        try {
            return (int) HANDLE$vkGetImageViewOpaqueCaptureDescriptorDataEXT.invokeExact(
                    device.segment(),
                    pInfo.segment(),
                    pData
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkGetSamplerOpaqueCaptureDescriptorDataEXT.html">vkGetSamplerOpaqueCaptureDescriptorDataEXT</a>
    public @enumtype(VkResult.class) int vkGetSamplerOpaqueCaptureDescriptorDataEXT(
            VkDevice device,
            @pointer(target=VkSamplerCaptureDescriptorDataInfoEXT.class) VkSamplerCaptureDescriptorDataInfoEXT pInfo,
            @pointer(comment="void*") MemorySegment pData
    ) {
        try {
            return (int) HANDLE$vkGetSamplerOpaqueCaptureDescriptorDataEXT.invokeExact(
                    device.segment(),
                    pInfo.segment(),
                    pData
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkGetAccelerationStructureOpaqueCaptureDescriptorDataEXT.html">vkGetAccelerationStructureOpaqueCaptureDescriptorDataEXT</a>
    public @enumtype(VkResult.class) int vkGetAccelerationStructureOpaqueCaptureDescriptorDataEXT(
            VkDevice device,
            @pointer(target=VkAccelerationStructureCaptureDescriptorDataInfoEXT.class) VkAccelerationStructureCaptureDescriptorDataInfoEXT pInfo,
            @pointer(comment="void*") MemorySegment pData
    ) {
        try {
            return (int) HANDLE$vkGetAccelerationStructureOpaqueCaptureDescriptorDataEXT.invokeExact(
                    device.segment(),
                    pInfo.segment(),
                    pData
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkSetDeviceMemoryPriorityEXT.html">vkSetDeviceMemoryPriorityEXT</a>
    public void vkSetDeviceMemoryPriorityEXT(
            VkDevice device,
            VkDeviceMemory memory,
            float priority
    ) {
        try {
            HANDLE$vkSetDeviceMemoryPriorityEXT.invokeExact(
                    device.segment(),
                    memory.segment(),
                    priority
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkWaitForPresentKHR.html">vkWaitForPresentKHR</a>
    public @enumtype(VkResult.class) int vkWaitForPresentKHR(
            VkDevice device,
            VkSwapchainKHR swapchain,
            @unsigned long presentId,
            @unsigned long timeout
    ) {
        try {
            return (int) HANDLE$vkWaitForPresentKHR.invokeExact(
                    device.segment(),
                    swapchain.segment(),
                    presentId,
                    timeout
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCreateBufferCollectionFUCHSIA.html">vkCreateBufferCollectionFUCHSIA</a>
    public @enumtype(VkResult.class) int vkCreateBufferCollectionFUCHSIA(
            VkDevice device,
            @pointer(target=VkBufferCollectionCreateInfoFUCHSIA.class) VkBufferCollectionCreateInfoFUCHSIA pCreateInfo,
            @nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator,
            @pointer(target=VkBufferCollectionFUCHSIA.class) VkBufferCollectionFUCHSIA.Buffer pCollection
    ) {
        try {
            return (int) HANDLE$vkCreateBufferCollectionFUCHSIA.invokeExact(
                    device.segment(),
                    pCreateInfo.segment(),
                    (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL),
                    pCollection.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkSetBufferCollectionBufferConstraintsFUCHSIA.html">vkSetBufferCollectionBufferConstraintsFUCHSIA</a>
    public @enumtype(VkResult.class) int vkSetBufferCollectionBufferConstraintsFUCHSIA(
            VkDevice device,
            VkBufferCollectionFUCHSIA collection,
            @pointer(target=VkBufferConstraintsInfoFUCHSIA.class) VkBufferConstraintsInfoFUCHSIA pBufferConstraintsInfo
    ) {
        try {
            return (int) HANDLE$vkSetBufferCollectionBufferConstraintsFUCHSIA.invokeExact(
                    device.segment(),
                    collection.segment(),
                    pBufferConstraintsInfo.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkSetBufferCollectionImageConstraintsFUCHSIA.html">vkSetBufferCollectionImageConstraintsFUCHSIA</a>
    public @enumtype(VkResult.class) int vkSetBufferCollectionImageConstraintsFUCHSIA(
            VkDevice device,
            VkBufferCollectionFUCHSIA collection,
            @pointer(target=VkImageConstraintsInfoFUCHSIA.class) VkImageConstraintsInfoFUCHSIA pImageConstraintsInfo
    ) {
        try {
            return (int) HANDLE$vkSetBufferCollectionImageConstraintsFUCHSIA.invokeExact(
                    device.segment(),
                    collection.segment(),
                    pImageConstraintsInfo.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkDestroyBufferCollectionFUCHSIA.html">vkDestroyBufferCollectionFUCHSIA</a>
    public void vkDestroyBufferCollectionFUCHSIA(
            VkDevice device,
            VkBufferCollectionFUCHSIA collection,
            @nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator
    ) {
        try {
            HANDLE$vkDestroyBufferCollectionFUCHSIA.invokeExact(
                    device.segment(),
                    collection.segment(),
                    (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkGetBufferCollectionPropertiesFUCHSIA.html">vkGetBufferCollectionPropertiesFUCHSIA</a>
    public @enumtype(VkResult.class) int vkGetBufferCollectionPropertiesFUCHSIA(
            VkDevice device,
            VkBufferCollectionFUCHSIA collection,
            @pointer(target=VkBufferCollectionPropertiesFUCHSIA.class) VkBufferCollectionPropertiesFUCHSIA pProperties
    ) {
        try {
            return (int) HANDLE$vkGetBufferCollectionPropertiesFUCHSIA.invokeExact(
                    device.segment(),
                    collection.segment(),
                    pProperties.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCreateCudaModuleNV.html">vkCreateCudaModuleNV</a>
    public @enumtype(VkResult.class) int vkCreateCudaModuleNV(
            VkDevice device,
            @pointer(target=VkCudaModuleCreateInfoNV.class) VkCudaModuleCreateInfoNV pCreateInfo,
            @nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator,
            @pointer(target=VkCudaModuleNV.class) VkCudaModuleNV.Buffer pModule
    ) {
        try {
            return (int) HANDLE$vkCreateCudaModuleNV.invokeExact(
                    device.segment(),
                    pCreateInfo.segment(),
                    (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL),
                    pModule.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkGetCudaModuleCacheNV.html">vkGetCudaModuleCacheNV</a>
    public @enumtype(VkResult.class) int vkGetCudaModuleCacheNV(
            VkDevice device,
            VkCudaModuleNV module,
            PointerBuffer pCacheSize,
            @pointer(comment="void*") MemorySegment pCacheData
    ) {
        try {
            return (int) HANDLE$vkGetCudaModuleCacheNV.invokeExact(
                    device.segment(),
                    module.segment(),
                    pCacheSize.segment(),
                    pCacheData
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCreateCudaFunctionNV.html">vkCreateCudaFunctionNV</a>
    public @enumtype(VkResult.class) int vkCreateCudaFunctionNV(
            VkDevice device,
            @pointer(target=VkCudaFunctionCreateInfoNV.class) VkCudaFunctionCreateInfoNV pCreateInfo,
            @nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator,
            @pointer(target=VkCudaFunctionNV.class) VkCudaFunctionNV.Buffer pFunction
    ) {
        try {
            return (int) HANDLE$vkCreateCudaFunctionNV.invokeExact(
                    device.segment(),
                    pCreateInfo.segment(),
                    (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL),
                    pFunction.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkDestroyCudaModuleNV.html">vkDestroyCudaModuleNV</a>
    public void vkDestroyCudaModuleNV(
            VkDevice device,
            VkCudaModuleNV module,
            @nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator
    ) {
        try {
            HANDLE$vkDestroyCudaModuleNV.invokeExact(
                    device.segment(),
                    module.segment(),
                    (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkDestroyCudaFunctionNV.html">vkDestroyCudaFunctionNV</a>
    public void vkDestroyCudaFunctionNV(
            VkDevice device,
            VkCudaFunctionNV function,
            @nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator
    ) {
        try {
            HANDLE$vkDestroyCudaFunctionNV.invokeExact(
                    device.segment(),
                    function.segment(),
                    (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdCudaLaunchKernelNV.html">vkCmdCudaLaunchKernelNV</a>
    public void vkCmdCudaLaunchKernelNV(
            VkCommandBuffer commandBuffer,
            @pointer(target=VkCudaLaunchInfoNV.class) VkCudaLaunchInfoNV pLaunchInfo
    ) {
        try {
            HANDLE$vkCmdCudaLaunchKernelNV.invokeExact(
                    commandBuffer.segment(),
                    pLaunchInfo.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdBeginRendering.html">vkCmdBeginRendering</a>
    public void vkCmdBeginRendering(
            VkCommandBuffer commandBuffer,
            @pointer(target=VkRenderingInfo.class) VkRenderingInfo pRenderingInfo
    ) {
        try {
            HANDLE$vkCmdBeginRendering.invokeExact(
                    commandBuffer.segment(),
                    pRenderingInfo.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdEndRendering.html">vkCmdEndRendering</a>
    public void vkCmdEndRendering(
            VkCommandBuffer commandBuffer
    ) {
        try {
            HANDLE$vkCmdEndRendering.invokeExact(
                    commandBuffer.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkGetDescriptorSetLayoutHostMappingInfoVALVE.html">vkGetDescriptorSetLayoutHostMappingInfoVALVE</a>
    public void vkGetDescriptorSetLayoutHostMappingInfoVALVE(
            VkDevice device,
            @pointer(target=VkDescriptorSetBindingReferenceVALVE.class) VkDescriptorSetBindingReferenceVALVE pBindingReference,
            @pointer(target=VkDescriptorSetLayoutHostMappingInfoVALVE.class) VkDescriptorSetLayoutHostMappingInfoVALVE pHostMapping
    ) {
        try {
            HANDLE$vkGetDescriptorSetLayoutHostMappingInfoVALVE.invokeExact(
                    device.segment(),
                    pBindingReference.segment(),
                    pHostMapping.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkGetDescriptorSetHostMappingVALVE.html">vkGetDescriptorSetHostMappingVALVE</a>
    public void vkGetDescriptorSetHostMappingVALVE(
            VkDevice device,
            VkDescriptorSet descriptorSet,
            @pointer(comment="void **") MemorySegment ppData
    ) {
        try {
            HANDLE$vkGetDescriptorSetHostMappingVALVE.invokeExact(
                    device.segment(),
                    descriptorSet.segment(),
                    ppData
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCreateMicromapEXT.html">vkCreateMicromapEXT</a>
    public @enumtype(VkResult.class) int vkCreateMicromapEXT(
            VkDevice device,
            @pointer(target=VkMicromapCreateInfoEXT.class) VkMicromapCreateInfoEXT pCreateInfo,
            @nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator,
            @pointer(target=VkMicromapEXT.class) VkMicromapEXT.Buffer pMicromap
    ) {
        try {
            return (int) HANDLE$vkCreateMicromapEXT.invokeExact(
                    device.segment(),
                    pCreateInfo.segment(),
                    (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL),
                    pMicromap.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdBuildMicromapsEXT.html">vkCmdBuildMicromapsEXT</a>
    public void vkCmdBuildMicromapsEXT(
            VkCommandBuffer commandBuffer,
            @unsigned int infoCount,
            @pointer(target=VkMicromapBuildInfoEXT.class) VkMicromapBuildInfoEXT pInfos
    ) {
        try {
            HANDLE$vkCmdBuildMicromapsEXT.invokeExact(
                    commandBuffer.segment(),
                    infoCount,
                    pInfos.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkBuildMicromapsEXT.html">vkBuildMicromapsEXT</a>
    public @enumtype(VkResult.class) int vkBuildMicromapsEXT(
            VkDevice device,
            @nullable VkDeferredOperationKHR deferredOperation,
            @unsigned int infoCount,
            @pointer(target=VkMicromapBuildInfoEXT.class) VkMicromapBuildInfoEXT pInfos
    ) {
        try {
            return (int) HANDLE$vkBuildMicromapsEXT.invokeExact(
                    device.segment(),
                    (MemorySegment) (deferredOperation != null ? deferredOperation.segment() : MemorySegment.NULL),
                    infoCount,
                    pInfos.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkDestroyMicromapEXT.html">vkDestroyMicromapEXT</a>
    public void vkDestroyMicromapEXT(
            VkDevice device,
            @nullable VkMicromapEXT micromap,
            @nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator
    ) {
        try {
            HANDLE$vkDestroyMicromapEXT.invokeExact(
                    device.segment(),
                    (MemorySegment) (micromap != null ? micromap.segment() : MemorySegment.NULL),
                    (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdCopyMicromapEXT.html">vkCmdCopyMicromapEXT</a>
    public void vkCmdCopyMicromapEXT(
            VkCommandBuffer commandBuffer,
            @pointer(target=VkCopyMicromapInfoEXT.class) VkCopyMicromapInfoEXT pInfo
    ) {
        try {
            HANDLE$vkCmdCopyMicromapEXT.invokeExact(
                    commandBuffer.segment(),
                    pInfo.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCopyMicromapEXT.html">vkCopyMicromapEXT</a>
    public @enumtype(VkResult.class) int vkCopyMicromapEXT(
            VkDevice device,
            @nullable VkDeferredOperationKHR deferredOperation,
            @pointer(target=VkCopyMicromapInfoEXT.class) VkCopyMicromapInfoEXT pInfo
    ) {
        try {
            return (int) HANDLE$vkCopyMicromapEXT.invokeExact(
                    device.segment(),
                    (MemorySegment) (deferredOperation != null ? deferredOperation.segment() : MemorySegment.NULL),
                    pInfo.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdCopyMicromapToMemoryEXT.html">vkCmdCopyMicromapToMemoryEXT</a>
    public void vkCmdCopyMicromapToMemoryEXT(
            VkCommandBuffer commandBuffer,
            @pointer(target=VkCopyMicromapToMemoryInfoEXT.class) VkCopyMicromapToMemoryInfoEXT pInfo
    ) {
        try {
            HANDLE$vkCmdCopyMicromapToMemoryEXT.invokeExact(
                    commandBuffer.segment(),
                    pInfo.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCopyMicromapToMemoryEXT.html">vkCopyMicromapToMemoryEXT</a>
    public @enumtype(VkResult.class) int vkCopyMicromapToMemoryEXT(
            VkDevice device,
            @nullable VkDeferredOperationKHR deferredOperation,
            @pointer(target=VkCopyMicromapToMemoryInfoEXT.class) VkCopyMicromapToMemoryInfoEXT pInfo
    ) {
        try {
            return (int) HANDLE$vkCopyMicromapToMemoryEXT.invokeExact(
                    device.segment(),
                    (MemorySegment) (deferredOperation != null ? deferredOperation.segment() : MemorySegment.NULL),
                    pInfo.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdCopyMemoryToMicromapEXT.html">vkCmdCopyMemoryToMicromapEXT</a>
    public void vkCmdCopyMemoryToMicromapEXT(
            VkCommandBuffer commandBuffer,
            @pointer(target=VkCopyMemoryToMicromapInfoEXT.class) VkCopyMemoryToMicromapInfoEXT pInfo
    ) {
        try {
            HANDLE$vkCmdCopyMemoryToMicromapEXT.invokeExact(
                    commandBuffer.segment(),
                    pInfo.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCopyMemoryToMicromapEXT.html">vkCopyMemoryToMicromapEXT</a>
    public @enumtype(VkResult.class) int vkCopyMemoryToMicromapEXT(
            VkDevice device,
            @nullable VkDeferredOperationKHR deferredOperation,
            @pointer(target=VkCopyMemoryToMicromapInfoEXT.class) VkCopyMemoryToMicromapInfoEXT pInfo
    ) {
        try {
            return (int) HANDLE$vkCopyMemoryToMicromapEXT.invokeExact(
                    device.segment(),
                    (MemorySegment) (deferredOperation != null ? deferredOperation.segment() : MemorySegment.NULL),
                    pInfo.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdWriteMicromapsPropertiesEXT.html">vkCmdWriteMicromapsPropertiesEXT</a>
    public void vkCmdWriteMicromapsPropertiesEXT(
            VkCommandBuffer commandBuffer,
            @unsigned int micromapCount,
            @pointer(target=VkMicromapEXT.class) VkMicromapEXT.Buffer pMicromaps,
            @enumtype(VkQueryType.class) int queryType,
            VkQueryPool queryPool,
            @unsigned int firstQuery
    ) {
        try {
            HANDLE$vkCmdWriteMicromapsPropertiesEXT.invokeExact(
                    commandBuffer.segment(),
                    micromapCount,
                    pMicromaps.segment(),
                    queryType,
                    queryPool.segment(),
                    firstQuery
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkWriteMicromapsPropertiesEXT.html">vkWriteMicromapsPropertiesEXT</a>
    public @enumtype(VkResult.class) int vkWriteMicromapsPropertiesEXT(
            VkDevice device,
            @unsigned int micromapCount,
            @pointer(target=VkMicromapEXT.class) VkMicromapEXT.Buffer pMicromaps,
            @enumtype(VkQueryType.class) int queryType,
            @unsigned long dataSize,
            @pointer(comment="void*") MemorySegment pData,
            @unsigned long stride
    ) {
        try {
            return (int) HANDLE$vkWriteMicromapsPropertiesEXT.invokeExact(
                    device.segment(),
                    micromapCount,
                    pMicromaps.segment(),
                    queryType,
                    dataSize,
                    pData,
                    stride
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkGetDeviceMicromapCompatibilityEXT.html">vkGetDeviceMicromapCompatibilityEXT</a>
    public void vkGetDeviceMicromapCompatibilityEXT(
            VkDevice device,
            @pointer(target=VkMicromapVersionInfoEXT.class) VkMicromapVersionInfoEXT pVersionInfo,
            @enumtype(VkAccelerationStructureCompatibilityKHR.class) IntBuffer pCompatibility
    ) {
        try {
            HANDLE$vkGetDeviceMicromapCompatibilityEXT.invokeExact(
                    device.segment(),
                    pVersionInfo.segment(),
                    pCompatibility.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkGetMicromapBuildSizesEXT.html">vkGetMicromapBuildSizesEXT</a>
    public void vkGetMicromapBuildSizesEXT(
            VkDevice device,
            @enumtype(VkAccelerationStructureBuildTypeKHR.class) int buildType,
            @pointer(target=VkMicromapBuildInfoEXT.class) VkMicromapBuildInfoEXT pBuildInfo,
            @pointer(target=VkMicromapBuildSizesInfoEXT.class) VkMicromapBuildSizesInfoEXT pSizeInfo
    ) {
        try {
            HANDLE$vkGetMicromapBuildSizesEXT.invokeExact(
                    device.segment(),
                    buildType,
                    pBuildInfo.segment(),
                    pSizeInfo.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkGetShaderModuleIdentifierEXT.html">vkGetShaderModuleIdentifierEXT</a>
    public void vkGetShaderModuleIdentifierEXT(
            VkDevice device,
            VkShaderModule shaderModule,
            @pointer(target=VkShaderModuleIdentifierEXT.class) VkShaderModuleIdentifierEXT pIdentifier
    ) {
        try {
            HANDLE$vkGetShaderModuleIdentifierEXT.invokeExact(
                    device.segment(),
                    shaderModule.segment(),
                    pIdentifier.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkGetShaderModuleCreateInfoIdentifierEXT.html">vkGetShaderModuleCreateInfoIdentifierEXT</a>
    public void vkGetShaderModuleCreateInfoIdentifierEXT(
            VkDevice device,
            @pointer(target=VkShaderModuleCreateInfo.class) VkShaderModuleCreateInfo pCreateInfo,
            @pointer(target=VkShaderModuleIdentifierEXT.class) VkShaderModuleIdentifierEXT pIdentifier
    ) {
        try {
            HANDLE$vkGetShaderModuleCreateInfoIdentifierEXT.invokeExact(
                    device.segment(),
                    pCreateInfo.segment(),
                    pIdentifier.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkGetImageSubresourceLayout2KHR.html">vkGetImageSubresourceLayout2KHR</a>
    public void vkGetImageSubresourceLayout2KHR(
            VkDevice device,
            VkImage image,
            @pointer(target=VkImageSubresource2KHR.class) VkImageSubresource2KHR pSubresource,
            @pointer(target=VkSubresourceLayout2KHR.class) VkSubresourceLayout2KHR pLayout
    ) {
        try {
            HANDLE$vkGetImageSubresourceLayout2KHR.invokeExact(
                    device.segment(),
                    image.segment(),
                    pSubresource.segment(),
                    pLayout.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkGetPipelinePropertiesEXT.html">vkGetPipelinePropertiesEXT</a>
    public @enumtype(VkResult.class) int vkGetPipelinePropertiesEXT(
            VkDevice device,
            @pointer(target=VkPipelineInfoKHR.class) VkPipelineInfoKHR pPipelineInfo,
            @pointer(target=VkBaseOutStructure.class) VkBaseOutStructure pPipelineProperties
    ) {
        try {
            return (int) HANDLE$vkGetPipelinePropertiesEXT.invokeExact(
                    device.segment(),
                    pPipelineInfo.segment(),
                    pPipelineProperties.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkExportMetalObjectsEXT.html">vkExportMetalObjectsEXT</a>
    public void vkExportMetalObjectsEXT(
            VkDevice device,
            @pointer(target=VkExportMetalObjectsInfoEXT.class) VkExportMetalObjectsInfoEXT pMetalObjectsInfo
    ) {
        try {
            HANDLE$vkExportMetalObjectsEXT.invokeExact(
                    device.segment(),
                    pMetalObjectsInfo.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkGetFramebufferTilePropertiesQCOM.html">vkGetFramebufferTilePropertiesQCOM</a>
    public @enumtype(VkResult.class) int vkGetFramebufferTilePropertiesQCOM(
            VkDevice device,
            VkFramebuffer framebuffer,
            @unsigned IntBuffer pPropertiesCount,
            @nullable @pointer(target=VkTilePropertiesQCOM.class) VkTilePropertiesQCOM pProperties
    ) {
        try {
            return (int) HANDLE$vkGetFramebufferTilePropertiesQCOM.invokeExact(
                    device.segment(),
                    framebuffer.segment(),
                    pPropertiesCount.segment(),
                    (MemorySegment) (pProperties != null ? pProperties.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkGetDynamicRenderingTilePropertiesQCOM.html">vkGetDynamicRenderingTilePropertiesQCOM</a>
    public @enumtype(VkResult.class) int vkGetDynamicRenderingTilePropertiesQCOM(
            VkDevice device,
            @pointer(target=VkRenderingInfo.class) VkRenderingInfo pRenderingInfo,
            @pointer(target=VkTilePropertiesQCOM.class) VkTilePropertiesQCOM pProperties
    ) {
        try {
            return (int) HANDLE$vkGetDynamicRenderingTilePropertiesQCOM.invokeExact(
                    device.segment(),
                    pRenderingInfo.segment(),
                    pProperties.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkGetPhysicalDeviceOpticalFlowImageFormatsNV.html">vkGetPhysicalDeviceOpticalFlowImageFormatsNV</a>
    public @enumtype(VkResult.class) int vkGetPhysicalDeviceOpticalFlowImageFormatsNV(
            VkPhysicalDevice physicalDevice,
            @pointer(target=VkOpticalFlowImageFormatInfoNV.class) VkOpticalFlowImageFormatInfoNV pOpticalFlowImageFormatInfo,
            @unsigned IntBuffer pFormatCount,
            @nullable @pointer(target=VkOpticalFlowImageFormatPropertiesNV.class) VkOpticalFlowImageFormatPropertiesNV pImageFormatProperties
    ) {
        try {
            return (int) HANDLE$vkGetPhysicalDeviceOpticalFlowImageFormatsNV.invokeExact(
                    physicalDevice.segment(),
                    pOpticalFlowImageFormatInfo.segment(),
                    pFormatCount.segment(),
                    (MemorySegment) (pImageFormatProperties != null ? pImageFormatProperties.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCreateOpticalFlowSessionNV.html">vkCreateOpticalFlowSessionNV</a>
    public @enumtype(VkResult.class) int vkCreateOpticalFlowSessionNV(
            VkDevice device,
            @pointer(target=VkOpticalFlowSessionCreateInfoNV.class) VkOpticalFlowSessionCreateInfoNV pCreateInfo,
            @nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator,
            @pointer(target=VkOpticalFlowSessionNV.class) VkOpticalFlowSessionNV.Buffer pSession
    ) {
        try {
            return (int) HANDLE$vkCreateOpticalFlowSessionNV.invokeExact(
                    device.segment(),
                    pCreateInfo.segment(),
                    (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL),
                    pSession.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkDestroyOpticalFlowSessionNV.html">vkDestroyOpticalFlowSessionNV</a>
    public void vkDestroyOpticalFlowSessionNV(
            VkDevice device,
            VkOpticalFlowSessionNV session,
            @nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator
    ) {
        try {
            HANDLE$vkDestroyOpticalFlowSessionNV.invokeExact(
                    device.segment(),
                    session.segment(),
                    (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkBindOpticalFlowSessionImageNV.html">vkBindOpticalFlowSessionImageNV</a>
    public @enumtype(VkResult.class) int vkBindOpticalFlowSessionImageNV(
            VkDevice device,
            VkOpticalFlowSessionNV session,
            @enumtype(VkOpticalFlowSessionBindingPointNV.class) int bindingPoint,
            @nullable VkImageView view,
            @enumtype(VkImageLayout.class) int layout
    ) {
        try {
            return (int) HANDLE$vkBindOpticalFlowSessionImageNV.invokeExact(
                    device.segment(),
                    session.segment(),
                    bindingPoint,
                    (MemorySegment) (view != null ? view.segment() : MemorySegment.NULL),
                    layout
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdOpticalFlowExecuteNV.html">vkCmdOpticalFlowExecuteNV</a>
    public void vkCmdOpticalFlowExecuteNV(
            VkCommandBuffer commandBuffer,
            VkOpticalFlowSessionNV session,
            @pointer(target=VkOpticalFlowExecuteInfoNV.class) VkOpticalFlowExecuteInfoNV pExecuteInfo
    ) {
        try {
            HANDLE$vkCmdOpticalFlowExecuteNV.invokeExact(
                    commandBuffer.segment(),
                    session.segment(),
                    pExecuteInfo.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkGetDeviceFaultInfoEXT.html">vkGetDeviceFaultInfoEXT</a>
    public @enumtype(VkResult.class) int vkGetDeviceFaultInfoEXT(
            VkDevice device,
            @pointer(target=VkDeviceFaultCountsEXT.class) VkDeviceFaultCountsEXT pFaultCounts,
            @nullable @pointer(target=VkDeviceFaultInfoEXT.class) VkDeviceFaultInfoEXT pFaultInfo
    ) {
        try {
            return (int) HANDLE$vkGetDeviceFaultInfoEXT.invokeExact(
                    device.segment(),
                    pFaultCounts.segment(),
                    (MemorySegment) (pFaultInfo != null ? pFaultInfo.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdSetDepthBias2EXT.html">vkCmdSetDepthBias2EXT</a>
    public void vkCmdSetDepthBias2EXT(
            VkCommandBuffer commandBuffer,
            @pointer(target=VkDepthBiasInfoEXT.class) VkDepthBiasInfoEXT pDepthBiasInfo
    ) {
        try {
            HANDLE$vkCmdSetDepthBias2EXT.invokeExact(
                    commandBuffer.segment(),
                    pDepthBiasInfo.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkReleaseSwapchainImagesEXT.html">vkReleaseSwapchainImagesEXT</a>
    public @enumtype(VkResult.class) int vkReleaseSwapchainImagesEXT(
            VkDevice device,
            @pointer(target=VkReleaseSwapchainImagesInfoEXT.class) VkReleaseSwapchainImagesInfoEXT pReleaseInfo
    ) {
        try {
            return (int) HANDLE$vkReleaseSwapchainImagesEXT.invokeExact(
                    device.segment(),
                    pReleaseInfo.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkGetDeviceImageSubresourceLayoutKHR.html">vkGetDeviceImageSubresourceLayoutKHR</a>
    public void vkGetDeviceImageSubresourceLayoutKHR(
            VkDevice device,
            @pointer(target=VkDeviceImageSubresourceInfoKHR.class) VkDeviceImageSubresourceInfoKHR pInfo,
            @pointer(target=VkSubresourceLayout2KHR.class) VkSubresourceLayout2KHR pLayout
    ) {
        try {
            HANDLE$vkGetDeviceImageSubresourceLayoutKHR.invokeExact(
                    device.segment(),
                    pInfo.segment(),
                    pLayout.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkMapMemory2KHR.html">vkMapMemory2KHR</a>
    public @enumtype(VkResult.class) int vkMapMemory2KHR(
            VkDevice device,
            @pointer(target=VkMemoryMapInfoKHR.class) VkMemoryMapInfoKHR pMemoryMapInfo,
            @pointer(comment="void **") MemorySegment ppData
    ) {
        try {
            return (int) HANDLE$vkMapMemory2KHR.invokeExact(
                    device.segment(),
                    pMemoryMapInfo.segment(),
                    ppData
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkUnmapMemory2KHR.html">vkUnmapMemory2KHR</a>
    public @enumtype(VkResult.class) int vkUnmapMemory2KHR(
            VkDevice device,
            @pointer(target=VkMemoryUnmapInfoKHR.class) VkMemoryUnmapInfoKHR pMemoryUnmapInfo
    ) {
        try {
            return (int) HANDLE$vkUnmapMemory2KHR.invokeExact(
                    device.segment(),
                    pMemoryUnmapInfo.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCreateShadersEXT.html">vkCreateShadersEXT</a>
    public @enumtype(VkResult.class) int vkCreateShadersEXT(
            VkDevice device,
            @unsigned int createInfoCount,
            @pointer(target=VkShaderCreateInfoEXT.class) VkShaderCreateInfoEXT pCreateInfos,
            @nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator,
            @pointer(target=VkShaderEXT.class) VkShaderEXT.Buffer pShaders
    ) {
        try {
            return (int) HANDLE$vkCreateShadersEXT.invokeExact(
                    device.segment(),
                    createInfoCount,
                    pCreateInfos.segment(),
                    (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL),
                    pShaders.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkDestroyShaderEXT.html">vkDestroyShaderEXT</a>
    public void vkDestroyShaderEXT(
            VkDevice device,
            @nullable VkShaderEXT shader,
            @nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator
    ) {
        try {
            HANDLE$vkDestroyShaderEXT.invokeExact(
                    device.segment(),
                    (MemorySegment) (shader != null ? shader.segment() : MemorySegment.NULL),
                    (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkGetShaderBinaryDataEXT.html">vkGetShaderBinaryDataEXT</a>
    public @enumtype(VkResult.class) int vkGetShaderBinaryDataEXT(
            VkDevice device,
            VkShaderEXT shader,
            PointerBuffer pDataSize,
            @pointer(comment="void*") MemorySegment pData
    ) {
        try {
            return (int) HANDLE$vkGetShaderBinaryDataEXT.invokeExact(
                    device.segment(),
                    shader.segment(),
                    pDataSize.segment(),
                    pData
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdBindShadersEXT.html">vkCmdBindShadersEXT</a>
    public void vkCmdBindShadersEXT(
            VkCommandBuffer commandBuffer,
            @unsigned int stageCount,
            @enumtype(VkShaderStageFlags.class) IntBuffer pStages,
            @nullable @pointer(target=VkShaderEXT.class) VkShaderEXT.Buffer pShaders
    ) {
        try {
            HANDLE$vkCmdBindShadersEXT.invokeExact(
                    commandBuffer.segment(),
                    stageCount,
                    pStages.segment(),
                    (MemorySegment) (pShaders != null ? pShaders.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkGetScreenBufferPropertiesQNX.html">vkGetScreenBufferPropertiesQNX</a>
    public @enumtype(VkResult.class) int vkGetScreenBufferPropertiesQNX(
            VkDevice device,
            @pointer(comment="void*") MemorySegment buffer,
            @pointer(target=VkScreenBufferPropertiesQNX.class) VkScreenBufferPropertiesQNX pProperties
    ) {
        try {
            return (int) HANDLE$vkGetScreenBufferPropertiesQNX.invokeExact(
                    device.segment(),
                    buffer,
                    pProperties.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkGetPhysicalDeviceCooperativeMatrixPropertiesKHR.html">vkGetPhysicalDeviceCooperativeMatrixPropertiesKHR</a>
    public @enumtype(VkResult.class) int vkGetPhysicalDeviceCooperativeMatrixPropertiesKHR(
            VkPhysicalDevice physicalDevice,
            @unsigned IntBuffer pPropertyCount,
            @nullable @pointer(target=VkCooperativeMatrixPropertiesKHR.class) VkCooperativeMatrixPropertiesKHR pProperties
    ) {
        try {
            return (int) HANDLE$vkGetPhysicalDeviceCooperativeMatrixPropertiesKHR.invokeExact(
                    physicalDevice.segment(),
                    pPropertyCount.segment(),
                    (MemorySegment) (pProperties != null ? pProperties.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkGetExecutionGraphPipelineScratchSizeAMDX.html">vkGetExecutionGraphPipelineScratchSizeAMDX</a>
    public @enumtype(VkResult.class) int vkGetExecutionGraphPipelineScratchSizeAMDX(
            VkDevice device,
            VkPipeline executionGraph,
            @pointer(target=VkExecutionGraphPipelineScratchSizeAMDX.class) VkExecutionGraphPipelineScratchSizeAMDX pSizeInfo
    ) {
        try {
            return (int) HANDLE$vkGetExecutionGraphPipelineScratchSizeAMDX.invokeExact(
                    device.segment(),
                    executionGraph.segment(),
                    pSizeInfo.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkGetExecutionGraphPipelineNodeIndexAMDX.html">vkGetExecutionGraphPipelineNodeIndexAMDX</a>
    public @enumtype(VkResult.class) int vkGetExecutionGraphPipelineNodeIndexAMDX(
            VkDevice device,
            VkPipeline executionGraph,
            @pointer(target=VkPipelineShaderStageNodeCreateInfoAMDX.class) VkPipelineShaderStageNodeCreateInfoAMDX pNodeInfo,
            @unsigned IntBuffer pNodeIndex
    ) {
        try {
            return (int) HANDLE$vkGetExecutionGraphPipelineNodeIndexAMDX.invokeExact(
                    device.segment(),
                    executionGraph.segment(),
                    pNodeInfo.segment(),
                    pNodeIndex.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCreateExecutionGraphPipelinesAMDX.html">vkCreateExecutionGraphPipelinesAMDX</a>
    public @enumtype(VkResult.class) int vkCreateExecutionGraphPipelinesAMDX(
            VkDevice device,
            @nullable VkPipelineCache pipelineCache,
            @unsigned int createInfoCount,
            @pointer(target=VkExecutionGraphPipelineCreateInfoAMDX.class) VkExecutionGraphPipelineCreateInfoAMDX pCreateInfos,
            @nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator,
            @pointer(target=VkPipeline.class) VkPipeline.Buffer pPipelines
    ) {
        try {
            return (int) HANDLE$vkCreateExecutionGraphPipelinesAMDX.invokeExact(
                    device.segment(),
                    (MemorySegment) (pipelineCache != null ? pipelineCache.segment() : MemorySegment.NULL),
                    createInfoCount,
                    pCreateInfos.segment(),
                    (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL),
                    pPipelines.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdInitializeGraphScratchMemoryAMDX.html">vkCmdInitializeGraphScratchMemoryAMDX</a>
    public void vkCmdInitializeGraphScratchMemoryAMDX(
            VkCommandBuffer commandBuffer,
            @unsigned long scratch
    ) {
        try {
            HANDLE$vkCmdInitializeGraphScratchMemoryAMDX.invokeExact(
                    commandBuffer.segment(),
                    scratch
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdDispatchGraphAMDX.html">vkCmdDispatchGraphAMDX</a>
    public void vkCmdDispatchGraphAMDX(
            VkCommandBuffer commandBuffer,
            @unsigned long scratch,
            @pointer(target=VkDispatchGraphCountInfoAMDX.class) VkDispatchGraphCountInfoAMDX pCountInfo
    ) {
        try {
            HANDLE$vkCmdDispatchGraphAMDX.invokeExact(
                    commandBuffer.segment(),
                    scratch,
                    pCountInfo.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdDispatchGraphIndirectAMDX.html">vkCmdDispatchGraphIndirectAMDX</a>
    public void vkCmdDispatchGraphIndirectAMDX(
            VkCommandBuffer commandBuffer,
            @unsigned long scratch,
            @pointer(target=VkDispatchGraphCountInfoAMDX.class) VkDispatchGraphCountInfoAMDX pCountInfo
    ) {
        try {
            HANDLE$vkCmdDispatchGraphIndirectAMDX.invokeExact(
                    commandBuffer.segment(),
                    scratch,
                    pCountInfo.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdDispatchGraphIndirectCountAMDX.html">vkCmdDispatchGraphIndirectCountAMDX</a>
    public void vkCmdDispatchGraphIndirectCountAMDX(
            VkCommandBuffer commandBuffer,
            @unsigned long scratch,
            @unsigned long countInfo
    ) {
        try {
            HANDLE$vkCmdDispatchGraphIndirectCountAMDX.invokeExact(
                    commandBuffer.segment(),
                    scratch,
                    countInfo
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdBindDescriptorSets2KHR.html">vkCmdBindDescriptorSets2KHR</a>
    public void vkCmdBindDescriptorSets2KHR(
            VkCommandBuffer commandBuffer,
            @pointer(target=VkBindDescriptorSetsInfoKHR.class) VkBindDescriptorSetsInfoKHR pBindDescriptorSetsInfo
    ) {
        try {
            HANDLE$vkCmdBindDescriptorSets2KHR.invokeExact(
                    commandBuffer.segment(),
                    pBindDescriptorSetsInfo.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdPushConstants2KHR.html">vkCmdPushConstants2KHR</a>
    public void vkCmdPushConstants2KHR(
            VkCommandBuffer commandBuffer,
            @pointer(target=VkPushConstantsInfoKHR.class) VkPushConstantsInfoKHR pPushConstantsInfo
    ) {
        try {
            HANDLE$vkCmdPushConstants2KHR.invokeExact(
                    commandBuffer.segment(),
                    pPushConstantsInfo.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdPushDescriptorSet2KHR.html">vkCmdPushDescriptorSet2KHR</a>
    public void vkCmdPushDescriptorSet2KHR(
            VkCommandBuffer commandBuffer,
            @pointer(target=VkPushDescriptorSetInfoKHR.class) VkPushDescriptorSetInfoKHR pPushDescriptorSetInfo
    ) {
        try {
            HANDLE$vkCmdPushDescriptorSet2KHR.invokeExact(
                    commandBuffer.segment(),
                    pPushDescriptorSetInfo.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdPushDescriptorSetWithTemplate2KHR.html">vkCmdPushDescriptorSetWithTemplate2KHR</a>
    public void vkCmdPushDescriptorSetWithTemplate2KHR(
            VkCommandBuffer commandBuffer,
            @pointer(target=VkPushDescriptorSetWithTemplateInfoKHR.class) VkPushDescriptorSetWithTemplateInfoKHR pPushDescriptorSetWithTemplateInfo
    ) {
        try {
            HANDLE$vkCmdPushDescriptorSetWithTemplate2KHR.invokeExact(
                    commandBuffer.segment(),
                    pPushDescriptorSetWithTemplateInfo.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdSetDescriptorBufferOffsets2EXT.html">vkCmdSetDescriptorBufferOffsets2EXT</a>
    public void vkCmdSetDescriptorBufferOffsets2EXT(
            VkCommandBuffer commandBuffer,
            @pointer(target=VkSetDescriptorBufferOffsetsInfoEXT.class) VkSetDescriptorBufferOffsetsInfoEXT pSetDescriptorBufferOffsetsInfo
    ) {
        try {
            HANDLE$vkCmdSetDescriptorBufferOffsets2EXT.invokeExact(
                    commandBuffer.segment(),
                    pSetDescriptorBufferOffsetsInfo.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdBindDescriptorBufferEmbeddedSamplers2EXT.html">vkCmdBindDescriptorBufferEmbeddedSamplers2EXT</a>
    public void vkCmdBindDescriptorBufferEmbeddedSamplers2EXT(
            VkCommandBuffer commandBuffer,
            @pointer(target=VkBindDescriptorBufferEmbeddedSamplersInfoEXT.class) VkBindDescriptorBufferEmbeddedSamplersInfoEXT pBindDescriptorBufferEmbeddedSamplersInfo
    ) {
        try {
            HANDLE$vkCmdBindDescriptorBufferEmbeddedSamplers2EXT.invokeExact(
                    commandBuffer.segment(),
                    pBindDescriptorBufferEmbeddedSamplersInfo.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkSetLatencySleepModeNV.html">vkSetLatencySleepModeNV</a>
    public @enumtype(VkResult.class) int vkSetLatencySleepModeNV(
            VkDevice device,
            VkSwapchainKHR swapchain,
            @pointer(target=VkLatencySleepModeInfoNV.class) VkLatencySleepModeInfoNV pSleepModeInfo
    ) {
        try {
            return (int) HANDLE$vkSetLatencySleepModeNV.invokeExact(
                    device.segment(),
                    swapchain.segment(),
                    pSleepModeInfo.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkLatencySleepNV.html">vkLatencySleepNV</a>
    public @enumtype(VkResult.class) int vkLatencySleepNV(
            VkDevice device,
            VkSwapchainKHR swapchain,
            @pointer(target=VkLatencySleepInfoNV.class) VkLatencySleepInfoNV pSleepInfo
    ) {
        try {
            return (int) HANDLE$vkLatencySleepNV.invokeExact(
                    device.segment(),
                    swapchain.segment(),
                    pSleepInfo.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkSetLatencyMarkerNV.html">vkSetLatencyMarkerNV</a>
    public void vkSetLatencyMarkerNV(
            VkDevice device,
            VkSwapchainKHR swapchain,
            @pointer(target=VkSetLatencyMarkerInfoNV.class) VkSetLatencyMarkerInfoNV pLatencyMarkerInfo
    ) {
        try {
            HANDLE$vkSetLatencyMarkerNV.invokeExact(
                    device.segment(),
                    swapchain.segment(),
                    pLatencyMarkerInfo.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkGetLatencyTimingsNV.html">vkGetLatencyTimingsNV</a>
    public void vkGetLatencyTimingsNV(
            VkDevice device,
            VkSwapchainKHR swapchain,
            @pointer(target=VkGetLatencyMarkerInfoNV.class) VkGetLatencyMarkerInfoNV pLatencyMarkerInfo
    ) {
        try {
            HANDLE$vkGetLatencyTimingsNV.invokeExact(
                    device.segment(),
                    swapchain.segment(),
                    pLatencyMarkerInfo.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkQueueNotifyOutOfBandNV.html">vkQueueNotifyOutOfBandNV</a>
    public void vkQueueNotifyOutOfBandNV(
            VkQueue queue,
            @pointer(target=VkOutOfBandQueueTypeInfoNV.class) VkOutOfBandQueueTypeInfoNV pQueueTypeInfo
    ) {
        try {
            HANDLE$vkQueueNotifyOutOfBandNV.invokeExact(
                    queue.segment(),
                    pQueueTypeInfo.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdSetRenderingAttachmentLocationsKHR.html">vkCmdSetRenderingAttachmentLocationsKHR</a>
    public void vkCmdSetRenderingAttachmentLocationsKHR(
            VkCommandBuffer commandBuffer,
            @pointer(target=VkRenderingAttachmentLocationInfoKHR.class) VkRenderingAttachmentLocationInfoKHR pLocationInfo
    ) {
        try {
            HANDLE$vkCmdSetRenderingAttachmentLocationsKHR.invokeExact(
                    commandBuffer.segment(),
                    pLocationInfo.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdSetRenderingInputAttachmentIndicesKHR.html">vkCmdSetRenderingInputAttachmentIndicesKHR</a>
    public void vkCmdSetRenderingInputAttachmentIndicesKHR(
            VkCommandBuffer commandBuffer,
            @pointer(target=VkRenderingInputAttachmentIndexInfoKHR.class) VkRenderingInputAttachmentIndexInfoKHR pInputAttachmentIndexInfo
    ) {
        try {
            HANDLE$vkCmdSetRenderingInputAttachmentIndicesKHR.invokeExact(
                    commandBuffer.segment(),
                    pInputAttachmentIndexInfo.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }
}
