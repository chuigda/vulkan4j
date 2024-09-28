package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.IPointer;
import tech.icey.vk4j.annotation.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.buffer.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import tech.icey.vk4j.NativeLayout;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

/// {@snippet lang=c :
/// typedef struct VkPhysicalDeviceShaderObjectPropertiesEXT {
///     VkStructureType sType;
///     void* pNext;
///     uint8_t shaderBinaryUUID[VK_UUID_SIZE];
///     uint32_t shaderBinaryVersion;
/// } VkPhysicalDeviceShaderObjectPropertiesEXT;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkPhysicalDeviceShaderObjectPropertiesEXT.html">VkPhysicalDeviceShaderObjectPropertiesEXT</a>
public record VkPhysicalDeviceShaderObjectPropertiesEXT(MemorySegment segment) implements IPointer {
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

    public void pNext(IPointer pointer) {
        pNext(pointer.segment());
    }

    public MemorySegment shaderBinaryUUIDRaw() {
        return segment.asSlice(OFFSET$shaderBinaryUUID, SIZE$shaderBinaryUUID);
    }

    public @unsigned ByteBuffer shaderBinaryUUID() {
        return new ByteBuffer(shaderBinaryUUIDRaw());
    }

    public void shaderBinaryUUID(@unsigned ByteBuffer value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$shaderBinaryUUID, SIZE$shaderBinaryUUID);
    }

    public @unsigned int shaderBinaryVersion() {
        return segment.get(LAYOUT$shaderBinaryVersion, OFFSET$shaderBinaryVersion);
    }

    public void shaderBinaryVersion(@unsigned int value) {
        segment.set(LAYOUT$shaderBinaryVersion, OFFSET$shaderBinaryVersion, value);
    }

    public static VkPhysicalDeviceShaderObjectPropertiesEXT allocate(Arena arena) {
        return new VkPhysicalDeviceShaderObjectPropertiesEXT(arena.allocate(LAYOUT));
    }
    
    public static VkPhysicalDeviceShaderObjectPropertiesEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceShaderObjectPropertiesEXT[] ret = new VkPhysicalDeviceShaderObjectPropertiesEXT[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkPhysicalDeviceShaderObjectPropertiesEXT(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
    
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        MemoryLayout.sequenceLayout(VK_UUID_SIZE, ValueLayout.JAVA_BYTE).withName("shaderBinaryUUID"),
        ValueLayout.JAVA_INT.withName("shaderBinaryVersion")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$shaderBinaryUUID = PathElement.groupElement("shaderBinaryUUID");
    public static final PathElement PATH$shaderBinaryVersion = PathElement.groupElement("shaderBinaryVersion");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final SequenceLayout LAYOUT$shaderBinaryUUID = (SequenceLayout) LAYOUT.select(PATH$shaderBinaryUUID);
    public static final OfInt LAYOUT$shaderBinaryVersion = (OfInt) LAYOUT.select(PATH$shaderBinaryVersion);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$shaderBinaryUUID = LAYOUT.byteOffset(PATH$shaderBinaryUUID);
    public static final long OFFSET$shaderBinaryVersion = LAYOUT.byteOffset(PATH$shaderBinaryVersion);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$shaderBinaryUUID = LAYOUT$shaderBinaryUUID.byteSize();
    public static final long SIZE$shaderBinaryVersion = LAYOUT$shaderBinaryVersion.byteSize();
}
