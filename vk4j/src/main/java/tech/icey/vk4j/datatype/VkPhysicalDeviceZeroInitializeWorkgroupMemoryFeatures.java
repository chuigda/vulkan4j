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

public record VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("shaderZeroInitializeWorkgroupMemory")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$shaderZeroInitializeWorkgroupMemory = PathElement.groupElement("shaderZeroInitializeWorkgroupMemory");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$shaderZeroInitializeWorkgroupMemory = (OfInt) LAYOUT.select(PATH$shaderZeroInitializeWorkgroupMemory);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$shaderZeroInitializeWorkgroupMemory = LAYOUT.byteOffset(PATH$shaderZeroInitializeWorkgroupMemory);

    public VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ZERO_INITIALIZE_WORKGROUP_MEMORY_FEATURES);
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

    public @unsigned int shaderZeroInitializeWorkgroupMemory() {
        return segment.get(LAYOUT$shaderZeroInitializeWorkgroupMemory, OFFSET$shaderZeroInitializeWorkgroupMemory);
    }

    public void shaderZeroInitializeWorkgroupMemory(@unsigned int value) {
        segment.set(LAYOUT$shaderZeroInitializeWorkgroupMemory, OFFSET$shaderZeroInitializeWorkgroupMemory, value);
    }


    public static final class VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesFactory implements IFactory<VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures> {
        @Override
        public Class<VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures> clazz() {
            return VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures.LAYOUT;
        }

        @Override
        public VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures createUninit(MemorySegment segment) {
            return new VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures(segment);
        }
    }

    public static final VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesFactory FACTORY = new VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesFactory();
}