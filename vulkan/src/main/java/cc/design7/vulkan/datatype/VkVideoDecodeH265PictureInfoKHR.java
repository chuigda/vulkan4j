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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkVideoDecodeH265PictureInfoKHR.html"><code>VkVideoDecodeH265PictureInfoKHR</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkVideoDecodeH265PictureInfoKHR {
///     VkStructureType sType;
///     void const* pNext; // optional
///     StdVideoDecodeH265PictureInfo const* pStdPictureInfo;
///     uint32_t sliceSegmentCount;
///     uint32_t const* pSliceSegmentOffsets;
/// } VkVideoDecodeH265PictureInfoKHR;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_VIDEO_DECODE_H265_PICTURE_INFO_KHR`
///
/// The {@link VkVideoDecodeH265PictureInfoKHR#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkVideoDecodeH265PictureInfoKHR#autoInit} to initialize these fields manually for
/// non-allocated instances.
///
/// ## Contracts
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to)
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkVideoDecodeH265PictureInfoKHR.html"><code>VkVideoDecodeH265PictureInfoKHR</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkVideoDecodeH265PictureInfoKHR(@NotNull MemorySegment segment) implements IPointer {
    public static VkVideoDecodeH265PictureInfoKHR allocate(Arena arena) {
        VkVideoDecodeH265PictureInfoKHR ret = new VkVideoDecodeH265PictureInfoKHR(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.VIDEO_DECODE_H265_PICTURE_INFO_KHR);
        return ret;
    }

    public static VkVideoDecodeH265PictureInfoKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkVideoDecodeH265PictureInfoKHR[] ret = new VkVideoDecodeH265PictureInfoKHR[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkVideoDecodeH265PictureInfoKHR(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.VIDEO_DECODE_H265_PICTURE_INFO_KHR);
        }
        return ret;
    }

    public static VkVideoDecodeH265PictureInfoKHR clone(Arena arena, VkVideoDecodeH265PictureInfoKHR src) {
        VkVideoDecodeH265PictureInfoKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkVideoDecodeH265PictureInfoKHR[] clone(Arena arena, VkVideoDecodeH265PictureInfoKHR[] src) {
        VkVideoDecodeH265PictureInfoKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.VIDEO_DECODE_H265_PICTURE_INFO_KHR);
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

    public @pointer(comment="StdVideoDecodeH265PictureInfo*") MemorySegment pStdPictureInfoRaw() {
        return segment.get(LAYOUT$pStdPictureInfo, OFFSET$pStdPictureInfo);
    }

    public void pStdPictureInfoRaw(@pointer(comment="StdVideoDecodeH265PictureInfo*") MemorySegment value) {
        segment.set(LAYOUT$pStdPictureInfo, OFFSET$pStdPictureInfo, value);
    }

    public @Nullable StdVideoDecodeH265PictureInfo pStdPictureInfo() {
        MemorySegment s = pStdPictureInfoRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new StdVideoDecodeH265PictureInfo(s);
    }

    public void pStdPictureInfo(@Nullable StdVideoDecodeH265PictureInfo value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pStdPictureInfoRaw(s);
    }

    @unsafe public @Nullable StdVideoDecodeH265PictureInfo[] pStdPictureInfo(int assumedCount) {
        MemorySegment s = pStdPictureInfoRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * StdVideoDecodeH265PictureInfo.SIZE);
        StdVideoDecodeH265PictureInfo[] ret = new StdVideoDecodeH265PictureInfo[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new StdVideoDecodeH265PictureInfo(s.asSlice(i * StdVideoDecodeH265PictureInfo.SIZE, StdVideoDecodeH265PictureInfo.SIZE));
        }
        return ret;
    }

    public @unsigned int sliceSegmentCount() {
        return segment.get(LAYOUT$sliceSegmentCount, OFFSET$sliceSegmentCount);
    }

    public void sliceSegmentCount(@unsigned int value) {
        segment.set(LAYOUT$sliceSegmentCount, OFFSET$sliceSegmentCount, value);
    }

    public @pointer(comment="int*") MemorySegment pSliceSegmentOffsetsRaw() {
        return segment.get(LAYOUT$pSliceSegmentOffsets, OFFSET$pSliceSegmentOffsets);
    }

    public void pSliceSegmentOffsetsRaw(@pointer(comment="int*") MemorySegment value) {
        segment.set(LAYOUT$pSliceSegmentOffsets, OFFSET$pSliceSegmentOffsets, value);
    }

    /// Note: the returned {@link IntPtr} does not have correct
    /// {@link IntPtr#size} property. It's up to user to track the size of the buffer,
    /// and use {@link IntPtr#reinterpret} to set the size before actually reading from or
    /// writing to the buffer.
    public @Nullable @unsigned IntPtr pSliceSegmentOffsets() {
        MemorySegment s = pSliceSegmentOffsetsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new IntPtr(s);
    }

    public void pSliceSegmentOffsets(@Nullable @unsigned IntPtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pSliceSegmentOffsetsRaw(s);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withTargetLayout(StdVideoDecodeH265PictureInfo.LAYOUT).withName("pStdPictureInfo"),
        ValueLayout.JAVA_INT.withName("sliceSegmentCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT).withName("pSliceSegmentOffsets")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$pStdPictureInfo = PathElement.groupElement("PATH$pStdPictureInfo");
    public static final PathElement PATH$sliceSegmentCount = PathElement.groupElement("PATH$sliceSegmentCount");
    public static final PathElement PATH$pSliceSegmentOffsets = PathElement.groupElement("PATH$pSliceSegmentOffsets");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final AddressLayout LAYOUT$pStdPictureInfo = (AddressLayout) LAYOUT.select(PATH$pStdPictureInfo);
    public static final OfInt LAYOUT$sliceSegmentCount = (OfInt) LAYOUT.select(PATH$sliceSegmentCount);
    public static final AddressLayout LAYOUT$pSliceSegmentOffsets = (AddressLayout) LAYOUT.select(PATH$pSliceSegmentOffsets);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$pStdPictureInfo = LAYOUT$pStdPictureInfo.byteSize();
    public static final long SIZE$sliceSegmentCount = LAYOUT$sliceSegmentCount.byteSize();
    public static final long SIZE$pSliceSegmentOffsets = LAYOUT$pSliceSegmentOffsets.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$pStdPictureInfo = LAYOUT.byteOffset(PATH$pStdPictureInfo);
    public static final long OFFSET$sliceSegmentCount = LAYOUT.byteOffset(PATH$sliceSegmentCount);
    public static final long OFFSET$pSliceSegmentOffsets = LAYOUT.byteOffset(PATH$pSliceSegmentOffsets);
}
