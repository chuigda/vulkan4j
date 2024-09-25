package tech.icey.vk4j.datatype;

import tech.icey.vk4j.IFactory;
import tech.icey.vk4j.NativeLayout;
import tech.icey.vk4j.annotation.enumtype;
import tech.icey.vk4j.annotation.nullable;
import tech.icey.vk4j.annotation.pointer;
import tech.icey.vk4j.annotation.unsigned;
import tech.icey.vk4j.enumtype.VkStructureType;

import java.lang.foreign.AddressLayout;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;

import static java.lang.foreign.ValueLayout.OfInt;
import static java.lang.foreign.ValueLayout.PathElement;
import static tech.icey.vk4j.enumtype.VkStructureType.VK_STRUCTURE_TYPE_PRESENT_TIMES_INFO_GOOGLE;

public record VkPresentTimesInfoGOOGLE(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("swapchainCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkPresentTimeGOOGLE.LAYOUT).withName("pTimes")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$swapchainCount = PathElement.groupElement("swapchainCount");
    public static final PathElement PATH$pTimes = PathElement.groupElement("pTimes");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$swapchainCount = (OfInt) LAYOUT.select(PATH$swapchainCount);
    public static final AddressLayout LAYOUT$pTimes = (AddressLayout) LAYOUT.select(PATH$pTimes);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$swapchainCount = LAYOUT.byteOffset(PATH$swapchainCount);
    public static final long OFFSET$pTimes = LAYOUT.byteOffset(PATH$pTimes);

    public VkPresentTimesInfoGOOGLE(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PRESENT_TIMES_INFO_GOOGLE);
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

    public @unsigned int swapchainCount() {
        return segment.get(LAYOUT$swapchainCount, OFFSET$swapchainCount);
    }

    public void swapchainCount(@unsigned int value) {
        segment.set(LAYOUT$swapchainCount, OFFSET$swapchainCount, value);
    }

    public @pointer(comment="VkPresentTimeGOOGLE*") MemorySegment pTimesRaw() {
        return segment.get(LAYOUT$pTimes, OFFSET$pTimes);
    }

    public void pTimesRaw(@pointer(comment="VkPresentTimeGOOGLE*") MemorySegment value) {
        segment.set(LAYOUT$pTimes, OFFSET$pTimes, value);
    }

    public @nullable VkPresentTimeGOOGLE pTimes() {
        MemorySegment s = pTimesRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkPresentTimeGOOGLE(s);
    }

    public void pTimes(@nullable VkPresentTimeGOOGLE value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pTimesRaw(s);
    }


    public static final class Factory implements IFactory<VkPresentTimesInfoGOOGLE> {
        @Override
        public Class<VkPresentTimesInfoGOOGLE> clazz() {
            return VkPresentTimesInfoGOOGLE.class;
        }

        @Override
        public MemoryLayout layout() {
            return VkPresentTimesInfoGOOGLE.LAYOUT;
        }

        @Override
        public VkPresentTimesInfoGOOGLE create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkPresentTimesInfoGOOGLE createUninit(MemorySegment segment) {
            return new VkPresentTimesInfoGOOGLE(segment);
        }
    }

    public static final Factory FACTORY = new Factory();
}
