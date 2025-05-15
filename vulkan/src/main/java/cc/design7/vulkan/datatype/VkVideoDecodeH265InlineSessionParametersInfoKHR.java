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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkVideoDecodeH265InlineSessionParametersInfoKHR.html">VkVideoDecodeH265InlineSessionParametersInfoKHR</a>
@ValueBasedCandidate
public record VkVideoDecodeH265InlineSessionParametersInfoKHR(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final AddressLayout LAYOUT$pStdVPS = ValueLayout.ADDRESS.withTargetLayout(StdVideoH265VideoParameterSet.LAYOUT).withName("pStdVPS");
    public static final AddressLayout LAYOUT$pStdSPS = ValueLayout.ADDRESS.withTargetLayout(StdVideoH265SequenceParameterSet.LAYOUT).withName("pStdSPS");
    public static final AddressLayout LAYOUT$pStdPPS = ValueLayout.ADDRESS.withTargetLayout(StdVideoH265PictureParameterSet.LAYOUT).withName("pStdPPS");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$pStdVPS, LAYOUT$pStdSPS, LAYOUT$pStdPPS);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkVideoDecodeH265InlineSessionParametersInfoKHR allocate(Arena arena) {
        return new VkVideoDecodeH265InlineSessionParametersInfoKHR(arena.allocate(LAYOUT));
    }

    public static VkVideoDecodeH265InlineSessionParametersInfoKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkVideoDecodeH265InlineSessionParametersInfoKHR[] ret = new VkVideoDecodeH265InlineSessionParametersInfoKHR[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkVideoDecodeH265InlineSessionParametersInfoKHR(segment.asSlice(i * SIZE, SIZE));
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

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$pStdVPS = PathElement.groupElement("PATH$pStdVPS");
    public static final PathElement PATH$pStdSPS = PathElement.groupElement("PATH$pStdSPS");
    public static final PathElement PATH$pStdPPS = PathElement.groupElement("PATH$pStdPPS");

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
        if (s.address() == 0) {
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
        if (s.address() == 0) {
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
        if (s.address() == 0) {
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
        if (s.address() == 0) {
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
        if (s.address() == 0) {
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
        if (s.address() == 0) {
            return null;
        }

        s = s.reinterpret(assumedCount * StdVideoH265PictureParameterSet.SIZE);
        StdVideoH265PictureParameterSet[] ret = new StdVideoH265PictureParameterSet[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new StdVideoH265PictureParameterSet(s.asSlice(i * StdVideoH265PictureParameterSet.SIZE, StdVideoH265PictureParameterSet.SIZE));
        }
        return ret;
    }

}
