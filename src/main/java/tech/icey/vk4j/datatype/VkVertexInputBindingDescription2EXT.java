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

public record VkVertexInputBindingDescription2EXT(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("binding"),
        ValueLayout.JAVA_INT.withName("stride"),
        ValueLayout.JAVA_INT.withName("inputRate"),
        ValueLayout.JAVA_INT.withName("divisor")
    );

    public static final PathElement PATH$sType = PathElement.groupElement(0);
    public static final PathElement PATH$pNext = PathElement.groupElement(1);
    public static final PathElement PATH$binding = PathElement.groupElement(2);
    public static final PathElement PATH$stride = PathElement.groupElement(3);
    public static final PathElement PATH$inputRate = PathElement.groupElement(4);
    public static final PathElement PATH$divisor = PathElement.groupElement(5);

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$binding = (OfInt) LAYOUT.select(PATH$binding);
    public static final OfInt LAYOUT$stride = (OfInt) LAYOUT.select(PATH$stride);
    public static final OfInt LAYOUT$inputRate = (OfInt) LAYOUT.select(PATH$inputRate);
    public static final OfInt LAYOUT$divisor = (OfInt) LAYOUT.select(PATH$divisor);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$binding = LAYOUT.byteOffset(PATH$binding);
    public static final long OFFSET$stride = LAYOUT.byteOffset(PATH$stride);
    public static final long OFFSET$inputRate = LAYOUT.byteOffset(PATH$inputRate);
    public static final long OFFSET$divisor = LAYOUT.byteOffset(PATH$divisor);

    public VkVertexInputBindingDescription2EXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_VERTEX_INPUT_BINDING_DESCRIPTION_2_EXT);
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

    public @unsigned int binding() {
        return segment.get(LAYOUT$binding, OFFSET$binding);
    }

    public void binding(@unsigned int value) {
        segment.set(LAYOUT$binding, OFFSET$binding, value);
    }

    public @unsigned int stride() {
        return segment.get(LAYOUT$stride, OFFSET$stride);
    }

    public void stride(@unsigned int value) {
        segment.set(LAYOUT$stride, OFFSET$stride, value);
    }

    public @enumtype(VkVertexInputRate.class) int inputRate() {
        return segment.get(LAYOUT$inputRate, OFFSET$inputRate);
    }

    public void inputRate(@enumtype(VkVertexInputRate.class) int value) {
        segment.set(LAYOUT$inputRate, OFFSET$inputRate, value);
    }

    public @unsigned int divisor() {
        return segment.get(LAYOUT$divisor, OFFSET$divisor);
    }

    public void divisor(@unsigned int value) {
        segment.set(LAYOUT$divisor, OFFSET$divisor, value);
    }


    public static final class VkVertexInputBindingDescription2EXTFactory implements IDataTypeFactory<VkVertexInputBindingDescription2EXT> {
        @Override
        public Class<VkVertexInputBindingDescription2EXT> clazz() {
            return VkVertexInputBindingDescription2EXT.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkVertexInputBindingDescription2EXT.LAYOUT;
        }

        @Override
        public VkVertexInputBindingDescription2EXT create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkVertexInputBindingDescription2EXT createUninit(MemorySegment segment) {
            return new VkVertexInputBindingDescription2EXT(segment);
        }
    }

    public static final VkVertexInputBindingDescription2EXTFactory FACTORY = new VkVertexInputBindingDescription2EXTFactory();
}