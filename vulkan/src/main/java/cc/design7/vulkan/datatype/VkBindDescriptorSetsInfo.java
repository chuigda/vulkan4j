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

public record VkBindDescriptorSetsInfo(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$stageFlags = ValueLayout.JAVA_INT.withName("stageFlags");
    public static final AddressLayout LAYOUT$layout = ValueLayout.ADDRESS.withName("layout");
    public static final OfInt LAYOUT$firstSet = ValueLayout.JAVA_INT.withName("firstSet");
    public static final OfInt LAYOUT$descriptorSetCount = ValueLayout.JAVA_INT.withName("descriptorSetCount");
    public static final AddressLayout LAYOUT$pDescriptorSets = ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS).withName("pDescriptorSets");
    public static final OfInt LAYOUT$dynamicOffsetCount = ValueLayout.JAVA_INT.withName("dynamicOffsetCount");
    public static final AddressLayout LAYOUT$pDynamicOffsets = ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT).withName("pDynamicOffsets");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$stageFlags, LAYOUT$layout, LAYOUT$firstSet, LAYOUT$descriptorSetCount, LAYOUT$pDescriptorSets, LAYOUT$dynamicOffsetCount, LAYOUT$pDynamicOffsets);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkBindDescriptorSetsInfo allocate(Arena arena) {
        return new VkBindDescriptorSetsInfo(arena.allocate(LAYOUT));
    }

    public static VkBindDescriptorSetsInfo[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkBindDescriptorSetsInfo[] ret = new VkBindDescriptorSetsInfo[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkBindDescriptorSetsInfo(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkBindDescriptorSetsInfo clone(Arena arena, VkBindDescriptorSetsInfo src) {
        VkBindDescriptorSetsInfo ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkBindDescriptorSetsInfo[] clone(Arena arena, VkBindDescriptorSetsInfo[] src) {
        VkBindDescriptorSetsInfo[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$stageFlags = PathElement.groupElement("PATH$stageFlags");
    public static final PathElement PATH$layout = PathElement.groupElement("PATH$layout");
    public static final PathElement PATH$firstSet = PathElement.groupElement("PATH$firstSet");
    public static final PathElement PATH$descriptorSetCount = PathElement.groupElement("PATH$descriptorSetCount");
    public static final PathElement PATH$pDescriptorSets = PathElement.groupElement("PATH$pDescriptorSets");
    public static final PathElement PATH$dynamicOffsetCount = PathElement.groupElement("PATH$dynamicOffsetCount");
    public static final PathElement PATH$pDynamicOffsets = PathElement.groupElement("PATH$pDynamicOffsets");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$stageFlags = LAYOUT$stageFlags.byteSize();
    public static final long SIZE$layout = LAYOUT$layout.byteSize();
    public static final long SIZE$firstSet = LAYOUT$firstSet.byteSize();
    public static final long SIZE$descriptorSetCount = LAYOUT$descriptorSetCount.byteSize();
    public static final long SIZE$pDescriptorSets = LAYOUT$pDescriptorSets.byteSize();
    public static final long SIZE$dynamicOffsetCount = LAYOUT$dynamicOffsetCount.byteSize();
    public static final long SIZE$pDynamicOffsets = LAYOUT$pDynamicOffsets.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$stageFlags = LAYOUT.byteOffset(PATH$stageFlags);
    public static final long OFFSET$layout = LAYOUT.byteOffset(PATH$layout);
    public static final long OFFSET$firstSet = LAYOUT.byteOffset(PATH$firstSet);
    public static final long OFFSET$descriptorSetCount = LAYOUT.byteOffset(PATH$descriptorSetCount);
    public static final long OFFSET$pDescriptorSets = LAYOUT.byteOffset(PATH$pDescriptorSets);
    public static final long OFFSET$dynamicOffsetCount = LAYOUT.byteOffset(PATH$dynamicOffsetCount);
    public static final long OFFSET$pDynamicOffsets = LAYOUT.byteOffset(PATH$pDynamicOffsets);

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

    public @Nullable VkPipelineLayout layout() {
        MemorySegment s = segment.asSlice(OFFSET$layout, SIZE$layout);
        if (s.address() == 0) {
            return null;
        }
        return new VkPipelineLayout(s);
    }

    public void layout() {
        segment.set(LAYOUT$layout, OFFSET$layout, value != null ? value.segment() : MemorySegment.NULL);
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

    public @pointer(comment="VkDescriptorSet*") MemorySegment pDescriptorSetsRaw() {
        return segment.get(LAYOUT$pDescriptorSets, OFFSET$pDescriptorSets);
    }

    public void pDescriptorSetsRaw(@pointer(comment="VkDescriptorSet*") MemorySegment value) {
        segment.set(LAYOUT$pDescriptorSets, OFFSET$pDescriptorSets, value);
    }

    /// Note: the returned {@link VkDescriptorSet.Buffer} does not have correct {@link VkDescriptorSet.Buffer#size}
    /// property. It's up to user to track the size of the buffer, and use
    /// {@link VkDescriptorSet.Buffer#reinterpret} to set the size before actually reading from or writing to the
    /// buffer.
    public @Nullable VkDescriptorSet.Buffer pDescriptorSets() {
        MemorySegment s = pDescriptorSetsRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkDescriptorSet.Buffer(s);
    }


    public @unsigned int dynamicOffsetCount() {
        return segment.get(LAYOUT$dynamicOffsetCount, OFFSET$dynamicOffsetCount);
    }

    public void dynamicOffsetCount(@unsigned int value) {
        segment.set(LAYOUT$dynamicOffsetCount, OFFSET$dynamicOffsetCount, value);
    }

    public @pointer(comment="int*") MemorySegment pDynamicOffsetsRaw() {
        return segment.get(LAYOUT$pDynamicOffsets, OFFSET$pDynamicOffsets);
    }

    public void pDynamicOffsetsRaw(@pointer(comment="int*") MemorySegment value) {
        segment.set(LAYOUT$pDynamicOffsets, OFFSET$pDynamicOffsets, value);
    }

    /// Note: the returned {@link IntPtr} does not have correct
    /// {@link IntPtr#size} property. It's up to user to track the size of the buffer,
    /// and use {@link IntPtr#reinterpret} to set the size before actually reading from or
    /// writing to the buffer.
    public @Nullable @unsigned IntPtr pDynamicOffsets() {
        MemorySegment s = pDynamicOffsetsRaw();
        if (s.address() == 0) {
            return null;
        }
        return new IntPtr(s);
    }

    public void pDynamicOffsets(@Nullable @unsigned IntPtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pDynamicOffsetsRaw(s);
    }

}
/// dummy, not implemented yet
