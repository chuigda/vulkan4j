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
/// typedef union VkAccelerationStructureGeometryDataKHR {
///     VkAccelerationStructureGeometryTrianglesDataKHR triangles;
///     VkAccelerationStructureGeometryAabbsDataKHR aabbs;
///     VkAccelerationStructureGeometryInstancesDataKHR instances;
/// } VkAccelerationStructureGeometryDataKHR;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkAccelerationStructureGeometryDataKHR.html">VkAccelerationStructureGeometryDataKHR</a>
public record VkAccelerationStructureGeometryDataKHR(MemorySegment segment) implements IPointer {
    public VkAccelerationStructureGeometryDataKHR(MemorySegment segment) {
        this.segment = segment;
    }

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

    public static VkAccelerationStructureGeometryDataKHR allocate(Arena arena) {
        return new VkAccelerationStructureGeometryDataKHR(arena.allocate(LAYOUT));
    }
    
    public static VkAccelerationStructureGeometryDataKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkAccelerationStructureGeometryDataKHR[] ret = new VkAccelerationStructureGeometryDataKHR[count];
        for (int i = 0; i < count; i++) {
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
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.unionLayout(
        VkAccelerationStructureGeometryTrianglesDataKHR.LAYOUT.withName("triangles"),
        VkAccelerationStructureGeometryAabbsDataKHR.LAYOUT.withName("aabbs"),
        VkAccelerationStructureGeometryInstancesDataKHR.LAYOUT.withName("instances")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$triangles = PathElement.groupElement("triangles");
    public static final PathElement PATH$aabbs = PathElement.groupElement("aabbs");
    public static final PathElement PATH$instances = PathElement.groupElement("instances");

    public static final StructLayout LAYOUT$triangles = (StructLayout) LAYOUT.select(PATH$triangles);
    public static final StructLayout LAYOUT$aabbs = (StructLayout) LAYOUT.select(PATH$aabbs);
    public static final StructLayout LAYOUT$instances = (StructLayout) LAYOUT.select(PATH$instances);

    public static final long OFFSET$triangles = LAYOUT.byteOffset(PATH$triangles);
    public static final long OFFSET$aabbs = LAYOUT.byteOffset(PATH$aabbs);
    public static final long OFFSET$instances = LAYOUT.byteOffset(PATH$instances);

    public static final long SIZE$triangles = LAYOUT$triangles.byteSize();
    public static final long SIZE$aabbs = LAYOUT$aabbs.byteSize();
    public static final long SIZE$instances = LAYOUT$instances.byteSize();
}
