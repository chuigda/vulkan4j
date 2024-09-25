package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.annotation.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.buffer.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import tech.icey.vk4j.NativeLayout;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

public record VkPhysicalDevicePerStageDescriptorSetFeaturesNV(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("perStageDescriptorSet"),
        ValueLayout.JAVA_INT.withName("dynamicPipelineLayout")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$perStageDescriptorSet = PathElement.groupElement("perStageDescriptorSet");
    public static final PathElement PATH$dynamicPipelineLayout = PathElement.groupElement("dynamicPipelineLayout");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$perStageDescriptorSet = (OfInt) LAYOUT.select(PATH$perStageDescriptorSet);
    public static final OfInt LAYOUT$dynamicPipelineLayout = (OfInt) LAYOUT.select(PATH$dynamicPipelineLayout);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$perStageDescriptorSet = LAYOUT.byteOffset(PATH$perStageDescriptorSet);
    public static final long OFFSET$dynamicPipelineLayout = LAYOUT.byteOffset(PATH$dynamicPipelineLayout);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$perStageDescriptorSet = LAYOUT$perStageDescriptorSet.byteSize();
    public static final long SIZE$dynamicPipelineLayout = LAYOUT$dynamicPipelineLayout.byteSize();

    public VkPhysicalDevicePerStageDescriptorSetFeaturesNV(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PER_STAGE_DESCRIPTOR_SET_FEATURES_NV);
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

    public static VkPhysicalDevicePerStageDescriptorSetFeaturesNV allocate(Arena arena) {
        return new VkPhysicalDevicePerStageDescriptorSetFeaturesNV(arena.allocate(LAYOUT));
    }
    
    public static VkPhysicalDevicePerStageDescriptorSetFeaturesNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDevicePerStageDescriptorSetFeaturesNV[] ret = new VkPhysicalDevicePerStageDescriptorSetFeaturesNV[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkPhysicalDevicePerStageDescriptorSetFeaturesNV(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
}
