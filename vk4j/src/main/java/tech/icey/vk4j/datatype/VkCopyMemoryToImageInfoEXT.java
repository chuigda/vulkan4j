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

public record VkCopyMemoryToImageInfoEXT(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.ADDRESS.withName("dstImage"),
        ValueLayout.JAVA_INT.withName("dstImageLayout"),
        ValueLayout.JAVA_INT.withName("regionCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkMemoryToImageCopyEXT.LAYOUT).withName("pRegions")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$flags = PathElement.groupElement("flags");
    public static final PathElement PATH$dstImage = PathElement.groupElement("dstImage");
    public static final PathElement PATH$dstImageLayout = PathElement.groupElement("dstImageLayout");
    public static final PathElement PATH$regionCount = PathElement.groupElement("regionCount");
    public static final PathElement PATH$pRegions = PathElement.groupElement("pRegions");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$flags = (OfInt) LAYOUT.select(PATH$flags);
    public static final AddressLayout LAYOUT$dstImage = (AddressLayout) LAYOUT.select(PATH$dstImage);
    public static final OfInt LAYOUT$dstImageLayout = (OfInt) LAYOUT.select(PATH$dstImageLayout);
    public static final OfInt LAYOUT$regionCount = (OfInt) LAYOUT.select(PATH$regionCount);
    public static final AddressLayout LAYOUT$pRegions = (AddressLayout) LAYOUT.select(PATH$pRegions);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$dstImage = LAYOUT.byteOffset(PATH$dstImage);
    public static final long OFFSET$dstImageLayout = LAYOUT.byteOffset(PATH$dstImageLayout);
    public static final long OFFSET$regionCount = LAYOUT.byteOffset(PATH$regionCount);
    public static final long OFFSET$pRegions = LAYOUT.byteOffset(PATH$pRegions);

    public VkCopyMemoryToImageInfoEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_COPY_MEMORY_TO_IMAGE_INFO_EXT);
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

    public @enumtype(VkHostImageCopyFlagsEXT.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public void flags(@enumtype(VkHostImageCopyFlagsEXT.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
    }

    public VkImage dstImage() {
        return new VkImage(segment.asSlice(OFFSET$dstImage, LAYOUT$dstImage));
    }

    public void dstImage(VkImage value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$dstImage, LAYOUT$dstImage.byteSize());
    }

    public @enumtype(VkImageLayout.class) int dstImageLayout() {
        return segment.get(LAYOUT$dstImageLayout, OFFSET$dstImageLayout);
    }

    public void dstImageLayout(@enumtype(VkImageLayout.class) int value) {
        segment.set(LAYOUT$dstImageLayout, OFFSET$dstImageLayout, value);
    }

    public @unsigned int regionCount() {
        return segment.get(LAYOUT$regionCount, OFFSET$regionCount);
    }

    public void regionCount(@unsigned int value) {
        segment.set(LAYOUT$regionCount, OFFSET$regionCount, value);
    }

    public @pointer(comment="VkMemoryToImageCopyEXT*") MemorySegment pRegionsRaw() {
        return segment.get(LAYOUT$pRegions, OFFSET$pRegions);
    }

    public void pRegionsRaw(@pointer(comment="VkMemoryToImageCopyEXT*") MemorySegment value) {
        segment.set(LAYOUT$pRegions, OFFSET$pRegions, value);
    }
    
    public @nullable VkMemoryToImageCopyEXT pRegions() {
        MemorySegment s = pRegionsRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkMemoryToImageCopyEXT(s);
    }

    public void pRegions(@nullable VkMemoryToImageCopyEXT value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pRegionsRaw(s);
    }


    public static final class VkCopyMemoryToImageInfoEXTFactory implements IFactory<VkCopyMemoryToImageInfoEXT> {
        @Override
        public Class<VkCopyMemoryToImageInfoEXT> clazz() {
            return VkCopyMemoryToImageInfoEXT.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkCopyMemoryToImageInfoEXT.LAYOUT;
        }

        @Override
        public VkCopyMemoryToImageInfoEXT create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkCopyMemoryToImageInfoEXT createUninit(MemorySegment segment) {
            return new VkCopyMemoryToImageInfoEXT(segment);
        }
    }

    public static final VkCopyMemoryToImageInfoEXTFactory FACTORY = new VkCopyMemoryToImageInfoEXTFactory();
}
