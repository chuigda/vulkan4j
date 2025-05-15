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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkSparseImageMemoryRequirements.html">VkSparseImageMemoryRequirements</a>
@ValueBasedCandidate
public record VkSparseImageMemoryRequirements(@NotNull MemorySegment segment) implements IPointer {
    public static final StructLayout LAYOUT$formatProperties = VkSparseImageFormatProperties.LAYOUT.withName("formatProperties");
    public static final OfInt LAYOUT$imageMipTailFirstLod = ValueLayout.JAVA_INT.withName("imageMipTailFirstLod");
    public static final OfLong LAYOUT$imageMipTailSize = ValueLayout.JAVA_LONG.withName("imageMipTailSize");
    public static final OfLong LAYOUT$imageMipTailOffset = ValueLayout.JAVA_LONG.withName("imageMipTailOffset");
    public static final OfLong LAYOUT$imageMipTailStride = ValueLayout.JAVA_LONG.withName("imageMipTailStride");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$formatProperties, LAYOUT$imageMipTailFirstLod, LAYOUT$imageMipTailSize, LAYOUT$imageMipTailOffset, LAYOUT$imageMipTailStride);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkSparseImageMemoryRequirements allocate(Arena arena) {
        return new VkSparseImageMemoryRequirements(arena.allocate(LAYOUT));
    }

    public static VkSparseImageMemoryRequirements[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkSparseImageMemoryRequirements[] ret = new VkSparseImageMemoryRequirements[count];
        for (int i = 0; i < count; i ++) {
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
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$formatProperties = PathElement.groupElement("PATH$formatProperties");
    public static final PathElement PATH$imageMipTailFirstLod = PathElement.groupElement("PATH$imageMipTailFirstLod");
    public static final PathElement PATH$imageMipTailSize = PathElement.groupElement("PATH$imageMipTailSize");
    public static final PathElement PATH$imageMipTailOffset = PathElement.groupElement("PATH$imageMipTailOffset");
    public static final PathElement PATH$imageMipTailStride = PathElement.groupElement("PATH$imageMipTailStride");

    public static final long SIZE$formatProperties = LAYOUT$formatProperties.byteSize();
    public static final long SIZE$imageMipTailFirstLod = LAYOUT$imageMipTailFirstLod.byteSize();
    public static final long SIZE$imageMipTailSize = LAYOUT$imageMipTailSize.byteSize();
    public static final long SIZE$imageMipTailOffset = LAYOUT$imageMipTailOffset.byteSize();
    public static final long SIZE$imageMipTailStride = LAYOUT$imageMipTailStride.byteSize();

    public static final long OFFSET$formatProperties = LAYOUT.byteOffset(PATH$formatProperties);
    public static final long OFFSET$imageMipTailFirstLod = LAYOUT.byteOffset(PATH$imageMipTailFirstLod);
    public static final long OFFSET$imageMipTailSize = LAYOUT.byteOffset(PATH$imageMipTailSize);
    public static final long OFFSET$imageMipTailOffset = LAYOUT.byteOffset(PATH$imageMipTailOffset);
    public static final long OFFSET$imageMipTailStride = LAYOUT.byteOffset(PATH$imageMipTailStride);

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

}
