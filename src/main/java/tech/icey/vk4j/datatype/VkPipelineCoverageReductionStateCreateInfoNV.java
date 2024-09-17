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

public record VkPipelineCoverageReductionStateCreateInfoNV(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("coverageReductionMode")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$flags = PathElement.groupElement("flags");
    public static final PathElement PATH$coverageReductionMode = PathElement.groupElement("coverageReductionMode");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$flags = (OfInt) LAYOUT.select(PATH$flags);
    public static final OfInt LAYOUT$coverageReductionMode = (OfInt) LAYOUT.select(PATH$coverageReductionMode);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$coverageReductionMode = LAYOUT.byteOffset(PATH$coverageReductionMode);

    public VkPipelineCoverageReductionStateCreateInfoNV(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PIPELINE_COVERAGE_REDUCTION_STATE_CREATE_INFO_NV);
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

    public @enumtype(VkPipelineCoverageReductionStateCreateFlagsNV.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public void flags(@enumtype(VkPipelineCoverageReductionStateCreateFlagsNV.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
    }

    public @enumtype(VkCoverageReductionModeNV.class) int coverageReductionMode() {
        return segment.get(LAYOUT$coverageReductionMode, OFFSET$coverageReductionMode);
    }

    public void coverageReductionMode(@enumtype(VkCoverageReductionModeNV.class) int value) {
        segment.set(LAYOUT$coverageReductionMode, OFFSET$coverageReductionMode, value);
    }


    public static final class VkPipelineCoverageReductionStateCreateInfoNVFactory implements IDataTypeFactory<VkPipelineCoverageReductionStateCreateInfoNV> {
        @Override
        public Class<VkPipelineCoverageReductionStateCreateInfoNV> clazz() {
            return VkPipelineCoverageReductionStateCreateInfoNV.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkPipelineCoverageReductionStateCreateInfoNV.LAYOUT;
        }

        @Override
        public VkPipelineCoverageReductionStateCreateInfoNV create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkPipelineCoverageReductionStateCreateInfoNV createUninit(MemorySegment segment) {
            return new VkPipelineCoverageReductionStateCreateInfoNV(segment);
        }
    }

    public static final VkPipelineCoverageReductionStateCreateInfoNVFactory FACTORY = new VkPipelineCoverageReductionStateCreateInfoNVFactory();
}
