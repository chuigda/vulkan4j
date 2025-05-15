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

public record VkRenderPassCreateInfo(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$flags = ValueLayout.JAVA_INT.withName("flags");
    public static final OfInt LAYOUT$attachmentCount = ValueLayout.JAVA_INT.withName("attachmentCount");
    public static final AddressLayout LAYOUT$pAttachments = ValueLayout.ADDRESS.withTargetLayout(VkAttachmentDescription.LAYOUT).withName("pAttachments");
    public static final OfInt LAYOUT$subpassCount = ValueLayout.JAVA_INT.withName("subpassCount");
    public static final AddressLayout LAYOUT$pSubpasses = ValueLayout.ADDRESS.withTargetLayout(VkSubpassDescription.LAYOUT).withName("pSubpasses");
    public static final OfInt LAYOUT$dependencyCount = ValueLayout.JAVA_INT.withName("dependencyCount");
    public static final AddressLayout LAYOUT$pDependencies = ValueLayout.ADDRESS.withTargetLayout(VkSubpassDependency.LAYOUT).withName("pDependencies");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$flags, LAYOUT$attachmentCount, LAYOUT$pAttachments, LAYOUT$subpassCount, LAYOUT$pSubpasses, LAYOUT$dependencyCount, LAYOUT$pDependencies);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkRenderPassCreateInfo allocate(Arena arena) {
        return new VkRenderPassCreateInfo(arena.allocate(LAYOUT));
    }

    public static VkRenderPassCreateInfo[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkRenderPassCreateInfo[] ret = new VkRenderPassCreateInfo[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkRenderPassCreateInfo(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkRenderPassCreateInfo clone(Arena arena, VkRenderPassCreateInfo src) {
        VkRenderPassCreateInfo ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkRenderPassCreateInfo[] clone(Arena arena, VkRenderPassCreateInfo[] src) {
        VkRenderPassCreateInfo[] ret = allocate(arena, src.length);
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

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$attachmentCount = LAYOUT$attachmentCount.byteSize();
    public static final long SIZE$pAttachments = LAYOUT$pAttachments.byteSize();
    public static final long SIZE$subpassCount = LAYOUT$subpassCount.byteSize();
    public static final long SIZE$pSubpasses = LAYOUT$pSubpasses.byteSize();
    public static final long SIZE$dependencyCount = LAYOUT$dependencyCount.byteSize();
    public static final long SIZE$pDependencies = LAYOUT$pDependencies.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$attachmentCount = LAYOUT.byteOffset(PATH$attachmentCount);
    public static final long OFFSET$pAttachments = LAYOUT.byteOffset(PATH$pAttachments);
    public static final long OFFSET$subpassCount = LAYOUT.byteOffset(PATH$subpassCount);
    public static final long OFFSET$pSubpasses = LAYOUT.byteOffset(PATH$pSubpasses);
    public static final long OFFSET$dependencyCount = LAYOUT.byteOffset(PATH$dependencyCount);
    public static final long OFFSET$pDependencies = LAYOUT.byteOffset(PATH$pDependencies);

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

    public @pointer(comment="VkAttachmentDescription*") MemorySegment pAttachmentsRaw() {
        return segment.get(LAYOUT$pAttachments, OFFSET$pAttachments);
    }

    public void pAttachmentsRaw(@pointer(comment="VkAttachmentDescription*") MemorySegment value) {
        segment.set(LAYOUT$pAttachments, OFFSET$pAttachments, value);
    }

    public @Nullable VkAttachmentDescription pAttachments() {
        MemorySegment s = pAttachmentsRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkAttachmentDescription(s);
    }

    public void pAttachments(@Nullable VkAttachmentDescription value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pAttachmentsRaw(s);
    }

    @unsafe public @Nullable VkAttachmentDescription[] pAttachments(int assumedCount) {
        MemorySegment s = pAttachmentsRaw();
        if (s.address() == 0) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkAttachmentDescription.SIZE);
        VkAttachmentDescription[] ret = new VkAttachmentDescription[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkAttachmentDescription(s.asSlice(i * VkAttachmentDescription.SIZE, VkAttachmentDescription.SIZE));
        }
        return ret;
    }

    public @unsigned int subpassCount() {
        return segment.get(LAYOUT$subpassCount, OFFSET$subpassCount);
    }

    public void subpassCount(@unsigned int value) {
        segment.set(LAYOUT$subpassCount, OFFSET$subpassCount, value);
    }

    public @pointer(comment="VkSubpassDescription*") MemorySegment pSubpassesRaw() {
        return segment.get(LAYOUT$pSubpasses, OFFSET$pSubpasses);
    }

    public void pSubpassesRaw(@pointer(comment="VkSubpassDescription*") MemorySegment value) {
        segment.set(LAYOUT$pSubpasses, OFFSET$pSubpasses, value);
    }

    public @Nullable VkSubpassDescription pSubpasses() {
        MemorySegment s = pSubpassesRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkSubpassDescription(s);
    }

    public void pSubpasses(@Nullable VkSubpassDescription value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pSubpassesRaw(s);
    }

    @unsafe public @Nullable VkSubpassDescription[] pSubpasses(int assumedCount) {
        MemorySegment s = pSubpassesRaw();
        if (s.address() == 0) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkSubpassDescription.SIZE);
        VkSubpassDescription[] ret = new VkSubpassDescription[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkSubpassDescription(s.asSlice(i * VkSubpassDescription.SIZE, VkSubpassDescription.SIZE));
        }
        return ret;
    }

    public @unsigned int dependencyCount() {
        return segment.get(LAYOUT$dependencyCount, OFFSET$dependencyCount);
    }

    public void dependencyCount(@unsigned int value) {
        segment.set(LAYOUT$dependencyCount, OFFSET$dependencyCount, value);
    }

    public @pointer(comment="VkSubpassDependency*") MemorySegment pDependenciesRaw() {
        return segment.get(LAYOUT$pDependencies, OFFSET$pDependencies);
    }

    public void pDependenciesRaw(@pointer(comment="VkSubpassDependency*") MemorySegment value) {
        segment.set(LAYOUT$pDependencies, OFFSET$pDependencies, value);
    }

    public @Nullable VkSubpassDependency pDependencies() {
        MemorySegment s = pDependenciesRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkSubpassDependency(s);
    }

    public void pDependencies(@Nullable VkSubpassDependency value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pDependenciesRaw(s);
    }

    @unsafe public @Nullable VkSubpassDependency[] pDependencies(int assumedCount) {
        MemorySegment s = pDependenciesRaw();
        if (s.address() == 0) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkSubpassDependency.SIZE);
        VkSubpassDependency[] ret = new VkSubpassDependency[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkSubpassDependency(s.asSlice(i * VkSubpassDependency.SIZE, VkSubpassDependency.SIZE));
        }
        return ret;
    }

}
/// dummy, not implemented yet
