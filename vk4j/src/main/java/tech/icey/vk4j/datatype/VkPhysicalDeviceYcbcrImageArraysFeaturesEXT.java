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
/// typedef struct VkPhysicalDeviceYcbcrImageArraysFeaturesEXT {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 ycbcrImageArrays;
/// } VkPhysicalDeviceYcbcrImageArraysFeaturesEXT;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkPhysicalDeviceYcbcrImageArraysFeaturesEXT.html">VkPhysicalDeviceYcbcrImageArraysFeaturesEXT</a>
public record VkPhysicalDeviceYcbcrImageArraysFeaturesEXT(MemorySegment segment) implements IPointer {
    public VkPhysicalDeviceYcbcrImageArraysFeaturesEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_YCBCR_IMAGE_ARRAYS_FEATURES_EXT);
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

    public @unsigned int ycbcrImageArrays() {
        return segment.get(LAYOUT$ycbcrImageArrays, OFFSET$ycbcrImageArrays);
    }

    public void ycbcrImageArrays(@unsigned int value) {
        segment.set(LAYOUT$ycbcrImageArrays, OFFSET$ycbcrImageArrays, value);
    }

    public static VkPhysicalDeviceYcbcrImageArraysFeaturesEXT allocate(Arena arena) {
        return new VkPhysicalDeviceYcbcrImageArraysFeaturesEXT(arena.allocate(LAYOUT));
    }
    
    public static VkPhysicalDeviceYcbcrImageArraysFeaturesEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceYcbcrImageArraysFeaturesEXT[] ret = new VkPhysicalDeviceYcbcrImageArraysFeaturesEXT[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkPhysicalDeviceYcbcrImageArraysFeaturesEXT(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
    
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("ycbcrImageArrays")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$ycbcrImageArrays = PathElement.groupElement("ycbcrImageArrays");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$ycbcrImageArrays = (OfInt) LAYOUT.select(PATH$ycbcrImageArrays);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$ycbcrImageArrays = LAYOUT.byteOffset(PATH$ycbcrImageArrays);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$ycbcrImageArrays = LAYOUT$ycbcrImageArrays.byteSize();

}
