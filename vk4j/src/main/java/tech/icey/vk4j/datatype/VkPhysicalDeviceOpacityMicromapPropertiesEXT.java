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
import static tech.icey.vk4j.enumtype.VkStructureType.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_OPACITY_MICROMAP_PROPERTIES_EXT;

/// {@snippet lang=c :
/// typedef struct VkPhysicalDeviceOpacityMicromapPropertiesEXT {
///     VkStructureType sType;
///     void* pNext;
///     uint32_t maxOpacity2StateSubdivisionLevel;
///     uint32_t maxOpacity4StateSubdivisionLevel;
/// } VkPhysicalDeviceOpacityMicromapPropertiesEXT;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkPhysicalDeviceOpacityMicromapPropertiesEXT.html">VkPhysicalDeviceOpacityMicromapPropertiesEXT</a>
public record VkPhysicalDeviceOpacityMicromapPropertiesEXT(MemorySegment segment) implements IPointer {
    public VkPhysicalDeviceOpacityMicromapPropertiesEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_OPACITY_MICROMAP_PROPERTIES_EXT);
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

    public @unsigned int maxOpacity2StateSubdivisionLevel() {
        return segment.get(LAYOUT$maxOpacity2StateSubdivisionLevel, OFFSET$maxOpacity2StateSubdivisionLevel);
    }

    public void maxOpacity2StateSubdivisionLevel(@unsigned int value) {
        segment.set(LAYOUT$maxOpacity2StateSubdivisionLevel, OFFSET$maxOpacity2StateSubdivisionLevel, value);
    }

    public @unsigned int maxOpacity4StateSubdivisionLevel() {
        return segment.get(LAYOUT$maxOpacity4StateSubdivisionLevel, OFFSET$maxOpacity4StateSubdivisionLevel);
    }

    public void maxOpacity4StateSubdivisionLevel(@unsigned int value) {
        segment.set(LAYOUT$maxOpacity4StateSubdivisionLevel, OFFSET$maxOpacity4StateSubdivisionLevel, value);
    }

    public static VkPhysicalDeviceOpacityMicromapPropertiesEXT allocate(Arena arena) {
        return new VkPhysicalDeviceOpacityMicromapPropertiesEXT(arena.allocate(LAYOUT));
    }

    public static VkPhysicalDeviceOpacityMicromapPropertiesEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceOpacityMicromapPropertiesEXT[] ret = new VkPhysicalDeviceOpacityMicromapPropertiesEXT[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkPhysicalDeviceOpacityMicromapPropertiesEXT(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPhysicalDeviceOpacityMicromapPropertiesEXT clone(Arena arena, VkPhysicalDeviceOpacityMicromapPropertiesEXT src) {
        VkPhysicalDeviceOpacityMicromapPropertiesEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceOpacityMicromapPropertiesEXT[] clone(Arena arena, VkPhysicalDeviceOpacityMicromapPropertiesEXT[] src) {
        VkPhysicalDeviceOpacityMicromapPropertiesEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("maxOpacity2StateSubdivisionLevel"),
        ValueLayout.JAVA_INT.withName("maxOpacity4StateSubdivisionLevel")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$maxOpacity2StateSubdivisionLevel = PathElement.groupElement("maxOpacity2StateSubdivisionLevel");
    public static final PathElement PATH$maxOpacity4StateSubdivisionLevel = PathElement.groupElement("maxOpacity4StateSubdivisionLevel");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$maxOpacity2StateSubdivisionLevel = (OfInt) LAYOUT.select(PATH$maxOpacity2StateSubdivisionLevel);
    public static final OfInt LAYOUT$maxOpacity4StateSubdivisionLevel = (OfInt) LAYOUT.select(PATH$maxOpacity4StateSubdivisionLevel);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$maxOpacity2StateSubdivisionLevel = LAYOUT.byteOffset(PATH$maxOpacity2StateSubdivisionLevel);
    public static final long OFFSET$maxOpacity4StateSubdivisionLevel = LAYOUT.byteOffset(PATH$maxOpacity4StateSubdivisionLevel);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$maxOpacity2StateSubdivisionLevel = LAYOUT$maxOpacity2StateSubdivisionLevel.byteSize();
    public static final long SIZE$maxOpacity4StateSubdivisionLevel = LAYOUT$maxOpacity4StateSubdivisionLevel.byteSize();
}
