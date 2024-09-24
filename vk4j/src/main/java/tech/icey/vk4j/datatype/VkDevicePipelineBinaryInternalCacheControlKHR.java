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

public record VkDevicePipelineBinaryInternalCacheControlKHR(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("disableInternalCache")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$disableInternalCache = PathElement.groupElement("disableInternalCache");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$disableInternalCache = (OfInt) LAYOUT.select(PATH$disableInternalCache);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$disableInternalCache = LAYOUT.byteOffset(PATH$disableInternalCache);

    public VkDevicePipelineBinaryInternalCacheControlKHR(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_DEVICE_PIPELINE_BINARY_INTERNAL_CACHE_CONTROL_KHR);
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

    public @unsigned int disableInternalCache() {
        return segment.get(LAYOUT$disableInternalCache, OFFSET$disableInternalCache);
    }

    public void disableInternalCache(@unsigned int value) {
        segment.set(LAYOUT$disableInternalCache, OFFSET$disableInternalCache, value);
    }


    public static final class Factory implements IFactory<VkDevicePipelineBinaryInternalCacheControlKHR> {
        @Override
        public Class<VkDevicePipelineBinaryInternalCacheControlKHR> clazz() {
            return VkDevicePipelineBinaryInternalCacheControlKHR.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkDevicePipelineBinaryInternalCacheControlKHR.LAYOUT;
        }

        @Override
        public VkDevicePipelineBinaryInternalCacheControlKHR create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkDevicePipelineBinaryInternalCacheControlKHR createUninit(MemorySegment segment) {
            return new VkDevicePipelineBinaryInternalCacheControlKHR(segment);
        }
    }

    public static final Factory FACTORY = new Factory();
}
