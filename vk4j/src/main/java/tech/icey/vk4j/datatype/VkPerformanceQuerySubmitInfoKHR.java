package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.annotation.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.NativeLayout;
import tech.icey.vk4j.IFactory;

import static tech.icey.vk4j.enumtype.VkStructureType.*;

public record VkPerformanceQuerySubmitInfoKHR(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("counterPassIndex")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$counterPassIndex = PathElement.groupElement("counterPassIndex");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$counterPassIndex = (OfInt) LAYOUT.select(PATH$counterPassIndex);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$counterPassIndex = LAYOUT.byteOffset(PATH$counterPassIndex);

    public VkPerformanceQuerySubmitInfoKHR(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PERFORMANCE_QUERY_SUBMIT_INFO_KHR);
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

    public @unsigned int counterPassIndex() {
        return segment.get(LAYOUT$counterPassIndex, OFFSET$counterPassIndex);
    }

    public void counterPassIndex(@unsigned int value) {
        segment.set(LAYOUT$counterPassIndex, OFFSET$counterPassIndex, value);
    }


    public static final class Factory implements IFactory<VkPerformanceQuerySubmitInfoKHR> {
        @Override
        public Class<VkPerformanceQuerySubmitInfoKHR> clazz() {
            return VkPerformanceQuerySubmitInfoKHR.class;
        }

        @Override
        public MemoryLayout layout() {
            return VkPerformanceQuerySubmitInfoKHR.LAYOUT;
        }

        @Override
        public VkPerformanceQuerySubmitInfoKHR create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkPerformanceQuerySubmitInfoKHR createUninit(MemorySegment segment) {
            return new VkPerformanceQuerySubmitInfoKHR(segment);
        }
    }

    public static final Factory FACTORY = new Factory();
}
