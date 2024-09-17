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

public record VkShaderResourceUsageAMD(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("numUsedVgprs"),
        ValueLayout.JAVA_INT.withName("numUsedSgprs"),
        ValueLayout.JAVA_INT.withName("ldsSizePerLocalWorkGroup"),
        NativeLayout.C_SIZE_T.withName("ldsUsageSizeInBytes"),
        NativeLayout.C_SIZE_T.withName("scratchMemUsageInBytes")
    );

    public static final PathElement PATH$numUsedVgprs = PathElement.groupElement("numUsedVgprs");
    public static final PathElement PATH$numUsedSgprs = PathElement.groupElement("numUsedSgprs");
    public static final PathElement PATH$ldsSizePerLocalWorkGroup = PathElement.groupElement("ldsSizePerLocalWorkGroup");
    public static final PathElement PATH$ldsUsageSizeInBytes = PathElement.groupElement("ldsUsageSizeInBytes");
    public static final PathElement PATH$scratchMemUsageInBytes = PathElement.groupElement("scratchMemUsageInBytes");

    public static final OfInt LAYOUT$numUsedVgprs = (OfInt) LAYOUT.select(PATH$numUsedVgprs);
    public static final OfInt LAYOUT$numUsedSgprs = (OfInt) LAYOUT.select(PATH$numUsedSgprs);
    public static final OfInt LAYOUT$ldsSizePerLocalWorkGroup = (OfInt) LAYOUT.select(PATH$ldsSizePerLocalWorkGroup);

    public static final long OFFSET$numUsedVgprs = LAYOUT.byteOffset(PATH$numUsedVgprs);
    public static final long OFFSET$numUsedSgprs = LAYOUT.byteOffset(PATH$numUsedSgprs);
    public static final long OFFSET$ldsSizePerLocalWorkGroup = LAYOUT.byteOffset(PATH$ldsSizePerLocalWorkGroup);
    public static final long OFFSET$ldsUsageSizeInBytes = LAYOUT.byteOffset(PATH$ldsUsageSizeInBytes);
    public static final long OFFSET$scratchMemUsageInBytes = LAYOUT.byteOffset(PATH$scratchMemUsageInBytes);

    public VkShaderResourceUsageAMD(MemorySegment segment) {
        this.segment = segment;
    }

    public @unsigned int numUsedVgprs() {
        return segment.get(LAYOUT$numUsedVgprs, OFFSET$numUsedVgprs);
    }

    public void numUsedVgprs(@unsigned int value) {
        segment.set(LAYOUT$numUsedVgprs, OFFSET$numUsedVgprs, value);
    }

    public @unsigned int numUsedSgprs() {
        return segment.get(LAYOUT$numUsedSgprs, OFFSET$numUsedSgprs);
    }

    public void numUsedSgprs(@unsigned int value) {
        segment.set(LAYOUT$numUsedSgprs, OFFSET$numUsedSgprs, value);
    }

    public @unsigned int ldsSizePerLocalWorkGroup() {
        return segment.get(LAYOUT$ldsSizePerLocalWorkGroup, OFFSET$ldsSizePerLocalWorkGroup);
    }

    public void ldsSizePerLocalWorkGroup(@unsigned int value) {
        segment.set(LAYOUT$ldsSizePerLocalWorkGroup, OFFSET$ldsSizePerLocalWorkGroup, value);
    }

    public @unsigned long ldsUsageSizeInBytes() {
            return NativeLayout.readCSizeT(segment, OFFSET$ldsUsageSizeInBytes);
        }
    
        public void ldsUsageSizeInBytes(@unsigned long value) {
            NativeLayout.writeCSizeT(segment, OFFSET$ldsUsageSizeInBytes, value);
        }

    public @unsigned long scratchMemUsageInBytes() {
            return NativeLayout.readCSizeT(segment, OFFSET$scratchMemUsageInBytes);
        }
    
        public void scratchMemUsageInBytes(@unsigned long value) {
            NativeLayout.writeCSizeT(segment, OFFSET$scratchMemUsageInBytes, value);
        }


    public static final class VkShaderResourceUsageAMDFactory implements IDataTypeFactory<VkShaderResourceUsageAMD> {
        @Override
        public Class<VkShaderResourceUsageAMD> clazz() {
            return VkShaderResourceUsageAMD.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkShaderResourceUsageAMD.LAYOUT;
        }

        @Override
        public VkShaderResourceUsageAMD create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkShaderResourceUsageAMD createUninit(MemorySegment segment) {
            return new VkShaderResourceUsageAMD(segment);
        }
    }

    public static final VkShaderResourceUsageAMDFactory FACTORY = new VkShaderResourceUsageAMDFactory();
}
