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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkGeneratedCommandsMemoryRequirementsInfoNV.html">VkGeneratedCommandsMemoryRequirementsInfoNV</a>
@ValueBasedCandidate
public record VkGeneratedCommandsMemoryRequirementsInfoNV(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$pipelineBindPoint = ValueLayout.JAVA_INT.withName("pipelineBindPoint");
    public static final AddressLayout LAYOUT$pipeline = ValueLayout.ADDRESS.withName("pipeline");
    public static final AddressLayout LAYOUT$indirectCommandsLayout = ValueLayout.ADDRESS.withName("indirectCommandsLayout");
    public static final OfInt LAYOUT$maxSequencesCount = ValueLayout.JAVA_INT.withName("maxSequencesCount");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$pipelineBindPoint, LAYOUT$pipeline, LAYOUT$indirectCommandsLayout, LAYOUT$maxSequencesCount);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkGeneratedCommandsMemoryRequirementsInfoNV allocate(Arena arena) {
        return new VkGeneratedCommandsMemoryRequirementsInfoNV(arena.allocate(LAYOUT));
    }

    public static VkGeneratedCommandsMemoryRequirementsInfoNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkGeneratedCommandsMemoryRequirementsInfoNV[] ret = new VkGeneratedCommandsMemoryRequirementsInfoNV[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkGeneratedCommandsMemoryRequirementsInfoNV(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkGeneratedCommandsMemoryRequirementsInfoNV clone(Arena arena, VkGeneratedCommandsMemoryRequirementsInfoNV src) {
        VkGeneratedCommandsMemoryRequirementsInfoNV ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkGeneratedCommandsMemoryRequirementsInfoNV[] clone(Arena arena, VkGeneratedCommandsMemoryRequirementsInfoNV[] src) {
        VkGeneratedCommandsMemoryRequirementsInfoNV[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$pipelineBindPoint = PathElement.groupElement("PATH$pipelineBindPoint");
    public static final PathElement PATH$pipeline = PathElement.groupElement("PATH$pipeline");
    public static final PathElement PATH$indirectCommandsLayout = PathElement.groupElement("PATH$indirectCommandsLayout");
    public static final PathElement PATH$maxSequencesCount = PathElement.groupElement("PATH$maxSequencesCount");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$pipelineBindPoint = LAYOUT$pipelineBindPoint.byteSize();
    public static final long SIZE$pipeline = LAYOUT$pipeline.byteSize();
    public static final long SIZE$indirectCommandsLayout = LAYOUT$indirectCommandsLayout.byteSize();
    public static final long SIZE$maxSequencesCount = LAYOUT$maxSequencesCount.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$pipelineBindPoint = LAYOUT.byteOffset(PATH$pipelineBindPoint);
    public static final long OFFSET$pipeline = LAYOUT.byteOffset(PATH$pipeline);
    public static final long OFFSET$indirectCommandsLayout = LAYOUT.byteOffset(PATH$indirectCommandsLayout);
    public static final long OFFSET$maxSequencesCount = LAYOUT.byteOffset(PATH$maxSequencesCount);

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

    public @enumtype(VkPipelineBindPoint.class) int pipelineBindPoint() {
        return segment.get(LAYOUT$pipelineBindPoint, OFFSET$pipelineBindPoint);
    }

    public void pipelineBindPoint(@enumtype(VkPipelineBindPoint.class) int value) {
        segment.set(LAYOUT$pipelineBindPoint, OFFSET$pipelineBindPoint, value);
    }

    public @Nullable VkPipeline pipeline() {
        MemorySegment s = segment.asSlice(OFFSET$pipeline, SIZE$pipeline);
        if (s.address() == 0) {
            return null;
        }
        return new VkPipeline(s);
    }

    public void pipeline() {
        segment.set(LAYOUT$pipeline, OFFSET$pipeline, value != null ? value.segment() : MemorySegment.NULL);
    }

    public @Nullable VkIndirectCommandsLayoutNV indirectCommandsLayout() {
        MemorySegment s = segment.asSlice(OFFSET$indirectCommandsLayout, SIZE$indirectCommandsLayout);
        if (s.address() == 0) {
            return null;
        }
        return new VkIndirectCommandsLayoutNV(s);
    }

    public void indirectCommandsLayout() {
        segment.set(LAYOUT$indirectCommandsLayout, OFFSET$indirectCommandsLayout, value != null ? value.segment() : MemorySegment.NULL);
    }

    public @unsigned int maxSequencesCount() {
        return segment.get(LAYOUT$maxSequencesCount, OFFSET$maxSequencesCount);
    }

    public void maxSequencesCount(@unsigned int value) {
        segment.set(LAYOUT$maxSequencesCount, OFFSET$maxSequencesCount, value);
    }

}
