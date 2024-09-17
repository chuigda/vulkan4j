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

public record VkPhysicalDeviceMaintenance5PropertiesKHR(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("earlyFragmentMultisampleCoverageAfterSampleCounting"),
        ValueLayout.JAVA_INT.withName("earlyFragmentSampleMaskTestBeforeSampleCounting"),
        ValueLayout.JAVA_INT.withName("depthStencilSwizzleOneSupport"),
        ValueLayout.JAVA_INT.withName("polygonModePointSize"),
        ValueLayout.JAVA_INT.withName("nonStrictSinglePixelWideLinesUseParallelogram"),
        ValueLayout.JAVA_INT.withName("nonStrictWideLinesUseParallelogram")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$earlyFragmentMultisampleCoverageAfterSampleCounting = PathElement.groupElement("earlyFragmentMultisampleCoverageAfterSampleCounting");
    public static final PathElement PATH$earlyFragmentSampleMaskTestBeforeSampleCounting = PathElement.groupElement("earlyFragmentSampleMaskTestBeforeSampleCounting");
    public static final PathElement PATH$depthStencilSwizzleOneSupport = PathElement.groupElement("depthStencilSwizzleOneSupport");
    public static final PathElement PATH$polygonModePointSize = PathElement.groupElement("polygonModePointSize");
    public static final PathElement PATH$nonStrictSinglePixelWideLinesUseParallelogram = PathElement.groupElement("nonStrictSinglePixelWideLinesUseParallelogram");
    public static final PathElement PATH$nonStrictWideLinesUseParallelogram = PathElement.groupElement("nonStrictWideLinesUseParallelogram");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$earlyFragmentMultisampleCoverageAfterSampleCounting = (OfInt) LAYOUT.select(PATH$earlyFragmentMultisampleCoverageAfterSampleCounting);
    public static final OfInt LAYOUT$earlyFragmentSampleMaskTestBeforeSampleCounting = (OfInt) LAYOUT.select(PATH$earlyFragmentSampleMaskTestBeforeSampleCounting);
    public static final OfInt LAYOUT$depthStencilSwizzleOneSupport = (OfInt) LAYOUT.select(PATH$depthStencilSwizzleOneSupport);
    public static final OfInt LAYOUT$polygonModePointSize = (OfInt) LAYOUT.select(PATH$polygonModePointSize);
    public static final OfInt LAYOUT$nonStrictSinglePixelWideLinesUseParallelogram = (OfInt) LAYOUT.select(PATH$nonStrictSinglePixelWideLinesUseParallelogram);
    public static final OfInt LAYOUT$nonStrictWideLinesUseParallelogram = (OfInt) LAYOUT.select(PATH$nonStrictWideLinesUseParallelogram);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$earlyFragmentMultisampleCoverageAfterSampleCounting = LAYOUT.byteOffset(PATH$earlyFragmentMultisampleCoverageAfterSampleCounting);
    public static final long OFFSET$earlyFragmentSampleMaskTestBeforeSampleCounting = LAYOUT.byteOffset(PATH$earlyFragmentSampleMaskTestBeforeSampleCounting);
    public static final long OFFSET$depthStencilSwizzleOneSupport = LAYOUT.byteOffset(PATH$depthStencilSwizzleOneSupport);
    public static final long OFFSET$polygonModePointSize = LAYOUT.byteOffset(PATH$polygonModePointSize);
    public static final long OFFSET$nonStrictSinglePixelWideLinesUseParallelogram = LAYOUT.byteOffset(PATH$nonStrictSinglePixelWideLinesUseParallelogram);
    public static final long OFFSET$nonStrictWideLinesUseParallelogram = LAYOUT.byteOffset(PATH$nonStrictWideLinesUseParallelogram);

    public VkPhysicalDeviceMaintenance5PropertiesKHR(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_5_PROPERTIES_KHR);
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

    public @unsigned int earlyFragmentMultisampleCoverageAfterSampleCounting() {
        return segment.get(LAYOUT$earlyFragmentMultisampleCoverageAfterSampleCounting, OFFSET$earlyFragmentMultisampleCoverageAfterSampleCounting);
    }

    public void earlyFragmentMultisampleCoverageAfterSampleCounting(@unsigned int value) {
        segment.set(LAYOUT$earlyFragmentMultisampleCoverageAfterSampleCounting, OFFSET$earlyFragmentMultisampleCoverageAfterSampleCounting, value);
    }

    public @unsigned int earlyFragmentSampleMaskTestBeforeSampleCounting() {
        return segment.get(LAYOUT$earlyFragmentSampleMaskTestBeforeSampleCounting, OFFSET$earlyFragmentSampleMaskTestBeforeSampleCounting);
    }

    public void earlyFragmentSampleMaskTestBeforeSampleCounting(@unsigned int value) {
        segment.set(LAYOUT$earlyFragmentSampleMaskTestBeforeSampleCounting, OFFSET$earlyFragmentSampleMaskTestBeforeSampleCounting, value);
    }

    public @unsigned int depthStencilSwizzleOneSupport() {
        return segment.get(LAYOUT$depthStencilSwizzleOneSupport, OFFSET$depthStencilSwizzleOneSupport);
    }

    public void depthStencilSwizzleOneSupport(@unsigned int value) {
        segment.set(LAYOUT$depthStencilSwizzleOneSupport, OFFSET$depthStencilSwizzleOneSupport, value);
    }

    public @unsigned int polygonModePointSize() {
        return segment.get(LAYOUT$polygonModePointSize, OFFSET$polygonModePointSize);
    }

    public void polygonModePointSize(@unsigned int value) {
        segment.set(LAYOUT$polygonModePointSize, OFFSET$polygonModePointSize, value);
    }

    public @unsigned int nonStrictSinglePixelWideLinesUseParallelogram() {
        return segment.get(LAYOUT$nonStrictSinglePixelWideLinesUseParallelogram, OFFSET$nonStrictSinglePixelWideLinesUseParallelogram);
    }

    public void nonStrictSinglePixelWideLinesUseParallelogram(@unsigned int value) {
        segment.set(LAYOUT$nonStrictSinglePixelWideLinesUseParallelogram, OFFSET$nonStrictSinglePixelWideLinesUseParallelogram, value);
    }

    public @unsigned int nonStrictWideLinesUseParallelogram() {
        return segment.get(LAYOUT$nonStrictWideLinesUseParallelogram, OFFSET$nonStrictWideLinesUseParallelogram);
    }

    public void nonStrictWideLinesUseParallelogram(@unsigned int value) {
        segment.set(LAYOUT$nonStrictWideLinesUseParallelogram, OFFSET$nonStrictWideLinesUseParallelogram, value);
    }


    public static final class VkPhysicalDeviceMaintenance5PropertiesKHRFactory implements IFactory<VkPhysicalDeviceMaintenance5PropertiesKHR> {
        @Override
        public Class<VkPhysicalDeviceMaintenance5PropertiesKHR> clazz() {
            return VkPhysicalDeviceMaintenance5PropertiesKHR.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkPhysicalDeviceMaintenance5PropertiesKHR.LAYOUT;
        }

        @Override
        public VkPhysicalDeviceMaintenance5PropertiesKHR create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkPhysicalDeviceMaintenance5PropertiesKHR createUninit(MemorySegment segment) {
            return new VkPhysicalDeviceMaintenance5PropertiesKHR(segment);
        }
    }

    public static final VkPhysicalDeviceMaintenance5PropertiesKHRFactory FACTORY = new VkPhysicalDeviceMaintenance5PropertiesKHRFactory();
}
