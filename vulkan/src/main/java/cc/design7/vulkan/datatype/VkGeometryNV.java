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

/// Represents a pointer to a {@code VkGeometryNV} structure in native memory.
///
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to)
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkGeometryNV.html">VkGeometryNV</a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkGeometryNV(@NotNull MemorySegment segment) implements IPointer {
    public VkGeometryNV {
        sType(VkStructureType.GEOMETRY_NV);
    }

    public static VkGeometryNV allocate(Arena arena) {
        return new VkGeometryNV(arena.allocate(LAYOUT));
    }

    public static VkGeometryNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkGeometryNV[] ret = new VkGeometryNV[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkGeometryNV(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkGeometryNV clone(Arena arena, VkGeometryNV src) {
        VkGeometryNV ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkGeometryNV[] clone(Arena arena, VkGeometryNV[] src) {
        VkGeometryNV[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("geometryType"),
        VkGeometryDataNV.LAYOUT.withName("geometry"),
        ValueLayout.JAVA_INT.withName("flags")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$geometryType = PathElement.groupElement("PATH$geometryType");
    public static final PathElement PATH$geometry = PathElement.groupElement("PATH$geometry");
    public static final PathElement PATH$flags = PathElement.groupElement("PATH$flags");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$geometryType = (OfInt) LAYOUT.select(PATH$geometryType);
    public static final StructLayout LAYOUT$geometry = (StructLayout) LAYOUT.select(PATH$geometry);
    public static final OfInt LAYOUT$flags = (OfInt) LAYOUT.select(PATH$flags);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$geometryType = LAYOUT$geometryType.byteSize();
    public static final long SIZE$geometry = LAYOUT$geometry.byteSize();
    public static final long SIZE$flags = LAYOUT$flags.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$geometryType = LAYOUT.byteOffset(PATH$geometryType);
    public static final long OFFSET$geometry = LAYOUT.byteOffset(PATH$geometry);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);

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

    public @enumtype(VkGeometryTypeKHR.class) int geometryType() {
        return segment.get(LAYOUT$geometryType, OFFSET$geometryType);
    }

    public void geometryType(@enumtype(VkGeometryTypeKHR.class) int value) {
        segment.set(LAYOUT$geometryType, OFFSET$geometryType, value);
    }

    public VkGeometryDataNV geometry() {
        return new VkGeometryDataNV(segment.asSlice(OFFSET$geometry, LAYOUT$geometry));
    }

    public void geometry(VkGeometryDataNV value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$geometry, SIZE$geometry);
    }

    public @enumtype(VkGeometryFlagsKHR.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public void flags(@enumtype(VkGeometryFlagsKHR.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
    }

}
