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
/// typedef struct VkMultiDrawIndexedInfoEXT {
///     uint32_t firstIndex;
///     uint32_t indexCount;
///     int32_t vertexOffset;
/// } VkMultiDrawIndexedInfoEXT;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkMultiDrawIndexedInfoEXT.html">VkMultiDrawIndexedInfoEXT</a>
public record VkMultiDrawIndexedInfoEXT(MemorySegment segment) implements IPointer {
    public VkMultiDrawIndexedInfoEXT(MemorySegment segment) {
        this.segment = segment;
    }

    public @unsigned int firstIndex() {
        return segment.get(LAYOUT$firstIndex, OFFSET$firstIndex);
    }

    public void firstIndex(@unsigned int value) {
        segment.set(LAYOUT$firstIndex, OFFSET$firstIndex, value);
    }

    public @unsigned int indexCount() {
        return segment.get(LAYOUT$indexCount, OFFSET$indexCount);
    }

    public void indexCount(@unsigned int value) {
        segment.set(LAYOUT$indexCount, OFFSET$indexCount, value);
    }

    public int vertexOffset() {
        return segment.get(LAYOUT$vertexOffset, OFFSET$vertexOffset);
    }

    public void vertexOffset(int value) {
        segment.set(LAYOUT$vertexOffset, OFFSET$vertexOffset, value);
    }

    public static VkMultiDrawIndexedInfoEXT allocate(Arena arena) {
        return new VkMultiDrawIndexedInfoEXT(arena.allocate(LAYOUT));
    }

    public static VkMultiDrawIndexedInfoEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkMultiDrawIndexedInfoEXT[] ret = new VkMultiDrawIndexedInfoEXT[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkMultiDrawIndexedInfoEXT(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkMultiDrawIndexedInfoEXT clone(Arena arena, VkMultiDrawIndexedInfoEXT src) {
        VkMultiDrawIndexedInfoEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkMultiDrawIndexedInfoEXT[] clone(Arena arena, VkMultiDrawIndexedInfoEXT[] src) {
        VkMultiDrawIndexedInfoEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("firstIndex"),
        ValueLayout.JAVA_INT.withName("indexCount"),
        ValueLayout.JAVA_INT.withName("vertexOffset")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$firstIndex = PathElement.groupElement("firstIndex");
    public static final PathElement PATH$indexCount = PathElement.groupElement("indexCount");
    public static final PathElement PATH$vertexOffset = PathElement.groupElement("vertexOffset");

    public static final OfInt LAYOUT$firstIndex = (OfInt) LAYOUT.select(PATH$firstIndex);
    public static final OfInt LAYOUT$indexCount = (OfInt) LAYOUT.select(PATH$indexCount);
    public static final OfInt LAYOUT$vertexOffset = (OfInt) LAYOUT.select(PATH$vertexOffset);

    public static final long OFFSET$firstIndex = LAYOUT.byteOffset(PATH$firstIndex);
    public static final long OFFSET$indexCount = LAYOUT.byteOffset(PATH$indexCount);
    public static final long OFFSET$vertexOffset = LAYOUT.byteOffset(PATH$vertexOffset);

    public static final long SIZE$firstIndex = LAYOUT$firstIndex.byteSize();
    public static final long SIZE$indexCount = LAYOUT$indexCount.byteSize();
    public static final long SIZE$vertexOffset = LAYOUT$vertexOffset.byteSize();
}
