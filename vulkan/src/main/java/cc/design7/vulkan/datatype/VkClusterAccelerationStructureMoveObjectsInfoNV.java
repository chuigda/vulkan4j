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

/// Represents a pointer to a {@code VkClusterAccelerationStructureMoveObjectsInfoNV} structure in native memory.
///
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to)
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkClusterAccelerationStructureMoveObjectsInfoNV.html">VkClusterAccelerationStructureMoveObjectsInfoNV</a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkClusterAccelerationStructureMoveObjectsInfoNV(@NotNull MemorySegment segment) implements IPointer {
    public static VkClusterAccelerationStructureMoveObjectsInfoNV allocate(Arena arena) {
        return new VkClusterAccelerationStructureMoveObjectsInfoNV(arena.allocate(LAYOUT));
    }

    public static VkClusterAccelerationStructureMoveObjectsInfoNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkClusterAccelerationStructureMoveObjectsInfoNV[] ret = new VkClusterAccelerationStructureMoveObjectsInfoNV[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkClusterAccelerationStructureMoveObjectsInfoNV(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkClusterAccelerationStructureMoveObjectsInfoNV clone(Arena arena, VkClusterAccelerationStructureMoveObjectsInfoNV src) {
        VkClusterAccelerationStructureMoveObjectsInfoNV ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkClusterAccelerationStructureMoveObjectsInfoNV[] clone(Arena arena, VkClusterAccelerationStructureMoveObjectsInfoNV[] src) {
        VkClusterAccelerationStructureMoveObjectsInfoNV[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_LONG.withName("srcAccelerationStructure")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$srcAccelerationStructure = PathElement.groupElement("PATH$srcAccelerationStructure");

    public static final OfLong LAYOUT$srcAccelerationStructure = (OfLong) LAYOUT.select(PATH$srcAccelerationStructure);

    public static final long SIZE$srcAccelerationStructure = LAYOUT$srcAccelerationStructure.byteSize();

    public static final long OFFSET$srcAccelerationStructure = LAYOUT.byteOffset(PATH$srcAccelerationStructure);

    public @unsigned long srcAccelerationStructure() {
        return segment.get(LAYOUT$srcAccelerationStructure, OFFSET$srcAccelerationStructure);
    }

    public void srcAccelerationStructure(@unsigned long value) {
        segment.set(LAYOUT$srcAccelerationStructure, OFFSET$srcAccelerationStructure, value);
    }

}
