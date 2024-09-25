package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.annotation.*;
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

public record VkXlibSurfaceCreateInfoKHR(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS).withName("dpy"),
        NativeLayout.C_LONG.withName("window")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$flags = PathElement.groupElement("flags");
    public static final PathElement PATH$dpy = PathElement.groupElement("dpy");
    public static final PathElement PATH$window = PathElement.groupElement("window");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$flags = (OfInt) LAYOUT.select(PATH$flags);
    public static final AddressLayout LAYOUT$dpy = (AddressLayout) LAYOUT.select(PATH$dpy);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$dpy = LAYOUT.byteOffset(PATH$dpy);
    public static final long OFFSET$window = LAYOUT.byteOffset(PATH$window);

    public VkXlibSurfaceCreateInfoKHR(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_XLIB_SURFACE_CREATE_INFO_KHR);
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

    public @enumtype(VkXlibSurfaceCreateFlagsKHR.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public void flags(@enumtype(VkXlibSurfaceCreateFlagsKHR.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
    }

    public @pointer(comment="void**") MemorySegment dpy() {
        return segment.get(LAYOUT$dpy, OFFSET$dpy);
    }

    public void dpy(@pointer(comment="void**") MemorySegment value) {
        segment.set(LAYOUT$dpy, OFFSET$dpy, value);
    }

    public long window() {
            return NativeLayout.readCLong(segment, OFFSET$window);
        }
    
        public void window(long value) {
            NativeLayout.writeCLong(segment, OFFSET$window, value);
        }


    public static final class Factory implements IFactory<VkXlibSurfaceCreateInfoKHR> {
        @Override
        public Class<VkXlibSurfaceCreateInfoKHR> clazz() {
            return VkXlibSurfaceCreateInfoKHR.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkXlibSurfaceCreateInfoKHR.LAYOUT;
        }

        @Override
        public VkXlibSurfaceCreateInfoKHR create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkXlibSurfaceCreateInfoKHR createUninit(MemorySegment segment) {
            return new VkXlibSurfaceCreateInfoKHR(segment);
        }
    }

    public static final Factory FACTORY = new Factory();
}
