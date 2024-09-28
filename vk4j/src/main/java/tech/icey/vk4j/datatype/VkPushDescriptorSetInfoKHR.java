package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.IPointer;
import tech.icey.vk4j.annotation.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.buffer.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import tech.icey.vk4j.NativeLayout;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

public record VkPushDescriptorSetInfoKHR(MemorySegment segment) implements IPointer {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("stageFlags"),
        ValueLayout.ADDRESS.withName("layout"),
        ValueLayout.JAVA_INT.withName("set"),
        ValueLayout.JAVA_INT.withName("descriptorWriteCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkWriteDescriptorSet.LAYOUT).withName("pDescriptorWrites")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$stageFlags = PathElement.groupElement("stageFlags");
    public static final PathElement PATH$layout = PathElement.groupElement("layout");
    public static final PathElement PATH$set = PathElement.groupElement("set");
    public static final PathElement PATH$descriptorWriteCount = PathElement.groupElement("descriptorWriteCount");
    public static final PathElement PATH$pDescriptorWrites = PathElement.groupElement("pDescriptorWrites");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$stageFlags = (OfInt) LAYOUT.select(PATH$stageFlags);
    public static final AddressLayout LAYOUT$layout = (AddressLayout) LAYOUT.select(PATH$layout);
    public static final OfInt LAYOUT$set = (OfInt) LAYOUT.select(PATH$set);
    public static final OfInt LAYOUT$descriptorWriteCount = (OfInt) LAYOUT.select(PATH$descriptorWriteCount);
    public static final AddressLayout LAYOUT$pDescriptorWrites = (AddressLayout) LAYOUT.select(PATH$pDescriptorWrites);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$stageFlags = LAYOUT.byteOffset(PATH$stageFlags);
    public static final long OFFSET$layout = LAYOUT.byteOffset(PATH$layout);
    public static final long OFFSET$set = LAYOUT.byteOffset(PATH$set);
    public static final long OFFSET$descriptorWriteCount = LAYOUT.byteOffset(PATH$descriptorWriteCount);
    public static final long OFFSET$pDescriptorWrites = LAYOUT.byteOffset(PATH$pDescriptorWrites);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$stageFlags = LAYOUT$stageFlags.byteSize();
    public static final long SIZE$layout = LAYOUT$layout.byteSize();
    public static final long SIZE$set = LAYOUT$set.byteSize();
    public static final long SIZE$descriptorWriteCount = LAYOUT$descriptorWriteCount.byteSize();
    public static final long SIZE$pDescriptorWrites = LAYOUT$pDescriptorWrites.byteSize();

    public VkPushDescriptorSetInfoKHR(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PUSH_DESCRIPTOR_SET_INFO_KHR);
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

    public void pNext(IPointer pointer) {
        pNext(pointer.segment());
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

    public @unsigned int set() {
        return segment.get(LAYOUT$set, OFFSET$set);
    }

    public void set(@unsigned int value) {
        segment.set(LAYOUT$set, OFFSET$set, value);
    }

    public @unsigned int descriptorWriteCount() {
        return segment.get(LAYOUT$descriptorWriteCount, OFFSET$descriptorWriteCount);
    }

    public void descriptorWriteCount(@unsigned int value) {
        segment.set(LAYOUT$descriptorWriteCount, OFFSET$descriptorWriteCount, value);
    }

    public @pointer(comment="VkWriteDescriptorSet*") MemorySegment pDescriptorWritesRaw() {
        return segment.get(LAYOUT$pDescriptorWrites, OFFSET$pDescriptorWrites);
    }

    public void pDescriptorWritesRaw(@pointer(comment="VkWriteDescriptorSet*") MemorySegment value) {
        segment.set(LAYOUT$pDescriptorWrites, OFFSET$pDescriptorWrites, value);
    }
    
    public @nullable VkWriteDescriptorSet pDescriptorWrites() {
        MemorySegment s = pDescriptorWritesRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkWriteDescriptorSet(s);
    }

    @unsafe
    public @nullable VkWriteDescriptorSet[] pDescriptorWrites(int assumedCount) {
        MemorySegment s = pDescriptorWritesRaw().reinterpret(assumedCount * VkWriteDescriptorSet.SIZE);
        VkWriteDescriptorSet[] arr = new VkWriteDescriptorSet[assumedCount];
        for (int i = 0; i < assumedCount; i++) {
            arr[i] = new VkWriteDescriptorSet(s.asSlice(i * VkWriteDescriptorSet.SIZE, VkWriteDescriptorSet.SIZE));
        }
        return arr;
    }

    public void pDescriptorWrites(@nullable VkWriteDescriptorSet value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pDescriptorWritesRaw(s);
    }

    public static VkPushDescriptorSetInfoKHR allocate(Arena arena) {
        return new VkPushDescriptorSetInfoKHR(arena.allocate(LAYOUT));
    }
    
    public static VkPushDescriptorSetInfoKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPushDescriptorSetInfoKHR[] ret = new VkPushDescriptorSetInfoKHR[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkPushDescriptorSetInfoKHR(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
}
