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

public record VkImageResolve(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        VkImageSubresourceLayers.LAYOUT.withName("srcSubresource"),
        VkOffset3D.LAYOUT.withName("srcOffset"),
        VkImageSubresourceLayers.LAYOUT.withName("dstSubresource"),
        VkOffset3D.LAYOUT.withName("dstOffset"),
        VkExtent3D.LAYOUT.withName("extent")
    );

    public static final PathElement PATH$srcSubresource = PathElement.groupElement("srcSubresource");
    public static final PathElement PATH$srcOffset = PathElement.groupElement("srcOffset");
    public static final PathElement PATH$dstSubresource = PathElement.groupElement("dstSubresource");
    public static final PathElement PATH$dstOffset = PathElement.groupElement("dstOffset");
    public static final PathElement PATH$extent = PathElement.groupElement("extent");

    public static final StructLayout LAYOUT$srcSubresource = (StructLayout) LAYOUT.select(PATH$srcSubresource);
    public static final StructLayout LAYOUT$srcOffset = (StructLayout) LAYOUT.select(PATH$srcOffset);
    public static final StructLayout LAYOUT$dstSubresource = (StructLayout) LAYOUT.select(PATH$dstSubresource);
    public static final StructLayout LAYOUT$dstOffset = (StructLayout) LAYOUT.select(PATH$dstOffset);
    public static final StructLayout LAYOUT$extent = (StructLayout) LAYOUT.select(PATH$extent);

    public static final long OFFSET$srcSubresource = LAYOUT.byteOffset(PATH$srcSubresource);
    public static final long OFFSET$srcOffset = LAYOUT.byteOffset(PATH$srcOffset);
    public static final long OFFSET$dstSubresource = LAYOUT.byteOffset(PATH$dstSubresource);
    public static final long OFFSET$dstOffset = LAYOUT.byteOffset(PATH$dstOffset);
    public static final long OFFSET$extent = LAYOUT.byteOffset(PATH$extent);

    public VkImageResolve(MemorySegment segment) {
        this.segment = segment;
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


    public static final class VkImageResolveFactory implements IFactory<VkImageResolve> {
        @Override
        public Class<VkImageResolve> clazz() {
            return VkImageResolve.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkImageResolve.LAYOUT;
        }

        @Override
        public VkImageResolve create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkImageResolve createUninit(MemorySegment segment) {
            return new VkImageResolve(segment);
        }
    }

    public static final VkImageResolveFactory FACTORY = new VkImageResolveFactory();
}
