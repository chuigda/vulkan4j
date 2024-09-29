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
/// typedef struct VkRectLayerKHR {
///     VkOffset2D offset;
///     VkExtent2D extent;
///     uint32_t layer;
/// } VkRectLayerKHR;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkRectLayerKHR.html">VkRectLayerKHR</a>
public record VkRectLayerKHR(MemorySegment segment) implements IPointer {
    public VkRectLayerKHR(MemorySegment segment) {
        this.segment = segment;
    }

    public VkOffset2D offset() {
        return new VkOffset2D(segment.asSlice(OFFSET$offset, LAYOUT$offset));
    }

    public void offset(VkOffset2D value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$offset, SIZE$offset);
    }

    public VkExtent2D extent() {
        return new VkExtent2D(segment.asSlice(OFFSET$extent, LAYOUT$extent));
    }

    public void extent(VkExtent2D value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$extent, SIZE$extent);
    }

    public @unsigned int layer() {
        return segment.get(LAYOUT$layer, OFFSET$layer);
    }

    public void layer(@unsigned int value) {
        segment.set(LAYOUT$layer, OFFSET$layer, value);
    }

    public static VkRectLayerKHR allocate(Arena arena) {
        return new VkRectLayerKHR(arena.allocate(LAYOUT));
    }
    
    public static VkRectLayerKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkRectLayerKHR[] ret = new VkRectLayerKHR[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkRectLayerKHR(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkRectLayerKHR clone(Arena arena, VkRectLayerKHR src) {
        VkRectLayerKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkRectLayerKHR[] clone(Arena arena, VkRectLayerKHR[] src) {
        VkRectLayerKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        VkOffset2D.LAYOUT.withName("offset"),
        VkExtent2D.LAYOUT.withName("extent"),
        ValueLayout.JAVA_INT.withName("layer")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$offset = PathElement.groupElement("offset");
    public static final PathElement PATH$extent = PathElement.groupElement("extent");
    public static final PathElement PATH$layer = PathElement.groupElement("layer");

    public static final StructLayout LAYOUT$offset = (StructLayout) LAYOUT.select(PATH$offset);
    public static final StructLayout LAYOUT$extent = (StructLayout) LAYOUT.select(PATH$extent);
    public static final OfInt LAYOUT$layer = (OfInt) LAYOUT.select(PATH$layer);

    public static final long OFFSET$offset = LAYOUT.byteOffset(PATH$offset);
    public static final long OFFSET$extent = LAYOUT.byteOffset(PATH$extent);
    public static final long OFFSET$layer = LAYOUT.byteOffset(PATH$layer);

    public static final long SIZE$offset = LAYOUT$offset.byteSize();
    public static final long SIZE$extent = LAYOUT$extent.byteSize();
    public static final long SIZE$layer = LAYOUT$layer.byteSize();
}
