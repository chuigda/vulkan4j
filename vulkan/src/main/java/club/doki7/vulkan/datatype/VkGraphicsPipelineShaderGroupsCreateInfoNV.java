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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkGraphicsPipelineShaderGroupsCreateInfoNV.html"><code>VkGraphicsPipelineShaderGroupsCreateInfoNV</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkGraphicsPipelineShaderGroupsCreateInfoNV {
///     VkStructureType sType; // @link substring="VkStructureType" target="VkStructureType" @link substring="sType" target="#sType"
///     void const* pNext; // optional // @link substring="pNext" target="#pNext"
///     uint32_t groupCount; // optional // @link substring="groupCount" target="#groupCount"
///     VkGraphicsShaderGroupCreateInfoNV const* pGroups; // @link substring="VkGraphicsShaderGroupCreateInfoNV" target="VkGraphicsShaderGroupCreateInfoNV" @link substring="pGroups" target="#pGroups"
///     uint32_t pipelineCount; // optional // @link substring="pipelineCount" target="#pipelineCount"
///     VkPipeline const* pPipelines; // @link substring="VkPipeline" target="VkPipeline" @link substring="pPipelines" target="#pPipelines"
/// } VkGraphicsPipelineShaderGroupsCreateInfoNV;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_GRAPHICS_PIPELINE_SHADER_GROUPS_CREATE_INFO_NV`
///
/// The {@code allocate} ({@link VkGraphicsPipelineShaderGroupsCreateInfoNV#allocate(Arena)}, {@link VkGraphicsPipelineShaderGroupsCreateInfoNV#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link VkGraphicsPipelineShaderGroupsCreateInfoNV#autoInit}
/// to initialize these fields manually for non-allocated instances.
/// ## Contracts
///
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkGraphicsPipelineShaderGroupsCreateInfoNV.html"><code>VkGraphicsPipelineShaderGroupsCreateInfoNV</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkGraphicsPipelineShaderGroupsCreateInfoNV(@NotNull MemorySegment segment) implements IVkGraphicsPipelineShaderGroupsCreateInfoNV {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkGraphicsPipelineShaderGroupsCreateInfoNV.html"><code>VkGraphicsPipelineShaderGroupsCreateInfoNV</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link VkGraphicsPipelineShaderGroupsCreateInfoNV}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IVkGraphicsPipelineShaderGroupsCreateInfoNV to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code VkGraphicsPipelineShaderGroupsCreateInfoNV.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IVkGraphicsPipelineShaderGroupsCreateInfoNV {
        public long size() {
            return segment.byteSize() / VkGraphicsPipelineShaderGroupsCreateInfoNV.BYTES;
        }
        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull VkGraphicsPipelineShaderGroupsCreateInfoNV at(long index) {
            return new VkGraphicsPipelineShaderGroupsCreateInfoNV(segment.asSlice(index * VkGraphicsPipelineShaderGroupsCreateInfoNV.BYTES, VkGraphicsPipelineShaderGroupsCreateInfoNV.BYTES));
        }
        public void write(long index, @NotNull VkGraphicsPipelineShaderGroupsCreateInfoNV value) {
            MemorySegment s = segment.asSlice(index * VkGraphicsPipelineShaderGroupsCreateInfoNV.BYTES, VkGraphicsPipelineShaderGroupsCreateInfoNV.BYTES);
            s.copyFrom(value.segment);
        }
    }
    public static VkGraphicsPipelineShaderGroupsCreateInfoNV allocate(Arena arena) {
        VkGraphicsPipelineShaderGroupsCreateInfoNV ret = new VkGraphicsPipelineShaderGroupsCreateInfoNV(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.GRAPHICS_PIPELINE_SHADER_GROUPS_CREATE_INFO_NV);
        return ret;
    }

    public static VkGraphicsPipelineShaderGroupsCreateInfoNV.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkGraphicsPipelineShaderGroupsCreateInfoNV.Ptr ret = new VkGraphicsPipelineShaderGroupsCreateInfoNV.Ptr(segment);
        for (long i = 0; i < count; i ++) {
            ret.at(i).sType(VkStructureType.GRAPHICS_PIPELINE_SHADER_GROUPS_CREATE_INFO_NV);
        }
        return ret;
    }

    public static VkGraphicsPipelineShaderGroupsCreateInfoNV clone(Arena arena, VkGraphicsPipelineShaderGroupsCreateInfoNV src) {
        VkGraphicsPipelineShaderGroupsCreateInfoNV ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.GRAPHICS_PIPELINE_SHADER_GROUPS_CREATE_INFO_NV);
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

    public @unsigned int groupCount() {
        return segment.get(LAYOUT$groupCount, OFFSET$groupCount);
    }

    public void groupCount(@unsigned int value) {
        segment.set(LAYOUT$groupCount, OFFSET$groupCount, value);
    }

    public @Nullable VkGraphicsShaderGroupCreateInfoNV pGroups() {
        MemorySegment s = pGroupsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkGraphicsShaderGroupCreateInfoNV(s);
    }

    public void pGroups(@Nullable VkGraphicsShaderGroupCreateInfoNV value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pGroupsRaw(s);
    }

    @unsafe public @Nullable VkGraphicsShaderGroupCreateInfoNV[] pGroups(int assumedCount) {
        MemorySegment s = pGroupsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkGraphicsShaderGroupCreateInfoNV.BYTES);
        VkGraphicsShaderGroupCreateInfoNV[] ret = new VkGraphicsShaderGroupCreateInfoNV[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkGraphicsShaderGroupCreateInfoNV(s.asSlice(i * VkGraphicsShaderGroupCreateInfoNV.BYTES, VkGraphicsShaderGroupCreateInfoNV.BYTES));
        }
        return ret;
    }

    public @pointer(target=VkGraphicsShaderGroupCreateInfoNV.class) MemorySegment pGroupsRaw() {
        return segment.get(LAYOUT$pGroups, OFFSET$pGroups);
    }

    public void pGroupsRaw(@pointer(target=VkGraphicsShaderGroupCreateInfoNV.class) MemorySegment value) {
        segment.set(LAYOUT$pGroups, OFFSET$pGroups, value);
    }

    public @unsigned int pipelineCount() {
        return segment.get(LAYOUT$pipelineCount, OFFSET$pipelineCount);
    }

    public void pipelineCount(@unsigned int value) {
        segment.set(LAYOUT$pipelineCount, OFFSET$pipelineCount, value);
    }

    /// Note: the returned {@link VkPipeline.Ptr} does not have correct {@link VkPipeline.Ptr#size}
    /// property. It's up to user to track the size of the buffer, and use
    /// {@link VkPipeline.Ptr#reinterpret} to set the size before actually reading from or writing to the
    /// buffer.
    public @Nullable VkPipeline.Ptr pPipelines() {
        MemorySegment s = pPipelinesRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkPipeline.Ptr(s);
    }

    public void pPipelines(@Nullable VkPipeline.Ptr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pPipelinesRaw(s);
    }

    public @pointer(target=VkPipeline.class) MemorySegment pPipelinesRaw() {
        return segment.get(LAYOUT$pPipelines, OFFSET$pPipelines);
    }

    public void pPipelinesRaw(@pointer(target=VkPipeline.class) MemorySegment value) {
        segment.set(LAYOUT$pPipelines, OFFSET$pPipelines, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("groupCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkGraphicsShaderGroupCreateInfoNV.LAYOUT).withName("pGroups"),
        ValueLayout.JAVA_INT.withName("pipelineCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS).withName("pPipelines")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$groupCount = PathElement.groupElement("groupCount");
    public static final PathElement PATH$pGroups = PathElement.groupElement("pGroups");
    public static final PathElement PATH$pipelineCount = PathElement.groupElement("pipelineCount");
    public static final PathElement PATH$pPipelines = PathElement.groupElement("pPipelines");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$groupCount = (OfInt) LAYOUT.select(PATH$groupCount);
    public static final AddressLayout LAYOUT$pGroups = (AddressLayout) LAYOUT.select(PATH$pGroups);
    public static final OfInt LAYOUT$pipelineCount = (OfInt) LAYOUT.select(PATH$pipelineCount);
    public static final AddressLayout LAYOUT$pPipelines = (AddressLayout) LAYOUT.select(PATH$pPipelines);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$groupCount = LAYOUT$groupCount.byteSize();
    public static final long SIZE$pGroups = LAYOUT$pGroups.byteSize();
    public static final long SIZE$pipelineCount = LAYOUT$pipelineCount.byteSize();
    public static final long SIZE$pPipelines = LAYOUT$pPipelines.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$groupCount = LAYOUT.byteOffset(PATH$groupCount);
    public static final long OFFSET$pGroups = LAYOUT.byteOffset(PATH$pGroups);
    public static final long OFFSET$pipelineCount = LAYOUT.byteOffset(PATH$pipelineCount);
    public static final long OFFSET$pPipelines = LAYOUT.byteOffset(PATH$pPipelines);
}
