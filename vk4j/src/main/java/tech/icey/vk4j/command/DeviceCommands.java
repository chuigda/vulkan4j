package tech.icey.vk4j.command;

import java.lang.foreign.*;
import java.lang.invoke.MethodHandle;

import tech.icey.vk4j.NativeLayout;
import tech.icey.vk4j.annotations.*;
import tech.icey.vk4j.array.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.handle.*;
import tech.icey.vk4j.ptr.*;
import tech.icey.vk4j.util.Function2;

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
            MemoryLayout.sequenceLayout(4, ValueLayout.JAVA_FLOAT)
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
            MemoryLayout.sequenceLayout(2, ValueLayout.JAVA_INT)
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
            MemoryLayout.sequenceLayout(2, ValueLayout.JAVA_INT)
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
            ValueLayout.JAVA_INT
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
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdWriteBufferMarker2AMD = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
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

    public DeviceCommands(Function2<String, FunctionDescriptor, MethodHandle> loader, Function2<String, FunctionDescriptor, MethodHandle> instanceLoader) {
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

    public void vkDestroyDevice(
            VkDevice device,
            @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator
    ) {
        try {
            HANDLE$vkDestroyDevice.invoke(
                    device.handle(),
                    pAllocator != null ? pAllocator.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkGetDeviceQueue(
            VkDevice device,
            @unsigned int queueFamilyIndex,
            @unsigned int queueIndex,
            @pointer(target=VkQueue.class) VkQueue pQueue
    ) {
        try {
            HANDLE$vkGetDeviceQueue.invoke(
                    device.handle(),
                    queueFamilyIndex,
                    queueIndex,
                    pQueue != null ? pQueue.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkQueueSubmit(
            VkQueue queue,
            @unsigned int submitCount,
            @pointer(target=VkSubmitInfo.class) VkSubmitInfo pSubmits,
            VkFence fence
    ) {
        try {
            return (int) HANDLE$vkQueueSubmit.invoke(
                    queue.handle(),
                    submitCount,
                    pSubmits != null ? pSubmits.segment() : MemorySegment.NULL,
                    fence.handle()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkQueueWaitIdle(
            VkQueue queue
    ) {
        try {
            return (int) HANDLE$vkQueueWaitIdle.invoke(
                    queue.handle()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkDeviceWaitIdle(
            VkDevice device
    ) {
        try {
            return (int) HANDLE$vkDeviceWaitIdle.invoke(
                    device.handle()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkAllocateMemory(
            VkDevice device,
            @pointer(target=VkMemoryAllocateInfo.class) VkMemoryAllocateInfo pAllocateInfo,
            @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator,
            @pointer(target=VkDeviceMemory.class) VkDeviceMemory pMemory
    ) {
        try {
            return (int) HANDLE$vkAllocateMemory.invoke(
                    device.handle(),
                    pAllocateInfo != null ? pAllocateInfo.segment() : MemorySegment.NULL,
                    pAllocator != null ? pAllocator.segment() : MemorySegment.NULL,
                    pMemory != null ? pMemory.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkFreeMemory(
            VkDevice device,
            VkDeviceMemory memory,
            @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator
    ) {
        try {
            HANDLE$vkFreeMemory.invoke(
                    device.handle(),
                    memory.handle(),
                    pAllocator != null ? pAllocator.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkMapMemory(
            VkDevice device,
            VkDeviceMemory memory,
            @unsigned long offset,
            @unsigned long size,
            @enumtype(VkMemoryMapFlags.class) int flags,
            @pointer(comment="void **") MemorySegment ppData
    ) {
        try {
            return (int) HANDLE$vkMapMemory.invoke(
                    device.handle(),
                    memory.handle(),
                    offset,
                    size,
                    flags,
                    ppData
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkUnmapMemory(
            VkDevice device,
            VkDeviceMemory memory
    ) {
        try {
            HANDLE$vkUnmapMemory.invoke(
                    device.handle(),
                    memory.handle()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkFlushMappedMemoryRanges(
            VkDevice device,
            @unsigned int memoryRangeCount,
            @pointer(target=VkMappedMemoryRange.class) VkMappedMemoryRange pMemoryRanges
    ) {
        try {
            return (int) HANDLE$vkFlushMappedMemoryRanges.invoke(
                    device.handle(),
                    memoryRangeCount,
                    pMemoryRanges != null ? pMemoryRanges.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkInvalidateMappedMemoryRanges(
            VkDevice device,
            @unsigned int memoryRangeCount,
            @pointer(target=VkMappedMemoryRange.class) VkMappedMemoryRange pMemoryRanges
    ) {
        try {
            return (int) HANDLE$vkInvalidateMappedMemoryRanges.invoke(
                    device.handle(),
                    memoryRangeCount,
                    pMemoryRanges != null ? pMemoryRanges.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkGetDeviceMemoryCommitment(
            VkDevice device,
            VkDeviceMemory memory,
            @pointer(target=LongPtr.class) @unsigned LongPtr pCommittedMemoryInBytes
    ) {
        try {
            HANDLE$vkGetDeviceMemoryCommitment.invoke(
                    device.handle(),
                    memory.handle(),
                    pCommittedMemoryInBytes != null ? pCommittedMemoryInBytes.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkGetBufferMemoryRequirements(
            VkDevice device,
            VkBuffer buffer,
            @pointer(target=VkMemoryRequirements.class) VkMemoryRequirements pMemoryRequirements
    ) {
        try {
            HANDLE$vkGetBufferMemoryRequirements.invoke(
                    device.handle(),
                    buffer.handle(),
                    pMemoryRequirements != null ? pMemoryRequirements.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkBindBufferMemory(
            VkDevice device,
            VkBuffer buffer,
            VkDeviceMemory memory,
            @unsigned long memoryOffset
    ) {
        try {
            return (int) HANDLE$vkBindBufferMemory.invoke(
                    device.handle(),
                    buffer.handle(),
                    memory.handle(),
                    memoryOffset
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkGetImageMemoryRequirements(
            VkDevice device,
            VkImage image,
            @pointer(target=VkMemoryRequirements.class) VkMemoryRequirements pMemoryRequirements
    ) {
        try {
            HANDLE$vkGetImageMemoryRequirements.invoke(
                    device.handle(),
                    image.handle(),
                    pMemoryRequirements != null ? pMemoryRequirements.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkBindImageMemory(
            VkDevice device,
            VkImage image,
            VkDeviceMemory memory,
            @unsigned long memoryOffset
    ) {
        try {
            return (int) HANDLE$vkBindImageMemory.invoke(
                    device.handle(),
                    image.handle(),
                    memory.handle(),
                    memoryOffset
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkGetImageSparseMemoryRequirements(
            VkDevice device,
            VkImage image,
            @pointer(target=IntPtr.class) @unsigned IntPtr pSparseMemoryRequirementCount,
            @pointer(target=VkSparseImageMemoryRequirements.class) VkSparseImageMemoryRequirements pSparseMemoryRequirements
    ) {
        try {
            HANDLE$vkGetImageSparseMemoryRequirements.invoke(
                    device.handle(),
                    image.handle(),
                    pSparseMemoryRequirementCount != null ? pSparseMemoryRequirementCount.segment() : MemorySegment.NULL,
                    pSparseMemoryRequirements != null ? pSparseMemoryRequirements.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkQueueBindSparse(
            VkQueue queue,
            @unsigned int bindInfoCount,
            @pointer(target=VkBindSparseInfo.class) VkBindSparseInfo pBindInfo,
            VkFence fence
    ) {
        try {
            return (int) HANDLE$vkQueueBindSparse.invoke(
                    queue.handle(),
                    bindInfoCount,
                    pBindInfo != null ? pBindInfo.segment() : MemorySegment.NULL,
                    fence.handle()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkCreateFence(
            VkDevice device,
            @pointer(target=VkFenceCreateInfo.class) VkFenceCreateInfo pCreateInfo,
            @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator,
            @pointer(target=VkFence.class) VkFence pFence
    ) {
        try {
            return (int) HANDLE$vkCreateFence.invoke(
                    device.handle(),
                    pCreateInfo != null ? pCreateInfo.segment() : MemorySegment.NULL,
                    pAllocator != null ? pAllocator.segment() : MemorySegment.NULL,
                    pFence != null ? pFence.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkDestroyFence(
            VkDevice device,
            VkFence fence,
            @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator
    ) {
        try {
            HANDLE$vkDestroyFence.invoke(
                    device.handle(),
                    fence.handle(),
                    pAllocator != null ? pAllocator.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkResetFences(
            VkDevice device,
            @unsigned int fenceCount,
            @pointer(target=VkFence.class) VkFence pFences
    ) {
        try {
            return (int) HANDLE$vkResetFences.invoke(
                    device.handle(),
                    fenceCount,
                    pFences != null ? pFences.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkGetFenceStatus(
            VkDevice device,
            VkFence fence
    ) {
        try {
            return (int) HANDLE$vkGetFenceStatus.invoke(
                    device.handle(),
                    fence.handle()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkWaitForFences(
            VkDevice device,
            @unsigned int fenceCount,
            @pointer(target=VkFence.class) VkFence pFences,
            @unsigned int waitAll,
            @unsigned long timeout
    ) {
        try {
            return (int) HANDLE$vkWaitForFences.invoke(
                    device.handle(),
                    fenceCount,
                    pFences != null ? pFences.segment() : MemorySegment.NULL,
                    waitAll,
                    timeout
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkCreateSemaphore(
            VkDevice device,
            @pointer(target=VkSemaphoreCreateInfo.class) VkSemaphoreCreateInfo pCreateInfo,
            @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator,
            @pointer(target=VkSemaphore.class) VkSemaphore pSemaphore
    ) {
        try {
            return (int) HANDLE$vkCreateSemaphore.invoke(
                    device.handle(),
                    pCreateInfo != null ? pCreateInfo.segment() : MemorySegment.NULL,
                    pAllocator != null ? pAllocator.segment() : MemorySegment.NULL,
                    pSemaphore != null ? pSemaphore.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkDestroySemaphore(
            VkDevice device,
            VkSemaphore semaphore,
            @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator
    ) {
        try {
            HANDLE$vkDestroySemaphore.invoke(
                    device.handle(),
                    semaphore.handle(),
                    pAllocator != null ? pAllocator.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkCreateEvent(
            VkDevice device,
            @pointer(target=VkEventCreateInfo.class) VkEventCreateInfo pCreateInfo,
            @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator,
            @pointer(target=VkEvent.class) VkEvent pEvent
    ) {
        try {
            return (int) HANDLE$vkCreateEvent.invoke(
                    device.handle(),
                    pCreateInfo != null ? pCreateInfo.segment() : MemorySegment.NULL,
                    pAllocator != null ? pAllocator.segment() : MemorySegment.NULL,
                    pEvent != null ? pEvent.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkDestroyEvent(
            VkDevice device,
            VkEvent event,
            @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator
    ) {
        try {
            HANDLE$vkDestroyEvent.invoke(
                    device.handle(),
                    event.handle(),
                    pAllocator != null ? pAllocator.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkGetEventStatus(
            VkDevice device,
            VkEvent event
    ) {
        try {
            return (int) HANDLE$vkGetEventStatus.invoke(
                    device.handle(),
                    event.handle()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkSetEvent(
            VkDevice device,
            VkEvent event
    ) {
        try {
            return (int) HANDLE$vkSetEvent.invoke(
                    device.handle(),
                    event.handle()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkResetEvent(
            VkDevice device,
            VkEvent event
    ) {
        try {
            return (int) HANDLE$vkResetEvent.invoke(
                    device.handle(),
                    event.handle()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkCreateQueryPool(
            VkDevice device,
            @pointer(target=VkQueryPoolCreateInfo.class) VkQueryPoolCreateInfo pCreateInfo,
            @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator,
            @pointer(target=VkQueryPool.class) VkQueryPool pQueryPool
    ) {
        try {
            return (int) HANDLE$vkCreateQueryPool.invoke(
                    device.handle(),
                    pCreateInfo != null ? pCreateInfo.segment() : MemorySegment.NULL,
                    pAllocator != null ? pAllocator.segment() : MemorySegment.NULL,
                    pQueryPool != null ? pQueryPool.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkDestroyQueryPool(
            VkDevice device,
            VkQueryPool queryPool,
            @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator
    ) {
        try {
            HANDLE$vkDestroyQueryPool.invoke(
                    device.handle(),
                    queryPool.handle(),
                    pAllocator != null ? pAllocator.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

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
            return (int) HANDLE$vkGetQueryPoolResults.invoke(
                    device.handle(),
                    queryPool.handle(),
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

    public void vkResetQueryPool(
            VkDevice device,
            VkQueryPool queryPool,
            @unsigned int firstQuery,
            @unsigned int queryCount
    ) {
        try {
            HANDLE$vkResetQueryPool.invoke(
                    device.handle(),
                    queryPool.handle(),
                    firstQuery,
                    queryCount
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkCreateBuffer(
            VkDevice device,
            @pointer(target=VkBufferCreateInfo.class) VkBufferCreateInfo pCreateInfo,
            @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator,
            @pointer(target=VkBuffer.class) VkBuffer pBuffer
    ) {
        try {
            return (int) HANDLE$vkCreateBuffer.invoke(
                    device.handle(),
                    pCreateInfo != null ? pCreateInfo.segment() : MemorySegment.NULL,
                    pAllocator != null ? pAllocator.segment() : MemorySegment.NULL,
                    pBuffer != null ? pBuffer.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkDestroyBuffer(
            VkDevice device,
            VkBuffer buffer,
            @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator
    ) {
        try {
            HANDLE$vkDestroyBuffer.invoke(
                    device.handle(),
                    buffer.handle(),
                    pAllocator != null ? pAllocator.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkCreateBufferView(
            VkDevice device,
            @pointer(target=VkBufferViewCreateInfo.class) VkBufferViewCreateInfo pCreateInfo,
            @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator,
            @pointer(target=VkBufferView.class) VkBufferView pView
    ) {
        try {
            return (int) HANDLE$vkCreateBufferView.invoke(
                    device.handle(),
                    pCreateInfo != null ? pCreateInfo.segment() : MemorySegment.NULL,
                    pAllocator != null ? pAllocator.segment() : MemorySegment.NULL,
                    pView != null ? pView.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkDestroyBufferView(
            VkDevice device,
            VkBufferView bufferView,
            @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator
    ) {
        try {
            HANDLE$vkDestroyBufferView.invoke(
                    device.handle(),
                    bufferView.handle(),
                    pAllocator != null ? pAllocator.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkCreateImage(
            VkDevice device,
            @pointer(target=VkImageCreateInfo.class) VkImageCreateInfo pCreateInfo,
            @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator,
            @pointer(target=VkImage.class) VkImage pImage
    ) {
        try {
            return (int) HANDLE$vkCreateImage.invoke(
                    device.handle(),
                    pCreateInfo != null ? pCreateInfo.segment() : MemorySegment.NULL,
                    pAllocator != null ? pAllocator.segment() : MemorySegment.NULL,
                    pImage != null ? pImage.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkDestroyImage(
            VkDevice device,
            VkImage image,
            @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator
    ) {
        try {
            HANDLE$vkDestroyImage.invoke(
                    device.handle(),
                    image.handle(),
                    pAllocator != null ? pAllocator.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkGetImageSubresourceLayout(
            VkDevice device,
            VkImage image,
            @pointer(target=VkImageSubresource.class) VkImageSubresource pSubresource,
            @pointer(target=VkSubresourceLayout.class) VkSubresourceLayout pLayout
    ) {
        try {
            HANDLE$vkGetImageSubresourceLayout.invoke(
                    device.handle(),
                    image.handle(),
                    pSubresource != null ? pSubresource.segment() : MemorySegment.NULL,
                    pLayout != null ? pLayout.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkCreateImageView(
            VkDevice device,
            @pointer(target=VkImageViewCreateInfo.class) VkImageViewCreateInfo pCreateInfo,
            @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator,
            @pointer(target=VkImageView.class) VkImageView pView
    ) {
        try {
            return (int) HANDLE$vkCreateImageView.invoke(
                    device.handle(),
                    pCreateInfo != null ? pCreateInfo.segment() : MemorySegment.NULL,
                    pAllocator != null ? pAllocator.segment() : MemorySegment.NULL,
                    pView != null ? pView.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkDestroyImageView(
            VkDevice device,
            VkImageView imageView,
            @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator
    ) {
        try {
            HANDLE$vkDestroyImageView.invoke(
                    device.handle(),
                    imageView.handle(),
                    pAllocator != null ? pAllocator.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkCreateShaderModule(
            VkDevice device,
            @pointer(target=VkShaderModuleCreateInfo.class) VkShaderModuleCreateInfo pCreateInfo,
            @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator,
            @pointer(target=VkShaderModule.class) VkShaderModule pShaderModule
    ) {
        try {
            return (int) HANDLE$vkCreateShaderModule.invoke(
                    device.handle(),
                    pCreateInfo != null ? pCreateInfo.segment() : MemorySegment.NULL,
                    pAllocator != null ? pAllocator.segment() : MemorySegment.NULL,
                    pShaderModule != null ? pShaderModule.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkDestroyShaderModule(
            VkDevice device,
            VkShaderModule shaderModule,
            @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator
    ) {
        try {
            HANDLE$vkDestroyShaderModule.invoke(
                    device.handle(),
                    shaderModule.handle(),
                    pAllocator != null ? pAllocator.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkCreatePipelineCache(
            VkDevice device,
            @pointer(target=VkPipelineCacheCreateInfo.class) VkPipelineCacheCreateInfo pCreateInfo,
            @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator,
            @pointer(target=VkPipelineCache.class) VkPipelineCache pPipelineCache
    ) {
        try {
            return (int) HANDLE$vkCreatePipelineCache.invoke(
                    device.handle(),
                    pCreateInfo != null ? pCreateInfo.segment() : MemorySegment.NULL,
                    pAllocator != null ? pAllocator.segment() : MemorySegment.NULL,
                    pPipelineCache != null ? pPipelineCache.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkDestroyPipelineCache(
            VkDevice device,
            VkPipelineCache pipelineCache,
            @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator
    ) {
        try {
            HANDLE$vkDestroyPipelineCache.invoke(
                    device.handle(),
                    pipelineCache.handle(),
                    pAllocator != null ? pAllocator.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkGetPipelineCacheData(
            VkDevice device,
            VkPipelineCache pipelineCache,
            @pointer(target=CSizeTPtr.class) CSizeTPtr pDataSize,
            @pointer(comment="void*") MemorySegment pData
    ) {
        try {
            return (int) HANDLE$vkGetPipelineCacheData.invoke(
                    device.handle(),
                    pipelineCache.handle(),
                    pDataSize != null ? pDataSize.segment() : MemorySegment.NULL,
                    pData
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkMergePipelineCaches(
            VkDevice device,
            VkPipelineCache dstCache,
            @unsigned int srcCacheCount,
            @pointer(target=VkPipelineCache.class) VkPipelineCache pSrcCaches
    ) {
        try {
            return (int) HANDLE$vkMergePipelineCaches.invoke(
                    device.handle(),
                    dstCache.handle(),
                    srcCacheCount,
                    pSrcCaches != null ? pSrcCaches.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkCreatePipelineBinariesKHR(
            VkDevice device,
            @pointer(target=VkPipelineBinaryCreateInfoKHR.class) VkPipelineBinaryCreateInfoKHR pCreateInfo,
            @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator,
            @pointer(target=VkPipelineBinaryHandlesInfoKHR.class) VkPipelineBinaryHandlesInfoKHR pBinaries
    ) {
        try {
            return (int) HANDLE$vkCreatePipelineBinariesKHR.invoke(
                    device.handle(),
                    pCreateInfo != null ? pCreateInfo.segment() : MemorySegment.NULL,
                    pAllocator != null ? pAllocator.segment() : MemorySegment.NULL,
                    pBinaries != null ? pBinaries.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkDestroyPipelineBinaryKHR(
            VkDevice device,
            VkPipelineBinaryKHR pipelineBinary,
            @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator
    ) {
        try {
            HANDLE$vkDestroyPipelineBinaryKHR.invoke(
                    device.handle(),
                    pipelineBinary.handle(),
                    pAllocator != null ? pAllocator.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkGetPipelineKeyKHR(
            VkDevice device,
            @pointer(target=VkPipelineCreateInfoKHR.class) VkPipelineCreateInfoKHR pPipelineCreateInfo,
            @pointer(target=VkPipelineBinaryKeyKHR.class) VkPipelineBinaryKeyKHR pPipelineKey
    ) {
        try {
            return (int) HANDLE$vkGetPipelineKeyKHR.invoke(
                    device.handle(),
                    pPipelineCreateInfo != null ? pPipelineCreateInfo.segment() : MemorySegment.NULL,
                    pPipelineKey != null ? pPipelineKey.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkGetPipelineBinaryDataKHR(
            VkDevice device,
            @pointer(target=VkPipelineBinaryDataInfoKHR.class) VkPipelineBinaryDataInfoKHR pInfo,
            @pointer(target=VkPipelineBinaryKeyKHR.class) VkPipelineBinaryKeyKHR pPipelineBinaryKey,
            @pointer(target=CSizeTPtr.class) CSizeTPtr pPipelineBinaryDataSize,
            @pointer(comment="void*") MemorySegment pPipelineBinaryData
    ) {
        try {
            return (int) HANDLE$vkGetPipelineBinaryDataKHR.invoke(
                    device.handle(),
                    pInfo != null ? pInfo.segment() : MemorySegment.NULL,
                    pPipelineBinaryKey != null ? pPipelineBinaryKey.segment() : MemorySegment.NULL,
                    pPipelineBinaryDataSize != null ? pPipelineBinaryDataSize.segment() : MemorySegment.NULL,
                    pPipelineBinaryData
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkReleaseCapturedPipelineDataKHR(
            VkDevice device,
            @pointer(target=VkReleaseCapturedPipelineDataInfoKHR.class) VkReleaseCapturedPipelineDataInfoKHR pInfo,
            @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator
    ) {
        try {
            return (int) HANDLE$vkReleaseCapturedPipelineDataKHR.invoke(
                    device.handle(),
                    pInfo != null ? pInfo.segment() : MemorySegment.NULL,
                    pAllocator != null ? pAllocator.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkCreateGraphicsPipelines(
            VkDevice device,
            VkPipelineCache pipelineCache,
            @unsigned int createInfoCount,
            @pointer(target=VkGraphicsPipelineCreateInfo.class) VkGraphicsPipelineCreateInfo pCreateInfos,
            @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator,
            @pointer(target=VkPipeline.class) VkPipeline pPipelines
    ) {
        try {
            return (int) HANDLE$vkCreateGraphicsPipelines.invoke(
                    device.handle(),
                    pipelineCache.handle(),
                    createInfoCount,
                    pCreateInfos != null ? pCreateInfos.segment() : MemorySegment.NULL,
                    pAllocator != null ? pAllocator.segment() : MemorySegment.NULL,
                    pPipelines != null ? pPipelines.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkCreateComputePipelines(
            VkDevice device,
            VkPipelineCache pipelineCache,
            @unsigned int createInfoCount,
            @pointer(target=VkComputePipelineCreateInfo.class) VkComputePipelineCreateInfo pCreateInfos,
            @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator,
            @pointer(target=VkPipeline.class) VkPipeline pPipelines
    ) {
        try {
            return (int) HANDLE$vkCreateComputePipelines.invoke(
                    device.handle(),
                    pipelineCache.handle(),
                    createInfoCount,
                    pCreateInfos != null ? pCreateInfos.segment() : MemorySegment.NULL,
                    pAllocator != null ? pAllocator.segment() : MemorySegment.NULL,
                    pPipelines != null ? pPipelines.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkGetDeviceSubpassShadingMaxWorkgroupSizeHUAWEI(
            VkDevice device,
            VkRenderPass renderpass,
            @pointer(target=VkExtent2D.class) VkExtent2D pMaxWorkgroupSize
    ) {
        try {
            return (int) HANDLE$vkGetDeviceSubpassShadingMaxWorkgroupSizeHUAWEI.invoke(
                    device.handle(),
                    renderpass.handle(),
                    pMaxWorkgroupSize != null ? pMaxWorkgroupSize.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkDestroyPipeline(
            VkDevice device,
            VkPipeline pipeline,
            @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator
    ) {
        try {
            HANDLE$vkDestroyPipeline.invoke(
                    device.handle(),
                    pipeline.handle(),
                    pAllocator != null ? pAllocator.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkCreatePipelineLayout(
            VkDevice device,
            @pointer(target=VkPipelineLayoutCreateInfo.class) VkPipelineLayoutCreateInfo pCreateInfo,
            @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator,
            @pointer(target=VkPipelineLayout.class) VkPipelineLayout pPipelineLayout
    ) {
        try {
            return (int) HANDLE$vkCreatePipelineLayout.invoke(
                    device.handle(),
                    pCreateInfo != null ? pCreateInfo.segment() : MemorySegment.NULL,
                    pAllocator != null ? pAllocator.segment() : MemorySegment.NULL,
                    pPipelineLayout != null ? pPipelineLayout.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkDestroyPipelineLayout(
            VkDevice device,
            VkPipelineLayout pipelineLayout,
            @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator
    ) {
        try {
            HANDLE$vkDestroyPipelineLayout.invoke(
                    device.handle(),
                    pipelineLayout.handle(),
                    pAllocator != null ? pAllocator.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkCreateSampler(
            VkDevice device,
            @pointer(target=VkSamplerCreateInfo.class) VkSamplerCreateInfo pCreateInfo,
            @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator,
            @pointer(target=VkSampler.class) VkSampler pSampler
    ) {
        try {
            return (int) HANDLE$vkCreateSampler.invoke(
                    device.handle(),
                    pCreateInfo != null ? pCreateInfo.segment() : MemorySegment.NULL,
                    pAllocator != null ? pAllocator.segment() : MemorySegment.NULL,
                    pSampler != null ? pSampler.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkDestroySampler(
            VkDevice device,
            VkSampler sampler,
            @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator
    ) {
        try {
            HANDLE$vkDestroySampler.invoke(
                    device.handle(),
                    sampler.handle(),
                    pAllocator != null ? pAllocator.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkCreateDescriptorSetLayout(
            VkDevice device,
            @pointer(target=VkDescriptorSetLayoutCreateInfo.class) VkDescriptorSetLayoutCreateInfo pCreateInfo,
            @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator,
            @pointer(target=VkDescriptorSetLayout.class) VkDescriptorSetLayout pSetLayout
    ) {
        try {
            return (int) HANDLE$vkCreateDescriptorSetLayout.invoke(
                    device.handle(),
                    pCreateInfo != null ? pCreateInfo.segment() : MemorySegment.NULL,
                    pAllocator != null ? pAllocator.segment() : MemorySegment.NULL,
                    pSetLayout != null ? pSetLayout.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkDestroyDescriptorSetLayout(
            VkDevice device,
            VkDescriptorSetLayout descriptorSetLayout,
            @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator
    ) {
        try {
            HANDLE$vkDestroyDescriptorSetLayout.invoke(
                    device.handle(),
                    descriptorSetLayout.handle(),
                    pAllocator != null ? pAllocator.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkCreateDescriptorPool(
            VkDevice device,
            @pointer(target=VkDescriptorPoolCreateInfo.class) VkDescriptorPoolCreateInfo pCreateInfo,
            @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator,
            @pointer(target=VkDescriptorPool.class) VkDescriptorPool pDescriptorPool
    ) {
        try {
            return (int) HANDLE$vkCreateDescriptorPool.invoke(
                    device.handle(),
                    pCreateInfo != null ? pCreateInfo.segment() : MemorySegment.NULL,
                    pAllocator != null ? pAllocator.segment() : MemorySegment.NULL,
                    pDescriptorPool != null ? pDescriptorPool.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkDestroyDescriptorPool(
            VkDevice device,
            VkDescriptorPool descriptorPool,
            @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator
    ) {
        try {
            HANDLE$vkDestroyDescriptorPool.invoke(
                    device.handle(),
                    descriptorPool.handle(),
                    pAllocator != null ? pAllocator.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkResetDescriptorPool(
            VkDevice device,
            VkDescriptorPool descriptorPool,
            @enumtype(VkDescriptorPoolResetFlags.class) int flags
    ) {
        try {
            return (int) HANDLE$vkResetDescriptorPool.invoke(
                    device.handle(),
                    descriptorPool.handle(),
                    flags
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkAllocateDescriptorSets(
            VkDevice device,
            @pointer(target=VkDescriptorSetAllocateInfo.class) VkDescriptorSetAllocateInfo pAllocateInfo,
            @pointer(target=VkDescriptorSet.class) VkDescriptorSet pDescriptorSets
    ) {
        try {
            return (int) HANDLE$vkAllocateDescriptorSets.invoke(
                    device.handle(),
                    pAllocateInfo != null ? pAllocateInfo.segment() : MemorySegment.NULL,
                    pDescriptorSets != null ? pDescriptorSets.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkFreeDescriptorSets(
            VkDevice device,
            VkDescriptorPool descriptorPool,
            @unsigned int descriptorSetCount,
            @pointer(target=VkDescriptorSet.class) VkDescriptorSet pDescriptorSets
    ) {
        try {
            return (int) HANDLE$vkFreeDescriptorSets.invoke(
                    device.handle(),
                    descriptorPool.handle(),
                    descriptorSetCount,
                    pDescriptorSets != null ? pDescriptorSets.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkUpdateDescriptorSets(
            VkDevice device,
            @unsigned int descriptorWriteCount,
            @pointer(target=VkWriteDescriptorSet.class) VkWriteDescriptorSet pDescriptorWrites,
            @unsigned int descriptorCopyCount,
            @pointer(target=VkCopyDescriptorSet.class) VkCopyDescriptorSet pDescriptorCopies
    ) {
        try {
            HANDLE$vkUpdateDescriptorSets.invoke(
                    device.handle(),
                    descriptorWriteCount,
                    pDescriptorWrites != null ? pDescriptorWrites.segment() : MemorySegment.NULL,
                    descriptorCopyCount,
                    pDescriptorCopies != null ? pDescriptorCopies.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkCreateFramebuffer(
            VkDevice device,
            @pointer(target=VkFramebufferCreateInfo.class) VkFramebufferCreateInfo pCreateInfo,
            @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator,
            @pointer(target=VkFramebuffer.class) VkFramebuffer pFramebuffer
    ) {
        try {
            return (int) HANDLE$vkCreateFramebuffer.invoke(
                    device.handle(),
                    pCreateInfo != null ? pCreateInfo.segment() : MemorySegment.NULL,
                    pAllocator != null ? pAllocator.segment() : MemorySegment.NULL,
                    pFramebuffer != null ? pFramebuffer.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkDestroyFramebuffer(
            VkDevice device,
            VkFramebuffer framebuffer,
            @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator
    ) {
        try {
            HANDLE$vkDestroyFramebuffer.invoke(
                    device.handle(),
                    framebuffer.handle(),
                    pAllocator != null ? pAllocator.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkCreateRenderPass(
            VkDevice device,
            @pointer(target=VkRenderPassCreateInfo.class) VkRenderPassCreateInfo pCreateInfo,
            @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator,
            @pointer(target=VkRenderPass.class) VkRenderPass pRenderPass
    ) {
        try {
            return (int) HANDLE$vkCreateRenderPass.invoke(
                    device.handle(),
                    pCreateInfo != null ? pCreateInfo.segment() : MemorySegment.NULL,
                    pAllocator != null ? pAllocator.segment() : MemorySegment.NULL,
                    pRenderPass != null ? pRenderPass.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkDestroyRenderPass(
            VkDevice device,
            VkRenderPass renderPass,
            @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator
    ) {
        try {
            HANDLE$vkDestroyRenderPass.invoke(
                    device.handle(),
                    renderPass.handle(),
                    pAllocator != null ? pAllocator.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkGetRenderAreaGranularity(
            VkDevice device,
            VkRenderPass renderPass,
            @pointer(target=VkExtent2D.class) VkExtent2D pGranularity
    ) {
        try {
            HANDLE$vkGetRenderAreaGranularity.invoke(
                    device.handle(),
                    renderPass.handle(),
                    pGranularity != null ? pGranularity.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkGetRenderingAreaGranularityKHR(
            VkDevice device,
            @pointer(target=VkRenderingAreaInfoKHR.class) VkRenderingAreaInfoKHR pRenderingAreaInfo,
            @pointer(target=VkExtent2D.class) VkExtent2D pGranularity
    ) {
        try {
            HANDLE$vkGetRenderingAreaGranularityKHR.invoke(
                    device.handle(),
                    pRenderingAreaInfo != null ? pRenderingAreaInfo.segment() : MemorySegment.NULL,
                    pGranularity != null ? pGranularity.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkCreateCommandPool(
            VkDevice device,
            @pointer(target=VkCommandPoolCreateInfo.class) VkCommandPoolCreateInfo pCreateInfo,
            @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator,
            @pointer(target=VkCommandPool.class) VkCommandPool pCommandPool
    ) {
        try {
            return (int) HANDLE$vkCreateCommandPool.invoke(
                    device.handle(),
                    pCreateInfo != null ? pCreateInfo.segment() : MemorySegment.NULL,
                    pAllocator != null ? pAllocator.segment() : MemorySegment.NULL,
                    pCommandPool != null ? pCommandPool.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkDestroyCommandPool(
            VkDevice device,
            VkCommandPool commandPool,
            @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator
    ) {
        try {
            HANDLE$vkDestroyCommandPool.invoke(
                    device.handle(),
                    commandPool.handle(),
                    pAllocator != null ? pAllocator.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkResetCommandPool(
            VkDevice device,
            VkCommandPool commandPool,
            @enumtype(VkCommandPoolResetFlags.class) int flags
    ) {
        try {
            return (int) HANDLE$vkResetCommandPool.invoke(
                    device.handle(),
                    commandPool.handle(),
                    flags
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkAllocateCommandBuffers(
            VkDevice device,
            @pointer(target=VkCommandBufferAllocateInfo.class) VkCommandBufferAllocateInfo pAllocateInfo,
            @pointer(target=VkCommandBuffer.class) VkCommandBuffer pCommandBuffers
    ) {
        try {
            return (int) HANDLE$vkAllocateCommandBuffers.invoke(
                    device.handle(),
                    pAllocateInfo != null ? pAllocateInfo.segment() : MemorySegment.NULL,
                    pCommandBuffers != null ? pCommandBuffers.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkFreeCommandBuffers(
            VkDevice device,
            VkCommandPool commandPool,
            @unsigned int commandBufferCount,
            @pointer(target=VkCommandBuffer.class) VkCommandBuffer pCommandBuffers
    ) {
        try {
            HANDLE$vkFreeCommandBuffers.invoke(
                    device.handle(),
                    commandPool.handle(),
                    commandBufferCount,
                    pCommandBuffers != null ? pCommandBuffers.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkBeginCommandBuffer(
            VkCommandBuffer commandBuffer,
            @pointer(target=VkCommandBufferBeginInfo.class) VkCommandBufferBeginInfo pBeginInfo
    ) {
        try {
            return (int) HANDLE$vkBeginCommandBuffer.invoke(
                    commandBuffer.handle(),
                    pBeginInfo != null ? pBeginInfo.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkEndCommandBuffer(
            VkCommandBuffer commandBuffer
    ) {
        try {
            return (int) HANDLE$vkEndCommandBuffer.invoke(
                    commandBuffer.handle()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkResetCommandBuffer(
            VkCommandBuffer commandBuffer,
            @enumtype(VkCommandBufferResetFlags.class) int flags
    ) {
        try {
            return (int) HANDLE$vkResetCommandBuffer.invoke(
                    commandBuffer.handle(),
                    flags
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdBindPipeline(
            VkCommandBuffer commandBuffer,
            @enumtype(VkPipelineBindPoint.class) int pipelineBindPoint,
            VkPipeline pipeline
    ) {
        try {
            HANDLE$vkCmdBindPipeline.invoke(
                    commandBuffer.handle(),
                    pipelineBindPoint,
                    pipeline.handle()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdSetAttachmentFeedbackLoopEnableEXT(
            VkCommandBuffer commandBuffer,
            @enumtype(VkImageAspectFlags.class) int aspectMask
    ) {
        try {
            HANDLE$vkCmdSetAttachmentFeedbackLoopEnableEXT.invoke(
                    commandBuffer.handle(),
                    aspectMask
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdSetViewport(
            VkCommandBuffer commandBuffer,
            @unsigned int firstViewport,
            @unsigned int viewportCount,
            @pointer(target=VkViewport.class) VkViewport pViewports
    ) {
        try {
            HANDLE$vkCmdSetViewport.invoke(
                    commandBuffer.handle(),
                    firstViewport,
                    viewportCount,
                    pViewports != null ? pViewports.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdSetScissor(
            VkCommandBuffer commandBuffer,
            @unsigned int firstScissor,
            @unsigned int scissorCount,
            @pointer(target=VkRect2D.class) VkRect2D pScissors
    ) {
        try {
            HANDLE$vkCmdSetScissor.invoke(
                    commandBuffer.handle(),
                    firstScissor,
                    scissorCount,
                    pScissors != null ? pScissors.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdSetLineWidth(
            VkCommandBuffer commandBuffer,
            float lineWidth
    ) {
        try {
            HANDLE$vkCmdSetLineWidth.invoke(
                    commandBuffer.handle(),
                    lineWidth
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdSetDepthBias(
            VkCommandBuffer commandBuffer,
            float depthBiasConstantFactor,
            float depthBiasClamp,
            float depthBiasSlopeFactor
    ) {
        try {
            HANDLE$vkCmdSetDepthBias.invoke(
                    commandBuffer.handle(),
                    depthBiasConstantFactor,
                    depthBiasClamp,
                    depthBiasSlopeFactor
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdSetBlendConstants(
            VkCommandBuffer commandBuffer,
            FloatArray blendConstants
    ) {
        try {
            HANDLE$vkCmdSetBlendConstants.invoke(
                    commandBuffer.handle(),
                    blendConstants.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdSetDepthBounds(
            VkCommandBuffer commandBuffer,
            float minDepthBounds,
            float maxDepthBounds
    ) {
        try {
            HANDLE$vkCmdSetDepthBounds.invoke(
                    commandBuffer.handle(),
                    minDepthBounds,
                    maxDepthBounds
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdSetStencilCompareMask(
            VkCommandBuffer commandBuffer,
            @enumtype(VkStencilFaceFlags.class) int faceMask,
            @unsigned int compareMask
    ) {
        try {
            HANDLE$vkCmdSetStencilCompareMask.invoke(
                    commandBuffer.handle(),
                    faceMask,
                    compareMask
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdSetStencilWriteMask(
            VkCommandBuffer commandBuffer,
            @enumtype(VkStencilFaceFlags.class) int faceMask,
            @unsigned int writeMask
    ) {
        try {
            HANDLE$vkCmdSetStencilWriteMask.invoke(
                    commandBuffer.handle(),
                    faceMask,
                    writeMask
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdSetStencilReference(
            VkCommandBuffer commandBuffer,
            @enumtype(VkStencilFaceFlags.class) int faceMask,
            @unsigned int reference
    ) {
        try {
            HANDLE$vkCmdSetStencilReference.invoke(
                    commandBuffer.handle(),
                    faceMask,
                    reference
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdBindDescriptorSets(
            VkCommandBuffer commandBuffer,
            @enumtype(VkPipelineBindPoint.class) int pipelineBindPoint,
            VkPipelineLayout layout,
            @unsigned int firstSet,
            @unsigned int descriptorSetCount,
            @pointer(target=VkDescriptorSet.class) VkDescriptorSet pDescriptorSets,
            @unsigned int dynamicOffsetCount,
            @pointer(target=IntPtr.class) @unsigned IntPtr pDynamicOffsets
    ) {
        try {
            HANDLE$vkCmdBindDescriptorSets.invoke(
                    commandBuffer.handle(),
                    pipelineBindPoint,
                    layout.handle(),
                    firstSet,
                    descriptorSetCount,
                    pDescriptorSets != null ? pDescriptorSets.segment() : MemorySegment.NULL,
                    dynamicOffsetCount,
                    pDynamicOffsets != null ? pDynamicOffsets.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdBindIndexBuffer(
            VkCommandBuffer commandBuffer,
            VkBuffer buffer,
            @unsigned long offset,
            @enumtype(VkIndexType.class) int indexType
    ) {
        try {
            HANDLE$vkCmdBindIndexBuffer.invoke(
                    commandBuffer.handle(),
                    buffer.handle(),
                    offset,
                    indexType
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdBindVertexBuffers(
            VkCommandBuffer commandBuffer,
            @unsigned int firstBinding,
            @unsigned int bindingCount,
            @pointer(target=VkBuffer.class) VkBuffer pBuffers,
            @pointer(target=LongPtr.class) @unsigned LongPtr pOffsets
    ) {
        try {
            HANDLE$vkCmdBindVertexBuffers.invoke(
                    commandBuffer.handle(),
                    firstBinding,
                    bindingCount,
                    pBuffers != null ? pBuffers.segment() : MemorySegment.NULL,
                    pOffsets != null ? pOffsets.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdDraw(
            VkCommandBuffer commandBuffer,
            @unsigned int vertexCount,
            @unsigned int instanceCount,
            @unsigned int firstVertex,
            @unsigned int firstInstance
    ) {
        try {
            HANDLE$vkCmdDraw.invoke(
                    commandBuffer.handle(),
                    vertexCount,
                    instanceCount,
                    firstVertex,
                    firstInstance
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdDrawIndexed(
            VkCommandBuffer commandBuffer,
            @unsigned int indexCount,
            @unsigned int instanceCount,
            @unsigned int firstIndex,
            int vertexOffset,
            @unsigned int firstInstance
    ) {
        try {
            HANDLE$vkCmdDrawIndexed.invoke(
                    commandBuffer.handle(),
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

    public void vkCmdDrawMultiEXT(
            VkCommandBuffer commandBuffer,
            @unsigned int drawCount,
            @pointer(target=VkMultiDrawInfoEXT.class) VkMultiDrawInfoEXT pVertexInfo,
            @unsigned int instanceCount,
            @unsigned int firstInstance,
            @unsigned int stride
    ) {
        try {
            HANDLE$vkCmdDrawMultiEXT.invoke(
                    commandBuffer.handle(),
                    drawCount,
                    pVertexInfo != null ? pVertexInfo.segment() : MemorySegment.NULL,
                    instanceCount,
                    firstInstance,
                    stride
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdDrawMultiIndexedEXT(
            VkCommandBuffer commandBuffer,
            @unsigned int drawCount,
            @pointer(target=VkMultiDrawIndexedInfoEXT.class) VkMultiDrawIndexedInfoEXT pIndexInfo,
            @unsigned int instanceCount,
            @unsigned int firstInstance,
            @unsigned int stride,
            @pointer(target=IntPtr.class) IntPtr pVertexOffset
    ) {
        try {
            HANDLE$vkCmdDrawMultiIndexedEXT.invoke(
                    commandBuffer.handle(),
                    drawCount,
                    pIndexInfo != null ? pIndexInfo.segment() : MemorySegment.NULL,
                    instanceCount,
                    firstInstance,
                    stride,
                    pVertexOffset != null ? pVertexOffset.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdDrawIndirect(
            VkCommandBuffer commandBuffer,
            VkBuffer buffer,
            @unsigned long offset,
            @unsigned int drawCount,
            @unsigned int stride
    ) {
        try {
            HANDLE$vkCmdDrawIndirect.invoke(
                    commandBuffer.handle(),
                    buffer.handle(),
                    offset,
                    drawCount,
                    stride
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdDrawIndexedIndirect(
            VkCommandBuffer commandBuffer,
            VkBuffer buffer,
            @unsigned long offset,
            @unsigned int drawCount,
            @unsigned int stride
    ) {
        try {
            HANDLE$vkCmdDrawIndexedIndirect.invoke(
                    commandBuffer.handle(),
                    buffer.handle(),
                    offset,
                    drawCount,
                    stride
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdDispatch(
            VkCommandBuffer commandBuffer,
            @unsigned int groupCountX,
            @unsigned int groupCountY,
            @unsigned int groupCountZ
    ) {
        try {
            HANDLE$vkCmdDispatch.invoke(
                    commandBuffer.handle(),
                    groupCountX,
                    groupCountY,
                    groupCountZ
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdDispatchIndirect(
            VkCommandBuffer commandBuffer,
            VkBuffer buffer,
            @unsigned long offset
    ) {
        try {
            HANDLE$vkCmdDispatchIndirect.invoke(
                    commandBuffer.handle(),
                    buffer.handle(),
                    offset
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdSubpassShadingHUAWEI(
            VkCommandBuffer commandBuffer
    ) {
        try {
            HANDLE$vkCmdSubpassShadingHUAWEI.invoke(
                    commandBuffer.handle()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdDrawClusterHUAWEI(
            VkCommandBuffer commandBuffer,
            @unsigned int groupCountX,
            @unsigned int groupCountY,
            @unsigned int groupCountZ
    ) {
        try {
            HANDLE$vkCmdDrawClusterHUAWEI.invoke(
                    commandBuffer.handle(),
                    groupCountX,
                    groupCountY,
                    groupCountZ
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdDrawClusterIndirectHUAWEI(
            VkCommandBuffer commandBuffer,
            VkBuffer buffer,
            @unsigned long offset
    ) {
        try {
            HANDLE$vkCmdDrawClusterIndirectHUAWEI.invoke(
                    commandBuffer.handle(),
                    buffer.handle(),
                    offset
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdUpdatePipelineIndirectBufferNV(
            VkCommandBuffer commandBuffer,
            @enumtype(VkPipelineBindPoint.class) int pipelineBindPoint,
            VkPipeline pipeline
    ) {
        try {
            HANDLE$vkCmdUpdatePipelineIndirectBufferNV.invoke(
                    commandBuffer.handle(),
                    pipelineBindPoint,
                    pipeline.handle()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdCopyBuffer(
            VkCommandBuffer commandBuffer,
            VkBuffer srcBuffer,
            VkBuffer dstBuffer,
            @unsigned int regionCount,
            @pointer(target=VkBufferCopy.class) VkBufferCopy pRegions
    ) {
        try {
            HANDLE$vkCmdCopyBuffer.invoke(
                    commandBuffer.handle(),
                    srcBuffer.handle(),
                    dstBuffer.handle(),
                    regionCount,
                    pRegions != null ? pRegions.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

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
            HANDLE$vkCmdCopyImage.invoke(
                    commandBuffer.handle(),
                    srcImage.handle(),
                    srcImageLayout,
                    dstImage.handle(),
                    dstImageLayout,
                    regionCount,
                    pRegions != null ? pRegions.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

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
            HANDLE$vkCmdBlitImage.invoke(
                    commandBuffer.handle(),
                    srcImage.handle(),
                    srcImageLayout,
                    dstImage.handle(),
                    dstImageLayout,
                    regionCount,
                    pRegions != null ? pRegions.segment() : MemorySegment.NULL,
                    filter
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdCopyBufferToImage(
            VkCommandBuffer commandBuffer,
            VkBuffer srcBuffer,
            VkImage dstImage,
            @enumtype(VkImageLayout.class) int dstImageLayout,
            @unsigned int regionCount,
            @pointer(target=VkBufferImageCopy.class) VkBufferImageCopy pRegions
    ) {
        try {
            HANDLE$vkCmdCopyBufferToImage.invoke(
                    commandBuffer.handle(),
                    srcBuffer.handle(),
                    dstImage.handle(),
                    dstImageLayout,
                    regionCount,
                    pRegions != null ? pRegions.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdCopyImageToBuffer(
            VkCommandBuffer commandBuffer,
            VkImage srcImage,
            @enumtype(VkImageLayout.class) int srcImageLayout,
            VkBuffer dstBuffer,
            @unsigned int regionCount,
            @pointer(target=VkBufferImageCopy.class) VkBufferImageCopy pRegions
    ) {
        try {
            HANDLE$vkCmdCopyImageToBuffer.invoke(
                    commandBuffer.handle(),
                    srcImage.handle(),
                    srcImageLayout,
                    dstBuffer.handle(),
                    regionCount,
                    pRegions != null ? pRegions.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdCopyMemoryIndirectNV(
            VkCommandBuffer commandBuffer,
            @unsigned long copyBufferAddress,
            @unsigned int copyCount,
            @unsigned int stride
    ) {
        try {
            HANDLE$vkCmdCopyMemoryIndirectNV.invoke(
                    commandBuffer.handle(),
                    copyBufferAddress,
                    copyCount,
                    stride
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

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
            HANDLE$vkCmdCopyMemoryToImageIndirectNV.invoke(
                    commandBuffer.handle(),
                    copyBufferAddress,
                    copyCount,
                    stride,
                    dstImage.handle(),
                    dstImageLayout,
                    pImageSubresources != null ? pImageSubresources.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdUpdateBuffer(
            VkCommandBuffer commandBuffer,
            VkBuffer dstBuffer,
            @unsigned long dstOffset,
            @unsigned long dataSize,
            @pointer(comment="void*") MemorySegment pData
    ) {
        try {
            HANDLE$vkCmdUpdateBuffer.invoke(
                    commandBuffer.handle(),
                    dstBuffer.handle(),
                    dstOffset,
                    dataSize,
                    pData
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdFillBuffer(
            VkCommandBuffer commandBuffer,
            VkBuffer dstBuffer,
            @unsigned long dstOffset,
            @unsigned long size,
            @unsigned int data
    ) {
        try {
            HANDLE$vkCmdFillBuffer.invoke(
                    commandBuffer.handle(),
                    dstBuffer.handle(),
                    dstOffset,
                    size,
                    data
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdClearColorImage(
            VkCommandBuffer commandBuffer,
            VkImage image,
            @enumtype(VkImageLayout.class) int imageLayout,
            @pointer(target=VkClearColorValue.class) VkClearColorValue pColor,
            @unsigned int rangeCount,
            @pointer(target=VkImageSubresourceRange.class) VkImageSubresourceRange pRanges
    ) {
        try {
            HANDLE$vkCmdClearColorImage.invoke(
                    commandBuffer.handle(),
                    image.handle(),
                    imageLayout,
                    pColor != null ? pColor.segment() : MemorySegment.NULL,
                    rangeCount,
                    pRanges != null ? pRanges.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdClearDepthStencilImage(
            VkCommandBuffer commandBuffer,
            VkImage image,
            @enumtype(VkImageLayout.class) int imageLayout,
            @pointer(target=VkClearDepthStencilValue.class) VkClearDepthStencilValue pDepthStencil,
            @unsigned int rangeCount,
            @pointer(target=VkImageSubresourceRange.class) VkImageSubresourceRange pRanges
    ) {
        try {
            HANDLE$vkCmdClearDepthStencilImage.invoke(
                    commandBuffer.handle(),
                    image.handle(),
                    imageLayout,
                    pDepthStencil != null ? pDepthStencil.segment() : MemorySegment.NULL,
                    rangeCount,
                    pRanges != null ? pRanges.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdClearAttachments(
            VkCommandBuffer commandBuffer,
            @unsigned int attachmentCount,
            @pointer(target=VkClearAttachment.class) VkClearAttachment pAttachments,
            @unsigned int rectCount,
            @pointer(target=VkClearRect.class) VkClearRect pRects
    ) {
        try {
            HANDLE$vkCmdClearAttachments.invoke(
                    commandBuffer.handle(),
                    attachmentCount,
                    pAttachments != null ? pAttachments.segment() : MemorySegment.NULL,
                    rectCount,
                    pRects != null ? pRects.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

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
            HANDLE$vkCmdResolveImage.invoke(
                    commandBuffer.handle(),
                    srcImage.handle(),
                    srcImageLayout,
                    dstImage.handle(),
                    dstImageLayout,
                    regionCount,
                    pRegions != null ? pRegions.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdSetEvent(
            VkCommandBuffer commandBuffer,
            VkEvent event,
            @enumtype(VkPipelineStageFlags.class) int stageMask
    ) {
        try {
            HANDLE$vkCmdSetEvent.invoke(
                    commandBuffer.handle(),
                    event.handle(),
                    stageMask
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdResetEvent(
            VkCommandBuffer commandBuffer,
            VkEvent event,
            @enumtype(VkPipelineStageFlags.class) int stageMask
    ) {
        try {
            HANDLE$vkCmdResetEvent.invoke(
                    commandBuffer.handle(),
                    event.handle(),
                    stageMask
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdWaitEvents(
            VkCommandBuffer commandBuffer,
            @unsigned int eventCount,
            @pointer(target=VkEvent.class) VkEvent pEvents,
            @enumtype(VkPipelineStageFlags.class) int srcStageMask,
            @enumtype(VkPipelineStageFlags.class) int dstStageMask,
            @unsigned int memoryBarrierCount,
            @pointer(target=VkMemoryBarrier.class) VkMemoryBarrier pMemoryBarriers,
            @unsigned int bufferMemoryBarrierCount,
            @pointer(target=VkBufferMemoryBarrier.class) VkBufferMemoryBarrier pBufferMemoryBarriers,
            @unsigned int imageMemoryBarrierCount,
            @pointer(target=VkImageMemoryBarrier.class) VkImageMemoryBarrier pImageMemoryBarriers
    ) {
        try {
            HANDLE$vkCmdWaitEvents.invoke(
                    commandBuffer.handle(),
                    eventCount,
                    pEvents != null ? pEvents.segment() : MemorySegment.NULL,
                    srcStageMask,
                    dstStageMask,
                    memoryBarrierCount,
                    pMemoryBarriers != null ? pMemoryBarriers.segment() : MemorySegment.NULL,
                    bufferMemoryBarrierCount,
                    pBufferMemoryBarriers != null ? pBufferMemoryBarriers.segment() : MemorySegment.NULL,
                    imageMemoryBarrierCount,
                    pImageMemoryBarriers != null ? pImageMemoryBarriers.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdPipelineBarrier(
            VkCommandBuffer commandBuffer,
            @enumtype(VkPipelineStageFlags.class) int srcStageMask,
            @enumtype(VkPipelineStageFlags.class) int dstStageMask,
            @enumtype(VkDependencyFlags.class) int dependencyFlags,
            @unsigned int memoryBarrierCount,
            @pointer(target=VkMemoryBarrier.class) VkMemoryBarrier pMemoryBarriers,
            @unsigned int bufferMemoryBarrierCount,
            @pointer(target=VkBufferMemoryBarrier.class) VkBufferMemoryBarrier pBufferMemoryBarriers,
            @unsigned int imageMemoryBarrierCount,
            @pointer(target=VkImageMemoryBarrier.class) VkImageMemoryBarrier pImageMemoryBarriers
    ) {
        try {
            HANDLE$vkCmdPipelineBarrier.invoke(
                    commandBuffer.handle(),
                    srcStageMask,
                    dstStageMask,
                    dependencyFlags,
                    memoryBarrierCount,
                    pMemoryBarriers != null ? pMemoryBarriers.segment() : MemorySegment.NULL,
                    bufferMemoryBarrierCount,
                    pBufferMemoryBarriers != null ? pBufferMemoryBarriers.segment() : MemorySegment.NULL,
                    imageMemoryBarrierCount,
                    pImageMemoryBarriers != null ? pImageMemoryBarriers.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdBeginQuery(
            VkCommandBuffer commandBuffer,
            VkQueryPool queryPool,
            @unsigned int query,
            @enumtype(VkQueryControlFlags.class) int flags
    ) {
        try {
            HANDLE$vkCmdBeginQuery.invoke(
                    commandBuffer.handle(),
                    queryPool.handle(),
                    query,
                    flags
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdEndQuery(
            VkCommandBuffer commandBuffer,
            VkQueryPool queryPool,
            @unsigned int query
    ) {
        try {
            HANDLE$vkCmdEndQuery.invoke(
                    commandBuffer.handle(),
                    queryPool.handle(),
                    query
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdBeginConditionalRenderingEXT(
            VkCommandBuffer commandBuffer,
            @pointer(target=VkConditionalRenderingBeginInfoEXT.class) VkConditionalRenderingBeginInfoEXT pConditionalRenderingBegin
    ) {
        try {
            HANDLE$vkCmdBeginConditionalRenderingEXT.invoke(
                    commandBuffer.handle(),
                    pConditionalRenderingBegin != null ? pConditionalRenderingBegin.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdEndConditionalRenderingEXT(
            VkCommandBuffer commandBuffer
    ) {
        try {
            HANDLE$vkCmdEndConditionalRenderingEXT.invoke(
                    commandBuffer.handle()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdResetQueryPool(
            VkCommandBuffer commandBuffer,
            VkQueryPool queryPool,
            @unsigned int firstQuery,
            @unsigned int queryCount
    ) {
        try {
            HANDLE$vkCmdResetQueryPool.invoke(
                    commandBuffer.handle(),
                    queryPool.handle(),
                    firstQuery,
                    queryCount
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdWriteTimestamp(
            VkCommandBuffer commandBuffer,
            @enumtype(VkPipelineStageFlags.class) int pipelineStage,
            VkQueryPool queryPool,
            @unsigned int query
    ) {
        try {
            HANDLE$vkCmdWriteTimestamp.invoke(
                    commandBuffer.handle(),
                    pipelineStage,
                    queryPool.handle(),
                    query
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

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
            HANDLE$vkCmdCopyQueryPoolResults.invoke(
                    commandBuffer.handle(),
                    queryPool.handle(),
                    firstQuery,
                    queryCount,
                    dstBuffer.handle(),
                    dstOffset,
                    stride,
                    flags
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdPushConstants(
            VkCommandBuffer commandBuffer,
            VkPipelineLayout layout,
            @enumtype(VkShaderStageFlags.class) int stageFlags,
            @unsigned int offset,
            @unsigned int size,
            @pointer(comment="void*") MemorySegment pValues
    ) {
        try {
            HANDLE$vkCmdPushConstants.invoke(
                    commandBuffer.handle(),
                    layout.handle(),
                    stageFlags,
                    offset,
                    size,
                    pValues
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdBeginRenderPass(
            VkCommandBuffer commandBuffer,
            @pointer(target=VkRenderPassBeginInfo.class) VkRenderPassBeginInfo pRenderPassBegin,
            @enumtype(VkSubpassContents.class) int contents
    ) {
        try {
            HANDLE$vkCmdBeginRenderPass.invoke(
                    commandBuffer.handle(),
                    pRenderPassBegin != null ? pRenderPassBegin.segment() : MemorySegment.NULL,
                    contents
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdNextSubpass(
            VkCommandBuffer commandBuffer,
            @enumtype(VkSubpassContents.class) int contents
    ) {
        try {
            HANDLE$vkCmdNextSubpass.invoke(
                    commandBuffer.handle(),
                    contents
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdEndRenderPass(
            VkCommandBuffer commandBuffer
    ) {
        try {
            HANDLE$vkCmdEndRenderPass.invoke(
                    commandBuffer.handle()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdExecuteCommands(
            VkCommandBuffer commandBuffer,
            @unsigned int commandBufferCount,
            @pointer(target=VkCommandBuffer.class) VkCommandBuffer pCommandBuffers
    ) {
        try {
            HANDLE$vkCmdExecuteCommands.invoke(
                    commandBuffer.handle(),
                    commandBufferCount,
                    pCommandBuffers != null ? pCommandBuffers.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkCreateSharedSwapchainsKHR(
            VkDevice device,
            @unsigned int swapchainCount,
            @pointer(target=VkSwapchainCreateInfoKHR.class) VkSwapchainCreateInfoKHR pCreateInfos,
            @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator,
            @pointer(target=VkSwapchainKHR.class) VkSwapchainKHR pSwapchains
    ) {
        try {
            return (int) HANDLE$vkCreateSharedSwapchainsKHR.invoke(
                    device.handle(),
                    swapchainCount,
                    pCreateInfos != null ? pCreateInfos.segment() : MemorySegment.NULL,
                    pAllocator != null ? pAllocator.segment() : MemorySegment.NULL,
                    pSwapchains != null ? pSwapchains.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkCreateSwapchainKHR(
            VkDevice device,
            @pointer(target=VkSwapchainCreateInfoKHR.class) VkSwapchainCreateInfoKHR pCreateInfo,
            @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator,
            @pointer(target=VkSwapchainKHR.class) VkSwapchainKHR pSwapchain
    ) {
        try {
            return (int) HANDLE$vkCreateSwapchainKHR.invoke(
                    device.handle(),
                    pCreateInfo != null ? pCreateInfo.segment() : MemorySegment.NULL,
                    pAllocator != null ? pAllocator.segment() : MemorySegment.NULL,
                    pSwapchain != null ? pSwapchain.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkDestroySwapchainKHR(
            VkDevice device,
            VkSwapchainKHR swapchain,
            @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator
    ) {
        try {
            HANDLE$vkDestroySwapchainKHR.invoke(
                    device.handle(),
                    swapchain.handle(),
                    pAllocator != null ? pAllocator.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkGetSwapchainImagesKHR(
            VkDevice device,
            VkSwapchainKHR swapchain,
            @pointer(target=IntPtr.class) @unsigned IntPtr pSwapchainImageCount,
            @pointer(target=VkImage.class) VkImage pSwapchainImages
    ) {
        try {
            return (int) HANDLE$vkGetSwapchainImagesKHR.invoke(
                    device.handle(),
                    swapchain.handle(),
                    pSwapchainImageCount != null ? pSwapchainImageCount.segment() : MemorySegment.NULL,
                    pSwapchainImages != null ? pSwapchainImages.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkAcquireNextImageKHR(
            VkDevice device,
            VkSwapchainKHR swapchain,
            @unsigned long timeout,
            VkSemaphore semaphore,
            VkFence fence,
            @pointer(target=IntPtr.class) @unsigned IntPtr pImageIndex
    ) {
        try {
            return (int) HANDLE$vkAcquireNextImageKHR.invoke(
                    device.handle(),
                    swapchain.handle(),
                    timeout,
                    semaphore.handle(),
                    fence.handle(),
                    pImageIndex != null ? pImageIndex.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkQueuePresentKHR(
            VkQueue queue,
            @pointer(target=VkPresentInfoKHR.class) VkPresentInfoKHR pPresentInfo
    ) {
        try {
            return (int) HANDLE$vkQueuePresentKHR.invoke(
                    queue.handle(),
                    pPresentInfo != null ? pPresentInfo.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkDebugMarkerSetObjectNameEXT(
            VkDevice device,
            @pointer(target=VkDebugMarkerObjectNameInfoEXT.class) VkDebugMarkerObjectNameInfoEXT pNameInfo
    ) {
        try {
            return (int) HANDLE$vkDebugMarkerSetObjectNameEXT.invoke(
                    device.handle(),
                    pNameInfo != null ? pNameInfo.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkDebugMarkerSetObjectTagEXT(
            VkDevice device,
            @pointer(target=VkDebugMarkerObjectTagInfoEXT.class) VkDebugMarkerObjectTagInfoEXT pTagInfo
    ) {
        try {
            return (int) HANDLE$vkDebugMarkerSetObjectTagEXT.invoke(
                    device.handle(),
                    pTagInfo != null ? pTagInfo.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdDebugMarkerBeginEXT(
            VkCommandBuffer commandBuffer,
            @pointer(target=VkDebugMarkerMarkerInfoEXT.class) VkDebugMarkerMarkerInfoEXT pMarkerInfo
    ) {
        try {
            HANDLE$vkCmdDebugMarkerBeginEXT.invoke(
                    commandBuffer.handle(),
                    pMarkerInfo != null ? pMarkerInfo.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdDebugMarkerEndEXT(
            VkCommandBuffer commandBuffer
    ) {
        try {
            HANDLE$vkCmdDebugMarkerEndEXT.invoke(
                    commandBuffer.handle()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdDebugMarkerInsertEXT(
            VkCommandBuffer commandBuffer,
            @pointer(target=VkDebugMarkerMarkerInfoEXT.class) VkDebugMarkerMarkerInfoEXT pMarkerInfo
    ) {
        try {
            HANDLE$vkCmdDebugMarkerInsertEXT.invoke(
                    commandBuffer.handle(),
                    pMarkerInfo != null ? pMarkerInfo.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkGetMemoryWin32HandleNV(
            VkDevice device,
            VkDeviceMemory memory,
            @enumtype(VkExternalMemoryHandleTypeFlagsNV.class) int handleType,
            @pointer(comment="void **") MemorySegment pHandle
    ) {
        try {
            return (int) HANDLE$vkGetMemoryWin32HandleNV.invoke(
                    device.handle(),
                    memory.handle(),
                    handleType,
                    pHandle
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdExecuteGeneratedCommandsNV(
            VkCommandBuffer commandBuffer,
            @unsigned int isPreprocessed,
            @pointer(target=VkGeneratedCommandsInfoNV.class) VkGeneratedCommandsInfoNV pGeneratedCommandsInfo
    ) {
        try {
            HANDLE$vkCmdExecuteGeneratedCommandsNV.invoke(
                    commandBuffer.handle(),
                    isPreprocessed,
                    pGeneratedCommandsInfo != null ? pGeneratedCommandsInfo.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdPreprocessGeneratedCommandsNV(
            VkCommandBuffer commandBuffer,
            @pointer(target=VkGeneratedCommandsInfoNV.class) VkGeneratedCommandsInfoNV pGeneratedCommandsInfo
    ) {
        try {
            HANDLE$vkCmdPreprocessGeneratedCommandsNV.invoke(
                    commandBuffer.handle(),
                    pGeneratedCommandsInfo != null ? pGeneratedCommandsInfo.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdBindPipelineShaderGroupNV(
            VkCommandBuffer commandBuffer,
            @enumtype(VkPipelineBindPoint.class) int pipelineBindPoint,
            VkPipeline pipeline,
            @unsigned int groupIndex
    ) {
        try {
            HANDLE$vkCmdBindPipelineShaderGroupNV.invoke(
                    commandBuffer.handle(),
                    pipelineBindPoint,
                    pipeline.handle(),
                    groupIndex
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkGetGeneratedCommandsMemoryRequirementsNV(
            VkDevice device,
            @pointer(target=VkGeneratedCommandsMemoryRequirementsInfoNV.class) VkGeneratedCommandsMemoryRequirementsInfoNV pInfo,
            @pointer(target=VkMemoryRequirements2.class) VkMemoryRequirements2 pMemoryRequirements
    ) {
        try {
            HANDLE$vkGetGeneratedCommandsMemoryRequirementsNV.invoke(
                    device.handle(),
                    pInfo != null ? pInfo.segment() : MemorySegment.NULL,
                    pMemoryRequirements != null ? pMemoryRequirements.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkCreateIndirectCommandsLayoutNV(
            VkDevice device,
            @pointer(target=VkIndirectCommandsLayoutCreateInfoNV.class) VkIndirectCommandsLayoutCreateInfoNV pCreateInfo,
            @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator,
            @pointer(target=VkIndirectCommandsLayoutNV.class) VkIndirectCommandsLayoutNV pIndirectCommandsLayout
    ) {
        try {
            return (int) HANDLE$vkCreateIndirectCommandsLayoutNV.invoke(
                    device.handle(),
                    pCreateInfo != null ? pCreateInfo.segment() : MemorySegment.NULL,
                    pAllocator != null ? pAllocator.segment() : MemorySegment.NULL,
                    pIndirectCommandsLayout != null ? pIndirectCommandsLayout.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkDestroyIndirectCommandsLayoutNV(
            VkDevice device,
            VkIndirectCommandsLayoutNV indirectCommandsLayout,
            @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator
    ) {
        try {
            HANDLE$vkDestroyIndirectCommandsLayoutNV.invoke(
                    device.handle(),
                    indirectCommandsLayout.handle(),
                    pAllocator != null ? pAllocator.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdPushDescriptorSetKHR(
            VkCommandBuffer commandBuffer,
            @enumtype(VkPipelineBindPoint.class) int pipelineBindPoint,
            VkPipelineLayout layout,
            @unsigned int set,
            @unsigned int descriptorWriteCount,
            @pointer(target=VkWriteDescriptorSet.class) VkWriteDescriptorSet pDescriptorWrites
    ) {
        try {
            HANDLE$vkCmdPushDescriptorSetKHR.invoke(
                    commandBuffer.handle(),
                    pipelineBindPoint,
                    layout.handle(),
                    set,
                    descriptorWriteCount,
                    pDescriptorWrites != null ? pDescriptorWrites.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkTrimCommandPool(
            VkDevice device,
            VkCommandPool commandPool,
            @enumtype(VkCommandPoolTrimFlags.class) int flags
    ) {
        try {
            HANDLE$vkTrimCommandPool.invoke(
                    device.handle(),
                    commandPool.handle(),
                    flags
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkGetMemoryWin32HandleKHR(
            VkDevice device,
            @pointer(target=VkMemoryGetWin32HandleInfoKHR.class) VkMemoryGetWin32HandleInfoKHR pGetWin32HandleInfo,
            @pointer(comment="void **") MemorySegment pHandle
    ) {
        try {
            return (int) HANDLE$vkGetMemoryWin32HandleKHR.invoke(
                    device.handle(),
                    pGetWin32HandleInfo != null ? pGetWin32HandleInfo.segment() : MemorySegment.NULL,
                    pHandle
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkGetMemoryWin32HandlePropertiesKHR(
            VkDevice device,
            @enumtype(VkExternalMemoryHandleTypeFlags.class) int handleType,
            @pointer(comment="void*") MemorySegment handle,
            @pointer(target=VkMemoryWin32HandlePropertiesKHR.class) VkMemoryWin32HandlePropertiesKHR pMemoryWin32HandleProperties
    ) {
        try {
            return (int) HANDLE$vkGetMemoryWin32HandlePropertiesKHR.invoke(
                    device.handle(),
                    handleType,
                    handle,
                    pMemoryWin32HandleProperties != null ? pMemoryWin32HandleProperties.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkGetMemoryFdKHR(
            VkDevice device,
            @pointer(target=VkMemoryGetFdInfoKHR.class) VkMemoryGetFdInfoKHR pGetFdInfo,
            @pointer(target=IntPtr.class) IntPtr pFd
    ) {
        try {
            return (int) HANDLE$vkGetMemoryFdKHR.invoke(
                    device.handle(),
                    pGetFdInfo != null ? pGetFdInfo.segment() : MemorySegment.NULL,
                    pFd != null ? pFd.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkGetMemoryFdPropertiesKHR(
            VkDevice device,
            @enumtype(VkExternalMemoryHandleTypeFlags.class) int handleType,
            int fd,
            @pointer(target=VkMemoryFdPropertiesKHR.class) VkMemoryFdPropertiesKHR pMemoryFdProperties
    ) {
        try {
            return (int) HANDLE$vkGetMemoryFdPropertiesKHR.invoke(
                    device.handle(),
                    handleType,
                    fd,
                    pMemoryFdProperties != null ? pMemoryFdProperties.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkGetMemoryZirconHandleFUCHSIA(
            VkDevice device,
            @pointer(target=VkMemoryGetZirconHandleInfoFUCHSIA.class) VkMemoryGetZirconHandleInfoFUCHSIA pGetZirconHandleInfo,
            @pointer(target=IntPtr.class) @unsigned IntPtr pZirconHandle
    ) {
        try {
            return (int) HANDLE$vkGetMemoryZirconHandleFUCHSIA.invoke(
                    device.handle(),
                    pGetZirconHandleInfo != null ? pGetZirconHandleInfo.segment() : MemorySegment.NULL,
                    pZirconHandle != null ? pZirconHandle.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkGetMemoryZirconHandlePropertiesFUCHSIA(
            VkDevice device,
            @enumtype(VkExternalMemoryHandleTypeFlags.class) int handleType,
            @unsigned int zirconHandle,
            @pointer(target=VkMemoryZirconHandlePropertiesFUCHSIA.class) VkMemoryZirconHandlePropertiesFUCHSIA pMemoryZirconHandleProperties
    ) {
        try {
            return (int) HANDLE$vkGetMemoryZirconHandlePropertiesFUCHSIA.invoke(
                    device.handle(),
                    handleType,
                    zirconHandle,
                    pMemoryZirconHandleProperties != null ? pMemoryZirconHandleProperties.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkGetMemoryRemoteAddressNV(
            VkDevice device,
            @pointer(target=VkMemoryGetRemoteAddressInfoNV.class) VkMemoryGetRemoteAddressInfoNV pMemoryGetRemoteAddressInfo,
            @pointer(comment="void **") MemorySegment pAddress
    ) {
        try {
            return (int) HANDLE$vkGetMemoryRemoteAddressNV.invoke(
                    device.handle(),
                    pMemoryGetRemoteAddressInfo != null ? pMemoryGetRemoteAddressInfo.segment() : MemorySegment.NULL,
                    pAddress
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkGetMemorySciBufNV(
            VkDevice device,
            @pointer(target=VkMemoryGetSciBufInfoNV.class) VkMemoryGetSciBufInfoNV pGetSciBufInfo,
            @pointer(comment="void **") MemorySegment pHandle
    ) {
        try {
            return (int) HANDLE$vkGetMemorySciBufNV.invoke(
                    device.handle(),
                    pGetSciBufInfo != null ? pGetSciBufInfo.segment() : MemorySegment.NULL,
                    pHandle
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkGetPhysicalDeviceExternalMemorySciBufPropertiesNV(
            VkPhysicalDevice physicalDevice,
            @enumtype(VkExternalMemoryHandleTypeFlags.class) int handleType,
            @pointer(comment="void*") MemorySegment handle,
            @pointer(target=VkMemorySciBufPropertiesNV.class) VkMemorySciBufPropertiesNV pMemorySciBufProperties
    ) {
        try {
            return (int) HANDLE$vkGetPhysicalDeviceExternalMemorySciBufPropertiesNV.invoke(
                    physicalDevice.handle(),
                    handleType,
                    handle,
                    pMemorySciBufProperties != null ? pMemorySciBufProperties.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkGetPhysicalDeviceSciBufAttributesNV(
            VkPhysicalDevice physicalDevice,
            @pointer(comment="void*") MemorySegment pAttributes
    ) {
        try {
            return (int) HANDLE$vkGetPhysicalDeviceSciBufAttributesNV.invoke(
                    physicalDevice.handle(),
                    pAttributes
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkGetSemaphoreWin32HandleKHR(
            VkDevice device,
            @pointer(target=VkSemaphoreGetWin32HandleInfoKHR.class) VkSemaphoreGetWin32HandleInfoKHR pGetWin32HandleInfo,
            @pointer(comment="void **") MemorySegment pHandle
    ) {
        try {
            return (int) HANDLE$vkGetSemaphoreWin32HandleKHR.invoke(
                    device.handle(),
                    pGetWin32HandleInfo != null ? pGetWin32HandleInfo.segment() : MemorySegment.NULL,
                    pHandle
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkImportSemaphoreWin32HandleKHR(
            VkDevice device,
            @pointer(target=VkImportSemaphoreWin32HandleInfoKHR.class) VkImportSemaphoreWin32HandleInfoKHR pImportSemaphoreWin32HandleInfo
    ) {
        try {
            return (int) HANDLE$vkImportSemaphoreWin32HandleKHR.invoke(
                    device.handle(),
                    pImportSemaphoreWin32HandleInfo != null ? pImportSemaphoreWin32HandleInfo.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkGetSemaphoreFdKHR(
            VkDevice device,
            @pointer(target=VkSemaphoreGetFdInfoKHR.class) VkSemaphoreGetFdInfoKHR pGetFdInfo,
            @pointer(target=IntPtr.class) IntPtr pFd
    ) {
        try {
            return (int) HANDLE$vkGetSemaphoreFdKHR.invoke(
                    device.handle(),
                    pGetFdInfo != null ? pGetFdInfo.segment() : MemorySegment.NULL,
                    pFd != null ? pFd.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkImportSemaphoreFdKHR(
            VkDevice device,
            @pointer(target=VkImportSemaphoreFdInfoKHR.class) VkImportSemaphoreFdInfoKHR pImportSemaphoreFdInfo
    ) {
        try {
            return (int) HANDLE$vkImportSemaphoreFdKHR.invoke(
                    device.handle(),
                    pImportSemaphoreFdInfo != null ? pImportSemaphoreFdInfo.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkGetSemaphoreZirconHandleFUCHSIA(
            VkDevice device,
            @pointer(target=VkSemaphoreGetZirconHandleInfoFUCHSIA.class) VkSemaphoreGetZirconHandleInfoFUCHSIA pGetZirconHandleInfo,
            @pointer(target=IntPtr.class) @unsigned IntPtr pZirconHandle
    ) {
        try {
            return (int) HANDLE$vkGetSemaphoreZirconHandleFUCHSIA.invoke(
                    device.handle(),
                    pGetZirconHandleInfo != null ? pGetZirconHandleInfo.segment() : MemorySegment.NULL,
                    pZirconHandle != null ? pZirconHandle.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkImportSemaphoreZirconHandleFUCHSIA(
            VkDevice device,
            @pointer(target=VkImportSemaphoreZirconHandleInfoFUCHSIA.class) VkImportSemaphoreZirconHandleInfoFUCHSIA pImportSemaphoreZirconHandleInfo
    ) {
        try {
            return (int) HANDLE$vkImportSemaphoreZirconHandleFUCHSIA.invoke(
                    device.handle(),
                    pImportSemaphoreZirconHandleInfo != null ? pImportSemaphoreZirconHandleInfo.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkGetFenceWin32HandleKHR(
            VkDevice device,
            @pointer(target=VkFenceGetWin32HandleInfoKHR.class) VkFenceGetWin32HandleInfoKHR pGetWin32HandleInfo,
            @pointer(comment="void **") MemorySegment pHandle
    ) {
        try {
            return (int) HANDLE$vkGetFenceWin32HandleKHR.invoke(
                    device.handle(),
                    pGetWin32HandleInfo != null ? pGetWin32HandleInfo.segment() : MemorySegment.NULL,
                    pHandle
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkImportFenceWin32HandleKHR(
            VkDevice device,
            @pointer(target=VkImportFenceWin32HandleInfoKHR.class) VkImportFenceWin32HandleInfoKHR pImportFenceWin32HandleInfo
    ) {
        try {
            return (int) HANDLE$vkImportFenceWin32HandleKHR.invoke(
                    device.handle(),
                    pImportFenceWin32HandleInfo != null ? pImportFenceWin32HandleInfo.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkGetFenceFdKHR(
            VkDevice device,
            @pointer(target=VkFenceGetFdInfoKHR.class) VkFenceGetFdInfoKHR pGetFdInfo,
            @pointer(target=IntPtr.class) IntPtr pFd
    ) {
        try {
            return (int) HANDLE$vkGetFenceFdKHR.invoke(
                    device.handle(),
                    pGetFdInfo != null ? pGetFdInfo.segment() : MemorySegment.NULL,
                    pFd != null ? pFd.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkImportFenceFdKHR(
            VkDevice device,
            @pointer(target=VkImportFenceFdInfoKHR.class) VkImportFenceFdInfoKHR pImportFenceFdInfo
    ) {
        try {
            return (int) HANDLE$vkImportFenceFdKHR.invoke(
                    device.handle(),
                    pImportFenceFdInfo != null ? pImportFenceFdInfo.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkGetFenceSciSyncFenceNV(
            VkDevice device,
            @pointer(target=VkFenceGetSciSyncInfoNV.class) VkFenceGetSciSyncInfoNV pGetSciSyncHandleInfo,
            @pointer(comment="void*") MemorySegment pHandle
    ) {
        try {
            return (int) HANDLE$vkGetFenceSciSyncFenceNV.invoke(
                    device.handle(),
                    pGetSciSyncHandleInfo != null ? pGetSciSyncHandleInfo.segment() : MemorySegment.NULL,
                    pHandle
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkGetFenceSciSyncObjNV(
            VkDevice device,
            @pointer(target=VkFenceGetSciSyncInfoNV.class) VkFenceGetSciSyncInfoNV pGetSciSyncHandleInfo,
            @pointer(comment="void*") MemorySegment pHandle
    ) {
        try {
            return (int) HANDLE$vkGetFenceSciSyncObjNV.invoke(
                    device.handle(),
                    pGetSciSyncHandleInfo != null ? pGetSciSyncHandleInfo.segment() : MemorySegment.NULL,
                    pHandle
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkImportFenceSciSyncFenceNV(
            VkDevice device,
            @pointer(target=VkImportFenceSciSyncInfoNV.class) VkImportFenceSciSyncInfoNV pImportFenceSciSyncInfo
    ) {
        try {
            return (int) HANDLE$vkImportFenceSciSyncFenceNV.invoke(
                    device.handle(),
                    pImportFenceSciSyncInfo != null ? pImportFenceSciSyncInfo.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkImportFenceSciSyncObjNV(
            VkDevice device,
            @pointer(target=VkImportFenceSciSyncInfoNV.class) VkImportFenceSciSyncInfoNV pImportFenceSciSyncInfo
    ) {
        try {
            return (int) HANDLE$vkImportFenceSciSyncObjNV.invoke(
                    device.handle(),
                    pImportFenceSciSyncInfo != null ? pImportFenceSciSyncInfo.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkGetSemaphoreSciSyncObjNV(
            VkDevice device,
            @pointer(target=VkSemaphoreGetSciSyncInfoNV.class) VkSemaphoreGetSciSyncInfoNV pGetSciSyncInfo,
            @pointer(comment="void*") MemorySegment pHandle
    ) {
        try {
            return (int) HANDLE$vkGetSemaphoreSciSyncObjNV.invoke(
                    device.handle(),
                    pGetSciSyncInfo != null ? pGetSciSyncInfo.segment() : MemorySegment.NULL,
                    pHandle
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkImportSemaphoreSciSyncObjNV(
            VkDevice device,
            @pointer(target=VkImportSemaphoreSciSyncInfoNV.class) VkImportSemaphoreSciSyncInfoNV pImportSemaphoreSciSyncInfo
    ) {
        try {
            return (int) HANDLE$vkImportSemaphoreSciSyncObjNV.invoke(
                    device.handle(),
                    pImportSemaphoreSciSyncInfo != null ? pImportSemaphoreSciSyncInfo.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkGetPhysicalDeviceSciSyncAttributesNV(
            VkPhysicalDevice physicalDevice,
            @pointer(target=VkSciSyncAttributesInfoNV.class) VkSciSyncAttributesInfoNV pSciSyncAttributesInfo,
            @pointer(comment="void*") MemorySegment pAttributes
    ) {
        try {
            return (int) HANDLE$vkGetPhysicalDeviceSciSyncAttributesNV.invoke(
                    physicalDevice.handle(),
                    pSciSyncAttributesInfo != null ? pSciSyncAttributesInfo.segment() : MemorySegment.NULL,
                    pAttributes
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkCreateSemaphoreSciSyncPoolNV(
            VkDevice device,
            @pointer(target=VkSemaphoreSciSyncPoolCreateInfoNV.class) VkSemaphoreSciSyncPoolCreateInfoNV pCreateInfo,
            @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator,
            @pointer(target=VkSemaphoreSciSyncPoolNV.class) VkSemaphoreSciSyncPoolNV pSemaphorePool
    ) {
        try {
            return (int) HANDLE$vkCreateSemaphoreSciSyncPoolNV.invoke(
                    device.handle(),
                    pCreateInfo != null ? pCreateInfo.segment() : MemorySegment.NULL,
                    pAllocator != null ? pAllocator.segment() : MemorySegment.NULL,
                    pSemaphorePool != null ? pSemaphorePool.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkDestroySemaphoreSciSyncPoolNV(
            VkDevice device,
            VkSemaphoreSciSyncPoolNV semaphorePool,
            @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator
    ) {
        try {
            HANDLE$vkDestroySemaphoreSciSyncPoolNV.invoke(
                    device.handle(),
                    semaphorePool.handle(),
                    pAllocator != null ? pAllocator.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkAcquireWinrtDisplayNV(
            VkPhysicalDevice physicalDevice,
            VkDisplayKHR display
    ) {
        try {
            return (int) HANDLE$vkAcquireWinrtDisplayNV.invoke(
                    physicalDevice.handle(),
                    display.handle()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkGetWinrtDisplayNV(
            VkPhysicalDevice physicalDevice,
            @unsigned int deviceRelativeId,
            @pointer(target=VkDisplayKHR.class) VkDisplayKHR pDisplay
    ) {
        try {
            return (int) HANDLE$vkGetWinrtDisplayNV.invoke(
                    physicalDevice.handle(),
                    deviceRelativeId,
                    pDisplay != null ? pDisplay.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkDisplayPowerControlEXT(
            VkDevice device,
            VkDisplayKHR display,
            @pointer(target=VkDisplayPowerInfoEXT.class) VkDisplayPowerInfoEXT pDisplayPowerInfo
    ) {
        try {
            return (int) HANDLE$vkDisplayPowerControlEXT.invoke(
                    device.handle(),
                    display.handle(),
                    pDisplayPowerInfo != null ? pDisplayPowerInfo.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkRegisterDeviceEventEXT(
            VkDevice device,
            @pointer(target=VkDeviceEventInfoEXT.class) VkDeviceEventInfoEXT pDeviceEventInfo,
            @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator,
            @pointer(target=VkFence.class) VkFence pFence
    ) {
        try {
            return (int) HANDLE$vkRegisterDeviceEventEXT.invoke(
                    device.handle(),
                    pDeviceEventInfo != null ? pDeviceEventInfo.segment() : MemorySegment.NULL,
                    pAllocator != null ? pAllocator.segment() : MemorySegment.NULL,
                    pFence != null ? pFence.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkRegisterDisplayEventEXT(
            VkDevice device,
            VkDisplayKHR display,
            @pointer(target=VkDisplayEventInfoEXT.class) VkDisplayEventInfoEXT pDisplayEventInfo,
            @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator,
            @pointer(target=VkFence.class) VkFence pFence
    ) {
        try {
            return (int) HANDLE$vkRegisterDisplayEventEXT.invoke(
                    device.handle(),
                    display.handle(),
                    pDisplayEventInfo != null ? pDisplayEventInfo.segment() : MemorySegment.NULL,
                    pAllocator != null ? pAllocator.segment() : MemorySegment.NULL,
                    pFence != null ? pFence.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkGetSwapchainCounterEXT(
            VkDevice device,
            VkSwapchainKHR swapchain,
            @enumtype(VkSurfaceCounterFlagsEXT.class) int counter,
            @pointer(target=LongPtr.class) @unsigned LongPtr pCounterValue
    ) {
        try {
            return (int) HANDLE$vkGetSwapchainCounterEXT.invoke(
                    device.handle(),
                    swapchain.handle(),
                    counter,
                    pCounterValue != null ? pCounterValue.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkGetDeviceGroupPeerMemoryFeatures(
            VkDevice device,
            @unsigned int heapIndex,
            @unsigned int localDeviceIndex,
            @unsigned int remoteDeviceIndex,
            @pointer(comment="enum VkPeerMemoryFeatureFlags*") MemorySegment pPeerMemoryFeatures
    ) {
        try {
            HANDLE$vkGetDeviceGroupPeerMemoryFeatures.invoke(
                    device.handle(),
                    heapIndex,
                    localDeviceIndex,
                    remoteDeviceIndex,
                    pPeerMemoryFeatures
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkBindBufferMemory2(
            VkDevice device,
            @unsigned int bindInfoCount,
            @pointer(target=VkBindBufferMemoryInfo.class) VkBindBufferMemoryInfo pBindInfos
    ) {
        try {
            return (int) HANDLE$vkBindBufferMemory2.invoke(
                    device.handle(),
                    bindInfoCount,
                    pBindInfos != null ? pBindInfos.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkBindImageMemory2(
            VkDevice device,
            @unsigned int bindInfoCount,
            @pointer(target=VkBindImageMemoryInfo.class) VkBindImageMemoryInfo pBindInfos
    ) {
        try {
            return (int) HANDLE$vkBindImageMemory2.invoke(
                    device.handle(),
                    bindInfoCount,
                    pBindInfos != null ? pBindInfos.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdSetDeviceMask(
            VkCommandBuffer commandBuffer,
            @unsigned int deviceMask
    ) {
        try {
            HANDLE$vkCmdSetDeviceMask.invoke(
                    commandBuffer.handle(),
                    deviceMask
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkGetDeviceGroupPresentCapabilitiesKHR(
            VkDevice device,
            @pointer(target=VkDeviceGroupPresentCapabilitiesKHR.class) VkDeviceGroupPresentCapabilitiesKHR pDeviceGroupPresentCapabilities
    ) {
        try {
            return (int) HANDLE$vkGetDeviceGroupPresentCapabilitiesKHR.invoke(
                    device.handle(),
                    pDeviceGroupPresentCapabilities != null ? pDeviceGroupPresentCapabilities.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkGetDeviceGroupSurfacePresentModesKHR(
            VkDevice device,
            VkSurfaceKHR surface,
            @pointer(comment="enum VkDeviceGroupPresentModeFlagsKHR*") MemorySegment pModes
    ) {
        try {
            return (int) HANDLE$vkGetDeviceGroupSurfacePresentModesKHR.invoke(
                    device.handle(),
                    surface.handle(),
                    pModes
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkAcquireNextImage2KHR(
            VkDevice device,
            @pointer(target=VkAcquireNextImageInfoKHR.class) VkAcquireNextImageInfoKHR pAcquireInfo,
            @pointer(target=IntPtr.class) @unsigned IntPtr pImageIndex
    ) {
        try {
            return (int) HANDLE$vkAcquireNextImage2KHR.invoke(
                    device.handle(),
                    pAcquireInfo != null ? pAcquireInfo.segment() : MemorySegment.NULL,
                    pImageIndex != null ? pImageIndex.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

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
            HANDLE$vkCmdDispatchBase.invoke(
                    commandBuffer.handle(),
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

    public @enumtype(VkResult.class) int vkGetPhysicalDevicePresentRectanglesKHR(
            VkPhysicalDevice physicalDevice,
            VkSurfaceKHR surface,
            @pointer(target=IntPtr.class) @unsigned IntPtr pRectCount,
            @pointer(target=VkRect2D.class) VkRect2D pRects
    ) {
        try {
            return (int) HANDLE$vkGetPhysicalDevicePresentRectanglesKHR.invoke(
                    physicalDevice.handle(),
                    surface.handle(),
                    pRectCount != null ? pRectCount.segment() : MemorySegment.NULL,
                    pRects != null ? pRects.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkCreateDescriptorUpdateTemplate(
            VkDevice device,
            @pointer(target=VkDescriptorUpdateTemplateCreateInfo.class) VkDescriptorUpdateTemplateCreateInfo pCreateInfo,
            @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator,
            @pointer(target=VkDescriptorUpdateTemplate.class) VkDescriptorUpdateTemplate pDescriptorUpdateTemplate
    ) {
        try {
            return (int) HANDLE$vkCreateDescriptorUpdateTemplate.invoke(
                    device.handle(),
                    pCreateInfo != null ? pCreateInfo.segment() : MemorySegment.NULL,
                    pAllocator != null ? pAllocator.segment() : MemorySegment.NULL,
                    pDescriptorUpdateTemplate != null ? pDescriptorUpdateTemplate.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkDestroyDescriptorUpdateTemplate(
            VkDevice device,
            VkDescriptorUpdateTemplate descriptorUpdateTemplate,
            @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator
    ) {
        try {
            HANDLE$vkDestroyDescriptorUpdateTemplate.invoke(
                    device.handle(),
                    descriptorUpdateTemplate.handle(),
                    pAllocator != null ? pAllocator.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkUpdateDescriptorSetWithTemplate(
            VkDevice device,
            VkDescriptorSet descriptorSet,
            VkDescriptorUpdateTemplate descriptorUpdateTemplate,
            @pointer(comment="void*") MemorySegment pData
    ) {
        try {
            HANDLE$vkUpdateDescriptorSetWithTemplate.invoke(
                    device.handle(),
                    descriptorSet.handle(),
                    descriptorUpdateTemplate.handle(),
                    pData
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdPushDescriptorSetWithTemplateKHR(
            VkCommandBuffer commandBuffer,
            VkDescriptorUpdateTemplate descriptorUpdateTemplate,
            VkPipelineLayout layout,
            @unsigned int set,
            @pointer(comment="void*") MemorySegment pData
    ) {
        try {
            HANDLE$vkCmdPushDescriptorSetWithTemplateKHR.invoke(
                    commandBuffer.handle(),
                    descriptorUpdateTemplate.handle(),
                    layout.handle(),
                    set,
                    pData
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkSetHdrMetadataEXT(
            VkDevice device,
            @unsigned int swapchainCount,
            @pointer(target=VkSwapchainKHR.class) VkSwapchainKHR pSwapchains,
            @pointer(target=VkHdrMetadataEXT.class) VkHdrMetadataEXT pMetadata
    ) {
        try {
            HANDLE$vkSetHdrMetadataEXT.invoke(
                    device.handle(),
                    swapchainCount,
                    pSwapchains != null ? pSwapchains.segment() : MemorySegment.NULL,
                    pMetadata != null ? pMetadata.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkGetSwapchainStatusKHR(
            VkDevice device,
            VkSwapchainKHR swapchain
    ) {
        try {
            return (int) HANDLE$vkGetSwapchainStatusKHR.invoke(
                    device.handle(),
                    swapchain.handle()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkGetRefreshCycleDurationGOOGLE(
            VkDevice device,
            VkSwapchainKHR swapchain,
            @pointer(target=VkRefreshCycleDurationGOOGLE.class) VkRefreshCycleDurationGOOGLE pDisplayTimingProperties
    ) {
        try {
            return (int) HANDLE$vkGetRefreshCycleDurationGOOGLE.invoke(
                    device.handle(),
                    swapchain.handle(),
                    pDisplayTimingProperties != null ? pDisplayTimingProperties.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkGetPastPresentationTimingGOOGLE(
            VkDevice device,
            VkSwapchainKHR swapchain,
            @pointer(target=IntPtr.class) @unsigned IntPtr pPresentationTimingCount,
            @pointer(target=VkPastPresentationTimingGOOGLE.class) VkPastPresentationTimingGOOGLE pPresentationTimings
    ) {
        try {
            return (int) HANDLE$vkGetPastPresentationTimingGOOGLE.invoke(
                    device.handle(),
                    swapchain.handle(),
                    pPresentationTimingCount != null ? pPresentationTimingCount.segment() : MemorySegment.NULL,
                    pPresentationTimings != null ? pPresentationTimings.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdSetViewportWScalingNV(
            VkCommandBuffer commandBuffer,
            @unsigned int firstViewport,
            @unsigned int viewportCount,
            @pointer(target=VkViewportWScalingNV.class) VkViewportWScalingNV pViewportWScalings
    ) {
        try {
            HANDLE$vkCmdSetViewportWScalingNV.invoke(
                    commandBuffer.handle(),
                    firstViewport,
                    viewportCount,
                    pViewportWScalings != null ? pViewportWScalings.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdSetDiscardRectangleEXT(
            VkCommandBuffer commandBuffer,
            @unsigned int firstDiscardRectangle,
            @unsigned int discardRectangleCount,
            @pointer(target=VkRect2D.class) VkRect2D pDiscardRectangles
    ) {
        try {
            HANDLE$vkCmdSetDiscardRectangleEXT.invoke(
                    commandBuffer.handle(),
                    firstDiscardRectangle,
                    discardRectangleCount,
                    pDiscardRectangles != null ? pDiscardRectangles.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdSetDiscardRectangleEnableEXT(
            VkCommandBuffer commandBuffer,
            @unsigned int discardRectangleEnable
    ) {
        try {
            HANDLE$vkCmdSetDiscardRectangleEnableEXT.invoke(
                    commandBuffer.handle(),
                    discardRectangleEnable
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdSetDiscardRectangleModeEXT(
            VkCommandBuffer commandBuffer,
            @enumtype(VkDiscardRectangleModeEXT.class) int discardRectangleMode
    ) {
        try {
            HANDLE$vkCmdSetDiscardRectangleModeEXT.invoke(
                    commandBuffer.handle(),
                    discardRectangleMode
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdSetSampleLocationsEXT(
            VkCommandBuffer commandBuffer,
            @pointer(target=VkSampleLocationsInfoEXT.class) VkSampleLocationsInfoEXT pSampleLocationsInfo
    ) {
        try {
            HANDLE$vkCmdSetSampleLocationsEXT.invoke(
                    commandBuffer.handle(),
                    pSampleLocationsInfo != null ? pSampleLocationsInfo.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkGetPhysicalDeviceMultisamplePropertiesEXT(
            VkPhysicalDevice physicalDevice,
            @enumtype(VkSampleCountFlags.class) int samples,
            @pointer(target=VkMultisamplePropertiesEXT.class) VkMultisamplePropertiesEXT pMultisampleProperties
    ) {
        try {
            HANDLE$vkGetPhysicalDeviceMultisamplePropertiesEXT.invoke(
                    physicalDevice.handle(),
                    samples,
                    pMultisampleProperties != null ? pMultisampleProperties.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkGetBufferMemoryRequirements2(
            VkDevice device,
            @pointer(target=VkBufferMemoryRequirementsInfo2.class) VkBufferMemoryRequirementsInfo2 pInfo,
            @pointer(target=VkMemoryRequirements2.class) VkMemoryRequirements2 pMemoryRequirements
    ) {
        try {
            HANDLE$vkGetBufferMemoryRequirements2.invoke(
                    device.handle(),
                    pInfo != null ? pInfo.segment() : MemorySegment.NULL,
                    pMemoryRequirements != null ? pMemoryRequirements.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkGetImageMemoryRequirements2(
            VkDevice device,
            @pointer(target=VkImageMemoryRequirementsInfo2.class) VkImageMemoryRequirementsInfo2 pInfo,
            @pointer(target=VkMemoryRequirements2.class) VkMemoryRequirements2 pMemoryRequirements
    ) {
        try {
            HANDLE$vkGetImageMemoryRequirements2.invoke(
                    device.handle(),
                    pInfo != null ? pInfo.segment() : MemorySegment.NULL,
                    pMemoryRequirements != null ? pMemoryRequirements.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkGetImageSparseMemoryRequirements2(
            VkDevice device,
            @pointer(target=VkImageSparseMemoryRequirementsInfo2.class) VkImageSparseMemoryRequirementsInfo2 pInfo,
            @pointer(target=IntPtr.class) @unsigned IntPtr pSparseMemoryRequirementCount,
            @pointer(target=VkSparseImageMemoryRequirements2.class) VkSparseImageMemoryRequirements2 pSparseMemoryRequirements
    ) {
        try {
            HANDLE$vkGetImageSparseMemoryRequirements2.invoke(
                    device.handle(),
                    pInfo != null ? pInfo.segment() : MemorySegment.NULL,
                    pSparseMemoryRequirementCount != null ? pSparseMemoryRequirementCount.segment() : MemorySegment.NULL,
                    pSparseMemoryRequirements != null ? pSparseMemoryRequirements.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkGetDeviceBufferMemoryRequirements(
            VkDevice device,
            @pointer(target=VkDeviceBufferMemoryRequirements.class) VkDeviceBufferMemoryRequirements pInfo,
            @pointer(target=VkMemoryRequirements2.class) VkMemoryRequirements2 pMemoryRequirements
    ) {
        try {
            HANDLE$vkGetDeviceBufferMemoryRequirements.invoke(
                    device.handle(),
                    pInfo != null ? pInfo.segment() : MemorySegment.NULL,
                    pMemoryRequirements != null ? pMemoryRequirements.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkGetDeviceImageMemoryRequirements(
            VkDevice device,
            @pointer(target=VkDeviceImageMemoryRequirements.class) VkDeviceImageMemoryRequirements pInfo,
            @pointer(target=VkMemoryRequirements2.class) VkMemoryRequirements2 pMemoryRequirements
    ) {
        try {
            HANDLE$vkGetDeviceImageMemoryRequirements.invoke(
                    device.handle(),
                    pInfo != null ? pInfo.segment() : MemorySegment.NULL,
                    pMemoryRequirements != null ? pMemoryRequirements.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkGetDeviceImageSparseMemoryRequirements(
            VkDevice device,
            @pointer(target=VkDeviceImageMemoryRequirements.class) VkDeviceImageMemoryRequirements pInfo,
            @pointer(target=IntPtr.class) @unsigned IntPtr pSparseMemoryRequirementCount,
            @pointer(target=VkSparseImageMemoryRequirements2.class) VkSparseImageMemoryRequirements2 pSparseMemoryRequirements
    ) {
        try {
            HANDLE$vkGetDeviceImageSparseMemoryRequirements.invoke(
                    device.handle(),
                    pInfo != null ? pInfo.segment() : MemorySegment.NULL,
                    pSparseMemoryRequirementCount != null ? pSparseMemoryRequirementCount.segment() : MemorySegment.NULL,
                    pSparseMemoryRequirements != null ? pSparseMemoryRequirements.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkCreateSamplerYcbcrConversion(
            VkDevice device,
            @pointer(target=VkSamplerYcbcrConversionCreateInfo.class) VkSamplerYcbcrConversionCreateInfo pCreateInfo,
            @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator,
            @pointer(target=VkSamplerYcbcrConversion.class) VkSamplerYcbcrConversion pYcbcrConversion
    ) {
        try {
            return (int) HANDLE$vkCreateSamplerYcbcrConversion.invoke(
                    device.handle(),
                    pCreateInfo != null ? pCreateInfo.segment() : MemorySegment.NULL,
                    pAllocator != null ? pAllocator.segment() : MemorySegment.NULL,
                    pYcbcrConversion != null ? pYcbcrConversion.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkDestroySamplerYcbcrConversion(
            VkDevice device,
            VkSamplerYcbcrConversion ycbcrConversion,
            @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator
    ) {
        try {
            HANDLE$vkDestroySamplerYcbcrConversion.invoke(
                    device.handle(),
                    ycbcrConversion.handle(),
                    pAllocator != null ? pAllocator.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkGetDeviceQueue2(
            VkDevice device,
            @pointer(target=VkDeviceQueueInfo2.class) VkDeviceQueueInfo2 pQueueInfo,
            @pointer(target=VkQueue.class) VkQueue pQueue
    ) {
        try {
            HANDLE$vkGetDeviceQueue2.invoke(
                    device.handle(),
                    pQueueInfo != null ? pQueueInfo.segment() : MemorySegment.NULL,
                    pQueue != null ? pQueue.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkCreateValidationCacheEXT(
            VkDevice device,
            @pointer(target=VkValidationCacheCreateInfoEXT.class) VkValidationCacheCreateInfoEXT pCreateInfo,
            @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator,
            @pointer(target=VkValidationCacheEXT.class) VkValidationCacheEXT pValidationCache
    ) {
        try {
            return (int) HANDLE$vkCreateValidationCacheEXT.invoke(
                    device.handle(),
                    pCreateInfo != null ? pCreateInfo.segment() : MemorySegment.NULL,
                    pAllocator != null ? pAllocator.segment() : MemorySegment.NULL,
                    pValidationCache != null ? pValidationCache.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkDestroyValidationCacheEXT(
            VkDevice device,
            VkValidationCacheEXT validationCache,
            @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator
    ) {
        try {
            HANDLE$vkDestroyValidationCacheEXT.invoke(
                    device.handle(),
                    validationCache.handle(),
                    pAllocator != null ? pAllocator.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkGetValidationCacheDataEXT(
            VkDevice device,
            VkValidationCacheEXT validationCache,
            @pointer(target=CSizeTPtr.class) CSizeTPtr pDataSize,
            @pointer(comment="void*") MemorySegment pData
    ) {
        try {
            return (int) HANDLE$vkGetValidationCacheDataEXT.invoke(
                    device.handle(),
                    validationCache.handle(),
                    pDataSize != null ? pDataSize.segment() : MemorySegment.NULL,
                    pData
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkMergeValidationCachesEXT(
            VkDevice device,
            VkValidationCacheEXT dstCache,
            @unsigned int srcCacheCount,
            @pointer(target=VkValidationCacheEXT.class) VkValidationCacheEXT pSrcCaches
    ) {
        try {
            return (int) HANDLE$vkMergeValidationCachesEXT.invoke(
                    device.handle(),
                    dstCache.handle(),
                    srcCacheCount,
                    pSrcCaches != null ? pSrcCaches.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkGetDescriptorSetLayoutSupport(
            VkDevice device,
            @pointer(target=VkDescriptorSetLayoutCreateInfo.class) VkDescriptorSetLayoutCreateInfo pCreateInfo,
            @pointer(target=VkDescriptorSetLayoutSupport.class) VkDescriptorSetLayoutSupport pSupport
    ) {
        try {
            HANDLE$vkGetDescriptorSetLayoutSupport.invoke(
                    device.handle(),
                    pCreateInfo != null ? pCreateInfo.segment() : MemorySegment.NULL,
                    pSupport != null ? pSupport.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkGetShaderInfoAMD(
            VkDevice device,
            VkPipeline pipeline,
            @enumtype(VkShaderStageFlags.class) int shaderStage,
            @enumtype(VkShaderInfoTypeAMD.class) int infoType,
            @pointer(target=CSizeTPtr.class) CSizeTPtr pInfoSize,
            @pointer(comment="void*") MemorySegment pInfo
    ) {
        try {
            return (int) HANDLE$vkGetShaderInfoAMD.invoke(
                    device.handle(),
                    pipeline.handle(),
                    shaderStage,
                    infoType,
                    pInfoSize != null ? pInfoSize.segment() : MemorySegment.NULL,
                    pInfo
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkSetLocalDimmingAMD(
            VkDevice device,
            VkSwapchainKHR swapChain,
            @unsigned int localDimmingEnable
    ) {
        try {
            HANDLE$vkSetLocalDimmingAMD.invoke(
                    device.handle(),
                    swapChain.handle(),
                    localDimmingEnable
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkGetPhysicalDeviceCalibrateableTimeDomainsKHR(
            VkPhysicalDevice physicalDevice,
            @pointer(target=IntPtr.class) @unsigned IntPtr pTimeDomainCount,
            @pointer(comment="enum VkTimeDomainKHR*") MemorySegment pTimeDomains
    ) {
        try {
            return (int) HANDLE$vkGetPhysicalDeviceCalibrateableTimeDomainsKHR.invoke(
                    physicalDevice.handle(),
                    pTimeDomainCount != null ? pTimeDomainCount.segment() : MemorySegment.NULL,
                    pTimeDomains
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkGetCalibratedTimestampsKHR(
            VkDevice device,
            @unsigned int timestampCount,
            @pointer(target=VkCalibratedTimestampInfoKHR.class) VkCalibratedTimestampInfoKHR pTimestampInfos,
            @pointer(target=LongPtr.class) @unsigned LongPtr pTimestamps,
            @pointer(target=LongPtr.class) @unsigned LongPtr pMaxDeviation
    ) {
        try {
            return (int) HANDLE$vkGetCalibratedTimestampsKHR.invoke(
                    device.handle(),
                    timestampCount,
                    pTimestampInfos != null ? pTimestampInfos.segment() : MemorySegment.NULL,
                    pTimestamps != null ? pTimestamps.segment() : MemorySegment.NULL,
                    pMaxDeviation != null ? pMaxDeviation.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkGetMemoryHostPointerPropertiesEXT(
            VkDevice device,
            @enumtype(VkExternalMemoryHandleTypeFlags.class) int handleType,
            @pointer(comment="void*") MemorySegment pHostPointer,
            @pointer(target=VkMemoryHostPointerPropertiesEXT.class) VkMemoryHostPointerPropertiesEXT pMemoryHostPointerProperties
    ) {
        try {
            return (int) HANDLE$vkGetMemoryHostPointerPropertiesEXT.invoke(
                    device.handle(),
                    handleType,
                    pHostPointer,
                    pMemoryHostPointerProperties != null ? pMemoryHostPointerProperties.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdWriteBufferMarkerAMD(
            VkCommandBuffer commandBuffer,
            @enumtype(VkPipelineStageFlags.class) int pipelineStage,
            VkBuffer dstBuffer,
            @unsigned long dstOffset,
            @unsigned int marker
    ) {
        try {
            HANDLE$vkCmdWriteBufferMarkerAMD.invoke(
                    commandBuffer.handle(),
                    pipelineStage,
                    dstBuffer.handle(),
                    dstOffset,
                    marker
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkCreateRenderPass2(
            VkDevice device,
            @pointer(target=VkRenderPassCreateInfo2.class) VkRenderPassCreateInfo2 pCreateInfo,
            @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator,
            @pointer(target=VkRenderPass.class) VkRenderPass pRenderPass
    ) {
        try {
            return (int) HANDLE$vkCreateRenderPass2.invoke(
                    device.handle(),
                    pCreateInfo != null ? pCreateInfo.segment() : MemorySegment.NULL,
                    pAllocator != null ? pAllocator.segment() : MemorySegment.NULL,
                    pRenderPass != null ? pRenderPass.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdBeginRenderPass2(
            VkCommandBuffer commandBuffer,
            @pointer(target=VkRenderPassBeginInfo.class) VkRenderPassBeginInfo pRenderPassBegin,
            @pointer(target=VkSubpassBeginInfo.class) VkSubpassBeginInfo pSubpassBeginInfo
    ) {
        try {
            HANDLE$vkCmdBeginRenderPass2.invoke(
                    commandBuffer.handle(),
                    pRenderPassBegin != null ? pRenderPassBegin.segment() : MemorySegment.NULL,
                    pSubpassBeginInfo != null ? pSubpassBeginInfo.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdNextSubpass2(
            VkCommandBuffer commandBuffer,
            @pointer(target=VkSubpassBeginInfo.class) VkSubpassBeginInfo pSubpassBeginInfo,
            @pointer(target=VkSubpassEndInfo.class) VkSubpassEndInfo pSubpassEndInfo
    ) {
        try {
            HANDLE$vkCmdNextSubpass2.invoke(
                    commandBuffer.handle(),
                    pSubpassBeginInfo != null ? pSubpassBeginInfo.segment() : MemorySegment.NULL,
                    pSubpassEndInfo != null ? pSubpassEndInfo.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdEndRenderPass2(
            VkCommandBuffer commandBuffer,
            @pointer(target=VkSubpassEndInfo.class) VkSubpassEndInfo pSubpassEndInfo
    ) {
        try {
            HANDLE$vkCmdEndRenderPass2.invoke(
                    commandBuffer.handle(),
                    pSubpassEndInfo != null ? pSubpassEndInfo.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkGetSemaphoreCounterValue(
            VkDevice device,
            VkSemaphore semaphore,
            @pointer(target=LongPtr.class) @unsigned LongPtr pValue
    ) {
        try {
            return (int) HANDLE$vkGetSemaphoreCounterValue.invoke(
                    device.handle(),
                    semaphore.handle(),
                    pValue != null ? pValue.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkWaitSemaphores(
            VkDevice device,
            @pointer(target=VkSemaphoreWaitInfo.class) VkSemaphoreWaitInfo pWaitInfo,
            @unsigned long timeout
    ) {
        try {
            return (int) HANDLE$vkWaitSemaphores.invoke(
                    device.handle(),
                    pWaitInfo != null ? pWaitInfo.segment() : MemorySegment.NULL,
                    timeout
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkSignalSemaphore(
            VkDevice device,
            @pointer(target=VkSemaphoreSignalInfo.class) VkSemaphoreSignalInfo pSignalInfo
    ) {
        try {
            return (int) HANDLE$vkSignalSemaphore.invoke(
                    device.handle(),
                    pSignalInfo != null ? pSignalInfo.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkGetAndroidHardwareBufferPropertiesANDROID(
            VkDevice device,
            @pointer(comment="void*") MemorySegment buffer,
            @pointer(target=VkAndroidHardwareBufferPropertiesANDROID.class) VkAndroidHardwareBufferPropertiesANDROID pProperties
    ) {
        try {
            return (int) HANDLE$vkGetAndroidHardwareBufferPropertiesANDROID.invoke(
                    device.handle(),
                    buffer,
                    pProperties != null ? pProperties.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkGetMemoryAndroidHardwareBufferANDROID(
            VkDevice device,
            @pointer(target=VkMemoryGetAndroidHardwareBufferInfoANDROID.class) VkMemoryGetAndroidHardwareBufferInfoANDROID pInfo,
            @pointer(comment="void **") MemorySegment pBuffer
    ) {
        try {
            return (int) HANDLE$vkGetMemoryAndroidHardwareBufferANDROID.invoke(
                    device.handle(),
                    pInfo != null ? pInfo.segment() : MemorySegment.NULL,
                    pBuffer
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

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
            HANDLE$vkCmdDrawIndirectCount.invoke(
                    commandBuffer.handle(),
                    buffer.handle(),
                    offset,
                    countBuffer.handle(),
                    countBufferOffset,
                    maxDrawCount,
                    stride
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

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
            HANDLE$vkCmdDrawIndexedIndirectCount.invoke(
                    commandBuffer.handle(),
                    buffer.handle(),
                    offset,
                    countBuffer.handle(),
                    countBufferOffset,
                    maxDrawCount,
                    stride
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdSetCheckpointNV(
            VkCommandBuffer commandBuffer,
            @pointer(comment="void*") MemorySegment pCheckpointMarker
    ) {
        try {
            HANDLE$vkCmdSetCheckpointNV.invoke(
                    commandBuffer.handle(),
                    pCheckpointMarker
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkGetQueueCheckpointDataNV(
            VkQueue queue,
            @pointer(target=IntPtr.class) @unsigned IntPtr pCheckpointDataCount,
            @pointer(target=VkCheckpointDataNV.class) VkCheckpointDataNV pCheckpointData
    ) {
        try {
            HANDLE$vkGetQueueCheckpointDataNV.invoke(
                    queue.handle(),
                    pCheckpointDataCount != null ? pCheckpointDataCount.segment() : MemorySegment.NULL,
                    pCheckpointData != null ? pCheckpointData.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdBindTransformFeedbackBuffersEXT(
            VkCommandBuffer commandBuffer,
            @unsigned int firstBinding,
            @unsigned int bindingCount,
            @pointer(target=VkBuffer.class) VkBuffer pBuffers,
            @pointer(target=LongPtr.class) @unsigned LongPtr pOffsets,
            @pointer(target=LongPtr.class) @unsigned LongPtr pSizes
    ) {
        try {
            HANDLE$vkCmdBindTransformFeedbackBuffersEXT.invoke(
                    commandBuffer.handle(),
                    firstBinding,
                    bindingCount,
                    pBuffers != null ? pBuffers.segment() : MemorySegment.NULL,
                    pOffsets != null ? pOffsets.segment() : MemorySegment.NULL,
                    pSizes != null ? pSizes.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdBeginTransformFeedbackEXT(
            VkCommandBuffer commandBuffer,
            @unsigned int firstCounterBuffer,
            @unsigned int counterBufferCount,
            @pointer(target=VkBuffer.class) VkBuffer pCounterBuffers,
            @pointer(target=LongPtr.class) @unsigned LongPtr pCounterBufferOffsets
    ) {
        try {
            HANDLE$vkCmdBeginTransformFeedbackEXT.invoke(
                    commandBuffer.handle(),
                    firstCounterBuffer,
                    counterBufferCount,
                    pCounterBuffers != null ? pCounterBuffers.segment() : MemorySegment.NULL,
                    pCounterBufferOffsets != null ? pCounterBufferOffsets.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdEndTransformFeedbackEXT(
            VkCommandBuffer commandBuffer,
            @unsigned int firstCounterBuffer,
            @unsigned int counterBufferCount,
            @pointer(target=VkBuffer.class) VkBuffer pCounterBuffers,
            @pointer(target=LongPtr.class) @unsigned LongPtr pCounterBufferOffsets
    ) {
        try {
            HANDLE$vkCmdEndTransformFeedbackEXT.invoke(
                    commandBuffer.handle(),
                    firstCounterBuffer,
                    counterBufferCount,
                    pCounterBuffers != null ? pCounterBuffers.segment() : MemorySegment.NULL,
                    pCounterBufferOffsets != null ? pCounterBufferOffsets.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdBeginQueryIndexedEXT(
            VkCommandBuffer commandBuffer,
            VkQueryPool queryPool,
            @unsigned int query,
            @enumtype(VkQueryControlFlags.class) int flags,
            @unsigned int index
    ) {
        try {
            HANDLE$vkCmdBeginQueryIndexedEXT.invoke(
                    commandBuffer.handle(),
                    queryPool.handle(),
                    query,
                    flags,
                    index
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdEndQueryIndexedEXT(
            VkCommandBuffer commandBuffer,
            VkQueryPool queryPool,
            @unsigned int query,
            @unsigned int index
    ) {
        try {
            HANDLE$vkCmdEndQueryIndexedEXT.invoke(
                    commandBuffer.handle(),
                    queryPool.handle(),
                    query,
                    index
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

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
            HANDLE$vkCmdDrawIndirectByteCountEXT.invoke(
                    commandBuffer.handle(),
                    instanceCount,
                    firstInstance,
                    counterBuffer.handle(),
                    counterBufferOffset,
                    counterOffset,
                    vertexStride
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdSetExclusiveScissorNV(
            VkCommandBuffer commandBuffer,
            @unsigned int firstExclusiveScissor,
            @unsigned int exclusiveScissorCount,
            @pointer(target=VkRect2D.class) VkRect2D pExclusiveScissors
    ) {
        try {
            HANDLE$vkCmdSetExclusiveScissorNV.invoke(
                    commandBuffer.handle(),
                    firstExclusiveScissor,
                    exclusiveScissorCount,
                    pExclusiveScissors != null ? pExclusiveScissors.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdSetExclusiveScissorEnableNV(
            VkCommandBuffer commandBuffer,
            @unsigned int firstExclusiveScissor,
            @unsigned int exclusiveScissorCount,
            @pointer(target=IntPtr.class) @unsigned IntPtr pExclusiveScissorEnables
    ) {
        try {
            HANDLE$vkCmdSetExclusiveScissorEnableNV.invoke(
                    commandBuffer.handle(),
                    firstExclusiveScissor,
                    exclusiveScissorCount,
                    pExclusiveScissorEnables != null ? pExclusiveScissorEnables.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdBindShadingRateImageNV(
            VkCommandBuffer commandBuffer,
            VkImageView imageView,
            @enumtype(VkImageLayout.class) int imageLayout
    ) {
        try {
            HANDLE$vkCmdBindShadingRateImageNV.invoke(
                    commandBuffer.handle(),
                    imageView.handle(),
                    imageLayout
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdSetViewportShadingRatePaletteNV(
            VkCommandBuffer commandBuffer,
            @unsigned int firstViewport,
            @unsigned int viewportCount,
            @pointer(target=VkShadingRatePaletteNV.class) VkShadingRatePaletteNV pShadingRatePalettes
    ) {
        try {
            HANDLE$vkCmdSetViewportShadingRatePaletteNV.invoke(
                    commandBuffer.handle(),
                    firstViewport,
                    viewportCount,
                    pShadingRatePalettes != null ? pShadingRatePalettes.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdSetCoarseSampleOrderNV(
            VkCommandBuffer commandBuffer,
            @enumtype(VkCoarseSampleOrderTypeNV.class) int sampleOrderType,
            @unsigned int customSampleOrderCount,
            @pointer(target=VkCoarseSampleOrderCustomNV.class) VkCoarseSampleOrderCustomNV pCustomSampleOrders
    ) {
        try {
            HANDLE$vkCmdSetCoarseSampleOrderNV.invoke(
                    commandBuffer.handle(),
                    sampleOrderType,
                    customSampleOrderCount,
                    pCustomSampleOrders != null ? pCustomSampleOrders.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdDrawMeshTasksNV(
            VkCommandBuffer commandBuffer,
            @unsigned int taskCount,
            @unsigned int firstTask
    ) {
        try {
            HANDLE$vkCmdDrawMeshTasksNV.invoke(
                    commandBuffer.handle(),
                    taskCount,
                    firstTask
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdDrawMeshTasksIndirectNV(
            VkCommandBuffer commandBuffer,
            VkBuffer buffer,
            @unsigned long offset,
            @unsigned int drawCount,
            @unsigned int stride
    ) {
        try {
            HANDLE$vkCmdDrawMeshTasksIndirectNV.invoke(
                    commandBuffer.handle(),
                    buffer.handle(),
                    offset,
                    drawCount,
                    stride
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

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
            HANDLE$vkCmdDrawMeshTasksIndirectCountNV.invoke(
                    commandBuffer.handle(),
                    buffer.handle(),
                    offset,
                    countBuffer.handle(),
                    countBufferOffset,
                    maxDrawCount,
                    stride
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdDrawMeshTasksEXT(
            VkCommandBuffer commandBuffer,
            @unsigned int groupCountX,
            @unsigned int groupCountY,
            @unsigned int groupCountZ
    ) {
        try {
            HANDLE$vkCmdDrawMeshTasksEXT.invoke(
                    commandBuffer.handle(),
                    groupCountX,
                    groupCountY,
                    groupCountZ
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdDrawMeshTasksIndirectEXT(
            VkCommandBuffer commandBuffer,
            VkBuffer buffer,
            @unsigned long offset,
            @unsigned int drawCount,
            @unsigned int stride
    ) {
        try {
            HANDLE$vkCmdDrawMeshTasksIndirectEXT.invoke(
                    commandBuffer.handle(),
                    buffer.handle(),
                    offset,
                    drawCount,
                    stride
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

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
            HANDLE$vkCmdDrawMeshTasksIndirectCountEXT.invoke(
                    commandBuffer.handle(),
                    buffer.handle(),
                    offset,
                    countBuffer.handle(),
                    countBufferOffset,
                    maxDrawCount,
                    stride
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkCompileDeferredNV(
            VkDevice device,
            VkPipeline pipeline,
            @unsigned int shader
    ) {
        try {
            return (int) HANDLE$vkCompileDeferredNV.invoke(
                    device.handle(),
                    pipeline.handle(),
                    shader
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkCreateAccelerationStructureNV(
            VkDevice device,
            @pointer(target=VkAccelerationStructureCreateInfoNV.class) VkAccelerationStructureCreateInfoNV pCreateInfo,
            @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator,
            @pointer(target=VkAccelerationStructureNV.class) VkAccelerationStructureNV pAccelerationStructure
    ) {
        try {
            return (int) HANDLE$vkCreateAccelerationStructureNV.invoke(
                    device.handle(),
                    pCreateInfo != null ? pCreateInfo.segment() : MemorySegment.NULL,
                    pAllocator != null ? pAllocator.segment() : MemorySegment.NULL,
                    pAccelerationStructure != null ? pAccelerationStructure.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdBindInvocationMaskHUAWEI(
            VkCommandBuffer commandBuffer,
            VkImageView imageView,
            @enumtype(VkImageLayout.class) int imageLayout
    ) {
        try {
            HANDLE$vkCmdBindInvocationMaskHUAWEI.invoke(
                    commandBuffer.handle(),
                    imageView.handle(),
                    imageLayout
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkDestroyAccelerationStructureKHR(
            VkDevice device,
            VkAccelerationStructureKHR accelerationStructure,
            @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator
    ) {
        try {
            HANDLE$vkDestroyAccelerationStructureKHR.invoke(
                    device.handle(),
                    accelerationStructure.handle(),
                    pAllocator != null ? pAllocator.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkDestroyAccelerationStructureNV(
            VkDevice device,
            VkAccelerationStructureNV accelerationStructure,
            @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator
    ) {
        try {
            HANDLE$vkDestroyAccelerationStructureNV.invoke(
                    device.handle(),
                    accelerationStructure.handle(),
                    pAllocator != null ? pAllocator.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkGetAccelerationStructureMemoryRequirementsNV(
            VkDevice device,
            @pointer(target=VkAccelerationStructureMemoryRequirementsInfoNV.class) VkAccelerationStructureMemoryRequirementsInfoNV pInfo,
            @pointer(target=VkMemoryRequirements2.class) VkMemoryRequirements2 pMemoryRequirements
    ) {
        try {
            HANDLE$vkGetAccelerationStructureMemoryRequirementsNV.invoke(
                    device.handle(),
                    pInfo != null ? pInfo.segment() : MemorySegment.NULL,
                    pMemoryRequirements != null ? pMemoryRequirements.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkBindAccelerationStructureMemoryNV(
            VkDevice device,
            @unsigned int bindInfoCount,
            @pointer(target=VkBindAccelerationStructureMemoryInfoNV.class) VkBindAccelerationStructureMemoryInfoNV pBindInfos
    ) {
        try {
            return (int) HANDLE$vkBindAccelerationStructureMemoryNV.invoke(
                    device.handle(),
                    bindInfoCount,
                    pBindInfos != null ? pBindInfos.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdCopyAccelerationStructureNV(
            VkCommandBuffer commandBuffer,
            VkAccelerationStructureNV dst,
            VkAccelerationStructureNV src,
            @enumtype(VkCopyAccelerationStructureModeKHR.class) int mode
    ) {
        try {
            HANDLE$vkCmdCopyAccelerationStructureNV.invoke(
                    commandBuffer.handle(),
                    dst.handle(),
                    src.handle(),
                    mode
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdCopyAccelerationStructureKHR(
            VkCommandBuffer commandBuffer,
            @pointer(target=VkCopyAccelerationStructureInfoKHR.class) VkCopyAccelerationStructureInfoKHR pInfo
    ) {
        try {
            HANDLE$vkCmdCopyAccelerationStructureKHR.invoke(
                    commandBuffer.handle(),
                    pInfo != null ? pInfo.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkCopyAccelerationStructureKHR(
            VkDevice device,
            VkDeferredOperationKHR deferredOperation,
            @pointer(target=VkCopyAccelerationStructureInfoKHR.class) VkCopyAccelerationStructureInfoKHR pInfo
    ) {
        try {
            return (int) HANDLE$vkCopyAccelerationStructureKHR.invoke(
                    device.handle(),
                    deferredOperation.handle(),
                    pInfo != null ? pInfo.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdCopyAccelerationStructureToMemoryKHR(
            VkCommandBuffer commandBuffer,
            @pointer(target=VkCopyAccelerationStructureToMemoryInfoKHR.class) VkCopyAccelerationStructureToMemoryInfoKHR pInfo
    ) {
        try {
            HANDLE$vkCmdCopyAccelerationStructureToMemoryKHR.invoke(
                    commandBuffer.handle(),
                    pInfo != null ? pInfo.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkCopyAccelerationStructureToMemoryKHR(
            VkDevice device,
            VkDeferredOperationKHR deferredOperation,
            @pointer(target=VkCopyAccelerationStructureToMemoryInfoKHR.class) VkCopyAccelerationStructureToMemoryInfoKHR pInfo
    ) {
        try {
            return (int) HANDLE$vkCopyAccelerationStructureToMemoryKHR.invoke(
                    device.handle(),
                    deferredOperation.handle(),
                    pInfo != null ? pInfo.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdCopyMemoryToAccelerationStructureKHR(
            VkCommandBuffer commandBuffer,
            @pointer(target=VkCopyMemoryToAccelerationStructureInfoKHR.class) VkCopyMemoryToAccelerationStructureInfoKHR pInfo
    ) {
        try {
            HANDLE$vkCmdCopyMemoryToAccelerationStructureKHR.invoke(
                    commandBuffer.handle(),
                    pInfo != null ? pInfo.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkCopyMemoryToAccelerationStructureKHR(
            VkDevice device,
            VkDeferredOperationKHR deferredOperation,
            @pointer(target=VkCopyMemoryToAccelerationStructureInfoKHR.class) VkCopyMemoryToAccelerationStructureInfoKHR pInfo
    ) {
        try {
            return (int) HANDLE$vkCopyMemoryToAccelerationStructureKHR.invoke(
                    device.handle(),
                    deferredOperation.handle(),
                    pInfo != null ? pInfo.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdWriteAccelerationStructuresPropertiesKHR(
            VkCommandBuffer commandBuffer,
            @unsigned int accelerationStructureCount,
            @pointer(target=VkAccelerationStructureKHR.class) VkAccelerationStructureKHR pAccelerationStructures,
            @enumtype(VkQueryType.class) int queryType,
            VkQueryPool queryPool,
            @unsigned int firstQuery
    ) {
        try {
            HANDLE$vkCmdWriteAccelerationStructuresPropertiesKHR.invoke(
                    commandBuffer.handle(),
                    accelerationStructureCount,
                    pAccelerationStructures != null ? pAccelerationStructures.segment() : MemorySegment.NULL,
                    queryType,
                    queryPool.handle(),
                    firstQuery
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdWriteAccelerationStructuresPropertiesNV(
            VkCommandBuffer commandBuffer,
            @unsigned int accelerationStructureCount,
            @pointer(target=VkAccelerationStructureNV.class) VkAccelerationStructureNV pAccelerationStructures,
            @enumtype(VkQueryType.class) int queryType,
            VkQueryPool queryPool,
            @unsigned int firstQuery
    ) {
        try {
            HANDLE$vkCmdWriteAccelerationStructuresPropertiesNV.invoke(
                    commandBuffer.handle(),
                    accelerationStructureCount,
                    pAccelerationStructures != null ? pAccelerationStructures.segment() : MemorySegment.NULL,
                    queryType,
                    queryPool.handle(),
                    firstQuery
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdBuildAccelerationStructureNV(
            VkCommandBuffer commandBuffer,
            @pointer(target=VkAccelerationStructureInfoNV.class) VkAccelerationStructureInfoNV pInfo,
            VkBuffer instanceData,
            @unsigned long instanceOffset,
            @unsigned int update,
            VkAccelerationStructureNV dst,
            VkAccelerationStructureNV src,
            VkBuffer scratch,
            @unsigned long scratchOffset
    ) {
        try {
            HANDLE$vkCmdBuildAccelerationStructureNV.invoke(
                    commandBuffer.handle(),
                    pInfo != null ? pInfo.segment() : MemorySegment.NULL,
                    instanceData.handle(),
                    instanceOffset,
                    update,
                    dst.handle(),
                    src.handle(),
                    scratch.handle(),
                    scratchOffset
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkWriteAccelerationStructuresPropertiesKHR(
            VkDevice device,
            @unsigned int accelerationStructureCount,
            @pointer(target=VkAccelerationStructureKHR.class) VkAccelerationStructureKHR pAccelerationStructures,
            @enumtype(VkQueryType.class) int queryType,
            @unsigned long dataSize,
            @pointer(comment="void*") MemorySegment pData,
            @unsigned long stride
    ) {
        try {
            return (int) HANDLE$vkWriteAccelerationStructuresPropertiesKHR.invoke(
                    device.handle(),
                    accelerationStructureCount,
                    pAccelerationStructures != null ? pAccelerationStructures.segment() : MemorySegment.NULL,
                    queryType,
                    dataSize,
                    pData,
                    stride
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

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
            HANDLE$vkCmdTraceRaysKHR.invoke(
                    commandBuffer.handle(),
                    pRaygenShaderBindingTable != null ? pRaygenShaderBindingTable.segment() : MemorySegment.NULL,
                    pMissShaderBindingTable != null ? pMissShaderBindingTable.segment() : MemorySegment.NULL,
                    pHitShaderBindingTable != null ? pHitShaderBindingTable.segment() : MemorySegment.NULL,
                    pCallableShaderBindingTable != null ? pCallableShaderBindingTable.segment() : MemorySegment.NULL,
                    width,
                    height,
                    depth
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdTraceRaysNV(
            VkCommandBuffer commandBuffer,
            VkBuffer raygenShaderBindingTableBuffer,
            @unsigned long raygenShaderBindingOffset,
            VkBuffer missShaderBindingTableBuffer,
            @unsigned long missShaderBindingOffset,
            @unsigned long missShaderBindingStride,
            VkBuffer hitShaderBindingTableBuffer,
            @unsigned long hitShaderBindingOffset,
            @unsigned long hitShaderBindingStride,
            VkBuffer callableShaderBindingTableBuffer,
            @unsigned long callableShaderBindingOffset,
            @unsigned long callableShaderBindingStride,
            @unsigned int width,
            @unsigned int height,
            @unsigned int depth
    ) {
        try {
            HANDLE$vkCmdTraceRaysNV.invoke(
                    commandBuffer.handle(),
                    raygenShaderBindingTableBuffer.handle(),
                    raygenShaderBindingOffset,
                    missShaderBindingTableBuffer.handle(),
                    missShaderBindingOffset,
                    missShaderBindingStride,
                    hitShaderBindingTableBuffer.handle(),
                    hitShaderBindingOffset,
                    hitShaderBindingStride,
                    callableShaderBindingTableBuffer.handle(),
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

    public @enumtype(VkResult.class) int vkGetRayTracingShaderGroupHandlesKHR(
            VkDevice device,
            VkPipeline pipeline,
            @unsigned int firstGroup,
            @unsigned int groupCount,
            @unsigned long dataSize,
            @pointer(comment="void*") MemorySegment pData
    ) {
        try {
            return (int) HANDLE$vkGetRayTracingShaderGroupHandlesKHR.invoke(
                    device.handle(),
                    pipeline.handle(),
                    firstGroup,
                    groupCount,
                    dataSize,
                    pData
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkGetRayTracingCaptureReplayShaderGroupHandlesKHR(
            VkDevice device,
            VkPipeline pipeline,
            @unsigned int firstGroup,
            @unsigned int groupCount,
            @unsigned long dataSize,
            @pointer(comment="void*") MemorySegment pData
    ) {
        try {
            return (int) HANDLE$vkGetRayTracingCaptureReplayShaderGroupHandlesKHR.invoke(
                    device.handle(),
                    pipeline.handle(),
                    firstGroup,
                    groupCount,
                    dataSize,
                    pData
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkGetAccelerationStructureHandleNV(
            VkDevice device,
            VkAccelerationStructureNV accelerationStructure,
            @unsigned long dataSize,
            @pointer(comment="void*") MemorySegment pData
    ) {
        try {
            return (int) HANDLE$vkGetAccelerationStructureHandleNV.invoke(
                    device.handle(),
                    accelerationStructure.handle(),
                    dataSize,
                    pData
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkCreateRayTracingPipelinesNV(
            VkDevice device,
            VkPipelineCache pipelineCache,
            @unsigned int createInfoCount,
            @pointer(target=VkRayTracingPipelineCreateInfoNV.class) VkRayTracingPipelineCreateInfoNV pCreateInfos,
            @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator,
            @pointer(target=VkPipeline.class) VkPipeline pPipelines
    ) {
        try {
            return (int) HANDLE$vkCreateRayTracingPipelinesNV.invoke(
                    device.handle(),
                    pipelineCache.handle(),
                    createInfoCount,
                    pCreateInfos != null ? pCreateInfos.segment() : MemorySegment.NULL,
                    pAllocator != null ? pAllocator.segment() : MemorySegment.NULL,
                    pPipelines != null ? pPipelines.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkCreateRayTracingPipelinesKHR(
            VkDevice device,
            VkDeferredOperationKHR deferredOperation,
            VkPipelineCache pipelineCache,
            @unsigned int createInfoCount,
            @pointer(target=VkRayTracingPipelineCreateInfoKHR.class) VkRayTracingPipelineCreateInfoKHR pCreateInfos,
            @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator,
            @pointer(target=VkPipeline.class) VkPipeline pPipelines
    ) {
        try {
            return (int) HANDLE$vkCreateRayTracingPipelinesKHR.invoke(
                    device.handle(),
                    deferredOperation.handle(),
                    pipelineCache.handle(),
                    createInfoCount,
                    pCreateInfos != null ? pCreateInfos.segment() : MemorySegment.NULL,
                    pAllocator != null ? pAllocator.segment() : MemorySegment.NULL,
                    pPipelines != null ? pPipelines.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkGetPhysicalDeviceCooperativeMatrixPropertiesNV(
            VkPhysicalDevice physicalDevice,
            @pointer(target=IntPtr.class) @unsigned IntPtr pPropertyCount,
            @pointer(target=VkCooperativeMatrixPropertiesNV.class) VkCooperativeMatrixPropertiesNV pProperties
    ) {
        try {
            return (int) HANDLE$vkGetPhysicalDeviceCooperativeMatrixPropertiesNV.invoke(
                    physicalDevice.handle(),
                    pPropertyCount != null ? pPropertyCount.segment() : MemorySegment.NULL,
                    pProperties != null ? pProperties.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdTraceRaysIndirectKHR(
            VkCommandBuffer commandBuffer,
            @pointer(target=VkStridedDeviceAddressRegionKHR.class) VkStridedDeviceAddressRegionKHR pRaygenShaderBindingTable,
            @pointer(target=VkStridedDeviceAddressRegionKHR.class) VkStridedDeviceAddressRegionKHR pMissShaderBindingTable,
            @pointer(target=VkStridedDeviceAddressRegionKHR.class) VkStridedDeviceAddressRegionKHR pHitShaderBindingTable,
            @pointer(target=VkStridedDeviceAddressRegionKHR.class) VkStridedDeviceAddressRegionKHR pCallableShaderBindingTable,
            @unsigned long indirectDeviceAddress
    ) {
        try {
            HANDLE$vkCmdTraceRaysIndirectKHR.invoke(
                    commandBuffer.handle(),
                    pRaygenShaderBindingTable != null ? pRaygenShaderBindingTable.segment() : MemorySegment.NULL,
                    pMissShaderBindingTable != null ? pMissShaderBindingTable.segment() : MemorySegment.NULL,
                    pHitShaderBindingTable != null ? pHitShaderBindingTable.segment() : MemorySegment.NULL,
                    pCallableShaderBindingTable != null ? pCallableShaderBindingTable.segment() : MemorySegment.NULL,
                    indirectDeviceAddress
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdTraceRaysIndirect2KHR(
            VkCommandBuffer commandBuffer,
            @unsigned long indirectDeviceAddress
    ) {
        try {
            HANDLE$vkCmdTraceRaysIndirect2KHR.invoke(
                    commandBuffer.handle(),
                    indirectDeviceAddress
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkGetDeviceAccelerationStructureCompatibilityKHR(
            VkDevice device,
            @pointer(target=VkAccelerationStructureVersionInfoKHR.class) VkAccelerationStructureVersionInfoKHR pVersionInfo,
            @pointer(comment="enum VkAccelerationStructureCompatibilityKHR*") MemorySegment pCompatibility
    ) {
        try {
            HANDLE$vkGetDeviceAccelerationStructureCompatibilityKHR.invoke(
                    device.handle(),
                    pVersionInfo != null ? pVersionInfo.segment() : MemorySegment.NULL,
                    pCompatibility
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @unsigned long vkGetRayTracingShaderGroupStackSizeKHR(
            VkDevice device,
            VkPipeline pipeline,
            @unsigned int group,
            @enumtype(VkShaderGroupShaderKHR.class) int groupShader
    ) {
        try {
            return (long) HANDLE$vkGetRayTracingShaderGroupStackSizeKHR.invoke(
                    device.handle(),
                    pipeline.handle(),
                    group,
                    groupShader
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdSetRayTracingPipelineStackSizeKHR(
            VkCommandBuffer commandBuffer,
            @unsigned int pipelineStackSize
    ) {
        try {
            HANDLE$vkCmdSetRayTracingPipelineStackSizeKHR.invoke(
                    commandBuffer.handle(),
                    pipelineStackSize
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @unsigned int vkGetImageViewHandleNVX(
            VkDevice device,
            @pointer(target=VkImageViewHandleInfoNVX.class) VkImageViewHandleInfoNVX pInfo
    ) {
        try {
            return (int) HANDLE$vkGetImageViewHandleNVX.invoke(
                    device.handle(),
                    pInfo != null ? pInfo.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkGetImageViewAddressNVX(
            VkDevice device,
            VkImageView imageView,
            @pointer(target=VkImageViewAddressPropertiesNVX.class) VkImageViewAddressPropertiesNVX pProperties
    ) {
        try {
            return (int) HANDLE$vkGetImageViewAddressNVX.invoke(
                    device.handle(),
                    imageView.handle(),
                    pProperties != null ? pProperties.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkGetPhysicalDeviceSurfacePresentModes2EXT(
            VkPhysicalDevice physicalDevice,
            @pointer(target=VkPhysicalDeviceSurfaceInfo2KHR.class) VkPhysicalDeviceSurfaceInfo2KHR pSurfaceInfo,
            @pointer(target=IntPtr.class) @unsigned IntPtr pPresentModeCount,
            @pointer(comment="enum VkPresentModeKHR*") MemorySegment pPresentModes
    ) {
        try {
            return (int) HANDLE$vkGetPhysicalDeviceSurfacePresentModes2EXT.invoke(
                    physicalDevice.handle(),
                    pSurfaceInfo != null ? pSurfaceInfo.segment() : MemorySegment.NULL,
                    pPresentModeCount != null ? pPresentModeCount.segment() : MemorySegment.NULL,
                    pPresentModes
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkGetDeviceGroupSurfacePresentModes2EXT(
            VkDevice device,
            @pointer(target=VkPhysicalDeviceSurfaceInfo2KHR.class) VkPhysicalDeviceSurfaceInfo2KHR pSurfaceInfo,
            @pointer(comment="enum VkDeviceGroupPresentModeFlagsKHR*") MemorySegment pModes
    ) {
        try {
            return (int) HANDLE$vkGetDeviceGroupSurfacePresentModes2EXT.invoke(
                    device.handle(),
                    pSurfaceInfo != null ? pSurfaceInfo.segment() : MemorySegment.NULL,
                    pModes
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkAcquireFullScreenExclusiveModeEXT(
            VkDevice device,
            VkSwapchainKHR swapchain
    ) {
        try {
            return (int) HANDLE$vkAcquireFullScreenExclusiveModeEXT.invoke(
                    device.handle(),
                    swapchain.handle()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkReleaseFullScreenExclusiveModeEXT(
            VkDevice device,
            VkSwapchainKHR swapchain
    ) {
        try {
            return (int) HANDLE$vkReleaseFullScreenExclusiveModeEXT.invoke(
                    device.handle(),
                    swapchain.handle()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkEnumeratePhysicalDeviceQueueFamilyPerformanceQueryCountersKHR(
            VkPhysicalDevice physicalDevice,
            @unsigned int queueFamilyIndex,
            @pointer(target=IntPtr.class) @unsigned IntPtr pCounterCount,
            @pointer(target=VkPerformanceCounterKHR.class) VkPerformanceCounterKHR pCounters,
            @pointer(target=VkPerformanceCounterDescriptionKHR.class) VkPerformanceCounterDescriptionKHR pCounterDescriptions
    ) {
        try {
            return (int) HANDLE$vkEnumeratePhysicalDeviceQueueFamilyPerformanceQueryCountersKHR.invoke(
                    physicalDevice.handle(),
                    queueFamilyIndex,
                    pCounterCount != null ? pCounterCount.segment() : MemorySegment.NULL,
                    pCounters != null ? pCounters.segment() : MemorySegment.NULL,
                    pCounterDescriptions != null ? pCounterDescriptions.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkGetPhysicalDeviceQueueFamilyPerformanceQueryPassesKHR(
            VkPhysicalDevice physicalDevice,
            @pointer(target=VkQueryPoolPerformanceCreateInfoKHR.class) VkQueryPoolPerformanceCreateInfoKHR pPerformanceQueryCreateInfo,
            @pointer(target=IntPtr.class) @unsigned IntPtr pNumPasses
    ) {
        try {
            HANDLE$vkGetPhysicalDeviceQueueFamilyPerformanceQueryPassesKHR.invoke(
                    physicalDevice.handle(),
                    pPerformanceQueryCreateInfo != null ? pPerformanceQueryCreateInfo.segment() : MemorySegment.NULL,
                    pNumPasses != null ? pNumPasses.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkAcquireProfilingLockKHR(
            VkDevice device,
            @pointer(target=VkAcquireProfilingLockInfoKHR.class) VkAcquireProfilingLockInfoKHR pInfo
    ) {
        try {
            return (int) HANDLE$vkAcquireProfilingLockKHR.invoke(
                    device.handle(),
                    pInfo != null ? pInfo.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkReleaseProfilingLockKHR(
            VkDevice device
    ) {
        try {
            HANDLE$vkReleaseProfilingLockKHR.invoke(
                    device.handle()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkGetImageDrmFormatModifierPropertiesEXT(
            VkDevice device,
            VkImage image,
            @pointer(target=VkImageDrmFormatModifierPropertiesEXT.class) VkImageDrmFormatModifierPropertiesEXT pProperties
    ) {
        try {
            return (int) HANDLE$vkGetImageDrmFormatModifierPropertiesEXT.invoke(
                    device.handle(),
                    image.handle(),
                    pProperties != null ? pProperties.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @unsigned long vkGetBufferOpaqueCaptureAddress(
            VkDevice device,
            @pointer(target=VkBufferDeviceAddressInfo.class) VkBufferDeviceAddressInfo pInfo
    ) {
        try {
            return (long) HANDLE$vkGetBufferOpaqueCaptureAddress.invoke(
                    device.handle(),
                    pInfo != null ? pInfo.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @unsigned long vkGetBufferDeviceAddress(
            VkDevice device,
            @pointer(target=VkBufferDeviceAddressInfo.class) VkBufferDeviceAddressInfo pInfo
    ) {
        try {
            return (long) HANDLE$vkGetBufferDeviceAddress.invoke(
                    device.handle(),
                    pInfo != null ? pInfo.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkGetPhysicalDeviceSupportedFramebufferMixedSamplesCombinationsNV(
            VkPhysicalDevice physicalDevice,
            @pointer(target=IntPtr.class) @unsigned IntPtr pCombinationCount,
            @pointer(target=VkFramebufferMixedSamplesCombinationNV.class) VkFramebufferMixedSamplesCombinationNV pCombinations
    ) {
        try {
            return (int) HANDLE$vkGetPhysicalDeviceSupportedFramebufferMixedSamplesCombinationsNV.invoke(
                    physicalDevice.handle(),
                    pCombinationCount != null ? pCombinationCount.segment() : MemorySegment.NULL,
                    pCombinations != null ? pCombinations.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkInitializePerformanceApiINTEL(
            VkDevice device,
            @pointer(target=VkInitializePerformanceApiInfoINTEL.class) VkInitializePerformanceApiInfoINTEL pInitializeInfo
    ) {
        try {
            return (int) HANDLE$vkInitializePerformanceApiINTEL.invoke(
                    device.handle(),
                    pInitializeInfo != null ? pInitializeInfo.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkUninitializePerformanceApiINTEL(
            VkDevice device
    ) {
        try {
            HANDLE$vkUninitializePerformanceApiINTEL.invoke(
                    device.handle()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkCmdSetPerformanceMarkerINTEL(
            VkCommandBuffer commandBuffer,
            @pointer(target=VkPerformanceMarkerInfoINTEL.class) VkPerformanceMarkerInfoINTEL pMarkerInfo
    ) {
        try {
            return (int) HANDLE$vkCmdSetPerformanceMarkerINTEL.invoke(
                    commandBuffer.handle(),
                    pMarkerInfo != null ? pMarkerInfo.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkCmdSetPerformanceStreamMarkerINTEL(
            VkCommandBuffer commandBuffer,
            @pointer(target=VkPerformanceStreamMarkerInfoINTEL.class) VkPerformanceStreamMarkerInfoINTEL pMarkerInfo
    ) {
        try {
            return (int) HANDLE$vkCmdSetPerformanceStreamMarkerINTEL.invoke(
                    commandBuffer.handle(),
                    pMarkerInfo != null ? pMarkerInfo.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkCmdSetPerformanceOverrideINTEL(
            VkCommandBuffer commandBuffer,
            @pointer(target=VkPerformanceOverrideInfoINTEL.class) VkPerformanceOverrideInfoINTEL pOverrideInfo
    ) {
        try {
            return (int) HANDLE$vkCmdSetPerformanceOverrideINTEL.invoke(
                    commandBuffer.handle(),
                    pOverrideInfo != null ? pOverrideInfo.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkAcquirePerformanceConfigurationINTEL(
            VkDevice device,
            @pointer(target=VkPerformanceConfigurationAcquireInfoINTEL.class) VkPerformanceConfigurationAcquireInfoINTEL pAcquireInfo,
            @pointer(target=VkPerformanceConfigurationINTEL.class) VkPerformanceConfigurationINTEL pConfiguration
    ) {
        try {
            return (int) HANDLE$vkAcquirePerformanceConfigurationINTEL.invoke(
                    device.handle(),
                    pAcquireInfo != null ? pAcquireInfo.segment() : MemorySegment.NULL,
                    pConfiguration != null ? pConfiguration.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkReleasePerformanceConfigurationINTEL(
            VkDevice device,
            VkPerformanceConfigurationINTEL configuration
    ) {
        try {
            return (int) HANDLE$vkReleasePerformanceConfigurationINTEL.invoke(
                    device.handle(),
                    configuration.handle()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkQueueSetPerformanceConfigurationINTEL(
            VkQueue queue,
            VkPerformanceConfigurationINTEL configuration
    ) {
        try {
            return (int) HANDLE$vkQueueSetPerformanceConfigurationINTEL.invoke(
                    queue.handle(),
                    configuration.handle()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkGetPerformanceParameterINTEL(
            VkDevice device,
            @enumtype(VkPerformanceParameterTypeINTEL.class) int parameter,
            @pointer(target=VkPerformanceValueINTEL.class) VkPerformanceValueINTEL pValue
    ) {
        try {
            return (int) HANDLE$vkGetPerformanceParameterINTEL.invoke(
                    device.handle(),
                    parameter,
                    pValue != null ? pValue.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @unsigned long vkGetDeviceMemoryOpaqueCaptureAddress(
            VkDevice device,
            @pointer(target=VkDeviceMemoryOpaqueCaptureAddressInfo.class) VkDeviceMemoryOpaqueCaptureAddressInfo pInfo
    ) {
        try {
            return (long) HANDLE$vkGetDeviceMemoryOpaqueCaptureAddress.invoke(
                    device.handle(),
                    pInfo != null ? pInfo.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkGetPipelineExecutablePropertiesKHR(
            VkDevice device,
            @pointer(target=VkPipelineInfoKHR.class) VkPipelineInfoKHR pPipelineInfo,
            @pointer(target=IntPtr.class) @unsigned IntPtr pExecutableCount,
            @pointer(target=VkPipelineExecutablePropertiesKHR.class) VkPipelineExecutablePropertiesKHR pProperties
    ) {
        try {
            return (int) HANDLE$vkGetPipelineExecutablePropertiesKHR.invoke(
                    device.handle(),
                    pPipelineInfo != null ? pPipelineInfo.segment() : MemorySegment.NULL,
                    pExecutableCount != null ? pExecutableCount.segment() : MemorySegment.NULL,
                    pProperties != null ? pProperties.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkGetPipelineExecutableStatisticsKHR(
            VkDevice device,
            @pointer(target=VkPipelineExecutableInfoKHR.class) VkPipelineExecutableInfoKHR pExecutableInfo,
            @pointer(target=IntPtr.class) @unsigned IntPtr pStatisticCount,
            @pointer(target=VkPipelineExecutableStatisticKHR.class) VkPipelineExecutableStatisticKHR pStatistics
    ) {
        try {
            return (int) HANDLE$vkGetPipelineExecutableStatisticsKHR.invoke(
                    device.handle(),
                    pExecutableInfo != null ? pExecutableInfo.segment() : MemorySegment.NULL,
                    pStatisticCount != null ? pStatisticCount.segment() : MemorySegment.NULL,
                    pStatistics != null ? pStatistics.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkGetPipelineExecutableInternalRepresentationsKHR(
            VkDevice device,
            @pointer(target=VkPipelineExecutableInfoKHR.class) VkPipelineExecutableInfoKHR pExecutableInfo,
            @pointer(target=IntPtr.class) @unsigned IntPtr pInternalRepresentationCount,
            @pointer(target=VkPipelineExecutableInternalRepresentationKHR.class) VkPipelineExecutableInternalRepresentationKHR pInternalRepresentations
    ) {
        try {
            return (int) HANDLE$vkGetPipelineExecutableInternalRepresentationsKHR.invoke(
                    device.handle(),
                    pExecutableInfo != null ? pExecutableInfo.segment() : MemorySegment.NULL,
                    pInternalRepresentationCount != null ? pInternalRepresentationCount.segment() : MemorySegment.NULL,
                    pInternalRepresentations != null ? pInternalRepresentations.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdSetLineStippleKHR(
            VkCommandBuffer commandBuffer,
            @unsigned int lineStippleFactor,
            @unsigned short lineStipplePattern
    ) {
        try {
            HANDLE$vkCmdSetLineStippleKHR.invoke(
                    commandBuffer.handle(),
                    lineStippleFactor,
                    lineStipplePattern
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkCreateAccelerationStructureKHR(
            VkDevice device,
            @pointer(target=VkAccelerationStructureCreateInfoKHR.class) VkAccelerationStructureCreateInfoKHR pCreateInfo,
            @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator,
            @pointer(target=VkAccelerationStructureKHR.class) VkAccelerationStructureKHR pAccelerationStructure
    ) {
        try {
            return (int) HANDLE$vkCreateAccelerationStructureKHR.invoke(
                    device.handle(),
                    pCreateInfo != null ? pCreateInfo.segment() : MemorySegment.NULL,
                    pAllocator != null ? pAllocator.segment() : MemorySegment.NULL,
                    pAccelerationStructure != null ? pAccelerationStructure.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdBuildAccelerationStructuresKHR(
            VkCommandBuffer commandBuffer,
            @unsigned int infoCount,
            @pointer(target=VkAccelerationStructureBuildGeometryInfoKHR.class) VkAccelerationStructureBuildGeometryInfoKHR pInfos,
            @pointer(comment="struct VkAccelerationStructureBuildRangeInfoKHR const**") MemorySegment ppBuildRangeInfos
    ) {
        try {
            HANDLE$vkCmdBuildAccelerationStructuresKHR.invoke(
                    commandBuffer.handle(),
                    infoCount,
                    pInfos != null ? pInfos.segment() : MemorySegment.NULL,
                    ppBuildRangeInfos
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdBuildAccelerationStructuresIndirectKHR(
            VkCommandBuffer commandBuffer,
            @unsigned int infoCount,
            @pointer(target=VkAccelerationStructureBuildGeometryInfoKHR.class) VkAccelerationStructureBuildGeometryInfoKHR pInfos,
            @pointer(target=LongPtr.class) @unsigned LongPtr pIndirectDeviceAddresses,
            @pointer(target=IntPtr.class) @unsigned IntPtr pIndirectStrides,
            @pointer(comment="uint32_t const**") MemorySegment ppMaxPrimitiveCounts
    ) {
        try {
            HANDLE$vkCmdBuildAccelerationStructuresIndirectKHR.invoke(
                    commandBuffer.handle(),
                    infoCount,
                    pInfos != null ? pInfos.segment() : MemorySegment.NULL,
                    pIndirectDeviceAddresses != null ? pIndirectDeviceAddresses.segment() : MemorySegment.NULL,
                    pIndirectStrides != null ? pIndirectStrides.segment() : MemorySegment.NULL,
                    ppMaxPrimitiveCounts
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkBuildAccelerationStructuresKHR(
            VkDevice device,
            VkDeferredOperationKHR deferredOperation,
            @unsigned int infoCount,
            @pointer(target=VkAccelerationStructureBuildGeometryInfoKHR.class) VkAccelerationStructureBuildGeometryInfoKHR pInfos,
            @pointer(comment="struct VkAccelerationStructureBuildRangeInfoKHR const**") MemorySegment ppBuildRangeInfos
    ) {
        try {
            return (int) HANDLE$vkBuildAccelerationStructuresKHR.invoke(
                    device.handle(),
                    deferredOperation.handle(),
                    infoCount,
                    pInfos != null ? pInfos.segment() : MemorySegment.NULL,
                    ppBuildRangeInfos
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @unsigned long vkGetAccelerationStructureDeviceAddressKHR(
            VkDevice device,
            @pointer(target=VkAccelerationStructureDeviceAddressInfoKHR.class) VkAccelerationStructureDeviceAddressInfoKHR pInfo
    ) {
        try {
            return (long) HANDLE$vkGetAccelerationStructureDeviceAddressKHR.invoke(
                    device.handle(),
                    pInfo != null ? pInfo.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkCreateDeferredOperationKHR(
            VkDevice device,
            @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator,
            @pointer(target=VkDeferredOperationKHR.class) VkDeferredOperationKHR pDeferredOperation
    ) {
        try {
            return (int) HANDLE$vkCreateDeferredOperationKHR.invoke(
                    device.handle(),
                    pAllocator != null ? pAllocator.segment() : MemorySegment.NULL,
                    pDeferredOperation != null ? pDeferredOperation.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkDestroyDeferredOperationKHR(
            VkDevice device,
            VkDeferredOperationKHR operation,
            @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator
    ) {
        try {
            HANDLE$vkDestroyDeferredOperationKHR.invoke(
                    device.handle(),
                    operation.handle(),
                    pAllocator != null ? pAllocator.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @unsigned int vkGetDeferredOperationMaxConcurrencyKHR(
            VkDevice device,
            VkDeferredOperationKHR operation
    ) {
        try {
            return (int) HANDLE$vkGetDeferredOperationMaxConcurrencyKHR.invoke(
                    device.handle(),
                    operation.handle()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkGetDeferredOperationResultKHR(
            VkDevice device,
            VkDeferredOperationKHR operation
    ) {
        try {
            return (int) HANDLE$vkGetDeferredOperationResultKHR.invoke(
                    device.handle(),
                    operation.handle()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkDeferredOperationJoinKHR(
            VkDevice device,
            VkDeferredOperationKHR operation
    ) {
        try {
            return (int) HANDLE$vkDeferredOperationJoinKHR.invoke(
                    device.handle(),
                    operation.handle()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkGetPipelineIndirectMemoryRequirementsNV(
            VkDevice device,
            @pointer(target=VkComputePipelineCreateInfo.class) VkComputePipelineCreateInfo pCreateInfo,
            @pointer(target=VkMemoryRequirements2.class) VkMemoryRequirements2 pMemoryRequirements
    ) {
        try {
            HANDLE$vkGetPipelineIndirectMemoryRequirementsNV.invoke(
                    device.handle(),
                    pCreateInfo != null ? pCreateInfo.segment() : MemorySegment.NULL,
                    pMemoryRequirements != null ? pMemoryRequirements.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @unsigned long vkGetPipelineIndirectDeviceAddressNV(
            VkDevice device,
            @pointer(target=VkPipelineIndirectDeviceAddressInfoNV.class) VkPipelineIndirectDeviceAddressInfoNV pInfo
    ) {
        try {
            return (long) HANDLE$vkGetPipelineIndirectDeviceAddressNV.invoke(
                    device.handle(),
                    pInfo != null ? pInfo.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkAntiLagUpdateAMD(
            VkDevice device,
            @pointer(target=VkAntiLagDataAMD.class) VkAntiLagDataAMD pData
    ) {
        try {
            HANDLE$vkAntiLagUpdateAMD.invoke(
                    device.handle(),
                    pData != null ? pData.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdSetCullMode(
            VkCommandBuffer commandBuffer,
            @enumtype(VkCullModeFlags.class) int cullMode
    ) {
        try {
            HANDLE$vkCmdSetCullMode.invoke(
                    commandBuffer.handle(),
                    cullMode
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdSetFrontFace(
            VkCommandBuffer commandBuffer,
            @enumtype(VkFrontFace.class) int frontFace
    ) {
        try {
            HANDLE$vkCmdSetFrontFace.invoke(
                    commandBuffer.handle(),
                    frontFace
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdSetPrimitiveTopology(
            VkCommandBuffer commandBuffer,
            @enumtype(VkPrimitiveTopology.class) int primitiveTopology
    ) {
        try {
            HANDLE$vkCmdSetPrimitiveTopology.invoke(
                    commandBuffer.handle(),
                    primitiveTopology
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdSetViewportWithCount(
            VkCommandBuffer commandBuffer,
            @unsigned int viewportCount,
            @pointer(target=VkViewport.class) VkViewport pViewports
    ) {
        try {
            HANDLE$vkCmdSetViewportWithCount.invoke(
                    commandBuffer.handle(),
                    viewportCount,
                    pViewports != null ? pViewports.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdSetScissorWithCount(
            VkCommandBuffer commandBuffer,
            @unsigned int scissorCount,
            @pointer(target=VkRect2D.class) VkRect2D pScissors
    ) {
        try {
            HANDLE$vkCmdSetScissorWithCount.invoke(
                    commandBuffer.handle(),
                    scissorCount,
                    pScissors != null ? pScissors.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdBindIndexBuffer2KHR(
            VkCommandBuffer commandBuffer,
            VkBuffer buffer,
            @unsigned long offset,
            @unsigned long size,
            @enumtype(VkIndexType.class) int indexType
    ) {
        try {
            HANDLE$vkCmdBindIndexBuffer2KHR.invoke(
                    commandBuffer.handle(),
                    buffer.handle(),
                    offset,
                    size,
                    indexType
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdBindVertexBuffers2(
            VkCommandBuffer commandBuffer,
            @unsigned int firstBinding,
            @unsigned int bindingCount,
            @pointer(target=VkBuffer.class) VkBuffer pBuffers,
            @pointer(target=LongPtr.class) @unsigned LongPtr pOffsets,
            @pointer(target=LongPtr.class) @unsigned LongPtr pSizes,
            @pointer(target=LongPtr.class) @unsigned LongPtr pStrides
    ) {
        try {
            HANDLE$vkCmdBindVertexBuffers2.invoke(
                    commandBuffer.handle(),
                    firstBinding,
                    bindingCount,
                    pBuffers != null ? pBuffers.segment() : MemorySegment.NULL,
                    pOffsets != null ? pOffsets.segment() : MemorySegment.NULL,
                    pSizes != null ? pSizes.segment() : MemorySegment.NULL,
                    pStrides != null ? pStrides.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdSetDepthTestEnable(
            VkCommandBuffer commandBuffer,
            @unsigned int depthTestEnable
    ) {
        try {
            HANDLE$vkCmdSetDepthTestEnable.invoke(
                    commandBuffer.handle(),
                    depthTestEnable
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdSetDepthWriteEnable(
            VkCommandBuffer commandBuffer,
            @unsigned int depthWriteEnable
    ) {
        try {
            HANDLE$vkCmdSetDepthWriteEnable.invoke(
                    commandBuffer.handle(),
                    depthWriteEnable
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdSetDepthCompareOp(
            VkCommandBuffer commandBuffer,
            @enumtype(VkCompareOp.class) int depthCompareOp
    ) {
        try {
            HANDLE$vkCmdSetDepthCompareOp.invoke(
                    commandBuffer.handle(),
                    depthCompareOp
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdSetDepthBoundsTestEnable(
            VkCommandBuffer commandBuffer,
            @unsigned int depthBoundsTestEnable
    ) {
        try {
            HANDLE$vkCmdSetDepthBoundsTestEnable.invoke(
                    commandBuffer.handle(),
                    depthBoundsTestEnable
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdSetStencilTestEnable(
            VkCommandBuffer commandBuffer,
            @unsigned int stencilTestEnable
    ) {
        try {
            HANDLE$vkCmdSetStencilTestEnable.invoke(
                    commandBuffer.handle(),
                    stencilTestEnable
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdSetStencilOp(
            VkCommandBuffer commandBuffer,
            @enumtype(VkStencilFaceFlags.class) int faceMask,
            @enumtype(VkStencilOp.class) int failOp,
            @enumtype(VkStencilOp.class) int passOp,
            @enumtype(VkStencilOp.class) int depthFailOp,
            @enumtype(VkCompareOp.class) int compareOp
    ) {
        try {
            HANDLE$vkCmdSetStencilOp.invoke(
                    commandBuffer.handle(),
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

    public void vkCmdSetPatchControlPointsEXT(
            VkCommandBuffer commandBuffer,
            @unsigned int patchControlPoints
    ) {
        try {
            HANDLE$vkCmdSetPatchControlPointsEXT.invoke(
                    commandBuffer.handle(),
                    patchControlPoints
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdSetRasterizerDiscardEnable(
            VkCommandBuffer commandBuffer,
            @unsigned int rasterizerDiscardEnable
    ) {
        try {
            HANDLE$vkCmdSetRasterizerDiscardEnable.invoke(
                    commandBuffer.handle(),
                    rasterizerDiscardEnable
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdSetDepthBiasEnable(
            VkCommandBuffer commandBuffer,
            @unsigned int depthBiasEnable
    ) {
        try {
            HANDLE$vkCmdSetDepthBiasEnable.invoke(
                    commandBuffer.handle(),
                    depthBiasEnable
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdSetLogicOpEXT(
            VkCommandBuffer commandBuffer,
            @enumtype(VkLogicOp.class) int logicOp
    ) {
        try {
            HANDLE$vkCmdSetLogicOpEXT.invoke(
                    commandBuffer.handle(),
                    logicOp
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdSetPrimitiveRestartEnable(
            VkCommandBuffer commandBuffer,
            @unsigned int primitiveRestartEnable
    ) {
        try {
            HANDLE$vkCmdSetPrimitiveRestartEnable.invoke(
                    commandBuffer.handle(),
                    primitiveRestartEnable
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdSetTessellationDomainOriginEXT(
            VkCommandBuffer commandBuffer,
            @enumtype(VkTessellationDomainOrigin.class) int domainOrigin
    ) {
        try {
            HANDLE$vkCmdSetTessellationDomainOriginEXT.invoke(
                    commandBuffer.handle(),
                    domainOrigin
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdSetDepthClampEnableEXT(
            VkCommandBuffer commandBuffer,
            @unsigned int depthClampEnable
    ) {
        try {
            HANDLE$vkCmdSetDepthClampEnableEXT.invoke(
                    commandBuffer.handle(),
                    depthClampEnable
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdSetPolygonModeEXT(
            VkCommandBuffer commandBuffer,
            @enumtype(VkPolygonMode.class) int polygonMode
    ) {
        try {
            HANDLE$vkCmdSetPolygonModeEXT.invoke(
                    commandBuffer.handle(),
                    polygonMode
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdSetRasterizationSamplesEXT(
            VkCommandBuffer commandBuffer,
            @enumtype(VkSampleCountFlags.class) int rasterizationSamples
    ) {
        try {
            HANDLE$vkCmdSetRasterizationSamplesEXT.invoke(
                    commandBuffer.handle(),
                    rasterizationSamples
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdSetSampleMaskEXT(
            VkCommandBuffer commandBuffer,
            @enumtype(VkSampleCountFlags.class) int samples,
            @pointer(target=IntPtr.class) @unsigned IntPtr pSampleMask
    ) {
        try {
            HANDLE$vkCmdSetSampleMaskEXT.invoke(
                    commandBuffer.handle(),
                    samples,
                    pSampleMask != null ? pSampleMask.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdSetAlphaToCoverageEnableEXT(
            VkCommandBuffer commandBuffer,
            @unsigned int alphaToCoverageEnable
    ) {
        try {
            HANDLE$vkCmdSetAlphaToCoverageEnableEXT.invoke(
                    commandBuffer.handle(),
                    alphaToCoverageEnable
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdSetAlphaToOneEnableEXT(
            VkCommandBuffer commandBuffer,
            @unsigned int alphaToOneEnable
    ) {
        try {
            HANDLE$vkCmdSetAlphaToOneEnableEXT.invoke(
                    commandBuffer.handle(),
                    alphaToOneEnable
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdSetLogicOpEnableEXT(
            VkCommandBuffer commandBuffer,
            @unsigned int logicOpEnable
    ) {
        try {
            HANDLE$vkCmdSetLogicOpEnableEXT.invoke(
                    commandBuffer.handle(),
                    logicOpEnable
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdSetColorBlendEnableEXT(
            VkCommandBuffer commandBuffer,
            @unsigned int firstAttachment,
            @unsigned int attachmentCount,
            @pointer(target=IntPtr.class) @unsigned IntPtr pColorBlendEnables
    ) {
        try {
            HANDLE$vkCmdSetColorBlendEnableEXT.invoke(
                    commandBuffer.handle(),
                    firstAttachment,
                    attachmentCount,
                    pColorBlendEnables != null ? pColorBlendEnables.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdSetColorBlendEquationEXT(
            VkCommandBuffer commandBuffer,
            @unsigned int firstAttachment,
            @unsigned int attachmentCount,
            @pointer(target=VkColorBlendEquationEXT.class) VkColorBlendEquationEXT pColorBlendEquations
    ) {
        try {
            HANDLE$vkCmdSetColorBlendEquationEXT.invoke(
                    commandBuffer.handle(),
                    firstAttachment,
                    attachmentCount,
                    pColorBlendEquations != null ? pColorBlendEquations.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdSetColorWriteMaskEXT(
            VkCommandBuffer commandBuffer,
            @unsigned int firstAttachment,
            @unsigned int attachmentCount,
            @pointer(comment="enum VkColorComponentFlags*") MemorySegment pColorWriteMasks
    ) {
        try {
            HANDLE$vkCmdSetColorWriteMaskEXT.invoke(
                    commandBuffer.handle(),
                    firstAttachment,
                    attachmentCount,
                    pColorWriteMasks
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdSetRasterizationStreamEXT(
            VkCommandBuffer commandBuffer,
            @unsigned int rasterizationStream
    ) {
        try {
            HANDLE$vkCmdSetRasterizationStreamEXT.invoke(
                    commandBuffer.handle(),
                    rasterizationStream
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdSetConservativeRasterizationModeEXT(
            VkCommandBuffer commandBuffer,
            @enumtype(VkConservativeRasterizationModeEXT.class) int conservativeRasterizationMode
    ) {
        try {
            HANDLE$vkCmdSetConservativeRasterizationModeEXT.invoke(
                    commandBuffer.handle(),
                    conservativeRasterizationMode
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdSetExtraPrimitiveOverestimationSizeEXT(
            VkCommandBuffer commandBuffer,
            float extraPrimitiveOverestimationSize
    ) {
        try {
            HANDLE$vkCmdSetExtraPrimitiveOverestimationSizeEXT.invoke(
                    commandBuffer.handle(),
                    extraPrimitiveOverestimationSize
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdSetDepthClipEnableEXT(
            VkCommandBuffer commandBuffer,
            @unsigned int depthClipEnable
    ) {
        try {
            HANDLE$vkCmdSetDepthClipEnableEXT.invoke(
                    commandBuffer.handle(),
                    depthClipEnable
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdSetSampleLocationsEnableEXT(
            VkCommandBuffer commandBuffer,
            @unsigned int sampleLocationsEnable
    ) {
        try {
            HANDLE$vkCmdSetSampleLocationsEnableEXT.invoke(
                    commandBuffer.handle(),
                    sampleLocationsEnable
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdSetColorBlendAdvancedEXT(
            VkCommandBuffer commandBuffer,
            @unsigned int firstAttachment,
            @unsigned int attachmentCount,
            @pointer(target=VkColorBlendAdvancedEXT.class) VkColorBlendAdvancedEXT pColorBlendAdvanced
    ) {
        try {
            HANDLE$vkCmdSetColorBlendAdvancedEXT.invoke(
                    commandBuffer.handle(),
                    firstAttachment,
                    attachmentCount,
                    pColorBlendAdvanced != null ? pColorBlendAdvanced.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdSetProvokingVertexModeEXT(
            VkCommandBuffer commandBuffer,
            @enumtype(VkProvokingVertexModeEXT.class) int provokingVertexMode
    ) {
        try {
            HANDLE$vkCmdSetProvokingVertexModeEXT.invoke(
                    commandBuffer.handle(),
                    provokingVertexMode
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdSetLineRasterizationModeEXT(
            VkCommandBuffer commandBuffer,
            @enumtype(VkLineRasterizationModeKHR.class) int lineRasterizationMode
    ) {
        try {
            HANDLE$vkCmdSetLineRasterizationModeEXT.invoke(
                    commandBuffer.handle(),
                    lineRasterizationMode
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdSetLineStippleEnableEXT(
            VkCommandBuffer commandBuffer,
            @unsigned int stippledLineEnable
    ) {
        try {
            HANDLE$vkCmdSetLineStippleEnableEXT.invoke(
                    commandBuffer.handle(),
                    stippledLineEnable
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdSetDepthClipNegativeOneToOneEXT(
            VkCommandBuffer commandBuffer,
            @unsigned int negativeOneToOne
    ) {
        try {
            HANDLE$vkCmdSetDepthClipNegativeOneToOneEXT.invoke(
                    commandBuffer.handle(),
                    negativeOneToOne
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdSetViewportWScalingEnableNV(
            VkCommandBuffer commandBuffer,
            @unsigned int viewportWScalingEnable
    ) {
        try {
            HANDLE$vkCmdSetViewportWScalingEnableNV.invoke(
                    commandBuffer.handle(),
                    viewportWScalingEnable
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdSetViewportSwizzleNV(
            VkCommandBuffer commandBuffer,
            @unsigned int firstViewport,
            @unsigned int viewportCount,
            @pointer(target=VkViewportSwizzleNV.class) VkViewportSwizzleNV pViewportSwizzles
    ) {
        try {
            HANDLE$vkCmdSetViewportSwizzleNV.invoke(
                    commandBuffer.handle(),
                    firstViewport,
                    viewportCount,
                    pViewportSwizzles != null ? pViewportSwizzles.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdSetCoverageToColorEnableNV(
            VkCommandBuffer commandBuffer,
            @unsigned int coverageToColorEnable
    ) {
        try {
            HANDLE$vkCmdSetCoverageToColorEnableNV.invoke(
                    commandBuffer.handle(),
                    coverageToColorEnable
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdSetCoverageToColorLocationNV(
            VkCommandBuffer commandBuffer,
            @unsigned int coverageToColorLocation
    ) {
        try {
            HANDLE$vkCmdSetCoverageToColorLocationNV.invoke(
                    commandBuffer.handle(),
                    coverageToColorLocation
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdSetCoverageModulationModeNV(
            VkCommandBuffer commandBuffer,
            @enumtype(VkCoverageModulationModeNV.class) int coverageModulationMode
    ) {
        try {
            HANDLE$vkCmdSetCoverageModulationModeNV.invoke(
                    commandBuffer.handle(),
                    coverageModulationMode
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdSetCoverageModulationTableEnableNV(
            VkCommandBuffer commandBuffer,
            @unsigned int coverageModulationTableEnable
    ) {
        try {
            HANDLE$vkCmdSetCoverageModulationTableEnableNV.invoke(
                    commandBuffer.handle(),
                    coverageModulationTableEnable
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdSetCoverageModulationTableNV(
            VkCommandBuffer commandBuffer,
            @unsigned int coverageModulationTableCount,
            @pointer(target=FloatPtr.class) FloatPtr pCoverageModulationTable
    ) {
        try {
            HANDLE$vkCmdSetCoverageModulationTableNV.invoke(
                    commandBuffer.handle(),
                    coverageModulationTableCount,
                    pCoverageModulationTable != null ? pCoverageModulationTable.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdSetShadingRateImageEnableNV(
            VkCommandBuffer commandBuffer,
            @unsigned int shadingRateImageEnable
    ) {
        try {
            HANDLE$vkCmdSetShadingRateImageEnableNV.invoke(
                    commandBuffer.handle(),
                    shadingRateImageEnable
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdSetCoverageReductionModeNV(
            VkCommandBuffer commandBuffer,
            @enumtype(VkCoverageReductionModeNV.class) int coverageReductionMode
    ) {
        try {
            HANDLE$vkCmdSetCoverageReductionModeNV.invoke(
                    commandBuffer.handle(),
                    coverageReductionMode
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdSetRepresentativeFragmentTestEnableNV(
            VkCommandBuffer commandBuffer,
            @unsigned int representativeFragmentTestEnable
    ) {
        try {
            HANDLE$vkCmdSetRepresentativeFragmentTestEnableNV.invoke(
                    commandBuffer.handle(),
                    representativeFragmentTestEnable
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkCreatePrivateDataSlot(
            VkDevice device,
            @pointer(target=VkPrivateDataSlotCreateInfo.class) VkPrivateDataSlotCreateInfo pCreateInfo,
            @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator,
            @pointer(target=VkPrivateDataSlot.class) VkPrivateDataSlot pPrivateDataSlot
    ) {
        try {
            return (int) HANDLE$vkCreatePrivateDataSlot.invoke(
                    device.handle(),
                    pCreateInfo != null ? pCreateInfo.segment() : MemorySegment.NULL,
                    pAllocator != null ? pAllocator.segment() : MemorySegment.NULL,
                    pPrivateDataSlot != null ? pPrivateDataSlot.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkDestroyPrivateDataSlot(
            VkDevice device,
            VkPrivateDataSlot privateDataSlot,
            @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator
    ) {
        try {
            HANDLE$vkDestroyPrivateDataSlot.invoke(
                    device.handle(),
                    privateDataSlot.handle(),
                    pAllocator != null ? pAllocator.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkSetPrivateData(
            VkDevice device,
            @enumtype(VkObjectType.class) int objectType,
            @unsigned long objectHandle,
            VkPrivateDataSlot privateDataSlot,
            @unsigned long data
    ) {
        try {
            return (int) HANDLE$vkSetPrivateData.invoke(
                    device.handle(),
                    objectType,
                    objectHandle,
                    privateDataSlot.handle(),
                    data
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkGetPrivateData(
            VkDevice device,
            @enumtype(VkObjectType.class) int objectType,
            @unsigned long objectHandle,
            VkPrivateDataSlot privateDataSlot,
            @pointer(target=LongPtr.class) @unsigned LongPtr pData
    ) {
        try {
            HANDLE$vkGetPrivateData.invoke(
                    device.handle(),
                    objectType,
                    objectHandle,
                    privateDataSlot.handle(),
                    pData != null ? pData.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdCopyBuffer2(
            VkCommandBuffer commandBuffer,
            @pointer(target=VkCopyBufferInfo2.class) VkCopyBufferInfo2 pCopyBufferInfo
    ) {
        try {
            HANDLE$vkCmdCopyBuffer2.invoke(
                    commandBuffer.handle(),
                    pCopyBufferInfo != null ? pCopyBufferInfo.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdCopyImage2(
            VkCommandBuffer commandBuffer,
            @pointer(target=VkCopyImageInfo2.class) VkCopyImageInfo2 pCopyImageInfo
    ) {
        try {
            HANDLE$vkCmdCopyImage2.invoke(
                    commandBuffer.handle(),
                    pCopyImageInfo != null ? pCopyImageInfo.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdBlitImage2(
            VkCommandBuffer commandBuffer,
            @pointer(target=VkBlitImageInfo2.class) VkBlitImageInfo2 pBlitImageInfo
    ) {
        try {
            HANDLE$vkCmdBlitImage2.invoke(
                    commandBuffer.handle(),
                    pBlitImageInfo != null ? pBlitImageInfo.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdCopyBufferToImage2(
            VkCommandBuffer commandBuffer,
            @pointer(target=VkCopyBufferToImageInfo2.class) VkCopyBufferToImageInfo2 pCopyBufferToImageInfo
    ) {
        try {
            HANDLE$vkCmdCopyBufferToImage2.invoke(
                    commandBuffer.handle(),
                    pCopyBufferToImageInfo != null ? pCopyBufferToImageInfo.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdCopyImageToBuffer2(
            VkCommandBuffer commandBuffer,
            @pointer(target=VkCopyImageToBufferInfo2.class) VkCopyImageToBufferInfo2 pCopyImageToBufferInfo
    ) {
        try {
            HANDLE$vkCmdCopyImageToBuffer2.invoke(
                    commandBuffer.handle(),
                    pCopyImageToBufferInfo != null ? pCopyImageToBufferInfo.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdResolveImage2(
            VkCommandBuffer commandBuffer,
            @pointer(target=VkResolveImageInfo2.class) VkResolveImageInfo2 pResolveImageInfo
    ) {
        try {
            HANDLE$vkCmdResolveImage2.invoke(
                    commandBuffer.handle(),
                    pResolveImageInfo != null ? pResolveImageInfo.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdRefreshObjectsKHR(
            VkCommandBuffer commandBuffer,
            @pointer(target=VkRefreshObjectListKHR.class) VkRefreshObjectListKHR pRefreshObjects
    ) {
        try {
            HANDLE$vkCmdRefreshObjectsKHR.invoke(
                    commandBuffer.handle(),
                    pRefreshObjects != null ? pRefreshObjects.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkGetPhysicalDeviceRefreshableObjectTypesKHR(
            VkPhysicalDevice physicalDevice,
            @pointer(target=IntPtr.class) @unsigned IntPtr pRefreshableObjectTypeCount,
            @pointer(comment="enum VkObjectType*") MemorySegment pRefreshableObjectTypes
    ) {
        try {
            return (int) HANDLE$vkGetPhysicalDeviceRefreshableObjectTypesKHR.invoke(
                    physicalDevice.handle(),
                    pRefreshableObjectTypeCount != null ? pRefreshableObjectTypeCount.segment() : MemorySegment.NULL,
                    pRefreshableObjectTypes
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdSetFragmentShadingRateKHR(
            VkCommandBuffer commandBuffer,
            @pointer(target=VkExtent2D.class) VkExtent2D pFragmentSize,
            IntArray combinerOps
    ) {
        try {
            HANDLE$vkCmdSetFragmentShadingRateKHR.invoke(
                    commandBuffer.handle(),
                    pFragmentSize != null ? pFragmentSize.segment() : MemorySegment.NULL,
                    combinerOps.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkGetPhysicalDeviceFragmentShadingRatesKHR(
            VkPhysicalDevice physicalDevice,
            @pointer(target=IntPtr.class) @unsigned IntPtr pFragmentShadingRateCount,
            @pointer(target=VkPhysicalDeviceFragmentShadingRateKHR.class) VkPhysicalDeviceFragmentShadingRateKHR pFragmentShadingRates
    ) {
        try {
            return (int) HANDLE$vkGetPhysicalDeviceFragmentShadingRatesKHR.invoke(
                    physicalDevice.handle(),
                    pFragmentShadingRateCount != null ? pFragmentShadingRateCount.segment() : MemorySegment.NULL,
                    pFragmentShadingRates != null ? pFragmentShadingRates.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdSetFragmentShadingRateEnumNV(
            VkCommandBuffer commandBuffer,
            @enumtype(VkFragmentShadingRateNV.class) int shadingRate,
            IntArray combinerOps
    ) {
        try {
            HANDLE$vkCmdSetFragmentShadingRateEnumNV.invoke(
                    commandBuffer.handle(),
                    shadingRate,
                    combinerOps.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkGetAccelerationStructureBuildSizesKHR(
            VkDevice device,
            @enumtype(VkAccelerationStructureBuildTypeKHR.class) int buildType,
            @pointer(target=VkAccelerationStructureBuildGeometryInfoKHR.class) VkAccelerationStructureBuildGeometryInfoKHR pBuildInfo,
            @pointer(target=IntPtr.class) @unsigned IntPtr pMaxPrimitiveCounts,
            @pointer(target=VkAccelerationStructureBuildSizesInfoKHR.class) VkAccelerationStructureBuildSizesInfoKHR pSizeInfo
    ) {
        try {
            HANDLE$vkGetAccelerationStructureBuildSizesKHR.invoke(
                    device.handle(),
                    buildType,
                    pBuildInfo != null ? pBuildInfo.segment() : MemorySegment.NULL,
                    pMaxPrimitiveCounts != null ? pMaxPrimitiveCounts.segment() : MemorySegment.NULL,
                    pSizeInfo != null ? pSizeInfo.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdSetVertexInputEXT(
            VkCommandBuffer commandBuffer,
            @unsigned int vertexBindingDescriptionCount,
            @pointer(target=VkVertexInputBindingDescription2EXT.class) VkVertexInputBindingDescription2EXT pVertexBindingDescriptions,
            @unsigned int vertexAttributeDescriptionCount,
            @pointer(target=VkVertexInputAttributeDescription2EXT.class) VkVertexInputAttributeDescription2EXT pVertexAttributeDescriptions
    ) {
        try {
            HANDLE$vkCmdSetVertexInputEXT.invoke(
                    commandBuffer.handle(),
                    vertexBindingDescriptionCount,
                    pVertexBindingDescriptions != null ? pVertexBindingDescriptions.segment() : MemorySegment.NULL,
                    vertexAttributeDescriptionCount,
                    pVertexAttributeDescriptions != null ? pVertexAttributeDescriptions.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdSetColorWriteEnableEXT(
            VkCommandBuffer commandBuffer,
            @unsigned int attachmentCount,
            @pointer(target=IntPtr.class) @unsigned IntPtr pColorWriteEnables
    ) {
        try {
            HANDLE$vkCmdSetColorWriteEnableEXT.invoke(
                    commandBuffer.handle(),
                    attachmentCount,
                    pColorWriteEnables != null ? pColorWriteEnables.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdSetEvent2(
            VkCommandBuffer commandBuffer,
            VkEvent event,
            @pointer(target=VkDependencyInfo.class) VkDependencyInfo pDependencyInfo
    ) {
        try {
            HANDLE$vkCmdSetEvent2.invoke(
                    commandBuffer.handle(),
                    event.handle(),
                    pDependencyInfo != null ? pDependencyInfo.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdResetEvent2(
            VkCommandBuffer commandBuffer,
            VkEvent event,
            @enumtype(VkPipelineStageFlags2.class) int stageMask
    ) {
        try {
            HANDLE$vkCmdResetEvent2.invoke(
                    commandBuffer.handle(),
                    event.handle(),
                    stageMask
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdWaitEvents2(
            VkCommandBuffer commandBuffer,
            @unsigned int eventCount,
            @pointer(target=VkEvent.class) VkEvent pEvents,
            @pointer(target=VkDependencyInfo.class) VkDependencyInfo pDependencyInfos
    ) {
        try {
            HANDLE$vkCmdWaitEvents2.invoke(
                    commandBuffer.handle(),
                    eventCount,
                    pEvents != null ? pEvents.segment() : MemorySegment.NULL,
                    pDependencyInfos != null ? pDependencyInfos.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdPipelineBarrier2(
            VkCommandBuffer commandBuffer,
            @pointer(target=VkDependencyInfo.class) VkDependencyInfo pDependencyInfo
    ) {
        try {
            HANDLE$vkCmdPipelineBarrier2.invoke(
                    commandBuffer.handle(),
                    pDependencyInfo != null ? pDependencyInfo.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkQueueSubmit2(
            VkQueue queue,
            @unsigned int submitCount,
            @pointer(target=VkSubmitInfo2.class) VkSubmitInfo2 pSubmits,
            VkFence fence
    ) {
        try {
            return (int) HANDLE$vkQueueSubmit2.invoke(
                    queue.handle(),
                    submitCount,
                    pSubmits != null ? pSubmits.segment() : MemorySegment.NULL,
                    fence.handle()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdWriteTimestamp2(
            VkCommandBuffer commandBuffer,
            @enumtype(VkPipelineStageFlags2.class) int stage,
            VkQueryPool queryPool,
            @unsigned int query
    ) {
        try {
            HANDLE$vkCmdWriteTimestamp2.invoke(
                    commandBuffer.handle(),
                    stage,
                    queryPool.handle(),
                    query
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdWriteBufferMarker2AMD(
            VkCommandBuffer commandBuffer,
            @enumtype(VkPipelineStageFlags2.class) int stage,
            VkBuffer dstBuffer,
            @unsigned long dstOffset,
            @unsigned int marker
    ) {
        try {
            HANDLE$vkCmdWriteBufferMarker2AMD.invoke(
                    commandBuffer.handle(),
                    stage,
                    dstBuffer.handle(),
                    dstOffset,
                    marker
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkGetQueueCheckpointData2NV(
            VkQueue queue,
            @pointer(target=IntPtr.class) @unsigned IntPtr pCheckpointDataCount,
            @pointer(target=VkCheckpointData2NV.class) VkCheckpointData2NV pCheckpointData
    ) {
        try {
            HANDLE$vkGetQueueCheckpointData2NV.invoke(
                    queue.handle(),
                    pCheckpointDataCount != null ? pCheckpointDataCount.segment() : MemorySegment.NULL,
                    pCheckpointData != null ? pCheckpointData.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkCopyMemoryToImageEXT(
            VkDevice device,
            @pointer(target=VkCopyMemoryToImageInfoEXT.class) VkCopyMemoryToImageInfoEXT pCopyMemoryToImageInfo
    ) {
        try {
            return (int) HANDLE$vkCopyMemoryToImageEXT.invoke(
                    device.handle(),
                    pCopyMemoryToImageInfo != null ? pCopyMemoryToImageInfo.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkCopyImageToMemoryEXT(
            VkDevice device,
            @pointer(target=VkCopyImageToMemoryInfoEXT.class) VkCopyImageToMemoryInfoEXT pCopyImageToMemoryInfo
    ) {
        try {
            return (int) HANDLE$vkCopyImageToMemoryEXT.invoke(
                    device.handle(),
                    pCopyImageToMemoryInfo != null ? pCopyImageToMemoryInfo.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkCopyImageToImageEXT(
            VkDevice device,
            @pointer(target=VkCopyImageToImageInfoEXT.class) VkCopyImageToImageInfoEXT pCopyImageToImageInfo
    ) {
        try {
            return (int) HANDLE$vkCopyImageToImageEXT.invoke(
                    device.handle(),
                    pCopyImageToImageInfo != null ? pCopyImageToImageInfo.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkTransitionImageLayoutEXT(
            VkDevice device,
            @unsigned int transitionCount,
            @pointer(target=VkHostImageLayoutTransitionInfoEXT.class) VkHostImageLayoutTransitionInfoEXT pTransitions
    ) {
        try {
            return (int) HANDLE$vkTransitionImageLayoutEXT.invoke(
                    device.handle(),
                    transitionCount,
                    pTransitions != null ? pTransitions.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdDecompressMemoryNV(
            VkCommandBuffer commandBuffer,
            @unsigned int decompressRegionCount,
            @pointer(target=VkDecompressMemoryRegionNV.class) VkDecompressMemoryRegionNV pDecompressMemoryRegions
    ) {
        try {
            HANDLE$vkCmdDecompressMemoryNV.invoke(
                    commandBuffer.handle(),
                    decompressRegionCount,
                    pDecompressMemoryRegions != null ? pDecompressMemoryRegions.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdDecompressMemoryIndirectCountNV(
            VkCommandBuffer commandBuffer,
            @unsigned long indirectCommandsAddress,
            @unsigned long indirectCommandsCountAddress,
            @unsigned int stride
    ) {
        try {
            HANDLE$vkCmdDecompressMemoryIndirectCountNV.invoke(
                    commandBuffer.handle(),
                    indirectCommandsAddress,
                    indirectCommandsCountAddress,
                    stride
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkCreateCuModuleNVX(
            VkDevice device,
            @pointer(target=VkCuModuleCreateInfoNVX.class) VkCuModuleCreateInfoNVX pCreateInfo,
            @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator,
            @pointer(target=VkCuModuleNVX.class) VkCuModuleNVX pModule
    ) {
        try {
            return (int) HANDLE$vkCreateCuModuleNVX.invoke(
                    device.handle(),
                    pCreateInfo != null ? pCreateInfo.segment() : MemorySegment.NULL,
                    pAllocator != null ? pAllocator.segment() : MemorySegment.NULL,
                    pModule != null ? pModule.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkCreateCuFunctionNVX(
            VkDevice device,
            @pointer(target=VkCuFunctionCreateInfoNVX.class) VkCuFunctionCreateInfoNVX pCreateInfo,
            @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator,
            @pointer(target=VkCuFunctionNVX.class) VkCuFunctionNVX pFunction
    ) {
        try {
            return (int) HANDLE$vkCreateCuFunctionNVX.invoke(
                    device.handle(),
                    pCreateInfo != null ? pCreateInfo.segment() : MemorySegment.NULL,
                    pAllocator != null ? pAllocator.segment() : MemorySegment.NULL,
                    pFunction != null ? pFunction.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkDestroyCuModuleNVX(
            VkDevice device,
            VkCuModuleNVX module,
            @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator
    ) {
        try {
            HANDLE$vkDestroyCuModuleNVX.invoke(
                    device.handle(),
                    module.handle(),
                    pAllocator != null ? pAllocator.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkDestroyCuFunctionNVX(
            VkDevice device,
            VkCuFunctionNVX function,
            @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator
    ) {
        try {
            HANDLE$vkDestroyCuFunctionNVX.invoke(
                    device.handle(),
                    function.handle(),
                    pAllocator != null ? pAllocator.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdCuLaunchKernelNVX(
            VkCommandBuffer commandBuffer,
            @pointer(target=VkCuLaunchInfoNVX.class) VkCuLaunchInfoNVX pLaunchInfo
    ) {
        try {
            HANDLE$vkCmdCuLaunchKernelNVX.invoke(
                    commandBuffer.handle(),
                    pLaunchInfo != null ? pLaunchInfo.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkGetDescriptorSetLayoutSizeEXT(
            VkDevice device,
            VkDescriptorSetLayout layout,
            @pointer(target=LongPtr.class) @unsigned LongPtr pLayoutSizeInBytes
    ) {
        try {
            HANDLE$vkGetDescriptorSetLayoutSizeEXT.invoke(
                    device.handle(),
                    layout.handle(),
                    pLayoutSizeInBytes != null ? pLayoutSizeInBytes.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkGetDescriptorSetLayoutBindingOffsetEXT(
            VkDevice device,
            VkDescriptorSetLayout layout,
            @unsigned int binding,
            @pointer(target=LongPtr.class) @unsigned LongPtr pOffset
    ) {
        try {
            HANDLE$vkGetDescriptorSetLayoutBindingOffsetEXT.invoke(
                    device.handle(),
                    layout.handle(),
                    binding,
                    pOffset != null ? pOffset.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkGetDescriptorEXT(
            VkDevice device,
            @pointer(target=VkDescriptorGetInfoEXT.class) VkDescriptorGetInfoEXT pDescriptorInfo,
            @unsigned long dataSize,
            @pointer(comment="void*") MemorySegment pDescriptor
    ) {
        try {
            HANDLE$vkGetDescriptorEXT.invoke(
                    device.handle(),
                    pDescriptorInfo != null ? pDescriptorInfo.segment() : MemorySegment.NULL,
                    dataSize,
                    pDescriptor
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdBindDescriptorBuffersEXT(
            VkCommandBuffer commandBuffer,
            @unsigned int bufferCount,
            @pointer(target=VkDescriptorBufferBindingInfoEXT.class) VkDescriptorBufferBindingInfoEXT pBindingInfos
    ) {
        try {
            HANDLE$vkCmdBindDescriptorBuffersEXT.invoke(
                    commandBuffer.handle(),
                    bufferCount,
                    pBindingInfos != null ? pBindingInfos.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdSetDescriptorBufferOffsetsEXT(
            VkCommandBuffer commandBuffer,
            @enumtype(VkPipelineBindPoint.class) int pipelineBindPoint,
            VkPipelineLayout layout,
            @unsigned int firstSet,
            @unsigned int setCount,
            @pointer(target=IntPtr.class) @unsigned IntPtr pBufferIndices,
            @pointer(target=LongPtr.class) @unsigned LongPtr pOffsets
    ) {
        try {
            HANDLE$vkCmdSetDescriptorBufferOffsetsEXT.invoke(
                    commandBuffer.handle(),
                    pipelineBindPoint,
                    layout.handle(),
                    firstSet,
                    setCount,
                    pBufferIndices != null ? pBufferIndices.segment() : MemorySegment.NULL,
                    pOffsets != null ? pOffsets.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdBindDescriptorBufferEmbeddedSamplersEXT(
            VkCommandBuffer commandBuffer,
            @enumtype(VkPipelineBindPoint.class) int pipelineBindPoint,
            VkPipelineLayout layout,
            @unsigned int set
    ) {
        try {
            HANDLE$vkCmdBindDescriptorBufferEmbeddedSamplersEXT.invoke(
                    commandBuffer.handle(),
                    pipelineBindPoint,
                    layout.handle(),
                    set
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkGetBufferOpaqueCaptureDescriptorDataEXT(
            VkDevice device,
            @pointer(target=VkBufferCaptureDescriptorDataInfoEXT.class) VkBufferCaptureDescriptorDataInfoEXT pInfo,
            @pointer(comment="void*") MemorySegment pData
    ) {
        try {
            return (int) HANDLE$vkGetBufferOpaqueCaptureDescriptorDataEXT.invoke(
                    device.handle(),
                    pInfo != null ? pInfo.segment() : MemorySegment.NULL,
                    pData
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkGetImageOpaqueCaptureDescriptorDataEXT(
            VkDevice device,
            @pointer(target=VkImageCaptureDescriptorDataInfoEXT.class) VkImageCaptureDescriptorDataInfoEXT pInfo,
            @pointer(comment="void*") MemorySegment pData
    ) {
        try {
            return (int) HANDLE$vkGetImageOpaqueCaptureDescriptorDataEXT.invoke(
                    device.handle(),
                    pInfo != null ? pInfo.segment() : MemorySegment.NULL,
                    pData
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkGetImageViewOpaqueCaptureDescriptorDataEXT(
            VkDevice device,
            @pointer(target=VkImageViewCaptureDescriptorDataInfoEXT.class) VkImageViewCaptureDescriptorDataInfoEXT pInfo,
            @pointer(comment="void*") MemorySegment pData
    ) {
        try {
            return (int) HANDLE$vkGetImageViewOpaqueCaptureDescriptorDataEXT.invoke(
                    device.handle(),
                    pInfo != null ? pInfo.segment() : MemorySegment.NULL,
                    pData
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkGetSamplerOpaqueCaptureDescriptorDataEXT(
            VkDevice device,
            @pointer(target=VkSamplerCaptureDescriptorDataInfoEXT.class) VkSamplerCaptureDescriptorDataInfoEXT pInfo,
            @pointer(comment="void*") MemorySegment pData
    ) {
        try {
            return (int) HANDLE$vkGetSamplerOpaqueCaptureDescriptorDataEXT.invoke(
                    device.handle(),
                    pInfo != null ? pInfo.segment() : MemorySegment.NULL,
                    pData
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkGetAccelerationStructureOpaqueCaptureDescriptorDataEXT(
            VkDevice device,
            @pointer(target=VkAccelerationStructureCaptureDescriptorDataInfoEXT.class) VkAccelerationStructureCaptureDescriptorDataInfoEXT pInfo,
            @pointer(comment="void*") MemorySegment pData
    ) {
        try {
            return (int) HANDLE$vkGetAccelerationStructureOpaqueCaptureDescriptorDataEXT.invoke(
                    device.handle(),
                    pInfo != null ? pInfo.segment() : MemorySegment.NULL,
                    pData
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkSetDeviceMemoryPriorityEXT(
            VkDevice device,
            VkDeviceMemory memory,
            float priority
    ) {
        try {
            HANDLE$vkSetDeviceMemoryPriorityEXT.invoke(
                    device.handle(),
                    memory.handle(),
                    priority
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkWaitForPresentKHR(
            VkDevice device,
            VkSwapchainKHR swapchain,
            @unsigned long presentId,
            @unsigned long timeout
    ) {
        try {
            return (int) HANDLE$vkWaitForPresentKHR.invoke(
                    device.handle(),
                    swapchain.handle(),
                    presentId,
                    timeout
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkCreateBufferCollectionFUCHSIA(
            VkDevice device,
            @pointer(target=VkBufferCollectionCreateInfoFUCHSIA.class) VkBufferCollectionCreateInfoFUCHSIA pCreateInfo,
            @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator,
            @pointer(target=VkBufferCollectionFUCHSIA.class) VkBufferCollectionFUCHSIA pCollection
    ) {
        try {
            return (int) HANDLE$vkCreateBufferCollectionFUCHSIA.invoke(
                    device.handle(),
                    pCreateInfo != null ? pCreateInfo.segment() : MemorySegment.NULL,
                    pAllocator != null ? pAllocator.segment() : MemorySegment.NULL,
                    pCollection != null ? pCollection.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkSetBufferCollectionBufferConstraintsFUCHSIA(
            VkDevice device,
            VkBufferCollectionFUCHSIA collection,
            @pointer(target=VkBufferConstraintsInfoFUCHSIA.class) VkBufferConstraintsInfoFUCHSIA pBufferConstraintsInfo
    ) {
        try {
            return (int) HANDLE$vkSetBufferCollectionBufferConstraintsFUCHSIA.invoke(
                    device.handle(),
                    collection.handle(),
                    pBufferConstraintsInfo != null ? pBufferConstraintsInfo.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkSetBufferCollectionImageConstraintsFUCHSIA(
            VkDevice device,
            VkBufferCollectionFUCHSIA collection,
            @pointer(target=VkImageConstraintsInfoFUCHSIA.class) VkImageConstraintsInfoFUCHSIA pImageConstraintsInfo
    ) {
        try {
            return (int) HANDLE$vkSetBufferCollectionImageConstraintsFUCHSIA.invoke(
                    device.handle(),
                    collection.handle(),
                    pImageConstraintsInfo != null ? pImageConstraintsInfo.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkDestroyBufferCollectionFUCHSIA(
            VkDevice device,
            VkBufferCollectionFUCHSIA collection,
            @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator
    ) {
        try {
            HANDLE$vkDestroyBufferCollectionFUCHSIA.invoke(
                    device.handle(),
                    collection.handle(),
                    pAllocator != null ? pAllocator.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkGetBufferCollectionPropertiesFUCHSIA(
            VkDevice device,
            VkBufferCollectionFUCHSIA collection,
            @pointer(target=VkBufferCollectionPropertiesFUCHSIA.class) VkBufferCollectionPropertiesFUCHSIA pProperties
    ) {
        try {
            return (int) HANDLE$vkGetBufferCollectionPropertiesFUCHSIA.invoke(
                    device.handle(),
                    collection.handle(),
                    pProperties != null ? pProperties.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkCreateCudaModuleNV(
            VkDevice device,
            @pointer(target=VkCudaModuleCreateInfoNV.class) VkCudaModuleCreateInfoNV pCreateInfo,
            @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator,
            @pointer(target=VkCudaModuleNV.class) VkCudaModuleNV pModule
    ) {
        try {
            return (int) HANDLE$vkCreateCudaModuleNV.invoke(
                    device.handle(),
                    pCreateInfo != null ? pCreateInfo.segment() : MemorySegment.NULL,
                    pAllocator != null ? pAllocator.segment() : MemorySegment.NULL,
                    pModule != null ? pModule.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkGetCudaModuleCacheNV(
            VkDevice device,
            VkCudaModuleNV module,
            @pointer(target=CSizeTPtr.class) CSizeTPtr pCacheSize,
            @pointer(comment="void*") MemorySegment pCacheData
    ) {
        try {
            return (int) HANDLE$vkGetCudaModuleCacheNV.invoke(
                    device.handle(),
                    module.handle(),
                    pCacheSize != null ? pCacheSize.segment() : MemorySegment.NULL,
                    pCacheData
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkCreateCudaFunctionNV(
            VkDevice device,
            @pointer(target=VkCudaFunctionCreateInfoNV.class) VkCudaFunctionCreateInfoNV pCreateInfo,
            @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator,
            @pointer(target=VkCudaFunctionNV.class) VkCudaFunctionNV pFunction
    ) {
        try {
            return (int) HANDLE$vkCreateCudaFunctionNV.invoke(
                    device.handle(),
                    pCreateInfo != null ? pCreateInfo.segment() : MemorySegment.NULL,
                    pAllocator != null ? pAllocator.segment() : MemorySegment.NULL,
                    pFunction != null ? pFunction.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkDestroyCudaModuleNV(
            VkDevice device,
            VkCudaModuleNV module,
            @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator
    ) {
        try {
            HANDLE$vkDestroyCudaModuleNV.invoke(
                    device.handle(),
                    module.handle(),
                    pAllocator != null ? pAllocator.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkDestroyCudaFunctionNV(
            VkDevice device,
            VkCudaFunctionNV function,
            @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator
    ) {
        try {
            HANDLE$vkDestroyCudaFunctionNV.invoke(
                    device.handle(),
                    function.handle(),
                    pAllocator != null ? pAllocator.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdCudaLaunchKernelNV(
            VkCommandBuffer commandBuffer,
            @pointer(target=VkCudaLaunchInfoNV.class) VkCudaLaunchInfoNV pLaunchInfo
    ) {
        try {
            HANDLE$vkCmdCudaLaunchKernelNV.invoke(
                    commandBuffer.handle(),
                    pLaunchInfo != null ? pLaunchInfo.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdBeginRendering(
            VkCommandBuffer commandBuffer,
            @pointer(target=VkRenderingInfo.class) VkRenderingInfo pRenderingInfo
    ) {
        try {
            HANDLE$vkCmdBeginRendering.invoke(
                    commandBuffer.handle(),
                    pRenderingInfo != null ? pRenderingInfo.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdEndRendering(
            VkCommandBuffer commandBuffer
    ) {
        try {
            HANDLE$vkCmdEndRendering.invoke(
                    commandBuffer.handle()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkGetDescriptorSetLayoutHostMappingInfoVALVE(
            VkDevice device,
            @pointer(target=VkDescriptorSetBindingReferenceVALVE.class) VkDescriptorSetBindingReferenceVALVE pBindingReference,
            @pointer(target=VkDescriptorSetLayoutHostMappingInfoVALVE.class) VkDescriptorSetLayoutHostMappingInfoVALVE pHostMapping
    ) {
        try {
            HANDLE$vkGetDescriptorSetLayoutHostMappingInfoVALVE.invoke(
                    device.handle(),
                    pBindingReference != null ? pBindingReference.segment() : MemorySegment.NULL,
                    pHostMapping != null ? pHostMapping.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkGetDescriptorSetHostMappingVALVE(
            VkDevice device,
            VkDescriptorSet descriptorSet,
            @pointer(comment="void **") MemorySegment ppData
    ) {
        try {
            HANDLE$vkGetDescriptorSetHostMappingVALVE.invoke(
                    device.handle(),
                    descriptorSet.handle(),
                    ppData
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkCreateMicromapEXT(
            VkDevice device,
            @pointer(target=VkMicromapCreateInfoEXT.class) VkMicromapCreateInfoEXT pCreateInfo,
            @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator,
            @pointer(target=VkMicromapEXT.class) VkMicromapEXT pMicromap
    ) {
        try {
            return (int) HANDLE$vkCreateMicromapEXT.invoke(
                    device.handle(),
                    pCreateInfo != null ? pCreateInfo.segment() : MemorySegment.NULL,
                    pAllocator != null ? pAllocator.segment() : MemorySegment.NULL,
                    pMicromap != null ? pMicromap.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdBuildMicromapsEXT(
            VkCommandBuffer commandBuffer,
            @unsigned int infoCount,
            @pointer(target=VkMicromapBuildInfoEXT.class) VkMicromapBuildInfoEXT pInfos
    ) {
        try {
            HANDLE$vkCmdBuildMicromapsEXT.invoke(
                    commandBuffer.handle(),
                    infoCount,
                    pInfos != null ? pInfos.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkBuildMicromapsEXT(
            VkDevice device,
            VkDeferredOperationKHR deferredOperation,
            @unsigned int infoCount,
            @pointer(target=VkMicromapBuildInfoEXT.class) VkMicromapBuildInfoEXT pInfos
    ) {
        try {
            return (int) HANDLE$vkBuildMicromapsEXT.invoke(
                    device.handle(),
                    deferredOperation.handle(),
                    infoCount,
                    pInfos != null ? pInfos.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkDestroyMicromapEXT(
            VkDevice device,
            VkMicromapEXT micromap,
            @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator
    ) {
        try {
            HANDLE$vkDestroyMicromapEXT.invoke(
                    device.handle(),
                    micromap.handle(),
                    pAllocator != null ? pAllocator.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdCopyMicromapEXT(
            VkCommandBuffer commandBuffer,
            @pointer(target=VkCopyMicromapInfoEXT.class) VkCopyMicromapInfoEXT pInfo
    ) {
        try {
            HANDLE$vkCmdCopyMicromapEXT.invoke(
                    commandBuffer.handle(),
                    pInfo != null ? pInfo.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkCopyMicromapEXT(
            VkDevice device,
            VkDeferredOperationKHR deferredOperation,
            @pointer(target=VkCopyMicromapInfoEXT.class) VkCopyMicromapInfoEXT pInfo
    ) {
        try {
            return (int) HANDLE$vkCopyMicromapEXT.invoke(
                    device.handle(),
                    deferredOperation.handle(),
                    pInfo != null ? pInfo.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdCopyMicromapToMemoryEXT(
            VkCommandBuffer commandBuffer,
            @pointer(target=VkCopyMicromapToMemoryInfoEXT.class) VkCopyMicromapToMemoryInfoEXT pInfo
    ) {
        try {
            HANDLE$vkCmdCopyMicromapToMemoryEXT.invoke(
                    commandBuffer.handle(),
                    pInfo != null ? pInfo.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkCopyMicromapToMemoryEXT(
            VkDevice device,
            VkDeferredOperationKHR deferredOperation,
            @pointer(target=VkCopyMicromapToMemoryInfoEXT.class) VkCopyMicromapToMemoryInfoEXT pInfo
    ) {
        try {
            return (int) HANDLE$vkCopyMicromapToMemoryEXT.invoke(
                    device.handle(),
                    deferredOperation.handle(),
                    pInfo != null ? pInfo.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdCopyMemoryToMicromapEXT(
            VkCommandBuffer commandBuffer,
            @pointer(target=VkCopyMemoryToMicromapInfoEXT.class) VkCopyMemoryToMicromapInfoEXT pInfo
    ) {
        try {
            HANDLE$vkCmdCopyMemoryToMicromapEXT.invoke(
                    commandBuffer.handle(),
                    pInfo != null ? pInfo.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkCopyMemoryToMicromapEXT(
            VkDevice device,
            VkDeferredOperationKHR deferredOperation,
            @pointer(target=VkCopyMemoryToMicromapInfoEXT.class) VkCopyMemoryToMicromapInfoEXT pInfo
    ) {
        try {
            return (int) HANDLE$vkCopyMemoryToMicromapEXT.invoke(
                    device.handle(),
                    deferredOperation.handle(),
                    pInfo != null ? pInfo.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdWriteMicromapsPropertiesEXT(
            VkCommandBuffer commandBuffer,
            @unsigned int micromapCount,
            @pointer(target=VkMicromapEXT.class) VkMicromapEXT pMicromaps,
            @enumtype(VkQueryType.class) int queryType,
            VkQueryPool queryPool,
            @unsigned int firstQuery
    ) {
        try {
            HANDLE$vkCmdWriteMicromapsPropertiesEXT.invoke(
                    commandBuffer.handle(),
                    micromapCount,
                    pMicromaps != null ? pMicromaps.segment() : MemorySegment.NULL,
                    queryType,
                    queryPool.handle(),
                    firstQuery
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkWriteMicromapsPropertiesEXT(
            VkDevice device,
            @unsigned int micromapCount,
            @pointer(target=VkMicromapEXT.class) VkMicromapEXT pMicromaps,
            @enumtype(VkQueryType.class) int queryType,
            @unsigned long dataSize,
            @pointer(comment="void*") MemorySegment pData,
            @unsigned long stride
    ) {
        try {
            return (int) HANDLE$vkWriteMicromapsPropertiesEXT.invoke(
                    device.handle(),
                    micromapCount,
                    pMicromaps != null ? pMicromaps.segment() : MemorySegment.NULL,
                    queryType,
                    dataSize,
                    pData,
                    stride
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkGetDeviceMicromapCompatibilityEXT(
            VkDevice device,
            @pointer(target=VkMicromapVersionInfoEXT.class) VkMicromapVersionInfoEXT pVersionInfo,
            @pointer(comment="enum VkAccelerationStructureCompatibilityKHR*") MemorySegment pCompatibility
    ) {
        try {
            HANDLE$vkGetDeviceMicromapCompatibilityEXT.invoke(
                    device.handle(),
                    pVersionInfo != null ? pVersionInfo.segment() : MemorySegment.NULL,
                    pCompatibility
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkGetMicromapBuildSizesEXT(
            VkDevice device,
            @enumtype(VkAccelerationStructureBuildTypeKHR.class) int buildType,
            @pointer(target=VkMicromapBuildInfoEXT.class) VkMicromapBuildInfoEXT pBuildInfo,
            @pointer(target=VkMicromapBuildSizesInfoEXT.class) VkMicromapBuildSizesInfoEXT pSizeInfo
    ) {
        try {
            HANDLE$vkGetMicromapBuildSizesEXT.invoke(
                    device.handle(),
                    buildType,
                    pBuildInfo != null ? pBuildInfo.segment() : MemorySegment.NULL,
                    pSizeInfo != null ? pSizeInfo.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkGetShaderModuleIdentifierEXT(
            VkDevice device,
            VkShaderModule shaderModule,
            @pointer(target=VkShaderModuleIdentifierEXT.class) VkShaderModuleIdentifierEXT pIdentifier
    ) {
        try {
            HANDLE$vkGetShaderModuleIdentifierEXT.invoke(
                    device.handle(),
                    shaderModule.handle(),
                    pIdentifier != null ? pIdentifier.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkGetShaderModuleCreateInfoIdentifierEXT(
            VkDevice device,
            @pointer(target=VkShaderModuleCreateInfo.class) VkShaderModuleCreateInfo pCreateInfo,
            @pointer(target=VkShaderModuleIdentifierEXT.class) VkShaderModuleIdentifierEXT pIdentifier
    ) {
        try {
            HANDLE$vkGetShaderModuleCreateInfoIdentifierEXT.invoke(
                    device.handle(),
                    pCreateInfo != null ? pCreateInfo.segment() : MemorySegment.NULL,
                    pIdentifier != null ? pIdentifier.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkGetImageSubresourceLayout2KHR(
            VkDevice device,
            VkImage image,
            @pointer(target=VkImageSubresource2KHR.class) VkImageSubresource2KHR pSubresource,
            @pointer(target=VkSubresourceLayout2KHR.class) VkSubresourceLayout2KHR pLayout
    ) {
        try {
            HANDLE$vkGetImageSubresourceLayout2KHR.invoke(
                    device.handle(),
                    image.handle(),
                    pSubresource != null ? pSubresource.segment() : MemorySegment.NULL,
                    pLayout != null ? pLayout.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkGetPipelinePropertiesEXT(
            VkDevice device,
            @pointer(target=VkPipelineInfoKHR.class) VkPipelineInfoKHR pPipelineInfo,
            @pointer(target=VkBaseOutStructure.class) VkBaseOutStructure pPipelineProperties
    ) {
        try {
            return (int) HANDLE$vkGetPipelinePropertiesEXT.invoke(
                    device.handle(),
                    pPipelineInfo != null ? pPipelineInfo.segment() : MemorySegment.NULL,
                    pPipelineProperties != null ? pPipelineProperties.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkExportMetalObjectsEXT(
            VkDevice device,
            @pointer(target=VkExportMetalObjectsInfoEXT.class) VkExportMetalObjectsInfoEXT pMetalObjectsInfo
    ) {
        try {
            HANDLE$vkExportMetalObjectsEXT.invoke(
                    device.handle(),
                    pMetalObjectsInfo != null ? pMetalObjectsInfo.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkGetFramebufferTilePropertiesQCOM(
            VkDevice device,
            VkFramebuffer framebuffer,
            @pointer(target=IntPtr.class) @unsigned IntPtr pPropertiesCount,
            @pointer(target=VkTilePropertiesQCOM.class) VkTilePropertiesQCOM pProperties
    ) {
        try {
            return (int) HANDLE$vkGetFramebufferTilePropertiesQCOM.invoke(
                    device.handle(),
                    framebuffer.handle(),
                    pPropertiesCount != null ? pPropertiesCount.segment() : MemorySegment.NULL,
                    pProperties != null ? pProperties.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkGetDynamicRenderingTilePropertiesQCOM(
            VkDevice device,
            @pointer(target=VkRenderingInfo.class) VkRenderingInfo pRenderingInfo,
            @pointer(target=VkTilePropertiesQCOM.class) VkTilePropertiesQCOM pProperties
    ) {
        try {
            return (int) HANDLE$vkGetDynamicRenderingTilePropertiesQCOM.invoke(
                    device.handle(),
                    pRenderingInfo != null ? pRenderingInfo.segment() : MemorySegment.NULL,
                    pProperties != null ? pProperties.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkGetPhysicalDeviceOpticalFlowImageFormatsNV(
            VkPhysicalDevice physicalDevice,
            @pointer(target=VkOpticalFlowImageFormatInfoNV.class) VkOpticalFlowImageFormatInfoNV pOpticalFlowImageFormatInfo,
            @pointer(target=IntPtr.class) @unsigned IntPtr pFormatCount,
            @pointer(target=VkOpticalFlowImageFormatPropertiesNV.class) VkOpticalFlowImageFormatPropertiesNV pImageFormatProperties
    ) {
        try {
            return (int) HANDLE$vkGetPhysicalDeviceOpticalFlowImageFormatsNV.invoke(
                    physicalDevice.handle(),
                    pOpticalFlowImageFormatInfo != null ? pOpticalFlowImageFormatInfo.segment() : MemorySegment.NULL,
                    pFormatCount != null ? pFormatCount.segment() : MemorySegment.NULL,
                    pImageFormatProperties != null ? pImageFormatProperties.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkCreateOpticalFlowSessionNV(
            VkDevice device,
            @pointer(target=VkOpticalFlowSessionCreateInfoNV.class) VkOpticalFlowSessionCreateInfoNV pCreateInfo,
            @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator,
            @pointer(target=VkOpticalFlowSessionNV.class) VkOpticalFlowSessionNV pSession
    ) {
        try {
            return (int) HANDLE$vkCreateOpticalFlowSessionNV.invoke(
                    device.handle(),
                    pCreateInfo != null ? pCreateInfo.segment() : MemorySegment.NULL,
                    pAllocator != null ? pAllocator.segment() : MemorySegment.NULL,
                    pSession != null ? pSession.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkDestroyOpticalFlowSessionNV(
            VkDevice device,
            VkOpticalFlowSessionNV session,
            @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator
    ) {
        try {
            HANDLE$vkDestroyOpticalFlowSessionNV.invoke(
                    device.handle(),
                    session.handle(),
                    pAllocator != null ? pAllocator.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkBindOpticalFlowSessionImageNV(
            VkDevice device,
            VkOpticalFlowSessionNV session,
            @enumtype(VkOpticalFlowSessionBindingPointNV.class) int bindingPoint,
            VkImageView view,
            @enumtype(VkImageLayout.class) int layout
    ) {
        try {
            return (int) HANDLE$vkBindOpticalFlowSessionImageNV.invoke(
                    device.handle(),
                    session.handle(),
                    bindingPoint,
                    view.handle(),
                    layout
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdOpticalFlowExecuteNV(
            VkCommandBuffer commandBuffer,
            VkOpticalFlowSessionNV session,
            @pointer(target=VkOpticalFlowExecuteInfoNV.class) VkOpticalFlowExecuteInfoNV pExecuteInfo
    ) {
        try {
            HANDLE$vkCmdOpticalFlowExecuteNV.invoke(
                    commandBuffer.handle(),
                    session.handle(),
                    pExecuteInfo != null ? pExecuteInfo.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkGetDeviceFaultInfoEXT(
            VkDevice device,
            @pointer(target=VkDeviceFaultCountsEXT.class) VkDeviceFaultCountsEXT pFaultCounts,
            @pointer(target=VkDeviceFaultInfoEXT.class) VkDeviceFaultInfoEXT pFaultInfo
    ) {
        try {
            return (int) HANDLE$vkGetDeviceFaultInfoEXT.invoke(
                    device.handle(),
                    pFaultCounts != null ? pFaultCounts.segment() : MemorySegment.NULL,
                    pFaultInfo != null ? pFaultInfo.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdSetDepthBias2EXT(
            VkCommandBuffer commandBuffer,
            @pointer(target=VkDepthBiasInfoEXT.class) VkDepthBiasInfoEXT pDepthBiasInfo
    ) {
        try {
            HANDLE$vkCmdSetDepthBias2EXT.invoke(
                    commandBuffer.handle(),
                    pDepthBiasInfo != null ? pDepthBiasInfo.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkReleaseSwapchainImagesEXT(
            VkDevice device,
            @pointer(target=VkReleaseSwapchainImagesInfoEXT.class) VkReleaseSwapchainImagesInfoEXT pReleaseInfo
    ) {
        try {
            return (int) HANDLE$vkReleaseSwapchainImagesEXT.invoke(
                    device.handle(),
                    pReleaseInfo != null ? pReleaseInfo.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkGetDeviceImageSubresourceLayoutKHR(
            VkDevice device,
            @pointer(target=VkDeviceImageSubresourceInfoKHR.class) VkDeviceImageSubresourceInfoKHR pInfo,
            @pointer(target=VkSubresourceLayout2KHR.class) VkSubresourceLayout2KHR pLayout
    ) {
        try {
            HANDLE$vkGetDeviceImageSubresourceLayoutKHR.invoke(
                    device.handle(),
                    pInfo != null ? pInfo.segment() : MemorySegment.NULL,
                    pLayout != null ? pLayout.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkMapMemory2KHR(
            VkDevice device,
            @pointer(target=VkMemoryMapInfoKHR.class) VkMemoryMapInfoKHR pMemoryMapInfo,
            @pointer(comment="void **") MemorySegment ppData
    ) {
        try {
            return (int) HANDLE$vkMapMemory2KHR.invoke(
                    device.handle(),
                    pMemoryMapInfo != null ? pMemoryMapInfo.segment() : MemorySegment.NULL,
                    ppData
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkUnmapMemory2KHR(
            VkDevice device,
            @pointer(target=VkMemoryUnmapInfoKHR.class) VkMemoryUnmapInfoKHR pMemoryUnmapInfo
    ) {
        try {
            return (int) HANDLE$vkUnmapMemory2KHR.invoke(
                    device.handle(),
                    pMemoryUnmapInfo != null ? pMemoryUnmapInfo.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkCreateShadersEXT(
            VkDevice device,
            @unsigned int createInfoCount,
            @pointer(target=VkShaderCreateInfoEXT.class) VkShaderCreateInfoEXT pCreateInfos,
            @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator,
            @pointer(target=VkShaderEXT.class) VkShaderEXT pShaders
    ) {
        try {
            return (int) HANDLE$vkCreateShadersEXT.invoke(
                    device.handle(),
                    createInfoCount,
                    pCreateInfos != null ? pCreateInfos.segment() : MemorySegment.NULL,
                    pAllocator != null ? pAllocator.segment() : MemorySegment.NULL,
                    pShaders != null ? pShaders.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkDestroyShaderEXT(
            VkDevice device,
            VkShaderEXT shader,
            @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator
    ) {
        try {
            HANDLE$vkDestroyShaderEXT.invoke(
                    device.handle(),
                    shader.handle(),
                    pAllocator != null ? pAllocator.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkGetShaderBinaryDataEXT(
            VkDevice device,
            VkShaderEXT shader,
            @pointer(target=CSizeTPtr.class) CSizeTPtr pDataSize,
            @pointer(comment="void*") MemorySegment pData
    ) {
        try {
            return (int) HANDLE$vkGetShaderBinaryDataEXT.invoke(
                    device.handle(),
                    shader.handle(),
                    pDataSize != null ? pDataSize.segment() : MemorySegment.NULL,
                    pData
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdBindShadersEXT(
            VkCommandBuffer commandBuffer,
            @unsigned int stageCount,
            @pointer(comment="enum VkShaderStageFlagBits*") MemorySegment pStages,
            @pointer(target=VkShaderEXT.class) VkShaderEXT pShaders
    ) {
        try {
            HANDLE$vkCmdBindShadersEXT.invoke(
                    commandBuffer.handle(),
                    stageCount,
                    pStages,
                    pShaders != null ? pShaders.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkGetScreenBufferPropertiesQNX(
            VkDevice device,
            @pointer(comment="void*") MemorySegment buffer,
            @pointer(target=VkScreenBufferPropertiesQNX.class) VkScreenBufferPropertiesQNX pProperties
    ) {
        try {
            return (int) HANDLE$vkGetScreenBufferPropertiesQNX.invoke(
                    device.handle(),
                    buffer,
                    pProperties != null ? pProperties.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkGetPhysicalDeviceCooperativeMatrixPropertiesKHR(
            VkPhysicalDevice physicalDevice,
            @pointer(target=IntPtr.class) @unsigned IntPtr pPropertyCount,
            @pointer(target=VkCooperativeMatrixPropertiesKHR.class) VkCooperativeMatrixPropertiesKHR pProperties
    ) {
        try {
            return (int) HANDLE$vkGetPhysicalDeviceCooperativeMatrixPropertiesKHR.invoke(
                    physicalDevice.handle(),
                    pPropertyCount != null ? pPropertyCount.segment() : MemorySegment.NULL,
                    pProperties != null ? pProperties.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkGetExecutionGraphPipelineScratchSizeAMDX(
            VkDevice device,
            VkPipeline executionGraph,
            @pointer(target=VkExecutionGraphPipelineScratchSizeAMDX.class) VkExecutionGraphPipelineScratchSizeAMDX pSizeInfo
    ) {
        try {
            return (int) HANDLE$vkGetExecutionGraphPipelineScratchSizeAMDX.invoke(
                    device.handle(),
                    executionGraph.handle(),
                    pSizeInfo != null ? pSizeInfo.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkGetExecutionGraphPipelineNodeIndexAMDX(
            VkDevice device,
            VkPipeline executionGraph,
            @pointer(target=VkPipelineShaderStageNodeCreateInfoAMDX.class) VkPipelineShaderStageNodeCreateInfoAMDX pNodeInfo,
            @pointer(target=IntPtr.class) @unsigned IntPtr pNodeIndex
    ) {
        try {
            return (int) HANDLE$vkGetExecutionGraphPipelineNodeIndexAMDX.invoke(
                    device.handle(),
                    executionGraph.handle(),
                    pNodeInfo != null ? pNodeInfo.segment() : MemorySegment.NULL,
                    pNodeIndex != null ? pNodeIndex.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkCreateExecutionGraphPipelinesAMDX(
            VkDevice device,
            VkPipelineCache pipelineCache,
            @unsigned int createInfoCount,
            @pointer(target=VkExecutionGraphPipelineCreateInfoAMDX.class) VkExecutionGraphPipelineCreateInfoAMDX pCreateInfos,
            @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator,
            @pointer(target=VkPipeline.class) VkPipeline pPipelines
    ) {
        try {
            return (int) HANDLE$vkCreateExecutionGraphPipelinesAMDX.invoke(
                    device.handle(),
                    pipelineCache.handle(),
                    createInfoCount,
                    pCreateInfos != null ? pCreateInfos.segment() : MemorySegment.NULL,
                    pAllocator != null ? pAllocator.segment() : MemorySegment.NULL,
                    pPipelines != null ? pPipelines.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdInitializeGraphScratchMemoryAMDX(
            VkCommandBuffer commandBuffer,
            @unsigned long scratch
    ) {
        try {
            HANDLE$vkCmdInitializeGraphScratchMemoryAMDX.invoke(
                    commandBuffer.handle(),
                    scratch
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdDispatchGraphAMDX(
            VkCommandBuffer commandBuffer,
            @unsigned long scratch,
            @pointer(target=VkDispatchGraphCountInfoAMDX.class) VkDispatchGraphCountInfoAMDX pCountInfo
    ) {
        try {
            HANDLE$vkCmdDispatchGraphAMDX.invoke(
                    commandBuffer.handle(),
                    scratch,
                    pCountInfo != null ? pCountInfo.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdDispatchGraphIndirectAMDX(
            VkCommandBuffer commandBuffer,
            @unsigned long scratch,
            @pointer(target=VkDispatchGraphCountInfoAMDX.class) VkDispatchGraphCountInfoAMDX pCountInfo
    ) {
        try {
            HANDLE$vkCmdDispatchGraphIndirectAMDX.invoke(
                    commandBuffer.handle(),
                    scratch,
                    pCountInfo != null ? pCountInfo.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdDispatchGraphIndirectCountAMDX(
            VkCommandBuffer commandBuffer,
            @unsigned long scratch,
            @unsigned long countInfo
    ) {
        try {
            HANDLE$vkCmdDispatchGraphIndirectCountAMDX.invoke(
                    commandBuffer.handle(),
                    scratch,
                    countInfo
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdBindDescriptorSets2KHR(
            VkCommandBuffer commandBuffer,
            @pointer(target=VkBindDescriptorSetsInfoKHR.class) VkBindDescriptorSetsInfoKHR pBindDescriptorSetsInfo
    ) {
        try {
            HANDLE$vkCmdBindDescriptorSets2KHR.invoke(
                    commandBuffer.handle(),
                    pBindDescriptorSetsInfo != null ? pBindDescriptorSetsInfo.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdPushConstants2KHR(
            VkCommandBuffer commandBuffer,
            @pointer(target=VkPushConstantsInfoKHR.class) VkPushConstantsInfoKHR pPushConstantsInfo
    ) {
        try {
            HANDLE$vkCmdPushConstants2KHR.invoke(
                    commandBuffer.handle(),
                    pPushConstantsInfo != null ? pPushConstantsInfo.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdPushDescriptorSet2KHR(
            VkCommandBuffer commandBuffer,
            @pointer(target=VkPushDescriptorSetInfoKHR.class) VkPushDescriptorSetInfoKHR pPushDescriptorSetInfo
    ) {
        try {
            HANDLE$vkCmdPushDescriptorSet2KHR.invoke(
                    commandBuffer.handle(),
                    pPushDescriptorSetInfo != null ? pPushDescriptorSetInfo.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdPushDescriptorSetWithTemplate2KHR(
            VkCommandBuffer commandBuffer,
            @pointer(target=VkPushDescriptorSetWithTemplateInfoKHR.class) VkPushDescriptorSetWithTemplateInfoKHR pPushDescriptorSetWithTemplateInfo
    ) {
        try {
            HANDLE$vkCmdPushDescriptorSetWithTemplate2KHR.invoke(
                    commandBuffer.handle(),
                    pPushDescriptorSetWithTemplateInfo != null ? pPushDescriptorSetWithTemplateInfo.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdSetDescriptorBufferOffsets2EXT(
            VkCommandBuffer commandBuffer,
            @pointer(target=VkSetDescriptorBufferOffsetsInfoEXT.class) VkSetDescriptorBufferOffsetsInfoEXT pSetDescriptorBufferOffsetsInfo
    ) {
        try {
            HANDLE$vkCmdSetDescriptorBufferOffsets2EXT.invoke(
                    commandBuffer.handle(),
                    pSetDescriptorBufferOffsetsInfo != null ? pSetDescriptorBufferOffsetsInfo.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdBindDescriptorBufferEmbeddedSamplers2EXT(
            VkCommandBuffer commandBuffer,
            @pointer(target=VkBindDescriptorBufferEmbeddedSamplersInfoEXT.class) VkBindDescriptorBufferEmbeddedSamplersInfoEXT pBindDescriptorBufferEmbeddedSamplersInfo
    ) {
        try {
            HANDLE$vkCmdBindDescriptorBufferEmbeddedSamplers2EXT.invoke(
                    commandBuffer.handle(),
                    pBindDescriptorBufferEmbeddedSamplersInfo != null ? pBindDescriptorBufferEmbeddedSamplersInfo.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkSetLatencySleepModeNV(
            VkDevice device,
            VkSwapchainKHR swapchain,
            @pointer(target=VkLatencySleepModeInfoNV.class) VkLatencySleepModeInfoNV pSleepModeInfo
    ) {
        try {
            return (int) HANDLE$vkSetLatencySleepModeNV.invoke(
                    device.handle(),
                    swapchain.handle(),
                    pSleepModeInfo != null ? pSleepModeInfo.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkLatencySleepNV(
            VkDevice device,
            VkSwapchainKHR swapchain,
            @pointer(target=VkLatencySleepInfoNV.class) VkLatencySleepInfoNV pSleepInfo
    ) {
        try {
            return (int) HANDLE$vkLatencySleepNV.invoke(
                    device.handle(),
                    swapchain.handle(),
                    pSleepInfo != null ? pSleepInfo.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkSetLatencyMarkerNV(
            VkDevice device,
            VkSwapchainKHR swapchain,
            @pointer(target=VkSetLatencyMarkerInfoNV.class) VkSetLatencyMarkerInfoNV pLatencyMarkerInfo
    ) {
        try {
            HANDLE$vkSetLatencyMarkerNV.invoke(
                    device.handle(),
                    swapchain.handle(),
                    pLatencyMarkerInfo != null ? pLatencyMarkerInfo.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkGetLatencyTimingsNV(
            VkDevice device,
            VkSwapchainKHR swapchain,
            @pointer(target=VkGetLatencyMarkerInfoNV.class) VkGetLatencyMarkerInfoNV pLatencyMarkerInfo
    ) {
        try {
            HANDLE$vkGetLatencyTimingsNV.invoke(
                    device.handle(),
                    swapchain.handle(),
                    pLatencyMarkerInfo != null ? pLatencyMarkerInfo.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkQueueNotifyOutOfBandNV(
            VkQueue queue,
            @pointer(target=VkOutOfBandQueueTypeInfoNV.class) VkOutOfBandQueueTypeInfoNV pQueueTypeInfo
    ) {
        try {
            HANDLE$vkQueueNotifyOutOfBandNV.invoke(
                    queue.handle(),
                    pQueueTypeInfo != null ? pQueueTypeInfo.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdSetRenderingAttachmentLocationsKHR(
            VkCommandBuffer commandBuffer,
            @pointer(target=VkRenderingAttachmentLocationInfoKHR.class) VkRenderingAttachmentLocationInfoKHR pLocationInfo
    ) {
        try {
            HANDLE$vkCmdSetRenderingAttachmentLocationsKHR.invoke(
                    commandBuffer.handle(),
                    pLocationInfo != null ? pLocationInfo.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdSetRenderingInputAttachmentIndicesKHR(
            VkCommandBuffer commandBuffer,
            @pointer(target=VkRenderingInputAttachmentIndexInfoKHR.class) VkRenderingInputAttachmentIndexInfoKHR pInputAttachmentIndexInfo
    ) {
        try {
            HANDLE$vkCmdSetRenderingInputAttachmentIndicesKHR.invoke(
                    commandBuffer.handle(),
                    pInputAttachmentIndexInfo != null ? pInputAttachmentIndexInfo.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }
}