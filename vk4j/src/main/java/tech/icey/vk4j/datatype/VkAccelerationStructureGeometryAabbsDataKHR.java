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

public record VkAccelerationStructureGeometryAabbsDataKHR(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        VkDeviceOrHostAddressConstKHR.LAYOUT.withName("data"),
        ValueLayout.JAVA_LONG.withName("stride")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$data = PathElement.groupElement("data");
    public static final PathElement PATH$stride = PathElement.groupElement("stride");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final UnionLayout LAYOUT$data = (UnionLayout) LAYOUT.select(PATH$data);
    public static final OfLong LAYOUT$stride = (OfLong) LAYOUT.select(PATH$stride);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$data = LAYOUT.byteOffset(PATH$data);
    public static final long OFFSET$stride = LAYOUT.byteOffset(PATH$stride);

    public VkAccelerationStructureGeometryAabbsDataKHR(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_GEOMETRY_AABBS_DATA_KHR);
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

    public VkDeviceOrHostAddressConstKHR data() {
        return new VkDeviceOrHostAddressConstKHR(segment.asSlice(OFFSET$data, LAYOUT$data));
    }

    public void data(VkDeviceOrHostAddressConstKHR value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$data, LAYOUT$data.byteSize());
    }

    public @unsigned long stride() {
        return segment.get(LAYOUT$stride, OFFSET$stride);
    }

    public void stride(@unsigned long value) {
        segment.set(LAYOUT$stride, OFFSET$stride, value);
    }


    public static final class VkAccelerationStructureGeometryAabbsDataKHRFactory implements IFactory<VkAccelerationStructureGeometryAabbsDataKHR> {
        @Override
        public Class<VkAccelerationStructureGeometryAabbsDataKHR> clazz() {
            return VkAccelerationStructureGeometryAabbsDataKHR.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkAccelerationStructureGeometryAabbsDataKHR.LAYOUT;
        }

        @Override
        public VkAccelerationStructureGeometryAabbsDataKHR create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkAccelerationStructureGeometryAabbsDataKHR createUninit(MemorySegment segment) {
            return new VkAccelerationStructureGeometryAabbsDataKHR(segment);
        }
    }

    public static final VkAccelerationStructureGeometryAabbsDataKHRFactory FACTORY = new VkAccelerationStructureGeometryAabbsDataKHRFactory();
}
