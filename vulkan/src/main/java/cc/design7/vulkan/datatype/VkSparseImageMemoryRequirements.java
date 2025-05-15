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

/// Represents a pointer to a {@code VkSparseImageMemoryRequirements} structure in native memory.
///
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to)
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkSparseImageMemoryRequirements.html">VkSparseImageMemoryRequirements</a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkSparseImageMemoryRequirements(@NotNull MemorySegment segment) implements IPointer {
    public static VkSparseImageMemoryRequirements allocate(Arena arena) {
        return new VkSparseImageMemoryRequirements(arena.allocate(LAYOUT));
    }

    public static VkSparseImageMemoryRequirements[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkSparseImageMemoryRequirements[] ret = new VkSparseImageMemoryRequirements[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkSparseImageMemoryRequirements(segment.asSlice(i * BYTES, BYTES));
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

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        VkSparseImageFormatProperties.LAYOUT.withName("formatProperties"),
        ValueLayout.JAVA_INT.withName("imageMipTailFirstLod"),
        ValueLayout.JAVA_LONG.withName("imageMipTailSize"),
        ValueLayout.JAVA_LONG.withName("imageMipTailOffset"),
        ValueLayout.JAVA_LONG.withName("imageMipTailStride")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$formatProperties = PathElement.groupElement("PATH$formatProperties");
    public static final PathElement PATH$imageMipTailFirstLod = PathElement.groupElement("PATH$imageMipTailFirstLod");
    public static final PathElement PATH$imageMipTailSize = PathElement.groupElement("PATH$imageMipTailSize");
    public static final PathElement PATH$imageMipTailOffset = PathElement.groupElement("PATH$imageMipTailOffset");
    public static final PathElement PATH$imageMipTailStride = PathElement.groupElement("PATH$imageMipTailStride");

    public static final StructLayout LAYOUT$formatProperties = (StructLayout) LAYOUT.select(PATH$formatProperties);
    public static final OfInt LAYOUT$imageMipTailFirstLod = (OfInt) LAYOUT.select(PATH$imageMipTailFirstLod);
    public static final OfLong LAYOUT$imageMipTailSize = (OfLong) LAYOUT.select(PATH$imageMipTailSize);
    public static final OfLong LAYOUT$imageMipTailOffset = (OfLong) LAYOUT.select(PATH$imageMipTailOffset);
    public static final OfLong LAYOUT$imageMipTailStride = (OfLong) LAYOUT.select(PATH$imageMipTailStride);

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
