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

public record VkSemaphoreSciSyncPoolCreateInfoNV(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("handle")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$handle = PathElement.groupElement("handle");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final AddressLayout LAYOUT$handle = (AddressLayout) LAYOUT.select(PATH$handle);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$handle = LAYOUT.byteOffset(PATH$handle);

    public VkSemaphoreSciSyncPoolCreateInfoNV(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_SEMAPHORE_SCI_SYNC_POOL_CREATE_INFO_NV);
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

    public @pointer(comment="void*") MemorySegment handle() {
        return segment.get(LAYOUT$handle, OFFSET$handle);
    }

    public void handle(@pointer(comment="void*") MemorySegment value) {
        segment.set(LAYOUT$handle, OFFSET$handle, value);
    }


    public static final class VkSemaphoreSciSyncPoolCreateInfoNVFactory implements IDataTypeFactory<VkSemaphoreSciSyncPoolCreateInfoNV> {
        @Override
        public Class<VkSemaphoreSciSyncPoolCreateInfoNV> clazz() {
            return VkSemaphoreSciSyncPoolCreateInfoNV.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkSemaphoreSciSyncPoolCreateInfoNV.LAYOUT;
        }

        @Override
        public VkSemaphoreSciSyncPoolCreateInfoNV create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkSemaphoreSciSyncPoolCreateInfoNV createUninit(MemorySegment segment) {
            return new VkSemaphoreSciSyncPoolCreateInfoNV(segment);
        }
    }

    public static final VkSemaphoreSciSyncPoolCreateInfoNVFactory FACTORY = new VkSemaphoreSciSyncPoolCreateInfoNVFactory();
}
