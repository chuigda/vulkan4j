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

public record VkPartitionedAccelerationStructureUpdateInstanceDataNV(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$instanceIndex = ValueLayout.JAVA_INT.withName("instanceIndex");
    public static final OfInt LAYOUT$instanceContributionToHitGroupIndex = ValueLayout.JAVA_INT.withName("instanceContributionToHitGroupIndex");
    public static final OfLong LAYOUT$accelerationStructure = ValueLayout.JAVA_LONG.withName("accelerationStructure");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$instanceIndex, LAYOUT$instanceContributionToHitGroupIndex, LAYOUT$accelerationStructure);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkPartitionedAccelerationStructureUpdateInstanceDataNV allocate(Arena arena) {
        return new VkPartitionedAccelerationStructureUpdateInstanceDataNV(arena.allocate(LAYOUT));
    }

    public static VkPartitionedAccelerationStructureUpdateInstanceDataNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPartitionedAccelerationStructureUpdateInstanceDataNV[] ret = new VkPartitionedAccelerationStructureUpdateInstanceDataNV[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPartitionedAccelerationStructureUpdateInstanceDataNV(segment.asSlice(i * SIZE, SIZE));
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

    public static final PathElement PATH$instanceIndex = PathElement.groupElement("PATH$instanceIndex");
    public static final PathElement PATH$instanceContributionToHitGroupIndex = PathElement.groupElement("PATH$instanceContributionToHitGroupIndex");
    public static final PathElement PATH$accelerationStructure = PathElement.groupElement("PATH$accelerationStructure");

    public static final long SIZE$instanceIndex = LAYOUT$instanceIndex.byteSize();
    public static final long SIZE$instanceContributionToHitGroupIndex = LAYOUT$instanceContributionToHitGroupIndex.byteSize();
    public static final long SIZE$accelerationStructure = LAYOUT$accelerationStructure.byteSize();

    public static final long OFFSET$instanceIndex = LAYOUT.byteOffset(PATH$instanceIndex);
    public static final long OFFSET$instanceContributionToHitGroupIndex = LAYOUT.byteOffset(PATH$instanceContributionToHitGroupIndex);
    public static final long OFFSET$accelerationStructure = LAYOUT.byteOffset(PATH$accelerationStructure);

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

}
/// dummy, not implemented yet
