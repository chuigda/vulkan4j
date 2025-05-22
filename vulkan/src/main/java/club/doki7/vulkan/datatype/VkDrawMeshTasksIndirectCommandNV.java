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
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkDrawMeshTasksIndirectCommandNV.html"><code>VkDrawMeshTasksIndirectCommandNV</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkDrawMeshTasksIndirectCommandNV(@NotNull MemorySegment segment) implements IVkDrawMeshTasksIndirectCommandNV {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkDrawMeshTasksIndirectCommandNV.html"><code>VkDrawMeshTasksIndirectCommandNV</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link VkDrawMeshTasksIndirectCommandNV}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IVkDrawMeshTasksIndirectCommandNV to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code VkDrawMeshTasksIndirectCommandNV.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IVkDrawMeshTasksIndirectCommandNV {
        public long size() {
            return segment.byteSize() / VkDrawMeshTasksIndirectCommandNV.BYTES;
        }
        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull VkDrawMeshTasksIndirectCommandNV at(long index) {
            return new VkDrawMeshTasksIndirectCommandNV(segment.asSlice(index * VkDrawMeshTasksIndirectCommandNV.BYTES, VkDrawMeshTasksIndirectCommandNV.BYTES));
        }
        public void write(long index, @NotNull VkDrawMeshTasksIndirectCommandNV value) {
            MemorySegment s = segment.asSlice(index * VkDrawMeshTasksIndirectCommandNV.BYTES, VkDrawMeshTasksIndirectCommandNV.BYTES);
            s.copyFrom(value.segment);
        }
    }
    public static VkDrawMeshTasksIndirectCommandNV allocate(Arena arena) {
        return new VkDrawMeshTasksIndirectCommandNV(arena.allocate(LAYOUT));
    }

    public static VkDrawMeshTasksIndirectCommandNV.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkDrawMeshTasksIndirectCommandNV.Ptr ret = new VkDrawMeshTasksIndirectCommandNV.Ptr(segment);
        for (long i = 0; i < count; i ++) {
        }
        return ret;
    }

    public static VkDrawMeshTasksIndirectCommandNV clone(Arena arena, VkDrawMeshTasksIndirectCommandNV src) {
        VkDrawMeshTasksIndirectCommandNV ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
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

    public static final PathElement PATH$taskCount = PathElement.groupElement("taskCount");
    public static final PathElement PATH$firstTask = PathElement.groupElement("firstTask");

    public static final OfInt LAYOUT$taskCount = (OfInt) LAYOUT.select(PATH$taskCount);
    public static final OfInt LAYOUT$firstTask = (OfInt) LAYOUT.select(PATH$firstTask);

    public static final long SIZE$taskCount = LAYOUT$taskCount.byteSize();
    public static final long SIZE$firstTask = LAYOUT$firstTask.byteSize();

    public static final long OFFSET$taskCount = LAYOUT.byteOffset(PATH$taskCount);
    public static final long OFFSET$firstTask = LAYOUT.byteOffset(PATH$firstTask);
}
