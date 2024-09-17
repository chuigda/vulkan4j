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

public record VkPipelineFragmentShadingRateEnumStateCreateInfoNV(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("shadingRateType"),
        ValueLayout.JAVA_INT.withName("shadingRate"),
        MemoryLayout.sequenceLayout(2, ValueLayout.JAVA_INT).withName("combinerOps")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$shadingRateType = PathElement.groupElement("shadingRateType");
    public static final PathElement PATH$shadingRate = PathElement.groupElement("shadingRate");
    public static final PathElement PATH$combinerOps = PathElement.groupElement("combinerOps");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$shadingRateType = (OfInt) LAYOUT.select(PATH$shadingRateType);
    public static final OfInt LAYOUT$shadingRate = (OfInt) LAYOUT.select(PATH$shadingRate);
    public static final SequenceLayout LAYOUT$combinerOps = (SequenceLayout) LAYOUT.select(PATH$combinerOps);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$shadingRateType = LAYOUT.byteOffset(PATH$shadingRateType);
    public static final long OFFSET$shadingRate = LAYOUT.byteOffset(PATH$shadingRate);
    public static final long OFFSET$combinerOps = LAYOUT.byteOffset(PATH$combinerOps);

    public VkPipelineFragmentShadingRateEnumStateCreateInfoNV(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PIPELINE_FRAGMENT_SHADING_RATE_ENUM_STATE_CREATE_INFO_NV);
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

    public @enumtype(VkFragmentShadingRateTypeNV.class) int shadingRateType() {
        return segment.get(LAYOUT$shadingRateType, OFFSET$shadingRateType);
    }

    public void shadingRateType(@enumtype(VkFragmentShadingRateTypeNV.class) int value) {
        segment.set(LAYOUT$shadingRateType, OFFSET$shadingRateType, value);
    }

    public @enumtype(VkFragmentShadingRateNV.class) int shadingRate() {
        return segment.get(LAYOUT$shadingRate, OFFSET$shadingRate);
    }

    public void shadingRate(@enumtype(VkFragmentShadingRateNV.class) int value) {
        segment.set(LAYOUT$shadingRate, OFFSET$shadingRate, value);
    }

    public MemorySegment combinerOpsRaw() {
        return segment.asSlice(OFFSET$combinerOps, LAYOUT$combinerOps.byteSize());
    }

    public IntArray combinerOps() {
        return new IntArray(combinerOpsRaw(), LAYOUT$combinerOps.elementCount());
    }

    public void combinerOps(IntArray value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$combinerOps, LAYOUT$combinerOps.byteSize());
    }


    public static final class VkPipelineFragmentShadingRateEnumStateCreateInfoNVFactory implements IDataTypeFactory<VkPipelineFragmentShadingRateEnumStateCreateInfoNV> {
        @Override
        public Class<VkPipelineFragmentShadingRateEnumStateCreateInfoNV> clazz() {
            return VkPipelineFragmentShadingRateEnumStateCreateInfoNV.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkPipelineFragmentShadingRateEnumStateCreateInfoNV.LAYOUT;
        }

        @Override
        public VkPipelineFragmentShadingRateEnumStateCreateInfoNV create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkPipelineFragmentShadingRateEnumStateCreateInfoNV createUninit(MemorySegment segment) {
            return new VkPipelineFragmentShadingRateEnumStateCreateInfoNV(segment);
        }
    }

    public static final VkPipelineFragmentShadingRateEnumStateCreateInfoNVFactory FACTORY = new VkPipelineFragmentShadingRateEnumStateCreateInfoNVFactory();
}
