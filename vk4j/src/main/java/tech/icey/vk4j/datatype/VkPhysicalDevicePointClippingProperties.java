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

public record VkPhysicalDevicePointClippingProperties(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("pointClippingBehavior")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$pointClippingBehavior = PathElement.groupElement("pointClippingBehavior");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$pointClippingBehavior = (OfInt) LAYOUT.select(PATH$pointClippingBehavior);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$pointClippingBehavior = LAYOUT.byteOffset(PATH$pointClippingBehavior);

    public VkPhysicalDevicePointClippingProperties(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_POINT_CLIPPING_PROPERTIES);
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

    public @enumtype(VkPointClippingBehavior.class) int pointClippingBehavior() {
        return segment.get(LAYOUT$pointClippingBehavior, OFFSET$pointClippingBehavior);
    }

    public void pointClippingBehavior(@enumtype(VkPointClippingBehavior.class) int value) {
        segment.set(LAYOUT$pointClippingBehavior, OFFSET$pointClippingBehavior, value);
    }


    public static final class VkPhysicalDevicePointClippingPropertiesFactory implements IFactory<VkPhysicalDevicePointClippingProperties> {
        @Override
        public Class<VkPhysicalDevicePointClippingProperties> clazz() {
            return VkPhysicalDevicePointClippingProperties.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkPhysicalDevicePointClippingProperties.LAYOUT;
        }

        @Override
        public VkPhysicalDevicePointClippingProperties create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkPhysicalDevicePointClippingProperties createUninit(MemorySegment segment) {
            return new VkPhysicalDevicePointClippingProperties(segment);
        }
    }

    public static final VkPhysicalDevicePointClippingPropertiesFactory FACTORY = new VkPhysicalDevicePointClippingPropertiesFactory();
}
