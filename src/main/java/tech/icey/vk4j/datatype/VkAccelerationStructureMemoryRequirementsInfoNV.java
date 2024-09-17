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

public record VkAccelerationStructureMemoryRequirementsInfoNV(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.ADDRESS.withName("accelerationStructure")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$accelerationStructure = PathElement.groupElement("accelerationStructure");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final AddressLayout LAYOUT$accelerationStructure = (AddressLayout) LAYOUT.select(PATH$accelerationStructure);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$accelerationStructure = LAYOUT.byteOffset(PATH$accelerationStructure);

    public VkAccelerationStructureMemoryRequirementsInfoNV(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_MEMORY_REQUIREMENTS_INFO_NV);
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

    public @enumtype(VkAccelerationStructureMemoryRequirementsTypeNV.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public void type(@enumtype(VkAccelerationStructureMemoryRequirementsTypeNV.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
    }

    public VkAccelerationStructureNV accelerationStructure() {
        return new VkAccelerationStructureNV(segment.asSlice(OFFSET$accelerationStructure, LAYOUT$accelerationStructure));
    }

    public void accelerationStructure(VkAccelerationStructureNV value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$accelerationStructure, LAYOUT$accelerationStructure.byteSize());
    }


    public static final class VkAccelerationStructureMemoryRequirementsInfoNVFactory implements IDataTypeFactory<VkAccelerationStructureMemoryRequirementsInfoNV> {
        @Override
        public Class<VkAccelerationStructureMemoryRequirementsInfoNV> clazz() {
            return VkAccelerationStructureMemoryRequirementsInfoNV.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkAccelerationStructureMemoryRequirementsInfoNV.LAYOUT;
        }

        @Override
        public VkAccelerationStructureMemoryRequirementsInfoNV create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkAccelerationStructureMemoryRequirementsInfoNV createUninit(MemorySegment segment) {
            return new VkAccelerationStructureMemoryRequirementsInfoNV(segment);
        }
    }

    public static final VkAccelerationStructureMemoryRequirementsInfoNVFactory FACTORY = new VkAccelerationStructureMemoryRequirementsInfoNVFactory();
}
