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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkRenderPassAttachmentBeginInfo.html"><code>VkRenderPassAttachmentBeginInfo</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkRenderPassAttachmentBeginInfo {
///     VkStructureType sType;
///     void const* pNext; // optional
///     uint32_t attachmentCount; // optional
///     VkImageView const* pAttachments;
/// } VkRenderPassAttachmentBeginInfo;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_RENDER_PASS_ATTACHMENT_BEGIN_INFO`
///
/// The {@link VkRenderPassAttachmentBeginInfo#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkRenderPassAttachmentBeginInfo#autoInit} to initialize these fields manually for
/// non-allocated instances.
///
/// ## Contracts
///
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to)
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkRenderPassAttachmentBeginInfo.html"><code>VkRenderPassAttachmentBeginInfo</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkRenderPassAttachmentBeginInfo(@NotNull MemorySegment segment) implements IPointer {
    public static VkRenderPassAttachmentBeginInfo allocate(Arena arena) {
        VkRenderPassAttachmentBeginInfo ret = new VkRenderPassAttachmentBeginInfo(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.RENDER_PASS_ATTACHMENT_BEGIN_INFO);
        return ret;
    }

    public static VkRenderPassAttachmentBeginInfo[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkRenderPassAttachmentBeginInfo[] ret = new VkRenderPassAttachmentBeginInfo[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkRenderPassAttachmentBeginInfo(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.RENDER_PASS_ATTACHMENT_BEGIN_INFO);
        }
        return ret;
    }

    public static VkRenderPassAttachmentBeginInfo clone(Arena arena, VkRenderPassAttachmentBeginInfo src) {
        VkRenderPassAttachmentBeginInfo ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkRenderPassAttachmentBeginInfo[] clone(Arena arena, VkRenderPassAttachmentBeginInfo[] src) {
        VkRenderPassAttachmentBeginInfo[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.RENDER_PASS_ATTACHMENT_BEGIN_INFO);
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

    /// Note: the returned {@link VkImageView.Buffer} does not have correct {@link VkImageView.Buffer#size}
    /// property. It's up to user to track the size of the buffer, and use
    /// {@link VkImageView.Buffer#reinterpret} to set the size before actually reading from or writing to the
    /// buffer.
    public @Nullable VkImageView.Buffer pAttachments() {
        MemorySegment s = pAttachmentsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkImageView.Buffer(s);
    }


    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("attachmentCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS).withName("pAttachments")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$attachmentCount = PathElement.groupElement("PATH$attachmentCount");
    public static final PathElement PATH$pAttachments = PathElement.groupElement("PATH$pAttachments");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$attachmentCount = (OfInt) LAYOUT.select(PATH$attachmentCount);
    public static final AddressLayout LAYOUT$pAttachments = (AddressLayout) LAYOUT.select(PATH$pAttachments);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$attachmentCount = LAYOUT$attachmentCount.byteSize();
    public static final long SIZE$pAttachments = LAYOUT$pAttachments.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$attachmentCount = LAYOUT.byteOffset(PATH$attachmentCount);
    public static final long OFFSET$pAttachments = LAYOUT.byteOffset(PATH$pAttachments);
}
