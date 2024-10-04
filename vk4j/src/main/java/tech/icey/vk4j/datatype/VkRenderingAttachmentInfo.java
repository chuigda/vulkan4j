package tech.icey.vk4j.datatype;

import tech.icey.panama.IPointer;
import tech.icey.panama.NativeLayout;
import tech.icey.panama.annotation.enumtype;
import tech.icey.panama.annotation.nullable;
import tech.icey.panama.annotation.pointer;
import tech.icey.vk4j.bitmask.VkResolveModeFlags;
import tech.icey.vk4j.enumtype.VkAttachmentLoadOp;
import tech.icey.vk4j.enumtype.VkAttachmentStoreOp;
import tech.icey.vk4j.enumtype.VkImageLayout;
import tech.icey.vk4j.enumtype.VkStructureType;
import tech.icey.vk4j.handle.VkImageView;

import java.lang.foreign.*;

import static java.lang.foreign.ValueLayout.OfInt;
import static java.lang.foreign.ValueLayout.PathElement;
import static tech.icey.vk4j.enumtype.VkStructureType.VK_STRUCTURE_TYPE_RENDERING_ATTACHMENT_INFO;

/// {@snippet lang=c :
/// typedef struct VkRenderingAttachmentInfo {
///     VkStructureType sType;
///     const void* pNext;
///     VkImageView imageView;
///     VkImageLayout imageLayout;
///     VkResolveModeFlagBits resolveMode;
///     VkImageView resolveImageView;
///     VkImageLayout resolveImageLayout;
///     VkAttachmentLoadOp loadOp;
///     VkAttachmentStoreOp storeOp;
///     VkClearValue clearValue;
/// } VkRenderingAttachmentInfo;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkRenderingAttachmentInfo.html">VkRenderingAttachmentInfo</a>
public record VkRenderingAttachmentInfo(MemorySegment segment) implements IPointer {
    public VkRenderingAttachmentInfo(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_RENDERING_ATTACHMENT_INFO);
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

    public void pNext(@nullable IPointer pointer) {
        pNext(pointer == null ? MemorySegment.NULL : pointer.segment());
    }

    public @nullable VkImageView imageView() {
        MemorySegment s = segment.get(LAYOUT$imageView, OFFSET$imageView);
        if (s.address() == 0) {
            return null;
        }
        return new VkImageView(s);
    }

    public void imageView(@nullable VkImageView value) {
        segment.set(
            LAYOUT$imageView,
            OFFSET$imageView,
            value != null ? value.segment() : MemorySegment.NULL
        );
    }

    public @enumtype(VkImageLayout.class) int imageLayout() {
        return segment.get(LAYOUT$imageLayout, OFFSET$imageLayout);
    }

    public void imageLayout(@enumtype(VkImageLayout.class) int value) {
        segment.set(LAYOUT$imageLayout, OFFSET$imageLayout, value);
    }

    public @enumtype(VkResolveModeFlags.class) int resolveMode() {
        return segment.get(LAYOUT$resolveMode, OFFSET$resolveMode);
    }

    public void resolveMode(@enumtype(VkResolveModeFlags.class) int value) {
        segment.set(LAYOUT$resolveMode, OFFSET$resolveMode, value);
    }

    public @nullable VkImageView resolveImageView() {
        MemorySegment s = segment.get(LAYOUT$resolveImageView, OFFSET$resolveImageView);
        if (s.address() == 0) {
            return null;
        }
        return new VkImageView(s);
    }

    public void resolveImageView(@nullable VkImageView value) {
        segment.set(
            LAYOUT$resolveImageView,
            OFFSET$resolveImageView,
            value != null ? value.segment() : MemorySegment.NULL
        );
    }

    public @enumtype(VkImageLayout.class) int resolveImageLayout() {
        return segment.get(LAYOUT$resolveImageLayout, OFFSET$resolveImageLayout);
    }

    public void resolveImageLayout(@enumtype(VkImageLayout.class) int value) {
        segment.set(LAYOUT$resolveImageLayout, OFFSET$resolveImageLayout, value);
    }

    public @enumtype(VkAttachmentLoadOp.class) int loadOp() {
        return segment.get(LAYOUT$loadOp, OFFSET$loadOp);
    }

    public void loadOp(@enumtype(VkAttachmentLoadOp.class) int value) {
        segment.set(LAYOUT$loadOp, OFFSET$loadOp, value);
    }

    public @enumtype(VkAttachmentStoreOp.class) int storeOp() {
        return segment.get(LAYOUT$storeOp, OFFSET$storeOp);
    }

    public void storeOp(@enumtype(VkAttachmentStoreOp.class) int value) {
        segment.set(LAYOUT$storeOp, OFFSET$storeOp, value);
    }

    public VkClearValue clearValue() {
        return new VkClearValue(segment.asSlice(OFFSET$clearValue, LAYOUT$clearValue));
    }

    public void clearValue(VkClearValue value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$clearValue, SIZE$clearValue);
    }

    public static VkRenderingAttachmentInfo allocate(Arena arena) {
        return new VkRenderingAttachmentInfo(arena.allocate(LAYOUT));
    }

    public static VkRenderingAttachmentInfo[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkRenderingAttachmentInfo[] ret = new VkRenderingAttachmentInfo[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkRenderingAttachmentInfo(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkRenderingAttachmentInfo clone(Arena arena, VkRenderingAttachmentInfo src) {
        VkRenderingAttachmentInfo ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkRenderingAttachmentInfo[] clone(Arena arena, VkRenderingAttachmentInfo[] src) {
        VkRenderingAttachmentInfo[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("imageView"),
        ValueLayout.JAVA_INT.withName("imageLayout"),
        ValueLayout.JAVA_INT.withName("resolveMode"),
        ValueLayout.ADDRESS.withName("resolveImageView"),
        ValueLayout.JAVA_INT.withName("resolveImageLayout"),
        ValueLayout.JAVA_INT.withName("loadOp"),
        ValueLayout.JAVA_INT.withName("storeOp"),
        VkClearValue.LAYOUT.withName("clearValue")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$imageView = PathElement.groupElement("imageView");
    public static final PathElement PATH$imageLayout = PathElement.groupElement("imageLayout");
    public static final PathElement PATH$resolveMode = PathElement.groupElement("resolveMode");
    public static final PathElement PATH$resolveImageView = PathElement.groupElement("resolveImageView");
    public static final PathElement PATH$resolveImageLayout = PathElement.groupElement("resolveImageLayout");
    public static final PathElement PATH$loadOp = PathElement.groupElement("loadOp");
    public static final PathElement PATH$storeOp = PathElement.groupElement("storeOp");
    public static final PathElement PATH$clearValue = PathElement.groupElement("clearValue");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final AddressLayout LAYOUT$imageView = (AddressLayout) LAYOUT.select(PATH$imageView);
    public static final OfInt LAYOUT$imageLayout = (OfInt) LAYOUT.select(PATH$imageLayout);
    public static final OfInt LAYOUT$resolveMode = (OfInt) LAYOUT.select(PATH$resolveMode);
    public static final AddressLayout LAYOUT$resolveImageView = (AddressLayout) LAYOUT.select(PATH$resolveImageView);
    public static final OfInt LAYOUT$resolveImageLayout = (OfInt) LAYOUT.select(PATH$resolveImageLayout);
    public static final OfInt LAYOUT$loadOp = (OfInt) LAYOUT.select(PATH$loadOp);
    public static final OfInt LAYOUT$storeOp = (OfInt) LAYOUT.select(PATH$storeOp);
    public static final UnionLayout LAYOUT$clearValue = (UnionLayout) LAYOUT.select(PATH$clearValue);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$imageView = LAYOUT.byteOffset(PATH$imageView);
    public static final long OFFSET$imageLayout = LAYOUT.byteOffset(PATH$imageLayout);
    public static final long OFFSET$resolveMode = LAYOUT.byteOffset(PATH$resolveMode);
    public static final long OFFSET$resolveImageView = LAYOUT.byteOffset(PATH$resolveImageView);
    public static final long OFFSET$resolveImageLayout = LAYOUT.byteOffset(PATH$resolveImageLayout);
    public static final long OFFSET$loadOp = LAYOUT.byteOffset(PATH$loadOp);
    public static final long OFFSET$storeOp = LAYOUT.byteOffset(PATH$storeOp);
    public static final long OFFSET$clearValue = LAYOUT.byteOffset(PATH$clearValue);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$imageView = LAYOUT$imageView.byteSize();
    public static final long SIZE$imageLayout = LAYOUT$imageLayout.byteSize();
    public static final long SIZE$resolveMode = LAYOUT$resolveMode.byteSize();
    public static final long SIZE$resolveImageView = LAYOUT$resolveImageView.byteSize();
    public static final long SIZE$resolveImageLayout = LAYOUT$resolveImageLayout.byteSize();
    public static final long SIZE$loadOp = LAYOUT$loadOp.byteSize();
    public static final long SIZE$storeOp = LAYOUT$storeOp.byteSize();
    public static final long SIZE$clearValue = LAYOUT$clearValue.byteSize();
}
