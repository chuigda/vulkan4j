package club.doki7.vulkan.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import club.doki7.ffm.IPointer;
import club.doki7.ffm.NativeLayout;
import club.doki7.ffm.annotation.*;
import club.doki7.ffm.ptr.*;
import club.doki7.vulkan.bitmask.*;
import club.doki7.vulkan.handle.*;
import club.doki7.vulkan.enumtype.*;
import static club.doki7.vulkan.VkConstants.*;

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkDrawMeshTasksIndirectCommandNV.html"><code>VkDrawMeshTasksIndirectCommandNV</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkDrawMeshTasksIndirectCommandNV {
///     uint32_t taskCount; // @link substring="taskCount" target="#taskCount"
///     uint32_t firstTask; // @link substring="firstTask" target="#firstTask"
/// } VkDrawMeshTasksIndirectCommandNV;
/// }
///
/// ## Contracts
///
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to)
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkDrawMeshTasksIndirectCommandNV.html"><code>VkDrawMeshTasksIndirectCommandNV</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkDrawMeshTasksIndirectCommandNV(@NotNull MemorySegment segment) implements IPointer {
    public static VkDrawMeshTasksIndirectCommandNV allocate(Arena arena) {
        VkDrawMeshTasksIndirectCommandNV ret = new VkDrawMeshTasksIndirectCommandNV(arena.allocate(LAYOUT));
        return ret;
    }

    public static VkDrawMeshTasksIndirectCommandNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkDrawMeshTasksIndirectCommandNV[] ret = new VkDrawMeshTasksIndirectCommandNV[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkDrawMeshTasksIndirectCommandNV(segment.asSlice(i * BYTES, BYTES));
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

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("taskCount"),
        ValueLayout.JAVA_INT.withName("firstTask")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$taskCount = PathElement.groupElement("PATH$taskCount");
    public static final PathElement PATH$firstTask = PathElement.groupElement("PATH$firstTask");

    public static final OfInt LAYOUT$taskCount = (OfInt) LAYOUT.select(PATH$taskCount);
    public static final OfInt LAYOUT$firstTask = (OfInt) LAYOUT.select(PATH$firstTask);

    public static final long SIZE$taskCount = LAYOUT$taskCount.byteSize();
    public static final long SIZE$firstTask = LAYOUT$firstTask.byteSize();

    public static final long OFFSET$taskCount = LAYOUT.byteOffset(PATH$taskCount);
    public static final long OFFSET$firstTask = LAYOUT.byteOffset(PATH$firstTask);
}
