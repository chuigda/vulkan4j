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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkQueryPoolCreateInfo.html">VkQueryPoolCreateInfo</a>
@ValueBasedCandidate
public record VkQueryPoolCreateInfo(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$flags = ValueLayout.JAVA_INT.withName("flags");
    public static final OfInt LAYOUT$queryType = ValueLayout.JAVA_INT.withName("queryType");
    public static final OfInt LAYOUT$queryCount = ValueLayout.JAVA_INT.withName("queryCount");
    public static final OfInt LAYOUT$pipelineStatistics = ValueLayout.JAVA_INT.withName("pipelineStatistics");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$flags, LAYOUT$queryType, LAYOUT$queryCount, LAYOUT$pipelineStatistics);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkQueryPoolCreateInfo allocate(Arena arena) {
        return new VkQueryPoolCreateInfo(arena.allocate(LAYOUT));
    }

    public static VkQueryPoolCreateInfo[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkQueryPoolCreateInfo[] ret = new VkQueryPoolCreateInfo[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkQueryPoolCreateInfo(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkQueryPoolCreateInfo clone(Arena arena, VkQueryPoolCreateInfo src) {
        VkQueryPoolCreateInfo ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkQueryPoolCreateInfo[] clone(Arena arena, VkQueryPoolCreateInfo[] src) {
        VkQueryPoolCreateInfo[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$flags = PathElement.groupElement("PATH$flags");
    public static final PathElement PATH$queryType = PathElement.groupElement("PATH$queryType");
    public static final PathElement PATH$queryCount = PathElement.groupElement("PATH$queryCount");
    public static final PathElement PATH$pipelineStatistics = PathElement.groupElement("PATH$pipelineStatistics");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$queryType = LAYOUT$queryType.byteSize();
    public static final long SIZE$queryCount = LAYOUT$queryCount.byteSize();
    public static final long SIZE$pipelineStatistics = LAYOUT$pipelineStatistics.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$queryType = LAYOUT.byteOffset(PATH$queryType);
    public static final long OFFSET$queryCount = LAYOUT.byteOffset(PATH$queryCount);
    public static final long OFFSET$pipelineStatistics = LAYOUT.byteOffset(PATH$pipelineStatistics);

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

    public @enumtype(VkQueryPoolCreateFlags.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public void flags(@enumtype(VkQueryPoolCreateFlags.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
    }

    public @enumtype(VkQueryType.class) int queryType() {
        return segment.get(LAYOUT$queryType, OFFSET$queryType);
    }

    public void queryType(@enumtype(VkQueryType.class) int value) {
        segment.set(LAYOUT$queryType, OFFSET$queryType, value);
    }

    public @unsigned int queryCount() {
        return segment.get(LAYOUT$queryCount, OFFSET$queryCount);
    }

    public void queryCount(@unsigned int value) {
        segment.set(LAYOUT$queryCount, OFFSET$queryCount, value);
    }

    public @enumtype(VkQueryPipelineStatisticFlags.class) int pipelineStatistics() {
        return segment.get(LAYOUT$pipelineStatistics, OFFSET$pipelineStatistics);
    }

    public void pipelineStatistics(@enumtype(VkQueryPipelineStatisticFlags.class) int value) {
        segment.set(LAYOUT$pipelineStatistics, OFFSET$pipelineStatistics, value);
    }

}
