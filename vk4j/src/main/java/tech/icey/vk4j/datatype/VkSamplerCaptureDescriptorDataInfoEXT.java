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

public record VkSamplerCaptureDescriptorDataInfoEXT(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("sampler")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$sampler = PathElement.groupElement("sampler");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final AddressLayout LAYOUT$sampler = (AddressLayout) LAYOUT.select(PATH$sampler);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$sampler = LAYOUT.byteOffset(PATH$sampler);

    public VkSamplerCaptureDescriptorDataInfoEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_SAMPLER_CAPTURE_DESCRIPTOR_DATA_INFO_EXT);
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

    public VkSampler sampler() {
        return new VkSampler(segment.asSlice(OFFSET$sampler, LAYOUT$sampler));
    }

    public void sampler(VkSampler value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$sampler, LAYOUT$sampler.byteSize());
    }


    public static final class VkSamplerCaptureDescriptorDataInfoEXTFactory implements IFactory<VkSamplerCaptureDescriptorDataInfoEXT> {
        @Override
        public Class<VkSamplerCaptureDescriptorDataInfoEXT> clazz() {
            return VkSamplerCaptureDescriptorDataInfoEXT.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkSamplerCaptureDescriptorDataInfoEXT.LAYOUT;
        }

        @Override
        public VkSamplerCaptureDescriptorDataInfoEXT create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkSamplerCaptureDescriptorDataInfoEXT createUninit(MemorySegment segment) {
            return new VkSamplerCaptureDescriptorDataInfoEXT(segment);
        }
    }

    public static final VkSamplerCaptureDescriptorDataInfoEXTFactory FACTORY = new VkSamplerCaptureDescriptorDataInfoEXTFactory();
}
