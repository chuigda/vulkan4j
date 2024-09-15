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

public record VkCalibratedTimestampInfoKHR(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("timeDomain")
    );

    public static final PathElement PATH$sType = PathElement.groupElement(0);
    public static final PathElement PATH$pNext = PathElement.groupElement(1);
    public static final PathElement PATH$timeDomain = PathElement.groupElement(2);

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$timeDomain = (OfInt) LAYOUT.select(PATH$timeDomain);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$timeDomain = LAYOUT.byteOffset(PATH$timeDomain);

    public VkCalibratedTimestampInfoKHR(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_CALIBRATED_TIMESTAMP_INFO_KHR);
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

    public @enumtype(VkTimeDomainKHR.class) int timeDomain() {
        return segment.get(LAYOUT$timeDomain, OFFSET$timeDomain);
    }

    public void timeDomain(@enumtype(VkTimeDomainKHR.class) int value) {
        segment.set(LAYOUT$timeDomain, OFFSET$timeDomain, value);
    }


    public static final class VkCalibratedTimestampInfoKHRFactory implements IDataTypeFactory<VkCalibratedTimestampInfoKHR> {
        @Override
        public Class<VkCalibratedTimestampInfoKHR> clazz() {
            return VkCalibratedTimestampInfoKHR.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkCalibratedTimestampInfoKHR.LAYOUT;
        }

        @Override
        public VkCalibratedTimestampInfoKHR create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkCalibratedTimestampInfoKHR createUninit(MemorySegment segment) {
            return new VkCalibratedTimestampInfoKHR(segment);
        }
    }

    public static final VkCalibratedTimestampInfoKHRFactory FACTORY = new VkCalibratedTimestampInfoKHRFactory();
}
