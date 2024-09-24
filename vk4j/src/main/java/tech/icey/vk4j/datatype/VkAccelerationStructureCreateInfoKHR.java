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

public record VkAccelerationStructureCreateInfoKHR(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("createFlags"),
        ValueLayout.ADDRESS.withName("buffer"),
        ValueLayout.JAVA_LONG.withName("offset"),
        ValueLayout.JAVA_LONG.withName("size"),
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.JAVA_LONG.withName("deviceAddress")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$createFlags = PathElement.groupElement("createFlags");
    public static final PathElement PATH$buffer = PathElement.groupElement("buffer");
    public static final PathElement PATH$offset = PathElement.groupElement("offset");
    public static final PathElement PATH$size = PathElement.groupElement("size");
    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$deviceAddress = PathElement.groupElement("deviceAddress");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$createFlags = (OfInt) LAYOUT.select(PATH$createFlags);
    public static final AddressLayout LAYOUT$buffer = (AddressLayout) LAYOUT.select(PATH$buffer);
    public static final OfLong LAYOUT$offset = (OfLong) LAYOUT.select(PATH$offset);
    public static final OfLong LAYOUT$size = (OfLong) LAYOUT.select(PATH$size);
    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final OfLong LAYOUT$deviceAddress = (OfLong) LAYOUT.select(PATH$deviceAddress);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$createFlags = LAYOUT.byteOffset(PATH$createFlags);
    public static final long OFFSET$buffer = LAYOUT.byteOffset(PATH$buffer);
    public static final long OFFSET$offset = LAYOUT.byteOffset(PATH$offset);
    public static final long OFFSET$size = LAYOUT.byteOffset(PATH$size);
    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$deviceAddress = LAYOUT.byteOffset(PATH$deviceAddress);

    public VkAccelerationStructureCreateInfoKHR(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_CREATE_INFO_KHR);
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

    public @enumtype(VkAccelerationStructureCreateFlagsKHR.class) int createFlags() {
        return segment.get(LAYOUT$createFlags, OFFSET$createFlags);
    }

    public void createFlags(@enumtype(VkAccelerationStructureCreateFlagsKHR.class) int value) {
        segment.set(LAYOUT$createFlags, OFFSET$createFlags, value);
    }

    public VkBuffer buffer() {
        return new VkBuffer(segment.asSlice(OFFSET$buffer, LAYOUT$buffer));
    }

    public void buffer(VkBuffer value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$buffer, LAYOUT$buffer.byteSize());
    }

    public @unsigned long offset() {
        return segment.get(LAYOUT$offset, OFFSET$offset);
    }

    public void offset(@unsigned long value) {
        segment.set(LAYOUT$offset, OFFSET$offset, value);
    }

    public @unsigned long size() {
        return segment.get(LAYOUT$size, OFFSET$size);
    }

    public void size(@unsigned long value) {
        segment.set(LAYOUT$size, OFFSET$size, value);
    }

    public @enumtype(VkAccelerationStructureTypeKHR.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public void type(@enumtype(VkAccelerationStructureTypeKHR.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
    }

    public @unsigned long deviceAddress() {
        return segment.get(LAYOUT$deviceAddress, OFFSET$deviceAddress);
    }

    public void deviceAddress(@unsigned long value) {
        segment.set(LAYOUT$deviceAddress, OFFSET$deviceAddress, value);
    }


    public static final class VkAccelerationStructureCreateInfoKHRFactory implements IFactory<VkAccelerationStructureCreateInfoKHR> {
        @Override
        public Class<VkAccelerationStructureCreateInfoKHR> clazz() {
            return VkAccelerationStructureCreateInfoKHR.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkAccelerationStructureCreateInfoKHR.LAYOUT;
        }

        @Override
        public VkAccelerationStructureCreateInfoKHR create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkAccelerationStructureCreateInfoKHR createUninit(MemorySegment segment) {
            return new VkAccelerationStructureCreateInfoKHR(segment);
        }
    }

    public static final VkAccelerationStructureCreateInfoKHRFactory FACTORY = new VkAccelerationStructureCreateInfoKHRFactory();
}
