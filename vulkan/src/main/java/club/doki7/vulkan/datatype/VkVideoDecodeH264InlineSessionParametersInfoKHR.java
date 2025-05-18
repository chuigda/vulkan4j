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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkVideoDecodeH264InlineSessionParametersInfoKHR.html"><code>VkVideoDecodeH264InlineSessionParametersInfoKHR</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkVideoDecodeH264InlineSessionParametersInfoKHR {
///     VkStructureType sType; // @link substring="VkStructureType" target="VkStructureType" @link substring="sType" target="#sType"
///     void const* pNext; // optional // @link substring="pNext" target="#pNext"
///     StdVideoH264SequenceParameterSet const* pStdSPS; // optional // @link substring="StdVideoH264SequenceParameterSet" target="StdVideoH264SequenceParameterSet" @link substring="pStdSPS" target="#pStdSPS"
///     StdVideoH264PictureParameterSet const* pStdPPS; // optional // @link substring="StdVideoH264PictureParameterSet" target="StdVideoH264PictureParameterSet" @link substring="pStdPPS" target="#pStdPPS"
/// } VkVideoDecodeH264InlineSessionParametersInfoKHR;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_VIDEO_DECODE_H264_INLINE_SESSION_PARAMETERS_INFO_KHR`
///
/// The {@code allocate} ({@link VkVideoDecodeH264InlineSessionParametersInfoKHR#allocate(Arena)}, {@link VkVideoDecodeH264InlineSessionParametersInfoKHR#allocate(Arena, int)})
/// functions will automatically initialize these fields. Also, you may call {@link VkVideoDecodeH264InlineSessionParametersInfoKHR#autoInit}
/// to initialize these fields manually for non-allocated instances.
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkVideoDecodeH264InlineSessionParametersInfoKHR.html"><code>VkVideoDecodeH264InlineSessionParametersInfoKHR</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkVideoDecodeH264InlineSessionParametersInfoKHR(@NotNull MemorySegment segment) implements IPointer {
    public static VkVideoDecodeH264InlineSessionParametersInfoKHR allocate(Arena arena) {
        VkVideoDecodeH264InlineSessionParametersInfoKHR ret = new VkVideoDecodeH264InlineSessionParametersInfoKHR(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.VIDEO_DECODE_H264_INLINE_SESSION_PARAMETERS_INFO_KHR);
        return ret;
    }

    public static VkVideoDecodeH264InlineSessionParametersInfoKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkVideoDecodeH264InlineSessionParametersInfoKHR[] ret = new VkVideoDecodeH264InlineSessionParametersInfoKHR[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkVideoDecodeH264InlineSessionParametersInfoKHR(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.VIDEO_DECODE_H264_INLINE_SESSION_PARAMETERS_INFO_KHR);
        }
        return ret;
    }

    public static VkVideoDecodeH264InlineSessionParametersInfoKHR clone(Arena arena, VkVideoDecodeH264InlineSessionParametersInfoKHR src) {
        VkVideoDecodeH264InlineSessionParametersInfoKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkVideoDecodeH264InlineSessionParametersInfoKHR[] clone(Arena arena, VkVideoDecodeH264InlineSessionParametersInfoKHR[] src) {
        VkVideoDecodeH264InlineSessionParametersInfoKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.VIDEO_DECODE_H264_INLINE_SESSION_PARAMETERS_INFO_KHR);
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

    public @Nullable StdVideoH264SequenceParameterSet pStdSPS() {
        MemorySegment s = pStdSPSRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new StdVideoH264SequenceParameterSet(s);
    }

    public void pStdSPS(@Nullable StdVideoH264SequenceParameterSet value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pStdSPSRaw(s);
    }

    @unsafe public @Nullable StdVideoH264SequenceParameterSet[] pStdSPS(int assumedCount) {
        MemorySegment s = pStdSPSRaw();
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

    public @pointer(target=StdVideoH264SequenceParameterSet.class) MemorySegment pStdSPSRaw() {
        return segment.get(LAYOUT$pStdSPS, OFFSET$pStdSPS);
    }

    public void pStdSPSRaw(@pointer(target=StdVideoH264SequenceParameterSet.class) MemorySegment value) {
        segment.set(LAYOUT$pStdSPS, OFFSET$pStdSPS, value);
    }

    public @Nullable StdVideoH264PictureParameterSet pStdPPS() {
        MemorySegment s = pStdPPSRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new StdVideoH264PictureParameterSet(s);
    }

    public void pStdPPS(@Nullable StdVideoH264PictureParameterSet value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pStdPPSRaw(s);
    }

    @unsafe public @Nullable StdVideoH264PictureParameterSet[] pStdPPS(int assumedCount) {
        MemorySegment s = pStdPPSRaw();
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

    public @pointer(target=StdVideoH264PictureParameterSet.class) MemorySegment pStdPPSRaw() {
        return segment.get(LAYOUT$pStdPPS, OFFSET$pStdPPS);
    }

    public void pStdPPSRaw(@pointer(target=StdVideoH264PictureParameterSet.class) MemorySegment value) {
        segment.set(LAYOUT$pStdPPS, OFFSET$pStdPPS, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withTargetLayout(StdVideoH264SequenceParameterSet.LAYOUT).withName("pStdSPS"),
        ValueLayout.ADDRESS.withTargetLayout(StdVideoH264PictureParameterSet.LAYOUT).withName("pStdPPS")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$pStdSPS = PathElement.groupElement("PATH$pStdSPS");
    public static final PathElement PATH$pStdPPS = PathElement.groupElement("PATH$pStdPPS");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final AddressLayout LAYOUT$pStdSPS = (AddressLayout) LAYOUT.select(PATH$pStdSPS);
    public static final AddressLayout LAYOUT$pStdPPS = (AddressLayout) LAYOUT.select(PATH$pStdPPS);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$pStdSPS = LAYOUT$pStdSPS.byteSize();
    public static final long SIZE$pStdPPS = LAYOUT$pStdPPS.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$pStdSPS = LAYOUT.byteOffset(PATH$pStdSPS);
    public static final long OFFSET$pStdPPS = LAYOUT.byteOffset(PATH$pStdPPS);
}
