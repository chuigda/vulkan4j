package club.doki7.vulkan.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import club.doki7.ffm.IPointer;
import club.doki7.ffm.NativeLayout;
import club.doki7.ffm.annotation.*;
import club.doki7.ffm.ptr.*;
import club.doki7.vulkan.bitmask.*;
import club.doki7.vulkan.handle.*;
import club.doki7.vulkan.enumtype.*;
import static club.doki7.vulkan.VkConstants.*;

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkAllocationCallbacks.html"><code>VkAllocationCallbacks</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkAllocationCallbacks {
///     void* pUserData; // optional // @link substring="pUserData" target="#pUserData"
///     PFN_vkAllocationFunction pfnAllocation; // @link substring="pfnAllocation" target="#pfnAllocation"
///     PFN_vkReallocationFunction pfnReallocation; // @link substring="pfnReallocation" target="#pfnReallocation"
///     PFN_vkFreeFunction pfnFree; // @link substring="pfnFree" target="#pfnFree"
///     PFN_vkInternalAllocationNotification pfnInternalAllocation; // optional // @link substring="pfnInternalAllocation" target="#pfnInternalAllocation"
///     PFN_vkInternalFreeNotification pfnInternalFree; // optional // @link substring="pfnInternalFree" target="#pfnInternalFree"
/// } VkAllocationCallbacks;
/// }
///
/// ## Contracts
///
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to)
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkAllocationCallbacks.html"><code>VkAllocationCallbacks</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkAllocationCallbacks(@NotNull MemorySegment segment) implements IPointer {
    public static VkAllocationCallbacks allocate(Arena arena) {
        VkAllocationCallbacks ret = new VkAllocationCallbacks(arena.allocate(LAYOUT));
        return ret;
    }

    public static VkAllocationCallbacks[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkAllocationCallbacks[] ret = new VkAllocationCallbacks[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkAllocationCallbacks(segment.asSlice(i * BYTES, BYTES));
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

    public @pointer(comment="void*") MemorySegment pUserData() {
        return segment.get(LAYOUT$pUserData, OFFSET$pUserData);
    }

    public void pUserData(@pointer(comment="void*") MemorySegment value) {
        segment.set(LAYOUT$pUserData, OFFSET$pUserData, value);
    }

    public void pUserData(@Nullable IPointer pointer) {
        pUserData(pointer != null ? pointer.segment() : MemorySegment.NULL);
    }

    public @pointer(comment="PFN_vkAllocationFunction") MemorySegment pfnAllocation() {
        return segment.get(LAYOUT$pfnAllocation, OFFSET$pfnAllocation);
    }

    public void pfnAllocation(@pointer(comment="PFN_vkAllocationFunction") MemorySegment value) {
        segment.set(LAYOUT$pfnAllocation, OFFSET$pfnAllocation, value);
    }

    public void pfnAllocation(@Nullable IPointer pointer) {
        pfnAllocation(pointer != null ? pointer.segment() : MemorySegment.NULL);
    }

    public @pointer(comment="PFN_vkReallocationFunction") MemorySegment pfnReallocation() {
        return segment.get(LAYOUT$pfnReallocation, OFFSET$pfnReallocation);
    }

    public void pfnReallocation(@pointer(comment="PFN_vkReallocationFunction") MemorySegment value) {
        segment.set(LAYOUT$pfnReallocation, OFFSET$pfnReallocation, value);
    }

    public void pfnReallocation(@Nullable IPointer pointer) {
        pfnReallocation(pointer != null ? pointer.segment() : MemorySegment.NULL);
    }

    public @pointer(comment="PFN_vkFreeFunction") MemorySegment pfnFree() {
        return segment.get(LAYOUT$pfnFree, OFFSET$pfnFree);
    }

    public void pfnFree(@pointer(comment="PFN_vkFreeFunction") MemorySegment value) {
        segment.set(LAYOUT$pfnFree, OFFSET$pfnFree, value);
    }

    public void pfnFree(@Nullable IPointer pointer) {
        pfnFree(pointer != null ? pointer.segment() : MemorySegment.NULL);
    }

    public @pointer(comment="PFN_vkInternalAllocationNotification") MemorySegment pfnInternalAllocation() {
        return segment.get(LAYOUT$pfnInternalAllocation, OFFSET$pfnInternalAllocation);
    }

    public void pfnInternalAllocation(@pointer(comment="PFN_vkInternalAllocationNotification") MemorySegment value) {
        segment.set(LAYOUT$pfnInternalAllocation, OFFSET$pfnInternalAllocation, value);
    }

    public void pfnInternalAllocation(@Nullable IPointer pointer) {
        pfnInternalAllocation(pointer != null ? pointer.segment() : MemorySegment.NULL);
    }

    public @pointer(comment="PFN_vkInternalFreeNotification") MemorySegment pfnInternalFree() {
        return segment.get(LAYOUT$pfnInternalFree, OFFSET$pfnInternalFree);
    }

    public void pfnInternalFree(@pointer(comment="PFN_vkInternalFreeNotification") MemorySegment value) {
        segment.set(LAYOUT$pfnInternalFree, OFFSET$pfnInternalFree, value);
    }

    public void pfnInternalFree(@Nullable IPointer pointer) {
        pfnInternalFree(pointer != null ? pointer.segment() : MemorySegment.NULL);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.ADDRESS.withName("pUserData"),
        ValueLayout.ADDRESS.withName("pfnAllocation"),
        ValueLayout.ADDRESS.withName("pfnReallocation"),
        ValueLayout.ADDRESS.withName("pfnFree"),
        ValueLayout.ADDRESS.withName("pfnInternalAllocation"),
        ValueLayout.ADDRESS.withName("pfnInternalFree")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$pUserData = PathElement.groupElement("PATH$pUserData");
    public static final PathElement PATH$pfnAllocation = PathElement.groupElement("PATH$pfnAllocation");
    public static final PathElement PATH$pfnReallocation = PathElement.groupElement("PATH$pfnReallocation");
    public static final PathElement PATH$pfnFree = PathElement.groupElement("PATH$pfnFree");
    public static final PathElement PATH$pfnInternalAllocation = PathElement.groupElement("PATH$pfnInternalAllocation");
    public static final PathElement PATH$pfnInternalFree = PathElement.groupElement("PATH$pfnInternalFree");

    public static final AddressLayout LAYOUT$pUserData = (AddressLayout) LAYOUT.select(PATH$pUserData);
    public static final AddressLayout LAYOUT$pfnAllocation = (AddressLayout) LAYOUT.select(PATH$pfnAllocation);
    public static final AddressLayout LAYOUT$pfnReallocation = (AddressLayout) LAYOUT.select(PATH$pfnReallocation);
    public static final AddressLayout LAYOUT$pfnFree = (AddressLayout) LAYOUT.select(PATH$pfnFree);
    public static final AddressLayout LAYOUT$pfnInternalAllocation = (AddressLayout) LAYOUT.select(PATH$pfnInternalAllocation);
    public static final AddressLayout LAYOUT$pfnInternalFree = (AddressLayout) LAYOUT.select(PATH$pfnInternalFree);

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
}
