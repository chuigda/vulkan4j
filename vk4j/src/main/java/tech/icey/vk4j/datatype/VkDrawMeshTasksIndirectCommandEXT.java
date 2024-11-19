package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import org.jetbrains.annotations.Nullable;
import tech.icey.panama.IPointer;
import tech.icey.panama.NativeLayout;
import tech.icey.panama.annotation.*;
import tech.icey.panama.buffer.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

/// {@snippet lang=c :
/// typedef struct VkDrawMeshTasksIndirectCommandEXT {
///     uint32_t groupCountX;
///     uint32_t groupCountY;
///     uint32_t groupCountZ;
/// } VkDrawMeshTasksIndirectCommandEXT;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkDrawMeshTasksIndirectCommandEXT.html">VkDrawMeshTasksIndirectCommandEXT</a>
public record VkDrawMeshTasksIndirectCommandEXT(MemorySegment segment) implements IPointer {
    public VkDrawMeshTasksIndirectCommandEXT(MemorySegment segment) {
        this.segment = segment;
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

    public static VkDrawMeshTasksIndirectCommandEXT allocate(Arena arena) {
        return new VkDrawMeshTasksIndirectCommandEXT(arena.allocate(LAYOUT));
    }

    public static VkDrawMeshTasksIndirectCommandEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkDrawMeshTasksIndirectCommandEXT[] ret = new VkDrawMeshTasksIndirectCommandEXT[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkDrawMeshTasksIndirectCommandEXT(segment.asSlice(i * SIZE, SIZE));
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
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("groupCountX"),
        ValueLayout.JAVA_INT.withName("groupCountY"),
        ValueLayout.JAVA_INT.withName("groupCountZ")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$groupCountX = PathElement.groupElement("groupCountX");
    public static final PathElement PATH$groupCountY = PathElement.groupElement("groupCountY");
    public static final PathElement PATH$groupCountZ = PathElement.groupElement("groupCountZ");

    public static final OfInt LAYOUT$groupCountX = (OfInt) LAYOUT.select(PATH$groupCountX);
    public static final OfInt LAYOUT$groupCountY = (OfInt) LAYOUT.select(PATH$groupCountY);
    public static final OfInt LAYOUT$groupCountZ = (OfInt) LAYOUT.select(PATH$groupCountZ);

    public static final long OFFSET$groupCountX = LAYOUT.byteOffset(PATH$groupCountX);
    public static final long OFFSET$groupCountY = LAYOUT.byteOffset(PATH$groupCountY);
    public static final long OFFSET$groupCountZ = LAYOUT.byteOffset(PATH$groupCountZ);

    public static final long SIZE$groupCountX = LAYOUT$groupCountX.byteSize();
    public static final long SIZE$groupCountY = LAYOUT$groupCountY.byteSize();
    public static final long SIZE$groupCountZ = LAYOUT$groupCountZ.byteSize();
}
