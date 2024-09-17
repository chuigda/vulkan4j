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

public record VkPhysicalDeviceDynamicRenderingFeatures(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("dynamicRendering")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$dynamicRendering = PathElement.groupElement("dynamicRendering");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$dynamicRendering = (OfInt) LAYOUT.select(PATH$dynamicRendering);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$dynamicRendering = LAYOUT.byteOffset(PATH$dynamicRendering);

    public VkPhysicalDeviceDynamicRenderingFeatures(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DYNAMIC_RENDERING_FEATURES);
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

    public @unsigned int dynamicRendering() {
        return segment.get(LAYOUT$dynamicRendering, OFFSET$dynamicRendering);
    }

    public void dynamicRendering(@unsigned int value) {
        segment.set(LAYOUT$dynamicRendering, OFFSET$dynamicRendering, value);
    }


    public static final class VkPhysicalDeviceDynamicRenderingFeaturesFactory implements IDataTypeFactory<VkPhysicalDeviceDynamicRenderingFeatures> {
        @Override
        public Class<VkPhysicalDeviceDynamicRenderingFeatures> clazz() {
            return VkPhysicalDeviceDynamicRenderingFeatures.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkPhysicalDeviceDynamicRenderingFeatures.LAYOUT;
        }

        @Override
        public VkPhysicalDeviceDynamicRenderingFeatures create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkPhysicalDeviceDynamicRenderingFeatures createUninit(MemorySegment segment) {
            return new VkPhysicalDeviceDynamicRenderingFeatures(segment);
        }
    }

    public static final VkPhysicalDeviceDynamicRenderingFeaturesFactory FACTORY = new VkPhysicalDeviceDynamicRenderingFeaturesFactory();
}
