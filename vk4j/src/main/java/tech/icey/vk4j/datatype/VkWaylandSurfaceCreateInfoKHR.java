package tech.icey.vk4j.datatype;

import tech.icey.panama.IPointer;
import tech.icey.panama.NativeLayout;
import tech.icey.panama.annotation.enumtype;
import tech.icey.panama.annotation.nullable;
import tech.icey.panama.annotation.pointer;
import tech.icey.vk4j.bitmask.VkWaylandSurfaceCreateFlagsKHR;
import tech.icey.vk4j.enumtype.VkStructureType;

import java.lang.foreign.*;

import static java.lang.foreign.ValueLayout.OfInt;
import static java.lang.foreign.ValueLayout.PathElement;
import static tech.icey.vk4j.enumtype.VkStructureType.VK_STRUCTURE_TYPE_WAYLAND_SURFACE_CREATE_INFO_KHR;

/// {@snippet lang=c :
/// typedef struct VkWaylandSurfaceCreateInfoKHR {
///     VkStructureType sType;
///     const void* pNext;
///     VkWaylandSurfaceCreateFlagsKHR flags;
///     struct wl_display* display;
///     struct wl_surface* surface;
/// } VkWaylandSurfaceCreateInfoKHR;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkWaylandSurfaceCreateInfoKHR.html">VkWaylandSurfaceCreateInfoKHR</a>
public record VkWaylandSurfaceCreateInfoKHR(MemorySegment segment) implements IPointer {
    public VkWaylandSurfaceCreateInfoKHR(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_WAYLAND_SURFACE_CREATE_INFO_KHR);
    }

    public @enumtype(VkStructureType.class) int sType() {
        return segment.get(LAYOUT$sType, OFFSET$sType);
    }

    public void sType(@enumtype(VkStructureType.class) int value) {
        segment.set(LAYOUT$sType, OFFSET$sType, value);
    }

    public @pointer(comment="void*") MemorySegment pNext() {
        return segment.get(LAYOUT$pNext, OFFSET$pNext);
    }

    public void pNext(@pointer(comment="void*") MemorySegment value) {
        segment.set(LAYOUT$pNext, OFFSET$pNext, value);
    }

    public void pNext(@nullable IPointer pointer) {
        pNext(pointer == null ? MemorySegment.NULL : pointer.segment());
    }

    public @enumtype(VkWaylandSurfaceCreateFlagsKHR.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public void flags(@enumtype(VkWaylandSurfaceCreateFlagsKHR.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
    }

    public @pointer(comment="void*") MemorySegment display() {
        return segment.get(LAYOUT$display, OFFSET$display);
    }

    public void display(@pointer(comment="void*") MemorySegment value) {
        segment.set(LAYOUT$display, OFFSET$display, value);
    }

    public void display(@nullable IPointer pointer) {
        display(pointer == null ? MemorySegment.NULL : pointer.segment());
    }

    public @pointer(comment="void*") MemorySegment surface() {
        return segment.get(LAYOUT$surface, OFFSET$surface);
    }

    public void surface(@pointer(comment="void*") MemorySegment value) {
        segment.set(LAYOUT$surface, OFFSET$surface, value);
    }

    public void surface(@nullable IPointer pointer) {
        surface(pointer == null ? MemorySegment.NULL : pointer.segment());
    }

    public static VkWaylandSurfaceCreateInfoKHR allocate(Arena arena) {
        return new VkWaylandSurfaceCreateInfoKHR(arena.allocate(LAYOUT));
    }

    public static VkWaylandSurfaceCreateInfoKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkWaylandSurfaceCreateInfoKHR[] ret = new VkWaylandSurfaceCreateInfoKHR[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkWaylandSurfaceCreateInfoKHR(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkWaylandSurfaceCreateInfoKHR clone(Arena arena, VkWaylandSurfaceCreateInfoKHR src) {
        VkWaylandSurfaceCreateInfoKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkWaylandSurfaceCreateInfoKHR[] clone(Arena arena, VkWaylandSurfaceCreateInfoKHR[] src) {
        VkWaylandSurfaceCreateInfoKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.ADDRESS.withName("display"),
        ValueLayout.ADDRESS.withName("surface")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$flags = PathElement.groupElement("flags");
    public static final PathElement PATH$display = PathElement.groupElement("display");
    public static final PathElement PATH$surface = PathElement.groupElement("surface");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$flags = (OfInt) LAYOUT.select(PATH$flags);
    public static final AddressLayout LAYOUT$display = (AddressLayout) LAYOUT.select(PATH$display);
    public static final AddressLayout LAYOUT$surface = (AddressLayout) LAYOUT.select(PATH$surface);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$display = LAYOUT.byteOffset(PATH$display);
    public static final long OFFSET$surface = LAYOUT.byteOffset(PATH$surface);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$display = LAYOUT$display.byteSize();
    public static final long SIZE$surface = LAYOUT$surface.byteSize();
}
