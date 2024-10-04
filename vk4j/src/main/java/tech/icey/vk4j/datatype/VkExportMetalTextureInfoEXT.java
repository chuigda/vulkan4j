package tech.icey.vk4j.datatype;

import tech.icey.panama.IPointer;
import tech.icey.panama.NativeLayout;
import tech.icey.panama.annotation.enumtype;
import tech.icey.panama.annotation.nullable;
import tech.icey.panama.annotation.pointer;
import tech.icey.vk4j.bitmask.VkImageAspectFlags;
import tech.icey.vk4j.enumtype.VkStructureType;
import tech.icey.vk4j.handle.VkBufferView;
import tech.icey.vk4j.handle.VkImage;
import tech.icey.vk4j.handle.VkImageView;

import java.lang.foreign.*;

import static java.lang.foreign.ValueLayout.OfInt;
import static java.lang.foreign.ValueLayout.PathElement;
import static tech.icey.vk4j.enumtype.VkStructureType.VK_STRUCTURE_TYPE_EXPORT_METAL_TEXTURE_INFO_EXT;

/// {@snippet lang=c :
/// typedef struct VkExportMetalTextureInfoEXT {
///     VkStructureType sType;
///     const void* pNext;
///     VkImage image;
///     VkImageView imageView;
///     VkBufferView bufferView;
///     VkImageAspectFlagBits plane;
///     MTLTexture_id mtlTexture;
/// } VkExportMetalTextureInfoEXT;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkExportMetalTextureInfoEXT.html">VkExportMetalTextureInfoEXT</a>
public record VkExportMetalTextureInfoEXT(MemorySegment segment) implements IPointer {
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

    public void pNext(@nullable IPointer pointer) {
        pNext(pointer == null ? MemorySegment.NULL : pointer.segment());
    }

    public @nullable VkImage image() {
        MemorySegment s = segment.get(LAYOUT$image, OFFSET$image);
        if (s.address() == 0) {
            return null;
        }
        return new VkImage(s);
    }

    public void image(@nullable VkImage value) {
        segment.set(
            LAYOUT$image,
            OFFSET$image,
            value != null ? value.segment() : MemorySegment.NULL
        );
    }

    public @nullable VkImageView imageView() {
        MemorySegment s = segment.get(LAYOUT$imageView, OFFSET$imageView);
        if (s.address() == 0) {
            return null;
        }
        return new VkImageView(s);
    }

    public void imageView(@nullable VkImageView value) {
        segment.set(
            LAYOUT$imageView,
            OFFSET$imageView,
            value != null ? value.segment() : MemorySegment.NULL
        );
    }

    public @nullable VkBufferView bufferView() {
        MemorySegment s = segment.get(LAYOUT$bufferView, OFFSET$bufferView);
        if (s.address() == 0) {
            return null;
        }
        return new VkBufferView(s);
    }

    public void bufferView(@nullable VkBufferView value) {
        segment.set(
            LAYOUT$bufferView,
            OFFSET$bufferView,
            value != null ? value.segment() : MemorySegment.NULL
        );
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

    public void mtlTexture(@nullable IPointer pointer) {
        mtlTexture(pointer == null ? MemorySegment.NULL : pointer.segment());
    }

    public static VkExportMetalTextureInfoEXT allocate(Arena arena) {
        return new VkExportMetalTextureInfoEXT(arena.allocate(LAYOUT));
    }

    public static VkExportMetalTextureInfoEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkExportMetalTextureInfoEXT[] ret = new VkExportMetalTextureInfoEXT[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkExportMetalTextureInfoEXT(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkExportMetalTextureInfoEXT clone(Arena arena, VkExportMetalTextureInfoEXT src) {
        VkExportMetalTextureInfoEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkExportMetalTextureInfoEXT[] clone(Arena arena, VkExportMetalTextureInfoEXT[] src) {
        VkExportMetalTextureInfoEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("image"),
        ValueLayout.ADDRESS.withName("imageView"),
        ValueLayout.ADDRESS.withName("bufferView"),
        ValueLayout.JAVA_INT.withName("plane"),
        ValueLayout.ADDRESS.withName("mtlTexture")
    );
    public static final long SIZE = LAYOUT.byteSize();

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

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$image = LAYOUT$image.byteSize();
    public static final long SIZE$imageView = LAYOUT$imageView.byteSize();
    public static final long SIZE$bufferView = LAYOUT$bufferView.byteSize();
    public static final long SIZE$plane = LAYOUT$plane.byteSize();
    public static final long SIZE$mtlTexture = LAYOUT$mtlTexture.byteSize();
}
