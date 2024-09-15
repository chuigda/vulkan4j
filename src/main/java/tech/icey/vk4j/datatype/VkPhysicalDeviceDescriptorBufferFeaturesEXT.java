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

public record VkPhysicalDeviceDescriptorBufferFeaturesEXT(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("descriptorBuffer"),
        ValueLayout.JAVA_INT.withName("descriptorBufferCaptureReplay"),
        ValueLayout.JAVA_INT.withName("descriptorBufferImageLayoutIgnored"),
        ValueLayout.JAVA_INT.withName("descriptorBufferPushDescriptors")
    );

    public static final PathElement PATH$sType = PathElement.groupElement(0);
    public static final PathElement PATH$pNext = PathElement.groupElement(1);
    public static final PathElement PATH$descriptorBuffer = PathElement.groupElement(2);
    public static final PathElement PATH$descriptorBufferCaptureReplay = PathElement.groupElement(3);
    public static final PathElement PATH$descriptorBufferImageLayoutIgnored = PathElement.groupElement(4);
    public static final PathElement PATH$descriptorBufferPushDescriptors = PathElement.groupElement(5);

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$descriptorBuffer = (OfInt) LAYOUT.select(PATH$descriptorBuffer);
    public static final OfInt LAYOUT$descriptorBufferCaptureReplay = (OfInt) LAYOUT.select(PATH$descriptorBufferCaptureReplay);
    public static final OfInt LAYOUT$descriptorBufferImageLayoutIgnored = (OfInt) LAYOUT.select(PATH$descriptorBufferImageLayoutIgnored);
    public static final OfInt LAYOUT$descriptorBufferPushDescriptors = (OfInt) LAYOUT.select(PATH$descriptorBufferPushDescriptors);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$descriptorBuffer = LAYOUT.byteOffset(PATH$descriptorBuffer);
    public static final long OFFSET$descriptorBufferCaptureReplay = LAYOUT.byteOffset(PATH$descriptorBufferCaptureReplay);
    public static final long OFFSET$descriptorBufferImageLayoutIgnored = LAYOUT.byteOffset(PATH$descriptorBufferImageLayoutIgnored);
    public static final long OFFSET$descriptorBufferPushDescriptors = LAYOUT.byteOffset(PATH$descriptorBufferPushDescriptors);

    public VkPhysicalDeviceDescriptorBufferFeaturesEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_BUFFER_FEATURES_EXT);
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

    public @unsigned int descriptorBuffer() {
        return segment.get(LAYOUT$descriptorBuffer, OFFSET$descriptorBuffer);
    }

    public void descriptorBuffer(@unsigned int value) {
        segment.set(LAYOUT$descriptorBuffer, OFFSET$descriptorBuffer, value);
    }

    public @unsigned int descriptorBufferCaptureReplay() {
        return segment.get(LAYOUT$descriptorBufferCaptureReplay, OFFSET$descriptorBufferCaptureReplay);
    }

    public void descriptorBufferCaptureReplay(@unsigned int value) {
        segment.set(LAYOUT$descriptorBufferCaptureReplay, OFFSET$descriptorBufferCaptureReplay, value);
    }

    public @unsigned int descriptorBufferImageLayoutIgnored() {
        return segment.get(LAYOUT$descriptorBufferImageLayoutIgnored, OFFSET$descriptorBufferImageLayoutIgnored);
    }

    public void descriptorBufferImageLayoutIgnored(@unsigned int value) {
        segment.set(LAYOUT$descriptorBufferImageLayoutIgnored, OFFSET$descriptorBufferImageLayoutIgnored, value);
    }

    public @unsigned int descriptorBufferPushDescriptors() {
        return segment.get(LAYOUT$descriptorBufferPushDescriptors, OFFSET$descriptorBufferPushDescriptors);
    }

    public void descriptorBufferPushDescriptors(@unsigned int value) {
        segment.set(LAYOUT$descriptorBufferPushDescriptors, OFFSET$descriptorBufferPushDescriptors, value);
    }


    public static final class VkPhysicalDeviceDescriptorBufferFeaturesEXTFactory implements IDataTypeFactory<VkPhysicalDeviceDescriptorBufferFeaturesEXT> {
        @Override
        public Class<VkPhysicalDeviceDescriptorBufferFeaturesEXT> clazz() {
            return VkPhysicalDeviceDescriptorBufferFeaturesEXT.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkPhysicalDeviceDescriptorBufferFeaturesEXT.LAYOUT;
        }

        @Override
        public VkPhysicalDeviceDescriptorBufferFeaturesEXT create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkPhysicalDeviceDescriptorBufferFeaturesEXT createUninit(MemorySegment segment) {
            return new VkPhysicalDeviceDescriptorBufferFeaturesEXT(segment);
        }
    }

    public static final VkPhysicalDeviceDescriptorBufferFeaturesEXTFactory FACTORY = new VkPhysicalDeviceDescriptorBufferFeaturesEXTFactory();
}
