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
import tech.icey.vk4j.IFactory;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

public record VkRenderingInfo(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        VkRect2D.LAYOUT.withName("renderArea"),
        ValueLayout.JAVA_INT.withName("layerCount"),
        ValueLayout.JAVA_INT.withName("viewMask"),
        ValueLayout.JAVA_INT.withName("colorAttachmentCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkRenderingAttachmentInfo.LAYOUT).withName("pColorAttachments"),
        ValueLayout.ADDRESS.withTargetLayout(VkRenderingAttachmentInfo.LAYOUT).withName("pDepthAttachment"),
        ValueLayout.ADDRESS.withTargetLayout(VkRenderingAttachmentInfo.LAYOUT).withName("pStencilAttachment")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$flags = PathElement.groupElement("flags");
    public static final PathElement PATH$renderArea = PathElement.groupElement("renderArea");
    public static final PathElement PATH$layerCount = PathElement.groupElement("layerCount");
    public static final PathElement PATH$viewMask = PathElement.groupElement("viewMask");
    public static final PathElement PATH$colorAttachmentCount = PathElement.groupElement("colorAttachmentCount");
    public static final PathElement PATH$pColorAttachments = PathElement.groupElement("pColorAttachments");
    public static final PathElement PATH$pDepthAttachment = PathElement.groupElement("pDepthAttachment");
    public static final PathElement PATH$pStencilAttachment = PathElement.groupElement("pStencilAttachment");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$flags = (OfInt) LAYOUT.select(PATH$flags);
    public static final StructLayout LAYOUT$renderArea = (StructLayout) LAYOUT.select(PATH$renderArea);
    public static final OfInt LAYOUT$layerCount = (OfInt) LAYOUT.select(PATH$layerCount);
    public static final OfInt LAYOUT$viewMask = (OfInt) LAYOUT.select(PATH$viewMask);
    public static final OfInt LAYOUT$colorAttachmentCount = (OfInt) LAYOUT.select(PATH$colorAttachmentCount);
    public static final AddressLayout LAYOUT$pColorAttachments = (AddressLayout) LAYOUT.select(PATH$pColorAttachments);
    public static final AddressLayout LAYOUT$pDepthAttachment = (AddressLayout) LAYOUT.select(PATH$pDepthAttachment);
    public static final AddressLayout LAYOUT$pStencilAttachment = (AddressLayout) LAYOUT.select(PATH$pStencilAttachment);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$renderArea = LAYOUT.byteOffset(PATH$renderArea);
    public static final long OFFSET$layerCount = LAYOUT.byteOffset(PATH$layerCount);
    public static final long OFFSET$viewMask = LAYOUT.byteOffset(PATH$viewMask);
    public static final long OFFSET$colorAttachmentCount = LAYOUT.byteOffset(PATH$colorAttachmentCount);
    public static final long OFFSET$pColorAttachments = LAYOUT.byteOffset(PATH$pColorAttachments);
    public static final long OFFSET$pDepthAttachment = LAYOUT.byteOffset(PATH$pDepthAttachment);
    public static final long OFFSET$pStencilAttachment = LAYOUT.byteOffset(PATH$pStencilAttachment);

    public VkRenderingInfo(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_RENDERING_INFO);
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

    public @enumtype(VkRenderingFlags.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public void flags(@enumtype(VkRenderingFlags.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
    }

    public VkRect2D renderArea() {
        return new VkRect2D(segment.asSlice(OFFSET$renderArea, LAYOUT$renderArea));
    }

    public void renderArea(VkRect2D value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$renderArea, LAYOUT$renderArea.byteSize());
    }

    public @unsigned int layerCount() {
        return segment.get(LAYOUT$layerCount, OFFSET$layerCount);
    }

    public void layerCount(@unsigned int value) {
        segment.set(LAYOUT$layerCount, OFFSET$layerCount, value);
    }

    public @unsigned int viewMask() {
        return segment.get(LAYOUT$viewMask, OFFSET$viewMask);
    }

    public void viewMask(@unsigned int value) {
        segment.set(LAYOUT$viewMask, OFFSET$viewMask, value);
    }

    public @unsigned int colorAttachmentCount() {
        return segment.get(LAYOUT$colorAttachmentCount, OFFSET$colorAttachmentCount);
    }

    public void colorAttachmentCount(@unsigned int value) {
        segment.set(LAYOUT$colorAttachmentCount, OFFSET$colorAttachmentCount, value);
    }

    public @pointer(comment="VkRenderingAttachmentInfo*") MemorySegment pColorAttachmentsRaw() {
        return segment.get(LAYOUT$pColorAttachments, OFFSET$pColorAttachments);
    }

    public void pColorAttachmentsRaw(@pointer(comment="VkRenderingAttachmentInfo*") MemorySegment value) {
        segment.set(LAYOUT$pColorAttachments, OFFSET$pColorAttachments, value);
    }
    
    public @nullable VkRenderingAttachmentInfo pColorAttachments() {
        MemorySegment s = pColorAttachmentsRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkRenderingAttachmentInfo(s);
    }

    public void pColorAttachments(@nullable VkRenderingAttachmentInfo value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pColorAttachmentsRaw(s);
    }

    public @pointer(comment="VkRenderingAttachmentInfo*") MemorySegment pDepthAttachmentRaw() {
        return segment.get(LAYOUT$pDepthAttachment, OFFSET$pDepthAttachment);
    }

    public void pDepthAttachmentRaw(@pointer(comment="VkRenderingAttachmentInfo*") MemorySegment value) {
        segment.set(LAYOUT$pDepthAttachment, OFFSET$pDepthAttachment, value);
    }
    
    public @nullable VkRenderingAttachmentInfo pDepthAttachment() {
        MemorySegment s = pDepthAttachmentRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkRenderingAttachmentInfo(s);
    }

    public void pDepthAttachment(@nullable VkRenderingAttachmentInfo value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pDepthAttachmentRaw(s);
    }

    public @pointer(comment="VkRenderingAttachmentInfo*") MemorySegment pStencilAttachmentRaw() {
        return segment.get(LAYOUT$pStencilAttachment, OFFSET$pStencilAttachment);
    }

    public void pStencilAttachmentRaw(@pointer(comment="VkRenderingAttachmentInfo*") MemorySegment value) {
        segment.set(LAYOUT$pStencilAttachment, OFFSET$pStencilAttachment, value);
    }
    
    public @nullable VkRenderingAttachmentInfo pStencilAttachment() {
        MemorySegment s = pStencilAttachmentRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkRenderingAttachmentInfo(s);
    }

    public void pStencilAttachment(@nullable VkRenderingAttachmentInfo value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pStencilAttachmentRaw(s);
    }


    public static final class VkRenderingInfoFactory implements IFactory<VkRenderingInfo> {
        @Override
        public Class<VkRenderingInfo> clazz() {
            return VkRenderingInfo.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkRenderingInfo.LAYOUT;
        }

        @Override
        public VkRenderingInfo create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkRenderingInfo createUninit(MemorySegment segment) {
            return new VkRenderingInfo(segment);
        }
    }

    public static final VkRenderingInfoFactory FACTORY = new VkRenderingInfoFactory();
}
