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

public record VkPerformanceConfigurationAcquireInfoINTEL(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("type")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$type = PathElement.groupElement("type");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);

    public VkPerformanceConfigurationAcquireInfoINTEL(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PERFORMANCE_CONFIGURATION_ACQUIRE_INFO_INTEL);
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

    public @enumtype(VkPerformanceConfigurationTypeINTEL.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public void type(@enumtype(VkPerformanceConfigurationTypeINTEL.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
    }


    public static final class VkPerformanceConfigurationAcquireInfoINTELFactory implements IFactory<VkPerformanceConfigurationAcquireInfoINTEL> {
        @Override
        public Class<VkPerformanceConfigurationAcquireInfoINTEL> clazz() {
            return VkPerformanceConfigurationAcquireInfoINTEL.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkPerformanceConfigurationAcquireInfoINTEL.LAYOUT;
        }

        @Override
        public VkPerformanceConfigurationAcquireInfoINTEL create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkPerformanceConfigurationAcquireInfoINTEL createUninit(MemorySegment segment) {
            return new VkPerformanceConfigurationAcquireInfoINTEL(segment);
        }
    }

    public static final VkPerformanceConfigurationAcquireInfoINTELFactory FACTORY = new VkPerformanceConfigurationAcquireInfoINTELFactory();
}
