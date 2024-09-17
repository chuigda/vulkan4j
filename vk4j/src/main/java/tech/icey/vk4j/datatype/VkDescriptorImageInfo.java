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

public record VkDescriptorImageInfo(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.ADDRESS.withName("sampler"),
        ValueLayout.ADDRESS.withName("imageView"),
        ValueLayout.JAVA_INT.withName("imageLayout")
    );

    public static final PathElement PATH$sampler = PathElement.groupElement("sampler");
    public static final PathElement PATH$imageView = PathElement.groupElement("imageView");
    public static final PathElement PATH$imageLayout = PathElement.groupElement("imageLayout");

    public static final AddressLayout LAYOUT$sampler = (AddressLayout) LAYOUT.select(PATH$sampler);
    public static final AddressLayout LAYOUT$imageView = (AddressLayout) LAYOUT.select(PATH$imageView);
    public static final OfInt LAYOUT$imageLayout = (OfInt) LAYOUT.select(PATH$imageLayout);

    public static final long OFFSET$sampler = LAYOUT.byteOffset(PATH$sampler);
    public static final long OFFSET$imageView = LAYOUT.byteOffset(PATH$imageView);
    public static final long OFFSET$imageLayout = LAYOUT.byteOffset(PATH$imageLayout);

    public VkDescriptorImageInfo(MemorySegment segment) {
        this.segment = segment;
    }

    public VkSampler sampler() {
        return new VkSampler(segment.asSlice(OFFSET$sampler, LAYOUT$sampler));
    }

    public void sampler(VkSampler value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$sampler, LAYOUT$sampler.byteSize());
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


    public static final class VkDescriptorImageInfoFactory implements IFactory<VkDescriptorImageInfo> {
        @Override
        public Class<VkDescriptorImageInfo> clazz() {
            return VkDescriptorImageInfo.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkDescriptorImageInfo.LAYOUT;
        }

        @Override
        public VkDescriptorImageInfo create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkDescriptorImageInfo createUninit(MemorySegment segment) {
            return new VkDescriptorImageInfo(segment);
        }
    }

    public static final VkDescriptorImageInfoFactory FACTORY = new VkDescriptorImageInfoFactory();
}
