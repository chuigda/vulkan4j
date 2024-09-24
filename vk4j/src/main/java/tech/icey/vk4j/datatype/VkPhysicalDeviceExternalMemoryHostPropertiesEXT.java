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

public record VkPhysicalDeviceExternalMemoryHostPropertiesEXT(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("minImportedHostPointerAlignment")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$minImportedHostPointerAlignment = PathElement.groupElement("minImportedHostPointerAlignment");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfLong LAYOUT$minImportedHostPointerAlignment = (OfLong) LAYOUT.select(PATH$minImportedHostPointerAlignment);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$minImportedHostPointerAlignment = LAYOUT.byteOffset(PATH$minImportedHostPointerAlignment);

    public VkPhysicalDeviceExternalMemoryHostPropertiesEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_MEMORY_HOST_PROPERTIES_EXT);
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

    public @unsigned long minImportedHostPointerAlignment() {
        return segment.get(LAYOUT$minImportedHostPointerAlignment, OFFSET$minImportedHostPointerAlignment);
    }

    public void minImportedHostPointerAlignment(@unsigned long value) {
        segment.set(LAYOUT$minImportedHostPointerAlignment, OFFSET$minImportedHostPointerAlignment, value);
    }


    public static final class VkPhysicalDeviceExternalMemoryHostPropertiesEXTFactory implements IFactory<VkPhysicalDeviceExternalMemoryHostPropertiesEXT> {
        @Override
        public Class<VkPhysicalDeviceExternalMemoryHostPropertiesEXT> clazz() {
            return VkPhysicalDeviceExternalMemoryHostPropertiesEXT.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkPhysicalDeviceExternalMemoryHostPropertiesEXT.LAYOUT;
        }

        @Override
        public VkPhysicalDeviceExternalMemoryHostPropertiesEXT create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkPhysicalDeviceExternalMemoryHostPropertiesEXT createUninit(MemorySegment segment) {
            return new VkPhysicalDeviceExternalMemoryHostPropertiesEXT(segment);
        }
    }

    public static final VkPhysicalDeviceExternalMemoryHostPropertiesEXTFactory FACTORY = new VkPhysicalDeviceExternalMemoryHostPropertiesEXTFactory();
}
