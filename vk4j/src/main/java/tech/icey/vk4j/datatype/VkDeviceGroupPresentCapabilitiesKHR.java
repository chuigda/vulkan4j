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

public record VkDeviceGroupPresentCapabilitiesKHR(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        MemoryLayout.sequenceLayout(VK_MAX_DEVICE_GROUP_SIZE, ValueLayout.JAVA_INT).withName("presentMask"),
        ValueLayout.JAVA_INT.withName("modes")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$presentMask = PathElement.groupElement("presentMask");
    public static final PathElement PATH$modes = PathElement.groupElement("modes");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final SequenceLayout LAYOUT$presentMask = (SequenceLayout) LAYOUT.select(PATH$presentMask);
    public static final OfInt LAYOUT$modes = (OfInt) LAYOUT.select(PATH$modes);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$presentMask = LAYOUT.byteOffset(PATH$presentMask);
    public static final long OFFSET$modes = LAYOUT.byteOffset(PATH$modes);

    public VkDeviceGroupPresentCapabilitiesKHR(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_DEVICE_GROUP_PRESENT_CAPABILITIES_KHR);
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

    public MemorySegment presentMaskRaw() {
        return segment.asSlice(OFFSET$presentMask, LAYOUT$presentMask.byteSize());
    }

    public @unsigned IntArray presentMask() {
        return new IntArray(presentMaskRaw(), LAYOUT$presentMask.elementCount());
    }

    public void presentMask(@unsigned IntArray value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$presentMask, LAYOUT$presentMask.byteSize());
    }

    public @enumtype(VkDeviceGroupPresentModeFlagsKHR.class) int modes() {
        return segment.get(LAYOUT$modes, OFFSET$modes);
    }

    public void modes(@enumtype(VkDeviceGroupPresentModeFlagsKHR.class) int value) {
        segment.set(LAYOUT$modes, OFFSET$modes, value);
    }


    public static final class VkDeviceGroupPresentCapabilitiesKHRFactory implements IFactory<VkDeviceGroupPresentCapabilitiesKHR> {
        @Override
        public Class<VkDeviceGroupPresentCapabilitiesKHR> clazz() {
            return VkDeviceGroupPresentCapabilitiesKHR.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkDeviceGroupPresentCapabilitiesKHR.LAYOUT;
        }

        @Override
        public VkDeviceGroupPresentCapabilitiesKHR create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkDeviceGroupPresentCapabilitiesKHR createUninit(MemorySegment segment) {
            return new VkDeviceGroupPresentCapabilitiesKHR(segment);
        }
    }

    public static final VkDeviceGroupPresentCapabilitiesKHRFactory FACTORY = new VkDeviceGroupPresentCapabilitiesKHRFactory();
}