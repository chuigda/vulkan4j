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

public record VkMultisampledRenderToSingleSampledInfoEXT(MemorySegment segment) implements IPointer {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("multisampledRenderToSingleSampledEnable"),
        ValueLayout.JAVA_INT.withName("rasterizationSamples")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$multisampledRenderToSingleSampledEnable = PathElement.groupElement("multisampledRenderToSingleSampledEnable");
    public static final PathElement PATH$rasterizationSamples = PathElement.groupElement("rasterizationSamples");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$multisampledRenderToSingleSampledEnable = (OfInt) LAYOUT.select(PATH$multisampledRenderToSingleSampledEnable);
    public static final OfInt LAYOUT$rasterizationSamples = (OfInt) LAYOUT.select(PATH$rasterizationSamples);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$multisampledRenderToSingleSampledEnable = LAYOUT.byteOffset(PATH$multisampledRenderToSingleSampledEnable);
    public static final long OFFSET$rasterizationSamples = LAYOUT.byteOffset(PATH$rasterizationSamples);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$multisampledRenderToSingleSampledEnable = LAYOUT$multisampledRenderToSingleSampledEnable.byteSize();
    public static final long SIZE$rasterizationSamples = LAYOUT$rasterizationSamples.byteSize();

    public VkMultisampledRenderToSingleSampledInfoEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_MULTISAMPLED_RENDER_TO_SINGLE_SAMPLED_INFO_EXT);
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

    public @unsigned int multisampledRenderToSingleSampledEnable() {
        return segment.get(LAYOUT$multisampledRenderToSingleSampledEnable, OFFSET$multisampledRenderToSingleSampledEnable);
    }

    public void multisampledRenderToSingleSampledEnable(@unsigned int value) {
        segment.set(LAYOUT$multisampledRenderToSingleSampledEnable, OFFSET$multisampledRenderToSingleSampledEnable, value);
    }

    public @enumtype(VkSampleCountFlags.class) int rasterizationSamples() {
        return segment.get(LAYOUT$rasterizationSamples, OFFSET$rasterizationSamples);
    }

    public void rasterizationSamples(@enumtype(VkSampleCountFlags.class) int value) {
        segment.set(LAYOUT$rasterizationSamples, OFFSET$rasterizationSamples, value);
    }

    public static VkMultisampledRenderToSingleSampledInfoEXT allocate(Arena arena) {
        return new VkMultisampledRenderToSingleSampledInfoEXT(arena.allocate(LAYOUT));
    }
    
    public static VkMultisampledRenderToSingleSampledInfoEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkMultisampledRenderToSingleSampledInfoEXT[] ret = new VkMultisampledRenderToSingleSampledInfoEXT[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkMultisampledRenderToSingleSampledInfoEXT(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
}
