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

public record VkDeviceFaultCountsEXT(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("addressInfoCount"),
        ValueLayout.JAVA_INT.withName("vendorInfoCount"),
        ValueLayout.JAVA_LONG.withName("vendorBinarySize")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$addressInfoCount = PathElement.groupElement("addressInfoCount");
    public static final PathElement PATH$vendorInfoCount = PathElement.groupElement("vendorInfoCount");
    public static final PathElement PATH$vendorBinarySize = PathElement.groupElement("vendorBinarySize");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$addressInfoCount = (OfInt) LAYOUT.select(PATH$addressInfoCount);
    public static final OfInt LAYOUT$vendorInfoCount = (OfInt) LAYOUT.select(PATH$vendorInfoCount);
    public static final OfLong LAYOUT$vendorBinarySize = (OfLong) LAYOUT.select(PATH$vendorBinarySize);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$addressInfoCount = LAYOUT.byteOffset(PATH$addressInfoCount);
    public static final long OFFSET$vendorInfoCount = LAYOUT.byteOffset(PATH$vendorInfoCount);
    public static final long OFFSET$vendorBinarySize = LAYOUT.byteOffset(PATH$vendorBinarySize);

    public VkDeviceFaultCountsEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_DEVICE_FAULT_COUNTS_EXT);
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

    public @unsigned int addressInfoCount() {
        return segment.get(LAYOUT$addressInfoCount, OFFSET$addressInfoCount);
    }

    public void addressInfoCount(@unsigned int value) {
        segment.set(LAYOUT$addressInfoCount, OFFSET$addressInfoCount, value);
    }

    public @unsigned int vendorInfoCount() {
        return segment.get(LAYOUT$vendorInfoCount, OFFSET$vendorInfoCount);
    }

    public void vendorInfoCount(@unsigned int value) {
        segment.set(LAYOUT$vendorInfoCount, OFFSET$vendorInfoCount, value);
    }

    public @unsigned long vendorBinarySize() {
        return segment.get(LAYOUT$vendorBinarySize, OFFSET$vendorBinarySize);
    }

    public void vendorBinarySize(@unsigned long value) {
        segment.set(LAYOUT$vendorBinarySize, OFFSET$vendorBinarySize, value);
    }


    public static final class VkDeviceFaultCountsEXTFactory implements IFactory<VkDeviceFaultCountsEXT> {
        @Override
        public Class<VkDeviceFaultCountsEXT> clazz() {
            return VkDeviceFaultCountsEXT.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkDeviceFaultCountsEXT.LAYOUT;
        }

        @Override
        public VkDeviceFaultCountsEXT create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkDeviceFaultCountsEXT createUninit(MemorySegment segment) {
            return new VkDeviceFaultCountsEXT(segment);
        }
    }

    public static final VkDeviceFaultCountsEXTFactory FACTORY = new VkDeviceFaultCountsEXTFactory();
}
