package tech.icey.vk4j.datatype;

import tech.icey.vk4j.IFactory;
import tech.icey.vk4j.NativeLayout;
import tech.icey.vk4j.annotation.enumtype;
import tech.icey.vk4j.annotation.pointer;
import tech.icey.vk4j.annotation.unsigned;
import tech.icey.vk4j.enumtype.VkStructureType;
import tech.icey.vk4j.ptr.LongPtr;

import java.lang.foreign.AddressLayout;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;

import static java.lang.foreign.ValueLayout.OfInt;
import static java.lang.foreign.ValueLayout.PathElement;
import static tech.icey.vk4j.enumtype.VkStructureType.VK_STRUCTURE_TYPE_D3D12_FENCE_SUBMIT_INFO_KHR;

public record VkD3D12FenceSubmitInfoKHR(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("waitSemaphoreValuesCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_LONG).withName("pWaitSemaphoreValues"),
        ValueLayout.JAVA_INT.withName("signalSemaphoreValuesCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_LONG).withName("pSignalSemaphoreValues")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$waitSemaphoreValuesCount = PathElement.groupElement("waitSemaphoreValuesCount");
    public static final PathElement PATH$pWaitSemaphoreValues = PathElement.groupElement("pWaitSemaphoreValues");
    public static final PathElement PATH$signalSemaphoreValuesCount = PathElement.groupElement("signalSemaphoreValuesCount");
    public static final PathElement PATH$pSignalSemaphoreValues = PathElement.groupElement("pSignalSemaphoreValues");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$waitSemaphoreValuesCount = (OfInt) LAYOUT.select(PATH$waitSemaphoreValuesCount);
    public static final AddressLayout LAYOUT$pWaitSemaphoreValues = (AddressLayout) LAYOUT.select(PATH$pWaitSemaphoreValues);
    public static final OfInt LAYOUT$signalSemaphoreValuesCount = (OfInt) LAYOUT.select(PATH$signalSemaphoreValuesCount);
    public static final AddressLayout LAYOUT$pSignalSemaphoreValues = (AddressLayout) LAYOUT.select(PATH$pSignalSemaphoreValues);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$waitSemaphoreValuesCount = LAYOUT.byteOffset(PATH$waitSemaphoreValuesCount);
    public static final long OFFSET$pWaitSemaphoreValues = LAYOUT.byteOffset(PATH$pWaitSemaphoreValues);
    public static final long OFFSET$signalSemaphoreValuesCount = LAYOUT.byteOffset(PATH$signalSemaphoreValuesCount);
    public static final long OFFSET$pSignalSemaphoreValues = LAYOUT.byteOffset(PATH$pSignalSemaphoreValues);

    public VkD3D12FenceSubmitInfoKHR(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_D3D12_FENCE_SUBMIT_INFO_KHR);
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

    public @unsigned int waitSemaphoreValuesCount() {
        return segment.get(LAYOUT$waitSemaphoreValuesCount, OFFSET$waitSemaphoreValuesCount);
    }

    public void waitSemaphoreValuesCount(@unsigned int value) {
        segment.set(LAYOUT$waitSemaphoreValuesCount, OFFSET$waitSemaphoreValuesCount, value);
    }

    public @pointer(comment="uint64_t*") MemorySegment pWaitSemaphoreValuesRaw() {
        return segment.get(LAYOUT$pWaitSemaphoreValues, OFFSET$pWaitSemaphoreValues);
    }

    public void pWaitSemaphoreValuesRaw(@pointer(comment="uint64_t*") MemorySegment value) {
        segment.set(LAYOUT$pWaitSemaphoreValues, OFFSET$pWaitSemaphoreValues, value);
    }

    public @unsigned LongPtr pWaitSemaphoreValues() {
        return new LongPtr(pWaitSemaphoreValuesRaw());
    }

    public void pWaitSemaphoreValues(@unsigned LongPtr value) {
        pWaitSemaphoreValuesRaw(value.segment());
    }

    public @unsigned int signalSemaphoreValuesCount() {
        return segment.get(LAYOUT$signalSemaphoreValuesCount, OFFSET$signalSemaphoreValuesCount);
    }

    public void signalSemaphoreValuesCount(@unsigned int value) {
        segment.set(LAYOUT$signalSemaphoreValuesCount, OFFSET$signalSemaphoreValuesCount, value);
    }

    public @pointer(comment="uint64_t*") MemorySegment pSignalSemaphoreValuesRaw() {
        return segment.get(LAYOUT$pSignalSemaphoreValues, OFFSET$pSignalSemaphoreValues);
    }

    public void pSignalSemaphoreValuesRaw(@pointer(comment="uint64_t*") MemorySegment value) {
        segment.set(LAYOUT$pSignalSemaphoreValues, OFFSET$pSignalSemaphoreValues, value);
    }

    public @unsigned LongPtr pSignalSemaphoreValues() {
        return new LongPtr(pSignalSemaphoreValuesRaw());
    }

    public void pSignalSemaphoreValues(@unsigned LongPtr value) {
        pSignalSemaphoreValuesRaw(value.segment());
    }


    public static final class Factory implements IFactory<VkD3D12FenceSubmitInfoKHR> {
        @Override
        public Class<VkD3D12FenceSubmitInfoKHR> clazz() {
            return VkD3D12FenceSubmitInfoKHR.class;
        }

        @Override
        public MemoryLayout layout() {
            return VkD3D12FenceSubmitInfoKHR.LAYOUT;
        }

        @Override
        public VkD3D12FenceSubmitInfoKHR create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkD3D12FenceSubmitInfoKHR createUninit(MemorySegment segment) {
            return new VkD3D12FenceSubmitInfoKHR(segment);
        }
    }

    public static final Factory FACTORY = new Factory();
}
