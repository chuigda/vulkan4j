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
/// typedef struct VkPhysicalDevice4444FormatsFeaturesEXT {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 formatA4R4G4B4;
///     VkBool32 formatA4B4G4R4;
/// } VkPhysicalDevice4444FormatsFeaturesEXT;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkPhysicalDevice4444FormatsFeaturesEXT.html">VkPhysicalDevice4444FormatsFeaturesEXT</a>
public record VkPhysicalDevice4444FormatsFeaturesEXT(MemorySegment segment) implements IPointer {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("formatA4R4G4B4"),
        ValueLayout.JAVA_INT.withName("formatA4B4G4R4")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$formatA4R4G4B4 = PathElement.groupElement("formatA4R4G4B4");
    public static final PathElement PATH$formatA4B4G4R4 = PathElement.groupElement("formatA4B4G4R4");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$formatA4R4G4B4 = (OfInt) LAYOUT.select(PATH$formatA4R4G4B4);
    public static final OfInt LAYOUT$formatA4B4G4R4 = (OfInt) LAYOUT.select(PATH$formatA4B4G4R4);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$formatA4R4G4B4 = LAYOUT.byteOffset(PATH$formatA4R4G4B4);
    public static final long OFFSET$formatA4B4G4R4 = LAYOUT.byteOffset(PATH$formatA4B4G4R4);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$formatA4R4G4B4 = LAYOUT$formatA4R4G4B4.byteSize();
    public static final long SIZE$formatA4B4G4R4 = LAYOUT$formatA4B4G4R4.byteSize();

    public VkPhysicalDevice4444FormatsFeaturesEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_4444_FORMATS_FEATURES_EXT);
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

    public @unsigned int formatA4R4G4B4() {
        return segment.get(LAYOUT$formatA4R4G4B4, OFFSET$formatA4R4G4B4);
    }

    public void formatA4R4G4B4(@unsigned int value) {
        segment.set(LAYOUT$formatA4R4G4B4, OFFSET$formatA4R4G4B4, value);
    }

    public @unsigned int formatA4B4G4R4() {
        return segment.get(LAYOUT$formatA4B4G4R4, OFFSET$formatA4B4G4R4);
    }

    public void formatA4B4G4R4(@unsigned int value) {
        segment.set(LAYOUT$formatA4B4G4R4, OFFSET$formatA4B4G4R4, value);
    }

    public static VkPhysicalDevice4444FormatsFeaturesEXT allocate(Arena arena) {
        return new VkPhysicalDevice4444FormatsFeaturesEXT(arena.allocate(LAYOUT));
    }
    
    public static VkPhysicalDevice4444FormatsFeaturesEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDevice4444FormatsFeaturesEXT[] ret = new VkPhysicalDevice4444FormatsFeaturesEXT[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkPhysicalDevice4444FormatsFeaturesEXT(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
}
