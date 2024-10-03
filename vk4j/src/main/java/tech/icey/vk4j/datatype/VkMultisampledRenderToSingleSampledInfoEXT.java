package tech.icey.vk4j.datatype;

import tech.icey.panama.IPointer;
import tech.icey.panama.NativeLayout;
import tech.icey.panama.annotation.enumtype;
import tech.icey.panama.annotation.pointer;
import tech.icey.panama.annotation.unsigned;
import tech.icey.vk4j.bitmask.VkSampleCountFlags;
import tech.icey.vk4j.enumtype.VkStructureType;

import java.lang.foreign.*;

import static java.lang.foreign.ValueLayout.OfInt;
import static java.lang.foreign.ValueLayout.PathElement;
import static tech.icey.vk4j.enumtype.VkStructureType.VK_STRUCTURE_TYPE_MULTISAMPLED_RENDER_TO_SINGLE_SAMPLED_INFO_EXT;

/// {@snippet lang=c :
/// typedef struct VkMultisampledRenderToSingleSampledInfoEXT {
///     VkStructureType sType;
///     const void* pNext;
///     VkBool32 multisampledRenderToSingleSampledEnable;
///     VkSampleCountFlagBits rasterizationSamples;
/// } VkMultisampledRenderToSingleSampledInfoEXT;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkMultisampledRenderToSingleSampledInfoEXT.html">VkMultisampledRenderToSingleSampledInfoEXT</a>
public record VkMultisampledRenderToSingleSampledInfoEXT(MemorySegment segment) implements IPointer {
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

    public void pNext(IPointer pointer) {
        pNext(pointer.segment());
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

    public static VkMultisampledRenderToSingleSampledInfoEXT clone(Arena arena, VkMultisampledRenderToSingleSampledInfoEXT src) {
        VkMultisampledRenderToSingleSampledInfoEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkMultisampledRenderToSingleSampledInfoEXT[] clone(Arena arena, VkMultisampledRenderToSingleSampledInfoEXT[] src) {
        VkMultisampledRenderToSingleSampledInfoEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

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
}
