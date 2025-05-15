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

public record VkPhysicalDeviceMapMemoryPlacedFeaturesEXT(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$memoryMapPlaced = ValueLayout.JAVA_INT.withName("memoryMapPlaced");
    public static final OfInt LAYOUT$memoryMapRangePlaced = ValueLayout.JAVA_INT.withName("memoryMapRangePlaced");
    public static final OfInt LAYOUT$memoryUnmapReserve = ValueLayout.JAVA_INT.withName("memoryUnmapReserve");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$memoryMapPlaced, LAYOUT$memoryMapRangePlaced, LAYOUT$memoryUnmapReserve);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkPhysicalDeviceMapMemoryPlacedFeaturesEXT allocate(Arena arena) {
        return new VkPhysicalDeviceMapMemoryPlacedFeaturesEXT(arena.allocate(LAYOUT));
    }

    public static VkPhysicalDeviceMapMemoryPlacedFeaturesEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceMapMemoryPlacedFeaturesEXT[] ret = new VkPhysicalDeviceMapMemoryPlacedFeaturesEXT[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPhysicalDeviceMapMemoryPlacedFeaturesEXT(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPhysicalDeviceMapMemoryPlacedFeaturesEXT clone(Arena arena, VkPhysicalDeviceMapMemoryPlacedFeaturesEXT src) {
        VkPhysicalDeviceMapMemoryPlacedFeaturesEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceMapMemoryPlacedFeaturesEXT[] clone(Arena arena, VkPhysicalDeviceMapMemoryPlacedFeaturesEXT[] src) {
        VkPhysicalDeviceMapMemoryPlacedFeaturesEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$memoryMapPlaced = PathElement.groupElement("PATH$memoryMapPlaced");
    public static final PathElement PATH$memoryMapRangePlaced = PathElement.groupElement("PATH$memoryMapRangePlaced");
    public static final PathElement PATH$memoryUnmapReserve = PathElement.groupElement("PATH$memoryUnmapReserve");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$memoryMapPlaced = LAYOUT$memoryMapPlaced.byteSize();
    public static final long SIZE$memoryMapRangePlaced = LAYOUT$memoryMapRangePlaced.byteSize();
    public static final long SIZE$memoryUnmapReserve = LAYOUT$memoryUnmapReserve.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$memoryMapPlaced = LAYOUT.byteOffset(PATH$memoryMapPlaced);
    public static final long OFFSET$memoryMapRangePlaced = LAYOUT.byteOffset(PATH$memoryMapRangePlaced);
    public static final long OFFSET$memoryUnmapReserve = LAYOUT.byteOffset(PATH$memoryUnmapReserve);

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

}
/// dummy, not implemented yet
