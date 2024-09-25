package tech.icey.vk4j.datatype;

import tech.icey.vk4j.NativeLayout;

import java.lang.foreign.*;

import static java.lang.foreign.ValueLayout.PathElement;

public record VkClearValue(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.unionLayout(
        VkClearColorValue.LAYOUT.withName("color"),
        VkClearDepthStencilValue.LAYOUT.withName("depthStencil")
    );

    public static final PathElement PATH$color = PathElement.groupElement("color");
    public static final PathElement PATH$depthStencil = PathElement.groupElement("depthStencil");

    public static final UnionLayout LAYOUT$color = (UnionLayout) LAYOUT.select(PATH$color);
    public static final StructLayout LAYOUT$depthStencil = (StructLayout) LAYOUT.select(PATH$depthStencil);

    public static final long OFFSET$color = LAYOUT.byteOffset(PATH$color);
    public static final long OFFSET$depthStencil = LAYOUT.byteOffset(PATH$depthStencil);

    public VkClearValue(MemorySegment segment) {
        this.segment = segment;
    }

    public VkClearColorValue color() {
        return new VkClearColorValue(segment.asSlice(OFFSET$color, LAYOUT$color));
    }

    public void color(VkClearColorValue value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$color, LAYOUT$color.byteSize());
    }

    public VkClearDepthStencilValue depthStencil() {
        return new VkClearDepthStencilValue(segment.asSlice(OFFSET$depthStencil, LAYOUT$depthStencil));
    }

    public void depthStencil(VkClearDepthStencilValue value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$depthStencil, LAYOUT$depthStencil.byteSize());
    }

    public static VkClearValue allocate(Arena arena) {
        return new VkClearValue(arena.allocate(LAYOUT));
    }

    public static VkClearValue[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkClearValue[] ret = new VkClearValue[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkClearValue(segment.asSlice(i * LAYOUT.byteSize(), LAYOUT.byteSize()));
        }
        return ret;
    }
}
