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

public record VkRenderPassSubpassFeedbackCreateInfoEXT(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withTargetLayout(VkRenderPassSubpassFeedbackInfoEXT.LAYOUT).withName("pSubpassFeedback")
    );

    public static final PathElement PATH$sType = PathElement.groupElement(0);
    public static final PathElement PATH$pNext = PathElement.groupElement(1);
    public static final PathElement PATH$pSubpassFeedback = PathElement.groupElement(2);

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final AddressLayout LAYOUT$pSubpassFeedback = (AddressLayout) LAYOUT.select(PATH$pSubpassFeedback);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$pSubpassFeedback = LAYOUT.byteOffset(PATH$pSubpassFeedback);

    public VkRenderPassSubpassFeedbackCreateInfoEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_RENDER_PASS_SUBPASS_FEEDBACK_CREATE_INFO_EXT);
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

    public @pointer(comment="VkRenderPassSubpassFeedbackInfoEXT*") MemorySegment pSubpassFeedbackRaw() {
        return segment.get(LAYOUT$pSubpassFeedback, OFFSET$pSubpassFeedback);
    }

    public void pSubpassFeedbackRaw(@pointer(comment="VkRenderPassSubpassFeedbackInfoEXT*") MemorySegment value) {
        segment.set(LAYOUT$pSubpassFeedback, OFFSET$pSubpassFeedback, value);
    }
    
    public @nullable VkRenderPassSubpassFeedbackInfoEXT pSubpassFeedback() {
        MemorySegment s = pSubpassFeedbackRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkRenderPassSubpassFeedbackInfoEXT(s);
    }

    public void pSubpassFeedback(@nullable VkRenderPassSubpassFeedbackInfoEXT value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pSubpassFeedbackRaw(s);
    }


    public static final class VkRenderPassSubpassFeedbackCreateInfoEXTFactory implements IDataTypeFactory<VkRenderPassSubpassFeedbackCreateInfoEXT> {
        @Override
        public Class<VkRenderPassSubpassFeedbackCreateInfoEXT> clazz() {
            return VkRenderPassSubpassFeedbackCreateInfoEXT.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkRenderPassSubpassFeedbackCreateInfoEXT.LAYOUT;
        }

        @Override
        public VkRenderPassSubpassFeedbackCreateInfoEXT create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkRenderPassSubpassFeedbackCreateInfoEXT createUninit(MemorySegment segment) {
            return new VkRenderPassSubpassFeedbackCreateInfoEXT(segment);
        }
    }

    public static final VkRenderPassSubpassFeedbackCreateInfoEXTFactory FACTORY = new VkRenderPassSubpassFeedbackCreateInfoEXTFactory();
}
