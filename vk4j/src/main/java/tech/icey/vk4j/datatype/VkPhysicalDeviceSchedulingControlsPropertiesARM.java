package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.annotation.*;
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

public record VkPhysicalDeviceSchedulingControlsPropertiesARM(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("schedulingControlsFlags")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$schedulingControlsFlags = PathElement.groupElement("schedulingControlsFlags");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$schedulingControlsFlags = (OfInt) LAYOUT.select(PATH$schedulingControlsFlags);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$schedulingControlsFlags = LAYOUT.byteOffset(PATH$schedulingControlsFlags);

    public VkPhysicalDeviceSchedulingControlsPropertiesARM(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SCHEDULING_CONTROLS_PROPERTIES_ARM);
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

    public @enumtype(VkPhysicalDeviceSchedulingControlsFlagsARM.class) int schedulingControlsFlags() {
        return segment.get(LAYOUT$schedulingControlsFlags, OFFSET$schedulingControlsFlags);
    }

    public void schedulingControlsFlags(@enumtype(VkPhysicalDeviceSchedulingControlsFlagsARM.class) int value) {
        segment.set(LAYOUT$schedulingControlsFlags, OFFSET$schedulingControlsFlags, value);
    }


    public static final class Factory implements IFactory<VkPhysicalDeviceSchedulingControlsPropertiesARM> {
        @Override
        public Class<VkPhysicalDeviceSchedulingControlsPropertiesARM> clazz() {
            return VkPhysicalDeviceSchedulingControlsPropertiesARM.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkPhysicalDeviceSchedulingControlsPropertiesARM.LAYOUT;
        }

        @Override
        public VkPhysicalDeviceSchedulingControlsPropertiesARM create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkPhysicalDeviceSchedulingControlsPropertiesARM createUninit(MemorySegment segment) {
            return new VkPhysicalDeviceSchedulingControlsPropertiesARM(segment);
        }
    }

    public static final Factory FACTORY = new Factory();
}
