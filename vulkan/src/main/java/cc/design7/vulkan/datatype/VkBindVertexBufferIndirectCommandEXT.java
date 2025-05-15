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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkBindVertexBufferIndirectCommandEXT.html">VkBindVertexBufferIndirectCommandEXT</a>
@ValueBasedCandidate
public record VkBindVertexBufferIndirectCommandEXT(@NotNull MemorySegment segment) implements IPointer {
    public static final OfLong LAYOUT$bufferAddress = ValueLayout.JAVA_LONG.withName("bufferAddress");
    public static final OfInt LAYOUT$size = ValueLayout.JAVA_INT.withName("size");
    public static final OfInt LAYOUT$stride = ValueLayout.JAVA_INT.withName("stride");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$bufferAddress, LAYOUT$size, LAYOUT$stride);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkBindVertexBufferIndirectCommandEXT allocate(Arena arena) {
        return new VkBindVertexBufferIndirectCommandEXT(arena.allocate(LAYOUT));
    }

    public static VkBindVertexBufferIndirectCommandEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkBindVertexBufferIndirectCommandEXT[] ret = new VkBindVertexBufferIndirectCommandEXT[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkBindVertexBufferIndirectCommandEXT(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkBindVertexBufferIndirectCommandEXT clone(Arena arena, VkBindVertexBufferIndirectCommandEXT src) {
        VkBindVertexBufferIndirectCommandEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkBindVertexBufferIndirectCommandEXT[] clone(Arena arena, VkBindVertexBufferIndirectCommandEXT[] src) {
        VkBindVertexBufferIndirectCommandEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$bufferAddress = PathElement.groupElement("PATH$bufferAddress");
    public static final PathElement PATH$size = PathElement.groupElement("PATH$size");
    public static final PathElement PATH$stride = PathElement.groupElement("PATH$stride");

    public static final long SIZE$bufferAddress = LAYOUT$bufferAddress.byteSize();
    public static final long SIZE$size = LAYOUT$size.byteSize();
    public static final long SIZE$stride = LAYOUT$stride.byteSize();

    public static final long OFFSET$bufferAddress = LAYOUT.byteOffset(PATH$bufferAddress);
    public static final long OFFSET$size = LAYOUT.byteOffset(PATH$size);
    public static final long OFFSET$stride = LAYOUT.byteOffset(PATH$stride);

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

    public @unsigned int stride() {
        return segment.get(LAYOUT$stride, OFFSET$stride);
    }

    public void stride(@unsigned int value) {
        segment.set(LAYOUT$stride, OFFSET$stride, value);
    }

}
