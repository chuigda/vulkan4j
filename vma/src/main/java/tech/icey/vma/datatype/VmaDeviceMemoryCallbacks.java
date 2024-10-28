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

public record VmaDeviceMemoryCallbacks(MemorySegment segment) implements IPointer {
    public @pointer(comment="PFN_vmaAllocateDeviceMemoryFunction") MemorySegment pfnAllocate() {
        return segment.get(LAYOUT$pfnAllocate, OFFSET$pfnAllocate);
    }

    public void pfnAllocate(@pointer(comment="PFN_vmaAllocateDeviceMemoryFunction") MemorySegment value) {
        segment.set(LAYOUT$pfnAllocate, OFFSET$pfnAllocate, value);
    }

    public void pfnAllocate(IPointer pointer) {
        pfnAllocate(pointer.segment());
    }

    public @pointer(comment="PFN_vmaFreeDeviceMemoryFunction") MemorySegment pfnFree() {
        return segment.get(LAYOUT$pfnFree, OFFSET$pfnFree);
    }

    public void pfnFree(@pointer(comment="PFN_vmaFreeDeviceMemoryFunction") MemorySegment value) {
        segment.set(LAYOUT$pfnFree, OFFSET$pfnFree, value);
    }

    public void pfnFree(IPointer pointer) {
        pfnFree(pointer.segment());
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

    public static VmaDeviceMemoryCallbacks allocate(Arena arena) {
        return new VmaDeviceMemoryCallbacks(arena.allocate(LAYOUT));
    }

    public static VmaDeviceMemoryCallbacks[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VmaDeviceMemoryCallbacks[] ret = new VmaDeviceMemoryCallbacks[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VmaDeviceMemoryCallbacks(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VmaDeviceMemoryCallbacks clone(Arena arena, VmaDeviceMemoryCallbacks src) {
        VmaDeviceMemoryCallbacks ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VmaDeviceMemoryCallbacks[] clone(Arena arena, VmaDeviceMemoryCallbacks[] src) {
        VmaDeviceMemoryCallbacks[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.ADDRESS.withName("pfnAllocate"),
        ValueLayout.ADDRESS.withName("pfnFree"),
        ValueLayout.ADDRESS.withName("pUserData")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$pfnAllocate = PathElement.groupElement("pfnAllocate");
    public static final PathElement PATH$pfnFree = PathElement.groupElement("pfnFree");
    public static final PathElement PATH$pUserData = PathElement.groupElement("pUserData");

    public static final AddressLayout LAYOUT$pfnAllocate = (AddressLayout) LAYOUT.select(PATH$pfnAllocate);
    public static final AddressLayout LAYOUT$pfnFree = (AddressLayout) LAYOUT.select(PATH$pfnFree);
    public static final AddressLayout LAYOUT$pUserData = (AddressLayout) LAYOUT.select(PATH$pUserData);

    public static final long OFFSET$pfnAllocate = LAYOUT.byteOffset(PATH$pfnAllocate);
    public static final long OFFSET$pfnFree = LAYOUT.byteOffset(PATH$pfnFree);
    public static final long OFFSET$pUserData = LAYOUT.byteOffset(PATH$pUserData);

    public static final long SIZE$pfnAllocate = LAYOUT$pfnAllocate.byteSize();
    public static final long SIZE$pfnFree = LAYOUT$pfnFree.byteSize();
    public static final long SIZE$pUserData = LAYOUT$pUserData.byteSize();
}

