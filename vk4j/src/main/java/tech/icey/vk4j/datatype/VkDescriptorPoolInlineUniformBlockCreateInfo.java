package tech.icey.vk4j.datatype;

import tech.icey.panama.IPointer;
import tech.icey.panama.NativeLayout;
import tech.icey.panama.annotation.enumtype;
import tech.icey.panama.annotation.pointer;
import tech.icey.panama.annotation.unsigned;
import tech.icey.vk4j.enumtype.VkStructureType;

import java.lang.foreign.*;

import static java.lang.foreign.ValueLayout.OfInt;
import static java.lang.foreign.ValueLayout.PathElement;
import static tech.icey.vk4j.enumtype.VkStructureType.VK_STRUCTURE_TYPE_DESCRIPTOR_POOL_INLINE_UNIFORM_BLOCK_CREATE_INFO;

/// {@snippet lang=c :
/// typedef struct VkDescriptorPoolInlineUniformBlockCreateInfo {
///     VkStructureType sType;
///     const void* pNext;
///     uint32_t maxInlineUniformBlockBindings;
/// } VkDescriptorPoolInlineUniformBlockCreateInfo;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkDescriptorPoolInlineUniformBlockCreateInfo.html">VkDescriptorPoolInlineUniformBlockCreateInfo</a>
public record VkDescriptorPoolInlineUniformBlockCreateInfo(MemorySegment segment) implements IPointer {
    public VkDescriptorPoolInlineUniformBlockCreateInfo(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_DESCRIPTOR_POOL_INLINE_UNIFORM_BLOCK_CREATE_INFO);
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

    public @unsigned int maxInlineUniformBlockBindings() {
        return segment.get(LAYOUT$maxInlineUniformBlockBindings, OFFSET$maxInlineUniformBlockBindings);
    }

    public void maxInlineUniformBlockBindings(@unsigned int value) {
        segment.set(LAYOUT$maxInlineUniformBlockBindings, OFFSET$maxInlineUniformBlockBindings, value);
    }

    public static VkDescriptorPoolInlineUniformBlockCreateInfo allocate(Arena arena) {
        return new VkDescriptorPoolInlineUniformBlockCreateInfo(arena.allocate(LAYOUT));
    }

    public static VkDescriptorPoolInlineUniformBlockCreateInfo[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkDescriptorPoolInlineUniformBlockCreateInfo[] ret = new VkDescriptorPoolInlineUniformBlockCreateInfo[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkDescriptorPoolInlineUniformBlockCreateInfo(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkDescriptorPoolInlineUniformBlockCreateInfo clone(Arena arena, VkDescriptorPoolInlineUniformBlockCreateInfo src) {
        VkDescriptorPoolInlineUniformBlockCreateInfo ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkDescriptorPoolInlineUniformBlockCreateInfo[] clone(Arena arena, VkDescriptorPoolInlineUniformBlockCreateInfo[] src) {
        VkDescriptorPoolInlineUniformBlockCreateInfo[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("maxInlineUniformBlockBindings")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$maxInlineUniformBlockBindings = PathElement.groupElement("maxInlineUniformBlockBindings");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$maxInlineUniformBlockBindings = (OfInt) LAYOUT.select(PATH$maxInlineUniformBlockBindings);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$maxInlineUniformBlockBindings = LAYOUT.byteOffset(PATH$maxInlineUniformBlockBindings);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$maxInlineUniformBlockBindings = LAYOUT$maxInlineUniformBlockBindings.byteSize();
}
