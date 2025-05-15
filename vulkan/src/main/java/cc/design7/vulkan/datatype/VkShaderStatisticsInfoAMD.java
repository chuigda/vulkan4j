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

public record VkShaderStatisticsInfoAMD(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$shaderStageMask = ValueLayout.JAVA_INT.withName("shaderStageMask");
    public static final StructLayout LAYOUT$resourceUsage = VkShaderResourceUsageAMD.LAYOUT.withName("resourceUsage");
    public static final OfInt LAYOUT$numPhysicalVgprs = ValueLayout.JAVA_INT.withName("numPhysicalVgprs");
    public static final OfInt LAYOUT$numPhysicalSgprs = ValueLayout.JAVA_INT.withName("numPhysicalSgprs");
    public static final OfInt LAYOUT$numAvailableVgprs = ValueLayout.JAVA_INT.withName("numAvailableVgprs");
    public static final OfInt LAYOUT$numAvailableSgprs = ValueLayout.JAVA_INT.withName("numAvailableSgprs");
    public static final OfInt LAYOUT$computeWorkGroupSize = ValueLayout.JAVA_INT.withName("computeWorkGroupSize");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$shaderStageMask, LAYOUT$resourceUsage, LAYOUT$numPhysicalVgprs, LAYOUT$numPhysicalSgprs, LAYOUT$numAvailableVgprs, LAYOUT$numAvailableSgprs, LAYOUT$computeWorkGroupSize);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkShaderStatisticsInfoAMD allocate(Arena arena) {
        return new VkShaderStatisticsInfoAMD(arena.allocate(LAYOUT));
    }

    public static VkShaderStatisticsInfoAMD[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkShaderStatisticsInfoAMD[] ret = new VkShaderStatisticsInfoAMD[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkShaderStatisticsInfoAMD(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkShaderStatisticsInfoAMD clone(Arena arena, VkShaderStatisticsInfoAMD src) {
        VkShaderStatisticsInfoAMD ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkShaderStatisticsInfoAMD[] clone(Arena arena, VkShaderStatisticsInfoAMD[] src) {
        VkShaderStatisticsInfoAMD[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$shaderStageMask = PathElement.groupElement("PATH$shaderStageMask");
    public static final PathElement PATH$resourceUsage = PathElement.groupElement("PATH$resourceUsage");
    public static final PathElement PATH$numPhysicalVgprs = PathElement.groupElement("PATH$numPhysicalVgprs");
    public static final PathElement PATH$numPhysicalSgprs = PathElement.groupElement("PATH$numPhysicalSgprs");
    public static final PathElement PATH$numAvailableVgprs = PathElement.groupElement("PATH$numAvailableVgprs");
    public static final PathElement PATH$numAvailableSgprs = PathElement.groupElement("PATH$numAvailableSgprs");
    public static final PathElement PATH$computeWorkGroupSize = PathElement.groupElement("PATH$computeWorkGroupSize");

    public static final long SIZE$shaderStageMask = LAYOUT$shaderStageMask.byteSize();
    public static final long SIZE$resourceUsage = LAYOUT$resourceUsage.byteSize();
    public static final long SIZE$numPhysicalVgprs = LAYOUT$numPhysicalVgprs.byteSize();
    public static final long SIZE$numPhysicalSgprs = LAYOUT$numPhysicalSgprs.byteSize();
    public static final long SIZE$numAvailableVgprs = LAYOUT$numAvailableVgprs.byteSize();
    public static final long SIZE$numAvailableSgprs = LAYOUT$numAvailableSgprs.byteSize();
    public static final long SIZE$computeWorkGroupSize = LAYOUT$computeWorkGroupSize.byteSize();

    public static final long OFFSET$shaderStageMask = LAYOUT.byteOffset(PATH$shaderStageMask);
    public static final long OFFSET$resourceUsage = LAYOUT.byteOffset(PATH$resourceUsage);
    public static final long OFFSET$numPhysicalVgprs = LAYOUT.byteOffset(PATH$numPhysicalVgprs);
    public static final long OFFSET$numPhysicalSgprs = LAYOUT.byteOffset(PATH$numPhysicalSgprs);
    public static final long OFFSET$numAvailableVgprs = LAYOUT.byteOffset(PATH$numAvailableVgprs);
    public static final long OFFSET$numAvailableSgprs = LAYOUT.byteOffset(PATH$numAvailableSgprs);
    public static final long OFFSET$computeWorkGroupSize = LAYOUT.byteOffset(PATH$computeWorkGroupSize);

    public @enumtype(VkShaderStageFlags.class) int shaderStageMask() {
        return segment.get(LAYOUT$shaderStageMask, OFFSET$shaderStageMask);
    }

    public void shaderStageMask(@enumtype(VkShaderStageFlags.class) int value) {
        segment.set(LAYOUT$shaderStageMask, OFFSET$shaderStageMask, value);
    }

    public VkShaderResourceUsageAMD resourceUsage() {
        return new VkShaderResourceUsageAMD(segment.asSlice(OFFSET$resourceUsage, LAYOUT$resourceUsage));
    }

    public void resourceUsage(VkShaderResourceUsageAMD value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$resourceUsage, SIZE$resourceUsage);
    }

    public @unsigned int numPhysicalVgprs() {
        return segment.get(LAYOUT$numPhysicalVgprs, OFFSET$numPhysicalVgprs);
    }

    public void numPhysicalVgprs(@unsigned int value) {
        segment.set(LAYOUT$numPhysicalVgprs, OFFSET$numPhysicalVgprs, value);
    }

    public @unsigned int numPhysicalSgprs() {
        return segment.get(LAYOUT$numPhysicalSgprs, OFFSET$numPhysicalSgprs);
    }

    public void numPhysicalSgprs(@unsigned int value) {
        segment.set(LAYOUT$numPhysicalSgprs, OFFSET$numPhysicalSgprs, value);
    }

    public @unsigned int numAvailableVgprs() {
        return segment.get(LAYOUT$numAvailableVgprs, OFFSET$numAvailableVgprs);
    }

    public void numAvailableVgprs(@unsigned int value) {
        segment.set(LAYOUT$numAvailableVgprs, OFFSET$numAvailableVgprs, value);
    }

    public @unsigned int numAvailableSgprs() {
        return segment.get(LAYOUT$numAvailableSgprs, OFFSET$numAvailableSgprs);
    }

    public void numAvailableSgprs(@unsigned int value) {
        segment.set(LAYOUT$numAvailableSgprs, OFFSET$numAvailableSgprs, value);
    }

    public @unsigned int computeWorkGroupSize() {
        return segment.get(LAYOUT$computeWorkGroupSize, OFFSET$computeWorkGroupSize);
    }

    public void computeWorkGroupSize(@unsigned int value) {
        segment.set(LAYOUT$computeWorkGroupSize, OFFSET$computeWorkGroupSize, value);
    }

}
/// dummy, not implemented yet
