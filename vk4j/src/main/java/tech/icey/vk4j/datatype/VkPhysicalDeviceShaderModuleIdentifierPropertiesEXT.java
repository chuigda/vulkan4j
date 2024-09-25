package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.annotation.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.buffer.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import tech.icey.vk4j.NativeLayout;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

public record VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        MemoryLayout.sequenceLayout(VK_UUID_SIZE, ValueLayout.JAVA_BYTE).withName("shaderModuleIdentifierAlgorithmUUID")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$shaderModuleIdentifierAlgorithmUUID = PathElement.groupElement("shaderModuleIdentifierAlgorithmUUID");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final SequenceLayout LAYOUT$shaderModuleIdentifierAlgorithmUUID = (SequenceLayout) LAYOUT.select(PATH$shaderModuleIdentifierAlgorithmUUID);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$shaderModuleIdentifierAlgorithmUUID = LAYOUT.byteOffset(PATH$shaderModuleIdentifierAlgorithmUUID);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$shaderModuleIdentifierAlgorithmUUID = LAYOUT$shaderModuleIdentifierAlgorithmUUID.byteSize();

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
        return segment.asSlice(OFFSET$shaderModuleIdentifierAlgorithmUUID, SIZE$shaderModuleIdentifierAlgorithmUUID);
    }

    public @unsigned ByteBuffer shaderModuleIdentifierAlgorithmUUID() {
        return new ByteBuffer(shaderModuleIdentifierAlgorithmUUIDRaw());
    }

    public void shaderModuleIdentifierAlgorithmUUID(@unsigned ByteBuffer value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$shaderModuleIdentifierAlgorithmUUID, SIZE$shaderModuleIdentifierAlgorithmUUID);
    }

    public static VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT allocate(Arena arena) {
        return new VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT(arena.allocate(LAYOUT));
    }
    
    public static VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT[] ret = new VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
}
