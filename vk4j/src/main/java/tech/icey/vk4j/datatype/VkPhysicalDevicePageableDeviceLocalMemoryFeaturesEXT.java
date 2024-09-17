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

public record VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("pageableDeviceLocalMemory")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$pageableDeviceLocalMemory = PathElement.groupElement("pageableDeviceLocalMemory");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$pageableDeviceLocalMemory = (OfInt) LAYOUT.select(PATH$pageableDeviceLocalMemory);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$pageableDeviceLocalMemory = LAYOUT.byteOffset(PATH$pageableDeviceLocalMemory);

    public VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PAGEABLE_DEVICE_LOCAL_MEMORY_FEATURES_EXT);
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

    public @unsigned int pageableDeviceLocalMemory() {
        return segment.get(LAYOUT$pageableDeviceLocalMemory, OFFSET$pageableDeviceLocalMemory);
    }

    public void pageableDeviceLocalMemory(@unsigned int value) {
        segment.set(LAYOUT$pageableDeviceLocalMemory, OFFSET$pageableDeviceLocalMemory, value);
    }


    public static final class VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXTFactory implements IFactory<VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT> {
        @Override
        public Class<VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT> clazz() {
            return VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT.LAYOUT;
        }

        @Override
        public VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT createUninit(MemorySegment segment) {
            return new VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT(segment);
        }
    }

    public static final VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXTFactory FACTORY = new VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXTFactory();
}
