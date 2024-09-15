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

public record VkDrawMeshTasksIndirectCommandNV(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("taskCount"),
        ValueLayout.JAVA_INT.withName("firstTask")
    );

    public static final PathElement PATH$taskCount = PathElement.groupElement(0);
    public static final PathElement PATH$firstTask = PathElement.groupElement(1);

    public static final OfInt LAYOUT$taskCount = (OfInt) LAYOUT.select(PATH$taskCount);
    public static final OfInt LAYOUT$firstTask = (OfInt) LAYOUT.select(PATH$firstTask);

    public static final long OFFSET$taskCount = LAYOUT.byteOffset(PATH$taskCount);
    public static final long OFFSET$firstTask = LAYOUT.byteOffset(PATH$firstTask);

    public VkDrawMeshTasksIndirectCommandNV(MemorySegment segment) {
        this.segment = segment;
    }

    public @unsigned int taskCount() {
        return segment.get(LAYOUT$taskCount, OFFSET$taskCount);
    }

    public void taskCount(@unsigned int value) {
        segment.set(LAYOUT$taskCount, OFFSET$taskCount, value);
    }

    public @unsigned int firstTask() {
        return segment.get(LAYOUT$firstTask, OFFSET$firstTask);
    }

    public void firstTask(@unsigned int value) {
        segment.set(LAYOUT$firstTask, OFFSET$firstTask, value);
    }


    public static final class VkDrawMeshTasksIndirectCommandNVFactory implements IDataTypeFactory<VkDrawMeshTasksIndirectCommandNV> {
        @Override
        public Class<VkDrawMeshTasksIndirectCommandNV> clazz() {
            return VkDrawMeshTasksIndirectCommandNV.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkDrawMeshTasksIndirectCommandNV.LAYOUT;
        }

        @Override
        public VkDrawMeshTasksIndirectCommandNV create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkDrawMeshTasksIndirectCommandNV createUninit(MemorySegment segment) {
            return new VkDrawMeshTasksIndirectCommandNV(segment);
        }
    }

    public static final VkDrawMeshTasksIndirectCommandNVFactory FACTORY = new VkDrawMeshTasksIndirectCommandNVFactory();
}
