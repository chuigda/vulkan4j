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

public record VkSurfacePresentModeEXT(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("presentMode")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$presentMode = PathElement.groupElement("presentMode");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$presentMode = (OfInt) LAYOUT.select(PATH$presentMode);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$presentMode = LAYOUT.byteOffset(PATH$presentMode);

    public VkSurfacePresentModeEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_SURFACE_PRESENT_MODE_EXT);
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

    public @enumtype(VkPresentModeKHR.class) int presentMode() {
        return segment.get(LAYOUT$presentMode, OFFSET$presentMode);
    }

    public void presentMode(@enumtype(VkPresentModeKHR.class) int value) {
        segment.set(LAYOUT$presentMode, OFFSET$presentMode, value);
    }


    public static final class VkSurfacePresentModeEXTFactory implements IFactory<VkSurfacePresentModeEXT> {
        @Override
        public Class<VkSurfacePresentModeEXT> clazz() {
            return VkSurfacePresentModeEXT.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkSurfacePresentModeEXT.LAYOUT;
        }

        @Override
        public VkSurfacePresentModeEXT create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkSurfacePresentModeEXT createUninit(MemorySegment segment) {
            return new VkSurfacePresentModeEXT(segment);
        }
    }

    public static final VkSurfacePresentModeEXTFactory FACTORY = new VkSurfacePresentModeEXTFactory();
}
