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
/// typedef struct VkGeometryAABBNV {
///     VkStructureType sType;
///     const void* pNext;
///     VkBuffer aabbData;
///     uint32_t numAABBs;
///     uint32_t stride;
///     VkDeviceSize offset;
/// } VkGeometryAABBNV;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkGeometryAABBNV.html">VkGeometryAABBNV</a>
public record VkGeometryAABBNV(MemorySegment segment) implements IPointer {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("aabbData"),
        ValueLayout.JAVA_INT.withName("numAABBs"),
        ValueLayout.JAVA_INT.withName("stride"),
        ValueLayout.JAVA_LONG.withName("offset")
    );
    public static final long SIZE = LAYOUT.byteSize();

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

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$aabbData = LAYOUT$aabbData.byteSize();
    public static final long SIZE$numAABBs = LAYOUT$numAABBs.byteSize();
    public static final long SIZE$stride = LAYOUT$stride.byteSize();
    public static final long SIZE$offset = LAYOUT$offset.byteSize();

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

    public void pNext(IPointer pointer) {
        pNext(pointer.segment());
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
            ret[i] = new VkGeometryAABBNV(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
}
