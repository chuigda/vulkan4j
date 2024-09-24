package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.annotation.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import tech.icey.vk4j.NativeLayout;
import tech.icey.vk4j.IFactory;

import static tech.icey.vk4j.enumtype.VkStructureType.*;

public record VkGraphicsPipelineShaderGroupsCreateInfoNV(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("groupCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkGraphicsShaderGroupCreateInfoNV.LAYOUT).withName("pGroups"),
        ValueLayout.JAVA_INT.withName("pipelineCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS).withName("pPipelines")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$groupCount = PathElement.groupElement("groupCount");
    public static final PathElement PATH$pGroups = PathElement.groupElement("pGroups");
    public static final PathElement PATH$pipelineCount = PathElement.groupElement("pipelineCount");
    public static final PathElement PATH$pPipelines = PathElement.groupElement("pPipelines");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$groupCount = (OfInt) LAYOUT.select(PATH$groupCount);
    public static final AddressLayout LAYOUT$pGroups = (AddressLayout) LAYOUT.select(PATH$pGroups);
    public static final OfInt LAYOUT$pipelineCount = (OfInt) LAYOUT.select(PATH$pipelineCount);
    public static final AddressLayout LAYOUT$pPipelines = (AddressLayout) LAYOUT.select(PATH$pPipelines);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$groupCount = LAYOUT.byteOffset(PATH$groupCount);
    public static final long OFFSET$pGroups = LAYOUT.byteOffset(PATH$pGroups);
    public static final long OFFSET$pipelineCount = LAYOUT.byteOffset(PATH$pipelineCount);
    public static final long OFFSET$pPipelines = LAYOUT.byteOffset(PATH$pPipelines);

    public VkGraphicsPipelineShaderGroupsCreateInfoNV(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_GRAPHICS_PIPELINE_SHADER_GROUPS_CREATE_INFO_NV);
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

    public @unsigned int groupCount() {
        return segment.get(LAYOUT$groupCount, OFFSET$groupCount);
    }

    public void groupCount(@unsigned int value) {
        segment.set(LAYOUT$groupCount, OFFSET$groupCount, value);
    }

    public @pointer(comment="VkGraphicsShaderGroupCreateInfoNV*") MemorySegment pGroupsRaw() {
        return segment.get(LAYOUT$pGroups, OFFSET$pGroups);
    }

    public void pGroupsRaw(@pointer(comment="VkGraphicsShaderGroupCreateInfoNV*") MemorySegment value) {
        segment.set(LAYOUT$pGroups, OFFSET$pGroups, value);
    }

    public @nullable VkGraphicsShaderGroupCreateInfoNV pGroups() {
        MemorySegment s = pGroupsRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkGraphicsShaderGroupCreateInfoNV(s);
    }

    public void pGroups(@nullable VkGraphicsShaderGroupCreateInfoNV value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pGroupsRaw(s);
    }

    public @unsigned int pipelineCount() {
        return segment.get(LAYOUT$pipelineCount, OFFSET$pipelineCount);
    }

    public void pipelineCount(@unsigned int value) {
        segment.set(LAYOUT$pipelineCount, OFFSET$pipelineCount, value);
    }

    public @pointer(comment="VkPipeline*") MemorySegment pPipelinesRaw() {
        return segment.get(LAYOUT$pPipelines, OFFSET$pPipelines);
    }

    public void pPipelinesRaw(@pointer(comment="VkPipeline*") MemorySegment value) {
        segment.set(LAYOUT$pPipelines, OFFSET$pPipelines, value);
    }

    public @nullable VkPipeline pPipelines() {
        MemorySegment s = pPipelinesRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkPipeline(s);
    }

    public void pPipelines(@nullable VkPipeline value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pPipelinesRaw(s);
    }


    public static final class Factory implements IFactory<VkGraphicsPipelineShaderGroupsCreateInfoNV> {
        @Override
        public Class<VkGraphicsPipelineShaderGroupsCreateInfoNV> clazz() {
            return VkGraphicsPipelineShaderGroupsCreateInfoNV.class;
        }

        @Override
        public MemoryLayout layout() {
            return VkGraphicsPipelineShaderGroupsCreateInfoNV.LAYOUT;
        }

        @Override
        public VkGraphicsPipelineShaderGroupsCreateInfoNV create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkGraphicsPipelineShaderGroupsCreateInfoNV createUninit(MemorySegment segment) {
            return new VkGraphicsPipelineShaderGroupsCreateInfoNV(segment);
        }
    }

    public static final Factory FACTORY = new Factory();
}
