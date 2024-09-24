package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.annotation.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.NativeLayout;
import tech.icey.vk4j.IFactory;

import static tech.icey.vk4j.enumtype.VkStructureType.*;

public record VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("perViewPositionAllComponents")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$perViewPositionAllComponents = PathElement.groupElement("perViewPositionAllComponents");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$perViewPositionAllComponents = (OfInt) LAYOUT.select(PATH$perViewPositionAllComponents);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$perViewPositionAllComponents = LAYOUT.byteOffset(PATH$perViewPositionAllComponents);

    public VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MULTIVIEW_PER_VIEW_ATTRIBUTES_PROPERTIES_NVX);
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

    public @unsigned int perViewPositionAllComponents() {
        return segment.get(LAYOUT$perViewPositionAllComponents, OFFSET$perViewPositionAllComponents);
    }

    public void perViewPositionAllComponents(@unsigned int value) {
        segment.set(LAYOUT$perViewPositionAllComponents, OFFSET$perViewPositionAllComponents, value);
    }


    public static final class Factory implements IFactory<VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX> {
        @Override
        public Class<VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX> clazz() {
            return VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX.class;
        }

        @Override
        public MemoryLayout layout() {
            return VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX.LAYOUT;
        }

        @Override
        public VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX createUninit(MemorySegment segment) {
            return new VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX(segment);
        }
    }

    public static final Factory FACTORY = new Factory();
}
