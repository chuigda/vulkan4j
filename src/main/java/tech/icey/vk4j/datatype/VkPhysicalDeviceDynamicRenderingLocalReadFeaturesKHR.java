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
import tech.icey.vk4j.IDataTypeFactory;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

public record VkPhysicalDeviceDynamicRenderingLocalReadFeaturesKHR(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("dynamicRenderingLocalRead")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$dynamicRenderingLocalRead = PathElement.groupElement("dynamicRenderingLocalRead");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$dynamicRenderingLocalRead = (OfInt) LAYOUT.select(PATH$dynamicRenderingLocalRead);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$dynamicRenderingLocalRead = LAYOUT.byteOffset(PATH$dynamicRenderingLocalRead);

    public VkPhysicalDeviceDynamicRenderingLocalReadFeaturesKHR(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DYNAMIC_RENDERING_LOCAL_READ_FEATURES_KHR);
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

    public @unsigned int dynamicRenderingLocalRead() {
        return segment.get(LAYOUT$dynamicRenderingLocalRead, OFFSET$dynamicRenderingLocalRead);
    }

    public void dynamicRenderingLocalRead(@unsigned int value) {
        segment.set(LAYOUT$dynamicRenderingLocalRead, OFFSET$dynamicRenderingLocalRead, value);
    }


    public static final class VkPhysicalDeviceDynamicRenderingLocalReadFeaturesKHRFactory implements IDataTypeFactory<VkPhysicalDeviceDynamicRenderingLocalReadFeaturesKHR> {
        @Override
        public Class<VkPhysicalDeviceDynamicRenderingLocalReadFeaturesKHR> clazz() {
            return VkPhysicalDeviceDynamicRenderingLocalReadFeaturesKHR.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkPhysicalDeviceDynamicRenderingLocalReadFeaturesKHR.LAYOUT;
        }

        @Override
        public VkPhysicalDeviceDynamicRenderingLocalReadFeaturesKHR create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkPhysicalDeviceDynamicRenderingLocalReadFeaturesKHR createUninit(MemorySegment segment) {
            return new VkPhysicalDeviceDynamicRenderingLocalReadFeaturesKHR(segment);
        }
    }

    public static final VkPhysicalDeviceDynamicRenderingLocalReadFeaturesKHRFactory FACTORY = new VkPhysicalDeviceDynamicRenderingLocalReadFeaturesKHRFactory();
}
