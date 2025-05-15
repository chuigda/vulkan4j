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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkVideoEncodeH264PictureInfoKHR.html">VkVideoEncodeH264PictureInfoKHR</a>
@ValueBasedCandidate
public record VkVideoEncodeH264PictureInfoKHR(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$naluSliceEntryCount = ValueLayout.JAVA_INT.withName("naluSliceEntryCount");
    public static final AddressLayout LAYOUT$pNaluSliceEntries = ValueLayout.ADDRESS.withTargetLayout(VkVideoEncodeH264NaluSliceInfoKHR.LAYOUT).withName("pNaluSliceEntries");
    public static final AddressLayout LAYOUT$pStdPictureInfo = ValueLayout.ADDRESS.withTargetLayout(StdVideoEncodeH264PictureInfo.LAYOUT).withName("pStdPictureInfo");
    public static final OfInt LAYOUT$generatePrefixNalu = ValueLayout.JAVA_INT.withName("generatePrefixNalu");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$naluSliceEntryCount, LAYOUT$pNaluSliceEntries, LAYOUT$pStdPictureInfo, LAYOUT$generatePrefixNalu);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkVideoEncodeH264PictureInfoKHR allocate(Arena arena) {
        return new VkVideoEncodeH264PictureInfoKHR(arena.allocate(LAYOUT));
    }

    public static VkVideoEncodeH264PictureInfoKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkVideoEncodeH264PictureInfoKHR[] ret = new VkVideoEncodeH264PictureInfoKHR[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkVideoEncodeH264PictureInfoKHR(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkVideoEncodeH264PictureInfoKHR clone(Arena arena, VkVideoEncodeH264PictureInfoKHR src) {
        VkVideoEncodeH264PictureInfoKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkVideoEncodeH264PictureInfoKHR[] clone(Arena arena, VkVideoEncodeH264PictureInfoKHR[] src) {
        VkVideoEncodeH264PictureInfoKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$naluSliceEntryCount = PathElement.groupElement("PATH$naluSliceEntryCount");
    public static final PathElement PATH$pNaluSliceEntries = PathElement.groupElement("PATH$pNaluSliceEntries");
    public static final PathElement PATH$pStdPictureInfo = PathElement.groupElement("PATH$pStdPictureInfo");
    public static final PathElement PATH$generatePrefixNalu = PathElement.groupElement("PATH$generatePrefixNalu");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$naluSliceEntryCount = LAYOUT$naluSliceEntryCount.byteSize();
    public static final long SIZE$pNaluSliceEntries = LAYOUT$pNaluSliceEntries.byteSize();
    public static final long SIZE$pStdPictureInfo = LAYOUT$pStdPictureInfo.byteSize();
    public static final long SIZE$generatePrefixNalu = LAYOUT$generatePrefixNalu.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$naluSliceEntryCount = LAYOUT.byteOffset(PATH$naluSliceEntryCount);
    public static final long OFFSET$pNaluSliceEntries = LAYOUT.byteOffset(PATH$pNaluSliceEntries);
    public static final long OFFSET$pStdPictureInfo = LAYOUT.byteOffset(PATH$pStdPictureInfo);
    public static final long OFFSET$generatePrefixNalu = LAYOUT.byteOffset(PATH$generatePrefixNalu);

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

    public @unsigned int naluSliceEntryCount() {
        return segment.get(LAYOUT$naluSliceEntryCount, OFFSET$naluSliceEntryCount);
    }

    public void naluSliceEntryCount(@unsigned int value) {
        segment.set(LAYOUT$naluSliceEntryCount, OFFSET$naluSliceEntryCount, value);
    }

    public @pointer(comment="VkVideoEncodeH264NaluSliceInfoKHR*") MemorySegment pNaluSliceEntriesRaw() {
        return segment.get(LAYOUT$pNaluSliceEntries, OFFSET$pNaluSliceEntries);
    }

    public void pNaluSliceEntriesRaw(@pointer(comment="VkVideoEncodeH264NaluSliceInfoKHR*") MemorySegment value) {
        segment.set(LAYOUT$pNaluSliceEntries, OFFSET$pNaluSliceEntries, value);
    }

    public @Nullable VkVideoEncodeH264NaluSliceInfoKHR pNaluSliceEntries() {
        MemorySegment s = pNaluSliceEntriesRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkVideoEncodeH264NaluSliceInfoKHR(s);
    }

    public void pNaluSliceEntries(@Nullable VkVideoEncodeH264NaluSliceInfoKHR value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pNaluSliceEntriesRaw(s);
    }

    @unsafe public @Nullable VkVideoEncodeH264NaluSliceInfoKHR[] pNaluSliceEntries(int assumedCount) {
        MemorySegment s = pNaluSliceEntriesRaw();
        if (s.address() == 0) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkVideoEncodeH264NaluSliceInfoKHR.SIZE);
        VkVideoEncodeH264NaluSliceInfoKHR[] ret = new VkVideoEncodeH264NaluSliceInfoKHR[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkVideoEncodeH264NaluSliceInfoKHR(s.asSlice(i * VkVideoEncodeH264NaluSliceInfoKHR.SIZE, VkVideoEncodeH264NaluSliceInfoKHR.SIZE));
        }
        return ret;
    }

    public @pointer(comment="StdVideoEncodeH264PictureInfo*") MemorySegment pStdPictureInfoRaw() {
        return segment.get(LAYOUT$pStdPictureInfo, OFFSET$pStdPictureInfo);
    }

    public void pStdPictureInfoRaw(@pointer(comment="StdVideoEncodeH264PictureInfo*") MemorySegment value) {
        segment.set(LAYOUT$pStdPictureInfo, OFFSET$pStdPictureInfo, value);
    }

    public @Nullable StdVideoEncodeH264PictureInfo pStdPictureInfo() {
        MemorySegment s = pStdPictureInfoRaw();
        if (s.address() == 0) {
            return null;
        }
        return new StdVideoEncodeH264PictureInfo(s);
    }

    public void pStdPictureInfo(@Nullable StdVideoEncodeH264PictureInfo value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pStdPictureInfoRaw(s);
    }

    @unsafe public @Nullable StdVideoEncodeH264PictureInfo[] pStdPictureInfo(int assumedCount) {
        MemorySegment s = pStdPictureInfoRaw();
        if (s.address() == 0) {
            return null;
        }

        s = s.reinterpret(assumedCount * StdVideoEncodeH264PictureInfo.SIZE);
        StdVideoEncodeH264PictureInfo[] ret = new StdVideoEncodeH264PictureInfo[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new StdVideoEncodeH264PictureInfo(s.asSlice(i * StdVideoEncodeH264PictureInfo.SIZE, StdVideoEncodeH264PictureInfo.SIZE));
        }
        return ret;
    }

    public @unsigned int generatePrefixNalu() {
        return segment.get(LAYOUT$generatePrefixNalu, OFFSET$generatePrefixNalu);
    }

    public void generatePrefixNalu(@unsigned int value) {
        segment.set(LAYOUT$generatePrefixNalu, OFFSET$generatePrefixNalu, value);
    }

}
