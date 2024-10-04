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
/// typedef struct VkPhysicalDeviceColorWriteEnableFeaturesEXT {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 colorWriteEnable;
/// } VkPhysicalDeviceColorWriteEnableFeaturesEXT;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkPhysicalDeviceColorWriteEnableFeaturesEXT.html">VkPhysicalDeviceColorWriteEnableFeaturesEXT</a>
public record VkPhysicalDeviceColorWriteEnableFeaturesEXT(MemorySegment segment) implements IPointer {
    public VkPhysicalDeviceColorWriteEnableFeaturesEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COLOR_WRITE_ENABLE_FEATURES_EXT);
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

    public @unsigned int colorWriteEnable() {
        return segment.get(LAYOUT$colorWriteEnable, OFFSET$colorWriteEnable);
    }

    public void colorWriteEnable(@unsigned int value) {
        segment.set(LAYOUT$colorWriteEnable, OFFSET$colorWriteEnable, value);
    }

    public static VkPhysicalDeviceColorWriteEnableFeaturesEXT allocate(Arena arena) {
        return new VkPhysicalDeviceColorWriteEnableFeaturesEXT(arena.allocate(LAYOUT));
    }

    public static VkPhysicalDeviceColorWriteEnableFeaturesEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceColorWriteEnableFeaturesEXT[] ret = new VkPhysicalDeviceColorWriteEnableFeaturesEXT[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkPhysicalDeviceColorWriteEnableFeaturesEXT(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPhysicalDeviceColorWriteEnableFeaturesEXT clone(Arena arena, VkPhysicalDeviceColorWriteEnableFeaturesEXT src) {
        VkPhysicalDeviceColorWriteEnableFeaturesEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceColorWriteEnableFeaturesEXT[] clone(Arena arena, VkPhysicalDeviceColorWriteEnableFeaturesEXT[] src) {
        VkPhysicalDeviceColorWriteEnableFeaturesEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("colorWriteEnable")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$colorWriteEnable = PathElement.groupElement("colorWriteEnable");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$colorWriteEnable = (OfInt) LAYOUT.select(PATH$colorWriteEnable);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$colorWriteEnable = LAYOUT.byteOffset(PATH$colorWriteEnable);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$colorWriteEnable = LAYOUT$colorWriteEnable.byteSize();
}
