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

public record VkPhysicalDeviceMaintenance7FeaturesKHR(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("maintenance7")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$maintenance7 = PathElement.groupElement("maintenance7");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$maintenance7 = (OfInt) LAYOUT.select(PATH$maintenance7);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$maintenance7 = LAYOUT.byteOffset(PATH$maintenance7);

    public VkPhysicalDeviceMaintenance7FeaturesKHR(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_7_FEATURES_KHR);
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

    public @unsigned int maintenance7() {
        return segment.get(LAYOUT$maintenance7, OFFSET$maintenance7);
    }

    public void maintenance7(@unsigned int value) {
        segment.set(LAYOUT$maintenance7, OFFSET$maintenance7, value);
    }


    public static final class VkPhysicalDeviceMaintenance7FeaturesKHRFactory implements IFactory<VkPhysicalDeviceMaintenance7FeaturesKHR> {
        @Override
        public Class<VkPhysicalDeviceMaintenance7FeaturesKHR> clazz() {
            return VkPhysicalDeviceMaintenance7FeaturesKHR.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkPhysicalDeviceMaintenance7FeaturesKHR.LAYOUT;
        }

        @Override
        public VkPhysicalDeviceMaintenance7FeaturesKHR create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkPhysicalDeviceMaintenance7FeaturesKHR createUninit(MemorySegment segment) {
            return new VkPhysicalDeviceMaintenance7FeaturesKHR(segment);
        }
    }

    public static final VkPhysicalDeviceMaintenance7FeaturesKHRFactory FACTORY = new VkPhysicalDeviceMaintenance7FeaturesKHRFactory();
}
