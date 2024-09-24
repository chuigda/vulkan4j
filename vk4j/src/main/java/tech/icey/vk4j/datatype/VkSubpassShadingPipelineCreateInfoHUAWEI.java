package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.annotation.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import tech.icey.vk4j.NativeLayout;
import tech.icey.vk4j.IFactory;

import static tech.icey.vk4j.enumtype.VkStructureType.*;

public record VkSubpassShadingPipelineCreateInfoHUAWEI(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("renderPass"),
        ValueLayout.JAVA_INT.withName("subpass")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$renderPass = PathElement.groupElement("renderPass");
    public static final PathElement PATH$subpass = PathElement.groupElement("subpass");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final AddressLayout LAYOUT$renderPass = (AddressLayout) LAYOUT.select(PATH$renderPass);
    public static final OfInt LAYOUT$subpass = (OfInt) LAYOUT.select(PATH$subpass);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$renderPass = LAYOUT.byteOffset(PATH$renderPass);
    public static final long OFFSET$subpass = LAYOUT.byteOffset(PATH$subpass);

    public VkSubpassShadingPipelineCreateInfoHUAWEI(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_SUBPASS_SHADING_PIPELINE_CREATE_INFO_HUAWEI);
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


    public static final class Factory implements IFactory<VkSubpassShadingPipelineCreateInfoHUAWEI> {
        @Override
        public Class<VkSubpassShadingPipelineCreateInfoHUAWEI> clazz() {
            return VkSubpassShadingPipelineCreateInfoHUAWEI.class;
        }

        @Override
        public MemoryLayout layout() {
            return VkSubpassShadingPipelineCreateInfoHUAWEI.LAYOUT;
        }

        @Override
        public VkSubpassShadingPipelineCreateInfoHUAWEI create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkSubpassShadingPipelineCreateInfoHUAWEI createUninit(MemorySegment segment) {
            return new VkSubpassShadingPipelineCreateInfoHUAWEI(segment);
        }
    }

    public static final Factory FACTORY = new Factory();
}
