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

public record VkAccelerationStructureGeometryTrianglesDataKHR(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("vertexFormat"),
        VkDeviceOrHostAddressConstKHR.LAYOUT.withName("vertexData"),
        ValueLayout.JAVA_LONG.withName("vertexStride"),
        ValueLayout.JAVA_INT.withName("maxVertex"),
        ValueLayout.JAVA_INT.withName("indexType"),
        VkDeviceOrHostAddressConstKHR.LAYOUT.withName("indexData"),
        VkDeviceOrHostAddressConstKHR.LAYOUT.withName("transformData")
    );

    public static final PathElement PATH$sType = PathElement.groupElement(0);
    public static final PathElement PATH$pNext = PathElement.groupElement(1);
    public static final PathElement PATH$vertexFormat = PathElement.groupElement(2);
    public static final PathElement PATH$vertexData = PathElement.groupElement(3);
    public static final PathElement PATH$vertexStride = PathElement.groupElement(4);
    public static final PathElement PATH$maxVertex = PathElement.groupElement(5);
    public static final PathElement PATH$indexType = PathElement.groupElement(6);
    public static final PathElement PATH$indexData = PathElement.groupElement(7);
    public static final PathElement PATH$transformData = PathElement.groupElement(8);

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$vertexFormat = (OfInt) LAYOUT.select(PATH$vertexFormat);
    public static final UnionLayout LAYOUT$vertexData = (UnionLayout) LAYOUT.select(PATH$vertexData);
    public static final OfLong LAYOUT$vertexStride = (OfLong) LAYOUT.select(PATH$vertexStride);
    public static final OfInt LAYOUT$maxVertex = (OfInt) LAYOUT.select(PATH$maxVertex);
    public static final OfInt LAYOUT$indexType = (OfInt) LAYOUT.select(PATH$indexType);
    public static final UnionLayout LAYOUT$indexData = (UnionLayout) LAYOUT.select(PATH$indexData);
    public static final UnionLayout LAYOUT$transformData = (UnionLayout) LAYOUT.select(PATH$transformData);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$vertexFormat = LAYOUT.byteOffset(PATH$vertexFormat);
    public static final long OFFSET$vertexData = LAYOUT.byteOffset(PATH$vertexData);
    public static final long OFFSET$vertexStride = LAYOUT.byteOffset(PATH$vertexStride);
    public static final long OFFSET$maxVertex = LAYOUT.byteOffset(PATH$maxVertex);
    public static final long OFFSET$indexType = LAYOUT.byteOffset(PATH$indexType);
    public static final long OFFSET$indexData = LAYOUT.byteOffset(PATH$indexData);
    public static final long OFFSET$transformData = LAYOUT.byteOffset(PATH$transformData);

    public VkAccelerationStructureGeometryTrianglesDataKHR(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_GEOMETRY_TRIANGLES_DATA_KHR);
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

    public @enumtype(VkFormat.class) int vertexFormat() {
        return segment.get(LAYOUT$vertexFormat, OFFSET$vertexFormat);
    }

    public void vertexFormat(@enumtype(VkFormat.class) int value) {
        segment.set(LAYOUT$vertexFormat, OFFSET$vertexFormat, value);
    }

    public VkDeviceOrHostAddressConstKHR vertexData() {
        return new VkDeviceOrHostAddressConstKHR(segment.asSlice(OFFSET$vertexData, LAYOUT$vertexData));
    }

    public void vertexData(VkDeviceOrHostAddressConstKHR value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$vertexData, LAYOUT$vertexData.byteSize());
    }

    public @unsigned long vertexStride() {
        return segment.get(LAYOUT$vertexStride, OFFSET$vertexStride);
    }

    public void vertexStride(@unsigned long value) {
        segment.set(LAYOUT$vertexStride, OFFSET$vertexStride, value);
    }

    public @unsigned int maxVertex() {
        return segment.get(LAYOUT$maxVertex, OFFSET$maxVertex);
    }

    public void maxVertex(@unsigned int value) {
        segment.set(LAYOUT$maxVertex, OFFSET$maxVertex, value);
    }

    public @enumtype(VkIndexType.class) int indexType() {
        return segment.get(LAYOUT$indexType, OFFSET$indexType);
    }

    public void indexType(@enumtype(VkIndexType.class) int value) {
        segment.set(LAYOUT$indexType, OFFSET$indexType, value);
    }

    public VkDeviceOrHostAddressConstKHR indexData() {
        return new VkDeviceOrHostAddressConstKHR(segment.asSlice(OFFSET$indexData, LAYOUT$indexData));
    }

    public void indexData(VkDeviceOrHostAddressConstKHR value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$indexData, LAYOUT$indexData.byteSize());
    }

    public VkDeviceOrHostAddressConstKHR transformData() {
        return new VkDeviceOrHostAddressConstKHR(segment.asSlice(OFFSET$transformData, LAYOUT$transformData));
    }

    public void transformData(VkDeviceOrHostAddressConstKHR value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$transformData, LAYOUT$transformData.byteSize());
    }


    public static final class VkAccelerationStructureGeometryTrianglesDataKHRFactory implements IDataTypeFactory<VkAccelerationStructureGeometryTrianglesDataKHR> {
        @Override
        public Class<VkAccelerationStructureGeometryTrianglesDataKHR> clazz() {
            return VkAccelerationStructureGeometryTrianglesDataKHR.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkAccelerationStructureGeometryTrianglesDataKHR.LAYOUT;
        }

        @Override
        public VkAccelerationStructureGeometryTrianglesDataKHR create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkAccelerationStructureGeometryTrianglesDataKHR createUninit(MemorySegment segment) {
            return new VkAccelerationStructureGeometryTrianglesDataKHR(segment);
        }
    }

    public static final VkAccelerationStructureGeometryTrianglesDataKHRFactory FACTORY = new VkAccelerationStructureGeometryTrianglesDataKHRFactory();
}