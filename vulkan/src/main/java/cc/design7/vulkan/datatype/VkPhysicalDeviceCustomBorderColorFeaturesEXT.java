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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceCustomBorderColorFeaturesEXT.html">VkPhysicalDeviceCustomBorderColorFeaturesEXT</a>
@ValueBasedCandidate
public record VkPhysicalDeviceCustomBorderColorFeaturesEXT(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$customBorderColors = ValueLayout.JAVA_INT.withName("customBorderColors");
    public static final OfInt LAYOUT$customBorderColorWithoutFormat = ValueLayout.JAVA_INT.withName("customBorderColorWithoutFormat");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$customBorderColors, LAYOUT$customBorderColorWithoutFormat);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkPhysicalDeviceCustomBorderColorFeaturesEXT allocate(Arena arena) {
        return new VkPhysicalDeviceCustomBorderColorFeaturesEXT(arena.allocate(LAYOUT));
    }

    public static VkPhysicalDeviceCustomBorderColorFeaturesEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceCustomBorderColorFeaturesEXT[] ret = new VkPhysicalDeviceCustomBorderColorFeaturesEXT[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPhysicalDeviceCustomBorderColorFeaturesEXT(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPhysicalDeviceCustomBorderColorFeaturesEXT clone(Arena arena, VkPhysicalDeviceCustomBorderColorFeaturesEXT src) {
        VkPhysicalDeviceCustomBorderColorFeaturesEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceCustomBorderColorFeaturesEXT[] clone(Arena arena, VkPhysicalDeviceCustomBorderColorFeaturesEXT[] src) {
        VkPhysicalDeviceCustomBorderColorFeaturesEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$customBorderColors = PathElement.groupElement("PATH$customBorderColors");
    public static final PathElement PATH$customBorderColorWithoutFormat = PathElement.groupElement("PATH$customBorderColorWithoutFormat");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$customBorderColors = LAYOUT$customBorderColors.byteSize();
    public static final long SIZE$customBorderColorWithoutFormat = LAYOUT$customBorderColorWithoutFormat.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$customBorderColors = LAYOUT.byteOffset(PATH$customBorderColors);
    public static final long OFFSET$customBorderColorWithoutFormat = LAYOUT.byteOffset(PATH$customBorderColorWithoutFormat);

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

    public @unsigned int customBorderColors() {
        return segment.get(LAYOUT$customBorderColors, OFFSET$customBorderColors);
    }

    public void customBorderColors(@unsigned int value) {
        segment.set(LAYOUT$customBorderColors, OFFSET$customBorderColors, value);
    }

    public @unsigned int customBorderColorWithoutFormat() {
        return segment.get(LAYOUT$customBorderColorWithoutFormat, OFFSET$customBorderColorWithoutFormat);
    }

    public void customBorderColorWithoutFormat(@unsigned int value) {
        segment.set(LAYOUT$customBorderColorWithoutFormat, OFFSET$customBorderColorWithoutFormat, value);
    }

}
