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

public record VkSemaphoreTypeCreateInfo(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("semaphoreType"),
        ValueLayout.JAVA_LONG.withName("initialValue")
    );

    public static final PathElement PATH$sType = PathElement.groupElement(0);
    public static final PathElement PATH$pNext = PathElement.groupElement(1);
    public static final PathElement PATH$semaphoreType = PathElement.groupElement(2);
    public static final PathElement PATH$initialValue = PathElement.groupElement(3);

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$semaphoreType = (OfInt) LAYOUT.select(PATH$semaphoreType);
    public static final OfLong LAYOUT$initialValue = (OfLong) LAYOUT.select(PATH$initialValue);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$semaphoreType = LAYOUT.byteOffset(PATH$semaphoreType);
    public static final long OFFSET$initialValue = LAYOUT.byteOffset(PATH$initialValue);

    public VkSemaphoreTypeCreateInfo(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_SEMAPHORE_TYPE_CREATE_INFO);
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

    public @enumtype(VkSemaphoreType.class) int semaphoreType() {
        return segment.get(LAYOUT$semaphoreType, OFFSET$semaphoreType);
    }

    public void semaphoreType(@enumtype(VkSemaphoreType.class) int value) {
        segment.set(LAYOUT$semaphoreType, OFFSET$semaphoreType, value);
    }

    public @unsigned long initialValue() {
        return segment.get(LAYOUT$initialValue, OFFSET$initialValue);
    }

    public void initialValue(@unsigned long value) {
        segment.set(LAYOUT$initialValue, OFFSET$initialValue, value);
    }


    public static final class VkSemaphoreTypeCreateInfoFactory implements IDataTypeFactory<VkSemaphoreTypeCreateInfo> {
        @Override
        public Class<VkSemaphoreTypeCreateInfo> clazz() {
            return VkSemaphoreTypeCreateInfo.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkSemaphoreTypeCreateInfo.LAYOUT;
        }

        @Override
        public VkSemaphoreTypeCreateInfo create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkSemaphoreTypeCreateInfo createUninit(MemorySegment segment) {
            return new VkSemaphoreTypeCreateInfo(segment);
        }
    }

    public static final VkSemaphoreTypeCreateInfoFactory FACTORY = new VkSemaphoreTypeCreateInfoFactory();
}
