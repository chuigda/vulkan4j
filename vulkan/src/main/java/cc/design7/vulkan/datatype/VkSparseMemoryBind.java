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

public record VkSparseMemoryBind(@NotNull MemorySegment segment) implements IPointer {
    public static final OfLong LAYOUT$resourceOffset = ValueLayout.JAVA_LONG.withName("resourceOffset");
    public static final OfLong LAYOUT$size = ValueLayout.JAVA_LONG.withName("size");
    public static final AddressLayout LAYOUT$memory = ValueLayout.ADDRESS.withName("memory");
    public static final OfLong LAYOUT$memoryOffset = ValueLayout.JAVA_LONG.withName("memoryOffset");
    public static final OfInt LAYOUT$flags = ValueLayout.JAVA_INT.withName("flags");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$resourceOffset, LAYOUT$size, LAYOUT$memory, LAYOUT$memoryOffset, LAYOUT$flags);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkSparseMemoryBind allocate(Arena arena) {
        return new VkSparseMemoryBind(arena.allocate(LAYOUT));
    }

    public static VkSparseMemoryBind[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkSparseMemoryBind[] ret = new VkSparseMemoryBind[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkSparseMemoryBind(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkSparseMemoryBind clone(Arena arena, VkSparseMemoryBind src) {
        VkSparseMemoryBind ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkSparseMemoryBind[] clone(Arena arena, VkSparseMemoryBind[] src) {
        VkSparseMemoryBind[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$resourceOffset = PathElement.groupElement("PATH$resourceOffset");
    public static final PathElement PATH$size = PathElement.groupElement("PATH$size");
    public static final PathElement PATH$memory = PathElement.groupElement("PATH$memory");
    public static final PathElement PATH$memoryOffset = PathElement.groupElement("PATH$memoryOffset");
    public static final PathElement PATH$flags = PathElement.groupElement("PATH$flags");

    public static final long SIZE$resourceOffset = LAYOUT$resourceOffset.byteSize();
    public static final long SIZE$size = LAYOUT$size.byteSize();
    public static final long SIZE$memory = LAYOUT$memory.byteSize();
    public static final long SIZE$memoryOffset = LAYOUT$memoryOffset.byteSize();
    public static final long SIZE$flags = LAYOUT$flags.byteSize();

    public static final long OFFSET$resourceOffset = LAYOUT.byteOffset(PATH$resourceOffset);
    public static final long OFFSET$size = LAYOUT.byteOffset(PATH$size);
    public static final long OFFSET$memory = LAYOUT.byteOffset(PATH$memory);
    public static final long OFFSET$memoryOffset = LAYOUT.byteOffset(PATH$memoryOffset);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);

    public @unsigned long resourceOffset() {
        return segment.get(LAYOUT$resourceOffset, OFFSET$resourceOffset);
    }

    public void resourceOffset(@unsigned long value) {
        segment.set(LAYOUT$resourceOffset, OFFSET$resourceOffset, value);
    }

    public @unsigned long size() {
        return segment.get(LAYOUT$size, OFFSET$size);
    }

    public void size(@unsigned long value) {
        segment.set(LAYOUT$size, OFFSET$size, value);
    }

    public @Nullable VkDeviceMemory memory() {
        MemorySegment s = segment.asSlice(OFFSET$memory, SIZE$memory);
        if (s.address() == 0) {
            return null;
        }
        return new VkDeviceMemory(s);
    }

    public void memory() {
        segment.set(LAYOUT$memory, OFFSET$memory, value != null ? value.segment() : MemorySegment.NULL);
    }

    public @unsigned long memoryOffset() {
        return segment.get(LAYOUT$memoryOffset, OFFSET$memoryOffset);
    }

    public void memoryOffset(@unsigned long value) {
        segment.set(LAYOUT$memoryOffset, OFFSET$memoryOffset, value);
    }

    public @enumtype(VkSparseMemoryBindFlags.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public void flags(@enumtype(VkSparseMemoryBindFlags.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
    }

}
/// dummy, not implemented yet
