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

public record VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("fragmentShaderSampleInterlock"),
        ValueLayout.JAVA_INT.withName("fragmentShaderPixelInterlock"),
        ValueLayout.JAVA_INT.withName("fragmentShaderShadingRateInterlock")
    );

    public static final PathElement PATH$sType = PathElement.groupElement(0);
    public static final PathElement PATH$pNext = PathElement.groupElement(1);
    public static final PathElement PATH$fragmentShaderSampleInterlock = PathElement.groupElement(2);
    public static final PathElement PATH$fragmentShaderPixelInterlock = PathElement.groupElement(3);
    public static final PathElement PATH$fragmentShaderShadingRateInterlock = PathElement.groupElement(4);

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$fragmentShaderSampleInterlock = (OfInt) LAYOUT.select(PATH$fragmentShaderSampleInterlock);
    public static final OfInt LAYOUT$fragmentShaderPixelInterlock = (OfInt) LAYOUT.select(PATH$fragmentShaderPixelInterlock);
    public static final OfInt LAYOUT$fragmentShaderShadingRateInterlock = (OfInt) LAYOUT.select(PATH$fragmentShaderShadingRateInterlock);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$fragmentShaderSampleInterlock = LAYOUT.byteOffset(PATH$fragmentShaderSampleInterlock);
    public static final long OFFSET$fragmentShaderPixelInterlock = LAYOUT.byteOffset(PATH$fragmentShaderPixelInterlock);
    public static final long OFFSET$fragmentShaderShadingRateInterlock = LAYOUT.byteOffset(PATH$fragmentShaderShadingRateInterlock);

    public VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADER_INTERLOCK_FEATURES_EXT);
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

    public @unsigned int fragmentShaderSampleInterlock() {
        return segment.get(LAYOUT$fragmentShaderSampleInterlock, OFFSET$fragmentShaderSampleInterlock);
    }

    public void fragmentShaderSampleInterlock(@unsigned int value) {
        segment.set(LAYOUT$fragmentShaderSampleInterlock, OFFSET$fragmentShaderSampleInterlock, value);
    }

    public @unsigned int fragmentShaderPixelInterlock() {
        return segment.get(LAYOUT$fragmentShaderPixelInterlock, OFFSET$fragmentShaderPixelInterlock);
    }

    public void fragmentShaderPixelInterlock(@unsigned int value) {
        segment.set(LAYOUT$fragmentShaderPixelInterlock, OFFSET$fragmentShaderPixelInterlock, value);
    }

    public @unsigned int fragmentShaderShadingRateInterlock() {
        return segment.get(LAYOUT$fragmentShaderShadingRateInterlock, OFFSET$fragmentShaderShadingRateInterlock);
    }

    public void fragmentShaderShadingRateInterlock(@unsigned int value) {
        segment.set(LAYOUT$fragmentShaderShadingRateInterlock, OFFSET$fragmentShaderShadingRateInterlock, value);
    }


    public static final class VkPhysicalDeviceFragmentShaderInterlockFeaturesEXTFactory implements IDataTypeFactory<VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT> {
        @Override
        public Class<VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT> clazz() {
            return VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT.LAYOUT;
        }

        @Override
        public VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT createUninit(MemorySegment segment) {
            return new VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT(segment);
        }
    }

    public static final VkPhysicalDeviceFragmentShaderInterlockFeaturesEXTFactory FACTORY = new VkPhysicalDeviceFragmentShaderInterlockFeaturesEXTFactory();
}