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
import static tech.icey.vk4j.enumtype.VkStructureType.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RGBA10X6_FORMATS_FEATURES_EXT;

/// {@snippet lang=c :
/// typedef struct VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 formatRgba10x6WithoutYCbCrSampler;
/// } VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT.html">VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT</a>
public record VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT(MemorySegment segment) implements IPointer {
    public VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RGBA10X6_FORMATS_FEATURES_EXT);
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

    public @unsigned int formatRgba10x6WithoutYCbCrSampler() {
        return segment.get(LAYOUT$formatRgba10x6WithoutYCbCrSampler, OFFSET$formatRgba10x6WithoutYCbCrSampler);
    }

    public void formatRgba10x6WithoutYCbCrSampler(@unsigned int value) {
        segment.set(LAYOUT$formatRgba10x6WithoutYCbCrSampler, OFFSET$formatRgba10x6WithoutYCbCrSampler, value);
    }

    public static VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT allocate(Arena arena) {
        return new VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT(arena.allocate(LAYOUT));
    }

    public static VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT[] ret = new VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT clone(Arena arena, VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT src) {
        VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT[] clone(Arena arena, VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT[] src) {
        VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("formatRgba10x6WithoutYCbCrSampler")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$formatRgba10x6WithoutYCbCrSampler = PathElement.groupElement("formatRgba10x6WithoutYCbCrSampler");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$formatRgba10x6WithoutYCbCrSampler = (OfInt) LAYOUT.select(PATH$formatRgba10x6WithoutYCbCrSampler);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$formatRgba10x6WithoutYCbCrSampler = LAYOUT.byteOffset(PATH$formatRgba10x6WithoutYCbCrSampler);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$formatRgba10x6WithoutYCbCrSampler = LAYOUT$formatRgba10x6WithoutYCbCrSampler.byteSize();
}
