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

public record VkPhysicalDeviceAddressBindingReportFeaturesEXT(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("reportAddressBinding")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$reportAddressBinding = PathElement.groupElement("reportAddressBinding");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$reportAddressBinding = (OfInt) LAYOUT.select(PATH$reportAddressBinding);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$reportAddressBinding = LAYOUT.byteOffset(PATH$reportAddressBinding);

    public VkPhysicalDeviceAddressBindingReportFeaturesEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ADDRESS_BINDING_REPORT_FEATURES_EXT);
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

    public @unsigned int reportAddressBinding() {
        return segment.get(LAYOUT$reportAddressBinding, OFFSET$reportAddressBinding);
    }

    public void reportAddressBinding(@unsigned int value) {
        segment.set(LAYOUT$reportAddressBinding, OFFSET$reportAddressBinding, value);
    }


    public static final class VkPhysicalDeviceAddressBindingReportFeaturesEXTFactory implements IFactory<VkPhysicalDeviceAddressBindingReportFeaturesEXT> {
        @Override
        public Class<VkPhysicalDeviceAddressBindingReportFeaturesEXT> clazz() {
            return VkPhysicalDeviceAddressBindingReportFeaturesEXT.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkPhysicalDeviceAddressBindingReportFeaturesEXT.LAYOUT;
        }

        @Override
        public VkPhysicalDeviceAddressBindingReportFeaturesEXT create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkPhysicalDeviceAddressBindingReportFeaturesEXT createUninit(MemorySegment segment) {
            return new VkPhysicalDeviceAddressBindingReportFeaturesEXT(segment);
        }
    }

    public static final VkPhysicalDeviceAddressBindingReportFeaturesEXTFactory FACTORY = new VkPhysicalDeviceAddressBindingReportFeaturesEXTFactory();
}