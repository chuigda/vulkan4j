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

public record VkPerformanceMarkerInfoINTEL(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("marker")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$marker = PathElement.groupElement("marker");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfLong LAYOUT$marker = (OfLong) LAYOUT.select(PATH$marker);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$marker = LAYOUT.byteOffset(PATH$marker);

    public VkPerformanceMarkerInfoINTEL(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PERFORMANCE_MARKER_INFO_INTEL);
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

    public @unsigned long marker() {
        return segment.get(LAYOUT$marker, OFFSET$marker);
    }

    public void marker(@unsigned long value) {
        segment.set(LAYOUT$marker, OFFSET$marker, value);
    }


    public static final class VkPerformanceMarkerInfoINTELFactory implements IFactory<VkPerformanceMarkerInfoINTEL> {
        @Override
        public Class<VkPerformanceMarkerInfoINTEL> clazz() {
            return VkPerformanceMarkerInfoINTEL.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkPerformanceMarkerInfoINTEL.LAYOUT;
        }

        @Override
        public VkPerformanceMarkerInfoINTEL create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkPerformanceMarkerInfoINTEL createUninit(MemorySegment segment) {
            return new VkPerformanceMarkerInfoINTEL(segment);
        }
    }

    public static final VkPerformanceMarkerInfoINTELFactory FACTORY = new VkPerformanceMarkerInfoINTELFactory();
}