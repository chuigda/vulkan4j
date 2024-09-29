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

/// {@snippet lang=c :
/// typedef struct VkPhysicalDeviceMemoryPriorityFeaturesEXT {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 memoryPriority;
/// } VkPhysicalDeviceMemoryPriorityFeaturesEXT;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkPhysicalDeviceMemoryPriorityFeaturesEXT.html">VkPhysicalDeviceMemoryPriorityFeaturesEXT</a>
public record VkPhysicalDeviceMemoryPriorityFeaturesEXT(MemorySegment segment) implements IPointer {
    public VkPhysicalDeviceMemoryPriorityFeaturesEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MEMORY_PRIORITY_FEATURES_EXT);
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

    public @unsigned int memoryPriority() {
        return segment.get(LAYOUT$memoryPriority, OFFSET$memoryPriority);
    }

    public void memoryPriority(@unsigned int value) {
        segment.set(LAYOUT$memoryPriority, OFFSET$memoryPriority, value);
    }

    public static VkPhysicalDeviceMemoryPriorityFeaturesEXT allocate(Arena arena) {
        return new VkPhysicalDeviceMemoryPriorityFeaturesEXT(arena.allocate(LAYOUT));
    }
    
    public static VkPhysicalDeviceMemoryPriorityFeaturesEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceMemoryPriorityFeaturesEXT[] ret = new VkPhysicalDeviceMemoryPriorityFeaturesEXT[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkPhysicalDeviceMemoryPriorityFeaturesEXT(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPhysicalDeviceMemoryPriorityFeaturesEXT clone(Arena arena, VkPhysicalDeviceMemoryPriorityFeaturesEXT src) {
        VkPhysicalDeviceMemoryPriorityFeaturesEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceMemoryPriorityFeaturesEXT[] clone(Arena arena, VkPhysicalDeviceMemoryPriorityFeaturesEXT[] src) {
        VkPhysicalDeviceMemoryPriorityFeaturesEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("memoryPriority")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$memoryPriority = PathElement.groupElement("memoryPriority");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$memoryPriority = (OfInt) LAYOUT.select(PATH$memoryPriority);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$memoryPriority = LAYOUT.byteOffset(PATH$memoryPriority);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$memoryPriority = LAYOUT$memoryPriority.byteSize();
}
