package club.doki7.vulkan.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
import java.util.List;

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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkRayTracingPipelineCreateInfoNV.html"><code>VkRayTracingPipelineCreateInfoNV</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkRayTracingPipelineCreateInfoNV {
///     VkStructureType sType; // @link substring="VkStructureType" target="VkStructureType" @link substring="sType" target="#sType"
///     void const* pNext; // optional // @link substring="pNext" target="#pNext"
///     VkPipelineCreateFlags flags; // optional // @link substring="VkPipelineCreateFlags" target="VkPipelineCreateFlags" @link substring="flags" target="#flags"
///     uint32_t stageCount; // @link substring="stageCount" target="#stageCount"
///     VkPipelineShaderStageCreateInfo const* pStages; // @link substring="VkPipelineShaderStageCreateInfo" target="VkPipelineShaderStageCreateInfo" @link substring="pStages" target="#pStages"
///     uint32_t groupCount; // @link substring="groupCount" target="#groupCount"
///     VkRayTracingShaderGroupCreateInfoNV const* pGroups; // @link substring="VkRayTracingShaderGroupCreateInfoNV" target="VkRayTracingShaderGroupCreateInfoNV" @link substring="pGroups" target="#pGroups"
///     uint32_t maxRecursionDepth; // @link substring="maxRecursionDepth" target="#maxRecursionDepth"
///     VkPipelineLayout layout; // @link substring="VkPipelineLayout" target="VkPipelineLayout" @link substring="layout" target="#layout"
///     VkPipeline basePipelineHandle; // optional // @link substring="VkPipeline" target="VkPipeline" @link substring="basePipelineHandle" target="#basePipelineHandle"
///     int32_t basePipelineIndex; // @link substring="basePipelineIndex" target="#basePipelineIndex"
/// } VkRayTracingPipelineCreateInfoNV;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_RAY_TRACING_PIPELINE_CREATE_INFO_NV`
///
/// The {@code allocate} ({@link VkRayTracingPipelineCreateInfoNV#allocate(Arena)}, {@link VkRayTracingPipelineCreateInfoNV#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link VkRayTracingPipelineCreateInfoNV#autoInit}
/// to initialize these fields manually for non-allocated instances.
/// ## Contracts
///
/// The property {@link #segment()} should always be not-null
/// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkRayTracingPipelineCreateInfoNV.html"><code>VkRayTracingPipelineCreateInfoNV</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkRayTracingPipelineCreateInfoNV(@NotNull MemorySegment segment) implements IVkRayTracingPipelineCreateInfoNV {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkRayTracingPipelineCreateInfoNV.html"><code>VkRayTracingPipelineCreateInfoNV</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link VkRayTracingPipelineCreateInfoNV}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IVkRayTracingPipelineCreateInfoNV to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code VkRayTracingPipelineCreateInfoNV.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IVkRayTracingPipelineCreateInfoNV {
        public long size() {
            return segment.byteSize() / VkRayTracingPipelineCreateInfoNV.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull VkRayTracingPipelineCreateInfoNV at(long index) {
            return new VkRayTracingPipelineCreateInfoNV(segment.asSlice(index * VkRayTracingPipelineCreateInfoNV.BYTES, VkRayTracingPipelineCreateInfoNV.BYTES));
        }

        public void write(long index, @NotNull VkRayTracingPipelineCreateInfoNV value) {
            MemorySegment s = segment.asSlice(index * VkRayTracingPipelineCreateInfoNV.BYTES, VkRayTracingPipelineCreateInfoNV.BYTES);
            s.copyFrom(value.segment);
        }

        /// Assume the {@link Ptr} is capable of holding at least {@code newSize} structures,
        /// create a new view {@link Ptr} that uses the same backing storage as this
        /// {@link Ptr}, but with the new size. Since there is actually no way to really check
        /// whether the new size is valid, while buffer overflow is undefined behavior, this method is
        /// marked as {@link unsafe}.
        ///
        /// This method could be useful when handling data returned from some C API, where the size of
        /// the data is not known in advance.
        ///
        /// If the size of the underlying segment is actually known in advance and correctly set, and
        /// you want to create a shrunk view, you may use {@link #slice(long)} (with validation)
        /// instead.
        @unsafe
        public @NotNull Ptr reinterpret(long index) {
            return new Ptr(segment.asSlice(index * VkRayTracingPipelineCreateInfoNV.BYTES, VkRayTracingPipelineCreateInfoNV.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * VkRayTracingPipelineCreateInfoNV.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * VkRayTracingPipelineCreateInfoNV.BYTES,
                (end - start) * VkRayTracingPipelineCreateInfoNV.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * VkRayTracingPipelineCreateInfoNV.BYTES));
        }

        public VkRayTracingPipelineCreateInfoNV[] toArray() {
            VkRayTracingPipelineCreateInfoNV[] ret = new VkRayTracingPipelineCreateInfoNV[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }
    }

    public static VkRayTracingPipelineCreateInfoNV allocate(Arena arena) {
        VkRayTracingPipelineCreateInfoNV ret = new VkRayTracingPipelineCreateInfoNV(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.RAY_TRACING_PIPELINE_CREATE_INFO_NV);
        return ret;
    }

    public static VkRayTracingPipelineCreateInfoNV.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkRayTracingPipelineCreateInfoNV.Ptr ret = new VkRayTracingPipelineCreateInfoNV.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).sType(VkStructureType.RAY_TRACING_PIPELINE_CREATE_INFO_NV);
        }
        return ret;
    }

    public static VkRayTracingPipelineCreateInfoNV clone(Arena arena, VkRayTracingPipelineCreateInfoNV src) {
        VkRayTracingPipelineCreateInfoNV ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.RAY_TRACING_PIPELINE_CREATE_INFO_NV);
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

    public @Nullable VkPipelineShaderStageCreateInfo pStages() {
        MemorySegment s = pStagesRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkPipelineShaderStageCreateInfo(s);
    }

    public void pStages(@Nullable IVkPipelineShaderStageCreateInfo value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pStagesRaw(s);
    }

    @unsafe public @Nullable VkPipelineShaderStageCreateInfo.Ptr pStages(int assumedCount) {
        MemorySegment s = pStagesRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkPipelineShaderStageCreateInfo.BYTES);
        return new VkPipelineShaderStageCreateInfo.Ptr(s);
    }

    public @pointer(target=VkPipelineShaderStageCreateInfo.class) MemorySegment pStagesRaw() {
        return segment.get(LAYOUT$pStages, OFFSET$pStages);
    }

    public void pStagesRaw(@pointer(target=VkPipelineShaderStageCreateInfo.class) MemorySegment value) {
        segment.set(LAYOUT$pStages, OFFSET$pStages, value);
    }

    public @unsigned int groupCount() {
        return segment.get(LAYOUT$groupCount, OFFSET$groupCount);
    }

    public void groupCount(@unsigned int value) {
        segment.set(LAYOUT$groupCount, OFFSET$groupCount, value);
    }

    public @Nullable VkRayTracingShaderGroupCreateInfoNV pGroups() {
        MemorySegment s = pGroupsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkRayTracingShaderGroupCreateInfoNV(s);
    }

    public void pGroups(@Nullable IVkRayTracingShaderGroupCreateInfoNV value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pGroupsRaw(s);
    }

    @unsafe public @Nullable VkRayTracingShaderGroupCreateInfoNV.Ptr pGroups(int assumedCount) {
        MemorySegment s = pGroupsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkRayTracingShaderGroupCreateInfoNV.BYTES);
        return new VkRayTracingShaderGroupCreateInfoNV.Ptr(s);
    }

    public @pointer(target=VkRayTracingShaderGroupCreateInfoNV.class) MemorySegment pGroupsRaw() {
        return segment.get(LAYOUT$pGroups, OFFSET$pGroups);
    }

    public void pGroupsRaw(@pointer(target=VkRayTracingShaderGroupCreateInfoNV.class) MemorySegment value) {
        segment.set(LAYOUT$pGroups, OFFSET$pGroups, value);
    }

    public @unsigned int maxRecursionDepth() {
        return segment.get(LAYOUT$maxRecursionDepth, OFFSET$maxRecursionDepth);
    }

    public void maxRecursionDepth(@unsigned int value) {
        segment.set(LAYOUT$maxRecursionDepth, OFFSET$maxRecursionDepth, value);
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
        ValueLayout.ADDRESS.withTargetLayout(VkRayTracingShaderGroupCreateInfoNV.LAYOUT).withName("pGroups"),
        ValueLayout.JAVA_INT.withName("maxRecursionDepth"),
        ValueLayout.ADDRESS.withName("layout"),
        ValueLayout.ADDRESS.withName("basePipelineHandle"),
        ValueLayout.JAVA_INT.withName("basePipelineIndex")
    );
    public static final long BYTES = LAYOUT.byteSize();

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
}
