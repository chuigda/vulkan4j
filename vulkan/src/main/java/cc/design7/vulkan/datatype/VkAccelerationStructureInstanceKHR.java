package cc.design7.vulkan.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import cc.design7.ffm.IPointer;
import cc.design7.ffm.NativeLayout;
import cc.design7.ffm.bits.BitfieldUtil;
import cc.design7.ffm.annotation.*;
import cc.design7.ffm.ptr.*;
import cc.design7.vulkan.bitmask.*;
import cc.design7.vulkan.datatype.*;
import cc.design7.vulkan.enumtype.*;
import static cc.design7.vulkan.VkConstants.*;

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkAccelerationStructureInstanceKHR.html"><code>VkAccelerationStructureInstanceKHR</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkAccelerationStructureInstanceKHR {
///     VkTransformMatrixKHR transform;
///     uint32_t instanceCustomIndex : 24;
///     uint32_t mask : 8;
///     uint32_t instanceShaderBindingTableRecordOffset : 24;
///     VkGeometryInstanceFlagsKHR flags : 8; // optional
///     uint64_t accelerationStructureReference;
/// } VkAccelerationStructureInstanceKHR;
/// }
///
/// ## Contracts
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to)
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkAccelerationStructureInstanceKHR.html"><code>VkAccelerationStructureInstanceKHR</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkAccelerationStructureInstanceKHR(@NotNull MemorySegment segment) implements IPointer {
    public static VkAccelerationStructureInstanceKHR allocate(Arena arena) {
        VkAccelerationStructureInstanceKHR ret = new VkAccelerationStructureInstanceKHR(arena.allocate(LAYOUT));
        return ret;
    }

    public static VkAccelerationStructureInstanceKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkAccelerationStructureInstanceKHR[] ret = new VkAccelerationStructureInstanceKHR[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkAccelerationStructureInstanceKHR(segment.asSlice(i * BYTES, BYTES));
        }
        return ret;
    }

    public static VkAccelerationStructureInstanceKHR clone(Arena arena, VkAccelerationStructureInstanceKHR src) {
        VkAccelerationStructureInstanceKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkAccelerationStructureInstanceKHR[] clone(Arena arena, VkAccelerationStructureInstanceKHR[] src) {
        VkAccelerationStructureInstanceKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public VkTransformMatrixKHR transform() {
        return new VkTransformMatrixKHR(segment.asSlice(OFFSET$transform, LAYOUT$transform));
    }

    public void transform(VkTransformMatrixKHR value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$transform, SIZE$transform);
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
        VkTransformMatrixKHR.LAYOUT.withName("transform"),
        ValueLayout.JAVA_INT.withName("bitfield$instanceCustomIndex_mask"),
        ValueLayout.JAVA_INT.withName("bitfield$instanceShaderBindingTableRecordOffset_flags"),
        ValueLayout.JAVA_LONG.withName("accelerationStructureReference")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$transform = PathElement.groupElement("PATH$transform");
    public static final PathElement PATH$bitfield$instanceCustomIndex_mask = PathElement.groupElement("PATH$bitfield$instanceCustomIndex_mask");
    public static final PathElement PATH$bitfield$instanceShaderBindingTableRecordOffset_flags = PathElement.groupElement("PATH$bitfield$instanceShaderBindingTableRecordOffset_flags");
    public static final PathElement PATH$accelerationStructureReference = PathElement.groupElement("PATH$accelerationStructureReference");

    public static final StructLayout LAYOUT$transform = (StructLayout) LAYOUT.select(PATH$transform);
    public static final OfInt LAYOUT$instanceCustomIndex_mask = (OfInt) LAYOUT.select(PATH$bitfield$instanceCustomIndex_mask);
    public static final OfInt LAYOUT$instanceShaderBindingTableRecordOffset_flags = (OfInt) LAYOUT.select(PATH$bitfield$instanceShaderBindingTableRecordOffset_flags);
    public static final OfLong LAYOUT$accelerationStructureReference = (OfLong) LAYOUT.select(PATH$accelerationStructureReference);

    public static final long SIZE$transform = LAYOUT$transform.byteSize();
    public static final long SIZE$accelerationStructureReference = LAYOUT$accelerationStructureReference.byteSize();

    public static final long OFFSET$transform = LAYOUT.byteOffset(PATH$transform);
    public static final long OFFSET$instanceCustomIndex_mask = LAYOUT.byteOffset(PATH$bitfield$instanceCustomIndex_mask);
    public static final long OFFSET$instanceShaderBindingTableRecordOffset_flags = LAYOUT.byteOffset(PATH$bitfield$instanceShaderBindingTableRecordOffset_flags);
    public static final long OFFSET$accelerationStructureReference = LAYOUT.byteOffset(PATH$accelerationStructureReference);
}
