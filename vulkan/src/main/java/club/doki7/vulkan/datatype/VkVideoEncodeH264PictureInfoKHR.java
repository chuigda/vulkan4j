package club.doki7.vulkan.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import club.doki7.ffm.IPointer;
import club.doki7.ffm.NativeLayout;
import club.doki7.ffm.annotation.*;
import club.doki7.ffm.ptr.*;
import club.doki7.vulkan.bitmask.*;
import club.doki7.vulkan.handle.*;
import club.doki7.vulkan.enumtype.*;
import static club.doki7.vulkan.VkConstants.*;

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkVideoEncodeH264PictureInfoKHR.html"><code>VkVideoEncodeH264PictureInfoKHR</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkVideoEncodeH264PictureInfoKHR {
///     VkStructureType sType;
///     void const* pNext; // optional
///     uint32_t naluSliceEntryCount;
///     VkVideoEncodeH264NaluSliceInfoKHR const* pNaluSliceEntries;
///     StdVideoEncodeH264PictureInfo const* pStdPictureInfo;
///     VkBool32 generatePrefixNalu;
/// } VkVideoEncodeH264PictureInfoKHR;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_VIDEO_ENCODE_H264_PICTURE_INFO_KHR`
///
/// The {@link VkVideoEncodeH264PictureInfoKHR#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkVideoEncodeH264PictureInfoKHR#autoInit} to initialize these fields manually for
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkVideoEncodeH264PictureInfoKHR.html"><code>VkVideoEncodeH264PictureInfoKHR</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkVideoEncodeH264PictureInfoKHR(@NotNull MemorySegment segment) implements IPointer {
    public static VkVideoEncodeH264PictureInfoKHR allocate(Arena arena) {
        VkVideoEncodeH264PictureInfoKHR ret = new VkVideoEncodeH264PictureInfoKHR(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.VIDEO_ENCODE_H264_PICTURE_INFO_KHR);
        return ret;
    }

    public static VkVideoEncodeH264PictureInfoKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkVideoEncodeH264PictureInfoKHR[] ret = new VkVideoEncodeH264PictureInfoKHR[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkVideoEncodeH264PictureInfoKHR(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.VIDEO_ENCODE_H264_PICTURE_INFO_KHR);
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

    public void autoInit() {
        sType(VkStructureType.VIDEO_ENCODE_H264_PICTURE_INFO_KHR);
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
        pNext(pointer != null ? pointer.segment() : MemorySegment.NULL);
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
        if (s.equals(MemorySegment.NULL)) {
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
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkVideoEncodeH264NaluSliceInfoKHR.BYTES);
        VkVideoEncodeH264NaluSliceInfoKHR[] ret = new VkVideoEncodeH264NaluSliceInfoKHR[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkVideoEncodeH264NaluSliceInfoKHR(s.asSlice(i * VkVideoEncodeH264NaluSliceInfoKHR.BYTES, VkVideoEncodeH264NaluSliceInfoKHR.BYTES));
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
        if (s.equals(MemorySegment.NULL)) {
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
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * StdVideoEncodeH264PictureInfo.BYTES);
        StdVideoEncodeH264PictureInfo[] ret = new StdVideoEncodeH264PictureInfo[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new StdVideoEncodeH264PictureInfo(s.asSlice(i * StdVideoEncodeH264PictureInfo.BYTES, StdVideoEncodeH264PictureInfo.BYTES));
        }
        return ret;
    }

    public @unsigned int generatePrefixNalu() {
        return segment.get(LAYOUT$generatePrefixNalu, OFFSET$generatePrefixNalu);
    }

    public void generatePrefixNalu(@unsigned int value) {
        segment.set(LAYOUT$generatePrefixNalu, OFFSET$generatePrefixNalu, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("naluSliceEntryCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkVideoEncodeH264NaluSliceInfoKHR.LAYOUT).withName("pNaluSliceEntries"),
        ValueLayout.ADDRESS.withTargetLayout(StdVideoEncodeH264PictureInfo.LAYOUT).withName("pStdPictureInfo"),
        ValueLayout.JAVA_INT.withName("generatePrefixNalu")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$naluSliceEntryCount = PathElement.groupElement("PATH$naluSliceEntryCount");
    public static final PathElement PATH$pNaluSliceEntries = PathElement.groupElement("PATH$pNaluSliceEntries");
    public static final PathElement PATH$pStdPictureInfo = PathElement.groupElement("PATH$pStdPictureInfo");
    public static final PathElement PATH$generatePrefixNalu = PathElement.groupElement("PATH$generatePrefixNalu");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$naluSliceEntryCount = (OfInt) LAYOUT.select(PATH$naluSliceEntryCount);
    public static final AddressLayout LAYOUT$pNaluSliceEntries = (AddressLayout) LAYOUT.select(PATH$pNaluSliceEntries);
    public static final AddressLayout LAYOUT$pStdPictureInfo = (AddressLayout) LAYOUT.select(PATH$pStdPictureInfo);
    public static final OfInt LAYOUT$generatePrefixNalu = (OfInt) LAYOUT.select(PATH$generatePrefixNalu);

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
}
