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

public record VkSemaphoreSignalInfo(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("semaphore"),
        ValueLayout.JAVA_LONG.withName("value")
    );

    public static final PathElement PATH$sType = PathElement.groupElement(0);
    public static final PathElement PATH$pNext = PathElement.groupElement(1);
    public static final PathElement PATH$semaphore = PathElement.groupElement(2);
    public static final PathElement PATH$value = PathElement.groupElement(3);

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final AddressLayout LAYOUT$semaphore = (AddressLayout) LAYOUT.select(PATH$semaphore);
    public static final OfLong LAYOUT$value = (OfLong) LAYOUT.select(PATH$value);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$semaphore = LAYOUT.byteOffset(PATH$semaphore);
    public static final long OFFSET$value = LAYOUT.byteOffset(PATH$value);

    public VkSemaphoreSignalInfo(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_SEMAPHORE_SIGNAL_INFO);
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

    public VkSemaphore semaphore() {
        return new VkSemaphore(segment.asSlice(OFFSET$semaphore, LAYOUT$semaphore));
    }

    public void semaphore(VkSemaphore value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$semaphore, LAYOUT$semaphore.byteSize());
    }

    public @unsigned long value() {
        return segment.get(LAYOUT$value, OFFSET$value);
    }

    public void value(@unsigned long value) {
        segment.set(LAYOUT$value, OFFSET$value, value);
    }


    public static final class VkSemaphoreSignalInfoFactory implements IDataTypeFactory<VkSemaphoreSignalInfo> {
        @Override
        public Class<VkSemaphoreSignalInfo> clazz() {
            return VkSemaphoreSignalInfo.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkSemaphoreSignalInfo.LAYOUT;
        }

        @Override
        public VkSemaphoreSignalInfo create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkSemaphoreSignalInfo createUninit(MemorySegment segment) {
            return new VkSemaphoreSignalInfo(segment);
        }
    }

    public static final VkSemaphoreSignalInfoFactory FACTORY = new VkSemaphoreSignalInfoFactory();
}