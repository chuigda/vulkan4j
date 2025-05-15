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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkAccelerationStructureGeometryDataKHR.html">VkAccelerationStructureGeometryDataKHR</a>
@ValueBasedCandidate
public record VkAccelerationStructureGeometryDataKHR(@NotNull MemorySegment segment) implements IPointer {
    public static final StructLayout LAYOUT$triangles = VkAccelerationStructureGeometryTrianglesDataKHR.LAYOUT.withName("triangles");
    public static final StructLayout LAYOUT$aabbs = VkAccelerationStructureGeometryAabbsDataKHR.LAYOUT.withName("aabbs");
    public static final StructLayout LAYOUT$instances = VkAccelerationStructureGeometryInstancesDataKHR.LAYOUT.withName("instances");

    public static final MemoryLayout LAYOUT = NativeLayout.unionLayout(LAYOUT$triangles, LAYOUT$aabbs, LAYOUT$instances);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkAccelerationStructureGeometryDataKHR allocate(Arena arena) {
        return new VkAccelerationStructureGeometryDataKHR(arena.allocate(LAYOUT));
    }

    public static VkAccelerationStructureGeometryDataKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkAccelerationStructureGeometryDataKHR[] ret = new VkAccelerationStructureGeometryDataKHR[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkAccelerationStructureGeometryDataKHR(segment.asSlice(i * SIZE, SIZE));
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

    public static final PathElement PATH$triangles = PathElement.groupElement("PATH$triangles");
    public static final PathElement PATH$aabbs = PathElement.groupElement("PATH$aabbs");
    public static final PathElement PATH$instances = PathElement.groupElement("PATH$instances");

    public static final long SIZE$triangles = LAYOUT$triangles.byteSize();
    public static final long SIZE$aabbs = LAYOUT$aabbs.byteSize();
    public static final long SIZE$instances = LAYOUT$instances.byteSize();

    public static final long OFFSET$triangles = LAYOUT.byteOffset(PATH$triangles);
    public static final long OFFSET$aabbs = LAYOUT.byteOffset(PATH$aabbs);
    public static final long OFFSET$instances = LAYOUT.byteOffset(PATH$instances);

    public VkAccelerationStructureGeometryTrianglesDataKHR triangles() {
        return new VkAccelerationStructureGeometryTrianglesDataKHR(segment.asSlice(OFFSET$triangles, LAYOUT$triangles));
    }

    public void triangles(VkAccelerationStructureGeometryTrianglesDataKHR value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$triangles, SIZE$triangles);
    }

    public VkAccelerationStructureGeometryAabbsDataKHR aabbs() {
        return new VkAccelerationStructureGeometryAabbsDataKHR(segment.asSlice(OFFSET$aabbs, LAYOUT$aabbs));
    }

    public void aabbs(VkAccelerationStructureGeometryAabbsDataKHR value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$aabbs, SIZE$aabbs);
    }

    public VkAccelerationStructureGeometryInstancesDataKHR instances() {
        return new VkAccelerationStructureGeometryInstancesDataKHR(segment.asSlice(OFFSET$instances, LAYOUT$instances));
    }

    public void instances(VkAccelerationStructureGeometryInstancesDataKHR value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$instances, SIZE$instances);
    }

}
