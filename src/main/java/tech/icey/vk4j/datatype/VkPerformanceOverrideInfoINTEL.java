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

public record VkPerformanceOverrideInfoINTEL(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.JAVA_INT.withName("enable"),
        ValueLayout.JAVA_LONG.withName("parameter")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$enable = PathElement.groupElement("enable");
    public static final PathElement PATH$parameter = PathElement.groupElement("parameter");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final OfInt LAYOUT$enable = (OfInt) LAYOUT.select(PATH$enable);
    public static final OfLong LAYOUT$parameter = (OfLong) LAYOUT.select(PATH$parameter);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$enable = LAYOUT.byteOffset(PATH$enable);
    public static final long OFFSET$parameter = LAYOUT.byteOffset(PATH$parameter);

    public VkPerformanceOverrideInfoINTEL(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PERFORMANCE_OVERRIDE_INFO_INTEL);
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

    public @enumtype(VkPerformanceOverrideTypeINTEL.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public void type(@enumtype(VkPerformanceOverrideTypeINTEL.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
    }

    public @unsigned int enable() {
        return segment.get(LAYOUT$enable, OFFSET$enable);
    }

    public void enable(@unsigned int value) {
        segment.set(LAYOUT$enable, OFFSET$enable, value);
    }

    public @unsigned long parameter() {
        return segment.get(LAYOUT$parameter, OFFSET$parameter);
    }

    public void parameter(@unsigned long value) {
        segment.set(LAYOUT$parameter, OFFSET$parameter, value);
    }


    public static final class VkPerformanceOverrideInfoINTELFactory implements IDataTypeFactory<VkPerformanceOverrideInfoINTEL> {
        @Override
        public Class<VkPerformanceOverrideInfoINTEL> clazz() {
            return VkPerformanceOverrideInfoINTEL.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkPerformanceOverrideInfoINTEL.LAYOUT;
        }

        @Override
        public VkPerformanceOverrideInfoINTEL create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkPerformanceOverrideInfoINTEL createUninit(MemorySegment segment) {
            return new VkPerformanceOverrideInfoINTEL(segment);
        }
    }

    public static final VkPerformanceOverrideInfoINTELFactory FACTORY = new VkPerformanceOverrideInfoINTELFactory();
}
