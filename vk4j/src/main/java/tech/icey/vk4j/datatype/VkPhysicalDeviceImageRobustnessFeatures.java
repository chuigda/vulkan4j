package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.annotation.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.NativeLayout;
import tech.icey.vk4j.IFactory;

import static tech.icey.vk4j.enumtype.VkStructureType.*;

public record VkPhysicalDeviceImageRobustnessFeatures(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("robustImageAccess")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$robustImageAccess = PathElement.groupElement("robustImageAccess");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$robustImageAccess = (OfInt) LAYOUT.select(PATH$robustImageAccess);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$robustImageAccess = LAYOUT.byteOffset(PATH$robustImageAccess);

    public VkPhysicalDeviceImageRobustnessFeatures(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_ROBUSTNESS_FEATURES);
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

    public @unsigned int robustImageAccess() {
        return segment.get(LAYOUT$robustImageAccess, OFFSET$robustImageAccess);
    }

    public void robustImageAccess(@unsigned int value) {
        segment.set(LAYOUT$robustImageAccess, OFFSET$robustImageAccess, value);
    }


    public static final class Factory implements IFactory<VkPhysicalDeviceImageRobustnessFeatures> {
        @Override
        public Class<VkPhysicalDeviceImageRobustnessFeatures> clazz() {
            return VkPhysicalDeviceImageRobustnessFeatures.class;
        }

        @Override
        public MemoryLayout layout() {
            return VkPhysicalDeviceImageRobustnessFeatures.LAYOUT;
        }

        @Override
        public VkPhysicalDeviceImageRobustnessFeatures create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkPhysicalDeviceImageRobustnessFeatures createUninit(MemorySegment segment) {
            return new VkPhysicalDeviceImageRobustnessFeatures(segment);
        }
    }

    public static final Factory FACTORY = new Factory();
}
