package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.annotation.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.NativeLayout;
import tech.icey.vk4j.IFactory;

import static tech.icey.vk4j.enumtype.VkStructureType.*;

public record VkPipelineRasterizationStateRasterizationOrderAMD(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("rasterizationOrder")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$rasterizationOrder = PathElement.groupElement("rasterizationOrder");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$rasterizationOrder = (OfInt) LAYOUT.select(PATH$rasterizationOrder);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$rasterizationOrder = LAYOUT.byteOffset(PATH$rasterizationOrder);

    public VkPipelineRasterizationStateRasterizationOrderAMD(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PIPELINE_RASTERIZATION_STATE_RASTERIZATION_ORDER_AMD);
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

    public @enumtype(VkRasterizationOrderAMD.class) int rasterizationOrder() {
        return segment.get(LAYOUT$rasterizationOrder, OFFSET$rasterizationOrder);
    }

    public void rasterizationOrder(@enumtype(VkRasterizationOrderAMD.class) int value) {
        segment.set(LAYOUT$rasterizationOrder, OFFSET$rasterizationOrder, value);
    }


    public static final class Factory implements IFactory<VkPipelineRasterizationStateRasterizationOrderAMD> {
        @Override
        public Class<VkPipelineRasterizationStateRasterizationOrderAMD> clazz() {
            return VkPipelineRasterizationStateRasterizationOrderAMD.class;
        }

        @Override
        public MemoryLayout layout() {
            return VkPipelineRasterizationStateRasterizationOrderAMD.LAYOUT;
        }

        @Override
        public VkPipelineRasterizationStateRasterizationOrderAMD create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkPipelineRasterizationStateRasterizationOrderAMD createUninit(MemorySegment segment) {
            return new VkPipelineRasterizationStateRasterizationOrderAMD(segment);
        }
    }

    public static final Factory FACTORY = new Factory();
}
