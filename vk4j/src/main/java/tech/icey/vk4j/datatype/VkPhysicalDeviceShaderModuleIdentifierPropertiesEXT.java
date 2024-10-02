package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.panama.IPointer;
import tech.icey.panama.NativeLayout;
import tech.icey.panama.annotation.*;
import tech.icey.panama.buffer.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

/// {@snippet lang=c :
/// typedef struct VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT {
///     VkStructureType sType;
///     void* pNext;
///     uint8_t shaderModuleIdentifierAlgorithmUUID[VK_UUID_SIZE];
/// } VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT.html">VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT</a>
public record VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT(MemorySegment segment) implements IPointer {
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

    public void pNext(IPointer pointer) {
        pNext(pointer.segment());
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

    public static VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT clone(Arena arena, VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT src) {
        VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT[] clone(Arena arena, VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT[] src) {
        VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

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
}
