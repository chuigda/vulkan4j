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

public record VkCopyImageToMemoryInfoEXT(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.ADDRESS.withName("srcImage"),
        ValueLayout.JAVA_INT.withName("srcImageLayout"),
        ValueLayout.JAVA_INT.withName("regionCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkImageToMemoryCopyEXT.LAYOUT).withName("pRegions")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$flags = PathElement.groupElement("flags");
    public static final PathElement PATH$srcImage = PathElement.groupElement("srcImage");
    public static final PathElement PATH$srcImageLayout = PathElement.groupElement("srcImageLayout");
    public static final PathElement PATH$regionCount = PathElement.groupElement("regionCount");
    public static final PathElement PATH$pRegions = PathElement.groupElement("pRegions");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$flags = (OfInt) LAYOUT.select(PATH$flags);
    public static final AddressLayout LAYOUT$srcImage = (AddressLayout) LAYOUT.select(PATH$srcImage);
    public static final OfInt LAYOUT$srcImageLayout = (OfInt) LAYOUT.select(PATH$srcImageLayout);
    public static final OfInt LAYOUT$regionCount = (OfInt) LAYOUT.select(PATH$regionCount);
    public static final AddressLayout LAYOUT$pRegions = (AddressLayout) LAYOUT.select(PATH$pRegions);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$srcImage = LAYOUT.byteOffset(PATH$srcImage);
    public static final long OFFSET$srcImageLayout = LAYOUT.byteOffset(PATH$srcImageLayout);
    public static final long OFFSET$regionCount = LAYOUT.byteOffset(PATH$regionCount);
    public static final long OFFSET$pRegions = LAYOUT.byteOffset(PATH$pRegions);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$srcImage = LAYOUT$srcImage.byteSize();
    public static final long SIZE$srcImageLayout = LAYOUT$srcImageLayout.byteSize();
    public static final long SIZE$regionCount = LAYOUT$regionCount.byteSize();
    public static final long SIZE$pRegions = LAYOUT$pRegions.byteSize();

    public VkCopyImageToMemoryInfoEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_COPY_IMAGE_TO_MEMORY_INFO_EXT);
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

    public VkImage srcImage() {
        return new VkImage(segment.get(LAYOUT$srcImage, OFFSET$srcImage));
    }

    public void srcImage(VkImage value) {
        segment.set(LAYOUT$srcImage, OFFSET$srcImage, value.segment());
    }

    public @enumtype(VkImageLayout.class) int srcImageLayout() {
        return segment.get(LAYOUT$srcImageLayout, OFFSET$srcImageLayout);
    }

    public void srcImageLayout(@enumtype(VkImageLayout.class) int value) {
        segment.set(LAYOUT$srcImageLayout, OFFSET$srcImageLayout, value);
    }

    public @unsigned int regionCount() {
        return segment.get(LAYOUT$regionCount, OFFSET$regionCount);
    }

    public void regionCount(@unsigned int value) {
        segment.set(LAYOUT$regionCount, OFFSET$regionCount, value);
    }

    public @pointer(comment="VkImageToMemoryCopyEXT*") MemorySegment pRegionsRaw() {
        return segment.get(LAYOUT$pRegions, OFFSET$pRegions);
    }

    public void pRegionsRaw(@pointer(comment="VkImageToMemoryCopyEXT*") MemorySegment value) {
        segment.set(LAYOUT$pRegions, OFFSET$pRegions, value);
    }
    
    public @nullable VkImageToMemoryCopyEXT pRegions() {
        MemorySegment s = pRegionsRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkImageToMemoryCopyEXT(s);
    }

    @unsafe
    public @nullable VkImageToMemoryCopyEXT[] pRegions(int assumedCount) {
        MemorySegment s = pRegionsRaw().reinterpret(assumedCount * VkImageToMemoryCopyEXT.SIZE);
        VkImageToMemoryCopyEXT[] arr = new VkImageToMemoryCopyEXT[assumedCount];
        for (int i = 0; i < assumedCount; i++) {
            arr[i] = new VkImageToMemoryCopyEXT(s.asSlice(i * VkImageToMemoryCopyEXT.SIZE, VkImageToMemoryCopyEXT.SIZE));
        }
        return arr;
    }

    public void pRegions(@nullable VkImageToMemoryCopyEXT value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pRegionsRaw(s);
    }

    public static VkCopyImageToMemoryInfoEXT allocate(Arena arena) {
        return new VkCopyImageToMemoryInfoEXT(arena.allocate(LAYOUT));
    }
    
    public static VkCopyImageToMemoryInfoEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkCopyImageToMemoryInfoEXT[] ret = new VkCopyImageToMemoryInfoEXT[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkCopyImageToMemoryInfoEXT(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
}
