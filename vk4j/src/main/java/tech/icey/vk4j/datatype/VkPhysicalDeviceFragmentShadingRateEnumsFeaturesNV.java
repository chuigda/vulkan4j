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

public record VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("fragmentShadingRateEnums"),
        ValueLayout.JAVA_INT.withName("supersampleFragmentShadingRates"),
        ValueLayout.JAVA_INT.withName("noInvocationFragmentShadingRates")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$fragmentShadingRateEnums = PathElement.groupElement("fragmentShadingRateEnums");
    public static final PathElement PATH$supersampleFragmentShadingRates = PathElement.groupElement("supersampleFragmentShadingRates");
    public static final PathElement PATH$noInvocationFragmentShadingRates = PathElement.groupElement("noInvocationFragmentShadingRates");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$fragmentShadingRateEnums = (OfInt) LAYOUT.select(PATH$fragmentShadingRateEnums);
    public static final OfInt LAYOUT$supersampleFragmentShadingRates = (OfInt) LAYOUT.select(PATH$supersampleFragmentShadingRates);
    public static final OfInt LAYOUT$noInvocationFragmentShadingRates = (OfInt) LAYOUT.select(PATH$noInvocationFragmentShadingRates);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$fragmentShadingRateEnums = LAYOUT.byteOffset(PATH$fragmentShadingRateEnums);
    public static final long OFFSET$supersampleFragmentShadingRates = LAYOUT.byteOffset(PATH$supersampleFragmentShadingRates);
    public static final long OFFSET$noInvocationFragmentShadingRates = LAYOUT.byteOffset(PATH$noInvocationFragmentShadingRates);

    public VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADING_RATE_ENUMS_FEATURES_NV);
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

    public @unsigned int fragmentShadingRateEnums() {
        return segment.get(LAYOUT$fragmentShadingRateEnums, OFFSET$fragmentShadingRateEnums);
    }

    public void fragmentShadingRateEnums(@unsigned int value) {
        segment.set(LAYOUT$fragmentShadingRateEnums, OFFSET$fragmentShadingRateEnums, value);
    }

    public @unsigned int supersampleFragmentShadingRates() {
        return segment.get(LAYOUT$supersampleFragmentShadingRates, OFFSET$supersampleFragmentShadingRates);
    }

    public void supersampleFragmentShadingRates(@unsigned int value) {
        segment.set(LAYOUT$supersampleFragmentShadingRates, OFFSET$supersampleFragmentShadingRates, value);
    }

    public @unsigned int noInvocationFragmentShadingRates() {
        return segment.get(LAYOUT$noInvocationFragmentShadingRates, OFFSET$noInvocationFragmentShadingRates);
    }

    public void noInvocationFragmentShadingRates(@unsigned int value) {
        segment.set(LAYOUT$noInvocationFragmentShadingRates, OFFSET$noInvocationFragmentShadingRates, value);
    }


    public static final class VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNVFactory implements IFactory<VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV> {
        @Override
        public Class<VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV> clazz() {
            return VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV.LAYOUT;
        }

        @Override
        public VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV createUninit(MemorySegment segment) {
            return new VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV(segment);
        }
    }

    public static final VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNVFactory FACTORY = new VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNVFactory();
}
