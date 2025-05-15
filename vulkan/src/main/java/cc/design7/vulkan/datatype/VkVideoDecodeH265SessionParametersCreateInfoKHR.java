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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkVideoDecodeH265SessionParametersCreateInfoKHR.html">VkVideoDecodeH265SessionParametersCreateInfoKHR</a>
@ValueBasedCandidate
public record VkVideoDecodeH265SessionParametersCreateInfoKHR(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$maxStdVPSCount = ValueLayout.JAVA_INT.withName("maxStdVPSCount");
    public static final OfInt LAYOUT$maxStdSPSCount = ValueLayout.JAVA_INT.withName("maxStdSPSCount");
    public static final OfInt LAYOUT$maxStdPPSCount = ValueLayout.JAVA_INT.withName("maxStdPPSCount");
    public static final AddressLayout LAYOUT$pParametersAddInfo = ValueLayout.ADDRESS.withTargetLayout(VkVideoDecodeH265SessionParametersAddInfoKHR.LAYOUT).withName("pParametersAddInfo");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$maxStdVPSCount, LAYOUT$maxStdSPSCount, LAYOUT$maxStdPPSCount, LAYOUT$pParametersAddInfo);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkVideoDecodeH265SessionParametersCreateInfoKHR allocate(Arena arena) {
        return new VkVideoDecodeH265SessionParametersCreateInfoKHR(arena.allocate(LAYOUT));
    }

    public static VkVideoDecodeH265SessionParametersCreateInfoKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkVideoDecodeH265SessionParametersCreateInfoKHR[] ret = new VkVideoDecodeH265SessionParametersCreateInfoKHR[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkVideoDecodeH265SessionParametersCreateInfoKHR(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkVideoDecodeH265SessionParametersCreateInfoKHR clone(Arena arena, VkVideoDecodeH265SessionParametersCreateInfoKHR src) {
        VkVideoDecodeH265SessionParametersCreateInfoKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkVideoDecodeH265SessionParametersCreateInfoKHR[] clone(Arena arena, VkVideoDecodeH265SessionParametersCreateInfoKHR[] src) {
        VkVideoDecodeH265SessionParametersCreateInfoKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$maxStdVPSCount = PathElement.groupElement("PATH$maxStdVPSCount");
    public static final PathElement PATH$maxStdSPSCount = PathElement.groupElement("PATH$maxStdSPSCount");
    public static final PathElement PATH$maxStdPPSCount = PathElement.groupElement("PATH$maxStdPPSCount");
    public static final PathElement PATH$pParametersAddInfo = PathElement.groupElement("PATH$pParametersAddInfo");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$maxStdVPSCount = LAYOUT$maxStdVPSCount.byteSize();
    public static final long SIZE$maxStdSPSCount = LAYOUT$maxStdSPSCount.byteSize();
    public static final long SIZE$maxStdPPSCount = LAYOUT$maxStdPPSCount.byteSize();
    public static final long SIZE$pParametersAddInfo = LAYOUT$pParametersAddInfo.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$maxStdVPSCount = LAYOUT.byteOffset(PATH$maxStdVPSCount);
    public static final long OFFSET$maxStdSPSCount = LAYOUT.byteOffset(PATH$maxStdSPSCount);
    public static final long OFFSET$maxStdPPSCount = LAYOUT.byteOffset(PATH$maxStdPPSCount);
    public static final long OFFSET$pParametersAddInfo = LAYOUT.byteOffset(PATH$pParametersAddInfo);

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

    public @unsigned int maxStdVPSCount() {
        return segment.get(LAYOUT$maxStdVPSCount, OFFSET$maxStdVPSCount);
    }

    public void maxStdVPSCount(@unsigned int value) {
        segment.set(LAYOUT$maxStdVPSCount, OFFSET$maxStdVPSCount, value);
    }

    public @unsigned int maxStdSPSCount() {
        return segment.get(LAYOUT$maxStdSPSCount, OFFSET$maxStdSPSCount);
    }

    public void maxStdSPSCount(@unsigned int value) {
        segment.set(LAYOUT$maxStdSPSCount, OFFSET$maxStdSPSCount, value);
    }

    public @unsigned int maxStdPPSCount() {
        return segment.get(LAYOUT$maxStdPPSCount, OFFSET$maxStdPPSCount);
    }

    public void maxStdPPSCount(@unsigned int value) {
        segment.set(LAYOUT$maxStdPPSCount, OFFSET$maxStdPPSCount, value);
    }

    public @pointer(comment="VkVideoDecodeH265SessionParametersAddInfoKHR*") MemorySegment pParametersAddInfoRaw() {
        return segment.get(LAYOUT$pParametersAddInfo, OFFSET$pParametersAddInfo);
    }

    public void pParametersAddInfoRaw(@pointer(comment="VkVideoDecodeH265SessionParametersAddInfoKHR*") MemorySegment value) {
        segment.set(LAYOUT$pParametersAddInfo, OFFSET$pParametersAddInfo, value);
    }

    public @Nullable VkVideoDecodeH265SessionParametersAddInfoKHR pParametersAddInfo() {
        MemorySegment s = pParametersAddInfoRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkVideoDecodeH265SessionParametersAddInfoKHR(s);
    }

    public void pParametersAddInfo(@Nullable VkVideoDecodeH265SessionParametersAddInfoKHR value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pParametersAddInfoRaw(s);
    }

    @unsafe public @Nullable VkVideoDecodeH265SessionParametersAddInfoKHR[] pParametersAddInfo(int assumedCount) {
        MemorySegment s = pParametersAddInfoRaw();
        if (s.address() == 0) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkVideoDecodeH265SessionParametersAddInfoKHR.SIZE);
        VkVideoDecodeH265SessionParametersAddInfoKHR[] ret = new VkVideoDecodeH265SessionParametersAddInfoKHR[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkVideoDecodeH265SessionParametersAddInfoKHR(s.asSlice(i * VkVideoDecodeH265SessionParametersAddInfoKHR.SIZE, VkVideoDecodeH265SessionParametersAddInfoKHR.SIZE));
        }
        return ret;
    }

}
