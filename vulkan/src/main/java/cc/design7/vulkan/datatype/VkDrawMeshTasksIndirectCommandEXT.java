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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkDrawMeshTasksIndirectCommandEXT.html"><code>VkDrawMeshTasksIndirectCommandEXT</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkDrawMeshTasksIndirectCommandEXT {
///     uint32_t groupCountX;
///     uint32_t groupCountY;
///     uint32_t groupCountZ;
/// } VkDrawMeshTasksIndirectCommandEXT;
/// }
///
/// ## Contracts
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to)
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkDrawMeshTasksIndirectCommandEXT.html"><code>VkDrawMeshTasksIndirectCommandEXT</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkDrawMeshTasksIndirectCommandEXT(@NotNull MemorySegment segment) implements IPointer {
    public static VkDrawMeshTasksIndirectCommandEXT allocate(Arena arena) {
        VkDrawMeshTasksIndirectCommandEXT ret = new VkDrawMeshTasksIndirectCommandEXT(arena.allocate(LAYOUT));
        return ret;
    }

    public static VkDrawMeshTasksIndirectCommandEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkDrawMeshTasksIndirectCommandEXT[] ret = new VkDrawMeshTasksIndirectCommandEXT[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkDrawMeshTasksIndirectCommandEXT(segment.asSlice(i * BYTES, BYTES));
        }
        return ret;
    }

    public static VkDrawMeshTasksIndirectCommandEXT clone(Arena arena, VkDrawMeshTasksIndirectCommandEXT src) {
        VkDrawMeshTasksIndirectCommandEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkDrawMeshTasksIndirectCommandEXT[] clone(Arena arena, VkDrawMeshTasksIndirectCommandEXT[] src) {
        VkDrawMeshTasksIndirectCommandEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public @unsigned int groupCountX() {
        return segment.get(LAYOUT$groupCountX, OFFSET$groupCountX);
    }

    public void groupCountX(@unsigned int value) {
        segment.set(LAYOUT$groupCountX, OFFSET$groupCountX, value);
    }

    public @unsigned int groupCountY() {
        return segment.get(LAYOUT$groupCountY, OFFSET$groupCountY);
    }

    public void groupCountY(@unsigned int value) {
        segment.set(LAYOUT$groupCountY, OFFSET$groupCountY, value);
    }

    public @unsigned int groupCountZ() {
        return segment.get(LAYOUT$groupCountZ, OFFSET$groupCountZ);
    }

    public void groupCountZ(@unsigned int value) {
        segment.set(LAYOUT$groupCountZ, OFFSET$groupCountZ, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("groupCountX"),
        ValueLayout.JAVA_INT.withName("groupCountY"),
        ValueLayout.JAVA_INT.withName("groupCountZ")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$groupCountX = PathElement.groupElement("PATH$groupCountX");
    public static final PathElement PATH$groupCountY = PathElement.groupElement("PATH$groupCountY");
    public static final PathElement PATH$groupCountZ = PathElement.groupElement("PATH$groupCountZ");

    public static final OfInt LAYOUT$groupCountX = (OfInt) LAYOUT.select(PATH$groupCountX);
    public static final OfInt LAYOUT$groupCountY = (OfInt) LAYOUT.select(PATH$groupCountY);
    public static final OfInt LAYOUT$groupCountZ = (OfInt) LAYOUT.select(PATH$groupCountZ);

    public static final long SIZE$groupCountX = LAYOUT$groupCountX.byteSize();
    public static final long SIZE$groupCountY = LAYOUT$groupCountY.byteSize();
    public static final long SIZE$groupCountZ = LAYOUT$groupCountZ.byteSize();

    public static final long OFFSET$groupCountX = LAYOUT.byteOffset(PATH$groupCountX);
    public static final long OFFSET$groupCountY = LAYOUT.byteOffset(PATH$groupCountY);
    public static final long OFFSET$groupCountZ = LAYOUT.byteOffset(PATH$groupCountZ);
}
