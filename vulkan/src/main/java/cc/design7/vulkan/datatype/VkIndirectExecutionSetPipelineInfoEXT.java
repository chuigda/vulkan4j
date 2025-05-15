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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkIndirectExecutionSetPipelineInfoEXT.html">VkIndirectExecutionSetPipelineInfoEXT</a>
@ValueBasedCandidate
public record VkIndirectExecutionSetPipelineInfoEXT(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final AddressLayout LAYOUT$initialPipeline = ValueLayout.ADDRESS.withName("initialPipeline");
    public static final OfInt LAYOUT$maxPipelineCount = ValueLayout.JAVA_INT.withName("maxPipelineCount");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$initialPipeline, LAYOUT$maxPipelineCount);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkIndirectExecutionSetPipelineInfoEXT allocate(Arena arena) {
        return new VkIndirectExecutionSetPipelineInfoEXT(arena.allocate(LAYOUT));
    }

    public static VkIndirectExecutionSetPipelineInfoEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkIndirectExecutionSetPipelineInfoEXT[] ret = new VkIndirectExecutionSetPipelineInfoEXT[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkIndirectExecutionSetPipelineInfoEXT(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkIndirectExecutionSetPipelineInfoEXT clone(Arena arena, VkIndirectExecutionSetPipelineInfoEXT src) {
        VkIndirectExecutionSetPipelineInfoEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkIndirectExecutionSetPipelineInfoEXT[] clone(Arena arena, VkIndirectExecutionSetPipelineInfoEXT[] src) {
        VkIndirectExecutionSetPipelineInfoEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$initialPipeline = PathElement.groupElement("PATH$initialPipeline");
    public static final PathElement PATH$maxPipelineCount = PathElement.groupElement("PATH$maxPipelineCount");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$initialPipeline = LAYOUT$initialPipeline.byteSize();
    public static final long SIZE$maxPipelineCount = LAYOUT$maxPipelineCount.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$initialPipeline = LAYOUT.byteOffset(PATH$initialPipeline);
    public static final long OFFSET$maxPipelineCount = LAYOUT.byteOffset(PATH$maxPipelineCount);

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

    public @Nullable VkPipeline initialPipeline() {
        MemorySegment s = segment.asSlice(OFFSET$initialPipeline, SIZE$initialPipeline);
        if (s.address() == 0) {
            return null;
        }
        return new VkPipeline(s);
    }

    public void initialPipeline(@Nullable VkPipeline value) {
        segment.set(LAYOUT$initialPipeline, OFFSET$initialPipeline, value != null ? value.segment() : MemorySegment.NULL);
    }

    public @unsigned int maxPipelineCount() {
        return segment.get(LAYOUT$maxPipelineCount, OFFSET$maxPipelineCount);
    }

    public void maxPipelineCount(@unsigned int value) {
        segment.set(LAYOUT$maxPipelineCount, OFFSET$maxPipelineCount, value);
    }

}
