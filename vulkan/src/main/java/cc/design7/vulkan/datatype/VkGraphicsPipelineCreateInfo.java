package cc.design7.vulkan.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import cc.design7.ffm.IPointer;
import cc.design7.ffm.NativeLayout;
import cc.design7.ffm.annotation.*;
import cc.design7.ffm.ptr.*;
import cc.design7.vulkan.bitmask.*;
import cc.design7.vulkan.datatype.*;
import cc.design7.vulkan.enumtype.*;
import static cc.design7.vulkan.VkConstants.*;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkGraphicsPipelineCreateInfo.html">VkGraphicsPipelineCreateInfo</a>
@ValueBasedCandidate
public record VkGraphicsPipelineCreateInfo(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$flags = ValueLayout.JAVA_INT.withName("flags");
    public static final OfInt LAYOUT$stageCount = ValueLayout.JAVA_INT.withName("stageCount");
    public static final AddressLayout LAYOUT$pStages = ValueLayout.ADDRESS.withTargetLayout(VkPipelineShaderStageCreateInfo.LAYOUT).withName("pStages");
    public static final AddressLayout LAYOUT$pVertexInputState = ValueLayout.ADDRESS.withTargetLayout(VkPipelineVertexInputStateCreateInfo.LAYOUT).withName("pVertexInputState");
    public static final AddressLayout LAYOUT$pInputAssemblyState = ValueLayout.ADDRESS.withTargetLayout(VkPipelineInputAssemblyStateCreateInfo.LAYOUT).withName("pInputAssemblyState");
    public static final AddressLayout LAYOUT$pTessellationState = ValueLayout.ADDRESS.withTargetLayout(VkPipelineTessellationStateCreateInfo.LAYOUT).withName("pTessellationState");
    public static final AddressLayout LAYOUT$pViewportState = ValueLayout.ADDRESS.withTargetLayout(VkPipelineViewportStateCreateInfo.LAYOUT).withName("pViewportState");
    public static final AddressLayout LAYOUT$pRasterizationState = ValueLayout.ADDRESS.withTargetLayout(VkPipelineRasterizationStateCreateInfo.LAYOUT).withName("pRasterizationState");
    public static final AddressLayout LAYOUT$pMultisampleState = ValueLayout.ADDRESS.withTargetLayout(VkPipelineMultisampleStateCreateInfo.LAYOUT).withName("pMultisampleState");
    public static final AddressLayout LAYOUT$pDepthStencilState = ValueLayout.ADDRESS.withTargetLayout(VkPipelineDepthStencilStateCreateInfo.LAYOUT).withName("pDepthStencilState");
    public static final AddressLayout LAYOUT$pColorBlendState = ValueLayout.ADDRESS.withTargetLayout(VkPipelineColorBlendStateCreateInfo.LAYOUT).withName("pColorBlendState");
    public static final AddressLayout LAYOUT$pDynamicState = ValueLayout.ADDRESS.withTargetLayout(VkPipelineDynamicStateCreateInfo.LAYOUT).withName("pDynamicState");
    public static final AddressLayout LAYOUT$layout = ValueLayout.ADDRESS.withName("layout");
    public static final AddressLayout LAYOUT$renderPass = ValueLayout.ADDRESS.withName("renderPass");
    public static final OfInt LAYOUT$subpass = ValueLayout.JAVA_INT.withName("subpass");
    public static final AddressLayout LAYOUT$basePipelineHandle = ValueLayout.ADDRESS.withName("basePipelineHandle");
    public static final OfInt LAYOUT$basePipelineIndex = ValueLayout.JAVA_INT.withName("basePipelineIndex");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$flags, LAYOUT$stageCount, LAYOUT$pStages, LAYOUT$pVertexInputState, LAYOUT$pInputAssemblyState, LAYOUT$pTessellationState, LAYOUT$pViewportState, LAYOUT$pRasterizationState, LAYOUT$pMultisampleState, LAYOUT$pDepthStencilState, LAYOUT$pColorBlendState, LAYOUT$pDynamicState, LAYOUT$layout, LAYOUT$renderPass, LAYOUT$subpass, LAYOUT$basePipelineHandle, LAYOUT$basePipelineIndex);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkGraphicsPipelineCreateInfo allocate(Arena arena) {
        return new VkGraphicsPipelineCreateInfo(arena.allocate(LAYOUT));
    }

    public static VkGraphicsPipelineCreateInfo[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkGraphicsPipelineCreateInfo[] ret = new VkGraphicsPipelineCreateInfo[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkGraphicsPipelineCreateInfo(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkGraphicsPipelineCreateInfo clone(Arena arena, VkGraphicsPipelineCreateInfo src) {
        VkGraphicsPipelineCreateInfo ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkGraphicsPipelineCreateInfo[] clone(Arena arena, VkGraphicsPipelineCreateInfo[] src) {
        VkGraphicsPipelineCreateInfo[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$flags = PathElement.groupElement("PATH$flags");
    public static final PathElement PATH$stageCount = PathElement.groupElement("PATH$stageCount");
    public static final PathElement PATH$pStages = PathElement.groupElement("PATH$pStages");
    public static final PathElement PATH$pVertexInputState = PathElement.groupElement("PATH$pVertexInputState");
    public static final PathElement PATH$pInputAssemblyState = PathElement.groupElement("PATH$pInputAssemblyState");
    public static final PathElement PATH$pTessellationState = PathElement.groupElement("PATH$pTessellationState");
    public static final PathElement PATH$pViewportState = PathElement.groupElement("PATH$pViewportState");
    public static final PathElement PATH$pRasterizationState = PathElement.groupElement("PATH$pRasterizationState");
    public static final PathElement PATH$pMultisampleState = PathElement.groupElement("PATH$pMultisampleState");
    public static final PathElement PATH$pDepthStencilState = PathElement.groupElement("PATH$pDepthStencilState");
    public static final PathElement PATH$pColorBlendState = PathElement.groupElement("PATH$pColorBlendState");
    public static final PathElement PATH$pDynamicState = PathElement.groupElement("PATH$pDynamicState");
    public static final PathElement PATH$layout = PathElement.groupElement("PATH$layout");
    public static final PathElement PATH$renderPass = PathElement.groupElement("PATH$renderPass");
    public static final PathElement PATH$subpass = PathElement.groupElement("PATH$subpass");
    public static final PathElement PATH$basePipelineHandle = PathElement.groupElement("PATH$basePipelineHandle");
    public static final PathElement PATH$basePipelineIndex = PathElement.groupElement("PATH$basePipelineIndex");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$stageCount = LAYOUT$stageCount.byteSize();
    public static final long SIZE$pStages = LAYOUT$pStages.byteSize();
    public static final long SIZE$pVertexInputState = LAYOUT$pVertexInputState.byteSize();
    public static final long SIZE$pInputAssemblyState = LAYOUT$pInputAssemblyState.byteSize();
    public static final long SIZE$pTessellationState = LAYOUT$pTessellationState.byteSize();
    public static final long SIZE$pViewportState = LAYOUT$pViewportState.byteSize();
    public static final long SIZE$pRasterizationState = LAYOUT$pRasterizationState.byteSize();
    public static final long SIZE$pMultisampleState = LAYOUT$pMultisampleState.byteSize();
    public static final long SIZE$pDepthStencilState = LAYOUT$pDepthStencilState.byteSize();
    public static final long SIZE$pColorBlendState = LAYOUT$pColorBlendState.byteSize();
    public static final long SIZE$pDynamicState = LAYOUT$pDynamicState.byteSize();
    public static final long SIZE$layout = LAYOUT$layout.byteSize();
    public static final long SIZE$renderPass = LAYOUT$renderPass.byteSize();
    public static final long SIZE$subpass = LAYOUT$subpass.byteSize();
    public static final long SIZE$basePipelineHandle = LAYOUT$basePipelineHandle.byteSize();
    public static final long SIZE$basePipelineIndex = LAYOUT$basePipelineIndex.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$stageCount = LAYOUT.byteOffset(PATH$stageCount);
    public static final long OFFSET$pStages = LAYOUT.byteOffset(PATH$pStages);
    public static final long OFFSET$pVertexInputState = LAYOUT.byteOffset(PATH$pVertexInputState);
    public static final long OFFSET$pInputAssemblyState = LAYOUT.byteOffset(PATH$pInputAssemblyState);
    public static final long OFFSET$pTessellationState = LAYOUT.byteOffset(PATH$pTessellationState);
    public static final long OFFSET$pViewportState = LAYOUT.byteOffset(PATH$pViewportState);
    public static final long OFFSET$pRasterizationState = LAYOUT.byteOffset(PATH$pRasterizationState);
    public static final long OFFSET$pMultisampleState = LAYOUT.byteOffset(PATH$pMultisampleState);
    public static final long OFFSET$pDepthStencilState = LAYOUT.byteOffset(PATH$pDepthStencilState);
    public static final long OFFSET$pColorBlendState = LAYOUT.byteOffset(PATH$pColorBlendState);
    public static final long OFFSET$pDynamicState = LAYOUT.byteOffset(PATH$pDynamicState);
    public static final long OFFSET$layout = LAYOUT.byteOffset(PATH$layout);
    public static final long OFFSET$renderPass = LAYOUT.byteOffset(PATH$renderPass);
    public static final long OFFSET$subpass = LAYOUT.byteOffset(PATH$subpass);
    public static final long OFFSET$basePipelineHandle = LAYOUT.byteOffset(PATH$basePipelineHandle);
    public static final long OFFSET$basePipelineIndex = LAYOUT.byteOffset(PATH$basePipelineIndex);

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

    public void pNext(IPointer pointer) {
        pNext(pointer.segment());
    }

    public @enumtype(VkPipelineCreateFlags.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public void flags(@enumtype(VkPipelineCreateFlags.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
    }

    public @unsigned int stageCount() {
        return segment.get(LAYOUT$stageCount, OFFSET$stageCount);
    }

    public void stageCount(@unsigned int value) {
        segment.set(LAYOUT$stageCount, OFFSET$stageCount, value);
    }

    public @pointer(comment="VkPipelineShaderStageCreateInfo*") MemorySegment pStagesRaw() {
        return segment.get(LAYOUT$pStages, OFFSET$pStages);
    }

    public void pStagesRaw(@pointer(comment="VkPipelineShaderStageCreateInfo*") MemorySegment value) {
        segment.set(LAYOUT$pStages, OFFSET$pStages, value);
    }

    public @Nullable VkPipelineShaderStageCreateInfo pStages() {
        MemorySegment s = pStagesRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkPipelineShaderStageCreateInfo(s);
    }

    public void pStages(@Nullable VkPipelineShaderStageCreateInfo value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pStagesRaw(s);
    }

    @unsafe public @Nullable VkPipelineShaderStageCreateInfo[] pStages(int assumedCount) {
        MemorySegment s = pStagesRaw();
        if (s.address() == 0) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkPipelineShaderStageCreateInfo.SIZE);
        VkPipelineShaderStageCreateInfo[] ret = new VkPipelineShaderStageCreateInfo[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkPipelineShaderStageCreateInfo(s.asSlice(i * VkPipelineShaderStageCreateInfo.SIZE, VkPipelineShaderStageCreateInfo.SIZE));
        }
        return ret;
    }

    public @pointer(comment="VkPipelineVertexInputStateCreateInfo*") MemorySegment pVertexInputStateRaw() {
        return segment.get(LAYOUT$pVertexInputState, OFFSET$pVertexInputState);
    }

    public void pVertexInputStateRaw(@pointer(comment="VkPipelineVertexInputStateCreateInfo*") MemorySegment value) {
        segment.set(LAYOUT$pVertexInputState, OFFSET$pVertexInputState, value);
    }

    public @Nullable VkPipelineVertexInputStateCreateInfo pVertexInputState() {
        MemorySegment s = pVertexInputStateRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkPipelineVertexInputStateCreateInfo(s);
    }

    public void pVertexInputState(@Nullable VkPipelineVertexInputStateCreateInfo value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pVertexInputStateRaw(s);
    }

    @unsafe public @Nullable VkPipelineVertexInputStateCreateInfo[] pVertexInputState(int assumedCount) {
        MemorySegment s = pVertexInputStateRaw();
        if (s.address() == 0) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkPipelineVertexInputStateCreateInfo.SIZE);
        VkPipelineVertexInputStateCreateInfo[] ret = new VkPipelineVertexInputStateCreateInfo[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkPipelineVertexInputStateCreateInfo(s.asSlice(i * VkPipelineVertexInputStateCreateInfo.SIZE, VkPipelineVertexInputStateCreateInfo.SIZE));
        }
        return ret;
    }

    public @pointer(comment="VkPipelineInputAssemblyStateCreateInfo*") MemorySegment pInputAssemblyStateRaw() {
        return segment.get(LAYOUT$pInputAssemblyState, OFFSET$pInputAssemblyState);
    }

    public void pInputAssemblyStateRaw(@pointer(comment="VkPipelineInputAssemblyStateCreateInfo*") MemorySegment value) {
        segment.set(LAYOUT$pInputAssemblyState, OFFSET$pInputAssemblyState, value);
    }

    public @Nullable VkPipelineInputAssemblyStateCreateInfo pInputAssemblyState() {
        MemorySegment s = pInputAssemblyStateRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkPipelineInputAssemblyStateCreateInfo(s);
    }

    public void pInputAssemblyState(@Nullable VkPipelineInputAssemblyStateCreateInfo value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pInputAssemblyStateRaw(s);
    }

    @unsafe public @Nullable VkPipelineInputAssemblyStateCreateInfo[] pInputAssemblyState(int assumedCount) {
        MemorySegment s = pInputAssemblyStateRaw();
        if (s.address() == 0) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkPipelineInputAssemblyStateCreateInfo.SIZE);
        VkPipelineInputAssemblyStateCreateInfo[] ret = new VkPipelineInputAssemblyStateCreateInfo[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkPipelineInputAssemblyStateCreateInfo(s.asSlice(i * VkPipelineInputAssemblyStateCreateInfo.SIZE, VkPipelineInputAssemblyStateCreateInfo.SIZE));
        }
        return ret;
    }

    public @pointer(comment="VkPipelineTessellationStateCreateInfo*") MemorySegment pTessellationStateRaw() {
        return segment.get(LAYOUT$pTessellationState, OFFSET$pTessellationState);
    }

    public void pTessellationStateRaw(@pointer(comment="VkPipelineTessellationStateCreateInfo*") MemorySegment value) {
        segment.set(LAYOUT$pTessellationState, OFFSET$pTessellationState, value);
    }

    public @Nullable VkPipelineTessellationStateCreateInfo pTessellationState() {
        MemorySegment s = pTessellationStateRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkPipelineTessellationStateCreateInfo(s);
    }

    public void pTessellationState(@Nullable VkPipelineTessellationStateCreateInfo value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pTessellationStateRaw(s);
    }

    @unsafe public @Nullable VkPipelineTessellationStateCreateInfo[] pTessellationState(int assumedCount) {
        MemorySegment s = pTessellationStateRaw();
        if (s.address() == 0) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkPipelineTessellationStateCreateInfo.SIZE);
        VkPipelineTessellationStateCreateInfo[] ret = new VkPipelineTessellationStateCreateInfo[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkPipelineTessellationStateCreateInfo(s.asSlice(i * VkPipelineTessellationStateCreateInfo.SIZE, VkPipelineTessellationStateCreateInfo.SIZE));
        }
        return ret;
    }

    public @pointer(comment="VkPipelineViewportStateCreateInfo*") MemorySegment pViewportStateRaw() {
        return segment.get(LAYOUT$pViewportState, OFFSET$pViewportState);
    }

    public void pViewportStateRaw(@pointer(comment="VkPipelineViewportStateCreateInfo*") MemorySegment value) {
        segment.set(LAYOUT$pViewportState, OFFSET$pViewportState, value);
    }

    public @Nullable VkPipelineViewportStateCreateInfo pViewportState() {
        MemorySegment s = pViewportStateRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkPipelineViewportStateCreateInfo(s);
    }

    public void pViewportState(@Nullable VkPipelineViewportStateCreateInfo value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pViewportStateRaw(s);
    }

    @unsafe public @Nullable VkPipelineViewportStateCreateInfo[] pViewportState(int assumedCount) {
        MemorySegment s = pViewportStateRaw();
        if (s.address() == 0) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkPipelineViewportStateCreateInfo.SIZE);
        VkPipelineViewportStateCreateInfo[] ret = new VkPipelineViewportStateCreateInfo[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkPipelineViewportStateCreateInfo(s.asSlice(i * VkPipelineViewportStateCreateInfo.SIZE, VkPipelineViewportStateCreateInfo.SIZE));
        }
        return ret;
    }

    public @pointer(comment="VkPipelineRasterizationStateCreateInfo*") MemorySegment pRasterizationStateRaw() {
        return segment.get(LAYOUT$pRasterizationState, OFFSET$pRasterizationState);
    }

    public void pRasterizationStateRaw(@pointer(comment="VkPipelineRasterizationStateCreateInfo*") MemorySegment value) {
        segment.set(LAYOUT$pRasterizationState, OFFSET$pRasterizationState, value);
    }

    public @Nullable VkPipelineRasterizationStateCreateInfo pRasterizationState() {
        MemorySegment s = pRasterizationStateRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkPipelineRasterizationStateCreateInfo(s);
    }

    public void pRasterizationState(@Nullable VkPipelineRasterizationStateCreateInfo value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pRasterizationStateRaw(s);
    }

    @unsafe public @Nullable VkPipelineRasterizationStateCreateInfo[] pRasterizationState(int assumedCount) {
        MemorySegment s = pRasterizationStateRaw();
        if (s.address() == 0) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkPipelineRasterizationStateCreateInfo.SIZE);
        VkPipelineRasterizationStateCreateInfo[] ret = new VkPipelineRasterizationStateCreateInfo[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkPipelineRasterizationStateCreateInfo(s.asSlice(i * VkPipelineRasterizationStateCreateInfo.SIZE, VkPipelineRasterizationStateCreateInfo.SIZE));
        }
        return ret;
    }

    public @pointer(comment="VkPipelineMultisampleStateCreateInfo*") MemorySegment pMultisampleStateRaw() {
        return segment.get(LAYOUT$pMultisampleState, OFFSET$pMultisampleState);
    }

    public void pMultisampleStateRaw(@pointer(comment="VkPipelineMultisampleStateCreateInfo*") MemorySegment value) {
        segment.set(LAYOUT$pMultisampleState, OFFSET$pMultisampleState, value);
    }

    public @Nullable VkPipelineMultisampleStateCreateInfo pMultisampleState() {
        MemorySegment s = pMultisampleStateRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkPipelineMultisampleStateCreateInfo(s);
    }

    public void pMultisampleState(@Nullable VkPipelineMultisampleStateCreateInfo value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pMultisampleStateRaw(s);
    }

    @unsafe public @Nullable VkPipelineMultisampleStateCreateInfo[] pMultisampleState(int assumedCount) {
        MemorySegment s = pMultisampleStateRaw();
        if (s.address() == 0) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkPipelineMultisampleStateCreateInfo.SIZE);
        VkPipelineMultisampleStateCreateInfo[] ret = new VkPipelineMultisampleStateCreateInfo[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkPipelineMultisampleStateCreateInfo(s.asSlice(i * VkPipelineMultisampleStateCreateInfo.SIZE, VkPipelineMultisampleStateCreateInfo.SIZE));
        }
        return ret;
    }

    public @pointer(comment="VkPipelineDepthStencilStateCreateInfo*") MemorySegment pDepthStencilStateRaw() {
        return segment.get(LAYOUT$pDepthStencilState, OFFSET$pDepthStencilState);
    }

    public void pDepthStencilStateRaw(@pointer(comment="VkPipelineDepthStencilStateCreateInfo*") MemorySegment value) {
        segment.set(LAYOUT$pDepthStencilState, OFFSET$pDepthStencilState, value);
    }

    public @Nullable VkPipelineDepthStencilStateCreateInfo pDepthStencilState() {
        MemorySegment s = pDepthStencilStateRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkPipelineDepthStencilStateCreateInfo(s);
    }

    public void pDepthStencilState(@Nullable VkPipelineDepthStencilStateCreateInfo value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pDepthStencilStateRaw(s);
    }

    @unsafe public @Nullable VkPipelineDepthStencilStateCreateInfo[] pDepthStencilState(int assumedCount) {
        MemorySegment s = pDepthStencilStateRaw();
        if (s.address() == 0) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkPipelineDepthStencilStateCreateInfo.SIZE);
        VkPipelineDepthStencilStateCreateInfo[] ret = new VkPipelineDepthStencilStateCreateInfo[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkPipelineDepthStencilStateCreateInfo(s.asSlice(i * VkPipelineDepthStencilStateCreateInfo.SIZE, VkPipelineDepthStencilStateCreateInfo.SIZE));
        }
        return ret;
    }

    public @pointer(comment="VkPipelineColorBlendStateCreateInfo*") MemorySegment pColorBlendStateRaw() {
        return segment.get(LAYOUT$pColorBlendState, OFFSET$pColorBlendState);
    }

    public void pColorBlendStateRaw(@pointer(comment="VkPipelineColorBlendStateCreateInfo*") MemorySegment value) {
        segment.set(LAYOUT$pColorBlendState, OFFSET$pColorBlendState, value);
    }

    public @Nullable VkPipelineColorBlendStateCreateInfo pColorBlendState() {
        MemorySegment s = pColorBlendStateRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkPipelineColorBlendStateCreateInfo(s);
    }

    public void pColorBlendState(@Nullable VkPipelineColorBlendStateCreateInfo value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pColorBlendStateRaw(s);
    }

    @unsafe public @Nullable VkPipelineColorBlendStateCreateInfo[] pColorBlendState(int assumedCount) {
        MemorySegment s = pColorBlendStateRaw();
        if (s.address() == 0) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkPipelineColorBlendStateCreateInfo.SIZE);
        VkPipelineColorBlendStateCreateInfo[] ret = new VkPipelineColorBlendStateCreateInfo[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkPipelineColorBlendStateCreateInfo(s.asSlice(i * VkPipelineColorBlendStateCreateInfo.SIZE, VkPipelineColorBlendStateCreateInfo.SIZE));
        }
        return ret;
    }

    public @pointer(comment="VkPipelineDynamicStateCreateInfo*") MemorySegment pDynamicStateRaw() {
        return segment.get(LAYOUT$pDynamicState, OFFSET$pDynamicState);
    }

    public void pDynamicStateRaw(@pointer(comment="VkPipelineDynamicStateCreateInfo*") MemorySegment value) {
        segment.set(LAYOUT$pDynamicState, OFFSET$pDynamicState, value);
    }

    public @Nullable VkPipelineDynamicStateCreateInfo pDynamicState() {
        MemorySegment s = pDynamicStateRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkPipelineDynamicStateCreateInfo(s);
    }

    public void pDynamicState(@Nullable VkPipelineDynamicStateCreateInfo value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pDynamicStateRaw(s);
    }

    @unsafe public @Nullable VkPipelineDynamicStateCreateInfo[] pDynamicState(int assumedCount) {
        MemorySegment s = pDynamicStateRaw();
        if (s.address() == 0) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkPipelineDynamicStateCreateInfo.SIZE);
        VkPipelineDynamicStateCreateInfo[] ret = new VkPipelineDynamicStateCreateInfo[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkPipelineDynamicStateCreateInfo(s.asSlice(i * VkPipelineDynamicStateCreateInfo.SIZE, VkPipelineDynamicStateCreateInfo.SIZE));
        }
        return ret;
    }

    public @Nullable VkPipelineLayout layout() {
        MemorySegment s = segment.asSlice(OFFSET$layout, SIZE$layout);
        if (s.address() == 0) {
            return null;
        }
        return new VkPipelineLayout(s);
    }

    public void layout() {
        segment.set(LAYOUT$layout, OFFSET$layout, value != null ? value.segment() : MemorySegment.NULL);
    }

    public @Nullable VkRenderPass renderPass() {
        MemorySegment s = segment.asSlice(OFFSET$renderPass, SIZE$renderPass);
        if (s.address() == 0) {
            return null;
        }
        return new VkRenderPass(s);
    }

    public void renderPass() {
        segment.set(LAYOUT$renderPass, OFFSET$renderPass, value != null ? value.segment() : MemorySegment.NULL);
    }

    public @unsigned int subpass() {
        return segment.get(LAYOUT$subpass, OFFSET$subpass);
    }

    public void subpass(@unsigned int value) {
        segment.set(LAYOUT$subpass, OFFSET$subpass, value);
    }

    public @Nullable VkPipeline basePipelineHandle() {
        MemorySegment s = segment.asSlice(OFFSET$basePipelineHandle, SIZE$basePipelineHandle);
        if (s.address() == 0) {
            return null;
        }
        return new VkPipeline(s);
    }

    public void basePipelineHandle() {
        segment.set(LAYOUT$basePipelineHandle, OFFSET$basePipelineHandle, value != null ? value.segment() : MemorySegment.NULL);
    }

    public int basePipelineIndex() {
        return segment.get(LAYOUT$basePipelineIndex, OFFSET$basePipelineIndex);
    }

    public void basePipelineIndex(int value) {
        segment.set(LAYOUT$basePipelineIndex, OFFSET$basePipelineIndex, value);
    }

}
