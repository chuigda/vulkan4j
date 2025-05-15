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

public record VkAccelerationStructureSRTMotionInstanceNV(@NotNull MemorySegment segment) implements IPointer {
    public static final StructLayout LAYOUT$transformT0 = VkSRTDataNV.LAYOUT.withName("transformT0");
    public static final StructLayout LAYOUT$transformT1 = VkSRTDataNV.LAYOUT.withName("transformT1");
    public static final OfInt LAYOUT$instanceCustomIndex_mask = ValueLayout.JAVA_INT.withName("bitfield$instanceCustomIndex_mask");
    public static final OfInt LAYOUT$instanceShaderBindingTableRecordOffset_flags = ValueLayout.JAVA_INT.withName("bitfield$instanceShaderBindingTableRecordOffset_flags");
    public static final OfLong LAYOUT$accelerationStructureReference = ValueLayout.JAVA_LONG.withName("accelerationStructureReference");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$transformT0, LAYOUT$transformT1, LAYOUT$instanceCustomIndex_mask, LAYOUT$instanceShaderBindingTableRecordOffset_flags, LAYOUT$accelerationStructureReference);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkAccelerationStructureSRTMotionInstanceNV allocate(Arena arena) {
        return new VkAccelerationStructureSRTMotionInstanceNV(arena.allocate(LAYOUT));
    }

    public static VkAccelerationStructureSRTMotionInstanceNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkAccelerationStructureSRTMotionInstanceNV[] ret = new VkAccelerationStructureSRTMotionInstanceNV[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkAccelerationStructureSRTMotionInstanceNV(segment.asSlice(i * SIZE, SIZE));
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

    public static final PathElement PATH$transformT0 = PathElement.groupElement("PATH$transformT0");
    public static final PathElement PATH$transformT1 = PathElement.groupElement("PATH$transformT1");
    public static final PathElement PATH$bitfield$instanceCustomIndex_mask = PathElement.groupElement("PATH$bitfield$instanceCustomIndex_mask");
    public static final PathElement PATH$bitfield$instanceShaderBindingTableRecordOffset_flags = PathElement.groupElement("PATH$bitfield$instanceShaderBindingTableRecordOffset_flags");
    public static final PathElement PATH$accelerationStructureReference = PathElement.groupElement("PATH$accelerationStructureReference");

    public static final long SIZE$transformT0 = LAYOUT$transformT0.byteSize();
    public static final long SIZE$transformT1 = LAYOUT$transformT1.byteSize();
    public static final long SIZE$accelerationStructureReference = LAYOUT$accelerationStructureReference.byteSize();

    public static final long OFFSET$transformT0 = LAYOUT.byteOffset(PATH$transformT0);
    public static final long OFFSET$transformT1 = LAYOUT.byteOffset(PATH$transformT1);
    public static final long OFFSET$instanceCustomIndex_mask = LAYOUT.byteOffset(PATH$bitfield$instanceCustomIndex_mask);
    public static final long OFFSET$instanceShaderBindingTableRecordOffset_flags = LAYOUT.byteOffset(PATH$bitfield$instanceShaderBindingTableRecordOffset_flags);
    public static final long OFFSET$accelerationStructureReference = LAYOUT.byteOffset(PATH$accelerationStructureReference);

    public VkSRTDataNV transformT0() {
        return new VkSRTDataNV(segment.asSlice(OFFSET$transformT0, LAYOUT$transformT0));
    }

    public void transformT0(VkSRTDataNV value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$transformT0, SIZE$transformT0);
    }

    public VkSRTDataNV transformT1() {
        return new VkSRTDataNV(segment.asSlice(OFFSET$transformT1, LAYOUT$transformT1));
    }

    public void transformT1(VkSRTDataNV value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$transformT1, SIZE$transformT1);
    }

    public int instanceCustomIndex() {
        MemorySegment s = segment.asSlice(OFFSET$instanceCustomIndex_mask, LAYOUT$instanceCustomIndex_mask);
        return BitfieldUtil.readBits(s, 0, 24);
    }

    public void instanceCustomIndex(int value) {
        MemorySegment s = segment.asSlice(OFFSET$instanceCustomIndex_mask, LAYOUT$instanceCustomIndex_mask);
        BitfieldUtil.writeBits(s, 0, 24, value);
    }

    public int mask() {
        MemorySegment s = segment.asSlice(OFFSET$instanceCustomIndex_mask, LAYOUT$instanceCustomIndex_mask);
        return BitfieldUtil.readBits(s, 24, 32);
    }

    public void mask(int value) {
        MemorySegment s = segment.asSlice(OFFSET$instanceCustomIndex_mask, LAYOUT$instanceCustomIndex_mask);
        BitfieldUtil.writeBits(s, 24, 32, value);
    }

    public int instanceShaderBindingTableRecordOffset() {
        MemorySegment s = segment.asSlice(OFFSET$instanceShaderBindingTableRecordOffset_flags, LAYOUT$instanceShaderBindingTableRecordOffset_flags);
        return BitfieldUtil.readBits(s, 0, 24);
    }

    public void instanceShaderBindingTableRecordOffset(int value) {
        MemorySegment s = segment.asSlice(OFFSET$instanceShaderBindingTableRecordOffset_flags, LAYOUT$instanceShaderBindingTableRecordOffset_flags);
        BitfieldUtil.writeBits(s, 0, 24, value);
    }

    public int flags() {
        MemorySegment s = segment.asSlice(OFFSET$instanceShaderBindingTableRecordOffset_flags, LAYOUT$instanceShaderBindingTableRecordOffset_flags);
        return BitfieldUtil.readBits(s, 24, 32);
    }

    public void flags(int value) {
        MemorySegment s = segment.asSlice(OFFSET$instanceShaderBindingTableRecordOffset_flags, LAYOUT$instanceShaderBindingTableRecordOffset_flags);
        BitfieldUtil.writeBits(s, 24, 32, value);
    }

    public @unsigned long accelerationStructureReference() {
        return segment.get(LAYOUT$accelerationStructureReference, OFFSET$accelerationStructureReference);
    }

    public void accelerationStructureReference(@unsigned long value) {
        segment.set(LAYOUT$accelerationStructureReference, OFFSET$accelerationStructureReference, value);
    }

}
/// dummy, not implemented yet
