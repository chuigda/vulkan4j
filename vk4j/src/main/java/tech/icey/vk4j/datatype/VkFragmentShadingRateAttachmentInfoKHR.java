package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.annotation.*;
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

public record VkFragmentShadingRateAttachmentInfoKHR(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withTargetLayout(VkAttachmentReference2.LAYOUT).withName("pFragmentShadingRateAttachment"),
        VkExtent2D.LAYOUT.withName("shadingRateAttachmentTexelSize")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$pFragmentShadingRateAttachment = PathElement.groupElement("pFragmentShadingRateAttachment");
    public static final PathElement PATH$shadingRateAttachmentTexelSize = PathElement.groupElement("shadingRateAttachmentTexelSize");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final AddressLayout LAYOUT$pFragmentShadingRateAttachment = (AddressLayout) LAYOUT.select(PATH$pFragmentShadingRateAttachment);
    public static final StructLayout LAYOUT$shadingRateAttachmentTexelSize = (StructLayout) LAYOUT.select(PATH$shadingRateAttachmentTexelSize);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$pFragmentShadingRateAttachment = LAYOUT.byteOffset(PATH$pFragmentShadingRateAttachment);
    public static final long OFFSET$shadingRateAttachmentTexelSize = LAYOUT.byteOffset(PATH$shadingRateAttachmentTexelSize);

    public VkFragmentShadingRateAttachmentInfoKHR(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_FRAGMENT_SHADING_RATE_ATTACHMENT_INFO_KHR);
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

    public @pointer(comment="VkAttachmentReference2*") MemorySegment pFragmentShadingRateAttachmentRaw() {
        return segment.get(LAYOUT$pFragmentShadingRateAttachment, OFFSET$pFragmentShadingRateAttachment);
    }

    public void pFragmentShadingRateAttachmentRaw(@pointer(comment="VkAttachmentReference2*") MemorySegment value) {
        segment.set(LAYOUT$pFragmentShadingRateAttachment, OFFSET$pFragmentShadingRateAttachment, value);
    }
    
    public @nullable VkAttachmentReference2 pFragmentShadingRateAttachment() {
        MemorySegment s = pFragmentShadingRateAttachmentRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkAttachmentReference2(s);
    }

    public void pFragmentShadingRateAttachment(@nullable VkAttachmentReference2 value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pFragmentShadingRateAttachmentRaw(s);
    }

    public VkExtent2D shadingRateAttachmentTexelSize() {
        return new VkExtent2D(segment.asSlice(OFFSET$shadingRateAttachmentTexelSize, LAYOUT$shadingRateAttachmentTexelSize));
    }

    public void shadingRateAttachmentTexelSize(VkExtent2D value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$shadingRateAttachmentTexelSize, LAYOUT$shadingRateAttachmentTexelSize.byteSize());
    }


    public static final class Factory implements IFactory<VkFragmentShadingRateAttachmentInfoKHR> {
        @Override
        public Class<VkFragmentShadingRateAttachmentInfoKHR> clazz() {
            return VkFragmentShadingRateAttachmentInfoKHR.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkFragmentShadingRateAttachmentInfoKHR.LAYOUT;
        }

        @Override
        public VkFragmentShadingRateAttachmentInfoKHR create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkFragmentShadingRateAttachmentInfoKHR createUninit(MemorySegment segment) {
            return new VkFragmentShadingRateAttachmentInfoKHR(segment);
        }
    }

    public static final Factory FACTORY = new Factory();
}
