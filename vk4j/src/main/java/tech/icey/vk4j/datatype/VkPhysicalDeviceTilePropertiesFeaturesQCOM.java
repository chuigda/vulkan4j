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
import static tech.icey.vk4j.enumtype.VkStructureType.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TILE_PROPERTIES_FEATURES_QCOM;

/// {@snippet lang=c :
/// typedef struct VkPhysicalDeviceTilePropertiesFeaturesQCOM {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 tileProperties;
/// } VkPhysicalDeviceTilePropertiesFeaturesQCOM;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkPhysicalDeviceTilePropertiesFeaturesQCOM.html">VkPhysicalDeviceTilePropertiesFeaturesQCOM</a>
public record VkPhysicalDeviceTilePropertiesFeaturesQCOM(MemorySegment segment) implements IPointer {
    public VkPhysicalDeviceTilePropertiesFeaturesQCOM(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TILE_PROPERTIES_FEATURES_QCOM);
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

    public @unsigned int tileProperties() {
        return segment.get(LAYOUT$tileProperties, OFFSET$tileProperties);
    }

    public void tileProperties(@unsigned int value) {
        segment.set(LAYOUT$tileProperties, OFFSET$tileProperties, value);
    }

    public static VkPhysicalDeviceTilePropertiesFeaturesQCOM allocate(Arena arena) {
        return new VkPhysicalDeviceTilePropertiesFeaturesQCOM(arena.allocate(LAYOUT));
    }

    public static VkPhysicalDeviceTilePropertiesFeaturesQCOM[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceTilePropertiesFeaturesQCOM[] ret = new VkPhysicalDeviceTilePropertiesFeaturesQCOM[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkPhysicalDeviceTilePropertiesFeaturesQCOM(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPhysicalDeviceTilePropertiesFeaturesQCOM clone(Arena arena, VkPhysicalDeviceTilePropertiesFeaturesQCOM src) {
        VkPhysicalDeviceTilePropertiesFeaturesQCOM ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceTilePropertiesFeaturesQCOM[] clone(Arena arena, VkPhysicalDeviceTilePropertiesFeaturesQCOM[] src) {
        VkPhysicalDeviceTilePropertiesFeaturesQCOM[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("tileProperties")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$tileProperties = PathElement.groupElement("tileProperties");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$tileProperties = (OfInt) LAYOUT.select(PATH$tileProperties);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$tileProperties = LAYOUT.byteOffset(PATH$tileProperties);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$tileProperties = LAYOUT$tileProperties.byteSize();
}
