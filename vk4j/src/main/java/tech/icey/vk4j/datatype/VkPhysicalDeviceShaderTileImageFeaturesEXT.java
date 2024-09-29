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
/// typedef struct VkPhysicalDeviceShaderTileImageFeaturesEXT {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 shaderTileImageColorReadAccess;
///     VkBool32 shaderTileImageDepthReadAccess;
///     VkBool32 shaderTileImageStencilReadAccess;
/// } VkPhysicalDeviceShaderTileImageFeaturesEXT;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkPhysicalDeviceShaderTileImageFeaturesEXT.html">VkPhysicalDeviceShaderTileImageFeaturesEXT</a>
public record VkPhysicalDeviceShaderTileImageFeaturesEXT(MemorySegment segment) implements IPointer {
    public VkPhysicalDeviceShaderTileImageFeaturesEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_TILE_IMAGE_FEATURES_EXT);
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

    public @unsigned int shaderTileImageColorReadAccess() {
        return segment.get(LAYOUT$shaderTileImageColorReadAccess, OFFSET$shaderTileImageColorReadAccess);
    }

    public void shaderTileImageColorReadAccess(@unsigned int value) {
        segment.set(LAYOUT$shaderTileImageColorReadAccess, OFFSET$shaderTileImageColorReadAccess, value);
    }

    public @unsigned int shaderTileImageDepthReadAccess() {
        return segment.get(LAYOUT$shaderTileImageDepthReadAccess, OFFSET$shaderTileImageDepthReadAccess);
    }

    public void shaderTileImageDepthReadAccess(@unsigned int value) {
        segment.set(LAYOUT$shaderTileImageDepthReadAccess, OFFSET$shaderTileImageDepthReadAccess, value);
    }

    public @unsigned int shaderTileImageStencilReadAccess() {
        return segment.get(LAYOUT$shaderTileImageStencilReadAccess, OFFSET$shaderTileImageStencilReadAccess);
    }

    public void shaderTileImageStencilReadAccess(@unsigned int value) {
        segment.set(LAYOUT$shaderTileImageStencilReadAccess, OFFSET$shaderTileImageStencilReadAccess, value);
    }

    public static VkPhysicalDeviceShaderTileImageFeaturesEXT allocate(Arena arena) {
        return new VkPhysicalDeviceShaderTileImageFeaturesEXT(arena.allocate(LAYOUT));
    }
    
    public static VkPhysicalDeviceShaderTileImageFeaturesEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceShaderTileImageFeaturesEXT[] ret = new VkPhysicalDeviceShaderTileImageFeaturesEXT[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkPhysicalDeviceShaderTileImageFeaturesEXT(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPhysicalDeviceShaderTileImageFeaturesEXT clone(Arena arena, VkPhysicalDeviceShaderTileImageFeaturesEXT src) {
        VkPhysicalDeviceShaderTileImageFeaturesEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceShaderTileImageFeaturesEXT[] clone(Arena arena, VkPhysicalDeviceShaderTileImageFeaturesEXT[] src) {
        VkPhysicalDeviceShaderTileImageFeaturesEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("shaderTileImageColorReadAccess"),
        ValueLayout.JAVA_INT.withName("shaderTileImageDepthReadAccess"),
        ValueLayout.JAVA_INT.withName("shaderTileImageStencilReadAccess")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$shaderTileImageColorReadAccess = PathElement.groupElement("shaderTileImageColorReadAccess");
    public static final PathElement PATH$shaderTileImageDepthReadAccess = PathElement.groupElement("shaderTileImageDepthReadAccess");
    public static final PathElement PATH$shaderTileImageStencilReadAccess = PathElement.groupElement("shaderTileImageStencilReadAccess");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$shaderTileImageColorReadAccess = (OfInt) LAYOUT.select(PATH$shaderTileImageColorReadAccess);
    public static final OfInt LAYOUT$shaderTileImageDepthReadAccess = (OfInt) LAYOUT.select(PATH$shaderTileImageDepthReadAccess);
    public static final OfInt LAYOUT$shaderTileImageStencilReadAccess = (OfInt) LAYOUT.select(PATH$shaderTileImageStencilReadAccess);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$shaderTileImageColorReadAccess = LAYOUT.byteOffset(PATH$shaderTileImageColorReadAccess);
    public static final long OFFSET$shaderTileImageDepthReadAccess = LAYOUT.byteOffset(PATH$shaderTileImageDepthReadAccess);
    public static final long OFFSET$shaderTileImageStencilReadAccess = LAYOUT.byteOffset(PATH$shaderTileImageStencilReadAccess);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$shaderTileImageColorReadAccess = LAYOUT$shaderTileImageColorReadAccess.byteSize();
    public static final long SIZE$shaderTileImageDepthReadAccess = LAYOUT$shaderTileImageDepthReadAccess.byteSize();
    public static final long SIZE$shaderTileImageStencilReadAccess = LAYOUT$shaderTileImageStencilReadAccess.byteSize();
}
