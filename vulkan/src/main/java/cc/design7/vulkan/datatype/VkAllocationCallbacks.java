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

public record VkAllocationCallbacks(@NotNull MemorySegment segment) implements IPointer {
    public static final AddressLayout LAYOUT$pUserData = ValueLayout.ADDRESS.withName("pUserData");
    public static final AddressLayout LAYOUT$pfnAllocation = ValueLayout.ADDRESS.withName("pfnAllocation");
    public static final AddressLayout LAYOUT$pfnReallocation = ValueLayout.ADDRESS.withName("pfnReallocation");
    public static final AddressLayout LAYOUT$pfnFree = ValueLayout.ADDRESS.withName("pfnFree");
    public static final AddressLayout LAYOUT$pfnInternalAllocation = ValueLayout.ADDRESS.withName("pfnInternalAllocation");
    public static final AddressLayout LAYOUT$pfnInternalFree = ValueLayout.ADDRESS.withName("pfnInternalFree");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$pUserData, LAYOUT$pfnAllocation, LAYOUT$pfnReallocation, LAYOUT$pfnFree, LAYOUT$pfnInternalAllocation, LAYOUT$pfnInternalFree);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkAllocationCallbacks allocate(Arena arena) {
        return new VkAllocationCallbacks(arena.allocate(LAYOUT));
    }

    public static VkAllocationCallbacks[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkAllocationCallbacks[] ret = new VkAllocationCallbacks[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkAllocationCallbacks(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkAllocationCallbacks clone(Arena arena, VkAllocationCallbacks src) {
        VkAllocationCallbacks ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkAllocationCallbacks[] clone(Arena arena, VkAllocationCallbacks[] src) {
        VkAllocationCallbacks[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$pUserData = PathElement.groupElement("PATH$pUserData");
    public static final PathElement PATH$pfnAllocation = PathElement.groupElement("PATH$pfnAllocation");
    public static final PathElement PATH$pfnReallocation = PathElement.groupElement("PATH$pfnReallocation");
    public static final PathElement PATH$pfnFree = PathElement.groupElement("PATH$pfnFree");
    public static final PathElement PATH$pfnInternalAllocation = PathElement.groupElement("PATH$pfnInternalAllocation");
    public static final PathElement PATH$pfnInternalFree = PathElement.groupElement("PATH$pfnInternalFree");

    public static final long SIZE$pUserData = LAYOUT$pUserData.byteSize();
    public static final long SIZE$pfnAllocation = LAYOUT$pfnAllocation.byteSize();
    public static final long SIZE$pfnReallocation = LAYOUT$pfnReallocation.byteSize();
    public static final long SIZE$pfnFree = LAYOUT$pfnFree.byteSize();
    public static final long SIZE$pfnInternalAllocation = LAYOUT$pfnInternalAllocation.byteSize();
    public static final long SIZE$pfnInternalFree = LAYOUT$pfnInternalFree.byteSize();

    public static final long OFFSET$pUserData = LAYOUT.byteOffset(PATH$pUserData);
    public static final long OFFSET$pfnAllocation = LAYOUT.byteOffset(PATH$pfnAllocation);
    public static final long OFFSET$pfnReallocation = LAYOUT.byteOffset(PATH$pfnReallocation);
    public static final long OFFSET$pfnFree = LAYOUT.byteOffset(PATH$pfnFree);
    public static final long OFFSET$pfnInternalAllocation = LAYOUT.byteOffset(PATH$pfnInternalAllocation);
    public static final long OFFSET$pfnInternalFree = LAYOUT.byteOffset(PATH$pfnInternalFree);

    public @pointer(comment="void*") MemorySegment pUserData() {
        return segment.get(LAYOUT$pUserData, OFFSET$pUserData);
    }

    public void pUserData(@pointer(comment="void*") MemorySegment value) {
        segment.set(LAYOUT$pUserData, OFFSET$pUserData, value);
    }

    public void pUserData(IPointer pointer) {
        pUserData(pointer.segment());
    }

    public @pointer(comment="PFN_vkAllocationFunction") MemorySegment pfnAllocation() {
        return segment.get(LAYOUT$pfnAllocation, OFFSET$pfnAllocation);
    }

    public void pfnAllocation(@pointer(comment="PFN_vkAllocationFunction") MemorySegment value) {
        segment.set(LAYOUT$pfnAllocation, OFFSET$pfnAllocation, value);
    }

    public void pfnAllocation(IPointer pointer) {
        pfnAllocation(pointer.segment());
    }

    public @pointer(comment="PFN_vkReallocationFunction") MemorySegment pfnReallocation() {
        return segment.get(LAYOUT$pfnReallocation, OFFSET$pfnReallocation);
    }

    public void pfnReallocation(@pointer(comment="PFN_vkReallocationFunction") MemorySegment value) {
        segment.set(LAYOUT$pfnReallocation, OFFSET$pfnReallocation, value);
    }

    public void pfnReallocation(IPointer pointer) {
        pfnReallocation(pointer.segment());
    }

    public @pointer(comment="PFN_vkFreeFunction") MemorySegment pfnFree() {
        return segment.get(LAYOUT$pfnFree, OFFSET$pfnFree);
    }

    public void pfnFree(@pointer(comment="PFN_vkFreeFunction") MemorySegment value) {
        segment.set(LAYOUT$pfnFree, OFFSET$pfnFree, value);
    }

    public void pfnFree(IPointer pointer) {
        pfnFree(pointer.segment());
    }

    public @pointer(comment="PFN_vkInternalAllocationNotification") MemorySegment pfnInternalAllocation() {
        return segment.get(LAYOUT$pfnInternalAllocation, OFFSET$pfnInternalAllocation);
    }

    public void pfnInternalAllocation(@pointer(comment="PFN_vkInternalAllocationNotification") MemorySegment value) {
        segment.set(LAYOUT$pfnInternalAllocation, OFFSET$pfnInternalAllocation, value);
    }

    public void pfnInternalAllocation(IPointer pointer) {
        pfnInternalAllocation(pointer.segment());
    }

    public @pointer(comment="PFN_vkInternalFreeNotification") MemorySegment pfnInternalFree() {
        return segment.get(LAYOUT$pfnInternalFree, OFFSET$pfnInternalFree);
    }

    public void pfnInternalFree(@pointer(comment="PFN_vkInternalFreeNotification") MemorySegment value) {
        segment.set(LAYOUT$pfnInternalFree, OFFSET$pfnInternalFree, value);
    }

    public void pfnInternalFree(IPointer pointer) {
        pfnInternalFree(pointer.segment());
    }

}
/// dummy, not implemented yet
