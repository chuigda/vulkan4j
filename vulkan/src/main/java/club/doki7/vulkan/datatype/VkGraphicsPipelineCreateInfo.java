package club.doki7.vulkan.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import club.doki7.ffm.IPointer;
import club.doki7.ffm.NativeLayout;
import club.doki7.ffm.annotation.*;
import club.doki7.ffm.ptr.*;
import club.doki7.vulkan.bitmask.*;
import club.doki7.vulkan.handle.*;
import club.doki7.vulkan.enumtype.*;
import static club.doki7.vulkan.VkConstants.*;

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkGraphicsPipelineCreateInfo.html"><code>VkGraphicsPipelineCreateInfo</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkGraphicsPipelineCreateInfo {
///     VkStructureType sType; // @link substring="VkStructureType" target="VkStructureType" @link substring="sType" target="#sType"
///     void const* pNext; // optional // @link substring="pNext" target="#pNext"
///     VkPipelineCreateFlags flags; // optional // @link substring="VkPipelineCreateFlags" target="VkPipelineCreateFlags" @link substring="flags" target="#flags"
///     uint32_t stageCount; // optional // @link substring="stageCount" target="#stageCount"
///     VkPipelineShaderStageCreateInfo const* pStages; // optional // @link substring="VkPipelineShaderStageCreateInfo" target="VkPipelineShaderStageCreateInfo" @link substring="pStages" target="#pStages"
///     VkPipelineVertexInputStateCreateInfo const* pVertexInputState; // optional // @link substring="VkPipelineVertexInputStateCreateInfo" target="VkPipelineVertexInputStateCreateInfo" @link substring="pVertexInputState" target="#pVertexInputState"
///     VkPipelineInputAssemblyStateCreateInfo const* pInputAssemblyState; // optional // @link substring="VkPipelineInputAssemblyStateCreateInfo" target="VkPipelineInputAssemblyStateCreateInfo" @link substring="pInputAssemblyState" target="#pInputAssemblyState"
///     VkPipelineTessellationStateCreateInfo const* pTessellationState; // optional // @link substring="VkPipelineTessellationStateCreateInfo" target="VkPipelineTessellationStateCreateInfo" @link substring="pTessellationState" target="#pTessellationState"
///     VkPipelineViewportStateCreateInfo const* pViewportState; // optional // @link substring="VkPipelineViewportStateCreateInfo" target="VkPipelineViewportStateCreateInfo" @link substring="pViewportState" target="#pViewportState"
///     VkPipelineRasterizationStateCreateInfo const* pRasterizationState; // optional // @link substring="VkPipelineRasterizationStateCreateInfo" target="VkPipelineRasterizationStateCreateInfo" @link substring="pRasterizationState" target="#pRasterizationState"
///     VkPipelineMultisampleStateCreateInfo const* pMultisampleState; // optional // @link substring="VkPipelineMultisampleStateCreateInfo" target="VkPipelineMultisampleStateCreateInfo" @link substring="pMultisampleState" target="#pMultisampleState"
///     VkPipelineDepthStencilStateCreateInfo const* pDepthStencilState; // optional // @link substring="VkPipelineDepthStencilStateCreateInfo" target="VkPipelineDepthStencilStateCreateInfo" @link substring="pDepthStencilState" target="#pDepthStencilState"
///     VkPipelineColorBlendStateCreateInfo const* pColorBlendState; // optional // @link substring="VkPipelineColorBlendStateCreateInfo" target="VkPipelineColorBlendStateCreateInfo" @link substring="pColorBlendState" target="#pColorBlendState"
///     VkPipelineDynamicStateCreateInfo const* pDynamicState; // optional // @link substring="VkPipelineDynamicStateCreateInfo" target="VkPipelineDynamicStateCreateInfo" @link substring="pDynamicState" target="#pDynamicState"
///     VkPipelineLayout layout; // optional // @link substring="VkPipelineLayout" target="VkPipelineLayout" @link substring="layout" target="#layout"
///     VkRenderPass renderPass; // optional // @link substring="VkRenderPass" target="VkRenderPass" @link substring="renderPass" target="#renderPass"
///     uint32_t subpass; // @link substring="subpass" target="#subpass"
///     VkPipeline basePipelineHandle; // optional // @link substring="VkPipeline" target="VkPipeline" @link substring="basePipelineHandle" target="#basePipelineHandle"
///     int32_t basePipelineIndex; // @link substring="basePipelineIndex" target="#basePipelineIndex"
/// } VkGraphicsPipelineCreateInfo;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_GRAPHICS_PIPELINE_CREATE_INFO`
///
/// The {@code allocate} ({@link VkGraphicsPipelineCreateInfo#allocate(Arena)}, {@link VkGraphicsPipelineCreateInfo#allocate(Arena, int)})
/// functions will automatically initialize these fields. Also, you may call {@link VkGraphicsPipelineCreateInfo#autoInit}
/// to initialize these fields manually for non-allocated instances.
/// ## Contracts
///
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to)
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkGraphicsPipelineCreateInfo.html"><code>VkGraphicsPipelineCreateInfo</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkGraphicsPipelineCreateInfo(@NotNull MemorySegment segment) implements IPointer {
    public static VkGraphicsPipelineCreateInfo allocate(Arena arena) {
        VkGraphicsPipelineCreateInfo ret = new VkGraphicsPipelineCreateInfo(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.GRAPHICS_PIPELINE_CREATE_INFO);
        return ret;
    }

    public static VkGraphicsPipelineCreateInfo[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkGraphicsPipelineCreateInfo[] ret = new VkGraphicsPipelineCreateInfo[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkGraphicsPipelineCreateInfo(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.GRAPHICS_PIPELINE_CREATE_INFO);
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

    public void autoInit() {
        sType(VkStructureType.GRAPHICS_PIPELINE_CREATE_INFO);
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

    public void pNext(@Nullable IPointer pointer) {
        pNext(pointer != null ? pointer.segment() : MemorySegment.NULL);
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

    public @Nullable VkPipelineShaderStageCreateInfo pStages() {
        MemorySegment s = pStagesRaw();
        if (s.equals(MemorySegment.NULL)) {
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
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkPipelineShaderStageCreateInfo.BYTES);
        VkPipelineShaderStageCreateInfo[] ret = new VkPipelineShaderStageCreateInfo[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkPipelineShaderStageCreateInfo(s.asSlice(i * VkPipelineShaderStageCreateInfo.BYTES, VkPipelineShaderStageCreateInfo.BYTES));
        }
        return ret;
    }

    public @pointer(target=VkPipelineShaderStageCreateInfo.class) MemorySegment pStagesRaw() {
        return segment.get(LAYOUT$pStages, OFFSET$pStages);
    }

    public void pStagesRaw(@pointer(target=VkPipelineShaderStageCreateInfo.class) MemorySegment value) {
        segment.set(LAYOUT$pStages, OFFSET$pStages, value);
    }

    public @Nullable VkPipelineVertexInputStateCreateInfo pVertexInputState() {
        MemorySegment s = pVertexInputStateRaw();
        if (s.equals(MemorySegment.NULL)) {
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
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkPipelineVertexInputStateCreateInfo.BYTES);
        VkPipelineVertexInputStateCreateInfo[] ret = new VkPipelineVertexInputStateCreateInfo[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkPipelineVertexInputStateCreateInfo(s.asSlice(i * VkPipelineVertexInputStateCreateInfo.BYTES, VkPipelineVertexInputStateCreateInfo.BYTES));
        }
        return ret;
    }

    public @pointer(target=VkPipelineVertexInputStateCreateInfo.class) MemorySegment pVertexInputStateRaw() {
        return segment.get(LAYOUT$pVertexInputState, OFFSET$pVertexInputState);
    }

    public void pVertexInputStateRaw(@pointer(target=VkPipelineVertexInputStateCreateInfo.class) MemorySegment value) {
        segment.set(LAYOUT$pVertexInputState, OFFSET$pVertexInputState, value);
    }

    public @Nullable VkPipelineInputAssemblyStateCreateInfo pInputAssemblyState() {
        MemorySegment s = pInputAssemblyStateRaw();
        if (s.equals(MemorySegment.NULL)) {
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
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkPipelineInputAssemblyStateCreateInfo.BYTES);
        VkPipelineInputAssemblyStateCreateInfo[] ret = new VkPipelineInputAssemblyStateCreateInfo[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkPipelineInputAssemblyStateCreateInfo(s.asSlice(i * VkPipelineInputAssemblyStateCreateInfo.BYTES, VkPipelineInputAssemblyStateCreateInfo.BYTES));
        }
        return ret;
    }

    public @pointer(target=VkPipelineInputAssemblyStateCreateInfo.class) MemorySegment pInputAssemblyStateRaw() {
        return segment.get(LAYOUT$pInputAssemblyState, OFFSET$pInputAssemblyState);
    }

    public void pInputAssemblyStateRaw(@pointer(target=VkPipelineInputAssemblyStateCreateInfo.class) MemorySegment value) {
        segment.set(LAYOUT$pInputAssemblyState, OFFSET$pInputAssemblyState, value);
    }

    public @Nullable VkPipelineTessellationStateCreateInfo pTessellationState() {
        MemorySegment s = pTessellationStateRaw();
        if (s.equals(MemorySegment.NULL)) {
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
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkPipelineTessellationStateCreateInfo.BYTES);
        VkPipelineTessellationStateCreateInfo[] ret = new VkPipelineTessellationStateCreateInfo[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkPipelineTessellationStateCreateInfo(s.asSlice(i * VkPipelineTessellationStateCreateInfo.BYTES, VkPipelineTessellationStateCreateInfo.BYTES));
        }
        return ret;
    }

    public @pointer(target=VkPipelineTessellationStateCreateInfo.class) MemorySegment pTessellationStateRaw() {
        return segment.get(LAYOUT$pTessellationState, OFFSET$pTessellationState);
    }

    public void pTessellationStateRaw(@pointer(target=VkPipelineTessellationStateCreateInfo.class) MemorySegment value) {
        segment.set(LAYOUT$pTessellationState, OFFSET$pTessellationState, value);
    }

    public @Nullable VkPipelineViewportStateCreateInfo pViewportState() {
        MemorySegment s = pViewportStateRaw();
        if (s.equals(MemorySegment.NULL)) {
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
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkPipelineViewportStateCreateInfo.BYTES);
        VkPipelineViewportStateCreateInfo[] ret = new VkPipelineViewportStateCreateInfo[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkPipelineViewportStateCreateInfo(s.asSlice(i * VkPipelineViewportStateCreateInfo.BYTES, VkPipelineViewportStateCreateInfo.BYTES));
        }
        return ret;
    }

    public @pointer(target=VkPipelineViewportStateCreateInfo.class) MemorySegment pViewportStateRaw() {
        return segment.get(LAYOUT$pViewportState, OFFSET$pViewportState);
    }

    public void pViewportStateRaw(@pointer(target=VkPipelineViewportStateCreateInfo.class) MemorySegment value) {
        segment.set(LAYOUT$pViewportState, OFFSET$pViewportState, value);
    }

    public @Nullable VkPipelineRasterizationStateCreateInfo pRasterizationState() {
        MemorySegment s = pRasterizationStateRaw();
        if (s.equals(MemorySegment.NULL)) {
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
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkPipelineRasterizationStateCreateInfo.BYTES);
        VkPipelineRasterizationStateCreateInfo[] ret = new VkPipelineRasterizationStateCreateInfo[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkPipelineRasterizationStateCreateInfo(s.asSlice(i * VkPipelineRasterizationStateCreateInfo.BYTES, VkPipelineRasterizationStateCreateInfo.BYTES));
        }
        return ret;
    }

    public @pointer(target=VkPipelineRasterizationStateCreateInfo.class) MemorySegment pRasterizationStateRaw() {
        return segment.get(LAYOUT$pRasterizationState, OFFSET$pRasterizationState);
    }

    public void pRasterizationStateRaw(@pointer(target=VkPipelineRasterizationStateCreateInfo.class) MemorySegment value) {
        segment.set(LAYOUT$pRasterizationState, OFFSET$pRasterizationState, value);
    }

    public @Nullable VkPipelineMultisampleStateCreateInfo pMultisampleState() {
        MemorySegment s = pMultisampleStateRaw();
        if (s.equals(MemorySegment.NULL)) {
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
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkPipelineMultisampleStateCreateInfo.BYTES);
        VkPipelineMultisampleStateCreateInfo[] ret = new VkPipelineMultisampleStateCreateInfo[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkPipelineMultisampleStateCreateInfo(s.asSlice(i * VkPipelineMultisampleStateCreateInfo.BYTES, VkPipelineMultisampleStateCreateInfo.BYTES));
        }
        return ret;
    }

    public @pointer(target=VkPipelineMultisampleStateCreateInfo.class) MemorySegment pMultisampleStateRaw() {
        return segment.get(LAYOUT$pMultisampleState, OFFSET$pMultisampleState);
    }

    public void pMultisampleStateRaw(@pointer(target=VkPipelineMultisampleStateCreateInfo.class) MemorySegment value) {
        segment.set(LAYOUT$pMultisampleState, OFFSET$pMultisampleState, value);
    }

    public @Nullable VkPipelineDepthStencilStateCreateInfo pDepthStencilState() {
        MemorySegment s = pDepthStencilStateRaw();
        if (s.equals(MemorySegment.NULL)) {
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
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkPipelineDepthStencilStateCreateInfo.BYTES);
        VkPipelineDepthStencilStateCreateInfo[] ret = new VkPipelineDepthStencilStateCreateInfo[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkPipelineDepthStencilStateCreateInfo(s.asSlice(i * VkPipelineDepthStencilStateCreateInfo.BYTES, VkPipelineDepthStencilStateCreateInfo.BYTES));
        }
        return ret;
    }

    public @pointer(target=VkPipelineDepthStencilStateCreateInfo.class) MemorySegment pDepthStencilStateRaw() {
        return segment.get(LAYOUT$pDepthStencilState, OFFSET$pDepthStencilState);
    }

    public void pDepthStencilStateRaw(@pointer(target=VkPipelineDepthStencilStateCreateInfo.class) MemorySegment value) {
        segment.set(LAYOUT$pDepthStencilState, OFFSET$pDepthStencilState, value);
    }

    public @Nullable VkPipelineColorBlendStateCreateInfo pColorBlendState() {
        MemorySegment s = pColorBlendStateRaw();
        if (s.equals(MemorySegment.NULL)) {
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
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkPipelineColorBlendStateCreateInfo.BYTES);
        VkPipelineColorBlendStateCreateInfo[] ret = new VkPipelineColorBlendStateCreateInfo[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkPipelineColorBlendStateCreateInfo(s.asSlice(i * VkPipelineColorBlendStateCreateInfo.BYTES, VkPipelineColorBlendStateCreateInfo.BYTES));
        }
        return ret;
    }

    public @pointer(target=VkPipelineColorBlendStateCreateInfo.class) MemorySegment pColorBlendStateRaw() {
        return segment.get(LAYOUT$pColorBlendState, OFFSET$pColorBlendState);
    }

    public void pColorBlendStateRaw(@pointer(target=VkPipelineColorBlendStateCreateInfo.class) MemorySegment value) {
        segment.set(LAYOUT$pColorBlendState, OFFSET$pColorBlendState, value);
    }

    public @Nullable VkPipelineDynamicStateCreateInfo pDynamicState() {
        MemorySegment s = pDynamicStateRaw();
        if (s.equals(MemorySegment.NULL)) {
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
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkPipelineDynamicStateCreateInfo.BYTES);
        VkPipelineDynamicStateCreateInfo[] ret = new VkPipelineDynamicStateCreateInfo[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkPipelineDynamicStateCreateInfo(s.asSlice(i * VkPipelineDynamicStateCreateInfo.BYTES, VkPipelineDynamicStateCreateInfo.BYTES));
        }
        return ret;
    }

    public @pointer(target=VkPipelineDynamicStateCreateInfo.class) MemorySegment pDynamicStateRaw() {
        return segment.get(LAYOUT$pDynamicState, OFFSET$pDynamicState);
    }

    public void pDynamicStateRaw(@pointer(target=VkPipelineDynamicStateCreateInfo.class) MemorySegment value) {
        segment.set(LAYOUT$pDynamicState, OFFSET$pDynamicState, value);
    }

    public @Nullable VkPipelineLayout layout() {
        MemorySegment s = segment.asSlice(OFFSET$layout, SIZE$layout);
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkPipelineLayout(s);
    }

    public void layout(@Nullable VkPipelineLayout value) {
        segment.set(LAYOUT$layout, OFFSET$layout, value != null ? value.segment() : MemorySegment.NULL);
    }

    public @Nullable VkRenderPass renderPass() {
        MemorySegment s = segment.asSlice(OFFSET$renderPass, SIZE$renderPass);
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkRenderPass(s);
    }

    public void renderPass(@Nullable VkRenderPass value) {
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
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkPipeline(s);
    }

    public void basePipelineHandle(@Nullable VkPipeline value) {
        segment.set(LAYOUT$basePipelineHandle, OFFSET$basePipelineHandle, value != null ? value.segment() : MemorySegment.NULL);
    }

    public int basePipelineIndex() {
        return segment.get(LAYOUT$basePipelineIndex, OFFSET$basePipelineIndex);
    }

    public void basePipelineIndex(int value) {
        segment.set(LAYOUT$basePipelineIndex, OFFSET$basePipelineIndex, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
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
    public static final long BYTES = LAYOUT.byteSize();

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
}
