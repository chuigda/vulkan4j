package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.annotation.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.ptr.*;
import tech.icey.vk4j.NativeLayout;
import tech.icey.vk4j.IFactory;

import static tech.icey.vk4j.enumtype.VkStructureType.*;

public record VkAttachmentSampleCountInfoAMD(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("colorAttachmentCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT).withName("pColorAttachmentSamples"),
        ValueLayout.JAVA_INT.withName("depthStencilAttachmentSamples")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$colorAttachmentCount = PathElement.groupElement("colorAttachmentCount");
    public static final PathElement PATH$pColorAttachmentSamples = PathElement.groupElement("pColorAttachmentSamples");
    public static final PathElement PATH$depthStencilAttachmentSamples = PathElement.groupElement("depthStencilAttachmentSamples");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$colorAttachmentCount = (OfInt) LAYOUT.select(PATH$colorAttachmentCount);
    public static final AddressLayout LAYOUT$pColorAttachmentSamples = (AddressLayout) LAYOUT.select(PATH$pColorAttachmentSamples);
    public static final OfInt LAYOUT$depthStencilAttachmentSamples = (OfInt) LAYOUT.select(PATH$depthStencilAttachmentSamples);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$colorAttachmentCount = LAYOUT.byteOffset(PATH$colorAttachmentCount);
    public static final long OFFSET$pColorAttachmentSamples = LAYOUT.byteOffset(PATH$pColorAttachmentSamples);
    public static final long OFFSET$depthStencilAttachmentSamples = LAYOUT.byteOffset(PATH$depthStencilAttachmentSamples);

    public VkAttachmentSampleCountInfoAMD(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_ATTACHMENT_SAMPLE_COUNT_INFO_AMD);
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

    public @unsigned int colorAttachmentCount() {
        return segment.get(LAYOUT$colorAttachmentCount, OFFSET$colorAttachmentCount);
    }

    public void colorAttachmentCount(@unsigned int value) {
        segment.set(LAYOUT$colorAttachmentCount, OFFSET$colorAttachmentCount, value);
    }

    public @pointer(target=VkSampleCountFlags.class) MemorySegment pColorAttachmentSamplesRaw() {
        return segment.get(LAYOUT$pColorAttachmentSamples, OFFSET$pColorAttachmentSamples);
    }

    public void pColorAttachmentSamplesRaw(@pointer(target=VkSampleCountFlags.class) MemorySegment value) {
        segment.set(LAYOUT$pColorAttachmentSamples, OFFSET$pColorAttachmentSamples, value);
    }

    public @nullable IntPtr pColorAttachmentSamples() {
        MemorySegment s = pColorAttachmentSamplesRaw();
        if (s.address() == 0) {
            return null;
        }

        return new IntPtr(s);
    }

    public void pColorAttachmentSamples(@nullable IntPtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pColorAttachmentSamplesRaw(s);
    }

    public @enumtype(VkSampleCountFlags.class) int depthStencilAttachmentSamples() {
        return segment.get(LAYOUT$depthStencilAttachmentSamples, OFFSET$depthStencilAttachmentSamples);
    }

    public void depthStencilAttachmentSamples(@enumtype(VkSampleCountFlags.class) int value) {
        segment.set(LAYOUT$depthStencilAttachmentSamples, OFFSET$depthStencilAttachmentSamples, value);
    }


    public static final class Factory implements IFactory<VkAttachmentSampleCountInfoAMD> {
        @Override
        public Class<VkAttachmentSampleCountInfoAMD> clazz() {
            return VkAttachmentSampleCountInfoAMD.class;
        }

        @Override
        public MemoryLayout layout() {
            return VkAttachmentSampleCountInfoAMD.LAYOUT;
        }

        @Override
        public VkAttachmentSampleCountInfoAMD create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkAttachmentSampleCountInfoAMD createUninit(MemorySegment segment) {
            return new VkAttachmentSampleCountInfoAMD(segment);
        }
    }

    public static final Factory FACTORY = new Factory();
}
