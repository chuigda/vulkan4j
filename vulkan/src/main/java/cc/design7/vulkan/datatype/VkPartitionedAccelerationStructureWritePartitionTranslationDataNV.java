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

public record VkPartitionedAccelerationStructureWritePartitionTranslationDataNV(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$partitionIndex = ValueLayout.JAVA_INT.withName("partitionIndex");
    public static final OfFloat LAYOUT$partitionTranslation = ValueLayout.JAVA_FLOAT.withName("partitionTranslation");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$partitionIndex, LAYOUT$partitionTranslation);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkPartitionedAccelerationStructureWritePartitionTranslationDataNV allocate(Arena arena) {
        return new VkPartitionedAccelerationStructureWritePartitionTranslationDataNV(arena.allocate(LAYOUT));
    }

    public static VkPartitionedAccelerationStructureWritePartitionTranslationDataNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPartitionedAccelerationStructureWritePartitionTranslationDataNV[] ret = new VkPartitionedAccelerationStructureWritePartitionTranslationDataNV[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPartitionedAccelerationStructureWritePartitionTranslationDataNV(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPartitionedAccelerationStructureWritePartitionTranslationDataNV clone(Arena arena, VkPartitionedAccelerationStructureWritePartitionTranslationDataNV src) {
        VkPartitionedAccelerationStructureWritePartitionTranslationDataNV ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPartitionedAccelerationStructureWritePartitionTranslationDataNV[] clone(Arena arena, VkPartitionedAccelerationStructureWritePartitionTranslationDataNV[] src) {
        VkPartitionedAccelerationStructureWritePartitionTranslationDataNV[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$partitionIndex = PathElement.groupElement("PATH$partitionIndex");
    public static final PathElement PATH$partitionTranslation = PathElement.groupElement("PATH$partitionTranslation");

    public static final long SIZE$partitionIndex = LAYOUT$partitionIndex.byteSize();
    public static final long SIZE$partitionTranslation = LAYOUT$partitionTranslation.byteSize();

    public static final long OFFSET$partitionIndex = LAYOUT.byteOffset(PATH$partitionIndex);
    public static final long OFFSET$partitionTranslation = LAYOUT.byteOffset(PATH$partitionTranslation);

    public @unsigned int partitionIndex() {
        return segment.get(LAYOUT$partitionIndex, OFFSET$partitionIndex);
    }

    public void partitionIndex(@unsigned int value) {
        segment.set(LAYOUT$partitionIndex, OFFSET$partitionIndex, value);
    }

    public float partitionTranslation() {
        return segment.get(LAYOUT$partitionTranslation, OFFSET$partitionTranslation);
    }

    public void partitionTranslation(float value) {
        segment.set(LAYOUT$partitionTranslation, OFFSET$partitionTranslation, value);
    }

}
/// dummy, not implemented yet
