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

public record VkScreenSurfaceCreateInfoQNX(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.ADDRESS.withName("context"),
        ValueLayout.ADDRESS.withName("window")
    );

    public static final PathElement PATH$sType = PathElement.groupElement(0);
    public static final PathElement PATH$pNext = PathElement.groupElement(1);
    public static final PathElement PATH$flags = PathElement.groupElement(2);
    public static final PathElement PATH$context = PathElement.groupElement(3);
    public static final PathElement PATH$window = PathElement.groupElement(4);

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$flags = (OfInt) LAYOUT.select(PATH$flags);
    public static final AddressLayout LAYOUT$context = (AddressLayout) LAYOUT.select(PATH$context);
    public static final AddressLayout LAYOUT$window = (AddressLayout) LAYOUT.select(PATH$window);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$context = LAYOUT.byteOffset(PATH$context);
    public static final long OFFSET$window = LAYOUT.byteOffset(PATH$window);

    public VkScreenSurfaceCreateInfoQNX(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_SCREEN_SURFACE_CREATE_INFO_QNX);
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

    public @enumtype(VkScreenSurfaceCreateFlagsQNX.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public void flags(@enumtype(VkScreenSurfaceCreateFlagsQNX.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
    }

    public @pointer(comment="void*") MemorySegment context() {
        return segment.get(LAYOUT$context, OFFSET$context);
    }

    public void context(@pointer(comment="void*") MemorySegment value) {
        segment.set(LAYOUT$context, OFFSET$context, value);
    }

    public @pointer(comment="void*") MemorySegment window() {
        return segment.get(LAYOUT$window, OFFSET$window);
    }

    public void window(@pointer(comment="void*") MemorySegment value) {
        segment.set(LAYOUT$window, OFFSET$window, value);
    }


    public static final class VkScreenSurfaceCreateInfoQNXFactory implements IDataTypeFactory<VkScreenSurfaceCreateInfoQNX> {
        @Override
        public Class<VkScreenSurfaceCreateInfoQNX> clazz() {
            return VkScreenSurfaceCreateInfoQNX.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkScreenSurfaceCreateInfoQNX.LAYOUT;
        }

        @Override
        public VkScreenSurfaceCreateInfoQNX create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkScreenSurfaceCreateInfoQNX createUninit(MemorySegment segment) {
            return new VkScreenSurfaceCreateInfoQNX(segment);
        }
    }

    public static final VkScreenSurfaceCreateInfoQNXFactory FACTORY = new VkScreenSurfaceCreateInfoQNXFactory();
}
