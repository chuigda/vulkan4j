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

public record VkRenderPassInputAttachmentAspectCreateInfo(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$aspectReferenceCount = ValueLayout.JAVA_INT.withName("aspectReferenceCount");
    public static final AddressLayout LAYOUT$pAspectReferences = ValueLayout.ADDRESS.withTargetLayout(VkInputAttachmentAspectReference.LAYOUT).withName("pAspectReferences");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$aspectReferenceCount, LAYOUT$pAspectReferences);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkRenderPassInputAttachmentAspectCreateInfo allocate(Arena arena) {
        return new VkRenderPassInputAttachmentAspectCreateInfo(arena.allocate(LAYOUT));
    }

    public static VkRenderPassInputAttachmentAspectCreateInfo[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkRenderPassInputAttachmentAspectCreateInfo[] ret = new VkRenderPassInputAttachmentAspectCreateInfo[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkRenderPassInputAttachmentAspectCreateInfo(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkRenderPassInputAttachmentAspectCreateInfo clone(Arena arena, VkRenderPassInputAttachmentAspectCreateInfo src) {
        VkRenderPassInputAttachmentAspectCreateInfo ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkRenderPassInputAttachmentAspectCreateInfo[] clone(Arena arena, VkRenderPassInputAttachmentAspectCreateInfo[] src) {
        VkRenderPassInputAttachmentAspectCreateInfo[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$aspectReferenceCount = PathElement.groupElement("PATH$aspectReferenceCount");
    public static final PathElement PATH$pAspectReferences = PathElement.groupElement("PATH$pAspectReferences");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$aspectReferenceCount = LAYOUT$aspectReferenceCount.byteSize();
    public static final long SIZE$pAspectReferences = LAYOUT$pAspectReferences.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$aspectReferenceCount = LAYOUT.byteOffset(PATH$aspectReferenceCount);
    public static final long OFFSET$pAspectReferences = LAYOUT.byteOffset(PATH$pAspectReferences);

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

    public @unsigned int aspectReferenceCount() {
        return segment.get(LAYOUT$aspectReferenceCount, OFFSET$aspectReferenceCount);
    }

    public void aspectReferenceCount(@unsigned int value) {
        segment.set(LAYOUT$aspectReferenceCount, OFFSET$aspectReferenceCount, value);
    }

    public @pointer(comment="VkInputAttachmentAspectReference*") MemorySegment pAspectReferencesRaw() {
        return segment.get(LAYOUT$pAspectReferences, OFFSET$pAspectReferences);
    }

    public void pAspectReferencesRaw(@pointer(comment="VkInputAttachmentAspectReference*") MemorySegment value) {
        segment.set(LAYOUT$pAspectReferences, OFFSET$pAspectReferences, value);
    }

    public @Nullable VkInputAttachmentAspectReference pAspectReferences() {
        MemorySegment s = pAspectReferencesRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkInputAttachmentAspectReference(s);
    }

    public void pAspectReferences(@Nullable VkInputAttachmentAspectReference value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pAspectReferencesRaw(s);
    }

    @unsafe public @Nullable VkInputAttachmentAspectReference[] pAspectReferences(int assumedCount) {
        MemorySegment s = pAspectReferencesRaw();
        if (s.address() == 0) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkInputAttachmentAspectReference.SIZE);
        VkInputAttachmentAspectReference[] ret = new VkInputAttachmentAspectReference[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkInputAttachmentAspectReference(s.asSlice(i * VkInputAttachmentAspectReference.SIZE, VkInputAttachmentAspectReference.SIZE));
        }
        return ret;
    }

}
/// dummy, not implemented yet
