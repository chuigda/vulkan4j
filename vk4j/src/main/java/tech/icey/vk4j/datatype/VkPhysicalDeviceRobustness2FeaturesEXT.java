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

public record VkPhysicalDeviceRobustness2FeaturesEXT(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("robustBufferAccess2"),
        ValueLayout.JAVA_INT.withName("robustImageAccess2"),
        ValueLayout.JAVA_INT.withName("nullDescriptor")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$robustBufferAccess2 = PathElement.groupElement("robustBufferAccess2");
    public static final PathElement PATH$robustImageAccess2 = PathElement.groupElement("robustImageAccess2");
    public static final PathElement PATH$nullDescriptor = PathElement.groupElement("nullDescriptor");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$robustBufferAccess2 = (OfInt) LAYOUT.select(PATH$robustBufferAccess2);
    public static final OfInt LAYOUT$robustImageAccess2 = (OfInt) LAYOUT.select(PATH$robustImageAccess2);
    public static final OfInt LAYOUT$nullDescriptor = (OfInt) LAYOUT.select(PATH$nullDescriptor);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$robustBufferAccess2 = LAYOUT.byteOffset(PATH$robustBufferAccess2);
    public static final long OFFSET$robustImageAccess2 = LAYOUT.byteOffset(PATH$robustImageAccess2);
    public static final long OFFSET$nullDescriptor = LAYOUT.byteOffset(PATH$nullDescriptor);

    public VkPhysicalDeviceRobustness2FeaturesEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ROBUSTNESS_2_FEATURES_EXT);
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

    public @unsigned int robustBufferAccess2() {
        return segment.get(LAYOUT$robustBufferAccess2, OFFSET$robustBufferAccess2);
    }

    public void robustBufferAccess2(@unsigned int value) {
        segment.set(LAYOUT$robustBufferAccess2, OFFSET$robustBufferAccess2, value);
    }

    public @unsigned int robustImageAccess2() {
        return segment.get(LAYOUT$robustImageAccess2, OFFSET$robustImageAccess2);
    }

    public void robustImageAccess2(@unsigned int value) {
        segment.set(LAYOUT$robustImageAccess2, OFFSET$robustImageAccess2, value);
    }

    public @unsigned int nullDescriptor() {
        return segment.get(LAYOUT$nullDescriptor, OFFSET$nullDescriptor);
    }

    public void nullDescriptor(@unsigned int value) {
        segment.set(LAYOUT$nullDescriptor, OFFSET$nullDescriptor, value);
    }


    public static final class VkPhysicalDeviceRobustness2FeaturesEXTFactory implements IFactory<VkPhysicalDeviceRobustness2FeaturesEXT> {
        @Override
        public Class<VkPhysicalDeviceRobustness2FeaturesEXT> clazz() {
            return VkPhysicalDeviceRobustness2FeaturesEXT.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkPhysicalDeviceRobustness2FeaturesEXT.LAYOUT;
        }

        @Override
        public VkPhysicalDeviceRobustness2FeaturesEXT create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkPhysicalDeviceRobustness2FeaturesEXT createUninit(MemorySegment segment) {
            return new VkPhysicalDeviceRobustness2FeaturesEXT(segment);
        }
    }

    public static final VkPhysicalDeviceRobustness2FeaturesEXTFactory FACTORY = new VkPhysicalDeviceRobustness2FeaturesEXTFactory();
}
