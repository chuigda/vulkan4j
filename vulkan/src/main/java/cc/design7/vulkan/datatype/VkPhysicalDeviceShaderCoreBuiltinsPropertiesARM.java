package cc.design7.vulkan.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import cc.design7.ffm.IPointer;
import cc.design7.ffm.NativeLayout;
import cc.design7.ffm.annotation.*;
import cc.design7.ffm.ptr.*;
import cc.design7.vulkan.bitmask.*;
import cc.design7.vulkan.datatype.*;
import cc.design7.vulkan.enumtype.*;
import static cc.design7.vulkan.VkConstants.*;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM.html">VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM</a>
@ValueBasedCandidate
public record VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfLong LAYOUT$shaderCoreMask = ValueLayout.JAVA_LONG.withName("shaderCoreMask");
    public static final OfInt LAYOUT$shaderCoreCount = ValueLayout.JAVA_INT.withName("shaderCoreCount");
    public static final OfInt LAYOUT$shaderWarpsPerCore = ValueLayout.JAVA_INT.withName("shaderWarpsPerCore");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$shaderCoreMask, LAYOUT$shaderCoreCount, LAYOUT$shaderWarpsPerCore);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM allocate(Arena arena) {
        return new VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM(arena.allocate(LAYOUT));
    }

    public static VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM[] ret = new VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM[count];
        for (int i = 0; i < count; i ++) {
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
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$shaderCoreMask = PathElement.groupElement("PATH$shaderCoreMask");
    public static final PathElement PATH$shaderCoreCount = PathElement.groupElement("PATH$shaderCoreCount");
    public static final PathElement PATH$shaderWarpsPerCore = PathElement.groupElement("PATH$shaderWarpsPerCore");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$shaderCoreMask = LAYOUT$shaderCoreMask.byteSize();
    public static final long SIZE$shaderCoreCount = LAYOUT$shaderCoreCount.byteSize();
    public static final long SIZE$shaderWarpsPerCore = LAYOUT$shaderWarpsPerCore.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$shaderCoreMask = LAYOUT.byteOffset(PATH$shaderCoreMask);
    public static final long OFFSET$shaderCoreCount = LAYOUT.byteOffset(PATH$shaderCoreCount);
    public static final long OFFSET$shaderWarpsPerCore = LAYOUT.byteOffset(PATH$shaderWarpsPerCore);

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

}
