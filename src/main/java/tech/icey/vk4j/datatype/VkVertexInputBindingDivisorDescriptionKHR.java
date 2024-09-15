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

public record VkVertexInputBindingDivisorDescriptionKHR(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("binding"),
        ValueLayout.JAVA_INT.withName("divisor")
    );

    public static final PathElement PATH$binding = PathElement.groupElement(0);
    public static final PathElement PATH$divisor = PathElement.groupElement(1);

    public static final OfInt LAYOUT$binding = (OfInt) LAYOUT.select(PATH$binding);
    public static final OfInt LAYOUT$divisor = (OfInt) LAYOUT.select(PATH$divisor);

    public static final long OFFSET$binding = LAYOUT.byteOffset(PATH$binding);
    public static final long OFFSET$divisor = LAYOUT.byteOffset(PATH$divisor);

    public VkVertexInputBindingDivisorDescriptionKHR(MemorySegment segment) {
        this.segment = segment;
    }

    public @unsigned int binding() {
        return segment.get(LAYOUT$binding, OFFSET$binding);
    }

    public void binding(@unsigned int value) {
        segment.set(LAYOUT$binding, OFFSET$binding, value);
    }

    public @unsigned int divisor() {
        return segment.get(LAYOUT$divisor, OFFSET$divisor);
    }

    public void divisor(@unsigned int value) {
        segment.set(LAYOUT$divisor, OFFSET$divisor, value);
    }


    public static final class VkVertexInputBindingDivisorDescriptionKHRFactory implements IDataTypeFactory<VkVertexInputBindingDivisorDescriptionKHR> {
        @Override
        public Class<VkVertexInputBindingDivisorDescriptionKHR> clazz() {
            return VkVertexInputBindingDivisorDescriptionKHR.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkVertexInputBindingDivisorDescriptionKHR.LAYOUT;
        }

        @Override
        public VkVertexInputBindingDivisorDescriptionKHR create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkVertexInputBindingDivisorDescriptionKHR createUninit(MemorySegment segment) {
            return new VkVertexInputBindingDivisorDescriptionKHR(segment);
        }
    }

    public static final VkVertexInputBindingDivisorDescriptionKHRFactory FACTORY = new VkVertexInputBindingDivisorDescriptionKHRFactory();
}
