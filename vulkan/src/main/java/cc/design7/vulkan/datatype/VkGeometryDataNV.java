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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkGeometryDataNV.html">VkGeometryDataNV</a>
@ValueBasedCandidate
public record VkGeometryDataNV(@NotNull MemorySegment segment) implements IPointer {
    public static final StructLayout LAYOUT$triangles = VkGeometryTrianglesNV.LAYOUT.withName("triangles");
    public static final StructLayout LAYOUT$aabbs = VkGeometryAABBNV.LAYOUT.withName("aabbs");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$triangles, LAYOUT$aabbs);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkGeometryDataNV allocate(Arena arena) {
        return new VkGeometryDataNV(arena.allocate(LAYOUT));
    }

    public static VkGeometryDataNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkGeometryDataNV[] ret = new VkGeometryDataNV[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkGeometryDataNV(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkGeometryDataNV clone(Arena arena, VkGeometryDataNV src) {
        VkGeometryDataNV ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkGeometryDataNV[] clone(Arena arena, VkGeometryDataNV[] src) {
        VkGeometryDataNV[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$triangles = PathElement.groupElement("PATH$triangles");
    public static final PathElement PATH$aabbs = PathElement.groupElement("PATH$aabbs");

    public static final long SIZE$triangles = LAYOUT$triangles.byteSize();
    public static final long SIZE$aabbs = LAYOUT$aabbs.byteSize();

    public static final long OFFSET$triangles = LAYOUT.byteOffset(PATH$triangles);
    public static final long OFFSET$aabbs = LAYOUT.byteOffset(PATH$aabbs);

    public VkGeometryTrianglesNV triangles() {
        return new VkGeometryTrianglesNV(segment.asSlice(OFFSET$triangles, LAYOUT$triangles));
    }

    public void triangles(VkGeometryTrianglesNV value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$triangles, SIZE$triangles);
    }

    public VkGeometryAABBNV aabbs() {
        return new VkGeometryAABBNV(segment.asSlice(OFFSET$aabbs, LAYOUT$aabbs));
    }

    public void aabbs(VkGeometryAABBNV value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$aabbs, SIZE$aabbs);
    }

}
