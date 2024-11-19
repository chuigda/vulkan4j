package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import org.jetbrains.annotations.Nullable;
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
/// typedef struct VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM {
///     VkStructureType sType;
///     void* pNext;
///     uint64_t shaderCoreMask;
///     uint32_t shaderCoreCount;
///     uint32_t shaderWarpsPerCore;
/// } VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM.html">VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM</a>
public record VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM(MemorySegment segment) implements IPointer {
    public VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_CORE_BUILTINS_PROPERTIES_ARM);
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

    public void pNext(@Nullable IPointer pointer) {
        pNext(pointer == null ? MemorySegment.NULL : pointer.segment());
    }

    public @unsigned long shaderCoreMask() {
        return segment.get(LAYOUT$shaderCoreMask, OFFSET$shaderCoreMask);
    }

    public void shaderCoreMask(@unsigned long value) {
        segment.set(LAYOUT$shaderCoreMask, OFFSET$shaderCoreMask, value);
    }

    public @unsigned int shaderCoreCount() {
        return segment.get(LAYOUT$shaderCoreCount, OFFSET$shaderCoreCount);
    }

    public void shaderCoreCount(@unsigned int value) {
        segment.set(LAYOUT$shaderCoreCount, OFFSET$shaderCoreCount, value);
    }

    public @unsigned int shaderWarpsPerCore() {
        return segment.get(LAYOUT$shaderWarpsPerCore, OFFSET$shaderWarpsPerCore);
    }

    public void shaderWarpsPerCore(@unsigned int value) {
        segment.set(LAYOUT$shaderWarpsPerCore, OFFSET$shaderWarpsPerCore, value);
    }

    public static VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM allocate(Arena arena) {
        return new VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM(arena.allocate(LAYOUT));
    }

    public static VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM[] ret = new VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM clone(Arena arena, VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM src) {
        VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM[] clone(Arena arena, VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM[] src) {
        VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("shaderCoreMask"),
        ValueLayout.JAVA_INT.withName("shaderCoreCount"),
        ValueLayout.JAVA_INT.withName("shaderWarpsPerCore")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$shaderCoreMask = PathElement.groupElement("shaderCoreMask");
    public static final PathElement PATH$shaderCoreCount = PathElement.groupElement("shaderCoreCount");
    public static final PathElement PATH$shaderWarpsPerCore = PathElement.groupElement("shaderWarpsPerCore");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfLong LAYOUT$shaderCoreMask = (OfLong) LAYOUT.select(PATH$shaderCoreMask);
    public static final OfInt LAYOUT$shaderCoreCount = (OfInt) LAYOUT.select(PATH$shaderCoreCount);
    public static final OfInt LAYOUT$shaderWarpsPerCore = (OfInt) LAYOUT.select(PATH$shaderWarpsPerCore);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$shaderCoreMask = LAYOUT.byteOffset(PATH$shaderCoreMask);
    public static final long OFFSET$shaderCoreCount = LAYOUT.byteOffset(PATH$shaderCoreCount);
    public static final long OFFSET$shaderWarpsPerCore = LAYOUT.byteOffset(PATH$shaderWarpsPerCore);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$shaderCoreMask = LAYOUT$shaderCoreMask.byteSize();
    public static final long SIZE$shaderCoreCount = LAYOUT$shaderCoreCount.byteSize();
    public static final long SIZE$shaderWarpsPerCore = LAYOUT$shaderWarpsPerCore.byteSize();
}
