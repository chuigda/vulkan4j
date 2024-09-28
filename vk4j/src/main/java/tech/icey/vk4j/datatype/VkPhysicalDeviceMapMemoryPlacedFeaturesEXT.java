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

public record VkPhysicalDeviceMapMemoryPlacedFeaturesEXT(MemorySegment segment) implements IPointer {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("memoryMapPlaced"),
        ValueLayout.JAVA_INT.withName("memoryMapRangePlaced"),
        ValueLayout.JAVA_INT.withName("memoryUnmapReserve")
    );
    public static final long SIZE = LAYOUT.byteSize();

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

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$memoryMapPlaced = LAYOUT$memoryMapPlaced.byteSize();
    public static final long SIZE$memoryMapRangePlaced = LAYOUT$memoryMapRangePlaced.byteSize();
    public static final long SIZE$memoryUnmapReserve = LAYOUT$memoryUnmapReserve.byteSize();

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

    public static VkPhysicalDeviceMapMemoryPlacedFeaturesEXT allocate(Arena arena) {
        return new VkPhysicalDeviceMapMemoryPlacedFeaturesEXT(arena.allocate(LAYOUT));
    }
    
    public static VkPhysicalDeviceMapMemoryPlacedFeaturesEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceMapMemoryPlacedFeaturesEXT[] ret = new VkPhysicalDeviceMapMemoryPlacedFeaturesEXT[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkPhysicalDeviceMapMemoryPlacedFeaturesEXT(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
}
