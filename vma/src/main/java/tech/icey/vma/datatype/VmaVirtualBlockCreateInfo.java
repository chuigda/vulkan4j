package tech.icey.vma.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.panama.IPointer;
import tech.icey.panama.NativeLayout;
import tech.icey.panama.annotation.*;
import tech.icey.panama.buffer.*;
import tech.icey.vma.bitmask.*;
import tech.icey.vma.datatype.*;
import tech.icey.vma.enumtype.*;
import tech.icey.vma.handle.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.handle.*;

public record VmaVirtualBlockCreateInfo(MemorySegment segment) implements IPointer {
    public @unsigned long size() {
        return segment.get(LAYOUT$size, OFFSET$size);
    }

    public void size(@unsigned long value) {
        segment.set(LAYOUT$size, OFFSET$size, value);
    }

    public @enumtype(VmaVirtualBlockCreateFlags.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public void flags(@enumtype(VmaVirtualBlockCreateFlags.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
    }

    public @pointer(comment="VkAllocationCallbacks*") MemorySegment pAllocationCallbacksRaw() {
        return segment.get(LAYOUT$pAllocationCallbacks, OFFSET$pAllocationCallbacks);
    }

    public void pAllocationCallbacksRaw(@pointer(comment="VkAllocationCallbacks*") MemorySegment value) {
        segment.set(LAYOUT$pAllocationCallbacks, OFFSET$pAllocationCallbacks, value);
    }

    public @nullable VkAllocationCallbacks pAllocationCallbacks() {
        MemorySegment s = pAllocationCallbacksRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkAllocationCallbacks(s);
    }

    /// Note: this function is {@link unsafe} because it's up to caller to provide the correct count of elements.
    @unsafe
    public @nullable VkAllocationCallbacks[] pAllocationCallbacks(int assumedCount) {
        MemorySegment s = pAllocationCallbacksRaw();
        if (s.address() == 0) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkAllocationCallbacks.SIZE);
        VkAllocationCallbacks[] ret = new VkAllocationCallbacks[assumedCount];
        for (int i = 0; i < assumedCount; i++) {
            ret[i] = new VkAllocationCallbacks(s.asSlice(i * VkAllocationCallbacks.SIZE, VkAllocationCallbacks.SIZE));
        }
        return ret;
    }

    public void pAllocationCallbacks(@nullable VkAllocationCallbacks value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pAllocationCallbacksRaw(s);
    }

    public static VmaVirtualBlockCreateInfo allocate(Arena arena) {
        return new VmaVirtualBlockCreateInfo(arena.allocate(LAYOUT));
    }

    public static VmaVirtualBlockCreateInfo[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VmaVirtualBlockCreateInfo[] ret = new VmaVirtualBlockCreateInfo[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VmaVirtualBlockCreateInfo(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VmaVirtualBlockCreateInfo clone(Arena arena, VmaVirtualBlockCreateInfo src) {
        VmaVirtualBlockCreateInfo ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VmaVirtualBlockCreateInfo[] clone(Arena arena, VmaVirtualBlockCreateInfo[] src) {
        VmaVirtualBlockCreateInfo[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_LONG.withName("size"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT).withName("pAllocationCallbacks")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$size = PathElement.groupElement("size");
    public static final PathElement PATH$flags = PathElement.groupElement("flags");
    public static final PathElement PATH$pAllocationCallbacks = PathElement.groupElement("pAllocationCallbacks");

    public static final OfLong LAYOUT$size = (OfLong) LAYOUT.select(PATH$size);
    public static final OfInt LAYOUT$flags = (OfInt) LAYOUT.select(PATH$flags);
    public static final AddressLayout LAYOUT$pAllocationCallbacks = (AddressLayout) LAYOUT.select(PATH$pAllocationCallbacks);

    public static final long OFFSET$size = LAYOUT.byteOffset(PATH$size);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$pAllocationCallbacks = LAYOUT.byteOffset(PATH$pAllocationCallbacks);

    public static final long SIZE$size = LAYOUT$size.byteSize();
    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$pAllocationCallbacks = LAYOUT$pAllocationCallbacks.byteSize();
}

