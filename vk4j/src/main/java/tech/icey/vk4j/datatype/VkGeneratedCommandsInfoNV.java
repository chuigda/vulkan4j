package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.IPointer;
import tech.icey.vk4j.annotation.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.buffer.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import tech.icey.vk4j.NativeLayout;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

/// {@snippet lang=c :
/// typedef struct VkGeneratedCommandsInfoNV {
///     VkStructureType sType;
///     const void* pNext;
///     VkPipelineBindPoint pipelineBindPoint;
///     VkPipeline pipeline;
///     VkIndirectCommandsLayoutNV indirectCommandsLayout;
///     uint32_t streamCount;
///     const VkIndirectCommandsStreamNV* pStreams;
///     uint32_t sequencesCount;
///     VkBuffer preprocessBuffer;
///     VkDeviceSize preprocessOffset;
///     VkDeviceSize preprocessSize;
///     VkBuffer sequencesCountBuffer;
///     VkDeviceSize sequencesCountOffset;
///     VkBuffer sequencesIndexBuffer;
///     VkDeviceSize sequencesIndexOffset;
/// } VkGeneratedCommandsInfoNV;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkGeneratedCommandsInfoNV.html">VkGeneratedCommandsInfoNV</a>
public record VkGeneratedCommandsInfoNV(MemorySegment segment) implements IPointer {
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

    public void pNext(IPointer pointer) {
        pNext(pointer.segment());
    }

    public @enumtype(VkPipelineBindPoint.class) int pipelineBindPoint() {
        return segment.get(LAYOUT$pipelineBindPoint, OFFSET$pipelineBindPoint);
    }

    public void pipelineBindPoint(@enumtype(VkPipelineBindPoint.class) int value) {
        segment.set(LAYOUT$pipelineBindPoint, OFFSET$pipelineBindPoint, value);
    }

    public VkPipeline pipeline() {
        return new VkPipeline(segment.get(LAYOUT$pipeline, OFFSET$pipeline));
    }

    public void pipeline(VkPipeline value) {
        segment.set(LAYOUT$pipeline, OFFSET$pipeline, value.segment());
    }

    public VkIndirectCommandsLayoutNV indirectCommandsLayout() {
        return new VkIndirectCommandsLayoutNV(segment.get(LAYOUT$indirectCommandsLayout, OFFSET$indirectCommandsLayout));
    }

    public void indirectCommandsLayout(VkIndirectCommandsLayoutNV value) {
        segment.set(LAYOUT$indirectCommandsLayout, OFFSET$indirectCommandsLayout, value.segment());
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

    /// Note: this function is {@link unsafe} because it's up to user to provide the correct count of elements.
    @unsafe
    public @nullable VkIndirectCommandsStreamNV[] pStreams(int assumedCount) {
        MemorySegment s = pStreamsRaw().reinterpret(assumedCount * VkIndirectCommandsStreamNV.SIZE);
        VkIndirectCommandsStreamNV[] arr = new VkIndirectCommandsStreamNV[assumedCount];
        for (int i = 0; i < assumedCount; i++) {
            arr[i] = new VkIndirectCommandsStreamNV(s.asSlice(i * VkIndirectCommandsStreamNV.SIZE, VkIndirectCommandsStreamNV.SIZE));
        }
        return arr;
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
        return new VkBuffer(segment.get(LAYOUT$preprocessBuffer, OFFSET$preprocessBuffer));
    }

    public void preprocessBuffer(VkBuffer value) {
        segment.set(LAYOUT$preprocessBuffer, OFFSET$preprocessBuffer, value.segment());
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
        return new VkBuffer(segment.get(LAYOUT$sequencesCountBuffer, OFFSET$sequencesCountBuffer));
    }

    public void sequencesCountBuffer(VkBuffer value) {
        segment.set(LAYOUT$sequencesCountBuffer, OFFSET$sequencesCountBuffer, value.segment());
    }

    public @unsigned long sequencesCountOffset() {
        return segment.get(LAYOUT$sequencesCountOffset, OFFSET$sequencesCountOffset);
    }

    public void sequencesCountOffset(@unsigned long value) {
        segment.set(LAYOUT$sequencesCountOffset, OFFSET$sequencesCountOffset, value);
    }

    public VkBuffer sequencesIndexBuffer() {
        return new VkBuffer(segment.get(LAYOUT$sequencesIndexBuffer, OFFSET$sequencesIndexBuffer));
    }

    public void sequencesIndexBuffer(VkBuffer value) {
        segment.set(LAYOUT$sequencesIndexBuffer, OFFSET$sequencesIndexBuffer, value.segment());
    }

    public @unsigned long sequencesIndexOffset() {
        return segment.get(LAYOUT$sequencesIndexOffset, OFFSET$sequencesIndexOffset);
    }

    public void sequencesIndexOffset(@unsigned long value) {
        segment.set(LAYOUT$sequencesIndexOffset, OFFSET$sequencesIndexOffset, value);
    }

    public static VkGeneratedCommandsInfoNV allocate(Arena arena) {
        return new VkGeneratedCommandsInfoNV(arena.allocate(LAYOUT));
    }
    
    public static VkGeneratedCommandsInfoNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkGeneratedCommandsInfoNV[] ret = new VkGeneratedCommandsInfoNV[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkGeneratedCommandsInfoNV(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
    
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
    public static final long SIZE = LAYOUT.byteSize();

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

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$pipelineBindPoint = LAYOUT$pipelineBindPoint.byteSize();
    public static final long SIZE$pipeline = LAYOUT$pipeline.byteSize();
    public static final long SIZE$indirectCommandsLayout = LAYOUT$indirectCommandsLayout.byteSize();
    public static final long SIZE$streamCount = LAYOUT$streamCount.byteSize();
    public static final long SIZE$pStreams = LAYOUT$pStreams.byteSize();
    public static final long SIZE$sequencesCount = LAYOUT$sequencesCount.byteSize();
    public static final long SIZE$preprocessBuffer = LAYOUT$preprocessBuffer.byteSize();
    public static final long SIZE$preprocessOffset = LAYOUT$preprocessOffset.byteSize();
    public static final long SIZE$preprocessSize = LAYOUT$preprocessSize.byteSize();
    public static final long SIZE$sequencesCountBuffer = LAYOUT$sequencesCountBuffer.byteSize();
    public static final long SIZE$sequencesCountOffset = LAYOUT$sequencesCountOffset.byteSize();
    public static final long SIZE$sequencesIndexBuffer = LAYOUT$sequencesIndexBuffer.byteSize();
    public static final long SIZE$sequencesIndexOffset = LAYOUT$sequencesIndexOffset.byteSize();
}
