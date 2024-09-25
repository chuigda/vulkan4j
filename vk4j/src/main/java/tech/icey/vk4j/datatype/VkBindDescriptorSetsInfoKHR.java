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

public record VkBindDescriptorSetsInfoKHR(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("stageFlags"),
        ValueLayout.ADDRESS.withName("layout"),
        ValueLayout.JAVA_INT.withName("firstSet"),
        ValueLayout.JAVA_INT.withName("descriptorSetCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS).withName("pDescriptorSets"),
        ValueLayout.JAVA_INT.withName("dynamicOffsetCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT).withName("pDynamicOffsets")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$stageFlags = PathElement.groupElement("stageFlags");
    public static final PathElement PATH$layout = PathElement.groupElement("layout");
    public static final PathElement PATH$firstSet = PathElement.groupElement("firstSet");
    public static final PathElement PATH$descriptorSetCount = PathElement.groupElement("descriptorSetCount");
    public static final PathElement PATH$pDescriptorSets = PathElement.groupElement("pDescriptorSets");
    public static final PathElement PATH$dynamicOffsetCount = PathElement.groupElement("dynamicOffsetCount");
    public static final PathElement PATH$pDynamicOffsets = PathElement.groupElement("pDynamicOffsets");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$stageFlags = (OfInt) LAYOUT.select(PATH$stageFlags);
    public static final AddressLayout LAYOUT$layout = (AddressLayout) LAYOUT.select(PATH$layout);
    public static final OfInt LAYOUT$firstSet = (OfInt) LAYOUT.select(PATH$firstSet);
    public static final OfInt LAYOUT$descriptorSetCount = (OfInt) LAYOUT.select(PATH$descriptorSetCount);
    public static final AddressLayout LAYOUT$pDescriptorSets = (AddressLayout) LAYOUT.select(PATH$pDescriptorSets);
    public static final OfInt LAYOUT$dynamicOffsetCount = (OfInt) LAYOUT.select(PATH$dynamicOffsetCount);
    public static final AddressLayout LAYOUT$pDynamicOffsets = (AddressLayout) LAYOUT.select(PATH$pDynamicOffsets);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$stageFlags = LAYOUT.byteOffset(PATH$stageFlags);
    public static final long OFFSET$layout = LAYOUT.byteOffset(PATH$layout);
    public static final long OFFSET$firstSet = LAYOUT.byteOffset(PATH$firstSet);
    public static final long OFFSET$descriptorSetCount = LAYOUT.byteOffset(PATH$descriptorSetCount);
    public static final long OFFSET$pDescriptorSets = LAYOUT.byteOffset(PATH$pDescriptorSets);
    public static final long OFFSET$dynamicOffsetCount = LAYOUT.byteOffset(PATH$dynamicOffsetCount);
    public static final long OFFSET$pDynamicOffsets = LAYOUT.byteOffset(PATH$pDynamicOffsets);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$stageFlags = LAYOUT$stageFlags.byteSize();
    public static final long SIZE$layout = LAYOUT$layout.byteSize();
    public static final long SIZE$firstSet = LAYOUT$firstSet.byteSize();
    public static final long SIZE$descriptorSetCount = LAYOUT$descriptorSetCount.byteSize();
    public static final long SIZE$pDescriptorSets = LAYOUT$pDescriptorSets.byteSize();
    public static final long SIZE$dynamicOffsetCount = LAYOUT$dynamicOffsetCount.byteSize();
    public static final long SIZE$pDynamicOffsets = LAYOUT$pDynamicOffsets.byteSize();

    public VkBindDescriptorSetsInfoKHR(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_BIND_DESCRIPTOR_SETS_INFO_KHR);
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

    public @enumtype(VkShaderStageFlags.class) int stageFlags() {
        return segment.get(LAYOUT$stageFlags, OFFSET$stageFlags);
    }

    public void stageFlags(@enumtype(VkShaderStageFlags.class) int value) {
        segment.set(LAYOUT$stageFlags, OFFSET$stageFlags, value);
    }

    public VkPipelineLayout layout() {
        return new VkPipelineLayout(segment.get(LAYOUT$layout, OFFSET$layout));
    }

    public void layout(VkPipelineLayout value) {
        segment.set(LAYOUT$layout, OFFSET$layout, value.segment());
    }

    public @unsigned int firstSet() {
        return segment.get(LAYOUT$firstSet, OFFSET$firstSet);
    }

    public void firstSet(@unsigned int value) {
        segment.set(LAYOUT$firstSet, OFFSET$firstSet, value);
    }

    public @unsigned int descriptorSetCount() {
        return segment.get(LAYOUT$descriptorSetCount, OFFSET$descriptorSetCount);
    }

    public void descriptorSetCount(@unsigned int value) {
        segment.set(LAYOUT$descriptorSetCount, OFFSET$descriptorSetCount, value);
    }

    public @pointer(comment="VkDescriptorSet") MemorySegment pDescriptorSetsRaw() {
        return segment.get(LAYOUT$pDescriptorSets, OFFSET$pDescriptorSets);
    }

    public void pDescriptorSetsRaw(@pointer(comment="VkDescriptorSet") MemorySegment value) {
        segment.set(LAYOUT$pDescriptorSets, OFFSET$pDescriptorSets, value);
    }

    public @nullable VkDescriptorSet.Buffer pDescriptorSets() {
        MemorySegment s = pDescriptorSetsRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkDescriptorSet.Buffer(s);
    }

    public void pDescriptorSets(@nullable VkDescriptorSet.Buffer value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pDescriptorSetsRaw(s);
    }

    public @unsigned int dynamicOffsetCount() {
        return segment.get(LAYOUT$dynamicOffsetCount, OFFSET$dynamicOffsetCount);
    }

    public void dynamicOffsetCount(@unsigned int value) {
        segment.set(LAYOUT$dynamicOffsetCount, OFFSET$dynamicOffsetCount, value);
    }

    public @pointer(comment="uint32_t*") MemorySegment pDynamicOffsetsRaw() {
        return segment.get(LAYOUT$pDynamicOffsets, OFFSET$pDynamicOffsets);
    }

    public void pDynamicOffsetsRaw(@pointer(comment="uint32_t*") MemorySegment value) {
        segment.set(LAYOUT$pDynamicOffsets, OFFSET$pDynamicOffsets, value);
    }
    
    public @unsigned IntBuffer pDynamicOffsets() {
        return new IntBuffer(pDynamicOffsetsRaw());
    }

    public void pDynamicOffsets(@unsigned IntBuffer value) {
        pDynamicOffsetsRaw(value.segment());
    }

    public static VkBindDescriptorSetsInfoKHR allocate(Arena arena) {
        return new VkBindDescriptorSetsInfoKHR(arena.allocate(LAYOUT));
    }
    
    public static VkBindDescriptorSetsInfoKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkBindDescriptorSetsInfoKHR[] ret = new VkBindDescriptorSetsInfoKHR[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkBindDescriptorSetsInfoKHR(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
}
