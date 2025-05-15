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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkVideoEncodeAV1SessionParametersCreateInfoKHR.html">VkVideoEncodeAV1SessionParametersCreateInfoKHR</a>
@ValueBasedCandidate
public record VkVideoEncodeAV1SessionParametersCreateInfoKHR(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final AddressLayout LAYOUT$pStdSequenceHeader = ValueLayout.ADDRESS.withTargetLayout(StdVideoAV1SequenceHeader.LAYOUT).withName("pStdSequenceHeader");
    public static final AddressLayout LAYOUT$pStdDecoderModelInfo = ValueLayout.ADDRESS.withTargetLayout(StdVideoEncodeAV1DecoderModelInfo.LAYOUT).withName("pStdDecoderModelInfo");
    public static final OfInt LAYOUT$stdOperatingPointCount = ValueLayout.JAVA_INT.withName("stdOperatingPointCount");
    public static final AddressLayout LAYOUT$pStdOperatingPoints = ValueLayout.ADDRESS.withTargetLayout(StdVideoEncodeAV1OperatingPointInfo.LAYOUT).withName("pStdOperatingPoints");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$pStdSequenceHeader, LAYOUT$pStdDecoderModelInfo, LAYOUT$stdOperatingPointCount, LAYOUT$pStdOperatingPoints);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkVideoEncodeAV1SessionParametersCreateInfoKHR allocate(Arena arena) {
        return new VkVideoEncodeAV1SessionParametersCreateInfoKHR(arena.allocate(LAYOUT));
    }

    public static VkVideoEncodeAV1SessionParametersCreateInfoKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkVideoEncodeAV1SessionParametersCreateInfoKHR[] ret = new VkVideoEncodeAV1SessionParametersCreateInfoKHR[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkVideoEncodeAV1SessionParametersCreateInfoKHR(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkVideoEncodeAV1SessionParametersCreateInfoKHR clone(Arena arena, VkVideoEncodeAV1SessionParametersCreateInfoKHR src) {
        VkVideoEncodeAV1SessionParametersCreateInfoKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkVideoEncodeAV1SessionParametersCreateInfoKHR[] clone(Arena arena, VkVideoEncodeAV1SessionParametersCreateInfoKHR[] src) {
        VkVideoEncodeAV1SessionParametersCreateInfoKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$pStdSequenceHeader = PathElement.groupElement("PATH$pStdSequenceHeader");
    public static final PathElement PATH$pStdDecoderModelInfo = PathElement.groupElement("PATH$pStdDecoderModelInfo");
    public static final PathElement PATH$stdOperatingPointCount = PathElement.groupElement("PATH$stdOperatingPointCount");
    public static final PathElement PATH$pStdOperatingPoints = PathElement.groupElement("PATH$pStdOperatingPoints");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$pStdSequenceHeader = LAYOUT$pStdSequenceHeader.byteSize();
    public static final long SIZE$pStdDecoderModelInfo = LAYOUT$pStdDecoderModelInfo.byteSize();
    public static final long SIZE$stdOperatingPointCount = LAYOUT$stdOperatingPointCount.byteSize();
    public static final long SIZE$pStdOperatingPoints = LAYOUT$pStdOperatingPoints.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$pStdSequenceHeader = LAYOUT.byteOffset(PATH$pStdSequenceHeader);
    public static final long OFFSET$pStdDecoderModelInfo = LAYOUT.byteOffset(PATH$pStdDecoderModelInfo);
    public static final long OFFSET$stdOperatingPointCount = LAYOUT.byteOffset(PATH$stdOperatingPointCount);
    public static final long OFFSET$pStdOperatingPoints = LAYOUT.byteOffset(PATH$pStdOperatingPoints);

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

    public @pointer(comment="StdVideoAV1SequenceHeader*") MemorySegment pStdSequenceHeaderRaw() {
        return segment.get(LAYOUT$pStdSequenceHeader, OFFSET$pStdSequenceHeader);
    }

    public void pStdSequenceHeaderRaw(@pointer(comment="StdVideoAV1SequenceHeader*") MemorySegment value) {
        segment.set(LAYOUT$pStdSequenceHeader, OFFSET$pStdSequenceHeader, value);
    }

    public @Nullable StdVideoAV1SequenceHeader pStdSequenceHeader() {
        MemorySegment s = pStdSequenceHeaderRaw();
        if (s.address() == 0) {
            return null;
        }
        return new StdVideoAV1SequenceHeader(s);
    }

    public void pStdSequenceHeader(@Nullable StdVideoAV1SequenceHeader value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pStdSequenceHeaderRaw(s);
    }

    @unsafe public @Nullable StdVideoAV1SequenceHeader[] pStdSequenceHeader(int assumedCount) {
        MemorySegment s = pStdSequenceHeaderRaw();
        if (s.address() == 0) {
            return null;
        }

        s = s.reinterpret(assumedCount * StdVideoAV1SequenceHeader.SIZE);
        StdVideoAV1SequenceHeader[] ret = new StdVideoAV1SequenceHeader[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new StdVideoAV1SequenceHeader(s.asSlice(i * StdVideoAV1SequenceHeader.SIZE, StdVideoAV1SequenceHeader.SIZE));
        }
        return ret;
    }

    public @pointer(comment="StdVideoEncodeAV1DecoderModelInfo*") MemorySegment pStdDecoderModelInfoRaw() {
        return segment.get(LAYOUT$pStdDecoderModelInfo, OFFSET$pStdDecoderModelInfo);
    }

    public void pStdDecoderModelInfoRaw(@pointer(comment="StdVideoEncodeAV1DecoderModelInfo*") MemorySegment value) {
        segment.set(LAYOUT$pStdDecoderModelInfo, OFFSET$pStdDecoderModelInfo, value);
    }

    public @Nullable StdVideoEncodeAV1DecoderModelInfo pStdDecoderModelInfo() {
        MemorySegment s = pStdDecoderModelInfoRaw();
        if (s.address() == 0) {
            return null;
        }
        return new StdVideoEncodeAV1DecoderModelInfo(s);
    }

    public void pStdDecoderModelInfo(@Nullable StdVideoEncodeAV1DecoderModelInfo value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pStdDecoderModelInfoRaw(s);
    }

    @unsafe public @Nullable StdVideoEncodeAV1DecoderModelInfo[] pStdDecoderModelInfo(int assumedCount) {
        MemorySegment s = pStdDecoderModelInfoRaw();
        if (s.address() == 0) {
            return null;
        }

        s = s.reinterpret(assumedCount * StdVideoEncodeAV1DecoderModelInfo.SIZE);
        StdVideoEncodeAV1DecoderModelInfo[] ret = new StdVideoEncodeAV1DecoderModelInfo[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new StdVideoEncodeAV1DecoderModelInfo(s.asSlice(i * StdVideoEncodeAV1DecoderModelInfo.SIZE, StdVideoEncodeAV1DecoderModelInfo.SIZE));
        }
        return ret;
    }

    public @unsigned int stdOperatingPointCount() {
        return segment.get(LAYOUT$stdOperatingPointCount, OFFSET$stdOperatingPointCount);
    }

    public void stdOperatingPointCount(@unsigned int value) {
        segment.set(LAYOUT$stdOperatingPointCount, OFFSET$stdOperatingPointCount, value);
    }

    public @pointer(comment="StdVideoEncodeAV1OperatingPointInfo*") MemorySegment pStdOperatingPointsRaw() {
        return segment.get(LAYOUT$pStdOperatingPoints, OFFSET$pStdOperatingPoints);
    }

    public void pStdOperatingPointsRaw(@pointer(comment="StdVideoEncodeAV1OperatingPointInfo*") MemorySegment value) {
        segment.set(LAYOUT$pStdOperatingPoints, OFFSET$pStdOperatingPoints, value);
    }

    public @Nullable StdVideoEncodeAV1OperatingPointInfo pStdOperatingPoints() {
        MemorySegment s = pStdOperatingPointsRaw();
        if (s.address() == 0) {
            return null;
        }
        return new StdVideoEncodeAV1OperatingPointInfo(s);
    }

    public void pStdOperatingPoints(@Nullable StdVideoEncodeAV1OperatingPointInfo value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pStdOperatingPointsRaw(s);
    }

    @unsafe public @Nullable StdVideoEncodeAV1OperatingPointInfo[] pStdOperatingPoints(int assumedCount) {
        MemorySegment s = pStdOperatingPointsRaw();
        if (s.address() == 0) {
            return null;
        }

        s = s.reinterpret(assumedCount * StdVideoEncodeAV1OperatingPointInfo.SIZE);
        StdVideoEncodeAV1OperatingPointInfo[] ret = new StdVideoEncodeAV1OperatingPointInfo[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new StdVideoEncodeAV1OperatingPointInfo(s.asSlice(i * StdVideoEncodeAV1OperatingPointInfo.SIZE, StdVideoEncodeAV1OperatingPointInfo.SIZE));
        }
        return ret;
    }

}
