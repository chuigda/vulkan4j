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

public record VkPhysicalDeviceCooperativeMatrixFeaturesKHR(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("cooperativeMatrix"),
        ValueLayout.JAVA_INT.withName("cooperativeMatrixRobustBufferAccess")
    );

    public static final PathElement PATH$sType = PathElement.groupElement(0);
    public static final PathElement PATH$pNext = PathElement.groupElement(1);
    public static final PathElement PATH$cooperativeMatrix = PathElement.groupElement(2);
    public static final PathElement PATH$cooperativeMatrixRobustBufferAccess = PathElement.groupElement(3);

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$cooperativeMatrix = (OfInt) LAYOUT.select(PATH$cooperativeMatrix);
    public static final OfInt LAYOUT$cooperativeMatrixRobustBufferAccess = (OfInt) LAYOUT.select(PATH$cooperativeMatrixRobustBufferAccess);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$cooperativeMatrix = LAYOUT.byteOffset(PATH$cooperativeMatrix);
    public static final long OFFSET$cooperativeMatrixRobustBufferAccess = LAYOUT.byteOffset(PATH$cooperativeMatrixRobustBufferAccess);

    public VkPhysicalDeviceCooperativeMatrixFeaturesKHR(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COOPERATIVE_MATRIX_FEATURES_KHR);
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

    public @unsigned int cooperativeMatrix() {
        return segment.get(LAYOUT$cooperativeMatrix, OFFSET$cooperativeMatrix);
    }

    public void cooperativeMatrix(@unsigned int value) {
        segment.set(LAYOUT$cooperativeMatrix, OFFSET$cooperativeMatrix, value);
    }

    public @unsigned int cooperativeMatrixRobustBufferAccess() {
        return segment.get(LAYOUT$cooperativeMatrixRobustBufferAccess, OFFSET$cooperativeMatrixRobustBufferAccess);
    }

    public void cooperativeMatrixRobustBufferAccess(@unsigned int value) {
        segment.set(LAYOUT$cooperativeMatrixRobustBufferAccess, OFFSET$cooperativeMatrixRobustBufferAccess, value);
    }


    public static final class VkPhysicalDeviceCooperativeMatrixFeaturesKHRFactory implements IDataTypeFactory<VkPhysicalDeviceCooperativeMatrixFeaturesKHR> {
        @Override
        public Class<VkPhysicalDeviceCooperativeMatrixFeaturesKHR> clazz() {
            return VkPhysicalDeviceCooperativeMatrixFeaturesKHR.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkPhysicalDeviceCooperativeMatrixFeaturesKHR.LAYOUT;
        }

        @Override
        public VkPhysicalDeviceCooperativeMatrixFeaturesKHR create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkPhysicalDeviceCooperativeMatrixFeaturesKHR createUninit(MemorySegment segment) {
            return new VkPhysicalDeviceCooperativeMatrixFeaturesKHR(segment);
        }
    }

    public static final VkPhysicalDeviceCooperativeMatrixFeaturesKHRFactory FACTORY = new VkPhysicalDeviceCooperativeMatrixFeaturesKHRFactory();
}