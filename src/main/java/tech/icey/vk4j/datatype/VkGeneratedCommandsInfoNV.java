package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.annotations.*;
import tech.icey.vk4j.array.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import tech.icey.vk4j.ptr.*;
import tech.icey.vk4j.NativeLayout;
import tech.icey.vk4j.IFactory;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

public record VkGeneratedCommandsInfoNV(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("pipelineBindPoint"),
        ValueLayout.ADDRESS.withName("pipeline"),
        ValueLayout.ADDRESS.withName("indirectCommandsLayout"),
        ValueLayout.JAVA_INT.withName("streamCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkIndirectCommandsStreamNV.LAYOUT).withName("pStreams"),
        ValueLayout.JAVA_INT.withName("sequencesCount"),
        ValueLayout.ADDRESS.withName("preprocessBuffer"),
        ValueLayout.JAVA_LONG.withName("preprocessOffset"),
        ValueLayout.JAVA_LONG.withName("preprocessSize"),
        ValueLayout.ADDRESS.withName("sequencesCountBuffer"),
        ValueLayout.JAVA_LONG.withName("sequencesCountOffset"),
        ValueLayout.ADDRESS.withName("sequencesIndexBuffer"),
        ValueLayout.JAVA_LONG.withName("sequencesIndexOffset")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$pipelineBindPoint = PathElement.groupElement("pipelineBindPoint");
    public static final PathElement PATH$pipeline = PathElement.groupElement("pipeline");
    public static final PathElement PATH$indirectCommandsLayout = PathElement.groupElement("indirectCommandsLayout");
    public static final PathElement PATH$streamCount = PathElement.groupElement("streamCount");
    public static final PathElement PATH$pStreams = PathElement.groupElement("pStreams");
    public static final PathElement PATH$sequencesCount = PathElement.groupElement("sequencesCount");
    public static final PathElement PATH$preprocessBuffer = PathElement.groupElement("preprocessBuffer");
    public static final PathElement PATH$preprocessOffset = PathElement.groupElement("preprocessOffset");
    public static final PathElement PATH$preprocessSize = PathElement.groupElement("preprocessSize");
    public static final PathElement PATH$sequencesCountBuffer = PathElement.groupElement("sequencesCountBuffer");
    public static final PathElement PATH$sequencesCountOffset = PathElement.groupElement("sequencesCountOffset");
    public static final PathElement PATH$sequencesIndexBuffer = PathElement.groupElement("sequencesIndexBuffer");
    public static final PathElement PATH$sequencesIndexOffset = PathElement.groupElement("sequencesIndexOffset");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$pipelineBindPoint = (OfInt) LAYOUT.select(PATH$pipelineBindPoint);
    public static final AddressLayout LAYOUT$pipeline = (AddressLayout) LAYOUT.select(PATH$pipeline);
    public static final AddressLayout LAYOUT$indirectCommandsLayout = (AddressLayout) LAYOUT.select(PATH$indirectCommandsLayout);
    public static final OfInt LAYOUT$streamCount = (OfInt) LAYOUT.select(PATH$streamCount);
    public static final AddressLayout LAYOUT$pStreams = (AddressLayout) LAYOUT.select(PATH$pStreams);
    public static final OfInt LAYOUT$sequencesCount = (OfInt) LAYOUT.select(PATH$sequencesCount);
    public static final AddressLayout LAYOUT$preprocessBuffer = (AddressLayout) LAYOUT.select(PATH$preprocessBuffer);
    public static final OfLong LAYOUT$preprocessOffset = (OfLong) LAYOUT.select(PATH$preprocessOffset);
    public static final OfLong LAYOUT$preprocessSize = (OfLong) LAYOUT.select(PATH$preprocessSize);
    public static final AddressLayout LAYOUT$sequencesCountBuffer = (AddressLayout) LAYOUT.select(PATH$sequencesCountBuffer);
    public static final OfLong LAYOUT$sequencesCountOffset = (OfLong) LAYOUT.select(PATH$sequencesCountOffset);
    public static final AddressLayout LAYOUT$sequencesIndexBuffer = (AddressLayout) LAYOUT.select(PATH$sequencesIndexBuffer);
    public static final OfLong LAYOUT$sequencesIndexOffset = (OfLong) LAYOUT.select(PATH$sequencesIndexOffset);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$pipelineBindPoint = LAYOUT.byteOffset(PATH$pipelineBindPoint);
    public static final long OFFSET$pipeline = LAYOUT.byteOffset(PATH$pipeline);
    public static final long OFFSET$indirectCommandsLayout = LAYOUT.byteOffset(PATH$indirectCommandsLayout);
    public static final long OFFSET$streamCount = LAYOUT.byteOffset(PATH$streamCount);
    public static final long OFFSET$pStreams = LAYOUT.byteOffset(PATH$pStreams);
    public static final long OFFSET$sequencesCount = LAYOUT.byteOffset(PATH$sequencesCount);
    public static final long OFFSET$preprocessBuffer = LAYOUT.byteOffset(PATH$preprocessBuffer);
    public static final long OFFSET$preprocessOffset = LAYOUT.byteOffset(PATH$preprocessOffset);
    public static final long OFFSET$preprocessSize = LAYOUT.byteOffset(PATH$preprocessSize);
    public static final long OFFSET$sequencesCountBuffer = LAYOUT.byteOffset(PATH$sequencesCountBuffer);
    public static final long OFFSET$sequencesCountOffset = LAYOUT.byteOffset(PATH$sequencesCountOffset);
    public static final long OFFSET$sequencesIndexBuffer = LAYOUT.byteOffset(PATH$sequencesIndexBuffer);
    public static final long OFFSET$sequencesIndexOffset = LAYOUT.byteOffset(PATH$sequencesIndexOffset);

    public VkGeneratedCommandsInfoNV(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_GENERATED_COMMANDS_INFO_NV);
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

    public @unsigned int streamCount() {
        return segment.get(LAYOUT$streamCount, OFFSET$streamCount);
    }

    public void streamCount(@unsigned int value) {
        segment.set(LAYOUT$streamCount, OFFSET$streamCount, value);
    }

    public @pointer(comment="VkIndirectCommandsStreamNV*") MemorySegment pStreamsRaw() {
        return segment.get(LAYOUT$pStreams, OFFSET$pStreams);
    }

    public void pStreamsRaw(@pointer(comment="VkIndirectCommandsStreamNV*") MemorySegment value) {
        segment.set(LAYOUT$pStreams, OFFSET$pStreams, value);
    }
    
    public @nullable VkIndirectCommandsStreamNV pStreams() {
        MemorySegment s = pStreamsRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkIndirectCommandsStreamNV(s);
    }

    public void pStreams(@nullable VkIndirectCommandsStreamNV value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pStreamsRaw(s);
    }

    public @unsigned int sequencesCount() {
        return segment.get(LAYOUT$sequencesCount, OFFSET$sequencesCount);
    }

    public void sequencesCount(@unsigned int value) {
        segment.set(LAYOUT$sequencesCount, OFFSET$sequencesCount, value);
    }

    public VkBuffer preprocessBuffer() {
        return new VkBuffer(segment.asSlice(OFFSET$preprocessBuffer, LAYOUT$preprocessBuffer));
    }

    public void preprocessBuffer(VkBuffer value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$preprocessBuffer, LAYOUT$preprocessBuffer.byteSize());
    }

    public @unsigned long preprocessOffset() {
        return segment.get(LAYOUT$preprocessOffset, OFFSET$preprocessOffset);
    }

    public void preprocessOffset(@unsigned long value) {
        segment.set(LAYOUT$preprocessOffset, OFFSET$preprocessOffset, value);
    }

    public @unsigned long preprocessSize() {
        return segment.get(LAYOUT$preprocessSize, OFFSET$preprocessSize);
    }

    public void preprocessSize(@unsigned long value) {
        segment.set(LAYOUT$preprocessSize, OFFSET$preprocessSize, value);
    }

    public VkBuffer sequencesCountBuffer() {
        return new VkBuffer(segment.asSlice(OFFSET$sequencesCountBuffer, LAYOUT$sequencesCountBuffer));
    }

    public void sequencesCountBuffer(VkBuffer value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$sequencesCountBuffer, LAYOUT$sequencesCountBuffer.byteSize());
    }

    public @unsigned long sequencesCountOffset() {
        return segment.get(LAYOUT$sequencesCountOffset, OFFSET$sequencesCountOffset);
    }

    public void sequencesCountOffset(@unsigned long value) {
        segment.set(LAYOUT$sequencesCountOffset, OFFSET$sequencesCountOffset, value);
    }

    public VkBuffer sequencesIndexBuffer() {
        return new VkBuffer(segment.asSlice(OFFSET$sequencesIndexBuffer, LAYOUT$sequencesIndexBuffer));
    }

    public void sequencesIndexBuffer(VkBuffer value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$sequencesIndexBuffer, LAYOUT$sequencesIndexBuffer.byteSize());
    }

    public @unsigned long sequencesIndexOffset() {
        return segment.get(LAYOUT$sequencesIndexOffset, OFFSET$sequencesIndexOffset);
    }

    public void sequencesIndexOffset(@unsigned long value) {
        segment.set(LAYOUT$sequencesIndexOffset, OFFSET$sequencesIndexOffset, value);
    }


    public static final class VkGeneratedCommandsInfoNVFactory implements IFactory<VkGeneratedCommandsInfoNV> {
        @Override
        public Class<VkGeneratedCommandsInfoNV> clazz() {
            return VkGeneratedCommandsInfoNV.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkGeneratedCommandsInfoNV.LAYOUT;
        }

        @Override
        public VkGeneratedCommandsInfoNV create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkGeneratedCommandsInfoNV createUninit(MemorySegment segment) {
            return new VkGeneratedCommandsInfoNV(segment);
        }
    }

    public static final VkGeneratedCommandsInfoNVFactory FACTORY = new VkGeneratedCommandsInfoNVFactory();
}
