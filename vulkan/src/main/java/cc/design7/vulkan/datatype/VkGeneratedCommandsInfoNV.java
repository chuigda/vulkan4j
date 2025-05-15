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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkGeneratedCommandsInfoNV.html"><code>VkGeneratedCommandsInfoNV</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkGeneratedCommandsInfoNV {
///     VkStructureType sType;
///     void const* pNext;
///     VkPipelineBindPoint pipelineBindPoint;
///     VkPipeline pipeline;
///     VkIndirectCommandsLayoutNV indirectCommandsLayout;
///     uint32_t streamCount;
///     VkIndirectCommandsStreamNV const* pStreams;
///     uint32_t sequencesCount;
///     VkBuffer preprocessBuffer;
///     VkDeviceSize preprocessOffset;
///     VkDeviceSize preprocessSize;
///     VkBuffer sequencesCountBuffer;
///     VkDeviceSize sequencesCountOffset;
///     VkBuffer sequencesIndexBuffer;
///     VkDeviceSize sequencesIndexOffset;
/// } VkGeneratedCommandsInfoNV;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_GENERATED_COMMANDS_INFO_NV`
///
/// The {@link VkGeneratedCommandsInfoNV#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkGeneratedCommandsInfoNV#autoInit} to initialize these fields manually for
/// non-allocated instances.
///
/// ## Contracts
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to)
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkGeneratedCommandsInfoNV.html"><code>VkGeneratedCommandsInfoNV</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkGeneratedCommandsInfoNV(@NotNull MemorySegment segment) implements IPointer {
    public static VkGeneratedCommandsInfoNV allocate(Arena arena) {
        VkGeneratedCommandsInfoNV ret = new VkGeneratedCommandsInfoNV(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.GENERATED_COMMANDS_INFO_NV);
        return ret;
    }

    public static VkGeneratedCommandsInfoNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkGeneratedCommandsInfoNV[] ret = new VkGeneratedCommandsInfoNV[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkGeneratedCommandsInfoNV(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.GENERATED_COMMANDS_INFO_NV);
        }
        return ret;
    }

    public static VkGeneratedCommandsInfoNV clone(Arena arena, VkGeneratedCommandsInfoNV src) {
        VkGeneratedCommandsInfoNV ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkGeneratedCommandsInfoNV[] clone(Arena arena, VkGeneratedCommandsInfoNV[] src) {
        VkGeneratedCommandsInfoNV[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.GENERATED_COMMANDS_INFO_NV);
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

    public @Nullable VkPipeline pipeline() {
        MemorySegment s = segment.asSlice(OFFSET$pipeline, SIZE$pipeline);
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkPipeline(s);
    }

    public void pipeline(@Nullable VkPipeline value) {
        segment.set(LAYOUT$pipeline, OFFSET$pipeline, value != null ? value.segment() : MemorySegment.NULL);
    }

    public @Nullable VkIndirectCommandsLayoutNV indirectCommandsLayout() {
        MemorySegment s = segment.asSlice(OFFSET$indirectCommandsLayout, SIZE$indirectCommandsLayout);
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkIndirectCommandsLayoutNV(s);
    }

    public void indirectCommandsLayout(@Nullable VkIndirectCommandsLayoutNV value) {
        segment.set(LAYOUT$indirectCommandsLayout, OFFSET$indirectCommandsLayout, value != null ? value.segment() : MemorySegment.NULL);
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

    public @Nullable VkIndirectCommandsStreamNV pStreams() {
        MemorySegment s = pStreamsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkIndirectCommandsStreamNV(s);
    }

    public void pStreams(@Nullable VkIndirectCommandsStreamNV value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pStreamsRaw(s);
    }

    @unsafe public @Nullable VkIndirectCommandsStreamNV[] pStreams(int assumedCount) {
        MemorySegment s = pStreamsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkIndirectCommandsStreamNV.SIZE);
        VkIndirectCommandsStreamNV[] ret = new VkIndirectCommandsStreamNV[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkIndirectCommandsStreamNV(s.asSlice(i * VkIndirectCommandsStreamNV.SIZE, VkIndirectCommandsStreamNV.SIZE));
        }
        return ret;
    }

    public @unsigned int sequencesCount() {
        return segment.get(LAYOUT$sequencesCount, OFFSET$sequencesCount);
    }

    public void sequencesCount(@unsigned int value) {
        segment.set(LAYOUT$sequencesCount, OFFSET$sequencesCount, value);
    }

    public @Nullable VkBuffer preprocessBuffer() {
        MemorySegment s = segment.asSlice(OFFSET$preprocessBuffer, SIZE$preprocessBuffer);
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkBuffer(s);
    }

    public void preprocessBuffer(@Nullable VkBuffer value) {
        segment.set(LAYOUT$preprocessBuffer, OFFSET$preprocessBuffer, value != null ? value.segment() : MemorySegment.NULL);
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

    public @Nullable VkBuffer sequencesCountBuffer() {
        MemorySegment s = segment.asSlice(OFFSET$sequencesCountBuffer, SIZE$sequencesCountBuffer);
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkBuffer(s);
    }

    public void sequencesCountBuffer(@Nullable VkBuffer value) {
        segment.set(LAYOUT$sequencesCountBuffer, OFFSET$sequencesCountBuffer, value != null ? value.segment() : MemorySegment.NULL);
    }

    public @unsigned long sequencesCountOffset() {
        return segment.get(LAYOUT$sequencesCountOffset, OFFSET$sequencesCountOffset);
    }

    public void sequencesCountOffset(@unsigned long value) {
        segment.set(LAYOUT$sequencesCountOffset, OFFSET$sequencesCountOffset, value);
    }

    public @Nullable VkBuffer sequencesIndexBuffer() {
        MemorySegment s = segment.asSlice(OFFSET$sequencesIndexBuffer, SIZE$sequencesIndexBuffer);
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkBuffer(s);
    }

    public void sequencesIndexBuffer(@Nullable VkBuffer value) {
        segment.set(LAYOUT$sequencesIndexBuffer, OFFSET$sequencesIndexBuffer, value != null ? value.segment() : MemorySegment.NULL);
    }

    public @unsigned long sequencesIndexOffset() {
        return segment.get(LAYOUT$sequencesIndexOffset, OFFSET$sequencesIndexOffset);
    }

    public void sequencesIndexOffset(@unsigned long value) {
        segment.set(LAYOUT$sequencesIndexOffset, OFFSET$sequencesIndexOffset, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
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
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$pipelineBindPoint = PathElement.groupElement("PATH$pipelineBindPoint");
    public static final PathElement PATH$pipeline = PathElement.groupElement("PATH$pipeline");
    public static final PathElement PATH$indirectCommandsLayout = PathElement.groupElement("PATH$indirectCommandsLayout");
    public static final PathElement PATH$streamCount = PathElement.groupElement("PATH$streamCount");
    public static final PathElement PATH$pStreams = PathElement.groupElement("PATH$pStreams");
    public static final PathElement PATH$sequencesCount = PathElement.groupElement("PATH$sequencesCount");
    public static final PathElement PATH$preprocessBuffer = PathElement.groupElement("PATH$preprocessBuffer");
    public static final PathElement PATH$preprocessOffset = PathElement.groupElement("PATH$preprocessOffset");
    public static final PathElement PATH$preprocessSize = PathElement.groupElement("PATH$preprocessSize");
    public static final PathElement PATH$sequencesCountBuffer = PathElement.groupElement("PATH$sequencesCountBuffer");
    public static final PathElement PATH$sequencesCountOffset = PathElement.groupElement("PATH$sequencesCountOffset");
    public static final PathElement PATH$sequencesIndexBuffer = PathElement.groupElement("PATH$sequencesIndexBuffer");
    public static final PathElement PATH$sequencesIndexOffset = PathElement.groupElement("PATH$sequencesIndexOffset");

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
}
