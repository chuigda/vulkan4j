package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.annotation.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import tech.icey.vk4j.NativeLayout;
import tech.icey.vk4j.IFactory;

import static tech.icey.vk4j.enumtype.VkStructureType.*;

public record VkImageViewHandleInfoNVX(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("imageView"),
        ValueLayout.JAVA_INT.withName("descriptorType"),
        ValueLayout.ADDRESS.withName("sampler")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$imageView = PathElement.groupElement("imageView");
    public static final PathElement PATH$descriptorType = PathElement.groupElement("descriptorType");
    public static final PathElement PATH$sampler = PathElement.groupElement("sampler");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final AddressLayout LAYOUT$imageView = (AddressLayout) LAYOUT.select(PATH$imageView);
    public static final OfInt LAYOUT$descriptorType = (OfInt) LAYOUT.select(PATH$descriptorType);
    public static final AddressLayout LAYOUT$sampler = (AddressLayout) LAYOUT.select(PATH$sampler);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$imageView = LAYOUT.byteOffset(PATH$imageView);
    public static final long OFFSET$descriptorType = LAYOUT.byteOffset(PATH$descriptorType);
    public static final long OFFSET$sampler = LAYOUT.byteOffset(PATH$sampler);

    public VkImageViewHandleInfoNVX(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_IMAGE_VIEW_HANDLE_INFO_NVX);
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

    public @enumtype(VkDescriptorType.class) int descriptorType() {
        return segment.get(LAYOUT$descriptorType, OFFSET$descriptorType);
    }

    public void descriptorType(@enumtype(VkDescriptorType.class) int value) {
        segment.set(LAYOUT$descriptorType, OFFSET$descriptorType, value);
    }

    public VkSampler sampler() {
        return new VkSampler(segment.asSlice(OFFSET$sampler, LAYOUT$sampler));
    }

    public void sampler(VkSampler value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$sampler, LAYOUT$sampler.byteSize());
    }


    public static final class Factory implements IFactory<VkImageViewHandleInfoNVX> {
        @Override
        public Class<VkImageViewHandleInfoNVX> clazz() {
            return VkImageViewHandleInfoNVX.class;
        }

        @Override
        public MemoryLayout layout() {
            return VkImageViewHandleInfoNVX.LAYOUT;
        }

        @Override
        public VkImageViewHandleInfoNVX create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkImageViewHandleInfoNVX createUninit(MemorySegment segment) {
            return new VkImageViewHandleInfoNVX(segment);
        }
    }

    public static final Factory FACTORY = new Factory();
}
