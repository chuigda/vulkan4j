package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.annotation.*;
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

public record VkPhysicalDeviceLinearColorAttachmentFeaturesNV(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("linearColorAttachment")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$linearColorAttachment = PathElement.groupElement("linearColorAttachment");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$linearColorAttachment = (OfInt) LAYOUT.select(PATH$linearColorAttachment);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$linearColorAttachment = LAYOUT.byteOffset(PATH$linearColorAttachment);

    public VkPhysicalDeviceLinearColorAttachmentFeaturesNV(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_LINEAR_COLOR_ATTACHMENT_FEATURES_NV);
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

    public @unsigned int linearColorAttachment() {
        return segment.get(LAYOUT$linearColorAttachment, OFFSET$linearColorAttachment);
    }

    public void linearColorAttachment(@unsigned int value) {
        segment.set(LAYOUT$linearColorAttachment, OFFSET$linearColorAttachment, value);
    }


    public static final class Factory implements IFactory<VkPhysicalDeviceLinearColorAttachmentFeaturesNV> {
        @Override
        public Class<VkPhysicalDeviceLinearColorAttachmentFeaturesNV> clazz() {
            return VkPhysicalDeviceLinearColorAttachmentFeaturesNV.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkPhysicalDeviceLinearColorAttachmentFeaturesNV.LAYOUT;
        }

        @Override
        public VkPhysicalDeviceLinearColorAttachmentFeaturesNV create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkPhysicalDeviceLinearColorAttachmentFeaturesNV createUninit(MemorySegment segment) {
            return new VkPhysicalDeviceLinearColorAttachmentFeaturesNV(segment);
        }
    }

    public static final Factory FACTORY = new Factory();
}
