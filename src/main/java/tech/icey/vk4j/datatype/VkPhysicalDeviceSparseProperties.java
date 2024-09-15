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

public record VkPhysicalDeviceSparseProperties(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("residencyStandard2DBlockShape"),
        ValueLayout.JAVA_INT.withName("residencyStandard2DMultisampleBlockShape"),
        ValueLayout.JAVA_INT.withName("residencyStandard3DBlockShape"),
        ValueLayout.JAVA_INT.withName("residencyAlignedMipSize"),
        ValueLayout.JAVA_INT.withName("residencyNonResidentStrict")
    );

    public static final PathElement PATH$residencyStandard2DBlockShape = PathElement.groupElement(0);
    public static final PathElement PATH$residencyStandard2DMultisampleBlockShape = PathElement.groupElement(1);
    public static final PathElement PATH$residencyStandard3DBlockShape = PathElement.groupElement(2);
    public static final PathElement PATH$residencyAlignedMipSize = PathElement.groupElement(3);
    public static final PathElement PATH$residencyNonResidentStrict = PathElement.groupElement(4);

    public static final OfInt LAYOUT$residencyStandard2DBlockShape = (OfInt) LAYOUT.select(PATH$residencyStandard2DBlockShape);
    public static final OfInt LAYOUT$residencyStandard2DMultisampleBlockShape = (OfInt) LAYOUT.select(PATH$residencyStandard2DMultisampleBlockShape);
    public static final OfInt LAYOUT$residencyStandard3DBlockShape = (OfInt) LAYOUT.select(PATH$residencyStandard3DBlockShape);
    public static final OfInt LAYOUT$residencyAlignedMipSize = (OfInt) LAYOUT.select(PATH$residencyAlignedMipSize);
    public static final OfInt LAYOUT$residencyNonResidentStrict = (OfInt) LAYOUT.select(PATH$residencyNonResidentStrict);

    public static final long OFFSET$residencyStandard2DBlockShape = LAYOUT.byteOffset(PATH$residencyStandard2DBlockShape);
    public static final long OFFSET$residencyStandard2DMultisampleBlockShape = LAYOUT.byteOffset(PATH$residencyStandard2DMultisampleBlockShape);
    public static final long OFFSET$residencyStandard3DBlockShape = LAYOUT.byteOffset(PATH$residencyStandard3DBlockShape);
    public static final long OFFSET$residencyAlignedMipSize = LAYOUT.byteOffset(PATH$residencyAlignedMipSize);
    public static final long OFFSET$residencyNonResidentStrict = LAYOUT.byteOffset(PATH$residencyNonResidentStrict);

    public VkPhysicalDeviceSparseProperties(MemorySegment segment) {
        this.segment = segment;
    }

    public @unsigned int residencyStandard2DBlockShape() {
        return segment.get(LAYOUT$residencyStandard2DBlockShape, OFFSET$residencyStandard2DBlockShape);
    }

    public void residencyStandard2DBlockShape(@unsigned int value) {
        segment.set(LAYOUT$residencyStandard2DBlockShape, OFFSET$residencyStandard2DBlockShape, value);
    }

    public @unsigned int residencyStandard2DMultisampleBlockShape() {
        return segment.get(LAYOUT$residencyStandard2DMultisampleBlockShape, OFFSET$residencyStandard2DMultisampleBlockShape);
    }

    public void residencyStandard2DMultisampleBlockShape(@unsigned int value) {
        segment.set(LAYOUT$residencyStandard2DMultisampleBlockShape, OFFSET$residencyStandard2DMultisampleBlockShape, value);
    }

    public @unsigned int residencyStandard3DBlockShape() {
        return segment.get(LAYOUT$residencyStandard3DBlockShape, OFFSET$residencyStandard3DBlockShape);
    }

    public void residencyStandard3DBlockShape(@unsigned int value) {
        segment.set(LAYOUT$residencyStandard3DBlockShape, OFFSET$residencyStandard3DBlockShape, value);
    }

    public @unsigned int residencyAlignedMipSize() {
        return segment.get(LAYOUT$residencyAlignedMipSize, OFFSET$residencyAlignedMipSize);
    }

    public void residencyAlignedMipSize(@unsigned int value) {
        segment.set(LAYOUT$residencyAlignedMipSize, OFFSET$residencyAlignedMipSize, value);
    }

    public @unsigned int residencyNonResidentStrict() {
        return segment.get(LAYOUT$residencyNonResidentStrict, OFFSET$residencyNonResidentStrict);
    }

    public void residencyNonResidentStrict(@unsigned int value) {
        segment.set(LAYOUT$residencyNonResidentStrict, OFFSET$residencyNonResidentStrict, value);
    }


    public static final class VkPhysicalDeviceSparsePropertiesFactory implements IDataTypeFactory<VkPhysicalDeviceSparseProperties> {
        @Override
        public Class<VkPhysicalDeviceSparseProperties> clazz() {
            return VkPhysicalDeviceSparseProperties.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkPhysicalDeviceSparseProperties.LAYOUT;
        }

        @Override
        public VkPhysicalDeviceSparseProperties create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkPhysicalDeviceSparseProperties createUninit(MemorySegment segment) {
            return new VkPhysicalDeviceSparseProperties(segment);
        }
    }

    public static final VkPhysicalDeviceSparsePropertiesFactory FACTORY = new VkPhysicalDeviceSparsePropertiesFactory();
}
