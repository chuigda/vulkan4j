package tech.icey.vk4j.datatype;

import tech.icey.panama.IPointer;
import tech.icey.panama.NativeLayout;
import tech.icey.panama.annotation.enumtype;
import tech.icey.panama.annotation.pointer;
import tech.icey.vk4j.bitmask.VkImageCompressionFixedRateFlagsEXT;
import tech.icey.vk4j.bitmask.VkImageCompressionFlagsEXT;
import tech.icey.vk4j.enumtype.VkStructureType;

import java.lang.foreign.*;

import static java.lang.foreign.ValueLayout.OfInt;
import static java.lang.foreign.ValueLayout.PathElement;
import static tech.icey.vk4j.enumtype.VkStructureType.VK_STRUCTURE_TYPE_IMAGE_COMPRESSION_PROPERTIES_EXT;

/// {@snippet lang=c :
/// typedef struct VkImageCompressionPropertiesEXT {
///     VkStructureType sType;
///     void* pNext;
///     VkImageCompressionFlagsEXT imageCompressionFlags;
///     VkImageCompressionFixedRateFlagsEXT imageCompressionFixedRateFlags;
/// } VkImageCompressionPropertiesEXT;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkImageCompressionPropertiesEXT.html">VkImageCompressionPropertiesEXT</a>
public record VkImageCompressionPropertiesEXT(MemorySegment segment) implements IPointer {
    public VkImageCompressionPropertiesEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_IMAGE_COMPRESSION_PROPERTIES_EXT);
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

    public @enumtype(VkImageCompressionFlagsEXT.class) int imageCompressionFlags() {
        return segment.get(LAYOUT$imageCompressionFlags, OFFSET$imageCompressionFlags);
    }

    public void imageCompressionFlags(@enumtype(VkImageCompressionFlagsEXT.class) int value) {
        segment.set(LAYOUT$imageCompressionFlags, OFFSET$imageCompressionFlags, value);
    }

    public @enumtype(VkImageCompressionFixedRateFlagsEXT.class) int imageCompressionFixedRateFlags() {
        return segment.get(LAYOUT$imageCompressionFixedRateFlags, OFFSET$imageCompressionFixedRateFlags);
    }

    public void imageCompressionFixedRateFlags(@enumtype(VkImageCompressionFixedRateFlagsEXT.class) int value) {
        segment.set(LAYOUT$imageCompressionFixedRateFlags, OFFSET$imageCompressionFixedRateFlags, value);
    }

    public static VkImageCompressionPropertiesEXT allocate(Arena arena) {
        return new VkImageCompressionPropertiesEXT(arena.allocate(LAYOUT));
    }

    public static VkImageCompressionPropertiesEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkImageCompressionPropertiesEXT[] ret = new VkImageCompressionPropertiesEXT[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkImageCompressionPropertiesEXT(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkImageCompressionPropertiesEXT clone(Arena arena, VkImageCompressionPropertiesEXT src) {
        VkImageCompressionPropertiesEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkImageCompressionPropertiesEXT[] clone(Arena arena, VkImageCompressionPropertiesEXT[] src) {
        VkImageCompressionPropertiesEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("imageCompressionFlags"),
        ValueLayout.JAVA_INT.withName("imageCompressionFixedRateFlags")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$imageCompressionFlags = PathElement.groupElement("imageCompressionFlags");
    public static final PathElement PATH$imageCompressionFixedRateFlags = PathElement.groupElement("imageCompressionFixedRateFlags");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$imageCompressionFlags = (OfInt) LAYOUT.select(PATH$imageCompressionFlags);
    public static final OfInt LAYOUT$imageCompressionFixedRateFlags = (OfInt) LAYOUT.select(PATH$imageCompressionFixedRateFlags);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$imageCompressionFlags = LAYOUT.byteOffset(PATH$imageCompressionFlags);
    public static final long OFFSET$imageCompressionFixedRateFlags = LAYOUT.byteOffset(PATH$imageCompressionFixedRateFlags);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$imageCompressionFlags = LAYOUT$imageCompressionFlags.byteSize();
    public static final long SIZE$imageCompressionFixedRateFlags = LAYOUT$imageCompressionFixedRateFlags.byteSize();
}
