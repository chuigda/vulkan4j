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

public record VkSubpassSampleLocationsEXT(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("subpassIndex"),
        VkSampleLocationsInfoEXT.LAYOUT.withName("sampleLocationsInfo")
    );

    public static final PathElement PATH$subpassIndex = PathElement.groupElement(0);
    public static final PathElement PATH$sampleLocationsInfo = PathElement.groupElement(1);

    public static final OfInt LAYOUT$subpassIndex = (OfInt) LAYOUT.select(PATH$subpassIndex);
    public static final StructLayout LAYOUT$sampleLocationsInfo = (StructLayout) LAYOUT.select(PATH$sampleLocationsInfo);

    public static final long OFFSET$subpassIndex = LAYOUT.byteOffset(PATH$subpassIndex);
    public static final long OFFSET$sampleLocationsInfo = LAYOUT.byteOffset(PATH$sampleLocationsInfo);

    public VkSubpassSampleLocationsEXT(MemorySegment segment) {
        this.segment = segment;
    }

    public @unsigned int subpassIndex() {
        return segment.get(LAYOUT$subpassIndex, OFFSET$subpassIndex);
    }

    public void subpassIndex(@unsigned int value) {
        segment.set(LAYOUT$subpassIndex, OFFSET$subpassIndex, value);
    }

    public VkSampleLocationsInfoEXT sampleLocationsInfo() {
        return new VkSampleLocationsInfoEXT(segment.asSlice(OFFSET$sampleLocationsInfo, LAYOUT$sampleLocationsInfo));
    }

    public void sampleLocationsInfo(VkSampleLocationsInfoEXT value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$sampleLocationsInfo, LAYOUT$sampleLocationsInfo.byteSize());
    }


    public static final class VkSubpassSampleLocationsEXTFactory implements IDataTypeFactory<VkSubpassSampleLocationsEXT> {
        @Override
        public Class<VkSubpassSampleLocationsEXT> clazz() {
            return VkSubpassSampleLocationsEXT.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkSubpassSampleLocationsEXT.LAYOUT;
        }

        @Override
        public VkSubpassSampleLocationsEXT create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkSubpassSampleLocationsEXT createUninit(MemorySegment segment) {
            return new VkSubpassSampleLocationsEXT(segment);
        }
    }

    public static final VkSubpassSampleLocationsEXTFactory FACTORY = new VkSubpassSampleLocationsEXTFactory();
}
