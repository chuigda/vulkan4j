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
/// typedef struct VkBindVertexBufferIndirectCommandNV {
///     VkDeviceAddress bufferAddress;
///     uint32_t size;
///     uint32_t stride;
/// } VkBindVertexBufferIndirectCommandNV;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkBindVertexBufferIndirectCommandNV.html">VkBindVertexBufferIndirectCommandNV</a>
public record VkBindVertexBufferIndirectCommandNV(MemorySegment segment) implements IPointer {
    public VkBindVertexBufferIndirectCommandNV(MemorySegment segment) {
        this.segment = segment;
    }

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

    public static VkBindVertexBufferIndirectCommandNV allocate(Arena arena) {
        return new VkBindVertexBufferIndirectCommandNV(arena.allocate(LAYOUT));
    }

    public static VkBindVertexBufferIndirectCommandNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkBindVertexBufferIndirectCommandNV[] ret = new VkBindVertexBufferIndirectCommandNV[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkBindVertexBufferIndirectCommandNV(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkBindVertexBufferIndirectCommandNV clone(Arena arena, VkBindVertexBufferIndirectCommandNV src) {
        VkBindVertexBufferIndirectCommandNV ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkBindVertexBufferIndirectCommandNV[] clone(Arena arena, VkBindVertexBufferIndirectCommandNV[] src) {
        VkBindVertexBufferIndirectCommandNV[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_LONG.withName("bufferAddress"),
        ValueLayout.JAVA_INT.withName("size"),
        ValueLayout.JAVA_INT.withName("stride")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$bufferAddress = PathElement.groupElement("bufferAddress");
    public static final PathElement PATH$size = PathElement.groupElement("size");
    public static final PathElement PATH$stride = PathElement.groupElement("stride");

    public static final OfLong LAYOUT$bufferAddress = (OfLong) LAYOUT.select(PATH$bufferAddress);
    public static final OfInt LAYOUT$size = (OfInt) LAYOUT.select(PATH$size);
    public static final OfInt LAYOUT$stride = (OfInt) LAYOUT.select(PATH$stride);

    public static final long OFFSET$bufferAddress = LAYOUT.byteOffset(PATH$bufferAddress);
    public static final long OFFSET$size = LAYOUT.byteOffset(PATH$size);
    public static final long OFFSET$stride = LAYOUT.byteOffset(PATH$stride);

    public static final long SIZE$bufferAddress = LAYOUT$bufferAddress.byteSize();
    public static final long SIZE$size = LAYOUT$size.byteSize();
    public static final long SIZE$stride = LAYOUT$stride.byteSize();
}
