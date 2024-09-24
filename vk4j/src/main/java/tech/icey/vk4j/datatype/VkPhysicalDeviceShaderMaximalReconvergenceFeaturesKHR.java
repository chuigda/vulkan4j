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

public record VkPhysicalDeviceShaderMaximalReconvergenceFeaturesKHR(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("shaderMaximalReconvergence")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$shaderMaximalReconvergence = PathElement.groupElement("shaderMaximalReconvergence");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$shaderMaximalReconvergence = (OfInt) LAYOUT.select(PATH$shaderMaximalReconvergence);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$shaderMaximalReconvergence = LAYOUT.byteOffset(PATH$shaderMaximalReconvergence);

    public VkPhysicalDeviceShaderMaximalReconvergenceFeaturesKHR(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_MAXIMAL_RECONVERGENCE_FEATURES_KHR);
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

    public @unsigned int shaderMaximalReconvergence() {
        return segment.get(LAYOUT$shaderMaximalReconvergence, OFFSET$shaderMaximalReconvergence);
    }

    public void shaderMaximalReconvergence(@unsigned int value) {
        segment.set(LAYOUT$shaderMaximalReconvergence, OFFSET$shaderMaximalReconvergence, value);
    }


    public static final class VkPhysicalDeviceShaderMaximalReconvergenceFeaturesKHRFactory implements IFactory<VkPhysicalDeviceShaderMaximalReconvergenceFeaturesKHR> {
        @Override
        public Class<VkPhysicalDeviceShaderMaximalReconvergenceFeaturesKHR> clazz() {
            return VkPhysicalDeviceShaderMaximalReconvergenceFeaturesKHR.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkPhysicalDeviceShaderMaximalReconvergenceFeaturesKHR.LAYOUT;
        }

        @Override
        public VkPhysicalDeviceShaderMaximalReconvergenceFeaturesKHR create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkPhysicalDeviceShaderMaximalReconvergenceFeaturesKHR createUninit(MemorySegment segment) {
            return new VkPhysicalDeviceShaderMaximalReconvergenceFeaturesKHR(segment);
        }
    }

    public static final VkPhysicalDeviceShaderMaximalReconvergenceFeaturesKHRFactory FACTORY = new VkPhysicalDeviceShaderMaximalReconvergenceFeaturesKHRFactory();
}
