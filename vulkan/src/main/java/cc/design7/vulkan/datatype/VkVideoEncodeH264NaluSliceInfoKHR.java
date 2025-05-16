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
import cc.design7.vulkan.handle.*;
import cc.design7.vulkan.enumtype.*;
import static cc.design7.vulkan.VkConstants.*;

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkVideoEncodeH264NaluSliceInfoKHR.html"><code>VkVideoEncodeH264NaluSliceInfoKHR</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkVideoEncodeH264NaluSliceInfoKHR {
///     VkStructureType sType;
///     void const* pNext; // optional
///     int32_t constantQp;
///     StdVideoEncodeH264SliceHeader const* pStdSliceHeader;
/// } VkVideoEncodeH264NaluSliceInfoKHR;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_VIDEO_ENCODE_H264_NALU_SLICE_INFO_KHR`
///
/// The {@link VkVideoEncodeH264NaluSliceInfoKHR#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkVideoEncodeH264NaluSliceInfoKHR#autoInit} to initialize these fields manually for
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkVideoEncodeH264NaluSliceInfoKHR.html"><code>VkVideoEncodeH264NaluSliceInfoKHR</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkVideoEncodeH264NaluSliceInfoKHR(@NotNull MemorySegment segment) implements IPointer {
    public static VkVideoEncodeH264NaluSliceInfoKHR allocate(Arena arena) {
        VkVideoEncodeH264NaluSliceInfoKHR ret = new VkVideoEncodeH264NaluSliceInfoKHR(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.VIDEO_ENCODE_H264_NALU_SLICE_INFO_KHR);
        return ret;
    }

    public static VkVideoEncodeH264NaluSliceInfoKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkVideoEncodeH264NaluSliceInfoKHR[] ret = new VkVideoEncodeH264NaluSliceInfoKHR[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkVideoEncodeH264NaluSliceInfoKHR(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.VIDEO_ENCODE_H264_NALU_SLICE_INFO_KHR);
        }
        return ret;
    }

    public static VkVideoEncodeH264NaluSliceInfoKHR clone(Arena arena, VkVideoEncodeH264NaluSliceInfoKHR src) {
        VkVideoEncodeH264NaluSliceInfoKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkVideoEncodeH264NaluSliceInfoKHR[] clone(Arena arena, VkVideoEncodeH264NaluSliceInfoKHR[] src) {
        VkVideoEncodeH264NaluSliceInfoKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.VIDEO_ENCODE_H264_NALU_SLICE_INFO_KHR);
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

    public @pointer(comment="StdVideoEncodeH264SliceHeader*") MemorySegment pStdSliceHeaderRaw() {
        return segment.get(LAYOUT$pStdSliceHeader, OFFSET$pStdSliceHeader);
    }

    public void pStdSliceHeaderRaw(@pointer(comment="StdVideoEncodeH264SliceHeader*") MemorySegment value) {
        segment.set(LAYOUT$pStdSliceHeader, OFFSET$pStdSliceHeader, value);
    }

    public @Nullable StdVideoEncodeH264SliceHeader pStdSliceHeader() {
        MemorySegment s = pStdSliceHeaderRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new StdVideoEncodeH264SliceHeader(s);
    }

    public void pStdSliceHeader(@Nullable StdVideoEncodeH264SliceHeader value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pStdSliceHeaderRaw(s);
    }

    @unsafe public @Nullable StdVideoEncodeH264SliceHeader[] pStdSliceHeader(int assumedCount) {
        MemorySegment s = pStdSliceHeaderRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * StdVideoEncodeH264SliceHeader.BYTES);
        StdVideoEncodeH264SliceHeader[] ret = new StdVideoEncodeH264SliceHeader[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new StdVideoEncodeH264SliceHeader(s.asSlice(i * StdVideoEncodeH264SliceHeader.BYTES, StdVideoEncodeH264SliceHeader.BYTES));
        }
        return ret;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("constantQp"),
        ValueLayout.ADDRESS.withTargetLayout(StdVideoEncodeH264SliceHeader.LAYOUT).withName("pStdSliceHeader")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$constantQp = PathElement.groupElement("PATH$constantQp");
    public static final PathElement PATH$pStdSliceHeader = PathElement.groupElement("PATH$pStdSliceHeader");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$constantQp = (OfInt) LAYOUT.select(PATH$constantQp);
    public static final AddressLayout LAYOUT$pStdSliceHeader = (AddressLayout) LAYOUT.select(PATH$pStdSliceHeader);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$constantQp = LAYOUT$constantQp.byteSize();
    public static final long SIZE$pStdSliceHeader = LAYOUT$pStdSliceHeader.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$constantQp = LAYOUT.byteOffset(PATH$constantQp);
    public static final long OFFSET$pStdSliceHeader = LAYOUT.byteOffset(PATH$pStdSliceHeader);
}
