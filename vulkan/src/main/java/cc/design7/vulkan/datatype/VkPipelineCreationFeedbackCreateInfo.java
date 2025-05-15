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

public record VkPipelineCreationFeedbackCreateInfo(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final AddressLayout LAYOUT$pPipelineCreationFeedback = ValueLayout.ADDRESS.withTargetLayout(VkPipelineCreationFeedback.LAYOUT).withName("pPipelineCreationFeedback");
    public static final OfInt LAYOUT$pipelineStageCreationFeedbackCount = ValueLayout.JAVA_INT.withName("pipelineStageCreationFeedbackCount");
    public static final AddressLayout LAYOUT$pPipelineStageCreationFeedbacks = ValueLayout.ADDRESS.withTargetLayout(VkPipelineCreationFeedback.LAYOUT).withName("pPipelineStageCreationFeedbacks");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$pPipelineCreationFeedback, LAYOUT$pipelineStageCreationFeedbackCount, LAYOUT$pPipelineStageCreationFeedbacks);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkPipelineCreationFeedbackCreateInfo allocate(Arena arena) {
        return new VkPipelineCreationFeedbackCreateInfo(arena.allocate(LAYOUT));
    }

    public static VkPipelineCreationFeedbackCreateInfo[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPipelineCreationFeedbackCreateInfo[] ret = new VkPipelineCreationFeedbackCreateInfo[count];
        for (int i = 0; i < count; i ++) {
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
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$pPipelineCreationFeedback = PathElement.groupElement("PATH$pPipelineCreationFeedback");
    public static final PathElement PATH$pipelineStageCreationFeedbackCount = PathElement.groupElement("PATH$pipelineStageCreationFeedbackCount");
    public static final PathElement PATH$pPipelineStageCreationFeedbacks = PathElement.groupElement("PATH$pPipelineStageCreationFeedbacks");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$pPipelineCreationFeedback = LAYOUT$pPipelineCreationFeedback.byteSize();
    public static final long SIZE$pipelineStageCreationFeedbackCount = LAYOUT$pipelineStageCreationFeedbackCount.byteSize();
    public static final long SIZE$pPipelineStageCreationFeedbacks = LAYOUT$pPipelineStageCreationFeedbacks.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$pPipelineCreationFeedback = LAYOUT.byteOffset(PATH$pPipelineCreationFeedback);
    public static final long OFFSET$pipelineStageCreationFeedbackCount = LAYOUT.byteOffset(PATH$pipelineStageCreationFeedbackCount);
    public static final long OFFSET$pPipelineStageCreationFeedbacks = LAYOUT.byteOffset(PATH$pPipelineStageCreationFeedbacks);

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

    public void pPipelineCreationFeedback(@Nullable VkPipelineCreationFeedback value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pPipelineCreationFeedbackRaw(s);
    }

    @unsafe public @Nullable VkPipelineCreationFeedback[] pPipelineCreationFeedback(int assumedCount) {
        MemorySegment s = pPipelineCreationFeedbackRaw();
        if (s.address() == 0) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkPipelineCreationFeedback.SIZE);
        VkPipelineCreationFeedback[] ret = new VkPipelineCreationFeedback[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkPipelineCreationFeedback(s.asSlice(i * VkPipelineCreationFeedback.SIZE, VkPipelineCreationFeedback.SIZE));
        }
        return ret;
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

    public void pPipelineStageCreationFeedbacks(@Nullable VkPipelineCreationFeedback value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pPipelineStageCreationFeedbacksRaw(s);
    }

    @unsafe public @Nullable VkPipelineCreationFeedback[] pPipelineStageCreationFeedbacks(int assumedCount) {
        MemorySegment s = pPipelineStageCreationFeedbacksRaw();
        if (s.address() == 0) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkPipelineCreationFeedback.SIZE);
        VkPipelineCreationFeedback[] ret = new VkPipelineCreationFeedback[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkPipelineCreationFeedback(s.asSlice(i * VkPipelineCreationFeedback.SIZE, VkPipelineCreationFeedback.SIZE));
        }
        return ret;
    }

}
/// dummy, not implemented yet
