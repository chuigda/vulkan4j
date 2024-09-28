package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.IPointer;
import tech.icey.vk4j.annotation.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.buffer.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import tech.icey.vk4j.NativeLayout;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkDirectFBSurfaceCreateInfoEXT.html">VkDirectFBSurfaceCreateInfoEXT</a>
public record VkDirectFBSurfaceCreateInfoEXT(MemorySegment segment) implements IPointer {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.ADDRESS.withName("dfb"),
        ValueLayout.ADDRESS.withName("surface")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$flags = PathElement.groupElement("flags");
    public static final PathElement PATH$dfb = PathElement.groupElement("dfb");
    public static final PathElement PATH$surface = PathElement.groupElement("surface");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$flags = (OfInt) LAYOUT.select(PATH$flags);
    public static final AddressLayout LAYOUT$dfb = (AddressLayout) LAYOUT.select(PATH$dfb);
    public static final AddressLayout LAYOUT$surface = (AddressLayout) LAYOUT.select(PATH$surface);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$dfb = LAYOUT.byteOffset(PATH$dfb);
    public static final long OFFSET$surface = LAYOUT.byteOffset(PATH$surface);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$dfb = LAYOUT$dfb.byteSize();
    public static final long SIZE$surface = LAYOUT$surface.byteSize();

    public VkDirectFBSurfaceCreateInfoEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_DIRECTFB_SURFACE_CREATE_INFO_EXT);
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

    public @enumtype(VkDirectFBSurfaceCreateFlagsEXT.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public void flags(@enumtype(VkDirectFBSurfaceCreateFlagsEXT.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
    }

    public @pointer(comment="void*") MemorySegment dfb() {
        return segment.get(LAYOUT$dfb, OFFSET$dfb);
    }

    public void dfb(@pointer(comment="void*") MemorySegment value) {
        segment.set(LAYOUT$dfb, OFFSET$dfb, value);
    }

    public void dfb(IPointer pointer) {
        dfb(pointer.segment());
    }

    public @pointer(comment="void*") MemorySegment surface() {
        return segment.get(LAYOUT$surface, OFFSET$surface);
    }

    public void surface(@pointer(comment="void*") MemorySegment value) {
        segment.set(LAYOUT$surface, OFFSET$surface, value);
    }

    public void surface(IPointer pointer) {
        surface(pointer.segment());
    }

    public static VkDirectFBSurfaceCreateInfoEXT allocate(Arena arena) {
        return new VkDirectFBSurfaceCreateInfoEXT(arena.allocate(LAYOUT));
    }
    
    public static VkDirectFBSurfaceCreateInfoEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkDirectFBSurfaceCreateInfoEXT[] ret = new VkDirectFBSurfaceCreateInfoEXT[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkDirectFBSurfaceCreateInfoEXT(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
}
