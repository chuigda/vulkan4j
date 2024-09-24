package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.annotation.*;
import tech.icey.vk4j.NativeLayout;
import tech.icey.vk4j.IFactory;

public record VkDeviceOrHostAddressConstAMDX(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.unionLayout(
        ValueLayout.JAVA_LONG.withName("deviceAddress"),
        ValueLayout.ADDRESS.withName("hostAddress")
    );

    public static final PathElement PATH$deviceAddress = PathElement.groupElement("deviceAddress");
    public static final PathElement PATH$hostAddress = PathElement.groupElement("hostAddress");

    public static final OfLong LAYOUT$deviceAddress = (OfLong) LAYOUT.select(PATH$deviceAddress);
    public static final AddressLayout LAYOUT$hostAddress = (AddressLayout) LAYOUT.select(PATH$hostAddress);

    public static final long OFFSET$deviceAddress = LAYOUT.byteOffset(PATH$deviceAddress);
    public static final long OFFSET$hostAddress = LAYOUT.byteOffset(PATH$hostAddress);

    public VkDeviceOrHostAddressConstAMDX(MemorySegment segment) {
        this.segment = segment;
    }

    public @unsigned long deviceAddress() {
        return segment.get(LAYOUT$deviceAddress, OFFSET$deviceAddress);
    }

    public void deviceAddress(@unsigned long value) {
        segment.set(LAYOUT$deviceAddress, OFFSET$deviceAddress, value);
    }

    public @pointer(comment="void*") MemorySegment hostAddress() {
        return segment.get(LAYOUT$hostAddress, OFFSET$hostAddress);
    }

    public void hostAddress(@pointer(comment="void*") MemorySegment value) {
        segment.set(LAYOUT$hostAddress, OFFSET$hostAddress, value);
    }


    public static final class Factory implements IFactory<VkDeviceOrHostAddressConstAMDX> {
        @Override
        public Class<VkDeviceOrHostAddressConstAMDX> clazz() {
            return VkDeviceOrHostAddressConstAMDX.class;
        }

        @Override
        public MemoryLayout layout() {
            return VkDeviceOrHostAddressConstAMDX.LAYOUT;
        }

        @Override
        public VkDeviceOrHostAddressConstAMDX create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkDeviceOrHostAddressConstAMDX createUninit(MemorySegment segment) {
            return new VkDeviceOrHostAddressConstAMDX(segment);
        }
    }

    public static final Factory FACTORY = new Factory();
}
