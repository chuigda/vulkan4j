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

public record VkPhysicalDeviceRayTracingPipelineFeaturesKHR(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("rayTracingPipeline"),
        ValueLayout.JAVA_INT.withName("rayTracingPipelineShaderGroupHandleCaptureReplay"),
        ValueLayout.JAVA_INT.withName("rayTracingPipelineShaderGroupHandleCaptureReplayMixed"),
        ValueLayout.JAVA_INT.withName("rayTracingPipelineTraceRaysIndirect"),
        ValueLayout.JAVA_INT.withName("rayTraversalPrimitiveCulling")
    );

    public static final PathElement PATH$sType = PathElement.groupElement(0);
    public static final PathElement PATH$pNext = PathElement.groupElement(1);
    public static final PathElement PATH$rayTracingPipeline = PathElement.groupElement(2);
    public static final PathElement PATH$rayTracingPipelineShaderGroupHandleCaptureReplay = PathElement.groupElement(3);
    public static final PathElement PATH$rayTracingPipelineShaderGroupHandleCaptureReplayMixed = PathElement.groupElement(4);
    public static final PathElement PATH$rayTracingPipelineTraceRaysIndirect = PathElement.groupElement(5);
    public static final PathElement PATH$rayTraversalPrimitiveCulling = PathElement.groupElement(6);

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$rayTracingPipeline = (OfInt) LAYOUT.select(PATH$rayTracingPipeline);
    public static final OfInt LAYOUT$rayTracingPipelineShaderGroupHandleCaptureReplay = (OfInt) LAYOUT.select(PATH$rayTracingPipelineShaderGroupHandleCaptureReplay);
    public static final OfInt LAYOUT$rayTracingPipelineShaderGroupHandleCaptureReplayMixed = (OfInt) LAYOUT.select(PATH$rayTracingPipelineShaderGroupHandleCaptureReplayMixed);
    public static final OfInt LAYOUT$rayTracingPipelineTraceRaysIndirect = (OfInt) LAYOUT.select(PATH$rayTracingPipelineTraceRaysIndirect);
    public static final OfInt LAYOUT$rayTraversalPrimitiveCulling = (OfInt) LAYOUT.select(PATH$rayTraversalPrimitiveCulling);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$rayTracingPipeline = LAYOUT.byteOffset(PATH$rayTracingPipeline);
    public static final long OFFSET$rayTracingPipelineShaderGroupHandleCaptureReplay = LAYOUT.byteOffset(PATH$rayTracingPipelineShaderGroupHandleCaptureReplay);
    public static final long OFFSET$rayTracingPipelineShaderGroupHandleCaptureReplayMixed = LAYOUT.byteOffset(PATH$rayTracingPipelineShaderGroupHandleCaptureReplayMixed);
    public static final long OFFSET$rayTracingPipelineTraceRaysIndirect = LAYOUT.byteOffset(PATH$rayTracingPipelineTraceRaysIndirect);
    public static final long OFFSET$rayTraversalPrimitiveCulling = LAYOUT.byteOffset(PATH$rayTraversalPrimitiveCulling);

    public VkPhysicalDeviceRayTracingPipelineFeaturesKHR(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_PIPELINE_FEATURES_KHR);
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

    public @unsigned int rayTracingPipeline() {
        return segment.get(LAYOUT$rayTracingPipeline, OFFSET$rayTracingPipeline);
    }

    public void rayTracingPipeline(@unsigned int value) {
        segment.set(LAYOUT$rayTracingPipeline, OFFSET$rayTracingPipeline, value);
    }

    public @unsigned int rayTracingPipelineShaderGroupHandleCaptureReplay() {
        return segment.get(LAYOUT$rayTracingPipelineShaderGroupHandleCaptureReplay, OFFSET$rayTracingPipelineShaderGroupHandleCaptureReplay);
    }

    public void rayTracingPipelineShaderGroupHandleCaptureReplay(@unsigned int value) {
        segment.set(LAYOUT$rayTracingPipelineShaderGroupHandleCaptureReplay, OFFSET$rayTracingPipelineShaderGroupHandleCaptureReplay, value);
    }

    public @unsigned int rayTracingPipelineShaderGroupHandleCaptureReplayMixed() {
        return segment.get(LAYOUT$rayTracingPipelineShaderGroupHandleCaptureReplayMixed, OFFSET$rayTracingPipelineShaderGroupHandleCaptureReplayMixed);
    }

    public void rayTracingPipelineShaderGroupHandleCaptureReplayMixed(@unsigned int value) {
        segment.set(LAYOUT$rayTracingPipelineShaderGroupHandleCaptureReplayMixed, OFFSET$rayTracingPipelineShaderGroupHandleCaptureReplayMixed, value);
    }

    public @unsigned int rayTracingPipelineTraceRaysIndirect() {
        return segment.get(LAYOUT$rayTracingPipelineTraceRaysIndirect, OFFSET$rayTracingPipelineTraceRaysIndirect);
    }

    public void rayTracingPipelineTraceRaysIndirect(@unsigned int value) {
        segment.set(LAYOUT$rayTracingPipelineTraceRaysIndirect, OFFSET$rayTracingPipelineTraceRaysIndirect, value);
    }

    public @unsigned int rayTraversalPrimitiveCulling() {
        return segment.get(LAYOUT$rayTraversalPrimitiveCulling, OFFSET$rayTraversalPrimitiveCulling);
    }

    public void rayTraversalPrimitiveCulling(@unsigned int value) {
        segment.set(LAYOUT$rayTraversalPrimitiveCulling, OFFSET$rayTraversalPrimitiveCulling, value);
    }


    public static final class VkPhysicalDeviceRayTracingPipelineFeaturesKHRFactory implements IDataTypeFactory<VkPhysicalDeviceRayTracingPipelineFeaturesKHR> {
        @Override
        public Class<VkPhysicalDeviceRayTracingPipelineFeaturesKHR> clazz() {
            return VkPhysicalDeviceRayTracingPipelineFeaturesKHR.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkPhysicalDeviceRayTracingPipelineFeaturesKHR.LAYOUT;
        }

        @Override
        public VkPhysicalDeviceRayTracingPipelineFeaturesKHR create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkPhysicalDeviceRayTracingPipelineFeaturesKHR createUninit(MemorySegment segment) {
            return new VkPhysicalDeviceRayTracingPipelineFeaturesKHR(segment);
        }
    }

    public static final VkPhysicalDeviceRayTracingPipelineFeaturesKHRFactory FACTORY = new VkPhysicalDeviceRayTracingPipelineFeaturesKHRFactory();
}