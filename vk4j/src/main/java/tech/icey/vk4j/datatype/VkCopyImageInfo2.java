package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import org.jetbrains.annotations.Nullable;
import tech.icey.panama.IPointer;
import tech.icey.panama.NativeLayout;
import tech.icey.panama.annotation.*;
import tech.icey.panama.buffer.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

/// {@snippet lang=c :
/// typedef struct VkCopyImageInfo2 {
///     VkStructureType sType;
///     const void* pNext;
///     VkImage srcImage;
///     VkImageLayout srcImageLayout;
///     VkImage dstImage;
///     VkImageLayout dstImageLayout;
///     uint32_t regionCount;
///     const VkImageCopy2* pRegions;
/// } VkCopyImageInfo2;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkCopyImageInfo2.html">VkCopyImageInfo2</a>
public record VkCopyImageInfo2(MemorySegment segment) implements IPointer {
    public VkCopyImageInfo2(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_COPY_IMAGE_INFO_2);
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

    public void pNext(@Nullable IPointer pointer) {
        pNext(pointer == null ? MemorySegment.NULL : pointer.segment());
    }

    public @Nullable VkImage srcImage() {
        MemorySegment s = segment.get(LAYOUT$srcImage, OFFSET$srcImage);
        if (s.address() == 0) {
            return null;
        }
        return new VkImage(s);
    }

    public void srcImage(@Nullable VkImage value) {
        segment.set(
            LAYOUT$srcImage,
            OFFSET$srcImage,
            value != null ? value.segment() : MemorySegment.NULL
        );
    }

    public @enumtype(VkImageLayout.class) int srcImageLayout() {
        return segment.get(LAYOUT$srcImageLayout, OFFSET$srcImageLayout);
    }

    public void srcImageLayout(@enumtype(VkImageLayout.class) int value) {
        segment.set(LAYOUT$srcImageLayout, OFFSET$srcImageLayout, value);
    }

    public @Nullable VkImage dstImage() {
        MemorySegment s = segment.get(LAYOUT$dstImage, OFFSET$dstImage);
        if (s.address() == 0) {
            return null;
        }
        return new VkImage(s);
    }

    public void dstImage(@Nullable VkImage value) {
        segment.set(
            LAYOUT$dstImage,
            OFFSET$dstImage,
            value != null ? value.segment() : MemorySegment.NULL
        );
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

    public @pointer(comment="VkImageCopy2*") MemorySegment pRegionsRaw() {
        return segment.get(LAYOUT$pRegions, OFFSET$pRegions);
    }

    public void pRegionsRaw(@pointer(comment="VkImageCopy2*") MemorySegment value) {
        segment.set(LAYOUT$pRegions, OFFSET$pRegions, value);
    }

    public @Nullable VkImageCopy2 pRegions() {
        MemorySegment s = pRegionsRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkImageCopy2(s);
    }

    /// Note: this function is {@link unsafe} because it's up to user to provide the correct count of elements.
    @unsafe
    public @Nullable VkImageCopy2[] pRegions(int assumedCount) {
        MemorySegment s = pRegionsRaw().reinterpret(assumedCount * VkImageCopy2.SIZE);
        VkImageCopy2[] arr = new VkImageCopy2[assumedCount];
        for (int i = 0; i < assumedCount; i++) {
            arr[i] = new VkImageCopy2(s.asSlice(i * VkImageCopy2.SIZE, VkImageCopy2.SIZE));
        }
        return arr;
    }

    public void pRegions(@Nullable VkImageCopy2 value) {
        pRegionsRaw(value == null ? MemorySegment.NULL : value.segment());
    }

    public static VkCopyImageInfo2 allocate(Arena arena) {
        return new VkCopyImageInfo2(arena.allocate(LAYOUT));
    }

    public static VkCopyImageInfo2[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkCopyImageInfo2[] ret = new VkCopyImageInfo2[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkCopyImageInfo2(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkCopyImageInfo2 clone(Arena arena, VkCopyImageInfo2 src) {
        VkCopyImageInfo2 ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkCopyImageInfo2[] clone(Arena arena, VkCopyImageInfo2[] src) {
        VkCopyImageInfo2[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("srcImage"),
        ValueLayout.JAVA_INT.withName("srcImageLayout"),
        ValueLayout.ADDRESS.withName("dstImage"),
        ValueLayout.JAVA_INT.withName("dstImageLayout"),
        ValueLayout.JAVA_INT.withName("regionCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkImageCopy2.LAYOUT).withName("pRegions")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$srcImage = PathElement.groupElement("srcImage");
    public static final PathElement PATH$srcImageLayout = PathElement.groupElement("srcImageLayout");
    public static final PathElement PATH$dstImage = PathElement.groupElement("dstImage");
    public static final PathElement PATH$dstImageLayout = PathElement.groupElement("dstImageLayout");
    public static final PathElement PATH$regionCount = PathElement.groupElement("regionCount");
    public static final PathElement PATH$pRegions = PathElement.groupElement("pRegions");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final AddressLayout LAYOUT$srcImage = (AddressLayout) LAYOUT.select(PATH$srcImage);
    public static final OfInt LAYOUT$srcImageLayout = (OfInt) LAYOUT.select(PATH$srcImageLayout);
    public static final AddressLayout LAYOUT$dstImage = (AddressLayout) LAYOUT.select(PATH$dstImage);
    public static final OfInt LAYOUT$dstImageLayout = (OfInt) LAYOUT.select(PATH$dstImageLayout);
    public static final OfInt LAYOUT$regionCount = (OfInt) LAYOUT.select(PATH$regionCount);
    public static final AddressLayout LAYOUT$pRegions = (AddressLayout) LAYOUT.select(PATH$pRegions);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$srcImage = LAYOUT.byteOffset(PATH$srcImage);
    public static final long OFFSET$srcImageLayout = LAYOUT.byteOffset(PATH$srcImageLayout);
    public static final long OFFSET$dstImage = LAYOUT.byteOffset(PATH$dstImage);
    public static final long OFFSET$dstImageLayout = LAYOUT.byteOffset(PATH$dstImageLayout);
    public static final long OFFSET$regionCount = LAYOUT.byteOffset(PATH$regionCount);
    public static final long OFFSET$pRegions = LAYOUT.byteOffset(PATH$pRegions);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$srcImage = LAYOUT$srcImage.byteSize();
    public static final long SIZE$srcImageLayout = LAYOUT$srcImageLayout.byteSize();
    public static final long SIZE$dstImage = LAYOUT$dstImage.byteSize();
    public static final long SIZE$dstImageLayout = LAYOUT$dstImageLayout.byteSize();
    public static final long SIZE$regionCount = LAYOUT$regionCount.byteSize();
    public static final long SIZE$pRegions = LAYOUT$pRegions.byteSize();
}
