package tech.icey.vk4j.datatype;

import tech.icey.panama.IPointer;
import tech.icey.panama.NativeLayout;
import tech.icey.panama.annotation.enumtype;
import tech.icey.panama.annotation.pointer;
import tech.icey.vk4j.enumtype.VkFormat;
import tech.icey.vk4j.enumtype.VkStructureType;

import java.lang.foreign.*;

import static java.lang.foreign.ValueLayout.OfInt;
import static java.lang.foreign.ValueLayout.PathElement;
import static tech.icey.vk4j.enumtype.VkStructureType.VK_STRUCTURE_TYPE_SAMPLER_CUSTOM_BORDER_COLOR_CREATE_INFO_EXT;

/// {@snippet lang=c :
/// typedef struct VkSamplerCustomBorderColorCreateInfoEXT {
///     VkStructureType sType;
///     const void* pNext;
///     VkClearColorValue customBorderColor;
///     VkFormat format;
/// } VkSamplerCustomBorderColorCreateInfoEXT;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkSamplerCustomBorderColorCreateInfoEXT.html">VkSamplerCustomBorderColorCreateInfoEXT</a>
public record VkSamplerCustomBorderColorCreateInfoEXT(MemorySegment segment) implements IPointer {
    public VkSamplerCustomBorderColorCreateInfoEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_SAMPLER_CUSTOM_BORDER_COLOR_CREATE_INFO_EXT);
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

    public VkClearColorValue customBorderColor() {
        return new VkClearColorValue(segment.asSlice(OFFSET$customBorderColor, LAYOUT$customBorderColor));
    }

    public void customBorderColor(VkClearColorValue value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$customBorderColor, SIZE$customBorderColor);
    }

    public @enumtype(VkFormat.class) int format() {
        return segment.get(LAYOUT$format, OFFSET$format);
    }

    public void format(@enumtype(VkFormat.class) int value) {
        segment.set(LAYOUT$format, OFFSET$format, value);
    }

    public static VkSamplerCustomBorderColorCreateInfoEXT allocate(Arena arena) {
        return new VkSamplerCustomBorderColorCreateInfoEXT(arena.allocate(LAYOUT));
    }

    public static VkSamplerCustomBorderColorCreateInfoEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkSamplerCustomBorderColorCreateInfoEXT[] ret = new VkSamplerCustomBorderColorCreateInfoEXT[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkSamplerCustomBorderColorCreateInfoEXT(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkSamplerCustomBorderColorCreateInfoEXT clone(Arena arena, VkSamplerCustomBorderColorCreateInfoEXT src) {
        VkSamplerCustomBorderColorCreateInfoEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkSamplerCustomBorderColorCreateInfoEXT[] clone(Arena arena, VkSamplerCustomBorderColorCreateInfoEXT[] src) {
        VkSamplerCustomBorderColorCreateInfoEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        VkClearColorValue.LAYOUT.withName("customBorderColor"),
        ValueLayout.JAVA_INT.withName("format")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$customBorderColor = PathElement.groupElement("customBorderColor");
    public static final PathElement PATH$format = PathElement.groupElement("format");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final UnionLayout LAYOUT$customBorderColor = (UnionLayout) LAYOUT.select(PATH$customBorderColor);
    public static final OfInt LAYOUT$format = (OfInt) LAYOUT.select(PATH$format);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$customBorderColor = LAYOUT.byteOffset(PATH$customBorderColor);
    public static final long OFFSET$format = LAYOUT.byteOffset(PATH$format);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$customBorderColor = LAYOUT$customBorderColor.byteSize();
    public static final long SIZE$format = LAYOUT$format.byteSize();
}
