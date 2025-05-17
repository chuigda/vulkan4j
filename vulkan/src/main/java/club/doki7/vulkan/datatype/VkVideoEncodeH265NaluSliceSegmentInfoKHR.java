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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkVideoEncodeH265NaluSliceSegmentInfoKHR.html"><code>VkVideoEncodeH265NaluSliceSegmentInfoKHR</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkVideoEncodeH265NaluSliceSegmentInfoKHR {
///     VkStructureType sType;
///     void const* pNext; // optional
///     int32_t constantQp;
///     StdVideoEncodeH265SliceSegmentHeader const* pStdSliceSegmentHeader;
/// } VkVideoEncodeH265NaluSliceSegmentInfoKHR;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_NALU_SLICE_SEGMENT_INFO_KHR`
///
/// The {@link VkVideoEncodeH265NaluSliceSegmentInfoKHR#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkVideoEncodeH265NaluSliceSegmentInfoKHR#autoInit} to initialize these fields manually for
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkVideoEncodeH265NaluSliceSegmentInfoKHR.html"><code>VkVideoEncodeH265NaluSliceSegmentInfoKHR</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkVideoEncodeH265NaluSliceSegmentInfoKHR(@NotNull MemorySegment segment) implements IPointer {
    public static VkVideoEncodeH265NaluSliceSegmentInfoKHR allocate(Arena arena) {
        VkVideoEncodeH265NaluSliceSegmentInfoKHR ret = new VkVideoEncodeH265NaluSliceSegmentInfoKHR(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.VIDEO_ENCODE_H265_NALU_SLICE_SEGMENT_INFO_KHR);
        return ret;
    }

    public static VkVideoEncodeH265NaluSliceSegmentInfoKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkVideoEncodeH265NaluSliceSegmentInfoKHR[] ret = new VkVideoEncodeH265NaluSliceSegmentInfoKHR[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkVideoEncodeH265NaluSliceSegmentInfoKHR(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.VIDEO_ENCODE_H265_NALU_SLICE_SEGMENT_INFO_KHR);
        }
        return ret;
    }

    public static VkVideoEncodeH265NaluSliceSegmentInfoKHR clone(Arena arena, VkVideoEncodeH265NaluSliceSegmentInfoKHR src) {
        VkVideoEncodeH265NaluSliceSegmentInfoKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkVideoEncodeH265NaluSliceSegmentInfoKHR[] clone(Arena arena, VkVideoEncodeH265NaluSliceSegmentInfoKHR[] src) {
        VkVideoEncodeH265NaluSliceSegmentInfoKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.VIDEO_ENCODE_H265_NALU_SLICE_SEGMENT_INFO_KHR);
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

    public int constantQp() {
        return segment.get(LAYOUT$constantQp, OFFSET$constantQp);
    }

    public void constantQp(int value) {
        segment.set(LAYOUT$constantQp, OFFSET$constantQp, value);
    }

    public @pointer(target=StdVideoEncodeH265SliceSegmentHeader.class) MemorySegment pStdSliceSegmentHeaderRaw() {
        return segment.get(LAYOUT$pStdSliceSegmentHeader, OFFSET$pStdSliceSegmentHeader);
    }

    public void pStdSliceSegmentHeaderRaw(@pointer(target=StdVideoEncodeH265SliceSegmentHeader.class) MemorySegment value) {
        segment.set(LAYOUT$pStdSliceSegmentHeader, OFFSET$pStdSliceSegmentHeader, value);
    }

    public @Nullable StdVideoEncodeH265SliceSegmentHeader pStdSliceSegmentHeader() {
        MemorySegment s = pStdSliceSegmentHeaderRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new StdVideoEncodeH265SliceSegmentHeader(s);
    }

    public void pStdSliceSegmentHeader(@Nullable StdVideoEncodeH265SliceSegmentHeader value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pStdSliceSegmentHeaderRaw(s);
    }

    @unsafe public @Nullable StdVideoEncodeH265SliceSegmentHeader[] pStdSliceSegmentHeader(int assumedCount) {
        MemorySegment s = pStdSliceSegmentHeaderRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * StdVideoEncodeH265SliceSegmentHeader.BYTES);
        StdVideoEncodeH265SliceSegmentHeader[] ret = new StdVideoEncodeH265SliceSegmentHeader[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new StdVideoEncodeH265SliceSegmentHeader(s.asSlice(i * StdVideoEncodeH265SliceSegmentHeader.BYTES, StdVideoEncodeH265SliceSegmentHeader.BYTES));
        }
        return ret;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("constantQp"),
        ValueLayout.ADDRESS.withTargetLayout(StdVideoEncodeH265SliceSegmentHeader.LAYOUT).withName("pStdSliceSegmentHeader")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$constantQp = PathElement.groupElement("PATH$constantQp");
    public static final PathElement PATH$pStdSliceSegmentHeader = PathElement.groupElement("PATH$pStdSliceSegmentHeader");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$constantQp = (OfInt) LAYOUT.select(PATH$constantQp);
    public static final AddressLayout LAYOUT$pStdSliceSegmentHeader = (AddressLayout) LAYOUT.select(PATH$pStdSliceSegmentHeader);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$constantQp = LAYOUT$constantQp.byteSize();
    public static final long SIZE$pStdSliceSegmentHeader = LAYOUT$pStdSliceSegmentHeader.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$constantQp = LAYOUT.byteOffset(PATH$constantQp);
    public static final long OFFSET$pStdSliceSegmentHeader = LAYOUT.byteOffset(PATH$pStdSliceSegmentHeader);
}
