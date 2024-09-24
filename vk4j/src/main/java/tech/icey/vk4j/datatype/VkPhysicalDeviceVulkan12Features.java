package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.annotation.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.NativeLayout;
import tech.icey.vk4j.IFactory;

import static tech.icey.vk4j.enumtype.VkStructureType.*;

public record VkPhysicalDeviceVulkan12Features(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("samplerMirrorClampToEdge"),
        ValueLayout.JAVA_INT.withName("drawIndirectCount"),
        ValueLayout.JAVA_INT.withName("storageBuffer8BitAccess"),
        ValueLayout.JAVA_INT.withName("uniformAndStorageBuffer8BitAccess"),
        ValueLayout.JAVA_INT.withName("storagePushConstant8"),
        ValueLayout.JAVA_INT.withName("shaderBufferInt64Atomics"),
        ValueLayout.JAVA_INT.withName("shaderSharedInt64Atomics"),
        ValueLayout.JAVA_INT.withName("shaderFloat16"),
        ValueLayout.JAVA_INT.withName("shaderInt8"),
        ValueLayout.JAVA_INT.withName("descriptorIndexing"),
        ValueLayout.JAVA_INT.withName("shaderInputAttachmentArrayDynamicIndexing"),
        ValueLayout.JAVA_INT.withName("shaderUniformTexelBufferArrayDynamicIndexing"),
        ValueLayout.JAVA_INT.withName("shaderStorageTexelBufferArrayDynamicIndexing"),
        ValueLayout.JAVA_INT.withName("shaderUniformBufferArrayNonUniformIndexing"),
        ValueLayout.JAVA_INT.withName("shaderSampledImageArrayNonUniformIndexing"),
        ValueLayout.JAVA_INT.withName("shaderStorageBufferArrayNonUniformIndexing"),
        ValueLayout.JAVA_INT.withName("shaderStorageImageArrayNonUniformIndexing"),
        ValueLayout.JAVA_INT.withName("shaderInputAttachmentArrayNonUniformIndexing"),
        ValueLayout.JAVA_INT.withName("shaderUniformTexelBufferArrayNonUniformIndexing"),
        ValueLayout.JAVA_INT.withName("shaderStorageTexelBufferArrayNonUniformIndexing"),
        ValueLayout.JAVA_INT.withName("descriptorBindingUniformBufferUpdateAfterBind"),
        ValueLayout.JAVA_INT.withName("descriptorBindingSampledImageUpdateAfterBind"),
        ValueLayout.JAVA_INT.withName("descriptorBindingStorageImageUpdateAfterBind"),
        ValueLayout.JAVA_INT.withName("descriptorBindingStorageBufferUpdateAfterBind"),
        ValueLayout.JAVA_INT.withName("descriptorBindingUniformTexelBufferUpdateAfterBind"),
        ValueLayout.JAVA_INT.withName("descriptorBindingStorageTexelBufferUpdateAfterBind"),
        ValueLayout.JAVA_INT.withName("descriptorBindingUpdateUnusedWhilePending"),
        ValueLayout.JAVA_INT.withName("descriptorBindingPartiallyBound"),
        ValueLayout.JAVA_INT.withName("descriptorBindingVariableDescriptorCount"),
        ValueLayout.JAVA_INT.withName("runtimeDescriptorArray"),
        ValueLayout.JAVA_INT.withName("samplerFilterMinmax"),
        ValueLayout.JAVA_INT.withName("scalarBlockLayout"),
        ValueLayout.JAVA_INT.withName("imagelessFramebuffer"),
        ValueLayout.JAVA_INT.withName("uniformBufferStandardLayout"),
        ValueLayout.JAVA_INT.withName("shaderSubgroupExtendedTypes"),
        ValueLayout.JAVA_INT.withName("separateDepthStencilLayouts"),
        ValueLayout.JAVA_INT.withName("hostQueryReset"),
        ValueLayout.JAVA_INT.withName("timelineSemaphore"),
        ValueLayout.JAVA_INT.withName("bufferDeviceAddress"),
        ValueLayout.JAVA_INT.withName("bufferDeviceAddressCaptureReplay"),
        ValueLayout.JAVA_INT.withName("bufferDeviceAddressMultiDevice"),
        ValueLayout.JAVA_INT.withName("vulkanMemoryModel"),
        ValueLayout.JAVA_INT.withName("vulkanMemoryModelDeviceScope"),
        ValueLayout.JAVA_INT.withName("vulkanMemoryModelAvailabilityVisibilityChains"),
        ValueLayout.JAVA_INT.withName("shaderOutputViewportIndex"),
        ValueLayout.JAVA_INT.withName("shaderOutputLayer"),
        ValueLayout.JAVA_INT.withName("subgroupBroadcastDynamicId")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$samplerMirrorClampToEdge = PathElement.groupElement("samplerMirrorClampToEdge");
    public static final PathElement PATH$drawIndirectCount = PathElement.groupElement("drawIndirectCount");
    public static final PathElement PATH$storageBuffer8BitAccess = PathElement.groupElement("storageBuffer8BitAccess");
    public static final PathElement PATH$uniformAndStorageBuffer8BitAccess = PathElement.groupElement("uniformAndStorageBuffer8BitAccess");
    public static final PathElement PATH$storagePushConstant8 = PathElement.groupElement("storagePushConstant8");
    public static final PathElement PATH$shaderBufferInt64Atomics = PathElement.groupElement("shaderBufferInt64Atomics");
    public static final PathElement PATH$shaderSharedInt64Atomics = PathElement.groupElement("shaderSharedInt64Atomics");
    public static final PathElement PATH$shaderFloat16 = PathElement.groupElement("shaderFloat16");
    public static final PathElement PATH$shaderInt8 = PathElement.groupElement("shaderInt8");
    public static final PathElement PATH$descriptorIndexing = PathElement.groupElement("descriptorIndexing");
    public static final PathElement PATH$shaderInputAttachmentArrayDynamicIndexing = PathElement.groupElement("shaderInputAttachmentArrayDynamicIndexing");
    public static final PathElement PATH$shaderUniformTexelBufferArrayDynamicIndexing = PathElement.groupElement("shaderUniformTexelBufferArrayDynamicIndexing");
    public static final PathElement PATH$shaderStorageTexelBufferArrayDynamicIndexing = PathElement.groupElement("shaderStorageTexelBufferArrayDynamicIndexing");
    public static final PathElement PATH$shaderUniformBufferArrayNonUniformIndexing = PathElement.groupElement("shaderUniformBufferArrayNonUniformIndexing");
    public static final PathElement PATH$shaderSampledImageArrayNonUniformIndexing = PathElement.groupElement("shaderSampledImageArrayNonUniformIndexing");
    public static final PathElement PATH$shaderStorageBufferArrayNonUniformIndexing = PathElement.groupElement("shaderStorageBufferArrayNonUniformIndexing");
    public static final PathElement PATH$shaderStorageImageArrayNonUniformIndexing = PathElement.groupElement("shaderStorageImageArrayNonUniformIndexing");
    public static final PathElement PATH$shaderInputAttachmentArrayNonUniformIndexing = PathElement.groupElement("shaderInputAttachmentArrayNonUniformIndexing");
    public static final PathElement PATH$shaderUniformTexelBufferArrayNonUniformIndexing = PathElement.groupElement("shaderUniformTexelBufferArrayNonUniformIndexing");
    public static final PathElement PATH$shaderStorageTexelBufferArrayNonUniformIndexing = PathElement.groupElement("shaderStorageTexelBufferArrayNonUniformIndexing");
    public static final PathElement PATH$descriptorBindingUniformBufferUpdateAfterBind = PathElement.groupElement("descriptorBindingUniformBufferUpdateAfterBind");
    public static final PathElement PATH$descriptorBindingSampledImageUpdateAfterBind = PathElement.groupElement("descriptorBindingSampledImageUpdateAfterBind");
    public static final PathElement PATH$descriptorBindingStorageImageUpdateAfterBind = PathElement.groupElement("descriptorBindingStorageImageUpdateAfterBind");
    public static final PathElement PATH$descriptorBindingStorageBufferUpdateAfterBind = PathElement.groupElement("descriptorBindingStorageBufferUpdateAfterBind");
    public static final PathElement PATH$descriptorBindingUniformTexelBufferUpdateAfterBind = PathElement.groupElement("descriptorBindingUniformTexelBufferUpdateAfterBind");
    public static final PathElement PATH$descriptorBindingStorageTexelBufferUpdateAfterBind = PathElement.groupElement("descriptorBindingStorageTexelBufferUpdateAfterBind");
    public static final PathElement PATH$descriptorBindingUpdateUnusedWhilePending = PathElement.groupElement("descriptorBindingUpdateUnusedWhilePending");
    public static final PathElement PATH$descriptorBindingPartiallyBound = PathElement.groupElement("descriptorBindingPartiallyBound");
    public static final PathElement PATH$descriptorBindingVariableDescriptorCount = PathElement.groupElement("descriptorBindingVariableDescriptorCount");
    public static final PathElement PATH$runtimeDescriptorArray = PathElement.groupElement("runtimeDescriptorArray");
    public static final PathElement PATH$samplerFilterMinmax = PathElement.groupElement("samplerFilterMinmax");
    public static final PathElement PATH$scalarBlockLayout = PathElement.groupElement("scalarBlockLayout");
    public static final PathElement PATH$imagelessFramebuffer = PathElement.groupElement("imagelessFramebuffer");
    public static final PathElement PATH$uniformBufferStandardLayout = PathElement.groupElement("uniformBufferStandardLayout");
    public static final PathElement PATH$shaderSubgroupExtendedTypes = PathElement.groupElement("shaderSubgroupExtendedTypes");
    public static final PathElement PATH$separateDepthStencilLayouts = PathElement.groupElement("separateDepthStencilLayouts");
    public static final PathElement PATH$hostQueryReset = PathElement.groupElement("hostQueryReset");
    public static final PathElement PATH$timelineSemaphore = PathElement.groupElement("timelineSemaphore");
    public static final PathElement PATH$bufferDeviceAddress = PathElement.groupElement("bufferDeviceAddress");
    public static final PathElement PATH$bufferDeviceAddressCaptureReplay = PathElement.groupElement("bufferDeviceAddressCaptureReplay");
    public static final PathElement PATH$bufferDeviceAddressMultiDevice = PathElement.groupElement("bufferDeviceAddressMultiDevice");
    public static final PathElement PATH$vulkanMemoryModel = PathElement.groupElement("vulkanMemoryModel");
    public static final PathElement PATH$vulkanMemoryModelDeviceScope = PathElement.groupElement("vulkanMemoryModelDeviceScope");
    public static final PathElement PATH$vulkanMemoryModelAvailabilityVisibilityChains = PathElement.groupElement("vulkanMemoryModelAvailabilityVisibilityChains");
    public static final PathElement PATH$shaderOutputViewportIndex = PathElement.groupElement("shaderOutputViewportIndex");
    public static final PathElement PATH$shaderOutputLayer = PathElement.groupElement("shaderOutputLayer");
    public static final PathElement PATH$subgroupBroadcastDynamicId = PathElement.groupElement("subgroupBroadcastDynamicId");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$samplerMirrorClampToEdge = (OfInt) LAYOUT.select(PATH$samplerMirrorClampToEdge);
    public static final OfInt LAYOUT$drawIndirectCount = (OfInt) LAYOUT.select(PATH$drawIndirectCount);
    public static final OfInt LAYOUT$storageBuffer8BitAccess = (OfInt) LAYOUT.select(PATH$storageBuffer8BitAccess);
    public static final OfInt LAYOUT$uniformAndStorageBuffer8BitAccess = (OfInt) LAYOUT.select(PATH$uniformAndStorageBuffer8BitAccess);
    public static final OfInt LAYOUT$storagePushConstant8 = (OfInt) LAYOUT.select(PATH$storagePushConstant8);
    public static final OfInt LAYOUT$shaderBufferInt64Atomics = (OfInt) LAYOUT.select(PATH$shaderBufferInt64Atomics);
    public static final OfInt LAYOUT$shaderSharedInt64Atomics = (OfInt) LAYOUT.select(PATH$shaderSharedInt64Atomics);
    public static final OfInt LAYOUT$shaderFloat16 = (OfInt) LAYOUT.select(PATH$shaderFloat16);
    public static final OfInt LAYOUT$shaderInt8 = (OfInt) LAYOUT.select(PATH$shaderInt8);
    public static final OfInt LAYOUT$descriptorIndexing = (OfInt) LAYOUT.select(PATH$descriptorIndexing);
    public static final OfInt LAYOUT$shaderInputAttachmentArrayDynamicIndexing = (OfInt) LAYOUT.select(PATH$shaderInputAttachmentArrayDynamicIndexing);
    public static final OfInt LAYOUT$shaderUniformTexelBufferArrayDynamicIndexing = (OfInt) LAYOUT.select(PATH$shaderUniformTexelBufferArrayDynamicIndexing);
    public static final OfInt LAYOUT$shaderStorageTexelBufferArrayDynamicIndexing = (OfInt) LAYOUT.select(PATH$shaderStorageTexelBufferArrayDynamicIndexing);
    public static final OfInt LAYOUT$shaderUniformBufferArrayNonUniformIndexing = (OfInt) LAYOUT.select(PATH$shaderUniformBufferArrayNonUniformIndexing);
    public static final OfInt LAYOUT$shaderSampledImageArrayNonUniformIndexing = (OfInt) LAYOUT.select(PATH$shaderSampledImageArrayNonUniformIndexing);
    public static final OfInt LAYOUT$shaderStorageBufferArrayNonUniformIndexing = (OfInt) LAYOUT.select(PATH$shaderStorageBufferArrayNonUniformIndexing);
    public static final OfInt LAYOUT$shaderStorageImageArrayNonUniformIndexing = (OfInt) LAYOUT.select(PATH$shaderStorageImageArrayNonUniformIndexing);
    public static final OfInt LAYOUT$shaderInputAttachmentArrayNonUniformIndexing = (OfInt) LAYOUT.select(PATH$shaderInputAttachmentArrayNonUniformIndexing);
    public static final OfInt LAYOUT$shaderUniformTexelBufferArrayNonUniformIndexing = (OfInt) LAYOUT.select(PATH$shaderUniformTexelBufferArrayNonUniformIndexing);
    public static final OfInt LAYOUT$shaderStorageTexelBufferArrayNonUniformIndexing = (OfInt) LAYOUT.select(PATH$shaderStorageTexelBufferArrayNonUniformIndexing);
    public static final OfInt LAYOUT$descriptorBindingUniformBufferUpdateAfterBind = (OfInt) LAYOUT.select(PATH$descriptorBindingUniformBufferUpdateAfterBind);
    public static final OfInt LAYOUT$descriptorBindingSampledImageUpdateAfterBind = (OfInt) LAYOUT.select(PATH$descriptorBindingSampledImageUpdateAfterBind);
    public static final OfInt LAYOUT$descriptorBindingStorageImageUpdateAfterBind = (OfInt) LAYOUT.select(PATH$descriptorBindingStorageImageUpdateAfterBind);
    public static final OfInt LAYOUT$descriptorBindingStorageBufferUpdateAfterBind = (OfInt) LAYOUT.select(PATH$descriptorBindingStorageBufferUpdateAfterBind);
    public static final OfInt LAYOUT$descriptorBindingUniformTexelBufferUpdateAfterBind = (OfInt) LAYOUT.select(PATH$descriptorBindingUniformTexelBufferUpdateAfterBind);
    public static final OfInt LAYOUT$descriptorBindingStorageTexelBufferUpdateAfterBind = (OfInt) LAYOUT.select(PATH$descriptorBindingStorageTexelBufferUpdateAfterBind);
    public static final OfInt LAYOUT$descriptorBindingUpdateUnusedWhilePending = (OfInt) LAYOUT.select(PATH$descriptorBindingUpdateUnusedWhilePending);
    public static final OfInt LAYOUT$descriptorBindingPartiallyBound = (OfInt) LAYOUT.select(PATH$descriptorBindingPartiallyBound);
    public static final OfInt LAYOUT$descriptorBindingVariableDescriptorCount = (OfInt) LAYOUT.select(PATH$descriptorBindingVariableDescriptorCount);
    public static final OfInt LAYOUT$runtimeDescriptorArray = (OfInt) LAYOUT.select(PATH$runtimeDescriptorArray);
    public static final OfInt LAYOUT$samplerFilterMinmax = (OfInt) LAYOUT.select(PATH$samplerFilterMinmax);
    public static final OfInt LAYOUT$scalarBlockLayout = (OfInt) LAYOUT.select(PATH$scalarBlockLayout);
    public static final OfInt LAYOUT$imagelessFramebuffer = (OfInt) LAYOUT.select(PATH$imagelessFramebuffer);
    public static final OfInt LAYOUT$uniformBufferStandardLayout = (OfInt) LAYOUT.select(PATH$uniformBufferStandardLayout);
    public static final OfInt LAYOUT$shaderSubgroupExtendedTypes = (OfInt) LAYOUT.select(PATH$shaderSubgroupExtendedTypes);
    public static final OfInt LAYOUT$separateDepthStencilLayouts = (OfInt) LAYOUT.select(PATH$separateDepthStencilLayouts);
    public static final OfInt LAYOUT$hostQueryReset = (OfInt) LAYOUT.select(PATH$hostQueryReset);
    public static final OfInt LAYOUT$timelineSemaphore = (OfInt) LAYOUT.select(PATH$timelineSemaphore);
    public static final OfInt LAYOUT$bufferDeviceAddress = (OfInt) LAYOUT.select(PATH$bufferDeviceAddress);
    public static final OfInt LAYOUT$bufferDeviceAddressCaptureReplay = (OfInt) LAYOUT.select(PATH$bufferDeviceAddressCaptureReplay);
    public static final OfInt LAYOUT$bufferDeviceAddressMultiDevice = (OfInt) LAYOUT.select(PATH$bufferDeviceAddressMultiDevice);
    public static final OfInt LAYOUT$vulkanMemoryModel = (OfInt) LAYOUT.select(PATH$vulkanMemoryModel);
    public static final OfInt LAYOUT$vulkanMemoryModelDeviceScope = (OfInt) LAYOUT.select(PATH$vulkanMemoryModelDeviceScope);
    public static final OfInt LAYOUT$vulkanMemoryModelAvailabilityVisibilityChains = (OfInt) LAYOUT.select(PATH$vulkanMemoryModelAvailabilityVisibilityChains);
    public static final OfInt LAYOUT$shaderOutputViewportIndex = (OfInt) LAYOUT.select(PATH$shaderOutputViewportIndex);
    public static final OfInt LAYOUT$shaderOutputLayer = (OfInt) LAYOUT.select(PATH$shaderOutputLayer);
    public static final OfInt LAYOUT$subgroupBroadcastDynamicId = (OfInt) LAYOUT.select(PATH$subgroupBroadcastDynamicId);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$samplerMirrorClampToEdge = LAYOUT.byteOffset(PATH$samplerMirrorClampToEdge);
    public static final long OFFSET$drawIndirectCount = LAYOUT.byteOffset(PATH$drawIndirectCount);
    public static final long OFFSET$storageBuffer8BitAccess = LAYOUT.byteOffset(PATH$storageBuffer8BitAccess);
    public static final long OFFSET$uniformAndStorageBuffer8BitAccess = LAYOUT.byteOffset(PATH$uniformAndStorageBuffer8BitAccess);
    public static final long OFFSET$storagePushConstant8 = LAYOUT.byteOffset(PATH$storagePushConstant8);
    public static final long OFFSET$shaderBufferInt64Atomics = LAYOUT.byteOffset(PATH$shaderBufferInt64Atomics);
    public static final long OFFSET$shaderSharedInt64Atomics = LAYOUT.byteOffset(PATH$shaderSharedInt64Atomics);
    public static final long OFFSET$shaderFloat16 = LAYOUT.byteOffset(PATH$shaderFloat16);
    public static final long OFFSET$shaderInt8 = LAYOUT.byteOffset(PATH$shaderInt8);
    public static final long OFFSET$descriptorIndexing = LAYOUT.byteOffset(PATH$descriptorIndexing);
    public static final long OFFSET$shaderInputAttachmentArrayDynamicIndexing = LAYOUT.byteOffset(PATH$shaderInputAttachmentArrayDynamicIndexing);
    public static final long OFFSET$shaderUniformTexelBufferArrayDynamicIndexing = LAYOUT.byteOffset(PATH$shaderUniformTexelBufferArrayDynamicIndexing);
    public static final long OFFSET$shaderStorageTexelBufferArrayDynamicIndexing = LAYOUT.byteOffset(PATH$shaderStorageTexelBufferArrayDynamicIndexing);
    public static final long OFFSET$shaderUniformBufferArrayNonUniformIndexing = LAYOUT.byteOffset(PATH$shaderUniformBufferArrayNonUniformIndexing);
    public static final long OFFSET$shaderSampledImageArrayNonUniformIndexing = LAYOUT.byteOffset(PATH$shaderSampledImageArrayNonUniformIndexing);
    public static final long OFFSET$shaderStorageBufferArrayNonUniformIndexing = LAYOUT.byteOffset(PATH$shaderStorageBufferArrayNonUniformIndexing);
    public static final long OFFSET$shaderStorageImageArrayNonUniformIndexing = LAYOUT.byteOffset(PATH$shaderStorageImageArrayNonUniformIndexing);
    public static final long OFFSET$shaderInputAttachmentArrayNonUniformIndexing = LAYOUT.byteOffset(PATH$shaderInputAttachmentArrayNonUniformIndexing);
    public static final long OFFSET$shaderUniformTexelBufferArrayNonUniformIndexing = LAYOUT.byteOffset(PATH$shaderUniformTexelBufferArrayNonUniformIndexing);
    public static final long OFFSET$shaderStorageTexelBufferArrayNonUniformIndexing = LAYOUT.byteOffset(PATH$shaderStorageTexelBufferArrayNonUniformIndexing);
    public static final long OFFSET$descriptorBindingUniformBufferUpdateAfterBind = LAYOUT.byteOffset(PATH$descriptorBindingUniformBufferUpdateAfterBind);
    public static final long OFFSET$descriptorBindingSampledImageUpdateAfterBind = LAYOUT.byteOffset(PATH$descriptorBindingSampledImageUpdateAfterBind);
    public static final long OFFSET$descriptorBindingStorageImageUpdateAfterBind = LAYOUT.byteOffset(PATH$descriptorBindingStorageImageUpdateAfterBind);
    public static final long OFFSET$descriptorBindingStorageBufferUpdateAfterBind = LAYOUT.byteOffset(PATH$descriptorBindingStorageBufferUpdateAfterBind);
    public static final long OFFSET$descriptorBindingUniformTexelBufferUpdateAfterBind = LAYOUT.byteOffset(PATH$descriptorBindingUniformTexelBufferUpdateAfterBind);
    public static final long OFFSET$descriptorBindingStorageTexelBufferUpdateAfterBind = LAYOUT.byteOffset(PATH$descriptorBindingStorageTexelBufferUpdateAfterBind);
    public static final long OFFSET$descriptorBindingUpdateUnusedWhilePending = LAYOUT.byteOffset(PATH$descriptorBindingUpdateUnusedWhilePending);
    public static final long OFFSET$descriptorBindingPartiallyBound = LAYOUT.byteOffset(PATH$descriptorBindingPartiallyBound);
    public static final long OFFSET$descriptorBindingVariableDescriptorCount = LAYOUT.byteOffset(PATH$descriptorBindingVariableDescriptorCount);
    public static final long OFFSET$runtimeDescriptorArray = LAYOUT.byteOffset(PATH$runtimeDescriptorArray);
    public static final long OFFSET$samplerFilterMinmax = LAYOUT.byteOffset(PATH$samplerFilterMinmax);
    public static final long OFFSET$scalarBlockLayout = LAYOUT.byteOffset(PATH$scalarBlockLayout);
    public static final long OFFSET$imagelessFramebuffer = LAYOUT.byteOffset(PATH$imagelessFramebuffer);
    public static final long OFFSET$uniformBufferStandardLayout = LAYOUT.byteOffset(PATH$uniformBufferStandardLayout);
    public static final long OFFSET$shaderSubgroupExtendedTypes = LAYOUT.byteOffset(PATH$shaderSubgroupExtendedTypes);
    public static final long OFFSET$separateDepthStencilLayouts = LAYOUT.byteOffset(PATH$separateDepthStencilLayouts);
    public static final long OFFSET$hostQueryReset = LAYOUT.byteOffset(PATH$hostQueryReset);
    public static final long OFFSET$timelineSemaphore = LAYOUT.byteOffset(PATH$timelineSemaphore);
    public static final long OFFSET$bufferDeviceAddress = LAYOUT.byteOffset(PATH$bufferDeviceAddress);
    public static final long OFFSET$bufferDeviceAddressCaptureReplay = LAYOUT.byteOffset(PATH$bufferDeviceAddressCaptureReplay);
    public static final long OFFSET$bufferDeviceAddressMultiDevice = LAYOUT.byteOffset(PATH$bufferDeviceAddressMultiDevice);
    public static final long OFFSET$vulkanMemoryModel = LAYOUT.byteOffset(PATH$vulkanMemoryModel);
    public static final long OFFSET$vulkanMemoryModelDeviceScope = LAYOUT.byteOffset(PATH$vulkanMemoryModelDeviceScope);
    public static final long OFFSET$vulkanMemoryModelAvailabilityVisibilityChains = LAYOUT.byteOffset(PATH$vulkanMemoryModelAvailabilityVisibilityChains);
    public static final long OFFSET$shaderOutputViewportIndex = LAYOUT.byteOffset(PATH$shaderOutputViewportIndex);
    public static final long OFFSET$shaderOutputLayer = LAYOUT.byteOffset(PATH$shaderOutputLayer);
    public static final long OFFSET$subgroupBroadcastDynamicId = LAYOUT.byteOffset(PATH$subgroupBroadcastDynamicId);

    public VkPhysicalDeviceVulkan12Features(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_2_FEATURES);
    }

    public @enumtype(VkStructureType.class) int sType() {
        return segment.get(LAYOUT$sType, OFFSET$sType);
    }

    public void sType(@enumtype(VkStructureType.class) int value) {
        segment.set(LAYOUT$sType, OFFSET$sType, value);
    }

    public @pointer(comment="void*") MemorySegment pNext() {
        return segment.get(LAYOUT$pNext, OFFSET$pNext);
    }

    public void pNext(@pointer(comment="void*") MemorySegment value) {
        segment.set(LAYOUT$pNext, OFFSET$pNext, value);
    }

    public @unsigned int samplerMirrorClampToEdge() {
        return segment.get(LAYOUT$samplerMirrorClampToEdge, OFFSET$samplerMirrorClampToEdge);
    }

    public void samplerMirrorClampToEdge(@unsigned int value) {
        segment.set(LAYOUT$samplerMirrorClampToEdge, OFFSET$samplerMirrorClampToEdge, value);
    }

    public @unsigned int drawIndirectCount() {
        return segment.get(LAYOUT$drawIndirectCount, OFFSET$drawIndirectCount);
    }

    public void drawIndirectCount(@unsigned int value) {
        segment.set(LAYOUT$drawIndirectCount, OFFSET$drawIndirectCount, value);
    }

    public @unsigned int storageBuffer8BitAccess() {
        return segment.get(LAYOUT$storageBuffer8BitAccess, OFFSET$storageBuffer8BitAccess);
    }

    public void storageBuffer8BitAccess(@unsigned int value) {
        segment.set(LAYOUT$storageBuffer8BitAccess, OFFSET$storageBuffer8BitAccess, value);
    }

    public @unsigned int uniformAndStorageBuffer8BitAccess() {
        return segment.get(LAYOUT$uniformAndStorageBuffer8BitAccess, OFFSET$uniformAndStorageBuffer8BitAccess);
    }

    public void uniformAndStorageBuffer8BitAccess(@unsigned int value) {
        segment.set(LAYOUT$uniformAndStorageBuffer8BitAccess, OFFSET$uniformAndStorageBuffer8BitAccess, value);
    }

    public @unsigned int storagePushConstant8() {
        return segment.get(LAYOUT$storagePushConstant8, OFFSET$storagePushConstant8);
    }

    public void storagePushConstant8(@unsigned int value) {
        segment.set(LAYOUT$storagePushConstant8, OFFSET$storagePushConstant8, value);
    }

    public @unsigned int shaderBufferInt64Atomics() {
        return segment.get(LAYOUT$shaderBufferInt64Atomics, OFFSET$shaderBufferInt64Atomics);
    }

    public void shaderBufferInt64Atomics(@unsigned int value) {
        segment.set(LAYOUT$shaderBufferInt64Atomics, OFFSET$shaderBufferInt64Atomics, value);
    }

    public @unsigned int shaderSharedInt64Atomics() {
        return segment.get(LAYOUT$shaderSharedInt64Atomics, OFFSET$shaderSharedInt64Atomics);
    }

    public void shaderSharedInt64Atomics(@unsigned int value) {
        segment.set(LAYOUT$shaderSharedInt64Atomics, OFFSET$shaderSharedInt64Atomics, value);
    }

    public @unsigned int shaderFloat16() {
        return segment.get(LAYOUT$shaderFloat16, OFFSET$shaderFloat16);
    }

    public void shaderFloat16(@unsigned int value) {
        segment.set(LAYOUT$shaderFloat16, OFFSET$shaderFloat16, value);
    }

    public @unsigned int shaderInt8() {
        return segment.get(LAYOUT$shaderInt8, OFFSET$shaderInt8);
    }

    public void shaderInt8(@unsigned int value) {
        segment.set(LAYOUT$shaderInt8, OFFSET$shaderInt8, value);
    }

    public @unsigned int descriptorIndexing() {
        return segment.get(LAYOUT$descriptorIndexing, OFFSET$descriptorIndexing);
    }

    public void descriptorIndexing(@unsigned int value) {
        segment.set(LAYOUT$descriptorIndexing, OFFSET$descriptorIndexing, value);
    }

    public @unsigned int shaderInputAttachmentArrayDynamicIndexing() {
        return segment.get(LAYOUT$shaderInputAttachmentArrayDynamicIndexing, OFFSET$shaderInputAttachmentArrayDynamicIndexing);
    }

    public void shaderInputAttachmentArrayDynamicIndexing(@unsigned int value) {
        segment.set(LAYOUT$shaderInputAttachmentArrayDynamicIndexing, OFFSET$shaderInputAttachmentArrayDynamicIndexing, value);
    }

    public @unsigned int shaderUniformTexelBufferArrayDynamicIndexing() {
        return segment.get(LAYOUT$shaderUniformTexelBufferArrayDynamicIndexing, OFFSET$shaderUniformTexelBufferArrayDynamicIndexing);
    }

    public void shaderUniformTexelBufferArrayDynamicIndexing(@unsigned int value) {
        segment.set(LAYOUT$shaderUniformTexelBufferArrayDynamicIndexing, OFFSET$shaderUniformTexelBufferArrayDynamicIndexing, value);
    }

    public @unsigned int shaderStorageTexelBufferArrayDynamicIndexing() {
        return segment.get(LAYOUT$shaderStorageTexelBufferArrayDynamicIndexing, OFFSET$shaderStorageTexelBufferArrayDynamicIndexing);
    }

    public void shaderStorageTexelBufferArrayDynamicIndexing(@unsigned int value) {
        segment.set(LAYOUT$shaderStorageTexelBufferArrayDynamicIndexing, OFFSET$shaderStorageTexelBufferArrayDynamicIndexing, value);
    }

    public @unsigned int shaderUniformBufferArrayNonUniformIndexing() {
        return segment.get(LAYOUT$shaderUniformBufferArrayNonUniformIndexing, OFFSET$shaderUniformBufferArrayNonUniformIndexing);
    }

    public void shaderUniformBufferArrayNonUniformIndexing(@unsigned int value) {
        segment.set(LAYOUT$shaderUniformBufferArrayNonUniformIndexing, OFFSET$shaderUniformBufferArrayNonUniformIndexing, value);
    }

    public @unsigned int shaderSampledImageArrayNonUniformIndexing() {
        return segment.get(LAYOUT$shaderSampledImageArrayNonUniformIndexing, OFFSET$shaderSampledImageArrayNonUniformIndexing);
    }

    public void shaderSampledImageArrayNonUniformIndexing(@unsigned int value) {
        segment.set(LAYOUT$shaderSampledImageArrayNonUniformIndexing, OFFSET$shaderSampledImageArrayNonUniformIndexing, value);
    }

    public @unsigned int shaderStorageBufferArrayNonUniformIndexing() {
        return segment.get(LAYOUT$shaderStorageBufferArrayNonUniformIndexing, OFFSET$shaderStorageBufferArrayNonUniformIndexing);
    }

    public void shaderStorageBufferArrayNonUniformIndexing(@unsigned int value) {
        segment.set(LAYOUT$shaderStorageBufferArrayNonUniformIndexing, OFFSET$shaderStorageBufferArrayNonUniformIndexing, value);
    }

    public @unsigned int shaderStorageImageArrayNonUniformIndexing() {
        return segment.get(LAYOUT$shaderStorageImageArrayNonUniformIndexing, OFFSET$shaderStorageImageArrayNonUniformIndexing);
    }

    public void shaderStorageImageArrayNonUniformIndexing(@unsigned int value) {
        segment.set(LAYOUT$shaderStorageImageArrayNonUniformIndexing, OFFSET$shaderStorageImageArrayNonUniformIndexing, value);
    }

    public @unsigned int shaderInputAttachmentArrayNonUniformIndexing() {
        return segment.get(LAYOUT$shaderInputAttachmentArrayNonUniformIndexing, OFFSET$shaderInputAttachmentArrayNonUniformIndexing);
    }

    public void shaderInputAttachmentArrayNonUniformIndexing(@unsigned int value) {
        segment.set(LAYOUT$shaderInputAttachmentArrayNonUniformIndexing, OFFSET$shaderInputAttachmentArrayNonUniformIndexing, value);
    }

    public @unsigned int shaderUniformTexelBufferArrayNonUniformIndexing() {
        return segment.get(LAYOUT$shaderUniformTexelBufferArrayNonUniformIndexing, OFFSET$shaderUniformTexelBufferArrayNonUniformIndexing);
    }

    public void shaderUniformTexelBufferArrayNonUniformIndexing(@unsigned int value) {
        segment.set(LAYOUT$shaderUniformTexelBufferArrayNonUniformIndexing, OFFSET$shaderUniformTexelBufferArrayNonUniformIndexing, value);
    }

    public @unsigned int shaderStorageTexelBufferArrayNonUniformIndexing() {
        return segment.get(LAYOUT$shaderStorageTexelBufferArrayNonUniformIndexing, OFFSET$shaderStorageTexelBufferArrayNonUniformIndexing);
    }

    public void shaderStorageTexelBufferArrayNonUniformIndexing(@unsigned int value) {
        segment.set(LAYOUT$shaderStorageTexelBufferArrayNonUniformIndexing, OFFSET$shaderStorageTexelBufferArrayNonUniformIndexing, value);
    }

    public @unsigned int descriptorBindingUniformBufferUpdateAfterBind() {
        return segment.get(LAYOUT$descriptorBindingUniformBufferUpdateAfterBind, OFFSET$descriptorBindingUniformBufferUpdateAfterBind);
    }

    public void descriptorBindingUniformBufferUpdateAfterBind(@unsigned int value) {
        segment.set(LAYOUT$descriptorBindingUniformBufferUpdateAfterBind, OFFSET$descriptorBindingUniformBufferUpdateAfterBind, value);
    }

    public @unsigned int descriptorBindingSampledImageUpdateAfterBind() {
        return segment.get(LAYOUT$descriptorBindingSampledImageUpdateAfterBind, OFFSET$descriptorBindingSampledImageUpdateAfterBind);
    }

    public void descriptorBindingSampledImageUpdateAfterBind(@unsigned int value) {
        segment.set(LAYOUT$descriptorBindingSampledImageUpdateAfterBind, OFFSET$descriptorBindingSampledImageUpdateAfterBind, value);
    }

    public @unsigned int descriptorBindingStorageImageUpdateAfterBind() {
        return segment.get(LAYOUT$descriptorBindingStorageImageUpdateAfterBind, OFFSET$descriptorBindingStorageImageUpdateAfterBind);
    }

    public void descriptorBindingStorageImageUpdateAfterBind(@unsigned int value) {
        segment.set(LAYOUT$descriptorBindingStorageImageUpdateAfterBind, OFFSET$descriptorBindingStorageImageUpdateAfterBind, value);
    }

    public @unsigned int descriptorBindingStorageBufferUpdateAfterBind() {
        return segment.get(LAYOUT$descriptorBindingStorageBufferUpdateAfterBind, OFFSET$descriptorBindingStorageBufferUpdateAfterBind);
    }

    public void descriptorBindingStorageBufferUpdateAfterBind(@unsigned int value) {
        segment.set(LAYOUT$descriptorBindingStorageBufferUpdateAfterBind, OFFSET$descriptorBindingStorageBufferUpdateAfterBind, value);
    }

    public @unsigned int descriptorBindingUniformTexelBufferUpdateAfterBind() {
        return segment.get(LAYOUT$descriptorBindingUniformTexelBufferUpdateAfterBind, OFFSET$descriptorBindingUniformTexelBufferUpdateAfterBind);
    }

    public void descriptorBindingUniformTexelBufferUpdateAfterBind(@unsigned int value) {
        segment.set(LAYOUT$descriptorBindingUniformTexelBufferUpdateAfterBind, OFFSET$descriptorBindingUniformTexelBufferUpdateAfterBind, value);
    }

    public @unsigned int descriptorBindingStorageTexelBufferUpdateAfterBind() {
        return segment.get(LAYOUT$descriptorBindingStorageTexelBufferUpdateAfterBind, OFFSET$descriptorBindingStorageTexelBufferUpdateAfterBind);
    }

    public void descriptorBindingStorageTexelBufferUpdateAfterBind(@unsigned int value) {
        segment.set(LAYOUT$descriptorBindingStorageTexelBufferUpdateAfterBind, OFFSET$descriptorBindingStorageTexelBufferUpdateAfterBind, value);
    }

    public @unsigned int descriptorBindingUpdateUnusedWhilePending() {
        return segment.get(LAYOUT$descriptorBindingUpdateUnusedWhilePending, OFFSET$descriptorBindingUpdateUnusedWhilePending);
    }

    public void descriptorBindingUpdateUnusedWhilePending(@unsigned int value) {
        segment.set(LAYOUT$descriptorBindingUpdateUnusedWhilePending, OFFSET$descriptorBindingUpdateUnusedWhilePending, value);
    }

    public @unsigned int descriptorBindingPartiallyBound() {
        return segment.get(LAYOUT$descriptorBindingPartiallyBound, OFFSET$descriptorBindingPartiallyBound);
    }

    public void descriptorBindingPartiallyBound(@unsigned int value) {
        segment.set(LAYOUT$descriptorBindingPartiallyBound, OFFSET$descriptorBindingPartiallyBound, value);
    }

    public @unsigned int descriptorBindingVariableDescriptorCount() {
        return segment.get(LAYOUT$descriptorBindingVariableDescriptorCount, OFFSET$descriptorBindingVariableDescriptorCount);
    }

    public void descriptorBindingVariableDescriptorCount(@unsigned int value) {
        segment.set(LAYOUT$descriptorBindingVariableDescriptorCount, OFFSET$descriptorBindingVariableDescriptorCount, value);
    }

    public @unsigned int runtimeDescriptorArray() {
        return segment.get(LAYOUT$runtimeDescriptorArray, OFFSET$runtimeDescriptorArray);
    }

    public void runtimeDescriptorArray(@unsigned int value) {
        segment.set(LAYOUT$runtimeDescriptorArray, OFFSET$runtimeDescriptorArray, value);
    }

    public @unsigned int samplerFilterMinmax() {
        return segment.get(LAYOUT$samplerFilterMinmax, OFFSET$samplerFilterMinmax);
    }

    public void samplerFilterMinmax(@unsigned int value) {
        segment.set(LAYOUT$samplerFilterMinmax, OFFSET$samplerFilterMinmax, value);
    }

    public @unsigned int scalarBlockLayout() {
        return segment.get(LAYOUT$scalarBlockLayout, OFFSET$scalarBlockLayout);
    }

    public void scalarBlockLayout(@unsigned int value) {
        segment.set(LAYOUT$scalarBlockLayout, OFFSET$scalarBlockLayout, value);
    }

    public @unsigned int imagelessFramebuffer() {
        return segment.get(LAYOUT$imagelessFramebuffer, OFFSET$imagelessFramebuffer);
    }

    public void imagelessFramebuffer(@unsigned int value) {
        segment.set(LAYOUT$imagelessFramebuffer, OFFSET$imagelessFramebuffer, value);
    }

    public @unsigned int uniformBufferStandardLayout() {
        return segment.get(LAYOUT$uniformBufferStandardLayout, OFFSET$uniformBufferStandardLayout);
    }

    public void uniformBufferStandardLayout(@unsigned int value) {
        segment.set(LAYOUT$uniformBufferStandardLayout, OFFSET$uniformBufferStandardLayout, value);
    }

    public @unsigned int shaderSubgroupExtendedTypes() {
        return segment.get(LAYOUT$shaderSubgroupExtendedTypes, OFFSET$shaderSubgroupExtendedTypes);
    }

    public void shaderSubgroupExtendedTypes(@unsigned int value) {
        segment.set(LAYOUT$shaderSubgroupExtendedTypes, OFFSET$shaderSubgroupExtendedTypes, value);
    }

    public @unsigned int separateDepthStencilLayouts() {
        return segment.get(LAYOUT$separateDepthStencilLayouts, OFFSET$separateDepthStencilLayouts);
    }

    public void separateDepthStencilLayouts(@unsigned int value) {
        segment.set(LAYOUT$separateDepthStencilLayouts, OFFSET$separateDepthStencilLayouts, value);
    }

    public @unsigned int hostQueryReset() {
        return segment.get(LAYOUT$hostQueryReset, OFFSET$hostQueryReset);
    }

    public void hostQueryReset(@unsigned int value) {
        segment.set(LAYOUT$hostQueryReset, OFFSET$hostQueryReset, value);
    }

    public @unsigned int timelineSemaphore() {
        return segment.get(LAYOUT$timelineSemaphore, OFFSET$timelineSemaphore);
    }

    public void timelineSemaphore(@unsigned int value) {
        segment.set(LAYOUT$timelineSemaphore, OFFSET$timelineSemaphore, value);
    }

    public @unsigned int bufferDeviceAddress() {
        return segment.get(LAYOUT$bufferDeviceAddress, OFFSET$bufferDeviceAddress);
    }

    public void bufferDeviceAddress(@unsigned int value) {
        segment.set(LAYOUT$bufferDeviceAddress, OFFSET$bufferDeviceAddress, value);
    }

    public @unsigned int bufferDeviceAddressCaptureReplay() {
        return segment.get(LAYOUT$bufferDeviceAddressCaptureReplay, OFFSET$bufferDeviceAddressCaptureReplay);
    }

    public void bufferDeviceAddressCaptureReplay(@unsigned int value) {
        segment.set(LAYOUT$bufferDeviceAddressCaptureReplay, OFFSET$bufferDeviceAddressCaptureReplay, value);
    }

    public @unsigned int bufferDeviceAddressMultiDevice() {
        return segment.get(LAYOUT$bufferDeviceAddressMultiDevice, OFFSET$bufferDeviceAddressMultiDevice);
    }

    public void bufferDeviceAddressMultiDevice(@unsigned int value) {
        segment.set(LAYOUT$bufferDeviceAddressMultiDevice, OFFSET$bufferDeviceAddressMultiDevice, value);
    }

    public @unsigned int vulkanMemoryModel() {
        return segment.get(LAYOUT$vulkanMemoryModel, OFFSET$vulkanMemoryModel);
    }

    public void vulkanMemoryModel(@unsigned int value) {
        segment.set(LAYOUT$vulkanMemoryModel, OFFSET$vulkanMemoryModel, value);
    }

    public @unsigned int vulkanMemoryModelDeviceScope() {
        return segment.get(LAYOUT$vulkanMemoryModelDeviceScope, OFFSET$vulkanMemoryModelDeviceScope);
    }

    public void vulkanMemoryModelDeviceScope(@unsigned int value) {
        segment.set(LAYOUT$vulkanMemoryModelDeviceScope, OFFSET$vulkanMemoryModelDeviceScope, value);
    }

    public @unsigned int vulkanMemoryModelAvailabilityVisibilityChains() {
        return segment.get(LAYOUT$vulkanMemoryModelAvailabilityVisibilityChains, OFFSET$vulkanMemoryModelAvailabilityVisibilityChains);
    }

    public void vulkanMemoryModelAvailabilityVisibilityChains(@unsigned int value) {
        segment.set(LAYOUT$vulkanMemoryModelAvailabilityVisibilityChains, OFFSET$vulkanMemoryModelAvailabilityVisibilityChains, value);
    }

    public @unsigned int shaderOutputViewportIndex() {
        return segment.get(LAYOUT$shaderOutputViewportIndex, OFFSET$shaderOutputViewportIndex);
    }

    public void shaderOutputViewportIndex(@unsigned int value) {
        segment.set(LAYOUT$shaderOutputViewportIndex, OFFSET$shaderOutputViewportIndex, value);
    }

    public @unsigned int shaderOutputLayer() {
        return segment.get(LAYOUT$shaderOutputLayer, OFFSET$shaderOutputLayer);
    }

    public void shaderOutputLayer(@unsigned int value) {
        segment.set(LAYOUT$shaderOutputLayer, OFFSET$shaderOutputLayer, value);
    }

    public @unsigned int subgroupBroadcastDynamicId() {
        return segment.get(LAYOUT$subgroupBroadcastDynamicId, OFFSET$subgroupBroadcastDynamicId);
    }

    public void subgroupBroadcastDynamicId(@unsigned int value) {
        segment.set(LAYOUT$subgroupBroadcastDynamicId, OFFSET$subgroupBroadcastDynamicId, value);
    }


    public static final class Factory implements IFactory<VkPhysicalDeviceVulkan12Features> {
        @Override
        public Class<VkPhysicalDeviceVulkan12Features> clazz() {
            return VkPhysicalDeviceVulkan12Features.class;
        }

        @Override
        public MemoryLayout layout() {
            return VkPhysicalDeviceVulkan12Features.LAYOUT;
        }

        @Override
        public VkPhysicalDeviceVulkan12Features create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkPhysicalDeviceVulkan12Features createUninit(MemorySegment segment) {
            return new VkPhysicalDeviceVulkan12Features(segment);
        }
    }

    public static final Factory FACTORY = new Factory();
}
