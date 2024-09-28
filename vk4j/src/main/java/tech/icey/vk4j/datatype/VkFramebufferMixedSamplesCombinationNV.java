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

/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkFramebufferMixedSamplesCombinationNV.html">VkFramebufferMixedSamplesCombinationNV</a>
public record VkFramebufferMixedSamplesCombinationNV(MemorySegment segment) implements IPointer {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("coverageReductionMode"),
        ValueLayout.JAVA_INT.withName("rasterizationSamples"),
        ValueLayout.JAVA_INT.withName("depthStencilSamples"),
        ValueLayout.JAVA_INT.withName("colorSamples")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$coverageReductionMode = PathElement.groupElement("coverageReductionMode");
    public static final PathElement PATH$rasterizationSamples = PathElement.groupElement("rasterizationSamples");
    public static final PathElement PATH$depthStencilSamples = PathElement.groupElement("depthStencilSamples");
    public static final PathElement PATH$colorSamples = PathElement.groupElement("colorSamples");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$coverageReductionMode = (OfInt) LAYOUT.select(PATH$coverageReductionMode);
    public static final OfInt LAYOUT$rasterizationSamples = (OfInt) LAYOUT.select(PATH$rasterizationSamples);
    public static final OfInt LAYOUT$depthStencilSamples = (OfInt) LAYOUT.select(PATH$depthStencilSamples);
    public static final OfInt LAYOUT$colorSamples = (OfInt) LAYOUT.select(PATH$colorSamples);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$coverageReductionMode = LAYOUT.byteOffset(PATH$coverageReductionMode);
    public static final long OFFSET$rasterizationSamples = LAYOUT.byteOffset(PATH$rasterizationSamples);
    public static final long OFFSET$depthStencilSamples = LAYOUT.byteOffset(PATH$depthStencilSamples);
    public static final long OFFSET$colorSamples = LAYOUT.byteOffset(PATH$colorSamples);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$coverageReductionMode = LAYOUT$coverageReductionMode.byteSize();
    public static final long SIZE$rasterizationSamples = LAYOUT$rasterizationSamples.byteSize();
    public static final long SIZE$depthStencilSamples = LAYOUT$depthStencilSamples.byteSize();
    public static final long SIZE$colorSamples = LAYOUT$colorSamples.byteSize();

    public VkFramebufferMixedSamplesCombinationNV(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_FRAMEBUFFER_MIXED_SAMPLES_COMBINATION_NV);
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

    public static VkFramebufferMixedSamplesCombinationNV allocate(Arena arena) {
        return new VkFramebufferMixedSamplesCombinationNV(arena.allocate(LAYOUT));
    }
    
    public static VkFramebufferMixedSamplesCombinationNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkFramebufferMixedSamplesCombinationNV[] ret = new VkFramebufferMixedSamplesCombinationNV[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkFramebufferMixedSamplesCombinationNV(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
}
