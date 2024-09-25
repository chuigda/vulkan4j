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

public record VkPhysicalDeviceSubpassShadingPropertiesHUAWEI(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("maxSubpassShadingWorkgroupSizeAspectRatio")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$maxSubpassShadingWorkgroupSizeAspectRatio = PathElement.groupElement("maxSubpassShadingWorkgroupSizeAspectRatio");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$maxSubpassShadingWorkgroupSizeAspectRatio = (OfInt) LAYOUT.select(PATH$maxSubpassShadingWorkgroupSizeAspectRatio);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$maxSubpassShadingWorkgroupSizeAspectRatio = LAYOUT.byteOffset(PATH$maxSubpassShadingWorkgroupSizeAspectRatio);

    public VkPhysicalDeviceSubpassShadingPropertiesHUAWEI(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SUBPASS_SHADING_PROPERTIES_HUAWEI);
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

    public @unsigned int maxSubpassShadingWorkgroupSizeAspectRatio() {
        return segment.get(LAYOUT$maxSubpassShadingWorkgroupSizeAspectRatio, OFFSET$maxSubpassShadingWorkgroupSizeAspectRatio);
    }

    public void maxSubpassShadingWorkgroupSizeAspectRatio(@unsigned int value) {
        segment.set(LAYOUT$maxSubpassShadingWorkgroupSizeAspectRatio, OFFSET$maxSubpassShadingWorkgroupSizeAspectRatio, value);
    }


    public static final class Factory implements IFactory<VkPhysicalDeviceSubpassShadingPropertiesHUAWEI> {
        @Override
        public Class<VkPhysicalDeviceSubpassShadingPropertiesHUAWEI> clazz() {
            return VkPhysicalDeviceSubpassShadingPropertiesHUAWEI.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkPhysicalDeviceSubpassShadingPropertiesHUAWEI.LAYOUT;
        }

        @Override
        public VkPhysicalDeviceSubpassShadingPropertiesHUAWEI create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkPhysicalDeviceSubpassShadingPropertiesHUAWEI createUninit(MemorySegment segment) {
            return new VkPhysicalDeviceSubpassShadingPropertiesHUAWEI(segment);
        }
    }

    public static final Factory FACTORY = new Factory();
}
