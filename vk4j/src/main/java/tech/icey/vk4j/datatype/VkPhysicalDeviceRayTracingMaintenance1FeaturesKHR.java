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

public record VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("rayTracingMaintenance1"),
        ValueLayout.JAVA_INT.withName("rayTracingPipelineTraceRaysIndirect2")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$rayTracingMaintenance1 = PathElement.groupElement("rayTracingMaintenance1");
    public static final PathElement PATH$rayTracingPipelineTraceRaysIndirect2 = PathElement.groupElement("rayTracingPipelineTraceRaysIndirect2");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$rayTracingMaintenance1 = (OfInt) LAYOUT.select(PATH$rayTracingMaintenance1);
    public static final OfInt LAYOUT$rayTracingPipelineTraceRaysIndirect2 = (OfInt) LAYOUT.select(PATH$rayTracingPipelineTraceRaysIndirect2);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$rayTracingMaintenance1 = LAYOUT.byteOffset(PATH$rayTracingMaintenance1);
    public static final long OFFSET$rayTracingPipelineTraceRaysIndirect2 = LAYOUT.byteOffset(PATH$rayTracingPipelineTraceRaysIndirect2);

    public VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_MAINTENANCE_1_FEATURES_KHR);
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

    public @unsigned int rayTracingMaintenance1() {
        return segment.get(LAYOUT$rayTracingMaintenance1, OFFSET$rayTracingMaintenance1);
    }

    public void rayTracingMaintenance1(@unsigned int value) {
        segment.set(LAYOUT$rayTracingMaintenance1, OFFSET$rayTracingMaintenance1, value);
    }

    public @unsigned int rayTracingPipelineTraceRaysIndirect2() {
        return segment.get(LAYOUT$rayTracingPipelineTraceRaysIndirect2, OFFSET$rayTracingPipelineTraceRaysIndirect2);
    }

    public void rayTracingPipelineTraceRaysIndirect2(@unsigned int value) {
        segment.set(LAYOUT$rayTracingPipelineTraceRaysIndirect2, OFFSET$rayTracingPipelineTraceRaysIndirect2, value);
    }


    public static final class VkPhysicalDeviceRayTracingMaintenance1FeaturesKHRFactory implements IFactory<VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR> {
        @Override
        public Class<VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR> clazz() {
            return VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR.LAYOUT;
        }

        @Override
        public VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR createUninit(MemorySegment segment) {
            return new VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR(segment);
        }
    }

    public static final VkPhysicalDeviceRayTracingMaintenance1FeaturesKHRFactory FACTORY = new VkPhysicalDeviceRayTracingMaintenance1FeaturesKHRFactory();
}
