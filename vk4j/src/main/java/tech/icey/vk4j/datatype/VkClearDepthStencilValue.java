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

/// {@snippet lang=c :
/// typedef struct VkClearDepthStencilValue {
///     float depth;
///     uint32_t stencil;
/// } VkClearDepthStencilValue;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkClearDepthStencilValue.html">VkClearDepthStencilValue</a>
public record VkClearDepthStencilValue(MemorySegment segment) implements IPointer {
    public VkClearDepthStencilValue(MemorySegment segment) {
        this.segment = segment;
    }

    public float depth() {
        return segment.get(LAYOUT$depth, OFFSET$depth);
    }

    public void depth(float value) {
        segment.set(LAYOUT$depth, OFFSET$depth, value);
    }

    public @unsigned int stencil() {
        return segment.get(LAYOUT$stencil, OFFSET$stencil);
    }

    public void stencil(@unsigned int value) {
        segment.set(LAYOUT$stencil, OFFSET$stencil, value);
    }

    public static VkClearDepthStencilValue allocate(Arena arena) {
        return new VkClearDepthStencilValue(arena.allocate(LAYOUT));
    }
    
    public static VkClearDepthStencilValue[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkClearDepthStencilValue[] ret = new VkClearDepthStencilValue[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkClearDepthStencilValue(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
    
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_FLOAT.withName("depth"),
        ValueLayout.JAVA_INT.withName("stencil")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$depth = PathElement.groupElement("depth");
    public static final PathElement PATH$stencil = PathElement.groupElement("stencil");

    public static final OfFloat LAYOUT$depth = (OfFloat) LAYOUT.select(PATH$depth);
    public static final OfInt LAYOUT$stencil = (OfInt) LAYOUT.select(PATH$stencil);

    public static final long OFFSET$depth = LAYOUT.byteOffset(PATH$depth);
    public static final long OFFSET$stencil = LAYOUT.byteOffset(PATH$stencil);

    public static final long SIZE$depth = LAYOUT$depth.byteSize();
    public static final long SIZE$stencil = LAYOUT$stencil.byteSize();

}
