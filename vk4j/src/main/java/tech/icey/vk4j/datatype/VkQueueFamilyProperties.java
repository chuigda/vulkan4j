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

public record VkQueueFamilyProperties(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("queueFlags"),
        ValueLayout.JAVA_INT.withName("queueCount"),
        ValueLayout.JAVA_INT.withName("timestampValidBits"),
        VkExtent3D.LAYOUT.withName("minImageTransferGranularity")
    );

    public static final PathElement PATH$queueFlags = PathElement.groupElement("queueFlags");
    public static final PathElement PATH$queueCount = PathElement.groupElement("queueCount");
    public static final PathElement PATH$timestampValidBits = PathElement.groupElement("timestampValidBits");
    public static final PathElement PATH$minImageTransferGranularity = PathElement.groupElement("minImageTransferGranularity");

    public static final OfInt LAYOUT$queueFlags = (OfInt) LAYOUT.select(PATH$queueFlags);
    public static final OfInt LAYOUT$queueCount = (OfInt) LAYOUT.select(PATH$queueCount);
    public static final OfInt LAYOUT$timestampValidBits = (OfInt) LAYOUT.select(PATH$timestampValidBits);
    public static final StructLayout LAYOUT$minImageTransferGranularity = (StructLayout) LAYOUT.select(PATH$minImageTransferGranularity);

    public static final long OFFSET$queueFlags = LAYOUT.byteOffset(PATH$queueFlags);
    public static final long OFFSET$queueCount = LAYOUT.byteOffset(PATH$queueCount);
    public static final long OFFSET$timestampValidBits = LAYOUT.byteOffset(PATH$timestampValidBits);
    public static final long OFFSET$minImageTransferGranularity = LAYOUT.byteOffset(PATH$minImageTransferGranularity);

    public VkQueueFamilyProperties(MemorySegment segment) {
        this.segment = segment;
    }

    public @enumtype(VkQueueFlags.class) int queueFlags() {
        return segment.get(LAYOUT$queueFlags, OFFSET$queueFlags);
    }

    public void queueFlags(@enumtype(VkQueueFlags.class) int value) {
        segment.set(LAYOUT$queueFlags, OFFSET$queueFlags, value);
    }

    public @unsigned int queueCount() {
        return segment.get(LAYOUT$queueCount, OFFSET$queueCount);
    }

    public void queueCount(@unsigned int value) {
        segment.set(LAYOUT$queueCount, OFFSET$queueCount, value);
    }

    public @unsigned int timestampValidBits() {
        return segment.get(LAYOUT$timestampValidBits, OFFSET$timestampValidBits);
    }

    public void timestampValidBits(@unsigned int value) {
        segment.set(LAYOUT$timestampValidBits, OFFSET$timestampValidBits, value);
    }

    public VkExtent3D minImageTransferGranularity() {
        return new VkExtent3D(segment.asSlice(OFFSET$minImageTransferGranularity, LAYOUT$minImageTransferGranularity));
    }

    public void minImageTransferGranularity(VkExtent3D value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$minImageTransferGranularity, LAYOUT$minImageTransferGranularity.byteSize());
    }


    public static final class VkQueueFamilyPropertiesFactory implements IFactory<VkQueueFamilyProperties> {
        @Override
        public Class<VkQueueFamilyProperties> clazz() {
            return VkQueueFamilyProperties.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkQueueFamilyProperties.LAYOUT;
        }

        @Override
        public VkQueueFamilyProperties create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkQueueFamilyProperties createUninit(MemorySegment segment) {
            return new VkQueueFamilyProperties(segment);
        }
    }

    public static final VkQueueFamilyPropertiesFactory FACTORY = new VkQueueFamilyPropertiesFactory();
}
