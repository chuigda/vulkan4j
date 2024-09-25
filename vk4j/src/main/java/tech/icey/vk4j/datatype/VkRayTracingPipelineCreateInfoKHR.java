package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.annotation.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.buffer.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import tech.icey.vk4j.NativeLayout;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

public record VkRayTracingPipelineCreateInfoKHR(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("stageCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkPipelineShaderStageCreateInfo.LAYOUT).withName("pStages"),
        ValueLayout.JAVA_INT.withName("groupCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkRayTracingShaderGroupCreateInfoKHR.LAYOUT).withName("pGroups"),
        ValueLayout.JAVA_INT.withName("maxPipelineRayRecursionDepth"),
        ValueLayout.ADDRESS.withTargetLayout(VkPipelineLibraryCreateInfoKHR.LAYOUT).withName("pLibraryInfo"),
        ValueLayout.ADDRESS.withTargetLayout(VkRayTracingPipelineInterfaceCreateInfoKHR.LAYOUT).withName("pLibraryInterface"),
        ValueLayout.ADDRESS.withTargetLayout(VkPipelineDynamicStateCreateInfo.LAYOUT).withName("pDynamicState"),
        ValueLayout.ADDRESS.withName("layout"),
        ValueLayout.ADDRESS.withName("basePipelineHandle"),
        ValueLayout.JAVA_INT.withName("basePipelineIndex")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$flags = PathElement.groupElement("flags");
    public static final PathElement PATH$stageCount = PathElement.groupElement("stageCount");
    public static final PathElement PATH$pStages = PathElement.groupElement("pStages");
    public static final PathElement PATH$groupCount = PathElement.groupElement("groupCount");
    public static final PathElement PATH$pGroups = PathElement.groupElement("pGroups");
    public static final PathElement PATH$maxPipelineRayRecursionDepth = PathElement.groupElement("maxPipelineRayRecursionDepth");
    public static final PathElement PATH$pLibraryInfo = PathElement.groupElement("pLibraryInfo");
    public static final PathElement PATH$pLibraryInterface = PathElement.groupElement("pLibraryInterface");
    public static final PathElement PATH$pDynamicState = PathElement.groupElement("pDynamicState");
    public static final PathElement PATH$layout = PathElement.groupElement("layout");
    public static final PathElement PATH$basePipelineHandle = PathElement.groupElement("basePipelineHandle");
    public static final PathElement PATH$basePipelineIndex = PathElement.groupElement("basePipelineIndex");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$flags = (OfInt) LAYOUT.select(PATH$flags);
    public static final OfInt LAYOUT$stageCount = (OfInt) LAYOUT.select(PATH$stageCount);
    public static final AddressLayout LAYOUT$pStages = (AddressLayout) LAYOUT.select(PATH$pStages);
    public static final OfInt LAYOUT$groupCount = (OfInt) LAYOUT.select(PATH$groupCount);
    public static final AddressLayout LAYOUT$pGroups = (AddressLayout) LAYOUT.select(PATH$pGroups);
    public static final OfInt LAYOUT$maxPipelineRayRecursionDepth = (OfInt) LAYOUT.select(PATH$maxPipelineRayRecursionDepth);
    public static final AddressLayout LAYOUT$pLibraryInfo = (AddressLayout) LAYOUT.select(PATH$pLibraryInfo);
    public static final AddressLayout LAYOUT$pLibraryInterface = (AddressLayout) LAYOUT.select(PATH$pLibraryInterface);
    public static final AddressLayout LAYOUT$pDynamicState = (AddressLayout) LAYOUT.select(PATH$pDynamicState);
    public static final AddressLayout LAYOUT$layout = (AddressLayout) LAYOUT.select(PATH$layout);
    public static final AddressLayout LAYOUT$basePipelineHandle = (AddressLayout) LAYOUT.select(PATH$basePipelineHandle);
    public static final OfInt LAYOUT$basePipelineIndex = (OfInt) LAYOUT.select(PATH$basePipelineIndex);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$stageCount = LAYOUT.byteOffset(PATH$stageCount);
    public static final long OFFSET$pStages = LAYOUT.byteOffset(PATH$pStages);
    public static final long OFFSET$groupCount = LAYOUT.byteOffset(PATH$groupCount);
    public static final long OFFSET$pGroups = LAYOUT.byteOffset(PATH$pGroups);
    public static final long OFFSET$maxPipelineRayRecursionDepth = LAYOUT.byteOffset(PATH$maxPipelineRayRecursionDepth);
    public static final long OFFSET$pLibraryInfo = LAYOUT.byteOffset(PATH$pLibraryInfo);
    public static final long OFFSET$pLibraryInterface = LAYOUT.byteOffset(PATH$pLibraryInterface);
    public static final long OFFSET$pDynamicState = LAYOUT.byteOffset(PATH$pDynamicState);
    public static final long OFFSET$layout = LAYOUT.byteOffset(PATH$layout);
    public static final long OFFSET$basePipelineHandle = LAYOUT.byteOffset(PATH$basePipelineHandle);
    public static final long OFFSET$basePipelineIndex = LAYOUT.byteOffset(PATH$basePipelineIndex);

    public VkRayTracingPipelineCreateInfoKHR(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_RAY_TRACING_PIPELINE_CREATE_INFO_KHR);
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

    public void pStages(@nullable VkPipelineShaderStageCreateInfo value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pStagesRaw(s);
    }

    public @unsigned int groupCount() {
        return segment.get(LAYOUT$groupCount, OFFSET$groupCount);
    }

    public void groupCount(@unsigned int value) {
        segment.set(LAYOUT$groupCount, OFFSET$groupCount, value);
    }

    public @pointer(comment="VkRayTracingShaderGroupCreateInfoKHR*") MemorySegment pGroupsRaw() {
        return segment.get(LAYOUT$pGroups, OFFSET$pGroups);
    }

    public void pGroupsRaw(@pointer(comment="VkRayTracingShaderGroupCreateInfoKHR*") MemorySegment value) {
        segment.set(LAYOUT$pGroups, OFFSET$pGroups, value);
    }
    
    public @nullable VkRayTracingShaderGroupCreateInfoKHR pGroups() {
        MemorySegment s = pGroupsRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkRayTracingShaderGroupCreateInfoKHR(s);
    }

    public void pGroups(@nullable VkRayTracingShaderGroupCreateInfoKHR value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pGroupsRaw(s);
    }

    public @unsigned int maxPipelineRayRecursionDepth() {
        return segment.get(LAYOUT$maxPipelineRayRecursionDepth, OFFSET$maxPipelineRayRecursionDepth);
    }

    public void maxPipelineRayRecursionDepth(@unsigned int value) {
        segment.set(LAYOUT$maxPipelineRayRecursionDepth, OFFSET$maxPipelineRayRecursionDepth, value);
    }

    public @pointer(comment="VkPipelineLibraryCreateInfoKHR*") MemorySegment pLibraryInfoRaw() {
        return segment.get(LAYOUT$pLibraryInfo, OFFSET$pLibraryInfo);
    }

    public void pLibraryInfoRaw(@pointer(comment="VkPipelineLibraryCreateInfoKHR*") MemorySegment value) {
        segment.set(LAYOUT$pLibraryInfo, OFFSET$pLibraryInfo, value);
    }
    
    public @nullable VkPipelineLibraryCreateInfoKHR pLibraryInfo() {
        MemorySegment s = pLibraryInfoRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkPipelineLibraryCreateInfoKHR(s);
    }

    public void pLibraryInfo(@nullable VkPipelineLibraryCreateInfoKHR value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pLibraryInfoRaw(s);
    }

    public @pointer(comment="VkRayTracingPipelineInterfaceCreateInfoKHR*") MemorySegment pLibraryInterfaceRaw() {
        return segment.get(LAYOUT$pLibraryInterface, OFFSET$pLibraryInterface);
    }

    public void pLibraryInterfaceRaw(@pointer(comment="VkRayTracingPipelineInterfaceCreateInfoKHR*") MemorySegment value) {
        segment.set(LAYOUT$pLibraryInterface, OFFSET$pLibraryInterface, value);
    }
    
    public @nullable VkRayTracingPipelineInterfaceCreateInfoKHR pLibraryInterface() {
        MemorySegment s = pLibraryInterfaceRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkRayTracingPipelineInterfaceCreateInfoKHR(s);
    }

    public void pLibraryInterface(@nullable VkRayTracingPipelineInterfaceCreateInfoKHR value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pLibraryInterfaceRaw(s);
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

    public void pDynamicState(@nullable VkPipelineDynamicStateCreateInfo value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pDynamicStateRaw(s);
    }

    public VkPipelineLayout layout() {
        return new VkPipelineLayout(segment.asSlice(OFFSET$layout, LAYOUT$layout));
    }

    public void layout(VkPipelineLayout value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$layout, LAYOUT$layout.byteSize());
    }

    public VkPipeline basePipelineHandle() {
        return new VkPipeline(segment.asSlice(OFFSET$basePipelineHandle, LAYOUT$basePipelineHandle));
    }

    public void basePipelineHandle(VkPipeline value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$basePipelineHandle, LAYOUT$basePipelineHandle.byteSize());
    }

    public int basePipelineIndex() {
        return segment.get(LAYOUT$basePipelineIndex, OFFSET$basePipelineIndex);
    }

    public void basePipelineIndex(int value) {
        segment.set(LAYOUT$basePipelineIndex, OFFSET$basePipelineIndex, value);
    }

    public static VkRayTracingPipelineCreateInfoKHR allocate(Arena arena) {
        return new VkRayTracingPipelineCreateInfoKHR(arena.allocate(LAYOUT));
    }
    
    public static VkRayTracingPipelineCreateInfoKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkRayTracingPipelineCreateInfoKHR[] ret = new VkRayTracingPipelineCreateInfoKHR[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkRayTracingPipelineCreateInfoKHR(segment.asSlice(i * LAYOUT.byteSize(), LAYOUT.byteSize()));
        }
        return ret;
    }
}
