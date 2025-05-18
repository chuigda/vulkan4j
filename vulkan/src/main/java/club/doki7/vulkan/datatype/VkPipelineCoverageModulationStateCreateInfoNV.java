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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPipelineCoverageModulationStateCreateInfoNV.html"><code>VkPipelineCoverageModulationStateCreateInfoNV</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkPipelineCoverageModulationStateCreateInfoNV {
///     VkStructureType sType; // @link substring="VkStructureType" target="VkStructureType" @link substring="sType" target="#sType"
///     void const* pNext; // optional // @link substring="pNext" target="#pNext"
///     VkPipelineCoverageModulationStateCreateFlagsNV flags; // optional // @link substring="VkPipelineCoverageModulationStateCreateFlagsNV" target="VkPipelineCoverageModulationStateCreateFlagsNV" @link substring="flags" target="#flags"
///     VkCoverageModulationModeNV coverageModulationMode; // @link substring="VkCoverageModulationModeNV" target="VkCoverageModulationModeNV" @link substring="coverageModulationMode" target="#coverageModulationMode"
///     VkBool32 coverageModulationTableEnable; // @link substring="coverageModulationTableEnable" target="#coverageModulationTableEnable"
///     uint32_t coverageModulationTableCount; // optional // @link substring="coverageModulationTableCount" target="#coverageModulationTableCount"
///     float const* pCoverageModulationTable; // optional // @link substring="pCoverageModulationTable" target="#pCoverageModulationTable"
/// } VkPipelineCoverageModulationStateCreateInfoNV;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_PIPELINE_COVERAGE_MODULATION_STATE_CREATE_INFO_NV`
///
/// The {@code allocate} ({@link VkPipelineCoverageModulationStateCreateInfoNV#allocate(Arena)}, {@link VkPipelineCoverageModulationStateCreateInfoNV#allocate(Arena, int)})
/// functions will automatically initialize these fields. Also, you may call {@link VkPipelineCoverageModulationStateCreateInfoNV#autoInit}
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPipelineCoverageModulationStateCreateInfoNV.html"><code>VkPipelineCoverageModulationStateCreateInfoNV</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkPipelineCoverageModulationStateCreateInfoNV(@NotNull MemorySegment segment) implements IPointer {
    public static VkPipelineCoverageModulationStateCreateInfoNV allocate(Arena arena) {
        VkPipelineCoverageModulationStateCreateInfoNV ret = new VkPipelineCoverageModulationStateCreateInfoNV(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.PIPELINE_COVERAGE_MODULATION_STATE_CREATE_INFO_NV);
        return ret;
    }

    public static VkPipelineCoverageModulationStateCreateInfoNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPipelineCoverageModulationStateCreateInfoNV[] ret = new VkPipelineCoverageModulationStateCreateInfoNV[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPipelineCoverageModulationStateCreateInfoNV(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.PIPELINE_COVERAGE_MODULATION_STATE_CREATE_INFO_NV);
        }
        return ret;
    }

    public static VkPipelineCoverageModulationStateCreateInfoNV clone(Arena arena, VkPipelineCoverageModulationStateCreateInfoNV src) {
        VkPipelineCoverageModulationStateCreateInfoNV ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPipelineCoverageModulationStateCreateInfoNV[] clone(Arena arena, VkPipelineCoverageModulationStateCreateInfoNV[] src) {
        VkPipelineCoverageModulationStateCreateInfoNV[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.PIPELINE_COVERAGE_MODULATION_STATE_CREATE_INFO_NV);
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

    public @enumtype(VkPipelineCoverageModulationStateCreateFlagsNV.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public void flags(@enumtype(VkPipelineCoverageModulationStateCreateFlagsNV.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
    }

    public @enumtype(VkCoverageModulationModeNV.class) int coverageModulationMode() {
        return segment.get(LAYOUT$coverageModulationMode, OFFSET$coverageModulationMode);
    }

    public void coverageModulationMode(@enumtype(VkCoverageModulationModeNV.class) int value) {
        segment.set(LAYOUT$coverageModulationMode, OFFSET$coverageModulationMode, value);
    }

    public @unsigned int coverageModulationTableEnable() {
        return segment.get(LAYOUT$coverageModulationTableEnable, OFFSET$coverageModulationTableEnable);
    }

    public void coverageModulationTableEnable(@unsigned int value) {
        segment.set(LAYOUT$coverageModulationTableEnable, OFFSET$coverageModulationTableEnable, value);
    }

    public @unsigned int coverageModulationTableCount() {
        return segment.get(LAYOUT$coverageModulationTableCount, OFFSET$coverageModulationTableCount);
    }

    public void coverageModulationTableCount(@unsigned int value) {
        segment.set(LAYOUT$coverageModulationTableCount, OFFSET$coverageModulationTableCount, value);
    }

    /// Note: the returned {@link FloatPtr} does not have correct
    /// {@link FloatPtr#size} property. It's up to user to track the size of the buffer,
    /// and use {@link FloatPtr#reinterpret} to set the size before actually reading from or
    /// writing to the buffer.
    public @Nullable FloatPtr pCoverageModulationTable() {
        MemorySegment s = pCoverageModulationTableRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new FloatPtr(s);
    }

    public void pCoverageModulationTable(@Nullable FloatPtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pCoverageModulationTableRaw(s);
    }

    public @pointer(comment="float*") MemorySegment pCoverageModulationTableRaw() {
        return segment.get(LAYOUT$pCoverageModulationTable, OFFSET$pCoverageModulationTable);
    }

    public void pCoverageModulationTableRaw(@pointer(comment="float*") MemorySegment value) {
        segment.set(LAYOUT$pCoverageModulationTable, OFFSET$pCoverageModulationTable, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("coverageModulationMode"),
        ValueLayout.JAVA_INT.withName("coverageModulationTableEnable"),
        ValueLayout.JAVA_INT.withName("coverageModulationTableCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_FLOAT).withName("pCoverageModulationTable")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$flags = PathElement.groupElement("PATH$flags");
    public static final PathElement PATH$coverageModulationMode = PathElement.groupElement("PATH$coverageModulationMode");
    public static final PathElement PATH$coverageModulationTableEnable = PathElement.groupElement("PATH$coverageModulationTableEnable");
    public static final PathElement PATH$coverageModulationTableCount = PathElement.groupElement("PATH$coverageModulationTableCount");
    public static final PathElement PATH$pCoverageModulationTable = PathElement.groupElement("PATH$pCoverageModulationTable");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$flags = (OfInt) LAYOUT.select(PATH$flags);
    public static final OfInt LAYOUT$coverageModulationMode = (OfInt) LAYOUT.select(PATH$coverageModulationMode);
    public static final OfInt LAYOUT$coverageModulationTableEnable = (OfInt) LAYOUT.select(PATH$coverageModulationTableEnable);
    public static final OfInt LAYOUT$coverageModulationTableCount = (OfInt) LAYOUT.select(PATH$coverageModulationTableCount);
    public static final AddressLayout LAYOUT$pCoverageModulationTable = (AddressLayout) LAYOUT.select(PATH$pCoverageModulationTable);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$coverageModulationMode = LAYOUT$coverageModulationMode.byteSize();
    public static final long SIZE$coverageModulationTableEnable = LAYOUT$coverageModulationTableEnable.byteSize();
    public static final long SIZE$coverageModulationTableCount = LAYOUT$coverageModulationTableCount.byteSize();
    public static final long SIZE$pCoverageModulationTable = LAYOUT$pCoverageModulationTable.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$coverageModulationMode = LAYOUT.byteOffset(PATH$coverageModulationMode);
    public static final long OFFSET$coverageModulationTableEnable = LAYOUT.byteOffset(PATH$coverageModulationTableEnable);
    public static final long OFFSET$coverageModulationTableCount = LAYOUT.byteOffset(PATH$coverageModulationTableCount);
    public static final long OFFSET$pCoverageModulationTable = LAYOUT.byteOffset(PATH$pCoverageModulationTable);
}
