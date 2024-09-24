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

public record VkExportMetalTextureInfoEXT(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("image"),
        ValueLayout.ADDRESS.withName("imageView"),
        ValueLayout.ADDRESS.withName("bufferView"),
        ValueLayout.JAVA_INT.withName("plane"),
        ValueLayout.ADDRESS.withName("mtlTexture")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$image = PathElement.groupElement("image");
    public static final PathElement PATH$imageView = PathElement.groupElement("imageView");
    public static final PathElement PATH$bufferView = PathElement.groupElement("bufferView");
    public static final PathElement PATH$plane = PathElement.groupElement("plane");
    public static final PathElement PATH$mtlTexture = PathElement.groupElement("mtlTexture");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final AddressLayout LAYOUT$image = (AddressLayout) LAYOUT.select(PATH$image);
    public static final AddressLayout LAYOUT$imageView = (AddressLayout) LAYOUT.select(PATH$imageView);
    public static final AddressLayout LAYOUT$bufferView = (AddressLayout) LAYOUT.select(PATH$bufferView);
    public static final OfInt LAYOUT$plane = (OfInt) LAYOUT.select(PATH$plane);
    public static final AddressLayout LAYOUT$mtlTexture = (AddressLayout) LAYOUT.select(PATH$mtlTexture);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$image = LAYOUT.byteOffset(PATH$image);
    public static final long OFFSET$imageView = LAYOUT.byteOffset(PATH$imageView);
    public static final long OFFSET$bufferView = LAYOUT.byteOffset(PATH$bufferView);
    public static final long OFFSET$plane = LAYOUT.byteOffset(PATH$plane);
    public static final long OFFSET$mtlTexture = LAYOUT.byteOffset(PATH$mtlTexture);

    public VkExportMetalTextureInfoEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_EXPORT_METAL_TEXTURE_INFO_EXT);
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

    public VkImage image() {
        return new VkImage(segment.asSlice(OFFSET$image, LAYOUT$image));
    }

    public void image(VkImage value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$image, LAYOUT$image.byteSize());
    }

    public VkImageView imageView() {
        return new VkImageView(segment.asSlice(OFFSET$imageView, LAYOUT$imageView));
    }

    public void imageView(VkImageView value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$imageView, LAYOUT$imageView.byteSize());
    }

    public VkBufferView bufferView() {
        return new VkBufferView(segment.asSlice(OFFSET$bufferView, LAYOUT$bufferView));
    }

    public void bufferView(VkBufferView value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$bufferView, LAYOUT$bufferView.byteSize());
    }

    public @enumtype(VkImageAspectFlags.class) int plane() {
        return segment.get(LAYOUT$plane, OFFSET$plane);
    }

    public void plane(@enumtype(VkImageAspectFlags.class) int value) {
        segment.set(LAYOUT$plane, OFFSET$plane, value);
    }

    public @pointer(comment="void*") MemorySegment mtlTexture() {
        return segment.get(LAYOUT$mtlTexture, OFFSET$mtlTexture);
    }

    public void mtlTexture(@pointer(comment="void*") MemorySegment value) {
        segment.set(LAYOUT$mtlTexture, OFFSET$mtlTexture, value);
    }


    public static final class VkExportMetalTextureInfoEXTFactory implements IFactory<VkExportMetalTextureInfoEXT> {
        @Override
        public Class<VkExportMetalTextureInfoEXT> clazz() {
            return VkExportMetalTextureInfoEXT.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkExportMetalTextureInfoEXT.LAYOUT;
        }

        @Override
        public VkExportMetalTextureInfoEXT create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkExportMetalTextureInfoEXT createUninit(MemorySegment segment) {
            return new VkExportMetalTextureInfoEXT(segment);
        }
    }

    public static final VkExportMetalTextureInfoEXTFactory FACTORY = new VkExportMetalTextureInfoEXTFactory();
}
