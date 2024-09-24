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

public record VkAccelerationStructureCaptureDescriptorDataInfoEXT(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("accelerationStructure"),
        ValueLayout.ADDRESS.withName("accelerationStructureNV")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$accelerationStructure = PathElement.groupElement("accelerationStructure");
    public static final PathElement PATH$accelerationStructureNV = PathElement.groupElement("accelerationStructureNV");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final AddressLayout LAYOUT$accelerationStructure = (AddressLayout) LAYOUT.select(PATH$accelerationStructure);
    public static final AddressLayout LAYOUT$accelerationStructureNV = (AddressLayout) LAYOUT.select(PATH$accelerationStructureNV);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$accelerationStructure = LAYOUT.byteOffset(PATH$accelerationStructure);
    public static final long OFFSET$accelerationStructureNV = LAYOUT.byteOffset(PATH$accelerationStructureNV);

    public VkAccelerationStructureCaptureDescriptorDataInfoEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_CAPTURE_DESCRIPTOR_DATA_INFO_EXT);
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

    public VkAccelerationStructureKHR accelerationStructure() {
        return new VkAccelerationStructureKHR(segment.asSlice(OFFSET$accelerationStructure, LAYOUT$accelerationStructure));
    }

    public void accelerationStructure(VkAccelerationStructureKHR value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$accelerationStructure, LAYOUT$accelerationStructure.byteSize());
    }

    public VkAccelerationStructureNV accelerationStructureNV() {
        return new VkAccelerationStructureNV(segment.asSlice(OFFSET$accelerationStructureNV, LAYOUT$accelerationStructureNV));
    }

    public void accelerationStructureNV(VkAccelerationStructureNV value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$accelerationStructureNV, LAYOUT$accelerationStructureNV.byteSize());
    }


    public static final class Factory implements IFactory<VkAccelerationStructureCaptureDescriptorDataInfoEXT> {
        @Override
        public Class<VkAccelerationStructureCaptureDescriptorDataInfoEXT> clazz() {
            return VkAccelerationStructureCaptureDescriptorDataInfoEXT.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkAccelerationStructureCaptureDescriptorDataInfoEXT.LAYOUT;
        }

        @Override
        public VkAccelerationStructureCaptureDescriptorDataInfoEXT create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkAccelerationStructureCaptureDescriptorDataInfoEXT createUninit(MemorySegment segment) {
            return new VkAccelerationStructureCaptureDescriptorDataInfoEXT(segment);
        }
    }

    public static final Factory FACTORY = new Factory();
}
