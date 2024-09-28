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
/// typedef struct VkGraphicsPipelineCreateInfo {
///     VkStructureType sType;
///     const void* pNext;
///     VkPipelineCreateFlags flags;
///     uint32_t stageCount;
///     const VkPipelineShaderStageCreateInfo* pStages;
///     const VkPipelineShaderStageCreateInfo* pStages;
///     const VkPipelineVertexInputStateCreateInfo* pVertexInputState;
///     const VkPipelineInputAssemblyStateCreateInfo* pInputAssemblyState;
///     const VkPipelineTessellationStateCreateInfo* pTessellationState;
///     const VkPipelineViewportStateCreateInfo* pViewportState;
///     const VkPipelineRasterizationStateCreateInfo* pRasterizationState;
///     const VkPipelineMultisampleStateCreateInfo* pMultisampleState;
///     const VkPipelineDepthStencilStateCreateInfo* pDepthStencilState;
///     const VkPipelineColorBlendStateCreateInfo* pColorBlendState;
///     const VkPipelineDynamicStateCreateInfo* pDynamicState;
///     VkPipelineLayout layout;
///     VkRenderPass renderPass;
///     uint32_t subpass;
///     VkPipeline basePipelineHandle;
///     int32_t basePipelineIndex;
/// } VkGraphicsPipelineCreateInfo;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkGraphicsPipelineCreateInfo.html">VkGraphicsPipelineCreateInfo</a>
public record VkGraphicsPipelineCreateInfo(MemorySegment segment) implements IPointer {
    public VkGraphicsPipelineCreateInfo(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_GRAPHICS_PIPELINE_CREATE_INFO);
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
    
    public @nullable VkPipelineShaderStageCreateInfo pStages() {
        MemorySegment s = pStagesRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkPipelineShaderStageCreateInfo(s);
    }

    /// Note: this function is {@link unsafe} because it's up to user to provide the correct count of elements.
    @unsafe
    public @nullable VkPipelineShaderStageCreateInfo[] pStages(int assumedCount) {
        MemorySegment s = pStagesRaw().reinterpret(assumedCount * VkPipelineShaderStageCreateInfo.SIZE);
        VkPipelineShaderStageCreateInfo[] arr = new VkPipelineShaderStageCreateInfo[assumedCount];
        for (int i = 0; i < assumedCount; i++) {
            arr[i] = new VkPipelineShaderStageCreateInfo(s.asSlice(i * VkPipelineShaderStageCreateInfo.SIZE, VkPipelineShaderStageCreateInfo.SIZE));
        }
        return arr;
    }

    public void pStages(@nullable VkPipelineShaderStageCreateInfo value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pStagesRaw(s);
    }

    public @pointer(comment="VkPipelineVertexInputStateCreateInfo*") MemorySegment pVertexInputStateRaw() {
        return segment.get(LAYOUT$pVertexInputState, OFFSET$pVertexInputState);
    }

    public void pVertexInputStateRaw(@pointer(comment="VkPipelineVertexInputStateCreateInfo*") MemorySegment value) {
        segment.set(LAYOUT$pVertexInputState, OFFSET$pVertexInputState, value);
    }
    
    public @nullable VkPipelineVertexInputStateCreateInfo pVertexInputState() {
        MemorySegment s = pVertexInputStateRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkPipelineVertexInputStateCreateInfo(s);
    }

    /// Note: this function is {@link unsafe} because it's up to user to provide the correct count of elements.
    @unsafe
    public @nullable VkPipelineVertexInputStateCreateInfo[] pVertexInputState(int assumedCount) {
        MemorySegment s = pVertexInputStateRaw().reinterpret(assumedCount * VkPipelineVertexInputStateCreateInfo.SIZE);
        VkPipelineVertexInputStateCreateInfo[] arr = new VkPipelineVertexInputStateCreateInfo[assumedCount];
        for (int i = 0; i < assumedCount; i++) {
            arr[i] = new VkPipelineVertexInputStateCreateInfo(s.asSlice(i * VkPipelineVertexInputStateCreateInfo.SIZE, VkPipelineVertexInputStateCreateInfo.SIZE));
        }
        return arr;
    }

    public void pVertexInputState(@nullable VkPipelineVertexInputStateCreateInfo value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pVertexInputStateRaw(s);
    }

    public @pointer(comment="VkPipelineInputAssemblyStateCreateInfo*") MemorySegment pInputAssemblyStateRaw() {
        return segment.get(LAYOUT$pInputAssemblyState, OFFSET$pInputAssemblyState);
    }

    public void pInputAssemblyStateRaw(@pointer(comment="VkPipelineInputAssemblyStateCreateInfo*") MemorySegment value) {
        segment.set(LAYOUT$pInputAssemblyState, OFFSET$pInputAssemblyState, value);
    }
    
    public @nullable VkPipelineInputAssemblyStateCreateInfo pInputAssemblyState() {
        MemorySegment s = pInputAssemblyStateRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkPipelineInputAssemblyStateCreateInfo(s);
    }

    /// Note: this function is {@link unsafe} because it's up to user to provide the correct count of elements.
    @unsafe
    public @nullable VkPipelineInputAssemblyStateCreateInfo[] pInputAssemblyState(int assumedCount) {
        MemorySegment s = pInputAssemblyStateRaw().reinterpret(assumedCount * VkPipelineInputAssemblyStateCreateInfo.SIZE);
        VkPipelineInputAssemblyStateCreateInfo[] arr = new VkPipelineInputAssemblyStateCreateInfo[assumedCount];
        for (int i = 0; i < assumedCount; i++) {
            arr[i] = new VkPipelineInputAssemblyStateCreateInfo(s.asSlice(i * VkPipelineInputAssemblyStateCreateInfo.SIZE, VkPipelineInputAssemblyStateCreateInfo.SIZE));
        }
        return arr;
    }

    public void pInputAssemblyState(@nullable VkPipelineInputAssemblyStateCreateInfo value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pInputAssemblyStateRaw(s);
    }

    public @pointer(comment="VkPipelineTessellationStateCreateInfo*") MemorySegment pTessellationStateRaw() {
        return segment.get(LAYOUT$pTessellationState, OFFSET$pTessellationState);
    }

    public void pTessellationStateRaw(@pointer(comment="VkPipelineTessellationStateCreateInfo*") MemorySegment value) {
        segment.set(LAYOUT$pTessellationState, OFFSET$pTessellationState, value);
    }
    
    public @nullable VkPipelineTessellationStateCreateInfo pTessellationState() {
        MemorySegment s = pTessellationStateRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkPipelineTessellationStateCreateInfo(s);
    }

    /// Note: this function is {@link unsafe} because it's up to user to provide the correct count of elements.
    @unsafe
    public @nullable VkPipelineTessellationStateCreateInfo[] pTessellationState(int assumedCount) {
        MemorySegment s = pTessellationStateRaw().reinterpret(assumedCount * VkPipelineTessellationStateCreateInfo.SIZE);
        VkPipelineTessellationStateCreateInfo[] arr = new VkPipelineTessellationStateCreateInfo[assumedCount];
        for (int i = 0; i < assumedCount; i++) {
            arr[i] = new VkPipelineTessellationStateCreateInfo(s.asSlice(i * VkPipelineTessellationStateCreateInfo.SIZE, VkPipelineTessellationStateCreateInfo.SIZE));
        }
        return arr;
    }

    public void pTessellationState(@nullable VkPipelineTessellationStateCreateInfo value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pTessellationStateRaw(s);
    }

    public @pointer(comment="VkPipelineViewportStateCreateInfo*") MemorySegment pViewportStateRaw() {
        return segment.get(LAYOUT$pViewportState, OFFSET$pViewportState);
    }

    public void pViewportStateRaw(@pointer(comment="VkPipelineViewportStateCreateInfo*") MemorySegment value) {
        segment.set(LAYOUT$pViewportState, OFFSET$pViewportState, value);
    }
    
    public @nullable VkPipelineViewportStateCreateInfo pViewportState() {
        MemorySegment s = pViewportStateRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkPipelineViewportStateCreateInfo(s);
    }

    /// Note: this function is {@link unsafe} because it's up to user to provide the correct count of elements.
    @unsafe
    public @nullable VkPipelineViewportStateCreateInfo[] pViewportState(int assumedCount) {
        MemorySegment s = pViewportStateRaw().reinterpret(assumedCount * VkPipelineViewportStateCreateInfo.SIZE);
        VkPipelineViewportStateCreateInfo[] arr = new VkPipelineViewportStateCreateInfo[assumedCount];
        for (int i = 0; i < assumedCount; i++) {
            arr[i] = new VkPipelineViewportStateCreateInfo(s.asSlice(i * VkPipelineViewportStateCreateInfo.SIZE, VkPipelineViewportStateCreateInfo.SIZE));
        }
        return arr;
    }

    public void pViewportState(@nullable VkPipelineViewportStateCreateInfo value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pViewportStateRaw(s);
    }

    public @pointer(comment="VkPipelineRasterizationStateCreateInfo*") MemorySegment pRasterizationStateRaw() {
        return segment.get(LAYOUT$pRasterizationState, OFFSET$pRasterizationState);
    }

    public void pRasterizationStateRaw(@pointer(comment="VkPipelineRasterizationStateCreateInfo*") MemorySegment value) {
        segment.set(LAYOUT$pRasterizationState, OFFSET$pRasterizationState, value);
    }
    
    public @nullable VkPipelineRasterizationStateCreateInfo pRasterizationState() {
        MemorySegment s = pRasterizationStateRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkPipelineRasterizationStateCreateInfo(s);
    }

    /// Note: this function is {@link unsafe} because it's up to user to provide the correct count of elements.
    @unsafe
    public @nullable VkPipelineRasterizationStateCreateInfo[] pRasterizationState(int assumedCount) {
        MemorySegment s = pRasterizationStateRaw().reinterpret(assumedCount * VkPipelineRasterizationStateCreateInfo.SIZE);
        VkPipelineRasterizationStateCreateInfo[] arr = new VkPipelineRasterizationStateCreateInfo[assumedCount];
        for (int i = 0; i < assumedCount; i++) {
            arr[i] = new VkPipelineRasterizationStateCreateInfo(s.asSlice(i * VkPipelineRasterizationStateCreateInfo.SIZE, VkPipelineRasterizationStateCreateInfo.SIZE));
        }
        return arr;
    }

    public void pRasterizationState(@nullable VkPipelineRasterizationStateCreateInfo value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pRasterizationStateRaw(s);
    }

    public @pointer(comment="VkPipelineMultisampleStateCreateInfo*") MemorySegment pMultisampleStateRaw() {
        return segment.get(LAYOUT$pMultisampleState, OFFSET$pMultisampleState);
    }

    public void pMultisampleStateRaw(@pointer(comment="VkPipelineMultisampleStateCreateInfo*") MemorySegment value) {
        segment.set(LAYOUT$pMultisampleState, OFFSET$pMultisampleState, value);
    }
    
    public @nullable VkPipelineMultisampleStateCreateInfo pMultisampleState() {
        MemorySegment s = pMultisampleStateRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkPipelineMultisampleStateCreateInfo(s);
    }

    /// Note: this function is {@link unsafe} because it's up to user to provide the correct count of elements.
    @unsafe
    public @nullable VkPipelineMultisampleStateCreateInfo[] pMultisampleState(int assumedCount) {
        MemorySegment s = pMultisampleStateRaw().reinterpret(assumedCount * VkPipelineMultisampleStateCreateInfo.SIZE);
        VkPipelineMultisampleStateCreateInfo[] arr = new VkPipelineMultisampleStateCreateInfo[assumedCount];
        for (int i = 0; i < assumedCount; i++) {
            arr[i] = new VkPipelineMultisampleStateCreateInfo(s.asSlice(i * VkPipelineMultisampleStateCreateInfo.SIZE, VkPipelineMultisampleStateCreateInfo.SIZE));
        }
        return arr;
    }

    public void pMultisampleState(@nullable VkPipelineMultisampleStateCreateInfo value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pMultisampleStateRaw(s);
    }

    public @pointer(comment="VkPipelineDepthStencilStateCreateInfo*") MemorySegment pDepthStencilStateRaw() {
        return segment.get(LAYOUT$pDepthStencilState, OFFSET$pDepthStencilState);
    }

    public void pDepthStencilStateRaw(@pointer(comment="VkPipelineDepthStencilStateCreateInfo*") MemorySegment value) {
        segment.set(LAYOUT$pDepthStencilState, OFFSET$pDepthStencilState, value);
    }
    
    public @nullable VkPipelineDepthStencilStateCreateInfo pDepthStencilState() {
        MemorySegment s = pDepthStencilStateRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkPipelineDepthStencilStateCreateInfo(s);
    }

    /// Note: this function is {@link unsafe} because it's up to user to provide the correct count of elements.
    @unsafe
    public @nullable VkPipelineDepthStencilStateCreateInfo[] pDepthStencilState(int assumedCount) {
        MemorySegment s = pDepthStencilStateRaw().reinterpret(assumedCount * VkPipelineDepthStencilStateCreateInfo.SIZE);
        VkPipelineDepthStencilStateCreateInfo[] arr = new VkPipelineDepthStencilStateCreateInfo[assumedCount];
        for (int i = 0; i < assumedCount; i++) {
            arr[i] = new VkPipelineDepthStencilStateCreateInfo(s.asSlice(i * VkPipelineDepthStencilStateCreateInfo.SIZE, VkPipelineDepthStencilStateCreateInfo.SIZE));
        }
        return arr;
    }

    public void pDepthStencilState(@nullable VkPipelineDepthStencilStateCreateInfo value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pDepthStencilStateRaw(s);
    }

    public @pointer(comment="VkPipelineColorBlendStateCreateInfo*") MemorySegment pColorBlendStateRaw() {
        return segment.get(LAYOUT$pColorBlendState, OFFSET$pColorBlendState);
    }

    public void pColorBlendStateRaw(@pointer(comment="VkPipelineColorBlendStateCreateInfo*") MemorySegment value) {
        segment.set(LAYOUT$pColorBlendState, OFFSET$pColorBlendState, value);
    }
    
    public @nullable VkPipelineColorBlendStateCreateInfo pColorBlendState() {
        MemorySegment s = pColorBlendStateRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkPipelineColorBlendStateCreateInfo(s);
    }

    /// Note: this function is {@link unsafe} because it's up to user to provide the correct count of elements.
    @unsafe
    public @nullable VkPipelineColorBlendStateCreateInfo[] pColorBlendState(int assumedCount) {
        MemorySegment s = pColorBlendStateRaw().reinterpret(assumedCount * VkPipelineColorBlendStateCreateInfo.SIZE);
        VkPipelineColorBlendStateCreateInfo[] arr = new VkPipelineColorBlendStateCreateInfo[assumedCount];
        for (int i = 0; i < assumedCount; i++) {
            arr[i] = new VkPipelineColorBlendStateCreateInfo(s.asSlice(i * VkPipelineColorBlendStateCreateInfo.SIZE, VkPipelineColorBlendStateCreateInfo.SIZE));
        }
        return arr;
    }

    public void pColorBlendState(@nullable VkPipelineColorBlendStateCreateInfo value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pColorBlendStateRaw(s);
    }

    public @pointer(comment="VkPipelineDynamicStateCreateInfo*") MemorySegment pDynamicStateRaw() {
        return segment.get(LAYOUT$pDynamicState, OFFSET$pDynamicState);
    }

    public void pDynamicStateRaw(@pointer(comment="VkPipelineDynamicStateCreateInfo*") MemorySegment value) {
        segment.set(LAYOUT$pDynamicState, OFFSET$pDynamicState, value);
    }
    
    public @nullable VkPipelineDynamicStateCreateInfo pDynamicState() {
        MemorySegment s = pDynamicStateRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkPipelineDynamicStateCreateInfo(s);
    }

    /// Note: this function is {@link unsafe} because it's up to user to provide the correct count of elements.
    @unsafe
    public @nullable VkPipelineDynamicStateCreateInfo[] pDynamicState(int assumedCount) {
        MemorySegment s = pDynamicStateRaw().reinterpret(assumedCount * VkPipelineDynamicStateCreateInfo.SIZE);
        VkPipelineDynamicStateCreateInfo[] arr = new VkPipelineDynamicStateCreateInfo[assumedCount];
        for (int i = 0; i < assumedCount; i++) {
            arr[i] = new VkPipelineDynamicStateCreateInfo(s.asSlice(i * VkPipelineDynamicStateCreateInfo.SIZE, VkPipelineDynamicStateCreateInfo.SIZE));
        }
        return arr;
    }

    public void pDynamicState(@nullable VkPipelineDynamicStateCreateInfo value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pDynamicStateRaw(s);
    }

    public VkPipelineLayout layout() {
        return new VkPipelineLayout(segment.get(LAYOUT$layout, OFFSET$layout));
    }

    public void layout(VkPipelineLayout value) {
        segment.set(LAYOUT$layout, OFFSET$layout, value.segment());
    }

    public VkRenderPass renderPass() {
        return new VkRenderPass(segment.get(LAYOUT$renderPass, OFFSET$renderPass));
    }

    public void renderPass(VkRenderPass value) {
        segment.set(LAYOUT$renderPass, OFFSET$renderPass, value.segment());
    }

    public @unsigned int subpass() {
        return segment.get(LAYOUT$subpass, OFFSET$subpass);
    }

    public void subpass(@unsigned int value) {
        segment.set(LAYOUT$subpass, OFFSET$subpass, value);
    }

    public VkPipeline basePipelineHandle() {
        return new VkPipeline(segment.get(LAYOUT$basePipelineHandle, OFFSET$basePipelineHandle));
    }

    public void basePipelineHandle(VkPipeline value) {
        segment.set(LAYOUT$basePipelineHandle, OFFSET$basePipelineHandle, value.segment());
    }

    public int basePipelineIndex() {
        return segment.get(LAYOUT$basePipelineIndex, OFFSET$basePipelineIndex);
    }

    public void basePipelineIndex(int value) {
        segment.set(LAYOUT$basePipelineIndex, OFFSET$basePipelineIndex, value);
    }

    public static VkGraphicsPipelineCreateInfo allocate(Arena arena) {
        return new VkGraphicsPipelineCreateInfo(arena.allocate(LAYOUT));
    }
    
    public static VkGraphicsPipelineCreateInfo[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkGraphicsPipelineCreateInfo[] ret = new VkGraphicsPipelineCreateInfo[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkGraphicsPipelineCreateInfo(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
    
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("stageCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkPipelineShaderStageCreateInfo.LAYOUT).withName("pStages"),
        ValueLayout.ADDRESS.withTargetLayout(VkPipelineVertexInputStateCreateInfo.LAYOUT).withName("pVertexInputState"),
        ValueLayout.ADDRESS.withTargetLayout(VkPipelineInputAssemblyStateCreateInfo.LAYOUT).withName("pInputAssemblyState"),
        ValueLayout.ADDRESS.withTargetLayout(VkPipelineTessellationStateCreateInfo.LAYOUT).withName("pTessellationState"),
        ValueLayout.ADDRESS.withTargetLayout(VkPipelineViewportStateCreateInfo.LAYOUT).withName("pViewportState"),
        ValueLayout.ADDRESS.withTargetLayout(VkPipelineRasterizationStateCreateInfo.LAYOUT).withName("pRasterizationState"),
        ValueLayout.ADDRESS.withTargetLayout(VkPipelineMultisampleStateCreateInfo.LAYOUT).withName("pMultisampleState"),
        ValueLayout.ADDRESS.withTargetLayout(VkPipelineDepthStencilStateCreateInfo.LAYOUT).withName("pDepthStencilState"),
        ValueLayout.ADDRESS.withTargetLayout(VkPipelineColorBlendStateCreateInfo.LAYOUT).withName("pColorBlendState"),
        ValueLayout.ADDRESS.withTargetLayout(VkPipelineDynamicStateCreateInfo.LAYOUT).withName("pDynamicState"),
        ValueLayout.ADDRESS.withName("layout"),
        ValueLayout.ADDRESS.withName("renderPass"),
        ValueLayout.JAVA_INT.withName("subpass"),
        ValueLayout.ADDRESS.withName("basePipelineHandle"),
        ValueLayout.JAVA_INT.withName("basePipelineIndex")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$flags = PathElement.groupElement("flags");
    public static final PathElement PATH$stageCount = PathElement.groupElement("stageCount");
    public static final PathElement PATH$pStages = PathElement.groupElement("pStages");
    public static final PathElement PATH$pVertexInputState = PathElement.groupElement("pVertexInputState");
    public static final PathElement PATH$pInputAssemblyState = PathElement.groupElement("pInputAssemblyState");
    public static final PathElement PATH$pTessellationState = PathElement.groupElement("pTessellationState");
    public static final PathElement PATH$pViewportState = PathElement.groupElement("pViewportState");
    public static final PathElement PATH$pRasterizationState = PathElement.groupElement("pRasterizationState");
    public static final PathElement PATH$pMultisampleState = PathElement.groupElement("pMultisampleState");
    public static final PathElement PATH$pDepthStencilState = PathElement.groupElement("pDepthStencilState");
    public static final PathElement PATH$pColorBlendState = PathElement.groupElement("pColorBlendState");
    public static final PathElement PATH$pDynamicState = PathElement.groupElement("pDynamicState");
    public static final PathElement PATH$layout = PathElement.groupElement("layout");
    public static final PathElement PATH$renderPass = PathElement.groupElement("renderPass");
    public static final PathElement PATH$subpass = PathElement.groupElement("subpass");
    public static final PathElement PATH$basePipelineHandle = PathElement.groupElement("basePipelineHandle");
    public static final PathElement PATH$basePipelineIndex = PathElement.groupElement("basePipelineIndex");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$flags = (OfInt) LAYOUT.select(PATH$flags);
    public static final OfInt LAYOUT$stageCount = (OfInt) LAYOUT.select(PATH$stageCount);
    public static final AddressLayout LAYOUT$pStages = (AddressLayout) LAYOUT.select(PATH$pStages);
    public static final AddressLayout LAYOUT$pVertexInputState = (AddressLayout) LAYOUT.select(PATH$pVertexInputState);
    public static final AddressLayout LAYOUT$pInputAssemblyState = (AddressLayout) LAYOUT.select(PATH$pInputAssemblyState);
    public static final AddressLayout LAYOUT$pTessellationState = (AddressLayout) LAYOUT.select(PATH$pTessellationState);
    public static final AddressLayout LAYOUT$pViewportState = (AddressLayout) LAYOUT.select(PATH$pViewportState);
    public static final AddressLayout LAYOUT$pRasterizationState = (AddressLayout) LAYOUT.select(PATH$pRasterizationState);
    public static final AddressLayout LAYOUT$pMultisampleState = (AddressLayout) LAYOUT.select(PATH$pMultisampleState);
    public static final AddressLayout LAYOUT$pDepthStencilState = (AddressLayout) LAYOUT.select(PATH$pDepthStencilState);
    public static final AddressLayout LAYOUT$pColorBlendState = (AddressLayout) LAYOUT.select(PATH$pColorBlendState);
    public static final AddressLayout LAYOUT$pDynamicState = (AddressLayout) LAYOUT.select(PATH$pDynamicState);
    public static final AddressLayout LAYOUT$layout = (AddressLayout) LAYOUT.select(PATH$layout);
    public static final AddressLayout LAYOUT$renderPass = (AddressLayout) LAYOUT.select(PATH$renderPass);
    public static final OfInt LAYOUT$subpass = (OfInt) LAYOUT.select(PATH$subpass);
    public static final AddressLayout LAYOUT$basePipelineHandle = (AddressLayout) LAYOUT.select(PATH$basePipelineHandle);
    public static final OfInt LAYOUT$basePipelineIndex = (OfInt) LAYOUT.select(PATH$basePipelineIndex);

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

}
