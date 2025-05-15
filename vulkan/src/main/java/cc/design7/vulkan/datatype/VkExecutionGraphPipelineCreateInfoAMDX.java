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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkExecutionGraphPipelineCreateInfoAMDX.html">VkExecutionGraphPipelineCreateInfoAMDX</a>
@ValueBasedCandidate
public record VkExecutionGraphPipelineCreateInfoAMDX(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$flags = ValueLayout.JAVA_INT.withName("flags");
    public static final OfInt LAYOUT$stageCount = ValueLayout.JAVA_INT.withName("stageCount");
    public static final AddressLayout LAYOUT$pStages = ValueLayout.ADDRESS.withTargetLayout(VkPipelineShaderStageCreateInfo.LAYOUT).withName("pStages");
    public static final AddressLayout LAYOUT$pLibraryInfo = ValueLayout.ADDRESS.withTargetLayout(VkPipelineLibraryCreateInfoKHR.LAYOUT).withName("pLibraryInfo");
    public static final AddressLayout LAYOUT$layout = ValueLayout.ADDRESS.withName("layout");
    public static final AddressLayout LAYOUT$basePipelineHandle = ValueLayout.ADDRESS.withName("basePipelineHandle");
    public static final OfInt LAYOUT$basePipelineIndex = ValueLayout.JAVA_INT.withName("basePipelineIndex");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$flags, LAYOUT$stageCount, LAYOUT$pStages, LAYOUT$pLibraryInfo, LAYOUT$layout, LAYOUT$basePipelineHandle, LAYOUT$basePipelineIndex);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkExecutionGraphPipelineCreateInfoAMDX allocate(Arena arena) {
        return new VkExecutionGraphPipelineCreateInfoAMDX(arena.allocate(LAYOUT));
    }

    public static VkExecutionGraphPipelineCreateInfoAMDX[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkExecutionGraphPipelineCreateInfoAMDX[] ret = new VkExecutionGraphPipelineCreateInfoAMDX[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkExecutionGraphPipelineCreateInfoAMDX(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkExecutionGraphPipelineCreateInfoAMDX clone(Arena arena, VkExecutionGraphPipelineCreateInfoAMDX src) {
        VkExecutionGraphPipelineCreateInfoAMDX ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkExecutionGraphPipelineCreateInfoAMDX[] clone(Arena arena, VkExecutionGraphPipelineCreateInfoAMDX[] src) {
        VkExecutionGraphPipelineCreateInfoAMDX[] ret = allocate(arena, src.length);
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
    public static final PathElement PATH$pLibraryInfo = PathElement.groupElement("PATH$pLibraryInfo");
    public static final PathElement PATH$layout = PathElement.groupElement("PATH$layout");
    public static final PathElement PATH$basePipelineHandle = PathElement.groupElement("PATH$basePipelineHandle");
    public static final PathElement PATH$basePipelineIndex = PathElement.groupElement("PATH$basePipelineIndex");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$stageCount = LAYOUT$stageCount.byteSize();
    public static final long SIZE$pStages = LAYOUT$pStages.byteSize();
    public static final long SIZE$pLibraryInfo = LAYOUT$pLibraryInfo.byteSize();
    public static final long SIZE$layout = LAYOUT$layout.byteSize();
    public static final long SIZE$basePipelineHandle = LAYOUT$basePipelineHandle.byteSize();
    public static final long SIZE$basePipelineIndex = LAYOUT$basePipelineIndex.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$stageCount = LAYOUT.byteOffset(PATH$stageCount);
    public static final long OFFSET$pStages = LAYOUT.byteOffset(PATH$pStages);
    public static final long OFFSET$pLibraryInfo = LAYOUT.byteOffset(PATH$pLibraryInfo);
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
