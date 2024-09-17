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

public record VkRenderPassCreationFeedbackCreateInfoEXT(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withTargetLayout(VkRenderPassCreationFeedbackInfoEXT.LAYOUT).withName("pRenderPassFeedback")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$pRenderPassFeedback = PathElement.groupElement("pRenderPassFeedback");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final AddressLayout LAYOUT$pRenderPassFeedback = (AddressLayout) LAYOUT.select(PATH$pRenderPassFeedback);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$pRenderPassFeedback = LAYOUT.byteOffset(PATH$pRenderPassFeedback);

    public VkRenderPassCreationFeedbackCreateInfoEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_RENDER_PASS_CREATION_FEEDBACK_CREATE_INFO_EXT);
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

    public @pointer(comment="VkRenderPassCreationFeedbackInfoEXT*") MemorySegment pRenderPassFeedbackRaw() {
        return segment.get(LAYOUT$pRenderPassFeedback, OFFSET$pRenderPassFeedback);
    }

    public void pRenderPassFeedbackRaw(@pointer(comment="VkRenderPassCreationFeedbackInfoEXT*") MemorySegment value) {
        segment.set(LAYOUT$pRenderPassFeedback, OFFSET$pRenderPassFeedback, value);
    }
    
    public @nullable VkRenderPassCreationFeedbackInfoEXT pRenderPassFeedback() {
        MemorySegment s = pRenderPassFeedbackRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkRenderPassCreationFeedbackInfoEXT(s);
    }

    public void pRenderPassFeedback(@nullable VkRenderPassCreationFeedbackInfoEXT value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pRenderPassFeedbackRaw(s);
    }


    public static final class VkRenderPassCreationFeedbackCreateInfoEXTFactory implements IFactory<VkRenderPassCreationFeedbackCreateInfoEXT> {
        @Override
        public Class<VkRenderPassCreationFeedbackCreateInfoEXT> clazz() {
            return VkRenderPassCreationFeedbackCreateInfoEXT.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkRenderPassCreationFeedbackCreateInfoEXT.LAYOUT;
        }

        @Override
        public VkRenderPassCreationFeedbackCreateInfoEXT create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkRenderPassCreationFeedbackCreateInfoEXT createUninit(MemorySegment segment) {
            return new VkRenderPassCreationFeedbackCreateInfoEXT(segment);
        }
    }

    public static final VkRenderPassCreationFeedbackCreateInfoEXTFactory FACTORY = new VkRenderPassCreationFeedbackCreateInfoEXTFactory();
}
