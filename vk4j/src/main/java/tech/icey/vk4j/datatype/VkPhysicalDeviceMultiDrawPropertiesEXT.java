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
/// typedef struct VkPhysicalDeviceMultiDrawPropertiesEXT {
///     VkStructureType sType;
///     void* pNext;
///     uint32_t maxMultiDrawCount;
/// } VkPhysicalDeviceMultiDrawPropertiesEXT;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkPhysicalDeviceMultiDrawPropertiesEXT.html">VkPhysicalDeviceMultiDrawPropertiesEXT</a>
public record VkPhysicalDeviceMultiDrawPropertiesEXT(MemorySegment segment) implements IPointer {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("maxMultiDrawCount")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$maxMultiDrawCount = PathElement.groupElement("maxMultiDrawCount");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$maxMultiDrawCount = (OfInt) LAYOUT.select(PATH$maxMultiDrawCount);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$maxMultiDrawCount = LAYOUT.byteOffset(PATH$maxMultiDrawCount);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$maxMultiDrawCount = LAYOUT$maxMultiDrawCount.byteSize();

    public VkPhysicalDeviceMultiDrawPropertiesEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MULTI_DRAW_PROPERTIES_EXT);
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

    public @unsigned int maxMultiDrawCount() {
        return segment.get(LAYOUT$maxMultiDrawCount, OFFSET$maxMultiDrawCount);
    }

    public void maxMultiDrawCount(@unsigned int value) {
        segment.set(LAYOUT$maxMultiDrawCount, OFFSET$maxMultiDrawCount, value);
    }

    public static VkPhysicalDeviceMultiDrawPropertiesEXT allocate(Arena arena) {
        return new VkPhysicalDeviceMultiDrawPropertiesEXT(arena.allocate(LAYOUT));
    }
    
    public static VkPhysicalDeviceMultiDrawPropertiesEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceMultiDrawPropertiesEXT[] ret = new VkPhysicalDeviceMultiDrawPropertiesEXT[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkPhysicalDeviceMultiDrawPropertiesEXT(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
}
