package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.annotation.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.buffer.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import tech.icey.vk4j.NativeLayout;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

public record VkBindAccelerationStructureMemoryInfoNV(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("accelerationStructure"),
        ValueLayout.ADDRESS.withName("memory"),
        ValueLayout.JAVA_LONG.withName("memoryOffset"),
        ValueLayout.JAVA_INT.withName("deviceIndexCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT).withName("pDeviceIndices")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$accelerationStructure = PathElement.groupElement("accelerationStructure");
    public static final PathElement PATH$memory = PathElement.groupElement("memory");
    public static final PathElement PATH$memoryOffset = PathElement.groupElement("memoryOffset");
    public static final PathElement PATH$deviceIndexCount = PathElement.groupElement("deviceIndexCount");
    public static final PathElement PATH$pDeviceIndices = PathElement.groupElement("pDeviceIndices");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final AddressLayout LAYOUT$accelerationStructure = (AddressLayout) LAYOUT.select(PATH$accelerationStructure);
    public static final AddressLayout LAYOUT$memory = (AddressLayout) LAYOUT.select(PATH$memory);
    public static final OfLong LAYOUT$memoryOffset = (OfLong) LAYOUT.select(PATH$memoryOffset);
    public static final OfInt LAYOUT$deviceIndexCount = (OfInt) LAYOUT.select(PATH$deviceIndexCount);
    public static final AddressLayout LAYOUT$pDeviceIndices = (AddressLayout) LAYOUT.select(PATH$pDeviceIndices);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$accelerationStructure = LAYOUT.byteOffset(PATH$accelerationStructure);
    public static final long OFFSET$memory = LAYOUT.byteOffset(PATH$memory);
    public static final long OFFSET$memoryOffset = LAYOUT.byteOffset(PATH$memoryOffset);
    public static final long OFFSET$deviceIndexCount = LAYOUT.byteOffset(PATH$deviceIndexCount);
    public static final long OFFSET$pDeviceIndices = LAYOUT.byteOffset(PATH$pDeviceIndices);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$accelerationStructure = LAYOUT$accelerationStructure.byteSize();
    public static final long SIZE$memory = LAYOUT$memory.byteSize();
    public static final long SIZE$memoryOffset = LAYOUT$memoryOffset.byteSize();
    public static final long SIZE$deviceIndexCount = LAYOUT$deviceIndexCount.byteSize();
    public static final long SIZE$pDeviceIndices = LAYOUT$pDeviceIndices.byteSize();

    public VkBindAccelerationStructureMemoryInfoNV(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_BIND_ACCELERATION_STRUCTURE_MEMORY_INFO_NV);
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

    public VkAccelerationStructureNV accelerationStructure() {
        return new VkAccelerationStructureNV(segment.get(LAYOUT$accelerationStructure, OFFSET$accelerationStructure));
    }

    public void accelerationStructure(VkAccelerationStructureNV value) {
        segment.set(LAYOUT$accelerationStructure, OFFSET$accelerationStructure, value.segment());
    }

    public VkDeviceMemory memory() {
        return new VkDeviceMemory(segment.get(LAYOUT$memory, OFFSET$memory));
    }

    public void memory(VkDeviceMemory value) {
        segment.set(LAYOUT$memory, OFFSET$memory, value.segment());
    }

    public @unsigned long memoryOffset() {
        return segment.get(LAYOUT$memoryOffset, OFFSET$memoryOffset);
    }

    public void memoryOffset(@unsigned long value) {
        segment.set(LAYOUT$memoryOffset, OFFSET$memoryOffset, value);
    }

    public @unsigned int deviceIndexCount() {
        return segment.get(LAYOUT$deviceIndexCount, OFFSET$deviceIndexCount);
    }

    public void deviceIndexCount(@unsigned int value) {
        segment.set(LAYOUT$deviceIndexCount, OFFSET$deviceIndexCount, value);
    }

    public @pointer(comment="uint32_t*") MemorySegment pDeviceIndicesRaw() {
        return segment.get(LAYOUT$pDeviceIndices, OFFSET$pDeviceIndices);
    }

    public void pDeviceIndicesRaw(@pointer(comment="uint32_t*") MemorySegment value) {
        segment.set(LAYOUT$pDeviceIndices, OFFSET$pDeviceIndices, value);
    }

    public @nullable @unsigned IntBuffer pDeviceIndices() {
        MemorySegment s = pDeviceIndicesRaw();
        return s.address() == 0 ? null : new IntBuffer(s);
    }

    public void pDeviceIndices(@nullable @unsigned IntBuffer value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pDeviceIndicesRaw(s);
    }

    public static VkBindAccelerationStructureMemoryInfoNV allocate(Arena arena) {
        return new VkBindAccelerationStructureMemoryInfoNV(arena.allocate(LAYOUT));
    }
    
    public static VkBindAccelerationStructureMemoryInfoNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkBindAccelerationStructureMemoryInfoNV[] ret = new VkBindAccelerationStructureMemoryInfoNV[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkBindAccelerationStructureMemoryInfoNV(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
}
