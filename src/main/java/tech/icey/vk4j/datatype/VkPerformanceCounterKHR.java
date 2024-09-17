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

public record VkPerformanceCounterKHR(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("unit"),
        ValueLayout.JAVA_INT.withName("scope"),
        ValueLayout.JAVA_INT.withName("storage"),
        MemoryLayout.sequenceLayout(VK_UUID_SIZE, ValueLayout.JAVA_BYTE).withName("uuid")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$unit = PathElement.groupElement("unit");
    public static final PathElement PATH$scope = PathElement.groupElement("scope");
    public static final PathElement PATH$storage = PathElement.groupElement("storage");
    public static final PathElement PATH$uuid = PathElement.groupElement("uuid");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$unit = (OfInt) LAYOUT.select(PATH$unit);
    public static final OfInt LAYOUT$scope = (OfInt) LAYOUT.select(PATH$scope);
    public static final OfInt LAYOUT$storage = (OfInt) LAYOUT.select(PATH$storage);
    public static final SequenceLayout LAYOUT$uuid = (SequenceLayout) LAYOUT.select(PATH$uuid);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$unit = LAYOUT.byteOffset(PATH$unit);
    public static final long OFFSET$scope = LAYOUT.byteOffset(PATH$scope);
    public static final long OFFSET$storage = LAYOUT.byteOffset(PATH$storage);
    public static final long OFFSET$uuid = LAYOUT.byteOffset(PATH$uuid);

    public VkPerformanceCounterKHR(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PERFORMANCE_COUNTER_KHR);
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

    public @enumtype(VkPerformanceCounterUnitKHR.class) int unit() {
        return segment.get(LAYOUT$unit, OFFSET$unit);
    }

    public void unit(@enumtype(VkPerformanceCounterUnitKHR.class) int value) {
        segment.set(LAYOUT$unit, OFFSET$unit, value);
    }

    public @enumtype(VkPerformanceCounterScopeKHR.class) int scope() {
        return segment.get(LAYOUT$scope, OFFSET$scope);
    }

    public void scope(@enumtype(VkPerformanceCounterScopeKHR.class) int value) {
        segment.set(LAYOUT$scope, OFFSET$scope, value);
    }

    public @enumtype(VkPerformanceCounterStorageKHR.class) int storage() {
        return segment.get(LAYOUT$storage, OFFSET$storage);
    }

    public void storage(@enumtype(VkPerformanceCounterStorageKHR.class) int value) {
        segment.set(LAYOUT$storage, OFFSET$storage, value);
    }

    public MemorySegment uuidRaw() {
        return segment.asSlice(OFFSET$uuid, LAYOUT$uuid.byteSize());
    }

    public @unsigned ByteArray uuid() {
        return new ByteArray(uuidRaw(), LAYOUT$uuid.elementCount());
    }

    public void uuid(@unsigned ByteArray value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$uuid, LAYOUT$uuid.byteSize());
    }


    public static final class VkPerformanceCounterKHRFactory implements IDataTypeFactory<VkPerformanceCounterKHR> {
        @Override
        public Class<VkPerformanceCounterKHR> clazz() {
            return VkPerformanceCounterKHR.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkPerformanceCounterKHR.LAYOUT;
        }

        @Override
        public VkPerformanceCounterKHR create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkPerformanceCounterKHR createUninit(MemorySegment segment) {
            return new VkPerformanceCounterKHR(segment);
        }
    }

    public static final VkPerformanceCounterKHRFactory FACTORY = new VkPerformanceCounterKHRFactory();
}
