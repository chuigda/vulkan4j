package cc.design7.vulkan.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import cc.design7.ffm.IPointer;
import cc.design7.ffm.NativeLayout;
import cc.design7.ffm.annotation.*;
import cc.design7.ffm.ptr.*;
import cc.design7.vulkan.bitmask.*;
import cc.design7.vulkan.datatype.*;
import cc.design7.vulkan.enumtype.*;
import static cc.design7.vulkan.VkConstants.*;

/// Represents a pointer to a {@code VkFramebufferAttachmentsCreateInfo} structure in native memory.
///
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to)
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkFramebufferAttachmentsCreateInfo.html">VkFramebufferAttachmentsCreateInfo</a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkFramebufferAttachmentsCreateInfo(@NotNull MemorySegment segment) implements IPointer {
    public VkFramebufferAttachmentsCreateInfo {
        sType(VkStructureType.FRAMEBUFFER_ATTACHMENTS_CREATE_INFO);
    }

    public static VkFramebufferAttachmentsCreateInfo allocate(Arena arena) {
        return new VkFramebufferAttachmentsCreateInfo(arena.allocate(LAYOUT));
    }

    public static VkFramebufferAttachmentsCreateInfo[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkFramebufferAttachmentsCreateInfo[] ret = new VkFramebufferAttachmentsCreateInfo[count];
        for (int i = 0; i < count; i ++) {
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
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("attachmentImageInfoCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkFramebufferAttachmentImageInfo.LAYOUT).withName("pAttachmentImageInfos")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$attachmentImageInfoCount = PathElement.groupElement("PATH$attachmentImageInfoCount");
    public static final PathElement PATH$pAttachmentImageInfos = PathElement.groupElement("PATH$pAttachmentImageInfos");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$attachmentImageInfoCount = (OfInt) LAYOUT.select(PATH$attachmentImageInfoCount);
    public static final AddressLayout LAYOUT$pAttachmentImageInfos = (AddressLayout) LAYOUT.select(PATH$pAttachmentImageInfos);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$attachmentImageInfoCount = LAYOUT$attachmentImageInfoCount.byteSize();
    public static final long SIZE$pAttachmentImageInfos = LAYOUT$pAttachmentImageInfos.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$attachmentImageInfoCount = LAYOUT.byteOffset(PATH$attachmentImageInfoCount);
    public static final long OFFSET$pAttachmentImageInfos = LAYOUT.byteOffset(PATH$pAttachmentImageInfos);

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

    public @Nullable VkFramebufferAttachmentImageInfo pAttachmentImageInfos() {
        MemorySegment s = pAttachmentImageInfosRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkFramebufferAttachmentImageInfo(s);
    }

    public void pAttachmentImageInfos(@Nullable VkFramebufferAttachmentImageInfo value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pAttachmentImageInfosRaw(s);
    }

    @unsafe public @Nullable VkFramebufferAttachmentImageInfo[] pAttachmentImageInfos(int assumedCount) {
        MemorySegment s = pAttachmentImageInfosRaw();
        if (s.address() == 0) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkFramebufferAttachmentImageInfo.SIZE);
        VkFramebufferAttachmentImageInfo[] ret = new VkFramebufferAttachmentImageInfo[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkFramebufferAttachmentImageInfo(s.asSlice(i * VkFramebufferAttachmentImageInfo.SIZE, VkFramebufferAttachmentImageInfo.SIZE));
        }
        return ret;
    }

}
