package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.annotation.*;
import tech.icey.vk4j.NativeLayout;
import tech.icey.vk4j.IFactory;

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


    public static final class Factory implements IFactory<VkBindShaderGroupIndirectCommandNV> {
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

    public static final Factory FACTORY = new Factory();
}
