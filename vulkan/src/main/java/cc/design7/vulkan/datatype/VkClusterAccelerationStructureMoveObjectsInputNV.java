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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkClusterAccelerationStructureMoveObjectsInputNV.html"><code>VkClusterAccelerationStructureMoveObjectsInputNV</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkClusterAccelerationStructureMoveObjectsInputNV {
///     VkStructureType sType;
///     void* pNext; // optional
///     VkClusterAccelerationStructureTypeNV type;
///     VkBool32 noMoveOverlap;
///     VkDeviceSize maxMovedBytes;
/// } VkClusterAccelerationStructureMoveObjectsInputNV;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_CLUSTER_ACCELERATION_STRUCTURE_MOVE_OBJECTS_INPUT_NV`
///
/// The {@link VkClusterAccelerationStructureMoveObjectsInputNV#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkClusterAccelerationStructureMoveObjectsInputNV#autoInit} to initialize these fields manually for
/// non-allocated instances.
///
/// ## Contracts
///
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to)
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkClusterAccelerationStructureMoveObjectsInputNV.html"><code>VkClusterAccelerationStructureMoveObjectsInputNV</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkClusterAccelerationStructureMoveObjectsInputNV(@NotNull MemorySegment segment) implements IPointer {
    public static VkClusterAccelerationStructureMoveObjectsInputNV allocate(Arena arena) {
        VkClusterAccelerationStructureMoveObjectsInputNV ret = new VkClusterAccelerationStructureMoveObjectsInputNV(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.CLUSTER_ACCELERATION_STRUCTURE_MOVE_OBJECTS_INPUT_NV);
        return ret;
    }

    public static VkClusterAccelerationStructureMoveObjectsInputNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkClusterAccelerationStructureMoveObjectsInputNV[] ret = new VkClusterAccelerationStructureMoveObjectsInputNV[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkClusterAccelerationStructureMoveObjectsInputNV(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.CLUSTER_ACCELERATION_STRUCTURE_MOVE_OBJECTS_INPUT_NV);
        }
        return ret;
    }

    public static VkClusterAccelerationStructureMoveObjectsInputNV clone(Arena arena, VkClusterAccelerationStructureMoveObjectsInputNV src) {
        VkClusterAccelerationStructureMoveObjectsInputNV ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkClusterAccelerationStructureMoveObjectsInputNV[] clone(Arena arena, VkClusterAccelerationStructureMoveObjectsInputNV[] src) {
        VkClusterAccelerationStructureMoveObjectsInputNV[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.CLUSTER_ACCELERATION_STRUCTURE_MOVE_OBJECTS_INPUT_NV);
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

    public @enumtype(VkClusterAccelerationStructureTypeNV.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public void type(@enumtype(VkClusterAccelerationStructureTypeNV.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
    }

    public @unsigned int noMoveOverlap() {
        return segment.get(LAYOUT$noMoveOverlap, OFFSET$noMoveOverlap);
    }

    public void noMoveOverlap(@unsigned int value) {
        segment.set(LAYOUT$noMoveOverlap, OFFSET$noMoveOverlap, value);
    }

    public @unsigned long maxMovedBytes() {
        return segment.get(LAYOUT$maxMovedBytes, OFFSET$maxMovedBytes);
    }

    public void maxMovedBytes(@unsigned long value) {
        segment.set(LAYOUT$maxMovedBytes, OFFSET$maxMovedBytes, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.JAVA_INT.withName("noMoveOverlap"),
        ValueLayout.JAVA_LONG.withName("maxMovedBytes")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$type = PathElement.groupElement("PATH$type");
    public static final PathElement PATH$noMoveOverlap = PathElement.groupElement("PATH$noMoveOverlap");
    public static final PathElement PATH$maxMovedBytes = PathElement.groupElement("PATH$maxMovedBytes");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final OfInt LAYOUT$noMoveOverlap = (OfInt) LAYOUT.select(PATH$noMoveOverlap);
    public static final OfLong LAYOUT$maxMovedBytes = (OfLong) LAYOUT.select(PATH$maxMovedBytes);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$noMoveOverlap = LAYOUT$noMoveOverlap.byteSize();
    public static final long SIZE$maxMovedBytes = LAYOUT$maxMovedBytes.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$noMoveOverlap = LAYOUT.byteOffset(PATH$noMoveOverlap);
    public static final long OFFSET$maxMovedBytes = LAYOUT.byteOffset(PATH$maxMovedBytes);
}
