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

public record VkTimelineSemaphoreSubmitInfo(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("waitSemaphoreValueCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_LONG).withName("pWaitSemaphoreValues"),
        ValueLayout.JAVA_INT.withName("signalSemaphoreValueCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_LONG).withName("pSignalSemaphoreValues")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$waitSemaphoreValueCount = PathElement.groupElement("waitSemaphoreValueCount");
    public static final PathElement PATH$pWaitSemaphoreValues = PathElement.groupElement("pWaitSemaphoreValues");
    public static final PathElement PATH$signalSemaphoreValueCount = PathElement.groupElement("signalSemaphoreValueCount");
    public static final PathElement PATH$pSignalSemaphoreValues = PathElement.groupElement("pSignalSemaphoreValues");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$waitSemaphoreValueCount = (OfInt) LAYOUT.select(PATH$waitSemaphoreValueCount);
    public static final AddressLayout LAYOUT$pWaitSemaphoreValues = (AddressLayout) LAYOUT.select(PATH$pWaitSemaphoreValues);
    public static final OfInt LAYOUT$signalSemaphoreValueCount = (OfInt) LAYOUT.select(PATH$signalSemaphoreValueCount);
    public static final AddressLayout LAYOUT$pSignalSemaphoreValues = (AddressLayout) LAYOUT.select(PATH$pSignalSemaphoreValues);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$waitSemaphoreValueCount = LAYOUT.byteOffset(PATH$waitSemaphoreValueCount);
    public static final long OFFSET$pWaitSemaphoreValues = LAYOUT.byteOffset(PATH$pWaitSemaphoreValues);
    public static final long OFFSET$signalSemaphoreValueCount = LAYOUT.byteOffset(PATH$signalSemaphoreValueCount);
    public static final long OFFSET$pSignalSemaphoreValues = LAYOUT.byteOffset(PATH$pSignalSemaphoreValues);

    public VkTimelineSemaphoreSubmitInfo(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_TIMELINE_SEMAPHORE_SUBMIT_INFO);
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

    public @unsigned int waitSemaphoreValueCount() {
        return segment.get(LAYOUT$waitSemaphoreValueCount, OFFSET$waitSemaphoreValueCount);
    }

    public void waitSemaphoreValueCount(@unsigned int value) {
        segment.set(LAYOUT$waitSemaphoreValueCount, OFFSET$waitSemaphoreValueCount, value);
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

    public @unsigned int signalSemaphoreValueCount() {
        return segment.get(LAYOUT$signalSemaphoreValueCount, OFFSET$signalSemaphoreValueCount);
    }

    public void signalSemaphoreValueCount(@unsigned int value) {
        segment.set(LAYOUT$signalSemaphoreValueCount, OFFSET$signalSemaphoreValueCount, value);
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


    public static final class VkTimelineSemaphoreSubmitInfoFactory implements IDataTypeFactory<VkTimelineSemaphoreSubmitInfo> {
        @Override
        public Class<VkTimelineSemaphoreSubmitInfo> clazz() {
            return VkTimelineSemaphoreSubmitInfo.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkTimelineSemaphoreSubmitInfo.LAYOUT;
        }

        @Override
        public VkTimelineSemaphoreSubmitInfo create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkTimelineSemaphoreSubmitInfo createUninit(MemorySegment segment) {
            return new VkTimelineSemaphoreSubmitInfo(segment);
        }
    }

    public static final VkTimelineSemaphoreSubmitInfoFactory FACTORY = new VkTimelineSemaphoreSubmitInfoFactory();
}
