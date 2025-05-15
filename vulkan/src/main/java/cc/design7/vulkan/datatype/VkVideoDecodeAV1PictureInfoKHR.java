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

public record VkVideoDecodeAV1PictureInfoKHR(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final AddressLayout LAYOUT$pStdPictureInfo = ValueLayout.ADDRESS.withTargetLayout(StdVideoDecodeAV1PictureInfo.LAYOUT).withName("pStdPictureInfo");
    public static final OfInt LAYOUT$referenceNameSlotIndices = ValueLayout.JAVA_INT.withName("referenceNameSlotIndices");
    public static final OfInt LAYOUT$frameHeaderOffset = ValueLayout.JAVA_INT.withName("frameHeaderOffset");
    public static final OfInt LAYOUT$tileCount = ValueLayout.JAVA_INT.withName("tileCount");
    public static final AddressLayout LAYOUT$pTileOffsets = ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT).withName("pTileOffsets");
    public static final AddressLayout LAYOUT$pTileSizes = ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT).withName("pTileSizes");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$pStdPictureInfo, LAYOUT$referenceNameSlotIndices, LAYOUT$frameHeaderOffset, LAYOUT$tileCount, LAYOUT$pTileOffsets, LAYOUT$pTileSizes);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkVideoDecodeAV1PictureInfoKHR allocate(Arena arena) {
        return new VkVideoDecodeAV1PictureInfoKHR(arena.allocate(LAYOUT));
    }

    public static VkVideoDecodeAV1PictureInfoKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkVideoDecodeAV1PictureInfoKHR[] ret = new VkVideoDecodeAV1PictureInfoKHR[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkVideoDecodeAV1PictureInfoKHR(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkVideoDecodeAV1PictureInfoKHR clone(Arena arena, VkVideoDecodeAV1PictureInfoKHR src) {
        VkVideoDecodeAV1PictureInfoKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkVideoDecodeAV1PictureInfoKHR[] clone(Arena arena, VkVideoDecodeAV1PictureInfoKHR[] src) {
        VkVideoDecodeAV1PictureInfoKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$pStdPictureInfo = PathElement.groupElement("PATH$pStdPictureInfo");
    public static final PathElement PATH$referenceNameSlotIndices = PathElement.groupElement("PATH$referenceNameSlotIndices");
    public static final PathElement PATH$frameHeaderOffset = PathElement.groupElement("PATH$frameHeaderOffset");
    public static final PathElement PATH$tileCount = PathElement.groupElement("PATH$tileCount");
    public static final PathElement PATH$pTileOffsets = PathElement.groupElement("PATH$pTileOffsets");
    public static final PathElement PATH$pTileSizes = PathElement.groupElement("PATH$pTileSizes");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$pStdPictureInfo = LAYOUT$pStdPictureInfo.byteSize();
    public static final long SIZE$referenceNameSlotIndices = LAYOUT$referenceNameSlotIndices.byteSize();
    public static final long SIZE$frameHeaderOffset = LAYOUT$frameHeaderOffset.byteSize();
    public static final long SIZE$tileCount = LAYOUT$tileCount.byteSize();
    public static final long SIZE$pTileOffsets = LAYOUT$pTileOffsets.byteSize();
    public static final long SIZE$pTileSizes = LAYOUT$pTileSizes.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$pStdPictureInfo = LAYOUT.byteOffset(PATH$pStdPictureInfo);
    public static final long OFFSET$referenceNameSlotIndices = LAYOUT.byteOffset(PATH$referenceNameSlotIndices);
    public static final long OFFSET$frameHeaderOffset = LAYOUT.byteOffset(PATH$frameHeaderOffset);
    public static final long OFFSET$tileCount = LAYOUT.byteOffset(PATH$tileCount);
    public static final long OFFSET$pTileOffsets = LAYOUT.byteOffset(PATH$pTileOffsets);
    public static final long OFFSET$pTileSizes = LAYOUT.byteOffset(PATH$pTileSizes);

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

    public @pointer(comment="StdVideoDecodeAV1PictureInfo*") MemorySegment pStdPictureInfoRaw() {
        return segment.get(LAYOUT$pStdPictureInfo, OFFSET$pStdPictureInfo);
    }

    public void pStdPictureInfoRaw(@pointer(comment="StdVideoDecodeAV1PictureInfo*") MemorySegment value) {
        segment.set(LAYOUT$pStdPictureInfo, OFFSET$pStdPictureInfo, value);
    }

    public @Nullable StdVideoDecodeAV1PictureInfo pStdPictureInfo() {
        MemorySegment s = pStdPictureInfoRaw();
        if (s.address() == 0) {
            return null;
        }
        return new StdVideoDecodeAV1PictureInfo(s);
    }

    public void pStdPictureInfo(@Nullable StdVideoDecodeAV1PictureInfo value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pStdPictureInfoRaw(s);
    }

    @unsafe public @Nullable StdVideoDecodeAV1PictureInfo[] pStdPictureInfo(int assumedCount) {
        MemorySegment s = pStdPictureInfoRaw();
        if (s.address() == 0) {
            return null;
        }

        s = s.reinterpret(assumedCount * StdVideoDecodeAV1PictureInfo.SIZE);
        StdVideoDecodeAV1PictureInfo[] ret = new StdVideoDecodeAV1PictureInfo[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new StdVideoDecodeAV1PictureInfo(s.asSlice(i * StdVideoDecodeAV1PictureInfo.SIZE, StdVideoDecodeAV1PictureInfo.SIZE));
        }
        return ret;
    }

    public int referenceNameSlotIndices() {
        return segment.get(LAYOUT$referenceNameSlotIndices, OFFSET$referenceNameSlotIndices);
    }

    public void referenceNameSlotIndices(int value) {
        segment.set(LAYOUT$referenceNameSlotIndices, OFFSET$referenceNameSlotIndices, value);
    }

    public @unsigned int frameHeaderOffset() {
        return segment.get(LAYOUT$frameHeaderOffset, OFFSET$frameHeaderOffset);
    }

    public void frameHeaderOffset(@unsigned int value) {
        segment.set(LAYOUT$frameHeaderOffset, OFFSET$frameHeaderOffset, value);
    }

    public @unsigned int tileCount() {
        return segment.get(LAYOUT$tileCount, OFFSET$tileCount);
    }

    public void tileCount(@unsigned int value) {
        segment.set(LAYOUT$tileCount, OFFSET$tileCount, value);
    }

    public @pointer(comment="int*") MemorySegment pTileOffsetsRaw() {
        return segment.get(LAYOUT$pTileOffsets, OFFSET$pTileOffsets);
    }

    public void pTileOffsetsRaw(@pointer(comment="int*") MemorySegment value) {
        segment.set(LAYOUT$pTileOffsets, OFFSET$pTileOffsets, value);
    }

    /// Note: the returned {@link IntPtr} does not have correct
    /// {@link IntPtr#size} property. It's up to user to track the size of the buffer,
    /// and use {@link IntPtr#reinterpret} to set the size before actually reading from or
    /// writing to the buffer.
    public @Nullable @unsigned IntPtr pTileOffsets() {
        MemorySegment s = pTileOffsetsRaw();
        if (s.address() == 0) {
            return null;
        }
        return new IntPtr(s);
    }

    public void pTileOffsets(@Nullable @unsigned IntPtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pTileOffsetsRaw(s);
    }

    public @pointer(comment="int*") MemorySegment pTileSizesRaw() {
        return segment.get(LAYOUT$pTileSizes, OFFSET$pTileSizes);
    }

    public void pTileSizesRaw(@pointer(comment="int*") MemorySegment value) {
        segment.set(LAYOUT$pTileSizes, OFFSET$pTileSizes, value);
    }

    /// Note: the returned {@link IntPtr} does not have correct
    /// {@link IntPtr#size} property. It's up to user to track the size of the buffer,
    /// and use {@link IntPtr#reinterpret} to set the size before actually reading from or
    /// writing to the buffer.
    public @Nullable @unsigned IntPtr pTileSizes() {
        MemorySegment s = pTileSizesRaw();
        if (s.address() == 0) {
            return null;
        }
        return new IntPtr(s);
    }

    public void pTileSizes(@Nullable @unsigned IntPtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pTileSizesRaw(s);
    }

}
/// dummy, not implemented yet
