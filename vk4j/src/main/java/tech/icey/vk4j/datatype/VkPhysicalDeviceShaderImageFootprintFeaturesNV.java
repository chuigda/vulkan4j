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

public record VkPhysicalDeviceShaderImageFootprintFeaturesNV(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("imageFootprint")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$imageFootprint = PathElement.groupElement("imageFootprint");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$imageFootprint = (OfInt) LAYOUT.select(PATH$imageFootprint);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$imageFootprint = LAYOUT.byteOffset(PATH$imageFootprint);

    public VkPhysicalDeviceShaderImageFootprintFeaturesNV(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_IMAGE_FOOTPRINT_FEATURES_NV);
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

    public @unsigned int imageFootprint() {
        return segment.get(LAYOUT$imageFootprint, OFFSET$imageFootprint);
    }

    public void imageFootprint(@unsigned int value) {
        segment.set(LAYOUT$imageFootprint, OFFSET$imageFootprint, value);
    }


    public static final class VkPhysicalDeviceShaderImageFootprintFeaturesNVFactory implements IFactory<VkPhysicalDeviceShaderImageFootprintFeaturesNV> {
        @Override
        public Class<VkPhysicalDeviceShaderImageFootprintFeaturesNV> clazz() {
            return VkPhysicalDeviceShaderImageFootprintFeaturesNV.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkPhysicalDeviceShaderImageFootprintFeaturesNV.LAYOUT;
        }

        @Override
        public VkPhysicalDeviceShaderImageFootprintFeaturesNV create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkPhysicalDeviceShaderImageFootprintFeaturesNV createUninit(MemorySegment segment) {
            return new VkPhysicalDeviceShaderImageFootprintFeaturesNV(segment);
        }
    }

    public static final VkPhysicalDeviceShaderImageFootprintFeaturesNVFactory FACTORY = new VkPhysicalDeviceShaderImageFootprintFeaturesNVFactory();
}
