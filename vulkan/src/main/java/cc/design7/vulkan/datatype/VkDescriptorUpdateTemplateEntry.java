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

public record VkDescriptorUpdateTemplateEntry(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$dstBinding = ValueLayout.JAVA_INT.withName("dstBinding");
    public static final OfInt LAYOUT$dstArrayElement = ValueLayout.JAVA_INT.withName("dstArrayElement");
    public static final OfInt LAYOUT$descriptorCount = ValueLayout.JAVA_INT.withName("descriptorCount");
    public static final OfInt LAYOUT$descriptorType = ValueLayout.JAVA_INT.withName("descriptorType");
    public static final ValueLayout LAYOUT$offset = NativeLayout.C_SIZE_T.withName("offset");
    public static final ValueLayout LAYOUT$stride = NativeLayout.C_SIZE_T.withName("stride");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$dstBinding, LAYOUT$dstArrayElement, LAYOUT$descriptorCount, LAYOUT$descriptorType, LAYOUT$offset, LAYOUT$stride);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkDescriptorUpdateTemplateEntry allocate(Arena arena) {
        return new VkDescriptorUpdateTemplateEntry(arena.allocate(LAYOUT));
    }

    public static VkDescriptorUpdateTemplateEntry[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkDescriptorUpdateTemplateEntry[] ret = new VkDescriptorUpdateTemplateEntry[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkDescriptorUpdateTemplateEntry(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkDescriptorUpdateTemplateEntry clone(Arena arena, VkDescriptorUpdateTemplateEntry src) {
        VkDescriptorUpdateTemplateEntry ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkDescriptorUpdateTemplateEntry[] clone(Arena arena, VkDescriptorUpdateTemplateEntry[] src) {
        VkDescriptorUpdateTemplateEntry[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$dstBinding = PathElement.groupElement("PATH$dstBinding");
    public static final PathElement PATH$dstArrayElement = PathElement.groupElement("PATH$dstArrayElement");
    public static final PathElement PATH$descriptorCount = PathElement.groupElement("PATH$descriptorCount");
    public static final PathElement PATH$descriptorType = PathElement.groupElement("PATH$descriptorType");
    public static final PathElement PATH$offset = PathElement.groupElement("PATH$offset");
    public static final PathElement PATH$stride = PathElement.groupElement("PATH$stride");

    public static final long SIZE$dstBinding = LAYOUT$dstBinding.byteSize();
    public static final long SIZE$dstArrayElement = LAYOUT$dstArrayElement.byteSize();
    public static final long SIZE$descriptorCount = LAYOUT$descriptorCount.byteSize();
    public static final long SIZE$descriptorType = LAYOUT$descriptorType.byteSize();
    public static final long SIZE$offset = NativeLayout.C_SIZE_T.byteSize();
    public static final long SIZE$stride = NativeLayout.C_SIZE_T.byteSize();

    public static final long OFFSET$dstBinding = LAYOUT.byteOffset(PATH$dstBinding);
    public static final long OFFSET$dstArrayElement = LAYOUT.byteOffset(PATH$dstArrayElement);
    public static final long OFFSET$descriptorCount = LAYOUT.byteOffset(PATH$descriptorCount);
    public static final long OFFSET$descriptorType = LAYOUT.byteOffset(PATH$descriptorType);
    public static final long OFFSET$offset = LAYOUT.byteOffset(PATH$offset);
    public static final long OFFSET$stride = LAYOUT.byteOffset(PATH$stride);

    public @unsigned int dstBinding() {
        return segment.get(LAYOUT$dstBinding, OFFSET$dstBinding);
    }

    public void dstBinding(@unsigned int value) {
        segment.set(LAYOUT$dstBinding, OFFSET$dstBinding, value);
    }

    public @unsigned int dstArrayElement() {
        return segment.get(LAYOUT$dstArrayElement, OFFSET$dstArrayElement);
    }

    public void dstArrayElement(@unsigned int value) {
        segment.set(LAYOUT$dstArrayElement, OFFSET$dstArrayElement, value);
    }

    public @unsigned int descriptorCount() {
        return segment.get(LAYOUT$descriptorCount, OFFSET$descriptorCount);
    }

    public void descriptorCount(@unsigned int value) {
        segment.set(LAYOUT$descriptorCount, OFFSET$descriptorCount, value);
    }

    public @enumtype(VkDescriptorType.class) int descriptorType() {
        return segment.get(LAYOUT$descriptorType, OFFSET$descriptorType);
    }

    public void descriptorType(@enumtype(VkDescriptorType.class) int value) {
        segment.set(LAYOUT$descriptorType, OFFSET$descriptorType, value);
    }

    public @unsigned long offset() {
        return NativeLayout.readCSizeT(segment, OFFSET$offset);
    }

    public void offset(@unsigned long value) {
        NativeLayout.writeCSizeT(segment, OFFSET$offset, value);
    }

    public @unsigned long stride() {
        return NativeLayout.readCSizeT(segment, OFFSET$stride);
    }

    public void stride(@unsigned long value) {
        NativeLayout.writeCSizeT(segment, OFFSET$stride, value);
    }

}
/// dummy, not implemented yet
