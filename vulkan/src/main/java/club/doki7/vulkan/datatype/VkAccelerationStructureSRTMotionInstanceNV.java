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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkAccelerationStructureSRTMotionInstanceNV.html"><code>VkAccelerationStructureSRTMotionInstanceNV</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkAccelerationStructureSRTMotionInstanceNV {
///     VkSRTDataNV transformT0; // @link substring="VkSRTDataNV" target="VkSRTDataNV" @link substring="transformT0" target="#transformT0"
///     VkSRTDataNV transformT1; // @link substring="VkSRTDataNV" target="VkSRTDataNV" @link substring="transformT1" target="#transformT1"
///     uint32_t instanceCustomIndex : 24; // @link substring="instanceCustomIndex" target="#instanceCustomIndex"
///     uint32_t mask : 8; // @link substring="mask" target="#mask"
///     uint32_t instanceShaderBindingTableRecordOffset : 24; // @link substring="instanceShaderBindingTableRecordOffset" target="#instanceShaderBindingTableRecordOffset"
///     uint32_t flags : 8; // @link substring="flags" target="#flags"
///     uint64_t accelerationStructureReference; // @link substring="accelerationStructureReference" target="#accelerationStructureReference"
/// } VkAccelerationStructureSRTMotionInstanceNV;
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkAccelerationStructureSRTMotionInstanceNV.html"><code>VkAccelerationStructureSRTMotionInstanceNV</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkAccelerationStructureSRTMotionInstanceNV(@NotNull MemorySegment segment) implements IPointer {
    public static VkAccelerationStructureSRTMotionInstanceNV allocate(Arena arena) {
        return new VkAccelerationStructureSRTMotionInstanceNV(arena.allocate(LAYOUT));
    }

    public static VkAccelerationStructureSRTMotionInstanceNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkAccelerationStructureSRTMotionInstanceNV[] ret = new VkAccelerationStructureSRTMotionInstanceNV[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkAccelerationStructureSRTMotionInstanceNV(segment.asSlice(i * BYTES, BYTES));
        }
        return ret;
    }

    public static VkAccelerationStructureSRTMotionInstanceNV clone(Arena arena, VkAccelerationStructureSRTMotionInstanceNV src) {
        VkAccelerationStructureSRTMotionInstanceNV ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkAccelerationStructureSRTMotionInstanceNV[] clone(Arena arena, VkAccelerationStructureSRTMotionInstanceNV[] src) {
        VkAccelerationStructureSRTMotionInstanceNV[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public @NotNull VkSRTDataNV transformT0() {
        return new VkSRTDataNV(segment.asSlice(OFFSET$transformT0, LAYOUT$transformT0));
    }

    public void transformT0(@NotNull VkSRTDataNV value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$transformT0, SIZE$transformT0);
    }

    public @NotNull VkSRTDataNV transformT1() {
        return new VkSRTDataNV(segment.asSlice(OFFSET$transformT1, LAYOUT$transformT1));
    }

    public void transformT1(@NotNull VkSRTDataNV value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$transformT1, SIZE$transformT1);
    }

    public @unsigned int instanceCustomIndex() {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$instanceCustomIndex$mask, LAYOUT$bitfield$instanceCustomIndex$mask);
        return BitfieldUtil.readBits(s, 0, 24);
    }

    public void instanceCustomIndex(@unsigned int value) {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$instanceCustomIndex$mask, LAYOUT$bitfield$instanceCustomIndex$mask);
        BitfieldUtil.writeBits(s, 0, 24, value);
    }

    public @unsigned int mask() {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$instanceCustomIndex$mask, LAYOUT$bitfield$instanceCustomIndex$mask);
        return BitfieldUtil.readBits(s, 24, 32);
    }

    public void mask(@unsigned int value) {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$instanceCustomIndex$mask, LAYOUT$bitfield$instanceCustomIndex$mask);
        BitfieldUtil.writeBits(s, 24, 32, value);
    }

    public @unsigned int instanceShaderBindingTableRecordOffset() {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$instanceShaderBindingTableRecordOffset$flags, LAYOUT$bitfield$instanceShaderBindingTableRecordOffset$flags);
        return BitfieldUtil.readBits(s, 0, 24);
    }

    public void instanceShaderBindingTableRecordOffset(@unsigned int value) {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$instanceShaderBindingTableRecordOffset$flags, LAYOUT$bitfield$instanceShaderBindingTableRecordOffset$flags);
        BitfieldUtil.writeBits(s, 0, 24, value);
    }

    public @unsigned int flags() {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$instanceShaderBindingTableRecordOffset$flags, LAYOUT$bitfield$instanceShaderBindingTableRecordOffset$flags);
        return BitfieldUtil.readBits(s, 24, 32);
    }

    public void flags(@unsigned int value) {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$instanceShaderBindingTableRecordOffset$flags, LAYOUT$bitfield$instanceShaderBindingTableRecordOffset$flags);
        BitfieldUtil.writeBits(s, 24, 32, value);
    }

    public @unsigned long accelerationStructureReference() {
        return segment.get(LAYOUT$accelerationStructureReference, OFFSET$accelerationStructureReference);
    }

    public void accelerationStructureReference(@unsigned long value) {
        segment.set(LAYOUT$accelerationStructureReference, OFFSET$accelerationStructureReference, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        VkSRTDataNV.LAYOUT.withName("transformT0"),
        VkSRTDataNV.LAYOUT.withName("transformT1"),
        ValueLayout.JAVA_INT.withName("bitfield$instanceCustomIndex$mask"),
        ValueLayout.JAVA_INT.withName("bitfield$instanceShaderBindingTableRecordOffset$flags"),
        ValueLayout.JAVA_LONG.withName("accelerationStructureReference")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$transformT0 = PathElement.groupElement("PATH$transformT0");
    public static final PathElement PATH$transformT1 = PathElement.groupElement("PATH$transformT1");
    public static final PathElement PATH$bitfield$instanceCustomIndex$mask = PathElement.groupElement("PATH$bitfield$instanceCustomIndex$mask");
    public static final PathElement PATH$bitfield$instanceShaderBindingTableRecordOffset$flags = PathElement.groupElement("PATH$bitfield$instanceShaderBindingTableRecordOffset$flags");
    public static final PathElement PATH$accelerationStructureReference = PathElement.groupElement("PATH$accelerationStructureReference");

    public static final StructLayout LAYOUT$transformT0 = (StructLayout) LAYOUT.select(PATH$transformT0);
    public static final StructLayout LAYOUT$transformT1 = (StructLayout) LAYOUT.select(PATH$transformT1);
    public static final OfInt LAYOUT$bitfield$instanceCustomIndex$mask = (OfInt) LAYOUT.select(PATH$bitfield$instanceCustomIndex$mask);
    public static final OfInt LAYOUT$bitfield$instanceShaderBindingTableRecordOffset$flags = (OfInt) LAYOUT.select(PATH$bitfield$instanceShaderBindingTableRecordOffset$flags);
    public static final OfLong LAYOUT$accelerationStructureReference = (OfLong) LAYOUT.select(PATH$accelerationStructureReference);

    public static final long SIZE$transformT0 = LAYOUT$transformT0.byteSize();
    public static final long SIZE$transformT1 = LAYOUT$transformT1.byteSize();
    public static final long SIZE$accelerationStructureReference = LAYOUT$accelerationStructureReference.byteSize();

    public static final long OFFSET$transformT0 = LAYOUT.byteOffset(PATH$transformT0);
    public static final long OFFSET$transformT1 = LAYOUT.byteOffset(PATH$transformT1);
    public static final long OFFSET$bitfield$instanceCustomIndex$mask = LAYOUT.byteOffset(PATH$bitfield$instanceCustomIndex$mask);
    public static final long OFFSET$bitfield$instanceShaderBindingTableRecordOffset$flags = LAYOUT.byteOffset(PATH$bitfield$instanceShaderBindingTableRecordOffset$flags);
    public static final long OFFSET$accelerationStructureReference = LAYOUT.byteOffset(PATH$accelerationStructureReference);
}
