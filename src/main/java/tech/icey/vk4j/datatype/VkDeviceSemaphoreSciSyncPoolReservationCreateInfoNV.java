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

public record VkDeviceSemaphoreSciSyncPoolReservationCreateInfoNV(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("semaphoreSciSyncPoolRequestCount")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$semaphoreSciSyncPoolRequestCount = PathElement.groupElement("semaphoreSciSyncPoolRequestCount");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$semaphoreSciSyncPoolRequestCount = (OfInt) LAYOUT.select(PATH$semaphoreSciSyncPoolRequestCount);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$semaphoreSciSyncPoolRequestCount = LAYOUT.byteOffset(PATH$semaphoreSciSyncPoolRequestCount);

    public VkDeviceSemaphoreSciSyncPoolReservationCreateInfoNV(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_DEVICE_SEMAPHORE_SCI_SYNC_POOL_RESERVATION_CREATE_INFO_NV);
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

    public @unsigned int semaphoreSciSyncPoolRequestCount() {
        return segment.get(LAYOUT$semaphoreSciSyncPoolRequestCount, OFFSET$semaphoreSciSyncPoolRequestCount);
    }

    public void semaphoreSciSyncPoolRequestCount(@unsigned int value) {
        segment.set(LAYOUT$semaphoreSciSyncPoolRequestCount, OFFSET$semaphoreSciSyncPoolRequestCount, value);
    }


    public static final class VkDeviceSemaphoreSciSyncPoolReservationCreateInfoNVFactory implements IDataTypeFactory<VkDeviceSemaphoreSciSyncPoolReservationCreateInfoNV> {
        @Override
        public Class<VkDeviceSemaphoreSciSyncPoolReservationCreateInfoNV> clazz() {
            return VkDeviceSemaphoreSciSyncPoolReservationCreateInfoNV.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkDeviceSemaphoreSciSyncPoolReservationCreateInfoNV.LAYOUT;
        }

        @Override
        public VkDeviceSemaphoreSciSyncPoolReservationCreateInfoNV create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkDeviceSemaphoreSciSyncPoolReservationCreateInfoNV createUninit(MemorySegment segment) {
            return new VkDeviceSemaphoreSciSyncPoolReservationCreateInfoNV(segment);
        }
    }

    public static final VkDeviceSemaphoreSciSyncPoolReservationCreateInfoNVFactory FACTORY = new VkDeviceSemaphoreSciSyncPoolReservationCreateInfoNVFactory();
}
