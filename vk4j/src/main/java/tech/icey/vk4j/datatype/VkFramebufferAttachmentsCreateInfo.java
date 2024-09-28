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

/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkFramebufferAttachmentsCreateInfo.html">VkFramebufferAttachmentsCreateInfo</a>
public record VkFramebufferAttachmentsCreateInfo(MemorySegment segment) implements IPointer {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("attachmentImageInfoCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkFramebufferAttachmentImageInfo.LAYOUT).withName("pAttachmentImageInfos")
    );
    public static final long SIZE = LAYOUT.byteSize();

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

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$attachmentImageInfoCount = LAYOUT$attachmentImageInfoCount.byteSize();
    public static final long SIZE$pAttachmentImageInfos = LAYOUT$pAttachmentImageInfos.byteSize();

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

    public void pNext(IPointer pointer) {
        pNext(pointer.segment());
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

    /// Note: this function is {@link unsafe} because it's up to user to provide the correct count of elements.
    @unsafe
    public @nullable VkFramebufferAttachmentImageInfo[] pAttachmentImageInfos(int assumedCount) {
        MemorySegment s = pAttachmentImageInfosRaw().reinterpret(assumedCount * VkFramebufferAttachmentImageInfo.SIZE);
        VkFramebufferAttachmentImageInfo[] arr = new VkFramebufferAttachmentImageInfo[assumedCount];
        for (int i = 0; i < assumedCount; i++) {
            arr[i] = new VkFramebufferAttachmentImageInfo(s.asSlice(i * VkFramebufferAttachmentImageInfo.SIZE, VkFramebufferAttachmentImageInfo.SIZE));
        }
        return arr;
    }

    public void pAttachmentImageInfos(@nullable VkFramebufferAttachmentImageInfo value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pAttachmentImageInfosRaw(s);
    }

    public static VkFramebufferAttachmentsCreateInfo allocate(Arena arena) {
        return new VkFramebufferAttachmentsCreateInfo(arena.allocate(LAYOUT));
    }
    
    public static VkFramebufferAttachmentsCreateInfo[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkFramebufferAttachmentsCreateInfo[] ret = new VkFramebufferAttachmentsCreateInfo[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkFramebufferAttachmentsCreateInfo(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
}
