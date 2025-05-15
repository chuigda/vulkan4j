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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkGeneratedCommandsMemoryRequirementsInfoEXT.html">VkGeneratedCommandsMemoryRequirementsInfoEXT</a>
@ValueBasedCandidate
public record VkGeneratedCommandsMemoryRequirementsInfoEXT(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final AddressLayout LAYOUT$indirectExecutionSet = ValueLayout.ADDRESS.withName("indirectExecutionSet");
    public static final AddressLayout LAYOUT$indirectCommandsLayout = ValueLayout.ADDRESS.withName("indirectCommandsLayout");
    public static final OfInt LAYOUT$maxSequenceCount = ValueLayout.JAVA_INT.withName("maxSequenceCount");
    public static final OfInt LAYOUT$maxDrawCount = ValueLayout.JAVA_INT.withName("maxDrawCount");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$indirectExecutionSet, LAYOUT$indirectCommandsLayout, LAYOUT$maxSequenceCount, LAYOUT$maxDrawCount);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkGeneratedCommandsMemoryRequirementsInfoEXT allocate(Arena arena) {
        return new VkGeneratedCommandsMemoryRequirementsInfoEXT(arena.allocate(LAYOUT));
    }

    public static VkGeneratedCommandsMemoryRequirementsInfoEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkGeneratedCommandsMemoryRequirementsInfoEXT[] ret = new VkGeneratedCommandsMemoryRequirementsInfoEXT[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkGeneratedCommandsMemoryRequirementsInfoEXT(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkGeneratedCommandsMemoryRequirementsInfoEXT clone(Arena arena, VkGeneratedCommandsMemoryRequirementsInfoEXT src) {
        VkGeneratedCommandsMemoryRequirementsInfoEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkGeneratedCommandsMemoryRequirementsInfoEXT[] clone(Arena arena, VkGeneratedCommandsMemoryRequirementsInfoEXT[] src) {
        VkGeneratedCommandsMemoryRequirementsInfoEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$indirectExecutionSet = PathElement.groupElement("PATH$indirectExecutionSet");
    public static final PathElement PATH$indirectCommandsLayout = PathElement.groupElement("PATH$indirectCommandsLayout");
    public static final PathElement PATH$maxSequenceCount = PathElement.groupElement("PATH$maxSequenceCount");
    public static final PathElement PATH$maxDrawCount = PathElement.groupElement("PATH$maxDrawCount");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$indirectExecutionSet = LAYOUT$indirectExecutionSet.byteSize();
    public static final long SIZE$indirectCommandsLayout = LAYOUT$indirectCommandsLayout.byteSize();
    public static final long SIZE$maxSequenceCount = LAYOUT$maxSequenceCount.byteSize();
    public static final long SIZE$maxDrawCount = LAYOUT$maxDrawCount.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$indirectExecutionSet = LAYOUT.byteOffset(PATH$indirectExecutionSet);
    public static final long OFFSET$indirectCommandsLayout = LAYOUT.byteOffset(PATH$indirectCommandsLayout);
    public static final long OFFSET$maxSequenceCount = LAYOUT.byteOffset(PATH$maxSequenceCount);
    public static final long OFFSET$maxDrawCount = LAYOUT.byteOffset(PATH$maxDrawCount);

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

    public @Nullable VkIndirectExecutionSetEXT indirectExecutionSet() {
        MemorySegment s = segment.asSlice(OFFSET$indirectExecutionSet, SIZE$indirectExecutionSet);
        if (s.address() == 0) {
            return null;
        }
        return new VkIndirectExecutionSetEXT(s);
    }

    public void indirectExecutionSet() {
        segment.set(LAYOUT$indirectExecutionSet, OFFSET$indirectExecutionSet, value != null ? value.segment() : MemorySegment.NULL);
    }

    public @Nullable VkIndirectCommandsLayoutEXT indirectCommandsLayout() {
        MemorySegment s = segment.asSlice(OFFSET$indirectCommandsLayout, SIZE$indirectCommandsLayout);
        if (s.address() == 0) {
            return null;
        }
        return new VkIndirectCommandsLayoutEXT(s);
    }

    public void indirectCommandsLayout() {
        segment.set(LAYOUT$indirectCommandsLayout, OFFSET$indirectCommandsLayout, value != null ? value.segment() : MemorySegment.NULL);
    }

    public @unsigned int maxSequenceCount() {
        return segment.get(LAYOUT$maxSequenceCount, OFFSET$maxSequenceCount);
    }

    public void maxSequenceCount(@unsigned int value) {
        segment.set(LAYOUT$maxSequenceCount, OFFSET$maxSequenceCount, value);
    }

    public @unsigned int maxDrawCount() {
        return segment.get(LAYOUT$maxDrawCount, OFFSET$maxDrawCount);
    }

    public void maxDrawCount(@unsigned int value) {
        segment.set(LAYOUT$maxDrawCount, OFFSET$maxDrawCount, value);
    }

}
