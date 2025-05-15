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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT.html">VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT</a>
@ValueBasedCandidate
public record VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$ycbcr2plane444Formats = ValueLayout.JAVA_INT.withName("ycbcr2plane444Formats");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$ycbcr2plane444Formats);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT allocate(Arena arena) {
        return new VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT(arena.allocate(LAYOUT));
    }

    public static VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT[] ret = new VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT[count];
        for (int i = 0; i < count; i ++) {
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
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$ycbcr2plane444Formats = PathElement.groupElement("PATH$ycbcr2plane444Formats");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$ycbcr2plane444Formats = LAYOUT$ycbcr2plane444Formats.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$ycbcr2plane444Formats = LAYOUT.byteOffset(PATH$ycbcr2plane444Formats);

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

    public @unsigned int ycbcr2plane444Formats() {
        return segment.get(LAYOUT$ycbcr2plane444Formats, OFFSET$ycbcr2plane444Formats);
    }

    public void ycbcr2plane444Formats(@unsigned int value) {
        segment.set(LAYOUT$ycbcr2plane444Formats, OFFSET$ycbcr2plane444Formats, value);
    }

}
