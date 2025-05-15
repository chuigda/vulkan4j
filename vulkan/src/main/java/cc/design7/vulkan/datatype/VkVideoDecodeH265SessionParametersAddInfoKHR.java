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

public record VkVideoDecodeH265SessionParametersAddInfoKHR(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$stdVPSCount = ValueLayout.JAVA_INT.withName("stdVPSCount");
    public static final AddressLayout LAYOUT$pStdVPSs = ValueLayout.ADDRESS.withTargetLayout(StdVideoH265VideoParameterSet.LAYOUT).withName("pStdVPSs");
    public static final OfInt LAYOUT$stdSPSCount = ValueLayout.JAVA_INT.withName("stdSPSCount");
    public static final AddressLayout LAYOUT$pStdSPSs = ValueLayout.ADDRESS.withTargetLayout(StdVideoH265SequenceParameterSet.LAYOUT).withName("pStdSPSs");
    public static final OfInt LAYOUT$stdPPSCount = ValueLayout.JAVA_INT.withName("stdPPSCount");
    public static final AddressLayout LAYOUT$pStdPPSs = ValueLayout.ADDRESS.withTargetLayout(StdVideoH265PictureParameterSet.LAYOUT).withName("pStdPPSs");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$stdVPSCount, LAYOUT$pStdVPSs, LAYOUT$stdSPSCount, LAYOUT$pStdSPSs, LAYOUT$stdPPSCount, LAYOUT$pStdPPSs);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkVideoDecodeH265SessionParametersAddInfoKHR allocate(Arena arena) {
        return new VkVideoDecodeH265SessionParametersAddInfoKHR(arena.allocate(LAYOUT));
    }

    public static VkVideoDecodeH265SessionParametersAddInfoKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkVideoDecodeH265SessionParametersAddInfoKHR[] ret = new VkVideoDecodeH265SessionParametersAddInfoKHR[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkVideoDecodeH265SessionParametersAddInfoKHR(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkVideoDecodeH265SessionParametersAddInfoKHR clone(Arena arena, VkVideoDecodeH265SessionParametersAddInfoKHR src) {
        VkVideoDecodeH265SessionParametersAddInfoKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkVideoDecodeH265SessionParametersAddInfoKHR[] clone(Arena arena, VkVideoDecodeH265SessionParametersAddInfoKHR[] src) {
        VkVideoDecodeH265SessionParametersAddInfoKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$stdVPSCount = PathElement.groupElement("PATH$stdVPSCount");
    public static final PathElement PATH$pStdVPSs = PathElement.groupElement("PATH$pStdVPSs");
    public static final PathElement PATH$stdSPSCount = PathElement.groupElement("PATH$stdSPSCount");
    public static final PathElement PATH$pStdSPSs = PathElement.groupElement("PATH$pStdSPSs");
    public static final PathElement PATH$stdPPSCount = PathElement.groupElement("PATH$stdPPSCount");
    public static final PathElement PATH$pStdPPSs = PathElement.groupElement("PATH$pStdPPSs");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$stdVPSCount = LAYOUT$stdVPSCount.byteSize();
    public static final long SIZE$pStdVPSs = LAYOUT$pStdVPSs.byteSize();
    public static final long SIZE$stdSPSCount = LAYOUT$stdSPSCount.byteSize();
    public static final long SIZE$pStdSPSs = LAYOUT$pStdSPSs.byteSize();
    public static final long SIZE$stdPPSCount = LAYOUT$stdPPSCount.byteSize();
    public static final long SIZE$pStdPPSs = LAYOUT$pStdPPSs.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$stdVPSCount = LAYOUT.byteOffset(PATH$stdVPSCount);
    public static final long OFFSET$pStdVPSs = LAYOUT.byteOffset(PATH$pStdVPSs);
    public static final long OFFSET$stdSPSCount = LAYOUT.byteOffset(PATH$stdSPSCount);
    public static final long OFFSET$pStdSPSs = LAYOUT.byteOffset(PATH$pStdSPSs);
    public static final long OFFSET$stdPPSCount = LAYOUT.byteOffset(PATH$stdPPSCount);
    public static final long OFFSET$pStdPPSs = LAYOUT.byteOffset(PATH$pStdPPSs);

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

    public @unsigned int stdVPSCount() {
        return segment.get(LAYOUT$stdVPSCount, OFFSET$stdVPSCount);
    }

    public void stdVPSCount(@unsigned int value) {
        segment.set(LAYOUT$stdVPSCount, OFFSET$stdVPSCount, value);
    }

    public @pointer(comment="StdVideoH265VideoParameterSet*") MemorySegment pStdVPSsRaw() {
        return segment.get(LAYOUT$pStdVPSs, OFFSET$pStdVPSs);
    }

    public void pStdVPSsRaw(@pointer(comment="StdVideoH265VideoParameterSet*") MemorySegment value) {
        segment.set(LAYOUT$pStdVPSs, OFFSET$pStdVPSs, value);
    }

    public @Nullable StdVideoH265VideoParameterSet pStdVPSs() {
        MemorySegment s = pStdVPSsRaw();
        if (s.address() == 0) {
            return null;
        }
        return new StdVideoH265VideoParameterSet(s);
    }

    public void pStdVPSs(@Nullable StdVideoH265VideoParameterSet value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pStdVPSsRaw(s);
    }

    @unsafe public @Nullable StdVideoH265VideoParameterSet[] pStdVPSs(int assumedCount) {
        MemorySegment s = pStdVPSsRaw();
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

    public @unsigned int stdSPSCount() {
        return segment.get(LAYOUT$stdSPSCount, OFFSET$stdSPSCount);
    }

    public void stdSPSCount(@unsigned int value) {
        segment.set(LAYOUT$stdSPSCount, OFFSET$stdSPSCount, value);
    }

    public @pointer(comment="StdVideoH265SequenceParameterSet*") MemorySegment pStdSPSsRaw() {
        return segment.get(LAYOUT$pStdSPSs, OFFSET$pStdSPSs);
    }

    public void pStdSPSsRaw(@pointer(comment="StdVideoH265SequenceParameterSet*") MemorySegment value) {
        segment.set(LAYOUT$pStdSPSs, OFFSET$pStdSPSs, value);
    }

    public @Nullable StdVideoH265SequenceParameterSet pStdSPSs() {
        MemorySegment s = pStdSPSsRaw();
        if (s.address() == 0) {
            return null;
        }
        return new StdVideoH265SequenceParameterSet(s);
    }

    public void pStdSPSs(@Nullable StdVideoH265SequenceParameterSet value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pStdSPSsRaw(s);
    }

    @unsafe public @Nullable StdVideoH265SequenceParameterSet[] pStdSPSs(int assumedCount) {
        MemorySegment s = pStdSPSsRaw();
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

    public @unsigned int stdPPSCount() {
        return segment.get(LAYOUT$stdPPSCount, OFFSET$stdPPSCount);
    }

    public void stdPPSCount(@unsigned int value) {
        segment.set(LAYOUT$stdPPSCount, OFFSET$stdPPSCount, value);
    }

    public @pointer(comment="StdVideoH265PictureParameterSet*") MemorySegment pStdPPSsRaw() {
        return segment.get(LAYOUT$pStdPPSs, OFFSET$pStdPPSs);
    }

    public void pStdPPSsRaw(@pointer(comment="StdVideoH265PictureParameterSet*") MemorySegment value) {
        segment.set(LAYOUT$pStdPPSs, OFFSET$pStdPPSs, value);
    }

    public @Nullable StdVideoH265PictureParameterSet pStdPPSs() {
        MemorySegment s = pStdPPSsRaw();
        if (s.address() == 0) {
            return null;
        }
        return new StdVideoH265PictureParameterSet(s);
    }

    public void pStdPPSs(@Nullable StdVideoH265PictureParameterSet value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pStdPPSsRaw(s);
    }

    @unsafe public @Nullable StdVideoH265PictureParameterSet[] pStdPPSs(int assumedCount) {
        MemorySegment s = pStdPPSsRaw();
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
/// dummy, not implemented yet
