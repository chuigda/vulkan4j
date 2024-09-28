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

public record VkSetDescriptorBufferOffsetsInfoEXT(MemorySegment segment) implements IPointer {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("stageFlags"),
        ValueLayout.ADDRESS.withName("layout"),
        ValueLayout.JAVA_INT.withName("firstSet"),
        ValueLayout.JAVA_INT.withName("setCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT).withName("pBufferIndices"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_LONG).withName("pOffsets")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$stageFlags = PathElement.groupElement("stageFlags");
    public static final PathElement PATH$layout = PathElement.groupElement("layout");
    public static final PathElement PATH$firstSet = PathElement.groupElement("firstSet");
    public static final PathElement PATH$setCount = PathElement.groupElement("setCount");
    public static final PathElement PATH$pBufferIndices = PathElement.groupElement("pBufferIndices");
    public static final PathElement PATH$pOffsets = PathElement.groupElement("pOffsets");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$stageFlags = (OfInt) LAYOUT.select(PATH$stageFlags);
    public static final AddressLayout LAYOUT$layout = (AddressLayout) LAYOUT.select(PATH$layout);
    public static final OfInt LAYOUT$firstSet = (OfInt) LAYOUT.select(PATH$firstSet);
    public static final OfInt LAYOUT$setCount = (OfInt) LAYOUT.select(PATH$setCount);
    public static final AddressLayout LAYOUT$pBufferIndices = (AddressLayout) LAYOUT.select(PATH$pBufferIndices);
    public static final AddressLayout LAYOUT$pOffsets = (AddressLayout) LAYOUT.select(PATH$pOffsets);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$stageFlags = LAYOUT.byteOffset(PATH$stageFlags);
    public static final long OFFSET$layout = LAYOUT.byteOffset(PATH$layout);
    public static final long OFFSET$firstSet = LAYOUT.byteOffset(PATH$firstSet);
    public static final long OFFSET$setCount = LAYOUT.byteOffset(PATH$setCount);
    public static final long OFFSET$pBufferIndices = LAYOUT.byteOffset(PATH$pBufferIndices);
    public static final long OFFSET$pOffsets = LAYOUT.byteOffset(PATH$pOffsets);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$stageFlags = LAYOUT$stageFlags.byteSize();
    public static final long SIZE$layout = LAYOUT$layout.byteSize();
    public static final long SIZE$firstSet = LAYOUT$firstSet.byteSize();
    public static final long SIZE$setCount = LAYOUT$setCount.byteSize();
    public static final long SIZE$pBufferIndices = LAYOUT$pBufferIndices.byteSize();
    public static final long SIZE$pOffsets = LAYOUT$pOffsets.byteSize();

    public VkSetDescriptorBufferOffsetsInfoEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_SET_DESCRIPTOR_BUFFER_OFFSETS_INFO_EXT);
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

    public @unsigned int firstSet() {
        return segment.get(LAYOUT$firstSet, OFFSET$firstSet);
    }

    public void firstSet(@unsigned int value) {
        segment.set(LAYOUT$firstSet, OFFSET$firstSet, value);
    }

    public @unsigned int setCount() {
        return segment.get(LAYOUT$setCount, OFFSET$setCount);
    }

    public void setCount(@unsigned int value) {
        segment.set(LAYOUT$setCount, OFFSET$setCount, value);
    }

    public @pointer(comment="uint32_t*") MemorySegment pBufferIndicesRaw() {
        return segment.get(LAYOUT$pBufferIndices, OFFSET$pBufferIndices);
    }

    public void pBufferIndicesRaw(@pointer(comment="uint32_t*") MemorySegment value) {
        segment.set(LAYOUT$pBufferIndices, OFFSET$pBufferIndices, value);
    }

    /// Note: the returned {@link IntBuffer} does not have correct
    /// {@link IntBuffer#size} property. It's up to user to track the size of the buffer,
    /// and use {@link IntBuffer#reinterpret} to set the size before actually
    /// {@link IntBuffer#read}ing or
    /// {@link IntBuffer#write}ing the buffer.
    public @nullable @unsigned IntBuffer pBufferIndices() {
        MemorySegment s = pBufferIndicesRaw();
        return s.address() == 0 ? null : new IntBuffer(s);
    }

    public void pBufferIndices(@nullable @unsigned IntBuffer value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pBufferIndicesRaw(s);
    }

    public @pointer(comment="uint64_t*") MemorySegment pOffsetsRaw() {
        return segment.get(LAYOUT$pOffsets, OFFSET$pOffsets);
    }

    public void pOffsetsRaw(@pointer(comment="uint64_t*") MemorySegment value) {
        segment.set(LAYOUT$pOffsets, OFFSET$pOffsets, value);
    }

    /// Note: the returned {@link LongBuffer} does not have correct
    /// {@link LongBuffer#size} property. It's up to user to track the size of the buffer,
    /// and use {@link LongBuffer#reinterpret} to set the size before actually
    /// {@link LongBuffer#read}ing or
    /// {@link LongBuffer#write}ing the buffer.
    public @nullable @unsigned LongBuffer pOffsets() {
        MemorySegment s = pOffsetsRaw();
        return s.address() == 0 ? null : new LongBuffer(s);
    }

    public void pOffsets(@nullable @unsigned LongBuffer value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pOffsetsRaw(s);
    }

    public static VkSetDescriptorBufferOffsetsInfoEXT allocate(Arena arena) {
        return new VkSetDescriptorBufferOffsetsInfoEXT(arena.allocate(LAYOUT));
    }
    
    public static VkSetDescriptorBufferOffsetsInfoEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkSetDescriptorBufferOffsetsInfoEXT[] ret = new VkSetDescriptorBufferOffsetsInfoEXT[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkSetDescriptorBufferOffsetsInfoEXT(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
}
