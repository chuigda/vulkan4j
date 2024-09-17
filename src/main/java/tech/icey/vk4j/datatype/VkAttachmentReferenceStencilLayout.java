package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.annotations.*;
import tech.icey.vk4j.array.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import tech.icey.vk4j.ptr.*;
import tech.icey.vk4j.NativeLayout;
import tech.icey.vk4j.IFactory;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

public record VkAttachmentReferenceStencilLayout(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("stencilLayout")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$stencilLayout = PathElement.groupElement("stencilLayout");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$stencilLayout = (OfInt) LAYOUT.select(PATH$stencilLayout);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$stencilLayout = LAYOUT.byteOffset(PATH$stencilLayout);

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

    public @enumtype(VkImageLayout.class) int stencilLayout() {
        return segment.get(LAYOUT$stencilLayout, OFFSET$stencilLayout);
    }

    public void stencilLayout(@enumtype(VkImageLayout.class) int value) {
        segment.set(LAYOUT$stencilLayout, OFFSET$stencilLayout, value);
    }


    public static final class VkAttachmentReferenceStencilLayoutFactory implements IFactory<VkAttachmentReferenceStencilLayout> {
        @Override
        public Class<VkAttachmentReferenceStencilLayout> clazz() {
            return VkAttachmentReferenceStencilLayout.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkAttachmentReferenceStencilLayout.LAYOUT;
        }

        @Override
        public VkAttachmentReferenceStencilLayout create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkAttachmentReferenceStencilLayout createUninit(MemorySegment segment) {
            return new VkAttachmentReferenceStencilLayout(segment);
        }
    }

    public static final VkAttachmentReferenceStencilLayoutFactory FACTORY = new VkAttachmentReferenceStencilLayoutFactory();
}
