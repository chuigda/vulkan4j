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

public record VkFramebufferCreateInfo(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.ADDRESS.withName("renderPass"),
        ValueLayout.JAVA_INT.withName("attachmentCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS).withName("pAttachments"),
        ValueLayout.JAVA_INT.withName("width"),
        ValueLayout.JAVA_INT.withName("height"),
        ValueLayout.JAVA_INT.withName("layers")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$flags = PathElement.groupElement("flags");
    public static final PathElement PATH$renderPass = PathElement.groupElement("renderPass");
    public static final PathElement PATH$attachmentCount = PathElement.groupElement("attachmentCount");
    public static final PathElement PATH$pAttachments = PathElement.groupElement("pAttachments");
    public static final PathElement PATH$width = PathElement.groupElement("width");
    public static final PathElement PATH$height = PathElement.groupElement("height");
    public static final PathElement PATH$layers = PathElement.groupElement("layers");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$flags = (OfInt) LAYOUT.select(PATH$flags);
    public static final AddressLayout LAYOUT$renderPass = (AddressLayout) LAYOUT.select(PATH$renderPass);
    public static final OfInt LAYOUT$attachmentCount = (OfInt) LAYOUT.select(PATH$attachmentCount);
    public static final AddressLayout LAYOUT$pAttachments = (AddressLayout) LAYOUT.select(PATH$pAttachments);
    public static final OfInt LAYOUT$width = (OfInt) LAYOUT.select(PATH$width);
    public static final OfInt LAYOUT$height = (OfInt) LAYOUT.select(PATH$height);
    public static final OfInt LAYOUT$layers = (OfInt) LAYOUT.select(PATH$layers);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$renderPass = LAYOUT.byteOffset(PATH$renderPass);
    public static final long OFFSET$attachmentCount = LAYOUT.byteOffset(PATH$attachmentCount);
    public static final long OFFSET$pAttachments = LAYOUT.byteOffset(PATH$pAttachments);
    public static final long OFFSET$width = LAYOUT.byteOffset(PATH$width);
    public static final long OFFSET$height = LAYOUT.byteOffset(PATH$height);
    public static final long OFFSET$layers = LAYOUT.byteOffset(PATH$layers);

    public VkFramebufferCreateInfo(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_FRAMEBUFFER_CREATE_INFO);
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

    public @enumtype(VkFramebufferCreateFlags.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public void flags(@enumtype(VkFramebufferCreateFlags.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
    }

    public VkRenderPass renderPass() {
        return new VkRenderPass(segment.asSlice(OFFSET$renderPass, LAYOUT$renderPass));
    }

    public void renderPass(VkRenderPass value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$renderPass, LAYOUT$renderPass.byteSize());
    }

    public @unsigned int attachmentCount() {
        return segment.get(LAYOUT$attachmentCount, OFFSET$attachmentCount);
    }

    public void attachmentCount(@unsigned int value) {
        segment.set(LAYOUT$attachmentCount, OFFSET$attachmentCount, value);
    }

    public @pointer(comment="VkImageView*") MemorySegment pAttachmentsRaw() {
        return segment.get(LAYOUT$pAttachments, OFFSET$pAttachments);
    }

    public void pAttachmentsRaw(@pointer(comment="VkImageView*") MemorySegment value) {
        segment.set(LAYOUT$pAttachments, OFFSET$pAttachments, value);
    }
    
    public @nullable VkImageView pAttachments() {
        MemorySegment s = pAttachmentsRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkImageView(s);
    }

    public void pAttachments(@nullable VkImageView value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pAttachmentsRaw(s);
    }

    public @unsigned int width() {
        return segment.get(LAYOUT$width, OFFSET$width);
    }

    public void width(@unsigned int value) {
        segment.set(LAYOUT$width, OFFSET$width, value);
    }

    public @unsigned int height() {
        return segment.get(LAYOUT$height, OFFSET$height);
    }

    public void height(@unsigned int value) {
        segment.set(LAYOUT$height, OFFSET$height, value);
    }

    public @unsigned int layers() {
        return segment.get(LAYOUT$layers, OFFSET$layers);
    }

    public void layers(@unsigned int value) {
        segment.set(LAYOUT$layers, OFFSET$layers, value);
    }


    public static final class VkFramebufferCreateInfoFactory implements IFactory<VkFramebufferCreateInfo> {
        @Override
        public Class<VkFramebufferCreateInfo> clazz() {
            return VkFramebufferCreateInfo.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkFramebufferCreateInfo.LAYOUT;
        }

        @Override
        public VkFramebufferCreateInfo create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkFramebufferCreateInfo createUninit(MemorySegment segment) {
            return new VkFramebufferCreateInfo(segment);
        }
    }

    public static final VkFramebufferCreateInfoFactory FACTORY = new VkFramebufferCreateInfoFactory();
}
