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

public record VkBindShaderGroupIndirectCommandNV(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("groupIndex")
    );

    public static final PathElement PATH$groupIndex = PathElement.groupElement("groupIndex");

    public static final OfInt LAYOUT$groupIndex = (OfInt) LAYOUT.select(PATH$groupIndex);

    public static final long OFFSET$groupIndex = LAYOUT.byteOffset(PATH$groupIndex);

    public VkBindShaderGroupIndirectCommandNV(MemorySegment segment) {
        this.segment = segment;
    }

    public @unsigned int groupIndex() {
        return segment.get(LAYOUT$groupIndex, OFFSET$groupIndex);
    }

    public void groupIndex(@unsigned int value) {
        segment.set(LAYOUT$groupIndex, OFFSET$groupIndex, value);
    }


    public static final class VkBindShaderGroupIndirectCommandNVFactory implements IFactory<VkBindShaderGroupIndirectCommandNV> {
        @Override
        public Class<VkBindShaderGroupIndirectCommandNV> clazz() {
            return VkBindShaderGroupIndirectCommandNV.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkBindShaderGroupIndirectCommandNV.LAYOUT;
        }

        @Override
        public VkBindShaderGroupIndirectCommandNV create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkBindShaderGroupIndirectCommandNV createUninit(MemorySegment segment) {
            return new VkBindShaderGroupIndirectCommandNV(segment);
        }
    }

    public static final VkBindShaderGroupIndirectCommandNVFactory FACTORY = new VkBindShaderGroupIndirectCommandNVFactory();
}
