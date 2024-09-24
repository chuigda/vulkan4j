package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.annotation.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.NativeLayout;
import tech.icey.vk4j.IFactory;

import static tech.icey.vk4j.enumtype.VkStructureType.*;

public record VkSurfaceCapabilitiesPresentBarrierNV(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("presentBarrierSupported")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$presentBarrierSupported = PathElement.groupElement("presentBarrierSupported");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$presentBarrierSupported = (OfInt) LAYOUT.select(PATH$presentBarrierSupported);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$presentBarrierSupported = LAYOUT.byteOffset(PATH$presentBarrierSupported);

    public VkSurfaceCapabilitiesPresentBarrierNV(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_SURFACE_CAPABILITIES_PRESENT_BARRIER_NV);
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

    public @unsigned int presentBarrierSupported() {
        return segment.get(LAYOUT$presentBarrierSupported, OFFSET$presentBarrierSupported);
    }

    public void presentBarrierSupported(@unsigned int value) {
        segment.set(LAYOUT$presentBarrierSupported, OFFSET$presentBarrierSupported, value);
    }


    public static final class Factory implements IFactory<VkSurfaceCapabilitiesPresentBarrierNV> {
        @Override
        public Class<VkSurfaceCapabilitiesPresentBarrierNV> clazz() {
            return VkSurfaceCapabilitiesPresentBarrierNV.class;
        }

        @Override
        public MemoryLayout layout() {
            return VkSurfaceCapabilitiesPresentBarrierNV.LAYOUT;
        }

        @Override
        public VkSurfaceCapabilitiesPresentBarrierNV create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkSurfaceCapabilitiesPresentBarrierNV createUninit(MemorySegment segment) {
            return new VkSurfaceCapabilitiesPresentBarrierNV(segment);
        }
    }

    public static final Factory FACTORY = new Factory();
}
