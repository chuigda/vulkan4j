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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkClearRect.html">VkClearRect</a>
@ValueBasedCandidate
public record VkClearRect(@NotNull MemorySegment segment) implements IPointer {
    public static final StructLayout LAYOUT$rect = VkRect2D.LAYOUT.withName("rect");
    public static final OfInt LAYOUT$baseArrayLayer = ValueLayout.JAVA_INT.withName("baseArrayLayer");
    public static final OfInt LAYOUT$layerCount = ValueLayout.JAVA_INT.withName("layerCount");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$rect, LAYOUT$baseArrayLayer, LAYOUT$layerCount);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkClearRect allocate(Arena arena) {
        return new VkClearRect(arena.allocate(LAYOUT));
    }

    public static VkClearRect[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkClearRect[] ret = new VkClearRect[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkClearRect(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkClearRect clone(Arena arena, VkClearRect src) {
        VkClearRect ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkClearRect[] clone(Arena arena, VkClearRect[] src) {
        VkClearRect[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$rect = PathElement.groupElement("PATH$rect");
    public static final PathElement PATH$baseArrayLayer = PathElement.groupElement("PATH$baseArrayLayer");
    public static final PathElement PATH$layerCount = PathElement.groupElement("PATH$layerCount");

    public static final long SIZE$rect = LAYOUT$rect.byteSize();
    public static final long SIZE$baseArrayLayer = LAYOUT$baseArrayLayer.byteSize();
    public static final long SIZE$layerCount = LAYOUT$layerCount.byteSize();

    public static final long OFFSET$rect = LAYOUT.byteOffset(PATH$rect);
    public static final long OFFSET$baseArrayLayer = LAYOUT.byteOffset(PATH$baseArrayLayer);
    public static final long OFFSET$layerCount = LAYOUT.byteOffset(PATH$layerCount);

    public VkRect2D rect() {
        return new VkRect2D(segment.asSlice(OFFSET$rect, LAYOUT$rect));
    }

    public void rect(VkRect2D value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$rect, SIZE$rect);
    }

    public @unsigned int baseArrayLayer() {
        return segment.get(LAYOUT$baseArrayLayer, OFFSET$baseArrayLayer);
    }

    public void baseArrayLayer(@unsigned int value) {
        segment.set(LAYOUT$baseArrayLayer, OFFSET$baseArrayLayer, value);
    }

    public @unsigned int layerCount() {
        return segment.get(LAYOUT$layerCount, OFFSET$layerCount);
    }

    public void layerCount(@unsigned int value) {
        segment.set(LAYOUT$layerCount, OFFSET$layerCount, value);
    }

}
