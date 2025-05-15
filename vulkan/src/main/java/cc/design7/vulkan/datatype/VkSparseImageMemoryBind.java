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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkSparseImageMemoryBind.html">VkSparseImageMemoryBind</a>
@ValueBasedCandidate
public record VkSparseImageMemoryBind(@NotNull MemorySegment segment) implements IPointer {
    public static final StructLayout LAYOUT$subresource = VkImageSubresource.LAYOUT.withName("subresource");
    public static final StructLayout LAYOUT$offset = VkOffset3D.LAYOUT.withName("offset");
    public static final StructLayout LAYOUT$extent = VkExtent3D.LAYOUT.withName("extent");
    public static final AddressLayout LAYOUT$memory = ValueLayout.ADDRESS.withName("memory");
    public static final OfLong LAYOUT$memoryOffset = ValueLayout.JAVA_LONG.withName("memoryOffset");
    public static final OfInt LAYOUT$flags = ValueLayout.JAVA_INT.withName("flags");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$subresource, LAYOUT$offset, LAYOUT$extent, LAYOUT$memory, LAYOUT$memoryOffset, LAYOUT$flags);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkSparseImageMemoryBind allocate(Arena arena) {
        return new VkSparseImageMemoryBind(arena.allocate(LAYOUT));
    }

    public static VkSparseImageMemoryBind[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkSparseImageMemoryBind[] ret = new VkSparseImageMemoryBind[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkSparseImageMemoryBind(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkSparseImageMemoryBind clone(Arena arena, VkSparseImageMemoryBind src) {
        VkSparseImageMemoryBind ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkSparseImageMemoryBind[] clone(Arena arena, VkSparseImageMemoryBind[] src) {
        VkSparseImageMemoryBind[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$subresource = PathElement.groupElement("PATH$subresource");
    public static final PathElement PATH$offset = PathElement.groupElement("PATH$offset");
    public static final PathElement PATH$extent = PathElement.groupElement("PATH$extent");
    public static final PathElement PATH$memory = PathElement.groupElement("PATH$memory");
    public static final PathElement PATH$memoryOffset = PathElement.groupElement("PATH$memoryOffset");
    public static final PathElement PATH$flags = PathElement.groupElement("PATH$flags");

    public static final long SIZE$subresource = LAYOUT$subresource.byteSize();
    public static final long SIZE$offset = LAYOUT$offset.byteSize();
    public static final long SIZE$extent = LAYOUT$extent.byteSize();
    public static final long SIZE$memory = LAYOUT$memory.byteSize();
    public static final long SIZE$memoryOffset = LAYOUT$memoryOffset.byteSize();
    public static final long SIZE$flags = LAYOUT$flags.byteSize();

    public static final long OFFSET$subresource = LAYOUT.byteOffset(PATH$subresource);
    public static final long OFFSET$offset = LAYOUT.byteOffset(PATH$offset);
    public static final long OFFSET$extent = LAYOUT.byteOffset(PATH$extent);
    public static final long OFFSET$memory = LAYOUT.byteOffset(PATH$memory);
    public static final long OFFSET$memoryOffset = LAYOUT.byteOffset(PATH$memoryOffset);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);

    public VkImageSubresource subresource() {
        return new VkImageSubresource(segment.asSlice(OFFSET$subresource, LAYOUT$subresource));
    }

    public void subresource(VkImageSubresource value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$subresource, SIZE$subresource);
    }

    public VkOffset3D offset() {
        return new VkOffset3D(segment.asSlice(OFFSET$offset, LAYOUT$offset));
    }

    public void offset(VkOffset3D value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$offset, SIZE$offset);
    }

    public VkExtent3D extent() {
        return new VkExtent3D(segment.asSlice(OFFSET$extent, LAYOUT$extent));
    }

    public void extent(VkExtent3D value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$extent, SIZE$extent);
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
