package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.IPointer;
import tech.icey.vk4j.annotation.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.buffer.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import tech.icey.vk4j.NativeLayout;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

public record VkWriteDescriptorSetAccelerationStructureKHR(MemorySegment segment) implements IPointer {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("accelerationStructureCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS).withName("pAccelerationStructures")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$accelerationStructureCount = PathElement.groupElement("accelerationStructureCount");
    public static final PathElement PATH$pAccelerationStructures = PathElement.groupElement("pAccelerationStructures");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$accelerationStructureCount = (OfInt) LAYOUT.select(PATH$accelerationStructureCount);
    public static final AddressLayout LAYOUT$pAccelerationStructures = (AddressLayout) LAYOUT.select(PATH$pAccelerationStructures);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$accelerationStructureCount = LAYOUT.byteOffset(PATH$accelerationStructureCount);
    public static final long OFFSET$pAccelerationStructures = LAYOUT.byteOffset(PATH$pAccelerationStructures);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$accelerationStructureCount = LAYOUT$accelerationStructureCount.byteSize();
    public static final long SIZE$pAccelerationStructures = LAYOUT$pAccelerationStructures.byteSize();

    public VkWriteDescriptorSetAccelerationStructureKHR(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_WRITE_DESCRIPTOR_SET_ACCELERATION_STRUCTURE_KHR);
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

    public @unsigned int accelerationStructureCount() {
        return segment.get(LAYOUT$accelerationStructureCount, OFFSET$accelerationStructureCount);
    }

    public void accelerationStructureCount(@unsigned int value) {
        segment.set(LAYOUT$accelerationStructureCount, OFFSET$accelerationStructureCount, value);
    }

    public @pointer(comment="VkAccelerationStructureKHR") MemorySegment pAccelerationStructuresRaw() {
        return segment.get(LAYOUT$pAccelerationStructures, OFFSET$pAccelerationStructures);
    }

    public void pAccelerationStructuresRaw(@pointer(comment="VkAccelerationStructureKHR") MemorySegment value) {
        segment.set(LAYOUT$pAccelerationStructures, OFFSET$pAccelerationStructures, value);
    }

    public @nullable VkAccelerationStructureKHR.Buffer pAccelerationStructures() {
        MemorySegment s = pAccelerationStructuresRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkAccelerationStructureKHR.Buffer(s);
    }

    public void pAccelerationStructures(@nullable VkAccelerationStructureKHR.Buffer value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pAccelerationStructuresRaw(s);
    }

    public static VkWriteDescriptorSetAccelerationStructureKHR allocate(Arena arena) {
        return new VkWriteDescriptorSetAccelerationStructureKHR(arena.allocate(LAYOUT));
    }
    
    public static VkWriteDescriptorSetAccelerationStructureKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkWriteDescriptorSetAccelerationStructureKHR[] ret = new VkWriteDescriptorSetAccelerationStructureKHR[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkWriteDescriptorSetAccelerationStructureKHR(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
}
