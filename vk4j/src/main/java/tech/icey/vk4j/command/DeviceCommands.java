package tech.icey.vk4j.command;

import java.lang.foreign.*;
import java.lang.invoke.MethodHandle;

import org.jetbrains.annotations.Nullable;
import tech.icey.panama.RawFunctionLoader;
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

    public final @Nullable MemorySegment SEGMENT$vkDestroyDevice;
    public final @Nullable MemorySegment SEGMENT$vkGetDeviceQueue;
    public final @Nullable MemorySegment SEGMENT$vkQueueSubmit;
    public final @Nullable MemorySegment SEGMENT$vkQueueWaitIdle;
    public final @Nullable MemorySegment SEGMENT$vkDeviceWaitIdle;
    public final @Nullable MemorySegment SEGMENT$vkAllocateMemory;
    public final @Nullable MemorySegment SEGMENT$vkFreeMemory;
    public final @Nullable MemorySegment SEGMENT$vkMapMemory;
    public final @Nullable MemorySegment SEGMENT$vkUnmapMemory;
    public final @Nullable MemorySegment SEGMENT$vkFlushMappedMemoryRanges;
    public final @Nullable MemorySegment SEGMENT$vkInvalidateMappedMemoryRanges;
    public final @Nullable MemorySegment SEGMENT$vkGetDeviceMemoryCommitment;
    public final @Nullable MemorySegment SEGMENT$vkGetBufferMemoryRequirements;
    public final @Nullable MemorySegment SEGMENT$vkBindBufferMemory;
    public final @Nullable MemorySegment SEGMENT$vkGetImageMemoryRequirements;
    public final @Nullable MemorySegment SEGMENT$vkBindImageMemory;
    public final @Nullable MemorySegment SEGMENT$vkGetImageSparseMemoryRequirements;
    public final @Nullable MemorySegment SEGMENT$vkQueueBindSparse;
    public final @Nullable MemorySegment SEGMENT$vkCreateFence;
    public final @Nullable MemorySegment SEGMENT$vkDestroyFence;
    public final @Nullable MemorySegment SEGMENT$vkResetFences;
    public final @Nullable MemorySegment SEGMENT$vkGetFenceStatus;
    public final @Nullable MemorySegment SEGMENT$vkWaitForFences;
    public final @Nullable MemorySegment SEGMENT$vkCreateSemaphore;
    public final @Nullable MemorySegment SEGMENT$vkDestroySemaphore;
    public final @Nullable MemorySegment SEGMENT$vkCreateEvent;
    public final @Nullable MemorySegment SEGMENT$vkDestroyEvent;
    public final @Nullable MemorySegment SEGMENT$vkGetEventStatus;
    public final @Nullable MemorySegment SEGMENT$vkSetEvent;
    public final @Nullable MemorySegment SEGMENT$vkResetEvent;
    public final @Nullable MemorySegment SEGMENT$vkCreateQueryPool;
    public final @Nullable MemorySegment SEGMENT$vkDestroyQueryPool;
    public final @Nullable MemorySegment SEGMENT$vkGetQueryPoolResults;
    public final @Nullable MemorySegment SEGMENT$vkResetQueryPool;
    public final @Nullable MemorySegment SEGMENT$vkCreateBuffer;
    public final @Nullable MemorySegment SEGMENT$vkDestroyBuffer;
    public final @Nullable MemorySegment SEGMENT$vkCreateBufferView;
    public final @Nullable MemorySegment SEGMENT$vkDestroyBufferView;
    public final @Nullable MemorySegment SEGMENT$vkCreateImage;
    public final @Nullable MemorySegment SEGMENT$vkDestroyImage;
    public final @Nullable MemorySegment SEGMENT$vkGetImageSubresourceLayout;
    public final @Nullable MemorySegment SEGMENT$vkCreateImageView;
    public final @Nullable MemorySegment SEGMENT$vkDestroyImageView;
    public final @Nullable MemorySegment SEGMENT$vkCreateShaderModule;
    public final @Nullable MemorySegment SEGMENT$vkDestroyShaderModule;
    public final @Nullable MemorySegment SEGMENT$vkCreatePipelineCache;
    public final @Nullable MemorySegment SEGMENT$vkDestroyPipelineCache;
    public final @Nullable MemorySegment SEGMENT$vkGetPipelineCacheData;
    public final @Nullable MemorySegment SEGMENT$vkMergePipelineCaches;
    public final @Nullable MemorySegment SEGMENT$vkCreatePipelineBinariesKHR;
    public final @Nullable MemorySegment SEGMENT$vkDestroyPipelineBinaryKHR;
    public final @Nullable MemorySegment SEGMENT$vkGetPipelineKeyKHR;
    public final @Nullable MemorySegment SEGMENT$vkGetPipelineBinaryDataKHR;
    public final @Nullable MemorySegment SEGMENT$vkReleaseCapturedPipelineDataKHR;
    public final @Nullable MemorySegment SEGMENT$vkCreateGraphicsPipelines;
    public final @Nullable MemorySegment SEGMENT$vkCreateComputePipelines;
    public final @Nullable MemorySegment SEGMENT$vkGetDeviceSubpassShadingMaxWorkgroupSizeHUAWEI;
    public final @Nullable MemorySegment SEGMENT$vkDestroyPipeline;
    public final @Nullable MemorySegment SEGMENT$vkCreatePipelineLayout;
    public final @Nullable MemorySegment SEGMENT$vkDestroyPipelineLayout;
    public final @Nullable MemorySegment SEGMENT$vkCreateSampler;
    public final @Nullable MemorySegment SEGMENT$vkDestroySampler;
    public final @Nullable MemorySegment SEGMENT$vkCreateDescriptorSetLayout;
    public final @Nullable MemorySegment SEGMENT$vkDestroyDescriptorSetLayout;
    public final @Nullable MemorySegment SEGMENT$vkCreateDescriptorPool;
    public final @Nullable MemorySegment SEGMENT$vkDestroyDescriptorPool;
    public final @Nullable MemorySegment SEGMENT$vkResetDescriptorPool;
    public final @Nullable MemorySegment SEGMENT$vkAllocateDescriptorSets;
    public final @Nullable MemorySegment SEGMENT$vkFreeDescriptorSets;
    public final @Nullable MemorySegment SEGMENT$vkUpdateDescriptorSets;
    public final @Nullable MemorySegment SEGMENT$vkCreateFramebuffer;
    public final @Nullable MemorySegment SEGMENT$vkDestroyFramebuffer;
    public final @Nullable MemorySegment SEGMENT$vkCreateRenderPass;
    public final @Nullable MemorySegment SEGMENT$vkDestroyRenderPass;
    public final @Nullable MemorySegment SEGMENT$vkGetRenderAreaGranularity;
    public final @Nullable MemorySegment SEGMENT$vkGetRenderingAreaGranularityKHR;
    public final @Nullable MemorySegment SEGMENT$vkCreateCommandPool;
    public final @Nullable MemorySegment SEGMENT$vkDestroyCommandPool;
    public final @Nullable MemorySegment SEGMENT$vkResetCommandPool;
    public final @Nullable MemorySegment SEGMENT$vkAllocateCommandBuffers;
    public final @Nullable MemorySegment SEGMENT$vkFreeCommandBuffers;
    public final @Nullable MemorySegment SEGMENT$vkBeginCommandBuffer;
    public final @Nullable MemorySegment SEGMENT$vkEndCommandBuffer;
    public final @Nullable MemorySegment SEGMENT$vkResetCommandBuffer;
    public final @Nullable MemorySegment SEGMENT$vkCmdBindPipeline;
    public final @Nullable MemorySegment SEGMENT$vkCmdSetAttachmentFeedbackLoopEnableEXT;
    public final @Nullable MemorySegment SEGMENT$vkCmdSetViewport;
    public final @Nullable MemorySegment SEGMENT$vkCmdSetScissor;
    public final @Nullable MemorySegment SEGMENT$vkCmdSetLineWidth;
    public final @Nullable MemorySegment SEGMENT$vkCmdSetDepthBias;
    public final @Nullable MemorySegment SEGMENT$vkCmdSetBlendConstants;
    public final @Nullable MemorySegment SEGMENT$vkCmdSetDepthBounds;
    public final @Nullable MemorySegment SEGMENT$vkCmdSetStencilCompareMask;
    public final @Nullable MemorySegment SEGMENT$vkCmdSetStencilWriteMask;
    public final @Nullable MemorySegment SEGMENT$vkCmdSetStencilReference;
    public final @Nullable MemorySegment SEGMENT$vkCmdBindDescriptorSets;
    public final @Nullable MemorySegment SEGMENT$vkCmdBindIndexBuffer;
    public final @Nullable MemorySegment SEGMENT$vkCmdBindVertexBuffers;
    public final @Nullable MemorySegment SEGMENT$vkCmdDraw;
    public final @Nullable MemorySegment SEGMENT$vkCmdDrawIndexed;
    public final @Nullable MemorySegment SEGMENT$vkCmdDrawMultiEXT;
    public final @Nullable MemorySegment SEGMENT$vkCmdDrawMultiIndexedEXT;
    public final @Nullable MemorySegment SEGMENT$vkCmdDrawIndirect;
    public final @Nullable MemorySegment SEGMENT$vkCmdDrawIndexedIndirect;
    public final @Nullable MemorySegment SEGMENT$vkCmdDispatch;
    public final @Nullable MemorySegment SEGMENT$vkCmdDispatchIndirect;
    public final @Nullable MemorySegment SEGMENT$vkCmdSubpassShadingHUAWEI;
    public final @Nullable MemorySegment SEGMENT$vkCmdDrawClusterHUAWEI;
    public final @Nullable MemorySegment SEGMENT$vkCmdDrawClusterIndirectHUAWEI;
    public final @Nullable MemorySegment SEGMENT$vkCmdUpdatePipelineIndirectBufferNV;
    public final @Nullable MemorySegment SEGMENT$vkCmdCopyBuffer;
    public final @Nullable MemorySegment SEGMENT$vkCmdCopyImage;
    public final @Nullable MemorySegment SEGMENT$vkCmdBlitImage;
    public final @Nullable MemorySegment SEGMENT$vkCmdCopyBufferToImage;
    public final @Nullable MemorySegment SEGMENT$vkCmdCopyImageToBuffer;
    public final @Nullable MemorySegment SEGMENT$vkCmdCopyMemoryIndirectNV;
    public final @Nullable MemorySegment SEGMENT$vkCmdCopyMemoryToImageIndirectNV;
    public final @Nullable MemorySegment SEGMENT$vkCmdUpdateBuffer;
    public final @Nullable MemorySegment SEGMENT$vkCmdFillBuffer;
    public final @Nullable MemorySegment SEGMENT$vkCmdClearColorImage;
    public final @Nullable MemorySegment SEGMENT$vkCmdClearDepthStencilImage;
    public final @Nullable MemorySegment SEGMENT$vkCmdClearAttachments;
    public final @Nullable MemorySegment SEGMENT$vkCmdResolveImage;
    public final @Nullable MemorySegment SEGMENT$vkCmdSetEvent;
    public final @Nullable MemorySegment SEGMENT$vkCmdResetEvent;
    public final @Nullable MemorySegment SEGMENT$vkCmdWaitEvents;
    public final @Nullable MemorySegment SEGMENT$vkCmdPipelineBarrier;
    public final @Nullable MemorySegment SEGMENT$vkCmdBeginQuery;
    public final @Nullable MemorySegment SEGMENT$vkCmdEndQuery;
    public final @Nullable MemorySegment SEGMENT$vkCmdBeginConditionalRenderingEXT;
    public final @Nullable MemorySegment SEGMENT$vkCmdEndConditionalRenderingEXT;
    public final @Nullable MemorySegment SEGMENT$vkCmdResetQueryPool;
    public final @Nullable MemorySegment SEGMENT$vkCmdWriteTimestamp;
    public final @Nullable MemorySegment SEGMENT$vkCmdCopyQueryPoolResults;
    public final @Nullable MemorySegment SEGMENT$vkCmdPushConstants;
    public final @Nullable MemorySegment SEGMENT$vkCmdBeginRenderPass;
    public final @Nullable MemorySegment SEGMENT$vkCmdNextSubpass;
    public final @Nullable MemorySegment SEGMENT$vkCmdEndRenderPass;
    public final @Nullable MemorySegment SEGMENT$vkCmdExecuteCommands;
    public final @Nullable MemorySegment SEGMENT$vkCreateSharedSwapchainsKHR;
    public final @Nullable MemorySegment SEGMENT$vkCreateSwapchainKHR;
    public final @Nullable MemorySegment SEGMENT$vkDestroySwapchainKHR;
    public final @Nullable MemorySegment SEGMENT$vkGetSwapchainImagesKHR;
    public final @Nullable MemorySegment SEGMENT$vkAcquireNextImageKHR;
    public final @Nullable MemorySegment SEGMENT$vkQueuePresentKHR;
    public final @Nullable MemorySegment SEGMENT$vkDebugMarkerSetObjectNameEXT;
    public final @Nullable MemorySegment SEGMENT$vkDebugMarkerSetObjectTagEXT;
    public final @Nullable MemorySegment SEGMENT$vkCmdDebugMarkerBeginEXT;
    public final @Nullable MemorySegment SEGMENT$vkCmdDebugMarkerEndEXT;
    public final @Nullable MemorySegment SEGMENT$vkCmdDebugMarkerInsertEXT;
    public final @Nullable MemorySegment SEGMENT$vkGetMemoryWin32HandleNV;
    public final @Nullable MemorySegment SEGMENT$vkCmdExecuteGeneratedCommandsNV;
    public final @Nullable MemorySegment SEGMENT$vkCmdPreprocessGeneratedCommandsNV;
    public final @Nullable MemorySegment SEGMENT$vkCmdBindPipelineShaderGroupNV;
    public final @Nullable MemorySegment SEGMENT$vkGetGeneratedCommandsMemoryRequirementsNV;
    public final @Nullable MemorySegment SEGMENT$vkCreateIndirectCommandsLayoutNV;
    public final @Nullable MemorySegment SEGMENT$vkDestroyIndirectCommandsLayoutNV;
    public final @Nullable MemorySegment SEGMENT$vkCmdPushDescriptorSetKHR;
    public final @Nullable MemorySegment SEGMENT$vkTrimCommandPool;
    public final @Nullable MemorySegment SEGMENT$vkGetMemoryWin32HandleKHR;
    public final @Nullable MemorySegment SEGMENT$vkGetMemoryWin32HandlePropertiesKHR;
    public final @Nullable MemorySegment SEGMENT$vkGetMemoryFdKHR;
    public final @Nullable MemorySegment SEGMENT$vkGetMemoryFdPropertiesKHR;
    public final @Nullable MemorySegment SEGMENT$vkGetMemoryZirconHandleFUCHSIA;
    public final @Nullable MemorySegment SEGMENT$vkGetMemoryZirconHandlePropertiesFUCHSIA;
    public final @Nullable MemorySegment SEGMENT$vkGetMemoryRemoteAddressNV;
    public final @Nullable MemorySegment SEGMENT$vkGetMemorySciBufNV;
    public final @Nullable MemorySegment SEGMENT$vkGetPhysicalDeviceExternalMemorySciBufPropertiesNV;
    public final @Nullable MemorySegment SEGMENT$vkGetPhysicalDeviceSciBufAttributesNV;
    public final @Nullable MemorySegment SEGMENT$vkGetSemaphoreWin32HandleKHR;
    public final @Nullable MemorySegment SEGMENT$vkImportSemaphoreWin32HandleKHR;
    public final @Nullable MemorySegment SEGMENT$vkGetSemaphoreFdKHR;
    public final @Nullable MemorySegment SEGMENT$vkImportSemaphoreFdKHR;
    public final @Nullable MemorySegment SEGMENT$vkGetSemaphoreZirconHandleFUCHSIA;
    public final @Nullable MemorySegment SEGMENT$vkImportSemaphoreZirconHandleFUCHSIA;
    public final @Nullable MemorySegment SEGMENT$vkGetFenceWin32HandleKHR;
    public final @Nullable MemorySegment SEGMENT$vkImportFenceWin32HandleKHR;
    public final @Nullable MemorySegment SEGMENT$vkGetFenceFdKHR;
    public final @Nullable MemorySegment SEGMENT$vkImportFenceFdKHR;
    public final @Nullable MemorySegment SEGMENT$vkGetFenceSciSyncFenceNV;
    public final @Nullable MemorySegment SEGMENT$vkGetFenceSciSyncObjNV;
    public final @Nullable MemorySegment SEGMENT$vkImportFenceSciSyncFenceNV;
    public final @Nullable MemorySegment SEGMENT$vkImportFenceSciSyncObjNV;
    public final @Nullable MemorySegment SEGMENT$vkGetSemaphoreSciSyncObjNV;
    public final @Nullable MemorySegment SEGMENT$vkImportSemaphoreSciSyncObjNV;
    public final @Nullable MemorySegment SEGMENT$vkGetPhysicalDeviceSciSyncAttributesNV;
    public final @Nullable MemorySegment SEGMENT$vkCreateSemaphoreSciSyncPoolNV;
    public final @Nullable MemorySegment SEGMENT$vkDestroySemaphoreSciSyncPoolNV;
    public final @Nullable MemorySegment SEGMENT$vkAcquireWinrtDisplayNV;
    public final @Nullable MemorySegment SEGMENT$vkGetWinrtDisplayNV;
    public final @Nullable MemorySegment SEGMENT$vkDisplayPowerControlEXT;
    public final @Nullable MemorySegment SEGMENT$vkRegisterDeviceEventEXT;
    public final @Nullable MemorySegment SEGMENT$vkRegisterDisplayEventEXT;
    public final @Nullable MemorySegment SEGMENT$vkGetSwapchainCounterEXT;
    public final @Nullable MemorySegment SEGMENT$vkGetDeviceGroupPeerMemoryFeatures;
    public final @Nullable MemorySegment SEGMENT$vkBindBufferMemory2;
    public final @Nullable MemorySegment SEGMENT$vkBindImageMemory2;
    public final @Nullable MemorySegment SEGMENT$vkCmdSetDeviceMask;
    public final @Nullable MemorySegment SEGMENT$vkGetDeviceGroupPresentCapabilitiesKHR;
    public final @Nullable MemorySegment SEGMENT$vkGetDeviceGroupSurfacePresentModesKHR;
    public final @Nullable MemorySegment SEGMENT$vkAcquireNextImage2KHR;
    public final @Nullable MemorySegment SEGMENT$vkCmdDispatchBase;
    public final @Nullable MemorySegment SEGMENT$vkGetPhysicalDevicePresentRectanglesKHR;
    public final @Nullable MemorySegment SEGMENT$vkCreateDescriptorUpdateTemplate;
    public final @Nullable MemorySegment SEGMENT$vkDestroyDescriptorUpdateTemplate;
    public final @Nullable MemorySegment SEGMENT$vkUpdateDescriptorSetWithTemplate;
    public final @Nullable MemorySegment SEGMENT$vkCmdPushDescriptorSetWithTemplateKHR;
    public final @Nullable MemorySegment SEGMENT$vkSetHdrMetadataEXT;
    public final @Nullable MemorySegment SEGMENT$vkGetSwapchainStatusKHR;
    public final @Nullable MemorySegment SEGMENT$vkGetRefreshCycleDurationGOOGLE;
    public final @Nullable MemorySegment SEGMENT$vkGetPastPresentationTimingGOOGLE;
    public final @Nullable MemorySegment SEGMENT$vkCmdSetViewportWScalingNV;
    public final @Nullable MemorySegment SEGMENT$vkCmdSetDiscardRectangleEXT;
    public final @Nullable MemorySegment SEGMENT$vkCmdSetDiscardRectangleEnableEXT;
    public final @Nullable MemorySegment SEGMENT$vkCmdSetDiscardRectangleModeEXT;
    public final @Nullable MemorySegment SEGMENT$vkCmdSetSampleLocationsEXT;
    public final @Nullable MemorySegment SEGMENT$vkGetPhysicalDeviceMultisamplePropertiesEXT;
    public final @Nullable MemorySegment SEGMENT$vkGetBufferMemoryRequirements2;
    public final @Nullable MemorySegment SEGMENT$vkGetImageMemoryRequirements2;
    public final @Nullable MemorySegment SEGMENT$vkGetImageSparseMemoryRequirements2;
    public final @Nullable MemorySegment SEGMENT$vkGetDeviceBufferMemoryRequirements;
    public final @Nullable MemorySegment SEGMENT$vkGetDeviceImageMemoryRequirements;
    public final @Nullable MemorySegment SEGMENT$vkGetDeviceImageSparseMemoryRequirements;
    public final @Nullable MemorySegment SEGMENT$vkCreateSamplerYcbcrConversion;
    public final @Nullable MemorySegment SEGMENT$vkDestroySamplerYcbcrConversion;
    public final @Nullable MemorySegment SEGMENT$vkGetDeviceQueue2;
    public final @Nullable MemorySegment SEGMENT$vkCreateValidationCacheEXT;
    public final @Nullable MemorySegment SEGMENT$vkDestroyValidationCacheEXT;
    public final @Nullable MemorySegment SEGMENT$vkGetValidationCacheDataEXT;
    public final @Nullable MemorySegment SEGMENT$vkMergeValidationCachesEXT;
    public final @Nullable MemorySegment SEGMENT$vkGetDescriptorSetLayoutSupport;
    public final @Nullable MemorySegment SEGMENT$vkGetShaderInfoAMD;
    public final @Nullable MemorySegment SEGMENT$vkSetLocalDimmingAMD;
    public final @Nullable MemorySegment SEGMENT$vkGetPhysicalDeviceCalibrateableTimeDomainsKHR;
    public final @Nullable MemorySegment SEGMENT$vkGetCalibratedTimestampsKHR;
    public final @Nullable MemorySegment SEGMENT$vkGetMemoryHostPointerPropertiesEXT;
    public final @Nullable MemorySegment SEGMENT$vkCmdWriteBufferMarkerAMD;
    public final @Nullable MemorySegment SEGMENT$vkCreateRenderPass2;
    public final @Nullable MemorySegment SEGMENT$vkCmdBeginRenderPass2;
    public final @Nullable MemorySegment SEGMENT$vkCmdNextSubpass2;
    public final @Nullable MemorySegment SEGMENT$vkCmdEndRenderPass2;
    public final @Nullable MemorySegment SEGMENT$vkGetSemaphoreCounterValue;
    public final @Nullable MemorySegment SEGMENT$vkWaitSemaphores;
    public final @Nullable MemorySegment SEGMENT$vkSignalSemaphore;
    public final @Nullable MemorySegment SEGMENT$vkGetAndroidHardwareBufferPropertiesANDROID;
    public final @Nullable MemorySegment SEGMENT$vkGetMemoryAndroidHardwareBufferANDROID;
    public final @Nullable MemorySegment SEGMENT$vkCmdDrawIndirectCount;
    public final @Nullable MemorySegment SEGMENT$vkCmdDrawIndexedIndirectCount;
    public final @Nullable MemorySegment SEGMENT$vkCmdSetCheckpointNV;
    public final @Nullable MemorySegment SEGMENT$vkGetQueueCheckpointDataNV;
    public final @Nullable MemorySegment SEGMENT$vkCmdBindTransformFeedbackBuffersEXT;
    public final @Nullable MemorySegment SEGMENT$vkCmdBeginTransformFeedbackEXT;
    public final @Nullable MemorySegment SEGMENT$vkCmdEndTransformFeedbackEXT;
    public final @Nullable MemorySegment SEGMENT$vkCmdBeginQueryIndexedEXT;
    public final @Nullable MemorySegment SEGMENT$vkCmdEndQueryIndexedEXT;
    public final @Nullable MemorySegment SEGMENT$vkCmdDrawIndirectByteCountEXT;
    public final @Nullable MemorySegment SEGMENT$vkCmdSetExclusiveScissorNV;
    public final @Nullable MemorySegment SEGMENT$vkCmdSetExclusiveScissorEnableNV;
    public final @Nullable MemorySegment SEGMENT$vkCmdBindShadingRateImageNV;
    public final @Nullable MemorySegment SEGMENT$vkCmdSetViewportShadingRatePaletteNV;
    public final @Nullable MemorySegment SEGMENT$vkCmdSetCoarseSampleOrderNV;
    public final @Nullable MemorySegment SEGMENT$vkCmdDrawMeshTasksNV;
    public final @Nullable MemorySegment SEGMENT$vkCmdDrawMeshTasksIndirectNV;
    public final @Nullable MemorySegment SEGMENT$vkCmdDrawMeshTasksIndirectCountNV;
    public final @Nullable MemorySegment SEGMENT$vkCmdDrawMeshTasksEXT;
    public final @Nullable MemorySegment SEGMENT$vkCmdDrawMeshTasksIndirectEXT;
    public final @Nullable MemorySegment SEGMENT$vkCmdDrawMeshTasksIndirectCountEXT;
    public final @Nullable MemorySegment SEGMENT$vkCompileDeferredNV;
    public final @Nullable MemorySegment SEGMENT$vkCreateAccelerationStructureNV;
    public final @Nullable MemorySegment SEGMENT$vkCmdBindInvocationMaskHUAWEI;
    public final @Nullable MemorySegment SEGMENT$vkDestroyAccelerationStructureKHR;
    public final @Nullable MemorySegment SEGMENT$vkDestroyAccelerationStructureNV;
    public final @Nullable MemorySegment SEGMENT$vkGetAccelerationStructureMemoryRequirementsNV;
    public final @Nullable MemorySegment SEGMENT$vkBindAccelerationStructureMemoryNV;
    public final @Nullable MemorySegment SEGMENT$vkCmdCopyAccelerationStructureNV;
    public final @Nullable MemorySegment SEGMENT$vkCmdCopyAccelerationStructureKHR;
    public final @Nullable MemorySegment SEGMENT$vkCopyAccelerationStructureKHR;
    public final @Nullable MemorySegment SEGMENT$vkCmdCopyAccelerationStructureToMemoryKHR;
    public final @Nullable MemorySegment SEGMENT$vkCopyAccelerationStructureToMemoryKHR;
    public final @Nullable MemorySegment SEGMENT$vkCmdCopyMemoryToAccelerationStructureKHR;
    public final @Nullable MemorySegment SEGMENT$vkCopyMemoryToAccelerationStructureKHR;
    public final @Nullable MemorySegment SEGMENT$vkCmdWriteAccelerationStructuresPropertiesKHR;
    public final @Nullable MemorySegment SEGMENT$vkCmdWriteAccelerationStructuresPropertiesNV;
    public final @Nullable MemorySegment SEGMENT$vkCmdBuildAccelerationStructureNV;
    public final @Nullable MemorySegment SEGMENT$vkWriteAccelerationStructuresPropertiesKHR;
    public final @Nullable MemorySegment SEGMENT$vkCmdTraceRaysKHR;
    public final @Nullable MemorySegment SEGMENT$vkCmdTraceRaysNV;
    public final @Nullable MemorySegment SEGMENT$vkGetRayTracingShaderGroupHandlesKHR;
    public final @Nullable MemorySegment SEGMENT$vkGetRayTracingCaptureReplayShaderGroupHandlesKHR;
    public final @Nullable MemorySegment SEGMENT$vkGetAccelerationStructureHandleNV;
    public final @Nullable MemorySegment SEGMENT$vkCreateRayTracingPipelinesNV;
    public final @Nullable MemorySegment SEGMENT$vkCreateRayTracingPipelinesKHR;
    public final @Nullable MemorySegment SEGMENT$vkGetPhysicalDeviceCooperativeMatrixPropertiesNV;
    public final @Nullable MemorySegment SEGMENT$vkCmdTraceRaysIndirectKHR;
    public final @Nullable MemorySegment SEGMENT$vkCmdTraceRaysIndirect2KHR;
    public final @Nullable MemorySegment SEGMENT$vkGetDeviceAccelerationStructureCompatibilityKHR;
    public final @Nullable MemorySegment SEGMENT$vkGetRayTracingShaderGroupStackSizeKHR;
    public final @Nullable MemorySegment SEGMENT$vkCmdSetRayTracingPipelineStackSizeKHR;
    public final @Nullable MemorySegment SEGMENT$vkGetImageViewHandleNVX;
    public final @Nullable MemorySegment SEGMENT$vkGetImageViewAddressNVX;
    public final @Nullable MemorySegment SEGMENT$vkGetPhysicalDeviceSurfacePresentModes2EXT;
    public final @Nullable MemorySegment SEGMENT$vkGetDeviceGroupSurfacePresentModes2EXT;
    public final @Nullable MemorySegment SEGMENT$vkAcquireFullScreenExclusiveModeEXT;
    public final @Nullable MemorySegment SEGMENT$vkReleaseFullScreenExclusiveModeEXT;
    public final @Nullable MemorySegment SEGMENT$vkEnumeratePhysicalDeviceQueueFamilyPerformanceQueryCountersKHR;
    public final @Nullable MemorySegment SEGMENT$vkGetPhysicalDeviceQueueFamilyPerformanceQueryPassesKHR;
    public final @Nullable MemorySegment SEGMENT$vkAcquireProfilingLockKHR;
    public final @Nullable MemorySegment SEGMENT$vkReleaseProfilingLockKHR;
    public final @Nullable MemorySegment SEGMENT$vkGetImageDrmFormatModifierPropertiesEXT;
    public final @Nullable MemorySegment SEGMENT$vkGetBufferOpaqueCaptureAddress;
    public final @Nullable MemorySegment SEGMENT$vkGetBufferDeviceAddress;
    public final @Nullable MemorySegment SEGMENT$vkGetPhysicalDeviceSupportedFramebufferMixedSamplesCombinationsNV;
    public final @Nullable MemorySegment SEGMENT$vkInitializePerformanceApiINTEL;
    public final @Nullable MemorySegment SEGMENT$vkUninitializePerformanceApiINTEL;
    public final @Nullable MemorySegment SEGMENT$vkCmdSetPerformanceMarkerINTEL;
    public final @Nullable MemorySegment SEGMENT$vkCmdSetPerformanceStreamMarkerINTEL;
    public final @Nullable MemorySegment SEGMENT$vkCmdSetPerformanceOverrideINTEL;
    public final @Nullable MemorySegment SEGMENT$vkAcquirePerformanceConfigurationINTEL;
    public final @Nullable MemorySegment SEGMENT$vkReleasePerformanceConfigurationINTEL;
    public final @Nullable MemorySegment SEGMENT$vkQueueSetPerformanceConfigurationINTEL;
    public final @Nullable MemorySegment SEGMENT$vkGetPerformanceParameterINTEL;
    public final @Nullable MemorySegment SEGMENT$vkGetDeviceMemoryOpaqueCaptureAddress;
    public final @Nullable MemorySegment SEGMENT$vkGetPipelineExecutablePropertiesKHR;
    public final @Nullable MemorySegment SEGMENT$vkGetPipelineExecutableStatisticsKHR;
    public final @Nullable MemorySegment SEGMENT$vkGetPipelineExecutableInternalRepresentationsKHR;
    public final @Nullable MemorySegment SEGMENT$vkCmdSetLineStippleKHR;
    public final @Nullable MemorySegment SEGMENT$vkCreateAccelerationStructureKHR;
    public final @Nullable MemorySegment SEGMENT$vkCmdBuildAccelerationStructuresKHR;
    public final @Nullable MemorySegment SEGMENT$vkCmdBuildAccelerationStructuresIndirectKHR;
    public final @Nullable MemorySegment SEGMENT$vkBuildAccelerationStructuresKHR;
    public final @Nullable MemorySegment SEGMENT$vkGetAccelerationStructureDeviceAddressKHR;
    public final @Nullable MemorySegment SEGMENT$vkCreateDeferredOperationKHR;
    public final @Nullable MemorySegment SEGMENT$vkDestroyDeferredOperationKHR;
    public final @Nullable MemorySegment SEGMENT$vkGetDeferredOperationMaxConcurrencyKHR;
    public final @Nullable MemorySegment SEGMENT$vkGetDeferredOperationResultKHR;
    public final @Nullable MemorySegment SEGMENT$vkDeferredOperationJoinKHR;
    public final @Nullable MemorySegment SEGMENT$vkGetPipelineIndirectMemoryRequirementsNV;
    public final @Nullable MemorySegment SEGMENT$vkGetPipelineIndirectDeviceAddressNV;
    public final @Nullable MemorySegment SEGMENT$vkAntiLagUpdateAMD;
    public final @Nullable MemorySegment SEGMENT$vkCmdSetCullMode;
    public final @Nullable MemorySegment SEGMENT$vkCmdSetFrontFace;
    public final @Nullable MemorySegment SEGMENT$vkCmdSetPrimitiveTopology;
    public final @Nullable MemorySegment SEGMENT$vkCmdSetViewportWithCount;
    public final @Nullable MemorySegment SEGMENT$vkCmdSetScissorWithCount;
    public final @Nullable MemorySegment SEGMENT$vkCmdBindIndexBuffer2KHR;
    public final @Nullable MemorySegment SEGMENT$vkCmdBindVertexBuffers2;
    public final @Nullable MemorySegment SEGMENT$vkCmdSetDepthTestEnable;
    public final @Nullable MemorySegment SEGMENT$vkCmdSetDepthWriteEnable;
    public final @Nullable MemorySegment SEGMENT$vkCmdSetDepthCompareOp;
    public final @Nullable MemorySegment SEGMENT$vkCmdSetDepthBoundsTestEnable;
    public final @Nullable MemorySegment SEGMENT$vkCmdSetStencilTestEnable;
    public final @Nullable MemorySegment SEGMENT$vkCmdSetStencilOp;
    public final @Nullable MemorySegment SEGMENT$vkCmdSetPatchControlPointsEXT;
    public final @Nullable MemorySegment SEGMENT$vkCmdSetRasterizerDiscardEnable;
    public final @Nullable MemorySegment SEGMENT$vkCmdSetDepthBiasEnable;
    public final @Nullable MemorySegment SEGMENT$vkCmdSetLogicOpEXT;
    public final @Nullable MemorySegment SEGMENT$vkCmdSetPrimitiveRestartEnable;
    public final @Nullable MemorySegment SEGMENT$vkCmdSetTessellationDomainOriginEXT;
    public final @Nullable MemorySegment SEGMENT$vkCmdSetDepthClampEnableEXT;
    public final @Nullable MemorySegment SEGMENT$vkCmdSetPolygonModeEXT;
    public final @Nullable MemorySegment SEGMENT$vkCmdSetRasterizationSamplesEXT;
    public final @Nullable MemorySegment SEGMENT$vkCmdSetSampleMaskEXT;
    public final @Nullable MemorySegment SEGMENT$vkCmdSetAlphaToCoverageEnableEXT;
    public final @Nullable MemorySegment SEGMENT$vkCmdSetAlphaToOneEnableEXT;
    public final @Nullable MemorySegment SEGMENT$vkCmdSetLogicOpEnableEXT;
    public final @Nullable MemorySegment SEGMENT$vkCmdSetColorBlendEnableEXT;
    public final @Nullable MemorySegment SEGMENT$vkCmdSetColorBlendEquationEXT;
    public final @Nullable MemorySegment SEGMENT$vkCmdSetColorWriteMaskEXT;
    public final @Nullable MemorySegment SEGMENT$vkCmdSetRasterizationStreamEXT;
    public final @Nullable MemorySegment SEGMENT$vkCmdSetConservativeRasterizationModeEXT;
    public final @Nullable MemorySegment SEGMENT$vkCmdSetExtraPrimitiveOverestimationSizeEXT;
    public final @Nullable MemorySegment SEGMENT$vkCmdSetDepthClipEnableEXT;
    public final @Nullable MemorySegment SEGMENT$vkCmdSetSampleLocationsEnableEXT;
    public final @Nullable MemorySegment SEGMENT$vkCmdSetColorBlendAdvancedEXT;
    public final @Nullable MemorySegment SEGMENT$vkCmdSetProvokingVertexModeEXT;
    public final @Nullable MemorySegment SEGMENT$vkCmdSetLineRasterizationModeEXT;
    public final @Nullable MemorySegment SEGMENT$vkCmdSetLineStippleEnableEXT;
    public final @Nullable MemorySegment SEGMENT$vkCmdSetDepthClipNegativeOneToOneEXT;
    public final @Nullable MemorySegment SEGMENT$vkCmdSetViewportWScalingEnableNV;
    public final @Nullable MemorySegment SEGMENT$vkCmdSetViewportSwizzleNV;
    public final @Nullable MemorySegment SEGMENT$vkCmdSetCoverageToColorEnableNV;
    public final @Nullable MemorySegment SEGMENT$vkCmdSetCoverageToColorLocationNV;
    public final @Nullable MemorySegment SEGMENT$vkCmdSetCoverageModulationModeNV;
    public final @Nullable MemorySegment SEGMENT$vkCmdSetCoverageModulationTableEnableNV;
    public final @Nullable MemorySegment SEGMENT$vkCmdSetCoverageModulationTableNV;
    public final @Nullable MemorySegment SEGMENT$vkCmdSetShadingRateImageEnableNV;
    public final @Nullable MemorySegment SEGMENT$vkCmdSetCoverageReductionModeNV;
    public final @Nullable MemorySegment SEGMENT$vkCmdSetRepresentativeFragmentTestEnableNV;
    public final @Nullable MemorySegment SEGMENT$vkCreatePrivateDataSlot;
    public final @Nullable MemorySegment SEGMENT$vkDestroyPrivateDataSlot;
    public final @Nullable MemorySegment SEGMENT$vkSetPrivateData;
    public final @Nullable MemorySegment SEGMENT$vkGetPrivateData;
    public final @Nullable MemorySegment SEGMENT$vkCmdCopyBuffer2;
    public final @Nullable MemorySegment SEGMENT$vkCmdCopyImage2;
    public final @Nullable MemorySegment SEGMENT$vkCmdBlitImage2;
    public final @Nullable MemorySegment SEGMENT$vkCmdCopyBufferToImage2;
    public final @Nullable MemorySegment SEGMENT$vkCmdCopyImageToBuffer2;
    public final @Nullable MemorySegment SEGMENT$vkCmdResolveImage2;
    public final @Nullable MemorySegment SEGMENT$vkCmdRefreshObjectsKHR;
    public final @Nullable MemorySegment SEGMENT$vkGetPhysicalDeviceRefreshableObjectTypesKHR;
    public final @Nullable MemorySegment SEGMENT$vkCmdSetFragmentShadingRateKHR;
    public final @Nullable MemorySegment SEGMENT$vkGetPhysicalDeviceFragmentShadingRatesKHR;
    public final @Nullable MemorySegment SEGMENT$vkCmdSetFragmentShadingRateEnumNV;
    public final @Nullable MemorySegment SEGMENT$vkGetAccelerationStructureBuildSizesKHR;
    public final @Nullable MemorySegment SEGMENT$vkCmdSetVertexInputEXT;
    public final @Nullable MemorySegment SEGMENT$vkCmdSetColorWriteEnableEXT;
    public final @Nullable MemorySegment SEGMENT$vkCmdSetEvent2;
    public final @Nullable MemorySegment SEGMENT$vkCmdResetEvent2;
    public final @Nullable MemorySegment SEGMENT$vkCmdWaitEvents2;
    public final @Nullable MemorySegment SEGMENT$vkCmdPipelineBarrier2;
    public final @Nullable MemorySegment SEGMENT$vkQueueSubmit2;
    public final @Nullable MemorySegment SEGMENT$vkCmdWriteTimestamp2;
    public final @Nullable MemorySegment SEGMENT$vkCmdWriteBufferMarker2AMD;
    public final @Nullable MemorySegment SEGMENT$vkGetQueueCheckpointData2NV;
    public final @Nullable MemorySegment SEGMENT$vkCopyMemoryToImageEXT;
    public final @Nullable MemorySegment SEGMENT$vkCopyImageToMemoryEXT;
    public final @Nullable MemorySegment SEGMENT$vkCopyImageToImageEXT;
    public final @Nullable MemorySegment SEGMENT$vkTransitionImageLayoutEXT;
    public final @Nullable MemorySegment SEGMENT$vkCmdDecompressMemoryNV;
    public final @Nullable MemorySegment SEGMENT$vkCmdDecompressMemoryIndirectCountNV;
    public final @Nullable MemorySegment SEGMENT$vkCreateCuModuleNVX;
    public final @Nullable MemorySegment SEGMENT$vkCreateCuFunctionNVX;
    public final @Nullable MemorySegment SEGMENT$vkDestroyCuModuleNVX;
    public final @Nullable MemorySegment SEGMENT$vkDestroyCuFunctionNVX;
    public final @Nullable MemorySegment SEGMENT$vkCmdCuLaunchKernelNVX;
    public final @Nullable MemorySegment SEGMENT$vkGetDescriptorSetLayoutSizeEXT;
    public final @Nullable MemorySegment SEGMENT$vkGetDescriptorSetLayoutBindingOffsetEXT;
    public final @Nullable MemorySegment SEGMENT$vkGetDescriptorEXT;
    public final @Nullable MemorySegment SEGMENT$vkCmdBindDescriptorBuffersEXT;
    public final @Nullable MemorySegment SEGMENT$vkCmdSetDescriptorBufferOffsetsEXT;
    public final @Nullable MemorySegment SEGMENT$vkCmdBindDescriptorBufferEmbeddedSamplersEXT;
    public final @Nullable MemorySegment SEGMENT$vkGetBufferOpaqueCaptureDescriptorDataEXT;
    public final @Nullable MemorySegment SEGMENT$vkGetImageOpaqueCaptureDescriptorDataEXT;
    public final @Nullable MemorySegment SEGMENT$vkGetImageViewOpaqueCaptureDescriptorDataEXT;
    public final @Nullable MemorySegment SEGMENT$vkGetSamplerOpaqueCaptureDescriptorDataEXT;
    public final @Nullable MemorySegment SEGMENT$vkGetAccelerationStructureOpaqueCaptureDescriptorDataEXT;
    public final @Nullable MemorySegment SEGMENT$vkSetDeviceMemoryPriorityEXT;
    public final @Nullable MemorySegment SEGMENT$vkWaitForPresentKHR;
    public final @Nullable MemorySegment SEGMENT$vkCreateBufferCollectionFUCHSIA;
    public final @Nullable MemorySegment SEGMENT$vkSetBufferCollectionBufferConstraintsFUCHSIA;
    public final @Nullable MemorySegment SEGMENT$vkSetBufferCollectionImageConstraintsFUCHSIA;
    public final @Nullable MemorySegment SEGMENT$vkDestroyBufferCollectionFUCHSIA;
    public final @Nullable MemorySegment SEGMENT$vkGetBufferCollectionPropertiesFUCHSIA;
    public final @Nullable MemorySegment SEGMENT$vkCreateCudaModuleNV;
    public final @Nullable MemorySegment SEGMENT$vkGetCudaModuleCacheNV;
    public final @Nullable MemorySegment SEGMENT$vkCreateCudaFunctionNV;
    public final @Nullable MemorySegment SEGMENT$vkDestroyCudaModuleNV;
    public final @Nullable MemorySegment SEGMENT$vkDestroyCudaFunctionNV;
    public final @Nullable MemorySegment SEGMENT$vkCmdCudaLaunchKernelNV;
    public final @Nullable MemorySegment SEGMENT$vkCmdBeginRendering;
    public final @Nullable MemorySegment SEGMENT$vkCmdEndRendering;
    public final @Nullable MemorySegment SEGMENT$vkGetDescriptorSetLayoutHostMappingInfoVALVE;
    public final @Nullable MemorySegment SEGMENT$vkGetDescriptorSetHostMappingVALVE;
    public final @Nullable MemorySegment SEGMENT$vkCreateMicromapEXT;
    public final @Nullable MemorySegment SEGMENT$vkCmdBuildMicromapsEXT;
    public final @Nullable MemorySegment SEGMENT$vkBuildMicromapsEXT;
    public final @Nullable MemorySegment SEGMENT$vkDestroyMicromapEXT;
    public final @Nullable MemorySegment SEGMENT$vkCmdCopyMicromapEXT;
    public final @Nullable MemorySegment SEGMENT$vkCopyMicromapEXT;
    public final @Nullable MemorySegment SEGMENT$vkCmdCopyMicromapToMemoryEXT;
    public final @Nullable MemorySegment SEGMENT$vkCopyMicromapToMemoryEXT;
    public final @Nullable MemorySegment SEGMENT$vkCmdCopyMemoryToMicromapEXT;
    public final @Nullable MemorySegment SEGMENT$vkCopyMemoryToMicromapEXT;
    public final @Nullable MemorySegment SEGMENT$vkCmdWriteMicromapsPropertiesEXT;
    public final @Nullable MemorySegment SEGMENT$vkWriteMicromapsPropertiesEXT;
    public final @Nullable MemorySegment SEGMENT$vkGetDeviceMicromapCompatibilityEXT;
    public final @Nullable MemorySegment SEGMENT$vkGetMicromapBuildSizesEXT;
    public final @Nullable MemorySegment SEGMENT$vkGetShaderModuleIdentifierEXT;
    public final @Nullable MemorySegment SEGMENT$vkGetShaderModuleCreateInfoIdentifierEXT;
    public final @Nullable MemorySegment SEGMENT$vkGetImageSubresourceLayout2KHR;
    public final @Nullable MemorySegment SEGMENT$vkGetPipelinePropertiesEXT;
    public final @Nullable MemorySegment SEGMENT$vkExportMetalObjectsEXT;
    public final @Nullable MemorySegment SEGMENT$vkGetFramebufferTilePropertiesQCOM;
    public final @Nullable MemorySegment SEGMENT$vkGetDynamicRenderingTilePropertiesQCOM;
    public final @Nullable MemorySegment SEGMENT$vkGetPhysicalDeviceOpticalFlowImageFormatsNV;
    public final @Nullable MemorySegment SEGMENT$vkCreateOpticalFlowSessionNV;
    public final @Nullable MemorySegment SEGMENT$vkDestroyOpticalFlowSessionNV;
    public final @Nullable MemorySegment SEGMENT$vkBindOpticalFlowSessionImageNV;
    public final @Nullable MemorySegment SEGMENT$vkCmdOpticalFlowExecuteNV;
    public final @Nullable MemorySegment SEGMENT$vkGetDeviceFaultInfoEXT;
    public final @Nullable MemorySegment SEGMENT$vkCmdSetDepthBias2EXT;
    public final @Nullable MemorySegment SEGMENT$vkReleaseSwapchainImagesEXT;
    public final @Nullable MemorySegment SEGMENT$vkGetDeviceImageSubresourceLayoutKHR;
    public final @Nullable MemorySegment SEGMENT$vkMapMemory2KHR;
    public final @Nullable MemorySegment SEGMENT$vkUnmapMemory2KHR;
    public final @Nullable MemorySegment SEGMENT$vkCreateShadersEXT;
    public final @Nullable MemorySegment SEGMENT$vkDestroyShaderEXT;
    public final @Nullable MemorySegment SEGMENT$vkGetShaderBinaryDataEXT;
    public final @Nullable MemorySegment SEGMENT$vkCmdBindShadersEXT;
    public final @Nullable MemorySegment SEGMENT$vkGetScreenBufferPropertiesQNX;
    public final @Nullable MemorySegment SEGMENT$vkGetPhysicalDeviceCooperativeMatrixPropertiesKHR;
    public final @Nullable MemorySegment SEGMENT$vkGetExecutionGraphPipelineScratchSizeAMDX;
    public final @Nullable MemorySegment SEGMENT$vkGetExecutionGraphPipelineNodeIndexAMDX;
    public final @Nullable MemorySegment SEGMENT$vkCreateExecutionGraphPipelinesAMDX;
    public final @Nullable MemorySegment SEGMENT$vkCmdInitializeGraphScratchMemoryAMDX;
    public final @Nullable MemorySegment SEGMENT$vkCmdDispatchGraphAMDX;
    public final @Nullable MemorySegment SEGMENT$vkCmdDispatchGraphIndirectAMDX;
    public final @Nullable MemorySegment SEGMENT$vkCmdDispatchGraphIndirectCountAMDX;
    public final @Nullable MemorySegment SEGMENT$vkCmdBindDescriptorSets2KHR;
    public final @Nullable MemorySegment SEGMENT$vkCmdPushConstants2KHR;
    public final @Nullable MemorySegment SEGMENT$vkCmdPushDescriptorSet2KHR;
    public final @Nullable MemorySegment SEGMENT$vkCmdPushDescriptorSetWithTemplate2KHR;
    public final @Nullable MemorySegment SEGMENT$vkCmdSetDescriptorBufferOffsets2EXT;
    public final @Nullable MemorySegment SEGMENT$vkCmdBindDescriptorBufferEmbeddedSamplers2EXT;
    public final @Nullable MemorySegment SEGMENT$vkSetLatencySleepModeNV;
    public final @Nullable MemorySegment SEGMENT$vkLatencySleepNV;
    public final @Nullable MemorySegment SEGMENT$vkSetLatencyMarkerNV;
    public final @Nullable MemorySegment SEGMENT$vkGetLatencyTimingsNV;
    public final @Nullable MemorySegment SEGMENT$vkQueueNotifyOutOfBandNV;
    public final @Nullable MemorySegment SEGMENT$vkCmdSetRenderingAttachmentLocationsKHR;
    public final @Nullable MemorySegment SEGMENT$vkCmdSetRenderingInputAttachmentIndicesKHR;
    public final @Nullable MethodHandle HANDLE$vkDestroyDevice;
    public final @Nullable MethodHandle HANDLE$vkGetDeviceQueue;
    public final @Nullable MethodHandle HANDLE$vkQueueSubmit;
    public final @Nullable MethodHandle HANDLE$vkQueueWaitIdle;
    public final @Nullable MethodHandle HANDLE$vkDeviceWaitIdle;
    public final @Nullable MethodHandle HANDLE$vkAllocateMemory;
    public final @Nullable MethodHandle HANDLE$vkFreeMemory;
    public final @Nullable MethodHandle HANDLE$vkMapMemory;
    public final @Nullable MethodHandle HANDLE$vkUnmapMemory;
    public final @Nullable MethodHandle HANDLE$vkFlushMappedMemoryRanges;
    public final @Nullable MethodHandle HANDLE$vkInvalidateMappedMemoryRanges;
    public final @Nullable MethodHandle HANDLE$vkGetDeviceMemoryCommitment;
    public final @Nullable MethodHandle HANDLE$vkGetBufferMemoryRequirements;
    public final @Nullable MethodHandle HANDLE$vkBindBufferMemory;
    public final @Nullable MethodHandle HANDLE$vkGetImageMemoryRequirements;
    public final @Nullable MethodHandle HANDLE$vkBindImageMemory;
    public final @Nullable MethodHandle HANDLE$vkGetImageSparseMemoryRequirements;
    public final @Nullable MethodHandle HANDLE$vkQueueBindSparse;
    public final @Nullable MethodHandle HANDLE$vkCreateFence;
    public final @Nullable MethodHandle HANDLE$vkDestroyFence;
    public final @Nullable MethodHandle HANDLE$vkResetFences;
    public final @Nullable MethodHandle HANDLE$vkGetFenceStatus;
    public final @Nullable MethodHandle HANDLE$vkWaitForFences;
    public final @Nullable MethodHandle HANDLE$vkCreateSemaphore;
    public final @Nullable MethodHandle HANDLE$vkDestroySemaphore;
    public final @Nullable MethodHandle HANDLE$vkCreateEvent;
    public final @Nullable MethodHandle HANDLE$vkDestroyEvent;
    public final @Nullable MethodHandle HANDLE$vkGetEventStatus;
    public final @Nullable MethodHandle HANDLE$vkSetEvent;
    public final @Nullable MethodHandle HANDLE$vkResetEvent;
    public final @Nullable MethodHandle HANDLE$vkCreateQueryPool;
    public final @Nullable MethodHandle HANDLE$vkDestroyQueryPool;
    public final @Nullable MethodHandle HANDLE$vkGetQueryPoolResults;
    public final @Nullable MethodHandle HANDLE$vkResetQueryPool;
    public final @Nullable MethodHandle HANDLE$vkCreateBuffer;
    public final @Nullable MethodHandle HANDLE$vkDestroyBuffer;
    public final @Nullable MethodHandle HANDLE$vkCreateBufferView;
    public final @Nullable MethodHandle HANDLE$vkDestroyBufferView;
    public final @Nullable MethodHandle HANDLE$vkCreateImage;
    public final @Nullable MethodHandle HANDLE$vkDestroyImage;
    public final @Nullable MethodHandle HANDLE$vkGetImageSubresourceLayout;
    public final @Nullable MethodHandle HANDLE$vkCreateImageView;
    public final @Nullable MethodHandle HANDLE$vkDestroyImageView;
    public final @Nullable MethodHandle HANDLE$vkCreateShaderModule;
    public final @Nullable MethodHandle HANDLE$vkDestroyShaderModule;
    public final @Nullable MethodHandle HANDLE$vkCreatePipelineCache;
    public final @Nullable MethodHandle HANDLE$vkDestroyPipelineCache;
    public final @Nullable MethodHandle HANDLE$vkGetPipelineCacheData;
    public final @Nullable MethodHandle HANDLE$vkMergePipelineCaches;
    public final @Nullable MethodHandle HANDLE$vkCreatePipelineBinariesKHR;
    public final @Nullable MethodHandle HANDLE$vkDestroyPipelineBinaryKHR;
    public final @Nullable MethodHandle HANDLE$vkGetPipelineKeyKHR;
    public final @Nullable MethodHandle HANDLE$vkGetPipelineBinaryDataKHR;
    public final @Nullable MethodHandle HANDLE$vkReleaseCapturedPipelineDataKHR;
    public final @Nullable MethodHandle HANDLE$vkCreateGraphicsPipelines;
    public final @Nullable MethodHandle HANDLE$vkCreateComputePipelines;
    public final @Nullable MethodHandle HANDLE$vkGetDeviceSubpassShadingMaxWorkgroupSizeHUAWEI;
    public final @Nullable MethodHandle HANDLE$vkDestroyPipeline;
    public final @Nullable MethodHandle HANDLE$vkCreatePipelineLayout;
    public final @Nullable MethodHandle HANDLE$vkDestroyPipelineLayout;
    public final @Nullable MethodHandle HANDLE$vkCreateSampler;
    public final @Nullable MethodHandle HANDLE$vkDestroySampler;
    public final @Nullable MethodHandle HANDLE$vkCreateDescriptorSetLayout;
    public final @Nullable MethodHandle HANDLE$vkDestroyDescriptorSetLayout;
    public final @Nullable MethodHandle HANDLE$vkCreateDescriptorPool;
    public final @Nullable MethodHandle HANDLE$vkDestroyDescriptorPool;
    public final @Nullable MethodHandle HANDLE$vkResetDescriptorPool;
    public final @Nullable MethodHandle HANDLE$vkAllocateDescriptorSets;
    public final @Nullable MethodHandle HANDLE$vkFreeDescriptorSets;
    public final @Nullable MethodHandle HANDLE$vkUpdateDescriptorSets;
    public final @Nullable MethodHandle HANDLE$vkCreateFramebuffer;
    public final @Nullable MethodHandle HANDLE$vkDestroyFramebuffer;
    public final @Nullable MethodHandle HANDLE$vkCreateRenderPass;
    public final @Nullable MethodHandle HANDLE$vkDestroyRenderPass;
    public final @Nullable MethodHandle HANDLE$vkGetRenderAreaGranularity;
    public final @Nullable MethodHandle HANDLE$vkGetRenderingAreaGranularityKHR;
    public final @Nullable MethodHandle HANDLE$vkCreateCommandPool;
    public final @Nullable MethodHandle HANDLE$vkDestroyCommandPool;
    public final @Nullable MethodHandle HANDLE$vkResetCommandPool;
    public final @Nullable MethodHandle HANDLE$vkAllocateCommandBuffers;
    public final @Nullable MethodHandle HANDLE$vkFreeCommandBuffers;
    public final @Nullable MethodHandle HANDLE$vkBeginCommandBuffer;
    public final @Nullable MethodHandle HANDLE$vkEndCommandBuffer;
    public final @Nullable MethodHandle HANDLE$vkResetCommandBuffer;
    public final @Nullable MethodHandle HANDLE$vkCmdBindPipeline;
    public final @Nullable MethodHandle HANDLE$vkCmdSetAttachmentFeedbackLoopEnableEXT;
    public final @Nullable MethodHandle HANDLE$vkCmdSetViewport;
    public final @Nullable MethodHandle HANDLE$vkCmdSetScissor;
    public final @Nullable MethodHandle HANDLE$vkCmdSetLineWidth;
    public final @Nullable MethodHandle HANDLE$vkCmdSetDepthBias;
    public final @Nullable MethodHandle HANDLE$vkCmdSetBlendConstants;
    public final @Nullable MethodHandle HANDLE$vkCmdSetDepthBounds;
    public final @Nullable MethodHandle HANDLE$vkCmdSetStencilCompareMask;
    public final @Nullable MethodHandle HANDLE$vkCmdSetStencilWriteMask;
    public final @Nullable MethodHandle HANDLE$vkCmdSetStencilReference;
    public final @Nullable MethodHandle HANDLE$vkCmdBindDescriptorSets;
    public final @Nullable MethodHandle HANDLE$vkCmdBindIndexBuffer;
    public final @Nullable MethodHandle HANDLE$vkCmdBindVertexBuffers;
    public final @Nullable MethodHandle HANDLE$vkCmdDraw;
    public final @Nullable MethodHandle HANDLE$vkCmdDrawIndexed;
    public final @Nullable MethodHandle HANDLE$vkCmdDrawMultiEXT;
    public final @Nullable MethodHandle HANDLE$vkCmdDrawMultiIndexedEXT;
    public final @Nullable MethodHandle HANDLE$vkCmdDrawIndirect;
    public final @Nullable MethodHandle HANDLE$vkCmdDrawIndexedIndirect;
    public final @Nullable MethodHandle HANDLE$vkCmdDispatch;
    public final @Nullable MethodHandle HANDLE$vkCmdDispatchIndirect;
    public final @Nullable MethodHandle HANDLE$vkCmdSubpassShadingHUAWEI;
    public final @Nullable MethodHandle HANDLE$vkCmdDrawClusterHUAWEI;
    public final @Nullable MethodHandle HANDLE$vkCmdDrawClusterIndirectHUAWEI;
    public final @Nullable MethodHandle HANDLE$vkCmdUpdatePipelineIndirectBufferNV;
    public final @Nullable MethodHandle HANDLE$vkCmdCopyBuffer;
    public final @Nullable MethodHandle HANDLE$vkCmdCopyImage;
    public final @Nullable MethodHandle HANDLE$vkCmdBlitImage;
    public final @Nullable MethodHandle HANDLE$vkCmdCopyBufferToImage;
    public final @Nullable MethodHandle HANDLE$vkCmdCopyImageToBuffer;
    public final @Nullable MethodHandle HANDLE$vkCmdCopyMemoryIndirectNV;
    public final @Nullable MethodHandle HANDLE$vkCmdCopyMemoryToImageIndirectNV;
    public final @Nullable MethodHandle HANDLE$vkCmdUpdateBuffer;
    public final @Nullable MethodHandle HANDLE$vkCmdFillBuffer;
    public final @Nullable MethodHandle HANDLE$vkCmdClearColorImage;
    public final @Nullable MethodHandle HANDLE$vkCmdClearDepthStencilImage;
    public final @Nullable MethodHandle HANDLE$vkCmdClearAttachments;
    public final @Nullable MethodHandle HANDLE$vkCmdResolveImage;
    public final @Nullable MethodHandle HANDLE$vkCmdSetEvent;
    public final @Nullable MethodHandle HANDLE$vkCmdResetEvent;
    public final @Nullable MethodHandle HANDLE$vkCmdWaitEvents;
    public final @Nullable MethodHandle HANDLE$vkCmdPipelineBarrier;
    public final @Nullable MethodHandle HANDLE$vkCmdBeginQuery;
    public final @Nullable MethodHandle HANDLE$vkCmdEndQuery;
    public final @Nullable MethodHandle HANDLE$vkCmdBeginConditionalRenderingEXT;
    public final @Nullable MethodHandle HANDLE$vkCmdEndConditionalRenderingEXT;
    public final @Nullable MethodHandle HANDLE$vkCmdResetQueryPool;
    public final @Nullable MethodHandle HANDLE$vkCmdWriteTimestamp;
    public final @Nullable MethodHandle HANDLE$vkCmdCopyQueryPoolResults;
    public final @Nullable MethodHandle HANDLE$vkCmdPushConstants;
    public final @Nullable MethodHandle HANDLE$vkCmdBeginRenderPass;
    public final @Nullable MethodHandle HANDLE$vkCmdNextSubpass;
    public final @Nullable MethodHandle HANDLE$vkCmdEndRenderPass;
    public final @Nullable MethodHandle HANDLE$vkCmdExecuteCommands;
    public final @Nullable MethodHandle HANDLE$vkCreateSharedSwapchainsKHR;
    public final @Nullable MethodHandle HANDLE$vkCreateSwapchainKHR;
    public final @Nullable MethodHandle HANDLE$vkDestroySwapchainKHR;
    public final @Nullable MethodHandle HANDLE$vkGetSwapchainImagesKHR;
    public final @Nullable MethodHandle HANDLE$vkAcquireNextImageKHR;
    public final @Nullable MethodHandle HANDLE$vkQueuePresentKHR;
    public final @Nullable MethodHandle HANDLE$vkDebugMarkerSetObjectNameEXT;
    public final @Nullable MethodHandle HANDLE$vkDebugMarkerSetObjectTagEXT;
    public final @Nullable MethodHandle HANDLE$vkCmdDebugMarkerBeginEXT;
    public final @Nullable MethodHandle HANDLE$vkCmdDebugMarkerEndEXT;
    public final @Nullable MethodHandle HANDLE$vkCmdDebugMarkerInsertEXT;
    public final @Nullable MethodHandle HANDLE$vkGetMemoryWin32HandleNV;
    public final @Nullable MethodHandle HANDLE$vkCmdExecuteGeneratedCommandsNV;
    public final @Nullable MethodHandle HANDLE$vkCmdPreprocessGeneratedCommandsNV;
    public final @Nullable MethodHandle HANDLE$vkCmdBindPipelineShaderGroupNV;
    public final @Nullable MethodHandle HANDLE$vkGetGeneratedCommandsMemoryRequirementsNV;
    public final @Nullable MethodHandle HANDLE$vkCreateIndirectCommandsLayoutNV;
    public final @Nullable MethodHandle HANDLE$vkDestroyIndirectCommandsLayoutNV;
    public final @Nullable MethodHandle HANDLE$vkCmdPushDescriptorSetKHR;
    public final @Nullable MethodHandle HANDLE$vkTrimCommandPool;
    public final @Nullable MethodHandle HANDLE$vkGetMemoryWin32HandleKHR;
    public final @Nullable MethodHandle HANDLE$vkGetMemoryWin32HandlePropertiesKHR;
    public final @Nullable MethodHandle HANDLE$vkGetMemoryFdKHR;
    public final @Nullable MethodHandle HANDLE$vkGetMemoryFdPropertiesKHR;
    public final @Nullable MethodHandle HANDLE$vkGetMemoryZirconHandleFUCHSIA;
    public final @Nullable MethodHandle HANDLE$vkGetMemoryZirconHandlePropertiesFUCHSIA;
    public final @Nullable MethodHandle HANDLE$vkGetMemoryRemoteAddressNV;
    public final @Nullable MethodHandle HANDLE$vkGetMemorySciBufNV;
    public final @Nullable MethodHandle HANDLE$vkGetPhysicalDeviceExternalMemorySciBufPropertiesNV;
    public final @Nullable MethodHandle HANDLE$vkGetPhysicalDeviceSciBufAttributesNV;
    public final @Nullable MethodHandle HANDLE$vkGetSemaphoreWin32HandleKHR;
    public final @Nullable MethodHandle HANDLE$vkImportSemaphoreWin32HandleKHR;
    public final @Nullable MethodHandle HANDLE$vkGetSemaphoreFdKHR;
    public final @Nullable MethodHandle HANDLE$vkImportSemaphoreFdKHR;
    public final @Nullable MethodHandle HANDLE$vkGetSemaphoreZirconHandleFUCHSIA;
    public final @Nullable MethodHandle HANDLE$vkImportSemaphoreZirconHandleFUCHSIA;
    public final @Nullable MethodHandle HANDLE$vkGetFenceWin32HandleKHR;
    public final @Nullable MethodHandle HANDLE$vkImportFenceWin32HandleKHR;
    public final @Nullable MethodHandle HANDLE$vkGetFenceFdKHR;
    public final @Nullable MethodHandle HANDLE$vkImportFenceFdKHR;
    public final @Nullable MethodHandle HANDLE$vkGetFenceSciSyncFenceNV;
    public final @Nullable MethodHandle HANDLE$vkGetFenceSciSyncObjNV;
    public final @Nullable MethodHandle HANDLE$vkImportFenceSciSyncFenceNV;
    public final @Nullable MethodHandle HANDLE$vkImportFenceSciSyncObjNV;
    public final @Nullable MethodHandle HANDLE$vkGetSemaphoreSciSyncObjNV;
    public final @Nullable MethodHandle HANDLE$vkImportSemaphoreSciSyncObjNV;
    public final @Nullable MethodHandle HANDLE$vkGetPhysicalDeviceSciSyncAttributesNV;
    public final @Nullable MethodHandle HANDLE$vkCreateSemaphoreSciSyncPoolNV;
    public final @Nullable MethodHandle HANDLE$vkDestroySemaphoreSciSyncPoolNV;
    public final @Nullable MethodHandle HANDLE$vkAcquireWinrtDisplayNV;
    public final @Nullable MethodHandle HANDLE$vkGetWinrtDisplayNV;
    public final @Nullable MethodHandle HANDLE$vkDisplayPowerControlEXT;
    public final @Nullable MethodHandle HANDLE$vkRegisterDeviceEventEXT;
    public final @Nullable MethodHandle HANDLE$vkRegisterDisplayEventEXT;
    public final @Nullable MethodHandle HANDLE$vkGetSwapchainCounterEXT;
    public final @Nullable MethodHandle HANDLE$vkGetDeviceGroupPeerMemoryFeatures;
    public final @Nullable MethodHandle HANDLE$vkBindBufferMemory2;
    public final @Nullable MethodHandle HANDLE$vkBindImageMemory2;
    public final @Nullable MethodHandle HANDLE$vkCmdSetDeviceMask;
    public final @Nullable MethodHandle HANDLE$vkGetDeviceGroupPresentCapabilitiesKHR;
    public final @Nullable MethodHandle HANDLE$vkGetDeviceGroupSurfacePresentModesKHR;
    public final @Nullable MethodHandle HANDLE$vkAcquireNextImage2KHR;
    public final @Nullable MethodHandle HANDLE$vkCmdDispatchBase;
    public final @Nullable MethodHandle HANDLE$vkGetPhysicalDevicePresentRectanglesKHR;
    public final @Nullable MethodHandle HANDLE$vkCreateDescriptorUpdateTemplate;
    public final @Nullable MethodHandle HANDLE$vkDestroyDescriptorUpdateTemplate;
    public final @Nullable MethodHandle HANDLE$vkUpdateDescriptorSetWithTemplate;
    public final @Nullable MethodHandle HANDLE$vkCmdPushDescriptorSetWithTemplateKHR;
    public final @Nullable MethodHandle HANDLE$vkSetHdrMetadataEXT;
    public final @Nullable MethodHandle HANDLE$vkGetSwapchainStatusKHR;
    public final @Nullable MethodHandle HANDLE$vkGetRefreshCycleDurationGOOGLE;
    public final @Nullable MethodHandle HANDLE$vkGetPastPresentationTimingGOOGLE;
    public final @Nullable MethodHandle HANDLE$vkCmdSetViewportWScalingNV;
    public final @Nullable MethodHandle HANDLE$vkCmdSetDiscardRectangleEXT;
    public final @Nullable MethodHandle HANDLE$vkCmdSetDiscardRectangleEnableEXT;
    public final @Nullable MethodHandle HANDLE$vkCmdSetDiscardRectangleModeEXT;
    public final @Nullable MethodHandle HANDLE$vkCmdSetSampleLocationsEXT;
    public final @Nullable MethodHandle HANDLE$vkGetPhysicalDeviceMultisamplePropertiesEXT;
    public final @Nullable MethodHandle HANDLE$vkGetBufferMemoryRequirements2;
    public final @Nullable MethodHandle HANDLE$vkGetImageMemoryRequirements2;
    public final @Nullable MethodHandle HANDLE$vkGetImageSparseMemoryRequirements2;
    public final @Nullable MethodHandle HANDLE$vkGetDeviceBufferMemoryRequirements;
    public final @Nullable MethodHandle HANDLE$vkGetDeviceImageMemoryRequirements;
    public final @Nullable MethodHandle HANDLE$vkGetDeviceImageSparseMemoryRequirements;
    public final @Nullable MethodHandle HANDLE$vkCreateSamplerYcbcrConversion;
    public final @Nullable MethodHandle HANDLE$vkDestroySamplerYcbcrConversion;
    public final @Nullable MethodHandle HANDLE$vkGetDeviceQueue2;
    public final @Nullable MethodHandle HANDLE$vkCreateValidationCacheEXT;
    public final @Nullable MethodHandle HANDLE$vkDestroyValidationCacheEXT;
    public final @Nullable MethodHandle HANDLE$vkGetValidationCacheDataEXT;
    public final @Nullable MethodHandle HANDLE$vkMergeValidationCachesEXT;
    public final @Nullable MethodHandle HANDLE$vkGetDescriptorSetLayoutSupport;
    public final @Nullable MethodHandle HANDLE$vkGetShaderInfoAMD;
    public final @Nullable MethodHandle HANDLE$vkSetLocalDimmingAMD;
    public final @Nullable MethodHandle HANDLE$vkGetPhysicalDeviceCalibrateableTimeDomainsKHR;
    public final @Nullable MethodHandle HANDLE$vkGetCalibratedTimestampsKHR;
    public final @Nullable MethodHandle HANDLE$vkGetMemoryHostPointerPropertiesEXT;
    public final @Nullable MethodHandle HANDLE$vkCmdWriteBufferMarkerAMD;
    public final @Nullable MethodHandle HANDLE$vkCreateRenderPass2;
    public final @Nullable MethodHandle HANDLE$vkCmdBeginRenderPass2;
    public final @Nullable MethodHandle HANDLE$vkCmdNextSubpass2;
    public final @Nullable MethodHandle HANDLE$vkCmdEndRenderPass2;
    public final @Nullable MethodHandle HANDLE$vkGetSemaphoreCounterValue;
    public final @Nullable MethodHandle HANDLE$vkWaitSemaphores;
    public final @Nullable MethodHandle HANDLE$vkSignalSemaphore;
    public final @Nullable MethodHandle HANDLE$vkGetAndroidHardwareBufferPropertiesANDROID;
    public final @Nullable MethodHandle HANDLE$vkGetMemoryAndroidHardwareBufferANDROID;
    public final @Nullable MethodHandle HANDLE$vkCmdDrawIndirectCount;
    public final @Nullable MethodHandle HANDLE$vkCmdDrawIndexedIndirectCount;
    public final @Nullable MethodHandle HANDLE$vkCmdSetCheckpointNV;
    public final @Nullable MethodHandle HANDLE$vkGetQueueCheckpointDataNV;
    public final @Nullable MethodHandle HANDLE$vkCmdBindTransformFeedbackBuffersEXT;
    public final @Nullable MethodHandle HANDLE$vkCmdBeginTransformFeedbackEXT;
    public final @Nullable MethodHandle HANDLE$vkCmdEndTransformFeedbackEXT;
    public final @Nullable MethodHandle HANDLE$vkCmdBeginQueryIndexedEXT;
    public final @Nullable MethodHandle HANDLE$vkCmdEndQueryIndexedEXT;
    public final @Nullable MethodHandle HANDLE$vkCmdDrawIndirectByteCountEXT;
    public final @Nullable MethodHandle HANDLE$vkCmdSetExclusiveScissorNV;
    public final @Nullable MethodHandle HANDLE$vkCmdSetExclusiveScissorEnableNV;
    public final @Nullable MethodHandle HANDLE$vkCmdBindShadingRateImageNV;
    public final @Nullable MethodHandle HANDLE$vkCmdSetViewportShadingRatePaletteNV;
    public final @Nullable MethodHandle HANDLE$vkCmdSetCoarseSampleOrderNV;
    public final @Nullable MethodHandle HANDLE$vkCmdDrawMeshTasksNV;
    public final @Nullable MethodHandle HANDLE$vkCmdDrawMeshTasksIndirectNV;
    public final @Nullable MethodHandle HANDLE$vkCmdDrawMeshTasksIndirectCountNV;
    public final @Nullable MethodHandle HANDLE$vkCmdDrawMeshTasksEXT;
    public final @Nullable MethodHandle HANDLE$vkCmdDrawMeshTasksIndirectEXT;
    public final @Nullable MethodHandle HANDLE$vkCmdDrawMeshTasksIndirectCountEXT;
    public final @Nullable MethodHandle HANDLE$vkCompileDeferredNV;
    public final @Nullable MethodHandle HANDLE$vkCreateAccelerationStructureNV;
    public final @Nullable MethodHandle HANDLE$vkCmdBindInvocationMaskHUAWEI;
    public final @Nullable MethodHandle HANDLE$vkDestroyAccelerationStructureKHR;
    public final @Nullable MethodHandle HANDLE$vkDestroyAccelerationStructureNV;
    public final @Nullable MethodHandle HANDLE$vkGetAccelerationStructureMemoryRequirementsNV;
    public final @Nullable MethodHandle HANDLE$vkBindAccelerationStructureMemoryNV;
    public final @Nullable MethodHandle HANDLE$vkCmdCopyAccelerationStructureNV;
    public final @Nullable MethodHandle HANDLE$vkCmdCopyAccelerationStructureKHR;
    public final @Nullable MethodHandle HANDLE$vkCopyAccelerationStructureKHR;
    public final @Nullable MethodHandle HANDLE$vkCmdCopyAccelerationStructureToMemoryKHR;
    public final @Nullable MethodHandle HANDLE$vkCopyAccelerationStructureToMemoryKHR;
    public final @Nullable MethodHandle HANDLE$vkCmdCopyMemoryToAccelerationStructureKHR;
    public final @Nullable MethodHandle HANDLE$vkCopyMemoryToAccelerationStructureKHR;
    public final @Nullable MethodHandle HANDLE$vkCmdWriteAccelerationStructuresPropertiesKHR;
    public final @Nullable MethodHandle HANDLE$vkCmdWriteAccelerationStructuresPropertiesNV;
    public final @Nullable MethodHandle HANDLE$vkCmdBuildAccelerationStructureNV;
    public final @Nullable MethodHandle HANDLE$vkWriteAccelerationStructuresPropertiesKHR;
    public final @Nullable MethodHandle HANDLE$vkCmdTraceRaysKHR;
    public final @Nullable MethodHandle HANDLE$vkCmdTraceRaysNV;
    public final @Nullable MethodHandle HANDLE$vkGetRayTracingShaderGroupHandlesKHR;
    public final @Nullable MethodHandle HANDLE$vkGetRayTracingCaptureReplayShaderGroupHandlesKHR;
    public final @Nullable MethodHandle HANDLE$vkGetAccelerationStructureHandleNV;
    public final @Nullable MethodHandle HANDLE$vkCreateRayTracingPipelinesNV;
    public final @Nullable MethodHandle HANDLE$vkCreateRayTracingPipelinesKHR;
    public final @Nullable MethodHandle HANDLE$vkGetPhysicalDeviceCooperativeMatrixPropertiesNV;
    public final @Nullable MethodHandle HANDLE$vkCmdTraceRaysIndirectKHR;
    public final @Nullable MethodHandle HANDLE$vkCmdTraceRaysIndirect2KHR;
    public final @Nullable MethodHandle HANDLE$vkGetDeviceAccelerationStructureCompatibilityKHR;
    public final @Nullable MethodHandle HANDLE$vkGetRayTracingShaderGroupStackSizeKHR;
    public final @Nullable MethodHandle HANDLE$vkCmdSetRayTracingPipelineStackSizeKHR;
    public final @Nullable MethodHandle HANDLE$vkGetImageViewHandleNVX;
    public final @Nullable MethodHandle HANDLE$vkGetImageViewAddressNVX;
    public final @Nullable MethodHandle HANDLE$vkGetPhysicalDeviceSurfacePresentModes2EXT;
    public final @Nullable MethodHandle HANDLE$vkGetDeviceGroupSurfacePresentModes2EXT;
    public final @Nullable MethodHandle HANDLE$vkAcquireFullScreenExclusiveModeEXT;
    public final @Nullable MethodHandle HANDLE$vkReleaseFullScreenExclusiveModeEXT;
    public final @Nullable MethodHandle HANDLE$vkEnumeratePhysicalDeviceQueueFamilyPerformanceQueryCountersKHR;
    public final @Nullable MethodHandle HANDLE$vkGetPhysicalDeviceQueueFamilyPerformanceQueryPassesKHR;
    public final @Nullable MethodHandle HANDLE$vkAcquireProfilingLockKHR;
    public final @Nullable MethodHandle HANDLE$vkReleaseProfilingLockKHR;
    public final @Nullable MethodHandle HANDLE$vkGetImageDrmFormatModifierPropertiesEXT;
    public final @Nullable MethodHandle HANDLE$vkGetBufferOpaqueCaptureAddress;
    public final @Nullable MethodHandle HANDLE$vkGetBufferDeviceAddress;
    public final @Nullable MethodHandle HANDLE$vkGetPhysicalDeviceSupportedFramebufferMixedSamplesCombinationsNV;
    public final @Nullable MethodHandle HANDLE$vkInitializePerformanceApiINTEL;
    public final @Nullable MethodHandle HANDLE$vkUninitializePerformanceApiINTEL;
    public final @Nullable MethodHandle HANDLE$vkCmdSetPerformanceMarkerINTEL;
    public final @Nullable MethodHandle HANDLE$vkCmdSetPerformanceStreamMarkerINTEL;
    public final @Nullable MethodHandle HANDLE$vkCmdSetPerformanceOverrideINTEL;
    public final @Nullable MethodHandle HANDLE$vkAcquirePerformanceConfigurationINTEL;
    public final @Nullable MethodHandle HANDLE$vkReleasePerformanceConfigurationINTEL;
    public final @Nullable MethodHandle HANDLE$vkQueueSetPerformanceConfigurationINTEL;
    public final @Nullable MethodHandle HANDLE$vkGetPerformanceParameterINTEL;
    public final @Nullable MethodHandle HANDLE$vkGetDeviceMemoryOpaqueCaptureAddress;
    public final @Nullable MethodHandle HANDLE$vkGetPipelineExecutablePropertiesKHR;
    public final @Nullable MethodHandle HANDLE$vkGetPipelineExecutableStatisticsKHR;
    public final @Nullable MethodHandle HANDLE$vkGetPipelineExecutableInternalRepresentationsKHR;
    public final @Nullable MethodHandle HANDLE$vkCmdSetLineStippleKHR;
    public final @Nullable MethodHandle HANDLE$vkCreateAccelerationStructureKHR;
    public final @Nullable MethodHandle HANDLE$vkCmdBuildAccelerationStructuresKHR;
    public final @Nullable MethodHandle HANDLE$vkCmdBuildAccelerationStructuresIndirectKHR;
    public final @Nullable MethodHandle HANDLE$vkBuildAccelerationStructuresKHR;
    public final @Nullable MethodHandle HANDLE$vkGetAccelerationStructureDeviceAddressKHR;
    public final @Nullable MethodHandle HANDLE$vkCreateDeferredOperationKHR;
    public final @Nullable MethodHandle HANDLE$vkDestroyDeferredOperationKHR;
    public final @Nullable MethodHandle HANDLE$vkGetDeferredOperationMaxConcurrencyKHR;
    public final @Nullable MethodHandle HANDLE$vkGetDeferredOperationResultKHR;
    public final @Nullable MethodHandle HANDLE$vkDeferredOperationJoinKHR;
    public final @Nullable MethodHandle HANDLE$vkGetPipelineIndirectMemoryRequirementsNV;
    public final @Nullable MethodHandle HANDLE$vkGetPipelineIndirectDeviceAddressNV;
    public final @Nullable MethodHandle HANDLE$vkAntiLagUpdateAMD;
    public final @Nullable MethodHandle HANDLE$vkCmdSetCullMode;
    public final @Nullable MethodHandle HANDLE$vkCmdSetFrontFace;
    public final @Nullable MethodHandle HANDLE$vkCmdSetPrimitiveTopology;
    public final @Nullable MethodHandle HANDLE$vkCmdSetViewportWithCount;
    public final @Nullable MethodHandle HANDLE$vkCmdSetScissorWithCount;
    public final @Nullable MethodHandle HANDLE$vkCmdBindIndexBuffer2KHR;
    public final @Nullable MethodHandle HANDLE$vkCmdBindVertexBuffers2;
    public final @Nullable MethodHandle HANDLE$vkCmdSetDepthTestEnable;
    public final @Nullable MethodHandle HANDLE$vkCmdSetDepthWriteEnable;
    public final @Nullable MethodHandle HANDLE$vkCmdSetDepthCompareOp;
    public final @Nullable MethodHandle HANDLE$vkCmdSetDepthBoundsTestEnable;
    public final @Nullable MethodHandle HANDLE$vkCmdSetStencilTestEnable;
    public final @Nullable MethodHandle HANDLE$vkCmdSetStencilOp;
    public final @Nullable MethodHandle HANDLE$vkCmdSetPatchControlPointsEXT;
    public final @Nullable MethodHandle HANDLE$vkCmdSetRasterizerDiscardEnable;
    public final @Nullable MethodHandle HANDLE$vkCmdSetDepthBiasEnable;
    public final @Nullable MethodHandle HANDLE$vkCmdSetLogicOpEXT;
    public final @Nullable MethodHandle HANDLE$vkCmdSetPrimitiveRestartEnable;
    public final @Nullable MethodHandle HANDLE$vkCmdSetTessellationDomainOriginEXT;
    public final @Nullable MethodHandle HANDLE$vkCmdSetDepthClampEnableEXT;
    public final @Nullable MethodHandle HANDLE$vkCmdSetPolygonModeEXT;
    public final @Nullable MethodHandle HANDLE$vkCmdSetRasterizationSamplesEXT;
    public final @Nullable MethodHandle HANDLE$vkCmdSetSampleMaskEXT;
    public final @Nullable MethodHandle HANDLE$vkCmdSetAlphaToCoverageEnableEXT;
    public final @Nullable MethodHandle HANDLE$vkCmdSetAlphaToOneEnableEXT;
    public final @Nullable MethodHandle HANDLE$vkCmdSetLogicOpEnableEXT;
    public final @Nullable MethodHandle HANDLE$vkCmdSetColorBlendEnableEXT;
    public final @Nullable MethodHandle HANDLE$vkCmdSetColorBlendEquationEXT;
    public final @Nullable MethodHandle HANDLE$vkCmdSetColorWriteMaskEXT;
    public final @Nullable MethodHandle HANDLE$vkCmdSetRasterizationStreamEXT;
    public final @Nullable MethodHandle HANDLE$vkCmdSetConservativeRasterizationModeEXT;
    public final @Nullable MethodHandle HANDLE$vkCmdSetExtraPrimitiveOverestimationSizeEXT;
    public final @Nullable MethodHandle HANDLE$vkCmdSetDepthClipEnableEXT;
    public final @Nullable MethodHandle HANDLE$vkCmdSetSampleLocationsEnableEXT;
    public final @Nullable MethodHandle HANDLE$vkCmdSetColorBlendAdvancedEXT;
    public final @Nullable MethodHandle HANDLE$vkCmdSetProvokingVertexModeEXT;
    public final @Nullable MethodHandle HANDLE$vkCmdSetLineRasterizationModeEXT;
    public final @Nullable MethodHandle HANDLE$vkCmdSetLineStippleEnableEXT;
    public final @Nullable MethodHandle HANDLE$vkCmdSetDepthClipNegativeOneToOneEXT;
    public final @Nullable MethodHandle HANDLE$vkCmdSetViewportWScalingEnableNV;
    public final @Nullable MethodHandle HANDLE$vkCmdSetViewportSwizzleNV;
    public final @Nullable MethodHandle HANDLE$vkCmdSetCoverageToColorEnableNV;
    public final @Nullable MethodHandle HANDLE$vkCmdSetCoverageToColorLocationNV;
    public final @Nullable MethodHandle HANDLE$vkCmdSetCoverageModulationModeNV;
    public final @Nullable MethodHandle HANDLE$vkCmdSetCoverageModulationTableEnableNV;
    public final @Nullable MethodHandle HANDLE$vkCmdSetCoverageModulationTableNV;
    public final @Nullable MethodHandle HANDLE$vkCmdSetShadingRateImageEnableNV;
    public final @Nullable MethodHandle HANDLE$vkCmdSetCoverageReductionModeNV;
    public final @Nullable MethodHandle HANDLE$vkCmdSetRepresentativeFragmentTestEnableNV;
    public final @Nullable MethodHandle HANDLE$vkCreatePrivateDataSlot;
    public final @Nullable MethodHandle HANDLE$vkDestroyPrivateDataSlot;
    public final @Nullable MethodHandle HANDLE$vkSetPrivateData;
    public final @Nullable MethodHandle HANDLE$vkGetPrivateData;
    public final @Nullable MethodHandle HANDLE$vkCmdCopyBuffer2;
    public final @Nullable MethodHandle HANDLE$vkCmdCopyImage2;
    public final @Nullable MethodHandle HANDLE$vkCmdBlitImage2;
    public final @Nullable MethodHandle HANDLE$vkCmdCopyBufferToImage2;
    public final @Nullable MethodHandle HANDLE$vkCmdCopyImageToBuffer2;
    public final @Nullable MethodHandle HANDLE$vkCmdResolveImage2;
    public final @Nullable MethodHandle HANDLE$vkCmdRefreshObjectsKHR;
    public final @Nullable MethodHandle HANDLE$vkGetPhysicalDeviceRefreshableObjectTypesKHR;
    public final @Nullable MethodHandle HANDLE$vkCmdSetFragmentShadingRateKHR;
    public final @Nullable MethodHandle HANDLE$vkGetPhysicalDeviceFragmentShadingRatesKHR;
    public final @Nullable MethodHandle HANDLE$vkCmdSetFragmentShadingRateEnumNV;
    public final @Nullable MethodHandle HANDLE$vkGetAccelerationStructureBuildSizesKHR;
    public final @Nullable MethodHandle HANDLE$vkCmdSetVertexInputEXT;
    public final @Nullable MethodHandle HANDLE$vkCmdSetColorWriteEnableEXT;
    public final @Nullable MethodHandle HANDLE$vkCmdSetEvent2;
    public final @Nullable MethodHandle HANDLE$vkCmdResetEvent2;
    public final @Nullable MethodHandle HANDLE$vkCmdWaitEvents2;
    public final @Nullable MethodHandle HANDLE$vkCmdPipelineBarrier2;
    public final @Nullable MethodHandle HANDLE$vkQueueSubmit2;
    public final @Nullable MethodHandle HANDLE$vkCmdWriteTimestamp2;
    public final @Nullable MethodHandle HANDLE$vkCmdWriteBufferMarker2AMD;
    public final @Nullable MethodHandle HANDLE$vkGetQueueCheckpointData2NV;
    public final @Nullable MethodHandle HANDLE$vkCopyMemoryToImageEXT;
    public final @Nullable MethodHandle HANDLE$vkCopyImageToMemoryEXT;
    public final @Nullable MethodHandle HANDLE$vkCopyImageToImageEXT;
    public final @Nullable MethodHandle HANDLE$vkTransitionImageLayoutEXT;
    public final @Nullable MethodHandle HANDLE$vkCmdDecompressMemoryNV;
    public final @Nullable MethodHandle HANDLE$vkCmdDecompressMemoryIndirectCountNV;
    public final @Nullable MethodHandle HANDLE$vkCreateCuModuleNVX;
    public final @Nullable MethodHandle HANDLE$vkCreateCuFunctionNVX;
    public final @Nullable MethodHandle HANDLE$vkDestroyCuModuleNVX;
    public final @Nullable MethodHandle HANDLE$vkDestroyCuFunctionNVX;
    public final @Nullable MethodHandle HANDLE$vkCmdCuLaunchKernelNVX;
    public final @Nullable MethodHandle HANDLE$vkGetDescriptorSetLayoutSizeEXT;
    public final @Nullable MethodHandle HANDLE$vkGetDescriptorSetLayoutBindingOffsetEXT;
    public final @Nullable MethodHandle HANDLE$vkGetDescriptorEXT;
    public final @Nullable MethodHandle HANDLE$vkCmdBindDescriptorBuffersEXT;
    public final @Nullable MethodHandle HANDLE$vkCmdSetDescriptorBufferOffsetsEXT;
    public final @Nullable MethodHandle HANDLE$vkCmdBindDescriptorBufferEmbeddedSamplersEXT;
    public final @Nullable MethodHandle HANDLE$vkGetBufferOpaqueCaptureDescriptorDataEXT;
    public final @Nullable MethodHandle HANDLE$vkGetImageOpaqueCaptureDescriptorDataEXT;
    public final @Nullable MethodHandle HANDLE$vkGetImageViewOpaqueCaptureDescriptorDataEXT;
    public final @Nullable MethodHandle HANDLE$vkGetSamplerOpaqueCaptureDescriptorDataEXT;
    public final @Nullable MethodHandle HANDLE$vkGetAccelerationStructureOpaqueCaptureDescriptorDataEXT;
    public final @Nullable MethodHandle HANDLE$vkSetDeviceMemoryPriorityEXT;
    public final @Nullable MethodHandle HANDLE$vkWaitForPresentKHR;
    public final @Nullable MethodHandle HANDLE$vkCreateBufferCollectionFUCHSIA;
    public final @Nullable MethodHandle HANDLE$vkSetBufferCollectionBufferConstraintsFUCHSIA;
    public final @Nullable MethodHandle HANDLE$vkSetBufferCollectionImageConstraintsFUCHSIA;
    public final @Nullable MethodHandle HANDLE$vkDestroyBufferCollectionFUCHSIA;
    public final @Nullable MethodHandle HANDLE$vkGetBufferCollectionPropertiesFUCHSIA;
    public final @Nullable MethodHandle HANDLE$vkCreateCudaModuleNV;
    public final @Nullable MethodHandle HANDLE$vkGetCudaModuleCacheNV;
    public final @Nullable MethodHandle HANDLE$vkCreateCudaFunctionNV;
    public final @Nullable MethodHandle HANDLE$vkDestroyCudaModuleNV;
    public final @Nullable MethodHandle HANDLE$vkDestroyCudaFunctionNV;
    public final @Nullable MethodHandle HANDLE$vkCmdCudaLaunchKernelNV;
    public final @Nullable MethodHandle HANDLE$vkCmdBeginRendering;
    public final @Nullable MethodHandle HANDLE$vkCmdEndRendering;
    public final @Nullable MethodHandle HANDLE$vkGetDescriptorSetLayoutHostMappingInfoVALVE;
    public final @Nullable MethodHandle HANDLE$vkGetDescriptorSetHostMappingVALVE;
    public final @Nullable MethodHandle HANDLE$vkCreateMicromapEXT;
    public final @Nullable MethodHandle HANDLE$vkCmdBuildMicromapsEXT;
    public final @Nullable MethodHandle HANDLE$vkBuildMicromapsEXT;
    public final @Nullable MethodHandle HANDLE$vkDestroyMicromapEXT;
    public final @Nullable MethodHandle HANDLE$vkCmdCopyMicromapEXT;
    public final @Nullable MethodHandle HANDLE$vkCopyMicromapEXT;
    public final @Nullable MethodHandle HANDLE$vkCmdCopyMicromapToMemoryEXT;
    public final @Nullable MethodHandle HANDLE$vkCopyMicromapToMemoryEXT;
    public final @Nullable MethodHandle HANDLE$vkCmdCopyMemoryToMicromapEXT;
    public final @Nullable MethodHandle HANDLE$vkCopyMemoryToMicromapEXT;
    public final @Nullable MethodHandle HANDLE$vkCmdWriteMicromapsPropertiesEXT;
    public final @Nullable MethodHandle HANDLE$vkWriteMicromapsPropertiesEXT;
    public final @Nullable MethodHandle HANDLE$vkGetDeviceMicromapCompatibilityEXT;
    public final @Nullable MethodHandle HANDLE$vkGetMicromapBuildSizesEXT;
    public final @Nullable MethodHandle HANDLE$vkGetShaderModuleIdentifierEXT;
    public final @Nullable MethodHandle HANDLE$vkGetShaderModuleCreateInfoIdentifierEXT;
    public final @Nullable MethodHandle HANDLE$vkGetImageSubresourceLayout2KHR;
    public final @Nullable MethodHandle HANDLE$vkGetPipelinePropertiesEXT;
    public final @Nullable MethodHandle HANDLE$vkExportMetalObjectsEXT;
    public final @Nullable MethodHandle HANDLE$vkGetFramebufferTilePropertiesQCOM;
    public final @Nullable MethodHandle HANDLE$vkGetDynamicRenderingTilePropertiesQCOM;
    public final @Nullable MethodHandle HANDLE$vkGetPhysicalDeviceOpticalFlowImageFormatsNV;
    public final @Nullable MethodHandle HANDLE$vkCreateOpticalFlowSessionNV;
    public final @Nullable MethodHandle HANDLE$vkDestroyOpticalFlowSessionNV;
    public final @Nullable MethodHandle HANDLE$vkBindOpticalFlowSessionImageNV;
    public final @Nullable MethodHandle HANDLE$vkCmdOpticalFlowExecuteNV;
    public final @Nullable MethodHandle HANDLE$vkGetDeviceFaultInfoEXT;
    public final @Nullable MethodHandle HANDLE$vkCmdSetDepthBias2EXT;
    public final @Nullable MethodHandle HANDLE$vkReleaseSwapchainImagesEXT;
    public final @Nullable MethodHandle HANDLE$vkGetDeviceImageSubresourceLayoutKHR;
    public final @Nullable MethodHandle HANDLE$vkMapMemory2KHR;
    public final @Nullable MethodHandle HANDLE$vkUnmapMemory2KHR;
    public final @Nullable MethodHandle HANDLE$vkCreateShadersEXT;
    public final @Nullable MethodHandle HANDLE$vkDestroyShaderEXT;
    public final @Nullable MethodHandle HANDLE$vkGetShaderBinaryDataEXT;
    public final @Nullable MethodHandle HANDLE$vkCmdBindShadersEXT;
    public final @Nullable MethodHandle HANDLE$vkGetScreenBufferPropertiesQNX;
    public final @Nullable MethodHandle HANDLE$vkGetPhysicalDeviceCooperativeMatrixPropertiesKHR;
    public final @Nullable MethodHandle HANDLE$vkGetExecutionGraphPipelineScratchSizeAMDX;
    public final @Nullable MethodHandle HANDLE$vkGetExecutionGraphPipelineNodeIndexAMDX;
    public final @Nullable MethodHandle HANDLE$vkCreateExecutionGraphPipelinesAMDX;
    public final @Nullable MethodHandle HANDLE$vkCmdInitializeGraphScratchMemoryAMDX;
    public final @Nullable MethodHandle HANDLE$vkCmdDispatchGraphAMDX;
    public final @Nullable MethodHandle HANDLE$vkCmdDispatchGraphIndirectAMDX;
    public final @Nullable MethodHandle HANDLE$vkCmdDispatchGraphIndirectCountAMDX;
    public final @Nullable MethodHandle HANDLE$vkCmdBindDescriptorSets2KHR;
    public final @Nullable MethodHandle HANDLE$vkCmdPushConstants2KHR;
    public final @Nullable MethodHandle HANDLE$vkCmdPushDescriptorSet2KHR;
    public final @Nullable MethodHandle HANDLE$vkCmdPushDescriptorSetWithTemplate2KHR;
    public final @Nullable MethodHandle HANDLE$vkCmdSetDescriptorBufferOffsets2EXT;
    public final @Nullable MethodHandle HANDLE$vkCmdBindDescriptorBufferEmbeddedSamplers2EXT;
    public final @Nullable MethodHandle HANDLE$vkSetLatencySleepModeNV;
    public final @Nullable MethodHandle HANDLE$vkLatencySleepNV;
    public final @Nullable MethodHandle HANDLE$vkSetLatencyMarkerNV;
    public final @Nullable MethodHandle HANDLE$vkGetLatencyTimingsNV;
    public final @Nullable MethodHandle HANDLE$vkQueueNotifyOutOfBandNV;
    public final @Nullable MethodHandle HANDLE$vkCmdSetRenderingAttachmentLocationsKHR;
    public final @Nullable MethodHandle HANDLE$vkCmdSetRenderingInputAttachmentIndicesKHR;

    public DeviceCommands(RawFunctionLoader loader, RawFunctionLoader instanceLoader) {
        SEGMENT$vkDestroyDevice = loader.apply("vkDestroyDevice");
        HANDLE$vkDestroyDevice = RawFunctionLoader.link(SEGMENT$vkDestroyDevice, DESCRIPTOR$vkDestroyDevice);
        SEGMENT$vkGetDeviceQueue = loader.apply("vkGetDeviceQueue");
        HANDLE$vkGetDeviceQueue = RawFunctionLoader.link(SEGMENT$vkGetDeviceQueue, DESCRIPTOR$vkGetDeviceQueue);
        SEGMENT$vkQueueSubmit = loader.apply("vkQueueSubmit");
        HANDLE$vkQueueSubmit = RawFunctionLoader.link(SEGMENT$vkQueueSubmit, DESCRIPTOR$vkQueueSubmit);
        SEGMENT$vkQueueWaitIdle = loader.apply("vkQueueWaitIdle");
        HANDLE$vkQueueWaitIdle = RawFunctionLoader.link(SEGMENT$vkQueueWaitIdle, DESCRIPTOR$vkQueueWaitIdle);
        SEGMENT$vkDeviceWaitIdle = loader.apply("vkDeviceWaitIdle");
        HANDLE$vkDeviceWaitIdle = RawFunctionLoader.link(SEGMENT$vkDeviceWaitIdle, DESCRIPTOR$vkDeviceWaitIdle);
        SEGMENT$vkAllocateMemory = loader.apply("vkAllocateMemory");
        HANDLE$vkAllocateMemory = RawFunctionLoader.link(SEGMENT$vkAllocateMemory, DESCRIPTOR$vkAllocateMemory);
        SEGMENT$vkFreeMemory = loader.apply("vkFreeMemory");
        HANDLE$vkFreeMemory = RawFunctionLoader.link(SEGMENT$vkFreeMemory, DESCRIPTOR$vkFreeMemory);
        SEGMENT$vkMapMemory = loader.apply("vkMapMemory");
        HANDLE$vkMapMemory = RawFunctionLoader.link(SEGMENT$vkMapMemory, DESCRIPTOR$vkMapMemory);
        SEGMENT$vkUnmapMemory = loader.apply("vkUnmapMemory");
        HANDLE$vkUnmapMemory = RawFunctionLoader.link(SEGMENT$vkUnmapMemory, DESCRIPTOR$vkUnmapMemory);
        SEGMENT$vkFlushMappedMemoryRanges = loader.apply("vkFlushMappedMemoryRanges");
        HANDLE$vkFlushMappedMemoryRanges = RawFunctionLoader.link(SEGMENT$vkFlushMappedMemoryRanges, DESCRIPTOR$vkFlushMappedMemoryRanges);
        SEGMENT$vkInvalidateMappedMemoryRanges = loader.apply("vkInvalidateMappedMemoryRanges");
        HANDLE$vkInvalidateMappedMemoryRanges = RawFunctionLoader.link(SEGMENT$vkInvalidateMappedMemoryRanges, DESCRIPTOR$vkInvalidateMappedMemoryRanges);
        SEGMENT$vkGetDeviceMemoryCommitment = loader.apply("vkGetDeviceMemoryCommitment");
        HANDLE$vkGetDeviceMemoryCommitment = RawFunctionLoader.link(SEGMENT$vkGetDeviceMemoryCommitment, DESCRIPTOR$vkGetDeviceMemoryCommitment);
        SEGMENT$vkGetBufferMemoryRequirements = loader.apply("vkGetBufferMemoryRequirements");
        HANDLE$vkGetBufferMemoryRequirements = RawFunctionLoader.link(SEGMENT$vkGetBufferMemoryRequirements, DESCRIPTOR$vkGetBufferMemoryRequirements);
        SEGMENT$vkBindBufferMemory = loader.apply("vkBindBufferMemory");
        HANDLE$vkBindBufferMemory = RawFunctionLoader.link(SEGMENT$vkBindBufferMemory, DESCRIPTOR$vkBindBufferMemory);
        SEGMENT$vkGetImageMemoryRequirements = loader.apply("vkGetImageMemoryRequirements");
        HANDLE$vkGetImageMemoryRequirements = RawFunctionLoader.link(SEGMENT$vkGetImageMemoryRequirements, DESCRIPTOR$vkGetImageMemoryRequirements);
        SEGMENT$vkBindImageMemory = loader.apply("vkBindImageMemory");
        HANDLE$vkBindImageMemory = RawFunctionLoader.link(SEGMENT$vkBindImageMemory, DESCRIPTOR$vkBindImageMemory);
        SEGMENT$vkGetImageSparseMemoryRequirements = loader.apply("vkGetImageSparseMemoryRequirements");
        HANDLE$vkGetImageSparseMemoryRequirements = RawFunctionLoader.link(SEGMENT$vkGetImageSparseMemoryRequirements, DESCRIPTOR$vkGetImageSparseMemoryRequirements);
        SEGMENT$vkQueueBindSparse = loader.apply("vkQueueBindSparse");
        HANDLE$vkQueueBindSparse = RawFunctionLoader.link(SEGMENT$vkQueueBindSparse, DESCRIPTOR$vkQueueBindSparse);
        SEGMENT$vkCreateFence = loader.apply("vkCreateFence");
        HANDLE$vkCreateFence = RawFunctionLoader.link(SEGMENT$vkCreateFence, DESCRIPTOR$vkCreateFence);
        SEGMENT$vkDestroyFence = loader.apply("vkDestroyFence");
        HANDLE$vkDestroyFence = RawFunctionLoader.link(SEGMENT$vkDestroyFence, DESCRIPTOR$vkDestroyFence);
        SEGMENT$vkResetFences = loader.apply("vkResetFences");
        HANDLE$vkResetFences = RawFunctionLoader.link(SEGMENT$vkResetFences, DESCRIPTOR$vkResetFences);
        SEGMENT$vkGetFenceStatus = loader.apply("vkGetFenceStatus");
        HANDLE$vkGetFenceStatus = RawFunctionLoader.link(SEGMENT$vkGetFenceStatus, DESCRIPTOR$vkGetFenceStatus);
        SEGMENT$vkWaitForFences = loader.apply("vkWaitForFences");
        HANDLE$vkWaitForFences = RawFunctionLoader.link(SEGMENT$vkWaitForFences, DESCRIPTOR$vkWaitForFences);
        SEGMENT$vkCreateSemaphore = loader.apply("vkCreateSemaphore");
        HANDLE$vkCreateSemaphore = RawFunctionLoader.link(SEGMENT$vkCreateSemaphore, DESCRIPTOR$vkCreateSemaphore);
        SEGMENT$vkDestroySemaphore = loader.apply("vkDestroySemaphore");
        HANDLE$vkDestroySemaphore = RawFunctionLoader.link(SEGMENT$vkDestroySemaphore, DESCRIPTOR$vkDestroySemaphore);
        SEGMENT$vkCreateEvent = loader.apply("vkCreateEvent");
        HANDLE$vkCreateEvent = RawFunctionLoader.link(SEGMENT$vkCreateEvent, DESCRIPTOR$vkCreateEvent);
        SEGMENT$vkDestroyEvent = loader.apply("vkDestroyEvent");
        HANDLE$vkDestroyEvent = RawFunctionLoader.link(SEGMENT$vkDestroyEvent, DESCRIPTOR$vkDestroyEvent);
        SEGMENT$vkGetEventStatus = loader.apply("vkGetEventStatus");
        HANDLE$vkGetEventStatus = RawFunctionLoader.link(SEGMENT$vkGetEventStatus, DESCRIPTOR$vkGetEventStatus);
        SEGMENT$vkSetEvent = loader.apply("vkSetEvent");
        HANDLE$vkSetEvent = RawFunctionLoader.link(SEGMENT$vkSetEvent, DESCRIPTOR$vkSetEvent);
        SEGMENT$vkResetEvent = loader.apply("vkResetEvent");
        HANDLE$vkResetEvent = RawFunctionLoader.link(SEGMENT$vkResetEvent, DESCRIPTOR$vkResetEvent);
        SEGMENT$vkCreateQueryPool = loader.apply("vkCreateQueryPool");
        HANDLE$vkCreateQueryPool = RawFunctionLoader.link(SEGMENT$vkCreateQueryPool, DESCRIPTOR$vkCreateQueryPool);
        SEGMENT$vkDestroyQueryPool = loader.apply("vkDestroyQueryPool");
        HANDLE$vkDestroyQueryPool = RawFunctionLoader.link(SEGMENT$vkDestroyQueryPool, DESCRIPTOR$vkDestroyQueryPool);
        SEGMENT$vkGetQueryPoolResults = loader.apply("vkGetQueryPoolResults");
        HANDLE$vkGetQueryPoolResults = RawFunctionLoader.link(SEGMENT$vkGetQueryPoolResults, DESCRIPTOR$vkGetQueryPoolResults);
        SEGMENT$vkResetQueryPool = loader.apply("vkResetQueryPool");
        HANDLE$vkResetQueryPool = RawFunctionLoader.link(SEGMENT$vkResetQueryPool, DESCRIPTOR$vkResetQueryPool);
        SEGMENT$vkCreateBuffer = loader.apply("vkCreateBuffer");
        HANDLE$vkCreateBuffer = RawFunctionLoader.link(SEGMENT$vkCreateBuffer, DESCRIPTOR$vkCreateBuffer);
        SEGMENT$vkDestroyBuffer = loader.apply("vkDestroyBuffer");
        HANDLE$vkDestroyBuffer = RawFunctionLoader.link(SEGMENT$vkDestroyBuffer, DESCRIPTOR$vkDestroyBuffer);
        SEGMENT$vkCreateBufferView = loader.apply("vkCreateBufferView");
        HANDLE$vkCreateBufferView = RawFunctionLoader.link(SEGMENT$vkCreateBufferView, DESCRIPTOR$vkCreateBufferView);
        SEGMENT$vkDestroyBufferView = loader.apply("vkDestroyBufferView");
        HANDLE$vkDestroyBufferView = RawFunctionLoader.link(SEGMENT$vkDestroyBufferView, DESCRIPTOR$vkDestroyBufferView);
        SEGMENT$vkCreateImage = loader.apply("vkCreateImage");
        HANDLE$vkCreateImage = RawFunctionLoader.link(SEGMENT$vkCreateImage, DESCRIPTOR$vkCreateImage);
        SEGMENT$vkDestroyImage = loader.apply("vkDestroyImage");
        HANDLE$vkDestroyImage = RawFunctionLoader.link(SEGMENT$vkDestroyImage, DESCRIPTOR$vkDestroyImage);
        SEGMENT$vkGetImageSubresourceLayout = loader.apply("vkGetImageSubresourceLayout");
        HANDLE$vkGetImageSubresourceLayout = RawFunctionLoader.link(SEGMENT$vkGetImageSubresourceLayout, DESCRIPTOR$vkGetImageSubresourceLayout);
        SEGMENT$vkCreateImageView = loader.apply("vkCreateImageView");
        HANDLE$vkCreateImageView = RawFunctionLoader.link(SEGMENT$vkCreateImageView, DESCRIPTOR$vkCreateImageView);
        SEGMENT$vkDestroyImageView = loader.apply("vkDestroyImageView");
        HANDLE$vkDestroyImageView = RawFunctionLoader.link(SEGMENT$vkDestroyImageView, DESCRIPTOR$vkDestroyImageView);
        SEGMENT$vkCreateShaderModule = loader.apply("vkCreateShaderModule");
        HANDLE$vkCreateShaderModule = RawFunctionLoader.link(SEGMENT$vkCreateShaderModule, DESCRIPTOR$vkCreateShaderModule);
        SEGMENT$vkDestroyShaderModule = loader.apply("vkDestroyShaderModule");
        HANDLE$vkDestroyShaderModule = RawFunctionLoader.link(SEGMENT$vkDestroyShaderModule, DESCRIPTOR$vkDestroyShaderModule);
        SEGMENT$vkCreatePipelineCache = loader.apply("vkCreatePipelineCache");
        HANDLE$vkCreatePipelineCache = RawFunctionLoader.link(SEGMENT$vkCreatePipelineCache, DESCRIPTOR$vkCreatePipelineCache);
        SEGMENT$vkDestroyPipelineCache = loader.apply("vkDestroyPipelineCache");
        HANDLE$vkDestroyPipelineCache = RawFunctionLoader.link(SEGMENT$vkDestroyPipelineCache, DESCRIPTOR$vkDestroyPipelineCache);
        SEGMENT$vkGetPipelineCacheData = loader.apply("vkGetPipelineCacheData");
        HANDLE$vkGetPipelineCacheData = RawFunctionLoader.link(SEGMENT$vkGetPipelineCacheData, DESCRIPTOR$vkGetPipelineCacheData);
        SEGMENT$vkMergePipelineCaches = loader.apply("vkMergePipelineCaches");
        HANDLE$vkMergePipelineCaches = RawFunctionLoader.link(SEGMENT$vkMergePipelineCaches, DESCRIPTOR$vkMergePipelineCaches);
        SEGMENT$vkCreatePipelineBinariesKHR = loader.apply("vkCreatePipelineBinariesKHR");
        HANDLE$vkCreatePipelineBinariesKHR = RawFunctionLoader.link(SEGMENT$vkCreatePipelineBinariesKHR, DESCRIPTOR$vkCreatePipelineBinariesKHR);
        SEGMENT$vkDestroyPipelineBinaryKHR = loader.apply("vkDestroyPipelineBinaryKHR");
        HANDLE$vkDestroyPipelineBinaryKHR = RawFunctionLoader.link(SEGMENT$vkDestroyPipelineBinaryKHR, DESCRIPTOR$vkDestroyPipelineBinaryKHR);
        SEGMENT$vkGetPipelineKeyKHR = loader.apply("vkGetPipelineKeyKHR");
        HANDLE$vkGetPipelineKeyKHR = RawFunctionLoader.link(SEGMENT$vkGetPipelineKeyKHR, DESCRIPTOR$vkGetPipelineKeyKHR);
        SEGMENT$vkGetPipelineBinaryDataKHR = loader.apply("vkGetPipelineBinaryDataKHR");
        HANDLE$vkGetPipelineBinaryDataKHR = RawFunctionLoader.link(SEGMENT$vkGetPipelineBinaryDataKHR, DESCRIPTOR$vkGetPipelineBinaryDataKHR);
        SEGMENT$vkReleaseCapturedPipelineDataKHR = loader.apply("vkReleaseCapturedPipelineDataKHR");
        HANDLE$vkReleaseCapturedPipelineDataKHR = RawFunctionLoader.link(SEGMENT$vkReleaseCapturedPipelineDataKHR, DESCRIPTOR$vkReleaseCapturedPipelineDataKHR);
        SEGMENT$vkCreateGraphicsPipelines = loader.apply("vkCreateGraphicsPipelines");
        HANDLE$vkCreateGraphicsPipelines = RawFunctionLoader.link(SEGMENT$vkCreateGraphicsPipelines, DESCRIPTOR$vkCreateGraphicsPipelines);
        SEGMENT$vkCreateComputePipelines = loader.apply("vkCreateComputePipelines");
        HANDLE$vkCreateComputePipelines = RawFunctionLoader.link(SEGMENT$vkCreateComputePipelines, DESCRIPTOR$vkCreateComputePipelines);
        SEGMENT$vkGetDeviceSubpassShadingMaxWorkgroupSizeHUAWEI = loader.apply("vkGetDeviceSubpassShadingMaxWorkgroupSizeHUAWEI");
        HANDLE$vkGetDeviceSubpassShadingMaxWorkgroupSizeHUAWEI = RawFunctionLoader.link(SEGMENT$vkGetDeviceSubpassShadingMaxWorkgroupSizeHUAWEI, DESCRIPTOR$vkGetDeviceSubpassShadingMaxWorkgroupSizeHUAWEI);
        SEGMENT$vkDestroyPipeline = loader.apply("vkDestroyPipeline");
        HANDLE$vkDestroyPipeline = RawFunctionLoader.link(SEGMENT$vkDestroyPipeline, DESCRIPTOR$vkDestroyPipeline);
        SEGMENT$vkCreatePipelineLayout = loader.apply("vkCreatePipelineLayout");
        HANDLE$vkCreatePipelineLayout = RawFunctionLoader.link(SEGMENT$vkCreatePipelineLayout, DESCRIPTOR$vkCreatePipelineLayout);
        SEGMENT$vkDestroyPipelineLayout = loader.apply("vkDestroyPipelineLayout");
        HANDLE$vkDestroyPipelineLayout = RawFunctionLoader.link(SEGMENT$vkDestroyPipelineLayout, DESCRIPTOR$vkDestroyPipelineLayout);
        SEGMENT$vkCreateSampler = loader.apply("vkCreateSampler");
        HANDLE$vkCreateSampler = RawFunctionLoader.link(SEGMENT$vkCreateSampler, DESCRIPTOR$vkCreateSampler);
        SEGMENT$vkDestroySampler = loader.apply("vkDestroySampler");
        HANDLE$vkDestroySampler = RawFunctionLoader.link(SEGMENT$vkDestroySampler, DESCRIPTOR$vkDestroySampler);
        SEGMENT$vkCreateDescriptorSetLayout = loader.apply("vkCreateDescriptorSetLayout");
        HANDLE$vkCreateDescriptorSetLayout = RawFunctionLoader.link(SEGMENT$vkCreateDescriptorSetLayout, DESCRIPTOR$vkCreateDescriptorSetLayout);
        SEGMENT$vkDestroyDescriptorSetLayout = loader.apply("vkDestroyDescriptorSetLayout");
        HANDLE$vkDestroyDescriptorSetLayout = RawFunctionLoader.link(SEGMENT$vkDestroyDescriptorSetLayout, DESCRIPTOR$vkDestroyDescriptorSetLayout);
        SEGMENT$vkCreateDescriptorPool = loader.apply("vkCreateDescriptorPool");
        HANDLE$vkCreateDescriptorPool = RawFunctionLoader.link(SEGMENT$vkCreateDescriptorPool, DESCRIPTOR$vkCreateDescriptorPool);
        SEGMENT$vkDestroyDescriptorPool = loader.apply("vkDestroyDescriptorPool");
        HANDLE$vkDestroyDescriptorPool = RawFunctionLoader.link(SEGMENT$vkDestroyDescriptorPool, DESCRIPTOR$vkDestroyDescriptorPool);
        SEGMENT$vkResetDescriptorPool = loader.apply("vkResetDescriptorPool");
        HANDLE$vkResetDescriptorPool = RawFunctionLoader.link(SEGMENT$vkResetDescriptorPool, DESCRIPTOR$vkResetDescriptorPool);
        SEGMENT$vkAllocateDescriptorSets = loader.apply("vkAllocateDescriptorSets");
        HANDLE$vkAllocateDescriptorSets = RawFunctionLoader.link(SEGMENT$vkAllocateDescriptorSets, DESCRIPTOR$vkAllocateDescriptorSets);
        SEGMENT$vkFreeDescriptorSets = loader.apply("vkFreeDescriptorSets");
        HANDLE$vkFreeDescriptorSets = RawFunctionLoader.link(SEGMENT$vkFreeDescriptorSets, DESCRIPTOR$vkFreeDescriptorSets);
        SEGMENT$vkUpdateDescriptorSets = loader.apply("vkUpdateDescriptorSets");
        HANDLE$vkUpdateDescriptorSets = RawFunctionLoader.link(SEGMENT$vkUpdateDescriptorSets, DESCRIPTOR$vkUpdateDescriptorSets);
        SEGMENT$vkCreateFramebuffer = loader.apply("vkCreateFramebuffer");
        HANDLE$vkCreateFramebuffer = RawFunctionLoader.link(SEGMENT$vkCreateFramebuffer, DESCRIPTOR$vkCreateFramebuffer);
        SEGMENT$vkDestroyFramebuffer = loader.apply("vkDestroyFramebuffer");
        HANDLE$vkDestroyFramebuffer = RawFunctionLoader.link(SEGMENT$vkDestroyFramebuffer, DESCRIPTOR$vkDestroyFramebuffer);
        SEGMENT$vkCreateRenderPass = loader.apply("vkCreateRenderPass");
        HANDLE$vkCreateRenderPass = RawFunctionLoader.link(SEGMENT$vkCreateRenderPass, DESCRIPTOR$vkCreateRenderPass);
        SEGMENT$vkDestroyRenderPass = loader.apply("vkDestroyRenderPass");
        HANDLE$vkDestroyRenderPass = RawFunctionLoader.link(SEGMENT$vkDestroyRenderPass, DESCRIPTOR$vkDestroyRenderPass);
        SEGMENT$vkGetRenderAreaGranularity = loader.apply("vkGetRenderAreaGranularity");
        HANDLE$vkGetRenderAreaGranularity = RawFunctionLoader.link(SEGMENT$vkGetRenderAreaGranularity, DESCRIPTOR$vkGetRenderAreaGranularity);
        SEGMENT$vkGetRenderingAreaGranularityKHR = loader.apply("vkGetRenderingAreaGranularityKHR");
        HANDLE$vkGetRenderingAreaGranularityKHR = RawFunctionLoader.link(SEGMENT$vkGetRenderingAreaGranularityKHR, DESCRIPTOR$vkGetRenderingAreaGranularityKHR);
        SEGMENT$vkCreateCommandPool = loader.apply("vkCreateCommandPool");
        HANDLE$vkCreateCommandPool = RawFunctionLoader.link(SEGMENT$vkCreateCommandPool, DESCRIPTOR$vkCreateCommandPool);
        SEGMENT$vkDestroyCommandPool = loader.apply("vkDestroyCommandPool");
        HANDLE$vkDestroyCommandPool = RawFunctionLoader.link(SEGMENT$vkDestroyCommandPool, DESCRIPTOR$vkDestroyCommandPool);
        SEGMENT$vkResetCommandPool = loader.apply("vkResetCommandPool");
        HANDLE$vkResetCommandPool = RawFunctionLoader.link(SEGMENT$vkResetCommandPool, DESCRIPTOR$vkResetCommandPool);
        SEGMENT$vkAllocateCommandBuffers = loader.apply("vkAllocateCommandBuffers");
        HANDLE$vkAllocateCommandBuffers = RawFunctionLoader.link(SEGMENT$vkAllocateCommandBuffers, DESCRIPTOR$vkAllocateCommandBuffers);
        SEGMENT$vkFreeCommandBuffers = loader.apply("vkFreeCommandBuffers");
        HANDLE$vkFreeCommandBuffers = RawFunctionLoader.link(SEGMENT$vkFreeCommandBuffers, DESCRIPTOR$vkFreeCommandBuffers);
        SEGMENT$vkBeginCommandBuffer = loader.apply("vkBeginCommandBuffer");
        HANDLE$vkBeginCommandBuffer = RawFunctionLoader.link(SEGMENT$vkBeginCommandBuffer, DESCRIPTOR$vkBeginCommandBuffer);
        SEGMENT$vkEndCommandBuffer = loader.apply("vkEndCommandBuffer");
        HANDLE$vkEndCommandBuffer = RawFunctionLoader.link(SEGMENT$vkEndCommandBuffer, DESCRIPTOR$vkEndCommandBuffer);
        SEGMENT$vkResetCommandBuffer = loader.apply("vkResetCommandBuffer");
        HANDLE$vkResetCommandBuffer = RawFunctionLoader.link(SEGMENT$vkResetCommandBuffer, DESCRIPTOR$vkResetCommandBuffer);
        SEGMENT$vkCmdBindPipeline = loader.apply("vkCmdBindPipeline");
        HANDLE$vkCmdBindPipeline = RawFunctionLoader.link(SEGMENT$vkCmdBindPipeline, DESCRIPTOR$vkCmdBindPipeline);
        SEGMENT$vkCmdSetAttachmentFeedbackLoopEnableEXT = loader.apply("vkCmdSetAttachmentFeedbackLoopEnableEXT");
        HANDLE$vkCmdSetAttachmentFeedbackLoopEnableEXT = RawFunctionLoader.link(SEGMENT$vkCmdSetAttachmentFeedbackLoopEnableEXT, DESCRIPTOR$vkCmdSetAttachmentFeedbackLoopEnableEXT);
        SEGMENT$vkCmdSetViewport = loader.apply("vkCmdSetViewport");
        HANDLE$vkCmdSetViewport = RawFunctionLoader.link(SEGMENT$vkCmdSetViewport, DESCRIPTOR$vkCmdSetViewport);
        SEGMENT$vkCmdSetScissor = loader.apply("vkCmdSetScissor");
        HANDLE$vkCmdSetScissor = RawFunctionLoader.link(SEGMENT$vkCmdSetScissor, DESCRIPTOR$vkCmdSetScissor);
        SEGMENT$vkCmdSetLineWidth = loader.apply("vkCmdSetLineWidth");
        HANDLE$vkCmdSetLineWidth = RawFunctionLoader.link(SEGMENT$vkCmdSetLineWidth, DESCRIPTOR$vkCmdSetLineWidth);
        SEGMENT$vkCmdSetDepthBias = loader.apply("vkCmdSetDepthBias");
        HANDLE$vkCmdSetDepthBias = RawFunctionLoader.link(SEGMENT$vkCmdSetDepthBias, DESCRIPTOR$vkCmdSetDepthBias);
        SEGMENT$vkCmdSetBlendConstants = loader.apply("vkCmdSetBlendConstants");
        HANDLE$vkCmdSetBlendConstants = RawFunctionLoader.link(SEGMENT$vkCmdSetBlendConstants, DESCRIPTOR$vkCmdSetBlendConstants);
        SEGMENT$vkCmdSetDepthBounds = loader.apply("vkCmdSetDepthBounds");
        HANDLE$vkCmdSetDepthBounds = RawFunctionLoader.link(SEGMENT$vkCmdSetDepthBounds, DESCRIPTOR$vkCmdSetDepthBounds);
        SEGMENT$vkCmdSetStencilCompareMask = loader.apply("vkCmdSetStencilCompareMask");
        HANDLE$vkCmdSetStencilCompareMask = RawFunctionLoader.link(SEGMENT$vkCmdSetStencilCompareMask, DESCRIPTOR$vkCmdSetStencilCompareMask);
        SEGMENT$vkCmdSetStencilWriteMask = loader.apply("vkCmdSetStencilWriteMask");
        HANDLE$vkCmdSetStencilWriteMask = RawFunctionLoader.link(SEGMENT$vkCmdSetStencilWriteMask, DESCRIPTOR$vkCmdSetStencilWriteMask);
        SEGMENT$vkCmdSetStencilReference = loader.apply("vkCmdSetStencilReference");
        HANDLE$vkCmdSetStencilReference = RawFunctionLoader.link(SEGMENT$vkCmdSetStencilReference, DESCRIPTOR$vkCmdSetStencilReference);
        SEGMENT$vkCmdBindDescriptorSets = loader.apply("vkCmdBindDescriptorSets");
        HANDLE$vkCmdBindDescriptorSets = RawFunctionLoader.link(SEGMENT$vkCmdBindDescriptorSets, DESCRIPTOR$vkCmdBindDescriptorSets);
        SEGMENT$vkCmdBindIndexBuffer = loader.apply("vkCmdBindIndexBuffer");
        HANDLE$vkCmdBindIndexBuffer = RawFunctionLoader.link(SEGMENT$vkCmdBindIndexBuffer, DESCRIPTOR$vkCmdBindIndexBuffer);
        SEGMENT$vkCmdBindVertexBuffers = loader.apply("vkCmdBindVertexBuffers");
        HANDLE$vkCmdBindVertexBuffers = RawFunctionLoader.link(SEGMENT$vkCmdBindVertexBuffers, DESCRIPTOR$vkCmdBindVertexBuffers);
        SEGMENT$vkCmdDraw = loader.apply("vkCmdDraw");
        HANDLE$vkCmdDraw = RawFunctionLoader.link(SEGMENT$vkCmdDraw, DESCRIPTOR$vkCmdDraw);
        SEGMENT$vkCmdDrawIndexed = loader.apply("vkCmdDrawIndexed");
        HANDLE$vkCmdDrawIndexed = RawFunctionLoader.link(SEGMENT$vkCmdDrawIndexed, DESCRIPTOR$vkCmdDrawIndexed);
        SEGMENT$vkCmdDrawMultiEXT = loader.apply("vkCmdDrawMultiEXT");
        HANDLE$vkCmdDrawMultiEXT = RawFunctionLoader.link(SEGMENT$vkCmdDrawMultiEXT, DESCRIPTOR$vkCmdDrawMultiEXT);
        SEGMENT$vkCmdDrawMultiIndexedEXT = loader.apply("vkCmdDrawMultiIndexedEXT");
        HANDLE$vkCmdDrawMultiIndexedEXT = RawFunctionLoader.link(SEGMENT$vkCmdDrawMultiIndexedEXT, DESCRIPTOR$vkCmdDrawMultiIndexedEXT);
        SEGMENT$vkCmdDrawIndirect = loader.apply("vkCmdDrawIndirect");
        HANDLE$vkCmdDrawIndirect = RawFunctionLoader.link(SEGMENT$vkCmdDrawIndirect, DESCRIPTOR$vkCmdDrawIndirect);
        SEGMENT$vkCmdDrawIndexedIndirect = loader.apply("vkCmdDrawIndexedIndirect");
        HANDLE$vkCmdDrawIndexedIndirect = RawFunctionLoader.link(SEGMENT$vkCmdDrawIndexedIndirect, DESCRIPTOR$vkCmdDrawIndexedIndirect);
        SEGMENT$vkCmdDispatch = loader.apply("vkCmdDispatch");
        HANDLE$vkCmdDispatch = RawFunctionLoader.link(SEGMENT$vkCmdDispatch, DESCRIPTOR$vkCmdDispatch);
        SEGMENT$vkCmdDispatchIndirect = loader.apply("vkCmdDispatchIndirect");
        HANDLE$vkCmdDispatchIndirect = RawFunctionLoader.link(SEGMENT$vkCmdDispatchIndirect, DESCRIPTOR$vkCmdDispatchIndirect);
        SEGMENT$vkCmdSubpassShadingHUAWEI = loader.apply("vkCmdSubpassShadingHUAWEI");
        HANDLE$vkCmdSubpassShadingHUAWEI = RawFunctionLoader.link(SEGMENT$vkCmdSubpassShadingHUAWEI, DESCRIPTOR$vkCmdSubpassShadingHUAWEI);
        SEGMENT$vkCmdDrawClusterHUAWEI = loader.apply("vkCmdDrawClusterHUAWEI");
        HANDLE$vkCmdDrawClusterHUAWEI = RawFunctionLoader.link(SEGMENT$vkCmdDrawClusterHUAWEI, DESCRIPTOR$vkCmdDrawClusterHUAWEI);
        SEGMENT$vkCmdDrawClusterIndirectHUAWEI = loader.apply("vkCmdDrawClusterIndirectHUAWEI");
        HANDLE$vkCmdDrawClusterIndirectHUAWEI = RawFunctionLoader.link(SEGMENT$vkCmdDrawClusterIndirectHUAWEI, DESCRIPTOR$vkCmdDrawClusterIndirectHUAWEI);
        SEGMENT$vkCmdUpdatePipelineIndirectBufferNV = loader.apply("vkCmdUpdatePipelineIndirectBufferNV");
        HANDLE$vkCmdUpdatePipelineIndirectBufferNV = RawFunctionLoader.link(SEGMENT$vkCmdUpdatePipelineIndirectBufferNV, DESCRIPTOR$vkCmdUpdatePipelineIndirectBufferNV);
        SEGMENT$vkCmdCopyBuffer = loader.apply("vkCmdCopyBuffer");
        HANDLE$vkCmdCopyBuffer = RawFunctionLoader.link(SEGMENT$vkCmdCopyBuffer, DESCRIPTOR$vkCmdCopyBuffer);
        SEGMENT$vkCmdCopyImage = loader.apply("vkCmdCopyImage");
        HANDLE$vkCmdCopyImage = RawFunctionLoader.link(SEGMENT$vkCmdCopyImage, DESCRIPTOR$vkCmdCopyImage);
        SEGMENT$vkCmdBlitImage = loader.apply("vkCmdBlitImage");
        HANDLE$vkCmdBlitImage = RawFunctionLoader.link(SEGMENT$vkCmdBlitImage, DESCRIPTOR$vkCmdBlitImage);
        SEGMENT$vkCmdCopyBufferToImage = loader.apply("vkCmdCopyBufferToImage");
        HANDLE$vkCmdCopyBufferToImage = RawFunctionLoader.link(SEGMENT$vkCmdCopyBufferToImage, DESCRIPTOR$vkCmdCopyBufferToImage);
        SEGMENT$vkCmdCopyImageToBuffer = loader.apply("vkCmdCopyImageToBuffer");
        HANDLE$vkCmdCopyImageToBuffer = RawFunctionLoader.link(SEGMENT$vkCmdCopyImageToBuffer, DESCRIPTOR$vkCmdCopyImageToBuffer);
        SEGMENT$vkCmdCopyMemoryIndirectNV = loader.apply("vkCmdCopyMemoryIndirectNV");
        HANDLE$vkCmdCopyMemoryIndirectNV = RawFunctionLoader.link(SEGMENT$vkCmdCopyMemoryIndirectNV, DESCRIPTOR$vkCmdCopyMemoryIndirectNV);
        SEGMENT$vkCmdCopyMemoryToImageIndirectNV = loader.apply("vkCmdCopyMemoryToImageIndirectNV");
        HANDLE$vkCmdCopyMemoryToImageIndirectNV = RawFunctionLoader.link(SEGMENT$vkCmdCopyMemoryToImageIndirectNV, DESCRIPTOR$vkCmdCopyMemoryToImageIndirectNV);
        SEGMENT$vkCmdUpdateBuffer = loader.apply("vkCmdUpdateBuffer");
        HANDLE$vkCmdUpdateBuffer = RawFunctionLoader.link(SEGMENT$vkCmdUpdateBuffer, DESCRIPTOR$vkCmdUpdateBuffer);
        SEGMENT$vkCmdFillBuffer = loader.apply("vkCmdFillBuffer");
        HANDLE$vkCmdFillBuffer = RawFunctionLoader.link(SEGMENT$vkCmdFillBuffer, DESCRIPTOR$vkCmdFillBuffer);
        SEGMENT$vkCmdClearColorImage = loader.apply("vkCmdClearColorImage");
        HANDLE$vkCmdClearColorImage = RawFunctionLoader.link(SEGMENT$vkCmdClearColorImage, DESCRIPTOR$vkCmdClearColorImage);
        SEGMENT$vkCmdClearDepthStencilImage = loader.apply("vkCmdClearDepthStencilImage");
        HANDLE$vkCmdClearDepthStencilImage = RawFunctionLoader.link(SEGMENT$vkCmdClearDepthStencilImage, DESCRIPTOR$vkCmdClearDepthStencilImage);
        SEGMENT$vkCmdClearAttachments = loader.apply("vkCmdClearAttachments");
        HANDLE$vkCmdClearAttachments = RawFunctionLoader.link(SEGMENT$vkCmdClearAttachments, DESCRIPTOR$vkCmdClearAttachments);
        SEGMENT$vkCmdResolveImage = loader.apply("vkCmdResolveImage");
        HANDLE$vkCmdResolveImage = RawFunctionLoader.link(SEGMENT$vkCmdResolveImage, DESCRIPTOR$vkCmdResolveImage);
        SEGMENT$vkCmdSetEvent = loader.apply("vkCmdSetEvent");
        HANDLE$vkCmdSetEvent = RawFunctionLoader.link(SEGMENT$vkCmdSetEvent, DESCRIPTOR$vkCmdSetEvent);
        SEGMENT$vkCmdResetEvent = loader.apply("vkCmdResetEvent");
        HANDLE$vkCmdResetEvent = RawFunctionLoader.link(SEGMENT$vkCmdResetEvent, DESCRIPTOR$vkCmdResetEvent);
        SEGMENT$vkCmdWaitEvents = loader.apply("vkCmdWaitEvents");
        HANDLE$vkCmdWaitEvents = RawFunctionLoader.link(SEGMENT$vkCmdWaitEvents, DESCRIPTOR$vkCmdWaitEvents);
        SEGMENT$vkCmdPipelineBarrier = loader.apply("vkCmdPipelineBarrier");
        HANDLE$vkCmdPipelineBarrier = RawFunctionLoader.link(SEGMENT$vkCmdPipelineBarrier, DESCRIPTOR$vkCmdPipelineBarrier);
        SEGMENT$vkCmdBeginQuery = loader.apply("vkCmdBeginQuery");
        HANDLE$vkCmdBeginQuery = RawFunctionLoader.link(SEGMENT$vkCmdBeginQuery, DESCRIPTOR$vkCmdBeginQuery);
        SEGMENT$vkCmdEndQuery = loader.apply("vkCmdEndQuery");
        HANDLE$vkCmdEndQuery = RawFunctionLoader.link(SEGMENT$vkCmdEndQuery, DESCRIPTOR$vkCmdEndQuery);
        SEGMENT$vkCmdBeginConditionalRenderingEXT = loader.apply("vkCmdBeginConditionalRenderingEXT");
        HANDLE$vkCmdBeginConditionalRenderingEXT = RawFunctionLoader.link(SEGMENT$vkCmdBeginConditionalRenderingEXT, DESCRIPTOR$vkCmdBeginConditionalRenderingEXT);
        SEGMENT$vkCmdEndConditionalRenderingEXT = loader.apply("vkCmdEndConditionalRenderingEXT");
        HANDLE$vkCmdEndConditionalRenderingEXT = RawFunctionLoader.link(SEGMENT$vkCmdEndConditionalRenderingEXT, DESCRIPTOR$vkCmdEndConditionalRenderingEXT);
        SEGMENT$vkCmdResetQueryPool = loader.apply("vkCmdResetQueryPool");
        HANDLE$vkCmdResetQueryPool = RawFunctionLoader.link(SEGMENT$vkCmdResetQueryPool, DESCRIPTOR$vkCmdResetQueryPool);
        SEGMENT$vkCmdWriteTimestamp = loader.apply("vkCmdWriteTimestamp");
        HANDLE$vkCmdWriteTimestamp = RawFunctionLoader.link(SEGMENT$vkCmdWriteTimestamp, DESCRIPTOR$vkCmdWriteTimestamp);
        SEGMENT$vkCmdCopyQueryPoolResults = loader.apply("vkCmdCopyQueryPoolResults");
        HANDLE$vkCmdCopyQueryPoolResults = RawFunctionLoader.link(SEGMENT$vkCmdCopyQueryPoolResults, DESCRIPTOR$vkCmdCopyQueryPoolResults);
        SEGMENT$vkCmdPushConstants = loader.apply("vkCmdPushConstants");
        HANDLE$vkCmdPushConstants = RawFunctionLoader.link(SEGMENT$vkCmdPushConstants, DESCRIPTOR$vkCmdPushConstants);
        SEGMENT$vkCmdBeginRenderPass = loader.apply("vkCmdBeginRenderPass");
        HANDLE$vkCmdBeginRenderPass = RawFunctionLoader.link(SEGMENT$vkCmdBeginRenderPass, DESCRIPTOR$vkCmdBeginRenderPass);
        SEGMENT$vkCmdNextSubpass = loader.apply("vkCmdNextSubpass");
        HANDLE$vkCmdNextSubpass = RawFunctionLoader.link(SEGMENT$vkCmdNextSubpass, DESCRIPTOR$vkCmdNextSubpass);
        SEGMENT$vkCmdEndRenderPass = loader.apply("vkCmdEndRenderPass");
        HANDLE$vkCmdEndRenderPass = RawFunctionLoader.link(SEGMENT$vkCmdEndRenderPass, DESCRIPTOR$vkCmdEndRenderPass);
        SEGMENT$vkCmdExecuteCommands = loader.apply("vkCmdExecuteCommands");
        HANDLE$vkCmdExecuteCommands = RawFunctionLoader.link(SEGMENT$vkCmdExecuteCommands, DESCRIPTOR$vkCmdExecuteCommands);
        SEGMENT$vkCreateSharedSwapchainsKHR = loader.apply("vkCreateSharedSwapchainsKHR");
        HANDLE$vkCreateSharedSwapchainsKHR = RawFunctionLoader.link(SEGMENT$vkCreateSharedSwapchainsKHR, DESCRIPTOR$vkCreateSharedSwapchainsKHR);
        SEGMENT$vkCreateSwapchainKHR = loader.apply("vkCreateSwapchainKHR");
        HANDLE$vkCreateSwapchainKHR = RawFunctionLoader.link(SEGMENT$vkCreateSwapchainKHR, DESCRIPTOR$vkCreateSwapchainKHR);
        SEGMENT$vkDestroySwapchainKHR = loader.apply("vkDestroySwapchainKHR");
        HANDLE$vkDestroySwapchainKHR = RawFunctionLoader.link(SEGMENT$vkDestroySwapchainKHR, DESCRIPTOR$vkDestroySwapchainKHR);
        SEGMENT$vkGetSwapchainImagesKHR = loader.apply("vkGetSwapchainImagesKHR");
        HANDLE$vkGetSwapchainImagesKHR = RawFunctionLoader.link(SEGMENT$vkGetSwapchainImagesKHR, DESCRIPTOR$vkGetSwapchainImagesKHR);
        SEGMENT$vkAcquireNextImageKHR = loader.apply("vkAcquireNextImageKHR");
        HANDLE$vkAcquireNextImageKHR = RawFunctionLoader.link(SEGMENT$vkAcquireNextImageKHR, DESCRIPTOR$vkAcquireNextImageKHR);
        SEGMENT$vkQueuePresentKHR = loader.apply("vkQueuePresentKHR");
        HANDLE$vkQueuePresentKHR = RawFunctionLoader.link(SEGMENT$vkQueuePresentKHR, DESCRIPTOR$vkQueuePresentKHR);
        SEGMENT$vkDebugMarkerSetObjectNameEXT = loader.apply("vkDebugMarkerSetObjectNameEXT");
        HANDLE$vkDebugMarkerSetObjectNameEXT = RawFunctionLoader.link(SEGMENT$vkDebugMarkerSetObjectNameEXT, DESCRIPTOR$vkDebugMarkerSetObjectNameEXT);
        SEGMENT$vkDebugMarkerSetObjectTagEXT = loader.apply("vkDebugMarkerSetObjectTagEXT");
        HANDLE$vkDebugMarkerSetObjectTagEXT = RawFunctionLoader.link(SEGMENT$vkDebugMarkerSetObjectTagEXT, DESCRIPTOR$vkDebugMarkerSetObjectTagEXT);
        SEGMENT$vkCmdDebugMarkerBeginEXT = loader.apply("vkCmdDebugMarkerBeginEXT");
        HANDLE$vkCmdDebugMarkerBeginEXT = RawFunctionLoader.link(SEGMENT$vkCmdDebugMarkerBeginEXT, DESCRIPTOR$vkCmdDebugMarkerBeginEXT);
        SEGMENT$vkCmdDebugMarkerEndEXT = loader.apply("vkCmdDebugMarkerEndEXT");
        HANDLE$vkCmdDebugMarkerEndEXT = RawFunctionLoader.link(SEGMENT$vkCmdDebugMarkerEndEXT, DESCRIPTOR$vkCmdDebugMarkerEndEXT);
        SEGMENT$vkCmdDebugMarkerInsertEXT = loader.apply("vkCmdDebugMarkerInsertEXT");
        HANDLE$vkCmdDebugMarkerInsertEXT = RawFunctionLoader.link(SEGMENT$vkCmdDebugMarkerInsertEXT, DESCRIPTOR$vkCmdDebugMarkerInsertEXT);
        SEGMENT$vkGetMemoryWin32HandleNV = loader.apply("vkGetMemoryWin32HandleNV");
        HANDLE$vkGetMemoryWin32HandleNV = RawFunctionLoader.link(SEGMENT$vkGetMemoryWin32HandleNV, DESCRIPTOR$vkGetMemoryWin32HandleNV);
        SEGMENT$vkCmdExecuteGeneratedCommandsNV = loader.apply("vkCmdExecuteGeneratedCommandsNV");
        HANDLE$vkCmdExecuteGeneratedCommandsNV = RawFunctionLoader.link(SEGMENT$vkCmdExecuteGeneratedCommandsNV, DESCRIPTOR$vkCmdExecuteGeneratedCommandsNV);
        SEGMENT$vkCmdPreprocessGeneratedCommandsNV = loader.apply("vkCmdPreprocessGeneratedCommandsNV");
        HANDLE$vkCmdPreprocessGeneratedCommandsNV = RawFunctionLoader.link(SEGMENT$vkCmdPreprocessGeneratedCommandsNV, DESCRIPTOR$vkCmdPreprocessGeneratedCommandsNV);
        SEGMENT$vkCmdBindPipelineShaderGroupNV = loader.apply("vkCmdBindPipelineShaderGroupNV");
        HANDLE$vkCmdBindPipelineShaderGroupNV = RawFunctionLoader.link(SEGMENT$vkCmdBindPipelineShaderGroupNV, DESCRIPTOR$vkCmdBindPipelineShaderGroupNV);
        SEGMENT$vkGetGeneratedCommandsMemoryRequirementsNV = loader.apply("vkGetGeneratedCommandsMemoryRequirementsNV");
        HANDLE$vkGetGeneratedCommandsMemoryRequirementsNV = RawFunctionLoader.link(SEGMENT$vkGetGeneratedCommandsMemoryRequirementsNV, DESCRIPTOR$vkGetGeneratedCommandsMemoryRequirementsNV);
        SEGMENT$vkCreateIndirectCommandsLayoutNV = loader.apply("vkCreateIndirectCommandsLayoutNV");
        HANDLE$vkCreateIndirectCommandsLayoutNV = RawFunctionLoader.link(SEGMENT$vkCreateIndirectCommandsLayoutNV, DESCRIPTOR$vkCreateIndirectCommandsLayoutNV);
        SEGMENT$vkDestroyIndirectCommandsLayoutNV = loader.apply("vkDestroyIndirectCommandsLayoutNV");
        HANDLE$vkDestroyIndirectCommandsLayoutNV = RawFunctionLoader.link(SEGMENT$vkDestroyIndirectCommandsLayoutNV, DESCRIPTOR$vkDestroyIndirectCommandsLayoutNV);
        SEGMENT$vkCmdPushDescriptorSetKHR = loader.apply("vkCmdPushDescriptorSetKHR");
        HANDLE$vkCmdPushDescriptorSetKHR = RawFunctionLoader.link(SEGMENT$vkCmdPushDescriptorSetKHR, DESCRIPTOR$vkCmdPushDescriptorSetKHR);
        SEGMENT$vkTrimCommandPool = loader.apply("vkTrimCommandPool");
        HANDLE$vkTrimCommandPool = RawFunctionLoader.link(SEGMENT$vkTrimCommandPool, DESCRIPTOR$vkTrimCommandPool);
        SEGMENT$vkGetMemoryWin32HandleKHR = loader.apply("vkGetMemoryWin32HandleKHR");
        HANDLE$vkGetMemoryWin32HandleKHR = RawFunctionLoader.link(SEGMENT$vkGetMemoryWin32HandleKHR, DESCRIPTOR$vkGetMemoryWin32HandleKHR);
        SEGMENT$vkGetMemoryWin32HandlePropertiesKHR = loader.apply("vkGetMemoryWin32HandlePropertiesKHR");
        HANDLE$vkGetMemoryWin32HandlePropertiesKHR = RawFunctionLoader.link(SEGMENT$vkGetMemoryWin32HandlePropertiesKHR, DESCRIPTOR$vkGetMemoryWin32HandlePropertiesKHR);
        SEGMENT$vkGetMemoryFdKHR = loader.apply("vkGetMemoryFdKHR");
        HANDLE$vkGetMemoryFdKHR = RawFunctionLoader.link(SEGMENT$vkGetMemoryFdKHR, DESCRIPTOR$vkGetMemoryFdKHR);
        SEGMENT$vkGetMemoryFdPropertiesKHR = loader.apply("vkGetMemoryFdPropertiesKHR");
        HANDLE$vkGetMemoryFdPropertiesKHR = RawFunctionLoader.link(SEGMENT$vkGetMemoryFdPropertiesKHR, DESCRIPTOR$vkGetMemoryFdPropertiesKHR);
        SEGMENT$vkGetMemoryZirconHandleFUCHSIA = loader.apply("vkGetMemoryZirconHandleFUCHSIA");
        HANDLE$vkGetMemoryZirconHandleFUCHSIA = RawFunctionLoader.link(SEGMENT$vkGetMemoryZirconHandleFUCHSIA, DESCRIPTOR$vkGetMemoryZirconHandleFUCHSIA);
        SEGMENT$vkGetMemoryZirconHandlePropertiesFUCHSIA = loader.apply("vkGetMemoryZirconHandlePropertiesFUCHSIA");
        HANDLE$vkGetMemoryZirconHandlePropertiesFUCHSIA = RawFunctionLoader.link(SEGMENT$vkGetMemoryZirconHandlePropertiesFUCHSIA, DESCRIPTOR$vkGetMemoryZirconHandlePropertiesFUCHSIA);
        SEGMENT$vkGetMemoryRemoteAddressNV = loader.apply("vkGetMemoryRemoteAddressNV");
        HANDLE$vkGetMemoryRemoteAddressNV = RawFunctionLoader.link(SEGMENT$vkGetMemoryRemoteAddressNV, DESCRIPTOR$vkGetMemoryRemoteAddressNV);
        SEGMENT$vkGetMemorySciBufNV = loader.apply("vkGetMemorySciBufNV");
        HANDLE$vkGetMemorySciBufNV = RawFunctionLoader.link(SEGMENT$vkGetMemorySciBufNV, DESCRIPTOR$vkGetMemorySciBufNV);
        SEGMENT$vkGetPhysicalDeviceExternalMemorySciBufPropertiesNV = loader.apply("vkGetPhysicalDeviceExternalMemorySciBufPropertiesNV");
        HANDLE$vkGetPhysicalDeviceExternalMemorySciBufPropertiesNV = RawFunctionLoader.link(SEGMENT$vkGetPhysicalDeviceExternalMemorySciBufPropertiesNV, DESCRIPTOR$vkGetPhysicalDeviceExternalMemorySciBufPropertiesNV);
        SEGMENT$vkGetPhysicalDeviceSciBufAttributesNV = loader.apply("vkGetPhysicalDeviceSciBufAttributesNV");
        HANDLE$vkGetPhysicalDeviceSciBufAttributesNV = RawFunctionLoader.link(SEGMENT$vkGetPhysicalDeviceSciBufAttributesNV, DESCRIPTOR$vkGetPhysicalDeviceSciBufAttributesNV);
        SEGMENT$vkGetSemaphoreWin32HandleKHR = loader.apply("vkGetSemaphoreWin32HandleKHR");
        HANDLE$vkGetSemaphoreWin32HandleKHR = RawFunctionLoader.link(SEGMENT$vkGetSemaphoreWin32HandleKHR, DESCRIPTOR$vkGetSemaphoreWin32HandleKHR);
        SEGMENT$vkImportSemaphoreWin32HandleKHR = loader.apply("vkImportSemaphoreWin32HandleKHR");
        HANDLE$vkImportSemaphoreWin32HandleKHR = RawFunctionLoader.link(SEGMENT$vkImportSemaphoreWin32HandleKHR, DESCRIPTOR$vkImportSemaphoreWin32HandleKHR);
        SEGMENT$vkGetSemaphoreFdKHR = loader.apply("vkGetSemaphoreFdKHR");
        HANDLE$vkGetSemaphoreFdKHR = RawFunctionLoader.link(SEGMENT$vkGetSemaphoreFdKHR, DESCRIPTOR$vkGetSemaphoreFdKHR);
        SEGMENT$vkImportSemaphoreFdKHR = loader.apply("vkImportSemaphoreFdKHR");
        HANDLE$vkImportSemaphoreFdKHR = RawFunctionLoader.link(SEGMENT$vkImportSemaphoreFdKHR, DESCRIPTOR$vkImportSemaphoreFdKHR);
        SEGMENT$vkGetSemaphoreZirconHandleFUCHSIA = loader.apply("vkGetSemaphoreZirconHandleFUCHSIA");
        HANDLE$vkGetSemaphoreZirconHandleFUCHSIA = RawFunctionLoader.link(SEGMENT$vkGetSemaphoreZirconHandleFUCHSIA, DESCRIPTOR$vkGetSemaphoreZirconHandleFUCHSIA);
        SEGMENT$vkImportSemaphoreZirconHandleFUCHSIA = loader.apply("vkImportSemaphoreZirconHandleFUCHSIA");
        HANDLE$vkImportSemaphoreZirconHandleFUCHSIA = RawFunctionLoader.link(SEGMENT$vkImportSemaphoreZirconHandleFUCHSIA, DESCRIPTOR$vkImportSemaphoreZirconHandleFUCHSIA);
        SEGMENT$vkGetFenceWin32HandleKHR = loader.apply("vkGetFenceWin32HandleKHR");
        HANDLE$vkGetFenceWin32HandleKHR = RawFunctionLoader.link(SEGMENT$vkGetFenceWin32HandleKHR, DESCRIPTOR$vkGetFenceWin32HandleKHR);
        SEGMENT$vkImportFenceWin32HandleKHR = loader.apply("vkImportFenceWin32HandleKHR");
        HANDLE$vkImportFenceWin32HandleKHR = RawFunctionLoader.link(SEGMENT$vkImportFenceWin32HandleKHR, DESCRIPTOR$vkImportFenceWin32HandleKHR);
        SEGMENT$vkGetFenceFdKHR = loader.apply("vkGetFenceFdKHR");
        HANDLE$vkGetFenceFdKHR = RawFunctionLoader.link(SEGMENT$vkGetFenceFdKHR, DESCRIPTOR$vkGetFenceFdKHR);
        SEGMENT$vkImportFenceFdKHR = loader.apply("vkImportFenceFdKHR");
        HANDLE$vkImportFenceFdKHR = RawFunctionLoader.link(SEGMENT$vkImportFenceFdKHR, DESCRIPTOR$vkImportFenceFdKHR);
        SEGMENT$vkGetFenceSciSyncFenceNV = loader.apply("vkGetFenceSciSyncFenceNV");
        HANDLE$vkGetFenceSciSyncFenceNV = RawFunctionLoader.link(SEGMENT$vkGetFenceSciSyncFenceNV, DESCRIPTOR$vkGetFenceSciSyncFenceNV);
        SEGMENT$vkGetFenceSciSyncObjNV = loader.apply("vkGetFenceSciSyncObjNV");
        HANDLE$vkGetFenceSciSyncObjNV = RawFunctionLoader.link(SEGMENT$vkGetFenceSciSyncObjNV, DESCRIPTOR$vkGetFenceSciSyncObjNV);
        SEGMENT$vkImportFenceSciSyncFenceNV = loader.apply("vkImportFenceSciSyncFenceNV");
        HANDLE$vkImportFenceSciSyncFenceNV = RawFunctionLoader.link(SEGMENT$vkImportFenceSciSyncFenceNV, DESCRIPTOR$vkImportFenceSciSyncFenceNV);
        SEGMENT$vkImportFenceSciSyncObjNV = loader.apply("vkImportFenceSciSyncObjNV");
        HANDLE$vkImportFenceSciSyncObjNV = RawFunctionLoader.link(SEGMENT$vkImportFenceSciSyncObjNV, DESCRIPTOR$vkImportFenceSciSyncObjNV);
        SEGMENT$vkGetSemaphoreSciSyncObjNV = loader.apply("vkGetSemaphoreSciSyncObjNV");
        HANDLE$vkGetSemaphoreSciSyncObjNV = RawFunctionLoader.link(SEGMENT$vkGetSemaphoreSciSyncObjNV, DESCRIPTOR$vkGetSemaphoreSciSyncObjNV);
        SEGMENT$vkImportSemaphoreSciSyncObjNV = loader.apply("vkImportSemaphoreSciSyncObjNV");
        HANDLE$vkImportSemaphoreSciSyncObjNV = RawFunctionLoader.link(SEGMENT$vkImportSemaphoreSciSyncObjNV, DESCRIPTOR$vkImportSemaphoreSciSyncObjNV);
        SEGMENT$vkGetPhysicalDeviceSciSyncAttributesNV = loader.apply("vkGetPhysicalDeviceSciSyncAttributesNV");
        HANDLE$vkGetPhysicalDeviceSciSyncAttributesNV = RawFunctionLoader.link(SEGMENT$vkGetPhysicalDeviceSciSyncAttributesNV, DESCRIPTOR$vkGetPhysicalDeviceSciSyncAttributesNV);
        SEGMENT$vkCreateSemaphoreSciSyncPoolNV = loader.apply("vkCreateSemaphoreSciSyncPoolNV");
        HANDLE$vkCreateSemaphoreSciSyncPoolNV = RawFunctionLoader.link(SEGMENT$vkCreateSemaphoreSciSyncPoolNV, DESCRIPTOR$vkCreateSemaphoreSciSyncPoolNV);
        SEGMENT$vkDestroySemaphoreSciSyncPoolNV = loader.apply("vkDestroySemaphoreSciSyncPoolNV");
        HANDLE$vkDestroySemaphoreSciSyncPoolNV = RawFunctionLoader.link(SEGMENT$vkDestroySemaphoreSciSyncPoolNV, DESCRIPTOR$vkDestroySemaphoreSciSyncPoolNV);
        SEGMENT$vkAcquireWinrtDisplayNV = loader.apply("vkAcquireWinrtDisplayNV");
        HANDLE$vkAcquireWinrtDisplayNV = RawFunctionLoader.link(SEGMENT$vkAcquireWinrtDisplayNV, DESCRIPTOR$vkAcquireWinrtDisplayNV);
        SEGMENT$vkGetWinrtDisplayNV = loader.apply("vkGetWinrtDisplayNV");
        HANDLE$vkGetWinrtDisplayNV = RawFunctionLoader.link(SEGMENT$vkGetWinrtDisplayNV, DESCRIPTOR$vkGetWinrtDisplayNV);
        SEGMENT$vkDisplayPowerControlEXT = loader.apply("vkDisplayPowerControlEXT");
        HANDLE$vkDisplayPowerControlEXT = RawFunctionLoader.link(SEGMENT$vkDisplayPowerControlEXT, DESCRIPTOR$vkDisplayPowerControlEXT);
        SEGMENT$vkRegisterDeviceEventEXT = loader.apply("vkRegisterDeviceEventEXT");
        HANDLE$vkRegisterDeviceEventEXT = RawFunctionLoader.link(SEGMENT$vkRegisterDeviceEventEXT, DESCRIPTOR$vkRegisterDeviceEventEXT);
        SEGMENT$vkRegisterDisplayEventEXT = loader.apply("vkRegisterDisplayEventEXT");
        HANDLE$vkRegisterDisplayEventEXT = RawFunctionLoader.link(SEGMENT$vkRegisterDisplayEventEXT, DESCRIPTOR$vkRegisterDisplayEventEXT);
        SEGMENT$vkGetSwapchainCounterEXT = loader.apply("vkGetSwapchainCounterEXT");
        HANDLE$vkGetSwapchainCounterEXT = RawFunctionLoader.link(SEGMENT$vkGetSwapchainCounterEXT, DESCRIPTOR$vkGetSwapchainCounterEXT);
        SEGMENT$vkGetDeviceGroupPeerMemoryFeatures = loader.apply("vkGetDeviceGroupPeerMemoryFeatures");
        HANDLE$vkGetDeviceGroupPeerMemoryFeatures = RawFunctionLoader.link(SEGMENT$vkGetDeviceGroupPeerMemoryFeatures, DESCRIPTOR$vkGetDeviceGroupPeerMemoryFeatures);
        SEGMENT$vkBindBufferMemory2 = loader.apply("vkBindBufferMemory2");
        HANDLE$vkBindBufferMemory2 = RawFunctionLoader.link(SEGMENT$vkBindBufferMemory2, DESCRIPTOR$vkBindBufferMemory2);
        SEGMENT$vkBindImageMemory2 = loader.apply("vkBindImageMemory2");
        HANDLE$vkBindImageMemory2 = RawFunctionLoader.link(SEGMENT$vkBindImageMemory2, DESCRIPTOR$vkBindImageMemory2);
        SEGMENT$vkCmdSetDeviceMask = loader.apply("vkCmdSetDeviceMask");
        HANDLE$vkCmdSetDeviceMask = RawFunctionLoader.link(SEGMENT$vkCmdSetDeviceMask, DESCRIPTOR$vkCmdSetDeviceMask);
        SEGMENT$vkGetDeviceGroupPresentCapabilitiesKHR = loader.apply("vkGetDeviceGroupPresentCapabilitiesKHR");
        HANDLE$vkGetDeviceGroupPresentCapabilitiesKHR = RawFunctionLoader.link(SEGMENT$vkGetDeviceGroupPresentCapabilitiesKHR, DESCRIPTOR$vkGetDeviceGroupPresentCapabilitiesKHR);
        SEGMENT$vkGetDeviceGroupSurfacePresentModesKHR = loader.apply("vkGetDeviceGroupSurfacePresentModesKHR");
        HANDLE$vkGetDeviceGroupSurfacePresentModesKHR = RawFunctionLoader.link(SEGMENT$vkGetDeviceGroupSurfacePresentModesKHR, DESCRIPTOR$vkGetDeviceGroupSurfacePresentModesKHR);
        SEGMENT$vkAcquireNextImage2KHR = loader.apply("vkAcquireNextImage2KHR");
        HANDLE$vkAcquireNextImage2KHR = RawFunctionLoader.link(SEGMENT$vkAcquireNextImage2KHR, DESCRIPTOR$vkAcquireNextImage2KHR);
        SEGMENT$vkCmdDispatchBase = loader.apply("vkCmdDispatchBase");
        HANDLE$vkCmdDispatchBase = RawFunctionLoader.link(SEGMENT$vkCmdDispatchBase, DESCRIPTOR$vkCmdDispatchBase);
        SEGMENT$vkGetPhysicalDevicePresentRectanglesKHR = loader.apply("vkGetPhysicalDevicePresentRectanglesKHR");
        HANDLE$vkGetPhysicalDevicePresentRectanglesKHR = RawFunctionLoader.link(SEGMENT$vkGetPhysicalDevicePresentRectanglesKHR, DESCRIPTOR$vkGetPhysicalDevicePresentRectanglesKHR);
        SEGMENT$vkCreateDescriptorUpdateTemplate = loader.apply("vkCreateDescriptorUpdateTemplate");
        HANDLE$vkCreateDescriptorUpdateTemplate = RawFunctionLoader.link(SEGMENT$vkCreateDescriptorUpdateTemplate, DESCRIPTOR$vkCreateDescriptorUpdateTemplate);
        SEGMENT$vkDestroyDescriptorUpdateTemplate = loader.apply("vkDestroyDescriptorUpdateTemplate");
        HANDLE$vkDestroyDescriptorUpdateTemplate = RawFunctionLoader.link(SEGMENT$vkDestroyDescriptorUpdateTemplate, DESCRIPTOR$vkDestroyDescriptorUpdateTemplate);
        SEGMENT$vkUpdateDescriptorSetWithTemplate = loader.apply("vkUpdateDescriptorSetWithTemplate");
        HANDLE$vkUpdateDescriptorSetWithTemplate = RawFunctionLoader.link(SEGMENT$vkUpdateDescriptorSetWithTemplate, DESCRIPTOR$vkUpdateDescriptorSetWithTemplate);
        SEGMENT$vkCmdPushDescriptorSetWithTemplateKHR = loader.apply("vkCmdPushDescriptorSetWithTemplateKHR");
        HANDLE$vkCmdPushDescriptorSetWithTemplateKHR = RawFunctionLoader.link(SEGMENT$vkCmdPushDescriptorSetWithTemplateKHR, DESCRIPTOR$vkCmdPushDescriptorSetWithTemplateKHR);
        SEGMENT$vkSetHdrMetadataEXT = loader.apply("vkSetHdrMetadataEXT");
        HANDLE$vkSetHdrMetadataEXT = RawFunctionLoader.link(SEGMENT$vkSetHdrMetadataEXT, DESCRIPTOR$vkSetHdrMetadataEXT);
        SEGMENT$vkGetSwapchainStatusKHR = loader.apply("vkGetSwapchainStatusKHR");
        HANDLE$vkGetSwapchainStatusKHR = RawFunctionLoader.link(SEGMENT$vkGetSwapchainStatusKHR, DESCRIPTOR$vkGetSwapchainStatusKHR);
        SEGMENT$vkGetRefreshCycleDurationGOOGLE = loader.apply("vkGetRefreshCycleDurationGOOGLE");
        HANDLE$vkGetRefreshCycleDurationGOOGLE = RawFunctionLoader.link(SEGMENT$vkGetRefreshCycleDurationGOOGLE, DESCRIPTOR$vkGetRefreshCycleDurationGOOGLE);
        SEGMENT$vkGetPastPresentationTimingGOOGLE = loader.apply("vkGetPastPresentationTimingGOOGLE");
        HANDLE$vkGetPastPresentationTimingGOOGLE = RawFunctionLoader.link(SEGMENT$vkGetPastPresentationTimingGOOGLE, DESCRIPTOR$vkGetPastPresentationTimingGOOGLE);
        SEGMENT$vkCmdSetViewportWScalingNV = loader.apply("vkCmdSetViewportWScalingNV");
        HANDLE$vkCmdSetViewportWScalingNV = RawFunctionLoader.link(SEGMENT$vkCmdSetViewportWScalingNV, DESCRIPTOR$vkCmdSetViewportWScalingNV);
        SEGMENT$vkCmdSetDiscardRectangleEXT = loader.apply("vkCmdSetDiscardRectangleEXT");
        HANDLE$vkCmdSetDiscardRectangleEXT = RawFunctionLoader.link(SEGMENT$vkCmdSetDiscardRectangleEXT, DESCRIPTOR$vkCmdSetDiscardRectangleEXT);
        SEGMENT$vkCmdSetDiscardRectangleEnableEXT = loader.apply("vkCmdSetDiscardRectangleEnableEXT");
        HANDLE$vkCmdSetDiscardRectangleEnableEXT = RawFunctionLoader.link(SEGMENT$vkCmdSetDiscardRectangleEnableEXT, DESCRIPTOR$vkCmdSetDiscardRectangleEnableEXT);
        SEGMENT$vkCmdSetDiscardRectangleModeEXT = loader.apply("vkCmdSetDiscardRectangleModeEXT");
        HANDLE$vkCmdSetDiscardRectangleModeEXT = RawFunctionLoader.link(SEGMENT$vkCmdSetDiscardRectangleModeEXT, DESCRIPTOR$vkCmdSetDiscardRectangleModeEXT);
        SEGMENT$vkCmdSetSampleLocationsEXT = loader.apply("vkCmdSetSampleLocationsEXT");
        HANDLE$vkCmdSetSampleLocationsEXT = RawFunctionLoader.link(SEGMENT$vkCmdSetSampleLocationsEXT, DESCRIPTOR$vkCmdSetSampleLocationsEXT);
        SEGMENT$vkGetPhysicalDeviceMultisamplePropertiesEXT = loader.apply("vkGetPhysicalDeviceMultisamplePropertiesEXT");
        HANDLE$vkGetPhysicalDeviceMultisamplePropertiesEXT = RawFunctionLoader.link(SEGMENT$vkGetPhysicalDeviceMultisamplePropertiesEXT, DESCRIPTOR$vkGetPhysicalDeviceMultisamplePropertiesEXT);
        SEGMENT$vkGetBufferMemoryRequirements2 = loader.apply("vkGetBufferMemoryRequirements2");
        HANDLE$vkGetBufferMemoryRequirements2 = RawFunctionLoader.link(SEGMENT$vkGetBufferMemoryRequirements2, DESCRIPTOR$vkGetBufferMemoryRequirements2);
        SEGMENT$vkGetImageMemoryRequirements2 = loader.apply("vkGetImageMemoryRequirements2");
        HANDLE$vkGetImageMemoryRequirements2 = RawFunctionLoader.link(SEGMENT$vkGetImageMemoryRequirements2, DESCRIPTOR$vkGetImageMemoryRequirements2);
        SEGMENT$vkGetImageSparseMemoryRequirements2 = loader.apply("vkGetImageSparseMemoryRequirements2");
        HANDLE$vkGetImageSparseMemoryRequirements2 = RawFunctionLoader.link(SEGMENT$vkGetImageSparseMemoryRequirements2, DESCRIPTOR$vkGetImageSparseMemoryRequirements2);
        SEGMENT$vkGetDeviceBufferMemoryRequirements = loader.apply("vkGetDeviceBufferMemoryRequirements");
        HANDLE$vkGetDeviceBufferMemoryRequirements = RawFunctionLoader.link(SEGMENT$vkGetDeviceBufferMemoryRequirements, DESCRIPTOR$vkGetDeviceBufferMemoryRequirements);
        SEGMENT$vkGetDeviceImageMemoryRequirements = loader.apply("vkGetDeviceImageMemoryRequirements");
        HANDLE$vkGetDeviceImageMemoryRequirements = RawFunctionLoader.link(SEGMENT$vkGetDeviceImageMemoryRequirements, DESCRIPTOR$vkGetDeviceImageMemoryRequirements);
        SEGMENT$vkGetDeviceImageSparseMemoryRequirements = loader.apply("vkGetDeviceImageSparseMemoryRequirements");
        HANDLE$vkGetDeviceImageSparseMemoryRequirements = RawFunctionLoader.link(SEGMENT$vkGetDeviceImageSparseMemoryRequirements, DESCRIPTOR$vkGetDeviceImageSparseMemoryRequirements);
        SEGMENT$vkCreateSamplerYcbcrConversion = loader.apply("vkCreateSamplerYcbcrConversion");
        HANDLE$vkCreateSamplerYcbcrConversion = RawFunctionLoader.link(SEGMENT$vkCreateSamplerYcbcrConversion, DESCRIPTOR$vkCreateSamplerYcbcrConversion);
        SEGMENT$vkDestroySamplerYcbcrConversion = loader.apply("vkDestroySamplerYcbcrConversion");
        HANDLE$vkDestroySamplerYcbcrConversion = RawFunctionLoader.link(SEGMENT$vkDestroySamplerYcbcrConversion, DESCRIPTOR$vkDestroySamplerYcbcrConversion);
        SEGMENT$vkGetDeviceQueue2 = loader.apply("vkGetDeviceQueue2");
        HANDLE$vkGetDeviceQueue2 = RawFunctionLoader.link(SEGMENT$vkGetDeviceQueue2, DESCRIPTOR$vkGetDeviceQueue2);
        SEGMENT$vkCreateValidationCacheEXT = loader.apply("vkCreateValidationCacheEXT");
        HANDLE$vkCreateValidationCacheEXT = RawFunctionLoader.link(SEGMENT$vkCreateValidationCacheEXT, DESCRIPTOR$vkCreateValidationCacheEXT);
        SEGMENT$vkDestroyValidationCacheEXT = loader.apply("vkDestroyValidationCacheEXT");
        HANDLE$vkDestroyValidationCacheEXT = RawFunctionLoader.link(SEGMENT$vkDestroyValidationCacheEXT, DESCRIPTOR$vkDestroyValidationCacheEXT);
        SEGMENT$vkGetValidationCacheDataEXT = loader.apply("vkGetValidationCacheDataEXT");
        HANDLE$vkGetValidationCacheDataEXT = RawFunctionLoader.link(SEGMENT$vkGetValidationCacheDataEXT, DESCRIPTOR$vkGetValidationCacheDataEXT);
        SEGMENT$vkMergeValidationCachesEXT = loader.apply("vkMergeValidationCachesEXT");
        HANDLE$vkMergeValidationCachesEXT = RawFunctionLoader.link(SEGMENT$vkMergeValidationCachesEXT, DESCRIPTOR$vkMergeValidationCachesEXT);
        SEGMENT$vkGetDescriptorSetLayoutSupport = loader.apply("vkGetDescriptorSetLayoutSupport");
        HANDLE$vkGetDescriptorSetLayoutSupport = RawFunctionLoader.link(SEGMENT$vkGetDescriptorSetLayoutSupport, DESCRIPTOR$vkGetDescriptorSetLayoutSupport);
        SEGMENT$vkGetShaderInfoAMD = loader.apply("vkGetShaderInfoAMD");
        HANDLE$vkGetShaderInfoAMD = RawFunctionLoader.link(SEGMENT$vkGetShaderInfoAMD, DESCRIPTOR$vkGetShaderInfoAMD);
        SEGMENT$vkSetLocalDimmingAMD = loader.apply("vkSetLocalDimmingAMD");
        HANDLE$vkSetLocalDimmingAMD = RawFunctionLoader.link(SEGMENT$vkSetLocalDimmingAMD, DESCRIPTOR$vkSetLocalDimmingAMD);
        SEGMENT$vkGetPhysicalDeviceCalibrateableTimeDomainsKHR = loader.apply("vkGetPhysicalDeviceCalibrateableTimeDomainsKHR");
        HANDLE$vkGetPhysicalDeviceCalibrateableTimeDomainsKHR = RawFunctionLoader.link(SEGMENT$vkGetPhysicalDeviceCalibrateableTimeDomainsKHR, DESCRIPTOR$vkGetPhysicalDeviceCalibrateableTimeDomainsKHR);
        SEGMENT$vkGetCalibratedTimestampsKHR = loader.apply("vkGetCalibratedTimestampsKHR");
        HANDLE$vkGetCalibratedTimestampsKHR = RawFunctionLoader.link(SEGMENT$vkGetCalibratedTimestampsKHR, DESCRIPTOR$vkGetCalibratedTimestampsKHR);
        SEGMENT$vkGetMemoryHostPointerPropertiesEXT = loader.apply("vkGetMemoryHostPointerPropertiesEXT");
        HANDLE$vkGetMemoryHostPointerPropertiesEXT = RawFunctionLoader.link(SEGMENT$vkGetMemoryHostPointerPropertiesEXT, DESCRIPTOR$vkGetMemoryHostPointerPropertiesEXT);
        SEGMENT$vkCmdWriteBufferMarkerAMD = loader.apply("vkCmdWriteBufferMarkerAMD");
        HANDLE$vkCmdWriteBufferMarkerAMD = RawFunctionLoader.link(SEGMENT$vkCmdWriteBufferMarkerAMD, DESCRIPTOR$vkCmdWriteBufferMarkerAMD);
        SEGMENT$vkCreateRenderPass2 = loader.apply("vkCreateRenderPass2");
        HANDLE$vkCreateRenderPass2 = RawFunctionLoader.link(SEGMENT$vkCreateRenderPass2, DESCRIPTOR$vkCreateRenderPass2);
        SEGMENT$vkCmdBeginRenderPass2 = loader.apply("vkCmdBeginRenderPass2");
        HANDLE$vkCmdBeginRenderPass2 = RawFunctionLoader.link(SEGMENT$vkCmdBeginRenderPass2, DESCRIPTOR$vkCmdBeginRenderPass2);
        SEGMENT$vkCmdNextSubpass2 = loader.apply("vkCmdNextSubpass2");
        HANDLE$vkCmdNextSubpass2 = RawFunctionLoader.link(SEGMENT$vkCmdNextSubpass2, DESCRIPTOR$vkCmdNextSubpass2);
        SEGMENT$vkCmdEndRenderPass2 = loader.apply("vkCmdEndRenderPass2");
        HANDLE$vkCmdEndRenderPass2 = RawFunctionLoader.link(SEGMENT$vkCmdEndRenderPass2, DESCRIPTOR$vkCmdEndRenderPass2);
        SEGMENT$vkGetSemaphoreCounterValue = loader.apply("vkGetSemaphoreCounterValue");
        HANDLE$vkGetSemaphoreCounterValue = RawFunctionLoader.link(SEGMENT$vkGetSemaphoreCounterValue, DESCRIPTOR$vkGetSemaphoreCounterValue);
        SEGMENT$vkWaitSemaphores = loader.apply("vkWaitSemaphores");
        HANDLE$vkWaitSemaphores = RawFunctionLoader.link(SEGMENT$vkWaitSemaphores, DESCRIPTOR$vkWaitSemaphores);
        SEGMENT$vkSignalSemaphore = loader.apply("vkSignalSemaphore");
        HANDLE$vkSignalSemaphore = RawFunctionLoader.link(SEGMENT$vkSignalSemaphore, DESCRIPTOR$vkSignalSemaphore);
        SEGMENT$vkGetAndroidHardwareBufferPropertiesANDROID = loader.apply("vkGetAndroidHardwareBufferPropertiesANDROID");
        HANDLE$vkGetAndroidHardwareBufferPropertiesANDROID = RawFunctionLoader.link(SEGMENT$vkGetAndroidHardwareBufferPropertiesANDROID, DESCRIPTOR$vkGetAndroidHardwareBufferPropertiesANDROID);
        SEGMENT$vkGetMemoryAndroidHardwareBufferANDROID = loader.apply("vkGetMemoryAndroidHardwareBufferANDROID");
        HANDLE$vkGetMemoryAndroidHardwareBufferANDROID = RawFunctionLoader.link(SEGMENT$vkGetMemoryAndroidHardwareBufferANDROID, DESCRIPTOR$vkGetMemoryAndroidHardwareBufferANDROID);
        SEGMENT$vkCmdDrawIndirectCount = loader.apply("vkCmdDrawIndirectCount");
        HANDLE$vkCmdDrawIndirectCount = RawFunctionLoader.link(SEGMENT$vkCmdDrawIndirectCount, DESCRIPTOR$vkCmdDrawIndirectCount);
        SEGMENT$vkCmdDrawIndexedIndirectCount = loader.apply("vkCmdDrawIndexedIndirectCount");
        HANDLE$vkCmdDrawIndexedIndirectCount = RawFunctionLoader.link(SEGMENT$vkCmdDrawIndexedIndirectCount, DESCRIPTOR$vkCmdDrawIndexedIndirectCount);
        SEGMENT$vkCmdSetCheckpointNV = loader.apply("vkCmdSetCheckpointNV");
        HANDLE$vkCmdSetCheckpointNV = RawFunctionLoader.link(SEGMENT$vkCmdSetCheckpointNV, DESCRIPTOR$vkCmdSetCheckpointNV);
        SEGMENT$vkGetQueueCheckpointDataNV = loader.apply("vkGetQueueCheckpointDataNV");
        HANDLE$vkGetQueueCheckpointDataNV = RawFunctionLoader.link(SEGMENT$vkGetQueueCheckpointDataNV, DESCRIPTOR$vkGetQueueCheckpointDataNV);
        SEGMENT$vkCmdBindTransformFeedbackBuffersEXT = loader.apply("vkCmdBindTransformFeedbackBuffersEXT");
        HANDLE$vkCmdBindTransformFeedbackBuffersEXT = RawFunctionLoader.link(SEGMENT$vkCmdBindTransformFeedbackBuffersEXT, DESCRIPTOR$vkCmdBindTransformFeedbackBuffersEXT);
        SEGMENT$vkCmdBeginTransformFeedbackEXT = loader.apply("vkCmdBeginTransformFeedbackEXT");
        HANDLE$vkCmdBeginTransformFeedbackEXT = RawFunctionLoader.link(SEGMENT$vkCmdBeginTransformFeedbackEXT, DESCRIPTOR$vkCmdBeginTransformFeedbackEXT);
        SEGMENT$vkCmdEndTransformFeedbackEXT = loader.apply("vkCmdEndTransformFeedbackEXT");
        HANDLE$vkCmdEndTransformFeedbackEXT = RawFunctionLoader.link(SEGMENT$vkCmdEndTransformFeedbackEXT, DESCRIPTOR$vkCmdEndTransformFeedbackEXT);
        SEGMENT$vkCmdBeginQueryIndexedEXT = loader.apply("vkCmdBeginQueryIndexedEXT");
        HANDLE$vkCmdBeginQueryIndexedEXT = RawFunctionLoader.link(SEGMENT$vkCmdBeginQueryIndexedEXT, DESCRIPTOR$vkCmdBeginQueryIndexedEXT);
        SEGMENT$vkCmdEndQueryIndexedEXT = loader.apply("vkCmdEndQueryIndexedEXT");
        HANDLE$vkCmdEndQueryIndexedEXT = RawFunctionLoader.link(SEGMENT$vkCmdEndQueryIndexedEXT, DESCRIPTOR$vkCmdEndQueryIndexedEXT);
        SEGMENT$vkCmdDrawIndirectByteCountEXT = loader.apply("vkCmdDrawIndirectByteCountEXT");
        HANDLE$vkCmdDrawIndirectByteCountEXT = RawFunctionLoader.link(SEGMENT$vkCmdDrawIndirectByteCountEXT, DESCRIPTOR$vkCmdDrawIndirectByteCountEXT);
        SEGMENT$vkCmdSetExclusiveScissorNV = loader.apply("vkCmdSetExclusiveScissorNV");
        HANDLE$vkCmdSetExclusiveScissorNV = RawFunctionLoader.link(SEGMENT$vkCmdSetExclusiveScissorNV, DESCRIPTOR$vkCmdSetExclusiveScissorNV);
        SEGMENT$vkCmdSetExclusiveScissorEnableNV = loader.apply("vkCmdSetExclusiveScissorEnableNV");
        HANDLE$vkCmdSetExclusiveScissorEnableNV = RawFunctionLoader.link(SEGMENT$vkCmdSetExclusiveScissorEnableNV, DESCRIPTOR$vkCmdSetExclusiveScissorEnableNV);
        SEGMENT$vkCmdBindShadingRateImageNV = loader.apply("vkCmdBindShadingRateImageNV");
        HANDLE$vkCmdBindShadingRateImageNV = RawFunctionLoader.link(SEGMENT$vkCmdBindShadingRateImageNV, DESCRIPTOR$vkCmdBindShadingRateImageNV);
        SEGMENT$vkCmdSetViewportShadingRatePaletteNV = loader.apply("vkCmdSetViewportShadingRatePaletteNV");
        HANDLE$vkCmdSetViewportShadingRatePaletteNV = RawFunctionLoader.link(SEGMENT$vkCmdSetViewportShadingRatePaletteNV, DESCRIPTOR$vkCmdSetViewportShadingRatePaletteNV);
        SEGMENT$vkCmdSetCoarseSampleOrderNV = loader.apply("vkCmdSetCoarseSampleOrderNV");
        HANDLE$vkCmdSetCoarseSampleOrderNV = RawFunctionLoader.link(SEGMENT$vkCmdSetCoarseSampleOrderNV, DESCRIPTOR$vkCmdSetCoarseSampleOrderNV);
        SEGMENT$vkCmdDrawMeshTasksNV = loader.apply("vkCmdDrawMeshTasksNV");
        HANDLE$vkCmdDrawMeshTasksNV = RawFunctionLoader.link(SEGMENT$vkCmdDrawMeshTasksNV, DESCRIPTOR$vkCmdDrawMeshTasksNV);
        SEGMENT$vkCmdDrawMeshTasksIndirectNV = loader.apply("vkCmdDrawMeshTasksIndirectNV");
        HANDLE$vkCmdDrawMeshTasksIndirectNV = RawFunctionLoader.link(SEGMENT$vkCmdDrawMeshTasksIndirectNV, DESCRIPTOR$vkCmdDrawMeshTasksIndirectNV);
        SEGMENT$vkCmdDrawMeshTasksIndirectCountNV = loader.apply("vkCmdDrawMeshTasksIndirectCountNV");
        HANDLE$vkCmdDrawMeshTasksIndirectCountNV = RawFunctionLoader.link(SEGMENT$vkCmdDrawMeshTasksIndirectCountNV, DESCRIPTOR$vkCmdDrawMeshTasksIndirectCountNV);
        SEGMENT$vkCmdDrawMeshTasksEXT = loader.apply("vkCmdDrawMeshTasksEXT");
        HANDLE$vkCmdDrawMeshTasksEXT = RawFunctionLoader.link(SEGMENT$vkCmdDrawMeshTasksEXT, DESCRIPTOR$vkCmdDrawMeshTasksEXT);
        SEGMENT$vkCmdDrawMeshTasksIndirectEXT = loader.apply("vkCmdDrawMeshTasksIndirectEXT");
        HANDLE$vkCmdDrawMeshTasksIndirectEXT = RawFunctionLoader.link(SEGMENT$vkCmdDrawMeshTasksIndirectEXT, DESCRIPTOR$vkCmdDrawMeshTasksIndirectEXT);
        SEGMENT$vkCmdDrawMeshTasksIndirectCountEXT = loader.apply("vkCmdDrawMeshTasksIndirectCountEXT");
        HANDLE$vkCmdDrawMeshTasksIndirectCountEXT = RawFunctionLoader.link(SEGMENT$vkCmdDrawMeshTasksIndirectCountEXT, DESCRIPTOR$vkCmdDrawMeshTasksIndirectCountEXT);
        SEGMENT$vkCompileDeferredNV = loader.apply("vkCompileDeferredNV");
        HANDLE$vkCompileDeferredNV = RawFunctionLoader.link(SEGMENT$vkCompileDeferredNV, DESCRIPTOR$vkCompileDeferredNV);
        SEGMENT$vkCreateAccelerationStructureNV = loader.apply("vkCreateAccelerationStructureNV");
        HANDLE$vkCreateAccelerationStructureNV = RawFunctionLoader.link(SEGMENT$vkCreateAccelerationStructureNV, DESCRIPTOR$vkCreateAccelerationStructureNV);
        SEGMENT$vkCmdBindInvocationMaskHUAWEI = loader.apply("vkCmdBindInvocationMaskHUAWEI");
        HANDLE$vkCmdBindInvocationMaskHUAWEI = RawFunctionLoader.link(SEGMENT$vkCmdBindInvocationMaskHUAWEI, DESCRIPTOR$vkCmdBindInvocationMaskHUAWEI);
        SEGMENT$vkDestroyAccelerationStructureKHR = loader.apply("vkDestroyAccelerationStructureKHR");
        HANDLE$vkDestroyAccelerationStructureKHR = RawFunctionLoader.link(SEGMENT$vkDestroyAccelerationStructureKHR, DESCRIPTOR$vkDestroyAccelerationStructureKHR);
        SEGMENT$vkDestroyAccelerationStructureNV = loader.apply("vkDestroyAccelerationStructureNV");
        HANDLE$vkDestroyAccelerationStructureNV = RawFunctionLoader.link(SEGMENT$vkDestroyAccelerationStructureNV, DESCRIPTOR$vkDestroyAccelerationStructureNV);
        SEGMENT$vkGetAccelerationStructureMemoryRequirementsNV = loader.apply("vkGetAccelerationStructureMemoryRequirementsNV");
        HANDLE$vkGetAccelerationStructureMemoryRequirementsNV = RawFunctionLoader.link(SEGMENT$vkGetAccelerationStructureMemoryRequirementsNV, DESCRIPTOR$vkGetAccelerationStructureMemoryRequirementsNV);
        SEGMENT$vkBindAccelerationStructureMemoryNV = loader.apply("vkBindAccelerationStructureMemoryNV");
        HANDLE$vkBindAccelerationStructureMemoryNV = RawFunctionLoader.link(SEGMENT$vkBindAccelerationStructureMemoryNV, DESCRIPTOR$vkBindAccelerationStructureMemoryNV);
        SEGMENT$vkCmdCopyAccelerationStructureNV = loader.apply("vkCmdCopyAccelerationStructureNV");
        HANDLE$vkCmdCopyAccelerationStructureNV = RawFunctionLoader.link(SEGMENT$vkCmdCopyAccelerationStructureNV, DESCRIPTOR$vkCmdCopyAccelerationStructureNV);
        SEGMENT$vkCmdCopyAccelerationStructureKHR = loader.apply("vkCmdCopyAccelerationStructureKHR");
        HANDLE$vkCmdCopyAccelerationStructureKHR = RawFunctionLoader.link(SEGMENT$vkCmdCopyAccelerationStructureKHR, DESCRIPTOR$vkCmdCopyAccelerationStructureKHR);
        SEGMENT$vkCopyAccelerationStructureKHR = loader.apply("vkCopyAccelerationStructureKHR");
        HANDLE$vkCopyAccelerationStructureKHR = RawFunctionLoader.link(SEGMENT$vkCopyAccelerationStructureKHR, DESCRIPTOR$vkCopyAccelerationStructureKHR);
        SEGMENT$vkCmdCopyAccelerationStructureToMemoryKHR = loader.apply("vkCmdCopyAccelerationStructureToMemoryKHR");
        HANDLE$vkCmdCopyAccelerationStructureToMemoryKHR = RawFunctionLoader.link(SEGMENT$vkCmdCopyAccelerationStructureToMemoryKHR, DESCRIPTOR$vkCmdCopyAccelerationStructureToMemoryKHR);
        SEGMENT$vkCopyAccelerationStructureToMemoryKHR = loader.apply("vkCopyAccelerationStructureToMemoryKHR");
        HANDLE$vkCopyAccelerationStructureToMemoryKHR = RawFunctionLoader.link(SEGMENT$vkCopyAccelerationStructureToMemoryKHR, DESCRIPTOR$vkCopyAccelerationStructureToMemoryKHR);
        SEGMENT$vkCmdCopyMemoryToAccelerationStructureKHR = loader.apply("vkCmdCopyMemoryToAccelerationStructureKHR");
        HANDLE$vkCmdCopyMemoryToAccelerationStructureKHR = RawFunctionLoader.link(SEGMENT$vkCmdCopyMemoryToAccelerationStructureKHR, DESCRIPTOR$vkCmdCopyMemoryToAccelerationStructureKHR);
        SEGMENT$vkCopyMemoryToAccelerationStructureKHR = loader.apply("vkCopyMemoryToAccelerationStructureKHR");
        HANDLE$vkCopyMemoryToAccelerationStructureKHR = RawFunctionLoader.link(SEGMENT$vkCopyMemoryToAccelerationStructureKHR, DESCRIPTOR$vkCopyMemoryToAccelerationStructureKHR);
        SEGMENT$vkCmdWriteAccelerationStructuresPropertiesKHR = loader.apply("vkCmdWriteAccelerationStructuresPropertiesKHR");
        HANDLE$vkCmdWriteAccelerationStructuresPropertiesKHR = RawFunctionLoader.link(SEGMENT$vkCmdWriteAccelerationStructuresPropertiesKHR, DESCRIPTOR$vkCmdWriteAccelerationStructuresPropertiesKHR);
        SEGMENT$vkCmdWriteAccelerationStructuresPropertiesNV = loader.apply("vkCmdWriteAccelerationStructuresPropertiesNV");
        HANDLE$vkCmdWriteAccelerationStructuresPropertiesNV = RawFunctionLoader.link(SEGMENT$vkCmdWriteAccelerationStructuresPropertiesNV, DESCRIPTOR$vkCmdWriteAccelerationStructuresPropertiesNV);
        SEGMENT$vkCmdBuildAccelerationStructureNV = loader.apply("vkCmdBuildAccelerationStructureNV");
        HANDLE$vkCmdBuildAccelerationStructureNV = RawFunctionLoader.link(SEGMENT$vkCmdBuildAccelerationStructureNV, DESCRIPTOR$vkCmdBuildAccelerationStructureNV);
        SEGMENT$vkWriteAccelerationStructuresPropertiesKHR = loader.apply("vkWriteAccelerationStructuresPropertiesKHR");
        HANDLE$vkWriteAccelerationStructuresPropertiesKHR = RawFunctionLoader.link(SEGMENT$vkWriteAccelerationStructuresPropertiesKHR, DESCRIPTOR$vkWriteAccelerationStructuresPropertiesKHR);
        SEGMENT$vkCmdTraceRaysKHR = loader.apply("vkCmdTraceRaysKHR");
        HANDLE$vkCmdTraceRaysKHR = RawFunctionLoader.link(SEGMENT$vkCmdTraceRaysKHR, DESCRIPTOR$vkCmdTraceRaysKHR);
        SEGMENT$vkCmdTraceRaysNV = loader.apply("vkCmdTraceRaysNV");
        HANDLE$vkCmdTraceRaysNV = RawFunctionLoader.link(SEGMENT$vkCmdTraceRaysNV, DESCRIPTOR$vkCmdTraceRaysNV);
        SEGMENT$vkGetRayTracingShaderGroupHandlesKHR = loader.apply("vkGetRayTracingShaderGroupHandlesKHR");
        HANDLE$vkGetRayTracingShaderGroupHandlesKHR = RawFunctionLoader.link(SEGMENT$vkGetRayTracingShaderGroupHandlesKHR, DESCRIPTOR$vkGetRayTracingShaderGroupHandlesKHR);
        SEGMENT$vkGetRayTracingCaptureReplayShaderGroupHandlesKHR = loader.apply("vkGetRayTracingCaptureReplayShaderGroupHandlesKHR");
        HANDLE$vkGetRayTracingCaptureReplayShaderGroupHandlesKHR = RawFunctionLoader.link(SEGMENT$vkGetRayTracingCaptureReplayShaderGroupHandlesKHR, DESCRIPTOR$vkGetRayTracingCaptureReplayShaderGroupHandlesKHR);
        SEGMENT$vkGetAccelerationStructureHandleNV = loader.apply("vkGetAccelerationStructureHandleNV");
        HANDLE$vkGetAccelerationStructureHandleNV = RawFunctionLoader.link(SEGMENT$vkGetAccelerationStructureHandleNV, DESCRIPTOR$vkGetAccelerationStructureHandleNV);
        SEGMENT$vkCreateRayTracingPipelinesNV = loader.apply("vkCreateRayTracingPipelinesNV");
        HANDLE$vkCreateRayTracingPipelinesNV = RawFunctionLoader.link(SEGMENT$vkCreateRayTracingPipelinesNV, DESCRIPTOR$vkCreateRayTracingPipelinesNV);
        SEGMENT$vkCreateRayTracingPipelinesKHR = loader.apply("vkCreateRayTracingPipelinesKHR");
        HANDLE$vkCreateRayTracingPipelinesKHR = RawFunctionLoader.link(SEGMENT$vkCreateRayTracingPipelinesKHR, DESCRIPTOR$vkCreateRayTracingPipelinesKHR);
        SEGMENT$vkGetPhysicalDeviceCooperativeMatrixPropertiesNV = loader.apply("vkGetPhysicalDeviceCooperativeMatrixPropertiesNV");
        HANDLE$vkGetPhysicalDeviceCooperativeMatrixPropertiesNV = RawFunctionLoader.link(SEGMENT$vkGetPhysicalDeviceCooperativeMatrixPropertiesNV, DESCRIPTOR$vkGetPhysicalDeviceCooperativeMatrixPropertiesNV);
        SEGMENT$vkCmdTraceRaysIndirectKHR = loader.apply("vkCmdTraceRaysIndirectKHR");
        HANDLE$vkCmdTraceRaysIndirectKHR = RawFunctionLoader.link(SEGMENT$vkCmdTraceRaysIndirectKHR, DESCRIPTOR$vkCmdTraceRaysIndirectKHR);
        SEGMENT$vkCmdTraceRaysIndirect2KHR = loader.apply("vkCmdTraceRaysIndirect2KHR");
        HANDLE$vkCmdTraceRaysIndirect2KHR = RawFunctionLoader.link(SEGMENT$vkCmdTraceRaysIndirect2KHR, DESCRIPTOR$vkCmdTraceRaysIndirect2KHR);
        SEGMENT$vkGetDeviceAccelerationStructureCompatibilityKHR = loader.apply("vkGetDeviceAccelerationStructureCompatibilityKHR");
        HANDLE$vkGetDeviceAccelerationStructureCompatibilityKHR = RawFunctionLoader.link(SEGMENT$vkGetDeviceAccelerationStructureCompatibilityKHR, DESCRIPTOR$vkGetDeviceAccelerationStructureCompatibilityKHR);
        SEGMENT$vkGetRayTracingShaderGroupStackSizeKHR = loader.apply("vkGetRayTracingShaderGroupStackSizeKHR");
        HANDLE$vkGetRayTracingShaderGroupStackSizeKHR = RawFunctionLoader.link(SEGMENT$vkGetRayTracingShaderGroupStackSizeKHR, DESCRIPTOR$vkGetRayTracingShaderGroupStackSizeKHR);
        SEGMENT$vkCmdSetRayTracingPipelineStackSizeKHR = loader.apply("vkCmdSetRayTracingPipelineStackSizeKHR");
        HANDLE$vkCmdSetRayTracingPipelineStackSizeKHR = RawFunctionLoader.link(SEGMENT$vkCmdSetRayTracingPipelineStackSizeKHR, DESCRIPTOR$vkCmdSetRayTracingPipelineStackSizeKHR);
        SEGMENT$vkGetImageViewHandleNVX = loader.apply("vkGetImageViewHandleNVX");
        HANDLE$vkGetImageViewHandleNVX = RawFunctionLoader.link(SEGMENT$vkGetImageViewHandleNVX, DESCRIPTOR$vkGetImageViewHandleNVX);
        SEGMENT$vkGetImageViewAddressNVX = loader.apply("vkGetImageViewAddressNVX");
        HANDLE$vkGetImageViewAddressNVX = RawFunctionLoader.link(SEGMENT$vkGetImageViewAddressNVX, DESCRIPTOR$vkGetImageViewAddressNVX);
        SEGMENT$vkGetPhysicalDeviceSurfacePresentModes2EXT = loader.apply("vkGetPhysicalDeviceSurfacePresentModes2EXT");
        HANDLE$vkGetPhysicalDeviceSurfacePresentModes2EXT = RawFunctionLoader.link(SEGMENT$vkGetPhysicalDeviceSurfacePresentModes2EXT, DESCRIPTOR$vkGetPhysicalDeviceSurfacePresentModes2EXT);
        SEGMENT$vkGetDeviceGroupSurfacePresentModes2EXT = loader.apply("vkGetDeviceGroupSurfacePresentModes2EXT");
        HANDLE$vkGetDeviceGroupSurfacePresentModes2EXT = RawFunctionLoader.link(SEGMENT$vkGetDeviceGroupSurfacePresentModes2EXT, DESCRIPTOR$vkGetDeviceGroupSurfacePresentModes2EXT);
        SEGMENT$vkAcquireFullScreenExclusiveModeEXT = loader.apply("vkAcquireFullScreenExclusiveModeEXT");
        HANDLE$vkAcquireFullScreenExclusiveModeEXT = RawFunctionLoader.link(SEGMENT$vkAcquireFullScreenExclusiveModeEXT, DESCRIPTOR$vkAcquireFullScreenExclusiveModeEXT);
        SEGMENT$vkReleaseFullScreenExclusiveModeEXT = loader.apply("vkReleaseFullScreenExclusiveModeEXT");
        HANDLE$vkReleaseFullScreenExclusiveModeEXT = RawFunctionLoader.link(SEGMENT$vkReleaseFullScreenExclusiveModeEXT, DESCRIPTOR$vkReleaseFullScreenExclusiveModeEXT);
        SEGMENT$vkEnumeratePhysicalDeviceQueueFamilyPerformanceQueryCountersKHR = loader.apply("vkEnumeratePhysicalDeviceQueueFamilyPerformanceQueryCountersKHR");
        HANDLE$vkEnumeratePhysicalDeviceQueueFamilyPerformanceQueryCountersKHR = RawFunctionLoader.link(SEGMENT$vkEnumeratePhysicalDeviceQueueFamilyPerformanceQueryCountersKHR, DESCRIPTOR$vkEnumeratePhysicalDeviceQueueFamilyPerformanceQueryCountersKHR);
        SEGMENT$vkGetPhysicalDeviceQueueFamilyPerformanceQueryPassesKHR = loader.apply("vkGetPhysicalDeviceQueueFamilyPerformanceQueryPassesKHR");
        HANDLE$vkGetPhysicalDeviceQueueFamilyPerformanceQueryPassesKHR = RawFunctionLoader.link(SEGMENT$vkGetPhysicalDeviceQueueFamilyPerformanceQueryPassesKHR, DESCRIPTOR$vkGetPhysicalDeviceQueueFamilyPerformanceQueryPassesKHR);
        SEGMENT$vkAcquireProfilingLockKHR = loader.apply("vkAcquireProfilingLockKHR");
        HANDLE$vkAcquireProfilingLockKHR = RawFunctionLoader.link(SEGMENT$vkAcquireProfilingLockKHR, DESCRIPTOR$vkAcquireProfilingLockKHR);
        SEGMENT$vkReleaseProfilingLockKHR = loader.apply("vkReleaseProfilingLockKHR");
        HANDLE$vkReleaseProfilingLockKHR = RawFunctionLoader.link(SEGMENT$vkReleaseProfilingLockKHR, DESCRIPTOR$vkReleaseProfilingLockKHR);
        SEGMENT$vkGetImageDrmFormatModifierPropertiesEXT = loader.apply("vkGetImageDrmFormatModifierPropertiesEXT");
        HANDLE$vkGetImageDrmFormatModifierPropertiesEXT = RawFunctionLoader.link(SEGMENT$vkGetImageDrmFormatModifierPropertiesEXT, DESCRIPTOR$vkGetImageDrmFormatModifierPropertiesEXT);
        SEGMENT$vkGetBufferOpaqueCaptureAddress = loader.apply("vkGetBufferOpaqueCaptureAddress");
        HANDLE$vkGetBufferOpaqueCaptureAddress = RawFunctionLoader.link(SEGMENT$vkGetBufferOpaqueCaptureAddress, DESCRIPTOR$vkGetBufferOpaqueCaptureAddress);
        SEGMENT$vkGetBufferDeviceAddress = loader.apply("vkGetBufferDeviceAddress");
        HANDLE$vkGetBufferDeviceAddress = RawFunctionLoader.link(SEGMENT$vkGetBufferDeviceAddress, DESCRIPTOR$vkGetBufferDeviceAddress);
        SEGMENT$vkGetPhysicalDeviceSupportedFramebufferMixedSamplesCombinationsNV = loader.apply("vkGetPhysicalDeviceSupportedFramebufferMixedSamplesCombinationsNV");
        HANDLE$vkGetPhysicalDeviceSupportedFramebufferMixedSamplesCombinationsNV = RawFunctionLoader.link(SEGMENT$vkGetPhysicalDeviceSupportedFramebufferMixedSamplesCombinationsNV, DESCRIPTOR$vkGetPhysicalDeviceSupportedFramebufferMixedSamplesCombinationsNV);
        SEGMENT$vkInitializePerformanceApiINTEL = loader.apply("vkInitializePerformanceApiINTEL");
        HANDLE$vkInitializePerformanceApiINTEL = RawFunctionLoader.link(SEGMENT$vkInitializePerformanceApiINTEL, DESCRIPTOR$vkInitializePerformanceApiINTEL);
        SEGMENT$vkUninitializePerformanceApiINTEL = loader.apply("vkUninitializePerformanceApiINTEL");
        HANDLE$vkUninitializePerformanceApiINTEL = RawFunctionLoader.link(SEGMENT$vkUninitializePerformanceApiINTEL, DESCRIPTOR$vkUninitializePerformanceApiINTEL);
        SEGMENT$vkCmdSetPerformanceMarkerINTEL = loader.apply("vkCmdSetPerformanceMarkerINTEL");
        HANDLE$vkCmdSetPerformanceMarkerINTEL = RawFunctionLoader.link(SEGMENT$vkCmdSetPerformanceMarkerINTEL, DESCRIPTOR$vkCmdSetPerformanceMarkerINTEL);
        SEGMENT$vkCmdSetPerformanceStreamMarkerINTEL = loader.apply("vkCmdSetPerformanceStreamMarkerINTEL");
        HANDLE$vkCmdSetPerformanceStreamMarkerINTEL = RawFunctionLoader.link(SEGMENT$vkCmdSetPerformanceStreamMarkerINTEL, DESCRIPTOR$vkCmdSetPerformanceStreamMarkerINTEL);
        SEGMENT$vkCmdSetPerformanceOverrideINTEL = loader.apply("vkCmdSetPerformanceOverrideINTEL");
        HANDLE$vkCmdSetPerformanceOverrideINTEL = RawFunctionLoader.link(SEGMENT$vkCmdSetPerformanceOverrideINTEL, DESCRIPTOR$vkCmdSetPerformanceOverrideINTEL);
        SEGMENT$vkAcquirePerformanceConfigurationINTEL = loader.apply("vkAcquirePerformanceConfigurationINTEL");
        HANDLE$vkAcquirePerformanceConfigurationINTEL = RawFunctionLoader.link(SEGMENT$vkAcquirePerformanceConfigurationINTEL, DESCRIPTOR$vkAcquirePerformanceConfigurationINTEL);
        SEGMENT$vkReleasePerformanceConfigurationINTEL = loader.apply("vkReleasePerformanceConfigurationINTEL");
        HANDLE$vkReleasePerformanceConfigurationINTEL = RawFunctionLoader.link(SEGMENT$vkReleasePerformanceConfigurationINTEL, DESCRIPTOR$vkReleasePerformanceConfigurationINTEL);
        SEGMENT$vkQueueSetPerformanceConfigurationINTEL = loader.apply("vkQueueSetPerformanceConfigurationINTEL");
        HANDLE$vkQueueSetPerformanceConfigurationINTEL = RawFunctionLoader.link(SEGMENT$vkQueueSetPerformanceConfigurationINTEL, DESCRIPTOR$vkQueueSetPerformanceConfigurationINTEL);
        SEGMENT$vkGetPerformanceParameterINTEL = loader.apply("vkGetPerformanceParameterINTEL");
        HANDLE$vkGetPerformanceParameterINTEL = RawFunctionLoader.link(SEGMENT$vkGetPerformanceParameterINTEL, DESCRIPTOR$vkGetPerformanceParameterINTEL);
        SEGMENT$vkGetDeviceMemoryOpaqueCaptureAddress = loader.apply("vkGetDeviceMemoryOpaqueCaptureAddress");
        HANDLE$vkGetDeviceMemoryOpaqueCaptureAddress = RawFunctionLoader.link(SEGMENT$vkGetDeviceMemoryOpaqueCaptureAddress, DESCRIPTOR$vkGetDeviceMemoryOpaqueCaptureAddress);
        SEGMENT$vkGetPipelineExecutablePropertiesKHR = loader.apply("vkGetPipelineExecutablePropertiesKHR");
        HANDLE$vkGetPipelineExecutablePropertiesKHR = RawFunctionLoader.link(SEGMENT$vkGetPipelineExecutablePropertiesKHR, DESCRIPTOR$vkGetPipelineExecutablePropertiesKHR);
        SEGMENT$vkGetPipelineExecutableStatisticsKHR = loader.apply("vkGetPipelineExecutableStatisticsKHR");
        HANDLE$vkGetPipelineExecutableStatisticsKHR = RawFunctionLoader.link(SEGMENT$vkGetPipelineExecutableStatisticsKHR, DESCRIPTOR$vkGetPipelineExecutableStatisticsKHR);
        SEGMENT$vkGetPipelineExecutableInternalRepresentationsKHR = loader.apply("vkGetPipelineExecutableInternalRepresentationsKHR");
        HANDLE$vkGetPipelineExecutableInternalRepresentationsKHR = RawFunctionLoader.link(SEGMENT$vkGetPipelineExecutableInternalRepresentationsKHR, DESCRIPTOR$vkGetPipelineExecutableInternalRepresentationsKHR);
        SEGMENT$vkCmdSetLineStippleKHR = loader.apply("vkCmdSetLineStippleKHR");
        HANDLE$vkCmdSetLineStippleKHR = RawFunctionLoader.link(SEGMENT$vkCmdSetLineStippleKHR, DESCRIPTOR$vkCmdSetLineStippleKHR);
        SEGMENT$vkCreateAccelerationStructureKHR = loader.apply("vkCreateAccelerationStructureKHR");
        HANDLE$vkCreateAccelerationStructureKHR = RawFunctionLoader.link(SEGMENT$vkCreateAccelerationStructureKHR, DESCRIPTOR$vkCreateAccelerationStructureKHR);
        SEGMENT$vkCmdBuildAccelerationStructuresKHR = loader.apply("vkCmdBuildAccelerationStructuresKHR");
        HANDLE$vkCmdBuildAccelerationStructuresKHR = RawFunctionLoader.link(SEGMENT$vkCmdBuildAccelerationStructuresKHR, DESCRIPTOR$vkCmdBuildAccelerationStructuresKHR);
        SEGMENT$vkCmdBuildAccelerationStructuresIndirectKHR = loader.apply("vkCmdBuildAccelerationStructuresIndirectKHR");
        HANDLE$vkCmdBuildAccelerationStructuresIndirectKHR = RawFunctionLoader.link(SEGMENT$vkCmdBuildAccelerationStructuresIndirectKHR, DESCRIPTOR$vkCmdBuildAccelerationStructuresIndirectKHR);
        SEGMENT$vkBuildAccelerationStructuresKHR = loader.apply("vkBuildAccelerationStructuresKHR");
        HANDLE$vkBuildAccelerationStructuresKHR = RawFunctionLoader.link(SEGMENT$vkBuildAccelerationStructuresKHR, DESCRIPTOR$vkBuildAccelerationStructuresKHR);
        SEGMENT$vkGetAccelerationStructureDeviceAddressKHR = loader.apply("vkGetAccelerationStructureDeviceAddressKHR");
        HANDLE$vkGetAccelerationStructureDeviceAddressKHR = RawFunctionLoader.link(SEGMENT$vkGetAccelerationStructureDeviceAddressKHR, DESCRIPTOR$vkGetAccelerationStructureDeviceAddressKHR);
        SEGMENT$vkCreateDeferredOperationKHR = loader.apply("vkCreateDeferredOperationKHR");
        HANDLE$vkCreateDeferredOperationKHR = RawFunctionLoader.link(SEGMENT$vkCreateDeferredOperationKHR, DESCRIPTOR$vkCreateDeferredOperationKHR);
        SEGMENT$vkDestroyDeferredOperationKHR = loader.apply("vkDestroyDeferredOperationKHR");
        HANDLE$vkDestroyDeferredOperationKHR = RawFunctionLoader.link(SEGMENT$vkDestroyDeferredOperationKHR, DESCRIPTOR$vkDestroyDeferredOperationKHR);
        SEGMENT$vkGetDeferredOperationMaxConcurrencyKHR = loader.apply("vkGetDeferredOperationMaxConcurrencyKHR");
        HANDLE$vkGetDeferredOperationMaxConcurrencyKHR = RawFunctionLoader.link(SEGMENT$vkGetDeferredOperationMaxConcurrencyKHR, DESCRIPTOR$vkGetDeferredOperationMaxConcurrencyKHR);
        SEGMENT$vkGetDeferredOperationResultKHR = loader.apply("vkGetDeferredOperationResultKHR");
        HANDLE$vkGetDeferredOperationResultKHR = RawFunctionLoader.link(SEGMENT$vkGetDeferredOperationResultKHR, DESCRIPTOR$vkGetDeferredOperationResultKHR);
        SEGMENT$vkDeferredOperationJoinKHR = loader.apply("vkDeferredOperationJoinKHR");
        HANDLE$vkDeferredOperationJoinKHR = RawFunctionLoader.link(SEGMENT$vkDeferredOperationJoinKHR, DESCRIPTOR$vkDeferredOperationJoinKHR);
        SEGMENT$vkGetPipelineIndirectMemoryRequirementsNV = loader.apply("vkGetPipelineIndirectMemoryRequirementsNV");
        HANDLE$vkGetPipelineIndirectMemoryRequirementsNV = RawFunctionLoader.link(SEGMENT$vkGetPipelineIndirectMemoryRequirementsNV, DESCRIPTOR$vkGetPipelineIndirectMemoryRequirementsNV);
        SEGMENT$vkGetPipelineIndirectDeviceAddressNV = loader.apply("vkGetPipelineIndirectDeviceAddressNV");
        HANDLE$vkGetPipelineIndirectDeviceAddressNV = RawFunctionLoader.link(SEGMENT$vkGetPipelineIndirectDeviceAddressNV, DESCRIPTOR$vkGetPipelineIndirectDeviceAddressNV);
        SEGMENT$vkAntiLagUpdateAMD = loader.apply("vkAntiLagUpdateAMD");
        HANDLE$vkAntiLagUpdateAMD = RawFunctionLoader.link(SEGMENT$vkAntiLagUpdateAMD, DESCRIPTOR$vkAntiLagUpdateAMD);
        SEGMENT$vkCmdSetCullMode = loader.apply("vkCmdSetCullMode");
        HANDLE$vkCmdSetCullMode = RawFunctionLoader.link(SEGMENT$vkCmdSetCullMode, DESCRIPTOR$vkCmdSetCullMode);
        SEGMENT$vkCmdSetFrontFace = loader.apply("vkCmdSetFrontFace");
        HANDLE$vkCmdSetFrontFace = RawFunctionLoader.link(SEGMENT$vkCmdSetFrontFace, DESCRIPTOR$vkCmdSetFrontFace);
        SEGMENT$vkCmdSetPrimitiveTopology = loader.apply("vkCmdSetPrimitiveTopology");
        HANDLE$vkCmdSetPrimitiveTopology = RawFunctionLoader.link(SEGMENT$vkCmdSetPrimitiveTopology, DESCRIPTOR$vkCmdSetPrimitiveTopology);
        SEGMENT$vkCmdSetViewportWithCount = loader.apply("vkCmdSetViewportWithCount");
        HANDLE$vkCmdSetViewportWithCount = RawFunctionLoader.link(SEGMENT$vkCmdSetViewportWithCount, DESCRIPTOR$vkCmdSetViewportWithCount);
        SEGMENT$vkCmdSetScissorWithCount = loader.apply("vkCmdSetScissorWithCount");
        HANDLE$vkCmdSetScissorWithCount = RawFunctionLoader.link(SEGMENT$vkCmdSetScissorWithCount, DESCRIPTOR$vkCmdSetScissorWithCount);
        SEGMENT$vkCmdBindIndexBuffer2KHR = loader.apply("vkCmdBindIndexBuffer2KHR");
        HANDLE$vkCmdBindIndexBuffer2KHR = RawFunctionLoader.link(SEGMENT$vkCmdBindIndexBuffer2KHR, DESCRIPTOR$vkCmdBindIndexBuffer2KHR);
        SEGMENT$vkCmdBindVertexBuffers2 = loader.apply("vkCmdBindVertexBuffers2");
        HANDLE$vkCmdBindVertexBuffers2 = RawFunctionLoader.link(SEGMENT$vkCmdBindVertexBuffers2, DESCRIPTOR$vkCmdBindVertexBuffers2);
        SEGMENT$vkCmdSetDepthTestEnable = loader.apply("vkCmdSetDepthTestEnable");
        HANDLE$vkCmdSetDepthTestEnable = RawFunctionLoader.link(SEGMENT$vkCmdSetDepthTestEnable, DESCRIPTOR$vkCmdSetDepthTestEnable);
        SEGMENT$vkCmdSetDepthWriteEnable = loader.apply("vkCmdSetDepthWriteEnable");
        HANDLE$vkCmdSetDepthWriteEnable = RawFunctionLoader.link(SEGMENT$vkCmdSetDepthWriteEnable, DESCRIPTOR$vkCmdSetDepthWriteEnable);
        SEGMENT$vkCmdSetDepthCompareOp = loader.apply("vkCmdSetDepthCompareOp");
        HANDLE$vkCmdSetDepthCompareOp = RawFunctionLoader.link(SEGMENT$vkCmdSetDepthCompareOp, DESCRIPTOR$vkCmdSetDepthCompareOp);
        SEGMENT$vkCmdSetDepthBoundsTestEnable = loader.apply("vkCmdSetDepthBoundsTestEnable");
        HANDLE$vkCmdSetDepthBoundsTestEnable = RawFunctionLoader.link(SEGMENT$vkCmdSetDepthBoundsTestEnable, DESCRIPTOR$vkCmdSetDepthBoundsTestEnable);
        SEGMENT$vkCmdSetStencilTestEnable = loader.apply("vkCmdSetStencilTestEnable");
        HANDLE$vkCmdSetStencilTestEnable = RawFunctionLoader.link(SEGMENT$vkCmdSetStencilTestEnable, DESCRIPTOR$vkCmdSetStencilTestEnable);
        SEGMENT$vkCmdSetStencilOp = loader.apply("vkCmdSetStencilOp");
        HANDLE$vkCmdSetStencilOp = RawFunctionLoader.link(SEGMENT$vkCmdSetStencilOp, DESCRIPTOR$vkCmdSetStencilOp);
        SEGMENT$vkCmdSetPatchControlPointsEXT = loader.apply("vkCmdSetPatchControlPointsEXT");
        HANDLE$vkCmdSetPatchControlPointsEXT = RawFunctionLoader.link(SEGMENT$vkCmdSetPatchControlPointsEXT, DESCRIPTOR$vkCmdSetPatchControlPointsEXT);
        SEGMENT$vkCmdSetRasterizerDiscardEnable = loader.apply("vkCmdSetRasterizerDiscardEnable");
        HANDLE$vkCmdSetRasterizerDiscardEnable = RawFunctionLoader.link(SEGMENT$vkCmdSetRasterizerDiscardEnable, DESCRIPTOR$vkCmdSetRasterizerDiscardEnable);
        SEGMENT$vkCmdSetDepthBiasEnable = loader.apply("vkCmdSetDepthBiasEnable");
        HANDLE$vkCmdSetDepthBiasEnable = RawFunctionLoader.link(SEGMENT$vkCmdSetDepthBiasEnable, DESCRIPTOR$vkCmdSetDepthBiasEnable);
        SEGMENT$vkCmdSetLogicOpEXT = loader.apply("vkCmdSetLogicOpEXT");
        HANDLE$vkCmdSetLogicOpEXT = RawFunctionLoader.link(SEGMENT$vkCmdSetLogicOpEXT, DESCRIPTOR$vkCmdSetLogicOpEXT);
        SEGMENT$vkCmdSetPrimitiveRestartEnable = loader.apply("vkCmdSetPrimitiveRestartEnable");
        HANDLE$vkCmdSetPrimitiveRestartEnable = RawFunctionLoader.link(SEGMENT$vkCmdSetPrimitiveRestartEnable, DESCRIPTOR$vkCmdSetPrimitiveRestartEnable);
        SEGMENT$vkCmdSetTessellationDomainOriginEXT = loader.apply("vkCmdSetTessellationDomainOriginEXT");
        HANDLE$vkCmdSetTessellationDomainOriginEXT = RawFunctionLoader.link(SEGMENT$vkCmdSetTessellationDomainOriginEXT, DESCRIPTOR$vkCmdSetTessellationDomainOriginEXT);
        SEGMENT$vkCmdSetDepthClampEnableEXT = loader.apply("vkCmdSetDepthClampEnableEXT");
        HANDLE$vkCmdSetDepthClampEnableEXT = RawFunctionLoader.link(SEGMENT$vkCmdSetDepthClampEnableEXT, DESCRIPTOR$vkCmdSetDepthClampEnableEXT);
        SEGMENT$vkCmdSetPolygonModeEXT = loader.apply("vkCmdSetPolygonModeEXT");
        HANDLE$vkCmdSetPolygonModeEXT = RawFunctionLoader.link(SEGMENT$vkCmdSetPolygonModeEXT, DESCRIPTOR$vkCmdSetPolygonModeEXT);
        SEGMENT$vkCmdSetRasterizationSamplesEXT = loader.apply("vkCmdSetRasterizationSamplesEXT");
        HANDLE$vkCmdSetRasterizationSamplesEXT = RawFunctionLoader.link(SEGMENT$vkCmdSetRasterizationSamplesEXT, DESCRIPTOR$vkCmdSetRasterizationSamplesEXT);
        SEGMENT$vkCmdSetSampleMaskEXT = loader.apply("vkCmdSetSampleMaskEXT");
        HANDLE$vkCmdSetSampleMaskEXT = RawFunctionLoader.link(SEGMENT$vkCmdSetSampleMaskEXT, DESCRIPTOR$vkCmdSetSampleMaskEXT);
        SEGMENT$vkCmdSetAlphaToCoverageEnableEXT = loader.apply("vkCmdSetAlphaToCoverageEnableEXT");
        HANDLE$vkCmdSetAlphaToCoverageEnableEXT = RawFunctionLoader.link(SEGMENT$vkCmdSetAlphaToCoverageEnableEXT, DESCRIPTOR$vkCmdSetAlphaToCoverageEnableEXT);
        SEGMENT$vkCmdSetAlphaToOneEnableEXT = loader.apply("vkCmdSetAlphaToOneEnableEXT");
        HANDLE$vkCmdSetAlphaToOneEnableEXT = RawFunctionLoader.link(SEGMENT$vkCmdSetAlphaToOneEnableEXT, DESCRIPTOR$vkCmdSetAlphaToOneEnableEXT);
        SEGMENT$vkCmdSetLogicOpEnableEXT = loader.apply("vkCmdSetLogicOpEnableEXT");
        HANDLE$vkCmdSetLogicOpEnableEXT = RawFunctionLoader.link(SEGMENT$vkCmdSetLogicOpEnableEXT, DESCRIPTOR$vkCmdSetLogicOpEnableEXT);
        SEGMENT$vkCmdSetColorBlendEnableEXT = loader.apply("vkCmdSetColorBlendEnableEXT");
        HANDLE$vkCmdSetColorBlendEnableEXT = RawFunctionLoader.link(SEGMENT$vkCmdSetColorBlendEnableEXT, DESCRIPTOR$vkCmdSetColorBlendEnableEXT);
        SEGMENT$vkCmdSetColorBlendEquationEXT = loader.apply("vkCmdSetColorBlendEquationEXT");
        HANDLE$vkCmdSetColorBlendEquationEXT = RawFunctionLoader.link(SEGMENT$vkCmdSetColorBlendEquationEXT, DESCRIPTOR$vkCmdSetColorBlendEquationEXT);
        SEGMENT$vkCmdSetColorWriteMaskEXT = loader.apply("vkCmdSetColorWriteMaskEXT");
        HANDLE$vkCmdSetColorWriteMaskEXT = RawFunctionLoader.link(SEGMENT$vkCmdSetColorWriteMaskEXT, DESCRIPTOR$vkCmdSetColorWriteMaskEXT);
        SEGMENT$vkCmdSetRasterizationStreamEXT = loader.apply("vkCmdSetRasterizationStreamEXT");
        HANDLE$vkCmdSetRasterizationStreamEXT = RawFunctionLoader.link(SEGMENT$vkCmdSetRasterizationStreamEXT, DESCRIPTOR$vkCmdSetRasterizationStreamEXT);
        SEGMENT$vkCmdSetConservativeRasterizationModeEXT = loader.apply("vkCmdSetConservativeRasterizationModeEXT");
        HANDLE$vkCmdSetConservativeRasterizationModeEXT = RawFunctionLoader.link(SEGMENT$vkCmdSetConservativeRasterizationModeEXT, DESCRIPTOR$vkCmdSetConservativeRasterizationModeEXT);
        SEGMENT$vkCmdSetExtraPrimitiveOverestimationSizeEXT = loader.apply("vkCmdSetExtraPrimitiveOverestimationSizeEXT");
        HANDLE$vkCmdSetExtraPrimitiveOverestimationSizeEXT = RawFunctionLoader.link(SEGMENT$vkCmdSetExtraPrimitiveOverestimationSizeEXT, DESCRIPTOR$vkCmdSetExtraPrimitiveOverestimationSizeEXT);
        SEGMENT$vkCmdSetDepthClipEnableEXT = loader.apply("vkCmdSetDepthClipEnableEXT");
        HANDLE$vkCmdSetDepthClipEnableEXT = RawFunctionLoader.link(SEGMENT$vkCmdSetDepthClipEnableEXT, DESCRIPTOR$vkCmdSetDepthClipEnableEXT);
        SEGMENT$vkCmdSetSampleLocationsEnableEXT = loader.apply("vkCmdSetSampleLocationsEnableEXT");
        HANDLE$vkCmdSetSampleLocationsEnableEXT = RawFunctionLoader.link(SEGMENT$vkCmdSetSampleLocationsEnableEXT, DESCRIPTOR$vkCmdSetSampleLocationsEnableEXT);
        SEGMENT$vkCmdSetColorBlendAdvancedEXT = loader.apply("vkCmdSetColorBlendAdvancedEXT");
        HANDLE$vkCmdSetColorBlendAdvancedEXT = RawFunctionLoader.link(SEGMENT$vkCmdSetColorBlendAdvancedEXT, DESCRIPTOR$vkCmdSetColorBlendAdvancedEXT);
        SEGMENT$vkCmdSetProvokingVertexModeEXT = loader.apply("vkCmdSetProvokingVertexModeEXT");
        HANDLE$vkCmdSetProvokingVertexModeEXT = RawFunctionLoader.link(SEGMENT$vkCmdSetProvokingVertexModeEXT, DESCRIPTOR$vkCmdSetProvokingVertexModeEXT);
        SEGMENT$vkCmdSetLineRasterizationModeEXT = loader.apply("vkCmdSetLineRasterizationModeEXT");
        HANDLE$vkCmdSetLineRasterizationModeEXT = RawFunctionLoader.link(SEGMENT$vkCmdSetLineRasterizationModeEXT, DESCRIPTOR$vkCmdSetLineRasterizationModeEXT);
        SEGMENT$vkCmdSetLineStippleEnableEXT = loader.apply("vkCmdSetLineStippleEnableEXT");
        HANDLE$vkCmdSetLineStippleEnableEXT = RawFunctionLoader.link(SEGMENT$vkCmdSetLineStippleEnableEXT, DESCRIPTOR$vkCmdSetLineStippleEnableEXT);
        SEGMENT$vkCmdSetDepthClipNegativeOneToOneEXT = loader.apply("vkCmdSetDepthClipNegativeOneToOneEXT");
        HANDLE$vkCmdSetDepthClipNegativeOneToOneEXT = RawFunctionLoader.link(SEGMENT$vkCmdSetDepthClipNegativeOneToOneEXT, DESCRIPTOR$vkCmdSetDepthClipNegativeOneToOneEXT);
        SEGMENT$vkCmdSetViewportWScalingEnableNV = loader.apply("vkCmdSetViewportWScalingEnableNV");
        HANDLE$vkCmdSetViewportWScalingEnableNV = RawFunctionLoader.link(SEGMENT$vkCmdSetViewportWScalingEnableNV, DESCRIPTOR$vkCmdSetViewportWScalingEnableNV);
        SEGMENT$vkCmdSetViewportSwizzleNV = loader.apply("vkCmdSetViewportSwizzleNV");
        HANDLE$vkCmdSetViewportSwizzleNV = RawFunctionLoader.link(SEGMENT$vkCmdSetViewportSwizzleNV, DESCRIPTOR$vkCmdSetViewportSwizzleNV);
        SEGMENT$vkCmdSetCoverageToColorEnableNV = loader.apply("vkCmdSetCoverageToColorEnableNV");
        HANDLE$vkCmdSetCoverageToColorEnableNV = RawFunctionLoader.link(SEGMENT$vkCmdSetCoverageToColorEnableNV, DESCRIPTOR$vkCmdSetCoverageToColorEnableNV);
        SEGMENT$vkCmdSetCoverageToColorLocationNV = loader.apply("vkCmdSetCoverageToColorLocationNV");
        HANDLE$vkCmdSetCoverageToColorLocationNV = RawFunctionLoader.link(SEGMENT$vkCmdSetCoverageToColorLocationNV, DESCRIPTOR$vkCmdSetCoverageToColorLocationNV);
        SEGMENT$vkCmdSetCoverageModulationModeNV = loader.apply("vkCmdSetCoverageModulationModeNV");
        HANDLE$vkCmdSetCoverageModulationModeNV = RawFunctionLoader.link(SEGMENT$vkCmdSetCoverageModulationModeNV, DESCRIPTOR$vkCmdSetCoverageModulationModeNV);
        SEGMENT$vkCmdSetCoverageModulationTableEnableNV = loader.apply("vkCmdSetCoverageModulationTableEnableNV");
        HANDLE$vkCmdSetCoverageModulationTableEnableNV = RawFunctionLoader.link(SEGMENT$vkCmdSetCoverageModulationTableEnableNV, DESCRIPTOR$vkCmdSetCoverageModulationTableEnableNV);
        SEGMENT$vkCmdSetCoverageModulationTableNV = loader.apply("vkCmdSetCoverageModulationTableNV");
        HANDLE$vkCmdSetCoverageModulationTableNV = RawFunctionLoader.link(SEGMENT$vkCmdSetCoverageModulationTableNV, DESCRIPTOR$vkCmdSetCoverageModulationTableNV);
        SEGMENT$vkCmdSetShadingRateImageEnableNV = loader.apply("vkCmdSetShadingRateImageEnableNV");
        HANDLE$vkCmdSetShadingRateImageEnableNV = RawFunctionLoader.link(SEGMENT$vkCmdSetShadingRateImageEnableNV, DESCRIPTOR$vkCmdSetShadingRateImageEnableNV);
        SEGMENT$vkCmdSetCoverageReductionModeNV = loader.apply("vkCmdSetCoverageReductionModeNV");
        HANDLE$vkCmdSetCoverageReductionModeNV = RawFunctionLoader.link(SEGMENT$vkCmdSetCoverageReductionModeNV, DESCRIPTOR$vkCmdSetCoverageReductionModeNV);
        SEGMENT$vkCmdSetRepresentativeFragmentTestEnableNV = loader.apply("vkCmdSetRepresentativeFragmentTestEnableNV");
        HANDLE$vkCmdSetRepresentativeFragmentTestEnableNV = RawFunctionLoader.link(SEGMENT$vkCmdSetRepresentativeFragmentTestEnableNV, DESCRIPTOR$vkCmdSetRepresentativeFragmentTestEnableNV);
        SEGMENT$vkCreatePrivateDataSlot = loader.apply("vkCreatePrivateDataSlot");
        HANDLE$vkCreatePrivateDataSlot = RawFunctionLoader.link(SEGMENT$vkCreatePrivateDataSlot, DESCRIPTOR$vkCreatePrivateDataSlot);
        SEGMENT$vkDestroyPrivateDataSlot = loader.apply("vkDestroyPrivateDataSlot");
        HANDLE$vkDestroyPrivateDataSlot = RawFunctionLoader.link(SEGMENT$vkDestroyPrivateDataSlot, DESCRIPTOR$vkDestroyPrivateDataSlot);
        SEGMENT$vkSetPrivateData = loader.apply("vkSetPrivateData");
        HANDLE$vkSetPrivateData = RawFunctionLoader.link(SEGMENT$vkSetPrivateData, DESCRIPTOR$vkSetPrivateData);
        SEGMENT$vkGetPrivateData = loader.apply("vkGetPrivateData");
        HANDLE$vkGetPrivateData = RawFunctionLoader.link(SEGMENT$vkGetPrivateData, DESCRIPTOR$vkGetPrivateData);
        SEGMENT$vkCmdCopyBuffer2 = loader.apply("vkCmdCopyBuffer2");
        HANDLE$vkCmdCopyBuffer2 = RawFunctionLoader.link(SEGMENT$vkCmdCopyBuffer2, DESCRIPTOR$vkCmdCopyBuffer2);
        SEGMENT$vkCmdCopyImage2 = loader.apply("vkCmdCopyImage2");
        HANDLE$vkCmdCopyImage2 = RawFunctionLoader.link(SEGMENT$vkCmdCopyImage2, DESCRIPTOR$vkCmdCopyImage2);
        SEGMENT$vkCmdBlitImage2 = loader.apply("vkCmdBlitImage2");
        HANDLE$vkCmdBlitImage2 = RawFunctionLoader.link(SEGMENT$vkCmdBlitImage2, DESCRIPTOR$vkCmdBlitImage2);
        SEGMENT$vkCmdCopyBufferToImage2 = loader.apply("vkCmdCopyBufferToImage2");
        HANDLE$vkCmdCopyBufferToImage2 = RawFunctionLoader.link(SEGMENT$vkCmdCopyBufferToImage2, DESCRIPTOR$vkCmdCopyBufferToImage2);
        SEGMENT$vkCmdCopyImageToBuffer2 = loader.apply("vkCmdCopyImageToBuffer2");
        HANDLE$vkCmdCopyImageToBuffer2 = RawFunctionLoader.link(SEGMENT$vkCmdCopyImageToBuffer2, DESCRIPTOR$vkCmdCopyImageToBuffer2);
        SEGMENT$vkCmdResolveImage2 = loader.apply("vkCmdResolveImage2");
        HANDLE$vkCmdResolveImage2 = RawFunctionLoader.link(SEGMENT$vkCmdResolveImage2, DESCRIPTOR$vkCmdResolveImage2);
        SEGMENT$vkCmdRefreshObjectsKHR = loader.apply("vkCmdRefreshObjectsKHR");
        HANDLE$vkCmdRefreshObjectsKHR = RawFunctionLoader.link(SEGMENT$vkCmdRefreshObjectsKHR, DESCRIPTOR$vkCmdRefreshObjectsKHR);
        SEGMENT$vkGetPhysicalDeviceRefreshableObjectTypesKHR = loader.apply("vkGetPhysicalDeviceRefreshableObjectTypesKHR");
        HANDLE$vkGetPhysicalDeviceRefreshableObjectTypesKHR = RawFunctionLoader.link(SEGMENT$vkGetPhysicalDeviceRefreshableObjectTypesKHR, DESCRIPTOR$vkGetPhysicalDeviceRefreshableObjectTypesKHR);
        SEGMENT$vkCmdSetFragmentShadingRateKHR = loader.apply("vkCmdSetFragmentShadingRateKHR");
        HANDLE$vkCmdSetFragmentShadingRateKHR = RawFunctionLoader.link(SEGMENT$vkCmdSetFragmentShadingRateKHR, DESCRIPTOR$vkCmdSetFragmentShadingRateKHR);
        SEGMENT$vkGetPhysicalDeviceFragmentShadingRatesKHR = loader.apply("vkGetPhysicalDeviceFragmentShadingRatesKHR");
        HANDLE$vkGetPhysicalDeviceFragmentShadingRatesKHR = RawFunctionLoader.link(SEGMENT$vkGetPhysicalDeviceFragmentShadingRatesKHR, DESCRIPTOR$vkGetPhysicalDeviceFragmentShadingRatesKHR);
        SEGMENT$vkCmdSetFragmentShadingRateEnumNV = loader.apply("vkCmdSetFragmentShadingRateEnumNV");
        HANDLE$vkCmdSetFragmentShadingRateEnumNV = RawFunctionLoader.link(SEGMENT$vkCmdSetFragmentShadingRateEnumNV, DESCRIPTOR$vkCmdSetFragmentShadingRateEnumNV);
        SEGMENT$vkGetAccelerationStructureBuildSizesKHR = loader.apply("vkGetAccelerationStructureBuildSizesKHR");
        HANDLE$vkGetAccelerationStructureBuildSizesKHR = RawFunctionLoader.link(SEGMENT$vkGetAccelerationStructureBuildSizesKHR, DESCRIPTOR$vkGetAccelerationStructureBuildSizesKHR);
        SEGMENT$vkCmdSetVertexInputEXT = loader.apply("vkCmdSetVertexInputEXT");
        HANDLE$vkCmdSetVertexInputEXT = RawFunctionLoader.link(SEGMENT$vkCmdSetVertexInputEXT, DESCRIPTOR$vkCmdSetVertexInputEXT);
        SEGMENT$vkCmdSetColorWriteEnableEXT = loader.apply("vkCmdSetColorWriteEnableEXT");
        HANDLE$vkCmdSetColorWriteEnableEXT = RawFunctionLoader.link(SEGMENT$vkCmdSetColorWriteEnableEXT, DESCRIPTOR$vkCmdSetColorWriteEnableEXT);
        SEGMENT$vkCmdSetEvent2 = loader.apply("vkCmdSetEvent2");
        HANDLE$vkCmdSetEvent2 = RawFunctionLoader.link(SEGMENT$vkCmdSetEvent2, DESCRIPTOR$vkCmdSetEvent2);
        SEGMENT$vkCmdResetEvent2 = loader.apply("vkCmdResetEvent2");
        HANDLE$vkCmdResetEvent2 = RawFunctionLoader.link(SEGMENT$vkCmdResetEvent2, DESCRIPTOR$vkCmdResetEvent2);
        SEGMENT$vkCmdWaitEvents2 = loader.apply("vkCmdWaitEvents2");
        HANDLE$vkCmdWaitEvents2 = RawFunctionLoader.link(SEGMENT$vkCmdWaitEvents2, DESCRIPTOR$vkCmdWaitEvents2);
        SEGMENT$vkCmdPipelineBarrier2 = loader.apply("vkCmdPipelineBarrier2");
        HANDLE$vkCmdPipelineBarrier2 = RawFunctionLoader.link(SEGMENT$vkCmdPipelineBarrier2, DESCRIPTOR$vkCmdPipelineBarrier2);
        SEGMENT$vkQueueSubmit2 = loader.apply("vkQueueSubmit2");
        HANDLE$vkQueueSubmit2 = RawFunctionLoader.link(SEGMENT$vkQueueSubmit2, DESCRIPTOR$vkQueueSubmit2);
        SEGMENT$vkCmdWriteTimestamp2 = loader.apply("vkCmdWriteTimestamp2");
        HANDLE$vkCmdWriteTimestamp2 = RawFunctionLoader.link(SEGMENT$vkCmdWriteTimestamp2, DESCRIPTOR$vkCmdWriteTimestamp2);
        SEGMENT$vkCmdWriteBufferMarker2AMD = loader.apply("vkCmdWriteBufferMarker2AMD");
        HANDLE$vkCmdWriteBufferMarker2AMD = RawFunctionLoader.link(SEGMENT$vkCmdWriteBufferMarker2AMD, DESCRIPTOR$vkCmdWriteBufferMarker2AMD);
        SEGMENT$vkGetQueueCheckpointData2NV = loader.apply("vkGetQueueCheckpointData2NV");
        HANDLE$vkGetQueueCheckpointData2NV = RawFunctionLoader.link(SEGMENT$vkGetQueueCheckpointData2NV, DESCRIPTOR$vkGetQueueCheckpointData2NV);
        SEGMENT$vkCopyMemoryToImageEXT = loader.apply("vkCopyMemoryToImageEXT");
        HANDLE$vkCopyMemoryToImageEXT = RawFunctionLoader.link(SEGMENT$vkCopyMemoryToImageEXT, DESCRIPTOR$vkCopyMemoryToImageEXT);
        SEGMENT$vkCopyImageToMemoryEXT = loader.apply("vkCopyImageToMemoryEXT");
        HANDLE$vkCopyImageToMemoryEXT = RawFunctionLoader.link(SEGMENT$vkCopyImageToMemoryEXT, DESCRIPTOR$vkCopyImageToMemoryEXT);
        SEGMENT$vkCopyImageToImageEXT = loader.apply("vkCopyImageToImageEXT");
        HANDLE$vkCopyImageToImageEXT = RawFunctionLoader.link(SEGMENT$vkCopyImageToImageEXT, DESCRIPTOR$vkCopyImageToImageEXT);
        SEGMENT$vkTransitionImageLayoutEXT = loader.apply("vkTransitionImageLayoutEXT");
        HANDLE$vkTransitionImageLayoutEXT = RawFunctionLoader.link(SEGMENT$vkTransitionImageLayoutEXT, DESCRIPTOR$vkTransitionImageLayoutEXT);
        SEGMENT$vkCmdDecompressMemoryNV = loader.apply("vkCmdDecompressMemoryNV");
        HANDLE$vkCmdDecompressMemoryNV = RawFunctionLoader.link(SEGMENT$vkCmdDecompressMemoryNV, DESCRIPTOR$vkCmdDecompressMemoryNV);
        SEGMENT$vkCmdDecompressMemoryIndirectCountNV = loader.apply("vkCmdDecompressMemoryIndirectCountNV");
        HANDLE$vkCmdDecompressMemoryIndirectCountNV = RawFunctionLoader.link(SEGMENT$vkCmdDecompressMemoryIndirectCountNV, DESCRIPTOR$vkCmdDecompressMemoryIndirectCountNV);
        SEGMENT$vkCreateCuModuleNVX = loader.apply("vkCreateCuModuleNVX");
        HANDLE$vkCreateCuModuleNVX = RawFunctionLoader.link(SEGMENT$vkCreateCuModuleNVX, DESCRIPTOR$vkCreateCuModuleNVX);
        SEGMENT$vkCreateCuFunctionNVX = loader.apply("vkCreateCuFunctionNVX");
        HANDLE$vkCreateCuFunctionNVX = RawFunctionLoader.link(SEGMENT$vkCreateCuFunctionNVX, DESCRIPTOR$vkCreateCuFunctionNVX);
        SEGMENT$vkDestroyCuModuleNVX = loader.apply("vkDestroyCuModuleNVX");
        HANDLE$vkDestroyCuModuleNVX = RawFunctionLoader.link(SEGMENT$vkDestroyCuModuleNVX, DESCRIPTOR$vkDestroyCuModuleNVX);
        SEGMENT$vkDestroyCuFunctionNVX = loader.apply("vkDestroyCuFunctionNVX");
        HANDLE$vkDestroyCuFunctionNVX = RawFunctionLoader.link(SEGMENT$vkDestroyCuFunctionNVX, DESCRIPTOR$vkDestroyCuFunctionNVX);
        SEGMENT$vkCmdCuLaunchKernelNVX = loader.apply("vkCmdCuLaunchKernelNVX");
        HANDLE$vkCmdCuLaunchKernelNVX = RawFunctionLoader.link(SEGMENT$vkCmdCuLaunchKernelNVX, DESCRIPTOR$vkCmdCuLaunchKernelNVX);
        SEGMENT$vkGetDescriptorSetLayoutSizeEXT = loader.apply("vkGetDescriptorSetLayoutSizeEXT");
        HANDLE$vkGetDescriptorSetLayoutSizeEXT = RawFunctionLoader.link(SEGMENT$vkGetDescriptorSetLayoutSizeEXT, DESCRIPTOR$vkGetDescriptorSetLayoutSizeEXT);
        SEGMENT$vkGetDescriptorSetLayoutBindingOffsetEXT = loader.apply("vkGetDescriptorSetLayoutBindingOffsetEXT");
        HANDLE$vkGetDescriptorSetLayoutBindingOffsetEXT = RawFunctionLoader.link(SEGMENT$vkGetDescriptorSetLayoutBindingOffsetEXT, DESCRIPTOR$vkGetDescriptorSetLayoutBindingOffsetEXT);
        SEGMENT$vkGetDescriptorEXT = loader.apply("vkGetDescriptorEXT");
        HANDLE$vkGetDescriptorEXT = RawFunctionLoader.link(SEGMENT$vkGetDescriptorEXT, DESCRIPTOR$vkGetDescriptorEXT);
        SEGMENT$vkCmdBindDescriptorBuffersEXT = loader.apply("vkCmdBindDescriptorBuffersEXT");
        HANDLE$vkCmdBindDescriptorBuffersEXT = RawFunctionLoader.link(SEGMENT$vkCmdBindDescriptorBuffersEXT, DESCRIPTOR$vkCmdBindDescriptorBuffersEXT);
        SEGMENT$vkCmdSetDescriptorBufferOffsetsEXT = loader.apply("vkCmdSetDescriptorBufferOffsetsEXT");
        HANDLE$vkCmdSetDescriptorBufferOffsetsEXT = RawFunctionLoader.link(SEGMENT$vkCmdSetDescriptorBufferOffsetsEXT, DESCRIPTOR$vkCmdSetDescriptorBufferOffsetsEXT);
        SEGMENT$vkCmdBindDescriptorBufferEmbeddedSamplersEXT = loader.apply("vkCmdBindDescriptorBufferEmbeddedSamplersEXT");
        HANDLE$vkCmdBindDescriptorBufferEmbeddedSamplersEXT = RawFunctionLoader.link(SEGMENT$vkCmdBindDescriptorBufferEmbeddedSamplersEXT, DESCRIPTOR$vkCmdBindDescriptorBufferEmbeddedSamplersEXT);
        SEGMENT$vkGetBufferOpaqueCaptureDescriptorDataEXT = loader.apply("vkGetBufferOpaqueCaptureDescriptorDataEXT");
        HANDLE$vkGetBufferOpaqueCaptureDescriptorDataEXT = RawFunctionLoader.link(SEGMENT$vkGetBufferOpaqueCaptureDescriptorDataEXT, DESCRIPTOR$vkGetBufferOpaqueCaptureDescriptorDataEXT);
        SEGMENT$vkGetImageOpaqueCaptureDescriptorDataEXT = loader.apply("vkGetImageOpaqueCaptureDescriptorDataEXT");
        HANDLE$vkGetImageOpaqueCaptureDescriptorDataEXT = RawFunctionLoader.link(SEGMENT$vkGetImageOpaqueCaptureDescriptorDataEXT, DESCRIPTOR$vkGetImageOpaqueCaptureDescriptorDataEXT);
        SEGMENT$vkGetImageViewOpaqueCaptureDescriptorDataEXT = loader.apply("vkGetImageViewOpaqueCaptureDescriptorDataEXT");
        HANDLE$vkGetImageViewOpaqueCaptureDescriptorDataEXT = RawFunctionLoader.link(SEGMENT$vkGetImageViewOpaqueCaptureDescriptorDataEXT, DESCRIPTOR$vkGetImageViewOpaqueCaptureDescriptorDataEXT);
        SEGMENT$vkGetSamplerOpaqueCaptureDescriptorDataEXT = loader.apply("vkGetSamplerOpaqueCaptureDescriptorDataEXT");
        HANDLE$vkGetSamplerOpaqueCaptureDescriptorDataEXT = RawFunctionLoader.link(SEGMENT$vkGetSamplerOpaqueCaptureDescriptorDataEXT, DESCRIPTOR$vkGetSamplerOpaqueCaptureDescriptorDataEXT);
        SEGMENT$vkGetAccelerationStructureOpaqueCaptureDescriptorDataEXT = loader.apply("vkGetAccelerationStructureOpaqueCaptureDescriptorDataEXT");
        HANDLE$vkGetAccelerationStructureOpaqueCaptureDescriptorDataEXT = RawFunctionLoader.link(SEGMENT$vkGetAccelerationStructureOpaqueCaptureDescriptorDataEXT, DESCRIPTOR$vkGetAccelerationStructureOpaqueCaptureDescriptorDataEXT);
        SEGMENT$vkSetDeviceMemoryPriorityEXT = loader.apply("vkSetDeviceMemoryPriorityEXT");
        HANDLE$vkSetDeviceMemoryPriorityEXT = RawFunctionLoader.link(SEGMENT$vkSetDeviceMemoryPriorityEXT, DESCRIPTOR$vkSetDeviceMemoryPriorityEXT);
        SEGMENT$vkWaitForPresentKHR = loader.apply("vkWaitForPresentKHR");
        HANDLE$vkWaitForPresentKHR = RawFunctionLoader.link(SEGMENT$vkWaitForPresentKHR, DESCRIPTOR$vkWaitForPresentKHR);
        SEGMENT$vkCreateBufferCollectionFUCHSIA = loader.apply("vkCreateBufferCollectionFUCHSIA");
        HANDLE$vkCreateBufferCollectionFUCHSIA = RawFunctionLoader.link(SEGMENT$vkCreateBufferCollectionFUCHSIA, DESCRIPTOR$vkCreateBufferCollectionFUCHSIA);
        SEGMENT$vkSetBufferCollectionBufferConstraintsFUCHSIA = loader.apply("vkSetBufferCollectionBufferConstraintsFUCHSIA");
        HANDLE$vkSetBufferCollectionBufferConstraintsFUCHSIA = RawFunctionLoader.link(SEGMENT$vkSetBufferCollectionBufferConstraintsFUCHSIA, DESCRIPTOR$vkSetBufferCollectionBufferConstraintsFUCHSIA);
        SEGMENT$vkSetBufferCollectionImageConstraintsFUCHSIA = loader.apply("vkSetBufferCollectionImageConstraintsFUCHSIA");
        HANDLE$vkSetBufferCollectionImageConstraintsFUCHSIA = RawFunctionLoader.link(SEGMENT$vkSetBufferCollectionImageConstraintsFUCHSIA, DESCRIPTOR$vkSetBufferCollectionImageConstraintsFUCHSIA);
        SEGMENT$vkDestroyBufferCollectionFUCHSIA = loader.apply("vkDestroyBufferCollectionFUCHSIA");
        HANDLE$vkDestroyBufferCollectionFUCHSIA = RawFunctionLoader.link(SEGMENT$vkDestroyBufferCollectionFUCHSIA, DESCRIPTOR$vkDestroyBufferCollectionFUCHSIA);
        SEGMENT$vkGetBufferCollectionPropertiesFUCHSIA = loader.apply("vkGetBufferCollectionPropertiesFUCHSIA");
        HANDLE$vkGetBufferCollectionPropertiesFUCHSIA = RawFunctionLoader.link(SEGMENT$vkGetBufferCollectionPropertiesFUCHSIA, DESCRIPTOR$vkGetBufferCollectionPropertiesFUCHSIA);
        SEGMENT$vkCreateCudaModuleNV = loader.apply("vkCreateCudaModuleNV");
        HANDLE$vkCreateCudaModuleNV = RawFunctionLoader.link(SEGMENT$vkCreateCudaModuleNV, DESCRIPTOR$vkCreateCudaModuleNV);
        SEGMENT$vkGetCudaModuleCacheNV = loader.apply("vkGetCudaModuleCacheNV");
        HANDLE$vkGetCudaModuleCacheNV = RawFunctionLoader.link(SEGMENT$vkGetCudaModuleCacheNV, DESCRIPTOR$vkGetCudaModuleCacheNV);
        SEGMENT$vkCreateCudaFunctionNV = loader.apply("vkCreateCudaFunctionNV");
        HANDLE$vkCreateCudaFunctionNV = RawFunctionLoader.link(SEGMENT$vkCreateCudaFunctionNV, DESCRIPTOR$vkCreateCudaFunctionNV);
        SEGMENT$vkDestroyCudaModuleNV = loader.apply("vkDestroyCudaModuleNV");
        HANDLE$vkDestroyCudaModuleNV = RawFunctionLoader.link(SEGMENT$vkDestroyCudaModuleNV, DESCRIPTOR$vkDestroyCudaModuleNV);
        SEGMENT$vkDestroyCudaFunctionNV = loader.apply("vkDestroyCudaFunctionNV");
        HANDLE$vkDestroyCudaFunctionNV = RawFunctionLoader.link(SEGMENT$vkDestroyCudaFunctionNV, DESCRIPTOR$vkDestroyCudaFunctionNV);
        SEGMENT$vkCmdCudaLaunchKernelNV = loader.apply("vkCmdCudaLaunchKernelNV");
        HANDLE$vkCmdCudaLaunchKernelNV = RawFunctionLoader.link(SEGMENT$vkCmdCudaLaunchKernelNV, DESCRIPTOR$vkCmdCudaLaunchKernelNV);
        SEGMENT$vkCmdBeginRendering = loader.apply("vkCmdBeginRendering");
        HANDLE$vkCmdBeginRendering = RawFunctionLoader.link(SEGMENT$vkCmdBeginRendering, DESCRIPTOR$vkCmdBeginRendering);
        SEGMENT$vkCmdEndRendering = loader.apply("vkCmdEndRendering");
        HANDLE$vkCmdEndRendering = RawFunctionLoader.link(SEGMENT$vkCmdEndRendering, DESCRIPTOR$vkCmdEndRendering);
        SEGMENT$vkGetDescriptorSetLayoutHostMappingInfoVALVE = loader.apply("vkGetDescriptorSetLayoutHostMappingInfoVALVE");
        HANDLE$vkGetDescriptorSetLayoutHostMappingInfoVALVE = RawFunctionLoader.link(SEGMENT$vkGetDescriptorSetLayoutHostMappingInfoVALVE, DESCRIPTOR$vkGetDescriptorSetLayoutHostMappingInfoVALVE);
        SEGMENT$vkGetDescriptorSetHostMappingVALVE = loader.apply("vkGetDescriptorSetHostMappingVALVE");
        HANDLE$vkGetDescriptorSetHostMappingVALVE = RawFunctionLoader.link(SEGMENT$vkGetDescriptorSetHostMappingVALVE, DESCRIPTOR$vkGetDescriptorSetHostMappingVALVE);
        SEGMENT$vkCreateMicromapEXT = loader.apply("vkCreateMicromapEXT");
        HANDLE$vkCreateMicromapEXT = RawFunctionLoader.link(SEGMENT$vkCreateMicromapEXT, DESCRIPTOR$vkCreateMicromapEXT);
        SEGMENT$vkCmdBuildMicromapsEXT = loader.apply("vkCmdBuildMicromapsEXT");
        HANDLE$vkCmdBuildMicromapsEXT = RawFunctionLoader.link(SEGMENT$vkCmdBuildMicromapsEXT, DESCRIPTOR$vkCmdBuildMicromapsEXT);
        SEGMENT$vkBuildMicromapsEXT = loader.apply("vkBuildMicromapsEXT");
        HANDLE$vkBuildMicromapsEXT = RawFunctionLoader.link(SEGMENT$vkBuildMicromapsEXT, DESCRIPTOR$vkBuildMicromapsEXT);
        SEGMENT$vkDestroyMicromapEXT = loader.apply("vkDestroyMicromapEXT");
        HANDLE$vkDestroyMicromapEXT = RawFunctionLoader.link(SEGMENT$vkDestroyMicromapEXT, DESCRIPTOR$vkDestroyMicromapEXT);
        SEGMENT$vkCmdCopyMicromapEXT = loader.apply("vkCmdCopyMicromapEXT");
        HANDLE$vkCmdCopyMicromapEXT = RawFunctionLoader.link(SEGMENT$vkCmdCopyMicromapEXT, DESCRIPTOR$vkCmdCopyMicromapEXT);
        SEGMENT$vkCopyMicromapEXT = loader.apply("vkCopyMicromapEXT");
        HANDLE$vkCopyMicromapEXT = RawFunctionLoader.link(SEGMENT$vkCopyMicromapEXT, DESCRIPTOR$vkCopyMicromapEXT);
        SEGMENT$vkCmdCopyMicromapToMemoryEXT = loader.apply("vkCmdCopyMicromapToMemoryEXT");
        HANDLE$vkCmdCopyMicromapToMemoryEXT = RawFunctionLoader.link(SEGMENT$vkCmdCopyMicromapToMemoryEXT, DESCRIPTOR$vkCmdCopyMicromapToMemoryEXT);
        SEGMENT$vkCopyMicromapToMemoryEXT = loader.apply("vkCopyMicromapToMemoryEXT");
        HANDLE$vkCopyMicromapToMemoryEXT = RawFunctionLoader.link(SEGMENT$vkCopyMicromapToMemoryEXT, DESCRIPTOR$vkCopyMicromapToMemoryEXT);
        SEGMENT$vkCmdCopyMemoryToMicromapEXT = loader.apply("vkCmdCopyMemoryToMicromapEXT");
        HANDLE$vkCmdCopyMemoryToMicromapEXT = RawFunctionLoader.link(SEGMENT$vkCmdCopyMemoryToMicromapEXT, DESCRIPTOR$vkCmdCopyMemoryToMicromapEXT);
        SEGMENT$vkCopyMemoryToMicromapEXT = loader.apply("vkCopyMemoryToMicromapEXT");
        HANDLE$vkCopyMemoryToMicromapEXT = RawFunctionLoader.link(SEGMENT$vkCopyMemoryToMicromapEXT, DESCRIPTOR$vkCopyMemoryToMicromapEXT);
        SEGMENT$vkCmdWriteMicromapsPropertiesEXT = loader.apply("vkCmdWriteMicromapsPropertiesEXT");
        HANDLE$vkCmdWriteMicromapsPropertiesEXT = RawFunctionLoader.link(SEGMENT$vkCmdWriteMicromapsPropertiesEXT, DESCRIPTOR$vkCmdWriteMicromapsPropertiesEXT);
        SEGMENT$vkWriteMicromapsPropertiesEXT = loader.apply("vkWriteMicromapsPropertiesEXT");
        HANDLE$vkWriteMicromapsPropertiesEXT = RawFunctionLoader.link(SEGMENT$vkWriteMicromapsPropertiesEXT, DESCRIPTOR$vkWriteMicromapsPropertiesEXT);
        SEGMENT$vkGetDeviceMicromapCompatibilityEXT = loader.apply("vkGetDeviceMicromapCompatibilityEXT");
        HANDLE$vkGetDeviceMicromapCompatibilityEXT = RawFunctionLoader.link(SEGMENT$vkGetDeviceMicromapCompatibilityEXT, DESCRIPTOR$vkGetDeviceMicromapCompatibilityEXT);
        SEGMENT$vkGetMicromapBuildSizesEXT = loader.apply("vkGetMicromapBuildSizesEXT");
        HANDLE$vkGetMicromapBuildSizesEXT = RawFunctionLoader.link(SEGMENT$vkGetMicromapBuildSizesEXT, DESCRIPTOR$vkGetMicromapBuildSizesEXT);
        SEGMENT$vkGetShaderModuleIdentifierEXT = loader.apply("vkGetShaderModuleIdentifierEXT");
        HANDLE$vkGetShaderModuleIdentifierEXT = RawFunctionLoader.link(SEGMENT$vkGetShaderModuleIdentifierEXT, DESCRIPTOR$vkGetShaderModuleIdentifierEXT);
        SEGMENT$vkGetShaderModuleCreateInfoIdentifierEXT = loader.apply("vkGetShaderModuleCreateInfoIdentifierEXT");
        HANDLE$vkGetShaderModuleCreateInfoIdentifierEXT = RawFunctionLoader.link(SEGMENT$vkGetShaderModuleCreateInfoIdentifierEXT, DESCRIPTOR$vkGetShaderModuleCreateInfoIdentifierEXT);
        SEGMENT$vkGetImageSubresourceLayout2KHR = loader.apply("vkGetImageSubresourceLayout2KHR");
        HANDLE$vkGetImageSubresourceLayout2KHR = RawFunctionLoader.link(SEGMENT$vkGetImageSubresourceLayout2KHR, DESCRIPTOR$vkGetImageSubresourceLayout2KHR);
        SEGMENT$vkGetPipelinePropertiesEXT = loader.apply("vkGetPipelinePropertiesEXT");
        HANDLE$vkGetPipelinePropertiesEXT = RawFunctionLoader.link(SEGMENT$vkGetPipelinePropertiesEXT, DESCRIPTOR$vkGetPipelinePropertiesEXT);
        SEGMENT$vkExportMetalObjectsEXT = loader.apply("vkExportMetalObjectsEXT");
        HANDLE$vkExportMetalObjectsEXT = RawFunctionLoader.link(SEGMENT$vkExportMetalObjectsEXT, DESCRIPTOR$vkExportMetalObjectsEXT);
        SEGMENT$vkGetFramebufferTilePropertiesQCOM = loader.apply("vkGetFramebufferTilePropertiesQCOM");
        HANDLE$vkGetFramebufferTilePropertiesQCOM = RawFunctionLoader.link(SEGMENT$vkGetFramebufferTilePropertiesQCOM, DESCRIPTOR$vkGetFramebufferTilePropertiesQCOM);
        SEGMENT$vkGetDynamicRenderingTilePropertiesQCOM = loader.apply("vkGetDynamicRenderingTilePropertiesQCOM");
        HANDLE$vkGetDynamicRenderingTilePropertiesQCOM = RawFunctionLoader.link(SEGMENT$vkGetDynamicRenderingTilePropertiesQCOM, DESCRIPTOR$vkGetDynamicRenderingTilePropertiesQCOM);
        SEGMENT$vkGetPhysicalDeviceOpticalFlowImageFormatsNV = loader.apply("vkGetPhysicalDeviceOpticalFlowImageFormatsNV");
        HANDLE$vkGetPhysicalDeviceOpticalFlowImageFormatsNV = RawFunctionLoader.link(SEGMENT$vkGetPhysicalDeviceOpticalFlowImageFormatsNV, DESCRIPTOR$vkGetPhysicalDeviceOpticalFlowImageFormatsNV);
        SEGMENT$vkCreateOpticalFlowSessionNV = loader.apply("vkCreateOpticalFlowSessionNV");
        HANDLE$vkCreateOpticalFlowSessionNV = RawFunctionLoader.link(SEGMENT$vkCreateOpticalFlowSessionNV, DESCRIPTOR$vkCreateOpticalFlowSessionNV);
        SEGMENT$vkDestroyOpticalFlowSessionNV = loader.apply("vkDestroyOpticalFlowSessionNV");
        HANDLE$vkDestroyOpticalFlowSessionNV = RawFunctionLoader.link(SEGMENT$vkDestroyOpticalFlowSessionNV, DESCRIPTOR$vkDestroyOpticalFlowSessionNV);
        SEGMENT$vkBindOpticalFlowSessionImageNV = loader.apply("vkBindOpticalFlowSessionImageNV");
        HANDLE$vkBindOpticalFlowSessionImageNV = RawFunctionLoader.link(SEGMENT$vkBindOpticalFlowSessionImageNV, DESCRIPTOR$vkBindOpticalFlowSessionImageNV);
        SEGMENT$vkCmdOpticalFlowExecuteNV = loader.apply("vkCmdOpticalFlowExecuteNV");
        HANDLE$vkCmdOpticalFlowExecuteNV = RawFunctionLoader.link(SEGMENT$vkCmdOpticalFlowExecuteNV, DESCRIPTOR$vkCmdOpticalFlowExecuteNV);
        SEGMENT$vkGetDeviceFaultInfoEXT = loader.apply("vkGetDeviceFaultInfoEXT");
        HANDLE$vkGetDeviceFaultInfoEXT = RawFunctionLoader.link(SEGMENT$vkGetDeviceFaultInfoEXT, DESCRIPTOR$vkGetDeviceFaultInfoEXT);
        SEGMENT$vkCmdSetDepthBias2EXT = loader.apply("vkCmdSetDepthBias2EXT");
        HANDLE$vkCmdSetDepthBias2EXT = RawFunctionLoader.link(SEGMENT$vkCmdSetDepthBias2EXT, DESCRIPTOR$vkCmdSetDepthBias2EXT);
        SEGMENT$vkReleaseSwapchainImagesEXT = loader.apply("vkReleaseSwapchainImagesEXT");
        HANDLE$vkReleaseSwapchainImagesEXT = RawFunctionLoader.link(SEGMENT$vkReleaseSwapchainImagesEXT, DESCRIPTOR$vkReleaseSwapchainImagesEXT);
        SEGMENT$vkGetDeviceImageSubresourceLayoutKHR = loader.apply("vkGetDeviceImageSubresourceLayoutKHR");
        HANDLE$vkGetDeviceImageSubresourceLayoutKHR = RawFunctionLoader.link(SEGMENT$vkGetDeviceImageSubresourceLayoutKHR, DESCRIPTOR$vkGetDeviceImageSubresourceLayoutKHR);
        SEGMENT$vkMapMemory2KHR = loader.apply("vkMapMemory2KHR");
        HANDLE$vkMapMemory2KHR = RawFunctionLoader.link(SEGMENT$vkMapMemory2KHR, DESCRIPTOR$vkMapMemory2KHR);
        SEGMENT$vkUnmapMemory2KHR = loader.apply("vkUnmapMemory2KHR");
        HANDLE$vkUnmapMemory2KHR = RawFunctionLoader.link(SEGMENT$vkUnmapMemory2KHR, DESCRIPTOR$vkUnmapMemory2KHR);
        SEGMENT$vkCreateShadersEXT = loader.apply("vkCreateShadersEXT");
        HANDLE$vkCreateShadersEXT = RawFunctionLoader.link(SEGMENT$vkCreateShadersEXT, DESCRIPTOR$vkCreateShadersEXT);
        SEGMENT$vkDestroyShaderEXT = loader.apply("vkDestroyShaderEXT");
        HANDLE$vkDestroyShaderEXT = RawFunctionLoader.link(SEGMENT$vkDestroyShaderEXT, DESCRIPTOR$vkDestroyShaderEXT);
        SEGMENT$vkGetShaderBinaryDataEXT = loader.apply("vkGetShaderBinaryDataEXT");
        HANDLE$vkGetShaderBinaryDataEXT = RawFunctionLoader.link(SEGMENT$vkGetShaderBinaryDataEXT, DESCRIPTOR$vkGetShaderBinaryDataEXT);
        SEGMENT$vkCmdBindShadersEXT = loader.apply("vkCmdBindShadersEXT");
        HANDLE$vkCmdBindShadersEXT = RawFunctionLoader.link(SEGMENT$vkCmdBindShadersEXT, DESCRIPTOR$vkCmdBindShadersEXT);
        SEGMENT$vkGetScreenBufferPropertiesQNX = loader.apply("vkGetScreenBufferPropertiesQNX");
        HANDLE$vkGetScreenBufferPropertiesQNX = RawFunctionLoader.link(SEGMENT$vkGetScreenBufferPropertiesQNX, DESCRIPTOR$vkGetScreenBufferPropertiesQNX);
        SEGMENT$vkGetPhysicalDeviceCooperativeMatrixPropertiesKHR = loader.apply("vkGetPhysicalDeviceCooperativeMatrixPropertiesKHR");
        HANDLE$vkGetPhysicalDeviceCooperativeMatrixPropertiesKHR = RawFunctionLoader.link(SEGMENT$vkGetPhysicalDeviceCooperativeMatrixPropertiesKHR, DESCRIPTOR$vkGetPhysicalDeviceCooperativeMatrixPropertiesKHR);
        SEGMENT$vkGetExecutionGraphPipelineScratchSizeAMDX = loader.apply("vkGetExecutionGraphPipelineScratchSizeAMDX");
        HANDLE$vkGetExecutionGraphPipelineScratchSizeAMDX = RawFunctionLoader.link(SEGMENT$vkGetExecutionGraphPipelineScratchSizeAMDX, DESCRIPTOR$vkGetExecutionGraphPipelineScratchSizeAMDX);
        SEGMENT$vkGetExecutionGraphPipelineNodeIndexAMDX = loader.apply("vkGetExecutionGraphPipelineNodeIndexAMDX");
        HANDLE$vkGetExecutionGraphPipelineNodeIndexAMDX = RawFunctionLoader.link(SEGMENT$vkGetExecutionGraphPipelineNodeIndexAMDX, DESCRIPTOR$vkGetExecutionGraphPipelineNodeIndexAMDX);
        SEGMENT$vkCreateExecutionGraphPipelinesAMDX = loader.apply("vkCreateExecutionGraphPipelinesAMDX");
        HANDLE$vkCreateExecutionGraphPipelinesAMDX = RawFunctionLoader.link(SEGMENT$vkCreateExecutionGraphPipelinesAMDX, DESCRIPTOR$vkCreateExecutionGraphPipelinesAMDX);
        SEGMENT$vkCmdInitializeGraphScratchMemoryAMDX = loader.apply("vkCmdInitializeGraphScratchMemoryAMDX");
        HANDLE$vkCmdInitializeGraphScratchMemoryAMDX = RawFunctionLoader.link(SEGMENT$vkCmdInitializeGraphScratchMemoryAMDX, DESCRIPTOR$vkCmdInitializeGraphScratchMemoryAMDX);
        SEGMENT$vkCmdDispatchGraphAMDX = loader.apply("vkCmdDispatchGraphAMDX");
        HANDLE$vkCmdDispatchGraphAMDX = RawFunctionLoader.link(SEGMENT$vkCmdDispatchGraphAMDX, DESCRIPTOR$vkCmdDispatchGraphAMDX);
        SEGMENT$vkCmdDispatchGraphIndirectAMDX = loader.apply("vkCmdDispatchGraphIndirectAMDX");
        HANDLE$vkCmdDispatchGraphIndirectAMDX = RawFunctionLoader.link(SEGMENT$vkCmdDispatchGraphIndirectAMDX, DESCRIPTOR$vkCmdDispatchGraphIndirectAMDX);
        SEGMENT$vkCmdDispatchGraphIndirectCountAMDX = loader.apply("vkCmdDispatchGraphIndirectCountAMDX");
        HANDLE$vkCmdDispatchGraphIndirectCountAMDX = RawFunctionLoader.link(SEGMENT$vkCmdDispatchGraphIndirectCountAMDX, DESCRIPTOR$vkCmdDispatchGraphIndirectCountAMDX);
        SEGMENT$vkCmdBindDescriptorSets2KHR = loader.apply("vkCmdBindDescriptorSets2KHR");
        HANDLE$vkCmdBindDescriptorSets2KHR = RawFunctionLoader.link(SEGMENT$vkCmdBindDescriptorSets2KHR, DESCRIPTOR$vkCmdBindDescriptorSets2KHR);
        SEGMENT$vkCmdPushConstants2KHR = loader.apply("vkCmdPushConstants2KHR");
        HANDLE$vkCmdPushConstants2KHR = RawFunctionLoader.link(SEGMENT$vkCmdPushConstants2KHR, DESCRIPTOR$vkCmdPushConstants2KHR);
        SEGMENT$vkCmdPushDescriptorSet2KHR = loader.apply("vkCmdPushDescriptorSet2KHR");
        HANDLE$vkCmdPushDescriptorSet2KHR = RawFunctionLoader.link(SEGMENT$vkCmdPushDescriptorSet2KHR, DESCRIPTOR$vkCmdPushDescriptorSet2KHR);
        SEGMENT$vkCmdPushDescriptorSetWithTemplate2KHR = loader.apply("vkCmdPushDescriptorSetWithTemplate2KHR");
        HANDLE$vkCmdPushDescriptorSetWithTemplate2KHR = RawFunctionLoader.link(SEGMENT$vkCmdPushDescriptorSetWithTemplate2KHR, DESCRIPTOR$vkCmdPushDescriptorSetWithTemplate2KHR);
        SEGMENT$vkCmdSetDescriptorBufferOffsets2EXT = loader.apply("vkCmdSetDescriptorBufferOffsets2EXT");
        HANDLE$vkCmdSetDescriptorBufferOffsets2EXT = RawFunctionLoader.link(SEGMENT$vkCmdSetDescriptorBufferOffsets2EXT, DESCRIPTOR$vkCmdSetDescriptorBufferOffsets2EXT);
        SEGMENT$vkCmdBindDescriptorBufferEmbeddedSamplers2EXT = loader.apply("vkCmdBindDescriptorBufferEmbeddedSamplers2EXT");
        HANDLE$vkCmdBindDescriptorBufferEmbeddedSamplers2EXT = RawFunctionLoader.link(SEGMENT$vkCmdBindDescriptorBufferEmbeddedSamplers2EXT, DESCRIPTOR$vkCmdBindDescriptorBufferEmbeddedSamplers2EXT);
        SEGMENT$vkSetLatencySleepModeNV = loader.apply("vkSetLatencySleepModeNV");
        HANDLE$vkSetLatencySleepModeNV = RawFunctionLoader.link(SEGMENT$vkSetLatencySleepModeNV, DESCRIPTOR$vkSetLatencySleepModeNV);
        SEGMENT$vkLatencySleepNV = loader.apply("vkLatencySleepNV");
        HANDLE$vkLatencySleepNV = RawFunctionLoader.link(SEGMENT$vkLatencySleepNV, DESCRIPTOR$vkLatencySleepNV);
        SEGMENT$vkSetLatencyMarkerNV = loader.apply("vkSetLatencyMarkerNV");
        HANDLE$vkSetLatencyMarkerNV = RawFunctionLoader.link(SEGMENT$vkSetLatencyMarkerNV, DESCRIPTOR$vkSetLatencyMarkerNV);
        SEGMENT$vkGetLatencyTimingsNV = loader.apply("vkGetLatencyTimingsNV");
        HANDLE$vkGetLatencyTimingsNV = RawFunctionLoader.link(SEGMENT$vkGetLatencyTimingsNV, DESCRIPTOR$vkGetLatencyTimingsNV);
        SEGMENT$vkQueueNotifyOutOfBandNV = loader.apply("vkQueueNotifyOutOfBandNV");
        HANDLE$vkQueueNotifyOutOfBandNV = RawFunctionLoader.link(SEGMENT$vkQueueNotifyOutOfBandNV, DESCRIPTOR$vkQueueNotifyOutOfBandNV);
        SEGMENT$vkCmdSetRenderingAttachmentLocationsKHR = loader.apply("vkCmdSetRenderingAttachmentLocationsKHR");
        HANDLE$vkCmdSetRenderingAttachmentLocationsKHR = RawFunctionLoader.link(SEGMENT$vkCmdSetRenderingAttachmentLocationsKHR, DESCRIPTOR$vkCmdSetRenderingAttachmentLocationsKHR);
        SEGMENT$vkCmdSetRenderingInputAttachmentIndicesKHR = loader.apply("vkCmdSetRenderingInputAttachmentIndicesKHR");
        HANDLE$vkCmdSetRenderingInputAttachmentIndicesKHR = RawFunctionLoader.link(SEGMENT$vkCmdSetRenderingInputAttachmentIndicesKHR, DESCRIPTOR$vkCmdSetRenderingInputAttachmentIndicesKHR);
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkDestroyDevice.html">vkDestroyDevice</a>
    public void vkDestroyDevice(
            @Nullable VkDevice device,
            @Nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator
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
            @Nullable @pointer(target=VkSubmitInfo.class) VkSubmitInfo pSubmits,
            @Nullable VkFence fence
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
            @Nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator,
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
            @Nullable VkDeviceMemory memory,
            @Nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator
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
            @Nullable @pointer(target=VkSparseImageMemoryRequirements.class) VkSparseImageMemoryRequirements pSparseMemoryRequirements
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
            @Nullable @pointer(target=VkBindSparseInfo.class) VkBindSparseInfo pBindInfo,
            @Nullable VkFence fence
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
            @Nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator,
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
            @Nullable VkFence fence,
            @Nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator
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
            @Nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator,
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
            @Nullable VkSemaphore semaphore,
            @Nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator
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
            @Nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator,
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
            @Nullable VkEvent event,
            @Nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator
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
            @Nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator,
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
            @Nullable VkQueryPool queryPool,
            @Nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator
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
            @Nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator,
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
            @Nullable VkBuffer buffer,
            @Nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator
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
            @Nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator,
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
            @Nullable VkBufferView bufferView,
            @Nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator
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
            @Nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator,
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
            @Nullable VkImage image,
            @Nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator
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
            @Nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator,
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
            @Nullable VkImageView imageView,
            @Nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator
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
            @Nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator,
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
            @Nullable VkShaderModule shaderModule,
            @Nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator
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
            @Nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator,
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
            @Nullable VkPipelineCache pipelineCache,
            @Nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator
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
            @Nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator,
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
            @Nullable VkPipelineBinaryKHR pipelineBinary,
            @Nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator
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
            @Nullable @pointer(target=VkPipelineCreateInfoKHR.class) VkPipelineCreateInfoKHR pPipelineCreateInfo,
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
            @Nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator
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
            @Nullable VkPipelineCache pipelineCache,
            @unsigned int createInfoCount,
            @pointer(target=VkGraphicsPipelineCreateInfo.class) VkGraphicsPipelineCreateInfo pCreateInfos,
            @Nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator,
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
            @Nullable VkPipelineCache pipelineCache,
            @unsigned int createInfoCount,
            @pointer(target=VkComputePipelineCreateInfo.class) VkComputePipelineCreateInfo pCreateInfos,
            @Nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator,
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
            @Nullable VkPipeline pipeline,
            @Nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator
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
            @Nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator,
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
            @Nullable VkPipelineLayout pipelineLayout,
            @Nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator
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
            @Nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator,
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
            @Nullable VkSampler sampler,
            @Nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator
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
            @Nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator,
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
            @Nullable VkDescriptorSetLayout descriptorSetLayout,
            @Nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator
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
            @Nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator,
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
            @Nullable VkDescriptorPool descriptorPool,
            @Nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator
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
            @Nullable @pointer(target=VkWriteDescriptorSet.class) VkWriteDescriptorSet pDescriptorWrites,
            @unsigned int descriptorCopyCount,
            @Nullable @pointer(target=VkCopyDescriptorSet.class) VkCopyDescriptorSet pDescriptorCopies
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
            @Nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator,
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
            @Nullable VkFramebuffer framebuffer,
            @Nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator
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
            @Nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator,
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
            @Nullable VkRenderPass renderPass,
            @Nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator
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
            @Nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator,
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
            @Nullable VkCommandPool commandPool,
            @Nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator
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
            @Nullable @unsigned IntBuffer pDynamicOffsets
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
            @Nullable VkBuffer buffer,
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
            @Nullable @pointer(target=VkMultiDrawInfoEXT.class) VkMultiDrawInfoEXT pVertexInfo,
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
            @Nullable @pointer(target=VkMultiDrawIndexedInfoEXT.class) VkMultiDrawIndexedInfoEXT pIndexInfo,
            @unsigned int instanceCount,
            @unsigned int firstInstance,
            @unsigned int stride,
            @Nullable IntBuffer pVertexOffset
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
            @Nullable @pointer(target=VkMemoryBarrier.class) VkMemoryBarrier pMemoryBarriers,
            @unsigned int bufferMemoryBarrierCount,
            @Nullable @pointer(target=VkBufferMemoryBarrier.class) VkBufferMemoryBarrier pBufferMemoryBarriers,
            @unsigned int imageMemoryBarrierCount,
            @Nullable @pointer(target=VkImageMemoryBarrier.class) VkImageMemoryBarrier pImageMemoryBarriers
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
            @Nullable @pointer(target=VkMemoryBarrier.class) VkMemoryBarrier pMemoryBarriers,
            @unsigned int bufferMemoryBarrierCount,
            @Nullable @pointer(target=VkBufferMemoryBarrier.class) VkBufferMemoryBarrier pBufferMemoryBarriers,
            @unsigned int imageMemoryBarrierCount,
            @Nullable @pointer(target=VkImageMemoryBarrier.class) VkImageMemoryBarrier pImageMemoryBarriers
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
            @Nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator,
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
            @Nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator,
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
            @Nullable VkSwapchainKHR swapchain,
            @Nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator
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
            @Nullable @pointer(target=VkImage.class) VkImage.Buffer pSwapchainImages
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
            @Nullable VkSemaphore semaphore,
            @Nullable VkFence fence,
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
            @Nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator,
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
            @Nullable VkIndirectCommandsLayoutNV indirectCommandsLayout,
            @Nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator
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
            @Nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator,
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
            @Nullable VkSemaphoreSciSyncPoolNV semaphorePool,
            @Nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator
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
            @Nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator,
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
            @Nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator,
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
            @Nullable @pointer(target=VkRect2D.class) VkRect2D pRects
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
            @Nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator,
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
            @Nullable VkDescriptorUpdateTemplate descriptorUpdateTemplate,
            @Nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator
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
            @Nullable @pointer(target=VkPastPresentationTimingGOOGLE.class) VkPastPresentationTimingGOOGLE pPresentationTimings
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
            @Nullable @pointer(target=VkSparseImageMemoryRequirements2.class) VkSparseImageMemoryRequirements2 pSparseMemoryRequirements
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
            @Nullable @pointer(target=VkSparseImageMemoryRequirements2.class) VkSparseImageMemoryRequirements2 pSparseMemoryRequirements
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
            @Nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator,
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
            @Nullable VkSamplerYcbcrConversion ycbcrConversion,
            @Nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator
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
            @Nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator,
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
            @Nullable VkValidationCacheEXT validationCache,
            @Nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator
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
            @Nullable @enumtype(VkTimeDomainKHR.class) IntBuffer pTimeDomains
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
            @Nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator,
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
            @Nullable @pointer(target=VkCheckpointDataNV.class) VkCheckpointDataNV pCheckpointData
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
            @Nullable @unsigned LongBuffer pSizes
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
            @Nullable @pointer(target=VkBuffer.class) VkBuffer.Buffer pCounterBuffers,
            @Nullable @unsigned LongBuffer pCounterBufferOffsets
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
            @Nullable @pointer(target=VkBuffer.class) VkBuffer.Buffer pCounterBuffers,
            @Nullable @unsigned LongBuffer pCounterBufferOffsets
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
            @Nullable VkImageView imageView,
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
            @Nullable @pointer(target=VkCoarseSampleOrderCustomNV.class) VkCoarseSampleOrderCustomNV pCustomSampleOrders
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
            @Nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator,
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
            @Nullable VkImageView imageView,
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
            @Nullable VkAccelerationStructureKHR accelerationStructure,
            @Nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator
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
            @Nullable VkAccelerationStructureNV accelerationStructure,
            @Nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator
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
            @Nullable VkDeferredOperationKHR deferredOperation,
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
            @Nullable VkDeferredOperationKHR deferredOperation,
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
            @Nullable VkDeferredOperationKHR deferredOperation,
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
            @Nullable VkBuffer instanceData,
            @unsigned long instanceOffset,
            @unsigned int update,
            VkAccelerationStructureNV dst,
            @Nullable VkAccelerationStructureNV src,
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
            @Nullable VkBuffer missShaderBindingTableBuffer,
            @unsigned long missShaderBindingOffset,
            @unsigned long missShaderBindingStride,
            @Nullable VkBuffer hitShaderBindingTableBuffer,
            @unsigned long hitShaderBindingOffset,
            @unsigned long hitShaderBindingStride,
            @Nullable VkBuffer callableShaderBindingTableBuffer,
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
            @Nullable VkPipelineCache pipelineCache,
            @unsigned int createInfoCount,
            @pointer(target=VkRayTracingPipelineCreateInfoNV.class) VkRayTracingPipelineCreateInfoNV pCreateInfos,
            @Nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator,
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
            @Nullable VkDeferredOperationKHR deferredOperation,
            @Nullable VkPipelineCache pipelineCache,
            @unsigned int createInfoCount,
            @pointer(target=VkRayTracingPipelineCreateInfoKHR.class) VkRayTracingPipelineCreateInfoKHR pCreateInfos,
            @Nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator,
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
            @Nullable @pointer(target=VkCooperativeMatrixPropertiesNV.class) VkCooperativeMatrixPropertiesNV pProperties
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
            @Nullable @enumtype(VkPresentModeKHR.class) IntBuffer pPresentModes
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
            @Nullable @pointer(target=VkPerformanceCounterKHR.class) VkPerformanceCounterKHR pCounters,
            @Nullable @pointer(target=VkPerformanceCounterDescriptionKHR.class) VkPerformanceCounterDescriptionKHR pCounterDescriptions
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
            @Nullable @pointer(target=VkFramebufferMixedSamplesCombinationNV.class) VkFramebufferMixedSamplesCombinationNV pCombinations
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
            @Nullable VkPerformanceConfigurationINTEL configuration
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
            @Nullable @pointer(target=VkPipelineExecutablePropertiesKHR.class) VkPipelineExecutablePropertiesKHR pProperties
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
            @Nullable @pointer(target=VkPipelineExecutableStatisticKHR.class) VkPipelineExecutableStatisticKHR pStatistics
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
            @Nullable @pointer(target=VkPipelineExecutableInternalRepresentationKHR.class) VkPipelineExecutableInternalRepresentationKHR pInternalRepresentations
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
            @Nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator,
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
            @Nullable VkDeferredOperationKHR deferredOperation,
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
            @Nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator,
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
            @Nullable VkDeferredOperationKHR operation,
            @Nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator
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
            @Nullable VkBuffer buffer,
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
            @Nullable @unsigned LongBuffer pSizes,
            @Nullable @unsigned LongBuffer pStrides
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
            @Nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator,
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
            @Nullable VkPrivateDataSlot privateDataSlot,
            @Nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator
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
            @Nullable @enumtype(VkObjectType.class) IntBuffer pRefreshableObjectTypes
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
            @Nullable @pointer(target=VkPhysicalDeviceFragmentShadingRateKHR.class) VkPhysicalDeviceFragmentShadingRateKHR pFragmentShadingRates
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
            @Nullable @unsigned IntBuffer pMaxPrimitiveCounts,
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
            @Nullable @pointer(target=VkVertexInputBindingDescription2EXT.class) VkVertexInputBindingDescription2EXT pVertexBindingDescriptions,
            @unsigned int vertexAttributeDescriptionCount,
            @Nullable @pointer(target=VkVertexInputAttributeDescription2EXT.class) VkVertexInputAttributeDescription2EXT pVertexAttributeDescriptions
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
            @Nullable @pointer(target=VkSubmitInfo2.class) VkSubmitInfo2 pSubmits,
            @Nullable VkFence fence
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
            @Nullable @pointer(target=VkCheckpointData2NV.class) VkCheckpointData2NV pCheckpointData
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
            @Nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator,
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
            @Nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator,
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
            @Nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator
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
            @Nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator
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
            @Nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator,
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
            @Nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator
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
            @Nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator,
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
            @Nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator,
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
            @Nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator
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
            @Nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator
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
            @Nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator,
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
            @Nullable VkDeferredOperationKHR deferredOperation,
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
            @Nullable VkMicromapEXT micromap,
            @Nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator
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
            @Nullable VkDeferredOperationKHR deferredOperation,
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
            @Nullable VkDeferredOperationKHR deferredOperation,
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
            @Nullable VkDeferredOperationKHR deferredOperation,
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
            @Nullable @pointer(target=VkTilePropertiesQCOM.class) VkTilePropertiesQCOM pProperties
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
            @Nullable @pointer(target=VkOpticalFlowImageFormatPropertiesNV.class) VkOpticalFlowImageFormatPropertiesNV pImageFormatProperties
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
            @Nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator,
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
            @Nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator
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
            @Nullable VkImageView view,
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
            @Nullable @pointer(target=VkDeviceFaultInfoEXT.class) VkDeviceFaultInfoEXT pFaultInfo
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
            @Nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator,
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
            @Nullable VkShaderEXT shader,
            @Nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator
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
            @Nullable @pointer(target=VkShaderEXT.class) VkShaderEXT.Buffer pShaders
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
            @Nullable @pointer(target=VkCooperativeMatrixPropertiesKHR.class) VkCooperativeMatrixPropertiesKHR pProperties
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
            @Nullable VkPipelineCache pipelineCache,
            @unsigned int createInfoCount,
            @pointer(target=VkExecutionGraphPipelineCreateInfoAMDX.class) VkExecutionGraphPipelineCreateInfoAMDX pCreateInfos,
            @Nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator,
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
