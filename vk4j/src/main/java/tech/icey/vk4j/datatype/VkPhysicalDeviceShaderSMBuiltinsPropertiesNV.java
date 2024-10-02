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
/// typedef struct VkPhysicalDeviceShaderSMBuiltinsPropertiesNV {
///     VkStructureType sType;
///     void* pNext;
///     uint32_t shaderSMCount;
///     uint32_t shaderWarpsPerSM;
/// } VkPhysicalDeviceShaderSMBuiltinsPropertiesNV;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkPhysicalDeviceShaderSMBuiltinsPropertiesNV.html">VkPhysicalDeviceShaderSMBuiltinsPropertiesNV</a>
public record VkPhysicalDeviceShaderSMBuiltinsPropertiesNV(MemorySegment segment) implements IPointer {
    public VkPhysicalDeviceShaderSMBuiltinsPropertiesNV(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_SM_BUILTINS_PROPERTIES_NV);
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

    public @unsigned int shaderSMCount() {
        return segment.get(LAYOUT$shaderSMCount, OFFSET$shaderSMCount);
    }

    public void shaderSMCount(@unsigned int value) {
        segment.set(LAYOUT$shaderSMCount, OFFSET$shaderSMCount, value);
    }

    public @unsigned int shaderWarpsPerSM() {
        return segment.get(LAYOUT$shaderWarpsPerSM, OFFSET$shaderWarpsPerSM);
    }

    public void shaderWarpsPerSM(@unsigned int value) {
        segment.set(LAYOUT$shaderWarpsPerSM, OFFSET$shaderWarpsPerSM, value);
    }

    public static VkPhysicalDeviceShaderSMBuiltinsPropertiesNV allocate(Arena arena) {
        return new VkPhysicalDeviceShaderSMBuiltinsPropertiesNV(arena.allocate(LAYOUT));
    }
    
    public static VkPhysicalDeviceShaderSMBuiltinsPropertiesNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceShaderSMBuiltinsPropertiesNV[] ret = new VkPhysicalDeviceShaderSMBuiltinsPropertiesNV[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkPhysicalDeviceShaderSMBuiltinsPropertiesNV(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPhysicalDeviceShaderSMBuiltinsPropertiesNV clone(Arena arena, VkPhysicalDeviceShaderSMBuiltinsPropertiesNV src) {
        VkPhysicalDeviceShaderSMBuiltinsPropertiesNV ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceShaderSMBuiltinsPropertiesNV[] clone(Arena arena, VkPhysicalDeviceShaderSMBuiltinsPropertiesNV[] src) {
        VkPhysicalDeviceShaderSMBuiltinsPropertiesNV[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("shaderSMCount"),
        ValueLayout.JAVA_INT.withName("shaderWarpsPerSM")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$shaderSMCount = PathElement.groupElement("shaderSMCount");
    public static final PathElement PATH$shaderWarpsPerSM = PathElement.groupElement("shaderWarpsPerSM");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$shaderSMCount = (OfInt) LAYOUT.select(PATH$shaderSMCount);
    public static final OfInt LAYOUT$shaderWarpsPerSM = (OfInt) LAYOUT.select(PATH$shaderWarpsPerSM);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$shaderSMCount = LAYOUT.byteOffset(PATH$shaderSMCount);
    public static final long OFFSET$shaderWarpsPerSM = LAYOUT.byteOffset(PATH$shaderWarpsPerSM);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$shaderSMCount = LAYOUT$shaderSMCount.byteSize();
    public static final long SIZE$shaderWarpsPerSM = LAYOUT$shaderWarpsPerSM.byteSize();
}
