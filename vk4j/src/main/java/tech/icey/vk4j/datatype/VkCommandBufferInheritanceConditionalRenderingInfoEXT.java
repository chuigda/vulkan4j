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

public record VkCommandBufferInheritanceConditionalRenderingInfoEXT(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("conditionalRenderingEnable")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$conditionalRenderingEnable = PathElement.groupElement("conditionalRenderingEnable");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$conditionalRenderingEnable = (OfInt) LAYOUT.select(PATH$conditionalRenderingEnable);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$conditionalRenderingEnable = LAYOUT.byteOffset(PATH$conditionalRenderingEnable);

    public VkCommandBufferInheritanceConditionalRenderingInfoEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_COMMAND_BUFFER_INHERITANCE_CONDITIONAL_RENDERING_INFO_EXT);
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

    public @unsigned int conditionalRenderingEnable() {
        return segment.get(LAYOUT$conditionalRenderingEnable, OFFSET$conditionalRenderingEnable);
    }

    public void conditionalRenderingEnable(@unsigned int value) {
        segment.set(LAYOUT$conditionalRenderingEnable, OFFSET$conditionalRenderingEnable, value);
    }


    public static final class VkCommandBufferInheritanceConditionalRenderingInfoEXTFactory implements IFactory<VkCommandBufferInheritanceConditionalRenderingInfoEXT> {
        @Override
        public Class<VkCommandBufferInheritanceConditionalRenderingInfoEXT> clazz() {
            return VkCommandBufferInheritanceConditionalRenderingInfoEXT.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkCommandBufferInheritanceConditionalRenderingInfoEXT.LAYOUT;
        }

        @Override
        public VkCommandBufferInheritanceConditionalRenderingInfoEXT create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkCommandBufferInheritanceConditionalRenderingInfoEXT createUninit(MemorySegment segment) {
            return new VkCommandBufferInheritanceConditionalRenderingInfoEXT(segment);
        }
    }

    public static final VkCommandBufferInheritanceConditionalRenderingInfoEXTFactory FACTORY = new VkCommandBufferInheritanceConditionalRenderingInfoEXTFactory();
}
