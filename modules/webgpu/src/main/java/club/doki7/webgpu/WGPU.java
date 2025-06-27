package club.doki7.webgpu;

import java.lang.foreign.*;
import java.lang.invoke.MethodHandle;
import java.util.Objects;

import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import club.doki7.ffm.NativeLayout;
import club.doki7.ffm.RawFunctionLoader;
import club.doki7.ffm.annotation.*;
import club.doki7.ffm.ptr.*;
import club.doki7.webgpu.bitmask.*;
import club.doki7.webgpu.datatype.*;
import club.doki7.webgpu.enumtype.*;
import club.doki7.webgpu.handle.*;

public final class WGPU implements WGPUConstants {
    public WGPU(RawFunctionLoader loader) {
        SEGMENT$wgpuAdapterAddRef = loader.apply("wgpuAdapterAddRef");
        HANDLE$wgpuAdapterAddRef = RawFunctionLoader.link(SEGMENT$wgpuAdapterAddRef, Descriptors.DESCRIPTOR$wgpuAdapterAddRef);
        SEGMENT$wgpuAdapterGetFeatures = loader.apply("wgpuAdapterGetFeatures");
        HANDLE$wgpuAdapterGetFeatures = RawFunctionLoader.link(SEGMENT$wgpuAdapterGetFeatures, Descriptors.DESCRIPTOR$wgpuAdapterGetFeatures);
        SEGMENT$wgpuAdapterGetInfo = loader.apply("wgpuAdapterGetInfo");
        HANDLE$wgpuAdapterGetInfo = RawFunctionLoader.link(SEGMENT$wgpuAdapterGetInfo, Descriptors.DESCRIPTOR$wgpuAdapterGetInfo);
        SEGMENT$wgpuAdapterGetLimits = loader.apply("wgpuAdapterGetLimits");
        HANDLE$wgpuAdapterGetLimits = RawFunctionLoader.link(SEGMENT$wgpuAdapterGetLimits, Descriptors.DESCRIPTOR$wgpuAdapterGetLimits);
        SEGMENT$wgpuAdapterHasFeature = loader.apply("wgpuAdapterHasFeature");
        HANDLE$wgpuAdapterHasFeature = RawFunctionLoader.link(SEGMENT$wgpuAdapterHasFeature, Descriptors.DESCRIPTOR$wgpuAdapterHasFeature);
        SEGMENT$wgpuAdapterRelease = loader.apply("wgpuAdapterRelease");
        HANDLE$wgpuAdapterRelease = RawFunctionLoader.link(SEGMENT$wgpuAdapterRelease, Descriptors.DESCRIPTOR$wgpuAdapterRelease);
        SEGMENT$wgpuAdapterRequestDevice = loader.apply("wgpuAdapterRequestDevice");
        HANDLE$wgpuAdapterRequestDevice = RawFunctionLoader.link(SEGMENT$wgpuAdapterRequestDevice, Descriptors.DESCRIPTOR$wgpuAdapterRequestDevice);
        SEGMENT$wgpuBindGroupAddRef = loader.apply("wgpuBindGroupAddRef");
        HANDLE$wgpuBindGroupAddRef = RawFunctionLoader.link(SEGMENT$wgpuBindGroupAddRef, Descriptors.DESCRIPTOR$wgpuBindGroupAddRef);
        SEGMENT$wgpuBindGroupLayoutAddRef = loader.apply("wgpuBindGroupLayoutAddRef");
        HANDLE$wgpuBindGroupLayoutAddRef = RawFunctionLoader.link(SEGMENT$wgpuBindGroupLayoutAddRef, Descriptors.DESCRIPTOR$wgpuBindGroupLayoutAddRef);
        SEGMENT$wgpuBindGroupLayoutRelease = loader.apply("wgpuBindGroupLayoutRelease");
        HANDLE$wgpuBindGroupLayoutRelease = RawFunctionLoader.link(SEGMENT$wgpuBindGroupLayoutRelease, Descriptors.DESCRIPTOR$wgpuBindGroupLayoutRelease);
        SEGMENT$wgpuBindGroupLayoutSetLabel = loader.apply("wgpuBindGroupLayoutSetLabel");
        HANDLE$wgpuBindGroupLayoutSetLabel = RawFunctionLoader.link(SEGMENT$wgpuBindGroupLayoutSetLabel, Descriptors.DESCRIPTOR$wgpuBindGroupLayoutSetLabel);
        SEGMENT$wgpuBindGroupRelease = loader.apply("wgpuBindGroupRelease");
        HANDLE$wgpuBindGroupRelease = RawFunctionLoader.link(SEGMENT$wgpuBindGroupRelease, Descriptors.DESCRIPTOR$wgpuBindGroupRelease);
        SEGMENT$wgpuBindGroupSetLabel = loader.apply("wgpuBindGroupSetLabel");
        HANDLE$wgpuBindGroupSetLabel = RawFunctionLoader.link(SEGMENT$wgpuBindGroupSetLabel, Descriptors.DESCRIPTOR$wgpuBindGroupSetLabel);
        SEGMENT$wgpuBufferAddRef = loader.apply("wgpuBufferAddRef");
        HANDLE$wgpuBufferAddRef = RawFunctionLoader.link(SEGMENT$wgpuBufferAddRef, Descriptors.DESCRIPTOR$wgpuBufferAddRef);
        SEGMENT$wgpuBufferDestroy = loader.apply("wgpuBufferDestroy");
        HANDLE$wgpuBufferDestroy = RawFunctionLoader.link(SEGMENT$wgpuBufferDestroy, Descriptors.DESCRIPTOR$wgpuBufferDestroy);
        SEGMENT$wgpuBufferGetConstMappedRange = loader.apply("wgpuBufferGetConstMappedRange");
        HANDLE$wgpuBufferGetConstMappedRange = RawFunctionLoader.link(SEGMENT$wgpuBufferGetConstMappedRange, Descriptors.DESCRIPTOR$wgpuBufferGetConstMappedRange);
        SEGMENT$wgpuBufferGetMapState = loader.apply("wgpuBufferGetMapState");
        HANDLE$wgpuBufferGetMapState = RawFunctionLoader.link(SEGMENT$wgpuBufferGetMapState, Descriptors.DESCRIPTOR$wgpuBufferGetMapState);
        SEGMENT$wgpuBufferGetMappedRange = loader.apply("wgpuBufferGetMappedRange");
        HANDLE$wgpuBufferGetMappedRange = RawFunctionLoader.link(SEGMENT$wgpuBufferGetMappedRange, Descriptors.DESCRIPTOR$wgpuBufferGetMappedRange);
        SEGMENT$wgpuBufferGetSize = loader.apply("wgpuBufferGetSize");
        HANDLE$wgpuBufferGetSize = RawFunctionLoader.link(SEGMENT$wgpuBufferGetSize, Descriptors.DESCRIPTOR$wgpuBufferGetSize);
        SEGMENT$wgpuBufferGetUsage = loader.apply("wgpuBufferGetUsage");
        HANDLE$wgpuBufferGetUsage = RawFunctionLoader.link(SEGMENT$wgpuBufferGetUsage, Descriptors.DESCRIPTOR$wgpuBufferGetUsage);
        SEGMENT$wgpuBufferMapAsync = loader.apply("wgpuBufferMapAsync");
        HANDLE$wgpuBufferMapAsync = RawFunctionLoader.link(SEGMENT$wgpuBufferMapAsync, Descriptors.DESCRIPTOR$wgpuBufferMapAsync);
        SEGMENT$wgpuBufferRelease = loader.apply("wgpuBufferRelease");
        HANDLE$wgpuBufferRelease = RawFunctionLoader.link(SEGMENT$wgpuBufferRelease, Descriptors.DESCRIPTOR$wgpuBufferRelease);
        SEGMENT$wgpuBufferSetLabel = loader.apply("wgpuBufferSetLabel");
        HANDLE$wgpuBufferSetLabel = RawFunctionLoader.link(SEGMENT$wgpuBufferSetLabel, Descriptors.DESCRIPTOR$wgpuBufferSetLabel);
        SEGMENT$wgpuBufferUnmap = loader.apply("wgpuBufferUnmap");
        HANDLE$wgpuBufferUnmap = RawFunctionLoader.link(SEGMENT$wgpuBufferUnmap, Descriptors.DESCRIPTOR$wgpuBufferUnmap);
        SEGMENT$wgpuCommandBufferAddRef = loader.apply("wgpuCommandBufferAddRef");
        HANDLE$wgpuCommandBufferAddRef = RawFunctionLoader.link(SEGMENT$wgpuCommandBufferAddRef, Descriptors.DESCRIPTOR$wgpuCommandBufferAddRef);
        SEGMENT$wgpuCommandBufferRelease = loader.apply("wgpuCommandBufferRelease");
        HANDLE$wgpuCommandBufferRelease = RawFunctionLoader.link(SEGMENT$wgpuCommandBufferRelease, Descriptors.DESCRIPTOR$wgpuCommandBufferRelease);
        SEGMENT$wgpuCommandBufferSetLabel = loader.apply("wgpuCommandBufferSetLabel");
        HANDLE$wgpuCommandBufferSetLabel = RawFunctionLoader.link(SEGMENT$wgpuCommandBufferSetLabel, Descriptors.DESCRIPTOR$wgpuCommandBufferSetLabel);
        SEGMENT$wgpuCommandEncoderAddRef = loader.apply("wgpuCommandEncoderAddRef");
        HANDLE$wgpuCommandEncoderAddRef = RawFunctionLoader.link(SEGMENT$wgpuCommandEncoderAddRef, Descriptors.DESCRIPTOR$wgpuCommandEncoderAddRef);
        SEGMENT$wgpuCommandEncoderBeginComputePass = loader.apply("wgpuCommandEncoderBeginComputePass");
        HANDLE$wgpuCommandEncoderBeginComputePass = RawFunctionLoader.link(SEGMENT$wgpuCommandEncoderBeginComputePass, Descriptors.DESCRIPTOR$wgpuCommandEncoderBeginComputePass);
        SEGMENT$wgpuCommandEncoderBeginRenderPass = loader.apply("wgpuCommandEncoderBeginRenderPass");
        HANDLE$wgpuCommandEncoderBeginRenderPass = RawFunctionLoader.link(SEGMENT$wgpuCommandEncoderBeginRenderPass, Descriptors.DESCRIPTOR$wgpuCommandEncoderBeginRenderPass);
        SEGMENT$wgpuCommandEncoderClearBuffer = loader.apply("wgpuCommandEncoderClearBuffer");
        HANDLE$wgpuCommandEncoderClearBuffer = RawFunctionLoader.link(SEGMENT$wgpuCommandEncoderClearBuffer, Descriptors.DESCRIPTOR$wgpuCommandEncoderClearBuffer);
        SEGMENT$wgpuCommandEncoderCopyBufferToBuffer = loader.apply("wgpuCommandEncoderCopyBufferToBuffer");
        HANDLE$wgpuCommandEncoderCopyBufferToBuffer = RawFunctionLoader.link(SEGMENT$wgpuCommandEncoderCopyBufferToBuffer, Descriptors.DESCRIPTOR$wgpuCommandEncoderCopyBufferToBuffer);
        SEGMENT$wgpuCommandEncoderCopyBufferToTexture = loader.apply("wgpuCommandEncoderCopyBufferToTexture");
        HANDLE$wgpuCommandEncoderCopyBufferToTexture = RawFunctionLoader.link(SEGMENT$wgpuCommandEncoderCopyBufferToTexture, Descriptors.DESCRIPTOR$wgpuCommandEncoderCopyBufferToTexture);
        SEGMENT$wgpuCommandEncoderCopyTextureToBuffer = loader.apply("wgpuCommandEncoderCopyTextureToBuffer");
        HANDLE$wgpuCommandEncoderCopyTextureToBuffer = RawFunctionLoader.link(SEGMENT$wgpuCommandEncoderCopyTextureToBuffer, Descriptors.DESCRIPTOR$wgpuCommandEncoderCopyTextureToBuffer);
        SEGMENT$wgpuCommandEncoderCopyTextureToTexture = loader.apply("wgpuCommandEncoderCopyTextureToTexture");
        HANDLE$wgpuCommandEncoderCopyTextureToTexture = RawFunctionLoader.link(SEGMENT$wgpuCommandEncoderCopyTextureToTexture, Descriptors.DESCRIPTOR$wgpuCommandEncoderCopyTextureToTexture);
        SEGMENT$wgpuCommandEncoderFinish = loader.apply("wgpuCommandEncoderFinish");
        HANDLE$wgpuCommandEncoderFinish = RawFunctionLoader.link(SEGMENT$wgpuCommandEncoderFinish, Descriptors.DESCRIPTOR$wgpuCommandEncoderFinish);
        SEGMENT$wgpuCommandEncoderInsertDebugMarker = loader.apply("wgpuCommandEncoderInsertDebugMarker");
        HANDLE$wgpuCommandEncoderInsertDebugMarker = RawFunctionLoader.link(SEGMENT$wgpuCommandEncoderInsertDebugMarker, Descriptors.DESCRIPTOR$wgpuCommandEncoderInsertDebugMarker);
        SEGMENT$wgpuCommandEncoderPopDebugGroup = loader.apply("wgpuCommandEncoderPopDebugGroup");
        HANDLE$wgpuCommandEncoderPopDebugGroup = RawFunctionLoader.link(SEGMENT$wgpuCommandEncoderPopDebugGroup, Descriptors.DESCRIPTOR$wgpuCommandEncoderPopDebugGroup);
        SEGMENT$wgpuCommandEncoderPushDebugGroup = loader.apply("wgpuCommandEncoderPushDebugGroup");
        HANDLE$wgpuCommandEncoderPushDebugGroup = RawFunctionLoader.link(SEGMENT$wgpuCommandEncoderPushDebugGroup, Descriptors.DESCRIPTOR$wgpuCommandEncoderPushDebugGroup);
        SEGMENT$wgpuCommandEncoderRelease = loader.apply("wgpuCommandEncoderRelease");
        HANDLE$wgpuCommandEncoderRelease = RawFunctionLoader.link(SEGMENT$wgpuCommandEncoderRelease, Descriptors.DESCRIPTOR$wgpuCommandEncoderRelease);
        SEGMENT$wgpuCommandEncoderResolveQuerySet = loader.apply("wgpuCommandEncoderResolveQuerySet");
        HANDLE$wgpuCommandEncoderResolveQuerySet = RawFunctionLoader.link(SEGMENT$wgpuCommandEncoderResolveQuerySet, Descriptors.DESCRIPTOR$wgpuCommandEncoderResolveQuerySet);
        SEGMENT$wgpuCommandEncoderSetLabel = loader.apply("wgpuCommandEncoderSetLabel");
        HANDLE$wgpuCommandEncoderSetLabel = RawFunctionLoader.link(SEGMENT$wgpuCommandEncoderSetLabel, Descriptors.DESCRIPTOR$wgpuCommandEncoderSetLabel);
        SEGMENT$wgpuCommandEncoderWriteTimestamp = loader.apply("wgpuCommandEncoderWriteTimestamp");
        HANDLE$wgpuCommandEncoderWriteTimestamp = RawFunctionLoader.link(SEGMENT$wgpuCommandEncoderWriteTimestamp, Descriptors.DESCRIPTOR$wgpuCommandEncoderWriteTimestamp);
        SEGMENT$wgpuComputePassEncoderAddRef = loader.apply("wgpuComputePassEncoderAddRef");
        HANDLE$wgpuComputePassEncoderAddRef = RawFunctionLoader.link(SEGMENT$wgpuComputePassEncoderAddRef, Descriptors.DESCRIPTOR$wgpuComputePassEncoderAddRef);
        SEGMENT$wgpuComputePassEncoderDispatchWorkgroups = loader.apply("wgpuComputePassEncoderDispatchWorkgroups");
        HANDLE$wgpuComputePassEncoderDispatchWorkgroups = RawFunctionLoader.link(SEGMENT$wgpuComputePassEncoderDispatchWorkgroups, Descriptors.DESCRIPTOR$wgpuComputePassEncoderDispatchWorkgroups);
        SEGMENT$wgpuComputePassEncoderDispatchWorkgroupsIndirect = loader.apply("wgpuComputePassEncoderDispatchWorkgroupsIndirect");
        HANDLE$wgpuComputePassEncoderDispatchWorkgroupsIndirect = RawFunctionLoader.link(SEGMENT$wgpuComputePassEncoderDispatchWorkgroupsIndirect, Descriptors.DESCRIPTOR$wgpuComputePassEncoderDispatchWorkgroupsIndirect);
        SEGMENT$wgpuComputePassEncoderEnd = loader.apply("wgpuComputePassEncoderEnd");
        HANDLE$wgpuComputePassEncoderEnd = RawFunctionLoader.link(SEGMENT$wgpuComputePassEncoderEnd, Descriptors.DESCRIPTOR$wgpuComputePassEncoderEnd);
        SEGMENT$wgpuComputePassEncoderInsertDebugMarker = loader.apply("wgpuComputePassEncoderInsertDebugMarker");
        HANDLE$wgpuComputePassEncoderInsertDebugMarker = RawFunctionLoader.link(SEGMENT$wgpuComputePassEncoderInsertDebugMarker, Descriptors.DESCRIPTOR$wgpuComputePassEncoderInsertDebugMarker);
        SEGMENT$wgpuComputePassEncoderPopDebugGroup = loader.apply("wgpuComputePassEncoderPopDebugGroup");
        HANDLE$wgpuComputePassEncoderPopDebugGroup = RawFunctionLoader.link(SEGMENT$wgpuComputePassEncoderPopDebugGroup, Descriptors.DESCRIPTOR$wgpuComputePassEncoderPopDebugGroup);
        SEGMENT$wgpuComputePassEncoderPushDebugGroup = loader.apply("wgpuComputePassEncoderPushDebugGroup");
        HANDLE$wgpuComputePassEncoderPushDebugGroup = RawFunctionLoader.link(SEGMENT$wgpuComputePassEncoderPushDebugGroup, Descriptors.DESCRIPTOR$wgpuComputePassEncoderPushDebugGroup);
        SEGMENT$wgpuComputePassEncoderRelease = loader.apply("wgpuComputePassEncoderRelease");
        HANDLE$wgpuComputePassEncoderRelease = RawFunctionLoader.link(SEGMENT$wgpuComputePassEncoderRelease, Descriptors.DESCRIPTOR$wgpuComputePassEncoderRelease);
        SEGMENT$wgpuComputePassEncoderSetBindGroup = loader.apply("wgpuComputePassEncoderSetBindGroup");
        HANDLE$wgpuComputePassEncoderSetBindGroup = RawFunctionLoader.link(SEGMENT$wgpuComputePassEncoderSetBindGroup, Descriptors.DESCRIPTOR$wgpuComputePassEncoderSetBindGroup);
        SEGMENT$wgpuComputePassEncoderSetLabel = loader.apply("wgpuComputePassEncoderSetLabel");
        HANDLE$wgpuComputePassEncoderSetLabel = RawFunctionLoader.link(SEGMENT$wgpuComputePassEncoderSetLabel, Descriptors.DESCRIPTOR$wgpuComputePassEncoderSetLabel);
        SEGMENT$wgpuComputePassEncoderSetPipeline = loader.apply("wgpuComputePassEncoderSetPipeline");
        HANDLE$wgpuComputePassEncoderSetPipeline = RawFunctionLoader.link(SEGMENT$wgpuComputePassEncoderSetPipeline, Descriptors.DESCRIPTOR$wgpuComputePassEncoderSetPipeline);
        SEGMENT$wgpuComputePipelineAddRef = loader.apply("wgpuComputePipelineAddRef");
        HANDLE$wgpuComputePipelineAddRef = RawFunctionLoader.link(SEGMENT$wgpuComputePipelineAddRef, Descriptors.DESCRIPTOR$wgpuComputePipelineAddRef);
        SEGMENT$wgpuComputePipelineGetBindGroupLayout = loader.apply("wgpuComputePipelineGetBindGroupLayout");
        HANDLE$wgpuComputePipelineGetBindGroupLayout = RawFunctionLoader.link(SEGMENT$wgpuComputePipelineGetBindGroupLayout, Descriptors.DESCRIPTOR$wgpuComputePipelineGetBindGroupLayout);
        SEGMENT$wgpuComputePipelineRelease = loader.apply("wgpuComputePipelineRelease");
        HANDLE$wgpuComputePipelineRelease = RawFunctionLoader.link(SEGMENT$wgpuComputePipelineRelease, Descriptors.DESCRIPTOR$wgpuComputePipelineRelease);
        SEGMENT$wgpuComputePipelineSetLabel = loader.apply("wgpuComputePipelineSetLabel");
        HANDLE$wgpuComputePipelineSetLabel = RawFunctionLoader.link(SEGMENT$wgpuComputePipelineSetLabel, Descriptors.DESCRIPTOR$wgpuComputePipelineSetLabel);
        SEGMENT$wgpuCreateInstance = loader.apply("wgpuCreateInstance");
        HANDLE$wgpuCreateInstance = RawFunctionLoader.link(SEGMENT$wgpuCreateInstance, Descriptors.DESCRIPTOR$wgpuCreateInstance);
        SEGMENT$wgpuDeviceAddRef = loader.apply("wgpuDeviceAddRef");
        HANDLE$wgpuDeviceAddRef = RawFunctionLoader.link(SEGMENT$wgpuDeviceAddRef, Descriptors.DESCRIPTOR$wgpuDeviceAddRef);
        SEGMENT$wgpuDeviceCreateBindGroup = loader.apply("wgpuDeviceCreateBindGroup");
        HANDLE$wgpuDeviceCreateBindGroup = RawFunctionLoader.link(SEGMENT$wgpuDeviceCreateBindGroup, Descriptors.DESCRIPTOR$wgpuDeviceCreateBindGroup);
        SEGMENT$wgpuDeviceCreateBindGroupLayout = loader.apply("wgpuDeviceCreateBindGroupLayout");
        HANDLE$wgpuDeviceCreateBindGroupLayout = RawFunctionLoader.link(SEGMENT$wgpuDeviceCreateBindGroupLayout, Descriptors.DESCRIPTOR$wgpuDeviceCreateBindGroupLayout);
        SEGMENT$wgpuDeviceCreateBuffer = loader.apply("wgpuDeviceCreateBuffer");
        HANDLE$wgpuDeviceCreateBuffer = RawFunctionLoader.link(SEGMENT$wgpuDeviceCreateBuffer, Descriptors.DESCRIPTOR$wgpuDeviceCreateBuffer);
        SEGMENT$wgpuDeviceCreateCommandEncoder = loader.apply("wgpuDeviceCreateCommandEncoder");
        HANDLE$wgpuDeviceCreateCommandEncoder = RawFunctionLoader.link(SEGMENT$wgpuDeviceCreateCommandEncoder, Descriptors.DESCRIPTOR$wgpuDeviceCreateCommandEncoder);
        SEGMENT$wgpuDeviceCreateComputePipeline = loader.apply("wgpuDeviceCreateComputePipeline");
        HANDLE$wgpuDeviceCreateComputePipeline = RawFunctionLoader.link(SEGMENT$wgpuDeviceCreateComputePipeline, Descriptors.DESCRIPTOR$wgpuDeviceCreateComputePipeline);
        SEGMENT$wgpuDeviceCreateComputePipelineAsync = loader.apply("wgpuDeviceCreateComputePipelineAsync");
        HANDLE$wgpuDeviceCreateComputePipelineAsync = RawFunctionLoader.link(SEGMENT$wgpuDeviceCreateComputePipelineAsync, Descriptors.DESCRIPTOR$wgpuDeviceCreateComputePipelineAsync);
        SEGMENT$wgpuDeviceCreatePipelineLayout = loader.apply("wgpuDeviceCreatePipelineLayout");
        HANDLE$wgpuDeviceCreatePipelineLayout = RawFunctionLoader.link(SEGMENT$wgpuDeviceCreatePipelineLayout, Descriptors.DESCRIPTOR$wgpuDeviceCreatePipelineLayout);
        SEGMENT$wgpuDeviceCreateQuerySet = loader.apply("wgpuDeviceCreateQuerySet");
        HANDLE$wgpuDeviceCreateQuerySet = RawFunctionLoader.link(SEGMENT$wgpuDeviceCreateQuerySet, Descriptors.DESCRIPTOR$wgpuDeviceCreateQuerySet);
        SEGMENT$wgpuDeviceCreateRenderBundleEncoder = loader.apply("wgpuDeviceCreateRenderBundleEncoder");
        HANDLE$wgpuDeviceCreateRenderBundleEncoder = RawFunctionLoader.link(SEGMENT$wgpuDeviceCreateRenderBundleEncoder, Descriptors.DESCRIPTOR$wgpuDeviceCreateRenderBundleEncoder);
        SEGMENT$wgpuDeviceCreateRenderPipeline = loader.apply("wgpuDeviceCreateRenderPipeline");
        HANDLE$wgpuDeviceCreateRenderPipeline = RawFunctionLoader.link(SEGMENT$wgpuDeviceCreateRenderPipeline, Descriptors.DESCRIPTOR$wgpuDeviceCreateRenderPipeline);
        SEGMENT$wgpuDeviceCreateRenderPipelineAsync = loader.apply("wgpuDeviceCreateRenderPipelineAsync");
        HANDLE$wgpuDeviceCreateRenderPipelineAsync = RawFunctionLoader.link(SEGMENT$wgpuDeviceCreateRenderPipelineAsync, Descriptors.DESCRIPTOR$wgpuDeviceCreateRenderPipelineAsync);
        SEGMENT$wgpuDeviceCreateSampler = loader.apply("wgpuDeviceCreateSampler");
        HANDLE$wgpuDeviceCreateSampler = RawFunctionLoader.link(SEGMENT$wgpuDeviceCreateSampler, Descriptors.DESCRIPTOR$wgpuDeviceCreateSampler);
        SEGMENT$wgpuDeviceCreateShaderModule = loader.apply("wgpuDeviceCreateShaderModule");
        HANDLE$wgpuDeviceCreateShaderModule = RawFunctionLoader.link(SEGMENT$wgpuDeviceCreateShaderModule, Descriptors.DESCRIPTOR$wgpuDeviceCreateShaderModule);
        SEGMENT$wgpuDeviceCreateTexture = loader.apply("wgpuDeviceCreateTexture");
        HANDLE$wgpuDeviceCreateTexture = RawFunctionLoader.link(SEGMENT$wgpuDeviceCreateTexture, Descriptors.DESCRIPTOR$wgpuDeviceCreateTexture);
        SEGMENT$wgpuDeviceDestroy = loader.apply("wgpuDeviceDestroy");
        HANDLE$wgpuDeviceDestroy = RawFunctionLoader.link(SEGMENT$wgpuDeviceDestroy, Descriptors.DESCRIPTOR$wgpuDeviceDestroy);
        SEGMENT$wgpuDeviceGetAdapterInfo = loader.apply("wgpuDeviceGetAdapterInfo");
        HANDLE$wgpuDeviceGetAdapterInfo = RawFunctionLoader.link(SEGMENT$wgpuDeviceGetAdapterInfo, Descriptors.DESCRIPTOR$wgpuDeviceGetAdapterInfo);
        SEGMENT$wgpuDeviceGetFeatures = loader.apply("wgpuDeviceGetFeatures");
        HANDLE$wgpuDeviceGetFeatures = RawFunctionLoader.link(SEGMENT$wgpuDeviceGetFeatures, Descriptors.DESCRIPTOR$wgpuDeviceGetFeatures);
        SEGMENT$wgpuDeviceGetLimits = loader.apply("wgpuDeviceGetLimits");
        HANDLE$wgpuDeviceGetLimits = RawFunctionLoader.link(SEGMENT$wgpuDeviceGetLimits, Descriptors.DESCRIPTOR$wgpuDeviceGetLimits);
        SEGMENT$wgpuDeviceGetLostFuture = loader.apply("wgpuDeviceGetLostFuture");
        HANDLE$wgpuDeviceGetLostFuture = RawFunctionLoader.link(SEGMENT$wgpuDeviceGetLostFuture, Descriptors.DESCRIPTOR$wgpuDeviceGetLostFuture);
        SEGMENT$wgpuDeviceGetQueue = loader.apply("wgpuDeviceGetQueue");
        HANDLE$wgpuDeviceGetQueue = RawFunctionLoader.link(SEGMENT$wgpuDeviceGetQueue, Descriptors.DESCRIPTOR$wgpuDeviceGetQueue);
        SEGMENT$wgpuDeviceHasFeature = loader.apply("wgpuDeviceHasFeature");
        HANDLE$wgpuDeviceHasFeature = RawFunctionLoader.link(SEGMENT$wgpuDeviceHasFeature, Descriptors.DESCRIPTOR$wgpuDeviceHasFeature);
        SEGMENT$wgpuDevicePopErrorScope = loader.apply("wgpuDevicePopErrorScope");
        HANDLE$wgpuDevicePopErrorScope = RawFunctionLoader.link(SEGMENT$wgpuDevicePopErrorScope, Descriptors.DESCRIPTOR$wgpuDevicePopErrorScope);
        SEGMENT$wgpuDevicePushErrorScope = loader.apply("wgpuDevicePushErrorScope");
        HANDLE$wgpuDevicePushErrorScope = RawFunctionLoader.link(SEGMENT$wgpuDevicePushErrorScope, Descriptors.DESCRIPTOR$wgpuDevicePushErrorScope);
        SEGMENT$wgpuDeviceRelease = loader.apply("wgpuDeviceRelease");
        HANDLE$wgpuDeviceRelease = RawFunctionLoader.link(SEGMENT$wgpuDeviceRelease, Descriptors.DESCRIPTOR$wgpuDeviceRelease);
        SEGMENT$wgpuDeviceSetLabel = loader.apply("wgpuDeviceSetLabel");
        HANDLE$wgpuDeviceSetLabel = RawFunctionLoader.link(SEGMENT$wgpuDeviceSetLabel, Descriptors.DESCRIPTOR$wgpuDeviceSetLabel);
        SEGMENT$wgpuGetInstanceCapabilities = loader.apply("wgpuGetInstanceCapabilities");
        HANDLE$wgpuGetInstanceCapabilities = RawFunctionLoader.link(SEGMENT$wgpuGetInstanceCapabilities, Descriptors.DESCRIPTOR$wgpuGetInstanceCapabilities);
        SEGMENT$wgpuInstanceAddRef = loader.apply("wgpuInstanceAddRef");
        HANDLE$wgpuInstanceAddRef = RawFunctionLoader.link(SEGMENT$wgpuInstanceAddRef, Descriptors.DESCRIPTOR$wgpuInstanceAddRef);
        SEGMENT$wgpuInstanceCreateSurface = loader.apply("wgpuInstanceCreateSurface");
        HANDLE$wgpuInstanceCreateSurface = RawFunctionLoader.link(SEGMENT$wgpuInstanceCreateSurface, Descriptors.DESCRIPTOR$wgpuInstanceCreateSurface);
        SEGMENT$wgpuInstanceGetWgslLanguageFeatures = loader.apply("wgpuInstanceGetWgslLanguageFeatures");
        HANDLE$wgpuInstanceGetWgslLanguageFeatures = RawFunctionLoader.link(SEGMENT$wgpuInstanceGetWgslLanguageFeatures, Descriptors.DESCRIPTOR$wgpuInstanceGetWgslLanguageFeatures);
        SEGMENT$wgpuInstanceHasWgslLanguageFeature = loader.apply("wgpuInstanceHasWgslLanguageFeature");
        HANDLE$wgpuInstanceHasWgslLanguageFeature = RawFunctionLoader.link(SEGMENT$wgpuInstanceHasWgslLanguageFeature, Descriptors.DESCRIPTOR$wgpuInstanceHasWgslLanguageFeature);
        SEGMENT$wgpuInstanceProcessEvents = loader.apply("wgpuInstanceProcessEvents");
        HANDLE$wgpuInstanceProcessEvents = RawFunctionLoader.link(SEGMENT$wgpuInstanceProcessEvents, Descriptors.DESCRIPTOR$wgpuInstanceProcessEvents);
        SEGMENT$wgpuInstanceRelease = loader.apply("wgpuInstanceRelease");
        HANDLE$wgpuInstanceRelease = RawFunctionLoader.link(SEGMENT$wgpuInstanceRelease, Descriptors.DESCRIPTOR$wgpuInstanceRelease);
        SEGMENT$wgpuInstanceRequestAdapter = loader.apply("wgpuInstanceRequestAdapter");
        HANDLE$wgpuInstanceRequestAdapter = RawFunctionLoader.link(SEGMENT$wgpuInstanceRequestAdapter, Descriptors.DESCRIPTOR$wgpuInstanceRequestAdapter);
        SEGMENT$wgpuInstanceWaitAny = loader.apply("wgpuInstanceWaitAny");
        HANDLE$wgpuInstanceWaitAny = RawFunctionLoader.link(SEGMENT$wgpuInstanceWaitAny, Descriptors.DESCRIPTOR$wgpuInstanceWaitAny);
        SEGMENT$wgpuPipelineLayoutAddRef = loader.apply("wgpuPipelineLayoutAddRef");
        HANDLE$wgpuPipelineLayoutAddRef = RawFunctionLoader.link(SEGMENT$wgpuPipelineLayoutAddRef, Descriptors.DESCRIPTOR$wgpuPipelineLayoutAddRef);
        SEGMENT$wgpuPipelineLayoutRelease = loader.apply("wgpuPipelineLayoutRelease");
        HANDLE$wgpuPipelineLayoutRelease = RawFunctionLoader.link(SEGMENT$wgpuPipelineLayoutRelease, Descriptors.DESCRIPTOR$wgpuPipelineLayoutRelease);
        SEGMENT$wgpuPipelineLayoutSetLabel = loader.apply("wgpuPipelineLayoutSetLabel");
        HANDLE$wgpuPipelineLayoutSetLabel = RawFunctionLoader.link(SEGMENT$wgpuPipelineLayoutSetLabel, Descriptors.DESCRIPTOR$wgpuPipelineLayoutSetLabel);
        SEGMENT$wgpuQuerySetAddRef = loader.apply("wgpuQuerySetAddRef");
        HANDLE$wgpuQuerySetAddRef = RawFunctionLoader.link(SEGMENT$wgpuQuerySetAddRef, Descriptors.DESCRIPTOR$wgpuQuerySetAddRef);
        SEGMENT$wgpuQuerySetDestroy = loader.apply("wgpuQuerySetDestroy");
        HANDLE$wgpuQuerySetDestroy = RawFunctionLoader.link(SEGMENT$wgpuQuerySetDestroy, Descriptors.DESCRIPTOR$wgpuQuerySetDestroy);
        SEGMENT$wgpuQuerySetGetCount = loader.apply("wgpuQuerySetGetCount");
        HANDLE$wgpuQuerySetGetCount = RawFunctionLoader.link(SEGMENT$wgpuQuerySetGetCount, Descriptors.DESCRIPTOR$wgpuQuerySetGetCount);
        SEGMENT$wgpuQuerySetGetType = loader.apply("wgpuQuerySetGetType");
        HANDLE$wgpuQuerySetGetType = RawFunctionLoader.link(SEGMENT$wgpuQuerySetGetType, Descriptors.DESCRIPTOR$wgpuQuerySetGetType);
        SEGMENT$wgpuQuerySetRelease = loader.apply("wgpuQuerySetRelease");
        HANDLE$wgpuQuerySetRelease = RawFunctionLoader.link(SEGMENT$wgpuQuerySetRelease, Descriptors.DESCRIPTOR$wgpuQuerySetRelease);
        SEGMENT$wgpuQuerySetSetLabel = loader.apply("wgpuQuerySetSetLabel");
        HANDLE$wgpuQuerySetSetLabel = RawFunctionLoader.link(SEGMENT$wgpuQuerySetSetLabel, Descriptors.DESCRIPTOR$wgpuQuerySetSetLabel);
        SEGMENT$wgpuQueueAddRef = loader.apply("wgpuQueueAddRef");
        HANDLE$wgpuQueueAddRef = RawFunctionLoader.link(SEGMENT$wgpuQueueAddRef, Descriptors.DESCRIPTOR$wgpuQueueAddRef);
        SEGMENT$wgpuQueueOnSubmittedWorkDone = loader.apply("wgpuQueueOnSubmittedWorkDone");
        HANDLE$wgpuQueueOnSubmittedWorkDone = RawFunctionLoader.link(SEGMENT$wgpuQueueOnSubmittedWorkDone, Descriptors.DESCRIPTOR$wgpuQueueOnSubmittedWorkDone);
        SEGMENT$wgpuQueueRelease = loader.apply("wgpuQueueRelease");
        HANDLE$wgpuQueueRelease = RawFunctionLoader.link(SEGMENT$wgpuQueueRelease, Descriptors.DESCRIPTOR$wgpuQueueRelease);
        SEGMENT$wgpuQueueSetLabel = loader.apply("wgpuQueueSetLabel");
        HANDLE$wgpuQueueSetLabel = RawFunctionLoader.link(SEGMENT$wgpuQueueSetLabel, Descriptors.DESCRIPTOR$wgpuQueueSetLabel);
        SEGMENT$wgpuQueueSubmit = loader.apply("wgpuQueueSubmit");
        HANDLE$wgpuQueueSubmit = RawFunctionLoader.link(SEGMENT$wgpuQueueSubmit, Descriptors.DESCRIPTOR$wgpuQueueSubmit);
        SEGMENT$wgpuQueueWriteBuffer = loader.apply("wgpuQueueWriteBuffer");
        HANDLE$wgpuQueueWriteBuffer = RawFunctionLoader.link(SEGMENT$wgpuQueueWriteBuffer, Descriptors.DESCRIPTOR$wgpuQueueWriteBuffer);
        SEGMENT$wgpuQueueWriteTexture = loader.apply("wgpuQueueWriteTexture");
        HANDLE$wgpuQueueWriteTexture = RawFunctionLoader.link(SEGMENT$wgpuQueueWriteTexture, Descriptors.DESCRIPTOR$wgpuQueueWriteTexture);
        SEGMENT$wgpuRenderBundleAddRef = loader.apply("wgpuRenderBundleAddRef");
        HANDLE$wgpuRenderBundleAddRef = RawFunctionLoader.link(SEGMENT$wgpuRenderBundleAddRef, Descriptors.DESCRIPTOR$wgpuRenderBundleAddRef);
        SEGMENT$wgpuRenderBundleEncoderAddRef = loader.apply("wgpuRenderBundleEncoderAddRef");
        HANDLE$wgpuRenderBundleEncoderAddRef = RawFunctionLoader.link(SEGMENT$wgpuRenderBundleEncoderAddRef, Descriptors.DESCRIPTOR$wgpuRenderBundleEncoderAddRef);
        SEGMENT$wgpuRenderBundleEncoderDraw = loader.apply("wgpuRenderBundleEncoderDraw");
        HANDLE$wgpuRenderBundleEncoderDraw = RawFunctionLoader.link(SEGMENT$wgpuRenderBundleEncoderDraw, Descriptors.DESCRIPTOR$wgpuRenderBundleEncoderDraw);
        SEGMENT$wgpuRenderBundleEncoderDrawIndexed = loader.apply("wgpuRenderBundleEncoderDrawIndexed");
        HANDLE$wgpuRenderBundleEncoderDrawIndexed = RawFunctionLoader.link(SEGMENT$wgpuRenderBundleEncoderDrawIndexed, Descriptors.DESCRIPTOR$wgpuRenderBundleEncoderDrawIndexed);
        SEGMENT$wgpuRenderBundleEncoderDrawIndexedIndirect = loader.apply("wgpuRenderBundleEncoderDrawIndexedIndirect");
        HANDLE$wgpuRenderBundleEncoderDrawIndexedIndirect = RawFunctionLoader.link(SEGMENT$wgpuRenderBundleEncoderDrawIndexedIndirect, Descriptors.DESCRIPTOR$wgpuRenderBundleEncoderDrawIndexedIndirect);
        SEGMENT$wgpuRenderBundleEncoderDrawIndirect = loader.apply("wgpuRenderBundleEncoderDrawIndirect");
        HANDLE$wgpuRenderBundleEncoderDrawIndirect = RawFunctionLoader.link(SEGMENT$wgpuRenderBundleEncoderDrawIndirect, Descriptors.DESCRIPTOR$wgpuRenderBundleEncoderDrawIndirect);
        SEGMENT$wgpuRenderBundleEncoderFinish = loader.apply("wgpuRenderBundleEncoderFinish");
        HANDLE$wgpuRenderBundleEncoderFinish = RawFunctionLoader.link(SEGMENT$wgpuRenderBundleEncoderFinish, Descriptors.DESCRIPTOR$wgpuRenderBundleEncoderFinish);
        SEGMENT$wgpuRenderBundleEncoderInsertDebugMarker = loader.apply("wgpuRenderBundleEncoderInsertDebugMarker");
        HANDLE$wgpuRenderBundleEncoderInsertDebugMarker = RawFunctionLoader.link(SEGMENT$wgpuRenderBundleEncoderInsertDebugMarker, Descriptors.DESCRIPTOR$wgpuRenderBundleEncoderInsertDebugMarker);
        SEGMENT$wgpuRenderBundleEncoderPopDebugGroup = loader.apply("wgpuRenderBundleEncoderPopDebugGroup");
        HANDLE$wgpuRenderBundleEncoderPopDebugGroup = RawFunctionLoader.link(SEGMENT$wgpuRenderBundleEncoderPopDebugGroup, Descriptors.DESCRIPTOR$wgpuRenderBundleEncoderPopDebugGroup);
        SEGMENT$wgpuRenderBundleEncoderPushDebugGroup = loader.apply("wgpuRenderBundleEncoderPushDebugGroup");
        HANDLE$wgpuRenderBundleEncoderPushDebugGroup = RawFunctionLoader.link(SEGMENT$wgpuRenderBundleEncoderPushDebugGroup, Descriptors.DESCRIPTOR$wgpuRenderBundleEncoderPushDebugGroup);
        SEGMENT$wgpuRenderBundleEncoderRelease = loader.apply("wgpuRenderBundleEncoderRelease");
        HANDLE$wgpuRenderBundleEncoderRelease = RawFunctionLoader.link(SEGMENT$wgpuRenderBundleEncoderRelease, Descriptors.DESCRIPTOR$wgpuRenderBundleEncoderRelease);
        SEGMENT$wgpuRenderBundleEncoderSetBindGroup = loader.apply("wgpuRenderBundleEncoderSetBindGroup");
        HANDLE$wgpuRenderBundleEncoderSetBindGroup = RawFunctionLoader.link(SEGMENT$wgpuRenderBundleEncoderSetBindGroup, Descriptors.DESCRIPTOR$wgpuRenderBundleEncoderSetBindGroup);
        SEGMENT$wgpuRenderBundleEncoderSetIndexBuffer = loader.apply("wgpuRenderBundleEncoderSetIndexBuffer");
        HANDLE$wgpuRenderBundleEncoderSetIndexBuffer = RawFunctionLoader.link(SEGMENT$wgpuRenderBundleEncoderSetIndexBuffer, Descriptors.DESCRIPTOR$wgpuRenderBundleEncoderSetIndexBuffer);
        SEGMENT$wgpuRenderBundleEncoderSetLabel = loader.apply("wgpuRenderBundleEncoderSetLabel");
        HANDLE$wgpuRenderBundleEncoderSetLabel = RawFunctionLoader.link(SEGMENT$wgpuRenderBundleEncoderSetLabel, Descriptors.DESCRIPTOR$wgpuRenderBundleEncoderSetLabel);
        SEGMENT$wgpuRenderBundleEncoderSetPipeline = loader.apply("wgpuRenderBundleEncoderSetPipeline");
        HANDLE$wgpuRenderBundleEncoderSetPipeline = RawFunctionLoader.link(SEGMENT$wgpuRenderBundleEncoderSetPipeline, Descriptors.DESCRIPTOR$wgpuRenderBundleEncoderSetPipeline);
        SEGMENT$wgpuRenderBundleEncoderSetVertexBuffer = loader.apply("wgpuRenderBundleEncoderSetVertexBuffer");
        HANDLE$wgpuRenderBundleEncoderSetVertexBuffer = RawFunctionLoader.link(SEGMENT$wgpuRenderBundleEncoderSetVertexBuffer, Descriptors.DESCRIPTOR$wgpuRenderBundleEncoderSetVertexBuffer);
        SEGMENT$wgpuRenderBundleRelease = loader.apply("wgpuRenderBundleRelease");
        HANDLE$wgpuRenderBundleRelease = RawFunctionLoader.link(SEGMENT$wgpuRenderBundleRelease, Descriptors.DESCRIPTOR$wgpuRenderBundleRelease);
        SEGMENT$wgpuRenderBundleSetLabel = loader.apply("wgpuRenderBundleSetLabel");
        HANDLE$wgpuRenderBundleSetLabel = RawFunctionLoader.link(SEGMENT$wgpuRenderBundleSetLabel, Descriptors.DESCRIPTOR$wgpuRenderBundleSetLabel);
        SEGMENT$wgpuRenderPassEncoderAddRef = loader.apply("wgpuRenderPassEncoderAddRef");
        HANDLE$wgpuRenderPassEncoderAddRef = RawFunctionLoader.link(SEGMENT$wgpuRenderPassEncoderAddRef, Descriptors.DESCRIPTOR$wgpuRenderPassEncoderAddRef);
        SEGMENT$wgpuRenderPassEncoderBeginOcclusionQuery = loader.apply("wgpuRenderPassEncoderBeginOcclusionQuery");
        HANDLE$wgpuRenderPassEncoderBeginOcclusionQuery = RawFunctionLoader.link(SEGMENT$wgpuRenderPassEncoderBeginOcclusionQuery, Descriptors.DESCRIPTOR$wgpuRenderPassEncoderBeginOcclusionQuery);
        SEGMENT$wgpuRenderPassEncoderDraw = loader.apply("wgpuRenderPassEncoderDraw");
        HANDLE$wgpuRenderPassEncoderDraw = RawFunctionLoader.link(SEGMENT$wgpuRenderPassEncoderDraw, Descriptors.DESCRIPTOR$wgpuRenderPassEncoderDraw);
        SEGMENT$wgpuRenderPassEncoderDrawIndexed = loader.apply("wgpuRenderPassEncoderDrawIndexed");
        HANDLE$wgpuRenderPassEncoderDrawIndexed = RawFunctionLoader.link(SEGMENT$wgpuRenderPassEncoderDrawIndexed, Descriptors.DESCRIPTOR$wgpuRenderPassEncoderDrawIndexed);
        SEGMENT$wgpuRenderPassEncoderDrawIndexedIndirect = loader.apply("wgpuRenderPassEncoderDrawIndexedIndirect");
        HANDLE$wgpuRenderPassEncoderDrawIndexedIndirect = RawFunctionLoader.link(SEGMENT$wgpuRenderPassEncoderDrawIndexedIndirect, Descriptors.DESCRIPTOR$wgpuRenderPassEncoderDrawIndexedIndirect);
        SEGMENT$wgpuRenderPassEncoderDrawIndirect = loader.apply("wgpuRenderPassEncoderDrawIndirect");
        HANDLE$wgpuRenderPassEncoderDrawIndirect = RawFunctionLoader.link(SEGMENT$wgpuRenderPassEncoderDrawIndirect, Descriptors.DESCRIPTOR$wgpuRenderPassEncoderDrawIndirect);
        SEGMENT$wgpuRenderPassEncoderEnd = loader.apply("wgpuRenderPassEncoderEnd");
        HANDLE$wgpuRenderPassEncoderEnd = RawFunctionLoader.link(SEGMENT$wgpuRenderPassEncoderEnd, Descriptors.DESCRIPTOR$wgpuRenderPassEncoderEnd);
        SEGMENT$wgpuRenderPassEncoderEndOcclusionQuery = loader.apply("wgpuRenderPassEncoderEndOcclusionQuery");
        HANDLE$wgpuRenderPassEncoderEndOcclusionQuery = RawFunctionLoader.link(SEGMENT$wgpuRenderPassEncoderEndOcclusionQuery, Descriptors.DESCRIPTOR$wgpuRenderPassEncoderEndOcclusionQuery);
        SEGMENT$wgpuRenderPassEncoderExecuteBundles = loader.apply("wgpuRenderPassEncoderExecuteBundles");
        HANDLE$wgpuRenderPassEncoderExecuteBundles = RawFunctionLoader.link(SEGMENT$wgpuRenderPassEncoderExecuteBundles, Descriptors.DESCRIPTOR$wgpuRenderPassEncoderExecuteBundles);
        SEGMENT$wgpuRenderPassEncoderInsertDebugMarker = loader.apply("wgpuRenderPassEncoderInsertDebugMarker");
        HANDLE$wgpuRenderPassEncoderInsertDebugMarker = RawFunctionLoader.link(SEGMENT$wgpuRenderPassEncoderInsertDebugMarker, Descriptors.DESCRIPTOR$wgpuRenderPassEncoderInsertDebugMarker);
        SEGMENT$wgpuRenderPassEncoderPopDebugGroup = loader.apply("wgpuRenderPassEncoderPopDebugGroup");
        HANDLE$wgpuRenderPassEncoderPopDebugGroup = RawFunctionLoader.link(SEGMENT$wgpuRenderPassEncoderPopDebugGroup, Descriptors.DESCRIPTOR$wgpuRenderPassEncoderPopDebugGroup);
        SEGMENT$wgpuRenderPassEncoderPushDebugGroup = loader.apply("wgpuRenderPassEncoderPushDebugGroup");
        HANDLE$wgpuRenderPassEncoderPushDebugGroup = RawFunctionLoader.link(SEGMENT$wgpuRenderPassEncoderPushDebugGroup, Descriptors.DESCRIPTOR$wgpuRenderPassEncoderPushDebugGroup);
        SEGMENT$wgpuRenderPassEncoderRelease = loader.apply("wgpuRenderPassEncoderRelease");
        HANDLE$wgpuRenderPassEncoderRelease = RawFunctionLoader.link(SEGMENT$wgpuRenderPassEncoderRelease, Descriptors.DESCRIPTOR$wgpuRenderPassEncoderRelease);
        SEGMENT$wgpuRenderPassEncoderSetBindGroup = loader.apply("wgpuRenderPassEncoderSetBindGroup");
        HANDLE$wgpuRenderPassEncoderSetBindGroup = RawFunctionLoader.link(SEGMENT$wgpuRenderPassEncoderSetBindGroup, Descriptors.DESCRIPTOR$wgpuRenderPassEncoderSetBindGroup);
        SEGMENT$wgpuRenderPassEncoderSetBlendConstant = loader.apply("wgpuRenderPassEncoderSetBlendConstant");
        HANDLE$wgpuRenderPassEncoderSetBlendConstant = RawFunctionLoader.link(SEGMENT$wgpuRenderPassEncoderSetBlendConstant, Descriptors.DESCRIPTOR$wgpuRenderPassEncoderSetBlendConstant);
        SEGMENT$wgpuRenderPassEncoderSetIndexBuffer = loader.apply("wgpuRenderPassEncoderSetIndexBuffer");
        HANDLE$wgpuRenderPassEncoderSetIndexBuffer = RawFunctionLoader.link(SEGMENT$wgpuRenderPassEncoderSetIndexBuffer, Descriptors.DESCRIPTOR$wgpuRenderPassEncoderSetIndexBuffer);
        SEGMENT$wgpuRenderPassEncoderSetLabel = loader.apply("wgpuRenderPassEncoderSetLabel");
        HANDLE$wgpuRenderPassEncoderSetLabel = RawFunctionLoader.link(SEGMENT$wgpuRenderPassEncoderSetLabel, Descriptors.DESCRIPTOR$wgpuRenderPassEncoderSetLabel);
        SEGMENT$wgpuRenderPassEncoderSetPipeline = loader.apply("wgpuRenderPassEncoderSetPipeline");
        HANDLE$wgpuRenderPassEncoderSetPipeline = RawFunctionLoader.link(SEGMENT$wgpuRenderPassEncoderSetPipeline, Descriptors.DESCRIPTOR$wgpuRenderPassEncoderSetPipeline);
        SEGMENT$wgpuRenderPassEncoderSetScissorRect = loader.apply("wgpuRenderPassEncoderSetScissorRect");
        HANDLE$wgpuRenderPassEncoderSetScissorRect = RawFunctionLoader.link(SEGMENT$wgpuRenderPassEncoderSetScissorRect, Descriptors.DESCRIPTOR$wgpuRenderPassEncoderSetScissorRect);
        SEGMENT$wgpuRenderPassEncoderSetStencilReference = loader.apply("wgpuRenderPassEncoderSetStencilReference");
        HANDLE$wgpuRenderPassEncoderSetStencilReference = RawFunctionLoader.link(SEGMENT$wgpuRenderPassEncoderSetStencilReference, Descriptors.DESCRIPTOR$wgpuRenderPassEncoderSetStencilReference);
        SEGMENT$wgpuRenderPassEncoderSetVertexBuffer = loader.apply("wgpuRenderPassEncoderSetVertexBuffer");
        HANDLE$wgpuRenderPassEncoderSetVertexBuffer = RawFunctionLoader.link(SEGMENT$wgpuRenderPassEncoderSetVertexBuffer, Descriptors.DESCRIPTOR$wgpuRenderPassEncoderSetVertexBuffer);
        SEGMENT$wgpuRenderPassEncoderSetViewport = loader.apply("wgpuRenderPassEncoderSetViewport");
        HANDLE$wgpuRenderPassEncoderSetViewport = RawFunctionLoader.link(SEGMENT$wgpuRenderPassEncoderSetViewport, Descriptors.DESCRIPTOR$wgpuRenderPassEncoderSetViewport);
        SEGMENT$wgpuRenderPipelineAddRef = loader.apply("wgpuRenderPipelineAddRef");
        HANDLE$wgpuRenderPipelineAddRef = RawFunctionLoader.link(SEGMENT$wgpuRenderPipelineAddRef, Descriptors.DESCRIPTOR$wgpuRenderPipelineAddRef);
        SEGMENT$wgpuRenderPipelineGetBindGroupLayout = loader.apply("wgpuRenderPipelineGetBindGroupLayout");
        HANDLE$wgpuRenderPipelineGetBindGroupLayout = RawFunctionLoader.link(SEGMENT$wgpuRenderPipelineGetBindGroupLayout, Descriptors.DESCRIPTOR$wgpuRenderPipelineGetBindGroupLayout);
        SEGMENT$wgpuRenderPipelineRelease = loader.apply("wgpuRenderPipelineRelease");
        HANDLE$wgpuRenderPipelineRelease = RawFunctionLoader.link(SEGMENT$wgpuRenderPipelineRelease, Descriptors.DESCRIPTOR$wgpuRenderPipelineRelease);
        SEGMENT$wgpuRenderPipelineSetLabel = loader.apply("wgpuRenderPipelineSetLabel");
        HANDLE$wgpuRenderPipelineSetLabel = RawFunctionLoader.link(SEGMENT$wgpuRenderPipelineSetLabel, Descriptors.DESCRIPTOR$wgpuRenderPipelineSetLabel);
        SEGMENT$wgpuSamplerAddRef = loader.apply("wgpuSamplerAddRef");
        HANDLE$wgpuSamplerAddRef = RawFunctionLoader.link(SEGMENT$wgpuSamplerAddRef, Descriptors.DESCRIPTOR$wgpuSamplerAddRef);
        SEGMENT$wgpuSamplerRelease = loader.apply("wgpuSamplerRelease");
        HANDLE$wgpuSamplerRelease = RawFunctionLoader.link(SEGMENT$wgpuSamplerRelease, Descriptors.DESCRIPTOR$wgpuSamplerRelease);
        SEGMENT$wgpuSamplerSetLabel = loader.apply("wgpuSamplerSetLabel");
        HANDLE$wgpuSamplerSetLabel = RawFunctionLoader.link(SEGMENT$wgpuSamplerSetLabel, Descriptors.DESCRIPTOR$wgpuSamplerSetLabel);
        SEGMENT$wgpuShaderModuleAddRef = loader.apply("wgpuShaderModuleAddRef");
        HANDLE$wgpuShaderModuleAddRef = RawFunctionLoader.link(SEGMENT$wgpuShaderModuleAddRef, Descriptors.DESCRIPTOR$wgpuShaderModuleAddRef);
        SEGMENT$wgpuShaderModuleGetCompilationInfo = loader.apply("wgpuShaderModuleGetCompilationInfo");
        HANDLE$wgpuShaderModuleGetCompilationInfo = RawFunctionLoader.link(SEGMENT$wgpuShaderModuleGetCompilationInfo, Descriptors.DESCRIPTOR$wgpuShaderModuleGetCompilationInfo);
        SEGMENT$wgpuShaderModuleRelease = loader.apply("wgpuShaderModuleRelease");
        HANDLE$wgpuShaderModuleRelease = RawFunctionLoader.link(SEGMENT$wgpuShaderModuleRelease, Descriptors.DESCRIPTOR$wgpuShaderModuleRelease);
        SEGMENT$wgpuShaderModuleSetLabel = loader.apply("wgpuShaderModuleSetLabel");
        HANDLE$wgpuShaderModuleSetLabel = RawFunctionLoader.link(SEGMENT$wgpuShaderModuleSetLabel, Descriptors.DESCRIPTOR$wgpuShaderModuleSetLabel);
        SEGMENT$wgpuSurfaceAddRef = loader.apply("wgpuSurfaceAddRef");
        HANDLE$wgpuSurfaceAddRef = RawFunctionLoader.link(SEGMENT$wgpuSurfaceAddRef, Descriptors.DESCRIPTOR$wgpuSurfaceAddRef);
        SEGMENT$wgpuSurfaceConfigure = loader.apply("wgpuSurfaceConfigure");
        HANDLE$wgpuSurfaceConfigure = RawFunctionLoader.link(SEGMENT$wgpuSurfaceConfigure, Descriptors.DESCRIPTOR$wgpuSurfaceConfigure);
        SEGMENT$wgpuSurfaceGetCapabilities = loader.apply("wgpuSurfaceGetCapabilities");
        HANDLE$wgpuSurfaceGetCapabilities = RawFunctionLoader.link(SEGMENT$wgpuSurfaceGetCapabilities, Descriptors.DESCRIPTOR$wgpuSurfaceGetCapabilities);
        SEGMENT$wgpuSurfaceGetCurrentTexture = loader.apply("wgpuSurfaceGetCurrentTexture");
        HANDLE$wgpuSurfaceGetCurrentTexture = RawFunctionLoader.link(SEGMENT$wgpuSurfaceGetCurrentTexture, Descriptors.DESCRIPTOR$wgpuSurfaceGetCurrentTexture);
        SEGMENT$wgpuSurfacePresent = loader.apply("wgpuSurfacePresent");
        HANDLE$wgpuSurfacePresent = RawFunctionLoader.link(SEGMENT$wgpuSurfacePresent, Descriptors.DESCRIPTOR$wgpuSurfacePresent);
        SEGMENT$wgpuSurfaceRelease = loader.apply("wgpuSurfaceRelease");
        HANDLE$wgpuSurfaceRelease = RawFunctionLoader.link(SEGMENT$wgpuSurfaceRelease, Descriptors.DESCRIPTOR$wgpuSurfaceRelease);
        SEGMENT$wgpuSurfaceSetLabel = loader.apply("wgpuSurfaceSetLabel");
        HANDLE$wgpuSurfaceSetLabel = RawFunctionLoader.link(SEGMENT$wgpuSurfaceSetLabel, Descriptors.DESCRIPTOR$wgpuSurfaceSetLabel);
        SEGMENT$wgpuSurfaceUnconfigure = loader.apply("wgpuSurfaceUnconfigure");
        HANDLE$wgpuSurfaceUnconfigure = RawFunctionLoader.link(SEGMENT$wgpuSurfaceUnconfigure, Descriptors.DESCRIPTOR$wgpuSurfaceUnconfigure);
        SEGMENT$wgpuTextureAddRef = loader.apply("wgpuTextureAddRef");
        HANDLE$wgpuTextureAddRef = RawFunctionLoader.link(SEGMENT$wgpuTextureAddRef, Descriptors.DESCRIPTOR$wgpuTextureAddRef);
        SEGMENT$wgpuTextureCreateView = loader.apply("wgpuTextureCreateView");
        HANDLE$wgpuTextureCreateView = RawFunctionLoader.link(SEGMENT$wgpuTextureCreateView, Descriptors.DESCRIPTOR$wgpuTextureCreateView);
        SEGMENT$wgpuTextureDestroy = loader.apply("wgpuTextureDestroy");
        HANDLE$wgpuTextureDestroy = RawFunctionLoader.link(SEGMENT$wgpuTextureDestroy, Descriptors.DESCRIPTOR$wgpuTextureDestroy);
        SEGMENT$wgpuTextureGetDepthOrArrayLayers = loader.apply("wgpuTextureGetDepthOrArrayLayers");
        HANDLE$wgpuTextureGetDepthOrArrayLayers = RawFunctionLoader.link(SEGMENT$wgpuTextureGetDepthOrArrayLayers, Descriptors.DESCRIPTOR$wgpuTextureGetDepthOrArrayLayers);
        SEGMENT$wgpuTextureGetDimension = loader.apply("wgpuTextureGetDimension");
        HANDLE$wgpuTextureGetDimension = RawFunctionLoader.link(SEGMENT$wgpuTextureGetDimension, Descriptors.DESCRIPTOR$wgpuTextureGetDimension);
        SEGMENT$wgpuTextureGetFormat = loader.apply("wgpuTextureGetFormat");
        HANDLE$wgpuTextureGetFormat = RawFunctionLoader.link(SEGMENT$wgpuTextureGetFormat, Descriptors.DESCRIPTOR$wgpuTextureGetFormat);
        SEGMENT$wgpuTextureGetHeight = loader.apply("wgpuTextureGetHeight");
        HANDLE$wgpuTextureGetHeight = RawFunctionLoader.link(SEGMENT$wgpuTextureGetHeight, Descriptors.DESCRIPTOR$wgpuTextureGetHeight);
        SEGMENT$wgpuTextureGetMipLevelCount = loader.apply("wgpuTextureGetMipLevelCount");
        HANDLE$wgpuTextureGetMipLevelCount = RawFunctionLoader.link(SEGMENT$wgpuTextureGetMipLevelCount, Descriptors.DESCRIPTOR$wgpuTextureGetMipLevelCount);
        SEGMENT$wgpuTextureGetSampleCount = loader.apply("wgpuTextureGetSampleCount");
        HANDLE$wgpuTextureGetSampleCount = RawFunctionLoader.link(SEGMENT$wgpuTextureGetSampleCount, Descriptors.DESCRIPTOR$wgpuTextureGetSampleCount);
        SEGMENT$wgpuTextureGetUsage = loader.apply("wgpuTextureGetUsage");
        HANDLE$wgpuTextureGetUsage = RawFunctionLoader.link(SEGMENT$wgpuTextureGetUsage, Descriptors.DESCRIPTOR$wgpuTextureGetUsage);
        SEGMENT$wgpuTextureGetWidth = loader.apply("wgpuTextureGetWidth");
        HANDLE$wgpuTextureGetWidth = RawFunctionLoader.link(SEGMENT$wgpuTextureGetWidth, Descriptors.DESCRIPTOR$wgpuTextureGetWidth);
        SEGMENT$wgpuTextureRelease = loader.apply("wgpuTextureRelease");
        HANDLE$wgpuTextureRelease = RawFunctionLoader.link(SEGMENT$wgpuTextureRelease, Descriptors.DESCRIPTOR$wgpuTextureRelease);
        SEGMENT$wgpuTextureSetLabel = loader.apply("wgpuTextureSetLabel");
        HANDLE$wgpuTextureSetLabel = RawFunctionLoader.link(SEGMENT$wgpuTextureSetLabel, Descriptors.DESCRIPTOR$wgpuTextureSetLabel);
        SEGMENT$wgpuTextureViewAddRef = loader.apply("wgpuTextureViewAddRef");
        HANDLE$wgpuTextureViewAddRef = RawFunctionLoader.link(SEGMENT$wgpuTextureViewAddRef, Descriptors.DESCRIPTOR$wgpuTextureViewAddRef);
        SEGMENT$wgpuTextureViewRelease = loader.apply("wgpuTextureViewRelease");
        HANDLE$wgpuTextureViewRelease = RawFunctionLoader.link(SEGMENT$wgpuTextureViewRelease, Descriptors.DESCRIPTOR$wgpuTextureViewRelease);
        SEGMENT$wgpuTextureViewSetLabel = loader.apply("wgpuTextureViewSetLabel");
        HANDLE$wgpuTextureViewSetLabel = RawFunctionLoader.link(SEGMENT$wgpuTextureViewSetLabel, Descriptors.DESCRIPTOR$wgpuTextureViewSetLabel);
    }

    // region command wrappers

    public void adapterAddRef(
        WGPUAdapter adapter
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$wgpuAdapterAddRef);
        try {
            hFunction.invokeExact(
                adapter.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void adapterGetFeatures(
        WGPUAdapter adapter,
        @Pointer IWGPUSupportedFeatures features
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$wgpuAdapterGetFeatures);
        try {
            hFunction.invokeExact(
                adapter.segment(),
                features.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public @EnumType(WGPUStatus.class) int adapterGetInfo(
        WGPUAdapter adapter,
        @Pointer IWGPUAdapterInfo info
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$wgpuAdapterGetInfo);
        try {
            return (int) hFunction.invokeExact(
                adapter.segment(),
                info.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public @EnumType(WGPUStatus.class) int adapterGetLimits(
        WGPUAdapter adapter,
        @Pointer IWGPULimits limits
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$wgpuAdapterGetLimits);
        try {
            return (int) hFunction.invokeExact(
                adapter.segment(),
                limits.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public @NativeType("boolean") boolean adapterHasFeature(
        WGPUAdapter adapter,
        @EnumType(WGPUFeatureName.class) int feature
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$wgpuAdapterHasFeature);
        try {
            return (boolean) hFunction.invokeExact(
                adapter.segment(),
                feature
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void adapterRelease(
        WGPUAdapter adapter
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$wgpuAdapterRelease);
        try {
            hFunction.invokeExact(
                adapter.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void adapterRequestDevice(
        WGPUAdapter adapter,
        @Nullable @Pointer IWGPUDeviceDescriptor descriptor,
        @Pointer(comment="PFN_wgpuRequestDevice") @NotNull MemorySegment callback,
        @Pointer(comment="void*") @NotNull MemorySegment userdata
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$wgpuAdapterRequestDevice);
        try {
            hFunction.invokeExact(
                adapter.segment(),
                (MemorySegment) (descriptor != null ? descriptor.segment() : MemorySegment.NULL),
                callback,
                userdata
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void bindGroupAddRef(
        WGPUBindGroup bindGroup
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$wgpuBindGroupAddRef);
        try {
            hFunction.invokeExact(
                bindGroup.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void bindGroupLayoutAddRef(
        WGPUBindGroupLayout bindGroupLayout
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$wgpuBindGroupLayoutAddRef);
        try {
            hFunction.invokeExact(
                bindGroupLayout.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void bindGroupLayoutRelease(
        WGPUBindGroupLayout bindGroupLayout
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$wgpuBindGroupLayoutRelease);
        try {
            hFunction.invokeExact(
                bindGroupLayout.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void bindGroupLayoutSetLabel(
        WGPUBindGroupLayout bindGroupLayout,
        WGPUStringView label
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$wgpuBindGroupLayoutSetLabel);
        try {
            hFunction.invokeExact(
                bindGroupLayout.segment(),
                label.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void bindGroupRelease(
        WGPUBindGroup bindGroup
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$wgpuBindGroupRelease);
        try {
            hFunction.invokeExact(
                bindGroup.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void bindGroupSetLabel(
        WGPUBindGroup bindGroup,
        WGPUStringView label
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$wgpuBindGroupSetLabel);
        try {
            hFunction.invokeExact(
                bindGroup.segment(),
                label.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void bufferAddRef(
        WGPUBuffer buffer
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$wgpuBufferAddRef);
        try {
            hFunction.invokeExact(
                buffer.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void bufferDestroy(
        WGPUBuffer buffer
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$wgpuBufferDestroy);
        try {
            hFunction.invokeExact(
                buffer.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public @Pointer(comment="void*") @NotNull MemorySegment bufferGetConstMappedRange(
        WGPUBuffer buffer,
        long offset,
        long size
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$wgpuBufferGetConstMappedRange);
        try {
            return (MemorySegment) hFunction.invokeExact(
                buffer.segment(),
                MemorySegment.ofAddress(offset),
                MemorySegment.ofAddress(size)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public @EnumType(WGPUBufferMapState.class) int bufferGetMapState(
        WGPUBuffer buffer
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$wgpuBufferGetMapState);
        try {
            return (int) hFunction.invokeExact(
                buffer.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public @Pointer(comment="void*") @NotNull MemorySegment bufferGetMappedRange(
        WGPUBuffer buffer,
        long offset,
        long size
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$wgpuBufferGetMappedRange);
        try {
            return (MemorySegment) hFunction.invokeExact(
                buffer.segment(),
                MemorySegment.ofAddress(offset),
                MemorySegment.ofAddress(size)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public @Unsigned long bufferGetSize(
        WGPUBuffer buffer
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$wgpuBufferGetSize);
        try {
            return (long) hFunction.invokeExact(
                buffer.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public @Bitmask(WGPUBufferUsage.class) long bufferGetUsage(
        WGPUBuffer buffer
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$wgpuBufferGetUsage);
        try {
            return (long) hFunction.invokeExact(
                buffer.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void bufferMapAsync(
        WGPUBuffer buffer,
        @Bitmask(WGPUMapMode.class) long mode,
        long offset,
        long size,
        @Pointer(comment="PFN_wgpuBufferMap") @NotNull MemorySegment callback,
        @Pointer(comment="void*") @NotNull MemorySegment userdata
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$wgpuBufferMapAsync);
        try {
            hFunction.invokeExact(
                buffer.segment(),
                mode,
                MemorySegment.ofAddress(offset),
                MemorySegment.ofAddress(size),
                callback,
                userdata
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void bufferRelease(
        WGPUBuffer buffer
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$wgpuBufferRelease);
        try {
            hFunction.invokeExact(
                buffer.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void bufferSetLabel(
        WGPUBuffer buffer,
        WGPUStringView label
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$wgpuBufferSetLabel);
        try {
            hFunction.invokeExact(
                buffer.segment(),
                label.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void bufferUnmap(
        WGPUBuffer buffer
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$wgpuBufferUnmap);
        try {
            hFunction.invokeExact(
                buffer.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void commandBufferAddRef(
        WGPUCommandBuffer commandBuffer
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$wgpuCommandBufferAddRef);
        try {
            hFunction.invokeExact(
                commandBuffer.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void commandBufferRelease(
        WGPUCommandBuffer commandBuffer
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$wgpuCommandBufferRelease);
        try {
            hFunction.invokeExact(
                commandBuffer.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void commandBufferSetLabel(
        WGPUCommandBuffer commandBuffer,
        WGPUStringView label
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$wgpuCommandBufferSetLabel);
        try {
            hFunction.invokeExact(
                commandBuffer.segment(),
                label.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void commandEncoderAddRef(
        WGPUCommandEncoder commandEncoder
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$wgpuCommandEncoderAddRef);
        try {
            hFunction.invokeExact(
                commandEncoder.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public @Nullable WGPUComputePassEncoder commandEncoderBeginComputePass(
        WGPUCommandEncoder commandEncoder,
        @Nullable @Pointer IWGPUComputePassDescriptor descriptor
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$wgpuCommandEncoderBeginComputePass);
        try {
            MemorySegment s = (MemorySegment) hFunction.invokeExact(
                commandEncoder.segment(),
                (MemorySegment) (descriptor != null ? descriptor.segment() : MemorySegment.NULL)
            );
            return s.equals(MemorySegment.NULL) ? null : new WGPUComputePassEncoder(s);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public @Nullable WGPURenderPassEncoder commandEncoderBeginRenderPass(
        WGPUCommandEncoder commandEncoder,
        @Pointer IWGPURenderPassDescriptor descriptor
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$wgpuCommandEncoderBeginRenderPass);
        try {
            MemorySegment s = (MemorySegment) hFunction.invokeExact(
                commandEncoder.segment(),
                descriptor.segment()
            );
            return s.equals(MemorySegment.NULL) ? null : new WGPURenderPassEncoder(s);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void commandEncoderClearBuffer(
        WGPUCommandEncoder commandEncoder,
        WGPUBuffer buffer,
        @Unsigned long offset,
        @Unsigned long size
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$wgpuCommandEncoderClearBuffer);
        try {
            hFunction.invokeExact(
                commandEncoder.segment(),
                buffer.segment(),
                offset,
                size
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void commandEncoderCopyBufferToBuffer(
        WGPUCommandEncoder commandEncoder,
        WGPUBuffer source,
        @Unsigned long sourceOffset,
        WGPUBuffer destination,
        @Unsigned long destinationOffset,
        @Unsigned long size
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$wgpuCommandEncoderCopyBufferToBuffer);
        try {
            hFunction.invokeExact(
                commandEncoder.segment(),
                source.segment(),
                sourceOffset,
                destination.segment(),
                destinationOffset,
                size
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void commandEncoderCopyBufferToTexture(
        WGPUCommandEncoder commandEncoder,
        @Pointer IWGPUTexelCopyBufferInfo source,
        @Pointer IWGPUTexelCopyTextureInfo destination,
        @Pointer IWGPUExtent3d copySize
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$wgpuCommandEncoderCopyBufferToTexture);
        try {
            hFunction.invokeExact(
                commandEncoder.segment(),
                source.segment(),
                destination.segment(),
                copySize.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void commandEncoderCopyTextureToBuffer(
        WGPUCommandEncoder commandEncoder,
        @Pointer IWGPUTexelCopyTextureInfo source,
        @Pointer IWGPUTexelCopyBufferInfo destination,
        @Pointer IWGPUExtent3d copySize
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$wgpuCommandEncoderCopyTextureToBuffer);
        try {
            hFunction.invokeExact(
                commandEncoder.segment(),
                source.segment(),
                destination.segment(),
                copySize.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void commandEncoderCopyTextureToTexture(
        WGPUCommandEncoder commandEncoder,
        @Pointer IWGPUTexelCopyTextureInfo source,
        @Pointer IWGPUTexelCopyTextureInfo destination,
        @Pointer IWGPUExtent3d copySize
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$wgpuCommandEncoderCopyTextureToTexture);
        try {
            hFunction.invokeExact(
                commandEncoder.segment(),
                source.segment(),
                destination.segment(),
                copySize.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public @Nullable WGPUCommandBuffer commandEncoderFinish(
        WGPUCommandEncoder commandEncoder,
        @Nullable @Pointer IWGPUCommandBufferDescriptor descriptor
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$wgpuCommandEncoderFinish);
        try {
            MemorySegment s = (MemorySegment) hFunction.invokeExact(
                commandEncoder.segment(),
                (MemorySegment) (descriptor != null ? descriptor.segment() : MemorySegment.NULL)
            );
            return s.equals(MemorySegment.NULL) ? null : new WGPUCommandBuffer(s);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void commandEncoderInsertDebugMarker(
        WGPUCommandEncoder commandEncoder,
        WGPUStringView markerLabel
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$wgpuCommandEncoderInsertDebugMarker);
        try {
            hFunction.invokeExact(
                commandEncoder.segment(),
                markerLabel.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void commandEncoderPopDebugGroup(
        WGPUCommandEncoder commandEncoder
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$wgpuCommandEncoderPopDebugGroup);
        try {
            hFunction.invokeExact(
                commandEncoder.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void commandEncoderPushDebugGroup(
        WGPUCommandEncoder commandEncoder,
        WGPUStringView groupLabel
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$wgpuCommandEncoderPushDebugGroup);
        try {
            hFunction.invokeExact(
                commandEncoder.segment(),
                groupLabel.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void commandEncoderRelease(
        WGPUCommandEncoder commandEncoder
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$wgpuCommandEncoderRelease);
        try {
            hFunction.invokeExact(
                commandEncoder.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void commandEncoderResolveQuerySet(
        WGPUCommandEncoder commandEncoder,
        WGPUQuerySet querySet,
        @Unsigned int firstQuery,
        @Unsigned int queryCount,
        WGPUBuffer destination,
        @Unsigned long destinationOffset
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$wgpuCommandEncoderResolveQuerySet);
        try {
            hFunction.invokeExact(
                commandEncoder.segment(),
                querySet.segment(),
                firstQuery,
                queryCount,
                destination.segment(),
                destinationOffset
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void commandEncoderSetLabel(
        WGPUCommandEncoder commandEncoder,
        WGPUStringView label
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$wgpuCommandEncoderSetLabel);
        try {
            hFunction.invokeExact(
                commandEncoder.segment(),
                label.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void commandEncoderWriteTimestamp(
        WGPUCommandEncoder commandEncoder,
        WGPUQuerySet querySet,
        @Unsigned int queryIndex
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$wgpuCommandEncoderWriteTimestamp);
        try {
            hFunction.invokeExact(
                commandEncoder.segment(),
                querySet.segment(),
                queryIndex
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void computePassEncoderAddRef(
        WGPUComputePassEncoder computePassEncoder
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$wgpuComputePassEncoderAddRef);
        try {
            hFunction.invokeExact(
                computePassEncoder.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void computePassEncoderDispatchWorkgroups(
        WGPUComputePassEncoder computePassEncoder,
        @Unsigned int workgroupcountx,
        @Unsigned int workgroupcounty,
        @Unsigned int workgroupcountz
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$wgpuComputePassEncoderDispatchWorkgroups);
        try {
            hFunction.invokeExact(
                computePassEncoder.segment(),
                workgroupcountx,
                workgroupcounty,
                workgroupcountz
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void computePassEncoderDispatchWorkgroupsIndirect(
        WGPUComputePassEncoder computePassEncoder,
        WGPUBuffer indirectBuffer,
        @Unsigned long indirectOffset
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$wgpuComputePassEncoderDispatchWorkgroupsIndirect);
        try {
            hFunction.invokeExact(
                computePassEncoder.segment(),
                indirectBuffer.segment(),
                indirectOffset
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void computePassEncoderEnd(
        WGPUComputePassEncoder computePassEncoder
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$wgpuComputePassEncoderEnd);
        try {
            hFunction.invokeExact(
                computePassEncoder.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void computePassEncoderInsertDebugMarker(
        WGPUComputePassEncoder computePassEncoder,
        WGPUStringView markerLabel
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$wgpuComputePassEncoderInsertDebugMarker);
        try {
            hFunction.invokeExact(
                computePassEncoder.segment(),
                markerLabel.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void computePassEncoderPopDebugGroup(
        WGPUComputePassEncoder computePassEncoder
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$wgpuComputePassEncoderPopDebugGroup);
        try {
            hFunction.invokeExact(
                computePassEncoder.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void computePassEncoderPushDebugGroup(
        WGPUComputePassEncoder computePassEncoder,
        WGPUStringView groupLabel
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$wgpuComputePassEncoderPushDebugGroup);
        try {
            hFunction.invokeExact(
                computePassEncoder.segment(),
                groupLabel.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void computePassEncoderRelease(
        WGPUComputePassEncoder computePassEncoder
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$wgpuComputePassEncoderRelease);
        try {
            hFunction.invokeExact(
                computePassEncoder.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void computePassEncoderSetBindGroup(
        WGPUComputePassEncoder computePassEncoder,
        @Unsigned int groupIndex,
        @Nullable WGPUBindGroup group,
        @Unsigned IntPtr dynamicOffsets
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$wgpuComputePassEncoderSetBindGroup);
        try {
            hFunction.invokeExact(
                computePassEncoder.segment(),
                groupIndex,
                (MemorySegment) (group != null ? group.segment() : MemorySegment.NULL),
                dynamicOffsets.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void computePassEncoderSetLabel(
        WGPUComputePassEncoder computePassEncoder,
        WGPUStringView label
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$wgpuComputePassEncoderSetLabel);
        try {
            hFunction.invokeExact(
                computePassEncoder.segment(),
                label.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void computePassEncoderSetPipeline(
        WGPUComputePassEncoder computePassEncoder,
        WGPUComputePipeline pipeline
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$wgpuComputePassEncoderSetPipeline);
        try {
            hFunction.invokeExact(
                computePassEncoder.segment(),
                pipeline.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void computePipelineAddRef(
        WGPUComputePipeline computePipeline
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$wgpuComputePipelineAddRef);
        try {
            hFunction.invokeExact(
                computePipeline.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public @Nullable WGPUBindGroupLayout computePipelineGetBindGroupLayout(
        WGPUComputePipeline computePipeline,
        @Unsigned int groupIndex
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$wgpuComputePipelineGetBindGroupLayout);
        try {
            MemorySegment s = (MemorySegment) hFunction.invokeExact(
                computePipeline.segment(),
                groupIndex
            );
            return s.equals(MemorySegment.NULL) ? null : new WGPUBindGroupLayout(s);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void computePipelineRelease(
        WGPUComputePipeline computePipeline
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$wgpuComputePipelineRelease);
        try {
            hFunction.invokeExact(
                computePipeline.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void computePipelineSetLabel(
        WGPUComputePipeline computePipeline,
        WGPUStringView label
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$wgpuComputePipelineSetLabel);
        try {
            hFunction.invokeExact(
                computePipeline.segment(),
                label.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public @Nullable WGPUInstance createInstance(
        @Nullable @Pointer IWGPUInstanceDescriptor descriptor
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$wgpuCreateInstance);
        try {
            MemorySegment s = (MemorySegment) hFunction.invokeExact(
                (MemorySegment) (descriptor != null ? descriptor.segment() : MemorySegment.NULL)
            );
            return s.equals(MemorySegment.NULL) ? null : new WGPUInstance(s);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void deviceAddRef(
        WGPUDevice device
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$wgpuDeviceAddRef);
        try {
            hFunction.invokeExact(
                device.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public @Nullable WGPUBindGroup deviceCreateBindGroup(
        WGPUDevice device,
        @Pointer IWGPUBindGroupDescriptor descriptor
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$wgpuDeviceCreateBindGroup);
        try {
            MemorySegment s = (MemorySegment) hFunction.invokeExact(
                device.segment(),
                descriptor.segment()
            );
            return s.equals(MemorySegment.NULL) ? null : new WGPUBindGroup(s);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public @Nullable WGPUBindGroupLayout deviceCreateBindGroupLayout(
        WGPUDevice device,
        @Pointer IWGPUBindGroupLayoutDescriptor descriptor
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$wgpuDeviceCreateBindGroupLayout);
        try {
            MemorySegment s = (MemorySegment) hFunction.invokeExact(
                device.segment(),
                descriptor.segment()
            );
            return s.equals(MemorySegment.NULL) ? null : new WGPUBindGroupLayout(s);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public @Nullable WGPUBuffer deviceCreateBuffer(
        WGPUDevice device,
        @Pointer IWGPUBufferDescriptor descriptor
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$wgpuDeviceCreateBuffer);
        try {
            MemorySegment s = (MemorySegment) hFunction.invokeExact(
                device.segment(),
                descriptor.segment()
            );
            return s.equals(MemorySegment.NULL) ? null : new WGPUBuffer(s);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public @Nullable WGPUCommandEncoder deviceCreateCommandEncoder(
        WGPUDevice device,
        @Nullable @Pointer IWGPUCommandEncoderDescriptor descriptor
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$wgpuDeviceCreateCommandEncoder);
        try {
            MemorySegment s = (MemorySegment) hFunction.invokeExact(
                device.segment(),
                (MemorySegment) (descriptor != null ? descriptor.segment() : MemorySegment.NULL)
            );
            return s.equals(MemorySegment.NULL) ? null : new WGPUCommandEncoder(s);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public @Nullable WGPUComputePipeline deviceCreateComputePipeline(
        WGPUDevice device,
        @Pointer IWGPUComputePipelineDescriptor descriptor
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$wgpuDeviceCreateComputePipeline);
        try {
            MemorySegment s = (MemorySegment) hFunction.invokeExact(
                device.segment(),
                descriptor.segment()
            );
            return s.equals(MemorySegment.NULL) ? null : new WGPUComputePipeline(s);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void deviceCreateComputePipelineAsync(
        WGPUDevice device,
        @Pointer IWGPUComputePipelineDescriptor descriptor,
        @Pointer(comment="PFN_wgpuCreateComputePipelineAsync") @NotNull MemorySegment callback,
        @Pointer(comment="void*") @NotNull MemorySegment userdata
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$wgpuDeviceCreateComputePipelineAsync);
        try {
            hFunction.invokeExact(
                device.segment(),
                descriptor.segment(),
                callback,
                userdata
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public @Nullable WGPUPipelineLayout deviceCreatePipelineLayout(
        WGPUDevice device,
        @Pointer IWGPUPipelineLayoutDescriptor descriptor
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$wgpuDeviceCreatePipelineLayout);
        try {
            MemorySegment s = (MemorySegment) hFunction.invokeExact(
                device.segment(),
                descriptor.segment()
            );
            return s.equals(MemorySegment.NULL) ? null : new WGPUPipelineLayout(s);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public @Nullable WGPUQuerySet deviceCreateQuerySet(
        WGPUDevice device,
        @Pointer IWGPUQuerySetDescriptor descriptor
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$wgpuDeviceCreateQuerySet);
        try {
            MemorySegment s = (MemorySegment) hFunction.invokeExact(
                device.segment(),
                descriptor.segment()
            );
            return s.equals(MemorySegment.NULL) ? null : new WGPUQuerySet(s);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public @Nullable WGPURenderBundleEncoder deviceCreateRenderBundleEncoder(
        WGPUDevice device,
        @Pointer IWGPURenderBundleEncoderDescriptor descriptor
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$wgpuDeviceCreateRenderBundleEncoder);
        try {
            MemorySegment s = (MemorySegment) hFunction.invokeExact(
                device.segment(),
                descriptor.segment()
            );
            return s.equals(MemorySegment.NULL) ? null : new WGPURenderBundleEncoder(s);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public @Nullable WGPURenderPipeline deviceCreateRenderPipeline(
        WGPUDevice device,
        @Pointer IWGPURenderPipelineDescriptor descriptor
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$wgpuDeviceCreateRenderPipeline);
        try {
            MemorySegment s = (MemorySegment) hFunction.invokeExact(
                device.segment(),
                descriptor.segment()
            );
            return s.equals(MemorySegment.NULL) ? null : new WGPURenderPipeline(s);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void deviceCreateRenderPipelineAsync(
        WGPUDevice device,
        @Pointer IWGPURenderPipelineDescriptor descriptor,
        @Pointer(comment="PFN_wgpuCreateRenderPipelineAsync") @NotNull MemorySegment callback,
        @Pointer(comment="void*") @NotNull MemorySegment userdata
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$wgpuDeviceCreateRenderPipelineAsync);
        try {
            hFunction.invokeExact(
                device.segment(),
                descriptor.segment(),
                callback,
                userdata
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public @Nullable WGPUSampler deviceCreateSampler(
        WGPUDevice device,
        @Nullable @Pointer IWGPUSamplerDescriptor descriptor
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$wgpuDeviceCreateSampler);
        try {
            MemorySegment s = (MemorySegment) hFunction.invokeExact(
                device.segment(),
                (MemorySegment) (descriptor != null ? descriptor.segment() : MemorySegment.NULL)
            );
            return s.equals(MemorySegment.NULL) ? null : new WGPUSampler(s);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public @Nullable WGPUShaderModule deviceCreateShaderModule(
        WGPUDevice device,
        @Pointer IWGPUShaderModuleDescriptor descriptor
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$wgpuDeviceCreateShaderModule);
        try {
            MemorySegment s = (MemorySegment) hFunction.invokeExact(
                device.segment(),
                descriptor.segment()
            );
            return s.equals(MemorySegment.NULL) ? null : new WGPUShaderModule(s);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public @Nullable WGPUTexture deviceCreateTexture(
        WGPUDevice device,
        @Pointer IWGPUTextureDescriptor descriptor
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$wgpuDeviceCreateTexture);
        try {
            MemorySegment s = (MemorySegment) hFunction.invokeExact(
                device.segment(),
                descriptor.segment()
            );
            return s.equals(MemorySegment.NULL) ? null : new WGPUTexture(s);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void deviceDestroy(
        WGPUDevice device
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$wgpuDeviceDestroy);
        try {
            hFunction.invokeExact(
                device.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public WGPUAdapterInfo deviceGetAdapterInfo(
        WGPUDevice device
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$wgpuDeviceGetAdapterInfo);
        try {
            return new WGPUAdapterInfo((MemorySegment) hFunction.invokeExact(
                device.segment()
            ));
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void deviceGetFeatures(
        WGPUDevice device,
        @Pointer IWGPUSupportedFeatures features
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$wgpuDeviceGetFeatures);
        try {
            hFunction.invokeExact(
                device.segment(),
                features.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public @EnumType(WGPUStatus.class) int deviceGetLimits(
        WGPUDevice device,
        @Pointer IWGPULimits limits
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$wgpuDeviceGetLimits);
        try {
            return (int) hFunction.invokeExact(
                device.segment(),
                limits.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public WGPUFuture deviceGetLostFuture(
        WGPUDevice device
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$wgpuDeviceGetLostFuture);
        try {
            return new WGPUFuture((MemorySegment) hFunction.invokeExact(
                device.segment()
            ));
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public @Nullable WGPUQueue deviceGetQueue(
        WGPUDevice device
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$wgpuDeviceGetQueue);
        try {
            MemorySegment s = (MemorySegment) hFunction.invokeExact(
                device.segment()
            );
            return s.equals(MemorySegment.NULL) ? null : new WGPUQueue(s);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public @NativeType("boolean") boolean deviceHasFeature(
        WGPUDevice device,
        @EnumType(WGPUFeatureName.class) int feature
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$wgpuDeviceHasFeature);
        try {
            return (boolean) hFunction.invokeExact(
                device.segment(),
                feature
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void devicePopErrorScope(
        WGPUDevice device,
        @Pointer(comment="PFN_wgpuPopErrorScope") @NotNull MemorySegment callback,
        @Pointer(comment="void*") @NotNull MemorySegment userdata
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$wgpuDevicePopErrorScope);
        try {
            hFunction.invokeExact(
                device.segment(),
                callback,
                userdata
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void devicePushErrorScope(
        WGPUDevice device,
        @EnumType(WGPUErrorFilter.class) int filter
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$wgpuDevicePushErrorScope);
        try {
            hFunction.invokeExact(
                device.segment(),
                filter
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void deviceRelease(
        WGPUDevice device
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$wgpuDeviceRelease);
        try {
            hFunction.invokeExact(
                device.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void deviceSetLabel(
        WGPUDevice device,
        WGPUStringView label
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$wgpuDeviceSetLabel);
        try {
            hFunction.invokeExact(
                device.segment(),
                label.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public @EnumType(WGPUStatus.class) int getInstanceCapabilities(
        @Pointer IWGPUInstanceCapabilities capabilities
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$wgpuGetInstanceCapabilities);
        try {
            return (int) hFunction.invokeExact(
                capabilities.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void instanceAddRef(
        WGPUInstance instance
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$wgpuInstanceAddRef);
        try {
            hFunction.invokeExact(
                instance.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public @Nullable WGPUSurface instanceCreateSurface(
        WGPUInstance instance,
        @Pointer IWGPUSurfaceDescriptor descriptor
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$wgpuInstanceCreateSurface);
        try {
            MemorySegment s = (MemorySegment) hFunction.invokeExact(
                instance.segment(),
                descriptor.segment()
            );
            return s.equals(MemorySegment.NULL) ? null : new WGPUSurface(s);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public @EnumType(WGPUStatus.class) int instanceGetWgslLanguageFeatures(
        WGPUInstance instance,
        @Pointer IWGPUSupportedWgslLanguageFeatures features
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$wgpuInstanceGetWgslLanguageFeatures);
        try {
            return (int) hFunction.invokeExact(
                instance.segment(),
                features.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public @NativeType("boolean") boolean instanceHasWgslLanguageFeature(
        WGPUInstance instance,
        @EnumType(WGPUWgslLanguageFeatureName.class) int feature
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$wgpuInstanceHasWgslLanguageFeature);
        try {
            return (boolean) hFunction.invokeExact(
                instance.segment(),
                feature
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void instanceProcessEvents(
        WGPUInstance instance
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$wgpuInstanceProcessEvents);
        try {
            hFunction.invokeExact(
                instance.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void instanceRelease(
        WGPUInstance instance
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$wgpuInstanceRelease);
        try {
            hFunction.invokeExact(
                instance.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void instanceRequestAdapter(
        WGPUInstance instance,
        @Nullable @Pointer IWGPURequestAdapterOptions options,
        @Pointer(comment="PFN_wgpuRequestAdapter") @NotNull MemorySegment callback,
        @Pointer(comment="void*") @NotNull MemorySegment userdata
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$wgpuInstanceRequestAdapter);
        try {
            hFunction.invokeExact(
                instance.segment(),
                (MemorySegment) (options != null ? options.segment() : MemorySegment.NULL),
                callback,
                userdata
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public @EnumType(WGPUWaitStatus.class) int instanceWaitAny(
        WGPUInstance instance,
        long futureCount,
        @Nullable @Pointer IWGPUFutureWaitInfo futures,
        @Unsigned long timeoutNs
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$wgpuInstanceWaitAny);
        try {
            return (int) hFunction.invokeExact(
                instance.segment(),
                MemorySegment.ofAddress(futureCount),
                (MemorySegment) (futures != null ? futures.segment() : MemorySegment.NULL),
                timeoutNs
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void pipelineLayoutAddRef(
        WGPUPipelineLayout pipelineLayout
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$wgpuPipelineLayoutAddRef);
        try {
            hFunction.invokeExact(
                pipelineLayout.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void pipelineLayoutRelease(
        WGPUPipelineLayout pipelineLayout
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$wgpuPipelineLayoutRelease);
        try {
            hFunction.invokeExact(
                pipelineLayout.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void pipelineLayoutSetLabel(
        WGPUPipelineLayout pipelineLayout,
        WGPUStringView label
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$wgpuPipelineLayoutSetLabel);
        try {
            hFunction.invokeExact(
                pipelineLayout.segment(),
                label.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void querySetAddRef(
        WGPUQuerySet querySet
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$wgpuQuerySetAddRef);
        try {
            hFunction.invokeExact(
                querySet.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void querySetDestroy(
        WGPUQuerySet querySet
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$wgpuQuerySetDestroy);
        try {
            hFunction.invokeExact(
                querySet.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public @Unsigned int querySetGetCount(
        WGPUQuerySet querySet
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$wgpuQuerySetGetCount);
        try {
            return (int) hFunction.invokeExact(
                querySet.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public @EnumType(WGPUQueryType.class) int querySetGetType(
        WGPUQuerySet querySet
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$wgpuQuerySetGetType);
        try {
            return (int) hFunction.invokeExact(
                querySet.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void querySetRelease(
        WGPUQuerySet querySet
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$wgpuQuerySetRelease);
        try {
            hFunction.invokeExact(
                querySet.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void querySetSetLabel(
        WGPUQuerySet querySet,
        WGPUStringView label
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$wgpuQuerySetSetLabel);
        try {
            hFunction.invokeExact(
                querySet.segment(),
                label.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void queueAddRef(
        WGPUQueue queue
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$wgpuQueueAddRef);
        try {
            hFunction.invokeExact(
                queue.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void queueOnSubmittedWorkDone(
        WGPUQueue queue,
        @Pointer(comment="PFN_wgpuQueueWorkDone") @NotNull MemorySegment callback,
        @Pointer(comment="void*") @NotNull MemorySegment userdata
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$wgpuQueueOnSubmittedWorkDone);
        try {
            hFunction.invokeExact(
                queue.segment(),
                callback,
                userdata
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void queueRelease(
        WGPUQueue queue
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$wgpuQueueRelease);
        try {
            hFunction.invokeExact(
                queue.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void queueSetLabel(
        WGPUQueue queue,
        WGPUStringView label
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$wgpuQueueSetLabel);
        try {
            hFunction.invokeExact(
                queue.segment(),
                label.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void queueSubmit(
        WGPUQueue queue,
        @Pointer WGPUCommandBuffer.Ptr commands
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$wgpuQueueSubmit);
        try {
            hFunction.invokeExact(
                queue.segment(),
                commands.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void queueWriteBuffer(
        WGPUQueue queue,
        WGPUBuffer buffer,
        @Unsigned long bufferOffset,
        @Pointer(comment="void*") @NotNull MemorySegment data,
        long size
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$wgpuQueueWriteBuffer);
        try {
            hFunction.invokeExact(
                queue.segment(),
                buffer.segment(),
                bufferOffset,
                data,
                MemorySegment.ofAddress(size)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void queueWriteTexture(
        WGPUQueue queue,
        @Pointer IWGPUTexelCopyTextureInfo destination,
        @Pointer(comment="void*") @NotNull MemorySegment data,
        long dataSize,
        @Pointer IWGPUTexelCopyBufferLayout dataLayout,
        @Pointer IWGPUExtent3d writeSize
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$wgpuQueueWriteTexture);
        try {
            hFunction.invokeExact(
                queue.segment(),
                destination.segment(),
                data,
                MemorySegment.ofAddress(dataSize),
                dataLayout.segment(),
                writeSize.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void renderBundleAddRef(
        WGPURenderBundle renderBundle
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$wgpuRenderBundleAddRef);
        try {
            hFunction.invokeExact(
                renderBundle.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void renderBundleEncoderAddRef(
        WGPURenderBundleEncoder renderBundleEncoder
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$wgpuRenderBundleEncoderAddRef);
        try {
            hFunction.invokeExact(
                renderBundleEncoder.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void renderBundleEncoderDraw(
        WGPURenderBundleEncoder renderBundleEncoder,
        @Unsigned int vertexCount,
        @Unsigned int instanceCount,
        @Unsigned int firstVertex,
        @Unsigned int firstInstance
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$wgpuRenderBundleEncoderDraw);
        try {
            hFunction.invokeExact(
                renderBundleEncoder.segment(),
                vertexCount,
                instanceCount,
                firstVertex,
                firstInstance
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void renderBundleEncoderDrawIndexed(
        WGPURenderBundleEncoder renderBundleEncoder,
        @Unsigned int indexCount,
        @Unsigned int instanceCount,
        @Unsigned int firstIndex,
        int baseVertex,
        @Unsigned int firstInstance
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$wgpuRenderBundleEncoderDrawIndexed);
        try {
            hFunction.invokeExact(
                renderBundleEncoder.segment(),
                indexCount,
                instanceCount,
                firstIndex,
                baseVertex,
                firstInstance
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void renderBundleEncoderDrawIndexedIndirect(
        WGPURenderBundleEncoder renderBundleEncoder,
        WGPUBuffer indirectBuffer,
        @Unsigned long indirectOffset
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$wgpuRenderBundleEncoderDrawIndexedIndirect);
        try {
            hFunction.invokeExact(
                renderBundleEncoder.segment(),
                indirectBuffer.segment(),
                indirectOffset
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void renderBundleEncoderDrawIndirect(
        WGPURenderBundleEncoder renderBundleEncoder,
        WGPUBuffer indirectBuffer,
        @Unsigned long indirectOffset
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$wgpuRenderBundleEncoderDrawIndirect);
        try {
            hFunction.invokeExact(
                renderBundleEncoder.segment(),
                indirectBuffer.segment(),
                indirectOffset
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public @Nullable WGPURenderBundle renderBundleEncoderFinish(
        WGPURenderBundleEncoder renderBundleEncoder,
        @Nullable @Pointer IWGPURenderBundleDescriptor descriptor
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$wgpuRenderBundleEncoderFinish);
        try {
            MemorySegment s = (MemorySegment) hFunction.invokeExact(
                renderBundleEncoder.segment(),
                (MemorySegment) (descriptor != null ? descriptor.segment() : MemorySegment.NULL)
            );
            return s.equals(MemorySegment.NULL) ? null : new WGPURenderBundle(s);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void renderBundleEncoderInsertDebugMarker(
        WGPURenderBundleEncoder renderBundleEncoder,
        WGPUStringView markerLabel
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$wgpuRenderBundleEncoderInsertDebugMarker);
        try {
            hFunction.invokeExact(
                renderBundleEncoder.segment(),
                markerLabel.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void renderBundleEncoderPopDebugGroup(
        WGPURenderBundleEncoder renderBundleEncoder
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$wgpuRenderBundleEncoderPopDebugGroup);
        try {
            hFunction.invokeExact(
                renderBundleEncoder.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void renderBundleEncoderPushDebugGroup(
        WGPURenderBundleEncoder renderBundleEncoder,
        WGPUStringView groupLabel
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$wgpuRenderBundleEncoderPushDebugGroup);
        try {
            hFunction.invokeExact(
                renderBundleEncoder.segment(),
                groupLabel.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void renderBundleEncoderRelease(
        WGPURenderBundleEncoder renderBundleEncoder
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$wgpuRenderBundleEncoderRelease);
        try {
            hFunction.invokeExact(
                renderBundleEncoder.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void renderBundleEncoderSetBindGroup(
        WGPURenderBundleEncoder renderBundleEncoder,
        @Unsigned int groupIndex,
        @Nullable WGPUBindGroup group,
        @Unsigned IntPtr dynamicOffsets
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$wgpuRenderBundleEncoderSetBindGroup);
        try {
            hFunction.invokeExact(
                renderBundleEncoder.segment(),
                groupIndex,
                (MemorySegment) (group != null ? group.segment() : MemorySegment.NULL),
                dynamicOffsets.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void renderBundleEncoderSetIndexBuffer(
        WGPURenderBundleEncoder renderBundleEncoder,
        WGPUBuffer buffer,
        @EnumType(WGPUIndexFormat.class) int format,
        @Unsigned long offset,
        @Unsigned long size
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$wgpuRenderBundleEncoderSetIndexBuffer);
        try {
            hFunction.invokeExact(
                renderBundleEncoder.segment(),
                buffer.segment(),
                format,
                offset,
                size
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void renderBundleEncoderSetLabel(
        WGPURenderBundleEncoder renderBundleEncoder,
        WGPUStringView label
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$wgpuRenderBundleEncoderSetLabel);
        try {
            hFunction.invokeExact(
                renderBundleEncoder.segment(),
                label.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void renderBundleEncoderSetPipeline(
        WGPURenderBundleEncoder renderBundleEncoder,
        WGPURenderPipeline pipeline
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$wgpuRenderBundleEncoderSetPipeline);
        try {
            hFunction.invokeExact(
                renderBundleEncoder.segment(),
                pipeline.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void renderBundleEncoderSetVertexBuffer(
        WGPURenderBundleEncoder renderBundleEncoder,
        @Unsigned int slot,
        @Nullable WGPUBuffer buffer,
        @Unsigned long offset,
        @Unsigned long size
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$wgpuRenderBundleEncoderSetVertexBuffer);
        try {
            hFunction.invokeExact(
                renderBundleEncoder.segment(),
                slot,
                (MemorySegment) (buffer != null ? buffer.segment() : MemorySegment.NULL),
                offset,
                size
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void renderBundleRelease(
        WGPURenderBundle renderBundle
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$wgpuRenderBundleRelease);
        try {
            hFunction.invokeExact(
                renderBundle.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void renderBundleSetLabel(
        WGPURenderBundle renderBundle,
        WGPUStringView label
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$wgpuRenderBundleSetLabel);
        try {
            hFunction.invokeExact(
                renderBundle.segment(),
                label.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void renderPassEncoderAddRef(
        WGPURenderPassEncoder renderPassEncoder
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$wgpuRenderPassEncoderAddRef);
        try {
            hFunction.invokeExact(
                renderPassEncoder.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void renderPassEncoderBeginOcclusionQuery(
        WGPURenderPassEncoder renderPassEncoder,
        @Unsigned int queryIndex
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$wgpuRenderPassEncoderBeginOcclusionQuery);
        try {
            hFunction.invokeExact(
                renderPassEncoder.segment(),
                queryIndex
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void renderPassEncoderDraw(
        WGPURenderPassEncoder renderPassEncoder,
        @Unsigned int vertexCount,
        @Unsigned int instanceCount,
        @Unsigned int firstVertex,
        @Unsigned int firstInstance
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$wgpuRenderPassEncoderDraw);
        try {
            hFunction.invokeExact(
                renderPassEncoder.segment(),
                vertexCount,
                instanceCount,
                firstVertex,
                firstInstance
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void renderPassEncoderDrawIndexed(
        WGPURenderPassEncoder renderPassEncoder,
        @Unsigned int indexCount,
        @Unsigned int instanceCount,
        @Unsigned int firstIndex,
        int baseVertex,
        @Unsigned int firstInstance
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$wgpuRenderPassEncoderDrawIndexed);
        try {
            hFunction.invokeExact(
                renderPassEncoder.segment(),
                indexCount,
                instanceCount,
                firstIndex,
                baseVertex,
                firstInstance
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void renderPassEncoderDrawIndexedIndirect(
        WGPURenderPassEncoder renderPassEncoder,
        WGPUBuffer indirectBuffer,
        @Unsigned long indirectOffset
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$wgpuRenderPassEncoderDrawIndexedIndirect);
        try {
            hFunction.invokeExact(
                renderPassEncoder.segment(),
                indirectBuffer.segment(),
                indirectOffset
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void renderPassEncoderDrawIndirect(
        WGPURenderPassEncoder renderPassEncoder,
        WGPUBuffer indirectBuffer,
        @Unsigned long indirectOffset
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$wgpuRenderPassEncoderDrawIndirect);
        try {
            hFunction.invokeExact(
                renderPassEncoder.segment(),
                indirectBuffer.segment(),
                indirectOffset
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void renderPassEncoderEnd(
        WGPURenderPassEncoder renderPassEncoder
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$wgpuRenderPassEncoderEnd);
        try {
            hFunction.invokeExact(
                renderPassEncoder.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void renderPassEncoderEndOcclusionQuery(
        WGPURenderPassEncoder renderPassEncoder
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$wgpuRenderPassEncoderEndOcclusionQuery);
        try {
            hFunction.invokeExact(
                renderPassEncoder.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void renderPassEncoderExecuteBundles(
        WGPURenderPassEncoder renderPassEncoder,
        @Pointer WGPURenderBundle.Ptr bundles
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$wgpuRenderPassEncoderExecuteBundles);
        try {
            hFunction.invokeExact(
                renderPassEncoder.segment(),
                bundles.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void renderPassEncoderInsertDebugMarker(
        WGPURenderPassEncoder renderPassEncoder,
        WGPUStringView markerLabel
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$wgpuRenderPassEncoderInsertDebugMarker);
        try {
            hFunction.invokeExact(
                renderPassEncoder.segment(),
                markerLabel.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void renderPassEncoderPopDebugGroup(
        WGPURenderPassEncoder renderPassEncoder
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$wgpuRenderPassEncoderPopDebugGroup);
        try {
            hFunction.invokeExact(
                renderPassEncoder.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void renderPassEncoderPushDebugGroup(
        WGPURenderPassEncoder renderPassEncoder,
        WGPUStringView groupLabel
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$wgpuRenderPassEncoderPushDebugGroup);
        try {
            hFunction.invokeExact(
                renderPassEncoder.segment(),
                groupLabel.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void renderPassEncoderRelease(
        WGPURenderPassEncoder renderPassEncoder
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$wgpuRenderPassEncoderRelease);
        try {
            hFunction.invokeExact(
                renderPassEncoder.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void renderPassEncoderSetBindGroup(
        WGPURenderPassEncoder renderPassEncoder,
        @Unsigned int groupIndex,
        @Nullable WGPUBindGroup group,
        @Unsigned IntPtr dynamicOffsets
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$wgpuRenderPassEncoderSetBindGroup);
        try {
            hFunction.invokeExact(
                renderPassEncoder.segment(),
                groupIndex,
                (MemorySegment) (group != null ? group.segment() : MemorySegment.NULL),
                dynamicOffsets.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void renderPassEncoderSetBlendConstant(
        WGPURenderPassEncoder renderPassEncoder,
        @Pointer IWGPUColor color
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$wgpuRenderPassEncoderSetBlendConstant);
        try {
            hFunction.invokeExact(
                renderPassEncoder.segment(),
                color.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void renderPassEncoderSetIndexBuffer(
        WGPURenderPassEncoder renderPassEncoder,
        WGPUBuffer buffer,
        @EnumType(WGPUIndexFormat.class) int format,
        @Unsigned long offset,
        @Unsigned long size
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$wgpuRenderPassEncoderSetIndexBuffer);
        try {
            hFunction.invokeExact(
                renderPassEncoder.segment(),
                buffer.segment(),
                format,
                offset,
                size
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void renderPassEncoderSetLabel(
        WGPURenderPassEncoder renderPassEncoder,
        WGPUStringView label
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$wgpuRenderPassEncoderSetLabel);
        try {
            hFunction.invokeExact(
                renderPassEncoder.segment(),
                label.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void renderPassEncoderSetPipeline(
        WGPURenderPassEncoder renderPassEncoder,
        WGPURenderPipeline pipeline
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$wgpuRenderPassEncoderSetPipeline);
        try {
            hFunction.invokeExact(
                renderPassEncoder.segment(),
                pipeline.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void renderPassEncoderSetScissorRect(
        WGPURenderPassEncoder renderPassEncoder,
        @Unsigned int x,
        @Unsigned int y,
        @Unsigned int width,
        @Unsigned int height
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$wgpuRenderPassEncoderSetScissorRect);
        try {
            hFunction.invokeExact(
                renderPassEncoder.segment(),
                x,
                y,
                width,
                height
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void renderPassEncoderSetStencilReference(
        WGPURenderPassEncoder renderPassEncoder,
        @Unsigned int reference
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$wgpuRenderPassEncoderSetStencilReference);
        try {
            hFunction.invokeExact(
                renderPassEncoder.segment(),
                reference
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void renderPassEncoderSetVertexBuffer(
        WGPURenderPassEncoder renderPassEncoder,
        @Unsigned int slot,
        @Nullable WGPUBuffer buffer,
        @Unsigned long offset,
        @Unsigned long size
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$wgpuRenderPassEncoderSetVertexBuffer);
        try {
            hFunction.invokeExact(
                renderPassEncoder.segment(),
                slot,
                (MemorySegment) (buffer != null ? buffer.segment() : MemorySegment.NULL),
                offset,
                size
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void renderPassEncoderSetViewport(
        WGPURenderPassEncoder renderPassEncoder,
        float x,
        float y,
        float width,
        float height,
        float minDepth,
        float maxDepth
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$wgpuRenderPassEncoderSetViewport);
        try {
            hFunction.invokeExact(
                renderPassEncoder.segment(),
                x,
                y,
                width,
                height,
                minDepth,
                maxDepth
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void renderPipelineAddRef(
        WGPURenderPipeline renderPipeline
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$wgpuRenderPipelineAddRef);
        try {
            hFunction.invokeExact(
                renderPipeline.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public @Nullable WGPUBindGroupLayout renderPipelineGetBindGroupLayout(
        WGPURenderPipeline renderPipeline,
        @Unsigned int groupIndex
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$wgpuRenderPipelineGetBindGroupLayout);
        try {
            MemorySegment s = (MemorySegment) hFunction.invokeExact(
                renderPipeline.segment(),
                groupIndex
            );
            return s.equals(MemorySegment.NULL) ? null : new WGPUBindGroupLayout(s);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void renderPipelineRelease(
        WGPURenderPipeline renderPipeline
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$wgpuRenderPipelineRelease);
        try {
            hFunction.invokeExact(
                renderPipeline.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void renderPipelineSetLabel(
        WGPURenderPipeline renderPipeline,
        WGPUStringView label
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$wgpuRenderPipelineSetLabel);
        try {
            hFunction.invokeExact(
                renderPipeline.segment(),
                label.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void samplerAddRef(
        WGPUSampler sampler
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$wgpuSamplerAddRef);
        try {
            hFunction.invokeExact(
                sampler.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void samplerRelease(
        WGPUSampler sampler
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$wgpuSamplerRelease);
        try {
            hFunction.invokeExact(
                sampler.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void samplerSetLabel(
        WGPUSampler sampler,
        WGPUStringView label
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$wgpuSamplerSetLabel);
        try {
            hFunction.invokeExact(
                sampler.segment(),
                label.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void shaderModuleAddRef(
        WGPUShaderModule shaderModule
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$wgpuShaderModuleAddRef);
        try {
            hFunction.invokeExact(
                shaderModule.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void shaderModuleGetCompilationInfo(
        WGPUShaderModule shaderModule,
        @Pointer(comment="PFN_wgpuCompilationInfo") @NotNull MemorySegment callback,
        @Pointer(comment="void*") @NotNull MemorySegment userdata
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$wgpuShaderModuleGetCompilationInfo);
        try {
            hFunction.invokeExact(
                shaderModule.segment(),
                callback,
                userdata
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void shaderModuleRelease(
        WGPUShaderModule shaderModule
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$wgpuShaderModuleRelease);
        try {
            hFunction.invokeExact(
                shaderModule.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void shaderModuleSetLabel(
        WGPUShaderModule shaderModule,
        WGPUStringView label
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$wgpuShaderModuleSetLabel);
        try {
            hFunction.invokeExact(
                shaderModule.segment(),
                label.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void surfaceAddRef(
        WGPUSurface surface
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$wgpuSurfaceAddRef);
        try {
            hFunction.invokeExact(
                surface.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void surfaceConfigure(
        WGPUSurface surface,
        @Pointer IWGPUSurfaceConfiguration config
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$wgpuSurfaceConfigure);
        try {
            hFunction.invokeExact(
                surface.segment(),
                config.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public @EnumType(WGPUStatus.class) int surfaceGetCapabilities(
        WGPUSurface surface,
        WGPUAdapter adapter,
        @Pointer IWGPUSurfaceCapabilities capabilities
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$wgpuSurfaceGetCapabilities);
        try {
            return (int) hFunction.invokeExact(
                surface.segment(),
                adapter.segment(),
                capabilities.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void surfaceGetCurrentTexture(
        WGPUSurface surface,
        @Pointer IWGPUSurfaceTexture surfaceTexture
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$wgpuSurfaceGetCurrentTexture);
        try {
            hFunction.invokeExact(
                surface.segment(),
                surfaceTexture.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public @EnumType(WGPUStatus.class) int surfacePresent(
        WGPUSurface surface
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$wgpuSurfacePresent);
        try {
            return (int) hFunction.invokeExact(
                surface.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void surfaceRelease(
        WGPUSurface surface
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$wgpuSurfaceRelease);
        try {
            hFunction.invokeExact(
                surface.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void surfaceSetLabel(
        WGPUSurface surface,
        WGPUStringView label
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$wgpuSurfaceSetLabel);
        try {
            hFunction.invokeExact(
                surface.segment(),
                label.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void surfaceUnconfigure(
        WGPUSurface surface
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$wgpuSurfaceUnconfigure);
        try {
            hFunction.invokeExact(
                surface.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void textureAddRef(
        WGPUTexture texture
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$wgpuTextureAddRef);
        try {
            hFunction.invokeExact(
                texture.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public @Nullable WGPUTextureView textureCreateView(
        WGPUTexture texture,
        @Nullable @Pointer IWGPUTextureViewDescriptor descriptor
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$wgpuTextureCreateView);
        try {
            MemorySegment s = (MemorySegment) hFunction.invokeExact(
                texture.segment(),
                (MemorySegment) (descriptor != null ? descriptor.segment() : MemorySegment.NULL)
            );
            return s.equals(MemorySegment.NULL) ? null : new WGPUTextureView(s);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void textureDestroy(
        WGPUTexture texture
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$wgpuTextureDestroy);
        try {
            hFunction.invokeExact(
                texture.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public @Unsigned int textureGetDepthOrArrayLayers(
        WGPUTexture texture
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$wgpuTextureGetDepthOrArrayLayers);
        try {
            return (int) hFunction.invokeExact(
                texture.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public @EnumType(WGPUTextureDimension.class) int textureGetDimension(
        WGPUTexture texture
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$wgpuTextureGetDimension);
        try {
            return (int) hFunction.invokeExact(
                texture.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public @EnumType(WGPUTextureFormat.class) int textureGetFormat(
        WGPUTexture texture
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$wgpuTextureGetFormat);
        try {
            return (int) hFunction.invokeExact(
                texture.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public @Unsigned int textureGetHeight(
        WGPUTexture texture
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$wgpuTextureGetHeight);
        try {
            return (int) hFunction.invokeExact(
                texture.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public @Unsigned int textureGetMipLevelCount(
        WGPUTexture texture
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$wgpuTextureGetMipLevelCount);
        try {
            return (int) hFunction.invokeExact(
                texture.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public @Unsigned int textureGetSampleCount(
        WGPUTexture texture
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$wgpuTextureGetSampleCount);
        try {
            return (int) hFunction.invokeExact(
                texture.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public @Bitmask(WGPUTextureUsage.class) long textureGetUsage(
        WGPUTexture texture
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$wgpuTextureGetUsage);
        try {
            return (long) hFunction.invokeExact(
                texture.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public @Unsigned int textureGetWidth(
        WGPUTexture texture
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$wgpuTextureGetWidth);
        try {
            return (int) hFunction.invokeExact(
                texture.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void textureRelease(
        WGPUTexture texture
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$wgpuTextureRelease);
        try {
            hFunction.invokeExact(
                texture.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void textureSetLabel(
        WGPUTexture texture,
        WGPUStringView label
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$wgpuTextureSetLabel);
        try {
            hFunction.invokeExact(
                texture.segment(),
                label.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void textureViewAddRef(
        WGPUTextureView textureView
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$wgpuTextureViewAddRef);
        try {
            hFunction.invokeExact(
                textureView.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void textureViewRelease(
        WGPUTextureView textureView
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$wgpuTextureViewRelease);
        try {
            hFunction.invokeExact(
                textureView.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void textureViewSetLabel(
        WGPUTextureView textureView,
        WGPUStringView label
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$wgpuTextureViewSetLabel);
        try {
            hFunction.invokeExact(
                textureView.segment(),
                label.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    // endregion

    // region segments and handles
    public final @Nullable MemorySegment SEGMENT$wgpuAdapterAddRef;
    public final @Nullable MemorySegment SEGMENT$wgpuAdapterGetFeatures;
    public final @Nullable MemorySegment SEGMENT$wgpuAdapterGetInfo;
    public final @Nullable MemorySegment SEGMENT$wgpuAdapterGetLimits;
    public final @Nullable MemorySegment SEGMENT$wgpuAdapterHasFeature;
    public final @Nullable MemorySegment SEGMENT$wgpuAdapterRelease;
    public final @Nullable MemorySegment SEGMENT$wgpuAdapterRequestDevice;
    public final @Nullable MemorySegment SEGMENT$wgpuBindGroupAddRef;
    public final @Nullable MemorySegment SEGMENT$wgpuBindGroupLayoutAddRef;
    public final @Nullable MemorySegment SEGMENT$wgpuBindGroupLayoutRelease;
    public final @Nullable MemorySegment SEGMENT$wgpuBindGroupLayoutSetLabel;
    public final @Nullable MemorySegment SEGMENT$wgpuBindGroupRelease;
    public final @Nullable MemorySegment SEGMENT$wgpuBindGroupSetLabel;
    public final @Nullable MemorySegment SEGMENT$wgpuBufferAddRef;
    public final @Nullable MemorySegment SEGMENT$wgpuBufferDestroy;
    public final @Nullable MemorySegment SEGMENT$wgpuBufferGetConstMappedRange;
    public final @Nullable MemorySegment SEGMENT$wgpuBufferGetMapState;
    public final @Nullable MemorySegment SEGMENT$wgpuBufferGetMappedRange;
    public final @Nullable MemorySegment SEGMENT$wgpuBufferGetSize;
    public final @Nullable MemorySegment SEGMENT$wgpuBufferGetUsage;
    public final @Nullable MemorySegment SEGMENT$wgpuBufferMapAsync;
    public final @Nullable MemorySegment SEGMENT$wgpuBufferRelease;
    public final @Nullable MemorySegment SEGMENT$wgpuBufferSetLabel;
    public final @Nullable MemorySegment SEGMENT$wgpuBufferUnmap;
    public final @Nullable MemorySegment SEGMENT$wgpuCommandBufferAddRef;
    public final @Nullable MemorySegment SEGMENT$wgpuCommandBufferRelease;
    public final @Nullable MemorySegment SEGMENT$wgpuCommandBufferSetLabel;
    public final @Nullable MemorySegment SEGMENT$wgpuCommandEncoderAddRef;
    public final @Nullable MemorySegment SEGMENT$wgpuCommandEncoderBeginComputePass;
    public final @Nullable MemorySegment SEGMENT$wgpuCommandEncoderBeginRenderPass;
    public final @Nullable MemorySegment SEGMENT$wgpuCommandEncoderClearBuffer;
    public final @Nullable MemorySegment SEGMENT$wgpuCommandEncoderCopyBufferToBuffer;
    public final @Nullable MemorySegment SEGMENT$wgpuCommandEncoderCopyBufferToTexture;
    public final @Nullable MemorySegment SEGMENT$wgpuCommandEncoderCopyTextureToBuffer;
    public final @Nullable MemorySegment SEGMENT$wgpuCommandEncoderCopyTextureToTexture;
    public final @Nullable MemorySegment SEGMENT$wgpuCommandEncoderFinish;
    public final @Nullable MemorySegment SEGMENT$wgpuCommandEncoderInsertDebugMarker;
    public final @Nullable MemorySegment SEGMENT$wgpuCommandEncoderPopDebugGroup;
    public final @Nullable MemorySegment SEGMENT$wgpuCommandEncoderPushDebugGroup;
    public final @Nullable MemorySegment SEGMENT$wgpuCommandEncoderRelease;
    public final @Nullable MemorySegment SEGMENT$wgpuCommandEncoderResolveQuerySet;
    public final @Nullable MemorySegment SEGMENT$wgpuCommandEncoderSetLabel;
    public final @Nullable MemorySegment SEGMENT$wgpuCommandEncoderWriteTimestamp;
    public final @Nullable MemorySegment SEGMENT$wgpuComputePassEncoderAddRef;
    public final @Nullable MemorySegment SEGMENT$wgpuComputePassEncoderDispatchWorkgroups;
    public final @Nullable MemorySegment SEGMENT$wgpuComputePassEncoderDispatchWorkgroupsIndirect;
    public final @Nullable MemorySegment SEGMENT$wgpuComputePassEncoderEnd;
    public final @Nullable MemorySegment SEGMENT$wgpuComputePassEncoderInsertDebugMarker;
    public final @Nullable MemorySegment SEGMENT$wgpuComputePassEncoderPopDebugGroup;
    public final @Nullable MemorySegment SEGMENT$wgpuComputePassEncoderPushDebugGroup;
    public final @Nullable MemorySegment SEGMENT$wgpuComputePassEncoderRelease;
    public final @Nullable MemorySegment SEGMENT$wgpuComputePassEncoderSetBindGroup;
    public final @Nullable MemorySegment SEGMENT$wgpuComputePassEncoderSetLabel;
    public final @Nullable MemorySegment SEGMENT$wgpuComputePassEncoderSetPipeline;
    public final @Nullable MemorySegment SEGMENT$wgpuComputePipelineAddRef;
    public final @Nullable MemorySegment SEGMENT$wgpuComputePipelineGetBindGroupLayout;
    public final @Nullable MemorySegment SEGMENT$wgpuComputePipelineRelease;
    public final @Nullable MemorySegment SEGMENT$wgpuComputePipelineSetLabel;
    public final @Nullable MemorySegment SEGMENT$wgpuCreateInstance;
    public final @Nullable MemorySegment SEGMENT$wgpuDeviceAddRef;
    public final @Nullable MemorySegment SEGMENT$wgpuDeviceCreateBindGroup;
    public final @Nullable MemorySegment SEGMENT$wgpuDeviceCreateBindGroupLayout;
    public final @Nullable MemorySegment SEGMENT$wgpuDeviceCreateBuffer;
    public final @Nullable MemorySegment SEGMENT$wgpuDeviceCreateCommandEncoder;
    public final @Nullable MemorySegment SEGMENT$wgpuDeviceCreateComputePipeline;
    public final @Nullable MemorySegment SEGMENT$wgpuDeviceCreateComputePipelineAsync;
    public final @Nullable MemorySegment SEGMENT$wgpuDeviceCreatePipelineLayout;
    public final @Nullable MemorySegment SEGMENT$wgpuDeviceCreateQuerySet;
    public final @Nullable MemorySegment SEGMENT$wgpuDeviceCreateRenderBundleEncoder;
    public final @Nullable MemorySegment SEGMENT$wgpuDeviceCreateRenderPipeline;
    public final @Nullable MemorySegment SEGMENT$wgpuDeviceCreateRenderPipelineAsync;
    public final @Nullable MemorySegment SEGMENT$wgpuDeviceCreateSampler;
    public final @Nullable MemorySegment SEGMENT$wgpuDeviceCreateShaderModule;
    public final @Nullable MemorySegment SEGMENT$wgpuDeviceCreateTexture;
    public final @Nullable MemorySegment SEGMENT$wgpuDeviceDestroy;
    public final @Nullable MemorySegment SEGMENT$wgpuDeviceGetAdapterInfo;
    public final @Nullable MemorySegment SEGMENT$wgpuDeviceGetFeatures;
    public final @Nullable MemorySegment SEGMENT$wgpuDeviceGetLimits;
    public final @Nullable MemorySegment SEGMENT$wgpuDeviceGetLostFuture;
    public final @Nullable MemorySegment SEGMENT$wgpuDeviceGetQueue;
    public final @Nullable MemorySegment SEGMENT$wgpuDeviceHasFeature;
    public final @Nullable MemorySegment SEGMENT$wgpuDevicePopErrorScope;
    public final @Nullable MemorySegment SEGMENT$wgpuDevicePushErrorScope;
    public final @Nullable MemorySegment SEGMENT$wgpuDeviceRelease;
    public final @Nullable MemorySegment SEGMENT$wgpuDeviceSetLabel;
    public final @Nullable MemorySegment SEGMENT$wgpuGetInstanceCapabilities;
    public final @Nullable MemorySegment SEGMENT$wgpuInstanceAddRef;
    public final @Nullable MemorySegment SEGMENT$wgpuInstanceCreateSurface;
    public final @Nullable MemorySegment SEGMENT$wgpuInstanceGetWgslLanguageFeatures;
    public final @Nullable MemorySegment SEGMENT$wgpuInstanceHasWgslLanguageFeature;
    public final @Nullable MemorySegment SEGMENT$wgpuInstanceProcessEvents;
    public final @Nullable MemorySegment SEGMENT$wgpuInstanceRelease;
    public final @Nullable MemorySegment SEGMENT$wgpuInstanceRequestAdapter;
    public final @Nullable MemorySegment SEGMENT$wgpuInstanceWaitAny;
    public final @Nullable MemorySegment SEGMENT$wgpuPipelineLayoutAddRef;
    public final @Nullable MemorySegment SEGMENT$wgpuPipelineLayoutRelease;
    public final @Nullable MemorySegment SEGMENT$wgpuPipelineLayoutSetLabel;
    public final @Nullable MemorySegment SEGMENT$wgpuQuerySetAddRef;
    public final @Nullable MemorySegment SEGMENT$wgpuQuerySetDestroy;
    public final @Nullable MemorySegment SEGMENT$wgpuQuerySetGetCount;
    public final @Nullable MemorySegment SEGMENT$wgpuQuerySetGetType;
    public final @Nullable MemorySegment SEGMENT$wgpuQuerySetRelease;
    public final @Nullable MemorySegment SEGMENT$wgpuQuerySetSetLabel;
    public final @Nullable MemorySegment SEGMENT$wgpuQueueAddRef;
    public final @Nullable MemorySegment SEGMENT$wgpuQueueOnSubmittedWorkDone;
    public final @Nullable MemorySegment SEGMENT$wgpuQueueRelease;
    public final @Nullable MemorySegment SEGMENT$wgpuQueueSetLabel;
    public final @Nullable MemorySegment SEGMENT$wgpuQueueSubmit;
    public final @Nullable MemorySegment SEGMENT$wgpuQueueWriteBuffer;
    public final @Nullable MemorySegment SEGMENT$wgpuQueueWriteTexture;
    public final @Nullable MemorySegment SEGMENT$wgpuRenderBundleAddRef;
    public final @Nullable MemorySegment SEGMENT$wgpuRenderBundleEncoderAddRef;
    public final @Nullable MemorySegment SEGMENT$wgpuRenderBundleEncoderDraw;
    public final @Nullable MemorySegment SEGMENT$wgpuRenderBundleEncoderDrawIndexed;
    public final @Nullable MemorySegment SEGMENT$wgpuRenderBundleEncoderDrawIndexedIndirect;
    public final @Nullable MemorySegment SEGMENT$wgpuRenderBundleEncoderDrawIndirect;
    public final @Nullable MemorySegment SEGMENT$wgpuRenderBundleEncoderFinish;
    public final @Nullable MemorySegment SEGMENT$wgpuRenderBundleEncoderInsertDebugMarker;
    public final @Nullable MemorySegment SEGMENT$wgpuRenderBundleEncoderPopDebugGroup;
    public final @Nullable MemorySegment SEGMENT$wgpuRenderBundleEncoderPushDebugGroup;
    public final @Nullable MemorySegment SEGMENT$wgpuRenderBundleEncoderRelease;
    public final @Nullable MemorySegment SEGMENT$wgpuRenderBundleEncoderSetBindGroup;
    public final @Nullable MemorySegment SEGMENT$wgpuRenderBundleEncoderSetIndexBuffer;
    public final @Nullable MemorySegment SEGMENT$wgpuRenderBundleEncoderSetLabel;
    public final @Nullable MemorySegment SEGMENT$wgpuRenderBundleEncoderSetPipeline;
    public final @Nullable MemorySegment SEGMENT$wgpuRenderBundleEncoderSetVertexBuffer;
    public final @Nullable MemorySegment SEGMENT$wgpuRenderBundleRelease;
    public final @Nullable MemorySegment SEGMENT$wgpuRenderBundleSetLabel;
    public final @Nullable MemorySegment SEGMENT$wgpuRenderPassEncoderAddRef;
    public final @Nullable MemorySegment SEGMENT$wgpuRenderPassEncoderBeginOcclusionQuery;
    public final @Nullable MemorySegment SEGMENT$wgpuRenderPassEncoderDraw;
    public final @Nullable MemorySegment SEGMENT$wgpuRenderPassEncoderDrawIndexed;
    public final @Nullable MemorySegment SEGMENT$wgpuRenderPassEncoderDrawIndexedIndirect;
    public final @Nullable MemorySegment SEGMENT$wgpuRenderPassEncoderDrawIndirect;
    public final @Nullable MemorySegment SEGMENT$wgpuRenderPassEncoderEnd;
    public final @Nullable MemorySegment SEGMENT$wgpuRenderPassEncoderEndOcclusionQuery;
    public final @Nullable MemorySegment SEGMENT$wgpuRenderPassEncoderExecuteBundles;
    public final @Nullable MemorySegment SEGMENT$wgpuRenderPassEncoderInsertDebugMarker;
    public final @Nullable MemorySegment SEGMENT$wgpuRenderPassEncoderPopDebugGroup;
    public final @Nullable MemorySegment SEGMENT$wgpuRenderPassEncoderPushDebugGroup;
    public final @Nullable MemorySegment SEGMENT$wgpuRenderPassEncoderRelease;
    public final @Nullable MemorySegment SEGMENT$wgpuRenderPassEncoderSetBindGroup;
    public final @Nullable MemorySegment SEGMENT$wgpuRenderPassEncoderSetBlendConstant;
    public final @Nullable MemorySegment SEGMENT$wgpuRenderPassEncoderSetIndexBuffer;
    public final @Nullable MemorySegment SEGMENT$wgpuRenderPassEncoderSetLabel;
    public final @Nullable MemorySegment SEGMENT$wgpuRenderPassEncoderSetPipeline;
    public final @Nullable MemorySegment SEGMENT$wgpuRenderPassEncoderSetScissorRect;
    public final @Nullable MemorySegment SEGMENT$wgpuRenderPassEncoderSetStencilReference;
    public final @Nullable MemorySegment SEGMENT$wgpuRenderPassEncoderSetVertexBuffer;
    public final @Nullable MemorySegment SEGMENT$wgpuRenderPassEncoderSetViewport;
    public final @Nullable MemorySegment SEGMENT$wgpuRenderPipelineAddRef;
    public final @Nullable MemorySegment SEGMENT$wgpuRenderPipelineGetBindGroupLayout;
    public final @Nullable MemorySegment SEGMENT$wgpuRenderPipelineRelease;
    public final @Nullable MemorySegment SEGMENT$wgpuRenderPipelineSetLabel;
    public final @Nullable MemorySegment SEGMENT$wgpuSamplerAddRef;
    public final @Nullable MemorySegment SEGMENT$wgpuSamplerRelease;
    public final @Nullable MemorySegment SEGMENT$wgpuSamplerSetLabel;
    public final @Nullable MemorySegment SEGMENT$wgpuShaderModuleAddRef;
    public final @Nullable MemorySegment SEGMENT$wgpuShaderModuleGetCompilationInfo;
    public final @Nullable MemorySegment SEGMENT$wgpuShaderModuleRelease;
    public final @Nullable MemorySegment SEGMENT$wgpuShaderModuleSetLabel;
    public final @Nullable MemorySegment SEGMENT$wgpuSurfaceAddRef;
    public final @Nullable MemorySegment SEGMENT$wgpuSurfaceConfigure;
    public final @Nullable MemorySegment SEGMENT$wgpuSurfaceGetCapabilities;
    public final @Nullable MemorySegment SEGMENT$wgpuSurfaceGetCurrentTexture;
    public final @Nullable MemorySegment SEGMENT$wgpuSurfacePresent;
    public final @Nullable MemorySegment SEGMENT$wgpuSurfaceRelease;
    public final @Nullable MemorySegment SEGMENT$wgpuSurfaceSetLabel;
    public final @Nullable MemorySegment SEGMENT$wgpuSurfaceUnconfigure;
    public final @Nullable MemorySegment SEGMENT$wgpuTextureAddRef;
    public final @Nullable MemorySegment SEGMENT$wgpuTextureCreateView;
    public final @Nullable MemorySegment SEGMENT$wgpuTextureDestroy;
    public final @Nullable MemorySegment SEGMENT$wgpuTextureGetDepthOrArrayLayers;
    public final @Nullable MemorySegment SEGMENT$wgpuTextureGetDimension;
    public final @Nullable MemorySegment SEGMENT$wgpuTextureGetFormat;
    public final @Nullable MemorySegment SEGMENT$wgpuTextureGetHeight;
    public final @Nullable MemorySegment SEGMENT$wgpuTextureGetMipLevelCount;
    public final @Nullable MemorySegment SEGMENT$wgpuTextureGetSampleCount;
    public final @Nullable MemorySegment SEGMENT$wgpuTextureGetUsage;
    public final @Nullable MemorySegment SEGMENT$wgpuTextureGetWidth;
    public final @Nullable MemorySegment SEGMENT$wgpuTextureRelease;
    public final @Nullable MemorySegment SEGMENT$wgpuTextureSetLabel;
    public final @Nullable MemorySegment SEGMENT$wgpuTextureViewAddRef;
    public final @Nullable MemorySegment SEGMENT$wgpuTextureViewRelease;
    public final @Nullable MemorySegment SEGMENT$wgpuTextureViewSetLabel;
    public final @Nullable MethodHandle HANDLE$wgpuAdapterAddRef;
    public final @Nullable MethodHandle HANDLE$wgpuAdapterGetFeatures;
    public final @Nullable MethodHandle HANDLE$wgpuAdapterGetInfo;
    public final @Nullable MethodHandle HANDLE$wgpuAdapterGetLimits;
    public final @Nullable MethodHandle HANDLE$wgpuAdapterHasFeature;
    public final @Nullable MethodHandle HANDLE$wgpuAdapterRelease;
    public final @Nullable MethodHandle HANDLE$wgpuAdapterRequestDevice;
    public final @Nullable MethodHandle HANDLE$wgpuBindGroupAddRef;
    public final @Nullable MethodHandle HANDLE$wgpuBindGroupLayoutAddRef;
    public final @Nullable MethodHandle HANDLE$wgpuBindGroupLayoutRelease;
    public final @Nullable MethodHandle HANDLE$wgpuBindGroupLayoutSetLabel;
    public final @Nullable MethodHandle HANDLE$wgpuBindGroupRelease;
    public final @Nullable MethodHandle HANDLE$wgpuBindGroupSetLabel;
    public final @Nullable MethodHandle HANDLE$wgpuBufferAddRef;
    public final @Nullable MethodHandle HANDLE$wgpuBufferDestroy;
    public final @Nullable MethodHandle HANDLE$wgpuBufferGetConstMappedRange;
    public final @Nullable MethodHandle HANDLE$wgpuBufferGetMapState;
    public final @Nullable MethodHandle HANDLE$wgpuBufferGetMappedRange;
    public final @Nullable MethodHandle HANDLE$wgpuBufferGetSize;
    public final @Nullable MethodHandle HANDLE$wgpuBufferGetUsage;
    public final @Nullable MethodHandle HANDLE$wgpuBufferMapAsync;
    public final @Nullable MethodHandle HANDLE$wgpuBufferRelease;
    public final @Nullable MethodHandle HANDLE$wgpuBufferSetLabel;
    public final @Nullable MethodHandle HANDLE$wgpuBufferUnmap;
    public final @Nullable MethodHandle HANDLE$wgpuCommandBufferAddRef;
    public final @Nullable MethodHandle HANDLE$wgpuCommandBufferRelease;
    public final @Nullable MethodHandle HANDLE$wgpuCommandBufferSetLabel;
    public final @Nullable MethodHandle HANDLE$wgpuCommandEncoderAddRef;
    public final @Nullable MethodHandle HANDLE$wgpuCommandEncoderBeginComputePass;
    public final @Nullable MethodHandle HANDLE$wgpuCommandEncoderBeginRenderPass;
    public final @Nullable MethodHandle HANDLE$wgpuCommandEncoderClearBuffer;
    public final @Nullable MethodHandle HANDLE$wgpuCommandEncoderCopyBufferToBuffer;
    public final @Nullable MethodHandle HANDLE$wgpuCommandEncoderCopyBufferToTexture;
    public final @Nullable MethodHandle HANDLE$wgpuCommandEncoderCopyTextureToBuffer;
    public final @Nullable MethodHandle HANDLE$wgpuCommandEncoderCopyTextureToTexture;
    public final @Nullable MethodHandle HANDLE$wgpuCommandEncoderFinish;
    public final @Nullable MethodHandle HANDLE$wgpuCommandEncoderInsertDebugMarker;
    public final @Nullable MethodHandle HANDLE$wgpuCommandEncoderPopDebugGroup;
    public final @Nullable MethodHandle HANDLE$wgpuCommandEncoderPushDebugGroup;
    public final @Nullable MethodHandle HANDLE$wgpuCommandEncoderRelease;
    public final @Nullable MethodHandle HANDLE$wgpuCommandEncoderResolveQuerySet;
    public final @Nullable MethodHandle HANDLE$wgpuCommandEncoderSetLabel;
    public final @Nullable MethodHandle HANDLE$wgpuCommandEncoderWriteTimestamp;
    public final @Nullable MethodHandle HANDLE$wgpuComputePassEncoderAddRef;
    public final @Nullable MethodHandle HANDLE$wgpuComputePassEncoderDispatchWorkgroups;
    public final @Nullable MethodHandle HANDLE$wgpuComputePassEncoderDispatchWorkgroupsIndirect;
    public final @Nullable MethodHandle HANDLE$wgpuComputePassEncoderEnd;
    public final @Nullable MethodHandle HANDLE$wgpuComputePassEncoderInsertDebugMarker;
    public final @Nullable MethodHandle HANDLE$wgpuComputePassEncoderPopDebugGroup;
    public final @Nullable MethodHandle HANDLE$wgpuComputePassEncoderPushDebugGroup;
    public final @Nullable MethodHandle HANDLE$wgpuComputePassEncoderRelease;
    public final @Nullable MethodHandle HANDLE$wgpuComputePassEncoderSetBindGroup;
    public final @Nullable MethodHandle HANDLE$wgpuComputePassEncoderSetLabel;
    public final @Nullable MethodHandle HANDLE$wgpuComputePassEncoderSetPipeline;
    public final @Nullable MethodHandle HANDLE$wgpuComputePipelineAddRef;
    public final @Nullable MethodHandle HANDLE$wgpuComputePipelineGetBindGroupLayout;
    public final @Nullable MethodHandle HANDLE$wgpuComputePipelineRelease;
    public final @Nullable MethodHandle HANDLE$wgpuComputePipelineSetLabel;
    public final @Nullable MethodHandle HANDLE$wgpuCreateInstance;
    public final @Nullable MethodHandle HANDLE$wgpuDeviceAddRef;
    public final @Nullable MethodHandle HANDLE$wgpuDeviceCreateBindGroup;
    public final @Nullable MethodHandle HANDLE$wgpuDeviceCreateBindGroupLayout;
    public final @Nullable MethodHandle HANDLE$wgpuDeviceCreateBuffer;
    public final @Nullable MethodHandle HANDLE$wgpuDeviceCreateCommandEncoder;
    public final @Nullable MethodHandle HANDLE$wgpuDeviceCreateComputePipeline;
    public final @Nullable MethodHandle HANDLE$wgpuDeviceCreateComputePipelineAsync;
    public final @Nullable MethodHandle HANDLE$wgpuDeviceCreatePipelineLayout;
    public final @Nullable MethodHandle HANDLE$wgpuDeviceCreateQuerySet;
    public final @Nullable MethodHandle HANDLE$wgpuDeviceCreateRenderBundleEncoder;
    public final @Nullable MethodHandle HANDLE$wgpuDeviceCreateRenderPipeline;
    public final @Nullable MethodHandle HANDLE$wgpuDeviceCreateRenderPipelineAsync;
    public final @Nullable MethodHandle HANDLE$wgpuDeviceCreateSampler;
    public final @Nullable MethodHandle HANDLE$wgpuDeviceCreateShaderModule;
    public final @Nullable MethodHandle HANDLE$wgpuDeviceCreateTexture;
    public final @Nullable MethodHandle HANDLE$wgpuDeviceDestroy;
    public final @Nullable MethodHandle HANDLE$wgpuDeviceGetAdapterInfo;
    public final @Nullable MethodHandle HANDLE$wgpuDeviceGetFeatures;
    public final @Nullable MethodHandle HANDLE$wgpuDeviceGetLimits;
    public final @Nullable MethodHandle HANDLE$wgpuDeviceGetLostFuture;
    public final @Nullable MethodHandle HANDLE$wgpuDeviceGetQueue;
    public final @Nullable MethodHandle HANDLE$wgpuDeviceHasFeature;
    public final @Nullable MethodHandle HANDLE$wgpuDevicePopErrorScope;
    public final @Nullable MethodHandle HANDLE$wgpuDevicePushErrorScope;
    public final @Nullable MethodHandle HANDLE$wgpuDeviceRelease;
    public final @Nullable MethodHandle HANDLE$wgpuDeviceSetLabel;
    public final @Nullable MethodHandle HANDLE$wgpuGetInstanceCapabilities;
    public final @Nullable MethodHandle HANDLE$wgpuInstanceAddRef;
    public final @Nullable MethodHandle HANDLE$wgpuInstanceCreateSurface;
    public final @Nullable MethodHandle HANDLE$wgpuInstanceGetWgslLanguageFeatures;
    public final @Nullable MethodHandle HANDLE$wgpuInstanceHasWgslLanguageFeature;
    public final @Nullable MethodHandle HANDLE$wgpuInstanceProcessEvents;
    public final @Nullable MethodHandle HANDLE$wgpuInstanceRelease;
    public final @Nullable MethodHandle HANDLE$wgpuInstanceRequestAdapter;
    public final @Nullable MethodHandle HANDLE$wgpuInstanceWaitAny;
    public final @Nullable MethodHandle HANDLE$wgpuPipelineLayoutAddRef;
    public final @Nullable MethodHandle HANDLE$wgpuPipelineLayoutRelease;
    public final @Nullable MethodHandle HANDLE$wgpuPipelineLayoutSetLabel;
    public final @Nullable MethodHandle HANDLE$wgpuQuerySetAddRef;
    public final @Nullable MethodHandle HANDLE$wgpuQuerySetDestroy;
    public final @Nullable MethodHandle HANDLE$wgpuQuerySetGetCount;
    public final @Nullable MethodHandle HANDLE$wgpuQuerySetGetType;
    public final @Nullable MethodHandle HANDLE$wgpuQuerySetRelease;
    public final @Nullable MethodHandle HANDLE$wgpuQuerySetSetLabel;
    public final @Nullable MethodHandle HANDLE$wgpuQueueAddRef;
    public final @Nullable MethodHandle HANDLE$wgpuQueueOnSubmittedWorkDone;
    public final @Nullable MethodHandle HANDLE$wgpuQueueRelease;
    public final @Nullable MethodHandle HANDLE$wgpuQueueSetLabel;
    public final @Nullable MethodHandle HANDLE$wgpuQueueSubmit;
    public final @Nullable MethodHandle HANDLE$wgpuQueueWriteBuffer;
    public final @Nullable MethodHandle HANDLE$wgpuQueueWriteTexture;
    public final @Nullable MethodHandle HANDLE$wgpuRenderBundleAddRef;
    public final @Nullable MethodHandle HANDLE$wgpuRenderBundleEncoderAddRef;
    public final @Nullable MethodHandle HANDLE$wgpuRenderBundleEncoderDraw;
    public final @Nullable MethodHandle HANDLE$wgpuRenderBundleEncoderDrawIndexed;
    public final @Nullable MethodHandle HANDLE$wgpuRenderBundleEncoderDrawIndexedIndirect;
    public final @Nullable MethodHandle HANDLE$wgpuRenderBundleEncoderDrawIndirect;
    public final @Nullable MethodHandle HANDLE$wgpuRenderBundleEncoderFinish;
    public final @Nullable MethodHandle HANDLE$wgpuRenderBundleEncoderInsertDebugMarker;
    public final @Nullable MethodHandle HANDLE$wgpuRenderBundleEncoderPopDebugGroup;
    public final @Nullable MethodHandle HANDLE$wgpuRenderBundleEncoderPushDebugGroup;
    public final @Nullable MethodHandle HANDLE$wgpuRenderBundleEncoderRelease;
    public final @Nullable MethodHandle HANDLE$wgpuRenderBundleEncoderSetBindGroup;
    public final @Nullable MethodHandle HANDLE$wgpuRenderBundleEncoderSetIndexBuffer;
    public final @Nullable MethodHandle HANDLE$wgpuRenderBundleEncoderSetLabel;
    public final @Nullable MethodHandle HANDLE$wgpuRenderBundleEncoderSetPipeline;
    public final @Nullable MethodHandle HANDLE$wgpuRenderBundleEncoderSetVertexBuffer;
    public final @Nullable MethodHandle HANDLE$wgpuRenderBundleRelease;
    public final @Nullable MethodHandle HANDLE$wgpuRenderBundleSetLabel;
    public final @Nullable MethodHandle HANDLE$wgpuRenderPassEncoderAddRef;
    public final @Nullable MethodHandle HANDLE$wgpuRenderPassEncoderBeginOcclusionQuery;
    public final @Nullable MethodHandle HANDLE$wgpuRenderPassEncoderDraw;
    public final @Nullable MethodHandle HANDLE$wgpuRenderPassEncoderDrawIndexed;
    public final @Nullable MethodHandle HANDLE$wgpuRenderPassEncoderDrawIndexedIndirect;
    public final @Nullable MethodHandle HANDLE$wgpuRenderPassEncoderDrawIndirect;
    public final @Nullable MethodHandle HANDLE$wgpuRenderPassEncoderEnd;
    public final @Nullable MethodHandle HANDLE$wgpuRenderPassEncoderEndOcclusionQuery;
    public final @Nullable MethodHandle HANDLE$wgpuRenderPassEncoderExecuteBundles;
    public final @Nullable MethodHandle HANDLE$wgpuRenderPassEncoderInsertDebugMarker;
    public final @Nullable MethodHandle HANDLE$wgpuRenderPassEncoderPopDebugGroup;
    public final @Nullable MethodHandle HANDLE$wgpuRenderPassEncoderPushDebugGroup;
    public final @Nullable MethodHandle HANDLE$wgpuRenderPassEncoderRelease;
    public final @Nullable MethodHandle HANDLE$wgpuRenderPassEncoderSetBindGroup;
    public final @Nullable MethodHandle HANDLE$wgpuRenderPassEncoderSetBlendConstant;
    public final @Nullable MethodHandle HANDLE$wgpuRenderPassEncoderSetIndexBuffer;
    public final @Nullable MethodHandle HANDLE$wgpuRenderPassEncoderSetLabel;
    public final @Nullable MethodHandle HANDLE$wgpuRenderPassEncoderSetPipeline;
    public final @Nullable MethodHandle HANDLE$wgpuRenderPassEncoderSetScissorRect;
    public final @Nullable MethodHandle HANDLE$wgpuRenderPassEncoderSetStencilReference;
    public final @Nullable MethodHandle HANDLE$wgpuRenderPassEncoderSetVertexBuffer;
    public final @Nullable MethodHandle HANDLE$wgpuRenderPassEncoderSetViewport;
    public final @Nullable MethodHandle HANDLE$wgpuRenderPipelineAddRef;
    public final @Nullable MethodHandle HANDLE$wgpuRenderPipelineGetBindGroupLayout;
    public final @Nullable MethodHandle HANDLE$wgpuRenderPipelineRelease;
    public final @Nullable MethodHandle HANDLE$wgpuRenderPipelineSetLabel;
    public final @Nullable MethodHandle HANDLE$wgpuSamplerAddRef;
    public final @Nullable MethodHandle HANDLE$wgpuSamplerRelease;
    public final @Nullable MethodHandle HANDLE$wgpuSamplerSetLabel;
    public final @Nullable MethodHandle HANDLE$wgpuShaderModuleAddRef;
    public final @Nullable MethodHandle HANDLE$wgpuShaderModuleGetCompilationInfo;
    public final @Nullable MethodHandle HANDLE$wgpuShaderModuleRelease;
    public final @Nullable MethodHandle HANDLE$wgpuShaderModuleSetLabel;
    public final @Nullable MethodHandle HANDLE$wgpuSurfaceAddRef;
    public final @Nullable MethodHandle HANDLE$wgpuSurfaceConfigure;
    public final @Nullable MethodHandle HANDLE$wgpuSurfaceGetCapabilities;
    public final @Nullable MethodHandle HANDLE$wgpuSurfaceGetCurrentTexture;
    public final @Nullable MethodHandle HANDLE$wgpuSurfacePresent;
    public final @Nullable MethodHandle HANDLE$wgpuSurfaceRelease;
    public final @Nullable MethodHandle HANDLE$wgpuSurfaceSetLabel;
    public final @Nullable MethodHandle HANDLE$wgpuSurfaceUnconfigure;
    public final @Nullable MethodHandle HANDLE$wgpuTextureAddRef;
    public final @Nullable MethodHandle HANDLE$wgpuTextureCreateView;
    public final @Nullable MethodHandle HANDLE$wgpuTextureDestroy;
    public final @Nullable MethodHandle HANDLE$wgpuTextureGetDepthOrArrayLayers;
    public final @Nullable MethodHandle HANDLE$wgpuTextureGetDimension;
    public final @Nullable MethodHandle HANDLE$wgpuTextureGetFormat;
    public final @Nullable MethodHandle HANDLE$wgpuTextureGetHeight;
    public final @Nullable MethodHandle HANDLE$wgpuTextureGetMipLevelCount;
    public final @Nullable MethodHandle HANDLE$wgpuTextureGetSampleCount;
    public final @Nullable MethodHandle HANDLE$wgpuTextureGetUsage;
    public final @Nullable MethodHandle HANDLE$wgpuTextureGetWidth;
    public final @Nullable MethodHandle HANDLE$wgpuTextureRelease;
    public final @Nullable MethodHandle HANDLE$wgpuTextureSetLabel;
    public final @Nullable MethodHandle HANDLE$wgpuTextureViewAddRef;
    public final @Nullable MethodHandle HANDLE$wgpuTextureViewRelease;
    public final @Nullable MethodHandle HANDLE$wgpuTextureViewSetLabel;
    // endregion

    public static final class Descriptors {
        public static final FunctionDescriptor DESCRIPTOR$wgpuAdapterAddRef = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$wgpuAdapterGetFeatures = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(WGPUSupportedFeatures.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$wgpuAdapterGetInfo = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(WGPUAdapterInfo.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$wgpuAdapterGetLimits = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(WGPULimits.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$wgpuAdapterHasFeature = FunctionDescriptor.of(
            ValueLayout.JAVA_BOOLEAN,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$wgpuAdapterRelease = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$wgpuAdapterRequestDevice = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(WGPUDeviceDescriptor.LAYOUT),
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$wgpuBindGroupAddRef = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$wgpuBindGroupLayoutAddRef = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$wgpuBindGroupLayoutRelease = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$wgpuBindGroupLayoutSetLabel = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            WGPUStringView.LAYOUT
        );

        public static final FunctionDescriptor DESCRIPTOR$wgpuBindGroupRelease = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$wgpuBindGroupSetLabel = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            WGPUStringView.LAYOUT
        );

        public static final FunctionDescriptor DESCRIPTOR$wgpuBufferAddRef = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$wgpuBufferDestroy = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$wgpuBufferGetConstMappedRange = FunctionDescriptor.of(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            NativeLayout.C_SIZE_T,
            NativeLayout.C_SIZE_T
        );

        public static final FunctionDescriptor DESCRIPTOR$wgpuBufferGetMapState = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$wgpuBufferGetMappedRange = FunctionDescriptor.of(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            NativeLayout.C_SIZE_T,
            NativeLayout.C_SIZE_T
        );

        public static final FunctionDescriptor DESCRIPTOR$wgpuBufferGetSize = FunctionDescriptor.of(
            ValueLayout.JAVA_LONG,
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$wgpuBufferGetUsage = FunctionDescriptor.of(
            ValueLayout.JAVA_LONG,
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$wgpuBufferMapAsync = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_LONG,
            NativeLayout.C_SIZE_T,
            NativeLayout.C_SIZE_T,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$wgpuBufferRelease = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$wgpuBufferSetLabel = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            WGPUStringView.LAYOUT
        );

        public static final FunctionDescriptor DESCRIPTOR$wgpuBufferUnmap = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$wgpuCommandBufferAddRef = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$wgpuCommandBufferRelease = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$wgpuCommandBufferSetLabel = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            WGPUStringView.LAYOUT
        );

        public static final FunctionDescriptor DESCRIPTOR$wgpuCommandEncoderAddRef = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$wgpuCommandEncoderBeginComputePass = FunctionDescriptor.of(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(WGPUComputePassDescriptor.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$wgpuCommandEncoderBeginRenderPass = FunctionDescriptor.of(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(WGPURenderPassDescriptor.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$wgpuCommandEncoderClearBuffer = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_LONG,
            ValueLayout.JAVA_LONG
        );

        public static final FunctionDescriptor DESCRIPTOR$wgpuCommandEncoderCopyBufferToBuffer = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_LONG,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_LONG,
            ValueLayout.JAVA_LONG
        );

        public static final FunctionDescriptor DESCRIPTOR$wgpuCommandEncoderCopyBufferToTexture = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(WGPUTexelCopyBufferInfo.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(WGPUTexelCopyTextureInfo.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(WGPUExtent3d.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$wgpuCommandEncoderCopyTextureToBuffer = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(WGPUTexelCopyTextureInfo.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(WGPUTexelCopyBufferInfo.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(WGPUExtent3d.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$wgpuCommandEncoderCopyTextureToTexture = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(WGPUTexelCopyTextureInfo.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(WGPUTexelCopyTextureInfo.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(WGPUExtent3d.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$wgpuCommandEncoderFinish = FunctionDescriptor.of(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(WGPUCommandBufferDescriptor.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$wgpuCommandEncoderInsertDebugMarker = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            WGPUStringView.LAYOUT
        );

        public static final FunctionDescriptor DESCRIPTOR$wgpuCommandEncoderPopDebugGroup = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$wgpuCommandEncoderPushDebugGroup = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            WGPUStringView.LAYOUT
        );

        public static final FunctionDescriptor DESCRIPTOR$wgpuCommandEncoderRelease = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$wgpuCommandEncoderResolveQuerySet = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_LONG
        );

        public static final FunctionDescriptor DESCRIPTOR$wgpuCommandEncoderSetLabel = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            WGPUStringView.LAYOUT
        );

        public static final FunctionDescriptor DESCRIPTOR$wgpuCommandEncoderWriteTimestamp = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$wgpuComputePassEncoderAddRef = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$wgpuComputePassEncoderDispatchWorkgroups = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$wgpuComputePassEncoderDispatchWorkgroupsIndirect = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_LONG
        );

        public static final FunctionDescriptor DESCRIPTOR$wgpuComputePassEncoderEnd = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$wgpuComputePassEncoderInsertDebugMarker = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            WGPUStringView.LAYOUT
        );

        public static final FunctionDescriptor DESCRIPTOR$wgpuComputePassEncoderPopDebugGroup = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$wgpuComputePassEncoderPushDebugGroup = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            WGPUStringView.LAYOUT
        );

        public static final FunctionDescriptor DESCRIPTOR$wgpuComputePassEncoderRelease = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$wgpuComputePassEncoderSetBindGroup = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
        );

        public static final FunctionDescriptor DESCRIPTOR$wgpuComputePassEncoderSetLabel = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            WGPUStringView.LAYOUT
        );

        public static final FunctionDescriptor DESCRIPTOR$wgpuComputePassEncoderSetPipeline = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$wgpuComputePipelineAddRef = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$wgpuComputePipelineGetBindGroupLayout = FunctionDescriptor.of(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$wgpuComputePipelineRelease = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$wgpuComputePipelineSetLabel = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            WGPUStringView.LAYOUT
        );

        public static final FunctionDescriptor DESCRIPTOR$wgpuCreateInstance = FunctionDescriptor.of(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(WGPUInstanceDescriptor.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$wgpuDeviceAddRef = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$wgpuDeviceCreateBindGroup = FunctionDescriptor.of(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(WGPUBindGroupDescriptor.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$wgpuDeviceCreateBindGroupLayout = FunctionDescriptor.of(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(WGPUBindGroupLayoutDescriptor.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$wgpuDeviceCreateBuffer = FunctionDescriptor.of(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(WGPUBufferDescriptor.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$wgpuDeviceCreateCommandEncoder = FunctionDescriptor.of(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(WGPUCommandEncoderDescriptor.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$wgpuDeviceCreateComputePipeline = FunctionDescriptor.of(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(WGPUComputePipelineDescriptor.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$wgpuDeviceCreateComputePipelineAsync = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(WGPUComputePipelineDescriptor.LAYOUT),
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$wgpuDeviceCreatePipelineLayout = FunctionDescriptor.of(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(WGPUPipelineLayoutDescriptor.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$wgpuDeviceCreateQuerySet = FunctionDescriptor.of(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(WGPUQuerySetDescriptor.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$wgpuDeviceCreateRenderBundleEncoder = FunctionDescriptor.of(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(WGPURenderBundleEncoderDescriptor.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$wgpuDeviceCreateRenderPipeline = FunctionDescriptor.of(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(WGPURenderPipelineDescriptor.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$wgpuDeviceCreateRenderPipelineAsync = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(WGPURenderPipelineDescriptor.LAYOUT),
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$wgpuDeviceCreateSampler = FunctionDescriptor.of(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(WGPUSamplerDescriptor.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$wgpuDeviceCreateShaderModule = FunctionDescriptor.of(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(WGPUShaderModuleDescriptor.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$wgpuDeviceCreateTexture = FunctionDescriptor.of(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(WGPUTextureDescriptor.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$wgpuDeviceDestroy = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$wgpuDeviceGetAdapterInfo = FunctionDescriptor.of(
            WGPUAdapterInfo.LAYOUT,
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$wgpuDeviceGetFeatures = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(WGPUSupportedFeatures.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$wgpuDeviceGetLimits = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(WGPULimits.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$wgpuDeviceGetLostFuture = FunctionDescriptor.of(
            WGPUFuture.LAYOUT,
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$wgpuDeviceGetQueue = FunctionDescriptor.of(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$wgpuDeviceHasFeature = FunctionDescriptor.of(
            ValueLayout.JAVA_BOOLEAN,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$wgpuDevicePopErrorScope = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$wgpuDevicePushErrorScope = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$wgpuDeviceRelease = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$wgpuDeviceSetLabel = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            WGPUStringView.LAYOUT
        );

        public static final FunctionDescriptor DESCRIPTOR$wgpuGetInstanceCapabilities = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(WGPUInstanceCapabilities.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$wgpuInstanceAddRef = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$wgpuInstanceCreateSurface = FunctionDescriptor.of(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(WGPUSurfaceDescriptor.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$wgpuInstanceGetWgslLanguageFeatures = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(WGPUSupportedWgslLanguageFeatures.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$wgpuInstanceHasWgslLanguageFeature = FunctionDescriptor.of(
            ValueLayout.JAVA_BOOLEAN,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$wgpuInstanceProcessEvents = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$wgpuInstanceRelease = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$wgpuInstanceRequestAdapter = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(WGPURequestAdapterOptions.LAYOUT),
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$wgpuInstanceWaitAny = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            NativeLayout.C_SIZE_T,
            ValueLayout.ADDRESS.withTargetLayout(WGPUFutureWaitInfo.LAYOUT),
            ValueLayout.JAVA_LONG
        );

        public static final FunctionDescriptor DESCRIPTOR$wgpuPipelineLayoutAddRef = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$wgpuPipelineLayoutRelease = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$wgpuPipelineLayoutSetLabel = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            WGPUStringView.LAYOUT
        );

        public static final FunctionDescriptor DESCRIPTOR$wgpuQuerySetAddRef = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$wgpuQuerySetDestroy = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$wgpuQuerySetGetCount = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$wgpuQuerySetGetType = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$wgpuQuerySetRelease = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$wgpuQuerySetSetLabel = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            WGPUStringView.LAYOUT
        );

        public static final FunctionDescriptor DESCRIPTOR$wgpuQueueAddRef = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$wgpuQueueOnSubmittedWorkDone = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$wgpuQueueRelease = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$wgpuQueueSetLabel = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            WGPUStringView.LAYOUT
        );

        public static final FunctionDescriptor DESCRIPTOR$wgpuQueueSubmit = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
        );

        public static final FunctionDescriptor DESCRIPTOR$wgpuQueueWriteBuffer = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_LONG,
            ValueLayout.ADDRESS,
            NativeLayout.C_SIZE_T
        );

        public static final FunctionDescriptor DESCRIPTOR$wgpuQueueWriteTexture = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(WGPUTexelCopyTextureInfo.LAYOUT),
            ValueLayout.ADDRESS,
            NativeLayout.C_SIZE_T,
            ValueLayout.ADDRESS.withTargetLayout(WGPUTexelCopyBufferLayout.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(WGPUExtent3d.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$wgpuRenderBundleAddRef = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$wgpuRenderBundleEncoderAddRef = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$wgpuRenderBundleEncoderDraw = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$wgpuRenderBundleEncoderDrawIndexed = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$wgpuRenderBundleEncoderDrawIndexedIndirect = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_LONG
        );

        public static final FunctionDescriptor DESCRIPTOR$wgpuRenderBundleEncoderDrawIndirect = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_LONG
        );

        public static final FunctionDescriptor DESCRIPTOR$wgpuRenderBundleEncoderFinish = FunctionDescriptor.of(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(WGPURenderBundleDescriptor.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$wgpuRenderBundleEncoderInsertDebugMarker = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            WGPUStringView.LAYOUT
        );

        public static final FunctionDescriptor DESCRIPTOR$wgpuRenderBundleEncoderPopDebugGroup = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$wgpuRenderBundleEncoderPushDebugGroup = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            WGPUStringView.LAYOUT
        );

        public static final FunctionDescriptor DESCRIPTOR$wgpuRenderBundleEncoderRelease = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$wgpuRenderBundleEncoderSetBindGroup = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
        );

        public static final FunctionDescriptor DESCRIPTOR$wgpuRenderBundleEncoderSetIndexBuffer = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_LONG,
            ValueLayout.JAVA_LONG
        );

        public static final FunctionDescriptor DESCRIPTOR$wgpuRenderBundleEncoderSetLabel = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            WGPUStringView.LAYOUT
        );

        public static final FunctionDescriptor DESCRIPTOR$wgpuRenderBundleEncoderSetPipeline = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$wgpuRenderBundleEncoderSetVertexBuffer = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_LONG,
            ValueLayout.JAVA_LONG
        );

        public static final FunctionDescriptor DESCRIPTOR$wgpuRenderBundleRelease = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$wgpuRenderBundleSetLabel = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            WGPUStringView.LAYOUT
        );

        public static final FunctionDescriptor DESCRIPTOR$wgpuRenderPassEncoderAddRef = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$wgpuRenderPassEncoderBeginOcclusionQuery = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$wgpuRenderPassEncoderDraw = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$wgpuRenderPassEncoderDrawIndexed = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$wgpuRenderPassEncoderDrawIndexedIndirect = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_LONG
        );

        public static final FunctionDescriptor DESCRIPTOR$wgpuRenderPassEncoderDrawIndirect = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_LONG
        );

        public static final FunctionDescriptor DESCRIPTOR$wgpuRenderPassEncoderEnd = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$wgpuRenderPassEncoderEndOcclusionQuery = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$wgpuRenderPassEncoderExecuteBundles = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
        );

        public static final FunctionDescriptor DESCRIPTOR$wgpuRenderPassEncoderInsertDebugMarker = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            WGPUStringView.LAYOUT
        );

        public static final FunctionDescriptor DESCRIPTOR$wgpuRenderPassEncoderPopDebugGroup = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$wgpuRenderPassEncoderPushDebugGroup = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            WGPUStringView.LAYOUT
        );

        public static final FunctionDescriptor DESCRIPTOR$wgpuRenderPassEncoderRelease = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$wgpuRenderPassEncoderSetBindGroup = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
        );

        public static final FunctionDescriptor DESCRIPTOR$wgpuRenderPassEncoderSetBlendConstant = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(WGPUColor.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$wgpuRenderPassEncoderSetIndexBuffer = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_LONG,
            ValueLayout.JAVA_LONG
        );

        public static final FunctionDescriptor DESCRIPTOR$wgpuRenderPassEncoderSetLabel = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            WGPUStringView.LAYOUT
        );

        public static final FunctionDescriptor DESCRIPTOR$wgpuRenderPassEncoderSetPipeline = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$wgpuRenderPassEncoderSetScissorRect = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$wgpuRenderPassEncoderSetStencilReference = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$wgpuRenderPassEncoderSetVertexBuffer = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_LONG,
            ValueLayout.JAVA_LONG
        );

        public static final FunctionDescriptor DESCRIPTOR$wgpuRenderPassEncoderSetViewport = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_FLOAT,
            ValueLayout.JAVA_FLOAT,
            ValueLayout.JAVA_FLOAT,
            ValueLayout.JAVA_FLOAT,
            ValueLayout.JAVA_FLOAT,
            ValueLayout.JAVA_FLOAT
        );

        public static final FunctionDescriptor DESCRIPTOR$wgpuRenderPipelineAddRef = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$wgpuRenderPipelineGetBindGroupLayout = FunctionDescriptor.of(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$wgpuRenderPipelineRelease = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$wgpuRenderPipelineSetLabel = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            WGPUStringView.LAYOUT
        );

        public static final FunctionDescriptor DESCRIPTOR$wgpuSamplerAddRef = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$wgpuSamplerRelease = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$wgpuSamplerSetLabel = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            WGPUStringView.LAYOUT
        );

        public static final FunctionDescriptor DESCRIPTOR$wgpuShaderModuleAddRef = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$wgpuShaderModuleGetCompilationInfo = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$wgpuShaderModuleRelease = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$wgpuShaderModuleSetLabel = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            WGPUStringView.LAYOUT
        );

        public static final FunctionDescriptor DESCRIPTOR$wgpuSurfaceAddRef = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$wgpuSurfaceConfigure = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(WGPUSurfaceConfiguration.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$wgpuSurfaceGetCapabilities = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(WGPUSurfaceCapabilities.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$wgpuSurfaceGetCurrentTexture = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(WGPUSurfaceTexture.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$wgpuSurfacePresent = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$wgpuSurfaceRelease = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$wgpuSurfaceSetLabel = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            WGPUStringView.LAYOUT
        );

        public static final FunctionDescriptor DESCRIPTOR$wgpuSurfaceUnconfigure = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$wgpuTextureAddRef = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$wgpuTextureCreateView = FunctionDescriptor.of(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(WGPUTextureViewDescriptor.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$wgpuTextureDestroy = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$wgpuTextureGetDepthOrArrayLayers = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$wgpuTextureGetDimension = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$wgpuTextureGetFormat = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$wgpuTextureGetHeight = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$wgpuTextureGetMipLevelCount = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$wgpuTextureGetSampleCount = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$wgpuTextureGetUsage = FunctionDescriptor.of(
            ValueLayout.JAVA_LONG,
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$wgpuTextureGetWidth = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$wgpuTextureRelease = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$wgpuTextureSetLabel = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            WGPUStringView.LAYOUT
        );

        public static final FunctionDescriptor DESCRIPTOR$wgpuTextureViewAddRef = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$wgpuTextureViewRelease = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$wgpuTextureViewSetLabel = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            WGPUStringView.LAYOUT
        );

        /// Constructing this class is nonsense so the constructor is made private.
        private Descriptors() {}
    }
}
