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

public record VkPhysicalDeviceMultiviewProperties(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("maxMultiviewViewCount"),
        ValueLayout.JAVA_INT.withName("maxMultiviewInstanceIndex")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$maxMultiviewViewCount = PathElement.groupElement("maxMultiviewViewCount");
    public static final PathElement PATH$maxMultiviewInstanceIndex = PathElement.groupElement("maxMultiviewInstanceIndex");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$maxMultiviewViewCount = (OfInt) LAYOUT.select(PATH$maxMultiviewViewCount);
    public static final OfInt LAYOUT$maxMultiviewInstanceIndex = (OfInt) LAYOUT.select(PATH$maxMultiviewInstanceIndex);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$maxMultiviewViewCount = LAYOUT.byteOffset(PATH$maxMultiviewViewCount);
    public static final long OFFSET$maxMultiviewInstanceIndex = LAYOUT.byteOffset(PATH$maxMultiviewInstanceIndex);

    public VkPhysicalDeviceMultiviewProperties(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MULTIVIEW_PROPERTIES);
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

    public @unsigned int maxMultiviewViewCount() {
        return segment.get(LAYOUT$maxMultiviewViewCount, OFFSET$maxMultiviewViewCount);
    }

    public void maxMultiviewViewCount(@unsigned int value) {
        segment.set(LAYOUT$maxMultiviewViewCount, OFFSET$maxMultiviewViewCount, value);
    }

    public @unsigned int maxMultiviewInstanceIndex() {
        return segment.get(LAYOUT$maxMultiviewInstanceIndex, OFFSET$maxMultiviewInstanceIndex);
    }

    public void maxMultiviewInstanceIndex(@unsigned int value) {
        segment.set(LAYOUT$maxMultiviewInstanceIndex, OFFSET$maxMultiviewInstanceIndex, value);
    }


    public static final class VkPhysicalDeviceMultiviewPropertiesFactory implements IFactory<VkPhysicalDeviceMultiviewProperties> {
        @Override
        public Class<VkPhysicalDeviceMultiviewProperties> clazz() {
            return VkPhysicalDeviceMultiviewProperties.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkPhysicalDeviceMultiviewProperties.LAYOUT;
        }

        @Override
        public VkPhysicalDeviceMultiviewProperties create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkPhysicalDeviceMultiviewProperties createUninit(MemorySegment segment) {
            return new VkPhysicalDeviceMultiviewProperties(segment);
        }
    }

    public static final VkPhysicalDeviceMultiviewPropertiesFactory FACTORY = new VkPhysicalDeviceMultiviewPropertiesFactory();
}