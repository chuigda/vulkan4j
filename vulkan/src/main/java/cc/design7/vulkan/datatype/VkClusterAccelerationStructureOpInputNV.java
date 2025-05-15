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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkClusterAccelerationStructureOpInputNV.html"><code>VkClusterAccelerationStructureOpInputNV</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkClusterAccelerationStructureOpInputNV {
///     VkClusterAccelerationStructureClustersBottomLevelInputNV* pClustersBottomLevel;
///     VkClusterAccelerationStructureTriangleClusterInputNV* pTriangleClusters;
///     VkClusterAccelerationStructureMoveObjectsInputNV* pMoveObjects;
/// } VkClusterAccelerationStructureOpInputNV;
/// }
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkClusterAccelerationStructureOpInputNV.html"><code>VkClusterAccelerationStructureOpInputNV</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkClusterAccelerationStructureOpInputNV(@NotNull MemorySegment segment) implements IPointer {
    public static VkClusterAccelerationStructureOpInputNV allocate(Arena arena) {
        VkClusterAccelerationStructureOpInputNV ret = new VkClusterAccelerationStructureOpInputNV(arena.allocate(LAYOUT));
        return ret;
    }

    public static VkClusterAccelerationStructureOpInputNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkClusterAccelerationStructureOpInputNV[] ret = new VkClusterAccelerationStructureOpInputNV[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkClusterAccelerationStructureOpInputNV(segment.asSlice(i * BYTES, BYTES));
        }
        return ret;
    }

    public static VkClusterAccelerationStructureOpInputNV clone(Arena arena, VkClusterAccelerationStructureOpInputNV src) {
        VkClusterAccelerationStructureOpInputNV ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkClusterAccelerationStructureOpInputNV[] clone(Arena arena, VkClusterAccelerationStructureOpInputNV[] src) {
        VkClusterAccelerationStructureOpInputNV[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public @pointer(comment="VkClusterAccelerationStructureClustersBottomLevelInputNV*") MemorySegment pClustersBottomLevelRaw() {
        return segment.get(LAYOUT$pClustersBottomLevel, OFFSET$pClustersBottomLevel);
    }

    public void pClustersBottomLevelRaw(@pointer(comment="VkClusterAccelerationStructureClustersBottomLevelInputNV*") MemorySegment value) {
        segment.set(LAYOUT$pClustersBottomLevel, OFFSET$pClustersBottomLevel, value);
    }

    public @Nullable VkClusterAccelerationStructureClustersBottomLevelInputNV pClustersBottomLevel() {
        MemorySegment s = pClustersBottomLevelRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkClusterAccelerationStructureClustersBottomLevelInputNV(s);
    }

    public void pClustersBottomLevel(@Nullable VkClusterAccelerationStructureClustersBottomLevelInputNV value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pClustersBottomLevelRaw(s);
    }

    @unsafe public @Nullable VkClusterAccelerationStructureClustersBottomLevelInputNV[] pClustersBottomLevel(int assumedCount) {
        MemorySegment s = pClustersBottomLevelRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkClusterAccelerationStructureClustersBottomLevelInputNV.BYTES);
        VkClusterAccelerationStructureClustersBottomLevelInputNV[] ret = new VkClusterAccelerationStructureClustersBottomLevelInputNV[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkClusterAccelerationStructureClustersBottomLevelInputNV(s.asSlice(i * VkClusterAccelerationStructureClustersBottomLevelInputNV.BYTES, VkClusterAccelerationStructureClustersBottomLevelInputNV.BYTES));
        }
        return ret;
    }

    public @pointer(comment="VkClusterAccelerationStructureTriangleClusterInputNV*") MemorySegment pTriangleClustersRaw() {
        return segment.get(LAYOUT$pTriangleClusters, OFFSET$pTriangleClusters);
    }

    public void pTriangleClustersRaw(@pointer(comment="VkClusterAccelerationStructureTriangleClusterInputNV*") MemorySegment value) {
        segment.set(LAYOUT$pTriangleClusters, OFFSET$pTriangleClusters, value);
    }

    public @Nullable VkClusterAccelerationStructureTriangleClusterInputNV pTriangleClusters() {
        MemorySegment s = pTriangleClustersRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkClusterAccelerationStructureTriangleClusterInputNV(s);
    }

    public void pTriangleClusters(@Nullable VkClusterAccelerationStructureTriangleClusterInputNV value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pTriangleClustersRaw(s);
    }

    @unsafe public @Nullable VkClusterAccelerationStructureTriangleClusterInputNV[] pTriangleClusters(int assumedCount) {
        MemorySegment s = pTriangleClustersRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkClusterAccelerationStructureTriangleClusterInputNV.BYTES);
        VkClusterAccelerationStructureTriangleClusterInputNV[] ret = new VkClusterAccelerationStructureTriangleClusterInputNV[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkClusterAccelerationStructureTriangleClusterInputNV(s.asSlice(i * VkClusterAccelerationStructureTriangleClusterInputNV.BYTES, VkClusterAccelerationStructureTriangleClusterInputNV.BYTES));
        }
        return ret;
    }

    public @pointer(comment="VkClusterAccelerationStructureMoveObjectsInputNV*") MemorySegment pMoveObjectsRaw() {
        return segment.get(LAYOUT$pMoveObjects, OFFSET$pMoveObjects);
    }

    public void pMoveObjectsRaw(@pointer(comment="VkClusterAccelerationStructureMoveObjectsInputNV*") MemorySegment value) {
        segment.set(LAYOUT$pMoveObjects, OFFSET$pMoveObjects, value);
    }

    public @Nullable VkClusterAccelerationStructureMoveObjectsInputNV pMoveObjects() {
        MemorySegment s = pMoveObjectsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkClusterAccelerationStructureMoveObjectsInputNV(s);
    }

    public void pMoveObjects(@Nullable VkClusterAccelerationStructureMoveObjectsInputNV value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pMoveObjectsRaw(s);
    }

    @unsafe public @Nullable VkClusterAccelerationStructureMoveObjectsInputNV[] pMoveObjects(int assumedCount) {
        MemorySegment s = pMoveObjectsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkClusterAccelerationStructureMoveObjectsInputNV.BYTES);
        VkClusterAccelerationStructureMoveObjectsInputNV[] ret = new VkClusterAccelerationStructureMoveObjectsInputNV[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkClusterAccelerationStructureMoveObjectsInputNV(s.asSlice(i * VkClusterAccelerationStructureMoveObjectsInputNV.BYTES, VkClusterAccelerationStructureMoveObjectsInputNV.BYTES));
        }
        return ret;
    }

    public static final UnionLayout LAYOUT = NativeLayout.unionLayout(
        ValueLayout.ADDRESS.withTargetLayout(VkClusterAccelerationStructureClustersBottomLevelInputNV.LAYOUT).withName("pClustersBottomLevel"),
        ValueLayout.ADDRESS.withTargetLayout(VkClusterAccelerationStructureTriangleClusterInputNV.LAYOUT).withName("pTriangleClusters"),
        ValueLayout.ADDRESS.withTargetLayout(VkClusterAccelerationStructureMoveObjectsInputNV.LAYOUT).withName("pMoveObjects")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$pClustersBottomLevel = PathElement.groupElement("PATH$pClustersBottomLevel");
    public static final PathElement PATH$pTriangleClusters = PathElement.groupElement("PATH$pTriangleClusters");
    public static final PathElement PATH$pMoveObjects = PathElement.groupElement("PATH$pMoveObjects");

    public static final AddressLayout LAYOUT$pClustersBottomLevel = (AddressLayout) LAYOUT.select(PATH$pClustersBottomLevel);
    public static final AddressLayout LAYOUT$pTriangleClusters = (AddressLayout) LAYOUT.select(PATH$pTriangleClusters);
    public static final AddressLayout LAYOUT$pMoveObjects = (AddressLayout) LAYOUT.select(PATH$pMoveObjects);

    public static final long SIZE$pClustersBottomLevel = LAYOUT$pClustersBottomLevel.byteSize();
    public static final long SIZE$pTriangleClusters = LAYOUT$pTriangleClusters.byteSize();
    public static final long SIZE$pMoveObjects = LAYOUT$pMoveObjects.byteSize();

    public static final long OFFSET$pClustersBottomLevel = LAYOUT.byteOffset(PATH$pClustersBottomLevel);
    public static final long OFFSET$pTriangleClusters = LAYOUT.byteOffset(PATH$pTriangleClusters);
    public static final long OFFSET$pMoveObjects = LAYOUT.byteOffset(PATH$pMoveObjects);
}
