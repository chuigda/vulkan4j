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

public record VkAccelerationStructureInfoNV(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("instanceCount"),
        ValueLayout.JAVA_INT.withName("geometryCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkGeometryNV.LAYOUT).withName("pGeometries")
    );

    public static final PathElement PATH$sType = PathElement.groupElement(0);
    public static final PathElement PATH$pNext = PathElement.groupElement(1);
    public static final PathElement PATH$type = PathElement.groupElement(2);
    public static final PathElement PATH$flags = PathElement.groupElement(3);
    public static final PathElement PATH$instanceCount = PathElement.groupElement(4);
    public static final PathElement PATH$geometryCount = PathElement.groupElement(5);
    public static final PathElement PATH$pGeometries = PathElement.groupElement(6);

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final OfInt LAYOUT$flags = (OfInt) LAYOUT.select(PATH$flags);
    public static final OfInt LAYOUT$instanceCount = (OfInt) LAYOUT.select(PATH$instanceCount);
    public static final OfInt LAYOUT$geometryCount = (OfInt) LAYOUT.select(PATH$geometryCount);
    public static final AddressLayout LAYOUT$pGeometries = (AddressLayout) LAYOUT.select(PATH$pGeometries);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$instanceCount = LAYOUT.byteOffset(PATH$instanceCount);
    public static final long OFFSET$geometryCount = LAYOUT.byteOffset(PATH$geometryCount);
    public static final long OFFSET$pGeometries = LAYOUT.byteOffset(PATH$pGeometries);

    public VkAccelerationStructureInfoNV(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_INFO_NV);
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

    public @enumtype(VkAccelerationStructureTypeKHR.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public void type(@enumtype(VkAccelerationStructureTypeKHR.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
    }

    public @enumtype(VkBuildAccelerationStructureFlagsKHR.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public void flags(@enumtype(VkBuildAccelerationStructureFlagsKHR.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
    }

    public @unsigned int instanceCount() {
        return segment.get(LAYOUT$instanceCount, OFFSET$instanceCount);
    }

    public void instanceCount(@unsigned int value) {
        segment.set(LAYOUT$instanceCount, OFFSET$instanceCount, value);
    }

    public @unsigned int geometryCount() {
        return segment.get(LAYOUT$geometryCount, OFFSET$geometryCount);
    }

    public void geometryCount(@unsigned int value) {
        segment.set(LAYOUT$geometryCount, OFFSET$geometryCount, value);
    }

    public @pointer(comment="VkGeometryNV*") MemorySegment pGeometriesRaw() {
        return segment.get(LAYOUT$pGeometries, OFFSET$pGeometries);
    }

    public void pGeometriesRaw(@pointer(comment="VkGeometryNV*") MemorySegment value) {
        segment.set(LAYOUT$pGeometries, OFFSET$pGeometries, value);
    }
    
    public VkGeometryNV pGeometries() {
        MemorySegment s = pGeometriesRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkGeometryNV(s);
    }

    public void pGeometries(VkGeometryNV value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pGeometriesRaw(s);
    }


    public static final class VkAccelerationStructureInfoNVFactory implements IDataTypeFactory<VkAccelerationStructureInfoNV> {
        @Override
        public Class<VkAccelerationStructureInfoNV> clazz() {
            return VkAccelerationStructureInfoNV.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkAccelerationStructureInfoNV.LAYOUT;
        }

        @Override
        public VkAccelerationStructureInfoNV create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkAccelerationStructureInfoNV createUninit(MemorySegment segment) {
            return new VkAccelerationStructureInfoNV(segment);
        }
    }

    public static final VkAccelerationStructureInfoNVFactory FACTORY = new VkAccelerationStructureInfoNVFactory();
}