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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkSubpassDescription2.html"><code>VkSubpassDescription2</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkSubpassDescription2 {
///     VkStructureType sType;
///     void const* pNext; // optional
///     VkSubpassDescriptionFlags flags; // optional
///     VkPipelineBindPoint pipelineBindPoint;
///     uint32_t viewMask;
///     uint32_t inputAttachmentCount; // optional
///     VkAttachmentReference2 const* pInputAttachments;
///     uint32_t colorAttachmentCount; // optional
///     VkAttachmentReference2 const* pColorAttachments;
///     VkAttachmentReference2 const* pResolveAttachments; // optional
///     VkAttachmentReference2 const* pDepthStencilAttachment; // optional
///     uint32_t preserveAttachmentCount; // optional
///     uint32_t const* pPreserveAttachments;
/// } VkSubpassDescription2;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_SUBPASS_DESCRIPTION_2`
///
/// The {@link VkSubpassDescription2#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkSubpassDescription2#autoInit} to initialize these fields manually for
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkSubpassDescription2.html"><code>VkSubpassDescription2</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkSubpassDescription2(@NotNull MemorySegment segment) implements IPointer {
    public static VkSubpassDescription2 allocate(Arena arena) {
        VkSubpassDescription2 ret = new VkSubpassDescription2(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.SUBPASS_DESCRIPTION_2);
        return ret;
    }

    public static VkSubpassDescription2[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkSubpassDescription2[] ret = new VkSubpassDescription2[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkSubpassDescription2(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.SUBPASS_DESCRIPTION_2);
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
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.SUBPASS_DESCRIPTION_2);
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
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkAttachmentReference2(s);
    }

    public void pInputAttachments(@Nullable VkAttachmentReference2 value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pInputAttachmentsRaw(s);
    }

    @unsafe public @Nullable VkAttachmentReference2[] pInputAttachments(int assumedCount) {
        MemorySegment s = pInputAttachmentsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkAttachmentReference2.SIZE);
        VkAttachmentReference2[] ret = new VkAttachmentReference2[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkAttachmentReference2(s.asSlice(i * VkAttachmentReference2.SIZE, VkAttachmentReference2.SIZE));
        }
        return ret;
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
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkAttachmentReference2(s);
    }

    public void pColorAttachments(@Nullable VkAttachmentReference2 value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pColorAttachmentsRaw(s);
    }

    @unsafe public @Nullable VkAttachmentReference2[] pColorAttachments(int assumedCount) {
        MemorySegment s = pColorAttachmentsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkAttachmentReference2.SIZE);
        VkAttachmentReference2[] ret = new VkAttachmentReference2[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkAttachmentReference2(s.asSlice(i * VkAttachmentReference2.SIZE, VkAttachmentReference2.SIZE));
        }
        return ret;
    }

    public @pointer(comment="VkAttachmentReference2*") MemorySegment pResolveAttachmentsRaw() {
        return segment.get(LAYOUT$pResolveAttachments, OFFSET$pResolveAttachments);
    }

    public void pResolveAttachmentsRaw(@pointer(comment="VkAttachmentReference2*") MemorySegment value) {
        segment.set(LAYOUT$pResolveAttachments, OFFSET$pResolveAttachments, value);
    }

    public @Nullable VkAttachmentReference2 pResolveAttachments() {
        MemorySegment s = pResolveAttachmentsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkAttachmentReference2(s);
    }

    public void pResolveAttachments(@Nullable VkAttachmentReference2 value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pResolveAttachmentsRaw(s);
    }

    @unsafe public @Nullable VkAttachmentReference2[] pResolveAttachments(int assumedCount) {
        MemorySegment s = pResolveAttachmentsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkAttachmentReference2.SIZE);
        VkAttachmentReference2[] ret = new VkAttachmentReference2[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkAttachmentReference2(s.asSlice(i * VkAttachmentReference2.SIZE, VkAttachmentReference2.SIZE));
        }
        return ret;
    }

    public @pointer(comment="VkAttachmentReference2*") MemorySegment pDepthStencilAttachmentRaw() {
        return segment.get(LAYOUT$pDepthStencilAttachment, OFFSET$pDepthStencilAttachment);
    }

    public void pDepthStencilAttachmentRaw(@pointer(comment="VkAttachmentReference2*") MemorySegment value) {
        segment.set(LAYOUT$pDepthStencilAttachment, OFFSET$pDepthStencilAttachment, value);
    }

    public @Nullable VkAttachmentReference2 pDepthStencilAttachment() {
        MemorySegment s = pDepthStencilAttachmentRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkAttachmentReference2(s);
    }

    public void pDepthStencilAttachment(@Nullable VkAttachmentReference2 value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pDepthStencilAttachmentRaw(s);
    }

    @unsafe public @Nullable VkAttachmentReference2[] pDepthStencilAttachment(int assumedCount) {
        MemorySegment s = pDepthStencilAttachmentRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkAttachmentReference2.SIZE);
        VkAttachmentReference2[] ret = new VkAttachmentReference2[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkAttachmentReference2(s.asSlice(i * VkAttachmentReference2.SIZE, VkAttachmentReference2.SIZE));
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
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new IntPtr(s);
    }

    public void pPreserveAttachments(@Nullable @unsigned IntPtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pPreserveAttachmentsRaw(s);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
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
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$flags = PathElement.groupElement("PATH$flags");
    public static final PathElement PATH$pipelineBindPoint = PathElement.groupElement("PATH$pipelineBindPoint");
    public static final PathElement PATH$viewMask = PathElement.groupElement("PATH$viewMask");
    public static final PathElement PATH$inputAttachmentCount = PathElement.groupElement("PATH$inputAttachmentCount");
    public static final PathElement PATH$pInputAttachments = PathElement.groupElement("PATH$pInputAttachments");
    public static final PathElement PATH$colorAttachmentCount = PathElement.groupElement("PATH$colorAttachmentCount");
    public static final PathElement PATH$pColorAttachments = PathElement.groupElement("PATH$pColorAttachments");
    public static final PathElement PATH$pResolveAttachments = PathElement.groupElement("PATH$pResolveAttachments");
    public static final PathElement PATH$pDepthStencilAttachment = PathElement.groupElement("PATH$pDepthStencilAttachment");
    public static final PathElement PATH$preserveAttachmentCount = PathElement.groupElement("PATH$preserveAttachmentCount");
    public static final PathElement PATH$pPreserveAttachments = PathElement.groupElement("PATH$pPreserveAttachments");

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
}
