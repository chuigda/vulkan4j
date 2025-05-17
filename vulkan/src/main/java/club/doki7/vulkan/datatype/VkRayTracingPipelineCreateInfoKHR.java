package club.doki7.vulkan.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import club.doki7.ffm.IPointer;
import club.doki7.ffm.NativeLayout;
import club.doki7.ffm.annotation.*;
import club.doki7.ffm.ptr.*;
import club.doki7.vulkan.bitmask.*;
import club.doki7.vulkan.handle.*;
import club.doki7.vulkan.enumtype.*;
import static club.doki7.vulkan.VkConstants.*;

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkRayTracingPipelineCreateInfoKHR.html"><code>VkRayTracingPipelineCreateInfoKHR</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkRayTracingPipelineCreateInfoKHR {
///     VkStructureType sType;
///     void const* pNext; // optional
///     VkPipelineCreateFlags flags; // optional
///     uint32_t stageCount; // optional
///     VkPipelineShaderStageCreateInfo const* pStages;
///     uint32_t groupCount; // optional
///     VkRayTracingShaderGroupCreateInfoKHR const* pGroups;
///     uint32_t maxPipelineRayRecursionDepth;
///     VkPipelineLibraryCreateInfoKHR const* pLibraryInfo; // optional
///     VkRayTracingPipelineInterfaceCreateInfoKHR const* pLibraryInterface; // optional
///     VkPipelineDynamicStateCreateInfo const* pDynamicState; // optional
///     VkPipelineLayout layout;
///     VkPipeline basePipelineHandle; // optional
///     int32_t basePipelineIndex;
/// } VkRayTracingPipelineCreateInfoKHR;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_RAY_TRACING_PIPELINE_CREATE_INFO_KHR`
///
/// The {@link VkRayTracingPipelineCreateInfoKHR#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkRayTracingPipelineCreateInfoKHR#autoInit} to initialize these fields manually for
/// non-allocated instances.
///
/// ## Contracts
///
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to)
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkRayTracingPipelineCreateInfoKHR.html"><code>VkRayTracingPipelineCreateInfoKHR</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkRayTracingPipelineCreateInfoKHR(@NotNull MemorySegment segment) implements IPointer {
    public static VkRayTracingPipelineCreateInfoKHR allocate(Arena arena) {
        VkRayTracingPipelineCreateInfoKHR ret = new VkRayTracingPipelineCreateInfoKHR(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.RAY_TRACING_PIPELINE_CREATE_INFO_KHR);
        return ret;
    }

    public static VkRayTracingPipelineCreateInfoKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkRayTracingPipelineCreateInfoKHR[] ret = new VkRayTracingPipelineCreateInfoKHR[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkRayTracingPipelineCreateInfoKHR(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.RAY_TRACING_PIPELINE_CREATE_INFO_KHR);
        }
        return ret;
    }

    public static VkRayTracingPipelineCreateInfoKHR clone(Arena arena, VkRayTracingPipelineCreateInfoKHR src) {
        VkRayTracingPipelineCreateInfoKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkRayTracingPipelineCreateInfoKHR[] clone(Arena arena, VkRayTracingPipelineCreateInfoKHR[] src) {
        VkRayTracingPipelineCreateInfoKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.RAY_TRACING_PIPELINE_CREATE_INFO_KHR);
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
        pNext(pointer != null ? pointer.segment() : MemorySegment.NULL);
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

    public @pointer(target=VkPipelineShaderStageCreateInfo.class) MemorySegment pStagesRaw() {
        return segment.get(LAYOUT$pStages, OFFSET$pStages);
    }

    public void pStagesRaw(@pointer(target=VkPipelineShaderStageCreateInfo.class) MemorySegment value) {
        segment.set(LAYOUT$pStages, OFFSET$pStages, value);
    }

    public @Nullable VkPipelineShaderStageCreateInfo pStages() {
        MemorySegment s = pStagesRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkPipelineShaderStageCreateInfo(s);
    }

    public void pStages(@Nullable VkPipelineShaderStageCreateInfo value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pStagesRaw(s);
    }

    @unsafe public @Nullable VkPipelineShaderStageCreateInfo[] pStages(int assumedCount) {
        MemorySegment s = pStagesRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkPipelineShaderStageCreateInfo.BYTES);
        VkPipelineShaderStageCreateInfo[] ret = new VkPipelineShaderStageCreateInfo[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkPipelineShaderStageCreateInfo(s.asSlice(i * VkPipelineShaderStageCreateInfo.BYTES, VkPipelineShaderStageCreateInfo.BYTES));
        }
        return ret;
    }

    public @unsigned int groupCount() {
        return segment.get(LAYOUT$groupCount, OFFSET$groupCount);
    }

    public void groupCount(@unsigned int value) {
        segment.set(LAYOUT$groupCount, OFFSET$groupCount, value);
    }

    public @pointer(target=VkRayTracingShaderGroupCreateInfoKHR.class) MemorySegment pGroupsRaw() {
        return segment.get(LAYOUT$pGroups, OFFSET$pGroups);
    }

    public void pGroupsRaw(@pointer(target=VkRayTracingShaderGroupCreateInfoKHR.class) MemorySegment value) {
        segment.set(LAYOUT$pGroups, OFFSET$pGroups, value);
    }

    public @Nullable VkRayTracingShaderGroupCreateInfoKHR pGroups() {
        MemorySegment s = pGroupsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkRayTracingShaderGroupCreateInfoKHR(s);
    }

    public void pGroups(@Nullable VkRayTracingShaderGroupCreateInfoKHR value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pGroupsRaw(s);
    }

    @unsafe public @Nullable VkRayTracingShaderGroupCreateInfoKHR[] pGroups(int assumedCount) {
        MemorySegment s = pGroupsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkRayTracingShaderGroupCreateInfoKHR.BYTES);
        VkRayTracingShaderGroupCreateInfoKHR[] ret = new VkRayTracingShaderGroupCreateInfoKHR[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkRayTracingShaderGroupCreateInfoKHR(s.asSlice(i * VkRayTracingShaderGroupCreateInfoKHR.BYTES, VkRayTracingShaderGroupCreateInfoKHR.BYTES));
        }
        return ret;
    }

    public @unsigned int maxPipelineRayRecursionDepth() {
        return segment.get(LAYOUT$maxPipelineRayRecursionDepth, OFFSET$maxPipelineRayRecursionDepth);
    }

    public void maxPipelineRayRecursionDepth(@unsigned int value) {
        segment.set(LAYOUT$maxPipelineRayRecursionDepth, OFFSET$maxPipelineRayRecursionDepth, value);
    }

    public @pointer(target=VkPipelineLibraryCreateInfoKHR.class) MemorySegment pLibraryInfoRaw() {
        return segment.get(LAYOUT$pLibraryInfo, OFFSET$pLibraryInfo);
    }

    public void pLibraryInfoRaw(@pointer(target=VkPipelineLibraryCreateInfoKHR.class) MemorySegment value) {
        segment.set(LAYOUT$pLibraryInfo, OFFSET$pLibraryInfo, value);
    }

    public @Nullable VkPipelineLibraryCreateInfoKHR pLibraryInfo() {
        MemorySegment s = pLibraryInfoRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkPipelineLibraryCreateInfoKHR(s);
    }

    public void pLibraryInfo(@Nullable VkPipelineLibraryCreateInfoKHR value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pLibraryInfoRaw(s);
    }

    @unsafe public @Nullable VkPipelineLibraryCreateInfoKHR[] pLibraryInfo(int assumedCount) {
        MemorySegment s = pLibraryInfoRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkPipelineLibraryCreateInfoKHR.BYTES);
        VkPipelineLibraryCreateInfoKHR[] ret = new VkPipelineLibraryCreateInfoKHR[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkPipelineLibraryCreateInfoKHR(s.asSlice(i * VkPipelineLibraryCreateInfoKHR.BYTES, VkPipelineLibraryCreateInfoKHR.BYTES));
        }
        return ret;
    }

    public @pointer(target=VkRayTracingPipelineInterfaceCreateInfoKHR.class) MemorySegment pLibraryInterfaceRaw() {
        return segment.get(LAYOUT$pLibraryInterface, OFFSET$pLibraryInterface);
    }

    public void pLibraryInterfaceRaw(@pointer(target=VkRayTracingPipelineInterfaceCreateInfoKHR.class) MemorySegment value) {
        segment.set(LAYOUT$pLibraryInterface, OFFSET$pLibraryInterface, value);
    }

    public @Nullable VkRayTracingPipelineInterfaceCreateInfoKHR pLibraryInterface() {
        MemorySegment s = pLibraryInterfaceRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkRayTracingPipelineInterfaceCreateInfoKHR(s);
    }

    public void pLibraryInterface(@Nullable VkRayTracingPipelineInterfaceCreateInfoKHR value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pLibraryInterfaceRaw(s);
    }

    @unsafe public @Nullable VkRayTracingPipelineInterfaceCreateInfoKHR[] pLibraryInterface(int assumedCount) {
        MemorySegment s = pLibraryInterfaceRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkRayTracingPipelineInterfaceCreateInfoKHR.BYTES);
        VkRayTracingPipelineInterfaceCreateInfoKHR[] ret = new VkRayTracingPipelineInterfaceCreateInfoKHR[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkRayTracingPipelineInterfaceCreateInfoKHR(s.asSlice(i * VkRayTracingPipelineInterfaceCreateInfoKHR.BYTES, VkRayTracingPipelineInterfaceCreateInfoKHR.BYTES));
        }
        return ret;
    }

    public @pointer(target=VkPipelineDynamicStateCreateInfo.class) MemorySegment pDynamicStateRaw() {
        return segment.get(LAYOUT$pDynamicState, OFFSET$pDynamicState);
    }

    public void pDynamicStateRaw(@pointer(target=VkPipelineDynamicStateCreateInfo.class) MemorySegment value) {
        segment.set(LAYOUT$pDynamicState, OFFSET$pDynamicState, value);
    }

    public @Nullable VkPipelineDynamicStateCreateInfo pDynamicState() {
        MemorySegment s = pDynamicStateRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkPipelineDynamicStateCreateInfo(s);
    }

    public void pDynamicState(@Nullable VkPipelineDynamicStateCreateInfo value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pDynamicStateRaw(s);
    }

    @unsafe public @Nullable VkPipelineDynamicStateCreateInfo[] pDynamicState(int assumedCount) {
        MemorySegment s = pDynamicStateRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkPipelineDynamicStateCreateInfo.BYTES);
        VkPipelineDynamicStateCreateInfo[] ret = new VkPipelineDynamicStateCreateInfo[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkPipelineDynamicStateCreateInfo(s.asSlice(i * VkPipelineDynamicStateCreateInfo.BYTES, VkPipelineDynamicStateCreateInfo.BYTES));
        }
        return ret;
    }

    public @Nullable VkPipelineLayout layout() {
        MemorySegment s = segment.asSlice(OFFSET$layout, SIZE$layout);
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkPipelineLayout(s);
    }

    public void layout(@Nullable VkPipelineLayout value) {
        segment.set(LAYOUT$layout, OFFSET$layout, value != null ? value.segment() : MemorySegment.NULL);
    }

    public @Nullable VkPipeline basePipelineHandle() {
        MemorySegment s = segment.asSlice(OFFSET$basePipelineHandle, SIZE$basePipelineHandle);
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkPipeline(s);
    }

    public void basePipelineHandle(@Nullable VkPipeline value) {
        segment.set(LAYOUT$basePipelineHandle, OFFSET$basePipelineHandle, value != null ? value.segment() : MemorySegment.NULL);
    }

    public int basePipelineIndex() {
        return segment.get(LAYOUT$basePipelineIndex, OFFSET$basePipelineIndex);
    }

    public void basePipelineIndex(int value) {
        segment.set(LAYOUT$basePipelineIndex, OFFSET$basePipelineIndex, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("stageCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkPipelineShaderStageCreateInfo.LAYOUT).withName("pStages"),
        ValueLayout.JAVA_INT.withName("groupCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkRayTracingShaderGroupCreateInfoKHR.LAYOUT).withName("pGroups"),
        ValueLayout.JAVA_INT.withName("maxPipelineRayRecursionDepth"),
        ValueLayout.ADDRESS.withTargetLayout(VkPipelineLibraryCreateInfoKHR.LAYOUT).withName("pLibraryInfo"),
        ValueLayout.ADDRESS.withTargetLayout(VkRayTracingPipelineInterfaceCreateInfoKHR.LAYOUT).withName("pLibraryInterface"),
        ValueLayout.ADDRESS.withTargetLayout(VkPipelineDynamicStateCreateInfo.LAYOUT).withName("pDynamicState"),
        ValueLayout.ADDRESS.withName("layout"),
        ValueLayout.ADDRESS.withName("basePipelineHandle"),
        ValueLayout.JAVA_INT.withName("basePipelineIndex")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$flags = PathElement.groupElement("PATH$flags");
    public static final PathElement PATH$stageCount = PathElement.groupElement("PATH$stageCount");
    public static final PathElement PATH$pStages = PathElement.groupElement("PATH$pStages");
    public static final PathElement PATH$groupCount = PathElement.groupElement("PATH$groupCount");
    public static final PathElement PATH$pGroups = PathElement.groupElement("PATH$pGroups");
    public static final PathElement PATH$maxPipelineRayRecursionDepth = PathElement.groupElement("PATH$maxPipelineRayRecursionDepth");
    public static final PathElement PATH$pLibraryInfo = PathElement.groupElement("PATH$pLibraryInfo");
    public static final PathElement PATH$pLibraryInterface = PathElement.groupElement("PATH$pLibraryInterface");
    public static final PathElement PATH$pDynamicState = PathElement.groupElement("PATH$pDynamicState");
    public static final PathElement PATH$layout = PathElement.groupElement("PATH$layout");
    public static final PathElement PATH$basePipelineHandle = PathElement.groupElement("PATH$basePipelineHandle");
    public static final PathElement PATH$basePipelineIndex = PathElement.groupElement("PATH$basePipelineIndex");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$flags = (OfInt) LAYOUT.select(PATH$flags);
    public static final OfInt LAYOUT$stageCount = (OfInt) LAYOUT.select(PATH$stageCount);
    public static final AddressLayout LAYOUT$pStages = (AddressLayout) LAYOUT.select(PATH$pStages);
    public static final OfInt LAYOUT$groupCount = (OfInt) LAYOUT.select(PATH$groupCount);
    public static final AddressLayout LAYOUT$pGroups = (AddressLayout) LAYOUT.select(PATH$pGroups);
    public static final OfInt LAYOUT$maxPipelineRayRecursionDepth = (OfInt) LAYOUT.select(PATH$maxPipelineRayRecursionDepth);
    public static final AddressLayout LAYOUT$pLibraryInfo = (AddressLayout) LAYOUT.select(PATH$pLibraryInfo);
    public static final AddressLayout LAYOUT$pLibraryInterface = (AddressLayout) LAYOUT.select(PATH$pLibraryInterface);
    public static final AddressLayout LAYOUT$pDynamicState = (AddressLayout) LAYOUT.select(PATH$pDynamicState);
    public static final AddressLayout LAYOUT$layout = (AddressLayout) LAYOUT.select(PATH$layout);
    public static final AddressLayout LAYOUT$basePipelineHandle = (AddressLayout) LAYOUT.select(PATH$basePipelineHandle);
    public static final OfInt LAYOUT$basePipelineIndex = (OfInt) LAYOUT.select(PATH$basePipelineIndex);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$stageCount = LAYOUT$stageCount.byteSize();
    public static final long SIZE$pStages = LAYOUT$pStages.byteSize();
    public static final long SIZE$groupCount = LAYOUT$groupCount.byteSize();
    public static final long SIZE$pGroups = LAYOUT$pGroups.byteSize();
    public static final long SIZE$maxPipelineRayRecursionDepth = LAYOUT$maxPipelineRayRecursionDepth.byteSize();
    public static final long SIZE$pLibraryInfo = LAYOUT$pLibraryInfo.byteSize();
    public static final long SIZE$pLibraryInterface = LAYOUT$pLibraryInterface.byteSize();
    public static final long SIZE$pDynamicState = LAYOUT$pDynamicState.byteSize();
    public static final long SIZE$layout = LAYOUT$layout.byteSize();
    public static final long SIZE$basePipelineHandle = LAYOUT$basePipelineHandle.byteSize();
    public static final long SIZE$basePipelineIndex = LAYOUT$basePipelineIndex.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$stageCount = LAYOUT.byteOffset(PATH$stageCount);
    public static final long OFFSET$pStages = LAYOUT.byteOffset(PATH$pStages);
    public static final long OFFSET$groupCount = LAYOUT.byteOffset(PATH$groupCount);
    public static final long OFFSET$pGroups = LAYOUT.byteOffset(PATH$pGroups);
    public static final long OFFSET$maxPipelineRayRecursionDepth = LAYOUT.byteOffset(PATH$maxPipelineRayRecursionDepth);
    public static final long OFFSET$pLibraryInfo = LAYOUT.byteOffset(PATH$pLibraryInfo);
    public static final long OFFSET$pLibraryInterface = LAYOUT.byteOffset(PATH$pLibraryInterface);
    public static final long OFFSET$pDynamicState = LAYOUT.byteOffset(PATH$pDynamicState);
    public static final long OFFSET$layout = LAYOUT.byteOffset(PATH$layout);
    public static final long OFFSET$basePipelineHandle = LAYOUT.byteOffset(PATH$basePipelineHandle);
    public static final long OFFSET$basePipelineIndex = LAYOUT.byteOffset(PATH$basePipelineIndex);
}
