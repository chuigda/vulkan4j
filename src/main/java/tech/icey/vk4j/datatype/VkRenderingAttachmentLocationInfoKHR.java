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

public record VkRenderingAttachmentLocationInfoKHR(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("colorAttachmentCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT).withName("pColorAttachmentLocations")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$colorAttachmentCount = PathElement.groupElement("colorAttachmentCount");
    public static final PathElement PATH$pColorAttachmentLocations = PathElement.groupElement("pColorAttachmentLocations");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$colorAttachmentCount = (OfInt) LAYOUT.select(PATH$colorAttachmentCount);
    public static final AddressLayout LAYOUT$pColorAttachmentLocations = (AddressLayout) LAYOUT.select(PATH$pColorAttachmentLocations);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$colorAttachmentCount = LAYOUT.byteOffset(PATH$colorAttachmentCount);
    public static final long OFFSET$pColorAttachmentLocations = LAYOUT.byteOffset(PATH$pColorAttachmentLocations);

    public VkRenderingAttachmentLocationInfoKHR(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_RENDERING_ATTACHMENT_LOCATION_INFO_KHR);
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

    public @unsigned int colorAttachmentCount() {
        return segment.get(LAYOUT$colorAttachmentCount, OFFSET$colorAttachmentCount);
    }

    public void colorAttachmentCount(@unsigned int value) {
        segment.set(LAYOUT$colorAttachmentCount, OFFSET$colorAttachmentCount, value);
    }

    public @pointer(comment="uint32_t*") MemorySegment pColorAttachmentLocationsRaw() {
        return segment.get(LAYOUT$pColorAttachmentLocations, OFFSET$pColorAttachmentLocations);
    }

    public void pColorAttachmentLocationsRaw(@pointer(comment="uint32_t*") MemorySegment value) {
        segment.set(LAYOUT$pColorAttachmentLocations, OFFSET$pColorAttachmentLocations, value);
    }
    
    public @unsigned IntPtr pColorAttachmentLocations() {
        return new IntPtr(pColorAttachmentLocationsRaw());
    }

    public void pColorAttachmentLocations(@unsigned IntPtr value) {
        pColorAttachmentLocationsRaw(value.segment());
    }


    public static final class VkRenderingAttachmentLocationInfoKHRFactory implements IDataTypeFactory<VkRenderingAttachmentLocationInfoKHR> {
        @Override
        public Class<VkRenderingAttachmentLocationInfoKHR> clazz() {
            return VkRenderingAttachmentLocationInfoKHR.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkRenderingAttachmentLocationInfoKHR.LAYOUT;
        }

        @Override
        public VkRenderingAttachmentLocationInfoKHR create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkRenderingAttachmentLocationInfoKHR createUninit(MemorySegment segment) {
            return new VkRenderingAttachmentLocationInfoKHR(segment);
        }
    }

    public static final VkRenderingAttachmentLocationInfoKHRFactory FACTORY = new VkRenderingAttachmentLocationInfoKHRFactory();
}
