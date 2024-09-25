package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.annotation.*;
import tech.icey.vk4j.array.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import tech.icey.vk4j.ptr.*;
import tech.icey.vk4j.NativeLayout;
import tech.icey.vk4j.IFactory;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

public record VkPhysicalDeviceMapMemoryPlacedFeaturesEXT(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("memoryMapPlaced"),
        ValueLayout.JAVA_INT.withName("memoryMapRangePlaced"),
        ValueLayout.JAVA_INT.withName("memoryUnmapReserve")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$memoryMapPlaced = PathElement.groupElement("memoryMapPlaced");
    public static final PathElement PATH$memoryMapRangePlaced = PathElement.groupElement("memoryMapRangePlaced");
    public static final PathElement PATH$memoryUnmapReserve = PathElement.groupElement("memoryUnmapReserve");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$memoryMapPlaced = (OfInt) LAYOUT.select(PATH$memoryMapPlaced);
    public static final OfInt LAYOUT$memoryMapRangePlaced = (OfInt) LAYOUT.select(PATH$memoryMapRangePlaced);
    public static final OfInt LAYOUT$memoryUnmapReserve = (OfInt) LAYOUT.select(PATH$memoryUnmapReserve);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$memoryMapPlaced = LAYOUT.byteOffset(PATH$memoryMapPlaced);
    public static final long OFFSET$memoryMapRangePlaced = LAYOUT.byteOffset(PATH$memoryMapRangePlaced);
    public static final long OFFSET$memoryUnmapReserve = LAYOUT.byteOffset(PATH$memoryUnmapReserve);

    public VkPhysicalDeviceMapMemoryPlacedFeaturesEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAP_MEMORY_PLACED_FEATURES_EXT);
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

    public @unsigned int memoryMapPlaced() {
        return segment.get(LAYOUT$memoryMapPlaced, OFFSET$memoryMapPlaced);
    }

    public void memoryMapPlaced(@unsigned int value) {
        segment.set(LAYOUT$memoryMapPlaced, OFFSET$memoryMapPlaced, value);
    }

    public @unsigned int memoryMapRangePlaced() {
        return segment.get(LAYOUT$memoryMapRangePlaced, OFFSET$memoryMapRangePlaced);
    }

    public void memoryMapRangePlaced(@unsigned int value) {
        segment.set(LAYOUT$memoryMapRangePlaced, OFFSET$memoryMapRangePlaced, value);
    }

    public @unsigned int memoryUnmapReserve() {
        return segment.get(LAYOUT$memoryUnmapReserve, OFFSET$memoryUnmapReserve);
    }

    public void memoryUnmapReserve(@unsigned int value) {
        segment.set(LAYOUT$memoryUnmapReserve, OFFSET$memoryUnmapReserve, value);
    }


    public static final class Factory implements IFactory<VkPhysicalDeviceMapMemoryPlacedFeaturesEXT> {
        @Override
        public Class<VkPhysicalDeviceMapMemoryPlacedFeaturesEXT> clazz() {
            return VkPhysicalDeviceMapMemoryPlacedFeaturesEXT.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkPhysicalDeviceMapMemoryPlacedFeaturesEXT.LAYOUT;
        }

        @Override
        public VkPhysicalDeviceMapMemoryPlacedFeaturesEXT create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkPhysicalDeviceMapMemoryPlacedFeaturesEXT createUninit(MemorySegment segment) {
            return new VkPhysicalDeviceMapMemoryPlacedFeaturesEXT(segment);
        }
    }

    public static final Factory FACTORY = new Factory();
}
