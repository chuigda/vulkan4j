package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.IPointer;
import tech.icey.vk4j.annotation.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.buffer.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import tech.icey.vk4j.NativeLayout;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

public record VkPhysicalDevicePipelineRobustnessPropertiesEXT(MemorySegment segment) implements IPointer {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("defaultRobustnessStorageBuffers"),
        ValueLayout.JAVA_INT.withName("defaultRobustnessUniformBuffers"),
        ValueLayout.JAVA_INT.withName("defaultRobustnessVertexInputs"),
        ValueLayout.JAVA_INT.withName("defaultRobustnessImages")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$defaultRobustnessStorageBuffers = PathElement.groupElement("defaultRobustnessStorageBuffers");
    public static final PathElement PATH$defaultRobustnessUniformBuffers = PathElement.groupElement("defaultRobustnessUniformBuffers");
    public static final PathElement PATH$defaultRobustnessVertexInputs = PathElement.groupElement("defaultRobustnessVertexInputs");
    public static final PathElement PATH$defaultRobustnessImages = PathElement.groupElement("defaultRobustnessImages");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$defaultRobustnessStorageBuffers = (OfInt) LAYOUT.select(PATH$defaultRobustnessStorageBuffers);
    public static final OfInt LAYOUT$defaultRobustnessUniformBuffers = (OfInt) LAYOUT.select(PATH$defaultRobustnessUniformBuffers);
    public static final OfInt LAYOUT$defaultRobustnessVertexInputs = (OfInt) LAYOUT.select(PATH$defaultRobustnessVertexInputs);
    public static final OfInt LAYOUT$defaultRobustnessImages = (OfInt) LAYOUT.select(PATH$defaultRobustnessImages);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$defaultRobustnessStorageBuffers = LAYOUT.byteOffset(PATH$defaultRobustnessStorageBuffers);
    public static final long OFFSET$defaultRobustnessUniformBuffers = LAYOUT.byteOffset(PATH$defaultRobustnessUniformBuffers);
    public static final long OFFSET$defaultRobustnessVertexInputs = LAYOUT.byteOffset(PATH$defaultRobustnessVertexInputs);
    public static final long OFFSET$defaultRobustnessImages = LAYOUT.byteOffset(PATH$defaultRobustnessImages);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$defaultRobustnessStorageBuffers = LAYOUT$defaultRobustnessStorageBuffers.byteSize();
    public static final long SIZE$defaultRobustnessUniformBuffers = LAYOUT$defaultRobustnessUniformBuffers.byteSize();
    public static final long SIZE$defaultRobustnessVertexInputs = LAYOUT$defaultRobustnessVertexInputs.byteSize();
    public static final long SIZE$defaultRobustnessImages = LAYOUT$defaultRobustnessImages.byteSize();

    public VkPhysicalDevicePipelineRobustnessPropertiesEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_ROBUSTNESS_PROPERTIES_EXT);
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

    public @enumtype(VkPipelineRobustnessBufferBehaviorEXT.class) int defaultRobustnessStorageBuffers() {
        return segment.get(LAYOUT$defaultRobustnessStorageBuffers, OFFSET$defaultRobustnessStorageBuffers);
    }

    public void defaultRobustnessStorageBuffers(@enumtype(VkPipelineRobustnessBufferBehaviorEXT.class) int value) {
        segment.set(LAYOUT$defaultRobustnessStorageBuffers, OFFSET$defaultRobustnessStorageBuffers, value);
    }

    public @enumtype(VkPipelineRobustnessBufferBehaviorEXT.class) int defaultRobustnessUniformBuffers() {
        return segment.get(LAYOUT$defaultRobustnessUniformBuffers, OFFSET$defaultRobustnessUniformBuffers);
    }

    public void defaultRobustnessUniformBuffers(@enumtype(VkPipelineRobustnessBufferBehaviorEXT.class) int value) {
        segment.set(LAYOUT$defaultRobustnessUniformBuffers, OFFSET$defaultRobustnessUniformBuffers, value);
    }

    public @enumtype(VkPipelineRobustnessBufferBehaviorEXT.class) int defaultRobustnessVertexInputs() {
        return segment.get(LAYOUT$defaultRobustnessVertexInputs, OFFSET$defaultRobustnessVertexInputs);
    }

    public void defaultRobustnessVertexInputs(@enumtype(VkPipelineRobustnessBufferBehaviorEXT.class) int value) {
        segment.set(LAYOUT$defaultRobustnessVertexInputs, OFFSET$defaultRobustnessVertexInputs, value);
    }

    public @enumtype(VkPipelineRobustnessImageBehaviorEXT.class) int defaultRobustnessImages() {
        return segment.get(LAYOUT$defaultRobustnessImages, OFFSET$defaultRobustnessImages);
    }

    public void defaultRobustnessImages(@enumtype(VkPipelineRobustnessImageBehaviorEXT.class) int value) {
        segment.set(LAYOUT$defaultRobustnessImages, OFFSET$defaultRobustnessImages, value);
    }

    public static VkPhysicalDevicePipelineRobustnessPropertiesEXT allocate(Arena arena) {
        return new VkPhysicalDevicePipelineRobustnessPropertiesEXT(arena.allocate(LAYOUT));
    }
    
    public static VkPhysicalDevicePipelineRobustnessPropertiesEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDevicePipelineRobustnessPropertiesEXT[] ret = new VkPhysicalDevicePipelineRobustnessPropertiesEXT[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkPhysicalDevicePipelineRobustnessPropertiesEXT(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
}
