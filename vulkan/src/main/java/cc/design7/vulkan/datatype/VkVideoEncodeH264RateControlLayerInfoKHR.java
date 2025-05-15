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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkVideoEncodeH264RateControlLayerInfoKHR.html">VkVideoEncodeH264RateControlLayerInfoKHR</a>
@ValueBasedCandidate
public record VkVideoEncodeH264RateControlLayerInfoKHR(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$useMinQp = ValueLayout.JAVA_INT.withName("useMinQp");
    public static final StructLayout LAYOUT$minQp = VkVideoEncodeH264QpKHR.LAYOUT.withName("minQp");
    public static final OfInt LAYOUT$useMaxQp = ValueLayout.JAVA_INT.withName("useMaxQp");
    public static final StructLayout LAYOUT$maxQp = VkVideoEncodeH264QpKHR.LAYOUT.withName("maxQp");
    public static final OfInt LAYOUT$useMaxFrameSize = ValueLayout.JAVA_INT.withName("useMaxFrameSize");
    public static final StructLayout LAYOUT$maxFrameSize = VkVideoEncodeH264FrameSizeKHR.LAYOUT.withName("maxFrameSize");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$useMinQp, LAYOUT$minQp, LAYOUT$useMaxQp, LAYOUT$maxQp, LAYOUT$useMaxFrameSize, LAYOUT$maxFrameSize);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkVideoEncodeH264RateControlLayerInfoKHR allocate(Arena arena) {
        return new VkVideoEncodeH264RateControlLayerInfoKHR(arena.allocate(LAYOUT));
    }

    public static VkVideoEncodeH264RateControlLayerInfoKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkVideoEncodeH264RateControlLayerInfoKHR[] ret = new VkVideoEncodeH264RateControlLayerInfoKHR[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkVideoEncodeH264RateControlLayerInfoKHR(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkVideoEncodeH264RateControlLayerInfoKHR clone(Arena arena, VkVideoEncodeH264RateControlLayerInfoKHR src) {
        VkVideoEncodeH264RateControlLayerInfoKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkVideoEncodeH264RateControlLayerInfoKHR[] clone(Arena arena, VkVideoEncodeH264RateControlLayerInfoKHR[] src) {
        VkVideoEncodeH264RateControlLayerInfoKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$useMinQp = PathElement.groupElement("PATH$useMinQp");
    public static final PathElement PATH$minQp = PathElement.groupElement("PATH$minQp");
    public static final PathElement PATH$useMaxQp = PathElement.groupElement("PATH$useMaxQp");
    public static final PathElement PATH$maxQp = PathElement.groupElement("PATH$maxQp");
    public static final PathElement PATH$useMaxFrameSize = PathElement.groupElement("PATH$useMaxFrameSize");
    public static final PathElement PATH$maxFrameSize = PathElement.groupElement("PATH$maxFrameSize");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$useMinQp = LAYOUT$useMinQp.byteSize();
    public static final long SIZE$minQp = LAYOUT$minQp.byteSize();
    public static final long SIZE$useMaxQp = LAYOUT$useMaxQp.byteSize();
    public static final long SIZE$maxQp = LAYOUT$maxQp.byteSize();
    public static final long SIZE$useMaxFrameSize = LAYOUT$useMaxFrameSize.byteSize();
    public static final long SIZE$maxFrameSize = LAYOUT$maxFrameSize.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$useMinQp = LAYOUT.byteOffset(PATH$useMinQp);
    public static final long OFFSET$minQp = LAYOUT.byteOffset(PATH$minQp);
    public static final long OFFSET$useMaxQp = LAYOUT.byteOffset(PATH$useMaxQp);
    public static final long OFFSET$maxQp = LAYOUT.byteOffset(PATH$maxQp);
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

    public @unsigned int useMinQp() {
        return segment.get(LAYOUT$useMinQp, OFFSET$useMinQp);
    }

    public void useMinQp(@unsigned int value) {
        segment.set(LAYOUT$useMinQp, OFFSET$useMinQp, value);
    }

    public VkVideoEncodeH264QpKHR minQp() {
        return new VkVideoEncodeH264QpKHR(segment.asSlice(OFFSET$minQp, LAYOUT$minQp));
    }

    public void minQp(VkVideoEncodeH264QpKHR value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$minQp, SIZE$minQp);
    }

    public @unsigned int useMaxQp() {
        return segment.get(LAYOUT$useMaxQp, OFFSET$useMaxQp);
    }

    public void useMaxQp(@unsigned int value) {
        segment.set(LAYOUT$useMaxQp, OFFSET$useMaxQp, value);
    }

    public VkVideoEncodeH264QpKHR maxQp() {
        return new VkVideoEncodeH264QpKHR(segment.asSlice(OFFSET$maxQp, LAYOUT$maxQp));
    }

    public void maxQp(VkVideoEncodeH264QpKHR value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$maxQp, SIZE$maxQp);
    }

    public @unsigned int useMaxFrameSize() {
        return segment.get(LAYOUT$useMaxFrameSize, OFFSET$useMaxFrameSize);
    }

    public void useMaxFrameSize(@unsigned int value) {
        segment.set(LAYOUT$useMaxFrameSize, OFFSET$useMaxFrameSize, value);
    }

    public VkVideoEncodeH264FrameSizeKHR maxFrameSize() {
        return new VkVideoEncodeH264FrameSizeKHR(segment.asSlice(OFFSET$maxFrameSize, LAYOUT$maxFrameSize));
    }

    public void maxFrameSize(VkVideoEncodeH264FrameSizeKHR value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$maxFrameSize, SIZE$maxFrameSize);
    }

}
