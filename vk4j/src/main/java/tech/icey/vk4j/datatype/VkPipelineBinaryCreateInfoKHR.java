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
/// typedef struct VkPipelineBinaryCreateInfoKHR {
///     VkStructureType sType;
///     const void* pNext;
///     const VkPipelineBinaryKeysAndDataKHR* pKeysAndDataInfo;
///     VkPipeline pipeline;
///     const VkPipelineCreateInfoKHR* pPipelineCreateInfo;
/// } VkPipelineBinaryCreateInfoKHR;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkPipelineBinaryCreateInfoKHR.html">VkPipelineBinaryCreateInfoKHR</a>
public record VkPipelineBinaryCreateInfoKHR(MemorySegment segment) implements IPointer {
    public VkPipelineBinaryCreateInfoKHR(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PIPELINE_BINARY_CREATE_INFO_KHR);
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

    /// Note: this function is {@link unsafe} because it's up to user to provide the correct count of elements.
    @unsafe
    public @Nullable VkPipelineBinaryKeysAndDataKHR[] pKeysAndDataInfo(int assumedCount) {
        MemorySegment s = pKeysAndDataInfoRaw().reinterpret(assumedCount * VkPipelineBinaryKeysAndDataKHR.SIZE);
        VkPipelineBinaryKeysAndDataKHR[] arr = new VkPipelineBinaryKeysAndDataKHR[assumedCount];
        for (int i = 0; i < assumedCount; i++) {
            arr[i] = new VkPipelineBinaryKeysAndDataKHR(s.asSlice(i * VkPipelineBinaryKeysAndDataKHR.SIZE, VkPipelineBinaryKeysAndDataKHR.SIZE));
        }
        return arr;
    }

    public void pKeysAndDataInfo(@Nullable VkPipelineBinaryKeysAndDataKHR value) {
        pKeysAndDataInfoRaw(value == null ? MemorySegment.NULL : value.segment());
    }

    public @Nullable VkPipeline pipeline() {
        MemorySegment s = segment.get(LAYOUT$pipeline, OFFSET$pipeline);
        if (s.address() == 0) {
            return null;
        }
        return new VkPipeline(s);
    }

    public void pipeline(@Nullable VkPipeline value) {
        segment.set(
            LAYOUT$pipeline,
            OFFSET$pipeline,
            value != null ? value.segment() : MemorySegment.NULL
        );
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

    /// Note: this function is {@link unsafe} because it's up to user to provide the correct count of elements.
    @unsafe
    public @Nullable VkPipelineCreateInfoKHR[] pPipelineCreateInfo(int assumedCount) {
        MemorySegment s = pPipelineCreateInfoRaw().reinterpret(assumedCount * VkPipelineCreateInfoKHR.SIZE);
        VkPipelineCreateInfoKHR[] arr = new VkPipelineCreateInfoKHR[assumedCount];
        for (int i = 0; i < assumedCount; i++) {
            arr[i] = new VkPipelineCreateInfoKHR(s.asSlice(i * VkPipelineCreateInfoKHR.SIZE, VkPipelineCreateInfoKHR.SIZE));
        }
        return arr;
    }

    public void pPipelineCreateInfo(@Nullable VkPipelineCreateInfoKHR value) {
        pPipelineCreateInfoRaw(value == null ? MemorySegment.NULL : value.segment());
    }

    public static VkPipelineBinaryCreateInfoKHR allocate(Arena arena) {
        return new VkPipelineBinaryCreateInfoKHR(arena.allocate(LAYOUT));
    }

    public static VkPipelineBinaryCreateInfoKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPipelineBinaryCreateInfoKHR[] ret = new VkPipelineBinaryCreateInfoKHR[count];
        for (int i = 0; i < count; i++) {
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
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withTargetLayout(VkPipelineBinaryKeysAndDataKHR.LAYOUT).withName("pKeysAndDataInfo"),
        ValueLayout.ADDRESS.withName("pipeline"),
        ValueLayout.ADDRESS.withTargetLayout(VkPipelineCreateInfoKHR.LAYOUT).withName("pPipelineCreateInfo")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$pKeysAndDataInfo = PathElement.groupElement("pKeysAndDataInfo");
    public static final PathElement PATH$pipeline = PathElement.groupElement("pipeline");
    public static final PathElement PATH$pPipelineCreateInfo = PathElement.groupElement("pPipelineCreateInfo");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final AddressLayout LAYOUT$pKeysAndDataInfo = (AddressLayout) LAYOUT.select(PATH$pKeysAndDataInfo);
    public static final AddressLayout LAYOUT$pipeline = (AddressLayout) LAYOUT.select(PATH$pipeline);
    public static final AddressLayout LAYOUT$pPipelineCreateInfo = (AddressLayout) LAYOUT.select(PATH$pPipelineCreateInfo);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$pKeysAndDataInfo = LAYOUT.byteOffset(PATH$pKeysAndDataInfo);
    public static final long OFFSET$pipeline = LAYOUT.byteOffset(PATH$pipeline);
    public static final long OFFSET$pPipelineCreateInfo = LAYOUT.byteOffset(PATH$pPipelineCreateInfo);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$pKeysAndDataInfo = LAYOUT$pKeysAndDataInfo.byteSize();
    public static final long SIZE$pipeline = LAYOUT$pipeline.byteSize();
    public static final long SIZE$pPipelineCreateInfo = LAYOUT$pPipelineCreateInfo.byteSize();
}
