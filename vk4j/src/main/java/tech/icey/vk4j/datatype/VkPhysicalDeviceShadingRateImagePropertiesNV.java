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
import static tech.icey.vk4j.enumtype.VkStructureType.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADING_RATE_IMAGE_PROPERTIES_NV;

/// {@snippet lang=c :
/// typedef struct VkPhysicalDeviceShadingRateImagePropertiesNV {
///     VkStructureType sType;
///     void* pNext;
///     VkExtent2D shadingRateTexelSize;
///     uint32_t shadingRatePaletteSize;
///     uint32_t shadingRateMaxCoarseSamples;
/// } VkPhysicalDeviceShadingRateImagePropertiesNV;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkPhysicalDeviceShadingRateImagePropertiesNV.html">VkPhysicalDeviceShadingRateImagePropertiesNV</a>
public record VkPhysicalDeviceShadingRateImagePropertiesNV(MemorySegment segment) implements IPointer {
    public VkPhysicalDeviceShadingRateImagePropertiesNV(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADING_RATE_IMAGE_PROPERTIES_NV);
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

    public VkExtent2D shadingRateTexelSize() {
        return new VkExtent2D(segment.asSlice(OFFSET$shadingRateTexelSize, LAYOUT$shadingRateTexelSize));
    }

    public void shadingRateTexelSize(VkExtent2D value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$shadingRateTexelSize, SIZE$shadingRateTexelSize);
    }

    public @unsigned int shadingRatePaletteSize() {
        return segment.get(LAYOUT$shadingRatePaletteSize, OFFSET$shadingRatePaletteSize);
    }

    public void shadingRatePaletteSize(@unsigned int value) {
        segment.set(LAYOUT$shadingRatePaletteSize, OFFSET$shadingRatePaletteSize, value);
    }

    public @unsigned int shadingRateMaxCoarseSamples() {
        return segment.get(LAYOUT$shadingRateMaxCoarseSamples, OFFSET$shadingRateMaxCoarseSamples);
    }

    public void shadingRateMaxCoarseSamples(@unsigned int value) {
        segment.set(LAYOUT$shadingRateMaxCoarseSamples, OFFSET$shadingRateMaxCoarseSamples, value);
    }

    public static VkPhysicalDeviceShadingRateImagePropertiesNV allocate(Arena arena) {
        return new VkPhysicalDeviceShadingRateImagePropertiesNV(arena.allocate(LAYOUT));
    }

    public static VkPhysicalDeviceShadingRateImagePropertiesNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceShadingRateImagePropertiesNV[] ret = new VkPhysicalDeviceShadingRateImagePropertiesNV[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkPhysicalDeviceShadingRateImagePropertiesNV(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPhysicalDeviceShadingRateImagePropertiesNV clone(Arena arena, VkPhysicalDeviceShadingRateImagePropertiesNV src) {
        VkPhysicalDeviceShadingRateImagePropertiesNV ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceShadingRateImagePropertiesNV[] clone(Arena arena, VkPhysicalDeviceShadingRateImagePropertiesNV[] src) {
        VkPhysicalDeviceShadingRateImagePropertiesNV[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        VkExtent2D.LAYOUT.withName("shadingRateTexelSize"),
        ValueLayout.JAVA_INT.withName("shadingRatePaletteSize"),
        ValueLayout.JAVA_INT.withName("shadingRateMaxCoarseSamples")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$shadingRateTexelSize = PathElement.groupElement("shadingRateTexelSize");
    public static final PathElement PATH$shadingRatePaletteSize = PathElement.groupElement("shadingRatePaletteSize");
    public static final PathElement PATH$shadingRateMaxCoarseSamples = PathElement.groupElement("shadingRateMaxCoarseSamples");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final StructLayout LAYOUT$shadingRateTexelSize = (StructLayout) LAYOUT.select(PATH$shadingRateTexelSize);
    public static final OfInt LAYOUT$shadingRatePaletteSize = (OfInt) LAYOUT.select(PATH$shadingRatePaletteSize);
    public static final OfInt LAYOUT$shadingRateMaxCoarseSamples = (OfInt) LAYOUT.select(PATH$shadingRateMaxCoarseSamples);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$shadingRateTexelSize = LAYOUT.byteOffset(PATH$shadingRateTexelSize);
    public static final long OFFSET$shadingRatePaletteSize = LAYOUT.byteOffset(PATH$shadingRatePaletteSize);
    public static final long OFFSET$shadingRateMaxCoarseSamples = LAYOUT.byteOffset(PATH$shadingRateMaxCoarseSamples);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$shadingRateTexelSize = LAYOUT$shadingRateTexelSize.byteSize();
    public static final long SIZE$shadingRatePaletteSize = LAYOUT$shadingRatePaletteSize.byteSize();
    public static final long SIZE$shadingRateMaxCoarseSamples = LAYOUT$shadingRateMaxCoarseSamples.byteSize();
}
