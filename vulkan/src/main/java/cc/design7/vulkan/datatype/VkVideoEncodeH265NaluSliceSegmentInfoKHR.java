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

public record VkVideoEncodeH265NaluSliceSegmentInfoKHR(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$constantQp = ValueLayout.JAVA_INT.withName("constantQp");
    public static final AddressLayout LAYOUT$pStdSliceSegmentHeader = ValueLayout.ADDRESS.withTargetLayout(StdVideoEncodeH265SliceSegmentHeader.LAYOUT).withName("pStdSliceSegmentHeader");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$constantQp, LAYOUT$pStdSliceSegmentHeader);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkVideoEncodeH265NaluSliceSegmentInfoKHR allocate(Arena arena) {
        return new VkVideoEncodeH265NaluSliceSegmentInfoKHR(arena.allocate(LAYOUT));
    }

    public static VkVideoEncodeH265NaluSliceSegmentInfoKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkVideoEncodeH265NaluSliceSegmentInfoKHR[] ret = new VkVideoEncodeH265NaluSliceSegmentInfoKHR[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkVideoEncodeH265NaluSliceSegmentInfoKHR(segment.asSlice(i * SIZE, SIZE));
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

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$constantQp = PathElement.groupElement("PATH$constantQp");
    public static final PathElement PATH$pStdSliceSegmentHeader = PathElement.groupElement("PATH$pStdSliceSegmentHeader");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$constantQp = LAYOUT$constantQp.byteSize();
    public static final long SIZE$pStdSliceSegmentHeader = LAYOUT$pStdSliceSegmentHeader.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$constantQp = LAYOUT.byteOffset(PATH$constantQp);
    public static final long OFFSET$pStdSliceSegmentHeader = LAYOUT.byteOffset(PATH$pStdSliceSegmentHeader);

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

    public int constantQp() {
        return segment.get(LAYOUT$constantQp, OFFSET$constantQp);
    }

    public void constantQp(int value) {
        segment.set(LAYOUT$constantQp, OFFSET$constantQp, value);
    }

    public @pointer(comment="StdVideoEncodeH265SliceSegmentHeader*") MemorySegment pStdSliceSegmentHeaderRaw() {
        return segment.get(LAYOUT$pStdSliceSegmentHeader, OFFSET$pStdSliceSegmentHeader);
    }

    public void pStdSliceSegmentHeaderRaw(@pointer(comment="StdVideoEncodeH265SliceSegmentHeader*") MemorySegment value) {
        segment.set(LAYOUT$pStdSliceSegmentHeader, OFFSET$pStdSliceSegmentHeader, value);
    }

    public @Nullable StdVideoEncodeH265SliceSegmentHeader pStdSliceSegmentHeader() {
        MemorySegment s = pStdSliceSegmentHeaderRaw();
        if (s.address() == 0) {
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
        if (s.address() == 0) {
            return null;
        }

        s = s.reinterpret(assumedCount * StdVideoEncodeH265SliceSegmentHeader.SIZE);
        StdVideoEncodeH265SliceSegmentHeader[] ret = new StdVideoEncodeH265SliceSegmentHeader[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new StdVideoEncodeH265SliceSegmentHeader(s.asSlice(i * StdVideoEncodeH265SliceSegmentHeader.SIZE, StdVideoEncodeH265SliceSegmentHeader.SIZE));
        }
        return ret;
    }

}
/// dummy, not implemented yet
