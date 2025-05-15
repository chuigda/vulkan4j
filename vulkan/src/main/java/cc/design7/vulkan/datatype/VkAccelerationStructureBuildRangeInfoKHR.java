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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkAccelerationStructureBuildRangeInfoKHR.html">VkAccelerationStructureBuildRangeInfoKHR</a>
@ValueBasedCandidate
public record VkAccelerationStructureBuildRangeInfoKHR(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$primitiveCount = ValueLayout.JAVA_INT.withName("primitiveCount");
    public static final OfInt LAYOUT$primitiveOffset = ValueLayout.JAVA_INT.withName("primitiveOffset");
    public static final OfInt LAYOUT$firstVertex = ValueLayout.JAVA_INT.withName("firstVertex");
    public static final OfInt LAYOUT$transformOffset = ValueLayout.JAVA_INT.withName("transformOffset");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$primitiveCount, LAYOUT$primitiveOffset, LAYOUT$firstVertex, LAYOUT$transformOffset);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkAccelerationStructureBuildRangeInfoKHR allocate(Arena arena) {
        return new VkAccelerationStructureBuildRangeInfoKHR(arena.allocate(LAYOUT));
    }

    public static VkAccelerationStructureBuildRangeInfoKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkAccelerationStructureBuildRangeInfoKHR[] ret = new VkAccelerationStructureBuildRangeInfoKHR[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkAccelerationStructureBuildRangeInfoKHR(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkAccelerationStructureBuildRangeInfoKHR clone(Arena arena, VkAccelerationStructureBuildRangeInfoKHR src) {
        VkAccelerationStructureBuildRangeInfoKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkAccelerationStructureBuildRangeInfoKHR[] clone(Arena arena, VkAccelerationStructureBuildRangeInfoKHR[] src) {
        VkAccelerationStructureBuildRangeInfoKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$primitiveCount = PathElement.groupElement("PATH$primitiveCount");
    public static final PathElement PATH$primitiveOffset = PathElement.groupElement("PATH$primitiveOffset");
    public static final PathElement PATH$firstVertex = PathElement.groupElement("PATH$firstVertex");
    public static final PathElement PATH$transformOffset = PathElement.groupElement("PATH$transformOffset");

    public static final long SIZE$primitiveCount = LAYOUT$primitiveCount.byteSize();
    public static final long SIZE$primitiveOffset = LAYOUT$primitiveOffset.byteSize();
    public static final long SIZE$firstVertex = LAYOUT$firstVertex.byteSize();
    public static final long SIZE$transformOffset = LAYOUT$transformOffset.byteSize();

    public static final long OFFSET$primitiveCount = LAYOUT.byteOffset(PATH$primitiveCount);
    public static final long OFFSET$primitiveOffset = LAYOUT.byteOffset(PATH$primitiveOffset);
    public static final long OFFSET$firstVertex = LAYOUT.byteOffset(PATH$firstVertex);
    public static final long OFFSET$transformOffset = LAYOUT.byteOffset(PATH$transformOffset);

    public @unsigned int primitiveCount() {
        return segment.get(LAYOUT$primitiveCount, OFFSET$primitiveCount);
    }

    public void primitiveCount(@unsigned int value) {
        segment.set(LAYOUT$primitiveCount, OFFSET$primitiveCount, value);
    }

    public @unsigned int primitiveOffset() {
        return segment.get(LAYOUT$primitiveOffset, OFFSET$primitiveOffset);
    }

    public void primitiveOffset(@unsigned int value) {
        segment.set(LAYOUT$primitiveOffset, OFFSET$primitiveOffset, value);
    }

    public @unsigned int firstVertex() {
        return segment.get(LAYOUT$firstVertex, OFFSET$firstVertex);
    }

    public void firstVertex(@unsigned int value) {
        segment.set(LAYOUT$firstVertex, OFFSET$firstVertex, value);
    }

    public @unsigned int transformOffset() {
        return segment.get(LAYOUT$transformOffset, OFFSET$transformOffset);
    }

    public void transformOffset(@unsigned int value) {
        segment.set(LAYOUT$transformOffset, OFFSET$transformOffset, value);
    }

}
