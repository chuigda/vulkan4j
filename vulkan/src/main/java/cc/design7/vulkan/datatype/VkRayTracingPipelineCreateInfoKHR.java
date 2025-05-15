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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkRayTracingPipelineCreateInfoKHR.html">VkRayTracingPipelineCreateInfoKHR</a>
@ValueBasedCandidate
public record VkRayTracingPipelineCreateInfoKHR(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$flags = ValueLayout.JAVA_INT.withName("flags");
    public static final OfInt LAYOUT$stageCount = ValueLayout.JAVA_INT.withName("stageCount");
    public static final AddressLayout LAYOUT$pStages = ValueLayout.ADDRESS.withTargetLayout(VkPipelineShaderStageCreateInfo.LAYOUT).withName("pStages");
    public static final OfInt LAYOUT$groupCount = ValueLayout.JAVA_INT.withName("groupCount");
    public static final AddressLayout LAYOUT$pGroups = ValueLayout.ADDRESS.withTargetLayout(VkRayTracingShaderGroupCreateInfoKHR.LAYOUT).withName("pGroups");
    public static final OfInt LAYOUT$maxPipelineRayRecursionDepth = ValueLayout.JAVA_INT.withName("maxPipelineRayRecursionDepth");
    public static final AddressLayout LAYOUT$pLibraryInfo = ValueLayout.ADDRESS.withTargetLayout(VkPipelineLibraryCreateInfoKHR.LAYOUT).withName("pLibraryInfo");
    public static final AddressLayout LAYOUT$pLibraryInterface = ValueLayout.ADDRESS.withTargetLayout(VkRayTracingPipelineInterfaceCreateInfoKHR.LAYOUT).withName("pLibraryInterface");
    public static final AddressLayout LAYOUT$pDynamicState = ValueLayout.ADDRESS.withTargetLayout(VkPipelineDynamicStateCreateInfo.LAYOUT).withName("pDynamicState");
    public static final AddressLayout LAYOUT$layout = ValueLayout.ADDRESS.withName("layout");
    public static final AddressLayout LAYOUT$basePipelineHandle = ValueLayout.ADDRESS.withName("basePipelineHandle");
    public static final OfInt LAYOUT$basePipelineIndex = ValueLayout.JAVA_INT.withName("basePipelineIndex");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$flags, LAYOUT$stageCount, LAYOUT$pStages, LAYOUT$groupCount, LAYOUT$pGroups, LAYOUT$maxPipelineRayRecursionDepth, LAYOUT$pLibraryInfo, LAYOUT$pLibraryInterface, LAYOUT$pDynamicState, LAYOUT$layout, LAYOUT$basePipelineHandle, LAYOUT$basePipelineIndex);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkRayTracingPipelineCreateInfoKHR allocate(Arena arena) {
        return new VkRayTracingPipelineCreateInfoKHR(arena.allocate(LAYOUT));
    }

    public static VkRayTracingPipelineCreateInfoKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkRayTracingPipelineCreateInfoKHR[] ret = new VkRayTracingPipelineCreateInfoKHR[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkRayTracingPipelineCreateInfoKHR(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkRayTracingPipelineCreateInfoKHR clone(Arena arena, VkRayTracingPipelineCreateInfoKHR src) {
        VkRayTracingPipelineCreateInfoKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkRayTracingPipelineCreateInfoKHR[] clone(Arena arena, VkRayTracingPipelineCreateInfoKHR[] src) {
        VkRayTracingPipelineCreateInfoKHR[] ret = allocate(arena, src.length);
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
    public static final PathElement PATH$groupCount = PathElement.groupElement("PATH$groupCount");
    public static final PathElement PATH$pGroups = PathElement.groupElement("PATH$pGroups");
    public static final PathElement PATH$maxPipelineRayRecursionDepth = PathElement.groupElement("PATH$maxPipelineRayRecursionDepth");
    public static final PathElement PATH$pLibraryInfo = PathElement.groupElement("PATH$pLibraryInfo");
    public static final PathElement PATH$pLibraryInterface = PathElement.groupElement("PATH$pLibraryInterface");
    public static final PathElement PATH$pDynamicState = PathElement.groupElement("PATH$pDynamicState");
    public static final PathElement PATH$layout = PathElement.groupElement("PATH$layout");
    public static final PathElement PATH$basePipelineHandle = PathElement.groupElement("PATH$basePipelineHandle");
    public static final PathElement PATH$basePipelineIndex = PathElement.groupElement("PATH$basePipelineIndex");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$stageCount = LAYOUT$stageCount.byteSize();
    public static final long SIZE$pStages = LAYOUT$pStages.byteSize();
    public static final long SIZE$groupCount = LAYOUT$groupCount.byteSize();
    public static final long SIZE$pGroups = LAYOUT$pGroups.byteSize();
    public static final long SIZE$maxPipelineRayRecursionDepth = LAYOUT$maxPipelineRayRecursionDepth.byteSize();
    public static final long SIZE$pLibraryInfo = LAYOUT$pLibraryInfo.byteSize();
    public static final long SIZE$pLibraryInterface = LAYOUT$pLibraryInterface.byteSize();
    public static final long SIZE$pDynamicState = LAYOUT$pDynamicState.byteSize();
    public static final long SIZE$layout = LAYOUT$layout.byteSize();
    public static final long SIZE$basePipelineHandle = LAYOUT$basePipelineHandle.byteSize();
    public static final long SIZE$basePipelineIndex = LAYOUT$basePipelineIndex.byteSize();

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

    public @Nullable VkRayTracingShaderGroupCreateInfoKHR pGroups() {
        MemorySegment s = pGroupsRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkRayTracingShaderGroupCreateInfoKHR(s);
    }

    public void pGroups(@Nullable VkRayTracingShaderGroupCreateInfoKHR value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pGroupsRaw(s);
    }

    @unsafe public @Nullable VkRayTracingShaderGroupCreateInfoKHR[] pGroups(int assumedCount) {
        MemorySegment s = pGroupsRaw();
        if (s.address() == 0) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkRayTracingShaderGroupCreateInfoKHR.SIZE);
        VkRayTracingShaderGroupCreateInfoKHR[] ret = new VkRayTracingShaderGroupCreateInfoKHR[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkRayTracingShaderGroupCreateInfoKHR(s.asSlice(i * VkRayTracingShaderGroupCreateInfoKHR.SIZE, VkRayTracingShaderGroupCreateInfoKHR.SIZE));
        }
        return ret;
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

    public @Nullable VkPipelineLibraryCreateInfoKHR pLibraryInfo() {
        MemorySegment s = pLibraryInfoRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkPipelineLibraryCreateInfoKHR(s);
    }

    public void pLibraryInfo(@Nullable VkPipelineLibraryCreateInfoKHR value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pLibraryInfoRaw(s);
    }

    @unsafe public @Nullable VkPipelineLibraryCreateInfoKHR[] pLibraryInfo(int assumedCount) {
        MemorySegment s = pLibraryInfoRaw();
        if (s.address() == 0) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkPipelineLibraryCreateInfoKHR.SIZE);
        VkPipelineLibraryCreateInfoKHR[] ret = new VkPipelineLibraryCreateInfoKHR[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkPipelineLibraryCreateInfoKHR(s.asSlice(i * VkPipelineLibraryCreateInfoKHR.SIZE, VkPipelineLibraryCreateInfoKHR.SIZE));
        }
        return ret;
    }

    public @pointer(comment="VkRayTracingPipelineInterfaceCreateInfoKHR*") MemorySegment pLibraryInterfaceRaw() {
        return segment.get(LAYOUT$pLibraryInterface, OFFSET$pLibraryInterface);
    }

    public void pLibraryInterfaceRaw(@pointer(comment="VkRayTracingPipelineInterfaceCreateInfoKHR*") MemorySegment value) {
        segment.set(LAYOUT$pLibraryInterface, OFFSET$pLibraryInterface, value);
    }

    public @Nullable VkRayTracingPipelineInterfaceCreateInfoKHR pLibraryInterface() {
        MemorySegment s = pLibraryInterfaceRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkRayTracingPipelineInterfaceCreateInfoKHR(s);
    }

    public void pLibraryInterface(@Nullable VkRayTracingPipelineInterfaceCreateInfoKHR value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pLibraryInterfaceRaw(s);
    }

    @unsafe public @Nullable VkRayTracingPipelineInterfaceCreateInfoKHR[] pLibraryInterface(int assumedCount) {
        MemorySegment s = pLibraryInterfaceRaw();
        if (s.address() == 0) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkRayTracingPipelineInterfaceCreateInfoKHR.SIZE);
        VkRayTracingPipelineInterfaceCreateInfoKHR[] ret = new VkRayTracingPipelineInterfaceCreateInfoKHR[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkRayTracingPipelineInterfaceCreateInfoKHR(s.asSlice(i * VkRayTracingPipelineInterfaceCreateInfoKHR.SIZE, VkRayTracingPipelineInterfaceCreateInfoKHR.SIZE));
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
