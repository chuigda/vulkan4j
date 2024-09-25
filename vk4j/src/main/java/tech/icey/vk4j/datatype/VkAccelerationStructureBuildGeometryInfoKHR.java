package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.annotation.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.buffer.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import tech.icey.vk4j.NativeLayout;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

public record VkAccelerationStructureBuildGeometryInfoKHR(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("mode"),
        ValueLayout.ADDRESS.withName("srcAccelerationStructure"),
        ValueLayout.ADDRESS.withName("dstAccelerationStructure"),
        ValueLayout.JAVA_INT.withName("geometryCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkAccelerationStructureGeometryKHR.LAYOUT).withName("pGeometries"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS.withTargetLayout(VkAccelerationStructureGeometryKHR.LAYOUT)).withName("ppGeometries"),
        VkDeviceOrHostAddressKHR.LAYOUT.withName("scratchData")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$flags = PathElement.groupElement("flags");
    public static final PathElement PATH$mode = PathElement.groupElement("mode");
    public static final PathElement PATH$srcAccelerationStructure = PathElement.groupElement("srcAccelerationStructure");
    public static final PathElement PATH$dstAccelerationStructure = PathElement.groupElement("dstAccelerationStructure");
    public static final PathElement PATH$geometryCount = PathElement.groupElement("geometryCount");
    public static final PathElement PATH$pGeometries = PathElement.groupElement("pGeometries");
    public static final PathElement PATH$ppGeometries = PathElement.groupElement("ppGeometries");
    public static final PathElement PATH$scratchData = PathElement.groupElement("scratchData");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final OfInt LAYOUT$flags = (OfInt) LAYOUT.select(PATH$flags);
    public static final OfInt LAYOUT$mode = (OfInt) LAYOUT.select(PATH$mode);
    public static final AddressLayout LAYOUT$srcAccelerationStructure = (AddressLayout) LAYOUT.select(PATH$srcAccelerationStructure);
    public static final AddressLayout LAYOUT$dstAccelerationStructure = (AddressLayout) LAYOUT.select(PATH$dstAccelerationStructure);
    public static final OfInt LAYOUT$geometryCount = (OfInt) LAYOUT.select(PATH$geometryCount);
    public static final AddressLayout LAYOUT$pGeometries = (AddressLayout) LAYOUT.select(PATH$pGeometries);
    public static final AddressLayout LAYOUT$ppGeometries = (AddressLayout) LAYOUT.select(PATH$ppGeometries);
    public static final UnionLayout LAYOUT$scratchData = (UnionLayout) LAYOUT.select(PATH$scratchData);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$mode = LAYOUT.byteOffset(PATH$mode);
    public static final long OFFSET$srcAccelerationStructure = LAYOUT.byteOffset(PATH$srcAccelerationStructure);
    public static final long OFFSET$dstAccelerationStructure = LAYOUT.byteOffset(PATH$dstAccelerationStructure);
    public static final long OFFSET$geometryCount = LAYOUT.byteOffset(PATH$geometryCount);
    public static final long OFFSET$pGeometries = LAYOUT.byteOffset(PATH$pGeometries);
    public static final long OFFSET$ppGeometries = LAYOUT.byteOffset(PATH$ppGeometries);
    public static final long OFFSET$scratchData = LAYOUT.byteOffset(PATH$scratchData);

    public VkAccelerationStructureBuildGeometryInfoKHR(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_BUILD_GEOMETRY_INFO_KHR);
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

    public @enumtype(VkBuildAccelerationStructureModeKHR.class) int mode() {
        return segment.get(LAYOUT$mode, OFFSET$mode);
    }

    public void mode(@enumtype(VkBuildAccelerationStructureModeKHR.class) int value) {
        segment.set(LAYOUT$mode, OFFSET$mode, value);
    }

    public VkAccelerationStructureKHR srcAccelerationStructure() {
        return new VkAccelerationStructureKHR(segment.asSlice(OFFSET$srcAccelerationStructure, LAYOUT$srcAccelerationStructure));
    }

    public void srcAccelerationStructure(VkAccelerationStructureKHR value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$srcAccelerationStructure, LAYOUT$srcAccelerationStructure.byteSize());
    }

    public VkAccelerationStructureKHR dstAccelerationStructure() {
        return new VkAccelerationStructureKHR(segment.asSlice(OFFSET$dstAccelerationStructure, LAYOUT$dstAccelerationStructure));
    }

    public void dstAccelerationStructure(VkAccelerationStructureKHR value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$dstAccelerationStructure, LAYOUT$dstAccelerationStructure.byteSize());
    }

    public @unsigned int geometryCount() {
        return segment.get(LAYOUT$geometryCount, OFFSET$geometryCount);
    }

    public void geometryCount(@unsigned int value) {
        segment.set(LAYOUT$geometryCount, OFFSET$geometryCount, value);
    }

    public @pointer(comment="VkAccelerationStructureGeometryKHR*") MemorySegment pGeometriesRaw() {
        return segment.get(LAYOUT$pGeometries, OFFSET$pGeometries);
    }

    public void pGeometriesRaw(@pointer(comment="VkAccelerationStructureGeometryKHR*") MemorySegment value) {
        segment.set(LAYOUT$pGeometries, OFFSET$pGeometries, value);
    }
    
    public @nullable VkAccelerationStructureGeometryKHR pGeometries() {
        MemorySegment s = pGeometriesRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkAccelerationStructureGeometryKHR(s);
    }

    public void pGeometries(@nullable VkAccelerationStructureGeometryKHR value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pGeometriesRaw(s);
    }

    public @pointer(comment="void**") MemorySegment ppGeometries() {
        return segment.get(LAYOUT$ppGeometries, OFFSET$ppGeometries);
    }

    public void ppGeometries(@pointer(comment="void**") MemorySegment value) {
        segment.set(LAYOUT$ppGeometries, OFFSET$ppGeometries, value);
    }

    public VkDeviceOrHostAddressKHR scratchData() {
        return new VkDeviceOrHostAddressKHR(segment.asSlice(OFFSET$scratchData, LAYOUT$scratchData));
    }

    public void scratchData(VkDeviceOrHostAddressKHR value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$scratchData, LAYOUT$scratchData.byteSize());
    }

    public static VkAccelerationStructureBuildGeometryInfoKHR allocate(Arena arena) {
        return new VkAccelerationStructureBuildGeometryInfoKHR(arena.allocate(LAYOUT));
    }
    
    public static VkAccelerationStructureBuildGeometryInfoKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkAccelerationStructureBuildGeometryInfoKHR[] ret = new VkAccelerationStructureBuildGeometryInfoKHR[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkAccelerationStructureBuildGeometryInfoKHR(segment.asSlice(i * LAYOUT.byteSize(), LAYOUT.byteSize()));
        }
        return ret;
    }
}
