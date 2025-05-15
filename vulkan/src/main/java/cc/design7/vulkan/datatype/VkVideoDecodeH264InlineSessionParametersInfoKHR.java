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

/// Represents a pointer to a {@code VkVideoDecodeH264InlineSessionParametersInfoKHR} structure in native memory.
///
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to)
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkVideoDecodeH264InlineSessionParametersInfoKHR.html">VkVideoDecodeH264InlineSessionParametersInfoKHR</a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkVideoDecodeH264InlineSessionParametersInfoKHR(@NotNull MemorySegment segment) implements IPointer {
    public VkVideoDecodeH264InlineSessionParametersInfoKHR {
        sType(VkStructureType.VIDEO_DECODE_H264_INLINE_SESSION_PARAMETERS_INFO_KHR);
    }

    public static VkVideoDecodeH264InlineSessionParametersInfoKHR allocate(Arena arena) {
        return new VkVideoDecodeH264InlineSessionParametersInfoKHR(arena.allocate(LAYOUT));
    }

    public static VkVideoDecodeH264InlineSessionParametersInfoKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkVideoDecodeH264InlineSessionParametersInfoKHR[] ret = new VkVideoDecodeH264InlineSessionParametersInfoKHR[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkVideoDecodeH264InlineSessionParametersInfoKHR(segment.asSlice(i * SIZE, SIZE));
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

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withTargetLayout(StdVideoH264SequenceParameterSet.LAYOUT).withName("pStdSPS"),
        ValueLayout.ADDRESS.withTargetLayout(StdVideoH264PictureParameterSet.LAYOUT).withName("pStdPPS")
    );
    public static final long SIZE = LAYOUT.byteSize();

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

    public @pointer(comment="StdVideoH264SequenceParameterSet*") MemorySegment pStdSPSRaw() {
        return segment.get(LAYOUT$pStdSPS, OFFSET$pStdSPS);
    }

    public void pStdSPSRaw(@pointer(comment="StdVideoH264SequenceParameterSet*") MemorySegment value) {
        segment.set(LAYOUT$pStdSPS, OFFSET$pStdSPS, value);
    }

    public @Nullable StdVideoH264SequenceParameterSet pStdSPS() {
        MemorySegment s = pStdSPSRaw();
        if (s.address() == 0) {
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
        if (s.address() == 0) {
            return null;
        }

        s = s.reinterpret(assumedCount * StdVideoH264SequenceParameterSet.SIZE);
        StdVideoH264SequenceParameterSet[] ret = new StdVideoH264SequenceParameterSet[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new StdVideoH264SequenceParameterSet(s.asSlice(i * StdVideoH264SequenceParameterSet.SIZE, StdVideoH264SequenceParameterSet.SIZE));
        }
        return ret;
    }

    public @pointer(comment="StdVideoH264PictureParameterSet*") MemorySegment pStdPPSRaw() {
        return segment.get(LAYOUT$pStdPPS, OFFSET$pStdPPS);
    }

    public void pStdPPSRaw(@pointer(comment="StdVideoH264PictureParameterSet*") MemorySegment value) {
        segment.set(LAYOUT$pStdPPS, OFFSET$pStdPPS, value);
    }

    public @Nullable StdVideoH264PictureParameterSet pStdPPS() {
        MemorySegment s = pStdPPSRaw();
        if (s.address() == 0) {
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
        if (s.address() == 0) {
            return null;
        }

        s = s.reinterpret(assumedCount * StdVideoH264PictureParameterSet.SIZE);
        StdVideoH264PictureParameterSet[] ret = new StdVideoH264PictureParameterSet[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new StdVideoH264PictureParameterSet(s.asSlice(i * StdVideoH264PictureParameterSet.SIZE, StdVideoH264PictureParameterSet.SIZE));
        }
        return ret;
    }

}
