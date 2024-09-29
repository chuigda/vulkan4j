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
/// typedef struct VkPipelineViewportDepthClipControlCreateInfoEXT {
///     VkStructureType sType;
///     const void* pNext;
///     VkBool32 negativeOneToOne;
/// } VkPipelineViewportDepthClipControlCreateInfoEXT;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkPipelineViewportDepthClipControlCreateInfoEXT.html">VkPipelineViewportDepthClipControlCreateInfoEXT</a>
public record VkPipelineViewportDepthClipControlCreateInfoEXT(MemorySegment segment) implements IPointer {
    public VkPipelineViewportDepthClipControlCreateInfoEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PIPELINE_VIEWPORT_DEPTH_CLIP_CONTROL_CREATE_INFO_EXT);
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

    public @unsigned int negativeOneToOne() {
        return segment.get(LAYOUT$negativeOneToOne, OFFSET$negativeOneToOne);
    }

    public void negativeOneToOne(@unsigned int value) {
        segment.set(LAYOUT$negativeOneToOne, OFFSET$negativeOneToOne, value);
    }

    public static VkPipelineViewportDepthClipControlCreateInfoEXT allocate(Arena arena) {
        return new VkPipelineViewportDepthClipControlCreateInfoEXT(arena.allocate(LAYOUT));
    }
    
    public static VkPipelineViewportDepthClipControlCreateInfoEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPipelineViewportDepthClipControlCreateInfoEXT[] ret = new VkPipelineViewportDepthClipControlCreateInfoEXT[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkPipelineViewportDepthClipControlCreateInfoEXT(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPipelineViewportDepthClipControlCreateInfoEXT clone(Arena arena, VkPipelineViewportDepthClipControlCreateInfoEXT src) {
        VkPipelineViewportDepthClipControlCreateInfoEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPipelineViewportDepthClipControlCreateInfoEXT[] clone(Arena arena, VkPipelineViewportDepthClipControlCreateInfoEXT[] src) {
        VkPipelineViewportDepthClipControlCreateInfoEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("negativeOneToOne")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$negativeOneToOne = PathElement.groupElement("negativeOneToOne");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$negativeOneToOne = (OfInt) LAYOUT.select(PATH$negativeOneToOne);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$negativeOneToOne = LAYOUT.byteOffset(PATH$negativeOneToOne);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$negativeOneToOne = LAYOUT$negativeOneToOne.byteSize();
}
