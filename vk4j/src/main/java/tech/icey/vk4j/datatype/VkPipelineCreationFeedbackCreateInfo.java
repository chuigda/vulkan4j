package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import org.jetbrains.annotations.Nullable;
import tech.icey.panama.IPointer;
import tech.icey.panama.NativeLayout;
import tech.icey.panama.annotation.*;
import tech.icey.panama.buffer.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

/// {@snippet lang=c :
/// typedef struct VkPipelineCreationFeedbackCreateInfo {
///     VkStructureType sType;
///     const void* pNext;
///     VkPipelineCreationFeedback* pPipelineCreationFeedback;
///     uint32_t pipelineStageCreationFeedbackCount;
///     VkPipelineCreationFeedback* pPipelineStageCreationFeedbacks;
/// } VkPipelineCreationFeedbackCreateInfo;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkPipelineCreationFeedbackCreateInfo.html">VkPipelineCreationFeedbackCreateInfo</a>
public record VkPipelineCreationFeedbackCreateInfo(MemorySegment segment) implements IPointer {
    public VkPipelineCreationFeedbackCreateInfo(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PIPELINE_CREATION_FEEDBACK_CREATE_INFO);
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

    public void pNext(@Nullable IPointer pointer) {
        pNext(pointer == null ? MemorySegment.NULL : pointer.segment());
    }

    public @pointer(comment="VkPipelineCreationFeedback*") MemorySegment pPipelineCreationFeedbackRaw() {
        return segment.get(LAYOUT$pPipelineCreationFeedback, OFFSET$pPipelineCreationFeedback);
    }

    public void pPipelineCreationFeedbackRaw(@pointer(comment="VkPipelineCreationFeedback*") MemorySegment value) {
        segment.set(LAYOUT$pPipelineCreationFeedback, OFFSET$pPipelineCreationFeedback, value);
    }

    public @Nullable VkPipelineCreationFeedback pPipelineCreationFeedback() {
        MemorySegment s = pPipelineCreationFeedbackRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkPipelineCreationFeedback(s);
    }

    /// Note: this function is {@link unsafe} because it's up to user to provide the correct count of elements.
    @unsafe
    public @Nullable VkPipelineCreationFeedback[] pPipelineCreationFeedback(int assumedCount) {
        MemorySegment s = pPipelineCreationFeedbackRaw().reinterpret(assumedCount * VkPipelineCreationFeedback.SIZE);
        VkPipelineCreationFeedback[] arr = new VkPipelineCreationFeedback[assumedCount];
        for (int i = 0; i < assumedCount; i++) {
            arr[i] = new VkPipelineCreationFeedback(s.asSlice(i * VkPipelineCreationFeedback.SIZE, VkPipelineCreationFeedback.SIZE));
        }
        return arr;
    }

    public void pPipelineCreationFeedback(@Nullable VkPipelineCreationFeedback value) {
        pPipelineCreationFeedbackRaw(value == null ? MemorySegment.NULL : value.segment());
    }

    public @unsigned int pipelineStageCreationFeedbackCount() {
        return segment.get(LAYOUT$pipelineStageCreationFeedbackCount, OFFSET$pipelineStageCreationFeedbackCount);
    }

    public void pipelineStageCreationFeedbackCount(@unsigned int value) {
        segment.set(LAYOUT$pipelineStageCreationFeedbackCount, OFFSET$pipelineStageCreationFeedbackCount, value);
    }

    public @pointer(comment="VkPipelineCreationFeedback*") MemorySegment pPipelineStageCreationFeedbacksRaw() {
        return segment.get(LAYOUT$pPipelineStageCreationFeedbacks, OFFSET$pPipelineStageCreationFeedbacks);
    }

    public void pPipelineStageCreationFeedbacksRaw(@pointer(comment="VkPipelineCreationFeedback*") MemorySegment value) {
        segment.set(LAYOUT$pPipelineStageCreationFeedbacks, OFFSET$pPipelineStageCreationFeedbacks, value);
    }

    public @Nullable VkPipelineCreationFeedback pPipelineStageCreationFeedbacks() {
        MemorySegment s = pPipelineStageCreationFeedbacksRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkPipelineCreationFeedback(s);
    }

    /// Note: this function is {@link unsafe} because it's up to user to provide the correct count of elements.
    @unsafe
    public @Nullable VkPipelineCreationFeedback[] pPipelineStageCreationFeedbacks(int assumedCount) {
        MemorySegment s = pPipelineStageCreationFeedbacksRaw().reinterpret(assumedCount * VkPipelineCreationFeedback.SIZE);
        VkPipelineCreationFeedback[] arr = new VkPipelineCreationFeedback[assumedCount];
        for (int i = 0; i < assumedCount; i++) {
            arr[i] = new VkPipelineCreationFeedback(s.asSlice(i * VkPipelineCreationFeedback.SIZE, VkPipelineCreationFeedback.SIZE));
        }
        return arr;
    }

    public void pPipelineStageCreationFeedbacks(@Nullable VkPipelineCreationFeedback value) {
        pPipelineStageCreationFeedbacksRaw(value == null ? MemorySegment.NULL : value.segment());
    }

    public static VkPipelineCreationFeedbackCreateInfo allocate(Arena arena) {
        return new VkPipelineCreationFeedbackCreateInfo(arena.allocate(LAYOUT));
    }

    public static VkPipelineCreationFeedbackCreateInfo[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPipelineCreationFeedbackCreateInfo[] ret = new VkPipelineCreationFeedbackCreateInfo[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkPipelineCreationFeedbackCreateInfo(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPipelineCreationFeedbackCreateInfo clone(Arena arena, VkPipelineCreationFeedbackCreateInfo src) {
        VkPipelineCreationFeedbackCreateInfo ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPipelineCreationFeedbackCreateInfo[] clone(Arena arena, VkPipelineCreationFeedbackCreateInfo[] src) {
        VkPipelineCreationFeedbackCreateInfo[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withTargetLayout(VkPipelineCreationFeedback.LAYOUT).withName("pPipelineCreationFeedback"),
        ValueLayout.JAVA_INT.withName("pipelineStageCreationFeedbackCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkPipelineCreationFeedback.LAYOUT).withName("pPipelineStageCreationFeedbacks")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$pPipelineCreationFeedback = PathElement.groupElement("pPipelineCreationFeedback");
    public static final PathElement PATH$pipelineStageCreationFeedbackCount = PathElement.groupElement("pipelineStageCreationFeedbackCount");
    public static final PathElement PATH$pPipelineStageCreationFeedbacks = PathElement.groupElement("pPipelineStageCreationFeedbacks");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final AddressLayout LAYOUT$pPipelineCreationFeedback = (AddressLayout) LAYOUT.select(PATH$pPipelineCreationFeedback);
    public static final OfInt LAYOUT$pipelineStageCreationFeedbackCount = (OfInt) LAYOUT.select(PATH$pipelineStageCreationFeedbackCount);
    public static final AddressLayout LAYOUT$pPipelineStageCreationFeedbacks = (AddressLayout) LAYOUT.select(PATH$pPipelineStageCreationFeedbacks);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$pPipelineCreationFeedback = LAYOUT.byteOffset(PATH$pPipelineCreationFeedback);
    public static final long OFFSET$pipelineStageCreationFeedbackCount = LAYOUT.byteOffset(PATH$pipelineStageCreationFeedbackCount);
    public static final long OFFSET$pPipelineStageCreationFeedbacks = LAYOUT.byteOffset(PATH$pPipelineStageCreationFeedbacks);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$pPipelineCreationFeedback = LAYOUT$pPipelineCreationFeedback.byteSize();
    public static final long SIZE$pipelineStageCreationFeedbackCount = LAYOUT$pipelineStageCreationFeedbackCount.byteSize();
    public static final long SIZE$pPipelineStageCreationFeedbacks = LAYOUT$pPipelineStageCreationFeedbacks.byteSize();
}
