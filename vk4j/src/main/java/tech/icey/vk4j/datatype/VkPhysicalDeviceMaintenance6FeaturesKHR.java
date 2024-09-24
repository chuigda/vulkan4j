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

public record VkPhysicalDeviceMaintenance6FeaturesKHR(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("maintenance6")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$maintenance6 = PathElement.groupElement("maintenance6");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$maintenance6 = (OfInt) LAYOUT.select(PATH$maintenance6);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$maintenance6 = LAYOUT.byteOffset(PATH$maintenance6);

    public VkPhysicalDeviceMaintenance6FeaturesKHR(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_6_FEATURES_KHR);
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

    public @unsigned int maintenance6() {
        return segment.get(LAYOUT$maintenance6, OFFSET$maintenance6);
    }

    public void maintenance6(@unsigned int value) {
        segment.set(LAYOUT$maintenance6, OFFSET$maintenance6, value);
    }


    public static final class VkPhysicalDeviceMaintenance6FeaturesKHRFactory implements IFactory<VkPhysicalDeviceMaintenance6FeaturesKHR> {
        @Override
        public Class<VkPhysicalDeviceMaintenance6FeaturesKHR> clazz() {
            return VkPhysicalDeviceMaintenance6FeaturesKHR.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkPhysicalDeviceMaintenance6FeaturesKHR.LAYOUT;
        }

        @Override
        public VkPhysicalDeviceMaintenance6FeaturesKHR create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkPhysicalDeviceMaintenance6FeaturesKHR createUninit(MemorySegment segment) {
            return new VkPhysicalDeviceMaintenance6FeaturesKHR(segment);
        }
    }

    public static final VkPhysicalDeviceMaintenance6FeaturesKHRFactory FACTORY = new VkPhysicalDeviceMaintenance6FeaturesKHRFactory();
}
