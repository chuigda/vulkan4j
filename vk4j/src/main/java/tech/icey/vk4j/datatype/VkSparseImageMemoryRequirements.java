package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import org.jetbrains.annotations.Nullable;
import tech.icey.panama.IPointer;
import tech.icey.panama.NativeLayout;
import tech.icey.panama.annotation.*;
import tech.icey.panama.buffer.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

/// {@snippet lang=c :
/// typedef struct VkSparseImageMemoryRequirements {
///     VkSparseImageFormatProperties formatProperties;
///     uint32_t imageMipTailFirstLod;
///     VkDeviceSize imageMipTailSize;
///     VkDeviceSize imageMipTailOffset;
///     VkDeviceSize imageMipTailStride;
/// } VkSparseImageMemoryRequirements;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkSparseImageMemoryRequirements.html">VkSparseImageMemoryRequirements</a>
public record VkSparseImageMemoryRequirements(MemorySegment segment) implements IPointer {
    public VkSparseImageMemoryRequirements(MemorySegment segment) {
        this.segment = segment;
    }

    public VkSparseImageFormatProperties formatProperties() {
        return new VkSparseImageFormatProperties(segment.asSlice(OFFSET$formatProperties, LAYOUT$formatProperties));
    }

    public void formatProperties(VkSparseImageFormatProperties value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$formatProperties, SIZE$formatProperties);
    }

    public @unsigned int imageMipTailFirstLod() {
        return segment.get(LAYOUT$imageMipTailFirstLod, OFFSET$imageMipTailFirstLod);
    }

    public void imageMipTailFirstLod(@unsigned int value) {
        segment.set(LAYOUT$imageMipTailFirstLod, OFFSET$imageMipTailFirstLod, value);
    }

    public @unsigned long imageMipTailSize() {
        return segment.get(LAYOUT$imageMipTailSize, OFFSET$imageMipTailSize);
    }

    public void imageMipTailSize(@unsigned long value) {
        segment.set(LAYOUT$imageMipTailSize, OFFSET$imageMipTailSize, value);
    }

    public @unsigned long imageMipTailOffset() {
        return segment.get(LAYOUT$imageMipTailOffset, OFFSET$imageMipTailOffset);
    }

    public void imageMipTailOffset(@unsigned long value) {
        segment.set(LAYOUT$imageMipTailOffset, OFFSET$imageMipTailOffset, value);
    }

    public @unsigned long imageMipTailStride() {
        return segment.get(LAYOUT$imageMipTailStride, OFFSET$imageMipTailStride);
    }

    public void imageMipTailStride(@unsigned long value) {
        segment.set(LAYOUT$imageMipTailStride, OFFSET$imageMipTailStride, value);
    }

    public static VkSparseImageMemoryRequirements allocate(Arena arena) {
        return new VkSparseImageMemoryRequirements(arena.allocate(LAYOUT));
    }

    public static VkSparseImageMemoryRequirements[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkSparseImageMemoryRequirements[] ret = new VkSparseImageMemoryRequirements[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkSparseImageMemoryRequirements(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkSparseImageMemoryRequirements clone(Arena arena, VkSparseImageMemoryRequirements src) {
        VkSparseImageMemoryRequirements ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkSparseImageMemoryRequirements[] clone(Arena arena, VkSparseImageMemoryRequirements[] src) {
        VkSparseImageMemoryRequirements[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        VkSparseImageFormatProperties.LAYOUT.withName("formatProperties"),
        ValueLayout.JAVA_INT.withName("imageMipTailFirstLod"),
        ValueLayout.JAVA_LONG.withName("imageMipTailSize"),
        ValueLayout.JAVA_LONG.withName("imageMipTailOffset"),
        ValueLayout.JAVA_LONG.withName("imageMipTailStride")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$formatProperties = PathElement.groupElement("formatProperties");
    public static final PathElement PATH$imageMipTailFirstLod = PathElement.groupElement("imageMipTailFirstLod");
    public static final PathElement PATH$imageMipTailSize = PathElement.groupElement("imageMipTailSize");
    public static final PathElement PATH$imageMipTailOffset = PathElement.groupElement("imageMipTailOffset");
    public static final PathElement PATH$imageMipTailStride = PathElement.groupElement("imageMipTailStride");

    public static final StructLayout LAYOUT$formatProperties = (StructLayout) LAYOUT.select(PATH$formatProperties);
    public static final OfInt LAYOUT$imageMipTailFirstLod = (OfInt) LAYOUT.select(PATH$imageMipTailFirstLod);
    public static final OfLong LAYOUT$imageMipTailSize = (OfLong) LAYOUT.select(PATH$imageMipTailSize);
    public static final OfLong LAYOUT$imageMipTailOffset = (OfLong) LAYOUT.select(PATH$imageMipTailOffset);
    public static final OfLong LAYOUT$imageMipTailStride = (OfLong) LAYOUT.select(PATH$imageMipTailStride);

    public static final long OFFSET$formatProperties = LAYOUT.byteOffset(PATH$formatProperties);
    public static final long OFFSET$imageMipTailFirstLod = LAYOUT.byteOffset(PATH$imageMipTailFirstLod);
    public static final long OFFSET$imageMipTailSize = LAYOUT.byteOffset(PATH$imageMipTailSize);
    public static final long OFFSET$imageMipTailOffset = LAYOUT.byteOffset(PATH$imageMipTailOffset);
    public static final long OFFSET$imageMipTailStride = LAYOUT.byteOffset(PATH$imageMipTailStride);

    public static final long SIZE$formatProperties = LAYOUT$formatProperties.byteSize();
    public static final long SIZE$imageMipTailFirstLod = LAYOUT$imageMipTailFirstLod.byteSize();
    public static final long SIZE$imageMipTailSize = LAYOUT$imageMipTailSize.byteSize();
    public static final long SIZE$imageMipTailOffset = LAYOUT$imageMipTailOffset.byteSize();
    public static final long SIZE$imageMipTailStride = LAYOUT$imageMipTailStride.byteSize();
}
