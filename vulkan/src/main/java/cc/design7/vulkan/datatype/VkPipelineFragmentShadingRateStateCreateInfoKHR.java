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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPipelineFragmentShadingRateStateCreateInfoKHR.html">VkPipelineFragmentShadingRateStateCreateInfoKHR</a>
@ValueBasedCandidate
public record VkPipelineFragmentShadingRateStateCreateInfoKHR(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final StructLayout LAYOUT$fragmentSize = VkExtent2D.LAYOUT.withName("fragmentSize");
    public static final OfInt LAYOUT$combinerOps = ValueLayout.JAVA_INT.withName("combinerOps");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$fragmentSize, LAYOUT$combinerOps);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkPipelineFragmentShadingRateStateCreateInfoKHR allocate(Arena arena) {
        return new VkPipelineFragmentShadingRateStateCreateInfoKHR(arena.allocate(LAYOUT));
    }

    public static VkPipelineFragmentShadingRateStateCreateInfoKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPipelineFragmentShadingRateStateCreateInfoKHR[] ret = new VkPipelineFragmentShadingRateStateCreateInfoKHR[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPipelineFragmentShadingRateStateCreateInfoKHR(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPipelineFragmentShadingRateStateCreateInfoKHR clone(Arena arena, VkPipelineFragmentShadingRateStateCreateInfoKHR src) {
        VkPipelineFragmentShadingRateStateCreateInfoKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPipelineFragmentShadingRateStateCreateInfoKHR[] clone(Arena arena, VkPipelineFragmentShadingRateStateCreateInfoKHR[] src) {
        VkPipelineFragmentShadingRateStateCreateInfoKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$fragmentSize = PathElement.groupElement("PATH$fragmentSize");
    public static final PathElement PATH$combinerOps = PathElement.groupElement("PATH$combinerOps");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$fragmentSize = LAYOUT$fragmentSize.byteSize();
    public static final long SIZE$combinerOps = LAYOUT$combinerOps.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$fragmentSize = LAYOUT.byteOffset(PATH$fragmentSize);
    public static final long OFFSET$combinerOps = LAYOUT.byteOffset(PATH$combinerOps);

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

    public VkExtent2D fragmentSize() {
        return new VkExtent2D(segment.asSlice(OFFSET$fragmentSize, LAYOUT$fragmentSize));
    }

    public void fragmentSize(VkExtent2D value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$fragmentSize, SIZE$fragmentSize);
    }

    public @enumtype(VkFragmentShadingRateCombinerOpKHR.class) int combinerOps() {
        return segment.get(LAYOUT$combinerOps, OFFSET$combinerOps);
    }

    public void combinerOps(@enumtype(VkFragmentShadingRateCombinerOpKHR.class) int value) {
        segment.set(LAYOUT$combinerOps, OFFSET$combinerOps, value);
    }

}
