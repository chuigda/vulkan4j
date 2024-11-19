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
/// typedef struct VkPhysicalDeviceShaderTileImagePropertiesEXT {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 shaderTileImageCoherentReadAccelerated;
///     VkBool32 shaderTileImageReadSampleFromPixelRateInvocation;
///     VkBool32 shaderTileImageReadFromHelperInvocation;
/// } VkPhysicalDeviceShaderTileImagePropertiesEXT;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkPhysicalDeviceShaderTileImagePropertiesEXT.html">VkPhysicalDeviceShaderTileImagePropertiesEXT</a>
public record VkPhysicalDeviceShaderTileImagePropertiesEXT(MemorySegment segment) implements IPointer {
    public VkPhysicalDeviceShaderTileImagePropertiesEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_TILE_IMAGE_PROPERTIES_EXT);
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

    public @unsigned int shaderTileImageCoherentReadAccelerated() {
        return segment.get(LAYOUT$shaderTileImageCoherentReadAccelerated, OFFSET$shaderTileImageCoherentReadAccelerated);
    }

    public void shaderTileImageCoherentReadAccelerated(@unsigned int value) {
        segment.set(LAYOUT$shaderTileImageCoherentReadAccelerated, OFFSET$shaderTileImageCoherentReadAccelerated, value);
    }

    public @unsigned int shaderTileImageReadSampleFromPixelRateInvocation() {
        return segment.get(LAYOUT$shaderTileImageReadSampleFromPixelRateInvocation, OFFSET$shaderTileImageReadSampleFromPixelRateInvocation);
    }

    public void shaderTileImageReadSampleFromPixelRateInvocation(@unsigned int value) {
        segment.set(LAYOUT$shaderTileImageReadSampleFromPixelRateInvocation, OFFSET$shaderTileImageReadSampleFromPixelRateInvocation, value);
    }

    public @unsigned int shaderTileImageReadFromHelperInvocation() {
        return segment.get(LAYOUT$shaderTileImageReadFromHelperInvocation, OFFSET$shaderTileImageReadFromHelperInvocation);
    }

    public void shaderTileImageReadFromHelperInvocation(@unsigned int value) {
        segment.set(LAYOUT$shaderTileImageReadFromHelperInvocation, OFFSET$shaderTileImageReadFromHelperInvocation, value);
    }

    public static VkPhysicalDeviceShaderTileImagePropertiesEXT allocate(Arena arena) {
        return new VkPhysicalDeviceShaderTileImagePropertiesEXT(arena.allocate(LAYOUT));
    }

    public static VkPhysicalDeviceShaderTileImagePropertiesEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceShaderTileImagePropertiesEXT[] ret = new VkPhysicalDeviceShaderTileImagePropertiesEXT[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkPhysicalDeviceShaderTileImagePropertiesEXT(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPhysicalDeviceShaderTileImagePropertiesEXT clone(Arena arena, VkPhysicalDeviceShaderTileImagePropertiesEXT src) {
        VkPhysicalDeviceShaderTileImagePropertiesEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceShaderTileImagePropertiesEXT[] clone(Arena arena, VkPhysicalDeviceShaderTileImagePropertiesEXT[] src) {
        VkPhysicalDeviceShaderTileImagePropertiesEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("shaderTileImageCoherentReadAccelerated"),
        ValueLayout.JAVA_INT.withName("shaderTileImageReadSampleFromPixelRateInvocation"),
        ValueLayout.JAVA_INT.withName("shaderTileImageReadFromHelperInvocation")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$shaderTileImageCoherentReadAccelerated = PathElement.groupElement("shaderTileImageCoherentReadAccelerated");
    public static final PathElement PATH$shaderTileImageReadSampleFromPixelRateInvocation = PathElement.groupElement("shaderTileImageReadSampleFromPixelRateInvocation");
    public static final PathElement PATH$shaderTileImageReadFromHelperInvocation = PathElement.groupElement("shaderTileImageReadFromHelperInvocation");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$shaderTileImageCoherentReadAccelerated = (OfInt) LAYOUT.select(PATH$shaderTileImageCoherentReadAccelerated);
    public static final OfInt LAYOUT$shaderTileImageReadSampleFromPixelRateInvocation = (OfInt) LAYOUT.select(PATH$shaderTileImageReadSampleFromPixelRateInvocation);
    public static final OfInt LAYOUT$shaderTileImageReadFromHelperInvocation = (OfInt) LAYOUT.select(PATH$shaderTileImageReadFromHelperInvocation);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$shaderTileImageCoherentReadAccelerated = LAYOUT.byteOffset(PATH$shaderTileImageCoherentReadAccelerated);
    public static final long OFFSET$shaderTileImageReadSampleFromPixelRateInvocation = LAYOUT.byteOffset(PATH$shaderTileImageReadSampleFromPixelRateInvocation);
    public static final long OFFSET$shaderTileImageReadFromHelperInvocation = LAYOUT.byteOffset(PATH$shaderTileImageReadFromHelperInvocation);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$shaderTileImageCoherentReadAccelerated = LAYOUT$shaderTileImageCoherentReadAccelerated.byteSize();
    public static final long SIZE$shaderTileImageReadSampleFromPixelRateInvocation = LAYOUT$shaderTileImageReadSampleFromPixelRateInvocation.byteSize();
    public static final long SIZE$shaderTileImageReadFromHelperInvocation = LAYOUT$shaderTileImageReadFromHelperInvocation.byteSize();
}
