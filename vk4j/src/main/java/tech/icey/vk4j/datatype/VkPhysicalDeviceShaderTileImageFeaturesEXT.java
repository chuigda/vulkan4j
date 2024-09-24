package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.annotations.*;
import tech.icey.vk4j.array.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import tech.icey.vk4j.ptr.*;
import tech.icey.vk4j.NativeLayout;
import tech.icey.vk4j.IFactory;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

public record VkPhysicalDeviceShaderTileImageFeaturesEXT(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("shaderTileImageColorReadAccess"),
        ValueLayout.JAVA_INT.withName("shaderTileImageDepthReadAccess"),
        ValueLayout.JAVA_INT.withName("shaderTileImageStencilReadAccess")
    );

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


    public static final class VkPhysicalDeviceShaderTileImageFeaturesEXTFactory implements IFactory<VkPhysicalDeviceShaderTileImageFeaturesEXT> {
        @Override
        public Class<VkPhysicalDeviceShaderTileImageFeaturesEXT> clazz() {
            return VkPhysicalDeviceShaderTileImageFeaturesEXT.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkPhysicalDeviceShaderTileImageFeaturesEXT.LAYOUT;
        }

        @Override
        public VkPhysicalDeviceShaderTileImageFeaturesEXT create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkPhysicalDeviceShaderTileImageFeaturesEXT createUninit(MemorySegment segment) {
            return new VkPhysicalDeviceShaderTileImageFeaturesEXT(segment);
        }
    }

    public static final VkPhysicalDeviceShaderTileImageFeaturesEXTFactory FACTORY = new VkPhysicalDeviceShaderTileImageFeaturesEXTFactory();
}
