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
/// typedef struct VkMemoryType {
///     VkMemoryPropertyFlags propertyFlags;
///     uint32_t heapIndex;
/// } VkMemoryType;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkMemoryType.html">VkMemoryType</a>
public record VkMemoryType(MemorySegment segment) implements IPointer {
    public VkMemoryType(MemorySegment segment) {
        this.segment = segment;
    }

    public @enumtype(VkMemoryPropertyFlags.class) int propertyFlags() {
        return segment.get(LAYOUT$propertyFlags, OFFSET$propertyFlags);
    }

    public void propertyFlags(@enumtype(VkMemoryPropertyFlags.class) int value) {
        segment.set(LAYOUT$propertyFlags, OFFSET$propertyFlags, value);
    }

    public @unsigned int heapIndex() {
        return segment.get(LAYOUT$heapIndex, OFFSET$heapIndex);
    }

    public void heapIndex(@unsigned int value) {
        segment.set(LAYOUT$heapIndex, OFFSET$heapIndex, value);
    }

    public static VkMemoryType allocate(Arena arena) {
        return new VkMemoryType(arena.allocate(LAYOUT));
    }
    
    public static VkMemoryType[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkMemoryType[] ret = new VkMemoryType[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkMemoryType(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
    
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("propertyFlags"),
        ValueLayout.JAVA_INT.withName("heapIndex")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$propertyFlags = PathElement.groupElement("propertyFlags");
    public static final PathElement PATH$heapIndex = PathElement.groupElement("heapIndex");

    public static final OfInt LAYOUT$propertyFlags = (OfInt) LAYOUT.select(PATH$propertyFlags);
    public static final OfInt LAYOUT$heapIndex = (OfInt) LAYOUT.select(PATH$heapIndex);

    public static final long OFFSET$propertyFlags = LAYOUT.byteOffset(PATH$propertyFlags);
    public static final long OFFSET$heapIndex = LAYOUT.byteOffset(PATH$heapIndex);

    public static final long SIZE$propertyFlags = LAYOUT$propertyFlags.byteSize();
    public static final long SIZE$heapIndex = LAYOUT$heapIndex.byteSize();
}
