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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceFragmentDensityMapFeaturesEXT.html">VkPhysicalDeviceFragmentDensityMapFeaturesEXT</a>
@ValueBasedCandidate
public record VkPhysicalDeviceFragmentDensityMapFeaturesEXT(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$fragmentDensityMap = ValueLayout.JAVA_INT.withName("fragmentDensityMap");
    public static final OfInt LAYOUT$fragmentDensityMapDynamic = ValueLayout.JAVA_INT.withName("fragmentDensityMapDynamic");
    public static final OfInt LAYOUT$fragmentDensityMapNonSubsampledImages = ValueLayout.JAVA_INT.withName("fragmentDensityMapNonSubsampledImages");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$fragmentDensityMap, LAYOUT$fragmentDensityMapDynamic, LAYOUT$fragmentDensityMapNonSubsampledImages);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkPhysicalDeviceFragmentDensityMapFeaturesEXT allocate(Arena arena) {
        return new VkPhysicalDeviceFragmentDensityMapFeaturesEXT(arena.allocate(LAYOUT));
    }

    public static VkPhysicalDeviceFragmentDensityMapFeaturesEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceFragmentDensityMapFeaturesEXT[] ret = new VkPhysicalDeviceFragmentDensityMapFeaturesEXT[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPhysicalDeviceFragmentDensityMapFeaturesEXT(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPhysicalDeviceFragmentDensityMapFeaturesEXT clone(Arena arena, VkPhysicalDeviceFragmentDensityMapFeaturesEXT src) {
        VkPhysicalDeviceFragmentDensityMapFeaturesEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceFragmentDensityMapFeaturesEXT[] clone(Arena arena, VkPhysicalDeviceFragmentDensityMapFeaturesEXT[] src) {
        VkPhysicalDeviceFragmentDensityMapFeaturesEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$fragmentDensityMap = PathElement.groupElement("PATH$fragmentDensityMap");
    public static final PathElement PATH$fragmentDensityMapDynamic = PathElement.groupElement("PATH$fragmentDensityMapDynamic");
    public static final PathElement PATH$fragmentDensityMapNonSubsampledImages = PathElement.groupElement("PATH$fragmentDensityMapNonSubsampledImages");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$fragmentDensityMap = LAYOUT$fragmentDensityMap.byteSize();
    public static final long SIZE$fragmentDensityMapDynamic = LAYOUT$fragmentDensityMapDynamic.byteSize();
    public static final long SIZE$fragmentDensityMapNonSubsampledImages = LAYOUT$fragmentDensityMapNonSubsampledImages.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$fragmentDensityMap = LAYOUT.byteOffset(PATH$fragmentDensityMap);
    public static final long OFFSET$fragmentDensityMapDynamic = LAYOUT.byteOffset(PATH$fragmentDensityMapDynamic);
    public static final long OFFSET$fragmentDensityMapNonSubsampledImages = LAYOUT.byteOffset(PATH$fragmentDensityMapNonSubsampledImages);

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

    public @unsigned int fragmentDensityMap() {
        return segment.get(LAYOUT$fragmentDensityMap, OFFSET$fragmentDensityMap);
    }

    public void fragmentDensityMap(@unsigned int value) {
        segment.set(LAYOUT$fragmentDensityMap, OFFSET$fragmentDensityMap, value);
    }

    public @unsigned int fragmentDensityMapDynamic() {
        return segment.get(LAYOUT$fragmentDensityMapDynamic, OFFSET$fragmentDensityMapDynamic);
    }

    public void fragmentDensityMapDynamic(@unsigned int value) {
        segment.set(LAYOUT$fragmentDensityMapDynamic, OFFSET$fragmentDensityMapDynamic, value);
    }

    public @unsigned int fragmentDensityMapNonSubsampledImages() {
        return segment.get(LAYOUT$fragmentDensityMapNonSubsampledImages, OFFSET$fragmentDensityMapNonSubsampledImages);
    }

    public void fragmentDensityMapNonSubsampledImages(@unsigned int value) {
        segment.set(LAYOUT$fragmentDensityMapNonSubsampledImages, OFFSET$fragmentDensityMapNonSubsampledImages, value);
    }

}
