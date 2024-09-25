package tech.icey.vk4j.datatype;

import tech.icey.vk4j.NativeLayout;
import tech.icey.vk4j.annotation.enumtype;
import tech.icey.vk4j.annotation.pointer;
import tech.icey.vk4j.annotation.unsigned;
import tech.icey.vk4j.enumtype.VkStructureType;
import tech.icey.vk4j.handle.VkBuffer;

import java.lang.foreign.*;

import static java.lang.foreign.ValueLayout.*;
import static tech.icey.vk4j.enumtype.VkStructureType.VK_STRUCTURE_TYPE_GEOMETRY_AABB_NV;

public record VkGeometryAABBNV(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("aabbData"),
        ValueLayout.JAVA_INT.withName("numAABBs"),
        ValueLayout.JAVA_INT.withName("stride"),
        ValueLayout.JAVA_LONG.withName("offset")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$aabbData = PathElement.groupElement("aabbData");
    public static final PathElement PATH$numAABBs = PathElement.groupElement("numAABBs");
    public static final PathElement PATH$stride = PathElement.groupElement("stride");
    public static final PathElement PATH$offset = PathElement.groupElement("offset");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final AddressLayout LAYOUT$aabbData = (AddressLayout) LAYOUT.select(PATH$aabbData);
    public static final OfInt LAYOUT$numAABBs = (OfInt) LAYOUT.select(PATH$numAABBs);
    public static final OfInt LAYOUT$stride = (OfInt) LAYOUT.select(PATH$stride);
    public static final OfLong LAYOUT$offset = (OfLong) LAYOUT.select(PATH$offset);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$aabbData = LAYOUT.byteOffset(PATH$aabbData);
    public static final long OFFSET$numAABBs = LAYOUT.byteOffset(PATH$numAABBs);
    public static final long OFFSET$stride = LAYOUT.byteOffset(PATH$stride);
    public static final long OFFSET$offset = LAYOUT.byteOffset(PATH$offset);

    public VkGeometryAABBNV(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_GEOMETRY_AABB_NV);
    }

    public @enumtype(VkStructureType.class) int sType() {
        return segment.get(LAYOUT$sType, OFFSET$sType);
    }

    public void sType(@enumtype(VkStructureType.class) int value) {
        segment.set(LAYOUT$sType, OFFSET$sType, value);
    }

    public @pointer(comment="void*") MemorySegment pNext() {
        return segment.get(LAYOUT$pNext, OFFSET$pNext);
    }

    public void pNext(@pointer(comment="void*") MemorySegment value) {
        segment.set(LAYOUT$pNext, OFFSET$pNext, value);
    }

    public VkBuffer aabbData() {
        return new VkBuffer(segment.get(LAYOUT$aabbData, OFFSET$aabbData));
    }

    public void aabbData(VkBuffer value) {
        segment.set(LAYOUT$aabbData, OFFSET$aabbData, value.segment());
    }

    public @unsigned int numAABBs() {
        return segment.get(LAYOUT$numAABBs, OFFSET$numAABBs);
    }

    public void numAABBs(@unsigned int value) {
        segment.set(LAYOUT$numAABBs, OFFSET$numAABBs, value);
    }

    public @unsigned int stride() {
        return segment.get(LAYOUT$stride, OFFSET$stride);
    }

    public void stride(@unsigned int value) {
        segment.set(LAYOUT$stride, OFFSET$stride, value);
    }

    public @unsigned long offset() {
        return segment.get(LAYOUT$offset, OFFSET$offset);
    }

    public void offset(@unsigned long value) {
        segment.set(LAYOUT$offset, OFFSET$offset, value);
    }

    public static VkGeometryAABBNV allocate(Arena arena) {
        return new VkGeometryAABBNV(arena.allocate(LAYOUT));
    }

    public static VkGeometryAABBNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkGeometryAABBNV[] ret = new VkGeometryAABBNV[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkGeometryAABBNV(segment.asSlice(i * LAYOUT.byteSize(), LAYOUT.byteSize()));
        }
        return ret;
    }
}
