package tech.icey.vk4j.datatype;

import tech.icey.panama.IPointer;
import tech.icey.panama.NativeLayout;
import tech.icey.panama.annotation.enumtype;
import tech.icey.panama.annotation.pointer;
import tech.icey.panama.annotation.unsigned;
import tech.icey.vk4j.enumtype.VkStructureType;

import java.lang.foreign.*;

import static java.lang.foreign.ValueLayout.OfInt;
import static java.lang.foreign.ValueLayout.PathElement;
import static tech.icey.vk4j.enumtype.VkStructureType.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_CORE_PROPERTIES_ARM;

/// {@snippet lang=c :
/// typedef struct VkPhysicalDeviceShaderCorePropertiesARM {
///     VkStructureType sType;
///     void* pNext;
///     uint32_t pixelRate;
///     uint32_t texelRate;
///     uint32_t fmaRate;
/// } VkPhysicalDeviceShaderCorePropertiesARM;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkPhysicalDeviceShaderCorePropertiesARM.html">VkPhysicalDeviceShaderCorePropertiesARM</a>
public record VkPhysicalDeviceShaderCorePropertiesARM(MemorySegment segment) implements IPointer {
    public VkPhysicalDeviceShaderCorePropertiesARM(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_CORE_PROPERTIES_ARM);
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

    public static VkPhysicalDeviceShaderCorePropertiesARM allocate(Arena arena) {
        return new VkPhysicalDeviceShaderCorePropertiesARM(arena.allocate(LAYOUT));
    }

    public static VkPhysicalDeviceShaderCorePropertiesARM[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceShaderCorePropertiesARM[] ret = new VkPhysicalDeviceShaderCorePropertiesARM[count];
        for (int i = 0; i < count; i++) {
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
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("pixelRate"),
        ValueLayout.JAVA_INT.withName("texelRate"),
        ValueLayout.JAVA_INT.withName("fmaRate")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$pixelRate = PathElement.groupElement("pixelRate");
    public static final PathElement PATH$texelRate = PathElement.groupElement("texelRate");
    public static final PathElement PATH$fmaRate = PathElement.groupElement("fmaRate");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$pixelRate = (OfInt) LAYOUT.select(PATH$pixelRate);
    public static final OfInt LAYOUT$texelRate = (OfInt) LAYOUT.select(PATH$texelRate);
    public static final OfInt LAYOUT$fmaRate = (OfInt) LAYOUT.select(PATH$fmaRate);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$pixelRate = LAYOUT.byteOffset(PATH$pixelRate);
    public static final long OFFSET$texelRate = LAYOUT.byteOffset(PATH$texelRate);
    public static final long OFFSET$fmaRate = LAYOUT.byteOffset(PATH$fmaRate);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$pixelRate = LAYOUT$pixelRate.byteSize();
    public static final long SIZE$texelRate = LAYOUT$texelRate.byteSize();
    public static final long SIZE$fmaRate = LAYOUT$fmaRate.byteSize();
}
