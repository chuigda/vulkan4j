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
/// typedef struct VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 ycbcr2plane444Formats;
/// } VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT.html">VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT</a>
public record VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT(MemorySegment segment) implements IPointer {
    public VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_YCBCR_2_PLANE_444_FORMATS_FEATURES_EXT);
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

    public @unsigned int ycbcr2plane444Formats() {
        return segment.get(LAYOUT$ycbcr2plane444Formats, OFFSET$ycbcr2plane444Formats);
    }

    public void ycbcr2plane444Formats(@unsigned int value) {
        segment.set(LAYOUT$ycbcr2plane444Formats, OFFSET$ycbcr2plane444Formats, value);
    }

    public static VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT allocate(Arena arena) {
        return new VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT(arena.allocate(LAYOUT));
    }

    public static VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT[] ret = new VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT clone(Arena arena, VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT src) {
        VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT[] clone(Arena arena, VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT[] src) {
        VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("ycbcr2plane444Formats")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$ycbcr2plane444Formats = PathElement.groupElement("ycbcr2plane444Formats");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$ycbcr2plane444Formats = (OfInt) LAYOUT.select(PATH$ycbcr2plane444Formats);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$ycbcr2plane444Formats = LAYOUT.byteOffset(PATH$ycbcr2plane444Formats);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$ycbcr2plane444Formats = LAYOUT$ycbcr2plane444Formats.byteSize();
}
