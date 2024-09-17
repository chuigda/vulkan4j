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

public record VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("clusterShadingRate")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$clusterShadingRate = PathElement.groupElement("clusterShadingRate");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$clusterShadingRate = (OfInt) LAYOUT.select(PATH$clusterShadingRate);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$clusterShadingRate = LAYOUT.byteOffset(PATH$clusterShadingRate);

    public VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CLUSTER_CULLING_SHADER_VRS_FEATURES_HUAWEI);
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

    public @unsigned int clusterShadingRate() {
        return segment.get(LAYOUT$clusterShadingRate, OFFSET$clusterShadingRate);
    }

    public void clusterShadingRate(@unsigned int value) {
        segment.set(LAYOUT$clusterShadingRate, OFFSET$clusterShadingRate, value);
    }


    public static final class VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEIFactory implements IFactory<VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI> {
        @Override
        public Class<VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI> clazz() {
            return VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI.LAYOUT;
        }

        @Override
        public VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI createUninit(MemorySegment segment) {
            return new VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI(segment);
        }
    }

    public static final VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEIFactory FACTORY = new VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEIFactory();
}
