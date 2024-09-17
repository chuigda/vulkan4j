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

public record VkPhysicalDeviceShaderReplicatedCompositesFeaturesEXT(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("shaderReplicatedComposites")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$shaderReplicatedComposites = PathElement.groupElement("shaderReplicatedComposites");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$shaderReplicatedComposites = (OfInt) LAYOUT.select(PATH$shaderReplicatedComposites);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$shaderReplicatedComposites = LAYOUT.byteOffset(PATH$shaderReplicatedComposites);

    public VkPhysicalDeviceShaderReplicatedCompositesFeaturesEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_REPLICATED_COMPOSITES_FEATURES_EXT);
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

    public @unsigned int shaderReplicatedComposites() {
        return segment.get(LAYOUT$shaderReplicatedComposites, OFFSET$shaderReplicatedComposites);
    }

    public void shaderReplicatedComposites(@unsigned int value) {
        segment.set(LAYOUT$shaderReplicatedComposites, OFFSET$shaderReplicatedComposites, value);
    }


    public static final class VkPhysicalDeviceShaderReplicatedCompositesFeaturesEXTFactory implements IDataTypeFactory<VkPhysicalDeviceShaderReplicatedCompositesFeaturesEXT> {
        @Override
        public Class<VkPhysicalDeviceShaderReplicatedCompositesFeaturesEXT> clazz() {
            return VkPhysicalDeviceShaderReplicatedCompositesFeaturesEXT.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkPhysicalDeviceShaderReplicatedCompositesFeaturesEXT.LAYOUT;
        }

        @Override
        public VkPhysicalDeviceShaderReplicatedCompositesFeaturesEXT create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkPhysicalDeviceShaderReplicatedCompositesFeaturesEXT createUninit(MemorySegment segment) {
            return new VkPhysicalDeviceShaderReplicatedCompositesFeaturesEXT(segment);
        }
    }

    public static final VkPhysicalDeviceShaderReplicatedCompositesFeaturesEXTFactory FACTORY = new VkPhysicalDeviceShaderReplicatedCompositesFeaturesEXTFactory();
}
