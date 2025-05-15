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

public record VkPhysicalDeviceTileShadingPropertiesQCOM(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$maxApronSize = ValueLayout.JAVA_INT.withName("maxApronSize");
    public static final OfInt LAYOUT$preferNonCoherent = ValueLayout.JAVA_INT.withName("preferNonCoherent");
    public static final StructLayout LAYOUT$tileGranularity = VkExtent2D.LAYOUT.withName("tileGranularity");
    public static final StructLayout LAYOUT$maxTileShadingRate = VkExtent2D.LAYOUT.withName("maxTileShadingRate");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$maxApronSize, LAYOUT$preferNonCoherent, LAYOUT$tileGranularity, LAYOUT$maxTileShadingRate);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkPhysicalDeviceTileShadingPropertiesQCOM allocate(Arena arena) {
        return new VkPhysicalDeviceTileShadingPropertiesQCOM(arena.allocate(LAYOUT));
    }

    public static VkPhysicalDeviceTileShadingPropertiesQCOM[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceTileShadingPropertiesQCOM[] ret = new VkPhysicalDeviceTileShadingPropertiesQCOM[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPhysicalDeviceTileShadingPropertiesQCOM(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPhysicalDeviceTileShadingPropertiesQCOM clone(Arena arena, VkPhysicalDeviceTileShadingPropertiesQCOM src) {
        VkPhysicalDeviceTileShadingPropertiesQCOM ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceTileShadingPropertiesQCOM[] clone(Arena arena, VkPhysicalDeviceTileShadingPropertiesQCOM[] src) {
        VkPhysicalDeviceTileShadingPropertiesQCOM[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$maxApronSize = PathElement.groupElement("PATH$maxApronSize");
    public static final PathElement PATH$preferNonCoherent = PathElement.groupElement("PATH$preferNonCoherent");
    public static final PathElement PATH$tileGranularity = PathElement.groupElement("PATH$tileGranularity");
    public static final PathElement PATH$maxTileShadingRate = PathElement.groupElement("PATH$maxTileShadingRate");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$maxApronSize = LAYOUT$maxApronSize.byteSize();
    public static final long SIZE$preferNonCoherent = LAYOUT$preferNonCoherent.byteSize();
    public static final long SIZE$tileGranularity = LAYOUT$tileGranularity.byteSize();
    public static final long SIZE$maxTileShadingRate = LAYOUT$maxTileShadingRate.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$maxApronSize = LAYOUT.byteOffset(PATH$maxApronSize);
    public static final long OFFSET$preferNonCoherent = LAYOUT.byteOffset(PATH$preferNonCoherent);
    public static final long OFFSET$tileGranularity = LAYOUT.byteOffset(PATH$tileGranularity);
    public static final long OFFSET$maxTileShadingRate = LAYOUT.byteOffset(PATH$maxTileShadingRate);

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

    public @unsigned int maxApronSize() {
        return segment.get(LAYOUT$maxApronSize, OFFSET$maxApronSize);
    }

    public void maxApronSize(@unsigned int value) {
        segment.set(LAYOUT$maxApronSize, OFFSET$maxApronSize, value);
    }

    public @unsigned int preferNonCoherent() {
        return segment.get(LAYOUT$preferNonCoherent, OFFSET$preferNonCoherent);
    }

    public void preferNonCoherent(@unsigned int value) {
        segment.set(LAYOUT$preferNonCoherent, OFFSET$preferNonCoherent, value);
    }

    public VkExtent2D tileGranularity() {
        return new VkExtent2D(segment.asSlice(OFFSET$tileGranularity, LAYOUT$tileGranularity));
    }

    public void tileGranularity(VkExtent2D value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$tileGranularity, SIZE$tileGranularity);
    }

    public VkExtent2D maxTileShadingRate() {
        return new VkExtent2D(segment.asSlice(OFFSET$maxTileShadingRate, LAYOUT$maxTileShadingRate));
    }

    public void maxTileShadingRate(VkExtent2D value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$maxTileShadingRate, SIZE$maxTileShadingRate);
    }

}
/// dummy, not implemented yet
