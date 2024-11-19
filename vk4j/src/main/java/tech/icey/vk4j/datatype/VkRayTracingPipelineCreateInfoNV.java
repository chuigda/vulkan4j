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
/// typedef struct VkRayTracingPipelineCreateInfoNV {
///     VkStructureType sType;
///     const void* pNext;
///     VkPipelineCreateFlags flags;
///     uint32_t stageCount;
///     const VkPipelineShaderStageCreateInfo* pStages;
///     uint32_t groupCount;
///     const VkRayTracingShaderGroupCreateInfoNV* pGroups;
///     uint32_t maxRecursionDepth;
///     VkPipelineLayout layout;
///     VkPipeline basePipelineHandle;
///     int32_t basePipelineIndex;
/// } VkRayTracingPipelineCreateInfoNV;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkRayTracingPipelineCreateInfoNV.html">VkRayTracingPipelineCreateInfoNV</a>
public record VkRayTracingPipelineCreateInfoNV(MemorySegment segment) implements IPointer {
    public VkRayTracingPipelineCreateInfoNV(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_RAY_TRACING_PIPELINE_CREATE_INFO_NV);
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

    public @enumtype(VkPipelineCreateFlags.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public void flags(@enumtype(VkPipelineCreateFlags.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
    }

    public @unsigned int stageCount() {
        return segment.get(LAYOUT$stageCount, OFFSET$stageCount);
    }

    public void stageCount(@unsigned int value) {
        segment.set(LAYOUT$stageCount, OFFSET$stageCount, value);
    }

    public @pointer(comment="VkPipelineShaderStageCreateInfo*") MemorySegment pStagesRaw() {
        return segment.get(LAYOUT$pStages, OFFSET$pStages);
    }

    public void pStagesRaw(@pointer(comment="VkPipelineShaderStageCreateInfo*") MemorySegment value) {
        segment.set(LAYOUT$pStages, OFFSET$pStages, value);
    }

    public @Nullable VkPipelineShaderStageCreateInfo pStages() {
        MemorySegment s = pStagesRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkPipelineShaderStageCreateInfo(s);
    }

    /// Note: this function is {@link unsafe} because it's up to user to provide the correct count of elements.
    @unsafe
    public @Nullable VkPipelineShaderStageCreateInfo[] pStages(int assumedCount) {
        MemorySegment s = pStagesRaw().reinterpret(assumedCount * VkPipelineShaderStageCreateInfo.SIZE);
        VkPipelineShaderStageCreateInfo[] arr = new VkPipelineShaderStageCreateInfo[assumedCount];
        for (int i = 0; i < assumedCount; i++) {
            arr[i] = new VkPipelineShaderStageCreateInfo(s.asSlice(i * VkPipelineShaderStageCreateInfo.SIZE, VkPipelineShaderStageCreateInfo.SIZE));
        }
        return arr;
    }

    public void pStages(@Nullable VkPipelineShaderStageCreateInfo value) {
        pStagesRaw(value == null ? MemorySegment.NULL : value.segment());
    }

    public @unsigned int groupCount() {
        return segment.get(LAYOUT$groupCount, OFFSET$groupCount);
    }

    public void groupCount(@unsigned int value) {
        segment.set(LAYOUT$groupCount, OFFSET$groupCount, value);
    }

    public @pointer(comment="VkRayTracingShaderGroupCreateInfoNV*") MemorySegment pGroupsRaw() {
        return segment.get(LAYOUT$pGroups, OFFSET$pGroups);
    }

    public void pGroupsRaw(@pointer(comment="VkRayTracingShaderGroupCreateInfoNV*") MemorySegment value) {
        segment.set(LAYOUT$pGroups, OFFSET$pGroups, value);
    }

    public @Nullable VkRayTracingShaderGroupCreateInfoNV pGroups() {
        MemorySegment s = pGroupsRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkRayTracingShaderGroupCreateInfoNV(s);
    }

    /// Note: this function is {@link unsafe} because it's up to user to provide the correct count of elements.
    @unsafe
    public @Nullable VkRayTracingShaderGroupCreateInfoNV[] pGroups(int assumedCount) {
        MemorySegment s = pGroupsRaw().reinterpret(assumedCount * VkRayTracingShaderGroupCreateInfoNV.SIZE);
        VkRayTracingShaderGroupCreateInfoNV[] arr = new VkRayTracingShaderGroupCreateInfoNV[assumedCount];
        for (int i = 0; i < assumedCount; i++) {
            arr[i] = new VkRayTracingShaderGroupCreateInfoNV(s.asSlice(i * VkRayTracingShaderGroupCreateInfoNV.SIZE, VkRayTracingShaderGroupCreateInfoNV.SIZE));
        }
        return arr;
    }

    public void pGroups(@Nullable VkRayTracingShaderGroupCreateInfoNV value) {
        pGroupsRaw(value == null ? MemorySegment.NULL : value.segment());
    }

    public @unsigned int maxRecursionDepth() {
        return segment.get(LAYOUT$maxRecursionDepth, OFFSET$maxRecursionDepth);
    }

    public void maxRecursionDepth(@unsigned int value) {
        segment.set(LAYOUT$maxRecursionDepth, OFFSET$maxRecursionDepth, value);
    }

    public @Nullable VkPipelineLayout layout() {
        MemorySegment s = segment.get(LAYOUT$layout, OFFSET$layout);
        if (s.address() == 0) {
            return null;
        }
        return new VkPipelineLayout(s);
    }

    public void layout(@Nullable VkPipelineLayout value) {
        segment.set(
            LAYOUT$layout,
            OFFSET$layout,
            value != null ? value.segment() : MemorySegment.NULL
        );
    }

    public @Nullable VkPipeline basePipelineHandle() {
        MemorySegment s = segment.get(LAYOUT$basePipelineHandle, OFFSET$basePipelineHandle);
        if (s.address() == 0) {
            return null;
        }
        return new VkPipeline(s);
    }

    public void basePipelineHandle(@Nullable VkPipeline value) {
        segment.set(
            LAYOUT$basePipelineHandle,
            OFFSET$basePipelineHandle,
            value != null ? value.segment() : MemorySegment.NULL
        );
    }

    public int basePipelineIndex() {
        return segment.get(LAYOUT$basePipelineIndex, OFFSET$basePipelineIndex);
    }

    public void basePipelineIndex(int value) {
        segment.set(LAYOUT$basePipelineIndex, OFFSET$basePipelineIndex, value);
    }

    public static VkRayTracingPipelineCreateInfoNV allocate(Arena arena) {
        return new VkRayTracingPipelineCreateInfoNV(arena.allocate(LAYOUT));
    }

    public static VkRayTracingPipelineCreateInfoNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkRayTracingPipelineCreateInfoNV[] ret = new VkRayTracingPipelineCreateInfoNV[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkRayTracingPipelineCreateInfoNV(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkRayTracingPipelineCreateInfoNV clone(Arena arena, VkRayTracingPipelineCreateInfoNV src) {
        VkRayTracingPipelineCreateInfoNV ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkRayTracingPipelineCreateInfoNV[] clone(Arena arena, VkRayTracingPipelineCreateInfoNV[] src) {
        VkRayTracingPipelineCreateInfoNV[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("stageCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkPipelineShaderStageCreateInfo.LAYOUT).withName("pStages"),
        ValueLayout.JAVA_INT.withName("groupCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkRayTracingShaderGroupCreateInfoNV.LAYOUT).withName("pGroups"),
        ValueLayout.JAVA_INT.withName("maxRecursionDepth"),
        ValueLayout.ADDRESS.withName("layout"),
        ValueLayout.ADDRESS.withName("basePipelineHandle"),
        ValueLayout.JAVA_INT.withName("basePipelineIndex")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$flags = PathElement.groupElement("flags");
    public static final PathElement PATH$stageCount = PathElement.groupElement("stageCount");
    public static final PathElement PATH$pStages = PathElement.groupElement("pStages");
    public static final PathElement PATH$groupCount = PathElement.groupElement("groupCount");
    public static final PathElement PATH$pGroups = PathElement.groupElement("pGroups");
    public static final PathElement PATH$maxRecursionDepth = PathElement.groupElement("maxRecursionDepth");
    public static final PathElement PATH$layout = PathElement.groupElement("layout");
    public static final PathElement PATH$basePipelineHandle = PathElement.groupElement("basePipelineHandle");
    public static final PathElement PATH$basePipelineIndex = PathElement.groupElement("basePipelineIndex");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$flags = (OfInt) LAYOUT.select(PATH$flags);
    public static final OfInt LAYOUT$stageCount = (OfInt) LAYOUT.select(PATH$stageCount);
    public static final AddressLayout LAYOUT$pStages = (AddressLayout) LAYOUT.select(PATH$pStages);
    public static final OfInt LAYOUT$groupCount = (OfInt) LAYOUT.select(PATH$groupCount);
    public static final AddressLayout LAYOUT$pGroups = (AddressLayout) LAYOUT.select(PATH$pGroups);
    public static final OfInt LAYOUT$maxRecursionDepth = (OfInt) LAYOUT.select(PATH$maxRecursionDepth);
    public static final AddressLayout LAYOUT$layout = (AddressLayout) LAYOUT.select(PATH$layout);
    public static final AddressLayout LAYOUT$basePipelineHandle = (AddressLayout) LAYOUT.select(PATH$basePipelineHandle);
    public static final OfInt LAYOUT$basePipelineIndex = (OfInt) LAYOUT.select(PATH$basePipelineIndex);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$stageCount = LAYOUT.byteOffset(PATH$stageCount);
    public static final long OFFSET$pStages = LAYOUT.byteOffset(PATH$pStages);
    public static final long OFFSET$groupCount = LAYOUT.byteOffset(PATH$groupCount);
    public static final long OFFSET$pGroups = LAYOUT.byteOffset(PATH$pGroups);
    public static final long OFFSET$maxRecursionDepth = LAYOUT.byteOffset(PATH$maxRecursionDepth);
    public static final long OFFSET$layout = LAYOUT.byteOffset(PATH$layout);
    public static final long OFFSET$basePipelineHandle = LAYOUT.byteOffset(PATH$basePipelineHandle);
    public static final long OFFSET$basePipelineIndex = LAYOUT.byteOffset(PATH$basePipelineIndex);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$stageCount = LAYOUT$stageCount.byteSize();
    public static final long SIZE$pStages = LAYOUT$pStages.byteSize();
    public static final long SIZE$groupCount = LAYOUT$groupCount.byteSize();
    public static final long SIZE$pGroups = LAYOUT$pGroups.byteSize();
    public static final long SIZE$maxRecursionDepth = LAYOUT$maxRecursionDepth.byteSize();
    public static final long SIZE$layout = LAYOUT$layout.byteSize();
    public static final long SIZE$basePipelineHandle = LAYOUT$basePipelineHandle.byteSize();
    public static final long SIZE$basePipelineIndex = LAYOUT$basePipelineIndex.byteSize();
}
