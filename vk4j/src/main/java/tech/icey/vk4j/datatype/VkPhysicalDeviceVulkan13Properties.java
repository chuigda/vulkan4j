package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.annotations.*;
import tech.icey.vk4j.array.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import tech.icey.vk4j.ptr.*;
import tech.icey.vk4j.NativeLayout;
import tech.icey.vk4j.IFactory;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

public record VkPhysicalDeviceVulkan13Properties(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("minSubgroupSize"),
        ValueLayout.JAVA_INT.withName("maxSubgroupSize"),
        ValueLayout.JAVA_INT.withName("maxComputeWorkgroupSubgroups"),
        ValueLayout.JAVA_INT.withName("requiredSubgroupSizeStages"),
        ValueLayout.JAVA_INT.withName("maxInlineUniformBlockSize"),
        ValueLayout.JAVA_INT.withName("maxPerStageDescriptorInlineUniformBlocks"),
        ValueLayout.JAVA_INT.withName("maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks"),
        ValueLayout.JAVA_INT.withName("maxDescriptorSetInlineUniformBlocks"),
        ValueLayout.JAVA_INT.withName("maxDescriptorSetUpdateAfterBindInlineUniformBlocks"),
        ValueLayout.JAVA_INT.withName("maxInlineUniformTotalSize"),
        ValueLayout.JAVA_INT.withName("integerDotProduct8BitUnsignedAccelerated"),
        ValueLayout.JAVA_INT.withName("integerDotProduct8BitSignedAccelerated"),
        ValueLayout.JAVA_INT.withName("integerDotProduct8BitMixedSignednessAccelerated"),
        ValueLayout.JAVA_INT.withName("integerDotProduct4x8BitPackedUnsignedAccelerated"),
        ValueLayout.JAVA_INT.withName("integerDotProduct4x8BitPackedSignedAccelerated"),
        ValueLayout.JAVA_INT.withName("integerDotProduct4x8BitPackedMixedSignednessAccelerated"),
        ValueLayout.JAVA_INT.withName("integerDotProduct16BitUnsignedAccelerated"),
        ValueLayout.JAVA_INT.withName("integerDotProduct16BitSignedAccelerated"),
        ValueLayout.JAVA_INT.withName("integerDotProduct16BitMixedSignednessAccelerated"),
        ValueLayout.JAVA_INT.withName("integerDotProduct32BitUnsignedAccelerated"),
        ValueLayout.JAVA_INT.withName("integerDotProduct32BitSignedAccelerated"),
        ValueLayout.JAVA_INT.withName("integerDotProduct32BitMixedSignednessAccelerated"),
        ValueLayout.JAVA_INT.withName("integerDotProduct64BitUnsignedAccelerated"),
        ValueLayout.JAVA_INT.withName("integerDotProduct64BitSignedAccelerated"),
        ValueLayout.JAVA_INT.withName("integerDotProduct64BitMixedSignednessAccelerated"),
        ValueLayout.JAVA_INT.withName("integerDotProductAccumulatingSaturating8BitUnsignedAccelerated"),
        ValueLayout.JAVA_INT.withName("integerDotProductAccumulatingSaturating8BitSignedAccelerated"),
        ValueLayout.JAVA_INT.withName("integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated"),
        ValueLayout.JAVA_INT.withName("integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated"),
        ValueLayout.JAVA_INT.withName("integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated"),
        ValueLayout.JAVA_INT.withName("integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated"),
        ValueLayout.JAVA_INT.withName("integerDotProductAccumulatingSaturating16BitUnsignedAccelerated"),
        ValueLayout.JAVA_INT.withName("integerDotProductAccumulatingSaturating16BitSignedAccelerated"),
        ValueLayout.JAVA_INT.withName("integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated"),
        ValueLayout.JAVA_INT.withName("integerDotProductAccumulatingSaturating32BitUnsignedAccelerated"),
        ValueLayout.JAVA_INT.withName("integerDotProductAccumulatingSaturating32BitSignedAccelerated"),
        ValueLayout.JAVA_INT.withName("integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated"),
        ValueLayout.JAVA_INT.withName("integerDotProductAccumulatingSaturating64BitUnsignedAccelerated"),
        ValueLayout.JAVA_INT.withName("integerDotProductAccumulatingSaturating64BitSignedAccelerated"),
        ValueLayout.JAVA_INT.withName("integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated"),
        ValueLayout.JAVA_LONG.withName("storageTexelBufferOffsetAlignmentBytes"),
        ValueLayout.JAVA_INT.withName("storageTexelBufferOffsetSingleTexelAlignment"),
        ValueLayout.JAVA_LONG.withName("uniformTexelBufferOffsetAlignmentBytes"),
        ValueLayout.JAVA_INT.withName("uniformTexelBufferOffsetSingleTexelAlignment"),
        ValueLayout.JAVA_LONG.withName("maxBufferSize")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$minSubgroupSize = PathElement.groupElement("minSubgroupSize");
    public static final PathElement PATH$maxSubgroupSize = PathElement.groupElement("maxSubgroupSize");
    public static final PathElement PATH$maxComputeWorkgroupSubgroups = PathElement.groupElement("maxComputeWorkgroupSubgroups");
    public static final PathElement PATH$requiredSubgroupSizeStages = PathElement.groupElement("requiredSubgroupSizeStages");
    public static final PathElement PATH$maxInlineUniformBlockSize = PathElement.groupElement("maxInlineUniformBlockSize");
    public static final PathElement PATH$maxPerStageDescriptorInlineUniformBlocks = PathElement.groupElement("maxPerStageDescriptorInlineUniformBlocks");
    public static final PathElement PATH$maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks = PathElement.groupElement("maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks");
    public static final PathElement PATH$maxDescriptorSetInlineUniformBlocks = PathElement.groupElement("maxDescriptorSetInlineUniformBlocks");
    public static final PathElement PATH$maxDescriptorSetUpdateAfterBindInlineUniformBlocks = PathElement.groupElement("maxDescriptorSetUpdateAfterBindInlineUniformBlocks");
    public static final PathElement PATH$maxInlineUniformTotalSize = PathElement.groupElement("maxInlineUniformTotalSize");
    public static final PathElement PATH$integerDotProduct8BitUnsignedAccelerated = PathElement.groupElement("integerDotProduct8BitUnsignedAccelerated");
    public static final PathElement PATH$integerDotProduct8BitSignedAccelerated = PathElement.groupElement("integerDotProduct8BitSignedAccelerated");
    public static final PathElement PATH$integerDotProduct8BitMixedSignednessAccelerated = PathElement.groupElement("integerDotProduct8BitMixedSignednessAccelerated");
    public static final PathElement PATH$integerDotProduct4x8BitPackedUnsignedAccelerated = PathElement.groupElement("integerDotProduct4x8BitPackedUnsignedAccelerated");
    public static final PathElement PATH$integerDotProduct4x8BitPackedSignedAccelerated = PathElement.groupElement("integerDotProduct4x8BitPackedSignedAccelerated");
    public static final PathElement PATH$integerDotProduct4x8BitPackedMixedSignednessAccelerated = PathElement.groupElement("integerDotProduct4x8BitPackedMixedSignednessAccelerated");
    public static final PathElement PATH$integerDotProduct16BitUnsignedAccelerated = PathElement.groupElement("integerDotProduct16BitUnsignedAccelerated");
    public static final PathElement PATH$integerDotProduct16BitSignedAccelerated = PathElement.groupElement("integerDotProduct16BitSignedAccelerated");
    public static final PathElement PATH$integerDotProduct16BitMixedSignednessAccelerated = PathElement.groupElement("integerDotProduct16BitMixedSignednessAccelerated");
    public static final PathElement PATH$integerDotProduct32BitUnsignedAccelerated = PathElement.groupElement("integerDotProduct32BitUnsignedAccelerated");
    public static final PathElement PATH$integerDotProduct32BitSignedAccelerated = PathElement.groupElement("integerDotProduct32BitSignedAccelerated");
    public static final PathElement PATH$integerDotProduct32BitMixedSignednessAccelerated = PathElement.groupElement("integerDotProduct32BitMixedSignednessAccelerated");
    public static final PathElement PATH$integerDotProduct64BitUnsignedAccelerated = PathElement.groupElement("integerDotProduct64BitUnsignedAccelerated");
    public static final PathElement PATH$integerDotProduct64BitSignedAccelerated = PathElement.groupElement("integerDotProduct64BitSignedAccelerated");
    public static final PathElement PATH$integerDotProduct64BitMixedSignednessAccelerated = PathElement.groupElement("integerDotProduct64BitMixedSignednessAccelerated");
    public static final PathElement PATH$integerDotProductAccumulatingSaturating8BitUnsignedAccelerated = PathElement.groupElement("integerDotProductAccumulatingSaturating8BitUnsignedAccelerated");
    public static final PathElement PATH$integerDotProductAccumulatingSaturating8BitSignedAccelerated = PathElement.groupElement("integerDotProductAccumulatingSaturating8BitSignedAccelerated");
    public static final PathElement PATH$integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated = PathElement.groupElement("integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated");
    public static final PathElement PATH$integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated = PathElement.groupElement("integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated");
    public static final PathElement PATH$integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated = PathElement.groupElement("integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated");
    public static final PathElement PATH$integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated = PathElement.groupElement("integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated");
    public static final PathElement PATH$integerDotProductAccumulatingSaturating16BitUnsignedAccelerated = PathElement.groupElement("integerDotProductAccumulatingSaturating16BitUnsignedAccelerated");
    public static final PathElement PATH$integerDotProductAccumulatingSaturating16BitSignedAccelerated = PathElement.groupElement("integerDotProductAccumulatingSaturating16BitSignedAccelerated");
    public static final PathElement PATH$integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated = PathElement.groupElement("integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated");
    public static final PathElement PATH$integerDotProductAccumulatingSaturating32BitUnsignedAccelerated = PathElement.groupElement("integerDotProductAccumulatingSaturating32BitUnsignedAccelerated");
    public static final PathElement PATH$integerDotProductAccumulatingSaturating32BitSignedAccelerated = PathElement.groupElement("integerDotProductAccumulatingSaturating32BitSignedAccelerated");
    public static final PathElement PATH$integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated = PathElement.groupElement("integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated");
    public static final PathElement PATH$integerDotProductAccumulatingSaturating64BitUnsignedAccelerated = PathElement.groupElement("integerDotProductAccumulatingSaturating64BitUnsignedAccelerated");
    public static final PathElement PATH$integerDotProductAccumulatingSaturating64BitSignedAccelerated = PathElement.groupElement("integerDotProductAccumulatingSaturating64BitSignedAccelerated");
    public static final PathElement PATH$integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated = PathElement.groupElement("integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated");
    public static final PathElement PATH$storageTexelBufferOffsetAlignmentBytes = PathElement.groupElement("storageTexelBufferOffsetAlignmentBytes");
    public static final PathElement PATH$storageTexelBufferOffsetSingleTexelAlignment = PathElement.groupElement("storageTexelBufferOffsetSingleTexelAlignment");
    public static final PathElement PATH$uniformTexelBufferOffsetAlignmentBytes = PathElement.groupElement("uniformTexelBufferOffsetAlignmentBytes");
    public static final PathElement PATH$uniformTexelBufferOffsetSingleTexelAlignment = PathElement.groupElement("uniformTexelBufferOffsetSingleTexelAlignment");
    public static final PathElement PATH$maxBufferSize = PathElement.groupElement("maxBufferSize");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$minSubgroupSize = (OfInt) LAYOUT.select(PATH$minSubgroupSize);
    public static final OfInt LAYOUT$maxSubgroupSize = (OfInt) LAYOUT.select(PATH$maxSubgroupSize);
    public static final OfInt LAYOUT$maxComputeWorkgroupSubgroups = (OfInt) LAYOUT.select(PATH$maxComputeWorkgroupSubgroups);
    public static final OfInt LAYOUT$requiredSubgroupSizeStages = (OfInt) LAYOUT.select(PATH$requiredSubgroupSizeStages);
    public static final OfInt LAYOUT$maxInlineUniformBlockSize = (OfInt) LAYOUT.select(PATH$maxInlineUniformBlockSize);
    public static final OfInt LAYOUT$maxPerStageDescriptorInlineUniformBlocks = (OfInt) LAYOUT.select(PATH$maxPerStageDescriptorInlineUniformBlocks);
    public static final OfInt LAYOUT$maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks = (OfInt) LAYOUT.select(PATH$maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks);
    public static final OfInt LAYOUT$maxDescriptorSetInlineUniformBlocks = (OfInt) LAYOUT.select(PATH$maxDescriptorSetInlineUniformBlocks);
    public static final OfInt LAYOUT$maxDescriptorSetUpdateAfterBindInlineUniformBlocks = (OfInt) LAYOUT.select(PATH$maxDescriptorSetUpdateAfterBindInlineUniformBlocks);
    public static final OfInt LAYOUT$maxInlineUniformTotalSize = (OfInt) LAYOUT.select(PATH$maxInlineUniformTotalSize);
    public static final OfInt LAYOUT$integerDotProduct8BitUnsignedAccelerated = (OfInt) LAYOUT.select(PATH$integerDotProduct8BitUnsignedAccelerated);
    public static final OfInt LAYOUT$integerDotProduct8BitSignedAccelerated = (OfInt) LAYOUT.select(PATH$integerDotProduct8BitSignedAccelerated);
    public static final OfInt LAYOUT$integerDotProduct8BitMixedSignednessAccelerated = (OfInt) LAYOUT.select(PATH$integerDotProduct8BitMixedSignednessAccelerated);
    public static final OfInt LAYOUT$integerDotProduct4x8BitPackedUnsignedAccelerated = (OfInt) LAYOUT.select(PATH$integerDotProduct4x8BitPackedUnsignedAccelerated);
    public static final OfInt LAYOUT$integerDotProduct4x8BitPackedSignedAccelerated = (OfInt) LAYOUT.select(PATH$integerDotProduct4x8BitPackedSignedAccelerated);
    public static final OfInt LAYOUT$integerDotProduct4x8BitPackedMixedSignednessAccelerated = (OfInt) LAYOUT.select(PATH$integerDotProduct4x8BitPackedMixedSignednessAccelerated);
    public static final OfInt LAYOUT$integerDotProduct16BitUnsignedAccelerated = (OfInt) LAYOUT.select(PATH$integerDotProduct16BitUnsignedAccelerated);
    public static final OfInt LAYOUT$integerDotProduct16BitSignedAccelerated = (OfInt) LAYOUT.select(PATH$integerDotProduct16BitSignedAccelerated);
    public static final OfInt LAYOUT$integerDotProduct16BitMixedSignednessAccelerated = (OfInt) LAYOUT.select(PATH$integerDotProduct16BitMixedSignednessAccelerated);
    public static final OfInt LAYOUT$integerDotProduct32BitUnsignedAccelerated = (OfInt) LAYOUT.select(PATH$integerDotProduct32BitUnsignedAccelerated);
    public static final OfInt LAYOUT$integerDotProduct32BitSignedAccelerated = (OfInt) LAYOUT.select(PATH$integerDotProduct32BitSignedAccelerated);
    public static final OfInt LAYOUT$integerDotProduct32BitMixedSignednessAccelerated = (OfInt) LAYOUT.select(PATH$integerDotProduct32BitMixedSignednessAccelerated);
    public static final OfInt LAYOUT$integerDotProduct64BitUnsignedAccelerated = (OfInt) LAYOUT.select(PATH$integerDotProduct64BitUnsignedAccelerated);
    public static final OfInt LAYOUT$integerDotProduct64BitSignedAccelerated = (OfInt) LAYOUT.select(PATH$integerDotProduct64BitSignedAccelerated);
    public static final OfInt LAYOUT$integerDotProduct64BitMixedSignednessAccelerated = (OfInt) LAYOUT.select(PATH$integerDotProduct64BitMixedSignednessAccelerated);
    public static final OfInt LAYOUT$integerDotProductAccumulatingSaturating8BitUnsignedAccelerated = (OfInt) LAYOUT.select(PATH$integerDotProductAccumulatingSaturating8BitUnsignedAccelerated);
    public static final OfInt LAYOUT$integerDotProductAccumulatingSaturating8BitSignedAccelerated = (OfInt) LAYOUT.select(PATH$integerDotProductAccumulatingSaturating8BitSignedAccelerated);
    public static final OfInt LAYOUT$integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated = (OfInt) LAYOUT.select(PATH$integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated);
    public static final OfInt LAYOUT$integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated = (OfInt) LAYOUT.select(PATH$integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated);
    public static final OfInt LAYOUT$integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated = (OfInt) LAYOUT.select(PATH$integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated);
    public static final OfInt LAYOUT$integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated = (OfInt) LAYOUT.select(PATH$integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated);
    public static final OfInt LAYOUT$integerDotProductAccumulatingSaturating16BitUnsignedAccelerated = (OfInt) LAYOUT.select(PATH$integerDotProductAccumulatingSaturating16BitUnsignedAccelerated);
    public static final OfInt LAYOUT$integerDotProductAccumulatingSaturating16BitSignedAccelerated = (OfInt) LAYOUT.select(PATH$integerDotProductAccumulatingSaturating16BitSignedAccelerated);
    public static final OfInt LAYOUT$integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated = (OfInt) LAYOUT.select(PATH$integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated);
    public static final OfInt LAYOUT$integerDotProductAccumulatingSaturating32BitUnsignedAccelerated = (OfInt) LAYOUT.select(PATH$integerDotProductAccumulatingSaturating32BitUnsignedAccelerated);
    public static final OfInt LAYOUT$integerDotProductAccumulatingSaturating32BitSignedAccelerated = (OfInt) LAYOUT.select(PATH$integerDotProductAccumulatingSaturating32BitSignedAccelerated);
    public static final OfInt LAYOUT$integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated = (OfInt) LAYOUT.select(PATH$integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated);
    public static final OfInt LAYOUT$integerDotProductAccumulatingSaturating64BitUnsignedAccelerated = (OfInt) LAYOUT.select(PATH$integerDotProductAccumulatingSaturating64BitUnsignedAccelerated);
    public static final OfInt LAYOUT$integerDotProductAccumulatingSaturating64BitSignedAccelerated = (OfInt) LAYOUT.select(PATH$integerDotProductAccumulatingSaturating64BitSignedAccelerated);
    public static final OfInt LAYOUT$integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated = (OfInt) LAYOUT.select(PATH$integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated);
    public static final OfLong LAYOUT$storageTexelBufferOffsetAlignmentBytes = (OfLong) LAYOUT.select(PATH$storageTexelBufferOffsetAlignmentBytes);
    public static final OfInt LAYOUT$storageTexelBufferOffsetSingleTexelAlignment = (OfInt) LAYOUT.select(PATH$storageTexelBufferOffsetSingleTexelAlignment);
    public static final OfLong LAYOUT$uniformTexelBufferOffsetAlignmentBytes = (OfLong) LAYOUT.select(PATH$uniformTexelBufferOffsetAlignmentBytes);
    public static final OfInt LAYOUT$uniformTexelBufferOffsetSingleTexelAlignment = (OfInt) LAYOUT.select(PATH$uniformTexelBufferOffsetSingleTexelAlignment);
    public static final OfLong LAYOUT$maxBufferSize = (OfLong) LAYOUT.select(PATH$maxBufferSize);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$minSubgroupSize = LAYOUT.byteOffset(PATH$minSubgroupSize);
    public static final long OFFSET$maxSubgroupSize = LAYOUT.byteOffset(PATH$maxSubgroupSize);
    public static final long OFFSET$maxComputeWorkgroupSubgroups = LAYOUT.byteOffset(PATH$maxComputeWorkgroupSubgroups);
    public static final long OFFSET$requiredSubgroupSizeStages = LAYOUT.byteOffset(PATH$requiredSubgroupSizeStages);
    public static final long OFFSET$maxInlineUniformBlockSize = LAYOUT.byteOffset(PATH$maxInlineUniformBlockSize);
    public static final long OFFSET$maxPerStageDescriptorInlineUniformBlocks = LAYOUT.byteOffset(PATH$maxPerStageDescriptorInlineUniformBlocks);
    public static final long OFFSET$maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks = LAYOUT.byteOffset(PATH$maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks);
    public static final long OFFSET$maxDescriptorSetInlineUniformBlocks = LAYOUT.byteOffset(PATH$maxDescriptorSetInlineUniformBlocks);
    public static final long OFFSET$maxDescriptorSetUpdateAfterBindInlineUniformBlocks = LAYOUT.byteOffset(PATH$maxDescriptorSetUpdateAfterBindInlineUniformBlocks);
    public static final long OFFSET$maxInlineUniformTotalSize = LAYOUT.byteOffset(PATH$maxInlineUniformTotalSize);
    public static final long OFFSET$integerDotProduct8BitUnsignedAccelerated = LAYOUT.byteOffset(PATH$integerDotProduct8BitUnsignedAccelerated);
    public static final long OFFSET$integerDotProduct8BitSignedAccelerated = LAYOUT.byteOffset(PATH$integerDotProduct8BitSignedAccelerated);
    public static final long OFFSET$integerDotProduct8BitMixedSignednessAccelerated = LAYOUT.byteOffset(PATH$integerDotProduct8BitMixedSignednessAccelerated);
    public static final long OFFSET$integerDotProduct4x8BitPackedUnsignedAccelerated = LAYOUT.byteOffset(PATH$integerDotProduct4x8BitPackedUnsignedAccelerated);
    public static final long OFFSET$integerDotProduct4x8BitPackedSignedAccelerated = LAYOUT.byteOffset(PATH$integerDotProduct4x8BitPackedSignedAccelerated);
    public static final long OFFSET$integerDotProduct4x8BitPackedMixedSignednessAccelerated = LAYOUT.byteOffset(PATH$integerDotProduct4x8BitPackedMixedSignednessAccelerated);
    public static final long OFFSET$integerDotProduct16BitUnsignedAccelerated = LAYOUT.byteOffset(PATH$integerDotProduct16BitUnsignedAccelerated);
    public static final long OFFSET$integerDotProduct16BitSignedAccelerated = LAYOUT.byteOffset(PATH$integerDotProduct16BitSignedAccelerated);
    public static final long OFFSET$integerDotProduct16BitMixedSignednessAccelerated = LAYOUT.byteOffset(PATH$integerDotProduct16BitMixedSignednessAccelerated);
    public static final long OFFSET$integerDotProduct32BitUnsignedAccelerated = LAYOUT.byteOffset(PATH$integerDotProduct32BitUnsignedAccelerated);
    public static final long OFFSET$integerDotProduct32BitSignedAccelerated = LAYOUT.byteOffset(PATH$integerDotProduct32BitSignedAccelerated);
    public static final long OFFSET$integerDotProduct32BitMixedSignednessAccelerated = LAYOUT.byteOffset(PATH$integerDotProduct32BitMixedSignednessAccelerated);
    public static final long OFFSET$integerDotProduct64BitUnsignedAccelerated = LAYOUT.byteOffset(PATH$integerDotProduct64BitUnsignedAccelerated);
    public static final long OFFSET$integerDotProduct64BitSignedAccelerated = LAYOUT.byteOffset(PATH$integerDotProduct64BitSignedAccelerated);
    public static final long OFFSET$integerDotProduct64BitMixedSignednessAccelerated = LAYOUT.byteOffset(PATH$integerDotProduct64BitMixedSignednessAccelerated);
    public static final long OFFSET$integerDotProductAccumulatingSaturating8BitUnsignedAccelerated = LAYOUT.byteOffset(PATH$integerDotProductAccumulatingSaturating8BitUnsignedAccelerated);
    public static final long OFFSET$integerDotProductAccumulatingSaturating8BitSignedAccelerated = LAYOUT.byteOffset(PATH$integerDotProductAccumulatingSaturating8BitSignedAccelerated);
    public static final long OFFSET$integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated = LAYOUT.byteOffset(PATH$integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated);
    public static final long OFFSET$integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated = LAYOUT.byteOffset(PATH$integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated);
    public static final long OFFSET$integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated = LAYOUT.byteOffset(PATH$integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated);
    public static final long OFFSET$integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated = LAYOUT.byteOffset(PATH$integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated);
    public static final long OFFSET$integerDotProductAccumulatingSaturating16BitUnsignedAccelerated = LAYOUT.byteOffset(PATH$integerDotProductAccumulatingSaturating16BitUnsignedAccelerated);
    public static final long OFFSET$integerDotProductAccumulatingSaturating16BitSignedAccelerated = LAYOUT.byteOffset(PATH$integerDotProductAccumulatingSaturating16BitSignedAccelerated);
    public static final long OFFSET$integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated = LAYOUT.byteOffset(PATH$integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated);
    public static final long OFFSET$integerDotProductAccumulatingSaturating32BitUnsignedAccelerated = LAYOUT.byteOffset(PATH$integerDotProductAccumulatingSaturating32BitUnsignedAccelerated);
    public static final long OFFSET$integerDotProductAccumulatingSaturating32BitSignedAccelerated = LAYOUT.byteOffset(PATH$integerDotProductAccumulatingSaturating32BitSignedAccelerated);
    public static final long OFFSET$integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated = LAYOUT.byteOffset(PATH$integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated);
    public static final long OFFSET$integerDotProductAccumulatingSaturating64BitUnsignedAccelerated = LAYOUT.byteOffset(PATH$integerDotProductAccumulatingSaturating64BitUnsignedAccelerated);
    public static final long OFFSET$integerDotProductAccumulatingSaturating64BitSignedAccelerated = LAYOUT.byteOffset(PATH$integerDotProductAccumulatingSaturating64BitSignedAccelerated);
    public static final long OFFSET$integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated = LAYOUT.byteOffset(PATH$integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated);
    public static final long OFFSET$storageTexelBufferOffsetAlignmentBytes = LAYOUT.byteOffset(PATH$storageTexelBufferOffsetAlignmentBytes);
    public static final long OFFSET$storageTexelBufferOffsetSingleTexelAlignment = LAYOUT.byteOffset(PATH$storageTexelBufferOffsetSingleTexelAlignment);
    public static final long OFFSET$uniformTexelBufferOffsetAlignmentBytes = LAYOUT.byteOffset(PATH$uniformTexelBufferOffsetAlignmentBytes);
    public static final long OFFSET$uniformTexelBufferOffsetSingleTexelAlignment = LAYOUT.byteOffset(PATH$uniformTexelBufferOffsetSingleTexelAlignment);
    public static final long OFFSET$maxBufferSize = LAYOUT.byteOffset(PATH$maxBufferSize);

    public VkPhysicalDeviceVulkan13Properties(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_3_PROPERTIES);
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

    public @unsigned int minSubgroupSize() {
        return segment.get(LAYOUT$minSubgroupSize, OFFSET$minSubgroupSize);
    }

    public void minSubgroupSize(@unsigned int value) {
        segment.set(LAYOUT$minSubgroupSize, OFFSET$minSubgroupSize, value);
    }

    public @unsigned int maxSubgroupSize() {
        return segment.get(LAYOUT$maxSubgroupSize, OFFSET$maxSubgroupSize);
    }

    public void maxSubgroupSize(@unsigned int value) {
        segment.set(LAYOUT$maxSubgroupSize, OFFSET$maxSubgroupSize, value);
    }

    public @unsigned int maxComputeWorkgroupSubgroups() {
        return segment.get(LAYOUT$maxComputeWorkgroupSubgroups, OFFSET$maxComputeWorkgroupSubgroups);
    }

    public void maxComputeWorkgroupSubgroups(@unsigned int value) {
        segment.set(LAYOUT$maxComputeWorkgroupSubgroups, OFFSET$maxComputeWorkgroupSubgroups, value);
    }

    public @enumtype(VkShaderStageFlags.class) int requiredSubgroupSizeStages() {
        return segment.get(LAYOUT$requiredSubgroupSizeStages, OFFSET$requiredSubgroupSizeStages);
    }

    public void requiredSubgroupSizeStages(@enumtype(VkShaderStageFlags.class) int value) {
        segment.set(LAYOUT$requiredSubgroupSizeStages, OFFSET$requiredSubgroupSizeStages, value);
    }

    public @unsigned int maxInlineUniformBlockSize() {
        return segment.get(LAYOUT$maxInlineUniformBlockSize, OFFSET$maxInlineUniformBlockSize);
    }

    public void maxInlineUniformBlockSize(@unsigned int value) {
        segment.set(LAYOUT$maxInlineUniformBlockSize, OFFSET$maxInlineUniformBlockSize, value);
    }

    public @unsigned int maxPerStageDescriptorInlineUniformBlocks() {
        return segment.get(LAYOUT$maxPerStageDescriptorInlineUniformBlocks, OFFSET$maxPerStageDescriptorInlineUniformBlocks);
    }

    public void maxPerStageDescriptorInlineUniformBlocks(@unsigned int value) {
        segment.set(LAYOUT$maxPerStageDescriptorInlineUniformBlocks, OFFSET$maxPerStageDescriptorInlineUniformBlocks, value);
    }

    public @unsigned int maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks() {
        return segment.get(LAYOUT$maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks, OFFSET$maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks);
    }

    public void maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks(@unsigned int value) {
        segment.set(LAYOUT$maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks, OFFSET$maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks, value);
    }

    public @unsigned int maxDescriptorSetInlineUniformBlocks() {
        return segment.get(LAYOUT$maxDescriptorSetInlineUniformBlocks, OFFSET$maxDescriptorSetInlineUniformBlocks);
    }

    public void maxDescriptorSetInlineUniformBlocks(@unsigned int value) {
        segment.set(LAYOUT$maxDescriptorSetInlineUniformBlocks, OFFSET$maxDescriptorSetInlineUniformBlocks, value);
    }

    public @unsigned int maxDescriptorSetUpdateAfterBindInlineUniformBlocks() {
        return segment.get(LAYOUT$maxDescriptorSetUpdateAfterBindInlineUniformBlocks, OFFSET$maxDescriptorSetUpdateAfterBindInlineUniformBlocks);
    }

    public void maxDescriptorSetUpdateAfterBindInlineUniformBlocks(@unsigned int value) {
        segment.set(LAYOUT$maxDescriptorSetUpdateAfterBindInlineUniformBlocks, OFFSET$maxDescriptorSetUpdateAfterBindInlineUniformBlocks, value);
    }

    public @unsigned int maxInlineUniformTotalSize() {
        return segment.get(LAYOUT$maxInlineUniformTotalSize, OFFSET$maxInlineUniformTotalSize);
    }

    public void maxInlineUniformTotalSize(@unsigned int value) {
        segment.set(LAYOUT$maxInlineUniformTotalSize, OFFSET$maxInlineUniformTotalSize, value);
    }

    public @unsigned int integerDotProduct8BitUnsignedAccelerated() {
        return segment.get(LAYOUT$integerDotProduct8BitUnsignedAccelerated, OFFSET$integerDotProduct8BitUnsignedAccelerated);
    }

    public void integerDotProduct8BitUnsignedAccelerated(@unsigned int value) {
        segment.set(LAYOUT$integerDotProduct8BitUnsignedAccelerated, OFFSET$integerDotProduct8BitUnsignedAccelerated, value);
    }

    public @unsigned int integerDotProduct8BitSignedAccelerated() {
        return segment.get(LAYOUT$integerDotProduct8BitSignedAccelerated, OFFSET$integerDotProduct8BitSignedAccelerated);
    }

    public void integerDotProduct8BitSignedAccelerated(@unsigned int value) {
        segment.set(LAYOUT$integerDotProduct8BitSignedAccelerated, OFFSET$integerDotProduct8BitSignedAccelerated, value);
    }

    public @unsigned int integerDotProduct8BitMixedSignednessAccelerated() {
        return segment.get(LAYOUT$integerDotProduct8BitMixedSignednessAccelerated, OFFSET$integerDotProduct8BitMixedSignednessAccelerated);
    }

    public void integerDotProduct8BitMixedSignednessAccelerated(@unsigned int value) {
        segment.set(LAYOUT$integerDotProduct8BitMixedSignednessAccelerated, OFFSET$integerDotProduct8BitMixedSignednessAccelerated, value);
    }

    public @unsigned int integerDotProduct4x8BitPackedUnsignedAccelerated() {
        return segment.get(LAYOUT$integerDotProduct4x8BitPackedUnsignedAccelerated, OFFSET$integerDotProduct4x8BitPackedUnsignedAccelerated);
    }

    public void integerDotProduct4x8BitPackedUnsignedAccelerated(@unsigned int value) {
        segment.set(LAYOUT$integerDotProduct4x8BitPackedUnsignedAccelerated, OFFSET$integerDotProduct4x8BitPackedUnsignedAccelerated, value);
    }

    public @unsigned int integerDotProduct4x8BitPackedSignedAccelerated() {
        return segment.get(LAYOUT$integerDotProduct4x8BitPackedSignedAccelerated, OFFSET$integerDotProduct4x8BitPackedSignedAccelerated);
    }

    public void integerDotProduct4x8BitPackedSignedAccelerated(@unsigned int value) {
        segment.set(LAYOUT$integerDotProduct4x8BitPackedSignedAccelerated, OFFSET$integerDotProduct4x8BitPackedSignedAccelerated, value);
    }

    public @unsigned int integerDotProduct4x8BitPackedMixedSignednessAccelerated() {
        return segment.get(LAYOUT$integerDotProduct4x8BitPackedMixedSignednessAccelerated, OFFSET$integerDotProduct4x8BitPackedMixedSignednessAccelerated);
    }

    public void integerDotProduct4x8BitPackedMixedSignednessAccelerated(@unsigned int value) {
        segment.set(LAYOUT$integerDotProduct4x8BitPackedMixedSignednessAccelerated, OFFSET$integerDotProduct4x8BitPackedMixedSignednessAccelerated, value);
    }

    public @unsigned int integerDotProduct16BitUnsignedAccelerated() {
        return segment.get(LAYOUT$integerDotProduct16BitUnsignedAccelerated, OFFSET$integerDotProduct16BitUnsignedAccelerated);
    }

    public void integerDotProduct16BitUnsignedAccelerated(@unsigned int value) {
        segment.set(LAYOUT$integerDotProduct16BitUnsignedAccelerated, OFFSET$integerDotProduct16BitUnsignedAccelerated, value);
    }

    public @unsigned int integerDotProduct16BitSignedAccelerated() {
        return segment.get(LAYOUT$integerDotProduct16BitSignedAccelerated, OFFSET$integerDotProduct16BitSignedAccelerated);
    }

    public void integerDotProduct16BitSignedAccelerated(@unsigned int value) {
        segment.set(LAYOUT$integerDotProduct16BitSignedAccelerated, OFFSET$integerDotProduct16BitSignedAccelerated, value);
    }

    public @unsigned int integerDotProduct16BitMixedSignednessAccelerated() {
        return segment.get(LAYOUT$integerDotProduct16BitMixedSignednessAccelerated, OFFSET$integerDotProduct16BitMixedSignednessAccelerated);
    }

    public void integerDotProduct16BitMixedSignednessAccelerated(@unsigned int value) {
        segment.set(LAYOUT$integerDotProduct16BitMixedSignednessAccelerated, OFFSET$integerDotProduct16BitMixedSignednessAccelerated, value);
    }

    public @unsigned int integerDotProduct32BitUnsignedAccelerated() {
        return segment.get(LAYOUT$integerDotProduct32BitUnsignedAccelerated, OFFSET$integerDotProduct32BitUnsignedAccelerated);
    }

    public void integerDotProduct32BitUnsignedAccelerated(@unsigned int value) {
        segment.set(LAYOUT$integerDotProduct32BitUnsignedAccelerated, OFFSET$integerDotProduct32BitUnsignedAccelerated, value);
    }

    public @unsigned int integerDotProduct32BitSignedAccelerated() {
        return segment.get(LAYOUT$integerDotProduct32BitSignedAccelerated, OFFSET$integerDotProduct32BitSignedAccelerated);
    }

    public void integerDotProduct32BitSignedAccelerated(@unsigned int value) {
        segment.set(LAYOUT$integerDotProduct32BitSignedAccelerated, OFFSET$integerDotProduct32BitSignedAccelerated, value);
    }

    public @unsigned int integerDotProduct32BitMixedSignednessAccelerated() {
        return segment.get(LAYOUT$integerDotProduct32BitMixedSignednessAccelerated, OFFSET$integerDotProduct32BitMixedSignednessAccelerated);
    }

    public void integerDotProduct32BitMixedSignednessAccelerated(@unsigned int value) {
        segment.set(LAYOUT$integerDotProduct32BitMixedSignednessAccelerated, OFFSET$integerDotProduct32BitMixedSignednessAccelerated, value);
    }

    public @unsigned int integerDotProduct64BitUnsignedAccelerated() {
        return segment.get(LAYOUT$integerDotProduct64BitUnsignedAccelerated, OFFSET$integerDotProduct64BitUnsignedAccelerated);
    }

    public void integerDotProduct64BitUnsignedAccelerated(@unsigned int value) {
        segment.set(LAYOUT$integerDotProduct64BitUnsignedAccelerated, OFFSET$integerDotProduct64BitUnsignedAccelerated, value);
    }

    public @unsigned int integerDotProduct64BitSignedAccelerated() {
        return segment.get(LAYOUT$integerDotProduct64BitSignedAccelerated, OFFSET$integerDotProduct64BitSignedAccelerated);
    }

    public void integerDotProduct64BitSignedAccelerated(@unsigned int value) {
        segment.set(LAYOUT$integerDotProduct64BitSignedAccelerated, OFFSET$integerDotProduct64BitSignedAccelerated, value);
    }

    public @unsigned int integerDotProduct64BitMixedSignednessAccelerated() {
        return segment.get(LAYOUT$integerDotProduct64BitMixedSignednessAccelerated, OFFSET$integerDotProduct64BitMixedSignednessAccelerated);
    }

    public void integerDotProduct64BitMixedSignednessAccelerated(@unsigned int value) {
        segment.set(LAYOUT$integerDotProduct64BitMixedSignednessAccelerated, OFFSET$integerDotProduct64BitMixedSignednessAccelerated, value);
    }

    public @unsigned int integerDotProductAccumulatingSaturating8BitUnsignedAccelerated() {
        return segment.get(LAYOUT$integerDotProductAccumulatingSaturating8BitUnsignedAccelerated, OFFSET$integerDotProductAccumulatingSaturating8BitUnsignedAccelerated);
    }

    public void integerDotProductAccumulatingSaturating8BitUnsignedAccelerated(@unsigned int value) {
        segment.set(LAYOUT$integerDotProductAccumulatingSaturating8BitUnsignedAccelerated, OFFSET$integerDotProductAccumulatingSaturating8BitUnsignedAccelerated, value);
    }

    public @unsigned int integerDotProductAccumulatingSaturating8BitSignedAccelerated() {
        return segment.get(LAYOUT$integerDotProductAccumulatingSaturating8BitSignedAccelerated, OFFSET$integerDotProductAccumulatingSaturating8BitSignedAccelerated);
    }

    public void integerDotProductAccumulatingSaturating8BitSignedAccelerated(@unsigned int value) {
        segment.set(LAYOUT$integerDotProductAccumulatingSaturating8BitSignedAccelerated, OFFSET$integerDotProductAccumulatingSaturating8BitSignedAccelerated, value);
    }

    public @unsigned int integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated() {
        return segment.get(LAYOUT$integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated, OFFSET$integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated);
    }

    public void integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated(@unsigned int value) {
        segment.set(LAYOUT$integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated, OFFSET$integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated, value);
    }

    public @unsigned int integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated() {
        return segment.get(LAYOUT$integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated, OFFSET$integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated);
    }

    public void integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated(@unsigned int value) {
        segment.set(LAYOUT$integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated, OFFSET$integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated, value);
    }

    public @unsigned int integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated() {
        return segment.get(LAYOUT$integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated, OFFSET$integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated);
    }

    public void integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated(@unsigned int value) {
        segment.set(LAYOUT$integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated, OFFSET$integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated, value);
    }

    public @unsigned int integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated() {
        return segment.get(LAYOUT$integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated, OFFSET$integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated);
    }

    public void integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated(@unsigned int value) {
        segment.set(LAYOUT$integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated, OFFSET$integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated, value);
    }

    public @unsigned int integerDotProductAccumulatingSaturating16BitUnsignedAccelerated() {
        return segment.get(LAYOUT$integerDotProductAccumulatingSaturating16BitUnsignedAccelerated, OFFSET$integerDotProductAccumulatingSaturating16BitUnsignedAccelerated);
    }

    public void integerDotProductAccumulatingSaturating16BitUnsignedAccelerated(@unsigned int value) {
        segment.set(LAYOUT$integerDotProductAccumulatingSaturating16BitUnsignedAccelerated, OFFSET$integerDotProductAccumulatingSaturating16BitUnsignedAccelerated, value);
    }

    public @unsigned int integerDotProductAccumulatingSaturating16BitSignedAccelerated() {
        return segment.get(LAYOUT$integerDotProductAccumulatingSaturating16BitSignedAccelerated, OFFSET$integerDotProductAccumulatingSaturating16BitSignedAccelerated);
    }

    public void integerDotProductAccumulatingSaturating16BitSignedAccelerated(@unsigned int value) {
        segment.set(LAYOUT$integerDotProductAccumulatingSaturating16BitSignedAccelerated, OFFSET$integerDotProductAccumulatingSaturating16BitSignedAccelerated, value);
    }

    public @unsigned int integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated() {
        return segment.get(LAYOUT$integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated, OFFSET$integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated);
    }

    public void integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated(@unsigned int value) {
        segment.set(LAYOUT$integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated, OFFSET$integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated, value);
    }

    public @unsigned int integerDotProductAccumulatingSaturating32BitUnsignedAccelerated() {
        return segment.get(LAYOUT$integerDotProductAccumulatingSaturating32BitUnsignedAccelerated, OFFSET$integerDotProductAccumulatingSaturating32BitUnsignedAccelerated);
    }

    public void integerDotProductAccumulatingSaturating32BitUnsignedAccelerated(@unsigned int value) {
        segment.set(LAYOUT$integerDotProductAccumulatingSaturating32BitUnsignedAccelerated, OFFSET$integerDotProductAccumulatingSaturating32BitUnsignedAccelerated, value);
    }

    public @unsigned int integerDotProductAccumulatingSaturating32BitSignedAccelerated() {
        return segment.get(LAYOUT$integerDotProductAccumulatingSaturating32BitSignedAccelerated, OFFSET$integerDotProductAccumulatingSaturating32BitSignedAccelerated);
    }

    public void integerDotProductAccumulatingSaturating32BitSignedAccelerated(@unsigned int value) {
        segment.set(LAYOUT$integerDotProductAccumulatingSaturating32BitSignedAccelerated, OFFSET$integerDotProductAccumulatingSaturating32BitSignedAccelerated, value);
    }

    public @unsigned int integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated() {
        return segment.get(LAYOUT$integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated, OFFSET$integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated);
    }

    public void integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated(@unsigned int value) {
        segment.set(LAYOUT$integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated, OFFSET$integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated, value);
    }

    public @unsigned int integerDotProductAccumulatingSaturating64BitUnsignedAccelerated() {
        return segment.get(LAYOUT$integerDotProductAccumulatingSaturating64BitUnsignedAccelerated, OFFSET$integerDotProductAccumulatingSaturating64BitUnsignedAccelerated);
    }

    public void integerDotProductAccumulatingSaturating64BitUnsignedAccelerated(@unsigned int value) {
        segment.set(LAYOUT$integerDotProductAccumulatingSaturating64BitUnsignedAccelerated, OFFSET$integerDotProductAccumulatingSaturating64BitUnsignedAccelerated, value);
    }

    public @unsigned int integerDotProductAccumulatingSaturating64BitSignedAccelerated() {
        return segment.get(LAYOUT$integerDotProductAccumulatingSaturating64BitSignedAccelerated, OFFSET$integerDotProductAccumulatingSaturating64BitSignedAccelerated);
    }

    public void integerDotProductAccumulatingSaturating64BitSignedAccelerated(@unsigned int value) {
        segment.set(LAYOUT$integerDotProductAccumulatingSaturating64BitSignedAccelerated, OFFSET$integerDotProductAccumulatingSaturating64BitSignedAccelerated, value);
    }

    public @unsigned int integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated() {
        return segment.get(LAYOUT$integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated, OFFSET$integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated);
    }

    public void integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated(@unsigned int value) {
        segment.set(LAYOUT$integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated, OFFSET$integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated, value);
    }

    public @unsigned long storageTexelBufferOffsetAlignmentBytes() {
        return segment.get(LAYOUT$storageTexelBufferOffsetAlignmentBytes, OFFSET$storageTexelBufferOffsetAlignmentBytes);
    }

    public void storageTexelBufferOffsetAlignmentBytes(@unsigned long value) {
        segment.set(LAYOUT$storageTexelBufferOffsetAlignmentBytes, OFFSET$storageTexelBufferOffsetAlignmentBytes, value);
    }

    public @unsigned int storageTexelBufferOffsetSingleTexelAlignment() {
        return segment.get(LAYOUT$storageTexelBufferOffsetSingleTexelAlignment, OFFSET$storageTexelBufferOffsetSingleTexelAlignment);
    }

    public void storageTexelBufferOffsetSingleTexelAlignment(@unsigned int value) {
        segment.set(LAYOUT$storageTexelBufferOffsetSingleTexelAlignment, OFFSET$storageTexelBufferOffsetSingleTexelAlignment, value);
    }

    public @unsigned long uniformTexelBufferOffsetAlignmentBytes() {
        return segment.get(LAYOUT$uniformTexelBufferOffsetAlignmentBytes, OFFSET$uniformTexelBufferOffsetAlignmentBytes);
    }

    public void uniformTexelBufferOffsetAlignmentBytes(@unsigned long value) {
        segment.set(LAYOUT$uniformTexelBufferOffsetAlignmentBytes, OFFSET$uniformTexelBufferOffsetAlignmentBytes, value);
    }

    public @unsigned int uniformTexelBufferOffsetSingleTexelAlignment() {
        return segment.get(LAYOUT$uniformTexelBufferOffsetSingleTexelAlignment, OFFSET$uniformTexelBufferOffsetSingleTexelAlignment);
    }

    public void uniformTexelBufferOffsetSingleTexelAlignment(@unsigned int value) {
        segment.set(LAYOUT$uniformTexelBufferOffsetSingleTexelAlignment, OFFSET$uniformTexelBufferOffsetSingleTexelAlignment, value);
    }

    public @unsigned long maxBufferSize() {
        return segment.get(LAYOUT$maxBufferSize, OFFSET$maxBufferSize);
    }

    public void maxBufferSize(@unsigned long value) {
        segment.set(LAYOUT$maxBufferSize, OFFSET$maxBufferSize, value);
    }


    public static final class VkPhysicalDeviceVulkan13PropertiesFactory implements IFactory<VkPhysicalDeviceVulkan13Properties> {
        @Override
        public Class<VkPhysicalDeviceVulkan13Properties> clazz() {
            return VkPhysicalDeviceVulkan13Properties.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkPhysicalDeviceVulkan13Properties.LAYOUT;
        }

        @Override
        public VkPhysicalDeviceVulkan13Properties create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkPhysicalDeviceVulkan13Properties createUninit(MemorySegment segment) {
            return new VkPhysicalDeviceVulkan13Properties(segment);
        }
    }

    public static final VkPhysicalDeviceVulkan13PropertiesFactory FACTORY = new VkPhysicalDeviceVulkan13PropertiesFactory();
}
