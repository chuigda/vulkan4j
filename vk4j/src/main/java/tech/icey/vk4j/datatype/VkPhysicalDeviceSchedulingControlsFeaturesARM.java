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

public record VkPhysicalDeviceSchedulingControlsFeaturesARM(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("schedulingControls")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$schedulingControls = PathElement.groupElement("schedulingControls");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$schedulingControls = (OfInt) LAYOUT.select(PATH$schedulingControls);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$schedulingControls = LAYOUT.byteOffset(PATH$schedulingControls);

    public VkPhysicalDeviceSchedulingControlsFeaturesARM(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SCHEDULING_CONTROLS_FEATURES_ARM);
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

    public @unsigned int schedulingControls() {
        return segment.get(LAYOUT$schedulingControls, OFFSET$schedulingControls);
    }

    public void schedulingControls(@unsigned int value) {
        segment.set(LAYOUT$schedulingControls, OFFSET$schedulingControls, value);
    }


    public static final class VkPhysicalDeviceSchedulingControlsFeaturesARMFactory implements IFactory<VkPhysicalDeviceSchedulingControlsFeaturesARM> {
        @Override
        public Class<VkPhysicalDeviceSchedulingControlsFeaturesARM> clazz() {
            return VkPhysicalDeviceSchedulingControlsFeaturesARM.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkPhysicalDeviceSchedulingControlsFeaturesARM.LAYOUT;
        }

        @Override
        public VkPhysicalDeviceSchedulingControlsFeaturesARM create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkPhysicalDeviceSchedulingControlsFeaturesARM createUninit(MemorySegment segment) {
            return new VkPhysicalDeviceSchedulingControlsFeaturesARM(segment);
        }
    }

    public static final VkPhysicalDeviceSchedulingControlsFeaturesARMFactory FACTORY = new VkPhysicalDeviceSchedulingControlsFeaturesARMFactory();
}
