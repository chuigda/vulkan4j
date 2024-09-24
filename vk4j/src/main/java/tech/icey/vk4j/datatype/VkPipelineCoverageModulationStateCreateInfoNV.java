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

public record VkPipelineCoverageModulationStateCreateInfoNV(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("coverageModulationMode"),
        ValueLayout.JAVA_INT.withName("coverageModulationTableEnable"),
        ValueLayout.JAVA_INT.withName("coverageModulationTableCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_FLOAT).withName("pCoverageModulationTable")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$flags = PathElement.groupElement("flags");
    public static final PathElement PATH$coverageModulationMode = PathElement.groupElement("coverageModulationMode");
    public static final PathElement PATH$coverageModulationTableEnable = PathElement.groupElement("coverageModulationTableEnable");
    public static final PathElement PATH$coverageModulationTableCount = PathElement.groupElement("coverageModulationTableCount");
    public static final PathElement PATH$pCoverageModulationTable = PathElement.groupElement("pCoverageModulationTable");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$flags = (OfInt) LAYOUT.select(PATH$flags);
    public static final OfInt LAYOUT$coverageModulationMode = (OfInt) LAYOUT.select(PATH$coverageModulationMode);
    public static final OfInt LAYOUT$coverageModulationTableEnable = (OfInt) LAYOUT.select(PATH$coverageModulationTableEnable);
    public static final OfInt LAYOUT$coverageModulationTableCount = (OfInt) LAYOUT.select(PATH$coverageModulationTableCount);
    public static final AddressLayout LAYOUT$pCoverageModulationTable = (AddressLayout) LAYOUT.select(PATH$pCoverageModulationTable);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$coverageModulationMode = LAYOUT.byteOffset(PATH$coverageModulationMode);
    public static final long OFFSET$coverageModulationTableEnable = LAYOUT.byteOffset(PATH$coverageModulationTableEnable);
    public static final long OFFSET$coverageModulationTableCount = LAYOUT.byteOffset(PATH$coverageModulationTableCount);
    public static final long OFFSET$pCoverageModulationTable = LAYOUT.byteOffset(PATH$pCoverageModulationTable);

    public VkPipelineCoverageModulationStateCreateInfoNV(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PIPELINE_COVERAGE_MODULATION_STATE_CREATE_INFO_NV);
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

    public @enumtype(VkPipelineCoverageModulationStateCreateFlagsNV.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public void flags(@enumtype(VkPipelineCoverageModulationStateCreateFlagsNV.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
    }

    public @enumtype(VkCoverageModulationModeNV.class) int coverageModulationMode() {
        return segment.get(LAYOUT$coverageModulationMode, OFFSET$coverageModulationMode);
    }

    public void coverageModulationMode(@enumtype(VkCoverageModulationModeNV.class) int value) {
        segment.set(LAYOUT$coverageModulationMode, OFFSET$coverageModulationMode, value);
    }

    public @unsigned int coverageModulationTableEnable() {
        return segment.get(LAYOUT$coverageModulationTableEnable, OFFSET$coverageModulationTableEnable);
    }

    public void coverageModulationTableEnable(@unsigned int value) {
        segment.set(LAYOUT$coverageModulationTableEnable, OFFSET$coverageModulationTableEnable, value);
    }

    public @unsigned int coverageModulationTableCount() {
        return segment.get(LAYOUT$coverageModulationTableCount, OFFSET$coverageModulationTableCount);
    }

    public void coverageModulationTableCount(@unsigned int value) {
        segment.set(LAYOUT$coverageModulationTableCount, OFFSET$coverageModulationTableCount, value);
    }

    public @pointer(comment="float*") MemorySegment pCoverageModulationTableRaw() {
        return segment.get(LAYOUT$pCoverageModulationTable, OFFSET$pCoverageModulationTable);
    }

    public void pCoverageModulationTableRaw(@pointer(comment="float*") MemorySegment value) {
        segment.set(LAYOUT$pCoverageModulationTable, OFFSET$pCoverageModulationTable, value);
    }
    
    public FloatPtr pCoverageModulationTable() {
        return new FloatPtr(pCoverageModulationTableRaw());
    }

    public void pCoverageModulationTable(FloatPtr value) {
        pCoverageModulationTableRaw(value.segment());
    }


    public static final class Factory implements IFactory<VkPipelineCoverageModulationStateCreateInfoNV> {
        @Override
        public Class<VkPipelineCoverageModulationStateCreateInfoNV> clazz() {
            return VkPipelineCoverageModulationStateCreateInfoNV.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkPipelineCoverageModulationStateCreateInfoNV.LAYOUT;
        }

        @Override
        public VkPipelineCoverageModulationStateCreateInfoNV create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkPipelineCoverageModulationStateCreateInfoNV createUninit(MemorySegment segment) {
            return new VkPipelineCoverageModulationStateCreateInfoNV(segment);
        }
    }

    public static final Factory FACTORY = new Factory();
}
