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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkVideoDecodeAV1DpbSlotInfoKHR.html">VkVideoDecodeAV1DpbSlotInfoKHR</a>
@ValueBasedCandidate
public record VkVideoDecodeAV1DpbSlotInfoKHR(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final AddressLayout LAYOUT$pStdReferenceInfo = ValueLayout.ADDRESS.withTargetLayout(StdVideoDecodeAV1ReferenceInfo.LAYOUT).withName("pStdReferenceInfo");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$pStdReferenceInfo);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkVideoDecodeAV1DpbSlotInfoKHR allocate(Arena arena) {
        return new VkVideoDecodeAV1DpbSlotInfoKHR(arena.allocate(LAYOUT));
    }

    public static VkVideoDecodeAV1DpbSlotInfoKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkVideoDecodeAV1DpbSlotInfoKHR[] ret = new VkVideoDecodeAV1DpbSlotInfoKHR[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkVideoDecodeAV1DpbSlotInfoKHR(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkVideoDecodeAV1DpbSlotInfoKHR clone(Arena arena, VkVideoDecodeAV1DpbSlotInfoKHR src) {
        VkVideoDecodeAV1DpbSlotInfoKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkVideoDecodeAV1DpbSlotInfoKHR[] clone(Arena arena, VkVideoDecodeAV1DpbSlotInfoKHR[] src) {
        VkVideoDecodeAV1DpbSlotInfoKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$pStdReferenceInfo = PathElement.groupElement("PATH$pStdReferenceInfo");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$pStdReferenceInfo = LAYOUT$pStdReferenceInfo.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$pStdReferenceInfo = LAYOUT.byteOffset(PATH$pStdReferenceInfo);

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

    public @pointer(comment="StdVideoDecodeAV1ReferenceInfo*") MemorySegment pStdReferenceInfoRaw() {
        return segment.get(LAYOUT$pStdReferenceInfo, OFFSET$pStdReferenceInfo);
    }

    public void pStdReferenceInfoRaw(@pointer(comment="StdVideoDecodeAV1ReferenceInfo*") MemorySegment value) {
        segment.set(LAYOUT$pStdReferenceInfo, OFFSET$pStdReferenceInfo, value);
    }

    public @Nullable StdVideoDecodeAV1ReferenceInfo pStdReferenceInfo() {
        MemorySegment s = pStdReferenceInfoRaw();
        if (s.address() == 0) {
            return null;
        }
        return new StdVideoDecodeAV1ReferenceInfo(s);
    }

    public void pStdReferenceInfo(@Nullable StdVideoDecodeAV1ReferenceInfo value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pStdReferenceInfoRaw(s);
    }

    @unsafe public @Nullable StdVideoDecodeAV1ReferenceInfo[] pStdReferenceInfo(int assumedCount) {
        MemorySegment s = pStdReferenceInfoRaw();
        if (s.address() == 0) {
            return null;
        }

        s = s.reinterpret(assumedCount * StdVideoDecodeAV1ReferenceInfo.SIZE);
        StdVideoDecodeAV1ReferenceInfo[] ret = new StdVideoDecodeAV1ReferenceInfo[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new StdVideoDecodeAV1ReferenceInfo(s.asSlice(i * StdVideoDecodeAV1ReferenceInfo.SIZE, StdVideoDecodeAV1ReferenceInfo.SIZE));
        }
        return ret;
    }

}
