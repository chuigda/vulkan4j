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

public record VkAccelerationStructureBuildSizesInfoKHR(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("accelerationStructureSize"),
        ValueLayout.JAVA_LONG.withName("updateScratchSize"),
        ValueLayout.JAVA_LONG.withName("buildScratchSize")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$accelerationStructureSize = PathElement.groupElement("accelerationStructureSize");
    public static final PathElement PATH$updateScratchSize = PathElement.groupElement("updateScratchSize");
    public static final PathElement PATH$buildScratchSize = PathElement.groupElement("buildScratchSize");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfLong LAYOUT$accelerationStructureSize = (OfLong) LAYOUT.select(PATH$accelerationStructureSize);
    public static final OfLong LAYOUT$updateScratchSize = (OfLong) LAYOUT.select(PATH$updateScratchSize);
    public static final OfLong LAYOUT$buildScratchSize = (OfLong) LAYOUT.select(PATH$buildScratchSize);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$accelerationStructureSize = LAYOUT.byteOffset(PATH$accelerationStructureSize);
    public static final long OFFSET$updateScratchSize = LAYOUT.byteOffset(PATH$updateScratchSize);
    public static final long OFFSET$buildScratchSize = LAYOUT.byteOffset(PATH$buildScratchSize);

    public VkAccelerationStructureBuildSizesInfoKHR(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_BUILD_SIZES_INFO_KHR);
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

    public @unsigned long accelerationStructureSize() {
        return segment.get(LAYOUT$accelerationStructureSize, OFFSET$accelerationStructureSize);
    }

    public void accelerationStructureSize(@unsigned long value) {
        segment.set(LAYOUT$accelerationStructureSize, OFFSET$accelerationStructureSize, value);
    }

    public @unsigned long updateScratchSize() {
        return segment.get(LAYOUT$updateScratchSize, OFFSET$updateScratchSize);
    }

    public void updateScratchSize(@unsigned long value) {
        segment.set(LAYOUT$updateScratchSize, OFFSET$updateScratchSize, value);
    }

    public @unsigned long buildScratchSize() {
        return segment.get(LAYOUT$buildScratchSize, OFFSET$buildScratchSize);
    }

    public void buildScratchSize(@unsigned long value) {
        segment.set(LAYOUT$buildScratchSize, OFFSET$buildScratchSize, value);
    }


    public static final class VkAccelerationStructureBuildSizesInfoKHRFactory implements IDataTypeFactory<VkAccelerationStructureBuildSizesInfoKHR> {
        @Override
        public Class<VkAccelerationStructureBuildSizesInfoKHR> clazz() {
            return VkAccelerationStructureBuildSizesInfoKHR.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkAccelerationStructureBuildSizesInfoKHR.LAYOUT;
        }

        @Override
        public VkAccelerationStructureBuildSizesInfoKHR create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkAccelerationStructureBuildSizesInfoKHR createUninit(MemorySegment segment) {
            return new VkAccelerationStructureBuildSizesInfoKHR(segment);
        }
    }

    public static final VkAccelerationStructureBuildSizesInfoKHRFactory FACTORY = new VkAccelerationStructureBuildSizesInfoKHRFactory();
}
