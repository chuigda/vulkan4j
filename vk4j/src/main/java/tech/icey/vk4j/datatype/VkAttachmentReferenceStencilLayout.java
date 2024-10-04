package tech.icey.vk4j.datatype;

import tech.icey.panama.IPointer;
import tech.icey.panama.NativeLayout;
import tech.icey.panama.annotation.enumtype;
import tech.icey.panama.annotation.nullable;
import tech.icey.panama.annotation.pointer;
import tech.icey.vk4j.enumtype.VkImageLayout;
import tech.icey.vk4j.enumtype.VkStructureType;

import java.lang.foreign.*;

import static java.lang.foreign.ValueLayout.OfInt;
import static java.lang.foreign.ValueLayout.PathElement;
import static tech.icey.vk4j.enumtype.VkStructureType.VK_STRUCTURE_TYPE_ATTACHMENT_REFERENCE_STENCIL_LAYOUT;

/// {@snippet lang=c :
/// typedef struct VkAttachmentReferenceStencilLayout {
///     VkStructureType sType;
///     void* pNext;
///     VkImageLayout stencilLayout;
/// } VkAttachmentReferenceStencilLayout;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkAttachmentReferenceStencilLayout.html">VkAttachmentReferenceStencilLayout</a>
public record VkAttachmentReferenceStencilLayout(MemorySegment segment) implements IPointer {
    public VkAttachmentReferenceStencilLayout(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_ATTACHMENT_REFERENCE_STENCIL_LAYOUT);
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

    public void pNext(@nullable IPointer pointer) {
        pNext(pointer == null ? MemorySegment.NULL : pointer.segment());
    }

    public @enumtype(VkImageLayout.class) int stencilLayout() {
        return segment.get(LAYOUT$stencilLayout, OFFSET$stencilLayout);
    }

    public void stencilLayout(@enumtype(VkImageLayout.class) int value) {
        segment.set(LAYOUT$stencilLayout, OFFSET$stencilLayout, value);
    }

    public static VkAttachmentReferenceStencilLayout allocate(Arena arena) {
        return new VkAttachmentReferenceStencilLayout(arena.allocate(LAYOUT));
    }

    public static VkAttachmentReferenceStencilLayout[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkAttachmentReferenceStencilLayout[] ret = new VkAttachmentReferenceStencilLayout[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkAttachmentReferenceStencilLayout(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkAttachmentReferenceStencilLayout clone(Arena arena, VkAttachmentReferenceStencilLayout src) {
        VkAttachmentReferenceStencilLayout ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkAttachmentReferenceStencilLayout[] clone(Arena arena, VkAttachmentReferenceStencilLayout[] src) {
        VkAttachmentReferenceStencilLayout[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("stencilLayout")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$stencilLayout = PathElement.groupElement("stencilLayout");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$stencilLayout = (OfInt) LAYOUT.select(PATH$stencilLayout);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$stencilLayout = LAYOUT.byteOffset(PATH$stencilLayout);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$stencilLayout = LAYOUT$stencilLayout.byteSize();
}
