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
import static tech.icey.vk4j.enumtype.VkStructureType.VK_STRUCTURE_TYPE_FILTER_CUBIC_IMAGE_VIEW_IMAGE_FORMAT_PROPERTIES_EXT;

/// {@snippet lang=c :
/// typedef struct VkFilterCubicImageViewImageFormatPropertiesEXT {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 filterCubic;
///     VkBool32 filterCubicMinmax;
/// } VkFilterCubicImageViewImageFormatPropertiesEXT;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkFilterCubicImageViewImageFormatPropertiesEXT.html">VkFilterCubicImageViewImageFormatPropertiesEXT</a>
public record VkFilterCubicImageViewImageFormatPropertiesEXT(MemorySegment segment) implements IPointer {
    public VkFilterCubicImageViewImageFormatPropertiesEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_FILTER_CUBIC_IMAGE_VIEW_IMAGE_FORMAT_PROPERTIES_EXT);
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

    public @unsigned int filterCubic() {
        return segment.get(LAYOUT$filterCubic, OFFSET$filterCubic);
    }

    public void filterCubic(@unsigned int value) {
        segment.set(LAYOUT$filterCubic, OFFSET$filterCubic, value);
    }

    public @unsigned int filterCubicMinmax() {
        return segment.get(LAYOUT$filterCubicMinmax, OFFSET$filterCubicMinmax);
    }

    public void filterCubicMinmax(@unsigned int value) {
        segment.set(LAYOUT$filterCubicMinmax, OFFSET$filterCubicMinmax, value);
    }

    public static VkFilterCubicImageViewImageFormatPropertiesEXT allocate(Arena arena) {
        return new VkFilterCubicImageViewImageFormatPropertiesEXT(arena.allocate(LAYOUT));
    }

    public static VkFilterCubicImageViewImageFormatPropertiesEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkFilterCubicImageViewImageFormatPropertiesEXT[] ret = new VkFilterCubicImageViewImageFormatPropertiesEXT[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkFilterCubicImageViewImageFormatPropertiesEXT(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkFilterCubicImageViewImageFormatPropertiesEXT clone(Arena arena, VkFilterCubicImageViewImageFormatPropertiesEXT src) {
        VkFilterCubicImageViewImageFormatPropertiesEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkFilterCubicImageViewImageFormatPropertiesEXT[] clone(Arena arena, VkFilterCubicImageViewImageFormatPropertiesEXT[] src) {
        VkFilterCubicImageViewImageFormatPropertiesEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("filterCubic"),
        ValueLayout.JAVA_INT.withName("filterCubicMinmax")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$filterCubic = PathElement.groupElement("filterCubic");
    public static final PathElement PATH$filterCubicMinmax = PathElement.groupElement("filterCubicMinmax");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$filterCubic = (OfInt) LAYOUT.select(PATH$filterCubic);
    public static final OfInt LAYOUT$filterCubicMinmax = (OfInt) LAYOUT.select(PATH$filterCubicMinmax);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$filterCubic = LAYOUT.byteOffset(PATH$filterCubic);
    public static final long OFFSET$filterCubicMinmax = LAYOUT.byteOffset(PATH$filterCubicMinmax);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$filterCubic = LAYOUT$filterCubic.byteSize();
    public static final long SIZE$filterCubicMinmax = LAYOUT$filterCubicMinmax.byteSize();
}
