package tech.icey.vk4j.datatype;

import tech.icey.panama.IPointer;
import tech.icey.panama.NativeLayout;
import tech.icey.panama.annotation.enumtype;
import tech.icey.panama.annotation.pointer;
import tech.icey.vk4j.bitmask.VkMetalSurfaceCreateFlagsEXT;
import tech.icey.vk4j.enumtype.VkStructureType;

import java.lang.foreign.*;

import static java.lang.foreign.ValueLayout.OfInt;
import static java.lang.foreign.ValueLayout.PathElement;
import static tech.icey.vk4j.enumtype.VkStructureType.VK_STRUCTURE_TYPE_METAL_SURFACE_CREATE_INFO_EXT;

/// {@snippet lang=c :
/// typedef struct VkMetalSurfaceCreateInfoEXT {
///     VkStructureType sType;
///     const void* pNext;
///     VkMetalSurfaceCreateFlagsEXT flags;
///     const CAMetalLayer* pLayer;
/// } VkMetalSurfaceCreateInfoEXT;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkMetalSurfaceCreateInfoEXT.html">VkMetalSurfaceCreateInfoEXT</a>
public record VkMetalSurfaceCreateInfoEXT(MemorySegment segment) implements IPointer {
    public VkMetalSurfaceCreateInfoEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_METAL_SURFACE_CREATE_INFO_EXT);
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

    public @enumtype(VkMetalSurfaceCreateFlagsEXT.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public void flags(@enumtype(VkMetalSurfaceCreateFlagsEXT.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
    }

    public @pointer(comment="void*") MemorySegment pLayer() {
        return segment.get(LAYOUT$pLayer, OFFSET$pLayer);
    }

    public void pLayer(@pointer(comment="void*") MemorySegment value) {
        segment.set(LAYOUT$pLayer, OFFSET$pLayer, value);
    }

    public void pLayer(IPointer pointer) {
        pLayer(pointer.segment());
    }

    public static VkMetalSurfaceCreateInfoEXT allocate(Arena arena) {
        return new VkMetalSurfaceCreateInfoEXT(arena.allocate(LAYOUT));
    }

    public static VkMetalSurfaceCreateInfoEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkMetalSurfaceCreateInfoEXT[] ret = new VkMetalSurfaceCreateInfoEXT[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkMetalSurfaceCreateInfoEXT(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkMetalSurfaceCreateInfoEXT clone(Arena arena, VkMetalSurfaceCreateInfoEXT src) {
        VkMetalSurfaceCreateInfoEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkMetalSurfaceCreateInfoEXT[] clone(Arena arena, VkMetalSurfaceCreateInfoEXT[] src) {
        VkMetalSurfaceCreateInfoEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.ADDRESS.withName("pLayer")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$flags = PathElement.groupElement("flags");
    public static final PathElement PATH$pLayer = PathElement.groupElement("pLayer");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$flags = (OfInt) LAYOUT.select(PATH$flags);
    public static final AddressLayout LAYOUT$pLayer = (AddressLayout) LAYOUT.select(PATH$pLayer);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$pLayer = LAYOUT.byteOffset(PATH$pLayer);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$pLayer = LAYOUT$pLayer.byteSize();
}
