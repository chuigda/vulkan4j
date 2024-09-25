package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.annotation.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.buffer.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import tech.icey.vk4j.NativeLayout;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

public record VkGeneratedCommandsMemoryRequirementsInfoNV(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("pipelineBindPoint"),
        ValueLayout.ADDRESS.withName("pipeline"),
        ValueLayout.ADDRESS.withName("indirectCommandsLayout"),
        ValueLayout.JAVA_INT.withName("maxSequencesCount")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$pipelineBindPoint = PathElement.groupElement("pipelineBindPoint");
    public static final PathElement PATH$pipeline = PathElement.groupElement("pipeline");
    public static final PathElement PATH$indirectCommandsLayout = PathElement.groupElement("indirectCommandsLayout");
    public static final PathElement PATH$maxSequencesCount = PathElement.groupElement("maxSequencesCount");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$pipelineBindPoint = (OfInt) LAYOUT.select(PATH$pipelineBindPoint);
    public static final AddressLayout LAYOUT$pipeline = (AddressLayout) LAYOUT.select(PATH$pipeline);
    public static final AddressLayout LAYOUT$indirectCommandsLayout = (AddressLayout) LAYOUT.select(PATH$indirectCommandsLayout);
    public static final OfInt LAYOUT$maxSequencesCount = (OfInt) LAYOUT.select(PATH$maxSequencesCount);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$pipelineBindPoint = LAYOUT.byteOffset(PATH$pipelineBindPoint);
    public static final long OFFSET$pipeline = LAYOUT.byteOffset(PATH$pipeline);
    public static final long OFFSET$indirectCommandsLayout = LAYOUT.byteOffset(PATH$indirectCommandsLayout);
    public static final long OFFSET$maxSequencesCount = LAYOUT.byteOffset(PATH$maxSequencesCount);

    public VkGeneratedCommandsMemoryRequirementsInfoNV(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_GENERATED_COMMANDS_MEMORY_REQUIREMENTS_INFO_NV);
    }

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

    public @enumtype(VkPipelineBindPoint.class) int pipelineBindPoint() {
        return segment.get(LAYOUT$pipelineBindPoint, OFFSET$pipelineBindPoint);
    }

    public void pipelineBindPoint(@enumtype(VkPipelineBindPoint.class) int value) {
        segment.set(LAYOUT$pipelineBindPoint, OFFSET$pipelineBindPoint, value);
    }

    public VkPipeline pipeline() {
        return new VkPipeline(segment.asSlice(OFFSET$pipeline, LAYOUT$pipeline));
    }

    public void pipeline(VkPipeline value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$pipeline, LAYOUT$pipeline.byteSize());
    }

    public VkIndirectCommandsLayoutNV indirectCommandsLayout() {
        return new VkIndirectCommandsLayoutNV(segment.asSlice(OFFSET$indirectCommandsLayout, LAYOUT$indirectCommandsLayout));
    }

    public void indirectCommandsLayout(VkIndirectCommandsLayoutNV value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$indirectCommandsLayout, LAYOUT$indirectCommandsLayout.byteSize());
    }

    public @unsigned int maxSequencesCount() {
        return segment.get(LAYOUT$maxSequencesCount, OFFSET$maxSequencesCount);
    }

    public void maxSequencesCount(@unsigned int value) {
        segment.set(LAYOUT$maxSequencesCount, OFFSET$maxSequencesCount, value);
    }

    public static VkGeneratedCommandsMemoryRequirementsInfoNV allocate(Arena arena) {
        return new VkGeneratedCommandsMemoryRequirementsInfoNV(arena.allocate(LAYOUT));
    }
    
    public static VkGeneratedCommandsMemoryRequirementsInfoNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkGeneratedCommandsMemoryRequirementsInfoNV[] ret = new VkGeneratedCommandsMemoryRequirementsInfoNV[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkGeneratedCommandsMemoryRequirementsInfoNV(segment.asSlice(i * LAYOUT.byteSize(), LAYOUT.byteSize()));
        }
        return ret;
    }
}
