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

public record VkAccelerationStructureCreateInfoNV(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("compactedSize"),
        VkAccelerationStructureInfoNV.LAYOUT.withName("info")
    );

    public static final PathElement PATH$sType = PathElement.groupElement(0);
    public static final PathElement PATH$pNext = PathElement.groupElement(1);
    public static final PathElement PATH$compactedSize = PathElement.groupElement(2);
    public static final PathElement PATH$info = PathElement.groupElement(3);

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfLong LAYOUT$compactedSize = (OfLong) LAYOUT.select(PATH$compactedSize);
    public static final StructLayout LAYOUT$info = (StructLayout) LAYOUT.select(PATH$info);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$compactedSize = LAYOUT.byteOffset(PATH$compactedSize);
    public static final long OFFSET$info = LAYOUT.byteOffset(PATH$info);

    public VkAccelerationStructureCreateInfoNV(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_CREATE_INFO_NV);
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

    public @unsigned long compactedSize() {
        return segment.get(LAYOUT$compactedSize, OFFSET$compactedSize);
    }

    public void compactedSize(@unsigned long value) {
        segment.set(LAYOUT$compactedSize, OFFSET$compactedSize, value);
    }

    public VkAccelerationStructureInfoNV info() {
        return new VkAccelerationStructureInfoNV(segment.asSlice(OFFSET$info, LAYOUT$info));
    }

    public void info(VkAccelerationStructureInfoNV value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$info, LAYOUT$info.byteSize());
    }


    public static final class VkAccelerationStructureCreateInfoNVFactory implements IDataTypeFactory<VkAccelerationStructureCreateInfoNV> {
        @Override
        public Class<VkAccelerationStructureCreateInfoNV> clazz() {
            return VkAccelerationStructureCreateInfoNV.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkAccelerationStructureCreateInfoNV.LAYOUT;
        }

        @Override
        public VkAccelerationStructureCreateInfoNV create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkAccelerationStructureCreateInfoNV createUninit(MemorySegment segment) {
            return new VkAccelerationStructureCreateInfoNV(segment);
        }
    }

    public static final VkAccelerationStructureCreateInfoNVFactory FACTORY = new VkAccelerationStructureCreateInfoNVFactory();
}
