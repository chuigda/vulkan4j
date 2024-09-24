package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.annotation.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.NativeLayout;
import tech.icey.vk4j.IFactory;

import static tech.icey.vk4j.enumtype.VkStructureType.*;

public record VkFramebufferAttachmentsCreateInfo(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("attachmentImageInfoCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkFramebufferAttachmentImageInfo.LAYOUT).withName("pAttachmentImageInfos")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$attachmentImageInfoCount = PathElement.groupElement("attachmentImageInfoCount");
    public static final PathElement PATH$pAttachmentImageInfos = PathElement.groupElement("pAttachmentImageInfos");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$attachmentImageInfoCount = (OfInt) LAYOUT.select(PATH$attachmentImageInfoCount);
    public static final AddressLayout LAYOUT$pAttachmentImageInfos = (AddressLayout) LAYOUT.select(PATH$pAttachmentImageInfos);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$attachmentImageInfoCount = LAYOUT.byteOffset(PATH$attachmentImageInfoCount);
    public static final long OFFSET$pAttachmentImageInfos = LAYOUT.byteOffset(PATH$pAttachmentImageInfos);

    public VkFramebufferAttachmentsCreateInfo(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_FRAMEBUFFER_ATTACHMENTS_CREATE_INFO);
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

    public @unsigned int attachmentImageInfoCount() {
        return segment.get(LAYOUT$attachmentImageInfoCount, OFFSET$attachmentImageInfoCount);
    }

    public void attachmentImageInfoCount(@unsigned int value) {
        segment.set(LAYOUT$attachmentImageInfoCount, OFFSET$attachmentImageInfoCount, value);
    }

    public @pointer(comment="VkFramebufferAttachmentImageInfo*") MemorySegment pAttachmentImageInfosRaw() {
        return segment.get(LAYOUT$pAttachmentImageInfos, OFFSET$pAttachmentImageInfos);
    }

    public void pAttachmentImageInfosRaw(@pointer(comment="VkFramebufferAttachmentImageInfo*") MemorySegment value) {
        segment.set(LAYOUT$pAttachmentImageInfos, OFFSET$pAttachmentImageInfos, value);
    }

    public @nullable VkFramebufferAttachmentImageInfo pAttachmentImageInfos() {
        MemorySegment s = pAttachmentImageInfosRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkFramebufferAttachmentImageInfo(s);
    }

    public void pAttachmentImageInfos(@nullable VkFramebufferAttachmentImageInfo value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pAttachmentImageInfosRaw(s);
    }


    public static final class Factory implements IFactory<VkFramebufferAttachmentsCreateInfo> {
        @Override
        public Class<VkFramebufferAttachmentsCreateInfo> clazz() {
            return VkFramebufferAttachmentsCreateInfo.class;
        }

        @Override
        public MemoryLayout layout() {
            return VkFramebufferAttachmentsCreateInfo.LAYOUT;
        }

        @Override
        public VkFramebufferAttachmentsCreateInfo create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkFramebufferAttachmentsCreateInfo createUninit(MemorySegment segment) {
            return new VkFramebufferAttachmentsCreateInfo(segment);
        }
    }

    public static final Factory FACTORY = new Factory();
}
