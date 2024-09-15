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
import tech.icey.vk4j.IDataTypeFactory;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

public record VkMacOSSurfaceCreateInfoMVK(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.ADDRESS.withName("pView")
    );

    public static final PathElement PATH$sType = PathElement.groupElement(0);
    public static final PathElement PATH$pNext = PathElement.groupElement(1);
    public static final PathElement PATH$flags = PathElement.groupElement(2);
    public static final PathElement PATH$pView = PathElement.groupElement(3);

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$flags = (OfInt) LAYOUT.select(PATH$flags);
    public static final AddressLayout LAYOUT$pView = (AddressLayout) LAYOUT.select(PATH$pView);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$pView = LAYOUT.byteOffset(PATH$pView);

    public VkMacOSSurfaceCreateInfoMVK(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_MACOS_SURFACE_CREATE_INFO_MVK);
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

    public @enumtype(VkMacOSSurfaceCreateFlagsMVK.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public void flags(@enumtype(VkMacOSSurfaceCreateFlagsMVK.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
    }

    public @pointer(comment="void*") MemorySegment pView() {
        return segment.get(LAYOUT$pView, OFFSET$pView);
    }

    public void pView(@pointer(comment="void*") MemorySegment value) {
        segment.set(LAYOUT$pView, OFFSET$pView, value);
    }


    public static final class VkMacOSSurfaceCreateInfoMVKFactory implements IDataTypeFactory<VkMacOSSurfaceCreateInfoMVK> {
        @Override
        public Class<VkMacOSSurfaceCreateInfoMVK> clazz() {
            return VkMacOSSurfaceCreateInfoMVK.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkMacOSSurfaceCreateInfoMVK.LAYOUT;
        }

        @Override
        public VkMacOSSurfaceCreateInfoMVK create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkMacOSSurfaceCreateInfoMVK createUninit(MemorySegment segment) {
            return new VkMacOSSurfaceCreateInfoMVK(segment);
        }
    }

    public static final VkMacOSSurfaceCreateInfoMVKFactory FACTORY = new VkMacOSSurfaceCreateInfoMVKFactory();
}
