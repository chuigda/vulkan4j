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
/// typedef struct VkAttachmentDescriptionStencilLayout {
///     VkStructureType sType;
///     void* pNext;
///     VkImageLayout stencilInitialLayout;
///     VkImageLayout stencilFinalLayout;
/// } VkAttachmentDescriptionStencilLayout;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkAttachmentDescriptionStencilLayout.html">VkAttachmentDescriptionStencilLayout</a>
public record VkAttachmentDescriptionStencilLayout(MemorySegment segment) implements IPointer {
    public VkAttachmentDescriptionStencilLayout(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_ATTACHMENT_DESCRIPTION_STENCIL_LAYOUT);
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

    public @enumtype(VkImageLayout.class) int stencilInitialLayout() {
        return segment.get(LAYOUT$stencilInitialLayout, OFFSET$stencilInitialLayout);
    }

    public void stencilInitialLayout(@enumtype(VkImageLayout.class) int value) {
        segment.set(LAYOUT$stencilInitialLayout, OFFSET$stencilInitialLayout, value);
    }

    public @enumtype(VkImageLayout.class) int stencilFinalLayout() {
        return segment.get(LAYOUT$stencilFinalLayout, OFFSET$stencilFinalLayout);
    }

    public void stencilFinalLayout(@enumtype(VkImageLayout.class) int value) {
        segment.set(LAYOUT$stencilFinalLayout, OFFSET$stencilFinalLayout, value);
    }

    public static VkAttachmentDescriptionStencilLayout allocate(Arena arena) {
        return new VkAttachmentDescriptionStencilLayout(arena.allocate(LAYOUT));
    }
    
    public static VkAttachmentDescriptionStencilLayout[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkAttachmentDescriptionStencilLayout[] ret = new VkAttachmentDescriptionStencilLayout[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkAttachmentDescriptionStencilLayout(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkAttachmentDescriptionStencilLayout clone(Arena arena, VkAttachmentDescriptionStencilLayout src) {
        VkAttachmentDescriptionStencilLayout ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkAttachmentDescriptionStencilLayout[] clone(Arena arena, VkAttachmentDescriptionStencilLayout[] src) {
        VkAttachmentDescriptionStencilLayout[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("stencilInitialLayout"),
        ValueLayout.JAVA_INT.withName("stencilFinalLayout")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$stencilInitialLayout = PathElement.groupElement("stencilInitialLayout");
    public static final PathElement PATH$stencilFinalLayout = PathElement.groupElement("stencilFinalLayout");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$stencilInitialLayout = (OfInt) LAYOUT.select(PATH$stencilInitialLayout);
    public static final OfInt LAYOUT$stencilFinalLayout = (OfInt) LAYOUT.select(PATH$stencilFinalLayout);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$stencilInitialLayout = LAYOUT.byteOffset(PATH$stencilInitialLayout);
    public static final long OFFSET$stencilFinalLayout = LAYOUT.byteOffset(PATH$stencilFinalLayout);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$stencilInitialLayout = LAYOUT$stencilInitialLayout.byteSize();
    public static final long SIZE$stencilFinalLayout = LAYOUT$stencilFinalLayout.byteSize();
}
