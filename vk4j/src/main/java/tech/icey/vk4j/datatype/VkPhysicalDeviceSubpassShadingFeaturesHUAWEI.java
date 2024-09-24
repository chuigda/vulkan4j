package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.annotation.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.NativeLayout;
import tech.icey.vk4j.IFactory;

import static tech.icey.vk4j.enumtype.VkStructureType.*;

public record VkPhysicalDeviceSubpassShadingFeaturesHUAWEI(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("subpassShading")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$subpassShading = PathElement.groupElement("subpassShading");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$subpassShading = (OfInt) LAYOUT.select(PATH$subpassShading);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$subpassShading = LAYOUT.byteOffset(PATH$subpassShading);

    public VkPhysicalDeviceSubpassShadingFeaturesHUAWEI(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SUBPASS_SHADING_FEATURES_HUAWEI);
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

    public @unsigned int subpassShading() {
        return segment.get(LAYOUT$subpassShading, OFFSET$subpassShading);
    }

    public void subpassShading(@unsigned int value) {
        segment.set(LAYOUT$subpassShading, OFFSET$subpassShading, value);
    }


    public static final class Factory implements IFactory<VkPhysicalDeviceSubpassShadingFeaturesHUAWEI> {
        @Override
        public Class<VkPhysicalDeviceSubpassShadingFeaturesHUAWEI> clazz() {
            return VkPhysicalDeviceSubpassShadingFeaturesHUAWEI.class;
        }

        @Override
        public MemoryLayout layout() {
            return VkPhysicalDeviceSubpassShadingFeaturesHUAWEI.LAYOUT;
        }

        @Override
        public VkPhysicalDeviceSubpassShadingFeaturesHUAWEI create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkPhysicalDeviceSubpassShadingFeaturesHUAWEI createUninit(MemorySegment segment) {
            return new VkPhysicalDeviceSubpassShadingFeaturesHUAWEI(segment);
        }
    }

    public static final Factory FACTORY = new Factory();
}
