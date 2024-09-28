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

public record VkPhysicalDeviceShadingRateImageFeaturesNV(MemorySegment segment) implements IPointer {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("shadingRateImage"),
        ValueLayout.JAVA_INT.withName("shadingRateCoarseSampleOrder")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$shadingRateImage = PathElement.groupElement("shadingRateImage");
    public static final PathElement PATH$shadingRateCoarseSampleOrder = PathElement.groupElement("shadingRateCoarseSampleOrder");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$shadingRateImage = (OfInt) LAYOUT.select(PATH$shadingRateImage);
    public static final OfInt LAYOUT$shadingRateCoarseSampleOrder = (OfInt) LAYOUT.select(PATH$shadingRateCoarseSampleOrder);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$shadingRateImage = LAYOUT.byteOffset(PATH$shadingRateImage);
    public static final long OFFSET$shadingRateCoarseSampleOrder = LAYOUT.byteOffset(PATH$shadingRateCoarseSampleOrder);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$shadingRateImage = LAYOUT$shadingRateImage.byteSize();
    public static final long SIZE$shadingRateCoarseSampleOrder = LAYOUT$shadingRateCoarseSampleOrder.byteSize();

    public VkPhysicalDeviceShadingRateImageFeaturesNV(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADING_RATE_IMAGE_FEATURES_NV);
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

    public @unsigned int shadingRateImage() {
        return segment.get(LAYOUT$shadingRateImage, OFFSET$shadingRateImage);
    }

    public void shadingRateImage(@unsigned int value) {
        segment.set(LAYOUT$shadingRateImage, OFFSET$shadingRateImage, value);
    }

    public @unsigned int shadingRateCoarseSampleOrder() {
        return segment.get(LAYOUT$shadingRateCoarseSampleOrder, OFFSET$shadingRateCoarseSampleOrder);
    }

    public void shadingRateCoarseSampleOrder(@unsigned int value) {
        segment.set(LAYOUT$shadingRateCoarseSampleOrder, OFFSET$shadingRateCoarseSampleOrder, value);
    }

    public static VkPhysicalDeviceShadingRateImageFeaturesNV allocate(Arena arena) {
        return new VkPhysicalDeviceShadingRateImageFeaturesNV(arena.allocate(LAYOUT));
    }
    
    public static VkPhysicalDeviceShadingRateImageFeaturesNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceShadingRateImageFeaturesNV[] ret = new VkPhysicalDeviceShadingRateImageFeaturesNV[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkPhysicalDeviceShadingRateImageFeaturesNV(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
}
