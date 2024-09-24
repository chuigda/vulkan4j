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

public record VkDisplayPlaneCapabilities2KHR(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        VkDisplayPlaneCapabilitiesKHR.LAYOUT.withName("capabilities")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$capabilities = PathElement.groupElement("capabilities");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final StructLayout LAYOUT$capabilities = (StructLayout) LAYOUT.select(PATH$capabilities);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$capabilities = LAYOUT.byteOffset(PATH$capabilities);

    public VkDisplayPlaneCapabilities2KHR(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_DISPLAY_PLANE_CAPABILITIES_2_KHR);
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

    public VkDisplayPlaneCapabilitiesKHR capabilities() {
        return new VkDisplayPlaneCapabilitiesKHR(segment.asSlice(OFFSET$capabilities, LAYOUT$capabilities));
    }

    public void capabilities(VkDisplayPlaneCapabilitiesKHR value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$capabilities, LAYOUT$capabilities.byteSize());
    }


    public static final class VkDisplayPlaneCapabilities2KHRFactory implements IFactory<VkDisplayPlaneCapabilities2KHR> {
        @Override
        public Class<VkDisplayPlaneCapabilities2KHR> clazz() {
            return VkDisplayPlaneCapabilities2KHR.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkDisplayPlaneCapabilities2KHR.LAYOUT;
        }

        @Override
        public VkDisplayPlaneCapabilities2KHR create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkDisplayPlaneCapabilities2KHR createUninit(MemorySegment segment) {
            return new VkDisplayPlaneCapabilities2KHR(segment);
        }
    }

    public static final VkDisplayPlaneCapabilities2KHRFactory FACTORY = new VkDisplayPlaneCapabilities2KHRFactory();
}
