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

public record VkPhysicalDeviceShaderObjectPropertiesEXT(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        MemoryLayout.sequenceLayout(VK_UUID_SIZE, ValueLayout.JAVA_BYTE).withName("shaderBinaryUUID"),
        ValueLayout.JAVA_INT.withName("shaderBinaryVersion")
    );

    public static final PathElement PATH$sType = PathElement.groupElement(0);
    public static final PathElement PATH$pNext = PathElement.groupElement(1);
    public static final PathElement PATH$shaderBinaryUUID = PathElement.groupElement(2);
    public static final PathElement PATH$shaderBinaryVersion = PathElement.groupElement(3);

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final SequenceLayout LAYOUT$shaderBinaryUUID = (SequenceLayout) LAYOUT.select(PATH$shaderBinaryUUID);
    public static final OfInt LAYOUT$shaderBinaryVersion = (OfInt) LAYOUT.select(PATH$shaderBinaryVersion);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$shaderBinaryUUID = LAYOUT.byteOffset(PATH$shaderBinaryUUID);
    public static final long OFFSET$shaderBinaryVersion = LAYOUT.byteOffset(PATH$shaderBinaryVersion);

    public VkPhysicalDeviceShaderObjectPropertiesEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_OBJECT_PROPERTIES_EXT);
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

    public MemorySegment shaderBinaryUUIDRaw() {
        return segment.asSlice(OFFSET$shaderBinaryUUID, LAYOUT$shaderBinaryUUID.byteSize());
    }
        
    public @unsigned ByteArray shaderBinaryUUID(int index) {
        return new ByteArray(shaderBinaryUUIDRaw(), LAYOUT$shaderBinaryUUID.elementCount());
    }
    
    public void shaderBinaryUUID(@unsigned ByteArray value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$shaderBinaryUUID, LAYOUT$shaderBinaryUUID.byteSize());
    }

    public @unsigned int shaderBinaryVersion() {
        return segment.get(LAYOUT$shaderBinaryVersion, OFFSET$shaderBinaryVersion);
    }

    public void shaderBinaryVersion(@unsigned int value) {
        segment.set(LAYOUT$shaderBinaryVersion, OFFSET$shaderBinaryVersion, value);
    }


    public static final class VkPhysicalDeviceShaderObjectPropertiesEXTFactory implements IDataTypeFactory<VkPhysicalDeviceShaderObjectPropertiesEXT> {
        @Override
        public Class<VkPhysicalDeviceShaderObjectPropertiesEXT> clazz() {
            return VkPhysicalDeviceShaderObjectPropertiesEXT.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkPhysicalDeviceShaderObjectPropertiesEXT.LAYOUT;
        }

        @Override
        public VkPhysicalDeviceShaderObjectPropertiesEXT create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkPhysicalDeviceShaderObjectPropertiesEXT createUninit(MemorySegment segment) {
            return new VkPhysicalDeviceShaderObjectPropertiesEXT(segment);
        }
    }

    public static final VkPhysicalDeviceShaderObjectPropertiesEXTFactory FACTORY = new VkPhysicalDeviceShaderObjectPropertiesEXTFactory();
}
