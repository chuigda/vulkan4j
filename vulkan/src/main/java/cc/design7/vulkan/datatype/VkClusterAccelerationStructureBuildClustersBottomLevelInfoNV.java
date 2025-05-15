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

public record VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$clusterReferencesCount = ValueLayout.JAVA_INT.withName("clusterReferencesCount");
    public static final OfInt LAYOUT$clusterReferencesStride = ValueLayout.JAVA_INT.withName("clusterReferencesStride");
    public static final OfLong LAYOUT$clusterReferences = ValueLayout.JAVA_LONG.withName("clusterReferences");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$clusterReferencesCount, LAYOUT$clusterReferencesStride, LAYOUT$clusterReferences);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV allocate(Arena arena) {
        return new VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV(arena.allocate(LAYOUT));
    }

    public static VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV[] ret = new VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV clone(Arena arena, VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV src) {
        VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV[] clone(Arena arena, VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV[] src) {
        VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$clusterReferencesCount = PathElement.groupElement("PATH$clusterReferencesCount");
    public static final PathElement PATH$clusterReferencesStride = PathElement.groupElement("PATH$clusterReferencesStride");
    public static final PathElement PATH$clusterReferences = PathElement.groupElement("PATH$clusterReferences");

    public static final long SIZE$clusterReferencesCount = LAYOUT$clusterReferencesCount.byteSize();
    public static final long SIZE$clusterReferencesStride = LAYOUT$clusterReferencesStride.byteSize();
    public static final long SIZE$clusterReferences = LAYOUT$clusterReferences.byteSize();

    public static final long OFFSET$clusterReferencesCount = LAYOUT.byteOffset(PATH$clusterReferencesCount);
    public static final long OFFSET$clusterReferencesStride = LAYOUT.byteOffset(PATH$clusterReferencesStride);
    public static final long OFFSET$clusterReferences = LAYOUT.byteOffset(PATH$clusterReferences);

    public @unsigned int clusterReferencesCount() {
        return segment.get(LAYOUT$clusterReferencesCount, OFFSET$clusterReferencesCount);
    }

    public void clusterReferencesCount(@unsigned int value) {
        segment.set(LAYOUT$clusterReferencesCount, OFFSET$clusterReferencesCount, value);
    }

    public @unsigned int clusterReferencesStride() {
        return segment.get(LAYOUT$clusterReferencesStride, OFFSET$clusterReferencesStride);
    }

    public void clusterReferencesStride(@unsigned int value) {
        segment.set(LAYOUT$clusterReferencesStride, OFFSET$clusterReferencesStride, value);
    }

    public @unsigned long clusterReferences() {
        return segment.get(LAYOUT$clusterReferences, OFFSET$clusterReferences);
    }

    public void clusterReferences(@unsigned long value) {
        segment.set(LAYOUT$clusterReferences, OFFSET$clusterReferences, value);
    }

}
/// dummy, not implemented yet
