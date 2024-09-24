package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.annotation.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.NativeLayout;
import tech.icey.vk4j.IFactory;

import static tech.icey.vk4j.enumtype.VkStructureType.*;

public record VkDevicePrivateDataCreateInfo(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("privateDataSlotRequestCount")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$privateDataSlotRequestCount = PathElement.groupElement("privateDataSlotRequestCount");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$privateDataSlotRequestCount = (OfInt) LAYOUT.select(PATH$privateDataSlotRequestCount);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$privateDataSlotRequestCount = LAYOUT.byteOffset(PATH$privateDataSlotRequestCount);

    public VkDevicePrivateDataCreateInfo(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_DEVICE_PRIVATE_DATA_CREATE_INFO);
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

    public @unsigned int privateDataSlotRequestCount() {
        return segment.get(LAYOUT$privateDataSlotRequestCount, OFFSET$privateDataSlotRequestCount);
    }

    public void privateDataSlotRequestCount(@unsigned int value) {
        segment.set(LAYOUT$privateDataSlotRequestCount, OFFSET$privateDataSlotRequestCount, value);
    }


    public static final class Factory implements IFactory<VkDevicePrivateDataCreateInfo> {
        @Override
        public Class<VkDevicePrivateDataCreateInfo> clazz() {
            return VkDevicePrivateDataCreateInfo.class;
        }

        @Override
        public MemoryLayout layout() {
            return VkDevicePrivateDataCreateInfo.LAYOUT;
        }

        @Override
        public VkDevicePrivateDataCreateInfo create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkDevicePrivateDataCreateInfo createUninit(MemorySegment segment) {
            return new VkDevicePrivateDataCreateInfo(segment);
        }
    }

    public static final Factory FACTORY = new Factory();
}
