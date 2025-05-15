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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkExecutionGraphPipelineScratchSizeAMDX.html">VkExecutionGraphPipelineScratchSizeAMDX</a>
@ValueBasedCandidate
public record VkExecutionGraphPipelineScratchSizeAMDX(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfLong LAYOUT$minSize = ValueLayout.JAVA_LONG.withName("minSize");
    public static final OfLong LAYOUT$maxSize = ValueLayout.JAVA_LONG.withName("maxSize");
    public static final OfLong LAYOUT$sizeGranularity = ValueLayout.JAVA_LONG.withName("sizeGranularity");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$minSize, LAYOUT$maxSize, LAYOUT$sizeGranularity);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkExecutionGraphPipelineScratchSizeAMDX allocate(Arena arena) {
        return new VkExecutionGraphPipelineScratchSizeAMDX(arena.allocate(LAYOUT));
    }

    public static VkExecutionGraphPipelineScratchSizeAMDX[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkExecutionGraphPipelineScratchSizeAMDX[] ret = new VkExecutionGraphPipelineScratchSizeAMDX[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkExecutionGraphPipelineScratchSizeAMDX(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkExecutionGraphPipelineScratchSizeAMDX clone(Arena arena, VkExecutionGraphPipelineScratchSizeAMDX src) {
        VkExecutionGraphPipelineScratchSizeAMDX ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkExecutionGraphPipelineScratchSizeAMDX[] clone(Arena arena, VkExecutionGraphPipelineScratchSizeAMDX[] src) {
        VkExecutionGraphPipelineScratchSizeAMDX[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$minSize = PathElement.groupElement("PATH$minSize");
    public static final PathElement PATH$maxSize = PathElement.groupElement("PATH$maxSize");
    public static final PathElement PATH$sizeGranularity = PathElement.groupElement("PATH$sizeGranularity");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$minSize = LAYOUT$minSize.byteSize();
    public static final long SIZE$maxSize = LAYOUT$maxSize.byteSize();
    public static final long SIZE$sizeGranularity = LAYOUT$sizeGranularity.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$minSize = LAYOUT.byteOffset(PATH$minSize);
    public static final long OFFSET$maxSize = LAYOUT.byteOffset(PATH$maxSize);
    public static final long OFFSET$sizeGranularity = LAYOUT.byteOffset(PATH$sizeGranularity);

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

    public @unsigned long minSize() {
        return segment.get(LAYOUT$minSize, OFFSET$minSize);
    }

    public void minSize(@unsigned long value) {
        segment.set(LAYOUT$minSize, OFFSET$minSize, value);
    }

    public @unsigned long maxSize() {
        return segment.get(LAYOUT$maxSize, OFFSET$maxSize);
    }

    public void maxSize(@unsigned long value) {
        segment.set(LAYOUT$maxSize, OFFSET$maxSize, value);
    }

    public @unsigned long sizeGranularity() {
        return segment.get(LAYOUT$sizeGranularity, OFFSET$sizeGranularity);
    }

    public void sizeGranularity(@unsigned long value) {
        segment.set(LAYOUT$sizeGranularity, OFFSET$sizeGranularity, value);
    }

}
