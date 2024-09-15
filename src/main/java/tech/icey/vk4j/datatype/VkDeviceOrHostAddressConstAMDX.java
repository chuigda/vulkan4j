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
import tech.icey.vk4j.IDataTypeFactory;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

public record VkDeviceOrHostAddressConstAMDX(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_LONG.withName("deviceAddress"),
        ValueLayout.ADDRESS.withName("hostAddress")
    );

    public static final PathElement PATH$deviceAddress = PathElement.groupElement(0);
    public static final PathElement PATH$hostAddress = PathElement.groupElement(1);

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


    public static final class VkDeviceOrHostAddressConstAMDXFactory implements IDataTypeFactory<VkDeviceOrHostAddressConstAMDX> {
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

    public static final VkDeviceOrHostAddressConstAMDXFactory FACTORY = new VkDeviceOrHostAddressConstAMDXFactory();
}
