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
/// typedef struct VkMemoryHeap {
///     VkDeviceSize size;
///     VkMemoryHeapFlags flags;
/// } VkMemoryHeap;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkMemoryHeap.html">VkMemoryHeap</a>
public record VkMemoryHeap(MemorySegment segment) implements IPointer {
    public VkMemoryHeap(MemorySegment segment) {
        this.segment = segment;
    }

    public @unsigned long size() {
        return segment.get(LAYOUT$size, OFFSET$size);
    }

    public void size(@unsigned long value) {
        segment.set(LAYOUT$size, OFFSET$size, value);
    }

    public @enumtype(VkMemoryHeapFlags.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public void flags(@enumtype(VkMemoryHeapFlags.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
    }

    public static VkMemoryHeap allocate(Arena arena) {
        return new VkMemoryHeap(arena.allocate(LAYOUT));
    }

    public static VkMemoryHeap[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkMemoryHeap[] ret = new VkMemoryHeap[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkMemoryHeap(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkMemoryHeap clone(Arena arena, VkMemoryHeap src) {
        VkMemoryHeap ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkMemoryHeap[] clone(Arena arena, VkMemoryHeap[] src) {
        VkMemoryHeap[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_LONG.withName("size"),
        ValueLayout.JAVA_INT.withName("flags")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$size = PathElement.groupElement("size");
    public static final PathElement PATH$flags = PathElement.groupElement("flags");

    public static final OfLong LAYOUT$size = (OfLong) LAYOUT.select(PATH$size);
    public static final OfInt LAYOUT$flags = (OfInt) LAYOUT.select(PATH$flags);

    public static final long OFFSET$size = LAYOUT.byteOffset(PATH$size);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);

    public static final long SIZE$size = LAYOUT$size.byteSize();
    public static final long SIZE$flags = LAYOUT$flags.byteSize();
}
