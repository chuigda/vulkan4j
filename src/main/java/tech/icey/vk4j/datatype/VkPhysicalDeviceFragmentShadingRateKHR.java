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

public record VkPhysicalDeviceFragmentShadingRateKHR(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("sampleCounts"),
        VkExtent2D.LAYOUT.withName("fragmentSize")
    );

    public static final PathElement PATH$sType = PathElement.groupElement(0);
    public static final PathElement PATH$pNext = PathElement.groupElement(1);
    public static final PathElement PATH$sampleCounts = PathElement.groupElement(2);
    public static final PathElement PATH$fragmentSize = PathElement.groupElement(3);

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$sampleCounts = (OfInt) LAYOUT.select(PATH$sampleCounts);
    public static final StructLayout LAYOUT$fragmentSize = (StructLayout) LAYOUT.select(PATH$fragmentSize);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$sampleCounts = LAYOUT.byteOffset(PATH$sampleCounts);
    public static final long OFFSET$fragmentSize = LAYOUT.byteOffset(PATH$fragmentSize);

    public VkPhysicalDeviceFragmentShadingRateKHR(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADING_RATE_KHR);
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

    public @enumtype(VkSampleCountFlags.class) int sampleCounts() {
        return segment.get(LAYOUT$sampleCounts, OFFSET$sampleCounts);
    }

    public void sampleCounts(@enumtype(VkSampleCountFlags.class) int value) {
        segment.set(LAYOUT$sampleCounts, OFFSET$sampleCounts, value);
    }

    public VkExtent2D fragmentSize() {
        return new VkExtent2D(segment.asSlice(OFFSET$fragmentSize, LAYOUT$fragmentSize));
    }

    public void fragmentSize(VkExtent2D value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$fragmentSize, LAYOUT$fragmentSize.byteSize());
    }


    public static final class VkPhysicalDeviceFragmentShadingRateKHRFactory implements IDataTypeFactory<VkPhysicalDeviceFragmentShadingRateKHR> {
        @Override
        public Class<VkPhysicalDeviceFragmentShadingRateKHR> clazz() {
            return VkPhysicalDeviceFragmentShadingRateKHR.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkPhysicalDeviceFragmentShadingRateKHR.LAYOUT;
        }

        @Override
        public VkPhysicalDeviceFragmentShadingRateKHR create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkPhysicalDeviceFragmentShadingRateKHR createUninit(MemorySegment segment) {
            return new VkPhysicalDeviceFragmentShadingRateKHR(segment);
        }
    }

    public static final VkPhysicalDeviceFragmentShadingRateKHRFactory FACTORY = new VkPhysicalDeviceFragmentShadingRateKHRFactory();
}