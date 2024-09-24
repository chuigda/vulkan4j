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

public record VkPipelineSampleLocationsStateCreateInfoEXT(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("sampleLocationsEnable"),
        VkSampleLocationsInfoEXT.LAYOUT.withName("sampleLocationsInfo")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$sampleLocationsEnable = PathElement.groupElement("sampleLocationsEnable");
    public static final PathElement PATH$sampleLocationsInfo = PathElement.groupElement("sampleLocationsInfo");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$sampleLocationsEnable = (OfInt) LAYOUT.select(PATH$sampleLocationsEnable);
    public static final StructLayout LAYOUT$sampleLocationsInfo = (StructLayout) LAYOUT.select(PATH$sampleLocationsInfo);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$sampleLocationsEnable = LAYOUT.byteOffset(PATH$sampleLocationsEnable);
    public static final long OFFSET$sampleLocationsInfo = LAYOUT.byteOffset(PATH$sampleLocationsInfo);

    public VkPipelineSampleLocationsStateCreateInfoEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PIPELINE_SAMPLE_LOCATIONS_STATE_CREATE_INFO_EXT);
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

    public @unsigned int sampleLocationsEnable() {
        return segment.get(LAYOUT$sampleLocationsEnable, OFFSET$sampleLocationsEnable);
    }

    public void sampleLocationsEnable(@unsigned int value) {
        segment.set(LAYOUT$sampleLocationsEnable, OFFSET$sampleLocationsEnable, value);
    }

    public VkSampleLocationsInfoEXT sampleLocationsInfo() {
        return new VkSampleLocationsInfoEXT(segment.asSlice(OFFSET$sampleLocationsInfo, LAYOUT$sampleLocationsInfo));
    }

    public void sampleLocationsInfo(VkSampleLocationsInfoEXT value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$sampleLocationsInfo, LAYOUT$sampleLocationsInfo.byteSize());
    }


    public static final class Factory implements IFactory<VkPipelineSampleLocationsStateCreateInfoEXT> {
        @Override
        public Class<VkPipelineSampleLocationsStateCreateInfoEXT> clazz() {
            return VkPipelineSampleLocationsStateCreateInfoEXT.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkPipelineSampleLocationsStateCreateInfoEXT.LAYOUT;
        }

        @Override
        public VkPipelineSampleLocationsStateCreateInfoEXT create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkPipelineSampleLocationsStateCreateInfoEXT createUninit(MemorySegment segment) {
            return new VkPipelineSampleLocationsStateCreateInfoEXT(segment);
        }
    }

    public static final Factory FACTORY = new Factory();
}
