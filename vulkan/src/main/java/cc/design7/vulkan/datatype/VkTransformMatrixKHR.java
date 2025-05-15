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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkTransformMatrixKHR.html">VkTransformMatrixKHR</a>
@ValueBasedCandidate
public record VkTransformMatrixKHR(@NotNull MemorySegment segment) implements IPointer {
    public static final OfFloat LAYOUT$matrix = ValueLayout.JAVA_FLOAT.withName("matrix");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$matrix);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkTransformMatrixKHR allocate(Arena arena) {
        return new VkTransformMatrixKHR(arena.allocate(LAYOUT));
    }

    public static VkTransformMatrixKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkTransformMatrixKHR[] ret = new VkTransformMatrixKHR[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkTransformMatrixKHR(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkTransformMatrixKHR clone(Arena arena, VkTransformMatrixKHR src) {
        VkTransformMatrixKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkTransformMatrixKHR[] clone(Arena arena, VkTransformMatrixKHR[] src) {
        VkTransformMatrixKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$matrix = PathElement.groupElement("PATH$matrix");

    public static final long SIZE$matrix = LAYOUT$matrix.byteSize();

    public static final long OFFSET$matrix = LAYOUT.byteOffset(PATH$matrix);

    public float matrix() {
        return segment.get(LAYOUT$matrix, OFFSET$matrix);
    }

    public void matrix(float value) {
        segment.set(LAYOUT$matrix, OFFSET$matrix, value);
    }

}
