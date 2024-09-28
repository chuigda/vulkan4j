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
/// typedef struct VkPhysicalDeviceBorderColorSwizzleFeaturesEXT {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 borderColorSwizzle;
///     VkBool32 borderColorSwizzleFromImage;
/// } VkPhysicalDeviceBorderColorSwizzleFeaturesEXT;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkPhysicalDeviceBorderColorSwizzleFeaturesEXT.html">VkPhysicalDeviceBorderColorSwizzleFeaturesEXT</a>
public record VkPhysicalDeviceBorderColorSwizzleFeaturesEXT(MemorySegment segment) implements IPointer {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("borderColorSwizzle"),
        ValueLayout.JAVA_INT.withName("borderColorSwizzleFromImage")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$borderColorSwizzle = PathElement.groupElement("borderColorSwizzle");
    public static final PathElement PATH$borderColorSwizzleFromImage = PathElement.groupElement("borderColorSwizzleFromImage");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$borderColorSwizzle = (OfInt) LAYOUT.select(PATH$borderColorSwizzle);
    public static final OfInt LAYOUT$borderColorSwizzleFromImage = (OfInt) LAYOUT.select(PATH$borderColorSwizzleFromImage);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$borderColorSwizzle = LAYOUT.byteOffset(PATH$borderColorSwizzle);
    public static final long OFFSET$borderColorSwizzleFromImage = LAYOUT.byteOffset(PATH$borderColorSwizzleFromImage);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$borderColorSwizzle = LAYOUT$borderColorSwizzle.byteSize();
    public static final long SIZE$borderColorSwizzleFromImage = LAYOUT$borderColorSwizzleFromImage.byteSize();

    public VkPhysicalDeviceBorderColorSwizzleFeaturesEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_BORDER_COLOR_SWIZZLE_FEATURES_EXT);
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

    public @unsigned int borderColorSwizzle() {
        return segment.get(LAYOUT$borderColorSwizzle, OFFSET$borderColorSwizzle);
    }

    public void borderColorSwizzle(@unsigned int value) {
        segment.set(LAYOUT$borderColorSwizzle, OFFSET$borderColorSwizzle, value);
    }

    public @unsigned int borderColorSwizzleFromImage() {
        return segment.get(LAYOUT$borderColorSwizzleFromImage, OFFSET$borderColorSwizzleFromImage);
    }

    public void borderColorSwizzleFromImage(@unsigned int value) {
        segment.set(LAYOUT$borderColorSwizzleFromImage, OFFSET$borderColorSwizzleFromImage, value);
    }

    public static VkPhysicalDeviceBorderColorSwizzleFeaturesEXT allocate(Arena arena) {
        return new VkPhysicalDeviceBorderColorSwizzleFeaturesEXT(arena.allocate(LAYOUT));
    }
    
    public static VkPhysicalDeviceBorderColorSwizzleFeaturesEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceBorderColorSwizzleFeaturesEXT[] ret = new VkPhysicalDeviceBorderColorSwizzleFeaturesEXT[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkPhysicalDeviceBorderColorSwizzleFeaturesEXT(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
}
