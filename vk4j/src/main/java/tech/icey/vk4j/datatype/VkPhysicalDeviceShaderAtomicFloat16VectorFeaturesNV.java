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

public record VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("shaderFloat16VectorAtomics")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$shaderFloat16VectorAtomics = PathElement.groupElement("shaderFloat16VectorAtomics");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$shaderFloat16VectorAtomics = (OfInt) LAYOUT.select(PATH$shaderFloat16VectorAtomics);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$shaderFloat16VectorAtomics = LAYOUT.byteOffset(PATH$shaderFloat16VectorAtomics);

    public VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_ATOMIC_FLOAT16_VECTOR_FEATURES_NV);
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

    public @unsigned int shaderFloat16VectorAtomics() {
        return segment.get(LAYOUT$shaderFloat16VectorAtomics, OFFSET$shaderFloat16VectorAtomics);
    }

    public void shaderFloat16VectorAtomics(@unsigned int value) {
        segment.set(LAYOUT$shaderFloat16VectorAtomics, OFFSET$shaderFloat16VectorAtomics, value);
    }


    public static final class Factory implements IFactory<VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV> {
        @Override
        public Class<VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV> clazz() {
            return VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV.LAYOUT;
        }

        @Override
        public VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV createUninit(MemorySegment segment) {
            return new VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV(segment);
        }
    }

    public static final Factory FACTORY = new Factory();
}
