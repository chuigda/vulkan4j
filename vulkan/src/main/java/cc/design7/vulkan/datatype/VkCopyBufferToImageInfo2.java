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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkCopyBufferToImageInfo2.html">VkCopyBufferToImageInfo2</a>
@ValueBasedCandidate
public record VkCopyBufferToImageInfo2(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final AddressLayout LAYOUT$srcBuffer = ValueLayout.ADDRESS.withName("srcBuffer");
    public static final AddressLayout LAYOUT$dstImage = ValueLayout.ADDRESS.withName("dstImage");
    public static final OfInt LAYOUT$dstImageLayout = ValueLayout.JAVA_INT.withName("dstImageLayout");
    public static final OfInt LAYOUT$regionCount = ValueLayout.JAVA_INT.withName("regionCount");
    public static final AddressLayout LAYOUT$pRegions = ValueLayout.ADDRESS.withTargetLayout(VkBufferImageCopy2.LAYOUT).withName("pRegions");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$srcBuffer, LAYOUT$dstImage, LAYOUT$dstImageLayout, LAYOUT$regionCount, LAYOUT$pRegions);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkCopyBufferToImageInfo2 allocate(Arena arena) {
        return new VkCopyBufferToImageInfo2(arena.allocate(LAYOUT));
    }

    public static VkCopyBufferToImageInfo2[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkCopyBufferToImageInfo2[] ret = new VkCopyBufferToImageInfo2[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkCopyBufferToImageInfo2(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkCopyBufferToImageInfo2 clone(Arena arena, VkCopyBufferToImageInfo2 src) {
        VkCopyBufferToImageInfo2 ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkCopyBufferToImageInfo2[] clone(Arena arena, VkCopyBufferToImageInfo2[] src) {
        VkCopyBufferToImageInfo2[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$srcBuffer = PathElement.groupElement("PATH$srcBuffer");
    public static final PathElement PATH$dstImage = PathElement.groupElement("PATH$dstImage");
    public static final PathElement PATH$dstImageLayout = PathElement.groupElement("PATH$dstImageLayout");
    public static final PathElement PATH$regionCount = PathElement.groupElement("PATH$regionCount");
    public static final PathElement PATH$pRegions = PathElement.groupElement("PATH$pRegions");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$srcBuffer = LAYOUT$srcBuffer.byteSize();
    public static final long SIZE$dstImage = LAYOUT$dstImage.byteSize();
    public static final long SIZE$dstImageLayout = LAYOUT$dstImageLayout.byteSize();
    public static final long SIZE$regionCount = LAYOUT$regionCount.byteSize();
    public static final long SIZE$pRegions = LAYOUT$pRegions.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$srcBuffer = LAYOUT.byteOffset(PATH$srcBuffer);
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

    public @Nullable VkBuffer srcBuffer() {
        MemorySegment s = segment.asSlice(OFFSET$srcBuffer, SIZE$srcBuffer);
        if (s.address() == 0) {
            return null;
        }
        return new VkBuffer(s);
    }

    public void srcBuffer() {
        segment.set(LAYOUT$srcBuffer, OFFSET$srcBuffer, value != null ? value.segment() : MemorySegment.NULL);
    }

    public @Nullable VkImage dstImage() {
        MemorySegment s = segment.asSlice(OFFSET$dstImage, SIZE$dstImage);
        if (s.address() == 0) {
            return null;
        }
        return new VkImage(s);
    }

    public void dstImage() {
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

    public @pointer(comment="VkBufferImageCopy2*") MemorySegment pRegionsRaw() {
        return segment.get(LAYOUT$pRegions, OFFSET$pRegions);
    }

    public void pRegionsRaw(@pointer(comment="VkBufferImageCopy2*") MemorySegment value) {
        segment.set(LAYOUT$pRegions, OFFSET$pRegions, value);
    }

    public @Nullable VkBufferImageCopy2 pRegions() {
        MemorySegment s = pRegionsRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkBufferImageCopy2(s);
    }

    public void pRegions(@Nullable VkBufferImageCopy2 value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pRegionsRaw(s);
    }

    @unsafe public @Nullable VkBufferImageCopy2[] pRegions(int assumedCount) {
        MemorySegment s = pRegionsRaw();
        if (s.address() == 0) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkBufferImageCopy2.SIZE);
        VkBufferImageCopy2[] ret = new VkBufferImageCopy2[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkBufferImageCopy2(s.asSlice(i * VkBufferImageCopy2.SIZE, VkBufferImageCopy2.SIZE));
        }
        return ret;
    }

}
