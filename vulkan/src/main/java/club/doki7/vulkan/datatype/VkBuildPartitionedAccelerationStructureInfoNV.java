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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkBuildPartitionedAccelerationStructureInfoNV.html"><code>VkBuildPartitionedAccelerationStructureInfoNV</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkBuildPartitionedAccelerationStructureInfoNV {
///     VkStructureType sType; // @link substring="VkStructureType" target="VkStructureType" @link substring="sType" target="#sType"
///     void* pNext; // optional // @link substring="pNext" target="#pNext"
///     VkPartitionedAccelerationStructureInstancesInputNV input; // @link substring="VkPartitionedAccelerationStructureInstancesInputNV" target="VkPartitionedAccelerationStructureInstancesInputNV" @link substring="input" target="#input"
///     VkDeviceAddress srcAccelerationStructureData; // @link substring="srcAccelerationStructureData" target="#srcAccelerationStructureData"
///     VkDeviceAddress dstAccelerationStructureData; // @link substring="dstAccelerationStructureData" target="#dstAccelerationStructureData"
///     VkDeviceAddress scratchData; // @link substring="scratchData" target="#scratchData"
///     VkDeviceAddress srcInfos; // @link substring="srcInfos" target="#srcInfos"
///     VkDeviceAddress srcInfosCount; // @link substring="srcInfosCount" target="#srcInfosCount"
/// } VkBuildPartitionedAccelerationStructureInfoNV;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_BUILD_PARTITIONED_ACCELERATION_STRUCTURE_INFO_NV`
///
/// The {@link VkBuildPartitionedAccelerationStructureInfoNV#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkBuildPartitionedAccelerationStructureInfoNV#autoInit} to initialize these fields manually for
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkBuildPartitionedAccelerationStructureInfoNV.html"><code>VkBuildPartitionedAccelerationStructureInfoNV</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkBuildPartitionedAccelerationStructureInfoNV(@NotNull MemorySegment segment) implements IPointer {
    public static VkBuildPartitionedAccelerationStructureInfoNV allocate(Arena arena) {
        VkBuildPartitionedAccelerationStructureInfoNV ret = new VkBuildPartitionedAccelerationStructureInfoNV(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.BUILD_PARTITIONED_ACCELERATION_STRUCTURE_INFO_NV);
        return ret;
    }

    public static VkBuildPartitionedAccelerationStructureInfoNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkBuildPartitionedAccelerationStructureInfoNV[] ret = new VkBuildPartitionedAccelerationStructureInfoNV[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkBuildPartitionedAccelerationStructureInfoNV(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.BUILD_PARTITIONED_ACCELERATION_STRUCTURE_INFO_NV);
        }
        return ret;
    }

    public static VkBuildPartitionedAccelerationStructureInfoNV clone(Arena arena, VkBuildPartitionedAccelerationStructureInfoNV src) {
        VkBuildPartitionedAccelerationStructureInfoNV ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkBuildPartitionedAccelerationStructureInfoNV[] clone(Arena arena, VkBuildPartitionedAccelerationStructureInfoNV[] src) {
        VkBuildPartitionedAccelerationStructureInfoNV[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.BUILD_PARTITIONED_ACCELERATION_STRUCTURE_INFO_NV);
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

    public void pNext(@Nullable IPointer pointer) {
        pNext(pointer != null ? pointer.segment() : MemorySegment.NULL);
    }

    public @NotNull VkPartitionedAccelerationStructureInstancesInputNV input() {
        return new VkPartitionedAccelerationStructureInstancesInputNV(segment.asSlice(OFFSET$input, LAYOUT$input));
    }

    public void input(@NotNull VkPartitionedAccelerationStructureInstancesInputNV value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$input, SIZE$input);
    }

    public @unsigned long srcAccelerationStructureData() {
        return segment.get(LAYOUT$srcAccelerationStructureData, OFFSET$srcAccelerationStructureData);
    }

    public void srcAccelerationStructureData(@unsigned long value) {
        segment.set(LAYOUT$srcAccelerationStructureData, OFFSET$srcAccelerationStructureData, value);
    }

    public @unsigned long dstAccelerationStructureData() {
        return segment.get(LAYOUT$dstAccelerationStructureData, OFFSET$dstAccelerationStructureData);
    }

    public void dstAccelerationStructureData(@unsigned long value) {
        segment.set(LAYOUT$dstAccelerationStructureData, OFFSET$dstAccelerationStructureData, value);
    }

    public @unsigned long scratchData() {
        return segment.get(LAYOUT$scratchData, OFFSET$scratchData);
    }

    public void scratchData(@unsigned long value) {
        segment.set(LAYOUT$scratchData, OFFSET$scratchData, value);
    }

    public @unsigned long srcInfos() {
        return segment.get(LAYOUT$srcInfos, OFFSET$srcInfos);
    }

    public void srcInfos(@unsigned long value) {
        segment.set(LAYOUT$srcInfos, OFFSET$srcInfos, value);
    }

    public @unsigned long srcInfosCount() {
        return segment.get(LAYOUT$srcInfosCount, OFFSET$srcInfosCount);
    }

    public void srcInfosCount(@unsigned long value) {
        segment.set(LAYOUT$srcInfosCount, OFFSET$srcInfosCount, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        VkPartitionedAccelerationStructureInstancesInputNV.LAYOUT.withName("input"),
        ValueLayout.JAVA_LONG.withName("srcAccelerationStructureData"),
        ValueLayout.JAVA_LONG.withName("dstAccelerationStructureData"),
        ValueLayout.JAVA_LONG.withName("scratchData"),
        ValueLayout.JAVA_LONG.withName("srcInfos"),
        ValueLayout.JAVA_LONG.withName("srcInfosCount")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$input = PathElement.groupElement("PATH$input");
    public static final PathElement PATH$srcAccelerationStructureData = PathElement.groupElement("PATH$srcAccelerationStructureData");
    public static final PathElement PATH$dstAccelerationStructureData = PathElement.groupElement("PATH$dstAccelerationStructureData");
    public static final PathElement PATH$scratchData = PathElement.groupElement("PATH$scratchData");
    public static final PathElement PATH$srcInfos = PathElement.groupElement("PATH$srcInfos");
    public static final PathElement PATH$srcInfosCount = PathElement.groupElement("PATH$srcInfosCount");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final StructLayout LAYOUT$input = (StructLayout) LAYOUT.select(PATH$input);
    public static final OfLong LAYOUT$srcAccelerationStructureData = (OfLong) LAYOUT.select(PATH$srcAccelerationStructureData);
    public static final OfLong LAYOUT$dstAccelerationStructureData = (OfLong) LAYOUT.select(PATH$dstAccelerationStructureData);
    public static final OfLong LAYOUT$scratchData = (OfLong) LAYOUT.select(PATH$scratchData);
    public static final OfLong LAYOUT$srcInfos = (OfLong) LAYOUT.select(PATH$srcInfos);
    public static final OfLong LAYOUT$srcInfosCount = (OfLong) LAYOUT.select(PATH$srcInfosCount);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$input = LAYOUT$input.byteSize();
    public static final long SIZE$srcAccelerationStructureData = LAYOUT$srcAccelerationStructureData.byteSize();
    public static final long SIZE$dstAccelerationStructureData = LAYOUT$dstAccelerationStructureData.byteSize();
    public static final long SIZE$scratchData = LAYOUT$scratchData.byteSize();
    public static final long SIZE$srcInfos = LAYOUT$srcInfos.byteSize();
    public static final long SIZE$srcInfosCount = LAYOUT$srcInfosCount.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$input = LAYOUT.byteOffset(PATH$input);
    public static final long OFFSET$srcAccelerationStructureData = LAYOUT.byteOffset(PATH$srcAccelerationStructureData);
    public static final long OFFSET$dstAccelerationStructureData = LAYOUT.byteOffset(PATH$dstAccelerationStructureData);
    public static final long OFFSET$scratchData = LAYOUT.byteOffset(PATH$scratchData);
    public static final long OFFSET$srcInfos = LAYOUT.byteOffset(PATH$srcInfos);
    public static final long OFFSET$srcInfosCount = LAYOUT.byteOffset(PATH$srcInfosCount);
}
