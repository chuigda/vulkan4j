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

public record VkPhysicalDeviceInvocationMaskFeaturesHUAWEI(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("invocationMask")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$invocationMask = PathElement.groupElement("invocationMask");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$invocationMask = (OfInt) LAYOUT.select(PATH$invocationMask);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$invocationMask = LAYOUT.byteOffset(PATH$invocationMask);

    public VkPhysicalDeviceInvocationMaskFeaturesHUAWEI(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_INVOCATION_MASK_FEATURES_HUAWEI);
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

    public @unsigned int invocationMask() {
        return segment.get(LAYOUT$invocationMask, OFFSET$invocationMask);
    }

    public void invocationMask(@unsigned int value) {
        segment.set(LAYOUT$invocationMask, OFFSET$invocationMask, value);
    }


    public static final class Factory implements IFactory<VkPhysicalDeviceInvocationMaskFeaturesHUAWEI> {
        @Override
        public Class<VkPhysicalDeviceInvocationMaskFeaturesHUAWEI> clazz() {
            return VkPhysicalDeviceInvocationMaskFeaturesHUAWEI.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkPhysicalDeviceInvocationMaskFeaturesHUAWEI.LAYOUT;
        }

        @Override
        public VkPhysicalDeviceInvocationMaskFeaturesHUAWEI create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkPhysicalDeviceInvocationMaskFeaturesHUAWEI createUninit(MemorySegment segment) {
            return new VkPhysicalDeviceInvocationMaskFeaturesHUAWEI(segment);
        }
    }

    public static final Factory FACTORY = new Factory();
}
