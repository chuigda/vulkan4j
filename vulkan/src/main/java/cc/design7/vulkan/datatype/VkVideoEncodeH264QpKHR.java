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

public record VkVideoEncodeH264QpKHR(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$qpI = ValueLayout.JAVA_INT.withName("qpI");
    public static final OfInt LAYOUT$qpP = ValueLayout.JAVA_INT.withName("qpP");
    public static final OfInt LAYOUT$qpB = ValueLayout.JAVA_INT.withName("qpB");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$qpI, LAYOUT$qpP, LAYOUT$qpB);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkVideoEncodeH264QpKHR allocate(Arena arena) {
        return new VkVideoEncodeH264QpKHR(arena.allocate(LAYOUT));
    }

    public static VkVideoEncodeH264QpKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkVideoEncodeH264QpKHR[] ret = new VkVideoEncodeH264QpKHR[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkVideoEncodeH264QpKHR(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkVideoEncodeH264QpKHR clone(Arena arena, VkVideoEncodeH264QpKHR src) {
        VkVideoEncodeH264QpKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkVideoEncodeH264QpKHR[] clone(Arena arena, VkVideoEncodeH264QpKHR[] src) {
        VkVideoEncodeH264QpKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$qpI = PathElement.groupElement("PATH$qpI");
    public static final PathElement PATH$qpP = PathElement.groupElement("PATH$qpP");
    public static final PathElement PATH$qpB = PathElement.groupElement("PATH$qpB");

    public static final long SIZE$qpI = LAYOUT$qpI.byteSize();
    public static final long SIZE$qpP = LAYOUT$qpP.byteSize();
    public static final long SIZE$qpB = LAYOUT$qpB.byteSize();

    public static final long OFFSET$qpI = LAYOUT.byteOffset(PATH$qpI);
    public static final long OFFSET$qpP = LAYOUT.byteOffset(PATH$qpP);
    public static final long OFFSET$qpB = LAYOUT.byteOffset(PATH$qpB);

    public int qpI() {
        return segment.get(LAYOUT$qpI, OFFSET$qpI);
    }

    public void qpI(int value) {
        segment.set(LAYOUT$qpI, OFFSET$qpI, value);
    }

    public int qpP() {
        return segment.get(LAYOUT$qpP, OFFSET$qpP);
    }

    public void qpP(int value) {
        segment.set(LAYOUT$qpP, OFFSET$qpP, value);
    }

    public int qpB() {
        return segment.get(LAYOUT$qpB, OFFSET$qpB);
    }

    public void qpB(int value) {
        segment.set(LAYOUT$qpB, OFFSET$qpB, value);
    }

}
/// dummy, not implemented yet
