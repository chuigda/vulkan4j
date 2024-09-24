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

public record VkPhysicalDeviceMaintenance4Properties(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("maxBufferSize")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$maxBufferSize = PathElement.groupElement("maxBufferSize");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfLong LAYOUT$maxBufferSize = (OfLong) LAYOUT.select(PATH$maxBufferSize);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$maxBufferSize = LAYOUT.byteOffset(PATH$maxBufferSize);

    public VkPhysicalDeviceMaintenance4Properties(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_4_PROPERTIES);
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

    public @unsigned long maxBufferSize() {
        return segment.get(LAYOUT$maxBufferSize, OFFSET$maxBufferSize);
    }

    public void maxBufferSize(@unsigned long value) {
        segment.set(LAYOUT$maxBufferSize, OFFSET$maxBufferSize, value);
    }


    public static final class VkPhysicalDeviceMaintenance4PropertiesFactory implements IFactory<VkPhysicalDeviceMaintenance4Properties> {
        @Override
        public Class<VkPhysicalDeviceMaintenance4Properties> clazz() {
            return VkPhysicalDeviceMaintenance4Properties.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkPhysicalDeviceMaintenance4Properties.LAYOUT;
        }

        @Override
        public VkPhysicalDeviceMaintenance4Properties create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkPhysicalDeviceMaintenance4Properties createUninit(MemorySegment segment) {
            return new VkPhysicalDeviceMaintenance4Properties(segment);
        }
    }

    public static final VkPhysicalDeviceMaintenance4PropertiesFactory FACTORY = new VkPhysicalDeviceMaintenance4PropertiesFactory();
}
