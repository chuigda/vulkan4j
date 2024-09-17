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

public record VkPipelineRobustnessCreateInfoEXT(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("storageBuffers"),
        ValueLayout.JAVA_INT.withName("uniformBuffers"),
        ValueLayout.JAVA_INT.withName("vertexInputs"),
        ValueLayout.JAVA_INT.withName("images")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$storageBuffers = PathElement.groupElement("storageBuffers");
    public static final PathElement PATH$uniformBuffers = PathElement.groupElement("uniformBuffers");
    public static final PathElement PATH$vertexInputs = PathElement.groupElement("vertexInputs");
    public static final PathElement PATH$images = PathElement.groupElement("images");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$storageBuffers = (OfInt) LAYOUT.select(PATH$storageBuffers);
    public static final OfInt LAYOUT$uniformBuffers = (OfInt) LAYOUT.select(PATH$uniformBuffers);
    public static final OfInt LAYOUT$vertexInputs = (OfInt) LAYOUT.select(PATH$vertexInputs);
    public static final OfInt LAYOUT$images = (OfInt) LAYOUT.select(PATH$images);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$storageBuffers = LAYOUT.byteOffset(PATH$storageBuffers);
    public static final long OFFSET$uniformBuffers = LAYOUT.byteOffset(PATH$uniformBuffers);
    public static final long OFFSET$vertexInputs = LAYOUT.byteOffset(PATH$vertexInputs);
    public static final long OFFSET$images = LAYOUT.byteOffset(PATH$images);

    public VkPipelineRobustnessCreateInfoEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PIPELINE_ROBUSTNESS_CREATE_INFO_EXT);
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

    public @enumtype(VkPipelineRobustnessBufferBehaviorEXT.class) int storageBuffers() {
        return segment.get(LAYOUT$storageBuffers, OFFSET$storageBuffers);
    }

    public void storageBuffers(@enumtype(VkPipelineRobustnessBufferBehaviorEXT.class) int value) {
        segment.set(LAYOUT$storageBuffers, OFFSET$storageBuffers, value);
    }

    public @enumtype(VkPipelineRobustnessBufferBehaviorEXT.class) int uniformBuffers() {
        return segment.get(LAYOUT$uniformBuffers, OFFSET$uniformBuffers);
    }

    public void uniformBuffers(@enumtype(VkPipelineRobustnessBufferBehaviorEXT.class) int value) {
        segment.set(LAYOUT$uniformBuffers, OFFSET$uniformBuffers, value);
    }

    public @enumtype(VkPipelineRobustnessBufferBehaviorEXT.class) int vertexInputs() {
        return segment.get(LAYOUT$vertexInputs, OFFSET$vertexInputs);
    }

    public void vertexInputs(@enumtype(VkPipelineRobustnessBufferBehaviorEXT.class) int value) {
        segment.set(LAYOUT$vertexInputs, OFFSET$vertexInputs, value);
    }

    public @enumtype(VkPipelineRobustnessImageBehaviorEXT.class) int images() {
        return segment.get(LAYOUT$images, OFFSET$images);
    }

    public void images(@enumtype(VkPipelineRobustnessImageBehaviorEXT.class) int value) {
        segment.set(LAYOUT$images, OFFSET$images, value);
    }


    public static final class VkPipelineRobustnessCreateInfoEXTFactory implements IFactory<VkPipelineRobustnessCreateInfoEXT> {
        @Override
        public Class<VkPipelineRobustnessCreateInfoEXT> clazz() {
            return VkPipelineRobustnessCreateInfoEXT.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkPipelineRobustnessCreateInfoEXT.LAYOUT;
        }

        @Override
        public VkPipelineRobustnessCreateInfoEXT create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkPipelineRobustnessCreateInfoEXT createUninit(MemorySegment segment) {
            return new VkPipelineRobustnessCreateInfoEXT(segment);
        }
    }

    public static final VkPipelineRobustnessCreateInfoEXTFactory FACTORY = new VkPipelineRobustnessCreateInfoEXTFactory();
}
