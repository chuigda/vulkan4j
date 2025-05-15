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

public record VkBindIndexBufferIndirectCommandNV(@NotNull MemorySegment segment) implements IPointer {
    public static final OfLong LAYOUT$bufferAddress = ValueLayout.JAVA_LONG.withName("bufferAddress");
    public static final OfInt LAYOUT$size = ValueLayout.JAVA_INT.withName("size");
    public static final OfInt LAYOUT$indexType = ValueLayout.JAVA_INT.withName("indexType");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$bufferAddress, LAYOUT$size, LAYOUT$indexType);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkBindIndexBufferIndirectCommandNV allocate(Arena arena) {
        return new VkBindIndexBufferIndirectCommandNV(arena.allocate(LAYOUT));
    }

    public static VkBindIndexBufferIndirectCommandNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkBindIndexBufferIndirectCommandNV[] ret = new VkBindIndexBufferIndirectCommandNV[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkBindIndexBufferIndirectCommandNV(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkBindIndexBufferIndirectCommandNV clone(Arena arena, VkBindIndexBufferIndirectCommandNV src) {
        VkBindIndexBufferIndirectCommandNV ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkBindIndexBufferIndirectCommandNV[] clone(Arena arena, VkBindIndexBufferIndirectCommandNV[] src) {
        VkBindIndexBufferIndirectCommandNV[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$bufferAddress = PathElement.groupElement("PATH$bufferAddress");
    public static final PathElement PATH$size = PathElement.groupElement("PATH$size");
    public static final PathElement PATH$indexType = PathElement.groupElement("PATH$indexType");

    public static final long SIZE$bufferAddress = LAYOUT$bufferAddress.byteSize();
    public static final long SIZE$size = LAYOUT$size.byteSize();
    public static final long SIZE$indexType = LAYOUT$indexType.byteSize();

    public static final long OFFSET$bufferAddress = LAYOUT.byteOffset(PATH$bufferAddress);
    public static final long OFFSET$size = LAYOUT.byteOffset(PATH$size);
    public static final long OFFSET$indexType = LAYOUT.byteOffset(PATH$indexType);

    public @unsigned long bufferAddress() {
        return segment.get(LAYOUT$bufferAddress, OFFSET$bufferAddress);
    }

    public void bufferAddress(@unsigned long value) {
        segment.set(LAYOUT$bufferAddress, OFFSET$bufferAddress, value);
    }

    public @unsigned int size() {
        return segment.get(LAYOUT$size, OFFSET$size);
    }

    public void size(@unsigned int value) {
        segment.set(LAYOUT$size, OFFSET$size, value);
    }

    public @enumtype(VkIndexType.class) int indexType() {
        return segment.get(LAYOUT$indexType, OFFSET$indexType);
    }

    public void indexType(@enumtype(VkIndexType.class) int value) {
        segment.set(LAYOUT$indexType, OFFSET$indexType, value);
    }

}
/// dummy, not implemented yet
