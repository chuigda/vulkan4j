package club.doki7.vulkan.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import club.doki7.ffm.IPointer;
import club.doki7.ffm.NativeLayout;
import club.doki7.ffm.bits.BitfieldUtil;
import club.doki7.ffm.annotation.*;
import club.doki7.ffm.ptr.*;
import club.doki7.vulkan.bitmask.*;
import club.doki7.vulkan.handle.*;
import club.doki7.vulkan.enumtype.*;
import static club.doki7.vulkan.VkConstants.*;

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkAccelerationStructureMatrixMotionInstanceNV.html"><code>VkAccelerationStructureMatrixMotionInstanceNV</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkAccelerationStructureMatrixMotionInstanceNV {
///     VkTransformMatrixKHR transformT0;
///     VkTransformMatrixKHR transformT1;
///     uint32_t instanceCustomIndex : 24;
///     uint32_t mask : 8;
///     uint32_t instanceShaderBindingTableRecordOffset : 24;
///     VkGeometryInstanceFlagsKHR flags : 8; // optional
///     uint64_t accelerationStructureReference;
/// } VkAccelerationStructureMatrixMotionInstanceNV;
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkAccelerationStructureMatrixMotionInstanceNV.html"><code>VkAccelerationStructureMatrixMotionInstanceNV</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkAccelerationStructureMatrixMotionInstanceNV(@NotNull MemorySegment segment) implements IPointer {
    public static VkAccelerationStructureMatrixMotionInstanceNV allocate(Arena arena) {
        VkAccelerationStructureMatrixMotionInstanceNV ret = new VkAccelerationStructureMatrixMotionInstanceNV(arena.allocate(LAYOUT));
        return ret;
    }

    public static VkAccelerationStructureMatrixMotionInstanceNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkAccelerationStructureMatrixMotionInstanceNV[] ret = new VkAccelerationStructureMatrixMotionInstanceNV[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkAccelerationStructureMatrixMotionInstanceNV(segment.asSlice(i * BYTES, BYTES));
        }
        return ret;
    }

    public static VkAccelerationStructureMatrixMotionInstanceNV clone(Arena arena, VkAccelerationStructureMatrixMotionInstanceNV src) {
        VkAccelerationStructureMatrixMotionInstanceNV ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkAccelerationStructureMatrixMotionInstanceNV[] clone(Arena arena, VkAccelerationStructureMatrixMotionInstanceNV[] src) {
        VkAccelerationStructureMatrixMotionInstanceNV[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public VkTransformMatrixKHR transformT0() {
        return new VkTransformMatrixKHR(segment.asSlice(OFFSET$transformT0, LAYOUT$transformT0));
    }

    public void transformT0(VkTransformMatrixKHR value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$transformT0, SIZE$transformT0);
    }

    public VkTransformMatrixKHR transformT1() {
        return new VkTransformMatrixKHR(segment.asSlice(OFFSET$transformT1, LAYOUT$transformT1));
    }

    public void transformT1(VkTransformMatrixKHR value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$transformT1, SIZE$transformT1);
    }

    public @unsigned int instanceCustomIndex() {
        MemorySegment s = segment.asSlice(OFFSET$instanceCustomIndex_mask, LAYOUT$instanceCustomIndex_mask);
        return BitfieldUtil.readBits(s, 0, 24);
    }

    public void instanceCustomIndex(@unsigned int value) {
        MemorySegment s = segment.asSlice(OFFSET$instanceCustomIndex_mask, LAYOUT$instanceCustomIndex_mask);
        BitfieldUtil.writeBits(s, 0, 24, value);
    }

    public @unsigned int mask() {
        MemorySegment s = segment.asSlice(OFFSET$instanceCustomIndex_mask, LAYOUT$instanceCustomIndex_mask);
        return BitfieldUtil.readBits(s, 24, 32);
    }

    public void mask(@unsigned int value) {
        MemorySegment s = segment.asSlice(OFFSET$instanceCustomIndex_mask, LAYOUT$instanceCustomIndex_mask);
        BitfieldUtil.writeBits(s, 24, 32, value);
    }

    public @unsigned int instanceShaderBindingTableRecordOffset() {
        MemorySegment s = segment.asSlice(OFFSET$instanceShaderBindingTableRecordOffset_flags, LAYOUT$instanceShaderBindingTableRecordOffset_flags);
        return BitfieldUtil.readBits(s, 0, 24);
    }

    public void instanceShaderBindingTableRecordOffset(@unsigned int value) {
        MemorySegment s = segment.asSlice(OFFSET$instanceShaderBindingTableRecordOffset_flags, LAYOUT$instanceShaderBindingTableRecordOffset_flags);
        BitfieldUtil.writeBits(s, 0, 24, value);
    }

    public @unsigned int flags() {
        MemorySegment s = segment.asSlice(OFFSET$instanceShaderBindingTableRecordOffset_flags, LAYOUT$instanceShaderBindingTableRecordOffset_flags);
        return BitfieldUtil.readBits(s, 24, 32);
    }

    public void flags(@unsigned int value) {
        MemorySegment s = segment.asSlice(OFFSET$instanceShaderBindingTableRecordOffset_flags, LAYOUT$instanceShaderBindingTableRecordOffset_flags);
        BitfieldUtil.writeBits(s, 24, 32, value);
    }

    public @unsigned long accelerationStructureReference() {
        return segment.get(LAYOUT$accelerationStructureReference, OFFSET$accelerationStructureReference);
    }

    public void accelerationStructureReference(@unsigned long value) {
        segment.set(LAYOUT$accelerationStructureReference, OFFSET$accelerationStructureReference, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        VkTransformMatrixKHR.LAYOUT.withName("transformT0"),
        VkTransformMatrixKHR.LAYOUT.withName("transformT1"),
        ValueLayout.JAVA_INT.withName("bitfield$instanceCustomIndex_mask"),
        ValueLayout.JAVA_INT.withName("bitfield$instanceShaderBindingTableRecordOffset_flags"),
        ValueLayout.JAVA_LONG.withName("accelerationStructureReference")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$transformT0 = PathElement.groupElement("PATH$transformT0");
    public static final PathElement PATH$transformT1 = PathElement.groupElement("PATH$transformT1");
    public static final PathElement PATH$bitfield$instanceCustomIndex_mask = PathElement.groupElement("PATH$bitfield$instanceCustomIndex_mask");
    public static final PathElement PATH$bitfield$instanceShaderBindingTableRecordOffset_flags = PathElement.groupElement("PATH$bitfield$instanceShaderBindingTableRecordOffset_flags");
    public static final PathElement PATH$accelerationStructureReference = PathElement.groupElement("PATH$accelerationStructureReference");

    public static final StructLayout LAYOUT$transformT0 = (StructLayout) LAYOUT.select(PATH$transformT0);
    public static final StructLayout LAYOUT$transformT1 = (StructLayout) LAYOUT.select(PATH$transformT1);
    public static final OfInt LAYOUT$instanceCustomIndex_mask = (OfInt) LAYOUT.select(PATH$bitfield$instanceCustomIndex_mask);
    public static final OfInt LAYOUT$instanceShaderBindingTableRecordOffset_flags = (OfInt) LAYOUT.select(PATH$bitfield$instanceShaderBindingTableRecordOffset_flags);
    public static final OfLong LAYOUT$accelerationStructureReference = (OfLong) LAYOUT.select(PATH$accelerationStructureReference);

    public static final long SIZE$transformT0 = LAYOUT$transformT0.byteSize();
    public static final long SIZE$transformT1 = LAYOUT$transformT1.byteSize();
    public static final long SIZE$accelerationStructureReference = LAYOUT$accelerationStructureReference.byteSize();

    public static final long OFFSET$transformT0 = LAYOUT.byteOffset(PATH$transformT0);
    public static final long OFFSET$transformT1 = LAYOUT.byteOffset(PATH$transformT1);
    public static final long OFFSET$instanceCustomIndex_mask = LAYOUT.byteOffset(PATH$bitfield$instanceCustomIndex_mask);
    public static final long OFFSET$instanceShaderBindingTableRecordOffset_flags = LAYOUT.byteOffset(PATH$bitfield$instanceShaderBindingTableRecordOffset_flags);
    public static final long OFFSET$accelerationStructureReference = LAYOUT.byteOffset(PATH$accelerationStructureReference);
}
