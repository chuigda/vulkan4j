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

public record VkPipelineViewportDepthClipControlCreateInfoEXT(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("negativeOneToOne")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$negativeOneToOne = PathElement.groupElement("negativeOneToOne");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$negativeOneToOne = (OfInt) LAYOUT.select(PATH$negativeOneToOne);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$negativeOneToOne = LAYOUT.byteOffset(PATH$negativeOneToOne);

    public VkPipelineViewportDepthClipControlCreateInfoEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PIPELINE_VIEWPORT_DEPTH_CLIP_CONTROL_CREATE_INFO_EXT);
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

    public @unsigned int negativeOneToOne() {
        return segment.get(LAYOUT$negativeOneToOne, OFFSET$negativeOneToOne);
    }

    public void negativeOneToOne(@unsigned int value) {
        segment.set(LAYOUT$negativeOneToOne, OFFSET$negativeOneToOne, value);
    }


    public static final class VkPipelineViewportDepthClipControlCreateInfoEXTFactory implements IFactory<VkPipelineViewportDepthClipControlCreateInfoEXT> {
        @Override
        public Class<VkPipelineViewportDepthClipControlCreateInfoEXT> clazz() {
            return VkPipelineViewportDepthClipControlCreateInfoEXT.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkPipelineViewportDepthClipControlCreateInfoEXT.LAYOUT;
        }

        @Override
        public VkPipelineViewportDepthClipControlCreateInfoEXT create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkPipelineViewportDepthClipControlCreateInfoEXT createUninit(MemorySegment segment) {
            return new VkPipelineViewportDepthClipControlCreateInfoEXT(segment);
        }
    }

    public static final VkPipelineViewportDepthClipControlCreateInfoEXTFactory FACTORY = new VkPipelineViewportDepthClipControlCreateInfoEXTFactory();
}
