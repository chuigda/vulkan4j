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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkClearValue.html">VkClearValue</a>
@ValueBasedCandidate
public record VkClearValue(@NotNull MemorySegment segment) implements IPointer {
    public static final StructLayout LAYOUT$color = VkClearColorValue.LAYOUT.withName("color");
    public static final StructLayout LAYOUT$depthStencil = VkClearDepthStencilValue.LAYOUT.withName("depthStencil");

    public static final MemoryLayout LAYOUT = NativeLayout.unionLayout(LAYOUT$color, LAYOUT$depthStencil);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkClearValue allocate(Arena arena) {
        return new VkClearValue(arena.allocate(LAYOUT));
    }

    public static VkClearValue[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkClearValue[] ret = new VkClearValue[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkClearValue(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkClearValue clone(Arena arena, VkClearValue src) {
        VkClearValue ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkClearValue[] clone(Arena arena, VkClearValue[] src) {
        VkClearValue[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$color = PathElement.groupElement("PATH$color");
    public static final PathElement PATH$depthStencil = PathElement.groupElement("PATH$depthStencil");

    public static final long SIZE$color = LAYOUT$color.byteSize();
    public static final long SIZE$depthStencil = LAYOUT$depthStencil.byteSize();

    public static final long OFFSET$color = LAYOUT.byteOffset(PATH$color);
    public static final long OFFSET$depthStencil = LAYOUT.byteOffset(PATH$depthStencil);

    public VkClearColorValue color() {
        return new VkClearColorValue(segment.asSlice(OFFSET$color, LAYOUT$color));
    }

    public void color(VkClearColorValue value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$color, SIZE$color);
    }

    public VkClearDepthStencilValue depthStencil() {
        return new VkClearDepthStencilValue(segment.asSlice(OFFSET$depthStencil, LAYOUT$depthStencil));
    }

    public void depthStencil(VkClearDepthStencilValue value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$depthStencil, SIZE$depthStencil);
    }

}
