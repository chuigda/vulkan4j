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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkVideoDecodeH264PictureInfoKHR.html">VkVideoDecodeH264PictureInfoKHR</a>
@ValueBasedCandidate
public record VkVideoDecodeH264PictureInfoKHR(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final AddressLayout LAYOUT$pStdPictureInfo = ValueLayout.ADDRESS.withTargetLayout(StdVideoDecodeH264PictureInfo.LAYOUT).withName("pStdPictureInfo");
    public static final OfInt LAYOUT$sliceCount = ValueLayout.JAVA_INT.withName("sliceCount");
    public static final AddressLayout LAYOUT$pSliceOffsets = ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT).withName("pSliceOffsets");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$pStdPictureInfo, LAYOUT$sliceCount, LAYOUT$pSliceOffsets);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkVideoDecodeH264PictureInfoKHR allocate(Arena arena) {
        return new VkVideoDecodeH264PictureInfoKHR(arena.allocate(LAYOUT));
    }

    public static VkVideoDecodeH264PictureInfoKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkVideoDecodeH264PictureInfoKHR[] ret = new VkVideoDecodeH264PictureInfoKHR[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkVideoDecodeH264PictureInfoKHR(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkVideoDecodeH264PictureInfoKHR clone(Arena arena, VkVideoDecodeH264PictureInfoKHR src) {
        VkVideoDecodeH264PictureInfoKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkVideoDecodeH264PictureInfoKHR[] clone(Arena arena, VkVideoDecodeH264PictureInfoKHR[] src) {
        VkVideoDecodeH264PictureInfoKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$pStdPictureInfo = PathElement.groupElement("PATH$pStdPictureInfo");
    public static final PathElement PATH$sliceCount = PathElement.groupElement("PATH$sliceCount");
    public static final PathElement PATH$pSliceOffsets = PathElement.groupElement("PATH$pSliceOffsets");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$pStdPictureInfo = LAYOUT$pStdPictureInfo.byteSize();
    public static final long SIZE$sliceCount = LAYOUT$sliceCount.byteSize();
    public static final long SIZE$pSliceOffsets = LAYOUT$pSliceOffsets.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$pStdPictureInfo = LAYOUT.byteOffset(PATH$pStdPictureInfo);
    public static final long OFFSET$sliceCount = LAYOUT.byteOffset(PATH$sliceCount);
    public static final long OFFSET$pSliceOffsets = LAYOUT.byteOffset(PATH$pSliceOffsets);

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

    public @pointer(comment="StdVideoDecodeH264PictureInfo*") MemorySegment pStdPictureInfoRaw() {
        return segment.get(LAYOUT$pStdPictureInfo, OFFSET$pStdPictureInfo);
    }

    public void pStdPictureInfoRaw(@pointer(comment="StdVideoDecodeH264PictureInfo*") MemorySegment value) {
        segment.set(LAYOUT$pStdPictureInfo, OFFSET$pStdPictureInfo, value);
    }

    public @Nullable StdVideoDecodeH264PictureInfo pStdPictureInfo() {
        MemorySegment s = pStdPictureInfoRaw();
        if (s.address() == 0) {
            return null;
        }
        return new StdVideoDecodeH264PictureInfo(s);
    }

    public void pStdPictureInfo(@Nullable StdVideoDecodeH264PictureInfo value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pStdPictureInfoRaw(s);
    }

    @unsafe public @Nullable StdVideoDecodeH264PictureInfo[] pStdPictureInfo(int assumedCount) {
        MemorySegment s = pStdPictureInfoRaw();
        if (s.address() == 0) {
            return null;
        }

        s = s.reinterpret(assumedCount * StdVideoDecodeH264PictureInfo.SIZE);
        StdVideoDecodeH264PictureInfo[] ret = new StdVideoDecodeH264PictureInfo[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new StdVideoDecodeH264PictureInfo(s.asSlice(i * StdVideoDecodeH264PictureInfo.SIZE, StdVideoDecodeH264PictureInfo.SIZE));
        }
        return ret;
    }

    public @unsigned int sliceCount() {
        return segment.get(LAYOUT$sliceCount, OFFSET$sliceCount);
    }

    public void sliceCount(@unsigned int value) {
        segment.set(LAYOUT$sliceCount, OFFSET$sliceCount, value);
    }

    public @pointer(comment="int*") MemorySegment pSliceOffsetsRaw() {
        return segment.get(LAYOUT$pSliceOffsets, OFFSET$pSliceOffsets);
    }

    public void pSliceOffsetsRaw(@pointer(comment="int*") MemorySegment value) {
        segment.set(LAYOUT$pSliceOffsets, OFFSET$pSliceOffsets, value);
    }

    /// Note: the returned {@link IntPtr} does not have correct
    /// {@link IntPtr#size} property. It's up to user to track the size of the buffer,
    /// and use {@link IntPtr#reinterpret} to set the size before actually reading from or
    /// writing to the buffer.
    public @Nullable @unsigned IntPtr pSliceOffsets() {
        MemorySegment s = pSliceOffsetsRaw();
        if (s.address() == 0) {
            return null;
        }
        return new IntPtr(s);
    }

    public void pSliceOffsets(@Nullable @unsigned IntPtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pSliceOffsetsRaw(s);
    }

}
