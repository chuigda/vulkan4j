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
/// typedef struct VkPhysicalDeviceLegacyDitheringFeaturesEXT {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 legacyDithering;
/// } VkPhysicalDeviceLegacyDitheringFeaturesEXT;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkPhysicalDeviceLegacyDitheringFeaturesEXT.html">VkPhysicalDeviceLegacyDitheringFeaturesEXT</a>
public record VkPhysicalDeviceLegacyDitheringFeaturesEXT(MemorySegment segment) implements IPointer {
    public VkPhysicalDeviceLegacyDitheringFeaturesEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_LEGACY_DITHERING_FEATURES_EXT);
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

    public @unsigned int legacyDithering() {
        return segment.get(LAYOUT$legacyDithering, OFFSET$legacyDithering);
    }

    public void legacyDithering(@unsigned int value) {
        segment.set(LAYOUT$legacyDithering, OFFSET$legacyDithering, value);
    }

    public static VkPhysicalDeviceLegacyDitheringFeaturesEXT allocate(Arena arena) {
        return new VkPhysicalDeviceLegacyDitheringFeaturesEXT(arena.allocate(LAYOUT));
    }
    
    public static VkPhysicalDeviceLegacyDitheringFeaturesEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceLegacyDitheringFeaturesEXT[] ret = new VkPhysicalDeviceLegacyDitheringFeaturesEXT[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkPhysicalDeviceLegacyDitheringFeaturesEXT(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
    
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("legacyDithering")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$legacyDithering = PathElement.groupElement("legacyDithering");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$legacyDithering = (OfInt) LAYOUT.select(PATH$legacyDithering);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$legacyDithering = LAYOUT.byteOffset(PATH$legacyDithering);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$legacyDithering = LAYOUT$legacyDithering.byteSize();
}
