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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkAccelerationStructureGeometryDataKHR.html"><code>VkAccelerationStructureGeometryDataKHR</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkAccelerationStructureGeometryDataKHR {
///     VkAccelerationStructureGeometryTrianglesDataKHR triangles; // @link substring="VkAccelerationStructureGeometryTrianglesDataKHR" target="VkAccelerationStructureGeometryTrianglesDataKHR" @link substring="triangles" target="#triangles"
///     VkAccelerationStructureGeometryAabbsDataKHR aabbs; // @link substring="VkAccelerationStructureGeometryAabbsDataKHR" target="VkAccelerationStructureGeometryAabbsDataKHR" @link substring="aabbs" target="#aabbs"
///     VkAccelerationStructureGeometryInstancesDataKHR instances; // @link substring="VkAccelerationStructureGeometryInstancesDataKHR" target="VkAccelerationStructureGeometryInstancesDataKHR" @link substring="instances" target="#instances"
/// } VkAccelerationStructureGeometryDataKHR;
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkAccelerationStructureGeometryDataKHR.html"><code>VkAccelerationStructureGeometryDataKHR</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkAccelerationStructureGeometryDataKHR(@NotNull MemorySegment segment) implements IPointer {
    public static VkAccelerationStructureGeometryDataKHR allocate(Arena arena) {
        return new VkAccelerationStructureGeometryDataKHR(arena.allocate(LAYOUT));
    }

    public static VkAccelerationStructureGeometryDataKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkAccelerationStructureGeometryDataKHR[] ret = new VkAccelerationStructureGeometryDataKHR[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkAccelerationStructureGeometryDataKHR(segment.asSlice(i * BYTES, BYTES));
        }
        return ret;
    }

    public static VkAccelerationStructureGeometryDataKHR clone(Arena arena, VkAccelerationStructureGeometryDataKHR src) {
        VkAccelerationStructureGeometryDataKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkAccelerationStructureGeometryDataKHR[] clone(Arena arena, VkAccelerationStructureGeometryDataKHR[] src) {
        VkAccelerationStructureGeometryDataKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public @NotNull VkAccelerationStructureGeometryTrianglesDataKHR triangles() {
        return new VkAccelerationStructureGeometryTrianglesDataKHR(segment.asSlice(OFFSET$triangles, LAYOUT$triangles));
    }

    public void triangles(@NotNull VkAccelerationStructureGeometryTrianglesDataKHR value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$triangles, SIZE$triangles);
    }

    public @NotNull VkAccelerationStructureGeometryAabbsDataKHR aabbs() {
        return new VkAccelerationStructureGeometryAabbsDataKHR(segment.asSlice(OFFSET$aabbs, LAYOUT$aabbs));
    }

    public void aabbs(@NotNull VkAccelerationStructureGeometryAabbsDataKHR value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$aabbs, SIZE$aabbs);
    }

    public @NotNull VkAccelerationStructureGeometryInstancesDataKHR instances() {
        return new VkAccelerationStructureGeometryInstancesDataKHR(segment.asSlice(OFFSET$instances, LAYOUT$instances));
    }

    public void instances(@NotNull VkAccelerationStructureGeometryInstancesDataKHR value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$instances, SIZE$instances);
    }

    public static final UnionLayout LAYOUT = NativeLayout.unionLayout(
        VkAccelerationStructureGeometryTrianglesDataKHR.LAYOUT.withName("triangles"),
        VkAccelerationStructureGeometryAabbsDataKHR.LAYOUT.withName("aabbs"),
        VkAccelerationStructureGeometryInstancesDataKHR.LAYOUT.withName("instances")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$triangles = PathElement.groupElement("PATH$triangles");
    public static final PathElement PATH$aabbs = PathElement.groupElement("PATH$aabbs");
    public static final PathElement PATH$instances = PathElement.groupElement("PATH$instances");

    public static final StructLayout LAYOUT$triangles = (StructLayout) LAYOUT.select(PATH$triangles);
    public static final StructLayout LAYOUT$aabbs = (StructLayout) LAYOUT.select(PATH$aabbs);
    public static final StructLayout LAYOUT$instances = (StructLayout) LAYOUT.select(PATH$instances);

    public static final long SIZE$triangles = LAYOUT$triangles.byteSize();
    public static final long SIZE$aabbs = LAYOUT$aabbs.byteSize();
    public static final long SIZE$instances = LAYOUT$instances.byteSize();

    public static final long OFFSET$triangles = LAYOUT.byteOffset(PATH$triangles);
    public static final long OFFSET$aabbs = LAYOUT.byteOffset(PATH$aabbs);
    public static final long OFFSET$instances = LAYOUT.byteOffset(PATH$instances);
}
