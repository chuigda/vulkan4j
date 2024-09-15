package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.annotations.*;
import tech.icey.vk4j.array.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import tech.icey.vk4j.ptr.*;
import tech.icey.vk4j.NativeLayout;
import tech.icey.vk4j.IDataTypeFactory;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

public record VkRenderingAttachmentInfo(MemorySegment segment) {
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

    public static final PathElement PATH$sType = PathElement.groupElement(0);
    public static final PathElement PATH$pNext = PathElement.groupElement(1);
    public static final PathElement PATH$imageView = PathElement.groupElement(2);
    public static final PathElement PATH$imageLayout = PathElement.groupElement(3);
    public static final PathElement PATH$resolveMode = PathElement.groupElement(4);
    public static final PathElement PATH$resolveImageView = PathElement.groupElement(5);
    public static final PathElement PATH$resolveImageLayout = PathElement.groupElement(6);
    public static final PathElement PATH$loadOp = PathElement.groupElement(7);
    public static final PathElement PATH$storeOp = PathElement.groupElement(8);
    public static final PathElement PATH$clearValue = PathElement.groupElement(9);

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

    public VkImageView imageView() {
        return new VkImageView(segment.asSlice(OFFSET$imageView, LAYOUT$imageView));
    }

    public void imageView(VkImageView value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$imageView, LAYOUT$imageView.byteSize());
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

    public VkImageView resolveImageView() {
        return new VkImageView(segment.asSlice(OFFSET$resolveImageView, LAYOUT$resolveImageView));
    }

    public void resolveImageView(VkImageView value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$resolveImageView, LAYOUT$resolveImageView.byteSize());
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
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$clearValue, LAYOUT$clearValue.byteSize());
    }


    public static final class VkRenderingAttachmentInfoFactory implements IDataTypeFactory<VkRenderingAttachmentInfo> {
        @Override
        public Class<VkRenderingAttachmentInfo> clazz() {
            return VkRenderingAttachmentInfo.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkRenderingAttachmentInfo.LAYOUT;
        }

        @Override
        public VkRenderingAttachmentInfo create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkRenderingAttachmentInfo createUninit(MemorySegment segment) {
            return new VkRenderingAttachmentInfo(segment);
        }
    }

    public static final VkRenderingAttachmentInfoFactory FACTORY = new VkRenderingAttachmentInfoFactory();
}
