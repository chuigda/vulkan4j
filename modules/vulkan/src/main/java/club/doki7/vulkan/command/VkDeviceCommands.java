package club.doki7.vulkan.command;

import java.lang.foreign.*;
import java.lang.invoke.MethodHandle;
import java.util.Objects;

import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import club.doki7.ffm.NativeLayout;
import club.doki7.ffm.RawFunctionLoader;
import club.doki7.ffm.annotation.*;
import club.doki7.ffm.ptr.*;
import club.doki7.vulkan.bitmask.*;
import club.doki7.vulkan.datatype.*;
import club.doki7.vulkan.enumtype.*;
import club.doki7.vulkan.handle.*;

public final class VkDeviceCommands {
    public VkDeviceCommands(RawFunctionLoader loader) {
        SEGMENT$vkAcquireFullScreenExclusiveModeEXT = loader.apply("vkAcquireFullScreenExclusiveModeEXT");
        HANDLE$vkAcquireFullScreenExclusiveModeEXT = RawFunctionLoader.link(SEGMENT$vkAcquireFullScreenExclusiveModeEXT, Descriptors.DESCRIPTOR$vkAcquireFullScreenExclusiveModeEXT);
        SEGMENT$vkAcquireNextImage2KHR = loader.apply("vkAcquireNextImage2KHR");
        HANDLE$vkAcquireNextImage2KHR = RawFunctionLoader.link(SEGMENT$vkAcquireNextImage2KHR, Descriptors.DESCRIPTOR$vkAcquireNextImage2KHR);
        SEGMENT$vkAcquireNextImageKHR = loader.apply("vkAcquireNextImageKHR");
        HANDLE$vkAcquireNextImageKHR = RawFunctionLoader.link(SEGMENT$vkAcquireNextImageKHR, Descriptors.DESCRIPTOR$vkAcquireNextImageKHR);
        SEGMENT$vkAcquirePerformanceConfigurationINTEL = loader.apply("vkAcquirePerformanceConfigurationINTEL");
        HANDLE$vkAcquirePerformanceConfigurationINTEL = RawFunctionLoader.link(SEGMENT$vkAcquirePerformanceConfigurationINTEL, Descriptors.DESCRIPTOR$vkAcquirePerformanceConfigurationINTEL);
        SEGMENT$vkAcquireProfilingLockKHR = loader.apply("vkAcquireProfilingLockKHR");
        HANDLE$vkAcquireProfilingLockKHR = RawFunctionLoader.link(SEGMENT$vkAcquireProfilingLockKHR, Descriptors.DESCRIPTOR$vkAcquireProfilingLockKHR);
        SEGMENT$vkAllocateCommandBuffers = loader.apply("vkAllocateCommandBuffers");
        HANDLE$vkAllocateCommandBuffers = RawFunctionLoader.link(SEGMENT$vkAllocateCommandBuffers, Descriptors.DESCRIPTOR$vkAllocateCommandBuffers);
        SEGMENT$vkAllocateDescriptorSets = loader.apply("vkAllocateDescriptorSets");
        HANDLE$vkAllocateDescriptorSets = RawFunctionLoader.link(SEGMENT$vkAllocateDescriptorSets, Descriptors.DESCRIPTOR$vkAllocateDescriptorSets);
        SEGMENT$vkAllocateMemory = loader.apply("vkAllocateMemory");
        HANDLE$vkAllocateMemory = RawFunctionLoader.link(SEGMENT$vkAllocateMemory, Descriptors.DESCRIPTOR$vkAllocateMemory);
        SEGMENT$vkAntiLagUpdateAMD = loader.apply("vkAntiLagUpdateAMD");
        HANDLE$vkAntiLagUpdateAMD = RawFunctionLoader.link(SEGMENT$vkAntiLagUpdateAMD, Descriptors.DESCRIPTOR$vkAntiLagUpdateAMD);
        SEGMENT$vkBeginCommandBuffer = loader.apply("vkBeginCommandBuffer");
        HANDLE$vkBeginCommandBuffer = RawFunctionLoader.link(SEGMENT$vkBeginCommandBuffer, Descriptors.DESCRIPTOR$vkBeginCommandBuffer);
        SEGMENT$vkBindAccelerationStructureMemoryNV = loader.apply("vkBindAccelerationStructureMemoryNV");
        HANDLE$vkBindAccelerationStructureMemoryNV = RawFunctionLoader.link(SEGMENT$vkBindAccelerationStructureMemoryNV, Descriptors.DESCRIPTOR$vkBindAccelerationStructureMemoryNV);
        SEGMENT$vkBindBufferMemory = loader.apply("vkBindBufferMemory");
        HANDLE$vkBindBufferMemory = RawFunctionLoader.link(SEGMENT$vkBindBufferMemory, Descriptors.DESCRIPTOR$vkBindBufferMemory);
        SEGMENT$vkBindBufferMemory2 = loader.apply("vkBindBufferMemory2");
        HANDLE$vkBindBufferMemory2 = RawFunctionLoader.link(SEGMENT$vkBindBufferMemory2, Descriptors.DESCRIPTOR$vkBindBufferMemory2);
        SEGMENT$vkBindBufferMemory2KHR = loader.apply("vkBindBufferMemory2KHR");
        HANDLE$vkBindBufferMemory2KHR = RawFunctionLoader.link(SEGMENT$vkBindBufferMemory2KHR, Descriptors.DESCRIPTOR$vkBindBufferMemory2);
        SEGMENT$vkBindImageMemory = loader.apply("vkBindImageMemory");
        HANDLE$vkBindImageMemory = RawFunctionLoader.link(SEGMENT$vkBindImageMemory, Descriptors.DESCRIPTOR$vkBindImageMemory);
        SEGMENT$vkBindImageMemory2 = loader.apply("vkBindImageMemory2");
        HANDLE$vkBindImageMemory2 = RawFunctionLoader.link(SEGMENT$vkBindImageMemory2, Descriptors.DESCRIPTOR$vkBindImageMemory2);
        SEGMENT$vkBindImageMemory2KHR = loader.apply("vkBindImageMemory2KHR");
        HANDLE$vkBindImageMemory2KHR = RawFunctionLoader.link(SEGMENT$vkBindImageMemory2KHR, Descriptors.DESCRIPTOR$vkBindImageMemory2);
        SEGMENT$vkBindOpticalFlowSessionImageNV = loader.apply("vkBindOpticalFlowSessionImageNV");
        HANDLE$vkBindOpticalFlowSessionImageNV = RawFunctionLoader.link(SEGMENT$vkBindOpticalFlowSessionImageNV, Descriptors.DESCRIPTOR$vkBindOpticalFlowSessionImageNV);
        SEGMENT$vkBindVideoSessionMemoryKHR = loader.apply("vkBindVideoSessionMemoryKHR");
        HANDLE$vkBindVideoSessionMemoryKHR = RawFunctionLoader.link(SEGMENT$vkBindVideoSessionMemoryKHR, Descriptors.DESCRIPTOR$vkBindVideoSessionMemoryKHR);
        SEGMENT$vkBuildAccelerationStructuresKHR = loader.apply("vkBuildAccelerationStructuresKHR");
        HANDLE$vkBuildAccelerationStructuresKHR = RawFunctionLoader.link(SEGMENT$vkBuildAccelerationStructuresKHR, Descriptors.DESCRIPTOR$vkBuildAccelerationStructuresKHR);
        SEGMENT$vkBuildMicromapsEXT = loader.apply("vkBuildMicromapsEXT");
        HANDLE$vkBuildMicromapsEXT = RawFunctionLoader.link(SEGMENT$vkBuildMicromapsEXT, Descriptors.DESCRIPTOR$vkBuildMicromapsEXT);
        SEGMENT$vkCmdBeginConditionalRenderingEXT = loader.apply("vkCmdBeginConditionalRenderingEXT");
        HANDLE$vkCmdBeginConditionalRenderingEXT = RawFunctionLoader.link(SEGMENT$vkCmdBeginConditionalRenderingEXT, Descriptors.DESCRIPTOR$vkCmdBeginConditionalRenderingEXT);
        SEGMENT$vkCmdBeginPerTileExecutionQCOM = loader.apply("vkCmdBeginPerTileExecutionQCOM");
        HANDLE$vkCmdBeginPerTileExecutionQCOM = RawFunctionLoader.link(SEGMENT$vkCmdBeginPerTileExecutionQCOM, Descriptors.DESCRIPTOR$vkCmdBeginPerTileExecutionQCOM);
        SEGMENT$vkCmdBeginQuery = loader.apply("vkCmdBeginQuery");
        HANDLE$vkCmdBeginQuery = RawFunctionLoader.link(SEGMENT$vkCmdBeginQuery, Descriptors.DESCRIPTOR$vkCmdBeginQuery);
        SEGMENT$vkCmdBeginQueryIndexedEXT = loader.apply("vkCmdBeginQueryIndexedEXT");
        HANDLE$vkCmdBeginQueryIndexedEXT = RawFunctionLoader.link(SEGMENT$vkCmdBeginQueryIndexedEXT, Descriptors.DESCRIPTOR$vkCmdBeginQueryIndexedEXT);
        SEGMENT$vkCmdBeginRenderPass = loader.apply("vkCmdBeginRenderPass");
        HANDLE$vkCmdBeginRenderPass = RawFunctionLoader.link(SEGMENT$vkCmdBeginRenderPass, Descriptors.DESCRIPTOR$vkCmdBeginRenderPass);
        SEGMENT$vkCmdBeginRenderPass2 = loader.apply("vkCmdBeginRenderPass2");
        HANDLE$vkCmdBeginRenderPass2 = RawFunctionLoader.link(SEGMENT$vkCmdBeginRenderPass2, Descriptors.DESCRIPTOR$vkCmdBeginRenderPass2);
        SEGMENT$vkCmdBeginRenderPass2KHR = loader.apply("vkCmdBeginRenderPass2KHR");
        HANDLE$vkCmdBeginRenderPass2KHR = RawFunctionLoader.link(SEGMENT$vkCmdBeginRenderPass2KHR, Descriptors.DESCRIPTOR$vkCmdBeginRenderPass2);
        SEGMENT$vkCmdBeginRendering = loader.apply("vkCmdBeginRendering");
        HANDLE$vkCmdBeginRendering = RawFunctionLoader.link(SEGMENT$vkCmdBeginRendering, Descriptors.DESCRIPTOR$vkCmdBeginRendering);
        SEGMENT$vkCmdBeginRenderingKHR = loader.apply("vkCmdBeginRenderingKHR");
        HANDLE$vkCmdBeginRenderingKHR = RawFunctionLoader.link(SEGMENT$vkCmdBeginRenderingKHR, Descriptors.DESCRIPTOR$vkCmdBeginRendering);
        SEGMENT$vkCmdBeginTransformFeedbackEXT = loader.apply("vkCmdBeginTransformFeedbackEXT");
        HANDLE$vkCmdBeginTransformFeedbackEXT = RawFunctionLoader.link(SEGMENT$vkCmdBeginTransformFeedbackEXT, Descriptors.DESCRIPTOR$vkCmdBeginTransformFeedbackEXT);
        SEGMENT$vkCmdBeginVideoCodingKHR = loader.apply("vkCmdBeginVideoCodingKHR");
        HANDLE$vkCmdBeginVideoCodingKHR = RawFunctionLoader.link(SEGMENT$vkCmdBeginVideoCodingKHR, Descriptors.DESCRIPTOR$vkCmdBeginVideoCodingKHR);
        SEGMENT$vkCmdBindDescriptorBufferEmbeddedSamplers2EXT = loader.apply("vkCmdBindDescriptorBufferEmbeddedSamplers2EXT");
        HANDLE$vkCmdBindDescriptorBufferEmbeddedSamplers2EXT = RawFunctionLoader.link(SEGMENT$vkCmdBindDescriptorBufferEmbeddedSamplers2EXT, Descriptors.DESCRIPTOR$vkCmdBindDescriptorBufferEmbeddedSamplers2EXT);
        SEGMENT$vkCmdBindDescriptorBufferEmbeddedSamplersEXT = loader.apply("vkCmdBindDescriptorBufferEmbeddedSamplersEXT");
        HANDLE$vkCmdBindDescriptorBufferEmbeddedSamplersEXT = RawFunctionLoader.link(SEGMENT$vkCmdBindDescriptorBufferEmbeddedSamplersEXT, Descriptors.DESCRIPTOR$vkCmdBindDescriptorBufferEmbeddedSamplersEXT);
        SEGMENT$vkCmdBindDescriptorBuffersEXT = loader.apply("vkCmdBindDescriptorBuffersEXT");
        HANDLE$vkCmdBindDescriptorBuffersEXT = RawFunctionLoader.link(SEGMENT$vkCmdBindDescriptorBuffersEXT, Descriptors.DESCRIPTOR$vkCmdBindDescriptorBuffersEXT);
        SEGMENT$vkCmdBindDescriptorSets = loader.apply("vkCmdBindDescriptorSets");
        HANDLE$vkCmdBindDescriptorSets = RawFunctionLoader.link(SEGMENT$vkCmdBindDescriptorSets, Descriptors.DESCRIPTOR$vkCmdBindDescriptorSets);
        SEGMENT$vkCmdBindDescriptorSets2 = loader.apply("vkCmdBindDescriptorSets2");
        HANDLE$vkCmdBindDescriptorSets2 = RawFunctionLoader.link(SEGMENT$vkCmdBindDescriptorSets2, Descriptors.DESCRIPTOR$vkCmdBindDescriptorSets2);
        SEGMENT$vkCmdBindDescriptorSets2KHR = loader.apply("vkCmdBindDescriptorSets2KHR");
        HANDLE$vkCmdBindDescriptorSets2KHR = RawFunctionLoader.link(SEGMENT$vkCmdBindDescriptorSets2KHR, Descriptors.DESCRIPTOR$vkCmdBindDescriptorSets2);
        SEGMENT$vkCmdBindIndexBuffer = loader.apply("vkCmdBindIndexBuffer");
        HANDLE$vkCmdBindIndexBuffer = RawFunctionLoader.link(SEGMENT$vkCmdBindIndexBuffer, Descriptors.DESCRIPTOR$vkCmdBindIndexBuffer);
        SEGMENT$vkCmdBindIndexBuffer2 = loader.apply("vkCmdBindIndexBuffer2");
        HANDLE$vkCmdBindIndexBuffer2 = RawFunctionLoader.link(SEGMENT$vkCmdBindIndexBuffer2, Descriptors.DESCRIPTOR$vkCmdBindIndexBuffer2);
        SEGMENT$vkCmdBindIndexBuffer2KHR = loader.apply("vkCmdBindIndexBuffer2KHR");
        HANDLE$vkCmdBindIndexBuffer2KHR = RawFunctionLoader.link(SEGMENT$vkCmdBindIndexBuffer2KHR, Descriptors.DESCRIPTOR$vkCmdBindIndexBuffer2);
        SEGMENT$vkCmdBindInvocationMaskHUAWEI = loader.apply("vkCmdBindInvocationMaskHUAWEI");
        HANDLE$vkCmdBindInvocationMaskHUAWEI = RawFunctionLoader.link(SEGMENT$vkCmdBindInvocationMaskHUAWEI, Descriptors.DESCRIPTOR$vkCmdBindInvocationMaskHUAWEI);
        SEGMENT$vkCmdBindPipeline = loader.apply("vkCmdBindPipeline");
        HANDLE$vkCmdBindPipeline = RawFunctionLoader.link(SEGMENT$vkCmdBindPipeline, Descriptors.DESCRIPTOR$vkCmdBindPipeline);
        SEGMENT$vkCmdBindPipelineShaderGroupNV = loader.apply("vkCmdBindPipelineShaderGroupNV");
        HANDLE$vkCmdBindPipelineShaderGroupNV = RawFunctionLoader.link(SEGMENT$vkCmdBindPipelineShaderGroupNV, Descriptors.DESCRIPTOR$vkCmdBindPipelineShaderGroupNV);
        SEGMENT$vkCmdBindShadersEXT = loader.apply("vkCmdBindShadersEXT");
        HANDLE$vkCmdBindShadersEXT = RawFunctionLoader.link(SEGMENT$vkCmdBindShadersEXT, Descriptors.DESCRIPTOR$vkCmdBindShadersEXT);
        SEGMENT$vkCmdBindShadingRateImageNV = loader.apply("vkCmdBindShadingRateImageNV");
        HANDLE$vkCmdBindShadingRateImageNV = RawFunctionLoader.link(SEGMENT$vkCmdBindShadingRateImageNV, Descriptors.DESCRIPTOR$vkCmdBindShadingRateImageNV);
        SEGMENT$vkCmdBindTileMemoryQCOM = loader.apply("vkCmdBindTileMemoryQCOM");
        HANDLE$vkCmdBindTileMemoryQCOM = RawFunctionLoader.link(SEGMENT$vkCmdBindTileMemoryQCOM, Descriptors.DESCRIPTOR$vkCmdBindTileMemoryQCOM);
        SEGMENT$vkCmdBindTransformFeedbackBuffersEXT = loader.apply("vkCmdBindTransformFeedbackBuffersEXT");
        HANDLE$vkCmdBindTransformFeedbackBuffersEXT = RawFunctionLoader.link(SEGMENT$vkCmdBindTransformFeedbackBuffersEXT, Descriptors.DESCRIPTOR$vkCmdBindTransformFeedbackBuffersEXT);
        SEGMENT$vkCmdBindVertexBuffers = loader.apply("vkCmdBindVertexBuffers");
        HANDLE$vkCmdBindVertexBuffers = RawFunctionLoader.link(SEGMENT$vkCmdBindVertexBuffers, Descriptors.DESCRIPTOR$vkCmdBindVertexBuffers);
        SEGMENT$vkCmdBindVertexBuffers2 = loader.apply("vkCmdBindVertexBuffers2");
        HANDLE$vkCmdBindVertexBuffers2 = RawFunctionLoader.link(SEGMENT$vkCmdBindVertexBuffers2, Descriptors.DESCRIPTOR$vkCmdBindVertexBuffers2);
        SEGMENT$vkCmdBindVertexBuffers2EXT = loader.apply("vkCmdBindVertexBuffers2EXT");
        HANDLE$vkCmdBindVertexBuffers2EXT = RawFunctionLoader.link(SEGMENT$vkCmdBindVertexBuffers2EXT, Descriptors.DESCRIPTOR$vkCmdBindVertexBuffers2);
        SEGMENT$vkCmdBlitImage = loader.apply("vkCmdBlitImage");
        HANDLE$vkCmdBlitImage = RawFunctionLoader.link(SEGMENT$vkCmdBlitImage, Descriptors.DESCRIPTOR$vkCmdBlitImage);
        SEGMENT$vkCmdBlitImage2 = loader.apply("vkCmdBlitImage2");
        HANDLE$vkCmdBlitImage2 = RawFunctionLoader.link(SEGMENT$vkCmdBlitImage2, Descriptors.DESCRIPTOR$vkCmdBlitImage2);
        SEGMENT$vkCmdBlitImage2KHR = loader.apply("vkCmdBlitImage2KHR");
        HANDLE$vkCmdBlitImage2KHR = RawFunctionLoader.link(SEGMENT$vkCmdBlitImage2KHR, Descriptors.DESCRIPTOR$vkCmdBlitImage2);
        SEGMENT$vkCmdBuildAccelerationStructureNV = loader.apply("vkCmdBuildAccelerationStructureNV");
        HANDLE$vkCmdBuildAccelerationStructureNV = RawFunctionLoader.link(SEGMENT$vkCmdBuildAccelerationStructureNV, Descriptors.DESCRIPTOR$vkCmdBuildAccelerationStructureNV);
        SEGMENT$vkCmdBuildAccelerationStructuresIndirectKHR = loader.apply("vkCmdBuildAccelerationStructuresIndirectKHR");
        HANDLE$vkCmdBuildAccelerationStructuresIndirectKHR = RawFunctionLoader.link(SEGMENT$vkCmdBuildAccelerationStructuresIndirectKHR, Descriptors.DESCRIPTOR$vkCmdBuildAccelerationStructuresIndirectKHR);
        SEGMENT$vkCmdBuildAccelerationStructuresKHR = loader.apply("vkCmdBuildAccelerationStructuresKHR");
        HANDLE$vkCmdBuildAccelerationStructuresKHR = RawFunctionLoader.link(SEGMENT$vkCmdBuildAccelerationStructuresKHR, Descriptors.DESCRIPTOR$vkCmdBuildAccelerationStructuresKHR);
        SEGMENT$vkCmdBuildClusterAccelerationStructureIndirectNV = loader.apply("vkCmdBuildClusterAccelerationStructureIndirectNV");
        HANDLE$vkCmdBuildClusterAccelerationStructureIndirectNV = RawFunctionLoader.link(SEGMENT$vkCmdBuildClusterAccelerationStructureIndirectNV, Descriptors.DESCRIPTOR$vkCmdBuildClusterAccelerationStructureIndirectNV);
        SEGMENT$vkCmdBuildMicromapsEXT = loader.apply("vkCmdBuildMicromapsEXT");
        HANDLE$vkCmdBuildMicromapsEXT = RawFunctionLoader.link(SEGMENT$vkCmdBuildMicromapsEXT, Descriptors.DESCRIPTOR$vkCmdBuildMicromapsEXT);
        SEGMENT$vkCmdBuildPartitionedAccelerationStructuresNV = loader.apply("vkCmdBuildPartitionedAccelerationStructuresNV");
        HANDLE$vkCmdBuildPartitionedAccelerationStructuresNV = RawFunctionLoader.link(SEGMENT$vkCmdBuildPartitionedAccelerationStructuresNV, Descriptors.DESCRIPTOR$vkCmdBuildPartitionedAccelerationStructuresNV);
        SEGMENT$vkCmdClearAttachments = loader.apply("vkCmdClearAttachments");
        HANDLE$vkCmdClearAttachments = RawFunctionLoader.link(SEGMENT$vkCmdClearAttachments, Descriptors.DESCRIPTOR$vkCmdClearAttachments);
        SEGMENT$vkCmdClearColorImage = loader.apply("vkCmdClearColorImage");
        HANDLE$vkCmdClearColorImage = RawFunctionLoader.link(SEGMENT$vkCmdClearColorImage, Descriptors.DESCRIPTOR$vkCmdClearColorImage);
        SEGMENT$vkCmdClearDepthStencilImage = loader.apply("vkCmdClearDepthStencilImage");
        HANDLE$vkCmdClearDepthStencilImage = RawFunctionLoader.link(SEGMENT$vkCmdClearDepthStencilImage, Descriptors.DESCRIPTOR$vkCmdClearDepthStencilImage);
        SEGMENT$vkCmdControlVideoCodingKHR = loader.apply("vkCmdControlVideoCodingKHR");
        HANDLE$vkCmdControlVideoCodingKHR = RawFunctionLoader.link(SEGMENT$vkCmdControlVideoCodingKHR, Descriptors.DESCRIPTOR$vkCmdControlVideoCodingKHR);
        SEGMENT$vkCmdConvertCooperativeVectorMatrixNV = loader.apply("vkCmdConvertCooperativeVectorMatrixNV");
        HANDLE$vkCmdConvertCooperativeVectorMatrixNV = RawFunctionLoader.link(SEGMENT$vkCmdConvertCooperativeVectorMatrixNV, Descriptors.DESCRIPTOR$vkCmdConvertCooperativeVectorMatrixNV);
        SEGMENT$vkCmdCopyAccelerationStructureKHR = loader.apply("vkCmdCopyAccelerationStructureKHR");
        HANDLE$vkCmdCopyAccelerationStructureKHR = RawFunctionLoader.link(SEGMENT$vkCmdCopyAccelerationStructureKHR, Descriptors.DESCRIPTOR$vkCmdCopyAccelerationStructureKHR);
        SEGMENT$vkCmdCopyAccelerationStructureNV = loader.apply("vkCmdCopyAccelerationStructureNV");
        HANDLE$vkCmdCopyAccelerationStructureNV = RawFunctionLoader.link(SEGMENT$vkCmdCopyAccelerationStructureNV, Descriptors.DESCRIPTOR$vkCmdCopyAccelerationStructureNV);
        SEGMENT$vkCmdCopyAccelerationStructureToMemoryKHR = loader.apply("vkCmdCopyAccelerationStructureToMemoryKHR");
        HANDLE$vkCmdCopyAccelerationStructureToMemoryKHR = RawFunctionLoader.link(SEGMENT$vkCmdCopyAccelerationStructureToMemoryKHR, Descriptors.DESCRIPTOR$vkCmdCopyAccelerationStructureToMemoryKHR);
        SEGMENT$vkCmdCopyBuffer = loader.apply("vkCmdCopyBuffer");
        HANDLE$vkCmdCopyBuffer = RawFunctionLoader.link(SEGMENT$vkCmdCopyBuffer, Descriptors.DESCRIPTOR$vkCmdCopyBuffer);
        SEGMENT$vkCmdCopyBuffer2 = loader.apply("vkCmdCopyBuffer2");
        HANDLE$vkCmdCopyBuffer2 = RawFunctionLoader.link(SEGMENT$vkCmdCopyBuffer2, Descriptors.DESCRIPTOR$vkCmdCopyBuffer2);
        SEGMENT$vkCmdCopyBuffer2KHR = loader.apply("vkCmdCopyBuffer2KHR");
        HANDLE$vkCmdCopyBuffer2KHR = RawFunctionLoader.link(SEGMENT$vkCmdCopyBuffer2KHR, Descriptors.DESCRIPTOR$vkCmdCopyBuffer2);
        SEGMENT$vkCmdCopyBufferToImage = loader.apply("vkCmdCopyBufferToImage");
        HANDLE$vkCmdCopyBufferToImage = RawFunctionLoader.link(SEGMENT$vkCmdCopyBufferToImage, Descriptors.DESCRIPTOR$vkCmdCopyBufferToImage);
        SEGMENT$vkCmdCopyBufferToImage2 = loader.apply("vkCmdCopyBufferToImage2");
        HANDLE$vkCmdCopyBufferToImage2 = RawFunctionLoader.link(SEGMENT$vkCmdCopyBufferToImage2, Descriptors.DESCRIPTOR$vkCmdCopyBufferToImage2);
        SEGMENT$vkCmdCopyBufferToImage2KHR = loader.apply("vkCmdCopyBufferToImage2KHR");
        HANDLE$vkCmdCopyBufferToImage2KHR = RawFunctionLoader.link(SEGMENT$vkCmdCopyBufferToImage2KHR, Descriptors.DESCRIPTOR$vkCmdCopyBufferToImage2);
        SEGMENT$vkCmdCopyImage = loader.apply("vkCmdCopyImage");
        HANDLE$vkCmdCopyImage = RawFunctionLoader.link(SEGMENT$vkCmdCopyImage, Descriptors.DESCRIPTOR$vkCmdCopyImage);
        SEGMENT$vkCmdCopyImage2 = loader.apply("vkCmdCopyImage2");
        HANDLE$vkCmdCopyImage2 = RawFunctionLoader.link(SEGMENT$vkCmdCopyImage2, Descriptors.DESCRIPTOR$vkCmdCopyImage2);
        SEGMENT$vkCmdCopyImage2KHR = loader.apply("vkCmdCopyImage2KHR");
        HANDLE$vkCmdCopyImage2KHR = RawFunctionLoader.link(SEGMENT$vkCmdCopyImage2KHR, Descriptors.DESCRIPTOR$vkCmdCopyImage2);
        SEGMENT$vkCmdCopyImageToBuffer = loader.apply("vkCmdCopyImageToBuffer");
        HANDLE$vkCmdCopyImageToBuffer = RawFunctionLoader.link(SEGMENT$vkCmdCopyImageToBuffer, Descriptors.DESCRIPTOR$vkCmdCopyImageToBuffer);
        SEGMENT$vkCmdCopyImageToBuffer2 = loader.apply("vkCmdCopyImageToBuffer2");
        HANDLE$vkCmdCopyImageToBuffer2 = RawFunctionLoader.link(SEGMENT$vkCmdCopyImageToBuffer2, Descriptors.DESCRIPTOR$vkCmdCopyImageToBuffer2);
        SEGMENT$vkCmdCopyImageToBuffer2KHR = loader.apply("vkCmdCopyImageToBuffer2KHR");
        HANDLE$vkCmdCopyImageToBuffer2KHR = RawFunctionLoader.link(SEGMENT$vkCmdCopyImageToBuffer2KHR, Descriptors.DESCRIPTOR$vkCmdCopyImageToBuffer2);
        SEGMENT$vkCmdCopyMemoryIndirectNV = loader.apply("vkCmdCopyMemoryIndirectNV");
        HANDLE$vkCmdCopyMemoryIndirectNV = RawFunctionLoader.link(SEGMENT$vkCmdCopyMemoryIndirectNV, Descriptors.DESCRIPTOR$vkCmdCopyMemoryIndirectNV);
        SEGMENT$vkCmdCopyMemoryToAccelerationStructureKHR = loader.apply("vkCmdCopyMemoryToAccelerationStructureKHR");
        HANDLE$vkCmdCopyMemoryToAccelerationStructureKHR = RawFunctionLoader.link(SEGMENT$vkCmdCopyMemoryToAccelerationStructureKHR, Descriptors.DESCRIPTOR$vkCmdCopyMemoryToAccelerationStructureKHR);
        SEGMENT$vkCmdCopyMemoryToImageIndirectNV = loader.apply("vkCmdCopyMemoryToImageIndirectNV");
        HANDLE$vkCmdCopyMemoryToImageIndirectNV = RawFunctionLoader.link(SEGMENT$vkCmdCopyMemoryToImageIndirectNV, Descriptors.DESCRIPTOR$vkCmdCopyMemoryToImageIndirectNV);
        SEGMENT$vkCmdCopyMemoryToMicromapEXT = loader.apply("vkCmdCopyMemoryToMicromapEXT");
        HANDLE$vkCmdCopyMemoryToMicromapEXT = RawFunctionLoader.link(SEGMENT$vkCmdCopyMemoryToMicromapEXT, Descriptors.DESCRIPTOR$vkCmdCopyMemoryToMicromapEXT);
        SEGMENT$vkCmdCopyMicromapEXT = loader.apply("vkCmdCopyMicromapEXT");
        HANDLE$vkCmdCopyMicromapEXT = RawFunctionLoader.link(SEGMENT$vkCmdCopyMicromapEXT, Descriptors.DESCRIPTOR$vkCmdCopyMicromapEXT);
        SEGMENT$vkCmdCopyMicromapToMemoryEXT = loader.apply("vkCmdCopyMicromapToMemoryEXT");
        HANDLE$vkCmdCopyMicromapToMemoryEXT = RawFunctionLoader.link(SEGMENT$vkCmdCopyMicromapToMemoryEXT, Descriptors.DESCRIPTOR$vkCmdCopyMicromapToMemoryEXT);
        SEGMENT$vkCmdCopyQueryPoolResults = loader.apply("vkCmdCopyQueryPoolResults");
        HANDLE$vkCmdCopyQueryPoolResults = RawFunctionLoader.link(SEGMENT$vkCmdCopyQueryPoolResults, Descriptors.DESCRIPTOR$vkCmdCopyQueryPoolResults);
        SEGMENT$vkCmdCuLaunchKernelNVX = loader.apply("vkCmdCuLaunchKernelNVX");
        HANDLE$vkCmdCuLaunchKernelNVX = RawFunctionLoader.link(SEGMENT$vkCmdCuLaunchKernelNVX, Descriptors.DESCRIPTOR$vkCmdCuLaunchKernelNVX);
        SEGMENT$vkCmdCudaLaunchKernelNV = loader.apply("vkCmdCudaLaunchKernelNV");
        HANDLE$vkCmdCudaLaunchKernelNV = RawFunctionLoader.link(SEGMENT$vkCmdCudaLaunchKernelNV, Descriptors.DESCRIPTOR$vkCmdCudaLaunchKernelNV);
        SEGMENT$vkCmdDebugMarkerBeginEXT = loader.apply("vkCmdDebugMarkerBeginEXT");
        HANDLE$vkCmdDebugMarkerBeginEXT = RawFunctionLoader.link(SEGMENT$vkCmdDebugMarkerBeginEXT, Descriptors.DESCRIPTOR$vkCmdDebugMarkerBeginEXT);
        SEGMENT$vkCmdDebugMarkerEndEXT = loader.apply("vkCmdDebugMarkerEndEXT");
        HANDLE$vkCmdDebugMarkerEndEXT = RawFunctionLoader.link(SEGMENT$vkCmdDebugMarkerEndEXT, Descriptors.DESCRIPTOR$vkCmdDebugMarkerEndEXT);
        SEGMENT$vkCmdDebugMarkerInsertEXT = loader.apply("vkCmdDebugMarkerInsertEXT");
        HANDLE$vkCmdDebugMarkerInsertEXT = RawFunctionLoader.link(SEGMENT$vkCmdDebugMarkerInsertEXT, Descriptors.DESCRIPTOR$vkCmdDebugMarkerInsertEXT);
        SEGMENT$vkCmdDecodeVideoKHR = loader.apply("vkCmdDecodeVideoKHR");
        HANDLE$vkCmdDecodeVideoKHR = RawFunctionLoader.link(SEGMENT$vkCmdDecodeVideoKHR, Descriptors.DESCRIPTOR$vkCmdDecodeVideoKHR);
        SEGMENT$vkCmdDecompressMemoryIndirectCountNV = loader.apply("vkCmdDecompressMemoryIndirectCountNV");
        HANDLE$vkCmdDecompressMemoryIndirectCountNV = RawFunctionLoader.link(SEGMENT$vkCmdDecompressMemoryIndirectCountNV, Descriptors.DESCRIPTOR$vkCmdDecompressMemoryIndirectCountNV);
        SEGMENT$vkCmdDecompressMemoryNV = loader.apply("vkCmdDecompressMemoryNV");
        HANDLE$vkCmdDecompressMemoryNV = RawFunctionLoader.link(SEGMENT$vkCmdDecompressMemoryNV, Descriptors.DESCRIPTOR$vkCmdDecompressMemoryNV);
        SEGMENT$vkCmdDispatch = loader.apply("vkCmdDispatch");
        HANDLE$vkCmdDispatch = RawFunctionLoader.link(SEGMENT$vkCmdDispatch, Descriptors.DESCRIPTOR$vkCmdDispatch);
        SEGMENT$vkCmdDispatchBase = loader.apply("vkCmdDispatchBase");
        HANDLE$vkCmdDispatchBase = RawFunctionLoader.link(SEGMENT$vkCmdDispatchBase, Descriptors.DESCRIPTOR$vkCmdDispatchBase);
        SEGMENT$vkCmdDispatchBaseKHR = loader.apply("vkCmdDispatchBaseKHR");
        HANDLE$vkCmdDispatchBaseKHR = RawFunctionLoader.link(SEGMENT$vkCmdDispatchBaseKHR, Descriptors.DESCRIPTOR$vkCmdDispatchBase);
        SEGMENT$vkCmdDispatchGraphAMDX = loader.apply("vkCmdDispatchGraphAMDX");
        HANDLE$vkCmdDispatchGraphAMDX = RawFunctionLoader.link(SEGMENT$vkCmdDispatchGraphAMDX, Descriptors.DESCRIPTOR$vkCmdDispatchGraphAMDX);
        SEGMENT$vkCmdDispatchGraphIndirectAMDX = loader.apply("vkCmdDispatchGraphIndirectAMDX");
        HANDLE$vkCmdDispatchGraphIndirectAMDX = RawFunctionLoader.link(SEGMENT$vkCmdDispatchGraphIndirectAMDX, Descriptors.DESCRIPTOR$vkCmdDispatchGraphIndirectAMDX);
        SEGMENT$vkCmdDispatchGraphIndirectCountAMDX = loader.apply("vkCmdDispatchGraphIndirectCountAMDX");
        HANDLE$vkCmdDispatchGraphIndirectCountAMDX = RawFunctionLoader.link(SEGMENT$vkCmdDispatchGraphIndirectCountAMDX, Descriptors.DESCRIPTOR$vkCmdDispatchGraphIndirectCountAMDX);
        SEGMENT$vkCmdDispatchIndirect = loader.apply("vkCmdDispatchIndirect");
        HANDLE$vkCmdDispatchIndirect = RawFunctionLoader.link(SEGMENT$vkCmdDispatchIndirect, Descriptors.DESCRIPTOR$vkCmdDispatchIndirect);
        SEGMENT$vkCmdDispatchTileQCOM = loader.apply("vkCmdDispatchTileQCOM");
        HANDLE$vkCmdDispatchTileQCOM = RawFunctionLoader.link(SEGMENT$vkCmdDispatchTileQCOM, Descriptors.DESCRIPTOR$vkCmdDispatchTileQCOM);
        SEGMENT$vkCmdDraw = loader.apply("vkCmdDraw");
        HANDLE$vkCmdDraw = RawFunctionLoader.link(SEGMENT$vkCmdDraw, Descriptors.DESCRIPTOR$vkCmdDraw);
        SEGMENT$vkCmdDrawClusterHUAWEI = loader.apply("vkCmdDrawClusterHUAWEI");
        HANDLE$vkCmdDrawClusterHUAWEI = RawFunctionLoader.link(SEGMENT$vkCmdDrawClusterHUAWEI, Descriptors.DESCRIPTOR$vkCmdDrawClusterHUAWEI);
        SEGMENT$vkCmdDrawClusterIndirectHUAWEI = loader.apply("vkCmdDrawClusterIndirectHUAWEI");
        HANDLE$vkCmdDrawClusterIndirectHUAWEI = RawFunctionLoader.link(SEGMENT$vkCmdDrawClusterIndirectHUAWEI, Descriptors.DESCRIPTOR$vkCmdDrawClusterIndirectHUAWEI);
        SEGMENT$vkCmdDrawIndexed = loader.apply("vkCmdDrawIndexed");
        HANDLE$vkCmdDrawIndexed = RawFunctionLoader.link(SEGMENT$vkCmdDrawIndexed, Descriptors.DESCRIPTOR$vkCmdDrawIndexed);
        SEGMENT$vkCmdDrawIndexedIndirect = loader.apply("vkCmdDrawIndexedIndirect");
        HANDLE$vkCmdDrawIndexedIndirect = RawFunctionLoader.link(SEGMENT$vkCmdDrawIndexedIndirect, Descriptors.DESCRIPTOR$vkCmdDrawIndexedIndirect);
        SEGMENT$vkCmdDrawIndexedIndirectCount = loader.apply("vkCmdDrawIndexedIndirectCount");
        HANDLE$vkCmdDrawIndexedIndirectCount = RawFunctionLoader.link(SEGMENT$vkCmdDrawIndexedIndirectCount, Descriptors.DESCRIPTOR$vkCmdDrawIndexedIndirectCount);
        SEGMENT$vkCmdDrawIndexedIndirectCountAMD = loader.apply("vkCmdDrawIndexedIndirectCountAMD");
        HANDLE$vkCmdDrawIndexedIndirectCountAMD = RawFunctionLoader.link(SEGMENT$vkCmdDrawIndexedIndirectCountAMD, Descriptors.DESCRIPTOR$vkCmdDrawIndexedIndirectCount);
        SEGMENT$vkCmdDrawIndexedIndirectCountKHR = loader.apply("vkCmdDrawIndexedIndirectCountKHR");
        HANDLE$vkCmdDrawIndexedIndirectCountKHR = RawFunctionLoader.link(SEGMENT$vkCmdDrawIndexedIndirectCountKHR, Descriptors.DESCRIPTOR$vkCmdDrawIndexedIndirectCount);
        SEGMENT$vkCmdDrawIndirect = loader.apply("vkCmdDrawIndirect");
        HANDLE$vkCmdDrawIndirect = RawFunctionLoader.link(SEGMENT$vkCmdDrawIndirect, Descriptors.DESCRIPTOR$vkCmdDrawIndirect);
        SEGMENT$vkCmdDrawIndirectByteCountEXT = loader.apply("vkCmdDrawIndirectByteCountEXT");
        HANDLE$vkCmdDrawIndirectByteCountEXT = RawFunctionLoader.link(SEGMENT$vkCmdDrawIndirectByteCountEXT, Descriptors.DESCRIPTOR$vkCmdDrawIndirectByteCountEXT);
        SEGMENT$vkCmdDrawIndirectCount = loader.apply("vkCmdDrawIndirectCount");
        HANDLE$vkCmdDrawIndirectCount = RawFunctionLoader.link(SEGMENT$vkCmdDrawIndirectCount, Descriptors.DESCRIPTOR$vkCmdDrawIndirectCount);
        SEGMENT$vkCmdDrawIndirectCountAMD = loader.apply("vkCmdDrawIndirectCountAMD");
        HANDLE$vkCmdDrawIndirectCountAMD = RawFunctionLoader.link(SEGMENT$vkCmdDrawIndirectCountAMD, Descriptors.DESCRIPTOR$vkCmdDrawIndirectCount);
        SEGMENT$vkCmdDrawIndirectCountKHR = loader.apply("vkCmdDrawIndirectCountKHR");
        HANDLE$vkCmdDrawIndirectCountKHR = RawFunctionLoader.link(SEGMENT$vkCmdDrawIndirectCountKHR, Descriptors.DESCRIPTOR$vkCmdDrawIndirectCount);
        SEGMENT$vkCmdDrawMeshTasksEXT = loader.apply("vkCmdDrawMeshTasksEXT");
        HANDLE$vkCmdDrawMeshTasksEXT = RawFunctionLoader.link(SEGMENT$vkCmdDrawMeshTasksEXT, Descriptors.DESCRIPTOR$vkCmdDrawMeshTasksEXT);
        SEGMENT$vkCmdDrawMeshTasksIndirectCountEXT = loader.apply("vkCmdDrawMeshTasksIndirectCountEXT");
        HANDLE$vkCmdDrawMeshTasksIndirectCountEXT = RawFunctionLoader.link(SEGMENT$vkCmdDrawMeshTasksIndirectCountEXT, Descriptors.DESCRIPTOR$vkCmdDrawMeshTasksIndirectCountEXT);
        SEGMENT$vkCmdDrawMeshTasksIndirectCountNV = loader.apply("vkCmdDrawMeshTasksIndirectCountNV");
        HANDLE$vkCmdDrawMeshTasksIndirectCountNV = RawFunctionLoader.link(SEGMENT$vkCmdDrawMeshTasksIndirectCountNV, Descriptors.DESCRIPTOR$vkCmdDrawMeshTasksIndirectCountNV);
        SEGMENT$vkCmdDrawMeshTasksIndirectEXT = loader.apply("vkCmdDrawMeshTasksIndirectEXT");
        HANDLE$vkCmdDrawMeshTasksIndirectEXT = RawFunctionLoader.link(SEGMENT$vkCmdDrawMeshTasksIndirectEXT, Descriptors.DESCRIPTOR$vkCmdDrawMeshTasksIndirectEXT);
        SEGMENT$vkCmdDrawMeshTasksIndirectNV = loader.apply("vkCmdDrawMeshTasksIndirectNV");
        HANDLE$vkCmdDrawMeshTasksIndirectNV = RawFunctionLoader.link(SEGMENT$vkCmdDrawMeshTasksIndirectNV, Descriptors.DESCRIPTOR$vkCmdDrawMeshTasksIndirectNV);
        SEGMENT$vkCmdDrawMeshTasksNV = loader.apply("vkCmdDrawMeshTasksNV");
        HANDLE$vkCmdDrawMeshTasksNV = RawFunctionLoader.link(SEGMENT$vkCmdDrawMeshTasksNV, Descriptors.DESCRIPTOR$vkCmdDrawMeshTasksNV);
        SEGMENT$vkCmdDrawMultiEXT = loader.apply("vkCmdDrawMultiEXT");
        HANDLE$vkCmdDrawMultiEXT = RawFunctionLoader.link(SEGMENT$vkCmdDrawMultiEXT, Descriptors.DESCRIPTOR$vkCmdDrawMultiEXT);
        SEGMENT$vkCmdDrawMultiIndexedEXT = loader.apply("vkCmdDrawMultiIndexedEXT");
        HANDLE$vkCmdDrawMultiIndexedEXT = RawFunctionLoader.link(SEGMENT$vkCmdDrawMultiIndexedEXT, Descriptors.DESCRIPTOR$vkCmdDrawMultiIndexedEXT);
        SEGMENT$vkCmdEncodeVideoKHR = loader.apply("vkCmdEncodeVideoKHR");
        HANDLE$vkCmdEncodeVideoKHR = RawFunctionLoader.link(SEGMENT$vkCmdEncodeVideoKHR, Descriptors.DESCRIPTOR$vkCmdEncodeVideoKHR);
        SEGMENT$vkCmdEndConditionalRenderingEXT = loader.apply("vkCmdEndConditionalRenderingEXT");
        HANDLE$vkCmdEndConditionalRenderingEXT = RawFunctionLoader.link(SEGMENT$vkCmdEndConditionalRenderingEXT, Descriptors.DESCRIPTOR$vkCmdEndConditionalRenderingEXT);
        SEGMENT$vkCmdEndPerTileExecutionQCOM = loader.apply("vkCmdEndPerTileExecutionQCOM");
        HANDLE$vkCmdEndPerTileExecutionQCOM = RawFunctionLoader.link(SEGMENT$vkCmdEndPerTileExecutionQCOM, Descriptors.DESCRIPTOR$vkCmdEndPerTileExecutionQCOM);
        SEGMENT$vkCmdEndQuery = loader.apply("vkCmdEndQuery");
        HANDLE$vkCmdEndQuery = RawFunctionLoader.link(SEGMENT$vkCmdEndQuery, Descriptors.DESCRIPTOR$vkCmdEndQuery);
        SEGMENT$vkCmdEndQueryIndexedEXT = loader.apply("vkCmdEndQueryIndexedEXT");
        HANDLE$vkCmdEndQueryIndexedEXT = RawFunctionLoader.link(SEGMENT$vkCmdEndQueryIndexedEXT, Descriptors.DESCRIPTOR$vkCmdEndQueryIndexedEXT);
        SEGMENT$vkCmdEndRenderPass = loader.apply("vkCmdEndRenderPass");
        HANDLE$vkCmdEndRenderPass = RawFunctionLoader.link(SEGMENT$vkCmdEndRenderPass, Descriptors.DESCRIPTOR$vkCmdEndRenderPass);
        SEGMENT$vkCmdEndRenderPass2 = loader.apply("vkCmdEndRenderPass2");
        HANDLE$vkCmdEndRenderPass2 = RawFunctionLoader.link(SEGMENT$vkCmdEndRenderPass2, Descriptors.DESCRIPTOR$vkCmdEndRenderPass2);
        SEGMENT$vkCmdEndRenderPass2KHR = loader.apply("vkCmdEndRenderPass2KHR");
        HANDLE$vkCmdEndRenderPass2KHR = RawFunctionLoader.link(SEGMENT$vkCmdEndRenderPass2KHR, Descriptors.DESCRIPTOR$vkCmdEndRenderPass2);
        SEGMENT$vkCmdEndRendering = loader.apply("vkCmdEndRendering");
        HANDLE$vkCmdEndRendering = RawFunctionLoader.link(SEGMENT$vkCmdEndRendering, Descriptors.DESCRIPTOR$vkCmdEndRendering);
        SEGMENT$vkCmdEndRendering2EXT = loader.apply("vkCmdEndRendering2EXT");
        HANDLE$vkCmdEndRendering2EXT = RawFunctionLoader.link(SEGMENT$vkCmdEndRendering2EXT, Descriptors.DESCRIPTOR$vkCmdEndRendering2EXT);
        SEGMENT$vkCmdEndRenderingKHR = loader.apply("vkCmdEndRenderingKHR");
        HANDLE$vkCmdEndRenderingKHR = RawFunctionLoader.link(SEGMENT$vkCmdEndRenderingKHR, Descriptors.DESCRIPTOR$vkCmdEndRendering);
        SEGMENT$vkCmdEndTransformFeedbackEXT = loader.apply("vkCmdEndTransformFeedbackEXT");
        HANDLE$vkCmdEndTransformFeedbackEXT = RawFunctionLoader.link(SEGMENT$vkCmdEndTransformFeedbackEXT, Descriptors.DESCRIPTOR$vkCmdEndTransformFeedbackEXT);
        SEGMENT$vkCmdEndVideoCodingKHR = loader.apply("vkCmdEndVideoCodingKHR");
        HANDLE$vkCmdEndVideoCodingKHR = RawFunctionLoader.link(SEGMENT$vkCmdEndVideoCodingKHR, Descriptors.DESCRIPTOR$vkCmdEndVideoCodingKHR);
        SEGMENT$vkCmdExecuteCommands = loader.apply("vkCmdExecuteCommands");
        HANDLE$vkCmdExecuteCommands = RawFunctionLoader.link(SEGMENT$vkCmdExecuteCommands, Descriptors.DESCRIPTOR$vkCmdExecuteCommands);
        SEGMENT$vkCmdExecuteGeneratedCommandsEXT = loader.apply("vkCmdExecuteGeneratedCommandsEXT");
        HANDLE$vkCmdExecuteGeneratedCommandsEXT = RawFunctionLoader.link(SEGMENT$vkCmdExecuteGeneratedCommandsEXT, Descriptors.DESCRIPTOR$vkCmdExecuteGeneratedCommandsEXT);
        SEGMENT$vkCmdExecuteGeneratedCommandsNV = loader.apply("vkCmdExecuteGeneratedCommandsNV");
        HANDLE$vkCmdExecuteGeneratedCommandsNV = RawFunctionLoader.link(SEGMENT$vkCmdExecuteGeneratedCommandsNV, Descriptors.DESCRIPTOR$vkCmdExecuteGeneratedCommandsNV);
        SEGMENT$vkCmdFillBuffer = loader.apply("vkCmdFillBuffer");
        HANDLE$vkCmdFillBuffer = RawFunctionLoader.link(SEGMENT$vkCmdFillBuffer, Descriptors.DESCRIPTOR$vkCmdFillBuffer);
        SEGMENT$vkCmdInitializeGraphScratchMemoryAMDX = loader.apply("vkCmdInitializeGraphScratchMemoryAMDX");
        HANDLE$vkCmdInitializeGraphScratchMemoryAMDX = RawFunctionLoader.link(SEGMENT$vkCmdInitializeGraphScratchMemoryAMDX, Descriptors.DESCRIPTOR$vkCmdInitializeGraphScratchMemoryAMDX);
        SEGMENT$vkCmdNextSubpass = loader.apply("vkCmdNextSubpass");
        HANDLE$vkCmdNextSubpass = RawFunctionLoader.link(SEGMENT$vkCmdNextSubpass, Descriptors.DESCRIPTOR$vkCmdNextSubpass);
        SEGMENT$vkCmdNextSubpass2 = loader.apply("vkCmdNextSubpass2");
        HANDLE$vkCmdNextSubpass2 = RawFunctionLoader.link(SEGMENT$vkCmdNextSubpass2, Descriptors.DESCRIPTOR$vkCmdNextSubpass2);
        SEGMENT$vkCmdNextSubpass2KHR = loader.apply("vkCmdNextSubpass2KHR");
        HANDLE$vkCmdNextSubpass2KHR = RawFunctionLoader.link(SEGMENT$vkCmdNextSubpass2KHR, Descriptors.DESCRIPTOR$vkCmdNextSubpass2);
        SEGMENT$vkCmdOpticalFlowExecuteNV = loader.apply("vkCmdOpticalFlowExecuteNV");
        HANDLE$vkCmdOpticalFlowExecuteNV = RawFunctionLoader.link(SEGMENT$vkCmdOpticalFlowExecuteNV, Descriptors.DESCRIPTOR$vkCmdOpticalFlowExecuteNV);
        SEGMENT$vkCmdPipelineBarrier = loader.apply("vkCmdPipelineBarrier");
        HANDLE$vkCmdPipelineBarrier = RawFunctionLoader.link(SEGMENT$vkCmdPipelineBarrier, Descriptors.DESCRIPTOR$vkCmdPipelineBarrier);
        SEGMENT$vkCmdPipelineBarrier2 = loader.apply("vkCmdPipelineBarrier2");
        HANDLE$vkCmdPipelineBarrier2 = RawFunctionLoader.link(SEGMENT$vkCmdPipelineBarrier2, Descriptors.DESCRIPTOR$vkCmdPipelineBarrier2);
        SEGMENT$vkCmdPipelineBarrier2KHR = loader.apply("vkCmdPipelineBarrier2KHR");
        HANDLE$vkCmdPipelineBarrier2KHR = RawFunctionLoader.link(SEGMENT$vkCmdPipelineBarrier2KHR, Descriptors.DESCRIPTOR$vkCmdPipelineBarrier2);
        SEGMENT$vkCmdPreprocessGeneratedCommandsEXT = loader.apply("vkCmdPreprocessGeneratedCommandsEXT");
        HANDLE$vkCmdPreprocessGeneratedCommandsEXT = RawFunctionLoader.link(SEGMENT$vkCmdPreprocessGeneratedCommandsEXT, Descriptors.DESCRIPTOR$vkCmdPreprocessGeneratedCommandsEXT);
        SEGMENT$vkCmdPreprocessGeneratedCommandsNV = loader.apply("vkCmdPreprocessGeneratedCommandsNV");
        HANDLE$vkCmdPreprocessGeneratedCommandsNV = RawFunctionLoader.link(SEGMENT$vkCmdPreprocessGeneratedCommandsNV, Descriptors.DESCRIPTOR$vkCmdPreprocessGeneratedCommandsNV);
        SEGMENT$vkCmdPushConstants = loader.apply("vkCmdPushConstants");
        HANDLE$vkCmdPushConstants = RawFunctionLoader.link(SEGMENT$vkCmdPushConstants, Descriptors.DESCRIPTOR$vkCmdPushConstants);
        SEGMENT$vkCmdPushConstants2 = loader.apply("vkCmdPushConstants2");
        HANDLE$vkCmdPushConstants2 = RawFunctionLoader.link(SEGMENT$vkCmdPushConstants2, Descriptors.DESCRIPTOR$vkCmdPushConstants2);
        SEGMENT$vkCmdPushConstants2KHR = loader.apply("vkCmdPushConstants2KHR");
        HANDLE$vkCmdPushConstants2KHR = RawFunctionLoader.link(SEGMENT$vkCmdPushConstants2KHR, Descriptors.DESCRIPTOR$vkCmdPushConstants2);
        SEGMENT$vkCmdPushDescriptorSet = loader.apply("vkCmdPushDescriptorSet");
        HANDLE$vkCmdPushDescriptorSet = RawFunctionLoader.link(SEGMENT$vkCmdPushDescriptorSet, Descriptors.DESCRIPTOR$vkCmdPushDescriptorSet);
        SEGMENT$vkCmdPushDescriptorSet2 = loader.apply("vkCmdPushDescriptorSet2");
        HANDLE$vkCmdPushDescriptorSet2 = RawFunctionLoader.link(SEGMENT$vkCmdPushDescriptorSet2, Descriptors.DESCRIPTOR$vkCmdPushDescriptorSet2);
        SEGMENT$vkCmdPushDescriptorSet2KHR = loader.apply("vkCmdPushDescriptorSet2KHR");
        HANDLE$vkCmdPushDescriptorSet2KHR = RawFunctionLoader.link(SEGMENT$vkCmdPushDescriptorSet2KHR, Descriptors.DESCRIPTOR$vkCmdPushDescriptorSet2);
        SEGMENT$vkCmdPushDescriptorSetKHR = loader.apply("vkCmdPushDescriptorSetKHR");
        HANDLE$vkCmdPushDescriptorSetKHR = RawFunctionLoader.link(SEGMENT$vkCmdPushDescriptorSetKHR, Descriptors.DESCRIPTOR$vkCmdPushDescriptorSet);
        SEGMENT$vkCmdPushDescriptorSetWithTemplate = loader.apply("vkCmdPushDescriptorSetWithTemplate");
        HANDLE$vkCmdPushDescriptorSetWithTemplate = RawFunctionLoader.link(SEGMENT$vkCmdPushDescriptorSetWithTemplate, Descriptors.DESCRIPTOR$vkCmdPushDescriptorSetWithTemplate);
        SEGMENT$vkCmdPushDescriptorSetWithTemplate2 = loader.apply("vkCmdPushDescriptorSetWithTemplate2");
        HANDLE$vkCmdPushDescriptorSetWithTemplate2 = RawFunctionLoader.link(SEGMENT$vkCmdPushDescriptorSetWithTemplate2, Descriptors.DESCRIPTOR$vkCmdPushDescriptorSetWithTemplate2);
        SEGMENT$vkCmdPushDescriptorSetWithTemplate2KHR = loader.apply("vkCmdPushDescriptorSetWithTemplate2KHR");
        HANDLE$vkCmdPushDescriptorSetWithTemplate2KHR = RawFunctionLoader.link(SEGMENT$vkCmdPushDescriptorSetWithTemplate2KHR, Descriptors.DESCRIPTOR$vkCmdPushDescriptorSetWithTemplate2);
        SEGMENT$vkCmdPushDescriptorSetWithTemplateKHR = loader.apply("vkCmdPushDescriptorSetWithTemplateKHR");
        HANDLE$vkCmdPushDescriptorSetWithTemplateKHR = RawFunctionLoader.link(SEGMENT$vkCmdPushDescriptorSetWithTemplateKHR, Descriptors.DESCRIPTOR$vkCmdPushDescriptorSetWithTemplate);
        SEGMENT$vkCmdRefreshObjectsKHR = loader.apply("vkCmdRefreshObjectsKHR");
        HANDLE$vkCmdRefreshObjectsKHR = RawFunctionLoader.link(SEGMENT$vkCmdRefreshObjectsKHR, Descriptors.DESCRIPTOR$vkCmdRefreshObjectsKHR);
        SEGMENT$vkCmdResetEvent = loader.apply("vkCmdResetEvent");
        HANDLE$vkCmdResetEvent = RawFunctionLoader.link(SEGMENT$vkCmdResetEvent, Descriptors.DESCRIPTOR$vkCmdResetEvent);
        SEGMENT$vkCmdResetEvent2 = loader.apply("vkCmdResetEvent2");
        HANDLE$vkCmdResetEvent2 = RawFunctionLoader.link(SEGMENT$vkCmdResetEvent2, Descriptors.DESCRIPTOR$vkCmdResetEvent2);
        SEGMENT$vkCmdResetEvent2KHR = loader.apply("vkCmdResetEvent2KHR");
        HANDLE$vkCmdResetEvent2KHR = RawFunctionLoader.link(SEGMENT$vkCmdResetEvent2KHR, Descriptors.DESCRIPTOR$vkCmdResetEvent2);
        SEGMENT$vkCmdResetQueryPool = loader.apply("vkCmdResetQueryPool");
        HANDLE$vkCmdResetQueryPool = RawFunctionLoader.link(SEGMENT$vkCmdResetQueryPool, Descriptors.DESCRIPTOR$vkCmdResetQueryPool);
        SEGMENT$vkCmdResolveImage = loader.apply("vkCmdResolveImage");
        HANDLE$vkCmdResolveImage = RawFunctionLoader.link(SEGMENT$vkCmdResolveImage, Descriptors.DESCRIPTOR$vkCmdResolveImage);
        SEGMENT$vkCmdResolveImage2 = loader.apply("vkCmdResolveImage2");
        HANDLE$vkCmdResolveImage2 = RawFunctionLoader.link(SEGMENT$vkCmdResolveImage2, Descriptors.DESCRIPTOR$vkCmdResolveImage2);
        SEGMENT$vkCmdResolveImage2KHR = loader.apply("vkCmdResolveImage2KHR");
        HANDLE$vkCmdResolveImage2KHR = RawFunctionLoader.link(SEGMENT$vkCmdResolveImage2KHR, Descriptors.DESCRIPTOR$vkCmdResolveImage2);
        SEGMENT$vkCmdSetAlphaToCoverageEnableEXT = loader.apply("vkCmdSetAlphaToCoverageEnableEXT");
        HANDLE$vkCmdSetAlphaToCoverageEnableEXT = RawFunctionLoader.link(SEGMENT$vkCmdSetAlphaToCoverageEnableEXT, Descriptors.DESCRIPTOR$vkCmdSetAlphaToCoverageEnableEXT);
        SEGMENT$vkCmdSetAlphaToOneEnableEXT = loader.apply("vkCmdSetAlphaToOneEnableEXT");
        HANDLE$vkCmdSetAlphaToOneEnableEXT = RawFunctionLoader.link(SEGMENT$vkCmdSetAlphaToOneEnableEXT, Descriptors.DESCRIPTOR$vkCmdSetAlphaToOneEnableEXT);
        SEGMENT$vkCmdSetAttachmentFeedbackLoopEnableEXT = loader.apply("vkCmdSetAttachmentFeedbackLoopEnableEXT");
        HANDLE$vkCmdSetAttachmentFeedbackLoopEnableEXT = RawFunctionLoader.link(SEGMENT$vkCmdSetAttachmentFeedbackLoopEnableEXT, Descriptors.DESCRIPTOR$vkCmdSetAttachmentFeedbackLoopEnableEXT);
        SEGMENT$vkCmdSetBlendConstants = loader.apply("vkCmdSetBlendConstants");
        HANDLE$vkCmdSetBlendConstants = RawFunctionLoader.link(SEGMENT$vkCmdSetBlendConstants, Descriptors.DESCRIPTOR$vkCmdSetBlendConstants);
        SEGMENT$vkCmdSetCheckpointNV = loader.apply("vkCmdSetCheckpointNV");
        HANDLE$vkCmdSetCheckpointNV = RawFunctionLoader.link(SEGMENT$vkCmdSetCheckpointNV, Descriptors.DESCRIPTOR$vkCmdSetCheckpointNV);
        SEGMENT$vkCmdSetCoarseSampleOrderNV = loader.apply("vkCmdSetCoarseSampleOrderNV");
        HANDLE$vkCmdSetCoarseSampleOrderNV = RawFunctionLoader.link(SEGMENT$vkCmdSetCoarseSampleOrderNV, Descriptors.DESCRIPTOR$vkCmdSetCoarseSampleOrderNV);
        SEGMENT$vkCmdSetColorBlendAdvancedEXT = loader.apply("vkCmdSetColorBlendAdvancedEXT");
        HANDLE$vkCmdSetColorBlendAdvancedEXT = RawFunctionLoader.link(SEGMENT$vkCmdSetColorBlendAdvancedEXT, Descriptors.DESCRIPTOR$vkCmdSetColorBlendAdvancedEXT);
        SEGMENT$vkCmdSetColorBlendEnableEXT = loader.apply("vkCmdSetColorBlendEnableEXT");
        HANDLE$vkCmdSetColorBlendEnableEXT = RawFunctionLoader.link(SEGMENT$vkCmdSetColorBlendEnableEXT, Descriptors.DESCRIPTOR$vkCmdSetColorBlendEnableEXT);
        SEGMENT$vkCmdSetColorBlendEquationEXT = loader.apply("vkCmdSetColorBlendEquationEXT");
        HANDLE$vkCmdSetColorBlendEquationEXT = RawFunctionLoader.link(SEGMENT$vkCmdSetColorBlendEquationEXT, Descriptors.DESCRIPTOR$vkCmdSetColorBlendEquationEXT);
        SEGMENT$vkCmdSetColorWriteEnableEXT = loader.apply("vkCmdSetColorWriteEnableEXT");
        HANDLE$vkCmdSetColorWriteEnableEXT = RawFunctionLoader.link(SEGMENT$vkCmdSetColorWriteEnableEXT, Descriptors.DESCRIPTOR$vkCmdSetColorWriteEnableEXT);
        SEGMENT$vkCmdSetColorWriteMaskEXT = loader.apply("vkCmdSetColorWriteMaskEXT");
        HANDLE$vkCmdSetColorWriteMaskEXT = RawFunctionLoader.link(SEGMENT$vkCmdSetColorWriteMaskEXT, Descriptors.DESCRIPTOR$vkCmdSetColorWriteMaskEXT);
        SEGMENT$vkCmdSetConservativeRasterizationModeEXT = loader.apply("vkCmdSetConservativeRasterizationModeEXT");
        HANDLE$vkCmdSetConservativeRasterizationModeEXT = RawFunctionLoader.link(SEGMENT$vkCmdSetConservativeRasterizationModeEXT, Descriptors.DESCRIPTOR$vkCmdSetConservativeRasterizationModeEXT);
        SEGMENT$vkCmdSetCoverageModulationModeNV = loader.apply("vkCmdSetCoverageModulationModeNV");
        HANDLE$vkCmdSetCoverageModulationModeNV = RawFunctionLoader.link(SEGMENT$vkCmdSetCoverageModulationModeNV, Descriptors.DESCRIPTOR$vkCmdSetCoverageModulationModeNV);
        SEGMENT$vkCmdSetCoverageModulationTableEnableNV = loader.apply("vkCmdSetCoverageModulationTableEnableNV");
        HANDLE$vkCmdSetCoverageModulationTableEnableNV = RawFunctionLoader.link(SEGMENT$vkCmdSetCoverageModulationTableEnableNV, Descriptors.DESCRIPTOR$vkCmdSetCoverageModulationTableEnableNV);
        SEGMENT$vkCmdSetCoverageModulationTableNV = loader.apply("vkCmdSetCoverageModulationTableNV");
        HANDLE$vkCmdSetCoverageModulationTableNV = RawFunctionLoader.link(SEGMENT$vkCmdSetCoverageModulationTableNV, Descriptors.DESCRIPTOR$vkCmdSetCoverageModulationTableNV);
        SEGMENT$vkCmdSetCoverageReductionModeNV = loader.apply("vkCmdSetCoverageReductionModeNV");
        HANDLE$vkCmdSetCoverageReductionModeNV = RawFunctionLoader.link(SEGMENT$vkCmdSetCoverageReductionModeNV, Descriptors.DESCRIPTOR$vkCmdSetCoverageReductionModeNV);
        SEGMENT$vkCmdSetCoverageToColorEnableNV = loader.apply("vkCmdSetCoverageToColorEnableNV");
        HANDLE$vkCmdSetCoverageToColorEnableNV = RawFunctionLoader.link(SEGMENT$vkCmdSetCoverageToColorEnableNV, Descriptors.DESCRIPTOR$vkCmdSetCoverageToColorEnableNV);
        SEGMENT$vkCmdSetCoverageToColorLocationNV = loader.apply("vkCmdSetCoverageToColorLocationNV");
        HANDLE$vkCmdSetCoverageToColorLocationNV = RawFunctionLoader.link(SEGMENT$vkCmdSetCoverageToColorLocationNV, Descriptors.DESCRIPTOR$vkCmdSetCoverageToColorLocationNV);
        SEGMENT$vkCmdSetCullMode = loader.apply("vkCmdSetCullMode");
        HANDLE$vkCmdSetCullMode = RawFunctionLoader.link(SEGMENT$vkCmdSetCullMode, Descriptors.DESCRIPTOR$vkCmdSetCullMode);
        SEGMENT$vkCmdSetCullModeEXT = loader.apply("vkCmdSetCullModeEXT");
        HANDLE$vkCmdSetCullModeEXT = RawFunctionLoader.link(SEGMENT$vkCmdSetCullModeEXT, Descriptors.DESCRIPTOR$vkCmdSetCullMode);
        SEGMENT$vkCmdSetDepthBias = loader.apply("vkCmdSetDepthBias");
        HANDLE$vkCmdSetDepthBias = RawFunctionLoader.link(SEGMENT$vkCmdSetDepthBias, Descriptors.DESCRIPTOR$vkCmdSetDepthBias);
        SEGMENT$vkCmdSetDepthBias2EXT = loader.apply("vkCmdSetDepthBias2EXT");
        HANDLE$vkCmdSetDepthBias2EXT = RawFunctionLoader.link(SEGMENT$vkCmdSetDepthBias2EXT, Descriptors.DESCRIPTOR$vkCmdSetDepthBias2EXT);
        SEGMENT$vkCmdSetDepthBiasEnable = loader.apply("vkCmdSetDepthBiasEnable");
        HANDLE$vkCmdSetDepthBiasEnable = RawFunctionLoader.link(SEGMENT$vkCmdSetDepthBiasEnable, Descriptors.DESCRIPTOR$vkCmdSetDepthBiasEnable);
        SEGMENT$vkCmdSetDepthBiasEnableEXT = loader.apply("vkCmdSetDepthBiasEnableEXT");
        HANDLE$vkCmdSetDepthBiasEnableEXT = RawFunctionLoader.link(SEGMENT$vkCmdSetDepthBiasEnableEXT, Descriptors.DESCRIPTOR$vkCmdSetDepthBiasEnable);
        SEGMENT$vkCmdSetDepthBounds = loader.apply("vkCmdSetDepthBounds");
        HANDLE$vkCmdSetDepthBounds = RawFunctionLoader.link(SEGMENT$vkCmdSetDepthBounds, Descriptors.DESCRIPTOR$vkCmdSetDepthBounds);
        SEGMENT$vkCmdSetDepthBoundsTestEnable = loader.apply("vkCmdSetDepthBoundsTestEnable");
        HANDLE$vkCmdSetDepthBoundsTestEnable = RawFunctionLoader.link(SEGMENT$vkCmdSetDepthBoundsTestEnable, Descriptors.DESCRIPTOR$vkCmdSetDepthBoundsTestEnable);
        SEGMENT$vkCmdSetDepthBoundsTestEnableEXT = loader.apply("vkCmdSetDepthBoundsTestEnableEXT");
        HANDLE$vkCmdSetDepthBoundsTestEnableEXT = RawFunctionLoader.link(SEGMENT$vkCmdSetDepthBoundsTestEnableEXT, Descriptors.DESCRIPTOR$vkCmdSetDepthBoundsTestEnable);
        SEGMENT$vkCmdSetDepthClampEnableEXT = loader.apply("vkCmdSetDepthClampEnableEXT");
        HANDLE$vkCmdSetDepthClampEnableEXT = RawFunctionLoader.link(SEGMENT$vkCmdSetDepthClampEnableEXT, Descriptors.DESCRIPTOR$vkCmdSetDepthClampEnableEXT);
        SEGMENT$vkCmdSetDepthClampRangeEXT = loader.apply("vkCmdSetDepthClampRangeEXT");
        HANDLE$vkCmdSetDepthClampRangeEXT = RawFunctionLoader.link(SEGMENT$vkCmdSetDepthClampRangeEXT, Descriptors.DESCRIPTOR$vkCmdSetDepthClampRangeEXT);
        SEGMENT$vkCmdSetDepthClipEnableEXT = loader.apply("vkCmdSetDepthClipEnableEXT");
        HANDLE$vkCmdSetDepthClipEnableEXT = RawFunctionLoader.link(SEGMENT$vkCmdSetDepthClipEnableEXT, Descriptors.DESCRIPTOR$vkCmdSetDepthClipEnableEXT);
        SEGMENT$vkCmdSetDepthClipNegativeOneToOneEXT = loader.apply("vkCmdSetDepthClipNegativeOneToOneEXT");
        HANDLE$vkCmdSetDepthClipNegativeOneToOneEXT = RawFunctionLoader.link(SEGMENT$vkCmdSetDepthClipNegativeOneToOneEXT, Descriptors.DESCRIPTOR$vkCmdSetDepthClipNegativeOneToOneEXT);
        SEGMENT$vkCmdSetDepthCompareOp = loader.apply("vkCmdSetDepthCompareOp");
        HANDLE$vkCmdSetDepthCompareOp = RawFunctionLoader.link(SEGMENT$vkCmdSetDepthCompareOp, Descriptors.DESCRIPTOR$vkCmdSetDepthCompareOp);
        SEGMENT$vkCmdSetDepthCompareOpEXT = loader.apply("vkCmdSetDepthCompareOpEXT");
        HANDLE$vkCmdSetDepthCompareOpEXT = RawFunctionLoader.link(SEGMENT$vkCmdSetDepthCompareOpEXT, Descriptors.DESCRIPTOR$vkCmdSetDepthCompareOp);
        SEGMENT$vkCmdSetDepthTestEnable = loader.apply("vkCmdSetDepthTestEnable");
        HANDLE$vkCmdSetDepthTestEnable = RawFunctionLoader.link(SEGMENT$vkCmdSetDepthTestEnable, Descriptors.DESCRIPTOR$vkCmdSetDepthTestEnable);
        SEGMENT$vkCmdSetDepthTestEnableEXT = loader.apply("vkCmdSetDepthTestEnableEXT");
        HANDLE$vkCmdSetDepthTestEnableEXT = RawFunctionLoader.link(SEGMENT$vkCmdSetDepthTestEnableEXT, Descriptors.DESCRIPTOR$vkCmdSetDepthTestEnable);
        SEGMENT$vkCmdSetDepthWriteEnable = loader.apply("vkCmdSetDepthWriteEnable");
        HANDLE$vkCmdSetDepthWriteEnable = RawFunctionLoader.link(SEGMENT$vkCmdSetDepthWriteEnable, Descriptors.DESCRIPTOR$vkCmdSetDepthWriteEnable);
        SEGMENT$vkCmdSetDepthWriteEnableEXT = loader.apply("vkCmdSetDepthWriteEnableEXT");
        HANDLE$vkCmdSetDepthWriteEnableEXT = RawFunctionLoader.link(SEGMENT$vkCmdSetDepthWriteEnableEXT, Descriptors.DESCRIPTOR$vkCmdSetDepthWriteEnable);
        SEGMENT$vkCmdSetDescriptorBufferOffsets2EXT = loader.apply("vkCmdSetDescriptorBufferOffsets2EXT");
        HANDLE$vkCmdSetDescriptorBufferOffsets2EXT = RawFunctionLoader.link(SEGMENT$vkCmdSetDescriptorBufferOffsets2EXT, Descriptors.DESCRIPTOR$vkCmdSetDescriptorBufferOffsets2EXT);
        SEGMENT$vkCmdSetDescriptorBufferOffsetsEXT = loader.apply("vkCmdSetDescriptorBufferOffsetsEXT");
        HANDLE$vkCmdSetDescriptorBufferOffsetsEXT = RawFunctionLoader.link(SEGMENT$vkCmdSetDescriptorBufferOffsetsEXT, Descriptors.DESCRIPTOR$vkCmdSetDescriptorBufferOffsetsEXT);
        SEGMENT$vkCmdSetDeviceMask = loader.apply("vkCmdSetDeviceMask");
        HANDLE$vkCmdSetDeviceMask = RawFunctionLoader.link(SEGMENT$vkCmdSetDeviceMask, Descriptors.DESCRIPTOR$vkCmdSetDeviceMask);
        SEGMENT$vkCmdSetDeviceMaskKHR = loader.apply("vkCmdSetDeviceMaskKHR");
        HANDLE$vkCmdSetDeviceMaskKHR = RawFunctionLoader.link(SEGMENT$vkCmdSetDeviceMaskKHR, Descriptors.DESCRIPTOR$vkCmdSetDeviceMask);
        SEGMENT$vkCmdSetDiscardRectangleEXT = loader.apply("vkCmdSetDiscardRectangleEXT");
        HANDLE$vkCmdSetDiscardRectangleEXT = RawFunctionLoader.link(SEGMENT$vkCmdSetDiscardRectangleEXT, Descriptors.DESCRIPTOR$vkCmdSetDiscardRectangleEXT);
        SEGMENT$vkCmdSetDiscardRectangleEnableEXT = loader.apply("vkCmdSetDiscardRectangleEnableEXT");
        HANDLE$vkCmdSetDiscardRectangleEnableEXT = RawFunctionLoader.link(SEGMENT$vkCmdSetDiscardRectangleEnableEXT, Descriptors.DESCRIPTOR$vkCmdSetDiscardRectangleEnableEXT);
        SEGMENT$vkCmdSetDiscardRectangleModeEXT = loader.apply("vkCmdSetDiscardRectangleModeEXT");
        HANDLE$vkCmdSetDiscardRectangleModeEXT = RawFunctionLoader.link(SEGMENT$vkCmdSetDiscardRectangleModeEXT, Descriptors.DESCRIPTOR$vkCmdSetDiscardRectangleModeEXT);
        SEGMENT$vkCmdSetEvent = loader.apply("vkCmdSetEvent");
        HANDLE$vkCmdSetEvent = RawFunctionLoader.link(SEGMENT$vkCmdSetEvent, Descriptors.DESCRIPTOR$vkCmdSetEvent);
        SEGMENT$vkCmdSetEvent2 = loader.apply("vkCmdSetEvent2");
        HANDLE$vkCmdSetEvent2 = RawFunctionLoader.link(SEGMENT$vkCmdSetEvent2, Descriptors.DESCRIPTOR$vkCmdSetEvent2);
        SEGMENT$vkCmdSetEvent2KHR = loader.apply("vkCmdSetEvent2KHR");
        HANDLE$vkCmdSetEvent2KHR = RawFunctionLoader.link(SEGMENT$vkCmdSetEvent2KHR, Descriptors.DESCRIPTOR$vkCmdSetEvent2);
        SEGMENT$vkCmdSetExclusiveScissorEnableNV = loader.apply("vkCmdSetExclusiveScissorEnableNV");
        HANDLE$vkCmdSetExclusiveScissorEnableNV = RawFunctionLoader.link(SEGMENT$vkCmdSetExclusiveScissorEnableNV, Descriptors.DESCRIPTOR$vkCmdSetExclusiveScissorEnableNV);
        SEGMENT$vkCmdSetExclusiveScissorNV = loader.apply("vkCmdSetExclusiveScissorNV");
        HANDLE$vkCmdSetExclusiveScissorNV = RawFunctionLoader.link(SEGMENT$vkCmdSetExclusiveScissorNV, Descriptors.DESCRIPTOR$vkCmdSetExclusiveScissorNV);
        SEGMENT$vkCmdSetExtraPrimitiveOverestimationSizeEXT = loader.apply("vkCmdSetExtraPrimitiveOverestimationSizeEXT");
        HANDLE$vkCmdSetExtraPrimitiveOverestimationSizeEXT = RawFunctionLoader.link(SEGMENT$vkCmdSetExtraPrimitiveOverestimationSizeEXT, Descriptors.DESCRIPTOR$vkCmdSetExtraPrimitiveOverestimationSizeEXT);
        SEGMENT$vkCmdSetFragmentShadingRateEnumNV = loader.apply("vkCmdSetFragmentShadingRateEnumNV");
        HANDLE$vkCmdSetFragmentShadingRateEnumNV = RawFunctionLoader.link(SEGMENT$vkCmdSetFragmentShadingRateEnumNV, Descriptors.DESCRIPTOR$vkCmdSetFragmentShadingRateEnumNV);
        SEGMENT$vkCmdSetFragmentShadingRateKHR = loader.apply("vkCmdSetFragmentShadingRateKHR");
        HANDLE$vkCmdSetFragmentShadingRateKHR = RawFunctionLoader.link(SEGMENT$vkCmdSetFragmentShadingRateKHR, Descriptors.DESCRIPTOR$vkCmdSetFragmentShadingRateKHR);
        SEGMENT$vkCmdSetFrontFace = loader.apply("vkCmdSetFrontFace");
        HANDLE$vkCmdSetFrontFace = RawFunctionLoader.link(SEGMENT$vkCmdSetFrontFace, Descriptors.DESCRIPTOR$vkCmdSetFrontFace);
        SEGMENT$vkCmdSetFrontFaceEXT = loader.apply("vkCmdSetFrontFaceEXT");
        HANDLE$vkCmdSetFrontFaceEXT = RawFunctionLoader.link(SEGMENT$vkCmdSetFrontFaceEXT, Descriptors.DESCRIPTOR$vkCmdSetFrontFace);
        SEGMENT$vkCmdSetLineRasterizationModeEXT = loader.apply("vkCmdSetLineRasterizationModeEXT");
        HANDLE$vkCmdSetLineRasterizationModeEXT = RawFunctionLoader.link(SEGMENT$vkCmdSetLineRasterizationModeEXT, Descriptors.DESCRIPTOR$vkCmdSetLineRasterizationModeEXT);
        SEGMENT$vkCmdSetLineStipple = loader.apply("vkCmdSetLineStipple");
        HANDLE$vkCmdSetLineStipple = RawFunctionLoader.link(SEGMENT$vkCmdSetLineStipple, Descriptors.DESCRIPTOR$vkCmdSetLineStipple);
        SEGMENT$vkCmdSetLineStippleEXT = loader.apply("vkCmdSetLineStippleEXT");
        HANDLE$vkCmdSetLineStippleEXT = RawFunctionLoader.link(SEGMENT$vkCmdSetLineStippleEXT, Descriptors.DESCRIPTOR$vkCmdSetLineStipple);
        SEGMENT$vkCmdSetLineStippleEnableEXT = loader.apply("vkCmdSetLineStippleEnableEXT");
        HANDLE$vkCmdSetLineStippleEnableEXT = RawFunctionLoader.link(SEGMENT$vkCmdSetLineStippleEnableEXT, Descriptors.DESCRIPTOR$vkCmdSetLineStippleEnableEXT);
        SEGMENT$vkCmdSetLineStippleKHR = loader.apply("vkCmdSetLineStippleKHR");
        HANDLE$vkCmdSetLineStippleKHR = RawFunctionLoader.link(SEGMENT$vkCmdSetLineStippleKHR, Descriptors.DESCRIPTOR$vkCmdSetLineStipple);
        SEGMENT$vkCmdSetLineWidth = loader.apply("vkCmdSetLineWidth");
        HANDLE$vkCmdSetLineWidth = RawFunctionLoader.link(SEGMENT$vkCmdSetLineWidth, Descriptors.DESCRIPTOR$vkCmdSetLineWidth);
        SEGMENT$vkCmdSetLogicOpEXT = loader.apply("vkCmdSetLogicOpEXT");
        HANDLE$vkCmdSetLogicOpEXT = RawFunctionLoader.link(SEGMENT$vkCmdSetLogicOpEXT, Descriptors.DESCRIPTOR$vkCmdSetLogicOpEXT);
        SEGMENT$vkCmdSetLogicOpEnableEXT = loader.apply("vkCmdSetLogicOpEnableEXT");
        HANDLE$vkCmdSetLogicOpEnableEXT = RawFunctionLoader.link(SEGMENT$vkCmdSetLogicOpEnableEXT, Descriptors.DESCRIPTOR$vkCmdSetLogicOpEnableEXT);
        SEGMENT$vkCmdSetPatchControlPointsEXT = loader.apply("vkCmdSetPatchControlPointsEXT");
        HANDLE$vkCmdSetPatchControlPointsEXT = RawFunctionLoader.link(SEGMENT$vkCmdSetPatchControlPointsEXT, Descriptors.DESCRIPTOR$vkCmdSetPatchControlPointsEXT);
        SEGMENT$vkCmdSetPerformanceMarkerINTEL = loader.apply("vkCmdSetPerformanceMarkerINTEL");
        HANDLE$vkCmdSetPerformanceMarkerINTEL = RawFunctionLoader.link(SEGMENT$vkCmdSetPerformanceMarkerINTEL, Descriptors.DESCRIPTOR$vkCmdSetPerformanceMarkerINTEL);
        SEGMENT$vkCmdSetPerformanceOverrideINTEL = loader.apply("vkCmdSetPerformanceOverrideINTEL");
        HANDLE$vkCmdSetPerformanceOverrideINTEL = RawFunctionLoader.link(SEGMENT$vkCmdSetPerformanceOverrideINTEL, Descriptors.DESCRIPTOR$vkCmdSetPerformanceOverrideINTEL);
        SEGMENT$vkCmdSetPerformanceStreamMarkerINTEL = loader.apply("vkCmdSetPerformanceStreamMarkerINTEL");
        HANDLE$vkCmdSetPerformanceStreamMarkerINTEL = RawFunctionLoader.link(SEGMENT$vkCmdSetPerformanceStreamMarkerINTEL, Descriptors.DESCRIPTOR$vkCmdSetPerformanceStreamMarkerINTEL);
        SEGMENT$vkCmdSetPolygonModeEXT = loader.apply("vkCmdSetPolygonModeEXT");
        HANDLE$vkCmdSetPolygonModeEXT = RawFunctionLoader.link(SEGMENT$vkCmdSetPolygonModeEXT, Descriptors.DESCRIPTOR$vkCmdSetPolygonModeEXT);
        SEGMENT$vkCmdSetPrimitiveRestartEnable = loader.apply("vkCmdSetPrimitiveRestartEnable");
        HANDLE$vkCmdSetPrimitiveRestartEnable = RawFunctionLoader.link(SEGMENT$vkCmdSetPrimitiveRestartEnable, Descriptors.DESCRIPTOR$vkCmdSetPrimitiveRestartEnable);
        SEGMENT$vkCmdSetPrimitiveRestartEnableEXT = loader.apply("vkCmdSetPrimitiveRestartEnableEXT");
        HANDLE$vkCmdSetPrimitiveRestartEnableEXT = RawFunctionLoader.link(SEGMENT$vkCmdSetPrimitiveRestartEnableEXT, Descriptors.DESCRIPTOR$vkCmdSetPrimitiveRestartEnable);
        SEGMENT$vkCmdSetPrimitiveTopology = loader.apply("vkCmdSetPrimitiveTopology");
        HANDLE$vkCmdSetPrimitiveTopology = RawFunctionLoader.link(SEGMENT$vkCmdSetPrimitiveTopology, Descriptors.DESCRIPTOR$vkCmdSetPrimitiveTopology);
        SEGMENT$vkCmdSetPrimitiveTopologyEXT = loader.apply("vkCmdSetPrimitiveTopologyEXT");
        HANDLE$vkCmdSetPrimitiveTopologyEXT = RawFunctionLoader.link(SEGMENT$vkCmdSetPrimitiveTopologyEXT, Descriptors.DESCRIPTOR$vkCmdSetPrimitiveTopology);
        SEGMENT$vkCmdSetProvokingVertexModeEXT = loader.apply("vkCmdSetProvokingVertexModeEXT");
        HANDLE$vkCmdSetProvokingVertexModeEXT = RawFunctionLoader.link(SEGMENT$vkCmdSetProvokingVertexModeEXT, Descriptors.DESCRIPTOR$vkCmdSetProvokingVertexModeEXT);
        SEGMENT$vkCmdSetRasterizationSamplesEXT = loader.apply("vkCmdSetRasterizationSamplesEXT");
        HANDLE$vkCmdSetRasterizationSamplesEXT = RawFunctionLoader.link(SEGMENT$vkCmdSetRasterizationSamplesEXT, Descriptors.DESCRIPTOR$vkCmdSetRasterizationSamplesEXT);
        SEGMENT$vkCmdSetRasterizationStreamEXT = loader.apply("vkCmdSetRasterizationStreamEXT");
        HANDLE$vkCmdSetRasterizationStreamEXT = RawFunctionLoader.link(SEGMENT$vkCmdSetRasterizationStreamEXT, Descriptors.DESCRIPTOR$vkCmdSetRasterizationStreamEXT);
        SEGMENT$vkCmdSetRasterizerDiscardEnable = loader.apply("vkCmdSetRasterizerDiscardEnable");
        HANDLE$vkCmdSetRasterizerDiscardEnable = RawFunctionLoader.link(SEGMENT$vkCmdSetRasterizerDiscardEnable, Descriptors.DESCRIPTOR$vkCmdSetRasterizerDiscardEnable);
        SEGMENT$vkCmdSetRasterizerDiscardEnableEXT = loader.apply("vkCmdSetRasterizerDiscardEnableEXT");
        HANDLE$vkCmdSetRasterizerDiscardEnableEXT = RawFunctionLoader.link(SEGMENT$vkCmdSetRasterizerDiscardEnableEXT, Descriptors.DESCRIPTOR$vkCmdSetRasterizerDiscardEnable);
        SEGMENT$vkCmdSetRayTracingPipelineStackSizeKHR = loader.apply("vkCmdSetRayTracingPipelineStackSizeKHR");
        HANDLE$vkCmdSetRayTracingPipelineStackSizeKHR = RawFunctionLoader.link(SEGMENT$vkCmdSetRayTracingPipelineStackSizeKHR, Descriptors.DESCRIPTOR$vkCmdSetRayTracingPipelineStackSizeKHR);
        SEGMENT$vkCmdSetRenderingAttachmentLocations = loader.apply("vkCmdSetRenderingAttachmentLocations");
        HANDLE$vkCmdSetRenderingAttachmentLocations = RawFunctionLoader.link(SEGMENT$vkCmdSetRenderingAttachmentLocations, Descriptors.DESCRIPTOR$vkCmdSetRenderingAttachmentLocations);
        SEGMENT$vkCmdSetRenderingAttachmentLocationsKHR = loader.apply("vkCmdSetRenderingAttachmentLocationsKHR");
        HANDLE$vkCmdSetRenderingAttachmentLocationsKHR = RawFunctionLoader.link(SEGMENT$vkCmdSetRenderingAttachmentLocationsKHR, Descriptors.DESCRIPTOR$vkCmdSetRenderingAttachmentLocations);
        SEGMENT$vkCmdSetRenderingInputAttachmentIndices = loader.apply("vkCmdSetRenderingInputAttachmentIndices");
        HANDLE$vkCmdSetRenderingInputAttachmentIndices = RawFunctionLoader.link(SEGMENT$vkCmdSetRenderingInputAttachmentIndices, Descriptors.DESCRIPTOR$vkCmdSetRenderingInputAttachmentIndices);
        SEGMENT$vkCmdSetRenderingInputAttachmentIndicesKHR = loader.apply("vkCmdSetRenderingInputAttachmentIndicesKHR");
        HANDLE$vkCmdSetRenderingInputAttachmentIndicesKHR = RawFunctionLoader.link(SEGMENT$vkCmdSetRenderingInputAttachmentIndicesKHR, Descriptors.DESCRIPTOR$vkCmdSetRenderingInputAttachmentIndices);
        SEGMENT$vkCmdSetRepresentativeFragmentTestEnableNV = loader.apply("vkCmdSetRepresentativeFragmentTestEnableNV");
        HANDLE$vkCmdSetRepresentativeFragmentTestEnableNV = RawFunctionLoader.link(SEGMENT$vkCmdSetRepresentativeFragmentTestEnableNV, Descriptors.DESCRIPTOR$vkCmdSetRepresentativeFragmentTestEnableNV);
        SEGMENT$vkCmdSetSampleLocationsEXT = loader.apply("vkCmdSetSampleLocationsEXT");
        HANDLE$vkCmdSetSampleLocationsEXT = RawFunctionLoader.link(SEGMENT$vkCmdSetSampleLocationsEXT, Descriptors.DESCRIPTOR$vkCmdSetSampleLocationsEXT);
        SEGMENT$vkCmdSetSampleLocationsEnableEXT = loader.apply("vkCmdSetSampleLocationsEnableEXT");
        HANDLE$vkCmdSetSampleLocationsEnableEXT = RawFunctionLoader.link(SEGMENT$vkCmdSetSampleLocationsEnableEXT, Descriptors.DESCRIPTOR$vkCmdSetSampleLocationsEnableEXT);
        SEGMENT$vkCmdSetSampleMaskEXT = loader.apply("vkCmdSetSampleMaskEXT");
        HANDLE$vkCmdSetSampleMaskEXT = RawFunctionLoader.link(SEGMENT$vkCmdSetSampleMaskEXT, Descriptors.DESCRIPTOR$vkCmdSetSampleMaskEXT);
        SEGMENT$vkCmdSetScissor = loader.apply("vkCmdSetScissor");
        HANDLE$vkCmdSetScissor = RawFunctionLoader.link(SEGMENT$vkCmdSetScissor, Descriptors.DESCRIPTOR$vkCmdSetScissor);
        SEGMENT$vkCmdSetScissorWithCount = loader.apply("vkCmdSetScissorWithCount");
        HANDLE$vkCmdSetScissorWithCount = RawFunctionLoader.link(SEGMENT$vkCmdSetScissorWithCount, Descriptors.DESCRIPTOR$vkCmdSetScissorWithCount);
        SEGMENT$vkCmdSetScissorWithCountEXT = loader.apply("vkCmdSetScissorWithCountEXT");
        HANDLE$vkCmdSetScissorWithCountEXT = RawFunctionLoader.link(SEGMENT$vkCmdSetScissorWithCountEXT, Descriptors.DESCRIPTOR$vkCmdSetScissorWithCount);
        SEGMENT$vkCmdSetShadingRateImageEnableNV = loader.apply("vkCmdSetShadingRateImageEnableNV");
        HANDLE$vkCmdSetShadingRateImageEnableNV = RawFunctionLoader.link(SEGMENT$vkCmdSetShadingRateImageEnableNV, Descriptors.DESCRIPTOR$vkCmdSetShadingRateImageEnableNV);
        SEGMENT$vkCmdSetStencilCompareMask = loader.apply("vkCmdSetStencilCompareMask");
        HANDLE$vkCmdSetStencilCompareMask = RawFunctionLoader.link(SEGMENT$vkCmdSetStencilCompareMask, Descriptors.DESCRIPTOR$vkCmdSetStencilCompareMask);
        SEGMENT$vkCmdSetStencilOp = loader.apply("vkCmdSetStencilOp");
        HANDLE$vkCmdSetStencilOp = RawFunctionLoader.link(SEGMENT$vkCmdSetStencilOp, Descriptors.DESCRIPTOR$vkCmdSetStencilOp);
        SEGMENT$vkCmdSetStencilOpEXT = loader.apply("vkCmdSetStencilOpEXT");
        HANDLE$vkCmdSetStencilOpEXT = RawFunctionLoader.link(SEGMENT$vkCmdSetStencilOpEXT, Descriptors.DESCRIPTOR$vkCmdSetStencilOp);
        SEGMENT$vkCmdSetStencilReference = loader.apply("vkCmdSetStencilReference");
        HANDLE$vkCmdSetStencilReference = RawFunctionLoader.link(SEGMENT$vkCmdSetStencilReference, Descriptors.DESCRIPTOR$vkCmdSetStencilReference);
        SEGMENT$vkCmdSetStencilTestEnable = loader.apply("vkCmdSetStencilTestEnable");
        HANDLE$vkCmdSetStencilTestEnable = RawFunctionLoader.link(SEGMENT$vkCmdSetStencilTestEnable, Descriptors.DESCRIPTOR$vkCmdSetStencilTestEnable);
        SEGMENT$vkCmdSetStencilTestEnableEXT = loader.apply("vkCmdSetStencilTestEnableEXT");
        HANDLE$vkCmdSetStencilTestEnableEXT = RawFunctionLoader.link(SEGMENT$vkCmdSetStencilTestEnableEXT, Descriptors.DESCRIPTOR$vkCmdSetStencilTestEnable);
        SEGMENT$vkCmdSetStencilWriteMask = loader.apply("vkCmdSetStencilWriteMask");
        HANDLE$vkCmdSetStencilWriteMask = RawFunctionLoader.link(SEGMENT$vkCmdSetStencilWriteMask, Descriptors.DESCRIPTOR$vkCmdSetStencilWriteMask);
        SEGMENT$vkCmdSetTessellationDomainOriginEXT = loader.apply("vkCmdSetTessellationDomainOriginEXT");
        HANDLE$vkCmdSetTessellationDomainOriginEXT = RawFunctionLoader.link(SEGMENT$vkCmdSetTessellationDomainOriginEXT, Descriptors.DESCRIPTOR$vkCmdSetTessellationDomainOriginEXT);
        SEGMENT$vkCmdSetVertexInputEXT = loader.apply("vkCmdSetVertexInputEXT");
        HANDLE$vkCmdSetVertexInputEXT = RawFunctionLoader.link(SEGMENT$vkCmdSetVertexInputEXT, Descriptors.DESCRIPTOR$vkCmdSetVertexInputEXT);
        SEGMENT$vkCmdSetViewport = loader.apply("vkCmdSetViewport");
        HANDLE$vkCmdSetViewport = RawFunctionLoader.link(SEGMENT$vkCmdSetViewport, Descriptors.DESCRIPTOR$vkCmdSetViewport);
        SEGMENT$vkCmdSetViewportShadingRatePaletteNV = loader.apply("vkCmdSetViewportShadingRatePaletteNV");
        HANDLE$vkCmdSetViewportShadingRatePaletteNV = RawFunctionLoader.link(SEGMENT$vkCmdSetViewportShadingRatePaletteNV, Descriptors.DESCRIPTOR$vkCmdSetViewportShadingRatePaletteNV);
        SEGMENT$vkCmdSetViewportSwizzleNV = loader.apply("vkCmdSetViewportSwizzleNV");
        HANDLE$vkCmdSetViewportSwizzleNV = RawFunctionLoader.link(SEGMENT$vkCmdSetViewportSwizzleNV, Descriptors.DESCRIPTOR$vkCmdSetViewportSwizzleNV);
        SEGMENT$vkCmdSetViewportWScalingEnableNV = loader.apply("vkCmdSetViewportWScalingEnableNV");
        HANDLE$vkCmdSetViewportWScalingEnableNV = RawFunctionLoader.link(SEGMENT$vkCmdSetViewportWScalingEnableNV, Descriptors.DESCRIPTOR$vkCmdSetViewportWScalingEnableNV);
        SEGMENT$vkCmdSetViewportWScalingNV = loader.apply("vkCmdSetViewportWScalingNV");
        HANDLE$vkCmdSetViewportWScalingNV = RawFunctionLoader.link(SEGMENT$vkCmdSetViewportWScalingNV, Descriptors.DESCRIPTOR$vkCmdSetViewportWScalingNV);
        SEGMENT$vkCmdSetViewportWithCount = loader.apply("vkCmdSetViewportWithCount");
        HANDLE$vkCmdSetViewportWithCount = RawFunctionLoader.link(SEGMENT$vkCmdSetViewportWithCount, Descriptors.DESCRIPTOR$vkCmdSetViewportWithCount);
        SEGMENT$vkCmdSetViewportWithCountEXT = loader.apply("vkCmdSetViewportWithCountEXT");
        HANDLE$vkCmdSetViewportWithCountEXT = RawFunctionLoader.link(SEGMENT$vkCmdSetViewportWithCountEXT, Descriptors.DESCRIPTOR$vkCmdSetViewportWithCount);
        SEGMENT$vkCmdSubpassShadingHUAWEI = loader.apply("vkCmdSubpassShadingHUAWEI");
        HANDLE$vkCmdSubpassShadingHUAWEI = RawFunctionLoader.link(SEGMENT$vkCmdSubpassShadingHUAWEI, Descriptors.DESCRIPTOR$vkCmdSubpassShadingHUAWEI);
        SEGMENT$vkCmdTraceRaysIndirect2KHR = loader.apply("vkCmdTraceRaysIndirect2KHR");
        HANDLE$vkCmdTraceRaysIndirect2KHR = RawFunctionLoader.link(SEGMENT$vkCmdTraceRaysIndirect2KHR, Descriptors.DESCRIPTOR$vkCmdTraceRaysIndirect2KHR);
        SEGMENT$vkCmdTraceRaysIndirectKHR = loader.apply("vkCmdTraceRaysIndirectKHR");
        HANDLE$vkCmdTraceRaysIndirectKHR = RawFunctionLoader.link(SEGMENT$vkCmdTraceRaysIndirectKHR, Descriptors.DESCRIPTOR$vkCmdTraceRaysIndirectKHR);
        SEGMENT$vkCmdTraceRaysKHR = loader.apply("vkCmdTraceRaysKHR");
        HANDLE$vkCmdTraceRaysKHR = RawFunctionLoader.link(SEGMENT$vkCmdTraceRaysKHR, Descriptors.DESCRIPTOR$vkCmdTraceRaysKHR);
        SEGMENT$vkCmdTraceRaysNV = loader.apply("vkCmdTraceRaysNV");
        HANDLE$vkCmdTraceRaysNV = RawFunctionLoader.link(SEGMENT$vkCmdTraceRaysNV, Descriptors.DESCRIPTOR$vkCmdTraceRaysNV);
        SEGMENT$vkCmdUpdateBuffer = loader.apply("vkCmdUpdateBuffer");
        HANDLE$vkCmdUpdateBuffer = RawFunctionLoader.link(SEGMENT$vkCmdUpdateBuffer, Descriptors.DESCRIPTOR$vkCmdUpdateBuffer);
        SEGMENT$vkCmdUpdatePipelineIndirectBufferNV = loader.apply("vkCmdUpdatePipelineIndirectBufferNV");
        HANDLE$vkCmdUpdatePipelineIndirectBufferNV = RawFunctionLoader.link(SEGMENT$vkCmdUpdatePipelineIndirectBufferNV, Descriptors.DESCRIPTOR$vkCmdUpdatePipelineIndirectBufferNV);
        SEGMENT$vkCmdWaitEvents = loader.apply("vkCmdWaitEvents");
        HANDLE$vkCmdWaitEvents = RawFunctionLoader.link(SEGMENT$vkCmdWaitEvents, Descriptors.DESCRIPTOR$vkCmdWaitEvents);
        SEGMENT$vkCmdWaitEvents2 = loader.apply("vkCmdWaitEvents2");
        HANDLE$vkCmdWaitEvents2 = RawFunctionLoader.link(SEGMENT$vkCmdWaitEvents2, Descriptors.DESCRIPTOR$vkCmdWaitEvents2);
        SEGMENT$vkCmdWaitEvents2KHR = loader.apply("vkCmdWaitEvents2KHR");
        HANDLE$vkCmdWaitEvents2KHR = RawFunctionLoader.link(SEGMENT$vkCmdWaitEvents2KHR, Descriptors.DESCRIPTOR$vkCmdWaitEvents2);
        SEGMENT$vkCmdWriteAccelerationStructuresPropertiesKHR = loader.apply("vkCmdWriteAccelerationStructuresPropertiesKHR");
        HANDLE$vkCmdWriteAccelerationStructuresPropertiesKHR = RawFunctionLoader.link(SEGMENT$vkCmdWriteAccelerationStructuresPropertiesKHR, Descriptors.DESCRIPTOR$vkCmdWriteAccelerationStructuresPropertiesKHR);
        SEGMENT$vkCmdWriteAccelerationStructuresPropertiesNV = loader.apply("vkCmdWriteAccelerationStructuresPropertiesNV");
        HANDLE$vkCmdWriteAccelerationStructuresPropertiesNV = RawFunctionLoader.link(SEGMENT$vkCmdWriteAccelerationStructuresPropertiesNV, Descriptors.DESCRIPTOR$vkCmdWriteAccelerationStructuresPropertiesNV);
        SEGMENT$vkCmdWriteBufferMarker2AMD = loader.apply("vkCmdWriteBufferMarker2AMD");
        HANDLE$vkCmdWriteBufferMarker2AMD = RawFunctionLoader.link(SEGMENT$vkCmdWriteBufferMarker2AMD, Descriptors.DESCRIPTOR$vkCmdWriteBufferMarker2AMD);
        SEGMENT$vkCmdWriteBufferMarkerAMD = loader.apply("vkCmdWriteBufferMarkerAMD");
        HANDLE$vkCmdWriteBufferMarkerAMD = RawFunctionLoader.link(SEGMENT$vkCmdWriteBufferMarkerAMD, Descriptors.DESCRIPTOR$vkCmdWriteBufferMarkerAMD);
        SEGMENT$vkCmdWriteMicromapsPropertiesEXT = loader.apply("vkCmdWriteMicromapsPropertiesEXT");
        HANDLE$vkCmdWriteMicromapsPropertiesEXT = RawFunctionLoader.link(SEGMENT$vkCmdWriteMicromapsPropertiesEXT, Descriptors.DESCRIPTOR$vkCmdWriteMicromapsPropertiesEXT);
        SEGMENT$vkCmdWriteTimestamp = loader.apply("vkCmdWriteTimestamp");
        HANDLE$vkCmdWriteTimestamp = RawFunctionLoader.link(SEGMENT$vkCmdWriteTimestamp, Descriptors.DESCRIPTOR$vkCmdWriteTimestamp);
        SEGMENT$vkCmdWriteTimestamp2 = loader.apply("vkCmdWriteTimestamp2");
        HANDLE$vkCmdWriteTimestamp2 = RawFunctionLoader.link(SEGMENT$vkCmdWriteTimestamp2, Descriptors.DESCRIPTOR$vkCmdWriteTimestamp2);
        SEGMENT$vkCmdWriteTimestamp2KHR = loader.apply("vkCmdWriteTimestamp2KHR");
        HANDLE$vkCmdWriteTimestamp2KHR = RawFunctionLoader.link(SEGMENT$vkCmdWriteTimestamp2KHR, Descriptors.DESCRIPTOR$vkCmdWriteTimestamp2);
        SEGMENT$vkCompileDeferredNV = loader.apply("vkCompileDeferredNV");
        HANDLE$vkCompileDeferredNV = RawFunctionLoader.link(SEGMENT$vkCompileDeferredNV, Descriptors.DESCRIPTOR$vkCompileDeferredNV);
        SEGMENT$vkConvertCooperativeVectorMatrixNV = loader.apply("vkConvertCooperativeVectorMatrixNV");
        HANDLE$vkConvertCooperativeVectorMatrixNV = RawFunctionLoader.link(SEGMENT$vkConvertCooperativeVectorMatrixNV, Descriptors.DESCRIPTOR$vkConvertCooperativeVectorMatrixNV);
        SEGMENT$vkCopyAccelerationStructureKHR = loader.apply("vkCopyAccelerationStructureKHR");
        HANDLE$vkCopyAccelerationStructureKHR = RawFunctionLoader.link(SEGMENT$vkCopyAccelerationStructureKHR, Descriptors.DESCRIPTOR$vkCopyAccelerationStructureKHR);
        SEGMENT$vkCopyAccelerationStructureToMemoryKHR = loader.apply("vkCopyAccelerationStructureToMemoryKHR");
        HANDLE$vkCopyAccelerationStructureToMemoryKHR = RawFunctionLoader.link(SEGMENT$vkCopyAccelerationStructureToMemoryKHR, Descriptors.DESCRIPTOR$vkCopyAccelerationStructureToMemoryKHR);
        SEGMENT$vkCopyImageToImage = loader.apply("vkCopyImageToImage");
        HANDLE$vkCopyImageToImage = RawFunctionLoader.link(SEGMENT$vkCopyImageToImage, Descriptors.DESCRIPTOR$vkCopyImageToImage);
        SEGMENT$vkCopyImageToImageEXT = loader.apply("vkCopyImageToImageEXT");
        HANDLE$vkCopyImageToImageEXT = RawFunctionLoader.link(SEGMENT$vkCopyImageToImageEXT, Descriptors.DESCRIPTOR$vkCopyImageToImage);
        SEGMENT$vkCopyImageToMemory = loader.apply("vkCopyImageToMemory");
        HANDLE$vkCopyImageToMemory = RawFunctionLoader.link(SEGMENT$vkCopyImageToMemory, Descriptors.DESCRIPTOR$vkCopyImageToMemory);
        SEGMENT$vkCopyImageToMemoryEXT = loader.apply("vkCopyImageToMemoryEXT");
        HANDLE$vkCopyImageToMemoryEXT = RawFunctionLoader.link(SEGMENT$vkCopyImageToMemoryEXT, Descriptors.DESCRIPTOR$vkCopyImageToMemory);
        SEGMENT$vkCopyMemoryToAccelerationStructureKHR = loader.apply("vkCopyMemoryToAccelerationStructureKHR");
        HANDLE$vkCopyMemoryToAccelerationStructureKHR = RawFunctionLoader.link(SEGMENT$vkCopyMemoryToAccelerationStructureKHR, Descriptors.DESCRIPTOR$vkCopyMemoryToAccelerationStructureKHR);
        SEGMENT$vkCopyMemoryToImage = loader.apply("vkCopyMemoryToImage");
        HANDLE$vkCopyMemoryToImage = RawFunctionLoader.link(SEGMENT$vkCopyMemoryToImage, Descriptors.DESCRIPTOR$vkCopyMemoryToImage);
        SEGMENT$vkCopyMemoryToImageEXT = loader.apply("vkCopyMemoryToImageEXT");
        HANDLE$vkCopyMemoryToImageEXT = RawFunctionLoader.link(SEGMENT$vkCopyMemoryToImageEXT, Descriptors.DESCRIPTOR$vkCopyMemoryToImage);
        SEGMENT$vkCopyMemoryToMicromapEXT = loader.apply("vkCopyMemoryToMicromapEXT");
        HANDLE$vkCopyMemoryToMicromapEXT = RawFunctionLoader.link(SEGMENT$vkCopyMemoryToMicromapEXT, Descriptors.DESCRIPTOR$vkCopyMemoryToMicromapEXT);
        SEGMENT$vkCopyMicromapEXT = loader.apply("vkCopyMicromapEXT");
        HANDLE$vkCopyMicromapEXT = RawFunctionLoader.link(SEGMENT$vkCopyMicromapEXT, Descriptors.DESCRIPTOR$vkCopyMicromapEXT);
        SEGMENT$vkCopyMicromapToMemoryEXT = loader.apply("vkCopyMicromapToMemoryEXT");
        HANDLE$vkCopyMicromapToMemoryEXT = RawFunctionLoader.link(SEGMENT$vkCopyMicromapToMemoryEXT, Descriptors.DESCRIPTOR$vkCopyMicromapToMemoryEXT);
        SEGMENT$vkCreateAccelerationStructureKHR = loader.apply("vkCreateAccelerationStructureKHR");
        HANDLE$vkCreateAccelerationStructureKHR = RawFunctionLoader.link(SEGMENT$vkCreateAccelerationStructureKHR, Descriptors.DESCRIPTOR$vkCreateAccelerationStructureKHR);
        SEGMENT$vkCreateAccelerationStructureNV = loader.apply("vkCreateAccelerationStructureNV");
        HANDLE$vkCreateAccelerationStructureNV = RawFunctionLoader.link(SEGMENT$vkCreateAccelerationStructureNV, Descriptors.DESCRIPTOR$vkCreateAccelerationStructureNV);
        SEGMENT$vkCreateBuffer = loader.apply("vkCreateBuffer");
        HANDLE$vkCreateBuffer = RawFunctionLoader.link(SEGMENT$vkCreateBuffer, Descriptors.DESCRIPTOR$vkCreateBuffer);
        SEGMENT$vkCreateBufferCollectionFUCHSIA = loader.apply("vkCreateBufferCollectionFUCHSIA");
        HANDLE$vkCreateBufferCollectionFUCHSIA = RawFunctionLoader.link(SEGMENT$vkCreateBufferCollectionFUCHSIA, Descriptors.DESCRIPTOR$vkCreateBufferCollectionFUCHSIA);
        SEGMENT$vkCreateBufferView = loader.apply("vkCreateBufferView");
        HANDLE$vkCreateBufferView = RawFunctionLoader.link(SEGMENT$vkCreateBufferView, Descriptors.DESCRIPTOR$vkCreateBufferView);
        SEGMENT$vkCreateCommandPool = loader.apply("vkCreateCommandPool");
        HANDLE$vkCreateCommandPool = RawFunctionLoader.link(SEGMENT$vkCreateCommandPool, Descriptors.DESCRIPTOR$vkCreateCommandPool);
        SEGMENT$vkCreateComputePipelines = loader.apply("vkCreateComputePipelines");
        HANDLE$vkCreateComputePipelines = RawFunctionLoader.link(SEGMENT$vkCreateComputePipelines, Descriptors.DESCRIPTOR$vkCreateComputePipelines);
        SEGMENT$vkCreateCuFunctionNVX = loader.apply("vkCreateCuFunctionNVX");
        HANDLE$vkCreateCuFunctionNVX = RawFunctionLoader.link(SEGMENT$vkCreateCuFunctionNVX, Descriptors.DESCRIPTOR$vkCreateCuFunctionNVX);
        SEGMENT$vkCreateCuModuleNVX = loader.apply("vkCreateCuModuleNVX");
        HANDLE$vkCreateCuModuleNVX = RawFunctionLoader.link(SEGMENT$vkCreateCuModuleNVX, Descriptors.DESCRIPTOR$vkCreateCuModuleNVX);
        SEGMENT$vkCreateCudaFunctionNV = loader.apply("vkCreateCudaFunctionNV");
        HANDLE$vkCreateCudaFunctionNV = RawFunctionLoader.link(SEGMENT$vkCreateCudaFunctionNV, Descriptors.DESCRIPTOR$vkCreateCudaFunctionNV);
        SEGMENT$vkCreateCudaModuleNV = loader.apply("vkCreateCudaModuleNV");
        HANDLE$vkCreateCudaModuleNV = RawFunctionLoader.link(SEGMENT$vkCreateCudaModuleNV, Descriptors.DESCRIPTOR$vkCreateCudaModuleNV);
        SEGMENT$vkCreateDeferredOperationKHR = loader.apply("vkCreateDeferredOperationKHR");
        HANDLE$vkCreateDeferredOperationKHR = RawFunctionLoader.link(SEGMENT$vkCreateDeferredOperationKHR, Descriptors.DESCRIPTOR$vkCreateDeferredOperationKHR);
        SEGMENT$vkCreateDescriptorPool = loader.apply("vkCreateDescriptorPool");
        HANDLE$vkCreateDescriptorPool = RawFunctionLoader.link(SEGMENT$vkCreateDescriptorPool, Descriptors.DESCRIPTOR$vkCreateDescriptorPool);
        SEGMENT$vkCreateDescriptorSetLayout = loader.apply("vkCreateDescriptorSetLayout");
        HANDLE$vkCreateDescriptorSetLayout = RawFunctionLoader.link(SEGMENT$vkCreateDescriptorSetLayout, Descriptors.DESCRIPTOR$vkCreateDescriptorSetLayout);
        SEGMENT$vkCreateDescriptorUpdateTemplate = loader.apply("vkCreateDescriptorUpdateTemplate");
        HANDLE$vkCreateDescriptorUpdateTemplate = RawFunctionLoader.link(SEGMENT$vkCreateDescriptorUpdateTemplate, Descriptors.DESCRIPTOR$vkCreateDescriptorUpdateTemplate);
        SEGMENT$vkCreateDescriptorUpdateTemplateKHR = loader.apply("vkCreateDescriptorUpdateTemplateKHR");
        HANDLE$vkCreateDescriptorUpdateTemplateKHR = RawFunctionLoader.link(SEGMENT$vkCreateDescriptorUpdateTemplateKHR, Descriptors.DESCRIPTOR$vkCreateDescriptorUpdateTemplate);
        SEGMENT$vkCreateEvent = loader.apply("vkCreateEvent");
        HANDLE$vkCreateEvent = RawFunctionLoader.link(SEGMENT$vkCreateEvent, Descriptors.DESCRIPTOR$vkCreateEvent);
        SEGMENT$vkCreateExecutionGraphPipelinesAMDX = loader.apply("vkCreateExecutionGraphPipelinesAMDX");
        HANDLE$vkCreateExecutionGraphPipelinesAMDX = RawFunctionLoader.link(SEGMENT$vkCreateExecutionGraphPipelinesAMDX, Descriptors.DESCRIPTOR$vkCreateExecutionGraphPipelinesAMDX);
        SEGMENT$vkCreateExternalComputeQueueNV = loader.apply("vkCreateExternalComputeQueueNV");
        HANDLE$vkCreateExternalComputeQueueNV = RawFunctionLoader.link(SEGMENT$vkCreateExternalComputeQueueNV, Descriptors.DESCRIPTOR$vkCreateExternalComputeQueueNV);
        SEGMENT$vkCreateFence = loader.apply("vkCreateFence");
        HANDLE$vkCreateFence = RawFunctionLoader.link(SEGMENT$vkCreateFence, Descriptors.DESCRIPTOR$vkCreateFence);
        SEGMENT$vkCreateFramebuffer = loader.apply("vkCreateFramebuffer");
        HANDLE$vkCreateFramebuffer = RawFunctionLoader.link(SEGMENT$vkCreateFramebuffer, Descriptors.DESCRIPTOR$vkCreateFramebuffer);
        SEGMENT$vkCreateGraphicsPipelines = loader.apply("vkCreateGraphicsPipelines");
        HANDLE$vkCreateGraphicsPipelines = RawFunctionLoader.link(SEGMENT$vkCreateGraphicsPipelines, Descriptors.DESCRIPTOR$vkCreateGraphicsPipelines);
        SEGMENT$vkCreateImage = loader.apply("vkCreateImage");
        HANDLE$vkCreateImage = RawFunctionLoader.link(SEGMENT$vkCreateImage, Descriptors.DESCRIPTOR$vkCreateImage);
        SEGMENT$vkCreateImageView = loader.apply("vkCreateImageView");
        HANDLE$vkCreateImageView = RawFunctionLoader.link(SEGMENT$vkCreateImageView, Descriptors.DESCRIPTOR$vkCreateImageView);
        SEGMENT$vkCreateIndirectCommandsLayoutEXT = loader.apply("vkCreateIndirectCommandsLayoutEXT");
        HANDLE$vkCreateIndirectCommandsLayoutEXT = RawFunctionLoader.link(SEGMENT$vkCreateIndirectCommandsLayoutEXT, Descriptors.DESCRIPTOR$vkCreateIndirectCommandsLayoutEXT);
        SEGMENT$vkCreateIndirectCommandsLayoutNV = loader.apply("vkCreateIndirectCommandsLayoutNV");
        HANDLE$vkCreateIndirectCommandsLayoutNV = RawFunctionLoader.link(SEGMENT$vkCreateIndirectCommandsLayoutNV, Descriptors.DESCRIPTOR$vkCreateIndirectCommandsLayoutNV);
        SEGMENT$vkCreateIndirectExecutionSetEXT = loader.apply("vkCreateIndirectExecutionSetEXT");
        HANDLE$vkCreateIndirectExecutionSetEXT = RawFunctionLoader.link(SEGMENT$vkCreateIndirectExecutionSetEXT, Descriptors.DESCRIPTOR$vkCreateIndirectExecutionSetEXT);
        SEGMENT$vkCreateMicromapEXT = loader.apply("vkCreateMicromapEXT");
        HANDLE$vkCreateMicromapEXT = RawFunctionLoader.link(SEGMENT$vkCreateMicromapEXT, Descriptors.DESCRIPTOR$vkCreateMicromapEXT);
        SEGMENT$vkCreateOpticalFlowSessionNV = loader.apply("vkCreateOpticalFlowSessionNV");
        HANDLE$vkCreateOpticalFlowSessionNV = RawFunctionLoader.link(SEGMENT$vkCreateOpticalFlowSessionNV, Descriptors.DESCRIPTOR$vkCreateOpticalFlowSessionNV);
        SEGMENT$vkCreatePipelineBinariesKHR = loader.apply("vkCreatePipelineBinariesKHR");
        HANDLE$vkCreatePipelineBinariesKHR = RawFunctionLoader.link(SEGMENT$vkCreatePipelineBinariesKHR, Descriptors.DESCRIPTOR$vkCreatePipelineBinariesKHR);
        SEGMENT$vkCreatePipelineCache = loader.apply("vkCreatePipelineCache");
        HANDLE$vkCreatePipelineCache = RawFunctionLoader.link(SEGMENT$vkCreatePipelineCache, Descriptors.DESCRIPTOR$vkCreatePipelineCache);
        SEGMENT$vkCreatePipelineLayout = loader.apply("vkCreatePipelineLayout");
        HANDLE$vkCreatePipelineLayout = RawFunctionLoader.link(SEGMENT$vkCreatePipelineLayout, Descriptors.DESCRIPTOR$vkCreatePipelineLayout);
        SEGMENT$vkCreatePrivateDataSlot = loader.apply("vkCreatePrivateDataSlot");
        HANDLE$vkCreatePrivateDataSlot = RawFunctionLoader.link(SEGMENT$vkCreatePrivateDataSlot, Descriptors.DESCRIPTOR$vkCreatePrivateDataSlot);
        SEGMENT$vkCreatePrivateDataSlotEXT = loader.apply("vkCreatePrivateDataSlotEXT");
        HANDLE$vkCreatePrivateDataSlotEXT = RawFunctionLoader.link(SEGMENT$vkCreatePrivateDataSlotEXT, Descriptors.DESCRIPTOR$vkCreatePrivateDataSlot);
        SEGMENT$vkCreateQueryPool = loader.apply("vkCreateQueryPool");
        HANDLE$vkCreateQueryPool = RawFunctionLoader.link(SEGMENT$vkCreateQueryPool, Descriptors.DESCRIPTOR$vkCreateQueryPool);
        SEGMENT$vkCreateRayTracingPipelinesKHR = loader.apply("vkCreateRayTracingPipelinesKHR");
        HANDLE$vkCreateRayTracingPipelinesKHR = RawFunctionLoader.link(SEGMENT$vkCreateRayTracingPipelinesKHR, Descriptors.DESCRIPTOR$vkCreateRayTracingPipelinesKHR);
        SEGMENT$vkCreateRayTracingPipelinesNV = loader.apply("vkCreateRayTracingPipelinesNV");
        HANDLE$vkCreateRayTracingPipelinesNV = RawFunctionLoader.link(SEGMENT$vkCreateRayTracingPipelinesNV, Descriptors.DESCRIPTOR$vkCreateRayTracingPipelinesNV);
        SEGMENT$vkCreateRenderPass = loader.apply("vkCreateRenderPass");
        HANDLE$vkCreateRenderPass = RawFunctionLoader.link(SEGMENT$vkCreateRenderPass, Descriptors.DESCRIPTOR$vkCreateRenderPass);
        SEGMENT$vkCreateRenderPass2 = loader.apply("vkCreateRenderPass2");
        HANDLE$vkCreateRenderPass2 = RawFunctionLoader.link(SEGMENT$vkCreateRenderPass2, Descriptors.DESCRIPTOR$vkCreateRenderPass2);
        SEGMENT$vkCreateRenderPass2KHR = loader.apply("vkCreateRenderPass2KHR");
        HANDLE$vkCreateRenderPass2KHR = RawFunctionLoader.link(SEGMENT$vkCreateRenderPass2KHR, Descriptors.DESCRIPTOR$vkCreateRenderPass2);
        SEGMENT$vkCreateSampler = loader.apply("vkCreateSampler");
        HANDLE$vkCreateSampler = RawFunctionLoader.link(SEGMENT$vkCreateSampler, Descriptors.DESCRIPTOR$vkCreateSampler);
        SEGMENT$vkCreateSamplerYcbcrConversion = loader.apply("vkCreateSamplerYcbcrConversion");
        HANDLE$vkCreateSamplerYcbcrConversion = RawFunctionLoader.link(SEGMENT$vkCreateSamplerYcbcrConversion, Descriptors.DESCRIPTOR$vkCreateSamplerYcbcrConversion);
        SEGMENT$vkCreateSamplerYcbcrConversionKHR = loader.apply("vkCreateSamplerYcbcrConversionKHR");
        HANDLE$vkCreateSamplerYcbcrConversionKHR = RawFunctionLoader.link(SEGMENT$vkCreateSamplerYcbcrConversionKHR, Descriptors.DESCRIPTOR$vkCreateSamplerYcbcrConversion);
        SEGMENT$vkCreateSemaphore = loader.apply("vkCreateSemaphore");
        HANDLE$vkCreateSemaphore = RawFunctionLoader.link(SEGMENT$vkCreateSemaphore, Descriptors.DESCRIPTOR$vkCreateSemaphore);
        SEGMENT$vkCreateSemaphoreSciSyncPoolNV = loader.apply("vkCreateSemaphoreSciSyncPoolNV");
        HANDLE$vkCreateSemaphoreSciSyncPoolNV = RawFunctionLoader.link(SEGMENT$vkCreateSemaphoreSciSyncPoolNV, Descriptors.DESCRIPTOR$vkCreateSemaphoreSciSyncPoolNV);
        SEGMENT$vkCreateShaderModule = loader.apply("vkCreateShaderModule");
        HANDLE$vkCreateShaderModule = RawFunctionLoader.link(SEGMENT$vkCreateShaderModule, Descriptors.DESCRIPTOR$vkCreateShaderModule);
        SEGMENT$vkCreateShadersEXT = loader.apply("vkCreateShadersEXT");
        HANDLE$vkCreateShadersEXT = RawFunctionLoader.link(SEGMENT$vkCreateShadersEXT, Descriptors.DESCRIPTOR$vkCreateShadersEXT);
        SEGMENT$vkCreateSharedSwapchainsKHR = loader.apply("vkCreateSharedSwapchainsKHR");
        HANDLE$vkCreateSharedSwapchainsKHR = RawFunctionLoader.link(SEGMENT$vkCreateSharedSwapchainsKHR, Descriptors.DESCRIPTOR$vkCreateSharedSwapchainsKHR);
        SEGMENT$vkCreateSwapchainKHR = loader.apply("vkCreateSwapchainKHR");
        HANDLE$vkCreateSwapchainKHR = RawFunctionLoader.link(SEGMENT$vkCreateSwapchainKHR, Descriptors.DESCRIPTOR$vkCreateSwapchainKHR);
        SEGMENT$vkCreateValidationCacheEXT = loader.apply("vkCreateValidationCacheEXT");
        HANDLE$vkCreateValidationCacheEXT = RawFunctionLoader.link(SEGMENT$vkCreateValidationCacheEXT, Descriptors.DESCRIPTOR$vkCreateValidationCacheEXT);
        SEGMENT$vkCreateVideoSessionKHR = loader.apply("vkCreateVideoSessionKHR");
        HANDLE$vkCreateVideoSessionKHR = RawFunctionLoader.link(SEGMENT$vkCreateVideoSessionKHR, Descriptors.DESCRIPTOR$vkCreateVideoSessionKHR);
        SEGMENT$vkCreateVideoSessionParametersKHR = loader.apply("vkCreateVideoSessionParametersKHR");
        HANDLE$vkCreateVideoSessionParametersKHR = RawFunctionLoader.link(SEGMENT$vkCreateVideoSessionParametersKHR, Descriptors.DESCRIPTOR$vkCreateVideoSessionParametersKHR);
        SEGMENT$vkDebugMarkerSetObjectNameEXT = loader.apply("vkDebugMarkerSetObjectNameEXT");
        HANDLE$vkDebugMarkerSetObjectNameEXT = RawFunctionLoader.link(SEGMENT$vkDebugMarkerSetObjectNameEXT, Descriptors.DESCRIPTOR$vkDebugMarkerSetObjectNameEXT);
        SEGMENT$vkDebugMarkerSetObjectTagEXT = loader.apply("vkDebugMarkerSetObjectTagEXT");
        HANDLE$vkDebugMarkerSetObjectTagEXT = RawFunctionLoader.link(SEGMENT$vkDebugMarkerSetObjectTagEXT, Descriptors.DESCRIPTOR$vkDebugMarkerSetObjectTagEXT);
        SEGMENT$vkDeferredOperationJoinKHR = loader.apply("vkDeferredOperationJoinKHR");
        HANDLE$vkDeferredOperationJoinKHR = RawFunctionLoader.link(SEGMENT$vkDeferredOperationJoinKHR, Descriptors.DESCRIPTOR$vkDeferredOperationJoinKHR);
        SEGMENT$vkDestroyAccelerationStructureKHR = loader.apply("vkDestroyAccelerationStructureKHR");
        HANDLE$vkDestroyAccelerationStructureKHR = RawFunctionLoader.link(SEGMENT$vkDestroyAccelerationStructureKHR, Descriptors.DESCRIPTOR$vkDestroyAccelerationStructureKHR);
        SEGMENT$vkDestroyAccelerationStructureNV = loader.apply("vkDestroyAccelerationStructureNV");
        HANDLE$vkDestroyAccelerationStructureNV = RawFunctionLoader.link(SEGMENT$vkDestroyAccelerationStructureNV, Descriptors.DESCRIPTOR$vkDestroyAccelerationStructureNV);
        SEGMENT$vkDestroyBuffer = loader.apply("vkDestroyBuffer");
        HANDLE$vkDestroyBuffer = RawFunctionLoader.link(SEGMENT$vkDestroyBuffer, Descriptors.DESCRIPTOR$vkDestroyBuffer);
        SEGMENT$vkDestroyBufferCollectionFUCHSIA = loader.apply("vkDestroyBufferCollectionFUCHSIA");
        HANDLE$vkDestroyBufferCollectionFUCHSIA = RawFunctionLoader.link(SEGMENT$vkDestroyBufferCollectionFUCHSIA, Descriptors.DESCRIPTOR$vkDestroyBufferCollectionFUCHSIA);
        SEGMENT$vkDestroyBufferView = loader.apply("vkDestroyBufferView");
        HANDLE$vkDestroyBufferView = RawFunctionLoader.link(SEGMENT$vkDestroyBufferView, Descriptors.DESCRIPTOR$vkDestroyBufferView);
        SEGMENT$vkDestroyCommandPool = loader.apply("vkDestroyCommandPool");
        HANDLE$vkDestroyCommandPool = RawFunctionLoader.link(SEGMENT$vkDestroyCommandPool, Descriptors.DESCRIPTOR$vkDestroyCommandPool);
        SEGMENT$vkDestroyCuFunctionNVX = loader.apply("vkDestroyCuFunctionNVX");
        HANDLE$vkDestroyCuFunctionNVX = RawFunctionLoader.link(SEGMENT$vkDestroyCuFunctionNVX, Descriptors.DESCRIPTOR$vkDestroyCuFunctionNVX);
        SEGMENT$vkDestroyCuModuleNVX = loader.apply("vkDestroyCuModuleNVX");
        HANDLE$vkDestroyCuModuleNVX = RawFunctionLoader.link(SEGMENT$vkDestroyCuModuleNVX, Descriptors.DESCRIPTOR$vkDestroyCuModuleNVX);
        SEGMENT$vkDestroyCudaFunctionNV = loader.apply("vkDestroyCudaFunctionNV");
        HANDLE$vkDestroyCudaFunctionNV = RawFunctionLoader.link(SEGMENT$vkDestroyCudaFunctionNV, Descriptors.DESCRIPTOR$vkDestroyCudaFunctionNV);
        SEGMENT$vkDestroyCudaModuleNV = loader.apply("vkDestroyCudaModuleNV");
        HANDLE$vkDestroyCudaModuleNV = RawFunctionLoader.link(SEGMENT$vkDestroyCudaModuleNV, Descriptors.DESCRIPTOR$vkDestroyCudaModuleNV);
        SEGMENT$vkDestroyDeferredOperationKHR = loader.apply("vkDestroyDeferredOperationKHR");
        HANDLE$vkDestroyDeferredOperationKHR = RawFunctionLoader.link(SEGMENT$vkDestroyDeferredOperationKHR, Descriptors.DESCRIPTOR$vkDestroyDeferredOperationKHR);
        SEGMENT$vkDestroyDescriptorPool = loader.apply("vkDestroyDescriptorPool");
        HANDLE$vkDestroyDescriptorPool = RawFunctionLoader.link(SEGMENT$vkDestroyDescriptorPool, Descriptors.DESCRIPTOR$vkDestroyDescriptorPool);
        SEGMENT$vkDestroyDescriptorSetLayout = loader.apply("vkDestroyDescriptorSetLayout");
        HANDLE$vkDestroyDescriptorSetLayout = RawFunctionLoader.link(SEGMENT$vkDestroyDescriptorSetLayout, Descriptors.DESCRIPTOR$vkDestroyDescriptorSetLayout);
        SEGMENT$vkDestroyDescriptorUpdateTemplate = loader.apply("vkDestroyDescriptorUpdateTemplate");
        HANDLE$vkDestroyDescriptorUpdateTemplate = RawFunctionLoader.link(SEGMENT$vkDestroyDescriptorUpdateTemplate, Descriptors.DESCRIPTOR$vkDestroyDescriptorUpdateTemplate);
        SEGMENT$vkDestroyDescriptorUpdateTemplateKHR = loader.apply("vkDestroyDescriptorUpdateTemplateKHR");
        HANDLE$vkDestroyDescriptorUpdateTemplateKHR = RawFunctionLoader.link(SEGMENT$vkDestroyDescriptorUpdateTemplateKHR, Descriptors.DESCRIPTOR$vkDestroyDescriptorUpdateTemplate);
        SEGMENT$vkDestroyDevice = loader.apply("vkDestroyDevice");
        HANDLE$vkDestroyDevice = RawFunctionLoader.link(SEGMENT$vkDestroyDevice, Descriptors.DESCRIPTOR$vkDestroyDevice);
        SEGMENT$vkDestroyEvent = loader.apply("vkDestroyEvent");
        HANDLE$vkDestroyEvent = RawFunctionLoader.link(SEGMENT$vkDestroyEvent, Descriptors.DESCRIPTOR$vkDestroyEvent);
        SEGMENT$vkDestroyExternalComputeQueueNV = loader.apply("vkDestroyExternalComputeQueueNV");
        HANDLE$vkDestroyExternalComputeQueueNV = RawFunctionLoader.link(SEGMENT$vkDestroyExternalComputeQueueNV, Descriptors.DESCRIPTOR$vkDestroyExternalComputeQueueNV);
        SEGMENT$vkDestroyFence = loader.apply("vkDestroyFence");
        HANDLE$vkDestroyFence = RawFunctionLoader.link(SEGMENT$vkDestroyFence, Descriptors.DESCRIPTOR$vkDestroyFence);
        SEGMENT$vkDestroyFramebuffer = loader.apply("vkDestroyFramebuffer");
        HANDLE$vkDestroyFramebuffer = RawFunctionLoader.link(SEGMENT$vkDestroyFramebuffer, Descriptors.DESCRIPTOR$vkDestroyFramebuffer);
        SEGMENT$vkDestroyImage = loader.apply("vkDestroyImage");
        HANDLE$vkDestroyImage = RawFunctionLoader.link(SEGMENT$vkDestroyImage, Descriptors.DESCRIPTOR$vkDestroyImage);
        SEGMENT$vkDestroyImageView = loader.apply("vkDestroyImageView");
        HANDLE$vkDestroyImageView = RawFunctionLoader.link(SEGMENT$vkDestroyImageView, Descriptors.DESCRIPTOR$vkDestroyImageView);
        SEGMENT$vkDestroyIndirectCommandsLayoutEXT = loader.apply("vkDestroyIndirectCommandsLayoutEXT");
        HANDLE$vkDestroyIndirectCommandsLayoutEXT = RawFunctionLoader.link(SEGMENT$vkDestroyIndirectCommandsLayoutEXT, Descriptors.DESCRIPTOR$vkDestroyIndirectCommandsLayoutEXT);
        SEGMENT$vkDestroyIndirectCommandsLayoutNV = loader.apply("vkDestroyIndirectCommandsLayoutNV");
        HANDLE$vkDestroyIndirectCommandsLayoutNV = RawFunctionLoader.link(SEGMENT$vkDestroyIndirectCommandsLayoutNV, Descriptors.DESCRIPTOR$vkDestroyIndirectCommandsLayoutNV);
        SEGMENT$vkDestroyIndirectExecutionSetEXT = loader.apply("vkDestroyIndirectExecutionSetEXT");
        HANDLE$vkDestroyIndirectExecutionSetEXT = RawFunctionLoader.link(SEGMENT$vkDestroyIndirectExecutionSetEXT, Descriptors.DESCRIPTOR$vkDestroyIndirectExecutionSetEXT);
        SEGMENT$vkDestroyMicromapEXT = loader.apply("vkDestroyMicromapEXT");
        HANDLE$vkDestroyMicromapEXT = RawFunctionLoader.link(SEGMENT$vkDestroyMicromapEXT, Descriptors.DESCRIPTOR$vkDestroyMicromapEXT);
        SEGMENT$vkDestroyOpticalFlowSessionNV = loader.apply("vkDestroyOpticalFlowSessionNV");
        HANDLE$vkDestroyOpticalFlowSessionNV = RawFunctionLoader.link(SEGMENT$vkDestroyOpticalFlowSessionNV, Descriptors.DESCRIPTOR$vkDestroyOpticalFlowSessionNV);
        SEGMENT$vkDestroyPipeline = loader.apply("vkDestroyPipeline");
        HANDLE$vkDestroyPipeline = RawFunctionLoader.link(SEGMENT$vkDestroyPipeline, Descriptors.DESCRIPTOR$vkDestroyPipeline);
        SEGMENT$vkDestroyPipelineBinaryKHR = loader.apply("vkDestroyPipelineBinaryKHR");
        HANDLE$vkDestroyPipelineBinaryKHR = RawFunctionLoader.link(SEGMENT$vkDestroyPipelineBinaryKHR, Descriptors.DESCRIPTOR$vkDestroyPipelineBinaryKHR);
        SEGMENT$vkDestroyPipelineCache = loader.apply("vkDestroyPipelineCache");
        HANDLE$vkDestroyPipelineCache = RawFunctionLoader.link(SEGMENT$vkDestroyPipelineCache, Descriptors.DESCRIPTOR$vkDestroyPipelineCache);
        SEGMENT$vkDestroyPipelineLayout = loader.apply("vkDestroyPipelineLayout");
        HANDLE$vkDestroyPipelineLayout = RawFunctionLoader.link(SEGMENT$vkDestroyPipelineLayout, Descriptors.DESCRIPTOR$vkDestroyPipelineLayout);
        SEGMENT$vkDestroyPrivateDataSlot = loader.apply("vkDestroyPrivateDataSlot");
        HANDLE$vkDestroyPrivateDataSlot = RawFunctionLoader.link(SEGMENT$vkDestroyPrivateDataSlot, Descriptors.DESCRIPTOR$vkDestroyPrivateDataSlot);
        SEGMENT$vkDestroyPrivateDataSlotEXT = loader.apply("vkDestroyPrivateDataSlotEXT");
        HANDLE$vkDestroyPrivateDataSlotEXT = RawFunctionLoader.link(SEGMENT$vkDestroyPrivateDataSlotEXT, Descriptors.DESCRIPTOR$vkDestroyPrivateDataSlot);
        SEGMENT$vkDestroyQueryPool = loader.apply("vkDestroyQueryPool");
        HANDLE$vkDestroyQueryPool = RawFunctionLoader.link(SEGMENT$vkDestroyQueryPool, Descriptors.DESCRIPTOR$vkDestroyQueryPool);
        SEGMENT$vkDestroyRenderPass = loader.apply("vkDestroyRenderPass");
        HANDLE$vkDestroyRenderPass = RawFunctionLoader.link(SEGMENT$vkDestroyRenderPass, Descriptors.DESCRIPTOR$vkDestroyRenderPass);
        SEGMENT$vkDestroySampler = loader.apply("vkDestroySampler");
        HANDLE$vkDestroySampler = RawFunctionLoader.link(SEGMENT$vkDestroySampler, Descriptors.DESCRIPTOR$vkDestroySampler);
        SEGMENT$vkDestroySamplerYcbcrConversion = loader.apply("vkDestroySamplerYcbcrConversion");
        HANDLE$vkDestroySamplerYcbcrConversion = RawFunctionLoader.link(SEGMENT$vkDestroySamplerYcbcrConversion, Descriptors.DESCRIPTOR$vkDestroySamplerYcbcrConversion);
        SEGMENT$vkDestroySamplerYcbcrConversionKHR = loader.apply("vkDestroySamplerYcbcrConversionKHR");
        HANDLE$vkDestroySamplerYcbcrConversionKHR = RawFunctionLoader.link(SEGMENT$vkDestroySamplerYcbcrConversionKHR, Descriptors.DESCRIPTOR$vkDestroySamplerYcbcrConversion);
        SEGMENT$vkDestroySemaphore = loader.apply("vkDestroySemaphore");
        HANDLE$vkDestroySemaphore = RawFunctionLoader.link(SEGMENT$vkDestroySemaphore, Descriptors.DESCRIPTOR$vkDestroySemaphore);
        SEGMENT$vkDestroySemaphoreSciSyncPoolNV = loader.apply("vkDestroySemaphoreSciSyncPoolNV");
        HANDLE$vkDestroySemaphoreSciSyncPoolNV = RawFunctionLoader.link(SEGMENT$vkDestroySemaphoreSciSyncPoolNV, Descriptors.DESCRIPTOR$vkDestroySemaphoreSciSyncPoolNV);
        SEGMENT$vkDestroyShaderEXT = loader.apply("vkDestroyShaderEXT");
        HANDLE$vkDestroyShaderEXT = RawFunctionLoader.link(SEGMENT$vkDestroyShaderEXT, Descriptors.DESCRIPTOR$vkDestroyShaderEXT);
        SEGMENT$vkDestroyShaderModule = loader.apply("vkDestroyShaderModule");
        HANDLE$vkDestroyShaderModule = RawFunctionLoader.link(SEGMENT$vkDestroyShaderModule, Descriptors.DESCRIPTOR$vkDestroyShaderModule);
        SEGMENT$vkDestroySwapchainKHR = loader.apply("vkDestroySwapchainKHR");
        HANDLE$vkDestroySwapchainKHR = RawFunctionLoader.link(SEGMENT$vkDestroySwapchainKHR, Descriptors.DESCRIPTOR$vkDestroySwapchainKHR);
        SEGMENT$vkDestroyValidationCacheEXT = loader.apply("vkDestroyValidationCacheEXT");
        HANDLE$vkDestroyValidationCacheEXT = RawFunctionLoader.link(SEGMENT$vkDestroyValidationCacheEXT, Descriptors.DESCRIPTOR$vkDestroyValidationCacheEXT);
        SEGMENT$vkDestroyVideoSessionKHR = loader.apply("vkDestroyVideoSessionKHR");
        HANDLE$vkDestroyVideoSessionKHR = RawFunctionLoader.link(SEGMENT$vkDestroyVideoSessionKHR, Descriptors.DESCRIPTOR$vkDestroyVideoSessionKHR);
        SEGMENT$vkDestroyVideoSessionParametersKHR = loader.apply("vkDestroyVideoSessionParametersKHR");
        HANDLE$vkDestroyVideoSessionParametersKHR = RawFunctionLoader.link(SEGMENT$vkDestroyVideoSessionParametersKHR, Descriptors.DESCRIPTOR$vkDestroyVideoSessionParametersKHR);
        SEGMENT$vkDeviceWaitIdle = loader.apply("vkDeviceWaitIdle");
        HANDLE$vkDeviceWaitIdle = RawFunctionLoader.link(SEGMENT$vkDeviceWaitIdle, Descriptors.DESCRIPTOR$vkDeviceWaitIdle);
        SEGMENT$vkDisplayPowerControlEXT = loader.apply("vkDisplayPowerControlEXT");
        HANDLE$vkDisplayPowerControlEXT = RawFunctionLoader.link(SEGMENT$vkDisplayPowerControlEXT, Descriptors.DESCRIPTOR$vkDisplayPowerControlEXT);
        SEGMENT$vkEndCommandBuffer = loader.apply("vkEndCommandBuffer");
        HANDLE$vkEndCommandBuffer = RawFunctionLoader.link(SEGMENT$vkEndCommandBuffer, Descriptors.DESCRIPTOR$vkEndCommandBuffer);
        SEGMENT$vkExportMetalObjectsEXT = loader.apply("vkExportMetalObjectsEXT");
        HANDLE$vkExportMetalObjectsEXT = RawFunctionLoader.link(SEGMENT$vkExportMetalObjectsEXT, Descriptors.DESCRIPTOR$vkExportMetalObjectsEXT);
        SEGMENT$vkFlushMappedMemoryRanges = loader.apply("vkFlushMappedMemoryRanges");
        HANDLE$vkFlushMappedMemoryRanges = RawFunctionLoader.link(SEGMENT$vkFlushMappedMemoryRanges, Descriptors.DESCRIPTOR$vkFlushMappedMemoryRanges);
        SEGMENT$vkFreeCommandBuffers = loader.apply("vkFreeCommandBuffers");
        HANDLE$vkFreeCommandBuffers = RawFunctionLoader.link(SEGMENT$vkFreeCommandBuffers, Descriptors.DESCRIPTOR$vkFreeCommandBuffers);
        SEGMENT$vkFreeDescriptorSets = loader.apply("vkFreeDescriptorSets");
        HANDLE$vkFreeDescriptorSets = RawFunctionLoader.link(SEGMENT$vkFreeDescriptorSets, Descriptors.DESCRIPTOR$vkFreeDescriptorSets);
        SEGMENT$vkFreeMemory = loader.apply("vkFreeMemory");
        HANDLE$vkFreeMemory = RawFunctionLoader.link(SEGMENT$vkFreeMemory, Descriptors.DESCRIPTOR$vkFreeMemory);
        SEGMENT$vkGetAccelerationStructureBuildSizesKHR = loader.apply("vkGetAccelerationStructureBuildSizesKHR");
        HANDLE$vkGetAccelerationStructureBuildSizesKHR = RawFunctionLoader.link(SEGMENT$vkGetAccelerationStructureBuildSizesKHR, Descriptors.DESCRIPTOR$vkGetAccelerationStructureBuildSizesKHR);
        SEGMENT$vkGetAccelerationStructureDeviceAddressKHR = loader.apply("vkGetAccelerationStructureDeviceAddressKHR");
        HANDLE$vkGetAccelerationStructureDeviceAddressKHR = RawFunctionLoader.link(SEGMENT$vkGetAccelerationStructureDeviceAddressKHR, Descriptors.DESCRIPTOR$vkGetAccelerationStructureDeviceAddressKHR);
        SEGMENT$vkGetAccelerationStructureHandleNV = loader.apply("vkGetAccelerationStructureHandleNV");
        HANDLE$vkGetAccelerationStructureHandleNV = RawFunctionLoader.link(SEGMENT$vkGetAccelerationStructureHandleNV, Descriptors.DESCRIPTOR$vkGetAccelerationStructureHandleNV);
        SEGMENT$vkGetAccelerationStructureMemoryRequirementsNV = loader.apply("vkGetAccelerationStructureMemoryRequirementsNV");
        HANDLE$vkGetAccelerationStructureMemoryRequirementsNV = RawFunctionLoader.link(SEGMENT$vkGetAccelerationStructureMemoryRequirementsNV, Descriptors.DESCRIPTOR$vkGetAccelerationStructureMemoryRequirementsNV);
        SEGMENT$vkGetAccelerationStructureOpaqueCaptureDescriptorDataEXT = loader.apply("vkGetAccelerationStructureOpaqueCaptureDescriptorDataEXT");
        HANDLE$vkGetAccelerationStructureOpaqueCaptureDescriptorDataEXT = RawFunctionLoader.link(SEGMENT$vkGetAccelerationStructureOpaqueCaptureDescriptorDataEXT, Descriptors.DESCRIPTOR$vkGetAccelerationStructureOpaqueCaptureDescriptorDataEXT);
        SEGMENT$vkGetAndroidHardwareBufferPropertiesANDROID = loader.apply("vkGetAndroidHardwareBufferPropertiesANDROID");
        HANDLE$vkGetAndroidHardwareBufferPropertiesANDROID = RawFunctionLoader.link(SEGMENT$vkGetAndroidHardwareBufferPropertiesANDROID, Descriptors.DESCRIPTOR$vkGetAndroidHardwareBufferPropertiesANDROID);
        SEGMENT$vkGetBufferCollectionPropertiesFUCHSIA = loader.apply("vkGetBufferCollectionPropertiesFUCHSIA");
        HANDLE$vkGetBufferCollectionPropertiesFUCHSIA = RawFunctionLoader.link(SEGMENT$vkGetBufferCollectionPropertiesFUCHSIA, Descriptors.DESCRIPTOR$vkGetBufferCollectionPropertiesFUCHSIA);
        SEGMENT$vkGetBufferDeviceAddress = loader.apply("vkGetBufferDeviceAddress");
        HANDLE$vkGetBufferDeviceAddress = RawFunctionLoader.link(SEGMENT$vkGetBufferDeviceAddress, Descriptors.DESCRIPTOR$vkGetBufferDeviceAddress);
        SEGMENT$vkGetBufferDeviceAddressEXT = loader.apply("vkGetBufferDeviceAddressEXT");
        HANDLE$vkGetBufferDeviceAddressEXT = RawFunctionLoader.link(SEGMENT$vkGetBufferDeviceAddressEXT, Descriptors.DESCRIPTOR$vkGetBufferDeviceAddress);
        SEGMENT$vkGetBufferDeviceAddressKHR = loader.apply("vkGetBufferDeviceAddressKHR");
        HANDLE$vkGetBufferDeviceAddressKHR = RawFunctionLoader.link(SEGMENT$vkGetBufferDeviceAddressKHR, Descriptors.DESCRIPTOR$vkGetBufferDeviceAddress);
        SEGMENT$vkGetBufferMemoryRequirements = loader.apply("vkGetBufferMemoryRequirements");
        HANDLE$vkGetBufferMemoryRequirements = RawFunctionLoader.link(SEGMENT$vkGetBufferMemoryRequirements, Descriptors.DESCRIPTOR$vkGetBufferMemoryRequirements);
        SEGMENT$vkGetBufferMemoryRequirements2 = loader.apply("vkGetBufferMemoryRequirements2");
        HANDLE$vkGetBufferMemoryRequirements2 = RawFunctionLoader.link(SEGMENT$vkGetBufferMemoryRequirements2, Descriptors.DESCRIPTOR$vkGetBufferMemoryRequirements2);
        SEGMENT$vkGetBufferMemoryRequirements2KHR = loader.apply("vkGetBufferMemoryRequirements2KHR");
        HANDLE$vkGetBufferMemoryRequirements2KHR = RawFunctionLoader.link(SEGMENT$vkGetBufferMemoryRequirements2KHR, Descriptors.DESCRIPTOR$vkGetBufferMemoryRequirements2);
        SEGMENT$vkGetBufferOpaqueCaptureAddress = loader.apply("vkGetBufferOpaqueCaptureAddress");
        HANDLE$vkGetBufferOpaqueCaptureAddress = RawFunctionLoader.link(SEGMENT$vkGetBufferOpaqueCaptureAddress, Descriptors.DESCRIPTOR$vkGetBufferOpaqueCaptureAddress);
        SEGMENT$vkGetBufferOpaqueCaptureAddressKHR = loader.apply("vkGetBufferOpaqueCaptureAddressKHR");
        HANDLE$vkGetBufferOpaqueCaptureAddressKHR = RawFunctionLoader.link(SEGMENT$vkGetBufferOpaqueCaptureAddressKHR, Descriptors.DESCRIPTOR$vkGetBufferOpaqueCaptureAddress);
        SEGMENT$vkGetBufferOpaqueCaptureDescriptorDataEXT = loader.apply("vkGetBufferOpaqueCaptureDescriptorDataEXT");
        HANDLE$vkGetBufferOpaqueCaptureDescriptorDataEXT = RawFunctionLoader.link(SEGMENT$vkGetBufferOpaqueCaptureDescriptorDataEXT, Descriptors.DESCRIPTOR$vkGetBufferOpaqueCaptureDescriptorDataEXT);
        SEGMENT$vkGetCalibratedTimestampsEXT = loader.apply("vkGetCalibratedTimestampsEXT");
        HANDLE$vkGetCalibratedTimestampsEXT = RawFunctionLoader.link(SEGMENT$vkGetCalibratedTimestampsEXT, Descriptors.DESCRIPTOR$vkGetCalibratedTimestampsKHR);
        SEGMENT$vkGetCalibratedTimestampsKHR = loader.apply("vkGetCalibratedTimestampsKHR");
        HANDLE$vkGetCalibratedTimestampsKHR = RawFunctionLoader.link(SEGMENT$vkGetCalibratedTimestampsKHR, Descriptors.DESCRIPTOR$vkGetCalibratedTimestampsKHR);
        SEGMENT$vkGetClusterAccelerationStructureBuildSizesNV = loader.apply("vkGetClusterAccelerationStructureBuildSizesNV");
        HANDLE$vkGetClusterAccelerationStructureBuildSizesNV = RawFunctionLoader.link(SEGMENT$vkGetClusterAccelerationStructureBuildSizesNV, Descriptors.DESCRIPTOR$vkGetClusterAccelerationStructureBuildSizesNV);
        SEGMENT$vkGetCudaModuleCacheNV = loader.apply("vkGetCudaModuleCacheNV");
        HANDLE$vkGetCudaModuleCacheNV = RawFunctionLoader.link(SEGMENT$vkGetCudaModuleCacheNV, Descriptors.DESCRIPTOR$vkGetCudaModuleCacheNV);
        SEGMENT$vkGetDeferredOperationMaxConcurrencyKHR = loader.apply("vkGetDeferredOperationMaxConcurrencyKHR");
        HANDLE$vkGetDeferredOperationMaxConcurrencyKHR = RawFunctionLoader.link(SEGMENT$vkGetDeferredOperationMaxConcurrencyKHR, Descriptors.DESCRIPTOR$vkGetDeferredOperationMaxConcurrencyKHR);
        SEGMENT$vkGetDeferredOperationResultKHR = loader.apply("vkGetDeferredOperationResultKHR");
        HANDLE$vkGetDeferredOperationResultKHR = RawFunctionLoader.link(SEGMENT$vkGetDeferredOperationResultKHR, Descriptors.DESCRIPTOR$vkGetDeferredOperationResultKHR);
        SEGMENT$vkGetDescriptorEXT = loader.apply("vkGetDescriptorEXT");
        HANDLE$vkGetDescriptorEXT = RawFunctionLoader.link(SEGMENT$vkGetDescriptorEXT, Descriptors.DESCRIPTOR$vkGetDescriptorEXT);
        SEGMENT$vkGetDescriptorSetHostMappingVALVE = loader.apply("vkGetDescriptorSetHostMappingVALVE");
        HANDLE$vkGetDescriptorSetHostMappingVALVE = RawFunctionLoader.link(SEGMENT$vkGetDescriptorSetHostMappingVALVE, Descriptors.DESCRIPTOR$vkGetDescriptorSetHostMappingVALVE);
        SEGMENT$vkGetDescriptorSetLayoutBindingOffsetEXT = loader.apply("vkGetDescriptorSetLayoutBindingOffsetEXT");
        HANDLE$vkGetDescriptorSetLayoutBindingOffsetEXT = RawFunctionLoader.link(SEGMENT$vkGetDescriptorSetLayoutBindingOffsetEXT, Descriptors.DESCRIPTOR$vkGetDescriptorSetLayoutBindingOffsetEXT);
        SEGMENT$vkGetDescriptorSetLayoutHostMappingInfoVALVE = loader.apply("vkGetDescriptorSetLayoutHostMappingInfoVALVE");
        HANDLE$vkGetDescriptorSetLayoutHostMappingInfoVALVE = RawFunctionLoader.link(SEGMENT$vkGetDescriptorSetLayoutHostMappingInfoVALVE, Descriptors.DESCRIPTOR$vkGetDescriptorSetLayoutHostMappingInfoVALVE);
        SEGMENT$vkGetDescriptorSetLayoutSizeEXT = loader.apply("vkGetDescriptorSetLayoutSizeEXT");
        HANDLE$vkGetDescriptorSetLayoutSizeEXT = RawFunctionLoader.link(SEGMENT$vkGetDescriptorSetLayoutSizeEXT, Descriptors.DESCRIPTOR$vkGetDescriptorSetLayoutSizeEXT);
        SEGMENT$vkGetDescriptorSetLayoutSupport = loader.apply("vkGetDescriptorSetLayoutSupport");
        HANDLE$vkGetDescriptorSetLayoutSupport = RawFunctionLoader.link(SEGMENT$vkGetDescriptorSetLayoutSupport, Descriptors.DESCRIPTOR$vkGetDescriptorSetLayoutSupport);
        SEGMENT$vkGetDescriptorSetLayoutSupportKHR = loader.apply("vkGetDescriptorSetLayoutSupportKHR");
        HANDLE$vkGetDescriptorSetLayoutSupportKHR = RawFunctionLoader.link(SEGMENT$vkGetDescriptorSetLayoutSupportKHR, Descriptors.DESCRIPTOR$vkGetDescriptorSetLayoutSupport);
        SEGMENT$vkGetDeviceAccelerationStructureCompatibilityKHR = loader.apply("vkGetDeviceAccelerationStructureCompatibilityKHR");
        HANDLE$vkGetDeviceAccelerationStructureCompatibilityKHR = RawFunctionLoader.link(SEGMENT$vkGetDeviceAccelerationStructureCompatibilityKHR, Descriptors.DESCRIPTOR$vkGetDeviceAccelerationStructureCompatibilityKHR);
        SEGMENT$vkGetDeviceBufferMemoryRequirements = loader.apply("vkGetDeviceBufferMemoryRequirements");
        HANDLE$vkGetDeviceBufferMemoryRequirements = RawFunctionLoader.link(SEGMENT$vkGetDeviceBufferMemoryRequirements, Descriptors.DESCRIPTOR$vkGetDeviceBufferMemoryRequirements);
        SEGMENT$vkGetDeviceBufferMemoryRequirementsKHR = loader.apply("vkGetDeviceBufferMemoryRequirementsKHR");
        HANDLE$vkGetDeviceBufferMemoryRequirementsKHR = RawFunctionLoader.link(SEGMENT$vkGetDeviceBufferMemoryRequirementsKHR, Descriptors.DESCRIPTOR$vkGetDeviceBufferMemoryRequirements);
        SEGMENT$vkGetDeviceFaultInfoEXT = loader.apply("vkGetDeviceFaultInfoEXT");
        HANDLE$vkGetDeviceFaultInfoEXT = RawFunctionLoader.link(SEGMENT$vkGetDeviceFaultInfoEXT, Descriptors.DESCRIPTOR$vkGetDeviceFaultInfoEXT);
        SEGMENT$vkGetDeviceGroupPeerMemoryFeatures = loader.apply("vkGetDeviceGroupPeerMemoryFeatures");
        HANDLE$vkGetDeviceGroupPeerMemoryFeatures = RawFunctionLoader.link(SEGMENT$vkGetDeviceGroupPeerMemoryFeatures, Descriptors.DESCRIPTOR$vkGetDeviceGroupPeerMemoryFeatures);
        SEGMENT$vkGetDeviceGroupPeerMemoryFeaturesKHR = loader.apply("vkGetDeviceGroupPeerMemoryFeaturesKHR");
        HANDLE$vkGetDeviceGroupPeerMemoryFeaturesKHR = RawFunctionLoader.link(SEGMENT$vkGetDeviceGroupPeerMemoryFeaturesKHR, Descriptors.DESCRIPTOR$vkGetDeviceGroupPeerMemoryFeatures);
        SEGMENT$vkGetDeviceGroupPresentCapabilitiesKHR = loader.apply("vkGetDeviceGroupPresentCapabilitiesKHR");
        HANDLE$vkGetDeviceGroupPresentCapabilitiesKHR = RawFunctionLoader.link(SEGMENT$vkGetDeviceGroupPresentCapabilitiesKHR, Descriptors.DESCRIPTOR$vkGetDeviceGroupPresentCapabilitiesKHR);
        SEGMENT$vkGetDeviceGroupSurfacePresentModes2EXT = loader.apply("vkGetDeviceGroupSurfacePresentModes2EXT");
        HANDLE$vkGetDeviceGroupSurfacePresentModes2EXT = RawFunctionLoader.link(SEGMENT$vkGetDeviceGroupSurfacePresentModes2EXT, Descriptors.DESCRIPTOR$vkGetDeviceGroupSurfacePresentModes2EXT);
        SEGMENT$vkGetDeviceGroupSurfacePresentModesKHR = loader.apply("vkGetDeviceGroupSurfacePresentModesKHR");
        HANDLE$vkGetDeviceGroupSurfacePresentModesKHR = RawFunctionLoader.link(SEGMENT$vkGetDeviceGroupSurfacePresentModesKHR, Descriptors.DESCRIPTOR$vkGetDeviceGroupSurfacePresentModesKHR);
        SEGMENT$vkGetDeviceImageMemoryRequirements = loader.apply("vkGetDeviceImageMemoryRequirements");
        HANDLE$vkGetDeviceImageMemoryRequirements = RawFunctionLoader.link(SEGMENT$vkGetDeviceImageMemoryRequirements, Descriptors.DESCRIPTOR$vkGetDeviceImageMemoryRequirements);
        SEGMENT$vkGetDeviceImageMemoryRequirementsKHR = loader.apply("vkGetDeviceImageMemoryRequirementsKHR");
        HANDLE$vkGetDeviceImageMemoryRequirementsKHR = RawFunctionLoader.link(SEGMENT$vkGetDeviceImageMemoryRequirementsKHR, Descriptors.DESCRIPTOR$vkGetDeviceImageMemoryRequirements);
        SEGMENT$vkGetDeviceImageSparseMemoryRequirements = loader.apply("vkGetDeviceImageSparseMemoryRequirements");
        HANDLE$vkGetDeviceImageSparseMemoryRequirements = RawFunctionLoader.link(SEGMENT$vkGetDeviceImageSparseMemoryRequirements, Descriptors.DESCRIPTOR$vkGetDeviceImageSparseMemoryRequirements);
        SEGMENT$vkGetDeviceImageSparseMemoryRequirementsKHR = loader.apply("vkGetDeviceImageSparseMemoryRequirementsKHR");
        HANDLE$vkGetDeviceImageSparseMemoryRequirementsKHR = RawFunctionLoader.link(SEGMENT$vkGetDeviceImageSparseMemoryRequirementsKHR, Descriptors.DESCRIPTOR$vkGetDeviceImageSparseMemoryRequirements);
        SEGMENT$vkGetDeviceImageSubresourceLayout = loader.apply("vkGetDeviceImageSubresourceLayout");
        HANDLE$vkGetDeviceImageSubresourceLayout = RawFunctionLoader.link(SEGMENT$vkGetDeviceImageSubresourceLayout, Descriptors.DESCRIPTOR$vkGetDeviceImageSubresourceLayout);
        SEGMENT$vkGetDeviceImageSubresourceLayoutKHR = loader.apply("vkGetDeviceImageSubresourceLayoutKHR");
        HANDLE$vkGetDeviceImageSubresourceLayoutKHR = RawFunctionLoader.link(SEGMENT$vkGetDeviceImageSubresourceLayoutKHR, Descriptors.DESCRIPTOR$vkGetDeviceImageSubresourceLayout);
        SEGMENT$vkGetDeviceMemoryCommitment = loader.apply("vkGetDeviceMemoryCommitment");
        HANDLE$vkGetDeviceMemoryCommitment = RawFunctionLoader.link(SEGMENT$vkGetDeviceMemoryCommitment, Descriptors.DESCRIPTOR$vkGetDeviceMemoryCommitment);
        SEGMENT$vkGetDeviceMemoryOpaqueCaptureAddress = loader.apply("vkGetDeviceMemoryOpaqueCaptureAddress");
        HANDLE$vkGetDeviceMemoryOpaqueCaptureAddress = RawFunctionLoader.link(SEGMENT$vkGetDeviceMemoryOpaqueCaptureAddress, Descriptors.DESCRIPTOR$vkGetDeviceMemoryOpaqueCaptureAddress);
        SEGMENT$vkGetDeviceMemoryOpaqueCaptureAddressKHR = loader.apply("vkGetDeviceMemoryOpaqueCaptureAddressKHR");
        HANDLE$vkGetDeviceMemoryOpaqueCaptureAddressKHR = RawFunctionLoader.link(SEGMENT$vkGetDeviceMemoryOpaqueCaptureAddressKHR, Descriptors.DESCRIPTOR$vkGetDeviceMemoryOpaqueCaptureAddress);
        SEGMENT$vkGetDeviceMicromapCompatibilityEXT = loader.apply("vkGetDeviceMicromapCompatibilityEXT");
        HANDLE$vkGetDeviceMicromapCompatibilityEXT = RawFunctionLoader.link(SEGMENT$vkGetDeviceMicromapCompatibilityEXT, Descriptors.DESCRIPTOR$vkGetDeviceMicromapCompatibilityEXT);
        SEGMENT$vkGetDeviceQueue = loader.apply("vkGetDeviceQueue");
        HANDLE$vkGetDeviceQueue = RawFunctionLoader.link(SEGMENT$vkGetDeviceQueue, Descriptors.DESCRIPTOR$vkGetDeviceQueue);
        SEGMENT$vkGetDeviceQueue2 = loader.apply("vkGetDeviceQueue2");
        HANDLE$vkGetDeviceQueue2 = RawFunctionLoader.link(SEGMENT$vkGetDeviceQueue2, Descriptors.DESCRIPTOR$vkGetDeviceQueue2);
        SEGMENT$vkGetDeviceSubpassShadingMaxWorkgroupSizeHUAWEI = loader.apply("vkGetDeviceSubpassShadingMaxWorkgroupSizeHUAWEI");
        HANDLE$vkGetDeviceSubpassShadingMaxWorkgroupSizeHUAWEI = RawFunctionLoader.link(SEGMENT$vkGetDeviceSubpassShadingMaxWorkgroupSizeHUAWEI, Descriptors.DESCRIPTOR$vkGetDeviceSubpassShadingMaxWorkgroupSizeHUAWEI);
        SEGMENT$vkGetDynamicRenderingTilePropertiesQCOM = loader.apply("vkGetDynamicRenderingTilePropertiesQCOM");
        HANDLE$vkGetDynamicRenderingTilePropertiesQCOM = RawFunctionLoader.link(SEGMENT$vkGetDynamicRenderingTilePropertiesQCOM, Descriptors.DESCRIPTOR$vkGetDynamicRenderingTilePropertiesQCOM);
        SEGMENT$vkGetEncodedVideoSessionParametersKHR = loader.apply("vkGetEncodedVideoSessionParametersKHR");
        HANDLE$vkGetEncodedVideoSessionParametersKHR = RawFunctionLoader.link(SEGMENT$vkGetEncodedVideoSessionParametersKHR, Descriptors.DESCRIPTOR$vkGetEncodedVideoSessionParametersKHR);
        SEGMENT$vkGetEventStatus = loader.apply("vkGetEventStatus");
        HANDLE$vkGetEventStatus = RawFunctionLoader.link(SEGMENT$vkGetEventStatus, Descriptors.DESCRIPTOR$vkGetEventStatus);
        SEGMENT$vkGetExecutionGraphPipelineNodeIndexAMDX = loader.apply("vkGetExecutionGraphPipelineNodeIndexAMDX");
        HANDLE$vkGetExecutionGraphPipelineNodeIndexAMDX = RawFunctionLoader.link(SEGMENT$vkGetExecutionGraphPipelineNodeIndexAMDX, Descriptors.DESCRIPTOR$vkGetExecutionGraphPipelineNodeIndexAMDX);
        SEGMENT$vkGetExecutionGraphPipelineScratchSizeAMDX = loader.apply("vkGetExecutionGraphPipelineScratchSizeAMDX");
        HANDLE$vkGetExecutionGraphPipelineScratchSizeAMDX = RawFunctionLoader.link(SEGMENT$vkGetExecutionGraphPipelineScratchSizeAMDX, Descriptors.DESCRIPTOR$vkGetExecutionGraphPipelineScratchSizeAMDX);
        SEGMENT$vkGetExternalComputeQueueDataNV = loader.apply("vkGetExternalComputeQueueDataNV");
        HANDLE$vkGetExternalComputeQueueDataNV = RawFunctionLoader.link(SEGMENT$vkGetExternalComputeQueueDataNV, Descriptors.DESCRIPTOR$vkGetExternalComputeQueueDataNV);
        SEGMENT$vkGetFenceFdKHR = loader.apply("vkGetFenceFdKHR");
        HANDLE$vkGetFenceFdKHR = RawFunctionLoader.link(SEGMENT$vkGetFenceFdKHR, Descriptors.DESCRIPTOR$vkGetFenceFdKHR);
        SEGMENT$vkGetFenceSciSyncFenceNV = loader.apply("vkGetFenceSciSyncFenceNV");
        HANDLE$vkGetFenceSciSyncFenceNV = RawFunctionLoader.link(SEGMENT$vkGetFenceSciSyncFenceNV, Descriptors.DESCRIPTOR$vkGetFenceSciSyncFenceNV);
        SEGMENT$vkGetFenceSciSyncObjNV = loader.apply("vkGetFenceSciSyncObjNV");
        HANDLE$vkGetFenceSciSyncObjNV = RawFunctionLoader.link(SEGMENT$vkGetFenceSciSyncObjNV, Descriptors.DESCRIPTOR$vkGetFenceSciSyncObjNV);
        SEGMENT$vkGetFenceStatus = loader.apply("vkGetFenceStatus");
        HANDLE$vkGetFenceStatus = RawFunctionLoader.link(SEGMENT$vkGetFenceStatus, Descriptors.DESCRIPTOR$vkGetFenceStatus);
        SEGMENT$vkGetFenceWin32HandleKHR = loader.apply("vkGetFenceWin32HandleKHR");
        HANDLE$vkGetFenceWin32HandleKHR = RawFunctionLoader.link(SEGMENT$vkGetFenceWin32HandleKHR, Descriptors.DESCRIPTOR$vkGetFenceWin32HandleKHR);
        SEGMENT$vkGetFramebufferTilePropertiesQCOM = loader.apply("vkGetFramebufferTilePropertiesQCOM");
        HANDLE$vkGetFramebufferTilePropertiesQCOM = RawFunctionLoader.link(SEGMENT$vkGetFramebufferTilePropertiesQCOM, Descriptors.DESCRIPTOR$vkGetFramebufferTilePropertiesQCOM);
        SEGMENT$vkGetGeneratedCommandsMemoryRequirementsEXT = loader.apply("vkGetGeneratedCommandsMemoryRequirementsEXT");
        HANDLE$vkGetGeneratedCommandsMemoryRequirementsEXT = RawFunctionLoader.link(SEGMENT$vkGetGeneratedCommandsMemoryRequirementsEXT, Descriptors.DESCRIPTOR$vkGetGeneratedCommandsMemoryRequirementsEXT);
        SEGMENT$vkGetGeneratedCommandsMemoryRequirementsNV = loader.apply("vkGetGeneratedCommandsMemoryRequirementsNV");
        HANDLE$vkGetGeneratedCommandsMemoryRequirementsNV = RawFunctionLoader.link(SEGMENT$vkGetGeneratedCommandsMemoryRequirementsNV, Descriptors.DESCRIPTOR$vkGetGeneratedCommandsMemoryRequirementsNV);
        SEGMENT$vkGetImageDrmFormatModifierPropertiesEXT = loader.apply("vkGetImageDrmFormatModifierPropertiesEXT");
        HANDLE$vkGetImageDrmFormatModifierPropertiesEXT = RawFunctionLoader.link(SEGMENT$vkGetImageDrmFormatModifierPropertiesEXT, Descriptors.DESCRIPTOR$vkGetImageDrmFormatModifierPropertiesEXT);
        SEGMENT$vkGetImageMemoryRequirements = loader.apply("vkGetImageMemoryRequirements");
        HANDLE$vkGetImageMemoryRequirements = RawFunctionLoader.link(SEGMENT$vkGetImageMemoryRequirements, Descriptors.DESCRIPTOR$vkGetImageMemoryRequirements);
        SEGMENT$vkGetImageMemoryRequirements2 = loader.apply("vkGetImageMemoryRequirements2");
        HANDLE$vkGetImageMemoryRequirements2 = RawFunctionLoader.link(SEGMENT$vkGetImageMemoryRequirements2, Descriptors.DESCRIPTOR$vkGetImageMemoryRequirements2);
        SEGMENT$vkGetImageMemoryRequirements2KHR = loader.apply("vkGetImageMemoryRequirements2KHR");
        HANDLE$vkGetImageMemoryRequirements2KHR = RawFunctionLoader.link(SEGMENT$vkGetImageMemoryRequirements2KHR, Descriptors.DESCRIPTOR$vkGetImageMemoryRequirements2);
        SEGMENT$vkGetImageOpaqueCaptureDescriptorDataEXT = loader.apply("vkGetImageOpaqueCaptureDescriptorDataEXT");
        HANDLE$vkGetImageOpaqueCaptureDescriptorDataEXT = RawFunctionLoader.link(SEGMENT$vkGetImageOpaqueCaptureDescriptorDataEXT, Descriptors.DESCRIPTOR$vkGetImageOpaqueCaptureDescriptorDataEXT);
        SEGMENT$vkGetImageSparseMemoryRequirements = loader.apply("vkGetImageSparseMemoryRequirements");
        HANDLE$vkGetImageSparseMemoryRequirements = RawFunctionLoader.link(SEGMENT$vkGetImageSparseMemoryRequirements, Descriptors.DESCRIPTOR$vkGetImageSparseMemoryRequirements);
        SEGMENT$vkGetImageSparseMemoryRequirements2 = loader.apply("vkGetImageSparseMemoryRequirements2");
        HANDLE$vkGetImageSparseMemoryRequirements2 = RawFunctionLoader.link(SEGMENT$vkGetImageSparseMemoryRequirements2, Descriptors.DESCRIPTOR$vkGetImageSparseMemoryRequirements2);
        SEGMENT$vkGetImageSparseMemoryRequirements2KHR = loader.apply("vkGetImageSparseMemoryRequirements2KHR");
        HANDLE$vkGetImageSparseMemoryRequirements2KHR = RawFunctionLoader.link(SEGMENT$vkGetImageSparseMemoryRequirements2KHR, Descriptors.DESCRIPTOR$vkGetImageSparseMemoryRequirements2);
        SEGMENT$vkGetImageSubresourceLayout = loader.apply("vkGetImageSubresourceLayout");
        HANDLE$vkGetImageSubresourceLayout = RawFunctionLoader.link(SEGMENT$vkGetImageSubresourceLayout, Descriptors.DESCRIPTOR$vkGetImageSubresourceLayout);
        SEGMENT$vkGetImageSubresourceLayout2 = loader.apply("vkGetImageSubresourceLayout2");
        HANDLE$vkGetImageSubresourceLayout2 = RawFunctionLoader.link(SEGMENT$vkGetImageSubresourceLayout2, Descriptors.DESCRIPTOR$vkGetImageSubresourceLayout2);
        SEGMENT$vkGetImageSubresourceLayout2EXT = loader.apply("vkGetImageSubresourceLayout2EXT");
        HANDLE$vkGetImageSubresourceLayout2EXT = RawFunctionLoader.link(SEGMENT$vkGetImageSubresourceLayout2EXT, Descriptors.DESCRIPTOR$vkGetImageSubresourceLayout2);
        SEGMENT$vkGetImageSubresourceLayout2KHR = loader.apply("vkGetImageSubresourceLayout2KHR");
        HANDLE$vkGetImageSubresourceLayout2KHR = RawFunctionLoader.link(SEGMENT$vkGetImageSubresourceLayout2KHR, Descriptors.DESCRIPTOR$vkGetImageSubresourceLayout2);
        SEGMENT$vkGetImageViewAddressNVX = loader.apply("vkGetImageViewAddressNVX");
        HANDLE$vkGetImageViewAddressNVX = RawFunctionLoader.link(SEGMENT$vkGetImageViewAddressNVX, Descriptors.DESCRIPTOR$vkGetImageViewAddressNVX);
        SEGMENT$vkGetImageViewHandle64NVX = loader.apply("vkGetImageViewHandle64NVX");
        HANDLE$vkGetImageViewHandle64NVX = RawFunctionLoader.link(SEGMENT$vkGetImageViewHandle64NVX, Descriptors.DESCRIPTOR$vkGetImageViewHandle64NVX);
        SEGMENT$vkGetImageViewHandleNVX = loader.apply("vkGetImageViewHandleNVX");
        HANDLE$vkGetImageViewHandleNVX = RawFunctionLoader.link(SEGMENT$vkGetImageViewHandleNVX, Descriptors.DESCRIPTOR$vkGetImageViewHandleNVX);
        SEGMENT$vkGetImageViewOpaqueCaptureDescriptorDataEXT = loader.apply("vkGetImageViewOpaqueCaptureDescriptorDataEXT");
        HANDLE$vkGetImageViewOpaqueCaptureDescriptorDataEXT = RawFunctionLoader.link(SEGMENT$vkGetImageViewOpaqueCaptureDescriptorDataEXT, Descriptors.DESCRIPTOR$vkGetImageViewOpaqueCaptureDescriptorDataEXT);
        SEGMENT$vkGetLatencyTimingsNV = loader.apply("vkGetLatencyTimingsNV");
        HANDLE$vkGetLatencyTimingsNV = RawFunctionLoader.link(SEGMENT$vkGetLatencyTimingsNV, Descriptors.DESCRIPTOR$vkGetLatencyTimingsNV);
        SEGMENT$vkGetMemoryAndroidHardwareBufferANDROID = loader.apply("vkGetMemoryAndroidHardwareBufferANDROID");
        HANDLE$vkGetMemoryAndroidHardwareBufferANDROID = RawFunctionLoader.link(SEGMENT$vkGetMemoryAndroidHardwareBufferANDROID, Descriptors.DESCRIPTOR$vkGetMemoryAndroidHardwareBufferANDROID);
        SEGMENT$vkGetMemoryFdKHR = loader.apply("vkGetMemoryFdKHR");
        HANDLE$vkGetMemoryFdKHR = RawFunctionLoader.link(SEGMENT$vkGetMemoryFdKHR, Descriptors.DESCRIPTOR$vkGetMemoryFdKHR);
        SEGMENT$vkGetMemoryFdPropertiesKHR = loader.apply("vkGetMemoryFdPropertiesKHR");
        HANDLE$vkGetMemoryFdPropertiesKHR = RawFunctionLoader.link(SEGMENT$vkGetMemoryFdPropertiesKHR, Descriptors.DESCRIPTOR$vkGetMemoryFdPropertiesKHR);
        SEGMENT$vkGetMemoryHostPointerPropertiesEXT = loader.apply("vkGetMemoryHostPointerPropertiesEXT");
        HANDLE$vkGetMemoryHostPointerPropertiesEXT = RawFunctionLoader.link(SEGMENT$vkGetMemoryHostPointerPropertiesEXT, Descriptors.DESCRIPTOR$vkGetMemoryHostPointerPropertiesEXT);
        SEGMENT$vkGetMemoryMetalHandleEXT = loader.apply("vkGetMemoryMetalHandleEXT");
        HANDLE$vkGetMemoryMetalHandleEXT = RawFunctionLoader.link(SEGMENT$vkGetMemoryMetalHandleEXT, Descriptors.DESCRIPTOR$vkGetMemoryMetalHandleEXT);
        SEGMENT$vkGetMemoryMetalHandlePropertiesEXT = loader.apply("vkGetMemoryMetalHandlePropertiesEXT");
        HANDLE$vkGetMemoryMetalHandlePropertiesEXT = RawFunctionLoader.link(SEGMENT$vkGetMemoryMetalHandlePropertiesEXT, Descriptors.DESCRIPTOR$vkGetMemoryMetalHandlePropertiesEXT);
        SEGMENT$vkGetMemoryRemoteAddressNV = loader.apply("vkGetMemoryRemoteAddressNV");
        HANDLE$vkGetMemoryRemoteAddressNV = RawFunctionLoader.link(SEGMENT$vkGetMemoryRemoteAddressNV, Descriptors.DESCRIPTOR$vkGetMemoryRemoteAddressNV);
        SEGMENT$vkGetMemorySciBufNV = loader.apply("vkGetMemorySciBufNV");
        HANDLE$vkGetMemorySciBufNV = RawFunctionLoader.link(SEGMENT$vkGetMemorySciBufNV, Descriptors.DESCRIPTOR$vkGetMemorySciBufNV);
        SEGMENT$vkGetMemoryWin32HandleKHR = loader.apply("vkGetMemoryWin32HandleKHR");
        HANDLE$vkGetMemoryWin32HandleKHR = RawFunctionLoader.link(SEGMENT$vkGetMemoryWin32HandleKHR, Descriptors.DESCRIPTOR$vkGetMemoryWin32HandleKHR);
        SEGMENT$vkGetMemoryWin32HandleNV = loader.apply("vkGetMemoryWin32HandleNV");
        HANDLE$vkGetMemoryWin32HandleNV = RawFunctionLoader.link(SEGMENT$vkGetMemoryWin32HandleNV, Descriptors.DESCRIPTOR$vkGetMemoryWin32HandleNV);
        SEGMENT$vkGetMemoryWin32HandlePropertiesKHR = loader.apply("vkGetMemoryWin32HandlePropertiesKHR");
        HANDLE$vkGetMemoryWin32HandlePropertiesKHR = RawFunctionLoader.link(SEGMENT$vkGetMemoryWin32HandlePropertiesKHR, Descriptors.DESCRIPTOR$vkGetMemoryWin32HandlePropertiesKHR);
        SEGMENT$vkGetMemoryZirconHandleFUCHSIA = loader.apply("vkGetMemoryZirconHandleFUCHSIA");
        HANDLE$vkGetMemoryZirconHandleFUCHSIA = RawFunctionLoader.link(SEGMENT$vkGetMemoryZirconHandleFUCHSIA, Descriptors.DESCRIPTOR$vkGetMemoryZirconHandleFUCHSIA);
        SEGMENT$vkGetMemoryZirconHandlePropertiesFUCHSIA = loader.apply("vkGetMemoryZirconHandlePropertiesFUCHSIA");
        HANDLE$vkGetMemoryZirconHandlePropertiesFUCHSIA = RawFunctionLoader.link(SEGMENT$vkGetMemoryZirconHandlePropertiesFUCHSIA, Descriptors.DESCRIPTOR$vkGetMemoryZirconHandlePropertiesFUCHSIA);
        SEGMENT$vkGetMicromapBuildSizesEXT = loader.apply("vkGetMicromapBuildSizesEXT");
        HANDLE$vkGetMicromapBuildSizesEXT = RawFunctionLoader.link(SEGMENT$vkGetMicromapBuildSizesEXT, Descriptors.DESCRIPTOR$vkGetMicromapBuildSizesEXT);
        SEGMENT$vkGetPartitionedAccelerationStructuresBuildSizesNV = loader.apply("vkGetPartitionedAccelerationStructuresBuildSizesNV");
        HANDLE$vkGetPartitionedAccelerationStructuresBuildSizesNV = RawFunctionLoader.link(SEGMENT$vkGetPartitionedAccelerationStructuresBuildSizesNV, Descriptors.DESCRIPTOR$vkGetPartitionedAccelerationStructuresBuildSizesNV);
        SEGMENT$vkGetPastPresentationTimingGOOGLE = loader.apply("vkGetPastPresentationTimingGOOGLE");
        HANDLE$vkGetPastPresentationTimingGOOGLE = RawFunctionLoader.link(SEGMENT$vkGetPastPresentationTimingGOOGLE, Descriptors.DESCRIPTOR$vkGetPastPresentationTimingGOOGLE);
        SEGMENT$vkGetPerformanceParameterINTEL = loader.apply("vkGetPerformanceParameterINTEL");
        HANDLE$vkGetPerformanceParameterINTEL = RawFunctionLoader.link(SEGMENT$vkGetPerformanceParameterINTEL, Descriptors.DESCRIPTOR$vkGetPerformanceParameterINTEL);
        SEGMENT$vkGetPipelineBinaryDataKHR = loader.apply("vkGetPipelineBinaryDataKHR");
        HANDLE$vkGetPipelineBinaryDataKHR = RawFunctionLoader.link(SEGMENT$vkGetPipelineBinaryDataKHR, Descriptors.DESCRIPTOR$vkGetPipelineBinaryDataKHR);
        SEGMENT$vkGetPipelineCacheData = loader.apply("vkGetPipelineCacheData");
        HANDLE$vkGetPipelineCacheData = RawFunctionLoader.link(SEGMENT$vkGetPipelineCacheData, Descriptors.DESCRIPTOR$vkGetPipelineCacheData);
        SEGMENT$vkGetPipelineExecutableInternalRepresentationsKHR = loader.apply("vkGetPipelineExecutableInternalRepresentationsKHR");
        HANDLE$vkGetPipelineExecutableInternalRepresentationsKHR = RawFunctionLoader.link(SEGMENT$vkGetPipelineExecutableInternalRepresentationsKHR, Descriptors.DESCRIPTOR$vkGetPipelineExecutableInternalRepresentationsKHR);
        SEGMENT$vkGetPipelineExecutablePropertiesKHR = loader.apply("vkGetPipelineExecutablePropertiesKHR");
        HANDLE$vkGetPipelineExecutablePropertiesKHR = RawFunctionLoader.link(SEGMENT$vkGetPipelineExecutablePropertiesKHR, Descriptors.DESCRIPTOR$vkGetPipelineExecutablePropertiesKHR);
        SEGMENT$vkGetPipelineExecutableStatisticsKHR = loader.apply("vkGetPipelineExecutableStatisticsKHR");
        HANDLE$vkGetPipelineExecutableStatisticsKHR = RawFunctionLoader.link(SEGMENT$vkGetPipelineExecutableStatisticsKHR, Descriptors.DESCRIPTOR$vkGetPipelineExecutableStatisticsKHR);
        SEGMENT$vkGetPipelineIndirectDeviceAddressNV = loader.apply("vkGetPipelineIndirectDeviceAddressNV");
        HANDLE$vkGetPipelineIndirectDeviceAddressNV = RawFunctionLoader.link(SEGMENT$vkGetPipelineIndirectDeviceAddressNV, Descriptors.DESCRIPTOR$vkGetPipelineIndirectDeviceAddressNV);
        SEGMENT$vkGetPipelineIndirectMemoryRequirementsNV = loader.apply("vkGetPipelineIndirectMemoryRequirementsNV");
        HANDLE$vkGetPipelineIndirectMemoryRequirementsNV = RawFunctionLoader.link(SEGMENT$vkGetPipelineIndirectMemoryRequirementsNV, Descriptors.DESCRIPTOR$vkGetPipelineIndirectMemoryRequirementsNV);
        SEGMENT$vkGetPipelineKeyKHR = loader.apply("vkGetPipelineKeyKHR");
        HANDLE$vkGetPipelineKeyKHR = RawFunctionLoader.link(SEGMENT$vkGetPipelineKeyKHR, Descriptors.DESCRIPTOR$vkGetPipelineKeyKHR);
        SEGMENT$vkGetPipelinePropertiesEXT = loader.apply("vkGetPipelinePropertiesEXT");
        HANDLE$vkGetPipelinePropertiesEXT = RawFunctionLoader.link(SEGMENT$vkGetPipelinePropertiesEXT, Descriptors.DESCRIPTOR$vkGetPipelinePropertiesEXT);
        SEGMENT$vkGetPrivateData = loader.apply("vkGetPrivateData");
        HANDLE$vkGetPrivateData = RawFunctionLoader.link(SEGMENT$vkGetPrivateData, Descriptors.DESCRIPTOR$vkGetPrivateData);
        SEGMENT$vkGetPrivateDataEXT = loader.apply("vkGetPrivateDataEXT");
        HANDLE$vkGetPrivateDataEXT = RawFunctionLoader.link(SEGMENT$vkGetPrivateDataEXT, Descriptors.DESCRIPTOR$vkGetPrivateData);
        SEGMENT$vkGetQueryPoolResults = loader.apply("vkGetQueryPoolResults");
        HANDLE$vkGetQueryPoolResults = RawFunctionLoader.link(SEGMENT$vkGetQueryPoolResults, Descriptors.DESCRIPTOR$vkGetQueryPoolResults);
        SEGMENT$vkGetQueueCheckpointData2NV = loader.apply("vkGetQueueCheckpointData2NV");
        HANDLE$vkGetQueueCheckpointData2NV = RawFunctionLoader.link(SEGMENT$vkGetQueueCheckpointData2NV, Descriptors.DESCRIPTOR$vkGetQueueCheckpointData2NV);
        SEGMENT$vkGetQueueCheckpointDataNV = loader.apply("vkGetQueueCheckpointDataNV");
        HANDLE$vkGetQueueCheckpointDataNV = RawFunctionLoader.link(SEGMENT$vkGetQueueCheckpointDataNV, Descriptors.DESCRIPTOR$vkGetQueueCheckpointDataNV);
        SEGMENT$vkGetRayTracingCaptureReplayShaderGroupHandlesKHR = loader.apply("vkGetRayTracingCaptureReplayShaderGroupHandlesKHR");
        HANDLE$vkGetRayTracingCaptureReplayShaderGroupHandlesKHR = RawFunctionLoader.link(SEGMENT$vkGetRayTracingCaptureReplayShaderGroupHandlesKHR, Descriptors.DESCRIPTOR$vkGetRayTracingCaptureReplayShaderGroupHandlesKHR);
        SEGMENT$vkGetRayTracingShaderGroupHandlesKHR = loader.apply("vkGetRayTracingShaderGroupHandlesKHR");
        HANDLE$vkGetRayTracingShaderGroupHandlesKHR = RawFunctionLoader.link(SEGMENT$vkGetRayTracingShaderGroupHandlesKHR, Descriptors.DESCRIPTOR$vkGetRayTracingShaderGroupHandlesKHR);
        SEGMENT$vkGetRayTracingShaderGroupHandlesNV = loader.apply("vkGetRayTracingShaderGroupHandlesNV");
        HANDLE$vkGetRayTracingShaderGroupHandlesNV = RawFunctionLoader.link(SEGMENT$vkGetRayTracingShaderGroupHandlesNV, Descriptors.DESCRIPTOR$vkGetRayTracingShaderGroupHandlesKHR);
        SEGMENT$vkGetRayTracingShaderGroupStackSizeKHR = loader.apply("vkGetRayTracingShaderGroupStackSizeKHR");
        HANDLE$vkGetRayTracingShaderGroupStackSizeKHR = RawFunctionLoader.link(SEGMENT$vkGetRayTracingShaderGroupStackSizeKHR, Descriptors.DESCRIPTOR$vkGetRayTracingShaderGroupStackSizeKHR);
        SEGMENT$vkGetRefreshCycleDurationGOOGLE = loader.apply("vkGetRefreshCycleDurationGOOGLE");
        HANDLE$vkGetRefreshCycleDurationGOOGLE = RawFunctionLoader.link(SEGMENT$vkGetRefreshCycleDurationGOOGLE, Descriptors.DESCRIPTOR$vkGetRefreshCycleDurationGOOGLE);
        SEGMENT$vkGetRenderAreaGranularity = loader.apply("vkGetRenderAreaGranularity");
        HANDLE$vkGetRenderAreaGranularity = RawFunctionLoader.link(SEGMENT$vkGetRenderAreaGranularity, Descriptors.DESCRIPTOR$vkGetRenderAreaGranularity);
        SEGMENT$vkGetRenderingAreaGranularity = loader.apply("vkGetRenderingAreaGranularity");
        HANDLE$vkGetRenderingAreaGranularity = RawFunctionLoader.link(SEGMENT$vkGetRenderingAreaGranularity, Descriptors.DESCRIPTOR$vkGetRenderingAreaGranularity);
        SEGMENT$vkGetRenderingAreaGranularityKHR = loader.apply("vkGetRenderingAreaGranularityKHR");
        HANDLE$vkGetRenderingAreaGranularityKHR = RawFunctionLoader.link(SEGMENT$vkGetRenderingAreaGranularityKHR, Descriptors.DESCRIPTOR$vkGetRenderingAreaGranularity);
        SEGMENT$vkGetSamplerOpaqueCaptureDescriptorDataEXT = loader.apply("vkGetSamplerOpaqueCaptureDescriptorDataEXT");
        HANDLE$vkGetSamplerOpaqueCaptureDescriptorDataEXT = RawFunctionLoader.link(SEGMENT$vkGetSamplerOpaqueCaptureDescriptorDataEXT, Descriptors.DESCRIPTOR$vkGetSamplerOpaqueCaptureDescriptorDataEXT);
        SEGMENT$vkGetScreenBufferPropertiesQNX = loader.apply("vkGetScreenBufferPropertiesQNX");
        HANDLE$vkGetScreenBufferPropertiesQNX = RawFunctionLoader.link(SEGMENT$vkGetScreenBufferPropertiesQNX, Descriptors.DESCRIPTOR$vkGetScreenBufferPropertiesQNX);
        SEGMENT$vkGetSemaphoreCounterValue = loader.apply("vkGetSemaphoreCounterValue");
        HANDLE$vkGetSemaphoreCounterValue = RawFunctionLoader.link(SEGMENT$vkGetSemaphoreCounterValue, Descriptors.DESCRIPTOR$vkGetSemaphoreCounterValue);
        SEGMENT$vkGetSemaphoreCounterValueKHR = loader.apply("vkGetSemaphoreCounterValueKHR");
        HANDLE$vkGetSemaphoreCounterValueKHR = RawFunctionLoader.link(SEGMENT$vkGetSemaphoreCounterValueKHR, Descriptors.DESCRIPTOR$vkGetSemaphoreCounterValue);
        SEGMENT$vkGetSemaphoreFdKHR = loader.apply("vkGetSemaphoreFdKHR");
        HANDLE$vkGetSemaphoreFdKHR = RawFunctionLoader.link(SEGMENT$vkGetSemaphoreFdKHR, Descriptors.DESCRIPTOR$vkGetSemaphoreFdKHR);
        SEGMENT$vkGetSemaphoreSciSyncObjNV = loader.apply("vkGetSemaphoreSciSyncObjNV");
        HANDLE$vkGetSemaphoreSciSyncObjNV = RawFunctionLoader.link(SEGMENT$vkGetSemaphoreSciSyncObjNV, Descriptors.DESCRIPTOR$vkGetSemaphoreSciSyncObjNV);
        SEGMENT$vkGetSemaphoreWin32HandleKHR = loader.apply("vkGetSemaphoreWin32HandleKHR");
        HANDLE$vkGetSemaphoreWin32HandleKHR = RawFunctionLoader.link(SEGMENT$vkGetSemaphoreWin32HandleKHR, Descriptors.DESCRIPTOR$vkGetSemaphoreWin32HandleKHR);
        SEGMENT$vkGetSemaphoreZirconHandleFUCHSIA = loader.apply("vkGetSemaphoreZirconHandleFUCHSIA");
        HANDLE$vkGetSemaphoreZirconHandleFUCHSIA = RawFunctionLoader.link(SEGMENT$vkGetSemaphoreZirconHandleFUCHSIA, Descriptors.DESCRIPTOR$vkGetSemaphoreZirconHandleFUCHSIA);
        SEGMENT$vkGetShaderBinaryDataEXT = loader.apply("vkGetShaderBinaryDataEXT");
        HANDLE$vkGetShaderBinaryDataEXT = RawFunctionLoader.link(SEGMENT$vkGetShaderBinaryDataEXT, Descriptors.DESCRIPTOR$vkGetShaderBinaryDataEXT);
        SEGMENT$vkGetShaderInfoAMD = loader.apply("vkGetShaderInfoAMD");
        HANDLE$vkGetShaderInfoAMD = RawFunctionLoader.link(SEGMENT$vkGetShaderInfoAMD, Descriptors.DESCRIPTOR$vkGetShaderInfoAMD);
        SEGMENT$vkGetShaderModuleCreateInfoIdentifierEXT = loader.apply("vkGetShaderModuleCreateInfoIdentifierEXT");
        HANDLE$vkGetShaderModuleCreateInfoIdentifierEXT = RawFunctionLoader.link(SEGMENT$vkGetShaderModuleCreateInfoIdentifierEXT, Descriptors.DESCRIPTOR$vkGetShaderModuleCreateInfoIdentifierEXT);
        SEGMENT$vkGetShaderModuleIdentifierEXT = loader.apply("vkGetShaderModuleIdentifierEXT");
        HANDLE$vkGetShaderModuleIdentifierEXT = RawFunctionLoader.link(SEGMENT$vkGetShaderModuleIdentifierEXT, Descriptors.DESCRIPTOR$vkGetShaderModuleIdentifierEXT);
        SEGMENT$vkGetSwapchainCounterEXT = loader.apply("vkGetSwapchainCounterEXT");
        HANDLE$vkGetSwapchainCounterEXT = RawFunctionLoader.link(SEGMENT$vkGetSwapchainCounterEXT, Descriptors.DESCRIPTOR$vkGetSwapchainCounterEXT);
        SEGMENT$vkGetSwapchainImagesKHR = loader.apply("vkGetSwapchainImagesKHR");
        HANDLE$vkGetSwapchainImagesKHR = RawFunctionLoader.link(SEGMENT$vkGetSwapchainImagesKHR, Descriptors.DESCRIPTOR$vkGetSwapchainImagesKHR);
        SEGMENT$vkGetSwapchainStatusKHR = loader.apply("vkGetSwapchainStatusKHR");
        HANDLE$vkGetSwapchainStatusKHR = RawFunctionLoader.link(SEGMENT$vkGetSwapchainStatusKHR, Descriptors.DESCRIPTOR$vkGetSwapchainStatusKHR);
        SEGMENT$vkGetValidationCacheDataEXT = loader.apply("vkGetValidationCacheDataEXT");
        HANDLE$vkGetValidationCacheDataEXT = RawFunctionLoader.link(SEGMENT$vkGetValidationCacheDataEXT, Descriptors.DESCRIPTOR$vkGetValidationCacheDataEXT);
        SEGMENT$vkGetVideoSessionMemoryRequirementsKHR = loader.apply("vkGetVideoSessionMemoryRequirementsKHR");
        HANDLE$vkGetVideoSessionMemoryRequirementsKHR = RawFunctionLoader.link(SEGMENT$vkGetVideoSessionMemoryRequirementsKHR, Descriptors.DESCRIPTOR$vkGetVideoSessionMemoryRequirementsKHR);
        SEGMENT$vkImportFenceFdKHR = loader.apply("vkImportFenceFdKHR");
        HANDLE$vkImportFenceFdKHR = RawFunctionLoader.link(SEGMENT$vkImportFenceFdKHR, Descriptors.DESCRIPTOR$vkImportFenceFdKHR);
        SEGMENT$vkImportFenceSciSyncFenceNV = loader.apply("vkImportFenceSciSyncFenceNV");
        HANDLE$vkImportFenceSciSyncFenceNV = RawFunctionLoader.link(SEGMENT$vkImportFenceSciSyncFenceNV, Descriptors.DESCRIPTOR$vkImportFenceSciSyncFenceNV);
        SEGMENT$vkImportFenceSciSyncObjNV = loader.apply("vkImportFenceSciSyncObjNV");
        HANDLE$vkImportFenceSciSyncObjNV = RawFunctionLoader.link(SEGMENT$vkImportFenceSciSyncObjNV, Descriptors.DESCRIPTOR$vkImportFenceSciSyncObjNV);
        SEGMENT$vkImportFenceWin32HandleKHR = loader.apply("vkImportFenceWin32HandleKHR");
        HANDLE$vkImportFenceWin32HandleKHR = RawFunctionLoader.link(SEGMENT$vkImportFenceWin32HandleKHR, Descriptors.DESCRIPTOR$vkImportFenceWin32HandleKHR);
        SEGMENT$vkImportSemaphoreFdKHR = loader.apply("vkImportSemaphoreFdKHR");
        HANDLE$vkImportSemaphoreFdKHR = RawFunctionLoader.link(SEGMENT$vkImportSemaphoreFdKHR, Descriptors.DESCRIPTOR$vkImportSemaphoreFdKHR);
        SEGMENT$vkImportSemaphoreSciSyncObjNV = loader.apply("vkImportSemaphoreSciSyncObjNV");
        HANDLE$vkImportSemaphoreSciSyncObjNV = RawFunctionLoader.link(SEGMENT$vkImportSemaphoreSciSyncObjNV, Descriptors.DESCRIPTOR$vkImportSemaphoreSciSyncObjNV);
        SEGMENT$vkImportSemaphoreWin32HandleKHR = loader.apply("vkImportSemaphoreWin32HandleKHR");
        HANDLE$vkImportSemaphoreWin32HandleKHR = RawFunctionLoader.link(SEGMENT$vkImportSemaphoreWin32HandleKHR, Descriptors.DESCRIPTOR$vkImportSemaphoreWin32HandleKHR);
        SEGMENT$vkImportSemaphoreZirconHandleFUCHSIA = loader.apply("vkImportSemaphoreZirconHandleFUCHSIA");
        HANDLE$vkImportSemaphoreZirconHandleFUCHSIA = RawFunctionLoader.link(SEGMENT$vkImportSemaphoreZirconHandleFUCHSIA, Descriptors.DESCRIPTOR$vkImportSemaphoreZirconHandleFUCHSIA);
        SEGMENT$vkInitializePerformanceApiINTEL = loader.apply("vkInitializePerformanceApiINTEL");
        HANDLE$vkInitializePerformanceApiINTEL = RawFunctionLoader.link(SEGMENT$vkInitializePerformanceApiINTEL, Descriptors.DESCRIPTOR$vkInitializePerformanceApiINTEL);
        SEGMENT$vkInvalidateMappedMemoryRanges = loader.apply("vkInvalidateMappedMemoryRanges");
        HANDLE$vkInvalidateMappedMemoryRanges = RawFunctionLoader.link(SEGMENT$vkInvalidateMappedMemoryRanges, Descriptors.DESCRIPTOR$vkInvalidateMappedMemoryRanges);
        SEGMENT$vkLatencySleepNV = loader.apply("vkLatencySleepNV");
        HANDLE$vkLatencySleepNV = RawFunctionLoader.link(SEGMENT$vkLatencySleepNV, Descriptors.DESCRIPTOR$vkLatencySleepNV);
        SEGMENT$vkMapMemory = loader.apply("vkMapMemory");
        HANDLE$vkMapMemory = RawFunctionLoader.link(SEGMENT$vkMapMemory, Descriptors.DESCRIPTOR$vkMapMemory);
        SEGMENT$vkMapMemory2 = loader.apply("vkMapMemory2");
        HANDLE$vkMapMemory2 = RawFunctionLoader.link(SEGMENT$vkMapMemory2, Descriptors.DESCRIPTOR$vkMapMemory2);
        SEGMENT$vkMapMemory2KHR = loader.apply("vkMapMemory2KHR");
        HANDLE$vkMapMemory2KHR = RawFunctionLoader.link(SEGMENT$vkMapMemory2KHR, Descriptors.DESCRIPTOR$vkMapMemory2);
        SEGMENT$vkMergePipelineCaches = loader.apply("vkMergePipelineCaches");
        HANDLE$vkMergePipelineCaches = RawFunctionLoader.link(SEGMENT$vkMergePipelineCaches, Descriptors.DESCRIPTOR$vkMergePipelineCaches);
        SEGMENT$vkMergeValidationCachesEXT = loader.apply("vkMergeValidationCachesEXT");
        HANDLE$vkMergeValidationCachesEXT = RawFunctionLoader.link(SEGMENT$vkMergeValidationCachesEXT, Descriptors.DESCRIPTOR$vkMergeValidationCachesEXT);
        SEGMENT$vkQueueBindSparse = loader.apply("vkQueueBindSparse");
        HANDLE$vkQueueBindSparse = RawFunctionLoader.link(SEGMENT$vkQueueBindSparse, Descriptors.DESCRIPTOR$vkQueueBindSparse);
        SEGMENT$vkQueueNotifyOutOfBandNV = loader.apply("vkQueueNotifyOutOfBandNV");
        HANDLE$vkQueueNotifyOutOfBandNV = RawFunctionLoader.link(SEGMENT$vkQueueNotifyOutOfBandNV, Descriptors.DESCRIPTOR$vkQueueNotifyOutOfBandNV);
        SEGMENT$vkQueuePresentKHR = loader.apply("vkQueuePresentKHR");
        HANDLE$vkQueuePresentKHR = RawFunctionLoader.link(SEGMENT$vkQueuePresentKHR, Descriptors.DESCRIPTOR$vkQueuePresentKHR);
        SEGMENT$vkQueueSetPerformanceConfigurationINTEL = loader.apply("vkQueueSetPerformanceConfigurationINTEL");
        HANDLE$vkQueueSetPerformanceConfigurationINTEL = RawFunctionLoader.link(SEGMENT$vkQueueSetPerformanceConfigurationINTEL, Descriptors.DESCRIPTOR$vkQueueSetPerformanceConfigurationINTEL);
        SEGMENT$vkQueueSubmit = loader.apply("vkQueueSubmit");
        HANDLE$vkQueueSubmit = RawFunctionLoader.link(SEGMENT$vkQueueSubmit, Descriptors.DESCRIPTOR$vkQueueSubmit);
        SEGMENT$vkQueueSubmit2 = loader.apply("vkQueueSubmit2");
        HANDLE$vkQueueSubmit2 = RawFunctionLoader.link(SEGMENT$vkQueueSubmit2, Descriptors.DESCRIPTOR$vkQueueSubmit2);
        SEGMENT$vkQueueSubmit2KHR = loader.apply("vkQueueSubmit2KHR");
        HANDLE$vkQueueSubmit2KHR = RawFunctionLoader.link(SEGMENT$vkQueueSubmit2KHR, Descriptors.DESCRIPTOR$vkQueueSubmit2);
        SEGMENT$vkQueueWaitIdle = loader.apply("vkQueueWaitIdle");
        HANDLE$vkQueueWaitIdle = RawFunctionLoader.link(SEGMENT$vkQueueWaitIdle, Descriptors.DESCRIPTOR$vkQueueWaitIdle);
        SEGMENT$vkRegisterDeviceEventEXT = loader.apply("vkRegisterDeviceEventEXT");
        HANDLE$vkRegisterDeviceEventEXT = RawFunctionLoader.link(SEGMENT$vkRegisterDeviceEventEXT, Descriptors.DESCRIPTOR$vkRegisterDeviceEventEXT);
        SEGMENT$vkRegisterDisplayEventEXT = loader.apply("vkRegisterDisplayEventEXT");
        HANDLE$vkRegisterDisplayEventEXT = RawFunctionLoader.link(SEGMENT$vkRegisterDisplayEventEXT, Descriptors.DESCRIPTOR$vkRegisterDisplayEventEXT);
        SEGMENT$vkReleaseCapturedPipelineDataKHR = loader.apply("vkReleaseCapturedPipelineDataKHR");
        HANDLE$vkReleaseCapturedPipelineDataKHR = RawFunctionLoader.link(SEGMENT$vkReleaseCapturedPipelineDataKHR, Descriptors.DESCRIPTOR$vkReleaseCapturedPipelineDataKHR);
        SEGMENT$vkReleaseFullScreenExclusiveModeEXT = loader.apply("vkReleaseFullScreenExclusiveModeEXT");
        HANDLE$vkReleaseFullScreenExclusiveModeEXT = RawFunctionLoader.link(SEGMENT$vkReleaseFullScreenExclusiveModeEXT, Descriptors.DESCRIPTOR$vkReleaseFullScreenExclusiveModeEXT);
        SEGMENT$vkReleasePerformanceConfigurationINTEL = loader.apply("vkReleasePerformanceConfigurationINTEL");
        HANDLE$vkReleasePerformanceConfigurationINTEL = RawFunctionLoader.link(SEGMENT$vkReleasePerformanceConfigurationINTEL, Descriptors.DESCRIPTOR$vkReleasePerformanceConfigurationINTEL);
        SEGMENT$vkReleaseProfilingLockKHR = loader.apply("vkReleaseProfilingLockKHR");
        HANDLE$vkReleaseProfilingLockKHR = RawFunctionLoader.link(SEGMENT$vkReleaseProfilingLockKHR, Descriptors.DESCRIPTOR$vkReleaseProfilingLockKHR);
        SEGMENT$vkReleaseSwapchainImagesEXT = loader.apply("vkReleaseSwapchainImagesEXT");
        HANDLE$vkReleaseSwapchainImagesEXT = RawFunctionLoader.link(SEGMENT$vkReleaseSwapchainImagesEXT, Descriptors.DESCRIPTOR$vkReleaseSwapchainImagesEXT);
        SEGMENT$vkResetCommandBuffer = loader.apply("vkResetCommandBuffer");
        HANDLE$vkResetCommandBuffer = RawFunctionLoader.link(SEGMENT$vkResetCommandBuffer, Descriptors.DESCRIPTOR$vkResetCommandBuffer);
        SEGMENT$vkResetCommandPool = loader.apply("vkResetCommandPool");
        HANDLE$vkResetCommandPool = RawFunctionLoader.link(SEGMENT$vkResetCommandPool, Descriptors.DESCRIPTOR$vkResetCommandPool);
        SEGMENT$vkResetDescriptorPool = loader.apply("vkResetDescriptorPool");
        HANDLE$vkResetDescriptorPool = RawFunctionLoader.link(SEGMENT$vkResetDescriptorPool, Descriptors.DESCRIPTOR$vkResetDescriptorPool);
        SEGMENT$vkResetEvent = loader.apply("vkResetEvent");
        HANDLE$vkResetEvent = RawFunctionLoader.link(SEGMENT$vkResetEvent, Descriptors.DESCRIPTOR$vkResetEvent);
        SEGMENT$vkResetFences = loader.apply("vkResetFences");
        HANDLE$vkResetFences = RawFunctionLoader.link(SEGMENT$vkResetFences, Descriptors.DESCRIPTOR$vkResetFences);
        SEGMENT$vkResetQueryPool = loader.apply("vkResetQueryPool");
        HANDLE$vkResetQueryPool = RawFunctionLoader.link(SEGMENT$vkResetQueryPool, Descriptors.DESCRIPTOR$vkResetQueryPool);
        SEGMENT$vkResetQueryPoolEXT = loader.apply("vkResetQueryPoolEXT");
        HANDLE$vkResetQueryPoolEXT = RawFunctionLoader.link(SEGMENT$vkResetQueryPoolEXT, Descriptors.DESCRIPTOR$vkResetQueryPool);
        SEGMENT$vkSetBufferCollectionBufferConstraintsFUCHSIA = loader.apply("vkSetBufferCollectionBufferConstraintsFUCHSIA");
        HANDLE$vkSetBufferCollectionBufferConstraintsFUCHSIA = RawFunctionLoader.link(SEGMENT$vkSetBufferCollectionBufferConstraintsFUCHSIA, Descriptors.DESCRIPTOR$vkSetBufferCollectionBufferConstraintsFUCHSIA);
        SEGMENT$vkSetBufferCollectionImageConstraintsFUCHSIA = loader.apply("vkSetBufferCollectionImageConstraintsFUCHSIA");
        HANDLE$vkSetBufferCollectionImageConstraintsFUCHSIA = RawFunctionLoader.link(SEGMENT$vkSetBufferCollectionImageConstraintsFUCHSIA, Descriptors.DESCRIPTOR$vkSetBufferCollectionImageConstraintsFUCHSIA);
        SEGMENT$vkSetDeviceMemoryPriorityEXT = loader.apply("vkSetDeviceMemoryPriorityEXT");
        HANDLE$vkSetDeviceMemoryPriorityEXT = RawFunctionLoader.link(SEGMENT$vkSetDeviceMemoryPriorityEXT, Descriptors.DESCRIPTOR$vkSetDeviceMemoryPriorityEXT);
        SEGMENT$vkSetEvent = loader.apply("vkSetEvent");
        HANDLE$vkSetEvent = RawFunctionLoader.link(SEGMENT$vkSetEvent, Descriptors.DESCRIPTOR$vkSetEvent);
        SEGMENT$vkSetHdrMetadataEXT = loader.apply("vkSetHdrMetadataEXT");
        HANDLE$vkSetHdrMetadataEXT = RawFunctionLoader.link(SEGMENT$vkSetHdrMetadataEXT, Descriptors.DESCRIPTOR$vkSetHdrMetadataEXT);
        SEGMENT$vkSetLatencyMarkerNV = loader.apply("vkSetLatencyMarkerNV");
        HANDLE$vkSetLatencyMarkerNV = RawFunctionLoader.link(SEGMENT$vkSetLatencyMarkerNV, Descriptors.DESCRIPTOR$vkSetLatencyMarkerNV);
        SEGMENT$vkSetLatencySleepModeNV = loader.apply("vkSetLatencySleepModeNV");
        HANDLE$vkSetLatencySleepModeNV = RawFunctionLoader.link(SEGMENT$vkSetLatencySleepModeNV, Descriptors.DESCRIPTOR$vkSetLatencySleepModeNV);
        SEGMENT$vkSetLocalDimmingAMD = loader.apply("vkSetLocalDimmingAMD");
        HANDLE$vkSetLocalDimmingAMD = RawFunctionLoader.link(SEGMENT$vkSetLocalDimmingAMD, Descriptors.DESCRIPTOR$vkSetLocalDimmingAMD);
        SEGMENT$vkSetPrivateData = loader.apply("vkSetPrivateData");
        HANDLE$vkSetPrivateData = RawFunctionLoader.link(SEGMENT$vkSetPrivateData, Descriptors.DESCRIPTOR$vkSetPrivateData);
        SEGMENT$vkSetPrivateDataEXT = loader.apply("vkSetPrivateDataEXT");
        HANDLE$vkSetPrivateDataEXT = RawFunctionLoader.link(SEGMENT$vkSetPrivateDataEXT, Descriptors.DESCRIPTOR$vkSetPrivateData);
        SEGMENT$vkSignalSemaphore = loader.apply("vkSignalSemaphore");
        HANDLE$vkSignalSemaphore = RawFunctionLoader.link(SEGMENT$vkSignalSemaphore, Descriptors.DESCRIPTOR$vkSignalSemaphore);
        SEGMENT$vkSignalSemaphoreKHR = loader.apply("vkSignalSemaphoreKHR");
        HANDLE$vkSignalSemaphoreKHR = RawFunctionLoader.link(SEGMENT$vkSignalSemaphoreKHR, Descriptors.DESCRIPTOR$vkSignalSemaphore);
        SEGMENT$vkTransitionImageLayout = loader.apply("vkTransitionImageLayout");
        HANDLE$vkTransitionImageLayout = RawFunctionLoader.link(SEGMENT$vkTransitionImageLayout, Descriptors.DESCRIPTOR$vkTransitionImageLayout);
        SEGMENT$vkTransitionImageLayoutEXT = loader.apply("vkTransitionImageLayoutEXT");
        HANDLE$vkTransitionImageLayoutEXT = RawFunctionLoader.link(SEGMENT$vkTransitionImageLayoutEXT, Descriptors.DESCRIPTOR$vkTransitionImageLayout);
        SEGMENT$vkTrimCommandPool = loader.apply("vkTrimCommandPool");
        HANDLE$vkTrimCommandPool = RawFunctionLoader.link(SEGMENT$vkTrimCommandPool, Descriptors.DESCRIPTOR$vkTrimCommandPool);
        SEGMENT$vkTrimCommandPoolKHR = loader.apply("vkTrimCommandPoolKHR");
        HANDLE$vkTrimCommandPoolKHR = RawFunctionLoader.link(SEGMENT$vkTrimCommandPoolKHR, Descriptors.DESCRIPTOR$vkTrimCommandPool);
        SEGMENT$vkUninitializePerformanceApiINTEL = loader.apply("vkUninitializePerformanceApiINTEL");
        HANDLE$vkUninitializePerformanceApiINTEL = RawFunctionLoader.link(SEGMENT$vkUninitializePerformanceApiINTEL, Descriptors.DESCRIPTOR$vkUninitializePerformanceApiINTEL);
        SEGMENT$vkUnmapMemory = loader.apply("vkUnmapMemory");
        HANDLE$vkUnmapMemory = RawFunctionLoader.link(SEGMENT$vkUnmapMemory, Descriptors.DESCRIPTOR$vkUnmapMemory);
        SEGMENT$vkUnmapMemory2 = loader.apply("vkUnmapMemory2");
        HANDLE$vkUnmapMemory2 = RawFunctionLoader.link(SEGMENT$vkUnmapMemory2, Descriptors.DESCRIPTOR$vkUnmapMemory2);
        SEGMENT$vkUnmapMemory2KHR = loader.apply("vkUnmapMemory2KHR");
        HANDLE$vkUnmapMemory2KHR = RawFunctionLoader.link(SEGMENT$vkUnmapMemory2KHR, Descriptors.DESCRIPTOR$vkUnmapMemory2);
        SEGMENT$vkUpdateDescriptorSetWithTemplate = loader.apply("vkUpdateDescriptorSetWithTemplate");
        HANDLE$vkUpdateDescriptorSetWithTemplate = RawFunctionLoader.link(SEGMENT$vkUpdateDescriptorSetWithTemplate, Descriptors.DESCRIPTOR$vkUpdateDescriptorSetWithTemplate);
        SEGMENT$vkUpdateDescriptorSetWithTemplateKHR = loader.apply("vkUpdateDescriptorSetWithTemplateKHR");
        HANDLE$vkUpdateDescriptorSetWithTemplateKHR = RawFunctionLoader.link(SEGMENT$vkUpdateDescriptorSetWithTemplateKHR, Descriptors.DESCRIPTOR$vkUpdateDescriptorSetWithTemplate);
        SEGMENT$vkUpdateDescriptorSets = loader.apply("vkUpdateDescriptorSets");
        HANDLE$vkUpdateDescriptorSets = RawFunctionLoader.link(SEGMENT$vkUpdateDescriptorSets, Descriptors.DESCRIPTOR$vkUpdateDescriptorSets);
        SEGMENT$vkUpdateIndirectExecutionSetPipelineEXT = loader.apply("vkUpdateIndirectExecutionSetPipelineEXT");
        HANDLE$vkUpdateIndirectExecutionSetPipelineEXT = RawFunctionLoader.link(SEGMENT$vkUpdateIndirectExecutionSetPipelineEXT, Descriptors.DESCRIPTOR$vkUpdateIndirectExecutionSetPipelineEXT);
        SEGMENT$vkUpdateIndirectExecutionSetShaderEXT = loader.apply("vkUpdateIndirectExecutionSetShaderEXT");
        HANDLE$vkUpdateIndirectExecutionSetShaderEXT = RawFunctionLoader.link(SEGMENT$vkUpdateIndirectExecutionSetShaderEXT, Descriptors.DESCRIPTOR$vkUpdateIndirectExecutionSetShaderEXT);
        SEGMENT$vkUpdateVideoSessionParametersKHR = loader.apply("vkUpdateVideoSessionParametersKHR");
        HANDLE$vkUpdateVideoSessionParametersKHR = RawFunctionLoader.link(SEGMENT$vkUpdateVideoSessionParametersKHR, Descriptors.DESCRIPTOR$vkUpdateVideoSessionParametersKHR);
        SEGMENT$vkWaitForFences = loader.apply("vkWaitForFences");
        HANDLE$vkWaitForFences = RawFunctionLoader.link(SEGMENT$vkWaitForFences, Descriptors.DESCRIPTOR$vkWaitForFences);
        SEGMENT$vkWaitForPresentKHR = loader.apply("vkWaitForPresentKHR");
        HANDLE$vkWaitForPresentKHR = RawFunctionLoader.link(SEGMENT$vkWaitForPresentKHR, Descriptors.DESCRIPTOR$vkWaitForPresentKHR);
        SEGMENT$vkWaitSemaphores = loader.apply("vkWaitSemaphores");
        HANDLE$vkWaitSemaphores = RawFunctionLoader.link(SEGMENT$vkWaitSemaphores, Descriptors.DESCRIPTOR$vkWaitSemaphores);
        SEGMENT$vkWaitSemaphoresKHR = loader.apply("vkWaitSemaphoresKHR");
        HANDLE$vkWaitSemaphoresKHR = RawFunctionLoader.link(SEGMENT$vkWaitSemaphoresKHR, Descriptors.DESCRIPTOR$vkWaitSemaphores);
        SEGMENT$vkWriteAccelerationStructuresPropertiesKHR = loader.apply("vkWriteAccelerationStructuresPropertiesKHR");
        HANDLE$vkWriteAccelerationStructuresPropertiesKHR = RawFunctionLoader.link(SEGMENT$vkWriteAccelerationStructuresPropertiesKHR, Descriptors.DESCRIPTOR$vkWriteAccelerationStructuresPropertiesKHR);
        SEGMENT$vkWriteMicromapsPropertiesEXT = loader.apply("vkWriteMicromapsPropertiesEXT");
        HANDLE$vkWriteMicromapsPropertiesEXT = RawFunctionLoader.link(SEGMENT$vkWriteMicromapsPropertiesEXT, Descriptors.DESCRIPTOR$vkWriteMicromapsPropertiesEXT);
    }

    // region command wrappers

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkAcquireFullScreenExclusiveModeEXT.html"><code>vkAcquireFullScreenExclusiveModeEXT</code></a>
    public @EnumType(VkResult.class) int acquireFullScreenExclusiveModeEXT(
        VkDevice device,
        VkSwapchainKHR swapchain
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkAcquireFullScreenExclusiveModeEXT);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                swapchain.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkAcquireNextImage2KHR.html"><code>vkAcquireNextImage2KHR</code></a>
    public @EnumType(VkResult.class) int acquireNextImage2KHR(
        VkDevice device,
        @Pointer VkAcquireNextImageInfoKHR pAcquireInfo,
        @Unsigned IntPtr pImageIndex
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkAcquireNextImage2KHR);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                pAcquireInfo.segment(),
                pImageIndex.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkAcquireNextImageKHR.html"><code>vkAcquireNextImageKHR</code></a>
    public @EnumType(VkResult.class) int acquireNextImageKHR(
        VkDevice device,
        VkSwapchainKHR swapchain,
        @Unsigned long timeout,
        @Nullable VkSemaphore semaphore,
        @Nullable VkFence fence,
        @Unsigned IntPtr pImageIndex
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkAcquireNextImageKHR);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                swapchain.segment(),
                timeout,
                (MemorySegment) (semaphore != null ? semaphore.segment() : MemorySegment.NULL),
                (MemorySegment) (fence != null ? fence.segment() : MemorySegment.NULL),
                pImageIndex.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkAcquirePerformanceConfigurationINTEL.html"><code>vkAcquirePerformanceConfigurationINTEL</code></a>
    public @EnumType(VkResult.class) int acquirePerformanceConfigurationINTEL(
        VkDevice device,
        @Pointer VkPerformanceConfigurationAcquireInfoINTEL pAcquireInfo,
        @Pointer VkPerformanceConfigurationINTEL.Ptr pConfiguration
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkAcquirePerformanceConfigurationINTEL);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                pAcquireInfo.segment(),
                pConfiguration.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkAcquireProfilingLockKHR.html"><code>vkAcquireProfilingLockKHR</code></a>
    public @EnumType(VkResult.class) int acquireProfilingLockKHR(
        VkDevice device,
        @Pointer VkAcquireProfilingLockInfoKHR pInfo
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkAcquireProfilingLockKHR);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                pInfo.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkAllocateCommandBuffers.html"><code>vkAllocateCommandBuffers</code></a>
    public @EnumType(VkResult.class) int allocateCommandBuffers(
        VkDevice device,
        @Pointer VkCommandBufferAllocateInfo pAllocateInfo,
        @Pointer VkCommandBuffer.Ptr pCommandBuffers
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkAllocateCommandBuffers);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                pAllocateInfo.segment(),
                pCommandBuffers.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkAllocateDescriptorSets.html"><code>vkAllocateDescriptorSets</code></a>
    public @EnumType(VkResult.class) int allocateDescriptorSets(
        VkDevice device,
        @Pointer VkDescriptorSetAllocateInfo pAllocateInfo,
        @Pointer VkDescriptorSet.Ptr pDescriptorSets
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkAllocateDescriptorSets);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                pAllocateInfo.segment(),
                pDescriptorSets.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkAllocateMemory.html"><code>vkAllocateMemory</code></a>
    public @EnumType(VkResult.class) int allocateMemory(
        VkDevice device,
        @Pointer VkMemoryAllocateInfo pAllocateInfo,
        @Nullable @Pointer VkAllocationCallbacks pAllocator,
        @Pointer VkDeviceMemory.Ptr pMemory
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkAllocateMemory);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                pAllocateInfo.segment(),
                (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL),
                pMemory.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkAntiLagUpdateAMD.html"><code>vkAntiLagUpdateAMD</code></a>
    public void antiLagUpdateAMD(
        VkDevice device,
        @Pointer VkAntiLagDataAMD pData
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkAntiLagUpdateAMD);
        try {
            hFunction.invokeExact(
                device.segment(),
                pData.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkBeginCommandBuffer.html"><code>vkBeginCommandBuffer</code></a>
    public @EnumType(VkResult.class) int beginCommandBuffer(
        VkCommandBuffer commandBuffer,
        @Pointer VkCommandBufferBeginInfo pBeginInfo
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkBeginCommandBuffer);
        try {
            return (int) hFunction.invokeExact(
                commandBuffer.segment(),
                pBeginInfo.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkBindAccelerationStructureMemoryNV.html"><code>vkBindAccelerationStructureMemoryNV</code></a>
    public @EnumType(VkResult.class) int bindAccelerationStructureMemoryNV(
        VkDevice device,
        @Unsigned int bindInfoCount,
        @Pointer IVkBindAccelerationStructureMemoryInfoNV pBindInfos
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkBindAccelerationStructureMemoryNV);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                bindInfoCount,
                pBindInfos.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkBindBufferMemory.html"><code>vkBindBufferMemory</code></a>
    public @EnumType(VkResult.class) int bindBufferMemory(
        VkDevice device,
        VkBuffer buffer,
        VkDeviceMemory memory,
        @NativeType("VkDeviceSize") @Unsigned long memoryOffset
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkBindBufferMemory);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                buffer.segment(),
                memory.segment(),
                memoryOffset
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkBindBufferMemory2.html"><code>vkBindBufferMemory2</code></a>
    public @EnumType(VkResult.class) int bindBufferMemory2(
        VkDevice device,
        @Unsigned int bindInfoCount,
        @Pointer IVkBindBufferMemoryInfo pBindInfos
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkBindBufferMemory2);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                bindInfoCount,
                pBindInfos.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkBindBufferMemory2KHR.html"><code>vkBindBufferMemory2KHR</code></a>
    public @EnumType(VkResult.class) int bindBufferMemory2KHR(
        VkDevice device,
        @Unsigned int bindInfoCount,
        @Pointer IVkBindBufferMemoryInfo pBindInfos
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkBindBufferMemory2KHR);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                bindInfoCount,
                pBindInfos.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkBindImageMemory.html"><code>vkBindImageMemory</code></a>
    public @EnumType(VkResult.class) int bindImageMemory(
        VkDevice device,
        VkImage image,
        VkDeviceMemory memory,
        @NativeType("VkDeviceSize") @Unsigned long memoryOffset
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkBindImageMemory);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                image.segment(),
                memory.segment(),
                memoryOffset
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkBindImageMemory2.html"><code>vkBindImageMemory2</code></a>
    public @EnumType(VkResult.class) int bindImageMemory2(
        VkDevice device,
        @Unsigned int bindInfoCount,
        @Pointer IVkBindImageMemoryInfo pBindInfos
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkBindImageMemory2);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                bindInfoCount,
                pBindInfos.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkBindImageMemory2KHR.html"><code>vkBindImageMemory2KHR</code></a>
    public @EnumType(VkResult.class) int bindImageMemory2KHR(
        VkDevice device,
        @Unsigned int bindInfoCount,
        @Pointer IVkBindImageMemoryInfo pBindInfos
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkBindImageMemory2KHR);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                bindInfoCount,
                pBindInfos.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkBindOpticalFlowSessionImageNV.html"><code>vkBindOpticalFlowSessionImageNV</code></a>
    public @EnumType(VkResult.class) int bindOpticalFlowSessionImageNV(
        VkDevice device,
        VkOpticalFlowSessionNV session,
        @EnumType(VkOpticalFlowSessionBindingPointNV.class) int bindingPoint,
        @Nullable VkImageView view,
        @EnumType(VkImageLayout.class) int layout
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkBindOpticalFlowSessionImageNV);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                session.segment(),
                bindingPoint,
                (MemorySegment) (view != null ? view.segment() : MemorySegment.NULL),
                layout
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkBindVideoSessionMemoryKHR.html"><code>vkBindVideoSessionMemoryKHR</code></a>
    public @EnumType(VkResult.class) int bindVideoSessionMemoryKHR(
        VkDevice device,
        VkVideoSessionKHR videoSession,
        @Unsigned int bindSessionMemoryInfoCount,
        @Pointer IVkBindVideoSessionMemoryInfoKHR pBindSessionMemoryInfos
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkBindVideoSessionMemoryKHR);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                videoSession.segment(),
                bindSessionMemoryInfoCount,
                pBindSessionMemoryInfos.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkBuildAccelerationStructuresKHR.html"><code>vkBuildAccelerationStructuresKHR</code></a>
    public @EnumType(VkResult.class) int buildAccelerationStructuresKHR(
        VkDevice device,
        @Nullable VkDeferredOperationKHR deferredOperation,
        @Unsigned int infoCount,
        @Pointer IVkAccelerationStructureBuildGeometryInfoKHR pInfos,
        PointerPtr ppBuildRangeInfos
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkBuildAccelerationStructuresKHR);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                (MemorySegment) (deferredOperation != null ? deferredOperation.segment() : MemorySegment.NULL),
                infoCount,
                pInfos.segment(),
                ppBuildRangeInfos.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkBuildMicromapsEXT.html"><code>vkBuildMicromapsEXT</code></a>
    public @EnumType(VkResult.class) int buildMicromapsEXT(
        VkDevice device,
        @Nullable VkDeferredOperationKHR deferredOperation,
        @Unsigned int infoCount,
        @Pointer IVkMicromapBuildInfoEXT pInfos
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkBuildMicromapsEXT);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                (MemorySegment) (deferredOperation != null ? deferredOperation.segment() : MemorySegment.NULL),
                infoCount,
                pInfos.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdBeginConditionalRenderingEXT.html"><code>vkCmdBeginConditionalRenderingEXT</code></a>
    public void cmdBeginConditionalRenderingEXT(
        VkCommandBuffer commandBuffer,
        @Pointer VkConditionalRenderingBeginInfoEXT pConditionalRenderingBegin
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdBeginConditionalRenderingEXT);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                pConditionalRenderingBegin.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdBeginPerTileExecutionQCOM.html"><code>vkCmdBeginPerTileExecutionQCOM</code></a>
    public void cmdBeginPerTileExecutionQCOM(
        VkCommandBuffer commandBuffer,
        @Pointer VkPerTileBeginInfoQCOM pPerTileBeginInfo
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdBeginPerTileExecutionQCOM);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                pPerTileBeginInfo.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdBeginQuery.html"><code>vkCmdBeginQuery</code></a>
    public void cmdBeginQuery(
        VkCommandBuffer commandBuffer,
        VkQueryPool queryPool,
        @Unsigned int query,
        @EnumType(VkQueryControlFlags.class) int flags
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdBeginQuery);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                queryPool.segment(),
                query,
                flags
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdBeginQueryIndexedEXT.html"><code>vkCmdBeginQueryIndexedEXT</code></a>
    public void cmdBeginQueryIndexedEXT(
        VkCommandBuffer commandBuffer,
        VkQueryPool queryPool,
        @Unsigned int query,
        @EnumType(VkQueryControlFlags.class) int flags,
        @Unsigned int index
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdBeginQueryIndexedEXT);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                queryPool.segment(),
                query,
                flags,
                index
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdBeginRenderPass.html"><code>vkCmdBeginRenderPass</code></a>
    public void cmdBeginRenderPass(
        VkCommandBuffer commandBuffer,
        @Pointer VkRenderPassBeginInfo pRenderPassBegin,
        @EnumType(VkSubpassContents.class) int contents
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdBeginRenderPass);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                pRenderPassBegin.segment(),
                contents
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdBeginRenderPass2.html"><code>vkCmdBeginRenderPass2</code></a>
    public void cmdBeginRenderPass2(
        VkCommandBuffer commandBuffer,
        @Pointer VkRenderPassBeginInfo pRenderPassBegin,
        @Pointer VkSubpassBeginInfo pSubpassBeginInfo
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdBeginRenderPass2);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                pRenderPassBegin.segment(),
                pSubpassBeginInfo.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdBeginRenderPass2KHR.html"><code>vkCmdBeginRenderPass2KHR</code></a>
    public void cmdBeginRenderPass2KHR(
        VkCommandBuffer commandBuffer,
        @Pointer VkRenderPassBeginInfo pRenderPassBegin,
        @Pointer VkSubpassBeginInfo pSubpassBeginInfo
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdBeginRenderPass2KHR);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                pRenderPassBegin.segment(),
                pSubpassBeginInfo.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdBeginRendering.html"><code>vkCmdBeginRendering</code></a>
    public void cmdBeginRendering(
        VkCommandBuffer commandBuffer,
        @Pointer VkRenderingInfo pRenderingInfo
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdBeginRendering);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                pRenderingInfo.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdBeginRenderingKHR.html"><code>vkCmdBeginRenderingKHR</code></a>
    public void cmdBeginRenderingKHR(
        VkCommandBuffer commandBuffer,
        @Pointer VkRenderingInfo pRenderingInfo
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdBeginRenderingKHR);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                pRenderingInfo.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdBeginTransformFeedbackEXT.html"><code>vkCmdBeginTransformFeedbackEXT</code></a>
    public void cmdBeginTransformFeedbackEXT(
        VkCommandBuffer commandBuffer,
        @Unsigned int firstCounterBuffer,
        @Unsigned int counterBufferCount,
        @Nullable @Pointer VkBuffer.Ptr pCounterBuffers,
        @Nullable @Pointer(comment="VkDeviceSize") @Unsigned LongPtr pCounterBufferOffsets
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdBeginTransformFeedbackEXT);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                firstCounterBuffer,
                counterBufferCount,
                (MemorySegment) (pCounterBuffers != null ? pCounterBuffers.segment() : MemorySegment.NULL),
                (MemorySegment) (pCounterBufferOffsets != null ? pCounterBufferOffsets.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdBeginVideoCodingKHR.html"><code>vkCmdBeginVideoCodingKHR</code></a>
    public void cmdBeginVideoCodingKHR(
        VkCommandBuffer commandBuffer,
        @Pointer VkVideoBeginCodingInfoKHR pBeginInfo
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdBeginVideoCodingKHR);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                pBeginInfo.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdBindDescriptorBufferEmbeddedSamplers2EXT.html"><code>vkCmdBindDescriptorBufferEmbeddedSamplers2EXT</code></a>
    public void cmdBindDescriptorBufferEmbeddedSamplers2EXT(
        VkCommandBuffer commandBuffer,
        @Pointer VkBindDescriptorBufferEmbeddedSamplersInfoEXT pBindDescriptorBufferEmbeddedSamplersInfo
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdBindDescriptorBufferEmbeddedSamplers2EXT);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                pBindDescriptorBufferEmbeddedSamplersInfo.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdBindDescriptorBufferEmbeddedSamplersEXT.html"><code>vkCmdBindDescriptorBufferEmbeddedSamplersEXT</code></a>
    public void cmdBindDescriptorBufferEmbeddedSamplersEXT(
        VkCommandBuffer commandBuffer,
        @EnumType(VkPipelineBindPoint.class) int pipelineBindPoint,
        VkPipelineLayout layout,
        @Unsigned int set
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdBindDescriptorBufferEmbeddedSamplersEXT);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                pipelineBindPoint,
                layout.segment(),
                set
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdBindDescriptorBuffersEXT.html"><code>vkCmdBindDescriptorBuffersEXT</code></a>
    public void cmdBindDescriptorBuffersEXT(
        VkCommandBuffer commandBuffer,
        @Unsigned int bufferCount,
        @Pointer IVkDescriptorBufferBindingInfoEXT pBindingInfos
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdBindDescriptorBuffersEXT);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                bufferCount,
                pBindingInfos.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdBindDescriptorSets.html"><code>vkCmdBindDescriptorSets</code></a>
    public void cmdBindDescriptorSets(
        VkCommandBuffer commandBuffer,
        @EnumType(VkPipelineBindPoint.class) int pipelineBindPoint,
        VkPipelineLayout layout,
        @Unsigned int firstSet,
        @Unsigned int descriptorSetCount,
        @Pointer VkDescriptorSet.Ptr pDescriptorSets,
        @Unsigned int dynamicOffsetCount,
        @Nullable @Unsigned IntPtr pDynamicOffsets
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdBindDescriptorSets);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                pipelineBindPoint,
                layout.segment(),
                firstSet,
                descriptorSetCount,
                pDescriptorSets.segment(),
                dynamicOffsetCount,
                (MemorySegment) (pDynamicOffsets != null ? pDynamicOffsets.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdBindDescriptorSets2.html"><code>vkCmdBindDescriptorSets2</code></a>
    public void cmdBindDescriptorSets2(
        VkCommandBuffer commandBuffer,
        @Pointer VkBindDescriptorSetsInfo pBindDescriptorSetsInfo
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdBindDescriptorSets2);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                pBindDescriptorSetsInfo.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdBindDescriptorSets2KHR.html"><code>vkCmdBindDescriptorSets2KHR</code></a>
    public void cmdBindDescriptorSets2KHR(
        VkCommandBuffer commandBuffer,
        @Pointer VkBindDescriptorSetsInfo pBindDescriptorSetsInfo
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdBindDescriptorSets2KHR);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                pBindDescriptorSetsInfo.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdBindIndexBuffer.html"><code>vkCmdBindIndexBuffer</code></a>
    public void cmdBindIndexBuffer(
        VkCommandBuffer commandBuffer,
        @Nullable VkBuffer buffer,
        @NativeType("VkDeviceSize") @Unsigned long offset,
        @EnumType(VkIndexType.class) int indexType
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdBindIndexBuffer);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                (MemorySegment) (buffer != null ? buffer.segment() : MemorySegment.NULL),
                offset,
                indexType
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdBindIndexBuffer2.html"><code>vkCmdBindIndexBuffer2</code></a>
    public void cmdBindIndexBuffer2(
        VkCommandBuffer commandBuffer,
        @Nullable VkBuffer buffer,
        @NativeType("VkDeviceSize") @Unsigned long offset,
        @NativeType("VkDeviceSize") @Unsigned long size,
        @EnumType(VkIndexType.class) int indexType
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdBindIndexBuffer2);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                (MemorySegment) (buffer != null ? buffer.segment() : MemorySegment.NULL),
                offset,
                size,
                indexType
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdBindIndexBuffer2KHR.html"><code>vkCmdBindIndexBuffer2KHR</code></a>
    public void cmdBindIndexBuffer2KHR(
        VkCommandBuffer commandBuffer,
        @Nullable VkBuffer buffer,
        @NativeType("VkDeviceSize") @Unsigned long offset,
        @NativeType("VkDeviceSize") @Unsigned long size,
        @EnumType(VkIndexType.class) int indexType
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdBindIndexBuffer2KHR);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                (MemorySegment) (buffer != null ? buffer.segment() : MemorySegment.NULL),
                offset,
                size,
                indexType
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdBindInvocationMaskHUAWEI.html"><code>vkCmdBindInvocationMaskHUAWEI</code></a>
    public void cmdBindInvocationMaskHUAWEI(
        VkCommandBuffer commandBuffer,
        @Nullable VkImageView imageView,
        @EnumType(VkImageLayout.class) int imageLayout
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdBindInvocationMaskHUAWEI);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                (MemorySegment) (imageView != null ? imageView.segment() : MemorySegment.NULL),
                imageLayout
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdBindPipeline.html"><code>vkCmdBindPipeline</code></a>
    public void cmdBindPipeline(
        VkCommandBuffer commandBuffer,
        @EnumType(VkPipelineBindPoint.class) int pipelineBindPoint,
        VkPipeline pipeline
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdBindPipeline);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                pipelineBindPoint,
                pipeline.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdBindPipelineShaderGroupNV.html"><code>vkCmdBindPipelineShaderGroupNV</code></a>
    public void cmdBindPipelineShaderGroupNV(
        VkCommandBuffer commandBuffer,
        @EnumType(VkPipelineBindPoint.class) int pipelineBindPoint,
        VkPipeline pipeline,
        @Unsigned int groupIndex
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdBindPipelineShaderGroupNV);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                pipelineBindPoint,
                pipeline.segment(),
                groupIndex
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdBindShadersEXT.html"><code>vkCmdBindShadersEXT</code></a>
    public void cmdBindShadersEXT(
        VkCommandBuffer commandBuffer,
        @Unsigned int stageCount,
        @EnumType(VkShaderStageFlags.class) IntPtr pStages,
        @Nullable @Pointer VkShaderEXT.Ptr pShaders
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdBindShadersEXT);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                stageCount,
                pStages.segment(),
                (MemorySegment) (pShaders != null ? pShaders.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdBindShadingRateImageNV.html"><code>vkCmdBindShadingRateImageNV</code></a>
    public void cmdBindShadingRateImageNV(
        VkCommandBuffer commandBuffer,
        @Nullable VkImageView imageView,
        @EnumType(VkImageLayout.class) int imageLayout
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdBindShadingRateImageNV);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                (MemorySegment) (imageView != null ? imageView.segment() : MemorySegment.NULL),
                imageLayout
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdBindTileMemoryQCOM.html"><code>vkCmdBindTileMemoryQCOM</code></a>
    public void cmdBindTileMemoryQCOM(
        VkCommandBuffer commandBuffer,
        @Nullable @Pointer VkTileMemoryBindInfoQCOM pTileMemoryBindInfo
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdBindTileMemoryQCOM);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                (MemorySegment) (pTileMemoryBindInfo != null ? pTileMemoryBindInfo.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdBindTransformFeedbackBuffersEXT.html"><code>vkCmdBindTransformFeedbackBuffersEXT</code></a>
    public void cmdBindTransformFeedbackBuffersEXT(
        VkCommandBuffer commandBuffer,
        @Unsigned int firstBinding,
        @Unsigned int bindingCount,
        @Pointer VkBuffer.Ptr pBuffers,
        @Pointer(comment="VkDeviceSize") @Unsigned LongPtr pOffsets,
        @Nullable @Pointer(comment="VkDeviceSize") @Unsigned LongPtr pSizes
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdBindTransformFeedbackBuffersEXT);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                firstBinding,
                bindingCount,
                pBuffers.segment(),
                pOffsets.segment(),
                (MemorySegment) (pSizes != null ? pSizes.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdBindVertexBuffers.html"><code>vkCmdBindVertexBuffers</code></a>
    public void cmdBindVertexBuffers(
        VkCommandBuffer commandBuffer,
        @Unsigned int firstBinding,
        @Unsigned int bindingCount,
        @Pointer VkBuffer.Ptr pBuffers,
        @Pointer(comment="VkDeviceSize") @Unsigned LongPtr pOffsets
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdBindVertexBuffers);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                firstBinding,
                bindingCount,
                pBuffers.segment(),
                pOffsets.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdBindVertexBuffers2.html"><code>vkCmdBindVertexBuffers2</code></a>
    public void cmdBindVertexBuffers2(
        VkCommandBuffer commandBuffer,
        @Unsigned int firstBinding,
        @Unsigned int bindingCount,
        @Pointer VkBuffer.Ptr pBuffers,
        @Pointer(comment="VkDeviceSize") @Unsigned LongPtr pOffsets,
        @Nullable @Pointer(comment="VkDeviceSize") @Unsigned LongPtr pSizes,
        @Nullable @Pointer(comment="VkDeviceSize") @Unsigned LongPtr pStrides
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdBindVertexBuffers2);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                firstBinding,
                bindingCount,
                pBuffers.segment(),
                pOffsets.segment(),
                (MemorySegment) (pSizes != null ? pSizes.segment() : MemorySegment.NULL),
                (MemorySegment) (pStrides != null ? pStrides.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdBindVertexBuffers2EXT.html"><code>vkCmdBindVertexBuffers2EXT</code></a>
    public void cmdBindVertexBuffers2EXT(
        VkCommandBuffer commandBuffer,
        @Unsigned int firstBinding,
        @Unsigned int bindingCount,
        @Pointer VkBuffer.Ptr pBuffers,
        @Pointer(comment="VkDeviceSize") @Unsigned LongPtr pOffsets,
        @Nullable @Pointer(comment="VkDeviceSize") @Unsigned LongPtr pSizes,
        @Nullable @Pointer(comment="VkDeviceSize") @Unsigned LongPtr pStrides
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdBindVertexBuffers2EXT);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                firstBinding,
                bindingCount,
                pBuffers.segment(),
                pOffsets.segment(),
                (MemorySegment) (pSizes != null ? pSizes.segment() : MemorySegment.NULL),
                (MemorySegment) (pStrides != null ? pStrides.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdBlitImage.html"><code>vkCmdBlitImage</code></a>
    public void cmdBlitImage(
        VkCommandBuffer commandBuffer,
        VkImage srcImage,
        @EnumType(VkImageLayout.class) int srcImageLayout,
        VkImage dstImage,
        @EnumType(VkImageLayout.class) int dstImageLayout,
        @Unsigned int regionCount,
        @Pointer IVkImageBlit pRegions,
        @EnumType(VkFilter.class) int filter
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdBlitImage);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                srcImage.segment(),
                srcImageLayout,
                dstImage.segment(),
                dstImageLayout,
                regionCount,
                pRegions.segment(),
                filter
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdBlitImage2.html"><code>vkCmdBlitImage2</code></a>
    public void cmdBlitImage2(
        VkCommandBuffer commandBuffer,
        @Pointer VkBlitImageInfo2 pBlitImageInfo
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdBlitImage2);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                pBlitImageInfo.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdBlitImage2KHR.html"><code>vkCmdBlitImage2KHR</code></a>
    public void cmdBlitImage2KHR(
        VkCommandBuffer commandBuffer,
        @Pointer VkBlitImageInfo2 pBlitImageInfo
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdBlitImage2KHR);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                pBlitImageInfo.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdBuildAccelerationStructureNV.html"><code>vkCmdBuildAccelerationStructureNV</code></a>
    public void cmdBuildAccelerationStructureNV(
        VkCommandBuffer commandBuffer,
        @Pointer VkAccelerationStructureInfoNV pInfo,
        @Nullable VkBuffer instanceData,
        @NativeType("VkDeviceSize") @Unsigned long instanceOffset,
        @NativeType("VkBool32") @Unsigned int update,
        VkAccelerationStructureNV dst,
        @Nullable VkAccelerationStructureNV src,
        VkBuffer scratch,
        @NativeType("VkDeviceSize") @Unsigned long scratchOffset
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdBuildAccelerationStructureNV);
        try {
            hFunction.invokeExact(
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
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdBuildAccelerationStructuresIndirectKHR.html"><code>vkCmdBuildAccelerationStructuresIndirectKHR</code></a>
    public void cmdBuildAccelerationStructuresIndirectKHR(
        VkCommandBuffer commandBuffer,
        @Unsigned int infoCount,
        @Pointer IVkAccelerationStructureBuildGeometryInfoKHR pInfos,
        @Pointer(comment="VkDeviceAddress") @Unsigned LongPtr pIndirectDeviceAddresses,
        @Unsigned IntPtr pIndirectStrides,
        PointerPtr ppMaxPrimitiveCounts
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdBuildAccelerationStructuresIndirectKHR);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                infoCount,
                pInfos.segment(),
                pIndirectDeviceAddresses.segment(),
                pIndirectStrides.segment(),
                ppMaxPrimitiveCounts.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdBuildAccelerationStructuresKHR.html"><code>vkCmdBuildAccelerationStructuresKHR</code></a>
    public void cmdBuildAccelerationStructuresKHR(
        VkCommandBuffer commandBuffer,
        @Unsigned int infoCount,
        @Pointer IVkAccelerationStructureBuildGeometryInfoKHR pInfos,
        PointerPtr ppBuildRangeInfos
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdBuildAccelerationStructuresKHR);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                infoCount,
                pInfos.segment(),
                ppBuildRangeInfos.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdBuildClusterAccelerationStructureIndirectNV.html"><code>vkCmdBuildClusterAccelerationStructureIndirectNV</code></a>
    public void cmdBuildClusterAccelerationStructureIndirectNV(
        VkCommandBuffer commandBuffer,
        @Pointer VkClusterAccelerationStructureCommandsInfoNV pCommandInfos
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdBuildClusterAccelerationStructureIndirectNV);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                pCommandInfos.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdBuildMicromapsEXT.html"><code>vkCmdBuildMicromapsEXT</code></a>
    public void cmdBuildMicromapsEXT(
        VkCommandBuffer commandBuffer,
        @Unsigned int infoCount,
        @Pointer IVkMicromapBuildInfoEXT pInfos
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdBuildMicromapsEXT);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                infoCount,
                pInfos.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdBuildPartitionedAccelerationStructuresNV.html"><code>vkCmdBuildPartitionedAccelerationStructuresNV</code></a>
    public void cmdBuildPartitionedAccelerationStructuresNV(
        VkCommandBuffer commandBuffer,
        @Pointer VkBuildPartitionedAccelerationStructureInfoNV pBuildInfo
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdBuildPartitionedAccelerationStructuresNV);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                pBuildInfo.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdClearAttachments.html"><code>vkCmdClearAttachments</code></a>
    public void cmdClearAttachments(
        VkCommandBuffer commandBuffer,
        @Unsigned int attachmentCount,
        @Pointer IVkClearAttachment pAttachments,
        @Unsigned int rectCount,
        @Pointer IVkClearRect pRects
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdClearAttachments);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                attachmentCount,
                pAttachments.segment(),
                rectCount,
                pRects.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdClearColorImage.html"><code>vkCmdClearColorImage</code></a>
    public void cmdClearColorImage(
        VkCommandBuffer commandBuffer,
        VkImage image,
        @EnumType(VkImageLayout.class) int imageLayout,
        @Pointer VkClearColorValue pColor,
        @Unsigned int rangeCount,
        @Pointer IVkImageSubresourceRange pRanges
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdClearColorImage);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                image.segment(),
                imageLayout,
                pColor.segment(),
                rangeCount,
                pRanges.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdClearDepthStencilImage.html"><code>vkCmdClearDepthStencilImage</code></a>
    public void cmdClearDepthStencilImage(
        VkCommandBuffer commandBuffer,
        VkImage image,
        @EnumType(VkImageLayout.class) int imageLayout,
        @Pointer VkClearDepthStencilValue pDepthStencil,
        @Unsigned int rangeCount,
        @Pointer IVkImageSubresourceRange pRanges
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdClearDepthStencilImage);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                image.segment(),
                imageLayout,
                pDepthStencil.segment(),
                rangeCount,
                pRanges.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdControlVideoCodingKHR.html"><code>vkCmdControlVideoCodingKHR</code></a>
    public void cmdControlVideoCodingKHR(
        VkCommandBuffer commandBuffer,
        @Pointer VkVideoCodingControlInfoKHR pCodingControlInfo
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdControlVideoCodingKHR);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                pCodingControlInfo.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdConvertCooperativeVectorMatrixNV.html"><code>vkCmdConvertCooperativeVectorMatrixNV</code></a>
    public void cmdConvertCooperativeVectorMatrixNV(
        VkCommandBuffer commandBuffer,
        @Unsigned int infoCount,
        @Pointer IVkConvertCooperativeVectorMatrixInfoNV pInfos
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdConvertCooperativeVectorMatrixNV);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                infoCount,
                pInfos.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdCopyAccelerationStructureKHR.html"><code>vkCmdCopyAccelerationStructureKHR</code></a>
    public void cmdCopyAccelerationStructureKHR(
        VkCommandBuffer commandBuffer,
        @Pointer VkCopyAccelerationStructureInfoKHR pInfo
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdCopyAccelerationStructureKHR);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                pInfo.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdCopyAccelerationStructureNV.html"><code>vkCmdCopyAccelerationStructureNV</code></a>
    public void cmdCopyAccelerationStructureNV(
        VkCommandBuffer commandBuffer,
        VkAccelerationStructureNV dst,
        VkAccelerationStructureNV src,
        @EnumType(VkCopyAccelerationStructureModeKHR.class) int mode
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdCopyAccelerationStructureNV);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                dst.segment(),
                src.segment(),
                mode
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdCopyAccelerationStructureToMemoryKHR.html"><code>vkCmdCopyAccelerationStructureToMemoryKHR</code></a>
    public void cmdCopyAccelerationStructureToMemoryKHR(
        VkCommandBuffer commandBuffer,
        @Pointer VkCopyAccelerationStructureToMemoryInfoKHR pInfo
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdCopyAccelerationStructureToMemoryKHR);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                pInfo.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdCopyBuffer.html"><code>vkCmdCopyBuffer</code></a>
    public void cmdCopyBuffer(
        VkCommandBuffer commandBuffer,
        VkBuffer srcBuffer,
        VkBuffer dstBuffer,
        @Unsigned int regionCount,
        @Pointer IVkBufferCopy pRegions
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdCopyBuffer);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                srcBuffer.segment(),
                dstBuffer.segment(),
                regionCount,
                pRegions.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdCopyBuffer2.html"><code>vkCmdCopyBuffer2</code></a>
    public void cmdCopyBuffer2(
        VkCommandBuffer commandBuffer,
        @Pointer VkCopyBufferInfo2 pCopyBufferInfo
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdCopyBuffer2);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                pCopyBufferInfo.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdCopyBuffer2KHR.html"><code>vkCmdCopyBuffer2KHR</code></a>
    public void cmdCopyBuffer2KHR(
        VkCommandBuffer commandBuffer,
        @Pointer VkCopyBufferInfo2 pCopyBufferInfo
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdCopyBuffer2KHR);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                pCopyBufferInfo.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdCopyBufferToImage.html"><code>vkCmdCopyBufferToImage</code></a>
    public void cmdCopyBufferToImage(
        VkCommandBuffer commandBuffer,
        VkBuffer srcBuffer,
        VkImage dstImage,
        @EnumType(VkImageLayout.class) int dstImageLayout,
        @Unsigned int regionCount,
        @Pointer IVkBufferImageCopy pRegions
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdCopyBufferToImage);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                srcBuffer.segment(),
                dstImage.segment(),
                dstImageLayout,
                regionCount,
                pRegions.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdCopyBufferToImage2.html"><code>vkCmdCopyBufferToImage2</code></a>
    public void cmdCopyBufferToImage2(
        VkCommandBuffer commandBuffer,
        @Pointer VkCopyBufferToImageInfo2 pCopyBufferToImageInfo
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdCopyBufferToImage2);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                pCopyBufferToImageInfo.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdCopyBufferToImage2KHR.html"><code>vkCmdCopyBufferToImage2KHR</code></a>
    public void cmdCopyBufferToImage2KHR(
        VkCommandBuffer commandBuffer,
        @Pointer VkCopyBufferToImageInfo2 pCopyBufferToImageInfo
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdCopyBufferToImage2KHR);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                pCopyBufferToImageInfo.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdCopyImage.html"><code>vkCmdCopyImage</code></a>
    public void cmdCopyImage(
        VkCommandBuffer commandBuffer,
        VkImage srcImage,
        @EnumType(VkImageLayout.class) int srcImageLayout,
        VkImage dstImage,
        @EnumType(VkImageLayout.class) int dstImageLayout,
        @Unsigned int regionCount,
        @Pointer IVkImageCopy pRegions
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdCopyImage);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                srcImage.segment(),
                srcImageLayout,
                dstImage.segment(),
                dstImageLayout,
                regionCount,
                pRegions.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdCopyImage2.html"><code>vkCmdCopyImage2</code></a>
    public void cmdCopyImage2(
        VkCommandBuffer commandBuffer,
        @Pointer VkCopyImageInfo2 pCopyImageInfo
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdCopyImage2);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                pCopyImageInfo.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdCopyImage2KHR.html"><code>vkCmdCopyImage2KHR</code></a>
    public void cmdCopyImage2KHR(
        VkCommandBuffer commandBuffer,
        @Pointer VkCopyImageInfo2 pCopyImageInfo
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdCopyImage2KHR);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                pCopyImageInfo.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdCopyImageToBuffer.html"><code>vkCmdCopyImageToBuffer</code></a>
    public void cmdCopyImageToBuffer(
        VkCommandBuffer commandBuffer,
        VkImage srcImage,
        @EnumType(VkImageLayout.class) int srcImageLayout,
        VkBuffer dstBuffer,
        @Unsigned int regionCount,
        @Pointer IVkBufferImageCopy pRegions
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdCopyImageToBuffer);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                srcImage.segment(),
                srcImageLayout,
                dstBuffer.segment(),
                regionCount,
                pRegions.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdCopyImageToBuffer2.html"><code>vkCmdCopyImageToBuffer2</code></a>
    public void cmdCopyImageToBuffer2(
        VkCommandBuffer commandBuffer,
        @Pointer VkCopyImageToBufferInfo2 pCopyImageToBufferInfo
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdCopyImageToBuffer2);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                pCopyImageToBufferInfo.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdCopyImageToBuffer2KHR.html"><code>vkCmdCopyImageToBuffer2KHR</code></a>
    public void cmdCopyImageToBuffer2KHR(
        VkCommandBuffer commandBuffer,
        @Pointer VkCopyImageToBufferInfo2 pCopyImageToBufferInfo
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdCopyImageToBuffer2KHR);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                pCopyImageToBufferInfo.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdCopyMemoryIndirectNV.html"><code>vkCmdCopyMemoryIndirectNV</code></a>
    public void cmdCopyMemoryIndirectNV(
        VkCommandBuffer commandBuffer,
        @NativeType("VkDeviceAddress") @Unsigned long copyBufferAddress,
        @Unsigned int copyCount,
        @Unsigned int stride
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdCopyMemoryIndirectNV);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                copyBufferAddress,
                copyCount,
                stride
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdCopyMemoryToAccelerationStructureKHR.html"><code>vkCmdCopyMemoryToAccelerationStructureKHR</code></a>
    public void cmdCopyMemoryToAccelerationStructureKHR(
        VkCommandBuffer commandBuffer,
        @Pointer VkCopyMemoryToAccelerationStructureInfoKHR pInfo
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdCopyMemoryToAccelerationStructureKHR);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                pInfo.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdCopyMemoryToImageIndirectNV.html"><code>vkCmdCopyMemoryToImageIndirectNV</code></a>
    public void cmdCopyMemoryToImageIndirectNV(
        VkCommandBuffer commandBuffer,
        @NativeType("VkDeviceAddress") @Unsigned long copyBufferAddress,
        @Unsigned int copyCount,
        @Unsigned int stride,
        VkImage dstImage,
        @EnumType(VkImageLayout.class) int dstImageLayout,
        @Pointer IVkImageSubresourceLayers pImageSubresources
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdCopyMemoryToImageIndirectNV);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                copyBufferAddress,
                copyCount,
                stride,
                dstImage.segment(),
                dstImageLayout,
                pImageSubresources.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdCopyMemoryToMicromapEXT.html"><code>vkCmdCopyMemoryToMicromapEXT</code></a>
    public void cmdCopyMemoryToMicromapEXT(
        VkCommandBuffer commandBuffer,
        @Pointer VkCopyMemoryToMicromapInfoEXT pInfo
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdCopyMemoryToMicromapEXT);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                pInfo.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdCopyMicromapEXT.html"><code>vkCmdCopyMicromapEXT</code></a>
    public void cmdCopyMicromapEXT(
        VkCommandBuffer commandBuffer,
        @Pointer VkCopyMicromapInfoEXT pInfo
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdCopyMicromapEXT);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                pInfo.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdCopyMicromapToMemoryEXT.html"><code>vkCmdCopyMicromapToMemoryEXT</code></a>
    public void cmdCopyMicromapToMemoryEXT(
        VkCommandBuffer commandBuffer,
        @Pointer VkCopyMicromapToMemoryInfoEXT pInfo
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdCopyMicromapToMemoryEXT);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                pInfo.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdCopyQueryPoolResults.html"><code>vkCmdCopyQueryPoolResults</code></a>
    public void cmdCopyQueryPoolResults(
        VkCommandBuffer commandBuffer,
        VkQueryPool queryPool,
        @Unsigned int firstQuery,
        @Unsigned int queryCount,
        VkBuffer dstBuffer,
        @NativeType("VkDeviceSize") @Unsigned long dstOffset,
        @NativeType("VkDeviceSize") @Unsigned long stride,
        @EnumType(VkQueryResultFlags.class) int flags
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdCopyQueryPoolResults);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                queryPool.segment(),
                firstQuery,
                queryCount,
                dstBuffer.segment(),
                dstOffset,
                stride,
                flags
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdCuLaunchKernelNVX.html"><code>vkCmdCuLaunchKernelNVX</code></a>
    public void cmdCuLaunchKernelNVX(
        VkCommandBuffer commandBuffer,
        @Pointer VkCuLaunchInfoNVX pLaunchInfo
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdCuLaunchKernelNVX);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                pLaunchInfo.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdCudaLaunchKernelNV.html"><code>vkCmdCudaLaunchKernelNV</code></a>
    public void cmdCudaLaunchKernelNV(
        VkCommandBuffer commandBuffer,
        @Pointer VkCudaLaunchInfoNV pLaunchInfo
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdCudaLaunchKernelNV);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                pLaunchInfo.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdDebugMarkerBeginEXT.html"><code>vkCmdDebugMarkerBeginEXT</code></a>
    public void cmdDebugMarkerBeginEXT(
        VkCommandBuffer commandBuffer,
        @Pointer VkDebugMarkerMarkerInfoEXT pMarkerInfo
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdDebugMarkerBeginEXT);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                pMarkerInfo.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdDebugMarkerEndEXT.html"><code>vkCmdDebugMarkerEndEXT</code></a>
    public void cmdDebugMarkerEndEXT(
        VkCommandBuffer commandBuffer
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdDebugMarkerEndEXT);
        try {
            hFunction.invokeExact(
                commandBuffer.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdDebugMarkerInsertEXT.html"><code>vkCmdDebugMarkerInsertEXT</code></a>
    public void cmdDebugMarkerInsertEXT(
        VkCommandBuffer commandBuffer,
        @Pointer VkDebugMarkerMarkerInfoEXT pMarkerInfo
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdDebugMarkerInsertEXT);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                pMarkerInfo.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdDecodeVideoKHR.html"><code>vkCmdDecodeVideoKHR</code></a>
    public void cmdDecodeVideoKHR(
        VkCommandBuffer commandBuffer,
        @Pointer VkVideoDecodeInfoKHR pDecodeInfo
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdDecodeVideoKHR);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                pDecodeInfo.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdDecompressMemoryIndirectCountNV.html"><code>vkCmdDecompressMemoryIndirectCountNV</code></a>
    public void cmdDecompressMemoryIndirectCountNV(
        VkCommandBuffer commandBuffer,
        @NativeType("VkDeviceAddress") @Unsigned long indirectCommandsAddress,
        @NativeType("VkDeviceAddress") @Unsigned long indirectCommandsCountAddress,
        @Unsigned int stride
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdDecompressMemoryIndirectCountNV);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                indirectCommandsAddress,
                indirectCommandsCountAddress,
                stride
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdDecompressMemoryNV.html"><code>vkCmdDecompressMemoryNV</code></a>
    public void cmdDecompressMemoryNV(
        VkCommandBuffer commandBuffer,
        @Unsigned int decompressRegionCount,
        @Pointer IVkDecompressMemoryRegionNV pDecompressMemoryRegions
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdDecompressMemoryNV);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                decompressRegionCount,
                pDecompressMemoryRegions.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdDispatch.html"><code>vkCmdDispatch</code></a>
    public void cmdDispatch(
        VkCommandBuffer commandBuffer,
        @Unsigned int groupCountX,
        @Unsigned int groupCountY,
        @Unsigned int groupCountZ
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdDispatch);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                groupCountX,
                groupCountY,
                groupCountZ
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdDispatchBase.html"><code>vkCmdDispatchBase</code></a>
    public void cmdDispatchBase(
        VkCommandBuffer commandBuffer,
        @Unsigned int baseGroupX,
        @Unsigned int baseGroupY,
        @Unsigned int baseGroupZ,
        @Unsigned int groupCountX,
        @Unsigned int groupCountY,
        @Unsigned int groupCountZ
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdDispatchBase);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                baseGroupX,
                baseGroupY,
                baseGroupZ,
                groupCountX,
                groupCountY,
                groupCountZ
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdDispatchBaseKHR.html"><code>vkCmdDispatchBaseKHR</code></a>
    public void cmdDispatchBaseKHR(
        VkCommandBuffer commandBuffer,
        @Unsigned int baseGroupX,
        @Unsigned int baseGroupY,
        @Unsigned int baseGroupZ,
        @Unsigned int groupCountX,
        @Unsigned int groupCountY,
        @Unsigned int groupCountZ
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdDispatchBaseKHR);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                baseGroupX,
                baseGroupY,
                baseGroupZ,
                groupCountX,
                groupCountY,
                groupCountZ
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdDispatchGraphAMDX.html"><code>vkCmdDispatchGraphAMDX</code></a>
    public void cmdDispatchGraphAMDX(
        VkCommandBuffer commandBuffer,
        @NativeType("VkDeviceAddress") @Unsigned long scratch,
        @NativeType("VkDeviceSize") @Unsigned long scratchSize,
        @Pointer VkDispatchGraphCountInfoAMDX pCountInfo
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdDispatchGraphAMDX);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                scratch,
                scratchSize,
                pCountInfo.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdDispatchGraphIndirectAMDX.html"><code>vkCmdDispatchGraphIndirectAMDX</code></a>
    public void cmdDispatchGraphIndirectAMDX(
        VkCommandBuffer commandBuffer,
        @NativeType("VkDeviceAddress") @Unsigned long scratch,
        @NativeType("VkDeviceSize") @Unsigned long scratchSize,
        @Pointer VkDispatchGraphCountInfoAMDX pCountInfo
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdDispatchGraphIndirectAMDX);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                scratch,
                scratchSize,
                pCountInfo.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdDispatchGraphIndirectCountAMDX.html"><code>vkCmdDispatchGraphIndirectCountAMDX</code></a>
    public void cmdDispatchGraphIndirectCountAMDX(
        VkCommandBuffer commandBuffer,
        @NativeType("VkDeviceAddress") @Unsigned long scratch,
        @NativeType("VkDeviceSize") @Unsigned long scratchSize,
        @NativeType("VkDeviceAddress") @Unsigned long countInfo
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdDispatchGraphIndirectCountAMDX);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                scratch,
                scratchSize,
                countInfo
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdDispatchIndirect.html"><code>vkCmdDispatchIndirect</code></a>
    public void cmdDispatchIndirect(
        VkCommandBuffer commandBuffer,
        VkBuffer buffer,
        @NativeType("VkDeviceSize") @Unsigned long offset
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdDispatchIndirect);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                buffer.segment(),
                offset
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdDispatchTileQCOM.html"><code>vkCmdDispatchTileQCOM</code></a>
    public void cmdDispatchTileQCOM(
        VkCommandBuffer commandBuffer
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdDispatchTileQCOM);
        try {
            hFunction.invokeExact(
                commandBuffer.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdDraw.html"><code>vkCmdDraw</code></a>
    public void cmdDraw(
        VkCommandBuffer commandBuffer,
        @Unsigned int vertexCount,
        @Unsigned int instanceCount,
        @Unsigned int firstVertex,
        @Unsigned int firstInstance
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdDraw);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                vertexCount,
                instanceCount,
                firstVertex,
                firstInstance
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdDrawClusterHUAWEI.html"><code>vkCmdDrawClusterHUAWEI</code></a>
    public void cmdDrawClusterHUAWEI(
        VkCommandBuffer commandBuffer,
        @Unsigned int groupCountX,
        @Unsigned int groupCountY,
        @Unsigned int groupCountZ
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdDrawClusterHUAWEI);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                groupCountX,
                groupCountY,
                groupCountZ
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdDrawClusterIndirectHUAWEI.html"><code>vkCmdDrawClusterIndirectHUAWEI</code></a>
    public void cmdDrawClusterIndirectHUAWEI(
        VkCommandBuffer commandBuffer,
        VkBuffer buffer,
        @NativeType("VkDeviceSize") @Unsigned long offset
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdDrawClusterIndirectHUAWEI);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                buffer.segment(),
                offset
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdDrawIndexed.html"><code>vkCmdDrawIndexed</code></a>
    public void cmdDrawIndexed(
        VkCommandBuffer commandBuffer,
        @Unsigned int indexCount,
        @Unsigned int instanceCount,
        @Unsigned int firstIndex,
        int vertexOffset,
        @Unsigned int firstInstance
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdDrawIndexed);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                indexCount,
                instanceCount,
                firstIndex,
                vertexOffset,
                firstInstance
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdDrawIndexedIndirect.html"><code>vkCmdDrawIndexedIndirect</code></a>
    public void cmdDrawIndexedIndirect(
        VkCommandBuffer commandBuffer,
        VkBuffer buffer,
        @NativeType("VkDeviceSize") @Unsigned long offset,
        @Unsigned int drawCount,
        @Unsigned int stride
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdDrawIndexedIndirect);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                buffer.segment(),
                offset,
                drawCount,
                stride
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdDrawIndexedIndirectCount.html"><code>vkCmdDrawIndexedIndirectCount</code></a>
    public void cmdDrawIndexedIndirectCount(
        VkCommandBuffer commandBuffer,
        VkBuffer buffer,
        @NativeType("VkDeviceSize") @Unsigned long offset,
        VkBuffer countBuffer,
        @NativeType("VkDeviceSize") @Unsigned long countBufferOffset,
        @Unsigned int maxDrawCount,
        @Unsigned int stride
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdDrawIndexedIndirectCount);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                buffer.segment(),
                offset,
                countBuffer.segment(),
                countBufferOffset,
                maxDrawCount,
                stride
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdDrawIndexedIndirectCountAMD.html"><code>vkCmdDrawIndexedIndirectCountAMD</code></a>
    public void cmdDrawIndexedIndirectCountAMD(
        VkCommandBuffer commandBuffer,
        VkBuffer buffer,
        @NativeType("VkDeviceSize") @Unsigned long offset,
        VkBuffer countBuffer,
        @NativeType("VkDeviceSize") @Unsigned long countBufferOffset,
        @Unsigned int maxDrawCount,
        @Unsigned int stride
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdDrawIndexedIndirectCountAMD);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                buffer.segment(),
                offset,
                countBuffer.segment(),
                countBufferOffset,
                maxDrawCount,
                stride
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdDrawIndexedIndirectCountKHR.html"><code>vkCmdDrawIndexedIndirectCountKHR</code></a>
    public void cmdDrawIndexedIndirectCountKHR(
        VkCommandBuffer commandBuffer,
        VkBuffer buffer,
        @NativeType("VkDeviceSize") @Unsigned long offset,
        VkBuffer countBuffer,
        @NativeType("VkDeviceSize") @Unsigned long countBufferOffset,
        @Unsigned int maxDrawCount,
        @Unsigned int stride
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdDrawIndexedIndirectCountKHR);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                buffer.segment(),
                offset,
                countBuffer.segment(),
                countBufferOffset,
                maxDrawCount,
                stride
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdDrawIndirect.html"><code>vkCmdDrawIndirect</code></a>
    public void cmdDrawIndirect(
        VkCommandBuffer commandBuffer,
        VkBuffer buffer,
        @NativeType("VkDeviceSize") @Unsigned long offset,
        @Unsigned int drawCount,
        @Unsigned int stride
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdDrawIndirect);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                buffer.segment(),
                offset,
                drawCount,
                stride
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdDrawIndirectByteCountEXT.html"><code>vkCmdDrawIndirectByteCountEXT</code></a>
    public void cmdDrawIndirectByteCountEXT(
        VkCommandBuffer commandBuffer,
        @Unsigned int instanceCount,
        @Unsigned int firstInstance,
        VkBuffer counterBuffer,
        @NativeType("VkDeviceSize") @Unsigned long counterBufferOffset,
        @Unsigned int counterOffset,
        @Unsigned int vertexStride
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdDrawIndirectByteCountEXT);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                instanceCount,
                firstInstance,
                counterBuffer.segment(),
                counterBufferOffset,
                counterOffset,
                vertexStride
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdDrawIndirectCount.html"><code>vkCmdDrawIndirectCount</code></a>
    public void cmdDrawIndirectCount(
        VkCommandBuffer commandBuffer,
        VkBuffer buffer,
        @NativeType("VkDeviceSize") @Unsigned long offset,
        VkBuffer countBuffer,
        @NativeType("VkDeviceSize") @Unsigned long countBufferOffset,
        @Unsigned int maxDrawCount,
        @Unsigned int stride
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdDrawIndirectCount);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                buffer.segment(),
                offset,
                countBuffer.segment(),
                countBufferOffset,
                maxDrawCount,
                stride
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdDrawIndirectCountAMD.html"><code>vkCmdDrawIndirectCountAMD</code></a>
    public void cmdDrawIndirectCountAMD(
        VkCommandBuffer commandBuffer,
        VkBuffer buffer,
        @NativeType("VkDeviceSize") @Unsigned long offset,
        VkBuffer countBuffer,
        @NativeType("VkDeviceSize") @Unsigned long countBufferOffset,
        @Unsigned int maxDrawCount,
        @Unsigned int stride
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdDrawIndirectCountAMD);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                buffer.segment(),
                offset,
                countBuffer.segment(),
                countBufferOffset,
                maxDrawCount,
                stride
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdDrawIndirectCountKHR.html"><code>vkCmdDrawIndirectCountKHR</code></a>
    public void cmdDrawIndirectCountKHR(
        VkCommandBuffer commandBuffer,
        VkBuffer buffer,
        @NativeType("VkDeviceSize") @Unsigned long offset,
        VkBuffer countBuffer,
        @NativeType("VkDeviceSize") @Unsigned long countBufferOffset,
        @Unsigned int maxDrawCount,
        @Unsigned int stride
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdDrawIndirectCountKHR);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                buffer.segment(),
                offset,
                countBuffer.segment(),
                countBufferOffset,
                maxDrawCount,
                stride
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdDrawMeshTasksEXT.html"><code>vkCmdDrawMeshTasksEXT</code></a>
    public void cmdDrawMeshTasksEXT(
        VkCommandBuffer commandBuffer,
        @Unsigned int groupCountX,
        @Unsigned int groupCountY,
        @Unsigned int groupCountZ
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdDrawMeshTasksEXT);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                groupCountX,
                groupCountY,
                groupCountZ
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdDrawMeshTasksIndirectCountEXT.html"><code>vkCmdDrawMeshTasksIndirectCountEXT</code></a>
    public void cmdDrawMeshTasksIndirectCountEXT(
        VkCommandBuffer commandBuffer,
        VkBuffer buffer,
        @NativeType("VkDeviceSize") @Unsigned long offset,
        VkBuffer countBuffer,
        @NativeType("VkDeviceSize") @Unsigned long countBufferOffset,
        @Unsigned int maxDrawCount,
        @Unsigned int stride
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdDrawMeshTasksIndirectCountEXT);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                buffer.segment(),
                offset,
                countBuffer.segment(),
                countBufferOffset,
                maxDrawCount,
                stride
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdDrawMeshTasksIndirectCountNV.html"><code>vkCmdDrawMeshTasksIndirectCountNV</code></a>
    public void cmdDrawMeshTasksIndirectCountNV(
        VkCommandBuffer commandBuffer,
        VkBuffer buffer,
        @NativeType("VkDeviceSize") @Unsigned long offset,
        VkBuffer countBuffer,
        @NativeType("VkDeviceSize") @Unsigned long countBufferOffset,
        @Unsigned int maxDrawCount,
        @Unsigned int stride
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdDrawMeshTasksIndirectCountNV);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                buffer.segment(),
                offset,
                countBuffer.segment(),
                countBufferOffset,
                maxDrawCount,
                stride
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdDrawMeshTasksIndirectEXT.html"><code>vkCmdDrawMeshTasksIndirectEXT</code></a>
    public void cmdDrawMeshTasksIndirectEXT(
        VkCommandBuffer commandBuffer,
        VkBuffer buffer,
        @NativeType("VkDeviceSize") @Unsigned long offset,
        @Unsigned int drawCount,
        @Unsigned int stride
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdDrawMeshTasksIndirectEXT);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                buffer.segment(),
                offset,
                drawCount,
                stride
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdDrawMeshTasksIndirectNV.html"><code>vkCmdDrawMeshTasksIndirectNV</code></a>
    public void cmdDrawMeshTasksIndirectNV(
        VkCommandBuffer commandBuffer,
        VkBuffer buffer,
        @NativeType("VkDeviceSize") @Unsigned long offset,
        @Unsigned int drawCount,
        @Unsigned int stride
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdDrawMeshTasksIndirectNV);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                buffer.segment(),
                offset,
                drawCount,
                stride
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdDrawMeshTasksNV.html"><code>vkCmdDrawMeshTasksNV</code></a>
    public void cmdDrawMeshTasksNV(
        VkCommandBuffer commandBuffer,
        @Unsigned int taskCount,
        @Unsigned int firstTask
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdDrawMeshTasksNV);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                taskCount,
                firstTask
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdDrawMultiEXT.html"><code>vkCmdDrawMultiEXT</code></a>
    public void cmdDrawMultiEXT(
        VkCommandBuffer commandBuffer,
        @Unsigned int drawCount,
        @Nullable @Pointer IVkMultiDrawInfoEXT pVertexInfo,
        @Unsigned int instanceCount,
        @Unsigned int firstInstance,
        @Unsigned int stride
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdDrawMultiEXT);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                drawCount,
                (MemorySegment) (pVertexInfo != null ? pVertexInfo.segment() : MemorySegment.NULL),
                instanceCount,
                firstInstance,
                stride
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdDrawMultiIndexedEXT.html"><code>vkCmdDrawMultiIndexedEXT</code></a>
    public void cmdDrawMultiIndexedEXT(
        VkCommandBuffer commandBuffer,
        @Unsigned int drawCount,
        @Nullable @Pointer IVkMultiDrawIndexedInfoEXT pIndexInfo,
        @Unsigned int instanceCount,
        @Unsigned int firstInstance,
        @Unsigned int stride,
        @Nullable IntPtr pVertexOffset
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdDrawMultiIndexedEXT);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                drawCount,
                (MemorySegment) (pIndexInfo != null ? pIndexInfo.segment() : MemorySegment.NULL),
                instanceCount,
                firstInstance,
                stride,
                (MemorySegment) (pVertexOffset != null ? pVertexOffset.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdEncodeVideoKHR.html"><code>vkCmdEncodeVideoKHR</code></a>
    public void cmdEncodeVideoKHR(
        VkCommandBuffer commandBuffer,
        @Pointer VkVideoEncodeInfoKHR pEncodeInfo
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdEncodeVideoKHR);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                pEncodeInfo.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdEndConditionalRenderingEXT.html"><code>vkCmdEndConditionalRenderingEXT</code></a>
    public void cmdEndConditionalRenderingEXT(
        VkCommandBuffer commandBuffer
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdEndConditionalRenderingEXT);
        try {
            hFunction.invokeExact(
                commandBuffer.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdEndPerTileExecutionQCOM.html"><code>vkCmdEndPerTileExecutionQCOM</code></a>
    public void cmdEndPerTileExecutionQCOM(
        VkCommandBuffer commandBuffer,
        @Pointer VkPerTileEndInfoQCOM pPerTileEndInfo
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdEndPerTileExecutionQCOM);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                pPerTileEndInfo.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdEndQuery.html"><code>vkCmdEndQuery</code></a>
    public void cmdEndQuery(
        VkCommandBuffer commandBuffer,
        VkQueryPool queryPool,
        @Unsigned int query
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdEndQuery);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                queryPool.segment(),
                query
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdEndQueryIndexedEXT.html"><code>vkCmdEndQueryIndexedEXT</code></a>
    public void cmdEndQueryIndexedEXT(
        VkCommandBuffer commandBuffer,
        VkQueryPool queryPool,
        @Unsigned int query,
        @Unsigned int index
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdEndQueryIndexedEXT);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                queryPool.segment(),
                query,
                index
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdEndRenderPass.html"><code>vkCmdEndRenderPass</code></a>
    public void cmdEndRenderPass(
        VkCommandBuffer commandBuffer
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdEndRenderPass);
        try {
            hFunction.invokeExact(
                commandBuffer.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdEndRenderPass2.html"><code>vkCmdEndRenderPass2</code></a>
    public void cmdEndRenderPass2(
        VkCommandBuffer commandBuffer,
        @Pointer VkSubpassEndInfo pSubpassEndInfo
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdEndRenderPass2);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                pSubpassEndInfo.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdEndRenderPass2KHR.html"><code>vkCmdEndRenderPass2KHR</code></a>
    public void cmdEndRenderPass2KHR(
        VkCommandBuffer commandBuffer,
        @Pointer VkSubpassEndInfo pSubpassEndInfo
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdEndRenderPass2KHR);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                pSubpassEndInfo.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdEndRendering.html"><code>vkCmdEndRendering</code></a>
    public void cmdEndRendering(
        VkCommandBuffer commandBuffer
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdEndRendering);
        try {
            hFunction.invokeExact(
                commandBuffer.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdEndRendering2EXT.html"><code>vkCmdEndRendering2EXT</code></a>
    public void cmdEndRendering2EXT(
        VkCommandBuffer commandBuffer,
        @Nullable @Pointer VkRenderingEndInfoEXT pRenderingEndInfo
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdEndRendering2EXT);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                (MemorySegment) (pRenderingEndInfo != null ? pRenderingEndInfo.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdEndRenderingKHR.html"><code>vkCmdEndRenderingKHR</code></a>
    public void cmdEndRenderingKHR(
        VkCommandBuffer commandBuffer
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdEndRenderingKHR);
        try {
            hFunction.invokeExact(
                commandBuffer.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdEndTransformFeedbackEXT.html"><code>vkCmdEndTransformFeedbackEXT</code></a>
    public void cmdEndTransformFeedbackEXT(
        VkCommandBuffer commandBuffer,
        @Unsigned int firstCounterBuffer,
        @Unsigned int counterBufferCount,
        @Nullable @Pointer VkBuffer.Ptr pCounterBuffers,
        @Nullable @Pointer(comment="VkDeviceSize") @Unsigned LongPtr pCounterBufferOffsets
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdEndTransformFeedbackEXT);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                firstCounterBuffer,
                counterBufferCount,
                (MemorySegment) (pCounterBuffers != null ? pCounterBuffers.segment() : MemorySegment.NULL),
                (MemorySegment) (pCounterBufferOffsets != null ? pCounterBufferOffsets.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdEndVideoCodingKHR.html"><code>vkCmdEndVideoCodingKHR</code></a>
    public void cmdEndVideoCodingKHR(
        VkCommandBuffer commandBuffer,
        @Pointer VkVideoEndCodingInfoKHR pEndCodingInfo
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdEndVideoCodingKHR);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                pEndCodingInfo.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdExecuteCommands.html"><code>vkCmdExecuteCommands</code></a>
    public void cmdExecuteCommands(
        VkCommandBuffer commandBuffer,
        @Unsigned int commandBufferCount,
        @Pointer VkCommandBuffer.Ptr pCommandBuffers
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdExecuteCommands);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                commandBufferCount,
                pCommandBuffers.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdExecuteGeneratedCommandsEXT.html"><code>vkCmdExecuteGeneratedCommandsEXT</code></a>
    public void cmdExecuteGeneratedCommandsEXT(
        VkCommandBuffer commandBuffer,
        @NativeType("VkBool32") @Unsigned int isPreprocessed,
        @Pointer VkGeneratedCommandsInfoEXT pGeneratedCommandsInfo
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdExecuteGeneratedCommandsEXT);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                isPreprocessed,
                pGeneratedCommandsInfo.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdExecuteGeneratedCommandsNV.html"><code>vkCmdExecuteGeneratedCommandsNV</code></a>
    public void cmdExecuteGeneratedCommandsNV(
        VkCommandBuffer commandBuffer,
        @NativeType("VkBool32") @Unsigned int isPreprocessed,
        @Pointer VkGeneratedCommandsInfoNV pGeneratedCommandsInfo
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdExecuteGeneratedCommandsNV);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                isPreprocessed,
                pGeneratedCommandsInfo.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdFillBuffer.html"><code>vkCmdFillBuffer</code></a>
    public void cmdFillBuffer(
        VkCommandBuffer commandBuffer,
        VkBuffer dstBuffer,
        @NativeType("VkDeviceSize") @Unsigned long dstOffset,
        @NativeType("VkDeviceSize") @Unsigned long size,
        @Unsigned int data
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdFillBuffer);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                dstBuffer.segment(),
                dstOffset,
                size,
                data
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdInitializeGraphScratchMemoryAMDX.html"><code>vkCmdInitializeGraphScratchMemoryAMDX</code></a>
    public void cmdInitializeGraphScratchMemoryAMDX(
        VkCommandBuffer commandBuffer,
        VkPipeline executionGraph,
        @NativeType("VkDeviceAddress") @Unsigned long scratch,
        @NativeType("VkDeviceSize") @Unsigned long scratchSize
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdInitializeGraphScratchMemoryAMDX);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                executionGraph.segment(),
                scratch,
                scratchSize
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdNextSubpass.html"><code>vkCmdNextSubpass</code></a>
    public void cmdNextSubpass(
        VkCommandBuffer commandBuffer,
        @EnumType(VkSubpassContents.class) int contents
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdNextSubpass);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                contents
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdNextSubpass2.html"><code>vkCmdNextSubpass2</code></a>
    public void cmdNextSubpass2(
        VkCommandBuffer commandBuffer,
        @Pointer VkSubpassBeginInfo pSubpassBeginInfo,
        @Pointer VkSubpassEndInfo pSubpassEndInfo
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdNextSubpass2);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                pSubpassBeginInfo.segment(),
                pSubpassEndInfo.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdNextSubpass2KHR.html"><code>vkCmdNextSubpass2KHR</code></a>
    public void cmdNextSubpass2KHR(
        VkCommandBuffer commandBuffer,
        @Pointer VkSubpassBeginInfo pSubpassBeginInfo,
        @Pointer VkSubpassEndInfo pSubpassEndInfo
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdNextSubpass2KHR);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                pSubpassBeginInfo.segment(),
                pSubpassEndInfo.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdOpticalFlowExecuteNV.html"><code>vkCmdOpticalFlowExecuteNV</code></a>
    public void cmdOpticalFlowExecuteNV(
        VkCommandBuffer commandBuffer,
        VkOpticalFlowSessionNV session,
        @Pointer VkOpticalFlowExecuteInfoNV pExecuteInfo
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdOpticalFlowExecuteNV);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                session.segment(),
                pExecuteInfo.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdPipelineBarrier.html"><code>vkCmdPipelineBarrier</code></a>
    public void cmdPipelineBarrier(
        VkCommandBuffer commandBuffer,
        @EnumType(VkPipelineStageFlags.class) int srcStageMask,
        @EnumType(VkPipelineStageFlags.class) int dstStageMask,
        @EnumType(VkDependencyFlags.class) int dependencyFlags,
        @Unsigned int memoryBarrierCount,
        @Nullable @Pointer IVkMemoryBarrier pMemoryBarriers,
        @Unsigned int bufferMemoryBarrierCount,
        @Nullable @Pointer IVkBufferMemoryBarrier pBufferMemoryBarriers,
        @Unsigned int imageMemoryBarrierCount,
        @Nullable @Pointer IVkImageMemoryBarrier pImageMemoryBarriers
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdPipelineBarrier);
        try {
            hFunction.invokeExact(
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
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdPipelineBarrier2.html"><code>vkCmdPipelineBarrier2</code></a>
    public void cmdPipelineBarrier2(
        VkCommandBuffer commandBuffer,
        @Pointer VkDependencyInfo pDependencyInfo
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdPipelineBarrier2);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                pDependencyInfo.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdPipelineBarrier2KHR.html"><code>vkCmdPipelineBarrier2KHR</code></a>
    public void cmdPipelineBarrier2KHR(
        VkCommandBuffer commandBuffer,
        @Pointer VkDependencyInfo pDependencyInfo
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdPipelineBarrier2KHR);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                pDependencyInfo.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdPreprocessGeneratedCommandsEXT.html"><code>vkCmdPreprocessGeneratedCommandsEXT</code></a>
    public void cmdPreprocessGeneratedCommandsEXT(
        VkCommandBuffer commandBuffer,
        @Pointer VkGeneratedCommandsInfoEXT pGeneratedCommandsInfo,
        VkCommandBuffer stateCommandBuffer
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdPreprocessGeneratedCommandsEXT);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                pGeneratedCommandsInfo.segment(),
                stateCommandBuffer.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdPreprocessGeneratedCommandsNV.html"><code>vkCmdPreprocessGeneratedCommandsNV</code></a>
    public void cmdPreprocessGeneratedCommandsNV(
        VkCommandBuffer commandBuffer,
        @Pointer VkGeneratedCommandsInfoNV pGeneratedCommandsInfo
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdPreprocessGeneratedCommandsNV);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                pGeneratedCommandsInfo.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdPushConstants.html"><code>vkCmdPushConstants</code></a>
    public void cmdPushConstants(
        VkCommandBuffer commandBuffer,
        VkPipelineLayout layout,
        @EnumType(VkShaderStageFlags.class) int stageFlags,
        @Unsigned int offset,
        @Unsigned int size,
        @Pointer(comment="void*") @NotNull MemorySegment pValues
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdPushConstants);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                layout.segment(),
                stageFlags,
                offset,
                size,
                pValues
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdPushConstants2.html"><code>vkCmdPushConstants2</code></a>
    public void cmdPushConstants2(
        VkCommandBuffer commandBuffer,
        @Pointer VkPushConstantsInfo pPushConstantsInfo
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdPushConstants2);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                pPushConstantsInfo.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdPushConstants2KHR.html"><code>vkCmdPushConstants2KHR</code></a>
    public void cmdPushConstants2KHR(
        VkCommandBuffer commandBuffer,
        @Pointer VkPushConstantsInfo pPushConstantsInfo
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdPushConstants2KHR);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                pPushConstantsInfo.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdPushDescriptorSet.html"><code>vkCmdPushDescriptorSet</code></a>
    public void cmdPushDescriptorSet(
        VkCommandBuffer commandBuffer,
        @EnumType(VkPipelineBindPoint.class) int pipelineBindPoint,
        VkPipelineLayout layout,
        @Unsigned int set,
        @Unsigned int descriptorWriteCount,
        @Pointer IVkWriteDescriptorSet pDescriptorWrites
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdPushDescriptorSet);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                pipelineBindPoint,
                layout.segment(),
                set,
                descriptorWriteCount,
                pDescriptorWrites.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdPushDescriptorSet2.html"><code>vkCmdPushDescriptorSet2</code></a>
    public void cmdPushDescriptorSet2(
        VkCommandBuffer commandBuffer,
        @Pointer VkPushDescriptorSetInfo pPushDescriptorSetInfo
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdPushDescriptorSet2);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                pPushDescriptorSetInfo.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdPushDescriptorSet2KHR.html"><code>vkCmdPushDescriptorSet2KHR</code></a>
    public void cmdPushDescriptorSet2KHR(
        VkCommandBuffer commandBuffer,
        @Pointer VkPushDescriptorSetInfo pPushDescriptorSetInfo
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdPushDescriptorSet2KHR);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                pPushDescriptorSetInfo.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdPushDescriptorSetKHR.html"><code>vkCmdPushDescriptorSetKHR</code></a>
    public void cmdPushDescriptorSetKHR(
        VkCommandBuffer commandBuffer,
        @EnumType(VkPipelineBindPoint.class) int pipelineBindPoint,
        VkPipelineLayout layout,
        @Unsigned int set,
        @Unsigned int descriptorWriteCount,
        @Pointer IVkWriteDescriptorSet pDescriptorWrites
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdPushDescriptorSetKHR);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                pipelineBindPoint,
                layout.segment(),
                set,
                descriptorWriteCount,
                pDescriptorWrites.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdPushDescriptorSetWithTemplate.html"><code>vkCmdPushDescriptorSetWithTemplate</code></a>
    public void cmdPushDescriptorSetWithTemplate(
        VkCommandBuffer commandBuffer,
        VkDescriptorUpdateTemplate descriptorUpdateTemplate,
        VkPipelineLayout layout,
        @Unsigned int set,
        @Pointer(comment="void*") @NotNull MemorySegment pData
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdPushDescriptorSetWithTemplate);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                descriptorUpdateTemplate.segment(),
                layout.segment(),
                set,
                pData
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdPushDescriptorSetWithTemplate2.html"><code>vkCmdPushDescriptorSetWithTemplate2</code></a>
    public void cmdPushDescriptorSetWithTemplate2(
        VkCommandBuffer commandBuffer,
        @Pointer VkPushDescriptorSetWithTemplateInfo pPushDescriptorSetWithTemplateInfo
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdPushDescriptorSetWithTemplate2);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                pPushDescriptorSetWithTemplateInfo.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdPushDescriptorSetWithTemplate2KHR.html"><code>vkCmdPushDescriptorSetWithTemplate2KHR</code></a>
    public void cmdPushDescriptorSetWithTemplate2KHR(
        VkCommandBuffer commandBuffer,
        @Pointer VkPushDescriptorSetWithTemplateInfo pPushDescriptorSetWithTemplateInfo
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdPushDescriptorSetWithTemplate2KHR);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                pPushDescriptorSetWithTemplateInfo.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdPushDescriptorSetWithTemplateKHR.html"><code>vkCmdPushDescriptorSetWithTemplateKHR</code></a>
    public void cmdPushDescriptorSetWithTemplateKHR(
        VkCommandBuffer commandBuffer,
        VkDescriptorUpdateTemplate descriptorUpdateTemplate,
        VkPipelineLayout layout,
        @Unsigned int set,
        @Pointer(comment="void*") @NotNull MemorySegment pData
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdPushDescriptorSetWithTemplateKHR);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                descriptorUpdateTemplate.segment(),
                layout.segment(),
                set,
                pData
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdRefreshObjectsKHR.html"><code>vkCmdRefreshObjectsKHR</code></a>
    public void cmdRefreshObjectsKHR(
        VkCommandBuffer commandBuffer,
        @Pointer VkRefreshObjectListKHR pRefreshObjects
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdRefreshObjectsKHR);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                pRefreshObjects.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdResetEvent.html"><code>vkCmdResetEvent</code></a>
    public void cmdResetEvent(
        VkCommandBuffer commandBuffer,
        VkEvent event,
        @EnumType(VkPipelineStageFlags.class) int stageMask
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdResetEvent);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                event.segment(),
                stageMask
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdResetEvent2.html"><code>vkCmdResetEvent2</code></a>
    public void cmdResetEvent2(
        VkCommandBuffer commandBuffer,
        VkEvent event,
        @EnumType(VkPipelineStageFlags2.class) long stageMask
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdResetEvent2);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                event.segment(),
                stageMask
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdResetEvent2KHR.html"><code>vkCmdResetEvent2KHR</code></a>
    public void cmdResetEvent2KHR(
        VkCommandBuffer commandBuffer,
        VkEvent event,
        @EnumType(VkPipelineStageFlags2.class) long stageMask
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdResetEvent2KHR);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                event.segment(),
                stageMask
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdResetQueryPool.html"><code>vkCmdResetQueryPool</code></a>
    public void cmdResetQueryPool(
        VkCommandBuffer commandBuffer,
        VkQueryPool queryPool,
        @Unsigned int firstQuery,
        @Unsigned int queryCount
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdResetQueryPool);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                queryPool.segment(),
                firstQuery,
                queryCount
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdResolveImage.html"><code>vkCmdResolveImage</code></a>
    public void cmdResolveImage(
        VkCommandBuffer commandBuffer,
        VkImage srcImage,
        @EnumType(VkImageLayout.class) int srcImageLayout,
        VkImage dstImage,
        @EnumType(VkImageLayout.class) int dstImageLayout,
        @Unsigned int regionCount,
        @Pointer IVkImageResolve pRegions
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdResolveImage);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                srcImage.segment(),
                srcImageLayout,
                dstImage.segment(),
                dstImageLayout,
                regionCount,
                pRegions.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdResolveImage2.html"><code>vkCmdResolveImage2</code></a>
    public void cmdResolveImage2(
        VkCommandBuffer commandBuffer,
        @Pointer VkResolveImageInfo2 pResolveImageInfo
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdResolveImage2);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                pResolveImageInfo.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdResolveImage2KHR.html"><code>vkCmdResolveImage2KHR</code></a>
    public void cmdResolveImage2KHR(
        VkCommandBuffer commandBuffer,
        @Pointer VkResolveImageInfo2 pResolveImageInfo
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdResolveImage2KHR);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                pResolveImageInfo.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdSetAlphaToCoverageEnableEXT.html"><code>vkCmdSetAlphaToCoverageEnableEXT</code></a>
    public void cmdSetAlphaToCoverageEnableEXT(
        VkCommandBuffer commandBuffer,
        @NativeType("VkBool32") @Unsigned int alphaToCoverageEnable
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdSetAlphaToCoverageEnableEXT);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                alphaToCoverageEnable
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdSetAlphaToOneEnableEXT.html"><code>vkCmdSetAlphaToOneEnableEXT</code></a>
    public void cmdSetAlphaToOneEnableEXT(
        VkCommandBuffer commandBuffer,
        @NativeType("VkBool32") @Unsigned int alphaToOneEnable
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdSetAlphaToOneEnableEXT);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                alphaToOneEnable
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdSetAttachmentFeedbackLoopEnableEXT.html"><code>vkCmdSetAttachmentFeedbackLoopEnableEXT</code></a>
    public void cmdSetAttachmentFeedbackLoopEnableEXT(
        VkCommandBuffer commandBuffer,
        @EnumType(VkImageAspectFlags.class) int aspectMask
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdSetAttachmentFeedbackLoopEnableEXT);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                aspectMask
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdSetBlendConstants.html"><code>vkCmdSetBlendConstants</code></a>
    public void cmdSetBlendConstants(
        VkCommandBuffer commandBuffer,
        float blendConstants
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdSetBlendConstants);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                blendConstants
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdSetCheckpointNV.html"><code>vkCmdSetCheckpointNV</code></a>
    public void cmdSetCheckpointNV(
        VkCommandBuffer commandBuffer,
        @Pointer(comment="void*") @NotNull MemorySegment pCheckpointMarker
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdSetCheckpointNV);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                pCheckpointMarker
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdSetCoarseSampleOrderNV.html"><code>vkCmdSetCoarseSampleOrderNV</code></a>
    public void cmdSetCoarseSampleOrderNV(
        VkCommandBuffer commandBuffer,
        @EnumType(VkCoarseSampleOrderTypeNV.class) int sampleOrderType,
        @Unsigned int customSampleOrderCount,
        @Nullable @Pointer IVkCoarseSampleOrderCustomNV pCustomSampleOrders
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdSetCoarseSampleOrderNV);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                sampleOrderType,
                customSampleOrderCount,
                (MemorySegment) (pCustomSampleOrders != null ? pCustomSampleOrders.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdSetColorBlendAdvancedEXT.html"><code>vkCmdSetColorBlendAdvancedEXT</code></a>
    public void cmdSetColorBlendAdvancedEXT(
        VkCommandBuffer commandBuffer,
        @Unsigned int firstAttachment,
        @Unsigned int attachmentCount,
        @Pointer IVkColorBlendAdvancedEXT pColorBlendAdvanced
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdSetColorBlendAdvancedEXT);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                firstAttachment,
                attachmentCount,
                pColorBlendAdvanced.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdSetColorBlendEnableEXT.html"><code>vkCmdSetColorBlendEnableEXT</code></a>
    public void cmdSetColorBlendEnableEXT(
        VkCommandBuffer commandBuffer,
        @Unsigned int firstAttachment,
        @Unsigned int attachmentCount,
        @Pointer(comment="VkBool32") @Unsigned IntPtr pColorBlendEnables
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdSetColorBlendEnableEXT);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                firstAttachment,
                attachmentCount,
                pColorBlendEnables.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdSetColorBlendEquationEXT.html"><code>vkCmdSetColorBlendEquationEXT</code></a>
    public void cmdSetColorBlendEquationEXT(
        VkCommandBuffer commandBuffer,
        @Unsigned int firstAttachment,
        @Unsigned int attachmentCount,
        @Pointer IVkColorBlendEquationEXT pColorBlendEquations
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdSetColorBlendEquationEXT);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                firstAttachment,
                attachmentCount,
                pColorBlendEquations.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdSetColorWriteEnableEXT.html"><code>vkCmdSetColorWriteEnableEXT</code></a>
    public void cmdSetColorWriteEnableEXT(
        VkCommandBuffer commandBuffer,
        @Unsigned int attachmentCount,
        @Pointer(comment="VkBool32") @Unsigned IntPtr pColorWriteEnables
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdSetColorWriteEnableEXT);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                attachmentCount,
                pColorWriteEnables.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdSetColorWriteMaskEXT.html"><code>vkCmdSetColorWriteMaskEXT</code></a>
    public void cmdSetColorWriteMaskEXT(
        VkCommandBuffer commandBuffer,
        @Unsigned int firstAttachment,
        @Unsigned int attachmentCount,
        @EnumType(VkColorComponentFlags.class) IntPtr pColorWriteMasks
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdSetColorWriteMaskEXT);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                firstAttachment,
                attachmentCount,
                pColorWriteMasks.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdSetConservativeRasterizationModeEXT.html"><code>vkCmdSetConservativeRasterizationModeEXT</code></a>
    public void cmdSetConservativeRasterizationModeEXT(
        VkCommandBuffer commandBuffer,
        @EnumType(VkConservativeRasterizationModeEXT.class) int conservativeRasterizationMode
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdSetConservativeRasterizationModeEXT);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                conservativeRasterizationMode
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdSetCoverageModulationModeNV.html"><code>vkCmdSetCoverageModulationModeNV</code></a>
    public void cmdSetCoverageModulationModeNV(
        VkCommandBuffer commandBuffer,
        @EnumType(VkCoverageModulationModeNV.class) int coverageModulationMode
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdSetCoverageModulationModeNV);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                coverageModulationMode
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdSetCoverageModulationTableEnableNV.html"><code>vkCmdSetCoverageModulationTableEnableNV</code></a>
    public void cmdSetCoverageModulationTableEnableNV(
        VkCommandBuffer commandBuffer,
        @NativeType("VkBool32") @Unsigned int coverageModulationTableEnable
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdSetCoverageModulationTableEnableNV);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                coverageModulationTableEnable
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdSetCoverageModulationTableNV.html"><code>vkCmdSetCoverageModulationTableNV</code></a>
    public void cmdSetCoverageModulationTableNV(
        VkCommandBuffer commandBuffer,
        @Unsigned int coverageModulationTableCount,
        FloatPtr pCoverageModulationTable
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdSetCoverageModulationTableNV);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                coverageModulationTableCount,
                pCoverageModulationTable.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdSetCoverageReductionModeNV.html"><code>vkCmdSetCoverageReductionModeNV</code></a>
    public void cmdSetCoverageReductionModeNV(
        VkCommandBuffer commandBuffer,
        @EnumType(VkCoverageReductionModeNV.class) int coverageReductionMode
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdSetCoverageReductionModeNV);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                coverageReductionMode
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdSetCoverageToColorEnableNV.html"><code>vkCmdSetCoverageToColorEnableNV</code></a>
    public void cmdSetCoverageToColorEnableNV(
        VkCommandBuffer commandBuffer,
        @NativeType("VkBool32") @Unsigned int coverageToColorEnable
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdSetCoverageToColorEnableNV);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                coverageToColorEnable
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdSetCoverageToColorLocationNV.html"><code>vkCmdSetCoverageToColorLocationNV</code></a>
    public void cmdSetCoverageToColorLocationNV(
        VkCommandBuffer commandBuffer,
        @Unsigned int coverageToColorLocation
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdSetCoverageToColorLocationNV);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                coverageToColorLocation
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdSetCullMode.html"><code>vkCmdSetCullMode</code></a>
    public void cmdSetCullMode(
        VkCommandBuffer commandBuffer,
        @EnumType(VkCullModeFlags.class) int cullMode
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdSetCullMode);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                cullMode
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdSetCullModeEXT.html"><code>vkCmdSetCullModeEXT</code></a>
    public void cmdSetCullModeEXT(
        VkCommandBuffer commandBuffer,
        @EnumType(VkCullModeFlags.class) int cullMode
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdSetCullModeEXT);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                cullMode
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdSetDepthBias.html"><code>vkCmdSetDepthBias</code></a>
    public void cmdSetDepthBias(
        VkCommandBuffer commandBuffer,
        float depthBiasConstantFactor,
        float depthBiasClamp,
        float depthBiasSlopeFactor
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdSetDepthBias);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                depthBiasConstantFactor,
                depthBiasClamp,
                depthBiasSlopeFactor
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdSetDepthBias2EXT.html"><code>vkCmdSetDepthBias2EXT</code></a>
    public void cmdSetDepthBias2EXT(
        VkCommandBuffer commandBuffer,
        @Pointer VkDepthBiasInfoEXT pDepthBiasInfo
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdSetDepthBias2EXT);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                pDepthBiasInfo.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdSetDepthBiasEnable.html"><code>vkCmdSetDepthBiasEnable</code></a>
    public void cmdSetDepthBiasEnable(
        VkCommandBuffer commandBuffer,
        @NativeType("VkBool32") @Unsigned int depthBiasEnable
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdSetDepthBiasEnable);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                depthBiasEnable
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdSetDepthBiasEnableEXT.html"><code>vkCmdSetDepthBiasEnableEXT</code></a>
    public void cmdSetDepthBiasEnableEXT(
        VkCommandBuffer commandBuffer,
        @NativeType("VkBool32") @Unsigned int depthBiasEnable
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdSetDepthBiasEnableEXT);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                depthBiasEnable
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdSetDepthBounds.html"><code>vkCmdSetDepthBounds</code></a>
    public void cmdSetDepthBounds(
        VkCommandBuffer commandBuffer,
        float minDepthBounds,
        float maxDepthBounds
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdSetDepthBounds);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                minDepthBounds,
                maxDepthBounds
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdSetDepthBoundsTestEnable.html"><code>vkCmdSetDepthBoundsTestEnable</code></a>
    public void cmdSetDepthBoundsTestEnable(
        VkCommandBuffer commandBuffer,
        @NativeType("VkBool32") @Unsigned int depthBoundsTestEnable
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdSetDepthBoundsTestEnable);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                depthBoundsTestEnable
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdSetDepthBoundsTestEnableEXT.html"><code>vkCmdSetDepthBoundsTestEnableEXT</code></a>
    public void cmdSetDepthBoundsTestEnableEXT(
        VkCommandBuffer commandBuffer,
        @NativeType("VkBool32") @Unsigned int depthBoundsTestEnable
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdSetDepthBoundsTestEnableEXT);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                depthBoundsTestEnable
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdSetDepthClampEnableEXT.html"><code>vkCmdSetDepthClampEnableEXT</code></a>
    public void cmdSetDepthClampEnableEXT(
        VkCommandBuffer commandBuffer,
        @NativeType("VkBool32") @Unsigned int depthClampEnable
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdSetDepthClampEnableEXT);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                depthClampEnable
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdSetDepthClampRangeEXT.html"><code>vkCmdSetDepthClampRangeEXT</code></a>
    public void cmdSetDepthClampRangeEXT(
        VkCommandBuffer commandBuffer,
        @EnumType(VkDepthClampModeEXT.class) int depthClampMode,
        @Nullable @Pointer VkDepthClampRangeEXT pDepthClampRange
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdSetDepthClampRangeEXT);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                depthClampMode,
                (MemorySegment) (pDepthClampRange != null ? pDepthClampRange.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdSetDepthClipEnableEXT.html"><code>vkCmdSetDepthClipEnableEXT</code></a>
    public void cmdSetDepthClipEnableEXT(
        VkCommandBuffer commandBuffer,
        @NativeType("VkBool32") @Unsigned int depthClipEnable
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdSetDepthClipEnableEXT);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                depthClipEnable
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdSetDepthClipNegativeOneToOneEXT.html"><code>vkCmdSetDepthClipNegativeOneToOneEXT</code></a>
    public void cmdSetDepthClipNegativeOneToOneEXT(
        VkCommandBuffer commandBuffer,
        @NativeType("VkBool32") @Unsigned int negativeOneToOne
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdSetDepthClipNegativeOneToOneEXT);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                negativeOneToOne
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdSetDepthCompareOp.html"><code>vkCmdSetDepthCompareOp</code></a>
    public void cmdSetDepthCompareOp(
        VkCommandBuffer commandBuffer,
        @EnumType(VkCompareOp.class) int depthCompareOp
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdSetDepthCompareOp);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                depthCompareOp
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdSetDepthCompareOpEXT.html"><code>vkCmdSetDepthCompareOpEXT</code></a>
    public void cmdSetDepthCompareOpEXT(
        VkCommandBuffer commandBuffer,
        @EnumType(VkCompareOp.class) int depthCompareOp
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdSetDepthCompareOpEXT);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                depthCompareOp
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdSetDepthTestEnable.html"><code>vkCmdSetDepthTestEnable</code></a>
    public void cmdSetDepthTestEnable(
        VkCommandBuffer commandBuffer,
        @NativeType("VkBool32") @Unsigned int depthTestEnable
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdSetDepthTestEnable);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                depthTestEnable
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdSetDepthTestEnableEXT.html"><code>vkCmdSetDepthTestEnableEXT</code></a>
    public void cmdSetDepthTestEnableEXT(
        VkCommandBuffer commandBuffer,
        @NativeType("VkBool32") @Unsigned int depthTestEnable
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdSetDepthTestEnableEXT);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                depthTestEnable
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdSetDepthWriteEnable.html"><code>vkCmdSetDepthWriteEnable</code></a>
    public void cmdSetDepthWriteEnable(
        VkCommandBuffer commandBuffer,
        @NativeType("VkBool32") @Unsigned int depthWriteEnable
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdSetDepthWriteEnable);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                depthWriteEnable
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdSetDepthWriteEnableEXT.html"><code>vkCmdSetDepthWriteEnableEXT</code></a>
    public void cmdSetDepthWriteEnableEXT(
        VkCommandBuffer commandBuffer,
        @NativeType("VkBool32") @Unsigned int depthWriteEnable
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdSetDepthWriteEnableEXT);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                depthWriteEnable
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdSetDescriptorBufferOffsets2EXT.html"><code>vkCmdSetDescriptorBufferOffsets2EXT</code></a>
    public void cmdSetDescriptorBufferOffsets2EXT(
        VkCommandBuffer commandBuffer,
        @Pointer VkSetDescriptorBufferOffsetsInfoEXT pSetDescriptorBufferOffsetsInfo
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdSetDescriptorBufferOffsets2EXT);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                pSetDescriptorBufferOffsetsInfo.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdSetDescriptorBufferOffsetsEXT.html"><code>vkCmdSetDescriptorBufferOffsetsEXT</code></a>
    public void cmdSetDescriptorBufferOffsetsEXT(
        VkCommandBuffer commandBuffer,
        @EnumType(VkPipelineBindPoint.class) int pipelineBindPoint,
        VkPipelineLayout layout,
        @Unsigned int firstSet,
        @Unsigned int setCount,
        @Unsigned IntPtr pBufferIndices,
        @Pointer(comment="VkDeviceSize") @Unsigned LongPtr pOffsets
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdSetDescriptorBufferOffsetsEXT);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                pipelineBindPoint,
                layout.segment(),
                firstSet,
                setCount,
                pBufferIndices.segment(),
                pOffsets.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdSetDeviceMask.html"><code>vkCmdSetDeviceMask</code></a>
    public void cmdSetDeviceMask(
        VkCommandBuffer commandBuffer,
        @Unsigned int deviceMask
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdSetDeviceMask);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                deviceMask
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdSetDeviceMaskKHR.html"><code>vkCmdSetDeviceMaskKHR</code></a>
    public void cmdSetDeviceMaskKHR(
        VkCommandBuffer commandBuffer,
        @Unsigned int deviceMask
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdSetDeviceMaskKHR);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                deviceMask
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdSetDiscardRectangleEXT.html"><code>vkCmdSetDiscardRectangleEXT</code></a>
    public void cmdSetDiscardRectangleEXT(
        VkCommandBuffer commandBuffer,
        @Unsigned int firstDiscardRectangle,
        @Unsigned int discardRectangleCount,
        @Pointer IVkRect2D pDiscardRectangles
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdSetDiscardRectangleEXT);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                firstDiscardRectangle,
                discardRectangleCount,
                pDiscardRectangles.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdSetDiscardRectangleEnableEXT.html"><code>vkCmdSetDiscardRectangleEnableEXT</code></a>
    public void cmdSetDiscardRectangleEnableEXT(
        VkCommandBuffer commandBuffer,
        @NativeType("VkBool32") @Unsigned int discardRectangleEnable
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdSetDiscardRectangleEnableEXT);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                discardRectangleEnable
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdSetDiscardRectangleModeEXT.html"><code>vkCmdSetDiscardRectangleModeEXT</code></a>
    public void cmdSetDiscardRectangleModeEXT(
        VkCommandBuffer commandBuffer,
        @EnumType(VkDiscardRectangleModeEXT.class) int discardRectangleMode
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdSetDiscardRectangleModeEXT);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                discardRectangleMode
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdSetEvent.html"><code>vkCmdSetEvent</code></a>
    public void cmdSetEvent(
        VkCommandBuffer commandBuffer,
        VkEvent event,
        @EnumType(VkPipelineStageFlags.class) int stageMask
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdSetEvent);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                event.segment(),
                stageMask
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdSetEvent2.html"><code>vkCmdSetEvent2</code></a>
    public void cmdSetEvent2(
        VkCommandBuffer commandBuffer,
        VkEvent event,
        @Pointer VkDependencyInfo pDependencyInfo
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdSetEvent2);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                event.segment(),
                pDependencyInfo.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdSetEvent2KHR.html"><code>vkCmdSetEvent2KHR</code></a>
    public void cmdSetEvent2KHR(
        VkCommandBuffer commandBuffer,
        VkEvent event,
        @Pointer VkDependencyInfo pDependencyInfo
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdSetEvent2KHR);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                event.segment(),
                pDependencyInfo.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdSetExclusiveScissorEnableNV.html"><code>vkCmdSetExclusiveScissorEnableNV</code></a>
    public void cmdSetExclusiveScissorEnableNV(
        VkCommandBuffer commandBuffer,
        @Unsigned int firstExclusiveScissor,
        @Unsigned int exclusiveScissorCount,
        @Pointer(comment="VkBool32") @Unsigned IntPtr pExclusiveScissorEnables
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdSetExclusiveScissorEnableNV);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                firstExclusiveScissor,
                exclusiveScissorCount,
                pExclusiveScissorEnables.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdSetExclusiveScissorNV.html"><code>vkCmdSetExclusiveScissorNV</code></a>
    public void cmdSetExclusiveScissorNV(
        VkCommandBuffer commandBuffer,
        @Unsigned int firstExclusiveScissor,
        @Unsigned int exclusiveScissorCount,
        @Pointer IVkRect2D pExclusiveScissors
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdSetExclusiveScissorNV);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                firstExclusiveScissor,
                exclusiveScissorCount,
                pExclusiveScissors.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdSetExtraPrimitiveOverestimationSizeEXT.html"><code>vkCmdSetExtraPrimitiveOverestimationSizeEXT</code></a>
    public void cmdSetExtraPrimitiveOverestimationSizeEXT(
        VkCommandBuffer commandBuffer,
        float extraPrimitiveOverestimationSize
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdSetExtraPrimitiveOverestimationSizeEXT);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                extraPrimitiveOverestimationSize
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdSetFragmentShadingRateEnumNV.html"><code>vkCmdSetFragmentShadingRateEnumNV</code></a>
    public void cmdSetFragmentShadingRateEnumNV(
        VkCommandBuffer commandBuffer,
        @EnumType(VkFragmentShadingRateNV.class) int shadingRate,
        @EnumType(VkFragmentShadingRateCombinerOpKHR.class) int combinerOps
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdSetFragmentShadingRateEnumNV);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                shadingRate,
                combinerOps
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdSetFragmentShadingRateKHR.html"><code>vkCmdSetFragmentShadingRateKHR</code></a>
    public void cmdSetFragmentShadingRateKHR(
        VkCommandBuffer commandBuffer,
        @Pointer VkExtent2D pFragmentSize,
        @EnumType(VkFragmentShadingRateCombinerOpKHR.class) int combinerOps
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdSetFragmentShadingRateKHR);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                pFragmentSize.segment(),
                combinerOps
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdSetFrontFace.html"><code>vkCmdSetFrontFace</code></a>
    public void cmdSetFrontFace(
        VkCommandBuffer commandBuffer,
        @EnumType(VkFrontFace.class) int frontFace
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdSetFrontFace);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                frontFace
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdSetFrontFaceEXT.html"><code>vkCmdSetFrontFaceEXT</code></a>
    public void cmdSetFrontFaceEXT(
        VkCommandBuffer commandBuffer,
        @EnumType(VkFrontFace.class) int frontFace
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdSetFrontFaceEXT);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                frontFace
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdSetLineRasterizationModeEXT.html"><code>vkCmdSetLineRasterizationModeEXT</code></a>
    public void cmdSetLineRasterizationModeEXT(
        VkCommandBuffer commandBuffer,
        @EnumType(VkLineRasterizationMode.class) int lineRasterizationMode
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdSetLineRasterizationModeEXT);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                lineRasterizationMode
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdSetLineStipple.html"><code>vkCmdSetLineStipple</code></a>
    public void cmdSetLineStipple(
        VkCommandBuffer commandBuffer,
        @Unsigned int lineStippleFactor,
        @Unsigned short lineStipplePattern
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdSetLineStipple);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                lineStippleFactor,
                lineStipplePattern
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdSetLineStippleEXT.html"><code>vkCmdSetLineStippleEXT</code></a>
    public void cmdSetLineStippleEXT(
        VkCommandBuffer commandBuffer,
        @Unsigned int lineStippleFactor,
        @Unsigned short lineStipplePattern
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdSetLineStippleEXT);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                lineStippleFactor,
                lineStipplePattern
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdSetLineStippleEnableEXT.html"><code>vkCmdSetLineStippleEnableEXT</code></a>
    public void cmdSetLineStippleEnableEXT(
        VkCommandBuffer commandBuffer,
        @NativeType("VkBool32") @Unsigned int stippledLineEnable
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdSetLineStippleEnableEXT);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                stippledLineEnable
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdSetLineStippleKHR.html"><code>vkCmdSetLineStippleKHR</code></a>
    public void cmdSetLineStippleKHR(
        VkCommandBuffer commandBuffer,
        @Unsigned int lineStippleFactor,
        @Unsigned short lineStipplePattern
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdSetLineStippleKHR);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                lineStippleFactor,
                lineStipplePattern
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdSetLineWidth.html"><code>vkCmdSetLineWidth</code></a>
    public void cmdSetLineWidth(
        VkCommandBuffer commandBuffer,
        float lineWidth
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdSetLineWidth);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                lineWidth
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdSetLogicOpEXT.html"><code>vkCmdSetLogicOpEXT</code></a>
    public void cmdSetLogicOpEXT(
        VkCommandBuffer commandBuffer,
        @EnumType(VkLogicOp.class) int logicOp
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdSetLogicOpEXT);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                logicOp
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdSetLogicOpEnableEXT.html"><code>vkCmdSetLogicOpEnableEXT</code></a>
    public void cmdSetLogicOpEnableEXT(
        VkCommandBuffer commandBuffer,
        @NativeType("VkBool32") @Unsigned int logicOpEnable
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdSetLogicOpEnableEXT);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                logicOpEnable
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdSetPatchControlPointsEXT.html"><code>vkCmdSetPatchControlPointsEXT</code></a>
    public void cmdSetPatchControlPointsEXT(
        VkCommandBuffer commandBuffer,
        @Unsigned int patchControlPoints
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdSetPatchControlPointsEXT);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                patchControlPoints
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdSetPerformanceMarkerINTEL.html"><code>vkCmdSetPerformanceMarkerINTEL</code></a>
    public @EnumType(VkResult.class) int cmdSetPerformanceMarkerINTEL(
        VkCommandBuffer commandBuffer,
        @Pointer VkPerformanceMarkerInfoINTEL pMarkerInfo
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdSetPerformanceMarkerINTEL);
        try {
            return (int) hFunction.invokeExact(
                commandBuffer.segment(),
                pMarkerInfo.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdSetPerformanceOverrideINTEL.html"><code>vkCmdSetPerformanceOverrideINTEL</code></a>
    public @EnumType(VkResult.class) int cmdSetPerformanceOverrideINTEL(
        VkCommandBuffer commandBuffer,
        @Pointer VkPerformanceOverrideInfoINTEL pOverrideInfo
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdSetPerformanceOverrideINTEL);
        try {
            return (int) hFunction.invokeExact(
                commandBuffer.segment(),
                pOverrideInfo.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdSetPerformanceStreamMarkerINTEL.html"><code>vkCmdSetPerformanceStreamMarkerINTEL</code></a>
    public @EnumType(VkResult.class) int cmdSetPerformanceStreamMarkerINTEL(
        VkCommandBuffer commandBuffer,
        @Pointer VkPerformanceStreamMarkerInfoINTEL pMarkerInfo
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdSetPerformanceStreamMarkerINTEL);
        try {
            return (int) hFunction.invokeExact(
                commandBuffer.segment(),
                pMarkerInfo.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdSetPolygonModeEXT.html"><code>vkCmdSetPolygonModeEXT</code></a>
    public void cmdSetPolygonModeEXT(
        VkCommandBuffer commandBuffer,
        @EnumType(VkPolygonMode.class) int polygonMode
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdSetPolygonModeEXT);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                polygonMode
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdSetPrimitiveRestartEnable.html"><code>vkCmdSetPrimitiveRestartEnable</code></a>
    public void cmdSetPrimitiveRestartEnable(
        VkCommandBuffer commandBuffer,
        @NativeType("VkBool32") @Unsigned int primitiveRestartEnable
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdSetPrimitiveRestartEnable);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                primitiveRestartEnable
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdSetPrimitiveRestartEnableEXT.html"><code>vkCmdSetPrimitiveRestartEnableEXT</code></a>
    public void cmdSetPrimitiveRestartEnableEXT(
        VkCommandBuffer commandBuffer,
        @NativeType("VkBool32") @Unsigned int primitiveRestartEnable
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdSetPrimitiveRestartEnableEXT);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                primitiveRestartEnable
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdSetPrimitiveTopology.html"><code>vkCmdSetPrimitiveTopology</code></a>
    public void cmdSetPrimitiveTopology(
        VkCommandBuffer commandBuffer,
        @EnumType(VkPrimitiveTopology.class) int primitiveTopology
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdSetPrimitiveTopology);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                primitiveTopology
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdSetPrimitiveTopologyEXT.html"><code>vkCmdSetPrimitiveTopologyEXT</code></a>
    public void cmdSetPrimitiveTopologyEXT(
        VkCommandBuffer commandBuffer,
        @EnumType(VkPrimitiveTopology.class) int primitiveTopology
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdSetPrimitiveTopologyEXT);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                primitiveTopology
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdSetProvokingVertexModeEXT.html"><code>vkCmdSetProvokingVertexModeEXT</code></a>
    public void cmdSetProvokingVertexModeEXT(
        VkCommandBuffer commandBuffer,
        @EnumType(VkProvokingVertexModeEXT.class) int provokingVertexMode
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdSetProvokingVertexModeEXT);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                provokingVertexMode
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdSetRasterizationSamplesEXT.html"><code>vkCmdSetRasterizationSamplesEXT</code></a>
    public void cmdSetRasterizationSamplesEXT(
        VkCommandBuffer commandBuffer,
        @EnumType(VkSampleCountFlags.class) int rasterizationSamples
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdSetRasterizationSamplesEXT);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                rasterizationSamples
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdSetRasterizationStreamEXT.html"><code>vkCmdSetRasterizationStreamEXT</code></a>
    public void cmdSetRasterizationStreamEXT(
        VkCommandBuffer commandBuffer,
        @Unsigned int rasterizationStream
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdSetRasterizationStreamEXT);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                rasterizationStream
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdSetRasterizerDiscardEnable.html"><code>vkCmdSetRasterizerDiscardEnable</code></a>
    public void cmdSetRasterizerDiscardEnable(
        VkCommandBuffer commandBuffer,
        @NativeType("VkBool32") @Unsigned int rasterizerDiscardEnable
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdSetRasterizerDiscardEnable);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                rasterizerDiscardEnable
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdSetRasterizerDiscardEnableEXT.html"><code>vkCmdSetRasterizerDiscardEnableEXT</code></a>
    public void cmdSetRasterizerDiscardEnableEXT(
        VkCommandBuffer commandBuffer,
        @NativeType("VkBool32") @Unsigned int rasterizerDiscardEnable
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdSetRasterizerDiscardEnableEXT);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                rasterizerDiscardEnable
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdSetRayTracingPipelineStackSizeKHR.html"><code>vkCmdSetRayTracingPipelineStackSizeKHR</code></a>
    public void cmdSetRayTracingPipelineStackSizeKHR(
        VkCommandBuffer commandBuffer,
        @Unsigned int pipelineStackSize
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdSetRayTracingPipelineStackSizeKHR);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                pipelineStackSize
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdSetRenderingAttachmentLocations.html"><code>vkCmdSetRenderingAttachmentLocations</code></a>
    public void cmdSetRenderingAttachmentLocations(
        VkCommandBuffer commandBuffer,
        @Pointer VkRenderingAttachmentLocationInfo pLocationInfo
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdSetRenderingAttachmentLocations);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                pLocationInfo.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdSetRenderingAttachmentLocationsKHR.html"><code>vkCmdSetRenderingAttachmentLocationsKHR</code></a>
    public void cmdSetRenderingAttachmentLocationsKHR(
        VkCommandBuffer commandBuffer,
        @Pointer VkRenderingAttachmentLocationInfo pLocationInfo
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdSetRenderingAttachmentLocationsKHR);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                pLocationInfo.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdSetRenderingInputAttachmentIndices.html"><code>vkCmdSetRenderingInputAttachmentIndices</code></a>
    public void cmdSetRenderingInputAttachmentIndices(
        VkCommandBuffer commandBuffer,
        @Pointer VkRenderingInputAttachmentIndexInfo pInputAttachmentIndexInfo
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdSetRenderingInputAttachmentIndices);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                pInputAttachmentIndexInfo.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdSetRenderingInputAttachmentIndicesKHR.html"><code>vkCmdSetRenderingInputAttachmentIndicesKHR</code></a>
    public void cmdSetRenderingInputAttachmentIndicesKHR(
        VkCommandBuffer commandBuffer,
        @Pointer VkRenderingInputAttachmentIndexInfo pInputAttachmentIndexInfo
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdSetRenderingInputAttachmentIndicesKHR);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                pInputAttachmentIndexInfo.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdSetRepresentativeFragmentTestEnableNV.html"><code>vkCmdSetRepresentativeFragmentTestEnableNV</code></a>
    public void cmdSetRepresentativeFragmentTestEnableNV(
        VkCommandBuffer commandBuffer,
        @NativeType("VkBool32") @Unsigned int representativeFragmentTestEnable
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdSetRepresentativeFragmentTestEnableNV);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                representativeFragmentTestEnable
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdSetSampleLocationsEXT.html"><code>vkCmdSetSampleLocationsEXT</code></a>
    public void cmdSetSampleLocationsEXT(
        VkCommandBuffer commandBuffer,
        @Pointer VkSampleLocationsInfoEXT pSampleLocationsInfo
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdSetSampleLocationsEXT);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                pSampleLocationsInfo.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdSetSampleLocationsEnableEXT.html"><code>vkCmdSetSampleLocationsEnableEXT</code></a>
    public void cmdSetSampleLocationsEnableEXT(
        VkCommandBuffer commandBuffer,
        @NativeType("VkBool32") @Unsigned int sampleLocationsEnable
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdSetSampleLocationsEnableEXT);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                sampleLocationsEnable
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdSetSampleMaskEXT.html"><code>vkCmdSetSampleMaskEXT</code></a>
    public void cmdSetSampleMaskEXT(
        VkCommandBuffer commandBuffer,
        @EnumType(VkSampleCountFlags.class) int samples,
        @Pointer(comment="VkSampleMask") @Unsigned IntPtr pSampleMask
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdSetSampleMaskEXT);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                samples,
                pSampleMask.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdSetScissor.html"><code>vkCmdSetScissor</code></a>
    public void cmdSetScissor(
        VkCommandBuffer commandBuffer,
        @Unsigned int firstScissor,
        @Unsigned int scissorCount,
        @Pointer IVkRect2D pScissors
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdSetScissor);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                firstScissor,
                scissorCount,
                pScissors.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdSetScissorWithCount.html"><code>vkCmdSetScissorWithCount</code></a>
    public void cmdSetScissorWithCount(
        VkCommandBuffer commandBuffer,
        @Unsigned int scissorCount,
        @Pointer IVkRect2D pScissors
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdSetScissorWithCount);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                scissorCount,
                pScissors.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdSetScissorWithCountEXT.html"><code>vkCmdSetScissorWithCountEXT</code></a>
    public void cmdSetScissorWithCountEXT(
        VkCommandBuffer commandBuffer,
        @Unsigned int scissorCount,
        @Pointer IVkRect2D pScissors
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdSetScissorWithCountEXT);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                scissorCount,
                pScissors.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdSetShadingRateImageEnableNV.html"><code>vkCmdSetShadingRateImageEnableNV</code></a>
    public void cmdSetShadingRateImageEnableNV(
        VkCommandBuffer commandBuffer,
        @NativeType("VkBool32") @Unsigned int shadingRateImageEnable
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdSetShadingRateImageEnableNV);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                shadingRateImageEnable
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdSetStencilCompareMask.html"><code>vkCmdSetStencilCompareMask</code></a>
    public void cmdSetStencilCompareMask(
        VkCommandBuffer commandBuffer,
        @EnumType(VkStencilFaceFlags.class) int faceMask,
        @Unsigned int compareMask
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdSetStencilCompareMask);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                faceMask,
                compareMask
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdSetStencilOp.html"><code>vkCmdSetStencilOp</code></a>
    public void cmdSetStencilOp(
        VkCommandBuffer commandBuffer,
        @EnumType(VkStencilFaceFlags.class) int faceMask,
        @EnumType(VkStencilOp.class) int failOp,
        @EnumType(VkStencilOp.class) int passOp,
        @EnumType(VkStencilOp.class) int depthFailOp,
        @EnumType(VkCompareOp.class) int compareOp
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdSetStencilOp);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                faceMask,
                failOp,
                passOp,
                depthFailOp,
                compareOp
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdSetStencilOpEXT.html"><code>vkCmdSetStencilOpEXT</code></a>
    public void cmdSetStencilOpEXT(
        VkCommandBuffer commandBuffer,
        @EnumType(VkStencilFaceFlags.class) int faceMask,
        @EnumType(VkStencilOp.class) int failOp,
        @EnumType(VkStencilOp.class) int passOp,
        @EnumType(VkStencilOp.class) int depthFailOp,
        @EnumType(VkCompareOp.class) int compareOp
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdSetStencilOpEXT);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                faceMask,
                failOp,
                passOp,
                depthFailOp,
                compareOp
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdSetStencilReference.html"><code>vkCmdSetStencilReference</code></a>
    public void cmdSetStencilReference(
        VkCommandBuffer commandBuffer,
        @EnumType(VkStencilFaceFlags.class) int faceMask,
        @Unsigned int reference
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdSetStencilReference);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                faceMask,
                reference
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdSetStencilTestEnable.html"><code>vkCmdSetStencilTestEnable</code></a>
    public void cmdSetStencilTestEnable(
        VkCommandBuffer commandBuffer,
        @NativeType("VkBool32") @Unsigned int stencilTestEnable
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdSetStencilTestEnable);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                stencilTestEnable
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdSetStencilTestEnableEXT.html"><code>vkCmdSetStencilTestEnableEXT</code></a>
    public void cmdSetStencilTestEnableEXT(
        VkCommandBuffer commandBuffer,
        @NativeType("VkBool32") @Unsigned int stencilTestEnable
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdSetStencilTestEnableEXT);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                stencilTestEnable
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdSetStencilWriteMask.html"><code>vkCmdSetStencilWriteMask</code></a>
    public void cmdSetStencilWriteMask(
        VkCommandBuffer commandBuffer,
        @EnumType(VkStencilFaceFlags.class) int faceMask,
        @Unsigned int writeMask
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdSetStencilWriteMask);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                faceMask,
                writeMask
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdSetTessellationDomainOriginEXT.html"><code>vkCmdSetTessellationDomainOriginEXT</code></a>
    public void cmdSetTessellationDomainOriginEXT(
        VkCommandBuffer commandBuffer,
        @EnumType(VkTessellationDomainOrigin.class) int domainOrigin
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdSetTessellationDomainOriginEXT);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                domainOrigin
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdSetVertexInputEXT.html"><code>vkCmdSetVertexInputEXT</code></a>
    public void cmdSetVertexInputEXT(
        VkCommandBuffer commandBuffer,
        @Unsigned int vertexBindingDescriptionCount,
        @Nullable @Pointer IVkVertexInputBindingDescription2EXT pVertexBindingDescriptions,
        @Unsigned int vertexAttributeDescriptionCount,
        @Nullable @Pointer IVkVertexInputAttributeDescription2EXT pVertexAttributeDescriptions
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdSetVertexInputEXT);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                vertexBindingDescriptionCount,
                (MemorySegment) (pVertexBindingDescriptions != null ? pVertexBindingDescriptions.segment() : MemorySegment.NULL),
                vertexAttributeDescriptionCount,
                (MemorySegment) (pVertexAttributeDescriptions != null ? pVertexAttributeDescriptions.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdSetViewport.html"><code>vkCmdSetViewport</code></a>
    public void cmdSetViewport(
        VkCommandBuffer commandBuffer,
        @Unsigned int firstViewport,
        @Unsigned int viewportCount,
        @Pointer IVkViewport pViewports
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdSetViewport);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                firstViewport,
                viewportCount,
                pViewports.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdSetViewportShadingRatePaletteNV.html"><code>vkCmdSetViewportShadingRatePaletteNV</code></a>
    public void cmdSetViewportShadingRatePaletteNV(
        VkCommandBuffer commandBuffer,
        @Unsigned int firstViewport,
        @Unsigned int viewportCount,
        @Pointer IVkShadingRatePaletteNV pShadingRatePalettes
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdSetViewportShadingRatePaletteNV);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                firstViewport,
                viewportCount,
                pShadingRatePalettes.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdSetViewportSwizzleNV.html"><code>vkCmdSetViewportSwizzleNV</code></a>
    public void cmdSetViewportSwizzleNV(
        VkCommandBuffer commandBuffer,
        @Unsigned int firstViewport,
        @Unsigned int viewportCount,
        @Pointer IVkViewportSwizzleNV pViewportSwizzles
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdSetViewportSwizzleNV);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                firstViewport,
                viewportCount,
                pViewportSwizzles.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdSetViewportWScalingEnableNV.html"><code>vkCmdSetViewportWScalingEnableNV</code></a>
    public void cmdSetViewportWScalingEnableNV(
        VkCommandBuffer commandBuffer,
        @NativeType("VkBool32") @Unsigned int viewportWScalingEnable
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdSetViewportWScalingEnableNV);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                viewportWScalingEnable
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdSetViewportWScalingNV.html"><code>vkCmdSetViewportWScalingNV</code></a>
    public void cmdSetViewportWScalingNV(
        VkCommandBuffer commandBuffer,
        @Unsigned int firstViewport,
        @Unsigned int viewportCount,
        @Pointer IVkViewportWScalingNV pViewportWScalings
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdSetViewportWScalingNV);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                firstViewport,
                viewportCount,
                pViewportWScalings.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdSetViewportWithCount.html"><code>vkCmdSetViewportWithCount</code></a>
    public void cmdSetViewportWithCount(
        VkCommandBuffer commandBuffer,
        @Unsigned int viewportCount,
        @Pointer IVkViewport pViewports
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdSetViewportWithCount);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                viewportCount,
                pViewports.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdSetViewportWithCountEXT.html"><code>vkCmdSetViewportWithCountEXT</code></a>
    public void cmdSetViewportWithCountEXT(
        VkCommandBuffer commandBuffer,
        @Unsigned int viewportCount,
        @Pointer IVkViewport pViewports
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdSetViewportWithCountEXT);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                viewportCount,
                pViewports.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdSubpassShadingHUAWEI.html"><code>vkCmdSubpassShadingHUAWEI</code></a>
    public void cmdSubpassShadingHUAWEI(
        VkCommandBuffer commandBuffer
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdSubpassShadingHUAWEI);
        try {
            hFunction.invokeExact(
                commandBuffer.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdTraceRaysIndirect2KHR.html"><code>vkCmdTraceRaysIndirect2KHR</code></a>
    public void cmdTraceRaysIndirect2KHR(
        VkCommandBuffer commandBuffer,
        @NativeType("VkDeviceAddress") @Unsigned long indirectDeviceAddress
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdTraceRaysIndirect2KHR);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                indirectDeviceAddress
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdTraceRaysIndirectKHR.html"><code>vkCmdTraceRaysIndirectKHR</code></a>
    public void cmdTraceRaysIndirectKHR(
        VkCommandBuffer commandBuffer,
        @Pointer VkStridedDeviceAddressRegionKHR pRaygenShaderBindingTable,
        @Pointer VkStridedDeviceAddressRegionKHR pMissShaderBindingTable,
        @Pointer VkStridedDeviceAddressRegionKHR pHitShaderBindingTable,
        @Pointer VkStridedDeviceAddressRegionKHR pCallableShaderBindingTable,
        @NativeType("VkDeviceAddress") @Unsigned long indirectDeviceAddress
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdTraceRaysIndirectKHR);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                pRaygenShaderBindingTable.segment(),
                pMissShaderBindingTable.segment(),
                pHitShaderBindingTable.segment(),
                pCallableShaderBindingTable.segment(),
                indirectDeviceAddress
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdTraceRaysKHR.html"><code>vkCmdTraceRaysKHR</code></a>
    public void cmdTraceRaysKHR(
        VkCommandBuffer commandBuffer,
        @Pointer VkStridedDeviceAddressRegionKHR pRaygenShaderBindingTable,
        @Pointer VkStridedDeviceAddressRegionKHR pMissShaderBindingTable,
        @Pointer VkStridedDeviceAddressRegionKHR pHitShaderBindingTable,
        @Pointer VkStridedDeviceAddressRegionKHR pCallableShaderBindingTable,
        @Unsigned int width,
        @Unsigned int height,
        @Unsigned int depth
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdTraceRaysKHR);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                pRaygenShaderBindingTable.segment(),
                pMissShaderBindingTable.segment(),
                pHitShaderBindingTable.segment(),
                pCallableShaderBindingTable.segment(),
                width,
                height,
                depth
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdTraceRaysNV.html"><code>vkCmdTraceRaysNV</code></a>
    public void cmdTraceRaysNV(
        VkCommandBuffer commandBuffer,
        VkBuffer raygenShaderBindingTableBuffer,
        @NativeType("VkDeviceSize") @Unsigned long raygenShaderBindingOffset,
        @Nullable VkBuffer missShaderBindingTableBuffer,
        @NativeType("VkDeviceSize") @Unsigned long missShaderBindingOffset,
        @NativeType("VkDeviceSize") @Unsigned long missShaderBindingStride,
        @Nullable VkBuffer hitShaderBindingTableBuffer,
        @NativeType("VkDeviceSize") @Unsigned long hitShaderBindingOffset,
        @NativeType("VkDeviceSize") @Unsigned long hitShaderBindingStride,
        @Nullable VkBuffer callableShaderBindingTableBuffer,
        @NativeType("VkDeviceSize") @Unsigned long callableShaderBindingOffset,
        @NativeType("VkDeviceSize") @Unsigned long callableShaderBindingStride,
        @Unsigned int width,
        @Unsigned int height,
        @Unsigned int depth
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdTraceRaysNV);
        try {
            hFunction.invokeExact(
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
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdUpdateBuffer.html"><code>vkCmdUpdateBuffer</code></a>
    public void cmdUpdateBuffer(
        VkCommandBuffer commandBuffer,
        VkBuffer dstBuffer,
        @NativeType("VkDeviceSize") @Unsigned long dstOffset,
        @NativeType("VkDeviceSize") @Unsigned long dataSize,
        @Pointer(comment="void*") @NotNull MemorySegment pData
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdUpdateBuffer);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                dstBuffer.segment(),
                dstOffset,
                dataSize,
                pData
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdUpdatePipelineIndirectBufferNV.html"><code>vkCmdUpdatePipelineIndirectBufferNV</code></a>
    public void cmdUpdatePipelineIndirectBufferNV(
        VkCommandBuffer commandBuffer,
        @EnumType(VkPipelineBindPoint.class) int pipelineBindPoint,
        VkPipeline pipeline
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdUpdatePipelineIndirectBufferNV);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                pipelineBindPoint,
                pipeline.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdWaitEvents.html"><code>vkCmdWaitEvents</code></a>
    public void cmdWaitEvents(
        VkCommandBuffer commandBuffer,
        @Unsigned int eventCount,
        @Pointer VkEvent.Ptr pEvents,
        @EnumType(VkPipelineStageFlags.class) int srcStageMask,
        @EnumType(VkPipelineStageFlags.class) int dstStageMask,
        @Unsigned int memoryBarrierCount,
        @Nullable @Pointer IVkMemoryBarrier pMemoryBarriers,
        @Unsigned int bufferMemoryBarrierCount,
        @Nullable @Pointer IVkBufferMemoryBarrier pBufferMemoryBarriers,
        @Unsigned int imageMemoryBarrierCount,
        @Nullable @Pointer IVkImageMemoryBarrier pImageMemoryBarriers
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdWaitEvents);
        try {
            hFunction.invokeExact(
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
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdWaitEvents2.html"><code>vkCmdWaitEvents2</code></a>
    public void cmdWaitEvents2(
        VkCommandBuffer commandBuffer,
        @Unsigned int eventCount,
        @Pointer VkEvent.Ptr pEvents,
        @Pointer IVkDependencyInfo pDependencyInfos
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdWaitEvents2);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                eventCount,
                pEvents.segment(),
                pDependencyInfos.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdWaitEvents2KHR.html"><code>vkCmdWaitEvents2KHR</code></a>
    public void cmdWaitEvents2KHR(
        VkCommandBuffer commandBuffer,
        @Unsigned int eventCount,
        @Pointer VkEvent.Ptr pEvents,
        @Pointer IVkDependencyInfo pDependencyInfos
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdWaitEvents2KHR);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                eventCount,
                pEvents.segment(),
                pDependencyInfos.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdWriteAccelerationStructuresPropertiesKHR.html"><code>vkCmdWriteAccelerationStructuresPropertiesKHR</code></a>
    public void cmdWriteAccelerationStructuresPropertiesKHR(
        VkCommandBuffer commandBuffer,
        @Unsigned int accelerationStructureCount,
        @Pointer VkAccelerationStructureKHR.Ptr pAccelerationStructures,
        @EnumType(VkQueryType.class) int queryType,
        VkQueryPool queryPool,
        @Unsigned int firstQuery
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdWriteAccelerationStructuresPropertiesKHR);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                accelerationStructureCount,
                pAccelerationStructures.segment(),
                queryType,
                queryPool.segment(),
                firstQuery
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdWriteAccelerationStructuresPropertiesNV.html"><code>vkCmdWriteAccelerationStructuresPropertiesNV</code></a>
    public void cmdWriteAccelerationStructuresPropertiesNV(
        VkCommandBuffer commandBuffer,
        @Unsigned int accelerationStructureCount,
        @Pointer VkAccelerationStructureNV.Ptr pAccelerationStructures,
        @EnumType(VkQueryType.class) int queryType,
        VkQueryPool queryPool,
        @Unsigned int firstQuery
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdWriteAccelerationStructuresPropertiesNV);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                accelerationStructureCount,
                pAccelerationStructures.segment(),
                queryType,
                queryPool.segment(),
                firstQuery
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdWriteBufferMarker2AMD.html"><code>vkCmdWriteBufferMarker2AMD</code></a>
    public void cmdWriteBufferMarker2AMD(
        VkCommandBuffer commandBuffer,
        @EnumType(VkPipelineStageFlags2.class) long stage,
        VkBuffer dstBuffer,
        @NativeType("VkDeviceSize") @Unsigned long dstOffset,
        @Unsigned int marker
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdWriteBufferMarker2AMD);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                stage,
                dstBuffer.segment(),
                dstOffset,
                marker
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdWriteBufferMarkerAMD.html"><code>vkCmdWriteBufferMarkerAMD</code></a>
    public void cmdWriteBufferMarkerAMD(
        VkCommandBuffer commandBuffer,
        @EnumType(VkPipelineStageFlags.class) int pipelineStage,
        VkBuffer dstBuffer,
        @NativeType("VkDeviceSize") @Unsigned long dstOffset,
        @Unsigned int marker
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdWriteBufferMarkerAMD);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                pipelineStage,
                dstBuffer.segment(),
                dstOffset,
                marker
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdWriteMicromapsPropertiesEXT.html"><code>vkCmdWriteMicromapsPropertiesEXT</code></a>
    public void cmdWriteMicromapsPropertiesEXT(
        VkCommandBuffer commandBuffer,
        @Unsigned int micromapCount,
        @Pointer VkMicromapEXT.Ptr pMicromaps,
        @EnumType(VkQueryType.class) int queryType,
        VkQueryPool queryPool,
        @Unsigned int firstQuery
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdWriteMicromapsPropertiesEXT);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                micromapCount,
                pMicromaps.segment(),
                queryType,
                queryPool.segment(),
                firstQuery
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdWriteTimestamp.html"><code>vkCmdWriteTimestamp</code></a>
    public void cmdWriteTimestamp(
        VkCommandBuffer commandBuffer,
        @EnumType(VkPipelineStageFlags.class) int pipelineStage,
        VkQueryPool queryPool,
        @Unsigned int query
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdWriteTimestamp);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                pipelineStage,
                queryPool.segment(),
                query
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdWriteTimestamp2.html"><code>vkCmdWriteTimestamp2</code></a>
    public void cmdWriteTimestamp2(
        VkCommandBuffer commandBuffer,
        @EnumType(VkPipelineStageFlags2.class) long stage,
        VkQueryPool queryPool,
        @Unsigned int query
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdWriteTimestamp2);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                stage,
                queryPool.segment(),
                query
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCmdWriteTimestamp2KHR.html"><code>vkCmdWriteTimestamp2KHR</code></a>
    public void cmdWriteTimestamp2KHR(
        VkCommandBuffer commandBuffer,
        @EnumType(VkPipelineStageFlags2.class) long stage,
        VkQueryPool queryPool,
        @Unsigned int query
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCmdWriteTimestamp2KHR);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                stage,
                queryPool.segment(),
                query
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCompileDeferredNV.html"><code>vkCompileDeferredNV</code></a>
    public @EnumType(VkResult.class) int compileDeferredNV(
        VkDevice device,
        VkPipeline pipeline,
        @Unsigned int shader
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCompileDeferredNV);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                pipeline.segment(),
                shader
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkConvertCooperativeVectorMatrixNV.html"><code>vkConvertCooperativeVectorMatrixNV</code></a>
    public @EnumType(VkResult.class) int convertCooperativeVectorMatrixNV(
        VkDevice device,
        @Pointer VkConvertCooperativeVectorMatrixInfoNV pInfo
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkConvertCooperativeVectorMatrixNV);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                pInfo.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCopyAccelerationStructureKHR.html"><code>vkCopyAccelerationStructureKHR</code></a>
    public @EnumType(VkResult.class) int copyAccelerationStructureKHR(
        VkDevice device,
        @Nullable VkDeferredOperationKHR deferredOperation,
        @Pointer VkCopyAccelerationStructureInfoKHR pInfo
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCopyAccelerationStructureKHR);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                (MemorySegment) (deferredOperation != null ? deferredOperation.segment() : MemorySegment.NULL),
                pInfo.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCopyAccelerationStructureToMemoryKHR.html"><code>vkCopyAccelerationStructureToMemoryKHR</code></a>
    public @EnumType(VkResult.class) int copyAccelerationStructureToMemoryKHR(
        VkDevice device,
        @Nullable VkDeferredOperationKHR deferredOperation,
        @Pointer VkCopyAccelerationStructureToMemoryInfoKHR pInfo
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCopyAccelerationStructureToMemoryKHR);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                (MemorySegment) (deferredOperation != null ? deferredOperation.segment() : MemorySegment.NULL),
                pInfo.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCopyImageToImage.html"><code>vkCopyImageToImage</code></a>
    public @EnumType(VkResult.class) int copyImageToImage(
        VkDevice device,
        @Pointer VkCopyImageToImageInfo pCopyImageToImageInfo
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCopyImageToImage);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                pCopyImageToImageInfo.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCopyImageToImageEXT.html"><code>vkCopyImageToImageEXT</code></a>
    public @EnumType(VkResult.class) int copyImageToImageEXT(
        VkDevice device,
        @Pointer VkCopyImageToImageInfo pCopyImageToImageInfo
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCopyImageToImageEXT);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                pCopyImageToImageInfo.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCopyImageToMemory.html"><code>vkCopyImageToMemory</code></a>
    public @EnumType(VkResult.class) int copyImageToMemory(
        VkDevice device,
        @Pointer VkCopyImageToMemoryInfo pCopyImageToMemoryInfo
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCopyImageToMemory);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                pCopyImageToMemoryInfo.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCopyImageToMemoryEXT.html"><code>vkCopyImageToMemoryEXT</code></a>
    public @EnumType(VkResult.class) int copyImageToMemoryEXT(
        VkDevice device,
        @Pointer VkCopyImageToMemoryInfo pCopyImageToMemoryInfo
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCopyImageToMemoryEXT);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                pCopyImageToMemoryInfo.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCopyMemoryToAccelerationStructureKHR.html"><code>vkCopyMemoryToAccelerationStructureKHR</code></a>
    public @EnumType(VkResult.class) int copyMemoryToAccelerationStructureKHR(
        VkDevice device,
        @Nullable VkDeferredOperationKHR deferredOperation,
        @Pointer VkCopyMemoryToAccelerationStructureInfoKHR pInfo
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCopyMemoryToAccelerationStructureKHR);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                (MemorySegment) (deferredOperation != null ? deferredOperation.segment() : MemorySegment.NULL),
                pInfo.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCopyMemoryToImage.html"><code>vkCopyMemoryToImage</code></a>
    public @EnumType(VkResult.class) int copyMemoryToImage(
        VkDevice device,
        @Pointer VkCopyMemoryToImageInfo pCopyMemoryToImageInfo
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCopyMemoryToImage);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                pCopyMemoryToImageInfo.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCopyMemoryToImageEXT.html"><code>vkCopyMemoryToImageEXT</code></a>
    public @EnumType(VkResult.class) int copyMemoryToImageEXT(
        VkDevice device,
        @Pointer VkCopyMemoryToImageInfo pCopyMemoryToImageInfo
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCopyMemoryToImageEXT);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                pCopyMemoryToImageInfo.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCopyMemoryToMicromapEXT.html"><code>vkCopyMemoryToMicromapEXT</code></a>
    public @EnumType(VkResult.class) int copyMemoryToMicromapEXT(
        VkDevice device,
        @Nullable VkDeferredOperationKHR deferredOperation,
        @Pointer VkCopyMemoryToMicromapInfoEXT pInfo
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCopyMemoryToMicromapEXT);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                (MemorySegment) (deferredOperation != null ? deferredOperation.segment() : MemorySegment.NULL),
                pInfo.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCopyMicromapEXT.html"><code>vkCopyMicromapEXT</code></a>
    public @EnumType(VkResult.class) int copyMicromapEXT(
        VkDevice device,
        @Nullable VkDeferredOperationKHR deferredOperation,
        @Pointer VkCopyMicromapInfoEXT pInfo
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCopyMicromapEXT);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                (MemorySegment) (deferredOperation != null ? deferredOperation.segment() : MemorySegment.NULL),
                pInfo.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCopyMicromapToMemoryEXT.html"><code>vkCopyMicromapToMemoryEXT</code></a>
    public @EnumType(VkResult.class) int copyMicromapToMemoryEXT(
        VkDevice device,
        @Nullable VkDeferredOperationKHR deferredOperation,
        @Pointer VkCopyMicromapToMemoryInfoEXT pInfo
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCopyMicromapToMemoryEXT);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                (MemorySegment) (deferredOperation != null ? deferredOperation.segment() : MemorySegment.NULL),
                pInfo.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCreateAccelerationStructureKHR.html"><code>vkCreateAccelerationStructureKHR</code></a>
    public @EnumType(VkResult.class) int createAccelerationStructureKHR(
        VkDevice device,
        @Pointer VkAccelerationStructureCreateInfoKHR pCreateInfo,
        @Nullable @Pointer VkAllocationCallbacks pAllocator,
        @Pointer VkAccelerationStructureKHR.Ptr pAccelerationStructure
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCreateAccelerationStructureKHR);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                pCreateInfo.segment(),
                (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL),
                pAccelerationStructure.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCreateAccelerationStructureNV.html"><code>vkCreateAccelerationStructureNV</code></a>
    public @EnumType(VkResult.class) int createAccelerationStructureNV(
        VkDevice device,
        @Pointer VkAccelerationStructureCreateInfoNV pCreateInfo,
        @Nullable @Pointer VkAllocationCallbacks pAllocator,
        @Pointer VkAccelerationStructureNV.Ptr pAccelerationStructure
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCreateAccelerationStructureNV);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                pCreateInfo.segment(),
                (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL),
                pAccelerationStructure.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCreateBuffer.html"><code>vkCreateBuffer</code></a>
    public @EnumType(VkResult.class) int createBuffer(
        VkDevice device,
        @Pointer VkBufferCreateInfo pCreateInfo,
        @Nullable @Pointer VkAllocationCallbacks pAllocator,
        @Pointer VkBuffer.Ptr pBuffer
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCreateBuffer);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                pCreateInfo.segment(),
                (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL),
                pBuffer.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCreateBufferCollectionFUCHSIA.html"><code>vkCreateBufferCollectionFUCHSIA</code></a>
    public @EnumType(VkResult.class) int createBufferCollectionFUCHSIA(
        VkDevice device,
        @Pointer VkBufferCollectionCreateInfoFUCHSIA pCreateInfo,
        @Nullable @Pointer VkAllocationCallbacks pAllocator,
        @Pointer VkBufferCollectionFUCHSIA.Ptr pCollection
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCreateBufferCollectionFUCHSIA);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                pCreateInfo.segment(),
                (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL),
                pCollection.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCreateBufferView.html"><code>vkCreateBufferView</code></a>
    public @EnumType(VkResult.class) int createBufferView(
        VkDevice device,
        @Pointer VkBufferViewCreateInfo pCreateInfo,
        @Nullable @Pointer VkAllocationCallbacks pAllocator,
        @Pointer VkBufferView.Ptr pView
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCreateBufferView);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                pCreateInfo.segment(),
                (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL),
                pView.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCreateCommandPool.html"><code>vkCreateCommandPool</code></a>
    public @EnumType(VkResult.class) int createCommandPool(
        VkDevice device,
        @Pointer VkCommandPoolCreateInfo pCreateInfo,
        @Nullable @Pointer VkAllocationCallbacks pAllocator,
        @Pointer VkCommandPool.Ptr pCommandPool
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCreateCommandPool);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                pCreateInfo.segment(),
                (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL),
                pCommandPool.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCreateComputePipelines.html"><code>vkCreateComputePipelines</code></a>
    public @EnumType(VkResult.class) int createComputePipelines(
        VkDevice device,
        @Nullable VkPipelineCache pipelineCache,
        @Unsigned int createInfoCount,
        @Pointer IVkComputePipelineCreateInfo pCreateInfos,
        @Nullable @Pointer VkAllocationCallbacks pAllocator,
        @Pointer VkPipeline.Ptr pPipelines
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCreateComputePipelines);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                (MemorySegment) (pipelineCache != null ? pipelineCache.segment() : MemorySegment.NULL),
                createInfoCount,
                pCreateInfos.segment(),
                (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL),
                pPipelines.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCreateCuFunctionNVX.html"><code>vkCreateCuFunctionNVX</code></a>
    public @EnumType(VkResult.class) int createCuFunctionNVX(
        VkDevice device,
        @Pointer VkCuFunctionCreateInfoNVX pCreateInfo,
        @Nullable @Pointer VkAllocationCallbacks pAllocator,
        @Pointer VkCuFunctionNVX.Ptr pFunction
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCreateCuFunctionNVX);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                pCreateInfo.segment(),
                (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL),
                pFunction.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCreateCuModuleNVX.html"><code>vkCreateCuModuleNVX</code></a>
    public @EnumType(VkResult.class) int createCuModuleNVX(
        VkDevice device,
        @Pointer VkCuModuleCreateInfoNVX pCreateInfo,
        @Nullable @Pointer VkAllocationCallbacks pAllocator,
        @Pointer VkCuModuleNVX.Ptr pModule
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCreateCuModuleNVX);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                pCreateInfo.segment(),
                (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL),
                pModule.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCreateCudaFunctionNV.html"><code>vkCreateCudaFunctionNV</code></a>
    public @EnumType(VkResult.class) int createCudaFunctionNV(
        VkDevice device,
        @Pointer VkCudaFunctionCreateInfoNV pCreateInfo,
        @Nullable @Pointer VkAllocationCallbacks pAllocator,
        @Pointer VkCudaFunctionNV.Ptr pFunction
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCreateCudaFunctionNV);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                pCreateInfo.segment(),
                (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL),
                pFunction.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCreateCudaModuleNV.html"><code>vkCreateCudaModuleNV</code></a>
    public @EnumType(VkResult.class) int createCudaModuleNV(
        VkDevice device,
        @Pointer VkCudaModuleCreateInfoNV pCreateInfo,
        @Nullable @Pointer VkAllocationCallbacks pAllocator,
        @Pointer VkCudaModuleNV.Ptr pModule
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCreateCudaModuleNV);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                pCreateInfo.segment(),
                (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL),
                pModule.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCreateDeferredOperationKHR.html"><code>vkCreateDeferredOperationKHR</code></a>
    public @EnumType(VkResult.class) int createDeferredOperationKHR(
        VkDevice device,
        @Nullable @Pointer VkAllocationCallbacks pAllocator,
        @Pointer VkDeferredOperationKHR.Ptr pDeferredOperation
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCreateDeferredOperationKHR);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL),
                pDeferredOperation.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCreateDescriptorPool.html"><code>vkCreateDescriptorPool</code></a>
    public @EnumType(VkResult.class) int createDescriptorPool(
        VkDevice device,
        @Pointer VkDescriptorPoolCreateInfo pCreateInfo,
        @Nullable @Pointer VkAllocationCallbacks pAllocator,
        @Pointer VkDescriptorPool.Ptr pDescriptorPool
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCreateDescriptorPool);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                pCreateInfo.segment(),
                (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL),
                pDescriptorPool.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCreateDescriptorSetLayout.html"><code>vkCreateDescriptorSetLayout</code></a>
    public @EnumType(VkResult.class) int createDescriptorSetLayout(
        VkDevice device,
        @Pointer VkDescriptorSetLayoutCreateInfo pCreateInfo,
        @Nullable @Pointer VkAllocationCallbacks pAllocator,
        @Pointer VkDescriptorSetLayout.Ptr pSetLayout
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCreateDescriptorSetLayout);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                pCreateInfo.segment(),
                (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL),
                pSetLayout.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCreateDescriptorUpdateTemplate.html"><code>vkCreateDescriptorUpdateTemplate</code></a>
    public @EnumType(VkResult.class) int createDescriptorUpdateTemplate(
        VkDevice device,
        @Pointer VkDescriptorUpdateTemplateCreateInfo pCreateInfo,
        @Nullable @Pointer VkAllocationCallbacks pAllocator,
        @Pointer VkDescriptorUpdateTemplate.Ptr pDescriptorUpdateTemplate
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCreateDescriptorUpdateTemplate);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                pCreateInfo.segment(),
                (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL),
                pDescriptorUpdateTemplate.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCreateDescriptorUpdateTemplateKHR.html"><code>vkCreateDescriptorUpdateTemplateKHR</code></a>
    public @EnumType(VkResult.class) int createDescriptorUpdateTemplateKHR(
        VkDevice device,
        @Pointer VkDescriptorUpdateTemplateCreateInfo pCreateInfo,
        @Nullable @Pointer VkAllocationCallbacks pAllocator,
        @Pointer VkDescriptorUpdateTemplate.Ptr pDescriptorUpdateTemplate
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCreateDescriptorUpdateTemplateKHR);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                pCreateInfo.segment(),
                (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL),
                pDescriptorUpdateTemplate.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCreateEvent.html"><code>vkCreateEvent</code></a>
    public @EnumType(VkResult.class) int createEvent(
        VkDevice device,
        @Pointer VkEventCreateInfo pCreateInfo,
        @Nullable @Pointer VkAllocationCallbacks pAllocator,
        @Pointer VkEvent.Ptr pEvent
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCreateEvent);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                pCreateInfo.segment(),
                (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL),
                pEvent.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCreateExecutionGraphPipelinesAMDX.html"><code>vkCreateExecutionGraphPipelinesAMDX</code></a>
    public @EnumType(VkResult.class) int createExecutionGraphPipelinesAMDX(
        VkDevice device,
        @Nullable VkPipelineCache pipelineCache,
        @Unsigned int createInfoCount,
        @Pointer IVkExecutionGraphPipelineCreateInfoAMDX pCreateInfos,
        @Nullable @Pointer VkAllocationCallbacks pAllocator,
        @Pointer VkPipeline.Ptr pPipelines
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCreateExecutionGraphPipelinesAMDX);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                (MemorySegment) (pipelineCache != null ? pipelineCache.segment() : MemorySegment.NULL),
                createInfoCount,
                pCreateInfos.segment(),
                (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL),
                pPipelines.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCreateExternalComputeQueueNV.html"><code>vkCreateExternalComputeQueueNV</code></a>
    public @EnumType(VkResult.class) int createExternalComputeQueueNV(
        VkDevice device,
        @Pointer VkExternalComputeQueueCreateInfoNV pCreateInfo,
        @Nullable @Pointer VkAllocationCallbacks pAllocator,
        @Pointer VkExternalComputeQueueNV.Ptr pExternalQueue
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCreateExternalComputeQueueNV);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                pCreateInfo.segment(),
                (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL),
                pExternalQueue.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCreateFence.html"><code>vkCreateFence</code></a>
    public @EnumType(VkResult.class) int createFence(
        VkDevice device,
        @Pointer VkFenceCreateInfo pCreateInfo,
        @Nullable @Pointer VkAllocationCallbacks pAllocator,
        @Pointer VkFence.Ptr pFence
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCreateFence);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                pCreateInfo.segment(),
                (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL),
                pFence.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCreateFramebuffer.html"><code>vkCreateFramebuffer</code></a>
    public @EnumType(VkResult.class) int createFramebuffer(
        VkDevice device,
        @Pointer VkFramebufferCreateInfo pCreateInfo,
        @Nullable @Pointer VkAllocationCallbacks pAllocator,
        @Pointer VkFramebuffer.Ptr pFramebuffer
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCreateFramebuffer);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                pCreateInfo.segment(),
                (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL),
                pFramebuffer.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCreateGraphicsPipelines.html"><code>vkCreateGraphicsPipelines</code></a>
    public @EnumType(VkResult.class) int createGraphicsPipelines(
        VkDevice device,
        @Nullable VkPipelineCache pipelineCache,
        @Unsigned int createInfoCount,
        @Pointer IVkGraphicsPipelineCreateInfo pCreateInfos,
        @Nullable @Pointer VkAllocationCallbacks pAllocator,
        @Pointer VkPipeline.Ptr pPipelines
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCreateGraphicsPipelines);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                (MemorySegment) (pipelineCache != null ? pipelineCache.segment() : MemorySegment.NULL),
                createInfoCount,
                pCreateInfos.segment(),
                (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL),
                pPipelines.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCreateImage.html"><code>vkCreateImage</code></a>
    public @EnumType(VkResult.class) int createImage(
        VkDevice device,
        @Pointer VkImageCreateInfo pCreateInfo,
        @Nullable @Pointer VkAllocationCallbacks pAllocator,
        @Pointer VkImage.Ptr pImage
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCreateImage);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                pCreateInfo.segment(),
                (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL),
                pImage.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCreateImageView.html"><code>vkCreateImageView</code></a>
    public @EnumType(VkResult.class) int createImageView(
        VkDevice device,
        @Pointer VkImageViewCreateInfo pCreateInfo,
        @Nullable @Pointer VkAllocationCallbacks pAllocator,
        @Pointer VkImageView.Ptr pView
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCreateImageView);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                pCreateInfo.segment(),
                (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL),
                pView.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCreateIndirectCommandsLayoutEXT.html"><code>vkCreateIndirectCommandsLayoutEXT</code></a>
    public @EnumType(VkResult.class) int createIndirectCommandsLayoutEXT(
        VkDevice device,
        @Pointer VkIndirectCommandsLayoutCreateInfoEXT pCreateInfo,
        @Nullable @Pointer VkAllocationCallbacks pAllocator,
        @Pointer VkIndirectCommandsLayoutEXT.Ptr pIndirectCommandsLayout
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCreateIndirectCommandsLayoutEXT);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                pCreateInfo.segment(),
                (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL),
                pIndirectCommandsLayout.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCreateIndirectCommandsLayoutNV.html"><code>vkCreateIndirectCommandsLayoutNV</code></a>
    public @EnumType(VkResult.class) int createIndirectCommandsLayoutNV(
        VkDevice device,
        @Pointer VkIndirectCommandsLayoutCreateInfoNV pCreateInfo,
        @Nullable @Pointer VkAllocationCallbacks pAllocator,
        @Pointer VkIndirectCommandsLayoutNV.Ptr pIndirectCommandsLayout
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCreateIndirectCommandsLayoutNV);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                pCreateInfo.segment(),
                (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL),
                pIndirectCommandsLayout.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCreateIndirectExecutionSetEXT.html"><code>vkCreateIndirectExecutionSetEXT</code></a>
    public @EnumType(VkResult.class) int createIndirectExecutionSetEXT(
        VkDevice device,
        @Pointer VkIndirectExecutionSetCreateInfoEXT pCreateInfo,
        @Nullable @Pointer VkAllocationCallbacks pAllocator,
        @Pointer VkIndirectExecutionSetEXT.Ptr pIndirectExecutionSet
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCreateIndirectExecutionSetEXT);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                pCreateInfo.segment(),
                (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL),
                pIndirectExecutionSet.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCreateMicromapEXT.html"><code>vkCreateMicromapEXT</code></a>
    public @EnumType(VkResult.class) int createMicromapEXT(
        VkDevice device,
        @Pointer VkMicromapCreateInfoEXT pCreateInfo,
        @Nullable @Pointer VkAllocationCallbacks pAllocator,
        @Pointer VkMicromapEXT.Ptr pMicromap
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCreateMicromapEXT);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                pCreateInfo.segment(),
                (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL),
                pMicromap.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCreateOpticalFlowSessionNV.html"><code>vkCreateOpticalFlowSessionNV</code></a>
    public @EnumType(VkResult.class) int createOpticalFlowSessionNV(
        VkDevice device,
        @Pointer VkOpticalFlowSessionCreateInfoNV pCreateInfo,
        @Nullable @Pointer VkAllocationCallbacks pAllocator,
        @Pointer VkOpticalFlowSessionNV.Ptr pSession
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCreateOpticalFlowSessionNV);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                pCreateInfo.segment(),
                (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL),
                pSession.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCreatePipelineBinariesKHR.html"><code>vkCreatePipelineBinariesKHR</code></a>
    public @EnumType(VkResult.class) int createPipelineBinariesKHR(
        VkDevice device,
        @Pointer VkPipelineBinaryCreateInfoKHR pCreateInfo,
        @Nullable @Pointer VkAllocationCallbacks pAllocator,
        @Pointer VkPipelineBinaryHandlesInfoKHR pBinaries
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCreatePipelineBinariesKHR);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                pCreateInfo.segment(),
                (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL),
                pBinaries.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCreatePipelineCache.html"><code>vkCreatePipelineCache</code></a>
    public @EnumType(VkResult.class) int createPipelineCache(
        VkDevice device,
        @Pointer VkPipelineCacheCreateInfo pCreateInfo,
        @Nullable @Pointer VkAllocationCallbacks pAllocator,
        @Pointer VkPipelineCache.Ptr pPipelineCache
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCreatePipelineCache);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                pCreateInfo.segment(),
                (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL),
                pPipelineCache.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCreatePipelineLayout.html"><code>vkCreatePipelineLayout</code></a>
    public @EnumType(VkResult.class) int createPipelineLayout(
        VkDevice device,
        @Pointer VkPipelineLayoutCreateInfo pCreateInfo,
        @Nullable @Pointer VkAllocationCallbacks pAllocator,
        @Pointer VkPipelineLayout.Ptr pPipelineLayout
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCreatePipelineLayout);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                pCreateInfo.segment(),
                (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL),
                pPipelineLayout.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCreatePrivateDataSlot.html"><code>vkCreatePrivateDataSlot</code></a>
    public @EnumType(VkResult.class) int createPrivateDataSlot(
        VkDevice device,
        @Pointer VkPrivateDataSlotCreateInfo pCreateInfo,
        @Nullable @Pointer VkAllocationCallbacks pAllocator,
        @Pointer VkPrivateDataSlot.Ptr pPrivateDataSlot
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCreatePrivateDataSlot);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                pCreateInfo.segment(),
                (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL),
                pPrivateDataSlot.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCreatePrivateDataSlotEXT.html"><code>vkCreatePrivateDataSlotEXT</code></a>
    public @EnumType(VkResult.class) int createPrivateDataSlotEXT(
        VkDevice device,
        @Pointer VkPrivateDataSlotCreateInfo pCreateInfo,
        @Nullable @Pointer VkAllocationCallbacks pAllocator,
        @Pointer VkPrivateDataSlot.Ptr pPrivateDataSlot
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCreatePrivateDataSlotEXT);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                pCreateInfo.segment(),
                (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL),
                pPrivateDataSlot.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCreateQueryPool.html"><code>vkCreateQueryPool</code></a>
    public @EnumType(VkResult.class) int createQueryPool(
        VkDevice device,
        @Pointer VkQueryPoolCreateInfo pCreateInfo,
        @Nullable @Pointer VkAllocationCallbacks pAllocator,
        @Pointer VkQueryPool.Ptr pQueryPool
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCreateQueryPool);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                pCreateInfo.segment(),
                (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL),
                pQueryPool.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCreateRayTracingPipelinesKHR.html"><code>vkCreateRayTracingPipelinesKHR</code></a>
    public @EnumType(VkResult.class) int createRayTracingPipelinesKHR(
        VkDevice device,
        @Nullable VkDeferredOperationKHR deferredOperation,
        @Nullable VkPipelineCache pipelineCache,
        @Unsigned int createInfoCount,
        @Pointer IVkRayTracingPipelineCreateInfoKHR pCreateInfos,
        @Nullable @Pointer VkAllocationCallbacks pAllocator,
        @Pointer VkPipeline.Ptr pPipelines
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCreateRayTracingPipelinesKHR);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                (MemorySegment) (deferredOperation != null ? deferredOperation.segment() : MemorySegment.NULL),
                (MemorySegment) (pipelineCache != null ? pipelineCache.segment() : MemorySegment.NULL),
                createInfoCount,
                pCreateInfos.segment(),
                (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL),
                pPipelines.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCreateRayTracingPipelinesNV.html"><code>vkCreateRayTracingPipelinesNV</code></a>
    public @EnumType(VkResult.class) int createRayTracingPipelinesNV(
        VkDevice device,
        @Nullable VkPipelineCache pipelineCache,
        @Unsigned int createInfoCount,
        @Pointer IVkRayTracingPipelineCreateInfoNV pCreateInfos,
        @Nullable @Pointer VkAllocationCallbacks pAllocator,
        @Pointer VkPipeline.Ptr pPipelines
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCreateRayTracingPipelinesNV);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                (MemorySegment) (pipelineCache != null ? pipelineCache.segment() : MemorySegment.NULL),
                createInfoCount,
                pCreateInfos.segment(),
                (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL),
                pPipelines.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCreateRenderPass.html"><code>vkCreateRenderPass</code></a>
    public @EnumType(VkResult.class) int createRenderPass(
        VkDevice device,
        @Pointer VkRenderPassCreateInfo pCreateInfo,
        @Nullable @Pointer VkAllocationCallbacks pAllocator,
        @Pointer VkRenderPass.Ptr pRenderPass
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCreateRenderPass);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                pCreateInfo.segment(),
                (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL),
                pRenderPass.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCreateRenderPass2.html"><code>vkCreateRenderPass2</code></a>
    public @EnumType(VkResult.class) int createRenderPass2(
        VkDevice device,
        @Pointer VkRenderPassCreateInfo2 pCreateInfo,
        @Nullable @Pointer VkAllocationCallbacks pAllocator,
        @Pointer VkRenderPass.Ptr pRenderPass
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCreateRenderPass2);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                pCreateInfo.segment(),
                (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL),
                pRenderPass.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCreateRenderPass2KHR.html"><code>vkCreateRenderPass2KHR</code></a>
    public @EnumType(VkResult.class) int createRenderPass2KHR(
        VkDevice device,
        @Pointer VkRenderPassCreateInfo2 pCreateInfo,
        @Nullable @Pointer VkAllocationCallbacks pAllocator,
        @Pointer VkRenderPass.Ptr pRenderPass
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCreateRenderPass2KHR);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                pCreateInfo.segment(),
                (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL),
                pRenderPass.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCreateSampler.html"><code>vkCreateSampler</code></a>
    public @EnumType(VkResult.class) int createSampler(
        VkDevice device,
        @Pointer VkSamplerCreateInfo pCreateInfo,
        @Nullable @Pointer VkAllocationCallbacks pAllocator,
        @Pointer VkSampler.Ptr pSampler
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCreateSampler);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                pCreateInfo.segment(),
                (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL),
                pSampler.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCreateSamplerYcbcrConversion.html"><code>vkCreateSamplerYcbcrConversion</code></a>
    public @EnumType(VkResult.class) int createSamplerYcbcrConversion(
        VkDevice device,
        @Pointer VkSamplerYcbcrConversionCreateInfo pCreateInfo,
        @Nullable @Pointer VkAllocationCallbacks pAllocator,
        @Pointer VkSamplerYcbcrConversion.Ptr pYcbcrConversion
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCreateSamplerYcbcrConversion);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                pCreateInfo.segment(),
                (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL),
                pYcbcrConversion.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCreateSamplerYcbcrConversionKHR.html"><code>vkCreateSamplerYcbcrConversionKHR</code></a>
    public @EnumType(VkResult.class) int createSamplerYcbcrConversionKHR(
        VkDevice device,
        @Pointer VkSamplerYcbcrConversionCreateInfo pCreateInfo,
        @Nullable @Pointer VkAllocationCallbacks pAllocator,
        @Pointer VkSamplerYcbcrConversion.Ptr pYcbcrConversion
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCreateSamplerYcbcrConversionKHR);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                pCreateInfo.segment(),
                (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL),
                pYcbcrConversion.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCreateSemaphore.html"><code>vkCreateSemaphore</code></a>
    public @EnumType(VkResult.class) int createSemaphore(
        VkDevice device,
        @Pointer VkSemaphoreCreateInfo pCreateInfo,
        @Nullable @Pointer VkAllocationCallbacks pAllocator,
        @Pointer VkSemaphore.Ptr pSemaphore
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCreateSemaphore);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                pCreateInfo.segment(),
                (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL),
                pSemaphore.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCreateSemaphoreSciSyncPoolNV.html"><code>vkCreateSemaphoreSciSyncPoolNV</code></a>
    public @EnumType(VkResult.class) int createSemaphoreSciSyncPoolNV(
        VkDevice device,
        @Pointer VkSemaphoreSciSyncPoolCreateInfoNV pCreateInfo,
        @Nullable @Pointer VkAllocationCallbacks pAllocator,
        @Pointer VkSemaphoreSciSyncPoolNV.Ptr pSemaphorePool
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCreateSemaphoreSciSyncPoolNV);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                pCreateInfo.segment(),
                (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL),
                pSemaphorePool.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCreateShaderModule.html"><code>vkCreateShaderModule</code></a>
    public @EnumType(VkResult.class) int createShaderModule(
        VkDevice device,
        @Pointer VkShaderModuleCreateInfo pCreateInfo,
        @Nullable @Pointer VkAllocationCallbacks pAllocator,
        @Pointer VkShaderModule.Ptr pShaderModule
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCreateShaderModule);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                pCreateInfo.segment(),
                (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL),
                pShaderModule.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCreateShadersEXT.html"><code>vkCreateShadersEXT</code></a>
    public @EnumType(VkResult.class) int createShadersEXT(
        VkDevice device,
        @Unsigned int createInfoCount,
        @Pointer IVkShaderCreateInfoEXT pCreateInfos,
        @Nullable @Pointer VkAllocationCallbacks pAllocator,
        @Pointer VkShaderEXT.Ptr pShaders
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCreateShadersEXT);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                createInfoCount,
                pCreateInfos.segment(),
                (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL),
                pShaders.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCreateSharedSwapchainsKHR.html"><code>vkCreateSharedSwapchainsKHR</code></a>
    public @EnumType(VkResult.class) int createSharedSwapchainsKHR(
        VkDevice device,
        @Unsigned int swapchainCount,
        @Pointer IVkSwapchainCreateInfoKHR pCreateInfos,
        @Nullable @Pointer VkAllocationCallbacks pAllocator,
        @Pointer VkSwapchainKHR.Ptr pSwapchains
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCreateSharedSwapchainsKHR);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                swapchainCount,
                pCreateInfos.segment(),
                (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL),
                pSwapchains.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCreateSwapchainKHR.html"><code>vkCreateSwapchainKHR</code></a>
    public @EnumType(VkResult.class) int createSwapchainKHR(
        VkDevice device,
        @Pointer VkSwapchainCreateInfoKHR pCreateInfo,
        @Nullable @Pointer VkAllocationCallbacks pAllocator,
        @Pointer VkSwapchainKHR.Ptr pSwapchain
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCreateSwapchainKHR);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                pCreateInfo.segment(),
                (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL),
                pSwapchain.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCreateValidationCacheEXT.html"><code>vkCreateValidationCacheEXT</code></a>
    public @EnumType(VkResult.class) int createValidationCacheEXT(
        VkDevice device,
        @Pointer VkValidationCacheCreateInfoEXT pCreateInfo,
        @Nullable @Pointer VkAllocationCallbacks pAllocator,
        @Pointer VkValidationCacheEXT.Ptr pValidationCache
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCreateValidationCacheEXT);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                pCreateInfo.segment(),
                (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL),
                pValidationCache.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCreateVideoSessionKHR.html"><code>vkCreateVideoSessionKHR</code></a>
    public @EnumType(VkResult.class) int createVideoSessionKHR(
        VkDevice device,
        @Pointer VkVideoSessionCreateInfoKHR pCreateInfo,
        @Nullable @Pointer VkAllocationCallbacks pAllocator,
        @Pointer VkVideoSessionKHR.Ptr pVideoSession
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCreateVideoSessionKHR);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                pCreateInfo.segment(),
                (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL),
                pVideoSession.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkCreateVideoSessionParametersKHR.html"><code>vkCreateVideoSessionParametersKHR</code></a>
    public @EnumType(VkResult.class) int createVideoSessionParametersKHR(
        VkDevice device,
        @Pointer VkVideoSessionParametersCreateInfoKHR pCreateInfo,
        @Nullable @Pointer VkAllocationCallbacks pAllocator,
        @Pointer VkVideoSessionParametersKHR.Ptr pVideoSessionParameters
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkCreateVideoSessionParametersKHR);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                pCreateInfo.segment(),
                (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL),
                pVideoSessionParameters.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkDebugMarkerSetObjectNameEXT.html"><code>vkDebugMarkerSetObjectNameEXT</code></a>
    public @EnumType(VkResult.class) int debugMarkerSetObjectNameEXT(
        VkDevice device,
        @Pointer VkDebugMarkerObjectNameInfoEXT pNameInfo
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkDebugMarkerSetObjectNameEXT);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                pNameInfo.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkDebugMarkerSetObjectTagEXT.html"><code>vkDebugMarkerSetObjectTagEXT</code></a>
    public @EnumType(VkResult.class) int debugMarkerSetObjectTagEXT(
        VkDevice device,
        @Pointer VkDebugMarkerObjectTagInfoEXT pTagInfo
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkDebugMarkerSetObjectTagEXT);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                pTagInfo.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkDeferredOperationJoinKHR.html"><code>vkDeferredOperationJoinKHR</code></a>
    public @EnumType(VkResult.class) int deferredOperationJoinKHR(
        VkDevice device,
        VkDeferredOperationKHR operation
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkDeferredOperationJoinKHR);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                operation.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkDestroyAccelerationStructureKHR.html"><code>vkDestroyAccelerationStructureKHR</code></a>
    public void destroyAccelerationStructureKHR(
        VkDevice device,
        @Nullable VkAccelerationStructureKHR accelerationStructure,
        @Nullable @Pointer VkAllocationCallbacks pAllocator
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkDestroyAccelerationStructureKHR);
        try {
            hFunction.invokeExact(
                device.segment(),
                (MemorySegment) (accelerationStructure != null ? accelerationStructure.segment() : MemorySegment.NULL),
                (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkDestroyAccelerationStructureNV.html"><code>vkDestroyAccelerationStructureNV</code></a>
    public void destroyAccelerationStructureNV(
        VkDevice device,
        @Nullable VkAccelerationStructureNV accelerationStructure,
        @Nullable @Pointer VkAllocationCallbacks pAllocator
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkDestroyAccelerationStructureNV);
        try {
            hFunction.invokeExact(
                device.segment(),
                (MemorySegment) (accelerationStructure != null ? accelerationStructure.segment() : MemorySegment.NULL),
                (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkDestroyBuffer.html"><code>vkDestroyBuffer</code></a>
    public void destroyBuffer(
        VkDevice device,
        @Nullable VkBuffer buffer,
        @Nullable @Pointer VkAllocationCallbacks pAllocator
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkDestroyBuffer);
        try {
            hFunction.invokeExact(
                device.segment(),
                (MemorySegment) (buffer != null ? buffer.segment() : MemorySegment.NULL),
                (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkDestroyBufferCollectionFUCHSIA.html"><code>vkDestroyBufferCollectionFUCHSIA</code></a>
    public void destroyBufferCollectionFUCHSIA(
        VkDevice device,
        VkBufferCollectionFUCHSIA collection,
        @Nullable @Pointer VkAllocationCallbacks pAllocator
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkDestroyBufferCollectionFUCHSIA);
        try {
            hFunction.invokeExact(
                device.segment(),
                collection.segment(),
                (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkDestroyBufferView.html"><code>vkDestroyBufferView</code></a>
    public void destroyBufferView(
        VkDevice device,
        @Nullable VkBufferView bufferView,
        @Nullable @Pointer VkAllocationCallbacks pAllocator
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkDestroyBufferView);
        try {
            hFunction.invokeExact(
                device.segment(),
                (MemorySegment) (bufferView != null ? bufferView.segment() : MemorySegment.NULL),
                (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkDestroyCommandPool.html"><code>vkDestroyCommandPool</code></a>
    public void destroyCommandPool(
        VkDevice device,
        @Nullable VkCommandPool commandPool,
        @Nullable @Pointer VkAllocationCallbacks pAllocator
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkDestroyCommandPool);
        try {
            hFunction.invokeExact(
                device.segment(),
                (MemorySegment) (commandPool != null ? commandPool.segment() : MemorySegment.NULL),
                (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkDestroyCuFunctionNVX.html"><code>vkDestroyCuFunctionNVX</code></a>
    public void destroyCuFunctionNVX(
        VkDevice device,
        VkCuFunctionNVX function,
        @Nullable @Pointer VkAllocationCallbacks pAllocator
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkDestroyCuFunctionNVX);
        try {
            hFunction.invokeExact(
                device.segment(),
                function.segment(),
                (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkDestroyCuModuleNVX.html"><code>vkDestroyCuModuleNVX</code></a>
    public void destroyCuModuleNVX(
        VkDevice device,
        VkCuModuleNVX module,
        @Nullable @Pointer VkAllocationCallbacks pAllocator
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkDestroyCuModuleNVX);
        try {
            hFunction.invokeExact(
                device.segment(),
                module.segment(),
                (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkDestroyCudaFunctionNV.html"><code>vkDestroyCudaFunctionNV</code></a>
    public void destroyCudaFunctionNV(
        VkDevice device,
        VkCudaFunctionNV function,
        @Nullable @Pointer VkAllocationCallbacks pAllocator
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkDestroyCudaFunctionNV);
        try {
            hFunction.invokeExact(
                device.segment(),
                function.segment(),
                (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkDestroyCudaModuleNV.html"><code>vkDestroyCudaModuleNV</code></a>
    public void destroyCudaModuleNV(
        VkDevice device,
        VkCudaModuleNV module,
        @Nullable @Pointer VkAllocationCallbacks pAllocator
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkDestroyCudaModuleNV);
        try {
            hFunction.invokeExact(
                device.segment(),
                module.segment(),
                (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkDestroyDeferredOperationKHR.html"><code>vkDestroyDeferredOperationKHR</code></a>
    public void destroyDeferredOperationKHR(
        VkDevice device,
        @Nullable VkDeferredOperationKHR operation,
        @Nullable @Pointer VkAllocationCallbacks pAllocator
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkDestroyDeferredOperationKHR);
        try {
            hFunction.invokeExact(
                device.segment(),
                (MemorySegment) (operation != null ? operation.segment() : MemorySegment.NULL),
                (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkDestroyDescriptorPool.html"><code>vkDestroyDescriptorPool</code></a>
    public void destroyDescriptorPool(
        VkDevice device,
        @Nullable VkDescriptorPool descriptorPool,
        @Nullable @Pointer VkAllocationCallbacks pAllocator
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkDestroyDescriptorPool);
        try {
            hFunction.invokeExact(
                device.segment(),
                (MemorySegment) (descriptorPool != null ? descriptorPool.segment() : MemorySegment.NULL),
                (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkDestroyDescriptorSetLayout.html"><code>vkDestroyDescriptorSetLayout</code></a>
    public void destroyDescriptorSetLayout(
        VkDevice device,
        @Nullable VkDescriptorSetLayout descriptorSetLayout,
        @Nullable @Pointer VkAllocationCallbacks pAllocator
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkDestroyDescriptorSetLayout);
        try {
            hFunction.invokeExact(
                device.segment(),
                (MemorySegment) (descriptorSetLayout != null ? descriptorSetLayout.segment() : MemorySegment.NULL),
                (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkDestroyDescriptorUpdateTemplate.html"><code>vkDestroyDescriptorUpdateTemplate</code></a>
    public void destroyDescriptorUpdateTemplate(
        VkDevice device,
        @Nullable VkDescriptorUpdateTemplate descriptorUpdateTemplate,
        @Nullable @Pointer VkAllocationCallbacks pAllocator
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkDestroyDescriptorUpdateTemplate);
        try {
            hFunction.invokeExact(
                device.segment(),
                (MemorySegment) (descriptorUpdateTemplate != null ? descriptorUpdateTemplate.segment() : MemorySegment.NULL),
                (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkDestroyDescriptorUpdateTemplateKHR.html"><code>vkDestroyDescriptorUpdateTemplateKHR</code></a>
    public void destroyDescriptorUpdateTemplateKHR(
        VkDevice device,
        @Nullable VkDescriptorUpdateTemplate descriptorUpdateTemplate,
        @Nullable @Pointer VkAllocationCallbacks pAllocator
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkDestroyDescriptorUpdateTemplateKHR);
        try {
            hFunction.invokeExact(
                device.segment(),
                (MemorySegment) (descriptorUpdateTemplate != null ? descriptorUpdateTemplate.segment() : MemorySegment.NULL),
                (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkDestroyDevice.html"><code>vkDestroyDevice</code></a>
    public void destroyDevice(
        @Nullable VkDevice device,
        @Nullable @Pointer VkAllocationCallbacks pAllocator
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkDestroyDevice);
        try {
            hFunction.invokeExact(
                (MemorySegment) (device != null ? device.segment() : MemorySegment.NULL),
                (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkDestroyEvent.html"><code>vkDestroyEvent</code></a>
    public void destroyEvent(
        VkDevice device,
        @Nullable VkEvent event,
        @Nullable @Pointer VkAllocationCallbacks pAllocator
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkDestroyEvent);
        try {
            hFunction.invokeExact(
                device.segment(),
                (MemorySegment) (event != null ? event.segment() : MemorySegment.NULL),
                (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkDestroyExternalComputeQueueNV.html"><code>vkDestroyExternalComputeQueueNV</code></a>
    public void destroyExternalComputeQueueNV(
        VkDevice device,
        VkExternalComputeQueueNV externalQueue,
        @Nullable @Pointer VkAllocationCallbacks pAllocator
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkDestroyExternalComputeQueueNV);
        try {
            hFunction.invokeExact(
                device.segment(),
                externalQueue.segment(),
                (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkDestroyFence.html"><code>vkDestroyFence</code></a>
    public void destroyFence(
        VkDevice device,
        @Nullable VkFence fence,
        @Nullable @Pointer VkAllocationCallbacks pAllocator
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkDestroyFence);
        try {
            hFunction.invokeExact(
                device.segment(),
                (MemorySegment) (fence != null ? fence.segment() : MemorySegment.NULL),
                (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkDestroyFramebuffer.html"><code>vkDestroyFramebuffer</code></a>
    public void destroyFramebuffer(
        VkDevice device,
        @Nullable VkFramebuffer framebuffer,
        @Nullable @Pointer VkAllocationCallbacks pAllocator
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkDestroyFramebuffer);
        try {
            hFunction.invokeExact(
                device.segment(),
                (MemorySegment) (framebuffer != null ? framebuffer.segment() : MemorySegment.NULL),
                (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkDestroyImage.html"><code>vkDestroyImage</code></a>
    public void destroyImage(
        VkDevice device,
        @Nullable VkImage image,
        @Nullable @Pointer VkAllocationCallbacks pAllocator
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkDestroyImage);
        try {
            hFunction.invokeExact(
                device.segment(),
                (MemorySegment) (image != null ? image.segment() : MemorySegment.NULL),
                (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkDestroyImageView.html"><code>vkDestroyImageView</code></a>
    public void destroyImageView(
        VkDevice device,
        @Nullable VkImageView imageView,
        @Nullable @Pointer VkAllocationCallbacks pAllocator
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkDestroyImageView);
        try {
            hFunction.invokeExact(
                device.segment(),
                (MemorySegment) (imageView != null ? imageView.segment() : MemorySegment.NULL),
                (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkDestroyIndirectCommandsLayoutEXT.html"><code>vkDestroyIndirectCommandsLayoutEXT</code></a>
    public void destroyIndirectCommandsLayoutEXT(
        VkDevice device,
        @Nullable VkIndirectCommandsLayoutEXT indirectCommandsLayout,
        @Nullable @Pointer VkAllocationCallbacks pAllocator
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkDestroyIndirectCommandsLayoutEXT);
        try {
            hFunction.invokeExact(
                device.segment(),
                (MemorySegment) (indirectCommandsLayout != null ? indirectCommandsLayout.segment() : MemorySegment.NULL),
                (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkDestroyIndirectCommandsLayoutNV.html"><code>vkDestroyIndirectCommandsLayoutNV</code></a>
    public void destroyIndirectCommandsLayoutNV(
        VkDevice device,
        @Nullable VkIndirectCommandsLayoutNV indirectCommandsLayout,
        @Nullable @Pointer VkAllocationCallbacks pAllocator
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkDestroyIndirectCommandsLayoutNV);
        try {
            hFunction.invokeExact(
                device.segment(),
                (MemorySegment) (indirectCommandsLayout != null ? indirectCommandsLayout.segment() : MemorySegment.NULL),
                (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkDestroyIndirectExecutionSetEXT.html"><code>vkDestroyIndirectExecutionSetEXT</code></a>
    public void destroyIndirectExecutionSetEXT(
        VkDevice device,
        @Nullable VkIndirectExecutionSetEXT indirectExecutionSet,
        @Nullable @Pointer VkAllocationCallbacks pAllocator
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkDestroyIndirectExecutionSetEXT);
        try {
            hFunction.invokeExact(
                device.segment(),
                (MemorySegment) (indirectExecutionSet != null ? indirectExecutionSet.segment() : MemorySegment.NULL),
                (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkDestroyMicromapEXT.html"><code>vkDestroyMicromapEXT</code></a>
    public void destroyMicromapEXT(
        VkDevice device,
        @Nullable VkMicromapEXT micromap,
        @Nullable @Pointer VkAllocationCallbacks pAllocator
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkDestroyMicromapEXT);
        try {
            hFunction.invokeExact(
                device.segment(),
                (MemorySegment) (micromap != null ? micromap.segment() : MemorySegment.NULL),
                (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkDestroyOpticalFlowSessionNV.html"><code>vkDestroyOpticalFlowSessionNV</code></a>
    public void destroyOpticalFlowSessionNV(
        VkDevice device,
        VkOpticalFlowSessionNV session,
        @Nullable @Pointer VkAllocationCallbacks pAllocator
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkDestroyOpticalFlowSessionNV);
        try {
            hFunction.invokeExact(
                device.segment(),
                session.segment(),
                (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkDestroyPipeline.html"><code>vkDestroyPipeline</code></a>
    public void destroyPipeline(
        VkDevice device,
        @Nullable VkPipeline pipeline,
        @Nullable @Pointer VkAllocationCallbacks pAllocator
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkDestroyPipeline);
        try {
            hFunction.invokeExact(
                device.segment(),
                (MemorySegment) (pipeline != null ? pipeline.segment() : MemorySegment.NULL),
                (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkDestroyPipelineBinaryKHR.html"><code>vkDestroyPipelineBinaryKHR</code></a>
    public void destroyPipelineBinaryKHR(
        VkDevice device,
        @Nullable VkPipelineBinaryKHR pipelineBinary,
        @Nullable @Pointer VkAllocationCallbacks pAllocator
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkDestroyPipelineBinaryKHR);
        try {
            hFunction.invokeExact(
                device.segment(),
                (MemorySegment) (pipelineBinary != null ? pipelineBinary.segment() : MemorySegment.NULL),
                (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkDestroyPipelineCache.html"><code>vkDestroyPipelineCache</code></a>
    public void destroyPipelineCache(
        VkDevice device,
        @Nullable VkPipelineCache pipelineCache,
        @Nullable @Pointer VkAllocationCallbacks pAllocator
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkDestroyPipelineCache);
        try {
            hFunction.invokeExact(
                device.segment(),
                (MemorySegment) (pipelineCache != null ? pipelineCache.segment() : MemorySegment.NULL),
                (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkDestroyPipelineLayout.html"><code>vkDestroyPipelineLayout</code></a>
    public void destroyPipelineLayout(
        VkDevice device,
        @Nullable VkPipelineLayout pipelineLayout,
        @Nullable @Pointer VkAllocationCallbacks pAllocator
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkDestroyPipelineLayout);
        try {
            hFunction.invokeExact(
                device.segment(),
                (MemorySegment) (pipelineLayout != null ? pipelineLayout.segment() : MemorySegment.NULL),
                (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkDestroyPrivateDataSlot.html"><code>vkDestroyPrivateDataSlot</code></a>
    public void destroyPrivateDataSlot(
        VkDevice device,
        @Nullable VkPrivateDataSlot privateDataSlot,
        @Nullable @Pointer VkAllocationCallbacks pAllocator
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkDestroyPrivateDataSlot);
        try {
            hFunction.invokeExact(
                device.segment(),
                (MemorySegment) (privateDataSlot != null ? privateDataSlot.segment() : MemorySegment.NULL),
                (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkDestroyPrivateDataSlotEXT.html"><code>vkDestroyPrivateDataSlotEXT</code></a>
    public void destroyPrivateDataSlotEXT(
        VkDevice device,
        @Nullable VkPrivateDataSlot privateDataSlot,
        @Nullable @Pointer VkAllocationCallbacks pAllocator
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkDestroyPrivateDataSlotEXT);
        try {
            hFunction.invokeExact(
                device.segment(),
                (MemorySegment) (privateDataSlot != null ? privateDataSlot.segment() : MemorySegment.NULL),
                (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkDestroyQueryPool.html"><code>vkDestroyQueryPool</code></a>
    public void destroyQueryPool(
        VkDevice device,
        @Nullable VkQueryPool queryPool,
        @Nullable @Pointer VkAllocationCallbacks pAllocator
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkDestroyQueryPool);
        try {
            hFunction.invokeExact(
                device.segment(),
                (MemorySegment) (queryPool != null ? queryPool.segment() : MemorySegment.NULL),
                (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkDestroyRenderPass.html"><code>vkDestroyRenderPass</code></a>
    public void destroyRenderPass(
        VkDevice device,
        @Nullable VkRenderPass renderPass,
        @Nullable @Pointer VkAllocationCallbacks pAllocator
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkDestroyRenderPass);
        try {
            hFunction.invokeExact(
                device.segment(),
                (MemorySegment) (renderPass != null ? renderPass.segment() : MemorySegment.NULL),
                (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkDestroySampler.html"><code>vkDestroySampler</code></a>
    public void destroySampler(
        VkDevice device,
        @Nullable VkSampler sampler,
        @Nullable @Pointer VkAllocationCallbacks pAllocator
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkDestroySampler);
        try {
            hFunction.invokeExact(
                device.segment(),
                (MemorySegment) (sampler != null ? sampler.segment() : MemorySegment.NULL),
                (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkDestroySamplerYcbcrConversion.html"><code>vkDestroySamplerYcbcrConversion</code></a>
    public void destroySamplerYcbcrConversion(
        VkDevice device,
        @Nullable VkSamplerYcbcrConversion ycbcrConversion,
        @Nullable @Pointer VkAllocationCallbacks pAllocator
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkDestroySamplerYcbcrConversion);
        try {
            hFunction.invokeExact(
                device.segment(),
                (MemorySegment) (ycbcrConversion != null ? ycbcrConversion.segment() : MemorySegment.NULL),
                (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkDestroySamplerYcbcrConversionKHR.html"><code>vkDestroySamplerYcbcrConversionKHR</code></a>
    public void destroySamplerYcbcrConversionKHR(
        VkDevice device,
        @Nullable VkSamplerYcbcrConversion ycbcrConversion,
        @Nullable @Pointer VkAllocationCallbacks pAllocator
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkDestroySamplerYcbcrConversionKHR);
        try {
            hFunction.invokeExact(
                device.segment(),
                (MemorySegment) (ycbcrConversion != null ? ycbcrConversion.segment() : MemorySegment.NULL),
                (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkDestroySemaphore.html"><code>vkDestroySemaphore</code></a>
    public void destroySemaphore(
        VkDevice device,
        @Nullable VkSemaphore semaphore,
        @Nullable @Pointer VkAllocationCallbacks pAllocator
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkDestroySemaphore);
        try {
            hFunction.invokeExact(
                device.segment(),
                (MemorySegment) (semaphore != null ? semaphore.segment() : MemorySegment.NULL),
                (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkDestroySemaphoreSciSyncPoolNV.html"><code>vkDestroySemaphoreSciSyncPoolNV</code></a>
    public void destroySemaphoreSciSyncPoolNV(
        VkDevice device,
        @Nullable VkSemaphoreSciSyncPoolNV semaphorePool,
        @Nullable @Pointer VkAllocationCallbacks pAllocator
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkDestroySemaphoreSciSyncPoolNV);
        try {
            hFunction.invokeExact(
                device.segment(),
                (MemorySegment) (semaphorePool != null ? semaphorePool.segment() : MemorySegment.NULL),
                (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkDestroyShaderEXT.html"><code>vkDestroyShaderEXT</code></a>
    public void destroyShaderEXT(
        VkDevice device,
        @Nullable VkShaderEXT shader,
        @Nullable @Pointer VkAllocationCallbacks pAllocator
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkDestroyShaderEXT);
        try {
            hFunction.invokeExact(
                device.segment(),
                (MemorySegment) (shader != null ? shader.segment() : MemorySegment.NULL),
                (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkDestroyShaderModule.html"><code>vkDestroyShaderModule</code></a>
    public void destroyShaderModule(
        VkDevice device,
        @Nullable VkShaderModule shaderModule,
        @Nullable @Pointer VkAllocationCallbacks pAllocator
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkDestroyShaderModule);
        try {
            hFunction.invokeExact(
                device.segment(),
                (MemorySegment) (shaderModule != null ? shaderModule.segment() : MemorySegment.NULL),
                (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkDestroySwapchainKHR.html"><code>vkDestroySwapchainKHR</code></a>
    public void destroySwapchainKHR(
        VkDevice device,
        @Nullable VkSwapchainKHR swapchain,
        @Nullable @Pointer VkAllocationCallbacks pAllocator
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkDestroySwapchainKHR);
        try {
            hFunction.invokeExact(
                device.segment(),
                (MemorySegment) (swapchain != null ? swapchain.segment() : MemorySegment.NULL),
                (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkDestroyValidationCacheEXT.html"><code>vkDestroyValidationCacheEXT</code></a>
    public void destroyValidationCacheEXT(
        VkDevice device,
        @Nullable VkValidationCacheEXT validationCache,
        @Nullable @Pointer VkAllocationCallbacks pAllocator
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkDestroyValidationCacheEXT);
        try {
            hFunction.invokeExact(
                device.segment(),
                (MemorySegment) (validationCache != null ? validationCache.segment() : MemorySegment.NULL),
                (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkDestroyVideoSessionKHR.html"><code>vkDestroyVideoSessionKHR</code></a>
    public void destroyVideoSessionKHR(
        VkDevice device,
        @Nullable VkVideoSessionKHR videoSession,
        @Nullable @Pointer VkAllocationCallbacks pAllocator
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkDestroyVideoSessionKHR);
        try {
            hFunction.invokeExact(
                device.segment(),
                (MemorySegment) (videoSession != null ? videoSession.segment() : MemorySegment.NULL),
                (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkDestroyVideoSessionParametersKHR.html"><code>vkDestroyVideoSessionParametersKHR</code></a>
    public void destroyVideoSessionParametersKHR(
        VkDevice device,
        @Nullable VkVideoSessionParametersKHR videoSessionParameters,
        @Nullable @Pointer VkAllocationCallbacks pAllocator
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkDestroyVideoSessionParametersKHR);
        try {
            hFunction.invokeExact(
                device.segment(),
                (MemorySegment) (videoSessionParameters != null ? videoSessionParameters.segment() : MemorySegment.NULL),
                (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkDeviceWaitIdle.html"><code>vkDeviceWaitIdle</code></a>
    public @EnumType(VkResult.class) int deviceWaitIdle(
        VkDevice device
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkDeviceWaitIdle);
        try {
            return (int) hFunction.invokeExact(
                device.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkDisplayPowerControlEXT.html"><code>vkDisplayPowerControlEXT</code></a>
    public @EnumType(VkResult.class) int displayPowerControlEXT(
        VkDevice device,
        VkDisplayKHR display,
        @Pointer VkDisplayPowerInfoEXT pDisplayPowerInfo
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkDisplayPowerControlEXT);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                display.segment(),
                pDisplayPowerInfo.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkEndCommandBuffer.html"><code>vkEndCommandBuffer</code></a>
    public @EnumType(VkResult.class) int endCommandBuffer(
        VkCommandBuffer commandBuffer
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkEndCommandBuffer);
        try {
            return (int) hFunction.invokeExact(
                commandBuffer.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkExportMetalObjectsEXT.html"><code>vkExportMetalObjectsEXT</code></a>
    public void exportMetalObjectsEXT(
        VkDevice device,
        @Pointer VkExportMetalObjectsInfoEXT pMetalObjectsInfo
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkExportMetalObjectsEXT);
        try {
            hFunction.invokeExact(
                device.segment(),
                pMetalObjectsInfo.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkFlushMappedMemoryRanges.html"><code>vkFlushMappedMemoryRanges</code></a>
    public @EnumType(VkResult.class) int flushMappedMemoryRanges(
        VkDevice device,
        @Unsigned int memoryRangeCount,
        @Pointer IVkMappedMemoryRange pMemoryRanges
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkFlushMappedMemoryRanges);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                memoryRangeCount,
                pMemoryRanges.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkFreeCommandBuffers.html"><code>vkFreeCommandBuffers</code></a>
    public void freeCommandBuffers(
        VkDevice device,
        VkCommandPool commandPool,
        @Unsigned int commandBufferCount,
        @Pointer VkCommandBuffer.Ptr pCommandBuffers
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkFreeCommandBuffers);
        try {
            hFunction.invokeExact(
                device.segment(),
                commandPool.segment(),
                commandBufferCount,
                pCommandBuffers.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkFreeDescriptorSets.html"><code>vkFreeDescriptorSets</code></a>
    public @EnumType(VkResult.class) int freeDescriptorSets(
        VkDevice device,
        VkDescriptorPool descriptorPool,
        @Unsigned int descriptorSetCount,
        @Pointer VkDescriptorSet.Ptr pDescriptorSets
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkFreeDescriptorSets);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                descriptorPool.segment(),
                descriptorSetCount,
                pDescriptorSets.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkFreeMemory.html"><code>vkFreeMemory</code></a>
    public void freeMemory(
        VkDevice device,
        @Nullable VkDeviceMemory memory,
        @Nullable @Pointer VkAllocationCallbacks pAllocator
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkFreeMemory);
        try {
            hFunction.invokeExact(
                device.segment(),
                (MemorySegment) (memory != null ? memory.segment() : MemorySegment.NULL),
                (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkGetAccelerationStructureBuildSizesKHR.html"><code>vkGetAccelerationStructureBuildSizesKHR</code></a>
    public void getAccelerationStructureBuildSizesKHR(
        VkDevice device,
        @EnumType(VkAccelerationStructureBuildTypeKHR.class) int buildType,
        @Pointer VkAccelerationStructureBuildGeometryInfoKHR pBuildInfo,
        @Nullable @Unsigned IntPtr pMaxPrimitiveCounts,
        @Pointer VkAccelerationStructureBuildSizesInfoKHR pSizeInfo
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkGetAccelerationStructureBuildSizesKHR);
        try {
            hFunction.invokeExact(
                device.segment(),
                buildType,
                pBuildInfo.segment(),
                (MemorySegment) (pMaxPrimitiveCounts != null ? pMaxPrimitiveCounts.segment() : MemorySegment.NULL),
                pSizeInfo.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkGetAccelerationStructureDeviceAddressKHR.html"><code>vkGetAccelerationStructureDeviceAddressKHR</code></a>
    public @NativeType("VkDeviceAddress") @Unsigned long getAccelerationStructureDeviceAddressKHR(
        VkDevice device,
        @Pointer VkAccelerationStructureDeviceAddressInfoKHR pInfo
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkGetAccelerationStructureDeviceAddressKHR);
        try {
            return (long) hFunction.invokeExact(
                device.segment(),
                pInfo.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkGetAccelerationStructureHandleNV.html"><code>vkGetAccelerationStructureHandleNV</code></a>
    public @EnumType(VkResult.class) int getAccelerationStructureHandleNV(
        VkDevice device,
        VkAccelerationStructureNV accelerationStructure,
        long dataSize,
        @Pointer(comment="void*") @NotNull MemorySegment pData
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkGetAccelerationStructureHandleNV);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                accelerationStructure.segment(),
                MemorySegment.ofAddress(dataSize),
                pData
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkGetAccelerationStructureMemoryRequirementsNV.html"><code>vkGetAccelerationStructureMemoryRequirementsNV</code></a>
    public void getAccelerationStructureMemoryRequirementsNV(
        VkDevice device,
        @Pointer VkAccelerationStructureMemoryRequirementsInfoNV pInfo,
        @Pointer VkMemoryRequirements2 pMemoryRequirements
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkGetAccelerationStructureMemoryRequirementsNV);
        try {
            hFunction.invokeExact(
                device.segment(),
                pInfo.segment(),
                pMemoryRequirements.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkGetAccelerationStructureOpaqueCaptureDescriptorDataEXT.html"><code>vkGetAccelerationStructureOpaqueCaptureDescriptorDataEXT</code></a>
    public @EnumType(VkResult.class) int getAccelerationStructureOpaqueCaptureDescriptorDataEXT(
        VkDevice device,
        @Pointer VkAccelerationStructureCaptureDescriptorDataInfoEXT pInfo,
        @Pointer(comment="void*") @NotNull MemorySegment pData
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkGetAccelerationStructureOpaqueCaptureDescriptorDataEXT);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                pInfo.segment(),
                pData
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkGetAndroidHardwareBufferPropertiesANDROID.html"><code>vkGetAndroidHardwareBufferPropertiesANDROID</code></a>
    public @EnumType(VkResult.class) int getAndroidHardwareBufferPropertiesANDROID(
        VkDevice device,
        PointerPtr buffer,
        @Pointer VkAndroidHardwareBufferPropertiesANDROID pProperties
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkGetAndroidHardwareBufferPropertiesANDROID);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                buffer.segment(),
                pProperties.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkGetBufferCollectionPropertiesFUCHSIA.html"><code>vkGetBufferCollectionPropertiesFUCHSIA</code></a>
    public @EnumType(VkResult.class) int getBufferCollectionPropertiesFUCHSIA(
        VkDevice device,
        VkBufferCollectionFUCHSIA collection,
        @Pointer VkBufferCollectionPropertiesFUCHSIA pProperties
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkGetBufferCollectionPropertiesFUCHSIA);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                collection.segment(),
                pProperties.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkGetBufferDeviceAddress.html"><code>vkGetBufferDeviceAddress</code></a>
    public @NativeType("VkDeviceAddress") @Unsigned long getBufferDeviceAddress(
        VkDevice device,
        @Pointer VkBufferDeviceAddressInfo pInfo
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkGetBufferDeviceAddress);
        try {
            return (long) hFunction.invokeExact(
                device.segment(),
                pInfo.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkGetBufferDeviceAddressEXT.html"><code>vkGetBufferDeviceAddressEXT</code></a>
    public @NativeType("VkDeviceAddress") @Unsigned long getBufferDeviceAddressEXT(
        VkDevice device,
        @Pointer VkBufferDeviceAddressInfo pInfo
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkGetBufferDeviceAddressEXT);
        try {
            return (long) hFunction.invokeExact(
                device.segment(),
                pInfo.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkGetBufferDeviceAddressKHR.html"><code>vkGetBufferDeviceAddressKHR</code></a>
    public @NativeType("VkDeviceAddress") @Unsigned long getBufferDeviceAddressKHR(
        VkDevice device,
        @Pointer VkBufferDeviceAddressInfo pInfo
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkGetBufferDeviceAddressKHR);
        try {
            return (long) hFunction.invokeExact(
                device.segment(),
                pInfo.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkGetBufferMemoryRequirements.html"><code>vkGetBufferMemoryRequirements</code></a>
    public void getBufferMemoryRequirements(
        VkDevice device,
        VkBuffer buffer,
        @Pointer VkMemoryRequirements pMemoryRequirements
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkGetBufferMemoryRequirements);
        try {
            hFunction.invokeExact(
                device.segment(),
                buffer.segment(),
                pMemoryRequirements.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkGetBufferMemoryRequirements2.html"><code>vkGetBufferMemoryRequirements2</code></a>
    public void getBufferMemoryRequirements2(
        VkDevice device,
        @Pointer VkBufferMemoryRequirementsInfo2 pInfo,
        @Pointer VkMemoryRequirements2 pMemoryRequirements
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkGetBufferMemoryRequirements2);
        try {
            hFunction.invokeExact(
                device.segment(),
                pInfo.segment(),
                pMemoryRequirements.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkGetBufferMemoryRequirements2KHR.html"><code>vkGetBufferMemoryRequirements2KHR</code></a>
    public void getBufferMemoryRequirements2KHR(
        VkDevice device,
        @Pointer VkBufferMemoryRequirementsInfo2 pInfo,
        @Pointer VkMemoryRequirements2 pMemoryRequirements
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkGetBufferMemoryRequirements2KHR);
        try {
            hFunction.invokeExact(
                device.segment(),
                pInfo.segment(),
                pMemoryRequirements.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkGetBufferOpaqueCaptureAddress.html"><code>vkGetBufferOpaqueCaptureAddress</code></a>
    public @Unsigned long getBufferOpaqueCaptureAddress(
        VkDevice device,
        @Pointer VkBufferDeviceAddressInfo pInfo
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkGetBufferOpaqueCaptureAddress);
        try {
            return (long) hFunction.invokeExact(
                device.segment(),
                pInfo.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkGetBufferOpaqueCaptureAddressKHR.html"><code>vkGetBufferOpaqueCaptureAddressKHR</code></a>
    public @Unsigned long getBufferOpaqueCaptureAddressKHR(
        VkDevice device,
        @Pointer VkBufferDeviceAddressInfo pInfo
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkGetBufferOpaqueCaptureAddressKHR);
        try {
            return (long) hFunction.invokeExact(
                device.segment(),
                pInfo.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkGetBufferOpaqueCaptureDescriptorDataEXT.html"><code>vkGetBufferOpaqueCaptureDescriptorDataEXT</code></a>
    public @EnumType(VkResult.class) int getBufferOpaqueCaptureDescriptorDataEXT(
        VkDevice device,
        @Pointer VkBufferCaptureDescriptorDataInfoEXT pInfo,
        @Pointer(comment="void*") @NotNull MemorySegment pData
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkGetBufferOpaqueCaptureDescriptorDataEXT);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                pInfo.segment(),
                pData
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkGetCalibratedTimestampsEXT.html"><code>vkGetCalibratedTimestampsEXT</code></a>
    public @EnumType(VkResult.class) int getCalibratedTimestampsEXT(
        VkDevice device,
        @Unsigned int timestampCount,
        @Pointer IVkCalibratedTimestampInfoKHR pTimestampInfos,
        @Unsigned LongPtr pTimestamps,
        @Unsigned LongPtr pMaxDeviation
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkGetCalibratedTimestampsEXT);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                timestampCount,
                pTimestampInfos.segment(),
                pTimestamps.segment(),
                pMaxDeviation.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkGetCalibratedTimestampsKHR.html"><code>vkGetCalibratedTimestampsKHR</code></a>
    public @EnumType(VkResult.class) int getCalibratedTimestampsKHR(
        VkDevice device,
        @Unsigned int timestampCount,
        @Pointer IVkCalibratedTimestampInfoKHR pTimestampInfos,
        @Unsigned LongPtr pTimestamps,
        @Unsigned LongPtr pMaxDeviation
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkGetCalibratedTimestampsKHR);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                timestampCount,
                pTimestampInfos.segment(),
                pTimestamps.segment(),
                pMaxDeviation.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkGetClusterAccelerationStructureBuildSizesNV.html"><code>vkGetClusterAccelerationStructureBuildSizesNV</code></a>
    public void getClusterAccelerationStructureBuildSizesNV(
        VkDevice device,
        @Pointer VkClusterAccelerationStructureInputInfoNV pInfo,
        @Pointer VkAccelerationStructureBuildSizesInfoKHR pSizeInfo
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkGetClusterAccelerationStructureBuildSizesNV);
        try {
            hFunction.invokeExact(
                device.segment(),
                pInfo.segment(),
                pSizeInfo.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkGetCudaModuleCacheNV.html"><code>vkGetCudaModuleCacheNV</code></a>
    public @EnumType(VkResult.class) int getCudaModuleCacheNV(
        VkDevice device,
        VkCudaModuleNV module,
        PointerPtr pCacheSize,
        @Pointer(comment="void*") @NotNull MemorySegment pCacheData
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkGetCudaModuleCacheNV);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                module.segment(),
                pCacheSize.segment(),
                pCacheData
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkGetDeferredOperationMaxConcurrencyKHR.html"><code>vkGetDeferredOperationMaxConcurrencyKHR</code></a>
    public @Unsigned int getDeferredOperationMaxConcurrencyKHR(
        VkDevice device,
        VkDeferredOperationKHR operation
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkGetDeferredOperationMaxConcurrencyKHR);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                operation.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkGetDeferredOperationResultKHR.html"><code>vkGetDeferredOperationResultKHR</code></a>
    public @EnumType(VkResult.class) int getDeferredOperationResultKHR(
        VkDevice device,
        VkDeferredOperationKHR operation
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkGetDeferredOperationResultKHR);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                operation.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkGetDescriptorEXT.html"><code>vkGetDescriptorEXT</code></a>
    public void getDescriptorEXT(
        VkDevice device,
        @Pointer VkDescriptorGetInfoEXT pDescriptorInfo,
        long dataSize,
        @Pointer(comment="void*") @NotNull MemorySegment pDescriptor
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkGetDescriptorEXT);
        try {
            hFunction.invokeExact(
                device.segment(),
                pDescriptorInfo.segment(),
                MemorySegment.ofAddress(dataSize),
                pDescriptor
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkGetDescriptorSetHostMappingVALVE.html"><code>vkGetDescriptorSetHostMappingVALVE</code></a>
    public void getDescriptorSetHostMappingVALVE(
        VkDevice device,
        VkDescriptorSet descriptorSet,
        PointerPtr ppData
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkGetDescriptorSetHostMappingVALVE);
        try {
            hFunction.invokeExact(
                device.segment(),
                descriptorSet.segment(),
                ppData.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkGetDescriptorSetLayoutBindingOffsetEXT.html"><code>vkGetDescriptorSetLayoutBindingOffsetEXT</code></a>
    public void getDescriptorSetLayoutBindingOffsetEXT(
        VkDevice device,
        VkDescriptorSetLayout layout,
        @Unsigned int binding,
        @Pointer(comment="VkDeviceSize") @Unsigned LongPtr pOffset
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkGetDescriptorSetLayoutBindingOffsetEXT);
        try {
            hFunction.invokeExact(
                device.segment(),
                layout.segment(),
                binding,
                pOffset.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkGetDescriptorSetLayoutHostMappingInfoVALVE.html"><code>vkGetDescriptorSetLayoutHostMappingInfoVALVE</code></a>
    public void getDescriptorSetLayoutHostMappingInfoVALVE(
        VkDevice device,
        @Pointer VkDescriptorSetBindingReferenceVALVE pBindingReference,
        @Pointer VkDescriptorSetLayoutHostMappingInfoVALVE pHostMapping
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkGetDescriptorSetLayoutHostMappingInfoVALVE);
        try {
            hFunction.invokeExact(
                device.segment(),
                pBindingReference.segment(),
                pHostMapping.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkGetDescriptorSetLayoutSizeEXT.html"><code>vkGetDescriptorSetLayoutSizeEXT</code></a>
    public void getDescriptorSetLayoutSizeEXT(
        VkDevice device,
        VkDescriptorSetLayout layout,
        @Pointer(comment="VkDeviceSize") @Unsigned LongPtr pLayoutSizeInBytes
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkGetDescriptorSetLayoutSizeEXT);
        try {
            hFunction.invokeExact(
                device.segment(),
                layout.segment(),
                pLayoutSizeInBytes.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkGetDescriptorSetLayoutSupport.html"><code>vkGetDescriptorSetLayoutSupport</code></a>
    public void getDescriptorSetLayoutSupport(
        VkDevice device,
        @Pointer VkDescriptorSetLayoutCreateInfo pCreateInfo,
        @Pointer VkDescriptorSetLayoutSupport pSupport
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkGetDescriptorSetLayoutSupport);
        try {
            hFunction.invokeExact(
                device.segment(),
                pCreateInfo.segment(),
                pSupport.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkGetDescriptorSetLayoutSupportKHR.html"><code>vkGetDescriptorSetLayoutSupportKHR</code></a>
    public void getDescriptorSetLayoutSupportKHR(
        VkDevice device,
        @Pointer VkDescriptorSetLayoutCreateInfo pCreateInfo,
        @Pointer VkDescriptorSetLayoutSupport pSupport
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkGetDescriptorSetLayoutSupportKHR);
        try {
            hFunction.invokeExact(
                device.segment(),
                pCreateInfo.segment(),
                pSupport.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkGetDeviceAccelerationStructureCompatibilityKHR.html"><code>vkGetDeviceAccelerationStructureCompatibilityKHR</code></a>
    public void getDeviceAccelerationStructureCompatibilityKHR(
        VkDevice device,
        @Pointer VkAccelerationStructureVersionInfoKHR pVersionInfo,
        @EnumType(VkAccelerationStructureCompatibilityKHR.class) IntPtr pCompatibility
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkGetDeviceAccelerationStructureCompatibilityKHR);
        try {
            hFunction.invokeExact(
                device.segment(),
                pVersionInfo.segment(),
                pCompatibility.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkGetDeviceBufferMemoryRequirements.html"><code>vkGetDeviceBufferMemoryRequirements</code></a>
    public void getDeviceBufferMemoryRequirements(
        VkDevice device,
        @Pointer VkDeviceBufferMemoryRequirements pInfo,
        @Pointer VkMemoryRequirements2 pMemoryRequirements
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkGetDeviceBufferMemoryRequirements);
        try {
            hFunction.invokeExact(
                device.segment(),
                pInfo.segment(),
                pMemoryRequirements.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkGetDeviceBufferMemoryRequirementsKHR.html"><code>vkGetDeviceBufferMemoryRequirementsKHR</code></a>
    public void getDeviceBufferMemoryRequirementsKHR(
        VkDevice device,
        @Pointer VkDeviceBufferMemoryRequirements pInfo,
        @Pointer VkMemoryRequirements2 pMemoryRequirements
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkGetDeviceBufferMemoryRequirementsKHR);
        try {
            hFunction.invokeExact(
                device.segment(),
                pInfo.segment(),
                pMemoryRequirements.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkGetDeviceFaultInfoEXT.html"><code>vkGetDeviceFaultInfoEXT</code></a>
    public @EnumType(VkResult.class) int getDeviceFaultInfoEXT(
        VkDevice device,
        @Pointer VkDeviceFaultCountsEXT pFaultCounts,
        @Nullable @Pointer VkDeviceFaultInfoEXT pFaultInfo
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkGetDeviceFaultInfoEXT);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                pFaultCounts.segment(),
                (MemorySegment) (pFaultInfo != null ? pFaultInfo.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkGetDeviceGroupPeerMemoryFeatures.html"><code>vkGetDeviceGroupPeerMemoryFeatures</code></a>
    public void getDeviceGroupPeerMemoryFeatures(
        VkDevice device,
        @Unsigned int heapIndex,
        @Unsigned int localDeviceIndex,
        @Unsigned int remoteDeviceIndex,
        @EnumType(VkPeerMemoryFeatureFlags.class) IntPtr pPeerMemoryFeatures
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkGetDeviceGroupPeerMemoryFeatures);
        try {
            hFunction.invokeExact(
                device.segment(),
                heapIndex,
                localDeviceIndex,
                remoteDeviceIndex,
                pPeerMemoryFeatures.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkGetDeviceGroupPeerMemoryFeaturesKHR.html"><code>vkGetDeviceGroupPeerMemoryFeaturesKHR</code></a>
    public void getDeviceGroupPeerMemoryFeaturesKHR(
        VkDevice device,
        @Unsigned int heapIndex,
        @Unsigned int localDeviceIndex,
        @Unsigned int remoteDeviceIndex,
        @EnumType(VkPeerMemoryFeatureFlags.class) IntPtr pPeerMemoryFeatures
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkGetDeviceGroupPeerMemoryFeaturesKHR);
        try {
            hFunction.invokeExact(
                device.segment(),
                heapIndex,
                localDeviceIndex,
                remoteDeviceIndex,
                pPeerMemoryFeatures.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkGetDeviceGroupPresentCapabilitiesKHR.html"><code>vkGetDeviceGroupPresentCapabilitiesKHR</code></a>
    public @EnumType(VkResult.class) int getDeviceGroupPresentCapabilitiesKHR(
        VkDevice device,
        @Pointer VkDeviceGroupPresentCapabilitiesKHR pDeviceGroupPresentCapabilities
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkGetDeviceGroupPresentCapabilitiesKHR);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                pDeviceGroupPresentCapabilities.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkGetDeviceGroupSurfacePresentModes2EXT.html"><code>vkGetDeviceGroupSurfacePresentModes2EXT</code></a>
    public @EnumType(VkResult.class) int getDeviceGroupSurfacePresentModes2EXT(
        VkDevice device,
        @Pointer VkPhysicalDeviceSurfaceInfo2KHR pSurfaceInfo,
        @EnumType(VkDeviceGroupPresentModeFlagsKHR.class) IntPtr pModes
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkGetDeviceGroupSurfacePresentModes2EXT);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                pSurfaceInfo.segment(),
                pModes.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkGetDeviceGroupSurfacePresentModesKHR.html"><code>vkGetDeviceGroupSurfacePresentModesKHR</code></a>
    public @EnumType(VkResult.class) int getDeviceGroupSurfacePresentModesKHR(
        VkDevice device,
        VkSurfaceKHR surface,
        @EnumType(VkDeviceGroupPresentModeFlagsKHR.class) IntPtr pModes
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkGetDeviceGroupSurfacePresentModesKHR);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                surface.segment(),
                pModes.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkGetDeviceImageMemoryRequirements.html"><code>vkGetDeviceImageMemoryRequirements</code></a>
    public void getDeviceImageMemoryRequirements(
        VkDevice device,
        @Pointer VkDeviceImageMemoryRequirements pInfo,
        @Pointer VkMemoryRequirements2 pMemoryRequirements
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkGetDeviceImageMemoryRequirements);
        try {
            hFunction.invokeExact(
                device.segment(),
                pInfo.segment(),
                pMemoryRequirements.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkGetDeviceImageMemoryRequirementsKHR.html"><code>vkGetDeviceImageMemoryRequirementsKHR</code></a>
    public void getDeviceImageMemoryRequirementsKHR(
        VkDevice device,
        @Pointer VkDeviceImageMemoryRequirements pInfo,
        @Pointer VkMemoryRequirements2 pMemoryRequirements
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkGetDeviceImageMemoryRequirementsKHR);
        try {
            hFunction.invokeExact(
                device.segment(),
                pInfo.segment(),
                pMemoryRequirements.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkGetDeviceImageSparseMemoryRequirements.html"><code>vkGetDeviceImageSparseMemoryRequirements</code></a>
    public void getDeviceImageSparseMemoryRequirements(
        VkDevice device,
        @Pointer VkDeviceImageMemoryRequirements pInfo,
        @Unsigned IntPtr pSparseMemoryRequirementCount,
        @Nullable @Pointer IVkSparseImageMemoryRequirements2 pSparseMemoryRequirements
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkGetDeviceImageSparseMemoryRequirements);
        try {
            hFunction.invokeExact(
                device.segment(),
                pInfo.segment(),
                pSparseMemoryRequirementCount.segment(),
                (MemorySegment) (pSparseMemoryRequirements != null ? pSparseMemoryRequirements.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkGetDeviceImageSparseMemoryRequirementsKHR.html"><code>vkGetDeviceImageSparseMemoryRequirementsKHR</code></a>
    public void getDeviceImageSparseMemoryRequirementsKHR(
        VkDevice device,
        @Pointer VkDeviceImageMemoryRequirements pInfo,
        @Unsigned IntPtr pSparseMemoryRequirementCount,
        @Nullable @Pointer IVkSparseImageMemoryRequirements2 pSparseMemoryRequirements
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkGetDeviceImageSparseMemoryRequirementsKHR);
        try {
            hFunction.invokeExact(
                device.segment(),
                pInfo.segment(),
                pSparseMemoryRequirementCount.segment(),
                (MemorySegment) (pSparseMemoryRequirements != null ? pSparseMemoryRequirements.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkGetDeviceImageSubresourceLayout.html"><code>vkGetDeviceImageSubresourceLayout</code></a>
    public void getDeviceImageSubresourceLayout(
        VkDevice device,
        @Pointer VkDeviceImageSubresourceInfo pInfo,
        @Pointer VkSubresourceLayout2 pLayout
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkGetDeviceImageSubresourceLayout);
        try {
            hFunction.invokeExact(
                device.segment(),
                pInfo.segment(),
                pLayout.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkGetDeviceImageSubresourceLayoutKHR.html"><code>vkGetDeviceImageSubresourceLayoutKHR</code></a>
    public void getDeviceImageSubresourceLayoutKHR(
        VkDevice device,
        @Pointer VkDeviceImageSubresourceInfo pInfo,
        @Pointer VkSubresourceLayout2 pLayout
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkGetDeviceImageSubresourceLayoutKHR);
        try {
            hFunction.invokeExact(
                device.segment(),
                pInfo.segment(),
                pLayout.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkGetDeviceMemoryCommitment.html"><code>vkGetDeviceMemoryCommitment</code></a>
    public void getDeviceMemoryCommitment(
        VkDevice device,
        VkDeviceMemory memory,
        @Pointer(comment="VkDeviceSize") @Unsigned LongPtr pCommittedMemoryInBytes
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkGetDeviceMemoryCommitment);
        try {
            hFunction.invokeExact(
                device.segment(),
                memory.segment(),
                pCommittedMemoryInBytes.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkGetDeviceMemoryOpaqueCaptureAddress.html"><code>vkGetDeviceMemoryOpaqueCaptureAddress</code></a>
    public @Unsigned long getDeviceMemoryOpaqueCaptureAddress(
        VkDevice device,
        @Pointer VkDeviceMemoryOpaqueCaptureAddressInfo pInfo
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkGetDeviceMemoryOpaqueCaptureAddress);
        try {
            return (long) hFunction.invokeExact(
                device.segment(),
                pInfo.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkGetDeviceMemoryOpaqueCaptureAddressKHR.html"><code>vkGetDeviceMemoryOpaqueCaptureAddressKHR</code></a>
    public @Unsigned long getDeviceMemoryOpaqueCaptureAddressKHR(
        VkDevice device,
        @Pointer VkDeviceMemoryOpaqueCaptureAddressInfo pInfo
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkGetDeviceMemoryOpaqueCaptureAddressKHR);
        try {
            return (long) hFunction.invokeExact(
                device.segment(),
                pInfo.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkGetDeviceMicromapCompatibilityEXT.html"><code>vkGetDeviceMicromapCompatibilityEXT</code></a>
    public void getDeviceMicromapCompatibilityEXT(
        VkDevice device,
        @Pointer VkMicromapVersionInfoEXT pVersionInfo,
        @EnumType(VkAccelerationStructureCompatibilityKHR.class) IntPtr pCompatibility
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkGetDeviceMicromapCompatibilityEXT);
        try {
            hFunction.invokeExact(
                device.segment(),
                pVersionInfo.segment(),
                pCompatibility.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkGetDeviceQueue.html"><code>vkGetDeviceQueue</code></a>
    public void getDeviceQueue(
        VkDevice device,
        @Unsigned int queueFamilyIndex,
        @Unsigned int queueIndex,
        @Pointer VkQueue.Ptr pQueue
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkGetDeviceQueue);
        try {
            hFunction.invokeExact(
                device.segment(),
                queueFamilyIndex,
                queueIndex,
                pQueue.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkGetDeviceQueue2.html"><code>vkGetDeviceQueue2</code></a>
    public void getDeviceQueue2(
        VkDevice device,
        @Pointer VkDeviceQueueInfo2 pQueueInfo,
        @Pointer VkQueue.Ptr pQueue
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkGetDeviceQueue2);
        try {
            hFunction.invokeExact(
                device.segment(),
                pQueueInfo.segment(),
                pQueue.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkGetDeviceSubpassShadingMaxWorkgroupSizeHUAWEI.html"><code>vkGetDeviceSubpassShadingMaxWorkgroupSizeHUAWEI</code></a>
    public @EnumType(VkResult.class) int getDeviceSubpassShadingMaxWorkgroupSizeHUAWEI(
        VkDevice device,
        VkRenderPass renderpass,
        @Pointer IVkExtent2D pMaxWorkgroupSize
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkGetDeviceSubpassShadingMaxWorkgroupSizeHUAWEI);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                renderpass.segment(),
                pMaxWorkgroupSize.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkGetDynamicRenderingTilePropertiesQCOM.html"><code>vkGetDynamicRenderingTilePropertiesQCOM</code></a>
    public @EnumType(VkResult.class) int getDynamicRenderingTilePropertiesQCOM(
        VkDevice device,
        @Pointer VkRenderingInfo pRenderingInfo,
        @Pointer VkTilePropertiesQCOM pProperties
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkGetDynamicRenderingTilePropertiesQCOM);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                pRenderingInfo.segment(),
                pProperties.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkGetEncodedVideoSessionParametersKHR.html"><code>vkGetEncodedVideoSessionParametersKHR</code></a>
    public @EnumType(VkResult.class) int getEncodedVideoSessionParametersKHR(
        VkDevice device,
        @Pointer VkVideoEncodeSessionParametersGetInfoKHR pVideoSessionParametersInfo,
        @Nullable @Pointer VkVideoEncodeSessionParametersFeedbackInfoKHR pFeedbackInfo,
        PointerPtr pDataSize,
        @Pointer(comment="void*") @NotNull MemorySegment pData
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkGetEncodedVideoSessionParametersKHR);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                pVideoSessionParametersInfo.segment(),
                (MemorySegment) (pFeedbackInfo != null ? pFeedbackInfo.segment() : MemorySegment.NULL),
                pDataSize.segment(),
                pData
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkGetEventStatus.html"><code>vkGetEventStatus</code></a>
    public @EnumType(VkResult.class) int getEventStatus(
        VkDevice device,
        VkEvent event
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkGetEventStatus);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                event.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkGetExecutionGraphPipelineNodeIndexAMDX.html"><code>vkGetExecutionGraphPipelineNodeIndexAMDX</code></a>
    public @EnumType(VkResult.class) int getExecutionGraphPipelineNodeIndexAMDX(
        VkDevice device,
        VkPipeline executionGraph,
        @Pointer VkPipelineShaderStageNodeCreateInfoAMDX pNodeInfo,
        @Unsigned IntPtr pNodeIndex
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkGetExecutionGraphPipelineNodeIndexAMDX);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                executionGraph.segment(),
                pNodeInfo.segment(),
                pNodeIndex.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkGetExecutionGraphPipelineScratchSizeAMDX.html"><code>vkGetExecutionGraphPipelineScratchSizeAMDX</code></a>
    public @EnumType(VkResult.class) int getExecutionGraphPipelineScratchSizeAMDX(
        VkDevice device,
        VkPipeline executionGraph,
        @Pointer VkExecutionGraphPipelineScratchSizeAMDX pSizeInfo
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkGetExecutionGraphPipelineScratchSizeAMDX);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                executionGraph.segment(),
                pSizeInfo.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkGetExternalComputeQueueDataNV.html"><code>vkGetExternalComputeQueueDataNV</code></a>
    public void getExternalComputeQueueDataNV(
        VkExternalComputeQueueNV externalQueue,
        @Pointer VkExternalComputeQueueDataParamsNV params,
        @Pointer(comment="void*") @NotNull MemorySegment pData
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkGetExternalComputeQueueDataNV);
        try {
            hFunction.invokeExact(
                externalQueue.segment(),
                params.segment(),
                pData
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkGetFenceFdKHR.html"><code>vkGetFenceFdKHR</code></a>
    public @EnumType(VkResult.class) int getFenceFdKHR(
        VkDevice device,
        @Pointer VkFenceGetFdInfoKHR pGetFdInfo,
        IntPtr pFd
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkGetFenceFdKHR);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                pGetFdInfo.segment(),
                pFd.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkGetFenceSciSyncFenceNV.html"><code>vkGetFenceSciSyncFenceNV</code></a>
    public @EnumType(VkResult.class) int getFenceSciSyncFenceNV(
        VkDevice device,
        @Pointer VkFenceGetSciSyncInfoNV pGetSciSyncHandleInfo,
        @Pointer(comment="void*") @NotNull MemorySegment pHandle
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkGetFenceSciSyncFenceNV);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                pGetSciSyncHandleInfo.segment(),
                pHandle
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkGetFenceSciSyncObjNV.html"><code>vkGetFenceSciSyncObjNV</code></a>
    public @EnumType(VkResult.class) int getFenceSciSyncObjNV(
        VkDevice device,
        @Pointer VkFenceGetSciSyncInfoNV pGetSciSyncHandleInfo,
        @Pointer(comment="void*") @NotNull MemorySegment pHandle
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkGetFenceSciSyncObjNV);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                pGetSciSyncHandleInfo.segment(),
                pHandle
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkGetFenceStatus.html"><code>vkGetFenceStatus</code></a>
    public @EnumType(VkResult.class) int getFenceStatus(
        VkDevice device,
        VkFence fence
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkGetFenceStatus);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                fence.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkGetFenceWin32HandleKHR.html"><code>vkGetFenceWin32HandleKHR</code></a>
    public @EnumType(VkResult.class) int getFenceWin32HandleKHR(
        VkDevice device,
        @Pointer VkFenceGetWin32HandleInfoKHR pGetWin32HandleInfo,
        PointerPtr pHandle
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkGetFenceWin32HandleKHR);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                pGetWin32HandleInfo.segment(),
                pHandle.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkGetFramebufferTilePropertiesQCOM.html"><code>vkGetFramebufferTilePropertiesQCOM</code></a>
    public @EnumType(VkResult.class) int getFramebufferTilePropertiesQCOM(
        VkDevice device,
        VkFramebuffer framebuffer,
        @Unsigned IntPtr pPropertiesCount,
        @Nullable @Pointer IVkTilePropertiesQCOM pProperties
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkGetFramebufferTilePropertiesQCOM);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                framebuffer.segment(),
                pPropertiesCount.segment(),
                (MemorySegment) (pProperties != null ? pProperties.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkGetGeneratedCommandsMemoryRequirementsEXT.html"><code>vkGetGeneratedCommandsMemoryRequirementsEXT</code></a>
    public void getGeneratedCommandsMemoryRequirementsEXT(
        VkDevice device,
        @Pointer VkGeneratedCommandsMemoryRequirementsInfoEXT pInfo,
        @Pointer VkMemoryRequirements2 pMemoryRequirements
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkGetGeneratedCommandsMemoryRequirementsEXT);
        try {
            hFunction.invokeExact(
                device.segment(),
                pInfo.segment(),
                pMemoryRequirements.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkGetGeneratedCommandsMemoryRequirementsNV.html"><code>vkGetGeneratedCommandsMemoryRequirementsNV</code></a>
    public void getGeneratedCommandsMemoryRequirementsNV(
        VkDevice device,
        @Pointer VkGeneratedCommandsMemoryRequirementsInfoNV pInfo,
        @Pointer VkMemoryRequirements2 pMemoryRequirements
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkGetGeneratedCommandsMemoryRequirementsNV);
        try {
            hFunction.invokeExact(
                device.segment(),
                pInfo.segment(),
                pMemoryRequirements.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkGetImageDrmFormatModifierPropertiesEXT.html"><code>vkGetImageDrmFormatModifierPropertiesEXT</code></a>
    public @EnumType(VkResult.class) int getImageDrmFormatModifierPropertiesEXT(
        VkDevice device,
        VkImage image,
        @Pointer VkImageDrmFormatModifierPropertiesEXT pProperties
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkGetImageDrmFormatModifierPropertiesEXT);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                image.segment(),
                pProperties.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkGetImageMemoryRequirements.html"><code>vkGetImageMemoryRequirements</code></a>
    public void getImageMemoryRequirements(
        VkDevice device,
        VkImage image,
        @Pointer VkMemoryRequirements pMemoryRequirements
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkGetImageMemoryRequirements);
        try {
            hFunction.invokeExact(
                device.segment(),
                image.segment(),
                pMemoryRequirements.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkGetImageMemoryRequirements2.html"><code>vkGetImageMemoryRequirements2</code></a>
    public void getImageMemoryRequirements2(
        VkDevice device,
        @Pointer VkImageMemoryRequirementsInfo2 pInfo,
        @Pointer VkMemoryRequirements2 pMemoryRequirements
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkGetImageMemoryRequirements2);
        try {
            hFunction.invokeExact(
                device.segment(),
                pInfo.segment(),
                pMemoryRequirements.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkGetImageMemoryRequirements2KHR.html"><code>vkGetImageMemoryRequirements2KHR</code></a>
    public void getImageMemoryRequirements2KHR(
        VkDevice device,
        @Pointer VkImageMemoryRequirementsInfo2 pInfo,
        @Pointer VkMemoryRequirements2 pMemoryRequirements
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkGetImageMemoryRequirements2KHR);
        try {
            hFunction.invokeExact(
                device.segment(),
                pInfo.segment(),
                pMemoryRequirements.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkGetImageOpaqueCaptureDescriptorDataEXT.html"><code>vkGetImageOpaqueCaptureDescriptorDataEXT</code></a>
    public @EnumType(VkResult.class) int getImageOpaqueCaptureDescriptorDataEXT(
        VkDevice device,
        @Pointer VkImageCaptureDescriptorDataInfoEXT pInfo,
        @Pointer(comment="void*") @NotNull MemorySegment pData
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkGetImageOpaqueCaptureDescriptorDataEXT);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                pInfo.segment(),
                pData
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkGetImageSparseMemoryRequirements.html"><code>vkGetImageSparseMemoryRequirements</code></a>
    public void getImageSparseMemoryRequirements(
        VkDevice device,
        VkImage image,
        @Unsigned IntPtr pSparseMemoryRequirementCount,
        @Nullable @Pointer IVkSparseImageMemoryRequirements pSparseMemoryRequirements
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkGetImageSparseMemoryRequirements);
        try {
            hFunction.invokeExact(
                device.segment(),
                image.segment(),
                pSparseMemoryRequirementCount.segment(),
                (MemorySegment) (pSparseMemoryRequirements != null ? pSparseMemoryRequirements.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkGetImageSparseMemoryRequirements2.html"><code>vkGetImageSparseMemoryRequirements2</code></a>
    public void getImageSparseMemoryRequirements2(
        VkDevice device,
        @Pointer VkImageSparseMemoryRequirementsInfo2 pInfo,
        @Unsigned IntPtr pSparseMemoryRequirementCount,
        @Nullable @Pointer IVkSparseImageMemoryRequirements2 pSparseMemoryRequirements
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkGetImageSparseMemoryRequirements2);
        try {
            hFunction.invokeExact(
                device.segment(),
                pInfo.segment(),
                pSparseMemoryRequirementCount.segment(),
                (MemorySegment) (pSparseMemoryRequirements != null ? pSparseMemoryRequirements.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkGetImageSparseMemoryRequirements2KHR.html"><code>vkGetImageSparseMemoryRequirements2KHR</code></a>
    public void getImageSparseMemoryRequirements2KHR(
        VkDevice device,
        @Pointer VkImageSparseMemoryRequirementsInfo2 pInfo,
        @Unsigned IntPtr pSparseMemoryRequirementCount,
        @Nullable @Pointer IVkSparseImageMemoryRequirements2 pSparseMemoryRequirements
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkGetImageSparseMemoryRequirements2KHR);
        try {
            hFunction.invokeExact(
                device.segment(),
                pInfo.segment(),
                pSparseMemoryRequirementCount.segment(),
                (MemorySegment) (pSparseMemoryRequirements != null ? pSparseMemoryRequirements.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkGetImageSubresourceLayout.html"><code>vkGetImageSubresourceLayout</code></a>
    public void getImageSubresourceLayout(
        VkDevice device,
        VkImage image,
        @Pointer VkImageSubresource pSubresource,
        @Pointer VkSubresourceLayout pLayout
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkGetImageSubresourceLayout);
        try {
            hFunction.invokeExact(
                device.segment(),
                image.segment(),
                pSubresource.segment(),
                pLayout.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkGetImageSubresourceLayout2.html"><code>vkGetImageSubresourceLayout2</code></a>
    public void getImageSubresourceLayout2(
        VkDevice device,
        VkImage image,
        @Pointer VkImageSubresource2 pSubresource,
        @Pointer VkSubresourceLayout2 pLayout
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkGetImageSubresourceLayout2);
        try {
            hFunction.invokeExact(
                device.segment(),
                image.segment(),
                pSubresource.segment(),
                pLayout.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkGetImageSubresourceLayout2EXT.html"><code>vkGetImageSubresourceLayout2EXT</code></a>
    public void getImageSubresourceLayout2EXT(
        VkDevice device,
        VkImage image,
        @Pointer VkImageSubresource2 pSubresource,
        @Pointer VkSubresourceLayout2 pLayout
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkGetImageSubresourceLayout2EXT);
        try {
            hFunction.invokeExact(
                device.segment(),
                image.segment(),
                pSubresource.segment(),
                pLayout.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkGetImageSubresourceLayout2KHR.html"><code>vkGetImageSubresourceLayout2KHR</code></a>
    public void getImageSubresourceLayout2KHR(
        VkDevice device,
        VkImage image,
        @Pointer VkImageSubresource2 pSubresource,
        @Pointer VkSubresourceLayout2 pLayout
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkGetImageSubresourceLayout2KHR);
        try {
            hFunction.invokeExact(
                device.segment(),
                image.segment(),
                pSubresource.segment(),
                pLayout.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkGetImageViewAddressNVX.html"><code>vkGetImageViewAddressNVX</code></a>
    public @EnumType(VkResult.class) int getImageViewAddressNVX(
        VkDevice device,
        VkImageView imageView,
        @Pointer VkImageViewAddressPropertiesNVX pProperties
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkGetImageViewAddressNVX);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                imageView.segment(),
                pProperties.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkGetImageViewHandle64NVX.html"><code>vkGetImageViewHandle64NVX</code></a>
    public @Unsigned long getImageViewHandle64NVX(
        VkDevice device,
        @Pointer VkImageViewHandleInfoNVX pInfo
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkGetImageViewHandle64NVX);
        try {
            return (long) hFunction.invokeExact(
                device.segment(),
                pInfo.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkGetImageViewHandleNVX.html"><code>vkGetImageViewHandleNVX</code></a>
    public @Unsigned int getImageViewHandleNVX(
        VkDevice device,
        @Pointer VkImageViewHandleInfoNVX pInfo
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkGetImageViewHandleNVX);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                pInfo.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkGetImageViewOpaqueCaptureDescriptorDataEXT.html"><code>vkGetImageViewOpaqueCaptureDescriptorDataEXT</code></a>
    public @EnumType(VkResult.class) int getImageViewOpaqueCaptureDescriptorDataEXT(
        VkDevice device,
        @Pointer VkImageViewCaptureDescriptorDataInfoEXT pInfo,
        @Pointer(comment="void*") @NotNull MemorySegment pData
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkGetImageViewOpaqueCaptureDescriptorDataEXT);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                pInfo.segment(),
                pData
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkGetLatencyTimingsNV.html"><code>vkGetLatencyTimingsNV</code></a>
    public void getLatencyTimingsNV(
        VkDevice device,
        VkSwapchainKHR swapchain,
        @Pointer VkGetLatencyMarkerInfoNV pLatencyMarkerInfo
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkGetLatencyTimingsNV);
        try {
            hFunction.invokeExact(
                device.segment(),
                swapchain.segment(),
                pLatencyMarkerInfo.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkGetMemoryAndroidHardwareBufferANDROID.html"><code>vkGetMemoryAndroidHardwareBufferANDROID</code></a>
    public @EnumType(VkResult.class) int getMemoryAndroidHardwareBufferANDROID(
        VkDevice device,
        @Pointer VkMemoryGetAndroidHardwareBufferInfoANDROID pInfo,
        PointerPtr pBuffer
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkGetMemoryAndroidHardwareBufferANDROID);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                pInfo.segment(),
                pBuffer.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkGetMemoryFdKHR.html"><code>vkGetMemoryFdKHR</code></a>
    public @EnumType(VkResult.class) int getMemoryFdKHR(
        VkDevice device,
        @Pointer VkMemoryGetFdInfoKHR pGetFdInfo,
        IntPtr pFd
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkGetMemoryFdKHR);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                pGetFdInfo.segment(),
                pFd.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkGetMemoryFdPropertiesKHR.html"><code>vkGetMemoryFdPropertiesKHR</code></a>
    public @EnumType(VkResult.class) int getMemoryFdPropertiesKHR(
        VkDevice device,
        @EnumType(VkExternalMemoryHandleTypeFlags.class) int handleType,
        int fd,
        @Pointer VkMemoryFdPropertiesKHR pMemoryFdProperties
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkGetMemoryFdPropertiesKHR);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                handleType,
                fd,
                pMemoryFdProperties.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkGetMemoryHostPointerPropertiesEXT.html"><code>vkGetMemoryHostPointerPropertiesEXT</code></a>
    public @EnumType(VkResult.class) int getMemoryHostPointerPropertiesEXT(
        VkDevice device,
        @EnumType(VkExternalMemoryHandleTypeFlags.class) int handleType,
        @Pointer(comment="void*") @NotNull MemorySegment pHostPointer,
        @Pointer VkMemoryHostPointerPropertiesEXT pMemoryHostPointerProperties
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkGetMemoryHostPointerPropertiesEXT);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                handleType,
                pHostPointer,
                pMemoryHostPointerProperties.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkGetMemoryMetalHandleEXT.html"><code>vkGetMemoryMetalHandleEXT</code></a>
    public @EnumType(VkResult.class) int getMemoryMetalHandleEXT(
        VkDevice device,
        @Pointer VkMemoryGetMetalHandleInfoEXT pGetMetalHandleInfo,
        PointerPtr pHandle
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkGetMemoryMetalHandleEXT);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                pGetMetalHandleInfo.segment(),
                pHandle.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkGetMemoryMetalHandlePropertiesEXT.html"><code>vkGetMemoryMetalHandlePropertiesEXT</code></a>
    public @EnumType(VkResult.class) int getMemoryMetalHandlePropertiesEXT(
        VkDevice device,
        @EnumType(VkExternalMemoryHandleTypeFlags.class) int handleType,
        @Pointer(comment="void*") @NotNull MemorySegment pHandle,
        @Pointer VkMemoryMetalHandlePropertiesEXT pMemoryMetalHandleProperties
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkGetMemoryMetalHandlePropertiesEXT);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                handleType,
                pHandle,
                pMemoryMetalHandleProperties.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkGetMemoryRemoteAddressNV.html"><code>vkGetMemoryRemoteAddressNV</code></a>
    public @EnumType(VkResult.class) int getMemoryRemoteAddressNV(
        VkDevice device,
        @Pointer VkMemoryGetRemoteAddressInfoNV pMemoryGetRemoteAddressInfo,
        PointerPtr pAddress
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkGetMemoryRemoteAddressNV);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                pMemoryGetRemoteAddressInfo.segment(),
                pAddress.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkGetMemorySciBufNV.html"><code>vkGetMemorySciBufNV</code></a>
    public @EnumType(VkResult.class) int getMemorySciBufNV(
        VkDevice device,
        @Pointer VkMemoryGetSciBufInfoNV pGetSciBufInfo,
        PointerPtr pHandle
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkGetMemorySciBufNV);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                pGetSciBufInfo.segment(),
                pHandle.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkGetMemoryWin32HandleKHR.html"><code>vkGetMemoryWin32HandleKHR</code></a>
    public @EnumType(VkResult.class) int getMemoryWin32HandleKHR(
        VkDevice device,
        @Pointer VkMemoryGetWin32HandleInfoKHR pGetWin32HandleInfo,
        PointerPtr pHandle
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkGetMemoryWin32HandleKHR);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                pGetWin32HandleInfo.segment(),
                pHandle.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkGetMemoryWin32HandleNV.html"><code>vkGetMemoryWin32HandleNV</code></a>
    public @EnumType(VkResult.class) int getMemoryWin32HandleNV(
        VkDevice device,
        VkDeviceMemory memory,
        @EnumType(VkExternalMemoryHandleTypeFlagsNV.class) int handleType,
        PointerPtr pHandle
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkGetMemoryWin32HandleNV);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                memory.segment(),
                handleType,
                pHandle.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkGetMemoryWin32HandlePropertiesKHR.html"><code>vkGetMemoryWin32HandlePropertiesKHR</code></a>
    public @EnumType(VkResult.class) int getMemoryWin32HandlePropertiesKHR(
        VkDevice device,
        @EnumType(VkExternalMemoryHandleTypeFlags.class) int handleType,
        @Pointer(comment="HANDLE") @NotNull MemorySegment handle,
        @Pointer VkMemoryWin32HandlePropertiesKHR pMemoryWin32HandleProperties
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkGetMemoryWin32HandlePropertiesKHR);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                handleType,
                handle,
                pMemoryWin32HandleProperties.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkGetMemoryZirconHandleFUCHSIA.html"><code>vkGetMemoryZirconHandleFUCHSIA</code></a>
    public @EnumType(VkResult.class) int getMemoryZirconHandleFUCHSIA(
        VkDevice device,
        @Pointer VkMemoryGetZirconHandleInfoFUCHSIA pGetZirconHandleInfo,
        @Pointer(comment="zx_handle_t") @Unsigned IntPtr pZirconHandle
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkGetMemoryZirconHandleFUCHSIA);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                pGetZirconHandleInfo.segment(),
                pZirconHandle.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkGetMemoryZirconHandlePropertiesFUCHSIA.html"><code>vkGetMemoryZirconHandlePropertiesFUCHSIA</code></a>
    public @EnumType(VkResult.class) int getMemoryZirconHandlePropertiesFUCHSIA(
        VkDevice device,
        @EnumType(VkExternalMemoryHandleTypeFlags.class) int handleType,
        @NativeType("zx_handle_t") @Unsigned int zirconHandle,
        @Pointer VkMemoryZirconHandlePropertiesFUCHSIA pMemoryZirconHandleProperties
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkGetMemoryZirconHandlePropertiesFUCHSIA);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                handleType,
                zirconHandle,
                pMemoryZirconHandleProperties.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkGetMicromapBuildSizesEXT.html"><code>vkGetMicromapBuildSizesEXT</code></a>
    public void getMicromapBuildSizesEXT(
        VkDevice device,
        @EnumType(VkAccelerationStructureBuildTypeKHR.class) int buildType,
        @Pointer VkMicromapBuildInfoEXT pBuildInfo,
        @Pointer VkMicromapBuildSizesInfoEXT pSizeInfo
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkGetMicromapBuildSizesEXT);
        try {
            hFunction.invokeExact(
                device.segment(),
                buildType,
                pBuildInfo.segment(),
                pSizeInfo.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkGetPartitionedAccelerationStructuresBuildSizesNV.html"><code>vkGetPartitionedAccelerationStructuresBuildSizesNV</code></a>
    public void getPartitionedAccelerationStructuresBuildSizesNV(
        VkDevice device,
        @Pointer VkPartitionedAccelerationStructureInstancesInputNV pInfo,
        @Pointer VkAccelerationStructureBuildSizesInfoKHR pSizeInfo
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkGetPartitionedAccelerationStructuresBuildSizesNV);
        try {
            hFunction.invokeExact(
                device.segment(),
                pInfo.segment(),
                pSizeInfo.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkGetPastPresentationTimingGOOGLE.html"><code>vkGetPastPresentationTimingGOOGLE</code></a>
    public @EnumType(VkResult.class) int getPastPresentationTimingGOOGLE(
        VkDevice device,
        VkSwapchainKHR swapchain,
        @Unsigned IntPtr pPresentationTimingCount,
        @Nullable @Pointer IVkPastPresentationTimingGOOGLE pPresentationTimings
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkGetPastPresentationTimingGOOGLE);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                swapchain.segment(),
                pPresentationTimingCount.segment(),
                (MemorySegment) (pPresentationTimings != null ? pPresentationTimings.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkGetPerformanceParameterINTEL.html"><code>vkGetPerformanceParameterINTEL</code></a>
    public @EnumType(VkResult.class) int getPerformanceParameterINTEL(
        VkDevice device,
        @EnumType(VkPerformanceParameterTypeINTEL.class) int parameter,
        @Pointer VkPerformanceValueINTEL pValue
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkGetPerformanceParameterINTEL);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                parameter,
                pValue.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkGetPipelineBinaryDataKHR.html"><code>vkGetPipelineBinaryDataKHR</code></a>
    public @EnumType(VkResult.class) int getPipelineBinaryDataKHR(
        VkDevice device,
        @Pointer VkPipelineBinaryDataInfoKHR pInfo,
        @Pointer VkPipelineBinaryKeyKHR pPipelineBinaryKey,
        PointerPtr pPipelineBinaryDataSize,
        @Pointer(comment="void*") @NotNull MemorySegment pPipelineBinaryData
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkGetPipelineBinaryDataKHR);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                pInfo.segment(),
                pPipelineBinaryKey.segment(),
                pPipelineBinaryDataSize.segment(),
                pPipelineBinaryData
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkGetPipelineCacheData.html"><code>vkGetPipelineCacheData</code></a>
    public @EnumType(VkResult.class) int getPipelineCacheData(
        VkDevice device,
        VkPipelineCache pipelineCache,
        PointerPtr pDataSize,
        @Pointer(comment="void*") @NotNull MemorySegment pData
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkGetPipelineCacheData);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                pipelineCache.segment(),
                pDataSize.segment(),
                pData
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkGetPipelineExecutableInternalRepresentationsKHR.html"><code>vkGetPipelineExecutableInternalRepresentationsKHR</code></a>
    public @EnumType(VkResult.class) int getPipelineExecutableInternalRepresentationsKHR(
        VkDevice device,
        @Pointer VkPipelineExecutableInfoKHR pExecutableInfo,
        @Unsigned IntPtr pInternalRepresentationCount,
        @Nullable @Pointer IVkPipelineExecutableInternalRepresentationKHR pInternalRepresentations
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkGetPipelineExecutableInternalRepresentationsKHR);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                pExecutableInfo.segment(),
                pInternalRepresentationCount.segment(),
                (MemorySegment) (pInternalRepresentations != null ? pInternalRepresentations.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkGetPipelineExecutablePropertiesKHR.html"><code>vkGetPipelineExecutablePropertiesKHR</code></a>
    public @EnumType(VkResult.class) int getPipelineExecutablePropertiesKHR(
        VkDevice device,
        @Pointer VkPipelineInfoKHR pPipelineInfo,
        @Unsigned IntPtr pExecutableCount,
        @Nullable @Pointer IVkPipelineExecutablePropertiesKHR pProperties
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkGetPipelineExecutablePropertiesKHR);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                pPipelineInfo.segment(),
                pExecutableCount.segment(),
                (MemorySegment) (pProperties != null ? pProperties.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkGetPipelineExecutableStatisticsKHR.html"><code>vkGetPipelineExecutableStatisticsKHR</code></a>
    public @EnumType(VkResult.class) int getPipelineExecutableStatisticsKHR(
        VkDevice device,
        @Pointer VkPipelineExecutableInfoKHR pExecutableInfo,
        @Unsigned IntPtr pStatisticCount,
        @Nullable @Pointer IVkPipelineExecutableStatisticKHR pStatistics
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkGetPipelineExecutableStatisticsKHR);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                pExecutableInfo.segment(),
                pStatisticCount.segment(),
                (MemorySegment) (pStatistics != null ? pStatistics.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkGetPipelineIndirectDeviceAddressNV.html"><code>vkGetPipelineIndirectDeviceAddressNV</code></a>
    public @NativeType("VkDeviceAddress") @Unsigned long getPipelineIndirectDeviceAddressNV(
        VkDevice device,
        @Pointer VkPipelineIndirectDeviceAddressInfoNV pInfo
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkGetPipelineIndirectDeviceAddressNV);
        try {
            return (long) hFunction.invokeExact(
                device.segment(),
                pInfo.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkGetPipelineIndirectMemoryRequirementsNV.html"><code>vkGetPipelineIndirectMemoryRequirementsNV</code></a>
    public void getPipelineIndirectMemoryRequirementsNV(
        VkDevice device,
        @Pointer VkComputePipelineCreateInfo pCreateInfo,
        @Pointer VkMemoryRequirements2 pMemoryRequirements
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkGetPipelineIndirectMemoryRequirementsNV);
        try {
            hFunction.invokeExact(
                device.segment(),
                pCreateInfo.segment(),
                pMemoryRequirements.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkGetPipelineKeyKHR.html"><code>vkGetPipelineKeyKHR</code></a>
    public @EnumType(VkResult.class) int getPipelineKeyKHR(
        VkDevice device,
        @Nullable @Pointer VkPipelineCreateInfoKHR pPipelineCreateInfo,
        @Pointer VkPipelineBinaryKeyKHR pPipelineKey
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkGetPipelineKeyKHR);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                (MemorySegment) (pPipelineCreateInfo != null ? pPipelineCreateInfo.segment() : MemorySegment.NULL),
                pPipelineKey.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkGetPipelinePropertiesEXT.html"><code>vkGetPipelinePropertiesEXT</code></a>
    public @EnumType(VkResult.class) int getPipelinePropertiesEXT(
        VkDevice device,
        @Pointer VkPipelineInfoKHR pPipelineInfo,
        @Pointer VkBaseOutStructure pPipelineProperties
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkGetPipelinePropertiesEXT);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                pPipelineInfo.segment(),
                pPipelineProperties.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkGetPrivateData.html"><code>vkGetPrivateData</code></a>
    public void getPrivateData(
        VkDevice device,
        @EnumType(VkObjectType.class) int objectType,
        @Unsigned long objectHandle,
        VkPrivateDataSlot privateDataSlot,
        @Unsigned LongPtr pData
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkGetPrivateData);
        try {
            hFunction.invokeExact(
                device.segment(),
                objectType,
                objectHandle,
                privateDataSlot.segment(),
                pData.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkGetPrivateDataEXT.html"><code>vkGetPrivateDataEXT</code></a>
    public void getPrivateDataEXT(
        VkDevice device,
        @EnumType(VkObjectType.class) int objectType,
        @Unsigned long objectHandle,
        VkPrivateDataSlot privateDataSlot,
        @Unsigned LongPtr pData
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkGetPrivateDataEXT);
        try {
            hFunction.invokeExact(
                device.segment(),
                objectType,
                objectHandle,
                privateDataSlot.segment(),
                pData.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkGetQueryPoolResults.html"><code>vkGetQueryPoolResults</code></a>
    public @EnumType(VkResult.class) int getQueryPoolResults(
        VkDevice device,
        VkQueryPool queryPool,
        @Unsigned int firstQuery,
        @Unsigned int queryCount,
        long dataSize,
        @Pointer(comment="void*") @NotNull MemorySegment pData,
        @NativeType("VkDeviceSize") @Unsigned long stride,
        @EnumType(VkQueryResultFlags.class) int flags
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkGetQueryPoolResults);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                queryPool.segment(),
                firstQuery,
                queryCount,
                MemorySegment.ofAddress(dataSize),
                pData,
                stride,
                flags
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkGetQueueCheckpointData2NV.html"><code>vkGetQueueCheckpointData2NV</code></a>
    public void getQueueCheckpointData2NV(
        VkQueue queue,
        @Unsigned IntPtr pCheckpointDataCount,
        @Nullable @Pointer IVkCheckpointData2NV pCheckpointData
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkGetQueueCheckpointData2NV);
        try {
            hFunction.invokeExact(
                queue.segment(),
                pCheckpointDataCount.segment(),
                (MemorySegment) (pCheckpointData != null ? pCheckpointData.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkGetQueueCheckpointDataNV.html"><code>vkGetQueueCheckpointDataNV</code></a>
    public void getQueueCheckpointDataNV(
        VkQueue queue,
        @Unsigned IntPtr pCheckpointDataCount,
        @Nullable @Pointer IVkCheckpointDataNV pCheckpointData
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkGetQueueCheckpointDataNV);
        try {
            hFunction.invokeExact(
                queue.segment(),
                pCheckpointDataCount.segment(),
                (MemorySegment) (pCheckpointData != null ? pCheckpointData.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkGetRayTracingCaptureReplayShaderGroupHandlesKHR.html"><code>vkGetRayTracingCaptureReplayShaderGroupHandlesKHR</code></a>
    public @EnumType(VkResult.class) int getRayTracingCaptureReplayShaderGroupHandlesKHR(
        VkDevice device,
        VkPipeline pipeline,
        @Unsigned int firstGroup,
        @Unsigned int groupCount,
        long dataSize,
        @Pointer(comment="void*") @NotNull MemorySegment pData
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkGetRayTracingCaptureReplayShaderGroupHandlesKHR);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                pipeline.segment(),
                firstGroup,
                groupCount,
                MemorySegment.ofAddress(dataSize),
                pData
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkGetRayTracingShaderGroupHandlesKHR.html"><code>vkGetRayTracingShaderGroupHandlesKHR</code></a>
    public @EnumType(VkResult.class) int getRayTracingShaderGroupHandlesKHR(
        VkDevice device,
        VkPipeline pipeline,
        @Unsigned int firstGroup,
        @Unsigned int groupCount,
        long dataSize,
        @Pointer(comment="void*") @NotNull MemorySegment pData
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkGetRayTracingShaderGroupHandlesKHR);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                pipeline.segment(),
                firstGroup,
                groupCount,
                MemorySegment.ofAddress(dataSize),
                pData
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkGetRayTracingShaderGroupHandlesNV.html"><code>vkGetRayTracingShaderGroupHandlesNV</code></a>
    public @EnumType(VkResult.class) int getRayTracingShaderGroupHandlesNV(
        VkDevice device,
        VkPipeline pipeline,
        @Unsigned int firstGroup,
        @Unsigned int groupCount,
        long dataSize,
        @Pointer(comment="void*") @NotNull MemorySegment pData
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkGetRayTracingShaderGroupHandlesNV);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                pipeline.segment(),
                firstGroup,
                groupCount,
                MemorySegment.ofAddress(dataSize),
                pData
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkGetRayTracingShaderGroupStackSizeKHR.html"><code>vkGetRayTracingShaderGroupStackSizeKHR</code></a>
    public @NativeType("VkDeviceSize") @Unsigned long getRayTracingShaderGroupStackSizeKHR(
        VkDevice device,
        VkPipeline pipeline,
        @Unsigned int group,
        @EnumType(VkShaderGroupShaderKHR.class) int groupShader
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkGetRayTracingShaderGroupStackSizeKHR);
        try {
            return (long) hFunction.invokeExact(
                device.segment(),
                pipeline.segment(),
                group,
                groupShader
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkGetRefreshCycleDurationGOOGLE.html"><code>vkGetRefreshCycleDurationGOOGLE</code></a>
    public @EnumType(VkResult.class) int getRefreshCycleDurationGOOGLE(
        VkDevice device,
        VkSwapchainKHR swapchain,
        @Pointer VkRefreshCycleDurationGOOGLE pDisplayTimingProperties
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkGetRefreshCycleDurationGOOGLE);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                swapchain.segment(),
                pDisplayTimingProperties.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkGetRenderAreaGranularity.html"><code>vkGetRenderAreaGranularity</code></a>
    public void getRenderAreaGranularity(
        VkDevice device,
        VkRenderPass renderPass,
        @Pointer VkExtent2D pGranularity
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkGetRenderAreaGranularity);
        try {
            hFunction.invokeExact(
                device.segment(),
                renderPass.segment(),
                pGranularity.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkGetRenderingAreaGranularity.html"><code>vkGetRenderingAreaGranularity</code></a>
    public void getRenderingAreaGranularity(
        VkDevice device,
        @Pointer VkRenderingAreaInfo pRenderingAreaInfo,
        @Pointer VkExtent2D pGranularity
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkGetRenderingAreaGranularity);
        try {
            hFunction.invokeExact(
                device.segment(),
                pRenderingAreaInfo.segment(),
                pGranularity.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkGetRenderingAreaGranularityKHR.html"><code>vkGetRenderingAreaGranularityKHR</code></a>
    public void getRenderingAreaGranularityKHR(
        VkDevice device,
        @Pointer VkRenderingAreaInfo pRenderingAreaInfo,
        @Pointer VkExtent2D pGranularity
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkGetRenderingAreaGranularityKHR);
        try {
            hFunction.invokeExact(
                device.segment(),
                pRenderingAreaInfo.segment(),
                pGranularity.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkGetSamplerOpaqueCaptureDescriptorDataEXT.html"><code>vkGetSamplerOpaqueCaptureDescriptorDataEXT</code></a>
    public @EnumType(VkResult.class) int getSamplerOpaqueCaptureDescriptorDataEXT(
        VkDevice device,
        @Pointer VkSamplerCaptureDescriptorDataInfoEXT pInfo,
        @Pointer(comment="void*") @NotNull MemorySegment pData
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkGetSamplerOpaqueCaptureDescriptorDataEXT);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                pInfo.segment(),
                pData
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkGetScreenBufferPropertiesQNX.html"><code>vkGetScreenBufferPropertiesQNX</code></a>
    public @EnumType(VkResult.class) int getScreenBufferPropertiesQNX(
        VkDevice device,
        PointerPtr buffer,
        @Pointer VkScreenBufferPropertiesQNX pProperties
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkGetScreenBufferPropertiesQNX);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                buffer.segment(),
                pProperties.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkGetSemaphoreCounterValue.html"><code>vkGetSemaphoreCounterValue</code></a>
    public @EnumType(VkResult.class) int getSemaphoreCounterValue(
        VkDevice device,
        VkSemaphore semaphore,
        @Unsigned LongPtr pValue
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkGetSemaphoreCounterValue);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                semaphore.segment(),
                pValue.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkGetSemaphoreCounterValueKHR.html"><code>vkGetSemaphoreCounterValueKHR</code></a>
    public @EnumType(VkResult.class) int getSemaphoreCounterValueKHR(
        VkDevice device,
        VkSemaphore semaphore,
        @Unsigned LongPtr pValue
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkGetSemaphoreCounterValueKHR);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                semaphore.segment(),
                pValue.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkGetSemaphoreFdKHR.html"><code>vkGetSemaphoreFdKHR</code></a>
    public @EnumType(VkResult.class) int getSemaphoreFdKHR(
        VkDevice device,
        @Pointer VkSemaphoreGetFdInfoKHR pGetFdInfo,
        IntPtr pFd
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkGetSemaphoreFdKHR);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                pGetFdInfo.segment(),
                pFd.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkGetSemaphoreSciSyncObjNV.html"><code>vkGetSemaphoreSciSyncObjNV</code></a>
    public @EnumType(VkResult.class) int getSemaphoreSciSyncObjNV(
        VkDevice device,
        @Pointer VkSemaphoreGetSciSyncInfoNV pGetSciSyncInfo,
        @Pointer(comment="void*") @NotNull MemorySegment pHandle
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkGetSemaphoreSciSyncObjNV);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                pGetSciSyncInfo.segment(),
                pHandle
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkGetSemaphoreWin32HandleKHR.html"><code>vkGetSemaphoreWin32HandleKHR</code></a>
    public @EnumType(VkResult.class) int getSemaphoreWin32HandleKHR(
        VkDevice device,
        @Pointer VkSemaphoreGetWin32HandleInfoKHR pGetWin32HandleInfo,
        PointerPtr pHandle
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkGetSemaphoreWin32HandleKHR);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                pGetWin32HandleInfo.segment(),
                pHandle.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkGetSemaphoreZirconHandleFUCHSIA.html"><code>vkGetSemaphoreZirconHandleFUCHSIA</code></a>
    public @EnumType(VkResult.class) int getSemaphoreZirconHandleFUCHSIA(
        VkDevice device,
        @Pointer VkSemaphoreGetZirconHandleInfoFUCHSIA pGetZirconHandleInfo,
        @Pointer(comment="zx_handle_t") @Unsigned IntPtr pZirconHandle
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkGetSemaphoreZirconHandleFUCHSIA);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                pGetZirconHandleInfo.segment(),
                pZirconHandle.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkGetShaderBinaryDataEXT.html"><code>vkGetShaderBinaryDataEXT</code></a>
    public @EnumType(VkResult.class) int getShaderBinaryDataEXT(
        VkDevice device,
        VkShaderEXT shader,
        PointerPtr pDataSize,
        @Pointer(comment="void*") @NotNull MemorySegment pData
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkGetShaderBinaryDataEXT);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                shader.segment(),
                pDataSize.segment(),
                pData
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkGetShaderInfoAMD.html"><code>vkGetShaderInfoAMD</code></a>
    public @EnumType(VkResult.class) int getShaderInfoAMD(
        VkDevice device,
        VkPipeline pipeline,
        @EnumType(VkShaderStageFlags.class) int shaderStage,
        @EnumType(VkShaderInfoTypeAMD.class) int infoType,
        PointerPtr pInfoSize,
        @Pointer(comment="void*") @NotNull MemorySegment pInfo
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkGetShaderInfoAMD);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                pipeline.segment(),
                shaderStage,
                infoType,
                pInfoSize.segment(),
                pInfo
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkGetShaderModuleCreateInfoIdentifierEXT.html"><code>vkGetShaderModuleCreateInfoIdentifierEXT</code></a>
    public void getShaderModuleCreateInfoIdentifierEXT(
        VkDevice device,
        @Pointer VkShaderModuleCreateInfo pCreateInfo,
        @Pointer VkShaderModuleIdentifierEXT pIdentifier
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkGetShaderModuleCreateInfoIdentifierEXT);
        try {
            hFunction.invokeExact(
                device.segment(),
                pCreateInfo.segment(),
                pIdentifier.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkGetShaderModuleIdentifierEXT.html"><code>vkGetShaderModuleIdentifierEXT</code></a>
    public void getShaderModuleIdentifierEXT(
        VkDevice device,
        VkShaderModule shaderModule,
        @Pointer VkShaderModuleIdentifierEXT pIdentifier
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkGetShaderModuleIdentifierEXT);
        try {
            hFunction.invokeExact(
                device.segment(),
                shaderModule.segment(),
                pIdentifier.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkGetSwapchainCounterEXT.html"><code>vkGetSwapchainCounterEXT</code></a>
    public @EnumType(VkResult.class) int getSwapchainCounterEXT(
        VkDevice device,
        VkSwapchainKHR swapchain,
        @EnumType(VkSurfaceCounterFlagsEXT.class) int counter,
        @Unsigned LongPtr pCounterValue
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkGetSwapchainCounterEXT);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                swapchain.segment(),
                counter,
                pCounterValue.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkGetSwapchainImagesKHR.html"><code>vkGetSwapchainImagesKHR</code></a>
    public @EnumType(VkResult.class) int getSwapchainImagesKHR(
        VkDevice device,
        VkSwapchainKHR swapchain,
        @Unsigned IntPtr pSwapchainImageCount,
        @Nullable @Pointer VkImage.Ptr pSwapchainImages
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkGetSwapchainImagesKHR);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                swapchain.segment(),
                pSwapchainImageCount.segment(),
                (MemorySegment) (pSwapchainImages != null ? pSwapchainImages.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkGetSwapchainStatusKHR.html"><code>vkGetSwapchainStatusKHR</code></a>
    public @EnumType(VkResult.class) int getSwapchainStatusKHR(
        VkDevice device,
        VkSwapchainKHR swapchain
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkGetSwapchainStatusKHR);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                swapchain.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkGetValidationCacheDataEXT.html"><code>vkGetValidationCacheDataEXT</code></a>
    public @EnumType(VkResult.class) int getValidationCacheDataEXT(
        VkDevice device,
        VkValidationCacheEXT validationCache,
        PointerPtr pDataSize,
        @Pointer(comment="void*") @NotNull MemorySegment pData
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkGetValidationCacheDataEXT);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                validationCache.segment(),
                pDataSize.segment(),
                pData
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkGetVideoSessionMemoryRequirementsKHR.html"><code>vkGetVideoSessionMemoryRequirementsKHR</code></a>
    public @EnumType(VkResult.class) int getVideoSessionMemoryRequirementsKHR(
        VkDevice device,
        VkVideoSessionKHR videoSession,
        @Unsigned IntPtr pMemoryRequirementsCount,
        @Nullable @Pointer IVkVideoSessionMemoryRequirementsKHR pMemoryRequirements
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkGetVideoSessionMemoryRequirementsKHR);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                videoSession.segment(),
                pMemoryRequirementsCount.segment(),
                (MemorySegment) (pMemoryRequirements != null ? pMemoryRequirements.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkImportFenceFdKHR.html"><code>vkImportFenceFdKHR</code></a>
    public @EnumType(VkResult.class) int importFenceFdKHR(
        VkDevice device,
        @Pointer VkImportFenceFdInfoKHR pImportFenceFdInfo
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkImportFenceFdKHR);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                pImportFenceFdInfo.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkImportFenceSciSyncFenceNV.html"><code>vkImportFenceSciSyncFenceNV</code></a>
    public @EnumType(VkResult.class) int importFenceSciSyncFenceNV(
        VkDevice device,
        @Pointer VkImportFenceSciSyncInfoNV pImportFenceSciSyncInfo
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkImportFenceSciSyncFenceNV);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                pImportFenceSciSyncInfo.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkImportFenceSciSyncObjNV.html"><code>vkImportFenceSciSyncObjNV</code></a>
    public @EnumType(VkResult.class) int importFenceSciSyncObjNV(
        VkDevice device,
        @Pointer VkImportFenceSciSyncInfoNV pImportFenceSciSyncInfo
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkImportFenceSciSyncObjNV);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                pImportFenceSciSyncInfo.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkImportFenceWin32HandleKHR.html"><code>vkImportFenceWin32HandleKHR</code></a>
    public @EnumType(VkResult.class) int importFenceWin32HandleKHR(
        VkDevice device,
        @Pointer VkImportFenceWin32HandleInfoKHR pImportFenceWin32HandleInfo
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkImportFenceWin32HandleKHR);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                pImportFenceWin32HandleInfo.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkImportSemaphoreFdKHR.html"><code>vkImportSemaphoreFdKHR</code></a>
    public @EnumType(VkResult.class) int importSemaphoreFdKHR(
        VkDevice device,
        @Pointer VkImportSemaphoreFdInfoKHR pImportSemaphoreFdInfo
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkImportSemaphoreFdKHR);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                pImportSemaphoreFdInfo.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkImportSemaphoreSciSyncObjNV.html"><code>vkImportSemaphoreSciSyncObjNV</code></a>
    public @EnumType(VkResult.class) int importSemaphoreSciSyncObjNV(
        VkDevice device,
        @Pointer VkImportSemaphoreSciSyncInfoNV pImportSemaphoreSciSyncInfo
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkImportSemaphoreSciSyncObjNV);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                pImportSemaphoreSciSyncInfo.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkImportSemaphoreWin32HandleKHR.html"><code>vkImportSemaphoreWin32HandleKHR</code></a>
    public @EnumType(VkResult.class) int importSemaphoreWin32HandleKHR(
        VkDevice device,
        @Pointer VkImportSemaphoreWin32HandleInfoKHR pImportSemaphoreWin32HandleInfo
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkImportSemaphoreWin32HandleKHR);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                pImportSemaphoreWin32HandleInfo.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkImportSemaphoreZirconHandleFUCHSIA.html"><code>vkImportSemaphoreZirconHandleFUCHSIA</code></a>
    public @EnumType(VkResult.class) int importSemaphoreZirconHandleFUCHSIA(
        VkDevice device,
        @Pointer VkImportSemaphoreZirconHandleInfoFUCHSIA pImportSemaphoreZirconHandleInfo
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkImportSemaphoreZirconHandleFUCHSIA);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                pImportSemaphoreZirconHandleInfo.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkInitializePerformanceApiINTEL.html"><code>vkInitializePerformanceApiINTEL</code></a>
    public @EnumType(VkResult.class) int initializePerformanceApiINTEL(
        VkDevice device,
        @Pointer VkInitializePerformanceApiInfoINTEL pInitializeInfo
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkInitializePerformanceApiINTEL);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                pInitializeInfo.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkInvalidateMappedMemoryRanges.html"><code>vkInvalidateMappedMemoryRanges</code></a>
    public @EnumType(VkResult.class) int invalidateMappedMemoryRanges(
        VkDevice device,
        @Unsigned int memoryRangeCount,
        @Pointer IVkMappedMemoryRange pMemoryRanges
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkInvalidateMappedMemoryRanges);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                memoryRangeCount,
                pMemoryRanges.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkLatencySleepNV.html"><code>vkLatencySleepNV</code></a>
    public @EnumType(VkResult.class) int latencySleepNV(
        VkDevice device,
        VkSwapchainKHR swapchain,
        @Pointer VkLatencySleepInfoNV pSleepInfo
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkLatencySleepNV);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                swapchain.segment(),
                pSleepInfo.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkMapMemory.html"><code>vkMapMemory</code></a>
    public @EnumType(VkResult.class) int mapMemory(
        VkDevice device,
        VkDeviceMemory memory,
        @NativeType("VkDeviceSize") @Unsigned long offset,
        @NativeType("VkDeviceSize") @Unsigned long size,
        @EnumType(VkMemoryMapFlags.class) int flags,
        PointerPtr ppData
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkMapMemory);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                memory.segment(),
                offset,
                size,
                flags,
                ppData.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkMapMemory2.html"><code>vkMapMemory2</code></a>
    public @EnumType(VkResult.class) int mapMemory2(
        VkDevice device,
        @Pointer VkMemoryMapInfo pMemoryMapInfo,
        PointerPtr ppData
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkMapMemory2);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                pMemoryMapInfo.segment(),
                ppData.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkMapMemory2KHR.html"><code>vkMapMemory2KHR</code></a>
    public @EnumType(VkResult.class) int mapMemory2KHR(
        VkDevice device,
        @Pointer VkMemoryMapInfo pMemoryMapInfo,
        PointerPtr ppData
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkMapMemory2KHR);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                pMemoryMapInfo.segment(),
                ppData.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkMergePipelineCaches.html"><code>vkMergePipelineCaches</code></a>
    public @EnumType(VkResult.class) int mergePipelineCaches(
        VkDevice device,
        VkPipelineCache dstCache,
        @Unsigned int srcCacheCount,
        @Pointer VkPipelineCache.Ptr pSrcCaches
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkMergePipelineCaches);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                dstCache.segment(),
                srcCacheCount,
                pSrcCaches.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkMergeValidationCachesEXT.html"><code>vkMergeValidationCachesEXT</code></a>
    public @EnumType(VkResult.class) int mergeValidationCachesEXT(
        VkDevice device,
        VkValidationCacheEXT dstCache,
        @Unsigned int srcCacheCount,
        @Pointer VkValidationCacheEXT.Ptr pSrcCaches
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkMergeValidationCachesEXT);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                dstCache.segment(),
                srcCacheCount,
                pSrcCaches.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkQueueBindSparse.html"><code>vkQueueBindSparse</code></a>
    public @EnumType(VkResult.class) int queueBindSparse(
        VkQueue queue,
        @Unsigned int bindInfoCount,
        @Nullable @Pointer IVkBindSparseInfo pBindInfo,
        @Nullable VkFence fence
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkQueueBindSparse);
        try {
            return (int) hFunction.invokeExact(
                queue.segment(),
                bindInfoCount,
                (MemorySegment) (pBindInfo != null ? pBindInfo.segment() : MemorySegment.NULL),
                (MemorySegment) (fence != null ? fence.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkQueueNotifyOutOfBandNV.html"><code>vkQueueNotifyOutOfBandNV</code></a>
    public void queueNotifyOutOfBandNV(
        VkQueue queue,
        @Pointer VkOutOfBandQueueTypeInfoNV pQueueTypeInfo
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkQueueNotifyOutOfBandNV);
        try {
            hFunction.invokeExact(
                queue.segment(),
                pQueueTypeInfo.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkQueuePresentKHR.html"><code>vkQueuePresentKHR</code></a>
    public @EnumType(VkResult.class) int queuePresentKHR(
        VkQueue queue,
        @Pointer VkPresentInfoKHR pPresentInfo
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkQueuePresentKHR);
        try {
            return (int) hFunction.invokeExact(
                queue.segment(),
                pPresentInfo.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkQueueSetPerformanceConfigurationINTEL.html"><code>vkQueueSetPerformanceConfigurationINTEL</code></a>
    public @EnumType(VkResult.class) int queueSetPerformanceConfigurationINTEL(
        VkQueue queue,
        VkPerformanceConfigurationINTEL configuration
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkQueueSetPerformanceConfigurationINTEL);
        try {
            return (int) hFunction.invokeExact(
                queue.segment(),
                configuration.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkQueueSubmit.html"><code>vkQueueSubmit</code></a>
    public @EnumType(VkResult.class) int queueSubmit(
        VkQueue queue,
        @Unsigned int submitCount,
        @Nullable @Pointer IVkSubmitInfo pSubmits,
        @Nullable VkFence fence
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkQueueSubmit);
        try {
            return (int) hFunction.invokeExact(
                queue.segment(),
                submitCount,
                (MemorySegment) (pSubmits != null ? pSubmits.segment() : MemorySegment.NULL),
                (MemorySegment) (fence != null ? fence.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkQueueSubmit2.html"><code>vkQueueSubmit2</code></a>
    public @EnumType(VkResult.class) int queueSubmit2(
        VkQueue queue,
        @Unsigned int submitCount,
        @Nullable @Pointer IVkSubmitInfo2 pSubmits,
        @Nullable VkFence fence
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkQueueSubmit2);
        try {
            return (int) hFunction.invokeExact(
                queue.segment(),
                submitCount,
                (MemorySegment) (pSubmits != null ? pSubmits.segment() : MemorySegment.NULL),
                (MemorySegment) (fence != null ? fence.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkQueueSubmit2KHR.html"><code>vkQueueSubmit2KHR</code></a>
    public @EnumType(VkResult.class) int queueSubmit2KHR(
        VkQueue queue,
        @Unsigned int submitCount,
        @Nullable @Pointer IVkSubmitInfo2 pSubmits,
        @Nullable VkFence fence
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkQueueSubmit2KHR);
        try {
            return (int) hFunction.invokeExact(
                queue.segment(),
                submitCount,
                (MemorySegment) (pSubmits != null ? pSubmits.segment() : MemorySegment.NULL),
                (MemorySegment) (fence != null ? fence.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkQueueWaitIdle.html"><code>vkQueueWaitIdle</code></a>
    public @EnumType(VkResult.class) int queueWaitIdle(
        VkQueue queue
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkQueueWaitIdle);
        try {
            return (int) hFunction.invokeExact(
                queue.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkRegisterDeviceEventEXT.html"><code>vkRegisterDeviceEventEXT</code></a>
    public @EnumType(VkResult.class) int registerDeviceEventEXT(
        VkDevice device,
        @Pointer VkDeviceEventInfoEXT pDeviceEventInfo,
        @Nullable @Pointer VkAllocationCallbacks pAllocator,
        @Pointer VkFence.Ptr pFence
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkRegisterDeviceEventEXT);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                pDeviceEventInfo.segment(),
                (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL),
                pFence.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkRegisterDisplayEventEXT.html"><code>vkRegisterDisplayEventEXT</code></a>
    public @EnumType(VkResult.class) int registerDisplayEventEXT(
        VkDevice device,
        VkDisplayKHR display,
        @Pointer VkDisplayEventInfoEXT pDisplayEventInfo,
        @Nullable @Pointer VkAllocationCallbacks pAllocator,
        @Pointer VkFence.Ptr pFence
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkRegisterDisplayEventEXT);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                display.segment(),
                pDisplayEventInfo.segment(),
                (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL),
                pFence.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkReleaseCapturedPipelineDataKHR.html"><code>vkReleaseCapturedPipelineDataKHR</code></a>
    public @EnumType(VkResult.class) int releaseCapturedPipelineDataKHR(
        VkDevice device,
        @Pointer VkReleaseCapturedPipelineDataInfoKHR pInfo,
        @Nullable @Pointer VkAllocationCallbacks pAllocator
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkReleaseCapturedPipelineDataKHR);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                pInfo.segment(),
                (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkReleaseFullScreenExclusiveModeEXT.html"><code>vkReleaseFullScreenExclusiveModeEXT</code></a>
    public @EnumType(VkResult.class) int releaseFullScreenExclusiveModeEXT(
        VkDevice device,
        VkSwapchainKHR swapchain
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkReleaseFullScreenExclusiveModeEXT);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                swapchain.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkReleasePerformanceConfigurationINTEL.html"><code>vkReleasePerformanceConfigurationINTEL</code></a>
    public @EnumType(VkResult.class) int releasePerformanceConfigurationINTEL(
        VkDevice device,
        @Nullable VkPerformanceConfigurationINTEL configuration
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkReleasePerformanceConfigurationINTEL);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                (MemorySegment) (configuration != null ? configuration.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkReleaseProfilingLockKHR.html"><code>vkReleaseProfilingLockKHR</code></a>
    public void releaseProfilingLockKHR(
        VkDevice device
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkReleaseProfilingLockKHR);
        try {
            hFunction.invokeExact(
                device.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkReleaseSwapchainImagesEXT.html"><code>vkReleaseSwapchainImagesEXT</code></a>
    public @EnumType(VkResult.class) int releaseSwapchainImagesEXT(
        VkDevice device,
        @Pointer VkReleaseSwapchainImagesInfoEXT pReleaseInfo
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkReleaseSwapchainImagesEXT);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                pReleaseInfo.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkResetCommandBuffer.html"><code>vkResetCommandBuffer</code></a>
    public @EnumType(VkResult.class) int resetCommandBuffer(
        VkCommandBuffer commandBuffer,
        @EnumType(VkCommandBufferResetFlags.class) int flags
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkResetCommandBuffer);
        try {
            return (int) hFunction.invokeExact(
                commandBuffer.segment(),
                flags
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkResetCommandPool.html"><code>vkResetCommandPool</code></a>
    public @EnumType(VkResult.class) int resetCommandPool(
        VkDevice device,
        VkCommandPool commandPool,
        @EnumType(VkCommandPoolResetFlags.class) int flags
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkResetCommandPool);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                commandPool.segment(),
                flags
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkResetDescriptorPool.html"><code>vkResetDescriptorPool</code></a>
    public @EnumType(VkResult.class) int resetDescriptorPool(
        VkDevice device,
        VkDescriptorPool descriptorPool,
        @EnumType(VkDescriptorPoolResetFlags.class) int flags
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkResetDescriptorPool);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                descriptorPool.segment(),
                flags
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkResetEvent.html"><code>vkResetEvent</code></a>
    public @EnumType(VkResult.class) int resetEvent(
        VkDevice device,
        VkEvent event
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkResetEvent);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                event.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkResetFences.html"><code>vkResetFences</code></a>
    public @EnumType(VkResult.class) int resetFences(
        VkDevice device,
        @Unsigned int fenceCount,
        @Pointer VkFence.Ptr pFences
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkResetFences);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                fenceCount,
                pFences.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkResetQueryPool.html"><code>vkResetQueryPool</code></a>
    public void resetQueryPool(
        VkDevice device,
        VkQueryPool queryPool,
        @Unsigned int firstQuery,
        @Unsigned int queryCount
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkResetQueryPool);
        try {
            hFunction.invokeExact(
                device.segment(),
                queryPool.segment(),
                firstQuery,
                queryCount
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkResetQueryPoolEXT.html"><code>vkResetQueryPoolEXT</code></a>
    public void resetQueryPoolEXT(
        VkDevice device,
        VkQueryPool queryPool,
        @Unsigned int firstQuery,
        @Unsigned int queryCount
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkResetQueryPoolEXT);
        try {
            hFunction.invokeExact(
                device.segment(),
                queryPool.segment(),
                firstQuery,
                queryCount
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkSetBufferCollectionBufferConstraintsFUCHSIA.html"><code>vkSetBufferCollectionBufferConstraintsFUCHSIA</code></a>
    public @EnumType(VkResult.class) int setBufferCollectionBufferConstraintsFUCHSIA(
        VkDevice device,
        VkBufferCollectionFUCHSIA collection,
        @Pointer VkBufferConstraintsInfoFUCHSIA pBufferConstraintsInfo
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkSetBufferCollectionBufferConstraintsFUCHSIA);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                collection.segment(),
                pBufferConstraintsInfo.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkSetBufferCollectionImageConstraintsFUCHSIA.html"><code>vkSetBufferCollectionImageConstraintsFUCHSIA</code></a>
    public @EnumType(VkResult.class) int setBufferCollectionImageConstraintsFUCHSIA(
        VkDevice device,
        VkBufferCollectionFUCHSIA collection,
        @Pointer VkImageConstraintsInfoFUCHSIA pImageConstraintsInfo
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkSetBufferCollectionImageConstraintsFUCHSIA);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                collection.segment(),
                pImageConstraintsInfo.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkSetDeviceMemoryPriorityEXT.html"><code>vkSetDeviceMemoryPriorityEXT</code></a>
    public void setDeviceMemoryPriorityEXT(
        VkDevice device,
        VkDeviceMemory memory,
        float priority
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkSetDeviceMemoryPriorityEXT);
        try {
            hFunction.invokeExact(
                device.segment(),
                memory.segment(),
                priority
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkSetEvent.html"><code>vkSetEvent</code></a>
    public @EnumType(VkResult.class) int setEvent(
        VkDevice device,
        VkEvent event
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkSetEvent);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                event.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkSetHdrMetadataEXT.html"><code>vkSetHdrMetadataEXT</code></a>
    public void setHdrMetadataEXT(
        VkDevice device,
        @Unsigned int swapchainCount,
        @Pointer VkSwapchainKHR.Ptr pSwapchains,
        @Pointer IVkHdrMetadataEXT pMetadata
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkSetHdrMetadataEXT);
        try {
            hFunction.invokeExact(
                device.segment(),
                swapchainCount,
                pSwapchains.segment(),
                pMetadata.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkSetLatencyMarkerNV.html"><code>vkSetLatencyMarkerNV</code></a>
    public void setLatencyMarkerNV(
        VkDevice device,
        VkSwapchainKHR swapchain,
        @Pointer VkSetLatencyMarkerInfoNV pLatencyMarkerInfo
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkSetLatencyMarkerNV);
        try {
            hFunction.invokeExact(
                device.segment(),
                swapchain.segment(),
                pLatencyMarkerInfo.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkSetLatencySleepModeNV.html"><code>vkSetLatencySleepModeNV</code></a>
    public @EnumType(VkResult.class) int setLatencySleepModeNV(
        VkDevice device,
        VkSwapchainKHR swapchain,
        @Pointer VkLatencySleepModeInfoNV pSleepModeInfo
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkSetLatencySleepModeNV);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                swapchain.segment(),
                pSleepModeInfo.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkSetLocalDimmingAMD.html"><code>vkSetLocalDimmingAMD</code></a>
    public void setLocalDimmingAMD(
        VkDevice device,
        VkSwapchainKHR swapChain,
        @NativeType("VkBool32") @Unsigned int localDimmingEnable
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkSetLocalDimmingAMD);
        try {
            hFunction.invokeExact(
                device.segment(),
                swapChain.segment(),
                localDimmingEnable
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkSetPrivateData.html"><code>vkSetPrivateData</code></a>
    public @EnumType(VkResult.class) int setPrivateData(
        VkDevice device,
        @EnumType(VkObjectType.class) int objectType,
        @Unsigned long objectHandle,
        VkPrivateDataSlot privateDataSlot,
        @Unsigned long data
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkSetPrivateData);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                objectType,
                objectHandle,
                privateDataSlot.segment(),
                data
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkSetPrivateDataEXT.html"><code>vkSetPrivateDataEXT</code></a>
    public @EnumType(VkResult.class) int setPrivateDataEXT(
        VkDevice device,
        @EnumType(VkObjectType.class) int objectType,
        @Unsigned long objectHandle,
        VkPrivateDataSlot privateDataSlot,
        @Unsigned long data
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkSetPrivateDataEXT);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                objectType,
                objectHandle,
                privateDataSlot.segment(),
                data
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkSignalSemaphore.html"><code>vkSignalSemaphore</code></a>
    public @EnumType(VkResult.class) int signalSemaphore(
        VkDevice device,
        @Pointer VkSemaphoreSignalInfo pSignalInfo
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkSignalSemaphore);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                pSignalInfo.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkSignalSemaphoreKHR.html"><code>vkSignalSemaphoreKHR</code></a>
    public @EnumType(VkResult.class) int signalSemaphoreKHR(
        VkDevice device,
        @Pointer VkSemaphoreSignalInfo pSignalInfo
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkSignalSemaphoreKHR);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                pSignalInfo.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkTransitionImageLayout.html"><code>vkTransitionImageLayout</code></a>
    public @EnumType(VkResult.class) int transitionImageLayout(
        VkDevice device,
        @Unsigned int transitionCount,
        @Pointer IVkHostImageLayoutTransitionInfo pTransitions
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkTransitionImageLayout);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                transitionCount,
                pTransitions.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkTransitionImageLayoutEXT.html"><code>vkTransitionImageLayoutEXT</code></a>
    public @EnumType(VkResult.class) int transitionImageLayoutEXT(
        VkDevice device,
        @Unsigned int transitionCount,
        @Pointer IVkHostImageLayoutTransitionInfo pTransitions
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkTransitionImageLayoutEXT);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                transitionCount,
                pTransitions.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkTrimCommandPool.html"><code>vkTrimCommandPool</code></a>
    public void trimCommandPool(
        VkDevice device,
        VkCommandPool commandPool,
        @EnumType(VkCommandPoolTrimFlags.class) int flags
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkTrimCommandPool);
        try {
            hFunction.invokeExact(
                device.segment(),
                commandPool.segment(),
                flags
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkTrimCommandPoolKHR.html"><code>vkTrimCommandPoolKHR</code></a>
    public void trimCommandPoolKHR(
        VkDevice device,
        VkCommandPool commandPool,
        @EnumType(VkCommandPoolTrimFlags.class) int flags
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkTrimCommandPoolKHR);
        try {
            hFunction.invokeExact(
                device.segment(),
                commandPool.segment(),
                flags
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkUninitializePerformanceApiINTEL.html"><code>vkUninitializePerformanceApiINTEL</code></a>
    public void uninitializePerformanceApiINTEL(
        VkDevice device
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkUninitializePerformanceApiINTEL);
        try {
            hFunction.invokeExact(
                device.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkUnmapMemory.html"><code>vkUnmapMemory</code></a>
    public void unmapMemory(
        VkDevice device,
        VkDeviceMemory memory
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkUnmapMemory);
        try {
            hFunction.invokeExact(
                device.segment(),
                memory.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkUnmapMemory2.html"><code>vkUnmapMemory2</code></a>
    public @EnumType(VkResult.class) int unmapMemory2(
        VkDevice device,
        @Pointer VkMemoryUnmapInfo pMemoryUnmapInfo
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkUnmapMemory2);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                pMemoryUnmapInfo.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkUnmapMemory2KHR.html"><code>vkUnmapMemory2KHR</code></a>
    public @EnumType(VkResult.class) int unmapMemory2KHR(
        VkDevice device,
        @Pointer VkMemoryUnmapInfo pMemoryUnmapInfo
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkUnmapMemory2KHR);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                pMemoryUnmapInfo.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkUpdateDescriptorSetWithTemplate.html"><code>vkUpdateDescriptorSetWithTemplate</code></a>
    public void updateDescriptorSetWithTemplate(
        VkDevice device,
        VkDescriptorSet descriptorSet,
        VkDescriptorUpdateTemplate descriptorUpdateTemplate,
        @Pointer(comment="void*") @NotNull MemorySegment pData
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkUpdateDescriptorSetWithTemplate);
        try {
            hFunction.invokeExact(
                device.segment(),
                descriptorSet.segment(),
                descriptorUpdateTemplate.segment(),
                pData
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkUpdateDescriptorSetWithTemplateKHR.html"><code>vkUpdateDescriptorSetWithTemplateKHR</code></a>
    public void updateDescriptorSetWithTemplateKHR(
        VkDevice device,
        VkDescriptorSet descriptorSet,
        VkDescriptorUpdateTemplate descriptorUpdateTemplate,
        @Pointer(comment="void*") @NotNull MemorySegment pData
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkUpdateDescriptorSetWithTemplateKHR);
        try {
            hFunction.invokeExact(
                device.segment(),
                descriptorSet.segment(),
                descriptorUpdateTemplate.segment(),
                pData
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkUpdateDescriptorSets.html"><code>vkUpdateDescriptorSets</code></a>
    public void updateDescriptorSets(
        VkDevice device,
        @Unsigned int descriptorWriteCount,
        @Nullable @Pointer IVkWriteDescriptorSet pDescriptorWrites,
        @Unsigned int descriptorCopyCount,
        @Nullable @Pointer IVkCopyDescriptorSet pDescriptorCopies
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkUpdateDescriptorSets);
        try {
            hFunction.invokeExact(
                device.segment(),
                descriptorWriteCount,
                (MemorySegment) (pDescriptorWrites != null ? pDescriptorWrites.segment() : MemorySegment.NULL),
                descriptorCopyCount,
                (MemorySegment) (pDescriptorCopies != null ? pDescriptorCopies.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkUpdateIndirectExecutionSetPipelineEXT.html"><code>vkUpdateIndirectExecutionSetPipelineEXT</code></a>
    public void updateIndirectExecutionSetPipelineEXT(
        VkDevice device,
        VkIndirectExecutionSetEXT indirectExecutionSet,
        @Unsigned int executionSetWriteCount,
        @Pointer IVkWriteIndirectExecutionSetPipelineEXT pExecutionSetWrites
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkUpdateIndirectExecutionSetPipelineEXT);
        try {
            hFunction.invokeExact(
                device.segment(),
                indirectExecutionSet.segment(),
                executionSetWriteCount,
                pExecutionSetWrites.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkUpdateIndirectExecutionSetShaderEXT.html"><code>vkUpdateIndirectExecutionSetShaderEXT</code></a>
    public void updateIndirectExecutionSetShaderEXT(
        VkDevice device,
        VkIndirectExecutionSetEXT indirectExecutionSet,
        @Unsigned int executionSetWriteCount,
        @Pointer IVkWriteIndirectExecutionSetShaderEXT pExecutionSetWrites
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkUpdateIndirectExecutionSetShaderEXT);
        try {
            hFunction.invokeExact(
                device.segment(),
                indirectExecutionSet.segment(),
                executionSetWriteCount,
                pExecutionSetWrites.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkUpdateVideoSessionParametersKHR.html"><code>vkUpdateVideoSessionParametersKHR</code></a>
    public @EnumType(VkResult.class) int updateVideoSessionParametersKHR(
        VkDevice device,
        VkVideoSessionParametersKHR videoSessionParameters,
        @Pointer VkVideoSessionParametersUpdateInfoKHR pUpdateInfo
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkUpdateVideoSessionParametersKHR);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                videoSessionParameters.segment(),
                pUpdateInfo.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkWaitForFences.html"><code>vkWaitForFences</code></a>
    public @EnumType(VkResult.class) int waitForFences(
        VkDevice device,
        @Unsigned int fenceCount,
        @Pointer VkFence.Ptr pFences,
        @NativeType("VkBool32") @Unsigned int waitAll,
        @Unsigned long timeout
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkWaitForFences);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                fenceCount,
                pFences.segment(),
                waitAll,
                timeout
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkWaitForPresentKHR.html"><code>vkWaitForPresentKHR</code></a>
    public @EnumType(VkResult.class) int waitForPresentKHR(
        VkDevice device,
        VkSwapchainKHR swapchain,
        @Unsigned long presentId,
        @Unsigned long timeout
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkWaitForPresentKHR);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                swapchain.segment(),
                presentId,
                timeout
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkWaitSemaphores.html"><code>vkWaitSemaphores</code></a>
    public @EnumType(VkResult.class) int waitSemaphores(
        VkDevice device,
        @Pointer VkSemaphoreWaitInfo pWaitInfo,
        @Unsigned long timeout
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkWaitSemaphores);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                pWaitInfo.segment(),
                timeout
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkWaitSemaphoresKHR.html"><code>vkWaitSemaphoresKHR</code></a>
    public @EnumType(VkResult.class) int waitSemaphoresKHR(
        VkDevice device,
        @Pointer VkSemaphoreWaitInfo pWaitInfo,
        @Unsigned long timeout
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkWaitSemaphoresKHR);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                pWaitInfo.segment(),
                timeout
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkWriteAccelerationStructuresPropertiesKHR.html"><code>vkWriteAccelerationStructuresPropertiesKHR</code></a>
    public @EnumType(VkResult.class) int writeAccelerationStructuresPropertiesKHR(
        VkDevice device,
        @Unsigned int accelerationStructureCount,
        @Pointer VkAccelerationStructureKHR.Ptr pAccelerationStructures,
        @EnumType(VkQueryType.class) int queryType,
        long dataSize,
        @Pointer(comment="void*") @NotNull MemorySegment pData,
        long stride
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkWriteAccelerationStructuresPropertiesKHR);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                accelerationStructureCount,
                pAccelerationStructures.segment(),
                queryType,
                MemorySegment.ofAddress(dataSize),
                pData,
                MemorySegment.ofAddress(stride)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/vkWriteMicromapsPropertiesEXT.html"><code>vkWriteMicromapsPropertiesEXT</code></a>
    public @EnumType(VkResult.class) int writeMicromapsPropertiesEXT(
        VkDevice device,
        @Unsigned int micromapCount,
        @Pointer VkMicromapEXT.Ptr pMicromaps,
        @EnumType(VkQueryType.class) int queryType,
        long dataSize,
        @Pointer(comment="void*") @NotNull MemorySegment pData,
        long stride
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$vkWriteMicromapsPropertiesEXT);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                micromapCount,
                pMicromaps.segment(),
                queryType,
                MemorySegment.ofAddress(dataSize),
                pData,
                MemorySegment.ofAddress(stride)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    // endregion

    // region segments and handles
    public final @Nullable MemorySegment SEGMENT$vkAcquireFullScreenExclusiveModeEXT;
    public final @Nullable MemorySegment SEGMENT$vkAcquireNextImage2KHR;
    public final @Nullable MemorySegment SEGMENT$vkAcquireNextImageKHR;
    public final @Nullable MemorySegment SEGMENT$vkAcquirePerformanceConfigurationINTEL;
    public final @Nullable MemorySegment SEGMENT$vkAcquireProfilingLockKHR;
    public final @Nullable MemorySegment SEGMENT$vkAllocateCommandBuffers;
    public final @Nullable MemorySegment SEGMENT$vkAllocateDescriptorSets;
    public final @Nullable MemorySegment SEGMENT$vkAllocateMemory;
    public final @Nullable MemorySegment SEGMENT$vkAntiLagUpdateAMD;
    public final @Nullable MemorySegment SEGMENT$vkBeginCommandBuffer;
    public final @Nullable MemorySegment SEGMENT$vkBindAccelerationStructureMemoryNV;
    public final @Nullable MemorySegment SEGMENT$vkBindBufferMemory;
    public final @Nullable MemorySegment SEGMENT$vkBindBufferMemory2;
    public final @Nullable MemorySegment SEGMENT$vkBindBufferMemory2KHR;
    public final @Nullable MemorySegment SEGMENT$vkBindImageMemory;
    public final @Nullable MemorySegment SEGMENT$vkBindImageMemory2;
    public final @Nullable MemorySegment SEGMENT$vkBindImageMemory2KHR;
    public final @Nullable MemorySegment SEGMENT$vkBindOpticalFlowSessionImageNV;
    public final @Nullable MemorySegment SEGMENT$vkBindVideoSessionMemoryKHR;
    public final @Nullable MemorySegment SEGMENT$vkBuildAccelerationStructuresKHR;
    public final @Nullable MemorySegment SEGMENT$vkBuildMicromapsEXT;
    public final @Nullable MemorySegment SEGMENT$vkCmdBeginConditionalRenderingEXT;
    public final @Nullable MemorySegment SEGMENT$vkCmdBeginPerTileExecutionQCOM;
    public final @Nullable MemorySegment SEGMENT$vkCmdBeginQuery;
    public final @Nullable MemorySegment SEGMENT$vkCmdBeginQueryIndexedEXT;
    public final @Nullable MemorySegment SEGMENT$vkCmdBeginRenderPass;
    public final @Nullable MemorySegment SEGMENT$vkCmdBeginRenderPass2;
    public final @Nullable MemorySegment SEGMENT$vkCmdBeginRenderPass2KHR;
    public final @Nullable MemorySegment SEGMENT$vkCmdBeginRendering;
    public final @Nullable MemorySegment SEGMENT$vkCmdBeginRenderingKHR;
    public final @Nullable MemorySegment SEGMENT$vkCmdBeginTransformFeedbackEXT;
    public final @Nullable MemorySegment SEGMENT$vkCmdBeginVideoCodingKHR;
    public final @Nullable MemorySegment SEGMENT$vkCmdBindDescriptorBufferEmbeddedSamplers2EXT;
    public final @Nullable MemorySegment SEGMENT$vkCmdBindDescriptorBufferEmbeddedSamplersEXT;
    public final @Nullable MemorySegment SEGMENT$vkCmdBindDescriptorBuffersEXT;
    public final @Nullable MemorySegment SEGMENT$vkCmdBindDescriptorSets;
    public final @Nullable MemorySegment SEGMENT$vkCmdBindDescriptorSets2;
    public final @Nullable MemorySegment SEGMENT$vkCmdBindDescriptorSets2KHR;
    public final @Nullable MemorySegment SEGMENT$vkCmdBindIndexBuffer;
    public final @Nullable MemorySegment SEGMENT$vkCmdBindIndexBuffer2;
    public final @Nullable MemorySegment SEGMENT$vkCmdBindIndexBuffer2KHR;
    public final @Nullable MemorySegment SEGMENT$vkCmdBindInvocationMaskHUAWEI;
    public final @Nullable MemorySegment SEGMENT$vkCmdBindPipeline;
    public final @Nullable MemorySegment SEGMENT$vkCmdBindPipelineShaderGroupNV;
    public final @Nullable MemorySegment SEGMENT$vkCmdBindShadersEXT;
    public final @Nullable MemorySegment SEGMENT$vkCmdBindShadingRateImageNV;
    public final @Nullable MemorySegment SEGMENT$vkCmdBindTileMemoryQCOM;
    public final @Nullable MemorySegment SEGMENT$vkCmdBindTransformFeedbackBuffersEXT;
    public final @Nullable MemorySegment SEGMENT$vkCmdBindVertexBuffers;
    public final @Nullable MemorySegment SEGMENT$vkCmdBindVertexBuffers2;
    public final @Nullable MemorySegment SEGMENT$vkCmdBindVertexBuffers2EXT;
    public final @Nullable MemorySegment SEGMENT$vkCmdBlitImage;
    public final @Nullable MemorySegment SEGMENT$vkCmdBlitImage2;
    public final @Nullable MemorySegment SEGMENT$vkCmdBlitImage2KHR;
    public final @Nullable MemorySegment SEGMENT$vkCmdBuildAccelerationStructureNV;
    public final @Nullable MemorySegment SEGMENT$vkCmdBuildAccelerationStructuresIndirectKHR;
    public final @Nullable MemorySegment SEGMENT$vkCmdBuildAccelerationStructuresKHR;
    public final @Nullable MemorySegment SEGMENT$vkCmdBuildClusterAccelerationStructureIndirectNV;
    public final @Nullable MemorySegment SEGMENT$vkCmdBuildMicromapsEXT;
    public final @Nullable MemorySegment SEGMENT$vkCmdBuildPartitionedAccelerationStructuresNV;
    public final @Nullable MemorySegment SEGMENT$vkCmdClearAttachments;
    public final @Nullable MemorySegment SEGMENT$vkCmdClearColorImage;
    public final @Nullable MemorySegment SEGMENT$vkCmdClearDepthStencilImage;
    public final @Nullable MemorySegment SEGMENT$vkCmdControlVideoCodingKHR;
    public final @Nullable MemorySegment SEGMENT$vkCmdConvertCooperativeVectorMatrixNV;
    public final @Nullable MemorySegment SEGMENT$vkCmdCopyAccelerationStructureKHR;
    public final @Nullable MemorySegment SEGMENT$vkCmdCopyAccelerationStructureNV;
    public final @Nullable MemorySegment SEGMENT$vkCmdCopyAccelerationStructureToMemoryKHR;
    public final @Nullable MemorySegment SEGMENT$vkCmdCopyBuffer;
    public final @Nullable MemorySegment SEGMENT$vkCmdCopyBuffer2;
    public final @Nullable MemorySegment SEGMENT$vkCmdCopyBuffer2KHR;
    public final @Nullable MemorySegment SEGMENT$vkCmdCopyBufferToImage;
    public final @Nullable MemorySegment SEGMENT$vkCmdCopyBufferToImage2;
    public final @Nullable MemorySegment SEGMENT$vkCmdCopyBufferToImage2KHR;
    public final @Nullable MemorySegment SEGMENT$vkCmdCopyImage;
    public final @Nullable MemorySegment SEGMENT$vkCmdCopyImage2;
    public final @Nullable MemorySegment SEGMENT$vkCmdCopyImage2KHR;
    public final @Nullable MemorySegment SEGMENT$vkCmdCopyImageToBuffer;
    public final @Nullable MemorySegment SEGMENT$vkCmdCopyImageToBuffer2;
    public final @Nullable MemorySegment SEGMENT$vkCmdCopyImageToBuffer2KHR;
    public final @Nullable MemorySegment SEGMENT$vkCmdCopyMemoryIndirectNV;
    public final @Nullable MemorySegment SEGMENT$vkCmdCopyMemoryToAccelerationStructureKHR;
    public final @Nullable MemorySegment SEGMENT$vkCmdCopyMemoryToImageIndirectNV;
    public final @Nullable MemorySegment SEGMENT$vkCmdCopyMemoryToMicromapEXT;
    public final @Nullable MemorySegment SEGMENT$vkCmdCopyMicromapEXT;
    public final @Nullable MemorySegment SEGMENT$vkCmdCopyMicromapToMemoryEXT;
    public final @Nullable MemorySegment SEGMENT$vkCmdCopyQueryPoolResults;
    public final @Nullable MemorySegment SEGMENT$vkCmdCuLaunchKernelNVX;
    public final @Nullable MemorySegment SEGMENT$vkCmdCudaLaunchKernelNV;
    public final @Nullable MemorySegment SEGMENT$vkCmdDebugMarkerBeginEXT;
    public final @Nullable MemorySegment SEGMENT$vkCmdDebugMarkerEndEXT;
    public final @Nullable MemorySegment SEGMENT$vkCmdDebugMarkerInsertEXT;
    public final @Nullable MemorySegment SEGMENT$vkCmdDecodeVideoKHR;
    public final @Nullable MemorySegment SEGMENT$vkCmdDecompressMemoryIndirectCountNV;
    public final @Nullable MemorySegment SEGMENT$vkCmdDecompressMemoryNV;
    public final @Nullable MemorySegment SEGMENT$vkCmdDispatch;
    public final @Nullable MemorySegment SEGMENT$vkCmdDispatchBase;
    public final @Nullable MemorySegment SEGMENT$vkCmdDispatchBaseKHR;
    public final @Nullable MemorySegment SEGMENT$vkCmdDispatchGraphAMDX;
    public final @Nullable MemorySegment SEGMENT$vkCmdDispatchGraphIndirectAMDX;
    public final @Nullable MemorySegment SEGMENT$vkCmdDispatchGraphIndirectCountAMDX;
    public final @Nullable MemorySegment SEGMENT$vkCmdDispatchIndirect;
    public final @Nullable MemorySegment SEGMENT$vkCmdDispatchTileQCOM;
    public final @Nullable MemorySegment SEGMENT$vkCmdDraw;
    public final @Nullable MemorySegment SEGMENT$vkCmdDrawClusterHUAWEI;
    public final @Nullable MemorySegment SEGMENT$vkCmdDrawClusterIndirectHUAWEI;
    public final @Nullable MemorySegment SEGMENT$vkCmdDrawIndexed;
    public final @Nullable MemorySegment SEGMENT$vkCmdDrawIndexedIndirect;
    public final @Nullable MemorySegment SEGMENT$vkCmdDrawIndexedIndirectCount;
    public final @Nullable MemorySegment SEGMENT$vkCmdDrawIndexedIndirectCountAMD;
    public final @Nullable MemorySegment SEGMENT$vkCmdDrawIndexedIndirectCountKHR;
    public final @Nullable MemorySegment SEGMENT$vkCmdDrawIndirect;
    public final @Nullable MemorySegment SEGMENT$vkCmdDrawIndirectByteCountEXT;
    public final @Nullable MemorySegment SEGMENT$vkCmdDrawIndirectCount;
    public final @Nullable MemorySegment SEGMENT$vkCmdDrawIndirectCountAMD;
    public final @Nullable MemorySegment SEGMENT$vkCmdDrawIndirectCountKHR;
    public final @Nullable MemorySegment SEGMENT$vkCmdDrawMeshTasksEXT;
    public final @Nullable MemorySegment SEGMENT$vkCmdDrawMeshTasksIndirectCountEXT;
    public final @Nullable MemorySegment SEGMENT$vkCmdDrawMeshTasksIndirectCountNV;
    public final @Nullable MemorySegment SEGMENT$vkCmdDrawMeshTasksIndirectEXT;
    public final @Nullable MemorySegment SEGMENT$vkCmdDrawMeshTasksIndirectNV;
    public final @Nullable MemorySegment SEGMENT$vkCmdDrawMeshTasksNV;
    public final @Nullable MemorySegment SEGMENT$vkCmdDrawMultiEXT;
    public final @Nullable MemorySegment SEGMENT$vkCmdDrawMultiIndexedEXT;
    public final @Nullable MemorySegment SEGMENT$vkCmdEncodeVideoKHR;
    public final @Nullable MemorySegment SEGMENT$vkCmdEndConditionalRenderingEXT;
    public final @Nullable MemorySegment SEGMENT$vkCmdEndPerTileExecutionQCOM;
    public final @Nullable MemorySegment SEGMENT$vkCmdEndQuery;
    public final @Nullable MemorySegment SEGMENT$vkCmdEndQueryIndexedEXT;
    public final @Nullable MemorySegment SEGMENT$vkCmdEndRenderPass;
    public final @Nullable MemorySegment SEGMENT$vkCmdEndRenderPass2;
    public final @Nullable MemorySegment SEGMENT$vkCmdEndRenderPass2KHR;
    public final @Nullable MemorySegment SEGMENT$vkCmdEndRendering;
    public final @Nullable MemorySegment SEGMENT$vkCmdEndRendering2EXT;
    public final @Nullable MemorySegment SEGMENT$vkCmdEndRenderingKHR;
    public final @Nullable MemorySegment SEGMENT$vkCmdEndTransformFeedbackEXT;
    public final @Nullable MemorySegment SEGMENT$vkCmdEndVideoCodingKHR;
    public final @Nullable MemorySegment SEGMENT$vkCmdExecuteCommands;
    public final @Nullable MemorySegment SEGMENT$vkCmdExecuteGeneratedCommandsEXT;
    public final @Nullable MemorySegment SEGMENT$vkCmdExecuteGeneratedCommandsNV;
    public final @Nullable MemorySegment SEGMENT$vkCmdFillBuffer;
    public final @Nullable MemorySegment SEGMENT$vkCmdInitializeGraphScratchMemoryAMDX;
    public final @Nullable MemorySegment SEGMENT$vkCmdNextSubpass;
    public final @Nullable MemorySegment SEGMENT$vkCmdNextSubpass2;
    public final @Nullable MemorySegment SEGMENT$vkCmdNextSubpass2KHR;
    public final @Nullable MemorySegment SEGMENT$vkCmdOpticalFlowExecuteNV;
    public final @Nullable MemorySegment SEGMENT$vkCmdPipelineBarrier;
    public final @Nullable MemorySegment SEGMENT$vkCmdPipelineBarrier2;
    public final @Nullable MemorySegment SEGMENT$vkCmdPipelineBarrier2KHR;
    public final @Nullable MemorySegment SEGMENT$vkCmdPreprocessGeneratedCommandsEXT;
    public final @Nullable MemorySegment SEGMENT$vkCmdPreprocessGeneratedCommandsNV;
    public final @Nullable MemorySegment SEGMENT$vkCmdPushConstants;
    public final @Nullable MemorySegment SEGMENT$vkCmdPushConstants2;
    public final @Nullable MemorySegment SEGMENT$vkCmdPushConstants2KHR;
    public final @Nullable MemorySegment SEGMENT$vkCmdPushDescriptorSet;
    public final @Nullable MemorySegment SEGMENT$vkCmdPushDescriptorSet2;
    public final @Nullable MemorySegment SEGMENT$vkCmdPushDescriptorSet2KHR;
    public final @Nullable MemorySegment SEGMENT$vkCmdPushDescriptorSetKHR;
    public final @Nullable MemorySegment SEGMENT$vkCmdPushDescriptorSetWithTemplate;
    public final @Nullable MemorySegment SEGMENT$vkCmdPushDescriptorSetWithTemplate2;
    public final @Nullable MemorySegment SEGMENT$vkCmdPushDescriptorSetWithTemplate2KHR;
    public final @Nullable MemorySegment SEGMENT$vkCmdPushDescriptorSetWithTemplateKHR;
    public final @Nullable MemorySegment SEGMENT$vkCmdRefreshObjectsKHR;
    public final @Nullable MemorySegment SEGMENT$vkCmdResetEvent;
    public final @Nullable MemorySegment SEGMENT$vkCmdResetEvent2;
    public final @Nullable MemorySegment SEGMENT$vkCmdResetEvent2KHR;
    public final @Nullable MemorySegment SEGMENT$vkCmdResetQueryPool;
    public final @Nullable MemorySegment SEGMENT$vkCmdResolveImage;
    public final @Nullable MemorySegment SEGMENT$vkCmdResolveImage2;
    public final @Nullable MemorySegment SEGMENT$vkCmdResolveImage2KHR;
    public final @Nullable MemorySegment SEGMENT$vkCmdSetAlphaToCoverageEnableEXT;
    public final @Nullable MemorySegment SEGMENT$vkCmdSetAlphaToOneEnableEXT;
    public final @Nullable MemorySegment SEGMENT$vkCmdSetAttachmentFeedbackLoopEnableEXT;
    public final @Nullable MemorySegment SEGMENT$vkCmdSetBlendConstants;
    public final @Nullable MemorySegment SEGMENT$vkCmdSetCheckpointNV;
    public final @Nullable MemorySegment SEGMENT$vkCmdSetCoarseSampleOrderNV;
    public final @Nullable MemorySegment SEGMENT$vkCmdSetColorBlendAdvancedEXT;
    public final @Nullable MemorySegment SEGMENT$vkCmdSetColorBlendEnableEXT;
    public final @Nullable MemorySegment SEGMENT$vkCmdSetColorBlendEquationEXT;
    public final @Nullable MemorySegment SEGMENT$vkCmdSetColorWriteEnableEXT;
    public final @Nullable MemorySegment SEGMENT$vkCmdSetColorWriteMaskEXT;
    public final @Nullable MemorySegment SEGMENT$vkCmdSetConservativeRasterizationModeEXT;
    public final @Nullable MemorySegment SEGMENT$vkCmdSetCoverageModulationModeNV;
    public final @Nullable MemorySegment SEGMENT$vkCmdSetCoverageModulationTableEnableNV;
    public final @Nullable MemorySegment SEGMENT$vkCmdSetCoverageModulationTableNV;
    public final @Nullable MemorySegment SEGMENT$vkCmdSetCoverageReductionModeNV;
    public final @Nullable MemorySegment SEGMENT$vkCmdSetCoverageToColorEnableNV;
    public final @Nullable MemorySegment SEGMENT$vkCmdSetCoverageToColorLocationNV;
    public final @Nullable MemorySegment SEGMENT$vkCmdSetCullMode;
    public final @Nullable MemorySegment SEGMENT$vkCmdSetCullModeEXT;
    public final @Nullable MemorySegment SEGMENT$vkCmdSetDepthBias;
    public final @Nullable MemorySegment SEGMENT$vkCmdSetDepthBias2EXT;
    public final @Nullable MemorySegment SEGMENT$vkCmdSetDepthBiasEnable;
    public final @Nullable MemorySegment SEGMENT$vkCmdSetDepthBiasEnableEXT;
    public final @Nullable MemorySegment SEGMENT$vkCmdSetDepthBounds;
    public final @Nullable MemorySegment SEGMENT$vkCmdSetDepthBoundsTestEnable;
    public final @Nullable MemorySegment SEGMENT$vkCmdSetDepthBoundsTestEnableEXT;
    public final @Nullable MemorySegment SEGMENT$vkCmdSetDepthClampEnableEXT;
    public final @Nullable MemorySegment SEGMENT$vkCmdSetDepthClampRangeEXT;
    public final @Nullable MemorySegment SEGMENT$vkCmdSetDepthClipEnableEXT;
    public final @Nullable MemorySegment SEGMENT$vkCmdSetDepthClipNegativeOneToOneEXT;
    public final @Nullable MemorySegment SEGMENT$vkCmdSetDepthCompareOp;
    public final @Nullable MemorySegment SEGMENT$vkCmdSetDepthCompareOpEXT;
    public final @Nullable MemorySegment SEGMENT$vkCmdSetDepthTestEnable;
    public final @Nullable MemorySegment SEGMENT$vkCmdSetDepthTestEnableEXT;
    public final @Nullable MemorySegment SEGMENT$vkCmdSetDepthWriteEnable;
    public final @Nullable MemorySegment SEGMENT$vkCmdSetDepthWriteEnableEXT;
    public final @Nullable MemorySegment SEGMENT$vkCmdSetDescriptorBufferOffsets2EXT;
    public final @Nullable MemorySegment SEGMENT$vkCmdSetDescriptorBufferOffsetsEXT;
    public final @Nullable MemorySegment SEGMENT$vkCmdSetDeviceMask;
    public final @Nullable MemorySegment SEGMENT$vkCmdSetDeviceMaskKHR;
    public final @Nullable MemorySegment SEGMENT$vkCmdSetDiscardRectangleEXT;
    public final @Nullable MemorySegment SEGMENT$vkCmdSetDiscardRectangleEnableEXT;
    public final @Nullable MemorySegment SEGMENT$vkCmdSetDiscardRectangleModeEXT;
    public final @Nullable MemorySegment SEGMENT$vkCmdSetEvent;
    public final @Nullable MemorySegment SEGMENT$vkCmdSetEvent2;
    public final @Nullable MemorySegment SEGMENT$vkCmdSetEvent2KHR;
    public final @Nullable MemorySegment SEGMENT$vkCmdSetExclusiveScissorEnableNV;
    public final @Nullable MemorySegment SEGMENT$vkCmdSetExclusiveScissorNV;
    public final @Nullable MemorySegment SEGMENT$vkCmdSetExtraPrimitiveOverestimationSizeEXT;
    public final @Nullable MemorySegment SEGMENT$vkCmdSetFragmentShadingRateEnumNV;
    public final @Nullable MemorySegment SEGMENT$vkCmdSetFragmentShadingRateKHR;
    public final @Nullable MemorySegment SEGMENT$vkCmdSetFrontFace;
    public final @Nullable MemorySegment SEGMENT$vkCmdSetFrontFaceEXT;
    public final @Nullable MemorySegment SEGMENT$vkCmdSetLineRasterizationModeEXT;
    public final @Nullable MemorySegment SEGMENT$vkCmdSetLineStipple;
    public final @Nullable MemorySegment SEGMENT$vkCmdSetLineStippleEXT;
    public final @Nullable MemorySegment SEGMENT$vkCmdSetLineStippleEnableEXT;
    public final @Nullable MemorySegment SEGMENT$vkCmdSetLineStippleKHR;
    public final @Nullable MemorySegment SEGMENT$vkCmdSetLineWidth;
    public final @Nullable MemorySegment SEGMENT$vkCmdSetLogicOpEXT;
    public final @Nullable MemorySegment SEGMENT$vkCmdSetLogicOpEnableEXT;
    public final @Nullable MemorySegment SEGMENT$vkCmdSetPatchControlPointsEXT;
    public final @Nullable MemorySegment SEGMENT$vkCmdSetPerformanceMarkerINTEL;
    public final @Nullable MemorySegment SEGMENT$vkCmdSetPerformanceOverrideINTEL;
    public final @Nullable MemorySegment SEGMENT$vkCmdSetPerformanceStreamMarkerINTEL;
    public final @Nullable MemorySegment SEGMENT$vkCmdSetPolygonModeEXT;
    public final @Nullable MemorySegment SEGMENT$vkCmdSetPrimitiveRestartEnable;
    public final @Nullable MemorySegment SEGMENT$vkCmdSetPrimitiveRestartEnableEXT;
    public final @Nullable MemorySegment SEGMENT$vkCmdSetPrimitiveTopology;
    public final @Nullable MemorySegment SEGMENT$vkCmdSetPrimitiveTopologyEXT;
    public final @Nullable MemorySegment SEGMENT$vkCmdSetProvokingVertexModeEXT;
    public final @Nullable MemorySegment SEGMENT$vkCmdSetRasterizationSamplesEXT;
    public final @Nullable MemorySegment SEGMENT$vkCmdSetRasterizationStreamEXT;
    public final @Nullable MemorySegment SEGMENT$vkCmdSetRasterizerDiscardEnable;
    public final @Nullable MemorySegment SEGMENT$vkCmdSetRasterizerDiscardEnableEXT;
    public final @Nullable MemorySegment SEGMENT$vkCmdSetRayTracingPipelineStackSizeKHR;
    public final @Nullable MemorySegment SEGMENT$vkCmdSetRenderingAttachmentLocations;
    public final @Nullable MemorySegment SEGMENT$vkCmdSetRenderingAttachmentLocationsKHR;
    public final @Nullable MemorySegment SEGMENT$vkCmdSetRenderingInputAttachmentIndices;
    public final @Nullable MemorySegment SEGMENT$vkCmdSetRenderingInputAttachmentIndicesKHR;
    public final @Nullable MemorySegment SEGMENT$vkCmdSetRepresentativeFragmentTestEnableNV;
    public final @Nullable MemorySegment SEGMENT$vkCmdSetSampleLocationsEXT;
    public final @Nullable MemorySegment SEGMENT$vkCmdSetSampleLocationsEnableEXT;
    public final @Nullable MemorySegment SEGMENT$vkCmdSetSampleMaskEXT;
    public final @Nullable MemorySegment SEGMENT$vkCmdSetScissor;
    public final @Nullable MemorySegment SEGMENT$vkCmdSetScissorWithCount;
    public final @Nullable MemorySegment SEGMENT$vkCmdSetScissorWithCountEXT;
    public final @Nullable MemorySegment SEGMENT$vkCmdSetShadingRateImageEnableNV;
    public final @Nullable MemorySegment SEGMENT$vkCmdSetStencilCompareMask;
    public final @Nullable MemorySegment SEGMENT$vkCmdSetStencilOp;
    public final @Nullable MemorySegment SEGMENT$vkCmdSetStencilOpEXT;
    public final @Nullable MemorySegment SEGMENT$vkCmdSetStencilReference;
    public final @Nullable MemorySegment SEGMENT$vkCmdSetStencilTestEnable;
    public final @Nullable MemorySegment SEGMENT$vkCmdSetStencilTestEnableEXT;
    public final @Nullable MemorySegment SEGMENT$vkCmdSetStencilWriteMask;
    public final @Nullable MemorySegment SEGMENT$vkCmdSetTessellationDomainOriginEXT;
    public final @Nullable MemorySegment SEGMENT$vkCmdSetVertexInputEXT;
    public final @Nullable MemorySegment SEGMENT$vkCmdSetViewport;
    public final @Nullable MemorySegment SEGMENT$vkCmdSetViewportShadingRatePaletteNV;
    public final @Nullable MemorySegment SEGMENT$vkCmdSetViewportSwizzleNV;
    public final @Nullable MemorySegment SEGMENT$vkCmdSetViewportWScalingEnableNV;
    public final @Nullable MemorySegment SEGMENT$vkCmdSetViewportWScalingNV;
    public final @Nullable MemorySegment SEGMENT$vkCmdSetViewportWithCount;
    public final @Nullable MemorySegment SEGMENT$vkCmdSetViewportWithCountEXT;
    public final @Nullable MemorySegment SEGMENT$vkCmdSubpassShadingHUAWEI;
    public final @Nullable MemorySegment SEGMENT$vkCmdTraceRaysIndirect2KHR;
    public final @Nullable MemorySegment SEGMENT$vkCmdTraceRaysIndirectKHR;
    public final @Nullable MemorySegment SEGMENT$vkCmdTraceRaysKHR;
    public final @Nullable MemorySegment SEGMENT$vkCmdTraceRaysNV;
    public final @Nullable MemorySegment SEGMENT$vkCmdUpdateBuffer;
    public final @Nullable MemorySegment SEGMENT$vkCmdUpdatePipelineIndirectBufferNV;
    public final @Nullable MemorySegment SEGMENT$vkCmdWaitEvents;
    public final @Nullable MemorySegment SEGMENT$vkCmdWaitEvents2;
    public final @Nullable MemorySegment SEGMENT$vkCmdWaitEvents2KHR;
    public final @Nullable MemorySegment SEGMENT$vkCmdWriteAccelerationStructuresPropertiesKHR;
    public final @Nullable MemorySegment SEGMENT$vkCmdWriteAccelerationStructuresPropertiesNV;
    public final @Nullable MemorySegment SEGMENT$vkCmdWriteBufferMarker2AMD;
    public final @Nullable MemorySegment SEGMENT$vkCmdWriteBufferMarkerAMD;
    public final @Nullable MemorySegment SEGMENT$vkCmdWriteMicromapsPropertiesEXT;
    public final @Nullable MemorySegment SEGMENT$vkCmdWriteTimestamp;
    public final @Nullable MemorySegment SEGMENT$vkCmdWriteTimestamp2;
    public final @Nullable MemorySegment SEGMENT$vkCmdWriteTimestamp2KHR;
    public final @Nullable MemorySegment SEGMENT$vkCompileDeferredNV;
    public final @Nullable MemorySegment SEGMENT$vkConvertCooperativeVectorMatrixNV;
    public final @Nullable MemorySegment SEGMENT$vkCopyAccelerationStructureKHR;
    public final @Nullable MemorySegment SEGMENT$vkCopyAccelerationStructureToMemoryKHR;
    public final @Nullable MemorySegment SEGMENT$vkCopyImageToImage;
    public final @Nullable MemorySegment SEGMENT$vkCopyImageToImageEXT;
    public final @Nullable MemorySegment SEGMENT$vkCopyImageToMemory;
    public final @Nullable MemorySegment SEGMENT$vkCopyImageToMemoryEXT;
    public final @Nullable MemorySegment SEGMENT$vkCopyMemoryToAccelerationStructureKHR;
    public final @Nullable MemorySegment SEGMENT$vkCopyMemoryToImage;
    public final @Nullable MemorySegment SEGMENT$vkCopyMemoryToImageEXT;
    public final @Nullable MemorySegment SEGMENT$vkCopyMemoryToMicromapEXT;
    public final @Nullable MemorySegment SEGMENT$vkCopyMicromapEXT;
    public final @Nullable MemorySegment SEGMENT$vkCopyMicromapToMemoryEXT;
    public final @Nullable MemorySegment SEGMENT$vkCreateAccelerationStructureKHR;
    public final @Nullable MemorySegment SEGMENT$vkCreateAccelerationStructureNV;
    public final @Nullable MemorySegment SEGMENT$vkCreateBuffer;
    public final @Nullable MemorySegment SEGMENT$vkCreateBufferCollectionFUCHSIA;
    public final @Nullable MemorySegment SEGMENT$vkCreateBufferView;
    public final @Nullable MemorySegment SEGMENT$vkCreateCommandPool;
    public final @Nullable MemorySegment SEGMENT$vkCreateComputePipelines;
    public final @Nullable MemorySegment SEGMENT$vkCreateCuFunctionNVX;
    public final @Nullable MemorySegment SEGMENT$vkCreateCuModuleNVX;
    public final @Nullable MemorySegment SEGMENT$vkCreateCudaFunctionNV;
    public final @Nullable MemorySegment SEGMENT$vkCreateCudaModuleNV;
    public final @Nullable MemorySegment SEGMENT$vkCreateDeferredOperationKHR;
    public final @Nullable MemorySegment SEGMENT$vkCreateDescriptorPool;
    public final @Nullable MemorySegment SEGMENT$vkCreateDescriptorSetLayout;
    public final @Nullable MemorySegment SEGMENT$vkCreateDescriptorUpdateTemplate;
    public final @Nullable MemorySegment SEGMENT$vkCreateDescriptorUpdateTemplateKHR;
    public final @Nullable MemorySegment SEGMENT$vkCreateEvent;
    public final @Nullable MemorySegment SEGMENT$vkCreateExecutionGraphPipelinesAMDX;
    public final @Nullable MemorySegment SEGMENT$vkCreateExternalComputeQueueNV;
    public final @Nullable MemorySegment SEGMENT$vkCreateFence;
    public final @Nullable MemorySegment SEGMENT$vkCreateFramebuffer;
    public final @Nullable MemorySegment SEGMENT$vkCreateGraphicsPipelines;
    public final @Nullable MemorySegment SEGMENT$vkCreateImage;
    public final @Nullable MemorySegment SEGMENT$vkCreateImageView;
    public final @Nullable MemorySegment SEGMENT$vkCreateIndirectCommandsLayoutEXT;
    public final @Nullable MemorySegment SEGMENT$vkCreateIndirectCommandsLayoutNV;
    public final @Nullable MemorySegment SEGMENT$vkCreateIndirectExecutionSetEXT;
    public final @Nullable MemorySegment SEGMENT$vkCreateMicromapEXT;
    public final @Nullable MemorySegment SEGMENT$vkCreateOpticalFlowSessionNV;
    public final @Nullable MemorySegment SEGMENT$vkCreatePipelineBinariesKHR;
    public final @Nullable MemorySegment SEGMENT$vkCreatePipelineCache;
    public final @Nullable MemorySegment SEGMENT$vkCreatePipelineLayout;
    public final @Nullable MemorySegment SEGMENT$vkCreatePrivateDataSlot;
    public final @Nullable MemorySegment SEGMENT$vkCreatePrivateDataSlotEXT;
    public final @Nullable MemorySegment SEGMENT$vkCreateQueryPool;
    public final @Nullable MemorySegment SEGMENT$vkCreateRayTracingPipelinesKHR;
    public final @Nullable MemorySegment SEGMENT$vkCreateRayTracingPipelinesNV;
    public final @Nullable MemorySegment SEGMENT$vkCreateRenderPass;
    public final @Nullable MemorySegment SEGMENT$vkCreateRenderPass2;
    public final @Nullable MemorySegment SEGMENT$vkCreateRenderPass2KHR;
    public final @Nullable MemorySegment SEGMENT$vkCreateSampler;
    public final @Nullable MemorySegment SEGMENT$vkCreateSamplerYcbcrConversion;
    public final @Nullable MemorySegment SEGMENT$vkCreateSamplerYcbcrConversionKHR;
    public final @Nullable MemorySegment SEGMENT$vkCreateSemaphore;
    public final @Nullable MemorySegment SEGMENT$vkCreateSemaphoreSciSyncPoolNV;
    public final @Nullable MemorySegment SEGMENT$vkCreateShaderModule;
    public final @Nullable MemorySegment SEGMENT$vkCreateShadersEXT;
    public final @Nullable MemorySegment SEGMENT$vkCreateSharedSwapchainsKHR;
    public final @Nullable MemorySegment SEGMENT$vkCreateSwapchainKHR;
    public final @Nullable MemorySegment SEGMENT$vkCreateValidationCacheEXT;
    public final @Nullable MemorySegment SEGMENT$vkCreateVideoSessionKHR;
    public final @Nullable MemorySegment SEGMENT$vkCreateVideoSessionParametersKHR;
    public final @Nullable MemorySegment SEGMENT$vkDebugMarkerSetObjectNameEXT;
    public final @Nullable MemorySegment SEGMENT$vkDebugMarkerSetObjectTagEXT;
    public final @Nullable MemorySegment SEGMENT$vkDeferredOperationJoinKHR;
    public final @Nullable MemorySegment SEGMENT$vkDestroyAccelerationStructureKHR;
    public final @Nullable MemorySegment SEGMENT$vkDestroyAccelerationStructureNV;
    public final @Nullable MemorySegment SEGMENT$vkDestroyBuffer;
    public final @Nullable MemorySegment SEGMENT$vkDestroyBufferCollectionFUCHSIA;
    public final @Nullable MemorySegment SEGMENT$vkDestroyBufferView;
    public final @Nullable MemorySegment SEGMENT$vkDestroyCommandPool;
    public final @Nullable MemorySegment SEGMENT$vkDestroyCuFunctionNVX;
    public final @Nullable MemorySegment SEGMENT$vkDestroyCuModuleNVX;
    public final @Nullable MemorySegment SEGMENT$vkDestroyCudaFunctionNV;
    public final @Nullable MemorySegment SEGMENT$vkDestroyCudaModuleNV;
    public final @Nullable MemorySegment SEGMENT$vkDestroyDeferredOperationKHR;
    public final @Nullable MemorySegment SEGMENT$vkDestroyDescriptorPool;
    public final @Nullable MemorySegment SEGMENT$vkDestroyDescriptorSetLayout;
    public final @Nullable MemorySegment SEGMENT$vkDestroyDescriptorUpdateTemplate;
    public final @Nullable MemorySegment SEGMENT$vkDestroyDescriptorUpdateTemplateKHR;
    public final @Nullable MemorySegment SEGMENT$vkDestroyDevice;
    public final @Nullable MemorySegment SEGMENT$vkDestroyEvent;
    public final @Nullable MemorySegment SEGMENT$vkDestroyExternalComputeQueueNV;
    public final @Nullable MemorySegment SEGMENT$vkDestroyFence;
    public final @Nullable MemorySegment SEGMENT$vkDestroyFramebuffer;
    public final @Nullable MemorySegment SEGMENT$vkDestroyImage;
    public final @Nullable MemorySegment SEGMENT$vkDestroyImageView;
    public final @Nullable MemorySegment SEGMENT$vkDestroyIndirectCommandsLayoutEXT;
    public final @Nullable MemorySegment SEGMENT$vkDestroyIndirectCommandsLayoutNV;
    public final @Nullable MemorySegment SEGMENT$vkDestroyIndirectExecutionSetEXT;
    public final @Nullable MemorySegment SEGMENT$vkDestroyMicromapEXT;
    public final @Nullable MemorySegment SEGMENT$vkDestroyOpticalFlowSessionNV;
    public final @Nullable MemorySegment SEGMENT$vkDestroyPipeline;
    public final @Nullable MemorySegment SEGMENT$vkDestroyPipelineBinaryKHR;
    public final @Nullable MemorySegment SEGMENT$vkDestroyPipelineCache;
    public final @Nullable MemorySegment SEGMENT$vkDestroyPipelineLayout;
    public final @Nullable MemorySegment SEGMENT$vkDestroyPrivateDataSlot;
    public final @Nullable MemorySegment SEGMENT$vkDestroyPrivateDataSlotEXT;
    public final @Nullable MemorySegment SEGMENT$vkDestroyQueryPool;
    public final @Nullable MemorySegment SEGMENT$vkDestroyRenderPass;
    public final @Nullable MemorySegment SEGMENT$vkDestroySampler;
    public final @Nullable MemorySegment SEGMENT$vkDestroySamplerYcbcrConversion;
    public final @Nullable MemorySegment SEGMENT$vkDestroySamplerYcbcrConversionKHR;
    public final @Nullable MemorySegment SEGMENT$vkDestroySemaphore;
    public final @Nullable MemorySegment SEGMENT$vkDestroySemaphoreSciSyncPoolNV;
    public final @Nullable MemorySegment SEGMENT$vkDestroyShaderEXT;
    public final @Nullable MemorySegment SEGMENT$vkDestroyShaderModule;
    public final @Nullable MemorySegment SEGMENT$vkDestroySwapchainKHR;
    public final @Nullable MemorySegment SEGMENT$vkDestroyValidationCacheEXT;
    public final @Nullable MemorySegment SEGMENT$vkDestroyVideoSessionKHR;
    public final @Nullable MemorySegment SEGMENT$vkDestroyVideoSessionParametersKHR;
    public final @Nullable MemorySegment SEGMENT$vkDeviceWaitIdle;
    public final @Nullable MemorySegment SEGMENT$vkDisplayPowerControlEXT;
    public final @Nullable MemorySegment SEGMENT$vkEndCommandBuffer;
    public final @Nullable MemorySegment SEGMENT$vkExportMetalObjectsEXT;
    public final @Nullable MemorySegment SEGMENT$vkFlushMappedMemoryRanges;
    public final @Nullable MemorySegment SEGMENT$vkFreeCommandBuffers;
    public final @Nullable MemorySegment SEGMENT$vkFreeDescriptorSets;
    public final @Nullable MemorySegment SEGMENT$vkFreeMemory;
    public final @Nullable MemorySegment SEGMENT$vkGetAccelerationStructureBuildSizesKHR;
    public final @Nullable MemorySegment SEGMENT$vkGetAccelerationStructureDeviceAddressKHR;
    public final @Nullable MemorySegment SEGMENT$vkGetAccelerationStructureHandleNV;
    public final @Nullable MemorySegment SEGMENT$vkGetAccelerationStructureMemoryRequirementsNV;
    public final @Nullable MemorySegment SEGMENT$vkGetAccelerationStructureOpaqueCaptureDescriptorDataEXT;
    public final @Nullable MemorySegment SEGMENT$vkGetAndroidHardwareBufferPropertiesANDROID;
    public final @Nullable MemorySegment SEGMENT$vkGetBufferCollectionPropertiesFUCHSIA;
    public final @Nullable MemorySegment SEGMENT$vkGetBufferDeviceAddress;
    public final @Nullable MemorySegment SEGMENT$vkGetBufferDeviceAddressEXT;
    public final @Nullable MemorySegment SEGMENT$vkGetBufferDeviceAddressKHR;
    public final @Nullable MemorySegment SEGMENT$vkGetBufferMemoryRequirements;
    public final @Nullable MemorySegment SEGMENT$vkGetBufferMemoryRequirements2;
    public final @Nullable MemorySegment SEGMENT$vkGetBufferMemoryRequirements2KHR;
    public final @Nullable MemorySegment SEGMENT$vkGetBufferOpaqueCaptureAddress;
    public final @Nullable MemorySegment SEGMENT$vkGetBufferOpaqueCaptureAddressKHR;
    public final @Nullable MemorySegment SEGMENT$vkGetBufferOpaqueCaptureDescriptorDataEXT;
    public final @Nullable MemorySegment SEGMENT$vkGetCalibratedTimestampsEXT;
    public final @Nullable MemorySegment SEGMENT$vkGetCalibratedTimestampsKHR;
    public final @Nullable MemorySegment SEGMENT$vkGetClusterAccelerationStructureBuildSizesNV;
    public final @Nullable MemorySegment SEGMENT$vkGetCudaModuleCacheNV;
    public final @Nullable MemorySegment SEGMENT$vkGetDeferredOperationMaxConcurrencyKHR;
    public final @Nullable MemorySegment SEGMENT$vkGetDeferredOperationResultKHR;
    public final @Nullable MemorySegment SEGMENT$vkGetDescriptorEXT;
    public final @Nullable MemorySegment SEGMENT$vkGetDescriptorSetHostMappingVALVE;
    public final @Nullable MemorySegment SEGMENT$vkGetDescriptorSetLayoutBindingOffsetEXT;
    public final @Nullable MemorySegment SEGMENT$vkGetDescriptorSetLayoutHostMappingInfoVALVE;
    public final @Nullable MemorySegment SEGMENT$vkGetDescriptorSetLayoutSizeEXT;
    public final @Nullable MemorySegment SEGMENT$vkGetDescriptorSetLayoutSupport;
    public final @Nullable MemorySegment SEGMENT$vkGetDescriptorSetLayoutSupportKHR;
    public final @Nullable MemorySegment SEGMENT$vkGetDeviceAccelerationStructureCompatibilityKHR;
    public final @Nullable MemorySegment SEGMENT$vkGetDeviceBufferMemoryRequirements;
    public final @Nullable MemorySegment SEGMENT$vkGetDeviceBufferMemoryRequirementsKHR;
    public final @Nullable MemorySegment SEGMENT$vkGetDeviceFaultInfoEXT;
    public final @Nullable MemorySegment SEGMENT$vkGetDeviceGroupPeerMemoryFeatures;
    public final @Nullable MemorySegment SEGMENT$vkGetDeviceGroupPeerMemoryFeaturesKHR;
    public final @Nullable MemorySegment SEGMENT$vkGetDeviceGroupPresentCapabilitiesKHR;
    public final @Nullable MemorySegment SEGMENT$vkGetDeviceGroupSurfacePresentModes2EXT;
    public final @Nullable MemorySegment SEGMENT$vkGetDeviceGroupSurfacePresentModesKHR;
    public final @Nullable MemorySegment SEGMENT$vkGetDeviceImageMemoryRequirements;
    public final @Nullable MemorySegment SEGMENT$vkGetDeviceImageMemoryRequirementsKHR;
    public final @Nullable MemorySegment SEGMENT$vkGetDeviceImageSparseMemoryRequirements;
    public final @Nullable MemorySegment SEGMENT$vkGetDeviceImageSparseMemoryRequirementsKHR;
    public final @Nullable MemorySegment SEGMENT$vkGetDeviceImageSubresourceLayout;
    public final @Nullable MemorySegment SEGMENT$vkGetDeviceImageSubresourceLayoutKHR;
    public final @Nullable MemorySegment SEGMENT$vkGetDeviceMemoryCommitment;
    public final @Nullable MemorySegment SEGMENT$vkGetDeviceMemoryOpaqueCaptureAddress;
    public final @Nullable MemorySegment SEGMENT$vkGetDeviceMemoryOpaqueCaptureAddressKHR;
    public final @Nullable MemorySegment SEGMENT$vkGetDeviceMicromapCompatibilityEXT;
    public final @Nullable MemorySegment SEGMENT$vkGetDeviceQueue;
    public final @Nullable MemorySegment SEGMENT$vkGetDeviceQueue2;
    public final @Nullable MemorySegment SEGMENT$vkGetDeviceSubpassShadingMaxWorkgroupSizeHUAWEI;
    public final @Nullable MemorySegment SEGMENT$vkGetDynamicRenderingTilePropertiesQCOM;
    public final @Nullable MemorySegment SEGMENT$vkGetEncodedVideoSessionParametersKHR;
    public final @Nullable MemorySegment SEGMENT$vkGetEventStatus;
    public final @Nullable MemorySegment SEGMENT$vkGetExecutionGraphPipelineNodeIndexAMDX;
    public final @Nullable MemorySegment SEGMENT$vkGetExecutionGraphPipelineScratchSizeAMDX;
    public final @Nullable MemorySegment SEGMENT$vkGetExternalComputeQueueDataNV;
    public final @Nullable MemorySegment SEGMENT$vkGetFenceFdKHR;
    public final @Nullable MemorySegment SEGMENT$vkGetFenceSciSyncFenceNV;
    public final @Nullable MemorySegment SEGMENT$vkGetFenceSciSyncObjNV;
    public final @Nullable MemorySegment SEGMENT$vkGetFenceStatus;
    public final @Nullable MemorySegment SEGMENT$vkGetFenceWin32HandleKHR;
    public final @Nullable MemorySegment SEGMENT$vkGetFramebufferTilePropertiesQCOM;
    public final @Nullable MemorySegment SEGMENT$vkGetGeneratedCommandsMemoryRequirementsEXT;
    public final @Nullable MemorySegment SEGMENT$vkGetGeneratedCommandsMemoryRequirementsNV;
    public final @Nullable MemorySegment SEGMENT$vkGetImageDrmFormatModifierPropertiesEXT;
    public final @Nullable MemorySegment SEGMENT$vkGetImageMemoryRequirements;
    public final @Nullable MemorySegment SEGMENT$vkGetImageMemoryRequirements2;
    public final @Nullable MemorySegment SEGMENT$vkGetImageMemoryRequirements2KHR;
    public final @Nullable MemorySegment SEGMENT$vkGetImageOpaqueCaptureDescriptorDataEXT;
    public final @Nullable MemorySegment SEGMENT$vkGetImageSparseMemoryRequirements;
    public final @Nullable MemorySegment SEGMENT$vkGetImageSparseMemoryRequirements2;
    public final @Nullable MemorySegment SEGMENT$vkGetImageSparseMemoryRequirements2KHR;
    public final @Nullable MemorySegment SEGMENT$vkGetImageSubresourceLayout;
    public final @Nullable MemorySegment SEGMENT$vkGetImageSubresourceLayout2;
    public final @Nullable MemorySegment SEGMENT$vkGetImageSubresourceLayout2EXT;
    public final @Nullable MemorySegment SEGMENT$vkGetImageSubresourceLayout2KHR;
    public final @Nullable MemorySegment SEGMENT$vkGetImageViewAddressNVX;
    public final @Nullable MemorySegment SEGMENT$vkGetImageViewHandle64NVX;
    public final @Nullable MemorySegment SEGMENT$vkGetImageViewHandleNVX;
    public final @Nullable MemorySegment SEGMENT$vkGetImageViewOpaqueCaptureDescriptorDataEXT;
    public final @Nullable MemorySegment SEGMENT$vkGetLatencyTimingsNV;
    public final @Nullable MemorySegment SEGMENT$vkGetMemoryAndroidHardwareBufferANDROID;
    public final @Nullable MemorySegment SEGMENT$vkGetMemoryFdKHR;
    public final @Nullable MemorySegment SEGMENT$vkGetMemoryFdPropertiesKHR;
    public final @Nullable MemorySegment SEGMENT$vkGetMemoryHostPointerPropertiesEXT;
    public final @Nullable MemorySegment SEGMENT$vkGetMemoryMetalHandleEXT;
    public final @Nullable MemorySegment SEGMENT$vkGetMemoryMetalHandlePropertiesEXT;
    public final @Nullable MemorySegment SEGMENT$vkGetMemoryRemoteAddressNV;
    public final @Nullable MemorySegment SEGMENT$vkGetMemorySciBufNV;
    public final @Nullable MemorySegment SEGMENT$vkGetMemoryWin32HandleKHR;
    public final @Nullable MemorySegment SEGMENT$vkGetMemoryWin32HandleNV;
    public final @Nullable MemorySegment SEGMENT$vkGetMemoryWin32HandlePropertiesKHR;
    public final @Nullable MemorySegment SEGMENT$vkGetMemoryZirconHandleFUCHSIA;
    public final @Nullable MemorySegment SEGMENT$vkGetMemoryZirconHandlePropertiesFUCHSIA;
    public final @Nullable MemorySegment SEGMENT$vkGetMicromapBuildSizesEXT;
    public final @Nullable MemorySegment SEGMENT$vkGetPartitionedAccelerationStructuresBuildSizesNV;
    public final @Nullable MemorySegment SEGMENT$vkGetPastPresentationTimingGOOGLE;
    public final @Nullable MemorySegment SEGMENT$vkGetPerformanceParameterINTEL;
    public final @Nullable MemorySegment SEGMENT$vkGetPipelineBinaryDataKHR;
    public final @Nullable MemorySegment SEGMENT$vkGetPipelineCacheData;
    public final @Nullable MemorySegment SEGMENT$vkGetPipelineExecutableInternalRepresentationsKHR;
    public final @Nullable MemorySegment SEGMENT$vkGetPipelineExecutablePropertiesKHR;
    public final @Nullable MemorySegment SEGMENT$vkGetPipelineExecutableStatisticsKHR;
    public final @Nullable MemorySegment SEGMENT$vkGetPipelineIndirectDeviceAddressNV;
    public final @Nullable MemorySegment SEGMENT$vkGetPipelineIndirectMemoryRequirementsNV;
    public final @Nullable MemorySegment SEGMENT$vkGetPipelineKeyKHR;
    public final @Nullable MemorySegment SEGMENT$vkGetPipelinePropertiesEXT;
    public final @Nullable MemorySegment SEGMENT$vkGetPrivateData;
    public final @Nullable MemorySegment SEGMENT$vkGetPrivateDataEXT;
    public final @Nullable MemorySegment SEGMENT$vkGetQueryPoolResults;
    public final @Nullable MemorySegment SEGMENT$vkGetQueueCheckpointData2NV;
    public final @Nullable MemorySegment SEGMENT$vkGetQueueCheckpointDataNV;
    public final @Nullable MemorySegment SEGMENT$vkGetRayTracingCaptureReplayShaderGroupHandlesKHR;
    public final @Nullable MemorySegment SEGMENT$vkGetRayTracingShaderGroupHandlesKHR;
    public final @Nullable MemorySegment SEGMENT$vkGetRayTracingShaderGroupHandlesNV;
    public final @Nullable MemorySegment SEGMENT$vkGetRayTracingShaderGroupStackSizeKHR;
    public final @Nullable MemorySegment SEGMENT$vkGetRefreshCycleDurationGOOGLE;
    public final @Nullable MemorySegment SEGMENT$vkGetRenderAreaGranularity;
    public final @Nullable MemorySegment SEGMENT$vkGetRenderingAreaGranularity;
    public final @Nullable MemorySegment SEGMENT$vkGetRenderingAreaGranularityKHR;
    public final @Nullable MemorySegment SEGMENT$vkGetSamplerOpaqueCaptureDescriptorDataEXT;
    public final @Nullable MemorySegment SEGMENT$vkGetScreenBufferPropertiesQNX;
    public final @Nullable MemorySegment SEGMENT$vkGetSemaphoreCounterValue;
    public final @Nullable MemorySegment SEGMENT$vkGetSemaphoreCounterValueKHR;
    public final @Nullable MemorySegment SEGMENT$vkGetSemaphoreFdKHR;
    public final @Nullable MemorySegment SEGMENT$vkGetSemaphoreSciSyncObjNV;
    public final @Nullable MemorySegment SEGMENT$vkGetSemaphoreWin32HandleKHR;
    public final @Nullable MemorySegment SEGMENT$vkGetSemaphoreZirconHandleFUCHSIA;
    public final @Nullable MemorySegment SEGMENT$vkGetShaderBinaryDataEXT;
    public final @Nullable MemorySegment SEGMENT$vkGetShaderInfoAMD;
    public final @Nullable MemorySegment SEGMENT$vkGetShaderModuleCreateInfoIdentifierEXT;
    public final @Nullable MemorySegment SEGMENT$vkGetShaderModuleIdentifierEXT;
    public final @Nullable MemorySegment SEGMENT$vkGetSwapchainCounterEXT;
    public final @Nullable MemorySegment SEGMENT$vkGetSwapchainImagesKHR;
    public final @Nullable MemorySegment SEGMENT$vkGetSwapchainStatusKHR;
    public final @Nullable MemorySegment SEGMENT$vkGetValidationCacheDataEXT;
    public final @Nullable MemorySegment SEGMENT$vkGetVideoSessionMemoryRequirementsKHR;
    public final @Nullable MemorySegment SEGMENT$vkImportFenceFdKHR;
    public final @Nullable MemorySegment SEGMENT$vkImportFenceSciSyncFenceNV;
    public final @Nullable MemorySegment SEGMENT$vkImportFenceSciSyncObjNV;
    public final @Nullable MemorySegment SEGMENT$vkImportFenceWin32HandleKHR;
    public final @Nullable MemorySegment SEGMENT$vkImportSemaphoreFdKHR;
    public final @Nullable MemorySegment SEGMENT$vkImportSemaphoreSciSyncObjNV;
    public final @Nullable MemorySegment SEGMENT$vkImportSemaphoreWin32HandleKHR;
    public final @Nullable MemorySegment SEGMENT$vkImportSemaphoreZirconHandleFUCHSIA;
    public final @Nullable MemorySegment SEGMENT$vkInitializePerformanceApiINTEL;
    public final @Nullable MemorySegment SEGMENT$vkInvalidateMappedMemoryRanges;
    public final @Nullable MemorySegment SEGMENT$vkLatencySleepNV;
    public final @Nullable MemorySegment SEGMENT$vkMapMemory;
    public final @Nullable MemorySegment SEGMENT$vkMapMemory2;
    public final @Nullable MemorySegment SEGMENT$vkMapMemory2KHR;
    public final @Nullable MemorySegment SEGMENT$vkMergePipelineCaches;
    public final @Nullable MemorySegment SEGMENT$vkMergeValidationCachesEXT;
    public final @Nullable MemorySegment SEGMENT$vkQueueBindSparse;
    public final @Nullable MemorySegment SEGMENT$vkQueueNotifyOutOfBandNV;
    public final @Nullable MemorySegment SEGMENT$vkQueuePresentKHR;
    public final @Nullable MemorySegment SEGMENT$vkQueueSetPerformanceConfigurationINTEL;
    public final @Nullable MemorySegment SEGMENT$vkQueueSubmit;
    public final @Nullable MemorySegment SEGMENT$vkQueueSubmit2;
    public final @Nullable MemorySegment SEGMENT$vkQueueSubmit2KHR;
    public final @Nullable MemorySegment SEGMENT$vkQueueWaitIdle;
    public final @Nullable MemorySegment SEGMENT$vkRegisterDeviceEventEXT;
    public final @Nullable MemorySegment SEGMENT$vkRegisterDisplayEventEXT;
    public final @Nullable MemorySegment SEGMENT$vkReleaseCapturedPipelineDataKHR;
    public final @Nullable MemorySegment SEGMENT$vkReleaseFullScreenExclusiveModeEXT;
    public final @Nullable MemorySegment SEGMENT$vkReleasePerformanceConfigurationINTEL;
    public final @Nullable MemorySegment SEGMENT$vkReleaseProfilingLockKHR;
    public final @Nullable MemorySegment SEGMENT$vkReleaseSwapchainImagesEXT;
    public final @Nullable MemorySegment SEGMENT$vkResetCommandBuffer;
    public final @Nullable MemorySegment SEGMENT$vkResetCommandPool;
    public final @Nullable MemorySegment SEGMENT$vkResetDescriptorPool;
    public final @Nullable MemorySegment SEGMENT$vkResetEvent;
    public final @Nullable MemorySegment SEGMENT$vkResetFences;
    public final @Nullable MemorySegment SEGMENT$vkResetQueryPool;
    public final @Nullable MemorySegment SEGMENT$vkResetQueryPoolEXT;
    public final @Nullable MemorySegment SEGMENT$vkSetBufferCollectionBufferConstraintsFUCHSIA;
    public final @Nullable MemorySegment SEGMENT$vkSetBufferCollectionImageConstraintsFUCHSIA;
    public final @Nullable MemorySegment SEGMENT$vkSetDeviceMemoryPriorityEXT;
    public final @Nullable MemorySegment SEGMENT$vkSetEvent;
    public final @Nullable MemorySegment SEGMENT$vkSetHdrMetadataEXT;
    public final @Nullable MemorySegment SEGMENT$vkSetLatencyMarkerNV;
    public final @Nullable MemorySegment SEGMENT$vkSetLatencySleepModeNV;
    public final @Nullable MemorySegment SEGMENT$vkSetLocalDimmingAMD;
    public final @Nullable MemorySegment SEGMENT$vkSetPrivateData;
    public final @Nullable MemorySegment SEGMENT$vkSetPrivateDataEXT;
    public final @Nullable MemorySegment SEGMENT$vkSignalSemaphore;
    public final @Nullable MemorySegment SEGMENT$vkSignalSemaphoreKHR;
    public final @Nullable MemorySegment SEGMENT$vkTransitionImageLayout;
    public final @Nullable MemorySegment SEGMENT$vkTransitionImageLayoutEXT;
    public final @Nullable MemorySegment SEGMENT$vkTrimCommandPool;
    public final @Nullable MemorySegment SEGMENT$vkTrimCommandPoolKHR;
    public final @Nullable MemorySegment SEGMENT$vkUninitializePerformanceApiINTEL;
    public final @Nullable MemorySegment SEGMENT$vkUnmapMemory;
    public final @Nullable MemorySegment SEGMENT$vkUnmapMemory2;
    public final @Nullable MemorySegment SEGMENT$vkUnmapMemory2KHR;
    public final @Nullable MemorySegment SEGMENT$vkUpdateDescriptorSetWithTemplate;
    public final @Nullable MemorySegment SEGMENT$vkUpdateDescriptorSetWithTemplateKHR;
    public final @Nullable MemorySegment SEGMENT$vkUpdateDescriptorSets;
    public final @Nullable MemorySegment SEGMENT$vkUpdateIndirectExecutionSetPipelineEXT;
    public final @Nullable MemorySegment SEGMENT$vkUpdateIndirectExecutionSetShaderEXT;
    public final @Nullable MemorySegment SEGMENT$vkUpdateVideoSessionParametersKHR;
    public final @Nullable MemorySegment SEGMENT$vkWaitForFences;
    public final @Nullable MemorySegment SEGMENT$vkWaitForPresentKHR;
    public final @Nullable MemorySegment SEGMENT$vkWaitSemaphores;
    public final @Nullable MemorySegment SEGMENT$vkWaitSemaphoresKHR;
    public final @Nullable MemorySegment SEGMENT$vkWriteAccelerationStructuresPropertiesKHR;
    public final @Nullable MemorySegment SEGMENT$vkWriteMicromapsPropertiesEXT;
    public final @Nullable MethodHandle HANDLE$vkAcquireFullScreenExclusiveModeEXT;
    public final @Nullable MethodHandle HANDLE$vkAcquireNextImage2KHR;
    public final @Nullable MethodHandle HANDLE$vkAcquireNextImageKHR;
    public final @Nullable MethodHandle HANDLE$vkAcquirePerformanceConfigurationINTEL;
    public final @Nullable MethodHandle HANDLE$vkAcquireProfilingLockKHR;
    public final @Nullable MethodHandle HANDLE$vkAllocateCommandBuffers;
    public final @Nullable MethodHandle HANDLE$vkAllocateDescriptorSets;
    public final @Nullable MethodHandle HANDLE$vkAllocateMemory;
    public final @Nullable MethodHandle HANDLE$vkAntiLagUpdateAMD;
    public final @Nullable MethodHandle HANDLE$vkBeginCommandBuffer;
    public final @Nullable MethodHandle HANDLE$vkBindAccelerationStructureMemoryNV;
    public final @Nullable MethodHandle HANDLE$vkBindBufferMemory;
    public final @Nullable MethodHandle HANDLE$vkBindBufferMemory2;
    public final @Nullable MethodHandle HANDLE$vkBindBufferMemory2KHR;
    public final @Nullable MethodHandle HANDLE$vkBindImageMemory;
    public final @Nullable MethodHandle HANDLE$vkBindImageMemory2;
    public final @Nullable MethodHandle HANDLE$vkBindImageMemory2KHR;
    public final @Nullable MethodHandle HANDLE$vkBindOpticalFlowSessionImageNV;
    public final @Nullable MethodHandle HANDLE$vkBindVideoSessionMemoryKHR;
    public final @Nullable MethodHandle HANDLE$vkBuildAccelerationStructuresKHR;
    public final @Nullable MethodHandle HANDLE$vkBuildMicromapsEXT;
    public final @Nullable MethodHandle HANDLE$vkCmdBeginConditionalRenderingEXT;
    public final @Nullable MethodHandle HANDLE$vkCmdBeginPerTileExecutionQCOM;
    public final @Nullable MethodHandle HANDLE$vkCmdBeginQuery;
    public final @Nullable MethodHandle HANDLE$vkCmdBeginQueryIndexedEXT;
    public final @Nullable MethodHandle HANDLE$vkCmdBeginRenderPass;
    public final @Nullable MethodHandle HANDLE$vkCmdBeginRenderPass2;
    public final @Nullable MethodHandle HANDLE$vkCmdBeginRenderPass2KHR;
    public final @Nullable MethodHandle HANDLE$vkCmdBeginRendering;
    public final @Nullable MethodHandle HANDLE$vkCmdBeginRenderingKHR;
    public final @Nullable MethodHandle HANDLE$vkCmdBeginTransformFeedbackEXT;
    public final @Nullable MethodHandle HANDLE$vkCmdBeginVideoCodingKHR;
    public final @Nullable MethodHandle HANDLE$vkCmdBindDescriptorBufferEmbeddedSamplers2EXT;
    public final @Nullable MethodHandle HANDLE$vkCmdBindDescriptorBufferEmbeddedSamplersEXT;
    public final @Nullable MethodHandle HANDLE$vkCmdBindDescriptorBuffersEXT;
    public final @Nullable MethodHandle HANDLE$vkCmdBindDescriptorSets;
    public final @Nullable MethodHandle HANDLE$vkCmdBindDescriptorSets2;
    public final @Nullable MethodHandle HANDLE$vkCmdBindDescriptorSets2KHR;
    public final @Nullable MethodHandle HANDLE$vkCmdBindIndexBuffer;
    public final @Nullable MethodHandle HANDLE$vkCmdBindIndexBuffer2;
    public final @Nullable MethodHandle HANDLE$vkCmdBindIndexBuffer2KHR;
    public final @Nullable MethodHandle HANDLE$vkCmdBindInvocationMaskHUAWEI;
    public final @Nullable MethodHandle HANDLE$vkCmdBindPipeline;
    public final @Nullable MethodHandle HANDLE$vkCmdBindPipelineShaderGroupNV;
    public final @Nullable MethodHandle HANDLE$vkCmdBindShadersEXT;
    public final @Nullable MethodHandle HANDLE$vkCmdBindShadingRateImageNV;
    public final @Nullable MethodHandle HANDLE$vkCmdBindTileMemoryQCOM;
    public final @Nullable MethodHandle HANDLE$vkCmdBindTransformFeedbackBuffersEXT;
    public final @Nullable MethodHandle HANDLE$vkCmdBindVertexBuffers;
    public final @Nullable MethodHandle HANDLE$vkCmdBindVertexBuffers2;
    public final @Nullable MethodHandle HANDLE$vkCmdBindVertexBuffers2EXT;
    public final @Nullable MethodHandle HANDLE$vkCmdBlitImage;
    public final @Nullable MethodHandle HANDLE$vkCmdBlitImage2;
    public final @Nullable MethodHandle HANDLE$vkCmdBlitImage2KHR;
    public final @Nullable MethodHandle HANDLE$vkCmdBuildAccelerationStructureNV;
    public final @Nullable MethodHandle HANDLE$vkCmdBuildAccelerationStructuresIndirectKHR;
    public final @Nullable MethodHandle HANDLE$vkCmdBuildAccelerationStructuresKHR;
    public final @Nullable MethodHandle HANDLE$vkCmdBuildClusterAccelerationStructureIndirectNV;
    public final @Nullable MethodHandle HANDLE$vkCmdBuildMicromapsEXT;
    public final @Nullable MethodHandle HANDLE$vkCmdBuildPartitionedAccelerationStructuresNV;
    public final @Nullable MethodHandle HANDLE$vkCmdClearAttachments;
    public final @Nullable MethodHandle HANDLE$vkCmdClearColorImage;
    public final @Nullable MethodHandle HANDLE$vkCmdClearDepthStencilImage;
    public final @Nullable MethodHandle HANDLE$vkCmdControlVideoCodingKHR;
    public final @Nullable MethodHandle HANDLE$vkCmdConvertCooperativeVectorMatrixNV;
    public final @Nullable MethodHandle HANDLE$vkCmdCopyAccelerationStructureKHR;
    public final @Nullable MethodHandle HANDLE$vkCmdCopyAccelerationStructureNV;
    public final @Nullable MethodHandle HANDLE$vkCmdCopyAccelerationStructureToMemoryKHR;
    public final @Nullable MethodHandle HANDLE$vkCmdCopyBuffer;
    public final @Nullable MethodHandle HANDLE$vkCmdCopyBuffer2;
    public final @Nullable MethodHandle HANDLE$vkCmdCopyBuffer2KHR;
    public final @Nullable MethodHandle HANDLE$vkCmdCopyBufferToImage;
    public final @Nullable MethodHandle HANDLE$vkCmdCopyBufferToImage2;
    public final @Nullable MethodHandle HANDLE$vkCmdCopyBufferToImage2KHR;
    public final @Nullable MethodHandle HANDLE$vkCmdCopyImage;
    public final @Nullable MethodHandle HANDLE$vkCmdCopyImage2;
    public final @Nullable MethodHandle HANDLE$vkCmdCopyImage2KHR;
    public final @Nullable MethodHandle HANDLE$vkCmdCopyImageToBuffer;
    public final @Nullable MethodHandle HANDLE$vkCmdCopyImageToBuffer2;
    public final @Nullable MethodHandle HANDLE$vkCmdCopyImageToBuffer2KHR;
    public final @Nullable MethodHandle HANDLE$vkCmdCopyMemoryIndirectNV;
    public final @Nullable MethodHandle HANDLE$vkCmdCopyMemoryToAccelerationStructureKHR;
    public final @Nullable MethodHandle HANDLE$vkCmdCopyMemoryToImageIndirectNV;
    public final @Nullable MethodHandle HANDLE$vkCmdCopyMemoryToMicromapEXT;
    public final @Nullable MethodHandle HANDLE$vkCmdCopyMicromapEXT;
    public final @Nullable MethodHandle HANDLE$vkCmdCopyMicromapToMemoryEXT;
    public final @Nullable MethodHandle HANDLE$vkCmdCopyQueryPoolResults;
    public final @Nullable MethodHandle HANDLE$vkCmdCuLaunchKernelNVX;
    public final @Nullable MethodHandle HANDLE$vkCmdCudaLaunchKernelNV;
    public final @Nullable MethodHandle HANDLE$vkCmdDebugMarkerBeginEXT;
    public final @Nullable MethodHandle HANDLE$vkCmdDebugMarkerEndEXT;
    public final @Nullable MethodHandle HANDLE$vkCmdDebugMarkerInsertEXT;
    public final @Nullable MethodHandle HANDLE$vkCmdDecodeVideoKHR;
    public final @Nullable MethodHandle HANDLE$vkCmdDecompressMemoryIndirectCountNV;
    public final @Nullable MethodHandle HANDLE$vkCmdDecompressMemoryNV;
    public final @Nullable MethodHandle HANDLE$vkCmdDispatch;
    public final @Nullable MethodHandle HANDLE$vkCmdDispatchBase;
    public final @Nullable MethodHandle HANDLE$vkCmdDispatchBaseKHR;
    public final @Nullable MethodHandle HANDLE$vkCmdDispatchGraphAMDX;
    public final @Nullable MethodHandle HANDLE$vkCmdDispatchGraphIndirectAMDX;
    public final @Nullable MethodHandle HANDLE$vkCmdDispatchGraphIndirectCountAMDX;
    public final @Nullable MethodHandle HANDLE$vkCmdDispatchIndirect;
    public final @Nullable MethodHandle HANDLE$vkCmdDispatchTileQCOM;
    public final @Nullable MethodHandle HANDLE$vkCmdDraw;
    public final @Nullable MethodHandle HANDLE$vkCmdDrawClusterHUAWEI;
    public final @Nullable MethodHandle HANDLE$vkCmdDrawClusterIndirectHUAWEI;
    public final @Nullable MethodHandle HANDLE$vkCmdDrawIndexed;
    public final @Nullable MethodHandle HANDLE$vkCmdDrawIndexedIndirect;
    public final @Nullable MethodHandle HANDLE$vkCmdDrawIndexedIndirectCount;
    public final @Nullable MethodHandle HANDLE$vkCmdDrawIndexedIndirectCountAMD;
    public final @Nullable MethodHandle HANDLE$vkCmdDrawIndexedIndirectCountKHR;
    public final @Nullable MethodHandle HANDLE$vkCmdDrawIndirect;
    public final @Nullable MethodHandle HANDLE$vkCmdDrawIndirectByteCountEXT;
    public final @Nullable MethodHandle HANDLE$vkCmdDrawIndirectCount;
    public final @Nullable MethodHandle HANDLE$vkCmdDrawIndirectCountAMD;
    public final @Nullable MethodHandle HANDLE$vkCmdDrawIndirectCountKHR;
    public final @Nullable MethodHandle HANDLE$vkCmdDrawMeshTasksEXT;
    public final @Nullable MethodHandle HANDLE$vkCmdDrawMeshTasksIndirectCountEXT;
    public final @Nullable MethodHandle HANDLE$vkCmdDrawMeshTasksIndirectCountNV;
    public final @Nullable MethodHandle HANDLE$vkCmdDrawMeshTasksIndirectEXT;
    public final @Nullable MethodHandle HANDLE$vkCmdDrawMeshTasksIndirectNV;
    public final @Nullable MethodHandle HANDLE$vkCmdDrawMeshTasksNV;
    public final @Nullable MethodHandle HANDLE$vkCmdDrawMultiEXT;
    public final @Nullable MethodHandle HANDLE$vkCmdDrawMultiIndexedEXT;
    public final @Nullable MethodHandle HANDLE$vkCmdEncodeVideoKHR;
    public final @Nullable MethodHandle HANDLE$vkCmdEndConditionalRenderingEXT;
    public final @Nullable MethodHandle HANDLE$vkCmdEndPerTileExecutionQCOM;
    public final @Nullable MethodHandle HANDLE$vkCmdEndQuery;
    public final @Nullable MethodHandle HANDLE$vkCmdEndQueryIndexedEXT;
    public final @Nullable MethodHandle HANDLE$vkCmdEndRenderPass;
    public final @Nullable MethodHandle HANDLE$vkCmdEndRenderPass2;
    public final @Nullable MethodHandle HANDLE$vkCmdEndRenderPass2KHR;
    public final @Nullable MethodHandle HANDLE$vkCmdEndRendering;
    public final @Nullable MethodHandle HANDLE$vkCmdEndRendering2EXT;
    public final @Nullable MethodHandle HANDLE$vkCmdEndRenderingKHR;
    public final @Nullable MethodHandle HANDLE$vkCmdEndTransformFeedbackEXT;
    public final @Nullable MethodHandle HANDLE$vkCmdEndVideoCodingKHR;
    public final @Nullable MethodHandle HANDLE$vkCmdExecuteCommands;
    public final @Nullable MethodHandle HANDLE$vkCmdExecuteGeneratedCommandsEXT;
    public final @Nullable MethodHandle HANDLE$vkCmdExecuteGeneratedCommandsNV;
    public final @Nullable MethodHandle HANDLE$vkCmdFillBuffer;
    public final @Nullable MethodHandle HANDLE$vkCmdInitializeGraphScratchMemoryAMDX;
    public final @Nullable MethodHandle HANDLE$vkCmdNextSubpass;
    public final @Nullable MethodHandle HANDLE$vkCmdNextSubpass2;
    public final @Nullable MethodHandle HANDLE$vkCmdNextSubpass2KHR;
    public final @Nullable MethodHandle HANDLE$vkCmdOpticalFlowExecuteNV;
    public final @Nullable MethodHandle HANDLE$vkCmdPipelineBarrier;
    public final @Nullable MethodHandle HANDLE$vkCmdPipelineBarrier2;
    public final @Nullable MethodHandle HANDLE$vkCmdPipelineBarrier2KHR;
    public final @Nullable MethodHandle HANDLE$vkCmdPreprocessGeneratedCommandsEXT;
    public final @Nullable MethodHandle HANDLE$vkCmdPreprocessGeneratedCommandsNV;
    public final @Nullable MethodHandle HANDLE$vkCmdPushConstants;
    public final @Nullable MethodHandle HANDLE$vkCmdPushConstants2;
    public final @Nullable MethodHandle HANDLE$vkCmdPushConstants2KHR;
    public final @Nullable MethodHandle HANDLE$vkCmdPushDescriptorSet;
    public final @Nullable MethodHandle HANDLE$vkCmdPushDescriptorSet2;
    public final @Nullable MethodHandle HANDLE$vkCmdPushDescriptorSet2KHR;
    public final @Nullable MethodHandle HANDLE$vkCmdPushDescriptorSetKHR;
    public final @Nullable MethodHandle HANDLE$vkCmdPushDescriptorSetWithTemplate;
    public final @Nullable MethodHandle HANDLE$vkCmdPushDescriptorSetWithTemplate2;
    public final @Nullable MethodHandle HANDLE$vkCmdPushDescriptorSetWithTemplate2KHR;
    public final @Nullable MethodHandle HANDLE$vkCmdPushDescriptorSetWithTemplateKHR;
    public final @Nullable MethodHandle HANDLE$vkCmdRefreshObjectsKHR;
    public final @Nullable MethodHandle HANDLE$vkCmdResetEvent;
    public final @Nullable MethodHandle HANDLE$vkCmdResetEvent2;
    public final @Nullable MethodHandle HANDLE$vkCmdResetEvent2KHR;
    public final @Nullable MethodHandle HANDLE$vkCmdResetQueryPool;
    public final @Nullable MethodHandle HANDLE$vkCmdResolveImage;
    public final @Nullable MethodHandle HANDLE$vkCmdResolveImage2;
    public final @Nullable MethodHandle HANDLE$vkCmdResolveImage2KHR;
    public final @Nullable MethodHandle HANDLE$vkCmdSetAlphaToCoverageEnableEXT;
    public final @Nullable MethodHandle HANDLE$vkCmdSetAlphaToOneEnableEXT;
    public final @Nullable MethodHandle HANDLE$vkCmdSetAttachmentFeedbackLoopEnableEXT;
    public final @Nullable MethodHandle HANDLE$vkCmdSetBlendConstants;
    public final @Nullable MethodHandle HANDLE$vkCmdSetCheckpointNV;
    public final @Nullable MethodHandle HANDLE$vkCmdSetCoarseSampleOrderNV;
    public final @Nullable MethodHandle HANDLE$vkCmdSetColorBlendAdvancedEXT;
    public final @Nullable MethodHandle HANDLE$vkCmdSetColorBlendEnableEXT;
    public final @Nullable MethodHandle HANDLE$vkCmdSetColorBlendEquationEXT;
    public final @Nullable MethodHandle HANDLE$vkCmdSetColorWriteEnableEXT;
    public final @Nullable MethodHandle HANDLE$vkCmdSetColorWriteMaskEXT;
    public final @Nullable MethodHandle HANDLE$vkCmdSetConservativeRasterizationModeEXT;
    public final @Nullable MethodHandle HANDLE$vkCmdSetCoverageModulationModeNV;
    public final @Nullable MethodHandle HANDLE$vkCmdSetCoverageModulationTableEnableNV;
    public final @Nullable MethodHandle HANDLE$vkCmdSetCoverageModulationTableNV;
    public final @Nullable MethodHandle HANDLE$vkCmdSetCoverageReductionModeNV;
    public final @Nullable MethodHandle HANDLE$vkCmdSetCoverageToColorEnableNV;
    public final @Nullable MethodHandle HANDLE$vkCmdSetCoverageToColorLocationNV;
    public final @Nullable MethodHandle HANDLE$vkCmdSetCullMode;
    public final @Nullable MethodHandle HANDLE$vkCmdSetCullModeEXT;
    public final @Nullable MethodHandle HANDLE$vkCmdSetDepthBias;
    public final @Nullable MethodHandle HANDLE$vkCmdSetDepthBias2EXT;
    public final @Nullable MethodHandle HANDLE$vkCmdSetDepthBiasEnable;
    public final @Nullable MethodHandle HANDLE$vkCmdSetDepthBiasEnableEXT;
    public final @Nullable MethodHandle HANDLE$vkCmdSetDepthBounds;
    public final @Nullable MethodHandle HANDLE$vkCmdSetDepthBoundsTestEnable;
    public final @Nullable MethodHandle HANDLE$vkCmdSetDepthBoundsTestEnableEXT;
    public final @Nullable MethodHandle HANDLE$vkCmdSetDepthClampEnableEXT;
    public final @Nullable MethodHandle HANDLE$vkCmdSetDepthClampRangeEXT;
    public final @Nullable MethodHandle HANDLE$vkCmdSetDepthClipEnableEXT;
    public final @Nullable MethodHandle HANDLE$vkCmdSetDepthClipNegativeOneToOneEXT;
    public final @Nullable MethodHandle HANDLE$vkCmdSetDepthCompareOp;
    public final @Nullable MethodHandle HANDLE$vkCmdSetDepthCompareOpEXT;
    public final @Nullable MethodHandle HANDLE$vkCmdSetDepthTestEnable;
    public final @Nullable MethodHandle HANDLE$vkCmdSetDepthTestEnableEXT;
    public final @Nullable MethodHandle HANDLE$vkCmdSetDepthWriteEnable;
    public final @Nullable MethodHandle HANDLE$vkCmdSetDepthWriteEnableEXT;
    public final @Nullable MethodHandle HANDLE$vkCmdSetDescriptorBufferOffsets2EXT;
    public final @Nullable MethodHandle HANDLE$vkCmdSetDescriptorBufferOffsetsEXT;
    public final @Nullable MethodHandle HANDLE$vkCmdSetDeviceMask;
    public final @Nullable MethodHandle HANDLE$vkCmdSetDeviceMaskKHR;
    public final @Nullable MethodHandle HANDLE$vkCmdSetDiscardRectangleEXT;
    public final @Nullable MethodHandle HANDLE$vkCmdSetDiscardRectangleEnableEXT;
    public final @Nullable MethodHandle HANDLE$vkCmdSetDiscardRectangleModeEXT;
    public final @Nullable MethodHandle HANDLE$vkCmdSetEvent;
    public final @Nullable MethodHandle HANDLE$vkCmdSetEvent2;
    public final @Nullable MethodHandle HANDLE$vkCmdSetEvent2KHR;
    public final @Nullable MethodHandle HANDLE$vkCmdSetExclusiveScissorEnableNV;
    public final @Nullable MethodHandle HANDLE$vkCmdSetExclusiveScissorNV;
    public final @Nullable MethodHandle HANDLE$vkCmdSetExtraPrimitiveOverestimationSizeEXT;
    public final @Nullable MethodHandle HANDLE$vkCmdSetFragmentShadingRateEnumNV;
    public final @Nullable MethodHandle HANDLE$vkCmdSetFragmentShadingRateKHR;
    public final @Nullable MethodHandle HANDLE$vkCmdSetFrontFace;
    public final @Nullable MethodHandle HANDLE$vkCmdSetFrontFaceEXT;
    public final @Nullable MethodHandle HANDLE$vkCmdSetLineRasterizationModeEXT;
    public final @Nullable MethodHandle HANDLE$vkCmdSetLineStipple;
    public final @Nullable MethodHandle HANDLE$vkCmdSetLineStippleEXT;
    public final @Nullable MethodHandle HANDLE$vkCmdSetLineStippleEnableEXT;
    public final @Nullable MethodHandle HANDLE$vkCmdSetLineStippleKHR;
    public final @Nullable MethodHandle HANDLE$vkCmdSetLineWidth;
    public final @Nullable MethodHandle HANDLE$vkCmdSetLogicOpEXT;
    public final @Nullable MethodHandle HANDLE$vkCmdSetLogicOpEnableEXT;
    public final @Nullable MethodHandle HANDLE$vkCmdSetPatchControlPointsEXT;
    public final @Nullable MethodHandle HANDLE$vkCmdSetPerformanceMarkerINTEL;
    public final @Nullable MethodHandle HANDLE$vkCmdSetPerformanceOverrideINTEL;
    public final @Nullable MethodHandle HANDLE$vkCmdSetPerformanceStreamMarkerINTEL;
    public final @Nullable MethodHandle HANDLE$vkCmdSetPolygonModeEXT;
    public final @Nullable MethodHandle HANDLE$vkCmdSetPrimitiveRestartEnable;
    public final @Nullable MethodHandle HANDLE$vkCmdSetPrimitiveRestartEnableEXT;
    public final @Nullable MethodHandle HANDLE$vkCmdSetPrimitiveTopology;
    public final @Nullable MethodHandle HANDLE$vkCmdSetPrimitiveTopologyEXT;
    public final @Nullable MethodHandle HANDLE$vkCmdSetProvokingVertexModeEXT;
    public final @Nullable MethodHandle HANDLE$vkCmdSetRasterizationSamplesEXT;
    public final @Nullable MethodHandle HANDLE$vkCmdSetRasterizationStreamEXT;
    public final @Nullable MethodHandle HANDLE$vkCmdSetRasterizerDiscardEnable;
    public final @Nullable MethodHandle HANDLE$vkCmdSetRasterizerDiscardEnableEXT;
    public final @Nullable MethodHandle HANDLE$vkCmdSetRayTracingPipelineStackSizeKHR;
    public final @Nullable MethodHandle HANDLE$vkCmdSetRenderingAttachmentLocations;
    public final @Nullable MethodHandle HANDLE$vkCmdSetRenderingAttachmentLocationsKHR;
    public final @Nullable MethodHandle HANDLE$vkCmdSetRenderingInputAttachmentIndices;
    public final @Nullable MethodHandle HANDLE$vkCmdSetRenderingInputAttachmentIndicesKHR;
    public final @Nullable MethodHandle HANDLE$vkCmdSetRepresentativeFragmentTestEnableNV;
    public final @Nullable MethodHandle HANDLE$vkCmdSetSampleLocationsEXT;
    public final @Nullable MethodHandle HANDLE$vkCmdSetSampleLocationsEnableEXT;
    public final @Nullable MethodHandle HANDLE$vkCmdSetSampleMaskEXT;
    public final @Nullable MethodHandle HANDLE$vkCmdSetScissor;
    public final @Nullable MethodHandle HANDLE$vkCmdSetScissorWithCount;
    public final @Nullable MethodHandle HANDLE$vkCmdSetScissorWithCountEXT;
    public final @Nullable MethodHandle HANDLE$vkCmdSetShadingRateImageEnableNV;
    public final @Nullable MethodHandle HANDLE$vkCmdSetStencilCompareMask;
    public final @Nullable MethodHandle HANDLE$vkCmdSetStencilOp;
    public final @Nullable MethodHandle HANDLE$vkCmdSetStencilOpEXT;
    public final @Nullable MethodHandle HANDLE$vkCmdSetStencilReference;
    public final @Nullable MethodHandle HANDLE$vkCmdSetStencilTestEnable;
    public final @Nullable MethodHandle HANDLE$vkCmdSetStencilTestEnableEXT;
    public final @Nullable MethodHandle HANDLE$vkCmdSetStencilWriteMask;
    public final @Nullable MethodHandle HANDLE$vkCmdSetTessellationDomainOriginEXT;
    public final @Nullable MethodHandle HANDLE$vkCmdSetVertexInputEXT;
    public final @Nullable MethodHandle HANDLE$vkCmdSetViewport;
    public final @Nullable MethodHandle HANDLE$vkCmdSetViewportShadingRatePaletteNV;
    public final @Nullable MethodHandle HANDLE$vkCmdSetViewportSwizzleNV;
    public final @Nullable MethodHandle HANDLE$vkCmdSetViewportWScalingEnableNV;
    public final @Nullable MethodHandle HANDLE$vkCmdSetViewportWScalingNV;
    public final @Nullable MethodHandle HANDLE$vkCmdSetViewportWithCount;
    public final @Nullable MethodHandle HANDLE$vkCmdSetViewportWithCountEXT;
    public final @Nullable MethodHandle HANDLE$vkCmdSubpassShadingHUAWEI;
    public final @Nullable MethodHandle HANDLE$vkCmdTraceRaysIndirect2KHR;
    public final @Nullable MethodHandle HANDLE$vkCmdTraceRaysIndirectKHR;
    public final @Nullable MethodHandle HANDLE$vkCmdTraceRaysKHR;
    public final @Nullable MethodHandle HANDLE$vkCmdTraceRaysNV;
    public final @Nullable MethodHandle HANDLE$vkCmdUpdateBuffer;
    public final @Nullable MethodHandle HANDLE$vkCmdUpdatePipelineIndirectBufferNV;
    public final @Nullable MethodHandle HANDLE$vkCmdWaitEvents;
    public final @Nullable MethodHandle HANDLE$vkCmdWaitEvents2;
    public final @Nullable MethodHandle HANDLE$vkCmdWaitEvents2KHR;
    public final @Nullable MethodHandle HANDLE$vkCmdWriteAccelerationStructuresPropertiesKHR;
    public final @Nullable MethodHandle HANDLE$vkCmdWriteAccelerationStructuresPropertiesNV;
    public final @Nullable MethodHandle HANDLE$vkCmdWriteBufferMarker2AMD;
    public final @Nullable MethodHandle HANDLE$vkCmdWriteBufferMarkerAMD;
    public final @Nullable MethodHandle HANDLE$vkCmdWriteMicromapsPropertiesEXT;
    public final @Nullable MethodHandle HANDLE$vkCmdWriteTimestamp;
    public final @Nullable MethodHandle HANDLE$vkCmdWriteTimestamp2;
    public final @Nullable MethodHandle HANDLE$vkCmdWriteTimestamp2KHR;
    public final @Nullable MethodHandle HANDLE$vkCompileDeferredNV;
    public final @Nullable MethodHandle HANDLE$vkConvertCooperativeVectorMatrixNV;
    public final @Nullable MethodHandle HANDLE$vkCopyAccelerationStructureKHR;
    public final @Nullable MethodHandle HANDLE$vkCopyAccelerationStructureToMemoryKHR;
    public final @Nullable MethodHandle HANDLE$vkCopyImageToImage;
    public final @Nullable MethodHandle HANDLE$vkCopyImageToImageEXT;
    public final @Nullable MethodHandle HANDLE$vkCopyImageToMemory;
    public final @Nullable MethodHandle HANDLE$vkCopyImageToMemoryEXT;
    public final @Nullable MethodHandle HANDLE$vkCopyMemoryToAccelerationStructureKHR;
    public final @Nullable MethodHandle HANDLE$vkCopyMemoryToImage;
    public final @Nullable MethodHandle HANDLE$vkCopyMemoryToImageEXT;
    public final @Nullable MethodHandle HANDLE$vkCopyMemoryToMicromapEXT;
    public final @Nullable MethodHandle HANDLE$vkCopyMicromapEXT;
    public final @Nullable MethodHandle HANDLE$vkCopyMicromapToMemoryEXT;
    public final @Nullable MethodHandle HANDLE$vkCreateAccelerationStructureKHR;
    public final @Nullable MethodHandle HANDLE$vkCreateAccelerationStructureNV;
    public final @Nullable MethodHandle HANDLE$vkCreateBuffer;
    public final @Nullable MethodHandle HANDLE$vkCreateBufferCollectionFUCHSIA;
    public final @Nullable MethodHandle HANDLE$vkCreateBufferView;
    public final @Nullable MethodHandle HANDLE$vkCreateCommandPool;
    public final @Nullable MethodHandle HANDLE$vkCreateComputePipelines;
    public final @Nullable MethodHandle HANDLE$vkCreateCuFunctionNVX;
    public final @Nullable MethodHandle HANDLE$vkCreateCuModuleNVX;
    public final @Nullable MethodHandle HANDLE$vkCreateCudaFunctionNV;
    public final @Nullable MethodHandle HANDLE$vkCreateCudaModuleNV;
    public final @Nullable MethodHandle HANDLE$vkCreateDeferredOperationKHR;
    public final @Nullable MethodHandle HANDLE$vkCreateDescriptorPool;
    public final @Nullable MethodHandle HANDLE$vkCreateDescriptorSetLayout;
    public final @Nullable MethodHandle HANDLE$vkCreateDescriptorUpdateTemplate;
    public final @Nullable MethodHandle HANDLE$vkCreateDescriptorUpdateTemplateKHR;
    public final @Nullable MethodHandle HANDLE$vkCreateEvent;
    public final @Nullable MethodHandle HANDLE$vkCreateExecutionGraphPipelinesAMDX;
    public final @Nullable MethodHandle HANDLE$vkCreateExternalComputeQueueNV;
    public final @Nullable MethodHandle HANDLE$vkCreateFence;
    public final @Nullable MethodHandle HANDLE$vkCreateFramebuffer;
    public final @Nullable MethodHandle HANDLE$vkCreateGraphicsPipelines;
    public final @Nullable MethodHandle HANDLE$vkCreateImage;
    public final @Nullable MethodHandle HANDLE$vkCreateImageView;
    public final @Nullable MethodHandle HANDLE$vkCreateIndirectCommandsLayoutEXT;
    public final @Nullable MethodHandle HANDLE$vkCreateIndirectCommandsLayoutNV;
    public final @Nullable MethodHandle HANDLE$vkCreateIndirectExecutionSetEXT;
    public final @Nullable MethodHandle HANDLE$vkCreateMicromapEXT;
    public final @Nullable MethodHandle HANDLE$vkCreateOpticalFlowSessionNV;
    public final @Nullable MethodHandle HANDLE$vkCreatePipelineBinariesKHR;
    public final @Nullable MethodHandle HANDLE$vkCreatePipelineCache;
    public final @Nullable MethodHandle HANDLE$vkCreatePipelineLayout;
    public final @Nullable MethodHandle HANDLE$vkCreatePrivateDataSlot;
    public final @Nullable MethodHandle HANDLE$vkCreatePrivateDataSlotEXT;
    public final @Nullable MethodHandle HANDLE$vkCreateQueryPool;
    public final @Nullable MethodHandle HANDLE$vkCreateRayTracingPipelinesKHR;
    public final @Nullable MethodHandle HANDLE$vkCreateRayTracingPipelinesNV;
    public final @Nullable MethodHandle HANDLE$vkCreateRenderPass;
    public final @Nullable MethodHandle HANDLE$vkCreateRenderPass2;
    public final @Nullable MethodHandle HANDLE$vkCreateRenderPass2KHR;
    public final @Nullable MethodHandle HANDLE$vkCreateSampler;
    public final @Nullable MethodHandle HANDLE$vkCreateSamplerYcbcrConversion;
    public final @Nullable MethodHandle HANDLE$vkCreateSamplerYcbcrConversionKHR;
    public final @Nullable MethodHandle HANDLE$vkCreateSemaphore;
    public final @Nullable MethodHandle HANDLE$vkCreateSemaphoreSciSyncPoolNV;
    public final @Nullable MethodHandle HANDLE$vkCreateShaderModule;
    public final @Nullable MethodHandle HANDLE$vkCreateShadersEXT;
    public final @Nullable MethodHandle HANDLE$vkCreateSharedSwapchainsKHR;
    public final @Nullable MethodHandle HANDLE$vkCreateSwapchainKHR;
    public final @Nullable MethodHandle HANDLE$vkCreateValidationCacheEXT;
    public final @Nullable MethodHandle HANDLE$vkCreateVideoSessionKHR;
    public final @Nullable MethodHandle HANDLE$vkCreateVideoSessionParametersKHR;
    public final @Nullable MethodHandle HANDLE$vkDebugMarkerSetObjectNameEXT;
    public final @Nullable MethodHandle HANDLE$vkDebugMarkerSetObjectTagEXT;
    public final @Nullable MethodHandle HANDLE$vkDeferredOperationJoinKHR;
    public final @Nullable MethodHandle HANDLE$vkDestroyAccelerationStructureKHR;
    public final @Nullable MethodHandle HANDLE$vkDestroyAccelerationStructureNV;
    public final @Nullable MethodHandle HANDLE$vkDestroyBuffer;
    public final @Nullable MethodHandle HANDLE$vkDestroyBufferCollectionFUCHSIA;
    public final @Nullable MethodHandle HANDLE$vkDestroyBufferView;
    public final @Nullable MethodHandle HANDLE$vkDestroyCommandPool;
    public final @Nullable MethodHandle HANDLE$vkDestroyCuFunctionNVX;
    public final @Nullable MethodHandle HANDLE$vkDestroyCuModuleNVX;
    public final @Nullable MethodHandle HANDLE$vkDestroyCudaFunctionNV;
    public final @Nullable MethodHandle HANDLE$vkDestroyCudaModuleNV;
    public final @Nullable MethodHandle HANDLE$vkDestroyDeferredOperationKHR;
    public final @Nullable MethodHandle HANDLE$vkDestroyDescriptorPool;
    public final @Nullable MethodHandle HANDLE$vkDestroyDescriptorSetLayout;
    public final @Nullable MethodHandle HANDLE$vkDestroyDescriptorUpdateTemplate;
    public final @Nullable MethodHandle HANDLE$vkDestroyDescriptorUpdateTemplateKHR;
    public final @Nullable MethodHandle HANDLE$vkDestroyDevice;
    public final @Nullable MethodHandle HANDLE$vkDestroyEvent;
    public final @Nullable MethodHandle HANDLE$vkDestroyExternalComputeQueueNV;
    public final @Nullable MethodHandle HANDLE$vkDestroyFence;
    public final @Nullable MethodHandle HANDLE$vkDestroyFramebuffer;
    public final @Nullable MethodHandle HANDLE$vkDestroyImage;
    public final @Nullable MethodHandle HANDLE$vkDestroyImageView;
    public final @Nullable MethodHandle HANDLE$vkDestroyIndirectCommandsLayoutEXT;
    public final @Nullable MethodHandle HANDLE$vkDestroyIndirectCommandsLayoutNV;
    public final @Nullable MethodHandle HANDLE$vkDestroyIndirectExecutionSetEXT;
    public final @Nullable MethodHandle HANDLE$vkDestroyMicromapEXT;
    public final @Nullable MethodHandle HANDLE$vkDestroyOpticalFlowSessionNV;
    public final @Nullable MethodHandle HANDLE$vkDestroyPipeline;
    public final @Nullable MethodHandle HANDLE$vkDestroyPipelineBinaryKHR;
    public final @Nullable MethodHandle HANDLE$vkDestroyPipelineCache;
    public final @Nullable MethodHandle HANDLE$vkDestroyPipelineLayout;
    public final @Nullable MethodHandle HANDLE$vkDestroyPrivateDataSlot;
    public final @Nullable MethodHandle HANDLE$vkDestroyPrivateDataSlotEXT;
    public final @Nullable MethodHandle HANDLE$vkDestroyQueryPool;
    public final @Nullable MethodHandle HANDLE$vkDestroyRenderPass;
    public final @Nullable MethodHandle HANDLE$vkDestroySampler;
    public final @Nullable MethodHandle HANDLE$vkDestroySamplerYcbcrConversion;
    public final @Nullable MethodHandle HANDLE$vkDestroySamplerYcbcrConversionKHR;
    public final @Nullable MethodHandle HANDLE$vkDestroySemaphore;
    public final @Nullable MethodHandle HANDLE$vkDestroySemaphoreSciSyncPoolNV;
    public final @Nullable MethodHandle HANDLE$vkDestroyShaderEXT;
    public final @Nullable MethodHandle HANDLE$vkDestroyShaderModule;
    public final @Nullable MethodHandle HANDLE$vkDestroySwapchainKHR;
    public final @Nullable MethodHandle HANDLE$vkDestroyValidationCacheEXT;
    public final @Nullable MethodHandle HANDLE$vkDestroyVideoSessionKHR;
    public final @Nullable MethodHandle HANDLE$vkDestroyVideoSessionParametersKHR;
    public final @Nullable MethodHandle HANDLE$vkDeviceWaitIdle;
    public final @Nullable MethodHandle HANDLE$vkDisplayPowerControlEXT;
    public final @Nullable MethodHandle HANDLE$vkEndCommandBuffer;
    public final @Nullable MethodHandle HANDLE$vkExportMetalObjectsEXT;
    public final @Nullable MethodHandle HANDLE$vkFlushMappedMemoryRanges;
    public final @Nullable MethodHandle HANDLE$vkFreeCommandBuffers;
    public final @Nullable MethodHandle HANDLE$vkFreeDescriptorSets;
    public final @Nullable MethodHandle HANDLE$vkFreeMemory;
    public final @Nullable MethodHandle HANDLE$vkGetAccelerationStructureBuildSizesKHR;
    public final @Nullable MethodHandle HANDLE$vkGetAccelerationStructureDeviceAddressKHR;
    public final @Nullable MethodHandle HANDLE$vkGetAccelerationStructureHandleNV;
    public final @Nullable MethodHandle HANDLE$vkGetAccelerationStructureMemoryRequirementsNV;
    public final @Nullable MethodHandle HANDLE$vkGetAccelerationStructureOpaqueCaptureDescriptorDataEXT;
    public final @Nullable MethodHandle HANDLE$vkGetAndroidHardwareBufferPropertiesANDROID;
    public final @Nullable MethodHandle HANDLE$vkGetBufferCollectionPropertiesFUCHSIA;
    public final @Nullable MethodHandle HANDLE$vkGetBufferDeviceAddress;
    public final @Nullable MethodHandle HANDLE$vkGetBufferDeviceAddressEXT;
    public final @Nullable MethodHandle HANDLE$vkGetBufferDeviceAddressKHR;
    public final @Nullable MethodHandle HANDLE$vkGetBufferMemoryRequirements;
    public final @Nullable MethodHandle HANDLE$vkGetBufferMemoryRequirements2;
    public final @Nullable MethodHandle HANDLE$vkGetBufferMemoryRequirements2KHR;
    public final @Nullable MethodHandle HANDLE$vkGetBufferOpaqueCaptureAddress;
    public final @Nullable MethodHandle HANDLE$vkGetBufferOpaqueCaptureAddressKHR;
    public final @Nullable MethodHandle HANDLE$vkGetBufferOpaqueCaptureDescriptorDataEXT;
    public final @Nullable MethodHandle HANDLE$vkGetCalibratedTimestampsEXT;
    public final @Nullable MethodHandle HANDLE$vkGetCalibratedTimestampsKHR;
    public final @Nullable MethodHandle HANDLE$vkGetClusterAccelerationStructureBuildSizesNV;
    public final @Nullable MethodHandle HANDLE$vkGetCudaModuleCacheNV;
    public final @Nullable MethodHandle HANDLE$vkGetDeferredOperationMaxConcurrencyKHR;
    public final @Nullable MethodHandle HANDLE$vkGetDeferredOperationResultKHR;
    public final @Nullable MethodHandle HANDLE$vkGetDescriptorEXT;
    public final @Nullable MethodHandle HANDLE$vkGetDescriptorSetHostMappingVALVE;
    public final @Nullable MethodHandle HANDLE$vkGetDescriptorSetLayoutBindingOffsetEXT;
    public final @Nullable MethodHandle HANDLE$vkGetDescriptorSetLayoutHostMappingInfoVALVE;
    public final @Nullable MethodHandle HANDLE$vkGetDescriptorSetLayoutSizeEXT;
    public final @Nullable MethodHandle HANDLE$vkGetDescriptorSetLayoutSupport;
    public final @Nullable MethodHandle HANDLE$vkGetDescriptorSetLayoutSupportKHR;
    public final @Nullable MethodHandle HANDLE$vkGetDeviceAccelerationStructureCompatibilityKHR;
    public final @Nullable MethodHandle HANDLE$vkGetDeviceBufferMemoryRequirements;
    public final @Nullable MethodHandle HANDLE$vkGetDeviceBufferMemoryRequirementsKHR;
    public final @Nullable MethodHandle HANDLE$vkGetDeviceFaultInfoEXT;
    public final @Nullable MethodHandle HANDLE$vkGetDeviceGroupPeerMemoryFeatures;
    public final @Nullable MethodHandle HANDLE$vkGetDeviceGroupPeerMemoryFeaturesKHR;
    public final @Nullable MethodHandle HANDLE$vkGetDeviceGroupPresentCapabilitiesKHR;
    public final @Nullable MethodHandle HANDLE$vkGetDeviceGroupSurfacePresentModes2EXT;
    public final @Nullable MethodHandle HANDLE$vkGetDeviceGroupSurfacePresentModesKHR;
    public final @Nullable MethodHandle HANDLE$vkGetDeviceImageMemoryRequirements;
    public final @Nullable MethodHandle HANDLE$vkGetDeviceImageMemoryRequirementsKHR;
    public final @Nullable MethodHandle HANDLE$vkGetDeviceImageSparseMemoryRequirements;
    public final @Nullable MethodHandle HANDLE$vkGetDeviceImageSparseMemoryRequirementsKHR;
    public final @Nullable MethodHandle HANDLE$vkGetDeviceImageSubresourceLayout;
    public final @Nullable MethodHandle HANDLE$vkGetDeviceImageSubresourceLayoutKHR;
    public final @Nullable MethodHandle HANDLE$vkGetDeviceMemoryCommitment;
    public final @Nullable MethodHandle HANDLE$vkGetDeviceMemoryOpaqueCaptureAddress;
    public final @Nullable MethodHandle HANDLE$vkGetDeviceMemoryOpaqueCaptureAddressKHR;
    public final @Nullable MethodHandle HANDLE$vkGetDeviceMicromapCompatibilityEXT;
    public final @Nullable MethodHandle HANDLE$vkGetDeviceQueue;
    public final @Nullable MethodHandle HANDLE$vkGetDeviceQueue2;
    public final @Nullable MethodHandle HANDLE$vkGetDeviceSubpassShadingMaxWorkgroupSizeHUAWEI;
    public final @Nullable MethodHandle HANDLE$vkGetDynamicRenderingTilePropertiesQCOM;
    public final @Nullable MethodHandle HANDLE$vkGetEncodedVideoSessionParametersKHR;
    public final @Nullable MethodHandle HANDLE$vkGetEventStatus;
    public final @Nullable MethodHandle HANDLE$vkGetExecutionGraphPipelineNodeIndexAMDX;
    public final @Nullable MethodHandle HANDLE$vkGetExecutionGraphPipelineScratchSizeAMDX;
    public final @Nullable MethodHandle HANDLE$vkGetExternalComputeQueueDataNV;
    public final @Nullable MethodHandle HANDLE$vkGetFenceFdKHR;
    public final @Nullable MethodHandle HANDLE$vkGetFenceSciSyncFenceNV;
    public final @Nullable MethodHandle HANDLE$vkGetFenceSciSyncObjNV;
    public final @Nullable MethodHandle HANDLE$vkGetFenceStatus;
    public final @Nullable MethodHandle HANDLE$vkGetFenceWin32HandleKHR;
    public final @Nullable MethodHandle HANDLE$vkGetFramebufferTilePropertiesQCOM;
    public final @Nullable MethodHandle HANDLE$vkGetGeneratedCommandsMemoryRequirementsEXT;
    public final @Nullable MethodHandle HANDLE$vkGetGeneratedCommandsMemoryRequirementsNV;
    public final @Nullable MethodHandle HANDLE$vkGetImageDrmFormatModifierPropertiesEXT;
    public final @Nullable MethodHandle HANDLE$vkGetImageMemoryRequirements;
    public final @Nullable MethodHandle HANDLE$vkGetImageMemoryRequirements2;
    public final @Nullable MethodHandle HANDLE$vkGetImageMemoryRequirements2KHR;
    public final @Nullable MethodHandle HANDLE$vkGetImageOpaqueCaptureDescriptorDataEXT;
    public final @Nullable MethodHandle HANDLE$vkGetImageSparseMemoryRequirements;
    public final @Nullable MethodHandle HANDLE$vkGetImageSparseMemoryRequirements2;
    public final @Nullable MethodHandle HANDLE$vkGetImageSparseMemoryRequirements2KHR;
    public final @Nullable MethodHandle HANDLE$vkGetImageSubresourceLayout;
    public final @Nullable MethodHandle HANDLE$vkGetImageSubresourceLayout2;
    public final @Nullable MethodHandle HANDLE$vkGetImageSubresourceLayout2EXT;
    public final @Nullable MethodHandle HANDLE$vkGetImageSubresourceLayout2KHR;
    public final @Nullable MethodHandle HANDLE$vkGetImageViewAddressNVX;
    public final @Nullable MethodHandle HANDLE$vkGetImageViewHandle64NVX;
    public final @Nullable MethodHandle HANDLE$vkGetImageViewHandleNVX;
    public final @Nullable MethodHandle HANDLE$vkGetImageViewOpaqueCaptureDescriptorDataEXT;
    public final @Nullable MethodHandle HANDLE$vkGetLatencyTimingsNV;
    public final @Nullable MethodHandle HANDLE$vkGetMemoryAndroidHardwareBufferANDROID;
    public final @Nullable MethodHandle HANDLE$vkGetMemoryFdKHR;
    public final @Nullable MethodHandle HANDLE$vkGetMemoryFdPropertiesKHR;
    public final @Nullable MethodHandle HANDLE$vkGetMemoryHostPointerPropertiesEXT;
    public final @Nullable MethodHandle HANDLE$vkGetMemoryMetalHandleEXT;
    public final @Nullable MethodHandle HANDLE$vkGetMemoryMetalHandlePropertiesEXT;
    public final @Nullable MethodHandle HANDLE$vkGetMemoryRemoteAddressNV;
    public final @Nullable MethodHandle HANDLE$vkGetMemorySciBufNV;
    public final @Nullable MethodHandle HANDLE$vkGetMemoryWin32HandleKHR;
    public final @Nullable MethodHandle HANDLE$vkGetMemoryWin32HandleNV;
    public final @Nullable MethodHandle HANDLE$vkGetMemoryWin32HandlePropertiesKHR;
    public final @Nullable MethodHandle HANDLE$vkGetMemoryZirconHandleFUCHSIA;
    public final @Nullable MethodHandle HANDLE$vkGetMemoryZirconHandlePropertiesFUCHSIA;
    public final @Nullable MethodHandle HANDLE$vkGetMicromapBuildSizesEXT;
    public final @Nullable MethodHandle HANDLE$vkGetPartitionedAccelerationStructuresBuildSizesNV;
    public final @Nullable MethodHandle HANDLE$vkGetPastPresentationTimingGOOGLE;
    public final @Nullable MethodHandle HANDLE$vkGetPerformanceParameterINTEL;
    public final @Nullable MethodHandle HANDLE$vkGetPipelineBinaryDataKHR;
    public final @Nullable MethodHandle HANDLE$vkGetPipelineCacheData;
    public final @Nullable MethodHandle HANDLE$vkGetPipelineExecutableInternalRepresentationsKHR;
    public final @Nullable MethodHandle HANDLE$vkGetPipelineExecutablePropertiesKHR;
    public final @Nullable MethodHandle HANDLE$vkGetPipelineExecutableStatisticsKHR;
    public final @Nullable MethodHandle HANDLE$vkGetPipelineIndirectDeviceAddressNV;
    public final @Nullable MethodHandle HANDLE$vkGetPipelineIndirectMemoryRequirementsNV;
    public final @Nullable MethodHandle HANDLE$vkGetPipelineKeyKHR;
    public final @Nullable MethodHandle HANDLE$vkGetPipelinePropertiesEXT;
    public final @Nullable MethodHandle HANDLE$vkGetPrivateData;
    public final @Nullable MethodHandle HANDLE$vkGetPrivateDataEXT;
    public final @Nullable MethodHandle HANDLE$vkGetQueryPoolResults;
    public final @Nullable MethodHandle HANDLE$vkGetQueueCheckpointData2NV;
    public final @Nullable MethodHandle HANDLE$vkGetQueueCheckpointDataNV;
    public final @Nullable MethodHandle HANDLE$vkGetRayTracingCaptureReplayShaderGroupHandlesKHR;
    public final @Nullable MethodHandle HANDLE$vkGetRayTracingShaderGroupHandlesKHR;
    public final @Nullable MethodHandle HANDLE$vkGetRayTracingShaderGroupHandlesNV;
    public final @Nullable MethodHandle HANDLE$vkGetRayTracingShaderGroupStackSizeKHR;
    public final @Nullable MethodHandle HANDLE$vkGetRefreshCycleDurationGOOGLE;
    public final @Nullable MethodHandle HANDLE$vkGetRenderAreaGranularity;
    public final @Nullable MethodHandle HANDLE$vkGetRenderingAreaGranularity;
    public final @Nullable MethodHandle HANDLE$vkGetRenderingAreaGranularityKHR;
    public final @Nullable MethodHandle HANDLE$vkGetSamplerOpaqueCaptureDescriptorDataEXT;
    public final @Nullable MethodHandle HANDLE$vkGetScreenBufferPropertiesQNX;
    public final @Nullable MethodHandle HANDLE$vkGetSemaphoreCounterValue;
    public final @Nullable MethodHandle HANDLE$vkGetSemaphoreCounterValueKHR;
    public final @Nullable MethodHandle HANDLE$vkGetSemaphoreFdKHR;
    public final @Nullable MethodHandle HANDLE$vkGetSemaphoreSciSyncObjNV;
    public final @Nullable MethodHandle HANDLE$vkGetSemaphoreWin32HandleKHR;
    public final @Nullable MethodHandle HANDLE$vkGetSemaphoreZirconHandleFUCHSIA;
    public final @Nullable MethodHandle HANDLE$vkGetShaderBinaryDataEXT;
    public final @Nullable MethodHandle HANDLE$vkGetShaderInfoAMD;
    public final @Nullable MethodHandle HANDLE$vkGetShaderModuleCreateInfoIdentifierEXT;
    public final @Nullable MethodHandle HANDLE$vkGetShaderModuleIdentifierEXT;
    public final @Nullable MethodHandle HANDLE$vkGetSwapchainCounterEXT;
    public final @Nullable MethodHandle HANDLE$vkGetSwapchainImagesKHR;
    public final @Nullable MethodHandle HANDLE$vkGetSwapchainStatusKHR;
    public final @Nullable MethodHandle HANDLE$vkGetValidationCacheDataEXT;
    public final @Nullable MethodHandle HANDLE$vkGetVideoSessionMemoryRequirementsKHR;
    public final @Nullable MethodHandle HANDLE$vkImportFenceFdKHR;
    public final @Nullable MethodHandle HANDLE$vkImportFenceSciSyncFenceNV;
    public final @Nullable MethodHandle HANDLE$vkImportFenceSciSyncObjNV;
    public final @Nullable MethodHandle HANDLE$vkImportFenceWin32HandleKHR;
    public final @Nullable MethodHandle HANDLE$vkImportSemaphoreFdKHR;
    public final @Nullable MethodHandle HANDLE$vkImportSemaphoreSciSyncObjNV;
    public final @Nullable MethodHandle HANDLE$vkImportSemaphoreWin32HandleKHR;
    public final @Nullable MethodHandle HANDLE$vkImportSemaphoreZirconHandleFUCHSIA;
    public final @Nullable MethodHandle HANDLE$vkInitializePerformanceApiINTEL;
    public final @Nullable MethodHandle HANDLE$vkInvalidateMappedMemoryRanges;
    public final @Nullable MethodHandle HANDLE$vkLatencySleepNV;
    public final @Nullable MethodHandle HANDLE$vkMapMemory;
    public final @Nullable MethodHandle HANDLE$vkMapMemory2;
    public final @Nullable MethodHandle HANDLE$vkMapMemory2KHR;
    public final @Nullable MethodHandle HANDLE$vkMergePipelineCaches;
    public final @Nullable MethodHandle HANDLE$vkMergeValidationCachesEXT;
    public final @Nullable MethodHandle HANDLE$vkQueueBindSparse;
    public final @Nullable MethodHandle HANDLE$vkQueueNotifyOutOfBandNV;
    public final @Nullable MethodHandle HANDLE$vkQueuePresentKHR;
    public final @Nullable MethodHandle HANDLE$vkQueueSetPerformanceConfigurationINTEL;
    public final @Nullable MethodHandle HANDLE$vkQueueSubmit;
    public final @Nullable MethodHandle HANDLE$vkQueueSubmit2;
    public final @Nullable MethodHandle HANDLE$vkQueueSubmit2KHR;
    public final @Nullable MethodHandle HANDLE$vkQueueWaitIdle;
    public final @Nullable MethodHandle HANDLE$vkRegisterDeviceEventEXT;
    public final @Nullable MethodHandle HANDLE$vkRegisterDisplayEventEXT;
    public final @Nullable MethodHandle HANDLE$vkReleaseCapturedPipelineDataKHR;
    public final @Nullable MethodHandle HANDLE$vkReleaseFullScreenExclusiveModeEXT;
    public final @Nullable MethodHandle HANDLE$vkReleasePerformanceConfigurationINTEL;
    public final @Nullable MethodHandle HANDLE$vkReleaseProfilingLockKHR;
    public final @Nullable MethodHandle HANDLE$vkReleaseSwapchainImagesEXT;
    public final @Nullable MethodHandle HANDLE$vkResetCommandBuffer;
    public final @Nullable MethodHandle HANDLE$vkResetCommandPool;
    public final @Nullable MethodHandle HANDLE$vkResetDescriptorPool;
    public final @Nullable MethodHandle HANDLE$vkResetEvent;
    public final @Nullable MethodHandle HANDLE$vkResetFences;
    public final @Nullable MethodHandle HANDLE$vkResetQueryPool;
    public final @Nullable MethodHandle HANDLE$vkResetQueryPoolEXT;
    public final @Nullable MethodHandle HANDLE$vkSetBufferCollectionBufferConstraintsFUCHSIA;
    public final @Nullable MethodHandle HANDLE$vkSetBufferCollectionImageConstraintsFUCHSIA;
    public final @Nullable MethodHandle HANDLE$vkSetDeviceMemoryPriorityEXT;
    public final @Nullable MethodHandle HANDLE$vkSetEvent;
    public final @Nullable MethodHandle HANDLE$vkSetHdrMetadataEXT;
    public final @Nullable MethodHandle HANDLE$vkSetLatencyMarkerNV;
    public final @Nullable MethodHandle HANDLE$vkSetLatencySleepModeNV;
    public final @Nullable MethodHandle HANDLE$vkSetLocalDimmingAMD;
    public final @Nullable MethodHandle HANDLE$vkSetPrivateData;
    public final @Nullable MethodHandle HANDLE$vkSetPrivateDataEXT;
    public final @Nullable MethodHandle HANDLE$vkSignalSemaphore;
    public final @Nullable MethodHandle HANDLE$vkSignalSemaphoreKHR;
    public final @Nullable MethodHandle HANDLE$vkTransitionImageLayout;
    public final @Nullable MethodHandle HANDLE$vkTransitionImageLayoutEXT;
    public final @Nullable MethodHandle HANDLE$vkTrimCommandPool;
    public final @Nullable MethodHandle HANDLE$vkTrimCommandPoolKHR;
    public final @Nullable MethodHandle HANDLE$vkUninitializePerformanceApiINTEL;
    public final @Nullable MethodHandle HANDLE$vkUnmapMemory;
    public final @Nullable MethodHandle HANDLE$vkUnmapMemory2;
    public final @Nullable MethodHandle HANDLE$vkUnmapMemory2KHR;
    public final @Nullable MethodHandle HANDLE$vkUpdateDescriptorSetWithTemplate;
    public final @Nullable MethodHandle HANDLE$vkUpdateDescriptorSetWithTemplateKHR;
    public final @Nullable MethodHandle HANDLE$vkUpdateDescriptorSets;
    public final @Nullable MethodHandle HANDLE$vkUpdateIndirectExecutionSetPipelineEXT;
    public final @Nullable MethodHandle HANDLE$vkUpdateIndirectExecutionSetShaderEXT;
    public final @Nullable MethodHandle HANDLE$vkUpdateVideoSessionParametersKHR;
    public final @Nullable MethodHandle HANDLE$vkWaitForFences;
    public final @Nullable MethodHandle HANDLE$vkWaitForPresentKHR;
    public final @Nullable MethodHandle HANDLE$vkWaitSemaphores;
    public final @Nullable MethodHandle HANDLE$vkWaitSemaphoresKHR;
    public final @Nullable MethodHandle HANDLE$vkWriteAccelerationStructuresPropertiesKHR;
    public final @Nullable MethodHandle HANDLE$vkWriteMicromapsPropertiesEXT;
    // endregion

    public static final class Descriptors {
        public static final FunctionDescriptor DESCRIPTOR$vkAcquireFullScreenExclusiveModeEXT = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$vkAcquireNextImage2KHR = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkAcquireNextImageInfoKHR.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
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

        public static final FunctionDescriptor DESCRIPTOR$vkAcquirePerformanceConfigurationINTEL = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkPerformanceConfigurationAcquireInfoINTEL.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkAcquireProfilingLockKHR = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkAcquireProfilingLockInfoKHR.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkAllocateCommandBuffers = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkCommandBufferAllocateInfo.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkAllocateDescriptorSets = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkDescriptorSetAllocateInfo.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkAllocateMemory = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkMemoryAllocateInfo.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkAntiLagUpdateAMD = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkAntiLagDataAMD.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkBeginCommandBuffer = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkCommandBufferBeginInfo.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkBindAccelerationStructureMemoryNV = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(VkBindAccelerationStructureMemoryInfoNV.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkBindBufferMemory = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_LONG
        );

        public static final FunctionDescriptor DESCRIPTOR$vkBindBufferMemory2 = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(VkBindBufferMemoryInfo.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkBindImageMemory = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_LONG
        );

        public static final FunctionDescriptor DESCRIPTOR$vkBindImageMemory2 = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(VkBindImageMemoryInfo.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkBindOpticalFlowSessionImageNV = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$vkBindVideoSessionMemoryKHR = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(VkBindVideoSessionMemoryInfoKHR.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkBuildAccelerationStructuresKHR = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(VkAccelerationStructureBuildGeometryInfoKHR.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS.withTargetLayout(VkAccelerationStructureBuildRangeInfoKHR.LAYOUT))
        );

        public static final FunctionDescriptor DESCRIPTOR$vkBuildMicromapsEXT = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(VkMicromapBuildInfoEXT.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCmdBeginConditionalRenderingEXT = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkConditionalRenderingBeginInfoEXT.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCmdBeginPerTileExecutionQCOM = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkPerTileBeginInfoQCOM.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCmdBeginQuery = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCmdBeginQueryIndexedEXT = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCmdBeginRenderPass = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkRenderPassBeginInfo.LAYOUT),
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCmdBeginRenderPass2 = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkRenderPassBeginInfo.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(VkSubpassBeginInfo.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCmdBeginRendering = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkRenderingInfo.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCmdBeginTransformFeedbackEXT = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_LONG)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCmdBeginVideoCodingKHR = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkVideoBeginCodingInfoKHR.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCmdBindDescriptorBufferEmbeddedSamplers2EXT = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkBindDescriptorBufferEmbeddedSamplersInfoEXT.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCmdBindDescriptorBufferEmbeddedSamplersEXT = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCmdBindDescriptorBuffersEXT = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(VkDescriptorBufferBindingInfoEXT.LAYOUT)
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

        public static final FunctionDescriptor DESCRIPTOR$vkCmdBindDescriptorSets2 = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkBindDescriptorSetsInfo.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCmdBindIndexBuffer = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_LONG,
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCmdBindIndexBuffer2 = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_LONG,
            ValueLayout.JAVA_LONG,
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCmdBindInvocationMaskHUAWEI = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCmdBindPipeline = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCmdBindPipelineShaderGroupNV = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCmdBindShadersEXT = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCmdBindShadingRateImageNV = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCmdBindTileMemoryQCOM = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkTileMemoryBindInfoQCOM.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCmdBindTransformFeedbackBuffersEXT = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_LONG),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_LONG)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCmdBindVertexBuffers = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_LONG)
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

        public static final FunctionDescriptor DESCRIPTOR$vkCmdBlitImage2 = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkBlitImageInfo2.LAYOUT)
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

        public static final FunctionDescriptor DESCRIPTOR$vkCmdBuildAccelerationStructuresIndirectKHR = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(VkAccelerationStructureBuildGeometryInfoKHR.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_LONG),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT))
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCmdBuildAccelerationStructuresKHR = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(VkAccelerationStructureBuildGeometryInfoKHR.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS.withTargetLayout(VkAccelerationStructureBuildRangeInfoKHR.LAYOUT))
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCmdBuildClusterAccelerationStructureIndirectNV = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkClusterAccelerationStructureCommandsInfoNV.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCmdBuildMicromapsEXT = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(VkMicromapBuildInfoEXT.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCmdBuildPartitionedAccelerationStructuresNV = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkBuildPartitionedAccelerationStructureInfoNV.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCmdClearAttachments = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(VkClearAttachment.LAYOUT),
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(VkClearRect.LAYOUT)
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

        public static final FunctionDescriptor DESCRIPTOR$vkCmdControlVideoCodingKHR = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkVideoCodingControlInfoKHR.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCmdConvertCooperativeVectorMatrixNV = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(VkConvertCooperativeVectorMatrixInfoNV.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCmdCopyAccelerationStructureKHR = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkCopyAccelerationStructureInfoKHR.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCmdCopyAccelerationStructureNV = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCmdCopyAccelerationStructureToMemoryKHR = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkCopyAccelerationStructureToMemoryInfoKHR.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCmdCopyBuffer = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(VkBufferCopy.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCmdCopyBuffer2 = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkCopyBufferInfo2.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCmdCopyBufferToImage = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(VkBufferImageCopy.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCmdCopyBufferToImage2 = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkCopyBufferToImageInfo2.LAYOUT)
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

        public static final FunctionDescriptor DESCRIPTOR$vkCmdCopyImage2 = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkCopyImageInfo2.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCmdCopyImageToBuffer = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(VkBufferImageCopy.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCmdCopyImageToBuffer2 = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkCopyImageToBufferInfo2.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCmdCopyMemoryIndirectNV = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_LONG,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCmdCopyMemoryToAccelerationStructureKHR = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkCopyMemoryToAccelerationStructureInfoKHR.LAYOUT)
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

        public static final FunctionDescriptor DESCRIPTOR$vkCmdCopyMemoryToMicromapEXT = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkCopyMemoryToMicromapInfoEXT.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCmdCopyMicromapEXT = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkCopyMicromapInfoEXT.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCmdCopyMicromapToMemoryEXT = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkCopyMicromapToMemoryInfoEXT.LAYOUT)
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

        public static final FunctionDescriptor DESCRIPTOR$vkCmdCuLaunchKernelNVX = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkCuLaunchInfoNVX.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCmdCudaLaunchKernelNV = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkCudaLaunchInfoNV.LAYOUT)
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

        public static final FunctionDescriptor DESCRIPTOR$vkCmdDecodeVideoKHR = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkVideoDecodeInfoKHR.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCmdDecompressMemoryIndirectCountNV = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_LONG,
            ValueLayout.JAVA_LONG,
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCmdDecompressMemoryNV = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(VkDecompressMemoryRegionNV.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCmdDispatch = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT
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

        public static final FunctionDescriptor DESCRIPTOR$vkCmdDispatchGraphAMDX = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_LONG,
            ValueLayout.JAVA_LONG,
            ValueLayout.ADDRESS.withTargetLayout(VkDispatchGraphCountInfoAMDX.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCmdDispatchGraphIndirectAMDX = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_LONG,
            ValueLayout.JAVA_LONG,
            ValueLayout.ADDRESS.withTargetLayout(VkDispatchGraphCountInfoAMDX.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCmdDispatchGraphIndirectCountAMDX = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_LONG,
            ValueLayout.JAVA_LONG,
            ValueLayout.JAVA_LONG
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCmdDispatchIndirect = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_LONG
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCmdDispatchTileQCOM = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCmdDraw = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT
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

        public static final FunctionDescriptor DESCRIPTOR$vkCmdDrawIndexed = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
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

        public static final FunctionDescriptor DESCRIPTOR$vkCmdDrawIndexedIndirectCount = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_LONG,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_LONG,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCmdDrawIndirect = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_LONG,
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

        public static final FunctionDescriptor DESCRIPTOR$vkCmdDrawIndirectCount = FunctionDescriptor.ofVoid(
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

        public static final FunctionDescriptor DESCRIPTOR$vkCmdDrawMeshTasksIndirectCountEXT = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_LONG,
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

        public static final FunctionDescriptor DESCRIPTOR$vkCmdDrawMeshTasksIndirectEXT = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_LONG,
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

        public static final FunctionDescriptor DESCRIPTOR$vkCmdDrawMeshTasksNV = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
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

        public static final FunctionDescriptor DESCRIPTOR$vkCmdEncodeVideoKHR = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkVideoEncodeInfoKHR.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCmdEndConditionalRenderingEXT = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCmdEndPerTileExecutionQCOM = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkPerTileEndInfoQCOM.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCmdEndQuery = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCmdEndQueryIndexedEXT = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCmdEndRenderPass = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCmdEndRenderPass2 = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkSubpassEndInfo.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCmdEndRendering = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCmdEndRendering2EXT = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkRenderingEndInfoEXT.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCmdEndTransformFeedbackEXT = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_LONG)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCmdEndVideoCodingKHR = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkVideoEndCodingInfoKHR.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCmdExecuteCommands = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCmdExecuteGeneratedCommandsEXT = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(VkGeneratedCommandsInfoEXT.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCmdExecuteGeneratedCommandsNV = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(VkGeneratedCommandsInfoNV.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCmdFillBuffer = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_LONG,
            ValueLayout.JAVA_LONG,
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCmdInitializeGraphScratchMemoryAMDX = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_LONG,
            ValueLayout.JAVA_LONG
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCmdNextSubpass = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCmdNextSubpass2 = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkSubpassBeginInfo.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(VkSubpassEndInfo.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCmdOpticalFlowExecuteNV = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkOpticalFlowExecuteInfoNV.LAYOUT)
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

        public static final FunctionDescriptor DESCRIPTOR$vkCmdPipelineBarrier2 = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkDependencyInfo.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCmdPreprocessGeneratedCommandsEXT = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkGeneratedCommandsInfoEXT.LAYOUT),
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCmdPreprocessGeneratedCommandsNV = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkGeneratedCommandsInfoNV.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCmdPushConstants = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCmdPushConstants2 = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkPushConstantsInfo.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCmdPushDescriptorSet = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(VkWriteDescriptorSet.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCmdPushDescriptorSet2 = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkPushDescriptorSetInfo.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCmdPushDescriptorSetWithTemplate = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCmdPushDescriptorSetWithTemplate2 = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkPushDescriptorSetWithTemplateInfo.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCmdRefreshObjectsKHR = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkRefreshObjectListKHR.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCmdResetEvent = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCmdResetEvent2 = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_LONG
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCmdResetQueryPool = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT
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

        public static final FunctionDescriptor DESCRIPTOR$vkCmdResolveImage2 = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkResolveImageInfo2.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCmdSetAlphaToCoverageEnableEXT = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCmdSetAlphaToOneEnableEXT = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCmdSetAttachmentFeedbackLoopEnableEXT = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCmdSetBlendConstants = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_FLOAT
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCmdSetCheckpointNV = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCmdSetCoarseSampleOrderNV = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(VkCoarseSampleOrderCustomNV.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCmdSetColorBlendAdvancedEXT = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(VkColorBlendAdvancedEXT.LAYOUT)
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

        public static final FunctionDescriptor DESCRIPTOR$vkCmdSetColorWriteEnableEXT = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCmdSetColorWriteMaskEXT = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCmdSetConservativeRasterizationModeEXT = FunctionDescriptor.ofVoid(
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

        public static final FunctionDescriptor DESCRIPTOR$vkCmdSetCoverageReductionModeNV = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCmdSetCoverageToColorEnableNV = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCmdSetCoverageToColorLocationNV = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCmdSetCullMode = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCmdSetDepthBias = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_FLOAT,
            ValueLayout.JAVA_FLOAT,
            ValueLayout.JAVA_FLOAT
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCmdSetDepthBias2EXT = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkDepthBiasInfoEXT.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCmdSetDepthBiasEnable = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCmdSetDepthBounds = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_FLOAT,
            ValueLayout.JAVA_FLOAT
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCmdSetDepthBoundsTestEnable = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCmdSetDepthClampEnableEXT = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCmdSetDepthClampRangeEXT = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(VkDepthClampRangeEXT.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCmdSetDepthClipEnableEXT = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCmdSetDepthClipNegativeOneToOneEXT = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCmdSetDepthCompareOp = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCmdSetDepthTestEnable = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCmdSetDepthWriteEnable = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCmdSetDescriptorBufferOffsets2EXT = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkSetDescriptorBufferOffsetsInfoEXT.LAYOUT)
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

        public static final FunctionDescriptor DESCRIPTOR$vkCmdSetDeviceMask = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT
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

        public static final FunctionDescriptor DESCRIPTOR$vkCmdSetEvent = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCmdSetEvent2 = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkDependencyInfo.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCmdSetExclusiveScissorEnableNV = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCmdSetExclusiveScissorNV = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(VkRect2D.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCmdSetExtraPrimitiveOverestimationSizeEXT = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_FLOAT
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCmdSetFragmentShadingRateEnumNV = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCmdSetFragmentShadingRateKHR = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkExtent2D.LAYOUT),
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCmdSetFrontFace = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCmdSetLineRasterizationModeEXT = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCmdSetLineStipple = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_SHORT
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCmdSetLineStippleEnableEXT = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCmdSetLineWidth = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_FLOAT
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCmdSetLogicOpEXT = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCmdSetLogicOpEnableEXT = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCmdSetPatchControlPointsEXT = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCmdSetPerformanceMarkerINTEL = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkPerformanceMarkerInfoINTEL.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCmdSetPerformanceOverrideINTEL = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkPerformanceOverrideInfoINTEL.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCmdSetPerformanceStreamMarkerINTEL = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkPerformanceStreamMarkerInfoINTEL.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCmdSetPolygonModeEXT = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCmdSetPrimitiveRestartEnable = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCmdSetPrimitiveTopology = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCmdSetProvokingVertexModeEXT = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCmdSetRasterizationSamplesEXT = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCmdSetRasterizationStreamEXT = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCmdSetRasterizerDiscardEnable = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCmdSetRayTracingPipelineStackSizeKHR = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCmdSetRenderingAttachmentLocations = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkRenderingAttachmentLocationInfo.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCmdSetRenderingInputAttachmentIndices = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkRenderingInputAttachmentIndexInfo.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCmdSetRepresentativeFragmentTestEnableNV = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCmdSetSampleLocationsEXT = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkSampleLocationsInfoEXT.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCmdSetSampleLocationsEnableEXT = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCmdSetSampleMaskEXT = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCmdSetScissor = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(VkRect2D.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCmdSetScissorWithCount = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(VkRect2D.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCmdSetShadingRateImageEnableNV = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCmdSetStencilCompareMask = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
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

        public static final FunctionDescriptor DESCRIPTOR$vkCmdSetStencilReference = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCmdSetStencilTestEnable = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCmdSetStencilWriteMask = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCmdSetTessellationDomainOriginEXT = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCmdSetVertexInputEXT = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(VkVertexInputBindingDescription2EXT.LAYOUT),
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(VkVertexInputAttributeDescription2EXT.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCmdSetViewport = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(VkViewport.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCmdSetViewportShadingRatePaletteNV = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(VkShadingRatePaletteNV.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCmdSetViewportSwizzleNV = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(VkViewportSwizzleNV.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCmdSetViewportWScalingEnableNV = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCmdSetViewportWScalingNV = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(VkViewportWScalingNV.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCmdSetViewportWithCount = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(VkViewport.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCmdSubpassShadingHUAWEI = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCmdTraceRaysIndirect2KHR = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_LONG
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCmdTraceRaysIndirectKHR = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkStridedDeviceAddressRegionKHR.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(VkStridedDeviceAddressRegionKHR.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(VkStridedDeviceAddressRegionKHR.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(VkStridedDeviceAddressRegionKHR.LAYOUT),
            ValueLayout.JAVA_LONG
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

        public static final FunctionDescriptor DESCRIPTOR$vkCmdUpdateBuffer = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_LONG,
            ValueLayout.JAVA_LONG,
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCmdUpdatePipelineIndirectBufferNV = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS
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

        public static final FunctionDescriptor DESCRIPTOR$vkCmdWaitEvents2 = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS),
            ValueLayout.ADDRESS.withTargetLayout(VkDependencyInfo.LAYOUT)
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

        public static final FunctionDescriptor DESCRIPTOR$vkCmdWriteBufferMarker2AMD = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_LONG,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_LONG,
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCmdWriteBufferMarkerAMD = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_LONG,
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCmdWriteMicromapsPropertiesEXT = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS),
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCmdWriteTimestamp = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCmdWriteTimestamp2 = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_LONG,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCompileDeferredNV = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$vkConvertCooperativeVectorMatrixNV = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkConvertCooperativeVectorMatrixInfoNV.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCopyAccelerationStructureKHR = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkCopyAccelerationStructureInfoKHR.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCopyAccelerationStructureToMemoryKHR = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkCopyAccelerationStructureToMemoryInfoKHR.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCopyImageToImage = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkCopyImageToImageInfo.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCopyImageToMemory = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkCopyImageToMemoryInfo.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCopyMemoryToAccelerationStructureKHR = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkCopyMemoryToAccelerationStructureInfoKHR.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCopyMemoryToImage = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkCopyMemoryToImageInfo.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCopyMemoryToMicromapEXT = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkCopyMemoryToMicromapInfoEXT.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCopyMicromapEXT = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkCopyMicromapInfoEXT.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCopyMicromapToMemoryEXT = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkCopyMicromapToMemoryInfoEXT.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCreateAccelerationStructureKHR = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkAccelerationStructureCreateInfoKHR.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCreateAccelerationStructureNV = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkAccelerationStructureCreateInfoNV.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCreateBuffer = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkBufferCreateInfo.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCreateBufferCollectionFUCHSIA = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkBufferCollectionCreateInfoFUCHSIA.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCreateBufferView = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkBufferViewCreateInfo.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCreateCommandPool = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkCommandPoolCreateInfo.LAYOUT),
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

        public static final FunctionDescriptor DESCRIPTOR$vkCreateCuFunctionNVX = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkCuFunctionCreateInfoNVX.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCreateCuModuleNVX = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkCuModuleCreateInfoNVX.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCreateCudaFunctionNV = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkCudaFunctionCreateInfoNV.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCreateCudaModuleNV = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkCudaModuleCreateInfoNV.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCreateDeferredOperationKHR = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCreateDescriptorPool = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkDescriptorPoolCreateInfo.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCreateDescriptorSetLayout = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkDescriptorSetLayoutCreateInfo.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCreateDescriptorUpdateTemplate = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkDescriptorUpdateTemplateCreateInfo.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCreateEvent = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkEventCreateInfo.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
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

        public static final FunctionDescriptor DESCRIPTOR$vkCreateExternalComputeQueueNV = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkExternalComputeQueueCreateInfoNV.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCreateFence = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkFenceCreateInfo.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCreateFramebuffer = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkFramebufferCreateInfo.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
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

        public static final FunctionDescriptor DESCRIPTOR$vkCreateImage = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkImageCreateInfo.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCreateImageView = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkImageViewCreateInfo.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCreateIndirectCommandsLayoutEXT = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkIndirectCommandsLayoutCreateInfoEXT.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCreateIndirectCommandsLayoutNV = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkIndirectCommandsLayoutCreateInfoNV.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCreateIndirectExecutionSetEXT = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkIndirectExecutionSetCreateInfoEXT.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCreateMicromapEXT = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkMicromapCreateInfoEXT.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCreateOpticalFlowSessionNV = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkOpticalFlowSessionCreateInfoNV.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCreatePipelineBinariesKHR = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkPipelineBinaryCreateInfoKHR.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(VkPipelineBinaryHandlesInfoKHR.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCreatePipelineCache = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkPipelineCacheCreateInfo.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCreatePipelineLayout = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkPipelineLayoutCreateInfo.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCreatePrivateDataSlot = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkPrivateDataSlotCreateInfo.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCreateQueryPool = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkQueryPoolCreateInfo.LAYOUT),
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

        public static final FunctionDescriptor DESCRIPTOR$vkCreateRayTracingPipelinesNV = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(VkRayTracingPipelineCreateInfoNV.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCreateRenderPass = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkRenderPassCreateInfo.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCreateRenderPass2 = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkRenderPassCreateInfo2.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCreateSampler = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkSamplerCreateInfo.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCreateSamplerYcbcrConversion = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkSamplerYcbcrConversionCreateInfo.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCreateSemaphore = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkSemaphoreCreateInfo.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCreateSemaphoreSciSyncPoolNV = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkSemaphoreSciSyncPoolCreateInfoNV.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCreateShaderModule = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkShaderModuleCreateInfo.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCreateShadersEXT = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(VkShaderCreateInfoEXT.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT),
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

        public static final FunctionDescriptor DESCRIPTOR$vkCreateValidationCacheEXT = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkValidationCacheCreateInfoEXT.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCreateVideoSessionKHR = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkVideoSessionCreateInfoKHR.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkCreateVideoSessionParametersKHR = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkVideoSessionParametersCreateInfoKHR.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
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

        public static final FunctionDescriptor DESCRIPTOR$vkDeferredOperationJoinKHR = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS
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

        public static final FunctionDescriptor DESCRIPTOR$vkDestroyBuffer = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkDestroyBufferCollectionFUCHSIA = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkDestroyBufferView = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkDestroyCommandPool = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkDestroyCuFunctionNVX = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkDestroyCuModuleNVX = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkDestroyCudaFunctionNV = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkDestroyCudaModuleNV = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkDestroyDeferredOperationKHR = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkDestroyDescriptorPool = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkDestroyDescriptorSetLayout = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkDestroyDescriptorUpdateTemplate = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkDestroyDevice = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkDestroyEvent = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkDestroyExternalComputeQueueNV = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkDestroyFence = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkDestroyFramebuffer = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkDestroyImage = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkDestroyImageView = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkDestroyIndirectCommandsLayoutEXT = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkDestroyIndirectCommandsLayoutNV = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkDestroyIndirectExecutionSetEXT = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkDestroyMicromapEXT = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkDestroyOpticalFlowSessionNV = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkDestroyPipeline = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkDestroyPipelineBinaryKHR = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkDestroyPipelineCache = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkDestroyPipelineLayout = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkDestroyPrivateDataSlot = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkDestroyQueryPool = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkDestroyRenderPass = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkDestroySampler = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkDestroySamplerYcbcrConversion = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkDestroySemaphore = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkDestroySemaphoreSciSyncPoolNV = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkDestroyShaderEXT = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkDestroyShaderModule = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkDestroySwapchainKHR = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkDestroyValidationCacheEXT = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkDestroyVideoSessionKHR = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkDestroyVideoSessionParametersKHR = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkDeviceWaitIdle = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$vkDisplayPowerControlEXT = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkDisplayPowerInfoEXT.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkEndCommandBuffer = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$vkExportMetalObjectsEXT = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkExportMetalObjectsInfoEXT.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkFlushMappedMemoryRanges = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(VkMappedMemoryRange.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkFreeCommandBuffers = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkFreeDescriptorSets = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkFreeMemory = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkGetAccelerationStructureBuildSizesKHR = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(VkAccelerationStructureBuildGeometryInfoKHR.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(VkAccelerationStructureBuildSizesInfoKHR.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkGetAccelerationStructureDeviceAddressKHR = FunctionDescriptor.of(
            ValueLayout.JAVA_LONG,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkAccelerationStructureDeviceAddressInfoKHR.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkGetAccelerationStructureHandleNV = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            NativeLayout.C_SIZE_T,
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$vkGetAccelerationStructureMemoryRequirementsNV = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkAccelerationStructureMemoryRequirementsInfoNV.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(VkMemoryRequirements2.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkGetAccelerationStructureOpaqueCaptureDescriptorDataEXT = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkAccelerationStructureCaptureDescriptorDataInfoEXT.LAYOUT),
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$vkGetAndroidHardwareBufferPropertiesANDROID = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS),
            ValueLayout.ADDRESS.withTargetLayout(VkAndroidHardwareBufferPropertiesANDROID.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkGetBufferCollectionPropertiesFUCHSIA = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkBufferCollectionPropertiesFUCHSIA.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkGetBufferDeviceAddress = FunctionDescriptor.of(
            ValueLayout.JAVA_LONG,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkBufferDeviceAddressInfo.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkGetBufferMemoryRequirements = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkMemoryRequirements.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkGetBufferMemoryRequirements2 = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkBufferMemoryRequirementsInfo2.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(VkMemoryRequirements2.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkGetBufferOpaqueCaptureAddress = FunctionDescriptor.of(
            ValueLayout.JAVA_LONG,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkBufferDeviceAddressInfo.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkGetBufferOpaqueCaptureDescriptorDataEXT = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkBufferCaptureDescriptorDataInfoEXT.LAYOUT),
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$vkGetCalibratedTimestampsKHR = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(VkCalibratedTimestampInfoKHR.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_LONG),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_LONG)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkGetClusterAccelerationStructureBuildSizesNV = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkClusterAccelerationStructureInputInfoNV.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(VkAccelerationStructureBuildSizesInfoKHR.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkGetCudaModuleCacheNV = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(NativeLayout.C_SIZE_T),
            ValueLayout.ADDRESS
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

        public static final FunctionDescriptor DESCRIPTOR$vkGetDescriptorEXT = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkDescriptorGetInfoEXT.LAYOUT),
            NativeLayout.C_SIZE_T,
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$vkGetDescriptorSetHostMappingVALVE = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkGetDescriptorSetLayoutBindingOffsetEXT = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_LONG)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkGetDescriptorSetLayoutHostMappingInfoVALVE = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkDescriptorSetBindingReferenceVALVE.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(VkDescriptorSetLayoutHostMappingInfoVALVE.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkGetDescriptorSetLayoutSizeEXT = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_LONG)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkGetDescriptorSetLayoutSupport = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkDescriptorSetLayoutCreateInfo.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(VkDescriptorSetLayoutSupport.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkGetDeviceAccelerationStructureCompatibilityKHR = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkAccelerationStructureVersionInfoKHR.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkGetDeviceBufferMemoryRequirements = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkDeviceBufferMemoryRequirements.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(VkMemoryRequirements2.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkGetDeviceFaultInfoEXT = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkDeviceFaultCountsEXT.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(VkDeviceFaultInfoEXT.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkGetDeviceGroupPeerMemoryFeatures = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkGetDeviceGroupPresentCapabilitiesKHR = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkDeviceGroupPresentCapabilitiesKHR.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkGetDeviceGroupSurfacePresentModes2EXT = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkPhysicalDeviceSurfaceInfo2KHR.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkGetDeviceGroupSurfacePresentModesKHR = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
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

        public static final FunctionDescriptor DESCRIPTOR$vkGetDeviceImageSubresourceLayout = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkDeviceImageSubresourceInfo.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(VkSubresourceLayout2.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkGetDeviceMemoryCommitment = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_LONG)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkGetDeviceMemoryOpaqueCaptureAddress = FunctionDescriptor.of(
            ValueLayout.JAVA_LONG,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkDeviceMemoryOpaqueCaptureAddressInfo.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkGetDeviceMicromapCompatibilityEXT = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkMicromapVersionInfoEXT.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkGetDeviceQueue = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkGetDeviceQueue2 = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkDeviceQueueInfo2.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkGetDeviceSubpassShadingMaxWorkgroupSizeHUAWEI = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkExtent2D.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkGetDynamicRenderingTilePropertiesQCOM = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkRenderingInfo.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(VkTilePropertiesQCOM.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkGetEncodedVideoSessionParametersKHR = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkVideoEncodeSessionParametersGetInfoKHR.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(VkVideoEncodeSessionParametersFeedbackInfoKHR.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(NativeLayout.C_SIZE_T),
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$vkGetEventStatus = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$vkGetExecutionGraphPipelineNodeIndexAMDX = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkPipelineShaderStageNodeCreateInfoAMDX.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkGetExecutionGraphPipelineScratchSizeAMDX = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkExecutionGraphPipelineScratchSizeAMDX.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkGetExternalComputeQueueDataNV = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkExternalComputeQueueDataParamsNV.LAYOUT),
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$vkGetFenceFdKHR = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkFenceGetFdInfoKHR.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
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

        public static final FunctionDescriptor DESCRIPTOR$vkGetFenceStatus = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$vkGetFenceWin32HandleKHR = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkFenceGetWin32HandleInfoKHR.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkGetFramebufferTilePropertiesQCOM = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(VkTilePropertiesQCOM.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkGetGeneratedCommandsMemoryRequirementsEXT = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkGeneratedCommandsMemoryRequirementsInfoEXT.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(VkMemoryRequirements2.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkGetGeneratedCommandsMemoryRequirementsNV = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkGeneratedCommandsMemoryRequirementsInfoNV.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(VkMemoryRequirements2.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkGetImageDrmFormatModifierPropertiesEXT = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkImageDrmFormatModifierPropertiesEXT.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkGetImageMemoryRequirements = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkMemoryRequirements.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkGetImageMemoryRequirements2 = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkImageMemoryRequirementsInfo2.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(VkMemoryRequirements2.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkGetImageOpaqueCaptureDescriptorDataEXT = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkImageCaptureDescriptorDataInfoEXT.LAYOUT),
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$vkGetImageSparseMemoryRequirements = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(VkSparseImageMemoryRequirements.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkGetImageSparseMemoryRequirements2 = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkImageSparseMemoryRequirementsInfo2.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(VkSparseImageMemoryRequirements2.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkGetImageSubresourceLayout = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkImageSubresource.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(VkSubresourceLayout.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkGetImageSubresourceLayout2 = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkImageSubresource2.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(VkSubresourceLayout2.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkGetImageViewAddressNVX = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkImageViewAddressPropertiesNVX.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkGetImageViewHandle64NVX = FunctionDescriptor.of(
            ValueLayout.JAVA_LONG,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkImageViewHandleInfoNVX.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkGetImageViewHandleNVX = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkImageViewHandleInfoNVX.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkGetImageViewOpaqueCaptureDescriptorDataEXT = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkImageViewCaptureDescriptorDataInfoEXT.LAYOUT),
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$vkGetLatencyTimingsNV = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkGetLatencyMarkerInfoNV.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkGetMemoryAndroidHardwareBufferANDROID = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkMemoryGetAndroidHardwareBufferInfoANDROID.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS))
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

        public static final FunctionDescriptor DESCRIPTOR$vkGetMemoryHostPointerPropertiesEXT = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkMemoryHostPointerPropertiesEXT.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkGetMemoryMetalHandleEXT = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkMemoryGetMetalHandleInfoEXT.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkGetMemoryMetalHandlePropertiesEXT = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkMemoryMetalHandlePropertiesEXT.LAYOUT)
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

        public static final FunctionDescriptor DESCRIPTOR$vkGetMemoryWin32HandleKHR = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkMemoryGetWin32HandleInfoKHR.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkGetMemoryWin32HandleNV = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkGetMemoryWin32HandlePropertiesKHR = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkMemoryWin32HandlePropertiesKHR.LAYOUT)
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

        public static final FunctionDescriptor DESCRIPTOR$vkGetMicromapBuildSizesEXT = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(VkMicromapBuildInfoEXT.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(VkMicromapBuildSizesInfoEXT.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkGetPartitionedAccelerationStructuresBuildSizesNV = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkPartitionedAccelerationStructureInstancesInputNV.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(VkAccelerationStructureBuildSizesInfoKHR.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkGetPastPresentationTimingGOOGLE = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(VkPastPresentationTimingGOOGLE.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkGetPerformanceParameterINTEL = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(VkPerformanceValueINTEL.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkGetPipelineBinaryDataKHR = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkPipelineBinaryDataInfoKHR.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(VkPipelineBinaryKeyKHR.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(NativeLayout.C_SIZE_T),
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$vkGetPipelineCacheData = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(NativeLayout.C_SIZE_T),
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$vkGetPipelineExecutableInternalRepresentationsKHR = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkPipelineExecutableInfoKHR.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(VkPipelineExecutableInternalRepresentationKHR.LAYOUT)
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

        public static final FunctionDescriptor DESCRIPTOR$vkGetPipelineIndirectDeviceAddressNV = FunctionDescriptor.of(
            ValueLayout.JAVA_LONG,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkPipelineIndirectDeviceAddressInfoNV.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkGetPipelineIndirectMemoryRequirementsNV = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkComputePipelineCreateInfo.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(VkMemoryRequirements2.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkGetPipelineKeyKHR = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkPipelineCreateInfoKHR.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(VkPipelineBinaryKeyKHR.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkGetPipelinePropertiesEXT = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkPipelineInfoKHR.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(VkBaseOutStructure.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkGetPrivateData = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_LONG,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_LONG)
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

        public static final FunctionDescriptor DESCRIPTOR$vkGetQueueCheckpointData2NV = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(VkCheckpointData2NV.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkGetQueueCheckpointDataNV = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(VkCheckpointDataNV.LAYOUT)
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

        public static final FunctionDescriptor DESCRIPTOR$vkGetRayTracingShaderGroupHandlesKHR = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            NativeLayout.C_SIZE_T,
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$vkGetRayTracingShaderGroupStackSizeKHR = FunctionDescriptor.of(
            ValueLayout.JAVA_LONG,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$vkGetRefreshCycleDurationGOOGLE = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkRefreshCycleDurationGOOGLE.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkGetRenderAreaGranularity = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkExtent2D.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkGetRenderingAreaGranularity = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkRenderingAreaInfo.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(VkExtent2D.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkGetSamplerOpaqueCaptureDescriptorDataEXT = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkSamplerCaptureDescriptorDataInfoEXT.LAYOUT),
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$vkGetScreenBufferPropertiesQNX = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS),
            ValueLayout.ADDRESS.withTargetLayout(VkScreenBufferPropertiesQNX.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkGetSemaphoreCounterValue = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_LONG)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkGetSemaphoreFdKHR = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkSemaphoreGetFdInfoKHR.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkGetSemaphoreSciSyncObjNV = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkSemaphoreGetSciSyncInfoNV.LAYOUT),
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$vkGetSemaphoreWin32HandleKHR = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkSemaphoreGetWin32HandleInfoKHR.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkGetSemaphoreZirconHandleFUCHSIA = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkSemaphoreGetZirconHandleInfoFUCHSIA.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkGetShaderBinaryDataEXT = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(NativeLayout.C_SIZE_T),
            ValueLayout.ADDRESS
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

        public static final FunctionDescriptor DESCRIPTOR$vkGetShaderModuleCreateInfoIdentifierEXT = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkShaderModuleCreateInfo.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(VkShaderModuleIdentifierEXT.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkGetShaderModuleIdentifierEXT = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkShaderModuleIdentifierEXT.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkGetSwapchainCounterEXT = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_LONG)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkGetSwapchainImagesKHR = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkGetSwapchainStatusKHR = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$vkGetValidationCacheDataEXT = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(NativeLayout.C_SIZE_T),
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$vkGetVideoSessionMemoryRequirementsKHR = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(VkVideoSessionMemoryRequirementsKHR.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkImportFenceFdKHR = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkImportFenceFdInfoKHR.LAYOUT)
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

        public static final FunctionDescriptor DESCRIPTOR$vkImportFenceWin32HandleKHR = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkImportFenceWin32HandleInfoKHR.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkImportSemaphoreFdKHR = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkImportSemaphoreFdInfoKHR.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkImportSemaphoreSciSyncObjNV = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkImportSemaphoreSciSyncInfoNV.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkImportSemaphoreWin32HandleKHR = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkImportSemaphoreWin32HandleInfoKHR.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkImportSemaphoreZirconHandleFUCHSIA = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkImportSemaphoreZirconHandleInfoFUCHSIA.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkInitializePerformanceApiINTEL = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkInitializePerformanceApiInfoINTEL.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkInvalidateMappedMemoryRanges = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(VkMappedMemoryRange.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkLatencySleepNV = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkLatencySleepInfoNV.LAYOUT)
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

        public static final FunctionDescriptor DESCRIPTOR$vkMapMemory2 = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkMemoryMapInfo.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkMergePipelineCaches = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkMergeValidationCachesEXT = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkQueueBindSparse = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(VkBindSparseInfo.LAYOUT),
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$vkQueueNotifyOutOfBandNV = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkOutOfBandQueueTypeInfoNV.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkQueuePresentKHR = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkPresentInfoKHR.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkQueueSetPerformanceConfigurationINTEL = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$vkQueueSubmit = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(VkSubmitInfo.LAYOUT),
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$vkQueueSubmit2 = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(VkSubmitInfo2.LAYOUT),
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$vkQueueWaitIdle = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS
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

        public static final FunctionDescriptor DESCRIPTOR$vkReleaseCapturedPipelineDataKHR = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkReleaseCapturedPipelineDataInfoKHR.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkReleaseFullScreenExclusiveModeEXT = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$vkReleasePerformanceConfigurationINTEL = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$vkReleaseProfilingLockKHR = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$vkReleaseSwapchainImagesEXT = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkReleaseSwapchainImagesInfoEXT.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkResetCommandBuffer = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$vkResetCommandPool = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$vkResetDescriptorPool = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$vkResetEvent = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$vkResetFences = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkResetQueryPool = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT
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

        public static final FunctionDescriptor DESCRIPTOR$vkSetDeviceMemoryPriorityEXT = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_FLOAT
        );

        public static final FunctionDescriptor DESCRIPTOR$vkSetEvent = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$vkSetHdrMetadataEXT = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS),
            ValueLayout.ADDRESS.withTargetLayout(VkHdrMetadataEXT.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkSetLatencyMarkerNV = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkSetLatencyMarkerInfoNV.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkSetLatencySleepModeNV = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkLatencySleepModeInfoNV.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkSetLocalDimmingAMD = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$vkSetPrivateData = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_LONG,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_LONG
        );

        public static final FunctionDescriptor DESCRIPTOR$vkSignalSemaphore = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkSemaphoreSignalInfo.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkTransitionImageLayout = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(VkHostImageLayoutTransitionInfo.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkTrimCommandPool = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$vkUninitializePerformanceApiINTEL = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$vkUnmapMemory = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$vkUnmapMemory2 = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkMemoryUnmapInfo.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkUpdateDescriptorSetWithTemplate = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$vkUpdateDescriptorSets = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(VkWriteDescriptorSet.LAYOUT),
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(VkCopyDescriptorSet.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkUpdateIndirectExecutionSetPipelineEXT = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(VkWriteIndirectExecutionSetPipelineEXT.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkUpdateIndirectExecutionSetShaderEXT = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(VkWriteIndirectExecutionSetShaderEXT.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkUpdateVideoSessionParametersKHR = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkVideoSessionParametersUpdateInfoKHR.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$vkWaitForFences = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS),
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_LONG
        );

        public static final FunctionDescriptor DESCRIPTOR$vkWaitForPresentKHR = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_LONG,
            ValueLayout.JAVA_LONG
        );

        public static final FunctionDescriptor DESCRIPTOR$vkWaitSemaphores = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkSemaphoreWaitInfo.LAYOUT),
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

        /// Constructing this class is nonsense so the constructor is made private.
        private Descriptors() {}
    }
}
