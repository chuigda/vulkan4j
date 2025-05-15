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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkVideoDecodeH265InlineSessionParametersInfoKHR.html"><code>VkVideoDecodeH265InlineSessionParametersInfoKHR</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkVideoDecodeH265InlineSessionParametersInfoKHR {
///     VkStructureType sType;
///     void const* pNext; // optional
///     StdVideoH265VideoParameterSet const* pStdVPS; // optional
///     StdVideoH265SequenceParameterSet const* pStdSPS; // optional
///     StdVideoH265PictureParameterSet const* pStdPPS; // optional
/// } VkVideoDecodeH265InlineSessionParametersInfoKHR;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_VIDEO_DECODE_H265_INLINE_SESSION_PARAMETERS_INFO_KHR`
///
/// The {@link VkVideoDecodeH265InlineSessionParametersInfoKHR#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkVideoDecodeH265InlineSessionParametersInfoKHR#autoInit} to initialize these fields manually for
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkVideoDecodeH265InlineSessionParametersInfoKHR.html"><code>VkVideoDecodeH265InlineSessionParametersInfoKHR</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkVideoDecodeH265InlineSessionParametersInfoKHR(@NotNull MemorySegment segment) implements IPointer {
    public static VkVideoDecodeH265InlineSessionParametersInfoKHR allocate(Arena arena) {
        VkVideoDecodeH265InlineSessionParametersInfoKHR ret = new VkVideoDecodeH265InlineSessionParametersInfoKHR(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.VIDEO_DECODE_H265_INLINE_SESSION_PARAMETERS_INFO_KHR);
        return ret;
    }

    public static VkVideoDecodeH265InlineSessionParametersInfoKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkVideoDecodeH265InlineSessionParametersInfoKHR[] ret = new VkVideoDecodeH265InlineSessionParametersInfoKHR[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkVideoDecodeH265InlineSessionParametersInfoKHR(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.VIDEO_DECODE_H265_INLINE_SESSION_PARAMETERS_INFO_KHR);
        }
        return ret;
    }

    public static VkVideoDecodeH265InlineSessionParametersInfoKHR clone(Arena arena, VkVideoDecodeH265InlineSessionParametersInfoKHR src) {
        VkVideoDecodeH265InlineSessionParametersInfoKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkVideoDecodeH265InlineSessionParametersInfoKHR[] clone(Arena arena, VkVideoDecodeH265InlineSessionParametersInfoKHR[] src) {
        VkVideoDecodeH265InlineSessionParametersInfoKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.VIDEO_DECODE_H265_INLINE_SESSION_PARAMETERS_INFO_KHR);
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

    public @pointer(comment="StdVideoH265VideoParameterSet*") MemorySegment pStdVPSRaw() {
        return segment.get(LAYOUT$pStdVPS, OFFSET$pStdVPS);
    }

    public void pStdVPSRaw(@pointer(comment="StdVideoH265VideoParameterSet*") MemorySegment value) {
        segment.set(LAYOUT$pStdVPS, OFFSET$pStdVPS, value);
    }

    public @Nullable StdVideoH265VideoParameterSet pStdVPS() {
        MemorySegment s = pStdVPSRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new StdVideoH265VideoParameterSet(s);
    }

    public void pStdVPS(@Nullable StdVideoH265VideoParameterSet value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pStdVPSRaw(s);
    }

    @unsafe public @Nullable StdVideoH265VideoParameterSet[] pStdVPS(int assumedCount) {
        MemorySegment s = pStdVPSRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * StdVideoH265VideoParameterSet.SIZE);
        StdVideoH265VideoParameterSet[] ret = new StdVideoH265VideoParameterSet[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new StdVideoH265VideoParameterSet(s.asSlice(i * StdVideoH265VideoParameterSet.SIZE, StdVideoH265VideoParameterSet.SIZE));
        }
        return ret;
    }

    public @pointer(comment="StdVideoH265SequenceParameterSet*") MemorySegment pStdSPSRaw() {
        return segment.get(LAYOUT$pStdSPS, OFFSET$pStdSPS);
    }

    public void pStdSPSRaw(@pointer(comment="StdVideoH265SequenceParameterSet*") MemorySegment value) {
        segment.set(LAYOUT$pStdSPS, OFFSET$pStdSPS, value);
    }

    public @Nullable StdVideoH265SequenceParameterSet pStdSPS() {
        MemorySegment s = pStdSPSRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new StdVideoH265SequenceParameterSet(s);
    }

    public void pStdSPS(@Nullable StdVideoH265SequenceParameterSet value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pStdSPSRaw(s);
    }

    @unsafe public @Nullable StdVideoH265SequenceParameterSet[] pStdSPS(int assumedCount) {
        MemorySegment s = pStdSPSRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * StdVideoH265SequenceParameterSet.SIZE);
        StdVideoH265SequenceParameterSet[] ret = new StdVideoH265SequenceParameterSet[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new StdVideoH265SequenceParameterSet(s.asSlice(i * StdVideoH265SequenceParameterSet.SIZE, StdVideoH265SequenceParameterSet.SIZE));
        }
        return ret;
    }

    public @pointer(comment="StdVideoH265PictureParameterSet*") MemorySegment pStdPPSRaw() {
        return segment.get(LAYOUT$pStdPPS, OFFSET$pStdPPS);
    }

    public void pStdPPSRaw(@pointer(comment="StdVideoH265PictureParameterSet*") MemorySegment value) {
        segment.set(LAYOUT$pStdPPS, OFFSET$pStdPPS, value);
    }

    public @Nullable StdVideoH265PictureParameterSet pStdPPS() {
        MemorySegment s = pStdPPSRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new StdVideoH265PictureParameterSet(s);
    }

    public void pStdPPS(@Nullable StdVideoH265PictureParameterSet value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pStdPPSRaw(s);
    }

    @unsafe public @Nullable StdVideoH265PictureParameterSet[] pStdPPS(int assumedCount) {
        MemorySegment s = pStdPPSRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * StdVideoH265PictureParameterSet.SIZE);
        StdVideoH265PictureParameterSet[] ret = new StdVideoH265PictureParameterSet[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new StdVideoH265PictureParameterSet(s.asSlice(i * StdVideoH265PictureParameterSet.SIZE, StdVideoH265PictureParameterSet.SIZE));
        }
        return ret;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withTargetLayout(StdVideoH265VideoParameterSet.LAYOUT).withName("pStdVPS"),
        ValueLayout.ADDRESS.withTargetLayout(StdVideoH265SequenceParameterSet.LAYOUT).withName("pStdSPS"),
        ValueLayout.ADDRESS.withTargetLayout(StdVideoH265PictureParameterSet.LAYOUT).withName("pStdPPS")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$pStdVPS = PathElement.groupElement("PATH$pStdVPS");
    public static final PathElement PATH$pStdSPS = PathElement.groupElement("PATH$pStdSPS");
    public static final PathElement PATH$pStdPPS = PathElement.groupElement("PATH$pStdPPS");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final AddressLayout LAYOUT$pStdVPS = (AddressLayout) LAYOUT.select(PATH$pStdVPS);
    public static final AddressLayout LAYOUT$pStdSPS = (AddressLayout) LAYOUT.select(PATH$pStdSPS);
    public static final AddressLayout LAYOUT$pStdPPS = (AddressLayout) LAYOUT.select(PATH$pStdPPS);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$pStdVPS = LAYOUT$pStdVPS.byteSize();
    public static final long SIZE$pStdSPS = LAYOUT$pStdSPS.byteSize();
    public static final long SIZE$pStdPPS = LAYOUT$pStdPPS.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$pStdVPS = LAYOUT.byteOffset(PATH$pStdVPS);
    public static final long OFFSET$pStdSPS = LAYOUT.byteOffset(PATH$pStdSPS);
    public static final long OFFSET$pStdPPS = LAYOUT.byteOffset(PATH$pStdPPS);
}
