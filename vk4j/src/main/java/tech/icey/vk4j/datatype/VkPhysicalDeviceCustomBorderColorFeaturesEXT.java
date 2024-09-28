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

/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkPhysicalDeviceCustomBorderColorFeaturesEXT.html">VkPhysicalDeviceCustomBorderColorFeaturesEXT</a>
public record VkPhysicalDeviceCustomBorderColorFeaturesEXT(MemorySegment segment) implements IPointer {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("customBorderColors"),
        ValueLayout.JAVA_INT.withName("customBorderColorWithoutFormat")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$customBorderColors = PathElement.groupElement("customBorderColors");
    public static final PathElement PATH$customBorderColorWithoutFormat = PathElement.groupElement("customBorderColorWithoutFormat");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$customBorderColors = (OfInt) LAYOUT.select(PATH$customBorderColors);
    public static final OfInt LAYOUT$customBorderColorWithoutFormat = (OfInt) LAYOUT.select(PATH$customBorderColorWithoutFormat);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$customBorderColors = LAYOUT.byteOffset(PATH$customBorderColors);
    public static final long OFFSET$customBorderColorWithoutFormat = LAYOUT.byteOffset(PATH$customBorderColorWithoutFormat);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$customBorderColors = LAYOUT$customBorderColors.byteSize();
    public static final long SIZE$customBorderColorWithoutFormat = LAYOUT$customBorderColorWithoutFormat.byteSize();

    public VkPhysicalDeviceCustomBorderColorFeaturesEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CUSTOM_BORDER_COLOR_FEATURES_EXT);
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

    public static VkPhysicalDeviceCustomBorderColorFeaturesEXT allocate(Arena arena) {
        return new VkPhysicalDeviceCustomBorderColorFeaturesEXT(arena.allocate(LAYOUT));
    }
    
    public static VkPhysicalDeviceCustomBorderColorFeaturesEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceCustomBorderColorFeaturesEXT[] ret = new VkPhysicalDeviceCustomBorderColorFeaturesEXT[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkPhysicalDeviceCustomBorderColorFeaturesEXT(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
}
