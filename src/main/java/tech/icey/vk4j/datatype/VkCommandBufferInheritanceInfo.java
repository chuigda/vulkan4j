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

public record VkCommandBufferInheritanceInfo(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("renderPass"),
        ValueLayout.JAVA_INT.withName("subpass"),
        ValueLayout.ADDRESS.withName("framebuffer"),
        ValueLayout.JAVA_INT.withName("occlusionQueryEnable"),
        ValueLayout.JAVA_INT.withName("queryFlags"),
        ValueLayout.JAVA_INT.withName("pipelineStatistics")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$renderPass = PathElement.groupElement("renderPass");
    public static final PathElement PATH$subpass = PathElement.groupElement("subpass");
    public static final PathElement PATH$framebuffer = PathElement.groupElement("framebuffer");
    public static final PathElement PATH$occlusionQueryEnable = PathElement.groupElement("occlusionQueryEnable");
    public static final PathElement PATH$queryFlags = PathElement.groupElement("queryFlags");
    public static final PathElement PATH$pipelineStatistics = PathElement.groupElement("pipelineStatistics");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final AddressLayout LAYOUT$renderPass = (AddressLayout) LAYOUT.select(PATH$renderPass);
    public static final OfInt LAYOUT$subpass = (OfInt) LAYOUT.select(PATH$subpass);
    public static final AddressLayout LAYOUT$framebuffer = (AddressLayout) LAYOUT.select(PATH$framebuffer);
    public static final OfInt LAYOUT$occlusionQueryEnable = (OfInt) LAYOUT.select(PATH$occlusionQueryEnable);
    public static final OfInt LAYOUT$queryFlags = (OfInt) LAYOUT.select(PATH$queryFlags);
    public static final OfInt LAYOUT$pipelineStatistics = (OfInt) LAYOUT.select(PATH$pipelineStatistics);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$renderPass = LAYOUT.byteOffset(PATH$renderPass);
    public static final long OFFSET$subpass = LAYOUT.byteOffset(PATH$subpass);
    public static final long OFFSET$framebuffer = LAYOUT.byteOffset(PATH$framebuffer);
    public static final long OFFSET$occlusionQueryEnable = LAYOUT.byteOffset(PATH$occlusionQueryEnable);
    public static final long OFFSET$queryFlags = LAYOUT.byteOffset(PATH$queryFlags);
    public static final long OFFSET$pipelineStatistics = LAYOUT.byteOffset(PATH$pipelineStatistics);

    public VkCommandBufferInheritanceInfo(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_COMMAND_BUFFER_INHERITANCE_INFO);
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

    public VkRenderPass renderPass() {
        return new VkRenderPass(segment.asSlice(OFFSET$renderPass, LAYOUT$renderPass));
    }

    public void renderPass(VkRenderPass value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$renderPass, LAYOUT$renderPass.byteSize());
    }

    public @unsigned int subpass() {
        return segment.get(LAYOUT$subpass, OFFSET$subpass);
    }

    public void subpass(@unsigned int value) {
        segment.set(LAYOUT$subpass, OFFSET$subpass, value);
    }

    public VkFramebuffer framebuffer() {
        return new VkFramebuffer(segment.asSlice(OFFSET$framebuffer, LAYOUT$framebuffer));
    }

    public void framebuffer(VkFramebuffer value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$framebuffer, LAYOUT$framebuffer.byteSize());
    }

    public @unsigned int occlusionQueryEnable() {
        return segment.get(LAYOUT$occlusionQueryEnable, OFFSET$occlusionQueryEnable);
    }

    public void occlusionQueryEnable(@unsigned int value) {
        segment.set(LAYOUT$occlusionQueryEnable, OFFSET$occlusionQueryEnable, value);
    }

    public @enumtype(VkQueryControlFlags.class) int queryFlags() {
        return segment.get(LAYOUT$queryFlags, OFFSET$queryFlags);
    }

    public void queryFlags(@enumtype(VkQueryControlFlags.class) int value) {
        segment.set(LAYOUT$queryFlags, OFFSET$queryFlags, value);
    }

    public @enumtype(VkQueryPipelineStatisticFlags.class) int pipelineStatistics() {
        return segment.get(LAYOUT$pipelineStatistics, OFFSET$pipelineStatistics);
    }

    public void pipelineStatistics(@enumtype(VkQueryPipelineStatisticFlags.class) int value) {
        segment.set(LAYOUT$pipelineStatistics, OFFSET$pipelineStatistics, value);
    }


    public static final class VkCommandBufferInheritanceInfoFactory implements IDataTypeFactory<VkCommandBufferInheritanceInfo> {
        @Override
        public Class<VkCommandBufferInheritanceInfo> clazz() {
            return VkCommandBufferInheritanceInfo.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkCommandBufferInheritanceInfo.LAYOUT;
        }

        @Override
        public VkCommandBufferInheritanceInfo create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkCommandBufferInheritanceInfo createUninit(MemorySegment segment) {
            return new VkCommandBufferInheritanceInfo(segment);
        }
    }

    public static final VkCommandBufferInheritanceInfoFactory FACTORY = new VkCommandBufferInheritanceInfoFactory();
}
