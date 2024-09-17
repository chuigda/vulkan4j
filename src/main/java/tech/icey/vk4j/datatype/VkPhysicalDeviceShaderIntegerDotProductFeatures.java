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

public record VkPhysicalDeviceShaderIntegerDotProductFeatures(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("shaderIntegerDotProduct")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$shaderIntegerDotProduct = PathElement.groupElement("shaderIntegerDotProduct");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$shaderIntegerDotProduct = (OfInt) LAYOUT.select(PATH$shaderIntegerDotProduct);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$shaderIntegerDotProduct = LAYOUT.byteOffset(PATH$shaderIntegerDotProduct);

    public VkPhysicalDeviceShaderIntegerDotProductFeatures(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_INTEGER_DOT_PRODUCT_FEATURES);
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

    public @unsigned int shaderIntegerDotProduct() {
        return segment.get(LAYOUT$shaderIntegerDotProduct, OFFSET$shaderIntegerDotProduct);
    }

    public void shaderIntegerDotProduct(@unsigned int value) {
        segment.set(LAYOUT$shaderIntegerDotProduct, OFFSET$shaderIntegerDotProduct, value);
    }


    public static final class VkPhysicalDeviceShaderIntegerDotProductFeaturesFactory implements IDataTypeFactory<VkPhysicalDeviceShaderIntegerDotProductFeatures> {
        @Override
        public Class<VkPhysicalDeviceShaderIntegerDotProductFeatures> clazz() {
            return VkPhysicalDeviceShaderIntegerDotProductFeatures.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkPhysicalDeviceShaderIntegerDotProductFeatures.LAYOUT;
        }

        @Override
        public VkPhysicalDeviceShaderIntegerDotProductFeatures create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkPhysicalDeviceShaderIntegerDotProductFeatures createUninit(MemorySegment segment) {
            return new VkPhysicalDeviceShaderIntegerDotProductFeatures(segment);
        }
    }

    public static final VkPhysicalDeviceShaderIntegerDotProductFeaturesFactory FACTORY = new VkPhysicalDeviceShaderIntegerDotProductFeaturesFactory();
}
