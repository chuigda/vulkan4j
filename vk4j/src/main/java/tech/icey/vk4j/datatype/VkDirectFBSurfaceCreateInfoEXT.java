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

public record VkDirectFBSurfaceCreateInfoEXT(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.ADDRESS.withName("dfb"),
        ValueLayout.ADDRESS.withName("surface")
    );

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

    public @pointer(comment="void*") MemorySegment surface() {
        return segment.get(LAYOUT$surface, OFFSET$surface);
    }

    public void surface(@pointer(comment="void*") MemorySegment value) {
        segment.set(LAYOUT$surface, OFFSET$surface, value);
    }


    public static final class VkDirectFBSurfaceCreateInfoEXTFactory implements IFactory<VkDirectFBSurfaceCreateInfoEXT> {
        @Override
        public Class<VkDirectFBSurfaceCreateInfoEXT> clazz() {
            return VkDirectFBSurfaceCreateInfoEXT.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkDirectFBSurfaceCreateInfoEXT.LAYOUT;
        }

        @Override
        public VkDirectFBSurfaceCreateInfoEXT create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkDirectFBSurfaceCreateInfoEXT createUninit(MemorySegment segment) {
            return new VkDirectFBSurfaceCreateInfoEXT(segment);
        }
    }

    public static final VkDirectFBSurfaceCreateInfoEXTFactory FACTORY = new VkDirectFBSurfaceCreateInfoEXTFactory();
}