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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkSubpassDescription.html">VkSubpassDescription</a>
@ValueBasedCandidate
public record VkSubpassDescription(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$flags = ValueLayout.JAVA_INT.withName("flags");
    public static final OfInt LAYOUT$pipelineBindPoint = ValueLayout.JAVA_INT.withName("pipelineBindPoint");
    public static final OfInt LAYOUT$inputAttachmentCount = ValueLayout.JAVA_INT.withName("inputAttachmentCount");
    public static final AddressLayout LAYOUT$pInputAttachments = ValueLayout.ADDRESS.withTargetLayout(VkAttachmentReference.LAYOUT).withName("pInputAttachments");
    public static final OfInt LAYOUT$colorAttachmentCount = ValueLayout.JAVA_INT.withName("colorAttachmentCount");
    public static final AddressLayout LAYOUT$pColorAttachments = ValueLayout.ADDRESS.withTargetLayout(VkAttachmentReference.LAYOUT).withName("pColorAttachments");
    public static final AddressLayout LAYOUT$pResolveAttachments = ValueLayout.ADDRESS.withTargetLayout(VkAttachmentReference.LAYOUT).withName("pResolveAttachments");
    public static final AddressLayout LAYOUT$pDepthStencilAttachment = ValueLayout.ADDRESS.withTargetLayout(VkAttachmentReference.LAYOUT).withName("pDepthStencilAttachment");
    public static final OfInt LAYOUT$preserveAttachmentCount = ValueLayout.JAVA_INT.withName("preserveAttachmentCount");
    public static final AddressLayout LAYOUT$pPreserveAttachments = ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT).withName("pPreserveAttachments");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$flags, LAYOUT$pipelineBindPoint, LAYOUT$inputAttachmentCount, LAYOUT$pInputAttachments, LAYOUT$colorAttachmentCount, LAYOUT$pColorAttachments, LAYOUT$pResolveAttachments, LAYOUT$pDepthStencilAttachment, LAYOUT$preserveAttachmentCount, LAYOUT$pPreserveAttachments);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkSubpassDescription allocate(Arena arena) {
        return new VkSubpassDescription(arena.allocate(LAYOUT));
    }

    public static VkSubpassDescription[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkSubpassDescription[] ret = new VkSubpassDescription[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkSubpassDescription(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkSubpassDescription clone(Arena arena, VkSubpassDescription src) {
        VkSubpassDescription ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkSubpassDescription[] clone(Arena arena, VkSubpassDescription[] src) {
        VkSubpassDescription[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$flags = PathElement.groupElement("PATH$flags");
    public static final PathElement PATH$pipelineBindPoint = PathElement.groupElement("PATH$pipelineBindPoint");
    public static final PathElement PATH$inputAttachmentCount = PathElement.groupElement("PATH$inputAttachmentCount");
    public static final PathElement PATH$pInputAttachments = PathElement.groupElement("PATH$pInputAttachments");
    public static final PathElement PATH$colorAttachmentCount = PathElement.groupElement("PATH$colorAttachmentCount");
    public static final PathElement PATH$pColorAttachments = PathElement.groupElement("PATH$pColorAttachments");
    public static final PathElement PATH$pResolveAttachments = PathElement.groupElement("PATH$pResolveAttachments");
    public static final PathElement PATH$pDepthStencilAttachment = PathElement.groupElement("PATH$pDepthStencilAttachment");
    public static final PathElement PATH$preserveAttachmentCount = PathElement.groupElement("PATH$preserveAttachmentCount");
    public static final PathElement PATH$pPreserveAttachments = PathElement.groupElement("PATH$pPreserveAttachments");

    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$pipelineBindPoint = LAYOUT$pipelineBindPoint.byteSize();
    public static final long SIZE$inputAttachmentCount = LAYOUT$inputAttachmentCount.byteSize();
    public static final long SIZE$pInputAttachments = LAYOUT$pInputAttachments.byteSize();
    public static final long SIZE$colorAttachmentCount = LAYOUT$colorAttachmentCount.byteSize();
    public static final long SIZE$pColorAttachments = LAYOUT$pColorAttachments.byteSize();
    public static final long SIZE$pResolveAttachments = LAYOUT$pResolveAttachments.byteSize();
    public static final long SIZE$pDepthStencilAttachment = LAYOUT$pDepthStencilAttachment.byteSize();
    public static final long SIZE$preserveAttachmentCount = LAYOUT$preserveAttachmentCount.byteSize();
    public static final long SIZE$pPreserveAttachments = LAYOUT$pPreserveAttachments.byteSize();

    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$pipelineBindPoint = LAYOUT.byteOffset(PATH$pipelineBindPoint);
    public static final long OFFSET$inputAttachmentCount = LAYOUT.byteOffset(PATH$inputAttachmentCount);
    public static final long OFFSET$pInputAttachments = LAYOUT.byteOffset(PATH$pInputAttachments);
    public static final long OFFSET$colorAttachmentCount = LAYOUT.byteOffset(PATH$colorAttachmentCount);
    public static final long OFFSET$pColorAttachments = LAYOUT.byteOffset(PATH$pColorAttachments);
    public static final long OFFSET$pResolveAttachments = LAYOUT.byteOffset(PATH$pResolveAttachments);
    public static final long OFFSET$pDepthStencilAttachment = LAYOUT.byteOffset(PATH$pDepthStencilAttachment);
    public static final long OFFSET$preserveAttachmentCount = LAYOUT.byteOffset(PATH$preserveAttachmentCount);
    public static final long OFFSET$pPreserveAttachments = LAYOUT.byteOffset(PATH$pPreserveAttachments);

    public @enumtype(VkSubpassDescriptionFlags.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public void flags(@enumtype(VkSubpassDescriptionFlags.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
    }

    public @enumtype(VkPipelineBindPoint.class) int pipelineBindPoint() {
        return segment.get(LAYOUT$pipelineBindPoint, OFFSET$pipelineBindPoint);
    }

    public void pipelineBindPoint(@enumtype(VkPipelineBindPoint.class) int value) {
        segment.set(LAYOUT$pipelineBindPoint, OFFSET$pipelineBindPoint, value);
    }

    public @unsigned int inputAttachmentCount() {
        return segment.get(LAYOUT$inputAttachmentCount, OFFSET$inputAttachmentCount);
    }

    public void inputAttachmentCount(@unsigned int value) {
        segment.set(LAYOUT$inputAttachmentCount, OFFSET$inputAttachmentCount, value);
    }

    public @pointer(comment="VkAttachmentReference*") MemorySegment pInputAttachmentsRaw() {
        return segment.get(LAYOUT$pInputAttachments, OFFSET$pInputAttachments);
    }

    public void pInputAttachmentsRaw(@pointer(comment="VkAttachmentReference*") MemorySegment value) {
        segment.set(LAYOUT$pInputAttachments, OFFSET$pInputAttachments, value);
    }

    public @Nullable VkAttachmentReference pInputAttachments() {
        MemorySegment s = pInputAttachmentsRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkAttachmentReference(s);
    }

    public void pInputAttachments(@Nullable VkAttachmentReference value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pInputAttachmentsRaw(s);
    }

    @unsafe public @Nullable VkAttachmentReference[] pInputAttachments(int assumedCount) {
        MemorySegment s = pInputAttachmentsRaw();
        if (s.address() == 0) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkAttachmentReference.SIZE);
        VkAttachmentReference[] ret = new VkAttachmentReference[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkAttachmentReference(s.asSlice(i * VkAttachmentReference.SIZE, VkAttachmentReference.SIZE));
        }
        return ret;
    }

    public @unsigned int colorAttachmentCount() {
        return segment.get(LAYOUT$colorAttachmentCount, OFFSET$colorAttachmentCount);
    }

    public void colorAttachmentCount(@unsigned int value) {
        segment.set(LAYOUT$colorAttachmentCount, OFFSET$colorAttachmentCount, value);
    }

    public @pointer(comment="VkAttachmentReference*") MemorySegment pColorAttachmentsRaw() {
        return segment.get(LAYOUT$pColorAttachments, OFFSET$pColorAttachments);
    }

    public void pColorAttachmentsRaw(@pointer(comment="VkAttachmentReference*") MemorySegment value) {
        segment.set(LAYOUT$pColorAttachments, OFFSET$pColorAttachments, value);
    }

    public @Nullable VkAttachmentReference pColorAttachments() {
        MemorySegment s = pColorAttachmentsRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkAttachmentReference(s);
    }

    public void pColorAttachments(@Nullable VkAttachmentReference value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pColorAttachmentsRaw(s);
    }

    @unsafe public @Nullable VkAttachmentReference[] pColorAttachments(int assumedCount) {
        MemorySegment s = pColorAttachmentsRaw();
        if (s.address() == 0) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkAttachmentReference.SIZE);
        VkAttachmentReference[] ret = new VkAttachmentReference[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkAttachmentReference(s.asSlice(i * VkAttachmentReference.SIZE, VkAttachmentReference.SIZE));
        }
        return ret;
    }

    public @pointer(comment="VkAttachmentReference*") MemorySegment pResolveAttachmentsRaw() {
        return segment.get(LAYOUT$pResolveAttachments, OFFSET$pResolveAttachments);
    }

    public void pResolveAttachmentsRaw(@pointer(comment="VkAttachmentReference*") MemorySegment value) {
        segment.set(LAYOUT$pResolveAttachments, OFFSET$pResolveAttachments, value);
    }

    public @Nullable VkAttachmentReference pResolveAttachments() {
        MemorySegment s = pResolveAttachmentsRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkAttachmentReference(s);
    }

    public void pResolveAttachments(@Nullable VkAttachmentReference value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pResolveAttachmentsRaw(s);
    }

    @unsafe public @Nullable VkAttachmentReference[] pResolveAttachments(int assumedCount) {
        MemorySegment s = pResolveAttachmentsRaw();
        if (s.address() == 0) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkAttachmentReference.SIZE);
        VkAttachmentReference[] ret = new VkAttachmentReference[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkAttachmentReference(s.asSlice(i * VkAttachmentReference.SIZE, VkAttachmentReference.SIZE));
        }
        return ret;
    }

    public @pointer(comment="VkAttachmentReference*") MemorySegment pDepthStencilAttachmentRaw() {
        return segment.get(LAYOUT$pDepthStencilAttachment, OFFSET$pDepthStencilAttachment);
    }

    public void pDepthStencilAttachmentRaw(@pointer(comment="VkAttachmentReference*") MemorySegment value) {
        segment.set(LAYOUT$pDepthStencilAttachment, OFFSET$pDepthStencilAttachment, value);
    }

    public @Nullable VkAttachmentReference pDepthStencilAttachment() {
        MemorySegment s = pDepthStencilAttachmentRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkAttachmentReference(s);
    }

    public void pDepthStencilAttachment(@Nullable VkAttachmentReference value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pDepthStencilAttachmentRaw(s);
    }

    @unsafe public @Nullable VkAttachmentReference[] pDepthStencilAttachment(int assumedCount) {
        MemorySegment s = pDepthStencilAttachmentRaw();
        if (s.address() == 0) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkAttachmentReference.SIZE);
        VkAttachmentReference[] ret = new VkAttachmentReference[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkAttachmentReference(s.asSlice(i * VkAttachmentReference.SIZE, VkAttachmentReference.SIZE));
        }
        return ret;
    }

    public @unsigned int preserveAttachmentCount() {
        return segment.get(LAYOUT$preserveAttachmentCount, OFFSET$preserveAttachmentCount);
    }

    public void preserveAttachmentCount(@unsigned int value) {
        segment.set(LAYOUT$preserveAttachmentCount, OFFSET$preserveAttachmentCount, value);
    }

    public @pointer(comment="int*") MemorySegment pPreserveAttachmentsRaw() {
        return segment.get(LAYOUT$pPreserveAttachments, OFFSET$pPreserveAttachments);
    }

    public void pPreserveAttachmentsRaw(@pointer(comment="int*") MemorySegment value) {
        segment.set(LAYOUT$pPreserveAttachments, OFFSET$pPreserveAttachments, value);
    }

    /// Note: the returned {@link IntPtr} does not have correct
    /// {@link IntPtr#size} property. It's up to user to track the size of the buffer,
    /// and use {@link IntPtr#reinterpret} to set the size before actually reading from or
    /// writing to the buffer.
    public @Nullable @unsigned IntPtr pPreserveAttachments() {
        MemorySegment s = pPreserveAttachmentsRaw();
        if (s.address() == 0) {
            return null;
        }
        return new IntPtr(s);
    }

    public void pPreserveAttachments(@Nullable @unsigned IntPtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pPreserveAttachmentsRaw(s);
    }

}
