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

public record VkSemaphoreWaitInfo(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("semaphoreCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS).withName("pSemaphores"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_LONG).withName("pValues")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$flags = PathElement.groupElement("flags");
    public static final PathElement PATH$semaphoreCount = PathElement.groupElement("semaphoreCount");
    public static final PathElement PATH$pSemaphores = PathElement.groupElement("pSemaphores");
    public static final PathElement PATH$pValues = PathElement.groupElement("pValues");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$flags = (OfInt) LAYOUT.select(PATH$flags);
    public static final OfInt LAYOUT$semaphoreCount = (OfInt) LAYOUT.select(PATH$semaphoreCount);
    public static final AddressLayout LAYOUT$pSemaphores = (AddressLayout) LAYOUT.select(PATH$pSemaphores);
    public static final AddressLayout LAYOUT$pValues = (AddressLayout) LAYOUT.select(PATH$pValues);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$semaphoreCount = LAYOUT.byteOffset(PATH$semaphoreCount);
    public static final long OFFSET$pSemaphores = LAYOUT.byteOffset(PATH$pSemaphores);
    public static final long OFFSET$pValues = LAYOUT.byteOffset(PATH$pValues);

    public VkSemaphoreWaitInfo(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_SEMAPHORE_WAIT_INFO);
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

    public @enumtype(VkSemaphoreWaitFlags.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public void flags(@enumtype(VkSemaphoreWaitFlags.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
    }

    public @unsigned int semaphoreCount() {
        return segment.get(LAYOUT$semaphoreCount, OFFSET$semaphoreCount);
    }

    public void semaphoreCount(@unsigned int value) {
        segment.set(LAYOUT$semaphoreCount, OFFSET$semaphoreCount, value);
    }

    public @pointer(comment="VkSemaphore*") MemorySegment pSemaphoresRaw() {
        return segment.get(LAYOUT$pSemaphores, OFFSET$pSemaphores);
    }

    public void pSemaphoresRaw(@pointer(comment="VkSemaphore*") MemorySegment value) {
        segment.set(LAYOUT$pSemaphores, OFFSET$pSemaphores, value);
    }
    
    public @nullable VkSemaphore pSemaphores() {
        MemorySegment s = pSemaphoresRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkSemaphore(s);
    }

    public void pSemaphores(@nullable VkSemaphore value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pSemaphoresRaw(s);
    }

    public @pointer(comment="uint64_t*") MemorySegment pValuesRaw() {
        return segment.get(LAYOUT$pValues, OFFSET$pValues);
    }

    public void pValuesRaw(@pointer(comment="uint64_t*") MemorySegment value) {
        segment.set(LAYOUT$pValues, OFFSET$pValues, value);
    }
    
    public @unsigned LongPtr pValues() {
        return new LongPtr(pValuesRaw());
    }

    public void pValues(@unsigned LongPtr value) {
        pValuesRaw(value.segment());
    }


    public static final class VkSemaphoreWaitInfoFactory implements IFactory<VkSemaphoreWaitInfo> {
        @Override
        public Class<VkSemaphoreWaitInfo> clazz() {
            return VkSemaphoreWaitInfo.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkSemaphoreWaitInfo.LAYOUT;
        }

        @Override
        public VkSemaphoreWaitInfo create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkSemaphoreWaitInfo createUninit(MemorySegment segment) {
            return new VkSemaphoreWaitInfo(segment);
        }
    }

    public static final VkSemaphoreWaitInfoFactory FACTORY = new VkSemaphoreWaitInfoFactory();
}
