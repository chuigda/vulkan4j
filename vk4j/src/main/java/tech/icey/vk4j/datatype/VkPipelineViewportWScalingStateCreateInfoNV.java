package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.annotation.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.NativeLayout;
import tech.icey.vk4j.IFactory;

import static tech.icey.vk4j.enumtype.VkStructureType.*;

public record VkPipelineViewportWScalingStateCreateInfoNV(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("viewportWScalingEnable"),
        ValueLayout.JAVA_INT.withName("viewportCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkViewportWScalingNV.LAYOUT).withName("pViewportWScalings")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$viewportWScalingEnable = PathElement.groupElement("viewportWScalingEnable");
    public static final PathElement PATH$viewportCount = PathElement.groupElement("viewportCount");
    public static final PathElement PATH$pViewportWScalings = PathElement.groupElement("pViewportWScalings");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$viewportWScalingEnable = (OfInt) LAYOUT.select(PATH$viewportWScalingEnable);
    public static final OfInt LAYOUT$viewportCount = (OfInt) LAYOUT.select(PATH$viewportCount);
    public static final AddressLayout LAYOUT$pViewportWScalings = (AddressLayout) LAYOUT.select(PATH$pViewportWScalings);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$viewportWScalingEnable = LAYOUT.byteOffset(PATH$viewportWScalingEnable);
    public static final long OFFSET$viewportCount = LAYOUT.byteOffset(PATH$viewportCount);
    public static final long OFFSET$pViewportWScalings = LAYOUT.byteOffset(PATH$pViewportWScalings);

    public VkPipelineViewportWScalingStateCreateInfoNV(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PIPELINE_VIEWPORT_W_SCALING_STATE_CREATE_INFO_NV);
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

    public @unsigned int viewportWScalingEnable() {
        return segment.get(LAYOUT$viewportWScalingEnable, OFFSET$viewportWScalingEnable);
    }

    public void viewportWScalingEnable(@unsigned int value) {
        segment.set(LAYOUT$viewportWScalingEnable, OFFSET$viewportWScalingEnable, value);
    }

    public @unsigned int viewportCount() {
        return segment.get(LAYOUT$viewportCount, OFFSET$viewportCount);
    }

    public void viewportCount(@unsigned int value) {
        segment.set(LAYOUT$viewportCount, OFFSET$viewportCount, value);
    }

    public @pointer(comment="VkViewportWScalingNV*") MemorySegment pViewportWScalingsRaw() {
        return segment.get(LAYOUT$pViewportWScalings, OFFSET$pViewportWScalings);
    }

    public void pViewportWScalingsRaw(@pointer(comment="VkViewportWScalingNV*") MemorySegment value) {
        segment.set(LAYOUT$pViewportWScalings, OFFSET$pViewportWScalings, value);
    }

    public @nullable VkViewportWScalingNV pViewportWScalings() {
        MemorySegment s = pViewportWScalingsRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkViewportWScalingNV(s);
    }

    public void pViewportWScalings(@nullable VkViewportWScalingNV value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pViewportWScalingsRaw(s);
    }


    public static final class Factory implements IFactory<VkPipelineViewportWScalingStateCreateInfoNV> {
        @Override
        public Class<VkPipelineViewportWScalingStateCreateInfoNV> clazz() {
            return VkPipelineViewportWScalingStateCreateInfoNV.class;
        }

        @Override
        public MemoryLayout layout() {
            return VkPipelineViewportWScalingStateCreateInfoNV.LAYOUT;
        }

        @Override
        public VkPipelineViewportWScalingStateCreateInfoNV create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkPipelineViewportWScalingStateCreateInfoNV createUninit(MemorySegment segment) {
            return new VkPipelineViewportWScalingStateCreateInfoNV(segment);
        }
    }

    public static final Factory FACTORY = new Factory();
}
