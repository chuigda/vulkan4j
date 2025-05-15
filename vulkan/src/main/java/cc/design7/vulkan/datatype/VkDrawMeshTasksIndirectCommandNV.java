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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkDrawMeshTasksIndirectCommandNV.html">VkDrawMeshTasksIndirectCommandNV</a>
@ValueBasedCandidate
public record VkDrawMeshTasksIndirectCommandNV(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$taskCount = ValueLayout.JAVA_INT.withName("taskCount");
    public static final OfInt LAYOUT$firstTask = ValueLayout.JAVA_INT.withName("firstTask");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$taskCount, LAYOUT$firstTask);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkDrawMeshTasksIndirectCommandNV allocate(Arena arena) {
        return new VkDrawMeshTasksIndirectCommandNV(arena.allocate(LAYOUT));
    }

    public static VkDrawMeshTasksIndirectCommandNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkDrawMeshTasksIndirectCommandNV[] ret = new VkDrawMeshTasksIndirectCommandNV[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkDrawMeshTasksIndirectCommandNV(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkDrawMeshTasksIndirectCommandNV clone(Arena arena, VkDrawMeshTasksIndirectCommandNV src) {
        VkDrawMeshTasksIndirectCommandNV ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkDrawMeshTasksIndirectCommandNV[] clone(Arena arena, VkDrawMeshTasksIndirectCommandNV[] src) {
        VkDrawMeshTasksIndirectCommandNV[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$taskCount = PathElement.groupElement("PATH$taskCount");
    public static final PathElement PATH$firstTask = PathElement.groupElement("PATH$firstTask");

    public static final long SIZE$taskCount = LAYOUT$taskCount.byteSize();
    public static final long SIZE$firstTask = LAYOUT$firstTask.byteSize();

    public static final long OFFSET$taskCount = LAYOUT.byteOffset(PATH$taskCount);
    public static final long OFFSET$firstTask = LAYOUT.byteOffset(PATH$firstTask);

    public @unsigned int taskCount() {
        return segment.get(LAYOUT$taskCount, OFFSET$taskCount);
    }

    public void taskCount(@unsigned int value) {
        segment.set(LAYOUT$taskCount, OFFSET$taskCount, value);
    }

    public @unsigned int firstTask() {
        return segment.get(LAYOUT$firstTask, OFFSET$firstTask);
    }

    public void firstTask(@unsigned int value) {
        segment.set(LAYOUT$firstTask, OFFSET$firstTask, value);
    }

}
