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

public record VkPhysicalDeviceImageProcessingFeaturesQCOM(MemorySegment segment) implements IPointer {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("textureSampleWeighted"),
        ValueLayout.JAVA_INT.withName("textureBoxFilter"),
        ValueLayout.JAVA_INT.withName("textureBlockMatch")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$textureSampleWeighted = PathElement.groupElement("textureSampleWeighted");
    public static final PathElement PATH$textureBoxFilter = PathElement.groupElement("textureBoxFilter");
    public static final PathElement PATH$textureBlockMatch = PathElement.groupElement("textureBlockMatch");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$textureSampleWeighted = (OfInt) LAYOUT.select(PATH$textureSampleWeighted);
    public static final OfInt LAYOUT$textureBoxFilter = (OfInt) LAYOUT.select(PATH$textureBoxFilter);
    public static final OfInt LAYOUT$textureBlockMatch = (OfInt) LAYOUT.select(PATH$textureBlockMatch);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$textureSampleWeighted = LAYOUT.byteOffset(PATH$textureSampleWeighted);
    public static final long OFFSET$textureBoxFilter = LAYOUT.byteOffset(PATH$textureBoxFilter);
    public static final long OFFSET$textureBlockMatch = LAYOUT.byteOffset(PATH$textureBlockMatch);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$textureSampleWeighted = LAYOUT$textureSampleWeighted.byteSize();
    public static final long SIZE$textureBoxFilter = LAYOUT$textureBoxFilter.byteSize();
    public static final long SIZE$textureBlockMatch = LAYOUT$textureBlockMatch.byteSize();

    public VkPhysicalDeviceImageProcessingFeaturesQCOM(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_PROCESSING_FEATURES_QCOM);
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

    public @unsigned int textureSampleWeighted() {
        return segment.get(LAYOUT$textureSampleWeighted, OFFSET$textureSampleWeighted);
    }

    public void textureSampleWeighted(@unsigned int value) {
        segment.set(LAYOUT$textureSampleWeighted, OFFSET$textureSampleWeighted, value);
    }

    public @unsigned int textureBoxFilter() {
        return segment.get(LAYOUT$textureBoxFilter, OFFSET$textureBoxFilter);
    }

    public void textureBoxFilter(@unsigned int value) {
        segment.set(LAYOUT$textureBoxFilter, OFFSET$textureBoxFilter, value);
    }

    public @unsigned int textureBlockMatch() {
        return segment.get(LAYOUT$textureBlockMatch, OFFSET$textureBlockMatch);
    }

    public void textureBlockMatch(@unsigned int value) {
        segment.set(LAYOUT$textureBlockMatch, OFFSET$textureBlockMatch, value);
    }

    public static VkPhysicalDeviceImageProcessingFeaturesQCOM allocate(Arena arena) {
        return new VkPhysicalDeviceImageProcessingFeaturesQCOM(arena.allocate(LAYOUT));
    }
    
    public static VkPhysicalDeviceImageProcessingFeaturesQCOM[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceImageProcessingFeaturesQCOM[] ret = new VkPhysicalDeviceImageProcessingFeaturesQCOM[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkPhysicalDeviceImageProcessingFeaturesQCOM(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
}
