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

public record VkShaderStatisticsInfoAMD(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("shaderStageMask"),
        VkShaderResourceUsageAMD.LAYOUT.withName("resourceUsage"),
        ValueLayout.JAVA_INT.withName("numPhysicalVgprs"),
        ValueLayout.JAVA_INT.withName("numPhysicalSgprs"),
        ValueLayout.JAVA_INT.withName("numAvailableVgprs"),
        ValueLayout.JAVA_INT.withName("numAvailableSgprs"),
        MemoryLayout.sequenceLayout(3, ValueLayout.JAVA_INT).withName("computeWorkGroupSize")
    );

    public static final PathElement PATH$shaderStageMask = PathElement.groupElement("shaderStageMask");
    public static final PathElement PATH$resourceUsage = PathElement.groupElement("resourceUsage");
    public static final PathElement PATH$numPhysicalVgprs = PathElement.groupElement("numPhysicalVgprs");
    public static final PathElement PATH$numPhysicalSgprs = PathElement.groupElement("numPhysicalSgprs");
    public static final PathElement PATH$numAvailableVgprs = PathElement.groupElement("numAvailableVgprs");
    public static final PathElement PATH$numAvailableSgprs = PathElement.groupElement("numAvailableSgprs");
    public static final PathElement PATH$computeWorkGroupSize = PathElement.groupElement("computeWorkGroupSize");

    public static final OfInt LAYOUT$shaderStageMask = (OfInt) LAYOUT.select(PATH$shaderStageMask);
    public static final StructLayout LAYOUT$resourceUsage = (StructLayout) LAYOUT.select(PATH$resourceUsage);
    public static final OfInt LAYOUT$numPhysicalVgprs = (OfInt) LAYOUT.select(PATH$numPhysicalVgprs);
    public static final OfInt LAYOUT$numPhysicalSgprs = (OfInt) LAYOUT.select(PATH$numPhysicalSgprs);
    public static final OfInt LAYOUT$numAvailableVgprs = (OfInt) LAYOUT.select(PATH$numAvailableVgprs);
    public static final OfInt LAYOUT$numAvailableSgprs = (OfInt) LAYOUT.select(PATH$numAvailableSgprs);
    public static final SequenceLayout LAYOUT$computeWorkGroupSize = (SequenceLayout) LAYOUT.select(PATH$computeWorkGroupSize);

    public static final long OFFSET$shaderStageMask = LAYOUT.byteOffset(PATH$shaderStageMask);
    public static final long OFFSET$resourceUsage = LAYOUT.byteOffset(PATH$resourceUsage);
    public static final long OFFSET$numPhysicalVgprs = LAYOUT.byteOffset(PATH$numPhysicalVgprs);
    public static final long OFFSET$numPhysicalSgprs = LAYOUT.byteOffset(PATH$numPhysicalSgprs);
    public static final long OFFSET$numAvailableVgprs = LAYOUT.byteOffset(PATH$numAvailableVgprs);
    public static final long OFFSET$numAvailableSgprs = LAYOUT.byteOffset(PATH$numAvailableSgprs);
    public static final long OFFSET$computeWorkGroupSize = LAYOUT.byteOffset(PATH$computeWorkGroupSize);

    public VkShaderStatisticsInfoAMD(MemorySegment segment) {
        this.segment = segment;
    }

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
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$resourceUsage, LAYOUT$resourceUsage.byteSize());
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

    public MemorySegment computeWorkGroupSizeRaw() {
        return segment.asSlice(OFFSET$computeWorkGroupSize, LAYOUT$computeWorkGroupSize.byteSize());
    }

    public @unsigned IntBuffer computeWorkGroupSize() {
        return new IntBuffer(computeWorkGroupSizeRaw());
    }

    public void computeWorkGroupSize(@unsigned IntBuffer value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$computeWorkGroupSize, LAYOUT$computeWorkGroupSize.byteSize());
    }

    public static VkShaderStatisticsInfoAMD allocate(Arena arena) {
        return new VkShaderStatisticsInfoAMD(arena.allocate(LAYOUT));
    }
    
    public static VkShaderStatisticsInfoAMD[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkShaderStatisticsInfoAMD[] ret = new VkShaderStatisticsInfoAMD[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkShaderStatisticsInfoAMD(segment.asSlice(i * LAYOUT.byteSize(), LAYOUT.byteSize()));
        }
        return ret;
    }
}
