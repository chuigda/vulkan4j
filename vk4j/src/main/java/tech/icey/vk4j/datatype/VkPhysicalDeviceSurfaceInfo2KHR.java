package tech.icey.vk4j.datatype;

import tech.icey.panama.IPointer;
import tech.icey.panama.NativeLayout;
import tech.icey.panama.annotation.enumtype;
import tech.icey.panama.annotation.nullable;
import tech.icey.panama.annotation.pointer;
import tech.icey.vk4j.enumtype.VkStructureType;
import tech.icey.vk4j.handle.VkSurfaceKHR;

import java.lang.foreign.*;

import static java.lang.foreign.ValueLayout.OfInt;
import static java.lang.foreign.ValueLayout.PathElement;
import static tech.icey.vk4j.enumtype.VkStructureType.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SURFACE_INFO_2_KHR;

/// {@snippet lang=c :
/// typedef struct VkPhysicalDeviceSurfaceInfo2KHR {
///     VkStructureType sType;
///     const void* pNext;
///     VkSurfaceKHR surface;
/// } VkPhysicalDeviceSurfaceInfo2KHR;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkPhysicalDeviceSurfaceInfo2KHR.html">VkPhysicalDeviceSurfaceInfo2KHR</a>
public record VkPhysicalDeviceSurfaceInfo2KHR(MemorySegment segment) implements IPointer {
    public VkPhysicalDeviceSurfaceInfo2KHR(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SURFACE_INFO_2_KHR);
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

    public void pNext(IPointer pointer) {
        pNext(pointer.segment());
    }

    public @nullable VkSurfaceKHR surface() {
        MemorySegment s = segment.get(LAYOUT$surface, OFFSET$surface);
        if (s.address() == 0) {
            return null;
        }
        return new VkSurfaceKHR(s);
    }

    public void surface(@nullable VkSurfaceKHR value) {
        segment.set(
            LAYOUT$surface,
            OFFSET$surface,
            value != null ? value.segment() : MemorySegment.NULL
        );
    }

    public static VkPhysicalDeviceSurfaceInfo2KHR allocate(Arena arena) {
        return new VkPhysicalDeviceSurfaceInfo2KHR(arena.allocate(LAYOUT));
    }

    public static VkPhysicalDeviceSurfaceInfo2KHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceSurfaceInfo2KHR[] ret = new VkPhysicalDeviceSurfaceInfo2KHR[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkPhysicalDeviceSurfaceInfo2KHR(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPhysicalDeviceSurfaceInfo2KHR clone(Arena arena, VkPhysicalDeviceSurfaceInfo2KHR src) {
        VkPhysicalDeviceSurfaceInfo2KHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceSurfaceInfo2KHR[] clone(Arena arena, VkPhysicalDeviceSurfaceInfo2KHR[] src) {
        VkPhysicalDeviceSurfaceInfo2KHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("surface")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$surface = PathElement.groupElement("surface");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final AddressLayout LAYOUT$surface = (AddressLayout) LAYOUT.select(PATH$surface);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$surface = LAYOUT.byteOffset(PATH$surface);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$surface = LAYOUT$surface.byteSize();
}
