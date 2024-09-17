package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.annotations.*;
import tech.icey.vk4j.array.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import tech.icey.vk4j.ptr.*;
import tech.icey.vk4j.NativeLayout;
import tech.icey.vk4j.IFactory;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

public record VkWaylandSurfaceCreateInfoKHR(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.ADDRESS.withName("display"),
        ValueLayout.ADDRESS.withName("surface")
    );

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

    public @pointer(comment="void*") MemorySegment surface() {
        return segment.get(LAYOUT$surface, OFFSET$surface);
    }

    public void surface(@pointer(comment="void*") MemorySegment value) {
        segment.set(LAYOUT$surface, OFFSET$surface, value);
    }


    public static final class VkWaylandSurfaceCreateInfoKHRFactory implements IFactory<VkWaylandSurfaceCreateInfoKHR> {
        @Override
        public Class<VkWaylandSurfaceCreateInfoKHR> clazz() {
            return VkWaylandSurfaceCreateInfoKHR.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkWaylandSurfaceCreateInfoKHR.LAYOUT;
        }

        @Override
        public VkWaylandSurfaceCreateInfoKHR create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkWaylandSurfaceCreateInfoKHR createUninit(MemorySegment segment) {
            return new VkWaylandSurfaceCreateInfoKHR(segment);
        }
    }

    public static final VkWaylandSurfaceCreateInfoKHRFactory FACTORY = new VkWaylandSurfaceCreateInfoKHRFactory();
}
