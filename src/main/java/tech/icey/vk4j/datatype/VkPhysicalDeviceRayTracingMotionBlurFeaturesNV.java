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

public record VkPhysicalDeviceRayTracingMotionBlurFeaturesNV(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("rayTracingMotionBlur"),
        ValueLayout.JAVA_INT.withName("rayTracingMotionBlurPipelineTraceRaysIndirect")
    );

    public static final PathElement PATH$sType = PathElement.groupElement(0);
    public static final PathElement PATH$pNext = PathElement.groupElement(1);
    public static final PathElement PATH$rayTracingMotionBlur = PathElement.groupElement(2);
    public static final PathElement PATH$rayTracingMotionBlurPipelineTraceRaysIndirect = PathElement.groupElement(3);

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$rayTracingMotionBlur = (OfInt) LAYOUT.select(PATH$rayTracingMotionBlur);
    public static final OfInt LAYOUT$rayTracingMotionBlurPipelineTraceRaysIndirect = (OfInt) LAYOUT.select(PATH$rayTracingMotionBlurPipelineTraceRaysIndirect);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$rayTracingMotionBlur = LAYOUT.byteOffset(PATH$rayTracingMotionBlur);
    public static final long OFFSET$rayTracingMotionBlurPipelineTraceRaysIndirect = LAYOUT.byteOffset(PATH$rayTracingMotionBlurPipelineTraceRaysIndirect);

    public VkPhysicalDeviceRayTracingMotionBlurFeaturesNV(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_MOTION_BLUR_FEATURES_NV);
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

    public @unsigned int rayTracingMotionBlur() {
        return segment.get(LAYOUT$rayTracingMotionBlur, OFFSET$rayTracingMotionBlur);
    }

    public void rayTracingMotionBlur(@unsigned int value) {
        segment.set(LAYOUT$rayTracingMotionBlur, OFFSET$rayTracingMotionBlur, value);
    }

    public @unsigned int rayTracingMotionBlurPipelineTraceRaysIndirect() {
        return segment.get(LAYOUT$rayTracingMotionBlurPipelineTraceRaysIndirect, OFFSET$rayTracingMotionBlurPipelineTraceRaysIndirect);
    }

    public void rayTracingMotionBlurPipelineTraceRaysIndirect(@unsigned int value) {
        segment.set(LAYOUT$rayTracingMotionBlurPipelineTraceRaysIndirect, OFFSET$rayTracingMotionBlurPipelineTraceRaysIndirect, value);
    }


    public static final class VkPhysicalDeviceRayTracingMotionBlurFeaturesNVFactory implements IDataTypeFactory<VkPhysicalDeviceRayTracingMotionBlurFeaturesNV> {
        @Override
        public Class<VkPhysicalDeviceRayTracingMotionBlurFeaturesNV> clazz() {
            return VkPhysicalDeviceRayTracingMotionBlurFeaturesNV.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkPhysicalDeviceRayTracingMotionBlurFeaturesNV.LAYOUT;
        }

        @Override
        public VkPhysicalDeviceRayTracingMotionBlurFeaturesNV create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkPhysicalDeviceRayTracingMotionBlurFeaturesNV createUninit(MemorySegment segment) {
            return new VkPhysicalDeviceRayTracingMotionBlurFeaturesNV(segment);
        }
    }

    public static final VkPhysicalDeviceRayTracingMotionBlurFeaturesNVFactory FACTORY = new VkPhysicalDeviceRayTracingMotionBlurFeaturesNVFactory();
}
