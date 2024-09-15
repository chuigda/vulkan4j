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

public record VkDrawMeshTasksIndirectCommandEXT(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("groupCountX"),
        ValueLayout.JAVA_INT.withName("groupCountY"),
        ValueLayout.JAVA_INT.withName("groupCountZ")
    );

    public static final PathElement PATH$groupCountX = PathElement.groupElement(0);
    public static final PathElement PATH$groupCountY = PathElement.groupElement(1);
    public static final PathElement PATH$groupCountZ = PathElement.groupElement(2);

    public static final OfInt LAYOUT$groupCountX = (OfInt) LAYOUT.select(PATH$groupCountX);
    public static final OfInt LAYOUT$groupCountY = (OfInt) LAYOUT.select(PATH$groupCountY);
    public static final OfInt LAYOUT$groupCountZ = (OfInt) LAYOUT.select(PATH$groupCountZ);

    public static final long OFFSET$groupCountX = LAYOUT.byteOffset(PATH$groupCountX);
    public static final long OFFSET$groupCountY = LAYOUT.byteOffset(PATH$groupCountY);
    public static final long OFFSET$groupCountZ = LAYOUT.byteOffset(PATH$groupCountZ);

    public VkDrawMeshTasksIndirectCommandEXT(MemorySegment segment) {
        this.segment = segment;
    }

    public @unsigned int groupCountX() {
        return segment.get(LAYOUT$groupCountX, OFFSET$groupCountX);
    }

    public void groupCountX(@unsigned int value) {
        segment.set(LAYOUT$groupCountX, OFFSET$groupCountX, value);
    }

    public @unsigned int groupCountY() {
        return segment.get(LAYOUT$groupCountY, OFFSET$groupCountY);
    }

    public void groupCountY(@unsigned int value) {
        segment.set(LAYOUT$groupCountY, OFFSET$groupCountY, value);
    }

    public @unsigned int groupCountZ() {
        return segment.get(LAYOUT$groupCountZ, OFFSET$groupCountZ);
    }

    public void groupCountZ(@unsigned int value) {
        segment.set(LAYOUT$groupCountZ, OFFSET$groupCountZ, value);
    }


    public static final class VkDrawMeshTasksIndirectCommandEXTFactory implements IDataTypeFactory<VkDrawMeshTasksIndirectCommandEXT> {
        @Override
        public Class<VkDrawMeshTasksIndirectCommandEXT> clazz() {
            return VkDrawMeshTasksIndirectCommandEXT.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkDrawMeshTasksIndirectCommandEXT.LAYOUT;
        }

        @Override
        public VkDrawMeshTasksIndirectCommandEXT create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkDrawMeshTasksIndirectCommandEXT createUninit(MemorySegment segment) {
            return new VkDrawMeshTasksIndirectCommandEXT(segment);
        }
    }

    public static final VkDrawMeshTasksIndirectCommandEXTFactory FACTORY = new VkDrawMeshTasksIndirectCommandEXTFactory();
}
