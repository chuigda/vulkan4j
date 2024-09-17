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

public record VkQueryPoolPerformanceCreateInfoKHR(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("queueFamilyIndex"),
        ValueLayout.JAVA_INT.withName("counterIndexCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT).withName("pCounterIndices")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$queueFamilyIndex = PathElement.groupElement("queueFamilyIndex");
    public static final PathElement PATH$counterIndexCount = PathElement.groupElement("counterIndexCount");
    public static final PathElement PATH$pCounterIndices = PathElement.groupElement("pCounterIndices");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$queueFamilyIndex = (OfInt) LAYOUT.select(PATH$queueFamilyIndex);
    public static final OfInt LAYOUT$counterIndexCount = (OfInt) LAYOUT.select(PATH$counterIndexCount);
    public static final AddressLayout LAYOUT$pCounterIndices = (AddressLayout) LAYOUT.select(PATH$pCounterIndices);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$queueFamilyIndex = LAYOUT.byteOffset(PATH$queueFamilyIndex);
    public static final long OFFSET$counterIndexCount = LAYOUT.byteOffset(PATH$counterIndexCount);
    public static final long OFFSET$pCounterIndices = LAYOUT.byteOffset(PATH$pCounterIndices);

    public VkQueryPoolPerformanceCreateInfoKHR(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_QUERY_POOL_PERFORMANCE_CREATE_INFO_KHR);
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

    public @unsigned int queueFamilyIndex() {
        return segment.get(LAYOUT$queueFamilyIndex, OFFSET$queueFamilyIndex);
    }

    public void queueFamilyIndex(@unsigned int value) {
        segment.set(LAYOUT$queueFamilyIndex, OFFSET$queueFamilyIndex, value);
    }

    public @unsigned int counterIndexCount() {
        return segment.get(LAYOUT$counterIndexCount, OFFSET$counterIndexCount);
    }

    public void counterIndexCount(@unsigned int value) {
        segment.set(LAYOUT$counterIndexCount, OFFSET$counterIndexCount, value);
    }

    public @pointer(comment="uint32_t*") MemorySegment pCounterIndicesRaw() {
        return segment.get(LAYOUT$pCounterIndices, OFFSET$pCounterIndices);
    }

    public void pCounterIndicesRaw(@pointer(comment="uint32_t*") MemorySegment value) {
        segment.set(LAYOUT$pCounterIndices, OFFSET$pCounterIndices, value);
    }
    
    public @unsigned IntPtr pCounterIndices() {
        return new IntPtr(pCounterIndicesRaw());
    }

    public void pCounterIndices(@unsigned IntPtr value) {
        pCounterIndicesRaw(value.segment());
    }


    public static final class VkQueryPoolPerformanceCreateInfoKHRFactory implements IDataTypeFactory<VkQueryPoolPerformanceCreateInfoKHR> {
        @Override
        public Class<VkQueryPoolPerformanceCreateInfoKHR> clazz() {
            return VkQueryPoolPerformanceCreateInfoKHR.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkQueryPoolPerformanceCreateInfoKHR.LAYOUT;
        }

        @Override
        public VkQueryPoolPerformanceCreateInfoKHR create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkQueryPoolPerformanceCreateInfoKHR createUninit(MemorySegment segment) {
            return new VkQueryPoolPerformanceCreateInfoKHR(segment);
        }
    }

    public static final VkQueryPoolPerformanceCreateInfoKHRFactory FACTORY = new VkQueryPoolPerformanceCreateInfoKHRFactory();
}
