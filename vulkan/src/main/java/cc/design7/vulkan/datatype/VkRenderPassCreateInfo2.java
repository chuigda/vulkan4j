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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkRenderPassCreateInfo2.html">VkRenderPassCreateInfo2</a>
@ValueBasedCandidate
public record VkRenderPassCreateInfo2(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$flags = ValueLayout.JAVA_INT.withName("flags");
    public static final OfInt LAYOUT$attachmentCount = ValueLayout.JAVA_INT.withName("attachmentCount");
    public static final AddressLayout LAYOUT$pAttachments = ValueLayout.ADDRESS.withTargetLayout(VkAttachmentDescription2.LAYOUT).withName("pAttachments");
    public static final OfInt LAYOUT$subpassCount = ValueLayout.JAVA_INT.withName("subpassCount");
    public static final AddressLayout LAYOUT$pSubpasses = ValueLayout.ADDRESS.withTargetLayout(VkSubpassDescription2.LAYOUT).withName("pSubpasses");
    public static final OfInt LAYOUT$dependencyCount = ValueLayout.JAVA_INT.withName("dependencyCount");
    public static final AddressLayout LAYOUT$pDependencies = ValueLayout.ADDRESS.withTargetLayout(VkSubpassDependency2.LAYOUT).withName("pDependencies");
    public static final OfInt LAYOUT$correlatedViewMaskCount = ValueLayout.JAVA_INT.withName("correlatedViewMaskCount");
    public static final AddressLayout LAYOUT$pCorrelatedViewMasks = ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT).withName("pCorrelatedViewMasks");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$flags, LAYOUT$attachmentCount, LAYOUT$pAttachments, LAYOUT$subpassCount, LAYOUT$pSubpasses, LAYOUT$dependencyCount, LAYOUT$pDependencies, LAYOUT$correlatedViewMaskCount, LAYOUT$pCorrelatedViewMasks);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkRenderPassCreateInfo2 allocate(Arena arena) {
        return new VkRenderPassCreateInfo2(arena.allocate(LAYOUT));
    }

    public static VkRenderPassCreateInfo2[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkRenderPassCreateInfo2[] ret = new VkRenderPassCreateInfo2[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkRenderPassCreateInfo2(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkRenderPassCreateInfo2 clone(Arena arena, VkRenderPassCreateInfo2 src) {
        VkRenderPassCreateInfo2 ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkRenderPassCreateInfo2[] clone(Arena arena, VkRenderPassCreateInfo2[] src) {
        VkRenderPassCreateInfo2[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$flags = PathElement.groupElement("PATH$flags");
    public static final PathElement PATH$attachmentCount = PathElement.groupElement("PATH$attachmentCount");
    public static final PathElement PATH$pAttachments = PathElement.groupElement("PATH$pAttachments");
    public static final PathElement PATH$subpassCount = PathElement.groupElement("PATH$subpassCount");
    public static final PathElement PATH$pSubpasses = PathElement.groupElement("PATH$pSubpasses");
    public static final PathElement PATH$dependencyCount = PathElement.groupElement("PATH$dependencyCount");
    public static final PathElement PATH$pDependencies = PathElement.groupElement("PATH$pDependencies");
    public static final PathElement PATH$correlatedViewMaskCount = PathElement.groupElement("PATH$correlatedViewMaskCount");
    public static final PathElement PATH$pCorrelatedViewMasks = PathElement.groupElement("PATH$pCorrelatedViewMasks");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$attachmentCount = LAYOUT$attachmentCount.byteSize();
    public static final long SIZE$pAttachments = LAYOUT$pAttachments.byteSize();
    public static final long SIZE$subpassCount = LAYOUT$subpassCount.byteSize();
    public static final long SIZE$pSubpasses = LAYOUT$pSubpasses.byteSize();
    public static final long SIZE$dependencyCount = LAYOUT$dependencyCount.byteSize();
    public static final long SIZE$pDependencies = LAYOUT$pDependencies.byteSize();
    public static final long SIZE$correlatedViewMaskCount = LAYOUT$correlatedViewMaskCount.byteSize();
    public static final long SIZE$pCorrelatedViewMasks = LAYOUT$pCorrelatedViewMasks.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$attachmentCount = LAYOUT.byteOffset(PATH$attachmentCount);
    public static final long OFFSET$pAttachments = LAYOUT.byteOffset(PATH$pAttachments);
    public static final long OFFSET$subpassCount = LAYOUT.byteOffset(PATH$subpassCount);
    public static final long OFFSET$pSubpasses = LAYOUT.byteOffset(PATH$pSubpasses);
    public static final long OFFSET$dependencyCount = LAYOUT.byteOffset(PATH$dependencyCount);
    public static final long OFFSET$pDependencies = LAYOUT.byteOffset(PATH$pDependencies);
    public static final long OFFSET$correlatedViewMaskCount = LAYOUT.byteOffset(PATH$correlatedViewMaskCount);
    public static final long OFFSET$pCorrelatedViewMasks = LAYOUT.byteOffset(PATH$pCorrelatedViewMasks);

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

    public @enumtype(VkRenderPassCreateFlags.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public void flags(@enumtype(VkRenderPassCreateFlags.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
    }

    public @unsigned int attachmentCount() {
        return segment.get(LAYOUT$attachmentCount, OFFSET$attachmentCount);
    }

    public void attachmentCount(@unsigned int value) {
        segment.set(LAYOUT$attachmentCount, OFFSET$attachmentCount, value);
    }

    public @pointer(comment="VkAttachmentDescription2*") MemorySegment pAttachmentsRaw() {
        return segment.get(LAYOUT$pAttachments, OFFSET$pAttachments);
    }

    public void pAttachmentsRaw(@pointer(comment="VkAttachmentDescription2*") MemorySegment value) {
        segment.set(LAYOUT$pAttachments, OFFSET$pAttachments, value);
    }

    public @Nullable VkAttachmentDescription2 pAttachments() {
        MemorySegment s = pAttachmentsRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkAttachmentDescription2(s);
    }

    public void pAttachments(@Nullable VkAttachmentDescription2 value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pAttachmentsRaw(s);
    }

    @unsafe public @Nullable VkAttachmentDescription2[] pAttachments(int assumedCount) {
        MemorySegment s = pAttachmentsRaw();
        if (s.address() == 0) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkAttachmentDescription2.SIZE);
        VkAttachmentDescription2[] ret = new VkAttachmentDescription2[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkAttachmentDescription2(s.asSlice(i * VkAttachmentDescription2.SIZE, VkAttachmentDescription2.SIZE));
        }
        return ret;
    }

    public @unsigned int subpassCount() {
        return segment.get(LAYOUT$subpassCount, OFFSET$subpassCount);
    }

    public void subpassCount(@unsigned int value) {
        segment.set(LAYOUT$subpassCount, OFFSET$subpassCount, value);
    }

    public @pointer(comment="VkSubpassDescription2*") MemorySegment pSubpassesRaw() {
        return segment.get(LAYOUT$pSubpasses, OFFSET$pSubpasses);
    }

    public void pSubpassesRaw(@pointer(comment="VkSubpassDescription2*") MemorySegment value) {
        segment.set(LAYOUT$pSubpasses, OFFSET$pSubpasses, value);
    }

    public @Nullable VkSubpassDescription2 pSubpasses() {
        MemorySegment s = pSubpassesRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkSubpassDescription2(s);
    }

    public void pSubpasses(@Nullable VkSubpassDescription2 value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pSubpassesRaw(s);
    }

    @unsafe public @Nullable VkSubpassDescription2[] pSubpasses(int assumedCount) {
        MemorySegment s = pSubpassesRaw();
        if (s.address() == 0) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkSubpassDescription2.SIZE);
        VkSubpassDescription2[] ret = new VkSubpassDescription2[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkSubpassDescription2(s.asSlice(i * VkSubpassDescription2.SIZE, VkSubpassDescription2.SIZE));
        }
        return ret;
    }

    public @unsigned int dependencyCount() {
        return segment.get(LAYOUT$dependencyCount, OFFSET$dependencyCount);
    }

    public void dependencyCount(@unsigned int value) {
        segment.set(LAYOUT$dependencyCount, OFFSET$dependencyCount, value);
    }

    public @pointer(comment="VkSubpassDependency2*") MemorySegment pDependenciesRaw() {
        return segment.get(LAYOUT$pDependencies, OFFSET$pDependencies);
    }

    public void pDependenciesRaw(@pointer(comment="VkSubpassDependency2*") MemorySegment value) {
        segment.set(LAYOUT$pDependencies, OFFSET$pDependencies, value);
    }

    public @Nullable VkSubpassDependency2 pDependencies() {
        MemorySegment s = pDependenciesRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkSubpassDependency2(s);
    }

    public void pDependencies(@Nullable VkSubpassDependency2 value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pDependenciesRaw(s);
    }

    @unsafe public @Nullable VkSubpassDependency2[] pDependencies(int assumedCount) {
        MemorySegment s = pDependenciesRaw();
        if (s.address() == 0) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkSubpassDependency2.SIZE);
        VkSubpassDependency2[] ret = new VkSubpassDependency2[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkSubpassDependency2(s.asSlice(i * VkSubpassDependency2.SIZE, VkSubpassDependency2.SIZE));
        }
        return ret;
    }

    public @unsigned int correlatedViewMaskCount() {
        return segment.get(LAYOUT$correlatedViewMaskCount, OFFSET$correlatedViewMaskCount);
    }

    public void correlatedViewMaskCount(@unsigned int value) {
        segment.set(LAYOUT$correlatedViewMaskCount, OFFSET$correlatedViewMaskCount, value);
    }

    public @pointer(comment="int*") MemorySegment pCorrelatedViewMasksRaw() {
        return segment.get(LAYOUT$pCorrelatedViewMasks, OFFSET$pCorrelatedViewMasks);
    }

    public void pCorrelatedViewMasksRaw(@pointer(comment="int*") MemorySegment value) {
        segment.set(LAYOUT$pCorrelatedViewMasks, OFFSET$pCorrelatedViewMasks, value);
    }

    /// Note: the returned {@link IntPtr} does not have correct
    /// {@link IntPtr#size} property. It's up to user to track the size of the buffer,
    /// and use {@link IntPtr#reinterpret} to set the size before actually reading from or
    /// writing to the buffer.
    public @Nullable @unsigned IntPtr pCorrelatedViewMasks() {
        MemorySegment s = pCorrelatedViewMasksRaw();
        if (s.address() == 0) {
            return null;
        }
        return new IntPtr(s);
    }

    public void pCorrelatedViewMasks(@Nullable @unsigned IntPtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pCorrelatedViewMasksRaw(s);
    }

}
