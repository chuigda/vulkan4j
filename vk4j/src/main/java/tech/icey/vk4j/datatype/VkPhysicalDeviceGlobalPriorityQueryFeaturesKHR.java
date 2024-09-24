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

public record VkPhysicalDeviceGlobalPriorityQueryFeaturesKHR(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("globalPriorityQuery")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$globalPriorityQuery = PathElement.groupElement("globalPriorityQuery");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$globalPriorityQuery = (OfInt) LAYOUT.select(PATH$globalPriorityQuery);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$globalPriorityQuery = LAYOUT.byteOffset(PATH$globalPriorityQuery);

    public VkPhysicalDeviceGlobalPriorityQueryFeaturesKHR(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_GLOBAL_PRIORITY_QUERY_FEATURES_KHR);
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

    public @unsigned int globalPriorityQuery() {
        return segment.get(LAYOUT$globalPriorityQuery, OFFSET$globalPriorityQuery);
    }

    public void globalPriorityQuery(@unsigned int value) {
        segment.set(LAYOUT$globalPriorityQuery, OFFSET$globalPriorityQuery, value);
    }


    public static final class Factory implements IFactory<VkPhysicalDeviceGlobalPriorityQueryFeaturesKHR> {
        @Override
        public Class<VkPhysicalDeviceGlobalPriorityQueryFeaturesKHR> clazz() {
            return VkPhysicalDeviceGlobalPriorityQueryFeaturesKHR.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkPhysicalDeviceGlobalPriorityQueryFeaturesKHR.LAYOUT;
        }

        @Override
        public VkPhysicalDeviceGlobalPriorityQueryFeaturesKHR create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkPhysicalDeviceGlobalPriorityQueryFeaturesKHR createUninit(MemorySegment segment) {
            return new VkPhysicalDeviceGlobalPriorityQueryFeaturesKHR(segment);
        }
    }

    public static final Factory FACTORY = new Factory();
}
