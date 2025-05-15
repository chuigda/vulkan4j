package cc.design7.vulkan.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import cc.design7.ffm.IPointer;
import cc.design7.ffm.NativeLayout;
import cc.design7.ffm.annotation.*;
import cc.design7.ffm.ptr.*;
import cc.design7.vulkan.bitmask.*;
import cc.design7.vulkan.datatype.*;
import cc.design7.vulkan.enumtype.*;
import static cc.design7.vulkan.VkConstants.*;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkCopyImageInfo2.html">VkCopyImageInfo2</a>
@ValueBasedCandidate
public record VkCopyImageInfo2(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final AddressLayout LAYOUT$srcImage = ValueLayout.ADDRESS.withName("srcImage");
    public static final OfInt LAYOUT$srcImageLayout = ValueLayout.JAVA_INT.withName("srcImageLayout");
    public static final AddressLayout LAYOUT$dstImage = ValueLayout.ADDRESS.withName("dstImage");
    public static final OfInt LAYOUT$dstImageLayout = ValueLayout.JAVA_INT.withName("dstImageLayout");
    public static final OfInt LAYOUT$regionCount = ValueLayout.JAVA_INT.withName("regionCount");
    public static final AddressLayout LAYOUT$pRegions = ValueLayout.ADDRESS.withTargetLayout(VkImageCopy2.LAYOUT).withName("pRegions");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$srcImage, LAYOUT$srcImageLayout, LAYOUT$dstImage, LAYOUT$dstImageLayout, LAYOUT$regionCount, LAYOUT$pRegions);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkCopyImageInfo2 allocate(Arena arena) {
        return new VkCopyImageInfo2(arena.allocate(LAYOUT));
    }

    public static VkCopyImageInfo2[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkCopyImageInfo2[] ret = new VkCopyImageInfo2[count];
        for (int i = 0; i < count; i ++) {
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
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$srcImage = PathElement.groupElement("PATH$srcImage");
    public static final PathElement PATH$srcImageLayout = PathElement.groupElement("PATH$srcImageLayout");
    public static final PathElement PATH$dstImage = PathElement.groupElement("PATH$dstImage");
    public static final PathElement PATH$dstImageLayout = PathElement.groupElement("PATH$dstImageLayout");
    public static final PathElement PATH$regionCount = PathElement.groupElement("PATH$regionCount");
    public static final PathElement PATH$pRegions = PathElement.groupElement("PATH$pRegions");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$srcImage = LAYOUT$srcImage.byteSize();
    public static final long SIZE$srcImageLayout = LAYOUT$srcImageLayout.byteSize();
    public static final long SIZE$dstImage = LAYOUT$dstImage.byteSize();
    public static final long SIZE$dstImageLayout = LAYOUT$dstImageLayout.byteSize();
    public static final long SIZE$regionCount = LAYOUT$regionCount.byteSize();
    public static final long SIZE$pRegions = LAYOUT$pRegions.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$srcImage = LAYOUT.byteOffset(PATH$srcImage);
    public static final long OFFSET$srcImageLayout = LAYOUT.byteOffset(PATH$srcImageLayout);
    public static final long OFFSET$dstImage = LAYOUT.byteOffset(PATH$dstImage);
    public static final long OFFSET$dstImageLayout = LAYOUT.byteOffset(PATH$dstImageLayout);
    public static final long OFFSET$regionCount = LAYOUT.byteOffset(PATH$regionCount);
    public static final long OFFSET$pRegions = LAYOUT.byteOffset(PATH$pRegions);

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

    public void pNext(IPointer pointer) {
        pNext(pointer.segment());
    }

    public @Nullable VkImage srcImage() {
        MemorySegment s = segment.asSlice(OFFSET$srcImage, SIZE$srcImage);
        if (s.address() == 0) {
            return null;
        }
        return new VkImage(s);
    }

    public void srcImage(@Nullable VkImage value) {
        segment.set(LAYOUT$srcImage, OFFSET$srcImage, value != null ? value.segment() : MemorySegment.NULL);
    }

    public @enumtype(VkImageLayout.class) int srcImageLayout() {
        return segment.get(LAYOUT$srcImageLayout, OFFSET$srcImageLayout);
    }

    public void srcImageLayout(@enumtype(VkImageLayout.class) int value) {
        segment.set(LAYOUT$srcImageLayout, OFFSET$srcImageLayout, value);
    }

    public @Nullable VkImage dstImage() {
        MemorySegment s = segment.asSlice(OFFSET$dstImage, SIZE$dstImage);
        if (s.address() == 0) {
            return null;
        }
        return new VkImage(s);
    }

    public void dstImage(@Nullable VkImage value) {
        segment.set(LAYOUT$dstImage, OFFSET$dstImage, value != null ? value.segment() : MemorySegment.NULL);
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

    public void pRegions(@Nullable VkImageCopy2 value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pRegionsRaw(s);
    }

    @unsafe public @Nullable VkImageCopy2[] pRegions(int assumedCount) {
        MemorySegment s = pRegionsRaw();
        if (s.address() == 0) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkImageCopy2.SIZE);
        VkImageCopy2[] ret = new VkImageCopy2[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkImageCopy2(s.asSlice(i * VkImageCopy2.SIZE, VkImageCopy2.SIZE));
        }
        return ret;
    }

}
