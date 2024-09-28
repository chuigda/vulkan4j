package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.IPointer;
import tech.icey.vk4j.annotation.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.buffer.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import tech.icey.vk4j.NativeLayout;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

public record VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT(MemorySegment segment) implements IPointer {
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
}
