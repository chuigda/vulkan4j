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

public record VkAccelerationStructureGeometryMotionTrianglesDataNV(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        VkDeviceOrHostAddressConstKHR.LAYOUT.withName("vertexData")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$vertexData = PathElement.groupElement("vertexData");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final UnionLayout LAYOUT$vertexData = (UnionLayout) LAYOUT.select(PATH$vertexData);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$vertexData = LAYOUT.byteOffset(PATH$vertexData);

    public VkAccelerationStructureGeometryMotionTrianglesDataNV(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_GEOMETRY_MOTION_TRIANGLES_DATA_NV);
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

    public VkDeviceOrHostAddressConstKHR vertexData() {
        return new VkDeviceOrHostAddressConstKHR(segment.asSlice(OFFSET$vertexData, LAYOUT$vertexData));
    }

    public void vertexData(VkDeviceOrHostAddressConstKHR value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$vertexData, LAYOUT$vertexData.byteSize());
    }


    public static final class VkAccelerationStructureGeometryMotionTrianglesDataNVFactory implements IFactory<VkAccelerationStructureGeometryMotionTrianglesDataNV> {
        @Override
        public Class<VkAccelerationStructureGeometryMotionTrianglesDataNV> clazz() {
            return VkAccelerationStructureGeometryMotionTrianglesDataNV.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkAccelerationStructureGeometryMotionTrianglesDataNV.LAYOUT;
        }

        @Override
        public VkAccelerationStructureGeometryMotionTrianglesDataNV create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkAccelerationStructureGeometryMotionTrianglesDataNV createUninit(MemorySegment segment) {
            return new VkAccelerationStructureGeometryMotionTrianglesDataNV(segment);
        }
    }

    public static final VkAccelerationStructureGeometryMotionTrianglesDataNVFactory FACTORY = new VkAccelerationStructureGeometryMotionTrianglesDataNVFactory();
}
