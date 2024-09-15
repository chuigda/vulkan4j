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

public record VkPhysicalDeviceShaderModuleIdentifierFeaturesEXT(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("shaderModuleIdentifier")
    );

    public static final PathElement PATH$sType = PathElement.groupElement(0);
    public static final PathElement PATH$pNext = PathElement.groupElement(1);
    public static final PathElement PATH$shaderModuleIdentifier = PathElement.groupElement(2);

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$shaderModuleIdentifier = (OfInt) LAYOUT.select(PATH$shaderModuleIdentifier);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$shaderModuleIdentifier = LAYOUT.byteOffset(PATH$shaderModuleIdentifier);

    public VkPhysicalDeviceShaderModuleIdentifierFeaturesEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_MODULE_IDENTIFIER_FEATURES_EXT);
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

    public @unsigned int shaderModuleIdentifier() {
        return segment.get(LAYOUT$shaderModuleIdentifier, OFFSET$shaderModuleIdentifier);
    }

    public void shaderModuleIdentifier(@unsigned int value) {
        segment.set(LAYOUT$shaderModuleIdentifier, OFFSET$shaderModuleIdentifier, value);
    }


    public static final class VkPhysicalDeviceShaderModuleIdentifierFeaturesEXTFactory implements IDataTypeFactory<VkPhysicalDeviceShaderModuleIdentifierFeaturesEXT> {
        @Override
        public Class<VkPhysicalDeviceShaderModuleIdentifierFeaturesEXT> clazz() {
            return VkPhysicalDeviceShaderModuleIdentifierFeaturesEXT.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkPhysicalDeviceShaderModuleIdentifierFeaturesEXT.LAYOUT;
        }

        @Override
        public VkPhysicalDeviceShaderModuleIdentifierFeaturesEXT create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkPhysicalDeviceShaderModuleIdentifierFeaturesEXT createUninit(MemorySegment segment) {
            return new VkPhysicalDeviceShaderModuleIdentifierFeaturesEXT(segment);
        }
    }

    public static final VkPhysicalDeviceShaderModuleIdentifierFeaturesEXTFactory FACTORY = new VkPhysicalDeviceShaderModuleIdentifierFeaturesEXTFactory();
}
