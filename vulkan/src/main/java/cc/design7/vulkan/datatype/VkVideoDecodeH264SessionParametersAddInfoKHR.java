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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkVideoDecodeH264SessionParametersAddInfoKHR.html"><code>VkVideoDecodeH264SessionParametersAddInfoKHR</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkVideoDecodeH264SessionParametersAddInfoKHR {
///     VkStructureType sType;
///     void const* pNext; // optional
///     uint32_t stdSPSCount; // optional
///     StdVideoH264SequenceParameterSet const* pStdSPSs;
///     uint32_t stdPPSCount; // optional
///     StdVideoH264PictureParameterSet const* pStdPPSs;
/// } VkVideoDecodeH264SessionParametersAddInfoKHR;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_VIDEO_DECODE_H264_SESSION_PARAMETERS_ADD_INFO_KHR`
///
/// The {@link VkVideoDecodeH264SessionParametersAddInfoKHR#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkVideoDecodeH264SessionParametersAddInfoKHR#autoInit} to initialize these fields manually for
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkVideoDecodeH264SessionParametersAddInfoKHR.html"><code>VkVideoDecodeH264SessionParametersAddInfoKHR</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkVideoDecodeH264SessionParametersAddInfoKHR(@NotNull MemorySegment segment) implements IPointer {
    public static VkVideoDecodeH264SessionParametersAddInfoKHR allocate(Arena arena) {
        VkVideoDecodeH264SessionParametersAddInfoKHR ret = new VkVideoDecodeH264SessionParametersAddInfoKHR(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.VIDEO_DECODE_H264_SESSION_PARAMETERS_ADD_INFO_KHR);
        return ret;
    }

    public static VkVideoDecodeH264SessionParametersAddInfoKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkVideoDecodeH264SessionParametersAddInfoKHR[] ret = new VkVideoDecodeH264SessionParametersAddInfoKHR[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkVideoDecodeH264SessionParametersAddInfoKHR(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.VIDEO_DECODE_H264_SESSION_PARAMETERS_ADD_INFO_KHR);
        }
        return ret;
    }

    public static VkVideoDecodeH264SessionParametersAddInfoKHR clone(Arena arena, VkVideoDecodeH264SessionParametersAddInfoKHR src) {
        VkVideoDecodeH264SessionParametersAddInfoKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkVideoDecodeH264SessionParametersAddInfoKHR[] clone(Arena arena, VkVideoDecodeH264SessionParametersAddInfoKHR[] src) {
        VkVideoDecodeH264SessionParametersAddInfoKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.VIDEO_DECODE_H264_SESSION_PARAMETERS_ADD_INFO_KHR);
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

    public @unsigned int stdSPSCount() {
        return segment.get(LAYOUT$stdSPSCount, OFFSET$stdSPSCount);
    }

    public void stdSPSCount(@unsigned int value) {
        segment.set(LAYOUT$stdSPSCount, OFFSET$stdSPSCount, value);
    }

    public @pointer(comment="StdVideoH264SequenceParameterSet*") MemorySegment pStdSPSsRaw() {
        return segment.get(LAYOUT$pStdSPSs, OFFSET$pStdSPSs);
    }

    public void pStdSPSsRaw(@pointer(comment="StdVideoH264SequenceParameterSet*") MemorySegment value) {
        segment.set(LAYOUT$pStdSPSs, OFFSET$pStdSPSs, value);
    }

    public @Nullable StdVideoH264SequenceParameterSet pStdSPSs() {
        MemorySegment s = pStdSPSsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new StdVideoH264SequenceParameterSet(s);
    }

    public void pStdSPSs(@Nullable StdVideoH264SequenceParameterSet value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pStdSPSsRaw(s);
    }

    @unsafe public @Nullable StdVideoH264SequenceParameterSet[] pStdSPSs(int assumedCount) {
        MemorySegment s = pStdSPSsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * StdVideoH264SequenceParameterSet.BYTES);
        StdVideoH264SequenceParameterSet[] ret = new StdVideoH264SequenceParameterSet[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new StdVideoH264SequenceParameterSet(s.asSlice(i * StdVideoH264SequenceParameterSet.BYTES, StdVideoH264SequenceParameterSet.BYTES));
        }
        return ret;
    }

    public @unsigned int stdPPSCount() {
        return segment.get(LAYOUT$stdPPSCount, OFFSET$stdPPSCount);
    }

    public void stdPPSCount(@unsigned int value) {
        segment.set(LAYOUT$stdPPSCount, OFFSET$stdPPSCount, value);
    }

    public @pointer(comment="StdVideoH264PictureParameterSet*") MemorySegment pStdPPSsRaw() {
        return segment.get(LAYOUT$pStdPPSs, OFFSET$pStdPPSs);
    }

    public void pStdPPSsRaw(@pointer(comment="StdVideoH264PictureParameterSet*") MemorySegment value) {
        segment.set(LAYOUT$pStdPPSs, OFFSET$pStdPPSs, value);
    }

    public @Nullable StdVideoH264PictureParameterSet pStdPPSs() {
        MemorySegment s = pStdPPSsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new StdVideoH264PictureParameterSet(s);
    }

    public void pStdPPSs(@Nullable StdVideoH264PictureParameterSet value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pStdPPSsRaw(s);
    }

    @unsafe public @Nullable StdVideoH264PictureParameterSet[] pStdPPSs(int assumedCount) {
        MemorySegment s = pStdPPSsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * StdVideoH264PictureParameterSet.BYTES);
        StdVideoH264PictureParameterSet[] ret = new StdVideoH264PictureParameterSet[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new StdVideoH264PictureParameterSet(s.asSlice(i * StdVideoH264PictureParameterSet.BYTES, StdVideoH264PictureParameterSet.BYTES));
        }
        return ret;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("stdSPSCount"),
        ValueLayout.ADDRESS.withTargetLayout(StdVideoH264SequenceParameterSet.LAYOUT).withName("pStdSPSs"),
        ValueLayout.JAVA_INT.withName("stdPPSCount"),
        ValueLayout.ADDRESS.withTargetLayout(StdVideoH264PictureParameterSet.LAYOUT).withName("pStdPPSs")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$stdSPSCount = PathElement.groupElement("PATH$stdSPSCount");
    public static final PathElement PATH$pStdSPSs = PathElement.groupElement("PATH$pStdSPSs");
    public static final PathElement PATH$stdPPSCount = PathElement.groupElement("PATH$stdPPSCount");
    public static final PathElement PATH$pStdPPSs = PathElement.groupElement("PATH$pStdPPSs");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$stdSPSCount = (OfInt) LAYOUT.select(PATH$stdSPSCount);
    public static final AddressLayout LAYOUT$pStdSPSs = (AddressLayout) LAYOUT.select(PATH$pStdSPSs);
    public static final OfInt LAYOUT$stdPPSCount = (OfInt) LAYOUT.select(PATH$stdPPSCount);
    public static final AddressLayout LAYOUT$pStdPPSs = (AddressLayout) LAYOUT.select(PATH$pStdPPSs);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$stdSPSCount = LAYOUT$stdSPSCount.byteSize();
    public static final long SIZE$pStdSPSs = LAYOUT$pStdSPSs.byteSize();
    public static final long SIZE$stdPPSCount = LAYOUT$stdPPSCount.byteSize();
    public static final long SIZE$pStdPPSs = LAYOUT$pStdPPSs.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$stdSPSCount = LAYOUT.byteOffset(PATH$stdSPSCount);
    public static final long OFFSET$pStdSPSs = LAYOUT.byteOffset(PATH$pStdSPSs);
    public static final long OFFSET$stdPPSCount = LAYOUT.byteOffset(PATH$stdPPSCount);
    public static final long OFFSET$pStdPPSs = LAYOUT.byteOffset(PATH$pStdPPSs);
}
