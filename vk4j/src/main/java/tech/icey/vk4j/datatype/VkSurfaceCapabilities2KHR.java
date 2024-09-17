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

public record VkSurfaceCapabilities2KHR(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        VkSurfaceCapabilitiesKHR.LAYOUT.withName("surfaceCapabilities")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$surfaceCapabilities = PathElement.groupElement("surfaceCapabilities");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final StructLayout LAYOUT$surfaceCapabilities = (StructLayout) LAYOUT.select(PATH$surfaceCapabilities);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$surfaceCapabilities = LAYOUT.byteOffset(PATH$surfaceCapabilities);

    public VkSurfaceCapabilities2KHR(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_SURFACE_CAPABILITIES_2_KHR);
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

    public VkSurfaceCapabilitiesKHR surfaceCapabilities() {
        return new VkSurfaceCapabilitiesKHR(segment.asSlice(OFFSET$surfaceCapabilities, LAYOUT$surfaceCapabilities));
    }

    public void surfaceCapabilities(VkSurfaceCapabilitiesKHR value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$surfaceCapabilities, LAYOUT$surfaceCapabilities.byteSize());
    }


    public static final class VkSurfaceCapabilities2KHRFactory implements IFactory<VkSurfaceCapabilities2KHR> {
        @Override
        public Class<VkSurfaceCapabilities2KHR> clazz() {
            return VkSurfaceCapabilities2KHR.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkSurfaceCapabilities2KHR.LAYOUT;
        }

        @Override
        public VkSurfaceCapabilities2KHR create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkSurfaceCapabilities2KHR createUninit(MemorySegment segment) {
            return new VkSurfaceCapabilities2KHR(segment);
        }
    }

    public static final VkSurfaceCapabilities2KHRFactory FACTORY = new VkSurfaceCapabilities2KHRFactory();
}
