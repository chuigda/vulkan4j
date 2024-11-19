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
/// typedef struct VkPhysicalDeviceRobustness2PropertiesEXT {
///     VkStructureType sType;
///     void* pNext;
///     VkDeviceSize robustStorageBufferAccessSizeAlignment;
///     VkDeviceSize robustUniformBufferAccessSizeAlignment;
/// } VkPhysicalDeviceRobustness2PropertiesEXT;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkPhysicalDeviceRobustness2PropertiesEXT.html">VkPhysicalDeviceRobustness2PropertiesEXT</a>
public record VkPhysicalDeviceRobustness2PropertiesEXT(MemorySegment segment) implements IPointer {
    public VkPhysicalDeviceRobustness2PropertiesEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ROBUSTNESS_2_PROPERTIES_EXT);
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

    public @unsigned long robustStorageBufferAccessSizeAlignment() {
        return segment.get(LAYOUT$robustStorageBufferAccessSizeAlignment, OFFSET$robustStorageBufferAccessSizeAlignment);
    }

    public void robustStorageBufferAccessSizeAlignment(@unsigned long value) {
        segment.set(LAYOUT$robustStorageBufferAccessSizeAlignment, OFFSET$robustStorageBufferAccessSizeAlignment, value);
    }

    public @unsigned long robustUniformBufferAccessSizeAlignment() {
        return segment.get(LAYOUT$robustUniformBufferAccessSizeAlignment, OFFSET$robustUniformBufferAccessSizeAlignment);
    }

    public void robustUniformBufferAccessSizeAlignment(@unsigned long value) {
        segment.set(LAYOUT$robustUniformBufferAccessSizeAlignment, OFFSET$robustUniformBufferAccessSizeAlignment, value);
    }

    public static VkPhysicalDeviceRobustness2PropertiesEXT allocate(Arena arena) {
        return new VkPhysicalDeviceRobustness2PropertiesEXT(arena.allocate(LAYOUT));
    }

    public static VkPhysicalDeviceRobustness2PropertiesEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceRobustness2PropertiesEXT[] ret = new VkPhysicalDeviceRobustness2PropertiesEXT[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkPhysicalDeviceRobustness2PropertiesEXT(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPhysicalDeviceRobustness2PropertiesEXT clone(Arena arena, VkPhysicalDeviceRobustness2PropertiesEXT src) {
        VkPhysicalDeviceRobustness2PropertiesEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceRobustness2PropertiesEXT[] clone(Arena arena, VkPhysicalDeviceRobustness2PropertiesEXT[] src) {
        VkPhysicalDeviceRobustness2PropertiesEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("robustStorageBufferAccessSizeAlignment"),
        ValueLayout.JAVA_LONG.withName("robustUniformBufferAccessSizeAlignment")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$robustStorageBufferAccessSizeAlignment = PathElement.groupElement("robustStorageBufferAccessSizeAlignment");
    public static final PathElement PATH$robustUniformBufferAccessSizeAlignment = PathElement.groupElement("robustUniformBufferAccessSizeAlignment");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfLong LAYOUT$robustStorageBufferAccessSizeAlignment = (OfLong) LAYOUT.select(PATH$robustStorageBufferAccessSizeAlignment);
    public static final OfLong LAYOUT$robustUniformBufferAccessSizeAlignment = (OfLong) LAYOUT.select(PATH$robustUniformBufferAccessSizeAlignment);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$robustStorageBufferAccessSizeAlignment = LAYOUT.byteOffset(PATH$robustStorageBufferAccessSizeAlignment);
    public static final long OFFSET$robustUniformBufferAccessSizeAlignment = LAYOUT.byteOffset(PATH$robustUniformBufferAccessSizeAlignment);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$robustStorageBufferAccessSizeAlignment = LAYOUT$robustStorageBufferAccessSizeAlignment.byteSize();
    public static final long SIZE$robustUniformBufferAccessSizeAlignment = LAYOUT$robustUniformBufferAccessSizeAlignment.byteSize();
}
