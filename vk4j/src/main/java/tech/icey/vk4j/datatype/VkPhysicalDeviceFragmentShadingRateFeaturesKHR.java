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

/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkPhysicalDeviceFragmentShadingRateFeaturesKHR.html">VkPhysicalDeviceFragmentShadingRateFeaturesKHR</a>
public record VkPhysicalDeviceFragmentShadingRateFeaturesKHR(MemorySegment segment) implements IPointer {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("pipelineFragmentShadingRate"),
        ValueLayout.JAVA_INT.withName("primitiveFragmentShadingRate"),
        ValueLayout.JAVA_INT.withName("attachmentFragmentShadingRate")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$pipelineFragmentShadingRate = PathElement.groupElement("pipelineFragmentShadingRate");
    public static final PathElement PATH$primitiveFragmentShadingRate = PathElement.groupElement("primitiveFragmentShadingRate");
    public static final PathElement PATH$attachmentFragmentShadingRate = PathElement.groupElement("attachmentFragmentShadingRate");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$pipelineFragmentShadingRate = (OfInt) LAYOUT.select(PATH$pipelineFragmentShadingRate);
    public static final OfInt LAYOUT$primitiveFragmentShadingRate = (OfInt) LAYOUT.select(PATH$primitiveFragmentShadingRate);
    public static final OfInt LAYOUT$attachmentFragmentShadingRate = (OfInt) LAYOUT.select(PATH$attachmentFragmentShadingRate);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$pipelineFragmentShadingRate = LAYOUT.byteOffset(PATH$pipelineFragmentShadingRate);
    public static final long OFFSET$primitiveFragmentShadingRate = LAYOUT.byteOffset(PATH$primitiveFragmentShadingRate);
    public static final long OFFSET$attachmentFragmentShadingRate = LAYOUT.byteOffset(PATH$attachmentFragmentShadingRate);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$pipelineFragmentShadingRate = LAYOUT$pipelineFragmentShadingRate.byteSize();
    public static final long SIZE$primitiveFragmentShadingRate = LAYOUT$primitiveFragmentShadingRate.byteSize();
    public static final long SIZE$attachmentFragmentShadingRate = LAYOUT$attachmentFragmentShadingRate.byteSize();

    public VkPhysicalDeviceFragmentShadingRateFeaturesKHR(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADING_RATE_FEATURES_KHR);
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

    public @unsigned int pipelineFragmentShadingRate() {
        return segment.get(LAYOUT$pipelineFragmentShadingRate, OFFSET$pipelineFragmentShadingRate);
    }

    public void pipelineFragmentShadingRate(@unsigned int value) {
        segment.set(LAYOUT$pipelineFragmentShadingRate, OFFSET$pipelineFragmentShadingRate, value);
    }

    public @unsigned int primitiveFragmentShadingRate() {
        return segment.get(LAYOUT$primitiveFragmentShadingRate, OFFSET$primitiveFragmentShadingRate);
    }

    public void primitiveFragmentShadingRate(@unsigned int value) {
        segment.set(LAYOUT$primitiveFragmentShadingRate, OFFSET$primitiveFragmentShadingRate, value);
    }

    public @unsigned int attachmentFragmentShadingRate() {
        return segment.get(LAYOUT$attachmentFragmentShadingRate, OFFSET$attachmentFragmentShadingRate);
    }

    public void attachmentFragmentShadingRate(@unsigned int value) {
        segment.set(LAYOUT$attachmentFragmentShadingRate, OFFSET$attachmentFragmentShadingRate, value);
    }

    public static VkPhysicalDeviceFragmentShadingRateFeaturesKHR allocate(Arena arena) {
        return new VkPhysicalDeviceFragmentShadingRateFeaturesKHR(arena.allocate(LAYOUT));
    }
    
    public static VkPhysicalDeviceFragmentShadingRateFeaturesKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceFragmentShadingRateFeaturesKHR[] ret = new VkPhysicalDeviceFragmentShadingRateFeaturesKHR[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkPhysicalDeviceFragmentShadingRateFeaturesKHR(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
}
