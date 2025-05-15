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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkVideoEncodeAV1RateControlLayerInfoKHR.html">VkVideoEncodeAV1RateControlLayerInfoKHR</a>
@ValueBasedCandidate
public record VkVideoEncodeAV1RateControlLayerInfoKHR(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$useMinQIndex = ValueLayout.JAVA_INT.withName("useMinQIndex");
    public static final StructLayout LAYOUT$minQIndex = VkVideoEncodeAV1QIndexKHR.LAYOUT.withName("minQIndex");
    public static final OfInt LAYOUT$useMaxQIndex = ValueLayout.JAVA_INT.withName("useMaxQIndex");
    public static final StructLayout LAYOUT$maxQIndex = VkVideoEncodeAV1QIndexKHR.LAYOUT.withName("maxQIndex");
    public static final OfInt LAYOUT$useMaxFrameSize = ValueLayout.JAVA_INT.withName("useMaxFrameSize");
    public static final StructLayout LAYOUT$maxFrameSize = VkVideoEncodeAV1FrameSizeKHR.LAYOUT.withName("maxFrameSize");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$useMinQIndex, LAYOUT$minQIndex, LAYOUT$useMaxQIndex, LAYOUT$maxQIndex, LAYOUT$useMaxFrameSize, LAYOUT$maxFrameSize);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkVideoEncodeAV1RateControlLayerInfoKHR allocate(Arena arena) {
        return new VkVideoEncodeAV1RateControlLayerInfoKHR(arena.allocate(LAYOUT));
    }

    public static VkVideoEncodeAV1RateControlLayerInfoKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkVideoEncodeAV1RateControlLayerInfoKHR[] ret = new VkVideoEncodeAV1RateControlLayerInfoKHR[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkVideoEncodeAV1RateControlLayerInfoKHR(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkVideoEncodeAV1RateControlLayerInfoKHR clone(Arena arena, VkVideoEncodeAV1RateControlLayerInfoKHR src) {
        VkVideoEncodeAV1RateControlLayerInfoKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkVideoEncodeAV1RateControlLayerInfoKHR[] clone(Arena arena, VkVideoEncodeAV1RateControlLayerInfoKHR[] src) {
        VkVideoEncodeAV1RateControlLayerInfoKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$useMinQIndex = PathElement.groupElement("PATH$useMinQIndex");
    public static final PathElement PATH$minQIndex = PathElement.groupElement("PATH$minQIndex");
    public static final PathElement PATH$useMaxQIndex = PathElement.groupElement("PATH$useMaxQIndex");
    public static final PathElement PATH$maxQIndex = PathElement.groupElement("PATH$maxQIndex");
    public static final PathElement PATH$useMaxFrameSize = PathElement.groupElement("PATH$useMaxFrameSize");
    public static final PathElement PATH$maxFrameSize = PathElement.groupElement("PATH$maxFrameSize");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$useMinQIndex = LAYOUT$useMinQIndex.byteSize();
    public static final long SIZE$minQIndex = LAYOUT$minQIndex.byteSize();
    public static final long SIZE$useMaxQIndex = LAYOUT$useMaxQIndex.byteSize();
    public static final long SIZE$maxQIndex = LAYOUT$maxQIndex.byteSize();
    public static final long SIZE$useMaxFrameSize = LAYOUT$useMaxFrameSize.byteSize();
    public static final long SIZE$maxFrameSize = LAYOUT$maxFrameSize.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$useMinQIndex = LAYOUT.byteOffset(PATH$useMinQIndex);
    public static final long OFFSET$minQIndex = LAYOUT.byteOffset(PATH$minQIndex);
    public static final long OFFSET$useMaxQIndex = LAYOUT.byteOffset(PATH$useMaxQIndex);
    public static final long OFFSET$maxQIndex = LAYOUT.byteOffset(PATH$maxQIndex);
    public static final long OFFSET$useMaxFrameSize = LAYOUT.byteOffset(PATH$useMaxFrameSize);
    public static final long OFFSET$maxFrameSize = LAYOUT.byteOffset(PATH$maxFrameSize);

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

    public @unsigned int useMinQIndex() {
        return segment.get(LAYOUT$useMinQIndex, OFFSET$useMinQIndex);
    }

    public void useMinQIndex(@unsigned int value) {
        segment.set(LAYOUT$useMinQIndex, OFFSET$useMinQIndex, value);
    }

    public VkVideoEncodeAV1QIndexKHR minQIndex() {
        return new VkVideoEncodeAV1QIndexKHR(segment.asSlice(OFFSET$minQIndex, LAYOUT$minQIndex));
    }

    public void minQIndex(VkVideoEncodeAV1QIndexKHR value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$minQIndex, SIZE$minQIndex);
    }

    public @unsigned int useMaxQIndex() {
        return segment.get(LAYOUT$useMaxQIndex, OFFSET$useMaxQIndex);
    }

    public void useMaxQIndex(@unsigned int value) {
        segment.set(LAYOUT$useMaxQIndex, OFFSET$useMaxQIndex, value);
    }

    public VkVideoEncodeAV1QIndexKHR maxQIndex() {
        return new VkVideoEncodeAV1QIndexKHR(segment.asSlice(OFFSET$maxQIndex, LAYOUT$maxQIndex));
    }

    public void maxQIndex(VkVideoEncodeAV1QIndexKHR value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$maxQIndex, SIZE$maxQIndex);
    }

    public @unsigned int useMaxFrameSize() {
        return segment.get(LAYOUT$useMaxFrameSize, OFFSET$useMaxFrameSize);
    }

    public void useMaxFrameSize(@unsigned int value) {
        segment.set(LAYOUT$useMaxFrameSize, OFFSET$useMaxFrameSize, value);
    }

    public VkVideoEncodeAV1FrameSizeKHR maxFrameSize() {
        return new VkVideoEncodeAV1FrameSizeKHR(segment.asSlice(OFFSET$maxFrameSize, LAYOUT$maxFrameSize));
    }

    public void maxFrameSize(VkVideoEncodeAV1FrameSizeKHR value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$maxFrameSize, SIZE$maxFrameSize);
    }

}
