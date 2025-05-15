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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPipelineCoverageModulationStateCreateInfoNV.html">VkPipelineCoverageModulationStateCreateInfoNV</a>
@ValueBasedCandidate
public record VkPipelineCoverageModulationStateCreateInfoNV(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$flags = ValueLayout.JAVA_INT.withName("flags");
    public static final OfInt LAYOUT$coverageModulationMode = ValueLayout.JAVA_INT.withName("coverageModulationMode");
    public static final OfInt LAYOUT$coverageModulationTableEnable = ValueLayout.JAVA_INT.withName("coverageModulationTableEnable");
    public static final OfInt LAYOUT$coverageModulationTableCount = ValueLayout.JAVA_INT.withName("coverageModulationTableCount");
    public static final AddressLayout LAYOUT$pCoverageModulationTable = ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_FLOAT).withName("pCoverageModulationTable");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$flags, LAYOUT$coverageModulationMode, LAYOUT$coverageModulationTableEnable, LAYOUT$coverageModulationTableCount, LAYOUT$pCoverageModulationTable);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkPipelineCoverageModulationStateCreateInfoNV allocate(Arena arena) {
        return new VkPipelineCoverageModulationStateCreateInfoNV(arena.allocate(LAYOUT));
    }

    public static VkPipelineCoverageModulationStateCreateInfoNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPipelineCoverageModulationStateCreateInfoNV[] ret = new VkPipelineCoverageModulationStateCreateInfoNV[count];
        for (int i = 0; i < count; i ++) {
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
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$flags = PathElement.groupElement("PATH$flags");
    public static final PathElement PATH$coverageModulationMode = PathElement.groupElement("PATH$coverageModulationMode");
    public static final PathElement PATH$coverageModulationTableEnable = PathElement.groupElement("PATH$coverageModulationTableEnable");
    public static final PathElement PATH$coverageModulationTableCount = PathElement.groupElement("PATH$coverageModulationTableCount");
    public static final PathElement PATH$pCoverageModulationTable = PathElement.groupElement("PATH$pCoverageModulationTable");

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

    /// Note: the returned {@link FloatPtr} does not have correct
    /// {@link FloatPtr#size} property. It's up to user to track the size of the buffer,
    /// and use {@link FloatPtr#reinterpret} to set the size before actually reading from or
    /// writing to the buffer.
    public @Nullable FloatPtr pCoverageModulationTable() {
        MemorySegment s = pCoverageModulationTableRaw();
        if (s.address() == 0) {
            return null;
        }
        return new FloatPtr(s);
    }

    public void pCoverageModulationTable(@Nullable FloatPtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pCoverageModulationTableRaw(s);
    }

}
