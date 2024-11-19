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
/// typedef struct VkSubpassDescription2 {
///     VkStructureType sType;
///     const void* pNext;
///     VkSubpassDescriptionFlags flags;
///     VkPipelineBindPoint pipelineBindPoint;
///     uint32_t viewMask;
///     uint32_t inputAttachmentCount;
///     const VkAttachmentReference2* pInputAttachments;
///     uint32_t colorAttachmentCount;
///     const VkAttachmentReference2* pColorAttachments;
///     const VkAttachmentReference2* pResolveAttachments;
///     const VkAttachmentReference2* pDepthStencilAttachment;
///     uint32_t preserveAttachmentCount;
///     const uint32_t* pPreserveAttachments;
/// } VkSubpassDescription2;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkSubpassDescription2.html">VkSubpassDescription2</a>
public record VkSubpassDescription2(MemorySegment segment) implements IPointer {
    public VkSubpassDescription2(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_SUBPASS_DESCRIPTION_2);
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

    public @unsigned int viewMask() {
        return segment.get(LAYOUT$viewMask, OFFSET$viewMask);
    }

    public void viewMask(@unsigned int value) {
        segment.set(LAYOUT$viewMask, OFFSET$viewMask, value);
    }

    public @unsigned int inputAttachmentCount() {
        return segment.get(LAYOUT$inputAttachmentCount, OFFSET$inputAttachmentCount);
    }

    public void inputAttachmentCount(@unsigned int value) {
        segment.set(LAYOUT$inputAttachmentCount, OFFSET$inputAttachmentCount, value);
    }

    public @pointer(comment="VkAttachmentReference2*") MemorySegment pInputAttachmentsRaw() {
        return segment.get(LAYOUT$pInputAttachments, OFFSET$pInputAttachments);
    }

    public void pInputAttachmentsRaw(@pointer(comment="VkAttachmentReference2*") MemorySegment value) {
        segment.set(LAYOUT$pInputAttachments, OFFSET$pInputAttachments, value);
    }

    public @Nullable VkAttachmentReference2 pInputAttachments() {
        MemorySegment s = pInputAttachmentsRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkAttachmentReference2(s);
    }

    /// Note: this function is {@link unsafe} because it's up to user to provide the correct count of elements.
    @unsafe
    public @Nullable VkAttachmentReference2[] pInputAttachments(int assumedCount) {
        MemorySegment s = pInputAttachmentsRaw().reinterpret(assumedCount * VkAttachmentReference2.SIZE);
        VkAttachmentReference2[] arr = new VkAttachmentReference2[assumedCount];
        for (int i = 0; i < assumedCount; i++) {
            arr[i] = new VkAttachmentReference2(s.asSlice(i * VkAttachmentReference2.SIZE, VkAttachmentReference2.SIZE));
        }
        return arr;
    }

    public void pInputAttachments(@Nullable VkAttachmentReference2 value) {
        pInputAttachmentsRaw(value == null ? MemorySegment.NULL : value.segment());
    }

    public @unsigned int colorAttachmentCount() {
        return segment.get(LAYOUT$colorAttachmentCount, OFFSET$colorAttachmentCount);
    }

    public void colorAttachmentCount(@unsigned int value) {
        segment.set(LAYOUT$colorAttachmentCount, OFFSET$colorAttachmentCount, value);
    }

    public @pointer(comment="VkAttachmentReference2*") MemorySegment pColorAttachmentsRaw() {
        return segment.get(LAYOUT$pColorAttachments, OFFSET$pColorAttachments);
    }

    public void pColorAttachmentsRaw(@pointer(comment="VkAttachmentReference2*") MemorySegment value) {
        segment.set(LAYOUT$pColorAttachments, OFFSET$pColorAttachments, value);
    }

    public @Nullable VkAttachmentReference2 pColorAttachments() {
        MemorySegment s = pColorAttachmentsRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkAttachmentReference2(s);
    }

    /// Note: this function is {@link unsafe} because it's up to user to provide the correct count of elements.
    @unsafe
    public @Nullable VkAttachmentReference2[] pColorAttachments(int assumedCount) {
        MemorySegment s = pColorAttachmentsRaw().reinterpret(assumedCount * VkAttachmentReference2.SIZE);
        VkAttachmentReference2[] arr = new VkAttachmentReference2[assumedCount];
        for (int i = 0; i < assumedCount; i++) {
            arr[i] = new VkAttachmentReference2(s.asSlice(i * VkAttachmentReference2.SIZE, VkAttachmentReference2.SIZE));
        }
        return arr;
    }

    public void pColorAttachments(@Nullable VkAttachmentReference2 value) {
        pColorAttachmentsRaw(value == null ? MemorySegment.NULL : value.segment());
    }

    public @pointer(comment="VkAttachmentReference2*") MemorySegment pResolveAttachmentsRaw() {
        return segment.get(LAYOUT$pResolveAttachments, OFFSET$pResolveAttachments);
    }

    public void pResolveAttachmentsRaw(@pointer(comment="VkAttachmentReference2*") MemorySegment value) {
        segment.set(LAYOUT$pResolveAttachments, OFFSET$pResolveAttachments, value);
    }

    public @Nullable VkAttachmentReference2 pResolveAttachments() {
        MemorySegment s = pResolveAttachmentsRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkAttachmentReference2(s);
    }

    /// Note: this function is {@link unsafe} because it's up to user to provide the correct count of elements.
    @unsafe
    public @Nullable VkAttachmentReference2[] pResolveAttachments(int assumedCount) {
        MemorySegment s = pResolveAttachmentsRaw().reinterpret(assumedCount * VkAttachmentReference2.SIZE);
        VkAttachmentReference2[] arr = new VkAttachmentReference2[assumedCount];
        for (int i = 0; i < assumedCount; i++) {
            arr[i] = new VkAttachmentReference2(s.asSlice(i * VkAttachmentReference2.SIZE, VkAttachmentReference2.SIZE));
        }
        return arr;
    }

    public void pResolveAttachments(@Nullable VkAttachmentReference2 value) {
        pResolveAttachmentsRaw(value == null ? MemorySegment.NULL : value.segment());
    }

    public @pointer(comment="VkAttachmentReference2*") MemorySegment pDepthStencilAttachmentRaw() {
        return segment.get(LAYOUT$pDepthStencilAttachment, OFFSET$pDepthStencilAttachment);
    }

    public void pDepthStencilAttachmentRaw(@pointer(comment="VkAttachmentReference2*") MemorySegment value) {
        segment.set(LAYOUT$pDepthStencilAttachment, OFFSET$pDepthStencilAttachment, value);
    }

    public @Nullable VkAttachmentReference2 pDepthStencilAttachment() {
        MemorySegment s = pDepthStencilAttachmentRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkAttachmentReference2(s);
    }

    /// Note: this function is {@link unsafe} because it's up to user to provide the correct count of elements.
    @unsafe
    public @Nullable VkAttachmentReference2[] pDepthStencilAttachment(int assumedCount) {
        MemorySegment s = pDepthStencilAttachmentRaw().reinterpret(assumedCount * VkAttachmentReference2.SIZE);
        VkAttachmentReference2[] arr = new VkAttachmentReference2[assumedCount];
        for (int i = 0; i < assumedCount; i++) {
            arr[i] = new VkAttachmentReference2(s.asSlice(i * VkAttachmentReference2.SIZE, VkAttachmentReference2.SIZE));
        }
        return arr;
    }

    public void pDepthStencilAttachment(@Nullable VkAttachmentReference2 value) {
        pDepthStencilAttachmentRaw(value == null ? MemorySegment.NULL : value.segment());
    }

    public @unsigned int preserveAttachmentCount() {
        return segment.get(LAYOUT$preserveAttachmentCount, OFFSET$preserveAttachmentCount);
    }

    public void preserveAttachmentCount(@unsigned int value) {
        segment.set(LAYOUT$preserveAttachmentCount, OFFSET$preserveAttachmentCount, value);
    }

    public @pointer(comment="uint32_t*") MemorySegment pPreserveAttachmentsRaw() {
        return segment.get(LAYOUT$pPreserveAttachments, OFFSET$pPreserveAttachments);
    }

    public void pPreserveAttachmentsRaw(@pointer(comment="uint32_t*") MemorySegment value) {
        segment.set(LAYOUT$pPreserveAttachments, OFFSET$pPreserveAttachments, value);
    }

    /// Note: the returned {@link IntBuffer} does not have correct
    /// {@link IntBuffer#size} property. It's up to user to track the size of the buffer,
    /// and use {@link IntBuffer#reinterpret} to set the size before actually
    /// {@link IntBuffer#read}ing or
    /// {@link IntBuffer#write}ing the buffer.
    public @Nullable @unsigned IntBuffer pPreserveAttachments() {
        MemorySegment s = pPreserveAttachmentsRaw();
        return s.address() == 0 ? null : new IntBuffer(s);
    }

    public void pPreserveAttachments(@Nullable @unsigned IntBuffer value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pPreserveAttachmentsRaw(s);
    }

    public static VkSubpassDescription2 allocate(Arena arena) {
        return new VkSubpassDescription2(arena.allocate(LAYOUT));
    }

    public static VkSubpassDescription2[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkSubpassDescription2[] ret = new VkSubpassDescription2[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkSubpassDescription2(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkSubpassDescription2 clone(Arena arena, VkSubpassDescription2 src) {
        VkSubpassDescription2 ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkSubpassDescription2[] clone(Arena arena, VkSubpassDescription2[] src) {
        VkSubpassDescription2[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("pipelineBindPoint"),
        ValueLayout.JAVA_INT.withName("viewMask"),
        ValueLayout.JAVA_INT.withName("inputAttachmentCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkAttachmentReference2.LAYOUT).withName("pInputAttachments"),
        ValueLayout.JAVA_INT.withName("colorAttachmentCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkAttachmentReference2.LAYOUT).withName("pColorAttachments"),
        ValueLayout.ADDRESS.withTargetLayout(VkAttachmentReference2.LAYOUT).withName("pResolveAttachments"),
        ValueLayout.ADDRESS.withTargetLayout(VkAttachmentReference2.LAYOUT).withName("pDepthStencilAttachment"),
        ValueLayout.JAVA_INT.withName("preserveAttachmentCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT).withName("pPreserveAttachments")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$flags = PathElement.groupElement("flags");
    public static final PathElement PATH$pipelineBindPoint = PathElement.groupElement("pipelineBindPoint");
    public static final PathElement PATH$viewMask = PathElement.groupElement("viewMask");
    public static final PathElement PATH$inputAttachmentCount = PathElement.groupElement("inputAttachmentCount");
    public static final PathElement PATH$pInputAttachments = PathElement.groupElement("pInputAttachments");
    public static final PathElement PATH$colorAttachmentCount = PathElement.groupElement("colorAttachmentCount");
    public static final PathElement PATH$pColorAttachments = PathElement.groupElement("pColorAttachments");
    public static final PathElement PATH$pResolveAttachments = PathElement.groupElement("pResolveAttachments");
    public static final PathElement PATH$pDepthStencilAttachment = PathElement.groupElement("pDepthStencilAttachment");
    public static final PathElement PATH$preserveAttachmentCount = PathElement.groupElement("preserveAttachmentCount");
    public static final PathElement PATH$pPreserveAttachments = PathElement.groupElement("pPreserveAttachments");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$flags = (OfInt) LAYOUT.select(PATH$flags);
    public static final OfInt LAYOUT$pipelineBindPoint = (OfInt) LAYOUT.select(PATH$pipelineBindPoint);
    public static final OfInt LAYOUT$viewMask = (OfInt) LAYOUT.select(PATH$viewMask);
    public static final OfInt LAYOUT$inputAttachmentCount = (OfInt) LAYOUT.select(PATH$inputAttachmentCount);
    public static final AddressLayout LAYOUT$pInputAttachments = (AddressLayout) LAYOUT.select(PATH$pInputAttachments);
    public static final OfInt LAYOUT$colorAttachmentCount = (OfInt) LAYOUT.select(PATH$colorAttachmentCount);
    public static final AddressLayout LAYOUT$pColorAttachments = (AddressLayout) LAYOUT.select(PATH$pColorAttachments);
    public static final AddressLayout LAYOUT$pResolveAttachments = (AddressLayout) LAYOUT.select(PATH$pResolveAttachments);
    public static final AddressLayout LAYOUT$pDepthStencilAttachment = (AddressLayout) LAYOUT.select(PATH$pDepthStencilAttachment);
    public static final OfInt LAYOUT$preserveAttachmentCount = (OfInt) LAYOUT.select(PATH$preserveAttachmentCount);
    public static final AddressLayout LAYOUT$pPreserveAttachments = (AddressLayout) LAYOUT.select(PATH$pPreserveAttachments);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$pipelineBindPoint = LAYOUT.byteOffset(PATH$pipelineBindPoint);
    public static final long OFFSET$viewMask = LAYOUT.byteOffset(PATH$viewMask);
    public static final long OFFSET$inputAttachmentCount = LAYOUT.byteOffset(PATH$inputAttachmentCount);
    public static final long OFFSET$pInputAttachments = LAYOUT.byteOffset(PATH$pInputAttachments);
    public static final long OFFSET$colorAttachmentCount = LAYOUT.byteOffset(PATH$colorAttachmentCount);
    public static final long OFFSET$pColorAttachments = LAYOUT.byteOffset(PATH$pColorAttachments);
    public static final long OFFSET$pResolveAttachments = LAYOUT.byteOffset(PATH$pResolveAttachments);
    public static final long OFFSET$pDepthStencilAttachment = LAYOUT.byteOffset(PATH$pDepthStencilAttachment);
    public static final long OFFSET$preserveAttachmentCount = LAYOUT.byteOffset(PATH$preserveAttachmentCount);
    public static final long OFFSET$pPreserveAttachments = LAYOUT.byteOffset(PATH$pPreserveAttachments);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$pipelineBindPoint = LAYOUT$pipelineBindPoint.byteSize();
    public static final long SIZE$viewMask = LAYOUT$viewMask.byteSize();
    public static final long SIZE$inputAttachmentCount = LAYOUT$inputAttachmentCount.byteSize();
    public static final long SIZE$pInputAttachments = LAYOUT$pInputAttachments.byteSize();
    public static final long SIZE$colorAttachmentCount = LAYOUT$colorAttachmentCount.byteSize();
    public static final long SIZE$pColorAttachments = LAYOUT$pColorAttachments.byteSize();
    public static final long SIZE$pResolveAttachments = LAYOUT$pResolveAttachments.byteSize();
    public static final long SIZE$pDepthStencilAttachment = LAYOUT$pDepthStencilAttachment.byteSize();
    public static final long SIZE$preserveAttachmentCount = LAYOUT$preserveAttachmentCount.byteSize();
    public static final long SIZE$pPreserveAttachments = LAYOUT$pPreserveAttachments.byteSize();
}
