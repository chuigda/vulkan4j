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

public record VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        MemoryLayout.sequenceLayout(VK_UUID_SIZE, ValueLayout.JAVA_BYTE).withName("shaderModuleIdentifierAlgorithmUUID")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$shaderModuleIdentifierAlgorithmUUID = PathElement.groupElement("shaderModuleIdentifierAlgorithmUUID");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final SequenceLayout LAYOUT$shaderModuleIdentifierAlgorithmUUID = (SequenceLayout) LAYOUT.select(PATH$shaderModuleIdentifierAlgorithmUUID);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$shaderModuleIdentifierAlgorithmUUID = LAYOUT.byteOffset(PATH$shaderModuleIdentifierAlgorithmUUID);

    public VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_MODULE_IDENTIFIER_PROPERTIES_EXT);
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

    public MemorySegment shaderModuleIdentifierAlgorithmUUIDRaw() {
        return segment.asSlice(OFFSET$shaderModuleIdentifierAlgorithmUUID, LAYOUT$shaderModuleIdentifierAlgorithmUUID.byteSize());
    }

    public @unsigned ByteArray shaderModuleIdentifierAlgorithmUUID() {
        return new ByteArray(shaderModuleIdentifierAlgorithmUUIDRaw(), LAYOUT$shaderModuleIdentifierAlgorithmUUID.elementCount());
    }

    public void shaderModuleIdentifierAlgorithmUUID(@unsigned ByteArray value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$shaderModuleIdentifierAlgorithmUUID, LAYOUT$shaderModuleIdentifierAlgorithmUUID.byteSize());
    }


    public static final class VkPhysicalDeviceShaderModuleIdentifierPropertiesEXTFactory implements IFactory<VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT> {
        @Override
        public Class<VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT> clazz() {
            return VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT.LAYOUT;
        }

        @Override
        public VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT createUninit(MemorySegment segment) {
            return new VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT(segment);
        }
    }

    public static final VkPhysicalDeviceShaderModuleIdentifierPropertiesEXTFactory FACTORY = new VkPhysicalDeviceShaderModuleIdentifierPropertiesEXTFactory();
}
