package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.annotation.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.buffer.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import tech.icey.vk4j.NativeLayout;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

public record VkGeometryDataNV(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        VkGeometryTrianglesNV.LAYOUT.withName("triangles"),
        VkGeometryAABBNV.LAYOUT.withName("aabbs")
    );

    public static final PathElement PATH$triangles = PathElement.groupElement("triangles");
    public static final PathElement PATH$aabbs = PathElement.groupElement("aabbs");

    public static final StructLayout LAYOUT$triangles = (StructLayout) LAYOUT.select(PATH$triangles);
    public static final StructLayout LAYOUT$aabbs = (StructLayout) LAYOUT.select(PATH$aabbs);

    public static final long OFFSET$triangles = LAYOUT.byteOffset(PATH$triangles);
    public static final long OFFSET$aabbs = LAYOUT.byteOffset(PATH$aabbs);

    public VkGeometryDataNV(MemorySegment segment) {
        this.segment = segment;
    }

    public VkGeometryTrianglesNV triangles() {
        return new VkGeometryTrianglesNV(segment.asSlice(OFFSET$triangles, LAYOUT$triangles));
    }

    public void triangles(VkGeometryTrianglesNV value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$triangles, LAYOUT$triangles.byteSize());
    }

    public VkGeometryAABBNV aabbs() {
        return new VkGeometryAABBNV(segment.asSlice(OFFSET$aabbs, LAYOUT$aabbs));
    }

    public void aabbs(VkGeometryAABBNV value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$aabbs, LAYOUT$aabbs.byteSize());
    }

    public static VkGeometryDataNV allocate(Arena arena) {
        return new VkGeometryDataNV(arena.allocate(LAYOUT));
    }
    
    public static VkGeometryDataNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkGeometryDataNV[] ret = new VkGeometryDataNV[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkGeometryDataNV(segment.asSlice(i * LAYOUT.byteSize(), LAYOUT.byteSize()));
        }
        return ret;
    }
}
