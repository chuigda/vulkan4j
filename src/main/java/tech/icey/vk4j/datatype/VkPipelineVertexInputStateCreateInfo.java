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

public record VkPipelineVertexInputStateCreateInfo(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("vertexBindingDescriptionCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkVertexInputBindingDescription.LAYOUT).withName("pVertexBindingDescriptions"),
        ValueLayout.JAVA_INT.withName("vertexAttributeDescriptionCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkVertexInputAttributeDescription.LAYOUT).withName("pVertexAttributeDescriptions")
    );

    public static final PathElement PATH$sType = PathElement.groupElement(0);
    public static final PathElement PATH$pNext = PathElement.groupElement(1);
    public static final PathElement PATH$flags = PathElement.groupElement(2);
    public static final PathElement PATH$vertexBindingDescriptionCount = PathElement.groupElement(3);
    public static final PathElement PATH$pVertexBindingDescriptions = PathElement.groupElement(4);
    public static final PathElement PATH$vertexAttributeDescriptionCount = PathElement.groupElement(5);
    public static final PathElement PATH$pVertexAttributeDescriptions = PathElement.groupElement(6);

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$flags = (OfInt) LAYOUT.select(PATH$flags);
    public static final OfInt LAYOUT$vertexBindingDescriptionCount = (OfInt) LAYOUT.select(PATH$vertexBindingDescriptionCount);
    public static final AddressLayout LAYOUT$pVertexBindingDescriptions = (AddressLayout) LAYOUT.select(PATH$pVertexBindingDescriptions);
    public static final OfInt LAYOUT$vertexAttributeDescriptionCount = (OfInt) LAYOUT.select(PATH$vertexAttributeDescriptionCount);
    public static final AddressLayout LAYOUT$pVertexAttributeDescriptions = (AddressLayout) LAYOUT.select(PATH$pVertexAttributeDescriptions);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$vertexBindingDescriptionCount = LAYOUT.byteOffset(PATH$vertexBindingDescriptionCount);
    public static final long OFFSET$pVertexBindingDescriptions = LAYOUT.byteOffset(PATH$pVertexBindingDescriptions);
    public static final long OFFSET$vertexAttributeDescriptionCount = LAYOUT.byteOffset(PATH$vertexAttributeDescriptionCount);
    public static final long OFFSET$pVertexAttributeDescriptions = LAYOUT.byteOffset(PATH$pVertexAttributeDescriptions);

    public VkPipelineVertexInputStateCreateInfo(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PIPELINE_VERTEX_INPUT_STATE_CREATE_INFO);
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

    public @enumtype(VkPipelineVertexInputStateCreateFlags.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public void flags(@enumtype(VkPipelineVertexInputStateCreateFlags.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
    }

    public @unsigned int vertexBindingDescriptionCount() {
        return segment.get(LAYOUT$vertexBindingDescriptionCount, OFFSET$vertexBindingDescriptionCount);
    }

    public void vertexBindingDescriptionCount(@unsigned int value) {
        segment.set(LAYOUT$vertexBindingDescriptionCount, OFFSET$vertexBindingDescriptionCount, value);
    }

    public @pointer(comment="VkVertexInputBindingDescription*") MemorySegment pVertexBindingDescriptionsRaw() {
        return segment.get(LAYOUT$pVertexBindingDescriptions, OFFSET$pVertexBindingDescriptions);
    }

    public void pVertexBindingDescriptionsRaw(@pointer(comment="VkVertexInputBindingDescription*") MemorySegment value) {
        segment.set(LAYOUT$pVertexBindingDescriptions, OFFSET$pVertexBindingDescriptions, value);
    }
    
    public VkVertexInputBindingDescription pVertexBindingDescriptions() {
        MemorySegment s = pVertexBindingDescriptionsRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkVertexInputBindingDescription(s);
    }

    public void pVertexBindingDescriptions(VkVertexInputBindingDescription value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pVertexBindingDescriptionsRaw(s);
    }

    public @unsigned int vertexAttributeDescriptionCount() {
        return segment.get(LAYOUT$vertexAttributeDescriptionCount, OFFSET$vertexAttributeDescriptionCount);
    }

    public void vertexAttributeDescriptionCount(@unsigned int value) {
        segment.set(LAYOUT$vertexAttributeDescriptionCount, OFFSET$vertexAttributeDescriptionCount, value);
    }

    public @pointer(comment="VkVertexInputAttributeDescription*") MemorySegment pVertexAttributeDescriptionsRaw() {
        return segment.get(LAYOUT$pVertexAttributeDescriptions, OFFSET$pVertexAttributeDescriptions);
    }

    public void pVertexAttributeDescriptionsRaw(@pointer(comment="VkVertexInputAttributeDescription*") MemorySegment value) {
        segment.set(LAYOUT$pVertexAttributeDescriptions, OFFSET$pVertexAttributeDescriptions, value);
    }
    
    public VkVertexInputAttributeDescription pVertexAttributeDescriptions() {
        MemorySegment s = pVertexAttributeDescriptionsRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkVertexInputAttributeDescription(s);
    }

    public void pVertexAttributeDescriptions(VkVertexInputAttributeDescription value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pVertexAttributeDescriptionsRaw(s);
    }


    public static final class VkPipelineVertexInputStateCreateInfoFactory implements IDataTypeFactory<VkPipelineVertexInputStateCreateInfo> {
        @Override
        public Class<VkPipelineVertexInputStateCreateInfo> clazz() {
            return VkPipelineVertexInputStateCreateInfo.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkPipelineVertexInputStateCreateInfo.LAYOUT;
        }

        @Override
        public VkPipelineVertexInputStateCreateInfo create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkPipelineVertexInputStateCreateInfo createUninit(MemorySegment segment) {
            return new VkPipelineVertexInputStateCreateInfo(segment);
        }
    }

    public static final VkPipelineVertexInputStateCreateInfoFactory FACTORY = new VkPipelineVertexInputStateCreateInfoFactory();
}