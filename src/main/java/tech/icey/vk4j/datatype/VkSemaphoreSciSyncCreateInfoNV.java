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

public record VkSemaphoreSciSyncCreateInfoNV(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("semaphorePool"),
        ValueLayout.ADDRESS.withTargetLayout(MemoryLayout.sequenceLayout(6, ValueLayout.JAVA_LONG)).withName("pFence")
    );

    public static final PathElement PATH$sType = PathElement.groupElement(0);
    public static final PathElement PATH$pNext = PathElement.groupElement(1);
    public static final PathElement PATH$semaphorePool = PathElement.groupElement(2);
    public static final PathElement PATH$pFence = PathElement.groupElement(3);

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final AddressLayout LAYOUT$semaphorePool = (AddressLayout) LAYOUT.select(PATH$semaphorePool);
    public static final AddressLayout LAYOUT$pFence = (AddressLayout) LAYOUT.select(PATH$pFence);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$semaphorePool = LAYOUT.byteOffset(PATH$semaphorePool);
    public static final long OFFSET$pFence = LAYOUT.byteOffset(PATH$pFence);

    public VkSemaphoreSciSyncCreateInfoNV(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_SEMAPHORE_SCI_SYNC_CREATE_INFO_NV);
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

    public VkSemaphoreSciSyncPoolNV semaphorePool() {
        return new VkSemaphoreSciSyncPoolNV(segment.asSlice(OFFSET$semaphorePool, LAYOUT$semaphorePool));
    }

    public void semaphorePool(VkSemaphoreSciSyncPoolNV value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$semaphorePool, LAYOUT$semaphorePool.byteSize());
    }

    public @pointer(comment="uint64_t[6] const*") MemorySegment pFenceRaw() {
        return segment.get(LAYOUT$pFence, OFFSET$pFence);
    }

    public void pFenceRaw(@pointer(comment="uint64_t[6] const*") MemorySegment value) {
        segment.set(LAYOUT$pFence, OFFSET$pFence, value);
    }


    public static final class VkSemaphoreSciSyncCreateInfoNVFactory implements IDataTypeFactory<VkSemaphoreSciSyncCreateInfoNV> {
        @Override
        public Class<VkSemaphoreSciSyncCreateInfoNV> clazz() {
            return VkSemaphoreSciSyncCreateInfoNV.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkSemaphoreSciSyncCreateInfoNV.LAYOUT;
        }

        @Override
        public VkSemaphoreSciSyncCreateInfoNV create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkSemaphoreSciSyncCreateInfoNV createUninit(MemorySegment segment) {
            return new VkSemaphoreSciSyncCreateInfoNV(segment);
        }
    }

    public static final VkSemaphoreSciSyncCreateInfoNVFactory FACTORY = new VkSemaphoreSciSyncCreateInfoNVFactory();
}
