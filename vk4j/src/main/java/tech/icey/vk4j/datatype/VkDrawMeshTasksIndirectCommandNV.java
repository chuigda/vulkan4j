package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.IPointer;
import tech.icey.vk4j.annotation.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.buffer.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import tech.icey.vk4j.NativeLayout;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

/// {@snippet lang=c :
/// typedef struct VkDrawMeshTasksIndirectCommandNV {
///     uint32_t taskCount;
///     uint32_t firstTask;
/// } VkDrawMeshTasksIndirectCommandNV;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkDrawMeshTasksIndirectCommandNV.html">VkDrawMeshTasksIndirectCommandNV</a>
public record VkDrawMeshTasksIndirectCommandNV(MemorySegment segment) implements IPointer {
    public VkDrawMeshTasksIndirectCommandNV(MemorySegment segment) {
        this.segment = segment;
    }

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

    public static VkDrawMeshTasksIndirectCommandNV allocate(Arena arena) {
        return new VkDrawMeshTasksIndirectCommandNV(arena.allocate(LAYOUT));
    }
    
    public static VkDrawMeshTasksIndirectCommandNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkDrawMeshTasksIndirectCommandNV[] ret = new VkDrawMeshTasksIndirectCommandNV[count];
        for (int i = 0; i < count; i++) {
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
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("taskCount"),
        ValueLayout.JAVA_INT.withName("firstTask")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$taskCount = PathElement.groupElement("taskCount");
    public static final PathElement PATH$firstTask = PathElement.groupElement("firstTask");

    public static final OfInt LAYOUT$taskCount = (OfInt) LAYOUT.select(PATH$taskCount);
    public static final OfInt LAYOUT$firstTask = (OfInt) LAYOUT.select(PATH$firstTask);

    public static final long OFFSET$taskCount = LAYOUT.byteOffset(PATH$taskCount);
    public static final long OFFSET$firstTask = LAYOUT.byteOffset(PATH$firstTask);

    public static final long SIZE$taskCount = LAYOUT$taskCount.byteSize();
    public static final long SIZE$firstTask = LAYOUT$firstTask.byteSize();
}
