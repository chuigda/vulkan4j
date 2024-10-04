package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

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
/// typedef struct VkPipelineCoverageModulationStateCreateInfoNV {
///     VkStructureType sType;
///     const void* pNext;
///     VkPipelineCoverageModulationStateCreateFlagsNV flags;
///     VkCoverageModulationModeNV coverageModulationMode;
///     VkBool32 coverageModulationTableEnable;
///     uint32_t coverageModulationTableCount;
///     const float* pCoverageModulationTable;
/// } VkPipelineCoverageModulationStateCreateInfoNV;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkPipelineCoverageModulationStateCreateInfoNV.html">VkPipelineCoverageModulationStateCreateInfoNV</a>
public record VkPipelineCoverageModulationStateCreateInfoNV(MemorySegment segment) implements IPointer {
    public VkPipelineCoverageModulationStateCreateInfoNV(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PIPELINE_COVERAGE_MODULATION_STATE_CREATE_INFO_NV);
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

    public void pNext(@nullable IPointer pointer) {
        pNext(pointer == null ? MemorySegment.NULL : pointer.segment());
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

    public @pointer(comment="float*") MemorySegment pCoverageModulationTableRaw() {
        return segment.get(LAYOUT$pCoverageModulationTable, OFFSET$pCoverageModulationTable);
    }

    public void pCoverageModulationTableRaw(@pointer(comment="float*") MemorySegment value) {
        segment.set(LAYOUT$pCoverageModulationTable, OFFSET$pCoverageModulationTable, value);
    }

    /// Note: the returned {@link FloatBuffer} does not have correct
    /// {@link FloatBuffer#size} property. It's up to user to track the size of the buffer,
    /// and use {@link FloatBuffer#reinterpret} to set the size before actually
    /// {@link FloatBuffer#read}ing or
    /// {@link FloatBuffer#write}ing the buffer.
    public @nullable FloatBuffer pCoverageModulationTable() {
        MemorySegment s = pCoverageModulationTableRaw();
        return s.address() == 0 ? null : new FloatBuffer(s);
    }

    public void pCoverageModulationTable(@nullable FloatBuffer value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pCoverageModulationTableRaw(s);
    }

    public static VkPipelineCoverageModulationStateCreateInfoNV allocate(Arena arena) {
        return new VkPipelineCoverageModulationStateCreateInfoNV(arena.allocate(LAYOUT));
    }

    public static VkPipelineCoverageModulationStateCreateInfoNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPipelineCoverageModulationStateCreateInfoNV[] ret = new VkPipelineCoverageModulationStateCreateInfoNV[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkPipelineCoverageModulationStateCreateInfoNV(segment.asSlice(i * SIZE, SIZE));
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
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("coverageModulationMode"),
        ValueLayout.JAVA_INT.withName("coverageModulationTableEnable"),
        ValueLayout.JAVA_INT.withName("coverageModulationTableCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_FLOAT).withName("pCoverageModulationTable")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$flags = PathElement.groupElement("flags");
    public static final PathElement PATH$coverageModulationMode = PathElement.groupElement("coverageModulationMode");
    public static final PathElement PATH$coverageModulationTableEnable = PathElement.groupElement("coverageModulationTableEnable");
    public static final PathElement PATH$coverageModulationTableCount = PathElement.groupElement("coverageModulationTableCount");
    public static final PathElement PATH$pCoverageModulationTable = PathElement.groupElement("pCoverageModulationTable");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$flags = (OfInt) LAYOUT.select(PATH$flags);
    public static final OfInt LAYOUT$coverageModulationMode = (OfInt) LAYOUT.select(PATH$coverageModulationMode);
    public static final OfInt LAYOUT$coverageModulationTableEnable = (OfInt) LAYOUT.select(PATH$coverageModulationTableEnable);
    public static final OfInt LAYOUT$coverageModulationTableCount = (OfInt) LAYOUT.select(PATH$coverageModulationTableCount);
    public static final AddressLayout LAYOUT$pCoverageModulationTable = (AddressLayout) LAYOUT.select(PATH$pCoverageModulationTable);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$coverageModulationMode = LAYOUT.byteOffset(PATH$coverageModulationMode);
    public static final long OFFSET$coverageModulationTableEnable = LAYOUT.byteOffset(PATH$coverageModulationTableEnable);
    public static final long OFFSET$coverageModulationTableCount = LAYOUT.byteOffset(PATH$coverageModulationTableCount);
    public static final long OFFSET$pCoverageModulationTable = LAYOUT.byteOffset(PATH$pCoverageModulationTable);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$coverageModulationMode = LAYOUT$coverageModulationMode.byteSize();
    public static final long SIZE$coverageModulationTableEnable = LAYOUT$coverageModulationTableEnable.byteSize();
    public static final long SIZE$coverageModulationTableCount = LAYOUT$coverageModulationTableCount.byteSize();
    public static final long SIZE$pCoverageModulationTable = LAYOUT$pCoverageModulationTable.byteSize();
}
