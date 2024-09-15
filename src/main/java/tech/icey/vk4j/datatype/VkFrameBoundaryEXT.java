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

public record VkFrameBoundaryEXT(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_LONG.withName("frameID"),
        ValueLayout.JAVA_INT.withName("imageCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS).withName("pImages"),
        ValueLayout.JAVA_INT.withName("bufferCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS).withName("pBuffers"),
        ValueLayout.JAVA_LONG.withName("tagName"),
        NativeLayout.C_SIZE_T.withName("tagSize"),
        ValueLayout.ADDRESS.withName("pTag")
    );

    public static final PathElement PATH$sType = PathElement.groupElement(0);
    public static final PathElement PATH$pNext = PathElement.groupElement(1);
    public static final PathElement PATH$flags = PathElement.groupElement(2);
    public static final PathElement PATH$frameID = PathElement.groupElement(3);
    public static final PathElement PATH$imageCount = PathElement.groupElement(4);
    public static final PathElement PATH$pImages = PathElement.groupElement(5);
    public static final PathElement PATH$bufferCount = PathElement.groupElement(6);
    public static final PathElement PATH$pBuffers = PathElement.groupElement(7);
    public static final PathElement PATH$tagName = PathElement.groupElement(8);
    public static final PathElement PATH$tagSize = PathElement.groupElement(9);
    public static final PathElement PATH$pTag = PathElement.groupElement(10);

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$flags = (OfInt) LAYOUT.select(PATH$flags);
    public static final OfLong LAYOUT$frameID = (OfLong) LAYOUT.select(PATH$frameID);
    public static final OfInt LAYOUT$imageCount = (OfInt) LAYOUT.select(PATH$imageCount);
    public static final AddressLayout LAYOUT$pImages = (AddressLayout) LAYOUT.select(PATH$pImages);
    public static final OfInt LAYOUT$bufferCount = (OfInt) LAYOUT.select(PATH$bufferCount);
    public static final AddressLayout LAYOUT$pBuffers = (AddressLayout) LAYOUT.select(PATH$pBuffers);
    public static final OfLong LAYOUT$tagName = (OfLong) LAYOUT.select(PATH$tagName);
    public static final AddressLayout LAYOUT$pTag = (AddressLayout) LAYOUT.select(PATH$pTag);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$frameID = LAYOUT.byteOffset(PATH$frameID);
    public static final long OFFSET$imageCount = LAYOUT.byteOffset(PATH$imageCount);
    public static final long OFFSET$pImages = LAYOUT.byteOffset(PATH$pImages);
    public static final long OFFSET$bufferCount = LAYOUT.byteOffset(PATH$bufferCount);
    public static final long OFFSET$pBuffers = LAYOUT.byteOffset(PATH$pBuffers);
    public static final long OFFSET$tagName = LAYOUT.byteOffset(PATH$tagName);
    public static final long OFFSET$tagSize = LAYOUT.byteOffset(PATH$tagSize);
    public static final long OFFSET$pTag = LAYOUT.byteOffset(PATH$pTag);

    public VkFrameBoundaryEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_FRAME_BOUNDARY_EXT);
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

    public @enumtype(VkFrameBoundaryFlagsEXT.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public void flags(@enumtype(VkFrameBoundaryFlagsEXT.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
    }

    public @unsigned long frameID() {
        return segment.get(LAYOUT$frameID, OFFSET$frameID);
    }

    public void frameID(@unsigned long value) {
        segment.set(LAYOUT$frameID, OFFSET$frameID, value);
    }

    public @unsigned int imageCount() {
        return segment.get(LAYOUT$imageCount, OFFSET$imageCount);
    }

    public void imageCount(@unsigned int value) {
        segment.set(LAYOUT$imageCount, OFFSET$imageCount, value);
    }

    public @pointer(comment="VkImage*") MemorySegment pImagesRaw() {
        return segment.get(LAYOUT$pImages, OFFSET$pImages);
    }

    public void pImagesRaw(@pointer(comment="VkImage*") MemorySegment value) {
        segment.set(LAYOUT$pImages, OFFSET$pImages, value);
    }
    
    public VkImage pImages() {
        MemorySegment s = pImagesRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkImage(s);
    }

    public void pImages(VkImage value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pImagesRaw(s);
    }

    public @unsigned int bufferCount() {
        return segment.get(LAYOUT$bufferCount, OFFSET$bufferCount);
    }

    public void bufferCount(@unsigned int value) {
        segment.set(LAYOUT$bufferCount, OFFSET$bufferCount, value);
    }

    public @pointer(comment="VkBuffer*") MemorySegment pBuffersRaw() {
        return segment.get(LAYOUT$pBuffers, OFFSET$pBuffers);
    }

    public void pBuffersRaw(@pointer(comment="VkBuffer*") MemorySegment value) {
        segment.set(LAYOUT$pBuffers, OFFSET$pBuffers, value);
    }
    
    public VkBuffer pBuffers() {
        MemorySegment s = pBuffersRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkBuffer(s);
    }

    public void pBuffers(VkBuffer value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pBuffersRaw(s);
    }

    public @unsigned long tagName() {
        return segment.get(LAYOUT$tagName, OFFSET$tagName);
    }

    public void tagName(@unsigned long value) {
        segment.set(LAYOUT$tagName, OFFSET$tagName, value);
    }

    public long tagSize() {
        return NativeLayout.readCLong(segment, OFFSET$tagSize);
    }

    public void tagSize(long value) {
        NativeLayout.writeCLong(segment, OFFSET$tagSize, value);
    }

    public @pointer(comment="void*") MemorySegment pTag() {
        return segment.get(LAYOUT$pTag, OFFSET$pTag);
    }

    public void pTag(@pointer(comment="void*") MemorySegment value) {
        segment.set(LAYOUT$pTag, OFFSET$pTag, value);
    }


    public static final class VkFrameBoundaryEXTFactory implements IDataTypeFactory<VkFrameBoundaryEXT> {
        @Override
        public Class<VkFrameBoundaryEXT> clazz() {
            return VkFrameBoundaryEXT.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkFrameBoundaryEXT.LAYOUT;
        }

        @Override
        public VkFrameBoundaryEXT create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkFrameBoundaryEXT createUninit(MemorySegment segment) {
            return new VkFrameBoundaryEXT(segment);
        }
    }

    public static final VkFrameBoundaryEXTFactory FACTORY = new VkFrameBoundaryEXTFactory();
}
