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
/// typedef struct VkIndirectCommandsStreamNV {
///     VkBuffer buffer;
///     VkDeviceSize offset;
/// } VkIndirectCommandsStreamNV;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkIndirectCommandsStreamNV.html">VkIndirectCommandsStreamNV</a>
public record VkIndirectCommandsStreamNV(MemorySegment segment) implements IPointer {
    public VkIndirectCommandsStreamNV(MemorySegment segment) {
        this.segment = segment;
    }

    public @Nullable VkBuffer buffer() {
        MemorySegment s = segment.get(LAYOUT$buffer, OFFSET$buffer);
        if (s.address() == 0) {
            return null;
        }
        return new VkBuffer(s);
    }

    public void buffer(@Nullable VkBuffer value) {
        segment.set(
            LAYOUT$buffer,
            OFFSET$buffer,
            value != null ? value.segment() : MemorySegment.NULL
        );
    }

    public @unsigned long offset() {
        return segment.get(LAYOUT$offset, OFFSET$offset);
    }

    public void offset(@unsigned long value) {
        segment.set(LAYOUT$offset, OFFSET$offset, value);
    }

    public static VkIndirectCommandsStreamNV allocate(Arena arena) {
        return new VkIndirectCommandsStreamNV(arena.allocate(LAYOUT));
    }

    public static VkIndirectCommandsStreamNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkIndirectCommandsStreamNV[] ret = new VkIndirectCommandsStreamNV[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkIndirectCommandsStreamNV(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkIndirectCommandsStreamNV clone(Arena arena, VkIndirectCommandsStreamNV src) {
        VkIndirectCommandsStreamNV ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkIndirectCommandsStreamNV[] clone(Arena arena, VkIndirectCommandsStreamNV[] src) {
        VkIndirectCommandsStreamNV[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.ADDRESS.withName("buffer"),
        ValueLayout.JAVA_LONG.withName("offset")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$buffer = PathElement.groupElement("buffer");
    public static final PathElement PATH$offset = PathElement.groupElement("offset");

    public static final AddressLayout LAYOUT$buffer = (AddressLayout) LAYOUT.select(PATH$buffer);
    public static final OfLong LAYOUT$offset = (OfLong) LAYOUT.select(PATH$offset);

    public static final long OFFSET$buffer = LAYOUT.byteOffset(PATH$buffer);
    public static final long OFFSET$offset = LAYOUT.byteOffset(PATH$offset);

    public static final long SIZE$buffer = LAYOUT$buffer.byteSize();
    public static final long SIZE$offset = LAYOUT$offset.byteSize();
}
