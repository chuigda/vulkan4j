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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceShaderCorePropertiesARM.html">VkPhysicalDeviceShaderCorePropertiesARM</a>
@ValueBasedCandidate
public record VkPhysicalDeviceShaderCorePropertiesARM(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$pixelRate = ValueLayout.JAVA_INT.withName("pixelRate");
    public static final OfInt LAYOUT$texelRate = ValueLayout.JAVA_INT.withName("texelRate");
    public static final OfInt LAYOUT$fmaRate = ValueLayout.JAVA_INT.withName("fmaRate");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$pixelRate, LAYOUT$texelRate, LAYOUT$fmaRate);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkPhysicalDeviceShaderCorePropertiesARM allocate(Arena arena) {
        return new VkPhysicalDeviceShaderCorePropertiesARM(arena.allocate(LAYOUT));
    }

    public static VkPhysicalDeviceShaderCorePropertiesARM[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceShaderCorePropertiesARM[] ret = new VkPhysicalDeviceShaderCorePropertiesARM[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPhysicalDeviceShaderCorePropertiesARM(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPhysicalDeviceShaderCorePropertiesARM clone(Arena arena, VkPhysicalDeviceShaderCorePropertiesARM src) {
        VkPhysicalDeviceShaderCorePropertiesARM ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceShaderCorePropertiesARM[] clone(Arena arena, VkPhysicalDeviceShaderCorePropertiesARM[] src) {
        VkPhysicalDeviceShaderCorePropertiesARM[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$pixelRate = PathElement.groupElement("PATH$pixelRate");
    public static final PathElement PATH$texelRate = PathElement.groupElement("PATH$texelRate");
    public static final PathElement PATH$fmaRate = PathElement.groupElement("PATH$fmaRate");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$pixelRate = LAYOUT$pixelRate.byteSize();
    public static final long SIZE$texelRate = LAYOUT$texelRate.byteSize();
    public static final long SIZE$fmaRate = LAYOUT$fmaRate.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$pixelRate = LAYOUT.byteOffset(PATH$pixelRate);
    public static final long OFFSET$texelRate = LAYOUT.byteOffset(PATH$texelRate);
    public static final long OFFSET$fmaRate = LAYOUT.byteOffset(PATH$fmaRate);

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

    public @unsigned int pixelRate() {
        return segment.get(LAYOUT$pixelRate, OFFSET$pixelRate);
    }

    public void pixelRate(@unsigned int value) {
        segment.set(LAYOUT$pixelRate, OFFSET$pixelRate, value);
    }

    public @unsigned int texelRate() {
        return segment.get(LAYOUT$texelRate, OFFSET$texelRate);
    }

    public void texelRate(@unsigned int value) {
        segment.set(LAYOUT$texelRate, OFFSET$texelRate, value);
    }

    public @unsigned int fmaRate() {
        return segment.get(LAYOUT$fmaRate, OFFSET$fmaRate);
    }

    public void fmaRate(@unsigned int value) {
        segment.set(LAYOUT$fmaRate, OFFSET$fmaRate, value);
    }

}
