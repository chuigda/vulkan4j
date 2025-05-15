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

/// Represents a pointer to a {@code VkGeometryAABBNV} structure in native memory.
///
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to)
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkGeometryAABBNV.html">VkGeometryAABBNV</a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkGeometryAABBNV(@NotNull MemorySegment segment) implements IPointer {
    public VkGeometryAABBNV {
        sType(VkStructureType.GEOMETRY_AABB_NV);
    }

    public static VkGeometryAABBNV allocate(Arena arena) {
        return new VkGeometryAABBNV(arena.allocate(LAYOUT));
    }

    public static VkGeometryAABBNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkGeometryAABBNV[] ret = new VkGeometryAABBNV[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkGeometryAABBNV(segment.asSlice(i * BYTES, BYTES));
        }
        return ret;
    }

    public static VkGeometryAABBNV clone(Arena arena, VkGeometryAABBNV src) {
        VkGeometryAABBNV ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkGeometryAABBNV[] clone(Arena arena, VkGeometryAABBNV[] src) {
        VkGeometryAABBNV[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("aabbData"),
        ValueLayout.JAVA_INT.withName("numAABBs"),
        ValueLayout.JAVA_INT.withName("stride"),
        ValueLayout.JAVA_LONG.withName("offset")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$aabbData = PathElement.groupElement("PATH$aabbData");
    public static final PathElement PATH$numAABBs = PathElement.groupElement("PATH$numAABBs");
    public static final PathElement PATH$stride = PathElement.groupElement("PATH$stride");
    public static final PathElement PATH$offset = PathElement.groupElement("PATH$offset");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final AddressLayout LAYOUT$aabbData = (AddressLayout) LAYOUT.select(PATH$aabbData);
    public static final OfInt LAYOUT$numAABBs = (OfInt) LAYOUT.select(PATH$numAABBs);
    public static final OfInt LAYOUT$stride = (OfInt) LAYOUT.select(PATH$stride);
    public static final OfLong LAYOUT$offset = (OfLong) LAYOUT.select(PATH$offset);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$aabbData = LAYOUT$aabbData.byteSize();
    public static final long SIZE$numAABBs = LAYOUT$numAABBs.byteSize();
    public static final long SIZE$stride = LAYOUT$stride.byteSize();
    public static final long SIZE$offset = LAYOUT$offset.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$aabbData = LAYOUT.byteOffset(PATH$aabbData);
    public static final long OFFSET$numAABBs = LAYOUT.byteOffset(PATH$numAABBs);
    public static final long OFFSET$stride = LAYOUT.byteOffset(PATH$stride);
    public static final long OFFSET$offset = LAYOUT.byteOffset(PATH$offset);

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

    public @Nullable VkBuffer aabbData() {
        MemorySegment s = segment.asSlice(OFFSET$aabbData, SIZE$aabbData);
        if (s.address() == 0) {
            return null;
        }
        return new VkBuffer(s);
    }

    public void aabbData(@Nullable VkBuffer value) {
        segment.set(LAYOUT$aabbData, OFFSET$aabbData, value != null ? value.segment() : MemorySegment.NULL);
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

}
