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

public record VkPipelineViewportCoarseSampleOrderStateCreateInfoNV(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("sampleOrderType"),
        ValueLayout.JAVA_INT.withName("customSampleOrderCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkCoarseSampleOrderCustomNV.LAYOUT).withName("pCustomSampleOrders")
    );

    public static final PathElement PATH$sType = PathElement.groupElement(0);
    public static final PathElement PATH$pNext = PathElement.groupElement(1);
    public static final PathElement PATH$sampleOrderType = PathElement.groupElement(2);
    public static final PathElement PATH$customSampleOrderCount = PathElement.groupElement(3);
    public static final PathElement PATH$pCustomSampleOrders = PathElement.groupElement(4);

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$sampleOrderType = (OfInt) LAYOUT.select(PATH$sampleOrderType);
    public static final OfInt LAYOUT$customSampleOrderCount = (OfInt) LAYOUT.select(PATH$customSampleOrderCount);
    public static final AddressLayout LAYOUT$pCustomSampleOrders = (AddressLayout) LAYOUT.select(PATH$pCustomSampleOrders);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$sampleOrderType = LAYOUT.byteOffset(PATH$sampleOrderType);
    public static final long OFFSET$customSampleOrderCount = LAYOUT.byteOffset(PATH$customSampleOrderCount);
    public static final long OFFSET$pCustomSampleOrders = LAYOUT.byteOffset(PATH$pCustomSampleOrders);

    public VkPipelineViewportCoarseSampleOrderStateCreateInfoNV(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PIPELINE_VIEWPORT_COARSE_SAMPLE_ORDER_STATE_CREATE_INFO_NV);
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

    public @enumtype(VkCoarseSampleOrderTypeNV.class) int sampleOrderType() {
        return segment.get(LAYOUT$sampleOrderType, OFFSET$sampleOrderType);
    }

    public void sampleOrderType(@enumtype(VkCoarseSampleOrderTypeNV.class) int value) {
        segment.set(LAYOUT$sampleOrderType, OFFSET$sampleOrderType, value);
    }

    public @unsigned int customSampleOrderCount() {
        return segment.get(LAYOUT$customSampleOrderCount, OFFSET$customSampleOrderCount);
    }

    public void customSampleOrderCount(@unsigned int value) {
        segment.set(LAYOUT$customSampleOrderCount, OFFSET$customSampleOrderCount, value);
    }

    public @pointer(comment="VkCoarseSampleOrderCustomNV*") MemorySegment pCustomSampleOrdersRaw() {
        return segment.get(LAYOUT$pCustomSampleOrders, OFFSET$pCustomSampleOrders);
    }

    public void pCustomSampleOrdersRaw(@pointer(comment="VkCoarseSampleOrderCustomNV*") MemorySegment value) {
        segment.set(LAYOUT$pCustomSampleOrders, OFFSET$pCustomSampleOrders, value);
    }
    
    public VkCoarseSampleOrderCustomNV pCustomSampleOrders() {
        MemorySegment s = pCustomSampleOrdersRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkCoarseSampleOrderCustomNV(s);
    }

    public void pCustomSampleOrders(VkCoarseSampleOrderCustomNV value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pCustomSampleOrdersRaw(s);
    }


    public static final class VkPipelineViewportCoarseSampleOrderStateCreateInfoNVFactory implements IDataTypeFactory<VkPipelineViewportCoarseSampleOrderStateCreateInfoNV> {
        @Override
        public Class<VkPipelineViewportCoarseSampleOrderStateCreateInfoNV> clazz() {
            return VkPipelineViewportCoarseSampleOrderStateCreateInfoNV.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkPipelineViewportCoarseSampleOrderStateCreateInfoNV.LAYOUT;
        }

        @Override
        public VkPipelineViewportCoarseSampleOrderStateCreateInfoNV create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkPipelineViewportCoarseSampleOrderStateCreateInfoNV createUninit(MemorySegment segment) {
            return new VkPipelineViewportCoarseSampleOrderStateCreateInfoNV(segment);
        }
    }

    public static final VkPipelineViewportCoarseSampleOrderStateCreateInfoNVFactory FACTORY = new VkPipelineViewportCoarseSampleOrderStateCreateInfoNVFactory();
}
