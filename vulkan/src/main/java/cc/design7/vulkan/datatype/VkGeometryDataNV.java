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

/// Represents a pointer to a {@code VkGeometryDataNV} structure in native memory.
///
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to)
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkGeometryDataNV.html">VkGeometryDataNV</a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkGeometryDataNV(@NotNull MemorySegment segment) implements IPointer {
    public static VkGeometryDataNV allocate(Arena arena) {
        return new VkGeometryDataNV(arena.allocate(LAYOUT));
    }

    public static VkGeometryDataNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkGeometryDataNV[] ret = new VkGeometryDataNV[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkGeometryDataNV(segment.asSlice(i * BYTES, BYTES));
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

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        VkGeometryTrianglesNV.LAYOUT.withName("triangles"),
        VkGeometryAABBNV.LAYOUT.withName("aabbs")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$triangles = PathElement.groupElement("PATH$triangles");
    public static final PathElement PATH$aabbs = PathElement.groupElement("PATH$aabbs");

    public static final StructLayout LAYOUT$triangles = (StructLayout) LAYOUT.select(PATH$triangles);
    public static final StructLayout LAYOUT$aabbs = (StructLayout) LAYOUT.select(PATH$aabbs);

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
