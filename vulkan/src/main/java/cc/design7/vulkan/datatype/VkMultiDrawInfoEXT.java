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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkMultiDrawInfoEXT.html">VkMultiDrawInfoEXT</a>
@ValueBasedCandidate
public record VkMultiDrawInfoEXT(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$firstVertex = ValueLayout.JAVA_INT.withName("firstVertex");
    public static final OfInt LAYOUT$vertexCount = ValueLayout.JAVA_INT.withName("vertexCount");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$firstVertex, LAYOUT$vertexCount);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkMultiDrawInfoEXT allocate(Arena arena) {
        return new VkMultiDrawInfoEXT(arena.allocate(LAYOUT));
    }

    public static VkMultiDrawInfoEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkMultiDrawInfoEXT[] ret = new VkMultiDrawInfoEXT[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkMultiDrawInfoEXT(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkMultiDrawInfoEXT clone(Arena arena, VkMultiDrawInfoEXT src) {
        VkMultiDrawInfoEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkMultiDrawInfoEXT[] clone(Arena arena, VkMultiDrawInfoEXT[] src) {
        VkMultiDrawInfoEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$firstVertex = PathElement.groupElement("PATH$firstVertex");
    public static final PathElement PATH$vertexCount = PathElement.groupElement("PATH$vertexCount");

    public static final long SIZE$firstVertex = LAYOUT$firstVertex.byteSize();
    public static final long SIZE$vertexCount = LAYOUT$vertexCount.byteSize();

    public static final long OFFSET$firstVertex = LAYOUT.byteOffset(PATH$firstVertex);
    public static final long OFFSET$vertexCount = LAYOUT.byteOffset(PATH$vertexCount);

    public @unsigned int firstVertex() {
        return segment.get(LAYOUT$firstVertex, OFFSET$firstVertex);
    }

    public void firstVertex(@unsigned int value) {
        segment.set(LAYOUT$firstVertex, OFFSET$firstVertex, value);
    }

    public @unsigned int vertexCount() {
        return segment.get(LAYOUT$vertexCount, OFFSET$vertexCount);
    }

    public void vertexCount(@unsigned int value) {
        segment.set(LAYOUT$vertexCount, OFFSET$vertexCount, value);
    }

}
