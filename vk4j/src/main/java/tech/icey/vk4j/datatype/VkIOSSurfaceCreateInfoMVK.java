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

public record VkIOSSurfaceCreateInfoMVK(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.ADDRESS.withName("pView")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$flags = PathElement.groupElement("flags");
    public static final PathElement PATH$pView = PathElement.groupElement("pView");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$flags = (OfInt) LAYOUT.select(PATH$flags);
    public static final AddressLayout LAYOUT$pView = (AddressLayout) LAYOUT.select(PATH$pView);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$pView = LAYOUT.byteOffset(PATH$pView);

    public VkIOSSurfaceCreateInfoMVK(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_IOS_SURFACE_CREATE_INFO_MVK);
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

    public @enumtype(VkIOSSurfaceCreateFlagsMVK.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public void flags(@enumtype(VkIOSSurfaceCreateFlagsMVK.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
    }

    public @pointer(comment="void*") MemorySegment pView() {
        return segment.get(LAYOUT$pView, OFFSET$pView);
    }

    public void pView(@pointer(comment="void*") MemorySegment value) {
        segment.set(LAYOUT$pView, OFFSET$pView, value);
    }


    public static final class VkIOSSurfaceCreateInfoMVKFactory implements IFactory<VkIOSSurfaceCreateInfoMVK> {
        @Override
        public Class<VkIOSSurfaceCreateInfoMVK> clazz() {
            return VkIOSSurfaceCreateInfoMVK.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkIOSSurfaceCreateInfoMVK.LAYOUT;
        }

        @Override
        public VkIOSSurfaceCreateInfoMVK create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkIOSSurfaceCreateInfoMVK createUninit(MemorySegment segment) {
            return new VkIOSSurfaceCreateInfoMVK(segment);
        }
    }

    public static final VkIOSSurfaceCreateInfoMVKFactory FACTORY = new VkIOSSurfaceCreateInfoMVKFactory();
}
