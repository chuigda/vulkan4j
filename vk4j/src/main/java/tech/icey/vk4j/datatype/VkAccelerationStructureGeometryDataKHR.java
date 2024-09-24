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

public record VkAccelerationStructureGeometryDataKHR(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.unionLayout(
        VkAccelerationStructureGeometryTrianglesDataKHR.LAYOUT.withName("triangles"),
        VkAccelerationStructureGeometryAabbsDataKHR.LAYOUT.withName("aabbs"),
        VkAccelerationStructureGeometryInstancesDataKHR.LAYOUT.withName("instances")
    );

    public static final PathElement PATH$triangles = PathElement.groupElement("triangles");
    public static final PathElement PATH$aabbs = PathElement.groupElement("aabbs");
    public static final PathElement PATH$instances = PathElement.groupElement("instances");

    public static final StructLayout LAYOUT$triangles = (StructLayout) LAYOUT.select(PATH$triangles);
    public static final StructLayout LAYOUT$aabbs = (StructLayout) LAYOUT.select(PATH$aabbs);
    public static final StructLayout LAYOUT$instances = (StructLayout) LAYOUT.select(PATH$instances);

    public static final long OFFSET$triangles = LAYOUT.byteOffset(PATH$triangles);
    public static final long OFFSET$aabbs = LAYOUT.byteOffset(PATH$aabbs);
    public static final long OFFSET$instances = LAYOUT.byteOffset(PATH$instances);

    public VkAccelerationStructureGeometryDataKHR(MemorySegment segment) {
        this.segment = segment;
    }

    public VkAccelerationStructureGeometryTrianglesDataKHR triangles() {
        return new VkAccelerationStructureGeometryTrianglesDataKHR(segment.asSlice(OFFSET$triangles, LAYOUT$triangles));
    }

    public void triangles(VkAccelerationStructureGeometryTrianglesDataKHR value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$triangles, LAYOUT$triangles.byteSize());
    }

    public VkAccelerationStructureGeometryAabbsDataKHR aabbs() {
        return new VkAccelerationStructureGeometryAabbsDataKHR(segment.asSlice(OFFSET$aabbs, LAYOUT$aabbs));
    }

    public void aabbs(VkAccelerationStructureGeometryAabbsDataKHR value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$aabbs, LAYOUT$aabbs.byteSize());
    }

    public VkAccelerationStructureGeometryInstancesDataKHR instances() {
        return new VkAccelerationStructureGeometryInstancesDataKHR(segment.asSlice(OFFSET$instances, LAYOUT$instances));
    }

    public void instances(VkAccelerationStructureGeometryInstancesDataKHR value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$instances, LAYOUT$instances.byteSize());
    }


    public static final class Factory implements IFactory<VkAccelerationStructureGeometryDataKHR> {
        @Override
        public Class<VkAccelerationStructureGeometryDataKHR> clazz() {
            return VkAccelerationStructureGeometryDataKHR.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkAccelerationStructureGeometryDataKHR.LAYOUT;
        }

        @Override
        public VkAccelerationStructureGeometryDataKHR create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkAccelerationStructureGeometryDataKHR createUninit(MemorySegment segment) {
            return new VkAccelerationStructureGeometryDataKHR(segment);
        }
    }

    public static final Factory FACTORY = new Factory();
}
