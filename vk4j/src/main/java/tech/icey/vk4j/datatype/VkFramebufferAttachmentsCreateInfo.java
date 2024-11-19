package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import org.jetbrains.annotations.Nullable;
import tech.icey.panama.IPointer;
import tech.icey.panama.NativeLayout;
import tech.icey.panama.annotation.*;
import tech.icey.panama.buffer.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

/// {@snippet lang=c :
/// typedef struct VkFramebufferAttachmentsCreateInfo {
///     VkStructureType sType;
///     const void* pNext;
///     uint32_t attachmentImageInfoCount;
///     const VkFramebufferAttachmentImageInfo* pAttachmentImageInfos;
/// } VkFramebufferAttachmentsCreateInfo;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkFramebufferAttachmentsCreateInfo.html">VkFramebufferAttachmentsCreateInfo</a>
public record VkFramebufferAttachmentsCreateInfo(MemorySegment segment) implements IPointer {
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

    public void pNext(@Nullable IPointer pointer) {
        pNext(pointer == null ? MemorySegment.NULL : pointer.segment());
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

    public @Nullable VkFramebufferAttachmentImageInfo pAttachmentImageInfos() {
        MemorySegment s = pAttachmentImageInfosRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkFramebufferAttachmentImageInfo(s);
    }

    /// Note: this function is {@link unsafe} because it's up to user to provide the correct count of elements.
    @unsafe
    public @Nullable VkFramebufferAttachmentImageInfo[] pAttachmentImageInfos(int assumedCount) {
        MemorySegment s = pAttachmentImageInfosRaw().reinterpret(assumedCount * VkFramebufferAttachmentImageInfo.SIZE);
        VkFramebufferAttachmentImageInfo[] arr = new VkFramebufferAttachmentImageInfo[assumedCount];
        for (int i = 0; i < assumedCount; i++) {
            arr[i] = new VkFramebufferAttachmentImageInfo(s.asSlice(i * VkFramebufferAttachmentImageInfo.SIZE, VkFramebufferAttachmentImageInfo.SIZE));
        }
        return arr;
    }

    public void pAttachmentImageInfos(@Nullable VkFramebufferAttachmentImageInfo value) {
        pAttachmentImageInfosRaw(value == null ? MemorySegment.NULL : value.segment());
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

    public static VkFramebufferAttachmentsCreateInfo clone(Arena arena, VkFramebufferAttachmentsCreateInfo src) {
        VkFramebufferAttachmentsCreateInfo ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkFramebufferAttachmentsCreateInfo[] clone(Arena arena, VkFramebufferAttachmentsCreateInfo[] src) {
        VkFramebufferAttachmentsCreateInfo[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

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
}
