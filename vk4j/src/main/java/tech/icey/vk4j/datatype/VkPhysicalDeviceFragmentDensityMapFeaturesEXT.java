package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import org.jetbrains.annotations.Nullable;
import tech.icey.panama.IPointer;
import tech.icey.panama.NativeLayout;
import tech.icey.panama.annotation.*;
import tech.icey.panama.buffer.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

/// {@snippet lang=c :
/// typedef struct VkPhysicalDeviceFragmentDensityMapFeaturesEXT {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 fragmentDensityMap;
///     VkBool32 fragmentDensityMapDynamic;
///     VkBool32 fragmentDensityMapNonSubsampledImages;
/// } VkPhysicalDeviceFragmentDensityMapFeaturesEXT;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkPhysicalDeviceFragmentDensityMapFeaturesEXT.html">VkPhysicalDeviceFragmentDensityMapFeaturesEXT</a>
public record VkPhysicalDeviceFragmentDensityMapFeaturesEXT(MemorySegment segment) implements IPointer {
    public VkPhysicalDeviceFragmentDensityMapFeaturesEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_FEATURES_EXT);
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

    public void pNext(@Nullable IPointer pointer) {
        pNext(pointer == null ? MemorySegment.NULL : pointer.segment());
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

    public static VkPhysicalDeviceFragmentDensityMapFeaturesEXT allocate(Arena arena) {
        return new VkPhysicalDeviceFragmentDensityMapFeaturesEXT(arena.allocate(LAYOUT));
    }

    public static VkPhysicalDeviceFragmentDensityMapFeaturesEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceFragmentDensityMapFeaturesEXT[] ret = new VkPhysicalDeviceFragmentDensityMapFeaturesEXT[count];
        for (int i = 0; i < count; i++) {
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
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("fragmentDensityMap"),
        ValueLayout.JAVA_INT.withName("fragmentDensityMapDynamic"),
        ValueLayout.JAVA_INT.withName("fragmentDensityMapNonSubsampledImages")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$fragmentDensityMap = PathElement.groupElement("fragmentDensityMap");
    public static final PathElement PATH$fragmentDensityMapDynamic = PathElement.groupElement("fragmentDensityMapDynamic");
    public static final PathElement PATH$fragmentDensityMapNonSubsampledImages = PathElement.groupElement("fragmentDensityMapNonSubsampledImages");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$fragmentDensityMap = (OfInt) LAYOUT.select(PATH$fragmentDensityMap);
    public static final OfInt LAYOUT$fragmentDensityMapDynamic = (OfInt) LAYOUT.select(PATH$fragmentDensityMapDynamic);
    public static final OfInt LAYOUT$fragmentDensityMapNonSubsampledImages = (OfInt) LAYOUT.select(PATH$fragmentDensityMapNonSubsampledImages);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$fragmentDensityMap = LAYOUT.byteOffset(PATH$fragmentDensityMap);
    public static final long OFFSET$fragmentDensityMapDynamic = LAYOUT.byteOffset(PATH$fragmentDensityMapDynamic);
    public static final long OFFSET$fragmentDensityMapNonSubsampledImages = LAYOUT.byteOffset(PATH$fragmentDensityMapNonSubsampledImages);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$fragmentDensityMap = LAYOUT$fragmentDensityMap.byteSize();
    public static final long SIZE$fragmentDensityMapDynamic = LAYOUT$fragmentDensityMapDynamic.byteSize();
    public static final long SIZE$fragmentDensityMapNonSubsampledImages = LAYOUT$fragmentDensityMapNonSubsampledImages.byteSize();
}
