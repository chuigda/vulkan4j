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

public record VkSetStateFlagsIndirectCommandNV(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("data")
    );

    public static final PathElement PATH$data = PathElement.groupElement("data");

    public static final OfInt LAYOUT$data = (OfInt) LAYOUT.select(PATH$data);

    public static final long OFFSET$data = LAYOUT.byteOffset(PATH$data);

    public VkSetStateFlagsIndirectCommandNV(MemorySegment segment) {
        this.segment = segment;
    }

    public @unsigned int data() {
        return segment.get(LAYOUT$data, OFFSET$data);
    }

    public void data(@unsigned int value) {
        segment.set(LAYOUT$data, OFFSET$data, value);
    }


    public static final class VkSetStateFlagsIndirectCommandNVFactory implements IDataTypeFactory<VkSetStateFlagsIndirectCommandNV> {
        @Override
        public Class<VkSetStateFlagsIndirectCommandNV> clazz() {
            return VkSetStateFlagsIndirectCommandNV.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkSetStateFlagsIndirectCommandNV.LAYOUT;
        }

        @Override
        public VkSetStateFlagsIndirectCommandNV create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkSetStateFlagsIndirectCommandNV createUninit(MemorySegment segment) {
            return new VkSetStateFlagsIndirectCommandNV(segment);
        }
    }

    public static final VkSetStateFlagsIndirectCommandNVFactory FACTORY = new VkSetStateFlagsIndirectCommandNVFactory();
}
