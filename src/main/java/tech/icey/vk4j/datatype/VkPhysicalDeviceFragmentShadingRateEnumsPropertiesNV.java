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

public record VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("maxFragmentShadingRateInvocationCount")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$maxFragmentShadingRateInvocationCount = PathElement.groupElement("maxFragmentShadingRateInvocationCount");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$maxFragmentShadingRateInvocationCount = (OfInt) LAYOUT.select(PATH$maxFragmentShadingRateInvocationCount);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$maxFragmentShadingRateInvocationCount = LAYOUT.byteOffset(PATH$maxFragmentShadingRateInvocationCount);

    public VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADING_RATE_ENUMS_PROPERTIES_NV);
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

    public @enumtype(VkSampleCountFlags.class) int maxFragmentShadingRateInvocationCount() {
        return segment.get(LAYOUT$maxFragmentShadingRateInvocationCount, OFFSET$maxFragmentShadingRateInvocationCount);
    }

    public void maxFragmentShadingRateInvocationCount(@enumtype(VkSampleCountFlags.class) int value) {
        segment.set(LAYOUT$maxFragmentShadingRateInvocationCount, OFFSET$maxFragmentShadingRateInvocationCount, value);
    }


    public static final class VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNVFactory implements IFactory<VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV> {
        @Override
        public Class<VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV> clazz() {
            return VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV.LAYOUT;
        }

        @Override
        public VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV createUninit(MemorySegment segment) {
            return new VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV(segment);
        }
    }

    public static final VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNVFactory FACTORY = new VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNVFactory();
}
