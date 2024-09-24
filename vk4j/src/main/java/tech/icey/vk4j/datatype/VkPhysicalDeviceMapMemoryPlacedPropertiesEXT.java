package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.annotation.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.NativeLayout;
import tech.icey.vk4j.IFactory;

import static tech.icey.vk4j.enumtype.VkStructureType.*;

public record VkPhysicalDeviceMapMemoryPlacedPropertiesEXT(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("minPlacedMemoryMapAlignment")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$minPlacedMemoryMapAlignment = PathElement.groupElement("minPlacedMemoryMapAlignment");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfLong LAYOUT$minPlacedMemoryMapAlignment = (OfLong) LAYOUT.select(PATH$minPlacedMemoryMapAlignment);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$minPlacedMemoryMapAlignment = LAYOUT.byteOffset(PATH$minPlacedMemoryMapAlignment);

    public VkPhysicalDeviceMapMemoryPlacedPropertiesEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAP_MEMORY_PLACED_PROPERTIES_EXT);
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

    public @unsigned long minPlacedMemoryMapAlignment() {
        return segment.get(LAYOUT$minPlacedMemoryMapAlignment, OFFSET$minPlacedMemoryMapAlignment);
    }

    public void minPlacedMemoryMapAlignment(@unsigned long value) {
        segment.set(LAYOUT$minPlacedMemoryMapAlignment, OFFSET$minPlacedMemoryMapAlignment, value);
    }


    public static final class Factory implements IFactory<VkPhysicalDeviceMapMemoryPlacedPropertiesEXT> {
        @Override
        public Class<VkPhysicalDeviceMapMemoryPlacedPropertiesEXT> clazz() {
            return VkPhysicalDeviceMapMemoryPlacedPropertiesEXT.class;
        }

        @Override
        public MemoryLayout layout() {
            return VkPhysicalDeviceMapMemoryPlacedPropertiesEXT.LAYOUT;
        }

        @Override
        public VkPhysicalDeviceMapMemoryPlacedPropertiesEXT create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkPhysicalDeviceMapMemoryPlacedPropertiesEXT createUninit(MemorySegment segment) {
            return new VkPhysicalDeviceMapMemoryPlacedPropertiesEXT(segment);
        }
    }

    public static final Factory FACTORY = new Factory();
}
