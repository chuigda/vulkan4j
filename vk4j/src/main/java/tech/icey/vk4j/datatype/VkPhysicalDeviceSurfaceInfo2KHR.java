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

public record VkPhysicalDeviceSurfaceInfo2KHR(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("surface")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$surface = PathElement.groupElement("surface");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final AddressLayout LAYOUT$surface = (AddressLayout) LAYOUT.select(PATH$surface);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$surface = LAYOUT.byteOffset(PATH$surface);

    public VkPhysicalDeviceSurfaceInfo2KHR(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SURFACE_INFO_2_KHR);
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

    public VkSurfaceKHR surface() {
        return new VkSurfaceKHR(segment.asSlice(OFFSET$surface, LAYOUT$surface));
    }

    public void surface(VkSurfaceKHR value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$surface, LAYOUT$surface.byteSize());
    }


    public static final class VkPhysicalDeviceSurfaceInfo2KHRFactory implements IFactory<VkPhysicalDeviceSurfaceInfo2KHR> {
        @Override
        public Class<VkPhysicalDeviceSurfaceInfo2KHR> clazz() {
            return VkPhysicalDeviceSurfaceInfo2KHR.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkPhysicalDeviceSurfaceInfo2KHR.LAYOUT;
        }

        @Override
        public VkPhysicalDeviceSurfaceInfo2KHR create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkPhysicalDeviceSurfaceInfo2KHR createUninit(MemorySegment segment) {
            return new VkPhysicalDeviceSurfaceInfo2KHR(segment);
        }
    }

    public static final VkPhysicalDeviceSurfaceInfo2KHRFactory FACTORY = new VkPhysicalDeviceSurfaceInfo2KHRFactory();
}