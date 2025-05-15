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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkDescriptorBufferInfo.html">VkDescriptorBufferInfo</a>
@ValueBasedCandidate
public record VkDescriptorBufferInfo(@NotNull MemorySegment segment) implements IPointer {
    public static final AddressLayout LAYOUT$buffer = ValueLayout.ADDRESS.withName("buffer");
    public static final OfLong LAYOUT$offset = ValueLayout.JAVA_LONG.withName("offset");
    public static final OfLong LAYOUT$range = ValueLayout.JAVA_LONG.withName("range");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$buffer, LAYOUT$offset, LAYOUT$range);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkDescriptorBufferInfo allocate(Arena arena) {
        return new VkDescriptorBufferInfo(arena.allocate(LAYOUT));
    }

    public static VkDescriptorBufferInfo[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkDescriptorBufferInfo[] ret = new VkDescriptorBufferInfo[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkDescriptorBufferInfo(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkDescriptorBufferInfo clone(Arena arena, VkDescriptorBufferInfo src) {
        VkDescriptorBufferInfo ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkDescriptorBufferInfo[] clone(Arena arena, VkDescriptorBufferInfo[] src) {
        VkDescriptorBufferInfo[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$buffer = PathElement.groupElement("PATH$buffer");
    public static final PathElement PATH$offset = PathElement.groupElement("PATH$offset");
    public static final PathElement PATH$range = PathElement.groupElement("PATH$range");

    public static final long SIZE$buffer = LAYOUT$buffer.byteSize();
    public static final long SIZE$offset = LAYOUT$offset.byteSize();
    public static final long SIZE$range = LAYOUT$range.byteSize();

    public static final long OFFSET$buffer = LAYOUT.byteOffset(PATH$buffer);
    public static final long OFFSET$offset = LAYOUT.byteOffset(PATH$offset);
    public static final long OFFSET$range = LAYOUT.byteOffset(PATH$range);

    public @Nullable VkBuffer buffer() {
        MemorySegment s = segment.asSlice(OFFSET$buffer, SIZE$buffer);
        if (s.address() == 0) {
            return null;
        }
        return new VkBuffer(s);
    }

    public void buffer() {
        segment.set(LAYOUT$buffer, OFFSET$buffer, value != null ? value.segment() : MemorySegment.NULL);
    }

    public @unsigned long offset() {
        return segment.get(LAYOUT$offset, OFFSET$offset);
    }

    public void offset(@unsigned long value) {
        segment.set(LAYOUT$offset, OFFSET$offset, value);
    }

    public @unsigned long range() {
        return segment.get(LAYOUT$range, OFFSET$range);
    }

    public void range(@unsigned long value) {
        segment.set(LAYOUT$range, OFFSET$range, value);
    }

}
