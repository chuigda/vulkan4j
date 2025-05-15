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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDevicePerStageDescriptorSetFeaturesNV.html">VkPhysicalDevicePerStageDescriptorSetFeaturesNV</a>
@ValueBasedCandidate
public record VkPhysicalDevicePerStageDescriptorSetFeaturesNV(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$perStageDescriptorSet = ValueLayout.JAVA_INT.withName("perStageDescriptorSet");
    public static final OfInt LAYOUT$dynamicPipelineLayout = ValueLayout.JAVA_INT.withName("dynamicPipelineLayout");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$perStageDescriptorSet, LAYOUT$dynamicPipelineLayout);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkPhysicalDevicePerStageDescriptorSetFeaturesNV allocate(Arena arena) {
        return new VkPhysicalDevicePerStageDescriptorSetFeaturesNV(arena.allocate(LAYOUT));
    }

    public static VkPhysicalDevicePerStageDescriptorSetFeaturesNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDevicePerStageDescriptorSetFeaturesNV[] ret = new VkPhysicalDevicePerStageDescriptorSetFeaturesNV[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPhysicalDevicePerStageDescriptorSetFeaturesNV(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPhysicalDevicePerStageDescriptorSetFeaturesNV clone(Arena arena, VkPhysicalDevicePerStageDescriptorSetFeaturesNV src) {
        VkPhysicalDevicePerStageDescriptorSetFeaturesNV ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDevicePerStageDescriptorSetFeaturesNV[] clone(Arena arena, VkPhysicalDevicePerStageDescriptorSetFeaturesNV[] src) {
        VkPhysicalDevicePerStageDescriptorSetFeaturesNV[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$perStageDescriptorSet = PathElement.groupElement("PATH$perStageDescriptorSet");
    public static final PathElement PATH$dynamicPipelineLayout = PathElement.groupElement("PATH$dynamicPipelineLayout");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$perStageDescriptorSet = LAYOUT$perStageDescriptorSet.byteSize();
    public static final long SIZE$dynamicPipelineLayout = LAYOUT$dynamicPipelineLayout.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$perStageDescriptorSet = LAYOUT.byteOffset(PATH$perStageDescriptorSet);
    public static final long OFFSET$dynamicPipelineLayout = LAYOUT.byteOffset(PATH$dynamicPipelineLayout);

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

    public @unsigned int perStageDescriptorSet() {
        return segment.get(LAYOUT$perStageDescriptorSet, OFFSET$perStageDescriptorSet);
    }

    public void perStageDescriptorSet(@unsigned int value) {
        segment.set(LAYOUT$perStageDescriptorSet, OFFSET$perStageDescriptorSet, value);
    }

    public @unsigned int dynamicPipelineLayout() {
        return segment.get(LAYOUT$dynamicPipelineLayout, OFFSET$dynamicPipelineLayout);
    }

    public void dynamicPipelineLayout(@unsigned int value) {
        segment.set(LAYOUT$dynamicPipelineLayout, OFFSET$dynamicPipelineLayout, value);
    }

}
