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

public record VkStridedDeviceAddressRegionKHR(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_LONG.withName("deviceAddress"),
        ValueLayout.JAVA_LONG.withName("stride"),
        ValueLayout.JAVA_LONG.withName("size")
    );

    public static final PathElement PATH$deviceAddress = PathElement.groupElement("deviceAddress");
    public static final PathElement PATH$stride = PathElement.groupElement("stride");
    public static final PathElement PATH$size = PathElement.groupElement("size");

    public static final OfLong LAYOUT$deviceAddress = (OfLong) LAYOUT.select(PATH$deviceAddress);
    public static final OfLong LAYOUT$stride = (OfLong) LAYOUT.select(PATH$stride);
    public static final OfLong LAYOUT$size = (OfLong) LAYOUT.select(PATH$size);

    public static final long OFFSET$deviceAddress = LAYOUT.byteOffset(PATH$deviceAddress);
    public static final long OFFSET$stride = LAYOUT.byteOffset(PATH$stride);
    public static final long OFFSET$size = LAYOUT.byteOffset(PATH$size);

    public VkStridedDeviceAddressRegionKHR(MemorySegment segment) {
        this.segment = segment;
    }

    public @unsigned long deviceAddress() {
        return segment.get(LAYOUT$deviceAddress, OFFSET$deviceAddress);
    }

    public void deviceAddress(@unsigned long value) {
        segment.set(LAYOUT$deviceAddress, OFFSET$deviceAddress, value);
    }

    public @unsigned long stride() {
        return segment.get(LAYOUT$stride, OFFSET$stride);
    }

    public void stride(@unsigned long value) {
        segment.set(LAYOUT$stride, OFFSET$stride, value);
    }

    public @unsigned long size() {
        return segment.get(LAYOUT$size, OFFSET$size);
    }

    public void size(@unsigned long value) {
        segment.set(LAYOUT$size, OFFSET$size, value);
    }


    public static final class VkStridedDeviceAddressRegionKHRFactory implements IFactory<VkStridedDeviceAddressRegionKHR> {
        @Override
        public Class<VkStridedDeviceAddressRegionKHR> clazz() {
            return VkStridedDeviceAddressRegionKHR.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkStridedDeviceAddressRegionKHR.LAYOUT;
        }

        @Override
        public VkStridedDeviceAddressRegionKHR create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkStridedDeviceAddressRegionKHR createUninit(MemorySegment segment) {
            return new VkStridedDeviceAddressRegionKHR(segment);
        }
    }

    public static final VkStridedDeviceAddressRegionKHRFactory FACTORY = new VkStridedDeviceAddressRegionKHRFactory();
}
