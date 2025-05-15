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

public record VkPipelineLayoutCreateInfo(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$flags = ValueLayout.JAVA_INT.withName("flags");
    public static final OfInt LAYOUT$setLayoutCount = ValueLayout.JAVA_INT.withName("setLayoutCount");
    public static final AddressLayout LAYOUT$pSetLayouts = ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS).withName("pSetLayouts");
    public static final OfInt LAYOUT$pushConstantRangeCount = ValueLayout.JAVA_INT.withName("pushConstantRangeCount");
    public static final AddressLayout LAYOUT$pPushConstantRanges = ValueLayout.ADDRESS.withTargetLayout(VkPushConstantRange.LAYOUT).withName("pPushConstantRanges");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$flags, LAYOUT$setLayoutCount, LAYOUT$pSetLayouts, LAYOUT$pushConstantRangeCount, LAYOUT$pPushConstantRanges);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkPipelineLayoutCreateInfo allocate(Arena arena) {
        return new VkPipelineLayoutCreateInfo(arena.allocate(LAYOUT));
    }

    public static VkPipelineLayoutCreateInfo[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPipelineLayoutCreateInfo[] ret = new VkPipelineLayoutCreateInfo[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPipelineLayoutCreateInfo(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPipelineLayoutCreateInfo clone(Arena arena, VkPipelineLayoutCreateInfo src) {
        VkPipelineLayoutCreateInfo ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPipelineLayoutCreateInfo[] clone(Arena arena, VkPipelineLayoutCreateInfo[] src) {
        VkPipelineLayoutCreateInfo[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$flags = PathElement.groupElement("PATH$flags");
    public static final PathElement PATH$setLayoutCount = PathElement.groupElement("PATH$setLayoutCount");
    public static final PathElement PATH$pSetLayouts = PathElement.groupElement("PATH$pSetLayouts");
    public static final PathElement PATH$pushConstantRangeCount = PathElement.groupElement("PATH$pushConstantRangeCount");
    public static final PathElement PATH$pPushConstantRanges = PathElement.groupElement("PATH$pPushConstantRanges");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$setLayoutCount = LAYOUT$setLayoutCount.byteSize();
    public static final long SIZE$pSetLayouts = LAYOUT$pSetLayouts.byteSize();
    public static final long SIZE$pushConstantRangeCount = LAYOUT$pushConstantRangeCount.byteSize();
    public static final long SIZE$pPushConstantRanges = LAYOUT$pPushConstantRanges.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$setLayoutCount = LAYOUT.byteOffset(PATH$setLayoutCount);
    public static final long OFFSET$pSetLayouts = LAYOUT.byteOffset(PATH$pSetLayouts);
    public static final long OFFSET$pushConstantRangeCount = LAYOUT.byteOffset(PATH$pushConstantRangeCount);
    public static final long OFFSET$pPushConstantRanges = LAYOUT.byteOffset(PATH$pPushConstantRanges);

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

    public @enumtype(VkPipelineLayoutCreateFlags.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public void flags(@enumtype(VkPipelineLayoutCreateFlags.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
    }

    public @unsigned int setLayoutCount() {
        return segment.get(LAYOUT$setLayoutCount, OFFSET$setLayoutCount);
    }

    public void setLayoutCount(@unsigned int value) {
        segment.set(LAYOUT$setLayoutCount, OFFSET$setLayoutCount, value);
    }

    public @pointer(comment="VkDescriptorSetLayout*") MemorySegment pSetLayoutsRaw() {
        return segment.get(LAYOUT$pSetLayouts, OFFSET$pSetLayouts);
    }

    public void pSetLayoutsRaw(@pointer(comment="VkDescriptorSetLayout*") MemorySegment value) {
        segment.set(LAYOUT$pSetLayouts, OFFSET$pSetLayouts, value);
    }

    /// Note: the returned {@link VkDescriptorSetLayout.Buffer} does not have correct {@link VkDescriptorSetLayout.Buffer#size}
    /// property. It's up to user to track the size of the buffer, and use
    /// {@link VkDescriptorSetLayout.Buffer#reinterpret} to set the size before actually reading from or writing to the
    /// buffer.
    public @Nullable VkDescriptorSetLayout.Buffer pSetLayouts() {
        MemorySegment s = pSetLayoutsRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkDescriptorSetLayout.Buffer(s);
    }


    public @unsigned int pushConstantRangeCount() {
        return segment.get(LAYOUT$pushConstantRangeCount, OFFSET$pushConstantRangeCount);
    }

    public void pushConstantRangeCount(@unsigned int value) {
        segment.set(LAYOUT$pushConstantRangeCount, OFFSET$pushConstantRangeCount, value);
    }

    public @pointer(comment="VkPushConstantRange*") MemorySegment pPushConstantRangesRaw() {
        return segment.get(LAYOUT$pPushConstantRanges, OFFSET$pPushConstantRanges);
    }

    public void pPushConstantRangesRaw(@pointer(comment="VkPushConstantRange*") MemorySegment value) {
        segment.set(LAYOUT$pPushConstantRanges, OFFSET$pPushConstantRanges, value);
    }

    public @Nullable VkPushConstantRange pPushConstantRanges() {
        MemorySegment s = pPushConstantRangesRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkPushConstantRange(s);
    }

    public void pPushConstantRanges(@Nullable VkPushConstantRange value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pPushConstantRangesRaw(s);
    }

    @unsafe public @Nullable VkPushConstantRange[] pPushConstantRanges(int assumedCount) {
        MemorySegment s = pPushConstantRangesRaw();
        if (s.address() == 0) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkPushConstantRange.SIZE);
        VkPushConstantRange[] ret = new VkPushConstantRange[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkPushConstantRange(s.asSlice(i * VkPushConstantRange.SIZE, VkPushConstantRange.SIZE));
        }
        return ret;
    }

}
/// dummy, not implemented yet
