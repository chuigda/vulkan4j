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

/// Represents a pointer to a {@code VkWriteDescriptorSetPartitionedAccelerationStructureNV} structure in native memory.
///
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to)
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkWriteDescriptorSetPartitionedAccelerationStructureNV.html">VkWriteDescriptorSetPartitionedAccelerationStructureNV</a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkWriteDescriptorSetPartitionedAccelerationStructureNV(@NotNull MemorySegment segment) implements IPointer {
    public VkWriteDescriptorSetPartitionedAccelerationStructureNV {
        sType(VkStructureType.WRITE_DESCRIPTOR_SET_PARTITIONED_ACCELERATION_STRUCTURE_NV);
    }

    public static VkWriteDescriptorSetPartitionedAccelerationStructureNV allocate(Arena arena) {
        return new VkWriteDescriptorSetPartitionedAccelerationStructureNV(arena.allocate(LAYOUT));
    }

    public static VkWriteDescriptorSetPartitionedAccelerationStructureNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkWriteDescriptorSetPartitionedAccelerationStructureNV[] ret = new VkWriteDescriptorSetPartitionedAccelerationStructureNV[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkWriteDescriptorSetPartitionedAccelerationStructureNV(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkWriteDescriptorSetPartitionedAccelerationStructureNV clone(Arena arena, VkWriteDescriptorSetPartitionedAccelerationStructureNV src) {
        VkWriteDescriptorSetPartitionedAccelerationStructureNV ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkWriteDescriptorSetPartitionedAccelerationStructureNV[] clone(Arena arena, VkWriteDescriptorSetPartitionedAccelerationStructureNV[] src) {
        VkWriteDescriptorSetPartitionedAccelerationStructureNV[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("accelerationStructureCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_LONG).withName("pAccelerationStructures")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$accelerationStructureCount = PathElement.groupElement("PATH$accelerationStructureCount");
    public static final PathElement PATH$pAccelerationStructures = PathElement.groupElement("PATH$pAccelerationStructures");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$accelerationStructureCount = (OfInt) LAYOUT.select(PATH$accelerationStructureCount);
    public static final AddressLayout LAYOUT$pAccelerationStructures = (AddressLayout) LAYOUT.select(PATH$pAccelerationStructures);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$accelerationStructureCount = LAYOUT$accelerationStructureCount.byteSize();
    public static final long SIZE$pAccelerationStructures = LAYOUT$pAccelerationStructures.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$accelerationStructureCount = LAYOUT.byteOffset(PATH$accelerationStructureCount);
    public static final long OFFSET$pAccelerationStructures = LAYOUT.byteOffset(PATH$pAccelerationStructures);

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

    public @unsigned int accelerationStructureCount() {
        return segment.get(LAYOUT$accelerationStructureCount, OFFSET$accelerationStructureCount);
    }

    public void accelerationStructureCount(@unsigned int value) {
        segment.set(LAYOUT$accelerationStructureCount, OFFSET$accelerationStructureCount, value);
    }

    public @pointer(comment="long*") MemorySegment pAccelerationStructuresRaw() {
        return segment.get(LAYOUT$pAccelerationStructures, OFFSET$pAccelerationStructures);
    }

    public void pAccelerationStructuresRaw(@pointer(comment="long*") MemorySegment value) {
        segment.set(LAYOUT$pAccelerationStructures, OFFSET$pAccelerationStructures, value);
    }

    /// Note: the returned {@link LongPtr} does not have correct
    /// {@link LongPtr#size} property. It's up to user to track the size of the buffer,
    /// and use {@link LongPtr#reinterpret} to set the size before actually reading from or
    /// writing to the buffer.
    public @Nullable @unsigned LongPtr pAccelerationStructures() {
        MemorySegment s = pAccelerationStructuresRaw();
        if (s.address() == 0) {
            return null;
        }
        return new LongPtr(s);
    }

    public void pAccelerationStructures(@Nullable @unsigned LongPtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pAccelerationStructuresRaw(s);
    }

}
