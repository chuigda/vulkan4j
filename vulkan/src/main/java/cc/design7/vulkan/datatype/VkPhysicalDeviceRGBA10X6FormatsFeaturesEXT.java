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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT.html">VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT</a>
@ValueBasedCandidate
public record VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$formatRgba10x6WithoutYCbCrSampler = ValueLayout.JAVA_INT.withName("formatRgba10x6WithoutYCbCrSampler");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$formatRgba10x6WithoutYCbCrSampler);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT allocate(Arena arena) {
        return new VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT(arena.allocate(LAYOUT));
    }

    public static VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT[] ret = new VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT[count];
        for (int i = 0; i < count; i ++) {
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
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$formatRgba10x6WithoutYCbCrSampler = PathElement.groupElement("PATH$formatRgba10x6WithoutYCbCrSampler");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$formatRgba10x6WithoutYCbCrSampler = LAYOUT$formatRgba10x6WithoutYCbCrSampler.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$formatRgba10x6WithoutYCbCrSampler = LAYOUT.byteOffset(PATH$formatRgba10x6WithoutYCbCrSampler);

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

}
