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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPartitionedAccelerationStructureUpdateInstanceDataNV.html"><code>VkPartitionedAccelerationStructureUpdateInstanceDataNV</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkPartitionedAccelerationStructureUpdateInstanceDataNV {
///     uint32_t instanceIndex; // @link substring="instanceIndex" target="#instanceIndex"
///     uint32_t instanceContributionToHitGroupIndex; // @link substring="instanceContributionToHitGroupIndex" target="#instanceContributionToHitGroupIndex"
///     VkDeviceAddress accelerationStructure; // @link substring="accelerationStructure" target="#accelerationStructure"
/// } VkPartitionedAccelerationStructureUpdateInstanceDataNV;
/// }
///
/// ## Contracts
///
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPartitionedAccelerationStructureUpdateInstanceDataNV.html"><code>VkPartitionedAccelerationStructureUpdateInstanceDataNV</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkPartitionedAccelerationStructureUpdateInstanceDataNV(@NotNull MemorySegment segment) implements IPointer {
    public static VkPartitionedAccelerationStructureUpdateInstanceDataNV allocate(Arena arena) {
        return new VkPartitionedAccelerationStructureUpdateInstanceDataNV(arena.allocate(LAYOUT));
    }

    public static VkPartitionedAccelerationStructureUpdateInstanceDataNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPartitionedAccelerationStructureUpdateInstanceDataNV[] ret = new VkPartitionedAccelerationStructureUpdateInstanceDataNV[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPartitionedAccelerationStructureUpdateInstanceDataNV(segment.asSlice(i * BYTES, BYTES));
        }
        return ret;
    }

    public static VkPartitionedAccelerationStructureUpdateInstanceDataNV clone(Arena arena, VkPartitionedAccelerationStructureUpdateInstanceDataNV src) {
        VkPartitionedAccelerationStructureUpdateInstanceDataNV ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPartitionedAccelerationStructureUpdateInstanceDataNV[] clone(Arena arena, VkPartitionedAccelerationStructureUpdateInstanceDataNV[] src) {
        VkPartitionedAccelerationStructureUpdateInstanceDataNV[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public @unsigned int instanceIndex() {
        return segment.get(LAYOUT$instanceIndex, OFFSET$instanceIndex);
    }

    public void instanceIndex(@unsigned int value) {
        segment.set(LAYOUT$instanceIndex, OFFSET$instanceIndex, value);
    }

    public @unsigned int instanceContributionToHitGroupIndex() {
        return segment.get(LAYOUT$instanceContributionToHitGroupIndex, OFFSET$instanceContributionToHitGroupIndex);
    }

    public void instanceContributionToHitGroupIndex(@unsigned int value) {
        segment.set(LAYOUT$instanceContributionToHitGroupIndex, OFFSET$instanceContributionToHitGroupIndex, value);
    }

    public @unsigned long accelerationStructure() {
        return segment.get(LAYOUT$accelerationStructure, OFFSET$accelerationStructure);
    }

    public void accelerationStructure(@unsigned long value) {
        segment.set(LAYOUT$accelerationStructure, OFFSET$accelerationStructure, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("instanceIndex"),
        ValueLayout.JAVA_INT.withName("instanceContributionToHitGroupIndex"),
        ValueLayout.JAVA_LONG.withName("accelerationStructure")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$instanceIndex = PathElement.groupElement("PATH$instanceIndex");
    public static final PathElement PATH$instanceContributionToHitGroupIndex = PathElement.groupElement("PATH$instanceContributionToHitGroupIndex");
    public static final PathElement PATH$accelerationStructure = PathElement.groupElement("PATH$accelerationStructure");

    public static final OfInt LAYOUT$instanceIndex = (OfInt) LAYOUT.select(PATH$instanceIndex);
    public static final OfInt LAYOUT$instanceContributionToHitGroupIndex = (OfInt) LAYOUT.select(PATH$instanceContributionToHitGroupIndex);
    public static final OfLong LAYOUT$accelerationStructure = (OfLong) LAYOUT.select(PATH$accelerationStructure);

    public static final long SIZE$instanceIndex = LAYOUT$instanceIndex.byteSize();
    public static final long SIZE$instanceContributionToHitGroupIndex = LAYOUT$instanceContributionToHitGroupIndex.byteSize();
    public static final long SIZE$accelerationStructure = LAYOUT$accelerationStructure.byteSize();

    public static final long OFFSET$instanceIndex = LAYOUT.byteOffset(PATH$instanceIndex);
    public static final long OFFSET$instanceContributionToHitGroupIndex = LAYOUT.byteOffset(PATH$instanceContributionToHitGroupIndex);
    public static final long OFFSET$accelerationStructure = LAYOUT.byteOffset(PATH$accelerationStructure);
}
