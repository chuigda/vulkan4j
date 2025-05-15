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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkVideoEncodeH265PictureInfoKHR.html"><code>VkVideoEncodeH265PictureInfoKHR</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkVideoEncodeH265PictureInfoKHR {
///     VkStructureType sType;
///     void const* pNext; // optional
///     uint32_t naluSliceSegmentEntryCount;
///     VkVideoEncodeH265NaluSliceSegmentInfoKHR const* pNaluSliceSegmentEntries;
///     StdVideoEncodeH265PictureInfo const* pStdPictureInfo;
/// } VkVideoEncodeH265PictureInfoKHR;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_PICTURE_INFO_KHR`
///
/// The {@link VkVideoEncodeH265PictureInfoKHR#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkVideoEncodeH265PictureInfoKHR#autoInit} to initialize these fields manually for
/// non-allocated instances.
///
/// ## Contracts
///
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to)
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkVideoEncodeH265PictureInfoKHR.html"><code>VkVideoEncodeH265PictureInfoKHR</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkVideoEncodeH265PictureInfoKHR(@NotNull MemorySegment segment) implements IPointer {
    public static VkVideoEncodeH265PictureInfoKHR allocate(Arena arena) {
        VkVideoEncodeH265PictureInfoKHR ret = new VkVideoEncodeH265PictureInfoKHR(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.VIDEO_ENCODE_H265_PICTURE_INFO_KHR);
        return ret;
    }

    public static VkVideoEncodeH265PictureInfoKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkVideoEncodeH265PictureInfoKHR[] ret = new VkVideoEncodeH265PictureInfoKHR[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkVideoEncodeH265PictureInfoKHR(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.VIDEO_ENCODE_H265_PICTURE_INFO_KHR);
        }
        return ret;
    }

    public static VkVideoEncodeH265PictureInfoKHR clone(Arena arena, VkVideoEncodeH265PictureInfoKHR src) {
        VkVideoEncodeH265PictureInfoKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkVideoEncodeH265PictureInfoKHR[] clone(Arena arena, VkVideoEncodeH265PictureInfoKHR[] src) {
        VkVideoEncodeH265PictureInfoKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.VIDEO_ENCODE_H265_PICTURE_INFO_KHR);
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

    public void pNext(IPointer pointer) {
        pNext(pointer.segment());
    }

    public @unsigned int naluSliceSegmentEntryCount() {
        return segment.get(LAYOUT$naluSliceSegmentEntryCount, OFFSET$naluSliceSegmentEntryCount);
    }

    public void naluSliceSegmentEntryCount(@unsigned int value) {
        segment.set(LAYOUT$naluSliceSegmentEntryCount, OFFSET$naluSliceSegmentEntryCount, value);
    }

    public @pointer(comment="VkVideoEncodeH265NaluSliceSegmentInfoKHR*") MemorySegment pNaluSliceSegmentEntriesRaw() {
        return segment.get(LAYOUT$pNaluSliceSegmentEntries, OFFSET$pNaluSliceSegmentEntries);
    }

    public void pNaluSliceSegmentEntriesRaw(@pointer(comment="VkVideoEncodeH265NaluSliceSegmentInfoKHR*") MemorySegment value) {
        segment.set(LAYOUT$pNaluSliceSegmentEntries, OFFSET$pNaluSliceSegmentEntries, value);
    }

    public @Nullable VkVideoEncodeH265NaluSliceSegmentInfoKHR pNaluSliceSegmentEntries() {
        MemorySegment s = pNaluSliceSegmentEntriesRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkVideoEncodeH265NaluSliceSegmentInfoKHR(s);
    }

    public void pNaluSliceSegmentEntries(@Nullable VkVideoEncodeH265NaluSliceSegmentInfoKHR value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pNaluSliceSegmentEntriesRaw(s);
    }

    @unsafe public @Nullable VkVideoEncodeH265NaluSliceSegmentInfoKHR[] pNaluSliceSegmentEntries(int assumedCount) {
        MemorySegment s = pNaluSliceSegmentEntriesRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkVideoEncodeH265NaluSliceSegmentInfoKHR.BYTES);
        VkVideoEncodeH265NaluSliceSegmentInfoKHR[] ret = new VkVideoEncodeH265NaluSliceSegmentInfoKHR[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkVideoEncodeH265NaluSliceSegmentInfoKHR(s.asSlice(i * VkVideoEncodeH265NaluSliceSegmentInfoKHR.BYTES, VkVideoEncodeH265NaluSliceSegmentInfoKHR.BYTES));
        }
        return ret;
    }

    public @pointer(comment="StdVideoEncodeH265PictureInfo*") MemorySegment pStdPictureInfoRaw() {
        return segment.get(LAYOUT$pStdPictureInfo, OFFSET$pStdPictureInfo);
    }

    public void pStdPictureInfoRaw(@pointer(comment="StdVideoEncodeH265PictureInfo*") MemorySegment value) {
        segment.set(LAYOUT$pStdPictureInfo, OFFSET$pStdPictureInfo, value);
    }

    public @Nullable StdVideoEncodeH265PictureInfo pStdPictureInfo() {
        MemorySegment s = pStdPictureInfoRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new StdVideoEncodeH265PictureInfo(s);
    }

    public void pStdPictureInfo(@Nullable StdVideoEncodeH265PictureInfo value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pStdPictureInfoRaw(s);
    }

    @unsafe public @Nullable StdVideoEncodeH265PictureInfo[] pStdPictureInfo(int assumedCount) {
        MemorySegment s = pStdPictureInfoRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * StdVideoEncodeH265PictureInfo.BYTES);
        StdVideoEncodeH265PictureInfo[] ret = new StdVideoEncodeH265PictureInfo[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new StdVideoEncodeH265PictureInfo(s.asSlice(i * StdVideoEncodeH265PictureInfo.BYTES, StdVideoEncodeH265PictureInfo.BYTES));
        }
        return ret;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("naluSliceSegmentEntryCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkVideoEncodeH265NaluSliceSegmentInfoKHR.LAYOUT).withName("pNaluSliceSegmentEntries"),
        ValueLayout.ADDRESS.withTargetLayout(StdVideoEncodeH265PictureInfo.LAYOUT).withName("pStdPictureInfo")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$naluSliceSegmentEntryCount = PathElement.groupElement("PATH$naluSliceSegmentEntryCount");
    public static final PathElement PATH$pNaluSliceSegmentEntries = PathElement.groupElement("PATH$pNaluSliceSegmentEntries");
    public static final PathElement PATH$pStdPictureInfo = PathElement.groupElement("PATH$pStdPictureInfo");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$naluSliceSegmentEntryCount = (OfInt) LAYOUT.select(PATH$naluSliceSegmentEntryCount);
    public static final AddressLayout LAYOUT$pNaluSliceSegmentEntries = (AddressLayout) LAYOUT.select(PATH$pNaluSliceSegmentEntries);
    public static final AddressLayout LAYOUT$pStdPictureInfo = (AddressLayout) LAYOUT.select(PATH$pStdPictureInfo);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$naluSliceSegmentEntryCount = LAYOUT$naluSliceSegmentEntryCount.byteSize();
    public static final long SIZE$pNaluSliceSegmentEntries = LAYOUT$pNaluSliceSegmentEntries.byteSize();
    public static final long SIZE$pStdPictureInfo = LAYOUT$pStdPictureInfo.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$naluSliceSegmentEntryCount = LAYOUT.byteOffset(PATH$naluSliceSegmentEntryCount);
    public static final long OFFSET$pNaluSliceSegmentEntries = LAYOUT.byteOffset(PATH$pNaluSliceSegmentEntries);
    public static final long OFFSET$pStdPictureInfo = LAYOUT.byteOffset(PATH$pStdPictureInfo);
}
