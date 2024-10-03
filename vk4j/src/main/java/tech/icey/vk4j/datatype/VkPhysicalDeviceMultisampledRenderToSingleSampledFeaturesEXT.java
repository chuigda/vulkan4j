package tech.icey.vk4j.datatype;

import tech.icey.panama.IPointer;
import tech.icey.panama.NativeLayout;
import tech.icey.panama.annotation.enumtype;
import tech.icey.panama.annotation.pointer;
import tech.icey.panama.annotation.unsigned;
import tech.icey.vk4j.enumtype.VkStructureType;

import java.lang.foreign.*;

import static java.lang.foreign.ValueLayout.OfInt;
import static java.lang.foreign.ValueLayout.PathElement;
import static tech.icey.vk4j.enumtype.VkStructureType.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MULTISAMPLED_RENDER_TO_SINGLE_SAMPLED_FEATURES_EXT;

/// {@snippet lang=c :
/// typedef struct VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 multisampledRenderToSingleSampled;
/// } VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT.html">VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT</a>
public record VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT(MemorySegment segment) implements IPointer {
    public VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MULTISAMPLED_RENDER_TO_SINGLE_SAMPLED_FEATURES_EXT);
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

    public @unsigned int multisampledRenderToSingleSampled() {
        return segment.get(LAYOUT$multisampledRenderToSingleSampled, OFFSET$multisampledRenderToSingleSampled);
    }

    public void multisampledRenderToSingleSampled(@unsigned int value) {
        segment.set(LAYOUT$multisampledRenderToSingleSampled, OFFSET$multisampledRenderToSingleSampled, value);
    }

    public static VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT allocate(Arena arena) {
        return new VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT(arena.allocate(LAYOUT));
    }

    public static VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT[] ret = new VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT clone(Arena arena, VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT src) {
        VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT[] clone(Arena arena, VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT[] src) {
        VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("multisampledRenderToSingleSampled")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$multisampledRenderToSingleSampled = PathElement.groupElement("multisampledRenderToSingleSampled");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$multisampledRenderToSingleSampled = (OfInt) LAYOUT.select(PATH$multisampledRenderToSingleSampled);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$multisampledRenderToSingleSampled = LAYOUT.byteOffset(PATH$multisampledRenderToSingleSampled);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$multisampledRenderToSingleSampled = LAYOUT$multisampledRenderToSingleSampled.byteSize();
}
