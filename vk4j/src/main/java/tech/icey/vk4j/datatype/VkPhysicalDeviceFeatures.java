package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.IPointer;
import tech.icey.vk4j.annotation.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.buffer.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import tech.icey.vk4j.NativeLayout;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

/// {@snippet lang=c :
/// typedef struct VkPhysicalDeviceFeatures {
///     VkBool32 robustBufferAccess;
///     VkBool32 fullDrawIndexUint32;
///     VkBool32 imageCubeArray;
///     VkBool32 independentBlend;
///     VkBool32 geometryShader;
///     VkBool32 tessellationShader;
///     VkBool32 sampleRateShading;
///     VkBool32 dualSrcBlend;
///     VkBool32 logicOp;
///     VkBool32 multiDrawIndirect;
///     VkBool32 drawIndirectFirstInstance;
///     VkBool32 depthClamp;
///     VkBool32 depthBiasClamp;
///     VkBool32 fillModeNonSolid;
///     VkBool32 depthBounds;
///     VkBool32 wideLines;
///     VkBool32 largePoints;
///     VkBool32 alphaToOne;
///     VkBool32 multiViewport;
///     VkBool32 samplerAnisotropy;
///     VkBool32 textureCompressionETC2;
///     VkBool32 textureCompressionASTC_LDR;
///     VkBool32 textureCompressionBC;
///     VkBool32 occlusionQueryPrecise;
///     VkBool32 pipelineStatisticsQuery;
///     VkBool32 vertexPipelineStoresAndAtomics;
///     VkBool32 fragmentStoresAndAtomics;
///     VkBool32 shaderTessellationAndGeometryPointSize;
///     VkBool32 shaderImageGatherExtended;
///     VkBool32 shaderStorageImageExtendedFormats;
///     VkBool32 shaderStorageImageMultisample;
///     VkBool32 shaderStorageImageReadWithoutFormat;
///     VkBool32 shaderStorageImageWriteWithoutFormat;
///     VkBool32 shaderUniformBufferArrayDynamicIndexing;
///     VkBool32 shaderSampledImageArrayDynamicIndexing;
///     VkBool32 shaderStorageBufferArrayDynamicIndexing;
///     VkBool32 shaderStorageImageArrayDynamicIndexing;
///     VkBool32 shaderClipDistance;
///     VkBool32 shaderCullDistance;
///     VkBool32 shaderFloat64;
///     VkBool32 shaderInt64;
///     VkBool32 shaderInt16;
///     VkBool32 shaderResourceResidency;
///     VkBool32 shaderResourceMinLod;
///     VkBool32 sparseBinding;
///     VkBool32 sparseResidencyBuffer;
///     VkBool32 sparseResidencyImage2D;
///     VkBool32 sparseResidencyImage3D;
///     VkBool32 sparseResidency2Samples;
///     VkBool32 sparseResidency4Samples;
///     VkBool32 sparseResidency8Samples;
///     VkBool32 sparseResidency16Samples;
///     VkBool32 sparseResidencyAliased;
///     VkBool32 variableMultisampleRate;
///     VkBool32 inheritedQueries;
/// } VkPhysicalDeviceFeatures;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkPhysicalDeviceFeatures.html">VkPhysicalDeviceFeatures</a>
public record VkPhysicalDeviceFeatures(MemorySegment segment) implements IPointer {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("robustBufferAccess"),
        ValueLayout.JAVA_INT.withName("fullDrawIndexUint32"),
        ValueLayout.JAVA_INT.withName("imageCubeArray"),
        ValueLayout.JAVA_INT.withName("independentBlend"),
        ValueLayout.JAVA_INT.withName("geometryShader"),
        ValueLayout.JAVA_INT.withName("tessellationShader"),
        ValueLayout.JAVA_INT.withName("sampleRateShading"),
        ValueLayout.JAVA_INT.withName("dualSrcBlend"),
        ValueLayout.JAVA_INT.withName("logicOp"),
        ValueLayout.JAVA_INT.withName("multiDrawIndirect"),
        ValueLayout.JAVA_INT.withName("drawIndirectFirstInstance"),
        ValueLayout.JAVA_INT.withName("depthClamp"),
        ValueLayout.JAVA_INT.withName("depthBiasClamp"),
        ValueLayout.JAVA_INT.withName("fillModeNonSolid"),
        ValueLayout.JAVA_INT.withName("depthBounds"),
        ValueLayout.JAVA_INT.withName("wideLines"),
        ValueLayout.JAVA_INT.withName("largePoints"),
        ValueLayout.JAVA_INT.withName("alphaToOne"),
        ValueLayout.JAVA_INT.withName("multiViewport"),
        ValueLayout.JAVA_INT.withName("samplerAnisotropy"),
        ValueLayout.JAVA_INT.withName("textureCompressionETC2"),
        ValueLayout.JAVA_INT.withName("textureCompressionASTC_LDR"),
        ValueLayout.JAVA_INT.withName("textureCompressionBC"),
        ValueLayout.JAVA_INT.withName("occlusionQueryPrecise"),
        ValueLayout.JAVA_INT.withName("pipelineStatisticsQuery"),
        ValueLayout.JAVA_INT.withName("vertexPipelineStoresAndAtomics"),
        ValueLayout.JAVA_INT.withName("fragmentStoresAndAtomics"),
        ValueLayout.JAVA_INT.withName("shaderTessellationAndGeometryPointSize"),
        ValueLayout.JAVA_INT.withName("shaderImageGatherExtended"),
        ValueLayout.JAVA_INT.withName("shaderStorageImageExtendedFormats"),
        ValueLayout.JAVA_INT.withName("shaderStorageImageMultisample"),
        ValueLayout.JAVA_INT.withName("shaderStorageImageReadWithoutFormat"),
        ValueLayout.JAVA_INT.withName("shaderStorageImageWriteWithoutFormat"),
        ValueLayout.JAVA_INT.withName("shaderUniformBufferArrayDynamicIndexing"),
        ValueLayout.JAVA_INT.withName("shaderSampledImageArrayDynamicIndexing"),
        ValueLayout.JAVA_INT.withName("shaderStorageBufferArrayDynamicIndexing"),
        ValueLayout.JAVA_INT.withName("shaderStorageImageArrayDynamicIndexing"),
        ValueLayout.JAVA_INT.withName("shaderClipDistance"),
        ValueLayout.JAVA_INT.withName("shaderCullDistance"),
        ValueLayout.JAVA_INT.withName("shaderFloat64"),
        ValueLayout.JAVA_INT.withName("shaderInt64"),
        ValueLayout.JAVA_INT.withName("shaderInt16"),
        ValueLayout.JAVA_INT.withName("shaderResourceResidency"),
        ValueLayout.JAVA_INT.withName("shaderResourceMinLod"),
        ValueLayout.JAVA_INT.withName("sparseBinding"),
        ValueLayout.JAVA_INT.withName("sparseResidencyBuffer"),
        ValueLayout.JAVA_INT.withName("sparseResidencyImage2D"),
        ValueLayout.JAVA_INT.withName("sparseResidencyImage3D"),
        ValueLayout.JAVA_INT.withName("sparseResidency2Samples"),
        ValueLayout.JAVA_INT.withName("sparseResidency4Samples"),
        ValueLayout.JAVA_INT.withName("sparseResidency8Samples"),
        ValueLayout.JAVA_INT.withName("sparseResidency16Samples"),
        ValueLayout.JAVA_INT.withName("sparseResidencyAliased"),
        ValueLayout.JAVA_INT.withName("variableMultisampleRate"),
        ValueLayout.JAVA_INT.withName("inheritedQueries")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$robustBufferAccess = PathElement.groupElement("robustBufferAccess");
    public static final PathElement PATH$fullDrawIndexUint32 = PathElement.groupElement("fullDrawIndexUint32");
    public static final PathElement PATH$imageCubeArray = PathElement.groupElement("imageCubeArray");
    public static final PathElement PATH$independentBlend = PathElement.groupElement("independentBlend");
    public static final PathElement PATH$geometryShader = PathElement.groupElement("geometryShader");
    public static final PathElement PATH$tessellationShader = PathElement.groupElement("tessellationShader");
    public static final PathElement PATH$sampleRateShading = PathElement.groupElement("sampleRateShading");
    public static final PathElement PATH$dualSrcBlend = PathElement.groupElement("dualSrcBlend");
    public static final PathElement PATH$logicOp = PathElement.groupElement("logicOp");
    public static final PathElement PATH$multiDrawIndirect = PathElement.groupElement("multiDrawIndirect");
    public static final PathElement PATH$drawIndirectFirstInstance = PathElement.groupElement("drawIndirectFirstInstance");
    public static final PathElement PATH$depthClamp = PathElement.groupElement("depthClamp");
    public static final PathElement PATH$depthBiasClamp = PathElement.groupElement("depthBiasClamp");
    public static final PathElement PATH$fillModeNonSolid = PathElement.groupElement("fillModeNonSolid");
    public static final PathElement PATH$depthBounds = PathElement.groupElement("depthBounds");
    public static final PathElement PATH$wideLines = PathElement.groupElement("wideLines");
    public static final PathElement PATH$largePoints = PathElement.groupElement("largePoints");
    public static final PathElement PATH$alphaToOne = PathElement.groupElement("alphaToOne");
    public static final PathElement PATH$multiViewport = PathElement.groupElement("multiViewport");
    public static final PathElement PATH$samplerAnisotropy = PathElement.groupElement("samplerAnisotropy");
    public static final PathElement PATH$textureCompressionETC2 = PathElement.groupElement("textureCompressionETC2");
    public static final PathElement PATH$textureCompressionASTC_LDR = PathElement.groupElement("textureCompressionASTC_LDR");
    public static final PathElement PATH$textureCompressionBC = PathElement.groupElement("textureCompressionBC");
    public static final PathElement PATH$occlusionQueryPrecise = PathElement.groupElement("occlusionQueryPrecise");
    public static final PathElement PATH$pipelineStatisticsQuery = PathElement.groupElement("pipelineStatisticsQuery");
    public static final PathElement PATH$vertexPipelineStoresAndAtomics = PathElement.groupElement("vertexPipelineStoresAndAtomics");
    public static final PathElement PATH$fragmentStoresAndAtomics = PathElement.groupElement("fragmentStoresAndAtomics");
    public static final PathElement PATH$shaderTessellationAndGeometryPointSize = PathElement.groupElement("shaderTessellationAndGeometryPointSize");
    public static final PathElement PATH$shaderImageGatherExtended = PathElement.groupElement("shaderImageGatherExtended");
    public static final PathElement PATH$shaderStorageImageExtendedFormats = PathElement.groupElement("shaderStorageImageExtendedFormats");
    public static final PathElement PATH$shaderStorageImageMultisample = PathElement.groupElement("shaderStorageImageMultisample");
    public static final PathElement PATH$shaderStorageImageReadWithoutFormat = PathElement.groupElement("shaderStorageImageReadWithoutFormat");
    public static final PathElement PATH$shaderStorageImageWriteWithoutFormat = PathElement.groupElement("shaderStorageImageWriteWithoutFormat");
    public static final PathElement PATH$shaderUniformBufferArrayDynamicIndexing = PathElement.groupElement("shaderUniformBufferArrayDynamicIndexing");
    public static final PathElement PATH$shaderSampledImageArrayDynamicIndexing = PathElement.groupElement("shaderSampledImageArrayDynamicIndexing");
    public static final PathElement PATH$shaderStorageBufferArrayDynamicIndexing = PathElement.groupElement("shaderStorageBufferArrayDynamicIndexing");
    public static final PathElement PATH$shaderStorageImageArrayDynamicIndexing = PathElement.groupElement("shaderStorageImageArrayDynamicIndexing");
    public static final PathElement PATH$shaderClipDistance = PathElement.groupElement("shaderClipDistance");
    public static final PathElement PATH$shaderCullDistance = PathElement.groupElement("shaderCullDistance");
    public static final PathElement PATH$shaderFloat64 = PathElement.groupElement("shaderFloat64");
    public static final PathElement PATH$shaderInt64 = PathElement.groupElement("shaderInt64");
    public static final PathElement PATH$shaderInt16 = PathElement.groupElement("shaderInt16");
    public static final PathElement PATH$shaderResourceResidency = PathElement.groupElement("shaderResourceResidency");
    public static final PathElement PATH$shaderResourceMinLod = PathElement.groupElement("shaderResourceMinLod");
    public static final PathElement PATH$sparseBinding = PathElement.groupElement("sparseBinding");
    public static final PathElement PATH$sparseResidencyBuffer = PathElement.groupElement("sparseResidencyBuffer");
    public static final PathElement PATH$sparseResidencyImage2D = PathElement.groupElement("sparseResidencyImage2D");
    public static final PathElement PATH$sparseResidencyImage3D = PathElement.groupElement("sparseResidencyImage3D");
    public static final PathElement PATH$sparseResidency2Samples = PathElement.groupElement("sparseResidency2Samples");
    public static final PathElement PATH$sparseResidency4Samples = PathElement.groupElement("sparseResidency4Samples");
    public static final PathElement PATH$sparseResidency8Samples = PathElement.groupElement("sparseResidency8Samples");
    public static final PathElement PATH$sparseResidency16Samples = PathElement.groupElement("sparseResidency16Samples");
    public static final PathElement PATH$sparseResidencyAliased = PathElement.groupElement("sparseResidencyAliased");
    public static final PathElement PATH$variableMultisampleRate = PathElement.groupElement("variableMultisampleRate");
    public static final PathElement PATH$inheritedQueries = PathElement.groupElement("inheritedQueries");

    public static final OfInt LAYOUT$robustBufferAccess = (OfInt) LAYOUT.select(PATH$robustBufferAccess);
    public static final OfInt LAYOUT$fullDrawIndexUint32 = (OfInt) LAYOUT.select(PATH$fullDrawIndexUint32);
    public static final OfInt LAYOUT$imageCubeArray = (OfInt) LAYOUT.select(PATH$imageCubeArray);
    public static final OfInt LAYOUT$independentBlend = (OfInt) LAYOUT.select(PATH$independentBlend);
    public static final OfInt LAYOUT$geometryShader = (OfInt) LAYOUT.select(PATH$geometryShader);
    public static final OfInt LAYOUT$tessellationShader = (OfInt) LAYOUT.select(PATH$tessellationShader);
    public static final OfInt LAYOUT$sampleRateShading = (OfInt) LAYOUT.select(PATH$sampleRateShading);
    public static final OfInt LAYOUT$dualSrcBlend = (OfInt) LAYOUT.select(PATH$dualSrcBlend);
    public static final OfInt LAYOUT$logicOp = (OfInt) LAYOUT.select(PATH$logicOp);
    public static final OfInt LAYOUT$multiDrawIndirect = (OfInt) LAYOUT.select(PATH$multiDrawIndirect);
    public static final OfInt LAYOUT$drawIndirectFirstInstance = (OfInt) LAYOUT.select(PATH$drawIndirectFirstInstance);
    public static final OfInt LAYOUT$depthClamp = (OfInt) LAYOUT.select(PATH$depthClamp);
    public static final OfInt LAYOUT$depthBiasClamp = (OfInt) LAYOUT.select(PATH$depthBiasClamp);
    public static final OfInt LAYOUT$fillModeNonSolid = (OfInt) LAYOUT.select(PATH$fillModeNonSolid);
    public static final OfInt LAYOUT$depthBounds = (OfInt) LAYOUT.select(PATH$depthBounds);
    public static final OfInt LAYOUT$wideLines = (OfInt) LAYOUT.select(PATH$wideLines);
    public static final OfInt LAYOUT$largePoints = (OfInt) LAYOUT.select(PATH$largePoints);
    public static final OfInt LAYOUT$alphaToOne = (OfInt) LAYOUT.select(PATH$alphaToOne);
    public static final OfInt LAYOUT$multiViewport = (OfInt) LAYOUT.select(PATH$multiViewport);
    public static final OfInt LAYOUT$samplerAnisotropy = (OfInt) LAYOUT.select(PATH$samplerAnisotropy);
    public static final OfInt LAYOUT$textureCompressionETC2 = (OfInt) LAYOUT.select(PATH$textureCompressionETC2);
    public static final OfInt LAYOUT$textureCompressionASTC_LDR = (OfInt) LAYOUT.select(PATH$textureCompressionASTC_LDR);
    public static final OfInt LAYOUT$textureCompressionBC = (OfInt) LAYOUT.select(PATH$textureCompressionBC);
    public static final OfInt LAYOUT$occlusionQueryPrecise = (OfInt) LAYOUT.select(PATH$occlusionQueryPrecise);
    public static final OfInt LAYOUT$pipelineStatisticsQuery = (OfInt) LAYOUT.select(PATH$pipelineStatisticsQuery);
    public static final OfInt LAYOUT$vertexPipelineStoresAndAtomics = (OfInt) LAYOUT.select(PATH$vertexPipelineStoresAndAtomics);
    public static final OfInt LAYOUT$fragmentStoresAndAtomics = (OfInt) LAYOUT.select(PATH$fragmentStoresAndAtomics);
    public static final OfInt LAYOUT$shaderTessellationAndGeometryPointSize = (OfInt) LAYOUT.select(PATH$shaderTessellationAndGeometryPointSize);
    public static final OfInt LAYOUT$shaderImageGatherExtended = (OfInt) LAYOUT.select(PATH$shaderImageGatherExtended);
    public static final OfInt LAYOUT$shaderStorageImageExtendedFormats = (OfInt) LAYOUT.select(PATH$shaderStorageImageExtendedFormats);
    public static final OfInt LAYOUT$shaderStorageImageMultisample = (OfInt) LAYOUT.select(PATH$shaderStorageImageMultisample);
    public static final OfInt LAYOUT$shaderStorageImageReadWithoutFormat = (OfInt) LAYOUT.select(PATH$shaderStorageImageReadWithoutFormat);
    public static final OfInt LAYOUT$shaderStorageImageWriteWithoutFormat = (OfInt) LAYOUT.select(PATH$shaderStorageImageWriteWithoutFormat);
    public static final OfInt LAYOUT$shaderUniformBufferArrayDynamicIndexing = (OfInt) LAYOUT.select(PATH$shaderUniformBufferArrayDynamicIndexing);
    public static final OfInt LAYOUT$shaderSampledImageArrayDynamicIndexing = (OfInt) LAYOUT.select(PATH$shaderSampledImageArrayDynamicIndexing);
    public static final OfInt LAYOUT$shaderStorageBufferArrayDynamicIndexing = (OfInt) LAYOUT.select(PATH$shaderStorageBufferArrayDynamicIndexing);
    public static final OfInt LAYOUT$shaderStorageImageArrayDynamicIndexing = (OfInt) LAYOUT.select(PATH$shaderStorageImageArrayDynamicIndexing);
    public static final OfInt LAYOUT$shaderClipDistance = (OfInt) LAYOUT.select(PATH$shaderClipDistance);
    public static final OfInt LAYOUT$shaderCullDistance = (OfInt) LAYOUT.select(PATH$shaderCullDistance);
    public static final OfInt LAYOUT$shaderFloat64 = (OfInt) LAYOUT.select(PATH$shaderFloat64);
    public static final OfInt LAYOUT$shaderInt64 = (OfInt) LAYOUT.select(PATH$shaderInt64);
    public static final OfInt LAYOUT$shaderInt16 = (OfInt) LAYOUT.select(PATH$shaderInt16);
    public static final OfInt LAYOUT$shaderResourceResidency = (OfInt) LAYOUT.select(PATH$shaderResourceResidency);
    public static final OfInt LAYOUT$shaderResourceMinLod = (OfInt) LAYOUT.select(PATH$shaderResourceMinLod);
    public static final OfInt LAYOUT$sparseBinding = (OfInt) LAYOUT.select(PATH$sparseBinding);
    public static final OfInt LAYOUT$sparseResidencyBuffer = (OfInt) LAYOUT.select(PATH$sparseResidencyBuffer);
    public static final OfInt LAYOUT$sparseResidencyImage2D = (OfInt) LAYOUT.select(PATH$sparseResidencyImage2D);
    public static final OfInt LAYOUT$sparseResidencyImage3D = (OfInt) LAYOUT.select(PATH$sparseResidencyImage3D);
    public static final OfInt LAYOUT$sparseResidency2Samples = (OfInt) LAYOUT.select(PATH$sparseResidency2Samples);
    public static final OfInt LAYOUT$sparseResidency4Samples = (OfInt) LAYOUT.select(PATH$sparseResidency4Samples);
    public static final OfInt LAYOUT$sparseResidency8Samples = (OfInt) LAYOUT.select(PATH$sparseResidency8Samples);
    public static final OfInt LAYOUT$sparseResidency16Samples = (OfInt) LAYOUT.select(PATH$sparseResidency16Samples);
    public static final OfInt LAYOUT$sparseResidencyAliased = (OfInt) LAYOUT.select(PATH$sparseResidencyAliased);
    public static final OfInt LAYOUT$variableMultisampleRate = (OfInt) LAYOUT.select(PATH$variableMultisampleRate);
    public static final OfInt LAYOUT$inheritedQueries = (OfInt) LAYOUT.select(PATH$inheritedQueries);

    public static final long OFFSET$robustBufferAccess = LAYOUT.byteOffset(PATH$robustBufferAccess);
    public static final long OFFSET$fullDrawIndexUint32 = LAYOUT.byteOffset(PATH$fullDrawIndexUint32);
    public static final long OFFSET$imageCubeArray = LAYOUT.byteOffset(PATH$imageCubeArray);
    public static final long OFFSET$independentBlend = LAYOUT.byteOffset(PATH$independentBlend);
    public static final long OFFSET$geometryShader = LAYOUT.byteOffset(PATH$geometryShader);
    public static final long OFFSET$tessellationShader = LAYOUT.byteOffset(PATH$tessellationShader);
    public static final long OFFSET$sampleRateShading = LAYOUT.byteOffset(PATH$sampleRateShading);
    public static final long OFFSET$dualSrcBlend = LAYOUT.byteOffset(PATH$dualSrcBlend);
    public static final long OFFSET$logicOp = LAYOUT.byteOffset(PATH$logicOp);
    public static final long OFFSET$multiDrawIndirect = LAYOUT.byteOffset(PATH$multiDrawIndirect);
    public static final long OFFSET$drawIndirectFirstInstance = LAYOUT.byteOffset(PATH$drawIndirectFirstInstance);
    public static final long OFFSET$depthClamp = LAYOUT.byteOffset(PATH$depthClamp);
    public static final long OFFSET$depthBiasClamp = LAYOUT.byteOffset(PATH$depthBiasClamp);
    public static final long OFFSET$fillModeNonSolid = LAYOUT.byteOffset(PATH$fillModeNonSolid);
    public static final long OFFSET$depthBounds = LAYOUT.byteOffset(PATH$depthBounds);
    public static final long OFFSET$wideLines = LAYOUT.byteOffset(PATH$wideLines);
    public static final long OFFSET$largePoints = LAYOUT.byteOffset(PATH$largePoints);
    public static final long OFFSET$alphaToOne = LAYOUT.byteOffset(PATH$alphaToOne);
    public static final long OFFSET$multiViewport = LAYOUT.byteOffset(PATH$multiViewport);
    public static final long OFFSET$samplerAnisotropy = LAYOUT.byteOffset(PATH$samplerAnisotropy);
    public static final long OFFSET$textureCompressionETC2 = LAYOUT.byteOffset(PATH$textureCompressionETC2);
    public static final long OFFSET$textureCompressionASTC_LDR = LAYOUT.byteOffset(PATH$textureCompressionASTC_LDR);
    public static final long OFFSET$textureCompressionBC = LAYOUT.byteOffset(PATH$textureCompressionBC);
    public static final long OFFSET$occlusionQueryPrecise = LAYOUT.byteOffset(PATH$occlusionQueryPrecise);
    public static final long OFFSET$pipelineStatisticsQuery = LAYOUT.byteOffset(PATH$pipelineStatisticsQuery);
    public static final long OFFSET$vertexPipelineStoresAndAtomics = LAYOUT.byteOffset(PATH$vertexPipelineStoresAndAtomics);
    public static final long OFFSET$fragmentStoresAndAtomics = LAYOUT.byteOffset(PATH$fragmentStoresAndAtomics);
    public static final long OFFSET$shaderTessellationAndGeometryPointSize = LAYOUT.byteOffset(PATH$shaderTessellationAndGeometryPointSize);
    public static final long OFFSET$shaderImageGatherExtended = LAYOUT.byteOffset(PATH$shaderImageGatherExtended);
    public static final long OFFSET$shaderStorageImageExtendedFormats = LAYOUT.byteOffset(PATH$shaderStorageImageExtendedFormats);
    public static final long OFFSET$shaderStorageImageMultisample = LAYOUT.byteOffset(PATH$shaderStorageImageMultisample);
    public static final long OFFSET$shaderStorageImageReadWithoutFormat = LAYOUT.byteOffset(PATH$shaderStorageImageReadWithoutFormat);
    public static final long OFFSET$shaderStorageImageWriteWithoutFormat = LAYOUT.byteOffset(PATH$shaderStorageImageWriteWithoutFormat);
    public static final long OFFSET$shaderUniformBufferArrayDynamicIndexing = LAYOUT.byteOffset(PATH$shaderUniformBufferArrayDynamicIndexing);
    public static final long OFFSET$shaderSampledImageArrayDynamicIndexing = LAYOUT.byteOffset(PATH$shaderSampledImageArrayDynamicIndexing);
    public static final long OFFSET$shaderStorageBufferArrayDynamicIndexing = LAYOUT.byteOffset(PATH$shaderStorageBufferArrayDynamicIndexing);
    public static final long OFFSET$shaderStorageImageArrayDynamicIndexing = LAYOUT.byteOffset(PATH$shaderStorageImageArrayDynamicIndexing);
    public static final long OFFSET$shaderClipDistance = LAYOUT.byteOffset(PATH$shaderClipDistance);
    public static final long OFFSET$shaderCullDistance = LAYOUT.byteOffset(PATH$shaderCullDistance);
    public static final long OFFSET$shaderFloat64 = LAYOUT.byteOffset(PATH$shaderFloat64);
    public static final long OFFSET$shaderInt64 = LAYOUT.byteOffset(PATH$shaderInt64);
    public static final long OFFSET$shaderInt16 = LAYOUT.byteOffset(PATH$shaderInt16);
    public static final long OFFSET$shaderResourceResidency = LAYOUT.byteOffset(PATH$shaderResourceResidency);
    public static final long OFFSET$shaderResourceMinLod = LAYOUT.byteOffset(PATH$shaderResourceMinLod);
    public static final long OFFSET$sparseBinding = LAYOUT.byteOffset(PATH$sparseBinding);
    public static final long OFFSET$sparseResidencyBuffer = LAYOUT.byteOffset(PATH$sparseResidencyBuffer);
    public static final long OFFSET$sparseResidencyImage2D = LAYOUT.byteOffset(PATH$sparseResidencyImage2D);
    public static final long OFFSET$sparseResidencyImage3D = LAYOUT.byteOffset(PATH$sparseResidencyImage3D);
    public static final long OFFSET$sparseResidency2Samples = LAYOUT.byteOffset(PATH$sparseResidency2Samples);
    public static final long OFFSET$sparseResidency4Samples = LAYOUT.byteOffset(PATH$sparseResidency4Samples);
    public static final long OFFSET$sparseResidency8Samples = LAYOUT.byteOffset(PATH$sparseResidency8Samples);
    public static final long OFFSET$sparseResidency16Samples = LAYOUT.byteOffset(PATH$sparseResidency16Samples);
    public static final long OFFSET$sparseResidencyAliased = LAYOUT.byteOffset(PATH$sparseResidencyAliased);
    public static final long OFFSET$variableMultisampleRate = LAYOUT.byteOffset(PATH$variableMultisampleRate);
    public static final long OFFSET$inheritedQueries = LAYOUT.byteOffset(PATH$inheritedQueries);

    public static final long SIZE$robustBufferAccess = LAYOUT$robustBufferAccess.byteSize();
    public static final long SIZE$fullDrawIndexUint32 = LAYOUT$fullDrawIndexUint32.byteSize();
    public static final long SIZE$imageCubeArray = LAYOUT$imageCubeArray.byteSize();
    public static final long SIZE$independentBlend = LAYOUT$independentBlend.byteSize();
    public static final long SIZE$geometryShader = LAYOUT$geometryShader.byteSize();
    public static final long SIZE$tessellationShader = LAYOUT$tessellationShader.byteSize();
    public static final long SIZE$sampleRateShading = LAYOUT$sampleRateShading.byteSize();
    public static final long SIZE$dualSrcBlend = LAYOUT$dualSrcBlend.byteSize();
    public static final long SIZE$logicOp = LAYOUT$logicOp.byteSize();
    public static final long SIZE$multiDrawIndirect = LAYOUT$multiDrawIndirect.byteSize();
    public static final long SIZE$drawIndirectFirstInstance = LAYOUT$drawIndirectFirstInstance.byteSize();
    public static final long SIZE$depthClamp = LAYOUT$depthClamp.byteSize();
    public static final long SIZE$depthBiasClamp = LAYOUT$depthBiasClamp.byteSize();
    public static final long SIZE$fillModeNonSolid = LAYOUT$fillModeNonSolid.byteSize();
    public static final long SIZE$depthBounds = LAYOUT$depthBounds.byteSize();
    public static final long SIZE$wideLines = LAYOUT$wideLines.byteSize();
    public static final long SIZE$largePoints = LAYOUT$largePoints.byteSize();
    public static final long SIZE$alphaToOne = LAYOUT$alphaToOne.byteSize();
    public static final long SIZE$multiViewport = LAYOUT$multiViewport.byteSize();
    public static final long SIZE$samplerAnisotropy = LAYOUT$samplerAnisotropy.byteSize();
    public static final long SIZE$textureCompressionETC2 = LAYOUT$textureCompressionETC2.byteSize();
    public static final long SIZE$textureCompressionASTC_LDR = LAYOUT$textureCompressionASTC_LDR.byteSize();
    public static final long SIZE$textureCompressionBC = LAYOUT$textureCompressionBC.byteSize();
    public static final long SIZE$occlusionQueryPrecise = LAYOUT$occlusionQueryPrecise.byteSize();
    public static final long SIZE$pipelineStatisticsQuery = LAYOUT$pipelineStatisticsQuery.byteSize();
    public static final long SIZE$vertexPipelineStoresAndAtomics = LAYOUT$vertexPipelineStoresAndAtomics.byteSize();
    public static final long SIZE$fragmentStoresAndAtomics = LAYOUT$fragmentStoresAndAtomics.byteSize();
    public static final long SIZE$shaderTessellationAndGeometryPointSize = LAYOUT$shaderTessellationAndGeometryPointSize.byteSize();
    public static final long SIZE$shaderImageGatherExtended = LAYOUT$shaderImageGatherExtended.byteSize();
    public static final long SIZE$shaderStorageImageExtendedFormats = LAYOUT$shaderStorageImageExtendedFormats.byteSize();
    public static final long SIZE$shaderStorageImageMultisample = LAYOUT$shaderStorageImageMultisample.byteSize();
    public static final long SIZE$shaderStorageImageReadWithoutFormat = LAYOUT$shaderStorageImageReadWithoutFormat.byteSize();
    public static final long SIZE$shaderStorageImageWriteWithoutFormat = LAYOUT$shaderStorageImageWriteWithoutFormat.byteSize();
    public static final long SIZE$shaderUniformBufferArrayDynamicIndexing = LAYOUT$shaderUniformBufferArrayDynamicIndexing.byteSize();
    public static final long SIZE$shaderSampledImageArrayDynamicIndexing = LAYOUT$shaderSampledImageArrayDynamicIndexing.byteSize();
    public static final long SIZE$shaderStorageBufferArrayDynamicIndexing = LAYOUT$shaderStorageBufferArrayDynamicIndexing.byteSize();
    public static final long SIZE$shaderStorageImageArrayDynamicIndexing = LAYOUT$shaderStorageImageArrayDynamicIndexing.byteSize();
    public static final long SIZE$shaderClipDistance = LAYOUT$shaderClipDistance.byteSize();
    public static final long SIZE$shaderCullDistance = LAYOUT$shaderCullDistance.byteSize();
    public static final long SIZE$shaderFloat64 = LAYOUT$shaderFloat64.byteSize();
    public static final long SIZE$shaderInt64 = LAYOUT$shaderInt64.byteSize();
    public static final long SIZE$shaderInt16 = LAYOUT$shaderInt16.byteSize();
    public static final long SIZE$shaderResourceResidency = LAYOUT$shaderResourceResidency.byteSize();
    public static final long SIZE$shaderResourceMinLod = LAYOUT$shaderResourceMinLod.byteSize();
    public static final long SIZE$sparseBinding = LAYOUT$sparseBinding.byteSize();
    public static final long SIZE$sparseResidencyBuffer = LAYOUT$sparseResidencyBuffer.byteSize();
    public static final long SIZE$sparseResidencyImage2D = LAYOUT$sparseResidencyImage2D.byteSize();
    public static final long SIZE$sparseResidencyImage3D = LAYOUT$sparseResidencyImage3D.byteSize();
    public static final long SIZE$sparseResidency2Samples = LAYOUT$sparseResidency2Samples.byteSize();
    public static final long SIZE$sparseResidency4Samples = LAYOUT$sparseResidency4Samples.byteSize();
    public static final long SIZE$sparseResidency8Samples = LAYOUT$sparseResidency8Samples.byteSize();
    public static final long SIZE$sparseResidency16Samples = LAYOUT$sparseResidency16Samples.byteSize();
    public static final long SIZE$sparseResidencyAliased = LAYOUT$sparseResidencyAliased.byteSize();
    public static final long SIZE$variableMultisampleRate = LAYOUT$variableMultisampleRate.byteSize();
    public static final long SIZE$inheritedQueries = LAYOUT$inheritedQueries.byteSize();

    public VkPhysicalDeviceFeatures(MemorySegment segment) {
        this.segment = segment;
    }

    public @unsigned int robustBufferAccess() {
        return segment.get(LAYOUT$robustBufferAccess, OFFSET$robustBufferAccess);
    }

    public void robustBufferAccess(@unsigned int value) {
        segment.set(LAYOUT$robustBufferAccess, OFFSET$robustBufferAccess, value);
    }

    public @unsigned int fullDrawIndexUint32() {
        return segment.get(LAYOUT$fullDrawIndexUint32, OFFSET$fullDrawIndexUint32);
    }

    public void fullDrawIndexUint32(@unsigned int value) {
        segment.set(LAYOUT$fullDrawIndexUint32, OFFSET$fullDrawIndexUint32, value);
    }

    public @unsigned int imageCubeArray() {
        return segment.get(LAYOUT$imageCubeArray, OFFSET$imageCubeArray);
    }

    public void imageCubeArray(@unsigned int value) {
        segment.set(LAYOUT$imageCubeArray, OFFSET$imageCubeArray, value);
    }

    public @unsigned int independentBlend() {
        return segment.get(LAYOUT$independentBlend, OFFSET$independentBlend);
    }

    public void independentBlend(@unsigned int value) {
        segment.set(LAYOUT$independentBlend, OFFSET$independentBlend, value);
    }

    public @unsigned int geometryShader() {
        return segment.get(LAYOUT$geometryShader, OFFSET$geometryShader);
    }

    public void geometryShader(@unsigned int value) {
        segment.set(LAYOUT$geometryShader, OFFSET$geometryShader, value);
    }

    public @unsigned int tessellationShader() {
        return segment.get(LAYOUT$tessellationShader, OFFSET$tessellationShader);
    }

    public void tessellationShader(@unsigned int value) {
        segment.set(LAYOUT$tessellationShader, OFFSET$tessellationShader, value);
    }

    public @unsigned int sampleRateShading() {
        return segment.get(LAYOUT$sampleRateShading, OFFSET$sampleRateShading);
    }

    public void sampleRateShading(@unsigned int value) {
        segment.set(LAYOUT$sampleRateShading, OFFSET$sampleRateShading, value);
    }

    public @unsigned int dualSrcBlend() {
        return segment.get(LAYOUT$dualSrcBlend, OFFSET$dualSrcBlend);
    }

    public void dualSrcBlend(@unsigned int value) {
        segment.set(LAYOUT$dualSrcBlend, OFFSET$dualSrcBlend, value);
    }

    public @unsigned int logicOp() {
        return segment.get(LAYOUT$logicOp, OFFSET$logicOp);
    }

    public void logicOp(@unsigned int value) {
        segment.set(LAYOUT$logicOp, OFFSET$logicOp, value);
    }

    public @unsigned int multiDrawIndirect() {
        return segment.get(LAYOUT$multiDrawIndirect, OFFSET$multiDrawIndirect);
    }

    public void multiDrawIndirect(@unsigned int value) {
        segment.set(LAYOUT$multiDrawIndirect, OFFSET$multiDrawIndirect, value);
    }

    public @unsigned int drawIndirectFirstInstance() {
        return segment.get(LAYOUT$drawIndirectFirstInstance, OFFSET$drawIndirectFirstInstance);
    }

    public void drawIndirectFirstInstance(@unsigned int value) {
        segment.set(LAYOUT$drawIndirectFirstInstance, OFFSET$drawIndirectFirstInstance, value);
    }

    public @unsigned int depthClamp() {
        return segment.get(LAYOUT$depthClamp, OFFSET$depthClamp);
    }

    public void depthClamp(@unsigned int value) {
        segment.set(LAYOUT$depthClamp, OFFSET$depthClamp, value);
    }

    public @unsigned int depthBiasClamp() {
        return segment.get(LAYOUT$depthBiasClamp, OFFSET$depthBiasClamp);
    }

    public void depthBiasClamp(@unsigned int value) {
        segment.set(LAYOUT$depthBiasClamp, OFFSET$depthBiasClamp, value);
    }

    public @unsigned int fillModeNonSolid() {
        return segment.get(LAYOUT$fillModeNonSolid, OFFSET$fillModeNonSolid);
    }

    public void fillModeNonSolid(@unsigned int value) {
        segment.set(LAYOUT$fillModeNonSolid, OFFSET$fillModeNonSolid, value);
    }

    public @unsigned int depthBounds() {
        return segment.get(LAYOUT$depthBounds, OFFSET$depthBounds);
    }

    public void depthBounds(@unsigned int value) {
        segment.set(LAYOUT$depthBounds, OFFSET$depthBounds, value);
    }

    public @unsigned int wideLines() {
        return segment.get(LAYOUT$wideLines, OFFSET$wideLines);
    }

    public void wideLines(@unsigned int value) {
        segment.set(LAYOUT$wideLines, OFFSET$wideLines, value);
    }

    public @unsigned int largePoints() {
        return segment.get(LAYOUT$largePoints, OFFSET$largePoints);
    }

    public void largePoints(@unsigned int value) {
        segment.set(LAYOUT$largePoints, OFFSET$largePoints, value);
    }

    public @unsigned int alphaToOne() {
        return segment.get(LAYOUT$alphaToOne, OFFSET$alphaToOne);
    }

    public void alphaToOne(@unsigned int value) {
        segment.set(LAYOUT$alphaToOne, OFFSET$alphaToOne, value);
    }

    public @unsigned int multiViewport() {
        return segment.get(LAYOUT$multiViewport, OFFSET$multiViewport);
    }

    public void multiViewport(@unsigned int value) {
        segment.set(LAYOUT$multiViewport, OFFSET$multiViewport, value);
    }

    public @unsigned int samplerAnisotropy() {
        return segment.get(LAYOUT$samplerAnisotropy, OFFSET$samplerAnisotropy);
    }

    public void samplerAnisotropy(@unsigned int value) {
        segment.set(LAYOUT$samplerAnisotropy, OFFSET$samplerAnisotropy, value);
    }

    public @unsigned int textureCompressionETC2() {
        return segment.get(LAYOUT$textureCompressionETC2, OFFSET$textureCompressionETC2);
    }

    public void textureCompressionETC2(@unsigned int value) {
        segment.set(LAYOUT$textureCompressionETC2, OFFSET$textureCompressionETC2, value);
    }

    public @unsigned int textureCompressionASTC_LDR() {
        return segment.get(LAYOUT$textureCompressionASTC_LDR, OFFSET$textureCompressionASTC_LDR);
    }

    public void textureCompressionASTC_LDR(@unsigned int value) {
        segment.set(LAYOUT$textureCompressionASTC_LDR, OFFSET$textureCompressionASTC_LDR, value);
    }

    public @unsigned int textureCompressionBC() {
        return segment.get(LAYOUT$textureCompressionBC, OFFSET$textureCompressionBC);
    }

    public void textureCompressionBC(@unsigned int value) {
        segment.set(LAYOUT$textureCompressionBC, OFFSET$textureCompressionBC, value);
    }

    public @unsigned int occlusionQueryPrecise() {
        return segment.get(LAYOUT$occlusionQueryPrecise, OFFSET$occlusionQueryPrecise);
    }

    public void occlusionQueryPrecise(@unsigned int value) {
        segment.set(LAYOUT$occlusionQueryPrecise, OFFSET$occlusionQueryPrecise, value);
    }

    public @unsigned int pipelineStatisticsQuery() {
        return segment.get(LAYOUT$pipelineStatisticsQuery, OFFSET$pipelineStatisticsQuery);
    }

    public void pipelineStatisticsQuery(@unsigned int value) {
        segment.set(LAYOUT$pipelineStatisticsQuery, OFFSET$pipelineStatisticsQuery, value);
    }

    public @unsigned int vertexPipelineStoresAndAtomics() {
        return segment.get(LAYOUT$vertexPipelineStoresAndAtomics, OFFSET$vertexPipelineStoresAndAtomics);
    }

    public void vertexPipelineStoresAndAtomics(@unsigned int value) {
        segment.set(LAYOUT$vertexPipelineStoresAndAtomics, OFFSET$vertexPipelineStoresAndAtomics, value);
    }

    public @unsigned int fragmentStoresAndAtomics() {
        return segment.get(LAYOUT$fragmentStoresAndAtomics, OFFSET$fragmentStoresAndAtomics);
    }

    public void fragmentStoresAndAtomics(@unsigned int value) {
        segment.set(LAYOUT$fragmentStoresAndAtomics, OFFSET$fragmentStoresAndAtomics, value);
    }

    public @unsigned int shaderTessellationAndGeometryPointSize() {
        return segment.get(LAYOUT$shaderTessellationAndGeometryPointSize, OFFSET$shaderTessellationAndGeometryPointSize);
    }

    public void shaderTessellationAndGeometryPointSize(@unsigned int value) {
        segment.set(LAYOUT$shaderTessellationAndGeometryPointSize, OFFSET$shaderTessellationAndGeometryPointSize, value);
    }

    public @unsigned int shaderImageGatherExtended() {
        return segment.get(LAYOUT$shaderImageGatherExtended, OFFSET$shaderImageGatherExtended);
    }

    public void shaderImageGatherExtended(@unsigned int value) {
        segment.set(LAYOUT$shaderImageGatherExtended, OFFSET$shaderImageGatherExtended, value);
    }

    public @unsigned int shaderStorageImageExtendedFormats() {
        return segment.get(LAYOUT$shaderStorageImageExtendedFormats, OFFSET$shaderStorageImageExtendedFormats);
    }

    public void shaderStorageImageExtendedFormats(@unsigned int value) {
        segment.set(LAYOUT$shaderStorageImageExtendedFormats, OFFSET$shaderStorageImageExtendedFormats, value);
    }

    public @unsigned int shaderStorageImageMultisample() {
        return segment.get(LAYOUT$shaderStorageImageMultisample, OFFSET$shaderStorageImageMultisample);
    }

    public void shaderStorageImageMultisample(@unsigned int value) {
        segment.set(LAYOUT$shaderStorageImageMultisample, OFFSET$shaderStorageImageMultisample, value);
    }

    public @unsigned int shaderStorageImageReadWithoutFormat() {
        return segment.get(LAYOUT$shaderStorageImageReadWithoutFormat, OFFSET$shaderStorageImageReadWithoutFormat);
    }

    public void shaderStorageImageReadWithoutFormat(@unsigned int value) {
        segment.set(LAYOUT$shaderStorageImageReadWithoutFormat, OFFSET$shaderStorageImageReadWithoutFormat, value);
    }

    public @unsigned int shaderStorageImageWriteWithoutFormat() {
        return segment.get(LAYOUT$shaderStorageImageWriteWithoutFormat, OFFSET$shaderStorageImageWriteWithoutFormat);
    }

    public void shaderStorageImageWriteWithoutFormat(@unsigned int value) {
        segment.set(LAYOUT$shaderStorageImageWriteWithoutFormat, OFFSET$shaderStorageImageWriteWithoutFormat, value);
    }

    public @unsigned int shaderUniformBufferArrayDynamicIndexing() {
        return segment.get(LAYOUT$shaderUniformBufferArrayDynamicIndexing, OFFSET$shaderUniformBufferArrayDynamicIndexing);
    }

    public void shaderUniformBufferArrayDynamicIndexing(@unsigned int value) {
        segment.set(LAYOUT$shaderUniformBufferArrayDynamicIndexing, OFFSET$shaderUniformBufferArrayDynamicIndexing, value);
    }

    public @unsigned int shaderSampledImageArrayDynamicIndexing() {
        return segment.get(LAYOUT$shaderSampledImageArrayDynamicIndexing, OFFSET$shaderSampledImageArrayDynamicIndexing);
    }

    public void shaderSampledImageArrayDynamicIndexing(@unsigned int value) {
        segment.set(LAYOUT$shaderSampledImageArrayDynamicIndexing, OFFSET$shaderSampledImageArrayDynamicIndexing, value);
    }

    public @unsigned int shaderStorageBufferArrayDynamicIndexing() {
        return segment.get(LAYOUT$shaderStorageBufferArrayDynamicIndexing, OFFSET$shaderStorageBufferArrayDynamicIndexing);
    }

    public void shaderStorageBufferArrayDynamicIndexing(@unsigned int value) {
        segment.set(LAYOUT$shaderStorageBufferArrayDynamicIndexing, OFFSET$shaderStorageBufferArrayDynamicIndexing, value);
    }

    public @unsigned int shaderStorageImageArrayDynamicIndexing() {
        return segment.get(LAYOUT$shaderStorageImageArrayDynamicIndexing, OFFSET$shaderStorageImageArrayDynamicIndexing);
    }

    public void shaderStorageImageArrayDynamicIndexing(@unsigned int value) {
        segment.set(LAYOUT$shaderStorageImageArrayDynamicIndexing, OFFSET$shaderStorageImageArrayDynamicIndexing, value);
    }

    public @unsigned int shaderClipDistance() {
        return segment.get(LAYOUT$shaderClipDistance, OFFSET$shaderClipDistance);
    }

    public void shaderClipDistance(@unsigned int value) {
        segment.set(LAYOUT$shaderClipDistance, OFFSET$shaderClipDistance, value);
    }

    public @unsigned int shaderCullDistance() {
        return segment.get(LAYOUT$shaderCullDistance, OFFSET$shaderCullDistance);
    }

    public void shaderCullDistance(@unsigned int value) {
        segment.set(LAYOUT$shaderCullDistance, OFFSET$shaderCullDistance, value);
    }

    public @unsigned int shaderFloat64() {
        return segment.get(LAYOUT$shaderFloat64, OFFSET$shaderFloat64);
    }

    public void shaderFloat64(@unsigned int value) {
        segment.set(LAYOUT$shaderFloat64, OFFSET$shaderFloat64, value);
    }

    public @unsigned int shaderInt64() {
        return segment.get(LAYOUT$shaderInt64, OFFSET$shaderInt64);
    }

    public void shaderInt64(@unsigned int value) {
        segment.set(LAYOUT$shaderInt64, OFFSET$shaderInt64, value);
    }

    public @unsigned int shaderInt16() {
        return segment.get(LAYOUT$shaderInt16, OFFSET$shaderInt16);
    }

    public void shaderInt16(@unsigned int value) {
        segment.set(LAYOUT$shaderInt16, OFFSET$shaderInt16, value);
    }

    public @unsigned int shaderResourceResidency() {
        return segment.get(LAYOUT$shaderResourceResidency, OFFSET$shaderResourceResidency);
    }

    public void shaderResourceResidency(@unsigned int value) {
        segment.set(LAYOUT$shaderResourceResidency, OFFSET$shaderResourceResidency, value);
    }

    public @unsigned int shaderResourceMinLod() {
        return segment.get(LAYOUT$shaderResourceMinLod, OFFSET$shaderResourceMinLod);
    }

    public void shaderResourceMinLod(@unsigned int value) {
        segment.set(LAYOUT$shaderResourceMinLod, OFFSET$shaderResourceMinLod, value);
    }

    public @unsigned int sparseBinding() {
        return segment.get(LAYOUT$sparseBinding, OFFSET$sparseBinding);
    }

    public void sparseBinding(@unsigned int value) {
        segment.set(LAYOUT$sparseBinding, OFFSET$sparseBinding, value);
    }

    public @unsigned int sparseResidencyBuffer() {
        return segment.get(LAYOUT$sparseResidencyBuffer, OFFSET$sparseResidencyBuffer);
    }

    public void sparseResidencyBuffer(@unsigned int value) {
        segment.set(LAYOUT$sparseResidencyBuffer, OFFSET$sparseResidencyBuffer, value);
    }

    public @unsigned int sparseResidencyImage2D() {
        return segment.get(LAYOUT$sparseResidencyImage2D, OFFSET$sparseResidencyImage2D);
    }

    public void sparseResidencyImage2D(@unsigned int value) {
        segment.set(LAYOUT$sparseResidencyImage2D, OFFSET$sparseResidencyImage2D, value);
    }

    public @unsigned int sparseResidencyImage3D() {
        return segment.get(LAYOUT$sparseResidencyImage3D, OFFSET$sparseResidencyImage3D);
    }

    public void sparseResidencyImage3D(@unsigned int value) {
        segment.set(LAYOUT$sparseResidencyImage3D, OFFSET$sparseResidencyImage3D, value);
    }

    public @unsigned int sparseResidency2Samples() {
        return segment.get(LAYOUT$sparseResidency2Samples, OFFSET$sparseResidency2Samples);
    }

    public void sparseResidency2Samples(@unsigned int value) {
        segment.set(LAYOUT$sparseResidency2Samples, OFFSET$sparseResidency2Samples, value);
    }

    public @unsigned int sparseResidency4Samples() {
        return segment.get(LAYOUT$sparseResidency4Samples, OFFSET$sparseResidency4Samples);
    }

    public void sparseResidency4Samples(@unsigned int value) {
        segment.set(LAYOUT$sparseResidency4Samples, OFFSET$sparseResidency4Samples, value);
    }

    public @unsigned int sparseResidency8Samples() {
        return segment.get(LAYOUT$sparseResidency8Samples, OFFSET$sparseResidency8Samples);
    }

    public void sparseResidency8Samples(@unsigned int value) {
        segment.set(LAYOUT$sparseResidency8Samples, OFFSET$sparseResidency8Samples, value);
    }

    public @unsigned int sparseResidency16Samples() {
        return segment.get(LAYOUT$sparseResidency16Samples, OFFSET$sparseResidency16Samples);
    }

    public void sparseResidency16Samples(@unsigned int value) {
        segment.set(LAYOUT$sparseResidency16Samples, OFFSET$sparseResidency16Samples, value);
    }

    public @unsigned int sparseResidencyAliased() {
        return segment.get(LAYOUT$sparseResidencyAliased, OFFSET$sparseResidencyAliased);
    }

    public void sparseResidencyAliased(@unsigned int value) {
        segment.set(LAYOUT$sparseResidencyAliased, OFFSET$sparseResidencyAliased, value);
    }

    public @unsigned int variableMultisampleRate() {
        return segment.get(LAYOUT$variableMultisampleRate, OFFSET$variableMultisampleRate);
    }

    public void variableMultisampleRate(@unsigned int value) {
        segment.set(LAYOUT$variableMultisampleRate, OFFSET$variableMultisampleRate, value);
    }

    public @unsigned int inheritedQueries() {
        return segment.get(LAYOUT$inheritedQueries, OFFSET$inheritedQueries);
    }

    public void inheritedQueries(@unsigned int value) {
        segment.set(LAYOUT$inheritedQueries, OFFSET$inheritedQueries, value);
    }

    public static VkPhysicalDeviceFeatures allocate(Arena arena) {
        return new VkPhysicalDeviceFeatures(arena.allocate(LAYOUT));
    }
    
    public static VkPhysicalDeviceFeatures[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceFeatures[] ret = new VkPhysicalDeviceFeatures[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkPhysicalDeviceFeatures(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
}
