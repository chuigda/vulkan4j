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

public record VkPhysicalDeviceRobustness2PropertiesEXT(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("robustStorageBufferAccessSizeAlignment"),
        ValueLayout.JAVA_LONG.withName("robustUniformBufferAccessSizeAlignment")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$robustStorageBufferAccessSizeAlignment = PathElement.groupElement("robustStorageBufferAccessSizeAlignment");
    public static final PathElement PATH$robustUniformBufferAccessSizeAlignment = PathElement.groupElement("robustUniformBufferAccessSizeAlignment");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfLong LAYOUT$robustStorageBufferAccessSizeAlignment = (OfLong) LAYOUT.select(PATH$robustStorageBufferAccessSizeAlignment);
    public static final OfLong LAYOUT$robustUniformBufferAccessSizeAlignment = (OfLong) LAYOUT.select(PATH$robustUniformBufferAccessSizeAlignment);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$robustStorageBufferAccessSizeAlignment = LAYOUT.byteOffset(PATH$robustStorageBufferAccessSizeAlignment);
    public static final long OFFSET$robustUniformBufferAccessSizeAlignment = LAYOUT.byteOffset(PATH$robustUniformBufferAccessSizeAlignment);

    public VkPhysicalDeviceRobustness2PropertiesEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ROBUSTNESS_2_PROPERTIES_EXT);
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

    public @unsigned long robustStorageBufferAccessSizeAlignment() {
        return segment.get(LAYOUT$robustStorageBufferAccessSizeAlignment, OFFSET$robustStorageBufferAccessSizeAlignment);
    }

    public void robustStorageBufferAccessSizeAlignment(@unsigned long value) {
        segment.set(LAYOUT$robustStorageBufferAccessSizeAlignment, OFFSET$robustStorageBufferAccessSizeAlignment, value);
    }

    public @unsigned long robustUniformBufferAccessSizeAlignment() {
        return segment.get(LAYOUT$robustUniformBufferAccessSizeAlignment, OFFSET$robustUniformBufferAccessSizeAlignment);
    }

    public void robustUniformBufferAccessSizeAlignment(@unsigned long value) {
        segment.set(LAYOUT$robustUniformBufferAccessSizeAlignment, OFFSET$robustUniformBufferAccessSizeAlignment, value);
    }


    public static final class VkPhysicalDeviceRobustness2PropertiesEXTFactory implements IDataTypeFactory<VkPhysicalDeviceRobustness2PropertiesEXT> {
        @Override
        public Class<VkPhysicalDeviceRobustness2PropertiesEXT> clazz() {
            return VkPhysicalDeviceRobustness2PropertiesEXT.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkPhysicalDeviceRobustness2PropertiesEXT.LAYOUT;
        }

        @Override
        public VkPhysicalDeviceRobustness2PropertiesEXT create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkPhysicalDeviceRobustness2PropertiesEXT createUninit(MemorySegment segment) {
            return new VkPhysicalDeviceRobustness2PropertiesEXT(segment);
        }
    }

    public static final VkPhysicalDeviceRobustness2PropertiesEXTFactory FACTORY = new VkPhysicalDeviceRobustness2PropertiesEXTFactory();
}
