package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

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
/// typedef struct VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 imageSlicedViewOf3D;
/// } VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT.html">VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT</a>
public record VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT(MemorySegment segment) implements IPointer {
    public VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_SLICED_VIEW_OF_3D_FEATURES_EXT);
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

    public void pNext(@nullable IPointer pointer) {
        pNext(pointer == null ? MemorySegment.NULL : pointer.segment());
    }

    public @unsigned int imageSlicedViewOf3D() {
        return segment.get(LAYOUT$imageSlicedViewOf3D, OFFSET$imageSlicedViewOf3D);
    }

    public void imageSlicedViewOf3D(@unsigned int value) {
        segment.set(LAYOUT$imageSlicedViewOf3D, OFFSET$imageSlicedViewOf3D, value);
    }

    public static VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT allocate(Arena arena) {
        return new VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT(arena.allocate(LAYOUT));
    }

    public static VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT[] ret = new VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT clone(Arena arena, VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT src) {
        VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT[] clone(Arena arena, VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT[] src) {
        VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("imageSlicedViewOf3D")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$imageSlicedViewOf3D = PathElement.groupElement("imageSlicedViewOf3D");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$imageSlicedViewOf3D = (OfInt) LAYOUT.select(PATH$imageSlicedViewOf3D);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$imageSlicedViewOf3D = LAYOUT.byteOffset(PATH$imageSlicedViewOf3D);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$imageSlicedViewOf3D = LAYOUT$imageSlicedViewOf3D.byteSize();
}
