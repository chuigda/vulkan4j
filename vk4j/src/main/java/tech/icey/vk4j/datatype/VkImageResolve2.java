package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.annotation.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.buffer.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import tech.icey.vk4j.NativeLayout;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

public record VkImageResolve2(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        VkImageSubresourceLayers.LAYOUT.withName("srcSubresource"),
        VkOffset3D.LAYOUT.withName("srcOffset"),
        VkImageSubresourceLayers.LAYOUT.withName("dstSubresource"),
        VkOffset3D.LAYOUT.withName("dstOffset"),
        VkExtent3D.LAYOUT.withName("extent")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$srcSubresource = PathElement.groupElement("srcSubresource");
    public static final PathElement PATH$srcOffset = PathElement.groupElement("srcOffset");
    public static final PathElement PATH$dstSubresource = PathElement.groupElement("dstSubresource");
    public static final PathElement PATH$dstOffset = PathElement.groupElement("dstOffset");
    public static final PathElement PATH$extent = PathElement.groupElement("extent");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final StructLayout LAYOUT$srcSubresource = (StructLayout) LAYOUT.select(PATH$srcSubresource);
    public static final StructLayout LAYOUT$srcOffset = (StructLayout) LAYOUT.select(PATH$srcOffset);
    public static final StructLayout LAYOUT$dstSubresource = (StructLayout) LAYOUT.select(PATH$dstSubresource);
    public static final StructLayout LAYOUT$dstOffset = (StructLayout) LAYOUT.select(PATH$dstOffset);
    public static final StructLayout LAYOUT$extent = (StructLayout) LAYOUT.select(PATH$extent);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$srcSubresource = LAYOUT.byteOffset(PATH$srcSubresource);
    public static final long OFFSET$srcOffset = LAYOUT.byteOffset(PATH$srcOffset);
    public static final long OFFSET$dstSubresource = LAYOUT.byteOffset(PATH$dstSubresource);
    public static final long OFFSET$dstOffset = LAYOUT.byteOffset(PATH$dstOffset);
    public static final long OFFSET$extent = LAYOUT.byteOffset(PATH$extent);

    public VkImageResolve2(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_IMAGE_RESOLVE_2);
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

    public VkImageSubresourceLayers srcSubresource() {
        return new VkImageSubresourceLayers(segment.asSlice(OFFSET$srcSubresource, LAYOUT$srcSubresource));
    }

    public void srcSubresource(VkImageSubresourceLayers value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$srcSubresource, LAYOUT$srcSubresource.byteSize());
    }

    public VkOffset3D srcOffset() {
        return new VkOffset3D(segment.asSlice(OFFSET$srcOffset, LAYOUT$srcOffset));
    }

    public void srcOffset(VkOffset3D value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$srcOffset, LAYOUT$srcOffset.byteSize());
    }

    public VkImageSubresourceLayers dstSubresource() {
        return new VkImageSubresourceLayers(segment.asSlice(OFFSET$dstSubresource, LAYOUT$dstSubresource));
    }

    public void dstSubresource(VkImageSubresourceLayers value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$dstSubresource, LAYOUT$dstSubresource.byteSize());
    }

    public VkOffset3D dstOffset() {
        return new VkOffset3D(segment.asSlice(OFFSET$dstOffset, LAYOUT$dstOffset));
    }

    public void dstOffset(VkOffset3D value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$dstOffset, LAYOUT$dstOffset.byteSize());
    }

    public VkExtent3D extent() {
        return new VkExtent3D(segment.asSlice(OFFSET$extent, LAYOUT$extent));
    }

    public void extent(VkExtent3D value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$extent, LAYOUT$extent.byteSize());
    }

    public static VkImageResolve2 allocate(Arena arena) {
        return new VkImageResolve2(arena.allocate(LAYOUT));
    }
    
    public static VkImageResolve2[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkImageResolve2[] ret = new VkImageResolve2[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkImageResolve2(segment.asSlice(i * LAYOUT.byteSize(), LAYOUT.byteSize()));
        }
        return ret;
    }
}
