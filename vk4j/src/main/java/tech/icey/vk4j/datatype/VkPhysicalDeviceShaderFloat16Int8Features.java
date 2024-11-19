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
/// typedef struct VkPhysicalDeviceShaderFloat16Int8Features {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 shaderFloat16;
///     VkBool32 shaderInt8;
/// } VkPhysicalDeviceShaderFloat16Int8Features;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkPhysicalDeviceShaderFloat16Int8Features.html">VkPhysicalDeviceShaderFloat16Int8Features</a>
public record VkPhysicalDeviceShaderFloat16Int8Features(MemorySegment segment) implements IPointer {
    public VkPhysicalDeviceShaderFloat16Int8Features(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_FLOAT16_INT8_FEATURES);
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

    public @unsigned int shaderFloat16() {
        return segment.get(LAYOUT$shaderFloat16, OFFSET$shaderFloat16);
    }

    public void shaderFloat16(@unsigned int value) {
        segment.set(LAYOUT$shaderFloat16, OFFSET$shaderFloat16, value);
    }

    public @unsigned int shaderInt8() {
        return segment.get(LAYOUT$shaderInt8, OFFSET$shaderInt8);
    }

    public void shaderInt8(@unsigned int value) {
        segment.set(LAYOUT$shaderInt8, OFFSET$shaderInt8, value);
    }

    public static VkPhysicalDeviceShaderFloat16Int8Features allocate(Arena arena) {
        return new VkPhysicalDeviceShaderFloat16Int8Features(arena.allocate(LAYOUT));
    }

    public static VkPhysicalDeviceShaderFloat16Int8Features[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceShaderFloat16Int8Features[] ret = new VkPhysicalDeviceShaderFloat16Int8Features[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkPhysicalDeviceShaderFloat16Int8Features(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPhysicalDeviceShaderFloat16Int8Features clone(Arena arena, VkPhysicalDeviceShaderFloat16Int8Features src) {
        VkPhysicalDeviceShaderFloat16Int8Features ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceShaderFloat16Int8Features[] clone(Arena arena, VkPhysicalDeviceShaderFloat16Int8Features[] src) {
        VkPhysicalDeviceShaderFloat16Int8Features[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("shaderFloat16"),
        ValueLayout.JAVA_INT.withName("shaderInt8")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$shaderFloat16 = PathElement.groupElement("shaderFloat16");
    public static final PathElement PATH$shaderInt8 = PathElement.groupElement("shaderInt8");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$shaderFloat16 = (OfInt) LAYOUT.select(PATH$shaderFloat16);
    public static final OfInt LAYOUT$shaderInt8 = (OfInt) LAYOUT.select(PATH$shaderInt8);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$shaderFloat16 = LAYOUT.byteOffset(PATH$shaderFloat16);
    public static final long OFFSET$shaderInt8 = LAYOUT.byteOffset(PATH$shaderInt8);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$shaderFloat16 = LAYOUT$shaderFloat16.byteSize();
    public static final long SIZE$shaderInt8 = LAYOUT$shaderInt8.byteSize();
}
