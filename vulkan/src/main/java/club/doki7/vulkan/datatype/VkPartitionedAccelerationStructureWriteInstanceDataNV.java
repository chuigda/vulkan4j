package club.doki7.vulkan.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import club.doki7.ffm.IPointer;
import club.doki7.ffm.NativeLayout;
import club.doki7.ffm.annotation.*;
import club.doki7.ffm.ptr.*;
import club.doki7.vulkan.bitmask.*;
import club.doki7.vulkan.handle.*;
import club.doki7.vulkan.enumtype.*;
import static club.doki7.vulkan.VkConstants.*;

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPartitionedAccelerationStructureWriteInstanceDataNV.html"><code>VkPartitionedAccelerationStructureWriteInstanceDataNV</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkPartitionedAccelerationStructureWriteInstanceDataNV {
///     VkTransformMatrixKHR transform; // @link substring="VkTransformMatrixKHR" target="VkTransformMatrixKHR" @link substring="transform" target="#transform"
///     float explicitAABB; // @link substring="explicitAABB" target="#explicitAABB"
///     uint32_t instanceID; // @link substring="instanceID" target="#instanceID"
///     uint32_t instanceMask; // @link substring="instanceMask" target="#instanceMask"
///     uint32_t instanceContributionToHitGroupIndex; // @link substring="instanceContributionToHitGroupIndex" target="#instanceContributionToHitGroupIndex"
///     VkPartitionedAccelerationStructureInstanceFlagsNV instanceFlags; // optional // @link substring="VkPartitionedAccelerationStructureInstanceFlagsNV" target="VkPartitionedAccelerationStructureInstanceFlagsNV" @link substring="instanceFlags" target="#instanceFlags"
///     uint32_t instanceIndex; // @link substring="instanceIndex" target="#instanceIndex"
///     uint32_t partitionIndex; // @link substring="partitionIndex" target="#partitionIndex"
///     VkDeviceAddress accelerationStructure; // @link substring="accelerationStructure" target="#accelerationStructure"
/// } VkPartitionedAccelerationStructureWriteInstanceDataNV;
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPartitionedAccelerationStructureWriteInstanceDataNV.html"><code>VkPartitionedAccelerationStructureWriteInstanceDataNV</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkPartitionedAccelerationStructureWriteInstanceDataNV(@NotNull MemorySegment segment) implements IPointer {
    public static VkPartitionedAccelerationStructureWriteInstanceDataNV allocate(Arena arena) {
        VkPartitionedAccelerationStructureWriteInstanceDataNV ret = new VkPartitionedAccelerationStructureWriteInstanceDataNV(arena.allocate(LAYOUT));
        return ret;
    }

    public static VkPartitionedAccelerationStructureWriteInstanceDataNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPartitionedAccelerationStructureWriteInstanceDataNV[] ret = new VkPartitionedAccelerationStructureWriteInstanceDataNV[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPartitionedAccelerationStructureWriteInstanceDataNV(segment.asSlice(i * BYTES, BYTES));
        }
        return ret;
    }

    public static VkPartitionedAccelerationStructureWriteInstanceDataNV clone(Arena arena, VkPartitionedAccelerationStructureWriteInstanceDataNV src) {
        VkPartitionedAccelerationStructureWriteInstanceDataNV ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPartitionedAccelerationStructureWriteInstanceDataNV[] clone(Arena arena, VkPartitionedAccelerationStructureWriteInstanceDataNV[] src) {
        VkPartitionedAccelerationStructureWriteInstanceDataNV[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public @NotNull VkTransformMatrixKHR transform() {
        return new VkTransformMatrixKHR(segment.asSlice(OFFSET$transform, LAYOUT$transform));
    }

    public void transform(@NotNull VkTransformMatrixKHR value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$transform, SIZE$transform);
    }

    public float explicitAABB() {
        return segment.get(LAYOUT$explicitAABB, OFFSET$explicitAABB);
    }

    public void explicitAABB(float value) {
        segment.set(LAYOUT$explicitAABB, OFFSET$explicitAABB, value);
    }

    public @unsigned int instanceID() {
        return segment.get(LAYOUT$instanceID, OFFSET$instanceID);
    }

    public void instanceID(@unsigned int value) {
        segment.set(LAYOUT$instanceID, OFFSET$instanceID, value);
    }

    public @unsigned int instanceMask() {
        return segment.get(LAYOUT$instanceMask, OFFSET$instanceMask);
    }

    public void instanceMask(@unsigned int value) {
        segment.set(LAYOUT$instanceMask, OFFSET$instanceMask, value);
    }

    public @unsigned int instanceContributionToHitGroupIndex() {
        return segment.get(LAYOUT$instanceContributionToHitGroupIndex, OFFSET$instanceContributionToHitGroupIndex);
    }

    public void instanceContributionToHitGroupIndex(@unsigned int value) {
        segment.set(LAYOUT$instanceContributionToHitGroupIndex, OFFSET$instanceContributionToHitGroupIndex, value);
    }

    public @enumtype(VkPartitionedAccelerationStructureInstanceFlagsNV.class) int instanceFlags() {
        return segment.get(LAYOUT$instanceFlags, OFFSET$instanceFlags);
    }

    public void instanceFlags(@enumtype(VkPartitionedAccelerationStructureInstanceFlagsNV.class) int value) {
        segment.set(LAYOUT$instanceFlags, OFFSET$instanceFlags, value);
    }

    public @unsigned int instanceIndex() {
        return segment.get(LAYOUT$instanceIndex, OFFSET$instanceIndex);
    }

    public void instanceIndex(@unsigned int value) {
        segment.set(LAYOUT$instanceIndex, OFFSET$instanceIndex, value);
    }

    public @unsigned int partitionIndex() {
        return segment.get(LAYOUT$partitionIndex, OFFSET$partitionIndex);
    }

    public void partitionIndex(@unsigned int value) {
        segment.set(LAYOUT$partitionIndex, OFFSET$partitionIndex, value);
    }

    public @unsigned long accelerationStructure() {
        return segment.get(LAYOUT$accelerationStructure, OFFSET$accelerationStructure);
    }

    public void accelerationStructure(@unsigned long value) {
        segment.set(LAYOUT$accelerationStructure, OFFSET$accelerationStructure, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        VkTransformMatrixKHR.LAYOUT.withName("transform"),
        ValueLayout.JAVA_FLOAT.withName("explicitAABB"),
        ValueLayout.JAVA_INT.withName("instanceID"),
        ValueLayout.JAVA_INT.withName("instanceMask"),
        ValueLayout.JAVA_INT.withName("instanceContributionToHitGroupIndex"),
        ValueLayout.JAVA_INT.withName("instanceFlags"),
        ValueLayout.JAVA_INT.withName("instanceIndex"),
        ValueLayout.JAVA_INT.withName("partitionIndex"),
        ValueLayout.JAVA_LONG.withName("accelerationStructure")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$transform = PathElement.groupElement("PATH$transform");
    public static final PathElement PATH$explicitAABB = PathElement.groupElement("PATH$explicitAABB");
    public static final PathElement PATH$instanceID = PathElement.groupElement("PATH$instanceID");
    public static final PathElement PATH$instanceMask = PathElement.groupElement("PATH$instanceMask");
    public static final PathElement PATH$instanceContributionToHitGroupIndex = PathElement.groupElement("PATH$instanceContributionToHitGroupIndex");
    public static final PathElement PATH$instanceFlags = PathElement.groupElement("PATH$instanceFlags");
    public static final PathElement PATH$instanceIndex = PathElement.groupElement("PATH$instanceIndex");
    public static final PathElement PATH$partitionIndex = PathElement.groupElement("PATH$partitionIndex");
    public static final PathElement PATH$accelerationStructure = PathElement.groupElement("PATH$accelerationStructure");

    public static final StructLayout LAYOUT$transform = (StructLayout) LAYOUT.select(PATH$transform);
    public static final OfFloat LAYOUT$explicitAABB = (OfFloat) LAYOUT.select(PATH$explicitAABB);
    public static final OfInt LAYOUT$instanceID = (OfInt) LAYOUT.select(PATH$instanceID);
    public static final OfInt LAYOUT$instanceMask = (OfInt) LAYOUT.select(PATH$instanceMask);
    public static final OfInt LAYOUT$instanceContributionToHitGroupIndex = (OfInt) LAYOUT.select(PATH$instanceContributionToHitGroupIndex);
    public static final OfInt LAYOUT$instanceFlags = (OfInt) LAYOUT.select(PATH$instanceFlags);
    public static final OfInt LAYOUT$instanceIndex = (OfInt) LAYOUT.select(PATH$instanceIndex);
    public static final OfInt LAYOUT$partitionIndex = (OfInt) LAYOUT.select(PATH$partitionIndex);
    public static final OfLong LAYOUT$accelerationStructure = (OfLong) LAYOUT.select(PATH$accelerationStructure);

    public static final long SIZE$transform = LAYOUT$transform.byteSize();
    public static final long SIZE$explicitAABB = LAYOUT$explicitAABB.byteSize();
    public static final long SIZE$instanceID = LAYOUT$instanceID.byteSize();
    public static final long SIZE$instanceMask = LAYOUT$instanceMask.byteSize();
    public static final long SIZE$instanceContributionToHitGroupIndex = LAYOUT$instanceContributionToHitGroupIndex.byteSize();
    public static final long SIZE$instanceFlags = LAYOUT$instanceFlags.byteSize();
    public static final long SIZE$instanceIndex = LAYOUT$instanceIndex.byteSize();
    public static final long SIZE$partitionIndex = LAYOUT$partitionIndex.byteSize();
    public static final long SIZE$accelerationStructure = LAYOUT$accelerationStructure.byteSize();

    public static final long OFFSET$transform = LAYOUT.byteOffset(PATH$transform);
    public static final long OFFSET$explicitAABB = LAYOUT.byteOffset(PATH$explicitAABB);
    public static final long OFFSET$instanceID = LAYOUT.byteOffset(PATH$instanceID);
    public static final long OFFSET$instanceMask = LAYOUT.byteOffset(PATH$instanceMask);
    public static final long OFFSET$instanceContributionToHitGroupIndex = LAYOUT.byteOffset(PATH$instanceContributionToHitGroupIndex);
    public static final long OFFSET$instanceFlags = LAYOUT.byteOffset(PATH$instanceFlags);
    public static final long OFFSET$instanceIndex = LAYOUT.byteOffset(PATH$instanceIndex);
    public static final long OFFSET$partitionIndex = LAYOUT.byteOffset(PATH$partitionIndex);
    public static final long OFFSET$accelerationStructure = LAYOUT.byteOffset(PATH$accelerationStructure);
}
