package tech.icey.vma.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import org.jetbrains.annotations.Nullable;
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
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;

public record VmaAllocationInfo(MemorySegment segment) implements IPointer {
    public @unsigned int memoryType() {
        return segment.get(LAYOUT$memoryType, OFFSET$memoryType);
    }

    public void memoryType(@unsigned int value) {
        segment.set(LAYOUT$memoryType, OFFSET$memoryType, value);
    }

    public @Nullable VkDeviceMemory deviceMemory() {
        MemorySegment s = segment.asSlice(OFFSET$deviceMemory, SIZE$deviceMemory);
        if (s.address() == 0) {
            return null;
        }
        return new VkDeviceMemory(s);
    }

    public void deviceMemory(@Nullable VkDeviceMemory value) {
        segment.set(
            LAYOUT$deviceMemory,
            OFFSET$deviceMemory,
            value != null ? value.segment() : MemorySegment.NULL
        );
    }

    public @unsigned long offset() {
        return segment.get(LAYOUT$offset, OFFSET$offset);
    }

    public void offset(@unsigned long value) {
        segment.set(LAYOUT$offset, OFFSET$offset, value);
    }

    public @unsigned long size() {
        return segment.get(LAYOUT$size, OFFSET$size);
    }

    public void size(@unsigned long value) {
        segment.set(LAYOUT$size, OFFSET$size, value);
    }

    public @pointer(comment="void*") MemorySegment pMappedData() {
        return segment.get(LAYOUT$pMappedData, OFFSET$pMappedData);
    }

    public void pMappedData(@pointer(comment="void*") MemorySegment value) {
        segment.set(LAYOUT$pMappedData, OFFSET$pMappedData, value);
    }

    public void pMappedData(IPointer pointer) {
        pMappedData(pointer.segment());
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

    public @pointer(comment="byte*") MemorySegment pNameRaw() {
        return segment.get(LAYOUT$pName, OFFSET$pName);
    }

    public void pNameRaw(@pointer(comment="byte*") MemorySegment value) {
        segment.set(LAYOUT$pName, OFFSET$pName, value);
    }

    /// Note: the returned {@link ByteBuffer} does not have correct 
    /// {@link ByteBuffer#size} property. It's up to user to track the size of the buffer,
    /// and use {@link ByteBuffer#reinterpret} to set the size before actually reading from or
    /// writing to the buffer.
    public @Nullable ByteBuffer pName() {
        MemorySegment s = pNameRaw();
        if (s.address() == 0) {
            return null;
        }
        return new ByteBuffer(s);
    }

    public void pName(@Nullable ByteBuffer value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pNameRaw(s);
    }

    public static VmaAllocationInfo allocate(Arena arena) {
        return new VmaAllocationInfo(arena.allocate(LAYOUT));
    }

    public static VmaAllocationInfo[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VmaAllocationInfo[] ret = new VmaAllocationInfo[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VmaAllocationInfo(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VmaAllocationInfo clone(Arena arena, VmaAllocationInfo src) {
        VmaAllocationInfo ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VmaAllocationInfo[] clone(Arena arena, VmaAllocationInfo[] src) {
        VmaAllocationInfo[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("memoryType"),
        ValueLayout.ADDRESS.withName("deviceMemory"),
        ValueLayout.JAVA_LONG.withName("offset"),
        ValueLayout.JAVA_LONG.withName("size"),
        ValueLayout.ADDRESS.withName("pMappedData"),
        ValueLayout.ADDRESS.withName("pUserData"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE).withName("pName")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$memoryType = PathElement.groupElement("memoryType");
    public static final PathElement PATH$deviceMemory = PathElement.groupElement("deviceMemory");
    public static final PathElement PATH$offset = PathElement.groupElement("offset");
    public static final PathElement PATH$size = PathElement.groupElement("size");
    public static final PathElement PATH$pMappedData = PathElement.groupElement("pMappedData");
    public static final PathElement PATH$pUserData = PathElement.groupElement("pUserData");
    public static final PathElement PATH$pName = PathElement.groupElement("pName");

    public static final OfInt LAYOUT$memoryType = (OfInt) LAYOUT.select(PATH$memoryType);
    public static final AddressLayout LAYOUT$deviceMemory = (AddressLayout) LAYOUT.select(PATH$deviceMemory);
    public static final OfLong LAYOUT$offset = (OfLong) LAYOUT.select(PATH$offset);
    public static final OfLong LAYOUT$size = (OfLong) LAYOUT.select(PATH$size);
    public static final AddressLayout LAYOUT$pMappedData = (AddressLayout) LAYOUT.select(PATH$pMappedData);
    public static final AddressLayout LAYOUT$pUserData = (AddressLayout) LAYOUT.select(PATH$pUserData);
    public static final AddressLayout LAYOUT$pName = (AddressLayout) LAYOUT.select(PATH$pName);

    public static final long OFFSET$memoryType = LAYOUT.byteOffset(PATH$memoryType);
    public static final long OFFSET$deviceMemory = LAYOUT.byteOffset(PATH$deviceMemory);
    public static final long OFFSET$offset = LAYOUT.byteOffset(PATH$offset);
    public static final long OFFSET$size = LAYOUT.byteOffset(PATH$size);
    public static final long OFFSET$pMappedData = LAYOUT.byteOffset(PATH$pMappedData);
    public static final long OFFSET$pUserData = LAYOUT.byteOffset(PATH$pUserData);
    public static final long OFFSET$pName = LAYOUT.byteOffset(PATH$pName);

    public static final long SIZE$memoryType = LAYOUT$memoryType.byteSize();
    public static final long SIZE$deviceMemory = LAYOUT$deviceMemory.byteSize();
    public static final long SIZE$offset = LAYOUT$offset.byteSize();
    public static final long SIZE$size = LAYOUT$size.byteSize();
    public static final long SIZE$pMappedData = LAYOUT$pMappedData.byteSize();
    public static final long SIZE$pUserData = LAYOUT$pUserData.byteSize();
    public static final long SIZE$pName = LAYOUT$pName.byteSize();
}

