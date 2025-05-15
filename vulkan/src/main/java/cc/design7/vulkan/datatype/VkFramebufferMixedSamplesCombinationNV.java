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

public record VkFramebufferMixedSamplesCombinationNV(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$coverageReductionMode = ValueLayout.JAVA_INT.withName("coverageReductionMode");
    public static final OfInt LAYOUT$rasterizationSamples = ValueLayout.JAVA_INT.withName("rasterizationSamples");
    public static final OfInt LAYOUT$depthStencilSamples = ValueLayout.JAVA_INT.withName("depthStencilSamples");
    public static final OfInt LAYOUT$colorSamples = ValueLayout.JAVA_INT.withName("colorSamples");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$coverageReductionMode, LAYOUT$rasterizationSamples, LAYOUT$depthStencilSamples, LAYOUT$colorSamples);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkFramebufferMixedSamplesCombinationNV allocate(Arena arena) {
        return new VkFramebufferMixedSamplesCombinationNV(arena.allocate(LAYOUT));
    }

    public static VkFramebufferMixedSamplesCombinationNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkFramebufferMixedSamplesCombinationNV[] ret = new VkFramebufferMixedSamplesCombinationNV[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkFramebufferMixedSamplesCombinationNV(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkFramebufferMixedSamplesCombinationNV clone(Arena arena, VkFramebufferMixedSamplesCombinationNV src) {
        VkFramebufferMixedSamplesCombinationNV ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkFramebufferMixedSamplesCombinationNV[] clone(Arena arena, VkFramebufferMixedSamplesCombinationNV[] src) {
        VkFramebufferMixedSamplesCombinationNV[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$coverageReductionMode = PathElement.groupElement("PATH$coverageReductionMode");
    public static final PathElement PATH$rasterizationSamples = PathElement.groupElement("PATH$rasterizationSamples");
    public static final PathElement PATH$depthStencilSamples = PathElement.groupElement("PATH$depthStencilSamples");
    public static final PathElement PATH$colorSamples = PathElement.groupElement("PATH$colorSamples");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$coverageReductionMode = LAYOUT$coverageReductionMode.byteSize();
    public static final long SIZE$rasterizationSamples = LAYOUT$rasterizationSamples.byteSize();
    public static final long SIZE$depthStencilSamples = LAYOUT$depthStencilSamples.byteSize();
    public static final long SIZE$colorSamples = LAYOUT$colorSamples.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$coverageReductionMode = LAYOUT.byteOffset(PATH$coverageReductionMode);
    public static final long OFFSET$rasterizationSamples = LAYOUT.byteOffset(PATH$rasterizationSamples);
    public static final long OFFSET$depthStencilSamples = LAYOUT.byteOffset(PATH$depthStencilSamples);
    public static final long OFFSET$colorSamples = LAYOUT.byteOffset(PATH$colorSamples);

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

    public @enumtype(VkCoverageReductionModeNV.class) int coverageReductionMode() {
        return segment.get(LAYOUT$coverageReductionMode, OFFSET$coverageReductionMode);
    }

    public void coverageReductionMode(@enumtype(VkCoverageReductionModeNV.class) int value) {
        segment.set(LAYOUT$coverageReductionMode, OFFSET$coverageReductionMode, value);
    }

    public @enumtype(VkSampleCountFlags.class) int rasterizationSamples() {
        return segment.get(LAYOUT$rasterizationSamples, OFFSET$rasterizationSamples);
    }

    public void rasterizationSamples(@enumtype(VkSampleCountFlags.class) int value) {
        segment.set(LAYOUT$rasterizationSamples, OFFSET$rasterizationSamples, value);
    }

    public @enumtype(VkSampleCountFlags.class) int depthStencilSamples() {
        return segment.get(LAYOUT$depthStencilSamples, OFFSET$depthStencilSamples);
    }

    public void depthStencilSamples(@enumtype(VkSampleCountFlags.class) int value) {
        segment.set(LAYOUT$depthStencilSamples, OFFSET$depthStencilSamples, value);
    }

    public @enumtype(VkSampleCountFlags.class) int colorSamples() {
        return segment.get(LAYOUT$colorSamples, OFFSET$colorSamples);
    }

    public void colorSamples(@enumtype(VkSampleCountFlags.class) int value) {
        segment.set(LAYOUT$colorSamples, OFFSET$colorSamples, value);
    }

}
/// dummy, not implemented yet
