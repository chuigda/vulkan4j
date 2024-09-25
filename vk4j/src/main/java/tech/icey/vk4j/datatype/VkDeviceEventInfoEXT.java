package tech.icey.vk4j.datatype;

import tech.icey.vk4j.IFactory;
import tech.icey.vk4j.NativeLayout;
import tech.icey.vk4j.annotation.enumtype;
import tech.icey.vk4j.annotation.pointer;
import tech.icey.vk4j.enumtype.VkDeviceEventTypeEXT;
import tech.icey.vk4j.enumtype.VkStructureType;

import java.lang.foreign.AddressLayout;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;

import static java.lang.foreign.ValueLayout.OfInt;
import static java.lang.foreign.ValueLayout.PathElement;
import static tech.icey.vk4j.enumtype.VkStructureType.VK_STRUCTURE_TYPE_DEVICE_EVENT_INFO_EXT;

public record VkDeviceEventInfoEXT(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("deviceEvent")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$deviceEvent = PathElement.groupElement("deviceEvent");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$deviceEvent = (OfInt) LAYOUT.select(PATH$deviceEvent);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$deviceEvent = LAYOUT.byteOffset(PATH$deviceEvent);

    public VkDeviceEventInfoEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_DEVICE_EVENT_INFO_EXT);
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

    public @enumtype(VkDeviceEventTypeEXT.class) int deviceEvent() {
        return segment.get(LAYOUT$deviceEvent, OFFSET$deviceEvent);
    }

    public void deviceEvent(@enumtype(VkDeviceEventTypeEXT.class) int value) {
        segment.set(LAYOUT$deviceEvent, OFFSET$deviceEvent, value);
    }


    public static final class Factory implements IFactory<VkDeviceEventInfoEXT> {
        @Override
        public Class<VkDeviceEventInfoEXT> clazz() {
            return VkDeviceEventInfoEXT.class;
        }

        @Override
        public MemoryLayout layout() {
            return VkDeviceEventInfoEXT.LAYOUT;
        }

        @Override
        public VkDeviceEventInfoEXT create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkDeviceEventInfoEXT createUninit(MemorySegment segment) {
            return new VkDeviceEventInfoEXT(segment);
        }
    }

    public static final Factory FACTORY = new Factory();
}
