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
/// typedef struct VkCopyMemoryIndirectCommandNV {
///     VkDeviceAddress srcAddress;
///     VkDeviceAddress dstAddress;
///     VkDeviceSize size;
/// } VkCopyMemoryIndirectCommandNV;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkCopyMemoryIndirectCommandNV.html">VkCopyMemoryIndirectCommandNV</a>
public record VkCopyMemoryIndirectCommandNV(MemorySegment segment) implements IPointer {
    public VkCopyMemoryIndirectCommandNV(MemorySegment segment) {
        this.segment = segment;
    }

    public @unsigned long srcAddress() {
        return segment.get(LAYOUT$srcAddress, OFFSET$srcAddress);
    }

    public void srcAddress(@unsigned long value) {
        segment.set(LAYOUT$srcAddress, OFFSET$srcAddress, value);
    }

    public @unsigned long dstAddress() {
        return segment.get(LAYOUT$dstAddress, OFFSET$dstAddress);
    }

    public void dstAddress(@unsigned long value) {
        segment.set(LAYOUT$dstAddress, OFFSET$dstAddress, value);
    }

    public @unsigned long size() {
        return segment.get(LAYOUT$size, OFFSET$size);
    }

    public void size(@unsigned long value) {
        segment.set(LAYOUT$size, OFFSET$size, value);
    }

    public static VkCopyMemoryIndirectCommandNV allocate(Arena arena) {
        return new VkCopyMemoryIndirectCommandNV(arena.allocate(LAYOUT));
    }

    public static VkCopyMemoryIndirectCommandNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkCopyMemoryIndirectCommandNV[] ret = new VkCopyMemoryIndirectCommandNV[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkCopyMemoryIndirectCommandNV(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkCopyMemoryIndirectCommandNV clone(Arena arena, VkCopyMemoryIndirectCommandNV src) {
        VkCopyMemoryIndirectCommandNV ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkCopyMemoryIndirectCommandNV[] clone(Arena arena, VkCopyMemoryIndirectCommandNV[] src) {
        VkCopyMemoryIndirectCommandNV[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_LONG.withName("srcAddress"),
        ValueLayout.JAVA_LONG.withName("dstAddress"),
        ValueLayout.JAVA_LONG.withName("size")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$srcAddress = PathElement.groupElement("srcAddress");
    public static final PathElement PATH$dstAddress = PathElement.groupElement("dstAddress");
    public static final PathElement PATH$size = PathElement.groupElement("size");

    public static final OfLong LAYOUT$srcAddress = (OfLong) LAYOUT.select(PATH$srcAddress);
    public static final OfLong LAYOUT$dstAddress = (OfLong) LAYOUT.select(PATH$dstAddress);
    public static final OfLong LAYOUT$size = (OfLong) LAYOUT.select(PATH$size);

    public static final long OFFSET$srcAddress = LAYOUT.byteOffset(PATH$srcAddress);
    public static final long OFFSET$dstAddress = LAYOUT.byteOffset(PATH$dstAddress);
    public static final long OFFSET$size = LAYOUT.byteOffset(PATH$size);

    public static final long SIZE$srcAddress = LAYOUT$srcAddress.byteSize();
    public static final long SIZE$dstAddress = LAYOUT$dstAddress.byteSize();
    public static final long SIZE$size = LAYOUT$size.byteSize();
}
