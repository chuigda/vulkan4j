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

public record VkSwapchainCounterCreateInfoEXT(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("surfaceCounters")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$surfaceCounters = PathElement.groupElement("surfaceCounters");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$surfaceCounters = (OfInt) LAYOUT.select(PATH$surfaceCounters);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$surfaceCounters = LAYOUT.byteOffset(PATH$surfaceCounters);

    public VkSwapchainCounterCreateInfoEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_SWAPCHAIN_COUNTER_CREATE_INFO_EXT);
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

    public @enumtype(VkSurfaceCounterFlagsEXT.class) int surfaceCounters() {
        return segment.get(LAYOUT$surfaceCounters, OFFSET$surfaceCounters);
    }

    public void surfaceCounters(@enumtype(VkSurfaceCounterFlagsEXT.class) int value) {
        segment.set(LAYOUT$surfaceCounters, OFFSET$surfaceCounters, value);
    }


    public static final class Factory implements IFactory<VkSwapchainCounterCreateInfoEXT> {
        @Override
        public Class<VkSwapchainCounterCreateInfoEXT> clazz() {
            return VkSwapchainCounterCreateInfoEXT.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkSwapchainCounterCreateInfoEXT.LAYOUT;
        }

        @Override
        public VkSwapchainCounterCreateInfoEXT create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkSwapchainCounterCreateInfoEXT createUninit(MemorySegment segment) {
            return new VkSwapchainCounterCreateInfoEXT(segment);
        }
    }

    public static final Factory FACTORY = new Factory();
}
