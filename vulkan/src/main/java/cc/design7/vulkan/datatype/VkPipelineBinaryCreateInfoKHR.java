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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPipelineBinaryCreateInfoKHR.html">VkPipelineBinaryCreateInfoKHR</a>
@ValueBasedCandidate
public record VkPipelineBinaryCreateInfoKHR(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final AddressLayout LAYOUT$pKeysAndDataInfo = ValueLayout.ADDRESS.withTargetLayout(VkPipelineBinaryKeysAndDataKHR.LAYOUT).withName("pKeysAndDataInfo");
    public static final AddressLayout LAYOUT$pipeline = ValueLayout.ADDRESS.withName("pipeline");
    public static final AddressLayout LAYOUT$pPipelineCreateInfo = ValueLayout.ADDRESS.withTargetLayout(VkPipelineCreateInfoKHR.LAYOUT).withName("pPipelineCreateInfo");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$pKeysAndDataInfo, LAYOUT$pipeline, LAYOUT$pPipelineCreateInfo);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkPipelineBinaryCreateInfoKHR allocate(Arena arena) {
        return new VkPipelineBinaryCreateInfoKHR(arena.allocate(LAYOUT));
    }

    public static VkPipelineBinaryCreateInfoKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPipelineBinaryCreateInfoKHR[] ret = new VkPipelineBinaryCreateInfoKHR[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPipelineBinaryCreateInfoKHR(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPipelineBinaryCreateInfoKHR clone(Arena arena, VkPipelineBinaryCreateInfoKHR src) {
        VkPipelineBinaryCreateInfoKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPipelineBinaryCreateInfoKHR[] clone(Arena arena, VkPipelineBinaryCreateInfoKHR[] src) {
        VkPipelineBinaryCreateInfoKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$pKeysAndDataInfo = PathElement.groupElement("PATH$pKeysAndDataInfo");
    public static final PathElement PATH$pipeline = PathElement.groupElement("PATH$pipeline");
    public static final PathElement PATH$pPipelineCreateInfo = PathElement.groupElement("PATH$pPipelineCreateInfo");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$pKeysAndDataInfo = LAYOUT$pKeysAndDataInfo.byteSize();
    public static final long SIZE$pipeline = LAYOUT$pipeline.byteSize();
    public static final long SIZE$pPipelineCreateInfo = LAYOUT$pPipelineCreateInfo.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$pKeysAndDataInfo = LAYOUT.byteOffset(PATH$pKeysAndDataInfo);
    public static final long OFFSET$pipeline = LAYOUT.byteOffset(PATH$pipeline);
    public static final long OFFSET$pPipelineCreateInfo = LAYOUT.byteOffset(PATH$pPipelineCreateInfo);

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

    public @pointer(comment="VkPipelineBinaryKeysAndDataKHR*") MemorySegment pKeysAndDataInfoRaw() {
        return segment.get(LAYOUT$pKeysAndDataInfo, OFFSET$pKeysAndDataInfo);
    }

    public void pKeysAndDataInfoRaw(@pointer(comment="VkPipelineBinaryKeysAndDataKHR*") MemorySegment value) {
        segment.set(LAYOUT$pKeysAndDataInfo, OFFSET$pKeysAndDataInfo, value);
    }

    public @Nullable VkPipelineBinaryKeysAndDataKHR pKeysAndDataInfo() {
        MemorySegment s = pKeysAndDataInfoRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkPipelineBinaryKeysAndDataKHR(s);
    }

    public void pKeysAndDataInfo(@Nullable VkPipelineBinaryKeysAndDataKHR value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pKeysAndDataInfoRaw(s);
    }

    @unsafe public @Nullable VkPipelineBinaryKeysAndDataKHR[] pKeysAndDataInfo(int assumedCount) {
        MemorySegment s = pKeysAndDataInfoRaw();
        if (s.address() == 0) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkPipelineBinaryKeysAndDataKHR.SIZE);
        VkPipelineBinaryKeysAndDataKHR[] ret = new VkPipelineBinaryKeysAndDataKHR[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkPipelineBinaryKeysAndDataKHR(s.asSlice(i * VkPipelineBinaryKeysAndDataKHR.SIZE, VkPipelineBinaryKeysAndDataKHR.SIZE));
        }
        return ret;
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

    public @pointer(comment="VkPipelineCreateInfoKHR*") MemorySegment pPipelineCreateInfoRaw() {
        return segment.get(LAYOUT$pPipelineCreateInfo, OFFSET$pPipelineCreateInfo);
    }

    public void pPipelineCreateInfoRaw(@pointer(comment="VkPipelineCreateInfoKHR*") MemorySegment value) {
        segment.set(LAYOUT$pPipelineCreateInfo, OFFSET$pPipelineCreateInfo, value);
    }

    public @Nullable VkPipelineCreateInfoKHR pPipelineCreateInfo() {
        MemorySegment s = pPipelineCreateInfoRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkPipelineCreateInfoKHR(s);
    }

    public void pPipelineCreateInfo(@Nullable VkPipelineCreateInfoKHR value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pPipelineCreateInfoRaw(s);
    }

    @unsafe public @Nullable VkPipelineCreateInfoKHR[] pPipelineCreateInfo(int assumedCount) {
        MemorySegment s = pPipelineCreateInfoRaw();
        if (s.address() == 0) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkPipelineCreateInfoKHR.SIZE);
        VkPipelineCreateInfoKHR[] ret = new VkPipelineCreateInfoKHR[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkPipelineCreateInfoKHR(s.asSlice(i * VkPipelineCreateInfoKHR.SIZE, VkPipelineCreateInfoKHR.SIZE));
        }
        return ret;
    }

}
