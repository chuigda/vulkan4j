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

public record VkWin32SurfaceCreateInfoKHR(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.ADDRESS.withName("hinstance"),
        ValueLayout.ADDRESS.withName("hwnd")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$flags = PathElement.groupElement("flags");
    public static final PathElement PATH$hinstance = PathElement.groupElement("hinstance");
    public static final PathElement PATH$hwnd = PathElement.groupElement("hwnd");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$flags = (OfInt) LAYOUT.select(PATH$flags);
    public static final AddressLayout LAYOUT$hinstance = (AddressLayout) LAYOUT.select(PATH$hinstance);
    public static final AddressLayout LAYOUT$hwnd = (AddressLayout) LAYOUT.select(PATH$hwnd);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$hinstance = LAYOUT.byteOffset(PATH$hinstance);
    public static final long OFFSET$hwnd = LAYOUT.byteOffset(PATH$hwnd);

    public VkWin32SurfaceCreateInfoKHR(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_WIN32_SURFACE_CREATE_INFO_KHR);
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

    public @enumtype(VkWin32SurfaceCreateFlagsKHR.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public void flags(@enumtype(VkWin32SurfaceCreateFlagsKHR.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
    }

    public @pointer(comment="void*") MemorySegment hinstance() {
        return segment.get(LAYOUT$hinstance, OFFSET$hinstance);
    }

    public void hinstance(@pointer(comment="void*") MemorySegment value) {
        segment.set(LAYOUT$hinstance, OFFSET$hinstance, value);
    }

    public @pointer(comment="void*") MemorySegment hwnd() {
        return segment.get(LAYOUT$hwnd, OFFSET$hwnd);
    }

    public void hwnd(@pointer(comment="void*") MemorySegment value) {
        segment.set(LAYOUT$hwnd, OFFSET$hwnd, value);
    }


    public static final class VkWin32SurfaceCreateInfoKHRFactory implements IFactory<VkWin32SurfaceCreateInfoKHR> {
        @Override
        public Class<VkWin32SurfaceCreateInfoKHR> clazz() {
            return VkWin32SurfaceCreateInfoKHR.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkWin32SurfaceCreateInfoKHR.LAYOUT;
        }

        @Override
        public VkWin32SurfaceCreateInfoKHR create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkWin32SurfaceCreateInfoKHR createUninit(MemorySegment segment) {
            return new VkWin32SurfaceCreateInfoKHR(segment);
        }
    }

    public static final VkWin32SurfaceCreateInfoKHRFactory FACTORY = new VkWin32SurfaceCreateInfoKHRFactory();
}
