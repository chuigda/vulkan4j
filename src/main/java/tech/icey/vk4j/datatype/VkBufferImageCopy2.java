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
import tech.icey.vk4j.IDataTypeFactory;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

public record VkBufferImageCopy2(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("bufferOffset"),
        ValueLayout.JAVA_INT.withName("bufferRowLength"),
        ValueLayout.JAVA_INT.withName("bufferImageHeight"),
        VkImageSubresourceLayers.LAYOUT.withName("imageSubresource"),
        VkOffset3D.LAYOUT.withName("imageOffset"),
        VkExtent3D.LAYOUT.withName("imageExtent")
    );

    public static final PathElement PATH$sType = PathElement.groupElement(0);
    public static final PathElement PATH$pNext = PathElement.groupElement(1);
    public static final PathElement PATH$bufferOffset = PathElement.groupElement(2);
    public static final PathElement PATH$bufferRowLength = PathElement.groupElement(3);
    public static final PathElement PATH$bufferImageHeight = PathElement.groupElement(4);
    public static final PathElement PATH$imageSubresource = PathElement.groupElement(5);
    public static final PathElement PATH$imageOffset = PathElement.groupElement(6);
    public static final PathElement PATH$imageExtent = PathElement.groupElement(7);

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfLong LAYOUT$bufferOffset = (OfLong) LAYOUT.select(PATH$bufferOffset);
    public static final OfInt LAYOUT$bufferRowLength = (OfInt) LAYOUT.select(PATH$bufferRowLength);
    public static final OfInt LAYOUT$bufferImageHeight = (OfInt) LAYOUT.select(PATH$bufferImageHeight);
    public static final StructLayout LAYOUT$imageSubresource = (StructLayout) LAYOUT.select(PATH$imageSubresource);
    public static final StructLayout LAYOUT$imageOffset = (StructLayout) LAYOUT.select(PATH$imageOffset);
    public static final StructLayout LAYOUT$imageExtent = (StructLayout) LAYOUT.select(PATH$imageExtent);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$bufferOffset = LAYOUT.byteOffset(PATH$bufferOffset);
    public static final long OFFSET$bufferRowLength = LAYOUT.byteOffset(PATH$bufferRowLength);
    public static final long OFFSET$bufferImageHeight = LAYOUT.byteOffset(PATH$bufferImageHeight);
    public static final long OFFSET$imageSubresource = LAYOUT.byteOffset(PATH$imageSubresource);
    public static final long OFFSET$imageOffset = LAYOUT.byteOffset(PATH$imageOffset);
    public static final long OFFSET$imageExtent = LAYOUT.byteOffset(PATH$imageExtent);

    public VkBufferImageCopy2(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_BUFFER_IMAGE_COPY_2);
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

    public @unsigned long bufferOffset() {
        return segment.get(LAYOUT$bufferOffset, OFFSET$bufferOffset);
    }

    public void bufferOffset(@unsigned long value) {
        segment.set(LAYOUT$bufferOffset, OFFSET$bufferOffset, value);
    }

    public @unsigned int bufferRowLength() {
        return segment.get(LAYOUT$bufferRowLength, OFFSET$bufferRowLength);
    }

    public void bufferRowLength(@unsigned int value) {
        segment.set(LAYOUT$bufferRowLength, OFFSET$bufferRowLength, value);
    }

    public @unsigned int bufferImageHeight() {
        return segment.get(LAYOUT$bufferImageHeight, OFFSET$bufferImageHeight);
    }

    public void bufferImageHeight(@unsigned int value) {
        segment.set(LAYOUT$bufferImageHeight, OFFSET$bufferImageHeight, value);
    }

    public VkImageSubresourceLayers imageSubresource() {
        return new VkImageSubresourceLayers(segment.asSlice(OFFSET$imageSubresource, LAYOUT$imageSubresource));
    }

    public void imageSubresource(VkImageSubresourceLayers value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$imageSubresource, LAYOUT$imageSubresource.byteSize());
    }

    public VkOffset3D imageOffset() {
        return new VkOffset3D(segment.asSlice(OFFSET$imageOffset, LAYOUT$imageOffset));
    }

    public void imageOffset(VkOffset3D value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$imageOffset, LAYOUT$imageOffset.byteSize());
    }

    public VkExtent3D imageExtent() {
        return new VkExtent3D(segment.asSlice(OFFSET$imageExtent, LAYOUT$imageExtent));
    }

    public void imageExtent(VkExtent3D value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$imageExtent, LAYOUT$imageExtent.byteSize());
    }


    public static final class VkBufferImageCopy2Factory implements IDataTypeFactory<VkBufferImageCopy2> {
        @Override
        public Class<VkBufferImageCopy2> clazz() {
            return VkBufferImageCopy2.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkBufferImageCopy2.LAYOUT;
        }

        @Override
        public VkBufferImageCopy2 create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkBufferImageCopy2 createUninit(MemorySegment segment) {
            return new VkBufferImageCopy2(segment);
        }
    }

    public static final VkBufferImageCopy2Factory FACTORY = new VkBufferImageCopy2Factory();
}