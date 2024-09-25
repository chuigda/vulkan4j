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

public record VkAttachmentSampleLocationsEXT(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("attachmentIndex"),
        VkSampleLocationsInfoEXT.LAYOUT.withName("sampleLocationsInfo")
    );

    public static final PathElement PATH$attachmentIndex = PathElement.groupElement("attachmentIndex");
    public static final PathElement PATH$sampleLocationsInfo = PathElement.groupElement("sampleLocationsInfo");

    public static final OfInt LAYOUT$attachmentIndex = (OfInt) LAYOUT.select(PATH$attachmentIndex);
    public static final StructLayout LAYOUT$sampleLocationsInfo = (StructLayout) LAYOUT.select(PATH$sampleLocationsInfo);

    public static final long OFFSET$attachmentIndex = LAYOUT.byteOffset(PATH$attachmentIndex);
    public static final long OFFSET$sampleLocationsInfo = LAYOUT.byteOffset(PATH$sampleLocationsInfo);

    public VkAttachmentSampleLocationsEXT(MemorySegment segment) {
        this.segment = segment;
    }

    public @unsigned int attachmentIndex() {
        return segment.get(LAYOUT$attachmentIndex, OFFSET$attachmentIndex);
    }

    public void attachmentIndex(@unsigned int value) {
        segment.set(LAYOUT$attachmentIndex, OFFSET$attachmentIndex, value);
    }

    public VkSampleLocationsInfoEXT sampleLocationsInfo() {
        return new VkSampleLocationsInfoEXT(segment.asSlice(OFFSET$sampleLocationsInfo, LAYOUT$sampleLocationsInfo));
    }

    public void sampleLocationsInfo(VkSampleLocationsInfoEXT value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$sampleLocationsInfo, LAYOUT$sampleLocationsInfo.byteSize());
    }


    public static final class Factory implements IFactory<VkAttachmentSampleLocationsEXT> {
        @Override
        public Class<VkAttachmentSampleLocationsEXT> clazz() {
            return VkAttachmentSampleLocationsEXT.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkAttachmentSampleLocationsEXT.LAYOUT;
        }

        @Override
        public VkAttachmentSampleLocationsEXT create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkAttachmentSampleLocationsEXT createUninit(MemorySegment segment) {
            return new VkAttachmentSampleLocationsEXT(segment);
        }
    }

    public static final Factory FACTORY = new Factory();
}
