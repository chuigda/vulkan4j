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

public record VmaAllocationCreateInfo(MemorySegment segment) implements IPointer {
    public @enumtype(VmaAllocationCreateFlags.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public void flags(@enumtype(VmaAllocationCreateFlags.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
    }

    public @enumtype(VmaMemoryUsage.class) int usage() {
        return segment.get(LAYOUT$usage, OFFSET$usage);
    }

    public void usage(@enumtype(VmaMemoryUsage.class) int value) {
        segment.set(LAYOUT$usage, OFFSET$usage, value);
    }

    public @enumtype(VkMemoryPropertyFlags.class) int requiredFlags() {
        return segment.get(LAYOUT$requiredFlags, OFFSET$requiredFlags);
    }

    public void requiredFlags(@enumtype(VkMemoryPropertyFlags.class) int value) {
        segment.set(LAYOUT$requiredFlags, OFFSET$requiredFlags, value);
    }

    public @enumtype(VkMemoryPropertyFlags.class) int preferredFlags() {
        return segment.get(LAYOUT$preferredFlags, OFFSET$preferredFlags);
    }

    public void preferredFlags(@enumtype(VkMemoryPropertyFlags.class) int value) {
        segment.set(LAYOUT$preferredFlags, OFFSET$preferredFlags, value);
    }

    public @unsigned int memoryTypeBits() {
        return segment.get(LAYOUT$memoryTypeBits, OFFSET$memoryTypeBits);
    }

    public void memoryTypeBits(@unsigned int value) {
        segment.set(LAYOUT$memoryTypeBits, OFFSET$memoryTypeBits, value);
    }

    public @nullable VmaPool pool() {
        MemorySegment s = segment.asSlice(OFFSET$pool, SIZE$pool);
        if (s.address() == 0) {
            return null;
        }
        return new VmaPool(s);
    }

    public void pool(@nullable VmaPool value) {
        segment.set(
            LAYOUT$pool,
            OFFSET$pool,
            value != null ? value.segment() : MemorySegment.NULL
        );
    }

    public @pointer(comment="void*") MemorySegment pUserData() {
        return segment.get(LAYOUT$pUserData, OFFSET$pUserData);
    }

    public void pUserData(@pointer(comment="void*") MemorySegment value) {
        segment.set(LAYOUT$pUserData, OFFSET$pUserData, value);
    }

    public void pUserData(IPointer pointer) {
        pUserData(pointer.segment());
    }

    public float priority() {
        return segment.get(LAYOUT$priority, OFFSET$priority);
    }

    public void priority(float value) {
        segment.set(LAYOUT$priority, OFFSET$priority, value);
    }

    public static VmaAllocationCreateInfo allocate(Arena arena) {
        return new VmaAllocationCreateInfo(arena.allocate(LAYOUT));
    }

    public static VmaAllocationCreateInfo[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VmaAllocationCreateInfo[] ret = new VmaAllocationCreateInfo[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VmaAllocationCreateInfo(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VmaAllocationCreateInfo clone(Arena arena, VmaAllocationCreateInfo src) {
        VmaAllocationCreateInfo ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VmaAllocationCreateInfo[] clone(Arena arena, VmaAllocationCreateInfo[] src) {
        VmaAllocationCreateInfo[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("usage"),
        ValueLayout.JAVA_INT.withName("requiredFlags"),
        ValueLayout.JAVA_INT.withName("preferredFlags"),
        ValueLayout.JAVA_INT.withName("memoryTypeBits"),
        ValueLayout.ADDRESS.withName("pool"),
        ValueLayout.ADDRESS.withName("pUserData"),
        ValueLayout.JAVA_FLOAT.withName("priority")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$flags = PathElement.groupElement("flags");
    public static final PathElement PATH$usage = PathElement.groupElement("usage");
    public static final PathElement PATH$requiredFlags = PathElement.groupElement("requiredFlags");
    public static final PathElement PATH$preferredFlags = PathElement.groupElement("preferredFlags");
    public static final PathElement PATH$memoryTypeBits = PathElement.groupElement("memoryTypeBits");
    public static final PathElement PATH$pool = PathElement.groupElement("pool");
    public static final PathElement PATH$pUserData = PathElement.groupElement("pUserData");
    public static final PathElement PATH$priority = PathElement.groupElement("priority");

    public static final OfInt LAYOUT$flags = (OfInt) LAYOUT.select(PATH$flags);
    public static final OfInt LAYOUT$usage = (OfInt) LAYOUT.select(PATH$usage);
    public static final OfInt LAYOUT$requiredFlags = (OfInt) LAYOUT.select(PATH$requiredFlags);
    public static final OfInt LAYOUT$preferredFlags = (OfInt) LAYOUT.select(PATH$preferredFlags);
    public static final OfInt LAYOUT$memoryTypeBits = (OfInt) LAYOUT.select(PATH$memoryTypeBits);
    public static final AddressLayout LAYOUT$pool = (AddressLayout) LAYOUT.select(PATH$pool);
    public static final AddressLayout LAYOUT$pUserData = (AddressLayout) LAYOUT.select(PATH$pUserData);
    public static final OfFloat LAYOUT$priority = (OfFloat) LAYOUT.select(PATH$priority);

    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$usage = LAYOUT.byteOffset(PATH$usage);
    public static final long OFFSET$requiredFlags = LAYOUT.byteOffset(PATH$requiredFlags);
    public static final long OFFSET$preferredFlags = LAYOUT.byteOffset(PATH$preferredFlags);
    public static final long OFFSET$memoryTypeBits = LAYOUT.byteOffset(PATH$memoryTypeBits);
    public static final long OFFSET$pool = LAYOUT.byteOffset(PATH$pool);
    public static final long OFFSET$pUserData = LAYOUT.byteOffset(PATH$pUserData);
    public static final long OFFSET$priority = LAYOUT.byteOffset(PATH$priority);

    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$usage = LAYOUT$usage.byteSize();
    public static final long SIZE$requiredFlags = LAYOUT$requiredFlags.byteSize();
    public static final long SIZE$preferredFlags = LAYOUT$preferredFlags.byteSize();
    public static final long SIZE$memoryTypeBits = LAYOUT$memoryTypeBits.byteSize();
    public static final long SIZE$pool = LAYOUT$pool.byteSize();
    public static final long SIZE$pUserData = LAYOUT$pUserData.byteSize();
    public static final long SIZE$priority = LAYOUT$priority.byteSize();
}

