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

public record VkAccelerationStructureTrianglesDisplacementMicromapNV(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("displacementBiasAndScaleFormat"),
        ValueLayout.JAVA_INT.withName("displacementVectorFormat"),
        VkDeviceOrHostAddressConstKHR.LAYOUT.withName("displacementBiasAndScaleBuffer"),
        ValueLayout.JAVA_LONG.withName("displacementBiasAndScaleStride"),
        VkDeviceOrHostAddressConstKHR.LAYOUT.withName("displacementVectorBuffer"),
        ValueLayout.JAVA_LONG.withName("displacementVectorStride"),
        VkDeviceOrHostAddressConstKHR.LAYOUT.withName("displacedMicromapPrimitiveFlags"),
        ValueLayout.JAVA_LONG.withName("displacedMicromapPrimitiveFlagsStride"),
        ValueLayout.JAVA_INT.withName("indexType"),
        VkDeviceOrHostAddressConstKHR.LAYOUT.withName("indexBuffer"),
        ValueLayout.JAVA_LONG.withName("indexStride"),
        ValueLayout.JAVA_INT.withName("baseTriangle"),
        ValueLayout.JAVA_INT.withName("usageCountsCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkMicromapUsageEXT.LAYOUT).withName("pUsageCounts"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS.withTargetLayout(VkMicromapUsageEXT.LAYOUT)).withName("ppUsageCounts"),
        ValueLayout.ADDRESS.withName("micromap")
    );

    public static final PathElement PATH$sType = PathElement.groupElement(0);
    public static final PathElement PATH$pNext = PathElement.groupElement(1);
    public static final PathElement PATH$displacementBiasAndScaleFormat = PathElement.groupElement(2);
    public static final PathElement PATH$displacementVectorFormat = PathElement.groupElement(3);
    public static final PathElement PATH$displacementBiasAndScaleBuffer = PathElement.groupElement(4);
    public static final PathElement PATH$displacementBiasAndScaleStride = PathElement.groupElement(5);
    public static final PathElement PATH$displacementVectorBuffer = PathElement.groupElement(6);
    public static final PathElement PATH$displacementVectorStride = PathElement.groupElement(7);
    public static final PathElement PATH$displacedMicromapPrimitiveFlags = PathElement.groupElement(8);
    public static final PathElement PATH$displacedMicromapPrimitiveFlagsStride = PathElement.groupElement(9);
    public static final PathElement PATH$indexType = PathElement.groupElement(10);
    public static final PathElement PATH$indexBuffer = PathElement.groupElement(11);
    public static final PathElement PATH$indexStride = PathElement.groupElement(12);
    public static final PathElement PATH$baseTriangle = PathElement.groupElement(13);
    public static final PathElement PATH$usageCountsCount = PathElement.groupElement(14);
    public static final PathElement PATH$pUsageCounts = PathElement.groupElement(15);
    public static final PathElement PATH$ppUsageCounts = PathElement.groupElement(16);
    public static final PathElement PATH$micromap = PathElement.groupElement(17);

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$displacementBiasAndScaleFormat = (OfInt) LAYOUT.select(PATH$displacementBiasAndScaleFormat);
    public static final OfInt LAYOUT$displacementVectorFormat = (OfInt) LAYOUT.select(PATH$displacementVectorFormat);
    public static final UnionLayout LAYOUT$displacementBiasAndScaleBuffer = (UnionLayout) LAYOUT.select(PATH$displacementBiasAndScaleBuffer);
    public static final OfLong LAYOUT$displacementBiasAndScaleStride = (OfLong) LAYOUT.select(PATH$displacementBiasAndScaleStride);
    public static final UnionLayout LAYOUT$displacementVectorBuffer = (UnionLayout) LAYOUT.select(PATH$displacementVectorBuffer);
    public static final OfLong LAYOUT$displacementVectorStride = (OfLong) LAYOUT.select(PATH$displacementVectorStride);
    public static final UnionLayout LAYOUT$displacedMicromapPrimitiveFlags = (UnionLayout) LAYOUT.select(PATH$displacedMicromapPrimitiveFlags);
    public static final OfLong LAYOUT$displacedMicromapPrimitiveFlagsStride = (OfLong) LAYOUT.select(PATH$displacedMicromapPrimitiveFlagsStride);
    public static final OfInt LAYOUT$indexType = (OfInt) LAYOUT.select(PATH$indexType);
    public static final UnionLayout LAYOUT$indexBuffer = (UnionLayout) LAYOUT.select(PATH$indexBuffer);
    public static final OfLong LAYOUT$indexStride = (OfLong) LAYOUT.select(PATH$indexStride);
    public static final OfInt LAYOUT$baseTriangle = (OfInt) LAYOUT.select(PATH$baseTriangle);
    public static final OfInt LAYOUT$usageCountsCount = (OfInt) LAYOUT.select(PATH$usageCountsCount);
    public static final AddressLayout LAYOUT$pUsageCounts = (AddressLayout) LAYOUT.select(PATH$pUsageCounts);
    public static final AddressLayout LAYOUT$ppUsageCounts = (AddressLayout) LAYOUT.select(PATH$ppUsageCounts);
    public static final AddressLayout LAYOUT$micromap = (AddressLayout) LAYOUT.select(PATH$micromap);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$displacementBiasAndScaleFormat = LAYOUT.byteOffset(PATH$displacementBiasAndScaleFormat);
    public static final long OFFSET$displacementVectorFormat = LAYOUT.byteOffset(PATH$displacementVectorFormat);
    public static final long OFFSET$displacementBiasAndScaleBuffer = LAYOUT.byteOffset(PATH$displacementBiasAndScaleBuffer);
    public static final long OFFSET$displacementBiasAndScaleStride = LAYOUT.byteOffset(PATH$displacementBiasAndScaleStride);
    public static final long OFFSET$displacementVectorBuffer = LAYOUT.byteOffset(PATH$displacementVectorBuffer);
    public static final long OFFSET$displacementVectorStride = LAYOUT.byteOffset(PATH$displacementVectorStride);
    public static final long OFFSET$displacedMicromapPrimitiveFlags = LAYOUT.byteOffset(PATH$displacedMicromapPrimitiveFlags);
    public static final long OFFSET$displacedMicromapPrimitiveFlagsStride = LAYOUT.byteOffset(PATH$displacedMicromapPrimitiveFlagsStride);
    public static final long OFFSET$indexType = LAYOUT.byteOffset(PATH$indexType);
    public static final long OFFSET$indexBuffer = LAYOUT.byteOffset(PATH$indexBuffer);
    public static final long OFFSET$indexStride = LAYOUT.byteOffset(PATH$indexStride);
    public static final long OFFSET$baseTriangle = LAYOUT.byteOffset(PATH$baseTriangle);
    public static final long OFFSET$usageCountsCount = LAYOUT.byteOffset(PATH$usageCountsCount);
    public static final long OFFSET$pUsageCounts = LAYOUT.byteOffset(PATH$pUsageCounts);
    public static final long OFFSET$ppUsageCounts = LAYOUT.byteOffset(PATH$ppUsageCounts);
    public static final long OFFSET$micromap = LAYOUT.byteOffset(PATH$micromap);

    public VkAccelerationStructureTrianglesDisplacementMicromapNV(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_TRIANGLES_DISPLACEMENT_MICROMAP_NV);
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

    public @enumtype(VkFormat.class) int displacementBiasAndScaleFormat() {
        return segment.get(LAYOUT$displacementBiasAndScaleFormat, OFFSET$displacementBiasAndScaleFormat);
    }

    public void displacementBiasAndScaleFormat(@enumtype(VkFormat.class) int value) {
        segment.set(LAYOUT$displacementBiasAndScaleFormat, OFFSET$displacementBiasAndScaleFormat, value);
    }

    public @enumtype(VkFormat.class) int displacementVectorFormat() {
        return segment.get(LAYOUT$displacementVectorFormat, OFFSET$displacementVectorFormat);
    }

    public void displacementVectorFormat(@enumtype(VkFormat.class) int value) {
        segment.set(LAYOUT$displacementVectorFormat, OFFSET$displacementVectorFormat, value);
    }

    public VkDeviceOrHostAddressConstKHR displacementBiasAndScaleBuffer() {
        return new VkDeviceOrHostAddressConstKHR(segment.asSlice(OFFSET$displacementBiasAndScaleBuffer, LAYOUT$displacementBiasAndScaleBuffer));
    }

    public void displacementBiasAndScaleBuffer(VkDeviceOrHostAddressConstKHR value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$displacementBiasAndScaleBuffer, LAYOUT$displacementBiasAndScaleBuffer.byteSize());
    }

    public @unsigned long displacementBiasAndScaleStride() {
        return segment.get(LAYOUT$displacementBiasAndScaleStride, OFFSET$displacementBiasAndScaleStride);
    }

    public void displacementBiasAndScaleStride(@unsigned long value) {
        segment.set(LAYOUT$displacementBiasAndScaleStride, OFFSET$displacementBiasAndScaleStride, value);
    }

    public VkDeviceOrHostAddressConstKHR displacementVectorBuffer() {
        return new VkDeviceOrHostAddressConstKHR(segment.asSlice(OFFSET$displacementVectorBuffer, LAYOUT$displacementVectorBuffer));
    }

    public void displacementVectorBuffer(VkDeviceOrHostAddressConstKHR value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$displacementVectorBuffer, LAYOUT$displacementVectorBuffer.byteSize());
    }

    public @unsigned long displacementVectorStride() {
        return segment.get(LAYOUT$displacementVectorStride, OFFSET$displacementVectorStride);
    }

    public void displacementVectorStride(@unsigned long value) {
        segment.set(LAYOUT$displacementVectorStride, OFFSET$displacementVectorStride, value);
    }

    public VkDeviceOrHostAddressConstKHR displacedMicromapPrimitiveFlags() {
        return new VkDeviceOrHostAddressConstKHR(segment.asSlice(OFFSET$displacedMicromapPrimitiveFlags, LAYOUT$displacedMicromapPrimitiveFlags));
    }

    public void displacedMicromapPrimitiveFlags(VkDeviceOrHostAddressConstKHR value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$displacedMicromapPrimitiveFlags, LAYOUT$displacedMicromapPrimitiveFlags.byteSize());
    }

    public @unsigned long displacedMicromapPrimitiveFlagsStride() {
        return segment.get(LAYOUT$displacedMicromapPrimitiveFlagsStride, OFFSET$displacedMicromapPrimitiveFlagsStride);
    }

    public void displacedMicromapPrimitiveFlagsStride(@unsigned long value) {
        segment.set(LAYOUT$displacedMicromapPrimitiveFlagsStride, OFFSET$displacedMicromapPrimitiveFlagsStride, value);
    }

    public @enumtype(VkIndexType.class) int indexType() {
        return segment.get(LAYOUT$indexType, OFFSET$indexType);
    }

    public void indexType(@enumtype(VkIndexType.class) int value) {
        segment.set(LAYOUT$indexType, OFFSET$indexType, value);
    }

    public VkDeviceOrHostAddressConstKHR indexBuffer() {
        return new VkDeviceOrHostAddressConstKHR(segment.asSlice(OFFSET$indexBuffer, LAYOUT$indexBuffer));
    }

    public void indexBuffer(VkDeviceOrHostAddressConstKHR value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$indexBuffer, LAYOUT$indexBuffer.byteSize());
    }

    public @unsigned long indexStride() {
        return segment.get(LAYOUT$indexStride, OFFSET$indexStride);
    }

    public void indexStride(@unsigned long value) {
        segment.set(LAYOUT$indexStride, OFFSET$indexStride, value);
    }

    public @unsigned int baseTriangle() {
        return segment.get(LAYOUT$baseTriangle, OFFSET$baseTriangle);
    }

    public void baseTriangle(@unsigned int value) {
        segment.set(LAYOUT$baseTriangle, OFFSET$baseTriangle, value);
    }

    public @unsigned int usageCountsCount() {
        return segment.get(LAYOUT$usageCountsCount, OFFSET$usageCountsCount);
    }

    public void usageCountsCount(@unsigned int value) {
        segment.set(LAYOUT$usageCountsCount, OFFSET$usageCountsCount, value);
    }

    public @pointer(comment="VkMicromapUsageEXT*") MemorySegment pUsageCountsRaw() {
        return segment.get(LAYOUT$pUsageCounts, OFFSET$pUsageCounts);
    }

    public void pUsageCountsRaw(@pointer(comment="VkMicromapUsageEXT*") MemorySegment value) {
        segment.set(LAYOUT$pUsageCounts, OFFSET$pUsageCounts, value);
    }
    
    public VkMicromapUsageEXT pUsageCounts() {
        MemorySegment s = pUsageCountsRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkMicromapUsageEXT(s);
    }

    public void pUsageCounts(VkMicromapUsageEXT value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pUsageCountsRaw(s);
    }

    public @pointer(comment="void**") MemorySegment ppUsageCounts() {
        return segment.get(LAYOUT$ppUsageCounts, OFFSET$ppUsageCounts);
    }

    public void ppUsageCounts(@pointer(comment="void**") MemorySegment value) {
        segment.set(LAYOUT$ppUsageCounts, OFFSET$ppUsageCounts, value);
    }

    public VkMicromapEXT micromap() {
        return new VkMicromapEXT(segment.asSlice(OFFSET$micromap, LAYOUT$micromap));
    }

    public void micromap(VkMicromapEXT value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$micromap, LAYOUT$micromap.byteSize());
    }


    public static final class VkAccelerationStructureTrianglesDisplacementMicromapNVFactory implements IDataTypeFactory<VkAccelerationStructureTrianglesDisplacementMicromapNV> {
        @Override
        public Class<VkAccelerationStructureTrianglesDisplacementMicromapNV> clazz() {
            return VkAccelerationStructureTrianglesDisplacementMicromapNV.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkAccelerationStructureTrianglesDisplacementMicromapNV.LAYOUT;
        }

        @Override
        public VkAccelerationStructureTrianglesDisplacementMicromapNV create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkAccelerationStructureTrianglesDisplacementMicromapNV createUninit(MemorySegment segment) {
            return new VkAccelerationStructureTrianglesDisplacementMicromapNV(segment);
        }
    }

    public static final VkAccelerationStructureTrianglesDisplacementMicromapNVFactory FACTORY = new VkAccelerationStructureTrianglesDisplacementMicromapNVFactory();
}
