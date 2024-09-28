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

public record VkGraphicsShaderGroupCreateInfoNV(MemorySegment segment) implements IPointer {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("stageCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkPipelineShaderStageCreateInfo.LAYOUT).withName("pStages"),
        ValueLayout.ADDRESS.withTargetLayout(VkPipelineVertexInputStateCreateInfo.LAYOUT).withName("pVertexInputState"),
        ValueLayout.ADDRESS.withTargetLayout(VkPipelineTessellationStateCreateInfo.LAYOUT).withName("pTessellationState")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$stageCount = PathElement.groupElement("stageCount");
    public static final PathElement PATH$pStages = PathElement.groupElement("pStages");
    public static final PathElement PATH$pVertexInputState = PathElement.groupElement("pVertexInputState");
    public static final PathElement PATH$pTessellationState = PathElement.groupElement("pTessellationState");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$stageCount = (OfInt) LAYOUT.select(PATH$stageCount);
    public static final AddressLayout LAYOUT$pStages = (AddressLayout) LAYOUT.select(PATH$pStages);
    public static final AddressLayout LAYOUT$pVertexInputState = (AddressLayout) LAYOUT.select(PATH$pVertexInputState);
    public static final AddressLayout LAYOUT$pTessellationState = (AddressLayout) LAYOUT.select(PATH$pTessellationState);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$stageCount = LAYOUT.byteOffset(PATH$stageCount);
    public static final long OFFSET$pStages = LAYOUT.byteOffset(PATH$pStages);
    public static final long OFFSET$pVertexInputState = LAYOUT.byteOffset(PATH$pVertexInputState);
    public static final long OFFSET$pTessellationState = LAYOUT.byteOffset(PATH$pTessellationState);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$stageCount = LAYOUT$stageCount.byteSize();
    public static final long SIZE$pStages = LAYOUT$pStages.byteSize();
    public static final long SIZE$pVertexInputState = LAYOUT$pVertexInputState.byteSize();
    public static final long SIZE$pTessellationState = LAYOUT$pTessellationState.byteSize();

    public VkGraphicsShaderGroupCreateInfoNV(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_GRAPHICS_SHADER_GROUP_CREATE_INFO_NV);
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

    public static VkGraphicsShaderGroupCreateInfoNV allocate(Arena arena) {
        return new VkGraphicsShaderGroupCreateInfoNV(arena.allocate(LAYOUT));
    }
    
    public static VkGraphicsShaderGroupCreateInfoNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkGraphicsShaderGroupCreateInfoNV[] ret = new VkGraphicsShaderGroupCreateInfoNV[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkGraphicsShaderGroupCreateInfoNV(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
}
